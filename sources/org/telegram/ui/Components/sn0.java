package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sn0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.fs c;
    public final /* synthetic */ View d;

    public /* synthetic */ sn0(org.telegram.messenger.fs fsVar, View view, int[] iArr, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((yo0) this.c).R0((org.telegram.ui.Cells.e7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((ho0) this.c).d.R0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
