package oi;

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
import c8.fa;
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.cj;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class a6 extends FrameLayout implements org.telegram.ui.ActionBar.c6, h9 {
    public static final /* synthetic */ int b0 = 0;
    public x5 E;
    public boolean F;
    public boolean G;
    public j2 H;
    public String I;
    public int J;
    public ok0 K;
    public Drawable L;
    public e0.g M;
    public final RectF N;
    public boolean O;
    public int P;
    public w5 Q;
    public int R;
    public int S;
    public boolean T;
    public Drawable U;
    public int V;
    public boolean W;
    public final i6 a;
    public final Paint a0;
    public final LinearLayout b;
    public final View c;
    public final gi.j d;
    public final bi.o3 e;
    public final f1 f;
    public final f1 h;
    public boolean n;
    public final ArrayList r;
    public LinearLayout s;
    public TextView w;
    public ImageView x;
    public a y;

    public a6(Context context, i6 i6Var) {
        super(context);
        this.r = new ArrayList();
        this.N = new RectF();
        this.R = -1;
        this.S = -1;
        this.a0 = new Paint(1);
        this.a = i6Var;
        setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(4.66f));
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        View view = new View(context);
        this.c = view;
        linearLayout.addView(view, new LinearLayout.LayoutParams(0, -2));
        gi.j jVar = new gi.j(this, context);
        this.d = jVar;
        jVar.setGravity(8388627);
        jVar.setPaddingRelative(org.telegram.messenger.g0.L(6.0f), 0, 0, 0);
        jVar.setSingleLine(true);
        jVar.setIncludeFontPadding(false);
        jVar.setTextSize(1, 16.0f);
        linearLayout.addView(jVar, na.o(18, -2));
        bi.o3 o3Var = new bi.o3(context, i6Var);
        this.e = o3Var;
        o3Var.setVisibility(8);
        o3Var.setOnClickListener(new r5(this, 0));
        linearLayout.addView(o3Var, na.o(18, -2));
        f1 f1Var = new f1(context, i6Var);
        this.f = f1Var;
        f1Var.setPadding(org.telegram.messenger.g0.L(2.0f), 0, org.telegram.messenger.g0.L(2.0f), 0);
        f1Var.setListener(new u5(this));
        final int i7 = 0;
        f1Var.setDelegate(new kt(this) { // from class: oi.s5
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kt
            public final void u() {
                switch (i7) {
                    case 0:
                        a6 a6Var = this.b;
                        if (!a6Var.T && a6Var.y != null) {
                            a6Var.K();
                            a6.d(a6Var.y.b, a6Var.f.getText());
                            x5 x5Var = a6Var.E;
                            if (x5Var != null) {
                                t3.S1(((d3) x5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        a6 a6Var2 = this.b;
                        if (a6Var2.y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.E;
                            if (x5Var2 != null) {
                                t3.S1(((d3) x5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        f1Var.setOnFocusChangeListener(new ch.c0(this, 4));
        linearLayout.addView(f1Var, na.l(1.0f, 0, -2));
        addView(linearLayout, na.e(-1, -2, 51));
        f1 f1Var2 = new f1(context, i6Var);
        this.h = f1Var2;
        f1Var2.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        f1Var2.setAllowNewlines(false);
        f1Var2.setInputType(147457);
        f1Var2.setListener(new v5(this));
        final int i10 = 1;
        f1Var2.setDelegate(new kt(this) { // from class: oi.s5
            public final /* synthetic */ a6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.kt
            public final void u() {
                switch (i10) {
                    case 0:
                        a6 a6Var = this.b;
                        if (!a6Var.T && a6Var.y != null) {
                            a6Var.K();
                            a6.d(a6Var.y.b, a6Var.f.getText());
                            x5 x5Var = a6Var.E;
                            if (x5Var != null) {
                                t3.S1(((d3) x5Var).a);
                                break;
                            }
                        }
                        break;
                    default:
                        a6 a6Var2 = this.b;
                        if (a6Var2.y != null) {
                            a6Var2.w();
                            x5 x5Var2 = a6Var2.E;
                            if (x5Var2 != null) {
                                t3.S1(((d3) x5Var2).a);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        f1Var2.setVisibility(8);
        addView(f1Var2, na.e(-1, -2, 51));
        I();
    }

    public static SpannableStringBuilder A(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return null;
        }
        return c6.r(pageBlock.text, pageBlock, true);
    }

    public static void a(a6 a6Var, boolean z10) {
        x5 x5Var;
        a6Var.f.setHint(a6Var.getHint());
        if (z10 || (x5Var = a6Var.E) == null) {
            return;
        }
        ((d3) x5Var).a.p3.Q(a6Var, null);
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
            return gd.N0(aVar.p ? 2131754011 : 2131754027, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return gd.N0(2131754026, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return gd.N0(2131754025, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return gd.N0(2131754024, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return gd.N0(2131754023, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return gd.N0(2131754022, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            return gd.N0(2131754016, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return gd.N0(2131754013, null);
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return gd.N0(2131754013, null);
        }
        if (aVar.q) {
            return gd.N0(2131754012, null);
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

    public static boolean m(f1 f1Var, int i7, int i10, int i11, int i12) {
        return f1Var.length() == 0 && i11 >= i7 && i11 <= f1Var.getWidth() + i7 && i12 >= i10 && i12 <= f1Var.getHeight() + i10;
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
        boolean z10 = pageBlock instanceof TL_iv.pageBlockParagraph;
        boolean z11 = (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6);
        if (str.charAt(0) == '#' && (z10 || z11)) {
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
        if (!z10) {
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

    public static z5 t(boolean z10) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        e(pageblockparagraph, "");
        return new z5(pageblockparagraph, 1, 0, true, z10);
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

    public static boolean y(f1 f1Var, int i7, int i10, int i11, int i12) {
        int lineForVertical;
        Layout layout = f1Var.getLayout();
        if (layout != null && f1Var.length() != 0) {
            int paddingLeft = i11 - (f1Var.getPaddingLeft() + i7);
            int paddingTop = i12 - (f1Var.getPaddingTop() + i10);
            if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
                int L = org.telegram.messenger.g0.L(24.0f);
                int max = Math.max(0, (f1Var.getWidth() - f1Var.getPaddingLeft()) - f1Var.getPaddingRight());
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
        this.f.O();
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
            for (qi.c cVar : (qi.c[]) text.getSpans(0, text.length(), qi.c.class)) {
                text.removeSpan(cVar);
            }
        }
        this.I = null;
    }

    public final void D(k0 k0Var) {
        if (this.E == null || this.y == null || k0Var == null) {
            return;
        }
        List<String> list = k0Var.c;
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            int q10 = q(str);
            if (q10 != 0) {
                ((d3) this.E).c(this.y, q10);
                return;
            }
            z5 r10 = r(str, this.y);
            if (r10 == null) {
                r10 = s(p5.c.v(str, " "), this.y);
            }
            if (r10 != null) {
                ((d3) this.E).d(this.y, r10.a, r10.b, r10.c, r10.d, r10.e);
                return;
            }
        }
    }

    public final void E(Editable editable) {
        a aVar = this.y;
        if (aVar != null && t3.F3(aVar.b) && com.google.android.gms.internal.vision.e2.s(editable)) {
            f1 f1Var = this.f;
            Paint.FontMetricsInt fontMetricsInt = f1Var.getPaint().getFontMetricsInt();
            int max = Math.max(1, Math.round((f1Var.getTextSize() * 0.85f) / 1.2f));
            for (g6 g6Var : (g6[]) editable.getSpans(0, editable.length(), g6.class)) {
                g6Var.b = 0.85f;
            }
            for (org.telegram.ui.Components.x5 x5Var : (org.telegram.ui.Components.x5[]) editable.getSpans(0, editable.length(), org.telegram.ui.Components.x5.class)) {
                x5Var.replaceFontMetrics(fontMetricsInt);
                x5Var.setSize(max);
            }
        }
    }

    public final void F() {
        x5 x5Var;
        a aVar = this.y;
        if (aVar == null || aVar.c <= 0 || (x5Var = this.E) == null) {
            return;
        }
        int b10 = ((d3) x5Var).b(aVar);
        int a10 = ((d3) this.E).a(this.y);
        a aVar2 = this.y;
        if (aVar2.n) {
            b10 = aVar2.l <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r0, 1, 16, 10));
        }
        a aVar3 = this.y;
        if (aVar3.o) {
            a10 = aVar3.m <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r1, 1, 16, 10));
        }
        if (b10 == getPaddingTop() && a10 == getPaddingBottom()) {
            return;
        }
        setPadding(getPaddingLeft(), b10, getPaddingRight(), a10);
    }

    public final void G() {
        a aVar = this.y;
        f1 f1Var = this.f;
        f1 f1Var2 = this.h;
        if (aVar != null && p(aVar.b) && (f1Var.length() > 0 || f1Var2.length() > 0)) {
            if (f1Var2.getVisibility() != 0) {
                f1Var2.setVisibility(0);
                requestLayout();
                return;
            }
            return;
        }
        if (f1Var2.getVisibility() != 8) {
            if (f1Var2.isFocused()) {
                f1Var.requestFocus();
            }
            f1Var2.setVisibility(8);
            requestLayout();
        }
    }

    public final void H() {
        int i7;
        Layout layout;
        int lineStart;
        f1 f1Var = this.f;
        if (f1Var.getText() != null) {
            Editable text = f1Var.getText();
            int i10 = -1;
            if (!o() || !((TL_iv.pageBlockBlockquote) this.y.b).collapsed || (layout = f1Var.getLayout()) == null || layout.getLineCount() <= 3 || (lineStart = layout.getLineStart(3)) >= (i7 = text.length())) {
                i7 = -1;
            } else {
                i10 = lineStart;
            }
            if (i10 == this.R && i7 == this.S) {
                return;
            }
            this.T = true;
            try {
                w5 w5Var = this.Q;
                if (w5Var != null) {
                    text.removeSpan(w5Var);
                }
                if (i10 >= 0) {
                    if (this.Q == null) {
                        this.Q = new w5(this, 0);
                    }
                    text.setSpan(this.Q, i10, i7, 33);
                }
                this.T = false;
                this.R = i10;
                this.S = i7;
            } catch (Throwable th2) {
                this.T = false;
                throw th2;
            }
        }
    }

    public final void I() {
        this.f.updateColors();
        f1 f1Var = this.h;
        if (f1Var != null) {
            f1Var.updateColors();
        }
        int i7 = n6.G6;
        i6 i6Var = this.a;
        this.d.setTextColor(n6.w0(i7, i6Var));
        if (this.L != null) {
            int w02 = n6.w0(n6.Fi, i6Var);
            Drawable drawable = this.L;
            if (drawable != this.U || w02 != this.V) {
                this.U = drawable;
                this.V = w02;
                drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
        }
        ok0 ok0Var = this.K;
        if (ok0Var != null) {
            fa.a(ok0Var, i6Var);
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
            int i7 = n6.i6;
            u6.Q(linearLayout4, n6.a0(n6.w0(i7, this.a), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f)), null, u6.M(i7), this.a);
            this.s.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
            addView(this.s, na.d(-2, -2.0f, 53, 0.0f, -15.0f, -5.0f, 0.0f));
            TextView textView = new TextView(getContext());
            this.w = textView;
            int i10 = 1;
            textView.setTextSize(1, 12.0f);
            this.w.setGravity(17);
            this.s.addView(this.w, na.t(-2, -2, 16, 0, 0, 0, 0));
            ImageView imageView = new ImageView(getContext());
            this.x = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            this.s.addView(this.x, na.s(16, 16, 16, 0.0f, 0.66f, 0.0f, 0.0f));
            qi.p pVar = qi.j.a;
            synchronized (pVar.a) {
                try {
                    if (!pVar.s) {
                        pVar.d.execute(new qi.k(pVar, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.s.setOnClickListener(new r5(this, i10));
            this.s.setOnLongClickListener(new t5());
        }
        String str = ((TL_iv.pageBlockPreformatted) pageBlock).language;
        int i11 = n6.G6;
        n6.r1(TextUtils.isEmpty(str) ? 0.5f : 0.75f, n6.w0(i11, this.a));
        q6 K = u6.K(TextUtils.isEmpty(str) ? 0.5f : 0.75f, i11);
        ImageView imageView2 = this.x;
        i6 i6Var = this.a;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = K.a;
        float f10 = K.d;
        int P = u6.P(i12, -1, 2, f10, i6Var);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(P, mode);
        imageView2.setColorFilter(porterDuffColorFilter);
        u6.N(imageView2, 5, i12, -1, 2, f10, i6Var, P, porterDuffColorFilter).h = mode;
        u6.V(this.w, K, this.a);
        if (TextUtils.isEmpty(str)) {
            this.w.setText(gd.N0(2131754014, null));
        } else {
            this.w.setText(cj.b(str));
        }
        this.s.setVisibility(0);
    }

    public final void K() {
        a aVar = this.y;
        boolean z10 = false;
        if (aVar != null && aVar.d > 0) {
            f1 f1Var = this.f;
            if (f1Var.length() > 0 && (f1Var.c(0, 1) & 1) != 0) {
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Fi));
    }

    public final void c(a aVar) {
        int b10;
        int i7;
        a aVar2;
        int i10;
        int i11 = aVar.c;
        bi.o3 o3Var = this.e;
        View view = this.c;
        gi.j jVar = this.d;
        if (i11 <= 0) {
            view.setVisibility(8);
            jVar.setVisibility(8);
            o3Var.setVisibility(8);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = org.telegram.messenger.g0.L(24.0f) * (i11 - 1);
        view.setLayoutParams(layoutParams);
        view.setVisibility(i11 > 1 ? 0 : 8);
        if (aVar.e) {
            jVar.setVisibility(8);
            o3Var.setVisibility(0);
            ((CheckBoxBase) o3Var.b).f(-1, aVar.f, false);
            return;
        }
        o3Var.setVisibility(8);
        jVar.setVisibility(0);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) jVar.getLayoutParams();
        if (aVar.d == 0) {
            b10 = org.telegram.messenger.g0.L(18.0f);
        } else {
            x5 x5Var = this.E;
            if (x5Var != null) {
                TextPaint paint = jVar.getPaint();
                ArrayList arrayList = ((d3) x5Var).a.t3;
                int indexOf = arrayList.indexOf(aVar);
                if (indexOf < 0 || (i7 = aVar.c) <= 0 || aVar.d <= 0) {
                    b10 = org.telegram.messenger.f3.b(10.0f, (int) Math.ceil(paint.measureText(a8.p0.n(aVar.d, ".", new StringBuilder()))), org.telegram.messenger.g0.L(28.0f));
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
                    b10 = org.telegram.messenger.f3.b(10.0f, (int) Math.ceil(f10), org.telegram.messenger.g0.L(28.0f));
                }
            } else {
                int L = org.telegram.messenger.g0.L(28.0f);
                TextPaint paint3 = jVar.getPaint();
                b10 = org.telegram.messenger.f3.b(10.0f, (int) Math.ceil(paint3.measureText(aVar.d + ".")), L);
            }
        }
        if (layoutParams2.width != b10) {
            layoutParams2.width = b10;
            jVar.setLayoutParams(layoutParams2);
        }
        jVar.setText(aVar.d == 0 ? "" : a8.p0.n(aVar.d, ".", new StringBuilder()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        f1 f1Var;
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        int i7;
        a aVar = this.y;
        LinearLayout linearLayout = this.b;
        Paint paint = this.a0;
        i6 i6Var = this.a;
        f1 f1Var2 = this.f;
        if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockPreformatted)) {
            f1Var = f1Var2;
            if (aVar == null || !(aVar.b instanceof TL_iv.pageBlockBlockquote)) {
                canvas2 = canvas;
                if (aVar != null && (aVar.b instanceof TL_iv.pageBlockPullquote)) {
                    if (this.K == null) {
                        ok0 ok0Var = new ok0(this);
                        this.K = ok0Var;
                        ok0Var.a(null, null, null, this.a, 1);
                        fa.a(this.K, i6Var);
                    }
                    if (this.L == null) {
                        Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_quote).mutate();
                        this.L = mutate;
                        mutate.setColorFilter(new PorterDuffColorFilter(n6.w0(n6.Fi, i6Var), PorterDuff.Mode.SRC_IN));
                    }
                    Layout layout = f1Var.getLayout();
                    float width = getWidth();
                    if (layout != null && !TextUtils.isEmpty(layout.getText())) {
                        f10 = 0.0f;
                        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
                            width = Math.min(width, layout.getLineLeft(i10) + f1Var.getPaddingLeft() + f1Var.getLeft() + linearLayout.getLeft());
                            f10 = Math.max(f10, layout.getLineRight(i10) + f1Var.getPaddingLeft() + f1Var.getLeft() + linearLayout.getLeft());
                        }
                    } else if (f1Var.getHint() != null) {
                        float measureText = f1Var.getPaint().measureText(f1Var.getHint().toString());
                        width = Math.min(width, ((getWidth() - measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        f10 = Math.max(0.0f, ((getWidth() + measureText) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                    } else {
                        f10 = 0.0f;
                    }
                    f1 f1Var3 = this.h;
                    if (f1Var3.getVisibility() == 0) {
                        Layout layout2 = f1Var3.getLayout();
                        if (layout2 != null && !TextUtils.isEmpty(layout2.getText())) {
                            for (int i11 = 0; i11 < layout2.getLineCount(); i11++) {
                                width = Math.min(width, layout2.getLineLeft(i11) + f1Var3.getPaddingLeft() + f1Var3.getLeft());
                                f10 = Math.max(f10, layout2.getLineRight(i11) + f1Var3.getPaddingLeft() + f1Var3.getLeft());
                            }
                        } else if (f1Var3.getHint() != null) {
                            float measureText2 = f1Var3.getPaint().measureText(f1Var3.getHint().toString());
                            width = Math.min(width, ((getWidth() - measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                            f10 = Math.max(f10, ((getWidth() + measureText2) / 2.0f) + org.telegram.messenger.g0.L(2.0f));
                        }
                    }
                    if (width < f10) {
                        float L = width - org.telegram.messenger.g0.L(30.0f);
                        float L2 = org.telegram.messenger.g0.L(30.0f) + f10;
                        float floor = (float) Math.floor(bz.Y0 / 2.0f);
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
                    ok0 ok0Var2 = new ok0(this);
                    this.K = ok0Var2;
                    ok0Var2.a(null, null, null, this.a, 1);
                    fa.a(this.K, i6Var);
                }
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f), getWidth() - org.telegram.messenger.g0.L(16.0f), getHeight() - org.telegram.messenger.g0.L(8.0f));
                float floor2 = (float) Math.floor(bz.Y0 / 3.0f);
                canvas2 = canvas;
                this.K.c(floor2, floor2, floor2, 1.0f, canvas2, rectF2);
                this.K.f(canvas2, rectF2, 1.0f);
            }
        } else {
            paint.setColor(n6.w0(n6.ol, i6Var));
            int c10 = fa.c(this.y);
            int d = fa.d(this.y);
            int width2 = getWidth();
            if (c10 > 0 || d > 0) {
                int L4 = org.telegram.messenger.g0.L(16.0f) + c10;
                int L5 = org.telegram.messenger.g0.L(16.0f) + d;
                i7 = gd.a0 ? L5 : L4;
                int width3 = getWidth();
                if (!gd.a0) {
                    L4 = L5;
                }
                width2 = width3 - L4;
            } else {
                i7 = 0;
            }
            float L6 = (i7 > 0 || width2 < getWidth()) ? org.telegram.messenger.g0.L(8.0f) : 0;
            f1Var = f1Var2;
            canvas.drawRoundRect(i7, org.telegram.messenger.g0.L(7.0f), width2, getHeight() - org.telegram.messenger.g0.L(7.0f), L6, L6, paint);
            canvas2 = canvas;
        }
        if (this.W) {
            float width4 = getWidth();
            float height2 = getHeight();
            Layout layout3 = f1Var.getLayout();
            if (layout3 != null) {
                f11 = 0.0f;
                f12 = 0.0f;
                for (int i14 = 0; i14 < layout3.getLineCount(); i14++) {
                    height2 = Math.min(height2, layout3.getLineTop(i14) + f1Var.getPaddingTop() + getPaddingTop());
                    width4 = Math.min(width4, layout3.getLineLeft(i14) + f1Var.getPaddingLeft() + f1Var.getLeft() + linearLayout.getLeft());
                    f11 = Math.max(f11, layout3.getLineRight(i14) + f1Var.getPaddingLeft() + f1Var.getLeft() + linearLayout.getLeft());
                    f12 = Math.max(height2, layout3.getLineBottom(i14) + f1Var.getPaddingTop() + getPaddingTop());
                }
            } else {
                f11 = 0.0f;
                f12 = 0.0f;
            }
            if (width4 < f11 && height2 < f12) {
                float L7 = width4 - org.telegram.messenger.g0.L(4.0f);
                paint.setColor(n6.r1(0.05f, n6.w0(n6.G6, i6Var)));
                Canvas canvas3 = canvas2;
                canvas3.drawRoundRect(L7, height2 - org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f) + f11, f12 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
                canvas2 = canvas3;
            }
        }
        x5 x5Var = this.E;
        i9 textSelectionHelper = x5Var != null ? ((d3) x5Var).a.getTextSelectionHelper() : null;
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
            if (this.M == null) {
                this.M = new e0.g(this);
            }
            TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) this.y.b;
            int w02 = n6.w0(n6.Fi, i6Var);
            int L8 = org.telegram.messenger.g0.L(3.333f);
            this.M.d(canvas2, this.N, org.telegram.messenger.f3.z(16.0f, getWidth(), L8), org.telegram.messenger.f3.z(8.0f, getHeight(), L8), w02, pageblockblockquote.collapsed, l());
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
                        x5 x5Var = this.E;
                        if (x5Var != null) {
                            t3 t3Var = ((d3) x5Var).a;
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
    public final void f(a aVar, x5 x5Var, boolean z10) {
        float f10;
        float f11;
        a aVar2;
        int c10;
        boolean z11;
        boolean p10;
        SpannableStringBuilder spannableStringBuilder;
        this.y = aVar;
        this.E = x5Var;
        this.F = z10;
        this.S = -1;
        this.R = -1;
        TL_iv.PageBlock pageBlock = aVar.b;
        f1 f1Var = this.f;
        f1Var.setBlock(pageBlock);
        TL_iv.PageBlock pageBlock2 = aVar.b;
        int i7 = bz.W0;
        f1Var.setCenterEmptyHint(false);
        f1Var.setHint(getHint());
        f1Var.setTextColorKey(n6.G6);
        f1Var.setLineSpacing(0.0f, 1.0f);
        if (pageBlock2 instanceof TL_iv.pageBlockPreformatted) {
            f10 = 8.0f;
            setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(19.0f));
            f1Var.setInputType(655505);
            f1Var.setAllowNewlines(true);
            f1Var.setSoftEnterNewline(false);
            f1Var.setGravity(8388659);
            f1Var.setTextSize(1, i7 - 1);
            f1Var.setTypeface(Typeface.MONOSPACE);
            f1Var.setLineSpacing(f1Var.getPaint().getFontSpacing() * 0.3f, 1.0f);
            f1Var.setAccentHint(false);
        } else {
            f10 = 8.0f;
            if (pageBlock2 instanceof TL_iv.pageBlockBlockquote) {
                f1Var.setInputType(147457);
                f1Var.setAllowNewlines(false);
                f1Var.setSoftEnterNewline(false);
                f1Var.setGravity(8388659);
                setPadding(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(16.0f));
                f1Var.setTextSize(1, Math.max(8, i7 - 2));
                f1Var.setTypeface(null);
                f1Var.setAccentHint(true);
            } else {
                if (!(pageBlock2 instanceof TL_iv.pageBlockPullquote)) {
                    f1Var.setInputType(147457);
                    f1Var.setAllowNewlines(false);
                    f1Var.setSoftEnterNewline(false);
                    f1Var.setGravity(8388659);
                    boolean z12 = pageBlock2 instanceof TL_iv.pageBlockHeading1;
                    boolean z13 = z12 || (pageBlock2 instanceof TL_iv.pageBlockHeading2) || (pageBlock2 instanceof TL_iv.pageBlockHeading3) || (pageBlock2 instanceof TL_iv.pageBlockHeading4) || (pageBlock2 instanceof TL_iv.pageBlockHeading5) || (pageBlock2 instanceof TL_iv.pageBlockHeading6);
                    f11 = 24.0f;
                    setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(z13 ? 11.0f : 5.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(z13 ? 7.0f : 4.66f));
                    a aVar3 = this.y;
                    if (aVar3 != null && aVar3.c > 0) {
                        int L = org.telegram.messenger.g0.L(16.0f);
                        x5 x5Var2 = this.E;
                        int b10 = x5Var2 != null ? ((d3) x5Var2).b(this.y) : org.telegram.messenger.g0.L(8.0f);
                        int L2 = org.telegram.messenger.g0.L(16.0f);
                        x5 x5Var3 = this.E;
                        setPadding(L, b10, L2, x5Var3 != null ? ((d3) x5Var3).a(this.y) : org.telegram.messenger.g0.L(11.0f));
                    }
                    if (z12) {
                        f1Var.setTextSize(1, i7 + 3);
                        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading2) {
                        f1Var.setTextSize(1, i7 + 2);
                        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading3) {
                        f1Var.setTextSize(1, i7 + 1);
                        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading4) {
                        f1Var.setTextSize(1, i7);
                        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading5) {
                        f1Var.setTextSize(1, i7 - 1);
                        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockHeading6) {
                        f1Var.setTextSize(1, i7 - 2);
                        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/mw_bold.ttf"));
                    } else if (pageBlock2 instanceof TL_iv.pageBlockFooter) {
                        f1Var.setTextSize(1, i7 - 2);
                        f1Var.setTypeface(null);
                        f1Var.setTextColorKey(n6.Pd);
                    } else {
                        f1Var.setTextSize(1, (!(pageBlock2 instanceof TL_iv.pageBlockParagraph) || (aVar2 = this.y) == null || aVar2.k.isEmpty()) ? i7 : Math.max(8, i7 - 2));
                        f1Var.setTypeface(null);
                    }
                    f1Var.setAccentHint(false);
                    c10 = fa.c(aVar);
                    int d = fa.d(aVar);
                    if (c10 <= 0 || d > 0) {
                        z11 = aVar.b instanceof TL_iv.pageBlockPreformatted;
                        int paddingTop = getPaddingTop();
                        int paddingBottom = getPaddingBottom();
                        if (aVar.n) {
                            paddingTop = (aVar.l <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r7, 1, 16, 10))) + (z11 ? org.telegram.messenger.g0.L(f11) : 0);
                        }
                        if (aVar.o) {
                            paddingBottom = aVar.m <= 0 ? 0 : org.telegram.messenger.g0.L(com.google.android.gms.internal.vision.e2.v(r8, 1, 16, 10));
                        }
                        if (z11) {
                            c10 += org.telegram.messenger.g0.L(f10);
                            d += org.telegram.messenger.g0.L(f10);
                        }
                        if (gd.a0) {
                            setPadding(getPaddingLeft() + c10, paddingTop, getPaddingRight() + d, paddingBottom);
                        } else {
                            setPadding(getPaddingLeft() + d, paddingTop, getPaddingRight() + c10, paddingBottom);
                        }
                    }
                    c(aVar);
                    J(aVar.b, false);
                    if (!String.valueOf(f1Var.getText()).equals(z(aVar.b))) {
                        SpannableStringBuilder A = A(aVar.b);
                        if (t3.F3(aVar.b)) {
                            SpannableString spannableString = new SpannableString(A);
                            c6.o(spannableString, 0, spannableString.length(), 1, false, null);
                            c6.o(spannableString, 0, spannableString.length(), 2, false, null);
                            spannableStringBuilder = spannableString;
                        } else {
                            spannableStringBuilder = A;
                        }
                        f1Var.setTextSilently(j6.n(spannableStringBuilder, f1Var.getPaint().getFontMetricsInt(), false, null, 0, t3.F3(aVar.b) ? 0.85f : 1.0f, 0));
                        E(f1Var.getText());
                        f1Var.f();
                        this.I = null;
                    }
                    E(f1Var.getText());
                    K();
                    TL_iv.PageBlock pageBlock3 = aVar.b;
                    p10 = p(pageBlock3);
                    f1 f1Var2 = this.h;
                    if (p10) {
                        f1Var2.setVisibility(8);
                    } else {
                        i(pageBlock3);
                        f1Var2.setTextSize(1, Math.max(8, bz.W0 - 2));
                        f1Var2.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
                        f1Var2.setTextColorKey(n6.Fi);
                        f1Var2.setAccentHint(true);
                        f1Var2.setHint(gd.N0(2131754017, null));
                        if (pageBlock3 instanceof TL_iv.pageBlockPullquote) {
                            f1Var2.setGravity(49);
                        } else {
                            f1Var2.setGravity(8388659);
                        }
                        if (!String.valueOf(f1Var2.getText()).equals(c6.l(j(pageBlock3)))) {
                            f1Var2.setTextSilently(j6.m(c6.r(j(pageBlock3), null, true), f1Var2.getPaint().getFontMetricsInt(), false, null, 0));
                            f1Var2.f();
                        }
                        G();
                    }
                    C();
                }
                f1Var.setInputType(147457);
                f1Var.setAllowNewlines(false);
                f1Var.setSoftEnterNewline(true);
                f1Var.setGravity(49);
                f1Var.setCenterEmptyHint(true);
                setPadding(org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(16.0f));
                f1Var.setTextSize(1, Math.max(8, i7 - 2));
                f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/ritalic.ttf"));
                f1Var.setAccentHint(true);
            }
        }
        f11 = 24.0f;
        c10 = fa.c(aVar);
        int d2 = fa.d(aVar);
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
        if (gd.a0) {
        }
        c(aVar);
        J(aVar.b, false);
        if (!String.valueOf(f1Var.getText()).equals(z(aVar.b))) {
        }
        E(f1Var.getText());
        K();
        TL_iv.PageBlock pageBlock32 = aVar.b;
        p10 = p(pageBlock32);
        f1 f1Var22 = this.h;
        if (p10) {
        }
        C();
    }

    public final int g(int i7, int i10) {
        Layout layout;
        if (l()) {
            f1 f1Var = this.h;
            if (f1Var.getVisibility() == 0 && (layout = f1Var.getLayout()) != null && layout.getLineCount() > 0) {
                if (this.M == null) {
                    this.M = new e0.g(this);
                }
                int lineCount = layout.getLineCount() - 1;
                int measuredHeight = this.b.getMeasuredHeight() + getPaddingTop();
                float lineRight = layout.getLineRight(lineCount) + f1Var.getPaddingLeft() + getPaddingLeft();
                float lineTop = layout.getLineTop(lineCount) + f1Var.getPaddingTop() + measuredHeight;
                float lineBottom = layout.getLineBottom(lineCount) + f1Var.getPaddingTop() + measuredHeight;
                int L = org.telegram.messenger.g0.L(3.333f);
                float z10 = org.telegram.messenger.f3.z(16.0f, i7, L);
                this.M.getClass();
                float D = z10 - org.telegram.messenger.f3.D(3.333f, 2, org.telegram.messenger.g0.L(23.66f) + r6.a);
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

    public f1 getAuthorEditText() {
        return this.h;
    }

    public f1 getEditText() {
        return this.f;
    }

    public a getRow() {
        return this.y;
    }

    public org.telegram.ui.ActionBar.k4 getStyleDelegate() {
        return this.f;
    }

    public final void h() {
        a aVar = this.y;
        if (aVar != null) {
            i(aVar.b);
        }
        f1 f1Var = this.h;
        if (f1Var.getVisibility() != 0) {
            f1Var.setVisibility(0);
            requestLayout();
        }
        f1Var.O();
        f1Var.setSelection(f1Var.length());
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        Layout layout;
        f1 f1Var = this.f;
        Layout layout2 = f1Var.getLayout();
        if (layout2 != null) {
            LinearLayout linearLayout = this.b;
            arrayList.add(new b5(layout2, f1Var.getPaddingLeft() + f1Var.getLeft() + linearLayout.getLeft(), f1Var.getPaddingTop() + f1Var.getTop() + linearLayout.getTop(), 1));
        }
        f1 f1Var2 = this.h;
        if (f1Var2.getVisibility() != 0 || (layout = f1Var2.getLayout()) == null) {
            return;
        }
        arrayList.add(new b5(layout, f1Var2.getPaddingLeft() + f1Var2.getLeft(), f1Var2.getPaddingTop() + f1Var2.getTop(), 2));
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        H();
        f1 f1Var = this.h;
        if (f1Var.getVisibility() == 8) {
            super.onLayout(z10, i7, i10, i11, i12);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        LinearLayout linearLayout = this.b;
        linearLayout.layout(paddingLeft, paddingTop, linearLayout.getMeasuredWidth() + paddingLeft, linearLayout.getMeasuredHeight() + paddingTop);
        int measuredHeight = linearLayout.getMeasuredHeight() + paddingTop;
        f1Var.layout(paddingLeft, measuredHeight, f1Var.getMeasuredWidth() + paddingLeft, f1Var.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        F();
        int size = View.MeasureSpec.getSize(i7);
        f1 f1Var = this.h;
        if (f1Var.getVisibility() == 8) {
            this.P = 0;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), i10);
            return;
        }
        int max = Math.max(0, (size - getPaddingLeft()) - getPaddingRight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(makeMeasureSpec, makeMeasureSpec2);
        f1Var.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(0, 0));
        int paddingBottom = getPaddingBottom() + f1Var.getMeasuredHeight() + linearLayout.getMeasuredHeight() + getPaddingTop();
        int g10 = g(size, paddingBottom);
        this.P = g10;
        setMeasuredDimension(size, paddingBottom + g10);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            I();
            if (getBackground() instanceof y1) {
                ((y1) getBackground()).a(n6.w0(n6.d6, this.a));
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
            return drawable == ((m6) gVar.e) || drawable == ((fh0) gVar.f);
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
