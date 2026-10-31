package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ap {
    public static int q = 10;
    public int a;
    public String b;
    public int d;
    public volatile int e;
    public int f;
    public int g;
    public int m;
    public boolean n;
    public final int o;
    public boolean p;
    public ArrayList c = new ArrayList();
    public ArrayList h = new ArrayList();
    public ArrayList i = new ArrayList();
    public final LongSparseIntArray j = new LongSparseIntArray();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public ap() {
        int i10 = q;
        q = i10 + 1;
        this.o = i10;
    }

    public final boolean a(int i10, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat Z0;
        if (dialog == null) {
            return false;
        }
        long j10 = dialog.id;
        if (o5.C(j10) && (Z0 = vp.r1(i10).Z0(Integer.valueOf((int) (4294967295L & j10)))) != null) {
            j10 = Z0.user_id;
        }
        return this.h.contains(Long.valueOf(j10));
    }

    public final boolean b(c cVar, long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) vp.r1(cVar.a).Q.f(j10);
        if (dialog == null) {
            return false;
        }
        return c(cVar, j10, dialog);
    }

    public final boolean c(c cVar, long j10, TLRPC.Dialog dialog) {
        TLRPC.Chat L0;
        if (this.i.contains(Long.valueOf(j10))) {
            return false;
        }
        if (!this.h.contains(Long.valueOf(j10))) {
            if (dialog.folder_id != 0) {
                int i10 = this.g;
                int i11 = vp.D8;
                if ((i10 & 128) != 0) {
                    return false;
                }
            }
            int i12 = cVar.a;
            vp r12 = vp.r1(i12);
            i5 r10 = i5.r(i12);
            if ((this.g & 32) != 0 && r12.q2(dialog.id, 0L, null) && dialog.unread_mentions_count == 0) {
                return false;
            }
            if ((this.g & 64) != 0 && r12.U0(dialog) == 0 && !dialog.unread_mark && dialog.unread_mentions_count == 0) {
                return false;
            }
            if (j10 > 0) {
                TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
                if (Z1 == null) {
                    return false;
                }
                if (Z1.bot) {
                    if ((this.g & 16) == 0) {
                        return false;
                    }
                } else if (Z1.self || Z1.contact || r10.x(j10)) {
                    if ((this.g & 1) == 0) {
                        return false;
                    }
                } else if ((this.g & 2) == 0) {
                    return false;
                }
            } else {
                if (j10 >= 0 || (L0 = r12.L0(Long.valueOf(-j10))) == null) {
                    return false;
                }
                if (w3.Y(L0)) {
                    int i13 = this.g;
                    int i14 = vp.E8;
                    if ((i13 & i14) != i14) {
                        return false;
                    }
                } else {
                    if (w3.X(i12, L0)) {
                        return false;
                    }
                    if (!w3.T(L0) || L0.megagroup) {
                        if ((this.g & 4) == 0) {
                            return false;
                        }
                    } else if ((this.g & 8) == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean d() {
        int i10 = this.g;
        int i11 = vp.D8;
        return (i10 & 512) > 0;
    }

    public final boolean e() {
        return this.a == 0;
    }

    public final boolean f() {
        if (!d()) {
            return false;
        }
        int i10 = this.g;
        int i11 = vp.D8;
        return (i10 & 1024) > 0;
    }
}
