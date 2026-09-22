package ai;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class hb {
    public final c6 a;
    public final org.telegram.ui.Components.c6 b;
    public final TextPaint c;
    public final StaticLayout d;
    public final float e;
    public final float f;
    public float g;
    public boolean h;
    public int i;

    public hb(f6 f6Var, c6 c6Var) {
        this.a = c6Var;
        this.b = new org.telegram.ui.Components.c6(f6Var, 0L, 360L, qr.h);
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.StorySeekHelp), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
