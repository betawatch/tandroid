package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o0 extends TextView {
    public final RectF a;
    public final n1 b;

    public o0(Activity activity, n1 n1Var) {
        super(activity);
        this.a = new RectF();
        this.b = n1Var;
        n1Var.a(this);
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
        n1 n1Var = this.b;
        n1Var.d(x10, y10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), n1Var.b());
        super.onDraw(canvas);
    }
}
