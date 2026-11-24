// default package

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class o1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ k3a f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ k3a n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ o1a(z3a z3aVar, TLObject tLObject, k27 k27Var, String str, k3a k3aVar, boolean z, k3a k3aVar2, Object obj, HashMap hashMap, boolean z2, byte b) {
        this.a = b;
        this.b = z3aVar;
        this.c = tLObject;
        this.d = k27Var;
        this.e = str;
        this.f = k3aVar;
        this.h = z;
        this.n = k3aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
            case 1:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
            default:
                this.b.N(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w);
                break;
        }
    }
}
