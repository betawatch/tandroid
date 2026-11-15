package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i2 extends View implements org.telegram.ui.ActionBar.z5 {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Drawable c;

    public /* synthetic */ i2(Context context) {
        super(context);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Hl));
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
                ia.f.d().f(-org.telegram.messenger.g0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.g0.L(2.0f), ia.f.d().e());
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
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(12.0f));
                org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) this.c;
                n50 n50Var = (n50) this.b;
                int i11 = org.telegram.ui.ActionBar.j6.Hl;
                ((g4) n50Var).getClass();
                org.telegram.ui.ActionBar.j6.B1(fqVar, org.telegram.ui.ActionBar.j6.v0(i11), false);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        switch (this.a) {
            case 0:
                try {
                    org.telegram.ui.Components.fq fqVar = (org.telegram.ui.Components.fq) this.c;
                    if (fqVar != null && ((n50) this.b) != null) {
                        org.telegram.ui.ActionBar.j6.B1(fqVar, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hl, false), false);
                        invalidate();
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                ((Paint) this.b).setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.h5, false));
                invalidate();
                break;
        }
    }

    public i2(Context context, n50 n50Var) {
        super(context);
        this.b = n50Var;
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Hl, false)), org.telegram.ui.ActionBar.j6.X0(context, R.drawable.greydivider_bottom, -16777216));
        this.c = fqVar;
        fqVar.x = true;
        setBackgroundDrawable(fqVar);
        setImportantForAccessibility(2);
    }

    private final /* synthetic */ void a(HashSet hashSet) {
    }
}
