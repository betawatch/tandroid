package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class me implements h61, ij0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ me(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    public void a() {
        ChatActivityEnterView chatActivityEnterView = this.a;
        ValueAnimator valueAnimator = chatActivityEnterView.u5;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        chatActivityEnterView.w5 = 0.0f;
        chatActivityEnterView.v5 = 0.0f;
        fh0 fh0Var = chatActivityEnterView.h1;
        if (fh0Var != null) {
            fh0Var.setRotation(0.0f);
            chatActivityEnterView.h1.setPivotX(r2.getWidth() / 2.0f);
            chatActivityEnterView.h1.setPivotY(r2.getHeight() / 2.0f);
            if (chatActivityEnterView.h1.getAnimatedDrawable() == chatActivityEnterView.s5) {
                chatActivityEnterView.h1.setProgress(0.0f);
            }
        }
        od odVar = chatActivityEnterView.r5;
        chatActivityEnterView.r5 = null;
        if (odVar != null) {
            odVar.run();
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        if (!(view instanceof ki.y)) {
            return false;
        }
        String str = ((ki.y) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.n0.c();
        return true;
    }
}
