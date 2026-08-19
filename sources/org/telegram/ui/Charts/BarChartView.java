package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.BarViewData;
import org.telegram.ui.Charts.view_data.ChartHorizontalLinesData;
import org.telegram.ui.Charts.view_data.TransitionParams;

/* loaded from: classes4.dex */
public class BarChartView extends BaseChartView {
    @Override // org.telegram.ui.Charts.BaseChartView
    protected void drawSelection(Canvas canvas) {
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    protected float getMinDistance() {
        return 0.1f;
    }

    public BarChartView(Context context) {
        super(context);
        this.superDraw = true;
        this.useAlphaSignature = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    @Override // org.telegram.ui.Charts.BaseChartView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void drawChart(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        Canvas canvas2 = canvas;
        ChartData chartData = this.chartData;
        if (chartData != null) {
            float f3 = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f4 = chartPickerDelegate.pickerEnd;
            float f5 = chartPickerDelegate.pickerStart;
            float f6 = f3 / (f4 - f5);
            float f7 = (f5 * f6) - BaseChartView.HORIZONTAL_PADDING;
            char c = 1;
            int i4 = this.startXIndex - 1;
            int i5 = i4 < 0 ? 0 : i4;
            int i6 = this.endXIndex + 1;
            if (i6 > ((ChartData.Line) chartData.lines.get(0)).y.length - 1) {
                i6 = ((ChartData.Line) this.chartData.lines.get(0)).y.length - 1;
            }
            int i7 = i6;
            canvas2.save();
            float f8 = 0.0f;
            canvas2.clipRect(this.chartStart, 0.0f, this.chartEnd, getMeasuredHeight() - this.chartBottom);
            canvas2.save();
            int i8 = this.transitionMode;
            int i9 = 2;
            if (i8 == 2) {
                this.postTransition = true;
                this.selectionA = 0.0f;
                TransitionParams transitionParams = this.transitionParams;
                float f9 = transitionParams.progress;
                f2 = 1.0f - f9;
                canvas2.scale((f9 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
            } else if (i8 == 1) {
                TransitionParams transitionParams2 = this.transitionParams;
                f2 = transitionParams2.progress;
                canvas2.scale(f2, 1.0f, transitionParams2.pX, transitionParams2.pY);
            } else {
                f = 1.0f;
                i = 0;
                while (i < this.lines.size()) {
                    BarViewData barViewData = (BarViewData) this.lines.get(i);
                    if (barViewData.enabled || barViewData.alpha != f8) {
                        float[] fArr = this.chartData.xPercentage;
                        float f10 = fArr.length < i9 ? 1.0f : fArr[c] * f6;
                        long[] jArr = barViewData.line.y;
                        float f11 = barViewData.alpha;
                        i2 = i;
                        int i10 = i5;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        int i11 = 0;
                        boolean z = false;
                        while (i10 <= i7) {
                            float f14 = ((f10 / 2.0f) + (this.chartData.xPercentage[i10] * f6)) - f7;
                            int i12 = i5;
                            float measuredHeight = (getMeasuredHeight() - this.chartBottom) - (((jArr[i10] / this.currentMaxHeight) * f11) * ((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT));
                            if (i10 == this.selectedIndex && this.legendShowing) {
                                f13 = measuredHeight;
                                f12 = f14;
                                z = true;
                            } else {
                                float[] fArr2 = barViewData.linesPath;
                                fArr2[i11] = f14;
                                fArr2[i11 + 1] = measuredHeight;
                                int i13 = i11 + 3;
                                fArr2[i11 + 2] = f14;
                                i11 += 4;
                                fArr2[i13] = getMeasuredHeight() - this.chartBottom;
                            }
                            i10++;
                            i5 = i12;
                        }
                        i3 = i5;
                        Paint paint = (z || this.postTransition) ? barViewData.unselectedPaint : barViewData.paint;
                        paint.setStrokeWidth(f10);
                        if (z) {
                            barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 1.0f - this.selectionA));
                        }
                        if (this.postTransition) {
                            f8 = 0.0f;
                            barViewData.unselectedPaint.setColor(ColorUtils.blendARGB(barViewData.lineColor, barViewData.blendColor, 0.0f));
                        } else {
                            f8 = 0.0f;
                        }
                        int i14 = (int) (255.0f * f);
                        paint.setAlpha(i14);
                        canvas2.drawLines(barViewData.linesPath, 0, i11, paint);
                        if (z) {
                            barViewData.paint.setStrokeWidth(f10);
                            barViewData.paint.setAlpha(i14);
                            canvas2.drawLine(f12, f13, f12, getMeasuredHeight() - this.chartBottom, barViewData.paint);
                            barViewData.paint.setAlpha(NotificationCenter.didReceiveSmsCode);
                        }
                    } else {
                        i2 = i;
                        i3 = i5;
                    }
                    i = i2 + 1;
                    canvas2 = canvas;
                    i5 = i3;
                    c = 1;
                    i9 = 2;
                }
                canvas.restore();
                canvas.restore();
            }
            f = f2;
            i = 0;
            while (i < this.lines.size()) {
            }
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        int measuredHeight = getMeasuredHeight();
        int i5 = BaseChartView.PICKER_PADDING;
        int i6 = measuredHeight - i5;
        int measuredHeight2 = (getMeasuredHeight() - this.pikerHeight) - i5;
        int size = this.lines.size();
        if (this.chartData != null) {
            int i7 = 0;
            while (i7 < size) {
                BarViewData barViewData = (BarViewData) this.lines.get(i7);
                if (barViewData.enabled || barViewData.alpha != 0.0f) {
                    barViewData.bottomLinePath.reset();
                    float[] fArr = this.chartData.xPercentage;
                    int length = fArr.length;
                    float f2 = fArr.length < 2 ? 1.0f : fArr[1] * this.pickerWidth;
                    long[] jArr = barViewData.line.y;
                    float f3 = barViewData.alpha;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length) {
                        long j = jArr[i8];
                        if (j < 0) {
                            i3 = i6;
                            i4 = size;
                        } else {
                            ChartData chartData = this.chartData;
                            i3 = i6;
                            float f4 = chartData.xPercentage[i8] * this.pickerWidth;
                            if (BaseChartView.ANIMATE_PICKER_SIZES) {
                                f = this.pickerMaxHeight;
                                i4 = size;
                            } else {
                                i4 = size;
                                f = chartData.maxValue;
                            }
                            float f5 = (1.0f - ((j / f) * f3)) * (i3 - measuredHeight2);
                            float[] fArr2 = barViewData.linesPath;
                            fArr2[i9] = f4;
                            fArr2[i9 + 1] = f5;
                            int i10 = i9 + 3;
                            fArr2[i9 + 2] = f4;
                            i9 += 4;
                            fArr2[i10] = getMeasuredHeight() - this.chartBottom;
                        }
                        i8++;
                        i6 = i3;
                        size = i4;
                    }
                    i = i6;
                    i2 = size;
                    barViewData.paint.setStrokeWidth(f2 + 2.0f);
                    canvas.drawLines(barViewData.linesPath, 0, i9, barViewData.paint);
                } else {
                    i = i6;
                    i2 = size;
                }
                i7++;
                i6 = i;
                size = i2;
            }
        }
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    public BarViewData createLineViewData(ChartData.Line line) {
        return new BarViewData(line, this.resourcesProvider);
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
}
