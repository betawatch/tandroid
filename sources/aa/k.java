package aa;

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
import ci.i0;
import da.k0;
import da.l0;
import j$.util.function.Consumer$-CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        ci.m mVar;
        ci.c cVar;
        float f10;
        float f11;
        float[] fArr;
        switch (this.a) {
            case 0:
                p.a((p) this.c, (String) this.b, (ProfilingResult) obj);
                return;
            case 1:
                e0 e0Var = (e0) this.c;
                String str = (String) this.b;
                ga.b bVar = e0Var.b;
                int intValue = ((Integer) obj).intValue();
                if (((byte) 1) != 1) {
                    throw new IllegalStateException("Missing required properties: trigger");
                }
                k0 k0Var = new k0(new l0(intValue));
                try {
                    ga.b.g.getClass();
                    ga.b.g(bVar.b.b(str, "profiling-manager-info"), ea.a.a.o(k0Var));
                    return;
                } catch (IOException e10) {
                    Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e10);
                    return;
                }
            default:
                i0 i0Var = (i0) this.c;
                ci.m mVar2 = (ci.m) this.b;
                Canvas canvas = (Canvas) obj;
                ci.c cVar2 = i0Var.y;
                RectF rectF = cVar2.N;
                WeakHashMap weakHashMap = cVar2.O;
                Paint paint = cVar2.c;
                long b10 = ci.c.b();
                int i7 = 0;
                while (i7 < mVar2.getChildCount()) {
                    View childAt = mVar2.getChildAt(i7);
                    if ((childAt instanceof ci.l) && childAt.getVisibility() == 0) {
                        if (weakHashMap.containsKey(childAt)) {
                            mVar = mVar2;
                            f10 = 10.0f;
                            f11 = 2.5f;
                        } else {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            f11 = 2.5f;
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(g0.L(10.0f));
                            f10 = 10.0f;
                            mVar = mVar2;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) g0.N(2.5f))));
                        }
                        String key = ((ci.l) childAt).getKey();
                        if (key != null && (fArr = (float[]) cVar2.n.get(key)) != null) {
                            float c10 = ci.c.c(fArr, b10);
                            if (c10 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                float width = childAt.getWidth();
                                float height = childAt.getHeight();
                                float N = (int) g0.N(f11);
                                cVar = cVar2;
                                rectF.set(translationX + N, translationY + N, (translationX + width) - N, (translationY + height) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (Color.alpha(788529151) * c10));
                                    canvas.drawRoundRect(rectF, g0.L(f10), g0.L(f10), paint);
                                }
                                i7++;
                                mVar2 = mVar;
                                cVar2 = cVar;
                            }
                        }
                    } else {
                        mVar = mVar2;
                    }
                    cVar = cVar2;
                    i7++;
                    mVar2 = mVar;
                    cVar2 = cVar;
                }
                if (i0Var.d.J.isEmpty()) {
                    return;
                }
                i0Var.y.invalidate();
                return;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i7 = this.a;
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
