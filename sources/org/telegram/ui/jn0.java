package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements org.telegram.ui.Components.x51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.gf b;

    public /* synthetic */ jn0(org.telegram.messenger.gf gfVar, int i7) {
        this.a = i7;
        this.b = gfVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final void a(org.telegram.ui.Components.ez ezVar) {
        int i7 = this.a;
        org.telegram.messenger.gf gfVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                ezVar.d(new org.telegram.ui.Cells.c5(gfVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                ezVar.d(new org.telegram.ui.Cells.c5(gfVar));
                break;
        }
    }
}
