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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ab extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ab());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:87|(1:89)(1:144)|90|(13:92|(1:94)(2:131|(1:133))|95|(5:123|(1:125)(1:130)|126|(1:128)|129)(1:99)|100|101|102|103|104|105|(1:107)|108|109)|134|135|136|137|138|(1:97)|123|(0)(0)|126|(0)|129|100|101|102|103|104|105|(0)|108|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:3|(1:5)(1:84)|6|7|(1:9)(1:83)|10|(1:12)(1:82)|13|14|(17:16|(1:18)(2:62|(1:64))|19|20|(1:(5:54|(1:56)(1:61)|57|(1:59)|60)(1:53))(1:24)|25|(1:27)(1:49)|28|(1:30)(1:48)|31|32|33|34|35|(1:37)|38|39)|(23:66|(1:68)(2:69|(1:71))|19|20|(1:22)|(1:51)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39)|72|73|74|75|76|20|(0)|(0)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0356, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035d, code lost:
    
        fc4.g(r0, true);
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0348, code lost:
    
        fc4.g(r0, false);
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
    
        fc4.g(r0, true);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d0, code lost:
    
        fc4.g(r0, false);
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
    @Override // b6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z2;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        bb bbVar = (bb) view;
        Object obj = c6cVar.I;
        if (!(obj instanceof k47)) {
            if (obj instanceof m11) {
                m11 m11Var = (m11) obj;
                CharSequence charSequence = c6cVar.n;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = bbVar.d;
                ylb ylbVar = bbVar.a;
                bf0 bf0Var = bbVar.b;
                TextView textView = bbVar.f;
                TextView textView2 = bbVar.e;
                bbVar.updateColors();
                String str = m11Var.c;
                ivc ivcVar = m11Var.d;
                if (ivcVar != null) {
                    if (!TextUtils.isEmpty(ivcVar.c)) {
                        textView2.setText(ivcVar.c);
                    } else if (!TextUtils.isEmpty(ivcVar.d)) {
                        textView2.setText(ivcVar.d);
                    }
                    layoutParams = layoutParams2;
                    if (ivcVar != null || (bitmap = ivcVar.i) == null) {
                        String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                        characterInstance.setText(charSequence3);
                        sn2 sn2Var = new sn2(cmb.b0(gm.L(6.0f), cmb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance.first(), characterInstance.next()), (byte) 1));
                        int L = gm.L(28.0f);
                        int L2 = gm.L(28.0f);
                        sn2Var.h = L;
                        sn2Var.n = L2;
                        bf0Var.setImageDrawable(sn2Var);
                    } else {
                        bf0Var.setImageBitmap(bitmap);
                    }
                    bbVar.n.setVisibility(8);
                    Uri parse = Uri.parse(str);
                    String str2 = l11.x(parse, null, null, l11.a(parse.getHost()), null);
                    String str3 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                    textView.setText(str3);
                    if (!TextUtils.isEmpty(charSequence2)) {
                        textView2.setText(gm.u1(textView2.getText(), charSequence2, ylbVar));
                        textView.setText(gm.u1(textView.getText(), charSequence2, ylbVar));
                    }
                    textView2.setText(gw3.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setText(gw3.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                    bbVar.h.setText(jb6.D0().o0().format(m11Var.b));
                    bbVar.r.a(false, false);
                    FrameLayout.LayoutParams layoutParams3 = layoutParams;
                    layoutParams3.rightMargin = gm.L(70.0f);
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
                if (ivcVar != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(charSequence3);
                sn2 sn2Var2 = new sn2(cmb.b0(gm.L(6.0f), cmb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), (byte) 1));
                int L3 = gm.L(28.0f);
                int L22 = gm.L(28.0f);
                sn2Var2.h = L3;
                sn2Var2.n = L22;
                bf0Var.setImageDrawable(sn2Var2);
                bbVar.n.setVisibility(8);
                Uri parse2 = Uri.parse(str);
                String str22 = l11.x(parse2, null, null, l11.a(parse2.getHost()), null);
                String str32 = URLDecoder.decode(str22.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str32);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(gw3.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView.setText(gw3.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                bbVar.h.setText(jb6.D0().o0().format(m11Var.b));
                bbVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams32 = layoutParams;
                layoutParams32.rightMargin = gm.L(70.0f);
                bbVar.c.setLayoutParams(layoutParams32);
                bbVar.x = z;
                bbVar.setWillNotDraw(!z);
                return;
            }
            return;
        }
        k47 k47Var = (k47) obj;
        boolean z3 = c6cVar.r;
        CharSequence charSequence4 = c6cVar.n;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z4 = c6cVar.e;
        FrameLayout.LayoutParams layoutParams4 = bbVar.d;
        ylb ylbVar2 = bbVar.a;
        TextView textView3 = bbVar.f;
        bf0 bf0Var2 = bbVar.b;
        TextView textView4 = bbVar.e;
        bbVar.updateColors();
        TLRPC.WebPage webPage = k47.m1(k47Var) != null ? k47.m1(k47Var).webpage : null;
        String a = webPage != null ? webPage.url : eb.a(k47Var);
        ivc b2 = x84.c().b(gm.J0(a, true));
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
            bf0Var2.b();
            if (b2 == null && (bitmap2 = b2.i) != null) {
                bf0Var2.setImageBitmap(bitmap2);
            } else if (webPage != null || (photo = webPage.photo) == null) {
                String charSequence6 = textView4.getText() != null ? "" : textView4.getText().toString();
                BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                characterInstance3.setText(charSequence6);
                sn2 sn2Var3 = new sn2(cmb.b0(gm.L(6.0f), cmb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance3.first(), characterInstance3.next()), (byte) 0));
                int L4 = gm.L(28.0f);
                int L5 = gm.L(28.0f);
                sn2Var3.h = L4;
                sn2Var3.n = L5;
                bf0Var2.setImageDrawable(sn2Var3);
            } else {
                bf0Var2.h(gn5.i(bc4.w(photo.sizes, gm.L(32.0f), true, null, true), webPage.photo), gm.L(32.0f) + "_" + gm.L(32.0f), gn5.i(bc4.w(webPage.photo.sizes, gm.L(32.0f), true, null, false), webPage.photo), gm.L(32.0f) + "_" + gm.L(32.0f), 0, k47Var);
            }
            bbVar.h.setVisibility(8);
            bbVar.n.setVisibility(!z3 ? 0 : 8);
            String a2 = webPage == null ? webPage.url : eb.a(k47Var);
            Uri parse3 = Uri.parse(a2);
            a2 = l11.x(parse3, null, null, l11.a(parse3.getHost()), null);
            a2 = URLDecoder.decode(a2.replaceAll("\\+", "%2b"), "UTF-8");
            String str7 = xy0.p(a2);
            textView3.setText(str7);
            if (!TextUtils.isEmpty(charSequence5)) {
                textView4.setText(gm.u1(textView4.getText(), charSequence5, ylbVar2));
                textView3.setText(gm.u1(textView3.getText(), charSequence5, ylbVar2));
            }
            textView4.setText(gw3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(gw3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
            bbVar.r.a(z2, false);
            layoutParams4.rightMargin = gm.L(52.0f);
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
            bf0Var2.b();
            if (b2 == null) {
            }
            if (webPage != null) {
            }
            if (textView4.getText() != null) {
            }
            BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
            characterInstance32.setText(charSequence6);
            sn2 sn2Var32 = new sn2(cmb.b0(gm.L(6.0f), cmb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), (byte) 0));
            int L42 = gm.L(28.0f);
            int L52 = gm.L(28.0f);
            sn2Var32.h = L42;
            sn2Var32.n = L52;
            bf0Var2.setImageDrawable(sn2Var32);
            bbVar.h.setVisibility(8);
            bbVar.n.setVisibility(!z3 ? 0 : 8);
            String a22 = webPage == null ? webPage.url : eb.a(k47Var);
            Uri parse32 = Uri.parse(a22);
            a22 = l11.x(parse32, null, null, l11.a(parse32.getHost()), null);
            a22 = URLDecoder.decode(a22.replaceAll("\\+", "%2b"), "UTF-8");
            String str72 = xy0.p(a22);
            textView3.setText(str72);
            if (!TextUtils.isEmpty(charSequence5)) {
            }
            textView4.setText(gw3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(gw3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
            bbVar.r.a(z2, false);
            layoutParams4.rightMargin = gm.L(52.0f);
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
        bf0Var2.b();
        if (b2 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() != null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        sn2 sn2Var322 = new sn2(cmb.b0(gm.L(6.0f), cmb.p1(0.1f, bbVar.s)), new za(bbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), (byte) 0));
        int L422 = gm.L(28.0f);
        int L522 = gm.L(28.0f);
        sn2Var322.h = L422;
        sn2Var322.n = L522;
        bf0Var2.setImageDrawable(sn2Var322);
        bbVar.h.setVisibility(8);
        bbVar.n.setVisibility(!z3 ? 0 : 8);
        String a222 = webPage == null ? webPage.url : eb.a(k47Var);
        Uri parse322 = Uri.parse(a222);
        a222 = l11.x(parse322, null, null, l11.a(parse322.getHost()), null);
        a222 = URLDecoder.decode(a222.replaceAll("\\+", "%2b"), "UTF-8");
        String str722 = xy0.p(a222);
        textView3.setText(str722);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(gw3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
        textView3.setText(gw3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
        bbVar.r.a(z2, false);
        layoutParams4.rightMargin = gm.L(52.0f);
        bbVar.c.setLayoutParams(layoutParams4);
        bbVar.x = z;
        bbVar.setWillNotDraw(!z);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.I == c6cVar2.I && TextUtils.equals(c6cVar.n, c6cVar2.n);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new bb(context, ylbVar);
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.I == c6cVar2.I && TextUtils.isEmpty(c6cVar.n) == TextUtils.isEmpty(c6cVar2.n);
    }
}
