package org.telegram.ui.Charts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Charts.data.ChartData;
import org.telegram.ui.Charts.view_data.LineViewData;
import org.telegram.ui.Charts.view_data.TransitionParams;

/* loaded from: classes4.dex */
public class LinearChartView extends BaseChartView {
    public LinearChartView(Context context) {
        super(context);
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    protected void init() {
        this.useMinHeight = true;
        super.init();
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    protected void drawChart(Canvas canvas) {
        if (this.chartData != null) {
            float f = this.chartWidth;
            ChartPickerDelegate chartPickerDelegate = this.pickerDelegate;
            float f2 = chartPickerDelegate.pickerEnd;
            float f3 = chartPickerDelegate.pickerStart;
            float f4 = f / (f2 - f3);
            float f5 = (f3 * f4) - BaseChartView.HORIZONTAL_PADDING;
            int i = 0;
            int i2 = 0;
            while (i2 < this.lines.size()) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i2);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    float[] fArr = this.chartData.xPercentage;
                    float f6 = fArr.length < 2 ? 0.0f : fArr[1] * f4;
                    long[] jArr = lineViewData.line.y;
                    int i3 = ((int) (BaseChartView.HORIZONTAL_PADDING / f6)) + 1;
                    lineViewData.chartPath.reset();
                    int max = Math.max(i, this.startXIndex - i3);
                    int min = Math.min(this.chartData.xPercentage.length - 1, this.endXIndex + i3);
                    boolean z = true;
                    int i4 = 0;
                    while (max <= min) {
                        long[] jArr2 = jArr;
                        long j = jArr2[max];
                        if (j >= 0) {
                            float f7 = (this.chartData.xPercentage[max] * f4) - f5;
                            float f8 = this.currentMinHeight;
                            float f9 = (j - f8) / (this.currentMaxHeight - f8);
                            float strokeWidth = lineViewData.paint.getStrokeWidth() / 2.0f;
                            float measuredHeight = ((getMeasuredHeight() - this.chartBottom) - strokeWidth) - (f9 * (((getMeasuredHeight() - this.chartBottom) - BaseChartView.SIGNATURE_TEXT_HEIGHT) - strokeWidth));
                            if (BaseChartView.USE_LINES) {
                                if (i4 == 0) {
                                    float[] fArr2 = lineViewData.linesPath;
                                    int i5 = i4 + 1;
                                    fArr2[i4] = f7;
                                    i4 += 2;
                                    fArr2[i5] = measuredHeight;
                                } else {
                                    float[] fArr3 = lineViewData.linesPath;
                                    fArr3[i4] = f7;
                                    fArr3[i4 + 1] = measuredHeight;
                                    int i6 = i4 + 3;
                                    fArr3[i4 + 2] = f7;
                                    i4 += 4;
                                    fArr3[i6] = measuredHeight;
                                }
                            } else if (z) {
                                lineViewData.chartPath.moveTo(f7, measuredHeight);
                                z = false;
                            } else {
                                lineViewData.chartPath.lineTo(f7, measuredHeight);
                            }
                        }
                        max++;
                        jArr = jArr2;
                    }
                    canvas.save();
                    int i7 = this.transitionMode;
                    if (i7 == 2) {
                        TransitionParams transitionParams = this.transitionParams;
                        float f10 = transitionParams.progress;
                        float f11 = f10 > 0.5f ? 0.0f : 1.0f - (f10 * 2.0f);
                        canvas.scale((f10 * 2.0f) + 1.0f, 1.0f, transitionParams.pX, transitionParams.pY);
                        r7 = f11;
                    } else if (i7 == 1) {
                        float f12 = this.transitionParams.progress;
                        float f13 = f12 < 0.3f ? 0.0f : f12;
                        canvas.save();
                        TransitionParams transitionParams2 = this.transitionParams;
                        float f14 = transitionParams2.progress;
                        canvas.scale(f14, transitionParams2.needScaleY ? f14 : 1.0f, transitionParams2.pX, transitionParams2.pY);
                        r7 = f13;
                    } else if (i7 == 3) {
                        r7 = this.transitionParams.progress;
                    }
                    lineViewData.paint.setAlpha((int) (lineViewData.alpha * 255.0f * r7));
                    if (this.endXIndex - this.startXIndex > 100) {
                        lineViewData.paint.setStrokeCap(Paint.Cap.SQUARE);
                    } else {
                        lineViewData.paint.setStrokeCap(Paint.Cap.ROUND);
                    }
                    if (BaseChartView.USE_LINES) {
                        canvas.drawLines(lineViewData.linesPath, 0, i4, lineViewData.paint);
                    } else {
                        canvas.drawPath(lineViewData.chartPath, lineViewData.paint);
                    }
                    canvas.restore();
                }
                i2++;
                i = 0;
            }
        }
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    protected void drawPickerChart(Canvas canvas) {
        int i;
        int i2;
        float f;
        long[] jArr;
        float f2;
        getMeasuredHeight();
        getMeasuredHeight();
        int size = this.lines.size();
        if (this.chartData != null) {
            int i3 = 0;
            while (i3 < size) {
                LineViewData lineViewData = (LineViewData) this.lines.get(i3);
                if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                    lineViewData.bottomLinePath.reset();
                    int length = this.chartData.xPercentage.length;
                    long[] jArr2 = lineViewData.line.y;
                    lineViewData.chartPath.reset();
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length) {
                        long j = jArr2[i4];
                        if (j < 0) {
                            i2 = i3;
                            jArr = jArr2;
                        } else {
                            ChartData chartData = this.chartData;
                            float f3 = chartData.xPercentage[i4] * this.pickerWidth;
                            boolean z = BaseChartView.ANIMATE_PICKER_SIZES;
                            if (z) {
                                i2 = i3;
                                f = this.pickerMaxHeight;
                            } else {
                                i2 = i3;
                                f = chartData.maxValue;
                            }
                            if (z) {
                                f2 = this.pickerMinHeight;
                                jArr = jArr2;
                            } else {
                                jArr = jArr2;
                                f2 = chartData.minValue;
                            }
                            float f4 = (1.0f - ((j - f2) / (f - f2))) * this.pikerHeight;
                            if (BaseChartView.USE_LINES) {
                                if (i5 == 0) {
                                    float[] fArr = lineViewData.linesPathBottom;
                                    int i6 = i5 + 1;
                                    fArr[i5] = f3;
                                    i5 += 2;
                                    fArr[i6] = f4;
                                } else {
                                    float[] fArr2 = lineViewData.linesPathBottom;
                                    fArr2[i5] = f3;
                                    fArr2[i5 + 1] = f4;
                                    int i7 = i5 + 3;
                                    fArr2[i5 + 2] = f3;
                                    i5 += 4;
                                    fArr2[i7] = f4;
                                }
                            } else if (i4 == 0) {
                                lineViewData.bottomLinePath.moveTo(f3, f4);
                            } else {
                                lineViewData.bottomLinePath.lineTo(f3, f4);
                            }
                        }
                        i4++;
                        jArr2 = jArr;
                        i3 = i2;
                    }
                    i = i3;
                    lineViewData.linesPathBottomSize = i5;
                    if (lineViewData.enabled || lineViewData.alpha != 0.0f) {
                        lineViewData.bottomLinePaint.setAlpha((int) (lineViewData.alpha * 255.0f));
                        if (BaseChartView.USE_LINES) {
                            canvas.drawLines(lineViewData.linesPathBottom, 0, lineViewData.linesPathBottomSize, lineViewData.bottomLinePaint);
                        } else {
                            canvas.drawPath(lineViewData.bottomLinePath, lineViewData.bottomLinePaint);
                        }
                        i3 = i + 1;
                    }
                } else {
                    i = i3;
                }
                i3 = i + 1;
            }
        }
    }

    @Override // org.telegram.ui.Charts.BaseChartView
    public LineViewData createLineViewData(ChartData.Line line) {
        return new LineViewData(line, false);
    }
}
