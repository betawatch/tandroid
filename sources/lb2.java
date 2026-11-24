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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lb2 {
    public final gb2 a;
    public gc0 b;
    public tgb c;
    public int d;
    public Drawable e;

    public lb2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final void a(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        StaticLayout staticLayout;
        gb2 gb2Var = this.a;
        boolean I4 = gb2Var.Q5.I4();
        k27 k27Var = gb2Var.Q5;
        if (k27Var.k.action instanceof TLRPC.TL_messageActionConferenceCall) {
            drawable = k27Var.O3() ? bkb.N4 : bkb.O4;
            if (this.e == null) {
                this.e = gb2Var.getContext().getResources().getDrawable(gb2Var.Q5.I4() ? R.drawable.filled_video_group : R.drawable.filled_calls_users).mutate();
            }
            int v0 = bkb.v0(gb2Var.Q5.O3() ? bkb.Lb : bkb.td, gb2Var.cc);
            if (this.d != v0) {
                Drawable drawable3 = this.e;
                this.d = v0;
                drawable3.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
            drawable2 = this.e;
        } else if (k27Var.O3()) {
            drawable = bkb.N4;
            if (gb2Var.Q5.I4()) {
                gb2Var.A2();
                drawable2 = gb2Var.b2("drawableMsgOutCallVideo");
            } else {
                drawable2 = gb2Var.b2(gb2Var.A2() ? "drawableMsgOutCallAudioSelected" : "drawableMsgOutCallAudio");
            }
        } else {
            TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = gb2Var.Q5.k.action.reason;
            drawable = ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy)) ? bkb.O4 : bkb.P4;
            drawable2 = gb2Var.A2() ? bkb.G4[I4 ? 1 : 0] : bkb.F4[I4 ? 1 : 0];
        }
        Drawable drawable4 = drawable;
        Drawable drawable5 = drawable2;
        if (gb2Var.Q5.O3()) {
            bkb.N2.setColor(bkb.v0(bkb.Vc, gb2Var.cc));
            bkb.R2.setColor(bkb.v0(gb2Var.A2() ? bkb.dc : bkb.ic, gb2Var.cc));
        } else {
            bkb.N2.setColor(bkb.v0(bkb.Uc, gb2Var.cc));
            bkb.R2.setColor(bkb.v0(gb2Var.A2() ? bkb.ee : bkb.de, gb2Var.cc));
        }
        gb2Var.S9 = true;
        int L = gb2Var.Q5.O3() ? gl.L(16.0f) + (gb2Var.d7 - gb2Var.b7) : gb2Var.b3() ? gl.L(74.0f) : gl.L(25.0f);
        gb2Var.S3 = L;
        if (k96.a0) {
            L = de9.w(12.0f, drawable5.getIntrinsicWidth(), L);
        }
        int i = L;
        if (gb2Var.o2 != null) {
            canvas.save();
            canvas.translate(i, gl.L(12.0f) + gb2Var.gb);
            gb2Var.o2.draw(canvas);
            canvas.restore();
        }
        if (gb2Var.e3 != null) {
            canvas.save();
            canvas.translate(gl.L(k96.a0 ? -19.0f : 19.0f) + i, gl.L(37.0f) + gb2Var.gb);
            gb2Var.e3.draw(canvas);
            canvas.restore();
        }
        if (this.c != null && this.b != null) {
            canvas.save();
            canvas.translate(gl.L(6.0f) + gl.L(k96.a0 ? -19.0f : 19.0f) + i + gb2Var.f3, gl.L(36.0f) + gb2Var.gb);
            this.b.g(canvas);
            canvas.translate(this.b.A + gl.L(5.0f), gl.L(8.0f));
            this.c.c(0.0f, 0.0f, 1.0f, bkb.R2.getColor(), canvas);
            canvas.restore();
        }
        hf0.t((i + ((!k96.a0 || (staticLayout = gb2Var.e3) == null) ? 0 : staticLayout.getWidth() - drawable4.getIntrinsicWidth())) - gl.L(1.0f), gl.L(37.0f) + gb2Var.gb, drawable4);
        drawable4.draw(canvas);
        Drawable drawable6 = gb2Var.J2[0];
        if (drawable6 != null && gb2Var.L2[0] == 4) {
            drawable6.draw(canvas);
        }
        boolean z = gb2Var.G;
        boolean z2 = gb2Var.F;
        if (z) {
            if (z2) {
                gb2Var.T3 = gl.L(18.0f);
            } else {
                gb2Var.T3 = gl.L(19.0f);
            }
        } else if (z2) {
            gb2Var.T3 = gl.L(17.0f);
        } else {
            gb2Var.T3 = gl.L(18.5f);
        }
        hf0.t(gl.L(!I4 ? 1 : 0) + gb2Var.S3 + (k96.a0 ? 0 : gb2Var.b7 - gl.L(70.0f)), gb2Var.T3, drawable5);
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
    public final void b(k27 k27Var, boolean z) {
        int min;
        float f;
        float f2;
        boolean z2;
        int i;
        boolean z3;
        boolean z4;
        ArrayList<TLRPC.Peer> arrayList;
        tgb tgbVar;
        float f3;
        gb2 gb2Var = this.a;
        int i2 = gb2Var.a6;
        i19 i19Var = gb2Var.O;
        gb2Var.B0(0);
        gb2Var.v9 = false;
        gb2Var.E9 = false;
        gb2Var.O1 = false;
        int i3 = 52;
        if (gl.O1()) {
            int P0 = gl.P0();
            if (gb2Var.X6) {
                i3 = 71;
            } else if (!z) {
                i3 = 0;
            }
            min = Math.min(P0 - gl.L(i3 + 50), gl.L(270.0f));
            gb2Var.b7 = min;
        } else {
            int parentWidth = gb2Var.getParentWidth();
            if (gb2Var.X6) {
                i3 = 71;
            } else if (!z) {
                i3 = 0;
            }
            min = Math.min(parentWidth - gl.L(i3 + 50), gl.L(270.0f));
            gb2Var.b7 = min;
        }
        gb2Var.V6 = min - gl.L(31.0f);
        int maxNameWidth = gb2Var.getMaxNameWidth() - gl.L(50.0f);
        if (maxNameWidth < 0) {
            maxNameWidth = gl.L(10.0f);
        }
        String format = k96.D0().o0().format(k27Var.k.date * 1000);
        TLRPC.MessageAction messageAction = k27Var.k.action;
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
                String M0 = !(messageAction instanceof TLRPC.TL_messageActionConferenceCall) ? k27Var.O3() ? k96.M0(2131751814, null) : z4 ? k96.M0(2131751818, null) : k96.M0(2131751819, null) : k27Var.O3() ? z4 ? z2 ? k96.M0(2131752596, null) : k96.M0(2131752603, null) : z2 ? k96.M0(2131752597, null) : k96.M0(2131752604, null) : z4 ? z2 ? k96.M0(2131752598, null) : k96.M0(2131752605, null) : z3 ? z2 ? k96.M0(2131752599, null) : k96.M0(2131752606, null) : z2 ? k96.M0(2131752601, null) : k96.M0(2131752608, null);
                if (i > 0) {
                    format = format + ", " + k96.o(i);
                }
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                CharSequence ellipsize = TextUtils.ellipsize(M0, bkb.N2, maxNameWidth, truncateAt);
                TextPaint textPaint = bkb.N2;
                int L = gl.L(2.0f) + maxNameWidth;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                gb2Var.o2 = new StaticLayout(ellipsize, textPaint, L, alignment, 1.0f, 0.0f, false);
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(format, bkb.R2, maxNameWidth - gl.L(19.0f), truncateAt), bkb.R2, gl.L(2.0f) + maxNameWidth, alignment, 1.0f, 0.0f, false);
                gb2Var.e3 = staticLayout;
                gb2Var.f3 = (int) staticLayout.getLineWidth(0);
                if (arrayList != null || arrayList.size() <= 0) {
                    this.c = null;
                    tgbVar = null;
                } else {
                    if (this.b == null) {
                        gc0 gc0Var = new gc0(gb2Var, false);
                        this.b = gc0Var;
                        gc0Var.s = gl.L(14.0f);
                        this.b.h(gl.L(18.0f));
                        this.b.p = gl.L(f2);
                        this.b.o = gl.L(16.0f);
                        if (gb2Var.O0) {
                            this.b.e();
                        }
                    }
                    HashSet hashSet = new HashSet();
                    hashSet.add(Long.valueOf(k27.B0(gb2Var.Q5.k)));
                    if (gb2Var.Q5.O3()) {
                        hashSet.add(Long.valueOf(y6c.h(i2).e()));
                    }
                    for (int i5 = 0; i5 < Math.min(3, arrayList.size()); i5++) {
                        hashSet.add(Long.valueOf(cf3.n(arrayList.get(i5))));
                    }
                    int min2 = Math.min(3, hashSet.size());
                    this.b.i(min2);
                    Iterator it = hashSet.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        this.b.j(i6, i2, na7.q1(i2).Z1(((Long) it.next()).longValue()));
                        i6++;
                        if (i6 >= min2) {
                            break;
                        }
                    }
                    this.b.a(false, true);
                    tgb tgbVar2 = new tgb(k96.H(',', "ConferenceCallOther", hashSet.size()), 13.0f, null);
                    this.c = tgbVar2;
                    tgbVar = tgbVar2;
                }
                f3 = gb2Var.f3 + (tgbVar != null ? 0.0f : tgbVar.c);
                if (f3 > maxNameWidth - gl.L(49.0f)) {
                    int L2 = gb2Var.b7 + ((int) (f3 - (maxNameWidth - gl.L(49.0f))));
                    gb2Var.b7 = L2;
                    gb2Var.V6 = L2 - gl.L(f);
                }
                gb2Var.setMessageObjectInternal(k27Var);
                int L3 = gl.L(65.0f);
                int i7 = gb2Var.gb;
                gb2Var.v0 = L3 + i7;
                if (gb2Var.J) {
                    gb2Var.gb = i7 - gl.L(1.0f);
                }
                i19Var.getClass();
                if (i19Var.p) {
                    i19Var.o(gb2Var.b7 - gl.L(32.0f), 3);
                    i19Var.n = i19Var.m;
                    if ((gb2Var.b7 - gl.L(32.0f)) - i19Var.r < f3) {
                        i19Var.n = gl.L(12.0f) + i19Var.n;
                        i19Var.k += -gl.L(12.0f);
                    }
                    gb2Var.v0 = gl.L(6.0f) + i19Var.n + gb2Var.v0;
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
        CharSequence ellipsize2 = TextUtils.ellipsize(M0, bkb.N2, maxNameWidth, truncateAt2);
        TextPaint textPaint2 = bkb.N2;
        int L4 = gl.L(2.0f) + maxNameWidth;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        gb2Var.o2 = new StaticLayout(ellipsize2, textPaint2, L4, alignment2, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(format, bkb.R2, maxNameWidth - gl.L(19.0f), truncateAt2), bkb.R2, gl.L(2.0f) + maxNameWidth, alignment2, 1.0f, 0.0f, false);
        gb2Var.e3 = staticLayout2;
        gb2Var.f3 = (int) staticLayout2.getLineWidth(0);
        if (arrayList != null) {
        }
        this.c = null;
        tgbVar = null;
        f3 = gb2Var.f3 + (tgbVar != null ? 0.0f : tgbVar.c);
        if (f3 > maxNameWidth - gl.L(49.0f)) {
        }
        gb2Var.setMessageObjectInternal(k27Var);
        int L32 = gl.L(65.0f);
        int i72 = gb2Var.gb;
        gb2Var.v0 = L32 + i72;
        if (gb2Var.J) {
        }
        i19Var.getClass();
        if (i19Var.p) {
        }
    }
}
