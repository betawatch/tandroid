package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ u7(v7 v7Var, String str, ArrayList arrayList) {
        this.b = v7Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        int i10 = this.a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.c;
        v7 v7Var = this.b;
        switch (i10) {
            case 0:
                v7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new u7(v7Var, new ArrayList(), str3));
                    break;
                } else {
                    String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                    if (!lowerCase.equals(R0) && R0.length() != 0) {
                        str2 = R0;
                    }
                    int i11 = (str2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (str2 != null) {
                        strArr[1] = str2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 < i11) {
                                String str4 = strArr[i13];
                                String I0 = jjVar.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(jjVar);
                                    } else {
                                        TLRPC.Document document = jjVar.D == 0 ? jjVar.k.media.webpage.document : jjVar.k.media.document;
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i14);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str5 = documentAttribute.performer;
                                                    z10 = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str4);
                                                    }
                                                } else {
                                                    i14++;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (z10) {
                                            arrayList2.add(jjVar);
                                        }
                                    }
                                }
                                i13++;
                            }
                        }
                    }
                    org.telegram.messenger.i0.g3(new u7(v7Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                w7 w7Var = v7Var.n;
                if (w7Var.n1) {
                    w7Var.m1 = true;
                    v7Var.d = arrayList;
                    v7Var.e = str3;
                    v7Var.f();
                    w7Var.p1.n0(0);
                    org.telegram.messenger.m5.q(null, null, 2131748257, new Object[]{str3}, w7Var.t1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u7(v7 v7Var, ArrayList arrayList, String str) {
        this.b = v7Var;
        this.c = arrayList;
        this.d = str;
    }
}
