package c8;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class fa {
    public static StaticLayout a;

    public static oi.y a(int i7, int i10, int i11, int i12) {
        Rect rect = new Rect(i7, i10, i11, i12);
        if (a == null) {
            a = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return new oi.y(a, rect);
    }
}
