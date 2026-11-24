// default package

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class a17 implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jm7 c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a17(k17 k17Var, String str, boolean z, TLRPC.User user, String str2, cf7 cf7Var, String str3) {
        this.c = k17Var;
        this.d = str;
        this.b = z;
        this.g = user;
        this.e = str2;
        this.h = cf7Var;
        this.f = str3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean[] zArr;
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Serializable serializable = this.f;
        Object obj3 = this.e;
        Serializable serializable2 = this.d;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                gm.c3(new oq6((k17) jm7Var, (String) serializable2, this.b, tLObject, (TLRPC.User) obj2, (String) obj3, (cf7) obj, (String) serializable, (byte) 4));
                break;
            default:
                a6a a6aVar = (a6a) jm7Var;
                ArrayList arrayList = (ArrayList) serializable2;
                TLObject tLObject2 = (TLObject) obj3;
                ArrayList arrayList2 = (ArrayList) serializable;
                ArrayList arrayList3 = (ArrayList) obj2;
                m5a m5aVar = (m5a) obj;
                boolean z = this.b;
                if (tL_error != null && ad4.r(tL_error.text)) {
                    int c = ad4.c(tL_error.text);
                    if (arrayList == null) {
                        if (m5aVar != null) {
                            if (!((c < 0 || (zArr = m5aVar.s) == null || c >= zArr.length) ? m5aVar.r : zArr[c])) {
                                if (c < 0) {
                                    m5aVar.r = true;
                                } else {
                                    boolean[] zArr2 = m5aVar.s;
                                    if (zArr2 == null) {
                                        zArr2 = new boolean[m5aVar.x.size()];
                                        m5aVar.s = zArr2;
                                    }
                                    zArr2[c] = true;
                                }
                                gm.c3(new m25(a6aVar, tLObject2, c, m5aVar, arrayList2, z, (byte) 3));
                                break;
                            }
                        }
                    } else {
                        ArrayList arrayList4 = new ArrayList(arrayList);
                        if (c >= 0) {
                            int i = 0;
                            while (i < arrayList4.size()) {
                                arrayList4.set(i, c == i ? arrayList4.get(i) : null);
                                i++;
                            }
                        }
                        a6aVar.getFileRefController().u(new Object[]{tLObject2, arrayList2, arrayList3, arrayList4, m5aVar, Boolean.valueOf(z)}, arrayList4);
                        break;
                    }
                }
                gm.c3(new q4a(a6aVar, tL_error, tLObject, z, arrayList2, arrayList3, tLObject2));
                break;
        }
    }

    public /* synthetic */ a17(a6a a6aVar, ArrayList arrayList, TLObject tLObject, ArrayList arrayList2, ArrayList arrayList3, m5a m5aVar, boolean z) {
        this.c = a6aVar;
        this.d = arrayList;
        this.e = tLObject;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = m5aVar;
        this.b = z;
    }
}
