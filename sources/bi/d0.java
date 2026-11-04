package bi;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.ProfilingResult;
import android.util.Log;
import android.view.View;
import j$.util.function.Consumer$-CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        m mVar;
        float f10;
        float f11;
        float[] fArr;
        switch (this.a) {
            case 0:
                j0 j0Var = (j0) this.b;
                m mVar2 = (m) this.c;
                Canvas canvas = (Canvas) obj;
                c cVar = j0Var.y;
                RectF rectF = cVar.N;
                WeakHashMap weakHashMap = cVar.O;
                Paint paint = cVar.c;
                long b10 = c.b();
                int i3 = 0;
                while (i3 < mVar2.getChildCount()) {
                    View childAt = mVar2.getChildAt(i3);
                    if ((childAt instanceof l) && childAt.getVisibility() == 0) {
                        if (weakHashMap.containsKey(childAt)) {
                            f10 = 10.0f;
                            f11 = 2.5f;
                        } else {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            f11 = 2.5f;
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(10.0f));
                            f10 = 10.0f;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) org.telegram.messenger.g0.N(2.5f))));
                        }
                        String key = ((l) childAt).getKey();
                        if (key != null && (fArr = (float[]) cVar.n.get(key)) != null) {
                            float c2 = c.c(fArr, b10);
                            if (c2 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                float width = childAt.getWidth();
                                float height = childAt.getHeight();
                                float N = (int) org.telegram.messenger.g0.N(f11);
                                mVar = mVar2;
                                rectF.set(translationX + N, translationY + N, (translationX + width) - N, (translationY + height) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (Color.alpha(788529151) * c2));
                                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
                                }
                                i3++;
                                mVar2 = mVar;
                            }
                        }
                    }
                    mVar = mVar2;
                    i3++;
                    mVar2 = mVar;
                }
                if (j0Var.d.J.isEmpty()) {
                    return;
                }
                j0Var.y.invalidate();
                return;
            case 1:
                z9.m.a((z9.m) this.b, (String) this.c, (ProfilingResult) obj);
                return;
            default:
                z9.x xVar = (z9.x) this.b;
                String str = (String) this.c;
                fa.d dVar = xVar.b;
                int intValue = ((Integer) obj).intValue();
                if (((byte) 1) != 1) {
                    throw new IllegalStateException("Missing required properties: trigger");
                }
                ca.k0 k0Var = new ca.k0(new ca.l0(intValue));
                try {
                    fa.d.g.getClass();
                    fa.d.g(dVar.b.b(str, "profiling-manager-info"), da.a.a.d2(k0Var));
                    return;
                } catch (IOException e10) {
                    Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e10);
                    return;
                }
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i3 = this.a;
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
