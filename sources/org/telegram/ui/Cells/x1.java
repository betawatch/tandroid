package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.qb0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class x1 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int s;
    public Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Context context, boolean z10, boolean z11, boolean z12) {
        super(context, z10, z11, z12);
        this.s = 3;
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.s) {
            case 1:
                super.invalidate();
                ih0 ih0Var = (ih0) this.v;
                kh0 kh0Var = ih0Var.d;
                if (ih0Var == kh0Var.b.getPinnedHeader()) {
                    kh0Var.b.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                super.onDraw(canvas);
                ((a2) this.v).f();
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
                ((g71) this.v).b.draw(canvas);
                canvas.restore();
                break;
            case 3:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.v;
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.q6, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.s) {
            case 4:
                qb0 qb0Var = (qb0) this.v;
                int size = View.MeasureSpec.getSize(i10);
                if (size <= 0) {
                    size = AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - qb0Var.d.getPaint().measureText(qb0Var.d.getText().toString())) - qb0Var.f.getPaint().measureText(qb0Var.f.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((ih0) this.v).d).containerView;
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) ((ih0) this.v).d).containerView;
                return viewGroup.postDelayed(runnable, j10);
            default:
                return super.postDelayed(runnable, j10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(FrameLayout frameLayout, Context context, int i10) {
        super(context, false, false, false);
        this.s = i10;
        this.v = frameLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(g71 g71Var, Context context) {
        super(context, true, true, true);
        this.s = 2;
        this.v = g71Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(qb0 qb0Var, Context context) {
        super(context, false, true, true);
        this.s = 4;
        this.v = qb0Var;
    }
}
