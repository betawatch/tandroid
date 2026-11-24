// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mh2 extends io {
    public final /* synthetic */ byte s;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh2(FrameLayout frameLayout, Context context, byte b) {
        super(context, false, false, false);
        this.s = b;
        this.w = frameLayout;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 4:
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - gm.L(20.0f));
                Drawable drawable = (Drawable) this.w;
                drawable.setBounds(measuredWidth, wi8.D(17.0f, getMeasuredHeight(), 2), gm.L(17.0f) + measuredWidth, (gm.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.s) {
            case 3:
                super.invalidate();
                gh8 gh8Var = (gh8) this.w;
                ih8 ih8Var = gh8Var.d;
                if (gh8Var == ih8Var.l1.getPinnedHeader()) {
                    ih8Var.l1.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // io, android.view.View
    public final void onDraw(Canvas canvas) {
        int p1;
        switch (this.s) {
            case 0:
                super.onDraw(canvas);
                ((oh2) this.w).f();
                break;
            case 1:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (p1 = cmb.p1(0.15f, cmb.w0(null, cmb.K6, false)))) {
                    shapeDrawable.getPaint().setColor(p1);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
            case 5:
                canvas.save();
                canvas.translate(gm.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - gm.L(30.0f), gm.L(11.0f));
                ((l8c) this.w).b.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // io, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.s) {
            case 2:
                k86 k86Var = (k86) this.w;
                TextView textView = k86Var.f;
                TextView textView2 = k86Var.d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = gm.q.x - gm.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - textView2.getPaint().measureText(textView2.getText().toString())) - textView.getPaint().measureText(textView.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final boolean post(Runnable runnable) {
        switch (this.s) {
            case 3:
                ih8 ih8Var = ((gh8) this.w).d;
                pn pnVar = ih8.L1;
                return ih8Var.b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j) {
        switch (this.s) {
            case 3:
                ih8 ih8Var = ((gh8) this.w).d;
                pn pnVar = ih8.L1;
                return ih8Var.b.postDelayed(runnable, j);
            default:
                return super.postDelayed(runnable, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mh2(Context context, boolean z, boolean z2, boolean z3) {
        super(context, z, z2, z3);
        this.s = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh2(l8c l8cVar, Context context) {
        super(context, true, true, true);
        this.s = (byte) 5;
        this.w = l8cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh2(k86 k86Var, Context context) {
        super(context, false, true, true);
        this.s = (byte) 2;
        this.w = k86Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh2(cxa cxaVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.s = (byte) 4;
        this.w = drawable;
    }
}
