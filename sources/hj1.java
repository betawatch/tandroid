// default package

import android.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hj1 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj1(Object obj, Object obj2, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                hj1 hj1Var = new hj1((ij1) obj2, px2Var, (byte) 0);
                hj1Var.c = obj;
                return hj1Var;
            case 1:
                hj1 hj1Var2 = new hj1((ij1) obj2, px2Var, (byte) 1);
                hj1Var2.c = obj;
                return hj1Var2;
            case 2:
                hj1 hj1Var3 = new hj1((x2a) obj2, px2Var, (byte) 2);
                hj1Var3.c = obj;
                return hj1Var3;
            case 3:
                hj1 hj1Var4 = new hj1((List) obj2, px2Var, (byte) 3);
                hj1Var4.c = obj;
                return hj1Var4;
            case 4:
                return new hj1((fs4) this.c, (e73) obj2, px2Var, (byte) 4);
            case 5:
                hj1 hj1Var5 = new hj1((h93) obj2, px2Var, (byte) 5);
                hj1Var5.c = obj;
                return hj1Var5;
            case 6:
                return new hj1((wu5) this.c, (rr4) obj2, px2Var, (byte) 6);
            case 7:
                hj1 hj1Var6 = new hj1((p89) obj2, px2Var, (byte) 7);
                hj1Var6.c = obj;
                return hj1Var6;
            default:
                hj1 hj1Var7 = new hj1((jm4) obj2, px2Var, (byte) 8);
                hj1Var7.c = obj;
                return hj1Var7;
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((hj1) create((hn8) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 1:
                return ((hj1) create((jm4) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 2:
                return ((hj1) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 3:
                return ((hj1) create((k83) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 4:
                return ((hj1) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 5:
                return ((hj1) create((d37) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 6:
                return ((hj1) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 7:
                return ((hj1) create((JSONObject) obj, (px2) obj2)).invokeSuspend(g7cVar);
            default:
                return ((hj1) create(obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0253, code lost:
    
        if (r0 == r6) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0260, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x025e, code lost:
    
        if (r0 != r6) goto L147;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Type inference failed for: r7v0, types: [px2] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        Object sc9Var;
        Object a;
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Double d2;
        Boolean bool2;
        byte b = this.a;
        Object obj2 = g7c.a;
        Object obj3 = this.d;
        byte b2 = 1;
        ly2 ly2Var = ly2.a;
        Integer num3 = 0;
        r7 = null;
        Integer num4 = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        tue.b(obj);
                        return obj2;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                hn8 hn8Var = (hn8) this.c;
                ij1 ij1Var = (ij1) obj3;
                this.b = true;
                switch (ij1Var.d) {
                    case 0:
                        invoke = ((t83) ij1Var.e).invoke(hn8Var, this);
                        break;
                    default:
                        invoke = ((im4) ij1Var.e).g(new n6a(hn8Var), this);
                        if (invoke != ly2Var) {
                            invoke = obj2;
                            break;
                        }
                        break;
                }
                return invoke == ly2Var ? ly2Var : obj2;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        tue.b(obj);
                        return obj2;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                jm4 jm4Var = (jm4) this.c;
                this.b = true;
                Object g = ((im4) ((ij1) obj3).e).g(jm4Var, this);
                if (g != ly2Var) {
                    g = obj2;
                }
                return g == ly2Var ? ly2Var : obj2;
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        tue.b(obj);
                        x2a x2aVar = (x2a) obj3;
                        this.b = true;
                        if (x2aVar.a(this, obj2) == ly2Var) {
                            return ly2Var;
                        }
                    } else {
                        if (!z3) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tue.b(obj);
                    }
                    sc9Var = obj2;
                } catch (Throwable th) {
                    sc9Var = new sc9(th);
                }
                if (sc9Var instanceof sc9) {
                    obj2 = new mk1(tc9.a(sc9Var));
                }
                return new ok1(obj2);
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    tue.b(obj);
                    k83 k83Var = (k83) this.c;
                    this.b = true;
                    return rk6.c.P((List) obj3, k83Var, this) == ly2Var ? ly2Var : obj2;
                }
                if (z4) {
                    tue.b(obj);
                    return obj2;
                }
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        tue.b(obj);
                        return obj;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                fs4 fs4Var = (fs4) this.c;
                Object obj4 = ((e73) obj3).b;
                this.b = true;
                Object invoke2 = fs4Var.invoke(obj4, this);
                return invoke2 == ly2Var ? ly2Var : invoke2;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    tue.b(obj);
                    d37 d37Var = (d37) this.c;
                    this.b = true;
                    return ((h93) obj3).d(d37Var, this) == ly2Var ? ly2Var : obj2;
                }
                if (z6) {
                    tue.b(obj);
                    return obj2;
                }
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                wu5 wu5Var = (wu5) this.c;
                ThreadLocal threadLocal = wu5Var.b;
                boolean z7 = this.b;
                try {
                    if (z7) {
                        if (!z7) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tue.b(obj);
                        a = obj;
                        return (lj7) a;
                    }
                    tue.b(obj);
                    Object obj5 = threadLocal.get();
                    Boolean bool3 = Boolean.TRUE;
                    if (rr5.a(obj5, bool3)) {
                        dq9.m("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    threadLocal.set(bool3);
                    li8 li8Var = wu5Var.c;
                    p83 p83Var = new p83((rr4) obj3, num3, (byte) 2);
                    this.b = true;
                    a = li8Var.a(new ki8(p83Var, num3, b2), this);
                    if (a == ly2Var) {
                        return ly2Var;
                    }
                    return (lj7) a;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
                threadLocal.set(Boolean.FALSE);
            case 7:
                p89 p89Var = (p89) obj3;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        tue.b(obj);
                        return obj2;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tue.b(obj);
                JSONObject jSONObject = (JSONObject) this.c;
                Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
                if (jSONObject.has("app_quality")) {
                    Object obj6 = jSONObject.get("app_quality");
                    obj6.getClass();
                    JSONObject jSONObject2 = (JSONObject) obj6;
                    try {
                        bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                            try {
                                num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                                try {
                                    if (jSONObject2.has("cache_duration")) {
                                        num4 = (Integer) jSONObject2.get("cache_duration");
                                    }
                                } catch (JSONException e) {
                                    e = e;
                                    zqd.a(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d = d2;
                                    bool = bool2;
                                    num3 = num4;
                                    haa haaVar = p89Var.e;
                                    if (num3 == 0) {
                                    }
                                    p89Var.a.getClass();
                                    v7a v7aVar = new v7a(bool, d, num, new Integer(r4), new Long(tpb.a().c));
                                    this.b = true;
                                    if (haaVar.c(v7aVar, this) != ly2Var) {
                                    }
                                }
                            } catch (JSONException e2) {
                                e = e2;
                                num2 = null;
                            }
                        } catch (JSONException e3) {
                            e = e3;
                            num2 = null;
                            d2 = null;
                        }
                    } catch (JSONException e4) {
                        e = e4;
                        num2 = null;
                        d2 = null;
                        bool2 = null;
                    }
                    num = num2;
                    d = d2;
                    bool = bool2;
                    num3 = num4;
                } else {
                    bool = null;
                    d = null;
                    num = null;
                }
                haa haaVar2 = p89Var.e;
                int intValue = num3 == 0 ? num3.intValue() : p89.g;
                p89Var.a.getClass();
                v7a v7aVar2 = new v7a(bool, d, num, new Integer(intValue), new Long(tpb.a().c));
                this.b = true;
                return haaVar2.c(v7aVar2, this) != ly2Var ? ly2Var : obj2;
            default:
                boolean z9 = this.b;
                if (!z9) {
                    tue.b(obj);
                    Object obj7 = this.c;
                    this.b = true;
                    return ((jm4) obj3).c(obj7, this) == ly2Var ? ly2Var : obj2;
                }
                if (z9) {
                    tue.b(obj);
                    return obj2;
                }
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hj1(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.d = obj;
    }
}
