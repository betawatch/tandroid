package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class p0 extends TextView {
    public final RectF a;
    public final o1 b;

    public p0(Activity activity, o1 o1Var) {
        super(activity);
        this.a = new RectF();
        this.b = o1Var;
        o1Var.a(this);
        setText(LocaleController.getString(R.string.VoipHideEmoji));
        setContentDescription(LocaleController.getString(R.string.VoipHideEmoji));
        setTextColor(-1);
        setTypeface(AndroidUtilities.bold());
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        float x10 = ((View) getParent()).getX() + getX();
        float y10 = ((View) getParent()).getY() + getY();
        o1 o1Var = this.b;
        o1Var.d(x10, y10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), o1Var.b());
        super.onDraw(canvas);
    }
}
