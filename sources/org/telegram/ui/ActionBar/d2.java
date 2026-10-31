package org.telegram.ui.ActionBar;

import org.telegram.messenger.i20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements i20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.i20
    public final Object run() {
        switch (this.a) {
            case 0:
                return ((k2) this.b).getSimpleMenuOverlay();
            default:
                return ((rh.e4) this.b).k();
        }
    }
}
