package ja;

import android.util.Log;
import g7.y5;
import hd.c0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends sc.i implements p {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Serializable e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j4.c cVar, Map map, b bVar, c cVar2, qc.c cVar3) {
        super(2, cVar3);
        this.d = cVar;
        this.c = map;
        this.e = bVar;
        this.f = cVar2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        switch (this.a) {
            case 0:
                b bVar = new b((d) this.f, cVar);
                bVar.c = obj;
                return bVar;
            default:
                return new b((j4.c) this.d, this.c, (b) this.e, (c) this.f, cVar);
        }
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((b) create((JSONObject) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
            default:
                return ((b) create((c0) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f2  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    @Override // sc.a
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
        oc.i iVar;
        Object c10;
        switch (this.a) {
            case 0:
                k kVar = ((d) this.f).c;
                rc.a aVar = rc.a.a;
                int i9 = this.b;
                n1.d dVar = k.f;
                oc.i iVar2 = oc.i.a;
                switch (i9) {
                    case 0:
                        y5.b(obj);
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
                                } catch (JSONException e10) {
                                    e = e10;
                                    Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                                    if (bool == null) {
                                    }
                                }
                            } catch (JSONException e11) {
                                e = e11;
                                bool = null;
                            }
                        } else {
                            bool = null;
                        }
                        if (bool == null) {
                            this.c = pVar6;
                            this.d = pVar;
                            this.e = pVar7;
                            this.b = 1;
                            Object c11 = kVar.c(k.c, bool, this);
                            if (c11 != rc.a.a) {
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
                                Object c12 = kVar.c(k.e, (Integer) obj2, this);
                                if (c12 != rc.a.a) {
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
                                Object c13 = kVar.c(k.d, (Double) obj3, this);
                                if (c13 != rc.a.a) {
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
                                Long l10 = new Long(System.currentTimeMillis());
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.b = 6;
                                c10 = kVar.c(k.g, l10, this);
                                if (c10 != rc.a.a) {
                                }
                                if (c10 == aVar) {
                                }
                                return iVar2;
                            }
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.b = 4;
                            Object c14 = kVar.c(dVar, (Integer) obj4, this);
                            if (c14 != rc.a.a) {
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
                                Object c15 = kVar.c(dVar, num, this);
                                if (c15 != rc.a.a) {
                                    c15 = iVar2;
                                }
                                if (c15 == aVar) {
                                    return aVar;
                                }
                            }
                            Long l102 = new Long(System.currentTimeMillis());
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.b = 6;
                            c10 = kVar.c(k.g, l102, this);
                            if (c10 != rc.a.a) {
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
                        y5.b(obj);
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
                        y5.b(obj);
                        obj3 = pVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = pVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 3:
                        pVar3 = (kotlin.jvm.internal.p) this.c;
                        y5.b(obj);
                        obj4 = pVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 4:
                        y5.b(obj);
                        iVar = iVar2;
                        if (iVar == null) {
                        }
                        Long l1022 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c10 = kVar.c(k.g, l1022, this);
                        if (c10 != rc.a.a) {
                        }
                        if (c10 == aVar) {
                        }
                        return iVar2;
                    case 5:
                        y5.b(obj);
                        Long l10222 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c10 = kVar.c(k.g, l10222, this);
                        if (c10 != rc.a.a) {
                        }
                        if (c10 == aVar) {
                        }
                        return iVar2;
                    case 6:
                        y5.b(obj);
                        return iVar2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                c cVar = (c) this.f;
                rc.a aVar2 = rc.a.a;
                int i10 = this.b;
                oc.i iVar3 = oc.i.a;
                try {
                    if (i10 == 0) {
                        y5.b(obj);
                        URLConnection openConnection = j4.c.o((j4.c) this.d).openConnection();
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
                    } else if (i10 == 1 || i10 == 2) {
                        y5.b(obj);
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y5.b(obj);
                    }
                } catch (Exception e12) {
                    String message = e12.getMessage();
                    if (message == null) {
                        message = e12.toString();
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
    public b(d dVar, qc.c cVar) {
        super(2, cVar);
        this.f = dVar;
    }
}
