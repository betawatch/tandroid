// default package

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h17 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fn7 c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h17(r17 r17Var, String str, boolean z, TLRPC.User user, String str2, jf7 jf7Var, String str3) {
        this.c = r17Var;
        this.d = str;
        this.b = z;
        this.g = user;
        this.e = str2;
        this.h = jf7Var;
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
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                hl.c3(new oq6((r17) fn7Var, (String) serializable2, this.b, tLObject, (TLRPC.User) obj2, (String) obj3, (jf7) obj, (String) serializable, (byte) 4));
                break;
            default:
                r7a r7aVar = (r7a) fn7Var;
                ArrayList arrayList = (ArrayList) serializable2;
                TLObject tLObject2 = (TLObject) obj3;
                ArrayList arrayList2 = (ArrayList) serializable;
                ArrayList arrayList3 = (ArrayList) obj2;
                d7a d7aVar = (d7a) obj;
                boolean z = this.b;
                if (tL_error != null && xc4.r(tL_error.text)) {
                    int c = xc4.c(tL_error.text);
                    if (arrayList == null) {
                        if (d7aVar != null) {
                            if (!((c < 0 || (zArr = d7aVar.s) == null || c >= zArr.length) ? d7aVar.r : zArr[c])) {
                                if (c < 0) {
                                    d7aVar.r = true;
                                } else {
                                    boolean[] zArr2 = d7aVar.s;
                                    if (zArr2 == null) {
                                        zArr2 = new boolean[d7aVar.x.size()];
                                        d7aVar.s = zArr2;
                                    }
                                    zArr2[c] = true;
                                }
                                hl.c3(new q25((Object) r7aVar, tLObject2, c, (Object) d7aVar, (Object) arrayList2, z, (byte) 4));
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
                        r7aVar.getFileRefController().u(new Object[]{tLObject2, arrayList2, arrayList3, arrayList4, d7aVar, Boolean.valueOf(z)}, arrayList4);
                        break;
                    }
                }
                hl.c3(new d6a(r7aVar, tL_error, tLObject, z, arrayList2, arrayList3, tLObject2));
                break;
        }
    }

    public /* synthetic */ h17(r7a r7aVar, ArrayList arrayList, TLObject tLObject, ArrayList arrayList2, ArrayList arrayList3, d7a d7aVar, boolean z) {
        this.c = r7aVar;
        this.d = arrayList;
        this.e = tLObject;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = d7aVar;
        this.b = z;
    }
}
