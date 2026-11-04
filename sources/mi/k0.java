package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class k0 {
    public final h1 a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final j0 c;
    public boolean d;

    public k0(Context context, org.telegram.ui.ActionBar.e6 e6Var, j0 j0Var) {
        this.b = e6Var;
        this.c = j0Var;
        h1 h1Var = new h1(context, e6Var);
        this.a = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, az.W0 - 2));
        h1Var.setHint(bd.M0(2131754454, null));
        h1Var.setListener(new h0(0, this, j0Var));
        h1Var.setDelegate(new ai.n(29, this, j0Var));
        a();
    }

    public static void d(TL_iv.PageBlock pageBlock) {
        if (pageBlock == null) {
            return;
        }
        if (pageBlock.caption == null) {
            pageBlock.caption = new TL_iv.PageCaption();
        }
        TL_iv.PageCaption pageCaption = pageBlock.caption;
        if (pageCaption.text == null) {
            pageCaption.text = new TL_iv.textEmpty();
        }
        TL_iv.PageCaption pageCaption2 = pageBlock.caption;
        if (pageCaption2.credit == null) {
            pageCaption2.credit = new TL_iv.textEmpty();
        }
    }

    public final void a() {
        h1 h1Var = this.a;
        h1Var.updateColors();
        int i3 = k6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        k6.w0(i3, e6Var);
        r6.W(h1Var, r6.L(0.5f, i3), e6Var);
        n6 L = r6.L(0.35f, i3);
        r6.o(h1Var, 1, L.a, -1, 2, L.d, e6Var);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a j12 = this.c.j1();
        if (j12 == null || (pageBlock = j12.b) == null) {
            return;
        }
        d(pageBlock);
        TL_iv.RichText richText = j12.b.caption.text;
        String l10 = d6.l(richText);
        h1 h1Var = this.a;
        if (String.valueOf(h1Var.getText()).equals(l10)) {
            return;
        }
        h1Var.setTextSilently(d6.r(richText, null, true));
        h1Var.f();
    }

    public final void c(Canvas canvas) {
        j0 j0Var = this.c;
        h9 O0 = j0Var.O0();
        if (O0 != null) {
            if (this.a.getLayout() == null) {
                return;
            }
            canvas.save();
            canvas.translate(r2.getPaddingLeft() + r2.getLeft(), r2.getPaddingTop() + r2.getTop());
            O0.Z(canvas, j0Var.e1(), 0);
            canvas.restore();
        }
    }

    public final void e(ArrayList arrayList) {
        h1 h1Var = this.a;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new i0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    public final boolean f(int i3, int i10) {
        int lineForVertical;
        h1 h1Var = this.a;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i3 - (h1Var.getPaddingLeft() + h1Var.getLeft());
        int paddingTop = i10 - (h1Var.getPaddingTop() + h1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f10 = paddingLeft;
            if (f10 >= layout.getLineLeft(lineForVertical) && f10 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i3, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(16.0f) + i3;
        int max = Math.max(L, (i11 - i10) - org.telegram.messenger.g0.L(16.0f));
        h1 h1Var = this.a;
        h1Var.layout(L, i12, max, h1Var.getMeasuredHeight() + i12);
    }

    public final int h(int i3, int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i11 - i3) - i10) - (org.telegram.messenger.g0.L(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        h1 h1Var = this.a;
        h1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return h1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a j12 = this.c.j1();
        if (j12 == null || (pageBlock = j12.b) == null) {
            return;
        }
        d(pageBlock);
        j12.b.caption.text = d6.f(this.a.getText());
    }
}
