package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ bb1(cb1 cb1Var, String str, boolean z10, boolean z11, int i3) {
        this.a = i3;
        this.b = cb1Var;
        this.c = str;
        this.d = z10;
        this.e = z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cd, code lost:
    
        if (r21 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cf, code lost:
    
        r22 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e6, code lost:
    
        if (r4 == false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0186 A[LOOP:1: B:29:0x0106->B:47:0x0186, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        String str;
        boolean z11;
        ArrayList arrayList;
        boolean z12;
        switch (this.a) {
            case 0:
                cb1 cb1Var = this.b;
                String str2 = this.c;
                boolean z13 = this.d;
                boolean z14 = this.e;
                cb1Var.getClass();
                org.telegram.messenger.g0.h3(new bb1(cb1Var, str2, z13, z14, 1));
                break;
            case 1:
                cb1 cb1Var2 = this.b;
                String str3 = this.c;
                boolean z15 = this.d;
                boolean z16 = this.e;
                cb1Var2.f.g(str3, true, z15, z16, cb1Var2.w.H, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                bb1 bb1Var = new bb1(cb1Var2, str3, z16, z15, 2);
                cb1Var2.h = bb1Var;
                p5Var.c(bb1Var);
                break;
            default:
                cb1 cb1Var3 = this.b;
                String str4 = this.c;
                boolean z17 = this.d;
                boolean z18 = this.e;
                ArrayList arrayList2 = cb1Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new wy0(cb1Var3, new ArrayList(), new ArrayList(), 10));
                    break;
                } else {
                    boolean z19 = false;
                    String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
                    if (lowerCase.equals(S0) || S0.length() == 0) {
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
                        String[] strArr2 = new String[3];
                        boolean z20 = tLObject instanceof TLRPC.User;
                        if (!z20) {
                            z10 = z17;
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[z19 ? 1 : 0] = chat.title.toLowerCase();
                            str = chat.username;
                            break;
                        } else {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            z10 = z17;
                            strArr2[z19 ? 1 : 0] = org.telegram.messenger.g5.m(z19 ? 1 : 0, user.first_name, user.last_name).toLowerCase();
                            str = org.telegram.messenger.l10.n(user);
                            if (org.telegram.messenger.l10.z(user)) {
                                strArr2[2] = org.telegram.messenger.bd.M0(2131746274, null).toLowerCase();
                            } else if (org.telegram.messenger.l10.B(user)) {
                                if (cb1Var3.w.H) {
                                    strArr2[2] = org.telegram.messenger.bd.M0(2131745911, null).toLowerCase();
                                } else {
                                    z11 = z18;
                                    arrayList = arrayList2;
                                    z12 = true;
                                }
                            } else if (user.bot) {
                            }
                            z11 = z18;
                            String S02 = org.telegram.messenger.bd.E0().S0(strArr2[z19 ? 1 : 0], true, z19);
                            strArr2[1] = S02;
                            if (strArr2[z19 ? 1 : 0].equals(S02)) {
                                strArr2[1] = null;
                            }
                            int i11 = z19 ? 1 : 0;
                            int i12 = i11;
                            boolean z21 = z19;
                            while (i12 < i3) {
                                String str5 = strArr[i12];
                                int i13 = i11;
                                for (?? r9 = z21; r9 < 3; r9++) {
                                    String str6 = strArr2[r9];
                                    if (str6 != null) {
                                        if (str6.startsWith(str5)) {
                                            arrayList = arrayList2;
                                        } else {
                                            arrayList = arrayList2;
                                            if (k2.p1.z(" ", str5, str6)) {
                                            }
                                        }
                                        i11 = 1;
                                        if (i11 == 0 && str != null && str.toLowerCase().startsWith(str5)) {
                                            i11 = 2;
                                        }
                                        if (i11 == 0) {
                                            z12 = true;
                                            if (i11 != 1) {
                                                arrayList4.add(org.telegram.messenger.g0.r0(t4.c.f("@", str), null, "@" + str5));
                                            } else if (z20) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                            } else {
                                                arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                            }
                                            arrayList3.add(tLObject);
                                        } else {
                                            i12++;
                                            arrayList2 = arrayList;
                                            z21 = false;
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                    arrayList2 = arrayList;
                                }
                                arrayList = arrayList2;
                                i11 = i13;
                                if (i11 == 0) {
                                    i11 = 2;
                                }
                                if (i11 == 0) {
                                }
                            }
                            arrayList = arrayList2;
                            z12 = true;
                        }
                        i10++;
                        z17 = z10;
                        z18 = z11;
                        arrayList2 = arrayList;
                        z19 = false;
                    }
                    org.telegram.messenger.g0.h3(new wy0(cb1Var3, arrayList3, arrayList4, 10));
                    break;
                }
        }
    }
}
