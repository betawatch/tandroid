package ji;

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
import di.eb;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.ba;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.xt;
import v7.c9;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class g6 extends FrameLayout implements org.telegram.ui.ActionBar.z5, p9 {
    public static final /* synthetic */ int V = 0;
    public boolean E;
    public boolean F;
    public j2 G;
    public String H;
    public int I;
    public sl0 J;
    public Drawable K;
    public ki0 L;
    public final RectF M;
    public boolean N;
    public int O;
    public c6 P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public final Paint U;
    public final org.telegram.ui.ActionBar.f6 a;
    public final LinearLayout b;
    public final View c;
    public final ci.n d;
    public final eb e;
    public final h1 f;
    public final h1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView v;
    public ImageView w;
    public a x;
    public d6 y;

    public g6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.U = new Paint(1);
        this.a = f6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        ci.n nVar = new ci.n(this, context);
        this.d = nVar;
        nVar.setGravity(8388627);
        nVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        nVar.setSingleLine(true);
        nVar.setIncludeFontPadding(false);
        nVar.setTextSize(1, 16.0f);
        linearLayout.addView(nVar, w7.x5.n(18, -2));
        eb ebVar = new eb(context, f6Var);
        this.e = ebVar;
        ebVar.setVisibility(8);
        ebVar.setOnClickListener(new x5(this, 0));
        linearLayout.addView(ebVar, w7.x5.n(18, -2));
        h1 h1Var = new h1(context, f6Var);
        this.f = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        h1Var.setListener(new a6(this));
        final int i10 = 0;
        h1Var.setDelegate(new xt(this) { // from class: ji.y5
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.xt
            public final void j() {
                switch (i10) {
                    case 0:
                        g6 g6Var = this.b;
                        if (!g6Var.S && g6Var.x != null) {
                            g6Var.J();
                            g6.e(g6Var.x.b, g6Var.f.getText());
                            d6 d6Var = g6Var.y;
                            if (d6Var != null) {
                                v3.N1(((d3) d6Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        g6 g6Var2 = this.b;
                        if (g6Var2.x != null) {
                            g6Var2.w();
                            d6 d6Var2 = g6Var2.y;
                            if (d6Var2 != null) {
                                v3.N1(((d3) d6Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        h1Var.setOnFocusChangeListener(new ah.v0(this, 1));
        linearLayout.addView(h1Var, w7.x5.l(1.0f, 0, -2));
        addView(linearLayout, w7.x5.e(-1, -2, 51));
        h1 h1Var2 = new h1(context, f6Var);
        this.h = h1Var2;
        h1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        h1Var2.setAllowNewlines(false);
        h1Var2.setInputType(147457);
        h1Var2.setListener(new b6(this));
        final int i11 = 1;
        h1Var2.setDelegate(new xt(this) { // from class: ji.y5
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.xt
            public final void j() {
                switch (i11) {
                    case 0:
                        g6 g6Var = this.b;
                        if (!g6Var.S && g6Var.x != null) {
                            g6Var.J();
                            g6.e(g6Var.x.b, g6Var.f.getText());
                            d6 d6Var = g6Var.y;
                            if (d6Var != null) {
                                v3.N1(((d3) d6Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        g6 g6Var2 = this.b;
                        if (g6Var2.x != null) {
                            g6Var2.w();
                            d6 d6Var2 = g6Var2.y;
                            if (d6Var2 != null) {
                                v3.N1(((d3) d6Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        h1Var2.setVisibility(8);
        addView(h1Var2, w7.x5.e(-1, -2, 51));
        d();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return i6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(g6 g6Var, boolean z10) {
        d6 d6Var;
        g6Var.f.setHint(g6Var.getHint());
        if (z10 || (d6Var = g6Var.y) == null) {
            return;
        }
        ((d3) d6Var).a.h3.x(g6Var, null);
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

    public static void e(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = i6.f(charSequence);
    }

    public static void f(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    private String getHint() {
        a aVar = this.x;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return LocaleController.getString(aVar.p ? R.string.ArticleHintTitle : R.string.ArticleHeading1);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return LocaleController.getString(R.string.ArticleHeading2);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return LocaleController.getString(R.string.ArticleHeading3);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return LocaleController.getString(R.string.ArticleHeading4);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return LocaleController.getString(R.string.ArticleHeading5);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return LocaleController.getString(R.string.ArticleHeading6);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return LocaleController.getString(R.string.ArticleHintCode);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return LocaleController.getString(R.string.ArticleHintQuote);
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return LocaleController.getString(R.string.ArticleHintQuote);
        }
        if (aVar.q) {
            return LocaleController.getString(R.string.ArticleHintText);
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

    public static boolean m(h1 h1Var, int i10, int i11, int i12, int i13) {
        return h1Var.length() == 0 && i12 >= i10 && i12 <= h1Var.getWidth() + i10 && i13 >= i11 && i13 <= h1Var.getHeight() + i11;
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

    public static f6 r(String str, a aVar) {
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
            return new f6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new f6(v(charAt - '0'), aVar.c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new f6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new f6(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new f6(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new f6(pageblockpullquote, 0, 0);
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
                } catch (NumberFormatException unused) {
                    i11 = 2;
                }
                try {
                    i10 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    i12 = i11;
                } catch (NumberFormatException unused2) {
                    i12 = i11;
                    i10 = 2;
                    return new f6(u(i12, i10), 0, 0);
                }
                return new f6(u(i12, i10), 0, 0);
            }
        }
        i10 = 2;
        return new f6(u(i12, i10), 0, 0);
    }

    public static f6 s(String str, a aVar) {
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
            return new f6(v(i11), aVar.c, aVar.d);
        }
        if (!z10) {
            return null;
        }
        if (aVar.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                f(pageblockparagraph, "");
                return new f6(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new f6(pageblockblockquote, 0, 0);
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
            f(pageblockparagraph2, "");
            return new f6(pageblockparagraph2, 1, 1);
        }
        if (aVar.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new f6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new f6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static f6 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        f(pageblockparagraph, "");
        return new f6(pageblockparagraph, 1, 0, true, z10);
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
                pagetablerow.cells.add(k6.f());
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

    public static boolean y(h1 h1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = h1Var.getLayout();
        if (layout != null && h1Var.length() != 0) {
            int paddingLeft = i12 - (h1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (h1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (h1Var.getWidth() - h1Var.getPaddingLeft()) - h1Var.getPaddingRight());
                float f7 = dp;
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
        return i6.l(pageBlock.text);
    }

    public final void B() {
        this.f.r();
    }

    public final void C() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.x;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                j2 j2Var = new j2(this, 1);
                this.G = j2Var;
                postDelayed(j2Var, 100L);
                return;
            }
        }
        this.I++;
        Editable text = this.f.getText();
        if (text != null) {
            for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                text.removeSpan(colorSpan);
            }
        }
        this.H = null;
    }

    public final void D(n0 n0Var) {
        if (this.y == null || this.x == null || n0Var == null) {
            return;
        }
        List<String> list = n0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int q6 = q(str);
            if (q6 != 0) {
                ((d3) this.y).c(this.x, q6);
                return;
            }
            f6 r10 = r(str, this.x);
            if (r10 == null) {
                r10 = s(p6.t(str, " "), this.x);
            }
            if (r10 != null) {
                ((d3) this.y).d(this.x, r10.a, r10.b, r10.c, r10.d, r10.e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.x;
        if (aVar != null && v3.B3(aVar.b) && com.google.android.gms.internal.vision.e2.u(editable)) {
            h1 h1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = h1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((h1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.z5 z5Var : (org.telegram.ui.Components.z5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.z5.class)) {
                z5Var.replaceFontMetrics(fontMetricsInt);
                z5Var.setSize(max);
            }
        }
    }

    public final void F() {
        d6 d6Var;
        a aVar = this.x;
        if (aVar == null || aVar.c <= 0 || (d6Var = this.y) == null) {
            return;
        }
        int b10 = ((d3) d6Var).b(aVar);
        int a2 = ((d3) this.y).a(this.x);
        a aVar2 = this.x;
        if (aVar2.n) {
            b10 = aVar2.l <= 0 ? 0 : AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r0, 1, 16, 10));
        }
        a aVar3 = this.x;
        if (aVar3.o) {
            a2 = aVar3.m <= 0 ? 0 : AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r1, 1, 16, 10));
        }
        if (b10 == getPaddingTop() && a2 == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
    }

    public final void G() {
        a aVar = this.x;
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
        int i10;
        Layout layout;
        int lineStart;
        h1 h1Var = this.f;
        if (h1Var.getText() != null) {
            Editable text = h1Var.getText();
            int i11 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.x.b).collapsed || (layout = h1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                c6 c6Var = this.P;
                if (c6Var != null) {
                    text.removeSpan(c6Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new c6(0, this);
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

    public final void I(TL_iv.PageBlock pageBlock, boolean z10) {
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
            AndroidUtilities.removeFromParent(linearLayout2);
            this.s = null;
        }
        LinearLayout linearLayout3 = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        if (linearLayout3 == null) {
            LinearLayout linearLayout4 = new LinearLayout(getContext());
            this.s = linearLayout4;
            linearLayout4.setOrientation(0);
            this.s.setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, f6Var), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)));
            this.s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.s, w7.x5.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.s.addView(this.v, w7.x5.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.w, w7.x5.r(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            CodeHighlighting.prepare();
            this.s.setOnClickListener(new x5(this, 1));
            this.s.setOnLongClickListener(new z5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int l1 = org.telegram.ui.ActionBar.j6.l1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.w.setColorFilter(new PorterDuffColorFilter(l1, PorterDuff.Mode.SRC_IN));
        this.v.setTextColor(l1);
        if (TextUtils.isEmpty(str)) {
            this.v.setText(LocaleController.getString(R.string.ArticleHintLanguage));
        } else {
            this.v.setText(MessageObject.TextLayoutBlock.capitalizeLanguage(str));
        }
        this.s.setVisibility(0);
    }

    public final void J() {
        a aVar = this.x;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            h1 h1Var = this.f;
            if (h1Var.length() > 0 && (h1Var.getCurrentStyle(0, 1) & 1) != 0) {
                z10 = true;
            }
        }
        this.d.setTypeface(z10 ? AndroidUtilities.bold() : null);
        a aVar2 = this.x;
        if (aVar2 == null || aVar2.d <= 0) {
            return;
        }
        c(aVar2);
    }

    public final void c(a aVar) {
        int b10;
        int i10;
        a aVar2;
        int i11;
        int i12 = aVar.c;
        eb ebVar = this.e;
        View view = this.c;
        ci.n nVar = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            nVar.setVisibility(8);
            ebVar.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i12 > 1 ? 0 : 8);
        if (aVar.e) {
            nVar.setVisibility(8);
            ebVar.setVisibility(0);
            ((CheckBoxBase) ebVar.b).f(-1, aVar.f, false);
            return;
        }
        ebVar.setVisibility(8);
        nVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) nVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = AndroidUtilities.dp(18.0f);
        } else {
            d6 d6Var = this.y;
            if (d6Var != null) {
                TextPaint paint = nVar.getPaint();
                ArrayList arrayList = ((d3) d6Var).a.l3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i10 = aVar.c) <= 0 || aVar.d <= 0) {
                    b10 = org.telegram.messenger.w1.b(10.0f, (int) Math.ceil(paint.measureText(a4.a.n(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
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
                    paint2.setTypeface(AndroidUtilities.bold());
                    float f7 = 0.0f;
                    while (i13 < i15) {
                        a aVar4 = (a) arrayList.get(i13);
                        if (aVar4.c == i10 && aVar4.d > 0) {
                            f7 = Math.max(f7, paint2.measureText(aVar4.d + "."));
                        }
                        i13++;
                    }
                    b10 = org.telegram.messenger.w1.b(10.0f, (int) Math.ceil(f7), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = nVar.getPaint();
                b10 = org.telegram.messenger.w1.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            nVar.setLayoutParams(layoutParams2);
        }
        nVar.setText(aVar.d == 0 ? "" : a4.a.n(aVar.d, ".", new StringBuilder()));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        this.f.t();
        h1 h1Var = this.h;
        if (h1Var != null) {
            h1Var.t();
        }
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        Drawable drawable = this.K;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
        }
        sl0 sl0Var = this.J;
        if (sl0Var != null) {
            c9.a(sl0Var, f6Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h1 h1Var;
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        a aVar = this.x;
        LinearLayout linearLayout = this.b;
        Paint paint = this.U;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        h1 h1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            h1Var = h1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        sl0 sl0Var = new sl0(this);
                        this.J = sl0Var;
                        sl0Var.a(null, null, null, this.a, 1);
                        c9.a(this.J, f6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = h1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f7 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            width = Math.min(width, layout.getLineLeft(i11) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                            f7 = Math.max(f7, layout.getLineRight(i11) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (h1Var.getHint() != null) {
                        float measureText = h1Var.getPaint().measureText(h1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f7 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f7 = 0.0f;
                    }
                    h1 h1Var3 = this.h;
                    if (h1Var3.getVisibility() == 0) {
                        Layout layout2 = h1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                width = Math.min(width, layout2.getLineLeft(i12) + h1Var3.getPaddingLeft() + h1Var3.getLeft());
                                f7 = Math.max(f7, layout2.getLineRight(i12) + h1Var3.getPaddingLeft() + h1Var3.getLeft());
                            }
                        } else if (h1Var3.getHint() != null) {
                            float measureText2 = h1Var3.getPaint().measureText(h1Var3.getHint().toString());
                            width = Math.min(width, ((getWidth() - measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                            f7 = Math.max(f7, ((getWidth() + measureText2) / 2.0f) + AndroidUtilities.dp(2.0f));
                        }
                    }
                    if (width < f7) {
                        float dp = width - AndroidUtilities.dp(30.0f);
                        float dp2 = AndroidUtilities.dp(30.0f) + f7;
                        float floor = (float) Math.floor(SharedConfig.bubbleRadius / 2.0f);
                        int dp3 = AndroidUtilities.dp(8.0f);
                        int height = getHeight() - AndroidUtilities.dp(8.0f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(dp, dp3, dp2, height);
                        this.J.b(canvas2, rectF, floor, floor, floor, 1.0f);
                        canvas2.save();
                        int i13 = (int) dp;
                        this.K.setBounds(AndroidUtilities.dp(8.0f) + i13, AndroidUtilities.dp(7.0f) + dp3, this.K.getIntrinsicWidth() + AndroidUtilities.dp(8.0f) + i13, this.K.getIntrinsicHeight() + AndroidUtilities.dp(7.0f) + dp3);
                        canvas2.scale(-1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                        canvas2.save();
                        int i14 = (int) dp2;
                        this.K.setBounds((i14 - AndroidUtilities.dp(8.0f)) - this.K.getIntrinsicWidth(), (height - AndroidUtilities.dp(7.0f)) - this.K.getIntrinsicHeight(), i14 - AndroidUtilities.dp(8.0f), height - AndroidUtilities.dp(7.0f));
                        canvas2.scale(1.0f, -1.0f, this.K.getBounds().centerX(), this.K.getBounds().centerY());
                        this.K.draw(canvas2);
                        canvas2.restore();
                    }
                }
            } else {
                if (this.J == null) {
                    sl0 sl0Var2 = new sl0(this);
                    this.J = sl0Var2;
                    sl0Var2.a(null, null, null, this.a, 1);
                    c9.a(this.J, f6Var);
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.J.b(canvas2, rectF2, floor2, floor2, floor2, 1.0f);
                this.J.e(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.xk, f6Var));
            int c10 = c9.c(this.x);
            int d = c9.d(this.x);
            int width2 = getWidth();
            if (c10 > 0 || d > 0) {
                int dp4 = AndroidUtilities.dp(16.0f) + c10;
                int dp5 = AndroidUtilities.dp(16.0f) + d;
                i10 = LocaleController.isRTL ? dp5 : dp4;
                int width3 = getWidth();
                if (!LocaleController.isRTL) {
                    dp4 = dp5;
                }
                width2 = width3 - dp4;
            } else {
                i10 = 0;
            }
            float dp6 = (i10 > 0 || width2 < getWidth()) ? AndroidUtilities.dp(8.0f) : 0;
            h1Var = h1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width2, getHeight() - AndroidUtilities.dp(7.0f), dp6, dp6, paint);
            canvas2 = canvas;
        }
        if (this.T) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = h1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + h1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                    f10 = Math.max(f10, layout3.getLineRight(i15) + h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + h1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                float dp7 = width4 - AndroidUtilities.dp(4.0f);
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(dp7, height2 - AndroidUtilities.dp(2.0f), f10 + AndroidUtilities.dp(4.0f), f11 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        d6 d6Var = this.y;
        q9 textSelectionHelper = d6Var != null ? ((d3) d6Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                ba baVar = (ba) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(baVar.getX(), baVar.getY());
                textSelectionHelper.a0(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (o()) {
            if (this.L == null) {
                this.L = new ki0(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.x.b;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            int dp8 = AndroidUtilities.dp(3.333f);
            this.L.a(canvas2, this.M, org.telegram.messenger.w1.B(16.0f, getWidth(), dp8), org.telegram.messenger.w1.B(8.0f, getHeight(), dp8), v02, pageblockblockquote.collapsed, l());
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
                            this.L.b(false);
                            return true;
                        }
                    } else if (this.N) {
                        this.L.b(contains);
                        return true;
                    }
                } else if (this.N) {
                    this.N = false;
                    this.L.b(false);
                    if (contains && o()) {
                        ((TL_iv.pageBlockBlockquote) this.x.b).collapsed = !r6.collapsed;
                        H();
                        invalidate();
                        d6 d6Var = this.y;
                        if (d6Var != null) {
                            v3 v3Var = ((d3) d6Var).a;
                            g2 g2Var = v3Var.J3;
                            if (g2Var != null) {
                                g2Var.g();
                            }
                            v3Var.h3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.N = true;
                this.L.b(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        h1 h1Var = this.f;
        Layout layout2 = h1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new g5(layout2, h1Var.getPaddingLeft() + h1Var.getLeft() + linearLayout.getLeft(), h1Var.getPaddingTop() + h1Var.getTop() + linearLayout.getTop(), 1));
        }
        h1 h1Var2 = this.h;
        if (h1Var2.getVisibility() != 0 || (layout = h1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new g5(layout, h1Var2.getPaddingLeft() + h1Var2.getLeft(), h1Var2.getPaddingTop() + h1Var2.getTop(), 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(a aVar, d6 d6Var, boolean z10) {
        float f7;
        float f10;
        a aVar2;
        int c10;
        boolean z11;
        boolean p5;
        this.x = aVar;
        this.y = d6Var;
        this.E = z10;
        this.R = -1;
        this.Q = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        h1 h1Var = this.f;
        h1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i10 = SharedConfig.fontSize;
        h1Var.setCenterEmptyHint(false);
        h1Var.setHint(getHint());
        h1Var.setTextColorKey(org.telegram.ui.ActionBar.j6.G6);
        h1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f7 = 8.0f;
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            h1Var.setInputType(655505);
            h1Var.setAllowNewlines(true);
            h1Var.setSoftEnterNewline(false);
            h1Var.setGravity(8388659);
            h1Var.setTextSize(1, i10 - 1);
            h1Var.setTypeface(Typeface.MONOSPACE);
            h1Var.setLineSpacing(h1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            h1Var.setAccentHint(false);
        } else {
            f7 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                h1Var.setInputType(147457);
                h1Var.setAllowNewlines(false);
                h1Var.setSoftEnterNewline(false);
                h1Var.setGravity(8388659);
                setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
                h1Var.setTextSize(1, Math.max(8, i10 - 2));
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
                    f10 = 24.0f;
                    setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 7.0f : 4.66f));
                    a aVar3 = this.x;
                    if (aVar3 != null && aVar3.c > 0) {
                        int dp = AndroidUtilities.dp(16.0f);
                        d6 d6Var2 = this.y;
                        int b10 = d6Var2 != null ? ((d3) d6Var2).b(this.x) : AndroidUtilities.dp(8.0f);
                        int dp2 = AndroidUtilities.dp(16.0f);
                        d6 d6Var3 = this.y;
                        setPadding(dp, b10, dp2, d6Var3 != null ? ((d3) d6Var3).a(this.x) : AndroidUtilities.dp(11.0f));
                    }
                    if (z12) {
                        h1Var.setTextSize(1, i10 + 3);
                        h1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        h1Var.setTextSize(1, i10 + 2);
                        h1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        h1Var.setTextSize(1, i10 + 1);
                        h1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        h1Var.setTextSize(1, i10);
                        h1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        h1Var.setTextSize(1, i10 - 1);
                        h1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        h1Var.setTextSize(1, i10 - 2);
                        h1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        h1Var.setTextSize(1, i10 - 2);
                        h1Var.setTypeface(null);
                        h1Var.setTextColorKey(org.telegram.ui.ActionBar.j6.Yc);
                    } else {
                        h1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.x) == null || aVar2.k.isEmpty()) ? i10 : Math.max(8, i10 - 2));
                        h1Var.setTypeface(null);
                    }
                    h1Var.setAccentHint(false);
                    c10 = c9.c(aVar);
                    int d = c9.d(aVar);
                    if (c10 <= 0 || d > 0) {
                        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r7, 1, 16, 10))) + (z11 ? AndroidUtilities.dp(f10) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(r8, 1, 16, 10));
                        }
                        if (z11) {
                            c10 += AndroidUtilities.dp(f7);
                            d += AndroidUtilities.dp(f7);
                        }
                        if (LocaleController.isRTL) {
                            setPadding(getPaddingLeft() + c10, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c10, paddingBottom);
                        }
                    }
                    c(aVar);
                    I(aVar.b, false);
                    if (!String.valueOf(h1Var.getText()).equals(z(aVar.b))) {
                        SpannableStringBuilder A = A(aVar.b);
                        if (v3.B3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(A);
                            i6.o(spannableString, 0, spannableString.length(), 1, false, null);
                            i6.o(spannableString, 0, spannableString.length(), 2, false, null);
                            A = spannableString;
                        }
                        h1Var.setTextSilently(Emoji.replaceEmoji((CharSequence) A, h1Var.getPaint().getFontMetricsInt(), false, v3.B3(aVar.b) ? 0.85f : 1.0f));
                        E(h1Var.getText());
                        h1Var.invalidateEffects();
                        this.H = null;
                    }
                    E(h1Var.getText());
                    J();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    p5 = p(pageBlock3);
                    h1 h1Var2 = this.h;
                    if (p5) {
                        h1Var2.setVisibility(8);
                    } else {
                        j(pageBlock3);
                        h1Var2.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
                        h1Var2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        h1Var2.setTextColorKey(org.telegram.ui.ActionBar.j6.Oh);
                        h1Var2.setAccentHint(true);
                        h1Var2.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            h1Var2.setGravity(49);
                        } else {
                            h1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(h1Var2.getText()).equals(i6.l(k(pageBlock3)))) {
                            h1Var2.setTextSilently(Emoji.replaceEmoji(i6.r(k(pageBlock3), null, true), h1Var2.getPaint().getFontMetricsInt(), false));
                            h1Var2.invalidateEffects();
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
                setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
                h1Var.setTextSize(1, Math.max(8, i10 - 2));
                h1Var.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                h1Var.setAccentHint(true);
            }
        }
        f10 = 24.0f;
        c10 = c9.c(aVar);
        int d10 = c9.d(aVar);
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
        if (LocaleController.isRTL) {
        }
        c(aVar);
        I(aVar.b, false);
        if (!String.valueOf(h1Var.getText()).equals(z(aVar.b))) {
        }
        E(h1Var.getText());
        J();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        p5 = p(pageBlock32);
        h1 h1Var22 = this.h;
        if (p5) {
        }
        C();
    }

    public h1 getAuthorEditText() {
        return this.h;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public h1 getEditText() {
        return this.f;
    }

    public a getRow() {
        return this.x;
    }

    public org.telegram.ui.ActionBar.w4 getStyleDelegate() {
        return this.f;
    }

    public final int h(int i10, int i11) {
        Layout layout;
        if (l()) {
            h1 h1Var = this.h;
            if (h1Var.getVisibility() == 0 && (layout = h1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new ki0(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + h1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + h1Var.getPaddingTop() + measuredHeight;
                int dp = AndroidUtilities.dp(3.333f);
                float B = org.telegram.messenger.w1.B(16.0f, i10, dp);
                this.L.getClass();
                float D = B - org.telegram.messenger.w1.D(3.333f, 2, AndroidUtilities.dp(23.66f) + r6.c);
                this.L.getClass();
                int i12 = i11 - dp;
                float dp2 = i12 - AndroidUtilities.dp(17.66f);
                float f7 = i12;
                boolean z10 = lineRight > D;
                boolean z11 = lineBottom > dp2 && lineTop < f7;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + r2) + dp) - i11));
                }
            }
        }
        return 0;
    }

    public final void i() {
        a aVar = this.x;
        if (aVar != null) {
            j(aVar.b);
        }
        h1 h1Var = this.h;
        if (h1Var.getVisibility() != 0) {
            h1Var.setVisibility(0);
            requestLayout();
        }
        h1Var.r();
        h1Var.setSelection(h1Var.length());
    }

    public final boolean l() {
        Layout layout;
        return o() && (layout = this.f.getLayout()) != null && layout.getLineCount() > 3;
    }

    public final boolean n() {
        return this.h.getVisibility() == 0;
    }

    public final boolean o() {
        a aVar = this.x;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockBlockquote);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        H();
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
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
    public final void onMeasure(int i10, int i11) {
        F();
        int size = View.MeasureSpec.getSize(i10);
        h1 h1Var = this.h;
        if (h1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        h1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + h1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int h = h(size, paddingBottom);
        this.O = h;
        setMeasuredDimension(size, paddingBottom + h);
    }

    public void setLocked(boolean z10) {
        this.f.setLocked(z10);
        this.h.setLocked(z10);
    }

    public void setShowCommandBackground(boolean z10) {
        if (this.T == z10) {
            return;
        }
        this.T = z10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        ki0 ki0Var = this.L;
        if (ki0Var != null) {
            return drawable == ki0Var.b || drawable == ki0Var.e;
        }
        return false;
    }

    public final void w() {
        a aVar = this.x;
        if (aVar == null || !p(aVar.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.x.b;
        TL_iv.RichText f7 = i6.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f7;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f7;
        }
    }

    public final void x() {
        a aVar = this.x;
        if (aVar != null) {
            e(aVar.b, this.f.getText());
        }
    }
}
