package ii;

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
import org.telegram.ui.Cells.r9;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class l0 {
    public final i1 a;
    public final org.telegram.ui.ActionBar.d6 b;
    public final k0 c;
    public boolean d;

    public l0(Context context, org.telegram.ui.ActionBar.d6 d6Var, k0 k0Var) {
        this.b = d6Var;
        this.c = k0Var;
        i1 i1Var = new i1(context, d6Var);
        this.a = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setHint(LocaleController.getString(R.string.AddCaption));
        i1Var.setListener(new n4.y(this, k0Var, false, 19));
        i1Var.setDelegate(new ah.b(17, this, k0Var));
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
        i1 i1Var = this.a;
        i1Var.t();
        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, this.b);
        i1Var.setTextColor(org.telegram.ui.ActionBar.h6.l1(0.5f, v02));
        i1Var.setHintTextColor(org.telegram.ui.ActionBar.h6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a N = this.c.N();
        if (N == null || (pageBlock = N.b) == null) {
            return;
        }
        d(pageBlock);
        TL_iv.RichText richText = N.b.caption.text;
        String l4 = g6.l(richText);
        i1 i1Var = this.a;
        if (String.valueOf(i1Var.getText()).equals(l4)) {
            return;
        }
        i1Var.setTextSilently(g6.r(richText, null, true));
        i1Var.invalidateEffects();
    }

    public final void c(Canvas canvas) {
        k0 k0Var = this.c;
        r9 E = k0Var.E();
        if (E != null) {
            if (this.a.getLayout() == null) {
                return;
            }
            canvas.save();
            canvas.translate(r2.getPaddingLeft() + r2.getLeft(), r2.getPaddingTop() + r2.getTop());
            E.a0(canvas, k0Var.K(), 0);
            canvas.restore();
        }
    }

    public final void e(ArrayList arrayList) {
        i1 i1Var = this.a;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new j0(this, layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        i1 i1Var = this.a;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (i1Var.getPaddingLeft() + i1Var.getLeft());
        int paddingTop = i11 - (i1Var.getPaddingTop() + i1Var.getTop());
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
        i1 i1Var = this.a;
        i1Var.layout(dp, i13, max, i1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        i1 i1Var = this.a;
        i1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return i1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a N = this.c.N();
        if (N == null || (pageBlock = N.b) == null) {
            return;
        }
        d(pageBlock);
        N.b.caption.text = g6.f(this.a.getText());
    }
}
