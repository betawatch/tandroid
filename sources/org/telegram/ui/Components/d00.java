package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d00 extends FrameLayout {
    public final RectF a;
    public final /* synthetic */ FragmentContextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.b = fragmentContextView;
        this.a = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.b;
        org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
        g6 g6Var = fragmentContextView.k0;
        if (fragmentContextView.V == 4 && fragmentContextView.i0) {
            int L = org.telegram.messenger.g0.L(24.0f) + ((int) Math.ceil(g6Var.c()));
            if (L != fragmentContextView.g0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.e0 = linearGradient;
                fragmentContextView.d0.setShader(linearGradient);
                fragmentContextView.g0 = L;
            }
            org.telegram.messenger.r3 groupCall = fragmentContextView.n.getGroupCall();
            if (d2Var == null || groupCall == null || !groupCall.j()) {
                f10 = 0.0f;
            } else {
                long currentTimeMillis = (groupCall.b.schedule_date * 1000) - d2Var.getConnectionsManager().getCurrentTimeMillis();
                f10 = currentTimeMillis >= 0 ? currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f : 1.0f;
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            }
            fragmentContextView.f0.reset();
            fragmentContextView.f0.postTranslate((-fragmentContextView.g0) * 0.7f * f10, 0.0f);
            fragmentContextView.e0.setLocalMatrix(fragmentContextView.f0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float f11 = measuredWidth;
            float f12 = L2;
            float L3 = org.telegram.messenger.g0.L(28.0f) + L2;
            RectF rectF = this.a;
            rectF.set(f11, f12, measuredWidth + L, L3);
            canvas.save();
            float a10 = fragmentContextView.l0.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.g0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), fragmentContextView.d0);
            canvas.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            g6Var.setBounds(0, 0, org.telegram.messenger.g0.q.x, org.telegram.messenger.g0.L(16.0f));
            g6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ig igVar;
        org.telegram.messenger.r3 groupCall;
        FragmentContextView fragmentContextView = this.b;
        if (fragmentContextView.V == 4 && fragmentContextView.i0 && fragmentContextView.l0 != null) {
            boolean contains = this.a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.l0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.l0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    c00 c00Var = fragmentContextView.n0;
                    org.telegram.ui.ActionBar.d2 d2Var = fragmentContextView.h;
                    if (d2Var != null && (igVar = fragmentContextView.n) != null && (groupCall = igVar.getGroupCall()) != null && groupCall.b != null) {
                        if (fragmentContextView.T0 != 0) {
                            d2Var.getConnectionsManager().cancelRequest(fragmentContextView.T0, true);
                            fragmentContextView.T0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.a);
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        boolean z10 = !fragmentContextView.j0;
                        fragmentContextView.j0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.T0 = d2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.m0) {
                            org.telegram.messenger.g0.r(c00Var);
                            fragmentContextView.m0 = false;
                        }
                        c00Var.run();
                        fc a02 = fc.a0(d2Var);
                        boolean z11 = fragmentContextView.j0;
                        org.telegram.messenger.k5.o(null, z11 ? 2131748788 : 2131748789, a02, z11 ? R.raw.silent_unmute : R.raw.silent_mute, 36);
                    }
                }
                fragmentContextView.l0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.l0.c(false);
            }
        } else {
            gc gcVar = fragmentContextView.l0;
            if (gcVar != null) {
                gcVar.c(false);
            }
        }
        gc gcVar2 = fragmentContextView.l0;
        return (gcVar2 != null && gcVar2.i) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.b;
        x8 x8Var = fragmentContextView.c0;
        if (x8Var == null || x8Var.getVisibility() != 0) {
            return;
        }
        fragmentContextView.c0.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b.k0 || super.verifyDrawable(drawable);
    }
}
