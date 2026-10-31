package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.eq;
import org.telegram.ui.h4;
import org.telegram.ui.m60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k1 extends View implements k6 {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Drawable c;

    public /* synthetic */ k1(Context context) {
        super(context);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                break;
            default:
                hashSet.add(Integer.valueOf(t6.El));
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                ea.f.d().f(-org.telegram.messenger.i0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(2.0f), ea.f.d().e());
                float L = org.telegram.messenger.i0.L(18.0f) / 2.0f;
                Drawable drawable = this.c;
                drawable.setBounds((int) (measuredWidth - L), (int) (measuredHeight - L), (int) (measuredWidth + L), (int) (measuredHeight + L));
                drawable.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(12.0f));
                eq eqVar = (eq) this.c;
                m60 m60Var = (m60) this.b;
                int i12 = t6.El;
                ((h4) m60Var).getClass();
                t6.B1(eqVar, t6.v0(i12), false);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        switch (this.a) {
            case 0:
                ((Paint) this.b).setColor(t6.x0(null, t6.h5, false));
                invalidate();
                break;
            default:
                try {
                    eq eqVar = (eq) this.c;
                    if (eqVar != null && ((m60) this.b) != null) {
                        t6.B1(eqVar, t6.x0(null, t6.El, false), false);
                        invalidate();
                        break;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
                break;
        }
    }

    public k1(Context context, m60 m60Var) {
        super(context);
        this.b = m60Var;
        eq eqVar = new eq(new ColorDrawable(t6.x0(null, t6.El, false)), t6.X0(context, R.drawable.greydivider_bottom, -16777216));
        this.c = eqVar;
        eqVar.x = true;
        setBackgroundDrawable(eqVar);
        setImportantForAccessibility(2);
    }

    private final /* synthetic */ void a(HashSet hashSet) {
    }
}
