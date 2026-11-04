package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j2 extends View implements org.telegram.ui.ActionBar.z5 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Drawable c;

    public /* synthetic */ j2(Context context) {
        super(context);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.El));
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                ha.e.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ha.e.d().e());
                float L = org.telegram.messenger.g0.L(18.0f) / 2.0f;
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
    public void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(12.0f));
                org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) this.c;
                i50 i50Var = (i50) this.b;
                int i11 = org.telegram.ui.ActionBar.k6.El;
                ((i4) i50Var).getClass();
                org.telegram.ui.ActionBar.k6.B1(xpVar, org.telegram.ui.ActionBar.k6.v0(i11), false);
                break;
            default:
                super.onMeasure(i3, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        switch (this.a) {
            case 0:
                try {
                    org.telegram.ui.Components.xp xpVar = (org.telegram.ui.Components.xp) this.c;
                    if (xpVar != null && ((i50) this.b) != null) {
                        org.telegram.ui.ActionBar.k6.B1(xpVar, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.El, false), false);
                        invalidate();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                ((Paint) this.b).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.h5, false));
                invalidate();
                break;
        }
    }

    public j2(Context context, i50 i50Var) {
        super(context);
        this.b = i50Var;
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.El, false)), org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider_bottom, -16777216));
        this.c = xpVar;
        xpVar.x = true;
        setBackgroundDrawable(xpVar);
        setImportantForAccessibility(2);
    }

    private final /* synthetic */ void a(HashSet hashSet) {
    }
}
