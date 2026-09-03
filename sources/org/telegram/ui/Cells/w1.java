package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.dc0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w1 extends org.telegram.ui.Components.k6 {
    public final /* synthetic */ int s;
    public Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Context context, boolean z4, boolean z10, boolean z11) {
        super(context, z4, z10, z11);
        this.s = 3;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.s) {
            case 1:
                super.invalidate();
                vg0 vg0Var = (vg0) this.v;
                xg0 xg0Var = vg0Var.d;
                if (vg0Var == xg0Var.b.getPinnedHeader()) {
                    xg0Var.b.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.k6, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                super.onDraw(canvas);
                ((z1) this.v).f();
                break;
            case 1:
            default:
                super.onDraw(canvas);
                break;
            case 2:
                canvas.save();
                canvas.translate(AndroidUtilities.dp(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(11.0f));
                ((o61) this.v).b.draw(canvas);
                canvas.restore();
                break;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.v;
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().d() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k6, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.s) {
            case 4:
                dc0 dc0Var = (dc0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - dc0Var.d.getPaint().measureText(dc0Var.d.getText().toString())) - dc0Var.f.getPaint().measureText(dc0Var.f.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean post(Runnable runnable) {
        ViewGroup viewGroup;
        switch (this.s) {
            case 1:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((vg0) this.v).d).containerView;
                return viewGroup.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override // android.view.View
    public boolean postDelayed(Runnable runnable, long j10) {
        ViewGroup viewGroup;
        switch (this.s) {
            case 1:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((vg0) this.v).d).containerView;
                return viewGroup.postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.s = i10;
        this.v = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(o61 o61Var, Context context) {
        super(context, true, true, true);
        this.s = 2;
        this.v = o61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(dc0 dc0Var, Context context) {
        super(context, false, true, true);
        this.s = 4;
        this.v = dc0Var;
    }
}
