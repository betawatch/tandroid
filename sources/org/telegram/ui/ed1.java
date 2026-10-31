package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ed1(fd1 fd1Var, String str, boolean z10, boolean z11, int i10) {
        this.a = i10;
        this.b = fd1Var;
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
                fd1 fd1Var = this.b;
                String str2 = this.c;
                boolean z13 = this.d;
                boolean z14 = this.e;
                fd1Var.getClass();
                org.telegram.messenger.i0.g3(new ed1(fd1Var, str2, z13, z14, 1));
                break;
            case 1:
                fd1 fd1Var2 = this.b;
                String str3 = this.c;
                boolean z15 = this.d;
                boolean z16 = this.e;
                fd1Var2.f.g(str3, true, z15, z15, fd1Var2.w.G, 0L, false, 0, 0);
                org.telegram.messenger.r5 r5Var = Utilities.g;
                ed1 ed1Var = new ed1(fd1Var2, str3, z16, z15, 2);
                fd1Var2.h = ed1Var;
                r5Var.c(ed1Var);
                break;
            default:
                fd1 fd1Var3 = this.b;
                String str4 = this.c;
                boolean z17 = this.d;
                boolean z18 = this.e;
                ArrayList arrayList2 = fd1Var3.r;
                String lowerCase = str4.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new k41(fd1Var3, new ArrayList(), new ArrayList(), 9));
                    break;
                } else {
                    boolean z19 = false;
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
                            strArr2[z19 ? 1 : 0] = org.telegram.messenger.i5.m(z19 ? 1 : 0, user.first_name, user.last_name).toLowerCase();
                            str = org.telegram.messenger.h20.n(user);
                            if (org.telegram.messenger.h20.z(user)) {
                                strArr2[2] = org.telegram.messenger.cd.L0(2131746281, null).toLowerCase();
                            } else if (org.telegram.messenger.h20.B(user)) {
                                if (fd1Var3.w.G) {
                                    strArr2[2] = org.telegram.messenger.cd.L0(2131745918, null).toLowerCase();
                                } else {
                                    z11 = z18;
                                    arrayList = arrayList2;
                                    z12 = true;
                                }
                            } else if (user.bot) {
                            }
                            z11 = z18;
                            String R02 = org.telegram.messenger.cd.D0().R0(strArr2[z19 ? 1 : 0], true, z19);
                            strArr2[1] = R02;
                            if (strArr2[z19 ? 1 : 0].equals(R02)) {
                                strArr2[1] = null;
                            }
                            int i12 = z19 ? 1 : 0;
                            int i13 = i12;
                            boolean z21 = z19;
                            while (i13 < i10) {
                                String str5 = strArr[i13];
                                int i14 = i12;
                                for (?? r92 = z21; r92 < 3; r92++) {
                                    String str6 = strArr2[r92];
                                    if (str6 != null) {
                                        if (str6.startsWith(str5)) {
                                            arrayList = arrayList2;
                                        } else {
                                            arrayList = arrayList2;
                                            if (sc.e.y(" ", str5, str6)) {
                                            }
                                        }
                                        i12 = 1;
                                        if (i12 == 0 && str != null && str.toLowerCase().startsWith(str5)) {
                                            i12 = 2;
                                        }
                                        if (i12 == 0) {
                                            z12 = true;
                                            if (i12 != 1) {
                                                arrayList4.add(org.telegram.messenger.i0.r0(sc.e.h("@", str), null, "@" + str5));
                                            } else if (z20) {
                                                TLRPC.User user2 = (TLRPC.User) tLObject;
                                                arrayList4.add(org.telegram.messenger.i0.r0(user2.first_name, user2.last_name, str5));
                                            } else {
                                                arrayList4.add(org.telegram.messenger.i0.r0(((TLRPC.Chat) tLObject).title, null, str5));
                                            }
                                            arrayList3.add(tLObject);
                                        } else {
                                            i13++;
                                            arrayList2 = arrayList;
                                            z21 = false;
                                        }
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                    arrayList2 = arrayList;
                                }
                                arrayList = arrayList2;
                                i12 = i14;
                                if (i12 == 0) {
                                    i12 = 2;
                                }
                                if (i12 == 0) {
                                }
                            }
                            arrayList = arrayList2;
                            z12 = true;
                        }
                        i11++;
                        z17 = z10;
                        z18 = z11;
                        arrayList2 = arrayList;
                        z19 = false;
                    }
                    org.telegram.messenger.i0.g3(new k41(fd1Var3, arrayList3, arrayList4, 9));
                    break;
                }
        }
    }
}
