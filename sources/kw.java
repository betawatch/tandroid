// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kw extends View implements vlb {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Drawable c;

    public kw(Activity activity, ui5 ui5Var) {
        super(activity);
        this.b = ui5Var;
        sn2 sn2Var = new sn2(new ColorDrawable(cmb.w0(null, cmb.Gl, false)), cmb.V0(activity, R.drawable.greydivider_bottom, -16777216));
        this.c = sn2Var;
        sn2Var.x = true;
        setBackgroundDrawable(sn2Var);
        setImportantForAccessibility(2);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(cmb.Gl));
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.b);
                oj8.d().f(-gm.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - gm.L(2.0f), oj8.d().e());
                float L = gm.L(18.0f) / 2.0f;
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
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(12.0f));
                sn2 sn2Var = (sn2) this.c;
                ui5 ui5Var = (ui5) this.b;
                int i3 = cmb.Gl;
                ((o) ui5Var).getClass();
                cmb.z1(sn2Var, cmb.u0(i3), false);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // vlb
    public final void updateColors() {
        switch (this.a) {
            case 0:
                try {
                    sn2 sn2Var = (sn2) this.c;
                    if (sn2Var != null && ((ui5) this.b) != null) {
                        cmb.z1(sn2Var, cmb.w0(null, cmb.Gl, false), false);
                        invalidate();
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            default:
                ((Paint) this.b).setColor(cmb.w0(null, cmb.g5, false));
                invalidate();
                break;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public /* synthetic */ kw(Context context) {
        super(context);
    }
}
