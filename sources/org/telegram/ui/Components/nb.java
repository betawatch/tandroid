package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public abstract class nb extends ub {
    private mb button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.e6 resourcesProvider;
    public jc timerView;
    private boolean wrapWidth;

    public nb(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.resourcesProvider = e6Var;
    }

    public mb getButton() {
        return this.button;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        mb mbVar = this.button;
        if (mbVar != null && view != mbVar) {
            i11 = org.telegram.messenger.wh.D(12.0f, mbVar.getMeasuredWidth(), i11);
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

    public void setButton(mb mbVar) {
        mb mbVar2 = this.button;
        if (mbVar2 != null) {
            removeCallback(mbVar2);
            removeView(this.button);
        }
        this.button = mbVar;
        if (mbVar != null) {
            addCallback(mbVar);
            addView(mbVar, 0, w7.y5.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        jc jcVar = new jc(getContext(), this.resourcesProvider);
        this.timerView = jcVar;
        jcVar.b = 5000L;
        addView(jcVar, w7.y5.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
