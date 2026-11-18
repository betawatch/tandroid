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
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s0 {
    public TextPaint a;
    public float b;
    public final ArrayList c;
    public int d;
    public float e;
    public Object f;
    public final Object g;
    public Object h;
    public final Object i;

    public s0() {
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
        int o4 = bz.o();
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
        u0 u0Var;
        this.a = textPaint;
        this.d = i7;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i7, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f = staticLayout;
        u0 u0Var2 = (u0) this.i;
        fj fjVar = u0Var2.Q0;
        ArrayList arrayList = this.c;
        if (fjVar == null || !fjVar.N0) {
            u0Var = u0Var2;
            xh.f.b(u0Var, staticLayout, -1, i7, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            u0Var = u0Var2;
        }
        this.h = org.telegram.ui.Components.x5.update(0, (View) u0Var, false, (org.telegram.ui.Components.t5) this.h, (StaticLayout) this.f);
    }

    public s0(u0 u0Var) {
        this.i = u0Var;
        this.c = new ArrayList();
        this.g = new AtomicReference();
    }
}
