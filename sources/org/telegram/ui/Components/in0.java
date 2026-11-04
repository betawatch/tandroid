package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.cs c;
    public final /* synthetic */ View d;

    public /* synthetic */ in0(org.telegram.messenger.cs csVar, View view, int[] iArr, int i3) {
        this.a = i3;
        this.c = csVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((oo0) this.c).Q0((org.telegram.ui.Cells.c7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((xn0) this.c).d.Q0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
