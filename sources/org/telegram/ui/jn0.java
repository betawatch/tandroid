package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                czVar.d(new org.telegram.ui.Cells.c5(ffVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                czVar.d(new org.telegram.ui.Cells.c5(ffVar));
                break;
        }
    }
}
