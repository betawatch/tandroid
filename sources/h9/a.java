package h9;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import d5.k;
import g9.e2;
import g9.o0;
import g9.r0;
import g9.x0;
import h3.f1;
import ha.g0;
import ha.m;
import ha.m0;
import ha.q0;
import ha.t;
import ja.h;
import java.util.List;
import y8.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements b, d, k {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i9) {
        this.a = i9;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        m mVar;
        m0 m0Var;
        g0 g0Var;
        h hVar;
        t tVar;
        q0 q0Var;
        switch (this.a) {
            case 5:
                mVar = FirebaseSessionsRegistrar.getComponents$lambda-0(bVar);
                return mVar;
            case 6:
                m0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(bVar);
                return m0Var;
            case 7:
                g0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(bVar);
                return g0Var;
            case 8:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(bVar);
                return hVar;
            case 9:
                tVar = FirebaseSessionsRegistrar.getComponents$lambda-4(bVar);
                return tVar;
            default:
                q0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(bVar);
                return q0Var;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // h9.b
    public Object a(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        int i9 = 3;
        String str = null;
        Long l10 = null;
        boolean z10 = false;
        switch (this.a) {
            case 0:
                com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(9, z10);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1536268810:
                            if (nextName.equals("parameterKey")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1027290370:
                            if (nextName.equals("templateVersion")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1098747284:
                            if (nextName.equals("rolloutVariant")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1124454216:
                            if (nextName.equals("parameterValue")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            String nextString = jsonReader.nextString();
                            if (nextString == null) {
                                throw new NullPointerException("Null parameterKey");
                            }
                            tVar.b = nextString;
                            break;
                        case 1:
                            tVar.e = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            jsonReader.beginObject();
                            String str2 = null;
                            String str3 = null;
                            while (jsonReader.hasNext()) {
                                String nextName2 = jsonReader.nextName();
                                nextName2.getClass();
                                if (nextName2.equals("variantId")) {
                                    str3 = jsonReader.nextString();
                                    if (str3 == null) {
                                        throw new NullPointerException("Null variantId");
                                    }
                                } else if (nextName2.equals("rolloutId")) {
                                    str2 = jsonReader.nextString();
                                    if (str2 == null) {
                                        throw new NullPointerException("Null rolloutId");
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            String str4 = str2 == null ? " rolloutId" : "";
                            if (str3 == null) {
                                str4 = str4.concat(" variantId");
                            }
                            if (!str4.isEmpty()) {
                                throw new IllegalStateException("Missing required properties:".concat(str4));
                            }
                            tVar.c = new x0(str2, str3);
                            break;
                        case 3:
                            String nextString2 = jsonReader.nextString();
                            if (nextString2 == null) {
                                throw new NullPointerException("Null parameterValue");
                            }
                            tVar.d = nextString2;
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return tVar.l();
            case 1:
                jsonReader.beginObject();
                Integer num = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName3 = jsonReader.nextName();
                    nextName3.getClass();
                    switch (nextName3.hashCode()) {
                        case -1266514778:
                            if (nextName3.equals("frames")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 3373707:
                            if (nextName3.equals("name")) {
                                c11 = 1;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 2125650548:
                            if (nextName3.equals("importance")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            list = c.d(jsonReader, new a(i9));
                            if (list == null) {
                                throw new NullPointerException("Null frames");
                            }
                            continue;
                        case 1:
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case 2:
                            num = Integer.valueOf(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String str5 = str != null ? "" : " name";
                if (num == null) {
                    str5 = str5.concat(" importance");
                }
                if (list == null) {
                    str5 = ta.b.j(str5, " frames");
                }
                if (str5.isEmpty()) {
                    return new r0(str, num.intValue(), list);
                }
                throw new IllegalStateException("Missing required properties:".concat(str5));
            case 2:
                jsonReader.beginObject();
                Long l11 = null;
                String str6 = null;
                String str7 = null;
                while (jsonReader.hasNext()) {
                    String nextName4 = jsonReader.nextName();
                    nextName4.getClass();
                    switch (nextName4.hashCode()) {
                        case 3373707:
                            if (nextName4.equals("name")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3530753:
                            if (nextName4.equals("size")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 3601339:
                            if (nextName4.equals("uuid")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 1153765347:
                            if (nextName4.equals("baseAddress")) {
                                c12 = 3;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            String nextString3 = jsonReader.nextString();
                            if (nextString3 == null) {
                                throw new NullPointerException("Null name");
                            }
                            str6 = nextString3;
                            break;
                        case 1:
                            l11 = Long.valueOf(jsonReader.nextLong());
                            break;
                        case 2:
                            str7 = new String(Base64.decode(jsonReader.nextString(), 2), e2.a);
                            break;
                        case 3:
                            l10 = Long.valueOf(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                String str8 = l10 == null ? " baseAddress" : "";
                if (l11 == null) {
                    str8 = str8.concat(" size");
                }
                if (str6 == null) {
                    str8 = ta.b.j(str8, " name");
                }
                if (str8.isEmpty()) {
                    return new o0(str6, l10.longValue(), l11.longValue(), str7);
                }
                throw new IllegalStateException("Missing required properties:".concat(str8));
            default:
                return c.a(jsonReader);
        }
    }

    @Override // d5.k
    public void invoke(Object obj) {
        i3.b bVar = (i3.b) obj;
        switch (this.a) {
            case 15:
                bVar.getClass();
                break;
            case 16:
                bVar.getClass();
                break;
            case 17:
                bVar.getClass();
                break;
            case 18:
                bVar.getClass();
                break;
            case 19:
                bVar.getClass();
                break;
            case 20:
                bVar.getClass();
                break;
            case 21:
                bVar.getClass();
                break;
            case 22:
                bVar.getClass();
                break;
            case 23:
                bVar.getClass();
                break;
            case 24:
                bVar.getClass();
                break;
            case 25:
                bVar.getClass();
                break;
            case 26:
                bVar.getClass();
                break;
            case 27:
                bVar.getClass();
                break;
            case 28:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ a(i3.a aVar, int i9, int i10) {
        this.a = 25;
    }

    public /* synthetic */ a(i3.a aVar, f1 f1Var, int i9) {
        this.a = 26;
    }

    public /* synthetic */ a(i3.a aVar, Object obj, int i9) {
        this.a = i9;
    }

    public /* synthetic */ a(i3.a aVar, Object obj, Object obj2, int i9) {
        this.a = i9;
    }

    public /* synthetic */ a(i3.a aVar, boolean z10) {
        this.a = 17;
    }

    public /* synthetic */ a(i3.a aVar, boolean z10, int i9, int i10) {
        this.a = i10;
    }
}
