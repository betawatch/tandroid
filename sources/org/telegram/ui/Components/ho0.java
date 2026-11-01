package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ org.telegram.messenger.vs c;
    public final /* synthetic */ View d;

    public /* synthetic */ ho0(org.telegram.messenger.vs vsVar, View view, int[] iArr, int i10) {
        this.a = i10;
        this.c = vsVar;
        this.d = view;
        this.b = iArr;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                ((pp0) this.c).Q0((org.telegram.ui.Cells.h7) this.d, this.b, f7 / 1000.0f);
                break;
            default:
                ((yo0) this.c).d.Q0(this.d, this.b, f7 / 1000.0f);
                break;
        }
    }
}
