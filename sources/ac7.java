// default package

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ac7 {
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

    public ac7() {
        int i = q;
        q = i + 1;
        this.o = i;
    }

    public final boolean a(k5 k5Var, long j) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(k5Var.a).R.f(j);
        if (dialog == null) {
            return false;
        }
        return b(k5Var, j, dialog, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        if ((r13 instanceof org.telegram.tgnet.TLRPC.TL_dialogCommunity ? r3.V0(r13) == 0 && !r13.unread_mark && r13.unread_mentions_count == 0 : !r3.s2(r13)) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(k5 k5Var, long j, TLRPC.Dialog dialog, boolean z) {
        TLRPC.Chat M0;
        int i = k5Var.a;
        if (!uc7.s1(i).D2(j) && !this.i.contains(Long.valueOf(j))) {
            if (!this.h.contains(Long.valueOf(j))) {
                if (dialog.folder_id == 0 || (this.g & 128) == 0) {
                    uc7 s1 = uc7.s1(i);
                    lv2 r = lv2.r(i);
                    if ((this.g & 32) == 0 || !s1.p2(dialog.id, 0L, null) || dialog.unread_mentions_count != 0) {
                        if (!z && (this.g & 64) != 0) {
                        }
                        if (j > 0) {
                            TLRPC.User X1 = s1.X1(Long.valueOf(j));
                            if (X1 != null) {
                                if (!X1.bot) {
                                }
                            }
                        } else if (j < 0 && (M0 = s1.M0(Long.valueOf(-j))) != null) {
                            if (xc2.Y(M0)) {
                                int i2 = this.g;
                                int i3 = uc7.s5;
                                if ((i2 & i3) == i3) {
                                }
                            } else if (xc2.X(i, M0) || (!xc2.T(M0) || M0.megagroup ? (this.g & 4) == 0 : (this.g & 8) == 0)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean c() {
        int i = this.g;
        int i2 = uc7.r5;
        return (i & 512) > 0;
    }

    public final boolean d() {
        return this.a == 0;
    }

    public final boolean e() {
        if (!c()) {
            return false;
        }
        int i = this.g;
        int i2 = uc7.r5;
        return (i & 1024) > 0;
    }
}
