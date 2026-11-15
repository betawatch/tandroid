package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class le extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ le(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7) {
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
                if (animator.equals(chatActivityEnterView.a3)) {
                    chatActivityEnterView.a3 = null;
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
        je jeVar;
        int i7 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (i7) {
            case 0:
                if (chatActivityEnterView.K6) {
                    chatActivityEnterView.e2.setVisibility(this.b ? 0 : 8);
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    int i10 = ChatActivityEnterView.N6;
                    chatActivityEnterView.s(1.0f);
                }
                chatActivityEnterView.R0.setRotation(0.0f);
                chatActivityEnterView.H5 = false;
                lg lgVar = chatActivityEnterView.Z0;
                if (lgVar != null) {
                    lgVar.setScaleX(1.0f);
                    chatActivityEnterView.Z0.setScaleY(1.0f);
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.v2;
                if (recordCircle != null) {
                    recordCircle.P = false;
                    recordCircle.invalidate();
                }
                nu0 nu0Var = chatActivityEnterView.x5;
                if (nu0Var != null) {
                    nu0Var.a();
                }
                Bitmap bitmap = chatActivityEnterView.y5;
                if (bitmap != null) {
                    bitmap.recycle();
                    chatActivityEnterView.y5 = null;
                    break;
                }
                break;
            case 2:
                if (animator.equals(chatActivityEnterView.a3)) {
                    chatActivityEnterView.X1.setVisibility(8);
                    if (this.b && (jeVar = chatActivityEnterView.r2) != null) {
                        jeVar.setVisibility(8);
                    }
                    chatActivityEnterView.a3 = null;
                    break;
                }
                break;
            case 3:
                chatActivityEnterView.u2 = null;
                if (!this.b) {
                    chatActivityEnterView.r2.setVisibility(8);
                    break;
                }
                break;
            default:
                chatActivityEnterView.x0 = this.b ? 1.0f : 0.0f;
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    sfVar.Z();
                    break;
                }
                break;
        }
    }

    public le(ChatActivityEnterView chatActivityEnterView) {
        this.a = 1;
        this.c = chatActivityEnterView;
    }
}
