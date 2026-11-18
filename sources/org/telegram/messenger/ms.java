package org.telegram.messenger;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ ms(xs xsVar, long j3, long j10, int i7) {
        this.a = i7;
        this.b = xsVar;
        this.c = j3;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xs xsVar = this.b;
                xsVar.G = this.c;
                xsVar.H = this.d;
                break;
            default:
                this.b.o(this.c, this.d);
                break;
        }
    }
}
