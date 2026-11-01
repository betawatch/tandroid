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
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.xh0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ij {
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

    /* JADX WARN: Can't wrap try/catch for region: R(15:209|(3:210|211|212)|213|(1:215)(12:246|(1:248)|217|218|219|(1:221)(1:243)|222|223|(2:225|(3:227|(5:230|231|(1:236)|233|234)|235))(1:242)|241|(1:240)(5:230|231|(0)|233|234)|235)|216|217|218|219|(0)(0)|222|223|(0)(0)|241|(0)(0)|235) */
    /* JADX WARN: Can't wrap try/catch for region: R(46:113|(1:115)|116|(1:118)(1:366)|119|(1:121)(1:365)|122|(1:124)|125|(1:364)(2:128|(35:130|131|(3:133|(2:(1:334)|335)(1:136)|137)(2:336|(2:348|(7:350|(1:352)(1:362)|353|(1:355)(1:361)|356|(1:358)(1:360)|359))(5:339|(1:341)(1:347)|342|(1:344)(1:346)|345))|138|(3:140|(1:142)(2:328|(1:330)(1:331))|143)(1:332)|144|(1:146)(1:(1:326)(28:327|148|(3:150|(1:306)(4:156|(1:158)(1:305)|159|160)|161)(2:307|(4:309|276|277|278)(7:310|311|312|(1:320)(1:316)|317|318|319))|162|(1:168)|169|170|171|(1:175)|176|177|178|179|180|(1:182)|183|(1:185)|186|(3:188|(8:190|191|192|193|194|195|197|198)|204)|205|(6:207|(17:209|210|211|212|213|(1:215)(12:246|(1:248)|217|218|219|(1:221)(1:243)|222|223|(2:225|(3:227|(5:230|231|(1:236)|233|234)|235))(1:242)|241|(1:240)(5:230|231|(0)|233|234)|235)|216|217|218|219|(0)(0)|222|223|(0)(0)|241|(0)(0)|235)|251|252|(2:(1:255)|256)(1:(1:287))|257)(3:288|(3:290|(1:292)(1:295)|293)(1:296)|294)|258|(1:260)(2:279|(3:281|(1:283)(1:285)|284))|(5:266|(1:268)(4:272|(1:274)|270|271)|269|270|271)|275|276|277|278))|147|148|(0)(0)|162|(3:164|166|168)|169|170|171|(2:173|175)|176|177|178|179|180|(0)|183|(0)|186|(0)|205|(0)(0)|258|(0)(0)|(7:262|264|266|(0)(0)|269|270|271)|275|276|277|278))|363|131|(0)(0)|138|(0)(0)|144|(0)(0)|147|148|(0)(0)|162|(0)|169|170|171|(0)|176|177|178|179|180|(0)|183|(0)|186|(0)|205|(0)(0)|258|(0)(0)|(0)|275|276|277|278|111) */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05a7, code lost:
    
        r10 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0510, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0511, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04f6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x04fa, code lost:
    
        if (r8 == 0) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x04fc, code lost:
    
        r36.d = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0500, code lost:
    
        org.telegram.messenger.f8.g(r0, true);
        r15 = 0.0f;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05fa A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ij(kj kjVar, CharSequence charSequence, TextPaint textPaint, int i10) {
        int i11;
        int L;
        StaticLayout g52;
        boolean z10;
        float f7;
        float f10;
        float f11;
        CharSequence charSequence2;
        int i12;
        int L2;
        boolean z11;
        ArrayList arrayList;
        float f12;
        int i13;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        StaticLayout staticLayout;
        TextPaint textPaint2;
        int i14;
        int c10;
        boolean z17;
        int i15;
        float f13;
        CharSequence charSequence3;
        int i16;
        ArrayList arrayList2;
        boolean z18;
        int i17;
        StaticLayout staticLayout2;
        int lineCount;
        int i18;
        int ceil;
        int i19;
        int i20;
        int c11;
        float f14;
        float f15;
        int i21;
        float f16;
        boolean z19;
        int i22;
        int c12;
        StaticLayout staticLayout3;
        float lineLeft;
        StaticLayout staticLayout4;
        int i23;
        TLRPC.Message message;
        CharSequence charSequence4 = charSequence;
        this.a = charSequence4;
        this.c = 0;
        boolean z20 = (kjVar == null || (message = kjVar.k) == null || !message.noforwards) ? false : true;
        if (kjVar != null && !z20) {
            z20 = wp.r1(kjVar.I1).z2(kj.B0(kjVar.k));
        }
        boolean z21 = z20;
        boolean z22 = kjVar != null && kjVar.P2() && !kjVar.P3() && textPaint == org.telegram.ui.ActionBar.t6.o2;
        boolean z23 = charSequence4 instanceof Spanned;
        this.f = z23 && ((di.i[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), di.i.class)).length > 0;
        this.i = z23 && ((wh0[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), wh0.class)).length > 0;
        this.k = false;
        this.h = false;
        if (z23) {
            Spanned spanned = (Spanned) charSequence4;
            xh0[] xh0VarArr = (xh0[]) spanned.getSpans(0, spanned.length(), xh0.class);
            for (xh0 xh0Var : xh0VarArr) {
                xh0Var.b = false;
            }
            this.k = xh0VarArr.length == 1 && spanned.getSpanStart(xh0VarArr[0]) == 0 && spanned.getSpanEnd(xh0VarArr[0]) == spanned.length();
            di.i[] iVarArr = (di.i[]) spanned.getSpans(0, spanned.length(), di.i.class);
            this.h = iVarArr.length == 1 && spanned.getSpanStart(iVarArr[0]) == 0 && spanned.getSpanEnd(iVarArr[0]) == spanned.length();
        }
        float f17 = 32.0f;
        try {
            if (this.k) {
                L = i0.L(32.0f);
            } else {
                if (!this.h) {
                    i11 = i10;
                    g52 = kj.g5(charSequence4, textPaint, i11, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                    if (kjVar != null && kjVar.h2) {
                        i23 = kjVar.D == 0 ? kjVar.z2() ? 7 : 12 : 22;
                        i23 = kjVar.Z4() ? i23 - 8 : i23;
                        if (g52.getLineCount() > i23) {
                            String L0 = dd.L0(2131746386, null);
                            f7 = 15.0f;
                            int i24 = 1;
                            z10 = z21;
                            int ceil2 = (int) Math.ceil(textPaint.measureText("… " + L0) + i0.L(1.0f));
                            int i25 = 0;
                            float f18 = 0.0f;
                            while (i25 < i23) {
                                f18 = Math.max(f18, g52.getLineRight(i25));
                                i25++;
                                i24 = i24;
                            }
                            int i26 = i24;
                            int i27 = i23 - 1;
                            int lineStart = g52.getLineStart(i27);
                            int lineEnd = g52.getLineEnd(i27) - 1;
                            while (true) {
                                if (lineEnd < lineStart) {
                                    f10 = f17;
                                    break;
                                }
                                f10 = f17;
                                if (g52.getPrimaryHorizontal(lineEnd) < f18 - ceil2) {
                                    break;
                                }
                                lineEnd--;
                                f17 = f10;
                            }
                            while (lineEnd >= lineStart && !Character.isWhitespace(charSequence4.charAt(lineEnd))) {
                                lineEnd--;
                            }
                            SpannableStringBuilder append = new SpannableStringBuilder(charSequence4.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) L0);
                            append.setSpan(new aj(i26), append.length() - L0.length(), append.length(), 33);
                            try {
                                f11 = 0.0f;
                                g52 = kj.g5(append, textPaint, i11, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                charSequence2 = append;
                                if (this.k) {
                                    L2 = i0.L(f10);
                                } else {
                                    if (!this.h) {
                                        i12 = i11;
                                        int lineCount2 = g52.getLineCount();
                                        z11 = Build.VERSION.SDK_INT < 24;
                                        int i28 = 10;
                                        int ceil3 = !z11 ? 1 : (int) Math.ceil(lineCount2 / 10);
                                        arrayList = new ArrayList();
                                        if (!(charSequence2 instanceof Spanned) && (this.i || this.f)) {
                                            kj.R((Spanned) charSequence2, arrayList);
                                        } else {
                                            if (!z11 || ceil3 == 1) {
                                                f12 = f11;
                                                arrayList.add(new jj(0, g52.getText().length()));
                                                int size = arrayList.size();
                                                this.g = false;
                                                this.j = false;
                                                this.k = false;
                                                int i29 = i11;
                                                i13 = 0;
                                                StaticLayout staticLayout5 = g52;
                                                CharSequence charSequence5 = charSequence2;
                                                while (i13 < arrayList.size()) {
                                                    hj hjVar = new hj();
                                                    jj jjVar = (jj) arrayList.get(i13);
                                                    boolean z24 = jjVar.d;
                                                    String str = jjVar.f;
                                                    int i30 = jjVar.a;
                                                    int i31 = jjVar.b;
                                                    hjVar.H = z24;
                                                    hjVar.I = jjVar.c;
                                                    boolean z25 = jjVar.e;
                                                    hjVar.J = z25;
                                                    if (z25) {
                                                        hjVar.E = kjVar;
                                                    }
                                                    hjVar.c = i13;
                                                    hjVar.a = i13 == 0;
                                                    boolean z26 = i13 == arrayList.size() + (-1);
                                                    hjVar.b = z26;
                                                    if (z26) {
                                                        this.j = hjVar.I;
                                                        this.g = hjVar.H;
                                                    }
                                                    boolean z27 = hjVar.a;
                                                    if (z27 && z26) {
                                                        z12 = z26;
                                                        if (hjVar.I) {
                                                            z13 = true;
                                                            this.k = z13;
                                                            if (hjVar.I) {
                                                                boolean z28 = hjVar.H;
                                                                if (z28 && z22) {
                                                                    z14 = z10;
                                                                    hjVar.n(str, z14);
                                                                    hjVar.f = hjVar.g() + (hjVar.a ? 0 : i0.L(8.0f));
                                                                    hjVar.h = i0.L(12.0f) + (hjVar.b ? 0 : i0.L(8.0f));
                                                                } else {
                                                                    z14 = z10;
                                                                    if (z28) {
                                                                        hjVar.m(i31 - i30, str, z14);
                                                                        hjVar.f = i0.L(4.0f) + hjVar.M + (hjVar.a ? 0 : i0.L(5.0f));
                                                                        hjVar.h = i0.L(4.0f) + (hjVar.b ? 0 : i0.L(7.0f)) + (hjVar.N ? i0.L(38.0f) : 0);
                                                                    }
                                                                }
                                                            } else {
                                                                if (z27 && z12) {
                                                                    int L3 = i0.L(6.0f);
                                                                    hjVar.h = L3;
                                                                    hjVar.f = L3;
                                                                } else {
                                                                    hjVar.f = i0.L(z27 ? 8.0f : 6.0f);
                                                                    hjVar.h = i0.L(7.0f);
                                                                }
                                                                z14 = z10;
                                                            }
                                                            z15 = hjVar.H;
                                                            if (z15) {
                                                                z16 = z15;
                                                                staticLayout = staticLayout5;
                                                                textPaint2 = textPaint;
                                                            } else {
                                                                z16 = z15;
                                                                int i32 = i31 - i30;
                                                                staticLayout = staticLayout5;
                                                                textPaint2 = i32 > 220 ? org.telegram.ui.ActionBar.t6.r2 : i32 > 80 ? org.telegram.ui.ActionBar.t6.q2 : org.telegram.ui.ActionBar.t6.p2;
                                                            }
                                                            if (!hjVar.I) {
                                                                c10 = i0.L(f10);
                                                            } else if (z16) {
                                                                c10 = hjVar.c();
                                                            } else {
                                                                i14 = i12;
                                                                if (size == 1) {
                                                                    z17 = z14;
                                                                    if (hjVar.H && !hjVar.I && (staticLayout.getText() instanceof Spannable)) {
                                                                        SpannableString b10 = !TextUtils.isEmpty(str) ? di.l.b(charSequence5.subSequence(i30, i31).toString(), str) : new SpannableString(charSequence5.subSequence(i30, i31));
                                                                        hjVar.s = i14;
                                                                        int i33 = i14;
                                                                        staticLayout4 = kj.g5(b10, textPaint2, i33, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                                                        i29 = i33;
                                                                    } else {
                                                                        hjVar.s = i29;
                                                                        staticLayout4 = staticLayout;
                                                                    }
                                                                    hjVar.e = staticLayout4;
                                                                    hjVar.n = 0;
                                                                    hjVar.r = staticLayout4.getText().length();
                                                                    hjVar.w = staticLayout4.getHeight();
                                                                    hjVar.F = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, hjVar.w);
                                                                    i15 = 0;
                                                                    i17 = i29;
                                                                    staticLayout2 = staticLayout4;
                                                                } else {
                                                                    z17 = z14;
                                                                    i15 = 0;
                                                                    int i34 = i14;
                                                                    if (i31 < i30) {
                                                                        f13 = f12;
                                                                        charSequence3 = charSequence5;
                                                                        z10 = z17;
                                                                        i16 = size;
                                                                        arrayList2 = arrayList;
                                                                        z18 = z22;
                                                                        staticLayout5 = staticLayout;
                                                                        i13++;
                                                                        f12 = f13;
                                                                        charSequence5 = charSequence3;
                                                                        size = i16;
                                                                        arrayList = arrayList2;
                                                                        z22 = z18;
                                                                    } else {
                                                                        hjVar.n = i30;
                                                                        hjVar.r = i31;
                                                                        try {
                                                                            SpannableString valueOf = (!hjVar.H || hjVar.I) ? SpannableString.valueOf(charSequence5.subSequence(i30, i31)) : di.l.b(charSequence5.subSequence(i30, i31).toString(), str);
                                                                            hjVar.s = i34;
                                                                            StaticLayout g53 = kj.g5(valueOf, textPaint2, i34, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
                                                                            hjVar.e = g53;
                                                                            hjVar.w = g53.getHeight();
                                                                            hjVar.F = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, hjVar.w);
                                                                            i17 = i29;
                                                                            staticLayout2 = staticLayout;
                                                                        } catch (Exception e) {
                                                                            f13 = f12;
                                                                            charSequence3 = charSequence5;
                                                                            z10 = z17;
                                                                            i16 = size;
                                                                            arrayList2 = arrayList;
                                                                            z18 = z22;
                                                                            f8.g(e, true);
                                                                        }
                                                                    }
                                                                }
                                                                if (hjVar.H && (hjVar.e.getText() instanceof Spannable) && TextUtils.isEmpty(str)) {
                                                                    di.l.c((Spannable) hjVar.e.getText(), hjVar.e.getText().length(), str);
                                                                }
                                                                this.e.add(hjVar);
                                                                lineCount = hjVar.e.getLineCount();
                                                                lineLeft = hjVar.e.getLineLeft(lineCount - 1);
                                                                if (i13 == 0 && lineLeft >= f12) {
                                                                    this.d = lineLeft;
                                                                }
                                                                float f19 = lineLeft;
                                                                float f20 = hjVar.e.getLineWidth(lineCount - 1);
                                                                float f21 = f19;
                                                                int ceil4 = (int) Math.ceil(f20);
                                                                ceil4 = ceil4 > i12 + 80 ? i12 : ceil4;
                                                                i18 = size - 1;
                                                                if (i13 == i18) {
                                                                    this.b = ceil4;
                                                                }
                                                                float f22 = ceil4;
                                                                charSequence3 = charSequence5;
                                                                z10 = z17;
                                                                i16 = size;
                                                                ceil = (int) Math.ceil(Math.max(0.0f, f21) + f22);
                                                                if (hjVar.I) {
                                                                    hjVar.D = 0.0f;
                                                                    int i35 = i15;
                                                                    while (i35 < lineCount) {
                                                                        int i36 = ceil4;
                                                                        try {
                                                                            staticLayout3 = staticLayout2;
                                                                            try {
                                                                                hjVar.D = Math.max(hjVar.D, hjVar.e.getLineRight(i35));
                                                                            } catch (Exception unused) {
                                                                                hjVar.D = this.c;
                                                                                i35++;
                                                                                staticLayout2 = staticLayout3;
                                                                                ceil4 = i36;
                                                                            }
                                                                        } catch (Exception unused2) {
                                                                            staticLayout3 = staticLayout2;
                                                                        }
                                                                        i35++;
                                                                        staticLayout2 = staticLayout3;
                                                                        ceil4 = i36;
                                                                    }
                                                                }
                                                                int i37 = ceil4;
                                                                staticLayout = staticLayout2;
                                                                if (lineCount > 1) {
                                                                    int i38 = ceil;
                                                                    int i39 = i15;
                                                                    int i40 = i39;
                                                                    int i41 = i37;
                                                                    float f23 = 0.0f;
                                                                    float f24 = 0.0f;
                                                                    while (i39 < lineCount) {
                                                                        int i42 = i17;
                                                                        try {
                                                                            f14 = hjVar.e.getLineWidth(i39);
                                                                        } catch (Exception unused3) {
                                                                            f14 = 0.0f;
                                                                        }
                                                                        if (hjVar.I) {
                                                                            c12 = i0.L(f10);
                                                                        } else {
                                                                            c12 = hjVar.H ? hjVar.c() : c12;
                                                                            float f25 = hjVar.e.getLineLeft(i39);
                                                                            float f26 = f25;
                                                                            if (f14 <= i12 + 20) {
                                                                                i21 = lineCount;
                                                                                f16 = i12;
                                                                                f15 = 0.0f;
                                                                            } else {
                                                                                f15 = f26;
                                                                                i21 = lineCount;
                                                                                f16 = f14;
                                                                            }
                                                                            ArrayList arrayList3 = arrayList;
                                                                            if (f15 > 0.0f) {
                                                                                z19 = z22;
                                                                                if (hjVar.e.getParagraphDirection(i39) != -1) {
                                                                                    hjVar.x = (byte) (hjVar.x | 2);
                                                                                    i22 = 1;
                                                                                    if (i40 != 0 && f15 == 0.0f) {
                                                                                        try {
                                                                                            if (hjVar.e.getParagraphDirection(i39) != i22) {
                                                                                            }
                                                                                        } catch (Exception unused4) {
                                                                                        }
                                                                                        i40 = 1;
                                                                                    }
                                                                                    f24 = Math.max(f24, f16);
                                                                                    float f27 = f15 + f16;
                                                                                    f23 = Math.max(f23, f27);
                                                                                    i41 = Math.max(i41, (int) Math.ceil(f16));
                                                                                    i38 = Math.max(i38, (int) Math.ceil(f27));
                                                                                    i39++;
                                                                                    i17 = i42;
                                                                                    lineCount = i21;
                                                                                    arrayList = arrayList3;
                                                                                    z22 = z19;
                                                                                }
                                                                            } else {
                                                                                z19 = z22;
                                                                            }
                                                                            this.d = Math.min(this.d, f15);
                                                                            i22 = 1;
                                                                            hjVar.x = (byte) (hjVar.x | 1);
                                                                            if (i40 != 0) {
                                                                                if (hjVar.e.getParagraphDirection(i39) != i22) {
                                                                                }
                                                                                i40 = 1;
                                                                            }
                                                                            f24 = Math.max(f24, f16);
                                                                            float f272 = f15 + f16;
                                                                            f23 = Math.max(f23, f272);
                                                                            i41 = Math.max(i41, (int) Math.ceil(f16));
                                                                            i38 = Math.max(i38, (int) Math.ceil(f272));
                                                                            i39++;
                                                                            i17 = i42;
                                                                            lineCount = i21;
                                                                            arrayList = arrayList3;
                                                                            z22 = z19;
                                                                        }
                                                                        f14 += c12;
                                                                        float f252 = hjVar.e.getLineLeft(i39);
                                                                        float f262 = f252;
                                                                        if (f14 <= i12 + 20) {
                                                                        }
                                                                        ArrayList arrayList32 = arrayList;
                                                                        if (f15 > 0.0f) {
                                                                        }
                                                                        this.d = Math.min(this.d, f15);
                                                                        i22 = 1;
                                                                        hjVar.x = (byte) (hjVar.x | 1);
                                                                        if (i40 != 0) {
                                                                        }
                                                                        f24 = Math.max(f24, f16);
                                                                        float f2722 = f15 + f16;
                                                                        f23 = Math.max(f23, f2722);
                                                                        i41 = Math.max(i41, (int) Math.ceil(f16));
                                                                        i38 = Math.max(i38, (int) Math.ceil(f2722));
                                                                        i39++;
                                                                        i17 = i42;
                                                                        lineCount = i21;
                                                                        arrayList = arrayList32;
                                                                        z22 = z19;
                                                                    }
                                                                    i19 = i17;
                                                                    arrayList2 = arrayList;
                                                                    z18 = z22;
                                                                    if (i40 != 0) {
                                                                        if (i13 == i18) {
                                                                            this.b = ceil;
                                                                        }
                                                                        f24 = f23;
                                                                    } else if (i13 == i18) {
                                                                        this.b = i41;
                                                                    }
                                                                    this.c = Math.max(this.c, (int) Math.ceil(f24));
                                                                    ceil = i38;
                                                                    f13 = 0.0f;
                                                                } else {
                                                                    i19 = i17;
                                                                    arrayList2 = arrayList;
                                                                    z18 = z22;
                                                                    f13 = 0.0f;
                                                                    if (f21 > 0.0f) {
                                                                        float min = Math.min(this.d, f21);
                                                                        this.d = min;
                                                                        i20 = min == 0.0f ? (int) (f22 + f21) : i37;
                                                                        hjVar.x = (byte) (hjVar.x | 1);
                                                                    } else {
                                                                        hjVar.x = (byte) (hjVar.x | 2);
                                                                        i20 = i37;
                                                                    }
                                                                    this.c = Math.max(this.c, Math.min(i12, i20));
                                                                }
                                                                if (hjVar.U) {
                                                                    this.c = Math.max(this.c, i12);
                                                                } else {
                                                                    rz0 rz0Var = hjVar.L;
                                                                    if (rz0Var != null) {
                                                                        this.c = (int) Math.max(this.c, Math.min(rz0Var.c + i0.L(f7), hjVar.e == null ? f13 : r6.getWidth()));
                                                                    }
                                                                }
                                                                if (kjVar != null && !kjVar.L0 && !kjVar.I2) {
                                                                    if (hjVar.I) {
                                                                        c11 = hjVar.H ? hjVar.c() : c11;
                                                                        nh.i.b(null, hjVar.e, -1, ceil, null, hjVar.y);
                                                                    } else {
                                                                        c11 = i0.L(f10);
                                                                    }
                                                                    ceil -= c11;
                                                                    nh.i.b(null, hjVar.e, -1, ceil, null, hjVar.y);
                                                                }
                                                                i29 = i19;
                                                                staticLayout5 = staticLayout;
                                                                i13++;
                                                                f12 = f13;
                                                                charSequence5 = charSequence3;
                                                                size = i16;
                                                                arrayList = arrayList2;
                                                                z22 = z18;
                                                            }
                                                            i14 = i12 - c10;
                                                            if (size == 1) {
                                                            }
                                                            if (hjVar.H) {
                                                                di.l.c((Spannable) hjVar.e.getText(), hjVar.e.getText().length(), str);
                                                            }
                                                            this.e.add(hjVar);
                                                            lineCount = hjVar.e.getLineCount();
                                                            lineLeft = hjVar.e.getLineLeft(lineCount - 1);
                                                            if (i13 == 0) {
                                                                this.d = lineLeft;
                                                            }
                                                            float f192 = lineLeft;
                                                            float f202 = hjVar.e.getLineWidth(lineCount - 1);
                                                            float f212 = f192;
                                                            int ceil42 = (int) Math.ceil(f202);
                                                            if (ceil42 > i12 + 80) {
                                                            }
                                                            i18 = size - 1;
                                                            if (i13 == i18) {
                                                            }
                                                            float f222 = ceil42;
                                                            charSequence3 = charSequence5;
                                                            z10 = z17;
                                                            i16 = size;
                                                            ceil = (int) Math.ceil(Math.max(0.0f, f212) + f222);
                                                            if (hjVar.I) {
                                                            }
                                                            int i372 = ceil42;
                                                            staticLayout = staticLayout2;
                                                            if (lineCount > 1) {
                                                            }
                                                            if (hjVar.U) {
                                                            }
                                                            if (kjVar != null) {
                                                                if (hjVar.I) {
                                                                }
                                                                ceil -= c11;
                                                                nh.i.b(null, hjVar.e, -1, ceil, null, hjVar.y);
                                                            }
                                                            i29 = i19;
                                                            staticLayout5 = staticLayout;
                                                            i13++;
                                                            f12 = f13;
                                                            charSequence5 = charSequence3;
                                                            size = i16;
                                                            arrayList = arrayList2;
                                                            z22 = z18;
                                                        }
                                                    } else {
                                                        z12 = z26;
                                                    }
                                                    z13 = false;
                                                    this.k = z13;
                                                    if (hjVar.I) {
                                                    }
                                                    z15 = hjVar.H;
                                                    if (z15) {
                                                    }
                                                    if (!hjVar.I) {
                                                    }
                                                    i14 = i12 - c10;
                                                    if (size == 1) {
                                                    }
                                                    if (hjVar.H) {
                                                    }
                                                    this.e.add(hjVar);
                                                    lineCount = hjVar.e.getLineCount();
                                                    lineLeft = hjVar.e.getLineLeft(lineCount - 1);
                                                    if (i13 == 0) {
                                                    }
                                                    float f1922 = lineLeft;
                                                    float f2022 = hjVar.e.getLineWidth(lineCount - 1);
                                                    float f2122 = f1922;
                                                    int ceil422 = (int) Math.ceil(f2022);
                                                    if (ceil422 > i12 + 80) {
                                                    }
                                                    i18 = size - 1;
                                                    if (i13 == i18) {
                                                    }
                                                    float f2222 = ceil422;
                                                    charSequence3 = charSequence5;
                                                    z10 = z17;
                                                    i16 = size;
                                                    ceil = (int) Math.ceil(Math.max(0.0f, f2122) + f2222);
                                                    if (hjVar.I) {
                                                    }
                                                    int i3722 = ceil422;
                                                    staticLayout = staticLayout2;
                                                    if (lineCount > 1) {
                                                    }
                                                    if (hjVar.U) {
                                                    }
                                                    if (kjVar != null) {
                                                    }
                                                    i29 = i19;
                                                    staticLayout5 = staticLayout;
                                                    i13++;
                                                    f12 = f13;
                                                    charSequence5 = charSequence3;
                                                    size = i16;
                                                    arrayList = arrayList2;
                                                    z22 = z18;
                                                }
                                                return;
                                            }
                                            int i43 = 0;
                                            int i44 = 0;
                                            while (i43 < ceil3) {
                                                int min2 = Math.min(i28, lineCount2 - i44);
                                                int lineStart2 = g52.getLineStart(i44);
                                                int i45 = min2 + i44;
                                                float f28 = f11;
                                                int lineEnd2 = g52.getLineEnd(i45 - 1);
                                                if (lineEnd2 >= lineStart2) {
                                                    arrayList.add(new jj(lineStart2, lineEnd2));
                                                    i44 = i45;
                                                }
                                                i43++;
                                                f11 = f28;
                                                i28 = 10;
                                            }
                                        }
                                        f12 = f11;
                                        int size2 = arrayList.size();
                                        this.g = false;
                                        this.j = false;
                                        this.k = false;
                                        int i292 = i11;
                                        i13 = 0;
                                        StaticLayout staticLayout52 = g52;
                                        CharSequence charSequence52 = charSequence2;
                                        while (i13 < arrayList.size()) {
                                        }
                                        return;
                                    }
                                    L2 = i0.L(f7);
                                }
                                i12 = L2 + i11;
                                int lineCount22 = g52.getLineCount();
                                if (Build.VERSION.SDK_INT < 24) {
                                }
                                int i282 = 10;
                                if (!z11) {
                                }
                                arrayList = new ArrayList();
                                if (!(charSequence2 instanceof Spanned)) {
                                }
                                if (z11) {
                                }
                                f12 = f11;
                                arrayList.add(new jj(0, g52.getText().length()));
                                int size22 = arrayList.size();
                                this.g = false;
                                this.j = false;
                                this.k = false;
                                int i2922 = i11;
                                i13 = 0;
                                StaticLayout staticLayout522 = g52;
                                CharSequence charSequence522 = charSequence2;
                                while (i13 < arrayList.size()) {
                                }
                                return;
                            } catch (Exception e7) {
                                f8.g(e7, true);
                                return;
                            }
                        }
                    }
                    z10 = z21;
                    f7 = 15.0f;
                    f10 = 32.0f;
                    f11 = 0.0f;
                    charSequence2 = charSequence4;
                    if (this.k) {
                    }
                    i12 = L2 + i11;
                    int lineCount222 = g52.getLineCount();
                    if (Build.VERSION.SDK_INT < 24) {
                    }
                    int i2822 = 10;
                    if (!z11) {
                    }
                    arrayList = new ArrayList();
                    if (!(charSequence2 instanceof Spanned)) {
                    }
                    if (z11) {
                    }
                    f12 = f11;
                    arrayList.add(new jj(0, g52.getText().length()));
                    int size222 = arrayList.size();
                    this.g = false;
                    this.j = false;
                    this.k = false;
                    int i29222 = i11;
                    i13 = 0;
                    StaticLayout staticLayout5222 = g52;
                    CharSequence charSequence5222 = charSequence2;
                    while (i13 < arrayList.size()) {
                    }
                    return;
                }
                L = i0.L(15.0f);
            }
            g52 = kj.g5(charSequence4, textPaint, i11, 1.0f, 0.0f, false, Layout.Alignment.ALIGN_NORMAL);
            if (kjVar != null) {
                if (kjVar.D == 0) {
                }
                if (kjVar.Z4()) {
                }
                if (g52.getLineCount() > i23) {
                }
            }
            z10 = z21;
            f7 = 15.0f;
            f10 = 32.0f;
            f11 = 0.0f;
            charSequence2 = charSequence4;
            if (this.k) {
            }
            i12 = L2 + i11;
            int lineCount2222 = g52.getLineCount();
            if (Build.VERSION.SDK_INT < 24) {
            }
            int i28222 = 10;
            if (!z11) {
            }
            arrayList = new ArrayList();
            if (!(charSequence2 instanceof Spanned)) {
            }
            if (z11) {
            }
            f12 = f11;
            arrayList.add(new jj(0, g52.getText().length()));
            int size2222 = arrayList.size();
            this.g = false;
            this.j = false;
            this.k = false;
            int i292222 = i11;
            i13 = 0;
            StaticLayout staticLayout52222 = g52;
            CharSequence charSequence52222 = charSequence2;
            while (i13 < arrayList.size()) {
            }
            return;
        } catch (Exception e10) {
            f8.g(e10, true);
            return;
        }
        i11 = i10 - L;
    }

    public final void a(ij ijVar) {
        if (ijVar == null) {
            return;
        }
        ArrayList arrayList = ijVar.e;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= Math.min(arrayList2.size(), arrayList.size())) {
                return;
            }
            ((hj) arrayList2.get(i10)).G = ((hj) arrayList.get(i10)).G;
            i10++;
        }
    }

    public final int b() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            int i12 = ((hj) arrayList.get(i10)).f;
            hj hjVar = (hj) arrayList.get(i10);
            i11 += ((hjVar.J && hjVar.f()) ? hjVar.F : hjVar.w) + i12 + ((hj) arrayList.get(i10)).h;
            i10++;
        }
    }

    public final int c(org.telegram.ui.Cells.x1 x1Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            i11 += ((hj) arrayList.get(i10)).j(x1Var) + ((hj) arrayList.get(i10)).f + ((hj) arrayList.get(i10)).h;
            i10++;
        }
    }
}
