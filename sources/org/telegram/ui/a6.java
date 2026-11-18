package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.x10 b;
    public final /* synthetic */ long c;

    public /* synthetic */ a6(int i7, long j3, org.telegram.messenger.x10 x10Var) {
        this.a = i7;
        this.b = x10Var;
        this.c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(Long.valueOf(this.c));
                break;
            default:
                this.b.a(Long.valueOf(this.c));
                break;
        }
    }
}
