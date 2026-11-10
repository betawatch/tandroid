package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import bi.ec;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class r0 extends FrameLayout implements org.telegram.ui.ActionBar.c6, h9 {
    public final h6 a;
    public final ec b;
    public final AnimatedArrowDrawable c;
    public final g1 d;
    public final Paint e;
    public a f;
    public b3 h;
    public boolean n;

    public r0(Context context, h6 h6Var) {
        super(context);
        this.e = new Paint();
        this.a = h6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(m6.w0(m6.rl, h6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        ec ecVar = new ec(8, context, this);
        this.b = ecVar;
        ecVar.setOnClickListener(new ii.g(this, 11));
        addView(ecVar, ha.e(53, -1, 51));
        g1 g1Var = new g1(context, h6Var);
        this.d = g1Var;
        g1Var.setAllowNewlines(false);
        g1Var.setTextSize(1, iz.W0);
        g1Var.setHint(id.M0(2131754018, null));
        g1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        g1Var.setListener(new o0(this));
        g1Var.setDelegate(new l2.x(this, 5));
        addView(g1Var, ha.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.rl));
        hashSet.add(Integer.valueOf(m6.tl));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b3 b3Var = this.h;
        i9 textSelectionHelper = b3Var != null ? b3Var.a.getTextSelectionHelper() : null;
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

    public g1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f;
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        g1 g1Var = this.d;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new p0(this, layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop()));
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    public void setLocked(boolean z9) {
        this.d.setLocked(z9);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.d.updateColors();
        int i7 = m6.rl;
        h6 h6Var = this.a;
        int w02 = m6.w0(i7, h6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(m6.w0(m6.tl, h6Var));
    }
}
