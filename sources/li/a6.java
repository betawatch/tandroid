package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ec;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zj0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class a6 extends FrameLayout implements org.telegram.ui.ActionBar.a6, h9 {
    public static final /* synthetic */ int a0 = 0;
    public x5 D;
    public boolean E;
    public boolean F;
    public i2 G;
    public String H;
    public int I;
    public zj0 J;
    public Drawable K;
    public e0.g L;
    public final RectF M;
    public boolean N;
    public int O;
    public w5 P;
    public int Q;
    public int R;
    public boolean S;
    public Drawable T;
    public int U;
    public boolean V;
    public final Paint W;
    public final f6 a;
    public final LinearLayout b;
    public final View c;
    public final ei.k d;
    public final ec e;
    public final g1 f;
    public final g1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public a y;

    public a6(Context context, f6 f6Var) {
        super(context);
        this.r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.W = new Paint(1);
        this.a = f6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        ei.k kVar = new ei.k(this, context);
        this.d = kVar;
        kVar.setGravity(8388627);
        kVar.setPaddingRelative(org.telegram.messenger.g0.L(6.0f), 0, 0, 0);
        kVar.setSingleLine(true);
        kVar.setIncludeFontPadding(false);
        kVar.setTextSize(1, 16.0f);
        linearLayout.addView(kVar, ha.o(18, -2));
        ec ecVar = new ec(context, f6Var);
        this.e = ecVar;
        ecVar.setVisibility(8);
        ecVar.setOnClickListener(new r5(this, 0));
        linearLayout.addView(ecVar, ha.o(18, -2));
        g1 g1Var = new g1(context, f6Var);
        this.f = g1Var;
        g1Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        g1Var.setListener(new u5(this));
        final int i7 = 0;
        g1Var.setDelegate(new xs(this) { // from class: li.s5
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.xs
            public final void m() {
                switch (i7) {
                    case 0:
                        a6 a6Var = this.b;
                        if (!a6Var.S && a6Var.y != null) {
                            a6Var.K();
                            a6.d(a6Var.y.b, a6Var.f.getText());
                            x5 x5Var = a6Var.D;
                            if (x5Var != null) {
                                t3.S1(((c3) x5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        a6 a6Var2 = this.b;
                        if (a6Var2.y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.D;
                            if (x5Var2 != null) {
                                t3.S1(((c3) x5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        g1Var.setOnFocusChangeListener(new bi.n(this, 5));
        linearLayout.addView(g1Var, ha.l(1.0f, 0, -2));
        addView(linearLayout, ha.e(-1, -2, 51));
        g1 g1Var2 = new g1(context, f6Var);
        this.h = g1Var2;
        g1Var2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        g1Var2.setAllowNewlines(false);
        g1Var2.setInputType(147457);
        g1Var2.setListener(new v5(this));
        final int i10 = 1;
        g1Var2.setDelegate(new xs(this) { // from class: li.s5
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.xs
            public final void m() {
                switch (i10) {
                    case 0:
                        a6 a6Var = this.b;
                        if (!a6Var.S && a6Var.y != null) {
                            a6Var.K();
                            a6.d(a6Var.y.b, a6Var.f.getText());
                            x5 x5Var = a6Var.D;
                            if (x5Var != null) {
                                t3.S1(((c3) x5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        a6 a6Var2 = this.b;
                        if (a6Var2.y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.D;
                            if (x5Var2 != null) {
                                t3.S1(((c3) x5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        g1Var2.setVisibility(8);
        addView(g1Var2, ha.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return c6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(a6 a6Var, boolean z9) {
        x5 x5Var;
        a6Var.f.setHint(a6Var.getHint());
        if (z9 || (x5Var = a6Var.D) == null) {
            return;
        }
        ((c3) x5Var).a.o3.o(a6Var, null);
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) != '/') {
            return null;
        }
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                return null;
            }
        }
        return str;
    }

    public static void d(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = c6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        a aVar = this.y;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return id.M0(aVar.p ? 2131754014 : 2131754030, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return id.M0(2131754029, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return id.M0(2131754028, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return id.M0(2131754027, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return id.M0(2131754026, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return id.M0(2131754025, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return id.M0(2131754019, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return id.M0(2131754016, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return id.M0(2131754016, null);
        }
        if (aVar.q) {
            return id.M0(2131754015, null);
        }
        return null;
    }

    public static void i(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
            if (pageblockblockquote.caption == null) {
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
            if (pageblockpullquote.caption == null) {
                pageblockpullquote.caption = new TL_iv.textEmpty();
            }
        }
    }

    public static TL_iv.RichText j(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean m(g1 g1Var, int i7, int i10, int i11, int i12) {
        return g1Var.length() == 0 && i11 >= i7 && i11 <= g1Var.getWidth() + i7 && i12 >= i10 && i12 <= g1Var.getHeight() + i10;
    }

    public static boolean p(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static int q(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.equals("/img") || lowerCase.equals("/pic") || lowerCase.equals("/image") || lowerCase.equals("/picture") || lowerCase.equals("/photo")) {
            return 4;
        }
        if (lowerCase.equals("/vid") || lowerCase.equals("/video")) {
            return 5;
        }
        if (lowerCase.equals("/audio") || lowerCase.equals("/music")) {
            return 1;
        }
        if (lowerCase.equals("/map") || lowerCase.equals("/location") || lowerCase.equals("/loc")) {
            return 2;
        }
        if (lowerCase.equals("/latex") || lowerCase.equals("/equation") || lowerCase.equals("/math")) {
            return 3;
        }
        if (lowerCase.equals("/toggle") || lowerCase.equals("/details")) {
            return 6;
        }
        return lowerCase.equals("/button") ? 7 : 0;
    }

    public static z5 r(String str, a aVar) {
        int i7;
        int i10;
        char charAt;
        char charAt2;
        if (str == null || aVar == null) {
            return null;
        }
        String trim = str.trim();
        int i11 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new z5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new z5(v(charAt - '0'), aVar.c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new z5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new z5(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new z5(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new z5(pageblockpullquote, 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() > 7) {
            String trim2 = lowerCase.substring(7).trim();
            int indexOf = trim2.indexOf(120);
            if (indexOf < 0) {
                indexOf = trim2.indexOf(88);
            }
            if (indexOf > 0) {
                try {
                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                    try {
                        i11 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i10 = 2;
                }
                i7 = i11;
                i11 = i10;
                return new z5(u(i11, i7), 0, 0);
            }
        }
        i7 = 2;
        return new z5(u(i11, i7), 0, 0);
    }

    public static z5 s(String str, a aVar) {
        int length;
        char charAt;
        if (aVar == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i7 = length - 1;
        if (str.charAt(i7) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        boolean z9 = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z10 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z9 || z10)) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (str.charAt(i11) != '#') {
                    return null;
                }
                i10++;
            }
            if (i10 < 1 || i10 > 6) {
                return null;
            }
            return new z5(v(i10), aVar.c, aVar.d);
        }
        if (!z9) {
            return null;
        }
        if (aVar.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                e(pageblockparagraph, "");
                return new z5(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new z5(pageblockblockquote, 0, 0);
            }
        }
        if (aVar.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
            return t(false);
        }
        if (aVar.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
            char charAt3 = str.charAt(1);
            if (charAt3 == ' ') {
                return t(false);
            }
            if (charAt3 == 'x' || charAt3 == 'X') {
                return t(true);
            }
        }
        if (aVar.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            e(pageblockparagraph2, "");
            return new z5(pageblockparagraph2, 1, 1);
        }
        if (aVar.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new z5(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new z5(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static z5 t(boolean z9) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new z5(pageblockparagraph, 1, 0, true, z9);
    }

    public static TL_iv.pageBlockTable u(int i7, int i10) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i11 = 0; i11 < i7; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i12 = 0; i12 < i10; i12++) {
                pagetablerow.cells.add(e6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i7) {
        switch (i7) {
            case 1:
                return new TL_iv.pageBlockHeading1();
            case 2:
                return new TL_iv.pageBlockHeading2();
            case 3:
                return new TL_iv.pageBlockHeading3();
            case 4:
                return new TL_iv.pageBlockHeading4();
            case 5:
                return new TL_iv.pageBlockHeading5();
            case 6:
                return new TL_iv.pageBlockHeading6();
            default:
                return null;
        }
    }

    public static boolean y(g1 g1Var, int i7, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = g1Var.getLayout();
        if (layout != null && g1Var.length() != 0) {
            int paddingLeft = i11 - (g1Var.getPaddingLeft() + i7);
            int paddingTop = i12 - (g1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.g0.L(24.0f);
                int max = Math.max(0, (g1Var.getWidth() - g1Var.getPaddingLeft()) - g1Var.getPaddingRight());
                float f10 = L;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f10);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f10);
                float f11 = paddingLeft;
                if (f11 >= max2 && f11 <= min) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return c6.l(pageBlock.text);
    }

    public final void B() {
        this.f.N();
    }

    public final void C() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.y;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                i2 i2Var = new i2(this, 1);
                this.G = i2Var;
                postDelayed(i2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f.getText();
        if (text != null) {
            for (ni.f fVar : (ni.f[]) text.getSpans(0, text.length(), ni.f.class)) {
                text.removeSpan(fVar);
            }
        }
        this.H = null;
    }

    public final void D(l0 l0Var) {
        if (this.D == null || this.y == null || l0Var == null) {
            return;
        }
        List<String> list = l0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int q10 = q(str);
            if (q10 != 0) {
                ((c3) this.D).c(this.y, q10);
                return;
            }
            z5 r10 = r(str, this.y);
            if (r10 == null) {
                r10 = s(rf.b.r(str, " "), this.y);
            }
            if (r10 != null) {
                ((c3) this.D).d(this.y, r10.a, r10.b, r10.c, r10.d, r10.e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.y;
        if (aVar != null && t3.F3(aVar.b) && com.google.android.recaptcha.internal.a.u(editable)) {
            g1 g1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = g1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((g1Var.getTextSize() * 0.85f) / 1.2f));
            for (org.telegram.messenger.f6 f6Var : (org.telegram.messenger.f6[]) editable.getSpans(0, editable.length(), org.telegram.messenger.f6.class)) {
                f6Var.b = 0.85f;
            }
            for (org.telegram.ui.Components.r5 r5Var : (org.telegram.ui.Components.r5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.r5.class)) {
                r5Var.replaceFontMetrics(fontMetricsInt);
                r5Var.setSize(max);
            }
        }
    }

    public final void F() {
        x5 x5Var;
        a aVar = this.y;
        if (aVar == null || aVar.c <= 0 || (x5Var = this.D) == null) {
            return;
        }
        int b10 = ((c3) x5Var).b(aVar);
        int a10 = ((c3) this.D).a(this.y);
        a aVar2 = this.y;
        if (aVar2.n) {
            b10 = aVar2.l <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r0, 1, 16, 10));
        }
        a aVar3 = this.y;
        if (aVar3.o) {
            a10 = aVar3.m <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r1, 1, 16, 10));
        }
        if (b10 == getPaddingTop() && a10 == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b10, getPaddingRight(), a10);
    }

    public final void G() {
        a aVar = this.y;
        g1 g1Var = this.f;
        g1 g1Var2 = this.h;
        if (aVar != null && p(aVar.b) && (g1Var.length() > 0 || g1Var2.length() > 0)) {
            if (g1Var2.getVisibility() != 0) {
                g1Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (g1Var2.getVisibility() != 8) {
            if (g1Var2.isFocused()) {
                g1Var.requestFocus();
            }
            g1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i7;
        Layout layout;
        int lineStart;
        g1 g1Var = this.f;
        if (g1Var.getText() != null) {
            Editable text = g1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.y.b).collapsed || (layout = g1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i7 = text.length())) {
                i7 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.Q && i7 == this.R) {
                return;
            }
            this.S = true;
            try {
                w5 w5Var = this.P;
                if (w5Var != null) {
                    text.removeSpan(w5Var);
                }
                if (i10 >= 0) {
                    if (this.P == null) {
                        this.P = new w5(this, 0);
                    }
                    text.setSpan(this.P, i10, i7, 33);
                }
                this.S = false;
                this.Q = i10;
                this.R = i7;
            } catch (Throwable th2) {
                this.S = false;
                throw th2;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.updateColors();
        }
        int i7 = k6.G6;
        f6 f6Var = this.a;
        this.d.setTextColor(k6.w0(i7, f6Var));
        if (this.K != null) {
            int w02 = k6.w0(k6.Ci, f6Var);
            Drawable drawable = this.K;
            if (drawable != this.T || w02 != this.U) {
                this.T = drawable;
                this.U = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        zj0 zj0Var = this.J;
        if (zj0Var != null) {
            c8.l1.a(zj0Var, f6Var);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z9) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.s;
        if (linearLayout2 != null && z9) {
            org.telegram.messenger.g0.E2(linearLayout2);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.s;
            int i7 = k6.i6;
            r6.R(linearLayout4, k6.a0(k6.w0(i7, this.a), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f)), null, r6.N(i7), this.a);
            this.s.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
            addView(this.s, ha.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            int i10 = 1;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, ha.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.x, ha.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            ni.s sVar = ni.m.a;
            synchronized (sVar.a) {
                try {
                    if (!sVar.s) {
                        sVar.d.execute(new ni.n(sVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.s.setOnClickListener(new r5(this, i10));
            this.s.setOnLongClickListener(new t5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i11 = k6.G6;
        k6.r1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, k6.w0(i11, this.a));
        n6 L = r6.L(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i11);
        ImageView imageView2 = this.x;
        f6 f6Var = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = L.a;
        float f10 = L.d;
        int Q = r6.Q(i12, -1, 2, f10, f6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        r6.O(imageView2, 5, i12, -1, 2, f10, f6Var, Q, porterDuffColorFilter).h = mode;
        r6.W(this.w, L, this.a);
        if (TextUtils.isEmpty(str)) {
            this.w.setText(id.M0(2131754017, null));
        } else {
            this.w.setText(fj.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        a aVar = this.y;
        boolean z9 = false;
        if (aVar != null && aVar.d > 0) {
            g1 g1Var = this.f;
            if (g1Var.length() > 0 && (g1Var.c(0, 1) & 1) != 0) {
                z9 = true;
            }
        }
        this.d.setTypeface(z9 ? org.telegram.messenger.g0.o() : null);
        a aVar2 = this.y;
        if (aVar2 == null || aVar2.d <= 0) {
            return;
        }
        c(aVar2);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
    }

    public final void c(a aVar) {
        int b10;
        int i7;
        a aVar2;
        int i10;
        int i11 = aVar.c;
        ec ecVar = this.e;
        View view = this.c;
        ei.k kVar = this.d;
        if (i11 <= 0) {
            view.setVisibility(8);
            kVar.setVisibility(8);
            ecVar.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = org.telegram.messenger.g0.L(24.0f) * (i11 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i11 > 1 ? 0 : 8);
        if (aVar.e) {
            kVar.setVisibility(8);
            ecVar.setVisibility(0);
            ((CheckBoxBase) ecVar.b).f(-1, aVar.f, false);
            return;
        }
        ecVar.setVisibility(8);
        kVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) kVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.g0.L(18.0f);
        } else {
            x5 x5Var = this.D;
            if (x5Var != null) {
                TextPaint paint = kVar.getPaint();
                ArrayList arrayList = ((c3) x5Var).a.s3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i7 = aVar.c) <= 0 || aVar.d <= 0) {
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint.measureText(a8.p0.n(aVar.d, ".", new StringBuilder()))), org.telegram.messenger.g0.L(28.0f));
                } else {
                    int i12 = indexOf;
                    while (i12 > 0) {
                        a aVar3 = (a) arrayList.get(i12 - 1);
                        int i13 = aVar3.c;
                        if (i13 < i7 || (i13 == i7 && aVar3.d <= 0)) {
                            break;
                        } else {
                            i12--;
                        }
                    }
                    int i14 = indexOf + 1;
                    while (i14 < arrayList.size() && (i10 = (aVar2 = (a) arrayList.get(i14)).c) >= i7 && (i10 != i7 || aVar2.d > 0)) {
                        i14++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.g0.o());
                    float f10 = 0.0f;
                    while (i12 < i14) {
                        a aVar4 = (a) arrayList.get(i12);
                        if (aVar4.c == i7 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i12++;
                    }
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(f10), org.telegram.messenger.g0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.g0.L(28.0f);
                TextPaint paint3 = kVar.getPaint();
                b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            kVar.setLayoutParams(layoutParams2);
        }
        kVar.setText(aVar.d == 0 ? "" : a8.p0.n(aVar.d, ".", new StringBuilder()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g1 g1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i7;
        a aVar = this.y;
        LinearLayout linearLayout = this.b;
        Paint paint = this.W;
        f6 f6Var = this.a;
        g1 g1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            g1Var = g1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        zj0 zj0Var = new zj0(this);
                        this.J = zj0Var;
                        zj0Var.a(null, null, null, this.a, 1);
                        c8.l1.a(this.J, f6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.Ci, f6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = g1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            width = Math.min(width, layout.getLineLeft(i10) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                            f10 = Math.max(f10, layout.getLineRight(i10) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (g1Var.getHint() != null) {
                        float measureText = g1Var.getPaint().measureText(g1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    g1 g1Var3 = this.h;
                    if (g1Var3.getVisibility() == 0) {
                        Layout layout2 = g1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                width = Math.min(width, layout2.getLineLeft(i11) + g1Var3.getPaddingLeft() + g1Var3.getLeft());
                                f10 = Math.max(f10, layout2.getLineRight(i11) + g1Var3.getPaddingLeft() + g1Var3.getLeft());
                            }
                        } else if (g1Var3.getHint() != null) {
                            float measureText2 = g1Var3.getPaint().measureText(g1Var3.getHint().toString());
                            width = Math.min(width, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        }
                    }
                    if (width < f10) {
                        float L = width - org.telegram.messenger.g0.L(30.0f);
                        float L2 = org.telegram.messenger.g0.L(30.0f) + f10;
                        float floor = (float) Math.floor(iz.Y0 / 2.0f);
                        int L3 = org.telegram.messenger.g0.L(8.0f);
                        int height = getHeight() - org.telegram.messenger.g0.L(8.0f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(L, L3, L2, height);
                        this.J.c(floor, floor, floor, 1.0f, canvas2, rectF);
                        canvas2.save();
                        int i12 = (int) L;
                        this.K.setBounds(org.telegram.messenger.g0.L(8.0f) + i12, org.telegram.messenger.g0.L(7.0f) + L3, this.K.getIntrinsicWidth() + org.telegram.messenger.g0.L(8.0f) + i12, this.K.getIntrinsicHeight() + org.telegram.messenger.g0.L(7.0f) + L3);
                        canvas2.scale(-1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i13 = (int) L2;
                        this.K.setBounds((i13 - org.telegram.messenger.g0.L(8.0f)) - this.K.getIntrinsicWidth(), (height - org.telegram.messenger.g0.L(7.0f)) - this.K.getIntrinsicHeight(), i13 - org.telegram.messenger.g0.L(8.0f), height - org.telegram.messenger.g0.L(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                    }
                }
            } else {
                if (this.J == null) {
                    zj0 zj0Var2 = new zj0(this);
                    this.J = zj0Var2;
                    zj0Var2.a(null, null, null, this.a, 1);
                    c8.l1.a(this.J, f6Var);
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(16.0f), getHeight() - org.telegram.messenger.g0.L(8.0f));
                float floor2 = (float) Math.floor(iz.Y0 / 3.0f);
                canvas2 = canvas;
                this.J.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                this.J.f(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(k6.w0(k6.ll, f6Var));
            int c10 = c8.l1.c(this.y);
            int d = c8.l1.d(this.y);
            int width2 = getWidth();
            if (c10 > 0 || d > 0) {
                int L4 = org.telegram.messenger.g0.L(16.0f) + c10;
                int L5 = org.telegram.messenger.g0.L(16.0f) + d;
                i7 = id.a0 ? L5 : L4;
                int width3 = getWidth();
                if (!id.a0) {
                    L4 = L5;
                }
                width2 = width3 - L4;
            } else {
                i7 = 0;
            }
            float L6 = (i7 > 0 || width2 < getWidth()) ? org.telegram.messenger.g0.L(8.0f) : 0;
            g1Var = g1Var2;
            canvas.drawRoundRect(i7, org.telegram.messenger.g0.L(7.0f), width2, getHeight() - org.telegram.messenger.g0.L(7.0f), L6, L6, paint);
            canvas2 = canvas;
        }
        if (this.V) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = g1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + g1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(f11, layout3.getLineRight(i14) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + g1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float L7 = width4 - org.telegram.messenger.g0.L(4.0f);
                paint.setColor(k6.r1(0.05f, k6.w0(k6.G6, f6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L7, height2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + f11, f12 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        x5 x5Var = this.D;
        i9 textSelectionHelper = x5Var != null ? ((c3) x5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            k(arrayList);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                t9 t9Var = (t9) arrayList.get(i15);
                canvas2.save();
                canvas2.translate(t9Var.getX(), t9Var.getY());
                textSelectionHelper.Z(canvas2, this, i15);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (o()) {
            if (this.L == null) {
                this.L = new e0.g(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
            int w02 = k6.w0(k6.Ci, f6Var);
            int L8 = org.telegram.messenger.g0.L(3.333f);
            this.L.d(canvas2, this.M, org.telegram.messenger.k5.z(16.0f, getWidth(), L8), org.telegram.messenger.k5.z(8.0f, getHeight(), L8), w02, pageblockblockquote.collapsed, l());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.L != null) {
            boolean contains = this.M.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.N) {
                            this.N = false;
                            this.L.g(false);
                            return true;
                        }
                    } else if (this.N) {
                        this.L.g(contains);
                        return true;
                    }
                } else if (this.N) {
                    this.N = false;
                    this.L.g(false);
                    if (contains && o()) {
                        ((TL_iv.pageBlockBlockquote) this.y.b).collapsed = !r6.collapsed;
                        H();
                        invalidate();
                        x5 x5Var = this.D;
                        if (x5Var != null) {
                            t3 t3Var = ((c3) x5Var).a;
                            f2 f2Var = t3Var.Q3;
                            if (f2Var != null) {
                                f2Var.g();
                            }
                            t3Var.o3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.N = true;
                this.L.g(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(a aVar, x5 x5Var, boolean z9) {
        float f10;
        float f11;
        a aVar2;
        int c10;
        boolean z10;
        boolean p10;
        SpannableStringBuilder spannableStringBuilder;
        this.y = aVar;
        this.D = x5Var;
        this.E = z9;
        this.R = -1;
        this.Q = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        g1 g1Var = this.f;
        g1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i7 = iz.W0;
        g1Var.setCenterEmptyHint(false);
        g1Var.setHint(getHint());
        g1Var.setTextColorKey(k6.G6);
        g1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f10 = 8.0f;
            setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(19.0f));
            g1Var.setInputType(655505);
            g1Var.setAllowNewlines(true);
            g1Var.setSoftEnterNewline(false);
            g1Var.setGravity(8388659);
            g1Var.setTextSize(1, i7 - 1);
            g1Var.setTypeface(Typeface.MONOSPACE);
            g1Var.setLineSpacing(g1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            g1Var.setAccentHint(false);
        } else {
            f10 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                g1Var.setInputType(147457);
                g1Var.setAllowNewlines(false);
                g1Var.setSoftEnterNewline(false);
                g1Var.setGravity(8388659);
                setPadding(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(16.0f));
                g1Var.setTextSize(1, Math.max(8, i7 - 2));
                g1Var.setTypeface(null);
                g1Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    g1Var.setInputType(147457);
                    g1Var.setAllowNewlines(false);
                    g1Var.setSoftEnterNewline(false);
                    g1Var.setGravity(8388659);
                    boolean z11 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z12 = z11 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f11 = 24.0f;
                    setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(z12 ? 11.0f : 5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(z12 ? 7.0f : 4.66f));
                    a aVar3 = this.y;
                    if (aVar3 != null && aVar3.c > 0) {
                        int L = org.telegram.messenger.g0.L(16.0f);
                        x5 x5Var2 = this.D;
                        int b10 = x5Var2 != null ? ((c3) x5Var2).b(this.y) : org.telegram.messenger.g0.L(8.0f);
                        int L2 = org.telegram.messenger.g0.L(16.0f);
                        x5 x5Var3 = this.D;
                        setPadding(L, b10, L2, x5Var3 != null ? ((c3) x5Var3).a(this.y) : org.telegram.messenger.g0.L(11.0f));
                    }
                    if (z11) {
                        g1Var.setTextSize(1, i7 + 3);
                        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        g1Var.setTextSize(1, i7 + 2);
                        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        g1Var.setTextSize(1, i7 + 1);
                        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        g1Var.setTextSize(1, i7);
                        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        g1Var.setTextSize(1, i7 - 1);
                        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        g1Var.setTextSize(1, i7 - 2);
                        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        g1Var.setTextSize(1, i7 - 2);
                        g1Var.setTypeface(null);
                        g1Var.setTextColorKey(k6.Md);
                    } else {
                        g1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.y) == null || aVar2.k.isEmpty()) ? i7 : Math.max(8, i7 - 2));
                        g1Var.setTypeface(null);
                    }
                    g1Var.setAccentHint(false);
                    c10 = c8.l1.c(aVar);
                    int d = c8.l1.d(aVar);
                    if (c10 <= 0 || d > 0) {
                        z10 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r7, 1, 16, 10))) + (z10 ? org.telegram.messenger.g0.L(f11) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r8, 1, 16, 10));
                        }
                        if (z10) {
                            c10 += org.telegram.messenger.g0.L(f10);
                            d += org.telegram.messenger.g0.L(f10);
                        }
                        if (id.a0) {
                            setPadding(getPaddingLeft() + c10, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c10, paddingBottom);
                        }
                    }
                    c(aVar);
                    J(aVar.b, false);
                    if (!String.valueOf(g1Var.getText()).equals(z(aVar.b))) {
                        SpannableStringBuilder A = A(aVar.b);
                        if (t3.F3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(A);
                            c6.o(spannableString, 0, spannableString.length(), 1, false, null);
                            c6.o(spannableString, 0, spannableString.length(), 2, false, null);
                            spannableStringBuilder = spannableString;
                        } else {
                            spannableStringBuilder = A;
                        }
                        g1Var.setTextSilently(i6.n(spannableStringBuilder, g1Var.getPaint().getFontMetricsInt(), false, null, 0, t3.F3(aVar.b) ? 0.85f : 1.0f, 0));
                        E(g1Var.getText());
                        g1Var.f();
                        this.H = null;
                    }
                    E(g1Var.getText());
                    K();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    p10 = p(pageBlock3);
                    g1 g1Var2 = this.h;
                    if (p10) {
                        g1Var2.setVisibility(8);
                    } else {
                        i(pageBlock3);
                        g1Var2.setTextSize(1, Math.max(8, iz.W0 - 2));
                        g1Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                        g1Var2.setTextColorKey(k6.Ci);
                        g1Var2.setAccentHint(true);
                        g1Var2.setHint(id.M0(2131754020, null));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            g1Var2.setGravity(49);
                        } else {
                            g1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(g1Var2.getText()).equals(c6.l(j(pageBlock3)))) {
                            g1Var2.setTextSilently(i6.m(c6.r(j(pageBlock3), null, true), g1Var2.getPaint().getFontMetricsInt(), false, null, 0));
                            g1Var2.f();
                        }
                        G();
                    }
                    C();
                }
                g1Var.setInputType(147457);
                g1Var.setAllowNewlines(false);
                g1Var.setSoftEnterNewline(true);
                g1Var.setGravity(49);
                g1Var.setCenterEmptyHint(true);
                setPadding(org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(16.0f));
                g1Var.setTextSize(1, Math.max(8, i7 - 2));
                g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/ritalic.ttf"));
                g1Var.setAccentHint(true);
            }
        }
        f11 = 24.0f;
        c10 = c8.l1.c(aVar);
        int d2 = c8.l1.d(aVar);
        if (c10 <= 0) {
        }
        z10 = aVar.b instanceof TL_iv.pageBlockPreformatted;
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        if (aVar.n) {
        }
        if (aVar.o) {
        }
        if (z10) {
        }
        if (id.a0) {
        }
        c(aVar);
        J(aVar.b, false);
        if (!String.valueOf(g1Var.getText()).equals(z(aVar.b))) {
        }
        E(g1Var.getText());
        K();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        p10 = p(pageBlock32);
        g1 g1Var22 = this.h;
        if (p10) {
        }
        C();
    }

    public final int g(int i7, int i10) {
        Layout layout;
        if (l()) {
            g1 g1Var = this.h;
            if (g1Var.getVisibility() == 0 && (layout = g1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new e0.g(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + g1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                int L = org.telegram.messenger.g0.L(3.333f);
                float z9 = org.telegram.messenger.k5.z(16.0f, i7, L);
                this.L.getClass();
                float D = z9 - org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + r6.a);
                this.L.getClass();
                int i11 = i10 - L;
                float L2 = i11 - org.telegram.messenger.g0.L(17.66f);
                float f10 = i11;
                boolean z10 = lineRight > D;
                boolean z11 = lineBottom > L2 && lineTop < f10;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + org.telegram.messenger.g0.L(4.0f)) + r2) + L) - i10));
                }
            }
        }
        return 0;
    }

    public g1 getAuthorEditText() {
        return this.h;
    }

    public g1 getEditText() {
        return this.f;
    }

    public a getRow() {
        return this.y;
    }

    public org.telegram.ui.ActionBar.j4 getStyleDelegate() {
        return this.f;
    }

    public final void h() {
        a aVar = this.y;
        if (aVar != null) {
            i(aVar.b);
        }
        g1 g1Var = this.h;
        if (g1Var.getVisibility() != 0) {
            g1Var.setVisibility(0);
            requestLayout();
        }
        g1Var.N();
        g1Var.setSelection(g1Var.length());
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        Layout layout;
        g1 g1Var = this.f;
        Layout layout2 = g1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new b5(layout2, g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft(), g1Var.getPaddingTop() + g1Var.getTop() + linearLayout.getTop(), 1));
        }
        g1 g1Var2 = this.h;
        if (g1Var2.getVisibility() != 0 || (layout = g1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new b5(layout, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop(), 2));
    }

    public final boolean l() {
        Layout layout;
        return o() && (layout = this.f.getLayout()) != null && layout.getLineCount() > 3;
    }

    public final boolean n() {
        return this.h.getVisibility() == 0;
    }

    public final boolean o() {
        a aVar = this.y;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockBlockquote);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        H();
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            super.onLayout(z9, i7, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        g1Var.layout(paddingLeft, measuredHeight, g1Var.getMeasuredWidth() + paddingLeft, g1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i7);
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        g1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + g1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int g10 = g(size, paddingBottom);
        this.O = g10;
        setMeasuredDimension(size, paddingBottom + g10);
    }

    public void setLocked(boolean z9) {
        this.f.setLocked(z9);
        this.h.setLocked(z9);
    }

    public void setShowCommandBackground(boolean z9) {
        if (this.V == z9) {
            return;
        }
        this.V = z9;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(k6.w0(k6.d6, this.a));
                invalidate();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        e0.g gVar = this.L;
        if (gVar != null) {
            return drawable == ((org.telegram.ui.Components.i6) gVar.e) || drawable == ((rg0) gVar.f);
        }
        return false;
    }

    public final void w() {
        a aVar = this.y;
        if (aVar == null || !p(aVar.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.y.b;
        TL_iv.RichText f10 = c6.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f10;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f10;
        }
    }

    public final void x() {
        a aVar = this.y;
        if (aVar != null) {
            d(aVar.b, this.f.getText());
        }
    }
}
