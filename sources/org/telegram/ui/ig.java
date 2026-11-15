package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.m60 b;

    public /* synthetic */ ig(org.telegram.ui.Components.m60 m60Var, int i7) {
        this.a = i7;
        this.b = m60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Components.m60 m60Var = this.b;
        switch (i7) {
            case 0:
                m60Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                m60Var.s();
                break;
        }
    }
}
