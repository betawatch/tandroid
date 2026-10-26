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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t0 {
    public TextPaint a;
    public float b;
    public final ArrayList c;
    public int d;
    public float e;
    public Object f;
    public final Object g;
    public Object h;
    public final Object i;

    public t0() {
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
        v0 v0Var;
        this.a = textPaint;
        this.d = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f = staticLayout;
        v0 v0Var2 = (v0) this.i;
        MessageObject messageObject = v0Var2.P0;
        ArrayList arrayList = this.c;
        if (messageObject == null || !messageObject.isSpoilersRevealed) {
            v0Var = v0Var2;
            xh.g.b(v0Var, staticLayout, -1, i10, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        }
        this.h = org.telegram.ui.Components.c6.update(0, (View) v0Var, false, (org.telegram.ui.Components.y5) this.h, (StaticLayout) this.f);
    }

    public t0(v0 v0Var) {
        this.i = v0Var;
        this.c = new ArrayList();
        this.g = new AtomicReference();
    }
}
