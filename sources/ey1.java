// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ey1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ey1(ChatActivityEnterView chatActivityEnterView, boolean z, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.c;
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.i3 = null;
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
        cy1 cy1Var;
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                if (chatActivityEnterView.w7) {
                    chatActivityEnterView.m2.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    int i = ChatActivityEnterView.z7;
                    chatActivityEnterView.s(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.O5 = false;
                zz1 zz1Var = chatActivityEnterView.Z0;
                if (zz1Var != null) {
                    zz1Var.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                lta ltaVar = chatActivityEnterView.E5;
                if (ltaVar != null) {
                    ltaVar.a();
                }
                Bitmap bitmap = chatActivityEnterView.F5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.F5 = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.f2.setVisibility(8);
                    if (this.b && (cy1Var = chatActivityEnterView.z2) != null) {
                        cy1Var.setVisibility(8);
                    }
                    chatActivityEnterView.i3 = null;
                    break;
                }
                break;
            case 3:
                chatActivityEnterView.C2 = null;
                if (!this.b) {
                    chatActivityEnterView.z2.setVisibility(8);
                    break;
                }
                break;
            default:
                chatActivityEnterView.x0 = this.b ? 1.0f : 0.0f;
                jz1 jz1Var = chatActivityEnterView.V0;
                if (jz1Var != null) {
                    jz1Var.Z();
                    break;
                }
                break;
        }
    }

    public ey1(ChatActivityEnterView chatActivityEnterView) {
        this.a = (byte) 1;
        this.c = chatActivityEnterView;
    }
}
