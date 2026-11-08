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
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        int o4 = iz.o();
        if (o4 == 0) {
            this.b = 0.25f;
        } else if (o4 != 1) {
            this.b = 0.75f;
        } else {
            this.b = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.g0.L(this.b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i7) {
        t0 t0Var;
        this.a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f = staticLayout;
        t0 t0Var2 = (t0) this.i;
        ij ijVar = t0Var2.P0;
        ArrayList arrayList = this.c;
        if (ijVar == null || !ijVar.L0) {
            t0Var = t0Var2;
            xh.f.b(t0Var, staticLayout, -1, i7, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            t0Var = t0Var2;
        }
        this.h = org.telegram.ui.Components.r5.update(0, (View) t0Var, false, (org.telegram.ui.Components.n5) this.h, (StaticLayout) this.f);
    }

    public r0(t0 t0Var) {
        this.i = t0Var;
        this.c = new ArrayList();
        this.g = new AtomicReference();
    }
}
