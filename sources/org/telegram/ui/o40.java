package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ o40(p40 p40Var, String str, int i3) {
        this.a = i3;
        this.b = p40Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String K;
        ArrayList arrayList;
        boolean z10;
        char c2;
        Object obj;
        switch (this.a) {
            case 0:
                p40 p40Var = this.b;
                String str2 = this.c;
                p40Var.getClass();
                org.telegram.messenger.g0.h3(new o40(p40Var, str2, 1));
                break;
            case 1:
                p40 p40Var2 = this.b;
                String str3 = this.c;
                kg.v1 v1Var = p40Var2.f;
                r40 r40Var = p40Var2.J;
                v1Var.g(str3, true, r40Var.P || r40Var.Q, true, false, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                o40 o40Var = new o40(p40Var2, str3, 2);
                p40Var2.h = o40Var;
                p5Var.c(o40Var);
                break;
            default:
                p40 p40Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = p40Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.isEmpty()) {
                    org.telegram.messenger.g0.h3(new pp(p40Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                } else {
                    boolean z11 = true;
                    ?? r62 = 0;
                    String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.isEmpty()) {
                        S0 = null;
                    }
                    int i3 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i3];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i10);
                        boolean z12 = tLObject instanceof TLRPC.User;
                        if (z12) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                            K = org.telegram.messenger.l10.n(user);
                        } else {
                            if (tLObject instanceof TLRPC.Chat) {
                                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                                str = chat.title;
                                K = org.telegram.messenger.t3.K(chat, r62);
                            }
                            arrayList = arrayList2;
                            z10 = z11;
                            i10++;
                            z11 = z10;
                            arrayList2 = arrayList;
                            r62 = 0;
                        }
                        String S02 = org.telegram.messenger.bd.E0().S0(str, z11, r62);
                        if (str.equals(S02)) {
                            S02 = null;
                        }
                        char c10 = r62;
                        for (int i11 = r62; i11 < i3; i11++) {
                            String str5 = strArr[i11];
                            if (str.startsWith(str5) || k2.p1.z(" ", str5, str) || (S02 != null && (S02.startsWith(str5) || k2.p1.z(" ", str5, S02)))) {
                                c2 = 1;
                            } else {
                                if (K != null && K.startsWith(str5)) {
                                    c10 = 2;
                                }
                                c2 = c10;
                            }
                            if (c2 != 0) {
                                arrayList = arrayList2;
                                z10 = true;
                                if (c2 == 1) {
                                    if (z12) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                    } else if (tLObject instanceof TLRPC.Chat) {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    obj = null;
                                } else {
                                    obj = null;
                                    arrayList4.add(org.telegram.messenger.g0.r0(t4.c.f("@", K), null, "@" + str5));
                                }
                                arrayList3.add(tLObject);
                                i10++;
                                z11 = z10;
                                arrayList2 = arrayList;
                                r62 = 0;
                            } else {
                                char c11 = c2;
                                z11 = true;
                                arrayList2 = arrayList2;
                                c10 = c11;
                            }
                        }
                        arrayList = arrayList2;
                        z10 = z11;
                        i10++;
                        z11 = z10;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    org.telegram.messenger.g0.h3(new pp(p40Var3, arrayList3, arrayList4, 10));
                    break;
                }
                break;
        }
    }
}
