package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.rf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.za0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a2 extends org.telegram.ui.Components.f6 {
    public final /* synthetic */ int s;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.s = 3;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.s) {
            case 1:
                super.invalidate();
                rf0 rf0Var = (rf0) this.w;
                tf0 tf0Var = rf0Var.d;
                if (rf0Var == tf0Var.i1.getPinnedHeader()) {
                    tf0Var.i1.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.f6, android.view.View
    public void onDraw(Canvas canvas) {
        int r12;
        switch (this.s) {
            case 0:
                super.onDraw(canvas);
                ((c2) this.w).f();
                break;
            case 1:
            default:
                super.onDraw(canvas);
                break;
            case 2:
                canvas.save();
                canvas.translate(org.telegram.messenger.i0.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(11.0f));
                ((b61) this.w).b.draw(canvas);
                canvas.restore();
                break;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.t6.r1(0.15f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(r12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.f6, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.s) {
            case 4:
                za0 za0Var = (za0) this.w;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - za0Var.d.getPaint().measureText(za0Var.d.getText().toString())) - za0Var.f.getPaint().measureText(za0Var.f.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean post(Runnable runnable) {
        switch (this.s) {
            case 1:
                tf0 tf0Var = ((rf0) this.w).d;
                mh.g gVar = tf0.I1;
                return tf0Var.b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override // android.view.View
    public boolean postDelayed(Runnable runnable, long j10) {
        switch (this.s) {
            case 1:
                tf0 tf0Var = ((rf0) this.w).d;
                mh.g gVar = tf0.I1;
                return tf0Var.b.postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.s = i10;
        this.w = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b61 b61Var, Context context) {
        super(context, true, true, true);
        this.s = 2;
        this.w = b61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(za0 za0Var, Context context) {
        super(context, false, true, true);
        this.s = 4;
        this.w = za0Var;
    }
}
