package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ue extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ue(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
        this.a = i7;
        this.c = chatActivityEnterView;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
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
        se seVar;
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.p7) {
                    chatActivityEnterView.m2.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    int i10 = ChatActivityEnterView.s7;
                    chatActivityEnterView.u(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.P5 = false;
                wg wgVar = chatActivityEnterView.Z0;
                if (wgVar != null) {
                    wgVar.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                yu0 yu0Var = chatActivityEnterView.F5;
                if (yu0Var != null) {
                    yu0Var.a();
                }
                Bitmap bitmap = chatActivityEnterView.G5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.G5 = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(chatActivityEnterView.i3)) {
                    chatActivityEnterView.f2.setVisibility(8);
                    if (this.b && (seVar = chatActivityEnterView.z2) != null) {
                        seVar.setVisibility(8);
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
                fg fgVar = chatActivityEnterView.V0;
                if (fgVar != null) {
                    fgVar.Z();
                    break;
                }
                break;
        }
    }

    public ue(ChatActivityEnterView chatActivityEnterView) {
        this.a = 1;
        this.c = chatActivityEnterView;
    }
}
