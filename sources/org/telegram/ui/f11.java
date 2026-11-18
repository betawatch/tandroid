package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.u b;

    public /* synthetic */ f11(bi.u uVar, int i7) {
        this.a = i7;
        this.b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.I3(((j01) this.b.f2).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
