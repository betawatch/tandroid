package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class p60 extends org.telegram.ui.Components.zl0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ Object f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p60(Object obj, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.e3 = i10;
        this.f3 = obj;
    }

    @Override // org.telegram.ui.Components.zl0
    public boolean I0(View view, float f7, float f10) {
        switch (this.e3) {
            case 3:
                ((yh.t0) this.f3).getClass();
                return true;
            default:
                return super.I0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.zl0
    public Integer W0(int i10) {
        int i11;
        switch (this.e3) {
            case 2:
                i11 = ((SessionsActivity) this.f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.d6 d6Var = this.p2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.p7, d6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, d6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.e3) {
            case 0:
                super.dispatchDraw(canvas);
                r60 r60Var = (r60) this.f3;
                if (r60Var.z0 != null && r60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = r60Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) r60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    r60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                vp0 vp0Var = (vp0) this.f3;
                Paint paint = vp0Var.w;
                RectF rectF = vp0Var.s;
                RectF rectF2 = vp0Var.r;
                RectF rectF3 = vp0Var.n;
                s4.c0 c0Var = vp0Var.b;
                if (!vp0Var.f.isEmpty()) {
                    float d = vp0Var.e.d(vp0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), r6.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), r6.size() - 1, 0);
                    View m10 = c0Var.m(clamp);
                    View m11 = c0Var.m(clamp2);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF2.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(vp0Var.x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e3) {
            case 1:
                super.invalidate();
                gp0 gp0Var = ((vp0) this.f3).F;
                if (gp0Var != null) {
                    gp0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.e3) {
            case 3:
                ((yh.t0) this.f3).s();
                super.onLayout(z10, i10, i11, i12, i13);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.e3 = 2;
        this.f3 = sessionsActivity;
    }
}
