package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final h6 a;
    public final Paint b;
    public a c;

    public s0(Context context, h6 h6Var) {
        super(context);
        this.b = new Paint();
        this.a = h6Var;
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.wl));
    }

    public a getRow() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, org.telegram.messenger.g0.L(6.0f), getMeasuredWidth(), org.telegram.messenger.g0.L(6.0f) + 1, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(6.0f) + 1);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        this.b.setColor(m6.w0(m6.wl, this.a));
    }
}
