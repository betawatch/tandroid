package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                ((yo0) this.c).R0((org.telegram.ui.Cells.d7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((ho0) this.c).d.R0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
