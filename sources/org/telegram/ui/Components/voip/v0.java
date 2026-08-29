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
import i7.f6;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.d40;
import org.telegram.ui.r50;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class v0 extends FrameLayout implements VoIPService.StateListener {
    public boolean a;
    public final m2.g b;
    public final cg.s0 c;
    public final LinearLayout d;
    public final aj0 e;
    public final TextView[] f;
    public final u2 h;
    public int n;
    public int r;
    public boolean s;
    public boolean v;
    public float w;
    public int x;
    public final boolean y;

    public v0(Context context, boolean z10) {
        super(context);
        this.n = 1;
        this.r = 1;
        this.y = z10;
        this.f = new TextView[z10 ? 3 : 2];
        m2.g gVar = new m2.g(context);
        this.b = gVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new u0(this));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, f6.c(-1.0f, -1));
        gVar.b(new s0(this));
        u2 u2Var = new u2(context, false, false);
        this.h = u2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        t2 t2Var = u2Var.d;
        t2Var.setScalingType(scalingType);
        u2Var.T = 1;
        u2Var.V = true;
        t2Var.setAlpha(0.0f);
        t2Var.setRotateTextureWithScreen(true);
        t2Var.setUseCameraRotation(true);
        addView(u2Var, f6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        lVar.setBackgroundColor(0);
        lVar.C(g6.w0(null, g6.hg, false), false);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new m51(this, 1));
        addView(lVar);
        cg.s0 s0Var = new cg.s0(this, getContext());
        this.c = s0Var;
        s0Var.setMinWidth(AndroidUtilities.dp(64.0f));
        s0Var.setTag(-1);
        s0Var.setTextSize(1, 14.0f);
        int i10 = g6.ng;
        s0Var.setTextColor(g6.w0(null, i10, false));
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        s0Var.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k9 = i0.a.k(g6.w0(null, i10, false), 76);
            s0Var.setForeground(g6.i0(dp, dp, dp, dp, 0, k9, k9));
        }
        s0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        s0Var.setOnClickListener(new mh.n(this, 8));
        addView(s0Var, f6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, f6.e(-2, 64, 80));
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
            this.d.addView(this.f[i11], f6.n(-2, -1));
            if (i11 == 0 && this.y) {
                this.f[i11].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i11 == 0 || (i11 == 1 && this.y)) {
                this.f[i11].setText(LocaleController.getString(R.string.VoipFrontCamera));
            } else {
                this.f[i11].setText(LocaleController.getString(R.string.VoipBackCamera));
            }
            this.f[i11].setOnClickListener(new jh.y0(this, i11, 14));
            i11++;
        }
        setAlpha(0.0f);
        setTranslationX(AndroidUtilities.dp(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new t0());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.y ? 1 : 0);
        aj0 aj0Var = new aj0(context);
        this.e = aj0Var;
        aj0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        aj0Var.setBackground(g6.K(AndroidUtilities.dp(48.0f), i0.a.k(-16777216, 76)));
        xi0 xi0Var = new xi0(R.raw.voice_mini, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        aj0Var.setAnimation(xi0Var);
        aj0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        xi0Var.K(69);
        aj0Var.setOnClickListener(new fi0(12, this, xi0Var));
        addView(aj0Var, f6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(v0 v0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (v0Var.n == v0Var.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i10 = v0Var.n;
        if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
            v0Var.c();
            v0Var.s = false;
            VoIPService.getSharedInstance().switchCamera();
            v0Var.h.setAlpha(0.0f);
        }
        v0Var.r = v0Var.n;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        r50 r50Var = ((d40) this).A;
        boolean z12 = r50Var.v0.v;
        r50Var.v0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            r50Var.N1(true, false);
            r50Var.W0.sortParticipants();
            r50Var.O0(true);
            r50Var.e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new p11(this, 12));
        invalidate();
    }

    public final void c() {
        u2 u2Var = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = u2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), u2Var.d.getMatrix(), true);
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
            float f9 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.w;
                    f10 = 1.0f - (0.3f * f11);
                    f9 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.w;
                    f10 = 0.7f + (0.3f * f12);
                    f9 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f9);
            textViewArr[i11].setScaleY(f9);
        }
        this.d.setTranslationX(measuredWidth2);
        this.c.invalidate();
        boolean z10 = this.y;
        u2 u2Var = this.h;
        if (z10 && this.x == 0 && this.w <= 0.0f) {
            u2Var.setVisibility(4);
            return;
        }
        u2Var.setVisibility(0);
        if (this.x + (!z10 ? 1 : 0) == this.n) {
            u2Var.setTranslationX((-this.w) * getMeasuredWidth());
        } else {
            u2Var.setTranslationX((1.0f - this.w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.k(g6.w0(null, g6.gg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.u0.a(this);
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
    public final void onCameraSwitch(boolean z10) {
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        if (z10) {
            int dp = AndroidUtilities.dp(80.0f);
            marginLayoutParams.leftMargin = dp;
            marginLayoutParams.rightMargin = dp;
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            marginLayoutParams.leftMargin = dp2;
            marginLayoutParams.rightMargin = dp2;
        }
        aj0 aj0Var = this.e;
        if (aj0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) aj0Var.getLayoutParams();
            if (z10) {
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
        org.telegram.messenger.voip.u0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.u0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i10) {
        org.telegram.messenger.voip.u0.g(this, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i10;
    }
}
