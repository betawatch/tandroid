// default package

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eg3 {
    public long a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public Integer g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public float l;
    public boolean m;
    public int n;
    public boolean o = false;
    public long p;
    public final /* synthetic */ hg3 q;

    public eg3(hg3 hg3Var) {
        this.q = hg3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if (oc7.r1(r2).g4.e(-r1.I0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.message) != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ff  */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        Integer num;
        int i;
        long j;
        boolean z;
        boolean z2;
        TLRPC.DraftMessage T;
        ?? r5;
        boolean z3;
        boolean A;
        boolean z4;
        int topicId;
        int topicId2;
        int topicId3;
        int topicId4;
        hg3 hg3Var = this.q;
        int i2 = hg3Var.G0;
        TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(i2).R.f(hg3Var.I0);
        if (dialog == null) {
            if (hg3Var.k1 == 3) {
                long j2 = this.a;
                long j3 = hg3Var.I0;
                if (j2 != j3) {
                    this.a = j3;
                    return true;
                }
            }
            return false;
        }
        k47 k47Var = hg3Var.g1;
        int hashCode = k47Var == null ? 0 : hg3Var.g1.hashCode() + k47Var.e1();
        long j4 = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? TLObject.FLAG_21 : 0);
        if (hg3Var.X()) {
            oc7.r1(i2).g4.h(-hg3Var.I0);
            int[] iArr = qwb.w;
            if (iArr[2] > 0) {
                j4 |= 1048576;
            }
            if (iArr[4] > 0) {
                j4 |= 4194304;
            }
        }
        if (!hg3Var.X() && (hg3Var.O0 || hg3Var.Q)) {
            oc7 r1 = oc7.r1(i2);
            long j5 = hg3Var.I0;
            topicId3 = hg3Var.getTopicId();
            if (!TextUtils.isEmpty(r1.B1(j5, topicId3, true))) {
                oc7 r12 = oc7.r1(i2);
                long j6 = hg3Var.I0;
                topicId4 = hg3Var.getTopicId();
                num = r12.C1(j6, topicId4);
                int measuredWidth = hg3Var.getMeasuredWidth() + (hg3Var.getMeasuredHeight() << 16);
                if (hg3Var.X()) {
                    ArrayList l = oc7.r1(i2).g4.l(-hg3Var.I0);
                    i = l == null ? -1 : l.size();
                    if (i == -1) {
                    }
                    if (!hg3Var.Q) {
                        j = j4;
                        z = false;
                        if (hg3Var.O0) {
                            z2 = hs6.d0(i2).U(hg3Var.I0, 0L) != null;
                            T = !z2 ? hs6.d0(i2).T(hg3Var.I0, 0L) : null;
                            if (T == null) {
                            }
                            TLRPC.Chat chat = hg3Var.h2;
                            if (chat == null) {
                            }
                            A = oc7.r1(i2).i4.A(hg3Var.I0);
                            if (this.h != measuredWidth) {
                            }
                            if (this.a != hg3Var.I0) {
                            }
                            if (num != null) {
                            }
                            this.a = hg3Var.I0;
                            this.b = hashCode;
                            this.d = dialog.isFolder;
                            this.e = j;
                            this.g = num;
                            this.h = measuredWidth;
                            this.f = r5;
                            this.i = i;
                            this.j = hg3Var.B3;
                            this.k = z3;
                            this.c = A;
                            return true;
                        }
                        z2 = false;
                        T = null;
                        if (T == null) {
                        }
                        TLRPC.Chat chat2 = hg3Var.h2;
                        if (chat2 == null) {
                        }
                        A = oc7.r1(i2).i4.A(hg3Var.I0);
                        if (this.h != measuredWidth) {
                        }
                        if (this.a != hg3Var.I0) {
                        }
                        if (num != null) {
                        }
                        this.a = hg3Var.I0;
                        this.b = hashCode;
                        this.d = dialog.isFolder;
                        this.e = j;
                        this.g = num;
                        this.h = measuredWidth;
                        this.f = r5;
                        this.i = i;
                        this.j = hg3Var.B3;
                        this.k = z3;
                        this.c = A;
                        return true;
                    }
                    hs6 d0 = hs6.d0(i2);
                    long j7 = hg3Var.I0;
                    topicId = hg3Var.getTopicId();
                    z = false;
                    z2 = d0.U(j7, (long) topicId) != null;
                    if (z2) {
                        j = j4;
                        T = null;
                    } else {
                        hs6 d02 = hs6.d0(i2);
                        long j8 = hg3Var.I0;
                        topicId2 = hg3Var.getTopicId();
                        j = j4;
                        T = d02.T(j8, topicId2);
                    }
                    if (T != null) {
                    }
                    if (T == null) {
                        r5 = z;
                    } else {
                        int hashCode2 = T.message.hashCode();
                        TLRPC.InputReplyTo inputReplyTo = T.reply_to;
                        r5 = (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : z) + hashCode2;
                    }
                    TLRPC.Chat chat22 = hg3Var.h2;
                    z3 = (chat22 == null && chat22.call_active && chat22.call_not_empty) ? true : z;
                    A = oc7.r1(i2).i4.A(hg3Var.I0);
                    if (this.h != measuredWidth && this.b == hashCode && this.c == A && this.a == hg3Var.I0 && this.d == dialog.isFolder && this.e == j && Objects.equals(this.g, num) && this.i == i && r5 == this.f && this.j == hg3Var.B3 && this.k == z3 && hg3Var.l2 == z2) {
                        return z;
                    }
                    if (this.a != hg3Var.I0) {
                        this.l = num == null ? 0.0f : 1.0f;
                        this.o = z;
                    } else if (!Objects.equals(this.g, num) || this.o) {
                        if (this.o) {
                            if (this.b != hashCode) {
                                z4 = false;
                                this.o = false;
                                if (this.b == hashCode) {
                                    this.m = z4;
                                } else {
                                    this.m = true;
                                }
                            }
                        } else if (num == null) {
                            this.o = true;
                            this.p = System.currentTimeMillis();
                        }
                        z4 = false;
                        if (this.b == hashCode) {
                        }
                    }
                    if (num != null) {
                        this.n = num.intValue();
                    }
                    this.a = hg3Var.I0;
                    this.b = hashCode;
                    this.d = dialog.isFolder;
                    this.e = j;
                    this.g = num;
                    this.h = measuredWidth;
                    this.f = r5;
                    this.i = i;
                    this.j = hg3Var.B3;
                    this.k = z3;
                    this.c = A;
                    return true;
                }
                i = 0;
                if (!hg3Var.Q) {
                }
            }
        }
        num = null;
        int measuredWidth2 = hg3Var.getMeasuredWidth() + (hg3Var.getMeasuredHeight() << 16);
        if (hg3Var.X()) {
        }
        i = 0;
        if (!hg3Var.Q) {
        }
    }

    public final void b() {
        boolean z = this.o;
        hg3 hg3Var = this.q;
        if (z) {
            if (System.currentTimeMillis() - this.p > 100) {
                this.o = false;
            }
            hg3Var.invalidate();
            return;
        }
        Integer num = this.g;
        if (num != null && hg3Var.g3 != null) {
            float f = this.l;
            if (f != 1.0f) {
                this.l = f + 0.08f;
                hg3Var.invalidate();
                this.l = Utilities.i(this.l, 1.0f, 0.0f);
            }
        }
        if (num == null) {
            float f2 = this.l;
            if (f2 != 0.0f) {
                this.l = f2 - 0.08f;
                hg3Var.invalidate();
            }
        }
        this.l = Utilities.i(this.l, 1.0f, 0.0f);
    }
}
