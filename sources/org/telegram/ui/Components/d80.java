package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d80 extends View implements org.telegram.ui.ActionBar.a6 {
    public final TextPaint a;
    public final Paint b;
    public final String c;
    public final Rect d;
    public View e;

    public d80(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        this.b = new Paint(1);
        this.d = new Rect();
        this.c = org.telegram.messenger.id.M0(2131748728, null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        updateColors();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.e;
        Rect rect = this.d;
        float width = view != null ? ((((getWidth() - rect.width()) - org.telegram.messenger.g0.L(8.0f)) - this.e.getPaddingLeft()) - this.e.getPaddingRight()) / 2.0f : org.telegram.messenger.g0.L(64.0f);
        Paint paint = this.b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) - width, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + width, getHeight() / 2.0f, paint);
        canvas.drawText(this.c, (getWidth() - rect.width()) / 2.0f, (rect.height() + getHeight()) / 2.0f, this.a);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        View view = this.e;
        if (view != null) {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), TLObject.FLAG_30);
        }
        super.onMeasure(i7, i10);
        String str = this.c;
        this.a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.e = view;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        this.a.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false));
        this.b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
