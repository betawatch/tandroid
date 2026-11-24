// default package

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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class op4 extends FrameLayout {
    public final RectF a;
    public final /* synthetic */ FragmentContextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.b = fragmentContextView;
        this.a = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.b;
        d dVar = fragmentContextView.h;
        ho hoVar = fragmentContextView.j0;
        if (fragmentContextView.U == 4 && fragmentContextView.h0) {
            int L = gm.L(24.0f) + ((int) Math.ceil(hoVar.c()));
            if (L != fragmentContextView.f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.d0 = linearGradient;
                fragmentContextView.c0.setShader(linearGradient);
                fragmentContextView.f0 = L;
            }
            qd2 groupCall = fragmentContextView.n.getGroupCall();
            if (dVar == null || groupCall == null || !groupCall.k()) {
                f = 0.0f;
            } else {
                long currentTimeMillis = (groupCall.b.schedule_date * 1000) - dVar.getConnectionsManager().getCurrentTimeMillis();
                f = currentTimeMillis >= 0 ? currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f : 1.0f;
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            }
            fragmentContextView.e0.reset();
            fragmentContextView.e0.postTranslate((-fragmentContextView.f0) * 0.7f * f, 0.0f);
            fragmentContextView.d0.setLocalMatrix(fragmentContextView.e0);
            int measuredWidth = (getMeasuredWidth() - L) - gm.L(10.0f);
            int L2 = gm.L(10.0f);
            float f2 = measuredWidth;
            float f3 = L2;
            float L3 = gm.L(28.0f) + L2;
            RectF rectF = this.a;
            rectF.set(f2, f3, measuredWidth + L, L3);
            canvas.save();
            float a = fragmentContextView.k0.a(0.1f);
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            canvas.translate(f2, f3);
            RectF rectF2 = gm.P;
            rectF2.set(0.0f, 0.0f, L, gm.L(28.0f));
            canvas.drawRoundRect(rectF2, gm.L(16.0f), gm.L(16.0f), fragmentContextView.c0);
            canvas.translate(gm.L(12.0f), gm.L(6.0f));
            hoVar.setBounds(0, 0, gm.q.x, gm.L(16.0f));
            hoVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        f02 f02Var;
        qd2 groupCall;
        int i;
        int i2;
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
                    np4 np4Var = fragmentContextView.m0;
                    d dVar = fragmentContextView.h;
                    if (dVar != null && (f02Var = fragmentContextView.n) != null && (groupCall = f02Var.getGroupCall()) != null && groupCall.b != null) {
                        if (fragmentContextView.S0 != 0) {
                            dVar.getConnectionsManager().cancelRequest(fragmentContextView.S0, true);
                            fragmentContextView.S0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.h(groupCall.a);
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        boolean z = !fragmentContextView.i0;
                        fragmentContextView.i0 = z;
                        groupCall2.schedule_start_subscribed = z;
                        togglegroupcallstartsubscription.subscribed = z;
                        fragmentContextView.S0 = dVar.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.l0) {
                            gm.r(np4Var);
                            fragmentContextView.l0 = false;
                        }
                        np4Var.run();
                        c41 b0 = c41.b0(dVar);
                        if (fragmentContextView.i0) {
                            i = R.raw.silent_unmute;
                            i2 = 2131748537;
                        } else {
                            i = R.raw.silent_mute;
                            i2 = 2131748538;
                        }
                        ts2.u(null, i2, b0, i, 36);
                    }
                }
                fragmentContextView.k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.k0.c(false);
            }
        } else {
            u51 u51Var = fragmentContextView.k0;
            if (u51Var != null) {
                u51Var.c(false);
            }
        }
        u51 u51Var2 = fragmentContextView.k0;
        return (u51Var2 != null && u51Var2.i) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.b;
        hd0 hd0Var = fragmentContextView.b0;
        if (hd0Var == null || hd0Var.getVisibility() != 0) {
            return;
        }
        fragmentContextView.b0.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b.j0 || super.verifyDrawable(drawable);
    }
}
