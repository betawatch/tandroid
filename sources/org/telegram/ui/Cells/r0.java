package org.telegram.ui.Cells;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.az;
import org.telegram.messenger.zi;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r0 {
    public TextPaint a;
    public float b;
    public final ArrayList c;
    public int d;
    public float e;
    public Object f;
    public final Object g;
    public Object h;
    public final Object i;

    public r0() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = 1.0f;
        this.f = new HashMap();
        this.g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.i = paint;
        this.c = new ArrayList();
        this.e = 1000.0f / org.telegram.messenger.g0.r;
        this.d = 25;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(-1);
        int o10 = az.o();
        if (o10 == 0) {
            this.b = 0.25f;
        } else if (o10 != 1) {
            this.b = 0.75f;
        } else {
            this.b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i3) {
        t0 t0Var;
        this.a = textPaint;
        this.d = i3;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i3, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f = staticLayout;
        t0 t0Var2 = (t0) this.i;
        zi ziVar = t0Var2.Q0;
        ArrayList arrayList = this.c;
        if (ziVar == null || !ziVar.L0) {
            t0Var = t0Var2;
            yh.f.b(t0Var, staticLayout, -1, i3, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            t0Var = t0Var2;
        }
        this.h = org.telegram.ui.Components.p5.update(0, (View) t0Var, false, (org.telegram.ui.Components.l5) this.h, (StaticLayout) this.f);
    }

    public r0(t0 t0Var) {
        this.i = t0Var;
        this.c = new ArrayList();
        this.g = new AtomicReference();
    }
}
