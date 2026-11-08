package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn0 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.ls c;
    public final /* synthetic */ View d;

    public /* synthetic */ fn0(org.telegram.messenger.ls lsVar, View view, int[] iArr, int i7) {
        this.a = i7;
        this.c = lsVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                ((mo0) this.c).Q0((org.telegram.ui.Cells.d7) this.d, this.b, f10 / 1000.0f);
                break;
            default:
                ((vn0) this.c).d.Q0(this.d, this.b, f10 / 1000.0f);
                break;
        }
    }
}
