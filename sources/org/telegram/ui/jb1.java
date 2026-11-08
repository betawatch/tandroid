package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ jb1(kb1 kb1Var, String str, boolean z9, boolean z10, int i7) {
        this.a = i7;
        this.b = kb1Var;
        this.c = str;
        this.d = z9;
        this.e = z10;
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
        boolean z9;
        String str;
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        switch (this.a) {
            case 0:
                kb1 kb1Var = this.b;
                String str2 = this.c;
                boolean z12 = this.d;
                boolean z13 = this.e;
                kb1Var.getClass();
                org.telegram.messenger.g0.h3(new jb1(kb1Var, str2, z12, z13, 1));
                break;
            case 1:
                kb1 kb1Var2 = this.b;
                String str3 = this.c;
                boolean z14 = this.d;
                boolean z15 = this.e;
                kb1Var2.f.g(str3, true, z14, z15, kb1Var2.w.G, 0L, false, 0, 0);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                jb1 jb1Var = new jb1(kb1Var2, str3, z15, z14, 2);
                kb1Var2.h = jb1Var;
                p5Var.c(jb1Var);
                break;
            default:
                kb1 kb1Var3 = this.b;
                String str4 = this.c;
                boolean z16 = this.d;
                boolean z17 = this.e;
                ArrayList arrayList2 = kb1Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new t21(kb1Var3, new ArrayList(), new ArrayList(), 9));
                    break;
                } else {
                    boolean z18 = false;
                    String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
                        String[] strArr2 = new String[3];
                        boolean z19 = tLObject instanceof TLRPC.User;
                        if (!z19) {
                            z9 = z16;
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            strArr2[z18 ? 1 : 0] = chat.title.toLowerCase();
                            str = chat.username;
                            break;
                        } else {
                            TLRPC.User user = (TLRPC.User) tLObject;
                            z9 = z16;
                            strArr2[z18 ? 1 : 0] = org.telegram.messenger.g5.m(z18 ? 1 : 0, user.first_name, user.last_name).toLowerCase();
                            str = org.telegram.messenger.t10.n(user);
                            if (org.telegram.messenger.t10.z(user)) {
                                strArr2[2] = org.telegram.messenger.id.M0(2131746267, null).toLowerCase();
                            } else if (org.telegram.messenger.t10.B(user)) {
                                if (kb1Var3.w.G) {
                                    strArr2[2] = org.telegram.messenger.id.M0(2131745904, null).toLowerCase();
                                } else {
                                    z10 = z17;
                                    arrayList = arrayList2;
                                    z11 = true;
                                }
                            } else if (user.bot) {
                            }
                            z10 = z17;
                            String S02 = org.telegram.messenger.id.E0().S0(strArr2[z18 ? 1 : 0], true, z18);
                            strArr2[1] = S02;
                            if (strArr2[z18 ? 1 : 0].equals(S02)) {
                                strArr2[1] = null;
                            }
                            int i11 = z18 ? 1 : 0;
                            int i12 = i11;
                            boolean z20 = z18;
                            while (i12 < i7) {
                                String str5 = strArr[i12];
                                int i13 = i11;
                                for (?? r92 = z20; r92 < 3; r92++) {
                                    String str6 = strArr2[r92];
                                    if (str6 != null) {
                                        if (str6.startsWith(str5)) {
                                            arrayList = arrayList2;
                                        } else {
                                            arrayList = arrayList2;
                                            if (jg.g.A(" ", str5, str6)) {
                                            }
                                        }
                                        i11 = 1;
                                        if (i11 == 0 && str != null && str.toLowerCase().startsWith(str5)) {
                                            i11 = 2;
                                        }
                                        if (i11 == 0) {
                                            z11 = true;
                                            if (i11 != 1) {
                                                arrayList4.add(org.telegram.messenger.g0.r0(rf.b.i("@", str), null, "@" + str5));
                                            } else if (z19) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList4.add(org.telegram.messenger.g0.r0(user2.first_name, user2.last_name, str5));
                                            } else {
                                                arrayList4.add(org.telegram.messenger.g0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                            }
                                            arrayList3.add(tLObject);
                                        } else {
                                            i12++;
                                            arrayList2 = arrayList;
                                            z20 = false;
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
                            z11 = true;
                        }
                        i10++;
                        z16 = z9;
                        z17 = z10;
                        arrayList2 = arrayList;
                        z18 = false;
                    }
                    org.telegram.messenger.g0.h3(new t21(kb1Var3, arrayList3, arrayList4, 9));
                    break;
                }
        }
    }
}
