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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class PipRoundVideoView implements NotificationCenter.NotificationCenterDelegate {
    public static PipRoundVideoView B;
    public final RectF A = new RectF();
    public ff0 a;
    public int b;
    public TextureView c;
    public ImageView d;
    public gf0 e;
    public Bitmap f;
    public int h;
    public int n;
    public AnimatorSet r;
    public Runnable s;
    public WindowManager.LayoutParams v;
    public WindowManager w;
    public SharedPreferences x;
    public DecelerateInterpolator y;

    public static int b(boolean z10, int i9, float f10, int i10) {
        int i11;
        if (z10) {
            i11 = AndroidUtilities.displaySize.x;
        } else {
            i11 = AndroidUtilities.displaySize.y - i10;
            i10 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        }
        int dp = i9 == 0 ? AndroidUtilities.dp(10.0f) : i9 == 1 ? (i11 - i10) - AndroidUtilities.dp(10.0f) : Math.round((r0 - AndroidUtilities.dp(20.0f)) * f10) + AndroidUtilities.dp(10.0f);
        return !z10 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + dp : dp;
    }

    public final void a(boolean z10) {
        if (!z10) {
            if (this.f != null) {
                this.d.setImageDrawable(null);
                this.f.recycle();
                this.f = null;
            }
            try {
                this.w.removeView(this.a);
            } catch (Exception unused) {
            }
            if (B == this) {
                B = null;
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

    public final void c(boolean z10) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.a, (Property<ff0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.a, (Property<ff0, Float>) View.SCALE_X, z10 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.a, (Property<ff0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.y == null) {
            this.y = new DecelerateInterpolator();
        }
        this.r.addListener(new u9(17, this, z10));
        this.r.setInterpolator(this.y);
        this.r.start();
    }

    public final void d(Activity activity, Runnable runnable) {
        if (activity == null) {
            return;
        }
        B = this;
        this.s = runnable;
        ff0 ff0Var = new ff0(this, activity);
        this.a = ff0Var;
        ff0Var.setWillNotDraw(false);
        this.h = AndroidUtilities.dp(126.0f);
        this.n = AndroidUtilities.dp(126.0f);
        gf0 gf0Var = new gf0(this, activity, 0);
        this.e = gf0Var;
        gf0Var.setOutlineProvider(new bg.q1(12));
        this.e.setClipToOutline(true);
        this.e.a(1.0f, 0);
        this.a.addView(this.e, g7.e6.d(120, 120.0f, 51, 3.0f, 3.0f, 0.0f, 0.0f));
        this.a.setAlpha(1.0f);
        this.a.setScaleX(0.8f);
        this.a.setScaleY(0.8f);
        this.c = new TextureView(activity);
        float dpf2 = (AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(120.0f)) / AndroidUtilities.dpf2(120.0f);
        this.c.setScaleX(dpf2);
        this.c.setScaleY(dpf2);
        this.e.addView(this.c, g7.e6.c(-1.0f, -1));
        ImageView imageView = new ImageView(activity);
        this.d = imageView;
        this.e.addView(imageView, g7.e6.c(-1.0f, -1));
        this.d.setVisibility(4);
        this.w = (WindowManager) activity.getSystemService("window");
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pipconfig", 0);
        this.x = sharedPreferences;
        int i9 = sharedPreferences.getInt("sidex", 1);
        int i10 = this.x.getInt("sidey", 0);
        float f10 = this.x.getFloat("px", 0.0f);
        float f11 = this.x.getFloat("py", 0.0f);
        try {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.v = layoutParams;
            int i11 = this.h;
            layoutParams.width = i11;
            layoutParams.height = this.n;
            layoutParams.x = b(true, i9, f10, i11);
            this.v.y = b(false, i10, f11, this.n);
            WindowManager.LayoutParams layoutParams2 = this.v;
            layoutParams2.format = -3;
            layoutParams2.gravity = 51;
            layoutParams2.type = 99;
            layoutParams2.flags = 16777736;
            AndroidUtilities.setPreferredMaxRefreshRate(this.w, this.a, layoutParams2);
            this.w.addView(this.a, this.v);
            int i12 = UserConfig.selectedAccount;
            this.b = i12;
            NotificationCenter.getInstance(i12).addObserver(this, NotificationCenter.messagePlayingProgressDidChanged);
            c(true);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        gf0 gf0Var;
        if (i9 != NotificationCenter.messagePlayingProgressDidChanged || (gf0Var = this.e) == null) {
            return;
        }
        gf0Var.invalidate();
    }

    public final void e(boolean z10) {
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.a, (Property<ff0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(this.a, (Property<ff0, Float>) View.SCALE_X, z10 ? 1.0f : 0.8f), ObjectAnimator.ofFloat(this.a, (Property<ff0, Float>) View.SCALE_Y, z10 ? 1.0f : 0.8f));
        this.r.setDuration(150L);
        if (this.y == null) {
            this.y = new DecelerateInterpolator();
        }
        this.r.addListener(new hf0(this, 0));
        this.r.setInterpolator(this.y);
        this.r.start();
    }

    public int getX() {
        return this.v.x;
    }

    public int getY() {
        return this.v.y;
    }

    public void setX(int i9) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.x = i9;
        try {
            this.w.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }

    public void setY(int i9) {
        WindowManager.LayoutParams layoutParams = this.v;
        layoutParams.y = i9;
        try {
            this.w.updateViewLayout(this.a, layoutParams);
        } catch (Exception unused) {
        }
    }
}
