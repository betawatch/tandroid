package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f8 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ String d;

    public /* synthetic */ e8(f8 f8Var, String str, ArrayList arrayList) {
        this.b = f8Var;
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
        f8 f8Var = this.b;
        switch (i7) {
            case 0:
                f8Var.getClass();
                String lowerCase = str3.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new e8(f8Var, new ArrayList(), str3));
                    break;
                } else {
                    String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
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
                        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i11);
                        int i12 = 0;
                        while (true) {
                            if (i12 < i10) {
                                String str4 = strArr[i12];
                                String I0 = fjVar.I0();
                                if (I0 != null && I0.length() != 0) {
                                    if (I0.toLowerCase().contains(str4)) {
                                        arrayList2.add(fjVar);
                                    } else {
                                        TLRPC.Document document = fjVar.D == 0 ? fjVar.k.media.webpage.document : fjVar.k.media.document;
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
                                            arrayList2.add(fjVar);
                                        }
                                    }
                                }
                                i12++;
                            }
                        }
                    }
                    org.telegram.messenger.g0.g3(new e8(f8Var, arrayList2, str3));
                    break;
                }
                break;
            default:
                g8 g8Var = f8Var.n;
                if (g8Var.r1) {
                    g8Var.q1 = true;
                    f8Var.d = arrayList;
                    f8Var.e = str3;
                    f8Var.f();
                    g8Var.t1.n0(0);
                    org.telegram.messenger.f3.q(null, null, 2131748048, new Object[]{str3}, g8Var.x1);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e8(f8 f8Var, ArrayList arrayList, String str) {
        this.b = f8Var;
        this.c = arrayList;
        this.d = str;
    }
}
