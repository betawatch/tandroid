package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements org.telegram.ui.Components.g51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.hf b;

    public /* synthetic */ en0(org.telegram.messenger.hf hfVar, int i7) {
        this.a = i7;
        this.b = hfVar;
    }

    @Override // org.telegram.ui.Components.g51
    public final void a(org.telegram.ui.Components.ry ryVar) {
        int i7 = this.a;
        org.telegram.messenger.hf hfVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.n(hfVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.n(hfVar));
                break;
        }
    }
}
