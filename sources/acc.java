// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class acc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bcc b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ acc(bcc bccVar, String str, boolean z, boolean z2, byte b) {
        this.a = b;
        this.b = bccVar;
        this.c = str;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c1, code lost:
    
        if (r3 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00d1, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175 A[LOOP:1: B:29:0x00f6->B:47:0x0175, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v5, types: [int] */
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
                bcc bccVar = this.b;
                String str2 = this.c;
                boolean z3 = this.d;
                boolean z4 = this.e;
                bccVar.getClass();
                hl.c3(new acc(bccVar, str2, z3, z4, (byte) 1));
                break;
            case 1:
                bcc bccVar2 = this.b;
                String str3 = this.c;
                boolean z5 = this.d;
                boolean z6 = this.e;
                bccVar2.f.g(str3, true, z5, z6, bccVar2.w.H, 0L, false, 0, 0);
                to3 to3Var = Utilities.g;
                acc accVar = new acc(bccVar2, str3, z6, z5, (byte) 2);
                bccVar2.h = accVar;
                to3Var.c(accVar);
                break;
            default:
                bcc bccVar3 = this.b;
                String str4 = this.c;
                boolean z7 = this.d;
                boolean z8 = this.e;
                ArrayList arrayList = bccVar3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    hl.c3(new b6c(bccVar3, new ArrayList(), new ArrayList(), (byte) 1));
                    break;
                } else {
                    boolean z9 = false;
                    String S0 = ob6.D0().S0(lowerCase, true, false);
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
                            strArr2[z9 ? 1 : 0] = lv2.m(z9 ? 1 : 0, user.first_name, user.last_name).toLowerCase();
                            str = lbc.p(user);
                            if (lbc.B(user)) {
                                strArr2[2] = ob6.M0(2131745993, null).toLowerCase();
                            } else if (lbc.D(user)) {
                                if (bccVar3.w.H) {
                                    strArr2[2] = ob6.M0(2131745629, null).toLowerCase();
                                }
                                z = z8;
                                z2 = z7;
                            } else if (user.bot) {
                            }
                            z = z8;
                            String S02 = ob6.D0().S0(strArr2[z9 ? 1 : 0], true, z9);
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
                                for (?? r7 = z11; r7 < 3; r7++) {
                                    String str6 = strArr2[r7];
                                    if (str6 != null) {
                                        if (str6.startsWith(str5)) {
                                            z2 = z7;
                                        } else {
                                            z2 = z7;
                                            if (uh9.t(" ", str5, str6)) {
                                            }
                                        }
                                        i3 = 1;
                                        if (i3 == 0 && str != null && str.toLowerCase().startsWith(str5)) {
                                            i3 = 2;
                                        }
                                        if (i3 == 0) {
                                            if (i3 != 1) {
                                                arrayList3.add(hl.r0(c00.i("@", str), null, "@" + str5));
                                            } else if (z10) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList3.add(hl.r0(user2.first_name, user2.last_name, str5));
                                            } else {
                                                arrayList3.add(hl.r0(((TLRPC.Chat) tLObject).title, null, str5));
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
                    hl.c3(new b6c(bccVar3, arrayList2, arrayList3, (byte) 1));
                    break;
                }
        }
    }
}
