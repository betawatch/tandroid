// default package

import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class n5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ r47 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ d7a f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ d7a n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean w;

    public /* synthetic */ n5a(r7a r7aVar, TLObject tLObject, r47 r47Var, String str, d7a d7aVar, boolean z, d7a d7aVar2, Object obj, HashMap hashMap, boolean z2, byte b) {
        this.a = b;
        this.b = r7aVar;
        this.c = tLObject;
        this.d = r47Var;
        this.e = str;
        this.f = d7aVar;
        this.h = z;
        this.n = d7aVar2;
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
