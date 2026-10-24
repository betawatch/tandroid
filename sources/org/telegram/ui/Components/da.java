package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class da extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public TextView a;
    public TextView b;
    public ah.x c;
    public ah.x d;
    public ck0 e;
    public ScrollView f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate n;
    public String r;
    public int s;
    public int v;
    public GradientDrawable w;
    public GradientDrawable x;
    public boolean y;

    public final void a(boolean z10) {
        ah.x xVar = this.d;
        TextView textView = this.b;
        ah.x xVar2 = this.c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        int i10 = 1;
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        if (z10) {
            xVar2.setVisibility(0);
            xVar.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(xVar2, (Property<ah.x, Float>) property3, 1.0f), ObjectAnimator.ofFloat(xVar2, (Property<ah.x, Float>) property2, 1.0f), ObjectAnimator.ofFloat(xVar2, (Property<ah.x, Float>) property, 1.0f));
        } else {
            textView.setVisibility(0);
            xVar.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(xVar2, (Property<ah.x, Float>) property3, 0.1f), ObjectAnimator.ofFloat(xVar2, (Property<ah.x, Float>) property2, 0.1f), ObjectAnimator.ofFloat(xVar2, (Property<ah.x, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f));
        }
        this.h.addListener(new org.telegram.ui.ho(i10, this, z10));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileLoaded) {
            String str = (String) objArr[0];
            String str2 = this.r;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            a(false);
            ApplicationLoader.applicationLoaderInstance.openApkInstall((Activity) getContext(), this.n.document);
            return;
        }
        if (i10 == NotificationCenter.fileLoadFailed) {
            String str3 = (String) objArr[0];
            String str4 = this.r;
            if (str4 == null || !str4.equals(str3)) {
                return;
            }
            a(false);
            return;
        }
        if (i10 == NotificationCenter.fileLoadProgressChanged) {
            String str5 = (String) objArr[0];
            String str6 = this.r;
            if (str6 == null || !str6.equals(str5)) {
                return;
            }
            this.e.e(Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.w;
        ScrollView scrollView = this.f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), AndroidUtilities.dp(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.x;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - AndroidUtilities.dp(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8) {
            NotificationCenter.getInstance(this.s).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.s).removeObserver(this, NotificationCenter.fileLoadFailed);
            NotificationCenter.getInstance(this.s).removeObserver(this, NotificationCenter.fileLoadProgressChanged);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int x02;
        ScrollView scrollView;
        GradientDrawable gradientDrawable = this.x;
        GradientDrawable gradientDrawable2 = this.w;
        try {
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            if (this.y) {
                if (x03 != this.E) {
                }
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false);
                scrollView = this.f;
                if (scrollView != null && (!this.y || x02 != this.F)) {
                    this.F = x02;
                    AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, x02);
                }
                this.y = true;
                invalidate();
            }
            this.E = x03;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{x03, 0});
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{x03, 0});
            }
            x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false);
            scrollView = this.f;
            if (scrollView != null) {
                this.F = x02;
                AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, x02);
            }
            this.y = true;
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
