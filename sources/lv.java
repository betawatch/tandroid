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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lv extends View implements snb {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Drawable c;

    public lv(Activity activity, xi5 xi5Var) {
        super(activity);
        this.b = xi5Var;
        zm2 zm2Var = new zm2(new ColorDrawable(aob.w0(null, aob.Hl, false)), aob.V0(activity, R.drawable.greydivider_bottom, -16777216));
        this.c = zm2Var;
        zm2Var.x = true;
        setBackgroundDrawable(zm2Var);
        setImportantForAccessibility(2);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                hashSet.add(Integer.valueOf(aob.Hl));
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
                bl8.d().f(-hl.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - hl.L(2.0f), bl8.d().e());
                float L = hl.L(18.0f) / 2.0f;
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
                setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(12.0f));
                zm2 zm2Var = (zm2) this.c;
                xi5 xi5Var = (xi5) this.b;
                int i3 = aob.Hl;
                ((o) xi5Var).getClass();
                aob.z1(zm2Var, aob.u0(i3), false);
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // snb
    public final void updateColors() {
        switch (this.a) {
            case 0:
                try {
                    zm2 zm2Var = (zm2) this.c;
                    if (zm2Var != null && ((xi5) this.b) != null) {
                        aob.z1(zm2Var, aob.w0(null, aob.Hl, false), false);
                        invalidate();
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            default:
                ((Paint) this.b).setColor(aob.w0(null, aob.h5, false));
                invalidate();
                break;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public /* synthetic */ lv(Context context) {
        super(context);
    }
}
