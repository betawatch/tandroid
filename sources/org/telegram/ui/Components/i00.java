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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i00 extends FrameLayout {
    public final RectF a;
    public final /* synthetic */ FragmentContextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.b = fragmentContextView;
        this.a = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.b;
        org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
        i6 i6Var = fragmentContextView.j0;
        if (fragmentContextView.U == 4 && fragmentContextView.h0) {
            int L = org.telegram.messenger.g0.L(24.0f) + ((int) Math.ceil(i6Var.c()));
            if (L != fragmentContextView.f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.d0 = linearGradient;
                fragmentContextView.c0.setShader(linearGradient);
                fragmentContextView.f0 = L;
            }
            org.telegram.messenger.r3 groupCall = fragmentContextView.n.getGroupCall();
            if (f2Var == null || groupCall == null || !groupCall.j()) {
                f10 = 0.0f;
            } else {
                long currentTimeMillis = (groupCall.b.schedule_date * 1000) - f2Var.getConnectionsManager().getCurrentTimeMillis();
                f10 = currentTimeMillis >= 0 ? currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f : 1.0f;
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            }
            fragmentContextView.e0.reset();
            fragmentContextView.e0.postTranslate((-fragmentContextView.f0) * 0.7f * f10, 0.0f);
            fragmentContextView.d0.setLocalMatrix(fragmentContextView.e0);
            int measuredWidth = (getMeasuredWidth() - L) - org.telegram.messenger.g0.L(10.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            float f11 = measuredWidth;
            float f12 = L2;
            float L3 = org.telegram.messenger.g0.L(28.0f) + L2;
            RectF rectF = this.a;
            rectF.set(f11, f12, measuredWidth + L, L3);
            canvas.save();
            float a10 = fragmentContextView.k0.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(0.0f, 0.0f, L, org.telegram.messenger.g0.L(28.0f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), fragmentContextView.c0);
            canvas.translate(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(6.0f));
            i6Var.setBounds(0, 0, org.telegram.messenger.g0.q.x, org.telegram.messenger.g0.L(16.0f));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kg kgVar;
        org.telegram.messenger.r3 groupCall;
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
                    h00 h00Var = fragmentContextView.m0;
                    org.telegram.ui.ActionBar.f2 f2Var = fragmentContextView.h;
                    if (f2Var != null && (kgVar = fragmentContextView.n) != null && (groupCall = kgVar.getGroupCall()) != null && groupCall.b != null) {
                        if (fragmentContextView.S0 != 0) {
                            f2Var.getConnectionsManager().cancelRequest(fragmentContextView.S0, true);
                            fragmentContextView.S0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.g(groupCall.a);
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        boolean z9 = !fragmentContextView.i0;
                        fragmentContextView.i0 = z9;
                        groupCall2.schedule_start_subscribed = z9;
                        togglegroupcallstartsubscription.subscribed = z9;
                        fragmentContextView.S0 = f2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.l0) {
                            org.telegram.messenger.g0.r(h00Var);
                            fragmentContextView.l0 = false;
                        }
                        h00Var.run();
                        hc a02 = hc.a0(f2Var);
                        boolean z10 = fragmentContextView.i0;
                        org.telegram.messenger.k5.o(null, z10 ? 2131748781 : 2131748782, a02, z10 ? R.raw.silent_unmute : R.raw.silent_mute, 36);
                    }
                }
                fragmentContextView.k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.k0.c(false);
            }
        } else {
            ic icVar = fragmentContextView.k0;
            if (icVar != null) {
                icVar.c(false);
            }
        }
        ic icVar2 = fragmentContextView.k0;
        return (icVar2 != null && icVar2.i) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.b;
        z8 z8Var = fragmentContextView.b0;
        if (z8Var == null || z8Var.getVisibility() != 0) {
            return;
        }
        fragmentContextView.b0.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b.j0 || super.verifyDrawable(drawable);
    }
}
