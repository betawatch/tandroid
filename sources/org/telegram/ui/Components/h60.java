package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i60 b;
    public final /* synthetic */ String c;

    public /* synthetic */ h60(i60 i60Var, String str, int i10) {
        this.a = i10;
        this.b = i60Var;
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
                i60 i60Var = this.b;
                String str2 = this.c;
                i60Var.getClass();
                org.telegram.messenger.i0.g3(new h60(i60Var, str2, 1));
                break;
            case 1:
                i60 i60Var2 = this.b;
                String str3 = this.c;
                zf.m1 m1Var = i60Var2.e;
                org.telegram.ui.tt ttVar = i60Var2.n.d2;
                boolean z11 = false;
                boolean z12 = ttVar != null;
                if (ttVar != null) {
                    z11 = true;
                }
                m1Var.g(str3, true, z12, true, z11, 0L, false, 0, 0);
                org.telegram.messenger.r5 r5Var = Utilities.g;
                h60 h60Var = new h60(i60Var2, str3, 2);
                i60Var2.h = h60Var;
                r5Var.c(h60Var);
                break;
            default:
                i60 i60Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = i60Var3.n.V1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    boolean z13 = true;
                    ?? r62 = 0;
                    String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                    if (lowerCase.equals(R0) || R0.length() == 0) {
                        R0 = null;
                    }
                    int i10 = (R0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i10];
                    strArr[0] = lowerCase;
                    if (R0 != null) {
                        strArr[1] = R0;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        TLObject tLObject = (TLObject) arrayList2.get(i11);
                        boolean z14 = tLObject instanceof TLRPC.User;
                        if (z14) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = org.telegram.messenger.i5.m(r62, user.first_name, user.last_name).toLowerCase();
                            K = org.telegram.messenger.h20.n(user);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = org.telegram.messenger.w3.K(chat, r62);
                        }
                        String R02 = org.telegram.messenger.cd.D0().R0(str, z13, r62);
                        if (str.equals(R02)) {
                            R02 = null;
                        }
                        char c11 = r62;
                        int i12 = r62;
                        while (true) {
                            if (i12 < i10) {
                                String str5 = strArr[i12];
                                if (str.startsWith(str5) || sc.e.y(" ", str5, str) || (R02 != null && (R02.startsWith(str5) || sc.e.y(" ", str5, R02)))) {
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
                                        arrayList4.add(org.telegram.messenger.i0.r0(sc.e.h("@", K), null, "@" + str5));
                                    } else if (z14) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList4.add(org.telegram.messenger.i0.r0(user2.first_name, user2.last_name, str5));
                                        obj = null;
                                    } else {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.i0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    arrayList3.add(tLObject);
                                } else {
                                    char c12 = c10;
                                    z13 = true;
                                    arrayList2 = arrayList2;
                                    c11 = c12;
                                    i12++;
                                }
                            } else {
                                arrayList = arrayList2;
                                z10 = z13;
                            }
                        }
                        i11++;
                        z13 = z10;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    org.telegram.messenger.i0.g3(new jg(i60Var3, arrayList3, arrayList4, 11));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new jg(i60Var3, new ArrayList(), new ArrayList(), 11));
                    break;
                }
                break;
        }
    }
}
