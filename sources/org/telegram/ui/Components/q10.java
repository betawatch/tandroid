package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q10 extends FrameLayout {
    public final RectF a;
    public final /* synthetic */ FragmentContextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.b = fragmentContextView;
        this.a = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        m6 m6Var = fragmentContextView.i0;
        if (fragmentContextView.T == 4 && fragmentContextView.g0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(m6Var.d()));
            if (dp != fragmentContextView.e0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.c0 = linearGradient;
                fragmentContextView.b0.setShader(linearGradient);
                fragmentContextView.e0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.n.getGroupCall();
            if (o2Var == null || groupCall == null || !groupCall.isScheduled()) {
                f7 = 0.0f;
            } else {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - o2Var.getConnectionsManager().getCurrentTimeMillis();
                f7 = currentTimeMillis >= 0 ? currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f : 1.0f;
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            }
            fragmentContextView.d0.reset();
            fragmentContextView.d0.postTranslate((-fragmentContextView.e0) * 0.7f * f7, 0.0f);
            fragmentContextView.c0.setLocalMatrix(fragmentContextView.d0);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f10 = measuredWidth;
            float f11 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.a;
            rectF.set(f10, f11, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.j0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f10, f11);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.b0);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            m6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            m6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ah ahVar;
        ChatObject.Call groupCall;
        FragmentContextView fragmentContextView = this.b;
        if (fragmentContextView.T == 4 && fragmentContextView.g0 && fragmentContextView.j0 != null) {
            boolean contains = this.a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.j0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.j0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    p10 p10Var = fragmentContextView.l0;
                    org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                    if (o2Var != null && (ahVar = fragmentContextView.n) != null && (groupCall = ahVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.K0 != 0) {
                            o2Var.getConnectionsManager().cancelRequest(fragmentContextView.K0, true);
                            fragmentContextView.K0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.h0;
                        fragmentContextView.h0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.K0 = o2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.k0) {
                            AndroidUtilities.cancelRunOnUIThread(p10Var);
                            fragmentContextView.k0 = false;
                        }
                        p10Var.run();
                        vc a02 = vc.a0(o2Var);
                        boolean z11 = fragmentContextView.h0;
                        org.telegram.messenger.w1.o(z11 ? R.string.LiveStreamWillNotify : R.string.LiveStreamWillNotNotify, a02, z11 ? R.raw.silent_unmute : R.raw.silent_mute, 36);
                    }
                }
                fragmentContextView.j0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.j0.c(false);
            }
        } else {
            wc wcVar = fragmentContextView.j0;
            if (wcVar != null) {
                wcVar.c(false);
            }
        }
        wc wcVar2 = fragmentContextView.j0;
        return (wcVar2 != null && wcVar2.h) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.b;
        i9 i9Var = fragmentContextView.a0;
        if (i9Var == null || i9Var.getVisibility() != 0) {
            return;
        }
        fragmentContextView.a0.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b.i0 || super.verifyDrawable(drawable);
    }
}
