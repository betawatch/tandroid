package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.R;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u5 extends FrameLayout {
    public final org.telegram.ui.Components.t9 a;
    public final TextView b;
    public final TextView c;
    public final View d;
    public final /* synthetic */ w5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(w5 w5Var, Context context) {
        super(context);
        this.e = w5Var;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.a = t9Var;
        addView(t9Var, i7.f6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, i7.f6.e(-1, 60, 83));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView i10 = th.i(linearLayout, textView, i7.f6.m(1.0f, 0, -1, 8, 0, 5), context);
        this.c = i10;
        i10.setTextSize(1, 13.0f);
        i10.setTextColor(-1);
        i10.setSingleLine(true);
        i10.setEllipsize(truncateAt);
        i10.setMaxLines(1);
        i10.setGravity(80);
        linearLayout.addView(i10, i7.f6.k(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
        addView(view, i7.f6.c(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.t9 t9Var = this.a;
        if (t9Var.getImageReceiver().hasNotThumb() && t9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        w5 w5Var = this.e;
        w5Var.e.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.X9, false));
        canvas.drawRect(0.0f, 0.0f, t9Var.getMeasuredWidth(), t9Var.getMeasuredHeight(), w5Var.e);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
