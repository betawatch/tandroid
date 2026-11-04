package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c81 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ b81(c81 c81Var, String str, int i3, int i10) {
        this.a = i10;
        this.b = c81Var;
        this.c = str;
        this.d = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c81 c81Var;
        switch (this.a) {
            case 0:
                c81 c81Var2 = this.b;
                String str = this.c;
                int i3 = this.d;
                c81Var2.getClass();
                Utilities.g.c(new b81(c81Var2, str, i3, 1));
                break;
            default:
                c81 c81Var3 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                d81 d81Var = c81Var3.h;
                ArrayList arrayList = d81Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    boolean z10 = false;
                    String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
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
                                    c81Var = c81Var3;
                                } else {
                                    String lowerCase2 = K.toLowerCase();
                                    int i15 = z11;
                                    while (i15 < i11) {
                                        String str4 = strArr[i15];
                                        if (lowerCase2.startsWith(str4)) {
                                            c81Var = c81Var3;
                                        } else {
                                            c81Var = c81Var3;
                                            if (!k2.p1.z(" ", str4, lowerCase2)) {
                                                i15++;
                                                c81Var3 = c81Var;
                                            }
                                        }
                                        i14 = 1;
                                        if (i14 == 0) {
                                            arrayList2.add(chat);
                                            arrayList3.add((String) d81Var.h.get(i12));
                                        }
                                    }
                                    c81Var = c81Var3;
                                    if (i14 == 0) {
                                    }
                                }
                                i13++;
                                c81Var3 = c81Var;
                                z11 = 0;
                            } else {
                                c81Var = c81Var3;
                            }
                        }
                        i12++;
                        c81Var3 = c81Var;
                        z10 = false;
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zo0(c81Var3, i10, arrayList2, arrayList3, 18));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.zo0(c81Var3, i10, str3, str3, 18));
                    break;
                }
                break;
        }
    }
}
