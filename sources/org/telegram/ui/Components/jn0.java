package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.is c;
    public final /* synthetic */ View d;

    public /* synthetic */ jn0(org.telegram.messenger.is isVar, View view, int[] iArr, int i7) {
        this.a = i7;
        this.c = isVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((po0) this.c).Q0((org.telegram.ui.Cells.c7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((yn0) this.c).d.Q0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
