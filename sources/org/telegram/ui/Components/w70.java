package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ w70(y70 y70Var, boolean z10, int i10) {
        this.a = i10;
        this.b = y70Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new w70(this.b, this.c, 1));
                break;
            default:
                this.b.setJoinRequest(this.c);
                break;
        }
    }
}
