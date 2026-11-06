package org.telegram.ui.Cells;

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
import c8.zc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c10;
import org.telegram.messenger.fj;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.vj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.c01;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class w1 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public float E;
    public boolean F;
    public int G = -1;
    public float H;
    public org.telegram.ui.Components.b9 I;
    public Paint J;
    public Paint K;
    public Path L;
    public final q1 a;
    public boolean b;
    public StaticLayout c;
    public CharSequence d;
    public int e;
    public int f;
    public int g;
    public Drawable h;
    public int i;
    public bg.q j;
    public uh.d k;
    public uh.a l;
    public sh.e m;
    public sh.e n;
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

    public w1(q1 q1Var) {
        this.a = q1Var;
    }

    public static void g(int i7, ArrayList arrayList, boolean z9) {
        if (!z9 || i7 == 0 || arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new vj(29));
        int size = arrayList.size();
        for (int i10 = 0; i10 < size && i7 > 0; i10++) {
            p1 p1Var = (p1) arrayList.get(i10);
            int i11 = p1Var.d;
            if (i11 > 0) {
                p1Var.d = i11 + 1;
                i7--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:37:0x00a3, B:41:0x00c2, B:43:0x00e8, B:45:0x00f3, B:52:0x0112, B:55:0x0125, B:57:0x0128, B:59:0x012e, B:62:0x0134, B:64:0x013a, B:66:0x0140, B:68:0x0146, B:72:0x02e7, B:75:0x0151, B:76:0x015d, B:78:0x0161, B:80:0x0165, B:82:0x0189, B:83:0x018e, B:85:0x019b, B:87:0x019f, B:90:0x01b4, B:92:0x01bb, B:137:0x02de, B:145:0x02db, B:146:0x018c, B:147:0x02ed, B:149:0x02f3, B:151:0x02f7, B:160:0x0309, B:161:0x030f, B:163:0x0313, B:165:0x0317, B:167:0x011a, B:168:0x0108, B:94:0x01c3, B:96:0x01f4, B:97:0x01f6, B:99:0x0200, B:101:0x020c, B:103:0x0223, B:105:0x0226, B:113:0x026d, B:115:0x0273, B:117:0x027a, B:119:0x0286, B:121:0x02a1, B:123:0x02a4, B:125:0x02af, B:133:0x0293, B:107:0x022f, B:109:0x0266, B:140:0x0219), top: B:36:0x00a3, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:37:0x00a3, B:41:0x00c2, B:43:0x00e8, B:45:0x00f3, B:52:0x0112, B:55:0x0125, B:57:0x0128, B:59:0x012e, B:62:0x0134, B:64:0x013a, B:66:0x0140, B:68:0x0146, B:72:0x02e7, B:75:0x0151, B:76:0x015d, B:78:0x0161, B:80:0x0165, B:82:0x0189, B:83:0x018e, B:85:0x019b, B:87:0x019f, B:90:0x01b4, B:92:0x01bb, B:137:0x02de, B:145:0x02db, B:146:0x018c, B:147:0x02ed, B:149:0x02f3, B:151:0x02f7, B:160:0x0309, B:161:0x030f, B:163:0x0313, B:165:0x0317, B:167:0x011a, B:168:0x0108, B:94:0x01c3, B:96:0x01f4, B:97:0x01f6, B:99:0x0200, B:101:0x020c, B:103:0x0223, B:105:0x0226, B:113:0x026d, B:115:0x0273, B:117:0x027a, B:119:0x0286, B:121:0x02a1, B:123:0x02a4, B:125:0x02af, B:133:0x0293, B:107:0x022f, B:109:0x0266, B:140:0x0219), top: B:36:0x00a3, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        float f10;
        boolean z9;
        boolean z10;
        CharacterStyle characterStyle;
        org.telegram.ui.Components.r5 r5Var;
        boolean z11;
        CharacterStyle[] characterStyleArr;
        CharacterStyle[] characterStyleArr2;
        zj0 zj0Var;
        q1 q1Var = this.a;
        n2.n0 n0Var = q1Var.t4;
        x1 x1Var = q1Var.hb;
        if ((this.d instanceof Spannable) && q1Var.p3 != null && q1Var.s4 == -1 && !q1Var.dc) {
            boolean z12 = true;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && (q1Var.u4 == 1 || q1Var.r4 != null))) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                float f11 = x10;
                float f12 = q1Var.t5;
                if (f11 >= f12) {
                    float f13 = M1;
                    float f14 = q1Var.u5;
                    if (f13 >= f14) {
                        gj gjVar = q1Var.p3;
                        if (f11 <= f12 + gjVar.c && f13 <= f14 + gjVar.c(x1Var)) {
                            int i7 = (int) (f13 - q1Var.u5);
                            int i10 = 0;
                            for (int i11 = 0; i11 < q1Var.p3.e.size() && ((fj) q1Var.p3.e.get(i11)).p(q1Var.p3.e, x1Var) <= i7; i11++) {
                                i10 = i11;
                            }
                            try {
                                fj fjVar = (fj) q1Var.p3.e.get(i10);
                                float f15 = q1Var.t5;
                                if (fjVar.l()) {
                                    try {
                                        f10 = q1Var.p3.d;
                                    } catch (Exception e10) {
                                        e = e10;
                                        org.telegram.messenger.a8.g(e, z12);
                                        return false;
                                    }
                                } else {
                                    f10 = 0.0f;
                                }
                                int i12 = (int) (f11 - (f15 - f10));
                                int p10 = (int) (i7 - fjVar.p(q1Var.p3.e, x1Var));
                                int lineForVertical = fjVar.e.getLineForVertical(p10);
                                int i13 = 0;
                                float f16 = i12;
                                int offsetForHorizontal = fjVar.n + fjVar.e.getOffsetForHorizontal(lineForVertical, f16);
                                float lineLeft = fjVar.e.getLineLeft(lineForVertical);
                                if (lineLeft <= f16 && lineLeft + fjVar.e.getLineWidth(lineForVertical) >= f16) {
                                    Spannable spannable = (Spannable) this.d;
                                    CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                    if (characterStyleArr3 == null || characterStyleArr3.length == 0) {
                                        characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, a41.class);
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (characterStyleArr3 != null) {
                                        z10 = z9;
                                        if (characterStyleArr3.length == 0) {
                                        }
                                        if (characterStyleArr3.length != 0 && ((!(characterStyleArr3[0] instanceof y31) || y31.h) && !org.telegram.messenger.g0.C1())) {
                                            if (motionEvent.getAction() != 0) {
                                                CharacterStyle characterStyle2 = characterStyleArr3[0];
                                                if (characterStyle2 instanceof org.telegram.ui.Components.r5) {
                                                    org.telegram.ui.Components.r5 r5Var2 = q1Var.p4;
                                                    if (r5Var2 == null || r5Var2 != characterStyle2) {
                                                        q1Var.e3(1);
                                                        q1Var.p4 = (org.telegram.ui.Components.r5) characterStyleArr3[0];
                                                        q1Var.u4 = 1;
                                                    }
                                                } else {
                                                    x70 x70Var = q1Var.q4;
                                                    if (x70Var == null || x70Var.i != characterStyle2) {
                                                        n0Var.m(x70Var, true);
                                                        float[] fArr = q1.hd;
                                                        x70 x70Var2 = new x70(characterStyleArr3[0], q1Var.Pb, f16, p10, 0);
                                                        q1Var.q4 = x70Var2;
                                                        x70Var2.d(org.telegram.ui.ActionBar.k6.w0(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.Ac : org.telegram.ui.ActionBar.k6.ze, q1Var.Pb));
                                                        if (fjVar.I && (zj0Var = q1Var.m8) != null) {
                                                            q1Var.q4.d(org.telegram.ui.ActionBar.k6.r1(org.telegram.ui.ActionBar.k6.I.q() ? 0.13f : 0.1f, zj0Var.i()));
                                                        }
                                                        q1Var.y0 = i10;
                                                        q1Var.x0 = -1;
                                                        q1Var.u4 = 1;
                                                        try {
                                                            r70 b10 = q1Var.q4.b();
                                                            int[] W1 = q1.W1(spannable, q1Var.q4.i);
                                                            int i14 = W1[0];
                                                            int i15 = fjVar.n;
                                                            int i16 = i14 - i15;
                                                            W1[0] = i16;
                                                            W1[1] = W1[1] - i15;
                                                            b10.d(fjVar.e, i16, 0.0f);
                                                            fjVar.e.getSelectionPath(W1[0], W1[1], b10);
                                                            if (W1[1] >= fjVar.r) {
                                                                int i17 = i10 + 1;
                                                                while (i17 < q1Var.p3.e.size()) {
                                                                    fj fjVar2 = (fj) q1Var.p3.e.get(i17);
                                                                    if (z10) {
                                                                        int i18 = fjVar2.n;
                                                                        characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i18, i18, a41.class);
                                                                    } else {
                                                                        int i19 = fjVar2.n;
                                                                        characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i19, i19, ClickableSpan.class);
                                                                    }
                                                                    if (characterStyleArr2 == null || characterStyleArr2.length == 0) {
                                                                        break;
                                                                    }
                                                                    CharacterStyle characterStyle3 = characterStyleArr2[i13];
                                                                    x70 x70Var3 = q1Var.q4;
                                                                    if (characterStyle3 != x70Var3.i) {
                                                                        break;
                                                                    }
                                                                    r70 b11 = x70Var3.b();
                                                                    b11.d(fjVar2.e, i13, fjVar2.p(q1Var.p3.e, x1Var) - fjVar.p(q1Var.p3.e, x1Var));
                                                                    int i20 = (W1[1] + fjVar.n) - fjVar2.n;
                                                                    fjVar2.e.getSelectionPath(0, i20, b11);
                                                                    if (i20 < fjVar2.r - 1) {
                                                                        break;
                                                                    }
                                                                    i17++;
                                                                    i13 = 0;
                                                                }
                                                            }
                                                            i13 = 0;
                                                            if (W1[i13] <= fjVar.n) {
                                                                int i21 = 0;
                                                                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                                                                    fj fjVar3 = (fj) q1Var.p3.e.get(i22);
                                                                    if (z10) {
                                                                        int i23 = fjVar3.r - 1;
                                                                        characterStyleArr = (CharacterStyle[]) spannable.getSpans(i23, i23, a41.class);
                                                                    } else {
                                                                        int i24 = fjVar3.r - 1;
                                                                        characterStyleArr = (CharacterStyle[]) spannable.getSpans(i24, i24, ClickableSpan.class);
                                                                    }
                                                                    if (characterStyleArr == null || characterStyleArr.length == 0) {
                                                                        break;
                                                                    }
                                                                    CharacterStyle characterStyle4 = characterStyleArr[0];
                                                                    x70 x70Var4 = q1Var.q4;
                                                                    if (characterStyle4 != x70Var4.i) {
                                                                        break;
                                                                    }
                                                                    r70 b12 = x70Var4.b();
                                                                    i21 -= fjVar3.w;
                                                                    int i25 = W1[0];
                                                                    int i26 = fjVar.n;
                                                                    int i27 = fjVar3.n;
                                                                    int i28 = (i25 + i26) - i27;
                                                                    int i29 = (W1[1] + i26) - i27;
                                                                    b12.d(fjVar3.e, i28, i21);
                                                                    fjVar3.e.getSelectionPath(i28, i29, b12);
                                                                    if (i28 > fjVar3.n) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z11 = true;
                                                        } catch (Exception e11) {
                                                            z11 = true;
                                                            org.telegram.messenger.a8.g(e11, true);
                                                        }
                                                        n0Var.b(q1Var.q4, Integer.valueOf(z11 ? 1 : 0));
                                                        q1Var.cc = z11;
                                                        q1Var.invalidate();
                                                        return z11;
                                                    }
                                                }
                                                z11 = true;
                                                q1Var.cc = z11;
                                                q1Var.invalidate();
                                                return z11;
                                            }
                                            CharacterStyle characterStyle5 = characterStyleArr3[0];
                                            if ((characterStyle5 instanceof org.telegram.ui.Components.r5) && (r5Var = q1Var.p4) == characterStyle5) {
                                                if (q1Var.Ra.n0(r5Var)) {
                                                    z12 = true;
                                                    q1Var.e3(1);
                                                    q1Var.p4 = null;
                                                    return true;
                                                }
                                                q1Var.e3(1);
                                                q1Var.p4 = null;
                                            } else {
                                                x70 x70Var5 = q1Var.q4;
                                                if (x70Var5 != null && characterStyle5 == (characterStyle = x70Var5.i)) {
                                                    q1Var.Ra.N0(q1Var, characterStyle, false);
                                                    q1Var.e3(1);
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                    characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.r5.class);
                                    z10 = false;
                                    if (characterStyleArr3.length != 0) {
                                        if (motionEvent.getAction() != 0) {
                                        }
                                    }
                                }
                            } catch (Exception e12) {
                                e = e12;
                                z12 = true;
                            }
                            return false;
                        }
                    }
                }
                q1Var.e3(1);
                return false;
            }
            if (motionEvent.getAction() == 1) {
                q1Var.r4 = null;
                q1Var.b3();
                return false;
            }
        }
        return false;
    }

    public final void b(boolean z9) {
        boolean z10;
        q1 q1Var = this.a;
        ij ijVar = q1Var.P5;
        if (ijVar == null) {
            return;
        }
        TLRPC.MessageMedia n1 = ij.n1(ijVar);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n1;
            int i7 = 0;
            if (q1Var.e7 != null) {
                int min = Math.min(tL_messageMediaPoll.poll.answers.size(), q1Var.e7.length);
                z10 = false;
                for (int i10 = 0; i10 < min; i10++) {
                    CheckBoxBase checkBoxBase = q1Var.e7[i10];
                    if (checkBoxBase != null && checkBoxBase.q) {
                        z10 = true;
                    }
                }
            } else {
                z10 = false;
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            boolean z11 = q1Var.V4;
            boolean z12 = (z11 || q1Var.W4 || !this.w || pollResults == null || pollResults.total_voters == 0 || !tL_messageMediaPoll.poll.creator) ? false : true;
            boolean z13 = (z11 || q1Var.W4 || this.x) ? false : true;
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            boolean z14 = poll.public_voters;
            CharSequence charSequence = null;
            if (this.t) {
                charSequence = hd.M0(2131747176, null);
                i7 = 84;
            } else if (!z12 || (poll.multiple_choice && z13 && z10)) {
                if (poll.multiple_choice && z13) {
                    charSequence = hd.M0(2131747155, null);
                    i7 = 83;
                } else if (!q1Var.i6 && z14 && ((z11 && (!this.v || this.w)) || (q1Var.W4 && pollResults.total_voters != 0))) {
                    charSequence = hd.a0(null, null, 2131747104, Integer.valueOf(pollResults.total_voters));
                    i7 = 80;
                }
            } else if (z14) {
                charSequence = hd.a0(null, null, 2131747104, Integer.valueOf(pollResults.total_voters));
                i7 = 80;
            } else if (ijVar.K0) {
                charSequence = org.telegram.messenger.g0.J2(hd.M0(2131747110, null), false, -org.telegram.messenger.g0.L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
                i7 = 82;
            } else {
                charSequence = org.telegram.messenger.g0.H2(hd.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                i7 = 81;
            }
            if (i7 != 0) {
                if (this.k == null) {
                    uh.d dVar = new uh.d(q1Var, q1Var.Pb);
                    this.k = dVar;
                    dVar.setCallback(q1Var);
                    dVar.a.setCallback(q1Var);
                    dVar.d.setCallback(q1Var);
                }
                q1Var.y2 = charSequence;
                this.k.d.t(charSequence, z9, true);
                q1Var.t2 = true;
                q1Var.x2 = i7;
                q1Var.y0();
            }
            q1Var.a0(z9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x018b, code lost:
    
        if (org.telegram.ui.Components.y31.h == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        if (r13.i != r12[r17]) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028a A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(MotionEvent motionEvent) {
        Drawable drawable;
        boolean z9;
        l1 l1Var;
        int i7;
        uh.a aVar;
        int i10;
        int[] iArr;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        q1 q1Var = this.a;
        n2.n0 n0Var = q1Var.t4;
        int[] iArr2 = q1Var.M2;
        int[] iArr3 = q1Var.K2;
        Drawable[] drawableArr = q1Var.I2;
        ArrayList arrayList = q1Var.P4;
        ij ijVar = q1Var.P5;
        int i14 = 0;
        if (ijVar.T == 0 && (((!q1Var.Y4 && !q1Var.a5) || ijVar.E4()) && !arrayList.isEmpty())) {
            ij ijVar2 = q1Var.P5;
            if (ijVar2.D == 17 && ijVar2.r4()) {
                int x10 = (int) motionEvent.getX();
                int M1 = (int) q1Var.M1(motionEvent);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() != 3) {
                                return false;
                            }
                            h();
                            return false;
                        }
                        if ((q1Var.h5 == -1 && !q1Var.p5) || (drawable = drawableArr[0]) == null) {
                            return false;
                        }
                        drawable.setHotspot(x10, M1);
                        return false;
                    }
                    if (q1Var.s5 != -1) {
                        q1Var.playSoundEffect(0);
                        if (q1Var.P5 != null && (l1Var = q1Var.Ra) != null && q1Var.s5 == 0) {
                            l1Var.r1(q1Var);
                        }
                        q1Var.s5 = -1;
                        h();
                        return false;
                    }
                    if (q1Var.x5) {
                        q1Var.playSoundEffect(0);
                        q1Var.G0();
                        q1Var.x5 = false;
                        h();
                        return false;
                    }
                    if (q1Var.p5) {
                        q1Var.playSoundEffect(0);
                        q1Var.G0();
                        q1Var.p5 = false;
                        q1Var.s5 = -1;
                        h();
                        return false;
                    }
                    x70 x70Var = q1Var.q4;
                    if (x70Var != null) {
                        CharacterStyle characterStyle = x70Var.i;
                        if (characterStyle instanceof URLSpan) {
                            q1Var.Ra.N0(q1Var, characterStyle, false);
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(q1Var);
                        }
                        q1Var.e3(4);
                        return false;
                    }
                    if (q1Var.h5 == -1) {
                        return false;
                    }
                    q1Var.playSoundEffect(0);
                    h();
                    if (this.F) {
                        p1 p1Var = (p1) arrayList.get(q1Var.h5);
                        ImageReceiver imageReceiver = p1Var.x.c;
                        TLRPC.PollAnswer pollAnswer = p1Var.s;
                        TLRPC.MessageMedia messageMedia = pollAnswer.media;
                        motionEvent.getX();
                        motionEvent.getY();
                        int i15 = p1Var.s.unshuffled_index;
                        l1 l1Var2 = q1Var.Ra;
                        if (l1Var2 != null) {
                            l1Var2.n(q1Var, pollAnswer, messageMedia, i15);
                        }
                    } else if (q1Var.P5.p1) {
                        Toast.makeText(q1Var.getContext(), hd.M0(q1Var.P5.E4() ? 2131748492 : 2131748490, null), 1).show();
                    } else {
                        p1 p1Var2 = (p1) arrayList.get(q1Var.h5);
                        TLRPC.PollAnswer pollAnswer2 = p1Var2.s;
                        if (q1Var.V4 || q1Var.W4) {
                            new ArrayList().add(pollAnswer2);
                            q1Var.Ra.J1(q1Var, pollAnswer2);
                        } else if (this.x) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(pollAnswer2);
                            q1Var.Ra.j(q1Var, arrayList2, p1Var2.j, p1Var2.a + org.telegram.messenger.g0.L(50.0f), q1Var.Ta + p1Var2.b);
                        } else {
                            TLRPC.Poll poll = q1Var.i5;
                            if (poll == null || !poll.multiple_choice) {
                                int i16 = q1Var.h5;
                                q1Var.c5 = i16;
                                q1Var.Y4 = true;
                                q1Var.g5 = 0.0f;
                                q1Var.e5 = true;
                                q1Var.d5 = 360.0f;
                                q1Var.f5 = false;
                                if (p1Var2.t != null) {
                                    q1Var.L3(i16, true);
                                } else {
                                    q1Var.Z4 = true;
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(pollAnswer2);
                                    q1Var.Ra.j(q1Var, arrayList3, -1, 0, 0);
                                }
                            } else {
                                if (q1Var.P5.v1.contains(pollAnswer2)) {
                                    q1Var.P5.v1.remove(pollAnswer2);
                                    z9 = true;
                                    q1Var.e7[q1Var.h5].f(-1, false, true);
                                } else {
                                    z9 = true;
                                    q1Var.P5.v1.add(pollAnswer2);
                                    q1Var.e7[q1Var.h5].f(-1, true, true);
                                }
                                b(z9);
                            }
                        }
                    }
                    q1Var.h5 = -1;
                    q1Var.invalidate();
                    return false;
                }
                q1Var.h5 = -1;
                q1Var.p5 = false;
                q1Var.s5 = -1;
                q1Var.x5 = false;
                q1Var.e3(4);
                int i17 = q1Var.v5;
                if (i17 != -1 && q1Var.w5 != -1 && Math.abs(x10 - i17) < org.telegram.messenger.g0.L(20.0f) && Math.abs(M1 - q1Var.w5) < org.telegram.messenger.g0.L(20.0f)) {
                    q1Var.x5 = true;
                    h();
                    q1Var.invalidate();
                    return true;
                }
                if (q1Var.q5 && (i12 = q1Var.n5) != -1 && x10 >= i12 && x10 <= org.telegram.messenger.g0.L(40.0f) + i12 && M1 >= (i13 = q1Var.o5) && M1 <= org.telegram.messenger.g0.L(40.0f) + i13) {
                    q1Var.p5 = true;
                    iArr3[0] = 3;
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setBounds(q1Var.n5 - org.telegram.messenger.g0.L(8.0f), q1Var.o5 - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(32.0f) + q1Var.n5, org.telegram.messenger.g0.L(32.0f) + q1Var.o5);
                        drawableArr[0].setHotspot(x10, M1);
                        drawableArr[0].setState(iArr2);
                    }
                    h();
                    q1Var.invalidate();
                    return true;
                }
                if (q1Var.P5.K0) {
                    h();
                    q1Var.invalidate();
                    return false;
                }
                h();
                int i18 = 0;
                boolean z12 = false;
                while (i18 < arrayList.size()) {
                    i7 = i14;
                    p1 p1Var3 = (p1) arrayList.get(i18);
                    int L = (p1Var3.b + q1Var.Ta) - org.telegram.messenger.g0.L(13.0f);
                    StaticLayout staticLayout = p1Var3.p;
                    if (staticLayout != null && (staticLayout.getText() instanceof Spannable)) {
                        float f10 = x10;
                        float f11 = p1Var3.m;
                        if (f10 >= f11) {
                            float f12 = M1;
                            float f13 = p1Var3.n;
                            if (f12 >= f13 && !q1Var.P5.r1) {
                                int i19 = x10 - ((int) f11);
                                int i20 = M1 - ((int) f13);
                                try {
                                } catch (Exception e10) {
                                    e = e10;
                                    iArr = iArr3;
                                }
                                if (i20 <= p1Var3.p.getHeight()) {
                                    int lineForVertical = p1Var3.p.getLineForVertical(i20);
                                    float f14 = i19;
                                    int offsetForHorizontal = p1Var3.p.getOffsetForHorizontal(lineForVertical, f14);
                                    float lineLeft = p1Var3.p.getLineLeft(lineForVertical);
                                    if (lineLeft <= f14 && lineLeft + p1Var3.p.getLineWidth(lineForVertical) >= f14) {
                                        Spannable spannable = (Spannable) p1Var3.p.getText();
                                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                        if (clickableSpanArr.length != 0) {
                                            if (clickableSpanArr[i7] instanceof y31) {
                                                try {
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    iArr = iArr3;
                                                    z10 = true;
                                                    org.telegram.messenger.a8.g(e, z10);
                                                    i11 = p1Var3.a;
                                                    if (x10 < i11) {
                                                    }
                                                    i18++;
                                                    i14 = i7;
                                                    iArr3 = iArr;
                                                }
                                            }
                                            if (!org.telegram.messenger.g0.C1()) {
                                                x70 x70Var2 = q1Var.q4;
                                                if (x70Var2 != null) {
                                                    iArr = iArr3;
                                                    try {
                                                        z11 = z12;
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        z10 = true;
                                                        org.telegram.messenger.a8.g(e, z10);
                                                        i11 = p1Var3.a;
                                                        if (x10 < i11) {
                                                            if (M1 > org.telegram.messenger.g0.L(26.0f) + L + p1Var3.c) {
                                                            }
                                                        }
                                                        i18++;
                                                        i14 = i7;
                                                        iArr3 = iArr;
                                                    }
                                                    try {
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        z12 = z11;
                                                        z10 = true;
                                                        org.telegram.messenger.a8.g(e, z10);
                                                        i11 = p1Var3.a;
                                                        if (x10 < i11) {
                                                        }
                                                        i18++;
                                                        i14 = i7;
                                                        iArr3 = iArr;
                                                    }
                                                } else {
                                                    iArr = iArr3;
                                                    z11 = z12;
                                                }
                                                n0Var.m(x70Var2, true);
                                                ClickableSpan clickableSpan = clickableSpanArr[i7];
                                                org.telegram.ui.ActionBar.f6 f6Var = q1Var.Pb;
                                                float[] fArr = q1.hd;
                                                x70 x70Var3 = new x70(clickableSpan, f6Var, f10, f12, 0);
                                                q1Var.q4 = x70Var3;
                                                x70Var3.d(org.telegram.ui.ActionBar.k6.w0(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.Ac : org.telegram.ui.ActionBar.k6.ze, q1Var.Pb));
                                                q1Var.x0 = i18;
                                                q1Var.u4 = 4;
                                                q1Var.u();
                                                try {
                                                    r70 b10 = q1Var.q4.b();
                                                    int[] W1 = q1.W1(spannable, q1Var.q4.i);
                                                    b10.d(p1Var3.p, W1[i7], 0.0f);
                                                    p1Var3.p.getSelectionPath(W1[i7], W1[1], b10);
                                                } catch (Exception e14) {
                                                    org.telegram.messenger.a8.g(e14, true);
                                                }
                                                n0Var.b(q1Var.q4, 4);
                                                try {
                                                    q1Var.invalidate();
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    z10 = true;
                                                    z12 = true;
                                                    org.telegram.messenger.a8.g(e, z10);
                                                    i11 = p1Var3.a;
                                                    if (x10 < i11) {
                                                    }
                                                    i18++;
                                                    i14 = i7;
                                                    iArr3 = iArr;
                                                }
                                                z12 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    iArr = iArr3;
                    z12 = z12;
                    i11 = p1Var3.a;
                    if (x10 < i11 && x10 <= (i11 + q1Var.a7) - org.telegram.messenger.g0.L(31.0f) && M1 >= L) {
                        if (M1 > org.telegram.messenger.g0.L(26.0f) + L + p1Var3.c) {
                            q1Var.h5 = i18;
                            uh.b bVar = p1Var3.x;
                            boolean z13 = (bVar == null || !bVar.h || x10 <= (p1Var3.a + q1Var.a7) - org.telegram.messenger.g0.L(81.0f)) ? i7 : 1;
                            this.F = z13;
                            if (z13 == 0) {
                                iArr[i7] = 1;
                                p1Var3.w.setHotspot(x10, M1);
                                p1Var3.w.setState(iArr2);
                                q1Var.invalidate();
                            }
                            z12 = true;
                            break;
                        }
                    }
                    i18++;
                    i14 = i7;
                    iArr3 = iArr;
                }
                i7 = i14;
                if (!z12 && this.s && (aVar = this.l) != null) {
                    y yVar = aVar.a;
                    if (aVar.getBounds().contains(x10, M1)) {
                        yVar.setHotspot(x10, M1);
                        yVar.setState(aVar.e);
                        i10 = i7;
                    } else {
                        i10 = -1;
                    }
                    q1Var.s5 = i10;
                    if (i10 != -1) {
                        return true;
                    }
                }
                return z12;
            }
        }
        return false;
    }

    public final boolean d(MotionEvent motionEvent) {
        sh.e eVar;
        sh.e eVar2;
        q1 q1Var = this.a;
        ij ijVar = q1Var.P5;
        if (ijVar != null && ijVar.D == 17 && !ijVar.p4()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int M1 = (int) q1Var.M1(motionEvent);
            sh.e eVar3 = this.m;
            if (eVar3 != null) {
                if (eVar3.X && eVar3.a.f && eVar3.K.e(x10 - eVar3.L, M1 - eVar3.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                sh.e eVar4 = this.m;
                if ((eVar4.X || eVar4.W) && eVar4.k(x10, M1, action)) {
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (q1Var.P5.J0 && (eVar2 = this.n) != null) {
                if (eVar2.X && eVar2.a.f && eVar2.K.e(x10 - eVar2.L, M1 - eVar2.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                sh.e eVar5 = this.n;
                if ((eVar5.X || eVar5.W) && eVar5.k(x10, M1, action)) {
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = -1;
                sh.e eVar6 = this.m;
                if (eVar6 != null && eVar6.S && eVar6.getBounds().contains(x10, M1)) {
                    this.G = -2;
                    q1Var.invalidate();
                    return true;
                }
                if (q1Var.P5.J0 && (eVar = this.n) != null && eVar.S && eVar.getBounds().contains(x10, M1)) {
                    this.G = -3;
                    q1Var.invalidate();
                    return true;
                }
            } else if (action == 2) {
                if (this.G != -1) {
                    return true;
                }
            } else if (action == 1 && this.G != -1) {
                q1Var.playSoundEffect(0);
                int i7 = this.G;
                if (i7 == -2) {
                    sh.e eVar7 = this.m;
                    ImageReceiver imageReceiver = eVar7.b;
                    TLRPC.MessageMedia messageMedia = eVar7.T;
                    l1 l1Var = q1Var.Ra;
                    if (l1Var != null) {
                        l1Var.n(q1Var, null, messageMedia, -2);
                    }
                } else if (i7 == -3) {
                    sh.e eVar8 = this.n;
                    ImageReceiver imageReceiver2 = eVar8.b;
                    TLRPC.MessageMedia messageMedia2 = eVar8.T;
                    l1 l1Var2 = q1Var.Ra;
                    if (l1Var2 != null) {
                        l1Var2.n(q1Var, null, messageMedia2, -3);
                    }
                }
                this.G = -1;
                q1Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int i7) {
        q1 q1Var = this.a;
        CheckBoxBase[] checkBoxBaseArr = q1Var.e7;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i7) {
            if (checkBoxBaseArr != null) {
                int i10 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = q1Var.e7;
                    if (i10 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i10].l = false;
                    i10++;
                }
            }
            q1Var.e7 = new CheckBoxBase[i7];
            int i11 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = q1Var.e7;
                if (i11 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i11] = new CheckBoxBase(20, q1Var, q1Var.Pb);
                q1Var.e7[i11].k(false);
                q1Var.e7[i11].j(true);
                q1Var.e7[i11].d(9);
                i11++;
            }
        }
        if (this.I == null) {
            q1 q1Var2 = this.a;
            this.I = new org.telegram.ui.Components.b9(q1Var2.Z5, q1Var2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.N(1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0720, code lost:
    
        if (r63.y != r3) goto L221;
     */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0d2e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0dba  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0e8a  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0edf  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x1076  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x10ba  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x10cc  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x10d8  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x1110  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x1120  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x1137  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x1145  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x1171  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x118c  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x11b2  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x1224  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x11b5  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1174  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x1166  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x1148  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x113a  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x112a  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x10f9  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x10cf  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x10bd  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x108b  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0ea1  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0e5b  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0daf  */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Canvas canvas) {
        int X1;
        int X12;
        int X13;
        float f10;
        float f11;
        int i7;
        int i10;
        float f12;
        float L;
        int i11;
        int i12;
        long j3;
        int i13;
        q1 q1Var;
        Drawable[] drawableArr;
        RectF rectF;
        int i14;
        float f13;
        x1 x1Var;
        int[] iArr;
        ArrayList arrayList;
        int i15;
        int i16;
        int i17;
        float f14;
        float f15;
        ?? r12;
        float f16;
        int i18;
        float f17;
        int i19;
        int i20;
        float f18;
        int i21;
        long j10;
        float f19;
        int i22;
        int i23;
        int i24;
        int i25;
        float f20;
        float f21;
        org.telegram.ui.ActionBar.t4 t4Var;
        uh.d dVar;
        org.telegram.ui.Components.i6 i6Var;
        byte[] bArr;
        TLRPC.PollAnswer pollAnswer;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        ArrayList arrayList2;
        int i32;
        int i33;
        int i34;
        float f22;
        int i35;
        long j11;
        Canvas canvas2;
        int i36;
        RectF rectF2;
        float f23;
        int i37;
        int i38;
        Canvas canvas3;
        int i39;
        int i40;
        int i41;
        float f24;
        float f25;
        StaticLayout staticLayout;
        TLRPC.Poll poll;
        CheckBoxBase checkBoxBase;
        uh.b bVar;
        CheckBoxBase checkBoxBase2;
        byte[] bArr2;
        float f26;
        float f27;
        int i42;
        TLRPC.Poll poll2;
        float f28;
        float L2;
        int extraTextX;
        float f29;
        float f30;
        char c10;
        Canvas canvas4 = canvas;
        q1 q1Var2 = this.a;
        int[] iArr2 = q1Var2.K2;
        ArrayList arrayList3 = q1Var2.P4;
        Drawable[] drawableArr2 = q1Var2.I2;
        RectF rectF3 = q1Var2.b4;
        x1 x1Var2 = q1Var2.hb;
        long currentTimeMillis = System.currentTimeMillis();
        long j12 = currentTimeMillis - this.D;
        if (j12 > 17) {
            j12 = 17;
        }
        this.D = currentTimeMillis;
        if (q1Var2.P5.Q3()) {
            X1 = q1Var2.X1(org.telegram.ui.ActionBar.k6.Tc);
            X12 = q1Var2.X1(q1Var2.x2() ? org.telegram.ui.ActionBar.k6.bc : org.telegram.ui.ActionBar.k6.gc);
            X13 = q1Var2.X1(org.telegram.ui.ActionBar.k6.Vc);
        } else {
            X1 = q1Var2.X1(org.telegram.ui.ActionBar.k6.Sc);
            X12 = q1Var2.X1(q1Var2.x2() ? org.telegram.ui.ActionBar.k6.ce : org.telegram.ui.ActionBar.k6.be);
            X13 = q1Var2.X1(org.telegram.ui.ActionBar.k6.Uc);
        }
        org.telegram.ui.ActionBar.k6.O2.setColor(X1);
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.P2;
        textPaint.linkColor = X13;
        textPaint.setColor(X1);
        org.telegram.ui.ActionBar.k6.M2.setColor(X1);
        org.telegram.ui.ActionBar.k6.T2.setColor(X12);
        org.telegram.ui.ActionBar.k6.F2.setColor(X12);
        org.telegram.ui.ActionBar.k6.I2.setColor(X12);
        canvas4.save();
        int i43 = q1Var2.P5.J0 ? this.g : 0;
        if (x1Var2.i3) {
            float f31 = i43;
            f10 = org.telegram.messenger.g0.T1(x1Var2.h3 ? this.g : 0.0f, f31, x1Var2.L1);
            float f32 = f10 - f31;
            canvas4.translate(0.0f, f32);
            f11 = f32;
        } else {
            f10 = i43;
            f11 = 0.0f;
        }
        float f33 = f11;
        if (x1Var2.G2) {
            int i44 = q1Var2.Ta;
            i7 = X1;
            i10 = X12;
            f12 = 0.0f;
            canvas4.translate(0.0f, org.telegram.messenger.g0.W1(x1Var2.L1, x1Var2.H2, i44) + (-i44));
        } else {
            i7 = X1;
            i10 = X12;
            if (x1Var2.u2) {
                float f34 = q1Var2.Ta;
                float f35 = x1Var2.L1;
                float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f35, x1Var2.v2, f34 * f35);
                if (q1Var2.P5.o5()) {
                    z9 -= q1Var2.Ta;
                }
                f12 = 0.0f;
                canvas4.translate(0.0f, z9);
            } else {
                f12 = 0.0f;
            }
        }
        if (x1Var2.x0) {
            canvas4.translate(f12, x1Var2.k0);
        }
        if (q1Var2.P5.Q3()) {
            L = org.telegram.messenger.g0.L(11.0f) + (q1Var2.c7 - q1Var2.a7);
        } else {
            L = q1Var2.X6 ? org.telegram.messenger.g0.L(91.0f) : q1Var2.Y2() ? org.telegram.messenger.g0.L(68.0f) : org.telegram.messenger.g0.L(20.0f);
        }
        boolean z10 = x1Var2.x0;
        if (z10) {
            L += x1Var2.h0;
        }
        float f36 = L;
        float f37 = q1Var2.a7;
        if (z10) {
            f37 += x1Var2.i0 - x1Var2.h0;
        }
        float f38 = f37;
        int L3 = (int) (f36 - org.telegram.messenger.g0.L(9.0f));
        float f39 = f36 + f38;
        int L4 = (int) (f39 - org.telegram.messenger.g0.L(22.0f));
        if (f10 > org.telegram.messenger.g0.L(8.0f)) {
            if (q1Var2.m8 == null) {
                q1Var2.m8 = new zj0(q1Var2);
            }
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(0.0f, org.telegram.messenger.g0.L(5.0f), f38 - org.telegram.messenger.g0.L(33.0f), f10 - org.telegram.messenger.g0.L(3.0f));
            rectF4.offset(f36 + org.telegram.messenger.g0.L(1.0f), ((((org.telegram.messenger.g0.L(10.0f) + q1Var2.Ta) + this.q) + q1Var2.t3) + i43) - f10);
            q1Var2.m8.a(q1Var2.P5, q1Var2.ia, q1Var2.ja, q1Var2.Pb, 3);
            int i45 = X13;
            i13 = i43;
            int i46 = i10;
            iArr = iArr2;
            drawableArr = drawableArr2;
            i12 = L4;
            j3 = j12;
            int i47 = i7;
            q1Var2.m8.d(canvas, rectF4, 5.0f, 5.0f, 5.0f, 1.0f, true, false);
            canvas4 = canvas;
            q1Var2.m8.f(canvas4, rectF4, 1.0f);
            if (q1Var2.p3 != null) {
                int color = org.telegram.ui.ActionBar.k6.a3.getColor();
                org.telegram.ui.ActionBar.k6.a3.setColor(i47);
                canvas4.save();
                canvas4.clipRect(rectF4);
                sh.e eVar = this.n;
                if (eVar != null && eVar.S) {
                    int L5 = org.telegram.messenger.g0.L(10.0f) + ((int) rectF4.left);
                    int L6 = (((int) (rectF4.top + (this.g - org.telegram.messenger.g0.L(8.0f)))) - this.f) - org.telegram.messenger.g0.L(8.0f);
                    this.n.setBounds(L5, L6, this.e + L5, this.f + L6);
                    this.n.c(q1Var2.P5.O3());
                    sh.e eVar2 = this.n;
                    q1Var2.X1(q1Var2.P5.O3() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We);
                    my0 my0Var = eVar2.r;
                    if (my0Var != null) {
                        my0Var.n(i47);
                    }
                    my0 my0Var2 = eVar2.s;
                    if (my0Var2 != null) {
                        my0Var2.n(i46);
                    }
                    this.n.draw(canvas4);
                }
                if (this.c != null) {
                    int color2 = org.telegram.ui.ActionBar.k6.Y2.getColor();
                    org.telegram.ui.ActionBar.k6.Y2.setColor(q1Var2.m8.i());
                    canvas4.save();
                    canvas4.translate(rectF4.left + org.telegram.messenger.g0.L(10.0f), rectF4.top + org.telegram.messenger.g0.L(6.0f));
                    this.c.draw(canvas4);
                    canvas4.restore();
                    org.telegram.ui.ActionBar.k6.Y2.setColor(color2);
                    if (this.h != null) {
                        if (this.i != q1Var2.m8.i()) {
                            this.i = q1Var2.m8.i();
                            this.h.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.SRC_IN));
                        }
                        q1Var2.v5 = ((int) rectF4.right) - org.telegram.messenger.g0.L(16.33f);
                        q1Var2.w5 = org.telegram.messenger.g0.L(16.33f) + ((int) rectF4.top);
                        canvas4.save();
                        canvas4.scale(0.85f, 0.85f, q1Var2.v5, q1Var2.w5);
                        c10 = 2;
                        int z11 = f1.z(2, q1Var2.v5, this.h);
                        int y10 = f1.y(2, q1Var2.w5, this.h);
                        Drawable drawable = this.h;
                        drawable.setBounds(z11, y10, drawable.getIntrinsicWidth() + z11, this.h.getIntrinsicHeight() + y10);
                        this.h.draw(canvas4);
                        canvas4.restore();
                        org.telegram.ui.ActionBar.k6.b3.setColor(org.telegram.ui.ActionBar.k6.a3.getColor());
                        org.telegram.ui.ActionBar.k6.b3.linkColor = i45;
                        float L7 = rectF4.left + org.telegram.messenger.g0.L(10.0f);
                        q1Var2.t5 = L7;
                        float L8 = rectF4.top + org.telegram.messenger.g0.L(25.0f);
                        q1Var2.u5 = L8;
                        gj gjVar = q1Var2.p3;
                        i14 = i46;
                        i11 = L3;
                        rectF = rectF3;
                        x1Var = x1Var2;
                        i7 = i47;
                        f13 = 1.0f;
                        arrayList = arrayList3;
                        q1Var2.f1(L7, L8, canvas, gjVar.e, gjVar.d, true, 1.0f, true, false, false, true);
                        float L9 = rectF4.left + org.telegram.messenger.g0.L(10.0f);
                        float L10 = rectF4.top + org.telegram.messenger.g0.L(25.0f);
                        gj gjVar2 = q1Var2.p3;
                        q1Var2.I0(L9, L10, canvas, gjVar2.e, q1Var2.Da, true, 1.0f, gjVar2.d, true);
                        q1Var = q1Var2;
                        canvas4 = canvas;
                        canvas4.restore();
                        org.telegram.ui.ActionBar.k6.a3.setColor(color);
                    }
                }
                c10 = 2;
                org.telegram.ui.ActionBar.k6.b3.setColor(org.telegram.ui.ActionBar.k6.a3.getColor());
                org.telegram.ui.ActionBar.k6.b3.linkColor = i45;
                float L72 = rectF4.left + org.telegram.messenger.g0.L(10.0f);
                q1Var2.t5 = L72;
                float L82 = rectF4.top + org.telegram.messenger.g0.L(25.0f);
                q1Var2.u5 = L82;
                gj gjVar3 = q1Var2.p3;
                i14 = i46;
                i11 = L3;
                rectF = rectF3;
                x1Var = x1Var2;
                i7 = i47;
                f13 = 1.0f;
                arrayList = arrayList3;
                q1Var2.f1(L72, L82, canvas, gjVar3.e, gjVar3.d, true, 1.0f, true, false, false, true);
                float L92 = rectF4.left + org.telegram.messenger.g0.L(10.0f);
                float L102 = rectF4.top + org.telegram.messenger.g0.L(25.0f);
                gj gjVar22 = q1Var2.p3;
                q1Var2.I0(L92, L102, canvas, gjVar22.e, q1Var2.Da, true, 1.0f, gjVar22.d, true);
                q1Var = q1Var2;
                canvas4 = canvas;
                canvas4.restore();
                org.telegram.ui.ActionBar.k6.a3.setColor(color);
            } else {
                f13 = 1.0f;
                i14 = i46;
                i11 = L3;
                rectF = rectF3;
                x1Var = x1Var2;
                i7 = i47;
                arrayList = arrayList3;
                q1Var = q1Var2;
            }
        } else {
            i11 = L3;
            i12 = L4;
            j3 = j12;
            i13 = i43;
            q1Var = q1Var2;
            drawableArr = drawableArr2;
            rectF = rectF3;
            i14 = i10;
            f13 = 1.0f;
            x1Var = x1Var2;
            iArr = iArr2;
            arrayList = arrayList3;
        }
        if (q1Var.n2 != null) {
            canvas4.save();
            canvas4.translate(f36 + q1Var.getExtraTextX(), org.telegram.messenger.g0.L(15.0f) + q1Var.Ta + this.q + q1Var.t3 + i13);
            int alpha = org.telegram.ui.ActionBar.k6.O2.getAlpha();
            if (x1Var.l3 != null) {
                org.telegram.ui.ActionBar.k6.O2.setAlpha((int) (x1Var.L1 * alpha));
            }
            q1Var.n2.draw(canvas4);
            StaticLayout staticLayout2 = q1Var.n2;
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas4, staticLayout2, q1Var.Ca, 0.0f, null, 0.0f, 0.0f, 0.0f, x1Var.l3 != null ? x1Var.L1 : f13, q1Var.I1(1, staticLayout2.getPaint().getColor()));
            if (x1Var.l3 != null) {
                org.telegram.ui.ActionBar.k6.O2.setAlpha(alpha);
            }
            int height = q1Var.n2.getHeight();
            if (x1Var.l3 != null) {
                org.telegram.ui.ActionBar.k6.O2.setAlpha((int) ((f13 - x1Var.L1) * alpha));
                x1Var.l3.draw(canvas4);
                org.telegram.ui.ActionBar.k6.O2.setAlpha(alpha);
                StaticLayout staticLayout3 = x1Var.l3;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas4, staticLayout3, x1Var.m3, 0.0f, null, 0.0f, 0.0f, 0.0f, f13 - x1Var.L1, q1Var.I1(1, staticLayout3.getPaint().getColor()));
                i15 = org.telegram.messenger.g0.W1(x1Var.L1, x1Var.l3.getHeight(), height);
            } else {
                i15 = height;
            }
            canvas4.restore();
        } else {
            i15 = 0;
        }
        sh.e eVar3 = this.m;
        if (eVar3 == null || !eVar3.S) {
            i16 = i14;
            i17 = i7;
            f14 = f36;
        } else {
            int L11 = (org.telegram.messenger.g0.L(q1Var.Ta > 0 ? 11.0f : 5.0f) + q1Var.Ta) - ((int) f33);
            f14 = f36;
            int L12 = org.telegram.messenger.g0.L(2.0f) + (((int) f14) - org.telegram.messenger.g0.L(9.0f));
            this.m.setBounds(L12, L11, this.o + L12, this.p + L11);
            this.m.c(q1Var.P5.O3());
            sh.e eVar4 = this.m;
            q1Var.X1(q1Var.P5.O3() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We);
            my0 my0Var3 = eVar4.r;
            i17 = i7;
            if (my0Var3 != null) {
                my0Var3.n(i17);
            }
            my0 my0Var4 = eVar4.s;
            if (my0Var4 != null) {
                i16 = i14;
                my0Var4.n(i16);
            } else {
                i16 = i14;
            }
            this.m.draw(canvas4);
        }
        int L13 = org.telegram.messenger.g0.L(20.0f) + i15 + q1Var.Ta + this.q + q1Var.t3 + i13;
        if (q1Var.d3 != null) {
            canvas4.save();
            canvas4.translate(q1Var.f3 + f14 + q1Var.getExtraTextX(), L13);
            q1Var.d3.draw(canvas4);
            canvas4.restore();
            TLRPC.MessageMedia o12 = ij.o1(q1Var.P5.k);
            if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) o12;
                if (!tL_messageMediaPoll.poll.quiz || (!(q1Var.V4 || q1Var.W4 || q1Var.X4 || (this.x && (!this.v || this.w))) || TextUtils.isEmpty(tL_messageMediaPoll.results.solution))) {
                    f15 = 2.0f;
                    f16 = 0.3f;
                    i18 = 2;
                    f17 = 13.0f;
                    q1Var.n5 = -1;
                } else {
                    Drawable Y1 = q1Var.Y1(q1Var.P5.Q3() ? "drawable_chat_pollHintDrawableOut" : "drawable_chat_pollHintDrawableIn");
                    if (q1Var.Y4) {
                        Y1.setAlpha((int) (this.r * 255.0f));
                    } else {
                        Y1.setAlpha(qs.e4);
                    }
                    f16 = 0.3f;
                    q1Var.n5 = (int) (((f39 - org.telegram.messenger.g0.L(23.0f)) - Y1.getIntrinsicWidth()) - org.telegram.messenger.g0.L(8.0f));
                    q1Var.o5 = L13 - org.telegram.messenger.g0.L(6.0f);
                    int w10 = f1.w(2, q1Var.n5, Y1);
                    f15 = 2.0f;
                    int f40 = f1.f(2, q1Var.o5, Y1);
                    i18 = 2;
                    if (q1Var.q5) {
                        float f41 = q1Var.r5;
                        if (f41 < f13) {
                            f30 = org.telegram.ui.Components.m6.a.getInterpolation(f41);
                            f17 = 13.0f;
                            int intrinsicWidth = ((int) (Y1.getIntrinsicWidth() * f30)) / 2;
                            int intrinsicHeight = ((int) (Y1.getIntrinsicHeight() * f30)) / 2;
                            Y1.setBounds(w10 - intrinsicWidth, f40 - intrinsicHeight, w10 + intrinsicWidth, f40 + intrinsicHeight);
                            Y1.draw(canvas4);
                        }
                    }
                    f30 = q1Var.r5;
                    f17 = 13.0f;
                    int intrinsicWidth2 = ((int) (Y1.getIntrinsicWidth() * f30)) / 2;
                    int intrinsicHeight2 = ((int) (Y1.getIntrinsicHeight() * f30)) / 2;
                    Y1.setBounds(w10 - intrinsicWidth2, f40 - intrinsicHeight2, w10 + intrinsicWidth2, f40 + intrinsicHeight2);
                    Y1.draw(canvas4);
                }
            } else {
                f15 = 2.0f;
                f16 = 0.3f;
                i18 = 2;
                f17 = 13.0f;
                q1Var.n5 = -1;
            }
            if (this.I == null || q1Var.i6) {
                r12 = 0;
            } else {
                r12 = 0;
                int ceil = (int) Math.ceil(q1Var.d3.getLineLeft(0));
                if (q1Var.f3 == 0 && ceil == 0) {
                    org.telegram.messenger.g0.L(f17);
                    f29 = ((int) Math.ceil(q1Var.d3.getLineWidth(0))) + f14 + org.telegram.messenger.g0.L(7.0f) + q1Var.getExtraTextX();
                } else {
                    org.telegram.messenger.g0.L(f17);
                    int i48 = q1Var.f3;
                    if (i48 != 0) {
                        L2 = (i48 + f14) - org.telegram.messenger.g0.L(23.0f);
                        extraTextX = q1Var.getExtraTextX();
                    } else {
                        L2 = (ceil + f14) - org.telegram.messenger.g0.L(23.0f);
                        extraTextX = q1Var.getExtraTextX();
                    }
                    f29 = L2 - extraTextX;
                }
                if (q1Var.b5 && this.C) {
                    this.I.setAlpha((int) (c8.j9.a(q1Var.a5 ? (f13 - this.r) / f16 : this.r, 0.0f, f13) * 255.0f));
                } else {
                    this.I.setAlpha(qs.e4);
                }
                this.I.setBounds((int) f29, L13 - org.telegram.messenger.g0.L(1.0f), (int) (this.I.c.d.f.a + f29), org.telegram.messenger.g0.L(16.0f) + (L13 - org.telegram.messenger.g0.L(1.0f)));
                org.telegram.ui.Components.b9 b9Var = this.I;
                q1Var.K6.getClass();
                b9Var.c(canvas4);
            }
        } else {
            f15 = 2.0f;
            r12 = 0;
            f16 = 0.3f;
            i18 = 2;
            f17 = 13.0f;
        }
        if (((q1Var.W4 || q1Var.V4 || q1Var.X4) && !q1Var.Y4) || (poll2 = q1Var.i5) == null || !poll2.quiz || poll2.close_period == 0 || !q1Var.i6) {
            i19 = i17;
            i20 = i16;
            f18 = f17;
            i21 = -1;
            j10 = j3;
        } else {
            i20 = i16;
            long max = Math.max(0L, (q1Var.i5.close_date * 1000) - ConnectionsManager.getInstance(q1Var.Z5).getCurrentTimeMillis());
            i19 = i17;
            if (this.z != null) {
                f28 = 1000.0f;
            } else {
                f28 = 1000.0f;
            }
            this.z = org.telegram.messenger.g0.h0((int) Math.ceil(max / f28), r12);
            this.A = (int) Math.ceil(org.telegram.ui.ActionBar.k6.T2.measureText(r6));
            this.y = max;
            if (max <= 0 && !q1Var.W4) {
                if (q1Var.P5.u0 + 1000 < SystemClock.elapsedRealtime()) {
                    q1Var.P5.u0 = 0L;
                }
                q1Var.Ra.e2();
            }
            int L14 = (q1Var.K6.getBounds().right - this.A) - org.telegram.messenger.g0.L(q1Var.P5.Q3() ? 40.0f : 34.0f);
            if (max <= 5000) {
                org.telegram.ui.ActionBar.k6.T2.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.ha : org.telegram.ui.ActionBar.k6.ga));
            }
            if (this.B) {
                org.telegram.ui.ActionBar.k6.T2.setAlpha((int) ((1.0f - this.r) * 255.0f));
            }
            float f42 = f28;
            canvas4.drawText(this.z, L14, org.telegram.messenger.g0.L(11.0f) + L13, org.telegram.ui.ActionBar.k6.T2);
            org.telegram.ui.ActionBar.k6.Z1.setColor(org.telegram.ui.ActionBar.k6.T2.getColor());
            float f43 = f17;
            int C = org.telegram.messenger.k5.C(f43, this.A, L14);
            int L15 = org.telegram.messenger.g0.L(5.1f);
            int L16 = org.telegram.messenger.g0.L(6.0f) + L13;
            if (max <= 60000) {
                RectF rectF5 = rectF;
                rectF5.set(C - L15, L16 - L15, C + L15, L15 + L16);
                float min = (max / (Math.min(60, q1Var.i5.close_period) * f42)) * (-360.0f);
                i21 = -1;
                f18 = 13.0f;
                canvas4.drawArc(rectF5, -90.0f, min, false, org.telegram.ui.ActionBar.k6.Z1);
                q1Var.l5.a(min, q1Var.Y4 ? 1.0f - this.r : 1.0f, canvas, org.telegram.ui.ActionBar.k6.Z1, rectF5);
                canvas4 = canvas;
                rectF = rectF5;
            } else {
                f18 = f43;
                i21 = -1;
                canvas4.drawCircle(C, L16, L15, org.telegram.ui.ActionBar.k6.Z1);
            }
            if (max > 60000 || this.H != 0.0f) {
                org.telegram.ui.ActionBar.k6.Z1.setAlpha((int) (this.H * 255.0f));
                float f44 = C;
                canvas4.drawLine(f44 - (org.telegram.messenger.g0.L(2.1f) * this.H), L16 - org.telegram.messenger.g0.L(7.5f), (org.telegram.messenger.g0.L(2.1f) * this.H) + f44, L16 - org.telegram.messenger.g0.L(7.5f), org.telegram.ui.ActionBar.k6.Z1);
                float f45 = L16;
                canvas4 = canvas;
                canvas4.drawLine(f44, f45 - (org.telegram.messenger.g0.L(3.0f) * this.H), f44, f45, org.telegram.ui.ActionBar.k6.Z1);
                if (max <= 60000) {
                    j10 = j3;
                    float f46 = this.H - (j10 / 180.0f);
                    this.H = f46;
                    if (f46 < 0.0f) {
                        this.H = 0.0f;
                    }
                    q1Var.invalidate();
                }
            }
            j10 = j3;
            q1Var.invalidate();
        }
        if (drawableArr[r12] != null && ((i42 = iArr[r12]) == 1 || i42 == 3)) {
            if (i42 == 3) {
                canvas4.save();
                float f47 = q1Var.r5;
                canvas4.scale(f47, f47, drawableArr[r12].getBounds().centerX(), drawableArr[r12].getBounds().centerY());
            }
            drawableArr[r12].draw(canvas4);
            if (iArr[r12] == 3) {
                canvas4.restore();
            }
        }
        boolean E4 = q1Var.P5.E4();
        TLRPC.Poll poll3 = q1Var.i5;
        boolean z12 = (poll3 == null || !poll3.multiple_choice) ? r12 : true;
        boolean z13 = (E4 && q1Var.P5.q()) ? true : r12;
        boolean z14 = (q1Var.V4 && !this.w && this.v) ? true : r12;
        if (!this.C || z14) {
            f19 = 255.0f;
        } else {
            if (q1Var.a5) {
                f26 = 1.0f;
                f27 = 1.0f - this.r;
            } else {
                f26 = 1.0f;
                f27 = this.r;
            }
            f19 = Math.min(f27 / f16, f26) * 255.0f;
        }
        int i49 = (int) f19;
        int max2 = Math.max(q1Var.R4, (int) r12);
        while (true) {
            int i50 = q1Var.S4;
            if (i50 == i21) {
                i50 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (max2 > Math.min(i50, arrayList.size() - 1)) {
                break;
            }
            ArrayList arrayList4 = arrayList;
            p1 p1Var = (p1) arrayList4.get(max2);
            p1Var.a = (int) f14;
            int i51 = p1Var.b;
            int i52 = p1Var.c;
            if (p1Var.A != null) {
                i51 = org.telegram.messenger.g0.W1(x1Var.L1, p1Var.C, i51);
                i52 = org.telegram.messenger.g0.W1(x1Var.L1, p1Var.D, i52);
            }
            int i53 = i52;
            TLRPC.TodoItem todoItem = p1Var.t;
            if ((todoItem == null || todoItem.id != q1Var.b6) && (((bArr = q1Var.d6) == null || Arrays.equals(p1Var.s.option, bArr)) && ((pollAnswer = p1Var.s) == null || (bArr2 = pollAnswer.option) == null || !Arrays.equals(bArr2, q1Var.c6)))) {
                canvas4.save();
                int r13 = org.telegram.ui.ActionBar.k6.r1(0.12f, i20);
                if (p1Var.v != r13) {
                    Drawable drawable2 = p1Var.w;
                    p1Var.v = r13;
                    i26 = i49;
                    org.telegram.ui.ActionBar.k6.H1(drawable2, r13, false);
                } else {
                    i26 = i49;
                }
                long j13 = j10;
                p1Var.w.setBounds((int) (f14 - org.telegram.messenger.g0.L(8.0f)), (q1Var.Ta + i51) - org.telegram.messenger.g0.L(f18), (int) (f39 - org.telegram.messenger.g0.L(23.0f)), org.telegram.messenger.g0.L(f18) + q1Var.Ta + i51 + i53);
                p1Var.w.draw(canvas4);
                canvas4.restore();
                uh.b bVar2 = p1Var.x;
                if (bVar2 != null) {
                    i27 = i11;
                    i29 = i12;
                    bVar2.setBounds(i27, (q1Var.Ta + i51) - org.telegram.messenger.g0.L(f18), i29, org.telegram.messenger.g0.L(f18) + q1Var.Ta + i51 + i53);
                    i28 = i19;
                    p1Var.x.l(i28);
                    uh.b bVar3 = p1Var.x;
                    q1Var.K6.getClass();
                    bVar3.c(canvas4);
                } else {
                    i27 = i11;
                    i28 = i19;
                    i29 = i12;
                }
                canvas4.save();
                p1Var.m = org.telegram.messenger.g0.L(z13 ? 48.0f : 35.0f) + f14;
                p1Var.n = q1Var.Ta + i51;
                canvas4.translate(org.telegram.messenger.g0.L(z13 ? 48.0f : 35.0f) + f14, i51 + q1Var.Ta);
                if (x1Var.x0) {
                    canvas4.translate(0.0f, x1Var.k0);
                }
                int alpha2 = org.telegram.ui.ActionBar.k6.P2.getAlpha();
                if (p1Var.A != null) {
                    i30 = alpha2;
                    org.telegram.ui.ActionBar.k6.P2.setAlpha((int) (alpha2 * x1Var.L1));
                } else {
                    i30 = alpha2;
                }
                canvas4.save();
                if (E4 && z13 && p1Var.q != null && (checkBoxBase2 = q1Var.e7[max2]) != null) {
                    float progress = checkBoxBase2.getProgress();
                    canvas4.translate(0.0f, (-org.telegram.messenger.g0.L(7.66f)) * progress);
                    p1Var.n = ((-org.telegram.messenger.g0.L(7.66f)) * progress) + p1Var.n;
                }
                if (max2 == q1Var.x0 && q1Var.t4.i(canvas4, 4)) {
                    q1Var.invalidate();
                }
                if (p1Var.o && (bVar = p1Var.x) != null) {
                    canvas4.translate(-bVar.d(org.telegram.messenger.g0.L(7.0f)), 0.0f);
                }
                p1Var.p.draw(canvas4);
                StaticLayout staticLayout4 = p1Var.p;
                i31 = max2;
                arrayList2 = arrayList4;
                int i54 = i28;
                i32 = i27;
                i33 = i29;
                i34 = i20;
                f22 = f14;
                int i55 = i30;
                i35 = i26;
                j11 = j13;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, staticLayout4, p1Var.r, 0.0f, null, 0.0f, 0.0f, 0.0f, p1Var.A != null ? x1Var.L1 : 1.0f, q1Var.I1(1, staticLayout4.getPaint().getColor()));
                if (p1Var.A != null) {
                    org.telegram.ui.ActionBar.k6.P2.setAlpha((int) ((1.0f - x1Var.L1) * i55));
                    p1Var.A.draw(canvas);
                    StaticLayout staticLayout5 = p1Var.A;
                    org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, staticLayout5, p1Var.B, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f - x1Var.L1, q1Var.I1(1, staticLayout5.getPaint().getColor()));
                    org.telegram.ui.ActionBar.k6.P2.setAlpha(i55);
                }
                canvas.restore();
                if (E4 && z13 && p1Var.q != null && (checkBoxBase = q1Var.e7[i31]) != null) {
                    float progress2 = checkBoxBase.getProgress();
                    if (progress2 > 0.0f) {
                        my0 my0Var5 = p1Var.q;
                        my0Var5.p = f38 - org.telegram.messenger.g0.L(8.0f);
                        my0Var5.c(0.0f, (p1Var.q.i() / f15) + (p1Var.p.getHeight() - org.telegram.messenger.g0.L(6.0f)), progress2, i34, canvas);
                        canvas2 = canvas;
                        org.telegram.ui.ActionBar.k6.P2.setAlpha(i55);
                        if (!E4 || ((!q1Var.V4 || (!this.w && this.v)) && !q1Var.W4 && !q1Var.X4 && ((!this.x || (this.v && !this.w)) && (!this.C || z14)))) {
                            i36 = i54;
                            rectF2 = rectF;
                            f23 = 0.0f;
                            i37 = 2;
                        } else {
                            TLRPC.Poll poll4 = q1Var.i5;
                            if (poll4 == null || !poll4.quiz) {
                                org.telegram.ui.ActionBar.k6.S1.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le));
                            } else {
                                int i56 = p1Var.l ? q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.fa : org.telegram.ui.ActionBar.k6.ea : q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.ha : org.telegram.ui.ActionBar.k6.ga;
                                if (!q1Var.K6.m() || org.telegram.ui.ActionBar.k6.f1(i56)) {
                                    org.telegram.ui.ActionBar.k6.S1.setColor(q1Var.X1(i56));
                                } else {
                                    org.telegram.ui.ActionBar.k6.S1.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le));
                                }
                            }
                            if (this.C && !z14) {
                                float f48 = i35;
                                org.telegram.ui.ActionBar.k6.M2.setAlpha((int) ((org.telegram.ui.ActionBar.k6.M2.getAlpha() / 255.0f) * f48));
                                org.telegram.ui.ActionBar.k6.S1.setAlpha((int) (f48 * (org.telegram.ui.ActionBar.k6.S1.getAlpha() / 255.0f)));
                            }
                            boolean z15 = p1Var.i || p1Var.k || ((poll = q1Var.i5) != null && poll.quiz && p1Var.l && (q1Var.V4 || q1Var.W4 || q1Var.X4 || (this.x && (!this.v || this.w))));
                            int i57 = p1Var.f;
                            String format = String.format("%d%%", Integer.valueOf(c8.j9.b((int) Math.ceil(((p1Var.d - i57) * this.r) + i57), 0, 100)));
                            float ceil2 = (-org.telegram.messenger.g0.L(6.5f)) - ((int) Math.ceil(org.telegram.ui.ActionBar.k6.M2.measureText(format)));
                            float L17 = org.telegram.messenger.g0.L(14.0f);
                            if (!z15 || (staticLayout = p1Var.p) == null) {
                                i41 = 2;
                            } else {
                                i41 = 2;
                                if (staticLayout.getLineCount() < 2) {
                                    f24 = q1Var.T4;
                                    canvas2.drawText(format, ceil2, L17 + f24, org.telegram.ui.ActionBar.k6.M2);
                                    int L18 = q1Var.a7 - org.telegram.messenger.g0.L(76.0f);
                                    float f49 = p1Var.h;
                                    float f50 = ((p1Var.g - f49) * this.r) + f49;
                                    if (z14) {
                                        int color3 = org.telegram.ui.ActionBar.k6.S1.getColor();
                                        int alpha3 = Color.alpha(color3);
                                        float L19 = L18 - (this.u ? org.telegram.messenger.g0.L(37.33f) : 0);
                                        i36 = i54;
                                        org.telegram.ui.ActionBar.k6.S1.setColor(i0.a.o(i36, (alpha3 * 16) / qs.e4));
                                        float f51 = f50 * L19;
                                        i37 = i41;
                                        rectF2 = rectF;
                                        rectF2.set(Math.max(f51 - org.telegram.messenger.g0.L(f15), 0.0f), org.telegram.messenger.g0.L(6.0f) + i53, L19, org.telegram.messenger.g0.L(11.0f) + i53);
                                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), org.telegram.ui.ActionBar.k6.S1);
                                        org.telegram.ui.ActionBar.k6.S1.setColor(color3);
                                        f25 = 0.0f;
                                        rectF2.set(0.0f, org.telegram.messenger.g0.L(6.0f) + i53, f51, org.telegram.messenger.g0.L(11.0f) + i53);
                                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f15), org.telegram.ui.ActionBar.k6.S1);
                                    } else {
                                        i37 = i41;
                                        i36 = i54;
                                        rectF2 = rectF;
                                        f25 = 0.0f;
                                    }
                                    if (z15) {
                                        f23 = f25;
                                    } else {
                                        float L20 = rectF2.left - org.telegram.messenger.g0.L(15.5f);
                                        float centerY = rectF2.centerY() + q1Var.T4;
                                        float L21 = org.telegram.messenger.g0.L(7.0f);
                                        float L22 = org.telegram.messenger.g0.L(z12 ? 4.5f : 7.0f);
                                        float f52 = L20 - L21;
                                        float f53 = centerY - L21;
                                        float f54 = L20 + L21;
                                        float f55 = centerY + L21;
                                        canvas2.saveLayerAlpha(f52, f53, f54, f55, i35);
                                        TLRPC.Poll poll5 = q1Var.i5;
                                        Drawable drawable3 = (poll5 == null || !poll5.quiz || p1Var.l) ? org.telegram.ui.ActionBar.k6.K4[q1Var.P5.Q3() ? 1 : 0] : org.telegram.ui.ActionBar.k6.L4[q1Var.P5.Q3() ? 1 : 0];
                                        z.t(drawable3, L20 - (drawable3.getIntrinsicWidth() / 2), centerY - (drawable3.getIntrinsicHeight() / 2));
                                        drawable3.draw(canvas2);
                                        if (q1Var.Pc == null) {
                                            Paint paint = new Paint(1);
                                            q1Var.Pc = paint;
                                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                                        }
                                        q1Var.Pc.setColor(org.telegram.ui.ActionBar.k6.S1.getColor());
                                        i35 = i35;
                                        f23 = 0.0f;
                                        canvas2.drawRoundRect(f52, f53, f54, f55, L22, L22, q1Var.Pc);
                                        canvas.restore();
                                    }
                                }
                            }
                            f24 = 0.0f;
                            canvas2.drawText(format, ceil2, L17 + f24, org.telegram.ui.ActionBar.k6.M2);
                            int L182 = q1Var.a7 - org.telegram.messenger.g0.L(76.0f);
                            float f492 = p1Var.h;
                            float f502 = ((p1Var.g - f492) * this.r) + f492;
                            if (z14) {
                            }
                            if (z15) {
                            }
                        }
                        if (!E4 || (!(q1Var.V4 || q1Var.W4 || q1Var.X4 || (this.x && (!this.v || this.w))) || z14 || this.C)) {
                            if (q1Var.x2()) {
                                org.telegram.ui.ActionBar.k6.a2.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.oc : org.telegram.ui.ActionBar.k6.me));
                            } else {
                                org.telegram.ui.ActionBar.k6.a2.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.pc : org.telegram.ui.ActionBar.k6.ne));
                            }
                            if (this.C && !z14) {
                                org.telegram.ui.ActionBar.k6.a2.setAlpha((int) ((255 - i35) * (org.telegram.ui.ActionBar.k6.a2.getAlpha() / 255.0f)));
                            }
                            canvas4 = canvas;
                            canvas4.drawLine(-org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f18) + i53, f38 - org.telegram.messenger.g0.L(z13 ? 71.0f : 58.0f), org.telegram.messenger.g0.L(f18) + i53, org.telegram.ui.ActionBar.k6.a2);
                            if (E4 || z13) {
                                if (E4 && q1Var.Y4) {
                                    i38 = i31;
                                    if (i38 != q1Var.c5 || z14) {
                                        rectF = rectF2;
                                    } else {
                                        org.telegram.ui.ActionBar.k6.X1.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le));
                                        if (this.C && !z14) {
                                            org.telegram.ui.ActionBar.k6.X1.setAlpha((int) ((255 - i35) * (org.telegram.ui.ActionBar.k6.X1.getAlpha() / 255.0f)));
                                        }
                                        rectF2.set((-org.telegram.messenger.g0.L(z13 ? 35.0f : 22.0f)) - org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(9.0f) - org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(8.5f) + (-org.telegram.messenger.g0.L(23.0f)), org.telegram.messenger.g0.L(8.5f) + org.telegram.messenger.g0.L(9.0f));
                                        RectF rectF6 = rectF2;
                                        canvas4.drawArc(rectF6, this.E, q1Var.d5, false, org.telegram.ui.ActionBar.k6.X1);
                                        rectF = rectF6;
                                        canvas4 = canvas;
                                        i31 = i38;
                                        canvas4.restore();
                                    }
                                } else {
                                    rectF = rectF2;
                                    i38 = i31;
                                }
                                if (this.x || (this.v && !this.w)) {
                                    if (q1Var.P5.Q3()) {
                                        org.telegram.ui.ActionBar.k6.X1.setColor(q1Var.X1(q1Var.x2() ? org.telegram.ui.ActionBar.k6.pd : org.telegram.ui.ActionBar.k6.od));
                                    } else {
                                        org.telegram.ui.ActionBar.k6.X1.setColor(q1Var.X1(q1Var.x2() ? org.telegram.ui.ActionBar.k6.Ib : org.telegram.ui.ActionBar.k6.Hb));
                                    }
                                    if (this.C && !z14) {
                                        org.telegram.ui.ActionBar.k6.X1.setAlpha((int) ((255 - i35) * (org.telegram.ui.ActionBar.k6.X1.getAlpha() / 255.0f)));
                                    }
                                    float f56 = -org.telegram.messenger.g0.L(!z13 ? 35.0f : 22.0f);
                                    float L23 = org.telegram.messenger.g0.L(9.0f);
                                    float L24 = org.telegram.messenger.g0.L(!z12 ? 8.0f : 8.5f);
                                    if (z12) {
                                        i31 = i38;
                                        canvas3 = canvas;
                                        canvas3.drawCircle(f56, L23, L24, org.telegram.ui.ActionBar.k6.X1);
                                    } else {
                                        i31 = i38;
                                        canvas.drawRoundRect(f56 - L24, L23 - L24, f56 + L24, L24 + L23, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.X1);
                                        canvas3 = canvas;
                                    }
                                    if (!z12 || z14 || E4) {
                                        int L25 = org.telegram.messenger.g0.L(z12 ? 8.0f : 8.5f);
                                        int i58 = org.telegram.ui.ActionBar.k6.k7;
                                        if (q1Var.P5.Q3()) {
                                            i39 = -1;
                                        } else {
                                            i39 = -1;
                                            if (q1Var.X1(i58) == -1) {
                                                i58 = org.telegram.ui.ActionBar.k6.ob;
                                            }
                                        }
                                        q1Var.e7[i31].h(i39, !q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le, i58);
                                        i40 = L25 / 2;
                                        q1Var.e7[i31].e((-org.telegram.messenger.g0.L(!z13 ? 35.0f : 22.0f)) - i40, org.telegram.messenger.g0.L(9.0f) - i40, L25, L25);
                                        q1Var.e7[i31].i(!z12 ? org.telegram.messenger.g0.L(5.0f) : f23);
                                        q1Var.e7[i31].l(!z12 ? 19.0f : 20.0f);
                                        q1Var.e7[i31].a(canvas3);
                                        if (p1Var.t != null && p1Var.z != null) {
                                            if (this.J == null) {
                                                Paint paint2 = new Paint(1);
                                                this.J = paint2;
                                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                            }
                                            float progress3 = q1Var.e7[i31].getProgress();
                                            float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, progress3);
                                            p1Var.z.y0(org.telegram.messenger.g0.L(8.0f) + ((-org.telegram.messenger.g0.L(!z13 ? 35.0f : 22.0f)) - i40), org.telegram.messenger.g0.L(9.0f) - (org.telegram.messenger.g0.L(20.0f) / 2), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                                            canvas4 = canvas;
                                            canvas4.saveLayerAlpha(p1Var.z.x(), p1Var.z.z(), p1Var.z.y(), p1Var.z.A(), qs.e4, 31);
                                            canvas4.save();
                                            canvas4.scale(T1, T1, p1Var.z.x(), p1Var.z.s());
                                            p1Var.z.setAlpha(progress3);
                                            p1Var.z.g(canvas4);
                                            canvas4.restore();
                                            canvas4.drawCircle(-org.telegram.messenger.g0.L(z13 ? 35.0f : 22.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), this.J);
                                            canvas4.restore();
                                            canvas4.restore();
                                        }
                                    }
                                    canvas4 = canvas3;
                                    canvas4.restore();
                                }
                                canvas4 = canvas;
                                i31 = i38;
                                canvas4.restore();
                            } else if (p1Var.i) {
                                if (this.L == null) {
                                    Path path = new Path();
                                    this.L = path;
                                    path.moveTo(-org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(0.16f));
                                    this.L.lineTo(org.telegram.messenger.g0.L(-1.0f), org.telegram.messenger.g0.L(3.0f));
                                    this.L.lineTo(org.telegram.messenger.g0.L(3.66f), org.telegram.messenger.g0.L(-3.0f));
                                }
                                if (this.K == null) {
                                    Paint paint3 = new Paint(1);
                                    this.K = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                    this.K.setStrokeCap(Paint.Cap.ROUND);
                                    this.K.setStrokeJoin(Paint.Join.ROUND);
                                }
                                this.K.setStrokeWidth(org.telegram.messenger.g0.L(1.833f));
                                this.K.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le));
                                canvas4.save();
                                canvas4.translate(-org.telegram.messenger.g0.L(z13 ? 35.0f : 22.0f), org.telegram.messenger.g0.L(9.0f));
                                canvas4.drawPath(this.L, this.K);
                                canvas4.restore();
                            } else {
                                org.telegram.ui.ActionBar.k6.a2.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le));
                                canvas4.drawCircle(-org.telegram.messenger.g0.L(z13 ? 35.0f : 22.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(2.5f), org.telegram.ui.ActionBar.k6.a2);
                            }
                        } else {
                            canvas4 = canvas;
                        }
                        rectF = rectF2;
                        canvas4.restore();
                    }
                }
                canvas2 = canvas;
                org.telegram.ui.ActionBar.k6.P2.setAlpha(i55);
                if (E4) {
                }
                i36 = i54;
                rectF2 = rectF;
                f23 = 0.0f;
                i37 = 2;
                if (E4) {
                }
                if (q1Var.x2()) {
                }
                if (this.C) {
                    org.telegram.ui.ActionBar.k6.a2.setAlpha((int) ((255 - i35) * (org.telegram.ui.ActionBar.k6.a2.getAlpha() / 255.0f)));
                }
                canvas4 = canvas;
                canvas4.drawLine(-org.telegram.messenger.g0.L(f15), org.telegram.messenger.g0.L(f18) + i53, f38 - org.telegram.messenger.g0.L(z13 ? 71.0f : 58.0f), org.telegram.messenger.g0.L(f18) + i53, org.telegram.ui.ActionBar.k6.a2);
                if (E4) {
                }
                if (E4) {
                }
                rectF = rectF2;
                i38 = i31;
                if (this.x) {
                }
                if (q1Var.P5.Q3()) {
                }
                if (this.C) {
                    org.telegram.ui.ActionBar.k6.X1.setAlpha((int) ((255 - i35) * (org.telegram.ui.ActionBar.k6.X1.getAlpha() / 255.0f)));
                }
                float f562 = -org.telegram.messenger.g0.L(!z13 ? 35.0f : 22.0f);
                float L232 = org.telegram.messenger.g0.L(9.0f);
                float L242 = org.telegram.messenger.g0.L(!z12 ? 8.0f : 8.5f);
                if (z12) {
                }
                if (!z12) {
                }
                int L252 = org.telegram.messenger.g0.L(z12 ? 8.0f : 8.5f);
                int i582 = org.telegram.ui.ActionBar.k6.k7;
                if (q1Var.P5.Q3()) {
                }
                q1Var.e7[i31].h(i39, !q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.nc : org.telegram.ui.ActionBar.k6.le, i582);
                i40 = L252 / 2;
                q1Var.e7[i31].e((-org.telegram.messenger.g0.L(!z13 ? 35.0f : 22.0f)) - i40, org.telegram.messenger.g0.L(9.0f) - i40, L252, L252);
                q1Var.e7[i31].i(!z12 ? org.telegram.messenger.g0.L(5.0f) : f23);
                q1Var.e7[i31].l(!z12 ? 19.0f : 20.0f);
                q1Var.e7[i31].a(canvas3);
                if (p1Var.t != null) {
                    if (this.J == null) {
                    }
                    float progress32 = q1Var.e7[i31].getProgress();
                    float T12 = org.telegram.messenger.g0.T1(0.5f, 1.0f, progress32);
                    p1Var.z.y0(org.telegram.messenger.g0.L(8.0f) + ((-org.telegram.messenger.g0.L(!z13 ? 35.0f : 22.0f)) - i40), org.telegram.messenger.g0.L(9.0f) - (org.telegram.messenger.g0.L(20.0f) / 2), org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(20.0f));
                    canvas4 = canvas;
                    canvas4.saveLayerAlpha(p1Var.z.x(), p1Var.z.z(), p1Var.z.y(), p1Var.z.A(), qs.e4, 31);
                    canvas4.save();
                    canvas4.scale(T12, T12, p1Var.z.x(), p1Var.z.s());
                    p1Var.z.setAlpha(progress32);
                    p1Var.z.g(canvas4);
                    canvas4.restore();
                    canvas4.drawCircle(-org.telegram.messenger.g0.L(z13 ? 35.0f : 22.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(11.0f), this.J);
                    canvas4.restore();
                    canvas4.restore();
                }
                canvas4 = canvas3;
                canvas4.restore();
            } else {
                j11 = j10;
                arrayList2 = arrayList4;
                i34 = i20;
                i37 = i18;
                i32 = i11;
                i33 = i12;
                i35 = i49;
                i31 = max2;
                f22 = f14;
                i36 = i19;
            }
            max2 = i31 + 1;
            i49 = i35;
            i19 = i36;
            f14 = f22;
            i20 = i34;
            arrayList = arrayList2;
            j10 = j11;
            i11 = i32;
            i12 = i33;
            i18 = i37;
            i21 = -1;
        }
        int i59 = i49;
        long j14 = j10;
        ArrayList arrayList5 = arrayList;
        int i60 = i18;
        int i61 = i11;
        int i62 = i12;
        float f57 = f14;
        if (arrayList5.isEmpty()) {
            i22 = 0;
        } else {
            p1 p1Var2 = (p1) jg.g.i(1, arrayList5);
            int i63 = p1Var2.b;
            int i64 = p1Var2.c;
            if (p1Var2.A != null) {
                i63 = org.telegram.messenger.g0.W1(x1Var.L1, p1Var2.C, i63);
                i64 = org.telegram.messenger.g0.W1(x1Var.L1, p1Var2.D, i64);
            }
            i22 = q1Var.Ta + i63 + i64;
        }
        if (this.s) {
            i23 = x1Var.V2 ? org.telegram.messenger.g0.W1(x1Var.L1, x1Var.X2, q1Var.P1) : q1Var.P1;
        } else {
            i23 = 0;
        }
        if (!this.s || this.l == null) {
            i24 = i61;
            i25 = i62;
        } else {
            int L26 = org.telegram.messenger.g0.L(f18) + i22;
            int L27 = org.telegram.messenger.g0.L(44.33f);
            uh.a aVar = this.l;
            TLRPC.Poll poll6 = q1Var.i5;
            aVar.e(((poll6 == null || poll6.public_voters || poll6.multiple_choice) ? org.telegram.ui.ActionBar.k6.I2 : org.telegram.ui.ActionBar.k6.F2).getColor());
            i24 = i61;
            i25 = i62;
            this.l.setBounds(i24, L26, i25, L27 + L26);
            this.l.draw(canvas4);
            if (q1Var.Ra != null) {
                canvas4.save();
                canvas4.translate(i24, L26);
                q1Var.Ra.y0(q1Var);
                canvas4.restore();
            }
            if ((!q1Var.V4 && !q1Var.W4 && !q1Var.X4) || z14 || this.C) {
                int color4 = org.telegram.ui.ActionBar.k6.a2.getColor();
                if (q1Var.x2()) {
                    org.telegram.ui.ActionBar.k6.a2.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.pc : org.telegram.ui.ActionBar.k6.ne));
                } else {
                    org.telegram.ui.ActionBar.k6.a2.setColor(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.oc : org.telegram.ui.ActionBar.k6.me));
                }
                if (this.C && !z14) {
                    org.telegram.ui.ActionBar.k6.a2.setAlpha((int) ((qs.e4 - i59) * (org.telegram.ui.ActionBar.k6.a2.getAlpha() / 255.0f)));
                }
                float f58 = L26 + i23;
                canvas4.drawLine((f57 + org.telegram.messenger.g0.L(35.0f)) - org.telegram.messenger.g0.L(f15), f58, ((f57 + org.telegram.messenger.g0.L(35.0f)) + f38) - org.telegram.messenger.g0.L(58.0f), f58, org.telegram.ui.ActionBar.k6.a2);
                org.telegram.ui.ActionBar.k6.a2.setColor(color4);
            }
        }
        if (this.s) {
            i22 += i23;
        }
        uh.d dVar2 = this.k;
        float b10 = dVar2 != null ? dVar2.b() : 0.0f;
        float f59 = (E4 || (i6Var = q1Var.y3) == null || !i6Var.isVisible()) ? 0.0f : 1.0f;
        boolean z16 = q1Var.t2;
        float f60 = z16 ? 1.0f : 0.0f;
        if (z16) {
            int L28 = org.telegram.messenger.g0.L((q1Var.P5.Q3() || q1Var.B6 || q1Var.J) ? f15 : 8.0f) + q1Var.getCurrentBackgroundLeft();
            int L29 = org.telegram.messenger.g0.L(f18) + i22;
            if (q1Var.P5.Q3()) {
                org.telegram.ui.ActionBar.k6.M2.setColor(q1Var.X1(org.telegram.ui.ActionBar.k6.Lb));
            } else {
                org.telegram.ui.ActionBar.k6.M2.setColor(q1Var.X1(org.telegram.ui.ActionBar.k6.yd));
            }
            f20 = b10;
            q1Var.L2.set(L28, L29, q1Var.C2 + L28, org.telegram.messenger.g0.L(44.0f) + L29);
            Drawable drawable4 = drawableArr[0];
            if (drawable4 != null && iArr[0] == i60) {
                drawable4.setBounds(L28 - org.telegram.messenger.g0.L(this.b ? 6.0f : 0.0f), L29, q1Var.C2 + L28, org.telegram.messenger.g0.L(44.0f) + L29);
                drawableArr[0].draw(canvas4);
            }
            if (q1Var.P5.U3() && (dVar = this.k) != null) {
                dVar.c(q1Var.X1(q1Var.P5.Q3() ? org.telegram.ui.ActionBar.k6.Lb : org.telegram.ui.ActionBar.k6.yd));
                this.k.setBounds(i24, L29, i25, org.telegram.messenger.g0.L(44.0f) + L29);
                this.k.d((-org.telegram.messenger.g0.L(7.0f)) * f59);
                this.k.draw(canvas4);
            } else if (q1Var.q2 != null) {
                canvas4.save();
                canvas4.translate(L28 + q1Var.A2, org.telegram.messenger.g0.L(14.5f) + L29);
                q1Var.q2.draw(canvas4);
                canvas4.restore();
            }
        } else {
            f20 = b10;
            if (q1Var.x3 != null) {
                float L30 = ((1.0f - f59) * org.telegram.messenger.g0.L(6.0f)) + org.telegram.messenger.g0.L(25.0f) + i22;
                canvas4.save();
                if (x1Var.x0) {
                    canvas4.translate(((q1Var.getBackgroundDrawableRight() + x1Var.i0) + (q1Var.getBackgroundDrawableLeft() + x1Var.h0)) / f15, L30);
                } else {
                    canvas4.translate((q1Var.getBackgroundDrawableRight() + q1Var.getBackgroundDrawableLeft()) / f15, L30);
                }
                q1Var.x3.setBounds(-1, -1, 1, 1);
                org.telegram.ui.Components.i6 i6Var2 = q1Var.x3;
                TLRPC.Poll poll7 = q1Var.i5;
                i6Var2.u(((poll7 == null || poll7.public_voters || poll7.multiple_choice) ? org.telegram.ui.ActionBar.k6.I2 : org.telegram.ui.ActionBar.k6.F2).getColor());
                q1Var.x3.draw(canvas4);
                canvas4.restore();
            }
        }
        if (E4 || q1Var.y3 == null) {
            f21 = 1.0f;
        } else {
            float L31 = (org.telegram.messenger.g0.L(3.0f) * f60) + com.google.android.recaptcha.internal.a.z(1.0f, f59, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(41.0f) + i22);
            canvas4.save();
            if (x1Var.x0) {
                canvas4.translate(((q1Var.getBackgroundDrawableRight() + x1Var.i0) + (q1Var.getBackgroundDrawableLeft() + x1Var.h0)) / f15, L31);
            } else {
                canvas4.translate((i24 + i25) / f15, L31);
            }
            q1Var.y3.setBounds(-1, -1, 1, 1);
            org.telegram.ui.Components.i6 i6Var3 = q1Var.y3;
            TLRPC.Poll poll8 = q1Var.i5;
            i6Var3.u(((poll8 == null || poll8.public_voters || poll8.multiple_choice) ? org.telegram.ui.ActionBar.k6.I2 : org.telegram.ui.ActionBar.k6.F2).getColor());
            f21 = 1.0f;
            bg.s.b(canvas4, q1Var.y3, 1.0f - f20);
            canvas4.restore();
        }
        j(j14);
        canvas4.restore();
        if (f20 >= f21) {
            q1Var.a0(true);
        }
        pg0 pg0Var = q1Var.n3;
        if (pg0Var != null) {
            if ((pg0Var.e || pg0Var.f) && (t4Var = q1Var.K6) != null) {
                canvas4.save();
                canvas4.clipPath(t4Var.o());
                Paint paint4 = q1Var.n3.i;
                ij ijVar = q1Var.P5;
                int X14 = q1Var.X1((ijVar == null || !ijVar.Q3() || q1Var.P5.r1) ? org.telegram.ui.ActionBar.k6.Id : org.telegram.ui.ActionBar.k6.Ob);
                org.telegram.ui.ActionBar.k6.j1();
                paint4.setColor(org.telegram.ui.ActionBar.k6.r1(0.2f, X14));
                q1Var.n3.c(canvas, q1Var.n0, q1Var.t0, t4Var.getBounds(), q1Var.O1(true));
                canvas.restore();
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.a.P4;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((p1) arrayList.get(i7)).w.setState(StateSet.NOTHING);
            }
        }
        uh.a aVar = this.l;
        if (aVar != null) {
            aVar.a.setState(StateSet.NOTHING);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0aa6  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0acf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(ij ijVar, boolean z9) {
        boolean z10;
        float f10;
        String L0;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i7;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        CharSequence charSequence;
        float f11;
        boolean z16;
        boolean z17;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        ch.p0 p0Var;
        boolean z18;
        int i10;
        int i11;
        CharSequence charSequence2;
        int i12;
        int i13;
        Object obj;
        Object obj2;
        int i14;
        p1 p1Var;
        Boolean bool;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        CharSequence charSequence3;
        int L;
        ch.p0 p0Var2;
        ArrayList arrayList3;
        Object obj3;
        Object obj4;
        byte[] bArr2;
        boolean z19;
        boolean z20;
        CharSequence charSequence4;
        int i15;
        int i16;
        CharSequence charSequence5;
        int i17;
        p1 p1Var2;
        boolean z21;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        p1 p1Var3;
        boolean z22;
        ArrayList arrayList4;
        int i18;
        byte[] bArr3;
        int i19;
        int i20;
        boolean z23;
        boolean z24;
        TLRPC.Message message;
        c10 c10Var;
        TLRPC.PollResults pollResults;
        CharSequence ellipsize;
        int currentTime;
        TLRPC.Message message2;
        c10 c10Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String L02;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i21;
        boolean z25;
        int i22;
        ij ijVar2 = ijVar;
        q1 q1Var = this.a;
        ch.p0 p0Var3 = q1Var.N;
        ArrayList arrayList5 = q1Var.P4;
        int i23 = q1Var.Z5;
        if (q1Var.l5 == null) {
            q1Var.l5 = new c01();
        }
        q1Var.X4 = false;
        q1Var.B0(0);
        q1Var.i9 = true;
        q1Var.r9 = !q1Var.t6;
        q1Var.N1 = false;
        int min = Math.min(org.telegram.messenger.g0.L(500.0f), ijVar2.m1());
        q1Var.a7 = org.telegram.messenger.g0.L(31.0f) + min;
        TLRPC.MessageMedia o12 = ij.o1(ijVar2.k);
        boolean z26 = o12 instanceof TLRPC.TL_messageMediaPoll;
        if (z26) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) o12;
            TLRPC.Poll poll = tL_messageMediaPoll2.poll;
            boolean z27 = poll.quiz;
            z13 = poll.public_voters;
            boolean z28 = poll.multiple_choice;
            int i24 = tL_messageMediaPoll2.results.total_voters;
            this.H = poll.close_date - ConnectionsManager.getInstance(i23).getCurrentTime() < 60 ? 0.0f : 1.0f;
            TLRPC.Poll poll2 = tL_messageMediaPoll2.poll;
            boolean z29 = poll2.closed;
            q1Var.W4 = z29;
            z10 = z26;
            q1Var.X4 = ijVar2.K0;
            this.v = poll2.hide_results_until_close;
            TLRPC.TL_textWithEntities tL_textWithEntities4 = poll2.question;
            if (z29) {
                L02 = hd.L0(2131750696);
            } else if (poll2.quiz) {
                L02 = hd.L0(poll2.public_voters ? 2131746444 : 2131754248);
            } else {
                L02 = poll2.public_voters ? hd.L0(2131746587) : hd.L0(2131754249);
            }
            L0 = L02;
            q1Var.i5 = tL_messageMediaPoll2.poll;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll2.results;
            q1Var.j5 = pollResults2.results;
            q1Var.k5 = pollResults2.total_voters;
            CharSequence charSequence6 = ijVar2.A;
            this.d = charSequence6;
            if (charSequence6 == null && !TextUtils.isEmpty(pollResults2.solution)) {
                ijVar2.l0();
                this.d = ijVar2.A;
            }
            if (this.d != null) {
                if (this.h == null) {
                    this.h = q1Var.getContext().getResources().getDrawable(R.drawable.msg_close).mutate();
                }
                int L2 = q1Var.a7 - org.telegram.messenger.g0.L(38.0f);
                this.e = L2 - org.telegram.messenger.g0.L(18.0f);
                this.f = 0;
                TLRPC.PollResults pollResults3 = tL_messageMediaPoll2.results;
                if (pollResults3 == null || pollResults3.solution_media == null) {
                    tL_textWithEntities3 = tL_textWithEntities4;
                    i21 = i24;
                    i22 = L2;
                    z25 = z27;
                    z14 = z28;
                    f10 = 1.0f;
                } else {
                    if (this.n == null) {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i21 = i24;
                        this.n = new sh.e(i23, q1Var, q1Var.Pb, true);
                    } else {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i21 = i24;
                    }
                    z25 = z27;
                    i22 = L2;
                    z14 = z28;
                    f10 = 1.0f;
                    this.n.n(ijVar2, tL_messageMediaPoll2.results.solution_media, ijVar, i22, sh.d.c(-3, ijVar2.k), !z9);
                    sh.e eVar = this.n;
                    if (eVar.S) {
                        this.f = eVar.h(i22);
                    }
                    if (q1Var.N0) {
                        this.n.b();
                    }
                }
                this.c = new StaticLayout(TextUtils.ellipsize(hd.L0(2131746445), org.telegram.ui.ActionBar.k6.Y2, min - org.telegram.messenger.g0.L(30.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.Y2, min - org.telegram.messenger.g0.L(30.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                gj gjVar = new gj(ijVar2, this.d, org.telegram.ui.ActionBar.k6.a3, i22 - org.telegram.messenger.g0.L(11.0f));
                q1Var.p3 = gjVar;
                int L3 = org.telegram.messenger.g0.L(37.0f) + gjVar.b();
                int i25 = this.f;
                this.g = L3 + (i25 > 0 ? i25 + org.telegram.messenger.g0.L(14.0f) : 0);
                z11 = false;
                q1Var.Da = org.telegram.ui.Components.r5.update(0, (View) q1Var, false, q1Var.Da, (ArrayList<fj>) q1Var.p3.e);
            } else {
                tL_textWithEntities3 = tL_textWithEntities4;
                i21 = i24;
                z25 = z27;
                z14 = z28;
                z11 = false;
                f10 = 1.0f;
            }
            tL_textWithEntities = tL_textWithEntities3;
            i7 = i21;
            z12 = z25;
        } else {
            z10 = z26;
            f10 = 1.0f;
            this.H = 1.0f;
            q1Var.W4 = false;
            this.v = false;
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) o12).todo;
            TLRPC.TL_textWithEntities tL_textWithEntities5 = todoList.title;
            L0 = hd.L0((!todoList.others_can_complete || ijVar2.A0() == p10.i(i23).e()) ? 2131748467 : 2131748587);
            tL_textWithEntities = tL_textWithEntities5;
            i7 = 0;
            z11 = true;
            z12 = false;
            z13 = true;
            z14 = true;
        }
        String str = L0;
        if (ijVar2.J2 && (message2 = ijVar2.k) != null && (c10Var2 = message2.translatedPoll) != null && (tL_textWithEntities2 = c10Var2.a) != null) {
            tL_textWithEntities = tL_textWithEntities2;
        }
        this.s = false;
        this.t = false;
        this.u = false;
        q1Var.V4 = ijVar2.W4();
        this.w = ijVar2.F2();
        float f12 = f10;
        this.x = zc.a(sh.g.a(ijVar2), 7);
        if (q1Var.V4) {
            ijVar2.v1.clear();
        }
        boolean z30 = z11;
        CharSequence l10 = org.telegram.messenger.i6.l(new SpannableStringBuilder(tL_textWithEntities.text), org.telegram.ui.ActionBar.k6.O2.getFontMetricsInt(), false);
        ArrayList<TLRPC.MessageEntity> arrayList6 = tL_textWithEntities.entities;
        if (arrayList6 != null) {
            z15 = z12;
            Spannable C5 = ij.C5(l10, arrayList6, org.telegram.ui.ActionBar.k6.O2.getFontMetricsInt(), true);
            ij.a(C5, tL_textWithEntities.entities, q1Var.P5.Q3(), false, false);
            charSequence = C5;
        } else {
            z15 = z12;
            charSequence = l10;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, org.telegram.ui.ActionBar.k6.O2, (org.telegram.messenger.g0.L(2.0f) + min) - (q1Var.getExtraTextX() * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        q1Var.n2 = staticLayout;
        q1Var.Ca = org.telegram.ui.Components.r5.update(0, (View) q1Var, false, q1Var.Ca, staticLayout);
        StaticLayout staticLayout2 = q1Var.n2;
        if (staticLayout2 != null) {
            int lineCount = staticLayout2.getLineCount();
            for (int i26 = 0; i26 < lineCount; i26++) {
                f11 = 0.0f;
                if (q1Var.n2.getLineLeft(i26) > 0.0f) {
                    z16 = true;
                    break;
                }
            }
        }
        f11 = 0.0f;
        z16 = false;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.k6.T2, min, truncateAt), org.telegram.ui.ActionBar.k6.T2, (org.telegram.messenger.g0.L(2.0f) + min) - (q1Var.getExtraTextX() * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        q1Var.d3 = staticLayout3;
        if (staticLayout3.getLineCount() > 0) {
            if (z16 && !hd.a0) {
                q1Var.f3 = (int) Math.ceil(r6 - q1Var.d3.getLineWidth(0));
            } else if (z16 || !hd.a0) {
                q1Var.f3 = 0;
            } else {
                q1Var.f3 = -((int) Math.ceil(q1Var.d3.getLineLeft(0)));
            }
        }
        int L4 = min - org.telegram.messenger.g0.L(ijVar2.Q3() ? 28.0f : 8.0f);
        if (q1Var.i6) {
            z17 = z13;
        } else {
            TextPaint textPaint = (z13 || z14) ? org.telegram.ui.ActionBar.k6.I2 : org.telegram.ui.ActionBar.k6.F2;
            if (z30) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) o12;
                ellipsize = (q1Var.P5.Q3() || q1Var.P5.A0() < 0 || tL_messageMediaToDo2.todo.others_can_complete) ? hd.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompleted", Integer.valueOf(ij.z0(tL_messageMediaToDo2))) : hd.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompletedBy", Integer.valueOf(ij.z0(tL_messageMediaToDo2)), org.telegram.messenger.m5.l(p10.s0, q1Var.P5.Z0()));
            } else if (z15) {
                ellipsize = TextUtils.ellipsize(i7 == 0 ? hd.L0(2131748128) : hd.G(i7, "Answer", new Object[0]), textPaint, L4, truncateAt);
            } else {
                ellipsize = TextUtils.ellipsize(i7 == 0 ? hd.L0(2131748129) : hd.G(i7, "Vote", new Object[0]), textPaint, L4, truncateAt);
            }
            if (!q1Var.W4 && z10) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) o12;
                int i27 = tL_messageMediaPoll3.poll.close_date;
                if (i27 > 0 && (currentTime = i27 - ConnectionsManager.getInstance(i23).getCurrentTime()) > 0) {
                    TLRPC.Poll poll3 = tL_messageMediaPoll3.poll;
                    boolean z31 = poll3.hide_results_until_close && !poll3.creator;
                    if (this.j == null) {
                        this.j = new bg.q(new ab.y(4, this, z31));
                    }
                    z17 = z13;
                    this.j.a(currentTime);
                    if (q1Var.y3 == null) {
                        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
                        q1Var.y3 = i6Var;
                        i6Var.setCallback(q1Var);
                        org.telegram.ui.Components.i6 i6Var2 = q1Var.y3;
                        i6Var2.b = 17;
                        i6Var2.M = org.telegram.messenger.g0.q.x;
                    }
                    q1Var.y3.w(org.telegram.messenger.g0.L(11.0f));
                    q1Var.y3.u(((z17 || z14) ? org.telegram.ui.ActionBar.k6.I2 : org.telegram.ui.ActionBar.k6.F2).getColor());
                    q1Var.y3.t(hd.M(currentTime, z31), !z9, true);
                    if (q1Var.x3 == null) {
                        org.telegram.ui.Components.i6 i6Var3 = new org.telegram.ui.Components.i6(false, true, true);
                        q1Var.x3 = i6Var3;
                        i6Var3.setCallback(q1Var);
                        org.telegram.ui.Components.i6 i6Var4 = q1Var.x3;
                        i6Var4.b = 17;
                        i6Var4.M = org.telegram.messenger.g0.q.x;
                    }
                    q1Var.x3.w(org.telegram.messenger.g0.L(13.0f));
                    q1Var.x3.u(((!z17 || z14) ? org.telegram.ui.ActionBar.k6.I2 : org.telegram.ui.ActionBar.k6.F2).getColor());
                    q1Var.x3.t(ellipsize, !z9, true);
                    q1Var.w3 = null;
                }
            }
            z17 = z13;
            bg.q qVar = this.j;
            if (qVar != null) {
                qVar.b();
            }
            q1Var.y3 = null;
            if (q1Var.x3 == null) {
            }
            q1Var.x3.w(org.telegram.messenger.g0.L(13.0f));
            q1Var.x3.u(((!z17 || z14) ? org.telegram.ui.ActionBar.k6.I2 : org.telegram.ui.ActionBar.k6.F2).getColor());
            q1Var.x3.t(ellipsize, !z9, true);
            q1Var.w3 = null;
        }
        q1Var.W2(ijVar2);
        e(z30 ? 30 : qp.s1(i23).x7.G.U());
        if (!z10 || (pollResults = ((TLRPC.TL_messageMediaPoll) o12).results) == null) {
            org.telegram.ui.Components.b9 b9Var = this.I;
            if (b9Var != null) {
                b9Var.d(null, false);
            }
        } else {
            org.telegram.ui.Components.b9 b9Var2 = this.I;
            if (b9Var2 != null) {
                b9Var2.d(pollResults.recent_voters, !z9);
            }
        }
        if (!this.B && q1Var.Y4 && q1Var.Z4) {
            try {
                q1Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
        boolean z32 = q1Var.N0 && (q1Var.Y4 || q1Var.a5);
        this.B = z32;
        this.C = z32 && z10;
        ArrayList arrayList7 = q1Var.O4;
        ArrayList arrayList8 = new ArrayList();
        if (arrayList5.isEmpty()) {
            arrayList = arrayList7;
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(arrayList5);
            int size = arrayList5.size();
            int i28 = 0;
            while (i28 < size) {
                Object obj5 = arrayList5.get(i28);
                i28++;
                p1 p1Var4 = (p1) obj5;
                p1Var4.b();
                q1 q1Var2 = p1Var4.E;
                org.telegram.ui.Components.r5.release(q1Var2, p1Var4.r);
                p1Var4.r = null;
                org.telegram.ui.Components.r5.release(q1Var2, p1Var4.B);
                p1Var4.B = null;
            }
            arrayList5.clear();
            if (!this.B) {
                this.B = q1Var.N0 && (q1Var.V4 || q1Var.W4 || q1Var.X4);
            }
            float f13 = this.r;
            if (f13 > f11 && f13 < f12) {
                int size2 = arrayList2.size();
                for (int i29 = 0; i29 < size2; i29++) {
                    p1 p1Var5 = (p1) arrayList2.get(i29);
                    int i30 = p1Var5.f;
                    p1Var5.d = (int) Math.ceil(((p1Var5.d - i30) * this.r) + i30);
                    float f14 = p1Var5.h;
                    p1Var5.g = ((p1Var5.g - f14) * this.r) + f14;
                }
            }
            arrayList = arrayList2;
        }
        this.r = this.B ? f11 : f12;
        if (this.C) {
            bArr = null;
        } else {
            q1Var.Y4 = false;
            q1Var.c5 = -1;
            gz C = gz.C(i23);
            ij ijVar3 = q1Var.P5;
            bArr = ijVar3 == null ? null : (byte[]) C.w.get("poll_" + ijVar3.E1());
        }
        int i31 = ijVar2.J0 ? this.g : 0;
        StaticLayout staticLayout4 = q1Var.n2;
        int height = i31 + (staticLayout4 != null ? staticLayout4.getHeight() : 0);
        if (z10) {
            q1Var.v1 = true;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) o12;
            if (tL_messageMediaPoll4.attached_media != null) {
                if (this.m == null) {
                    sh.e eVar2 = new sh.e(i23, q1Var, q1Var.Pb, false);
                    this.m = eVar2;
                    eVar2.b.L0(q1Var.S0);
                }
                int L5 = ((q1Var.a7 - org.telegram.messenger.g0.L(13.0f)) - org.telegram.messenger.g0.L(2.0f)) - org.telegram.messenger.g0.L(2.0f);
                p0Var = p0Var3;
                arrayList3 = arrayList2;
                obj3 = org.telegram.ui.Components.r5.class;
                obj4 = org.telegram.messenger.f6.class;
                this.m.n(ijVar2, tL_messageMediaPoll4.attached_media, ijVar, L5, sh.d.c(-2, ijVar2.k), !z9);
                sh.e eVar3 = this.m;
                if (eVar3.S) {
                    this.o = L5;
                    int h = eVar3.h(L5);
                    this.p = h;
                    int L6 = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.g0.L(4.0f) + h;
                    this.q = L6;
                    height += L6;
                }
                if (q1Var.N0) {
                    this.m.b();
                }
            } else {
                arrayList3 = arrayList2;
                obj3 = org.telegram.ui.Components.r5.class;
                p0Var = p0Var3;
                obj4 = org.telegram.messenger.f6.class;
            }
            cg.d.b(tL_messageMediaPoll4.poll, p10.i(i23).e());
            TLRPC.Poll poll4 = tL_messageMediaPoll4.poll;
            ArrayList<TLRPC.PollAnswer> arrayList9 = poll4.shuffled_answers;
            if (arrayList9 == null) {
                arrayList9 = poll4.answers;
            }
            ArrayList<TLRPC.PollAnswer> arrayList10 = arrayList9;
            int size3 = poll4.answers.size();
            int i32 = 0;
            while (true) {
                if (i32 >= size3) {
                    break;
                }
                if (tL_messageMediaPoll4.poll.answers.get(i32).media != null) {
                    this.u = true;
                    break;
                }
                i32++;
            }
            int size4 = arrayList10.size();
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll4;
            byte[] bArr4 = bArr;
            int i33 = height;
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            boolean z33 = false;
            int i37 = 100;
            int i38 = 0;
            while (i34 < size4) {
                int i39 = size4;
                TLRPC.PollAnswer pollAnswer = arrayList10.get(i34);
                int i40 = i34;
                ij ijVar4 = q1Var.P5;
                int i41 = i35;
                if (!ijVar4.J2 || (message = ijVar4.k) == null || (c10Var = message.translatedPoll) == null) {
                    bArr2 = bArr4;
                } else {
                    ArrayList arrayList11 = c10Var.b;
                    int size5 = arrayList11.size();
                    bArr2 = bArr4;
                    int i42 = 0;
                    while (i42 < size5) {
                        Object obj6 = arrayList11.get(i42);
                        i42++;
                        ArrayList arrayList12 = arrayList11;
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) obj6;
                        int i43 = size5;
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            pollAnswer = pollAnswer2;
                            z19 = true;
                            break;
                        } else {
                            size5 = i43;
                            arrayList11 = arrayList12;
                        }
                    }
                }
                z19 = false;
                int i44 = i38;
                CharSequence n10 = org.telegram.messenger.i6.n(new SpannableStringBuilder(pollAnswer.text.text), org.telegram.ui.ActionBar.k6.O2.getFontMetricsInt(), false, null, 0, 1.0f, i44);
                ArrayList<TLRPC.MessageEntity> arrayList13 = pollAnswer.text.entities;
                if (arrayList13 != null) {
                    Spannable D5 = ij.D5(n10, arrayList13, org.telegram.ui.ActionBar.k6.P2.getFontMetricsInt(), true, 1.2f, i44);
                    z20 = z19;
                    i15 = i36;
                    i16 = 0;
                    ij.a(D5, pollAnswer.text.entities, q1Var.P5.Q3(), false, false);
                    charSequence4 = D5;
                } else {
                    z20 = z19;
                    charSequence4 = n10;
                    i15 = i36;
                    i16 = 0;
                }
                if (charSequence4 instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence4;
                    charSequence5 = charSequence4;
                    i17 = ((org.telegram.ui.Components.r5[]) spannable.getSpans(i16, charSequence5.length(), obj3)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(i16, charSequence4.length(), obj4)).length;
                } else {
                    charSequence5 = charSequence4;
                    i17 = 0;
                }
                i38 = i44 + i17;
                if (arrayList != null) {
                    for (int i45 = 0; i45 < arrayList.size(); i45++) {
                        TLRPC.PollAnswer pollAnswer3 = ((p1) arrayList.get(i45)).s;
                        if (pollAnswer3 == pollAnswer || (pollAnswer3 != null && Arrays.equals(((p1) arrayList.get(i45)).s.option, pollAnswer.option))) {
                            p1Var2 = (p1) arrayList.get(i45);
                            break;
                        }
                    }
                }
                p1Var2 = null;
                p1 p1Var6 = new p1(q1Var);
                if (p1Var2 != null) {
                    p1Var6.v = p1Var2.v;
                    p1Var6.w = p1Var2.w;
                } else {
                    int X1 = q1Var.X1(org.telegram.ui.ActionBar.k6.i6);
                    p1Var6.v = X1;
                    p1Var6.w = org.telegram.ui.ActionBar.k6.a0(X1, 0, 0);
                }
                if (p1Var2 != null) {
                    p1Var6.x = p1Var2.x;
                    p1Var2.x = null;
                }
                if (p1Var6.x == null) {
                    p1Var6.x = new uh.b(i23, q1Var);
                }
                String c10 = sh.d.c(pollAnswer.unshuffled_index, ijVar2.k);
                p1Var6.x.f(this.u);
                boolean z34 = z20;
                Object obj7 = obj4;
                p1 p1Var7 = p1Var2;
                byte[] bArr5 = bArr2;
                Object obj8 = obj3;
                int i46 = i23;
                int i47 = i15;
                ArrayList<TLRPC.PollAnswer> arrayList14 = arrayList10;
                int i48 = i41;
                ArrayList arrayList15 = arrayList;
                TLRPC.PollAnswer pollAnswer4 = pollAnswer;
                ijVar2 = ijVar;
                p1Var6.x.h(ijVar2, pollAnswer.media, ijVar, c10, !z9);
                if (q1Var.N0) {
                    p1Var6.a();
                }
                p1Var6.w.setCallback(q1Var);
                p1Var6.s = pollAnswer4;
                StaticLayout staticLayout5 = new StaticLayout(charSequence5, org.telegram.ui.ActionBar.k6.P2, min - org.telegram.messenger.g0.L((this.u ? 48 : 0) + 48), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                p1Var6.p = staticLayout5;
                p1Var6.o = false;
                p1Var6.r = org.telegram.ui.Components.r5.update(0, (View) q1Var, false, p1Var6.r, staticLayout5);
                p1Var6.b = org.telegram.messenger.g0.L(52.0f) + i33;
                p1Var6.c = p1Var6.p.getHeight();
                p1Var6.u = z34;
                if (p1Var7 != null && p1Var7.u != z34) {
                    StaticLayout staticLayout6 = p1Var7.p;
                    p1Var6.A = staticLayout6;
                    p1Var6.B = org.telegram.ui.Components.r5.update(0, (View) q1Var, false, p1Var6.B, staticLayout6);
                    p1Var6.C = p1Var7.b;
                    p1Var6.D = p1Var7.c;
                }
                arrayList5.add(p1Var6);
                arrayList8.add(p1Var6);
                int C2 = org.telegram.messenger.k5.C(26.66f, p1Var6.c, i33);
                int lineCount2 = p1Var6.p.getLineCount();
                float lineWidth = lineCount2 > 0 ? p1Var6.p.getLineWidth(lineCount2 - 1) : 0.0f;
                if (lineCount2 > 0 && p1Var6.p.getParagraphDirection(0) == -1) {
                    z21 = true;
                    float L7 = (r53 - org.telegram.messenger.g0.L(10.0f)) - lineWidth;
                    tL_messageMediaPoll = tL_messageMediaPoll5;
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        int size6 = tL_messageMediaPoll.results.results.size();
                        int i49 = 0;
                        while (i49 < size6) {
                            int i50 = C2;
                            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i49);
                            int i51 = i49;
                            p1Var3 = p1Var7;
                            if (Arrays.equals(p1Var6.s.option, pollAnswerVoters.option)) {
                                uh.b bVar = p1Var6.x;
                                if (bVar != null) {
                                    boolean z35 = !q1Var.i6 && (q1Var.V4 || q1Var.X4 || q1Var.W4 || (this.x && (!this.v || this.w)));
                                    bVar.D.a(z35, (p1Var3 == null || z9) ? false : true);
                                    uh.b bVar2 = p1Var6.x;
                                    int i52 = pollAnswerVoters.voters;
                                    if (p1Var3 == null || z9) {
                                        z23 = z35;
                                        z24 = false;
                                    } else {
                                        z23 = z35;
                                        z24 = true;
                                    }
                                    bVar2.k(i52, z24);
                                    p1Var6.x.j(pollAnswerVoters.recent_voters, (p1Var3 == null || z9) ? false : true);
                                    float e10 = p1Var6.x.e();
                                    boolean z36 = z21 && lineCount2 == 1 && L7 - ((float) org.telegram.messenger.g0.L(10.0f)) > e10;
                                    p1Var6.o = z36;
                                    if (!z23 || (e10 <= L7 && (!z21 || z36))) {
                                        i19 = i50;
                                    } else {
                                        p1Var6.c = org.telegram.messenger.g0.L(22.0f) + p1Var6.c;
                                        i19 = org.telegram.messenger.g0.L(22.0f) + i50;
                                    }
                                    z22 = true;
                                } else {
                                    i19 = i50;
                                    z22 = false;
                                }
                                p1Var6.i = pollAnswerVoters.chosen;
                                int i53 = pollAnswerVoters.voters;
                                p1Var6.j = i53;
                                p1Var6.l = pollAnswerVoters.correct;
                                if ((q1Var.V4 || q1Var.W4 || q1Var.X4 || (this.x && (!this.v || this.w))) && (i20 = tL_messageMediaPoll.results.total_voters) > 0) {
                                    float a10 = c8.j9.a(i53 / i20, 0.0f, f12) * 100.0f;
                                    int i54 = (int) a10;
                                    p1Var6.d = i54;
                                    p1Var6.e = a10 - i54;
                                } else {
                                    p1Var6.d = 0;
                                    p1Var6.e = 0.0f;
                                }
                                if (i47 == 0) {
                                    i47 = p1Var6.d;
                                } else {
                                    int i55 = p1Var6.d;
                                    if (i55 != 0 && i47 != i55) {
                                        z33 = true;
                                    }
                                }
                                int i56 = p1Var6.d;
                                i37 -= i56;
                                i48 = Math.max(i56, i48);
                                i33 = i19;
                                i35 = i48;
                                if (!z22) {
                                    p1Var6.x.D.a(false, (p1Var3 == null || z9) ? false : true);
                                }
                                arrayList4 = arrayList3;
                                if (arrayList4 != null) {
                                    int size7 = arrayList4.size();
                                    int i57 = 0;
                                    while (true) {
                                        if (i57 >= size7) {
                                            break;
                                        }
                                        p1 p1Var8 = (p1) arrayList4.get(i57);
                                        if (Arrays.equals(p1Var6.s.option, p1Var8.s.option)) {
                                            p1Var6.f = p1Var8.d;
                                            p1Var6.h = p1Var8.g;
                                            p1Var6.k = p1Var8.i;
                                            break;
                                        }
                                        i57++;
                                    }
                                }
                                if (bArr5 != null) {
                                    byte[] bArr6 = p1Var6.s.option;
                                    if (bArr6.length > 0) {
                                        bArr3 = bArr5;
                                        if (Arrays.binarySearch(bArr3, bArr6[0]) >= 0) {
                                            i18 = i40;
                                            q1Var.c5 = i18;
                                            q1Var.Y4 = true;
                                            q1Var.Z4 = true;
                                            bArr3 = null;
                                        } else {
                                            i18 = i40;
                                        }
                                        if (!q1Var.V4 && !this.w && this.v) {
                                            q1Var.e7[i18].g(p1Var6.i, false);
                                        } else if (q1Var.P5.v1.contains(p1Var6.s)) {
                                            q1Var.e7[i18].g(false, false);
                                        } else {
                                            q1Var.e7[i18].g(true, false);
                                        }
                                        q1Var.e7[i18].e = 0.85f;
                                        i34 = i18 + 1;
                                        arrayList3 = arrayList4;
                                        tL_messageMediaPoll5 = tL_messageMediaPoll;
                                        bArr4 = bArr3;
                                        i36 = i47;
                                        size4 = i39;
                                        i23 = i46;
                                        arrayList = arrayList15;
                                        obj3 = obj8;
                                        obj4 = obj7;
                                        arrayList10 = arrayList14;
                                        f12 = 1.0f;
                                    }
                                }
                                i18 = i40;
                                bArr3 = bArr5;
                                if (!q1Var.V4) {
                                }
                                if (q1Var.P5.v1.contains(p1Var6.s)) {
                                }
                                q1Var.e7[i18].e = 0.85f;
                                i34 = i18 + 1;
                                arrayList3 = arrayList4;
                                tL_messageMediaPoll5 = tL_messageMediaPoll;
                                bArr4 = bArr3;
                                i36 = i47;
                                size4 = i39;
                                i23 = i46;
                                arrayList = arrayList15;
                                obj3 = obj8;
                                obj4 = obj7;
                                arrayList10 = arrayList14;
                                f12 = 1.0f;
                            } else {
                                i49 = i51 + 1;
                                C2 = i50;
                                p1Var7 = p1Var3;
                                f12 = 1.0f;
                            }
                        }
                    }
                    p1Var3 = p1Var7;
                    i33 = C2;
                    z22 = false;
                    i35 = i48;
                    if (!z22) {
                    }
                    arrayList4 = arrayList3;
                    if (arrayList4 != null) {
                    }
                    if (bArr5 != null) {
                    }
                    i18 = i40;
                    bArr3 = bArr5;
                    if (!q1Var.V4) {
                    }
                    if (q1Var.P5.v1.contains(p1Var6.s)) {
                    }
                    q1Var.e7[i18].e = 0.85f;
                    i34 = i18 + 1;
                    arrayList3 = arrayList4;
                    tL_messageMediaPoll5 = tL_messageMediaPoll;
                    bArr4 = bArr3;
                    i36 = i47;
                    size4 = i39;
                    i23 = i46;
                    arrayList = arrayList15;
                    obj3 = obj8;
                    obj4 = obj7;
                    arrayList10 = arrayList14;
                    f12 = 1.0f;
                }
                z21 = false;
                float L72 = (r53 - org.telegram.messenger.g0.L(10.0f)) - lineWidth;
                tL_messageMediaPoll = tL_messageMediaPoll5;
                if (!tL_messageMediaPoll.results.results.isEmpty()) {
                }
                p1Var3 = p1Var7;
                i33 = C2;
                z22 = false;
                i35 = i48;
                if (!z22) {
                }
                arrayList4 = arrayList3;
                if (arrayList4 != null) {
                }
                if (bArr5 != null) {
                }
                i18 = i40;
                bArr3 = bArr5;
                if (!q1Var.V4) {
                }
                if (q1Var.P5.v1.contains(p1Var6.s)) {
                }
                q1Var.e7[i18].e = 0.85f;
                i34 = i18 + 1;
                arrayList3 = arrayList4;
                tL_messageMediaPoll5 = tL_messageMediaPoll;
                bArr4 = bArr3;
                i36 = i47;
                size4 = i39;
                i23 = i46;
                arrayList = arrayList15;
                obj3 = obj8;
                obj4 = obj7;
                arrayList10 = arrayList14;
                f12 = 1.0f;
            }
            int i58 = i23;
            ArrayList arrayList16 = arrayList;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll6 = tL_messageMediaPoll5;
            l1 l1Var = q1Var.Ra;
            if (l1Var != null && l1Var.e0() && tL_messageMediaPoll6.poll.open_answers && !q1Var.W4 && !ijVar2.p1 && !ijVar2.k3() && tL_messageMediaPoll6.poll.answers.size() < qp.s1(i58).x7.G.U()) {
                if (this.l == null) {
                    uh.a aVar = new uh.a(q1Var.getContext(), q1Var.Pb);
                    this.l = aVar;
                    aVar.setCallback(q1Var);
                    aVar.a.setCallback(q1Var);
                }
                this.s = true;
                l1 l1Var2 = q1Var.Ra;
                int h02 = l1Var2 != null ? l1Var2.h0(q1Var) : 0;
                boolean z37 = h02 > 0;
                this.t = z37;
                this.l.d(z37, !z9);
                int max = Math.max(org.telegram.messenger.g0.L(44.33f), h02);
                q1Var.P1 = max;
                i33 += max;
            }
            height = i33;
            int size8 = arrayList16.size();
            int i59 = 0;
            while (i59 < size8) {
                Object obj9 = arrayList16.get(i59);
                i59++;
                p1 p1Var9 = (p1) obj9;
                p1Var9.b();
                p1Var9.x = null;
            }
            b(!z9);
            z18 = z33;
            i10 = i37;
        } else {
            Object obj10 = org.telegram.ui.Components.r5.class;
            Object obj11 = org.telegram.messenger.f6.class;
            p0Var = p0Var3;
            ArrayList arrayList17 = arrayList;
            if (o12 instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo3 = (TLRPC.TL_messageMediaToDo) o12;
                int size9 = tL_messageMediaToDo3.todo.list.size();
                int i60 = height;
                int i61 = 0;
                int i62 = 0;
                while (i61 < size9) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo3.todo.list.get(i61);
                    int i63 = i62;
                    CharSequence n11 = org.telegram.messenger.i6.n(new SpannableStringBuilder(todoItem.title.text), org.telegram.ui.ActionBar.k6.O2.getFontMetricsInt(), false, null, 0, 1.0f, i63);
                    ArrayList<TLRPC.MessageEntity> arrayList18 = todoItem.title.entities;
                    if (arrayList18 != null) {
                        Spannable D52 = ij.D5(n11, arrayList18, org.telegram.ui.ActionBar.k6.P2.getFontMetricsInt(), true, 1.2f, i63);
                        i11 = 0;
                        ij.a(D52, todoItem.title.entities, q1Var.P5.Q3(), false, false);
                        charSequence2 = D52;
                    } else {
                        i11 = 0;
                        charSequence2 = n11;
                    }
                    if (charSequence2 instanceof Spannable) {
                        Spannable spannable2 = (Spannable) charSequence2;
                        obj2 = obj11;
                        i12 = size9;
                        i13 = i61;
                        obj = obj10;
                        i14 = ((org.telegram.ui.Components.r5[]) spannable2.getSpans(i11, charSequence2.length(), obj)).length + ((org.telegram.messenger.f6[]) spannable2.getSpans(i11, charSequence2.length(), obj2)).length;
                    } else {
                        i12 = size9;
                        i13 = i61;
                        obj = obj10;
                        obj2 = obj11;
                        i14 = 0;
                    }
                    i62 = i63 + i14;
                    if (arrayList17 != null) {
                        for (int i64 = 0; i64 < arrayList17.size(); i64++) {
                            p1Var = (p1) arrayList17.get(i64);
                            TLRPC.TodoItem todoItem2 = p1Var.t;
                            if (todoItem2 == todoItem || (todoItem2 != null && todoItem2.id == todoItem.id)) {
                                break;
                            }
                        }
                    }
                    p1Var = null;
                    Boolean F = gz.C(i23).F(ijVar2, todoItem);
                    p1 p1Var10 = new p1(q1Var);
                    p1Var10.q = p1Var != null ? p1Var.q : null;
                    if (p1Var != null) {
                        p1Var10.v = p1Var.v;
                        p1Var10.w = p1Var.w;
                        bool = F;
                    } else {
                        int X12 = q1Var.X1(org.telegram.ui.ActionBar.k6.i6);
                        p1Var10.v = X12;
                        bool = F;
                        p1Var10.w = org.telegram.ui.ActionBar.k6.a0(X12, 0, 0);
                    }
                    p1Var10.w.setCallback(q1Var);
                    if (p1Var != null) {
                        p1Var10.y = p1Var.y;
                        p1Var10.z = p1Var.z;
                        p1Var.y = null;
                        p1Var.z = null;
                    }
                    if (p1Var10.y == null) {
                        p1Var10.y = new org.telegram.ui.Components.w8();
                    }
                    if (p1Var10.z == null) {
                        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
                        p1Var10.z = imageReceiver;
                        imageReceiver.J0(org.telegram.messenger.g0.L(20.0f));
                    }
                    if (q1Var.N0) {
                        p1Var10.a();
                    }
                    p1Var10.i = false;
                    if (tL_messageMediaToDo3.completions.isEmpty()) {
                        obj10 = obj;
                    } else {
                        ArrayList<TLRPC.TodoCompletion> arrayList19 = tL_messageMediaToDo3.completions;
                        int size10 = arrayList19.size();
                        obj10 = obj;
                        int i65 = 0;
                        while (i65 < size10) {
                            TLRPC.TodoCompletion todoCompletion = arrayList19.get(i65);
                            int i66 = i65 + 1;
                            ArrayList<TLRPC.TodoCompletion> arrayList20 = arrayList19;
                            TLRPC.TodoCompletion todoCompletion2 = todoCompletion;
                            obj11 = obj2;
                            if (todoCompletion2.id == todoItem.id) {
                                p1Var10.i = true;
                                tL_messageMediaToDo = tL_messageMediaToDo3;
                                TLObject e22 = qp.s1(i23).e2(org.telegram.messenger.m5.o(todoCompletion2.completed_by));
                                p1Var10.y.l(e22);
                                p1Var10.z.i0(e22, p1Var10.y, null);
                                p1Var10.q = new my0(org.telegram.messenger.m5.m(e22), 12.0f);
                                break;
                            }
                            i65 = i66;
                            arrayList19 = arrayList20;
                            obj2 = obj11;
                        }
                    }
                    obj11 = obj2;
                    tL_messageMediaToDo = tL_messageMediaToDo3;
                    if (bool != null) {
                        p1Var10.i = bool.booleanValue();
                    }
                    if (!p1Var10.i || ijVar2.q()) {
                        charSequence3 = charSequence2;
                    } else {
                        boolean z38 = charSequence2 instanceof SpannableStringBuilder;
                        CharSequence charSequence7 = charSequence2;
                        if (!z38) {
                            charSequence7 = new SpannableStringBuilder(charSequence2);
                        }
                        ((SpannableStringBuilder) charSequence7).setSpan(new StrikethroughSpan(), 0, charSequence7.length(), 33);
                        charSequence3 = charSequence7;
                    }
                    p1Var10.t = todoItem;
                    StaticLayout staticLayout7 = new StaticLayout(charSequence3, org.telegram.ui.ActionBar.k6.P2, min - org.telegram.messenger.g0.L(46.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    p1Var10.p = staticLayout7;
                    p1Var10.r = org.telegram.ui.Components.r5.update(0, (View) q1Var, false, p1Var10.r, staticLayout7);
                    p1Var10.b = org.telegram.messenger.g0.L(52.0f) + i60;
                    p1Var10.c = p1Var10.p.getHeight();
                    p1Var10.u = false;
                    if (p1Var != null && p1Var.u) {
                        StaticLayout staticLayout8 = p1Var.p;
                        p1Var10.A = staticLayout8;
                        p1Var10.B = org.telegram.ui.Components.r5.update(0, (View) q1Var, false, p1Var10.B, staticLayout8);
                        p1Var10.C = p1Var.b;
                        p1Var10.D = p1Var.c;
                    }
                    arrayList5.add(p1Var10);
                    arrayList8.add(p1Var10);
                    i60 = org.telegram.messenger.k5.C(26.66f, p1Var10.c, i60);
                    q1Var.e7[i13].g(p1Var10.i, !z9);
                    q1Var.e7[i13].e = 1.0f;
                    i61 = i13 + 1;
                    tL_messageMediaToDo3 = tL_messageMediaToDo;
                    size9 = i12;
                }
                int size11 = arrayList17.size();
                int i67 = 0;
                while (i67 < size11) {
                    Object obj12 = arrayList17.get(i67);
                    i67++;
                    p1 p1Var11 = (p1) obj12;
                    ImageReceiver imageReceiver2 = p1Var11.z;
                    if (imageReceiver2 != null) {
                        imageReceiver2.R();
                        p1Var11.z = null;
                    }
                }
                height = i60;
            }
            z18 = false;
            i10 = 100;
        }
        g(i10, arrayList8, z18);
        int L8 = q1Var.a7 - org.telegram.messenger.g0.L(76.0f);
        int size12 = arrayList5.size();
        for (int i68 = 0; i68 < size12; i68++) {
            ((p1) arrayList5.get(i68)).g = Math.max(org.telegram.messenger.g0.L(5.0f) / L8, r6.d / 100);
        }
        q1Var.setMessageObjectInternal(ijVar2);
        this.b = false;
        if (!q1Var.i6 || q1Var.t2) {
            this.b = true;
            L = org.telegram.messenger.g0.L(13.0f) + height;
        } else {
            L = height - org.telegram.messenger.g0.L(10.0f);
        }
        int L9 = org.telegram.messenger.g0.L(73.0f);
        int i69 = q1Var.Ta;
        q1Var.u0 = L9 + i69 + L;
        if (q1Var.I) {
            q1Var.Ta = i69 - org.telegram.messenger.g0.L(1.0f);
        }
        q1Var.D2 = false;
        if (z17 || z14) {
            int i70 = 0;
            int i71 = 0;
            while (i70 < 3) {
                i71 = Math.max(i71, (int) Math.ceil(org.telegram.ui.ActionBar.k6.M2.measureText(i70 == 0 ? hd.L0(2131747109) : i70 == 1 ? hd.L0(2131747155) : hd.L0(2131748129))));
                i70++;
            }
            int extraTimeX = q1Var.getExtraTimeX() + q1Var.z9 + (ijVar2.Q3() ? org.telegram.messenger.g0.L(20.0f) : 0);
            p0Var.getClass();
            p0Var2 = p0Var;
            if (p0Var2.p && extraTimeX >= ((q1Var.a7 - org.telegram.messenger.g0.L(76.0f)) - i71) / 2) {
                q1Var.u0 = org.telegram.messenger.g0.L(18.0f) + q1Var.u0;
                q1Var.D2 = true;
            }
        } else {
            p0Var2 = p0Var;
        }
        p0Var2.getClass();
        if (p0Var2.p) {
            return;
        }
        p0Var2.o(min, 3);
        q1Var.u0 = org.telegram.messenger.k5.C(12.0f, p0Var2.m, q1Var.u0);
        if (q1Var.getExtraTimeX() + q1Var.z9 + (ijVar2.Q3() ? org.telegram.messenger.g0.L(20.0f) : 0) >= (q1Var.a7 - org.telegram.messenger.g0.L(24.0f)) - p0Var2.r) {
            q1Var.u0 = org.telegram.messenger.g0.L(16.0f) + q1Var.u0;
            p0Var2.k -= org.telegram.messenger.g0.L(16.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j3) {
        org.telegram.ui.Components.b9 b9Var;
        ij ijVar;
        q1 q1Var = this.a;
        ArrayList arrayList = q1Var.P4;
        boolean z9 = true;
        if (q1Var.Y4) {
            this.E = (((360 * j3) / 2000.0f) + this.E) - (((int) (r7 / 360.0f)) * 360);
            float f10 = q1Var.g5 + j3;
            q1Var.g5 = f10;
            if (f10 >= 500.0f) {
                q1Var.g5 = 500.0f;
            }
            if (q1Var.f5) {
                q1Var.d5 = (org.telegram.messenger.g0.G.getInterpolation(q1Var.g5 / 500.0f) * 266.0f) + 4.0f;
            } else {
                q1Var.d5 = 4.0f - ((1.0f - org.telegram.messenger.g0.F.getInterpolation(q1Var.g5 / 500.0f)) * (q1Var.e5 ? 360 : qs.t4));
            }
            if (q1Var.g5 == 500.0f) {
                boolean z10 = q1Var.f5;
                if (z10) {
                    this.E += 270.0f;
                    q1Var.d5 = -266.0f;
                }
                q1Var.f5 = !z10;
                if (q1Var.e5) {
                    q1Var.e5 = false;
                }
                q1Var.g5 = 0.0f;
            }
            q1Var.invalidate();
        }
        if (!q1Var.q5 || ((ijVar = q1Var.P5) != null && ijVar.J0)) {
            z9 = false;
        }
        if (z9) {
            float f11 = q1Var.r5;
            if (f11 < 1.0f) {
                float f12 = (j3 / 180.0f) + f11;
                q1Var.r5 = f12;
                if (f12 > 1.0f) {
                    q1Var.r5 = 1.0f;
                }
                q1Var.invalidate();
                if (this.B) {
                    return;
                }
                float f13 = q1Var.Q4 + j3;
                q1Var.Q4 = f13;
                if (f13 >= 300.0f) {
                    q1Var.Q4 = 300.0f;
                }
                float interpolation = org.telegram.messenger.g0.F.getInterpolation(q1Var.Q4 / 300.0f);
                this.r = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = 1.0f;
                    this.B = false;
                    this.C = false;
                    q1Var.Y4 = false;
                    if (q1Var.a5 && q1Var.b5 && (b9Var = this.I) != null) {
                        b9Var.d(null, false);
                    }
                    q1Var.a5 = false;
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((p1) arrayList.get(i7)).k = false;
                    }
                }
                q1Var.invalidate();
                return;
            }
        }
        if (!z9) {
            float f14 = q1Var.r5;
            if (f14 > 0.0f) {
                float f15 = f14 - (j3 / 180.0f);
                q1Var.r5 = f15;
                if (f15 < 0.0f) {
                    q1Var.r5 = 0.0f;
                }
                q1Var.invalidate();
            }
        }
        if (this.B) {
        }
    }
}
