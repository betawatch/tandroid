package cg;

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
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class p {
    public float a;
    public float b;
    public int c;
    public TextPaint d;
    public final ArrayList e;
    public Object f;
    public final Object g;
    public Object h;
    public final Object i;

    public p() {
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.a = 1.0f;
        this.f = new HashMap();
        this.g = new RectF();
        this.h = new RectF();
        Paint paint = new Paint();
        this.i = paint;
        this.e = new ArrayList();
        this.b = 1000.0f / AndroidUtilities.screenRefreshRate;
        this.c = 25;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(-1);
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.a = 0.25f;
        } else if (devicePerformanceClass != 1) {
            this.a = 0.75f;
        } else {
            this.a = 0.5f;
        }
        textPaint.setTextSize(AndroidUtilities.dp(this.a * 24.0f));
        paint.setColor(-1);
    }

    public void a(CharSequence charSequence, TextPaint textPaint, int i10) {
        org.telegram.ui.Cells.v0 v0Var;
        this.d = textPaint;
        this.c = i10;
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i10, Layout.Alignment.ALIGN_CENTER, 1.1f, 0.0f, false);
        this.f = staticLayout;
        org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.i;
        MessageObject messageObject = v0Var2.D0;
        ArrayList arrayList = this.e;
        if (messageObject == null || !messageObject.isSpoilersRevealed) {
            v0Var = v0Var2;
            gh.k.b(v0Var, staticLayout, -1, i10, null, arrayList);
        } else {
            if (arrayList != null) {
                arrayList.clear();
            }
            v0Var = v0Var2;
        }
        this.h = y5.update(0, (View) v0Var, false, (u5) this.h, (StaticLayout) this.f);
    }

    public p(org.telegram.ui.Cells.v0 v0Var) {
        this.i = v0Var;
        this.e = new ArrayList();
        this.g = new AtomicReference();
    }
}
