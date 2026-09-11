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
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class t6 extends FrameLayout {
    public final org.telegram.ui.Components.p6 E;
    public final int a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final ImageView d;
    public long e;
    public final RectF f;
    public final boolean h;
    public final boolean n;
    public final org.telegram.ui.ActionBar.f6 r;
    public boolean s;
    public final androidx.activity.i v;
    public final org.telegram.ui.Components.e6 w;
    public final org.telegram.ui.Components.e6 x;
    public final org.telegram.ui.Components.e6 y;

    /* JADX WARN: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t6(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, boolean z11) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.a = UserConfig.selectedAccount;
        androidx.activity.i iVar = new androidx.activity.i(this, 29);
        this.v = iVar;
        pr prVar = pr.h;
        this.w = new org.telegram.ui.Components.e6(this, 350L, prVar);
        this.x = new org.telegram.ui.Components.e6(this, 350L, prVar);
        this.y = new org.telegram.ui.Components.e6(this, 350L, prVar);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, false, false);
        this.E = p6Var;
        p6Var.k(0.3f, 320L, prVar);
        p6Var.t(AndroidUtilities.dp(12.0f));
        p6Var.u(Typeface.DEFAULT_BOLD);
        p6Var.b = 17;
        p6Var.setCallback(this);
        this.r = f6Var;
        this.h = z10;
        this.n = z11;
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        boolean z12 = LocaleController.isRTL;
        addView(imageView, w7.x5.d(46, 46.0f, (z12 ? 5 : 3) | 16, z12 ? 0.0f : 13.0f, 0.0f, z12 ? 13.0f : 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j5Var.setTypeface(AndroidUtilities.bold());
        boolean z13 = LocaleController.isRTL;
        addView(j5Var, w7.x5.d(-1, 20.0f, (z13 ? 5 : 3) | 48, z13 ? 16.0f : 73.0f, 9.33f, z13 ? 73.0f : 16.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var2;
        j5Var2.setTextSize(14);
        j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
        j5Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z14 = LocaleController.isRTL;
        addView(j5Var2, w7.x5.d(-1, 20.0f, (z14 ? 5 : 3) | 48, z14 ? 16.0f : 73.0f, 33.0f, z14 ? 73.0f : 16.0f, 0.0f));
        j5Var.setTag(Integer.valueOf(z10 ? z11 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.ri : org.telegram.ui.ActionBar.j6.oi));
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? z11 ? org.telegram.ui.ActionBar.j6.q7 : org.telegram.ui.ActionBar.j6.ri : org.telegram.ui.ActionBar.j6.oi, f6Var));
        if (!z10) {
            i10 = org.telegram.ui.ActionBar.j6.mi;
            i11 = org.telegram.ui.ActionBar.j6.ni;
        } else {
            if (z11) {
                i12 = org.telegram.ui.ActionBar.j6.wj;
                imageView.setTag(Integer.valueOf(i12));
                z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(46.0f), org.telegram.ui.ActionBar.j6.v0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.wj : org.telegram.ui.ActionBar.j6.pi : org.telegram.ui.ActionBar.j6.mi, f6Var), org.telegram.ui.ActionBar.j6.v0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.wj : org.telegram.ui.ActionBar.j6.pi : org.telegram.ui.ActionBar.j6.mi, f6Var));
                if (z10) {
                    Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ni, f6Var), PorterDuff.Mode.MULTIPLY));
                    oq oqVar = new oq(h02, mutate);
                    int dp = AndroidUtilities.dp(46.0f);
                    int dp2 = AndroidUtilities.dp(46.0f);
                    oqVar.h = dp;
                    oqVar.n = dp2;
                    int dp3 = AndroidUtilities.dp(24.0f);
                    int dp4 = AndroidUtilities.dp(24.0f);
                    oqVar.e = dp3;
                    oqVar.f = dp4;
                    imageView.setBackgroundDrawable(oqVar);
                } else {
                    this.f = new RectF();
                    iq0 iq0Var = new iq0(getContext(), z11 ? 5 : 4);
                    iq0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.qi, f6Var), PorterDuff.Mode.MULTIPLY));
                    oq oqVar2 = new oq(h02, iq0Var);
                    int dp5 = AndroidUtilities.dp(46.0f);
                    int dp6 = AndroidUtilities.dp(46.0f);
                    oqVar2.h = dp5;
                    oqVar2.n = dp6;
                    imageView.setBackgroundDrawable(oqVar2);
                    if (!z11) {
                        AndroidUtilities.cancelRunOnUIThread(iVar);
                        AndroidUtilities.runOnUIThread(iVar, 1000L);
                    }
                }
                setWillNotDraw(false);
            }
            i10 = org.telegram.ui.ActionBar.j6.pi;
            i11 = org.telegram.ui.ActionBar.j6.qi;
        }
        i12 = i10 + i11;
        imageView.setTag(Integer.valueOf(i12));
        z h022 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(46.0f), org.telegram.ui.ActionBar.j6.v0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.wj : org.telegram.ui.ActionBar.j6.pi : org.telegram.ui.ActionBar.j6.mi, f6Var), org.telegram.ui.ActionBar.j6.v0(!z10 ? z11 ? org.telegram.ui.ActionBar.j6.wj : org.telegram.ui.ActionBar.j6.pi : org.telegram.ui.ActionBar.j6.mi, f6Var));
        if (z10) {
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
            androidx.activity.i iVar = this.v;
            AndroidUtilities.cancelRunOnUIThread(iVar);
            AndroidUtilities.runOnUIThread(iVar, 1000L);
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
        boolean z10 = this.s;
        org.telegram.ui.ActionBar.f6 f6Var = this.r;
        if (!z10 || (T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", f6Var)) == null) {
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
        org.telegram.ui.Components.e6 e6Var = this.w;
        float f7 = e6Var.c;
        int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
        org.telegram.ui.Components.e6 e6Var2 = this.x;
        if (sharingLocationInfo == null || (i10 = sharingLocationInfo.stopTime) < currentTime || sharingLocationInfo.period == Integer.MAX_VALUE) {
            e6Var2.getClass();
            d = e6Var2.d(0.0f, false);
        } else {
            f7 = Math.abs(i10 - currentTime) / sharingLocationInfo.period;
            d = e6Var2.e(true);
        }
        float f10 = d;
        float f11 = f7;
        if (f10 <= 0.0f) {
            return;
        }
        if (LocaleController.isRTL) {
            this.f.set(AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        } else {
            this.f.set(getMeasuredWidth() - AndroidUtilities.dp(43.0f), (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(15.0f), getMeasuredWidth() - AndroidUtilities.dp(13.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(15.0f));
        }
        canvas2.save();
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f10);
        canvas2.scale(lerp, lerp, this.f.centerX(), this.f.centerY());
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.si, f6Var);
        org.telegram.ui.ActionBar.j6.l2.setColor(v02);
        int alpha = org.telegram.ui.ActionBar.j6.l2.getAlpha();
        float f12 = alpha;
        org.telegram.ui.ActionBar.j6.l2.setAlpha((int) (0.2f * f12 * f10));
        canvas2.drawArc(this.f, -90.0f, 360.0f, false, org.telegram.ui.ActionBar.j6.l2);
        org.telegram.ui.ActionBar.j6.l2.setAlpha((int) (f12 * f10));
        canvas.drawArc(this.f, -90.0f, e6Var.d(f11, false) * (-360.0f), false, org.telegram.ui.ActionBar.j6.l2);
        org.telegram.ui.ActionBar.j6.l2.setAlpha(alpha);
        org.telegram.ui.Components.p6 p6Var = this.E;
        if (sharingLocationInfo != null) {
            p6Var.q(LocaleController.formatLocationLeftTime(Math.abs(sharingLocationInfo.stopTime - currentTime)), true, true);
        }
        int length = p6Var.g.length();
        float d10 = this.y.d(length > 4 ? 0.75f : length > 3 ? 0.85f : 1.0f, false);
        canvas.scale(d10, d10, this.f.centerX(), this.f.centerY());
        p6Var.r(v02);
        p6Var.w = (int) (f10 * 255.0f);
        RectF rectF = this.f;
        int i12 = (int) rectF.left;
        int centerY = (int) (rectF.centerY() - AndroidUtilities.dp(13.0f));
        RectF rectF2 = this.f;
        p6Var.setBounds(i12, centerY, (int) rectF2.right, (int) (rectF2.centerY() + AndroidUtilities.dp(12.0f)));
        p6Var.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
    }

    public void setDialogId(long j3) {
        this.e = j3;
        if (this.h) {
            a();
        }
    }

    public void setHasLocation(boolean z10) {
        if (LocationController.getInstance(this.a).getSharingLocationInfo(this.e) == null) {
            this.c.setAlpha(z10 ? 1.0f : 0.5f);
            this.b.setAlpha(z10 ? 1.0f : 0.5f);
            this.d.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (this.h) {
            a();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }
}
