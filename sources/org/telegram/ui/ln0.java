package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln0 implements org.telegram.ui.Components.w51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ff b;

    public /* synthetic */ ln0(org.telegram.messenger.ff ffVar, int i7) {
        this.a = i7;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void a(org.telegram.ui.Components.bz bzVar) {
        int i7 = this.a;
        org.telegram.messenger.ff ffVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                bzVar.d(new org.telegram.ui.ActionBar.i5(ffVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                bzVar.d(new org.telegram.ui.ActionBar.i5(ffVar));
                break;
        }
    }
}
