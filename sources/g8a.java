// default package

import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g8a extends eeb implements fs4 {
    public kq5 a;
    public i8a b;
    public f8a c;
    public li4 d;
    public c8a e;
    public l9a f;
    public byte h;
    public final /* synthetic */ i8a n;
    public final /* synthetic */ c8a r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8a(i8a i8aVar, c8a c8aVar, px2 px2Var) {
        super(2, px2Var);
        this.n = i8aVar;
        this.r = c8aVar;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        return new g8a(this.n, this.r, px2Var);
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        return ((g8a) create((ky2) obj, (px2) obj2)).invokeSuspend(g7c.a);
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
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object z;
        kq5 kq5Var;
        f8a f8aVar;
        li4 li4Var;
        l9a l9aVar;
        Object b;
        c8a c8aVar;
        jz2 jz2Var;
        String str;
        l73 l73Var;
        jz2 jz2Var2;
        byte b2 = this.h;
        i8a i8aVar = this.n;
        ly2 ly2Var = ly2.a;
        if (b2 == 0) {
            tue.b(obj);
            this.h = (byte) 1;
            int i = i8a.g;
            a = i8aVar.a(this);
        } else {
            if (b2 != 1) {
                if (b2 == 2) {
                    tue.b(obj);
                    z = obj;
                    kq5Var = (kq5) z;
                    f8aVar = f8a.a;
                    li4Var = i8aVar.a;
                    l9aVar = i8aVar.c;
                    pj4 pj4Var = pj4.a;
                    this.a = kq5Var;
                    this.b = i8aVar;
                    this.c = f8aVar;
                    this.d = li4Var;
                    c8a c8aVar2 = this.r;
                    this.e = c8aVar2;
                    this.f = l9aVar;
                    this.h = (byte) 3;
                    b = pj4Var.b(this);
                    if (b != ly2Var) {
                        c8aVar = c8aVar2;
                        Map map = (Map) b;
                        String str2 = kq5Var.a;
                        String str3 = kq5Var.b;
                        f8aVar.getClass();
                        li4Var.getClass();
                        c8aVar.getClass();
                        l9aVar.getClass();
                        map.getClass();
                        str3.getClass();
                        String str4 = c8aVar.a;
                        String str5 = c8aVar.b;
                        int i2 = c8aVar.c;
                        long j = c8aVar.d;
                        jz2Var = (jz2) map.get(s8a.b);
                        l73 l73Var2 = l73.d;
                        l73 l73Var3 = l73.c;
                        l73 l73Var4 = l73.b;
                        if (jz2Var != null) {
                        }
                        jz2Var2 = (jz2) map.get(s8a.a);
                        if (jz2Var2 != null) {
                        }
                        e8a e8aVar = new e8a(new k8a(str4, str5, i2, j, new m73(l73Var, l73Var2, l9aVar.a()), str2, str), f8a.a(li4Var));
                        int i3 = i8a.g;
                        i8aVar.getClass();
                        i8aVar.d.a(e8aVar);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                        return g7c.a;
                    }
                    return ly2Var;
                }
                if (b2 != 3) {
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                l9a l9aVar2 = this.f;
                c8aVar = this.e;
                li4Var = this.d;
                f8aVar = this.c;
                i8aVar = this.b;
                kq5 kq5Var2 = this.a;
                tue.b(obj);
                l9aVar = l9aVar2;
                kq5Var = kq5Var2;
                b = obj;
                Map map2 = (Map) b;
                String str22 = kq5Var.a;
                String str32 = kq5Var.b;
                f8aVar.getClass();
                li4Var.getClass();
                c8aVar.getClass();
                l9aVar.getClass();
                map2.getClass();
                str32.getClass();
                String str42 = c8aVar.a;
                String str52 = c8aVar.b;
                int i22 = c8aVar.c;
                long j2 = c8aVar.d;
                jz2Var = (jz2) map2.get(s8a.b);
                l73 l73Var22 = l73.d;
                l73 l73Var32 = l73.c;
                l73 l73Var42 = l73.b;
                if (jz2Var != null) {
                    str = str32;
                    l73Var = l73Var42;
                } else {
                    str = str32;
                    l73Var = jz2Var.a.a() ? l73Var32 : l73Var22;
                }
                jz2Var2 = (jz2) map2.get(s8a.a);
                if (jz2Var2 != null) {
                    l73Var22 = l73Var42;
                } else if (jz2Var2.a.a()) {
                    l73Var22 = l73Var32;
                }
                e8a e8aVar2 = new e8a(new k8a(str42, str52, i22, j2, new m73(l73Var, l73Var22, l9aVar.a()), str22, str), f8a.a(li4Var));
                int i32 = i8a.g;
                i8aVar.getClass();
                try {
                    i8aVar.d.a(e8aVar2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                } catch (RuntimeException e) {
                    Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
                }
                return g7c.a;
            }
            tue.b(obj);
            a = obj;
        }
        if (((Boolean) a).booleanValue()) {
            ti4 ti4Var = i8aVar.b;
            this.h = (byte) 2;
            z = kq5.c.z(ti4Var, this);
        }
        return g7c.a;
    }
}
