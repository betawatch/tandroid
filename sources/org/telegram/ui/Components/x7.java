package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ y7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ x7(y7 y7Var, String str, ArrayList arrayList) {
        this.b = y7Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        String str;
        int i3 = this.a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.c;
        y7 y7Var = this.b;
        switch (i3) {
            case 0:
                y7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new x7(y7Var, new ArrayList(), str3));
                    break;
                } else {
                    String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
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
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 < i10) {
                                String str4 = strArr[i12];
                                String I0 = ziVar.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(ziVar);
                                    } else {
                                        TLRPC.Document document = ziVar.D == 0 ? ziVar.k.media.webpage.document : ziVar.k.media.document;
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
                                            arrayList2.add(ziVar);
                                        }
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new x7(y7Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                z7 z7Var = y7Var.n;
                if (z7Var.o1) {
                    z7Var.n1 = true;
                    y7Var.d = arrayList;
                    y7Var.e = str3;
                    y7Var.f();
                    z7Var.q1.n0(0);
                    org.telegram.messenger.k5.r(null, null, 2131748248, new Object[]{str3}, z7Var.u1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x7(y7 y7Var, ArrayList arrayList, String str) {
        this.b = y7Var;
        this.c = arrayList;
        this.d = str;
    }
}
