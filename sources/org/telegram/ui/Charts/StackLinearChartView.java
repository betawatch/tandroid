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

    /* JADX WARN: Removed duplicated region for block: B:100:0x0423 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x041d  */
    @Override // org.telegram.ui.Charts.BaseChartView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void drawChart(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2;
        float f9;
        float measuredHeight;
        int i3;
        float f10;
        int i4;
        float f11;
        float f12;
        float f13;
        int i5;
        float f14;
        int i6;
        float f15;
        int i7;
        float f16;
        int i8;
        float f17;
        double degrees;
        int quarterForPoint;
        int quarterForPoint2;
        boolean z;
        float f18;
        float f19;
        float f20;
        int i9;
        double degrees2;
        float f21;
        float f22;
        float f23;
        if (this.chartData != null) {
            float f24 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f25 = chartPickerDelegate.pickerEnd;
            float f26 = chartPickerDelegate.pickerStart;
            float f27 = f24 / (f25 - f26);
            float f28 = (f26 * f27) - BaseChartView.HORIZONTAL_PADDING;
            float centerX = this.chartArea.centerX();
            float centerY = this.chartArea.centerY() + AndroidUtilities.dp(16.0f);
            int i10 = 0;
            for (int i11 = 0; i11 < this.lines.size(); i11++) {
                ((StackLinearViewData) this.lines.get(i11)).chartPath.reset();
                ((StackLinearViewData) this.lines.get(i11)).chartPathPicker.reset();
            }
            canvas.save();
            boolean[] zArr = this.skipPoints;
            if (zArr == null || zArr.length < ((StackLinearChartData) this.chartData).lines.size()) {
                this.skipPoints = new boolean[((StackLinearChartData) this.chartData).lines.size()];
                this.startFromY = new float[((StackLinearChartData) this.chartData).lines.size()];
            }
            int i12 = this.transitionMode;
            if (i12 == 2) {
                float f29 = this.transitionParams.progress / 0.6f;
                if (f29 > 1.0f) {
                    f29 = 1.0f;
                }
                this.ovalPath.reset();
                float width = this.chartArea.width() > this.chartArea.height() ? this.chartArea.width() : this.chartArea.height();
                float height = (this.chartArea.width() > this.chartArea.height() ? this.chartArea.height() : this.chartArea.width()) * 0.45f;
                float f30 = height + (((width - height) / 2.0f) * (1.0f - this.transitionParams.progress));
                RectF rectF = new RectF();
                rectF.set(centerX - f30, centerY - f30, centerX + f30, centerY + f30);
                this.ovalPath.addRoundRect(rectF, f30, f30, Path.Direction.CW);
                canvas.clipPath(this.ovalPath);
                f = f29;
                i = NotificationCenter.closeOtherAppActivities;
            } else {
                i = i12 == 3 ? (int) (this.transitionParams.progress * 255.0f) : NotificationCenter.closeOtherAppActivities;
                f = 0.0f;
            }
            float[] fArr = ((StackLinearChartData) this.chartData).xPercentage;
            int i13 = ((int) (BaseChartView.HORIZONTAL_PADDING / (fArr.length < 2 ? 1.0f : fArr[1] * f27))) + 1;
            int max = Math.max(0, (this.startXIndex - i13) - 1);
            int min = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i13 + 1);
            int i14 = max;
            float f31 = 0.0f;
            boolean z2 = false;
            float f32 = 0.0f;
            while (i14 <= min) {
                int i15 = 0;
                float f33 = 0.0f;
                int i16 = 0;
                while (i10 < this.lines.size()) {
                    LineViewData lineViewData = (LineViewData) this.lines.get(i10);
                    int i17 = i;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        f22 = f31;
                        f23 = f;
                        long j = lineViewData.line.y[i14];
                        if (j > 0) {
                            f33 += j * lineViewData.alpha;
                            i15++;
                        }
                        i16 = i10;
                    } else {
                        f22 = f31;
                        f23 = f;
                    }
                    i10++;
                    i = i17;
                    f = f23;
                    f31 = f22;
                }
                int i18 = i;
                float f34 = f;
                float f35 = 0.0f;
                int i19 = 0;
                while (i19 < this.lines.size()) {
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i19);
                    if (lineViewData2.enabled || lineViewData2.alpha != 0.0f) {
                        long[] jArr = lineViewData2.line.y;
                        f2 = f31;
                        if (i15 == 1) {
                            if (jArr[i14] != 0) {
                                f4 = centerY;
                                f3 = centerX;
                                f5 = lineViewData2.alpha;
                                float[] fArr2 = ((StackLinearChartData) this.chartData).xPercentage;
                                f6 = (fArr2[i14] * f27) - f28;
                                if (i14 != min) {
                                    f7 = getMeasuredWidth();
                                } else {
                                    f7 = (fArr2[i14 + 1] * f27) - f28;
                                }
                                f8 = f27;
                                i2 = i16;
                                if (f5 == 0.0f && i19 == i2) {
                                    z2 = true;
                                }
                                f9 = f28;
                                measuredHeight = f5 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                                i3 = i15;
                                float measuredHeight2 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f35;
                                this.startFromY[i19] = measuredHeight2;
                                boolean z3 = z2;
                                float measuredHeight3 = getMeasuredHeight() - this.chartBottom;
                                if (i14 != min) {
                                    f32 = f6;
                                } else if (i14 == max) {
                                    f2 = f6;
                                }
                                if (this.transitionMode == 2 || i19 == i2) {
                                    f10 = measuredHeight;
                                    i4 = min;
                                    int i20 = max;
                                    f11 = f4;
                                    f12 = f6;
                                    f13 = f12;
                                    i5 = i20;
                                    f14 = 0.0f;
                                } else {
                                    if (f6 < f3) {
                                        TransitionParams transitionParams = this.transitionParams;
                                        f10 = measuredHeight;
                                        f20 = transitionParams.startX[i19];
                                        f19 = transitionParams.startY[i19];
                                    } else {
                                        f10 = measuredHeight;
                                        TransitionParams transitionParams2 = this.transitionParams;
                                        float f36 = transitionParams2.endX[i19];
                                        f19 = transitionParams2.endY[i19];
                                        f20 = f36;
                                    }
                                    float f37 = f3 - f20;
                                    float f38 = f4 - f19;
                                    float f39 = 1.0f - f34;
                                    float f40 = ((((f6 - f20) * f38) / f37) + f19) * f34;
                                    float f41 = (measuredHeight2 * f39) + f40;
                                    float f42 = (measuredHeight3 * f39) + f40;
                                    float f43 = f38 / f37;
                                    if (f43 > 0.0f) {
                                        i4 = min;
                                        i9 = max;
                                        degrees2 = Math.toDegrees(-Math.atan(f43));
                                    } else {
                                        i4 = min;
                                        i9 = max;
                                        degrees2 = Math.toDegrees(Math.atan(Math.abs(f43)));
                                    }
                                    f14 = ((float) degrees2) - 90.0f;
                                    if (f6 >= f3) {
                                        float[] fArr3 = this.mapPoints;
                                        fArr3[0] = f6;
                                        fArr3[1] = f41;
                                        this.matrix.reset();
                                        f11 = f4;
                                        this.matrix.postRotate(this.transitionParams.progress * f14, f3, f11);
                                        this.matrix.mapPoints(this.mapPoints);
                                        float[] fArr4 = this.mapPoints;
                                        f13 = fArr4[0];
                                        f21 = fArr4[1];
                                        if (f13 < f3) {
                                            f13 = f3;
                                        }
                                        fArr4[0] = f6;
                                        fArr4[1] = f42;
                                        this.matrix.reset();
                                        this.matrix.postRotate(this.transitionParams.progress * f14, f3, f11);
                                        this.matrix.mapPoints(this.mapPoints);
                                        measuredHeight3 = this.mapPoints[1];
                                        if (f6 < f3) {
                                            f12 = f3;
                                            measuredHeight2 = f21;
                                            i5 = i9;
                                        }
                                        measuredHeight2 = f21;
                                        f12 = f6;
                                        i5 = i9;
                                    } else {
                                        f11 = f4;
                                        if (f7 >= f3) {
                                            measuredHeight2 = (f41 * f39) + (f11 * f34);
                                            measuredHeight3 = measuredHeight2;
                                            f12 = (f6 * f39) + (f3 * f34);
                                            f13 = f12;
                                            i5 = i9;
                                        } else {
                                            float[] fArr5 = this.mapPoints;
                                            fArr5[0] = f6;
                                            fArr5[1] = f41;
                                            this.matrix.reset();
                                            Matrix matrix = this.matrix;
                                            TransitionParams transitionParams3 = this.transitionParams;
                                            float f44 = transitionParams3.progress;
                                            matrix.postRotate((f44 * f14) + (f44 * transitionParams3.angle[i19]), f3, f11);
                                            this.matrix.mapPoints(this.mapPoints);
                                            float[] fArr6 = this.mapPoints;
                                            f13 = fArr6[0];
                                            f21 = fArr6[1];
                                            if (f7 >= f3) {
                                                float f45 = this.transitionParams.progress;
                                                fArr6[0] = (f6 * (1.0f - f45)) + (f45 * f3);
                                            } else {
                                                fArr6[0] = f6;
                                            }
                                            fArr6[1] = f42;
                                            this.matrix.reset();
                                            Matrix matrix2 = this.matrix;
                                            TransitionParams transitionParams4 = this.transitionParams;
                                            float f46 = transitionParams4.progress;
                                            matrix2.postRotate((f46 * f14) + (f46 * transitionParams4.angle[i19]), f3, f11);
                                            this.matrix.mapPoints(this.mapPoints);
                                            float[] fArr7 = this.mapPoints;
                                            f6 = fArr7[0];
                                            measuredHeight3 = fArr7[1];
                                            measuredHeight2 = f21;
                                            f12 = f6;
                                            i5 = i9;
                                        }
                                    }
                                }
                                if (i14 != i5) {
                                    float measuredHeight4 = getMeasuredHeight();
                                    i6 = i5;
                                    f15 = f35;
                                    if (this.transitionMode != 2 || i19 == i2) {
                                        z = false;
                                        f18 = 0.0f;
                                    } else {
                                        float[] fArr8 = this.mapPoints;
                                        fArr8[0] = 0.0f - f3;
                                        fArr8[1] = measuredHeight4;
                                        this.matrix.reset();
                                        Matrix matrix3 = this.matrix;
                                        TransitionParams transitionParams5 = this.transitionParams;
                                        float f47 = transitionParams5.progress;
                                        matrix3.postRotate((f14 * f47) + (f47 * transitionParams5.angle[i19]), f3, f11);
                                        this.matrix.mapPoints(this.mapPoints);
                                        float[] fArr9 = this.mapPoints;
                                        z = false;
                                        f18 = fArr9[0];
                                        measuredHeight4 = fArr9[1];
                                    }
                                    lineViewData2.chartPath.moveTo(f18, measuredHeight4);
                                    this.skipPoints[i19] = z;
                                } else {
                                    i6 = i5;
                                    f15 = f35;
                                }
                                TransitionParams transitionParams6 = this.transitionParams;
                                float f48 = transitionParams6 != null ? 0.0f : transitionParams6.progress;
                                if (f5 == 0.0f || i14 <= 0 || jArr[i14 - 1] != 0) {
                                    i7 = i4;
                                } else {
                                    i7 = i4;
                                    if (i14 < i7 && jArr[i14 + 1] == 0 && this.transitionMode != 2) {
                                        if (!this.skipPoints[i19]) {
                                            if (i19 == i2) {
                                                lineViewData2.chartPath.lineTo(f12, measuredHeight3 * (1.0f - f48));
                                            } else {
                                                lineViewData2.chartPath.lineTo(f12, measuredHeight3);
                                            }
                                        }
                                        this.skipPoints[i19] = true;
                                        if (i14 == i7) {
                                            float measuredWidth = getMeasuredWidth();
                                            float measuredHeight5 = getMeasuredHeight();
                                            if (this.transitionMode == 2 && i19 != i2) {
                                                float[] fArr10 = this.mapPoints;
                                                fArr10[0] = measuredWidth + f3;
                                                fArr10[1] = measuredHeight5;
                                                this.matrix.reset();
                                                Matrix matrix4 = this.matrix;
                                                TransitionParams transitionParams7 = this.transitionParams;
                                                matrix4.postRotate(transitionParams7.progress * transitionParams7.angle[i19], f3, f11);
                                                this.matrix.mapPoints(this.mapPoints);
                                                float[] fArr11 = this.mapPoints;
                                                float f49 = fArr11[0];
                                                float f50 = fArr11[1];
                                            } else {
                                                lineViewData2.chartPath.lineTo(measuredWidth, measuredHeight5);
                                            }
                                            if (this.transitionMode == 2 && i19 != i2) {
                                                TransitionParams transitionParams8 = this.transitionParams;
                                                float f51 = (f11 - transitionParams8.startY[i19]) / (f3 - transitionParams8.startX[i19]);
                                                if (f51 > 0.0f) {
                                                    i8 = i14;
                                                    degrees = Math.toDegrees(-Math.atan(f51));
                                                } else {
                                                    i8 = i14;
                                                    degrees = Math.toDegrees(Math.atan(Math.abs(f51)));
                                                }
                                                TransitionParams transitionParams9 = this.transitionParams;
                                                float f52 = transitionParams9.startX[i19];
                                                float f53 = transitionParams9.startY[i19];
                                                float[] fArr12 = this.mapPoints;
                                                fArr12[0] = f52;
                                                fArr12[1] = f53;
                                                this.matrix.reset();
                                                Matrix matrix5 = this.matrix;
                                                TransitionParams transitionParams10 = this.transitionParams;
                                                float f54 = transitionParams10.progress;
                                                matrix5.postRotate(((((float) degrees) - 90.0f) * f54) + (f54 * transitionParams10.angle[i19]), f3, f11);
                                                this.matrix.mapPoints(this.mapPoints);
                                                float[] fArr13 = this.mapPoints;
                                                float f55 = fArr13[0];
                                                float f56 = fArr13[1];
                                                if (Math.abs(f13 - f55) >= 0.001d || ((f56 >= f11 || measuredHeight2 >= f11) && (f56 <= f11 || measuredHeight2 <= f11))) {
                                                    quarterForPoint = quarterForPoint(f13, measuredHeight2);
                                                    quarterForPoint2 = quarterForPoint(f55, f56);
                                                } else {
                                                    quarterForPoint2 = this.transitionParams.angle[i19] == -180.0f ? 0 : 3;
                                                    quarterForPoint = 0;
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
                                                f17 = f15 + f10;
                                                z2 = z3;
                                            }
                                        }
                                        i8 = i14;
                                        f17 = f15 + f10;
                                        z2 = z3;
                                    }
                                }
                                if (this.skipPoints[i19]) {
                                    f16 = 1.0f;
                                } else if (i19 == i2) {
                                    f16 = 1.0f;
                                    lineViewData2.chartPath.lineTo(f12, measuredHeight3 * (1.0f - f48));
                                } else {
                                    f16 = 1.0f;
                                    lineViewData2.chartPath.lineTo(f12, measuredHeight3);
                                }
                                if (i19 != i2) {
                                    lineViewData2.chartPath.lineTo(f13, (f16 - f48) * measuredHeight2);
                                } else {
                                    lineViewData2.chartPath.lineTo(f13, measuredHeight2);
                                }
                                this.skipPoints[i19] = false;
                                if (i14 == i7) {
                                }
                                i8 = i14;
                                f17 = f15 + f10;
                                z2 = z3;
                            }
                            f3 = centerX;
                            f4 = centerY;
                            f5 = 0.0f;
                            float[] fArr22 = ((StackLinearChartData) this.chartData).xPercentage;
                            f6 = (fArr22[i14] * f27) - f28;
                            if (i14 != min) {
                            }
                            f8 = f27;
                            i2 = i16;
                            if (f5 == 0.0f) {
                                z2 = true;
                            }
                            f9 = f28;
                            measuredHeight = f5 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            i3 = i15;
                            float measuredHeight22 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f35;
                            this.startFromY[i19] = measuredHeight22;
                            boolean z32 = z2;
                            float measuredHeight32 = getMeasuredHeight() - this.chartBottom;
                            if (i14 != min) {
                            }
                            if (this.transitionMode == 2) {
                            }
                            f10 = measuredHeight;
                            i4 = min;
                            int i202 = max;
                            f11 = f4;
                            f12 = f6;
                            f13 = f12;
                            i5 = i202;
                            f14 = 0.0f;
                            if (i14 != i5) {
                            }
                            TransitionParams transitionParams62 = this.transitionParams;
                            if (transitionParams62 != null) {
                            }
                            if (f5 == 0.0f) {
                            }
                            i7 = i4;
                            if (this.skipPoints[i19]) {
                            }
                            if (i19 != i2) {
                            }
                            this.skipPoints[i19] = false;
                            if (i14 == i7) {
                            }
                            i8 = i14;
                            f17 = f15 + f10;
                            z2 = z32;
                        } else {
                            if (f33 != 0.0f) {
                                f3 = centerX;
                                f4 = centerY;
                                f5 = (jArr[i14] * lineViewData2.alpha) / f33;
                                float[] fArr222 = ((StackLinearChartData) this.chartData).xPercentage;
                                f6 = (fArr222[i14] * f27) - f28;
                                if (i14 != min) {
                                }
                                f8 = f27;
                                i2 = i16;
                                if (f5 == 0.0f) {
                                }
                                f9 = f28;
                                measuredHeight = f5 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                                i3 = i15;
                                float measuredHeight222 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f35;
                                this.startFromY[i19] = measuredHeight222;
                                boolean z322 = z2;
                                float measuredHeight322 = getMeasuredHeight() - this.chartBottom;
                                if (i14 != min) {
                                }
                                if (this.transitionMode == 2) {
                                }
                                f10 = measuredHeight;
                                i4 = min;
                                int i2022 = max;
                                f11 = f4;
                                f12 = f6;
                                f13 = f12;
                                i5 = i2022;
                                f14 = 0.0f;
                                if (i14 != i5) {
                                }
                                TransitionParams transitionParams622 = this.transitionParams;
                                if (transitionParams622 != null) {
                                }
                                if (f5 == 0.0f) {
                                }
                                i7 = i4;
                                if (this.skipPoints[i19]) {
                                }
                                if (i19 != i2) {
                                }
                                this.skipPoints[i19] = false;
                                if (i14 == i7) {
                                }
                                i8 = i14;
                                f17 = f15 + f10;
                                z2 = z322;
                            }
                            f3 = centerX;
                            f4 = centerY;
                            f5 = 0.0f;
                            float[] fArr2222 = ((StackLinearChartData) this.chartData).xPercentage;
                            f6 = (fArr2222[i14] * f27) - f28;
                            if (i14 != min) {
                            }
                            f8 = f27;
                            i2 = i16;
                            if (f5 == 0.0f) {
                            }
                            f9 = f28;
                            measuredHeight = f5 * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            i3 = i15;
                            float measuredHeight2222 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f35;
                            this.startFromY[i19] = measuredHeight2222;
                            boolean z3222 = z2;
                            float measuredHeight3222 = getMeasuredHeight() - this.chartBottom;
                            if (i14 != min) {
                            }
                            if (this.transitionMode == 2) {
                            }
                            f10 = measuredHeight;
                            i4 = min;
                            int i20222 = max;
                            f11 = f4;
                            f12 = f6;
                            f13 = f12;
                            i5 = i20222;
                            f14 = 0.0f;
                            if (i14 != i5) {
                            }
                            TransitionParams transitionParams6222 = this.transitionParams;
                            if (transitionParams6222 != null) {
                            }
                            if (f5 == 0.0f) {
                            }
                            i7 = i4;
                            if (this.skipPoints[i19]) {
                            }
                            if (i19 != i2) {
                            }
                            this.skipPoints[i19] = false;
                            if (i14 == i7) {
                            }
                            i8 = i14;
                            f17 = f15 + f10;
                            z2 = z3222;
                        }
                    } else {
                        f8 = f27;
                        f9 = f28;
                        f17 = f35;
                        f2 = f31;
                        i6 = max;
                        i2 = i16;
                        f3 = centerX;
                        i3 = i15;
                        i8 = i14;
                        int i21 = min;
                        f11 = centerY;
                        i7 = i21;
                    }
                    i19++;
                    f35 = f17;
                    i14 = i8;
                    centerX = f3;
                    i15 = i3;
                    f31 = f2;
                    f28 = f9;
                    max = i6;
                    i16 = i2;
                    f27 = f8;
                    float f57 = f11;
                    min = i7;
                    centerY = f57;
                }
                i10 = 0;
                i14++;
                centerX = centerX;
                i = i18;
                f = f34;
                f31 = f31;
                min = min;
                centerY = centerY;
            }
            int i22 = i;
            canvas.save();
            canvas.clipRect(f31, BaseChartView.SIGNATURE_TEXT_HEIGHT, f32, getMeasuredHeight() - this.chartBottom);
            if (z2) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size = this.lines.size() - 1; size >= 0; size--) {
                LineViewData lineViewData3 = (LineViewData) this.lines.get(size);
                lineViewData3.paint.setAlpha(i22);
                canvas.drawPath(lineViewData3.chartPath, lineViewData3.paint);
                lineViewData3.paint.setAlpha(NotificationCenter.closeOtherAppActivities);
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

    @Override // org.telegram.ui.Charts.BaseChartView
    protected void drawPickerChart(Canvas canvas) {
        long j;
        LineViewData lineViewData;
        float f;
        float f2;
        int i;
        boolean z;
        long j2;
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
            boolean z2 = false;
            for (int i4 = 0; i4 < i3; i4++) {
                float f3 = 0.0f;
                int i5 = 0;
                float f4 = 0.0f;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    j = 0;
                    if (i5 >= this.lines.size()) {
                        break;
                    }
                    LineViewData lineViewData2 = (LineViewData) this.lines.get(i5);
                    if (lineViewData2.enabled || lineViewData2.alpha != f3) {
                        long j3 = ((StackLinearChartData) this.chartData).simplifiedY[i5][i4];
                        if (j3 > 0) {
                            f4 += j3 * lineViewData2.alpha;
                            i6++;
                        }
                        i7 = i5;
                    }
                    i5++;
                    f3 = 0.0f;
                }
                int i8 = i3 - 1;
                float f5 = (i4 / i8) * this.pickerWidth;
                int i9 = 0;
                float f6 = 0.0f;
                while (i9 < this.lines.size()) {
                    LineViewData lineViewData3 = (LineViewData) this.lines.get(i9);
                    if (lineViewData3.enabled || lineViewData3.alpha != 0.0f) {
                        if (i6 == 1) {
                            lineViewData = lineViewData3;
                            if (((StackLinearChartData) this.chartData).simplifiedY[i9][i4] != j) {
                                f = lineViewData.alpha;
                                f2 = 0.0f;
                            }
                            f2 = 0.0f;
                            f = 0.0f;
                        } else {
                            lineViewData = lineViewData3;
                            if (f4 != 0.0f) {
                                f = (((StackLinearChartData) this.chartData).simplifiedY[i9][i4] * lineViewData.alpha) / f4;
                                f2 = 0.0f;
                            }
                            f2 = 0.0f;
                            f = 0.0f;
                        }
                        if (f == f2 && i9 == i7) {
                            z2 = true;
                        }
                        float f7 = this.pikerHeight;
                        float f8 = f * f7;
                        float f9 = (f7 - f8) - f6;
                        i = i3;
                        if (i4 == 0) {
                            z = z2;
                            lineViewData.chartPathPicker.moveTo(0.0f, f7);
                            this.skipPoints[i9] = false;
                        } else {
                            z = z2;
                        }
                        long[] jArr = ((StackLinearChartData) this.chartData).simplifiedY[i9];
                        j2 = 0;
                        if (jArr[i4] == 0 && i4 > 0 && jArr[i4 - 1] == 0 && i4 < i8 && jArr[i4 + 1] == 0) {
                            if (!this.skipPoints[i9]) {
                                lineViewData.chartPathPicker.lineTo(f5, this.pikerHeight);
                            }
                            this.skipPoints[i9] = true;
                        } else {
                            if (this.skipPoints[i9]) {
                                lineViewData.chartPathPicker.lineTo(f5, this.pikerHeight);
                            }
                            lineViewData.chartPathPicker.lineTo(f5, f9);
                            this.skipPoints[i9] = false;
                        }
                        if (i4 == i8) {
                            lineViewData.chartPathPicker.lineTo(this.pickerWidth, this.pikerHeight);
                        }
                        f6 += f8;
                        z2 = z;
                    } else {
                        i = i3;
                        j2 = j;
                    }
                    i9++;
                    j = j2;
                    i3 = i;
                }
            }
            if (z2) {
                canvas.drawColor(Theme.getColor(Theme.key_statisticChartLineEmpty));
            }
            for (int size2 = this.lines.size() - 1; size2 >= 0; size2--) {
                LineViewData lineViewData4 = (LineViewData) this.lines.get(size2);
                canvas.drawPath(lineViewData4.chartPathPicker, lineViewData4.paint);
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

    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142  */
    @Override // org.telegram.ui.Charts.BaseChartView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fillTransitionParams(TransitionParams transitionParams) {
        float f;
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
        int i = 2;
        int i2 = 1;
        int i3 = ((int) (f6 / (fArr.length < 2 ? 1.0f : fArr[1] * f5))) + 1;
        int max = Math.max(0, (this.startXIndex - i3) - 1);
        int min = Math.min(((StackLinearChartData) this.chartData).xPercentage.length - 1, this.endXIndex + i3 + 1);
        this.transitionParams.startX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.startY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endX = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.endY = new float[((StackLinearChartData) this.chartData).lines.size()];
        this.transitionParams.angle = new float[((StackLinearChartData) this.chartData).lines.size()];
        int i4 = 0;
        while (i4 < i) {
            int i5 = i4 == i2 ? min : max;
            float f8 = 0.0f;
            float f9 = 0.0f;
            int i6 = 0;
            for (int i7 = 0; i7 < this.lines.size(); i7++) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i7);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    long j = lineViewData.line.y[i5];
                    if (j > 0) {
                        f9 += j * lineViewData.alpha;
                        i6++;
                    }
                }
            }
            int i8 = 0;
            int i9 = 0;
            while (i8 < this.lines.size()) {
                LineViewData lineViewData2 = (LineViewData) this.lines.get(i8);
                if (lineViewData2.enabled || lineViewData2.alpha != f8) {
                    long[] jArr = lineViewData2.line.y;
                    if (i6 == 1) {
                        if (jArr[i5] != 0) {
                            f = lineViewData2.alpha;
                            float f10 = (((StackLinearChartData) this.chartData).xPercentage[i5] * f5) - f7;
                            float measuredHeight = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            float f11 = i9;
                            float measuredHeight2 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight) - f11;
                            i9 = (int) (f11 + measuredHeight);
                            if (i4 != 0) {
                                TransitionParams transitionParams2 = this.transitionParams;
                                transitionParams2.startX[i8] = f10;
                                transitionParams2.startY[i8] = measuredHeight2;
                            } else {
                                TransitionParams transitionParams3 = this.transitionParams;
                                transitionParams3.endX[i8] = f10;
                                transitionParams3.endY[i8] = measuredHeight2;
                            }
                        }
                        f = 0.0f;
                        float f102 = (((StackLinearChartData) this.chartData).xPercentage[i5] * f5) - f7;
                        float measuredHeight3 = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                        float f112 = i9;
                        float measuredHeight22 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight3) - f112;
                        i9 = (int) (f112 + measuredHeight3);
                        if (i4 != 0) {
                        }
                    } else {
                        if (f9 != f8) {
                            f = (jArr[i5] * lineViewData2.alpha) / f9;
                            float f1022 = (((StackLinearChartData) this.chartData).xPercentage[i5] * f5) - f7;
                            float measuredHeight32 = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                            float f1122 = i9;
                            float measuredHeight222 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight32) - f1122;
                            i9 = (int) (f1122 + measuredHeight32);
                            if (i4 != 0) {
                            }
                        }
                        f = 0.0f;
                        float f10222 = (((StackLinearChartData) this.chartData).xPercentage[i5] * f5) - f7;
                        float measuredHeight322 = f * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT);
                        float f11222 = i9;
                        float measuredHeight2222 = ((getMeasuredHeight() - this.chartBottom) - measuredHeight322) - f11222;
                        i9 = (int) (f11222 + measuredHeight322);
                        if (i4 != 0) {
                        }
                    }
                }
                i8++;
                f8 = 0.0f;
            }
            i4++;
            i = 2;
            i2 = 1;
        }
    }
}
