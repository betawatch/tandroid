// default package

import java.io.File;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h73 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h73(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.e = obj;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                h73 h73Var = new h73((v73) obj2, fw2Var, (byte) 0);
                h73Var.c = obj;
                return h73Var;
            default:
                h73 h73Var2 = new h73((File) obj2, fw2Var, (byte) 1);
                h73Var2.c = obj;
                return h73Var2;
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((h73) create((ik4) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            default:
                return ((h73) create((fl8) obj, (fw2) obj2)).invokeSuspend(g5cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if (nre.a(r5, r13, r12) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0165, code lost:
    
        if (r12 == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010e, code lost:
    
        if (r7.c(r9, r12) == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        if ((r2 instanceof uf4) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169  */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ik4 ik4Var;
        Object obj2;
        fl8 fl8Var;
        jc5 jc5Var;
        byte b = 1;
        fw2 fw2Var = null;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                g5c g5cVar = g5c.a;
                v73 v73Var = (v73) this.e;
                bx2 bx2Var = bx2.a;
                byte b3 = this.b;
                if (b3 == 0) {
                    qse.b(obj);
                    ik4 ik4Var2 = (ik4) this.c;
                    this.c = ik4Var2;
                    this.b = (byte) 1;
                    Object c = ppd.c(v73Var.c.c(), new l73(v73Var, fw2Var, b), this);
                    if (c != bx2Var) {
                        ik4Var = ik4Var2;
                        obj = c;
                    }
                    return bx2Var;
                }
                if (b3 == 1) {
                    ik4 ik4Var3 = (ik4) this.c;
                    qse.b(obj);
                    ik4Var = ik4Var3;
                } else {
                    if (b3 != 2) {
                        if (b3 == 3) {
                            qse.b(obj);
                            return g5cVar;
                        }
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = (s53) this.d;
                    ik4Var = (ik4) this.c;
                    qse.b(obj);
                    mk4 mk4Var = new mk4(new lj9((Object) new sk4(new wk4(new tg2(new b73(v73Var, fw2Var, b2), (hwa) v73Var.h.a, (byte) 29), new c73(2, null, (byte) 0), b2), new d73(obj2, fw2Var, b2), b2), (byte) 26), new e73(v73Var, (fw2) null));
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 3;
                    if (!(ik4Var instanceof inb)) {
                        throw ((inb) ik4Var).a;
                    }
                    Object h = mk4Var.h(ik4Var, this);
                    if (h != bx2Var) {
                        h = g5cVar;
                        break;
                    }
                }
                obj2 = (fwa) obj;
                if (obj2 instanceof s53) {
                    s53 s53Var = (s53) obj2;
                    Object obj3 = s53Var.b;
                    this.c = ik4Var;
                    this.d = s53Var;
                    this.b = (byte) 2;
                    break;
                } else {
                    if (obj2 instanceof o4c) {
                        sc8.j("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (!(obj2 instanceof l19)) {
                        break;
                    } else {
                        throw ((l19) obj2).b;
                    }
                }
                mk4 mk4Var2 = new mk4(new lj9((Object) new sk4(new wk4(new tg2(new b73(v73Var, fw2Var, b2), (hwa) v73Var.h.a, (byte) 29), new c73(2, null, (byte) 0), b2), new d73(obj2, fw2Var, b2), b2), (byte) 26), new e73(v73Var, (fw2) null));
                this.c = null;
                this.d = null;
                this.b = (byte) 3;
                if (!(ik4Var instanceof inb)) {
                }
                break;
            default:
                bx2 bx2Var2 = bx2.a;
                byte b4 = this.b;
                if (b4 == 0) {
                    qse.b(obj);
                    fl8Var = (fl8) this.c;
                    File file = (File) this.e;
                    tg7 tg7Var = new tg7(file, fl8Var, (byte) 0);
                    Object obj4 = ug7.b;
                    File parentFile = file.getParentFile();
                    parentFile.getClass();
                    String path = parentFile.getCanonicalFile().getPath();
                    synchronized (ug7.b) {
                        LinkedHashMap linkedHashMap = ug7.c;
                        path.getClass();
                        Object obj5 = linkedHashMap.get(path);
                        if (obj5 == null) {
                            obj5 = new ug7(path);
                            linkedHashMap.put(path, obj5);
                        }
                        ug7 ug7Var = (ug7) obj5;
                        ug7Var.a.add(tg7Var);
                        if (ug7Var.a.size() == 1) {
                            ug7Var.startWatching();
                        }
                    }
                    jc5 jc5Var2 = new jc5(path, tg7Var, (byte) 1);
                    g5c g5cVar2 = g5c.a;
                    this.c = fl8Var;
                    this.d = jc5Var2;
                    this.b = (byte) 1;
                    if (fl8Var.e.a(this, g5cVar2) != bx2Var2) {
                        jc5Var = jc5Var2;
                    }
                    return bx2Var2;
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        qse.b(obj);
                        return g5c.a;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jc5Var = (jc5) this.d;
                fl8Var = (fl8) this.c;
                qse.b(obj);
                db4 db4Var = new db4(jc5Var, b);
                this.c = null;
                this.d = null;
                this.b = (byte) 2;
                break;
        }
    }
}
