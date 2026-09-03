package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s6 extends FrameLayout {
    public final org.telegram.ui.Components.j6 B;
    public final int a;
    public final org.telegram.ui.ActionBar.l5 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final ImageView d;
    public long e;
    public final RectF f;
    public final boolean h;
    public final boolean n;
    public final org.telegram.ui.ActionBar.g6 r;
    public boolean s;
    public final m2.b v;
    public final org.telegram.ui.Components.z5 w;
    public final org.telegram.ui.Components.z5 x;
    public final org.telegram.ui.Components.z5 y;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s6(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.a = UserConfig.selectedAccount;
        m2.b bVar = new m2.b(this, 8);
        this.v = bVar;
        pr prVar = pr.h;
        this.w = new org.telegram.ui.Components.z5(this, 350L, prVar);
        this.x = new org.telegram.ui.Components.z5(this, 350L, prVar);
        this.y = new org.telegram.ui.Components.z5(this, 350L, prVar);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, false, false);
        this.B = j6Var;
        j6Var.k(0.3f, 320L, prVar);
        j6Var.t(AndroidUtilities.dp(12.0f));
        j6Var.u(Typeface.DEFAULT_BOLD);
        j6Var.b = 17;
        j6Var.setCallback(this);
        this.r = g6Var;
        this.h = z4;
        this.n = z10;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        boolean z11 = LocaleController.isRTL;
        addView(imageView, k7.c6.d(46, 46.0f, (z11 ? 5 : 3) | 16, z11 ? 0.0f : 13.0f, 0.0f, z11 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.c = l5Var;
        l5Var.setTextSize(16);
        l5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        l5Var.setTypeface(AndroidUtilities.bold());
        boolean z12 = LocaleController.isRTL;
        addView(l5Var, k7.c6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16.0f : 73.0f, 9.33f, z12 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var2;
        l5Var2.setTextSize(14);
        l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
        l5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z13 = LocaleController.isRTL;
        addView(l5Var2, k7.c6.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 33.0f, z13 ? 73.0f : 16.0f, 0.0f));
        l5Var.setTag(Integer.valueOf(z4 ? z10 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.ri : org.telegram.ui.ActionBar.k6.oi));
        l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(z4 ? z10 ? org.telegram.ui.ActionBar.k6.q7 : org.telegram.ui.ActionBar.k6.ri : org.telegram.ui.ActionBar.k6.oi, g6Var));
        if (!z4) {
            i10 = org.telegram.ui.ActionBar.k6.mi;
            i11 = org.telegram.ui.ActionBar.k6.ni;
        } else {
            if (z10) {
                i12 = org.telegram.ui.ActionBar.k6.wj;
                imageView.setTag(Integer.valueOf(i12));
                z h02 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(46.0f), org.telegram.ui.ActionBar.k6.v0(!z4 ? z10 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var), org.telegram.ui.ActionBar.k6.v0(!z4 ? z10 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var));
                if (z4) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ni, g6Var), PorterDuff.Mode.MULTIPLY));
                    pq pqVar = new pq(h02, mutate);
                    int dp = AndroidUtilities.dp(46.0f);
                    int dp2 = AndroidUtilities.dp(46.0f);
                    pqVar.h = dp;
                    pqVar.n = dp2;
                    int dp3 = AndroidUtilities.dp(24.0f);
                    int dp4 = AndroidUtilities.dp(24.0f);
                    pqVar.e = dp3;
                    pqVar.f = dp4;
                    imageView.setBackgroundDrawable(pqVar);
                } else {
                    this.f = new RectF();
                    mq0 mq0Var = new mq0(getContext(), z10 ? 5 : 4);
                    mq0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.qi, g6Var), PorterDuff.Mode.MULTIPLY));
                    pq pqVar2 = new pq(h02, mq0Var);
                    int dp5 = AndroidUtilities.dp(46.0f);
                    int dp6 = AndroidUtilities.dp(46.0f);
                    pqVar2.h = dp5;
                    pqVar2.n = dp6;
                    imageView.setBackgroundDrawable(pqVar2);
                    if (!z10) {
                        AndroidUtilities.cancelRunOnUIThread(bVar);
                        AndroidUtilities.runOnUIThread(bVar, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i10 = org.telegram.ui.ActionBar.k6.pi;
            i11 = org.telegram.ui.ActionBar.k6.qi;
        }
        i12 = i10 + i11;
        imageView.setTag(Integer.valueOf(i12));
        z h022 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(46.0f), org.telegram.ui.ActionBar.k6.v0(!z4 ? z10 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var), org.telegram.ui.ActionBar.k6.v0(!z4 ? z10 ? org.telegram.ui.ActionBar.k6.wj : org.telegram.ui.ActionBar.k6.pi : org.telegram.ui.ActionBar.k6.mi, g6Var));
        if (z4) {
        }
        setWillNotDraw(false);
    }

    private ImageView getImageView() {
        return this.d;
    }

    public final void a() {
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.a).getSharingLocationInfo(this.e);
        if (sharingLocationInfo == null) {
            b(LocaleController.getString(R.string.SendLiveLocation), LocaleController.getString(R.string.SendLiveLocationInfo));
            return;
        }
        if (!this.n) {
            b(LocaleController.getString(R.string.SharingLiveLocation), LocaleController.getString(R.string.SharingLiveLocationAdd));
            return;
        }
        String string = LocaleController.getString(R.string.StopLiveLocation);
        int i10 = sharingLocationInfo.messageObject.messageOwner.edit_date;
        b(string, LocaleController.formatLocationUpdateDate(i10 != 0 ? i10 : r0.date));
    }

    public final void b(String str, String str2) {
        this.c.l(str, false);
        this.b.l(str2, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f != null) {
            m2.b bVar = this.v;
            AndroidUtilities.cancelRunOnUIThread(bVar);
            AndroidUtilities.runOnUIThread(bVar, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.cancelRunOnUIThread(this.v);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float d;
        int i10;
        Paint T0;
        boolean z4 = this.s;
        org.telegram.ui.ActionBar.g6 g6Var = this.r;
        if (!z4 || (T0 = org.telegram.ui.ActionBar.k6.T0("paintDivider", g6Var)) == null) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(73.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(73.0f) : 0), getMeasuredHeight(), T0);
        }
        if (this.n) {
            return;
        }
        int i11 = this.a;
        LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(i11).getSharingLocationInfo(this.e);
        org.telegram.ui.Components.z5 z5Var = this.w;
        float f10 = z5Var.c;
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        org.telegram.ui.Components.z5 z5Var2 = this.x;
        if (sharingLocationInfo == null || (i10 = sharingLocationInfo.stopTime) < currentTime || sharingLocationInfo.period == Integer.MAX_VALUE) {
            z5Var2.getClass();
            d = z5Var2.d(0.0f, false);
        } else {
            f10 = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
            d = z5Var2.e(true);
        }
        float f11 = d;
        float f12 = f10;
        if (f11 <= 0.0f) {
            return;
        }
        if (LocaleController.isRTL) {
            this.f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        } else {
            this.f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        }
        canvas2.save();
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f11);
        canvas2.scale(lerp, lerp, this.f.centerX(), this.f.centerY());
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.si, g6Var);
        org.telegram.ui.ActionBar.k6.l2.setColor(v02);
        int alpha = org.telegram.ui.ActionBar.k6.l2.getAlpha();
        float f13 = alpha;
        org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (0.2f * f13 * f11));
        canvas2.drawArc(this.f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.k6.l2);
        org.telegram.ui.ActionBar.k6.l2.setAlpha((int) (f13 * f11));
        canvas.drawArc(this.f, -90.0f, z5Var.d(f12, false) * (-360.0f), false, org.telegram.ui.ActionBar.k6.l2);
        org.telegram.ui.ActionBar.k6.l2.setAlpha(alpha);
        org.telegram.ui.Components.j6 j6Var = this.B;
        if (sharingLocationInfo != null) {
            j6Var.q(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
        }
        int length = j6Var.g.length();
        float d10 = this.y.d(length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f, false);
        canvas.scale(d10, d10, this.f.centerX(), this.f.centerY());
        j6Var.r(v02);
        j6Var.w = (int) (f11 * 255.0f);
        RectF rectF = this.f;
        int i12 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - AndroidUtilities.dp(13.0f));
        RectF rectF2 = this.f;
        j6Var.setBounds(i12, centerY, (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
        j6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j10) {
        this.e = j10;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z4) {
        if (LocationController.getInstance(this.a).getSharingLocationInfo(this.e) == null) {
            this.c.setAlpha(z4 ? 1.0f : 0.5f);
            this.b.setAlpha(z4 ? 1.0f : 0.5f);
            this.d.setAlpha(z4 ? 1.0f : 0.5f);
        }
        if (this.h) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.B || super.verifyDrawable(drawable);
    }
}
