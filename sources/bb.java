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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class bb extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new bb());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:87|(1:89)(1:144)|90|(13:92|(1:94)(2:131|(1:133))|95|(5:123|(1:125)(1:130)|126|(1:128)|129)(1:99)|100|101|102|103|104|105|(1:107)|108|109)|134|135|136|137|138|(1:97)|123|(0)(0)|126|(0)|129|100|101|102|103|104|105|(0)|108|109) */
    /* JADX WARN: Can't wrap try/catch for region: R(36:3|(1:5)(1:84)|6|7|(1:9)(1:83)|10|(1:12)(1:82)|13|14|(17:16|(1:18)(2:62|(1:64))|19|20|(1:(5:54|(1:56)(1:61)|57|(1:59)|60)(1:53))(1:24)|25|(1:27)(1:49)|28|(1:30)(1:48)|31|32|33|34|35|(1:37)|38|39)|(23:66|(1:68)(2:69|(1:71))|19|20|(1:22)|(1:51)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39)|72|73|74|75|76|20|(0)|(0)|54|(0)(0)|57|(0)|60|25|(0)(0)|28|(0)(0)|31|32|33|34|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0356, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035d, code lost:
    
        cc4.g(r0, true);
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0346, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0348, code lost:
    
        cc4.g(r0, false);
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
    
        cc4.g(r0, true);
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d0, code lost:
    
        cc4.g(r0, false);
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
    @Override // a8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        FrameLayout.LayoutParams layoutParams;
        Bitmap bitmap;
        boolean z2;
        TLRPC.Photo photo;
        Bitmap bitmap2;
        cb cbVar = (cb) view;
        Object obj = b8cVar.I;
        if (!(obj instanceof r47)) {
            if (obj instanceof n01) {
                n01 n01Var = (n01) obj;
                CharSequence charSequence = b8cVar.n;
                String charSequence2 = charSequence == null ? null : charSequence.toString();
                FrameLayout.LayoutParams layoutParams2 = cbVar.d;
                vnb vnbVar = cbVar.a;
                de0 de0Var = cbVar.b;
                TextView textView = cbVar.f;
                TextView textView2 = cbVar.e;
                cbVar.updateColors();
                String str = n01Var.c;
                wxc wxcVar = n01Var.d;
                if (wxcVar != null) {
                    if (!TextUtils.isEmpty(wxcVar.c)) {
                        textView2.setText(wxcVar.c);
                    } else if (!TextUtils.isEmpty(wxcVar.d)) {
                        textView2.setText(wxcVar.d);
                    }
                    layoutParams = layoutParams2;
                    if (wxcVar != null || (bitmap = wxcVar.i) == null) {
                        String charSequence3 = textView2.getText() == null ? "" : textView2.getText().toString();
                        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                        characterInstance.setText(charSequence3);
                        zm2 zm2Var = new zm2(aob.b0(hl.L(6.0f), aob.p1(0.1f, cbVar.s)), new ab(cbVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance.first(), characterInstance.next()), (byte) 1));
                        int L = hl.L(28.0f);
                        int L2 = hl.L(28.0f);
                        zm2Var.h = L;
                        zm2Var.n = L2;
                        de0Var.setImageDrawable(zm2Var);
                    } else {
                        de0Var.setImageBitmap(bitmap);
                    }
                    cbVar.n.setVisibility(8);
                    Uri parse = Uri.parse(str);
                    String str2 = m01.x(parse, null, null, m01.a(parse.getHost()), null);
                    String str3 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                    textView.setText(str3);
                    if (!TextUtils.isEmpty(charSequence2)) {
                        textView2.setText(hl.u1(textView2.getText(), charSequence2, vnbVar));
                        textView.setText(hl.u1(textView.getText(), charSequence2, vnbVar));
                    }
                    textView2.setText(pv3.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setText(pv3.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                    cbVar.h.setText(ob6.D0().o0().format(n01Var.b));
                    cbVar.r.a(false, false);
                    FrameLayout.LayoutParams layoutParams3 = layoutParams;
                    layoutParams3.rightMargin = hl.L(70.0f);
                    cbVar.c.setLayoutParams(layoutParams3);
                    cbVar.x = z;
                    cbVar.setWillNotDraw(!z);
                    return;
                }
                String str4 = Uri.parse(str).getHost().split("\\.")[r10.length - 2];
                StringBuilder sb = new StringBuilder();
                layoutParams = layoutParams2;
                sb.append(str4.substring(0, 1).toUpperCase());
                sb.append(str4.substring(1));
                textView2.setText(sb.toString());
                if (wxcVar != null) {
                }
                if (textView2.getText() == null) {
                }
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(charSequence3);
                zm2 zm2Var2 = new zm2(aob.b0(hl.L(6.0f), aob.p1(0.1f, cbVar.s)), new ab(cbVar, charSequence3.isEmpty() ? "" : charSequence3.substring(characterInstance2.first(), characterInstance2.next()), (byte) 1));
                int L3 = hl.L(28.0f);
                int L22 = hl.L(28.0f);
                zm2Var2.h = L3;
                zm2Var2.n = L22;
                de0Var.setImageDrawable(zm2Var2);
                cbVar.n.setVisibility(8);
                Uri parse2 = Uri.parse(str);
                String str22 = m01.x(parse2, null, null, m01.a(parse2.getHost()), null);
                String str32 = URLDecoder.decode(str22.replaceAll("\\+", "%2b"), "UTF-8");
                textView.setText(str32);
                if (!TextUtils.isEmpty(charSequence2)) {
                }
                textView2.setText(pv3.m(textView2.getText(), textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView.setText(pv3.m(textView.getText(), textView.getPaint().getFontMetricsInt(), false, null, 0));
                cbVar.h.setText(ob6.D0().o0().format(n01Var.b));
                cbVar.r.a(false, false);
                FrameLayout.LayoutParams layoutParams32 = layoutParams;
                layoutParams32.rightMargin = hl.L(70.0f);
                cbVar.c.setLayoutParams(layoutParams32);
                cbVar.x = z;
                cbVar.setWillNotDraw(!z);
                return;
            }
            return;
        }
        r47 r47Var = (r47) obj;
        boolean z3 = b8cVar.r;
        CharSequence charSequence4 = b8cVar.n;
        String charSequence5 = charSequence4 == null ? null : charSequence4.toString();
        boolean z4 = b8cVar.e;
        FrameLayout.LayoutParams layoutParams4 = cbVar.d;
        vnb vnbVar2 = cbVar.a;
        TextView textView3 = cbVar.f;
        de0 de0Var2 = cbVar.b;
        TextView textView4 = cbVar.e;
        cbVar.updateColors();
        TLRPC.WebPage webPage = r47.m1(r47Var) != null ? r47.m1(r47Var).webpage : null;
        String a = webPage != null ? webPage.url : fb.a(r47Var);
        wxc b2 = j84.c().b(hl.J0(a, true));
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
            de0Var2.b();
            if (b2 == null && (bitmap2 = b2.i) != null) {
                de0Var2.setImageBitmap(bitmap2);
            } else if (webPage != null || (photo = webPage.photo) == null) {
                String charSequence6 = textView4.getText() != null ? "" : textView4.getText().toString();
                BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                characterInstance3.setText(charSequence6);
                zm2 zm2Var3 = new zm2(aob.b0(hl.L(6.0f), aob.p1(0.1f, cbVar.s)), new ab(cbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance3.first(), characterInstance3.next()), (byte) 0));
                int L4 = hl.L(28.0f);
                int L5 = hl.L(28.0f);
                zm2Var3.h = L4;
                zm2Var3.n = L5;
                de0Var2.setImageDrawable(zm2Var3);
            } else {
                de0Var2.h(jn5.i(xb4.w(photo.sizes, hl.L(32.0f), true, null, true), webPage.photo), hl.L(32.0f) + "_" + hl.L(32.0f), jn5.i(xb4.w(webPage.photo.sizes, hl.L(32.0f), true, null, false), webPage.photo), hl.L(32.0f) + "_" + hl.L(32.0f), 0, r47Var);
            }
            cbVar.h.setVisibility(8);
            cbVar.n.setVisibility(!z3 ? 0 : 8);
            String a2 = webPage == null ? webPage.url : fb.a(r47Var);
            Uri parse3 = Uri.parse(a2);
            a2 = m01.x(parse3, null, null, m01.a(parse3.getHost()), null);
            a2 = URLDecoder.decode(a2.replaceAll("\\+", "%2b"), "UTF-8");
            String str7 = yx0.p(a2);
            textView3.setText(str7);
            if (!TextUtils.isEmpty(charSequence5)) {
                textView4.setText(hl.u1(textView4.getText(), charSequence5, vnbVar2));
                textView3.setText(hl.u1(textView3.getText(), charSequence5, vnbVar2));
            }
            textView4.setText(pv3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(pv3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
            cbVar.r.a(z2, false);
            layoutParams4.rightMargin = hl.L(52.0f);
            cbVar.c.setLayoutParams(layoutParams4);
            cbVar.x = z;
            cbVar.setWillNotDraw(!z);
        }
        if (b2 != null) {
            if (!TextUtils.isEmpty(b2.c)) {
                textView4.setText(b2.c);
            } else if (!TextUtils.isEmpty(b2.d)) {
                textView4.setText(b2.d);
            }
            z2 = z4;
            de0Var2.b();
            if (b2 == null) {
            }
            if (webPage != null) {
            }
            if (textView4.getText() != null) {
            }
            BreakIterator characterInstance32 = BreakIterator.getCharacterInstance();
            characterInstance32.setText(charSequence6);
            zm2 zm2Var32 = new zm2(aob.b0(hl.L(6.0f), aob.p1(0.1f, cbVar.s)), new ab(cbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance32.first(), characterInstance32.next()), (byte) 0));
            int L42 = hl.L(28.0f);
            int L52 = hl.L(28.0f);
            zm2Var32.h = L42;
            zm2Var32.n = L52;
            de0Var2.setImageDrawable(zm2Var32);
            cbVar.h.setVisibility(8);
            cbVar.n.setVisibility(!z3 ? 0 : 8);
            String a22 = webPage == null ? webPage.url : fb.a(r47Var);
            Uri parse32 = Uri.parse(a22);
            a22 = m01.x(parse32, null, null, m01.a(parse32.getHost()), null);
            a22 = URLDecoder.decode(a22.replaceAll("\\+", "%2b"), "UTF-8");
            String str72 = yx0.p(a22);
            textView3.setText(str72);
            if (!TextUtils.isEmpty(charSequence5)) {
            }
            textView4.setText(pv3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
            textView3.setText(pv3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
            cbVar.r.a(z2, false);
            layoutParams4.rightMargin = hl.L(52.0f);
            cbVar.c.setLayoutParams(layoutParams4);
            cbVar.x = z;
            cbVar.setWillNotDraw(!z);
        }
        String str8 = Uri.parse(a).getHost().split("\\.")[r3.length - 2];
        StringBuilder sb2 = new StringBuilder();
        z2 = z4;
        sb2.append(str8.substring(0, 1).toUpperCase());
        sb2.append(str8.substring(1));
        textView4.setText(sb2.toString());
        de0Var2.b();
        if (b2 == null) {
        }
        if (webPage != null) {
        }
        if (textView4.getText() != null) {
        }
        BreakIterator characterInstance322 = BreakIterator.getCharacterInstance();
        characterInstance322.setText(charSequence6);
        zm2 zm2Var322 = new zm2(aob.b0(hl.L(6.0f), aob.p1(0.1f, cbVar.s)), new ab(cbVar, charSequence6.isEmpty() ? "" : charSequence6.substring(characterInstance322.first(), characterInstance322.next()), (byte) 0));
        int L422 = hl.L(28.0f);
        int L522 = hl.L(28.0f);
        zm2Var322.h = L422;
        zm2Var322.n = L522;
        de0Var2.setImageDrawable(zm2Var322);
        cbVar.h.setVisibility(8);
        cbVar.n.setVisibility(!z3 ? 0 : 8);
        String a222 = webPage == null ? webPage.url : fb.a(r47Var);
        Uri parse322 = Uri.parse(a222);
        a222 = m01.x(parse322, null, null, m01.a(parse322.getHost()), null);
        a222 = URLDecoder.decode(a222.replaceAll("\\+", "%2b"), "UTF-8");
        String str722 = yx0.p(a222);
        textView3.setText(str722);
        if (!TextUtils.isEmpty(charSequence5)) {
        }
        textView4.setText(pv3.m(textView4.getText(), textView4.getPaint().getFontMetricsInt(), false, null, 0));
        textView3.setText(pv3.m(textView3.getText(), textView3.getPaint().getFontMetricsInt(), false, null, 0));
        cbVar.r.a(z2, false);
        layoutParams4.rightMargin = hl.L(52.0f);
        cbVar.c.setLayoutParams(layoutParams4);
        cbVar.x = z;
        cbVar.setWillNotDraw(!z);
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.I == b8cVar2.I && TextUtils.equals(b8cVar.n, b8cVar2.n);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new cb(context, vnbVar);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.I == b8cVar2.I && TextUtils.isEmpty(b8cVar.n) == TextUtils.isEmpty(b8cVar2.n);
    }
}
