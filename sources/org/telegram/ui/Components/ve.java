package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ve implements v61, sj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ ve(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ValueAnimator valueAnimator = chatActivityEnterView.C5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.E5 = 0.0f;
        chatActivityEnterView.D5 = 0.0f;
        rh0 rh0Var = chatActivityEnterView.h1;
        if (rh0Var != null) {
            rh0Var.setRotation(0.0f);
            chatActivityEnterView.h1.setPivotX(r2.getWidth() / 2.0f);
            chatActivityEnterView.h1.setPivotY(r2.getHeight() / 2.0f);
            if (chatActivityEnterView.h1.getAnimatedDrawable() == chatActivityEnterView.A5) {
                chatActivityEnterView.h1.setProgress(0.0f);
            }
        }
        mf mfVar = chatActivityEnterView.z5;
        chatActivityEnterView.z5 = null;
        if (mfVar != null) {
            mfVar.run();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        if (!(view instanceof ki.w)) {
            return false;
        }
        String str = ((ki.w) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.n0.c();
        return true;
    }
}
