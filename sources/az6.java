// default package

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class az6 implements RequestDelegate {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gk7 c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ az6(kz6 kz6Var, String str, boolean z, TLRPC.User user, String str2, ad7 ad7Var, String str3) {
        this.c = kz6Var;
        this.d = str;
        this.b = z;
        this.g = user;
        this.e = str2;
        this.h = ad7Var;
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
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                gl.d3(new oo6((kz6) gk7Var, (String) serializable2, this.b, tLObject, (TLRPC.User) obj2, (String) obj3, (ad7) obj, (String) serializable, (byte) 4));
                break;
            default:
                z3a z3aVar = (z3a) gk7Var;
                ArrayList arrayList = (ArrayList) serializable2;
                TLObject tLObject2 = (TLObject) obj3;
                ArrayList arrayList2 = (ArrayList) serializable;
                ArrayList arrayList3 = (ArrayList) obj2;
                k3a k3aVar = (k3a) obj;
                boolean z = this.b;
                if (tL_error != null && ab4.r(tL_error.text)) {
                    int c = ab4.c(tL_error.text);
                    if (arrayList == null) {
                        if (k3aVar != null) {
                            if (!((c < 0 || (zArr = k3aVar.s) == null || c >= zArr.length) ? k3aVar.r : zArr[c])) {
                                if (c < 0) {
                                    k3aVar.r = true;
                                } else {
                                    boolean[] zArr2 = k3aVar.s;
                                    if (zArr2 == null) {
                                        zArr2 = new boolean[k3aVar.x.size()];
                                        k3aVar.s = zArr2;
                                    }
                                    zArr2[c] = true;
                                }
                                gl.d3(new m05(z3aVar, tLObject2, c, k3aVar, arrayList2, z, (byte) 3));
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
                        z3aVar.getFileRefController().u(new Object[]{tLObject2, arrayList2, arrayList3, arrayList4, k3aVar, Boolean.valueOf(z)}, arrayList4);
                        break;
                    }
                }
                gl.d3(new o2a(z3aVar, tL_error, tLObject, z, arrayList2, arrayList3, tLObject2));
                break;
        }
    }

    public /* synthetic */ az6(z3a z3aVar, ArrayList arrayList, TLObject tLObject, ArrayList arrayList2, ArrayList arrayList3, k3a k3aVar, boolean z) {
        this.c = z3aVar;
        this.d = arrayList;
        this.e = tLObject;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = k3aVar;
        this.b = z;
    }
}
