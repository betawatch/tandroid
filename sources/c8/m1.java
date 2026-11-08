package c8;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class m1 {
    public static StaticLayout a;

    public static li.a0 a(int i7, int i10, int i11, int i12) {
        Rect rect = new Rect(i7, i10, i11, i12);
        if (a == null) {
            a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new li.a0(a, rect);
    }
}
