package org.telegram.ui.Cells;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gj;
import org.telegram.messenger.h00;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q2 {
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
    public final /* synthetic */ t2 q;

    public q2(t2 t2Var) {
        this.q = t2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if (org.telegram.messenger.np.s1(r2).r7.e(-r1.I0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.message) != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x014f  */
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
        int i7;
        long j3;
        boolean z10;
        boolean z11;
        TLRPC.DraftMessage R;
        ?? r52;
        boolean z12;
        boolean B;
        boolean z13;
        int topicId;
        int topicId2;
        int topicId3;
        int topicId4;
        t2 t2Var = this.q;
        int i10 = t2Var.G0;
        TLRPC.Dialog dialog = (TLRPC.Dialog) np.s1(i10).R.f(t2Var.I0);
        if (dialog == null) {
            if (t2Var.k1 == 3) {
                long j10 = this.a;
                long j11 = t2Var.I0;
                if (j10 != j11) {
                    this.a = j11;
                    return true;
                }
            }
            return false;
        }
        gj gjVar = t2Var.g1;
        int hashCode = gjVar == null ? 0 : t2Var.g1.hashCode() + gjVar.e1();
        long j12 = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? TLObject.FLAG_21 : 0);
        if (t2Var.Z()) {
            np.s1(i10).r7.h(-t2Var.I0);
            int[] iArr = h00.n;
            if (iArr[2] > 0) {
                j12 |= 1048576;
            }
            if (iArr[4] > 0) {
                j12 |= 4194304;
            }
        }
        if (!t2Var.Z() && (t2Var.O0 || t2Var.Q)) {
            np s12 = np.s1(i10);
            long j13 = t2Var.I0;
            topicId3 = t2Var.getTopicId();
            if (!TextUtils.isEmpty(s12.D1(j13, topicId3, true))) {
                np s13 = np.s1(i10);
                long j14 = t2Var.I0;
                topicId4 = t2Var.getTopicId();
                num = s13.E1(j14, topicId4);
                int measuredWidth = t2Var.getMeasuredWidth() + (t2Var.getMeasuredHeight() << 16);
                if (t2Var.Z()) {
                    ArrayList l10 = np.s1(i10).r7.l(-t2Var.I0);
                    i7 = l10 == null ? -1 : l10.size();
                    if (i7 == -1) {
                    }
                    if (!t2Var.Q) {
                        j3 = j12;
                        z10 = false;
                        if (t2Var.O0) {
                            z11 = si.b0(i10).S(t2Var.I0, 0L) != null;
                            R = !z11 ? si.b0(i10).R(t2Var.I0, 0L) : null;
                            if (R == null) {
                            }
                            TLRPC.Chat chat = t2Var.h2;
                            if (chat == null) {
                            }
                            B = np.s1(i10).t7.B(t2Var.I0);
                            if (this.h != measuredWidth) {
                            }
                            if (this.a != t2Var.I0) {
                            }
                            if (num != null) {
                            }
                            this.a = t2Var.I0;
                            this.b = hashCode;
                            this.d = dialog.isFolder;
                            this.e = j3;
                            this.g = num;
                            this.h = measuredWidth;
                            this.f = r52;
                            this.i = i7;
                            this.j = t2Var.B3;
                            this.k = z12;
                            this.c = B;
                            return true;
                        }
                        z11 = false;
                        R = null;
                        if (R == null) {
                        }
                        TLRPC.Chat chat2 = t2Var.h2;
                        if (chat2 == null) {
                        }
                        B = np.s1(i10).t7.B(t2Var.I0);
                        if (this.h != measuredWidth) {
                        }
                        if (this.a != t2Var.I0) {
                        }
                        if (num != null) {
                        }
                        this.a = t2Var.I0;
                        this.b = hashCode;
                        this.d = dialog.isFolder;
                        this.e = j3;
                        this.g = num;
                        this.h = measuredWidth;
                        this.f = r52;
                        this.i = i7;
                        this.j = t2Var.B3;
                        this.k = z12;
                        this.c = B;
                        return true;
                    }
                    si b02 = si.b0(i10);
                    long j15 = t2Var.I0;
                    topicId = t2Var.getTopicId();
                    z10 = false;
                    z11 = b02.S(j15, (long) topicId) != null;
                    if (z11) {
                        j3 = j12;
                        R = null;
                    } else {
                        si b03 = si.b0(i10);
                        long j16 = t2Var.I0;
                        topicId2 = t2Var.getTopicId();
                        j3 = j12;
                        R = b03.R(j16, topicId2);
                    }
                    if (R != null) {
                    }
                    if (R == null) {
                        r52 = z10;
                    } else {
                        int hashCode2 = R.message.hashCode();
                        TLRPC.InputReplyTo inputReplyTo = R.reply_to;
                        r52 = (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : z10) + hashCode2;
                    }
                    TLRPC.Chat chat22 = t2Var.h2;
                    z12 = (chat22 == null && chat22.call_active && chat22.call_not_empty) ? true : z10;
                    B = np.s1(i10).t7.B(t2Var.I0);
                    if (this.h != measuredWidth && this.b == hashCode && this.c == B && this.a == t2Var.I0 && this.d == dialog.isFolder && this.e == j3 && Objects.equals(this.g, num) && this.i == i7 && r52 == this.f && this.j == t2Var.B3 && this.k == z12 && t2Var.l2 == z11) {
                        return z10;
                    }
                    if (this.a != t2Var.I0) {
                        this.l = num == null ? 0.0f : 1.0f;
                        this.o = z10;
                    } else if (!Objects.equals(this.g, num) || this.o) {
                        boolean z14 = this.o;
                        if (!z14 && num == null) {
                            this.o = true;
                            this.p = System.currentTimeMillis();
                        } else if (z14 && this.b != hashCode) {
                            z13 = false;
                            this.o = false;
                            if (this.b == hashCode) {
                                this.m = z13;
                            } else {
                                this.m = true;
                            }
                        }
                        z13 = false;
                        if (this.b == hashCode) {
                        }
                    }
                    if (num != null) {
                        this.n = num.intValue();
                    }
                    this.a = t2Var.I0;
                    this.b = hashCode;
                    this.d = dialog.isFolder;
                    this.e = j3;
                    this.g = num;
                    this.h = measuredWidth;
                    this.f = r52;
                    this.i = i7;
                    this.j = t2Var.B3;
                    this.k = z12;
                    this.c = B;
                    return true;
                }
                i7 = 0;
                if (!t2Var.Q) {
                }
            }
        }
        num = null;
        int measuredWidth2 = t2Var.getMeasuredWidth() + (t2Var.getMeasuredHeight() << 16);
        if (t2Var.Z()) {
        }
        i7 = 0;
        if (!t2Var.Q) {
        }
    }

    public final void b() {
        boolean z10 = this.o;
        t2 t2Var = this.q;
        if (z10) {
            if (System.currentTimeMillis() - this.p > 100) {
                this.o = false;
            }
            t2Var.invalidate();
            return;
        }
        Integer num = this.g;
        if (num != null && t2Var.g3 != null) {
            float f10 = this.l;
            if (f10 != 1.0f) {
                this.l = f10 + 0.08f;
                t2Var.invalidate();
                this.l = Utilities.i(this.l, 1.0f, 0.0f);
            }
        }
        if (num == null) {
            float f11 = this.l;
            if (f11 != 0.0f) {
                this.l = f11 - 0.08f;
                t2Var.invalidate();
            }
        }
        this.l = Utilities.i(this.l, 1.0f, 0.0f);
    }
}
