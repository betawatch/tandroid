// default package

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class am1 {
    public float a;
    public float b;
    public int c;
    public StaticLayout d;
    public TextPaint e;
    public final ArrayList f = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public cn h;
    public final /* synthetic */ cm1 i;

    public am1(cm1 cm1Var) {
        this.i = cm1Var;
    }

    public final void a(int i, TextPaint textPaint, CharSequence charSequence) {
        this.e = textPaint;
        this.c = i;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.d = staticLayout;
        cm1 cm1Var = this.i;
        k47 k47Var = cm1Var.Q0;
        ArrayList arrayList = this.f;
        if (k47Var == null || !k47Var.N0) {
            rna.b(cm1Var, staticLayout, -1, i, null, arrayList);
        } else {
            arrayList.clear();
        }
        this.h = gn.update(0, (View) cm1Var, false, this.h, this.d);
    }
}
