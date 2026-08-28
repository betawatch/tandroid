package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mx0 extends FrameLayout {
    public float A;
    public float B;
    public ValueAnimator C;
    public ValueAnimator D;
    public com.google.firebase.messaging.l E;
    public float F;
    public boolean G;
    public org.telegram.ui.Components.voip.h H;
    public Paint a;
    public Paint b;
    public Paint c;
    public Paint d;
    public boolean e;
    public fh.l2 f;
    public TextView h;
    public TextView n;
    public TextView r;
    public TextView s;
    public TextView v;
    public View w;
    public int x;
    public org.telegram.ui.Cells.ba y;

    @Override // android.view.View
    public final void invalidate() {
        TextView textView = this.s;
        TextView textView2 = this.r;
        TextView textView3 = this.n;
        TextView textView4 = this.h;
        super.invalidate();
        this.f.invalidate();
        int i9 = this.x;
        int i10 = org.telegram.ui.ActionBar.f6.Vi;
        if (i9 != org.telegram.ui.ActionBar.f6.w0(null, i10, false)) {
            this.x = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), this.x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), this.x), (Drawable) null, (Drawable) null, (Drawable) null);
            textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
            textView.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(this.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
            textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        }
        this.y.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        this.w.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d7, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.firebase.messaging.l lVar = this.E;
        if (lVar != null) {
            lVar.a = true;
            AnimatorSet animatorSet = (AnimatorSet) lVar.c;
            if (animatorSet.isRunning()) {
                return;
            }
            animatorSet.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.firebase.messaging.l lVar = this.E;
        if (lVar != null) {
            lVar.a = false;
            ((AnimatorSet) lVar.c).cancel();
        }
    }
}
