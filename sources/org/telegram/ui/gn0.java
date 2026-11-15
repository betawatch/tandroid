package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements org.telegram.ui.Components.j51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.gf b;

    public /* synthetic */ gn0(org.telegram.messenger.gf gfVar, int i7) {
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
