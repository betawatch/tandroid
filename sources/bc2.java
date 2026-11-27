// default package

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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bc2 {
    public final wb2 a;
    public ic0 b;
    public pkb c;
    public int d;
    public Drawable e;

    public bc2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout;
        wb2 wb2Var = this.a;
        boolean I4 = wb2Var.Q5.I4();
        r47 r47Var = wb2Var.Q5;
        if (r47Var.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            drawable = r47Var.O3() ? aob.O4 : aob.P4;
            if (this.e == null) {
                this.e = wb2Var.getContext().getResources().getDrawable(wb2Var.Q5.I4() ? R.drawable.filled_video_group : R.drawable.filled_calls_users).mutate();
            }
            int v0 = aob.v0(wb2Var.Q5.O3() ? aob.Mb : aob.ud, wb2Var.cc);
            if (this.d != v0) {
                Drawable drawable3 = this.e;
                this.d = v0;
                drawable3.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (r47Var.O3()) {
            drawable = aob.O4;
            if (wb2Var.Q5.I4()) {
                wb2Var.A2();
                drawable2 = wb2Var.b2("drawableMsgOutCallVideo");
            } else {
                drawable2 = wb2Var.b2(wb2Var.A2() ? "drawableMsgOutCallAudioSelected" : "drawableMsgOutCallAudio");
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = wb2Var.Q5.k.action.reason;
            drawable = ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) ? aob.P4 : aob.Q4;
            drawable2 = wb2Var.A2() ? aob.H4[I4 ? 1 : 0] : aob.G4[I4 ? 1 : 0];
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (wb2Var.Q5.O3()) {
            aob.O2.setColor(aob.v0(aob.Wc, wb2Var.cc));
            aob.S2.setColor(aob.v0(wb2Var.A2() ? aob.ec : aob.jc, wb2Var.cc));
        } else {
            aob.O2.setColor(aob.v0(aob.Vc, wb2Var.cc));
            aob.S2.setColor(aob.v0(wb2Var.A2() ? aob.fe : aob.ee, wb2Var.cc));
        }
        wb2Var.S9 = true;
        int L = wb2Var.Q5.O3() ? hl.L(16.0f) + (wb2Var.d7 - wb2Var.b7) : wb2Var.b3() ? hl.L(74.0f) : hl.L(25.0f);
        wb2Var.S3 = L;
        if (ob6.a0) {
            L = uh9.w(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i = L;
        if (wb2Var.o2 != null) {
            canvas.save();
            canvas.translate(i, hl.L(12.0f) + wb2Var.gb);
            wb2Var.o2.draw(canvas);
            canvas.restore();
        }
        if (wb2Var.e3 != null) {
            canvas.save();
            canvas.translate(hl.L(ob6.a0 ? -19.0f : 19.0f) + i, hl.L(37.0f) + wb2Var.gb);
            wb2Var.e3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            canvas.translate(hl.L(6.0f) + hl.L(ob6.a0 ? -19.0f : 19.0f) + i + wb2Var.f3, hl.L(36.0f) + wb2Var.gb);
            this.b.g(canvas);
            canvas.translate(this.b.A + hl.L(5.0f), hl.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, aob.S2.getColor(), canvas);
            canvas.restore();
        }
        jf0.u((i + ((!ob6.a0 || (staticLayout = wb2Var.e3) == null) ? 0 : staticLayout.getWidth() - drawable4.getIntrinsicWidth())) - hl.L(1.0f), hl.L(37.0f) + wb2Var.gb, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = wb2Var.J2[0];
        if (drawable6 != null && wb2Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z = wb2Var.G;
        boolean z2 = wb2Var.F;
        if (z) {
            if (z2) {
                wb2Var.T3 = hl.L(18.0f);
            } else {
                wb2Var.T3 = hl.L(19.0f);
            }
        } else if (z2) {
            wb2Var.T3 = hl.L(17.0f);
        } else {
            wb2Var.T3 = hl.L(18.5f);
        }
        jf0.u(hl.L(!I4 ? 1 : 0) + wb2Var.S3 + (ob6.a0 ? 0 : wb2Var.b7 - hl.L(70.0f)), wb2Var.T3, drawable5);
        drawable5.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(r47 r47Var, boolean z) {
        int min;
        float f;
        float f2;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        ArrayList<TLRPC.Peer> arrayList;
        pkb pkbVar;
        float f3;
        wb2 wb2Var = this.a;
        int i2 = wb2Var.a6;
        x49 x49Var = wb2Var.O;
        wb2Var.B0(0);
        wb2Var.v9 = false;
        wb2Var.E9 = false;
        wb2Var.O1 = false;
        int i3 = 52;
        if (hl.O1()) {
            int P0 = hl.P0();
            if (wb2Var.X6) {
                i3 = 71;
            } else if (!z) {
                i3 = 0;
            }
            min = Math.min(P0 - hl.L(i3 + 50), hl.L(270.0f));
            wb2Var.b7 = min;
        } else {
            int parentWidth = wb2Var.getParentWidth();
            if (wb2Var.X6) {
                i3 = 71;
            } else if (!z) {
                i3 = 0;
            }
            min = Math.min(parentWidth - hl.L(i3 + 50), hl.L(270.0f));
            wb2Var.b7 = min;
        }
        wb2Var.V6 = min - hl.L(31.0f);
        int maxNameWidth = wb2Var.getMaxNameWidth() - hl.L(50.0f);
        if (maxNameWidth < 0) {
            maxNameWidth = hl.L(10.0f);
        }
        String format = ob6.D0().o0().format(r47Var.k.date * 1000);
        TLRPC.MessageAction messageAction = r47Var.k.action;
        if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
            TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction;
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
            z4 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
            z3 = phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy;
            f = 31.0f;
            z2 = tL_messageActionPhoneCall.video;
            i = tL_messageActionPhoneCall.duration;
            f2 = 50.0f;
        } else {
            f = 31.0f;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                z4 = tL_messageActionConferenceCall.missed;
                z3 = !tL_messageActionConferenceCall.active;
                boolean z5 = tL_messageActionConferenceCall.video;
                f2 = 50.0f;
                int i4 = tL_messageActionConferenceCall.duration;
                arrayList = tL_messageActionConferenceCall.other_participants;
                z2 = z5;
                i = i4;
                String M0 = !(messageAction instanceof TLRPC.TL_messageActionConferenceCall) ? r47Var.O3() ? ob6.M0(2131751791, null) : z4 ? ob6.M0(2131751795, null) : ob6.M0(2131751796, null) : r47Var.O3() ? z4 ? z2 ? ob6.M0(2131752589, null) : ob6.M0(2131752596, null) : z2 ? ob6.M0(2131752590, null) : ob6.M0(2131752597, null) : z4 ? z2 ? ob6.M0(2131752591, null) : ob6.M0(2131752598, null) : z3 ? z2 ? ob6.M0(2131752592, null) : ob6.M0(2131752599, null) : z2 ? ob6.M0(2131752594, null) : ob6.M0(2131752601, null);
                if (i > 0) {
                    format = format + ", " + ob6.o(i);
                }
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(M0, aob.O2, maxNameWidth, truncateAt);
                TextPaint textPaint = aob.O2;
                int L = hl.L(2.0f) + maxNameWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                wb2Var.o2 = new StaticLayout(ellipsize, textPaint, L, alignment, 1.0f, 0.0f, false);
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(format, aob.S2, maxNameWidth - hl.L(19.0f), truncateAt), aob.S2, hl.L(2.0f) + maxNameWidth, alignment, 1.0f, 0.0f, false);
                wb2Var.e3 = staticLayout;
                wb2Var.f3 = (int) staticLayout.getLineWidth(0);
                if (arrayList != null || arrayList.size() <= 0) {
                    this.c = null;
                    pkbVar = null;
                } else {
                    if (this.b == null) {
                        ic0 ic0Var = new ic0(wb2Var, false);
                        this.b = ic0Var;
                        ic0Var.s = hl.L(14.0f);
                        this.b.h(hl.L(18.0f));
                        this.b.p = hl.L(f2);
                        this.b.o = hl.L(16.0f);
                        if (wb2Var.O0) {
                            this.b.e();
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(Long.valueOf(r47.B0(wb2Var.Q5.k)));
                    if (wb2Var.Q5.O3()) {
                        hashSet.add(Long.valueOf(yac.h(i2).e()));
                    }
                    for (int i5 = 0; i5 < Math.min(3, arrayList.size()); i5++) {
                        hashSet.add(Long.valueOf(wf3.n(arrayList.get(i5))));
                    }
                    int min2 = Math.min(3, hashSet.size());
                    this.b.i(min2);
                    Iterator it = hashSet.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        this.b.j(i6, i2, uc7.s1(i2).b2(((Long) it.next()).longValue()));
                        i6++;
                        if (i6 >= min2) {
                            break;
                        }
                    }
                    this.b.a(false, true);
                    pkb pkbVar2 = new pkb(ob6.H(',', "ConferenceCallOther", hashSet.size()), 13.0f, null);
                    this.c = pkbVar2;
                    pkbVar = pkbVar2;
                }
                f3 = wb2Var.f3 + (pkbVar != null ? 0.0f : pkbVar.c);
                if (f3 > maxNameWidth - hl.L(49.0f)) {
                    int L2 = wb2Var.b7 + ((int) (f3 - (maxNameWidth - hl.L(49.0f))));
                    wb2Var.b7 = L2;
                    wb2Var.V6 = L2 - hl.L(f);
                }
                wb2Var.setMessageObjectInternal(r47Var);
                int L3 = hl.L(65.0f);
                int i7 = wb2Var.gb;
                wb2Var.v0 = L3 + i7;
                if (wb2Var.J) {
                    wb2Var.gb = i7 - hl.L(1.0f);
                }
                x49Var.getClass();
                if (x49Var.p) {
                    x49Var.o(wb2Var.b7 - hl.L(32.0f), 3);
                    x49Var.n = x49Var.m;
                    if ((wb2Var.b7 - hl.L(32.0f)) - x49Var.r < f3) {
                        x49Var.n = hl.L(12.0f) + x49Var.n;
                        x49Var.k += -hl.L(12.0f);
                    }
                    wb2Var.v0 = hl.L(6.0f) + x49Var.n + wb2Var.v0;
                    return;
                }
                return;
            }
            f2 = 50.0f;
            z2 = false;
            i = 0;
            z3 = false;
            z4 = false;
        }
        arrayList = null;
        if (!(messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
        }
        if (i > 0) {
        }
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        CharSequence ellipsize2 = TextUtils.ellipsize(M0, aob.O2, maxNameWidth, truncateAt2);
        TextPaint textPaint2 = aob.O2;
        int L4 = hl.L(2.0f) + maxNameWidth;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        wb2Var.o2 = new StaticLayout(ellipsize2, textPaint2, L4, alignment2, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(format, aob.S2, maxNameWidth - hl.L(19.0f), truncateAt2), aob.S2, hl.L(2.0f) + maxNameWidth, alignment2, 1.0f, 0.0f, false);
        wb2Var.e3 = staticLayout2;
        wb2Var.f3 = (int) staticLayout2.getLineWidth(0);
        if (arrayList != null) {
        }
        this.c = null;
        pkbVar = null;
        f3 = wb2Var.f3 + (pkbVar != null ? 0.0f : pkbVar.c);
        if (f3 > maxNameWidth - hl.L(49.0f)) {
        }
        wb2Var.setMessageObjectInternal(r47Var);
        int L32 = hl.L(65.0f);
        int i72 = wb2Var.gb;
        wb2Var.v0 = L32 + i72;
        if (wb2Var.J) {
        }
        x49Var.getClass();
        if (x49Var.p) {
        }
    }
}
