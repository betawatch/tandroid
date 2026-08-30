package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.c60;
import org.telegram.ui.p40;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class u0 extends FrameLayout implements VoIPService.StateListener {
    public boolean a;
    public final m2.h b;
    public final eg.s0 c;
    public final LinearLayout d;
    public final jj0 e;
    public final TextView[] f;
    public final s2 h;
    public int n;
    public int r;
    public boolean s;
    public boolean v;
    public float w;
    public int x;
    public final boolean y;

    public u0(Context context, boolean z4) {
        super(context);
        this.n = 1;
        this.r = 1;
        this.y = z4;
        this.f = new TextView[z4 ? 3 : 2];
        m2.h hVar = new m2.h(context);
        this.b = hVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(hVar, 2130706432);
        hVar.setAdapter(new t0(this));
        hVar.setPageMargin(0);
        hVar.setOffscreenPageLimit(1);
        addView(hVar, b6.c(-1.0f, -1));
        hVar.b(new r0(this));
        s2 s2Var = new s2(context, false, false);
        this.h = s2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        r2 r2Var = s2Var.d;
        r2Var.setScalingType(scalingType);
        s2Var.U = 1;
        s2Var.W = true;
        r2Var.setAlpha(0.0f);
        r2Var.setRotateTextureWithScreen(true);
        r2Var.setUseCameraRotation(true);
        addView(s2Var, b6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(false));
        kVar.setBackgroundColor(0);
        kVar.C(j6.w0(null, j6.hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new y51(this, 1));
        addView(kVar);
        eg.s0 s0Var = new eg.s0(this, getContext());
        this.c = s0Var;
        s0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        s0Var.setTag(-1);
        s0Var.setTextSize(1, 14.0f);
        int i10 = j6.ng;
        s0Var.setTextColor(j6.w0(null, i10, false));
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(j6.w0(null, i10, false), 76);
            s0Var.setForeground(j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        s0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        s0Var.setOnClickListener(new oh.n(this, 2));
        addView(s0Var, b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, b6.e(-2, 64, 80));
        int i11 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i11 >= textViewArr.length) {
                break;
            }
            textViewArr[i11] = new TextView(context);
            this.f[i11].setTextSize(1, 12.0f);
            this.f[i11].setTextColor(-1);
            this.f[i11].setTypeface(AndroidUtilities.bold());
            this.f[i11].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f[i11].setGravity(16);
            this.f[i11].setSingleLine(true);
            this.d.addView(this.f[i11], b6.n(-2, -1));
            if (i11 == 0 && this.y) {
                this.f[i11].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i11 == 0 || (i11 == 1 && this.y)) {
                this.f[i11].setText(LocaleController.getString(R.string.VoipFrontCamera));
            } else {
                this.f[i11].setText(LocaleController.getString(R.string.VoipBackCamera));
            }
            this.f[i11].setOnClickListener(new lh.y0(this, i11, 12));
            i11++;
        }
        setAlpha(0.0f);
        setTranslationX(AndroidUtilities.dp(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new s0());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.y ? 1 : 0);
        jj0 jj0Var = new jj0(context);
        this.e = jj0Var;
        jj0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        jj0Var.setBackground(j6.K(AndroidUtilities.dp(48.0f), i0.a.k(-16777216, 76)));
        gj0 gj0Var = new gj0(R.raw.voice_mini, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        jj0Var.setAnimation(gj0Var);
        jj0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        gj0Var.K(69);
        jj0Var.setOnClickListener(new rx0(9, this, gj0Var));
        addView(jj0Var, b6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(u0 u0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (u0Var.n == u0Var.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i10 = u0Var.n;
        if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
            u0Var.c();
            u0Var.s = false;
            VoIPService.getSharedInstance().switchCamera();
            u0Var.h.setAlpha(0.0f);
        }
        u0Var.r = u0Var.n;
    }

    public final void b(boolean z4, boolean z10) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        c60 c60Var = ((p40) this).B;
        boolean z11 = c60Var.w0.v;
        c60Var.w0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z10) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z4, z11);
            }
            if (z4 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            c60Var.N1(true, false);
            c60Var.X0.sortParticipants();
            c60Var.O0(true);
            c60Var.e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new f91(this, 3));
        invalidate();
    }

    public final void c() {
        s2 s2Var = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = s2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), s2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb" + this.r + ".jpg")));
                        View findViewWithTag = this.b.findViewWithTag(Integer.valueOf(this.r - (1 ^ (this.y ? 1 : 0))));
                        if (findViewWithTag instanceof ImageView) {
                            ((ImageView) findViewWithTag).setImageBitmap(createScaledBitmap);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void d() {
        int i10 = this.x;
        TextView[] textViewArr = this.f;
        TextView textView = textViewArr[i10];
        TextView textView2 = i10 < textViewArr.length + (-1) ? textViewArr[i10 + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.w;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.x;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f12 = this.w;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.w;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f11);
            textViewArr[i11].setScaleX(f10);
            textViewArr[i11].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.c.invalidate();
        boolean z4 = this.y;
        s2 s2Var = this.h;
        if (z4 && this.x == 0 && this.w <= 0.0f) {
            s2Var.setVisibility(4);
            return;
        }
        s2Var.setVisibility(0);
        if (this.x + (!z4 ? 1 : 0) == this.n) {
            s2Var.setTranslationX((-this.w) * getMeasuredWidth());
        } else {
            s2Var.setTranslationX((1.0f - this.w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.k(j6.w0(null, j6.gg, false), (int) (getAlpha() * 1.0f * 255.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.registerStateListener(this);
        }
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onAudioSettingsChanged() {
        org.telegram.messenger.voip.v0.a(this);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraFirstFrameAvailable() {
        if (this.s) {
            return;
        }
        this.s = true;
        this.h.animate().alpha(1.0f).setDuration(250L);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final void onCameraSwitch(boolean z4) {
        if (VoIPService.getSharedInstance() != null) {
            this.h.d.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            sharedInstance.unregisterStateListener(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        if (z4) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        jj0 jj0Var = this.e;
        if (jj0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) jj0Var.getLayoutParams();
            if (z4) {
                int dp3 = AndroidUtilities.dp(88.0f);
                marginLayoutParams2.leftMargin = dp3;
                marginLayoutParams2.rightMargin = dp3;
            } else {
                int dp4 = AndroidUtilities.dp(24.0f);
                marginLayoutParams2.leftMargin = dp4;
                marginLayoutParams2.rightMargin = dp4;
            }
        }
        super.onMeasure(i10, i11);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.v0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z4) {
        org.telegram.messenger.voip.v0.e(this, z4);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.v0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i10) {
        org.telegram.messenger.voip.v0.g(this, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z4) {
        org.telegram.messenger.voip.v0.h(this, z4);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
