// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ct5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ct5(et5 et5Var, String str, byte b) {
        this.a = b;
        this.b = et5Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String K;
        byte b = 1;
        ?? r4 = 0;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                et5 et5Var = this.b;
                String str2 = this.c;
                et5Var.getClass();
                gm.c3(new ct5(et5Var, str2, b));
                break;
            case 1:
                et5 et5Var2 = this.b;
                String str3 = this.c;
                bu9 bu9Var = et5Var2.e;
                yu3 yu3Var = et5Var2.n.g2;
                bu9Var.g(str3, true, yu3Var != null, true, yu3Var != null, 0L, false, 0, 0);
                mp3 mp3Var = Utilities.g;
                ct5 ct5Var = new ct5(et5Var2, str3, (byte) 2);
                et5Var2.h = ct5Var;
                mp3Var.c(ct5Var);
                break;
            default:
                et5 et5Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList = et5Var3.n.Y1;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() != 0) {
                    String S0 = jb6.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i = (S0 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i];
                    strArr[0] = lowerCase;
                    if (S0 != null) {
                        strArr[1] = S0;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        TLObject tLObject = (TLObject) arrayList.get(i2);
                        boolean z = tLObject instanceof TLRPC.User;
                        if (z) {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            str = bw2.m(r4, user.first_name, user.last_name).toLowerCase();
                            K = m9c.p(user);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            str = chat.title;
                            K = sd2.K(chat, r4);
                        }
                        String S02 = jb6.D0().S0(str, true, r4);
                        if (str.equals(S02)) {
                            S02 = null;
                        }
                        int i3 = r4;
                        int i4 = i3;
                        while (true) {
                            if (i3 < i) {
                                String str5 = strArr[i3];
                                int i5 = (str.startsWith(str5) || hg9.s(" ", str5, str) || (S02 != null && (S02.startsWith(str5) || hg9.s(" ", str5, S02)))) ? 1 : (K == null || !K.startsWith(str5)) ? i4 : 2;
                                if (i5 != 0) {
                                    if (i5 != 1) {
                                        arrayList3.add(gm.r0(b10.h("@", K), null, "@" + str5));
                                    } else if (z) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList3.add(gm.r0(user2.first_name, user2.last_name, str5));
                                    } else {
                                        arrayList3.add(gm.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                    }
                                    arrayList2.add(tLObject);
                                } else {
                                    i3++;
                                    i4 = i5;
                                }
                            }
                        }
                        i2++;
                        r4 = 0;
                    }
                    gm.c3(new dt5(et5Var3, arrayList2, arrayList3, (byte) 0));
                    break;
                } else {
                    gm.c3(new dt5(et5Var3, new ArrayList(), new ArrayList(), objArr == true ? 1 : 0));
                    break;
                }
        }
    }
}
