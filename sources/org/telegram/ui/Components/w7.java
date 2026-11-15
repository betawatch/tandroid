package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ x7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ w7(x7 x7Var, String str, ArrayList arrayList) {
        this.b = x7Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        int i7 = this.a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.c;
        x7 x7Var = this.b;
        switch (i7) {
            case 0:
                x7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new w7(x7Var, new ArrayList(), str3));
                    break;
                } else {
                    String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str2 = S0;
                    }
                    int i10 = (str2 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (str2 != null) {
                        strArr[1] = str2;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 < i10) {
                                String str4 = strArr[i12];
                                String I0 = gjVar.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(gjVar);
                                    } else {
                                        TLRPC.Document document = gjVar.D == 0 ? gjVar.k.media.webpage.document : gjVar.k.media.document;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str5 = documentAttribute.performer;
                                                    z10 = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                    if (!z10 && (str = documentAttribute.title) != null) {
                                                        z10 = str.toLowerCase().contains(str4);
                                                    }
                                                } else {
                                                    i13++;
                                                }
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (z10) {
                                            arrayList2.add(gjVar);
                                        }
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new w7(x7Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                y7 y7Var = x7Var.n;
                if (y7Var.r1) {
                    y7Var.q1 = true;
                    x7Var.d = arrayList;
                    x7Var.e = str3;
                    x7Var.f();
                    y7Var.t1.n0(0);
                    org.telegram.messenger.k5.q(null, null, 2131748240, new Object[]{str3}, y7Var.x1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w7(x7 x7Var, ArrayList arrayList, String str) {
        this.b = x7Var;
        this.c = arrayList;
        this.d = str;
    }
}
