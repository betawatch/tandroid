package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ da1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ ca1(da1 da1Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = da1Var;
        this.c = str;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        da1 da1Var;
        switch (this.a) {
            case 0:
                da1 da1Var2 = this.b;
                String str = this.c;
                int i10 = this.d;
                da1Var2.getClass();
                Utilities.g.c(new ca1(da1Var2, str, i10, 1));
                break;
            default:
                da1 da1Var3 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ea1 ea1Var = da1Var3.h;
                ArrayList arrayList = ea1Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    boolean z10 = false;
                    String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                    if (!lowerCase.equals(R0) && R0.length() != 0) {
                        str3 = R0;
                    }
                    int i12 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i12];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i13 = 0;
                    while (i13 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i13);
                        int i14 = z10 ? 1 : 0;
                        int i15 = i14;
                        boolean z11 = z10;
                        while (true) {
                            if (i14 < 2) {
                                String K = i14 == 0 ? chat.title : org.telegram.messenger.w3.K(chat, z11);
                                if (K == null) {
                                    da1Var = da1Var3;
                                } else {
                                    String lowerCase2 = K.toLowerCase();
                                    int i16 = z11;
                                    while (i16 < i12) {
                                        String str4 = strArr[i16];
                                        if (lowerCase2.startsWith(str4)) {
                                            da1Var = da1Var3;
                                        } else {
                                            da1Var = da1Var3;
                                            if (!sc.e.y(" ", str4, lowerCase2)) {
                                                i16++;
                                                da1Var3 = da1Var;
                                            }
                                        }
                                        i15 = 1;
                                        if (i15 == 0) {
                                            arrayList2.add(chat);
                                            arrayList3.add((String) ea1Var.h.get(i13));
                                        }
                                    }
                                    da1Var = da1Var3;
                                    if (i15 == 0) {
                                    }
                                }
                                i14++;
                                da1Var3 = da1Var;
                                z11 = 0;
                            } else {
                                da1Var = da1Var3;
                            }
                        }
                        i13++;
                        da1Var3 = da1Var;
                        z10 = false;
                    }
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.c11(da1Var3, i11, arrayList2, arrayList3, 12));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.c11(da1Var3, i11, str3, str3, 12));
                    break;
                }
                break;
        }
    }
}
