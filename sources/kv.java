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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kv extends View implements tjb {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Drawable c;

    public kv(Activity activity, vg5 vg5Var) {
        super(activity);
        this.b = vg5Var;
        fm2 fm2Var = new fm2(new ColorDrawable(bkb.w0(null, bkb.Gl, false)), bkb.V0(activity, R.drawable.greydivider_bottom, -16777216));
        this.c = fm2Var;
        fm2Var.x = true;
        setBackgroundDrawable(fm2Var);
        setImportantForAccessibility(2);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(bkb.Gl));
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
                nh8.d().f(-gl.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - gl.L(2.0f), nh8.d().e());
                float L = gl.L(18.0f) / 2.0f;
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
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(12.0f));
                fm2 fm2Var = (fm2) this.c;
                vg5 vg5Var = (vg5) this.b;
                int i3 = bkb.Gl;
                ((o) vg5Var).getClass();
                bkb.z1(fm2Var, bkb.u0(i3), false);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // tjb
    public final void updateColors() {
        switch (this.a) {
            case 0:
                try {
                    fm2 fm2Var = (fm2) this.c;
                    if (fm2Var != null && ((vg5) this.b) != null) {
                        bkb.z1(fm2Var, bkb.w0(null, bkb.Gl, false), false);
                        invalidate();
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            default:
                ((Paint) this.b).setColor(bkb.w0(null, bkb.g5, false));
                invalidate();
                break;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public /* synthetic */ kv(Context context) {
        super(context);
    }
}
