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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v1 {
    public final q1 a;
    public org.telegram.ui.Components.w8 b;
    public ly0 c;
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
        boolean K4 = q1Var.P5.K4();
        zi ziVar = q1Var.P5;
        if (ziVar.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            drawable = ziVar.Q3() ? org.telegram.ui.ActionBar.k6.O4 : org.telegram.ui.ActionBar.k6.P4;
            if (this.e == null) {
                this.e = q1Var.getContext().getResources().getDrawable(q1Var.P5.K4() ? R.drawable.filled_video_group : R.drawable.filled_calls_users).mutate();
            }
            int w02 = org.telegram.ui.ActionBar.k6.w0(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.Jb : org.telegram.ui.ActionBar.k6.rd, q1Var.Pb);
            if (this.d != w02) {
                Drawable drawable3 = this.e;
                this.d = w02;
                drawable3.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (ziVar.Q3()) {
            drawable = org.telegram.ui.ActionBar.k6.O4;
            if (q1Var.P5.K4()) {
                q1Var.x2();
                drawable2 = q1Var.Y1("drawableMsgOutCallVideo");
            } else {
                drawable2 = q1Var.Y1(q1Var.x2() ? "drawableMsgOutCallAudioSelected" : "drawableMsgOutCallAudio");
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = q1Var.P5.k.action.reason;
            drawable = ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) ? org.telegram.ui.ActionBar.k6.P4 : org.telegram.ui.ActionBar.k6.Q4;
            drawable2 = q1Var.x2() ? org.telegram.ui.ActionBar.k6.H4[K4 ? 1 : 0] : org.telegram.ui.ActionBar.k6.G4[K4 ? 1 : 0];
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (q1Var.P5.Q3()) {
            org.telegram.ui.ActionBar.k6.O2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var.Pb));
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.bc : org.telegram.ui.ActionBar.k6.gc, q1Var.Pb));
        } else {
            org.telegram.ui.ActionBar.k6.O2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var.Pb));
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(q1Var.x2() ? org.telegram.ui.ActionBar.k6.ce : org.telegram.ui.ActionBar.k6.be, q1Var.Pb));
        }
        q1Var.F9 = true;
        int L = q1Var.P5.Q3() ? org.telegram.messenger.g0.L(16.0f) + (q1Var.c7 - q1Var.a7) : q1Var.X2() ? org.telegram.messenger.g0.L(74.0f) : org.telegram.messenger.g0.L(25.0f);
        q1Var.R3 = L;
        if (bd.a0) {
            L = org.telegram.messenger.k5.C(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i3 = L;
        if (q1Var.n2 != null) {
            canvas.save();
            canvas.translate(i3, org.telegram.messenger.g0.L(12.0f) + q1Var.Ta);
            q1Var.n2.draw(canvas);
            canvas.restore();
        }
        if (q1Var.d3 != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(bd.a0 ? -19.0f : 19.0f) + i3, org.telegram.messenger.g0.L(37.0f) + q1Var.Ta);
            q1Var.d3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(6.0f) + org.telegram.messenger.g0.L(bd.a0 ? -19.0f : 19.0f) + i3 + q1Var.e3, org.telegram.messenger.g0.L(36.0f) + q1Var.Ta);
            this.b.g(canvas);
            canvas.translate(this.b.A + org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, org.telegram.ui.ActionBar.k6.S2.getColor(), canvas);
            canvas.restore();
        }
        z.s((i3 + ((!bd.a0 || (staticLayout = q1Var.d3) == null) ? 0 : staticLayout.getWidth() - drawable4.getIntrinsicWidth())) - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(37.0f) + q1Var.Ta, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = q1Var.I2[0];
        if (drawable6 != null && q1Var.K2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z10 = q1Var.G;
        if (!z10 && !q1Var.F) {
            q1Var.S3 = org.telegram.messenger.g0.L(18.5f);
        } else if (z10 && q1Var.F) {
            q1Var.S3 = org.telegram.messenger.g0.L(18.0f);
        } else if (z10) {
            q1Var.S3 = org.telegram.messenger.g0.L(19.0f);
        } else {
            q1Var.S3 = org.telegram.messenger.g0.L(17.0f);
        }
        z.s(org.telegram.messenger.g0.L(!K4 ? 1 : 0) + q1Var.R3 + (bd.a0 ? 0 : q1Var.a7 - org.telegram.messenger.g0.L(70.0f)), q1Var.S3, drawable5);
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
    public final void b(zi ziVar, boolean z10) {
        float f10;
        float f11;
        boolean z11;
        int i3;
        boolean z12;
        boolean z13;
        ArrayList<TLRPC.Peer> arrayList;
        float f12;
        q1 q1Var = this.a;
        int i10 = q1Var.Z5;
        dh.o0 o0Var = q1Var.O;
        q1Var.A0(0);
        q1Var.i9 = false;
        q1Var.r9 = false;
        q1Var.N1 = false;
        int i11 = 52;
        if (org.telegram.messenger.g0.Q1()) {
            int Q0 = org.telegram.messenger.g0.Q0();
            if (q1Var.W6) {
                i11 = 71;
            } else if (!z10) {
                i11 = 0;
            }
            q1Var.a7 = Math.min(Q0 - org.telegram.messenger.g0.L(i11 + 50), org.telegram.messenger.g0.L(270.0f));
        } else {
            int parentWidth = q1Var.getParentWidth();
            if (q1Var.W6) {
                i11 = 71;
            } else if (!z10) {
                i11 = 0;
            }
            q1Var.a7 = Math.min(parentWidth - org.telegram.messenger.g0.L(i11 + 50), org.telegram.messenger.g0.L(270.0f));
        }
        q1Var.U6 = q1Var.a7 - org.telegram.messenger.g0.L(31.0f);
        int maxNameWidth = q1Var.getMaxNameWidth() - org.telegram.messenger.g0.L(50.0f);
        if (maxNameWidth < 0) {
            maxNameWidth = org.telegram.messenger.g0.L(10.0f);
        }
        String format = bd.E0().p0().format(ziVar.k.date * 1000);
        TLRPC.MessageAction messageAction = ziVar.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
            TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
            z13 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
            z12 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy;
            f10 = 31.0f;
            z11 = tL_messageActionPhoneCall.video;
            i3 = tL_messageActionPhoneCall.duration;
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
                i3 = i12;
                String M0 = !(messageAction instanceof TLRPC.TL_messageActionConferenceCall) ? ziVar.Q3() ? bd.M0(2131751826, null) : z13 ? bd.M0(2131751830, null) : bd.M0(2131751831, null) : ziVar.Q3() ? z13 ? z11 ? bd.M0(2131752608, null) : bd.M0(2131752615, null) : z11 ? bd.M0(2131752609, null) : bd.M0(2131752616, null) : z13 ? z11 ? bd.M0(2131752610, null) : bd.M0(2131752617, null) : z12 ? z11 ? bd.M0(2131752611, null) : bd.M0(2131752618, null) : z11 ? bd.M0(2131752613, null) : bd.M0(2131752620, null);
                if (i3 > 0) {
                    StringBuilder h = t4.c.h(format, ", ");
                    h.append(bd.o(i3));
                    format = h.toString();
                }
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(M0, org.telegram.ui.ActionBar.k6.O2, maxNameWidth, truncateAt);
                TextPaint textPaint = org.telegram.ui.ActionBar.k6.O2;
                int L = org.telegram.messenger.g0.L(2.0f) + maxNameWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                q1Var.n2 = new StaticLayout(ellipsize, textPaint, L, alignment, 1.0f, 0.0f, false);
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(format, org.telegram.ui.ActionBar.k6.S2, maxNameWidth - org.telegram.messenger.g0.L(19.0f), truncateAt), org.telegram.ui.ActionBar.k6.S2, org.telegram.messenger.g0.L(2.0f) + maxNameWidth, alignment, 1.0f, 0.0f, false);
                q1Var.d3 = staticLayout;
                q1Var.e3 = (int) staticLayout.getLineWidth(0);
                if (arrayList != null || arrayList.size() <= 0) {
                    this.c = null;
                } else {
                    if (this.b == null) {
                        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(q1Var, false);
                        this.b = w8Var;
                        w8Var.s = org.telegram.messenger.g0.L(14.0f);
                        this.b.h(org.telegram.messenger.g0.L(18.0f));
                        this.b.p = org.telegram.messenger.g0.L(f11);
                        this.b.o = org.telegram.messenger.g0.L(16.0f);
                        if (q1Var.O0) {
                            this.b.e();
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(Long.valueOf(zi.B0(q1Var.P5.k)));
                    if (q1Var.P5.Q3()) {
                        hashSet.add(Long.valueOf(h10.i(i10).e()));
                    }
                    for (int i13 = 0; i13 < Math.min(3, arrayList.size()); i13++) {
                        hashSet.add(Long.valueOf(org.telegram.messenger.m5.o(arrayList.get(i13))));
                    }
                    int min = Math.min(3, hashSet.size());
                    this.b.i(min);
                    Iterator it = hashSet.iterator();
                    int i14 = 0;
                    while (it.hasNext()) {
                        this.b.j(i14, i10, hp.s1(i10).e2(((Long) it.next()).longValue()));
                        i14++;
                        if (i14 >= min) {
                            break;
                        }
                    }
                    this.b.a(false, true);
                    this.c = new ly0(bd.H(',', "ConferenceCallOther", hashSet.size()), 13.0f, null);
                }
                float f13 = q1Var.e3;
                ly0 ly0Var = this.c;
                f12 = f13 + (ly0Var != null ? 0.0f : ly0Var.c);
                if (f12 > maxNameWidth - org.telegram.messenger.g0.L(49.0f)) {
                    int L2 = q1Var.a7 + ((int) (f12 - (maxNameWidth - org.telegram.messenger.g0.L(49.0f))));
                    q1Var.a7 = L2;
                    q1Var.U6 = L2 - org.telegram.messenger.g0.L(f10);
                }
                q1Var.setMessageObjectInternal(ziVar);
                int L3 = org.telegram.messenger.g0.L(65.0f);
                int i15 = q1Var.Ta;
                q1Var.v0 = L3 + i15;
                if (q1Var.J) {
                    q1Var.Ta = i15 - org.telegram.messenger.g0.L(1.0f);
                }
                o0Var.getClass();
                if (o0Var.p) {
                    o0Var.o(q1Var.a7 - org.telegram.messenger.g0.L(32.0f), 3);
                    o0Var.n = o0Var.m;
                    if ((q1Var.a7 - org.telegram.messenger.g0.L(32.0f)) - o0Var.r < f12) {
                        o0Var.n = org.telegram.messenger.g0.L(12.0f) + o0Var.n;
                        o0Var.k += -org.telegram.messenger.g0.L(12.0f);
                    }
                    q1Var.v0 = org.telegram.messenger.g0.L(6.0f) + o0Var.n + q1Var.v0;
                    return;
                }
                return;
            }
            f11 = 50.0f;
            z11 = false;
            i3 = 0;
            z12 = false;
            z13 = false;
        }
        arrayList = null;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
        }
        if (i3 > 0) {
        }
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        CharSequence ellipsize2 = TextUtils.ellipsize(M0, org.telegram.ui.ActionBar.k6.O2, maxNameWidth, truncateAt2);
        TextPaint textPaint2 = org.telegram.ui.ActionBar.k6.O2;
        int L4 = org.telegram.messenger.g0.L(2.0f) + maxNameWidth;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        q1Var.n2 = new StaticLayout(ellipsize2, textPaint2, L4, alignment2, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(format, org.telegram.ui.ActionBar.k6.S2, maxNameWidth - org.telegram.messenger.g0.L(19.0f), truncateAt2), org.telegram.ui.ActionBar.k6.S2, org.telegram.messenger.g0.L(2.0f) + maxNameWidth, alignment2, 1.0f, 0.0f, false);
        q1Var.d3 = staticLayout2;
        q1Var.e3 = (int) staticLayout2.getLineWidth(0);
        if (arrayList != null) {
        }
        this.c = null;
        float f132 = q1Var.e3;
        ly0 ly0Var2 = this.c;
        f12 = f132 + (ly0Var2 != null ? 0.0f : ly0Var2.c);
        if (f12 > maxNameWidth - org.telegram.messenger.g0.L(49.0f)) {
        }
        q1Var.setMessageObjectInternal(ziVar);
        int L32 = org.telegram.messenger.g0.L(65.0f);
        int i152 = q1Var.Ta;
        q1Var.v0 = L32 + i152;
        if (q1Var.J) {
        }
        o0Var.getClass();
        if (o0Var.p) {
        }
    }
}
