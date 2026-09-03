package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class PipRoundVideoView implements NotificationCenter.NotificationCenterDelegate {
    public static PipRoundVideoView C;
    public final RectF B = new RectF();
    public cg0 a;
    public int b;
    public TextureView c;
    public ImageView d;
    public dg0 e;
    public Bitmap f;
    public int h;
    public int n;
    public AnimatorSet r;
    public Runnable s;
    public WindowManager.LayoutParams v;
    public WindowManager w;
    public SharedPreferences x;
    public DecelerateInterpolator y;

    public static int b(boolean z4, int i10, float f10, int i11) {
        int i12;
        if (z4) {
            i12 = AndroidUtilities.displaySize.x;
        } else {
            i12 = AndroidUtilities.displaySize.y - i11;
            i11 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int dp = i10 == 0 ? AndroidUtilities.dp(10.0f) : i10 == 1 ? (i12 - i11) - AndroidUtilities.dp(10.0f) : Math.round((r0 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        return !z4 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + dp : dp;
    }

    public final void a(boolean z4) {
        if (!z4) {
            if (this.f != null) {
                this.d.setImageDrawable(null);
                this.f.recycle();
                this.f = null;
            }
            try {
                this.w.removeView(this.a);
            } catch (Exception unused) {
            }
            if (C == this) {
                C = null;
            }
            NotificationCenter.getInstance(this.b).removeObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            return;
        }
        TextureView textureView = this.c;
        if (textureView == null || textureView.getParent() == null) {
            return;
        }
        if (this.c.getWidth() > 0 && this.c.getHeight() > 0) {
            this.f = Bitmaps.createBitmap(this.c.getWidth(), this.c.getHeight(), Bitmap.Config.ARGB_8888);
        }
        try {
            this.c.getBitmap(this.f);
        } catch (Throwable unused2) {
            this.f = null;
        }
        this.d.setImageBitmap(this.f);
        try {
            this.e.removeView(this.c);
        } catch (Exception unused3) {
        }
        this.d.setVisibility(0);
        c(false);
    }

    public final void c(boolean z4) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.a, (Property<cg0, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.a, (Property<cg0, Float>) View.SCALE_X, z4 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.a, (Property<cg0, Float>) View.SCALE_Y, z4 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.y == null) {
            this.y = new DecelerateInterpolator();
        }
        this.r.addListener(new m00(9, this, z4));
        this.r.setInterpolator(this.y);
        this.r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        C = this;
        this.s = runnable;
        cg0 cg0Var = new cg0(this, activity);
        this.a = cg0Var;
        cg0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.n = AndroidUtilities.dp(126.0f);
        dg0 dg0Var = new dg0(this, activity, 0);
        this.e = dg0Var;
        dg0Var.setOutlineProvider(new gg.j1(10));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.a.addView(this.e, k7.b6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.a.setAlpha(1.0f);
        this.a.setScaleX(0.8f);
        this.a.setScaleY(0.8f);
        this.c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.c.setScaleX(dpf2);
        this.c.setScaleY(dpf2);
        this.e.addView(this.c, k7.b6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, k7.b6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.x = sharedPreferences;
        int i10 = sharedPreferences.getInt("sidex", 1);
        int i11 = this.x.getInt("sidey", 0);
        float f10 = this.x.getFloat("px", 0.0f);
        float f11 = this.x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i12 = this.h;
            layoutParams.width = i12;
            layoutParams.height = this.n;
            layoutParams.x = b(true, i10, f10, i12);
            this.v.y = b(false, i11, f11, this.n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.w, this.a, layoutParams2);
            this.w.addView(this.a, this.v);
            int i13 = UserConfig.selectedAccount;
            this.b = i13;
            NotificationCenter.getInstance(i13).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        dg0 dg0Var;
        if (i10 != NotificationCenter.messagePlayingProgressDidChanged || (dg0Var = this.e) == null) {
            return;
        }
        dg0Var.invalidate();
    }

    public final void e(boolean z4) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.a, (Property<cg0, Float>) View.ALPHA, z4 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.a, (Property<cg0, Float>) View.SCALE_X, z4 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.a, (Property<cg0, Float>) View.SCALE_Y, z4 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.y == null) {
            this.y = new DecelerateInterpolator();
        }
        this.r.addListener(new eg0(this, 0));
        this.r.setInterpolator(this.y);
        this.r.start();
    }

    public int getX() {
        return this.v.x;
    }

    public int getY() {
        return this.v.y;
    }

    public void setX(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.x = i10;
        try {
            this.w.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i10) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i10;
        try {
            this.w.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
