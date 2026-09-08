package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import di.eb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class t0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final eb b;
    public final AnimatedArrowDrawable c;
    public final h1 d;
    public final Paint e;
    public a f;
    public c3 h;
    public boolean n;

    public t0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = new Paint();
        this.a = f6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Dk, f6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new ah.g1(this, 2));
        eb ebVar = new eb(this, context, 6);
        this.b = ebVar;
        ebVar.setOnClickListener(new ah.h0(this, 29));
        addView(ebVar, w7.x5.e(53, -1, 51));
        h1 h1Var = new h1(context, f6Var);
        this.d = h1Var;
        h1Var.setAllowNewlines(false);
        h1Var.setTextSize(1, SharedConfig.fontSize);
        h1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        h1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        h1Var.setListener(new q0(this));
        h1Var.setDelegate(new fi.f(this, 23));
        addView(h1Var, w7.x5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        this.d.t();
        int i10 = org.telegram.ui.ActionBar.j6.Dk;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fk, f6Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c3 c3Var = this.h;
        q9 textSelectionHelper = c3Var != null ? c3Var.a.getTextSelectionHelper() : null;
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

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        h1 h1Var = this.d;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new r0(this, layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop()));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
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
}
