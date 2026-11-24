// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class er5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fr5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ er5(fr5 fr5Var, String str, byte b) {
        this.a = b;
        this.b = fr5Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [k96] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // java.lang.Runnable
    public final void run() {
        String K;
        String str;
        ?? r3 = 0;
        byte b = 1;
        switch (this.a) {
            case 0:
                fr5 fr5Var = this.b;
                String str2 = this.c;
                fr5Var.getClass();
                gl.c3(new er5(fr5Var, str2, b));
                break;
            case 1:
                fr5 fr5Var2 = this.b;
                String str3 = this.c;
                zr9 zr9Var = fr5Var2.e;
                vu2 vu2Var = fr5Var2.n.g2;
                zr9Var.g(str3, true, vu2Var != null, true, vu2Var != null, 0L, false, 0, 0);
                co3 co3Var = Utilities.g;
                er5 er5Var = new er5(fr5Var2, str3, (byte) 2);
                fr5Var2.h = er5Var;
                co3Var.c(er5Var);
                break;
            default:
                fr5 fr5Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList = fr5Var3.n.Y1;
                String lowerCase = str4.trim().toLowerCase();
                byte b2 = 28;
                if (lowerCase.length() != 0) {
                    String S0 = k96.D0().S0(lowerCase, true, false);
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
                            str = qu2.m(r3, user.first_name, user.last_name).toLowerCase();
                            K = l7c.p(user);
                        } else {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            String str5 = chat.title;
                            K = hc2.K(chat, r3);
                            str = str5;
                        }
                        String S02 = k96.D0().S0(str, true, r3);
                        if (str.equals(S02)) {
                            S02 = null;
                        }
                        boolean z2 = r3;
                        int i3 = r3;
                        while (true) {
                            if (i3 < i) {
                                String str6 = strArr[i3];
                                ?? r9 = (str.startsWith(str6) || de9.t(" ", str6, str) || (S02 != null && (S02.startsWith(str6) || de9.t(" ", str6, S02)))) ? 1 : (K == null || !K.startsWith(str6)) ? z2 : 2;
                                if (r9 != 0) {
                                    if (r9 != 1) {
                                        arrayList3.add(gl.r0(b00.h("@", K), null, "@" + str6));
                                    } else if (z) {
                                        TLRPC.User user2 = (TLRPC.User) tLObject;
                                        arrayList3.add(gl.r0(user2.first_name, user2.last_name, str6));
                                    } else {
                                        arrayList3.add(gl.r0(((TLRPC.Chat) tLObject).title, null, str6));
                                    }
                                    arrayList2.add(tLObject);
                                } else {
                                    z2 = r9;
                                    i3++;
                                }
                            }
                        }
                        i2++;
                        r3 = 0;
                    }
                    gl.c3(new jf4((Object) fr5Var3, (Object) arrayList2, (Object) arrayList3, (byte) 28));
                    break;
                } else {
                    gl.c3(new jf4(fr5Var3, new ArrayList(), new ArrayList(), b2));
                    break;
                }
        }
    }
}
