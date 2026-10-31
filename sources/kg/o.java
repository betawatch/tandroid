package kg;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.o5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o {
    public float a;
    public float b;
    public int c;
    public TextPaint d;
    public final ArrayList e;
    public Object f;
    public final Object g;
    public Object h;
    public final Object i;

    public o() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.a = 1.0f;
        this.f = new HashMap();
        this.g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.i = paint;
        this.e = new ArrayList();
        this.b = 1000.0f / org.telegram.messenger.i0.r;
        this.c = 25;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(-1);
        int o10 = tz.o();
        if (o10 == 0) {
            this.a = 0.25f;
        } else if (o10 != 1) {
            this.a = 0.75f;
        } else {
            this.a = 0.5f;
        }
        textPaint.setTextSize(org.telegram.messenger.i0.L(this.a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.s0 s0Var;
        this.d = textPaint;
        this.c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f = staticLayout;
        org.telegram.ui.Cells.s0 s0Var2 = (org.telegram.ui.Cells.s0) this.i;
        jj jjVar = s0Var2.P0;
        ArrayList arrayList = this.e;
        if (jjVar == null || !jjVar.L0) {
            s0Var = s0Var2;
            nh.i.b(s0Var, staticLayout, -1, i10, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            s0Var = s0Var2;
        }
        this.h = o5.update(0, (View) s0Var, false, (k5) this.h, (StaticLayout) this.f);
    }

    public o(org.telegram.ui.Cells.s0 s0Var) {
        this.i = s0Var;
        this.e = new ArrayList();
        this.g = new AtomicReference();
    }
}
