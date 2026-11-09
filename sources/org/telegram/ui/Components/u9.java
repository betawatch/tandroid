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
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class u9 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public boolean D;
    public int E;
    public int F;
    public TextView a;
    public TextView b;
    public bi.e5 c;
    public bi.e5 d;
    public eh0 e;
    public ScrollView f;
    public AnimatorSet h;
    public TLRPC.TL_help_appUpdate n;
    public String r;
    public int s;
    public int w;
    public GradientDrawable x;
    public GradientDrawable y;

    public final void a(boolean z9) {
        bi.e5 e5Var = this.d;
        TextView textView = this.b;
        bi.e5 e5Var2 = this.c;
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.h = new AnimatorSet();
        Property property = View.ALPHA;
        Property property2 = View.SCALE_Y;
        Property property3 = View.SCALE_X;
        int i7 = 0;
        if (z9) {
            e5Var2.setVisibility(0);
            e5Var.setEnabled(false);
            this.h.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.1f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property3, 1.0f), ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property2, 1.0f), ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property, 1.0f));
        } else {
            textView.setVisibility(0);
            e5Var.setEnabled(true);
            this.h.playTogether(ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property3, 0.1f), ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property2, 0.1f), ObjectAnimator.ofFloat(e5Var2, (Property<bi.e5, Float>) property, 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f));
        }
        this.h.addListener(new t9(i7, this, z9));
        this.h.setDuration(150L);
        this.h.start();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.Y1) {
            String str = (String) objArr[0];
            String str2 = this.r;
            if (str2 == null || !str2.equals(str)) {
                return;
            }
            a(false);
            org.telegram.messenger.t0.a.v((Activity) getContext(), this.n.document);
            return;
        }
        if (i7 == org.telegram.messenger.qs.Z1) {
            String str3 = (String) objArr[0];
            String str4 = this.r;
            if (str4 == null || !str4.equals(str3)) {
                return;
            }
            a(false);
            return;
        }
        if (i7 == org.telegram.messenger.qs.X1) {
            String str5 = (String) objArr[0];
            String str6 = this.r;
            if (str6 == null || !str6.equals(str5)) {
                return;
            }
            this.e.e(true, Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        GradientDrawable gradientDrawable = this.x;
        ScrollView scrollView = this.f;
        gradientDrawable.setBounds(scrollView.getLeft(), scrollView.getTop(), scrollView.getRight(), org.telegram.messenger.g0.L(16.0f) + scrollView.getTop());
        gradientDrawable.draw(canvas);
        GradientDrawable gradientDrawable2 = this.y;
        gradientDrawable2.setBounds(scrollView.getLeft(), scrollView.getBottom() - org.telegram.messenger.g0.L(18.0f), scrollView.getRight(), scrollView.getBottom());
        gradientDrawable2.draw(canvas);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8) {
            org.telegram.messenger.qs.f(this.s).n(this, org.telegram.messenger.qs.Y1);
            org.telegram.messenger.qs.f(this.s).n(this, org.telegram.messenger.qs.Z1);
            org.telegram.messenger.qs.f(this.s).n(this, org.telegram.messenger.qs.X1);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int x02;
        ScrollView scrollView;
        GradientDrawable gradientDrawable = this.y;
        GradientDrawable gradientDrawable2 = this.x;
        try {
            int x03 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false);
            if (this.D) {
                if (x03 != this.E) {
                }
                x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.s8, false);
                scrollView = this.f;
                if (scrollView != null && (!this.D || x02 != this.F)) {
                    this.F = x02;
                    org.telegram.messenger.g0.z3(scrollView, x02);
                }
                this.D = true;
                invalidate();
            }
            this.E = x03;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setColors(new int[]{x03, 0});
            }
            if (gradientDrawable != null) {
                gradientDrawable.setColors(new int[]{x03, 0});
            }
            x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.s8, false);
            scrollView = this.f;
            if (scrollView != null) {
                this.F = x02;
                org.telegram.messenger.g0.z3(scrollView, x02);
            }
            this.D = true;
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
