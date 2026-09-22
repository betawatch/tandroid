package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import ci.eb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u0 extends FrameLayout implements org.telegram.ui.ActionBar.z5, p9 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final eb b;
    public final AnimatedArrowDrawable c;
    public final i1 d;
    public final Paint e;
    public a f;
    public d3 h;
    public boolean n;

    public u0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = new Paint();
        this.a = e6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(i6.v0(i6.Dk, e6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new i.f(this, 1));
        eb ebVar = new eb(this, context, 6);
        this.b = ebVar;
        ebVar.setOnClickListener(new ai.v0(this, 28));
        addView(ebVar, w7.x5.e(53, -1, 51));
        i1 i1Var = new i1(context, e6Var);
        this.d = i1Var;
        i1Var.setAllowNewlines(false);
        i1Var.setTextSize(1, SharedConfig.fontSize);
        i1Var.setHint(LocaleController.getString(R.string.ArticleHintDetailsTitle));
        i1Var.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(12.66f));
        i1Var.setListener(new r0(this));
        i1Var.setDelegate(new ei.d5(this, 15));
        addView(i1Var, w7.x5.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        d3 d3Var = this.h;
        q9 textSelectionHelper = d3Var != null ? d3Var.a.getTextSelectionHelper() : null;
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        this.d.t();
        int i10 = i6.Dk;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        int v02 = i6.v0(i10, e6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(i6.v0(i6.Fk, e6Var));
    }

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        i1 i1Var = this.d;
        Layout layout = i1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new s0(this, layout, i1Var.getPaddingLeft() + i1Var.getLeft(), i1Var.getPaddingTop() + i1Var.getTop()));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public i1 getEditText() {
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
