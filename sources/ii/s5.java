package ii;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class s5 extends FrameLayout {
    public final i1 a;
    public TL_iv.pageTableCell b;

    public s5(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        i1 i1Var = new i1(context, d6Var);
        this.a = i1Var;
        i1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        i1Var.setAllowNewlines(true);
        setCompact(false);
        addView(i1Var, w7.y5.e(-1, -2, 51));
    }

    public final void a() {
        i1 i1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) i1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i10 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i10 | 16 : pagetablecell.valign_bottom ? i10 | 80 : i10 | 48;
        i1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        i1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        i1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((ii.g6.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = i6.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            i1 i1Var = this.a;
            i1Var.setAutoBold(z10);
            i1Var.setTextSilently(Emoji.replaceEmoji(h, i1Var.getPaint().getFontMetricsInt(), false));
            i1Var.invalidateEffects();
        }
        z10 = false;
        i1 i1Var2 = this.a;
        i1Var2.setAutoBold(z10);
        i1Var2.setTextSilently(Emoji.replaceEmoji(h, i1Var2.getPaint().getFontMetricsInt(), false));
        i1Var2.invalidateEffects();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        i1 i1Var = this.a;
        if (i1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            boolean z10 = x10 >= ((float) i1Var.getLeft()) && x10 < ((float) i1Var.getRight());
            boolean z11 = y3 < ((float) i1Var.getTop()) || y3 >= ((float) i1Var.getBottom());
            if (z10 && z11 && i1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y3 - i1Var.getTop(), i1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - i1Var.getLeft(), max);
                boolean onTouchEvent = i1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        i1 i1Var = this.a;
        if (z10) {
            i1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            i1Var.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            i1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            i1Var.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
