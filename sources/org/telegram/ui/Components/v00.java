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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v00 extends FrameLayout {
    public final RectF a;
    public final /* synthetic */ FragmentContextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.b = fragmentContextView;
        this.a = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.b;
        org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
        e6 e6Var = fragmentContextView.j0;
        if (fragmentContextView.U == 4 && fragmentContextView.h0) {
            int L = org.telegram.messenger.i0.L(24.0f) + ((int) Math.ceil(e6Var.c()));
            if (L != fragmentContextView.f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.d0 = linearGradient;
                fragmentContextView.c0.setShader(linearGradient);
                fragmentContextView.f0 = L;
            }
            org.telegram.messenger.u3 groupCall = fragmentContextView.n.getGroupCall();
            if (k2Var == null || groupCall == null || !groupCall.j()) {
                f7 = 0.0f;
            } else {
                long currentTimeMillis = (groupCall.b.schedule_date * 1000) - k2Var.getConnectionsManager().getCurrentTimeMillis();
                f7 = currentTimeMillis >= 0 ? currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f : 1.0f;
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            }
            fragmentContextView.e0.reset();
            fragmentContextView.e0.postTranslate((-fragmentContextView.f0) * 0.7f * f7, 0.0f);
            fragmentContextView.d0.setLocalMatrix(fragmentContextView.e0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.i0.L(10.0f);
            int L2 = org.telegram.messenger.i0.L(10.0f);
            float f10 = measuredWidth;
            float f11 = L2;
            float L3 = org.telegram.messenger.i0.L(28.0f) + L2;
            RectF rectF = this.a;
            rectF.set(f10, f11, measuredWidth + L, L3);
            canvas.save();
            float a2 = fragmentContextView.k0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.i0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), fragmentContextView.c0);
            canvas.translate(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(6.0f));
            e6Var.setBounds(0, 0, org.telegram.messenger.i0.q.x, org.telegram.messenger.i0.L(16.0f));
            e6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        gg ggVar;
        org.telegram.messenger.u3 groupCall;
        FragmentContextView fragmentContextView = this.b;
        if (fragmentContextView.U == 4 && fragmentContextView.h0 && fragmentContextView.k0 != null) {
            boolean contains = this.a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    u00 u00Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.k2 k2Var = fragmentContextView.h;
                    if (k2Var != null && (ggVar = fragmentContextView.n) != null && (groupCall = ggVar.getGroupCall()) != null && groupCall.b != null) {
                        if (fragmentContextView.S0 != 0) {
                            k2Var.getConnectionsManager().cancelRequest(fragmentContextView.S0, true);
                            fragmentContextView.S0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.a);
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        boolean z10 = !fragmentContextView.i0;
                        fragmentContextView.i0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.S0 = k2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.l0) {
                            org.telegram.messenger.i0.r(u00Var);
                            fragmentContextView.l0 = false;
                        }
                        u00Var.run();
                        cc a02 = cc.a0(k2Var);
                        boolean z11 = fragmentContextView.i0;
                        org.telegram.messenger.m5.n(null, z11 ? 2131748790 : 2131748791, a02, z11 ? R.raw.silent_unmute : R.raw.silent_mute, 36);
                    }
                }
                fragmentContextView.k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.k0.c(false);
            }
        } else {
            dc dcVar = fragmentContextView.k0;
            if (dcVar != null) {
                dcVar.c(false);
            }
        }
        dc dcVar2 = fragmentContextView.k0;
        return (dcVar2 != null && dcVar2.i) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.b;
        u8 u8Var = fragmentContextView.b0;
        if (u8Var == null || u8Var.getVisibility() != 0) {
            return;
        }
        fragmentContextView.b0.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b.j0 || super.verifyDrawable(drawable);
    }
}
