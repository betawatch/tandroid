// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mb2 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public byte G = -1;
    public float H;
    public jc0 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final gb2 a;
    public boolean b;
    public StaticLayout c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public int i;
    public hx2 j;
    public me8 k;
    public id8 l;
    public yd8 m;
    public yd8 n;
    public int o;
    public int p;
    public int q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public long y;
    public String z;

    public mb2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public static void g(int i, ArrayList arrayList, boolean z) {
        if (!z || i == 0 || arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new sa((byte) 24));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size && i > 0; i2++) {
            fb2 fb2Var = (fb2) arrayList.get(i2);
            int i3 = fb2Var.d;
            if (i3 > 0) {
                fb2Var.d = i3 + 1;
                i--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        if (r6.length == 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        boolean z;
        float f;
        boolean z2;
        CharacterStyle characterStyle;
        gm gmVar;
        boolean z3;
        boolean z4;
        CharacterStyle[] characterStyleArr;
        CharacterStyle[] characterStyleArr2;
        n79 n79Var;
        gb2 gb2Var = this.a;
        i46 i46Var = gb2Var.u4;
        nb2 nb2Var = gb2Var.ub;
        if ((this.d instanceof Spannable) && gb2Var.q3 != null && gb2Var.t4 == -1 && !gb2Var.rc) {
            boolean z5 = true;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && (gb2Var.v4 == 1 || gb2Var.s4 != null))) {
                int x = (int) motionEvent.getX();
                int P1 = (int) gb2Var.P1(motionEvent);
                float f2 = x;
                float f3 = gb2Var.u5;
                if (f2 >= f3) {
                    float f4 = P1;
                    float f5 = gb2Var.v5;
                    if (f4 >= f5) {
                        i27 i27Var = gb2Var.q3;
                        if (f2 <= f3 + i27Var.c && f4 <= f5 + i27Var.c(nb2Var)) {
                            int i = (int) (f4 - gb2Var.v5);
                            int i2 = 0;
                            for (int i3 = 0; i3 < gb2Var.q3.e.size() && ((h27) gb2Var.q3.e.get(i3)).p(gb2Var.q3.e, nb2Var) <= i; i3++) {
                                i2 = i3;
                            }
                            try {
                                h27 h27Var = (h27) gb2Var.q3.e.get(i2);
                                float f6 = gb2Var.u5;
                                if (h27Var.l()) {
                                    try {
                                        f = gb2Var.q3.d;
                                    } catch (Exception e) {
                                        e = e;
                                        z = true;
                                        fa4.g(e, z);
                                        return false;
                                    }
                                } else {
                                    f = 0.0f;
                                }
                                int i4 = (int) (f2 - (f6 - f));
                                int p = (int) (i - h27Var.p(gb2Var.q3.e, nb2Var));
                                int lineForVertical = h27Var.e.getLineForVertical(p);
                                int i5 = 0;
                                float f7 = i4;
                                int offsetForHorizontal = h27Var.n + h27Var.e.getOffsetForHorizontal(lineForVertical, f7);
                                float lineLeft = h27Var.e.getLineLeft(lineForVertical);
                                if (lineLeft <= f7 && lineLeft + h27Var.e.getLineWidth(lineForVertical) >= f7) {
                                    Spannable spannable = (Spannable) this.d;
                                    CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                    if (characterStyleArr3 == null || characterStyleArr3.length == 0) {
                                        characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, f4c.class);
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    boolean z6 = characterStyleArr3 != null ? z2 : false;
                                    characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, gm.class);
                                    if (characterStyleArr3.length != 0 && ((!(characterStyleArr3[0] instanceof d4c) || d4c.h) && !gl.A1())) {
                                        if (motionEvent.getAction() == 0) {
                                            CharacterStyle characterStyle2 = characterStyleArr3[0];
                                            if (characterStyle2 instanceof gm) {
                                                gm gmVar2 = gb2Var.q4;
                                                if (gmVar2 == null || gmVar2 != characterStyle2) {
                                                    gb2Var.i3(1);
                                                    gb2Var.q4 = (gm) characterStyleArr3[0];
                                                    gb2Var.v4 = 1;
                                                }
                                            } else {
                                                m46 m46Var = gb2Var.r4;
                                                if (m46Var == null || m46Var.i != characterStyle2) {
                                                    i46Var.l(m46Var, true);
                                                    float[] fArr = gb2.Id;
                                                    m46 m46Var2 = new m46(characterStyleArr3[0], gb2Var.cc, f7, p, 0);
                                                    gb2Var.r4 = m46Var2;
                                                    m46Var2.d(bkb.v0(gb2Var.Q5.O3() ? bkb.Cc : bkb.Be, gb2Var.cc));
                                                    if (h27Var.J && (n79Var = gb2Var.n8) != null) {
                                                        gb2Var.r4.d(bkb.p1(bkb.I.o() ? 0.13f : 0.1f, n79Var.h()));
                                                    }
                                                    gb2Var.z0 = i2;
                                                    gb2Var.y0 = -1;
                                                    gb2Var.v4 = 1;
                                                    try {
                                                        b46 b = gb2Var.r4.b();
                                                        int[] Z1 = gb2.Z1(spannable, gb2Var.r4.i);
                                                        int i6 = Z1[0];
                                                        int i7 = h27Var.n;
                                                        int i8 = i6 - i7;
                                                        Z1[0] = i8;
                                                        Z1[1] = Z1[1] - i7;
                                                        b.d(h27Var.e, i8, 0.0f);
                                                        h27Var.e.getSelectionPath(Z1[0], Z1[1], b);
                                                        if (Z1[1] >= h27Var.r) {
                                                            int i9 = i2 + 1;
                                                            while (i9 < gb2Var.q3.e.size()) {
                                                                h27 h27Var2 = (h27) gb2Var.q3.e.get(i9);
                                                                if (z6) {
                                                                    try {
                                                                        int i10 = h27Var2.n;
                                                                        characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i10, i10, f4c.class);
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        z4 = z5;
                                                                        fa4.g(e, z4);
                                                                        i46Var.a(gb2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                                        gb2Var.qc = z4;
                                                                        gb2Var.invalidate();
                                                                        return z4;
                                                                    }
                                                                } else {
                                                                    int i11 = h27Var2.n;
                                                                    characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i11, i11, ClickableSpan.class);
                                                                }
                                                                if (characterStyleArr2 == null || characterStyleArr2.length == 0) {
                                                                    break;
                                                                }
                                                                CharacterStyle characterStyle3 = characterStyleArr2[i5];
                                                                m46 m46Var3 = gb2Var.r4;
                                                                if (characterStyle3 != m46Var3.i) {
                                                                    z3 = z5;
                                                                    break;
                                                                }
                                                                b46 b2 = m46Var3.b();
                                                                z3 = z5;
                                                                try {
                                                                    b2.d(h27Var2.e, i5, h27Var2.p(gb2Var.q3.e, nb2Var) - h27Var.p(gb2Var.q3.e, nb2Var));
                                                                    int i12 = (Z1[z3 ? 1 : 0] + h27Var.n) - h27Var2.n;
                                                                    h27Var2.e.getSelectionPath(0, i12, b2);
                                                                    if (i12 < h27Var2.r - 1) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                    z5 = z3 ? 1 : 0;
                                                                    i5 = 0;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    z4 = z3;
                                                                    fa4.g(e, z4);
                                                                    i46Var.a(gb2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                                    gb2Var.qc = z4;
                                                                    gb2Var.invalidate();
                                                                    return z4;
                                                                }
                                                            }
                                                        }
                                                        z3 = z5;
                                                        i5 = 0;
                                                        if (Z1[i5] <= h27Var.n) {
                                                            int i13 = 0;
                                                            for (int i14 = i2 - 1; i14 >= 0; i14--) {
                                                                h27 h27Var3 = (h27) gb2Var.q3.e.get(i14);
                                                                if (z6) {
                                                                    int i15 = h27Var3.r - 1;
                                                                    characterStyleArr = (CharacterStyle[]) spannable.getSpans(i15, i15, f4c.class);
                                                                } else {
                                                                    int i16 = h27Var3.r - 1;
                                                                    characterStyleArr = (CharacterStyle[]) spannable.getSpans(i16, i16, ClickableSpan.class);
                                                                }
                                                                if (characterStyleArr == null || characterStyleArr.length == 0) {
                                                                    break;
                                                                }
                                                                CharacterStyle characterStyle4 = characterStyleArr[0];
                                                                m46 m46Var4 = gb2Var.r4;
                                                                if (characterStyle4 != m46Var4.i) {
                                                                    break;
                                                                }
                                                                b46 b3 = m46Var4.b();
                                                                i13 -= h27Var3.w;
                                                                int i17 = Z1[0];
                                                                int i18 = h27Var.n;
                                                                int i19 = h27Var3.n;
                                                                int i20 = (i17 + i18) - i19;
                                                                int i21 = (Z1[z3 ? 1 : 0] + i18) - i19;
                                                                b3.d(h27Var3.e, i20, i13);
                                                                h27Var3.e.getSelectionPath(i20, i21, b3);
                                                                if (i20 > h27Var3.n) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z4 = z3 ? 1 : 0;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        z3 = z5;
                                                    }
                                                    i46Var.a(gb2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                    gb2Var.qc = z4;
                                                    gb2Var.invalidate();
                                                    return z4;
                                                }
                                            }
                                            z4 = true;
                                            gb2Var.qc = z4;
                                            gb2Var.invalidate();
                                            return z4;
                                        }
                                        CharacterStyle characterStyle5 = characterStyleArr3[0];
                                        if ((characterStyle5 instanceof gm) && (gmVar = gb2Var.q4) == characterStyle5) {
                                            if (gb2Var.eb.T1(gmVar)) {
                                                z = true;
                                                try {
                                                    gb2Var.i3(1);
                                                    gb2Var.q4 = null;
                                                    return true;
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    fa4.g(e, z);
                                                    return false;
                                                }
                                            }
                                            gb2Var.i3(1);
                                            gb2Var.q4 = null;
                                        } else {
                                            m46 m46Var5 = gb2Var.r4;
                                            if (m46Var5 != null && characterStyle5 == (characterStyle = m46Var5.i)) {
                                                gb2Var.eb.O(gb2Var, characterStyle, false);
                                                gb2Var.i3(1);
                                                return true;
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                                z = true;
                            }
                            return false;
                        }
                    }
                }
                gb2Var.i3(1);
                return false;
            }
            if (motionEvent.getAction() == 1) {
                gb2Var.s4 = null;
                gb2Var.f3();
                return false;
            }
        }
        return false;
    }

    public final void b(boolean z) {
        boolean z2;
        gb2 gb2Var = this.a;
        k27 k27Var = gb2Var.Q5;
        if (k27Var != null) {
            TLRPC.MessageMedia m1 = k27.m1(k27Var);
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
                byte b = 0;
                if (gb2Var.f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), gb2Var.f7.length);
                    z2 = false;
                    for (int i = 0; i < min; i++) {
                        CheckBoxBase checkBoxBase = gb2Var.f7[i];
                        if (checkBoxBase != null && checkBoxBase.q) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z3 = gb2Var.W4;
                boolean z4 = (z3 || gb2Var.X4 || !this.w || pollResults == null || pollResults.total_voters == 0 || !tL_messageMediaPoll.poll.creator) ? false : true;
                boolean z5 = (z3 || gb2Var.X4 || this.x) ? false : true;
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z6 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.t) {
                    charSequence = k96.M0(2131746984, null);
                    b = 84;
                } else if (!z4 || (poll.multiple_choice && z5 && z2)) {
                    if (poll.multiple_choice && z5) {
                        charSequence = k96.M0(2131746963, null);
                        b = 83;
                    } else if (!gb2Var.j6 && z6 && ((z3 && (!this.v || this.w)) || (gb2Var.X4 && pollResults.total_voters != 0))) {
                        charSequence = k96.a0(null, null, 2131746912, Integer.valueOf(pollResults.total_voters));
                        b = 80;
                    }
                } else if (z6) {
                    charSequence = k96.a0(null, null, 2131746912, Integer.valueOf(pollResults.total_voters));
                    b = 80;
                } else if (k27Var.M0) {
                    charSequence = gl.G2(k96.M0(2131746918, null), false, -gl.L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
                    b = 82;
                } else {
                    charSequence = gl.E2(k96.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                    b = 81;
                }
                if (b != 0) {
                    if (this.k == null) {
                        me8 me8Var = new me8(gb2Var, gb2Var.cc);
                        this.k = me8Var;
                        me8Var.setCallback(gb2Var);
                        me8Var.a.setCallback(gb2Var);
                        me8Var.d.setCallback(gb2Var);
                    }
                    gb2Var.z2 = charSequence;
                    this.k.d.t(charSequence, z, true);
                    gb2Var.u2 = true;
                    gb2Var.y2 = b;
                    gb2Var.y0();
                }
                gb2Var.c0(z);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x019b, code lost:
    
        if (r13.i != r12[r17]) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0280 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(MotionEvent motionEvent) {
        Drawable drawable;
        gb2 gb2Var;
        boolean z;
        bb2 bb2Var;
        int i;
        id8 id8Var;
        int i2;
        int[] iArr;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        gb2 gb2Var2 = this.a;
        i46 i46Var = gb2Var2.u4;
        int[] iArr2 = gb2Var2.N2;
        int[] iArr3 = gb2Var2.L2;
        Drawable[] drawableArr = gb2Var2.J2;
        ArrayList arrayList = gb2Var2.Q4;
        k27 k27Var = gb2Var2.Q5;
        int i6 = 0;
        if (k27Var.T == 0 && (((!gb2Var2.Z4 && !gb2Var2.b5) || k27Var.C4()) && !arrayList.isEmpty())) {
            k27 k27Var2 = gb2Var2.Q5;
            if (k27Var2.D == 17 && k27Var2.p4()) {
                int x = (int) motionEvent.getX();
                int P1 = (int) gb2Var2.P1(motionEvent);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() != 3) {
                                return false;
                            }
                            h();
                            return false;
                        }
                        if ((gb2Var2.i5 == -1 && !gb2Var2.q5) || (drawable = drawableArr[0]) == null) {
                            return false;
                        }
                        drawable.setHotspot(x, P1);
                        return false;
                    }
                    if (gb2Var2.t5 != -1) {
                        gb2Var2.playSoundEffect(0);
                        if (gb2Var2.Q5 != null && (bb2Var = gb2Var2.eb) != null && gb2Var2.t5 == 0) {
                            bb2Var.H2(gb2Var2);
                        }
                        gb2Var2.t5 = -1;
                        h();
                        return false;
                    }
                    if (gb2Var2.y5) {
                        gb2Var2.playSoundEffect(0);
                        gb2Var2.G0();
                        gb2Var2.y5 = false;
                        h();
                        return false;
                    }
                    if (gb2Var2.q5) {
                        gb2Var2.playSoundEffect(0);
                        gb2Var2.G0();
                        gb2Var2.q5 = false;
                        gb2Var2.t5 = -1;
                        h();
                        return false;
                    }
                    m46 m46Var = gb2Var2.r4;
                    if (m46Var != null) {
                        CharacterStyle characterStyle = m46Var.i;
                        if (characterStyle instanceof URLSpan) {
                            gb2Var2.eb.O(gb2Var2, characterStyle, false);
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(gb2Var2);
                        }
                        gb2Var2.i3(4);
                        return false;
                    }
                    if (gb2Var2.i5 == -1) {
                        return false;
                    }
                    gb2Var2.playSoundEffect(0);
                    h();
                    if (this.F) {
                        fb2 fb2Var = (fb2) arrayList.get(gb2Var2.i5);
                        ImageReceiver imageReceiver = fb2Var.x.c;
                        TLRPC.PollAnswer pollAnswer = fb2Var.s;
                        TLRPC.MessageMedia messageMedia = pollAnswer.media;
                        motionEvent.getX();
                        motionEvent.getY();
                        int i7 = fb2Var.s.unshuffled_index;
                        bb2 bb2Var2 = gb2Var2.eb;
                        if (bb2Var2 != null) {
                            bb2Var2.s(gb2Var2, pollAnswer, messageMedia, i7);
                        }
                    } else if (gb2Var2.Q5.r1) {
                        Toast.makeText(gb2Var2.getContext(), k96.M0(gb2Var2.Q5.C4() ? 2131748301 : 2131748299, null), 1).show();
                    } else {
                        fb2 fb2Var2 = (fb2) arrayList.get(gb2Var2.i5);
                        TLRPC.PollAnswer pollAnswer2 = fb2Var2.s;
                        if (gb2Var2.W4 || gb2Var2.X4) {
                            new ArrayList().add(pollAnswer2);
                            gb2Var2.eb.D0(gb2Var2, pollAnswer2);
                        } else {
                            if (this.x) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pollAnswer2);
                                gb2Var = gb2Var2;
                                gb2Var2.eb.r1(gb2Var, arrayList2, fb2Var2.j, gl.L(50.0f) + fb2Var2.a, gb2Var2.gb + fb2Var2.b);
                            } else {
                                TLRPC.Poll poll = gb2Var2.j5;
                                if (poll == null || !poll.multiple_choice) {
                                    int i8 = gb2Var2.i5;
                                    gb2Var2.d5 = i8;
                                    gb2Var2.Z4 = true;
                                    gb2Var2.h5 = 0.0f;
                                    gb2Var2.f5 = true;
                                    gb2Var2.e5 = 360.0f;
                                    gb2Var2.g5 = false;
                                    if (fb2Var2.t != null) {
                                        gb2Var2.P3(i8, true);
                                    } else {
                                        gb2Var2.a5 = true;
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(pollAnswer2);
                                        gb2Var = gb2Var2;
                                        gb2Var2.eb.r1(gb2Var, arrayList3, -1, 0, 0);
                                    }
                                } else {
                                    boolean contains = gb2Var2.Q5.x1.contains(pollAnswer2);
                                    k27 k27Var3 = gb2Var2.Q5;
                                    if (contains) {
                                        k27Var3.x1.remove(pollAnswer2);
                                        z = true;
                                        gb2Var2.f7[gb2Var2.i5].f(-1, false, true);
                                    } else {
                                        z = true;
                                        k27Var3.x1.add(pollAnswer2);
                                        gb2Var2.f7[gb2Var2.i5].f(-1, true, true);
                                    }
                                    b(z);
                                }
                            }
                            gb2Var2 = gb2Var;
                        }
                    }
                    gb2Var2.i5 = -1;
                    gb2Var2.invalidate();
                    return false;
                }
                gb2Var2.i5 = -1;
                gb2Var2.q5 = false;
                gb2Var2.t5 = -1;
                gb2Var2.y5 = false;
                gb2Var2.i3(4);
                int i9 = gb2Var2.w5;
                if (i9 != -1 && gb2Var2.x5 != -1 && Math.abs(x - i9) < gl.L(20.0f) && Math.abs(P1 - gb2Var2.x5) < gl.L(20.0f)) {
                    gb2Var2.y5 = true;
                    h();
                    gb2Var2.invalidate();
                    return true;
                }
                if (gb2Var2.r5 && (i4 = gb2Var2.o5) != -1 && x >= i4 && x <= gl.L(40.0f) + i4 && P1 >= (i5 = gb2Var2.p5) && P1 <= gl.L(40.0f) + i5) {
                    gb2Var2.q5 = true;
                    iArr3[0] = 3;
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setBounds(gb2Var2.o5 - gl.L(8.0f), gb2Var2.p5 - gl.L(8.0f), gl.L(32.0f) + gb2Var2.o5, gl.L(32.0f) + gb2Var2.p5);
                        drawableArr[0].setHotspot(x, P1);
                        drawableArr[0].setState(iArr2);
                    }
                    h();
                    gb2Var2.invalidate();
                    return true;
                }
                if (gb2Var2.Q5.M0) {
                    h();
                    gb2Var2.invalidate();
                    return false;
                }
                h();
                int i10 = 0;
                boolean z4 = false;
                while (i10 < arrayList.size()) {
                    i = i6;
                    fb2 fb2Var3 = (fb2) arrayList.get(i10);
                    int L = (fb2Var3.b + gb2Var2.gb) - gl.L(13.0f);
                    StaticLayout staticLayout = fb2Var3.p;
                    if (staticLayout != null && (staticLayout.getText() instanceof Spannable)) {
                        float f = x;
                        float f2 = fb2Var3.m;
                        if (f >= f2) {
                            float f3 = P1;
                            float f4 = fb2Var3.n;
                            if (f3 >= f4 && !gb2Var2.Q5.t1) {
                                int i11 = x - ((int) f2);
                                int i12 = P1 - ((int) f4);
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    iArr = iArr3;
                                }
                                if (i12 <= fb2Var3.p.getHeight()) {
                                    int lineForVertical = fb2Var3.p.getLineForVertical(i12);
                                    float f5 = i11;
                                    int offsetForHorizontal = fb2Var3.p.getOffsetForHorizontal(lineForVertical, f5);
                                    float lineLeft = fb2Var3.p.getLineLeft(lineForVertical);
                                    if (lineLeft <= f5 && lineLeft + fb2Var3.p.getLineWidth(lineForVertical) >= f5) {
                                        Spannable spannable = (Spannable) fb2Var3.p.getText();
                                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                        if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[i] instanceof d4c) || d4c.h) && !gl.A1())) {
                                            m46 m46Var2 = gb2Var2.r4;
                                            if (m46Var2 != null) {
                                                iArr = iArr3;
                                                try {
                                                    z3 = z4;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    z2 = true;
                                                    fa4.g(e, z2);
                                                    i3 = fb2Var3.a;
                                                    if (x >= i3) {
                                                        if (P1 > gl.L(26.0f) + L + fb2Var3.c) {
                                                        }
                                                    }
                                                    i10++;
                                                    i6 = i;
                                                    iArr3 = iArr;
                                                }
                                                try {
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    z4 = z3;
                                                    z2 = true;
                                                    fa4.g(e, z2);
                                                    i3 = fb2Var3.a;
                                                    if (x >= i3) {
                                                    }
                                                    i10++;
                                                    i6 = i;
                                                    iArr3 = iArr;
                                                }
                                            } else {
                                                iArr = iArr3;
                                                z3 = z4;
                                            }
                                            i46Var.l(m46Var2, true);
                                            ClickableSpan clickableSpan = clickableSpanArr[i];
                                            wjb wjbVar = gb2Var2.cc;
                                            float[] fArr = gb2.Id;
                                            m46 m46Var3 = new m46(clickableSpan, wjbVar, f, f3, 0);
                                            gb2Var2.r4 = m46Var3;
                                            m46Var3.d(bkb.v0(gb2Var2.Q5.O3() ? bkb.Cc : bkb.Be, gb2Var2.cc));
                                            gb2Var2.y0 = i10;
                                            gb2Var2.v4 = 4;
                                            gb2Var2.w();
                                            try {
                                                b46 b = gb2Var2.r4.b();
                                                int[] Z1 = gb2.Z1(spannable, gb2Var2.r4.i);
                                                b.d(fb2Var3.p, Z1[i], 0.0f);
                                                fb2Var3.p.getSelectionPath(Z1[i], Z1[1], b);
                                            } catch (Exception e4) {
                                                fa4.g(e4, true);
                                            }
                                            i46Var.a(gb2Var2.r4, 4);
                                            try {
                                                gb2Var2.invalidate();
                                            } catch (Exception e5) {
                                                e = e5;
                                                z2 = true;
                                                z4 = true;
                                                fa4.g(e, z2);
                                                i3 = fb2Var3.a;
                                                if (x >= i3) {
                                                }
                                                i10++;
                                                i6 = i;
                                                iArr3 = iArr;
                                            }
                                            z4 = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    iArr = iArr3;
                    z4 = z4;
                    i3 = fb2Var3.a;
                    if (x >= i3 && x <= (i3 + gb2Var2.b7) - gl.L(31.0f) && P1 >= L) {
                        if (P1 > gl.L(26.0f) + L + fb2Var3.c) {
                            gb2Var2.i5 = i10;
                            wd8 wd8Var = fb2Var3.x;
                            boolean z5 = (wd8Var == null || !wd8Var.h || x <= (fb2Var3.a + gb2Var2.b7) - gl.L(81.0f)) ? i : 1;
                            this.F = z5;
                            if (z5 == 0) {
                                iArr[i] = 1;
                                fb2Var3.w.setHotspot(x, P1);
                                fb2Var3.w.setState(iArr2);
                                gb2Var2.invalidate();
                            }
                            z4 = true;
                            break;
                        }
                    }
                    i10++;
                    i6 = i;
                    iArr3 = iArr;
                }
                i = i6;
                if (!z4 && this.s && (id8Var = this.l) != null) {
                    ff0 ff0Var = id8Var.a;
                    if (id8Var.getBounds().contains(x, P1)) {
                        ff0Var.setHotspot(x, P1);
                        ff0Var.setState(id8Var.e);
                        i2 = i;
                    } else {
                        i2 = -1;
                    }
                    gb2Var2.t5 = i2;
                    if (i2 != -1) {
                        return true;
                    }
                }
                return z4;
            }
        }
        return false;
    }

    public final boolean d(MotionEvent motionEvent) {
        yd8 yd8Var;
        yd8 yd8Var2;
        gb2 gb2Var = this.a;
        k27 k27Var = gb2Var.Q5;
        if (k27Var != null && k27Var.D == 17 && !k27Var.n4()) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int P1 = (int) gb2Var.P1(motionEvent);
            yd8 yd8Var3 = this.m;
            if (yd8Var3 != null) {
                if (yd8Var3.Y && yd8Var3.a.f && yd8Var3.L.e(x - yd8Var3.M, P1 - yd8Var3.N, action)) {
                    if (action == 0) {
                        gb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
                yd8 yd8Var4 = this.m;
                if ((yd8Var4.Y || yd8Var4.X) && yd8Var4.k(x, P1, action)) {
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
            }
            if (gb2Var.Q5.L0 && (yd8Var2 = this.n) != null) {
                if (yd8Var2.Y && yd8Var2.a.f && yd8Var2.L.e(x - yd8Var2.M, P1 - yd8Var2.N, action)) {
                    if (action == 0) {
                        gb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
                yd8 yd8Var5 = this.n;
                if ((yd8Var5.Y || yd8Var5.X) && yd8Var5.k(x, P1, action)) {
                    gb2Var.g1 = true;
                    gb2Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = (byte) -1;
                yd8 yd8Var6 = this.m;
                if (yd8Var6 != null && yd8Var6.T && yd8Var6.getBounds().contains(x, P1)) {
                    this.G = (byte) -2;
                    gb2Var.invalidate();
                    return true;
                }
                if (gb2Var.Q5.L0 && (yd8Var = this.n) != null && yd8Var.T && yd8Var.getBounds().contains(x, P1)) {
                    this.G = (byte) -3;
                    gb2Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                gb2Var.playSoundEffect(0);
                byte b = this.G;
                if (b == -2) {
                    yd8 yd8Var7 = this.m;
                    ImageReceiver imageReceiver = yd8Var7.b;
                    TLRPC.MessageMedia messageMedia = yd8Var7.U;
                    bb2 bb2Var = gb2Var.eb;
                    if (bb2Var != null) {
                        bb2Var.s(gb2Var, null, messageMedia, -2);
                    }
                } else if (b == -3) {
                    yd8 yd8Var8 = this.n;
                    ImageReceiver imageReceiver2 = yd8Var8.b;
                    TLRPC.MessageMedia messageMedia2 = yd8Var8.U;
                    bb2 bb2Var2 = gb2Var.eb;
                    if (bb2Var2 != null) {
                        bb2Var2.s(gb2Var, null, messageMedia2, -3);
                    }
                }
                this.G = (byte) -1;
                gb2Var.invalidate();
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i) {
        gb2 gb2Var = this.a;
        CheckBoxBase[] checkBoxBaseArr = gb2Var.f7;
        if (checkBoxBaseArr != null) {
            if (checkBoxBaseArr.length != i) {
                int i2 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = gb2Var.f7;
                    if (i2 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i2].l = false;
                    i2++;
                }
            }
            if (this.I != null) {
                this.I = new jc0(gb2Var.a6, gb2Var, gl.L(16.0f), gl.L(7.0f), gl.N(1.0f));
                return;
            }
            return;
        }
        gb2Var.f7 = new CheckBoxBase[i];
        int i3 = 0;
        while (true) {
            CheckBoxBase[] checkBoxBaseArr3 = gb2Var.f7;
            if (i3 >= checkBoxBaseArr3.length) {
                break;
            }
            checkBoxBaseArr3[i3] = new CheckBoxBase(20, gb2Var.cc, gb2Var);
            gb2Var.f7[i3].k(false);
            gb2Var.f7[i3].j(true);
            gb2Var.f7[i3].d(9);
            i3++;
        }
        if (this.I != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x06fb, code lost:
    
        if (r64.y != r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x10c7, code lost:
    
        if (r42 == false) goto L646;
     */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0cf5  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0d7e  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0ea7  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0ec2  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x1029  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1039  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x1066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x107d  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x108f  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x109b  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x10cb  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x10db  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1100  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x111b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x113e  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1146  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x116c  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x11cc  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x116f  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x112e  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x1121  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1103  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x10f4  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x10bb  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x1080  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x104e  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0f9f  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0e69  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0d76  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas) {
        int a2;
        int a22;
        int a23;
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        float L;
        int i3;
        int i4;
        long j;
        int i5;
        gb2 gb2Var;
        Drawable[] drawableArr;
        RectF rectF;
        int i6;
        float f4;
        nb2 nb2Var;
        ArrayList arrayList;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        float f5;
        float f6;
        ?? r12;
        float f7;
        int i10;
        int i11;
        int i12;
        float f8;
        int i13;
        long j2;
        float f9;
        int i14;
        int i15;
        int i16;
        int i17;
        float f10;
        float f11;
        m17 m17Var;
        me8 me8Var;
        gn gnVar;
        byte[] bArr;
        TLRPC.PollAnswer pollAnswer;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f12;
        int i24;
        int i25;
        int i26;
        float f13;
        long j3;
        ArrayList arrayList2;
        int i27;
        int i28;
        Canvas canvas2;
        int i29;
        RectF rectF2;
        int i30;
        int i31;
        Canvas canvas3;
        int i32;
        int i33;
        int i34;
        float f14;
        int i35;
        StaticLayout staticLayout;
        TLRPC.Poll poll;
        CheckBoxBase checkBoxBase;
        wd8 wd8Var;
        CheckBoxBase checkBoxBase2;
        byte[] bArr2;
        int i36;
        TLRPC.Poll poll2;
        float f15;
        float L2;
        int extraTextX;
        float f16;
        float f17;
        Canvas canvas4 = canvas;
        gb2 gb2Var2 = this.a;
        ArrayList arrayList3 = gb2Var2.Q4;
        int[] iArr2 = gb2Var2.L2;
        Drawable[] drawableArr2 = gb2Var2.J2;
        RectF rectF3 = gb2Var2.c4;
        nb2 nb2Var2 = gb2Var2.ub;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = currentTimeMillis - this.D;
        if (j4 > 17) {
            j4 = 17;
        }
        this.D = currentTimeMillis;
        if (gb2Var2.Q5.O3()) {
            a2 = gb2Var2.a2(bkb.Vc);
            a22 = gb2Var2.a2(gb2Var2.A2() ? bkb.dc : bkb.ic);
            a23 = gb2Var2.a2(bkb.Xc);
        } else {
            a2 = gb2Var2.a2(bkb.Uc);
            a22 = gb2Var2.a2(gb2Var2.A2() ? bkb.ee : bkb.de);
            a23 = gb2Var2.a2(bkb.Wc);
        }
        bkb.N2.setColor(a2);
        TextPaint textPaint = bkb.O2;
        textPaint.linkColor = a23;
        textPaint.setColor(a2);
        bkb.L2.setColor(a2);
        bkb.S2.setColor(a22);
        bkb.E2.setColor(a22);
        bkb.H2.setColor(a22);
        canvas4.save();
        int i37 = gb2Var2.Q5.L0 ? this.g : 0;
        if (nb2Var2.i3) {
            float f18 = i37;
            f = gl.R1(nb2Var2.h3 ? this.g : 0.0f, f18, nb2Var2.L1);
            float f19 = f - f18;
            canvas4.translate(0.0f, f19);
            f2 = f19;
        } else {
            f = i37;
            f2 = 0.0f;
        }
        float f20 = f2;
        if (nb2Var2.G2) {
            int i38 = gb2Var2.gb;
            i = a2;
            i2 = a22;
            f3 = 0.0f;
            canvas4.translate(0.0f, gl.U1(nb2Var2.L1, nb2Var2.H2, i38) + (-i38));
        } else {
            i = a2;
            i2 = a22;
            if (nb2Var2.u2) {
                float f21 = gb2Var2.gb;
                float f22 = nb2Var2.L1;
                float A = tb4.A(1.0f, f22, nb2Var2.v2, f21 * f22);
                if (gb2Var2.Q5.m5()) {
                    A -= gb2Var2.gb;
                }
                f3 = 0.0f;
                canvas4.translate(0.0f, A);
            } else {
                f3 = 0.0f;
            }
        }
        if (nb2Var2.x0) {
            canvas4.translate(f3, nb2Var2.k0);
        }
        if (gb2Var2.Q5.O3()) {
            L = gl.L(11.0f) + (gb2Var2.d7 - gb2Var2.b7);
        } else {
            L = gb2Var2.Y6 ? gl.L(91.0f) : gb2Var2.b3() ? gl.L(68.0f) : gl.L(20.0f);
        }
        boolean z = nb2Var2.x0;
        if (z) {
            L += nb2Var2.h0;
        }
        float f23 = L;
        float f24 = gb2Var2.b7;
        if (z) {
            f24 += nb2Var2.i0 - nb2Var2.h0;
        }
        float f25 = f24;
        int L3 = (int) (f23 - gl.L(9.0f));
        float f26 = f23 + f25;
        int L4 = (int) (f26 - gl.L(22.0f));
        if (f > gl.L(8.0f)) {
            if (gb2Var2.n8 == null) {
                gb2Var2.n8 = new n79(gb2Var2);
            }
            RectF rectF4 = gl.P;
            rectF4.set(0.0f, gl.L(5.0f), f25 - gl.L(33.0f), f - gl.L(3.0f));
            rectF4.offset(f23 + gl.L(1.0f), ((((gl.L(10.0f) + gb2Var2.gb) + this.q) + gb2Var2.u3) + i37) - f);
            gb2Var2.n8.a(gb2Var2.Q5, gb2Var2.va, gb2Var2.wa, gb2Var2.cc, 3);
            int i39 = a23;
            i5 = i37;
            int i40 = i2;
            iArr = iArr2;
            drawableArr = drawableArr2;
            i4 = L4;
            j = j4;
            int i41 = i;
            gb2Var2.n8.d(canvas, rectF4, 5.0f, 5.0f, 5.0f, 1.0f, true, false);
            canvas4 = canvas;
            gb2Var2.n8.f(canvas4, rectF4, 1.0f);
            if (gb2Var2.q3 != null) {
                int color = bkb.Z2.getColor();
                bkb.Z2.setColor(i41);
                canvas4.save();
                canvas4.clipRect(rectF4);
                yd8 yd8Var = this.n;
                if (yd8Var != null && yd8Var.T) {
                    int L5 = gl.L(10.0f) + ((int) rectF4.left);
                    int L6 = (((int) (rectF4.top + (this.g - gl.L(8.0f)))) - this.f) - gl.L(8.0f);
                    this.n.setBounds(L5, L6, this.e + L5, this.f + L6);
                    this.n.b(gb2Var2.Q5.N3());
                    yd8 yd8Var2 = this.n;
                    gb2Var2.a2(gb2Var2.Q5.N3() ? bkb.Dc : bkb.Ye);
                    tgb tgbVar = yd8Var2.r;
                    if (tgbVar != null) {
                        tgbVar.m(i41);
                    }
                    tgb tgbVar2 = yd8Var2.s;
                    if (tgbVar2 != null) {
                        tgbVar2.m(i40);
                    }
                    this.n.draw(canvas4);
                }
                if (this.c != null) {
                    int color2 = bkb.X2.getColor();
                    bkb.X2.setColor(gb2Var2.n8.h());
                    canvas4.save();
                    canvas4.translate(rectF4.left + gl.L(10.0f), rectF4.top + gl.L(6.0f));
                    this.c.draw(canvas4);
                    canvas4.restore();
                    bkb.X2.setColor(color2);
                    if (this.h != null) {
                        if (this.i != gb2Var2.n8.h()) {
                            this.i = gb2Var2.n8.h();
                            this.h.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.SRC_IN));
                        }
                        gb2Var2.w5 = ((int) rectF4.right) - gl.L(16.33f);
                        gb2Var2.x5 = gl.L(16.33f) + ((int) rectF4.top);
                        canvas4.save();
                        canvas4.scale(0.85f, 0.85f, gb2Var2.w5, gb2Var2.x5);
                        int A2 = oo1.A(2, gb2Var2.w5, this.h);
                        int y = oo1.y(2, gb2Var2.x5, this.h);
                        Drawable drawable = this.h;
                        drawable.setBounds(A2, y, drawable.getIntrinsicWidth() + A2, this.h.getIntrinsicHeight() + y);
                        this.h.draw(canvas4);
                        canvas4.restore();
                    }
                }
                bkb.a3.setColor(bkb.Z2.getColor());
                bkb.a3.linkColor = i39;
                float L7 = rectF4.left + gl.L(10.0f);
                gb2Var2.u5 = L7;
                float L8 = rectF4.top + gl.L(25.0f);
                gb2Var2.v5 = L8;
                i27 i27Var = gb2Var2.q3;
                i6 = i40;
                i3 = L3;
                rectF = rectF3;
                nb2Var = nb2Var2;
                i = i41;
                f4 = 1.0f;
                arrayList = arrayList3;
                gb2Var2.f1(L7, L8, canvas, i27Var.e, i27Var.d, true, 1.0f, true, false, false, true);
                float L9 = rectF4.left + gl.L(10.0f);
                float L10 = rectF4.top + gl.L(25.0f);
                i27 i27Var2 = gb2Var2.q3;
                gb2Var2.I0(L9, L10, canvas, i27Var2.e, gb2Var2.Qa, true, 1.0f, i27Var2.d, true);
                gb2Var = gb2Var2;
                canvas4 = canvas;
                canvas4.restore();
                bkb.Z2.setColor(color);
            } else {
                f4 = 1.0f;
                i6 = i40;
                i3 = L3;
                rectF = rectF3;
                nb2Var = nb2Var2;
                i = i41;
                arrayList = arrayList3;
                gb2Var = gb2Var2;
            }
        } else {
            i3 = L3;
            i4 = L4;
            j = j4;
            i5 = i37;
            gb2Var = gb2Var2;
            drawableArr = drawableArr2;
            rectF = rectF3;
            i6 = i2;
            f4 = 1.0f;
            nb2Var = nb2Var2;
            arrayList = arrayList3;
            iArr = iArr2;
        }
        if (gb2Var.o2 != null) {
            canvas4.save();
            canvas4.translate(f23 + gb2Var.getExtraTextX(), gl.L(15.0f) + gb2Var.gb + this.q + gb2Var.u3 + i5);
            int alpha = bkb.N2.getAlpha();
            if (nb2Var.l3 != null) {
                bkb.N2.setAlpha((int) (nb2Var.L1 * alpha));
            }
            gb2Var.o2.draw(canvas4);
            StaticLayout staticLayout2 = gb2Var.o2;
            gm.drawAnimatedEmojis(canvas4, staticLayout2, gb2Var.Pa, 0.0f, null, 0.0f, 0.0f, 0.0f, nb2Var.l3 != null ? nb2Var.L1 : f4, gb2Var.L1(1, staticLayout2.getPaint().getColor()));
            if (nb2Var.l3 != null) {
                bkb.N2.setAlpha(alpha);
            }
            int height = gb2Var.o2.getHeight();
            if (nb2Var.l3 != null) {
                bkb.N2.setAlpha((int) ((f4 - nb2Var.L1) * alpha));
                nb2Var.l3.draw(canvas4);
                bkb.N2.setAlpha(alpha);
                StaticLayout staticLayout3 = nb2Var.l3;
                gm.drawAnimatedEmojis(canvas4, staticLayout3, nb2Var.m3, 0.0f, null, 0.0f, 0.0f, 0.0f, f4 - nb2Var.L1, gb2Var.L1(1, staticLayout3.getPaint().getColor()));
                i7 = gl.U1(nb2Var.L1, nb2Var.l3.getHeight(), height);
            } else {
                i7 = height;
            }
            canvas4.restore();
        } else {
            i7 = 0;
        }
        yd8 yd8Var3 = this.m;
        if (yd8Var3 == null || !yd8Var3.T) {
            i8 = i6;
            i9 = i;
            f5 = f23;
        } else {
            int L11 = (gl.L(gb2Var.gb > 0 ? 11.0f : 5.0f) + gb2Var.gb) - ((int) f20);
            f5 = f23;
            int L12 = gl.L(2.0f) + (((int) f5) - gl.L(9.0f));
            this.m.setBounds(L12, L11, this.o + L12, this.p + L11);
            this.m.b(gb2Var.Q5.N3());
            yd8 yd8Var4 = this.m;
            gb2Var.a2(gb2Var.Q5.N3() ? bkb.Dc : bkb.Ye);
            tgb tgbVar3 = yd8Var4.r;
            i9 = i;
            if (tgbVar3 != null) {
                tgbVar3.m(i9);
            }
            tgb tgbVar4 = yd8Var4.s;
            i8 = i6;
            if (tgbVar4 != null) {
                tgbVar4.m(i8);
            }
            this.m.draw(canvas4);
        }
        int L13 = gl.L(20.0f) + i7 + gb2Var.gb + this.q + gb2Var.u3 + i5;
        if (gb2Var.e3 != null) {
            canvas4.save();
            canvas4.translate(gb2Var.g3 + f5 + gb2Var.getExtraTextX(), L13);
            gb2Var.e3.draw(canvas4);
            canvas4.restore();
            TLRPC.MessageMedia n1 = k27.n1(gb2Var.Q5.k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1;
                if (!tL_messageMediaPoll.poll.quiz || (!(gb2Var.W4 || gb2Var.X4 || gb2Var.Y4 || (this.x && (!this.v || this.w))) || TextUtils.isEmpty(tL_messageMediaPoll.results.solution))) {
                    f6 = 2.0f;
                    f7 = 0.3f;
                    i10 = 2;
                    gb2Var.o5 = -1;
                } else {
                    Drawable b2 = gb2Var.b2(gb2Var.Q5.O3() ? "drawable_chat_pollHintDrawableOut" : "drawable_chat_pollHintDrawableIn");
                    if (gb2Var.Z4) {
                        b2.setAlpha((int) (this.r * 255.0f));
                    } else {
                        b2.setAlpha(kk7.d4);
                    }
                    gb2Var.o5 = (int) (((f26 - gl.L(23.0f)) - b2.getIntrinsicWidth()) - gl.L(8.0f));
                    gb2Var.p5 = L13 - gl.L(6.0f);
                    int w = oo1.w(2, gb2Var.o5, b2);
                    f7 = 0.3f;
                    int i42 = oo1.i(2, gb2Var.p5, b2);
                    i10 = 2;
                    if (gb2Var.r5) {
                        float f27 = gb2Var.s5;
                        if (f27 < f4) {
                            f6 = 2.0f;
                            f17 = rn.a.getInterpolation(f27);
                            int intrinsicWidth = ((int) (b2.getIntrinsicWidth() * f17)) / 2;
                            int intrinsicHeight = ((int) (b2.getIntrinsicHeight() * f17)) / 2;
                            b2.setBounds(w - intrinsicWidth, i42 - intrinsicHeight, w + intrinsicWidth, i42 + intrinsicHeight);
                            b2.draw(canvas4);
                        }
                    }
                    f6 = 2.0f;
                    f17 = gb2Var.s5;
                    int intrinsicWidth2 = ((int) (b2.getIntrinsicWidth() * f17)) / 2;
                    int intrinsicHeight2 = ((int) (b2.getIntrinsicHeight() * f17)) / 2;
                    b2.setBounds(w - intrinsicWidth2, i42 - intrinsicHeight2, w + intrinsicWidth2, i42 + intrinsicHeight2);
                    b2.draw(canvas4);
                }
            } else {
                f6 = 2.0f;
                f7 = 0.3f;
                i10 = 2;
                gb2Var.o5 = -1;
            }
            if (this.I == null || gb2Var.j6) {
                r12 = 0;
            } else {
                r12 = 0;
                int ceil = (int) Math.ceil(gb2Var.e3.getLineLeft(0));
                int i43 = gb2Var.g3;
                if (i43 == 0 && ceil == 0) {
                    f16 = ((int) Math.ceil(gb2Var.e3.getLineWidth(0))) + f5 + gl.L(7.0f) + gb2Var.getExtraTextX();
                } else {
                    if (i43 != 0) {
                        L2 = (i43 + f5) - gl.L(23.0f);
                        extraTextX = gb2Var.getExtraTextX();
                    } else {
                        L2 = (ceil + f5) - gl.L(23.0f);
                        extraTextX = gb2Var.getExtraTextX();
                    }
                    f16 = L2 - extraTextX;
                }
                if (gb2Var.c5 && this.C) {
                    jc0 jc0Var = this.I;
                    boolean z2 = gb2Var.b5;
                    float f28 = this.r;
                    if (z2) {
                        f28 = (f4 - f28) / f7;
                    }
                    jc0Var.setAlpha((int) (moe.a(f28, 0.0f, f4) * 255.0f));
                } else {
                    this.I.setAlpha(kk7.d4);
                }
                this.I.setBounds((int) f16, L13 - gl.L(1.0f), (int) (this.I.c.d.f.a + f16), gl.L(16.0f) + (L13 - gl.L(1.0f)));
                jc0 jc0Var2 = this.I;
                Paint paint = gb2Var.L6.c;
                jc0Var2.c(canvas4);
            }
        } else {
            f6 = 2.0f;
            r12 = 0;
            f7 = 0.3f;
            i10 = 2;
        }
        if (((gb2Var.X4 || gb2Var.W4 || gb2Var.Y4) && !gb2Var.Z4) || (poll2 = gb2Var.j5) == null || !poll2.quiz || poll2.close_period == 0 || !gb2Var.j6) {
            i11 = i9;
            i12 = i8;
            f8 = 13.0f;
            i13 = -1;
            j2 = j;
        } else {
            i12 = i8;
            long max = Math.max(0L, (gb2Var.j5.close_date * 1000) - ConnectionsManager.getInstance(gb2Var.a6).getCurrentTimeMillis());
            i11 = i9;
            if (this.z != null) {
                f15 = 1000.0f;
            } else {
                f15 = 1000.0f;
            }
            this.z = gl.h0((int) Math.ceil(max / f15), r12);
            this.A = (int) Math.ceil(bkb.S2.measureText(r6));
            this.y = max;
            if (max <= 0 && !gb2Var.X4) {
                if (gb2Var.Q5.w0 + 1000 < SystemClock.elapsedRealtime()) {
                    gb2Var.Q5.w0 = 0L;
                }
                gb2Var.eb.u2();
            }
            int L14 = (gb2Var.L6.getBounds().right - this.A) - gl.L(gb2Var.Q5.O3() ? 40.0f : 34.0f);
            if (max <= 5000) {
                bkb.S2.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.ga : bkb.fa));
            }
            if (this.B) {
                bkb.S2.setAlpha((int) ((1.0f - this.r) * 255.0f));
            }
            float f29 = f15;
            canvas4.drawText(this.z, L14, gl.L(11.0f) + L13, bkb.S2);
            bkb.Y1.setColor(bkb.S2.getColor());
            int w2 = de9.w(13.0f, this.A, L14);
            int L15 = gl.L(5.1f);
            int L16 = gl.L(6.0f) + L13;
            if (max <= 60000) {
                f8 = 13.0f;
                RectF rectF5 = rectF;
                rectF5.set(w2 - L15, L16 - L15, w2 + L15, L15 + L16);
                float min = (max / (Math.min(60, gb2Var.j5.close_period) * f29)) * (-360.0f);
                i13 = -1;
                canvas4.drawArc(rectF5, -90.0f, min, false, bkb.Y1);
                gb2Var.m5.a(min, gb2Var.Z4 ? 1.0f - this.r : 1.0f, canvas, bkb.Y1, rectF5);
                canvas4 = canvas;
                rectF = rectF5;
            } else {
                f8 = 13.0f;
                i13 = -1;
                canvas4.drawCircle(w2, L16, L15, bkb.Y1);
            }
            if (max > 60000 || this.H != 0.0f) {
                bkb.Y1.setAlpha((int) (this.H * 255.0f));
                float f30 = w2;
                canvas4.drawLine(f30 - (gl.L(2.1f) * this.H), L16 - gl.L(7.5f), (gl.L(2.1f) * this.H) + f30, L16 - gl.L(7.5f), bkb.Y1);
                float f31 = L16;
                canvas4 = canvas;
                canvas4.drawLine(f30, f31 - (gl.L(3.0f) * this.H), f30, f31, bkb.Y1);
                if (max <= 60000) {
                    j2 = j;
                    float f32 = this.H - (j2 / 180.0f);
                    this.H = f32;
                    if (f32 < 0.0f) {
                        this.H = 0.0f;
                    }
                    gb2Var.invalidate();
                }
            }
            j2 = j;
            gb2Var.invalidate();
        }
        if (drawableArr[r12] != null && ((i36 = iArr[r12]) == 1 || i36 == 3)) {
            if (i36 == 3) {
                canvas4.save();
                float f33 = gb2Var.s5;
                canvas4.scale(f33, f33, drawableArr[r12].getBounds().centerX(), drawableArr[r12].getBounds().centerY());
            }
            drawableArr[r12].draw(canvas4);
            if (iArr[r12] == 3) {
                canvas4.restore();
            }
        }
        boolean C4 = gb2Var.Q5.C4();
        TLRPC.Poll poll3 = gb2Var.j5;
        boolean z3 = (poll3 == null || !poll3.multiple_choice) ? r12 : true;
        boolean z4 = (C4 && gb2Var.Q5.q()) ? true : r12;
        boolean z5 = (gb2Var.W4 && !this.w && this.v) ? true : r12;
        if (!this.C || z5) {
            f9 = 255.0f;
        } else {
            boolean z6 = gb2Var.b5;
            float f34 = this.r;
            if (z6) {
                f34 = 1.0f - f34;
            }
            f9 = Math.min(f34 / f7, 1.0f) * 255.0f;
        }
        int i44 = (int) f9;
        int max2 = Math.max(gb2Var.S4, (int) r12);
        while (true) {
            int i45 = gb2Var.T4;
            if (i45 == i13) {
                i45 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (max2 > Math.min(i45, arrayList.size() - 1)) {
                break;
            }
            ArrayList arrayList4 = arrayList;
            fb2 fb2Var = (fb2) arrayList4.get(max2);
            fb2Var.a = (int) f5;
            int i46 = fb2Var.b;
            int i47 = fb2Var.c;
            if (fb2Var.A != null) {
                i46 = gl.U1(nb2Var.L1, fb2Var.C, i46);
                i47 = gl.U1(nb2Var.L1, fb2Var.D, i47);
            }
            int i48 = i47;
            TLRPC.TodoItem todoItem = fb2Var.t;
            if ((todoItem == null || todoItem.id != gb2Var.c6) && (((bArr = gb2Var.e6) == null || Arrays.equals(fb2Var.s.option, bArr)) && ((pollAnswer = fb2Var.s) == null || (bArr2 = pollAnswer.option) == null || !Arrays.equals(bArr2, gb2Var.d6)))) {
                canvas4.save();
                int i49 = i12;
                int p1 = bkb.p1(0.12f, i49);
                if (fb2Var.v != p1) {
                    ff0 ff0Var = fb2Var.w;
                    fb2Var.v = p1;
                    i18 = i44;
                    bkb.F1(ff0Var, p1, false);
                } else {
                    i18 = i44;
                }
                long j5 = j2;
                fb2Var.w.setBounds((int) (f5 - gl.L(8.0f)), (gb2Var.gb + i46) - gl.L(f8), (int) (f26 - gl.L(23.0f)), gl.L(f8) + gb2Var.gb + i46 + i48);
                fb2Var.w.draw(canvas4);
                canvas4.restore();
                wd8 wd8Var2 = fb2Var.x;
                if (wd8Var2 != null) {
                    i19 = i3;
                    i21 = i4;
                    wd8Var2.setBounds(i19, (gb2Var.gb + i46) - gl.L(f8), i21, gl.L(f8) + gb2Var.gb + i46 + i48);
                    i20 = i11;
                    fb2Var.x.k(i20);
                    wd8 wd8Var3 = fb2Var.x;
                    Paint paint2 = gb2Var.L6.c;
                    wd8Var3.c(canvas4);
                } else {
                    i19 = i3;
                    i20 = i11;
                    i21 = i4;
                }
                canvas4.save();
                fb2Var.m = gl.L(z4 ? 48.0f : 35.0f) + f5;
                fb2Var.n = gb2Var.gb + i46;
                canvas4.translate(gl.L(z4 ? 48.0f : 35.0f) + f5, i46 + gb2Var.gb);
                if (nb2Var.x0) {
                    canvas4.translate(0.0f, nb2Var.k0);
                }
                int alpha2 = bkb.O2.getAlpha();
                if (fb2Var.A != null) {
                    i22 = alpha2;
                    bkb.O2.setAlpha((int) (alpha2 * nb2Var.L1));
                } else {
                    i22 = alpha2;
                }
                canvas4.save();
                if (C4 && z4 && fb2Var.q != null && (checkBoxBase2 = gb2Var.f7[max2]) != null) {
                    float progress = checkBoxBase2.getProgress();
                    canvas4.translate(0.0f, (-gl.L(7.66f)) * progress);
                    fb2Var.n = ((-gl.L(7.66f)) * progress) + fb2Var.n;
                }
                if (max2 == gb2Var.y0 && gb2Var.u4.h(canvas4, 4)) {
                    gb2Var.invalidate();
                }
                if (fb2Var.o && (wd8Var = fb2Var.x) != null) {
                    canvas4.translate(-wd8Var.d(gl.L(7.0f)), 0.0f);
                }
                fb2Var.p.draw(canvas4);
                StaticLayout staticLayout4 = fb2Var.p;
                cm cmVar = fb2Var.r;
                if (fb2Var.A != null) {
                    int i50 = i20;
                    f12 = nb2Var.L1;
                    i23 = i50;
                } else {
                    i23 = i20;
                    f12 = 1.0f;
                }
                i24 = max2;
                i25 = i23;
                i26 = i21;
                f13 = f5;
                int i51 = i22;
                j3 = j5;
                arrayList2 = arrayList4;
                i27 = i19;
                i28 = i18;
                gm.drawAnimatedEmojis(canvas, staticLayout4, cmVar, 0.0f, null, 0.0f, 0.0f, 0.0f, f12, gb2Var.L1(1, staticLayout4.getPaint().getColor()));
                if (fb2Var.A != null) {
                    bkb.O2.setAlpha((int) ((1.0f - nb2Var.L1) * i51));
                    fb2Var.A.draw(canvas);
                    StaticLayout staticLayout5 = fb2Var.A;
                    gm.drawAnimatedEmojis(canvas, staticLayout5, fb2Var.B, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f - nb2Var.L1, gb2Var.L1(1, staticLayout5.getPaint().getColor()));
                    bkb.O2.setAlpha(i51);
                }
                canvas.restore();
                if (C4 && z4 && fb2Var.q != null && (checkBoxBase = gb2Var.f7[i24]) != null) {
                    float progress2 = checkBoxBase.getProgress();
                    if (progress2 > 0.0f) {
                        tgb tgbVar5 = fb2Var.q;
                        tgbVar5.p = f25 - gl.L(8.0f);
                        tgbVar5.c(0.0f, (fb2Var.q.h() / f6) + (fb2Var.p.getHeight() - gl.L(6.0f)), progress2, i49, canvas);
                        i29 = i49;
                        canvas2 = canvas;
                        bkb.O2.setAlpha(i51);
                        if (!C4 || ((!gb2Var.W4 || (!this.w && this.v)) && !gb2Var.X4 && !gb2Var.Y4 && ((!this.x || (this.v && !this.w)) && (!this.C || z5)))) {
                            rectF2 = rectF;
                            i30 = 2;
                        } else {
                            TLRPC.Poll poll4 = gb2Var.j5;
                            if (poll4 == null || !poll4.quiz) {
                                bkb.R1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.pc : bkb.ne));
                            } else {
                                boolean z7 = fb2Var.l;
                                k27 k27Var = gb2Var.Q5;
                                int i52 = z7 ? k27Var.O3() ? bkb.ea : bkb.da : k27Var.O3() ? bkb.ga : bkb.fa;
                                if (!gb2Var.L6.l() || bkb.d1(i52)) {
                                    bkb.R1.setColor(gb2Var.a2(i52));
                                } else {
                                    bkb.R1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.pc : bkb.ne));
                                }
                            }
                            if (this.C && !z5) {
                                float f35 = i28;
                                bkb.L2.setAlpha((int) ((bkb.L2.getAlpha() / 255.0f) * f35));
                                bkb.R1.setAlpha((int) (f35 * (bkb.R1.getAlpha() / 255.0f)));
                            }
                            boolean z8 = fb2Var.i || fb2Var.k || ((poll = gb2Var.j5) != null && poll.quiz && fb2Var.l && (gb2Var.W4 || gb2Var.X4 || gb2Var.Y4 || (this.x && (!this.v || this.w))));
                            int i53 = fb2Var.f;
                            String format = String.format("%d%%", Integer.valueOf(moe.b((int) Math.ceil(((fb2Var.d - i53) * this.r) + i53), 0, 100)));
                            float ceil2 = (-gl.L(6.5f)) - ((int) Math.ceil(bkb.L2.measureText(format)));
                            float L17 = gl.L(14.0f);
                            if (!z8 || (staticLayout = fb2Var.p) == null) {
                                i34 = 2;
                            } else {
                                i34 = 2;
                                if (staticLayout.getLineCount() < 2) {
                                    f14 = gb2Var.U4;
                                    canvas2.drawText(format, ceil2, L17 + f14, bkb.L2);
                                    int L18 = gb2Var.b7 - gl.L(76.0f);
                                    float f36 = fb2Var.h;
                                    float f37 = ((fb2Var.g - f36) * this.r) + f36;
                                    if (z5) {
                                        int color3 = bkb.R1.getColor();
                                        int alpha3 = Color.alpha(color3);
                                        float L19 = L18 - (this.u ? gl.L(37.33f) : 0);
                                        i35 = i25;
                                        bkb.R1.setColor(bm2.o(i35, (alpha3 << 4) / kk7.d4));
                                        float f38 = f37 * L19;
                                        i30 = i34;
                                        rectF2 = rectF;
                                        rectF2.set(Math.max(f38 - gl.L(f6), 0.0f), gl.L(6.0f) + i48, L19, gl.L(11.0f) + i48);
                                        canvas2.drawRoundRect(rectF2, gl.L(f6), gl.L(f6), bkb.R1);
                                        bkb.R1.setColor(color3);
                                        rectF2.set(0.0f, gl.L(6.0f) + i48, f38, gl.L(11.0f) + i48);
                                        canvas2.drawRoundRect(rectF2, gl.L(f6), gl.L(f6), bkb.R1);
                                    } else {
                                        i30 = i34;
                                        rectF2 = rectF;
                                        i35 = i25;
                                    }
                                    if (z8) {
                                        i25 = i35;
                                    } else {
                                        float L20 = rectF2.left - gl.L(15.5f);
                                        float centerY = rectF2.centerY() + gb2Var.U4;
                                        float L21 = gl.L(7.0f);
                                        float L22 = gl.L(z3 ? 4.5f : 7.0f);
                                        float f39 = L20 - L21;
                                        float f40 = centerY - L21;
                                        float f41 = L20 + L21;
                                        float f42 = centerY + L21;
                                        canvas2.saveLayerAlpha(f39, f40, f41, f42, i28);
                                        TLRPC.Poll poll5 = gb2Var.j5;
                                        Drawable drawable2 = (poll5 == null || !poll5.quiz || fb2Var.l) ? bkb.J4[gb2Var.Q5.O3() ? 1 : 0] : bkb.K4[gb2Var.Q5.O3() ? 1 : 0];
                                        hf0.u(drawable2, L20 - (drawable2.getIntrinsicWidth() / 2), centerY - (drawable2.getIntrinsicHeight() / 2));
                                        drawable2.draw(canvas2);
                                        if (gb2Var.qd == null) {
                                            Paint paint3 = new Paint(1);
                                            gb2Var.qd = paint3;
                                            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                                        }
                                        gb2Var.qd.setColor(bkb.R1.getColor());
                                        i25 = i35;
                                        i28 = i28;
                                        canvas2.drawRoundRect(f39, f40, f41, f42, L22, L22, gb2Var.qd);
                                        canvas.restore();
                                    }
                                }
                            }
                            f14 = 0.0f;
                            canvas2.drawText(format, ceil2, L17 + f14, bkb.L2);
                            int L182 = gb2Var.b7 - gl.L(76.0f);
                            float f362 = fb2Var.h;
                            float f372 = ((fb2Var.g - f362) * this.r) + f362;
                            if (z5) {
                            }
                            if (z8) {
                            }
                        }
                        if (!C4 || (!(gb2Var.W4 || gb2Var.X4 || gb2Var.Y4 || (this.x && (!this.v || this.w))) || z5 || this.C)) {
                            if (gb2Var.A2()) {
                                bkb.Z1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.qc : bkb.oe));
                            } else {
                                bkb.Z1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.rc : bkb.pe));
                            }
                            if (this.C && !z5) {
                                bkb.Z1.setAlpha((int) ((255 - i28) * (bkb.Z1.getAlpha() / 255.0f)));
                            }
                            canvas4 = canvas;
                            canvas4.drawLine(-gl.L(f6), gl.L(f8) + i48, f25 - gl.L(z4 ? 71.0f : 58.0f), gl.L(f8) + i48, bkb.Z1);
                            if (C4) {
                                if (gb2Var.Z4) {
                                    i31 = i24;
                                    if (i31 != gb2Var.d5 || z5) {
                                        rectF = rectF2;
                                        if (this.x || (this.v && !this.w)) {
                                            if (gb2Var.Q5.O3()) {
                                                bkb.W1.setColor(gb2Var.a2(gb2Var.A2() ? bkb.Kb : bkb.Jb));
                                            } else {
                                                bkb.W1.setColor(gb2Var.a2(gb2Var.A2() ? bkb.rd : bkb.qd));
                                            }
                                            if (this.C && !z5) {
                                                bkb.W1.setAlpha((int) ((255 - i28) * (bkb.W1.getAlpha() / 255.0f)));
                                            }
                                            float f43 = -gl.L(z4 ? 35.0f : 22.0f);
                                            float L23 = gl.L(9.0f);
                                            float L24 = gl.L(z3 ? 8.0f : 8.5f);
                                            if (z3) {
                                                i24 = i31;
                                                canvas.drawRoundRect(f43 - L24, L23 - L24, f43 + L24, L24 + L23, gl.L(4.0f), gl.L(4.0f), bkb.W1);
                                                canvas3 = canvas;
                                            } else {
                                                i24 = i31;
                                                canvas3 = canvas;
                                                canvas3.drawCircle(f43, L23, L24, bkb.W1);
                                                if (!z5) {
                                                }
                                            }
                                            int L25 = gl.L(z3 ? 8.0f : 8.5f);
                                            i32 = bkb.j7;
                                            if (gb2Var.Q5.O3() && gb2Var.a2(i32) == -1) {
                                                i32 = bkb.qb;
                                            }
                                            gb2Var.f7[i24].h(-1, gb2Var.Q5.O3() ? bkb.pc : bkb.ne, i32);
                                            i33 = L25 / 2;
                                            gb2Var.f7[i24].e((-gl.L(z4 ? 35.0f : 22.0f)) - i33, gl.L(9.0f) - i33, L25, L25);
                                            gb2Var.f7[i24].i(z3 ? gl.L(5.0f) : 0.0f);
                                            gb2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                                            gb2Var.f7[i24].a(canvas3);
                                            if (fb2Var.t != null && fb2Var.z != null) {
                                                if (this.J == null) {
                                                    Paint paint4 = new Paint(1);
                                                    this.J = paint4;
                                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                }
                                                float progress3 = gb2Var.f7[i24].getProgress();
                                                float R1 = gl.R1(0.5f, 1.0f, progress3);
                                                fb2Var.z.i0(gl.L(8.0f) + ((-gl.L(!z4 ? 35.0f : 22.0f)) - i33), gl.L(9.0f) - (gl.L(20.0f) / 2), gl.L(20.0f), gl.L(20.0f));
                                                ImageReceiver imageReceiver = fb2Var.z;
                                                canvas4 = canvas;
                                                canvas4.saveLayerAlpha(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), fb2Var.z.x(), kk7.d4, 31);
                                                canvas4.save();
                                                ImageReceiver imageReceiver2 = fb2Var.z;
                                                canvas4.scale(R1, R1, imageReceiver2.L0, imageReceiver2.s());
                                                fb2Var.z.setAlpha(progress3);
                                                fb2Var.z.g(canvas4);
                                                canvas4.restore();
                                                canvas4.drawCircle(-gl.L(z4 ? 35.0f : 22.0f), gl.L(9.0f), gl.L(11.0f), this.J);
                                                canvas4.restore();
                                                canvas4.restore();
                                            }
                                            canvas4 = canvas3;
                                            canvas4.restore();
                                        }
                                        canvas4 = canvas;
                                        i24 = i31;
                                        canvas4.restore();
                                    } else {
                                        bkb.W1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.pc : bkb.ne));
                                        if (this.C && !z5) {
                                            bkb.W1.setAlpha((int) ((255 - i28) * (bkb.W1.getAlpha() / 255.0f)));
                                        }
                                        rectF2.set((-gl.L(z4 ? 35.0f : 22.0f)) - gl.L(8.5f), gl.L(9.0f) - gl.L(8.5f), gl.L(8.5f) + (-gl.L(23.0f)), gl.L(8.5f) + gl.L(9.0f));
                                        RectF rectF6 = rectF2;
                                        canvas4.drawArc(rectF6, this.E, gb2Var.e5, false, bkb.W1);
                                        rectF = rectF6;
                                        canvas4 = canvas;
                                        i24 = i31;
                                        canvas4.restore();
                                    }
                                }
                            } else if (!z4) {
                                if (fb2Var.i) {
                                    if (this.L == null) {
                                        Path path = new Path();
                                        this.L = path;
                                        path.moveTo(-gl.L(3.66f), gl.L(0.16f));
                                        this.L.lineTo(gl.L(-1.0f), gl.L(3.0f));
                                        this.L.lineTo(gl.L(3.66f), gl.L(-3.0f));
                                    }
                                    if (this.K == null) {
                                        Paint paint5 = new Paint(1);
                                        this.K = paint5;
                                        paint5.setStyle(Paint.Style.STROKE);
                                        this.K.setStrokeCap(Paint.Cap.ROUND);
                                        this.K.setStrokeJoin(Paint.Join.ROUND);
                                    }
                                    this.K.setStrokeWidth(gl.L(1.833f));
                                    this.K.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.pc : bkb.ne));
                                    canvas4.save();
                                    canvas4.translate(-gl.L(z4 ? 35.0f : 22.0f), gl.L(9.0f));
                                    canvas4.drawPath(this.L, this.K);
                                    canvas4.restore();
                                } else {
                                    bkb.Z1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.pc : bkb.ne));
                                    canvas4.drawCircle(-gl.L(z4 ? 35.0f : 22.0f), gl.L(9.0f), gl.L(2.5f), bkb.Z1);
                                }
                            }
                            rectF = rectF2;
                            i31 = i24;
                            if (this.x) {
                            }
                            if (gb2Var.Q5.O3()) {
                            }
                            if (this.C) {
                                bkb.W1.setAlpha((int) ((255 - i28) * (bkb.W1.getAlpha() / 255.0f)));
                            }
                            float f432 = -gl.L(z4 ? 35.0f : 22.0f);
                            float L232 = gl.L(9.0f);
                            float L242 = gl.L(z3 ? 8.0f : 8.5f);
                            if (z3) {
                            }
                            int L252 = gl.L(z3 ? 8.0f : 8.5f);
                            i32 = bkb.j7;
                            if (gb2Var.Q5.O3()) {
                                i32 = bkb.qb;
                            }
                            gb2Var.f7[i24].h(-1, gb2Var.Q5.O3() ? bkb.pc : bkb.ne, i32);
                            i33 = L252 / 2;
                            gb2Var.f7[i24].e((-gl.L(z4 ? 35.0f : 22.0f)) - i33, gl.L(9.0f) - i33, L252, L252);
                            gb2Var.f7[i24].i(z3 ? gl.L(5.0f) : 0.0f);
                            gb2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                            gb2Var.f7[i24].a(canvas3);
                            if (fb2Var.t != null) {
                                if (this.J == null) {
                                }
                                float progress32 = gb2Var.f7[i24].getProgress();
                                float R12 = gl.R1(0.5f, 1.0f, progress32);
                                fb2Var.z.i0(gl.L(8.0f) + ((-gl.L(!z4 ? 35.0f : 22.0f)) - i33), gl.L(9.0f) - (gl.L(20.0f) / 2), gl.L(20.0f), gl.L(20.0f));
                                ImageReceiver imageReceiver3 = fb2Var.z;
                                canvas4 = canvas;
                                canvas4.saveLayerAlpha(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.w(), fb2Var.z.x(), kk7.d4, 31);
                                canvas4.save();
                                ImageReceiver imageReceiver22 = fb2Var.z;
                                canvas4.scale(R12, R12, imageReceiver22.L0, imageReceiver22.s());
                                fb2Var.z.setAlpha(progress32);
                                fb2Var.z.g(canvas4);
                                canvas4.restore();
                                canvas4.drawCircle(-gl.L(z4 ? 35.0f : 22.0f), gl.L(9.0f), gl.L(11.0f), this.J);
                                canvas4.restore();
                                canvas4.restore();
                            }
                            canvas4 = canvas3;
                            canvas4.restore();
                        } else {
                            canvas4 = canvas;
                        }
                        rectF = rectF2;
                        canvas4.restore();
                    }
                }
                canvas2 = canvas;
                i29 = i49;
                bkb.O2.setAlpha(i51);
                if (C4) {
                }
                rectF2 = rectF;
                i30 = 2;
                if (C4) {
                }
                if (gb2Var.A2()) {
                }
                if (this.C) {
                    bkb.Z1.setAlpha((int) ((255 - i28) * (bkb.Z1.getAlpha() / 255.0f)));
                }
                canvas4 = canvas;
                canvas4.drawLine(-gl.L(f6), gl.L(f8) + i48, f25 - gl.L(z4 ? 71.0f : 58.0f), gl.L(f8) + i48, bkb.Z1);
                if (C4) {
                }
                rectF = rectF2;
                i31 = i24;
                if (this.x) {
                }
                if (gb2Var.Q5.O3()) {
                }
                if (this.C) {
                }
                float f4322 = -gl.L(z4 ? 35.0f : 22.0f);
                float L2322 = gl.L(9.0f);
                float L2422 = gl.L(z3 ? 8.0f : 8.5f);
                if (z3) {
                }
                int L2522 = gl.L(z3 ? 8.0f : 8.5f);
                i32 = bkb.j7;
                if (gb2Var.Q5.O3()) {
                }
                gb2Var.f7[i24].h(-1, gb2Var.Q5.O3() ? bkb.pc : bkb.ne, i32);
                i33 = L2522 / 2;
                gb2Var.f7[i24].e((-gl.L(z4 ? 35.0f : 22.0f)) - i33, gl.L(9.0f) - i33, L2522, L2522);
                gb2Var.f7[i24].i(z3 ? gl.L(5.0f) : 0.0f);
                gb2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                gb2Var.f7[i24].a(canvas3);
                if (fb2Var.t != null) {
                }
                canvas4 = canvas3;
                canvas4.restore();
            } else {
                i28 = i44;
                j3 = j2;
                i24 = max2;
                arrayList2 = arrayList4;
                f13 = f5;
                i30 = i10;
                i29 = i12;
                i25 = i11;
                i26 = i4;
                i27 = i3;
            }
            max2 = i24 + 1;
            i12 = i29;
            i44 = i28;
            f5 = f13;
            i3 = i27;
            i11 = i25;
            arrayList = arrayList2;
            j2 = j3;
            i4 = i26;
            i10 = i30;
            i13 = -1;
        }
        int i54 = i44;
        long j6 = j2;
        float f44 = f5;
        ArrayList arrayList5 = arrayList;
        int i55 = i10;
        int i56 = i4;
        int i57 = i3;
        if (arrayList5.isEmpty()) {
            i14 = 0;
        } else {
            fb2 fb2Var2 = (fb2) b00.f(1, arrayList5);
            int i58 = fb2Var2.b;
            int i59 = fb2Var2.c;
            if (fb2Var2.A != null) {
                i58 = gl.U1(nb2Var.L1, fb2Var2.C, i58);
                i59 = gl.U1(nb2Var.L1, fb2Var2.D, i59);
            }
            i14 = gb2Var.gb + i58 + i59;
        }
        if (this.s) {
            i15 = nb2Var.V2 ? gl.U1(nb2Var.L1, nb2Var.X2, gb2Var.Q1) : gb2Var.Q1;
        } else {
            i15 = 0;
        }
        if (!this.s || this.l == null) {
            i16 = i57;
            i17 = i56;
        } else {
            int L26 = gl.L(f8) + i14;
            int L27 = gl.L(44.33f);
            id8 id8Var = this.l;
            TLRPC.Poll poll6 = gb2Var.j5;
            id8Var.e(((poll6 == null || poll6.public_voters || poll6.multiple_choice) ? bkb.H2 : bkb.E2).getColor());
            i16 = i57;
            i17 = i56;
            this.l.setBounds(i16, L26, i17, L27 + L26);
            this.l.draw(canvas4);
            if (gb2Var.eb != null) {
                canvas4.save();
                canvas4.translate(i16, L26);
                gb2Var.eb.x1(gb2Var);
                canvas4.restore();
            }
            if ((!gb2Var.W4 && !gb2Var.X4 && !gb2Var.Y4) || z5 || this.C) {
                int color4 = bkb.Z1.getColor();
                if (gb2Var.A2()) {
                    bkb.Z1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.rc : bkb.pe));
                } else {
                    bkb.Z1.setColor(gb2Var.a2(gb2Var.Q5.O3() ? bkb.qc : bkb.oe));
                }
                if (this.C && !z5) {
                    bkb.Z1.setAlpha((int) ((255 - i54) * (bkb.Z1.getAlpha() / 255.0f)));
                }
                float f45 = L26 + i15;
                canvas4.drawLine((f44 + gl.L(35.0f)) - gl.L(f6), f45, ((f44 + gl.L(35.0f)) + f25) - gl.L(58.0f), f45, bkb.Z1);
                bkb.Z1.setColor(color4);
            }
        }
        if (this.s) {
            i14 += i15;
        }
        me8 me8Var2 = this.k;
        float b = me8Var2 != null ? me8Var2.b() : 0.0f;
        float f46 = (C4 || (gnVar = gb2Var.z3) == null || !gnVar.isVisible()) ? 0.0f : 1.0f;
        boolean z9 = gb2Var.u2;
        float f47 = z9 ? 1.0f : 0.0f;
        if (z9) {
            int L28 = gl.L((gb2Var.Q5.O3() || gb2Var.C6 || gb2Var.K) ? f6 : 8.0f) + gb2Var.getCurrentBackgroundLeft();
            int L29 = gl.L(f8) + i14;
            if (gb2Var.Q5.O3()) {
                bkb.L2.setColor(gb2Var.a2(bkb.Nb));
            } else {
                bkb.L2.setColor(gb2Var.a2(bkb.Ad));
            }
            f10 = b;
            gb2Var.M2.set(L28, L29, gb2Var.D2 + L28, gl.L(44.0f) + L29);
            Drawable drawable3 = drawableArr[0];
            if (drawable3 != null && iArr[0] == i55) {
                drawable3.setBounds(L28 - gl.L(this.b ? 6.0f : 0.0f), L29, gb2Var.D2 + L28, gl.L(44.0f) + L29);
                drawableArr[0].draw(canvas4);
            }
            if (gb2Var.Q5.S3() && (me8Var = this.k) != null) {
                me8Var.c(gb2Var.a2(gb2Var.Q5.O3() ? bkb.Nb : bkb.Ad));
                this.k.setBounds(i16, L29, i17, gl.L(44.0f) + L29);
                this.k.d((-gl.L(7.0f)) * f46);
                this.k.draw(canvas4);
            } else if (gb2Var.r2 != null) {
                canvas4.save();
                canvas4.translate(L28 + gb2Var.B2, gl.L(14.5f) + L29);
                gb2Var.r2.draw(canvas4);
                canvas4.restore();
            }
        } else {
            f10 = b;
            if (gb2Var.y3 != null) {
                float L30 = ((1.0f - f46) * gl.L(6.0f)) + gl.L(25.0f) + i14;
                canvas4.save();
                if (nb2Var.x0) {
                    canvas4.translate(((gb2Var.getBackgroundDrawableRight() + nb2Var.i0) + (gb2Var.getBackgroundDrawableLeft() + nb2Var.h0)) / f6, L30);
                } else {
                    canvas4.translate((gb2Var.getBackgroundDrawableRight() + gb2Var.getBackgroundDrawableLeft()) / f6, L30);
                }
                gb2Var.y3.setBounds(-1, -1, 1, 1);
                gn gnVar2 = gb2Var.y3;
                TLRPC.Poll poll7 = gb2Var.j5;
                gnVar2.u(((poll7 == null || poll7.public_voters || poll7.multiple_choice) ? bkb.H2 : bkb.E2).getColor());
                gb2Var.y3.draw(canvas4);
                canvas4.restore();
            }
        }
        if (C4 || gb2Var.z3 == null) {
            f11 = 1.0f;
        } else {
            float L31 = (gl.L(3.0f) * f47) + tb4.A(1.0f, f46, gl.L(6.0f), gl.L(41.0f) + i14);
            canvas4.save();
            if (nb2Var.x0) {
                canvas4.translate(((gb2Var.getBackgroundDrawableRight() + nb2Var.i0) + (gb2Var.getBackgroundDrawableLeft() + nb2Var.h0)) / f6, L31);
            } else {
                canvas4.translate((i16 + i17) / f6, L31);
            }
            gb2Var.z3.setBounds(-1, -1, 1, 1);
            gn gnVar3 = gb2Var.z3;
            TLRPC.Poll poll8 = gb2Var.j5;
            gnVar3.u(((poll8 == null || poll8.public_voters || poll8.multiple_choice) ? bkb.H2 : bkb.E2).getColor());
            f11 = 1.0f;
            kq3.b(canvas4, gb2Var.z3, 1.0f - f10);
            canvas4.restore();
        }
        j(j6);
        canvas4.restore();
        if (f10 >= f11) {
            gb2Var.c0(true);
        }
        zx8 zx8Var = gb2Var.o3;
        if (zx8Var != null) {
            if ((zx8Var.e || zx8Var.f) && (m17Var = gb2Var.L6) != null) {
                canvas4.save();
                canvas4.clipPath(m17Var.n());
                Paint paint6 = gb2Var.o3.i;
                k27 k27Var2 = gb2Var.Q5;
                int a24 = gb2Var.a2((k27Var2 == null || !k27Var2.O3() || gb2Var.Q5.t1) ? bkb.Kd : bkb.Qb);
                bkb.h1();
                paint6.setColor(bkb.p1(0.2f, a24));
                gb2Var.o3.c(canvas4, gb2Var.o0, gb2Var.u0, m17Var.getBounds(), gb2Var.R1(true));
                canvas.restore();
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.a.Q4;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((fb2) arrayList.get(i)).w.setState(StateSet.NOTHING);
            }
        }
        id8 id8Var = this.l;
        if (id8Var != null) {
            id8Var.a.setState(StateSet.NOTHING);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0aae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(k27 k27Var, boolean z) {
        boolean z2;
        float f;
        String L0;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        CharSequence charSequence;
        float f2;
        boolean z8;
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        i19 i19Var;
        int i2;
        int i3;
        boolean z10;
        int i4;
        CharSequence charSequence2;
        int i5;
        int i6;
        Object obj;
        Object obj2;
        int i7;
        fb2 fb2Var;
        Boolean bool;
        ff0 Y;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        CharSequence charSequence3;
        int L;
        int i8;
        i19 i19Var2;
        ArrayList arrayList3;
        Object obj3;
        Object obj4;
        int i9;
        TLRPC.PollAnswer pollAnswer;
        boolean z11;
        boolean z12;
        CharSequence charSequence4;
        byte[] bArr2;
        int i10;
        CharSequence charSequence5;
        int i11;
        fb2 fb2Var2;
        int i12;
        float f3;
        boolean z13;
        ArrayList arrayList4;
        int i13;
        boolean contains;
        int i14;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        TLRPC.Message message;
        y0c y0cVar;
        TLRPC.PollResults pollResults;
        CharSequence ellipsize;
        gn gnVar;
        int currentTime;
        int i17;
        TLRPC.Message message2;
        y0c y0cVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String L02;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i18;
        boolean z17;
        int i19;
        k27 k27Var2 = k27Var;
        gb2 gb2Var = this.a;
        i19 i19Var3 = gb2Var.O;
        ArrayList arrayList5 = gb2Var.Q4;
        int i20 = gb2Var.a6;
        if (gb2Var.m5 == null) {
            gb2Var.m5 = new tob();
        }
        gb2Var.Y4 = false;
        gb2Var.B0(0);
        gb2Var.v9 = true;
        gb2Var.E9 = !gb2Var.u6;
        gb2Var.O1 = false;
        int min = Math.min(gl.L(500.0f), k27Var2.l1());
        gb2Var.b7 = gl.L(31.0f) + min;
        TLRPC.MessageMedia n1 = k27.n1(k27Var2.k);
        boolean z18 = n1 instanceof TLRPC.TL_messageMediaPoll;
        if (z18) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1;
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            boolean z19 = poll.quiz;
            z5 = poll.public_voters;
            boolean z20 = poll.multiple_choice;
            int i21 = tL_messageMediaPoll.results.total_voters;
            this.H = poll.close_date - ConnectionsManager.getInstance(i20).getCurrentTime() < 60 ? 0.0f : 1.0f;
            TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
            boolean z21 = poll2.closed;
            gb2Var.X4 = z21;
            z2 = z18;
            gb2Var.Y4 = k27Var2.M0;
            this.v = poll2.hide_results_until_close;
            TLRPC.TL_textWithEntities tL_textWithEntities4 = poll2.question;
            if (z21) {
                L02 = k96.L0(2131750678);
            } else {
                boolean z22 = poll2.quiz;
                boolean z23 = poll2.public_voters;
                L02 = z22 ? k96.L0(z23 ? 2131746252 : 2131754245) : z23 ? k96.L0(2131746395) : k96.L0(2131754246);
            }
            L0 = L02;
            gb2Var.j5 = tL_messageMediaPoll.poll;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            gb2Var.k5 = pollResults2.results;
            gb2Var.l5 = pollResults2.total_voters;
            CharSequence charSequence6 = k27Var2.A;
            this.d = charSequence6;
            if (charSequence6 == null && !TextUtils.isEmpty(pollResults2.solution)) {
                k27Var2.l0();
                this.d = k27Var2.A;
            }
            if (this.d != null) {
                if (this.h == null) {
                    this.h = gb2Var.getContext().getResources().getDrawable(R.drawable.msg_close).mutate();
                }
                int L2 = gb2Var.b7 - gl.L(38.0f);
                this.e = L2 - gl.L(18.0f);
                this.f = 0;
                TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
                if (pollResults3 == null || pollResults3.solution_media == null) {
                    tL_textWithEntities3 = tL_textWithEntities4;
                    i18 = i21;
                    i19 = L2;
                    z17 = z19;
                    z6 = z20;
                    f = 1.0f;
                } else {
                    if (this.n == null) {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i18 = i21;
                        this.n = new yd8(i20, gb2Var, gb2Var.cc, true);
                    } else {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i18 = i21;
                    }
                    z17 = z19;
                    i19 = L2;
                    z6 = z20;
                    f = 1.0f;
                    this.n.o(k27Var2, tL_messageMediaPoll.results.solution_media, k27Var, i19, ud8.c(-3, k27Var2.k), !z);
                    yd8 yd8Var = this.n;
                    if (yd8Var.T) {
                        this.f = yd8Var.g(i19);
                    }
                    if (gb2Var.O0) {
                        this.n.a();
                    }
                }
                this.c = new StaticLayout(TextUtils.ellipsize(k96.L0(2131746253), bkb.X2, min - gl.L(30.0f), TextUtils.TruncateAt.END), bkb.X2, min - gl.L(30.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                i27 i27Var = new i27(k27Var2, this.d, bkb.Z2, i19 - gl.L(11.0f));
                gb2Var.q3 = i27Var;
                int L3 = gl.L(37.0f) + i27Var.b();
                int i22 = this.f;
                this.g = L3 + (i22 > 0 ? i22 + gl.L(14.0f) : 0);
                z3 = false;
                gb2Var.Qa = gm.update(0, (View) gb2Var, false, gb2Var.Qa, (ArrayList<h27>) gb2Var.q3.e);
            } else {
                tL_textWithEntities3 = tL_textWithEntities4;
                i18 = i21;
                z17 = z19;
                z6 = z20;
                z3 = false;
                f = 1.0f;
            }
            tL_textWithEntities = tL_textWithEntities3;
            i = i18;
            z4 = z17;
        } else {
            z2 = z18;
            f = 1.0f;
            this.H = 1.0f;
            gb2Var.X4 = false;
            this.v = false;
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) n1).todo;
            TLRPC.TL_textWithEntities tL_textWithEntities5 = todoList.title;
            L0 = k96.L0((!todoList.others_can_complete || k27Var2.A0() == y6c.h(i20).e()) ? 2131748276 : 2131748396);
            tL_textWithEntities = tL_textWithEntities5;
            i = 0;
            z3 = true;
            z4 = false;
            z5 = true;
            z6 = true;
        }
        String str = L0;
        if (k27Var2.L2 && (message2 = k27Var2.k) != null && (y0cVar2 = message2.translatedPoll) != null && (tL_textWithEntities2 = y0cVar2.a) != null) {
            tL_textWithEntities = tL_textWithEntities2;
        }
        this.s = false;
        this.t = false;
        this.u = false;
        gb2Var.W4 = k27Var2.U4();
        this.w = k27Var2.E2();
        float f4 = f;
        this.x = fod.a(ye8.a(k27Var2), 7);
        if (gb2Var.W4) {
            k27Var2.x1.clear();
        }
        boolean z24 = z3;
        CharSequence l = vu3.l(new SpannableStringBuilder(tL_textWithEntities.text), bkb.N2.getFontMetricsInt(), false);
        ArrayList<TLRPC.MessageEntity> arrayList6 = tL_textWithEntities.entities;
        if (arrayList6 != null) {
            z7 = z4;
            Spannable A5 = k27.A5(l, arrayList6, bkb.N2.getFontMetricsInt(), true);
            k27.a(A5, tL_textWithEntities.entities, gb2Var.Q5.O3(), false, false);
            charSequence = A5;
        } else {
            z7 = z4;
            charSequence = l;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, bkb.N2, (gl.L(2.0f) + min) - (gb2Var.getExtraTextX() << 1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        gb2Var.o2 = staticLayout;
        gb2Var.Pa = gm.update(0, (View) gb2Var, false, gb2Var.Pa, staticLayout);
        StaticLayout staticLayout2 = gb2Var.o2;
        if (staticLayout2 != null) {
            int lineCount = staticLayout2.getLineCount();
            for (int i23 = 0; i23 < lineCount; i23++) {
                f2 = 0.0f;
                if (gb2Var.o2.getLineLeft(i23) > 0.0f) {
                    z8 = true;
                    break;
                }
            }
        }
        f2 = 0.0f;
        z8 = false;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(str, bkb.S2, min, truncateAt), bkb.S2, (gl.L(2.0f) + min) - (gb2Var.getExtraTextX() << 1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        gb2Var.e3 = staticLayout3;
        if (staticLayout3.getLineCount() > 0) {
            boolean z25 = k96.a0;
            if (!z8) {
                i17 = 0;
                if (z25) {
                    gb2Var.g3 = -((int) Math.ceil(gb2Var.e3.getLineLeft(0)));
                }
                gb2Var.g3 = i17;
            } else if (z25) {
                i17 = 0;
                gb2Var.g3 = i17;
            } else {
                gb2Var.g3 = (int) Math.ceil(r7 - gb2Var.e3.getLineWidth(0));
            }
        }
        int L4 = min - gl.L(k27Var2.O3() ? 28.0f : 8.0f);
        float f5 = f2;
        if (gb2Var.j6) {
            z9 = z5;
        } else {
            TextPaint textPaint = (z5 || z6) ? bkb.H2 : bkb.E2;
            if (z24) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) n1;
                ellipsize = (gb2Var.Q5.O3() || gb2Var.Q5.A0() < 0 || tL_messageMediaToDo2.todo.others_can_complete) ? k96.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompleted", Integer.valueOf(k27.z0(tL_messageMediaToDo2))) : k96.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompletedBy", Integer.valueOf(k27.z0(tL_messageMediaToDo2)), cf3.k(y6c.t0, gb2Var.Q5.Z0()));
            } else if (z7) {
                ellipsize = TextUtils.ellipsize(i == 0 ? k96.L0(2131747937) : k96.G(i, "Answer", new Object[0]), textPaint, L4, truncateAt);
            } else {
                ellipsize = TextUtils.ellipsize(i == 0 ? k96.L0(2131747938) : k96.G(i, "Vote", new Object[0]), textPaint, L4, truncateAt);
            }
            if (!gb2Var.X4 && z2) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) n1;
                int i24 = tL_messageMediaPoll2.poll.close_date;
                if (i24 > 0 && (currentTime = i24 - ConnectionsManager.getInstance(i20).getCurrentTime()) > 0) {
                    TLRPC.Poll poll3 = tL_messageMediaPoll2.poll;
                    boolean z26 = poll3.hide_results_until_close && !poll3.creator;
                    hx2 hx2Var = this.j;
                    if (hx2Var == null) {
                        hx2Var = new hx2(new l41((byte) 3, this, z26));
                        this.j = hx2Var;
                    }
                    z9 = z5;
                    hx2Var.a(currentTime);
                    gn gnVar2 = gb2Var.z3;
                    if (gnVar2 == null) {
                        gn gnVar3 = new gn(false, true, true);
                        gb2Var.z3 = gnVar3;
                        gnVar3.setCallback(gb2Var);
                        gnVar2 = gb2Var.z3;
                        gnVar2.b = 17;
                        gnVar2.N = gl.q.x;
                    }
                    gnVar2.w(gl.L(11.0f));
                    gb2Var.z3.u(((z9 || z6) ? bkb.H2 : bkb.E2).getColor());
                    gb2Var.z3.t(k96.M(currentTime, z26), !z, true);
                    gnVar = gb2Var.y3;
                    if (gnVar == null) {
                        gn gnVar4 = new gn(false, true, true);
                        gb2Var.y3 = gnVar4;
                        gnVar4.setCallback(gb2Var);
                        gnVar = gb2Var.y3;
                        gnVar.b = 17;
                        gnVar.N = gl.q.x;
                    }
                    gnVar.w(gl.L(13.0f));
                    gb2Var.y3.u(((!z9 || z6) ? bkb.H2 : bkb.E2).getColor());
                    gb2Var.y3.t(ellipsize, !z, true);
                    gb2Var.x3 = null;
                }
            }
            z9 = z5;
            hx2 hx2Var2 = this.j;
            if (hx2Var2 != null) {
                hx2Var2.b();
            }
            gb2Var.z3 = null;
            gnVar = gb2Var.y3;
            if (gnVar == null) {
            }
            gnVar.w(gl.L(13.0f));
            gb2Var.y3.u(((!z9 || z6) ? bkb.H2 : bkb.E2).getColor());
            gb2Var.y3.t(ellipsize, !z, true);
            gb2Var.x3 = null;
        }
        gb2Var.Z2(k27Var2);
        e(z24 ? 30 : na7.q1(i20).k4.K.f());
        if (!z2 || (pollResults = ((TLRPC.TL_messageMediaPoll) n1).results) == null) {
            jc0 jc0Var = this.I;
            if (jc0Var != null) {
                jc0Var.d(null, false);
            }
        } else {
            jc0 jc0Var2 = this.I;
            if (jc0Var2 != null) {
                jc0Var2.d(pollResults.recent_voters, !z);
            }
        }
        if (!this.B && gb2Var.Z4 && gb2Var.a5) {
            try {
                gb2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
        boolean z27 = gb2Var.O0 && (gb2Var.Z4 || gb2Var.b5);
        this.B = z27;
        this.C = z27 && z2;
        ArrayList arrayList7 = gb2Var.P4;
        ArrayList arrayList8 = new ArrayList();
        if (arrayList5.isEmpty()) {
            arrayList = arrayList7;
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(arrayList5);
            int size = arrayList5.size();
            int i25 = 0;
            while (i25 < size) {
                Object obj5 = arrayList5.get(i25);
                i25++;
                fb2 fb2Var3 = (fb2) obj5;
                fb2Var3.b();
                gb2 gb2Var2 = fb2Var3.E;
                gm.release(gb2Var2, fb2Var3.r);
                fb2Var3.r = null;
                gm.release(gb2Var2, fb2Var3.B);
                fb2Var3.B = null;
            }
            arrayList5.clear();
            if (!this.B) {
                this.B = gb2Var.O0 && (gb2Var.W4 || gb2Var.X4 || gb2Var.Y4);
            }
            float f6 = this.r;
            if (f6 > f5 && f6 < f4) {
                int size2 = arrayList2.size();
                for (int i26 = 0; i26 < size2; i26++) {
                    fb2 fb2Var4 = (fb2) arrayList2.get(i26);
                    int i27 = fb2Var4.f;
                    fb2Var4.d = (int) Math.ceil(((fb2Var4.d - i27) * this.r) + i27);
                    float f7 = fb2Var4.h;
                    fb2Var4.g = ((fb2Var4.g - f7) * this.r) + f7;
                }
            }
            arrayList = arrayList2;
        }
        this.r = this.B ? f5 : f4;
        if (this.C) {
            bArr = null;
        } else {
            gb2Var.Z4 = false;
            gb2Var.d5 = -1;
            z3a B = z3a.B(i20);
            k27 k27Var3 = gb2Var.Q5;
            bArr = k27Var3 == null ? null : (byte[]) B.w.get("poll_" + k27Var3.D1());
        }
        int i28 = k27Var2.L0 ? this.g : 0;
        StaticLayout staticLayout4 = gb2Var.o2;
        int height = i28 + (staticLayout4 != null ? staticLayout4.getHeight() : 0);
        int i29 = 100;
        if (z2) {
            gb2Var.w1 = true;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) n1;
            if (tL_messageMediaPoll3.attached_media != null) {
                if (this.m == null) {
                    yd8 yd8Var2 = new yd8(i20, gb2Var, gb2Var.cc, false);
                    this.m = yd8Var2;
                    yd8Var2.b.s0(gb2Var.T0);
                }
                int L5 = ((gb2Var.b7 - gl.L(13.0f)) - gl.L(2.0f)) - gl.L(2.0f);
                i19Var = i19Var3;
                i2 = min;
                arrayList3 = arrayList2;
                obj3 = gm.class;
                obj4 = su3.class;
                this.m.o(k27Var2, tL_messageMediaPoll3.attached_media, k27Var, L5, ud8.c(-2, k27Var2.k), !z);
                yd8 yd8Var3 = this.m;
                if (yd8Var3.T) {
                    this.o = L5;
                    int g = yd8Var3.g(L5);
                    this.p = g;
                    int L6 = gl.L(4.0f) + gl.L(4.0f) + g;
                    this.q = L6;
                    height += L6;
                }
                if (gb2Var.O0) {
                    this.m.a();
                }
            } else {
                arrayList3 = arrayList2;
                i19Var = i19Var3;
                i2 = min;
                obj3 = gm.class;
                obj4 = su3.class;
            }
            apb.b(tL_messageMediaPoll3.poll, y6c.h(i20).e());
            TLRPC.Poll poll4 = tL_messageMediaPoll3.poll;
            ArrayList<TLRPC.PollAnswer> arrayList9 = poll4.shuffled_answers;
            if (arrayList9 == null) {
                arrayList9 = poll4.answers;
            }
            ArrayList<TLRPC.PollAnswer> arrayList10 = arrayList9;
            int size3 = poll4.answers.size();
            int i30 = 0;
            while (true) {
                if (i30 >= size3) {
                    break;
                }
                if (tL_messageMediaPoll3.poll.answers.get(i30).media != null) {
                    this.u = true;
                    break;
                }
                i30++;
            }
            int size4 = arrayList10.size();
            byte[] bArr3 = bArr;
            int i31 = 0;
            int i32 = 0;
            boolean z28 = false;
            int i33 = 0;
            while (i31 < size4) {
                TLRPC.PollAnswer pollAnswer2 = arrayList10.get(i31);
                int i34 = size4;
                k27 k27Var4 = gb2Var.Q5;
                int i35 = i31;
                if (!k27Var4.L2 || (message = k27Var4.k) == null || (y0cVar = message.translatedPoll) == null) {
                    i9 = i32;
                } else {
                    ArrayList arrayList11 = y0cVar.b;
                    int size5 = arrayList11.size();
                    i9 = i32;
                    int i36 = 0;
                    while (i36 < size5) {
                        Object obj6 = arrayList11.get(i36);
                        i36++;
                        ArrayList arrayList12 = arrayList11;
                        TLRPC.PollAnswer pollAnswer3 = (TLRPC.PollAnswer) obj6;
                        int i37 = size5;
                        if (Arrays.equals(pollAnswer3.option, pollAnswer2.option)) {
                            pollAnswer = pollAnswer3;
                            z11 = true;
                            break;
                        } else {
                            size5 = i37;
                            arrayList11 = arrayList12;
                        }
                    }
                }
                pollAnswer = pollAnswer2;
                z11 = false;
                int i38 = i33;
                CharSequence n = vu3.n(new SpannableStringBuilder(pollAnswer.text.text), bkb.N2.getFontMetricsInt(), false, null, 0, 1.0f, i38);
                ArrayList<TLRPC.MessageEntity> arrayList13 = pollAnswer.text.entities;
                if (arrayList13 != null) {
                    Spannable B5 = k27.B5(n, arrayList13, bkb.O2.getFontMetricsInt(), true, 1.2f, i38);
                    z12 = z11;
                    bArr2 = bArr3;
                    i10 = 0;
                    k27.a(B5, pollAnswer.text.entities, gb2Var.Q5.O3(), false, false);
                    charSequence4 = B5;
                } else {
                    z12 = z11;
                    charSequence4 = n;
                    bArr2 = bArr3;
                    i10 = 0;
                }
                if (charSequence4 instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence4;
                    charSequence5 = charSequence4;
                    i11 = ((gm[]) spannable.getSpans(i10, charSequence5.length(), obj3)).length + ((su3[]) spannable.getSpans(i10, charSequence4.length(), obj4)).length;
                } else {
                    charSequence5 = charSequence4;
                    i11 = 0;
                }
                i33 = i38 + i11;
                if (arrayList != null) {
                    for (int i39 = 0; i39 < arrayList.size(); i39++) {
                        TLRPC.PollAnswer pollAnswer4 = ((fb2) arrayList.get(i39)).s;
                        if (pollAnswer4 == pollAnswer || (pollAnswer4 != null && Arrays.equals(((fb2) arrayList.get(i39)).s.option, pollAnswer.option))) {
                            fb2Var2 = (fb2) arrayList.get(i39);
                            break;
                        }
                    }
                }
                fb2Var2 = null;
                fb2 fb2Var5 = new fb2(gb2Var);
                if (fb2Var2 != null) {
                    fb2Var5.v = fb2Var2.v;
                    fb2Var5.w = fb2Var2.w;
                    fb2Var5.x = fb2Var2.x;
                    fb2Var2.x = null;
                } else {
                    int a2 = gb2Var.a2(bkb.h6);
                    fb2Var5.v = a2;
                    fb2Var5.w = bkb.Y(a2, 0, 0);
                }
                if (fb2Var5.x == null) {
                    fb2Var5.x = new wd8(i20, gb2Var);
                }
                String c = ud8.c(pollAnswer.unshuffled_index, k27Var2.k);
                wd8 wd8Var = fb2Var5.x;
                wd8Var.f = this.u;
                fb2 fb2Var6 = fb2Var2;
                TLRPC.PollAnswer pollAnswer5 = pollAnswer;
                byte[] bArr4 = bArr2;
                ArrayList arrayList14 = arrayList;
                ArrayList<TLRPC.PollAnswer> arrayList15 = arrayList10;
                int i40 = i9;
                Object obj7 = obj3;
                int i41 = height;
                int i42 = i20;
                boolean z29 = z12;
                Object obj8 = obj4;
                k27Var2 = k27Var;
                wd8Var.g(k27Var2, pollAnswer.media, k27Var, c, !z);
                if (gb2Var.O0) {
                    fb2Var5.a();
                }
                fb2Var5.w.setCallback(gb2Var);
                fb2Var5.s = pollAnswer5;
                StaticLayout staticLayout5 = new StaticLayout(charSequence5, bkb.O2, i2 - gl.L((this.u ? 48 : 0) + 48), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                fb2Var5.p = staticLayout5;
                fb2Var5.o = false;
                fb2Var5.r = gm.update(0, (View) gb2Var, false, fb2Var5.r, staticLayout5);
                fb2Var5.b = gl.L(52.0f) + i41;
                fb2Var5.c = fb2Var5.p.getHeight();
                fb2Var5.u = z29;
                if (fb2Var6 != null && fb2Var6.u != z29) {
                    StaticLayout staticLayout6 = fb2Var6.p;
                    fb2Var5.A = staticLayout6;
                    fb2Var5.B = gm.update(0, (View) gb2Var, false, fb2Var5.B, staticLayout6);
                    fb2Var5.C = fb2Var6.b;
                    fb2Var5.D = fb2Var6.c;
                }
                arrayList5.add(fb2Var5);
                arrayList8.add(fb2Var5);
                int w = de9.w(26.66f, fb2Var5.c, i41);
                int lineCount2 = fb2Var5.p.getLineCount();
                float lineWidth = lineCount2 > 0 ? fb2Var5.p.getLineWidth(lineCount2 - 1) : f5;
                boolean z30 = lineCount2 > 0 && fb2Var5.p.getParagraphDirection(0) == -1;
                float L7 = (r52 - gl.L(10.0f)) - lineWidth;
                if (!tL_messageMediaPoll3.results.results.isEmpty()) {
                    int size6 = tL_messageMediaPoll3.results.results.size();
                    int i43 = 0;
                    while (i43 < size6) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll3.results.results.get(i43);
                        int i44 = w;
                        int i45 = size6;
                        if (Arrays.equals(fb2Var5.s.option, pollAnswerVoters.option)) {
                            wd8 wd8Var2 = fb2Var5.x;
                            if (wd8Var2 != null) {
                                boolean z31 = !gb2Var.j6 && (gb2Var.W4 || gb2Var.Y4 || gb2Var.X4 || (this.x && (!this.v || this.w)));
                                wd8Var2.E.a(z31, (fb2Var6 == null || z) ? false : true);
                                wd8 wd8Var3 = fb2Var5.x;
                                int i46 = pollAnswerVoters.voters;
                                if (fb2Var6 == null || z) {
                                    z15 = z31;
                                    z16 = false;
                                } else {
                                    z15 = z31;
                                    z16 = true;
                                }
                                wd8Var3.j(i46, z16);
                                fb2Var5.x.h(pollAnswerVoters.recent_voters, (fb2Var6 == null || z) ? false : true);
                                float e = fb2Var5.x.e();
                                boolean z32 = z30 && lineCount2 == 1 && L7 - ((float) gl.L(10.0f)) > e;
                                fb2Var5.o = z32;
                                if (!z15 || (e <= L7 && (!z30 || z32))) {
                                    i14 = i44;
                                } else {
                                    fb2Var5.c = gl.L(22.0f) + fb2Var5.c;
                                    i14 = gl.L(22.0f) + i44;
                                }
                                z14 = true;
                            } else {
                                i14 = i44;
                                z14 = false;
                            }
                            fb2Var5.i = pollAnswerVoters.chosen;
                            int i47 = pollAnswerVoters.voters;
                            fb2Var5.j = i47;
                            fb2Var5.l = pollAnswerVoters.correct;
                            if ((gb2Var.W4 || gb2Var.X4 || gb2Var.Y4 || (this.x && (!this.v || this.w))) && (i15 = tL_messageMediaPoll3.results.total_voters) > 0) {
                                f3 = f5;
                                float a = moe.a(i47 / i15, f3, f4) * 100.0f;
                                i16 = (int) a;
                                fb2Var5.d = i16;
                                fb2Var5.e = a - i16;
                            } else {
                                f3 = f5;
                                fb2Var5.d = 0;
                                fb2Var5.e = f3;
                                i16 = 0;
                            }
                            if (i40 == 0) {
                                i40 = i16;
                            } else if (i16 != 0 && i40 != i16) {
                                z28 = true;
                            }
                            i29 -= i16;
                            i12 = i14;
                            z13 = z14;
                            i32 = i40;
                            if (!z13) {
                                fb2Var5.x.E.a(false, (fb2Var6 == null || z) ? false : true);
                            }
                            if (arrayList3 != null) {
                                int size7 = arrayList3.size();
                                int i48 = 0;
                                while (i48 < size7) {
                                    arrayList4 = arrayList3;
                                    fb2 fb2Var7 = (fb2) arrayList4.get(i48);
                                    if (Arrays.equals(fb2Var5.s.option, fb2Var7.s.option)) {
                                        fb2Var5.f = fb2Var7.d;
                                        fb2Var5.h = fb2Var7.g;
                                        fb2Var5.k = fb2Var7.i;
                                        break;
                                    }
                                    i48++;
                                    arrayList3 = arrayList4;
                                }
                            }
                            arrayList4 = arrayList3;
                            if (bArr4 != null) {
                                byte[] bArr5 = fb2Var5.s.option;
                                if (bArr5.length > 0) {
                                    bArr3 = bArr4;
                                    if (Arrays.binarySearch(bArr3, bArr5[0]) >= 0) {
                                        i13 = i35;
                                        gb2Var.d5 = i13;
                                        gb2Var.Z4 = true;
                                        gb2Var.a5 = true;
                                        bArr3 = null;
                                    } else {
                                        i13 = i35;
                                    }
                                    if (gb2Var.W4 || this.w || !this.v) {
                                        contains = gb2Var.Q5.x1.contains(fb2Var5.s);
                                        CheckBoxBase[] checkBoxBaseArr = gb2Var.f7;
                                        if (contains) {
                                            checkBoxBaseArr[i13].g(true, false);
                                        } else {
                                            checkBoxBaseArr[i13].g(false, false);
                                        }
                                    } else {
                                        gb2Var.f7[i13].g(fb2Var5.i, false);
                                    }
                                    gb2Var.f7[i13].e = 0.85f;
                                    i31 = i13 + 1;
                                    arrayList3 = arrayList4;
                                    f5 = f3;
                                    size4 = i34;
                                    i20 = i42;
                                    obj3 = obj7;
                                    obj4 = obj8;
                                    arrayList = arrayList14;
                                    height = i12;
                                    arrayList10 = arrayList15;
                                    f4 = 1.0f;
                                }
                            }
                            i13 = i35;
                            bArr3 = bArr4;
                            if (gb2Var.W4) {
                            }
                            contains = gb2Var.Q5.x1.contains(fb2Var5.s);
                            CheckBoxBase[] checkBoxBaseArr2 = gb2Var.f7;
                            if (contains) {
                            }
                            gb2Var.f7[i13].e = 0.85f;
                            i31 = i13 + 1;
                            arrayList3 = arrayList4;
                            f5 = f3;
                            size4 = i34;
                            i20 = i42;
                            obj3 = obj7;
                            obj4 = obj8;
                            arrayList = arrayList14;
                            height = i12;
                            arrayList10 = arrayList15;
                            f4 = 1.0f;
                        } else {
                            i43++;
                            w = i44;
                            size6 = i45;
                            f4 = 1.0f;
                        }
                    }
                }
                i12 = w;
                f3 = f5;
                z13 = false;
                i32 = i40;
                if (!z13) {
                }
                if (arrayList3 != null) {
                }
                arrayList4 = arrayList3;
                if (bArr4 != null) {
                }
                i13 = i35;
                bArr3 = bArr4;
                if (gb2Var.W4) {
                }
                contains = gb2Var.Q5.x1.contains(fb2Var5.s);
                CheckBoxBase[] checkBoxBaseArr22 = gb2Var.f7;
                if (contains) {
                }
                gb2Var.f7[i13].e = 0.85f;
                i31 = i13 + 1;
                arrayList3 = arrayList4;
                f5 = f3;
                size4 = i34;
                i20 = i42;
                obj3 = obj7;
                obj4 = obj8;
                arrayList = arrayList14;
                height = i12;
                arrayList10 = arrayList15;
                f4 = 1.0f;
            }
            int i49 = i20;
            ArrayList arrayList16 = arrayList;
            int i50 = height;
            bb2 bb2Var = gb2Var.eb;
            if (bb2Var == null || !bb2Var.d0() || !tL_messageMediaPoll3.poll.open_answers || gb2Var.X4 || k27Var2.r1 || k27Var2.j3() || tL_messageMediaPoll3.poll.answers.size() >= na7.q1(i49).k4.K.f()) {
                height = i50;
            } else {
                if (this.l == null) {
                    id8 id8Var = new id8(gb2Var.getContext(), gb2Var.cc);
                    this.l = id8Var;
                    id8Var.setCallback(gb2Var);
                    id8Var.a.setCallback(gb2Var);
                }
                this.s = true;
                bb2 bb2Var2 = gb2Var.eb;
                int U = bb2Var2 != null ? bb2Var2.U(gb2Var) : 0;
                boolean z33 = U > 0;
                this.t = z33;
                this.l.d(z33, !z);
                int max = Math.max(gl.L(44.33f), U);
                gb2Var.Q1 = max;
                height = i50 + max;
            }
            int size8 = arrayList16.size();
            int i51 = 0;
            while (i51 < size8) {
                Object obj9 = arrayList16.get(i51);
                i51++;
                fb2 fb2Var8 = (fb2) obj9;
                fb2Var8.b();
                fb2Var8.x = null;
            }
            b(!z);
            z10 = z28;
            i3 = i29;
        } else {
            Object obj10 = gm.class;
            Object obj11 = su3.class;
            i19Var = i19Var3;
            ArrayList arrayList17 = arrayList;
            i2 = min;
            if (n1 instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo3 = (TLRPC.TL_messageMediaToDo) n1;
                int size9 = tL_messageMediaToDo3.todo.list.size();
                int i52 = height;
                int i53 = 0;
                int i54 = 0;
                while (i53 < size9) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo3.todo.list.get(i53);
                    int i55 = i54;
                    CharSequence n2 = vu3.n(new SpannableStringBuilder(todoItem.title.text), bkb.N2.getFontMetricsInt(), false, null, 0, 1.0f, i55);
                    ArrayList<TLRPC.MessageEntity> arrayList18 = todoItem.title.entities;
                    if (arrayList18 != null) {
                        Spannable B52 = k27.B5(n2, arrayList18, bkb.O2.getFontMetricsInt(), true, 1.2f, i55);
                        i4 = 0;
                        k27.a(B52, todoItem.title.entities, gb2Var.Q5.O3(), false, false);
                        charSequence2 = B52;
                    } else {
                        i4 = 0;
                        charSequence2 = n2;
                    }
                    if (charSequence2 instanceof Spannable) {
                        Spannable spannable2 = (Spannable) charSequence2;
                        obj2 = obj11;
                        i5 = size9;
                        i6 = i53;
                        obj = obj10;
                        i7 = ((gm[]) spannable2.getSpans(i4, charSequence2.length(), obj)).length + ((su3[]) spannable2.getSpans(i4, charSequence2.length(), obj2)).length;
                    } else {
                        i5 = size9;
                        i6 = i53;
                        obj = obj10;
                        obj2 = obj11;
                        i7 = 0;
                    }
                    i54 = i55 + i7;
                    if (arrayList17 != null) {
                        for (int i56 = 0; i56 < arrayList17.size(); i56++) {
                            fb2Var = (fb2) arrayList17.get(i56);
                            TLRPC.TodoItem todoItem2 = fb2Var.t;
                            if (todoItem2 == todoItem || (todoItem2 != null && todoItem2.id == todoItem.id)) {
                                break;
                            }
                        }
                    }
                    fb2Var = null;
                    Boolean E = z3a.B(i20).E(k27Var2, todoItem);
                    fb2 fb2Var9 = new fb2(gb2Var);
                    fb2Var9.q = fb2Var != null ? fb2Var.q : null;
                    if (fb2Var != null) {
                        fb2Var9.v = fb2Var.v;
                        Y = fb2Var.w;
                        fb2Var9.w = Y;
                        bool = E;
                    } else {
                        int a22 = gb2Var.a2(bkb.h6);
                        fb2Var9.v = a22;
                        bool = E;
                        Y = bkb.Y(a22, 0, 0);
                        fb2Var9.w = Y;
                    }
                    Y.setCallback(gb2Var);
                    if (fb2Var != null) {
                        fb2Var9.y = fb2Var.y;
                        fb2Var9.z = fb2Var.z;
                        fb2Var.y = null;
                        fb2Var.z = null;
                    }
                    if (fb2Var9.y == null) {
                        fb2Var9.y = new pb0();
                    }
                    if (fb2Var9.z == null) {
                        ImageReceiver imageReceiver = new ImageReceiver(gb2Var);
                        fb2Var9.z = imageReceiver;
                        imageReceiver.q0(gl.L(20.0f));
                    }
                    if (gb2Var.O0) {
                        fb2Var9.a();
                    }
                    fb2Var9.i = false;
                    if (tL_messageMediaToDo3.completions.isEmpty()) {
                        obj10 = obj;
                    } else {
                        ArrayList<TLRPC.TodoCompletion> arrayList19 = tL_messageMediaToDo3.completions;
                        int size10 = arrayList19.size();
                        obj10 = obj;
                        int i57 = 0;
                        while (i57 < size10) {
                            TLRPC.TodoCompletion todoCompletion = arrayList19.get(i57);
                            int i58 = i57 + 1;
                            ArrayList<TLRPC.TodoCompletion> arrayList20 = arrayList19;
                            TLRPC.TodoCompletion todoCompletion2 = todoCompletion;
                            int i59 = size10;
                            if (todoCompletion2.id == todoItem.id) {
                                fb2Var9.i = true;
                                obj11 = obj2;
                                tL_messageMediaToDo = tL_messageMediaToDo3;
                                TLObject Z1 = na7.q1(i20).Z1(cf3.n(todoCompletion2.completed_by));
                                fb2Var9.y.k(Z1);
                                fb2Var9.z.U(Z1, fb2Var9.y, null);
                                fb2Var9.q = new tgb(cf3.l(Z1), 12.0f);
                                break;
                            }
                            i57 = i58;
                            arrayList19 = arrayList20;
                            size10 = i59;
                        }
                    }
                    obj11 = obj2;
                    tL_messageMediaToDo = tL_messageMediaToDo3;
                    if (bool != null) {
                        fb2Var9.i = bool.booleanValue();
                    }
                    if (!fb2Var9.i || k27Var2.q()) {
                        charSequence3 = charSequence2;
                    } else {
                        boolean z34 = charSequence2 instanceof SpannableStringBuilder;
                        CharSequence charSequence7 = charSequence2;
                        if (!z34) {
                            charSequence7 = new SpannableStringBuilder(charSequence2);
                        }
                        ((SpannableStringBuilder) charSequence7).setSpan(new StrikethroughSpan(), 0, charSequence7.length(), 33);
                        charSequence3 = charSequence7;
                    }
                    fb2Var9.t = todoItem;
                    StaticLayout staticLayout7 = new StaticLayout(charSequence3, bkb.O2, i2 - gl.L(46.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    fb2Var9.p = staticLayout7;
                    fb2Var9.r = gm.update(0, (View) gb2Var, false, fb2Var9.r, staticLayout7);
                    fb2Var9.b = gl.L(52.0f) + i52;
                    fb2Var9.c = fb2Var9.p.getHeight();
                    fb2Var9.u = false;
                    if (fb2Var != null && fb2Var.u) {
                        StaticLayout staticLayout8 = fb2Var.p;
                        fb2Var9.A = staticLayout8;
                        fb2Var9.B = gm.update(0, (View) gb2Var, false, fb2Var9.B, staticLayout8);
                        fb2Var9.C = fb2Var.b;
                        fb2Var9.D = fb2Var.c;
                    }
                    arrayList5.add(fb2Var9);
                    arrayList8.add(fb2Var9);
                    i52 = de9.w(26.66f, fb2Var9.c, i52);
                    gb2Var.f7[i6].g(fb2Var9.i, !z);
                    gb2Var.f7[i6].e = 1.0f;
                    i53 = i6 + 1;
                    tL_messageMediaToDo3 = tL_messageMediaToDo;
                    size9 = i5;
                }
                int size11 = arrayList17.size();
                int i60 = 0;
                while (i60 < size11) {
                    Object obj12 = arrayList17.get(i60);
                    i60++;
                    fb2 fb2Var10 = (fb2) obj12;
                    ImageReceiver imageReceiver2 = fb2Var10.z;
                    if (imageReceiver2 != null) {
                        imageReceiver2.K();
                        fb2Var10.z = null;
                    }
                }
                height = i52;
            }
            i3 = 100;
            z10 = false;
        }
        g(i3, arrayList8, z10);
        int L8 = gb2Var.b7 - gl.L(76.0f);
        int size12 = arrayList5.size();
        for (int i61 = 0; i61 < size12; i61++) {
            ((fb2) arrayList5.get(i61)).g = Math.max(gl.L(5.0f) / L8, r6.d / 100.0f);
        }
        gb2Var.setMessageObjectInternal(k27Var2);
        this.b = false;
        if (!gb2Var.j6 || gb2Var.u2) {
            this.b = true;
            L = gl.L(13.0f) + height;
        } else {
            L = height - gl.L(10.0f);
        }
        int L9 = gl.L(73.0f);
        int i62 = gb2Var.gb;
        gb2Var.v0 = L9 + i62 + L;
        if (gb2Var.J) {
            gb2Var.gb = i62 - gl.L(1.0f);
        }
        gb2Var.E2 = false;
        if (z9 || z6) {
            int i63 = 0;
            int i64 = 0;
            i8 = 3;
            while (i63 < 3) {
                i64 = Math.max(i64, (int) Math.ceil(bkb.L2.measureText(i63 == 0 ? k96.L0(2131746917) : i63 == 1 ? k96.L0(2131746963) : k96.L0(2131747938))));
                i63++;
            }
            int extraTimeX = gb2Var.getExtraTimeX() + gb2Var.M9 + (k27Var2.O3() ? gl.L(20.0f) : 0);
            i19Var.getClass();
            i19Var2 = i19Var;
            if (i19Var2.p && !gb2Var.y2() && extraTimeX >= ((gb2Var.b7 - gl.L(76.0f)) - i64) / 2) {
                gb2Var.v0 = gl.L(18.0f) + gb2Var.v0;
                gb2Var.E2 = true;
            }
        } else {
            i19Var2 = i19Var;
            i8 = 3;
        }
        i19Var2.getClass();
        if (i19Var2.p) {
            return;
        }
        i19Var2.o(i2, i8);
        gb2Var.v0 = de9.w(12.0f, i19Var2.m, gb2Var.v0);
        int extraTimeX2 = gb2Var.getExtraTimeX() + gb2Var.M9 + (k27Var2.O3() ? gl.L(20.0f) : 0);
        if (gb2Var.y2() || extraTimeX2 < (gb2Var.b7 - gl.L(24.0f)) - i19Var2.r) {
            return;
        }
        gb2Var.v0 = gl.L(16.0f) + gb2Var.v0;
        i19Var2.k -= gl.L(16.0f);
    }

    public final void j(long j) {
        jc0 jc0Var;
        k27 k27Var;
        gb2 gb2Var = this.a;
        ArrayList arrayList = gb2Var.Q4;
        if (gb2Var.Z4) {
            this.E = (((360 * j) / 2000.0f) + this.E) - (((int) (r6 / 360.0f)) * 360);
            float f = gb2Var.h5 + j;
            gb2Var.h5 = f;
            if (f >= 500.0f) {
                gb2Var.h5 = 500.0f;
                f = 500.0f;
            }
            if (gb2Var.g5) {
                gb2Var.e5 = (gl.G.getInterpolation(f / 500.0f) * 266.0f) + 4.0f;
            } else {
                gb2Var.e5 = 4.0f - ((1.0f - gl.F.getInterpolation(f / 500.0f)) * (gb2Var.f5 ? 360 : kk7.s4));
            }
            if (gb2Var.h5 == 500.0f) {
                boolean z = gb2Var.g5;
                if (z) {
                    this.E += 270.0f;
                    gb2Var.e5 = -266.0f;
                }
                gb2Var.g5 = !z;
                if (gb2Var.f5) {
                    gb2Var.f5 = false;
                }
                gb2Var.h5 = 0.0f;
            }
            gb2Var.invalidate();
        }
        if (!gb2Var.r5 || ((k27Var = gb2Var.Q5) != null && k27Var.L0)) {
            float f2 = gb2Var.s5;
            if (f2 > 0.0f) {
                float f3 = f2 - (j / 180.0f);
                gb2Var.s5 = f3;
                if (f3 < 0.0f) {
                    gb2Var.s5 = 0.0f;
                }
                gb2Var.invalidate();
            }
        } else {
            float f4 = gb2Var.s5;
            if (f4 < 1.0f) {
                float f5 = (j / 180.0f) + f4;
                gb2Var.s5 = f5;
                if (f5 > 1.0f) {
                    gb2Var.s5 = 1.0f;
                }
                gb2Var.invalidate();
            }
        }
        if (this.B) {
            float f6 = gb2Var.R4 + j;
            gb2Var.R4 = f6;
            if (f6 >= 300.0f) {
                gb2Var.R4 = 300.0f;
                f6 = 300.0f;
            }
            float interpolation = gl.F.getInterpolation(f6 / 300.0f);
            this.r = interpolation;
            if (interpolation >= 1.0f) {
                this.r = 1.0f;
                this.B = false;
                this.C = false;
                gb2Var.Z4 = false;
                if (gb2Var.b5 && gb2Var.c5 && (jc0Var = this.I) != null) {
                    jc0Var.d(null, false);
                }
                gb2Var.b5 = false;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((fb2) arrayList.get(i)).k = false;
                }
            }
            gb2Var.invalidate();
        }
    }
}
