// default package

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bl1 {
    public float a;
    public float b;
    public int c;
    public StaticLayout d;
    public TextPaint e;
    public final ArrayList f = new ArrayList();
    public final AtomicReference g = new AtomicReference();
    public dm h;
    public final /* synthetic */ dl1 i;

    public bl1(dl1 dl1Var) {
        this.i = dl1Var;
    }

    public final void a(int i, TextPaint textPaint, CharSequence charSequence) {
        this.e = textPaint;
        this.c = i;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.d = staticLayout;
        dl1 dl1Var = this.i;
        r47 r47Var = dl1Var.Q0;
        ArrayList arrayList = this.f;
        if (r47Var == null || !r47Var.N0) {
            npa.b(dl1Var, staticLayout, -1, i, null, arrayList);
        } else {
            arrayList.clear();
        }
        this.h = hm.update(0, (View) dl1Var, false, this.h, this.d);
    }
}
