package li;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class s5 extends FrameLayout {
    public final g1 a;
    public TL_iv.pageTableCell b;

    public s5(Context context, u6 u6Var) {
        super(context);
        g1 g1Var = new g1(context, u6Var);
        this.a = g1Var;
        g1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        g1Var.setAllowNewlines(true);
        setCompact(false);
        addView(g1Var, kb1.i(-1, -2, 51));
    }

    public final void a() {
        g1 g1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i10 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i10 | 16 : pagetablecell.valign_bottom ? i10 | 80 : i10 | 48;
        g1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        g1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        g1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((li.f6.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = h6.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            g1 g1Var = this.a;
            g1Var.setAutoBold(z10);
            g1Var.setTextSilently(Emoji.replaceEmoji(h, g1Var.getPaint().getFontMetricsInt(), false));
            g1Var.invalidateEffects();
        }
        z10 = false;
        g1 g1Var2 = this.a;
        g1Var2.setAutoBold(z10);
        g1Var2.setTextSilently(Emoji.replaceEmoji(h, g1Var2.getPaint().getFontMetricsInt(), false));
        g1Var2.invalidateEffects();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        g1 g1Var = this.a;
        if (g1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x9 = motionEvent.getX();
            float y3 = motionEvent.getY();
            boolean z10 = x9 >= ((float) g1Var.getLeft()) && x9 < ((float) g1Var.getRight());
            boolean z11 = y3 < ((float) g1Var.getTop()) || y3 >= ((float) g1Var.getBottom());
            if (z10 && z11 && g1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y3 - g1Var.getTop(), g1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x9 - g1Var.getLeft(), max);
                boolean onTouchEvent = g1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        g1 g1Var = this.a;
        if (z10) {
            g1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            g1Var.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            g1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            g1Var.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
