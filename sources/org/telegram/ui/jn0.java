package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements org.telegram.ui.Components.u51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ff b;

    public /* synthetic */ jn0(org.telegram.messenger.ff ffVar, int i7) {
        this.a = i7;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.Components.u51
    public final void a(org.telegram.ui.Components.cz czVar) {
        int i7 = this.a;
        org.telegram.messenger.ff ffVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                czVar.d(new org.telegram.ui.Cells.b5(ffVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                czVar.d(new org.telegram.ui.Cells.b5(ffVar));
                break;
        }
    }
}
