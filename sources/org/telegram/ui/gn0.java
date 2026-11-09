package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gn0 implements org.telegram.ui.Components.h51 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.hf b;

    public /* synthetic */ gn0(org.telegram.messenger.hf hfVar, int i7) {
        this.a = i7;
        this.b = hfVar;
    }

    @Override // org.telegram.ui.Components.h51
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
