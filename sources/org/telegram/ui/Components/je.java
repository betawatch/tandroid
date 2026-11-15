package org.telegram.ui.Components;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class je extends ImageView {
    public float a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public je(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View
    public final float getTranslationX() {
        return this.a;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        this.a = f10;
        float L = org.telegram.messenger.g0.L(-44.0f) + this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        float f11 = L + chatActivityEnterView.E + chatActivityEnterView.y;
        zd zdVar = chatActivityEnterView.s2;
        float L2 = org.telegram.messenger.g0.L((zdVar == null || zdVar.getVisibility() != 0) ? 0.0f : -44.0f);
        zd zdVar2 = chatActivityEnterView.s2;
        float alpha = (L2 * (zdVar2 == null ? 0.0f : zdVar2.getAlpha())) + f11;
        zd zdVar3 = chatActivityEnterView.f2;
        float L3 = org.telegram.messenger.g0.L((zdVar3 == null || zdVar3.getVisibility() != 0) ? 0.0f : -44.0f);
        zd zdVar4 = chatActivityEnterView.f2;
        super.setTranslationX((L3 * (zdVar4 != null ? zdVar4.getAlpha() : 0.0f)) + alpha);
    }
}
