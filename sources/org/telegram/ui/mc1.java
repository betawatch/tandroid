package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mc1 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc1(uf.d dVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.c = dVar;
        this.b = viewGroup;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        switch (this.a) {
            case 1:
                Path path = (Path) this.b;
                qh.y4 y4Var = (qh.y4) this.c;
                if (y4Var.h == null || (!((z4 = y4Var.f) && view == y4Var.d) && (z4 || view != y4Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z4 ? y4Var.e : 1.0f - y4Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 0:
                super.invalidate();
                org.telegram.ui.ActionBar.r0 r0Var = ((jd1) this.c).q0;
                if (r0Var != null) {
                    r0Var.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.b;
                jd1 jd1Var = (jd1) this.c;
                if (!AndroidUtilities.usingHardwareInput) {
                    getLocationInWindow(iArr);
                    if (jd1Var.p0.getTranslationY() != iArr[1]) {
                        jd1Var.p0.setTranslationY(-r6);
                        jd1Var.q0.invalidate();
                    }
                    if (SystemClock.elapsedRealtime() < jd1Var.M) {
                        invalidate();
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 2:
                ViewGroup viewGroup = (ViewGroup) this.b;
                uf.d dVar = (uf.d) this.c;
                if (!dVar.H || !dVar.G) {
                    int size = View.MeasureSpec.getSize(i11);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int dp = AndroidUtilities.dp(50.0f);
                    int dp2 = dVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + dp;
                    if (!dVar.B && !dVar.w) {
                        dp2 += dp;
                    }
                    int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp2 < paddingTop ? paddingTop - dp2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc1(Context context, jd1 jd1Var) {
        super(context);
        this.c = jd1Var;
        this.b = new int[2];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc1(qh.y4 y4Var, Context context) {
        super(context);
        this.c = y4Var;
        this.b = new Path();
    }
}
