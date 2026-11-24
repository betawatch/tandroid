// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.AnimatedArrowDrawable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class be9 extends FrameLayout implements vlb, fkb {
    public final ylb a;
    public final xd9 b;
    public final AnimatedArrowDrawable c;
    public final ne9 d;
    public final Paint e;
    public ll0 f;
    public lg9 h;
    public boolean n;

    public be9(Context context, ylb ylbVar) {
        super(context);
        this.e = new Paint();
        this.a = ylbVar;
        setClipToPadding(false);
        setWillNotDraw(false);
        AnimatedArrowDrawable animatedArrowDrawable = new AnimatedArrowDrawable(cmb.v0(cmb.tl, ylbVar));
        this.c = animatedArrowDrawable;
        animatedArrowDrawable.setCallback(new jo(this, (byte) 9));
        xd9 xd9Var = new xd9((byte) 0, context, this);
        this.b = xd9Var;
        xd9Var.setOnClickListener(new wk8(this, (byte) 12));
        addView(xd9Var, qoe.e(53, -1, 51));
        ne9 ne9Var = new ne9(context, ylbVar);
        this.d = ne9Var;
        ne9Var.setAllowNewlines(false);
        ne9Var.setTextSize(1, gda.S0);
        ne9Var.setHint(jb6.M0(2131753983, null));
        ne9Var.setPadding(0, gm.L(14.0f), 0, gm.L(12.66f));
        ne9Var.setListener(new yd9(this));
        ne9Var.setDelegate(new h68((Object) this, (byte) 28));
        addView(ne9Var, qoe.d(-1, -2.0f, 51, 53.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.tl));
        hashSet.add(Integer.valueOf(cmb.vl));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lg9 lg9Var = this.h;
        gkb textSelectionHelper = lg9Var != null ? lg9Var.a.getTextSelectionHelper() : null;
        if (textSelectionHelper != null) {
            if (this.d.getLayout() != null) {
                canvas.save();
                canvas.translate(r1.getPaddingLeft() + r1.getLeft(), r1.getPaddingTop() + r1.getTop());
                textSelectionHelper.Y(canvas, this, 0);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public ne9 getEditText() {
        return this.d;
    }

    public ll0 getRow() {
        return this.f;
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        ne9 ne9Var = this.d;
        Layout layout = ne9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new zd9(this, layout, ne9Var.getPaddingLeft() + ne9Var.getLeft(), ne9Var.getPaddingTop() + ne9Var.getTop()));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ll0 ll0Var = this.f;
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if ((pageBlock instanceof TL_iv.pageBlockDetails) && ((TL_iv.pageBlockDetails) pageBlock).open) {
                return;
            }
        }
        canvas.drawRect(0.0f, r0 - 1, getMeasuredWidth(), getMeasuredHeight(), this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    public void setLocked(boolean z) {
        this.d.setLocked(z);
    }

    @Override // vlb
    public final void updateColors() {
        this.d.updateColors();
        int i = cmb.tl;
        ylb ylbVar = this.a;
        int v0 = cmb.v0(i, ylbVar);
        AnimatedArrowDrawable animatedArrowDrawable = this.c;
        animatedArrowDrawable.a.setColor(v0);
        animatedArrowDrawable.invalidateSelf();
        this.e.setColor(cmb.v0(cmb.vl, ylbVar));
    }
}
