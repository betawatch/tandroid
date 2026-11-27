// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class km9 extends FrameLayout implements snb, zlb {
    public hm9 E;
    public boolean F;
    public boolean G;
    public fh9 H;
    public String I;
    public int J;
    public ab9 K;
    public Drawable L;
    public zb4 M;
    public final RectF N;
    public boolean O;
    public int P;
    public zk Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final vnb a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final u8 d;
    public final nf9 e;
    public final dg9 f;
    public final dg9 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public mk0 y;

    public km9(Context context, vnb vnbVar) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        final byte b = 1;
        this.a0 = new Paint(1);
        this.a = vnbVar;
        setPadding(hl.L(16.0f), hl.L(5.0f), hl.L(16.0f), hl.L(4.66f));
        final byte b2 = 0;
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        u8 u8Var = new u8(this, context);
        this.d = u8Var;
        u8Var.setGravity(8388627);
        u8Var.setPaddingRelative(hl.L(6.0f), 0, 0, 0);
        u8Var.setSingleLine(true);
        u8Var.setIncludeFontPadding(false);
        u8Var.setTextSize(1, 16.0f);
        linearLayout.addView(u8Var, tre.o(18, -2));
        nf9 nf9Var = new nf9(context, vnbVar);
        this.e = nf9Var;
        nf9Var.setVisibility(8);
        nf9Var.setOnClickListener(new cm9(this, b2));
        linearLayout.addView(nf9Var, tre.o(18, -2));
        dg9 dg9Var = new dg9(context, vnbVar);
        this.f = dg9Var;
        dg9Var.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        dg9Var.setListener(new fm9(this));
        dg9Var.setDelegate(new vt3(this) { // from class: dm9
            public final /* synthetic */ km9 b;

            {
                this.b = this;
            }

            @Override // vt3
            public final void c() {
                byte b3 = b2;
                km9 km9Var = this.b;
                switch (b3) {
                    case 0:
                        if (!km9Var.T && km9Var.y != null) {
                            km9Var.K();
                            km9.b(km9Var.y.b, km9Var.f.getText());
                            hm9 hm9Var = km9Var.E;
                            if (hm9Var != null) {
                                ((zh9) hm9Var).a.X3();
                                break;
                            }
                        }
                        break;
                    default:
                        if (km9Var.y != null) {
                            km9Var.v();
                            hm9 hm9Var2 = km9Var.E;
                            if (hm9Var2 != null) {
                                ((zh9) hm9Var2).a.X3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        dg9Var.setOnFocusChangeListener(new ts0(this, (byte) 17));
        linearLayout.addView(dg9Var, tre.l(1.0f, 0, -2));
        addView(linearLayout, tre.e(-1, -2, 51));
        dg9 dg9Var2 = new dg9(context, vnbVar);
        this.h = dg9Var2;
        dg9Var2.setPadding(hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), hl.L(1.0f));
        dg9Var2.setAllowNewlines(false);
        dg9Var2.setInputType(147457);
        dg9Var2.setListener(new gm9(this));
        dg9Var2.setDelegate(new vt3(this) { // from class: dm9
            public final /* synthetic */ km9 b;

            {
                this.b = this;
            }

            @Override // vt3
            public final void c() {
                byte b3 = b;
                km9 km9Var = this.b;
                switch (b3) {
                    case 0:
                        if (!km9Var.T && km9Var.y != null) {
                            km9Var.K();
                            km9.b(km9Var.y.b, km9Var.f.getText());
                            hm9 hm9Var = km9Var.E;
                            if (hm9Var != null) {
                                ((zh9) hm9Var).a.X3();
                                break;
                            }
                        }
                        break;
                    default:
                        if (km9Var.y != null) {
                            km9Var.v();
                            hm9 hm9Var2 = km9Var.E;
                            if (hm9Var2 != null) {
                                ((zh9) hm9Var2).a.X3();
                                break;
                            }
                        }
                        break;
                }
            }
        });
        dg9Var2.setVisibility(8);
        addView(dg9Var2, tre.e(-1, -2, 51));
        I();
    }

    public static String E(String str) {
        if (str != null && !str.isEmpty()) {
            if (str.charAt(0) == '/') {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (charAt == ' ' || charAt == '\n' || charAt == '\t') {
                        return null;
                    }
                }
                return str;
            }
        }
        return null;
    }

    public static void b(TL_iv.PageBlock pageBlock, CharSequence charSequence) {
        pageBlock.text = mm9.f(charSequence);
    }

    public static void c(TL_iv.PageBlock pageBlock, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageBlock.text = textplain;
    }

    public static void g(TL_iv.PageBlock pageBlock) {
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

    private String getHint() {
        mk0 mk0Var = this.y;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockHeading1) {
                return ob6.M0(mk0Var.p ? 2131754007 : 2131754023, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading2) {
                return ob6.M0(2131754022, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading3) {
                return ob6.M0(2131754021, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading4) {
                return ob6.M0(2131754020, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading5) {
                return ob6.M0(2131754019, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockHeading6) {
                return ob6.M0(2131754018, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                return ob6.M0(2131754012, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                return ob6.M0(2131754009, null);
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                return ob6.M0(2131754009, null);
            }
            if (mk0Var.q) {
                return ob6.M0(2131754008, null);
            }
        }
        return null;
    }

    public static TL_iv.RichText h(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return ((TL_iv.pageBlockBlockquote) pageBlock).caption;
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return ((TL_iv.pageBlockPullquote) pageBlock).caption;
        }
        return null;
    }

    public static boolean j(dg9 dg9Var, int i, int i2, int i3, int i4) {
        return dg9Var.length() == 0 && i3 >= i && i3 <= dg9Var.getWidth() + i && i4 >= i2 && i4 <= dg9Var.getHeight() + i2;
    }

    public static boolean n(TL_iv.PageBlock pageBlock) {
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

    public static jm9 q(mk0 mk0Var, String str) {
        int i;
        int i2;
        char charAt;
        char charAt2;
        if (str == null || mk0Var == null) {
            return null;
        }
        String trim = str.trim();
        int i3 = 2;
        if (trim.length() == 3 && (((charAt2 = trim.charAt(0)) == '-' || charAt2 == '*' || charAt2 == '_') && trim.charAt(1) == charAt2 && trim.charAt(2) == charAt2)) {
            return new jm9(new TL_iv.pageBlockDivider(), 0, 0);
        }
        String lowerCase = trim.toLowerCase();
        if (lowerCase.length() == 3 && lowerCase.charAt(0) == '/' && lowerCase.charAt(1) == 'h' && (charAt = lowerCase.charAt(2)) >= '1' && charAt <= '6') {
            return new jm9(u(charAt - '0'), mk0Var.c, mk0Var.d);
        }
        if (lowerCase.equals("/code") || lowerCase.equals("/pre") || lowerCase.equals("/preformatted")) {
            return new jm9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        if (lowerCase.equals("/footer")) {
            return new jm9(new TL_iv.pageBlockFooter(), 0, 0);
        }
        if (lowerCase.equals("/quote") || lowerCase.equals("/blockquote")) {
            TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
            pageblockblockquote.caption = new TL_iv.textEmpty();
            return new jm9(pageblockblockquote, 0, 0);
        }
        if (lowerCase.equals("/pullquote")) {
            TL_iv.pageBlockPullquote pageblockpullquote = new TL_iv.pageBlockPullquote();
            pageblockpullquote.caption = new TL_iv.textEmpty();
            return new jm9(pageblockpullquote, 0, 0);
        }
        if (!lowerCase.equals("/table") && !lowerCase.startsWith("/table ")) {
            return null;
        }
        if (lowerCase.length() > 7) {
            String trim2 = lowerCase.substring(7).trim();
            int indexOf = trim2.indexOf(jn7.E1);
            if (indexOf < 0) {
                indexOf = trim2.indexOf(88);
            }
            if (indexOf > 0) {
                try {
                    i2 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(0, indexOf).trim())));
                    try {
                        i3 = Math.max(1, Math.min(20, Integer.parseInt(trim2.substring(indexOf + 1).trim())));
                    } catch (NumberFormatException unused) {
                    }
                } catch (NumberFormatException unused2) {
                    i2 = 2;
                }
                i = i3;
                i3 = i2;
                return new jm9(t(i3, i), 0, 0);
            }
        }
        i = 2;
        return new jm9(t(i3, i), 0, 0);
    }

    public static jm9 r(mk0 mk0Var, String str) {
        int length;
        char charAt;
        if (mk0Var == null || str == null || (length = str.length()) < 2) {
            return null;
        }
        int i = length - 1;
        if (str.charAt(i) != ' ') {
            return null;
        }
        TL_iv.PageBlock pageBlock = mk0Var.b;
        boolean z = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z2 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z || z2)) {
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                if (str.charAt(i3) != '#') {
                    return null;
                }
                i2++;
            }
            if (i2 < 1 || i2 > 6) {
                return null;
            }
            return new jm9(u(i2), mk0Var.c, mk0Var.d);
        }
        if (!z) {
            return null;
        }
        if (mk0Var.c == 0 && length == 2) {
            char charAt2 = str.charAt(0);
            if (charAt2 == '-' || charAt2 == '*' || charAt2 == '+') {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                c(pageblockparagraph, "");
                return new jm9(pageblockparagraph, 1, 0);
            }
            if (charAt2 == '|') {
                TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                pageblockblockquote.caption = new TL_iv.textEmpty();
                return new jm9(pageblockblockquote, 0, 0);
            }
        }
        if (mk0Var.c == 0 && length == 3 && str.charAt(0) == '[' && str.charAt(1) == ']') {
            return s(false);
        }
        if (mk0Var.c == 0 && length == 4 && str.charAt(0) == '[' && str.charAt(2) == ']') {
            char charAt3 = str.charAt(1);
            if (charAt3 == ' ') {
                return s(false);
            }
            if (charAt3 == 'x' || charAt3 == 'X') {
                return s(true);
            }
        }
        if (mk0Var.c == 0 && length == 3 && Character.isDigit(str.charAt(0)) && ((charAt = str.charAt(1)) == '.' || charAt == ')')) {
            TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
            c(pageblockparagraph2, "");
            return new jm9(pageblockparagraph2, 1, 1);
        }
        if (mk0Var.c != 0 || length != 4) {
            return null;
        }
        char charAt4 = str.charAt(0);
        if ((charAt4 == '-' || charAt4 == '*' || charAt4 == '_') && str.charAt(1) == charAt4 && str.charAt(2) == charAt4) {
            return new jm9(new TL_iv.pageBlockDivider(), 0, 0);
        }
        if (charAt4 == '`' && str.charAt(1) == '`' && str.charAt(2) == '`') {
            return new jm9(new TL_iv.pageBlockPreformatted(), 0, 0);
        }
        return null;
    }

    public static jm9 s(boolean z) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        c(pageblockparagraph, "");
        return new jm9(pageblockparagraph, 1, 0, true, z);
    }

    public static TL_iv.pageBlockTable t(int i, int i2) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = false;
        pageblocktable.title = new TL_iv.textEmpty();
        pageblocktable.rows = new ArrayList<>();
        for (int i3 = 0; i3 < i; i3++) {
            TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
            pagetablerow.cells = new ArrayList<>();
            for (int i4 = 0; i4 < i2; i4++) {
                pagetablerow.cells.add(ajb.f());
            }
            pageblocktable.rows.add(pagetablerow);
        }
        return pageblocktable;
    }

    public static TL_iv.PageBlock u(int i) {
        switch (i) {
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

    public static boolean x(dg9 dg9Var, int i, int i2, int i3, int i4) {
        int lineForVertical;
        Layout layout = dg9Var.getLayout();
        if (layout != null && dg9Var.length() != 0) {
            int paddingLeft = i3 - (dg9Var.getPaddingLeft() + i);
            int paddingTop = i4 - (dg9Var.getPaddingTop() + i2);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = hl.L(24.0f);
                int max = Math.max(0, (dg9Var.getWidth() - dg9Var.getPaddingLeft()) - dg9Var.getPaddingRight());
                float f = L;
                float max2 = Math.max(0.0f, layout.getLineLeft(lineForVertical) - f);
                float min = Math.min(max, layout.getLineRight(lineForVertical) + f);
                float f2 = paddingLeft;
                if (f2 >= max2 && f2 <= min) {
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
        return mm9.l(pageBlock.text);
    }

    public static SpannableStringBuilder z(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return mm9.r(pageBlock.text, pageBlock, true);
    }

    public final void A() {
        this.f.O();
    }

    public final void B() {
        Runnable runnable = this.H;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.H = null;
        }
        mk0 mk0Var = this.y;
        byte b = 1;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                fh9 fh9Var = new fh9(this, b);
                this.H = fh9Var;
                postDelayed(fh9Var, 100L);
                return;
            }
        }
        this.J++;
        Editable text = this.f.getText();
        if (text != null) {
            for (fk2 fk2Var : (fk2[]) text.getSpans(0, text.length(), fk2.class)) {
                text.removeSpan(fk2Var);
            }
        }
        this.I = null;
    }

    public final void C(kf9 kf9Var) {
        if (this.E == null || this.y == null || kf9Var == null) {
            return;
        }
        List<String> list = kf9Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int p = p(str);
            if (p != 0) {
                ((zh9) this.E).c(this.y, p);
                return;
            }
            jm9 q = q(this.y, str);
            if (q == null) {
                q = r(this.y, qd4.o(str, " "));
            }
            if (q != null) {
                ((zh9) this.E).d(this.y, q.a, q.b, q.c, q.d, q.e);
                return;
            }
        }
    }

    public final void D(Editable editable) {
        mk0 mk0Var = this.y;
        if (mk0Var != null && pi9.z3(mk0Var.b) && ik8.A(editable)) {
            dg9 dg9Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = dg9Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((dg9Var.getTextSize() * 0.85f) / 1.2f));
            for (mv3 mv3Var : (mv3[]) editable.getSpans(0, editable.length(), mv3.class)) {
                mv3Var.b = 0.85f;
            }
            for (hm hmVar : (hm[]) editable.getSpans(0, editable.length(), hm.class)) {
                hmVar.replaceFontMetrics(fontMetricsInt);
                hmVar.setSize(max);
            }
        }
    }

    public final void F() {
        hm9 hm9Var;
        mk0 mk0Var = this.y;
        if (mk0Var == null || mk0Var.c <= 0 || (hm9Var = this.E) == null) {
            return;
        }
        int b = ((zh9) hm9Var).b(mk0Var);
        int a = ((zh9) this.E).a(this.y);
        mk0 mk0Var2 = this.y;
        if (mk0Var2.n) {
            b = mk0Var2.l <= 0 ? 0 : hl.L(((r0 - 1) << 4) + 10);
        }
        mk0 mk0Var3 = this.y;
        if (mk0Var3.o) {
            a = mk0Var3.m <= 0 ? 0 : hl.L(((r1 - 1) << 4) + 10);
        }
        if (b == getPaddingTop() && a == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b, getPaddingRight(), a);
    }

    public final void G() {
        mk0 mk0Var = this.y;
        dg9 dg9Var = this.f;
        dg9 dg9Var2 = this.h;
        if (mk0Var != null && n(mk0Var.b) && (dg9Var.length() > 0 || dg9Var2.length() > 0)) {
            if (dg9Var2.getVisibility() != 0) {
                dg9Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (dg9Var2.getVisibility() != 8) {
            if (dg9Var2.isFocused()) {
                dg9Var.requestFocus();
            }
            dg9Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i;
        Layout layout;
        int lineStart;
        dg9 dg9Var = this.f;
        if (dg9Var.getText() != null) {
            Editable text = dg9Var.getText();
            int i2 = -1;
            if (!m() || !((TL_iv.pageBlockBlockquote) this.y.b).collapsed || (layout = dg9Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i = text.length())) {
                i = -1;
            } else {
                i2 = lineStart;
            }
            if (i2 == this.R && i == this.S) {
                return;
            }
            this.T = true;
            try {
                zk zkVar = this.Q;
                if (zkVar != null) {
                    text.removeSpan(zkVar);
                }
                if (i2 >= 0) {
                    zk zkVar2 = this.Q;
                    if (zkVar2 == null) {
                        zkVar2 = new zk(this, (byte) 2);
                        this.Q = zkVar2;
                    }
                    text.setSpan(zkVar2, i2, i, 33);
                }
                this.T = false;
                this.R = i2;
                this.S = i;
            } catch (Throwable th) {
                this.T = false;
                throw th;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        dg9 dg9Var = this.h;
        if (dg9Var != null) {
            dg9Var.updateColors();
        }
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.d.setTextColor(aob.v0(i, vnbVar));
        if (this.L != null) {
            int v0 = aob.v0(aob.Fi, vnbVar);
            Drawable drawable = this.L;
            if (drawable != this.U || v0 != this.V) {
                this.U = drawable;
                this.V = v0;
                drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            }
        }
        ab9 ab9Var = this.K;
        if (ab9Var != null) {
            nxe.a(ab9Var, vnbVar);
        }
    }

    public final void J(TL_iv.PageBlock pageBlock, boolean z) {
        boolean z2 = pageBlock instanceof TL_iv.pageBlockPreformatted;
        LinearLayout linearLayout = this.s;
        if (!z2) {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        if (linearLayout != null && z) {
            hl.B2(linearLayout);
            this.s = null;
        }
        if (this.s == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.s = linearLayout2;
            linearLayout2.setOrientation(0);
            LinearLayout linearLayout3 = this.s;
            int i = aob.i6;
            yob.R(linearLayout3, aob.Y(aob.v0(i, this.a), hl.L(3.0f), hl.L(3.0f)), null, yob.M(i), this.a);
            this.s.setPadding(hl.L(6.0f), hl.L(2.0f), hl.L(2.0f), hl.L(2.0f));
            addView(this.s, tre.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            byte b = 1;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, tre.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.x, tre.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            wm8 wm8Var = mk2.a;
            synchronized (wm8Var.a) {
                if (!wm8Var.f) {
                    wm8Var.b.execute(new rm8(wm8Var, (byte) 1));
                }
            }
            this.s.setOnClickListener(new cm9(this, b));
            this.s.setOnLongClickListener(new em9());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i2 = aob.G6;
        aob.p1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, aob.v0(i2, this.a));
        uob K = yob.K(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i2);
        ImageView imageView2 = this.x;
        vnb vnbVar = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = K.a;
        float f = K.d;
        int P = yob.P(i3, -1, 2, f, vnbVar);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        yob.N(imageView2, 5, i3, -1, 2, f, vnbVar, P, porterDuffColorFilter).h = mode;
        yob.Y(this.w, K, this.a);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView2 = this.w;
        if (isEmpty) {
            textView2.setText(ob6.M0(2131754010, null));
        } else {
            textView2.setText(o47.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        mk0 mk0Var = this.y;
        boolean z = false;
        if (mk0Var != null && mk0Var.d > 0) {
            dg9 dg9Var = this.f;
            if (dg9Var.length() > 0 && (dg9Var.c(0, 1) & 1) != 0) {
                z = true;
            }
        }
        this.d.setTypeface(z ? hl.o() : null);
        mk0 mk0Var2 = this.y;
        if (mk0Var2 == null || mk0Var2.d <= 0) {
            return;
        }
        a(mk0Var2);
    }

    public final void a(mk0 mk0Var) {
        int e;
        int i;
        mk0 mk0Var2;
        int i2;
        int i3 = mk0Var.c;
        nf9 nf9Var = this.e;
        u8 u8Var = this.d;
        View view = this.c;
        if (i3 <= 0) {
            view.setVisibility(8);
            u8Var.setVisibility(8);
            nf9Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = hl.L(24.0f) * (i3 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i3 > 1 ? 0 : 8);
        if (mk0Var.e) {
            u8Var.setVisibility(8);
            nf9Var.setVisibility(0);
            ((CheckBoxBase) nf9Var.b).f(-1, mk0Var.f, false);
            return;
        }
        nf9Var.setVisibility(8);
        u8Var.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) u8Var.getLayoutParams();
        if (mk0Var.d == 0) {
            e = hl.L(18.0f);
        } else {
            hm9 hm9Var = this.E;
            if (hm9Var != null) {
                TextPaint paint = u8Var.getPaint();
                ArrayList arrayList = ((zh9) hm9Var).a.t3;
                int indexOf = arrayList.indexOf(mk0Var);
                if (indexOf < 0 || (i = mk0Var.c) <= 0 || mk0Var.d <= 0) {
                    e = qu6.e(10.0f, (int) Math.ceil(paint.measureText(uh9.l(new StringBuilder(), mk0Var.d, "."))), hl.L(28.0f));
                } else {
                    int i4 = indexOf;
                    while (i4 > 0) {
                        mk0 mk0Var3 = (mk0) arrayList.get(i4 - 1);
                        int i5 = mk0Var3.c;
                        if (i5 < i || (i5 == i && mk0Var3.d <= 0)) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                    int i6 = indexOf + 1;
                    while (i6 < arrayList.size() && (i2 = (mk0Var2 = (mk0) arrayList.get(i6)).c) >= i && (i2 != i || mk0Var2.d > 0)) {
                        i6++;
                    }
                    Paint paint2 = new Paint(paint);
                    paint2.setTypeface(hl.o());
                    float f = 0.0f;
                    while (i4 < i6) {
                        mk0 mk0Var4 = (mk0) arrayList.get(i4);
                        if (mk0Var4.c == i && mk0Var4.d > 0) {
                            f = Math.max(f, paint2.measureText(mk0Var4.d + "."));
                        }
                        i4++;
                    }
                    e = qu6.e(10.0f, (int) Math.ceil(f), hl.L(28.0f));
                }
            } else {
                int L = hl.L(28.0f);
                TextPaint paint3 = u8Var.getPaint();
                e = qu6.e(10.0f, (int) Math.ceil(paint3.measureText(mk0Var.d + ".")), L);
            }
        }
        if (layoutParams2.width != e) {
            layoutParams2.width = e;
            u8Var.setLayoutParams(layoutParams2);
        }
        u8Var.setText(mk0Var.d == 0 ? "" : uh9.l(new StringBuilder(), mk0Var.d, "."));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(mk0 mk0Var, hm9 hm9Var, boolean z) {
        float f;
        float f2;
        mk0 mk0Var2;
        int c;
        boolean z2;
        boolean n;
        SpannableStringBuilder spannableStringBuilder;
        this.y = mk0Var;
        this.E = hm9Var;
        this.F = z;
        this.S = -1;
        this.R = -1;
        TL_iv.PageBlock pageBlock = mk0Var.b;
        dg9 dg9Var = this.f;
        dg9Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = mk0Var.b;
        int i = xea.S0;
        dg9Var.setCenterEmptyHint(false);
        dg9Var.setHint(getHint());
        dg9Var.setTextColorKey(aob.G6);
        dg9Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f = 8.0f;
            setPadding(hl.L(16.0f), hl.L(31.0f), hl.L(16.0f), hl.L(19.0f));
            dg9Var.setInputType(655505);
            dg9Var.setAllowNewlines(true);
            dg9Var.setSoftEnterNewline(false);
            dg9Var.setGravity(8388659);
            dg9Var.setTextSize(1, i - 1);
            dg9Var.setTypeface(Typeface.MONOSPACE);
            dg9Var.setLineSpacing(dg9Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            dg9Var.setAccentHint(false);
        } else {
            f = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                dg9Var.setInputType(147457);
                dg9Var.setAllowNewlines(false);
                dg9Var.setSoftEnterNewline(false);
                dg9Var.setGravity(8388659);
                setPadding(hl.L(28.0f), hl.L(16.0f), hl.L(24.0f), hl.L(16.0f));
                dg9Var.setTextSize(1, Math.max(8, i - 2));
                dg9Var.setTypeface(null);
                dg9Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    dg9Var.setInputType(147457);
                    dg9Var.setAllowNewlines(false);
                    dg9Var.setSoftEnterNewline(false);
                    dg9Var.setGravity(8388659);
                    boolean z3 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z4 = z3 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f2 = 24.0f;
                    setPadding(hl.L(16.0f), hl.L(z4 ? 11.0f : 5.0f), hl.L(16.0f), hl.L(z4 ? 7.0f : 4.66f));
                    mk0 mk0Var3 = this.y;
                    if (mk0Var3 != null && mk0Var3.c > 0) {
                        int L = hl.L(16.0f);
                        hm9 hm9Var2 = this.E;
                        int b = hm9Var2 != null ? ((zh9) hm9Var2).b(this.y) : hl.L(8.0f);
                        int L2 = hl.L(16.0f);
                        hm9 hm9Var3 = this.E;
                        setPadding(L, b, L2, hm9Var3 != null ? ((zh9) hm9Var3).a(this.y) : hl.L(11.0f));
                    }
                    if (z3) {
                        dg9Var.setTextSize(1, i + 3);
                        dg9Var.setTypeface(hl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        dg9Var.setTextSize(1, i + 2);
                        dg9Var.setTypeface(hl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        dg9Var.setTextSize(1, i + 1);
                        dg9Var.setTypeface(hl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        dg9Var.setTextSize(1, i);
                        dg9Var.setTypeface(hl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        dg9Var.setTextSize(1, i - 1);
                        dg9Var.setTypeface(hl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        dg9Var.setTextSize(1, i - 2);
                        dg9Var.setTypeface(hl.n1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        dg9Var.setTextSize(1, i - 2);
                        dg9Var.setTypeface(null);
                        dg9Var.setTextColorKey(aob.Pd);
                    } else {
                        dg9Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (mk0Var2 = this.y) == null || mk0Var2.k.isEmpty()) ? i : Math.max(8, i - 2));
                        dg9Var.setTypeface(null);
                    }
                    dg9Var.setAccentHint(false);
                    c = nxe.c(mk0Var);
                    int d = nxe.d(mk0Var);
                    if (c <= 0 || d > 0) {
                        z2 = mk0Var.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (mk0Var.n) {
                            paddingTop = (mk0Var.l <= 0 ? 0 : hl.L(((r7 - 1) << 4) + 10)) + (z2 ? hl.L(f2) : 0);
                        }
                        if (mk0Var.o) {
                            paddingBottom = mk0Var.m <= 0 ? 0 : hl.L(((r8 - 1) << 4) + 10);
                        }
                        if (z2) {
                            c += hl.L(f);
                            d += hl.L(f);
                        }
                        if (ob6.a0) {
                            setPadding(getPaddingLeft() + c, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c, paddingBottom);
                        }
                    }
                    a(mk0Var);
                    J(mk0Var.b, false);
                    if (!String.valueOf(dg9Var.getText()).equals(y(mk0Var.b))) {
                        SpannableStringBuilder z5 = z(mk0Var.b);
                        if (pi9.z3(mk0Var.b)) {
                            SpannableString spannableString = new SpannableString(z5);
                            mm9.o(spannableString, 0, spannableString.length(), 1, false, null);
                            mm9.o(spannableString, 0, spannableString.length(), 2, false, null);
                            spannableStringBuilder = spannableString;
                        } else {
                            spannableStringBuilder = z5;
                        }
                        dg9Var.setTextSilently(pv3.n(spannableStringBuilder, dg9Var.getPaint().getFontMetricsInt(), false, null, 0, pi9.z3(mk0Var.b) ? 0.85f : 1.0f, 0));
                        D(dg9Var.getText());
                        dg9Var.f();
                        this.I = null;
                    }
                    D(dg9Var.getText());
                    K();
                    TL_iv.PageBlock pageBlock3 = mk0Var.b;
                    n = n(pageBlock3);
                    dg9 dg9Var2 = this.h;
                    if (n) {
                        dg9Var2.setVisibility(8);
                    } else {
                        g(pageBlock3);
                        dg9Var2.setTextSize(1, Math.max(8, xea.S0 - 2));
                        dg9Var2.setTypeface(hl.n1("fonts/rmedium.ttf"));
                        dg9Var2.setTextColorKey(aob.Fi);
                        dg9Var2.setAccentHint(true);
                        dg9Var2.setHint(ob6.M0(2131754013, null));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            dg9Var2.setGravity(49);
                        } else {
                            dg9Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(dg9Var2.getText()).equals(mm9.l(h(pageBlock3)))) {
                            dg9Var2.setTextSilently(pv3.m(mm9.r(h(pageBlock3), null, true), dg9Var2.getPaint().getFontMetricsInt(), false, null, 0));
                            dg9Var2.f();
                        }
                        G();
                    }
                    B();
                }
                dg9Var.setInputType(147457);
                dg9Var.setAllowNewlines(false);
                dg9Var.setSoftEnterNewline(true);
                dg9Var.setGravity(49);
                dg9Var.setCenterEmptyHint(true);
                setPadding(hl.L(40.0f), hl.L(16.0f), hl.L(40.0f), hl.L(16.0f));
                dg9Var.setTextSize(1, Math.max(8, i - 2));
                dg9Var.setTypeface(hl.n1("fonts/ritalic.ttf"));
                dg9Var.setAccentHint(true);
            }
        }
        f2 = 24.0f;
        c = nxe.c(mk0Var);
        int d2 = nxe.d(mk0Var);
        if (c <= 0) {
        }
        z2 = mk0Var.b instanceof TL_iv.pageBlockPreformatted;
        int paddingTop2 = getPaddingTop();
        int paddingBottom2 = getPaddingBottom();
        if (mk0Var.n) {
        }
        if (mk0Var.o) {
        }
        if (z2) {
        }
        if (ob6.a0) {
        }
        a(mk0Var);
        J(mk0Var.b, false);
        if (!String.valueOf(dg9Var.getText()).equals(y(mk0Var.b))) {
        }
        D(dg9Var.getText());
        K();
        TL_iv.PageBlock pageBlock32 = mk0Var.b;
        n = n(pageBlock32);
        dg9 dg9Var22 = this.h;
        if (n) {
        }
        B();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0445 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x040b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        dg9 dg9Var;
        float f;
        amb textSelectionHelper;
        float f2;
        float f3;
        Canvas canvas3;
        float f4;
        int i;
        mk0 mk0Var = this.y;
        Paint paint = this.a0;
        LinearLayout linearLayout = this.b;
        vnb vnbVar = this.a;
        dg9 dg9Var2 = this.f;
        if (mk0Var != null) {
            TL_iv.PageBlock pageBlock = mk0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                paint.setColor(aob.v0(aob.ol, vnbVar));
                int c = nxe.c(this.y);
                int d = nxe.d(this.y);
                int width = getWidth();
                if (c > 0 || d > 0) {
                    int L = hl.L(16.0f) + c;
                    int L2 = hl.L(16.0f) + d;
                    i = ob6.a0 ? L2 : L;
                    int width2 = getWidth();
                    if (!ob6.a0) {
                        L = L2;
                    }
                    width = width2 - L;
                } else {
                    i = 0;
                }
                float L3 = (i > 0 || width < getWidth()) ? hl.L(8.0f) : 0;
                dg9Var = dg9Var2;
                canvas2 = canvas;
                canvas2.drawRoundRect(i, hl.L(7.0f), width, getHeight() - hl.L(7.0f), L3, L3, paint);
            } else {
                dg9Var = dg9Var2;
                if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                    if (this.K == null) {
                        ab9 ab9Var = new ab9(this);
                        this.K = ab9Var;
                        ab9Var.a(null, null, null, this.a, 1);
                        nxe.a(this.K, vnbVar);
                    }
                    RectF rectF = hl.P;
                    rectF.set(hl.L(16.0f), hl.L(8.0f), getWidth() - hl.L(16.0f), getHeight() - hl.L(8.0f));
                    float floor = (float) Math.floor(xea.U0 / 3.0f);
                    canvas3 = canvas;
                    this.K.c(floor, floor, floor, 1.0f, canvas3, rectF);
                    this.K.f(canvas3, rectF, 1.0f);
                } else {
                    canvas3 = canvas;
                    if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                        if (this.K == null) {
                            ab9 ab9Var2 = new ab9(this);
                            this.K = ab9Var2;
                            ab9Var2.a(null, null, null, this.a, 1);
                            nxe.a(this.K, vnbVar);
                        }
                        if (this.L == null) {
                            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                            this.L = mutate;
                            mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.Fi, vnbVar), PorterDuff.Mode.SRC_IN));
                        }
                        Layout layout = dg9Var.getLayout();
                        float width3 = getWidth();
                        if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                            f4 = 0.0f;
                            for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                                width3 = Math.min(width3, layout.getLineLeft(i2) + dg9Var.getPaddingLeft() + dg9Var.getLeft() + linearLayout.getLeft());
                                f4 = Math.max(f4, layout.getLineRight(i2) + dg9Var.getPaddingLeft() + dg9Var.getLeft() + linearLayout.getLeft());
                            }
                        } else if (dg9Var.getHint() != null) {
                            float measureText = dg9Var.getPaint().measureText(dg9Var.getHint().toString());
                            width3 = Math.min(width3, ((getWidth() - measureText) / 2.0f) + hl.L(2.0f));
                            f4 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + hl.L(2.0f));
                        } else {
                            f4 = 0.0f;
                        }
                        dg9 dg9Var3 = this.h;
                        if (dg9Var3.getVisibility() == 0) {
                            Layout layout2 = dg9Var3.getLayout();
                            if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                                for (int i3 = 0; i3 < layout2.getLineCount(); i3++) {
                                    width3 = Math.min(width3, layout2.getLineLeft(i3) + dg9Var3.getPaddingLeft() + dg9Var3.getLeft());
                                    f4 = Math.max(f4, layout2.getLineRight(i3) + dg9Var3.getPaddingLeft() + dg9Var3.getLeft());
                                }
                            } else if (dg9Var3.getHint() != null) {
                                float measureText2 = dg9Var3.getPaint().measureText(dg9Var3.getHint().toString());
                                width3 = Math.min(width3, ((getWidth() - measureText2) / 2.0f) + hl.L(2.0f));
                                f4 = Math.max(f4, ((getWidth() + measureText2) / 2.0f) + hl.L(2.0f));
                            }
                        }
                        if (width3 < f4) {
                            float L4 = width3 - hl.L(30.0f);
                            float L5 = hl.L(30.0f) + f4;
                            float floor2 = (float) Math.floor(xea.U0 / 2.0f);
                            int L6 = hl.L(8.0f);
                            int height = getHeight() - hl.L(8.0f);
                            RectF rectF2 = hl.P;
                            f = 2.0f;
                            rectF2.set(L4, L6, L5, height);
                            this.K.c(floor2, floor2, floor2, 1.0f, canvas3, rectF2);
                            canvas2 = canvas3;
                            canvas2.save();
                            int i4 = (int) L4;
                            this.L.setBounds(hl.L(8.0f) + i4, hl.L(7.0f) + L6, this.L.getIntrinsicWidth() + hl.L(8.0f) + i4, this.L.getIntrinsicHeight() + hl.L(7.0f) + L6);
                            canvas2.scale(-1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                            this.L.draw(canvas2);
                            canvas2.restore();
                            canvas2.save();
                            int i5 = (int) L5;
                            this.L.setBounds((i5 - hl.L(8.0f)) - this.L.getIntrinsicWidth(), (height - hl.L(7.0f)) - this.L.getIntrinsicHeight(), i5 - hl.L(8.0f), height - hl.L(7.0f));
                            canvas2.scale(1.0f, -1.0f, this.L.getBounds().centerX(), this.L.getBounds().centerY());
                            this.L.draw(canvas2);
                            canvas2.restore();
                            if (this.W) {
                                float width4 = getWidth();
                                float height2 = getHeight();
                                Layout layout3 = dg9Var.getLayout();
                                if (layout3 != null) {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                    for (int i6 = 0; i6 < layout3.getLineCount(); i6++) {
                                        height2 = Math.min(height2, layout3.getLineTop(i6) + dg9Var.getPaddingTop() + getPaddingTop());
                                        width4 = Math.min(width4, layout3.getLineLeft(i6) + dg9Var.getPaddingLeft() + dg9Var.getLeft() + linearLayout.getLeft());
                                        f2 = Math.max(f2, layout3.getLineRight(i6) + dg9Var.getPaddingLeft() + dg9Var.getLeft() + linearLayout.getLeft());
                                        f3 = Math.max(height2, layout3.getLineBottom(i6) + dg9Var.getPaddingTop() + getPaddingTop());
                                    }
                                } else {
                                    f2 = 0.0f;
                                    f3 = 0.0f;
                                }
                                if (width4 < f2 && height2 < f3) {
                                    float L7 = width4 - hl.L(4.0f);
                                    paint.setColor(aob.p1(0.05f, aob.v0(aob.G6, vnbVar)));
                                    canvas2.drawRoundRect(L7, height2 - hl.L(f), f2 + hl.L(4.0f), f3 + hl.L(f), hl.L(4.0f), hl.L(4.0f), paint);
                                }
                            }
                            hm9 hm9Var = this.E;
                            textSelectionHelper = hm9Var == null ? ((zh9) hm9Var).a.getTextSelectionHelper() : null;
                            if (textSelectionHelper != null) {
                                ArrayList arrayList = this.r;
                                arrayList.clear();
                                k(arrayList);
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    kmb kmbVar = (kmb) arrayList.get(i7);
                                    canvas2.save();
                                    canvas2.translate(kmbVar.getX(), kmbVar.getY());
                                    textSelectionHelper.Y(canvas2, this, i7);
                                    canvas2.restore();
                                }
                            }
                            super.dispatchDraw(canvas);
                            if (m()) {
                                return;
                            }
                            if (this.M == null) {
                                this.M = new zb4(this);
                            }
                            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
                            int v0 = aob.v0(aob.Fi, vnbVar);
                            int L8 = hl.L(3.333f);
                            this.M.c(canvas2, this.N, qu6.x(16.0f, getWidth(), L8), qu6.x(8.0f, getHeight(), L8), v0, pageblockblockquote.collapsed, i());
                            return;
                        }
                    }
                }
                canvas2 = canvas3;
            }
        } else {
            canvas2 = canvas;
            dg9Var = dg9Var2;
        }
        f = 2.0f;
        if (this.W) {
        }
        hm9 hm9Var2 = this.E;
        if (hm9Var2 == null) {
        }
        if (textSelectionHelper != null) {
        }
        super.dispatchDraw(canvas);
        if (m()) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (i() && this.M != null) {
            boolean contains = this.N.contains(motionEvent.getX(), motionEvent.getY());
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.O) {
                            this.O = false;
                            this.M.d(false);
                            return true;
                        }
                    } else if (this.O) {
                        this.M.d(contains);
                        return true;
                    }
                } else if (this.O) {
                    this.O = false;
                    this.M.d(false);
                    if (contains && m()) {
                        ((TL_iv.pageBlockBlockquote) this.y.b).collapsed = !r6.collapsed;
                        H();
                        invalidate();
                        hm9 hm9Var = this.E;
                        if (hm9Var != null) {
                            pi9 pi9Var = ((zh9) hm9Var).a;
                            ch9 ch9Var = pi9Var.R3;
                            if (ch9Var != null) {
                                ch9Var.g();
                            }
                            pi9Var.p3.onContentChanged();
                        }
                    }
                    return true;
                }
            } else if (contains) {
                this.O = true;
                this.M.d(true);
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int e(int i, int i2) {
        Layout layout;
        if (i()) {
            dg9 dg9Var = this.h;
            if (dg9Var.getVisibility() == 0 && (layout = dg9Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new zb4(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + dg9Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + dg9Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + dg9Var.getPaddingTop() + measuredHeight;
                int L = hl.L(3.333f);
                float x = qu6.x(16.0f, i, L);
                this.M.getClass();
                float L2 = x - ((hl.L(23.66f) + r6.a) + (hl.L(3.333f) << 1));
                this.M.getClass();
                int i3 = i2 - L;
                float L3 = i3 - hl.L(17.66f);
                float f = i3;
                boolean z = lineRight > L2;
                boolean z2 = lineBottom > L3 && lineTop < f;
                if (z && z2) {
                    return (int) Math.ceil(Math.max(0.0f, (((lineBottom + hl.L(4.0f)) + r9) + L) - i2));
                }
            }
        }
        return 0;
    }

    public final void f() {
        mk0 mk0Var = this.y;
        if (mk0Var != null) {
            g(mk0Var.b);
        }
        dg9 dg9Var = this.h;
        if (dg9Var.getVisibility() != 0) {
            dg9Var.setVisibility(0);
            requestLayout();
        }
        dg9Var.O();
        dg9Var.setSelection(dg9Var.length());
    }

    public dg9 getAuthorEditText() {
        return this.h;
    }

    public dg9 getEditText() {
        return this.f;
    }

    public mk0 getRow() {
        return this.y;
    }

    public km4 getStyleDelegate() {
        return this.f;
    }

    public final boolean i() {
        Layout layout;
        return m() && (layout = this.f.getLayout()) != null && layout.getLineCount() > 3;
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        Layout layout;
        dg9 dg9Var = this.f;
        Layout layout2 = dg9Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new ml9(layout2, dg9Var.getPaddingLeft() + dg9Var.getLeft() + linearLayout.getLeft(), dg9Var.getPaddingTop() + dg9Var.getTop() + linearLayout.getTop(), (byte) 1));
        }
        dg9 dg9Var2 = this.h;
        if (dg9Var2.getVisibility() != 0 || (layout = dg9Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new ml9(layout, dg9Var2.getPaddingLeft() + dg9Var2.getLeft(), dg9Var2.getPaddingTop() + dg9Var2.getTop(), (byte) 2));
    }

    public final boolean l() {
        return this.h.getVisibility() == 0;
    }

    public final boolean m() {
        mk0 mk0Var = this.y;
        return mk0Var != null && (mk0Var.b instanceof TL_iv.pageBlockBlockquote);
    }

    public final void o(boolean z) {
        hm9 hm9Var;
        this.f.setHint(getHint());
        if (z || (hm9Var = this.E) == null) {
            return;
        }
        ((zh9) hm9Var).a.p3.b(this, null);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        H();
        dg9 dg9Var = this.h;
        if (dg9Var.getVisibility() == 8) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        dg9Var.layout(paddingLeft, measuredHeight, dg9Var.getMeasuredWidth() + paddingLeft, dg9Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        F();
        int size = View.MeasureSpec.getSize(i);
        dg9 dg9Var = this.h;
        if (dg9Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i2);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, 0);
        dg9Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), 0);
        int paddingBottom = getPaddingBottom() + dg9Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int e = e(size, paddingBottom);
        this.P = e;
        setMeasuredDimension(size, paddingBottom + e);
    }

    public void setLocked(boolean z) {
        this.f.setLocked(z);
        this.h.setLocked(z);
    }

    public void setShowCommandBackground(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof vg9) {
                ((vg9) getBackground()).a(aob.v0(aob.d6, this.a));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void v() {
        mk0 mk0Var = this.y;
        if (mk0Var == null || !n(mk0Var.b)) {
            return;
        }
        TL_iv.PageBlock pageBlock = this.y.b;
        TL_iv.RichText f = mm9.f(this.h.getText());
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            ((TL_iv.pageBlockBlockquote) pageBlock).caption = f;
        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            ((TL_iv.pageBlockPullquote) pageBlock).caption = f;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        zb4 zb4Var = this.M;
        if (zb4Var != null) {
            return drawable == ((hn) zb4Var.e) || drawable == ((o19) zb4Var.f);
        }
        return false;
    }

    public final void w() {
        mk0 mk0Var = this.y;
        if (mk0Var != null) {
            b(mk0Var.b, this.f.getText());
        }
    }
}
