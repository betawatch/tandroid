package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.x90;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a2 extends org.telegram.ui.Components.i6 {
    public final /* synthetic */ int s;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Context context, boolean z9, boolean z10, boolean z11) {
        super(context, z9, z10, z11);
        this.s = 3;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.s) {
            case 1:
                super.invalidate();
                oe0 oe0Var = (oe0) this.w;
                qe0 qe0Var = oe0Var.d;
                if (oe0Var == qe0Var.l1.getPinnedHeader()) {
                    qe0Var.l1.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.i6, android.view.View
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
                canvas.translate(org.telegram.messenger.g0.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(11.0f));
                ((z41) this.w).b.draw(canvas);
                canvas.restore();
                break;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.m6.r1(0.15f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(r12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i6, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.s) {
            case 4:
                x90 x90Var = (x90) this.w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - x90Var.d.getPaint().measureText(x90Var.d.getText().toString())) - x90Var.f.getPaint().measureText(x90Var.f.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public boolean post(Runnable runnable) {
        switch (this.s) {
            case 1:
                qe0 qe0Var = ((oe0) this.w).d;
                o8 o8Var = qe0.L1;
                return qe0Var.b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override // android.view.View
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.s) {
            case 1:
                qe0 qe0Var = ((oe0) this.w).d;
                o8 o8Var = qe0.L1;
                return qe0Var.b.postDelayed(runnable, j3);
            default:
                return super.postDelayed(runnable, j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(FrameLayout frameLayout, Context context, int i7) {
        super(context, false, false, false);
        this.s = i7;
        this.w = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(z41 z41Var, Context context) {
        super(context, true, true, true);
        this.s = 2;
        this.w = z41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(x90 x90Var, Context context) {
        super(context, false, true, true);
        this.s = 4;
        this.w = x90Var;
    }
}
