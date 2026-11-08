package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements org.telegram.ui.Components.g51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.hf b;

    public /* synthetic */ en0(org.telegram.messenger.hf hfVar, int i7) {
        this.a = i7;
        this.b = hfVar;
    }

    @Override // org.telegram.ui.Components.g51
    public final void a(org.telegram.ui.Components.sy syVar) {
        int i7 = this.a;
        org.telegram.messenger.hf hfVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                syVar.d(new org.telegram.ui.Components.n(hfVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                syVar.d(new org.telegram.ui.Components.n(hfVar));
                break;
        }
    }
}
