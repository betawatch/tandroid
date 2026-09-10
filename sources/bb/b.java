package bb;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import rd.p;
import v7.u7;
import zd.c0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b extends kd.j implements p {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Serializable e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aa.a aVar, Map map, b bVar, c cVar, id.c cVar2) {
        super(2, cVar2);
        this.d = aVar;
        this.c = map;
        this.e = bVar;
        this.f = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        switch (this.a) {
            case 0:
                b bVar = new b((d) this.f, cVar);
                bVar.c = obj;
                return bVar;
            default:
                return new b((aa.a) this.d, this.c, (b) this.e, (c) this.f, cVar);
        }
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((b) create((JSONObject) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
            default:
                return ((b) create((c0) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.p pVar;
        Boolean bool;
        kotlin.jvm.internal.p pVar2;
        kotlin.jvm.internal.p pVar3;
        kotlin.jvm.internal.p pVar4;
        kotlin.jvm.internal.p pVar5;
        Object obj2;
        Object obj3;
        Object obj4;
        gd.i iVar;
        Object c10;
        switch (this.a) {
            case 0:
                l lVar = ((d) this.f).c;
                jd.a aVar = jd.a.a;
                int i10 = this.b;
                n1.d dVar = l.f;
                gd.i iVar2 = gd.i.a;
                switch (i10) {
                    case 0:
                        u7.b(obj);
                        JSONObject jSONObject = (JSONObject) this.c;
                        Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                        kotlin.jvm.internal.p pVar6 = new kotlin.jvm.internal.p();
                        pVar = new kotlin.jvm.internal.p();
                        kotlin.jvm.internal.p pVar7 = new kotlin.jvm.internal.p();
                        if (jSONObject.has("app_quality")) {
                            Object obj5 = jSONObject.get("app_quality");
                            kotlin.jvm.internal.i.c(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject2 = (JSONObject) obj5;
                            try {
                                bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                            } catch (JSONException e) {
                                e = e;
                                bool = null;
                            }
                            try {
                                if (jSONObject2.has("sampling_rate")) {
                                    pVar6.a = (Double) jSONObject2.get("sampling_rate");
                                }
                                if (jSONObject2.has("session_timeout_seconds")) {
                                    pVar.a = (Integer) jSONObject2.get("session_timeout_seconds");
                                }
                                if (jSONObject2.has("cache_duration")) {
                                    pVar7.a = (Integer) jSONObject2.get("cache_duration");
                                }
                            } catch (JSONException e7) {
                                e = e7;
                                Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                                if (bool == null) {
                                }
                            }
                        } else {
                            bool = null;
                        }
                        if (bool == null) {
                            this.c = pVar6;
                            this.d = pVar;
                            this.e = pVar7;
                            this.b = 1;
                            Object c11 = lVar.c(l.c, bool, this);
                            if (c11 != jd.a.a) {
                                c11 = iVar2;
                            }
                            if (c11 == aVar) {
                                return aVar;
                            }
                            pVar4 = pVar6;
                            pVar5 = pVar;
                            pVar3 = pVar7;
                            pVar = pVar5;
                            pVar2 = pVar4;
                            obj2 = pVar.a;
                            if (((Integer) obj2) != null) {
                                this.c = pVar2;
                                this.d = pVar3;
                                this.e = null;
                                this.b = 2;
                                Object c12 = lVar.c(l.e, (Integer) obj2, this);
                                if (c12 != jd.a.a) {
                                    c12 = iVar2;
                                }
                                if (c12 == aVar) {
                                    return aVar;
                                }
                            }
                            obj3 = pVar2.a;
                            if (((Double) obj3) != null) {
                                this.c = pVar3;
                                this.d = null;
                                this.e = null;
                                this.b = 3;
                                Object c13 = lVar.c(l.d, (Double) obj3, this);
                                if (c13 != jd.a.a) {
                                    c13 = iVar2;
                                }
                                if (c13 == aVar) {
                                    return aVar;
                                }
                            }
                            obj4 = pVar3.a;
                            if (((Integer) obj4) == null) {
                                iVar = null;
                                if (iVar == null) {
                                }
                                Long l4 = new Long(System.currentTimeMillis());
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.b = 6;
                                c10 = lVar.c(l.g, l4, this);
                                if (c10 != jd.a.a) {
                                }
                                if (c10 == aVar) {
                                }
                                return iVar2;
                            }
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.b = 4;
                            Object c14 = lVar.c(dVar, (Integer) obj4, this);
                            if (c14 != jd.a.a) {
                                c14 = iVar2;
                            }
                            if (c14 == aVar) {
                                return aVar;
                            }
                            iVar = iVar2;
                            if (iVar == null) {
                                Integer num = new Integer(86400);
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.b = 5;
                                Object c15 = lVar.c(dVar, num, this);
                                if (c15 != jd.a.a) {
                                    c15 = iVar2;
                                }
                                if (c15 == aVar) {
                                    return aVar;
                                }
                            }
                            Long l42 = new Long(System.currentTimeMillis());
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.b = 6;
                            c10 = lVar.c(l.g, l42, this);
                            if (c10 != jd.a.a) {
                                c10 = iVar2;
                            }
                            if (c10 == aVar) {
                                return aVar;
                            }
                            return iVar2;
                        }
                        pVar2 = pVar6;
                        pVar3 = pVar7;
                        obj2 = pVar.a;
                        if (((Integer) obj2) != null) {
                        }
                        obj3 = pVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = pVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                    case 1:
                        pVar3 = (kotlin.jvm.internal.p) this.e;
                        pVar5 = (kotlin.jvm.internal.p) this.d;
                        pVar4 = (kotlin.jvm.internal.p) this.c;
                        u7.b(obj);
                        pVar = pVar5;
                        pVar2 = pVar4;
                        obj2 = pVar.a;
                        if (((Integer) obj2) != null) {
                        }
                        obj3 = pVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = pVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 2:
                        pVar3 = (kotlin.jvm.internal.p) this.d;
                        pVar2 = (kotlin.jvm.internal.p) this.c;
                        u7.b(obj);
                        obj3 = pVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = pVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 3:
                        pVar3 = (kotlin.jvm.internal.p) this.c;
                        u7.b(obj);
                        obj4 = pVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 4:
                        u7.b(obj);
                        iVar = iVar2;
                        if (iVar == null) {
                        }
                        Long l422 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c10 = lVar.c(l.g, l422, this);
                        if (c10 != jd.a.a) {
                        }
                        if (c10 == aVar) {
                        }
                        return iVar2;
                    case 5:
                        u7.b(obj);
                        Long l4222 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c10 = lVar.c(l.g, l4222, this);
                        if (c10 != jd.a.a) {
                        }
                        if (c10 == aVar) {
                        }
                        return iVar2;
                    case 6:
                        u7.b(obj);
                        return iVar2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                c cVar = (c) this.f;
                jd.a aVar2 = jd.a.a;
                int i11 = this.b;
                gd.i iVar3 = gd.i.a;
                try {
                    if (i11 == 0) {
                        u7.b(obj);
                        URLConnection openConnection = aa.a.b((aa.a) this.d).openConnection();
                        kotlin.jvm.internal.i.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                        httpsURLConnection.setRequestMethod("GET");
                        httpsURLConnection.setRequestProperty("Accept", "application/json");
                        for (Map.Entry entry : this.c.entrySet()) {
                            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        int responseCode = httpsURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            InputStream inputStream = httpsURLConnection.getInputStream();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb2.append(readLine);
                                } else {
                                    bufferedReader.close();
                                    inputStream.close();
                                    JSONObject jSONObject3 = new JSONObject(sb2.toString());
                                    b bVar = (b) this.e;
                                    this.b = 1;
                                    if (bVar.invoke(jSONObject3, this) == aVar2) {
                                        return aVar2;
                                    }
                                }
                            }
                        } else {
                            this.b = 2;
                            cVar.invoke("Bad response code: " + responseCode, this);
                            if (iVar3 == aVar2) {
                                return aVar2;
                            }
                        }
                    } else if (i11 == 1 || i11 == 2) {
                        u7.b(obj);
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u7.b(obj);
                    }
                } catch (Exception e10) {
                    String message = e10.getMessage();
                    if (message == null) {
                        message = e10.toString();
                    }
                    this.b = 3;
                    cVar.invoke(message, this);
                    if (iVar3 == aVar2) {
                        return aVar2;
                    }
                }
                return iVar3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, id.c cVar) {
        super(2, cVar);
        this.f = dVar;
    }
}
