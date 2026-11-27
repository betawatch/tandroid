// default package

import java.io.File;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class a83 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a83(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.e = obj;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                a83 a83Var = new a83((o83) obj2, zw2Var, (byte) 0);
                a83Var.c = obj;
                return a83Var;
            default:
                a83 a83Var2 = new a83((File) obj2, zw2Var, (byte) 1);
                a83Var2.c = obj;
                return a83Var2;
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        switch (b) {
            case 0:
                return ((a83) create((nm4) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            default:
                return ((a83) create((so8) obj, (zw2) obj2)).invokeSuspend(f9cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if (fwe.a(r5, r14, r13) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0163, code lost:
    
        if (r13 == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r9.c(r10, r13) == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        if ((r7 instanceof sh4) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0167  */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm4 nm4Var;
        Object obj2;
        so8 so8Var;
        ke5 ke5Var;
        zw2 zw2Var = null;
        byte b = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                f9c f9cVar = f9c.a;
                o83 o83Var = (o83) this.e;
                vx2 vx2Var = vx2.a;
                byte b3 = this.b;
                if (b3 == 0) {
                    ixe.b(obj);
                    nm4 nm4Var2 = (nm4) this.c;
                    this.c = nm4Var2;
                    this.b = (byte) 1;
                    Object c = fud.c(o83Var.c.c(), new e83(o83Var, zw2Var, b2), this);
                    if (c != vx2Var) {
                        nm4Var = nm4Var2;
                        obj = c;
                    }
                    return vx2Var;
                }
                if (b3 == 1) {
                    nm4 nm4Var3 = (nm4) this.c;
                    ixe.b(obj);
                    nm4Var = nm4Var3;
                } else {
                    if (b3 != 2) {
                        if (b3 == 3) {
                            ixe.b(obj);
                            return f9cVar;
                        }
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = (k63) this.d;
                    nm4Var = (nm4) this.c;
                    ixe.b(obj);
                    rm4 rm4Var = new rm4(new wz4(new ym4(new um4(new qx6(new u73(o83Var, zw2Var, b), (k0b) o83Var.h.b, z3 ? 1 : 0, (byte) 29), new v73(2, null, (byte) 0), b2), new w73(obj2, zw2Var, z2 ? 1 : 0), z ? 1 : 0)), new x73(o83Var, (zw2) null));
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 3;
                    if (!(nm4Var instanceof irb)) {
                        throw ((irb) nm4Var).a;
                    }
                    Object k = rm4Var.k(nm4Var, this);
                    if (k != vx2Var) {
                        k = f9cVar;
                        break;
                    }
                }
                obj2 = (i0b) obj;
                if (obj2 instanceof k63) {
                    k63 k63Var = (k63) obj2;
                    Object obj3 = k63Var.b;
                    this.c = nm4Var;
                    this.d = k63Var;
                    this.b = (byte) 2;
                    break;
                } else {
                    if (obj2 instanceof n8c) {
                        grb.i("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (!(obj2 instanceof a59)) {
                        break;
                    } else {
                        throw ((a59) obj2).b;
                    }
                }
                rm4 rm4Var2 = new rm4(new wz4(new ym4(new um4(new qx6(new u73(o83Var, zw2Var, b), (k0b) o83Var.h.b, z3 ? 1 : 0, (byte) 29), new v73(2, null, (byte) 0), b2), new w73(obj2, zw2Var, z2 ? 1 : 0), z ? 1 : 0)), new x73(o83Var, (zw2) null));
                this.c = null;
                this.d = null;
                this.b = (byte) 3;
                if (!(nm4Var instanceof irb)) {
                }
                break;
            default:
                vx2 vx2Var2 = vx2.a;
                byte b4 = this.b;
                if (b4 == 0) {
                    ixe.b(obj);
                    so8Var = (so8) this.c;
                    File file = (File) this.e;
                    cj7 cj7Var = new cj7(file, so8Var, (byte) 0);
                    Object obj4 = dj7.b;
                    File parentFile = file.getParentFile();
                    parentFile.getClass();
                    String path = parentFile.getCanonicalFile().getPath();
                    synchronized (dj7.b) {
                        LinkedHashMap linkedHashMap = dj7.c;
                        path.getClass();
                        Object obj5 = linkedHashMap.get(path);
                        Object obj6 = obj5;
                        if (obj5 == null) {
                            dj7 dj7Var = new dj7(path);
                            linkedHashMap.put(path, dj7Var);
                            obj6 = dj7Var;
                        }
                        dj7 dj7Var2 = (dj7) obj6;
                        dj7Var2.a.add(cj7Var);
                        if (dj7Var2.a.size() == 1) {
                            dj7Var2.startWatching();
                        }
                    }
                    ke5 ke5Var2 = new ke5(path, cj7Var, (byte) 1);
                    f9c f9cVar2 = f9c.a;
                    this.c = so8Var;
                    this.d = ke5Var2;
                    this.b = (byte) 1;
                    if (so8Var.e.a(this, f9cVar2) != vx2Var2) {
                        ke5Var = ke5Var2;
                    }
                    return vx2Var2;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        ixe.b(obj);
                        return f9c.a;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ke5Var = (ke5) this.d;
                so8Var = (so8) this.c;
                ixe.b(obj);
                ad4 ad4Var = new ad4(ke5Var, b2);
                this.c = null;
                this.d = null;
                this.b = (byte) 2;
                break;
        }
    }
}
