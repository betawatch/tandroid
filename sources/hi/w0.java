package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import bi.nc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w0 extends FrameLayout implements org.telegram.ui.ActionBar.a6, r9 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final nc b;
    public final AnimatedArrowDrawable c;
    public final k1 d;
    public final Paint e;
    public a f;
    public g3 h;
    public boolean n;

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new Paint();
        this.a = f6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Dk, f6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new s0(this, 0));
        nc ncVar = new nc(this, context, 6);
        this.b = ncVar;
        ncVar.setOnClickListener(new ai.u(this, 23));
        addView(ncVar, w7.a6.e(53, -1, 51));
        k1 k1Var = new k1(context, f6Var);
        this.d = k1Var;
        k1Var.setAllowNewlines(false);
        k1Var.setTextSize(1, SharedConfig.fontSize);
        k1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        k1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        k1Var.setListener(new t0(this));
        k1Var.setDelegate(new a1.c(this, 29));
        addView(k1Var, w7.a6.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        g3 g3Var = this.h;
        s9 textSelectionHelper = g3Var != null ? g3Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            if (this.d.getLayout() != null) {
                canvas.save();
                canvas.translate(r1.getPaddingLeft() + r1.getLeft(), r1.getPaddingTop() + r1.getTop());
                textSelectionHelper.a0(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        this.d.t();
        int i10 = org.telegram.ui.ActionBar.j6.Dk;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fk, f6Var));
    }

    @Override // org.telegram.ui.Cells.r9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        k1 k1Var = this.d;
        Layout layout = k1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new u0(this, layout, k1Var.getPaddingLeft() + k1Var.getLeft(), k1Var.getPaddingTop() + k1Var.getTop()));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public k1 getEditText() {
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
}
