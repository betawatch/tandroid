package bi;

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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.gj;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.th0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class q6 extends FrameLayout implements org.telegram.ui.ActionBar.k6, j9 {
    public static final /* synthetic */ int a0 = 0;
    public n6 D;
    public boolean E;
    public boolean F;
    public r2 G;
    public String H;
    public int I;
    public dl0 J;
    public Drawable K;
    public e0.h L;
    public final RectF M;
    public boolean N;
    public int O;
    public m6 P;
    public int Q;
    public int R;
    public boolean S;
    public Drawable T;
    public int U;
    public boolean V;
    public final Paint W;
    public final org.telegram.ui.ActionBar.p6 a;
    public final LinearLayout b;
    public final View c;
    public final j6 d;
    public final t0 e;
    public final n1 f;
    public final n1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public a y;

    public q6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.W = new Paint(1);
        this.a = p6Var;
        setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        j6 j6Var = new j6(this, context);
        this.d = j6Var;
        j6Var.setGravity(8388627);
        j6Var.setPaddingRelative(org.telegram.messenger.i0.L(6.0f), 0, 0, 0);
        j6Var.setSingleLine(true);
        j6Var.setIncludeFontPadding(false);
        j6Var.setTextSize(1, 16.0f);
        linearLayout.addView(j6Var, w7.b6.o(18, -2));
        t0 t0Var = new t0(context, p6Var);
        this.e = t0Var;
        t0Var.setVisibility(8);
        t0Var.setOnClickListener(new e6(this, 0));
        linearLayout.addView(t0Var, w7.b6.o(18, -2));
        n1 n1Var = new n1(context, p6Var);
        this.f = n1Var;
        n1Var.setPadding(org.telegram.messenger.i0.L(2.0f), 0, org.telegram.messenger.i0.L(2.0f), 0);
        n1Var.setListener(new k6(this));
        final int i10 = 0;
        n1Var.setDelegate(new kt(this) { // from class: bi.f6
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kt
            public final void m() {
                switch (i10) {
                    case 0:
                        q6 q6Var = this.b;
                        if (!q6Var.S && q6Var.y != null) {
                            q6Var.K();
                            q6.d(q6Var.y.b, q6Var.f.getText());
                            n6 n6Var = q6Var.D;
                            if (n6Var != null) {
                                d4.R1(((m3) n6Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        q6 q6Var2 = this.b;
                        if (q6Var2.y != null) {
                            q6Var2.w();
                            n6 n6Var2 = q6Var2.D;
                            if (n6Var2 != null) {
                                d4.R1(((m3) n6Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        n1Var.setOnFocusChangeListener(new g6(this, i10));
        linearLayout.addView(n1Var, w7.b6.l(1.0f, 0, -2));
        addView(linearLayout, w7.b6.e(-1, -2, 51));
        n1 n1Var2 = new n1(context, p6Var);
        this.h = n1Var2;
        n1Var2.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f));
        n1Var2.setAllowNewlines(false);
        n1Var2.setInputType(147457);
        n1Var2.setListener(new l6(this));
        final int i11 = 1;
        n1Var2.setDelegate(new kt(this) { // from class: bi.f6
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kt
            public final void m() {
                switch (i11) {
                    case 0:
                        q6 q6Var = this.b;
                        if (!q6Var.S && q6Var.y != null) {
                            q6Var.K();
                            q6.d(q6Var.y.b, q6Var.f.getText());
                            n6 n6Var = q6Var.D;
                            if (n6Var != null) {
                                d4.R1(((m3) n6Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        q6 q6Var2 = this.b;
                        if (q6Var2.y != null) {
                            q6Var2.w();
                            n6 n6Var2 = q6Var2.D;
                            if (n6Var2 != null) {
                                d4.R1(((m3) n6Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        n1Var2.setVisibility(8);
        addView(n1Var2, w7.b6.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return s6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(q6 q6Var, boolean z10) {
        n6 n6Var;
        q6Var.f.setHint(q6Var.getHint());
        if (z10 || (n6Var = q6Var.D) == null) {
            return;
        }
        ((m3) n6Var).a.o3.D(q6Var, null);
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.charAt(0) != '/') {
            return null;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                return null;
            }
        }
        return str;
    }

    public static void d(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = s6.f(charSequence);
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
            return cd.L0(aVar.p ? 2131754014 : 2131754030, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return cd.L0(2131754029, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return cd.L0(2131754028, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return cd.L0(2131754027, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return cd.L0(2131754026, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return cd.L0(2131754025, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return cd.L0(2131754019, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return cd.L0(2131754016, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return cd.L0(2131754016, null);
        }
        if (aVar.q) {
            return cd.L0(2131754015, null);
        }
        return null;
    }

    public static void j(TL_iv.PageBlock pageBlock) {
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

    public static TL_iv.RichText k(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean m(n1 n1Var, int i10, int i11, int i12, int i13) {
        return n1Var.length() == 0 && i12 >= i10 && i12 <= n1Var.getWidth() + i10 && i13 >= i11 && i13 <= n1Var.getHeight() + i11;
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

    public static p6 r(a aVar, String str) {
        int i10;
        int i11;
        char charAt;
        char charAt2;
        if (str == null || aVar == null) {
            return null;
        }
        String trim = str.trim();
        int i12 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new p6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new p6(v(charAt - '0'), aVar.c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new p6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new p6(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new p6(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new p6(pageblockpullquote, 0, 0);
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
                    i11 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                    try {
                        i12 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i11 = 2;
                }
                i10 = i12;
                i12 = i11;
                return new p6(u(i12, i10), 0, 0);
            }
        }
        i10 = 2;
        return new p6(u(i12, i10), 0, 0);
    }

    public static p6 s(a aVar, String str) {
        int length;
        char charAt;
        if (aVar == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i10 = length - 1;
        if (str.charAt(i10) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        boolean z10 = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z11 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z10 || z11)) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (str.charAt(i12) != '#') {
                    return null;
                }
                i11++;
            }
            if (i11 < 1 || i11 > 6) {
                return null;
            }
            return new p6(v(i11), aVar.c, aVar.d);
        }
        if (!z10) {
            return null;
        }
        if (aVar.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                e(pageblockparagraph, "");
                return new p6(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new p6(pageblockblockquote, 0, 0);
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
            return new p6(pageblockparagraph2, 1, 1);
        }
        if (aVar.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new p6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new p6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static p6 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new p6(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable u(int i10, int i11) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i12 = 0; i12 < i10; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i13 = 0; i13 < i11; i13++) {
                pagetablerow.cells.add(w6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock v(int i10) {
        switch (i10) {
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

    public static boolean y(n1 n1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = n1Var.getLayout();
        if (layout != null && n1Var.length() != 0) {
            int paddingLeft = i12 - (n1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (n1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.i0.L(24.0f);
                int max = Math.max(0, (n1Var.getWidth() - n1Var.getPaddingLeft()) - n1Var.getPaddingRight());
                float f7 = L;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f7);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f7);
                float f10 = paddingLeft;
                if (f10 >= max2 && f10 <= min) {
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
        return s6.l(pageBlock.text);
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
                r2 r2Var = new r2(this, 1);
                this.G = r2Var;
                postDelayed(r2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f.getText();
        if (text != null) {
            for (di.e eVar : (di.e[]) text.getSpans(0, text.length(), di.e.class)) {
                text.removeSpan(eVar);
            }
        }
        this.H = null;
    }

    public final void D(p0 p0Var) {
        if (this.D == null || this.y == null || p0Var == null) {
            return;
        }
        List<String> list = p0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int q6 = q(str);
            if (q6 != 0) {
                ((m3) this.D).c(this.y, q6);
                return;
            }
            p6 r10 = r(this.y, str);
            if (r10 == null) {
                r10 = s(this.y, sc.e.A(str, " "));
            }
            if (r10 != null) {
                ((m3) this.D).d(this.y, r10.a, r10.b, r10.c, r10.d, r10.e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.y;
        if (aVar != null && d4.F3(aVar.b) && c3.i0.t(editable)) {
            n1 n1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = n1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((n1Var.getTextSize() * 0.85f) / 1.2f));
            for (org.telegram.messenger.h6 h6Var : (org.telegram.messenger.h6[]) editable.getSpans(0, editable.length(), org.telegram.messenger.h6.class)) {
                h6Var.b = 0.85f;
            }
            for (org.telegram.ui.Components.o5 o5Var : (org.telegram.ui.Components.o5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.o5.class)) {
                o5Var.replaceFontMetrics(fontMetricsInt);
                o5Var.setSize(max);
            }
        }
    }

    public final void F() {
        n6 n6Var;
        a aVar = this.y;
        if (aVar == null || aVar.c <= 0 || (n6Var = this.D) == null) {
            return;
        }
        int b10 = ((m3) n6Var).b(aVar);
        int a2 = ((m3) this.D).a(this.y);
        a aVar2 = this.y;
        if (aVar2.n) {
            b10 = aVar2.l <= 0 ? 0 : org.telegram.messenger.i0.L(i0.a.e(r0, 1, 16, 10));
        }
        a aVar3 = this.y;
        if (aVar3.o) {
            a2 = aVar3.m <= 0 ? 0 : org.telegram.messenger.i0.L(i0.a.e(r1, 1, 16, 10));
        }
        if (b10 == getPaddingTop() && a2 == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
    }

    public final void G() {
        a aVar = this.y;
        n1 n1Var = this.f;
        n1 n1Var2 = this.h;
        if (aVar != null && p(aVar.b) && (n1Var.length() > 0 || n1Var2.length() > 0)) {
            if (n1Var2.getVisibility() != 0) {
                n1Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (n1Var2.getVisibility() != 8) {
            if (n1Var2.isFocused()) {
                n1Var.requestFocus();
            }
            n1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i10;
        Layout layout;
        int lineStart;
        n1 n1Var = this.f;
        if (n1Var.getText() != null) {
            Editable text = n1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.y.b).collapsed || (layout = n1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                m6 m6Var = this.P;
                if (m6Var != null) {
                    text.removeSpan(m6Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new m6(this, 0);
                    }
                    text.setSpan(this.P, i11, i10, 33);
                }
                this.S = false;
                this.Q = i11;
                this.R = i10;
            } catch (Throwable th2) {
                this.S = false;
                throw th2;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        n1 n1Var = this.h;
        if (n1Var != null) {
            n1Var.updateColors();
        }
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        if (this.K != null) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            Drawable drawable = this.K;
            if (drawable != this.T || w02 != this.U) {
                this.T = drawable;
                this.U = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        dl0 dl0Var = this.J;
        if (dl0Var != null) {
            v7.a5.a(dl0Var, p6Var);
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
            org.telegram.messenger.i0.E2(linearLayout2);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.s;
            int i10 = org.telegram.ui.ActionBar.t6.i6;
            a7.R(linearLayout4, org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i10, this.a), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f)), null, a7.N(i10), this.a);
            this.s.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
            addView(this.s, w7.b6.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            int i11 = 1;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, w7.b6.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.x, w7.b6.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            di.s sVar = di.l.a;
            synchronized (sVar.a) {
                try {
                    if (!sVar.s) {
                        sVar.d.execute(new di.m(sVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.s.setOnClickListener(new e6(this, i11));
            this.s.setOnLongClickListener(new h6());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i12 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.t6.r1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, org.telegram.ui.ActionBar.t6.w0(i12, this.a));
        org.telegram.ui.ActionBar.w6 L = a7.L(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i12);
        ImageView imageView2 = this.x;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i13 = L.a;
        float f7 = L.d;
        int Q = a7.Q(i13, -1, 2, f7, p6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        a7.O(imageView2, 5, i13, -1, 2, f7, p6Var, Q, porterDuffColorFilter).h = mode;
        a7.W(this.w, L, this.a);
        if (TextUtils.isEmpty(str)) {
            this.w.setText(cd.L0(2131754017, null));
        } else {
            this.w.setText(gj.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        a aVar = this.y;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            n1 n1Var = this.f;
            if (n1Var.length() > 0 && (n1Var.c(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        this.d.setTypeface(z10 ? org.telegram.messenger.i0.o() : null);
        a aVar2 = this.y;
        if (aVar2 == null || aVar2.d <= 0) {
            return;
        }
        c(aVar2);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    public final void c(a aVar) {
        int b10;
        int i10;
        a aVar2;
        int i11;
        int i12 = aVar.c;
        t0 t0Var = this.e;
        View view = this.c;
        j6 j6Var = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            j6Var.setVisibility(8);
            t0Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = org.telegram.messenger.i0.L(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i12 > 1 ? 0 : 8);
        if (aVar.e) {
            j6Var.setVisibility(8);
            t0Var.setVisibility(0);
            ((CheckBoxBase) t0Var.b).f(-1, aVar.f, false);
            return;
        }
        t0Var.setVisibility(8);
        j6Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) j6Var.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.i0.L(18.0f);
        } else {
            n6 n6Var = this.D;
            if (n6Var != null) {
                TextPaint paint = j6Var.getPaint();
                ArrayList arrayList = ((m3) n6Var).a.s3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i10 = aVar.c) <= 0 || aVar.d <= 0) {
                    b10 = org.telegram.messenger.m5.b(10.0f, (int) Math.ceil(paint.measureText(a1.g.p(new StringBuilder(), aVar.d, "."))), org.telegram.messenger.i0.L(28.0f));
                } else {
                    int i13 = indexOf;
                    while (i13 > 0) {
                        a aVar3 = (a) arrayList.get(i13 - 1);
                        int i14 = aVar3.c;
                        if (i14 < i10 || (i14 == i10 && aVar3.d <= 0)) {
                            break;
                        } else {
                            i13--;
                        }
                    }
                    int i15 = indexOf + 1;
                    while (i15 < arrayList.size() && (i11 = (aVar2 = (a) arrayList.get(i15)).c) >= i10 && (i11 != i10 || aVar2.d > 0)) {
                        i15++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(org.telegram.messenger.i0.o());
                    float f7 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.c == i10 && aVar4.d > 0) {
                            f7 = Math.max(f7, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    b10 = org.telegram.messenger.m5.b(10.0f, (int) Math.ceil(f7), org.telegram.messenger.i0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.i0.L(28.0f);
                TextPaint paint3 = j6Var.getPaint();
                b10 = org.telegram.messenger.m5.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            j6Var.setLayoutParams(layoutParams2);
        }
        j6Var.setText(aVar.d == 0 ? "" : a1.g.p(new StringBuilder(), aVar.d, "."));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        n1 n1Var;
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        a aVar = this.y;
        LinearLayout linearLayout = this.b;
        Paint paint = this.W;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        n1 n1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            n1Var = n1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        dl0 dl0Var = new dl0(this);
                        this.J = dl0Var;
                        dl0Var.a(null, null, null, this.a, 1);
                        v7.a5.a(this.J, p6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = n1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f7 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            width = Math.min(width, layout.getLineLeft(i11) + n1Var.getPaddingLeft() + n1Var.getLeft() + linearLayout.getLeft());
                            f7 = Math.max(f7, layout.getLineRight(i11) + n1Var.getPaddingLeft() + n1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (n1Var.getHint() != null) {
                        float measureText = n1Var.getPaint().measureText(n1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                        f7 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                    } else {
                        f7 = 0.0f;
                    }
                    n1 n1Var3 = this.h;
                    if (n1Var3.getVisibility() == 0) {
                        Layout layout2 = n1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                width = Math.min(width, layout2.getLineLeft(i12) + n1Var3.getPaddingLeft() + n1Var3.getLeft());
                                f7 = Math.max(f7, layout2.getLineRight(i12) + n1Var3.getPaddingLeft() + n1Var3.getLeft());
                            }
                        } else if (n1Var3.getHint() != null) {
                            float measureText2 = n1Var3.getPaint().measureText(n1Var3.getHint().toString());
                            width = Math.min(width, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                            f7 = Math.max(f7, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.i0.L(2.0f));
                        }
                    }
                    if (width < f7) {
                        float L = width - org.telegram.messenger.i0.L(30.0f);
                        float L2 = org.telegram.messenger.i0.L(30.0f) + f7;
                        float floor = (float) Math.floor(tz.Y0 / 2.0f);
                        int L3 = org.telegram.messenger.i0.L(8.0f);
                        int height = getHeight() - org.telegram.messenger.i0.L(8.0f);
                        RectF rectF = org.telegram.messenger.i0.P;
                        rectF.set(L, L3, L2, height);
                        this.J.c(floor, floor, floor, 1.0f, canvas2, rectF);
                        canvas2.save();
                        int i13 = (int) L;
                        this.K.setBounds(org.telegram.messenger.i0.L(8.0f) + i13, org.telegram.messenger.i0.L(7.0f) + L3, this.K.getIntrinsicWidth() + org.telegram.messenger.i0.L(8.0f) + i13, this.K.getIntrinsicHeight() + org.telegram.messenger.i0.L(7.0f) + L3);
                        canvas2.scale(-1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) L2;
                        this.K.setBounds((i14 - org.telegram.messenger.i0.L(8.0f)) - this.K.getIntrinsicWidth(), (height - org.telegram.messenger.i0.L(7.0f)) - this.K.getIntrinsicHeight(), i14 - org.telegram.messenger.i0.L(8.0f), height - org.telegram.messenger.i0.L(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                    }
                }
            } else {
                if (this.J == null) {
                    dl0 dl0Var2 = new dl0(this);
                    this.J = dl0Var2;
                    dl0Var2.a(null, null, null, this.a, 1);
                    v7.a5.a(this.J, p6Var);
                }
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), getWidth() - org.telegram.messenger.i0.L(16.0f), getHeight() - org.telegram.messenger.i0.L(8.0f));
                float floor2 = (float) Math.floor(tz.Y0 / 3.0f);
                canvas2 = canvas;
                this.J.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                this.J.f(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ll, p6Var));
            int c10 = v7.a5.c(this.y);
            int d = v7.a5.d(this.y);
            int width2 = getWidth();
            if (c10 > 0 || d > 0) {
                int L4 = org.telegram.messenger.i0.L(16.0f) + c10;
                int L5 = org.telegram.messenger.i0.L(16.0f) + d;
                i10 = cd.X ? L5 : L4;
                int width3 = getWidth();
                if (!cd.X) {
                    L4 = L5;
                }
                width2 = width3 - L4;
            } else {
                i10 = 0;
            }
            float L6 = (i10 > 0 || width2 < getWidth()) ? org.telegram.messenger.i0.L(8.0f) : 0;
            n1Var = n1Var2;
            canvas.drawRoundRect(i10, org.telegram.messenger.i0.L(7.0f), width2, getHeight() - org.telegram.messenger.i0.L(7.0f), L6, L6, paint);
            canvas2 = canvas;
        }
        if (this.V) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = n1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + n1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + n1Var.getPaddingLeft() + n1Var.getLeft() + linearLayout.getLeft());
                    f10 = Math.max(f10, layout3.getLineRight(i15) + n1Var.getPaddingLeft() + n1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + n1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                float L7 = width4 - org.telegram.messenger.i0.L(4.0f);
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.05f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L7, height2 - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f) + f10, f11 + org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        n6 n6Var = this.D;
        k9 textSelectionHelper = n6Var != null ? ((m3) n6Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            h(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                u9 u9Var = (u9) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(u9Var.getX(), u9Var.getY());
                textSelectionHelper.Z(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (o()) {
            if (this.L == null) {
                this.L = new e0.h(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var);
            int L8 = org.telegram.messenger.i0.L(3.333f);
            this.L.d(canvas2, this.M, org.telegram.messenger.m5.z(16.0f, getWidth(), L8), org.telegram.messenger.m5.z(8.0f, getHeight(), L8), w02, pageblockblockquote.collapsed, l());
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
                        n6 n6Var = this.D;
                        if (n6Var != null) {
                            d4 d4Var = ((m3) n6Var).a;
                            o2 o2Var = d4Var.Q3;
                            if (o2Var != null) {
                                o2Var.g();
                            }
                            d4Var.o3.onContentChanged();
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
    public final void f(a aVar, n6 n6Var, boolean z10) {
        float f7;
        float f10;
        a aVar2;
        int c10;
        boolean z11;
        boolean p5;
        SpannableStringBuilder spannableStringBuilder;
        this.y = aVar;
        this.D = n6Var;
        this.E = z10;
        this.R = -1;
        this.Q = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        n1 n1Var = this.f;
        n1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i10 = tz.W0;
        n1Var.setCenterEmptyHint(false);
        n1Var.setHint(getHint());
        n1Var.setTextColorKey(org.telegram.ui.ActionBar.t6.G6);
        n1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f7 = 8.0f;
            setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(31.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(19.0f));
            n1Var.setInputType(655505);
            n1Var.setAllowNewlines(true);
            n1Var.setSoftEnterNewline(false);
            n1Var.setGravity(8388659);
            n1Var.setTextSize(1, i10 - 1);
            n1Var.setTypeface(Typeface.MONOSPACE);
            n1Var.setLineSpacing(n1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            n1Var.setAccentHint(false);
        } else {
            f7 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                n1Var.setInputType(147457);
                n1Var.setAllowNewlines(false);
                n1Var.setSoftEnterNewline(false);
                n1Var.setGravity(8388659);
                setPadding(org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(16.0f));
                n1Var.setTextSize(1, Math.max(8, i10 - 2));
                n1Var.setTypeface(null);
                n1Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    n1Var.setInputType(147457);
                    n1Var.setAllowNewlines(false);
                    n1Var.setSoftEnterNewline(false);
                    n1Var.setGravity(8388659);
                    boolean z12 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z13 = z12 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f10 = 24.0f;
                    setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(z13 ? 11.0f : 5.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(z13 ? 7.0f : 4.66f));
                    a aVar3 = this.y;
                    if (aVar3 != null && aVar3.c > 0) {
                        int L = org.telegram.messenger.i0.L(16.0f);
                        n6 n6Var2 = this.D;
                        int b10 = n6Var2 != null ? ((m3) n6Var2).b(this.y) : org.telegram.messenger.i0.L(8.0f);
                        int L2 = org.telegram.messenger.i0.L(16.0f);
                        n6 n6Var3 = this.D;
                        setPadding(L, b10, L2, n6Var3 != null ? ((m3) n6Var3).a(this.y) : org.telegram.messenger.i0.L(11.0f));
                    }
                    if (z12) {
                        n1Var.setTextSize(1, i10 + 3);
                        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        n1Var.setTextSize(1, i10 + 2);
                        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        n1Var.setTextSize(1, i10 + 1);
                        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        n1Var.setTextSize(1, i10);
                        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        n1Var.setTextSize(1, i10 - 1);
                        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        n1Var.setTextSize(1, i10 - 2);
                        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        n1Var.setTextSize(1, i10 - 2);
                        n1Var.setTypeface(null);
                        n1Var.setTextColorKey(org.telegram.ui.ActionBar.t6.Md);
                    } else {
                        n1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.y) == null || aVar2.k.isEmpty()) ? i10 : Math.max(8, i10 - 2));
                        n1Var.setTypeface(null);
                    }
                    n1Var.setAccentHint(false);
                    c10 = v7.a5.c(aVar);
                    int d = v7.a5.d(aVar);
                    if (c10 <= 0 || d > 0) {
                        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : org.telegram.messenger.i0.L(i0.a.e(r7, 1, 16, 10))) + (z11 ? org.telegram.messenger.i0.L(f10) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : org.telegram.messenger.i0.L(i0.a.e(r8, 1, 16, 10));
                        }
                        if (z11) {
                            c10 += org.telegram.messenger.i0.L(f7);
                            d += org.telegram.messenger.i0.L(f7);
                        }
                        if (cd.X) {
                            setPadding(getPaddingLeft() + c10, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c10, paddingBottom);
                        }
                    }
                    c(aVar);
                    J(aVar.b, false);
                    if (!String.valueOf(n1Var.getText()).equals(z(aVar.b))) {
                        SpannableStringBuilder A = A(aVar.b);
                        if (d4.F3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(A);
                            s6.o(spannableString, 0, spannableString.length(), 1, false, null);
                            s6.o(spannableString, 0, spannableString.length(), 2, false, null);
                            spannableStringBuilder = spannableString;
                        } else {
                            spannableStringBuilder = A;
                        }
                        n1Var.setTextSilently(org.telegram.messenger.k6.n(spannableStringBuilder, n1Var.getPaint().getFontMetricsInt(), false, null, 0, d4.F3(aVar.b) ? 0.85f : 1.0f, 0));
                        E(n1Var.getText());
                        n1Var.f();
                        this.H = null;
                    }
                    E(n1Var.getText());
                    K();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    p5 = p(pageBlock3);
                    n1 n1Var2 = this.h;
                    if (p5) {
                        n1Var2.setVisibility(8);
                    } else {
                        j(pageBlock3);
                        n1Var2.setTextSize(1, Math.max(8, tz.W0 - 2));
                        n1Var2.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
                        n1Var2.setTextColorKey(org.telegram.ui.ActionBar.t6.Ci);
                        n1Var2.setAccentHint(true);
                        n1Var2.setHint(cd.L0(2131754020, null));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            n1Var2.setGravity(49);
                        } else {
                            n1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(n1Var2.getText()).equals(s6.l(k(pageBlock3)))) {
                            n1Var2.setTextSilently(org.telegram.messenger.k6.m(s6.r(k(pageBlock3), null, true), n1Var2.getPaint().getFontMetricsInt(), false, null, 0));
                            n1Var2.f();
                        }
                        G();
                    }
                    C();
                }
                n1Var.setInputType(147457);
                n1Var.setAllowNewlines(false);
                n1Var.setSoftEnterNewline(true);
                n1Var.setGravity(49);
                n1Var.setCenterEmptyHint(true);
                setPadding(org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(16.0f));
                n1Var.setTextSize(1, Math.max(8, i10 - 2));
                n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/ritalic.ttf"));
                n1Var.setAccentHint(true);
            }
        }
        f10 = 24.0f;
        c10 = v7.a5.c(aVar);
        int d10 = v7.a5.d(aVar);
        if (c10 <= 0) {
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
        if (cd.X) {
        }
        c(aVar);
        J(aVar.b, false);
        if (!String.valueOf(n1Var.getText()).equals(z(aVar.b))) {
        }
        E(n1Var.getText());
        K();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        p5 = p(pageBlock32);
        n1 n1Var22 = this.h;
        if (p5) {
        }
        C();
    }

    public final int g(int i10, int i11) {
        Layout layout;
        if (l()) {
            n1 n1Var = this.h;
            if (n1Var.getVisibility() == 0 && (layout = n1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new e0.h(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + n1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + n1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + n1Var.getPaddingTop() + measuredHeight;
                int L = org.telegram.messenger.i0.L(3.333f);
                float z10 = org.telegram.messenger.m5.z(16.0f, i10, L);
                this.L.getClass();
                float D = z10 - org.telegram.messenger.m5.D(3.333f, 2, org.telegram.messenger.i0.L(23.66f) + r6.a);
                this.L.getClass();
                int i12 = i11 - L;
                float L2 = i12 - org.telegram.messenger.i0.L(17.66f);
                float f7 = i12;
                boolean z11 = lineRight > D;
                boolean z12 = lineBottom > L2 && lineTop < f7;
                if (z11 && z12) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + org.telegram.messenger.i0.L(4.0f)) + r2) + L) - i11));
                }
            }
        }
        return 0;
    }

    public n1 getAuthorEditText() {
        return this.h;
    }

    public n1 getEditText() {
        return this.f;
    }

    public a getRow() {
        return this.y;
    }

    public org.telegram.ui.ActionBar.r4 getStyleDelegate() {
        return this.f;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        Layout layout;
        n1 n1Var = this.f;
        Layout layout2 = n1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new o5(layout2, n1Var.getPaddingLeft() + n1Var.getLeft() + linearLayout.getLeft(), n1Var.getPaddingTop() + n1Var.getTop() + linearLayout.getTop(), 1));
        }
        n1 n1Var2 = this.h;
        if (n1Var2.getVisibility() != 0 || (layout = n1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new o5(layout, n1Var2.getPaddingLeft() + n1Var2.getLeft(), n1Var2.getPaddingTop() + n1Var2.getTop(), 2));
    }

    public final void i() {
        a aVar = this.y;
        if (aVar != null) {
            j(aVar.b);
        }
        n1 n1Var = this.h;
        if (n1Var.getVisibility() != 0) {
            n1Var.setVisibility(0);
            requestLayout();
        }
        n1Var.N();
        n1Var.setSelection(n1Var.length());
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        H();
        n1 n1Var = this.h;
        if (n1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        n1Var.layout(paddingLeft, measuredHeight, n1Var.getMeasuredWidth() + paddingLeft, n1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        F();
        int size = View.MeasureSpec.getSize(i10);
        n1 n1Var = this.h;
        if (n1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        n1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + n1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int g10 = g(size, paddingBottom);
        this.O = g10;
        setMeasuredDimension(size, paddingBottom + g10);
    }

    public void setLocked(boolean z10) {
        this.f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.V == z10) {
            return;
        }
        this.V = z10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof h2) {
                ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        e0.h hVar = this.L;
        if (hVar != null) {
            return drawable == ((org.telegram.ui.Components.e6) hVar.e) || drawable == ((th0) hVar.f);
        }
        return false;
    }

    public final void w() {
        a aVar = this.y;
        if (aVar == null || !p(aVar.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.y.b;
        TL_iv.RichText f7 = s6.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f7;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f7;
        }
    }

    public final void x() {
        a aVar = this.y;
        if (aVar != null) {
            d(aVar.b, this.f.getText());
        }
    }
}
