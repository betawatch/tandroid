package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements org.telegram.ui.Components.j51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.gf b;

    public /* synthetic */ fn0(org.telegram.messenger.gf gfVar, int i7) {
        this.a = i7;
        this.b = gfVar;
    }

    @Override // org.telegram.ui.Components.j51
    public final void b(org.telegram.ui.Components.wy wyVar) {
        int i7 = this.a;
        org.telegram.messenger.gf gfVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                wyVar.d(new org.telegram.ui.Components.cf(gfVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                wyVar.d(new org.telegram.ui.Components.cf(gfVar));
                break;
        }
    }
}
