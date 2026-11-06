package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s50 b;
    public final /* synthetic */ String c;

    public /* synthetic */ r50(s50 s50Var, String str, int i7) {
        this.a = i7;
        this.b = s50Var;
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
        boolean z9;
        char c10;
        Object obj;
        switch (this.a) {
            case 0:
                s50 s50Var = this.b;
                String str2 = this.c;
                s50Var.getClass();
                org.telegram.messenger.g0.h3(new r50(s50Var, str2, 1));
                break;
            case 1:
                s50 s50Var2 = this.b;
                String str3 = this.c;
                jg.z1 z1Var = s50Var2.e;
                org.telegram.ui.wr wrVar = s50Var2.n.d2;
                boolean z10 = false;
                boolean z11 = wrVar != null;
                if (wrVar != null) {
                    z10 = true;
                }
                z1Var.g(str3, true, z11, true, z10, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                r50 r50Var = new r50(s50Var2, str3, 2);
                s50Var2.h = r50Var;
                p5Var.c(r50Var);
                break;
            default:
                s50 s50Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList2 = s50Var3.n.V1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    boolean z12 = true;
                    ?? r62 = 0;
                    String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
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
                        boolean z13 = tLObject instanceof TLRPC.User;
                        if (z13) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = org.telegram.messenger.g5.m(r62, user.first_name, user.last_name).toLowerCase();
                            K = org.telegram.messenger.t10.n(user);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = org.telegram.messenger.t3.K(chat, r62);
                        }
                        String S02 = org.telegram.messenger.hd.E0().S0(str, z12, r62);
                        if (str.equals(S02)) {
                            S02 = null;
                        }
                        char c11 = r62;
                        int i11 = r62;
                        while (true) {
                            if (i11 < i7) {
                                String str5 = strArr[i11];
                                if (str.startsWith(str5) || jg.g.A(" ", str5, str) || (S02 != null && (S02.startsWith(str5) || jg.g.A(" ", str5, S02)))) {
                                    c10 = 1;
                                } else {
                                    if (K != null && K.startsWith(str5)) {
                                        c11 = 2;
                                    }
                                    c10 = c11;
                                }
                                if (c10 != 0) {
                                    arrayList = arrayList2;
                                    z9 = true;
                                    if (c10 != 1) {
                                        obj = null;
                                        arrayList4.add(org.telegram.messenger.g0.r0(rf.b.i("@", K), null, "@" + str5));
                                    } else if (z13) {
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
                                    z12 = true;
                                    arrayList2 = arrayList2;
                                    c11 = c12;
                                    i11++;
                                }
                            } else {
                                arrayList = arrayList2;
                                z9 = z12;
                            }
                        }
                        i10++;
                        z12 = z9;
                        arrayList2 = arrayList;
                        r62 = 0;
                    }
                    org.telegram.messenger.g0.h3(new ng(s50Var3, arrayList3, arrayList4, 11));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ng(s50Var3, new ArrayList(), new ArrayList(), 11));
                    break;
                }
                break;
        }
    }
}
