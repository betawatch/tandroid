package aa;

import ai.s0;
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
import da.k0;
import da.l0;
import j$.util.function.Consumer$-CC;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        ai.r rVar;
        ai.d dVar;
        float f10;
        float f11;
        float[] fArr;
        switch (this.a) {
            case 0:
                q.a((q) this.c, (String) this.b, (ProfilingResult) obj);
                return;
            case 1:
                f0 f0Var = (f0) this.c;
                String str = (String) this.b;
                ga.b bVar = f0Var.b;
                int intValue = ((Integer) obj).intValue();
                if (((byte) 1) != 1) {
                    throw new IllegalStateException("Missing required properties: trigger");
                }
                k0 k0Var = new k0(new l0(intValue));
                try {
                    ga.b.g.getClass();
                    ga.b.g(bVar.b.b(str, "profiling-manager-info"), ea.a.a.u(k0Var));
                    return;
                } catch (IOException e10) {
                    Log.w("FirebaseCrashlytics", "Could not persist Profiling Manager info " + str, e10);
                    return;
                }
            default:
                s0 s0Var = (s0) this.c;
                ai.r rVar2 = (ai.r) this.b;
                Canvas canvas = (Canvas) obj;
                ai.d dVar2 = s0Var.y;
                RectF rectF = dVar2.M;
                WeakHashMap weakHashMap = dVar2.N;
                Paint paint = dVar2.c;
                long b10 = ai.d.b();
                int i7 = 0;
                while (i7 < rVar2.getChildCount()) {
                    View childAt = rVar2.getChildAt(i7);
                    if ((childAt instanceof ai.q) && childAt.getVisibility() == 0) {
                        if (weakHashMap.containsKey(childAt)) {
                            rVar = rVar2;
                            f10 = 10.0f;
                            f11 = 2.5f;
                        } else {
                            weakHashMap.put(childAt, Boolean.TRUE);
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            f11 = 2.5f;
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(org.telegram.messenger.g0.L(10.0f));
                            f10 = 10.0f;
                            rVar = rVar2;
                            childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) org.telegram.messenger.g0.N(2.5f))));
                        }
                        String key = ((ai.q) childAt).getKey();
                        if (key != null && (fArr = (float[]) dVar2.n.get(key)) != null) {
                            float c10 = ai.d.c(fArr, b10);
                            if (c10 > 0.004f) {
                                float translationX = childAt.getTranslationX() + childAt.getLeft();
                                float translationY = childAt.getTranslationY() + childAt.getTop();
                                float width = childAt.getWidth();
                                float height = childAt.getHeight();
                                float N = (int) org.telegram.messenger.g0.N(f11);
                                dVar = dVar2;
                                rectF.set(translationX + N, translationY + N, (translationX + width) - N, (translationY + height) - N);
                                if (!childAt.isPressed()) {
                                    paint.setColor(788529151);
                                    paint.setAlpha((int) (Color.alpha(788529151) * c10));
                                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(f10), paint);
                                }
                                i7++;
                                rVar2 = rVar;
                                dVar2 = dVar;
                            }
                        }
                    } else {
                        rVar = rVar2;
                    }
                    dVar = dVar2;
                    i7++;
                    rVar2 = rVar;
                    dVar2 = dVar;
                }
                if (s0Var.d.I.isEmpty()) {
                    return;
                }
                s0Var.y.invalidate();
                return;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i7 = this.a;
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
