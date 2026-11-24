// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class a8c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b8c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ a8c(b8c b8cVar, String str, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = b8cVar;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        if (r3 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d3, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177 A[LOOP:1: B:29:0x00f8->B:47:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                b8c b8cVar = this.b;
                String str2 = this.c;
                boolean z3 = this.d;
                boolean z4 = this.e;
                b8cVar.getClass();
                gl.c3(new a8c(b8cVar, str2, z3, z4, (byte) 1));
                break;
            case 1:
                b8c b8cVar2 = this.b;
                String str3 = this.c;
                boolean z5 = this.d;
                boolean z6 = this.e;
                b8cVar2.f.g(str3, true, z5, z6, b8cVar2.w.H, 0L, false, 0, 0);
                co3 co3Var = Utilities.g;
                a8c a8cVar = new a8c(b8cVar2, str3, z6, z5, (byte) 2);
                b8cVar2.h = a8cVar;
                co3Var.c(a8cVar);
                break;
            default:
                b8c b8cVar3 = this.b;
                String str4 = this.c;
                boolean z7 = this.d;
                boolean z8 = this.e;
                ArrayList arrayList = b8cVar3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.c3(new r1b(b8cVar3, new ArrayList(), new ArrayList(), (byte) 22));
                    break;
                } else {
                    boolean z9 = false;
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
                        String[] strArr2 = new String[3];
                        boolean z10 = tLObject instanceof TLRPC.User;
                        if (!z10) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[z9 ? 1 : 0] = chat.title.toLowerCase();
                            str = chat.username;
                            break;
                        } else {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            strArr2[z9 ? 1 : 0] = qu2.m(z9 ? 1 : 0, user.first_name, user.last_name).toLowerCase();
                            str = l7c.p(user);
                            if (l7c.B(user)) {
                                strArr2[2] = k96.M0(2131746073, null).toLowerCase();
                            } else if (l7c.D(user)) {
                                if (b8cVar3.w.H) {
                                    strArr2[2] = k96.M0(2131745709, null).toLowerCase();
                                }
                                z = z8;
                                z2 = z7;
                            } else if (user.bot) {
                            }
                            z = z8;
                            String S02 = k96.D0().S0(strArr2[z9 ? 1 : 0], true, z9);
                            strArr2[1] = S02;
                            if (strArr2[z9 ? 1 : 0].equals(S02)) {
                                strArr2[1] = null;
                            }
                            int i3 = z9 ? 1 : 0;
                            int i4 = i3;
                            boolean z11 = z9;
                            while (i4 < i) {
                                String str5 = strArr[i4];
                                int i5 = i3;
                                for (?? r8 = z11; r8 < 3; r8++) {
                                    String str6 = strArr2[r8];
                                    if (str6 != null) {
                                        if (str6.startsWith(str5)) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            if (de9.t(" ", str5, str6)) {
                                            }
                                        }
                                        i3 = 1;
                                        if (i3 == 0 && str != null && str.toLowerCase().startsWith(str5)) {
                                            i3 = 2;
                                        }
                                        if (i3 == 0) {
                                            if (i3 != 1) {
                                                arrayList3.add(gl.r0(b00.h("@", str), null, "@" + str5));
                                            } else if (z10) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList3.add(gl.r0(user2.first_name, user2.last_name, str5));
                                            } else {
                                                arrayList3.add(gl.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                            }
                                            arrayList2.add(tLObject);
                                        } else {
                                            i4++;
                                            z7 = z2;
                                            z11 = false;
                                        }
                                    } else {
                                        z2 = z7;
                                    }
                                    z7 = z2;
                                }
                                z2 = z7;
                                i3 = i5;
                                if (i3 == 0) {
                                    i3 = 2;
                                }
                                if (i3 == 0) {
                                }
                            }
                            z2 = z7;
                        }
                        i2++;
                        z8 = z;
                        z7 = z2;
                        z9 = false;
                    }
                    gl.c3(new r1b(b8cVar3, arrayList2, arrayList3, (byte) 22));
                    break;
                }
        }
    }
}
