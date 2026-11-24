// default package

import android.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ai1 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai1(Object obj, Object obj2, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ai1 ai1Var = new ai1((bi1) obj2, fw2Var, (byte) 0);
                ai1Var.c = obj;
                return ai1Var;
            case 1:
                ai1 ai1Var2 = new ai1((bi1) obj2, fw2Var, (byte) 1);
                ai1Var2.c = obj;
                return ai1Var2;
            case 2:
                ai1 ai1Var3 = new ai1((v0a) obj2, fw2Var, (byte) 2);
                ai1Var3.c = obj;
                return ai1Var3;
            case 3:
                ai1 ai1Var4 = new ai1((List) obj2, fw2Var, (byte) 3);
                ai1Var4.c = obj;
                return ai1Var4;
            case 4:
                return new ai1((eq4) this.c, (s53) obj2, fw2Var, (byte) 4);
            case 5:
                ai1 ai1Var5 = new ai1((v73) obj2, fw2Var, (byte) 5);
                ai1Var5.c = obj;
                return ai1Var5;
            case 6:
                return new ai1((xs5) this.c, (qp4) obj2, fw2Var, (byte) 6);
            case 7:
                ai1 ai1Var6 = new ai1((n69) obj2, fw2Var, (byte) 7);
                ai1Var6.c = obj;
                return ai1Var6;
            default:
                ai1 ai1Var7 = new ai1((ik4) obj2, fw2Var, (byte) 8);
                ai1Var7.c = obj;
                return ai1Var7;
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                return ((ai1) create((fl8) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 1:
                return ((ai1) create((ik4) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 2:
                return ((ai1) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 3:
                return ((ai1) create((y63) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 4:
                return ((ai1) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 5:
                return ((ai1) create((d17) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 6:
                return ((ai1) create((ax2) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            case 7:
                return ((ai1) create((JSONObject) obj, (fw2) obj2)).invokeSuspend(g5cVar);
            default:
                return ((ai1) create(obj, (fw2) obj2)).invokeSuspend(g5cVar);
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
    /* JADX WARN: Type inference failed for: r7v0, types: [fw2] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        Object sa9Var;
        Object a;
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Double d2;
        Boolean bool2;
        byte b = this.a;
        Object obj2 = g5c.a;
        Object obj3 = this.d;
        byte b2 = 1;
        bx2 bx2Var = bx2.a;
        Integer num3 = 0;
        r7 = null;
        Integer num4 = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        qse.b(obj);
                        return obj2;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                fl8 fl8Var = (fl8) this.c;
                bi1 bi1Var = (bi1) obj3;
                this.b = true;
                switch (bi1Var.d) {
                    case 0:
                        invoke = ((h73) bi1Var.e).invoke(fl8Var, this);
                        break;
                    default:
                        invoke = ((hk4) bi1Var.e).h(new l4a(fl8Var), this);
                        if (invoke != bx2Var) {
                            invoke = obj2;
                            break;
                        }
                        break;
                }
                return invoke == bx2Var ? bx2Var : obj2;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        qse.b(obj);
                        return obj2;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                ik4 ik4Var = (ik4) this.c;
                this.b = true;
                Object h = ((hk4) ((bi1) obj3).e).h(ik4Var, this);
                if (h != bx2Var) {
                    h = obj2;
                }
                return h == bx2Var ? bx2Var : obj2;
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        qse.b(obj);
                        v0a v0aVar = (v0a) obj3;
                        this.b = true;
                        if (v0aVar.a(this, obj2) == bx2Var) {
                            return bx2Var;
                        }
                    } else {
                        if (!z3) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qse.b(obj);
                    }
                    sa9Var = obj2;
                } catch (Throwable th) {
                    sa9Var = new sa9(th);
                }
                if (sa9Var instanceof sa9) {
                    obj2 = new ej1(ta9.a(sa9Var));
                }
                return new gj1(obj2);
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    qse.b(obj);
                    y63 y63Var = (y63) this.c;
                    this.b = true;
                    return pi6.c.O((List) obj3, y63Var, this) == bx2Var ? bx2Var : obj2;
                }
                if (z4) {
                    qse.b(obj);
                    return obj2;
                }
                sc8.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        qse.b(obj);
                        return obj;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
                eq4 eq4Var = (eq4) this.c;
                Object obj4 = ((s53) obj3).b;
                this.b = true;
                Object invoke2 = eq4Var.invoke(obj4, this);
                return invoke2 == bx2Var ? bx2Var : invoke2;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    qse.b(obj);
                    d17 d17Var = (d17) this.c;
                    this.b = true;
                    return ((v73) obj3).d(d17Var, this) == bx2Var ? bx2Var : obj2;
                }
                if (z6) {
                    qse.b(obj);
                    return obj2;
                }
                sc8.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                xs5 xs5Var = (xs5) this.c;
                ThreadLocal threadLocal = xs5Var.b;
                boolean z7 = this.b;
                try {
                    if (z7) {
                        if (!z7) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qse.b(obj);
                        a = obj;
                        return (ih7) a;
                    }
                    qse.b(obj);
                    Object obj5 = threadLocal.get();
                    Boolean bool3 = Boolean.TRUE;
                    if (rp5.a(obj5, bool3)) {
                        sc8.j("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    threadLocal.set(bool3);
                    jg8 jg8Var = xs5Var.c;
                    d73 d73Var = new d73((qp4) obj3, num3, (byte) 2);
                    this.b = true;
                    a = jg8Var.a(new ig8(d73Var, num3, b2), this);
                    if (a == bx2Var) {
                        return bx2Var;
                    }
                    return (ih7) a;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
                threadLocal.set(Boolean.FALSE);
            case 7:
                n69 n69Var = (n69) obj3;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        qse.b(obj);
                        return obj2;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qse.b(obj);
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
                                    wod.a(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d = d2;
                                    bool = bool2;
                                    num3 = num4;
                                    h8a h8aVar = n69Var.e;
                                    if (num3 == 0) {
                                    }
                                    n69Var.a.getClass();
                                    t5a t5aVar = new t5a(bool, d, num, new Integer(r4), new Long(snb.a().c));
                                    this.b = true;
                                    if (h8aVar.c(t5aVar, this) != bx2Var) {
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
                h8a h8aVar2 = n69Var.e;
                int intValue = num3 == 0 ? num3.intValue() : n69.g;
                n69Var.a.getClass();
                t5a t5aVar2 = new t5a(bool, d, num, new Integer(intValue), new Long(snb.a().c));
                this.b = true;
                return h8aVar2.c(t5aVar2, this) != bx2Var ? bx2Var : obj2;
            default:
                boolean z9 = this.b;
                if (!z9) {
                    qse.b(obj);
                    Object obj7 = this.c;
                    this.b = true;
                    return ((ik4) obj3).c(obj7, this) == bx2Var ? bx2Var : obj2;
                }
                if (z9) {
                    qse.b(obj);
                    return obj2;
                }
                sc8.j("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai1(Object obj, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.d = obj;
    }
}
