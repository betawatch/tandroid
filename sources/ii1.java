// default package

import android.util.Log;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ii1 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii1(Object obj, Object obj2, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ii1 ii1Var = new ii1((ji1) obj2, zw2Var, (byte) 0);
                ii1Var.c = obj;
                return ii1Var;
            case 1:
                ii1 ii1Var2 = new ii1((ji1) obj2, zw2Var, (byte) 1);
                ii1Var2.c = obj;
                return ii1Var2;
            case 2:
                ii1 ii1Var3 = new ii1((o4a) obj2, zw2Var, (byte) 2);
                ii1Var3.c = obj;
                return ii1Var3;
            case 3:
                ii1 ii1Var4 = new ii1((List) obj2, zw2Var, (byte) 3);
                ii1Var4.c = obj;
                return ii1Var4;
            case 4:
                return new ii1((is4) this.c, (k63) obj2, zw2Var, (byte) 4);
            case 5:
                ii1 ii1Var5 = new ii1((o83) obj2, zw2Var, (byte) 5);
                ii1Var5.c = obj;
                return ii1Var5;
            case 6:
                return new ii1((av5) this.c, (ur4) obj2, zw2Var, (byte) 6);
            case 7:
                ii1 ii1Var6 = new ii1((aa9) obj2, zw2Var, (byte) 7);
                ii1Var6.c = obj;
                return ii1Var6;
            default:
                ii1 ii1Var7 = new ii1((nm4) obj2, zw2Var, (byte) 8);
                ii1Var7.c = obj;
                return ii1Var7;
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g9c g9cVar = g9c.a;
        switch (b) {
            case 0:
                return ((ii1) create((so8) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 1:
                return ((ii1) create((nm4) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 2:
                return ((ii1) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 3:
                return ((ii1) create((r73) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 4:
                return ((ii1) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 5:
                return ((ii1) create((k37) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 6:
                return ((ii1) create((ux2) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            case 7:
                return ((ii1) create((JSONObject) obj, (zw2) obj2)).invokeSuspend(g9cVar);
            default:
                return ((ii1) create(obj, (zw2) obj2)).invokeSuspend(g9cVar);
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
    /* JADX WARN: Type inference failed for: r7v0, types: [zw2] */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object invoke;
        Object ge9Var;
        Object a;
        Boolean bool;
        Double d;
        Integer num;
        Integer num2;
        Double d2;
        Boolean bool2;
        byte b = this.a;
        Object obj2 = g9c.a;
        Object obj3 = this.d;
        byte b2 = 1;
        vx2 vx2Var = vx2.a;
        Integer num3 = 0;
        r7 = null;
        Integer num4 = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                        return obj2;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                so8 so8Var = (so8) this.c;
                ji1 ji1Var = (ji1) obj3;
                this.b = true;
                switch (ji1Var.d) {
                    case 0:
                        invoke = ((a83) ji1Var.e).invoke(so8Var, this);
                        break;
                    default:
                        invoke = ((mm4) ji1Var.e).k(new d8a(so8Var), this);
                        if (invoke != vx2Var) {
                            invoke = obj2;
                            break;
                        }
                        break;
                }
                return invoke == vx2Var ? vx2Var : obj2;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        ixe.b(obj);
                        return obj2;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                nm4 nm4Var = (nm4) this.c;
                this.b = true;
                Object k = ((mm4) ((ji1) obj3).e).k(nm4Var, this);
                if (k != vx2Var) {
                    k = obj2;
                }
                return k == vx2Var ? vx2Var : obj2;
            case 2:
                boolean z3 = this.b;
                try {
                    if (!z3) {
                        ixe.b(obj);
                        o4a o4aVar = (o4a) obj3;
                        this.b = true;
                        if (o4aVar.a(this, obj2) == vx2Var) {
                            return vx2Var;
                        }
                    } else {
                        if (!z3) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ixe.b(obj);
                    }
                    ge9Var = obj2;
                } catch (Throwable th) {
                    ge9Var = new ge9(th);
                }
                if (ge9Var instanceof ge9) {
                    obj2 = new nj1(he9.a(ge9Var));
                }
                return new pj1(obj2);
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    ixe.b(obj);
                    r73 r73Var = (r73) this.c;
                    this.b = true;
                    return tk6.c.O((List) obj3, r73Var, this) == vx2Var ? vx2Var : obj2;
                }
                if (z4) {
                    ixe.b(obj);
                    return obj2;
                }
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        ixe.b(obj);
                        return obj;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                is4 is4Var = (is4) this.c;
                Object obj4 = ((k63) obj3).b;
                this.b = true;
                Object invoke2 = is4Var.invoke(obj4, this);
                return invoke2 == vx2Var ? vx2Var : invoke2;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    ixe.b(obj);
                    k37 k37Var = (k37) this.c;
                    this.b = true;
                    return ((o83) obj3).d(k37Var, this) == vx2Var ? vx2Var : obj2;
                }
                if (z6) {
                    ixe.b(obj);
                    return obj2;
                }
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                av5 av5Var = (av5) this.c;
                ThreadLocal threadLocal = av5Var.b;
                boolean z7 = this.b;
                try {
                    if (z7) {
                        if (!z7) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ixe.b(obj);
                        a = obj;
                        return (sj7) a;
                    }
                    ixe.b(obj);
                    Object obj5 = threadLocal.get();
                    Boolean bool3 = Boolean.TRUE;
                    if (ur5.a(obj5, bool3)) {
                        grb.i("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                        return null;
                    }
                    threadLocal.set(bool3);
                    xj8 xj8Var = av5Var.c;
                    w73 w73Var = new w73((ur4) obj3, num3, (byte) 2);
                    this.b = true;
                    a = xj8Var.a(new wj8(w73Var, num3, b2), this);
                    if (a == vx2Var) {
                        return vx2Var;
                    }
                    return (sj7) a;
                } finally {
                    threadLocal.set(Boolean.FALSE);
                }
                threadLocal.set(Boolean.FALSE);
            case 7:
                aa9 aa9Var = (aa9) obj3;
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        ixe.b(obj);
                        return obj2;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
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
                                    mtd.a(Log.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", e));
                                    num = num2;
                                    d = d2;
                                    bool = bool2;
                                    num3 = num4;
                                    yba ybaVar = aa9Var.e;
                                    if (num3 == 0) {
                                    }
                                    aa9Var.a.getClass();
                                    l9a l9aVar = new l9a(bool, d, num, new Integer(r4), new Long(srb.a().c));
                                    this.b = true;
                                    if (ybaVar.c(l9aVar, this) != vx2Var) {
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
                yba ybaVar2 = aa9Var.e;
                int intValue = num3 == 0 ? num3.intValue() : aa9.g;
                aa9Var.a.getClass();
                l9a l9aVar2 = new l9a(bool, d, num, new Integer(intValue), new Long(srb.a().c));
                this.b = true;
                return ybaVar2.c(l9aVar2, this) != vx2Var ? vx2Var : obj2;
            default:
                boolean z9 = this.b;
                if (!z9) {
                    ixe.b(obj);
                    Object obj7 = this.c;
                    this.b = true;
                    return ((nm4) obj3).c(obj7, this) == vx2Var ? vx2Var : obj2;
                }
                if (z9) {
                    ixe.b(obj);
                    return obj2;
                }
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii1(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.d = obj;
    }
}
