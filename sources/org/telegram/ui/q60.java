package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class q60 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ int X2;
    public final /* synthetic */ Object Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q60(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.X2 = i10;
        this.Y2 = obj;
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean H0(View view, float f7, float f10) {
        switch (this.X2) {
            case 3:
                ((yh.s0) this.Y2).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public Integer W0(int i10) {
        int i11;
        switch (this.X2) {
            case 2:
                i11 = ((SessionsActivity) this.Y2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.e6 e6Var = this.p2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.p7, e6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, e6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.X2) {
            case 0:
                super.dispatchDraw(canvas);
                s60 s60Var = (s60) this.Y2;
                if (s60Var.z0 != null && s60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = s60Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.n2) s60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    s60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                zp0 zp0Var = (zp0) this.Y2;
                Paint paint = zp0Var.w;
                RectF rectF = zp0Var.s;
                RectF rectF2 = zp0Var.r;
                RectF rectF3 = zp0Var.n;
                s4.c0 c0Var = zp0Var.b;
                if (!zp0Var.f.isEmpty()) {
                    float d = zp0Var.e.d(zp0Var.d, false);
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
                        paint.setColor(zp0Var.x);
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
        switch (this.X2) {
            case 1:
                super.invalidate();
                kp0 kp0Var = ((zp0) this.Y2).F;
                if (kp0Var != null) {
                    kp0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.X2) {
            case 3:
                yh.s0 s0Var = (yh.s0) this.Y2;
                s0Var.s();
                super.onLayout(z10, i10, i11, i12, i13);
                s0Var.Q(2);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.X2 = 2;
        this.Y2 = sessionsActivity;
    }
}
