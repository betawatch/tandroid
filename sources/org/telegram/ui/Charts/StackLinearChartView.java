package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.data.StackLinearChartData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.StackLinearViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

/* loaded from: classes4.dex */
public class StackLinearChartView extends BaseChartView {
    private float[] mapPoints;
    private Matrix matrix;
    Path ovalPath;
    boolean[] skipPoints;
    float[] startFromY;

    @Override // org.telegram.ui.Charts.BaseChartView
    public long findMaxValue(int i, int i2) {
        return 100L;
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    protected float getMinDistance() {
        return 0.1f;
    }

    public StackLinearChartView(Context context) {
        super(context);
        this.matrix = new Matrix();
        this.mapPoints = new float[2];
        this.ovalPath = new Path();
        this.superDraw = true;
        this.useAlphaSignature = true;
        this.drawPointOnSelection = false;
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    public StackLinearViewData createLineViewData(ChartData.Line line) {
        return new StackLinearViewData(line);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0260 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x043f A[ADDED_TO_REGION] */
    @Override // org.telegram.ui.Charts.BaseChartView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void drawChart(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float measuredHeight;
        float measuredHeight2;
        float f9;
        float f10;
        float f11;
        float f12;
        int i2;
        float f13;
        int i3;
        int i4;
        boolean z;
        float f14;
        double degrees;
        int quarterForPoint;
        int quarterForPoint2;
        float f15;
        float f16;
        int i5;
        float f17;
        float f18;
        float f19;
        float f20;
        double degrees2;
        float[] fArr;
        int i6;
        if (this.chartData != null) {
            float f21 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f22 = chartPickerDelegate.pickerEnd;
            float f23 = chartPickerDelegate.pickerStart;
            float f24 = f21 / (f22 - f23);
            float f25 = (f23 * f24) - BaseChartView.HORIZONTAL_PADDING;
            float centerX = this.chartArea.centerX();
            float centerY = this.chartArea.centerY() + AndroidUtilities.dp(16.0f);
            for (int i7 = 0; i7 < this.lines.size(); i7++) {
                ((StackLinearViewData) this.lines.get(i7)).chartPath.reset();
                ((StackLinearViewData) this.lines.get(i7)).chartPathPicker.reset();
            }
            canvas.save();
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < ((StackLinearChartData) this.chartData).lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
                this.startFromY = new float[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i8 = this.transitionMode;
            if (i8 == 2) {
                float f26 = this.transitionParams.progress / 0.6f;
                if (f26 > 1.0f) {
                    f26 = 1.0f;
                }
                this.ovalPath.reset();
                float width = this.chartArea.width() > this.chartArea.height() ? this.chartArea.width() : this.chartArea.height();
                float height = (this.chartArea.width() > this.chartArea.height() ? this.chartArea.height() : this.chartArea.width()) * 0.45f;
                float f27 = height + (((width - height) / 2.0f) * (1.0f - this.transitionParams.progress));
                RectF rectF = new RectF();
                f = 1.0f;
                f2 = 0.0f;
                rectF.set(centerX - f27, centerY - f27, centerX + f27, centerY + f27);
                this.ovalPath.addRoundRect(rectF, f27, f27, Path.Direction.CW);
                canvas.clipPath(this.ovalPath);
                f3 = f26;
                i = NotificationCenter.didReceiveSmsCode;
            } else {
                f = 1.0f;
                f2 = 0.0f;
                i = i8 == 3 ? (int) (this.transitionParams.progress * 255.0f) : NotificationCenter.didReceiveSmsCode;
                f3 = 0.0f;
            }
            float[] fArr2 = ((StackLinearChartData) this.chartData).xPercentage;
            int i9 = ((int) (BaseChartView.HORIZONTAL_PADDING / (fArr2.length < 2 ? 1.0f : fArr2[1] * f24))) + 1;
            int max = Math.max(0, (this.startXIndex - i9) - 1);
            int min = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i9 + 1);
            int i10 = max;
            float f28 = 0.0f;
            float f29 = 0.0f;
            boolean z2 = false;
            while (i10 <= min) {
                float f30 = f24;
                float f31 = f25;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                float f32 = 0.0f;
                while (i12 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i12);
                    float f33 = f3;
                    if (lineViewData.enabled || lineViewData.alpha != f2) {
                        i6 = i12;
                        long j = lineViewData.line.y[i10];
                        if (j > 0) {
                            f32 += j * lineViewData.alpha;
                            i13++;
                        }
                        i11 = i6;
                    } else {
                        i6 = i12;
                    }
                    i12 = i6 + 1;
                    f3 = f33;
                }
                float f34 = f3;
                int i14 = 0;
                float f35 = 0.0f;
                while (i14 < this.lines.size()) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i14);
                    float f36 = f28;
                    if (lineViewData2.enabled || lineViewData2.alpha != f2) {
                        long[] jArr = lineViewData2.line.y;
                        if (i13 == 1) {
                            if (jArr[i10] != 0) {
                                float f37 = f29;
                                f6 = lineViewData2.alpha;
                                f4 = f37;
                                f5 = f35;
                                float[] fArr3 = ((StackLinearChartData) this.chartData).xPercentage;
                                f7 = (fArr3[i10] * f30) - f31;
                                if (i10 != min) {
                                    f8 = getMeasuredWidth();
                                } else {
                                    f8 = (fArr3[i10 + 1] * f30) - f31;
                                }
                                if (f6 == f2 && i14 == i11) {
                                    z2 = true;
                                }
                                float f38 = f4;
                                float measuredHeight3 = f6 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                                measuredHeight = ((getMeasuredHeight() - this.chartBottom) - measuredHeight3) - f5;
                                this.startFromY[i14] = measuredHeight;
                                measuredHeight2 = getMeasuredHeight() - this.chartBottom;
                                if (i10 != min) {
                                    f38 = f7;
                                } else if (i10 == max) {
                                    f36 = f7;
                                }
                                if (this.transitionMode == 2 || i14 == i11) {
                                    f9 = f7;
                                    f10 = measuredHeight;
                                    f11 = measuredHeight2;
                                    f12 = 0.0f;
                                } else {
                                    int i15 = (f7 > centerX ? 1 : (f7 == centerX ? 0 : -1));
                                    if (i15 < 0) {
                                        TransitionParams transitionParams = this.transitionParams;
                                        i5 = i15;
                                        f18 = transitionParams.startX[i14];
                                        f17 = transitionParams.startY[i14];
                                    } else {
                                        i5 = i15;
                                        TransitionParams transitionParams2 = this.transitionParams;
                                        float f39 = transitionParams2.endX[i14];
                                        f17 = transitionParams2.endY[i14];
                                        f18 = f39;
                                    }
                                    float f40 = centerX - f18;
                                    float f41 = centerY - f17;
                                    float f42 = (((f7 - f18) * f41) / f40) + f17;
                                    float f43 = f - f34;
                                    float f44 = measuredHeight * f43;
                                    float f45 = f42 * f34;
                                    float f46 = f44 + f45;
                                    float f47 = (measuredHeight2 * f43) + f45;
                                    float f48 = f41 / f40;
                                    if (f48 > f2) {
                                        f19 = f43;
                                        f20 = f8;
                                        degrees2 = Math.toDegrees(-Math.atan(f48));
                                    } else {
                                        f19 = f43;
                                        f20 = f8;
                                        degrees2 = Math.toDegrees(Math.atan(Math.abs(f48)));
                                    }
                                    float f49 = ((float) degrees2) - 90.0f;
                                    if (f7 >= centerX) {
                                        float[] fArr4 = this.mapPoints;
                                        fArr4[0] = f7;
                                        fArr4[1] = f46;
                                        this.matrix.reset();
                                        this.matrix.postRotate(this.transitionParams.progress * f49, centerX, centerY);
                                        this.matrix.mapPoints(this.mapPoints);
                                        float[] fArr5 = this.mapPoints;
                                        f9 = fArr5[0];
                                        float f50 = fArr5[1];
                                        if (f9 < centerX) {
                                            f9 = centerX;
                                        }
                                        fArr5[0] = f7;
                                        fArr5[1] = f47;
                                        this.matrix.reset();
                                        f12 = f49;
                                        this.matrix.postRotate(this.transitionParams.progress * f12, centerX, centerY);
                                        this.matrix.mapPoints(this.mapPoints);
                                        float f51 = this.mapPoints[1];
                                        if (i5 < 0) {
                                            f11 = f51;
                                            i2 = i13;
                                            f10 = f50;
                                            f13 = centerX;
                                        } else {
                                            i2 = i13;
                                            f13 = f7;
                                            f11 = f51;
                                            f10 = f50;
                                        }
                                    } else {
                                        f12 = f49;
                                        if (f20 >= centerX) {
                                            f10 = (f46 * f19) + (centerY * f34);
                                            f11 = f10;
                                            f9 = (f7 * f19) + (centerX * f34);
                                        } else {
                                            float[] fArr6 = this.mapPoints;
                                            fArr6[0] = f7;
                                            fArr6[1] = f46;
                                            this.matrix.reset();
                                            Matrix matrix = this.matrix;
                                            TransitionParams transitionParams3 = this.transitionParams;
                                            float f52 = transitionParams3.progress;
                                            matrix.postRotate((f52 * f12) + (f52 * transitionParams3.angle[i14]), centerX, centerY);
                                            this.matrix.mapPoints(this.mapPoints);
                                            float[] fArr7 = this.mapPoints;
                                            float f53 = fArr7[0];
                                            float f54 = fArr7[1];
                                            if (f20 >= centerX) {
                                                fArr = fArr7;
                                                float f55 = this.transitionParams.progress;
                                                fArr[0] = (f7 * (f - f55)) + (f55 * centerX);
                                            } else {
                                                fArr = fArr7;
                                                fArr[0] = f7;
                                            }
                                            fArr[1] = f47;
                                            this.matrix.reset();
                                            Matrix matrix2 = this.matrix;
                                            TransitionParams transitionParams4 = this.transitionParams;
                                            float f56 = transitionParams4.progress;
                                            matrix2.postRotate((f56 * f12) + (f56 * transitionParams4.angle[i14]), centerX, centerY);
                                            this.matrix.mapPoints(this.mapPoints);
                                            float[] fArr8 = this.mapPoints;
                                            i2 = i13;
                                            f13 = fArr8[0];
                                            f11 = fArr8[1];
                                            f9 = f53;
                                            f10 = f54;
                                        }
                                    }
                                    if (i10 == max) {
                                        i4 = max;
                                        float measuredHeight4 = getMeasuredHeight();
                                        z = z2;
                                        if (this.transitionMode != 2 || i14 == i11) {
                                            i3 = i;
                                            f15 = measuredHeight4;
                                            f16 = 0.0f;
                                        } else {
                                            float[] fArr9 = this.mapPoints;
                                            fArr9[0] = f2 - centerX;
                                            fArr9[1] = measuredHeight4;
                                            this.matrix.reset();
                                            Matrix matrix3 = this.matrix;
                                            TransitionParams transitionParams5 = this.transitionParams;
                                            i3 = i;
                                            float f57 = transitionParams5.progress;
                                            matrix3.postRotate((f12 * f57) + (f57 * transitionParams5.angle[i14]), centerX, centerY);
                                            this.matrix.mapPoints(this.mapPoints);
                                            float[] fArr10 = this.mapPoints;
                                            float f58 = fArr10[0];
                                            f15 = fArr10[1];
                                            f16 = f58;
                                        }
                                        lineViewData2.chartPath.moveTo(f16, f15);
                                        this.skipPoints[i14] = false;
                                    } else {
                                        i3 = i;
                                        i4 = max;
                                        z = z2;
                                    }
                                    TransitionParams transitionParams6 = this.transitionParams;
                                    float f59 = transitionParams6 == null ? 0.0f : transitionParams6.progress;
                                    if (f6 != f2 && i10 > 0 && jArr[i10 - 1] == 0 && i10 < min && jArr[i10 + 1] == 0 && this.transitionMode != 2) {
                                        if (!this.skipPoints[i14]) {
                                            if (i14 == i11) {
                                                lineViewData2.chartPath.lineTo(f13, f11 * (f - f59));
                                            } else {
                                                lineViewData2.chartPath.lineTo(f13, f11);
                                            }
                                        }
                                        this.skipPoints[i14] = true;
                                    } else {
                                        if (this.skipPoints[i14]) {
                                            if (i14 == i11) {
                                                lineViewData2.chartPath.lineTo(f13, f11 * (f - f59));
                                            } else {
                                                lineViewData2.chartPath.lineTo(f13, f11);
                                            }
                                        }
                                        if (i14 == i11) {
                                            lineViewData2.chartPath.lineTo(f9, (f - f59) * f10);
                                        } else {
                                            lineViewData2.chartPath.lineTo(f9, f10);
                                        }
                                        this.skipPoints[i14] = false;
                                    }
                                    if (i10 == min) {
                                        float measuredWidth = getMeasuredWidth();
                                        float measuredHeight5 = getMeasuredHeight();
                                        if (this.transitionMode == 2 && i14 != i11) {
                                            float[] fArr11 = this.mapPoints;
                                            fArr11[0] = measuredWidth + centerX;
                                            fArr11[1] = measuredHeight5;
                                            this.matrix.reset();
                                            Matrix matrix4 = this.matrix;
                                            TransitionParams transitionParams7 = this.transitionParams;
                                            matrix4.postRotate(transitionParams7.progress * transitionParams7.angle[i14], centerX, centerY);
                                            this.matrix.mapPoints(this.mapPoints);
                                            float[] fArr12 = this.mapPoints;
                                            float f60 = fArr12[0];
                                            float f61 = fArr12[1];
                                        } else {
                                            lineViewData2.chartPath.lineTo(measuredWidth, measuredHeight5);
                                        }
                                        if (this.transitionMode == 2 && i14 != i11) {
                                            TransitionParams transitionParams8 = this.transitionParams;
                                            float f62 = (centerY - transitionParams8.startY[i14]) / (centerX - transitionParams8.startX[i14]);
                                            if (f62 > f2) {
                                                degrees = Math.toDegrees(-Math.atan(f62));
                                            } else {
                                                degrees = Math.toDegrees(Math.atan(Math.abs(f62)));
                                            }
                                            TransitionParams transitionParams9 = this.transitionParams;
                                            float f63 = transitionParams9.startX[i14];
                                            float f64 = transitionParams9.startY[i14];
                                            float[] fArr13 = this.mapPoints;
                                            fArr13[0] = f63;
                                            fArr13[1] = f64;
                                            this.matrix.reset();
                                            Matrix matrix5 = this.matrix;
                                            TransitionParams transitionParams10 = this.transitionParams;
                                            float f65 = transitionParams10.progress;
                                            matrix5.postRotate(((((float) degrees) - 90.0f) * f65) + (f65 * transitionParams10.angle[i14]), centerX, centerY);
                                            this.matrix.mapPoints(this.mapPoints);
                                            float[] fArr14 = this.mapPoints;
                                            float f66 = fArr14[0];
                                            float f67 = fArr14[1];
                                            if (Math.abs(f9 - f66) >= 0.001d || ((f67 >= centerY || f10 >= centerY) && (f67 <= centerY || f10 <= centerY))) {
                                                quarterForPoint = quarterForPoint(f9, f10);
                                                quarterForPoint2 = quarterForPoint(f66, f67);
                                            } else if (this.transitionParams.angle[i14] == -180.0f) {
                                                quarterForPoint = 0;
                                                quarterForPoint2 = 0;
                                            } else {
                                                quarterForPoint = 0;
                                                quarterForPoint2 = 3;
                                            }
                                            while (quarterForPoint <= quarterForPoint2) {
                                                if (quarterForPoint == 0) {
                                                    lineViewData2.chartPath.lineTo(getMeasuredWidth(), 0.0f);
                                                } else if (quarterForPoint == 1) {
                                                    lineViewData2.chartPath.lineTo(getMeasuredWidth(), getMeasuredHeight());
                                                } else {
                                                    if (quarterForPoint == 2) {
                                                        lineViewData2.chartPath.lineTo(0.0f, getMeasuredHeight());
                                                    } else {
                                                        lineViewData2.chartPath.lineTo(0.0f, 0.0f);
                                                    }
                                                    quarterForPoint++;
                                                }
                                                quarterForPoint++;
                                            }
                                        }
                                    }
                                    f14 = f5 + measuredHeight3;
                                    f29 = f38;
                                    z2 = z;
                                }
                                i2 = i13;
                                f13 = f9;
                                if (i10 == max) {
                                }
                                TransitionParams transitionParams62 = this.transitionParams;
                                if (transitionParams62 == null) {
                                }
                                if (f6 != f2) {
                                }
                                if (this.skipPoints[i14]) {
                                }
                                if (i14 == i11) {
                                }
                                this.skipPoints[i14] = false;
                                if (i10 == min) {
                                }
                                f14 = f5 + measuredHeight3;
                                f29 = f38;
                                z2 = z;
                            }
                            f4 = f29;
                            f5 = f35;
                            f6 = 0.0f;
                            float[] fArr32 = ((StackLinearChartData) this.chartData).xPercentage;
                            f7 = (fArr32[i10] * f30) - f31;
                            if (i10 != min) {
                            }
                            if (f6 == f2) {
                                z2 = true;
                            }
                            float f382 = f4;
                            float measuredHeight32 = f6 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            measuredHeight = ((getMeasuredHeight() - this.chartBottom) - measuredHeight32) - f5;
                            this.startFromY[i14] = measuredHeight;
                            measuredHeight2 = getMeasuredHeight() - this.chartBottom;
                            if (i10 != min) {
                            }
                            if (this.transitionMode == 2) {
                            }
                            f9 = f7;
                            f10 = measuredHeight;
                            f11 = measuredHeight2;
                            f12 = 0.0f;
                            i2 = i13;
                            f13 = f9;
                            if (i10 == max) {
                            }
                            TransitionParams transitionParams622 = this.transitionParams;
                            if (transitionParams622 == null) {
                            }
                            if (f6 != f2) {
                            }
                            if (this.skipPoints[i14]) {
                            }
                            if (i14 == i11) {
                            }
                            this.skipPoints[i14] = false;
                            if (i10 == min) {
                            }
                            f14 = f5 + measuredHeight32;
                            f29 = f382;
                            z2 = z;
                        } else {
                            if (f32 != f2) {
                                f4 = f29;
                                f5 = f35;
                                f6 = (jArr[i10] * lineViewData2.alpha) / f32;
                                float[] fArr322 = ((StackLinearChartData) this.chartData).xPercentage;
                                f7 = (fArr322[i10] * f30) - f31;
                                if (i10 != min) {
                                }
                                if (f6 == f2) {
                                }
                                float f3822 = f4;
                                float measuredHeight322 = f6 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                                measuredHeight = ((getMeasuredHeight() - this.chartBottom) - measuredHeight322) - f5;
                                this.startFromY[i14] = measuredHeight;
                                measuredHeight2 = getMeasuredHeight() - this.chartBottom;
                                if (i10 != min) {
                                }
                                if (this.transitionMode == 2) {
                                }
                                f9 = f7;
                                f10 = measuredHeight;
                                f11 = measuredHeight2;
                                f12 = 0.0f;
                                i2 = i13;
                                f13 = f9;
                                if (i10 == max) {
                                }
                                TransitionParams transitionParams6222 = this.transitionParams;
                                if (transitionParams6222 == null) {
                                }
                                if (f6 != f2) {
                                }
                                if (this.skipPoints[i14]) {
                                }
                                if (i14 == i11) {
                                }
                                this.skipPoints[i14] = false;
                                if (i10 == min) {
                                }
                                f14 = f5 + measuredHeight322;
                                f29 = f3822;
                                z2 = z;
                            }
                            f4 = f29;
                            f5 = f35;
                            f6 = 0.0f;
                            float[] fArr3222 = ((StackLinearChartData) this.chartData).xPercentage;
                            f7 = (fArr3222[i10] * f30) - f31;
                            if (i10 != min) {
                            }
                            if (f6 == f2) {
                            }
                            float f38222 = f4;
                            float measuredHeight3222 = f6 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            measuredHeight = ((getMeasuredHeight() - this.chartBottom) - measuredHeight3222) - f5;
                            this.startFromY[i14] = measuredHeight;
                            measuredHeight2 = getMeasuredHeight() - this.chartBottom;
                            if (i10 != min) {
                            }
                            if (this.transitionMode == 2) {
                            }
                            f9 = f7;
                            f10 = measuredHeight;
                            f11 = measuredHeight2;
                            f12 = 0.0f;
                            i2 = i13;
                            f13 = f9;
                            if (i10 == max) {
                            }
                            TransitionParams transitionParams62222 = this.transitionParams;
                            if (transitionParams62222 == null) {
                            }
                            if (f6 != f2) {
                            }
                            if (this.skipPoints[i14]) {
                            }
                            if (i14 == i11) {
                            }
                            this.skipPoints[i14] = false;
                            if (i10 == min) {
                            }
                            f14 = f5 + measuredHeight3222;
                            f29 = f38222;
                            z2 = z;
                        }
                    } else {
                        i3 = i;
                        f14 = f35;
                        i4 = max;
                        i2 = i13;
                    }
                    f28 = f36;
                    i14++;
                    f35 = f14;
                    i13 = i2;
                    max = i4;
                    i = i3;
                    f2 = 0.0f;
                }
                i10++;
                f24 = f30;
                f25 = f31;
                f3 = f34;
                f2 = 0.0f;
            }
            int i16 = i;
            canvas.save();
            canvas.clipRect(f28, BaseChartView.SIGNATURE_TEXT_HEIGHT, f29, getMeasuredHeight() - this.chartBottom);
            if (z2) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size = this.lines.size() - 1; size >= 0; size--) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(size);
                lineViewData3.paint.setAlpha(i16);
                canvas.drawPath(lineViewData3.chartPath, lineViewData3.paint);
                lineViewData3.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
            }
            canvas.restore();
            canvas.restore();
        }
    }

    private int quarterForPoint(float f, float f2) {
        float centerX = this.chartArea.centerX();
        float centerY = this.chartArea.centerY() + AndroidUtilities.dp(16.0f);
        if (f >= centerX && f2 <= centerY) {
            return 0;
        }
        if (f < centerX || f2 < centerY) {
            return (f >= centerX || f2 < centerY) ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    @Override // org.telegram.ui.Charts.BaseChartView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void drawPickerChart(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        boolean z3;
        long[] jArr;
        int i;
        if (this.chartData != null) {
            int size = this.lines.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((StackLinearViewData) this.lines.get(i2)).chartPathPicker.reset();
            }
            StackLinearChartData stackLinearChartData = (StackLinearChartData) this.chartData;
            int i3 = stackLinearChartData.simplifiedSize;
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < stackLinearChartData.lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i4 = 0;
            boolean z4 = false;
            while (true) {
                int i5 = 1;
                if (i4 >= i3) {
                    break;
                }
                float f3 = 0.0f;
                int i6 = 0;
                float f4 = 0.0f;
                int i7 = 0;
                int i8 = 0;
                while (i6 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i6);
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        i = i3;
                        long j = ((StackLinearChartData) this.chartData).simplifiedY[i6][i4];
                        if (j > 0) {
                            f4 += j * lineViewData.alpha;
                            i7++;
                        }
                        i8 = i6;
                    } else {
                        i = i3;
                    }
                    i6++;
                    i3 = i;
                }
                int i9 = i3;
                int i10 = i9 - 1;
                float f5 = (i4 / i10) * this.pickerWidth;
                int i11 = 0;
                float f6 = 0.0f;
                while (i11 < this.lines.size()) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i11);
                    if (lineViewData2.enabled || lineViewData2.alpha != f3) {
                        if (i7 == i5) {
                            if (((StackLinearChartData) this.chartData).simplifiedY[i11][i4] != 0) {
                                f2 = lineViewData2.alpha;
                                z = true;
                                f = 0.0f;
                                if (f2 == f && i11 == i8) {
                                    z4 = true;
                                }
                                float f7 = this.pikerHeight;
                                float f8 = f2 * f7;
                                float f9 = (f7 - f8) - f6;
                                if (i4 == 0) {
                                    z3 = false;
                                    z2 = z4;
                                    lineViewData2.chartPathPicker.moveTo(0.0f, f7);
                                    this.skipPoints[i11] = false;
                                } else {
                                    z2 = z4;
                                    z3 = false;
                                }
                                jArr = ((StackLinearChartData) this.chartData).simplifiedY[i11];
                                if (jArr[i4] != 0 && i4 > 0 && jArr[i4 - 1] == 0 && i4 < i10 && jArr[i4 + 1] == 0) {
                                    if (!this.skipPoints[i11]) {
                                        lineViewData2.chartPathPicker.lineTo(f5, this.pikerHeight);
                                    }
                                    this.skipPoints[i11] = z;
                                } else {
                                    if (this.skipPoints[i11]) {
                                        lineViewData2.chartPathPicker.lineTo(f5, this.pikerHeight);
                                    }
                                    lineViewData2.chartPathPicker.lineTo(f5, f9);
                                    this.skipPoints[i11] = z3;
                                }
                                if (i4 == i10) {
                                    lineViewData2.chartPathPicker.lineTo(this.pickerWidth, this.pikerHeight);
                                }
                                f6 += f8;
                            }
                        } else if (f4 != f3) {
                            z = true;
                            f = 0.0f;
                            f2 = (((StackLinearChartData) this.chartData).simplifiedY[i11][i4] * lineViewData2.alpha) / f4;
                            if (f2 == f) {
                                z4 = true;
                            }
                            float f72 = this.pikerHeight;
                            float f82 = f2 * f72;
                            float f92 = (f72 - f82) - f6;
                            if (i4 == 0) {
                            }
                            jArr = ((StackLinearChartData) this.chartData).simplifiedY[i11];
                            if (jArr[i4] != 0) {
                            }
                            if (this.skipPoints[i11]) {
                            }
                            lineViewData2.chartPathPicker.lineTo(f5, f92);
                            this.skipPoints[i11] = z3;
                            if (i4 == i10) {
                            }
                            f6 += f82;
                        }
                        f2 = 0.0f;
                        z = true;
                        f = 0.0f;
                        if (f2 == f) {
                        }
                        float f722 = this.pikerHeight;
                        float f822 = f2 * f722;
                        float f922 = (f722 - f822) - f6;
                        if (i4 == 0) {
                        }
                        jArr = ((StackLinearChartData) this.chartData).simplifiedY[i11];
                        if (jArr[i4] != 0) {
                        }
                        if (this.skipPoints[i11]) {
                        }
                        lineViewData2.chartPathPicker.lineTo(f5, f922);
                        this.skipPoints[i11] = z3;
                        if (i4 == i10) {
                        }
                        f6 += f822;
                    } else {
                        z2 = z4;
                    }
                    i11++;
                    z4 = z2;
                    i5 = 1;
                    f3 = 0.0f;
                }
                i4++;
                i3 = i9;
            }
            if (z4) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size2 = this.lines.size() - 1; size2 >= 0; size2--) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(size2);
                canvas.drawPath(lineViewData3.chartPathPicker, lineViewData3.paint);
            }
        }
    }

    @Override // org.telegram.ui.Charts.BaseChartView, android.view.View
    protected void onDraw(Canvas canvas) {
        tick();
        drawChart(canvas);
        drawBottomLine(canvas);
        this.tmpN = this.horizontalLines.size();
        int i = 0;
        while (true) {
            this.tmpI = i;
            int i2 = this.tmpI;
            if (i2 < this.tmpN) {
                drawHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(i2));
                drawSignaturesToHorizontalLines(canvas, (ChartHorizontalLinesData) this.horizontalLines.get(this.tmpI));
                i = this.tmpI + 1;
            } else {
                drawBottomSignature(canvas);
                drawPicker(canvas);
                drawSelection(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b  */
    @Override // org.telegram.ui.Charts.BaseChartView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fillTransitionParams(TransitionParams transitionParams) {
        float f;
        int i;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float f2 = this.chartWidth;
        ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
        float f3 = chartPickerDelegate.pickerEnd;
        float f4 = chartPickerDelegate.pickerStart;
        float f5 = f2 / (f3 - f4);
        float f6 = BaseChartView.HORIZONTAL_PADDING;
        float f7 = (f4 * f5) - f6;
        float[] fArr = ((StackLinearChartData) chartData).xPercentage;
        int i2 = 2;
        int i3 = 1;
        int i4 = ((int) (f6 / (fArr.length < 2 ? 1.0f : fArr[1] * f5))) + 1;
        int max = Math.max(0, (this.startXIndex - i4) - 1);
        int min = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i4 + 1);
        this.transitionParams.startX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.startY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.angle = new float[((StackLinearChartData) this.chartData).lines.size()];
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i5 == i3 ? min : max;
            float f8 = 0.0f;
            int i7 = 0;
            float f9 = 0.0f;
            int i8 = 0;
            while (i7 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i7);
                if (lineViewData.enabled || lineViewData.alpha != f8) {
                    i = i7;
                    long j = lineViewData.line.y[i6];
                    if (j > 0) {
                        f9 += j * lineViewData.alpha;
                        i8++;
                    }
                } else {
                    i = i7;
                }
                i7 = i + 1;
                f8 = 0.0f;
            }
            int i9 = 0;
            int i10 = 0;
            while (i9 < this.lines.size()) {
                LineViewData lineViewData2 = (LineViewData) this.lines.get(i9);
                if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                    long[] jArr = lineViewData2.line.y;
                    if (i8 == i3) {
                        if (jArr[i6] != 0) {
                            f = lineViewData2.alpha;
                            float f10 = (((StackLinearChartData) this.chartData).xPercentage[i6] * f5) - f7;
                            float measuredHeight = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            float f11 = i10;
                            float measuredHeight2 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f11;
                            i10 = (int) (f11 + measuredHeight);
                            if (i5 != 0) {
                                TransitionParams transitionParams2 = this.transitionParams;
                                transitionParams2.startX[i9] = f10;
                                transitionParams2.startY[i9] = measuredHeight2;
                            } else {
                                TransitionParams transitionParams3 = this.transitionParams;
                                transitionParams3.endX[i9] = f10;
                                transitionParams3.endY[i9] = measuredHeight2;
                            }
                        }
                        f = 0.0f;
                        float f102 = (((StackLinearChartData) this.chartData).xPercentage[i6] * f5) - f7;
                        float measuredHeight3 = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                        float f112 = i10;
                        float measuredHeight22 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight3) - f112;
                        i10 = (int) (f112 + measuredHeight3);
                        if (i5 != 0) {
                        }
                    } else {
                        if (f9 != 0.0f) {
                            f = (jArr[i6] * lineViewData2.alpha) / f9;
                            float f1022 = (((StackLinearChartData) this.chartData).xPercentage[i6] * f5) - f7;
                            float measuredHeight32 = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            float f1122 = i10;
                            float measuredHeight222 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight32) - f1122;
                            i10 = (int) (f1122 + measuredHeight32);
                            if (i5 != 0) {
                            }
                        }
                        f = 0.0f;
                        float f10222 = (((StackLinearChartData) this.chartData).xPercentage[i6] * f5) - f7;
                        float measuredHeight322 = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                        float f11222 = i10;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight322) - f11222;
                        i10 = (int) (f11222 + measuredHeight322);
                        if (i5 != 0) {
                        }
                    }
                }
                i9++;
                i3 = 1;
            }
            i5++;
            i2 = 2;
            i3 = 1;
        }
    }
}
