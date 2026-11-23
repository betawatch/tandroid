package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.fs c;
    public final /* synthetic */ View d;

    public /* synthetic */ tn0(org.telegram.messenger.fs fsVar, View view, int[] iArr, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((zo0) this.c).R0((org.telegram.ui.Cells.d7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((io0) this.c).d.R0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
