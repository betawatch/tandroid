package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class pb extends wb {
    private ob button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.c6 resourcesProvider;
    public lc timerView;
    private boolean wrapWidth;

    public pb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.resourcesProvider = c6Var;
    }

    public ob getButton() {
        return this.button;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ob obVar = this.button;
        if (obVar != null && view != obVar) {
            i11 = org.telegram.ui.Cells.d0.b(12.0f, obVar.getMeasuredWidth(), i11);
        }
        super.measureChildWithMargins(view, i10, i11, i12, i13);
        if (view != this.button) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        this.childrenMeasuredWidth = 0;
        if (this.wrapWidth) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
        }
        super.onMeasure(i10, i11);
        if (this.button == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
    }

    public void setButton(ob obVar) {
        ob obVar2 = this.button;
        if (obVar2 != null) {
            removeCallback(obVar2);
            removeView(this.button);
        }
        this.button = obVar;
        if (obVar != null) {
            addCallback(obVar);
            addView(obVar, 0, w7.a6.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        lc lcVar = new lc(getContext(), this.resourcesProvider);
        this.timerView = lcVar;
        lcVar.b = 5000L;
        addView(lcVar, w7.a6.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
