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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class cc2 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public byte G = -1;
    public float H;
    public lc0 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final wb2 a;
    public boolean b;
    public StaticLayout c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public int i;
    public by2 j;
    public ai8 k;
    public wg8 l;
    public mh8 m;
    public mh8 n;
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

    public cc2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public static void g(int i, ArrayList arrayList, boolean z) {
        if (!z || i == 0 || arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new ta((byte) 24));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size && i > 0; i2++) {
            vb2 vb2Var = (vb2) arrayList.get(i2);
            int i3 = vb2Var.d;
            if (i3 > 0) {
                vb2Var.d = i3 + 1;
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
        hm hmVar;
        boolean z3;
        boolean z4;
        CharacterStyle[] characterStyleArr;
        CharacterStyle[] characterStyleArr2;
        ab9 ab9Var;
        wb2 wb2Var = this.a;
        m66 m66Var = wb2Var.u4;
        dc2 dc2Var = wb2Var.ub;
        if ((this.d instanceof Spannable) && wb2Var.q3 != null && wb2Var.t4 == -1 && !wb2Var.rc) {
            boolean z5 = true;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && (wb2Var.v4 == 1 || wb2Var.s4 != null))) {
                int x = (int) motionEvent.getX();
                int P1 = (int) wb2Var.P1(motionEvent);
                float f2 = x;
                float f3 = wb2Var.u5;
                if (f2 >= f3) {
                    float f4 = P1;
                    float f5 = wb2Var.v5;
                    if (f4 >= f5) {
                        p47 p47Var = wb2Var.q3;
                        if (f2 <= f3 + p47Var.c && f4 <= f5 + p47Var.c(dc2Var)) {
                            int i = (int) (f4 - wb2Var.v5);
                            int i2 = 0;
                            for (int i3 = 0; i3 < wb2Var.q3.e.size() && ((o47) wb2Var.q3.e.get(i3)).p(wb2Var.q3.e, dc2Var) <= i; i3++) {
                                i2 = i3;
                            }
                            try {
                                o47 o47Var = (o47) wb2Var.q3.e.get(i2);
                                float f6 = wb2Var.u5;
                                if (o47Var.l()) {
                                    try {
                                        f = wb2Var.q3.d;
                                    } catch (Exception e) {
                                        e = e;
                                        z = true;
                                        cc4.g(e, z);
                                        return false;
                                    }
                                } else {
                                    f = 0.0f;
                                }
                                int i4 = (int) (f2 - (f6 - f));
                                int p = (int) (i - o47Var.p(wb2Var.q3.e, dc2Var));
                                int lineForVertical = o47Var.e.getLineForVertical(p);
                                int i5 = 0;
                                float f7 = i4;
                                int offsetForHorizontal = o47Var.n + o47Var.e.getOffsetForHorizontal(lineForVertical, f7);
                                float lineLeft = o47Var.e.getLineLeft(lineForVertical);
                                if (lineLeft <= f7 && lineLeft + o47Var.e.getLineWidth(lineForVertical) >= f7) {
                                    Spannable spannable = (Spannable) this.d;
                                    CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                    if (characterStyleArr3 == null || characterStyleArr3.length == 0) {
                                        characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, e8c.class);
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    boolean z6 = characterStyleArr3 != null ? z2 : false;
                                    characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, hm.class);
                                    if (characterStyleArr3.length != 0 && ((!(characterStyleArr3[0] instanceof c8c) || c8c.h) && !hl.A1())) {
                                        if (motionEvent.getAction() == 0) {
                                            CharacterStyle characterStyle2 = characterStyleArr3[0];
                                            if (characterStyle2 instanceof hm) {
                                                hm hmVar2 = wb2Var.q4;
                                                if (hmVar2 == null || hmVar2 != characterStyle2) {
                                                    wb2Var.i3(1);
                                                    wb2Var.q4 = (hm) characterStyleArr3[0];
                                                    wb2Var.v4 = 1;
                                                }
                                            } else {
                                                q66 q66Var = wb2Var.r4;
                                                if (q66Var == null || q66Var.i != characterStyle2) {
                                                    m66Var.l(q66Var, true);
                                                    float[] fArr = wb2.Id;
                                                    q66 q66Var2 = new q66(characterStyleArr3[0], wb2Var.cc, f7, p, 0);
                                                    wb2Var.r4 = q66Var2;
                                                    q66Var2.d(aob.v0(wb2Var.Q5.O3() ? aob.Dc : aob.Ce, wb2Var.cc));
                                                    if (o47Var.J && (ab9Var = wb2Var.n8) != null) {
                                                        wb2Var.r4.d(aob.p1(aob.I.o() ? 0.13f : 0.1f, ab9Var.h()));
                                                    }
                                                    wb2Var.z0 = i2;
                                                    wb2Var.y0 = -1;
                                                    wb2Var.v4 = 1;
                                                    try {
                                                        f66 b = wb2Var.r4.b();
                                                        int[] Z1 = wb2.Z1(spannable, wb2Var.r4.i);
                                                        int i6 = Z1[0];
                                                        int i7 = o47Var.n;
                                                        int i8 = i6 - i7;
                                                        Z1[0] = i8;
                                                        Z1[1] = Z1[1] - i7;
                                                        b.d(o47Var.e, i8, 0.0f);
                                                        o47Var.e.getSelectionPath(Z1[0], Z1[1], b);
                                                        if (Z1[1] >= o47Var.r) {
                                                            int i9 = i2 + 1;
                                                            while (i9 < wb2Var.q3.e.size()) {
                                                                o47 o47Var2 = (o47) wb2Var.q3.e.get(i9);
                                                                if (z6) {
                                                                    try {
                                                                        int i10 = o47Var2.n;
                                                                        characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i10, i10, e8c.class);
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        z4 = z5;
                                                                        cc4.g(e, z4);
                                                                        m66Var.a(wb2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                                        wb2Var.qc = z4;
                                                                        wb2Var.invalidate();
                                                                        return z4;
                                                                    }
                                                                } else {
                                                                    int i11 = o47Var2.n;
                                                                    characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i11, i11, ClickableSpan.class);
                                                                }
                                                                if (characterStyleArr2 == null || characterStyleArr2.length == 0) {
                                                                    break;
                                                                }
                                                                CharacterStyle characterStyle3 = characterStyleArr2[i5];
                                                                q66 q66Var3 = wb2Var.r4;
                                                                if (characterStyle3 != q66Var3.i) {
                                                                    z3 = z5;
                                                                    break;
                                                                }
                                                                f66 b2 = q66Var3.b();
                                                                z3 = z5;
                                                                try {
                                                                    b2.d(o47Var2.e, i5, o47Var2.p(wb2Var.q3.e, dc2Var) - o47Var.p(wb2Var.q3.e, dc2Var));
                                                                    int i12 = (Z1[z3 ? 1 : 0] + o47Var.n) - o47Var2.n;
                                                                    o47Var2.e.getSelectionPath(0, i12, b2);
                                                                    if (i12 < o47Var2.r - 1) {
                                                                        break;
                                                                    }
                                                                    i9++;
                                                                    z5 = z3 ? 1 : 0;
                                                                    i5 = 0;
                                                                } catch (Exception e3) {
                                                                    e = e3;
                                                                    z4 = z3;
                                                                    cc4.g(e, z4);
                                                                    m66Var.a(wb2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                                    wb2Var.qc = z4;
                                                                    wb2Var.invalidate();
                                                                    return z4;
                                                                }
                                                            }
                                                        }
                                                        z3 = z5;
                                                        i5 = 0;
                                                        if (Z1[i5] <= o47Var.n) {
                                                            int i13 = 0;
                                                            for (int i14 = i2 - 1; i14 >= 0; i14--) {
                                                                o47 o47Var3 = (o47) wb2Var.q3.e.get(i14);
                                                                if (z6) {
                                                                    int i15 = o47Var3.r - 1;
                                                                    characterStyleArr = (CharacterStyle[]) spannable.getSpans(i15, i15, e8c.class);
                                                                } else {
                                                                    int i16 = o47Var3.r - 1;
                                                                    characterStyleArr = (CharacterStyle[]) spannable.getSpans(i16, i16, ClickableSpan.class);
                                                                }
                                                                if (characterStyleArr == null || characterStyleArr.length == 0) {
                                                                    break;
                                                                }
                                                                CharacterStyle characterStyle4 = characterStyleArr[0];
                                                                q66 q66Var4 = wb2Var.r4;
                                                                if (characterStyle4 != q66Var4.i) {
                                                                    break;
                                                                }
                                                                f66 b3 = q66Var4.b();
                                                                i13 -= o47Var3.w;
                                                                int i17 = Z1[0];
                                                                int i18 = o47Var.n;
                                                                int i19 = o47Var3.n;
                                                                int i20 = (i17 + i18) - i19;
                                                                int i21 = (Z1[z3 ? 1 : 0] + i18) - i19;
                                                                b3.d(o47Var3.e, i20, i13);
                                                                o47Var3.e.getSelectionPath(i20, i21, b3);
                                                                if (i20 > o47Var3.n) {
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        z4 = z3 ? 1 : 0;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        z3 = z5;
                                                    }
                                                    m66Var.a(wb2Var.r4, Integer.valueOf(z4 ? 1 : 0));
                                                    wb2Var.qc = z4;
                                                    wb2Var.invalidate();
                                                    return z4;
                                                }
                                            }
                                            z4 = true;
                                            wb2Var.qc = z4;
                                            wb2Var.invalidate();
                                            return z4;
                                        }
                                        CharacterStyle characterStyle5 = characterStyleArr3[0];
                                        if ((characterStyle5 instanceof hm) && (hmVar = wb2Var.q4) == characterStyle5) {
                                            if (wb2Var.eb.A1(hmVar)) {
                                                z = true;
                                                try {
                                                    wb2Var.i3(1);
                                                    wb2Var.q4 = null;
                                                    return true;
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    cc4.g(e, z);
                                                    return false;
                                                }
                                            }
                                            wb2Var.i3(1);
                                            wb2Var.q4 = null;
                                        } else {
                                            q66 q66Var5 = wb2Var.r4;
                                            if (q66Var5 != null && characterStyle5 == (characterStyle = q66Var5.i)) {
                                                wb2Var.eb.L(wb2Var, characterStyle, false);
                                                wb2Var.i3(1);
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
                wb2Var.i3(1);
                return false;
            }
            if (motionEvent.getAction() == 1) {
                wb2Var.s4 = null;
                wb2Var.f3();
                return false;
            }
        }
        return false;
    }

    public final void b(boolean z) {
        boolean z2;
        wb2 wb2Var = this.a;
        r47 r47Var = wb2Var.Q5;
        if (r47Var != null) {
            TLRPC.MessageMedia m1 = r47.m1(r47Var);
            if (m1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
                byte b = 0;
                if (wb2Var.f7 != null) {
                    int min = Math.min(tL_messageMediaPoll.poll.answers.size(), wb2Var.f7.length);
                    z2 = false;
                    for (int i = 0; i < min; i++) {
                        CheckBoxBase checkBoxBase = wb2Var.f7[i];
                        if (checkBoxBase != null && checkBoxBase.q) {
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                boolean z3 = wb2Var.W4;
                boolean z4 = (z3 || wb2Var.X4 || !this.w || pollResults == null || pollResults.total_voters == 0 || !tL_messageMediaPoll.poll.creator) ? false : true;
                boolean z5 = (z3 || wb2Var.X4 || this.x) ? false : true;
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                boolean z6 = poll.public_voters;
                CharSequence charSequence = null;
                if (this.t) {
                    charSequence = ob6.M0(2131746904, null);
                    b = 84;
                } else if (!z4 || (poll.multiple_choice && z5 && z2)) {
                    if (poll.multiple_choice && z5) {
                        charSequence = ob6.M0(2131746883, null);
                        b = 83;
                    } else if (!wb2Var.j6 && z6 && ((z3 && (!this.v || this.w)) || (wb2Var.X4 && pollResults.total_voters != 0))) {
                        charSequence = ob6.a0(null, null, 2131746832, Integer.valueOf(pollResults.total_voters));
                        b = 80;
                    }
                } else if (z6) {
                    charSequence = ob6.a0(null, null, 2131746832, Integer.valueOf(pollResults.total_voters));
                    b = 80;
                } else if (r47Var.M0) {
                    charSequence = hl.F2(ob6.M0(2131746838, null), false, -hl.L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
                    b = 82;
                } else {
                    charSequence = hl.D2(ob6.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                    b = 81;
                }
                if (b != 0) {
                    if (this.k == null) {
                        ai8 ai8Var = new ai8(wb2Var, wb2Var.cc);
                        this.k = ai8Var;
                        ai8Var.setCallback(wb2Var);
                        ai8Var.a.setCallback(wb2Var);
                        ai8Var.d.setCallback(wb2Var);
                    }
                    wb2Var.z2 = charSequence;
                    this.k.d.t(charSequence, z, true);
                    wb2Var.u2 = true;
                    wb2Var.y2 = b;
                    wb2Var.y0();
                }
                wb2Var.b0(z);
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
        wb2 wb2Var;
        boolean z;
        rb2 rb2Var;
        int i;
        wg8 wg8Var;
        int i2;
        int[] iArr;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        wb2 wb2Var2 = this.a;
        m66 m66Var = wb2Var2.u4;
        int[] iArr2 = wb2Var2.N2;
        int[] iArr3 = wb2Var2.L2;
        Drawable[] drawableArr = wb2Var2.J2;
        ArrayList arrayList = wb2Var2.Q4;
        r47 r47Var = wb2Var2.Q5;
        int i6 = 0;
        if (r47Var.T == 0 && (((!wb2Var2.Z4 && !wb2Var2.b5) || r47Var.C4()) && !arrayList.isEmpty())) {
            r47 r47Var2 = wb2Var2.Q5;
            if (r47Var2.D == 17 && r47Var2.p4()) {
                int x = (int) motionEvent.getX();
                int P1 = (int) wb2Var2.P1(motionEvent);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() != 3) {
                                return false;
                            }
                            h();
                            return false;
                        }
                        if ((wb2Var2.i5 == -1 && !wb2Var2.q5) || (drawable = drawableArr[0]) == null) {
                            return false;
                        }
                        drawable.setHotspot(x, P1);
                        return false;
                    }
                    if (wb2Var2.t5 != -1) {
                        wb2Var2.playSoundEffect(0);
                        if (wb2Var2.Q5 != null && (rb2Var = wb2Var2.eb) != null && wb2Var2.t5 == 0) {
                            rb2Var.m2(wb2Var2);
                        }
                        wb2Var2.t5 = -1;
                        h();
                        return false;
                    }
                    if (wb2Var2.y5) {
                        wb2Var2.playSoundEffect(0);
                        wb2Var2.G0();
                        wb2Var2.y5 = false;
                        h();
                        return false;
                    }
                    if (wb2Var2.q5) {
                        wb2Var2.playSoundEffect(0);
                        wb2Var2.G0();
                        wb2Var2.q5 = false;
                        wb2Var2.t5 = -1;
                        h();
                        return false;
                    }
                    q66 q66Var = wb2Var2.r4;
                    if (q66Var != null) {
                        CharacterStyle characterStyle = q66Var.i;
                        if (characterStyle instanceof URLSpan) {
                            wb2Var2.eb.L(wb2Var2, characterStyle, false);
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(wb2Var2);
                        }
                        wb2Var2.i3(4);
                        return false;
                    }
                    if (wb2Var2.i5 == -1) {
                        return false;
                    }
                    wb2Var2.playSoundEffect(0);
                    h();
                    if (this.F) {
                        vb2 vb2Var = (vb2) arrayList.get(wb2Var2.i5);
                        ImageReceiver imageReceiver = vb2Var.x.c;
                        TLRPC.PollAnswer pollAnswer = vb2Var.s;
                        TLRPC.MessageMedia messageMedia = pollAnswer.media;
                        motionEvent.getX();
                        motionEvent.getY();
                        int i7 = vb2Var.s.unshuffled_index;
                        rb2 rb2Var2 = wb2Var2.eb;
                        if (rb2Var2 != null) {
                            rb2Var2.m(wb2Var2, pollAnswer, messageMedia, i7);
                        }
                    } else if (wb2Var2.Q5.r1) {
                        Toast.makeText(wb2Var2.getContext(), ob6.M0(wb2Var2.Q5.C4() ? 2131748247 : 2131748245, null), 1).show();
                    } else {
                        vb2 vb2Var2 = (vb2) arrayList.get(wb2Var2.i5);
                        TLRPC.PollAnswer pollAnswer2 = vb2Var2.s;
                        if (wb2Var2.W4 || wb2Var2.X4) {
                            new ArrayList().add(pollAnswer2);
                            wb2Var2.eb.s0(wb2Var2, pollAnswer2);
                        } else {
                            if (this.x) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(pollAnswer2);
                                wb2Var = wb2Var2;
                                wb2Var2.eb.c1(wb2Var, arrayList2, vb2Var2.j, hl.L(50.0f) + vb2Var2.a, wb2Var2.gb + vb2Var2.b);
                            } else {
                                TLRPC.Poll poll = wb2Var2.j5;
                                if (poll == null || !poll.multiple_choice) {
                                    int i8 = wb2Var2.i5;
                                    wb2Var2.d5 = i8;
                                    wb2Var2.Z4 = true;
                                    wb2Var2.h5 = 0.0f;
                                    wb2Var2.f5 = true;
                                    wb2Var2.e5 = 360.0f;
                                    wb2Var2.g5 = false;
                                    if (vb2Var2.t != null) {
                                        wb2Var2.P3(i8, true);
                                    } else {
                                        wb2Var2.a5 = true;
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(pollAnswer2);
                                        wb2Var = wb2Var2;
                                        wb2Var2.eb.c1(wb2Var, arrayList3, -1, 0, 0);
                                    }
                                } else {
                                    boolean contains = wb2Var2.Q5.x1.contains(pollAnswer2);
                                    r47 r47Var3 = wb2Var2.Q5;
                                    if (contains) {
                                        r47Var3.x1.remove(pollAnswer2);
                                        z = true;
                                        wb2Var2.f7[wb2Var2.i5].f(-1, false, true);
                                    } else {
                                        z = true;
                                        r47Var3.x1.add(pollAnswer2);
                                        wb2Var2.f7[wb2Var2.i5].f(-1, true, true);
                                    }
                                    b(z);
                                }
                            }
                            wb2Var2 = wb2Var;
                        }
                    }
                    wb2Var2.i5 = -1;
                    wb2Var2.invalidate();
                    return false;
                }
                wb2Var2.i5 = -1;
                wb2Var2.q5 = false;
                wb2Var2.t5 = -1;
                wb2Var2.y5 = false;
                wb2Var2.i3(4);
                int i9 = wb2Var2.w5;
                if (i9 != -1 && wb2Var2.x5 != -1 && Math.abs(x - i9) < hl.L(20.0f) && Math.abs(P1 - wb2Var2.x5) < hl.L(20.0f)) {
                    wb2Var2.y5 = true;
                    h();
                    wb2Var2.invalidate();
                    return true;
                }
                if (wb2Var2.r5 && (i4 = wb2Var2.o5) != -1 && x >= i4 && x <= hl.L(40.0f) + i4 && P1 >= (i5 = wb2Var2.p5) && P1 <= hl.L(40.0f) + i5) {
                    wb2Var2.q5 = true;
                    iArr3[0] = 3;
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setBounds(wb2Var2.o5 - hl.L(8.0f), wb2Var2.p5 - hl.L(8.0f), hl.L(32.0f) + wb2Var2.o5, hl.L(32.0f) + wb2Var2.p5);
                        drawableArr[0].setHotspot(x, P1);
                        drawableArr[0].setState(iArr2);
                    }
                    h();
                    wb2Var2.invalidate();
                    return true;
                }
                if (wb2Var2.Q5.M0) {
                    h();
                    wb2Var2.invalidate();
                    return false;
                }
                h();
                int i10 = 0;
                boolean z4 = false;
                while (i10 < arrayList.size()) {
                    i = i6;
                    vb2 vb2Var3 = (vb2) arrayList.get(i10);
                    int L = (vb2Var3.b + wb2Var2.gb) - hl.L(13.0f);
                    StaticLayout staticLayout = vb2Var3.p;
                    if (staticLayout != null && (staticLayout.getText() instanceof Spannable)) {
                        float f = x;
                        float f2 = vb2Var3.m;
                        if (f >= f2) {
                            float f3 = P1;
                            float f4 = vb2Var3.n;
                            if (f3 >= f4 && !wb2Var2.Q5.t1) {
                                int i11 = x - ((int) f2);
                                int i12 = P1 - ((int) f4);
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    iArr = iArr3;
                                }
                                if (i12 <= vb2Var3.p.getHeight()) {
                                    int lineForVertical = vb2Var3.p.getLineForVertical(i12);
                                    float f5 = i11;
                                    int offsetForHorizontal = vb2Var3.p.getOffsetForHorizontal(lineForVertical, f5);
                                    float lineLeft = vb2Var3.p.getLineLeft(lineForVertical);
                                    if (lineLeft <= f5 && lineLeft + vb2Var3.p.getLineWidth(lineForVertical) >= f5) {
                                        Spannable spannable = (Spannable) vb2Var3.p.getText();
                                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                        if (clickableSpanArr.length != 0 && ((!(clickableSpanArr[i] instanceof c8c) || c8c.h) && !hl.A1())) {
                                            q66 q66Var2 = wb2Var2.r4;
                                            if (q66Var2 != null) {
                                                iArr = iArr3;
                                                try {
                                                    z3 = z4;
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    z2 = true;
                                                    cc4.g(e, z2);
                                                    i3 = vb2Var3.a;
                                                    if (x >= i3) {
                                                        if (P1 > hl.L(26.0f) + L + vb2Var3.c) {
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
                                                    cc4.g(e, z2);
                                                    i3 = vb2Var3.a;
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
                                            m66Var.l(q66Var2, true);
                                            ClickableSpan clickableSpan = clickableSpanArr[i];
                                            vnb vnbVar = wb2Var2.cc;
                                            float[] fArr = wb2.Id;
                                            q66 q66Var3 = new q66(clickableSpan, vnbVar, f, f3, 0);
                                            wb2Var2.r4 = q66Var3;
                                            q66Var3.d(aob.v0(wb2Var2.Q5.O3() ? aob.Dc : aob.Ce, wb2Var2.cc));
                                            wb2Var2.y0 = i10;
                                            wb2Var2.v4 = 4;
                                            wb2Var2.x();
                                            try {
                                                f66 b = wb2Var2.r4.b();
                                                int[] Z1 = wb2.Z1(spannable, wb2Var2.r4.i);
                                                b.d(vb2Var3.p, Z1[i], 0.0f);
                                                vb2Var3.p.getSelectionPath(Z1[i], Z1[1], b);
                                            } catch (Exception e4) {
                                                cc4.g(e4, true);
                                            }
                                            m66Var.a(wb2Var2.r4, 4);
                                            try {
                                                wb2Var2.invalidate();
                                            } catch (Exception e5) {
                                                e = e5;
                                                z2 = true;
                                                z4 = true;
                                                cc4.g(e, z2);
                                                i3 = vb2Var3.a;
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
                    i3 = vb2Var3.a;
                    if (x >= i3 && x <= (i3 + wb2Var2.b7) - hl.L(31.0f) && P1 >= L) {
                        if (P1 > hl.L(26.0f) + L + vb2Var3.c) {
                            wb2Var2.i5 = i10;
                            kh8 kh8Var = vb2Var3.x;
                            boolean z5 = (kh8Var == null || !kh8Var.h || x <= (vb2Var3.a + wb2Var2.b7) - hl.L(81.0f)) ? i : 1;
                            this.F = z5;
                            if (z5 == 0) {
                                iArr[i] = 1;
                                vb2Var3.w.setHotspot(x, P1);
                                vb2Var3.w.setState(iArr2);
                                wb2Var2.invalidate();
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
                if (!z4 && this.s && (wg8Var = this.l) != null) {
                    hf0 hf0Var = wg8Var.a;
                    if (wg8Var.getBounds().contains(x, P1)) {
                        hf0Var.setHotspot(x, P1);
                        hf0Var.setState(wg8Var.e);
                        i2 = i;
                    } else {
                        i2 = -1;
                    }
                    wb2Var2.t5 = i2;
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
        mh8 mh8Var;
        mh8 mh8Var2;
        wb2 wb2Var = this.a;
        r47 r47Var = wb2Var.Q5;
        if (r47Var != null && r47Var.D == 17 && !r47Var.n4()) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int P1 = (int) wb2Var.P1(motionEvent);
            mh8 mh8Var3 = this.m;
            if (mh8Var3 != null) {
                if (mh8Var3.Y && mh8Var3.a.f && mh8Var3.L.e(x - mh8Var3.M, P1 - mh8Var3.N, action)) {
                    if (action == 0) {
                        wb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
                mh8 mh8Var4 = this.m;
                if ((mh8Var4.Y || mh8Var4.X) && mh8Var4.k(x, P1, action)) {
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
            }
            if (wb2Var.Q5.L0 && (mh8Var2 = this.n) != null) {
                if (mh8Var2.Y && mh8Var2.a.f && mh8Var2.L.e(x - mh8Var2.M, P1 - mh8Var2.N, action)) {
                    if (action == 0) {
                        wb2Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
                mh8 mh8Var5 = this.n;
                if ((mh8Var5.Y || mh8Var5.X) && mh8Var5.k(x, P1, action)) {
                    wb2Var.g1 = true;
                    wb2Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = (byte) -1;
                mh8 mh8Var6 = this.m;
                if (mh8Var6 != null && mh8Var6.T && mh8Var6.getBounds().contains(x, P1)) {
                    this.G = (byte) -2;
                    wb2Var.invalidate();
                    return true;
                }
                if (wb2Var.Q5.L0 && (mh8Var = this.n) != null && mh8Var.T && mh8Var.getBounds().contains(x, P1)) {
                    this.G = (byte) -3;
                    wb2Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                wb2Var.playSoundEffect(0);
                byte b = this.G;
                if (b == -2) {
                    mh8 mh8Var7 = this.m;
                    ImageReceiver imageReceiver = mh8Var7.b;
                    TLRPC.MessageMedia messageMedia = mh8Var7.U;
                    rb2 rb2Var = wb2Var.eb;
                    if (rb2Var != null) {
                        rb2Var.m(wb2Var, null, messageMedia, -2);
                    }
                } else if (b == -3) {
                    mh8 mh8Var8 = this.n;
                    ImageReceiver imageReceiver2 = mh8Var8.b;
                    TLRPC.MessageMedia messageMedia2 = mh8Var8.U;
                    rb2 rb2Var2 = wb2Var.eb;
                    if (rb2Var2 != null) {
                        rb2Var2.m(wb2Var, null, messageMedia2, -3);
                    }
                }
                this.G = (byte) -1;
                wb2Var.invalidate();
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
        wb2 wb2Var = this.a;
        CheckBoxBase[] checkBoxBaseArr = wb2Var.f7;
        if (checkBoxBaseArr != null) {
            if (checkBoxBaseArr.length != i) {
                int i2 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = wb2Var.f7;
                    if (i2 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i2].l = false;
                    i2++;
                }
            }
            if (this.I != null) {
                this.I = new lc0(wb2Var.a6, wb2Var, hl.L(16.0f), hl.L(7.0f), hl.N(1.0f));
                return;
            }
            return;
        }
        wb2Var.f7 = new CheckBoxBase[i];
        int i3 = 0;
        while (true) {
            CheckBoxBase[] checkBoxBaseArr3 = wb2Var.f7;
            if (i3 >= checkBoxBaseArr3.length) {
                break;
            }
            checkBoxBaseArr3[i3] = new CheckBoxBase(20, wb2Var.cc, wb2Var);
            wb2Var.f7[i3].k(false);
            wb2Var.f7[i3].j(true);
            wb2Var.f7[i3].d(9);
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
        wb2 wb2Var;
        Drawable[] drawableArr;
        RectF rectF;
        int i6;
        float f4;
        dc2 dc2Var;
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
        t37 t37Var;
        ai8 ai8Var;
        hn hnVar;
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
        kh8 kh8Var;
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
        wb2 wb2Var2 = this.a;
        ArrayList arrayList3 = wb2Var2.Q4;
        int[] iArr2 = wb2Var2.L2;
        Drawable[] drawableArr2 = wb2Var2.J2;
        RectF rectF3 = wb2Var2.c4;
        dc2 dc2Var2 = wb2Var2.ub;
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = currentTimeMillis - this.D;
        if (j4 > 17) {
            j4 = 17;
        }
        this.D = currentTimeMillis;
        if (wb2Var2.Q5.O3()) {
            a2 = wb2Var2.a2(aob.Wc);
            a22 = wb2Var2.a2(wb2Var2.A2() ? aob.ec : aob.jc);
            a23 = wb2Var2.a2(aob.Yc);
        } else {
            a2 = wb2Var2.a2(aob.Vc);
            a22 = wb2Var2.a2(wb2Var2.A2() ? aob.fe : aob.ee);
            a23 = wb2Var2.a2(aob.Xc);
        }
        aob.O2.setColor(a2);
        TextPaint textPaint = aob.P2;
        textPaint.linkColor = a23;
        textPaint.setColor(a2);
        aob.M2.setColor(a2);
        aob.T2.setColor(a22);
        aob.F2.setColor(a22);
        aob.I2.setColor(a22);
        canvas4.save();
        int i37 = wb2Var2.Q5.L0 ? this.g : 0;
        if (dc2Var2.i3) {
            float f18 = i37;
            f = hl.R1(dc2Var2.h3 ? this.g : 0.0f, f18, dc2Var2.L1);
            float f19 = f - f18;
            canvas4.translate(0.0f, f19);
            f2 = f19;
        } else {
            f = i37;
            f2 = 0.0f;
        }
        float f20 = f2;
        if (dc2Var2.G2) {
            int i38 = wb2Var2.gb;
            i = a2;
            i2 = a22;
            f3 = 0.0f;
            canvas4.translate(0.0f, hl.U1(dc2Var2.L1, dc2Var2.H2, i38) + (-i38));
        } else {
            i = a2;
            i2 = a22;
            if (dc2Var2.u2) {
                float f21 = wb2Var2.gb;
                float f22 = dc2Var2.L1;
                float A = qd4.A(1.0f, f22, dc2Var2.v2, f21 * f22);
                if (wb2Var2.Q5.m5()) {
                    A -= wb2Var2.gb;
                }
                f3 = 0.0f;
                canvas4.translate(0.0f, A);
            } else {
                f3 = 0.0f;
            }
        }
        if (dc2Var2.x0) {
            canvas4.translate(f3, dc2Var2.k0);
        }
        if (wb2Var2.Q5.O3()) {
            L = hl.L(11.0f) + (wb2Var2.d7 - wb2Var2.b7);
        } else {
            L = wb2Var2.Y6 ? hl.L(91.0f) : wb2Var2.b3() ? hl.L(68.0f) : hl.L(20.0f);
        }
        boolean z = dc2Var2.x0;
        if (z) {
            L += dc2Var2.h0;
        }
        float f23 = L;
        float f24 = wb2Var2.b7;
        if (z) {
            f24 += dc2Var2.i0 - dc2Var2.h0;
        }
        float f25 = f24;
        int L3 = (int) (f23 - hl.L(9.0f));
        float f26 = f23 + f25;
        int L4 = (int) (f26 - hl.L(22.0f));
        if (f > hl.L(8.0f)) {
            if (wb2Var2.n8 == null) {
                wb2Var2.n8 = new ab9(wb2Var2);
            }
            RectF rectF4 = hl.P;
            rectF4.set(0.0f, hl.L(5.0f), f25 - hl.L(33.0f), f - hl.L(3.0f));
            rectF4.offset(f23 + hl.L(1.0f), ((((hl.L(10.0f) + wb2Var2.gb) + this.q) + wb2Var2.u3) + i37) - f);
            wb2Var2.n8.a(wb2Var2.Q5, wb2Var2.va, wb2Var2.wa, wb2Var2.cc, 3);
            int i39 = a23;
            i5 = i37;
            int i40 = i2;
            iArr = iArr2;
            drawableArr = drawableArr2;
            i4 = L4;
            j = j4;
            int i41 = i;
            wb2Var2.n8.d(canvas, rectF4, 5.0f, 5.0f, 5.0f, 1.0f, true, false);
            canvas4 = canvas;
            wb2Var2.n8.f(canvas4, rectF4, 1.0f);
            if (wb2Var2.q3 != null) {
                int color = aob.a3.getColor();
                aob.a3.setColor(i41);
                canvas4.save();
                canvas4.clipRect(rectF4);
                mh8 mh8Var = this.n;
                if (mh8Var != null && mh8Var.T) {
                    int L5 = hl.L(10.0f) + ((int) rectF4.left);
                    int L6 = (((int) (rectF4.top + (this.g - hl.L(8.0f)))) - this.f) - hl.L(8.0f);
                    this.n.setBounds(L5, L6, this.e + L5, this.f + L6);
                    this.n.b(wb2Var2.Q5.N3());
                    mh8 mh8Var2 = this.n;
                    wb2Var2.a2(wb2Var2.Q5.N3() ? aob.Ec : aob.Ze);
                    pkb pkbVar = mh8Var2.r;
                    if (pkbVar != null) {
                        pkbVar.m(i41);
                    }
                    pkb pkbVar2 = mh8Var2.s;
                    if (pkbVar2 != null) {
                        pkbVar2.m(i40);
                    }
                    this.n.draw(canvas4);
                }
                if (this.c != null) {
                    int color2 = aob.Y2.getColor();
                    aob.Y2.setColor(wb2Var2.n8.h());
                    canvas4.save();
                    canvas4.translate(rectF4.left + hl.L(10.0f), rectF4.top + hl.L(6.0f));
                    this.c.draw(canvas4);
                    canvas4.restore();
                    aob.Y2.setColor(color2);
                    if (this.h != null) {
                        if (this.i != wb2Var2.n8.h()) {
                            this.i = wb2Var2.n8.h();
                            this.h.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.SRC_IN));
                        }
                        wb2Var2.w5 = ((int) rectF4.right) - hl.L(16.33f);
                        wb2Var2.x5 = hl.L(16.33f) + ((int) rectF4.top);
                        canvas4.save();
                        canvas4.scale(0.85f, 0.85f, wb2Var2.w5, wb2Var2.x5);
                        int A2 = bp1.A(2, wb2Var2.w5, this.h);
                        int y = bp1.y(2, wb2Var2.x5, this.h);
                        Drawable drawable = this.h;
                        drawable.setBounds(A2, y, drawable.getIntrinsicWidth() + A2, this.h.getIntrinsicHeight() + y);
                        this.h.draw(canvas4);
                        canvas4.restore();
                    }
                }
                aob.b3.setColor(aob.a3.getColor());
                aob.b3.linkColor = i39;
                float L7 = rectF4.left + hl.L(10.0f);
                wb2Var2.u5 = L7;
                float L8 = rectF4.top + hl.L(25.0f);
                wb2Var2.v5 = L8;
                p47 p47Var = wb2Var2.q3;
                i6 = i40;
                i3 = L3;
                rectF = rectF3;
                dc2Var = dc2Var2;
                i = i41;
                f4 = 1.0f;
                arrayList = arrayList3;
                wb2Var2.f1(L7, L8, canvas, p47Var.e, p47Var.d, true, 1.0f, true, false, false, true);
                float L9 = rectF4.left + hl.L(10.0f);
                float L10 = rectF4.top + hl.L(25.0f);
                p47 p47Var2 = wb2Var2.q3;
                wb2Var2.I0(L9, L10, canvas, p47Var2.e, wb2Var2.Qa, true, 1.0f, p47Var2.d, true);
                wb2Var = wb2Var2;
                canvas4 = canvas;
                canvas4.restore();
                aob.a3.setColor(color);
            } else {
                f4 = 1.0f;
                i6 = i40;
                i3 = L3;
                rectF = rectF3;
                dc2Var = dc2Var2;
                i = i41;
                arrayList = arrayList3;
                wb2Var = wb2Var2;
            }
        } else {
            i3 = L3;
            i4 = L4;
            j = j4;
            i5 = i37;
            wb2Var = wb2Var2;
            drawableArr = drawableArr2;
            rectF = rectF3;
            i6 = i2;
            f4 = 1.0f;
            dc2Var = dc2Var2;
            arrayList = arrayList3;
            iArr = iArr2;
        }
        if (wb2Var.o2 != null) {
            canvas4.save();
            canvas4.translate(f23 + wb2Var.getExtraTextX(), hl.L(15.0f) + wb2Var.gb + this.q + wb2Var.u3 + i5);
            int alpha = aob.O2.getAlpha();
            if (dc2Var.l3 != null) {
                aob.O2.setAlpha((int) (dc2Var.L1 * alpha));
            }
            wb2Var.o2.draw(canvas4);
            StaticLayout staticLayout2 = wb2Var.o2;
            hm.drawAnimatedEmojis(canvas4, staticLayout2, wb2Var.Pa, 0.0f, null, 0.0f, 0.0f, 0.0f, dc2Var.l3 != null ? dc2Var.L1 : f4, wb2Var.L1(1, staticLayout2.getPaint().getColor()));
            if (dc2Var.l3 != null) {
                aob.O2.setAlpha(alpha);
            }
            int height = wb2Var.o2.getHeight();
            if (dc2Var.l3 != null) {
                aob.O2.setAlpha((int) ((f4 - dc2Var.L1) * alpha));
                dc2Var.l3.draw(canvas4);
                aob.O2.setAlpha(alpha);
                StaticLayout staticLayout3 = dc2Var.l3;
                hm.drawAnimatedEmojis(canvas4, staticLayout3, dc2Var.m3, 0.0f, null, 0.0f, 0.0f, 0.0f, f4 - dc2Var.L1, wb2Var.L1(1, staticLayout3.getPaint().getColor()));
                i7 = hl.U1(dc2Var.L1, dc2Var.l3.getHeight(), height);
            } else {
                i7 = height;
            }
            canvas4.restore();
        } else {
            i7 = 0;
        }
        mh8 mh8Var3 = this.m;
        if (mh8Var3 == null || !mh8Var3.T) {
            i8 = i6;
            i9 = i;
            f5 = f23;
        } else {
            int L11 = (hl.L(wb2Var.gb > 0 ? 11.0f : 5.0f) + wb2Var.gb) - ((int) f20);
            f5 = f23;
            int L12 = hl.L(2.0f) + (((int) f5) - hl.L(9.0f));
            this.m.setBounds(L12, L11, this.o + L12, this.p + L11);
            this.m.b(wb2Var.Q5.N3());
            mh8 mh8Var4 = this.m;
            wb2Var.a2(wb2Var.Q5.N3() ? aob.Ec : aob.Ze);
            pkb pkbVar3 = mh8Var4.r;
            i9 = i;
            if (pkbVar3 != null) {
                pkbVar3.m(i9);
            }
            pkb pkbVar4 = mh8Var4.s;
            i8 = i6;
            if (pkbVar4 != null) {
                pkbVar4.m(i8);
            }
            this.m.draw(canvas4);
        }
        int L13 = hl.L(20.0f) + i7 + wb2Var.gb + this.q + wb2Var.u3 + i5;
        if (wb2Var.e3 != null) {
            canvas4.save();
            canvas4.translate(wb2Var.g3 + f5 + wb2Var.getExtraTextX(), L13);
            wb2Var.e3.draw(canvas4);
            canvas4.restore();
            TLRPC.MessageMedia n1 = r47.n1(wb2Var.Q5.k);
            if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1;
                if (!tL_messageMediaPoll.poll.quiz || (!(wb2Var.W4 || wb2Var.X4 || wb2Var.Y4 || (this.x && (!this.v || this.w))) || TextUtils.isEmpty(tL_messageMediaPoll.results.solution))) {
                    f6 = 2.0f;
                    f7 = 0.3f;
                    i10 = 2;
                    wb2Var.o5 = -1;
                } else {
                    Drawable b2 = wb2Var.b2(wb2Var.Q5.O3() ? "drawable_chat_pollHintDrawableOut" : "drawable_chat_pollHintDrawableIn");
                    if (wb2Var.Z4) {
                        b2.setAlpha((int) (this.r * 255.0f));
                    } else {
                        b2.setAlpha(jn7.d4);
                    }
                    wb2Var.o5 = (int) (((f26 - hl.L(23.0f)) - b2.getIntrinsicWidth()) - hl.L(8.0f));
                    wb2Var.p5 = L13 - hl.L(6.0f);
                    int w = bp1.w(2, wb2Var.o5, b2);
                    f7 = 0.3f;
                    int i42 = bp1.i(2, wb2Var.p5, b2);
                    i10 = 2;
                    if (wb2Var.r5) {
                        float f27 = wb2Var.s5;
                        if (f27 < f4) {
                            f6 = 2.0f;
                            f17 = sn.a.getInterpolation(f27);
                            int intrinsicWidth = ((int) (b2.getIntrinsicWidth() * f17)) / 2;
                            int intrinsicHeight = ((int) (b2.getIntrinsicHeight() * f17)) / 2;
                            b2.setBounds(w - intrinsicWidth, i42 - intrinsicHeight, w + intrinsicWidth, i42 + intrinsicHeight);
                            b2.draw(canvas4);
                        }
                    }
                    f6 = 2.0f;
                    f17 = wb2Var.s5;
                    int intrinsicWidth2 = ((int) (b2.getIntrinsicWidth() * f17)) / 2;
                    int intrinsicHeight2 = ((int) (b2.getIntrinsicHeight() * f17)) / 2;
                    b2.setBounds(w - intrinsicWidth2, i42 - intrinsicHeight2, w + intrinsicWidth2, i42 + intrinsicHeight2);
                    b2.draw(canvas4);
                }
            } else {
                f6 = 2.0f;
                f7 = 0.3f;
                i10 = 2;
                wb2Var.o5 = -1;
            }
            if (this.I == null || wb2Var.j6) {
                r12 = 0;
            } else {
                r12 = 0;
                int ceil = (int) Math.ceil(wb2Var.e3.getLineLeft(0));
                int i43 = wb2Var.g3;
                if (i43 == 0 && ceil == 0) {
                    f16 = ((int) Math.ceil(wb2Var.e3.getLineWidth(0))) + f5 + hl.L(7.0f) + wb2Var.getExtraTextX();
                } else {
                    if (i43 != 0) {
                        L2 = (i43 + f5) - hl.L(23.0f);
                        extraTextX = wb2Var.getExtraTextX();
                    } else {
                        L2 = (ceil + f5) - hl.L(23.0f);
                        extraTextX = wb2Var.getExtraTextX();
                    }
                    f16 = L2 - extraTextX;
                }
                if (wb2Var.c5 && this.C) {
                    lc0 lc0Var = this.I;
                    boolean z2 = wb2Var.b5;
                    float f28 = this.r;
                    if (z2) {
                        f28 = (f4 - f28) / f7;
                    }
                    lc0Var.setAlpha((int) (ete.a(f28, 0.0f, f4) * 255.0f));
                } else {
                    this.I.setAlpha(jn7.d4);
                }
                this.I.setBounds((int) f16, L13 - hl.L(1.0f), (int) (this.I.c.d.f.a + f16), hl.L(16.0f) + (L13 - hl.L(1.0f)));
                lc0 lc0Var2 = this.I;
                Paint paint = wb2Var.L6.c;
                lc0Var2.c(canvas4);
            }
        } else {
            f6 = 2.0f;
            r12 = 0;
            f7 = 0.3f;
            i10 = 2;
        }
        if (((wb2Var.X4 || wb2Var.W4 || wb2Var.Y4) && !wb2Var.Z4) || (poll2 = wb2Var.j5) == null || !poll2.quiz || poll2.close_period == 0 || !wb2Var.j6) {
            i11 = i9;
            i12 = i8;
            f8 = 13.0f;
            i13 = -1;
            j2 = j;
        } else {
            i12 = i8;
            long max = Math.max(0L, (wb2Var.j5.close_date * 1000) - ConnectionsManager.getInstance(wb2Var.a6).getCurrentTimeMillis());
            i11 = i9;
            if (this.z != null) {
                f15 = 1000.0f;
            } else {
                f15 = 1000.0f;
            }
            this.z = hl.h0((int) Math.ceil(max / f15), r12);
            this.A = (int) Math.ceil(aob.T2.measureText(r6));
            this.y = max;
            if (max <= 0 && !wb2Var.X4) {
                if (wb2Var.Q5.w0 + 1000 < SystemClock.elapsedRealtime()) {
                    wb2Var.Q5.w0 = 0L;
                }
                wb2Var.eb.d2();
            }
            int L14 = (wb2Var.L6.getBounds().right - this.A) - hl.L(wb2Var.Q5.O3() ? 40.0f : 34.0f);
            if (max <= 5000) {
                aob.T2.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.ha : aob.ga));
            }
            if (this.B) {
                aob.T2.setAlpha((int) ((1.0f - this.r) * 255.0f));
            }
            float f29 = f15;
            canvas4.drawText(this.z, L14, hl.L(11.0f) + L13, aob.T2);
            aob.Z1.setColor(aob.T2.getColor());
            int w2 = uh9.w(13.0f, this.A, L14);
            int L15 = hl.L(5.1f);
            int L16 = hl.L(6.0f) + L13;
            if (max <= 60000) {
                f8 = 13.0f;
                RectF rectF5 = rectF;
                rectF5.set(w2 - L15, L16 - L15, w2 + L15, L15 + L16);
                float min = (max / (Math.min(60, wb2Var.j5.close_period) * f29)) * (-360.0f);
                i13 = -1;
                canvas4.drawArc(rectF5, -90.0f, min, false, aob.Z1);
                wb2Var.m5.a(min, wb2Var.Z4 ? 1.0f - this.r : 1.0f, canvas, aob.Z1, rectF5);
                canvas4 = canvas;
                rectF = rectF5;
            } else {
                f8 = 13.0f;
                i13 = -1;
                canvas4.drawCircle(w2, L16, L15, aob.Z1);
            }
            if (max > 60000 || this.H != 0.0f) {
                aob.Z1.setAlpha((int) (this.H * 255.0f));
                float f30 = w2;
                canvas4.drawLine(f30 - (hl.L(2.1f) * this.H), L16 - hl.L(7.5f), (hl.L(2.1f) * this.H) + f30, L16 - hl.L(7.5f), aob.Z1);
                float f31 = L16;
                canvas4 = canvas;
                canvas4.drawLine(f30, f31 - (hl.L(3.0f) * this.H), f30, f31, aob.Z1);
                if (max <= 60000) {
                    j2 = j;
                    float f32 = this.H - (j2 / 180.0f);
                    this.H = f32;
                    if (f32 < 0.0f) {
                        this.H = 0.0f;
                    }
                    wb2Var.invalidate();
                }
            }
            j2 = j;
            wb2Var.invalidate();
        }
        if (drawableArr[r12] != null && ((i36 = iArr[r12]) == 1 || i36 == 3)) {
            if (i36 == 3) {
                canvas4.save();
                float f33 = wb2Var.s5;
                canvas4.scale(f33, f33, drawableArr[r12].getBounds().centerX(), drawableArr[r12].getBounds().centerY());
            }
            drawableArr[r12].draw(canvas4);
            if (iArr[r12] == 3) {
                canvas4.restore();
            }
        }
        boolean C4 = wb2Var.Q5.C4();
        TLRPC.Poll poll3 = wb2Var.j5;
        boolean z3 = (poll3 == null || !poll3.multiple_choice) ? r12 : true;
        boolean z4 = (C4 && wb2Var.Q5.q()) ? true : r12;
        boolean z5 = (wb2Var.W4 && !this.w && this.v) ? true : r12;
        if (!this.C || z5) {
            f9 = 255.0f;
        } else {
            boolean z6 = wb2Var.b5;
            float f34 = this.r;
            if (z6) {
                f34 = 1.0f - f34;
            }
            f9 = Math.min(f34 / f7, 1.0f) * 255.0f;
        }
        int i44 = (int) f9;
        int max2 = Math.max(wb2Var.S4, (int) r12);
        while (true) {
            int i45 = wb2Var.T4;
            if (i45 == i13) {
                i45 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (max2 > Math.min(i45, arrayList.size() - 1)) {
                break;
            }
            ArrayList arrayList4 = arrayList;
            vb2 vb2Var = (vb2) arrayList4.get(max2);
            vb2Var.a = (int) f5;
            int i46 = vb2Var.b;
            int i47 = vb2Var.c;
            if (vb2Var.A != null) {
                i46 = hl.U1(dc2Var.L1, vb2Var.C, i46);
                i47 = hl.U1(dc2Var.L1, vb2Var.D, i47);
            }
            int i48 = i47;
            TLRPC.TodoItem todoItem = vb2Var.t;
            if ((todoItem == null || todoItem.id != wb2Var.c6) && (((bArr = wb2Var.e6) == null || Arrays.equals(vb2Var.s.option, bArr)) && ((pollAnswer = vb2Var.s) == null || (bArr2 = pollAnswer.option) == null || !Arrays.equals(bArr2, wb2Var.d6)))) {
                canvas4.save();
                int i49 = i12;
                int p1 = aob.p1(0.12f, i49);
                if (vb2Var.v != p1) {
                    hf0 hf0Var = vb2Var.w;
                    vb2Var.v = p1;
                    i18 = i44;
                    aob.F1(hf0Var, p1, false);
                } else {
                    i18 = i44;
                }
                long j5 = j2;
                vb2Var.w.setBounds((int) (f5 - hl.L(8.0f)), (wb2Var.gb + i46) - hl.L(f8), (int) (f26 - hl.L(23.0f)), hl.L(f8) + wb2Var.gb + i46 + i48);
                vb2Var.w.draw(canvas4);
                canvas4.restore();
                kh8 kh8Var2 = vb2Var.x;
                if (kh8Var2 != null) {
                    i19 = i3;
                    i21 = i4;
                    kh8Var2.setBounds(i19, (wb2Var.gb + i46) - hl.L(f8), i21, hl.L(f8) + wb2Var.gb + i46 + i48);
                    i20 = i11;
                    vb2Var.x.k(i20);
                    kh8 kh8Var3 = vb2Var.x;
                    Paint paint2 = wb2Var.L6.c;
                    kh8Var3.c(canvas4);
                } else {
                    i19 = i3;
                    i20 = i11;
                    i21 = i4;
                }
                canvas4.save();
                vb2Var.m = hl.L(z4 ? 48.0f : 35.0f) + f5;
                vb2Var.n = wb2Var.gb + i46;
                canvas4.translate(hl.L(z4 ? 48.0f : 35.0f) + f5, i46 + wb2Var.gb);
                if (dc2Var.x0) {
                    canvas4.translate(0.0f, dc2Var.k0);
                }
                int alpha2 = aob.P2.getAlpha();
                if (vb2Var.A != null) {
                    i22 = alpha2;
                    aob.P2.setAlpha((int) (alpha2 * dc2Var.L1));
                } else {
                    i22 = alpha2;
                }
                canvas4.save();
                if (C4 && z4 && vb2Var.q != null && (checkBoxBase2 = wb2Var.f7[max2]) != null) {
                    float progress = checkBoxBase2.getProgress();
                    canvas4.translate(0.0f, (-hl.L(7.66f)) * progress);
                    vb2Var.n = ((-hl.L(7.66f)) * progress) + vb2Var.n;
                }
                if (max2 == wb2Var.y0 && wb2Var.u4.h(canvas4, 4)) {
                    wb2Var.invalidate();
                }
                if (vb2Var.o && (kh8Var = vb2Var.x) != null) {
                    canvas4.translate(-kh8Var.d(hl.L(7.0f)), 0.0f);
                }
                vb2Var.p.draw(canvas4);
                StaticLayout staticLayout4 = vb2Var.p;
                dm dmVar = vb2Var.r;
                if (vb2Var.A != null) {
                    int i50 = i20;
                    f12 = dc2Var.L1;
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
                hm.drawAnimatedEmojis(canvas, staticLayout4, dmVar, 0.0f, null, 0.0f, 0.0f, 0.0f, f12, wb2Var.L1(1, staticLayout4.getPaint().getColor()));
                if (vb2Var.A != null) {
                    aob.P2.setAlpha((int) ((1.0f - dc2Var.L1) * i51));
                    vb2Var.A.draw(canvas);
                    StaticLayout staticLayout5 = vb2Var.A;
                    hm.drawAnimatedEmojis(canvas, staticLayout5, vb2Var.B, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f - dc2Var.L1, wb2Var.L1(1, staticLayout5.getPaint().getColor()));
                    aob.P2.setAlpha(i51);
                }
                canvas.restore();
                if (C4 && z4 && vb2Var.q != null && (checkBoxBase = wb2Var.f7[i24]) != null) {
                    float progress2 = checkBoxBase.getProgress();
                    if (progress2 > 0.0f) {
                        pkb pkbVar5 = vb2Var.q;
                        pkbVar5.p = f25 - hl.L(8.0f);
                        pkbVar5.c(0.0f, (vb2Var.q.h() / f6) + (vb2Var.p.getHeight() - hl.L(6.0f)), progress2, i49, canvas);
                        i29 = i49;
                        canvas2 = canvas;
                        aob.P2.setAlpha(i51);
                        if (!C4 || ((!wb2Var.W4 || (!this.w && this.v)) && !wb2Var.X4 && !wb2Var.Y4 && ((!this.x || (this.v && !this.w)) && (!this.C || z5)))) {
                            rectF2 = rectF;
                            i30 = 2;
                        } else {
                            TLRPC.Poll poll4 = wb2Var.j5;
                            if (poll4 == null || !poll4.quiz) {
                                aob.S1.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.qc : aob.oe));
                            } else {
                                boolean z7 = vb2Var.l;
                                r47 r47Var = wb2Var.Q5;
                                int i52 = z7 ? r47Var.O3() ? aob.fa : aob.ea : r47Var.O3() ? aob.ha : aob.ga;
                                if (!wb2Var.L6.l() || aob.d1(i52)) {
                                    aob.S1.setColor(wb2Var.a2(i52));
                                } else {
                                    aob.S1.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.qc : aob.oe));
                                }
                            }
                            if (this.C && !z5) {
                                float f35 = i28;
                                aob.M2.setAlpha((int) ((aob.M2.getAlpha() / 255.0f) * f35));
                                aob.S1.setAlpha((int) (f35 * (aob.S1.getAlpha() / 255.0f)));
                            }
                            boolean z8 = vb2Var.i || vb2Var.k || ((poll = wb2Var.j5) != null && poll.quiz && vb2Var.l && (wb2Var.W4 || wb2Var.X4 || wb2Var.Y4 || (this.x && (!this.v || this.w))));
                            int i53 = vb2Var.f;
                            String format = String.format("%d%%", Integer.valueOf(ete.b((int) Math.ceil(((vb2Var.d - i53) * this.r) + i53), 0, 100)));
                            float ceil2 = (-hl.L(6.5f)) - ((int) Math.ceil(aob.M2.measureText(format)));
                            float L17 = hl.L(14.0f);
                            if (!z8 || (staticLayout = vb2Var.p) == null) {
                                i34 = 2;
                            } else {
                                i34 = 2;
                                if (staticLayout.getLineCount() < 2) {
                                    f14 = wb2Var.U4;
                                    canvas2.drawText(format, ceil2, L17 + f14, aob.M2);
                                    int L18 = wb2Var.b7 - hl.L(76.0f);
                                    float f36 = vb2Var.h;
                                    float f37 = ((vb2Var.g - f36) * this.r) + f36;
                                    if (z5) {
                                        int color3 = aob.S1.getColor();
                                        int alpha3 = Color.alpha(color3);
                                        float L19 = L18 - (this.u ? hl.L(37.33f) : 0);
                                        i35 = i25;
                                        aob.S1.setColor(vm2.o(i35, (alpha3 << 4) / jn7.d4));
                                        float f38 = f37 * L19;
                                        i30 = i34;
                                        rectF2 = rectF;
                                        rectF2.set(Math.max(f38 - hl.L(f6), 0.0f), hl.L(6.0f) + i48, L19, hl.L(11.0f) + i48);
                                        canvas2.drawRoundRect(rectF2, hl.L(f6), hl.L(f6), aob.S1);
                                        aob.S1.setColor(color3);
                                        rectF2.set(0.0f, hl.L(6.0f) + i48, f38, hl.L(11.0f) + i48);
                                        canvas2.drawRoundRect(rectF2, hl.L(f6), hl.L(f6), aob.S1);
                                    } else {
                                        i30 = i34;
                                        rectF2 = rectF;
                                        i35 = i25;
                                    }
                                    if (z8) {
                                        i25 = i35;
                                    } else {
                                        float L20 = rectF2.left - hl.L(15.5f);
                                        float centerY = rectF2.centerY() + wb2Var.U4;
                                        float L21 = hl.L(7.0f);
                                        float L22 = hl.L(z3 ? 4.5f : 7.0f);
                                        float f39 = L20 - L21;
                                        float f40 = centerY - L21;
                                        float f41 = L20 + L21;
                                        float f42 = centerY + L21;
                                        canvas2.saveLayerAlpha(f39, f40, f41, f42, i28);
                                        TLRPC.Poll poll5 = wb2Var.j5;
                                        Drawable drawable2 = (poll5 == null || !poll5.quiz || vb2Var.l) ? aob.K4[wb2Var.Q5.O3() ? 1 : 0] : aob.L4[wb2Var.Q5.O3() ? 1 : 0];
                                        jf0.w(drawable2, L20 - (drawable2.getIntrinsicWidth() / 2), centerY - (drawable2.getIntrinsicHeight() / 2));
                                        drawable2.draw(canvas2);
                                        if (wb2Var.qd == null) {
                                            Paint paint3 = new Paint(1);
                                            wb2Var.qd = paint3;
                                            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                                        }
                                        wb2Var.qd.setColor(aob.S1.getColor());
                                        i25 = i35;
                                        i28 = i28;
                                        canvas2.drawRoundRect(f39, f40, f41, f42, L22, L22, wb2Var.qd);
                                        canvas.restore();
                                    }
                                }
                            }
                            f14 = 0.0f;
                            canvas2.drawText(format, ceil2, L17 + f14, aob.M2);
                            int L182 = wb2Var.b7 - hl.L(76.0f);
                            float f362 = vb2Var.h;
                            float f372 = ((vb2Var.g - f362) * this.r) + f362;
                            if (z5) {
                            }
                            if (z8) {
                            }
                        }
                        if (!C4 || (!(wb2Var.W4 || wb2Var.X4 || wb2Var.Y4 || (this.x && (!this.v || this.w))) || z5 || this.C)) {
                            if (wb2Var.A2()) {
                                aob.a2.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.rc : aob.pe));
                            } else {
                                aob.a2.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.sc : aob.qe));
                            }
                            if (this.C && !z5) {
                                aob.a2.setAlpha((int) ((255 - i28) * (aob.a2.getAlpha() / 255.0f)));
                            }
                            canvas4 = canvas;
                            canvas4.drawLine(-hl.L(f6), hl.L(f8) + i48, f25 - hl.L(z4 ? 71.0f : 58.0f), hl.L(f8) + i48, aob.a2);
                            if (C4) {
                                if (wb2Var.Z4) {
                                    i31 = i24;
                                    if (i31 != wb2Var.d5 || z5) {
                                        rectF = rectF2;
                                        if (this.x || (this.v && !this.w)) {
                                            if (wb2Var.Q5.O3()) {
                                                aob.X1.setColor(wb2Var.a2(wb2Var.A2() ? aob.Lb : aob.Kb));
                                            } else {
                                                aob.X1.setColor(wb2Var.a2(wb2Var.A2() ? aob.sd : aob.rd));
                                            }
                                            if (this.C && !z5) {
                                                aob.X1.setAlpha((int) ((255 - i28) * (aob.X1.getAlpha() / 255.0f)));
                                            }
                                            float f43 = -hl.L(z4 ? 35.0f : 22.0f);
                                            float L23 = hl.L(9.0f);
                                            float L24 = hl.L(z3 ? 8.0f : 8.5f);
                                            if (z3) {
                                                i24 = i31;
                                                canvas.drawRoundRect(f43 - L24, L23 - L24, f43 + L24, L24 + L23, hl.L(4.0f), hl.L(4.0f), aob.X1);
                                                canvas3 = canvas;
                                            } else {
                                                i24 = i31;
                                                canvas3 = canvas;
                                                canvas3.drawCircle(f43, L23, L24, aob.X1);
                                                if (!z5) {
                                                }
                                            }
                                            int L25 = hl.L(z3 ? 8.0f : 8.5f);
                                            i32 = aob.k7;
                                            if (wb2Var.Q5.O3() && wb2Var.a2(i32) == -1) {
                                                i32 = aob.rb;
                                            }
                                            wb2Var.f7[i24].h(-1, wb2Var.Q5.O3() ? aob.qc : aob.oe, i32);
                                            i33 = L25 / 2;
                                            wb2Var.f7[i24].e((-hl.L(z4 ? 35.0f : 22.0f)) - i33, hl.L(9.0f) - i33, L25, L25);
                                            wb2Var.f7[i24].i(z3 ? hl.L(5.0f) : 0.0f);
                                            wb2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                                            wb2Var.f7[i24].a(canvas3);
                                            if (vb2Var.t != null && vb2Var.z != null) {
                                                if (this.J == null) {
                                                    Paint paint4 = new Paint(1);
                                                    this.J = paint4;
                                                    paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                                }
                                                float progress3 = wb2Var.f7[i24].getProgress();
                                                float R1 = hl.R1(0.5f, 1.0f, progress3);
                                                vb2Var.z.i0(hl.L(8.0f) + ((-hl.L(!z4 ? 35.0f : 22.0f)) - i33), hl.L(9.0f) - (hl.L(20.0f) / 2), hl.L(20.0f), hl.L(20.0f));
                                                ImageReceiver imageReceiver = vb2Var.z;
                                                canvas4 = canvas;
                                                canvas4.saveLayerAlpha(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), vb2Var.z.x(), jn7.d4, 31);
                                                canvas4.save();
                                                ImageReceiver imageReceiver2 = vb2Var.z;
                                                canvas4.scale(R1, R1, imageReceiver2.L0, imageReceiver2.s());
                                                vb2Var.z.setAlpha(progress3);
                                                vb2Var.z.g(canvas4);
                                                canvas4.restore();
                                                canvas4.drawCircle(-hl.L(z4 ? 35.0f : 22.0f), hl.L(9.0f), hl.L(11.0f), this.J);
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
                                        aob.X1.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.qc : aob.oe));
                                        if (this.C && !z5) {
                                            aob.X1.setAlpha((int) ((255 - i28) * (aob.X1.getAlpha() / 255.0f)));
                                        }
                                        rectF2.set((-hl.L(z4 ? 35.0f : 22.0f)) - hl.L(8.5f), hl.L(9.0f) - hl.L(8.5f), hl.L(8.5f) + (-hl.L(23.0f)), hl.L(8.5f) + hl.L(9.0f));
                                        RectF rectF6 = rectF2;
                                        canvas4.drawArc(rectF6, this.E, wb2Var.e5, false, aob.X1);
                                        rectF = rectF6;
                                        canvas4 = canvas;
                                        i24 = i31;
                                        canvas4.restore();
                                    }
                                }
                            } else if (!z4) {
                                if (vb2Var.i) {
                                    if (this.L == null) {
                                        Path path = new Path();
                                        this.L = path;
                                        path.moveTo(-hl.L(3.66f), hl.L(0.16f));
                                        this.L.lineTo(hl.L(-1.0f), hl.L(3.0f));
                                        this.L.lineTo(hl.L(3.66f), hl.L(-3.0f));
                                    }
                                    if (this.K == null) {
                                        Paint paint5 = new Paint(1);
                                        this.K = paint5;
                                        paint5.setStyle(Paint.Style.STROKE);
                                        this.K.setStrokeCap(Paint.Cap.ROUND);
                                        this.K.setStrokeJoin(Paint.Join.ROUND);
                                    }
                                    this.K.setStrokeWidth(hl.L(1.833f));
                                    this.K.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.qc : aob.oe));
                                    canvas4.save();
                                    canvas4.translate(-hl.L(z4 ? 35.0f : 22.0f), hl.L(9.0f));
                                    canvas4.drawPath(this.L, this.K);
                                    canvas4.restore();
                                } else {
                                    aob.a2.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.qc : aob.oe));
                                    canvas4.drawCircle(-hl.L(z4 ? 35.0f : 22.0f), hl.L(9.0f), hl.L(2.5f), aob.a2);
                                }
                            }
                            rectF = rectF2;
                            i31 = i24;
                            if (this.x) {
                            }
                            if (wb2Var.Q5.O3()) {
                            }
                            if (this.C) {
                                aob.X1.setAlpha((int) ((255 - i28) * (aob.X1.getAlpha() / 255.0f)));
                            }
                            float f432 = -hl.L(z4 ? 35.0f : 22.0f);
                            float L232 = hl.L(9.0f);
                            float L242 = hl.L(z3 ? 8.0f : 8.5f);
                            if (z3) {
                            }
                            int L252 = hl.L(z3 ? 8.0f : 8.5f);
                            i32 = aob.k7;
                            if (wb2Var.Q5.O3()) {
                                i32 = aob.rb;
                            }
                            wb2Var.f7[i24].h(-1, wb2Var.Q5.O3() ? aob.qc : aob.oe, i32);
                            i33 = L252 / 2;
                            wb2Var.f7[i24].e((-hl.L(z4 ? 35.0f : 22.0f)) - i33, hl.L(9.0f) - i33, L252, L252);
                            wb2Var.f7[i24].i(z3 ? hl.L(5.0f) : 0.0f);
                            wb2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                            wb2Var.f7[i24].a(canvas3);
                            if (vb2Var.t != null) {
                                if (this.J == null) {
                                }
                                float progress32 = wb2Var.f7[i24].getProgress();
                                float R12 = hl.R1(0.5f, 1.0f, progress32);
                                vb2Var.z.i0(hl.L(8.0f) + ((-hl.L(!z4 ? 35.0f : 22.0f)) - i33), hl.L(9.0f) - (hl.L(20.0f) / 2), hl.L(20.0f), hl.L(20.0f));
                                ImageReceiver imageReceiver3 = vb2Var.z;
                                canvas4 = canvas;
                                canvas4.saveLayerAlpha(imageReceiver3.L0, imageReceiver3.M0, imageReceiver3.w(), vb2Var.z.x(), jn7.d4, 31);
                                canvas4.save();
                                ImageReceiver imageReceiver22 = vb2Var.z;
                                canvas4.scale(R12, R12, imageReceiver22.L0, imageReceiver22.s());
                                vb2Var.z.setAlpha(progress32);
                                vb2Var.z.g(canvas4);
                                canvas4.restore();
                                canvas4.drawCircle(-hl.L(z4 ? 35.0f : 22.0f), hl.L(9.0f), hl.L(11.0f), this.J);
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
                aob.P2.setAlpha(i51);
                if (C4) {
                }
                rectF2 = rectF;
                i30 = 2;
                if (C4) {
                }
                if (wb2Var.A2()) {
                }
                if (this.C) {
                    aob.a2.setAlpha((int) ((255 - i28) * (aob.a2.getAlpha() / 255.0f)));
                }
                canvas4 = canvas;
                canvas4.drawLine(-hl.L(f6), hl.L(f8) + i48, f25 - hl.L(z4 ? 71.0f : 58.0f), hl.L(f8) + i48, aob.a2);
                if (C4) {
                }
                rectF = rectF2;
                i31 = i24;
                if (this.x) {
                }
                if (wb2Var.Q5.O3()) {
                }
                if (this.C) {
                }
                float f4322 = -hl.L(z4 ? 35.0f : 22.0f);
                float L2322 = hl.L(9.0f);
                float L2422 = hl.L(z3 ? 8.0f : 8.5f);
                if (z3) {
                }
                int L2522 = hl.L(z3 ? 8.0f : 8.5f);
                i32 = aob.k7;
                if (wb2Var.Q5.O3()) {
                }
                wb2Var.f7[i24].h(-1, wb2Var.Q5.O3() ? aob.qc : aob.oe, i32);
                i33 = L2522 / 2;
                wb2Var.f7[i24].e((-hl.L(z4 ? 35.0f : 22.0f)) - i33, hl.L(9.0f) - i33, L2522, L2522);
                wb2Var.f7[i24].i(z3 ? hl.L(5.0f) : 0.0f);
                wb2Var.f7[i24].l(z3 ? 19.0f : 20.0f);
                wb2Var.f7[i24].a(canvas3);
                if (vb2Var.t != null) {
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
            vb2 vb2Var2 = (vb2) c00.g(1, arrayList5);
            int i58 = vb2Var2.b;
            int i59 = vb2Var2.c;
            if (vb2Var2.A != null) {
                i58 = hl.U1(dc2Var.L1, vb2Var2.C, i58);
                i59 = hl.U1(dc2Var.L1, vb2Var2.D, i59);
            }
            i14 = wb2Var.gb + i58 + i59;
        }
        if (this.s) {
            i15 = dc2Var.V2 ? hl.U1(dc2Var.L1, dc2Var.X2, wb2Var.Q1) : wb2Var.Q1;
        } else {
            i15 = 0;
        }
        if (!this.s || this.l == null) {
            i16 = i57;
            i17 = i56;
        } else {
            int L26 = hl.L(f8) + i14;
            int L27 = hl.L(44.33f);
            wg8 wg8Var = this.l;
            TLRPC.Poll poll6 = wb2Var.j5;
            wg8Var.e(((poll6 == null || poll6.public_voters || poll6.multiple_choice) ? aob.I2 : aob.F2).getColor());
            i16 = i57;
            i17 = i56;
            this.l.setBounds(i16, L26, i17, L27 + L26);
            this.l.draw(canvas4);
            if (wb2Var.eb != null) {
                canvas4.save();
                canvas4.translate(i16, L26);
                wb2Var.eb.h1(wb2Var);
                canvas4.restore();
            }
            if ((!wb2Var.W4 && !wb2Var.X4 && !wb2Var.Y4) || z5 || this.C) {
                int color4 = aob.a2.getColor();
                if (wb2Var.A2()) {
                    aob.a2.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.sc : aob.qe));
                } else {
                    aob.a2.setColor(wb2Var.a2(wb2Var.Q5.O3() ? aob.rc : aob.pe));
                }
                if (this.C && !z5) {
                    aob.a2.setAlpha((int) ((255 - i54) * (aob.a2.getAlpha() / 255.0f)));
                }
                float f45 = L26 + i15;
                canvas4.drawLine((f44 + hl.L(35.0f)) - hl.L(f6), f45, ((f44 + hl.L(35.0f)) + f25) - hl.L(58.0f), f45, aob.a2);
                aob.a2.setColor(color4);
            }
        }
        if (this.s) {
            i14 += i15;
        }
        ai8 ai8Var2 = this.k;
        float b = ai8Var2 != null ? ai8Var2.b() : 0.0f;
        float f46 = (C4 || (hnVar = wb2Var.z3) == null || !hnVar.isVisible()) ? 0.0f : 1.0f;
        boolean z9 = wb2Var.u2;
        float f47 = z9 ? 1.0f : 0.0f;
        if (z9) {
            int L28 = hl.L((wb2Var.Q5.O3() || wb2Var.C6 || wb2Var.K) ? f6 : 8.0f) + wb2Var.getCurrentBackgroundLeft();
            int L29 = hl.L(f8) + i14;
            if (wb2Var.Q5.O3()) {
                aob.M2.setColor(wb2Var.a2(aob.Ob));
            } else {
                aob.M2.setColor(wb2Var.a2(aob.Bd));
            }
            f10 = b;
            wb2Var.M2.set(L28, L29, wb2Var.D2 + L28, hl.L(44.0f) + L29);
            Drawable drawable3 = drawableArr[0];
            if (drawable3 != null && iArr[0] == i55) {
                drawable3.setBounds(L28 - hl.L(this.b ? 6.0f : 0.0f), L29, wb2Var.D2 + L28, hl.L(44.0f) + L29);
                drawableArr[0].draw(canvas4);
            }
            if (wb2Var.Q5.S3() && (ai8Var = this.k) != null) {
                ai8Var.c(wb2Var.a2(wb2Var.Q5.O3() ? aob.Ob : aob.Bd));
                this.k.setBounds(i16, L29, i17, hl.L(44.0f) + L29);
                this.k.d((-hl.L(7.0f)) * f46);
                this.k.draw(canvas4);
            } else if (wb2Var.r2 != null) {
                canvas4.save();
                canvas4.translate(L28 + wb2Var.B2, hl.L(14.5f) + L29);
                wb2Var.r2.draw(canvas4);
                canvas4.restore();
            }
        } else {
            f10 = b;
            if (wb2Var.y3 != null) {
                float L30 = ((1.0f - f46) * hl.L(6.0f)) + hl.L(25.0f) + i14;
                canvas4.save();
                if (dc2Var.x0) {
                    canvas4.translate(((wb2Var.getBackgroundDrawableRight() + dc2Var.i0) + (wb2Var.getBackgroundDrawableLeft() + dc2Var.h0)) / f6, L30);
                } else {
                    canvas4.translate((wb2Var.getBackgroundDrawableRight() + wb2Var.getBackgroundDrawableLeft()) / f6, L30);
                }
                wb2Var.y3.setBounds(-1, -1, 1, 1);
                hn hnVar2 = wb2Var.y3;
                TLRPC.Poll poll7 = wb2Var.j5;
                hnVar2.u(((poll7 == null || poll7.public_voters || poll7.multiple_choice) ? aob.I2 : aob.F2).getColor());
                wb2Var.y3.draw(canvas4);
                canvas4.restore();
            }
        }
        if (C4 || wb2Var.z3 == null) {
            f11 = 1.0f;
        } else {
            float L31 = (hl.L(3.0f) * f47) + qd4.A(1.0f, f46, hl.L(6.0f), hl.L(41.0f) + i14);
            canvas4.save();
            if (dc2Var.x0) {
                canvas4.translate(((wb2Var.getBackgroundDrawableRight() + dc2Var.i0) + (wb2Var.getBackgroundDrawableLeft() + dc2Var.h0)) / f6, L31);
            } else {
                canvas4.translate((i16 + i17) / f6, L31);
            }
            wb2Var.z3.setBounds(-1, -1, 1, 1);
            hn hnVar3 = wb2Var.z3;
            TLRPC.Poll poll8 = wb2Var.j5;
            hnVar3.u(((poll8 == null || poll8.public_voters || poll8.multiple_choice) ? aob.I2 : aob.F2).getColor());
            f11 = 1.0f;
            br3.b(canvas4, wb2Var.z3, 1.0f - f10);
            canvas4.restore();
        }
        j(j6);
        canvas4.restore();
        if (f10 >= f11) {
            wb2Var.b0(true);
        }
        m19 m19Var = wb2Var.o3;
        if (m19Var != null) {
            if ((m19Var.e || m19Var.f) && (t37Var = wb2Var.L6) != null) {
                canvas4.save();
                canvas4.clipPath(t37Var.n());
                Paint paint6 = wb2Var.o3.i;
                r47 r47Var2 = wb2Var.Q5;
                int a24 = wb2Var.a2((r47Var2 == null || !r47Var2.O3() || wb2Var.Q5.t1) ? aob.Ld : aob.Rb);
                aob.h1();
                paint6.setColor(aob.p1(0.2f, a24));
                wb2Var.o3.c(canvas4, wb2Var.o0, wb2Var.u0, t37Var.getBounds(), wb2Var.R1(true));
                canvas.restore();
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.a.Q4;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((vb2) arrayList.get(i)).w.setState(StateSet.NOTHING);
            }
        }
        wg8 wg8Var = this.l;
        if (wg8Var != null) {
            wg8Var.a.setState(StateSet.NOTHING);
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
    public final void i(r47 r47Var, boolean z) {
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
        x49 x49Var;
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
        vb2 vb2Var;
        Boolean bool;
        hf0 Y;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        CharSequence charSequence3;
        int L;
        int i8;
        x49 x49Var2;
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
        vb2 vb2Var2;
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
        x4c x4cVar;
        TLRPC.PollResults pollResults;
        CharSequence ellipsize;
        hn hnVar;
        int currentTime;
        int i17;
        TLRPC.Message message2;
        x4c x4cVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String L02;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i18;
        boolean z17;
        int i19;
        r47 r47Var2 = r47Var;
        wb2 wb2Var = this.a;
        x49 x49Var3 = wb2Var.O;
        ArrayList arrayList5 = wb2Var.Q4;
        int i20 = wb2Var.a6;
        if (wb2Var.m5 == null) {
            wb2Var.m5 = new tsb();
        }
        wb2Var.Y4 = false;
        wb2Var.B0(0);
        wb2Var.v9 = true;
        wb2Var.E9 = !wb2Var.u6;
        wb2Var.O1 = false;
        int min = Math.min(hl.L(500.0f), r47Var2.l1());
        wb2Var.b7 = hl.L(31.0f) + min;
        TLRPC.MessageMedia n1 = r47.n1(r47Var2.k);
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
            wb2Var.X4 = z21;
            z2 = z18;
            wb2Var.Y4 = r47Var2.M0;
            this.v = poll2.hide_results_until_close;
            TLRPC.TL_textWithEntities tL_textWithEntities4 = poll2.question;
            if (z21) {
                L02 = ob6.L0(2131750655);
            } else {
                boolean z22 = poll2.quiz;
                boolean z23 = poll2.public_voters;
                L02 = z22 ? ob6.L0(z23 ? 2131746172 : 2131754241) : z23 ? ob6.L0(2131746315) : ob6.L0(2131754242);
            }
            L0 = L02;
            wb2Var.j5 = tL_messageMediaPoll.poll;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            wb2Var.k5 = pollResults2.results;
            wb2Var.l5 = pollResults2.total_voters;
            CharSequence charSequence6 = r47Var2.A;
            this.d = charSequence6;
            if (charSequence6 == null && !TextUtils.isEmpty(pollResults2.solution)) {
                r47Var2.l0();
                this.d = r47Var2.A;
            }
            if (this.d != null) {
                if (this.h == null) {
                    this.h = wb2Var.getContext().getResources().getDrawable(R.drawable.msg_close).mutate();
                }
                int L2 = wb2Var.b7 - hl.L(38.0f);
                this.e = L2 - hl.L(18.0f);
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
                        this.n = new mh8(i20, wb2Var, wb2Var.cc, true);
                    } else {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i18 = i21;
                    }
                    z17 = z19;
                    i19 = L2;
                    z6 = z20;
                    f = 1.0f;
                    this.n.o(r47Var2, tL_messageMediaPoll.results.solution_media, r47Var, i19, ih8.c(-3, r47Var2.k), !z);
                    mh8 mh8Var = this.n;
                    if (mh8Var.T) {
                        this.f = mh8Var.f(i19);
                    }
                    if (wb2Var.O0) {
                        this.n.a();
                    }
                }
                this.c = new StaticLayout(TextUtils.ellipsize(ob6.L0(2131746173), aob.Y2, min - hl.L(30.0f), TextUtils.TruncateAt.END), aob.Y2, min - hl.L(30.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                p47 p47Var = new p47(r47Var2, this.d, aob.a3, i19 - hl.L(11.0f));
                wb2Var.q3 = p47Var;
                int L3 = hl.L(37.0f) + p47Var.b();
                int i22 = this.f;
                this.g = L3 + (i22 > 0 ? i22 + hl.L(14.0f) : 0);
                z3 = false;
                wb2Var.Qa = hm.update(0, (View) wb2Var, false, wb2Var.Qa, (ArrayList<o47>) wb2Var.q3.e);
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
            wb2Var.X4 = false;
            this.v = false;
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) n1).todo;
            TLRPC.TL_textWithEntities tL_textWithEntities5 = todoList.title;
            L0 = ob6.L0((!todoList.others_can_complete || r47Var2.A0() == yac.h(i20).e()) ? 2131748222 : 2131748342);
            tL_textWithEntities = tL_textWithEntities5;
            i = 0;
            z3 = true;
            z4 = false;
            z5 = true;
            z6 = true;
        }
        String str = L0;
        if (r47Var2.L2 && (message2 = r47Var2.k) != null && (x4cVar2 = message2.translatedPoll) != null && (tL_textWithEntities2 = x4cVar2.a) != null) {
            tL_textWithEntities = tL_textWithEntities2;
        }
        this.s = false;
        this.t = false;
        this.u = false;
        wb2Var.W4 = r47Var2.U4();
        this.w = r47Var2.E2();
        float f4 = f;
        this.x = vsd.a(mi8.a(r47Var2), 7);
        if (wb2Var.W4) {
            r47Var2.x1.clear();
        }
        boolean z24 = z3;
        CharSequence l = pv3.l(new SpannableStringBuilder(tL_textWithEntities.text), aob.O2.getFontMetricsInt(), false);
        ArrayList<TLRPC.MessageEntity> arrayList6 = tL_textWithEntities.entities;
        if (arrayList6 != null) {
            z7 = z4;
            Spannable A5 = r47.A5(l, arrayList6, aob.O2.getFontMetricsInt(), true);
            r47.a(A5, tL_textWithEntities.entities, wb2Var.Q5.O3(), false, false);
            charSequence = A5;
        } else {
            z7 = z4;
            charSequence = l;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, aob.O2, (hl.L(2.0f) + min) - (wb2Var.getExtraTextX() << 1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        wb2Var.o2 = staticLayout;
        wb2Var.Pa = hm.update(0, (View) wb2Var, false, wb2Var.Pa, staticLayout);
        StaticLayout staticLayout2 = wb2Var.o2;
        if (staticLayout2 != null) {
            int lineCount = staticLayout2.getLineCount();
            for (int i23 = 0; i23 < lineCount; i23++) {
                f2 = 0.0f;
                if (wb2Var.o2.getLineLeft(i23) > 0.0f) {
                    z8 = true;
                    break;
                }
            }
        }
        f2 = 0.0f;
        z8 = false;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(str, aob.T2, min, truncateAt), aob.T2, (hl.L(2.0f) + min) - (wb2Var.getExtraTextX() << 1), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        wb2Var.e3 = staticLayout3;
        if (staticLayout3.getLineCount() > 0) {
            boolean z25 = ob6.a0;
            if (!z8) {
                i17 = 0;
                if (z25) {
                    wb2Var.g3 = -((int) Math.ceil(wb2Var.e3.getLineLeft(0)));
                }
                wb2Var.g3 = i17;
            } else if (z25) {
                i17 = 0;
                wb2Var.g3 = i17;
            } else {
                wb2Var.g3 = (int) Math.ceil(r7 - wb2Var.e3.getLineWidth(0));
            }
        }
        int L4 = min - hl.L(r47Var2.O3() ? 28.0f : 8.0f);
        float f5 = f2;
        if (wb2Var.j6) {
            z9 = z5;
        } else {
            TextPaint textPaint = (z5 || z6) ? aob.I2 : aob.F2;
            if (z24) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) n1;
                ellipsize = (wb2Var.Q5.O3() || wb2Var.Q5.A0() < 0 || tL_messageMediaToDo2.todo.others_can_complete) ? ob6.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompleted", Integer.valueOf(r47.z0(tL_messageMediaToDo2))) : ob6.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompletedBy", Integer.valueOf(r47.z0(tL_messageMediaToDo2)), wf3.k(yac.t0, wb2Var.Q5.Z0()));
            } else if (z7) {
                ellipsize = TextUtils.ellipsize(i == 0 ? ob6.L0(2131747860) : ob6.G(i, "Answer", new Object[0]), textPaint, L4, truncateAt);
            } else {
                ellipsize = TextUtils.ellipsize(i == 0 ? ob6.L0(2131747861) : ob6.G(i, "Vote", new Object[0]), textPaint, L4, truncateAt);
            }
            if (!wb2Var.X4 && z2) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) n1;
                int i24 = tL_messageMediaPoll2.poll.close_date;
                if (i24 > 0 && (currentTime = i24 - ConnectionsManager.getInstance(i20).getCurrentTime()) > 0) {
                    TLRPC.Poll poll3 = tL_messageMediaPoll2.poll;
                    boolean z26 = poll3.hide_results_until_close && !poll3.creator;
                    by2 by2Var = this.j;
                    if (by2Var == null) {
                        by2Var = new by2(new t41((byte) 3, this, z26));
                        this.j = by2Var;
                    }
                    z9 = z5;
                    by2Var.a(currentTime);
                    hn hnVar2 = wb2Var.z3;
                    if (hnVar2 == null) {
                        hn hnVar3 = new hn(false, true, true);
                        wb2Var.z3 = hnVar3;
                        hnVar3.setCallback(wb2Var);
                        hnVar2 = wb2Var.z3;
                        hnVar2.b = 17;
                        hnVar2.N = hl.q.x;
                    }
                    hnVar2.w(hl.L(11.0f));
                    wb2Var.z3.u(((z9 || z6) ? aob.I2 : aob.F2).getColor());
                    wb2Var.z3.t(ob6.M(currentTime, z26), !z, true);
                    hnVar = wb2Var.y3;
                    if (hnVar == null) {
                        hn hnVar4 = new hn(false, true, true);
                        wb2Var.y3 = hnVar4;
                        hnVar4.setCallback(wb2Var);
                        hnVar = wb2Var.y3;
                        hnVar.b = 17;
                        hnVar.N = hl.q.x;
                    }
                    hnVar.w(hl.L(13.0f));
                    wb2Var.y3.u(((!z9 || z6) ? aob.I2 : aob.F2).getColor());
                    wb2Var.y3.t(ellipsize, !z, true);
                    wb2Var.x3 = null;
                }
            }
            z9 = z5;
            by2 by2Var2 = this.j;
            if (by2Var2 != null) {
                by2Var2.b();
            }
            wb2Var.z3 = null;
            hnVar = wb2Var.y3;
            if (hnVar == null) {
            }
            hnVar.w(hl.L(13.0f));
            wb2Var.y3.u(((!z9 || z6) ? aob.I2 : aob.F2).getColor());
            wb2Var.y3.t(ellipsize, !z, true);
            wb2Var.x3 = null;
        }
        wb2Var.Z2(r47Var2);
        e(z24 ? 30 : uc7.s1(i20).k4.R.f());
        if (!z2 || (pollResults = ((TLRPC.TL_messageMediaPoll) n1).results) == null) {
            lc0 lc0Var = this.I;
            if (lc0Var != null) {
                lc0Var.d(null, false);
            }
        } else {
            lc0 lc0Var2 = this.I;
            if (lc0Var2 != null) {
                lc0Var2.d(pollResults.recent_voters, !z);
            }
        }
        if (!this.B && wb2Var.Z4 && wb2Var.a5) {
            try {
                wb2Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
        boolean z27 = wb2Var.O0 && (wb2Var.Z4 || wb2Var.b5);
        this.B = z27;
        this.C = z27 && z2;
        ArrayList arrayList7 = wb2Var.P4;
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
                vb2 vb2Var3 = (vb2) obj5;
                vb2Var3.b();
                wb2 wb2Var2 = vb2Var3.E;
                hm.release(wb2Var2, vb2Var3.r);
                vb2Var3.r = null;
                hm.release(wb2Var2, vb2Var3.B);
                vb2Var3.B = null;
            }
            arrayList5.clear();
            if (!this.B) {
                this.B = wb2Var.O0 && (wb2Var.W4 || wb2Var.X4 || wb2Var.Y4);
            }
            float f6 = this.r;
            if (f6 > f5 && f6 < f4) {
                int size2 = arrayList2.size();
                for (int i26 = 0; i26 < size2; i26++) {
                    vb2 vb2Var4 = (vb2) arrayList2.get(i26);
                    int i27 = vb2Var4.f;
                    vb2Var4.d = (int) Math.ceil(((vb2Var4.d - i27) * this.r) + i27);
                    float f7 = vb2Var4.h;
                    vb2Var4.g = ((vb2Var4.g - f7) * this.r) + f7;
                }
            }
            arrayList = arrayList2;
        }
        this.r = this.B ? f5 : f4;
        if (this.C) {
            bArr = null;
        } else {
            wb2Var.Z4 = false;
            wb2Var.d5 = -1;
            r7a B = r7a.B(i20);
            r47 r47Var3 = wb2Var.Q5;
            bArr = r47Var3 == null ? null : (byte[]) B.w.get("poll_" + r47Var3.D1());
        }
        int i28 = r47Var2.L0 ? this.g : 0;
        StaticLayout staticLayout4 = wb2Var.o2;
        int height = i28 + (staticLayout4 != null ? staticLayout4.getHeight() : 0);
        int i29 = 100;
        if (z2) {
            wb2Var.w1 = true;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) n1;
            if (tL_messageMediaPoll3.attached_media != null) {
                if (this.m == null) {
                    mh8 mh8Var2 = new mh8(i20, wb2Var, wb2Var.cc, false);
                    this.m = mh8Var2;
                    mh8Var2.b.s0(wb2Var.T0);
                }
                int L5 = ((wb2Var.b7 - hl.L(13.0f)) - hl.L(2.0f)) - hl.L(2.0f);
                x49Var = x49Var3;
                i2 = min;
                arrayList3 = arrayList2;
                obj3 = hm.class;
                obj4 = mv3.class;
                this.m.o(r47Var2, tL_messageMediaPoll3.attached_media, r47Var, L5, ih8.c(-2, r47Var2.k), !z);
                mh8 mh8Var3 = this.m;
                if (mh8Var3.T) {
                    this.o = L5;
                    int f8 = mh8Var3.f(L5);
                    this.p = f8;
                    int L6 = hl.L(4.0f) + hl.L(4.0f) + f8;
                    this.q = L6;
                    height += L6;
                }
                if (wb2Var.O0) {
                    this.m.a();
                }
            } else {
                arrayList3 = arrayList2;
                x49Var = x49Var3;
                i2 = min;
                obj3 = hm.class;
                obj4 = mv3.class;
            }
            atb.b(tL_messageMediaPoll3.poll, yac.h(i20).e());
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
                r47 r47Var4 = wb2Var.Q5;
                int i35 = i31;
                if (!r47Var4.L2 || (message = r47Var4.k) == null || (x4cVar = message.translatedPoll) == null) {
                    i9 = i32;
                } else {
                    ArrayList arrayList11 = x4cVar.b;
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
                CharSequence n = pv3.n(new SpannableStringBuilder(pollAnswer.text.text), aob.O2.getFontMetricsInt(), false, null, 0, 1.0f, i38);
                ArrayList<TLRPC.MessageEntity> arrayList13 = pollAnswer.text.entities;
                if (arrayList13 != null) {
                    Spannable B5 = r47.B5(n, arrayList13, aob.P2.getFontMetricsInt(), true, 1.2f, i38);
                    z12 = z11;
                    bArr2 = bArr3;
                    i10 = 0;
                    r47.a(B5, pollAnswer.text.entities, wb2Var.Q5.O3(), false, false);
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
                    i11 = ((hm[]) spannable.getSpans(i10, charSequence5.length(), obj3)).length + ((mv3[]) spannable.getSpans(i10, charSequence4.length(), obj4)).length;
                } else {
                    charSequence5 = charSequence4;
                    i11 = 0;
                }
                i33 = i38 + i11;
                if (arrayList != null) {
                    for (int i39 = 0; i39 < arrayList.size(); i39++) {
                        TLRPC.PollAnswer pollAnswer4 = ((vb2) arrayList.get(i39)).s;
                        if (pollAnswer4 == pollAnswer || (pollAnswer4 != null && Arrays.equals(((vb2) arrayList.get(i39)).s.option, pollAnswer.option))) {
                            vb2Var2 = (vb2) arrayList.get(i39);
                            break;
                        }
                    }
                }
                vb2Var2 = null;
                vb2 vb2Var5 = new vb2(wb2Var);
                if (vb2Var2 != null) {
                    vb2Var5.v = vb2Var2.v;
                    vb2Var5.w = vb2Var2.w;
                    vb2Var5.x = vb2Var2.x;
                    vb2Var2.x = null;
                } else {
                    int a2 = wb2Var.a2(aob.i6);
                    vb2Var5.v = a2;
                    vb2Var5.w = aob.Y(a2, 0, 0);
                }
                if (vb2Var5.x == null) {
                    vb2Var5.x = new kh8(i20, wb2Var);
                }
                String c = ih8.c(pollAnswer.unshuffled_index, r47Var2.k);
                kh8 kh8Var = vb2Var5.x;
                kh8Var.f = this.u;
                vb2 vb2Var6 = vb2Var2;
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
                r47Var2 = r47Var;
                kh8Var.g(r47Var2, pollAnswer.media, r47Var, c, !z);
                if (wb2Var.O0) {
                    vb2Var5.a();
                }
                vb2Var5.w.setCallback(wb2Var);
                vb2Var5.s = pollAnswer5;
                StaticLayout staticLayout5 = new StaticLayout(charSequence5, aob.P2, i2 - hl.L((this.u ? 48 : 0) + 48), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                vb2Var5.p = staticLayout5;
                vb2Var5.o = false;
                vb2Var5.r = hm.update(0, (View) wb2Var, false, vb2Var5.r, staticLayout5);
                vb2Var5.b = hl.L(52.0f) + i41;
                vb2Var5.c = vb2Var5.p.getHeight();
                vb2Var5.u = z29;
                if (vb2Var6 != null && vb2Var6.u != z29) {
                    StaticLayout staticLayout6 = vb2Var6.p;
                    vb2Var5.A = staticLayout6;
                    vb2Var5.B = hm.update(0, (View) wb2Var, false, vb2Var5.B, staticLayout6);
                    vb2Var5.C = vb2Var6.b;
                    vb2Var5.D = vb2Var6.c;
                }
                arrayList5.add(vb2Var5);
                arrayList8.add(vb2Var5);
                int w = uh9.w(26.66f, vb2Var5.c, i41);
                int lineCount2 = vb2Var5.p.getLineCount();
                float lineWidth = lineCount2 > 0 ? vb2Var5.p.getLineWidth(lineCount2 - 1) : f5;
                boolean z30 = lineCount2 > 0 && vb2Var5.p.getParagraphDirection(0) == -1;
                float L7 = (r52 - hl.L(10.0f)) - lineWidth;
                if (!tL_messageMediaPoll3.results.results.isEmpty()) {
                    int size6 = tL_messageMediaPoll3.results.results.size();
                    int i43 = 0;
                    while (i43 < size6) {
                        TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll3.results.results.get(i43);
                        int i44 = w;
                        int i45 = size6;
                        if (Arrays.equals(vb2Var5.s.option, pollAnswerVoters.option)) {
                            kh8 kh8Var2 = vb2Var5.x;
                            if (kh8Var2 != null) {
                                boolean z31 = !wb2Var.j6 && (wb2Var.W4 || wb2Var.Y4 || wb2Var.X4 || (this.x && (!this.v || this.w)));
                                kh8Var2.E.a(z31, (vb2Var6 == null || z) ? false : true);
                                kh8 kh8Var3 = vb2Var5.x;
                                int i46 = pollAnswerVoters.voters;
                                if (vb2Var6 == null || z) {
                                    z15 = z31;
                                    z16 = false;
                                } else {
                                    z15 = z31;
                                    z16 = true;
                                }
                                kh8Var3.j(i46, z16);
                                vb2Var5.x.h(pollAnswerVoters.recent_voters, (vb2Var6 == null || z) ? false : true);
                                float e = vb2Var5.x.e();
                                boolean z32 = z30 && lineCount2 == 1 && L7 - ((float) hl.L(10.0f)) > e;
                                vb2Var5.o = z32;
                                if (!z15 || (e <= L7 && (!z30 || z32))) {
                                    i14 = i44;
                                } else {
                                    vb2Var5.c = hl.L(22.0f) + vb2Var5.c;
                                    i14 = hl.L(22.0f) + i44;
                                }
                                z14 = true;
                            } else {
                                i14 = i44;
                                z14 = false;
                            }
                            vb2Var5.i = pollAnswerVoters.chosen;
                            int i47 = pollAnswerVoters.voters;
                            vb2Var5.j = i47;
                            vb2Var5.l = pollAnswerVoters.correct;
                            if ((wb2Var.W4 || wb2Var.X4 || wb2Var.Y4 || (this.x && (!this.v || this.w))) && (i15 = tL_messageMediaPoll3.results.total_voters) > 0) {
                                f3 = f5;
                                float a = ete.a(i47 / i15, f3, f4) * 100.0f;
                                i16 = (int) a;
                                vb2Var5.d = i16;
                                vb2Var5.e = a - i16;
                            } else {
                                f3 = f5;
                                vb2Var5.d = 0;
                                vb2Var5.e = f3;
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
                                vb2Var5.x.E.a(false, (vb2Var6 == null || z) ? false : true);
                            }
                            if (arrayList3 != null) {
                                int size7 = arrayList3.size();
                                int i48 = 0;
                                while (i48 < size7) {
                                    arrayList4 = arrayList3;
                                    vb2 vb2Var7 = (vb2) arrayList4.get(i48);
                                    if (Arrays.equals(vb2Var5.s.option, vb2Var7.s.option)) {
                                        vb2Var5.f = vb2Var7.d;
                                        vb2Var5.h = vb2Var7.g;
                                        vb2Var5.k = vb2Var7.i;
                                        break;
                                    }
                                    i48++;
                                    arrayList3 = arrayList4;
                                }
                            }
                            arrayList4 = arrayList3;
                            if (bArr4 != null) {
                                byte[] bArr5 = vb2Var5.s.option;
                                if (bArr5.length > 0) {
                                    bArr3 = bArr4;
                                    if (Arrays.binarySearch(bArr3, bArr5[0]) >= 0) {
                                        i13 = i35;
                                        wb2Var.d5 = i13;
                                        wb2Var.Z4 = true;
                                        wb2Var.a5 = true;
                                        bArr3 = null;
                                    } else {
                                        i13 = i35;
                                    }
                                    if (wb2Var.W4 || this.w || !this.v) {
                                        contains = wb2Var.Q5.x1.contains(vb2Var5.s);
                                        CheckBoxBase[] checkBoxBaseArr = wb2Var.f7;
                                        if (contains) {
                                            checkBoxBaseArr[i13].g(true, false);
                                        } else {
                                            checkBoxBaseArr[i13].g(false, false);
                                        }
                                    } else {
                                        wb2Var.f7[i13].g(vb2Var5.i, false);
                                    }
                                    wb2Var.f7[i13].e = 0.85f;
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
                            if (wb2Var.W4) {
                            }
                            contains = wb2Var.Q5.x1.contains(vb2Var5.s);
                            CheckBoxBase[] checkBoxBaseArr2 = wb2Var.f7;
                            if (contains) {
                            }
                            wb2Var.f7[i13].e = 0.85f;
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
                if (wb2Var.W4) {
                }
                contains = wb2Var.Q5.x1.contains(vb2Var5.s);
                CheckBoxBase[] checkBoxBaseArr22 = wb2Var.f7;
                if (contains) {
                }
                wb2Var.f7[i13].e = 0.85f;
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
            rb2 rb2Var = wb2Var.eb;
            if (rb2Var == null || !rb2Var.Z() || !tL_messageMediaPoll3.poll.open_answers || wb2Var.X4 || r47Var2.r1 || r47Var2.j3() || tL_messageMediaPoll3.poll.answers.size() >= uc7.s1(i49).k4.R.f()) {
                height = i50;
            } else {
                if (this.l == null) {
                    wg8 wg8Var = new wg8(wb2Var.getContext(), wb2Var.cc);
                    this.l = wg8Var;
                    wg8Var.setCallback(wb2Var);
                    wg8Var.a.setCallback(wb2Var);
                }
                this.s = true;
                rb2 rb2Var2 = wb2Var.eb;
                int P = rb2Var2 != null ? rb2Var2.P(wb2Var) : 0;
                boolean z33 = P > 0;
                this.t = z33;
                this.l.d(z33, !z);
                int max = Math.max(hl.L(44.33f), P);
                wb2Var.Q1 = max;
                height = i50 + max;
            }
            int size8 = arrayList16.size();
            int i51 = 0;
            while (i51 < size8) {
                Object obj9 = arrayList16.get(i51);
                i51++;
                vb2 vb2Var8 = (vb2) obj9;
                vb2Var8.b();
                vb2Var8.x = null;
            }
            b(!z);
            z10 = z28;
            i3 = i29;
        } else {
            Object obj10 = hm.class;
            Object obj11 = mv3.class;
            x49Var = x49Var3;
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
                    CharSequence n2 = pv3.n(new SpannableStringBuilder(todoItem.title.text), aob.O2.getFontMetricsInt(), false, null, 0, 1.0f, i55);
                    ArrayList<TLRPC.MessageEntity> arrayList18 = todoItem.title.entities;
                    if (arrayList18 != null) {
                        Spannable B52 = r47.B5(n2, arrayList18, aob.P2.getFontMetricsInt(), true, 1.2f, i55);
                        i4 = 0;
                        r47.a(B52, todoItem.title.entities, wb2Var.Q5.O3(), false, false);
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
                        i7 = ((hm[]) spannable2.getSpans(i4, charSequence2.length(), obj)).length + ((mv3[]) spannable2.getSpans(i4, charSequence2.length(), obj2)).length;
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
                            vb2Var = (vb2) arrayList17.get(i56);
                            TLRPC.TodoItem todoItem2 = vb2Var.t;
                            if (todoItem2 == todoItem || (todoItem2 != null && todoItem2.id == todoItem.id)) {
                                break;
                            }
                        }
                    }
                    vb2Var = null;
                    Boolean E = r7a.B(i20).E(r47Var2, todoItem);
                    vb2 vb2Var9 = new vb2(wb2Var);
                    vb2Var9.q = vb2Var != null ? vb2Var.q : null;
                    if (vb2Var != null) {
                        vb2Var9.v = vb2Var.v;
                        Y = vb2Var.w;
                        vb2Var9.w = Y;
                        bool = E;
                    } else {
                        int a22 = wb2Var.a2(aob.i6);
                        vb2Var9.v = a22;
                        bool = E;
                        Y = aob.Y(a22, 0, 0);
                        vb2Var9.w = Y;
                    }
                    Y.setCallback(wb2Var);
                    if (vb2Var != null) {
                        vb2Var9.y = vb2Var.y;
                        vb2Var9.z = vb2Var.z;
                        vb2Var.y = null;
                        vb2Var.z = null;
                    }
                    if (vb2Var9.y == null) {
                        vb2Var9.y = new rb0();
                    }
                    if (vb2Var9.z == null) {
                        ImageReceiver imageReceiver = new ImageReceiver(wb2Var);
                        vb2Var9.z = imageReceiver;
                        imageReceiver.q0(hl.L(20.0f));
                    }
                    if (wb2Var.O0) {
                        vb2Var9.a();
                    }
                    vb2Var9.i = false;
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
                                vb2Var9.i = true;
                                obj11 = obj2;
                                tL_messageMediaToDo = tL_messageMediaToDo3;
                                TLObject b2 = uc7.s1(i20).b2(wf3.n(todoCompletion2.completed_by));
                                vb2Var9.y.k(b2);
                                vb2Var9.z.U(b2, vb2Var9.y, null);
                                vb2Var9.q = new pkb(wf3.l(b2), 12.0f);
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
                        vb2Var9.i = bool.booleanValue();
                    }
                    if (!vb2Var9.i || r47Var2.q()) {
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
                    vb2Var9.t = todoItem;
                    StaticLayout staticLayout7 = new StaticLayout(charSequence3, aob.P2, i2 - hl.L(46.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    vb2Var9.p = staticLayout7;
                    vb2Var9.r = hm.update(0, (View) wb2Var, false, vb2Var9.r, staticLayout7);
                    vb2Var9.b = hl.L(52.0f) + i52;
                    vb2Var9.c = vb2Var9.p.getHeight();
                    vb2Var9.u = false;
                    if (vb2Var != null && vb2Var.u) {
                        StaticLayout staticLayout8 = vb2Var.p;
                        vb2Var9.A = staticLayout8;
                        vb2Var9.B = hm.update(0, (View) wb2Var, false, vb2Var9.B, staticLayout8);
                        vb2Var9.C = vb2Var.b;
                        vb2Var9.D = vb2Var.c;
                    }
                    arrayList5.add(vb2Var9);
                    arrayList8.add(vb2Var9);
                    i52 = uh9.w(26.66f, vb2Var9.c, i52);
                    wb2Var.f7[i6].g(vb2Var9.i, !z);
                    wb2Var.f7[i6].e = 1.0f;
                    i53 = i6 + 1;
                    tL_messageMediaToDo3 = tL_messageMediaToDo;
                    size9 = i5;
                }
                int size11 = arrayList17.size();
                int i60 = 0;
                while (i60 < size11) {
                    Object obj12 = arrayList17.get(i60);
                    i60++;
                    vb2 vb2Var10 = (vb2) obj12;
                    ImageReceiver imageReceiver2 = vb2Var10.z;
                    if (imageReceiver2 != null) {
                        imageReceiver2.K();
                        vb2Var10.z = null;
                    }
                }
                height = i52;
            }
            i3 = 100;
            z10 = false;
        }
        g(i3, arrayList8, z10);
        int L8 = wb2Var.b7 - hl.L(76.0f);
        int size12 = arrayList5.size();
        for (int i61 = 0; i61 < size12; i61++) {
            ((vb2) arrayList5.get(i61)).g = Math.max(hl.L(5.0f) / L8, r6.d / 100.0f);
        }
        wb2Var.setMessageObjectInternal(r47Var2);
        this.b = false;
        if (!wb2Var.j6 || wb2Var.u2) {
            this.b = true;
            L = hl.L(13.0f) + height;
        } else {
            L = height - hl.L(10.0f);
        }
        int L9 = hl.L(73.0f);
        int i62 = wb2Var.gb;
        wb2Var.v0 = L9 + i62 + L;
        if (wb2Var.J) {
            wb2Var.gb = i62 - hl.L(1.0f);
        }
        wb2Var.E2 = false;
        if (z9 || z6) {
            int i63 = 0;
            int i64 = 0;
            i8 = 3;
            while (i63 < 3) {
                i64 = Math.max(i64, (int) Math.ceil(aob.M2.measureText(i63 == 0 ? ob6.L0(2131746837) : i63 == 1 ? ob6.L0(2131746883) : ob6.L0(2131747861))));
                i63++;
            }
            int extraTimeX = wb2Var.getExtraTimeX() + wb2Var.M9 + (r47Var2.O3() ? hl.L(20.0f) : 0);
            x49Var.getClass();
            x49Var2 = x49Var;
            if (x49Var2.p && !wb2Var.y2() && extraTimeX >= ((wb2Var.b7 - hl.L(76.0f)) - i64) / 2) {
                wb2Var.v0 = hl.L(18.0f) + wb2Var.v0;
                wb2Var.E2 = true;
            }
        } else {
            x49Var2 = x49Var;
            i8 = 3;
        }
        x49Var2.getClass();
        if (x49Var2.p) {
            return;
        }
        x49Var2.o(i2, i8);
        wb2Var.v0 = uh9.w(12.0f, x49Var2.m, wb2Var.v0);
        int extraTimeX2 = wb2Var.getExtraTimeX() + wb2Var.M9 + (r47Var2.O3() ? hl.L(20.0f) : 0);
        if (wb2Var.y2() || extraTimeX2 < (wb2Var.b7 - hl.L(24.0f)) - x49Var2.r) {
            return;
        }
        wb2Var.v0 = hl.L(16.0f) + wb2Var.v0;
        x49Var2.k -= hl.L(16.0f);
    }

    public final void j(long j) {
        lc0 lc0Var;
        r47 r47Var;
        wb2 wb2Var = this.a;
        ArrayList arrayList = wb2Var.Q4;
        if (wb2Var.Z4) {
            this.E = (((360 * j) / 2000.0f) + this.E) - (((int) (r6 / 360.0f)) * 360);
            float f = wb2Var.h5 + j;
            wb2Var.h5 = f;
            if (f >= 500.0f) {
                wb2Var.h5 = 500.0f;
                f = 500.0f;
            }
            if (wb2Var.g5) {
                wb2Var.e5 = (hl.G.getInterpolation(f / 500.0f) * 266.0f) + 4.0f;
            } else {
                wb2Var.e5 = 4.0f - ((1.0f - hl.F.getInterpolation(f / 500.0f)) * (wb2Var.f5 ? 360 : jn7.s4));
            }
            if (wb2Var.h5 == 500.0f) {
                boolean z = wb2Var.g5;
                if (z) {
                    this.E += 270.0f;
                    wb2Var.e5 = -266.0f;
                }
                wb2Var.g5 = !z;
                if (wb2Var.f5) {
                    wb2Var.f5 = false;
                }
                wb2Var.h5 = 0.0f;
            }
            wb2Var.invalidate();
        }
        if (!wb2Var.r5 || ((r47Var = wb2Var.Q5) != null && r47Var.L0)) {
            float f2 = wb2Var.s5;
            if (f2 > 0.0f) {
                float f3 = f2 - (j / 180.0f);
                wb2Var.s5 = f3;
                if (f3 < 0.0f) {
                    wb2Var.s5 = 0.0f;
                }
                wb2Var.invalidate();
            }
        } else {
            float f4 = wb2Var.s5;
            if (f4 < 1.0f) {
                float f5 = (j / 180.0f) + f4;
                wb2Var.s5 = f5;
                if (f5 > 1.0f) {
                    wb2Var.s5 = 1.0f;
                }
                wb2Var.invalidate();
            }
        }
        if (this.B) {
            float f6 = wb2Var.R4 + j;
            wb2Var.R4 = f6;
            if (f6 >= 300.0f) {
                wb2Var.R4 = 300.0f;
                f6 = 300.0f;
            }
            float interpolation = hl.F.getInterpolation(f6 / 300.0f);
            this.r = interpolation;
            if (interpolation >= 1.0f) {
                this.r = 1.0f;
                this.B = false;
                this.C = false;
                wb2Var.Z4 = false;
                if (wb2Var.b5 && wb2Var.c5 && (lc0Var = this.I) != null) {
                    lc0Var.d(null, false);
                }
                wb2Var.b5 = false;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((vb2) arrayList.get(i)).k = false;
                }
            }
            wb2Var.invalidate();
        }
    }
}
