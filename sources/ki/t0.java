package ki;

import ai.jc;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class t0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, n9 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final jc b;
    public final AnimatedArrowDrawable c;
    public final h1 d;
    public final Paint e;
    public a f;
    public d3 h;
    public boolean n;

    public t0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = new Paint();
        this.a = g6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(k6.w0(k6.Dk, g6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.f1(this, 3));
        jc jcVar = new jc(this, context, 7);
        this.b = jcVar;
        jcVar.setOnClickListener(new hg.r0(this, 9));
        addView(jcVar, w7.z5.e(53, -1, 51));
        h1 h1Var = new h1(context, g6Var);
        this.d = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setTextSize(1, SharedConfig.fontSize);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        h1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        h1Var.setListener(new q0(this));
        h1Var.setDelegate(new j5.b(this, 3));
        addView(h1Var, w7.z5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Dk));
        hashSet.add(Integer.valueOf(k6.Fk));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d3 d3Var = this.h;
        o9 textSelectionHelper = d3Var != null ? d3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            if (this.d.getLayout() != null) {
                canvas.save();
                canvas.translate(r1.getPaddingLeft() + r1.getLeft(), r1.getPaddingTop() + r1.getTop());
                textSelectionHelper.Z(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.d;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new r0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    public h1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        a aVar = this.f;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        canvas.drawRect(0.0f, r0 - 1, getMeasuredWidth(), getMeasuredHeight(), this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        this.d.updateColors();
        int i10 = k6.Dk;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        int w02 = k6.w0(i10, g6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(k6.w0(k6.Fk, g6Var));
    }
}
