package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ uj(int i7, long j3, long j10, mp mpVar) {
        this.a = 2;
        this.b = mpVar;
        this.d = j3;
        this.e = j10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z(this.d, this.c, this.e);
                break;
            case 1:
                this.b.z(this.d, this.c, this.e);
                break;
            default:
                long j3 = this.e;
                this.b.q0(this.d, this.c, j3);
                break;
        }
    }

    public /* synthetic */ uj(mp mpVar, int i7, long j3, long j10, int i10) {
        this.a = i10;
        this.b = mpVar;
        this.c = i7;
        this.d = j3;
        this.e = j10;
    }
}
