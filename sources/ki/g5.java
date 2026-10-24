package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Cells.z9;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class g5 extends a0 implements org.telegram.ui.ActionBar.b6, n9 {
    public final org.telegram.ui.ActionBar.g6 n;
    public final h1 r;
    public e5 s;
    public final ArrayList v;
    public boolean w;

    public g5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.v = new ArrayList();
        this.n = g6Var;
        f(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        h1 h1Var = new h1(context, g6Var);
        this.r = h1Var;
        h1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        h1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        h1Var.setTextColorKey(k6.Oh);
        h1Var.setAccentHint(true);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        h1Var.setListener(new k2.w0(this, 3));
        h1Var.setDelegate(new j5.b(this, 8));
        addView(h1Var, w7.z5.e(-1, -2, 51));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Oh));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e5 e5Var = this.s;
        o9 textSelectionHelper = e5Var != null ? ((b3) e5Var).a.getTextSelectionHelper() : null;
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

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.r;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new d5(layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop(), 0));
    }

    public final void g() {
        a aVar;
        e5 e5Var = this.s;
        if (e5Var == null || (aVar = this.a) == null) {
            return;
        }
        long j10 = aVar.t;
        TL_iv.RichText f7 = e6.f(this.r.getText());
        w3 w3Var = ((b3) e5Var).a;
        if (f7 == null || (f7 instanceof TL_iv.textEmpty)) {
            w3Var.n3.remove(Long.valueOf(j10));
        } else {
            w3Var.n3.put(Long.valueOf(j10), f7);
        }
    }

    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        h1 h1Var = this.r;
        h1Var.updateColors();
        int i10 = k6.Oh;
        org.telegram.ui.ActionBar.g6 g6Var = this.n;
        h1Var.setTextColor(k6.w0(i10, g6Var));
        h1Var.setHintTextColor(k6.o1(0.5f, k6.w0(i10, g6Var)));
    }
}
