package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class j0 {
    public final g1 a;
    public final u6 b;
    public final i0 c;
    public boolean d;

    public j0(Context context, u6 u6Var, i0 i0Var) {
        this.b = u6Var;
        this.c = i0Var;
        g1 g1Var = new g1(context, u6Var);
        this.a = g1Var;
        g1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(8388659);
        g1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        g1Var.setHint(LocaleController.getString(R.string.AddCaption));
        g1Var.setListener(new yf.c(this, i0Var));
        g1Var.setDelegate(new ai.f0(25, this, i0Var));
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
        g1 g1Var = this.a;
        g1Var.updateColors();
        int i10 = y6.G6;
        u6 u6Var = this.b;
        y6.w0(i10, u6Var);
        f7.W(g1Var, f7.L(0.5f, i10), u6Var);
        b7 L = f7.L(0.35f, i10);
        f7.o(g1Var, 1, L.a, -1, 2, L.d, u6Var);
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a L = this.c.L();
        if (L == null || (pageBlock = L.b) == null) {
            return;
        }
        d(pageBlock);
        TL_iv.RichText richText = L.b.caption.text;
        String l4 = f6.l(richText);
        g1 g1Var = this.a;
        if (String.valueOf(g1Var.getText()).equals(l4)) {
            return;
        }
        g1Var.setTextSilently(f6.r(richText, null, true));
        g1Var.invalidateEffects();
    }

    public final void c(Canvas canvas) {
        i0 i0Var = this.c;
        s9 C = i0Var.C();
        if (C != null) {
            if (this.a.getLayout() == null) {
                return;
            }
            canvas.save();
            canvas.translate(r2.getPaddingLeft() + r2.getLeft(), r2.getPaddingTop() + r2.getTop());
            C.Z(canvas, i0Var.K(), 0);
            canvas.restore();
        }
    }

    public final void e(ArrayList arrayList) {
        g1 g1Var = this.a;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new h0(this, layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        g1 g1Var = this.a;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (g1Var.getPaddingLeft() + g1Var.getLeft());
        int paddingTop = i11 - (g1Var.getPaddingTop() + g1Var.getTop());
        if (paddingTop >= 0 && paddingTop < layout.getHeight() && (lineForVertical = layout.getLineForVertical(paddingTop)) >= 0 && lineForVertical < layout.getLineCount()) {
            float f7 = paddingLeft;
            if (f7 >= layout.getLineLeft(lineForVertical) && f7 <= layout.getLineRight(lineForVertical)) {
                return true;
            }
        }
        return false;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        int dp = AndroidUtilities.dp(16.0f) + i10;
        int max = Math.max(dp, (i12 - i11) - AndroidUtilities.dp(16.0f));
        g1 g1Var = this.a;
        g1Var.layout(dp, i13, max, g1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        g1 g1Var = this.a;
        g1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return g1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a L = this.c.L();
        if (L == null || (pageBlock = L.b) == null) {
            return;
        }
        d(pageBlock);
        L.b.caption.text = f6.f(this.a.getText());
    }
}
