package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class n0 {
    public final n1 a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final m0 c;
    public boolean d;

    public n0(Context context, org.telegram.ui.ActionBar.p6 p6Var, m0 m0Var) {
        this.b = p6Var;
        this.c = m0Var;
        n1 n1Var = new n1(context, p6Var);
        this.a = n1Var;
        n1Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        n1Var.setAllowNewlines(false);
        n1Var.setInputType(147457);
        n1Var.setGravity(8388659);
        n1Var.setTextSize(1, Math.max(8, tz.W0 - 2));
        n1Var.setHint(cd.L0(2131754454, null));
        n1Var.setListener(new hf.b(this, m0Var, false, 7));
        n1Var.setDelegate(new ag.m(4, this, m0Var));
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
        n1 n1Var = this.a;
        n1Var.updateColors();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        a7.W(n1Var, a7.L(0.5f, i10), p6Var);
        org.telegram.ui.ActionBar.w6 L = a7.L(0.35f, i10);
        a7.o(n1Var, 1, L.a, -1, 2, L.d, p6Var);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a L = this.c.L();
        if (L == null || (pageBlock = L.b) == null) {
            return;
        }
        d(pageBlock);
        TL_iv.RichText richText = L.b.caption.text;
        String l4 = s6.l(richText);
        n1 n1Var = this.a;
        if (String.valueOf(n1Var.getText()).equals(l4)) {
            return;
        }
        n1Var.setTextSilently(s6.r(richText, null, true));
        n1Var.f();
    }

    public final void c(Canvas canvas) {
        m0 m0Var = this.c;
        k9 y3 = m0Var.y();
        if (y3 != null) {
            if (this.a.getLayout() == null) {
                return;
            }
            canvas.save();
            canvas.translate(r2.getPaddingLeft() + r2.getLeft(), r2.getPaddingTop() + r2.getTop());
            y3.Z(canvas, m0Var.J(), 0);
            canvas.restore();
        }
    }

    public final void e(ArrayList arrayList) {
        n1 n1Var = this.a;
        Layout layout = n1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new l0(this, layout, n1Var.getPaddingLeft() + n1Var.getLeft(), n1Var.getPaddingTop() + n1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        n1 n1Var = this.a;
        Layout layout = n1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (n1Var.getPaddingLeft() + n1Var.getLeft());
        int paddingTop = i11 - (n1Var.getPaddingTop() + n1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f7 = paddingLeft;
            if (f7 >= layout.getLineLeft(lineForVertical) && f7 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int L = org.telegram.messenger.i0.L(16.0f) + i10;
        int max = Math.max(L, (i12 - i11) - org.telegram.messenger.i0.L(16.0f));
        n1 n1Var = this.a;
        n1Var.layout(L, i13, max, n1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (org.telegram.messenger.i0.L(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        n1 n1Var = this.a;
        n1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return n1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a L = this.c.L();
        if (L == null || (pageBlock = L.b) == null) {
            return;
        }
        d(pageBlock);
        L.b.caption.text = s6.f(this.a.getText());
    }
}
