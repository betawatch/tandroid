package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ z7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ y7(z7 z7Var, String str, ArrayList arrayList) {
        this.b = z7Var;
        this.d = str;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        String str;
        int i7 = this.a;
        String str2 = null;
        String str3 = this.d;
        ArrayList arrayList = this.c;
        z7 z7Var = this.b;
        switch (i7) {
            case 0:
                z7Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new y7(z7Var, new ArrayList(), str3));
                    break;
                } else {
                    String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
                        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 < i10) {
                                String str4 = strArr[i12];
                                String I0 = ijVar.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(ijVar);
                                    } else {
                                        TLRPC.Document document = ijVar.D == 0 ? ijVar.k.media.webpage.document : ijVar.k.media.document;
                                        int i13 = 0;
                                        while (true) {
                                            if (i13 < document.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                                    String str5 = documentAttribute.performer;
                                                    z9 = str5 != null ? str5.toLowerCase().contains(str4) : false;
                                                    if (!z9 && (str = documentAttribute.title) != null) {
                                                        z9 = str.toLowerCase().contains(str4);
                                                    }
                                                } else {
                                                    i13++;
                                                }
                                            } else {
                                                z9 = false;
                                            }
                                        }
                                        if (z9) {
                                            arrayList2.add(ijVar);
                                        }
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new y7(z7Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                a8 a8Var = z7Var.n;
                if (a8Var.q1) {
                    a8Var.p1 = true;
                    z7Var.d = arrayList;
                    z7Var.e = str3;
                    z7Var.f();
                    a8Var.s1.n0(0);
                    org.telegram.messenger.k5.r(null, null, 2131748240, new Object[]{str3}, a8Var.w1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y7(z7 z7Var, ArrayList arrayList, String str) {
        this.b = z7Var;
        this.c = arrayList;
        this.d = str;
    }
}
