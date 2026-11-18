package org.telegram.ui.Components;

import android.graphics.Path;
import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ View d;

    public /* synthetic */ t60(float f10, float f11, int i7, View view) {
        this.a = i7;
        this.d = view;
        this.b = f10;
        this.c = f11;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((u60) this.d).y.addPath((Path) obj, this.b, this.c);
                break;
            default:
                ((org.telegram.ui.Cells.p7) this.d).n(this.b, this.c);
                break;
        }
    }
}
