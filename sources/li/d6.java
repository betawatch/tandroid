package li;

import a8.zd;
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
import bi.cc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.da;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.wm0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d6 extends FrameLayout implements p6, r9 {
    public static final /* synthetic */ int a0 = 0;
    public boolean E;
    public boolean F;
    public i2 G;
    public String H;
    public int I;
    public wm0 J;
    public Drawable K;
    public jj0 L;
    public final RectF M;
    public boolean N;
    public int O;
    public z5 P;
    public int Q;
    public int R;
    public boolean S;
    public Drawable T;
    public int U;
    public boolean V;
    public final Paint W;
    public final u6 a;
    public final LinearLayout b;
    public final View c;
    public final ei.n d;
    public final cc e;
    public final g1 f;
    public final g1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView v;
    public ImageView w;
    public a x;
    public a6 y;

    public d6(Context context, u6 u6Var) {
        super(context);
        this.r = new ArrayList();
        this.M = new RectF();
        this.Q = -1;
        this.R = -1;
        this.W = new Paint(1);
        this.a = u6Var;
        setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        ei.n nVar = new ei.n(this, context);
        this.d = nVar;
        nVar.setGravity(8388627);
        nVar.setPaddingRelative(AndroidUtilities.dp(6.0f), 0, 0, 0);
        nVar.setSingleLine(true);
        nVar.setIncludeFontPadding(false);
        nVar.setTextSize(1, 16.0f);
        linearLayout.addView(nVar, gb1.r(18, -2));
        cc ccVar = new cc(context, u6Var);
        this.e = ccVar;
        ccVar.setVisibility(8);
        ccVar.setOnClickListener(new u5(this, 0));
        linearLayout.addView(ccVar, gb1.r(18, -2));
        g1 g1Var = new g1(context, u6Var);
        this.f = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        g1Var.setListener(new x5(this));
        final int i10 = 0;
        g1Var.setDelegate(new hu(this) { // from class: li.v5
            public final /* synthetic */ d6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.hu
            public final void g() {
                switch (i10) {
                    case 0:
                        d6 d6Var = this.b;
                        if (!d6Var.S && d6Var.x != null) {
                            d6Var.J();
                            d6.d(d6Var.x.b, d6Var.f.getText());
                            a6 a6Var = d6Var.y;
                            if (a6Var != null) {
                                v3.U1(((d3) a6Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        d6 d6Var2 = this.b;
                        if (d6Var2.x != null) {
                            d6Var2.v();
                            a6 a6Var2 = d6Var2.y;
                            if (a6Var2 != null) {
                                v3.U1(((d3) a6Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        g1Var.setOnFocusChangeListener(new bh.j0(this, 5));
        linearLayout.addView(g1Var, gb1.p(1.0f, 0, -2));
        addView(linearLayout, gb1.i(-1, -2, 51));
        g1 g1Var2 = new g1(context, u6Var);
        this.h = g1Var2;
        g1Var2.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        g1Var2.setAllowNewlines(false);
        g1Var2.setInputType(147457);
        g1Var2.setListener(new y5(this));
        final int i11 = 1;
        g1Var2.setDelegate(new hu(this) { // from class: li.v5
            public final /* synthetic */ d6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.hu
            public final void g() {
                switch (i11) {
                    case 0:
                        d6 d6Var = this.b;
                        if (!d6Var.S && d6Var.x != null) {
                            d6Var.J();
                            d6.d(d6Var.x.b, d6Var.f.getText());
                            a6 a6Var = d6Var.y;
                            if (a6Var != null) {
                                v3.U1(((d3) a6Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        d6 d6Var2 = this.b;
                        if (d6Var2.x != null) {
                            d6Var2.v();
                            a6 a6Var2 = d6Var2.y;
                            if (a6Var2 != null) {
                                v3.U1(((d3) a6Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        g1Var2.setVisibility(8);
        addView(g1Var2, gb1.i(-1, -2, 51));
        H();
    }

    public static void a(d6 d6Var, boolean z10) {
        a6 a6Var;
        d6Var.f.setHint(d6Var.getHint());
        if (z10 || (a6Var = d6Var.y) == null) {
            return;
        }
        ((d3) a6Var).a.p3.p(d6Var, null);
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
        pageBlock.text = f6.f(charSequence);
    }

    public static void e(TL_iv.PageBlock pageBlock, String str) {
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

    public static boolean l(g1 g1Var, int i10, int i11, int i12, int i13) {
        return g1Var.length() == 0 && i12 >= i10 && i12 <= g1Var.getWidth() + i10 && i13 >= i11 && i13 <= g1Var.getHeight() + i11;
    }

    public static boolean o(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote);
    }

    public static int p(String str) {
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

    public static c6 q(String str, a aVar) {
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
            return new c6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new c6(u(charAt - '0'), aVar.c, aVar.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new c6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new c6(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new c6(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new c6(pageblockpullquote, 0, 0);
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
                return new c6(t(i12, i10), 0, 0);
            }
        }
        i10 = 2;
        return new c6(t(i12, i10), 0, 0);
    }

    public static c6 r(String str, a aVar) {
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
            return new c6(u(i11), aVar.c, aVar.d);
        }
        if (!z10) {
            return null;
        }
        if (aVar.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                e(pageblockparagraph, "");
                return new c6(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new c6(pageblockblockquote, 0, 0);
            }
        }
        if (aVar.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
            return s(false);
        }
        if (aVar.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
            char charAt3 = str.charAt(1);
            if (charAt3 == ' ') {
                return s(false);
            }
            if (charAt3 == 'x' || charAt3 == 'X') {
                return s(true);
            }
        }
        if (aVar.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            e(pageblockparagraph2, "");
            return new c6(pageblockparagraph2, 1, 1);
        }
        if (aVar.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new c6(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new c6(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static c6 s(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new c6(pageblockparagraph, 1, 0, true, z10);
    }

    public static TL_iv.pageBlockTable t(int i10, int i11) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i12 = 0; i12 < i10; i12++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i13 = 0; i13 < i11; i13++) {
                pagetablerow.cells.add(h6.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock u(int i10) {
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

    public static boolean x(g1 g1Var, int i10, int i11, int i12, int i13) {
        int lineForVertical;
        Layout layout = g1Var.getLayout();
        if (layout != null && g1Var.length() != 0) {
            int paddingLeft = i12 - (g1Var.getPaddingLeft() + i10);
            int paddingTop = i13 - (g1Var.getPaddingTop() + i11);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int dp = AndroidUtilities.dp(24.0f);
                int max = Math.max(0, (g1Var.getWidth() - g1Var.getPaddingLeft()) - g1Var.getPaddingRight());
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

    public static String y(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return f6.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return f6.r(pageBlock.text, pageBlock, true);
    }

    public final void A() {
        this.f.r();
    }

    public final void B() {
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        a aVar = this.x;
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
            for (ni.d dVar : (ni.d[]) text.getSpans(0, text.length(), ni.d.class)) {
                text.removeSpan(dVar);
            }
        }
        this.H = null;
    }

    public final void C(m0 m0Var) {
        if (this.y == null || this.x == null || m0Var == null) {
            return;
        }
        List<String> list = m0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int p10 = p(str);
            if (p10 != 0) {
                ((d3) this.y).c(this.x, p10);
                return;
            }
            c6 q5 = q(str, this.x);
            if (q5 == null) {
                q5 = r(b10.u(str, " "), this.x);
            }
            if (q5 != null) {
                ((d3) this.y).d(this.x, q5.a, q5.b, q5.c, q5.d, q5.e);
                return;
            }
        }
    }

    public final void D(Editable editable) {
        a aVar = this.x;
        if (aVar != null && v3.I3(aVar.b) && c3.h0.t(editable)) {
            g1 g1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = g1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((g1Var.getTextSize() * 0.85f) / 1.2f));
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) editable.getSpans(0, editable.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
            for (org.telegram.ui.Components.c6 c6Var : (org.telegram.ui.Components.c6[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.c6.class)) {
                c6Var.replaceFontMetrics(fontMetricsInt);
                c6Var.setSize(max);
            }
        }
    }

    public final void E() {
        a6 a6Var;
        a aVar = this.x;
        if (aVar == null || aVar.c <= 0 || (a6Var = this.y) == null) {
            return;
        }
        int b10 = ((d3) a6Var).b(aVar);
        int a2 = ((d3) this.y).a(this.x);
        a aVar2 = this.x;
        if (aVar2.n) {
            b10 = aVar2.l <= 0 ? 0 : AndroidUtilities.dp(c3.h0.w(r0, 1, 16, 10));
        }
        a aVar3 = this.x;
        if (aVar3.o) {
            a2 = aVar3.m <= 0 ? 0 : AndroidUtilities.dp(c3.h0.w(r1, 1, 16, 10));
        }
        if (b10 == getPaddingTop() && a2 == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b10, getPaddingRight(), a2);
    }

    public final void F() {
        a aVar = this.x;
        g1 g1Var = this.f;
        g1 g1Var2 = this.h;
        if (aVar != null && o(aVar.b) && (g1Var.length() > 0 || g1Var2.length() > 0)) {
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

    public final void G() {
        int i10;
        Layout layout;
        int lineStart;
        g1 g1Var = this.f;
        if (g1Var.getText() != null) {
            Editable text = g1Var.getText();
            int i11 = -1;
            if (!n() || !((TL_iv.pageBlockBlockquote) this.x.b).collapsed || (layout = g1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i10 = text.length())) {
                i10 = -1;
            } else {
                i11 = lineStart;
            }
            if (i11 == this.Q && i10 == this.R) {
                return;
            }
            this.S = true;
            try {
                z5 z5Var = this.P;
                if (z5Var != null) {
                    text.removeSpan(z5Var);
                }
                if (i11 >= 0) {
                    if (this.P == null) {
                        this.P = new z5(this, 0);
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

    public final void H() {
        this.f.updateColors();
        g1 g1Var = this.h;
        if (g1Var != null) {
            g1Var.updateColors();
        }
        int i10 = y6.G6;
        u6 u6Var = this.a;
        this.d.setTextColor(y6.w0(i10, u6Var));
        if (this.K != null) {
            int w02 = y6.w0(y6.Oh, u6Var);
            Drawable drawable = this.K;
            if (drawable != this.T || w02 != this.U) {
                this.T = drawable;
                this.U = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        wm0 wm0Var = this.J;
        if (wm0Var != null) {
            zd.a(wm0Var, u6Var);
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
        if (this.s == null) {
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            this.s = linearLayout3;
            linearLayout3.setOrientation(0);
            LinearLayout linearLayout4 = this.s;
            int i10 = y6.i6;
            f7.R(linearLayout4, y6.Z(y6.w0(i10, this.a), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f)), null, f7.N(i10), this.a);
            this.s.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
            addView(this.s, gb1.h(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.v = textView;
            textView.setTextSize(1, 12.0f);
            this.v.setGravity(17);
            this.s.addView(this.v, gb1.x(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.w = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.w, gb1.v(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            ni.q qVar = ni.k.a;
            synchronized (qVar.a) {
                try {
                    if (!qVar.s) {
                        qVar.d.execute(new ni.l(qVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.s.setOnClickListener(new u5(this, 1));
            this.s.setOnLongClickListener(new w5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i11 = y6.G6;
        y6.o1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, y6.w0(i11, this.a));
        b7 L = f7.L(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i11);
        ImageView imageView2 = this.w;
        u6 u6Var = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = L.a;
        float f7 = L.d;
        int Q = f7.Q(i12, -1, 2, f7, u6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Q, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        f7.O(imageView2, 5, i12, -1, 2, f7, u6Var, Q, porterDuffColorFilter).h = mode;
        f7.W(this.v, L, this.a);
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
            g1 g1Var = this.f;
            if (g1Var.length() > 0 && (g1Var.getCurrentStyle(0, 1) & 1) != 0) {
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Oh));
    }

    public final void c(a aVar) {
        int z10;
        int i10;
        a aVar2;
        int i11;
        int i12 = aVar.c;
        cc ccVar = this.e;
        View view = this.c;
        ei.n nVar = this.d;
        if (i12 <= 0) {
            view.setVisibility(8);
            nVar.setVisibility(8);
            ccVar.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = AndroidUtilities.dp(24.0f) * (i12 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i12 > 1 ? 0 : 8);
        if (aVar.e) {
            nVar.setVisibility(8);
            ccVar.setVisibility(0);
            ((CheckBoxBase) ccVar.b).f(-1, aVar.f, false);
            return;
        }
        ccVar.setVisibility(8);
        nVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) nVar.getLayoutParams();
        if (aVar.d == 0) {
            z10 = AndroidUtilities.dp(18.0f);
        } else {
            a6 a6Var = this.y;
            if (a6Var != null) {
                TextPaint paint = nVar.getPaint();
                ArrayList arrayList = ((d3) a6Var).a.t3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i10 = aVar.c) <= 0 || aVar.d <= 0) {
                    z10 = org.telegram.messenger.t.z(10.0f, (int) Math.ceil(paint.measureText(a1.g.n(aVar.d, ".", new StringBuilder()))), AndroidUtilities.dp(28.0f));
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
                    z10 = org.telegram.messenger.t.z(10.0f, (int) Math.ceil(f7), AndroidUtilities.dp(28.0f));
                }
            } else {
                int dp = AndroidUtilities.dp(28.0f);
                TextPaint paint3 = nVar.getPaint();
                z10 = org.telegram.messenger.t.z(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), dp);
            }
        }
        if (layoutParams2.width != z10) {
            layoutParams2.width = z10;
            nVar.setLayoutParams(layoutParams2);
        }
        nVar.setText(aVar.d == 0 ? "" : a1.g.n(aVar.d, ".", new StringBuilder()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g1 g1Var;
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        int i10;
        a aVar = this.x;
        LinearLayout linearLayout = this.b;
        Paint paint = this.W;
        u6 u6Var = this.a;
        g1 g1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            g1Var = g1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.J == null) {
                        wm0 wm0Var = new wm0(this);
                        this.J = wm0Var;
                        wm0Var.a(null, null, null, this.a, 1);
                        zd.a(this.J, u6Var);
                    }
                    if (this.K == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.K = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(y6.w0(y6.Oh, u6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = g1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f7 = 0.0f;
                        for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                            width = Math.min(width, layout.getLineLeft(i11) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                            f7 = Math.max(f7, layout.getLineRight(i11) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (g1Var.getHint() != null) {
                        float measureText = g1Var.getPaint().measureText(g1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                        f7 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + AndroidUtilities.dp(2.0f));
                    } else {
                        f7 = 0.0f;
                    }
                    g1 g1Var3 = this.h;
                    if (g1Var3.getVisibility() == 0) {
                        Layout layout2 = g1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i12 = 0; i12 < layout2.getLineCount(); i12++) {
                                width = Math.min(width, layout2.getLineLeft(i12) + g1Var3.getPaddingLeft() + g1Var3.getLeft());
                                f7 = Math.max(f7, layout2.getLineRight(i12) + g1Var3.getPaddingLeft() + g1Var3.getLeft());
                            }
                        } else if (g1Var3.getHint() != null) {
                            float measureText2 = g1Var3.getPaint().measureText(g1Var3.getHint().toString());
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
                        this.J.c(floor, floor, floor, 1.0f, canvas2, rectF);
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
                    wm0 wm0Var2 = new wm0(this);
                    this.J = wm0Var2;
                    wm0Var2.a(null, null, null, this.a, 1);
                    zd.a(this.J, u6Var);
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), getWidth() - AndroidUtilities.dp(16.0f), getHeight() - AndroidUtilities.dp(8.0f));
                float floor2 = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                canvas2 = canvas;
                this.J.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                this.J.f(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(y6.w0(y6.xk, u6Var));
            int c10 = zd.c(this.x);
            int d = zd.d(this.x);
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
            g1Var = g1Var2;
            canvas.drawRoundRect(i10, AndroidUtilities.dp(7.0f), width2, getHeight() - AndroidUtilities.dp(7.0f), dp6, dp6, paint);
            canvas2 = canvas;
        }
        if (this.V) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = g1Var.getLayout();
            if (layout3 != null) {
                f10 = 0.0f;
                f11 = 0.0f;
                for (int i15 = 0; i15 < layout3.getLineCount(); i15++) {
                    height2 = Math.min(height2, layout3.getLineTop(i15) + g1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i15) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                    f10 = Math.max(f10, layout3.getLineRight(i15) + g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(height2, layout3.getLineBottom(i15) + g1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f10 = 0.0f;
                f11 = 0.0f;
            }
            if (width4 < f10 && height2 < f11) {
                float dp7 = width4 - AndroidUtilities.dp(4.0f);
                paint.setColor(y6.o1(0.05f, y6.w0(y6.G6, u6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(dp7, height2 - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + f10, f11 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        a6 a6Var = this.y;
        s9 textSelectionHelper = a6Var != null ? ((d3) a6Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.r;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                da daVar = (da) arrayList.get(i16);
                canvas2.save();
                canvas2.translate(daVar.getX(), daVar.getY());
                textSelectionHelper.Z(canvas2, this, i16);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas);
        if (n()) {
            if (this.L == null) {
                this.L = new jj0(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.x.b;
            int w02 = y6.w0(y6.Oh, u6Var);
            int dp8 = AndroidUtilities.dp(3.333f);
            this.L.a(canvas2, this.M, org.telegram.messenger.t.C(16.0f, getWidth(), dp8), org.telegram.messenger.t.C(8.0f, getHeight(), dp8), w02, pageblockblockquote.collapsed, k());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (k() && this.L != null) {
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
                    if (contains && n()) {
                        ((TL_iv.pageBlockBlockquote) this.x.b).collapsed = !r6.collapsed;
                        G();
                        invalidate();
                        a6 a6Var = this.y;
                        if (a6Var != null) {
                            v3 v3Var = ((d3) a6Var).a;
                            f2 f2Var = v3Var.R3;
                            if (f2Var != null) {
                                f2Var.g();
                            }
                            v3Var.p3.onContentChanged();
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
    public final void f(a aVar, a6 a6Var, boolean z10) {
        float f7;
        float f10;
        a aVar2;
        int c10;
        boolean z11;
        boolean o10;
        this.x = aVar;
        this.y = a6Var;
        this.E = z10;
        this.R = -1;
        this.Q = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        g1 g1Var = this.f;
        g1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i10 = SharedConfig.fontSize;
        g1Var.setCenterEmptyHint(false);
        g1Var.setHint(getHint());
        g1Var.setTextColorKey(y6.G6);
        g1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f7 = 8.0f;
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(19.0f));
            g1Var.setInputType(655505);
            g1Var.setAllowNewlines(true);
            g1Var.setSoftEnterNewline(false);
            g1Var.setGravity(8388659);
            g1Var.setTextSize(1, i10 - 1);
            g1Var.setTypeface(Typeface.MONOSPACE);
            g1Var.setLineSpacing(g1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            g1Var.setAccentHint(false);
        } else {
            f7 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                g1Var.setInputType(147457);
                g1Var.setAllowNewlines(false);
                g1Var.setSoftEnterNewline(false);
                g1Var.setGravity(8388659);
                setPadding(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(16.0f));
                g1Var.setTextSize(1, Math.max(8, i10 - 2));
                g1Var.setTypeface(null);
                g1Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    g1Var.setInputType(147457);
                    g1Var.setAllowNewlines(false);
                    g1Var.setSoftEnterNewline(false);
                    g1Var.setGravity(8388659);
                    boolean z12 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z13 = z12 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f10 = 24.0f;
                    setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 11.0f : 5.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(z13 ? 7.0f : 4.66f));
                    a aVar3 = this.x;
                    if (aVar3 != null && aVar3.c > 0) {
                        int dp = AndroidUtilities.dp(16.0f);
                        a6 a6Var2 = this.y;
                        int b10 = a6Var2 != null ? ((d3) a6Var2).b(this.x) : AndroidUtilities.dp(8.0f);
                        int dp2 = AndroidUtilities.dp(16.0f);
                        a6 a6Var3 = this.y;
                        setPadding(dp, b10, dp2, a6Var3 != null ? ((d3) a6Var3).a(this.x) : AndroidUtilities.dp(11.0f));
                    }
                    if (z12) {
                        g1Var.setTextSize(1, i10 + 3);
                        g1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        g1Var.setTextSize(1, i10 + 2);
                        g1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        g1Var.setTextSize(1, i10 + 1);
                        g1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        g1Var.setTextSize(1, i10);
                        g1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        g1Var.setTextSize(1, i10 - 1);
                        g1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        g1Var.setTextSize(1, i10 - 2);
                        g1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        g1Var.setTextSize(1, i10 - 2);
                        g1Var.setTypeface(null);
                        g1Var.setTextColorKey(y6.Yc);
                    } else {
                        g1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.x) == null || aVar2.k.isEmpty()) ? i10 : Math.max(8, i10 - 2));
                        g1Var.setTypeface(null);
                    }
                    g1Var.setAccentHint(false);
                    c10 = zd.c(aVar);
                    int d = zd.d(aVar);
                    if (c10 <= 0 || d > 0) {
                        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : AndroidUtilities.dp(c3.h0.w(r7, 1, 16, 10))) + (z11 ? AndroidUtilities.dp(f10) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : AndroidUtilities.dp(c3.h0.w(r8, 1, 16, 10));
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
                    if (!String.valueOf(g1Var.getText()).equals(y(aVar.b))) {
                        SpannableStringBuilder z14 = z(aVar.b);
                        if (v3.I3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(z14);
                            f6.o(spannableString, 0, spannableString.length(), 1, false, null);
                            f6.o(spannableString, 0, spannableString.length(), 2, false, null);
                            z14 = spannableString;
                        }
                        g1Var.setTextSilently(Emoji.replaceEmoji((CharSequence) z14, g1Var.getPaint().getFontMetricsInt(), false, v3.I3(aVar.b) ? 0.85f : 1.0f));
                        D(g1Var.getText());
                        g1Var.invalidateEffects();
                        this.H = null;
                    }
                    D(g1Var.getText());
                    J();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    o10 = o(pageBlock3);
                    g1 g1Var2 = this.h;
                    if (o10) {
                        g1Var2.setVisibility(8);
                    } else {
                        i(pageBlock3);
                        g1Var2.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
                        g1Var2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
                        g1Var2.setTextColorKey(y6.Oh);
                        g1Var2.setAccentHint(true);
                        g1Var2.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            g1Var2.setGravity(49);
                        } else {
                            g1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(g1Var2.getText()).equals(f6.l(j(pageBlock3)))) {
                            g1Var2.setTextSilently(Emoji.replaceEmoji(f6.r(j(pageBlock3), null, true), g1Var2.getPaint().getFontMetricsInt(), false));
                            g1Var2.invalidateEffects();
                        }
                        F();
                    }
                    B();
                }
                g1Var.setInputType(147457);
                g1Var.setAllowNewlines(false);
                g1Var.setSoftEnterNewline(true);
                g1Var.setGravity(49);
                g1Var.setCenterEmptyHint(true);
                setPadding(AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(16.0f));
                g1Var.setTextSize(1, Math.max(8, i10 - 2));
                g1Var.setTypeface(AndroidUtilities.getTypeface("fonts/ritalic.ttf"));
                g1Var.setAccentHint(true);
            }
        }
        f10 = 24.0f;
        c10 = zd.c(aVar);
        int d10 = zd.d(aVar);
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
        if (!String.valueOf(g1Var.getText()).equals(y(aVar.b))) {
        }
        D(g1Var.getText());
        J();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        o10 = o(pageBlock32);
        g1 g1Var22 = this.h;
        if (o10) {
        }
        B();
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        Layout layout;
        g1 g1Var = this.f;
        Layout layout2 = g1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new d5(layout2, g1Var.getPaddingLeft() + g1Var.getLeft() + linearLayout.getLeft(), g1Var.getPaddingTop() + g1Var.getTop() + linearLayout.getTop(), 1));
        }
        g1 g1Var2 = this.h;
        if (g1Var2.getVisibility() != 0 || (layout = g1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new d5(layout, g1Var2.getPaddingLeft() + g1Var2.getLeft(), g1Var2.getPaddingTop() + g1Var2.getTop(), 2));
    }

    public final int g(int i10, int i11) {
        Layout layout;
        if (k()) {
            g1 g1Var = this.h;
            if (g1Var.getVisibility() == 0 && (layout = g1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.L == null) {
                    this.L = new jj0(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + g1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + g1Var.getPaddingTop() + measuredHeight;
                int dp = AndroidUtilities.dp(3.333f);
                float C = org.telegram.messenger.t.C(16.0f, i10, dp);
                this.L.getClass();
                float b10 = C - vh.b(3.333f, 2, AndroidUtilities.dp(23.66f) + r6.c);
                this.L.getClass();
                int i12 = i11 - dp;
                float dp2 = i12 - AndroidUtilities.dp(17.66f);
                float f7 = i12;
                boolean z10 = lineRight > b10;
                boolean z11 = lineBottom > dp2 && lineTop < f7;
                if (z10 && z11) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + AndroidUtilities.dp(4.0f)) + r2) + dp) - i11));
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
        return this.x;
    }

    public org.telegram.ui.ActionBar.b5 getStyleDelegate() {
        return this.f;
    }

    public final void h() {
        a aVar = this.x;
        if (aVar != null) {
            i(aVar.b);
        }
        g1 g1Var = this.h;
        if (g1Var.getVisibility() != 0) {
            g1Var.setVisibility(0);
            requestLayout();
        }
        g1Var.r();
        g1Var.setSelection(g1Var.length());
    }

    public final boolean k() {
        Layout layout;
        return n() && (layout = this.f.getLayout()) != null && layout.getLineCount() > 3;
    }

    public final boolean m() {
        return this.h.getVisibility() == 0;
    }

    public final boolean n() {
        a aVar = this.x;
        return aVar != null && (aVar.b instanceof TL_iv.pageBlockBlockquote);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        G();
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            super.onLayout(z10, i10, i11, i12, i13);
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
    public final void onMeasure(int i10, int i11) {
        E();
        int size = View.MeasureSpec.getSize(i10);
        g1 g1Var = this.h;
        if (g1Var.getVisibility() == 8) {
            this.O = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i11);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        g1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + g1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int g7 = g(size, paddingBottom);
        this.O = g7;
        setMeasuredDimension(size, paddingBottom + g7);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            H();
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(y6.w0(y6.d6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void v() {
        a aVar = this.x;
        if (aVar == null || !o(aVar.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.x.b;
        TL_iv.RichText f7 = f6.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f7;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f7;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        jj0 jj0Var = this.L;
        if (jj0Var != null) {
            return drawable == jj0Var.b || drawable == jj0Var.e;
        }
        return false;
    }

    public final void w() {
        a aVar = this.x;
        if (aVar != null) {
            d(aVar.b, this.f.getText());
        }
    }
}
