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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class a6 extends FrameLayout {
    public final org.telegram.ui.Components.y9 a;
    public final TextView b;
    public final TextView c;
    public final View d;
    public final /* synthetic */ c6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(c6 c6Var, Context context) {
        super(context);
        this.e = c6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        addView(y9Var, gb1.g(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(R.drawable.album_shadow);
        addView(linearLayout, gb1.i(-1, 60, 83));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(80);
        TextView e = vh.e(linearLayout, textView, gb1.q(1.0f, 0, -1, 8, 0, 5), context);
        this.c = e;
        e.setTextSize(1, 13.0f);
        e.setTextColor(-1);
        e.setSingleLine(true);
        e.setEllipsize(truncateAt);
        e.setMaxLines(1);
        e.setGravity(80);
        linearLayout.addView(e, gb1.o(4.0f, 0.0f, 7.0f, 5.0f, -2, -1));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
        addView(view, gb1.g(-1.0f, -1));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        org.telegram.ui.Components.y9 y9Var = this.a;
        if (y9Var.getImageReceiver().hasNotThumb() && y9Var.getImageReceiver().getCurrentAlpha() == 1.0f) {
            return;
        }
        c6 c6Var = this.e;
        c6Var.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.X9, false));
        canvas.drawRect(0.0f, 0.0f, y9Var.getMeasuredWidth(), y9Var.getMeasuredHeight(), c6Var.e);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }
}
