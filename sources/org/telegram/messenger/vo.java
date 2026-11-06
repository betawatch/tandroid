package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class vo {
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

    public vo() {
        int i7 = q;
        q = i7 + 1;
        this.o = i7;
    }

    public final boolean a(int i7, TLRPC.Dialog dialog) {
        TLRPC.EncryptedChat a12;
        if (dialog == null) {
            return false;
        }
        long j3 = dialog.id;
        if (m5.C(j3) && (a12 = qp.s1(i7).a1(Integer.valueOf((int) (4294967295L & j3)))) != null) {
            j3 = a12.user_id;
        }
        return this.h.contains(Long.valueOf(j3));
    }

    public final boolean b(c cVar, long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) qp.s1(cVar.a).Q.f(j3);
        if (dialog == null) {
            return false;
        }
        return c(cVar, j3, dialog);
    }

    public final boolean c(c cVar, long j3, TLRPC.Dialog dialog) {
        TLRPC.Chat M0;
        if (this.i.contains(Long.valueOf(j3))) {
            return false;
        }
        if (!this.h.contains(Long.valueOf(j3))) {
            if (dialog.folder_id != 0) {
                int i7 = this.g;
                int i10 = qp.C8;
                if ((i7 & 128) != 0) {
                    return false;
                }
            }
            int i11 = cVar.a;
            qp s12 = qp.s1(i11);
            g5 r10 = g5.r(i11);
            if ((this.g & 32) != 0 && s12.r2(dialog.id, 0L, null) && dialog.unread_mentions_count == 0) {
                return false;
            }
            if ((this.g & 64) != 0 && s12.V0(dialog) == 0 && !dialog.unread_mark && dialog.unread_mentions_count == 0) {
                return false;
            }
            if (j3 > 0) {
                TLRPC.User a22 = s12.a2(Long.valueOf(j3));
                if (a22 == null) {
                    return false;
                }
                if (a22.bot) {
                    if ((this.g & 16) == 0) {
                        return false;
                    }
                } else if (a22.self || a22.contact || r10.x(j3)) {
                    if ((this.g & 1) == 0) {
                        return false;
                    }
                } else if ((this.g & 2) == 0) {
                    return false;
                }
            } else {
                if (j3 >= 0 || (M0 = s12.M0(Long.valueOf(-j3))) == null) {
                    return false;
                }
                if (t3.Y(M0)) {
                    int i12 = this.g;
                    int i13 = qp.D8;
                    if ((i12 & i13) != i13) {
                        return false;
                    }
                } else {
                    if (t3.X(i11, M0)) {
                        return false;
                    }
                    if (!t3.T(M0) || M0.megagroup) {
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
        int i7 = this.g;
        int i10 = qp.C8;
        return (i7 & 512) > 0;
    }

    public final boolean e() {
        return this.a == 0;
    }

    public final boolean f() {
        if (!d()) {
            return false;
        }
        int i7 = this.g;
        int i10 = qp.C8;
        return (i7 & 1024) > 0;
    }
}
