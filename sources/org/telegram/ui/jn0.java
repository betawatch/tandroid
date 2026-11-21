package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements org.telegram.ui.Components.x51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.ff b;

    public /* synthetic */ jn0(org.telegram.messenger.ff ffVar, int i7) {
        this.a = i7;
        this.b = ffVar;
    }

    @Override // org.telegram.ui.Components.x51
    public final void a(org.telegram.ui.Components.ez ezVar) {
        int i7 = this.a;
        org.telegram.messenger.ff ffVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Z8;
                ezVar.d(new org.telegram.ui.Cells.c5(ffVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Z8;
                ezVar.d(new org.telegram.ui.Cells.c5(ffVar));
                break;
        }
    }
}
