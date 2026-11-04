package mi;

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
import b8.mf;
import b8.ne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i6;
import org.telegram.messenger.wi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class b6 extends FrameLayout implements org.telegram.ui.ActionBar.z5, g9 {
    public static final /* synthetic */ int b0 = 0;
    public y5 E;
    public boolean F;
    public boolean G;
    public j2 H;
    public String I;
    public int J;
    public dk0 K;
    public Drawable L;
    public e0.g M;
    public final RectF N;
    public boolean O;
    public int P;
    public x5 Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final org.telegram.ui.ActionBar.e6 a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final fi.j d;
    public final ai.x2 e;
    public final h1 f;
    public final h1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public a y;

    public b6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.a0 = new Paint(1);
        this.a = e6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        fi.j jVar = new fi.j(this, context);
        this.d = jVar;
        jVar.setGravity(8388627);
        jVar.setPaddingRelative(org.telegram.messenger.g0.L(6.0f), 0, 0, 0);
        jVar.setSingleLine(true);
        jVar.setIncludeFontPadding(false);
        jVar.setTextSize(1, 16.0f);
        linearLayout.addView(jVar, mf.o(18, -2));
        ai.x2 x2Var = new ai.x2(context, e6Var);
        this.e = x2Var;
        x2Var.setVisibility(8);
        x2Var.setOnClickListener(new s5(this, 0));
        linearLayout.addView(x2Var, mf.o(18, -2));
        h1 h1Var = new h1(context, e6Var);
        this.f = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        h1Var.setListener(new v5(this));
        final int i3 = 0;
        h1Var.setDelegate(new vs(this) { // from class: mi.t5
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.vs
            public final void m() {
                switch (i3) {
                    case 0:
                        b6 b6Var = this.b;
                        if (!b6Var.T && b6Var.y != null) {
                            b6Var.K();
                            b6.d(b6Var.y.b, b6Var.f.getText());
                            y5 y5Var = b6Var.E;
                            if (y5Var != null) {
                                t3.S1(((d3) y5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        b6 b6Var2 = this.b;
                        if (b6Var2.y != null) {
                            b6Var2.w();
                            y5 y5Var2 = b6Var2.E;
                            if (y5Var2 != null) {
                                t3.S1(((d3) y5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        h1Var.setOnFocusChangeListener(new ci.m(this, 5));
        linearLayout.addView(h1Var, mf.l(1.0f, 0, -2));
        addView(linearLayout, mf.e(-1, -2, 51));
        h1 h1Var2 = new h1(context, e6Var);
        this.h = h1Var2;
        h1Var2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        h1Var2.setAllowNewlines(false);
        h1Var2.setInputType(147457);
        h1Var2.setListener(new w5(this));
        final int i10 = 1;
        h1Var2.setDelegate(new vs(this) { // from class: mi.t5
            public final /* synthetic */ b6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.vs
            public final void m() {
                switch (i10) {
                    case 0:
                        b6 b6Var = this.b;
                        if (!b6Var.T && b6Var.y != null) {
                            b6Var.K();
                            b6.d(b6Var.y.b, b6Var.f.getText());
                            y5 y5Var = b6Var.E;
                            if (y5Var != null) {
                                t3.S1(((d3) y5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        b6 b6Var2 = this.b;
                        if (b6Var2.y != null) {
                            b6Var2.w();
                            y5 y5Var2 = b6Var2.E;
                            if (y5Var2 != null) {
                                t3.S1(((d3) y5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        h1Var2.setVisibility(8);
        addView(h1Var2, mf.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return d6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(b6 b6Var, boolean z10) {
        y5 y5Var;
        b6Var.f.setHint(b6Var.getHint());
        if (z10 || (y5Var = b6Var.E) == null) {
            return;
        }
        ((d3) y5Var).a.p3.Z0(b6Var, null);
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) != '/') {
            return null;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                return null;
            }
        }
        return str;
    }

    public static void d(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = d6.f(charSequence);
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
            return bd.M0(aVar.p ? 2131754014 : 2131754030, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return bd.M0(2131754029, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return bd.M0(2131754028, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return bd.M0(2131754027, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return bd.M0(2131754026, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return bd.M0(2131754025, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return bd.M0(2131754019, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return bd.M0(2131754016, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return bd.M0(2131754016, null);
        }
        if (aVar.q) {
            return bd.M0(2131754015, null);
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

    public static boolean m(h1 h1Var, int i3, int i10, int i11, int i12) {
        return h1Var.length() == 0 && i11 >= i3 && i11 <= h1Var.getWidth() + i3 && i12 >= i10 && i12 <= h1Var.getHeight() + i10;
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

    public static a6 r(String str, a aVar) {
        int i3;
        int i10;
        char charAt;
        char charAt2;
        if (str == null || aVar == null) {
            return null;
        }
        String trim = str.trim();
        int i11 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new a6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new a6(v(charAt - '0'), aVar.c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new a6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new a6(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new a6(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new a6(pageblockpullquote, 0, 0);
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
                i3 = i11;
                i11 = i10;
                return new a6(u(i11, i3), 0, 0);
            }
        }
        i3 = 2;
        return new a6(u(i11, i3), 0, 0);
    }

    public static a6 s(String str, a aVar) {
        int length;
        char charAt;
        if (aVar == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i3 = length - 1;
        if (str.charAt(i3) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        boolean z10 = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z11 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z10 || z11)) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                if (str.charAt(i11) != '#') {
                    return null;
                }
                i10++;
            }
            if (i10 < 1 || i10 > 6) {
                return null;
            }
            return new a6(v(i10), aVar.c, aVar.d);
        }
        if (!z10) {
            return null;
        }
        if (aVar.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                e(pageblockparagraph, "");
                return new a6(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new a6(pageblockblockquote, 0, 0);
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
            return new a6(pageblockparagraph2, 1, 1);
        }
        if (aVar.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new a6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new a6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static a6 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new a6(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i3, int i10) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i11 = 0; i11 < i3; i11++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i12 = 0; i12 < i10; i12++) {
                pagetablerow.cells.add(f6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i3) {
        switch (i3) {
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

    public static boolean y(h1 h1Var, int i3, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = h1Var.getLayout();
        if (layout != null && h1Var.length() != 0) {
            int paddingLeft = i11 - (h1Var.getPaddingLeft() + i3);
            int paddingTop = i12 - (h1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.g0.L(24.0f);
                int max = Math.max(0, (h1Var.getWidth() - h1Var.getPaddingLeft()) - h1Var.getPaddingRight());
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
        return d6.l(pageBlock.text);
    }

    public final void B() {
        this.f.N();
    }

    public final void C() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        a aVar = this.y;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                j2 j2Var = new j2(this, 1);
                this.H = j2Var;
                postDelayed(j2Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f.getText();
        if (text != null) {
            for (oi.d dVar : (oi.d[]) text.getSpans(0, text.length(), oi.d.class)) {
                text.removeSpan(dVar);
            }
        }
        this.I = null;
    }

    public final void D(m0 m0Var) {
        if (this.E == null || this.y == null || m0Var == null) {
            return;
        }
        List<String> list = m0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int q10 = q(str);
            if (q10 != 0) {
                ((d3) this.E).c(this.y, q10);
                return;
            }
            a6 r5 = r(str, this.y);
            if (r5 == null) {
                r5 = s(t4.c.q(str, " "), this.y);
            }
            if (r5 != null) {
                ((d3) this.E).d(this.y, r5.a, r5.b, r5.c, r5.d, r5.e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.y;
        if (aVar != null && t3.F3(aVar.b) && com.google.android.recaptcha.internal.a.u(editable)) {
            h1 h1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = h1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((h1Var.getTextSize() * 0.85f) / 1.2f));
            for (org.telegram.messenger.f6 f6Var : (org.telegram.messenger.f6[]) editable.getSpans(0, editable.length(), org.telegram.messenger.f6.class)) {
                f6Var.b = 0.85f;
            }
            for (org.telegram.ui.Components.p5 p5Var : (org.telegram.ui.Components.p5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.p5.class)) {
                p5Var.replaceFontMetrics(fontMetricsInt);
                p5Var.setSize(max);
            }
        }
    }

    public final void F() {
        y5 y5Var;
        a aVar = this.y;
        if (aVar == null || aVar.c <= 0 || (y5Var = this.E) == null) {
            return;
        }
        int b10 = ((d3) y5Var).b(aVar);
        int a10 = ((d3) this.E).a(this.y);
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
        h1 h1Var = this.f;
        h1 h1Var2 = this.h;
        if (aVar != null && p(aVar.b) && (h1Var.length() > 0 || h1Var2.length() > 0)) {
            if (h1Var2.getVisibility() != 0) {
                h1Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (h1Var2.getVisibility() != 8) {
            if (h1Var2.isFocused()) {
                h1Var.requestFocus();
            }
            h1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i3;
        Layout layout;
        int lineStart;
        h1 h1Var = this.f;
        if (h1Var.getText() != null) {
            Editable text = h1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.y.b).collapsed || (layout = h1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i3 = text.length())) {
                i3 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.R && i3 == this.S) {
                return;
            }
            this.T = true;
            try {
                x5 x5Var = this.Q;
                if (x5Var != null) {
                    text.removeSpan(x5Var);
                }
                if (i10 >= 0) {
                    if (this.Q == null) {
                        this.Q = new x5(this, 0);
                    }
                    text.setSpan(this.Q, i10, i3, 33);
                }
                this.T = false;
                this.R = i10;
                this.S = i3;
            } catch (Throwable th2) {
                this.T = false;
                throw th2;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        h1 h1Var = this.h;
        if (h1Var != null) {
            h1Var.updateColors();
        }
        int i3 = k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.d.setTextColor(k6.w0(i3, e6Var));
        if (this.L != null) {
            int w02 = k6.w0(k6.Ci, e6Var);
            Drawable drawable = this.L;
            if (drawable != this.U || w02 != this.V) {
                this.U = drawable;
                this.V = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        dk0 dk0Var = this.K;
        if (dk0Var != null) {
            ne.a(dk0Var, e6Var);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z10) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
            LinearLayout linearLayout = this.s;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.s;
        if (linearLayout2 != null && z10) {
            org.telegram.messenger.g0.E2(linearLayout2);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.s;
            int i3 = k6.i6;
            r6.R(linearLayout4, k6.a0(k6.w0(i3, this.a), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f)), null, r6.N(i3), this.a);
            this.s.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
            addView(this.s, mf.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            int i10 = 1;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, mf.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.x, mf.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            oi.q qVar = oi.k.a;
            synchronized (qVar.a) {
                try {
                    if (!qVar.s) {
                        qVar.d.execute(new oi.l(qVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.s.setOnClickListener(new s5(this, i10));
            this.s.setOnLongClickListener(new u5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i11 = k6.G6;
        k6.r1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, k6.w0(i11, this.a));
        n6 L = r6.L(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i11);
        ImageView imageView2 = this.x;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = L.a;
        float f10 = L.d;
        int Q = r6.Q(i12, -1, 2, f10, e6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        r6.O(imageView2, 5, i12, -1, 2, f10, e6Var, Q, porterDuffColorFilter).h = mode;
        r6.W(this.w, L, this.a);
        if (TextUtils.isEmpty(str)) {
            this.w.setText(bd.M0(2131754017, null));
        } else {
            this.w.setText(wi.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        a aVar = this.y;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            h1 h1Var = this.f;
            if (h1Var.length() > 0 && (h1Var.c(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        this.d.setTypeface(z10 ? org.telegram.messenger.g0.o() : null);
        a aVar2 = this.y;
        if (aVar2 == null || aVar2.d <= 0) {
            return;
        }
        c(aVar2);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
    }

    public final void c(a aVar) {
        int b10;
        int i3;
        a aVar2;
        int i10;
        int i11 = aVar.c;
        ai.x2 x2Var = this.e;
        View view = this.c;
        fi.j jVar = this.d;
        if (i11 <= 0) {
            view.setVisibility(8);
            jVar.setVisibility(8);
            x2Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = org.telegram.messenger.g0.L(24.0f) * (i11 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i11 > 1 ? 0 : 8);
        if (aVar.e) {
            jVar.setVisibility(8);
            x2Var.setVisibility(0);
            ((CheckBoxBase) x2Var.b).f(-1, aVar.f, false);
            return;
        }
        x2Var.setVisibility(8);
        jVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) jVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.g0.L(18.0f);
        } else {
            y5 y5Var = this.E;
            if (y5Var != null) {
                TextPaint paint = jVar.getPaint();
                ArrayList arrayList = ((d3) y5Var).a.t3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i3 = aVar.c) <= 0 || aVar.d <= 0) {
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint.measureText(a1.g.o(aVar.d, ".", new StringBuilder()))), org.telegram.messenger.g0.L(28.0f));
                } else {
                    int i12 = indexOf;
                    while (i12 > 0) {
                        a aVar3 = (a) arrayList.get(i12 - 1);
                        int i13 = aVar3.c;
                        if (i13 < i3 || (i13 == i3 && aVar3.d <= 0)) {
                            break;
                        } else {
                            i12--;
                        }
                    }
                    int i14 = indexOf + 1;
                    while (i14 < arrayList.size() && (i10 = (aVar2 = (a) arrayList.get(i14)).c) >= i3 && (i10 != i3 || aVar2.d > 0)) {
                        i14++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.g0.o());
                    float f10 = 0.0f;
                    while (i12 < i14) {
                        a aVar4 = (a) arrayList.get(i12);
                        if (aVar4.c == i3 && aVar4.d > 0) {
                            f10 = Math.max(f10, paint2.measureText(aVar4.d + "."));
                        }
                        i12++;
                    }
                    b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(f10), org.telegram.messenger.g0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.g0.L(28.0f);
                TextPaint paint3 = jVar.getPaint();
                b10 = org.telegram.messenger.k5.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            jVar.setLayoutParams(layoutParams2);
        }
        jVar.setText(aVar.d == 0 ? "" : a1.g.o(aVar.d, ".", new StringBuilder()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h1 h1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i3;
        a aVar = this.y;
        LinearLayout linearLayout = this.b;
        Paint paint = this.a0;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        h1 h1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            h1Var = h1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.K == null) {
                        dk0 dk0Var = new dk0(this);
                        this.K = dk0Var;
                        dk0Var.a(null, null, null, this.a, 1);
                        ne.a(this.K, e6Var);
                    }
                    if (this.L == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.L = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(k6.Ci, e6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = h1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            width = Math.min(width, layout.getLineLeft(i10) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                            f10 = Math.max(f10, layout.getLineRight(i10) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (h1Var.getHint() != null) {
                        float measureText = h1Var.getPaint().measureText(h1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    h1 h1Var3 = this.h;
                    if (h1Var3.getVisibility() == 0) {
                        Layout layout2 = h1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                width = Math.min(width, layout2.getLineLeft(i11) + h1Var3.getPaddingLeft() + h1Var3.getLeft());
                                f10 = Math.max(f10, layout2.getLineRight(i11) + h1Var3.getPaddingLeft() + h1Var3.getLeft());
                            }
                        } else if (h1Var3.getHint() != null) {
                            float measureText2 = h1Var3.getPaint().measureText(h1Var3.getHint().toString());
                            width = Math.min(width, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        }
                    }
                    if (width < f10) {
                        float L = width - org.telegram.messenger.g0.L(30.0f);
                        float L2 = org.telegram.messenger.g0.L(30.0f) + f10;
                        float floor = (float) Math.floor(az.Y0 / 2.0f);
                        int L3 = org.telegram.messenger.g0.L(8.0f);
                        int height = getHeight() - org.telegram.messenger.g0.L(8.0f);
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set(L, L3, L2, height);
                        this.K.c(floor, floor, floor, 1.0f, canvas2, rectF);
                        canvas2.save();
                        int i12 = (int) L;
                        this.L.setBounds(org.telegram.messenger.g0.L(8.0f) + i12, org.telegram.messenger.g0.L(7.0f) + L3, this.L.getIntrinsicWidth() + org.telegram.messenger.g0.L(8.0f) + i12, this.L.getIntrinsicHeight() + org.telegram.messenger.g0.L(7.0f) + L3);
                        canvas2.scale(-1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                        this.L.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i13 = (int) L2;
                        this.L.setBounds((i13 - org.telegram.messenger.g0.L(8.0f)) - this.L.getIntrinsicWidth(), (height - org.telegram.messenger.g0.L(7.0f)) - this.L.getIntrinsicHeight(), i13 - org.telegram.messenger.g0.L(8.0f), height - org.telegram.messenger.g0.L(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                        this.L.draw(canvas2);
                        canvas2.restore();
                    }
                }
            } else {
                if (this.K == null) {
                    dk0 dk0Var2 = new dk0(this);
                    this.K = dk0Var2;
                    dk0Var2.a(null, null, null, this.a, 1);
                    ne.a(this.K, e6Var);
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(16.0f), getHeight() - org.telegram.messenger.g0.L(8.0f));
                float floor2 = (float) Math.floor(az.Y0 / 3.0f);
                canvas2 = canvas;
                this.K.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                this.K.f(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(k6.w0(k6.ll, e6Var));
            int c2 = ne.c(this.y);
            int d = ne.d(this.y);
            int width2 = getWidth();
            if (c2 > 0 || d > 0) {
                int L4 = org.telegram.messenger.g0.L(16.0f) + c2;
                int L5 = org.telegram.messenger.g0.L(16.0f) + d;
                i3 = bd.a0 ? L5 : L4;
                int width3 = getWidth();
                if (!bd.a0) {
                    L4 = L5;
                }
                width2 = width3 - L4;
            } else {
                i3 = 0;
            }
            float L6 = (i3 > 0 || width2 < getWidth()) ? org.telegram.messenger.g0.L(8.0f) : 0;
            h1Var = h1Var2;
            canvas.drawRoundRect(i3, org.telegram.messenger.g0.L(7.0f), width2, getHeight() - org.telegram.messenger.g0.L(7.0f), L6, L6, paint);
            canvas2 = canvas;
        }
        if (this.W) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = h1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + h1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(f11, layout3.getLineRight(i14) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + h1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float L7 = width4 - org.telegram.messenger.g0.L(4.0f);
                paint.setColor(k6.r1(0.05f, k6.w0(k6.G6, e6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L7, height2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + f11, f12 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        y5 y5Var = this.E;
        h9 textSelectionHelper = y5Var != null ? ((d3) y5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            k(arrayList);
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                s9 s9Var = (s9) arrayList.get(i15);
                canvas2.save();
                canvas2.translate(s9Var.getX(), s9Var.getY());
                textSelectionHelper.Z(canvas2, this, i15);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (o()) {
            if (this.M == null) {
                this.M = new e0.g(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
            int w02 = k6.w0(k6.Ci, e6Var);
            int L8 = org.telegram.messenger.g0.L(3.333f);
            this.M.d(canvas2, this.N, org.telegram.messenger.k5.z(16.0f, getWidth(), L8), org.telegram.messenger.k5.z(8.0f, getHeight(), L8), w02, pageblockblockquote.collapsed, l());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (l() && this.M != null) {
            boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.O) {
                            this.O = false;
                            this.M.g(false);
                            return true;
                        }
                    } else if (this.O) {
                        this.M.g(contains);
                        return true;
                    }
                } else if (this.O) {
                    this.O = false;
                    this.M.g(false);
                    if (contains && o()) {
                        ((TL_iv.pageBlockBlockquote) this.y.b).collapsed = !r6.collapsed;
                        H();
                        invalidate();
                        y5 y5Var = this.E;
                        if (y5Var != null) {
                            t3 t3Var = ((d3) y5Var).a;
                            g2 g2Var = t3Var.R3;
                            if (g2Var != null) {
                                g2Var.g();
                            }
                            t3Var.p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.O = true;
                this.M.g(true);
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
    public final void f(a aVar, y5 y5Var, boolean z10) {
        float f10;
        float f11;
        a aVar2;
        int c2;
        boolean z11;
        boolean p10;
        SpannableStringBuilder spannableStringBuilder;
        this.y = aVar;
        this.E = y5Var;
        this.F = z10;
        this.S = -1;
        this.R = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        h1 h1Var = this.f;
        h1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i3 = az.W0;
        h1Var.setCenterEmptyHint(false);
        h1Var.setHint(getHint());
        h1Var.setTextColorKey(k6.G6);
        h1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f10 = 8.0f;
            setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(19.0f));
            h1Var.setInputType(655505);
            h1Var.setAllowNewlines(true);
            h1Var.setSoftEnterNewline(false);
            h1Var.setGravity(8388659);
            h1Var.setTextSize(1, i3 - 1);
            h1Var.setTypeface(Typeface.MONOSPACE);
            h1Var.setLineSpacing(h1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            h1Var.setAccentHint(false);
        } else {
            f10 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                h1Var.setInputType(147457);
                h1Var.setAllowNewlines(false);
                h1Var.setSoftEnterNewline(false);
                h1Var.setGravity(8388659);
                setPadding(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(16.0f));
                h1Var.setTextSize(1, Math.max(8, i3 - 2));
                h1Var.setTypeface(null);
                h1Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    h1Var.setInputType(147457);
                    h1Var.setAllowNewlines(false);
                    h1Var.setSoftEnterNewline(false);
                    h1Var.setGravity(8388659);
                    boolean z12 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z13 = z12 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f11 = 24.0f;
                    setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(z13 ? 11.0f : 5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(z13 ? 7.0f : 4.66f));
                    a aVar3 = this.y;
                    if (aVar3 != null && aVar3.c > 0) {
                        int L = org.telegram.messenger.g0.L(16.0f);
                        y5 y5Var2 = this.E;
                        int b10 = y5Var2 != null ? ((d3) y5Var2).b(this.y) : org.telegram.messenger.g0.L(8.0f);
                        int L2 = org.telegram.messenger.g0.L(16.0f);
                        y5 y5Var3 = this.E;
                        setPadding(L, b10, L2, y5Var3 != null ? ((d3) y5Var3).a(this.y) : org.telegram.messenger.g0.L(11.0f));
                    }
                    if (z12) {
                        h1Var.setTextSize(1, i3 + 3);
                        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        h1Var.setTextSize(1, i3 + 2);
                        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        h1Var.setTextSize(1, i3 + 1);
                        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        h1Var.setTextSize(1, i3);
                        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        h1Var.setTextSize(1, i3 - 1);
                        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        h1Var.setTextSize(1, i3 - 2);
                        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        h1Var.setTextSize(1, i3 - 2);
                        h1Var.setTypeface(null);
                        h1Var.setTextColorKey(k6.Md);
                    } else {
                        h1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.y) == null || aVar2.k.isEmpty()) ? i3 : Math.max(8, i3 - 2));
                        h1Var.setTypeface(null);
                    }
                    h1Var.setAccentHint(false);
                    c2 = ne.c(aVar);
                    int d = ne.d(aVar);
                    if (c2 <= 0 || d > 0) {
                        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r7, 1, 16, 10))) + (z11 ? org.telegram.messenger.g0.L(f11) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.recaptcha.internal.a.e(r8, 1, 16, 10));
                        }
                        if (z11) {
                            c2 += org.telegram.messenger.g0.L(f10);
                            d += org.telegram.messenger.g0.L(f10);
                        }
                        if (bd.a0) {
                            setPadding(getPaddingLeft() + c2, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c2, paddingBottom);
                        }
                    }
                    c(aVar);
                    J(aVar.b, false);
                    if (!String.valueOf(h1Var.getText()).equals(z(aVar.b))) {
                        SpannableStringBuilder A = A(aVar.b);
                        if (t3.F3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(A);
                            d6.o(spannableString, 0, spannableString.length(), 1, false, null);
                            d6.o(spannableString, 0, spannableString.length(), 2, false, null);
                            spannableStringBuilder = spannableString;
                        } else {
                            spannableStringBuilder = A;
                        }
                        h1Var.setTextSilently(i6.n(spannableStringBuilder, h1Var.getPaint().getFontMetricsInt(), false, null, 0, t3.F3(aVar.b) ? 0.85f : 1.0f, 0));
                        E(h1Var.getText());
                        h1Var.f();
                        this.I = null;
                    }
                    E(h1Var.getText());
                    K();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    p10 = p(pageBlock3);
                    h1 h1Var2 = this.h;
                    if (p10) {
                        h1Var2.setVisibility(8);
                    } else {
                        i(pageBlock3);
                        h1Var2.setTextSize(1, Math.max(8, az.W0 - 2));
                        h1Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                        h1Var2.setTextColorKey(k6.Ci);
                        h1Var2.setAccentHint(true);
                        h1Var2.setHint(bd.M0(2131754020, null));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            h1Var2.setGravity(49);
                        } else {
                            h1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(h1Var2.getText()).equals(d6.l(j(pageBlock3)))) {
                            h1Var2.setTextSilently(i6.m(d6.r(j(pageBlock3), null, true), h1Var2.getPaint().getFontMetricsInt(), false, null, 0));
                            h1Var2.f();
                        }
                        G();
                    }
                    C();
                }
                h1Var.setInputType(147457);
                h1Var.setAllowNewlines(false);
                h1Var.setSoftEnterNewline(true);
                h1Var.setGravity(49);
                h1Var.setCenterEmptyHint(true);
                setPadding(org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(16.0f));
                h1Var.setTextSize(1, Math.max(8, i3 - 2));
                h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/ritalic.ttf"));
                h1Var.setAccentHint(true);
            }
        }
        f11 = 24.0f;
        c2 = ne.c(aVar);
        int d10 = ne.d(aVar);
        if (c2 <= 0) {
        }
        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        if (aVar.n) {
        }
        if (aVar.o) {
        }
        if (z11) {
        }
        if (bd.a0) {
        }
        c(aVar);
        J(aVar.b, false);
        if (!String.valueOf(h1Var.getText()).equals(z(aVar.b))) {
        }
        E(h1Var.getText());
        K();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        p10 = p(pageBlock32);
        h1 h1Var22 = this.h;
        if (p10) {
        }
        C();
    }

    public final int g(int i3, int i10) {
        Layout layout;
        if (l()) {
            h1 h1Var = this.h;
            if (h1Var.getVisibility() == 0 && (layout = h1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new e0.g(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + h1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                int L = org.telegram.messenger.g0.L(3.333f);
                float z10 = org.telegram.messenger.k5.z(16.0f, i3, L);
                this.M.getClass();
                float D = z10 - org.telegram.messenger.k5.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + r6.a);
                this.M.getClass();
                int i11 = i10 - L;
                float L2 = i11 - org.telegram.messenger.g0.L(17.66f);
                float f10 = i11;
                boolean z11 = lineRight > D;
                boolean z12 = lineBottom > L2 && lineTop < f10;
                if (z11 && z12) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + org.telegram.messenger.g0.L(4.0f)) + r2) + L) - i10));
                }
            }
        }
        return 0;
    }

    public h1 getAuthorEditText() {
        return this.h;
    }

    public h1 getEditText() {
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
        h1 h1Var = this.h;
        if (h1Var.getVisibility() != 0) {
            h1Var.setVisibility(0);
            requestLayout();
        }
        h1Var.N();
        h1Var.setSelection(h1Var.length());
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        Layout layout;
        h1 h1Var = this.f;
        Layout layout2 = h1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new c5(layout2, h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft(), h1Var.getPaddingTop() + h1Var.getTop() + linearLayout.getTop(), 1));
        }
        h1 h1Var2 = this.h;
        if (h1Var2.getVisibility() != 0 || (layout = h1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new c5(layout, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop(), 2));
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        H();
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            super.onLayout(z10, i3, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        h1Var.layout(paddingLeft, measuredHeight, h1Var.getMeasuredWidth() + paddingLeft, h1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i3);
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + h1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int g7 = g(size, paddingBottom);
        this.P = g7;
        setMeasuredDimension(size, paddingBottom + g7);
    }

    public void setLocked(boolean z10) {
        this.f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.W == z10) {
            return;
        }
        this.W = z10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof z1) {
                ((z1) getBackground()).a(k6.w0(k6.d6, this.a));
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
        e0.g gVar = this.M;
        if (gVar != null) {
            return drawable == ((g6) gVar.e) || drawable == ((ug0) gVar.f);
        }
        return false;
    }

    public final void w() {
        a aVar = this.y;
        if (aVar == null || !p(aVar.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.y.b;
        TL_iv.RichText f10 = d6.f(this.h.getText());
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
