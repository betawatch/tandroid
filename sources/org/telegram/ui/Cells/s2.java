package org.telegram.ui.Cells;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.x00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s2 {
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
    public final /* synthetic */ v2 q;

    public s2(v2 v2Var) {
        this.q = v2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if (org.telegram.messenger.vp.r1(r2).r7.e(-r1.H0) != false) goto L58;
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
        int i10;
        long j10;
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
        v2 v2Var = this.q;
        int i11 = v2Var.F0;
        TLRPC.Dialog dialog = (TLRPC.Dialog) vp.r1(i11).Q.f(v2Var.H0);
        if (dialog == null) {
            if (v2Var.j1 == 3) {
                long j11 = this.a;
                long j12 = v2Var.H0;
                if (j11 != j12) {
                    this.a = j12;
                    return true;
                }
            }
            return false;
        }
        jj jjVar = v2Var.f1;
        int hashCode = jjVar == null ? 0 : v2Var.f1.hashCode() + jjVar.f1();
        long j13 = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? TLObject.FLAG_21 : 0);
        if (v2Var.X()) {
            vp.r1(i11).r7.h(-v2Var.H0);
            int[] iArr = x00.n;
            if (iArr[2] > 0) {
                j13 |= 1048576;
            }
            if (iArr[4] > 0) {
                j13 |= 4194304;
            }
        }
        if (!v2Var.X() && (v2Var.N0 || v2Var.P)) {
            vp r12 = vp.r1(i11);
            long j14 = v2Var.H0;
            topicId3 = v2Var.getTopicId();
            if (!TextUtils.isEmpty(r12.C1(j14, topicId3, true))) {
                vp r13 = vp.r1(i11);
                long j15 = v2Var.H0;
                topicId4 = v2Var.getTopicId();
                num = r13.D1(j15, topicId4);
                int measuredWidth = v2Var.getMeasuredWidth() + (v2Var.getMeasuredHeight() << 16);
                if (v2Var.X()) {
                    ArrayList l4 = vp.r1(i11).r7.l(-v2Var.H0);
                    i10 = l4 == null ? -1 : l4.size();
                    if (i10 == -1) {
                    }
                    if (!v2Var.P) {
                        j10 = j13;
                        z10 = false;
                        if (v2Var.N0) {
                            z11 = ui.b0(i11).S(v2Var.H0, 0L) != null;
                            R = !z11 ? ui.b0(i11).R(v2Var.H0, 0L) : null;
                            if (R == null) {
                            }
                            TLRPC.Chat chat = v2Var.g2;
                            if (chat == null) {
                            }
                            B = vp.r1(i11).t7.B(v2Var.H0);
                            if (this.h != measuredWidth) {
                            }
                            if (this.a != v2Var.H0) {
                            }
                            if (num != null) {
                            }
                            this.a = v2Var.H0;
                            this.b = hashCode;
                            this.d = dialog.isFolder;
                            this.e = j10;
                            this.g = num;
                            this.h = measuredWidth;
                            this.f = r52;
                            this.i = i10;
                            this.j = v2Var.A3;
                            this.k = z12;
                            this.c = B;
                            return true;
                        }
                        z11 = false;
                        R = null;
                        if (R == null) {
                        }
                        TLRPC.Chat chat2 = v2Var.g2;
                        if (chat2 == null) {
                        }
                        B = vp.r1(i11).t7.B(v2Var.H0);
                        if (this.h != measuredWidth) {
                        }
                        if (this.a != v2Var.H0) {
                        }
                        if (num != null) {
                        }
                        this.a = v2Var.H0;
                        this.b = hashCode;
                        this.d = dialog.isFolder;
                        this.e = j10;
                        this.g = num;
                        this.h = measuredWidth;
                        this.f = r52;
                        this.i = i10;
                        this.j = v2Var.A3;
                        this.k = z12;
                        this.c = B;
                        return true;
                    }
                    ui b02 = ui.b0(i11);
                    long j16 = v2Var.H0;
                    topicId = v2Var.getTopicId();
                    z10 = false;
                    z11 = b02.S(j16, (long) topicId) != null;
                    if (z11) {
                        j10 = j13;
                        R = null;
                    } else {
                        ui b03 = ui.b0(i11);
                        long j17 = v2Var.H0;
                        topicId2 = v2Var.getTopicId();
                        j10 = j13;
                        R = b03.R(j17, topicId2);
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
                    TLRPC.Chat chat22 = v2Var.g2;
                    z12 = (chat22 == null && chat22.call_active && chat22.call_not_empty) ? true : z10;
                    B = vp.r1(i11).t7.B(v2Var.H0);
                    if (this.h != measuredWidth && this.b == hashCode && this.c == B && this.a == v2Var.H0 && this.d == dialog.isFolder && this.e == j10 && Objects.equals(this.g, num) && this.i == i10 && r52 == this.f && this.j == v2Var.A3 && this.k == z12 && v2Var.k2 == z11) {
                        return z10;
                    }
                    if (this.a != v2Var.H0) {
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
                    this.a = v2Var.H0;
                    this.b = hashCode;
                    this.d = dialog.isFolder;
                    this.e = j10;
                    this.g = num;
                    this.h = measuredWidth;
                    this.f = r52;
                    this.i = i10;
                    this.j = v2Var.A3;
                    this.k = z12;
                    this.c = B;
                    return true;
                }
                i10 = 0;
                if (!v2Var.P) {
                }
            }
        }
        num = null;
        int measuredWidth2 = v2Var.getMeasuredWidth() + (v2Var.getMeasuredHeight() << 16);
        if (v2Var.X()) {
        }
        i10 = 0;
        if (!v2Var.P) {
        }
    }

    public final void b() {
        boolean z10 = this.o;
        v2 v2Var = this.q;
        if (z10) {
            if (System.currentTimeMillis() - this.p > 100) {
                this.o = false;
            }
            v2Var.invalidate();
            return;
        }
        Integer num = this.g;
        if (num != null && v2Var.f3 != null) {
            float f7 = this.l;
            if (f7 != 1.0f) {
                this.l = f7 + 0.08f;
                v2Var.invalidate();
                this.l = Utilities.i(this.l, 1.0f, 0.0f);
            }
        }
        if (num == null) {
            float f10 = this.l;
            if (f10 != 0.0f) {
                this.l = f10 - 0.08f;
                v2Var.invalidate();
            }
        }
        this.l = Utilities.i(this.l, 1.0f, 0.0f);
    }
}
