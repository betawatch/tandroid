package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d60 b;
    public final /* synthetic */ String c;

    public /* synthetic */ c60(d60 d60Var, String str, int i7) {
        this.a = i7;
        this.b = d60Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String K;
        ArrayList arrayList;
        boolean z10;
        char c10;
        Object obj;
        switch (this.a) {
            case 0:
                d60 d60Var = this.b;
                String str2 = this.c;
                d60Var.getClass();
                org.telegram.messenger.g0.g3(new c60(d60Var, str2, 1));
                break;
            case 1:
                d60 d60Var2 = this.b;
                String str3 = this.c;
                jg.z1 z1Var = d60Var2.e;
                org.telegram.ui.zr zrVar = d60Var2.n.h2;
                boolean z11 = false;
                boolean z12 = zrVar != null;
                if (zrVar != null) {
                    z11 = true;
                }
                z1Var.g(str3, true, z12, true, z11, 0L, false, 0, 0);
                org.telegram.messenger.q5 q5Var = Utilities.g;
                c60 c60Var = new c60(d60Var2, str3, 2);
                d60Var2.h = c60Var;
                q5Var.c(c60Var);
                break;
            default:
                d60 d60Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = d60Var3.n.Z1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    boolean z13 = true;
                    ?? r62 = 0;
                    String S0 = org.telegram.messenger.gd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i7 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i7];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i10);
                        boolean z14 = tLObject instanceof TLRPC.User;
                        if (z14) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            K = org.telegram.messenger.o10.o(user);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = org.telegram.messenger.v3.K(chat, r62);
                        }
                        String S02 = org.telegram.messenger.gd.E0().S0(str, z13, r62);
                        if (str.equals(S02)) {
                            S02 = null;
                        }
                        char c11 = r62;
                        int i11 = r62;
                        while (true) {
                            if (i11 < i7) {
                                String str5 = strArr[i11];
                                if (str.startsWith(str5) || i5.c.B(" ", str5, str) || (S02 != null && (S02.startsWith(str5) || i5.c.B(" ", str5, S02)))) {
                                    c10 = 1;
                                } else {
                                    if (K != null && K.startsWith(str5)) {
                                        c11 = 2;
                                    }
                                    c10 = c11;
                                }
                                if (c10 != 0) {
                                    arrayList = arrayList2;
                                    z10 = true;
                                    if (c10 != 1) {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(p5.c.k("@", K), null, "@" + str5));
                                    } else if (z14) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    arrayList3.add(tLObject);
                                } else {
                                    char c12 = c10;
                                    z13 = true;
                                    arrayList2 = arrayList2;
                                    c11 = c12;
                                    i11++;
                                }
                            } else {
                                arrayList = arrayList2;
                                z10 = z13;
                            }
                        }
                        i10++;
                        z13 = z10;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    org.telegram.messenger.g0.g3(new k7(d60Var3, arrayList3, arrayList4, 16));
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new k7(d60Var3, new ArrayList(), new ArrayList(), 16));
                    break;
                }
                break;
        }
    }
}
