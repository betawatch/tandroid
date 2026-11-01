package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ aa1(ba1 ba1Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = ba1Var;
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
        ba1 ba1Var;
        switch (this.a) {
            case 0:
                ba1 ba1Var2 = this.b;
                String str = this.c;
                int i10 = this.d;
                ba1Var2.getClass();
                Utilities.g.c(new aa1(ba1Var2, str, i10, 1));
                break;
            default:
                ba1 ba1Var3 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ca1 ca1Var = ba1Var3.h;
                ArrayList arrayList = ca1Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    boolean z10 = false;
                    String R0 = org.telegram.messenger.dd.D0().R0(lowerCase, true, false);
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
                                    ba1Var = ba1Var3;
                                } else {
                                    String lowerCase2 = K.toLowerCase();
                                    int i16 = z11;
                                    while (i16 < i12) {
                                        String str4 = strArr[i16];
                                        if (lowerCase2.startsWith(str4)) {
                                            ba1Var = ba1Var3;
                                        } else {
                                            ba1Var = ba1Var3;
                                            if (!sc.e.y(" ", str4, lowerCase2)) {
                                                i16++;
                                                ba1Var3 = ba1Var;
                                            }
                                        }
                                        i15 = 1;
                                        if (i15 == 0) {
                                            arrayList2.add(chat);
                                            arrayList3.add((String) ca1Var.h.get(i13));
                                        }
                                    }
                                    ba1Var = ba1Var3;
                                    if (i15 == 0) {
                                    }
                                }
                                i14++;
                                ba1Var3 = ba1Var;
                                z11 = 0;
                            } else {
                                ba1Var = ba1Var3;
                            }
                        }
                        i13++;
                        ba1Var3 = ba1Var;
                        z10 = false;
                    }
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.d11(ba1Var3, i11, arrayList2, arrayList3, 12));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.d11(ba1Var3, i11, str3, str3, 12));
                    break;
                }
                break;
        }
    }
}
