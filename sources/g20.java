// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g20 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ h20 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ g20(h20 h20Var, String str, ArrayList arrayList) {
        this.b = h20Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        String str;
        byte b = this.a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.c;
        h20 h20Var = this.b;
        switch (b) {
            case 0:
                h20Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.d3(new g20(h20Var, new ArrayList(), str3));
                    break;
                } else {
                    String S0 = k96.D0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str2 = S0;
                    }
                    int i = (str2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i];
                    strArr[0] = lowerCase;
                    if (str2 != null) {
                        strArr[1] = str2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        k27 k27Var = (k27) arrayList.get(i2);
                        int i3 = 0;
                        while (true) {
                            if (i3 < i) {
                                String str4 = strArr[i3];
                                String I0 = k27Var.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(k27Var);
                                    } else {
                                        int i4 = k27Var.D;
                                        TLRPC.Message message = k27Var.k;
                                        TLRPC.Document document = i4 == 0 ? message.media.webpage.document : message.media.document;
                                        int i5 = 0;
                                        while (true) {
                                            if (i5 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i5);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str5 = documentAttribute.performer;
                                                    z = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                    if (!z && (str = documentAttribute.title) != null) {
                                                        z = str.toLowerCase().contains(str4);
                                                    }
                                                } else {
                                                    i5++;
                                                }
                                            } else {
                                                z = false;
                                            }
                                        }
                                        if (z) {
                                            arrayList2.add(k27Var);
                                        }
                                    }
                                }
                                i3++;
                            }
                        }
                    }
                    gl.d3(new g20(h20Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                i20 i20Var = h20Var.n;
                if (i20Var.q1) {
                    i20Var.p1 = true;
                    h20Var.d = arrayList;
                    h20Var.e = str3;
                    h20Var.f();
                    i20Var.s1.m0(0);
                    de9.r(null, null, 2131748048, new Object[]{str3}, i20Var.w1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g20(h20 h20Var, ArrayList arrayList, String str) {
        this.b = h20Var;
        this.c = arrayList;
        this.d = str;
    }
}
