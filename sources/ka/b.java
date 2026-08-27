package ka;

import ad.p;
import android.util.Log;
import h7.k6;
import id.c0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends tc.i implements p {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Serializable e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j9.a aVar, Map map, b bVar, c cVar, rc.c cVar2) {
        super(2, cVar2);
        this.d = aVar;
        this.c = map;
        this.e = bVar;
        this.f = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // tc.a
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.a) {
            case 0:
                b bVar = new b((d) this.f, cVar);
                bVar.c = obj;
                return bVar;
            default:
                return new b((j9.a) this.d, this.c, (b) this.e, (c) this.f, cVar);
        }
    }

    @Override // ad.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((b) create((JSONObject) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
            default:
                return ((b) create((c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.a);
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
    @Override // tc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q qVar;
        Boolean bool;
        q qVar2;
        q qVar3;
        q qVar4;
        q qVar5;
        Object obj2;
        Object obj3;
        Object obj4;
        pc.i iVar;
        Object c10;
        switch (this.a) {
            case 0:
                k kVar = ((d) this.f).c;
                sc.a aVar = sc.a.a;
                int i10 = this.b;
                n1.e eVar = k.f;
                pc.i iVar2 = pc.i.a;
                switch (i10) {
                    case 0:
                        k6.b(obj);
                        JSONObject jSONObject = (JSONObject) this.c;
                        Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                        q qVar6 = new q();
                        qVar = new q();
                        q qVar7 = new q();
                        if (jSONObject.has("app_quality")) {
                            Object obj5 = jSONObject.get("app_quality");
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject2 = (JSONObject) obj5;
                            try {
                                bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                                try {
                                    if (jSONObject2.has("sampling_rate")) {
                                        qVar6.a = (Double) jSONObject2.get("sampling_rate");
                                    }
                                    if (jSONObject2.has("session_timeout_seconds")) {
                                        qVar.a = (Integer) jSONObject2.get("session_timeout_seconds");
                                    }
                                    if (jSONObject2.has("cache_duration")) {
                                        qVar7.a = (Integer) jSONObject2.get("cache_duration");
                                    }
                                } catch (JSONException e9) {
                                    e = e9;
                                    Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                                    if (bool == null) {
                                    }
                                }
                            } catch (JSONException e10) {
                                e = e10;
                                bool = null;
                            }
                        } else {
                            bool = null;
                        }
                        if (bool == null) {
                            this.c = qVar6;
                            this.d = qVar;
                            this.e = qVar7;
                            this.b = 1;
                            Object c11 = kVar.c(k.c, bool, this);
                            if (c11 != sc.a.a) {
                                c11 = iVar2;
                            }
                            if (c11 == aVar) {
                                return aVar;
                            }
                            qVar4 = qVar6;
                            qVar5 = qVar;
                            qVar3 = qVar7;
                            qVar = qVar5;
                            qVar2 = qVar4;
                            obj2 = qVar.a;
                            if (((Integer) obj2) != null) {
                                this.c = qVar2;
                                this.d = qVar3;
                                this.e = null;
                                this.b = 2;
                                Object c12 = kVar.c(k.e, (Integer) obj2, this);
                                if (c12 != sc.a.a) {
                                    c12 = iVar2;
                                }
                                if (c12 == aVar) {
                                    return aVar;
                                }
                            }
                            obj3 = qVar2.a;
                            if (((Double) obj3) != null) {
                                this.c = qVar3;
                                this.d = null;
                                this.e = null;
                                this.b = 3;
                                Object c13 = kVar.c(k.d, (Double) obj3, this);
                                if (c13 != sc.a.a) {
                                    c13 = iVar2;
                                }
                                if (c13 == aVar) {
                                    return aVar;
                                }
                            }
                            obj4 = qVar3.a;
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
                                if (c10 != sc.a.a) {
                                }
                                if (c10 == aVar) {
                                }
                                return iVar2;
                            }
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.b = 4;
                            Object c14 = kVar.c(eVar, (Integer) obj4, this);
                            if (c14 != sc.a.a) {
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
                                Object c15 = kVar.c(eVar, num, this);
                                if (c15 != sc.a.a) {
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
                            if (c10 != sc.a.a) {
                                c10 = iVar2;
                            }
                            if (c10 == aVar) {
                                return aVar;
                            }
                            return iVar2;
                        }
                        qVar2 = qVar6;
                        qVar3 = qVar7;
                        obj2 = qVar.a;
                        if (((Integer) obj2) != null) {
                        }
                        obj3 = qVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = qVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                    case 1:
                        qVar3 = (q) this.e;
                        qVar5 = (q) this.d;
                        qVar4 = (q) this.c;
                        k6.b(obj);
                        qVar = qVar5;
                        qVar2 = qVar4;
                        obj2 = qVar.a;
                        if (((Integer) obj2) != null) {
                        }
                        obj3 = qVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = qVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 2:
                        qVar3 = (q) this.d;
                        qVar2 = (q) this.c;
                        k6.b(obj);
                        obj3 = qVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = qVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 3:
                        qVar3 = (q) this.c;
                        k6.b(obj);
                        obj4 = qVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 4:
                        k6.b(obj);
                        iVar = iVar2;
                        if (iVar == null) {
                        }
                        Long l1022 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c10 = kVar.c(k.g, l1022, this);
                        if (c10 != sc.a.a) {
                        }
                        if (c10 == aVar) {
                        }
                        return iVar2;
                    case 5:
                        k6.b(obj);
                        Long l10222 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c10 = kVar.c(k.g, l10222, this);
                        if (c10 != sc.a.a) {
                        }
                        if (c10 == aVar) {
                        }
                        return iVar2;
                    case 6:
                        k6.b(obj);
                        return iVar2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                c cVar = (c) this.f;
                sc.a aVar2 = sc.a.a;
                int i11 = this.b;
                pc.i iVar3 = pc.i.a;
                try {
                    if (i11 == 0) {
                        k6.b(obj);
                        URLConnection openConnection = j9.a.p((j9.a) this.d).openConnection();
                        kotlin.jvm.internal.j.c(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
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
                        k6.b(obj);
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k6.b(obj);
                    }
                } catch (Exception e11) {
                    String message = e11.getMessage();
                    if (message == null) {
                        message = e11.toString();
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
    public b(d dVar, rc.c cVar) {
        super(2, cVar);
        this.f = dVar;
    }
}
