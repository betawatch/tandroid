package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class t6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.f6 E;
    public final org.telegram.ui.Components.f6 F;
    public final org.telegram.ui.Components.f6 G;
    public final org.telegram.ui.Components.p6 H;
    public final y a;
    public final int b;
    public int c;
    public final int d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final org.telegram.ui.ActionBar.n5 f;
    public final ImageView h;
    public long n;
    public final RectF r;
    public final boolean s;
    public final boolean v;
    public final org.telegram.ui.ActionBar.g6 w;
    public boolean x;
    public final u5 y;

    /* JADX WARN: Removed duplicated region for block: B:45:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t6(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.b = -1;
        this.d = UserConfig.selectedAccount;
        u5 u5Var = new u5(this, 1);
        this.y = u5Var;
        bs bsVar = bs.h;
        this.E = new org.telegram.ui.Components.f6(this, 350L, bsVar);
        this.F = new org.telegram.ui.Components.f6(this, 350L, bsVar);
        this.G = new org.telegram.ui.Components.f6(this, 350L, bsVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, false);
        this.H = p6Var;
        p6Var.n(0.3f, 320L, bsVar);
        p6Var.w(AndroidUtilities.dp(12.0f));
        p6Var.x(Typeface.DEFAULT_BOLD);
        p6Var.b = 17;
        p6Var.setCallback(this);
        this.w = g6Var;
        this.s = z10;
        this.v = z11;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        boolean z12 = LocaleController.isRTL;
        addView(imageView, w7.z5.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f = n5Var;
        n5Var.setTextSize(16);
        n5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        n5Var.setTypeface(AndroidUtilities.bold());
        boolean z13 = LocaleController.isRTL;
        addView(n5Var, w7.z5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var2;
        n5Var2.setTextSize(14);
        org.telegram.ui.ActionBar.r6.Z(n5Var2, org.telegram.ui.ActionBar.k6.A6, g6Var);
        n5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z14 = LocaleController.isRTL;
        addView(n5Var2, w7.z5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        n5Var.setTag(Integer.valueOf(z10 ? z11 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.ri : org.telegram.ui.ActionBar.k6.oi));
        org.telegram.ui.ActionBar.r6.Z(n5Var, z10 ? z11 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.ri : org.telegram.ui.ActionBar.k6.oi, g6Var);
        if (!z10) {
            i10 = org.telegram.ui.ActionBar.k6.mi;
            i11 = org.telegram.ui.ActionBar.k6.ni;
        } else {
            if (z11) {
                i12 = org.telegram.ui.ActionBar.k6.wj;
                imageView.setTag(Integer.valueOf(i12));
                y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(46.0f), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var));
                this.a = i02;
                this.c = 0;
                this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi;
                if (z10) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    org.telegram.ui.ActionBar.r6.z(this, mutate, org.telegram.ui.ActionBar.k6.ni, g6Var, PorterDuff.Mode.MULTIPLY);
                    yq yqVar = new yq(i02, mutate);
                    int dp = AndroidUtilities.dp(46.0f);
                    int dp2 = AndroidUtilities.dp(46.0f);
                    yqVar.h = dp;
                    yqVar.n = dp2;
                    int dp3 = AndroidUtilities.dp(24.0f);
                    int dp4 = AndroidUtilities.dp(24.0f);
                    yqVar.e = dp3;
                    yqVar.f = dp4;
                    imageView.setBackgroundDrawable(yqVar);
                } else {
                    this.r = new RectF();
                    jr0 jr0Var = new jr0(getContext(), z11 ? 5 : 4);
                    org.telegram.ui.ActionBar.r6.z(this, jr0Var, org.telegram.ui.ActionBar.k6.qi, g6Var, PorterDuff.Mode.MULTIPLY);
                    yq yqVar2 = new yq(i02, jr0Var);
                    int dp5 = AndroidUtilities.dp(46.0f);
                    int dp6 = AndroidUtilities.dp(46.0f);
                    yqVar2.h = dp5;
                    yqVar2.n = dp6;
                    imageView.setBackgroundDrawable(yqVar2);
                    if (!z11) {
                        AndroidUtilities.cancelRunOnUIThread(u5Var);
                        AndroidUtilities.runOnUIThread(u5Var, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i10 = org.telegram.ui.ActionBar.k6.pi;
            i11 = org.telegram.ui.ActionBar.k6.qi;
        }
        i12 = i10 + i11;
        imageView.setTag(Integer.valueOf(i12));
        y i022 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(46.0f), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var), org.telegram.ui.ActionBar.k6.w0(!z10 ? z11 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var));
        this.a = i022;
        this.c = 0;
        this.b = !z10 ? z11 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi;
        if (z10) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.h;
    }

    public final void a() {
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.d).getSharingLocationInfo(this.n);
        if (sharingLocationInfo == null) {
            b(LocaleController.getString(R.string.SendLiveLocation), LocaleController.getString(R.string.SendLiveLocationInfo));
            return;
        }
        if (!this.v) {
            b(LocaleController.getString(R.string.SharingLiveLocation), LocaleController.getString(R.string.SharingLiveLocationAdd));
            return;
        }
        String string = LocaleController.getString(R.string.StopLiveLocation);
        int i10 = sharingLocationInfo.messageObject.messageOwner.edit_date;
        b(string, LocaleController.formatLocationUpdateDate(i10 != 0 ? i10 : r0.date));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.b;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
    }

    public final void b(String str, String str2) {
        this.f.l(str, false);
        this.e.l(str2, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r != null) {
            u5 u5Var = this.y;
            AndroidUtilities.cancelRunOnUIThread(u5Var);
            AndroidUtilities.runOnUIThread(u5Var, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.y);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d;
        int i10;
        Paint V0;
        boolean z10 = this.x;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (!z10 || (V0 = org.telegram.ui.ActionBar.k6.V0("paintDivider", g6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(73.0f) : 0), getMeasuredHeight(), V0);
        }
        if (this.v) {
            return;
        }
        int i11 = this.d;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i11).getSharingLocationInfo(this.n);
        org.telegram.ui.Components.f6 f6Var = this.E;
        float f7 = f6Var.c;
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        org.telegram.ui.Components.f6 f6Var2 = this.F;
        if (sharingLocationInfo == null || (i10 = sharingLocationInfo.stopTime) < currentTime || sharingLocationInfo.period == Integer.MAX_VALUE) {
            f6Var2.getClass();
            d = f6Var2.d(0.0f, false);
        } else {
            f7 = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
            d = f6Var2.e(true);
        }
        float f10 = d;
        float f11 = f7;
        if (f10 <= 0.0f) {
            return;
        }
        if (LocaleController.isRTL) {
            this.r.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        } else {
            this.r.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        }
        canvas2.save();
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f10);
        canvas2.scale(lerp, lerp, this.r.centerX(), this.r.centerY());
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.si, g6Var);
        org.telegram.ui.ActionBar.k6.l2.setColor(w02);
        int alpha = org.telegram.ui.ActionBar.k6.l2.getAlpha();
        float f12 = alpha;
        org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (0.2f * f12 * f10));
        canvas2.drawArc(this.r, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.l2);
        org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (f12 * f10));
        canvas.drawArc(this.r, -90.0f, f6Var.d(f11, false) * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
        org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
        org.telegram.ui.Components.p6 p6Var = this.H;
        if (sharingLocationInfo != null) {
            p6Var.t(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
        }
        int length = p6Var.i.length();
        float d10 = this.G.d(length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f, false);
        canvas.scale(d10, d10, this.r.centerX(), this.r.centerY());
        p6Var.u(w02);
        p6Var.B = (int) (f10 * 255.0f);
        RectF rectF = this.r;
        int i12 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - AndroidUtilities.dp(13.0f));
        RectF rectF2 = this.r;
        p6Var.setBounds(i12, centerY, (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
        p6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        this.n = j10;
        if (this.s) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        if (LocationController.getInstance(this.d).getSharingLocationInfo(this.n) == null) {
            this.f.setAlpha(z10 ? 1.0f : 0.5f);
            this.e.setAlpha(z10 ? 1.0f : 0.5f);
            this.h.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (this.s) {
            a();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10;
        int w02;
        try {
            if (this.a == null || (i10 = this.b) < 0 || (w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.w)) == this.c) {
                return;
            }
            this.c = w02;
            org.telegram.ui.ActionBar.k6.E1(this.a, w02, false);
            org.telegram.ui.ActionBar.k6.E1(this.a, w02, true);
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.H || super.verifyDrawable(drawable);
    }
}
