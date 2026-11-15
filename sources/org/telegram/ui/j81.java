package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k81 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ j81(k81 k81Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = k81Var;
        this.c = str;
        this.d = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k81 k81Var;
        switch (this.a) {
            case 0:
                k81 k81Var2 = this.b;
                String str = this.c;
                int i7 = this.d;
                k81Var2.getClass();
                Utilities.g.c(new j81(k81Var2, str, i7, 1));
                break;
            default:
                k81 k81Var3 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                l81 l81Var = k81Var3.h;
                ArrayList arrayList = l81Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    boolean z10 = false;
                    String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str3 = S0;
                    }
                    int i11 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i12);
                        int i13 = z10 ? 1 : 0;
                        int i14 = i13;
                        boolean z11 = z10;
                        while (true) {
                            if (i13 < 2) {
                                String K = i13 == 0 ? chat.title : org.telegram.messenger.t3.K(chat, z11);
                                if (K == null) {
                                    k81Var = k81Var3;
                                } else {
                                    String lowerCase2 = K.toLowerCase();
                                    int i15 = z11;
                                    while (i15 < i11) {
                                        String str4 = strArr[i15];
                                        if (lowerCase2.startsWith(str4)) {
                                            k81Var = k81Var3;
                                        } else {
                                            k81Var = k81Var3;
                                            if (!i5.c.A(" ", str4, lowerCase2)) {
                                                i15++;
                                                k81Var3 = k81Var;
                                            }
                                        }
                                        i14 = 1;
                                        if (i14 == 0) {
                                            arrayList2.add(chat);
                                            arrayList3.add((String) l81Var.h.get(i12));
                                        }
                                    }
                                    k81Var = k81Var3;
                                    if (i14 == 0) {
                                    }
                                }
                                i13++;
                                k81Var3 = k81Var;
                                z11 = 0;
                            } else {
                                k81Var = k81Var3;
                            }
                        }
                        i12++;
                        k81Var3 = k81Var;
                        z10 = false;
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.sp0(k81Var3, i10, arrayList2, arrayList3, 17));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.sp0(k81Var3, i10, str3, str3, 17));
                    break;
                }
                break;
        }
    }
}
