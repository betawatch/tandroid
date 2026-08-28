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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b10 extends FrameLayout {
    public final RectF a;
    public final /* synthetic */ FragmentContextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.b = fragmentContextView;
        this.a = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        i6 i6Var = fragmentContextView.e0;
        if (fragmentContextView.P == 4 && fragmentContextView.c0) {
            int dp = AndroidUtilities.dp(24.0f) + ((int) Math.ceil(i6Var.d()));
            if (dp != fragmentContextView.a0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.V = linearGradient;
                fragmentContextView.U.setShader(linearGradient);
                fragmentContextView.a0 = dp;
            }
            ChatObject.Call groupCall = fragmentContextView.n.getGroupCall();
            if (o2Var == null || groupCall == null || !groupCall.isScheduled()) {
                f10 = 0.0f;
            } else {
                long currentTimeMillis = (groupCall.call.schedule_date * 1000) - o2Var.getConnectionsManager().getCurrentTimeMillis();
                f10 = currentTimeMillis >= 0 ? currentTimeMillis < 5000 ? 1.0f - (currentTimeMillis / 5000.0f) : 0.0f : 1.0f;
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            }
            fragmentContextView.W.reset();
            fragmentContextView.W.postTranslate((-fragmentContextView.a0) * 0.7f * f10, 0.0f);
            fragmentContextView.V.setLocalMatrix(fragmentContextView.W);
            int measuredWidth = (getMeasuredWidth() - dp) - AndroidUtilities.dp(10.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            float f11 = measuredWidth;
            float f12 = dp2;
            float dp3 = AndroidUtilities.dp(28.0f) + dp2;
            RectF rectF = this.a;
            rectF.set(f11, f12, measuredWidth + dp, dp3);
            canvas.save();
            float a2 = fragmentContextView.f0.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.translate(f11, f12);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, dp, AndroidUtilities.dp(28.0f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), fragmentContextView.U);
            canvas.translate(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
            i6Var.setBounds(0, 0, AndroidUtilities.displaySize.x, AndroidUtilities.dp(16.0f));
            i6Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rg rgVar;
        ChatObject.Call groupCall;
        FragmentContextView fragmentContextView = this.b;
        if (fragmentContextView.P == 4 && fragmentContextView.c0 && fragmentContextView.f0 != null) {
            boolean contains = this.a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.f0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.f0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    a10 a10Var = fragmentContextView.h0;
                    org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
                    if (o2Var != null && (rgVar = fragmentContextView.n) != null && (groupCall = rgVar.getGroupCall()) != null && groupCall.call != null) {
                        if (fragmentContextView.E0 != 0) {
                            o2Var.getConnectionsManager().cancelRequest(fragmentContextView.E0, true);
                            fragmentContextView.E0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.getInputGroupCall();
                        TLRPC.GroupCall groupCall2 = groupCall.call;
                        boolean z10 = !fragmentContextView.d0;
                        fragmentContextView.d0 = z10;
                        groupCall2.schedule_start_subscribed = z10;
                        togglegroupcallstartsubscription.subscribed = z10;
                        fragmentContextView.E0 = o2Var.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.g0) {
                            AndroidUtilities.cancelRunOnUIThread(a10Var);
                            fragmentContextView.g0 = false;
                        }
                        a10Var.run();
                        oc a02 = oc.a0(o2Var);
                        boolean z11 = fragmentContextView.d0;
                        org.telegram.messenger.l0.p(z11 ? R.string.LiveStreamWillNotify : R.string.LiveStreamWillNotNotify, a02, z11 ? R.raw.silent_unmute : R.raw.silent_mute, 36);
                    }
                }
                fragmentContextView.f0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.f0.c(false);
            }
        } else {
            pc pcVar = fragmentContextView.f0;
            if (pcVar != null) {
                pcVar.c(false);
            }
        }
        pc pcVar2 = fragmentContextView.f0;
        return (pcVar2 != null && pcVar2.h) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.b;
        c9 c9Var = fragmentContextView.T;
        if (c9Var == null || c9Var.getVisibility() != 0) {
            return;
        }
        fragmentContextView.T.invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b.e0 || super.verifyDrawable(drawable);
    }
}
