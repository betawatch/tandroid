package org.telegram.messenger;

import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.xg0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class ej {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final float d;
    public final ArrayList e = new ArrayList();
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    /* JADX WARN: Can't wrap try/catch for region: R(15:207|(3:208|209|210)|211|(1:213)(12:244|(1:246)|215|216|217|(1:219)(1:241)|220|221|(2:223|(3:225|(5:228|229|(1:234)|231|232)|233))(1:240)|239|(1:238)(5:228|229|(0)|231|232)|233)|214|215|216|217|(0)(0)|220|221|(0)(0)|239|(0)(0)|233) */
    /* JADX WARN: Can't wrap try/catch for region: R(45:112|(1:114)|115|(1:117)(1:369)|118|(1:120)(1:368)|121|(1:123)|124|(1:367)(2:127|(34:129|130|(3:132|(2:(1:337)|338)(1:135)|136)(2:339|(2:351|(7:353|(1:355)(1:365)|356|(1:358)(1:364)|359|(1:361)(1:363)|362))(5:342|(1:344)(1:350)|345|(1:347)(1:349)|348))|137|(3:139|(1:141)(2:331|(1:333)(1:334))|142)(1:335)|143|(1:145)(1:(1:329)(27:330|147|(3:149|(1:303)(4:155|(1:157)(1:302)|158|159)|160)(5:304|(1:306)(8:309|310|311|(3:317|318|(4:320|314|315|316))|313|314|315|316)|307|308|275)|161|(1:167)|168|169|170|(1:174)|175|176|177|178|179|(1:181)|182|(1:184)|185|(3:187|(7:189|190|191|192|193|195|196)|202)|203|(6:205|(17:207|208|209|210|211|(1:213)(12:244|(1:246)|215|216|217|(1:219)(1:241)|220|221|(2:223|(3:225|(5:228|229|(1:234)|231|232)|233))(1:240)|239|(1:238)(5:228|229|(0)|231|232)|233)|214|215|216|217|(0)(0)|220|221|(0)(0)|239|(0)(0)|233)|249|250|(2:(1:253)|254)(1:(1:284))|255)(3:285|(3:287|(1:289)(1:292)|290)(1:293)|291)|256|(1:258)(2:276|(3:278|(1:280)(1:282)|281))|(5:264|(1:266)(4:270|(1:272)|268|269)|267|268|269)|273|274|275))|146|147|(0)(0)|161|(3:163|165|167)|168|169|170|(2:172|174)|175|176|177|178|179|(0)|182|(0)|185|(0)|203|(0)(0)|256|(0)(0)|(7:260|262|264|(0)(0)|267|268|269)|273|274|275))|366|130|(0)(0)|137|(0)(0)|143|(0)(0)|146|147|(0)(0)|161|(0)|168|169|170|(0)|175|176|177|178|179|(0)|182|(0)|185|(0)|203|(0)(0)|256|(0)(0)|(0)|273|274|275|110) */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x059b, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x050e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x050f, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x04f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x04f6, code lost:
    
        if (r8 == 0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x04f8, code lost:
    
        r36.d = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04fc, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
        r14 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05ed A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ej(gj gjVar, CharSequence charSequence, TextPaint textPaint, int i7) {
        int i10;
        int L;
        StaticLayout g52;
        boolean z10;
        float f10;
        float f11;
        float f12;
        CharSequence charSequence2;
        int i11;
        int L2;
        boolean z11;
        float f13;
        int ceil;
        ArrayList arrayList;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        StaticLayout staticLayout;
        TextPaint textPaint2;
        int i13;
        int c10;
        boolean z17;
        int i14;
        CharSequence charSequence3;
        boolean z18;
        int i15;
        ArrayList arrayList2;
        boolean z19;
        float f14;
        boolean z20;
        SpannableString b10;
        int i16;
        StaticLayout staticLayout2;
        int lineCount;
        int i17;
        int ceil2;
        StaticLayout staticLayout3;
        int i18;
        int c11;
        float f15;
        float f16;
        StaticLayout staticLayout4;
        float f17;
        boolean z21;
        int i19;
        int c12;
        int i20;
        float lineLeft;
        StaticLayout staticLayout5;
        int i21;
        TLRPC.Message message;
        CharSequence charSequence4 = charSequence;
        this.a = charSequence4;
        this.c = 0;
        boolean z22 = (gjVar == null || (message = gjVar.k) == null || !message.noforwards) ? false : true;
        if (gjVar != null && !z22) {
            z22 = np.s1(gjVar.K1).A2(gj.B0(gjVar.k));
        }
        boolean z23 = z22;
        boolean z24 = gjVar != null && gjVar.P2() && !gjVar.P3() && textPaint == org.telegram.ui.ActionBar.j6.o2;
        boolean z25 = charSequence4 instanceof Spanned;
        this.f = z25 && ((qi.g[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), qi.g.class)).length > 0;
        this.i = z25 && ((wg0[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), wg0.class)).length > 0;
        this.k = false;
        this.h = false;
        if (z25) {
            Spanned spanned = (Spanned) charSequence4;
            xg0[] xg0VarArr = (xg0[]) spanned.getSpans(0, spanned.length(), xg0.class);
            for (xg0 xg0Var : xg0VarArr) {
                xg0Var.b = false;
            }
            this.k = xg0VarArr.length == 1 && spanned.getSpanStart(xg0VarArr[0]) == 0 && spanned.getSpanEnd(xg0VarArr[0]) == spanned.length();
            qi.g[] gVarArr = (qi.g[]) spanned.getSpans(0, spanned.length(), qi.g.class);
            this.h = gVarArr.length == 1 && spanned.getSpanStart(gVarArr[0]) == 0 && spanned.getSpanEnd(gVarArr[0]) == spanned.length();
        }
        try {
            if (this.k) {
                L = g0.L(32.0f);
            } else {
                if (!this.h) {
                    i10 = i7;
                    g52 = gj.g5(charSequence4, textPaint, i10, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                    if (gjVar != null && gjVar.j2) {
                        i21 = gjVar.D == 0 ? gjVar.z2() ? 7 : 12 : 22;
                        i21 = gjVar.Z4() ? i21 - 8 : i21;
                        if (g52.getLineCount() > i21) {
                            String M0 = hd.M0(2131746371, null);
                            f10 = 15.0f;
                            f11 = 32.0f;
                            boolean z26 = true;
                            z10 = z23;
                            int ceil3 = (int) Math.ceil(textPaint.measureText("… " + M0) + g0.L(1.0f));
                            int i22 = 0;
                            float f18 = 0.0f;
                            while (i22 < i21) {
                                f18 = Math.max(f18, g52.getLineRight(i22));
                                i22++;
                                z26 = z26;
                            }
                            boolean z27 = z26;
                            int i23 = i21 - 1;
                            int lineStart = g52.getLineStart(i23);
                            int lineEnd = g52.getLineEnd(i23) - 1;
                            while (lineEnd >= lineStart && g52.getPrimaryHorizontal(lineEnd) >= f18 - ceil3) {
                                lineEnd--;
                            }
                            while (lineEnd >= lineStart && !Character.isWhitespace(charSequence4.charAt(lineEnd))) {
                                lineEnd--;
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(charSequence4.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) M0);
                            append.setSpan(new hi.q9(2), append.length() - M0.length(), append.length(), 33);
                            try {
                                f12 = 0.0f;
                                g52 = gj.g5(append, textPaint, i10, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                charSequence2 = append;
                                if (this.k) {
                                    L2 = g0.L(f11);
                                } else {
                                    if (!this.h) {
                                        i11 = i10;
                                        int lineCount2 = g52.getLineCount();
                                        z11 = Build.VERSION.SDK_INT < 24;
                                        int i24 = 10;
                                        if (z11) {
                                            f13 = f12;
                                            ceil = (int) Math.ceil(lineCount2 / 10);
                                        } else {
                                            f13 = f12;
                                            ceil = 1;
                                        }
                                        arrayList = new ArrayList();
                                        if (!(charSequence2 instanceof Spanned) && (this.i || this.f)) {
                                            gj.R((Spanned) charSequence2, arrayList);
                                        } else if (!z11 || ceil == 1) {
                                            arrayList.add(new fj(0, g52.getText().length()));
                                        } else {
                                            int i25 = 0;
                                            int i26 = 0;
                                            while (i25 < ceil) {
                                                int min = Math.min(i24, lineCount2 - i26);
                                                int lineStart2 = g52.getLineStart(i26);
                                                int i27 = min + i26;
                                                int lineEnd2 = g52.getLineEnd(i27 - 1);
                                                if (lineEnd2 >= lineStart2) {
                                                    arrayList.add(new fj(lineStart2, lineEnd2));
                                                    i26 = i27;
                                                }
                                                i25++;
                                                i24 = 10;
                                            }
                                        }
                                        int size = arrayList.size();
                                        this.g = false;
                                        this.j = false;
                                        this.k = false;
                                        int i28 = i10;
                                        i12 = 0;
                                        StaticLayout staticLayout6 = g52;
                                        CharSequence charSequence5 = charSequence2;
                                        while (i12 < arrayList.size()) {
                                            dj djVar = new dj();
                                            fj fjVar = (fj) arrayList.get(i12);
                                            boolean z28 = fjVar.d;
                                            String str = fjVar.f;
                                            int i29 = fjVar.a;
                                            int i30 = fjVar.b;
                                            djVar.I = z28;
                                            djVar.J = fjVar.c;
                                            boolean z29 = fjVar.e;
                                            djVar.K = z29;
                                            if (z29) {
                                                djVar.F = gjVar;
                                            }
                                            djVar.c = i12;
                                            djVar.a = i12 == 0;
                                            boolean z30 = i12 == arrayList.size() + (-1);
                                            djVar.b = z30;
                                            if (z30) {
                                                this.j = djVar.J;
                                                this.g = djVar.I;
                                            }
                                            boolean z31 = djVar.a;
                                            if (z31 && z30) {
                                                z12 = z30;
                                                if (djVar.J) {
                                                    z13 = true;
                                                    this.k = z13;
                                                    if (djVar.J) {
                                                        boolean z32 = djVar.I;
                                                        if (z32 && z24) {
                                                            z14 = z10;
                                                            djVar.n(str, z14);
                                                            djVar.f = djVar.g() + (djVar.a ? 0 : g0.L(8.0f));
                                                            djVar.h = g0.L(12.0f) + (djVar.b ? 0 : g0.L(8.0f));
                                                        } else {
                                                            z14 = z10;
                                                            if (z32) {
                                                                djVar.m(i30 - i29, str, z14);
                                                                djVar.f = g0.L(4.0f) + djVar.N + (djVar.a ? 0 : g0.L(5.0f));
                                                                djVar.h = g0.L(4.0f) + (djVar.b ? 0 : g0.L(7.0f)) + (djVar.O ? g0.L(38.0f) : 0);
                                                            }
                                                        }
                                                    } else {
                                                        if (z31 && z12) {
                                                            int L3 = g0.L(6.0f);
                                                            djVar.h = L3;
                                                            djVar.f = L3;
                                                        } else {
                                                            djVar.f = g0.L(z31 ? 8.0f : 6.0f);
                                                            djVar.h = g0.L(7.0f);
                                                        }
                                                        z14 = z10;
                                                    }
                                                    z15 = djVar.I;
                                                    if (z15) {
                                                        z16 = z15;
                                                        staticLayout = staticLayout6;
                                                        textPaint2 = textPaint;
                                                    } else {
                                                        z16 = z15;
                                                        int i31 = i30 - i29;
                                                        staticLayout = staticLayout6;
                                                        textPaint2 = i31 > 220 ? org.telegram.ui.ActionBar.j6.r2 : i31 > 80 ? org.telegram.ui.ActionBar.j6.q2 : org.telegram.ui.ActionBar.j6.p2;
                                                    }
                                                    if (!djVar.J) {
                                                        c10 = g0.L(f11);
                                                    } else if (z16) {
                                                        c10 = djVar.c();
                                                    } else {
                                                        i13 = i11;
                                                        if (size == 1) {
                                                            z17 = z14;
                                                            if (djVar.I && !djVar.J && (staticLayout.getText() instanceof Spannable)) {
                                                                SpannableString b11 = !TextUtils.isEmpty(str) ? qi.j.b(charSequence5.subSequence(i29, i30).toString(), str) : new SpannableString(charSequence5.subSequence(i29, i30));
                                                                djVar.s = i13;
                                                                int i32 = i13;
                                                                staticLayout5 = gj.g5(b11, textPaint2, i32, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                                                i28 = i32;
                                                            } else {
                                                                djVar.s = i28;
                                                                staticLayout5 = staticLayout;
                                                            }
                                                            djVar.e = staticLayout5;
                                                            djVar.n = 0;
                                                            djVar.r = staticLayout5.getText().length();
                                                            djVar.w = staticLayout5.getHeight();
                                                            djVar.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, djVar.w);
                                                            i14 = 0;
                                                            i16 = i28;
                                                            staticLayout2 = staticLayout5;
                                                        } else {
                                                            z17 = z14;
                                                            i14 = 0;
                                                            int i33 = i13;
                                                            if (i30 < i29) {
                                                                charSequence3 = charSequence5;
                                                                z18 = z17;
                                                                i15 = size;
                                                                arrayList2 = arrayList;
                                                                z19 = z24;
                                                                f14 = f13;
                                                            } else {
                                                                djVar.n = i29;
                                                                djVar.r = i30;
                                                                try {
                                                                    if (djVar.I) {
                                                                        try {
                                                                            if (!djVar.J) {
                                                                                b10 = qi.j.b(charSequence5.subSequence(i29, i30).toString(), str);
                                                                                SpannableString spannableString = b10;
                                                                                djVar.s = i33;
                                                                                StaticLayout g53 = gj.g5(spannableString, textPaint2, i33, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                                                                djVar.e = g53;
                                                                                djVar.w = g53.getHeight();
                                                                                djVar.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, djVar.w);
                                                                                i16 = i28;
                                                                                staticLayout2 = staticLayout;
                                                                            }
                                                                        } catch (Exception e10) {
                                                                            e = e10;
                                                                            charSequence3 = charSequence5;
                                                                            z18 = z17;
                                                                            i15 = size;
                                                                            arrayList2 = arrayList;
                                                                            z19 = z24;
                                                                            z20 = true;
                                                                            f14 = f13;
                                                                            a8.g(e, z20);
                                                                            staticLayout6 = staticLayout;
                                                                            i12++;
                                                                            f13 = f14;
                                                                            size = i15;
                                                                            z10 = z18;
                                                                            arrayList = arrayList2;
                                                                            charSequence5 = charSequence3;
                                                                            z24 = z19;
                                                                        }
                                                                    }
                                                                    b10 = SpannableString.valueOf(charSequence5.subSequence(i29, i30));
                                                                    SpannableString spannableString2 = b10;
                                                                    djVar.s = i33;
                                                                    StaticLayout g532 = gj.g5(spannableString2, textPaint2, i33, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                                                    djVar.e = g532;
                                                                    djVar.w = g532.getHeight();
                                                                    djVar.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, djVar.w);
                                                                    i16 = i28;
                                                                    staticLayout2 = staticLayout;
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    charSequence3 = charSequence5;
                                                                    z18 = z17;
                                                                    i15 = size;
                                                                    arrayList2 = arrayList;
                                                                    z19 = z24;
                                                                    f14 = f13;
                                                                    z20 = true;
                                                                }
                                                            }
                                                            staticLayout6 = staticLayout;
                                                            i12++;
                                                            f13 = f14;
                                                            size = i15;
                                                            z10 = z18;
                                                            arrayList = arrayList2;
                                                            charSequence5 = charSequence3;
                                                            z24 = z19;
                                                        }
                                                        if (djVar.I && (djVar.e.getText() instanceof Spannable) && TextUtils.isEmpty(str)) {
                                                            qi.j.c((Spannable) djVar.e.getText(), djVar.e.getText().length(), str);
                                                        }
                                                        this.e.add(djVar);
                                                        lineCount = djVar.e.getLineCount();
                                                        lineLeft = djVar.e.getLineLeft(lineCount - 1);
                                                        if (i12 == 0 && lineLeft >= f13) {
                                                            this.d = lineLeft;
                                                        }
                                                        float f19 = lineLeft;
                                                        float f20 = djVar.e.getLineWidth(lineCount - 1);
                                                        z18 = z17;
                                                        i15 = size;
                                                        int ceil4 = (int) Math.ceil(f20);
                                                        ceil4 = ceil4 > i11 + 80 ? i11 : ceil4;
                                                        i17 = i15 - 1;
                                                        if (i12 == i17) {
                                                            this.b = ceil4;
                                                        }
                                                        float f21 = ceil4;
                                                        int i34 = i16;
                                                        arrayList2 = arrayList;
                                                        ceil2 = (int) Math.ceil(Math.max(0.0f, f19) + f21);
                                                        if (djVar.J) {
                                                            djVar.E = 0.0f;
                                                            int i35 = i14;
                                                            while (i35 < lineCount) {
                                                                try {
                                                                    i20 = ceil4;
                                                                    try {
                                                                        djVar.E = Math.max(djVar.E, djVar.e.getLineRight(i35));
                                                                    } catch (Exception unused) {
                                                                        djVar.E = this.c;
                                                                        i35++;
                                                                        ceil4 = i20;
                                                                    }
                                                                } catch (Exception unused2) {
                                                                    i20 = ceil4;
                                                                }
                                                                i35++;
                                                                ceil4 = i20;
                                                            }
                                                        }
                                                        int i36 = ceil4;
                                                        if (lineCount > 1) {
                                                            int i37 = ceil2;
                                                            int i38 = i14;
                                                            int i39 = i36;
                                                            float f22 = 0.0f;
                                                            float f23 = 0.0f;
                                                            int i40 = i38;
                                                            CharSequence charSequence6 = charSequence5;
                                                            while (i38 < lineCount) {
                                                                CharSequence charSequence7 = charSequence6;
                                                                try {
                                                                    f15 = djVar.e.getLineWidth(i38);
                                                                } catch (Exception unused3) {
                                                                    f15 = 0.0f;
                                                                }
                                                                if (djVar.J) {
                                                                    c12 = g0.L(f11);
                                                                } else {
                                                                    c12 = djVar.I ? djVar.c() : c12;
                                                                    float f24 = djVar.e.getLineLeft(i38);
                                                                    float f25 = f24;
                                                                    if (f15 <= i11 + 20) {
                                                                        f16 = i11;
                                                                        staticLayout4 = staticLayout2;
                                                                        f17 = 0.0f;
                                                                    } else {
                                                                        f16 = f15;
                                                                        staticLayout4 = staticLayout2;
                                                                        f17 = f25;
                                                                    }
                                                                    int i41 = lineCount;
                                                                    if (f17 > 0.0f) {
                                                                        z21 = z24;
                                                                        if (djVar.e.getParagraphDirection(i38) != -1) {
                                                                            djVar.x = (byte) (djVar.x | 2);
                                                                            i19 = 1;
                                                                            if (i40 != 0 && f17 == 0.0f) {
                                                                                try {
                                                                                    if (djVar.e.getParagraphDirection(i38) != i19) {
                                                                                    }
                                                                                } catch (Exception unused4) {
                                                                                }
                                                                                i40 = 1;
                                                                            }
                                                                            f22 = Math.max(f22, f16);
                                                                            float f26 = f17 + f16;
                                                                            f23 = Math.max(f23, f26);
                                                                            i39 = Math.max(i39, (int) Math.ceil(f16));
                                                                            i37 = Math.max(i37, (int) Math.ceil(f26));
                                                                            i38++;
                                                                            charSequence6 = charSequence7;
                                                                            staticLayout2 = staticLayout4;
                                                                            lineCount = i41;
                                                                            z24 = z21;
                                                                        }
                                                                    } else {
                                                                        z21 = z24;
                                                                    }
                                                                    this.d = Math.min(this.d, f17);
                                                                    i19 = 1;
                                                                    djVar.x = (byte) (djVar.x | 1);
                                                                    if (i40 != 0) {
                                                                        if (djVar.e.getParagraphDirection(i38) != i19) {
                                                                        }
                                                                        i40 = 1;
                                                                    }
                                                                    f22 = Math.max(f22, f16);
                                                                    float f262 = f17 + f16;
                                                                    f23 = Math.max(f23, f262);
                                                                    i39 = Math.max(i39, (int) Math.ceil(f16));
                                                                    i37 = Math.max(i37, (int) Math.ceil(f262));
                                                                    i38++;
                                                                    charSequence6 = charSequence7;
                                                                    staticLayout2 = staticLayout4;
                                                                    lineCount = i41;
                                                                    z24 = z21;
                                                                }
                                                                f15 += c12;
                                                                float f242 = djVar.e.getLineLeft(i38);
                                                                float f252 = f242;
                                                                if (f15 <= i11 + 20) {
                                                                }
                                                                int i412 = lineCount;
                                                                if (f17 > 0.0f) {
                                                                }
                                                                this.d = Math.min(this.d, f17);
                                                                i19 = 1;
                                                                djVar.x = (byte) (djVar.x | 1);
                                                                if (i40 != 0) {
                                                                }
                                                                f22 = Math.max(f22, f16);
                                                                float f2622 = f17 + f16;
                                                                f23 = Math.max(f23, f2622);
                                                                i39 = Math.max(i39, (int) Math.ceil(f16));
                                                                i37 = Math.max(i37, (int) Math.ceil(f2622));
                                                                i38++;
                                                                charSequence6 = charSequence7;
                                                                staticLayout2 = staticLayout4;
                                                                lineCount = i412;
                                                                z24 = z21;
                                                            }
                                                            charSequence3 = charSequence6;
                                                            staticLayout3 = staticLayout2;
                                                            z19 = z24;
                                                            if (i40 != 0) {
                                                                if (i12 == i17) {
                                                                    this.b = ceil2;
                                                                }
                                                                f22 = f23;
                                                            } else if (i12 == i17) {
                                                                this.b = i39;
                                                            }
                                                            this.c = Math.max(this.c, (int) Math.ceil(f22));
                                                            ceil2 = i37;
                                                            f14 = 0.0f;
                                                        } else {
                                                            charSequence3 = charSequence5;
                                                            staticLayout3 = staticLayout2;
                                                            z19 = z24;
                                                            f14 = 0.0f;
                                                            if (f19 > 0.0f) {
                                                                float min2 = Math.min(this.d, f19);
                                                                this.d = min2;
                                                                i18 = min2 == 0.0f ? (int) (f21 + f19) : i36;
                                                                djVar.x = (byte) (djVar.x | 1);
                                                            } else {
                                                                djVar.x = (byte) (djVar.x | 2);
                                                                i18 = i36;
                                                            }
                                                            this.c = Math.max(this.c, Math.min(i11, i18));
                                                        }
                                                        if (djVar.V) {
                                                            this.c = Math.max(this.c, i11);
                                                        } else {
                                                            oy0 oy0Var = djVar.M;
                                                            if (oy0Var != null) {
                                                                this.c = (int) Math.max(this.c, Math.min(oy0Var.c + g0.L(f10), djVar.e == null ? f14 : r5.getWidth()));
                                                            }
                                                        }
                                                        if (gjVar != null && !gjVar.N0 && !gjVar.K2) {
                                                            if (djVar.J) {
                                                                c11 = djVar.I ? djVar.c() : c11;
                                                                xh.f.b(null, djVar.e, -1, ceil2, null, djVar.y);
                                                            } else {
                                                                c11 = g0.L(f11);
                                                            }
                                                            ceil2 -= c11;
                                                            xh.f.b(null, djVar.e, -1, ceil2, null, djVar.y);
                                                        }
                                                        i28 = i34;
                                                        staticLayout6 = staticLayout3;
                                                        i12++;
                                                        f13 = f14;
                                                        size = i15;
                                                        z10 = z18;
                                                        arrayList = arrayList2;
                                                        charSequence5 = charSequence3;
                                                        z24 = z19;
                                                    }
                                                    i13 = i11 - c10;
                                                    if (size == 1) {
                                                    }
                                                    if (djVar.I) {
                                                        qi.j.c((Spannable) djVar.e.getText(), djVar.e.getText().length(), str);
                                                    }
                                                    this.e.add(djVar);
                                                    lineCount = djVar.e.getLineCount();
                                                    lineLeft = djVar.e.getLineLeft(lineCount - 1);
                                                    if (i12 == 0) {
                                                        this.d = lineLeft;
                                                    }
                                                    float f192 = lineLeft;
                                                    float f202 = djVar.e.getLineWidth(lineCount - 1);
                                                    z18 = z17;
                                                    i15 = size;
                                                    int ceil42 = (int) Math.ceil(f202);
                                                    if (ceil42 > i11 + 80) {
                                                    }
                                                    i17 = i15 - 1;
                                                    if (i12 == i17) {
                                                    }
                                                    float f212 = ceil42;
                                                    int i342 = i16;
                                                    arrayList2 = arrayList;
                                                    ceil2 = (int) Math.ceil(Math.max(0.0f, f192) + f212);
                                                    if (djVar.J) {
                                                    }
                                                    int i362 = ceil42;
                                                    if (lineCount > 1) {
                                                    }
                                                    if (djVar.V) {
                                                    }
                                                    if (gjVar != null) {
                                                        if (djVar.J) {
                                                        }
                                                        ceil2 -= c11;
                                                        xh.f.b(null, djVar.e, -1, ceil2, null, djVar.y);
                                                    }
                                                    i28 = i342;
                                                    staticLayout6 = staticLayout3;
                                                    i12++;
                                                    f13 = f14;
                                                    size = i15;
                                                    z10 = z18;
                                                    arrayList = arrayList2;
                                                    charSequence5 = charSequence3;
                                                    z24 = z19;
                                                }
                                            } else {
                                                z12 = z30;
                                            }
                                            z13 = false;
                                            this.k = z13;
                                            if (djVar.J) {
                                            }
                                            z15 = djVar.I;
                                            if (z15) {
                                            }
                                            if (!djVar.J) {
                                            }
                                            i13 = i11 - c10;
                                            if (size == 1) {
                                            }
                                            if (djVar.I) {
                                            }
                                            this.e.add(djVar);
                                            lineCount = djVar.e.getLineCount();
                                            lineLeft = djVar.e.getLineLeft(lineCount - 1);
                                            if (i12 == 0) {
                                            }
                                            float f1922 = lineLeft;
                                            float f2022 = djVar.e.getLineWidth(lineCount - 1);
                                            z18 = z17;
                                            i15 = size;
                                            int ceil422 = (int) Math.ceil(f2022);
                                            if (ceil422 > i11 + 80) {
                                            }
                                            i17 = i15 - 1;
                                            if (i12 == i17) {
                                            }
                                            float f2122 = ceil422;
                                            int i3422 = i16;
                                            arrayList2 = arrayList;
                                            ceil2 = (int) Math.ceil(Math.max(0.0f, f1922) + f2122);
                                            if (djVar.J) {
                                            }
                                            int i3622 = ceil422;
                                            if (lineCount > 1) {
                                            }
                                            if (djVar.V) {
                                            }
                                            if (gjVar != null) {
                                            }
                                            i28 = i3422;
                                            staticLayout6 = staticLayout3;
                                            i12++;
                                            f13 = f14;
                                            size = i15;
                                            z10 = z18;
                                            arrayList = arrayList2;
                                            charSequence5 = charSequence3;
                                            z24 = z19;
                                        }
                                        return;
                                    }
                                    L2 = g0.L(f10);
                                }
                                i11 = L2 + i10;
                                int lineCount22 = g52.getLineCount();
                                if (Build.VERSION.SDK_INT < 24) {
                                }
                                int i242 = 10;
                                if (z11) {
                                }
                                arrayList = new ArrayList();
                                if (!(charSequence2 instanceof Spanned)) {
                                }
                                if (z11) {
                                }
                                arrayList.add(new fj(0, g52.getText().length()));
                                int size2 = arrayList.size();
                                this.g = false;
                                this.j = false;
                                this.k = false;
                                int i282 = i10;
                                i12 = 0;
                                StaticLayout staticLayout62 = g52;
                                CharSequence charSequence52 = charSequence2;
                                while (i12 < arrayList.size()) {
                                }
                                return;
                            } catch (Exception e12) {
                                a8.g(e12, z27);
                                return;
                            }
                        }
                    }
                    z10 = z23;
                    f10 = 15.0f;
                    f11 = 32.0f;
                    f12 = 0.0f;
                    charSequence2 = charSequence4;
                    if (this.k) {
                    }
                    i11 = L2 + i10;
                    int lineCount222 = g52.getLineCount();
                    if (Build.VERSION.SDK_INT < 24) {
                    }
                    int i2422 = 10;
                    if (z11) {
                    }
                    arrayList = new ArrayList();
                    if (!(charSequence2 instanceof Spanned)) {
                    }
                    if (z11) {
                    }
                    arrayList.add(new fj(0, g52.getText().length()));
                    int size22 = arrayList.size();
                    this.g = false;
                    this.j = false;
                    this.k = false;
                    int i2822 = i10;
                    i12 = 0;
                    StaticLayout staticLayout622 = g52;
                    CharSequence charSequence522 = charSequence2;
                    while (i12 < arrayList.size()) {
                    }
                    return;
                }
                L = g0.L(15.0f);
            }
            g52 = gj.g5(charSequence4, textPaint, i10, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
            if (gjVar != null) {
                if (gjVar.D == 0) {
                }
                if (gjVar.Z4()) {
                }
                if (g52.getLineCount() > i21) {
                }
            }
            z10 = z23;
            f10 = 15.0f;
            f11 = 32.0f;
            f12 = 0.0f;
            charSequence2 = charSequence4;
            if (this.k) {
            }
            i11 = L2 + i10;
            int lineCount2222 = g52.getLineCount();
            if (Build.VERSION.SDK_INT < 24) {
            }
            int i24222 = 10;
            if (z11) {
            }
            arrayList = new ArrayList();
            if (!(charSequence2 instanceof Spanned)) {
            }
            if (z11) {
            }
            arrayList.add(new fj(0, g52.getText().length()));
            int size222 = arrayList.size();
            this.g = false;
            this.j = false;
            this.k = false;
            int i28222 = i10;
            i12 = 0;
            StaticLayout staticLayout6222 = g52;
            CharSequence charSequence5222 = charSequence2;
            while (i12 < arrayList.size()) {
            }
            return;
        } catch (Exception e13) {
            a8.g(e13, true);
            return;
        }
        i10 = i7 - L;
    }

    public final void a(ej ejVar) {
        if (ejVar == null) {
            return;
        }
        ArrayList arrayList = ejVar.e;
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= Math.min(arrayList2.size(), arrayList.size())) {
                return;
            }
            ((dj) arrayList2.get(i7)).H = ((dj) arrayList.get(i7)).H;
            i7++;
        }
    }

    public final int b() {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i7 >= arrayList.size()) {
                return i10;
            }
            int i11 = ((dj) arrayList.get(i7)).f;
            dj djVar = (dj) arrayList.get(i7);
            i10 += ((djVar.K && djVar.f()) ? djVar.G : djVar.w) + i11 + ((dj) arrayList.get(i7)).h;
            i7++;
        }
    }

    public final int c(org.telegram.ui.Cells.x1 x1Var) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i7 >= arrayList.size()) {
                return i10;
            }
            i10 += ((dj) arrayList.get(i7)).j(x1Var) + ((dj) arrayList.get(i7)).f + ((dj) arrayList.get(i7)).h;
            i7++;
        }
    }
}
