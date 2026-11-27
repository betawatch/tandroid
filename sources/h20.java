// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class h20 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ i20 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ h20(i20 i20Var, String str, ArrayList arrayList) {
        this.b = i20Var;
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
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                i20Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    hl.c3(new h20(i20Var, new ArrayList(), str3));
                    break;
                } else {
                    String S0 = ob6.D0().S0(lowerCase, true, false);
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
                        r47 r47Var = (r47) arrayList.get(i2);
                        int i3 = 0;
                        while (true) {
                            if (i3 < i) {
                                String str4 = strArr[i3];
                                String I0 = r47Var.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(r47Var);
                                    } else {
                                        int i4 = r47Var.D;
                                        TLRPC.Message message = r47Var.k;
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
                                            arrayList2.add(r47Var);
                                        }
                                    }
                                }
                                i3++;
                            }
                        }
                    }
                    hl.c3(new h20(i20Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                j20 j20Var = i20Var.n;
                if (j20Var.q1) {
                    j20Var.p1 = true;
                    i20Var.d = arrayList;
                    i20Var.e = str3;
                    i20Var.f();
                    j20Var.s1.m0(0);
                    uh9.r(null, null, 2131747971, new Object[]{str3}, j20Var.w1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h20(i20 i20Var, ArrayList arrayList, String str) {
        this.b = i20Var;
        this.c = arrayList;
        this.d = str;
    }
}
