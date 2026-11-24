// default package

import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class e6a extends ccb implements eq4 {
    public ko5 a;
    public g6a b;
    public d6a c;
    public jg4 d;
    public a6a e;
    public k7a f;
    public byte h;
    public final /* synthetic */ g6a n;
    public final /* synthetic */ a6a r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6a(g6a g6aVar, a6a a6aVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.n = g6aVar;
        this.r = a6aVar;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        return new e6a(this.n, this.r, fw2Var);
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        return ((e6a) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        if (r1 != r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0045, code lost:
    
        if (r1 != r6) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b3  */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object A;
        ko5 ko5Var;
        d6a d6aVar;
        jg4 jg4Var;
        k7a k7aVar;
        Object b;
        a6a a6aVar;
        zx2 zx2Var;
        String str;
        z53 z53Var;
        zx2 zx2Var2;
        byte b2 = this.h;
        g6a g6aVar = this.n;
        bx2 bx2Var = bx2.a;
        if (b2 == 0) {
            qse.b(obj);
            this.h = (byte) 1;
            int i = g6a.g;
            a = g6aVar.a(this);
        } else {
            if (b2 != 1) {
                if (b2 == 2) {
                    qse.b(obj);
                    A = obj;
                    ko5Var = (ko5) A;
                    d6aVar = d6a.a;
                    jg4Var = g6aVar.a;
                    k7aVar = g6aVar.c;
                    lh4 lh4Var = lh4.a;
                    this.a = ko5Var;
                    this.b = g6aVar;
                    this.c = d6aVar;
                    this.d = jg4Var;
                    a6a a6aVar2 = this.r;
                    this.e = a6aVar2;
                    this.f = k7aVar;
                    this.h = (byte) 3;
                    b = lh4Var.b(this);
                    if (b != bx2Var) {
                        a6aVar = a6aVar2;
                        Map map = (Map) b;
                        String str2 = ko5Var.a;
                        String str3 = ko5Var.b;
                        d6aVar.getClass();
                        jg4Var.getClass();
                        a6aVar.getClass();
                        k7aVar.getClass();
                        map.getClass();
                        str3.getClass();
                        String str4 = a6aVar.a;
                        String str5 = a6aVar.b;
                        int i2 = a6aVar.c;
                        long j = a6aVar.d;
                        zx2Var = (zx2) map.get(q6a.b);
                        z53 z53Var2 = z53.d;
                        z53 z53Var3 = z53.c;
                        z53 z53Var4 = z53.b;
                        if (zx2Var != null) {
                        }
                        zx2Var2 = (zx2) map.get(q6a.a);
                        if (zx2Var2 != null) {
                        }
                        c6a c6aVar = new c6a(new i6a(str4, str5, i2, j, new a63(z53Var, z53Var2, k7aVar.a()), str2, str), d6a.a(jg4Var));
                        int i3 = g6a.g;
                        g6aVar.getClass();
                        g6aVar.d.a(c6aVar);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                        return g5c.a;
                    }
                    return bx2Var;
                }
                if (b2 != 3) {
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k7a k7aVar2 = this.f;
                a6aVar = this.e;
                jg4Var = this.d;
                d6aVar = this.c;
                g6aVar = this.b;
                ko5 ko5Var2 = this.a;
                qse.b(obj);
                k7aVar = k7aVar2;
                ko5Var = ko5Var2;
                b = obj;
                Map map2 = (Map) b;
                String str22 = ko5Var.a;
                String str32 = ko5Var.b;
                d6aVar.getClass();
                jg4Var.getClass();
                a6aVar.getClass();
                k7aVar.getClass();
                map2.getClass();
                str32.getClass();
                String str42 = a6aVar.a;
                String str52 = a6aVar.b;
                int i22 = a6aVar.c;
                long j2 = a6aVar.d;
                zx2Var = (zx2) map2.get(q6a.b);
                z53 z53Var22 = z53.d;
                z53 z53Var32 = z53.c;
                z53 z53Var42 = z53.b;
                if (zx2Var != null) {
                    str = str32;
                    z53Var = z53Var42;
                } else {
                    str = str32;
                    z53Var = zx2Var.a.a() ? z53Var32 : z53Var22;
                }
                zx2Var2 = (zx2) map2.get(q6a.a);
                if (zx2Var2 != null) {
                    z53Var22 = z53Var42;
                } else if (zx2Var2.a.a()) {
                    z53Var22 = z53Var32;
                }
                c6a c6aVar2 = new c6a(new i6a(str42, str52, i22, j2, new a63(z53Var, z53Var22, k7aVar.a()), str22, str), d6a.a(jg4Var));
                int i32 = g6a.g;
                g6aVar.getClass();
                try {
                    g6aVar.d.a(c6aVar2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                } catch (RuntimeException e) {
                    Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
                }
                return g5c.a;
            }
            qse.b(obj);
            a = obj;
        }
        if (((Boolean) a).booleanValue()) {
            rg4 rg4Var = g6aVar.b;
            this.h = (byte) 2;
            A = ko5.c.A(rg4Var, this);
        }
        return g5c.a;
    }
}
