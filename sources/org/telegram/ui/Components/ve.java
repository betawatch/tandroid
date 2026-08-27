package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ve implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ pu0 c;

    public ve(float f10, pu0 pu0Var) {
        this.b = f10;
        this.c = pu0Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        if (this.a || f10 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
