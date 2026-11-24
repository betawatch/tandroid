// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.net.URLDecoder;
import java.text.BreakIterator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ab extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new ab());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:87|(1:89)(1:144)|90|(13:92|(1:94)(2:131|(1:133))|95|(5:123|(1:125)(1:130)|126|(1:128)|129)(1:99)|100|101|102|103|104|105|(1:107)|108|109)|134|135|136|137|138|(1:97)|123|(0)(0)|126|(0)|129|100|101|102|103|104|105|(0)|108|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:3|(1:5)(1:84)|6|7|(1:9)(1:83)|10|(1:12)(1:82)|13|14|(17:16|(1:18)(2:62|(1:64))|19|20|(1:(5:54|(1:56)(1:61)|57|(1:59)|60)(1:53))(1:24)|25|(1:27)(1:49)|28|(1:30)(1:48)|31|32|33|34|35|(1:37)|38|39)|(23:66|(1:68)(2:69|(1:71))|19|20|(1:22)|(1:51)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39)|72|73|74|75|76|20|(0)|(0)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0356, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035d, code lost:
    
        fa4.g(r0, true);
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0348, code lost:
    
        fa4.g(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x034b, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0359, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x035a, code lost:
    
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02cc, code lost:
    
        r12.setText("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ca, code lost:
    
        r17 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e1, code lost:
    
        fa4.g(r0, true);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d0, code lost:
    
        fa4.g(r0, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cb, code lost:
    
        r11.setText("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c9, code lost:
    
        r25 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d1  */
    @Override // b4c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z2;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        bb bbVar = (bb) view;
        Object obj = c4cVar.I;
        if (!(obj instanceof k27)) {
            if (obj instanceof e01) {
                e01 e01Var = (e01) obj;
                CharSequence charSequence = c4cVar.n;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = bbVar.d;
                wjb wjbVar = bbVar.a;
                be0 be0Var = bbVar.b;
                TextView textView = bbVar.f;
                TextView textView2 = bbVar.e;
                bbVar.updateColors();
                String str = e01Var.c;
                htc htcVar = e01Var.d;
                if (htcVar != null) {
                    if (!TextUtils.isEmpty(htcVar.c)) {
                        textView2.setText(htcVar.c);
                    } else if (!TextUtils.isEmpty(htcVar.d)) {
                        textView2.setText(htcVar.d);
                    }
                    layoutParams = layoutParams2;
                    if (htcVar != null || (bitmap = htcVar.i) == null) {
                        String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                        characterInstance.setText(charSequence3);
                        fm2 fm2Var = new fm2(bkb.b0(gl.L(6.0f), bkb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance.first(), characterInstance.next()), (byte) 1));
                        int L = gl.L(28.0f);
                        int L2 = gl.L(28.0f);
                        fm2Var.h = L;
                        fm2Var.n = L2;
                        be0Var.setImageDrawable(fm2Var);
                    } else {
                        be0Var.setImageBitmap(bitmap);
                    }
                    bbVar.n.setVisibility(8);
                    Uri parse = Uri.parse(str);
                    String str2 = d01.w(parse, null, null, d01.a(parse.getHost()), null);
                    String str3 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                    textView.setText(str3);
                    if (!TextUtils.isEmpty(charSequence2)) {
                        textView2.setText(gl.u1(textView2.getText(), charSequence2, wjbVar));
                        textView.setText(gl.u1(textView.getText(), charSequence2, wjbVar));
                    }
                    textView2.setText(vu3.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setText(vu3.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                    bbVar.h.setText(k96.D0().o0().format(e01Var.b));
                    bbVar.r.a(false, false);
                    FrameLayout.LayoutParams layoutParams3 = layoutParams;
                    layoutParams3.rightMargin = gl.L(70.0f);
                    bbVar.c.setLayoutParams(layoutParams3);
                    bbVar.x = z;
                    bbVar.setWillNotDraw(!z);
                    return;
                }
                String str4 = Uri.parse(str).getHost().split("\\.")[r10.length - 2];
                StringBuilder sb = new StringBuilder();
                layoutParams = layoutParams2;
                sb.append(str4.substring(0, 1).toUpperCase());
                sb.append(str4.substring(1));
                textView2.setText(sb.toString());
                if (htcVar != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(charSequence3);
                fm2 fm2Var2 = new fm2(bkb.b0(gl.L(6.0f), bkb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), (byte) 1));
                int L3 = gl.L(28.0f);
                int L22 = gl.L(28.0f);
                fm2Var2.h = L3;
                fm2Var2.n = L22;
                be0Var.setImageDrawable(fm2Var2);
                bbVar.n.setVisibility(8);
                Uri parse2 = Uri.parse(str);
                String str22 = d01.w(parse2, null, null, d01.a(parse2.getHost()), null);
                String str32 = URLDecoder.decode(str22.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str32);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(vu3.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView.setText(vu3.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                bbVar.h.setText(k96.D0().o0().format(e01Var.b));
                bbVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams32 = layoutParams;
                layoutParams32.rightMargin = gl.L(70.0f);
                bbVar.c.setLayoutParams(layoutParams32);
                bbVar.x = z;
                bbVar.setWillNotDraw(!z);
                return;
            }
            return;
        }
        k27 k27Var = (k27) obj;
        boolean z3 = c4cVar.r;
        CharSequence charSequence4 = c4cVar.n;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z4 = c4cVar.e;
        FrameLayout.LayoutParams layoutParams4 = bbVar.d;
        wjb wjbVar2 = bbVar.a;
        TextView textView3 = bbVar.f;
        be0 be0Var2 = bbVar.b;
        TextView textView4 = bbVar.e;
        bbVar.updateColors();
        TLRPC.WebPage webPage = k27.m1(k27Var) != null ? k27.m1(k27Var).webpage : null;
        String a = webPage != null ? webPage.url : eb.a(k27Var);
        htc b2 = o74.c().b(gl.J0(a, true));
        if (webPage != null) {
            String str5 = webPage.title;
            if (str5 != null) {
                textView4.setText(str5);
            } else {
                String str6 = webPage.site_name;
                if (str6 != null) {
                    textView4.setText(str6);
                }
            }
            z2 = z4;
            be0Var2.b();
            if (b2 == null && (bitmap2 = b2.i) != null) {
                be0Var2.setImageBitmap(bitmap2);
            } else if (webPage != null || (photo = webPage.photo) == null) {
                String charSequence6 = textView4.getText() != null ? "" : textView4.getText().toString();
                BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                characterInstance3.setText(charSequence6);
                fm2 fm2Var3 = new fm2(bkb.b0(gl.L(6.0f), bkb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance3.first(), characterInstance3.next()), (byte) 0));
                int L4 = gl.L(28.0f);
                int L5 = gl.L(28.0f);
                fm2Var3.h = L4;
                fm2Var3.n = L5;
                be0Var2.setImageDrawable(fm2Var3);
            } else {
                be0Var2.h(gl5.i(ba4.w(photo.sizes, gl.L(32.0f), true, null, true), webPage.photo), gl.L(32.0f) + "_" + gl.L(32.0f), gl5.i(ba4.w(webPage.photo.sizes, gl.L(32.0f), true, null, false), webPage.photo), gl.L(32.0f) + "_" + gl.L(32.0f), 0, k27Var);
            }
            bbVar.h.setVisibility(8);
            bbVar.n.setVisibility(!z3 ? 0 : 8);
            String a2 = webPage == null ? webPage.url : eb.a(k27Var);
            Uri parse3 = Uri.parse(a2);
            a2 = d01.w(parse3, null, null, d01.a(parse3.getHost()), null);
            a2 = URLDecoder.decode(a2.replaceAll("\\+", "%2b"), "UTF-8");
            String str7 = qx0.p(a2);
            textView3.setText(str7);
            if (!TextUtils.isEmpty(charSequence5)) {
                textView4.setText(gl.u1(textView4.getText(), charSequence5, wjbVar2));
                textView3.setText(gl.u1(textView3.getText(), charSequence5, wjbVar2));
            }
            textView4.setText(vu3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(vu3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
            bbVar.r.a(z2, false);
            layoutParams4.rightMargin = gl.L(52.0f);
            bbVar.c.setLayoutParams(layoutParams4);
            bbVar.x = z;
            bbVar.setWillNotDraw(!z);
        }
        if (b2 != null) {
            if (!TextUtils.isEmpty(b2.c)) {
                textView4.setText(b2.c);
            } else if (!TextUtils.isEmpty(b2.d)) {
                textView4.setText(b2.d);
            }
            z2 = z4;
            be0Var2.b();
            if (b2 == null) {
            }
            if (webPage != null) {
            }
            if (textView4.getText() != null) {
            }
            BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
            characterInstance32.setText(charSequence6);
            fm2 fm2Var32 = new fm2(bkb.b0(gl.L(6.0f), bkb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), (byte) 0));
            int L42 = gl.L(28.0f);
            int L52 = gl.L(28.0f);
            fm2Var32.h = L42;
            fm2Var32.n = L52;
            be0Var2.setImageDrawable(fm2Var32);
            bbVar.h.setVisibility(8);
            bbVar.n.setVisibility(!z3 ? 0 : 8);
            String a22 = webPage == null ? webPage.url : eb.a(k27Var);
            Uri parse32 = Uri.parse(a22);
            a22 = d01.w(parse32, null, null, d01.a(parse32.getHost()), null);
            a22 = URLDecoder.decode(a22.replaceAll("\\+", "%2b"), "UTF-8");
            String str72 = qx0.p(a22);
            textView3.setText(str72);
            if (!TextUtils.isEmpty(charSequence5)) {
            }
            textView4.setText(vu3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(vu3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
            bbVar.r.a(z2, false);
            layoutParams4.rightMargin = gl.L(52.0f);
            bbVar.c.setLayoutParams(layoutParams4);
            bbVar.x = z;
            bbVar.setWillNotDraw(!z);
        }
        String str8 = Uri.parse(a).getHost().split("\\.")[r3.length - 2];
        StringBuilder sb2 = new StringBuilder();
        z2 = z4;
        sb2.append(str8.substring(0, 1).toUpperCase());
        sb2.append(str8.substring(1));
        textView4.setText(sb2.toString());
        be0Var2.b();
        if (b2 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() != null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        fm2 fm2Var322 = new fm2(bkb.b0(gl.L(6.0f), bkb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), (byte) 0));
        int L422 = gl.L(28.0f);
        int L522 = gl.L(28.0f);
        fm2Var322.h = L422;
        fm2Var322.n = L522;
        be0Var2.setImageDrawable(fm2Var322);
        bbVar.h.setVisibility(8);
        bbVar.n.setVisibility(!z3 ? 0 : 8);
        String a222 = webPage == null ? webPage.url : eb.a(k27Var);
        Uri parse322 = Uri.parse(a222);
        a222 = d01.w(parse322, null, null, d01.a(parse322.getHost()), null);
        a222 = URLDecoder.decode(a222.replaceAll("\\+", "%2b"), "UTF-8");
        String str722 = qx0.p(a222);
        textView3.setText(str722);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(vu3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
        textView3.setText(vu3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
        bbVar.r.a(z2, false);
        layoutParams4.rightMargin = gl.L(52.0f);
        bbVar.c.setLayoutParams(layoutParams4);
        bbVar.x = z;
        bbVar.setWillNotDraw(!z);
    }

    @Override // b4c
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.I == c4cVar2.I && TextUtils.equals(c4cVar.n, c4cVar2.n);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new bb(context, wjbVar);
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.I == c4cVar2.I && TextUtils.isEmpty(c4cVar.n) == TextUtils.isEmpty(c4cVar2.n);
    }
}
