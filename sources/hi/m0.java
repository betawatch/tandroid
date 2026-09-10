package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;
import bi.cb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.s9;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m0 {
    public final k1 a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final l0 c;
    public boolean d;

    public m0(Context context, org.telegram.ui.ActionBar.f6 f6Var, l0 l0Var) {
        this.b = f6Var;
        this.c = l0Var;
        k1 k1Var = new k1(context, f6Var);
        this.a = k1Var;
        k1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        k1Var.setAllowNewlines(false);
        k1Var.setInputType(147457);
        k1Var.setGravity(8388659);
        k1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        k1Var.setHint(LocaleController.getString(R.string.AddCaption));
        k1Var.setListener(new n4.y(this, l0Var, false, 21));
        k1Var.setDelegate(new cb(13, this, l0Var));
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
        k1 k1Var = this.a;
        k1Var.t();
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.b);
        k1Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(0.5f, v02));
        k1Var.setHintTextColor(org.telegram.ui.ActionBar.j6.l1(0.35f, v02));
    }

    public final void b() {
        TL_iv.PageBlock pageBlock;
        a O = this.c.O();
        if (O == null || (pageBlock = O.b) == null) {
            return;
        }
        d(pageBlock);
        TL_iv.RichText richText = O.b.caption.text;
        String l4 = i6.l(richText);
        k1 k1Var = this.a;
        if (String.valueOf(k1Var.getText()).equals(l4)) {
            return;
        }
        k1Var.setTextSilently(i6.r(richText, null, true));
        k1Var.invalidateEffects();
    }

    public final void c(Canvas canvas) {
        l0 l0Var = this.c;
        s9 E = l0Var.E();
        if (E != null) {
            if (this.a.getLayout() == null) {
                return;
            }
            canvas.save();
            canvas.translate(r2.getPaddingLeft() + r2.getLeft(), r2.getPaddingTop() + r2.getTop());
            E.a0(canvas, l0Var.M(), 0);
            canvas.restore();
        }
    }

    public final void e(ArrayList arrayList) {
        k1 k1Var = this.a;
        Layout layout = k1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new k0(this, layout, k1Var.getPaddingLeft() + k1Var.getLeft(), k1Var.getPaddingTop() + k1Var.getTop()));
    }

    public final boolean f(int i10, int i11) {
        int lineForVertical;
        k1 k1Var = this.a;
        Layout layout = k1Var.getLayout();
        if (layout == null) {
            return false;
        }
        int paddingLeft = i10 - (k1Var.getPaddingLeft() + k1Var.getLeft());
        int paddingTop = i11 - (k1Var.getPaddingTop() + k1Var.getTop());
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
        k1 k1Var = this.a;
        k1Var.layout(dp, i13, max, k1Var.getMeasuredHeight() + i13);
    }

    public final int h(int i10, int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i12 - i10) - i11) - (AndroidUtilities.dp(16.0f) * 2)), TLObject.FLAG_30);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        k1 k1Var = this.a;
        k1Var.measure(makeMeasureSpec, makeMeasureSpec2);
        return k1Var.getMeasuredHeight();
    }

    public final void i() {
        TL_iv.PageBlock pageBlock;
        a O = this.c.O();
        if (O == null || (pageBlock = O.b) == null) {
            return;
        }
        d(pageBlock);
        O.b.caption.text = i6.f(this.a.getText());
    }
}
