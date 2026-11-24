// default package

import android.util.Base64;
import android.util.JsonReader;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class jz2 implements kz2, yyb, x56 {
    public final /* synthetic */ byte a;

    public /* synthetic */ jz2(tj tjVar, int i, int i2) {
        this.a = (byte) 29;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r10.equals("baseAddress") == false) goto L23;
     */
    @Override // kz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(JsonReader jsonReader) {
        boolean z;
        byte b = 2;
        switch (this.a) {
            case 0:
                jsonReader.beginObject();
                byte b2 = 0;
                int i = 0;
                String str = null;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    switch (nextName.hashCode()) {
                        case -1266514778:
                            if (nextName.equals("frames")) {
                                z = false;
                                break;
                            }
                            z = -1;
                            break;
                        case 3373707:
                            if (nextName.equals("name")) {
                                z = true;
                                break;
                            }
                            z = -1;
                            break;
                        case 2125650548:
                            if (nextName.equals("importance")) {
                                z = 2;
                                break;
                            }
                            z = -1;
                            break;
                        default:
                            z = -1;
                            break;
                    }
                    switch (z) {
                        case false:
                            list = lz2.b(jsonReader, new jz2(b));
                            if (list != null) {
                                break;
                            } else {
                                fvc.f("Null frames");
                                return null;
                            }
                        case true:
                            str = jsonReader.nextString();
                            if (str != null) {
                                break;
                            } else {
                                fvc.f("Null name");
                                return null;
                            }
                        case true:
                            i = jsonReader.nextInt();
                            b2 = (byte) (b2 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b2 == 1 && str != null && list != null) {
                    return new y80(str, i, list);
                }
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    sb.append(" name");
                }
                if ((b2 & 1) == 0) {
                    sb.append(" importance");
                }
                if (list == null) {
                    sb.append(" frames");
                }
                sc8.j(ir2.o("Missing required properties:", sb));
                return null;
            case 1:
                jsonReader.beginObject();
                byte b3 = 0;
                String str2 = null;
                String str3 = null;
                long j = 0;
                long j2 = 0;
                while (true) {
                    char c = 3;
                    if (!jsonReader.hasNext()) {
                        jsonReader.endObject();
                        if (b3 == 3 && str2 != null) {
                            return new v80(str2, str3, j, j2);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if ((b3 & 1) == 0) {
                            sb2.append(" baseAddress");
                        }
                        if ((b3 & 2) == 0) {
                            sb2.append(" size");
                        }
                        if (str2 == null) {
                            sb2.append(" name");
                        }
                        sc8.j(ir2.o("Missing required properties:", sb2));
                        return null;
                    }
                    String nextName2 = jsonReader.nextName();
                    nextName2.getClass();
                    switch (nextName2.hashCode()) {
                        case 3373707:
                            if (nextName2.equals("name")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3530753:
                            if (nextName2.equals("size")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3601339:
                            if (nextName2.equals("uuid")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1153765347:
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            str2 = jsonReader.nextString();
                            if (str2 != null) {
                                break;
                            } else {
                                fvc.f("Null name");
                                return null;
                            }
                        case 1:
                            b3 = (byte) (b3 | 2);
                            j2 = jsonReader.nextLong();
                            break;
                        case 2:
                            str3 = new String(Base64.decode(jsonReader.nextString(), 2), hz2.a);
                            break;
                        case 3:
                            b3 = (byte) (b3 | 1);
                            j = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            default:
                return lz2.f(jsonReader);
        }
    }

    @Override // yyb
    public final Object apply(Object obj) {
        w73.b.getClass();
        return lz2.a.q((hz2) obj).getBytes(Charset.forName("UTF-8"));
    }

    @Override // x56
    public final void invoke(Object obj) {
        uj ujVar = (uj) obj;
        switch (this.a) {
            case 9:
                ujVar.getClass();
                break;
            case 10:
                ujVar.getClass();
                break;
            case 11:
                ujVar.getClass();
                break;
            case 12:
                ujVar.getClass();
                break;
            case 13:
                ujVar.getClass();
                break;
            case 14:
                ujVar.getClass();
                break;
            case 15:
                ujVar.getClass();
                break;
            case 16:
                ujVar.getClass();
                break;
            case 17:
                ujVar.getClass();
                break;
            case 18:
                ujVar.getClass();
                break;
            case 19:
                ujVar.getClass();
                break;
            case 20:
                ujVar.getClass();
                break;
            case 21:
                ujVar.getClass();
                break;
            case 22:
                ujVar.getClass();
                break;
            case 23:
                ujVar.getClass();
                break;
            case 24:
                ujVar.getClass();
                break;
            case 25:
                ujVar.getClass();
                break;
            case 26:
                ujVar.getClass();
                break;
            case 27:
                ujVar.getClass();
                break;
            case 28:
                ujVar.getClass();
                break;
            default:
                ujVar.getClass();
                break;
        }
    }

    public /* synthetic */ jz2(tj tjVar, int i, byte b) {
        this.a = b;
    }

    public /* synthetic */ jz2(byte b) {
        this.a = b;
    }

    public /* synthetic */ jz2(tj tjVar, int i, int i2, boolean z) {
        this.a = (byte) 21;
    }

    public /* synthetic */ jz2(tj tjVar, Object obj, byte b) {
        this.a = b;
    }

    public /* synthetic */ jz2(tj tjVar, String str, long j, long j2, byte b) {
        this.a = b;
    }

    public /* synthetic */ jz2(tj tjVar, boolean z) {
        this.a = (byte) 14;
    }

    public /* synthetic */ jz2(tj tjVar, boolean z, int i, byte b) {
        this.a = b;
    }
}
