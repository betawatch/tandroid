// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g30 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ h30 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ g30(h30 h30Var, String str, ArrayList arrayList) {
        this.b = h30Var;
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
        h30 h30Var = this.b;
        switch (b) {
            case 0:
                h30Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gm.c3(new g30(h30Var, new ArrayList(), str3));
                    break;
                } else {
                    String S0 = jb6.D0().S0(lowerCase, true, false);
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
                        k47 k47Var = (k47) arrayList.get(i2);
                        int i3 = 0;
                        while (true) {
                            if (i3 < i) {
                                String str4 = strArr[i3];
                                String I0 = k47Var.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(k47Var);
                                    } else {
                                        int i4 = k47Var.D;
                                        TLRPC.Message message = k47Var.k;
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
                                            arrayList2.add(k47Var);
                                        }
                                    }
                                }
                                i3++;
                            }
                        }
                    }
                    gm.c3(new g30(h30Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                i30 i30Var = h30Var.n;
                if (i30Var.q1) {
                    i30Var.p1 = true;
                    h30Var.d = arrayList;
                    h30Var.e = str3;
                    h30Var.f();
                    i30Var.s1.m0(0);
                    hg9.q(null, null, 2131747974, new Object[]{str3}, i30Var.w1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g30(h30 h30Var, ArrayList arrayList, String str) {
        this.b = h30Var;
        this.c = arrayList;
        this.d = str;
    }
}
