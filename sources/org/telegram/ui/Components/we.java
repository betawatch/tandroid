package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class we implements w61, sj0 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ we(ChatActivityEnterView chatActivityEnterView) {
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
        qh0 qh0Var = chatActivityEnterView.h1;
        if (qh0Var != null) {
            qh0Var.setRotation(0.0f);
            chatActivityEnterView.h1.setPivotX(r2.getWidth() / 2.0f);
            chatActivityEnterView.h1.setPivotY(r2.getHeight() / 2.0f);
            if (chatActivityEnterView.h1.getAnimatedDrawable() == chatActivityEnterView.A5) {
                chatActivityEnterView.h1.setProgress(0.0f);
            }
        }
        xd xdVar = chatActivityEnterView.z5;
        chatActivityEnterView.z5 = null;
        if (xdVar != null) {
            xdVar.run();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
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
