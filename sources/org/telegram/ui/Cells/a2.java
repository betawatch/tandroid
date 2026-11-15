package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.te0;
import org.telegram.ui.v90;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a2 extends org.telegram.ui.Components.h6 {
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
                re0 re0Var = (re0) this.w;
                te0 te0Var = re0Var.d;
                if (re0Var == te0Var.m1.getPinnedHeader()) {
                    te0Var.m1.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
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
                ((b51) this.w).b.draw(canvas);
                canvas.restore();
                break;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (r12 = org.telegram.ui.ActionBar.j6.r1(0.15f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.L6, false)))) {
                    shapeDrawable.getPaint().setColor(r12);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.s) {
            case 4:
                v90 v90Var = (v90) this.w;
                int size = View.MeasureSpec.getSize(i7);
                if (size <= 0) {
                    size = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - v90Var.d.getPaint().measureText(v90Var.d.getText().toString())) - v90Var.f.getPaint().measureText(v90Var.f.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
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
                te0 te0Var = ((re0) this.w).d;
                n8 n8Var = te0.M1;
                return te0Var.b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override // android.view.View
    public boolean postDelayed(Runnable runnable, long j3) {
        switch (this.s) {
            case 1:
                te0 te0Var = ((re0) this.w).d;
                n8 n8Var = te0.M1;
                return te0Var.b.postDelayed(runnable, j3);
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
    public a2(b51 b51Var, Context context) {
        super(context, true, true, true);
        this.s = 2;
        this.w = b51Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(v90 v90Var, Context context) {
        super(context, false, true, true);
        this.s = 4;
        this.w = v90Var;
    }
}
