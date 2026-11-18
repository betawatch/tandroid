package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ve implements s61, qj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ve(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ValueAnimator valueAnimator = chatActivityEnterView.A5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.C5 = 0.0f;
        chatActivityEnterView.B5 = 0.0f;
        ph0 ph0Var = chatActivityEnterView.h1;
        if (ph0Var != null) {
            ph0Var.setRotation(0.0f);
            chatActivityEnterView.h1.setPivotX(r2.getWidth() / 2.0f);
            chatActivityEnterView.h1.setPivotY(r2.getHeight() / 2.0f);
            if (chatActivityEnterView.h1.getAnimatedDrawable() == chatActivityEnterView.y5) {
                chatActivityEnterView.h1.setProgress(0.0f);
            }
        }
        org.telegram.ui.ci ciVar = chatActivityEnterView.x5;
        chatActivityEnterView.x5 = null;
        if (ciVar != null) {
            ciVar.run();
        }
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        if (!(view instanceof ki.x)) {
            return false;
        }
        String str = ((ki.x) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.n0.c();
        return true;
    }
}
