// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ma5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ma5(oa5 oa5Var, String str, byte b) {
        this.a = b;
        this.b = oa5Var;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [k96] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
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
                oa5 oa5Var = this.b;
                String str2 = this.c;
                oa5Var.getClass();
                gl.c3(new ma5(oa5Var, str2, b));
                break;
            case 1:
                oa5 oa5Var2 = this.b;
                String str3 = this.c;
                zr9 zr9Var = oa5Var2.f;
                qa5 qa5Var = oa5Var2.J;
                zr9Var.g(str3, true, qa5Var.P || qa5Var.Q, true, false, 0L, false, 0, 0);
                co3 co3Var = Utilities.g;
                ma5 ma5Var = new ma5(oa5Var2, str3, (byte) 2);
                oa5Var2.h = ma5Var;
                co3Var.c(ma5Var);
                break;
            default:
                oa5 oa5Var3 = this.b;
                String str4 = this.c;
                ArrayList arrayList = oa5Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (!lowerCase.isEmpty()) {
                    String S0 = k96.D0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.isEmpty()) {
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
                        } else if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            String str5 = chat.title;
                            K = hc2.K(chat, r3);
                            str = str5;
                        } else {
                            i2++;
                            r3 = 0;
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
                                    } else if (tLObject instanceof TLRPC.Chat) {
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
                    gl.c3(new jf4(oa5Var3, arrayList2, arrayList3, (byte) 19));
                    break;
                } else {
                    gl.c3(new jf4(oa5Var3, new ArrayList(), new ArrayList(), (byte) 19));
                    break;
                }
        }
    }
}
