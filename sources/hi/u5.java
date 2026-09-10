package hi;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class u5 extends FrameLayout {
    public final k1 a;
    public TL_iv.pageTableCell b;

    public u5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        k1 k1Var = new k1(context, f6Var);
        this.a = k1Var;
        k1Var.setTextSize(1, Math.max(8, SharedConfig.fontSize - 2));
        k1Var.setAllowNewlines(true);
        setCompact(false);
        addView(k1Var, w7.a6.e(-1, -2, 51));
    }

    public final void a() {
        k1 k1Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) k1Var.getLayoutParams();
        TL_iv.pageTableCell pagetablecell = this.b;
        int i10 = pagetablecell.align_right ? 5 : pagetablecell.align_center ? 1 : 3;
        layoutParams.gravity = pagetablecell.valign_middle ? i10 | 16 : pagetablecell.valign_bottom ? i10 | 80 : i10 | 48;
        k1Var.setLayoutParams(layoutParams);
        TL_iv.pageTableCell pagetablecell2 = this.b;
        k1Var.setGravity(pagetablecell2.align_right ? 53 : pagetablecell2.align_center ? 49 : 51);
        k1Var.setTypeface(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if ((hi.i6.q(0, r0.length(), r0) & 1) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_iv.pageTableCell pagetablecell) {
        boolean z10;
        this.b = pagetablecell;
        a();
        CharSequence h = l6.h(pagetablecell);
        if (pagetablecell.header) {
            z10 = true;
            if (h.length() != 0) {
            }
            k1 k1Var = this.a;
            k1Var.setAutoBold(z10);
            k1Var.setTextSilently(Emoji.replaceEmoji(h, k1Var.getPaint().getFontMetricsInt(), false));
            k1Var.invalidateEffects();
        }
        z10 = false;
        k1 k1Var2 = this.a;
        k1Var2.setAutoBold(z10);
        k1Var2.setTextSilently(Emoji.replaceEmoji(h, k1Var2.getPaint().getFontMetricsInt(), false));
        k1Var2.invalidateEffects();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        k1 k1Var = this.a;
        if (k1Var.getVisibility() == 0 && motionEvent.getActionMasked() != 3) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            boolean z10 = x10 >= ((float) k1Var.getLeft()) && x10 < ((float) k1Var.getRight());
            boolean z11 = y3 < ((float) k1Var.getTop()) || y3 >= ((float) k1Var.getBottom());
            if (z10 && z11 && k1Var.getHeight() > 0) {
                float max = Math.max(0.0f, Math.min(y3 - k1Var.getTop(), k1Var.getHeight() - 1));
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(x10 - k1Var.getLeft(), max);
                boolean onTouchEvent = k1Var.onTouchEvent(obtain);
                obtain.recycle();
                return onTouchEvent;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setCompact(boolean z10) {
        k1 k1Var = this.a;
        if (z10) {
            k1Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f));
            k1Var.setMinHeight(AndroidUtilities.dp(18.0f));
        } else {
            k1Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(9.0f));
            k1Var.setMinHeight(AndroidUtilities.dp(36.0f));
        }
    }

    public void setLocked(boolean z10) {
        this.a.setLocked(z10);
    }
}
