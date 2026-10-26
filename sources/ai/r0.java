package ai;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import j$.util.function.Consumer$-CC;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Consumer {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ r b;

    public /* synthetic */ r0(z0 z0Var, r rVar) {
        this.a = z0Var;
        this.b = rVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        d dVar;
        float f7;
        float f10;
        float[] fArr;
        r0 r0Var = this;
        Canvas canvas = (Canvas) obj;
        z0 z0Var = r0Var.a;
        d dVar2 = z0Var.x;
        RectF rectF = dVar2.M;
        WeakHashMap weakHashMap = dVar2.N;
        Paint paint = dVar2.c;
        long b10 = d.b();
        int i10 = 0;
        while (true) {
            r rVar = r0Var.b;
            if (i10 >= rVar.getChildCount()) {
                break;
            }
            View childAt = rVar.getChildAt(i10);
            if ((childAt instanceof q) && childAt.getVisibility() == 0) {
                if (weakHashMap.containsKey(childAt)) {
                    f7 = 10.0f;
                    f10 = 2.5f;
                } else {
                    weakHashMap.put(childAt, Boolean.TRUE);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setCornerRadius(AndroidUtilities.dp(10.0f));
                    f10 = 2.5f;
                    f7 = 10.0f;
                    childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) AndroidUtilities.dpf2(2.5f))));
                }
                String key = ((q) childAt).getKey();
                if (key != null && (fArr = (float[]) dVar2.n.get(key)) != null) {
                    float c10 = d.c(fArr, b10);
                    if (c10 > 0.004f) {
                        float translationX = childAt.getTranslationX() + childAt.getLeft();
                        float translationY = childAt.getTranslationY() + childAt.getTop();
                        float width = childAt.getWidth();
                        float height = childAt.getHeight();
                        float dpf2 = (int) AndroidUtilities.dpf2(f10);
                        dVar = dVar2;
                        rectF.set(translationX + dpf2, translationY + dpf2, (translationX + width) - dpf2, (translationY + height) - dpf2);
                        if (!childAt.isPressed()) {
                            paint.setColor(788529151);
                            paint.setAlpha((int) (Color.alpha(788529151) * c10));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
                        }
                        i10++;
                        r0Var = this;
                        dVar2 = dVar;
                    }
                }
            }
            dVar = dVar2;
            i10++;
            r0Var = this;
            dVar2 = dVar;
        }
        if (z0Var.d.I.isEmpty()) {
            return;
        }
        z0Var.x.invalidate();
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
