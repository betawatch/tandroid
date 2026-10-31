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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v1 {
    public final q1 a;
    public org.telegram.ui.Components.t8 b;
    public qz0 c;
    public int d;
    public Drawable e;

    public v1(q1 q1Var) {
        this.a = q1Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout;
        q1 q1Var = this.a;
        boolean J4 = q1Var.O5.J4();
        jj jjVar = q1Var.O5;
        if (jjVar.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            drawable = jjVar.P3() ? org.telegram.ui.ActionBar.t6.O4 : org.telegram.ui.ActionBar.t6.P4;
            if (this.e == null) {
                this.e = q1Var.getContext().getResources().getDrawable(q1Var.O5.J4() ? R.drawable.filled_video_group : R.drawable.filled_calls_users).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.t6.w0(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.Jb : org.telegram.ui.ActionBar.t6.rd, q1Var.Ob);
            if (this.d != w02) {
                Drawable drawable3 = this.e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (jjVar.P3()) {
            drawable = org.telegram.ui.ActionBar.t6.O4;
            if (q1Var.O5.J4()) {
                q1Var.v2();
                drawable2 = q1Var.W1("drawableMsgOutCallVideo");
            } else {
                drawable2 = q1Var.W1(q1Var.v2() ? "drawableMsgOutCallAudioSelected" : "drawableMsgOutCallAudio");
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = q1Var.O5.k.action.reason;
            drawable = ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) ? org.telegram.ui.ActionBar.t6.P4 : org.telegram.ui.ActionBar.t6.Q4;
            drawable2 = q1Var.v2() ? org.telegram.ui.ActionBar.t6.H4[J4 ? 1 : 0] : org.telegram.ui.ActionBar.t6.G4[J4 ? 1 : 0];
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (q1Var.O5.P3()) {
            org.telegram.ui.ActionBar.t6.O2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Tc, q1Var.Ob));
            org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.bc : org.telegram.ui.ActionBar.t6.gc, q1Var.Ob));
        } else {
            org.telegram.ui.ActionBar.t6.O2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, q1Var.Ob));
            org.telegram.ui.ActionBar.t6.S2.setColor(org.telegram.ui.ActionBar.t6.w0(q1Var.v2() ? org.telegram.ui.ActionBar.t6.ce : org.telegram.ui.ActionBar.t6.be, q1Var.Ob));
        }
        q1Var.E9 = true;
        int L = q1Var.O5.P3() ? org.telegram.messenger.i0.L(16.0f) + (q1Var.b7 - q1Var.Z6) : q1Var.V2() ? org.telegram.messenger.i0.L(74.0f) : org.telegram.messenger.i0.L(25.0f);
        q1Var.Q3 = L;
        if (cd.X) {
            L = org.telegram.messenger.m5.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i10 = L;
        if (q1Var.m2 != null) {
            canvas.save();
            canvas.translate(i10, org.telegram.messenger.i0.L(12.0f) + q1Var.Sa);
            q1Var.m2.draw(canvas);
            canvas.restore();
        }
        if (q1Var.c3 != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(cd.X ? -19.0f : 19.0f) + i10, org.telegram.messenger.i0.L(37.0f) + q1Var.Sa);
            q1Var.c3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.L(cd.X ? -19.0f : 19.0f) + i10 + q1Var.d3, org.telegram.messenger.i0.L(36.0f) + q1Var.Sa);
            this.b.g(canvas);
            canvas.translate(this.b.A + org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.t6.S2.getColor(), canvas);
            canvas.restore();
        }
        z.t((i10 + ((!cd.X || (staticLayout = q1Var.c3) == null) ? 0 : staticLayout.getWidth() - drawable4.getIntrinsicWidth())) - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(37.0f) + q1Var.Sa, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = q1Var.H2[0];
        if (drawable6 != null && q1Var.J2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z10 = q1Var.F;
        if (!z10 && !q1Var.E) {
            q1Var.R3 = org.telegram.messenger.i0.L(18.5f);
        } else if (z10 && q1Var.E) {
            q1Var.R3 = org.telegram.messenger.i0.L(18.0f);
        } else if (z10) {
            q1Var.R3 = org.telegram.messenger.i0.L(19.0f);
        } else {
            q1Var.R3 = org.telegram.messenger.i0.L(17.0f);
        }
        z.t(org.telegram.messenger.i0.L(!J4 ? 1 : 0) + q1Var.Q3 + (cd.X ? 0 : q1Var.Z6 - org.telegram.messenger.i0.L(70.0f)), q1Var.R3, drawable5);
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
    public final void b(jj jjVar, boolean z10) {
        float f7;
        float f10;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        ArrayList<TLRPC.Peer> arrayList;
        float f11;
        q1 q1Var = this.a;
        int i11 = q1Var.Y5;
        sg.p0 p0Var = q1Var.N;
        q1Var.z0(0);
        q1Var.h9 = false;
        q1Var.q9 = false;
        q1Var.M1 = false;
        int i12 = 52;
        if (org.telegram.messenger.i0.Q1()) {
            int Q0 = org.telegram.messenger.i0.Q0();
            if (q1Var.V6) {
                i12 = 71;
            } else if (!z10) {
                i12 = 0;
            }
            q1Var.Z6 = Math.min(Q0 - org.telegram.messenger.i0.L(i12 + 50), org.telegram.messenger.i0.L(270.0f));
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.V6) {
                i12 = 71;
            } else if (!z10) {
                i12 = 0;
            }
            q1Var.Z6 = Math.min(parentWidth - org.telegram.messenger.i0.L(i12 + 50), org.telegram.messenger.i0.L(270.0f));
        }
        q1Var.T6 = q1Var.Z6 - org.telegram.messenger.i0.L(31.0f);
        int maxNameWidth = q1Var.getMaxNameWidth() - org.telegram.messenger.i0.L(50.0f);
        if (maxNameWidth < 0) {
            maxNameWidth = org.telegram.messenger.i0.L(10.0f);
        }
        String format = cd.D0().o0().format(jjVar.k.date * 1000);
        TLRPC.MessageAction messageAction = jjVar.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
            TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
            z13 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
            z12 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy;
            f7 = 31.0f;
            z11 = tL_messageActionPhoneCall.video;
            i10 = tL_messageActionPhoneCall.duration;
            f10 = 50.0f;
        } else {
            f7 = 31.0f;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                z13 = tL_messageActionConferenceCall.missed;
                z12 = !tL_messageActionConferenceCall.active;
                boolean z14 = tL_messageActionConferenceCall.video;
                f10 = 50.0f;
                int i13 = tL_messageActionConferenceCall.duration;
                arrayList = tL_messageActionConferenceCall.other_participants;
                z11 = z14;
                i10 = i13;
                String L0 = !(messageAction instanceof TLRPC.TL_messageActionConferenceCall) ? jjVar.P3() ? cd.L0(2131751826, null) : z13 ? cd.L0(2131751830, null) : cd.L0(2131751831, null) : jjVar.P3() ? z13 ? z11 ? cd.L0(2131752608, null) : cd.L0(2131752615, null) : z11 ? cd.L0(2131752609, null) : cd.L0(2131752616, null) : z13 ? z11 ? cd.L0(2131752610, null) : cd.L0(2131752617, null) : z12 ? z11 ? cd.L0(2131752611, null) : cd.L0(2131752618, null) : z11 ? cd.L0(2131752613, null) : cd.L0(2131752620, null);
                if (i10 > 0) {
                    StringBuilder i14 = sc.e.i(format, ", ");
                    i14.append(cd.o(i10));
                    format = i14.toString();
                }
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(L0, org.telegram.ui.ActionBar.t6.O2, maxNameWidth, truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.t6.O2;
                int L = org.telegram.messenger.i0.L(2.0f) + maxNameWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                q1Var.m2 = new StaticLayout(ellipsize, textPaint, L, alignment, 1.0f, 0.0f, false);
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(format, org.telegram.ui.ActionBar.t6.S2, maxNameWidth - org.telegram.messenger.i0.L(19.0f), truncateAt), org.telegram.ui.ActionBar.t6.S2, org.telegram.messenger.i0.L(2.0f) + maxNameWidth, alignment, 1.0f, 0.0f, false);
                q1Var.c3 = staticLayout;
                q1Var.d3 = (int) staticLayout.getLineWidth(0);
                if (arrayList != null || arrayList.size() <= 0) {
                    this.c = null;
                } else {
                    if (this.b == null) {
                        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8(q1Var, false);
                        this.b = t8Var;
                        t8Var.s = org.telegram.messenger.i0.L(14.0f);
                        this.b.h(org.telegram.messenger.i0.L(18.0f));
                        this.b.p = org.telegram.messenger.i0.L(f10);
                        this.b.o = org.telegram.messenger.i0.L(16.0f);
                        if (q1Var.N0) {
                            this.b.e();
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(Long.valueOf(jj.B0(q1Var.O5.k)));
                    if (q1Var.O5.P3()) {
                        hashSet.add(Long.valueOf(d20.i(i11).e()));
                    }
                    for (int i15 = 0; i15 < Math.min(3, arrayList.size()); i15++) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.o5.o(arrayList.get(i15))));
                    }
                    int min = Math.min(3, hashSet.size());
                    this.b.i(min);
                    Iterator it = hashSet.iterator();
                    int i16 = 0;
                    while (it.hasNext()) {
                        this.b.j(i16, i11, vp.r1(i11).d2(((Long) it.next()).longValue()));
                        i16++;
                        if (i16 >= min) {
                            break;
                        }
                    }
                    this.b.a(false, true);
                    this.c = new qz0(cd.H(',', "ConferenceCallOther", hashSet.size()), 13.0f, null);
                }
                float f12 = q1Var.d3;
                qz0 qz0Var = this.c;
                f11 = f12 + (qz0Var != null ? 0.0f : qz0Var.c);
                if (f11 > maxNameWidth - org.telegram.messenger.i0.L(49.0f)) {
                    int L2 = q1Var.Z6 + ((int) (f11 - (maxNameWidth - org.telegram.messenger.i0.L(49.0f))));
                    q1Var.Z6 = L2;
                    q1Var.T6 = L2 - org.telegram.messenger.i0.L(f7);
                }
                q1Var.setMessageObjectInternal(jjVar);
                int L3 = org.telegram.messenger.i0.L(65.0f);
                int i17 = q1Var.Sa;
                q1Var.u0 = L3 + i17;
                if (q1Var.I) {
                    q1Var.Sa = i17 - org.telegram.messenger.i0.L(1.0f);
                }
                p0Var.getClass();
                if (p0Var.p) {
                    p0Var.o(q1Var.Z6 - org.telegram.messenger.i0.L(32.0f), 3);
                    p0Var.n = p0Var.m;
                    if ((q1Var.Z6 - org.telegram.messenger.i0.L(32.0f)) - p0Var.r < f11) {
                        p0Var.n = org.telegram.messenger.i0.L(12.0f) + p0Var.n;
                        p0Var.k += -org.telegram.messenger.i0.L(12.0f);
                    }
                    q1Var.u0 = org.telegram.messenger.i0.L(6.0f) + p0Var.n + q1Var.u0;
                    return;
                }
                return;
            }
            f10 = 50.0f;
            z11 = false;
            i10 = 0;
            z12 = false;
            z13 = false;
        }
        arrayList = null;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
        }
        if (i10 > 0) {
        }
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        CharSequence ellipsize2 = TextUtils.ellipsize(L0, org.telegram.ui.ActionBar.t6.O2, maxNameWidth, truncateAt2);
        TextPaint textPaint2 = org.telegram.ui.ActionBar.t6.O2;
        int L4 = org.telegram.messenger.i0.L(2.0f) + maxNameWidth;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        q1Var.m2 = new StaticLayout(ellipsize2, textPaint2, L4, alignment2, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(format, org.telegram.ui.ActionBar.t6.S2, maxNameWidth - org.telegram.messenger.i0.L(19.0f), truncateAt2), org.telegram.ui.ActionBar.t6.S2, org.telegram.messenger.i0.L(2.0f) + maxNameWidth, alignment2, 1.0f, 0.0f, false);
        q1Var.c3 = staticLayout2;
        q1Var.d3 = (int) staticLayout2.getLineWidth(0);
        if (arrayList != null) {
        }
        this.c = null;
        float f122 = q1Var.d3;
        qz0 qz0Var2 = this.c;
        f11 = f122 + (qz0Var2 != null ? 0.0f : qz0Var2.c);
        if (f11 > maxNameWidth - org.telegram.messenger.i0.L(49.0f)) {
        }
        q1Var.setMessageObjectInternal(jjVar);
        int L32 = org.telegram.messenger.i0.L(65.0f);
        int i172 = q1Var.Sa;
        q1Var.u0 = L32 + i172;
        if (q1Var.I) {
        }
        p0Var.getClass();
        if (p0Var.p) {
        }
    }
}
