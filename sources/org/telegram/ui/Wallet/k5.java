package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class k5 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5(o6 o6Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = o6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 0:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        int i7;
        switch (this.a) {
            case 0:
                o6 o6Var = this.b;
                if (o6Var.q0) {
                    bi.i6 i6Var = o6Var.a;
                    i7 = -(i6Var != null ? i6Var.getPaddingTop() : 0);
                } else {
                    i7 = 0;
                }
                canvas.save();
                int width = getWidth();
                int height = getHeight();
                bi.i6 i6Var2 = o6Var.a;
                canvas.clipRect(0, i7, width, (i6Var2 != null ? i6Var2.getPaddingBottom() : 0) + height);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                if (getParent() instanceof ViewGroup) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                    break;
                }
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                o6 o6Var = this.b;
                hi.q1 q1Var = o6Var.s0;
                bi.i6 i6Var = o6Var.a;
                int i13 = -(i6Var != null ? i6Var.getPaddingTop() : 0);
                int i14 = i11 - i7;
                int i15 = i12 - i10;
                bi.i6 i6Var2 = o6Var.a;
                q1Var.layout(0, i13, i14, (i6Var2 != null ? i6Var2.getPaddingBottom() : 0) + i15);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size, size2);
                o6 o6Var = this.b;
                hi.q1 q1Var = o6Var.s0;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
                bi.i6 i6Var = o6Var.a;
                int paddingTop = (i6Var != null ? i6Var.getPaddingTop() : 0) + size2;
                bi.i6 i6Var2 = o6Var.a;
                q1Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((i6Var2 != null ? i6Var2.getPaddingBottom() : 0) + paddingTop, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(this.b.T.d(org.telegram.messenger.g0.L(4.0f))));
                break;
        }
    }

    private final void a(boolean z10) {
    }
}
