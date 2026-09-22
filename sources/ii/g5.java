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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class g5 extends a0 implements org.telegram.ui.ActionBar.z5, q9 {
    public final org.telegram.ui.ActionBar.f6 n;
    public final i1 r;
    public e5 s;
    public final ArrayList v;
    public boolean w;

    public g5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.v = new ArrayList();
        this.n = f6Var;
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        i1 i1Var = new i1(context, f6Var);
        this.r = i1Var;
        i1Var.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
        i1Var.setAllowNewlines(false);
        i1Var.setInputType(147457);
        i1Var.setGravity(8388659);
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        i1Var.setTextColorKey(j6.Oh);
        i1Var.setAccentHint(true);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintAuthor));
        i1Var.setListener(new android.support.v4.media.c(this, 22));
        i1Var.setDelegate(new ei.d5(this, 20));
        addView(i1Var, w7.y5.e(-1, -2, 51));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        e5 e5Var = this.s;
        r9 textSelectionHelper = e5Var != null ? ((b3) e5Var).a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            ArrayList arrayList = this.v;
            arrayList.clear();
            fillTextLayoutBlocks(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ca caVar = (ca) arrayList.get(i10);
                canvas.save();
                canvas.translate(caVar.getX(), caVar.getY());
                textSelectionHelper.a0(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        i1 i1Var = this.r;
        i1Var.t();
        int i10 = j6.Oh;
        org.telegram.ui.ActionBar.f6 f6Var = this.n;
        i1Var.setTextColor(j6.v0(i10, f6Var));
        i1Var.setHintTextColor(j6.l1(0.5f, j6.v0(i10, f6Var)));
    }

    @Override // org.telegram.ui.Cells.q9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.r;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new d5(layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop(), 0));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public a getRow() {
        return this.a;
    }

    public final void h() {
        a aVar;
        e5 e5Var = this.s;
        if (e5Var == null || (aVar = this.a) == null) {
            return;
        }
        long j3 = aVar.t;
        TL_iv.RichText f7 = f6.f(this.r.getText());
        w3 w3Var = ((b3) e5Var).a;
        if (f7 == null || (f7 instanceof TL_iv.textEmpty)) {
            w3Var.m3.remove(Long.valueOf(j3));
        } else {
            w3Var.m3.put(Long.valueOf(j3), f7);
        }
    }
}
