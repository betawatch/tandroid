package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.g3 = null;
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
                if (chatActivityEnterView.k7) {
                    chatActivityEnterView.k2.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    int i10 = ChatActivityEnterView.n7;
                    chatActivityEnterView.u(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.N5 = false;
                ug ugVar = chatActivityEnterView.Z0;
                if (ugVar != null) {
                    ugVar.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                vu0 vu0Var = chatActivityEnterView.D5;
                if (vu0Var != null) {
                    vu0Var.a();
                }
                Bitmap bitmap = chatActivityEnterView.E5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.E5 = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(chatActivityEnterView.g3)) {
                    chatActivityEnterView.d2.setVisibility(8);
                    if (this.b && (seVar = chatActivityEnterView.x2) != null) {
                        seVar.setVisibility(8);
                    }
                    chatActivityEnterView.g3 = null;
                    break;
                }
                break;
            case 3:
                chatActivityEnterView.A2 = null;
                if (!this.b) {
                    chatActivityEnterView.x2.setVisibility(8);
                    break;
                }
                break;
            default:
                chatActivityEnterView.x0 = this.b ? 1.0f : 0.0f;
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    cgVar.Z();
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
