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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hj;
import org.telegram.messenger.jj;
import org.telegram.messenger.q10;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public org.telegram.ui.Components.w8 I;
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
    public rf.m j;
    public kh.d k;
    public kh.a l;
    public ih.h m;
    public ih.h n;
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

    public static void g(int i10, ArrayList arrayList, boolean z10) {
        if (!z10 || i10 == 0 || arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new org.telegram.ui.f6(1));
        int size = arrayList.size();
        for (int i11 = 0; i11 < size && i10 > 0; i11++) {
            p1 p1Var = (p1) arrayList.get(i11);
            int i12 = p1Var.d;
            if (i12 > 0) {
                p1Var.d = i12 + 1;
                i10--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:37:0x00a3, B:41:0x00c2, B:43:0x00e8, B:45:0x00f3, B:52:0x0112, B:55:0x0125, B:57:0x0128, B:59:0x012e, B:62:0x0134, B:64:0x013a, B:66:0x0140, B:68:0x0146, B:72:0x02e7, B:75:0x0151, B:76:0x015d, B:78:0x0161, B:80:0x0165, B:82:0x0189, B:83:0x018e, B:85:0x019b, B:87:0x019f, B:90:0x01b4, B:92:0x01bb, B:137:0x02de, B:145:0x02db, B:146:0x018c, B:147:0x02ed, B:149:0x02f3, B:151:0x02f7, B:160:0x0309, B:161:0x030f, B:163:0x0313, B:165:0x0317, B:167:0x011a, B:168:0x0108, B:94:0x01c3, B:96:0x01f4, B:97:0x01f6, B:99:0x0200, B:101:0x020c, B:103:0x0223, B:105:0x0226, B:113:0x026d, B:115:0x0273, B:117:0x027a, B:119:0x0286, B:121:0x02a1, B:123:0x02a4, B:125:0x02af, B:133:0x0293, B:107:0x022f, B:109:0x0266, B:140:0x0219), top: B:36:0x00a3, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: Exception -> 0x0116, TryCatch #1 {Exception -> 0x0116, blocks: (B:37:0x00a3, B:41:0x00c2, B:43:0x00e8, B:45:0x00f3, B:52:0x0112, B:55:0x0125, B:57:0x0128, B:59:0x012e, B:62:0x0134, B:64:0x013a, B:66:0x0140, B:68:0x0146, B:72:0x02e7, B:75:0x0151, B:76:0x015d, B:78:0x0161, B:80:0x0165, B:82:0x0189, B:83:0x018e, B:85:0x019b, B:87:0x019f, B:90:0x01b4, B:92:0x01bb, B:137:0x02de, B:145:0x02db, B:146:0x018c, B:147:0x02ed, B:149:0x02f3, B:151:0x02f7, B:160:0x0309, B:161:0x030f, B:163:0x0313, B:165:0x0317, B:167:0x011a, B:168:0x0108, B:94:0x01c3, B:96:0x01f4, B:97:0x01f6, B:99:0x0200, B:101:0x020c, B:103:0x0223, B:105:0x0226, B:113:0x026d, B:115:0x0273, B:117:0x027a, B:119:0x0286, B:121:0x02a1, B:123:0x02a4, B:125:0x02af, B:133:0x0293, B:107:0x022f, B:109:0x0266, B:140:0x0219), top: B:36:0x00a3, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(MotionEvent motionEvent) {
        float f7;
        boolean z10;
        boolean z11;
        CharacterStyle characterStyle;
        org.telegram.ui.Components.o5 o5Var;
        boolean z12;
        CharacterStyle[] characterStyleArr;
        CharacterStyle[] characterStyleArr2;
        dl0 dl0Var;
        q1 q1Var = this.a;
        ji.a aVar = q1Var.s4;
        x1 x1Var = q1Var.gb;
        if ((this.d instanceof Spannable) && q1Var.o3 != null && q1Var.r4 == -1 && !q1Var.cc) {
            boolean z13 = true;
            if (motionEvent.getAction() == 0 || (motionEvent.getAction() == 1 && (q1Var.t4 == 1 || q1Var.q4 != null))) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                float f10 = x10;
                float f11 = q1Var.s5;
                if (f10 >= f11) {
                    float f12 = K1;
                    float f13 = q1Var.t5;
                    if (f12 >= f13) {
                        hj hjVar = q1Var.o3;
                        if (f10 <= f11 + hjVar.c && f12 <= f13 + hjVar.c(x1Var)) {
                            int i10 = (int) (f12 - q1Var.t5);
                            int i11 = 0;
                            for (int i12 = 0; i12 < q1Var.o3.e.size() && ((gj) q1Var.o3.e.get(i12)).p(q1Var.o3.e, x1Var) <= i10; i12++) {
                                i11 = i12;
                            }
                            try {
                                gj gjVar = (gj) q1Var.o3.e.get(i11);
                                float f14 = q1Var.s5;
                                if (gjVar.l()) {
                                    try {
                                        f7 = q1Var.o3.d;
                                    } catch (Exception e) {
                                        e = e;
                                        org.telegram.messenger.f8.g(e, z13);
                                        return false;
                                    }
                                } else {
                                    f7 = 0.0f;
                                }
                                int i13 = (int) (f10 - (f14 - f7));
                                int p5 = (int) (i10 - gjVar.p(q1Var.o3.e, x1Var));
                                int lineForVertical = gjVar.e.getLineForVertical(p5);
                                int i14 = 0;
                                float f15 = i13;
                                int offsetForHorizontal = gjVar.n + gjVar.e.getOffsetForHorizontal(lineForVertical, f15);
                                float lineLeft = gjVar.e.getLineLeft(lineForVertical);
                                if (lineLeft <= f15 && lineLeft + gjVar.e.getLineWidth(lineForVertical) >= f15) {
                                    Spannable spannable = (Spannable) this.d;
                                    CharacterStyle[] characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                    if (characterStyleArr3 == null || characterStyleArr3.length == 0) {
                                        characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, d51.class);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (characterStyleArr3 != null) {
                                        z11 = z10;
                                        if (characterStyleArr3.length == 0) {
                                        }
                                        if (characterStyleArr3.length != 0 && ((!(characterStyleArr3[0] instanceof b51) || b51.h) && !org.telegram.messenger.i0.C1())) {
                                            if (motionEvent.getAction() != 0) {
                                                CharacterStyle characterStyle2 = characterStyleArr3[0];
                                                if (characterStyle2 instanceof org.telegram.ui.Components.o5) {
                                                    org.telegram.ui.Components.o5 o5Var2 = q1Var.o4;
                                                    if (o5Var2 == null || o5Var2 != characterStyle2) {
                                                        q1Var.b3(1);
                                                        q1Var.o4 = (org.telegram.ui.Components.o5) characterStyleArr3[0];
                                                        q1Var.t4 = 1;
                                                    }
                                                } else {
                                                    q80 q80Var = q1Var.p4;
                                                    if (q80Var == null || q80Var.i != characterStyle2) {
                                                        aVar.m(q80Var, true);
                                                        float[] fArr = q1.ed;
                                                        q80 q80Var2 = new q80(characterStyleArr3[0], q1Var.Ob, f15, p5, 0);
                                                        q1Var.p4 = q80Var2;
                                                        q80Var2.d(org.telegram.ui.ActionBar.t6.w0(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.Ac : org.telegram.ui.ActionBar.t6.ze, q1Var.Ob));
                                                        if (gjVar.I && (dl0Var = q1Var.l8) != null) {
                                                            q1Var.p4.d(org.telegram.ui.ActionBar.t6.r1(org.telegram.ui.ActionBar.t6.I.q() ? 0.13f : 0.1f, dl0Var.i()));
                                                        }
                                                        q1Var.y0 = i11;
                                                        q1Var.x0 = -1;
                                                        q1Var.t4 = 1;
                                                        try {
                                                            k80 b10 = q1Var.p4.b();
                                                            int[] U1 = q1.U1(spannable, q1Var.p4.i);
                                                            int i15 = U1[0];
                                                            int i16 = gjVar.n;
                                                            int i17 = i15 - i16;
                                                            U1[0] = i17;
                                                            U1[1] = U1[1] - i16;
                                                            b10.d(gjVar.e, i17, 0.0f);
                                                            gjVar.e.getSelectionPath(U1[0], U1[1], b10);
                                                            if (U1[1] >= gjVar.r) {
                                                                int i18 = i11 + 1;
                                                                while (i18 < q1Var.o3.e.size()) {
                                                                    gj gjVar2 = (gj) q1Var.o3.e.get(i18);
                                                                    if (z11) {
                                                                        int i19 = gjVar2.n;
                                                                        characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i19, i19, d51.class);
                                                                    } else {
                                                                        int i20 = gjVar2.n;
                                                                        characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(i20, i20, ClickableSpan.class);
                                                                    }
                                                                    if (characterStyleArr2 == null || characterStyleArr2.length == 0) {
                                                                        break;
                                                                    }
                                                                    CharacterStyle characterStyle3 = characterStyleArr2[i14];
                                                                    q80 q80Var3 = q1Var.p4;
                                                                    if (characterStyle3 != q80Var3.i) {
                                                                        break;
                                                                    }
                                                                    k80 b11 = q80Var3.b();
                                                                    b11.d(gjVar2.e, i14, gjVar2.p(q1Var.o3.e, x1Var) - gjVar.p(q1Var.o3.e, x1Var));
                                                                    int i21 = (U1[1] + gjVar.n) - gjVar2.n;
                                                                    gjVar2.e.getSelectionPath(0, i21, b11);
                                                                    if (i21 < gjVar2.r - 1) {
                                                                        break;
                                                                    }
                                                                    i18++;
                                                                    i14 = 0;
                                                                }
                                                            }
                                                            i14 = 0;
                                                            if (U1[i14] <= gjVar.n) {
                                                                int i22 = 0;
                                                                for (int i23 = i11 - 1; i23 >= 0; i23--) {
                                                                    gj gjVar3 = (gj) q1Var.o3.e.get(i23);
                                                                    if (z11) {
                                                                        int i24 = gjVar3.r - 1;
                                                                        characterStyleArr = (CharacterStyle[]) spannable.getSpans(i24, i24, d51.class);
                                                                    } else {
                                                                        int i25 = gjVar3.r - 1;
                                                                        characterStyleArr = (CharacterStyle[]) spannable.getSpans(i25, i25, ClickableSpan.class);
                                                                    }
                                                                    if (characterStyleArr == null || characterStyleArr.length == 0) {
                                                                        break;
                                                                    }
                                                                    CharacterStyle characterStyle4 = characterStyleArr[0];
                                                                    q80 q80Var4 = q1Var.p4;
                                                                    if (characterStyle4 != q80Var4.i) {
                                                                        break;
                                                                    }
                                                                    k80 b12 = q80Var4.b();
                                                                    i22 -= gjVar3.w;
                                                                    int i26 = U1[0];
                                                                    int i27 = gjVar.n;
                                                                    int i28 = gjVar3.n;
                                                                    int i29 = (i26 + i27) - i28;
                                                                    int i30 = (U1[1] + i27) - i28;
                                                                    b12.d(gjVar3.e, i29, i22);
                                                                    gjVar3.e.getSelectionPath(i29, i30, b12);
                                                                    if (i29 > gjVar3.n) {
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            z12 = true;
                                                        } catch (Exception e7) {
                                                            z12 = true;
                                                            org.telegram.messenger.f8.g(e7, true);
                                                        }
                                                        aVar.b(q1Var.p4, Integer.valueOf(z12 ? 1 : 0));
                                                        q1Var.bc = z12;
                                                        q1Var.invalidate();
                                                        return z12;
                                                    }
                                                }
                                                z12 = true;
                                                q1Var.bc = z12;
                                                q1Var.invalidate();
                                                return z12;
                                            }
                                            CharacterStyle characterStyle5 = characterStyleArr3[0];
                                            if ((characterStyle5 instanceof org.telegram.ui.Components.o5) && (o5Var = q1Var.o4) == characterStyle5) {
                                                if (q1Var.Qa.m0(o5Var)) {
                                                    z13 = true;
                                                    q1Var.b3(1);
                                                    q1Var.o4 = null;
                                                    return true;
                                                }
                                                q1Var.b3(1);
                                                q1Var.o4 = null;
                                            } else {
                                                q80 q80Var5 = q1Var.p4;
                                                if (q80Var5 != null && characterStyle5 == (characterStyle = q80Var5.i)) {
                                                    q1Var.Qa.L0(q1Var, characterStyle, false);
                                                    q1Var.b3(1);
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                    characterStyleArr3 = (CharacterStyle[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, org.telegram.ui.Components.o5.class);
                                    z11 = false;
                                    if (characterStyleArr3.length != 0) {
                                        if (motionEvent.getAction() != 0) {
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                z13 = true;
                            }
                            return false;
                        }
                    }
                }
                q1Var.b3(1);
                return false;
            }
            if (motionEvent.getAction() == 1) {
                q1Var.q4 = null;
                q1Var.Y2();
                return false;
            }
        }
        return false;
    }

    public final void b(boolean z10) {
        boolean z11;
        q1 q1Var = this.a;
        jj jjVar = q1Var.O5;
        if (jjVar == null) {
            return;
        }
        TLRPC.MessageMedia n12 = jj.n1(jjVar);
        if (n12 instanceof TLRPC.TL_messageMediaPoll) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) n12;
            int i10 = 0;
            if (q1Var.d7 != null) {
                int min = Math.min(tL_messageMediaPoll.poll.answers.size(), q1Var.d7.length);
                z11 = false;
                for (int i11 = 0; i11 < min; i11++) {
                    CheckBoxBase checkBoxBase = q1Var.d7[i11];
                    if (checkBoxBase != null && checkBoxBase.q) {
                        z11 = true;
                    }
                }
            } else {
                z11 = false;
            }
            TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
            boolean z12 = q1Var.U4;
            boolean z13 = (z12 || q1Var.V4 || !this.w || pollResults == null || pollResults.total_voters == 0 || !tL_messageMediaPoll.poll.creator) ? false : true;
            boolean z14 = (z12 || q1Var.V4 || this.x) ? false : true;
            TLRPC.Poll poll = tL_messageMediaPoll.poll;
            boolean z15 = poll.public_voters;
            CharSequence charSequence = null;
            if (this.t) {
                charSequence = cd.L0(2131747192, null);
                i10 = 84;
            } else if (!z13 || (poll.multiple_choice && z14 && z11)) {
                if (poll.multiple_choice && z14) {
                    charSequence = cd.L0(2131747171, null);
                    i10 = 83;
                } else if (!q1Var.h6 && z15 && ((z12 && (!this.v || this.w)) || (q1Var.V4 && pollResults.total_voters != 0))) {
                    charSequence = cd.a0(null, null, 2131747120, Integer.valueOf(pollResults.total_voters));
                    i10 = 80;
                }
            } else if (z15) {
                charSequence = cd.a0(null, null, 2131747120, Integer.valueOf(pollResults.total_voters));
                i10 = 80;
            } else if (jjVar.K0) {
                charSequence = org.telegram.messenger.i0.I2(cd.L0(2131747126, null), false, -org.telegram.messenger.i0.L(2.6666667f), 0.0f, 1.0f, R.drawable.msg_mini_forumarrow);
                i10 = 82;
            } else {
                charSequence = org.telegram.messenger.i0.G2(cd.G(pollResults.total_voters, "PollViewVotesAsAdmin", new Object[0]), false);
                i10 = 81;
            }
            if (i10 != 0) {
                if (this.k == null) {
                    kh.d dVar = new kh.d(q1Var, q1Var.Ob);
                    this.k = dVar;
                    dVar.setCallback(q1Var);
                    dVar.a.setCallback(q1Var);
                    dVar.d.setCallback(q1Var);
                }
                q1Var.x2 = charSequence;
                this.k.d.t(charSequence, z10, true);
                q1Var.s2 = true;
                q1Var.w2 = i10;
                q1Var.w0();
            }
            q1Var.a0(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x018b, code lost:
    
        if (org.telegram.ui.Components.b51.h == false) goto L112;
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
        boolean z10;
        l1 l1Var;
        int i10;
        kh.a aVar;
        int i11;
        int[] iArr;
        int i12;
        boolean z11;
        boolean z12;
        int i13;
        int i14;
        q1 q1Var = this.a;
        ji.a aVar2 = q1Var.s4;
        int[] iArr2 = q1Var.L2;
        int[] iArr3 = q1Var.J2;
        Drawable[] drawableArr = q1Var.H2;
        ArrayList arrayList = q1Var.O4;
        jj jjVar = q1Var.O5;
        int i15 = 0;
        if (jjVar.T == 0 && (((!q1Var.X4 && !q1Var.Z4) || jjVar.D4()) && !arrayList.isEmpty())) {
            jj jjVar2 = q1Var.O5;
            if (jjVar2.D == 17 && jjVar2.q4()) {
                int x10 = (int) motionEvent.getX();
                int K1 = (int) q1Var.K1(motionEvent);
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() != 3) {
                                return false;
                            }
                            h();
                            return false;
                        }
                        if ((q1Var.g5 == -1 && !q1Var.o5) || (drawable = drawableArr[0]) == null) {
                            return false;
                        }
                        drawable.setHotspot(x10, K1);
                        return false;
                    }
                    if (q1Var.r5 != -1) {
                        q1Var.playSoundEffect(0);
                        if (q1Var.O5 != null && (l1Var = q1Var.Qa) != null && q1Var.r5 == 0) {
                            l1Var.m1(q1Var);
                        }
                        q1Var.r5 = -1;
                        h();
                        return false;
                    }
                    if (q1Var.w5) {
                        q1Var.playSoundEffect(0);
                        q1Var.E0();
                        q1Var.w5 = false;
                        h();
                        return false;
                    }
                    if (q1Var.o5) {
                        q1Var.playSoundEffect(0);
                        q1Var.E0();
                        q1Var.o5 = false;
                        q1Var.r5 = -1;
                        h();
                        return false;
                    }
                    q80 q80Var = q1Var.p4;
                    if (q80Var != null) {
                        CharacterStyle characterStyle = q80Var.i;
                        if (characterStyle instanceof URLSpan) {
                            q1Var.Qa.L0(q1Var, characterStyle, false);
                        } else if (characterStyle instanceof ClickableSpan) {
                            ((ClickableSpan) characterStyle).onClick(q1Var);
                        }
                        q1Var.b3(4);
                        return false;
                    }
                    if (q1Var.g5 == -1) {
                        return false;
                    }
                    q1Var.playSoundEffect(0);
                    h();
                    if (this.F) {
                        p1 p1Var = (p1) arrayList.get(q1Var.g5);
                        ImageReceiver imageReceiver = p1Var.x.c;
                        TLRPC.PollAnswer pollAnswer = p1Var.s;
                        TLRPC.MessageMedia messageMedia = pollAnswer.media;
                        motionEvent.getX();
                        motionEvent.getY();
                        int i16 = p1Var.s.unshuffled_index;
                        l1 l1Var2 = q1Var.Qa;
                        if (l1Var2 != null) {
                            l1Var2.l(q1Var, pollAnswer, messageMedia, i16);
                        }
                    } else if (q1Var.O5.p1) {
                        Toast.makeText(q1Var.getContext(), cd.L0(q1Var.O5.D4() ? 2131748508 : 2131748506, null), 1).show();
                    } else {
                        p1 p1Var2 = (p1) arrayList.get(q1Var.g5);
                        TLRPC.PollAnswer pollAnswer2 = p1Var2.s;
                        if (q1Var.U4 || q1Var.V4) {
                            new ArrayList().add(pollAnswer2);
                            q1Var.Qa.E1(q1Var, pollAnswer2);
                        } else if (this.x) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(pollAnswer2);
                            q1Var.Qa.i(q1Var, arrayList2, p1Var2.j, p1Var2.a + org.telegram.messenger.i0.L(50.0f), q1Var.Sa + p1Var2.b);
                        } else {
                            TLRPC.Poll poll = q1Var.h5;
                            if (poll == null || !poll.multiple_choice) {
                                int i17 = q1Var.g5;
                                q1Var.b5 = i17;
                                q1Var.X4 = true;
                                q1Var.f5 = 0.0f;
                                q1Var.d5 = true;
                                q1Var.c5 = 360.0f;
                                q1Var.e5 = false;
                                if (p1Var2.t != null) {
                                    q1Var.I3(i17, true);
                                } else {
                                    q1Var.Y4 = true;
                                    ArrayList arrayList3 = new ArrayList();
                                    arrayList3.add(pollAnswer2);
                                    q1Var.Qa.i(q1Var, arrayList3, -1, 0, 0);
                                }
                            } else {
                                if (q1Var.O5.v1.contains(pollAnswer2)) {
                                    q1Var.O5.v1.remove(pollAnswer2);
                                    z10 = true;
                                    q1Var.d7[q1Var.g5].f(-1, false, true);
                                } else {
                                    z10 = true;
                                    q1Var.O5.v1.add(pollAnswer2);
                                    q1Var.d7[q1Var.g5].f(-1, true, true);
                                }
                                b(z10);
                            }
                        }
                    }
                    q1Var.g5 = -1;
                    q1Var.invalidate();
                    return false;
                }
                q1Var.g5 = -1;
                q1Var.o5 = false;
                q1Var.r5 = -1;
                q1Var.w5 = false;
                q1Var.b3(4);
                int i18 = q1Var.u5;
                if (i18 != -1 && q1Var.v5 != -1 && Math.abs(x10 - i18) < org.telegram.messenger.i0.L(20.0f) && Math.abs(K1 - q1Var.v5) < org.telegram.messenger.i0.L(20.0f)) {
                    q1Var.w5 = true;
                    h();
                    q1Var.invalidate();
                    return true;
                }
                if (q1Var.p5 && (i13 = q1Var.m5) != -1 && x10 >= i13 && x10 <= org.telegram.messenger.i0.L(40.0f) + i13 && K1 >= (i14 = q1Var.n5) && K1 <= org.telegram.messenger.i0.L(40.0f) + i14) {
                    q1Var.o5 = true;
                    iArr3[0] = 3;
                    Drawable drawable2 = drawableArr[0];
                    if (drawable2 != null) {
                        drawable2.setBounds(q1Var.m5 - org.telegram.messenger.i0.L(8.0f), q1Var.n5 - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(32.0f) + q1Var.m5, org.telegram.messenger.i0.L(32.0f) + q1Var.n5);
                        drawableArr[0].setHotspot(x10, K1);
                        drawableArr[0].setState(iArr2);
                    }
                    h();
                    q1Var.invalidate();
                    return true;
                }
                if (q1Var.O5.K0) {
                    h();
                    q1Var.invalidate();
                    return false;
                }
                h();
                int i19 = 0;
                boolean z13 = false;
                while (i19 < arrayList.size()) {
                    i10 = i15;
                    p1 p1Var3 = (p1) arrayList.get(i19);
                    int L = (p1Var3.b + q1Var.Sa) - org.telegram.messenger.i0.L(13.0f);
                    StaticLayout staticLayout = p1Var3.p;
                    if (staticLayout != null && (staticLayout.getText() instanceof Spannable)) {
                        float f7 = x10;
                        float f10 = p1Var3.m;
                        if (f7 >= f10) {
                            float f11 = K1;
                            float f12 = p1Var3.n;
                            if (f11 >= f12 && !q1Var.O5.r1) {
                                int i20 = x10 - ((int) f10);
                                int i21 = K1 - ((int) f12);
                                try {
                                } catch (Exception e) {
                                    e = e;
                                    iArr = iArr3;
                                }
                                if (i21 <= p1Var3.p.getHeight()) {
                                    int lineForVertical = p1Var3.p.getLineForVertical(i21);
                                    float f13 = i20;
                                    int offsetForHorizontal = p1Var3.p.getOffsetForHorizontal(lineForVertical, f13);
                                    float lineLeft = p1Var3.p.getLineLeft(lineForVertical);
                                    if (lineLeft <= f13 && lineLeft + p1Var3.p.getLineWidth(lineForVertical) >= f13) {
                                        Spannable spannable = (Spannable) p1Var3.p.getText();
                                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                                        if (clickableSpanArr.length != 0) {
                                            if (clickableSpanArr[i10] instanceof b51) {
                                                try {
                                                } catch (Exception e7) {
                                                    e = e7;
                                                    iArr = iArr3;
                                                    z11 = true;
                                                    org.telegram.messenger.f8.g(e, z11);
                                                    i12 = p1Var3.a;
                                                    if (x10 < i12) {
                                                    }
                                                    i19++;
                                                    i15 = i10;
                                                    iArr3 = iArr;
                                                }
                                            }
                                            if (!org.telegram.messenger.i0.C1()) {
                                                q80 q80Var2 = q1Var.p4;
                                                if (q80Var2 != null) {
                                                    iArr = iArr3;
                                                    try {
                                                        z12 = z13;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        z11 = true;
                                                        org.telegram.messenger.f8.g(e, z11);
                                                        i12 = p1Var3.a;
                                                        if (x10 < i12) {
                                                            if (K1 > org.telegram.messenger.i0.L(26.0f) + L + p1Var3.c) {
                                                            }
                                                        }
                                                        i19++;
                                                        i15 = i10;
                                                        iArr3 = iArr;
                                                    }
                                                    try {
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        z13 = z12;
                                                        z11 = true;
                                                        org.telegram.messenger.f8.g(e, z11);
                                                        i12 = p1Var3.a;
                                                        if (x10 < i12) {
                                                        }
                                                        i19++;
                                                        i15 = i10;
                                                        iArr3 = iArr;
                                                    }
                                                } else {
                                                    iArr = iArr3;
                                                    z12 = z13;
                                                }
                                                aVar2.m(q80Var2, true);
                                                ClickableSpan clickableSpan = clickableSpanArr[i10];
                                                org.telegram.ui.ActionBar.p6 p6Var = q1Var.Ob;
                                                float[] fArr = q1.ed;
                                                q80 q80Var3 = new q80(clickableSpan, p6Var, f7, f11, 0);
                                                q1Var.p4 = q80Var3;
                                                q80Var3.d(org.telegram.ui.ActionBar.t6.w0(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.Ac : org.telegram.ui.ActionBar.t6.ze, q1Var.Ob));
                                                q1Var.x0 = i19;
                                                q1Var.t4 = 4;
                                                q1Var.w();
                                                try {
                                                    k80 b10 = q1Var.p4.b();
                                                    int[] U1 = q1.U1(spannable, q1Var.p4.i);
                                                    b10.d(p1Var3.p, U1[i10], 0.0f);
                                                    p1Var3.p.getSelectionPath(U1[i10], U1[1], b10);
                                                } catch (Exception e12) {
                                                    org.telegram.messenger.f8.g(e12, true);
                                                }
                                                aVar2.b(q1Var.p4, 4);
                                                try {
                                                    q1Var.invalidate();
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    z11 = true;
                                                    z13 = true;
                                                    org.telegram.messenger.f8.g(e, z11);
                                                    i12 = p1Var3.a;
                                                    if (x10 < i12) {
                                                    }
                                                    i19++;
                                                    i15 = i10;
                                                    iArr3 = iArr;
                                                }
                                                z13 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    iArr = iArr3;
                    z13 = z13;
                    i12 = p1Var3.a;
                    if (x10 < i12 && x10 <= (i12 + q1Var.Z6) - org.telegram.messenger.i0.L(31.0f) && K1 >= L) {
                        if (K1 > org.telegram.messenger.i0.L(26.0f) + L + p1Var3.c) {
                            q1Var.g5 = i19;
                            kh.b bVar = p1Var3.x;
                            boolean z14 = (bVar == null || !bVar.h || x10 <= (p1Var3.a + q1Var.Z6) - org.telegram.messenger.i0.L(81.0f)) ? i10 : 1;
                            this.F = z14;
                            if (z14 == 0) {
                                iArr[i10] = 1;
                                p1Var3.w.setHotspot(x10, K1);
                                p1Var3.w.setState(iArr2);
                                q1Var.invalidate();
                            }
                            z13 = true;
                            break;
                        }
                    }
                    i19++;
                    i15 = i10;
                    iArr3 = iArr;
                }
                i10 = i15;
                if (!z13 && this.s && (aVar = this.l) != null) {
                    y yVar = aVar.a;
                    if (aVar.getBounds().contains(x10, K1)) {
                        yVar.setHotspot(x10, K1);
                        yVar.setState(aVar.e);
                        i11 = i10;
                    } else {
                        i11 = -1;
                    }
                    q1Var.r5 = i11;
                    if (i11 != -1) {
                        return true;
                    }
                }
                return z13;
            }
        }
        return false;
    }

    public final boolean d(MotionEvent motionEvent) {
        ih.h hVar;
        ih.h hVar2;
        q1 q1Var = this.a;
        jj jjVar = q1Var.O5;
        if (jjVar != null && jjVar.D == 17 && !jjVar.o4()) {
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int K1 = (int) q1Var.K1(motionEvent);
            ih.h hVar3 = this.m;
            if (hVar3 != null) {
                if (hVar3.X && hVar3.a.f && hVar3.K.e(x10 - hVar3.L, K1 - hVar3.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                ih.h hVar4 = this.m;
                if ((hVar4.X || hVar4.W) && hVar4.k(x10, K1, action)) {
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (q1Var.O5.J0 && (hVar2 = this.n) != null) {
                if (hVar2.X && hVar2.a.f && hVar2.K.e(x10 - hVar2.L, K1 - hVar2.M, action)) {
                    if (action == 0) {
                        q1Var.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
                ih.h hVar5 = this.n;
                if ((hVar5.X || hVar5.W) && hVar5.k(x10, K1, action)) {
                    q1Var.f1 = true;
                    q1Var.invalidate();
                    return true;
                }
            }
            if (action == 0) {
                this.G = -1;
                ih.h hVar6 = this.m;
                if (hVar6 != null && hVar6.S && hVar6.getBounds().contains(x10, K1)) {
                    this.G = -2;
                    q1Var.invalidate();
                    return true;
                }
                if (q1Var.O5.J0 && (hVar = this.n) != null && hVar.S && hVar.getBounds().contains(x10, K1)) {
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
                int i10 = this.G;
                if (i10 == -2) {
                    ih.h hVar7 = this.m;
                    ImageReceiver imageReceiver = hVar7.b;
                    TLRPC.MessageMedia messageMedia = hVar7.T;
                    l1 l1Var = q1Var.Qa;
                    if (l1Var != null) {
                        l1Var.l(q1Var, null, messageMedia, -2);
                    }
                } else if (i10 == -3) {
                    ih.h hVar8 = this.n;
                    ImageReceiver imageReceiver2 = hVar8.b;
                    TLRPC.MessageMedia messageMedia2 = hVar8.T;
                    l1 l1Var2 = q1Var.Qa;
                    if (l1Var2 != null) {
                        l1Var2.l(q1Var, null, messageMedia2, -3);
                    }
                }
                this.G = -1;
                q1Var.invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(int i10) {
        q1 q1Var = this.a;
        CheckBoxBase[] checkBoxBaseArr = q1Var.d7;
        if (checkBoxBaseArr == null || checkBoxBaseArr.length != i10) {
            if (checkBoxBaseArr != null) {
                int i11 = 0;
                while (true) {
                    CheckBoxBase[] checkBoxBaseArr2 = q1Var.d7;
                    if (i11 >= checkBoxBaseArr2.length) {
                        break;
                    }
                    checkBoxBaseArr2[i11].l = false;
                    i11++;
                }
            }
            q1Var.d7 = new CheckBoxBase[i10];
            int i12 = 0;
            while (true) {
                CheckBoxBase[] checkBoxBaseArr3 = q1Var.d7;
                if (i12 >= checkBoxBaseArr3.length) {
                    break;
                }
                checkBoxBaseArr3[i12] = new CheckBoxBase(20, q1Var, q1Var.Ob);
                q1Var.d7[i12].k(false);
                q1Var.d7[i12].j(true);
                q1Var.d7[i12].d(9);
                i12++;
            }
        }
        if (this.I == null) {
            q1 q1Var2 = this.a;
            this.I = new org.telegram.ui.Components.w8(q1Var2.Y5, q1Var2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.N(1.0f));
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
        int V1;
        int V12;
        int V13;
        float f7;
        float f10;
        int i10;
        int i11;
        float f11;
        float L;
        int i12;
        int i13;
        long j10;
        int i14;
        q1 q1Var;
        Drawable[] drawableArr;
        RectF rectF;
        int i15;
        float f12;
        x1 x1Var;
        int[] iArr;
        ArrayList arrayList;
        int i16;
        int i17;
        int i18;
        float f13;
        float f14;
        ?? r12;
        float f15;
        int i19;
        float f16;
        int i20;
        int i21;
        float f17;
        int i22;
        long j11;
        float f18;
        int i23;
        int i24;
        int i25;
        int i26;
        float f19;
        float f20;
        org.telegram.ui.ActionBar.c5 c5Var;
        kh.d dVar;
        org.telegram.ui.Components.e6 e6Var;
        byte[] bArr;
        TLRPC.PollAnswer pollAnswer;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        ArrayList arrayList2;
        int i33;
        int i34;
        int i35;
        float f21;
        int i36;
        long j12;
        Canvas canvas2;
        int i37;
        RectF rectF2;
        float f22;
        int i38;
        int i39;
        Canvas canvas3;
        int i40;
        int i41;
        int i42;
        float f23;
        float f24;
        StaticLayout staticLayout;
        TLRPC.Poll poll;
        CheckBoxBase checkBoxBase;
        kh.b bVar;
        CheckBoxBase checkBoxBase2;
        byte[] bArr2;
        float f25;
        float f26;
        int i43;
        TLRPC.Poll poll2;
        float f27;
        float L2;
        int extraTextX;
        float f28;
        float f29;
        char c10;
        Canvas canvas4 = canvas;
        q1 q1Var2 = this.a;
        int[] iArr2 = q1Var2.J2;
        ArrayList arrayList3 = q1Var2.O4;
        Drawable[] drawableArr2 = q1Var2.H2;
        RectF rectF3 = q1Var2.a4;
        x1 x1Var2 = q1Var2.gb;
        long currentTimeMillis = System.currentTimeMillis();
        long j13 = currentTimeMillis - this.D;
        if (j13 > 17) {
            j13 = 17;
        }
        this.D = currentTimeMillis;
        if (q1Var2.O5.P3()) {
            V1 = q1Var2.V1(org.telegram.ui.ActionBar.t6.Tc);
            V12 = q1Var2.V1(q1Var2.v2() ? org.telegram.ui.ActionBar.t6.bc : org.telegram.ui.ActionBar.t6.gc);
            V13 = q1Var2.V1(org.telegram.ui.ActionBar.t6.Vc);
        } else {
            V1 = q1Var2.V1(org.telegram.ui.ActionBar.t6.Sc);
            V12 = q1Var2.V1(q1Var2.v2() ? org.telegram.ui.ActionBar.t6.ce : org.telegram.ui.ActionBar.t6.be);
            V13 = q1Var2.V1(org.telegram.ui.ActionBar.t6.Uc);
        }
        org.telegram.ui.ActionBar.t6.O2.setColor(V1);
        TextPaint textPaint = org.telegram.ui.ActionBar.t6.P2;
        textPaint.linkColor = V13;
        textPaint.setColor(V1);
        org.telegram.ui.ActionBar.t6.M2.setColor(V1);
        org.telegram.ui.ActionBar.t6.T2.setColor(V12);
        org.telegram.ui.ActionBar.t6.F2.setColor(V12);
        org.telegram.ui.ActionBar.t6.I2.setColor(V12);
        canvas4.save();
        int i44 = q1Var2.O5.J0 ? this.g : 0;
        if (x1Var2.i3) {
            float f30 = i44;
            f7 = org.telegram.messenger.i0.T1(x1Var2.h3 ? this.g : 0.0f, f30, x1Var2.L1);
            float f31 = f7 - f30;
            canvas4.translate(0.0f, f31);
            f10 = f31;
        } else {
            f7 = i44;
            f10 = 0.0f;
        }
        float f32 = f10;
        if (x1Var2.G2) {
            int i45 = q1Var2.Sa;
            i10 = V1;
            i11 = V12;
            f11 = 0.0f;
            canvas4.translate(0.0f, org.telegram.messenger.i0.W1(x1Var2.L1, x1Var2.H2, i45) + (-i45));
        } else {
            i10 = V1;
            i11 = V12;
            if (x1Var2.u2) {
                float f33 = q1Var2.Sa;
                float f34 = x1Var2.L1;
                float z10 = c3.i0.z(1.0f, f34, x1Var2.v2, f33 * f34);
                if (q1Var2.O5.n5()) {
                    z10 -= q1Var2.Sa;
                }
                f11 = 0.0f;
                canvas4.translate(0.0f, z10);
            } else {
                f11 = 0.0f;
            }
        }
        if (x1Var2.x0) {
            canvas4.translate(f11, x1Var2.k0);
        }
        if (q1Var2.O5.P3()) {
            L = org.telegram.messenger.i0.L(11.0f) + (q1Var2.b7 - q1Var2.Z6);
        } else {
            L = q1Var2.W6 ? org.telegram.messenger.i0.L(91.0f) : q1Var2.V2() ? org.telegram.messenger.i0.L(68.0f) : org.telegram.messenger.i0.L(20.0f);
        }
        boolean z11 = x1Var2.x0;
        if (z11) {
            L += x1Var2.h0;
        }
        float f35 = L;
        float f36 = q1Var2.Z6;
        if (z11) {
            f36 += x1Var2.i0 - x1Var2.h0;
        }
        float f37 = f36;
        int L3 = (int) (f35 - org.telegram.messenger.i0.L(9.0f));
        float f38 = f35 + f37;
        int L4 = (int) (f38 - org.telegram.messenger.i0.L(22.0f));
        if (f7 > org.telegram.messenger.i0.L(8.0f)) {
            if (q1Var2.l8 == null) {
                q1Var2.l8 = new dl0(q1Var2);
            }
            RectF rectF4 = org.telegram.messenger.i0.P;
            rectF4.set(0.0f, org.telegram.messenger.i0.L(5.0f), f37 - org.telegram.messenger.i0.L(33.0f), f7 - org.telegram.messenger.i0.L(3.0f));
            rectF4.offset(f35 + org.telegram.messenger.i0.L(1.0f), ((((org.telegram.messenger.i0.L(10.0f) + q1Var2.Sa) + this.q) + q1Var2.s3) + i44) - f7);
            q1Var2.l8.a(q1Var2.O5, q1Var2.ha, q1Var2.ia, q1Var2.Ob, 3);
            int i46 = V13;
            i14 = i44;
            int i47 = i11;
            iArr = iArr2;
            drawableArr = drawableArr2;
            i13 = L4;
            j10 = j13;
            int i48 = i10;
            q1Var2.l8.d(canvas, rectF4, 5.0f, 5.0f, 5.0f, 1.0f, true, false);
            canvas4 = canvas;
            q1Var2.l8.f(canvas4, rectF4, 1.0f);
            if (q1Var2.o3 != null) {
                int color = org.telegram.ui.ActionBar.t6.a3.getColor();
                org.telegram.ui.ActionBar.t6.a3.setColor(i48);
                canvas4.save();
                canvas4.clipRect(rectF4);
                ih.h hVar = this.n;
                if (hVar != null && hVar.S) {
                    int L5 = org.telegram.messenger.i0.L(10.0f) + ((int) rectF4.left);
                    int L6 = (((int) (rectF4.top + (this.g - org.telegram.messenger.i0.L(8.0f)))) - this.f) - org.telegram.messenger.i0.L(8.0f);
                    this.n.setBounds(L5, L6, this.e + L5, this.f + L6);
                    this.n.b(q1Var2.O5.N3());
                    ih.h hVar2 = this.n;
                    q1Var2.V1(q1Var2.O5.N3() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We);
                    qz0 qz0Var = hVar2.r;
                    if (qz0Var != null) {
                        qz0Var.n(i48);
                    }
                    qz0 qz0Var2 = hVar2.s;
                    if (qz0Var2 != null) {
                        qz0Var2.n(i47);
                    }
                    this.n.draw(canvas4);
                }
                if (this.c != null) {
                    int color2 = org.telegram.ui.ActionBar.t6.Y2.getColor();
                    org.telegram.ui.ActionBar.t6.Y2.setColor(q1Var2.l8.i());
                    canvas4.save();
                    canvas4.translate(rectF4.left + org.telegram.messenger.i0.L(10.0f), rectF4.top + org.telegram.messenger.i0.L(6.0f));
                    this.c.draw(canvas4);
                    canvas4.restore();
                    org.telegram.ui.ActionBar.t6.Y2.setColor(color2);
                    if (this.h != null) {
                        if (this.i != q1Var2.l8.i()) {
                            this.i = q1Var2.l8.i();
                            this.h.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.SRC_IN));
                        }
                        q1Var2.u5 = ((int) rectF4.right) - org.telegram.messenger.i0.L(16.33f);
                        q1Var2.v5 = org.telegram.messenger.i0.L(16.33f) + ((int) rectF4.top);
                        canvas4.save();
                        canvas4.scale(0.85f, 0.85f, q1Var2.u5, q1Var2.v5);
                        c10 = 2;
                        int z12 = f1.z(2, q1Var2.u5, this.h);
                        int y3 = f1.y(2, q1Var2.v5, this.h);
                        Drawable drawable = this.h;
                        drawable.setBounds(z12, y3, drawable.getIntrinsicWidth() + z12, this.h.getIntrinsicHeight() + y3);
                        this.h.draw(canvas4);
                        canvas4.restore();
                        org.telegram.ui.ActionBar.t6.b3.setColor(org.telegram.ui.ActionBar.t6.a3.getColor());
                        org.telegram.ui.ActionBar.t6.b3.linkColor = i46;
                        float L7 = rectF4.left + org.telegram.messenger.i0.L(10.0f);
                        q1Var2.s5 = L7;
                        float L8 = rectF4.top + org.telegram.messenger.i0.L(25.0f);
                        q1Var2.t5 = L8;
                        hj hjVar = q1Var2.o3;
                        i15 = i47;
                        i12 = L3;
                        rectF = rectF3;
                        x1Var = x1Var2;
                        i10 = i48;
                        f12 = 1.0f;
                        arrayList = arrayList3;
                        q1Var2.d1(L7, L8, canvas, hjVar.e, hjVar.d, true, 1.0f, true, false, false, true);
                        float L9 = rectF4.left + org.telegram.messenger.i0.L(10.0f);
                        float L10 = rectF4.top + org.telegram.messenger.i0.L(25.0f);
                        hj hjVar2 = q1Var2.o3;
                        q1Var2.G0(L9, L10, canvas, hjVar2.e, q1Var2.Ca, true, 1.0f, hjVar2.d, true);
                        q1Var = q1Var2;
                        canvas4 = canvas;
                        canvas4.restore();
                        org.telegram.ui.ActionBar.t6.a3.setColor(color);
                    }
                }
                c10 = 2;
                org.telegram.ui.ActionBar.t6.b3.setColor(org.telegram.ui.ActionBar.t6.a3.getColor());
                org.telegram.ui.ActionBar.t6.b3.linkColor = i46;
                float L72 = rectF4.left + org.telegram.messenger.i0.L(10.0f);
                q1Var2.s5 = L72;
                float L82 = rectF4.top + org.telegram.messenger.i0.L(25.0f);
                q1Var2.t5 = L82;
                hj hjVar3 = q1Var2.o3;
                i15 = i47;
                i12 = L3;
                rectF = rectF3;
                x1Var = x1Var2;
                i10 = i48;
                f12 = 1.0f;
                arrayList = arrayList3;
                q1Var2.d1(L72, L82, canvas, hjVar3.e, hjVar3.d, true, 1.0f, true, false, false, true);
                float L92 = rectF4.left + org.telegram.messenger.i0.L(10.0f);
                float L102 = rectF4.top + org.telegram.messenger.i0.L(25.0f);
                hj hjVar22 = q1Var2.o3;
                q1Var2.G0(L92, L102, canvas, hjVar22.e, q1Var2.Ca, true, 1.0f, hjVar22.d, true);
                q1Var = q1Var2;
                canvas4 = canvas;
                canvas4.restore();
                org.telegram.ui.ActionBar.t6.a3.setColor(color);
            } else {
                f12 = 1.0f;
                i15 = i47;
                i12 = L3;
                rectF = rectF3;
                x1Var = x1Var2;
                i10 = i48;
                arrayList = arrayList3;
                q1Var = q1Var2;
            }
        } else {
            i12 = L3;
            i13 = L4;
            j10 = j13;
            i14 = i44;
            q1Var = q1Var2;
            drawableArr = drawableArr2;
            rectF = rectF3;
            i15 = i11;
            f12 = 1.0f;
            x1Var = x1Var2;
            iArr = iArr2;
            arrayList = arrayList3;
        }
        if (q1Var.m2 != null) {
            canvas4.save();
            canvas4.translate(f35 + q1Var.getExtraTextX(), org.telegram.messenger.i0.L(15.0f) + q1Var.Sa + this.q + q1Var.s3 + i14);
            int alpha = org.telegram.ui.ActionBar.t6.O2.getAlpha();
            if (x1Var.l3 != null) {
                org.telegram.ui.ActionBar.t6.O2.setAlpha((int) (x1Var.L1 * alpha));
            }
            q1Var.m2.draw(canvas4);
            StaticLayout staticLayout2 = q1Var.m2;
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas4, staticLayout2, q1Var.Ba, 0.0f, null, 0.0f, 0.0f, 0.0f, x1Var.l3 != null ? x1Var.L1 : f12, q1Var.G1(1, staticLayout2.getPaint().getColor()));
            if (x1Var.l3 != null) {
                org.telegram.ui.ActionBar.t6.O2.setAlpha(alpha);
            }
            int height = q1Var.m2.getHeight();
            if (x1Var.l3 != null) {
                org.telegram.ui.ActionBar.t6.O2.setAlpha((int) ((f12 - x1Var.L1) * alpha));
                x1Var.l3.draw(canvas4);
                org.telegram.ui.ActionBar.t6.O2.setAlpha(alpha);
                StaticLayout staticLayout3 = x1Var.l3;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas4, staticLayout3, x1Var.m3, 0.0f, null, 0.0f, 0.0f, 0.0f, f12 - x1Var.L1, q1Var.G1(1, staticLayout3.getPaint().getColor()));
                i16 = org.telegram.messenger.i0.W1(x1Var.L1, x1Var.l3.getHeight(), height);
            } else {
                i16 = height;
            }
            canvas4.restore();
        } else {
            i16 = 0;
        }
        ih.h hVar3 = this.m;
        if (hVar3 == null || !hVar3.S) {
            i17 = i15;
            i18 = i10;
            f13 = f35;
        } else {
            int L11 = (org.telegram.messenger.i0.L(q1Var.Sa > 0 ? 11.0f : 5.0f) + q1Var.Sa) - ((int) f32);
            f13 = f35;
            int L12 = org.telegram.messenger.i0.L(2.0f) + (((int) f13) - org.telegram.messenger.i0.L(9.0f));
            this.m.setBounds(L12, L11, this.o + L12, this.p + L11);
            this.m.b(q1Var.O5.N3());
            ih.h hVar4 = this.m;
            q1Var.V1(q1Var.O5.N3() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We);
            qz0 qz0Var3 = hVar4.r;
            i18 = i10;
            if (qz0Var3 != null) {
                qz0Var3.n(i18);
            }
            qz0 qz0Var4 = hVar4.s;
            if (qz0Var4 != null) {
                i17 = i15;
                qz0Var4.n(i17);
            } else {
                i17 = i15;
            }
            this.m.draw(canvas4);
        }
        int L13 = org.telegram.messenger.i0.L(20.0f) + i16 + q1Var.Sa + this.q + q1Var.s3 + i14;
        if (q1Var.c3 != null) {
            canvas4.save();
            canvas4.translate(q1Var.e3 + f13 + q1Var.getExtraTextX(), L13);
            q1Var.c3.draw(canvas4);
            canvas4.restore();
            TLRPC.MessageMedia o12 = jj.o1(q1Var.O5.k);
            if (o12 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) o12;
                if (!tL_messageMediaPoll.poll.quiz || (!(q1Var.U4 || q1Var.V4 || q1Var.W4 || (this.x && (!this.v || this.w))) || TextUtils.isEmpty(tL_messageMediaPoll.results.solution))) {
                    f14 = 2.0f;
                    f15 = 0.3f;
                    i19 = 2;
                    f16 = 13.0f;
                    q1Var.m5 = -1;
                } else {
                    Drawable W1 = q1Var.W1(q1Var.O5.P3() ? "drawable_chat_pollHintDrawableOut" : "drawable_chat_pollHintDrawableIn");
                    if (q1Var.X4) {
                        W1.setAlpha((int) (this.r * 255.0f));
                    } else {
                        W1.setAlpha(zs.e4);
                    }
                    f15 = 0.3f;
                    q1Var.m5 = (int) (((f38 - org.telegram.messenger.i0.L(23.0f)) - W1.getIntrinsicWidth()) - org.telegram.messenger.i0.L(8.0f));
                    q1Var.n5 = L13 - org.telegram.messenger.i0.L(6.0f);
                    int w9 = f1.w(2, q1Var.m5, W1);
                    f14 = 2.0f;
                    int f39 = f1.f(2, q1Var.n5, W1);
                    i19 = 2;
                    if (q1Var.p5) {
                        float f40 = q1Var.q5;
                        if (f40 < f12) {
                            f29 = org.telegram.ui.Components.i6.a.getInterpolation(f40);
                            f16 = 13.0f;
                            int intrinsicWidth = ((int) (W1.getIntrinsicWidth() * f29)) / 2;
                            int intrinsicHeight = ((int) (W1.getIntrinsicHeight() * f29)) / 2;
                            W1.setBounds(w9 - intrinsicWidth, f39 - intrinsicHeight, w9 + intrinsicWidth, f39 + intrinsicHeight);
                            W1.draw(canvas4);
                        }
                    }
                    f29 = q1Var.q5;
                    f16 = 13.0f;
                    int intrinsicWidth2 = ((int) (W1.getIntrinsicWidth() * f29)) / 2;
                    int intrinsicHeight2 = ((int) (W1.getIntrinsicHeight() * f29)) / 2;
                    W1.setBounds(w9 - intrinsicWidth2, f39 - intrinsicHeight2, w9 + intrinsicWidth2, f39 + intrinsicHeight2);
                    W1.draw(canvas4);
                }
            } else {
                f14 = 2.0f;
                f15 = 0.3f;
                i19 = 2;
                f16 = 13.0f;
                q1Var.m5 = -1;
            }
            if (this.I == null || q1Var.h6) {
                r12 = 0;
            } else {
                r12 = 0;
                int ceil = (int) Math.ceil(q1Var.c3.getLineLeft(0));
                if (q1Var.e3 == 0 && ceil == 0) {
                    org.telegram.messenger.i0.L(f16);
                    f28 = ((int) Math.ceil(q1Var.c3.getLineWidth(0))) + f13 + org.telegram.messenger.i0.L(7.0f) + q1Var.getExtraTextX();
                } else {
                    org.telegram.messenger.i0.L(f16);
                    int i49 = q1Var.e3;
                    if (i49 != 0) {
                        L2 = (i49 + f13) - org.telegram.messenger.i0.L(23.0f);
                        extraTextX = q1Var.getExtraTextX();
                    } else {
                        L2 = (ceil + f13) - org.telegram.messenger.i0.L(23.0f);
                        extraTextX = q1Var.getExtraTextX();
                    }
                    f28 = L2 - extraTextX;
                }
                if (q1Var.a5 && this.C) {
                    this.I.setAlpha((int) (w7.u.a(q1Var.Z4 ? (f12 - this.r) / f15 : this.r, 0.0f, f12) * 255.0f));
                } else {
                    this.I.setAlpha(zs.e4);
                }
                this.I.setBounds((int) f28, L13 - org.telegram.messenger.i0.L(1.0f), (int) (this.I.c.d.f.a + f28), org.telegram.messenger.i0.L(16.0f) + (L13 - org.telegram.messenger.i0.L(1.0f)));
                org.telegram.ui.Components.w8 w8Var = this.I;
                q1Var.J6.getClass();
                w8Var.c(canvas4);
            }
        } else {
            f14 = 2.0f;
            r12 = 0;
            f15 = 0.3f;
            i19 = 2;
            f16 = 13.0f;
        }
        if (((q1Var.V4 || q1Var.U4 || q1Var.W4) && !q1Var.X4) || (poll2 = q1Var.h5) == null || !poll2.quiz || poll2.close_period == 0 || !q1Var.h6) {
            i20 = i18;
            i21 = i17;
            f17 = f16;
            i22 = -1;
            j11 = j10;
        } else {
            i21 = i17;
            long max = Math.max(0L, (q1Var.h5.close_date * 1000) - ConnectionsManager.getInstance(q1Var.Y5).getCurrentTimeMillis());
            i20 = i18;
            if (this.z != null) {
                f27 = 1000.0f;
            } else {
                f27 = 1000.0f;
            }
            this.z = org.telegram.messenger.i0.h0((int) Math.ceil(max / f27), r12);
            this.A = (int) Math.ceil(org.telegram.ui.ActionBar.t6.T2.measureText(r6));
            this.y = max;
            if (max <= 0 && !q1Var.V4) {
                if (q1Var.O5.u0 + 1000 < SystemClock.elapsedRealtime()) {
                    q1Var.O5.u0 = 0L;
                }
                q1Var.Qa.Z1();
            }
            int L14 = (q1Var.J6.getBounds().right - this.A) - org.telegram.messenger.i0.L(q1Var.O5.P3() ? 40.0f : 34.0f);
            if (max <= 5000) {
                org.telegram.ui.ActionBar.t6.T2.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.ha : org.telegram.ui.ActionBar.t6.ga));
            }
            if (this.B) {
                org.telegram.ui.ActionBar.t6.T2.setAlpha((int) ((1.0f - this.r) * 255.0f));
            }
            float f41 = f27;
            canvas4.drawText(this.z, L14, org.telegram.messenger.i0.L(11.0f) + L13, org.telegram.ui.ActionBar.t6.T2);
            org.telegram.ui.ActionBar.t6.Z1.setColor(org.telegram.ui.ActionBar.t6.T2.getColor());
            float f42 = f16;
            int C = org.telegram.messenger.m5.C(f42, this.A, L14);
            int L15 = org.telegram.messenger.i0.L(5.1f);
            int L16 = org.telegram.messenger.i0.L(6.0f) + L13;
            if (max <= 60000) {
                RectF rectF5 = rectF;
                rectF5.set(C - L15, L16 - L15, C + L15, L15 + L16);
                float min = (max / (Math.min(60, q1Var.h5.close_period) * f41)) * (-360.0f);
                i22 = -1;
                f17 = 13.0f;
                canvas4.drawArc(rectF5, -90.0f, min, false, org.telegram.ui.ActionBar.t6.Z1);
                q1Var.k5.a(min, q1Var.X4 ? 1.0f - this.r : 1.0f, canvas, org.telegram.ui.ActionBar.t6.Z1, rectF5);
                canvas4 = canvas;
                rectF = rectF5;
            } else {
                f17 = f42;
                i22 = -1;
                canvas4.drawCircle(C, L16, L15, org.telegram.ui.ActionBar.t6.Z1);
            }
            if (max > 60000 || this.H != 0.0f) {
                org.telegram.ui.ActionBar.t6.Z1.setAlpha((int) (this.H * 255.0f));
                float f43 = C;
                canvas4.drawLine(f43 - (org.telegram.messenger.i0.L(2.1f) * this.H), L16 - org.telegram.messenger.i0.L(7.5f), (org.telegram.messenger.i0.L(2.1f) * this.H) + f43, L16 - org.telegram.messenger.i0.L(7.5f), org.telegram.ui.ActionBar.t6.Z1);
                float f44 = L16;
                canvas4 = canvas;
                canvas4.drawLine(f43, f44 - (org.telegram.messenger.i0.L(3.0f) * this.H), f43, f44, org.telegram.ui.ActionBar.t6.Z1);
                if (max <= 60000) {
                    j11 = j10;
                    float f45 = this.H - (j11 / 180.0f);
                    this.H = f45;
                    if (f45 < 0.0f) {
                        this.H = 0.0f;
                    }
                    q1Var.invalidate();
                }
            }
            j11 = j10;
            q1Var.invalidate();
        }
        if (drawableArr[r12] != null && ((i43 = iArr[r12]) == 1 || i43 == 3)) {
            if (i43 == 3) {
                canvas4.save();
                float f46 = q1Var.q5;
                canvas4.scale(f46, f46, drawableArr[r12].getBounds().centerX(), drawableArr[r12].getBounds().centerY());
            }
            drawableArr[r12].draw(canvas4);
            if (iArr[r12] == 3) {
                canvas4.restore();
            }
        }
        boolean D4 = q1Var.O5.D4();
        TLRPC.Poll poll3 = q1Var.h5;
        boolean z13 = (poll3 == null || !poll3.multiple_choice) ? r12 : true;
        boolean z14 = (D4 && q1Var.O5.q()) ? true : r12;
        boolean z15 = (q1Var.U4 && !this.w && this.v) ? true : r12;
        if (!this.C || z15) {
            f18 = 255.0f;
        } else {
            if (q1Var.Z4) {
                f25 = 1.0f;
                f26 = 1.0f - this.r;
            } else {
                f25 = 1.0f;
                f26 = this.r;
            }
            f18 = Math.min(f26 / f15, f25) * 255.0f;
        }
        int i50 = (int) f18;
        int max2 = Math.max(q1Var.Q4, (int) r12);
        while (true) {
            int i51 = q1Var.R4;
            if (i51 == i22) {
                i51 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (max2 > Math.min(i51, arrayList.size() - 1)) {
                break;
            }
            ArrayList arrayList4 = arrayList;
            p1 p1Var = (p1) arrayList4.get(max2);
            p1Var.a = (int) f13;
            int i52 = p1Var.b;
            int i53 = p1Var.c;
            if (p1Var.A != null) {
                i52 = org.telegram.messenger.i0.W1(x1Var.L1, p1Var.C, i52);
                i53 = org.telegram.messenger.i0.W1(x1Var.L1, p1Var.D, i53);
            }
            int i54 = i53;
            TLRPC.TodoItem todoItem = p1Var.t;
            if ((todoItem == null || todoItem.id != q1Var.a6) && (((bArr = q1Var.c6) == null || Arrays.equals(p1Var.s.option, bArr)) && ((pollAnswer = p1Var.s) == null || (bArr2 = pollAnswer.option) == null || !Arrays.equals(bArr2, q1Var.b6)))) {
                canvas4.save();
                int r13 = org.telegram.ui.ActionBar.t6.r1(0.12f, i21);
                if (p1Var.v != r13) {
                    Drawable drawable2 = p1Var.w;
                    p1Var.v = r13;
                    i27 = i50;
                    org.telegram.ui.ActionBar.t6.H1(drawable2, r13, false);
                } else {
                    i27 = i50;
                }
                long j14 = j11;
                p1Var.w.setBounds((int) (f13 - org.telegram.messenger.i0.L(8.0f)), (q1Var.Sa + i52) - org.telegram.messenger.i0.L(f17), (int) (f38 - org.telegram.messenger.i0.L(23.0f)), org.telegram.messenger.i0.L(f17) + q1Var.Sa + i52 + i54);
                p1Var.w.draw(canvas4);
                canvas4.restore();
                kh.b bVar2 = p1Var.x;
                if (bVar2 != null) {
                    i28 = i12;
                    i30 = i13;
                    bVar2.setBounds(i28, (q1Var.Sa + i52) - org.telegram.messenger.i0.L(f17), i30, org.telegram.messenger.i0.L(f17) + q1Var.Sa + i52 + i54);
                    i29 = i20;
                    p1Var.x.l(i29);
                    kh.b bVar3 = p1Var.x;
                    q1Var.J6.getClass();
                    bVar3.c(canvas4);
                } else {
                    i28 = i12;
                    i29 = i20;
                    i30 = i13;
                }
                canvas4.save();
                p1Var.m = org.telegram.messenger.i0.L(z14 ? 48.0f : 35.0f) + f13;
                p1Var.n = q1Var.Sa + i52;
                canvas4.translate(org.telegram.messenger.i0.L(z14 ? 48.0f : 35.0f) + f13, i52 + q1Var.Sa);
                if (x1Var.x0) {
                    canvas4.translate(0.0f, x1Var.k0);
                }
                int alpha2 = org.telegram.ui.ActionBar.t6.P2.getAlpha();
                if (p1Var.A != null) {
                    i31 = alpha2;
                    org.telegram.ui.ActionBar.t6.P2.setAlpha((int) (alpha2 * x1Var.L1));
                } else {
                    i31 = alpha2;
                }
                canvas4.save();
                if (D4 && z14 && p1Var.q != null && (checkBoxBase2 = q1Var.d7[max2]) != null) {
                    float progress = checkBoxBase2.getProgress();
                    canvas4.translate(0.0f, (-org.telegram.messenger.i0.L(7.66f)) * progress);
                    p1Var.n = ((-org.telegram.messenger.i0.L(7.66f)) * progress) + p1Var.n;
                }
                if (max2 == q1Var.x0 && q1Var.s4.i(canvas4, 4)) {
                    q1Var.invalidate();
                }
                if (p1Var.o && (bVar = p1Var.x) != null) {
                    canvas4.translate(-bVar.d(org.telegram.messenger.i0.L(7.0f)), 0.0f);
                }
                p1Var.p.draw(canvas4);
                StaticLayout staticLayout4 = p1Var.p;
                i32 = max2;
                arrayList2 = arrayList4;
                int i55 = i29;
                i33 = i28;
                i34 = i30;
                i35 = i21;
                f21 = f13;
                int i56 = i31;
                i36 = i27;
                j12 = j14;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, staticLayout4, p1Var.r, 0.0f, null, 0.0f, 0.0f, 0.0f, p1Var.A != null ? x1Var.L1 : 1.0f, q1Var.G1(1, staticLayout4.getPaint().getColor()));
                if (p1Var.A != null) {
                    org.telegram.ui.ActionBar.t6.P2.setAlpha((int) ((1.0f - x1Var.L1) * i56));
                    p1Var.A.draw(canvas);
                    StaticLayout staticLayout5 = p1Var.A;
                    org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, staticLayout5, p1Var.B, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f - x1Var.L1, q1Var.G1(1, staticLayout5.getPaint().getColor()));
                    org.telegram.ui.ActionBar.t6.P2.setAlpha(i56);
                }
                canvas.restore();
                if (D4 && z14 && p1Var.q != null && (checkBoxBase = q1Var.d7[i32]) != null) {
                    float progress2 = checkBoxBase.getProgress();
                    if (progress2 > 0.0f) {
                        qz0 qz0Var5 = p1Var.q;
                        qz0Var5.p = f37 - org.telegram.messenger.i0.L(8.0f);
                        qz0Var5.c(0.0f, (p1Var.q.i() / f14) + (p1Var.p.getHeight() - org.telegram.messenger.i0.L(6.0f)), progress2, i35, canvas);
                        canvas2 = canvas;
                        org.telegram.ui.ActionBar.t6.P2.setAlpha(i56);
                        if (!D4 || ((!q1Var.U4 || (!this.w && this.v)) && !q1Var.V4 && !q1Var.W4 && ((!this.x || (this.v && !this.w)) && (!this.C || z15)))) {
                            i37 = i55;
                            rectF2 = rectF;
                            f22 = 0.0f;
                            i38 = 2;
                        } else {
                            TLRPC.Poll poll4 = q1Var.h5;
                            if (poll4 == null || !poll4.quiz) {
                                org.telegram.ui.ActionBar.t6.S1.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le));
                            } else {
                                int i57 = p1Var.l ? q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.fa : org.telegram.ui.ActionBar.t6.ea : q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.ha : org.telegram.ui.ActionBar.t6.ga;
                                if (!q1Var.J6.m() || org.telegram.ui.ActionBar.t6.f1(i57)) {
                                    org.telegram.ui.ActionBar.t6.S1.setColor(q1Var.V1(i57));
                                } else {
                                    org.telegram.ui.ActionBar.t6.S1.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le));
                                }
                            }
                            if (this.C && !z15) {
                                float f47 = i36;
                                org.telegram.ui.ActionBar.t6.M2.setAlpha((int) ((org.telegram.ui.ActionBar.t6.M2.getAlpha() / 255.0f) * f47));
                                org.telegram.ui.ActionBar.t6.S1.setAlpha((int) (f47 * (org.telegram.ui.ActionBar.t6.S1.getAlpha() / 255.0f)));
                            }
                            boolean z16 = p1Var.i || p1Var.k || ((poll = q1Var.h5) != null && poll.quiz && p1Var.l && (q1Var.U4 || q1Var.V4 || q1Var.W4 || (this.x && (!this.v || this.w))));
                            int i58 = p1Var.f;
                            String format = String.format("%d%%", Integer.valueOf(w7.u.b((int) Math.ceil(((p1Var.d - i58) * this.r) + i58), 0, 100)));
                            float ceil2 = (-org.telegram.messenger.i0.L(6.5f)) - ((int) Math.ceil(org.telegram.ui.ActionBar.t6.M2.measureText(format)));
                            float L17 = org.telegram.messenger.i0.L(14.0f);
                            if (!z16 || (staticLayout = p1Var.p) == null) {
                                i42 = 2;
                            } else {
                                i42 = 2;
                                if (staticLayout.getLineCount() < 2) {
                                    f23 = q1Var.S4;
                                    canvas2.drawText(format, ceil2, L17 + f23, org.telegram.ui.ActionBar.t6.M2);
                                    int L18 = q1Var.Z6 - org.telegram.messenger.i0.L(76.0f);
                                    float f48 = p1Var.h;
                                    float f49 = ((p1Var.g - f48) * this.r) + f48;
                                    if (z15) {
                                        int color3 = org.telegram.ui.ActionBar.t6.S1.getColor();
                                        int alpha3 = Color.alpha(color3);
                                        float L19 = L18 - (this.u ? org.telegram.messenger.i0.L(37.33f) : 0);
                                        i37 = i55;
                                        org.telegram.ui.ActionBar.t6.S1.setColor(i0.b.o(i37, (alpha3 * 16) / zs.e4));
                                        float f50 = f49 * L19;
                                        i38 = i42;
                                        rectF2 = rectF;
                                        rectF2.set(Math.max(f50 - org.telegram.messenger.i0.L(f14), 0.0f), org.telegram.messenger.i0.L(6.0f) + i54, L19, org.telegram.messenger.i0.L(11.0f) + i54);
                                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), org.telegram.ui.ActionBar.t6.S1);
                                        org.telegram.ui.ActionBar.t6.S1.setColor(color3);
                                        f24 = 0.0f;
                                        rectF2.set(0.0f, org.telegram.messenger.i0.L(6.0f) + i54, f50, org.telegram.messenger.i0.L(11.0f) + i54);
                                        canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f14), org.telegram.ui.ActionBar.t6.S1);
                                    } else {
                                        i38 = i42;
                                        i37 = i55;
                                        rectF2 = rectF;
                                        f24 = 0.0f;
                                    }
                                    if (z16) {
                                        f22 = f24;
                                    } else {
                                        float L20 = rectF2.left - org.telegram.messenger.i0.L(15.5f);
                                        float centerY = rectF2.centerY() + q1Var.S4;
                                        float L21 = org.telegram.messenger.i0.L(7.0f);
                                        float L22 = org.telegram.messenger.i0.L(z13 ? 4.5f : 7.0f);
                                        float f51 = L20 - L21;
                                        float f52 = centerY - L21;
                                        float f53 = L20 + L21;
                                        float f54 = centerY + L21;
                                        canvas2.saveLayerAlpha(f51, f52, f53, f54, i36);
                                        TLRPC.Poll poll5 = q1Var.h5;
                                        Drawable drawable3 = (poll5 == null || !poll5.quiz || p1Var.l) ? org.telegram.ui.ActionBar.t6.K4[q1Var.O5.P3() ? 1 : 0] : org.telegram.ui.ActionBar.t6.L4[q1Var.O5.P3() ? 1 : 0];
                                        z.u(drawable3, L20 - (drawable3.getIntrinsicWidth() / 2), centerY - (drawable3.getIntrinsicHeight() / 2));
                                        drawable3.draw(canvas2);
                                        if (q1Var.Oc == null) {
                                            Paint paint = new Paint(1);
                                            q1Var.Oc = paint;
                                            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                                        }
                                        q1Var.Oc.setColor(org.telegram.ui.ActionBar.t6.S1.getColor());
                                        i36 = i36;
                                        f22 = 0.0f;
                                        canvas2.drawRoundRect(f51, f52, f53, f54, L22, L22, q1Var.Oc);
                                        canvas.restore();
                                    }
                                }
                            }
                            f23 = 0.0f;
                            canvas2.drawText(format, ceil2, L17 + f23, org.telegram.ui.ActionBar.t6.M2);
                            int L182 = q1Var.Z6 - org.telegram.messenger.i0.L(76.0f);
                            float f482 = p1Var.h;
                            float f492 = ((p1Var.g - f482) * this.r) + f482;
                            if (z15) {
                            }
                            if (z16) {
                            }
                        }
                        if (!D4 || (!(q1Var.U4 || q1Var.V4 || q1Var.W4 || (this.x && (!this.v || this.w))) || z15 || this.C)) {
                            if (q1Var.v2()) {
                                org.telegram.ui.ActionBar.t6.a2.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.oc : org.telegram.ui.ActionBar.t6.me));
                            } else {
                                org.telegram.ui.ActionBar.t6.a2.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.pc : org.telegram.ui.ActionBar.t6.ne));
                            }
                            if (this.C && !z15) {
                                org.telegram.ui.ActionBar.t6.a2.setAlpha((int) ((255 - i36) * (org.telegram.ui.ActionBar.t6.a2.getAlpha() / 255.0f)));
                            }
                            canvas4 = canvas;
                            canvas4.drawLine(-org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f17) + i54, f37 - org.telegram.messenger.i0.L(z14 ? 71.0f : 58.0f), org.telegram.messenger.i0.L(f17) + i54, org.telegram.ui.ActionBar.t6.a2);
                            if (D4 || z14) {
                                if (D4 && q1Var.X4) {
                                    i39 = i32;
                                    if (i39 != q1Var.b5 || z15) {
                                        rectF = rectF2;
                                    } else {
                                        org.telegram.ui.ActionBar.t6.X1.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le));
                                        if (this.C && !z15) {
                                            org.telegram.ui.ActionBar.t6.X1.setAlpha((int) ((255 - i36) * (org.telegram.ui.ActionBar.t6.X1.getAlpha() / 255.0f)));
                                        }
                                        rectF2.set((-org.telegram.messenger.i0.L(z14 ? 35.0f : 22.0f)) - org.telegram.messenger.i0.L(8.5f), org.telegram.messenger.i0.L(9.0f) - org.telegram.messenger.i0.L(8.5f), org.telegram.messenger.i0.L(8.5f) + (-org.telegram.messenger.i0.L(23.0f)), org.telegram.messenger.i0.L(8.5f) + org.telegram.messenger.i0.L(9.0f));
                                        RectF rectF6 = rectF2;
                                        canvas4.drawArc(rectF6, this.E, q1Var.c5, false, org.telegram.ui.ActionBar.t6.X1);
                                        rectF = rectF6;
                                        canvas4 = canvas;
                                        i32 = i39;
                                        canvas4.restore();
                                    }
                                } else {
                                    rectF = rectF2;
                                    i39 = i32;
                                }
                                if (this.x || (this.v && !this.w)) {
                                    if (q1Var.O5.P3()) {
                                        org.telegram.ui.ActionBar.t6.X1.setColor(q1Var.V1(q1Var.v2() ? org.telegram.ui.ActionBar.t6.pd : org.telegram.ui.ActionBar.t6.od));
                                    } else {
                                        org.telegram.ui.ActionBar.t6.X1.setColor(q1Var.V1(q1Var.v2() ? org.telegram.ui.ActionBar.t6.Ib : org.telegram.ui.ActionBar.t6.Hb));
                                    }
                                    if (this.C && !z15) {
                                        org.telegram.ui.ActionBar.t6.X1.setAlpha((int) ((255 - i36) * (org.telegram.ui.ActionBar.t6.X1.getAlpha() / 255.0f)));
                                    }
                                    float f55 = -org.telegram.messenger.i0.L(!z14 ? 35.0f : 22.0f);
                                    float L23 = org.telegram.messenger.i0.L(9.0f);
                                    float L24 = org.telegram.messenger.i0.L(!z13 ? 8.0f : 8.5f);
                                    if (z13) {
                                        i32 = i39;
                                        canvas3 = canvas;
                                        canvas3.drawCircle(f55, L23, L24, org.telegram.ui.ActionBar.t6.X1);
                                    } else {
                                        i32 = i39;
                                        canvas.drawRoundRect(f55 - L24, L23 - L24, f55 + L24, L24 + L23, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.ui.ActionBar.t6.X1);
                                        canvas3 = canvas;
                                    }
                                    if (!z13 || z15 || D4) {
                                        int L25 = org.telegram.messenger.i0.L(z13 ? 8.0f : 8.5f);
                                        int i59 = org.telegram.ui.ActionBar.t6.k7;
                                        if (q1Var.O5.P3()) {
                                            i40 = -1;
                                        } else {
                                            i40 = -1;
                                            if (q1Var.V1(i59) == -1) {
                                                i59 = org.telegram.ui.ActionBar.t6.ob;
                                            }
                                        }
                                        q1Var.d7[i32].h(i40, !q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le, i59);
                                        i41 = L25 / 2;
                                        q1Var.d7[i32].e((-org.telegram.messenger.i0.L(!z14 ? 35.0f : 22.0f)) - i41, org.telegram.messenger.i0.L(9.0f) - i41, L25, L25);
                                        q1Var.d7[i32].i(!z13 ? org.telegram.messenger.i0.L(5.0f) : f22);
                                        q1Var.d7[i32].l(!z13 ? 19.0f : 20.0f);
                                        q1Var.d7[i32].a(canvas3);
                                        if (p1Var.t != null && p1Var.z != null) {
                                            if (this.J == null) {
                                                Paint paint2 = new Paint(1);
                                                this.J = paint2;
                                                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                                            }
                                            float progress3 = q1Var.d7[i32].getProgress();
                                            float T1 = org.telegram.messenger.i0.T1(0.5f, 1.0f, progress3);
                                            p1Var.z.y0(org.telegram.messenger.i0.L(8.0f) + ((-org.telegram.messenger.i0.L(!z14 ? 35.0f : 22.0f)) - i41), org.telegram.messenger.i0.L(9.0f) - (org.telegram.messenger.i0.L(20.0f) / 2), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
                                            canvas4 = canvas;
                                            canvas4.saveLayerAlpha(p1Var.z.x(), p1Var.z.z(), p1Var.z.y(), p1Var.z.A(), zs.e4, 31);
                                            canvas4.save();
                                            canvas4.scale(T1, T1, p1Var.z.x(), p1Var.z.s());
                                            p1Var.z.setAlpha(progress3);
                                            p1Var.z.g(canvas4);
                                            canvas4.restore();
                                            canvas4.drawCircle(-org.telegram.messenger.i0.L(z14 ? 35.0f : 22.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(11.0f), this.J);
                                            canvas4.restore();
                                            canvas4.restore();
                                        }
                                    }
                                    canvas4 = canvas3;
                                    canvas4.restore();
                                }
                                canvas4 = canvas;
                                i32 = i39;
                                canvas4.restore();
                            } else if (p1Var.i) {
                                if (this.L == null) {
                                    Path path = new Path();
                                    this.L = path;
                                    path.moveTo(-org.telegram.messenger.i0.L(3.66f), org.telegram.messenger.i0.L(0.16f));
                                    this.L.lineTo(org.telegram.messenger.i0.L(-1.0f), org.telegram.messenger.i0.L(3.0f));
                                    this.L.lineTo(org.telegram.messenger.i0.L(3.66f), org.telegram.messenger.i0.L(-3.0f));
                                }
                                if (this.K == null) {
                                    Paint paint3 = new Paint(1);
                                    this.K = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                    this.K.setStrokeCap(Paint.Cap.ROUND);
                                    this.K.setStrokeJoin(Paint.Join.ROUND);
                                }
                                this.K.setStrokeWidth(org.telegram.messenger.i0.L(1.833f));
                                this.K.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le));
                                canvas4.save();
                                canvas4.translate(-org.telegram.messenger.i0.L(z14 ? 35.0f : 22.0f), org.telegram.messenger.i0.L(9.0f));
                                canvas4.drawPath(this.L, this.K);
                                canvas4.restore();
                            } else {
                                org.telegram.ui.ActionBar.t6.a2.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le));
                                canvas4.drawCircle(-org.telegram.messenger.i0.L(z14 ? 35.0f : 22.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(2.5f), org.telegram.ui.ActionBar.t6.a2);
                            }
                        } else {
                            canvas4 = canvas;
                        }
                        rectF = rectF2;
                        canvas4.restore();
                    }
                }
                canvas2 = canvas;
                org.telegram.ui.ActionBar.t6.P2.setAlpha(i56);
                if (D4) {
                }
                i37 = i55;
                rectF2 = rectF;
                f22 = 0.0f;
                i38 = 2;
                if (D4) {
                }
                if (q1Var.v2()) {
                }
                if (this.C) {
                    org.telegram.ui.ActionBar.t6.a2.setAlpha((int) ((255 - i36) * (org.telegram.ui.ActionBar.t6.a2.getAlpha() / 255.0f)));
                }
                canvas4 = canvas;
                canvas4.drawLine(-org.telegram.messenger.i0.L(f14), org.telegram.messenger.i0.L(f17) + i54, f37 - org.telegram.messenger.i0.L(z14 ? 71.0f : 58.0f), org.telegram.messenger.i0.L(f17) + i54, org.telegram.ui.ActionBar.t6.a2);
                if (D4) {
                }
                if (D4) {
                }
                rectF = rectF2;
                i39 = i32;
                if (this.x) {
                }
                if (q1Var.O5.P3()) {
                }
                if (this.C) {
                    org.telegram.ui.ActionBar.t6.X1.setAlpha((int) ((255 - i36) * (org.telegram.ui.ActionBar.t6.X1.getAlpha() / 255.0f)));
                }
                float f552 = -org.telegram.messenger.i0.L(!z14 ? 35.0f : 22.0f);
                float L232 = org.telegram.messenger.i0.L(9.0f);
                float L242 = org.telegram.messenger.i0.L(!z13 ? 8.0f : 8.5f);
                if (z13) {
                }
                if (!z13) {
                }
                int L252 = org.telegram.messenger.i0.L(z13 ? 8.0f : 8.5f);
                int i592 = org.telegram.ui.ActionBar.t6.k7;
                if (q1Var.O5.P3()) {
                }
                q1Var.d7[i32].h(i40, !q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.nc : org.telegram.ui.ActionBar.t6.le, i592);
                i41 = L252 / 2;
                q1Var.d7[i32].e((-org.telegram.messenger.i0.L(!z14 ? 35.0f : 22.0f)) - i41, org.telegram.messenger.i0.L(9.0f) - i41, L252, L252);
                q1Var.d7[i32].i(!z13 ? org.telegram.messenger.i0.L(5.0f) : f22);
                q1Var.d7[i32].l(!z13 ? 19.0f : 20.0f);
                q1Var.d7[i32].a(canvas3);
                if (p1Var.t != null) {
                    if (this.J == null) {
                    }
                    float progress32 = q1Var.d7[i32].getProgress();
                    float T12 = org.telegram.messenger.i0.T1(0.5f, 1.0f, progress32);
                    p1Var.z.y0(org.telegram.messenger.i0.L(8.0f) + ((-org.telegram.messenger.i0.L(!z14 ? 35.0f : 22.0f)) - i41), org.telegram.messenger.i0.L(9.0f) - (org.telegram.messenger.i0.L(20.0f) / 2), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
                    canvas4 = canvas;
                    canvas4.saveLayerAlpha(p1Var.z.x(), p1Var.z.z(), p1Var.z.y(), p1Var.z.A(), zs.e4, 31);
                    canvas4.save();
                    canvas4.scale(T12, T12, p1Var.z.x(), p1Var.z.s());
                    p1Var.z.setAlpha(progress32);
                    p1Var.z.g(canvas4);
                    canvas4.restore();
                    canvas4.drawCircle(-org.telegram.messenger.i0.L(z14 ? 35.0f : 22.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(11.0f), this.J);
                    canvas4.restore();
                    canvas4.restore();
                }
                canvas4 = canvas3;
                canvas4.restore();
            } else {
                j12 = j11;
                arrayList2 = arrayList4;
                i35 = i21;
                i38 = i19;
                i33 = i12;
                i34 = i13;
                i36 = i50;
                i32 = max2;
                f21 = f13;
                i37 = i20;
            }
            max2 = i32 + 1;
            i50 = i36;
            i20 = i37;
            f13 = f21;
            i21 = i35;
            arrayList = arrayList2;
            j11 = j12;
            i12 = i33;
            i13 = i34;
            i19 = i38;
            i22 = -1;
        }
        int i60 = i50;
        long j15 = j11;
        ArrayList arrayList5 = arrayList;
        int i61 = i19;
        int i62 = i12;
        int i63 = i13;
        float f56 = f13;
        if (arrayList5.isEmpty()) {
            i23 = 0;
        } else {
            p1 p1Var2 = (p1) i0.a.g(1, arrayList5);
            int i64 = p1Var2.b;
            int i65 = p1Var2.c;
            if (p1Var2.A != null) {
                i64 = org.telegram.messenger.i0.W1(x1Var.L1, p1Var2.C, i64);
                i65 = org.telegram.messenger.i0.W1(x1Var.L1, p1Var2.D, i65);
            }
            i23 = q1Var.Sa + i64 + i65;
        }
        if (this.s) {
            i24 = x1Var.V2 ? org.telegram.messenger.i0.W1(x1Var.L1, x1Var.X2, q1Var.O1) : q1Var.O1;
        } else {
            i24 = 0;
        }
        if (!this.s || this.l == null) {
            i25 = i62;
            i26 = i63;
        } else {
            int L26 = org.telegram.messenger.i0.L(f17) + i23;
            int L27 = org.telegram.messenger.i0.L(44.33f);
            kh.a aVar = this.l;
            TLRPC.Poll poll6 = q1Var.h5;
            aVar.e(((poll6 == null || poll6.public_voters || poll6.multiple_choice) ? org.telegram.ui.ActionBar.t6.I2 : org.telegram.ui.ActionBar.t6.F2).getColor());
            i25 = i62;
            i26 = i63;
            this.l.setBounds(i25, L26, i26, L27 + L26);
            this.l.draw(canvas4);
            if (q1Var.Qa != null) {
                canvas4.save();
                canvas4.translate(i25, L26);
                q1Var.Qa.x0(q1Var);
                canvas4.restore();
            }
            if ((!q1Var.U4 && !q1Var.V4 && !q1Var.W4) || z15 || this.C) {
                int color4 = org.telegram.ui.ActionBar.t6.a2.getColor();
                if (q1Var.v2()) {
                    org.telegram.ui.ActionBar.t6.a2.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.pc : org.telegram.ui.ActionBar.t6.ne));
                } else {
                    org.telegram.ui.ActionBar.t6.a2.setColor(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.oc : org.telegram.ui.ActionBar.t6.me));
                }
                if (this.C && !z15) {
                    org.telegram.ui.ActionBar.t6.a2.setAlpha((int) ((zs.e4 - i60) * (org.telegram.ui.ActionBar.t6.a2.getAlpha() / 255.0f)));
                }
                float f57 = L26 + i24;
                canvas4.drawLine((f56 + org.telegram.messenger.i0.L(35.0f)) - org.telegram.messenger.i0.L(f14), f57, ((f56 + org.telegram.messenger.i0.L(35.0f)) + f37) - org.telegram.messenger.i0.L(58.0f), f57, org.telegram.ui.ActionBar.t6.a2);
                org.telegram.ui.ActionBar.t6.a2.setColor(color4);
            }
        }
        if (this.s) {
            i23 += i24;
        }
        kh.d dVar2 = this.k;
        float b10 = dVar2 != null ? dVar2.b() : 0.0f;
        float f58 = (D4 || (e6Var = q1Var.x3) == null || !e6Var.isVisible()) ? 0.0f : 1.0f;
        boolean z17 = q1Var.s2;
        float f59 = z17 ? 1.0f : 0.0f;
        if (z17) {
            int L28 = org.telegram.messenger.i0.L((q1Var.O5.P3() || q1Var.A6 || q1Var.J) ? f14 : 8.0f) + q1Var.getCurrentBackgroundLeft();
            int L29 = org.telegram.messenger.i0.L(f17) + i23;
            if (q1Var.O5.P3()) {
                org.telegram.ui.ActionBar.t6.M2.setColor(q1Var.V1(org.telegram.ui.ActionBar.t6.Lb));
            } else {
                org.telegram.ui.ActionBar.t6.M2.setColor(q1Var.V1(org.telegram.ui.ActionBar.t6.yd));
            }
            f19 = b10;
            q1Var.K2.set(L28, L29, q1Var.B2 + L28, org.telegram.messenger.i0.L(44.0f) + L29);
            Drawable drawable4 = drawableArr[0];
            if (drawable4 != null && iArr[0] == i61) {
                drawable4.setBounds(L28 - org.telegram.messenger.i0.L(this.b ? 6.0f : 0.0f), L29, q1Var.B2 + L28, org.telegram.messenger.i0.L(44.0f) + L29);
                drawableArr[0].draw(canvas4);
            }
            if (q1Var.O5.T3() && (dVar = this.k) != null) {
                dVar.c(q1Var.V1(q1Var.O5.P3() ? org.telegram.ui.ActionBar.t6.Lb : org.telegram.ui.ActionBar.t6.yd));
                this.k.setBounds(i25, L29, i26, org.telegram.messenger.i0.L(44.0f) + L29);
                this.k.d((-org.telegram.messenger.i0.L(7.0f)) * f58);
                this.k.draw(canvas4);
            } else if (q1Var.p2 != null) {
                canvas4.save();
                canvas4.translate(L28 + q1Var.z2, org.telegram.messenger.i0.L(14.5f) + L29);
                q1Var.p2.draw(canvas4);
                canvas4.restore();
            }
        } else {
            f19 = b10;
            if (q1Var.w3 != null) {
                float L30 = ((1.0f - f58) * org.telegram.messenger.i0.L(6.0f)) + org.telegram.messenger.i0.L(25.0f) + i23;
                canvas4.save();
                if (x1Var.x0) {
                    canvas4.translate(((q1Var.getBackgroundDrawableRight() + x1Var.i0) + (q1Var.getBackgroundDrawableLeft() + x1Var.h0)) / f14, L30);
                } else {
                    canvas4.translate((q1Var.getBackgroundDrawableRight() + q1Var.getBackgroundDrawableLeft()) / f14, L30);
                }
                q1Var.w3.setBounds(-1, -1, 1, 1);
                org.telegram.ui.Components.e6 e6Var2 = q1Var.w3;
                TLRPC.Poll poll7 = q1Var.h5;
                e6Var2.u(((poll7 == null || poll7.public_voters || poll7.multiple_choice) ? org.telegram.ui.ActionBar.t6.I2 : org.telegram.ui.ActionBar.t6.F2).getColor());
                q1Var.w3.draw(canvas4);
                canvas4.restore();
            }
        }
        if (D4 || q1Var.x3 == null) {
            f20 = 1.0f;
        } else {
            float L31 = (org.telegram.messenger.i0.L(3.0f) * f59) + c3.i0.z(1.0f, f58, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(41.0f) + i23);
            canvas4.save();
            if (x1Var.x0) {
                canvas4.translate(((q1Var.getBackgroundDrawableRight() + x1Var.i0) + (q1Var.getBackgroundDrawableLeft() + x1Var.h0)) / f14, L31);
            } else {
                canvas4.translate((i25 + i26) / f14, L31);
            }
            q1Var.x3.setBounds(-1, -1, 1, 1);
            org.telegram.ui.Components.e6 e6Var3 = q1Var.x3;
            TLRPC.Poll poll8 = q1Var.h5;
            e6Var3.u(((poll8 == null || poll8.public_voters || poll8.multiple_choice) ? org.telegram.ui.ActionBar.t6.I2 : org.telegram.ui.ActionBar.t6.F2).getColor());
            f20 = 1.0f;
            rf.o.b(canvas4, q1Var.x3, 1.0f - f19);
            canvas4.restore();
        }
        j(j15);
        canvas4.restore();
        if (f19 >= f20) {
            q1Var.a0(true);
        }
        rh0 rh0Var = q1Var.m3;
        if (rh0Var != null) {
            if ((rh0Var.e || rh0Var.f) && (c5Var = q1Var.J6) != null) {
                canvas4.save();
                canvas4.clipPath(c5Var.o());
                Paint paint4 = q1Var.m3.i;
                jj jjVar = q1Var.O5;
                int V14 = q1Var.V1((jjVar == null || !jjVar.P3() || q1Var.O5.r1) ? org.telegram.ui.ActionBar.t6.Id : org.telegram.ui.ActionBar.t6.Ob);
                org.telegram.ui.ActionBar.t6.j1();
                paint4.setColor(org.telegram.ui.ActionBar.t6.r1(0.2f, V14));
                q1Var.m3.c(canvas, q1Var.n0, q1Var.t0, c5Var.getBounds(), q1Var.M1(true));
                canvas.restore();
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.a.O4;
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((p1) arrayList.get(i10)).w.setState(StateSet.NOTHING);
            }
        }
        kh.a aVar = this.l;
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
    public final void i(jj jjVar, boolean z10) {
        boolean z11;
        float f7;
        String K0;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        CharSequence charSequence;
        float f10;
        boolean z17;
        boolean z18;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        sg.p0 p0Var;
        boolean z19;
        int i11;
        int i12;
        CharSequence charSequence2;
        int i13;
        int i14;
        Object obj;
        Object obj2;
        int i15;
        p1 p1Var;
        Boolean bool;
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        CharSequence charSequence3;
        int L;
        sg.p0 p0Var2;
        ArrayList arrayList3;
        Object obj3;
        Object obj4;
        byte[] bArr2;
        boolean z20;
        boolean z21;
        CharSequence charSequence4;
        int i16;
        int i17;
        CharSequence charSequence5;
        int i18;
        p1 p1Var2;
        boolean z22;
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        p1 p1Var3;
        boolean z23;
        ArrayList arrayList4;
        int i19;
        byte[] bArr3;
        int i20;
        int i21;
        boolean z24;
        boolean z25;
        TLRPC.Message message;
        q10 q10Var;
        TLRPC.PollResults pollResults;
        CharSequence ellipsize;
        int currentTime;
        TLRPC.Message message2;
        q10 q10Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String K02;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        int i22;
        boolean z26;
        int i23;
        jj jjVar2 = jjVar;
        q1 q1Var = this.a;
        sg.p0 p0Var3 = q1Var.N;
        ArrayList arrayList5 = q1Var.O4;
        int i24 = q1Var.Y5;
        if (q1Var.k5 == null) {
            q1Var.k5 = new h11();
        }
        q1Var.W4 = false;
        q1Var.z0(0);
        q1Var.h9 = true;
        q1Var.q9 = !q1Var.s6;
        q1Var.M1 = false;
        int min = Math.min(org.telegram.messenger.i0.L(500.0f), jjVar2.m1());
        q1Var.Z6 = org.telegram.messenger.i0.L(31.0f) + min;
        TLRPC.MessageMedia o12 = jj.o1(jjVar2.k);
        boolean z27 = o12 instanceof TLRPC.TL_messageMediaPoll;
        if (z27) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) o12;
            TLRPC.Poll poll = tL_messageMediaPoll2.poll;
            boolean z28 = poll.quiz;
            z14 = poll.public_voters;
            boolean z29 = poll.multiple_choice;
            int i25 = tL_messageMediaPoll2.results.total_voters;
            this.H = poll.close_date - ConnectionsManager.getInstance(i24).getCurrentTime() < 60 ? 0.0f : 1.0f;
            TLRPC.Poll poll2 = tL_messageMediaPoll2.poll;
            boolean z30 = poll2.closed;
            q1Var.V4 = z30;
            z11 = z27;
            q1Var.W4 = jjVar2.K0;
            this.v = poll2.hide_results_until_close;
            TLRPC.TL_textWithEntities tL_textWithEntities4 = poll2.question;
            if (z30) {
                K02 = cd.K0(2131750696);
            } else if (poll2.quiz) {
                K02 = cd.K0(poll2.public_voters ? 2131746460 : 2131754248);
            } else {
                K02 = poll2.public_voters ? cd.K0(2131746603) : cd.K0(2131754249);
            }
            K0 = K02;
            q1Var.h5 = tL_messageMediaPoll2.poll;
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll2.results;
            q1Var.i5 = pollResults2.results;
            q1Var.j5 = pollResults2.total_voters;
            CharSequence charSequence6 = jjVar2.A;
            this.d = charSequence6;
            if (charSequence6 == null && !TextUtils.isEmpty(pollResults2.solution)) {
                jjVar2.l0();
                this.d = jjVar2.A;
            }
            if (this.d != null) {
                if (this.h == null) {
                    this.h = q1Var.getContext().getResources().getDrawable(R.drawable.msg_close).mutate();
                }
                int L2 = q1Var.Z6 - org.telegram.messenger.i0.L(38.0f);
                this.e = L2 - org.telegram.messenger.i0.L(18.0f);
                this.f = 0;
                TLRPC.PollResults pollResults3 = tL_messageMediaPoll2.results;
                if (pollResults3 == null || pollResults3.solution_media == null) {
                    tL_textWithEntities3 = tL_textWithEntities4;
                    i22 = i25;
                    i23 = L2;
                    z26 = z28;
                    z15 = z29;
                    f7 = 1.0f;
                } else {
                    if (this.n == null) {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i22 = i25;
                        this.n = new ih.h(i24, q1Var, q1Var.Ob, true);
                    } else {
                        tL_textWithEntities3 = tL_textWithEntities4;
                        i22 = i25;
                    }
                    z26 = z28;
                    i23 = L2;
                    z15 = z29;
                    f7 = 1.0f;
                    this.n.o(jjVar2, tL_messageMediaPoll2.results.solution_media, jjVar, i23, ih.g.c(-3, jjVar2.k), !z10);
                    ih.h hVar = this.n;
                    if (hVar.S) {
                        this.f = hVar.h(i23);
                    }
                    if (q1Var.N0) {
                        this.n.a();
                    }
                }
                this.c = new StaticLayout(TextUtils.ellipsize(cd.K0(2131746461), org.telegram.ui.ActionBar.t6.Y2, min - org.telegram.messenger.i0.L(30.0f), TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.t6.Y2, min - org.telegram.messenger.i0.L(30.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                hj hjVar = new hj(jjVar2, this.d, org.telegram.ui.ActionBar.t6.a3, i23 - org.telegram.messenger.i0.L(11.0f));
                q1Var.o3 = hjVar;
                int L3 = org.telegram.messenger.i0.L(37.0f) + hjVar.b();
                int i26 = this.f;
                this.g = L3 + (i26 > 0 ? i26 + org.telegram.messenger.i0.L(14.0f) : 0);
                z12 = false;
                q1Var.Ca = org.telegram.ui.Components.o5.update(0, (View) q1Var, false, q1Var.Ca, (ArrayList<gj>) q1Var.o3.e);
            } else {
                tL_textWithEntities3 = tL_textWithEntities4;
                i22 = i25;
                z26 = z28;
                z15 = z29;
                z12 = false;
                f7 = 1.0f;
            }
            tL_textWithEntities = tL_textWithEntities3;
            i10 = i22;
            z13 = z26;
        } else {
            z11 = z27;
            f7 = 1.0f;
            this.H = 1.0f;
            q1Var.V4 = false;
            this.v = false;
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) o12).todo;
            TLRPC.TL_textWithEntities tL_textWithEntities5 = todoList.title;
            K0 = cd.K0((!todoList.others_can_complete || jjVar2.A0() == d20.i(i24).e()) ? 2131748483 : 2131748603);
            tL_textWithEntities = tL_textWithEntities5;
            i10 = 0;
            z12 = true;
            z13 = false;
            z14 = true;
            z15 = true;
        }
        String str = K0;
        if (jjVar2.J2 && (message2 = jjVar2.k) != null && (q10Var2 = message2.translatedPoll) != null && (tL_textWithEntities2 = q10Var2.a) != null) {
            tL_textWithEntities = tL_textWithEntities2;
        }
        this.s = false;
        this.t = false;
        this.u = false;
        q1Var.U4 = jjVar2.V4();
        this.w = jjVar2.E2();
        float f11 = f7;
        this.x = v7.u7.a(ih.j.a(jjVar2), 7);
        if (q1Var.U4) {
            jjVar2.v1.clear();
        }
        boolean z31 = z12;
        CharSequence l4 = org.telegram.messenger.k6.l(new SpannableStringBuilder(tL_textWithEntities.text), org.telegram.ui.ActionBar.t6.O2.getFontMetricsInt(), false);
        ArrayList<TLRPC.MessageEntity> arrayList6 = tL_textWithEntities.entities;
        if (arrayList6 != null) {
            z16 = z13;
            Spannable A5 = jj.A5(l4, arrayList6, org.telegram.ui.ActionBar.t6.O2.getFontMetricsInt(), true);
            jj.a(A5, tL_textWithEntities.entities, q1Var.O5.P3(), false, false);
            charSequence = A5;
        } else {
            z16 = z13;
            charSequence = l4;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, org.telegram.ui.ActionBar.t6.O2, (org.telegram.messenger.i0.L(2.0f) + min) - (q1Var.getExtraTextX() * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        q1Var.m2 = staticLayout;
        q1Var.Ba = org.telegram.ui.Components.o5.update(0, (View) q1Var, false, q1Var.Ba, staticLayout);
        StaticLayout staticLayout2 = q1Var.m2;
        if (staticLayout2 != null) {
            int lineCount = staticLayout2.getLineCount();
            for (int i27 = 0; i27 < lineCount; i27++) {
                f10 = 0.0f;
                if (q1Var.m2.getLineLeft(i27) > 0.0f) {
                    z17 = true;
                    break;
                }
            }
        }
        f10 = 0.0f;
        z17 = false;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(str, org.telegram.ui.ActionBar.t6.T2, min, truncateAt), org.telegram.ui.ActionBar.t6.T2, (org.telegram.messenger.i0.L(2.0f) + min) - (q1Var.getExtraTextX() * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        q1Var.c3 = staticLayout3;
        if (staticLayout3.getLineCount() > 0) {
            if (z17 && !cd.X) {
                q1Var.e3 = (int) Math.ceil(r6 - q1Var.c3.getLineWidth(0));
            } else if (z17 || !cd.X) {
                q1Var.e3 = 0;
            } else {
                q1Var.e3 = -((int) Math.ceil(q1Var.c3.getLineLeft(0)));
            }
        }
        int L4 = min - org.telegram.messenger.i0.L(jjVar2.P3() ? 28.0f : 8.0f);
        if (q1Var.h6) {
            z18 = z14;
        } else {
            TextPaint textPaint = (z14 || z15) ? org.telegram.ui.ActionBar.t6.I2 : org.telegram.ui.ActionBar.t6.F2;
            if (z31) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) o12;
                ellipsize = (q1Var.O5.P3() || q1Var.O5.A0() < 0 || tL_messageMediaToDo2.todo.others_can_complete) ? cd.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompleted", Integer.valueOf(jj.z0(tL_messageMediaToDo2))) : cd.J(tL_messageMediaToDo2.todo.list.size(), "TodoCompletedBy", Integer.valueOf(jj.z0(tL_messageMediaToDo2)), org.telegram.messenger.o5.l(d20.s0, q1Var.O5.Z0()));
            } else if (z16) {
                ellipsize = TextUtils.ellipsize(i10 == 0 ? cd.K0(2131748145) : cd.G(i10, "Answer", new Object[0]), textPaint, L4, truncateAt);
            } else {
                ellipsize = TextUtils.ellipsize(i10 == 0 ? cd.K0(2131748146) : cd.G(i10, "Vote", new Object[0]), textPaint, L4, truncateAt);
            }
            if (!q1Var.V4 && z11) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll3 = (TLRPC.TL_messageMediaPoll) o12;
                int i28 = tL_messageMediaPoll3.poll.close_date;
                if (i28 > 0 && (currentTime = i28 - ConnectionsManager.getInstance(i24).getCurrentTime()) > 0) {
                    TLRPC.Poll poll3 = tL_messageMediaPoll3.poll;
                    boolean z32 = poll3.hide_results_until_close && !poll3.creator;
                    if (this.j == null) {
                        this.j = new rf.m(new ag.w0(6, this, z32));
                    }
                    z18 = z14;
                    this.j.a(currentTime);
                    if (q1Var.x3 == null) {
                        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
                        q1Var.x3 = e6Var;
                        e6Var.setCallback(q1Var);
                        org.telegram.ui.Components.e6 e6Var2 = q1Var.x3;
                        e6Var2.b = 17;
                        e6Var2.M = org.telegram.messenger.i0.q.x;
                    }
                    q1Var.x3.w(org.telegram.messenger.i0.L(11.0f));
                    q1Var.x3.u(((z18 || z15) ? org.telegram.ui.ActionBar.t6.I2 : org.telegram.ui.ActionBar.t6.F2).getColor());
                    q1Var.x3.t(cd.M(currentTime, z32), !z10, true);
                    if (q1Var.w3 == null) {
                        org.telegram.ui.Components.e6 e6Var3 = new org.telegram.ui.Components.e6(false, true, true);
                        q1Var.w3 = e6Var3;
                        e6Var3.setCallback(q1Var);
                        org.telegram.ui.Components.e6 e6Var4 = q1Var.w3;
                        e6Var4.b = 17;
                        e6Var4.M = org.telegram.messenger.i0.q.x;
                    }
                    q1Var.w3.w(org.telegram.messenger.i0.L(13.0f));
                    q1Var.w3.u(((!z18 || z15) ? org.telegram.ui.ActionBar.t6.I2 : org.telegram.ui.ActionBar.t6.F2).getColor());
                    q1Var.w3.t(ellipsize, !z10, true);
                    q1Var.v3 = null;
                }
            }
            z18 = z14;
            rf.m mVar = this.j;
            if (mVar != null) {
                mVar.b();
            }
            q1Var.x3 = null;
            if (q1Var.w3 == null) {
            }
            q1Var.w3.w(org.telegram.messenger.i0.L(13.0f));
            q1Var.w3.u(((!z18 || z15) ? org.telegram.ui.ActionBar.t6.I2 : org.telegram.ui.ActionBar.t6.F2).getColor());
            q1Var.w3.t(ellipsize, !z10, true);
            q1Var.v3 = null;
        }
        q1Var.T2(jjVar2);
        e(z31 ? 30 : vp.r1(i24).y7.G.b0());
        if (!z11 || (pollResults = ((TLRPC.TL_messageMediaPoll) o12).results) == null) {
            org.telegram.ui.Components.w8 w8Var = this.I;
            if (w8Var != null) {
                w8Var.d(null, false);
            }
        } else {
            org.telegram.ui.Components.w8 w8Var2 = this.I;
            if (w8Var2 != null) {
                w8Var2.d(pollResults.recent_voters, !z10);
            }
        }
        if (!this.B && q1Var.X4 && q1Var.Y4) {
            try {
                q1Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
        boolean z33 = q1Var.N0 && (q1Var.X4 || q1Var.Z4);
        this.B = z33;
        this.C = z33 && z11;
        ArrayList arrayList7 = q1Var.N4;
        ArrayList arrayList8 = new ArrayList();
        if (arrayList5.isEmpty()) {
            arrayList = arrayList7;
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(arrayList5);
            int size = arrayList5.size();
            int i29 = 0;
            while (i29 < size) {
                Object obj5 = arrayList5.get(i29);
                i29++;
                p1 p1Var4 = (p1) obj5;
                p1Var4.b();
                q1 q1Var2 = p1Var4.E;
                org.telegram.ui.Components.o5.release(q1Var2, p1Var4.r);
                p1Var4.r = null;
                org.telegram.ui.Components.o5.release(q1Var2, p1Var4.B);
                p1Var4.B = null;
            }
            arrayList5.clear();
            if (!this.B) {
                this.B = q1Var.N0 && (q1Var.U4 || q1Var.V4 || q1Var.W4);
            }
            float f12 = this.r;
            if (f12 > f10 && f12 < f11) {
                int size2 = arrayList2.size();
                for (int i30 = 0; i30 < size2; i30++) {
                    p1 p1Var5 = (p1) arrayList2.get(i30);
                    int i31 = p1Var5.f;
                    p1Var5.d = (int) Math.ceil(((p1Var5.d - i31) * this.r) + i31);
                    float f13 = p1Var5.h;
                    p1Var5.g = ((p1Var5.g - f13) * this.r) + f13;
                }
            }
            arrayList = arrayList2;
        }
        this.r = this.B ? f10 : f11;
        if (this.C) {
            bArr = null;
        } else {
            q1Var.X4 = false;
            q1Var.b5 = -1;
            qz C = qz.C(i24);
            jj jjVar3 = q1Var.O5;
            bArr = jjVar3 == null ? null : (byte[]) C.w.get("poll_" + jjVar3.E1());
        }
        int i32 = jjVar2.J0 ? this.g : 0;
        StaticLayout staticLayout4 = q1Var.m2;
        int height = i32 + (staticLayout4 != null ? staticLayout4.getHeight() : 0);
        if (z11) {
            q1Var.u1 = true;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll4 = (TLRPC.TL_messageMediaPoll) o12;
            if (tL_messageMediaPoll4.attached_media != null) {
                if (this.m == null) {
                    ih.h hVar2 = new ih.h(i24, q1Var, q1Var.Ob, false);
                    this.m = hVar2;
                    hVar2.b.L0(q1Var.S0);
                }
                int L5 = ((q1Var.Z6 - org.telegram.messenger.i0.L(13.0f)) - org.telegram.messenger.i0.L(2.0f)) - org.telegram.messenger.i0.L(2.0f);
                p0Var = p0Var3;
                arrayList3 = arrayList2;
                obj3 = org.telegram.ui.Components.o5.class;
                obj4 = org.telegram.messenger.h6.class;
                this.m.o(jjVar2, tL_messageMediaPoll4.attached_media, jjVar, L5, ih.g.c(-2, jjVar2.k), !z10);
                ih.h hVar3 = this.m;
                if (hVar3.S) {
                    this.o = L5;
                    int h = hVar3.h(L5);
                    this.p = h;
                    int L6 = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.i0.L(4.0f) + h;
                    this.q = L6;
                    height += L6;
                }
                if (q1Var.N0) {
                    this.m.a();
                }
            } else {
                arrayList3 = arrayList2;
                obj3 = org.telegram.ui.Components.o5.class;
                p0Var = p0Var3;
                obj4 = org.telegram.messenger.h6.class;
            }
            sf.d.b(tL_messageMediaPoll4.poll, d20.i(i24).e());
            TLRPC.Poll poll4 = tL_messageMediaPoll4.poll;
            ArrayList<TLRPC.PollAnswer> arrayList9 = poll4.shuffled_answers;
            if (arrayList9 == null) {
                arrayList9 = poll4.answers;
            }
            ArrayList<TLRPC.PollAnswer> arrayList10 = arrayList9;
            int size3 = poll4.answers.size();
            int i33 = 0;
            while (true) {
                if (i33 >= size3) {
                    break;
                }
                if (tL_messageMediaPoll4.poll.answers.get(i33).media != null) {
                    this.u = true;
                    break;
                }
                i33++;
            }
            int size4 = arrayList10.size();
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll5 = tL_messageMediaPoll4;
            byte[] bArr4 = bArr;
            int i34 = height;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            boolean z34 = false;
            int i38 = 100;
            int i39 = 0;
            while (i35 < size4) {
                int i40 = size4;
                TLRPC.PollAnswer pollAnswer = arrayList10.get(i35);
                int i41 = i35;
                jj jjVar4 = q1Var.O5;
                int i42 = i36;
                if (!jjVar4.J2 || (message = jjVar4.k) == null || (q10Var = message.translatedPoll) == null) {
                    bArr2 = bArr4;
                } else {
                    ArrayList arrayList11 = q10Var.b;
                    int size5 = arrayList11.size();
                    bArr2 = bArr4;
                    int i43 = 0;
                    while (i43 < size5) {
                        Object obj6 = arrayList11.get(i43);
                        i43++;
                        ArrayList arrayList12 = arrayList11;
                        TLRPC.PollAnswer pollAnswer2 = (TLRPC.PollAnswer) obj6;
                        int i44 = size5;
                        if (Arrays.equals(pollAnswer2.option, pollAnswer.option)) {
                            pollAnswer = pollAnswer2;
                            z20 = true;
                            break;
                        } else {
                            size5 = i44;
                            arrayList11 = arrayList12;
                        }
                    }
                }
                z20 = false;
                int i45 = i39;
                CharSequence n10 = org.telegram.messenger.k6.n(new SpannableStringBuilder(pollAnswer.text.text), org.telegram.ui.ActionBar.t6.O2.getFontMetricsInt(), false, null, 0, 1.0f, i45);
                ArrayList<TLRPC.MessageEntity> arrayList13 = pollAnswer.text.entities;
                if (arrayList13 != null) {
                    Spannable B5 = jj.B5(n10, arrayList13, org.telegram.ui.ActionBar.t6.P2.getFontMetricsInt(), true, 1.2f, i45);
                    z21 = z20;
                    i16 = i37;
                    i17 = 0;
                    jj.a(B5, pollAnswer.text.entities, q1Var.O5.P3(), false, false);
                    charSequence4 = B5;
                } else {
                    z21 = z20;
                    charSequence4 = n10;
                    i16 = i37;
                    i17 = 0;
                }
                if (charSequence4 instanceof Spannable) {
                    Spannable spannable = (Spannable) charSequence4;
                    charSequence5 = charSequence4;
                    i18 = ((org.telegram.ui.Components.o5[]) spannable.getSpans(i17, charSequence5.length(), obj3)).length + ((org.telegram.messenger.h6[]) spannable.getSpans(i17, charSequence4.length(), obj4)).length;
                } else {
                    charSequence5 = charSequence4;
                    i18 = 0;
                }
                i39 = i45 + i18;
                if (arrayList != null) {
                    for (int i46 = 0; i46 < arrayList.size(); i46++) {
                        TLRPC.PollAnswer pollAnswer3 = ((p1) arrayList.get(i46)).s;
                        if (pollAnswer3 == pollAnswer || (pollAnswer3 != null && Arrays.equals(((p1) arrayList.get(i46)).s.option, pollAnswer.option))) {
                            p1Var2 = (p1) arrayList.get(i46);
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
                    int V1 = q1Var.V1(org.telegram.ui.ActionBar.t6.i6);
                    p1Var6.v = V1;
                    p1Var6.w = org.telegram.ui.ActionBar.t6.a0(V1, 0, 0);
                }
                if (p1Var2 != null) {
                    p1Var6.x = p1Var2.x;
                    p1Var2.x = null;
                }
                if (p1Var6.x == null) {
                    p1Var6.x = new kh.b(i24, q1Var);
                }
                String c10 = ih.g.c(pollAnswer.unshuffled_index, jjVar2.k);
                p1Var6.x.f(this.u);
                boolean z35 = z21;
                Object obj7 = obj4;
                p1 p1Var7 = p1Var2;
                byte[] bArr5 = bArr2;
                Object obj8 = obj3;
                int i47 = i24;
                int i48 = i16;
                ArrayList<TLRPC.PollAnswer> arrayList14 = arrayList10;
                int i49 = i42;
                ArrayList arrayList15 = arrayList;
                TLRPC.PollAnswer pollAnswer4 = pollAnswer;
                jjVar2 = jjVar;
                p1Var6.x.h(jjVar2, pollAnswer.media, jjVar, c10, !z10);
                if (q1Var.N0) {
                    p1Var6.a();
                }
                p1Var6.w.setCallback(q1Var);
                p1Var6.s = pollAnswer4;
                StaticLayout staticLayout5 = new StaticLayout(charSequence5, org.telegram.ui.ActionBar.t6.P2, min - org.telegram.messenger.i0.L((this.u ? 48 : 0) + 48), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                p1Var6.p = staticLayout5;
                p1Var6.o = false;
                p1Var6.r = org.telegram.ui.Components.o5.update(0, (View) q1Var, false, p1Var6.r, staticLayout5);
                p1Var6.b = org.telegram.messenger.i0.L(52.0f) + i34;
                p1Var6.c = p1Var6.p.getHeight();
                p1Var6.u = z35;
                if (p1Var7 != null && p1Var7.u != z35) {
                    StaticLayout staticLayout6 = p1Var7.p;
                    p1Var6.A = staticLayout6;
                    p1Var6.B = org.telegram.ui.Components.o5.update(0, (View) q1Var, false, p1Var6.B, staticLayout6);
                    p1Var6.C = p1Var7.b;
                    p1Var6.D = p1Var7.c;
                }
                arrayList5.add(p1Var6);
                arrayList8.add(p1Var6);
                int C2 = org.telegram.messenger.m5.C(26.66f, p1Var6.c, i34);
                int lineCount2 = p1Var6.p.getLineCount();
                float lineWidth = lineCount2 > 0 ? p1Var6.p.getLineWidth(lineCount2 - 1) : 0.0f;
                if (lineCount2 > 0 && p1Var6.p.getParagraphDirection(0) == -1) {
                    z22 = true;
                    float L7 = (r53 - org.telegram.messenger.i0.L(10.0f)) - lineWidth;
                    tL_messageMediaPoll = tL_messageMediaPoll5;
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        int size6 = tL_messageMediaPoll.results.results.size();
                        int i50 = 0;
                        while (i50 < size6) {
                            int i51 = C2;
                            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i50);
                            int i52 = i50;
                            p1Var3 = p1Var7;
                            if (Arrays.equals(p1Var6.s.option, pollAnswerVoters.option)) {
                                kh.b bVar = p1Var6.x;
                                if (bVar != null) {
                                    boolean z36 = !q1Var.h6 && (q1Var.U4 || q1Var.W4 || q1Var.V4 || (this.x && (!this.v || this.w)));
                                    bVar.D.a(z36, (p1Var3 == null || z10) ? false : true);
                                    kh.b bVar2 = p1Var6.x;
                                    int i53 = pollAnswerVoters.voters;
                                    if (p1Var3 == null || z10) {
                                        z24 = z36;
                                        z25 = false;
                                    } else {
                                        z24 = z36;
                                        z25 = true;
                                    }
                                    bVar2.k(i53, z25);
                                    p1Var6.x.j(pollAnswerVoters.recent_voters, (p1Var3 == null || z10) ? false : true);
                                    float e = p1Var6.x.e();
                                    boolean z37 = z22 && lineCount2 == 1 && L7 - ((float) org.telegram.messenger.i0.L(10.0f)) > e;
                                    p1Var6.o = z37;
                                    if (!z24 || (e <= L7 && (!z22 || z37))) {
                                        i20 = i51;
                                    } else {
                                        p1Var6.c = org.telegram.messenger.i0.L(22.0f) + p1Var6.c;
                                        i20 = org.telegram.messenger.i0.L(22.0f) + i51;
                                    }
                                    z23 = true;
                                } else {
                                    i20 = i51;
                                    z23 = false;
                                }
                                p1Var6.i = pollAnswerVoters.chosen;
                                int i54 = pollAnswerVoters.voters;
                                p1Var6.j = i54;
                                p1Var6.l = pollAnswerVoters.correct;
                                if ((q1Var.U4 || q1Var.V4 || q1Var.W4 || (this.x && (!this.v || this.w))) && (i21 = tL_messageMediaPoll.results.total_voters) > 0) {
                                    float a2 = w7.u.a(i54 / i21, 0.0f, f11) * 100.0f;
                                    int i55 = (int) a2;
                                    p1Var6.d = i55;
                                    p1Var6.e = a2 - i55;
                                } else {
                                    p1Var6.d = 0;
                                    p1Var6.e = 0.0f;
                                }
                                if (i48 == 0) {
                                    i48 = p1Var6.d;
                                } else {
                                    int i56 = p1Var6.d;
                                    if (i56 != 0 && i48 != i56) {
                                        z34 = true;
                                    }
                                }
                                int i57 = p1Var6.d;
                                i38 -= i57;
                                i49 = Math.max(i57, i49);
                                i34 = i20;
                                i36 = i49;
                                if (!z23) {
                                    p1Var6.x.D.a(false, (p1Var3 == null || z10) ? false : true);
                                }
                                arrayList4 = arrayList3;
                                if (arrayList4 != null) {
                                    int size7 = arrayList4.size();
                                    int i58 = 0;
                                    while (true) {
                                        if (i58 >= size7) {
                                            break;
                                        }
                                        p1 p1Var8 = (p1) arrayList4.get(i58);
                                        if (Arrays.equals(p1Var6.s.option, p1Var8.s.option)) {
                                            p1Var6.f = p1Var8.d;
                                            p1Var6.h = p1Var8.g;
                                            p1Var6.k = p1Var8.i;
                                            break;
                                        }
                                        i58++;
                                    }
                                }
                                if (bArr5 != null) {
                                    byte[] bArr6 = p1Var6.s.option;
                                    if (bArr6.length > 0) {
                                        bArr3 = bArr5;
                                        if (Arrays.binarySearch(bArr3, bArr6[0]) >= 0) {
                                            i19 = i41;
                                            q1Var.b5 = i19;
                                            q1Var.X4 = true;
                                            q1Var.Y4 = true;
                                            bArr3 = null;
                                        } else {
                                            i19 = i41;
                                        }
                                        if (!q1Var.U4 && !this.w && this.v) {
                                            q1Var.d7[i19].g(p1Var6.i, false);
                                        } else if (q1Var.O5.v1.contains(p1Var6.s)) {
                                            q1Var.d7[i19].g(false, false);
                                        } else {
                                            q1Var.d7[i19].g(true, false);
                                        }
                                        q1Var.d7[i19].e = 0.85f;
                                        i35 = i19 + 1;
                                        arrayList3 = arrayList4;
                                        tL_messageMediaPoll5 = tL_messageMediaPoll;
                                        bArr4 = bArr3;
                                        i37 = i48;
                                        size4 = i40;
                                        i24 = i47;
                                        arrayList = arrayList15;
                                        obj3 = obj8;
                                        obj4 = obj7;
                                        arrayList10 = arrayList14;
                                        f11 = 1.0f;
                                    }
                                }
                                i19 = i41;
                                bArr3 = bArr5;
                                if (!q1Var.U4) {
                                }
                                if (q1Var.O5.v1.contains(p1Var6.s)) {
                                }
                                q1Var.d7[i19].e = 0.85f;
                                i35 = i19 + 1;
                                arrayList3 = arrayList4;
                                tL_messageMediaPoll5 = tL_messageMediaPoll;
                                bArr4 = bArr3;
                                i37 = i48;
                                size4 = i40;
                                i24 = i47;
                                arrayList = arrayList15;
                                obj3 = obj8;
                                obj4 = obj7;
                                arrayList10 = arrayList14;
                                f11 = 1.0f;
                            } else {
                                i50 = i52 + 1;
                                C2 = i51;
                                p1Var7 = p1Var3;
                                f11 = 1.0f;
                            }
                        }
                    }
                    p1Var3 = p1Var7;
                    i34 = C2;
                    z23 = false;
                    i36 = i49;
                    if (!z23) {
                    }
                    arrayList4 = arrayList3;
                    if (arrayList4 != null) {
                    }
                    if (bArr5 != null) {
                    }
                    i19 = i41;
                    bArr3 = bArr5;
                    if (!q1Var.U4) {
                    }
                    if (q1Var.O5.v1.contains(p1Var6.s)) {
                    }
                    q1Var.d7[i19].e = 0.85f;
                    i35 = i19 + 1;
                    arrayList3 = arrayList4;
                    tL_messageMediaPoll5 = tL_messageMediaPoll;
                    bArr4 = bArr3;
                    i37 = i48;
                    size4 = i40;
                    i24 = i47;
                    arrayList = arrayList15;
                    obj3 = obj8;
                    obj4 = obj7;
                    arrayList10 = arrayList14;
                    f11 = 1.0f;
                }
                z22 = false;
                float L72 = (r53 - org.telegram.messenger.i0.L(10.0f)) - lineWidth;
                tL_messageMediaPoll = tL_messageMediaPoll5;
                if (!tL_messageMediaPoll.results.results.isEmpty()) {
                }
                p1Var3 = p1Var7;
                i34 = C2;
                z23 = false;
                i36 = i49;
                if (!z23) {
                }
                arrayList4 = arrayList3;
                if (arrayList4 != null) {
                }
                if (bArr5 != null) {
                }
                i19 = i41;
                bArr3 = bArr5;
                if (!q1Var.U4) {
                }
                if (q1Var.O5.v1.contains(p1Var6.s)) {
                }
                q1Var.d7[i19].e = 0.85f;
                i35 = i19 + 1;
                arrayList3 = arrayList4;
                tL_messageMediaPoll5 = tL_messageMediaPoll;
                bArr4 = bArr3;
                i37 = i48;
                size4 = i40;
                i24 = i47;
                arrayList = arrayList15;
                obj3 = obj8;
                obj4 = obj7;
                arrayList10 = arrayList14;
                f11 = 1.0f;
            }
            int i59 = i24;
            ArrayList arrayList16 = arrayList;
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll6 = tL_messageMediaPoll5;
            l1 l1Var = q1Var.Qa;
            if (l1Var != null && l1Var.d0() && tL_messageMediaPoll6.poll.open_answers && !q1Var.V4 && !jjVar2.p1 && !jjVar2.j3() && tL_messageMediaPoll6.poll.answers.size() < vp.r1(i59).y7.G.b0()) {
                if (this.l == null) {
                    kh.a aVar = new kh.a(q1Var.getContext(), q1Var.Ob);
                    this.l = aVar;
                    aVar.setCallback(q1Var);
                    aVar.a.setCallback(q1Var);
                }
                this.s = true;
                l1 l1Var2 = q1Var.Qa;
                int f02 = l1Var2 != null ? l1Var2.f0(q1Var) : 0;
                boolean z38 = f02 > 0;
                this.t = z38;
                this.l.d(z38, !z10);
                int max = Math.max(org.telegram.messenger.i0.L(44.33f), f02);
                q1Var.O1 = max;
                i34 += max;
            }
            height = i34;
            int size8 = arrayList16.size();
            int i60 = 0;
            while (i60 < size8) {
                Object obj9 = arrayList16.get(i60);
                i60++;
                p1 p1Var9 = (p1) obj9;
                p1Var9.b();
                p1Var9.x = null;
            }
            b(!z10);
            z19 = z34;
            i11 = i38;
        } else {
            Object obj10 = org.telegram.ui.Components.o5.class;
            Object obj11 = org.telegram.messenger.h6.class;
            p0Var = p0Var3;
            ArrayList arrayList17 = arrayList;
            if (o12 instanceof TLRPC.TL_messageMediaToDo) {
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo3 = (TLRPC.TL_messageMediaToDo) o12;
                int size9 = tL_messageMediaToDo3.todo.list.size();
                int i61 = height;
                int i62 = 0;
                int i63 = 0;
                while (i62 < size9) {
                    TLRPC.TodoItem todoItem = tL_messageMediaToDo3.todo.list.get(i62);
                    int i64 = i63;
                    CharSequence n11 = org.telegram.messenger.k6.n(new SpannableStringBuilder(todoItem.title.text), org.telegram.ui.ActionBar.t6.O2.getFontMetricsInt(), false, null, 0, 1.0f, i64);
                    ArrayList<TLRPC.MessageEntity> arrayList18 = todoItem.title.entities;
                    if (arrayList18 != null) {
                        Spannable B52 = jj.B5(n11, arrayList18, org.telegram.ui.ActionBar.t6.P2.getFontMetricsInt(), true, 1.2f, i64);
                        i12 = 0;
                        jj.a(B52, todoItem.title.entities, q1Var.O5.P3(), false, false);
                        charSequence2 = B52;
                    } else {
                        i12 = 0;
                        charSequence2 = n11;
                    }
                    if (charSequence2 instanceof Spannable) {
                        Spannable spannable2 = (Spannable) charSequence2;
                        obj2 = obj11;
                        i13 = size9;
                        i14 = i62;
                        obj = obj10;
                        i15 = ((org.telegram.ui.Components.o5[]) spannable2.getSpans(i12, charSequence2.length(), obj)).length + ((org.telegram.messenger.h6[]) spannable2.getSpans(i12, charSequence2.length(), obj2)).length;
                    } else {
                        i13 = size9;
                        i14 = i62;
                        obj = obj10;
                        obj2 = obj11;
                        i15 = 0;
                    }
                    i63 = i64 + i15;
                    if (arrayList17 != null) {
                        for (int i65 = 0; i65 < arrayList17.size(); i65++) {
                            p1Var = (p1) arrayList17.get(i65);
                            TLRPC.TodoItem todoItem2 = p1Var.t;
                            if (todoItem2 == todoItem || (todoItem2 != null && todoItem2.id == todoItem.id)) {
                                break;
                            }
                        }
                    }
                    p1Var = null;
                    Boolean F = qz.C(i24).F(jjVar2, todoItem);
                    p1 p1Var10 = new p1(q1Var);
                    p1Var10.q = p1Var != null ? p1Var.q : null;
                    if (p1Var != null) {
                        p1Var10.v = p1Var.v;
                        p1Var10.w = p1Var.w;
                        bool = F;
                    } else {
                        int V12 = q1Var.V1(org.telegram.ui.ActionBar.t6.i6);
                        p1Var10.v = V12;
                        bool = F;
                        p1Var10.w = org.telegram.ui.ActionBar.t6.a0(V12, 0, 0);
                    }
                    p1Var10.w.setCallback(q1Var);
                    if (p1Var != null) {
                        p1Var10.y = p1Var.y;
                        p1Var10.z = p1Var.z;
                        p1Var.y = null;
                        p1Var.z = null;
                    }
                    if (p1Var10.y == null) {
                        p1Var10.y = new org.telegram.ui.Components.r8();
                    }
                    if (p1Var10.z == null) {
                        ImageReceiver imageReceiver = new ImageReceiver(q1Var);
                        p1Var10.z = imageReceiver;
                        imageReceiver.J0(org.telegram.messenger.i0.L(20.0f));
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
                        int i66 = 0;
                        while (i66 < size10) {
                            TLRPC.TodoCompletion todoCompletion = arrayList19.get(i66);
                            int i67 = i66 + 1;
                            ArrayList<TLRPC.TodoCompletion> arrayList20 = arrayList19;
                            TLRPC.TodoCompletion todoCompletion2 = todoCompletion;
                            obj11 = obj2;
                            if (todoCompletion2.id == todoItem.id) {
                                p1Var10.i = true;
                                tL_messageMediaToDo = tL_messageMediaToDo3;
                                TLObject d22 = vp.r1(i24).d2(org.telegram.messenger.o5.o(todoCompletion2.completed_by));
                                p1Var10.y.l(d22);
                                p1Var10.z.i0(d22, p1Var10.y, null);
                                p1Var10.q = new qz0(org.telegram.messenger.o5.m(d22), 12.0f);
                                break;
                            }
                            i66 = i67;
                            arrayList19 = arrayList20;
                            obj2 = obj11;
                        }
                    }
                    obj11 = obj2;
                    tL_messageMediaToDo = tL_messageMediaToDo3;
                    if (bool != null) {
                        p1Var10.i = bool.booleanValue();
                    }
                    if (!p1Var10.i || jjVar2.q()) {
                        charSequence3 = charSequence2;
                    } else {
                        boolean z39 = charSequence2 instanceof SpannableStringBuilder;
                        CharSequence charSequence7 = charSequence2;
                        if (!z39) {
                            charSequence7 = new SpannableStringBuilder(charSequence2);
                        }
                        ((SpannableStringBuilder) charSequence7).setSpan(new StrikethroughSpan(), 0, charSequence7.length(), 33);
                        charSequence3 = charSequence7;
                    }
                    p1Var10.t = todoItem;
                    StaticLayout staticLayout7 = new StaticLayout(charSequence3, org.telegram.ui.ActionBar.t6.P2, min - org.telegram.messenger.i0.L(46.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    p1Var10.p = staticLayout7;
                    p1Var10.r = org.telegram.ui.Components.o5.update(0, (View) q1Var, false, p1Var10.r, staticLayout7);
                    p1Var10.b = org.telegram.messenger.i0.L(52.0f) + i61;
                    p1Var10.c = p1Var10.p.getHeight();
                    p1Var10.u = false;
                    if (p1Var != null && p1Var.u) {
                        StaticLayout staticLayout8 = p1Var.p;
                        p1Var10.A = staticLayout8;
                        p1Var10.B = org.telegram.ui.Components.o5.update(0, (View) q1Var, false, p1Var10.B, staticLayout8);
                        p1Var10.C = p1Var.b;
                        p1Var10.D = p1Var.c;
                    }
                    arrayList5.add(p1Var10);
                    arrayList8.add(p1Var10);
                    i61 = org.telegram.messenger.m5.C(26.66f, p1Var10.c, i61);
                    q1Var.d7[i14].g(p1Var10.i, !z10);
                    q1Var.d7[i14].e = 1.0f;
                    i62 = i14 + 1;
                    tL_messageMediaToDo3 = tL_messageMediaToDo;
                    size9 = i13;
                }
                int size11 = arrayList17.size();
                int i68 = 0;
                while (i68 < size11) {
                    Object obj12 = arrayList17.get(i68);
                    i68++;
                    p1 p1Var11 = (p1) obj12;
                    ImageReceiver imageReceiver2 = p1Var11.z;
                    if (imageReceiver2 != null) {
                        imageReceiver2.R();
                        p1Var11.z = null;
                    }
                }
                height = i61;
            }
            z19 = false;
            i11 = 100;
        }
        g(i11, arrayList8, z19);
        int L8 = q1Var.Z6 - org.telegram.messenger.i0.L(76.0f);
        int size12 = arrayList5.size();
        for (int i69 = 0; i69 < size12; i69++) {
            ((p1) arrayList5.get(i69)).g = Math.max(org.telegram.messenger.i0.L(5.0f) / L8, r6.d / 100);
        }
        q1Var.setMessageObjectInternal(jjVar2);
        this.b = false;
        if (!q1Var.h6 || q1Var.s2) {
            this.b = true;
            L = org.telegram.messenger.i0.L(13.0f) + height;
        } else {
            L = height - org.telegram.messenger.i0.L(10.0f);
        }
        int L9 = org.telegram.messenger.i0.L(73.0f);
        int i70 = q1Var.Sa;
        q1Var.u0 = L9 + i70 + L;
        if (q1Var.I) {
            q1Var.Sa = i70 - org.telegram.messenger.i0.L(1.0f);
        }
        q1Var.C2 = false;
        if (z18 || z15) {
            int i71 = 0;
            int i72 = 0;
            while (i71 < 3) {
                i72 = Math.max(i72, (int) Math.ceil(org.telegram.ui.ActionBar.t6.M2.measureText(i71 == 0 ? cd.K0(2131747125) : i71 == 1 ? cd.K0(2131747171) : cd.K0(2131748146))));
                i71++;
            }
            int extraTimeX = q1Var.getExtraTimeX() + q1Var.y9 + (jjVar2.P3() ? org.telegram.messenger.i0.L(20.0f) : 0);
            p0Var.getClass();
            p0Var2 = p0Var;
            if (p0Var2.p && extraTimeX >= ((q1Var.Z6 - org.telegram.messenger.i0.L(76.0f)) - i72) / 2) {
                q1Var.u0 = org.telegram.messenger.i0.L(18.0f) + q1Var.u0;
                q1Var.C2 = true;
            }
        } else {
            p0Var2 = p0Var;
        }
        p0Var2.getClass();
        if (p0Var2.p) {
            return;
        }
        p0Var2.o(min, 3);
        q1Var.u0 = org.telegram.messenger.m5.C(12.0f, p0Var2.m, q1Var.u0);
        if (q1Var.getExtraTimeX() + q1Var.y9 + (jjVar2.P3() ? org.telegram.messenger.i0.L(20.0f) : 0) >= (q1Var.Z6 - org.telegram.messenger.i0.L(24.0f)) - p0Var2.r) {
            q1Var.u0 = org.telegram.messenger.i0.L(16.0f) + q1Var.u0;
            p0Var2.k -= org.telegram.messenger.i0.L(16.0f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(long j10) {
        org.telegram.ui.Components.w8 w8Var;
        jj jjVar;
        q1 q1Var = this.a;
        ArrayList arrayList = q1Var.O4;
        boolean z10 = true;
        if (q1Var.X4) {
            this.E = (((360 * j10) / 2000.0f) + this.E) - (((int) (r7 / 360.0f)) * 360);
            float f7 = q1Var.f5 + j10;
            q1Var.f5 = f7;
            if (f7 >= 500.0f) {
                q1Var.f5 = 500.0f;
            }
            if (q1Var.e5) {
                q1Var.c5 = (org.telegram.messenger.i0.G.getInterpolation(q1Var.f5 / 500.0f) * 266.0f) + 4.0f;
            } else {
                q1Var.c5 = 4.0f - ((1.0f - org.telegram.messenger.i0.F.getInterpolation(q1Var.f5 / 500.0f)) * (q1Var.d5 ? 360 : zs.t4));
            }
            if (q1Var.f5 == 500.0f) {
                boolean z11 = q1Var.e5;
                if (z11) {
                    this.E += 270.0f;
                    q1Var.c5 = -266.0f;
                }
                q1Var.e5 = !z11;
                if (q1Var.d5) {
                    q1Var.d5 = false;
                }
                q1Var.f5 = 0.0f;
            }
            q1Var.invalidate();
        }
        if (!q1Var.p5 || ((jjVar = q1Var.O5) != null && jjVar.J0)) {
            z10 = false;
        }
        if (z10) {
            float f10 = q1Var.q5;
            if (f10 < 1.0f) {
                float f11 = (j10 / 180.0f) + f10;
                q1Var.q5 = f11;
                if (f11 > 1.0f) {
                    q1Var.q5 = 1.0f;
                }
                q1Var.invalidate();
                if (this.B) {
                    return;
                }
                float f12 = q1Var.P4 + j10;
                q1Var.P4 = f12;
                if (f12 >= 300.0f) {
                    q1Var.P4 = 300.0f;
                }
                float interpolation = org.telegram.messenger.i0.F.getInterpolation(q1Var.P4 / 300.0f);
                this.r = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = 1.0f;
                    this.B = false;
                    this.C = false;
                    q1Var.X4 = false;
                    if (q1Var.Z4 && q1Var.a5 && (w8Var = this.I) != null) {
                        w8Var.d(null, false);
                    }
                    q1Var.Z4 = false;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((p1) arrayList.get(i10)).k = false;
                    }
                }
                q1Var.invalidate();
                return;
            }
        }
        if (!z10) {
            float f13 = q1Var.q5;
            if (f13 > 0.0f) {
                float f14 = f13 - (j10 / 180.0f);
                q1Var.q5 = f14;
                if (f14 < 0.0f) {
                    q1Var.q5 = 0.0f;
                }
                q1Var.invalidate();
            }
        }
        if (this.B) {
        }
    }
}
