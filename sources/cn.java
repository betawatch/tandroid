// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cn extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cn(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                fx0 fx0Var = (fx0) this.c;
                AnimatorSet animatorSet = fx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fx0Var.A0 = null;
                    fx0Var.B0 = (byte) 0;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        long cameraFlipElapsedMs;
        byte b = this.a;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((gn) obj).u(i);
                break;
            case 1:
                ow0 ow0Var = (ow0) obj;
                Paint paint = ow0Var.R;
                paint.setColor(i);
                ow0Var.F();
                ow0Var.f.invalidate();
                cw cwVar = ow0Var.Z0;
                if (cwVar != null) {
                    cwVar.b(gl.B(paint.getColor()) <= 0.721f, false);
                    ow0Var.Z0.setBackgroundColor(paint.getColor());
                }
                ow0Var.K();
                break;
            case 2:
                fx0 fx0Var = (fx0) obj;
                AnimatorSet animatorSet = fx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fx0Var.A0 = null;
                    fx0Var.B0 = (byte) 0;
                    DialogInterface.OnClickListener onClickListener = fx0Var.L;
                    if (onClickListener != null) {
                        onClickListener.onClick(fx0Var, i);
                    }
                    gl.d3(new nv0(this, (byte) 2));
                }
                kk7.e().k(99, 512);
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                cja cjaVar = chatActivityEnterView.c2;
                chatActivityEnterView.q4 = false;
                chatActivityEnterView.r4 = null;
                wx1 wx1Var = chatActivityEnterView.V0;
                if (wx1Var != null) {
                    if (chatActivityEnterView.d7 == null) {
                        wx1Var.getLayoutParams().height = i;
                    }
                    chatActivityEnterView.V0.setLayerType(0, null);
                }
                if (cjaVar != null) {
                    cjaVar.requestLayout();
                    cjaVar.setForeground(null);
                    cjaVar.setWillNotDraw(false);
                }
                if (chatActivityEnterView.p3 && chatActivityEnterView.Q0()) {
                    chatActivityEnterView.W1(0, chatActivityEnterView.V2, true, true);
                }
                av1 av1Var = chatActivityEnterView.s0;
                if (av1Var != null) {
                    av1Var.run();
                    chatActivityEnterView.s0 = null;
                }
                chatActivityEnterView.A4.e();
                break;
            case 4:
                s12 s12Var = (s12) obj;
                gw0 gw0Var = s12Var.n;
                if (gw0Var.getWebView() != null) {
                    gw0Var.getWebView().setScrollY(i);
                }
                if (animator == s12Var.r) {
                    s12Var.r = null;
                    break;
                }
                break;
            case 5:
                q qVar = (q) obj;
                if (i == qVar.v0) {
                    qVar.y.setRotationY(0.0f);
                    qVar.t0 = true;
                    qVar.e0 = null;
                    StringBuilder sb = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = qVar.getCameraFlipElapsedMs();
                    sb.append(cameraFlipElapsedMs);
                    fa4.b(sb.toString());
                    qVar.q();
                    break;
                }
                break;
            case 6:
                ((LaunchActivity) obj).D0(i);
                break;
            case 7:
                sk8 sk8Var = (sk8) obj;
                sk8Var.y = -1;
                sk8Var.w = i;
                sk8Var.s = 0.0f;
                sk8Var.V = null;
                sk8Var.e();
                break;
            case 8:
                np8 np8Var = (np8) obj;
                np8Var.I = null;
                np8Var.Q.e1.delete(i);
                break;
            case 9:
                t29 t29Var = (t29) ((a32) obj).d;
                t29Var.b.remove(i);
                t29Var.d = true;
                t29Var.a.invalidate();
                break;
            case 10:
                vf9 vf9Var = (vf9) obj;
                vf9Var.a0 = i;
                vf9Var.b0 = 0.0f;
                vf9Var.requestLayout();
                vf9Var.invalidate();
                break;
            case 11:
                eh9 eh9Var = (eh9) obj;
                eh9Var.b0 = i;
                eh9Var.c0 = 0.0f;
                View view = eh9Var.W;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            default:
                pda pdaVar = (pda) obj;
                pdaVar.e.S1.remove(i);
                pdaVar.a.invalidate();
                break;
        }
    }
}
