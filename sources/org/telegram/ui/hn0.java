package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements org.telegram.ui.Components.h51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.hf b;

    public /* synthetic */ hn0(org.telegram.messenger.hf hfVar, int i7) {
        this.a = i7;
        this.b = hfVar;
    }

    @Override // org.telegram.ui.Components.h51
    public final void a(org.telegram.ui.Components.ry ryVar) {
        int i7 = this.a;
        org.telegram.messenger.hf hfVar = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.m(hfVar));
                break;
            default:
                Drawable[] drawableArr2 = PhotoViewer.Y8;
                ryVar.d(new org.telegram.ui.Components.m(hfVar));
                break;
        }
    }
}
