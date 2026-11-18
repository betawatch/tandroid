package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class h0 {
    public final e1 a;
    public final i6 b;
    public final g0 c;
    public boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public h0(Context context, i6 i6Var, g0 g0Var) {
        this.b = i6Var;
        this.c = g0Var;
        e1 e1Var = new e1(context, i6Var);
        this.a = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        e1Var.setHint(gd.M0(2131754452, null));
        e1Var.setListener(new ji.j(this, g0Var, false, 8));
        e1Var.setDelegate(new e0((int) (0 == true ? 1 : 0), (Object) this, (Object) g0Var));
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
        e1 e1Var = this.a;
        e1Var.updateColors();
        int i7 = n6.G6;
        i6 i6Var = this.b;
        n6.w0(i7, i6Var);
        u6.V(e1Var, u6.K(0.5f, i7), i6Var);
        q6 K = u6.K(0.35f, i7);
        u6.n(e1Var, 1, K.a, -1, 2, K.d, i6Var);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a c12 = this.c.c1();
        if (c12 == null || (pageBlock = c12.b) == null) {
            return;
        }
        d(pageBlock);
        TL_iv.RichText richText = c12.b.caption.text;
        String l10 = b6.l(richText);
        e1 e1Var = this.a;
        if (String.valueOf(e1Var.getText()).equals(l10)) {
            return;
        }
        e1Var.setTextSilently(b6.r(richText, null, true));
        e1Var.f();
    }

    public final void c(Canvas canvas) {
        g0 g0Var = this.c;
        j9 P0 = g0Var.P0();
        if (P0 != null) {
            if (this.a.getLayout() == null) {
                return;
            }
            canvas.save();
            canvas.translate(r2.getPaddingLeft() + r2.getLeft(), r2.getPaddingTop() + r2.getTop());
            P0.Z(canvas, g0Var.a1(), 0);
            canvas.restore();
        }
    }

    public final void e(ArrayList arrayList) {
        e1 e1Var = this.a;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new f0(this, layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop()));
    }

    public final boolean f(int i7, int i10) {
        int lineForVertical;
        e1 e1Var = this.a;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i7 - (e1Var.getPaddingLeft() + e1Var.getLeft());
        int paddingTop = i10 - (e1Var.getPaddingTop() + e1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f10 = paddingLeft;
            if (f10 >= layout.getLineLeft(lineForVertical) && f10 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i7, int i10, int i11, int i12) {
        int L = org.telegram.messenger.g0.L(16.0f) + i7;
        int max = Math.max(L, (i11 - i10) - org.telegram.messenger.g0.L(16.0f));
        e1 e1Var = this.a;
        e1Var.layout(L, i12, max, e1Var.getMeasuredHeight() + i12);
    }

    public final int h(int i7, int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i11 - i7) - i10) - (org.telegram.messenger.g0.L(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        e1 e1Var = this.a;
        e1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return e1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a c12 = this.c.c1();
        if (c12 == null || (pageBlock = c12.b) == null) {
            return;
        }
        d(pageBlock);
        c12.b.caption.text = b6.f(this.a.getText());
    }
}
