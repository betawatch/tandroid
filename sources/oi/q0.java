package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class q0 extends FrameLayout implements org.telegram.ui.ActionBar.b6, i9 {
    public final h6 a;
    public final bi.m3 b;
    public final AnimatedArrowDrawable c;
    public final f1 d;
    public final Paint e;
    public a f;
    public c3 h;
    public boolean n;

    public q0(Context context, h6 h6Var) {
        super(context);
        this.e = new Paint();
        this.a = h6Var;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(m6.w0(m6.ul, h6Var));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new a5.b(this, 5));
        bi.m3 m3Var = new bi.m3(9, context, this);
        this.b = m3Var;
        m3Var.setOnClickListener(new hi.o4(this, 18));
        addView(m3Var, ma.e(53, -1, 51));
        f1 f1Var = new f1(context, h6Var);
        this.d = f1Var;
        f1Var.setAllowNewlines(false);
        f1Var.setTextSize(1, bz.W0);
        f1Var.setHint(gd.N0(2131754015, null));
        f1Var.setPadding(0, org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(12.66f));
        f1Var.setListener(new n0(this));
        f1Var.setDelegate(new kg.x1(this, 20));
        addView(f1Var, ma.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.ul));
        hashSet.add(Integer.valueOf(m6.wl));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c3 c3Var = this.h;
        j9 textSelectionHelper = c3Var != null ? c3Var.a.getTextSelectionHelper() : null;
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

    public f1 getEditText() {
        return this.d;
    }

    public a getRow() {
        return this.f;
    }

    @Override // org.telegram.ui.Cells.i9
    public final void k(ArrayList arrayList) {
        f1 f1Var = this.d;
        Layout layout = f1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new o0(this, layout, f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop()));
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

    public void setLocked(boolean z10) {
        this.d.setLocked(z10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        this.d.updateColors();
        int i7 = m6.ul;
        h6 h6Var = this.a;
        int w02 = m6.w0(i7, h6Var);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(w02);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(m6.w0(m6.wl, h6Var));
    }
}
