package ii;

import di.o9;
import org.telegram.messenger.tr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k(int i7, long j3, long j10, int i10, o9 o9Var) {
        this.d = i7;
        this.b = j3;
        this.c = j10;
        this.e = i10;
        this.f = o9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o9 o9Var = (o9) this.f;
                n.a(this.d, this.b, this.c, this.e + 1, o9Var);
                break;
            default:
                ((tr) this.f).e2(-this.b, this.c, this.d, this.e);
                break;
        }
    }

    public /* synthetic */ k(tr trVar, long j3, long j10, int i7, int i10) {
        this.f = trVar;
        this.b = j3;
        this.c = j10;
        this.d = i7;
        this.e = i10;
    }
}
