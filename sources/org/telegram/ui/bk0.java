package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bk0 extends View implements org.telegram.ui.ActionBar.z5 {
    public Paint a;
    public Paint b;
    public float c;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.a);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            this.a.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xi, false));
            this.b.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yi, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
