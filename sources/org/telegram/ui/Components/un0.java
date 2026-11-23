package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.gs c;
    public final /* synthetic */ View d;

    public /* synthetic */ un0(org.telegram.messenger.gs gsVar, View view, int[] iArr, int i7) {
        this.a = i7;
        this.c = gsVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((ap0) this.c).R0((org.telegram.ui.Cells.e7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((jo0) this.c).d.R0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
