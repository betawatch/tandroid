package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m81 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ l81(m81 m81Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = m81Var;
        this.c = str;
        this.d = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        m81 m81Var;
        switch (this.a) {
            case 0:
                m81 m81Var2 = this.b;
                String str = this.c;
                int i7 = this.d;
                m81Var2.getClass();
                Utilities.g.c(new l81(m81Var2, str, i7, 1));
                break;
            default:
                m81 m81Var3 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                n81 n81Var = m81Var3.h;
                ArrayList arrayList = n81Var.f;
                String lowerCase = str2.trim().toLowerCase();
                String str3 = null;
                if (lowerCase.length() != 0) {
                    boolean z9 = false;
                    String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str3 = S0;
                    }
                    int i11 = (str3 != null ? 1 : 0) + 1;
                    String[] strArr = new String[i11];
                    strArr[0] = lowerCase;
                    if (str3 != null) {
                        strArr[1] = str3;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList.size()) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i12);
                        int i13 = z9 ? 1 : 0;
                        int i14 = i13;
                        boolean z10 = z9;
                        while (true) {
                            if (i13 < 2) {
                                String K = i13 == 0 ? chat.title : org.telegram.messenger.t3.K(chat, z10);
                                if (K == null) {
                                    m81Var = m81Var3;
                                } else {
                                    String lowerCase2 = K.toLowerCase();
                                    int i15 = z10;
                                    while (i15 < i11) {
                                        String str4 = strArr[i15];
                                        if (lowerCase2.startsWith(str4)) {
                                            m81Var = m81Var3;
                                        } else {
                                            m81Var = m81Var3;
                                            if (!jg.g.A(" ", str4, lowerCase2)) {
                                                i15++;
                                                m81Var3 = m81Var;
                                            }
                                        }
                                        i14 = 1;
                                        if (i14 == 0) {
                                            arrayList2.add(chat);
                                            arrayList3.add((String) n81Var.h.get(i12));
                                        }
                                    }
                                    m81Var = m81Var3;
                                    if (i14 == 0) {
                                    }
                                }
                                i13++;
                                m81Var3 = m81Var;
                                z10 = 0;
                            } else {
                                m81Var = m81Var3;
                            }
                        }
                        i12++;
                        m81Var3 = m81Var;
                        z9 = false;
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pp0(m81Var3, i10, arrayList2, arrayList3, 17));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.pp0(m81Var3, i10, str3, str3, 17));
                    break;
                }
                break;
        }
    }
}
