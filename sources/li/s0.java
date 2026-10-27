package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import bi.cc;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s0 extends FrameLayout implements p6, r9 {
    public final u6 a;
    public final cc b;
    public final AnimatedArrowDrawable c;
    public final g1 d;
    public final Paint e;
    public a f;
    public c3 h;
    public boolean n;

    public s0(Context context, u6 u6Var) {
        super(context);
        this.e = new Paint();
        this.a = u6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(y6.w0(y6.Dk, u6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new bh.u0(this, 4));
        cc ccVar = new cc(this, context, 7);
        this.b = ccVar;
        ccVar.setOnClickListener(new ig.d0(this, 10));
        addView(ccVar, kb1.i(53, -1, 51));
        g1 g1Var = new g1(context, u6Var);
        this.d = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setTextSize(1, SharedConfig.fontSize);
        g1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        g1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        g1Var.setListener(new p0(this));
        g1Var.setDelegate(new jg.e1(this, 7));
        addView(g1Var, kb1.h(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.Dk));
        hashSet.add(Integer.valueOf(y6.Fk));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c3 c3Var = this.h;
        s9 textSelectionHelper = c3Var != null ? c3Var.a.getTextSelectionHelper() : null;
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

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        g1 g1Var = this.d;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new q0(this, layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop()));
    }

    public g1 getEditText() {
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        this.d.updateColors();
        int i10 = y6.Dk;
        u6 u6Var = this.a;
        int w02 = y6.w0(i10, u6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(y6.w0(y6.Fk, u6Var));
    }
}
