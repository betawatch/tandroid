package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.us c;
    public final /* synthetic */ View d;

    public /* synthetic */ go0(org.telegram.messenger.us usVar, View view, int[] iArr, int i10) {
        this.a = i10;
        this.c = usVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((op0) this.c).Q0((org.telegram.ui.Cells.h7) this.d, this.b, f7 / 1000.0f);
                break;
            default:
                ((xo0) this.c).d.Q0(this.d, this.b, f7 / 1000.0f);
                break;
        }
    }
}
