package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i5 extends a0 implements org.telegram.ui.ActionBar.z5, n9 {
    public final org.telegram.ui.ActionBar.e6 n;
    public final i1 r;
    public g5 s;
    public final ArrayList v;
    public boolean w;

    public i5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v = new ArrayList();
        this.n = e6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i1 i1Var = new i1(context, e6Var);
        this.r = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        i1Var.setTextColorKey(org.telegram.ui.ActionBar.i6.Oh);
        i1Var.setAccentHint(true);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        i1Var.setListener(new a4.l(this, 24));
        i1Var.setDelegate(new ei.c5(this, 19));
        addView(i1Var, w7.x5.e(-1, -2, 51));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g5 g5Var = this.s;
        o9 textSelectionHelper = g5Var != null ? ((c3) g5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                z9 z9Var = (z9) arrayList.get(i10);
                canvas.save();
                canvas.translate(z9Var.getX(), z9Var.getY());
                textSelectionHelper.Z(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        i1 i1Var = this.r;
        i1Var.t();
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        org.telegram.ui.ActionBar.e6 e6Var = this.n;
        i1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        i1Var.setHintTextColor(org.telegram.ui.ActionBar.i6.m1(0.5f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var)));
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.r;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new f5(layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop(), 0));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final void h() {
        a aVar;
        g5 g5Var = this.s;
        if (g5Var == null || (aVar = this.a) == null) {
            return;
        }
        long j3 = aVar.t;
        TL_iv.RichText f7 = h6.f(this.r.getText());
        x3 x3Var = ((c3) g5Var).a;
        if (f7 == null || (f7 instanceof TL_iv.textEmpty)) {
            x3Var.k3.remove(Long.valueOf(j3));
        } else {
            x3Var.k3.put(Long.valueOf(j3), f7);
        }
    }
}
