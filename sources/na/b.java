package na;

import android.util.Log;
import dd.p;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import k7.p7;
import kotlin.jvm.internal.q;
import l7.w0;
import ld.c0;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends wc.i implements p {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public Serializable e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(w0 w0Var, Map map, b bVar, c cVar, uc.c cVar2) {
        super(2, cVar2);
        this.d = w0Var;
        this.c = map;
        this.e = bVar;
        this.f = cVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        switch (this.a) {
            case 0:
                b bVar = new b((d) this.f, cVar);
                bVar.c = obj;
                return bVar;
            default:
                return new b((w0) this.d, this.c, (b) this.e, (c) this.f, cVar);
        }
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((b) create((JSONObject) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
            default:
                return ((b) create((c0) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
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
    @Override // wc.a
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
        sc.i iVar;
        Object c3;
        switch (this.a) {
            case 0:
                k kVar = ((d) this.f).c;
                vc.a aVar = vc.a.a;
                int i10 = this.b;
                n1.d dVar = k.f;
                sc.i iVar2 = sc.i.a;
                switch (i10) {
                    case 0:
                        p7.b(obj);
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
                            } catch (JSONException e) {
                                e = e;
                                bool = null;
                            }
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
                            } catch (JSONException e6) {
                                e = e6;
                                Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                                if (bool == null) {
                                }
                            }
                        } else {
                            bool = null;
                        }
                        if (bool == null) {
                            this.c = qVar6;
                            this.d = qVar;
                            this.e = qVar7;
                            this.b = 1;
                            Object c10 = kVar.c(k.c, bool, this);
                            if (c10 != vc.a.a) {
                                c10 = iVar2;
                            }
                            if (c10 == aVar) {
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
                                Object c11 = kVar.c(k.e, (Integer) obj2, this);
                                if (c11 != vc.a.a) {
                                    c11 = iVar2;
                                }
                                if (c11 == aVar) {
                                    return aVar;
                                }
                            }
                            obj3 = qVar2.a;
                            if (((Double) obj3) != null) {
                                this.c = qVar3;
                                this.d = null;
                                this.e = null;
                                this.b = 3;
                                Object c12 = kVar.c(k.d, (Double) obj3, this);
                                if (c12 != vc.a.a) {
                                    c12 = iVar2;
                                }
                                if (c12 == aVar) {
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
                                c3 = kVar.c(k.g, l10, this);
                                if (c3 != vc.a.a) {
                                }
                                if (c3 == aVar) {
                                }
                                return iVar2;
                            }
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.b = 4;
                            Object c13 = kVar.c(dVar, (Integer) obj4, this);
                            if (c13 != vc.a.a) {
                                c13 = iVar2;
                            }
                            if (c13 == aVar) {
                                return aVar;
                            }
                            iVar = iVar2;
                            if (iVar == null) {
                                Integer num = new Integer(86400);
                                this.c = null;
                                this.d = null;
                                this.e = null;
                                this.b = 5;
                                Object c14 = kVar.c(dVar, num, this);
                                if (c14 != vc.a.a) {
                                    c14 = iVar2;
                                }
                                if (c14 == aVar) {
                                    return aVar;
                                }
                            }
                            Long l102 = new Long(System.currentTimeMillis());
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.b = 6;
                            c3 = kVar.c(k.g, l102, this);
                            if (c3 != vc.a.a) {
                                c3 = iVar2;
                            }
                            if (c3 == aVar) {
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
                        p7.b(obj);
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
                        p7.b(obj);
                        obj3 = qVar2.a;
                        if (((Double) obj3) != null) {
                        }
                        obj4 = qVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 3:
                        qVar3 = (q) this.c;
                        p7.b(obj);
                        obj4 = qVar3.a;
                        if (((Integer) obj4) == null) {
                        }
                        break;
                    case 4:
                        p7.b(obj);
                        iVar = iVar2;
                        if (iVar == null) {
                        }
                        Long l1022 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c3 = kVar.c(k.g, l1022, this);
                        if (c3 != vc.a.a) {
                        }
                        if (c3 == aVar) {
                        }
                        return iVar2;
                    case 5:
                        p7.b(obj);
                        Long l10222 = new Long(System.currentTimeMillis());
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.b = 6;
                        c3 = kVar.c(k.g, l10222, this);
                        if (c3 != vc.a.a) {
                        }
                        if (c3 == aVar) {
                        }
                        return iVar2;
                    case 6:
                        p7.b(obj);
                        return iVar2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                c cVar = (c) this.f;
                vc.a aVar2 = vc.a.a;
                int i11 = this.b;
                sc.i iVar3 = sc.i.a;
                try {
                    if (i11 == 0) {
                        p7.b(obj);
                        URLConnection openConnection = w0.g((w0) this.d).openConnection();
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
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb.append(readLine);
                                } else {
                                    bufferedReader.close();
                                    inputStream.close();
                                    JSONObject jSONObject3 = new JSONObject(sb.toString());
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
                        p7.b(obj);
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p7.b(obj);
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
    public b(d dVar, uc.c cVar) {
        super(2, cVar);
        this.f = dVar;
    }
}
