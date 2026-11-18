package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;

    public /* synthetic */ jf0(mf0 mf0Var, int i7) {
        this.a = i7;
        this.b = mf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
