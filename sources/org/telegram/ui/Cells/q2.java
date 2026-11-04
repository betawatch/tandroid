package org.telegram.ui.Cells;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c00;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    
        if (org.telegram.messenger.hp.s1(r2).q7.e(-r1.I0) != false) goto L58;
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
        int i3;
        long j10;
        boolean z10;
        boolean z11;
        TLRPC.DraftMessage R;
        ?? r5;
        boolean z12;
        boolean B;
        boolean z13;
        int topicId;
        int topicId2;
        int topicId3;
        int topicId4;
        t2 t2Var = this.q;
        int i10 = t2Var.G0;
        TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(i10).R.f(t2Var.I0);
        if (dialog == null) {
            if (t2Var.k1 == 3) {
                long j11 = this.a;
                long j12 = t2Var.I0;
                if (j11 != j12) {
                    this.a = j12;
                    return true;
                }
            }
            return false;
        }
        zi ziVar = t2Var.g1;
        int hashCode = ziVar == null ? 0 : t2Var.g1.hashCode() + ziVar.f1();
        long j13 = dialog.read_inbox_max_id + (dialog.read_outbox_max_id << 8) + ((dialog.unread_count + (dialog.unread_mark ? -1 : 0)) << 16) + (dialog.unread_reactions_count > 0 ? 262144 : 0) + (dialog.unread_mentions_count > 0 ? TLObject.FLAG_19 : 0) + (dialog.unread_poll_votes_count > 0 ? TLObject.FLAG_21 : 0);
        if (t2Var.W()) {
            hp.s1(i10).q7.h(-t2Var.I0);
            int[] iArr = c00.n;
            if (iArr[2] > 0) {
                j13 |= 1048576;
            }
            if (iArr[4] > 0) {
                j13 |= 4194304;
            }
        }
        if (!t2Var.W() && (t2Var.O0 || t2Var.Q)) {
            hp s12 = hp.s1(i10);
            long j14 = t2Var.I0;
            topicId3 = t2Var.getTopicId();
            if (!TextUtils.isEmpty(s12.D1(j14, topicId3, true))) {
                hp s13 = hp.s1(i10);
                long j15 = t2Var.I0;
                topicId4 = t2Var.getTopicId();
                num = s13.E1(j15, topicId4);
                int measuredWidth = t2Var.getMeasuredWidth() + (t2Var.getMeasuredHeight() << 16);
                if (t2Var.W()) {
                    ArrayList l10 = hp.s1(i10).q7.l(-t2Var.I0);
                    i3 = l10 == null ? -1 : l10.size();
                    if (i3 == -1) {
                    }
                    if (!t2Var.Q) {
                        j10 = j13;
                        z10 = false;
                        if (t2Var.O0) {
                            z11 = li.b0(i10).S(t2Var.I0, 0L) != null;
                            R = !z11 ? li.b0(i10).R(t2Var.I0, 0L) : null;
                            if (R == null) {
                            }
                            TLRPC.Chat chat = t2Var.h2;
                            if (chat == null) {
                            }
                            B = hp.s1(i10).s7.B(t2Var.I0);
                            if (this.h != measuredWidth) {
                            }
                            if (this.a != t2Var.I0) {
                            }
                            if (num != null) {
                            }
                            this.a = t2Var.I0;
                            this.b = hashCode;
                            this.d = dialog.isFolder;
                            this.e = j10;
                            this.g = num;
                            this.h = measuredWidth;
                            this.f = r5;
                            this.i = i3;
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
                        B = hp.s1(i10).s7.B(t2Var.I0);
                        if (this.h != measuredWidth) {
                        }
                        if (this.a != t2Var.I0) {
                        }
                        if (num != null) {
                        }
                        this.a = t2Var.I0;
                        this.b = hashCode;
                        this.d = dialog.isFolder;
                        this.e = j10;
                        this.g = num;
                        this.h = measuredWidth;
                        this.f = r5;
                        this.i = i3;
                        this.j = t2Var.B3;
                        this.k = z12;
                        this.c = B;
                        return true;
                    }
                    li b02 = li.b0(i10);
                    long j16 = t2Var.I0;
                    topicId = t2Var.getTopicId();
                    z10 = false;
                    z11 = b02.S(j16, (long) topicId) != null;
                    if (z11) {
                        j10 = j13;
                        R = null;
                    } else {
                        li b03 = li.b0(i10);
                        long j17 = t2Var.I0;
                        topicId2 = t2Var.getTopicId();
                        j10 = j13;
                        R = b03.R(j17, topicId2);
                    }
                    if (R != null) {
                    }
                    if (R == null) {
                        r5 = z10;
                    } else {
                        int hashCode2 = R.message.hashCode();
                        TLRPC.InputReplyTo inputReplyTo = R.reply_to;
                        r5 = (inputReplyTo != null ? inputReplyTo.reply_to_msg_id << 16 : z10) + hashCode2;
                    }
                    TLRPC.Chat chat22 = t2Var.h2;
                    z12 = (chat22 == null && chat22.call_active && chat22.call_not_empty) ? true : z10;
                    B = hp.s1(i10).s7.B(t2Var.I0);
                    if (this.h != measuredWidth && this.b == hashCode && this.c == B && this.a == t2Var.I0 && this.d == dialog.isFolder && this.e == j10 && Objects.equals(this.g, num) && this.i == i3 && r5 == this.f && this.j == t2Var.B3 && this.k == z12 && t2Var.l2 == z11) {
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
                    this.e = j10;
                    this.g = num;
                    this.h = measuredWidth;
                    this.f = r5;
                    this.i = i3;
                    this.j = t2Var.B3;
                    this.k = z12;
                    this.c = B;
                    return true;
                }
                i3 = 0;
                if (!t2Var.Q) {
                }
            }
        }
        num = null;
        int measuredWidth2 = t2Var.getMeasuredWidth() + (t2Var.getMeasuredHeight() << 16);
        if (t2Var.W()) {
        }
        i3 = 0;
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
