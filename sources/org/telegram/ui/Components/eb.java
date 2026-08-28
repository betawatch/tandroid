package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class eb extends lb {
    private db button;
    private int childrenMeasuredWidth;
    org.telegram.ui.ActionBar.b6 resourcesProvider;
    public zb timerView;
    private boolean wrapWidth;

    public eb(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.resourcesProvider = b6Var;
    }

    public db getButton() {
        return this.button;
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i9, int i10, int i11, int i12) {
        db dbVar = this.button;
        if (dbVar != null && view != dbVar) {
            i10 = org.telegram.messenger.ll.D(12.0f, dbVar.getMeasuredWidth(), i10);
        }
        super.measureChildWithMargins(view, i9, i10, i11, i12);
        if (view != this.button) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            this.childrenMeasuredWidth = Math.max(this.childrenMeasuredWidth, view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        this.childrenMeasuredWidth = 0;
        if (this.wrapWidth) {
            i9 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_31);
        }
        super.onMeasure(i9, i10);
        if (this.button == null || View.MeasureSpec.getMode(i9) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(this.button.getMeasuredWidth() + this.childrenMeasuredWidth, getMeasuredHeight());
    }

    public void setButton(db dbVar) {
        db dbVar2 = this.button;
        if (dbVar2 != null) {
            removeCallback(dbVar2);
            removeView(this.button);
        }
        this.button = dbVar;
        if (dbVar != null) {
            addCallback(dbVar);
            addView(dbVar, 0, g7.e6.h(-2.0f, -2.0f, 8388629));
        }
    }

    public void setTimer() {
        zb zbVar = new zb(getContext(), this.resourcesProvider);
        this.timerView = zbVar;
        zbVar.b = 5000L;
        addView(zbVar, g7.e6.i(20.0f, 20.0f, 8388627, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public void setWrapWidth() {
        this.wrapWidth = true;
    }
}
