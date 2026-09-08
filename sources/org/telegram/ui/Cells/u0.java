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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class u0 {
    public TextPaint a;
    public float b;
    public final ArrayList c;
    public int d;
    public float e;
    public Object f;
    public final Object g;
    public Object h;
    public final Object i;

    public u0() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = 1.0f;
        this.f = new HashMap();
        this.g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.i = paint;
        this.c = new ArrayList();
        this.e = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.d = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.b = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.b = 0.75f;
        } else {
            this.b = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.b * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        w0 w0Var;
        this.a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f = staticLayout;
        w0 w0Var2 = (w0) this.i;
        MessageObject messageObject = w0Var2.H0;
        ArrayList arrayList = this.c;
        if (messageObject == null || !messageObject.isSpoilersRevealed) {
            w0Var = w0Var2;
            wh.h.b(w0Var, staticLayout, -1, i10, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            w0Var = w0Var2;
        }
        this.h = org.telegram.ui.Components.z5.update(0, (View) w0Var, false, (org.telegram.ui.Components.v5) this.h, (StaticLayout) this.f);
    }

    public u0(w0 w0Var) {
        this.i = w0Var;
        this.c = new ArrayList();
        this.g = new AtomicReference();
    }
}
