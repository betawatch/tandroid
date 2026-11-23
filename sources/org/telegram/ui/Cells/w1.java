package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class w1 {
    public final r1 a;
    public org.telegram.ui.Components.d9 b;
    public xy0 c;
    public int d;
    public Drawable e;

    public w1(r1 r1Var) {
        this.a = r1Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout;
        r1 r1Var = this.a;
        boolean J4 = r1Var.Q5.J4();
        gj gjVar = r1Var.Q5;
        if (gjVar.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            drawable = gjVar.P3() ? org.telegram.ui.ActionBar.m6.O4 : org.telegram.ui.ActionBar.m6.P4;
            if (this.e == null) {
                this.e = r1Var.getContext().getResources().getDrawable(r1Var.Q5.J4() ? R.drawable.filled_video_group : R.drawable.filled_calls_users).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.m6.w0(r1Var.Q5.P3() ? org.telegram.ui.ActionBar.m6.Mb : org.telegram.ui.ActionBar.m6.ud, r1Var.Qb);
            if (this.d != w02) {
                Drawable drawable3 = this.e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (gjVar.P3()) {
            drawable = org.telegram.ui.ActionBar.m6.O4;
            if (r1Var.Q5.J4()) {
                r1Var.A2();
                drawable2 = r1Var.Z1("drawableMsgOutCallVideo");
            } else {
                drawable2 = r1Var.Z1(r1Var.A2() ? "drawableMsgOutCallAudioSelected" : "drawableMsgOutCallAudio");
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = r1Var.Q5.k.action.reason;
            drawable = ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) ? org.telegram.ui.ActionBar.m6.P4 : org.telegram.ui.ActionBar.m6.Q4;
            drawable2 = r1Var.A2() ? org.telegram.ui.ActionBar.m6.H4[J4 ? 1 : 0] : org.telegram.ui.ActionBar.m6.G4[J4 ? 1 : 0];
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (r1Var.Q5.P3()) {
            org.telegram.ui.ActionBar.m6.O2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wc, r1Var.Qb));
            org.telegram.ui.ActionBar.m6.S2.setColor(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.ec : org.telegram.ui.ActionBar.m6.jc, r1Var.Qb));
        } else {
            org.telegram.ui.ActionBar.m6.O2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vc, r1Var.Qb));
            org.telegram.ui.ActionBar.m6.S2.setColor(org.telegram.ui.ActionBar.m6.w0(r1Var.A2() ? org.telegram.ui.ActionBar.m6.fe : org.telegram.ui.ActionBar.m6.ee, r1Var.Qb));
        }
        r1Var.G9 = true;
        int L = r1Var.Q5.P3() ? org.telegram.messenger.g0.L(16.0f) + (r1Var.d7 - r1Var.b7) : r1Var.b3() ? org.telegram.messenger.g0.L(74.0f) : org.telegram.messenger.g0.L(25.0f);
        r1Var.S3 = L;
        if (hd.a0) {
            L = org.telegram.messenger.f3.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i7 = L;
        if (r1Var.o2 != null) {
            canvas.save();
            canvas.translate(i7, org.telegram.messenger.g0.L(12.0f) + r1Var.Ua);
            r1Var.o2.draw(canvas);
            canvas.restore();
        }
        if (r1Var.e3 != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(hd.a0 ? -19.0f : 19.0f) + i7, org.telegram.messenger.g0.L(37.0f) + r1Var.Ua);
            r1Var.e3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(hd.a0 ? -19.0f : 19.0f) + i7 + r1Var.f3, org.telegram.messenger.g0.L(36.0f) + r1Var.Ua);
            this.b.g(canvas);
            canvas.translate(this.b.A + org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.m6.S2.getColor(), canvas);
            canvas.restore();
        }
        z.s((i7 + ((!hd.a0 || (staticLayout = r1Var.e3) == null) ? 0 : staticLayout.getWidth() - drawable4.getIntrinsicWidth())) - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(37.0f) + r1Var.Ua, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = r1Var.J2[0];
        if (drawable6 != null && r1Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z10 = r1Var.G;
        if (!z10 && !r1Var.F) {
            r1Var.T3 = org.telegram.messenger.g0.L(18.5f);
        } else if (z10 && r1Var.F) {
            r1Var.T3 = org.telegram.messenger.g0.L(18.0f);
        } else if (z10) {
            r1Var.T3 = org.telegram.messenger.g0.L(19.0f);
        } else {
            r1Var.T3 = org.telegram.messenger.g0.L(17.0f);
        }
        z.s(org.telegram.messenger.g0.L(!J4 ? 1 : 0) + r1Var.S3 + (hd.a0 ? 0 : r1Var.b7 - org.telegram.messenger.g0.L(70.0f)), r1Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(gj gjVar, boolean z10) {
        float f10;
        float f11;
        boolean z11;
        int i7;
        boolean z12;
        boolean z13;
        ArrayList<TLRPC.Peer> arrayList;
        float f12;
        r1 r1Var = this.a;
        int i10 = r1Var.a6;
        ch.q0 q0Var = r1Var.O;
        r1Var.A0(0);
        r1Var.j9 = false;
        r1Var.s9 = false;
        r1Var.O1 = false;
        int i11 = 52;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (r1Var.X6) {
                i11 = 71;
            } else if (!z10) {
                i11 = 0;
            }
            r1Var.b7 = Math.min(Q0 - org.telegram.messenger.g0.L(i11 + 50), org.telegram.messenger.g0.L(270.0f));
        } else {
            int parentWidth = r1Var.getParentWidth();
            if (r1Var.X6) {
                i11 = 71;
            } else if (!z10) {
                i11 = 0;
            }
            r1Var.b7 = Math.min(parentWidth - org.telegram.messenger.g0.L(i11 + 50), org.telegram.messenger.g0.L(270.0f));
        }
        r1Var.V6 = r1Var.b7 - org.telegram.messenger.g0.L(31.0f);
        int maxNameWidth = r1Var.getMaxNameWidth() - org.telegram.messenger.g0.L(50.0f);
        if (maxNameWidth < 0) {
            maxNameWidth = org.telegram.messenger.g0.L(10.0f);
        }
        String format = hd.E0().p0().format(gjVar.k.date * 1000);
        TLRPC.MessageAction messageAction = gjVar.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
            TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
            z13 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
            z12 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy;
            f10 = 31.0f;
            z11 = tL_messageActionPhoneCall.video;
            i7 = tL_messageActionPhoneCall.duration;
            f11 = 50.0f;
        } else {
            f10 = 31.0f;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                z13 = tL_messageActionConferenceCall.missed;
                z12 = !tL_messageActionConferenceCall.active;
                boolean z14 = tL_messageActionConferenceCall.video;
                f11 = 50.0f;
                int i12 = tL_messageActionConferenceCall.duration;
                arrayList = tL_messageActionConferenceCall.other_participants;
                z11 = z14;
                i7 = i12;
                String N0 = !(messageAction instanceof TLRPC.TL_messageActionConferenceCall) ? gjVar.P3() ? hd.N0(2131751814, null) : z13 ? hd.N0(2131751818, null) : hd.N0(2131751819, null) : gjVar.P3() ? z13 ? z11 ? hd.N0(2131752596, null) : hd.N0(2131752603, null) : z11 ? hd.N0(2131752597, null) : hd.N0(2131752604, null) : z13 ? z11 ? hd.N0(2131752598, null) : hd.N0(2131752605, null) : z12 ? z11 ? hd.N0(2131752599, null) : hd.N0(2131752606, null) : z11 ? hd.N0(2131752601, null) : hd.N0(2131752608, null);
                if (i7 > 0) {
                    StringBuilder n10 = p5.c.n(format, ", ");
                    n10.append(hd.o(i7));
                    format = n10.toString();
                }
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(N0, org.telegram.ui.ActionBar.m6.O2, maxNameWidth, truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.m6.O2;
                int L = org.telegram.messenger.g0.L(2.0f) + maxNameWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                r1Var.o2 = new StaticLayout(ellipsize, textPaint, L, alignment, 1.0f, 0.0f, false);
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(format, org.telegram.ui.ActionBar.m6.S2, maxNameWidth - org.telegram.messenger.g0.L(19.0f), truncateAt), org.telegram.ui.ActionBar.m6.S2, org.telegram.messenger.g0.L(2.0f) + maxNameWidth, alignment, 1.0f, 0.0f, false);
                r1Var.e3 = staticLayout;
                r1Var.f3 = (int) staticLayout.getLineWidth(0);
                if (arrayList != null || arrayList.size() <= 0) {
                    this.c = null;
                } else {
                    if (this.b == null) {
                        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(r1Var, false);
                        this.b = d9Var;
                        d9Var.s = org.telegram.messenger.g0.L(14.0f);
                        this.b.h(org.telegram.messenger.g0.L(18.0f));
                        this.b.p = org.telegram.messenger.g0.L(f11);
                        this.b.o = org.telegram.messenger.g0.L(16.0f);
                        if (r1Var.O0) {
                            this.b.e();
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(Long.valueOf(gj.B0(r1Var.Q5.k)));
                    if (r1Var.Q5.P3()) {
                        hashSet.add(Long.valueOf(k10.i(i10).e()));
                    }
                    for (int i13 = 0; i13 < Math.min(3, arrayList.size()); i13++) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.n5.o(arrayList.get(i13))));
                    }
                    int min = Math.min(3, hashSet.size());
                    this.b.i(min);
                    Iterator it = hashSet.iterator();
                    int i14 = 0;
                    while (it.hasNext()) {
                        this.b.j(i14, i10, np.u1(i10).g2(((Long) it.next()).longValue()));
                        i14++;
                        if (i14 >= min) {
                            break;
                        }
                    }
                    this.b.a(false, true);
                    this.c = new xy0(hd.H(',', "ConferenceCallOther", hashSet.size()), 13.0f, null);
                }
                float f13 = r1Var.f3;
                xy0 xy0Var = this.c;
                f12 = f13 + (xy0Var != null ? 0.0f : xy0Var.c);
                if (f12 > maxNameWidth - org.telegram.messenger.g0.L(49.0f)) {
                    int L2 = r1Var.b7 + ((int) (f12 - (maxNameWidth - org.telegram.messenger.g0.L(49.0f))));
                    r1Var.b7 = L2;
                    r1Var.V6 = L2 - org.telegram.messenger.g0.L(f10);
                }
                r1Var.setMessageObjectInternal(gjVar);
                int L3 = org.telegram.messenger.g0.L(65.0f);
                int i15 = r1Var.Ua;
                r1Var.v0 = L3 + i15;
                if (r1Var.J) {
                    r1Var.Ua = i15 - org.telegram.messenger.g0.L(1.0f);
                }
                q0Var.getClass();
                if (q0Var.p) {
                    q0Var.o(r1Var.b7 - org.telegram.messenger.g0.L(32.0f), 3);
                    q0Var.n = q0Var.m;
                    if ((r1Var.b7 - org.telegram.messenger.g0.L(32.0f)) - q0Var.r < f12) {
                        q0Var.n = org.telegram.messenger.g0.L(12.0f) + q0Var.n;
                        q0Var.k += -org.telegram.messenger.g0.L(12.0f);
                    }
                    r1Var.v0 = org.telegram.messenger.g0.L(6.0f) + q0Var.n + r1Var.v0;
                    return;
                }
                return;
            }
            f11 = 50.0f;
            z11 = false;
            i7 = 0;
            z12 = false;
            z13 = false;
        }
        arrayList = null;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
        }
        if (i7 > 0) {
        }
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        CharSequence ellipsize2 = TextUtils.ellipsize(N0, org.telegram.ui.ActionBar.m6.O2, maxNameWidth, truncateAt2);
        TextPaint textPaint2 = org.telegram.ui.ActionBar.m6.O2;
        int L4 = org.telegram.messenger.g0.L(2.0f) + maxNameWidth;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        r1Var.o2 = new StaticLayout(ellipsize2, textPaint2, L4, alignment2, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(format, org.telegram.ui.ActionBar.m6.S2, maxNameWidth - org.telegram.messenger.g0.L(19.0f), truncateAt2), org.telegram.ui.ActionBar.m6.S2, org.telegram.messenger.g0.L(2.0f) + maxNameWidth, alignment2, 1.0f, 0.0f, false);
        r1Var.e3 = staticLayout2;
        r1Var.f3 = (int) staticLayout2.getLineWidth(0);
        if (arrayList != null) {
        }
        this.c = null;
        float f132 = r1Var.f3;
        xy0 xy0Var2 = this.c;
        f12 = f132 + (xy0Var2 != null ? 0.0f : xy0Var2.c);
        if (f12 > maxNameWidth - org.telegram.messenger.g0.L(49.0f)) {
        }
        r1Var.setMessageObjectInternal(gjVar);
        int L32 = org.telegram.messenger.g0.L(65.0f);
        int i152 = r1Var.Ua;
        r1Var.v0 = L32 + i152;
        if (r1Var.J) {
        }
        q0Var.getClass();
        if (q0Var.p) {
        }
    }
}
