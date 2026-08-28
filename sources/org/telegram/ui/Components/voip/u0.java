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
import g7.e6;
import java.io.File;
import java.io.FileOutputStream;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.a40;
import org.telegram.ui.o50;
import org.telegram.ui.tq;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class u0 extends FrameLayout implements VoIPService.StateListener {
    public boolean a;
    public final m2.g b;
    public final bh.e c;
    public final LinearLayout d;
    public final pi0 e;
    public final TextView[] f;
    public final r2 h;
    public int n;
    public int r;
    public boolean s;
    public boolean v;
    public float w;
    public int x;
    public final boolean y;

    public u0(Context context, boolean z10) {
        super(context);
        this.n = 1;
        this.r = 1;
        this.y = z10;
        this.f = new TextView[z10 ? 3 : 2];
        m2.g gVar = new m2.g(context);
        this.b = gVar;
        AndroidUtilities.setViewPagerEdgeEffectColor(gVar, 2130706432);
        gVar.setAdapter(new t0(this));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, e6.c(-1.0f, -1));
        gVar.b(new r0(this));
        r2 r2Var = new r2(context, false, false);
        this.h = r2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        q2 q2Var = r2Var.d;
        q2Var.setScalingType(scalingType);
        r2Var.T = 1;
        r2Var.V = true;
        q2Var.setAlpha(0.0f);
        q2Var.setRotateTextureWithScreen(true);
        q2Var.setUseCameraRotation(true);
        addView(r2Var, e6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(false));
        kVar.setBackgroundColor(0);
        kVar.C(f6.w0(null, f6.hg, false), false);
        kVar.setOccupyStatusBar(true);
        kVar.setActionBarMenuOnItemClick(new tq(this, 9));
        addView(kVar);
        bh.e eVar = new bh.e(this, getContext());
        this.c = eVar;
        eVar.setMinWidth(AndroidUtilities.dp(64.0f));
        eVar.setTag(-1);
        eVar.setTextSize(1, 14.0f);
        int i9 = f6.ng;
        eVar.setTextColor(f6.w0(null, i9, false));
        eVar.setGravity(17);
        eVar.setTypeface(AndroidUtilities.bold());
        eVar.setText(LocaleController.getString(R.string.VoipShareVideo));
        if (Build.VERSION.SDK_INT >= 23) {
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(f6.w0(null, i9, false), 76);
            eVar.setForeground(f6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        eVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        eVar.setOnClickListener(new x8(this, 13));
        addView(eVar, e6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, e6.e(-2, 64, 80));
        int i10 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i10 >= textViewArr.length) {
                break;
            }
            textViewArr[i10] = new TextView(context);
            this.f[i10].setTextSize(1, 12.0f);
            this.f[i10].setTextColor(-1);
            this.f[i10].setTypeface(AndroidUtilities.bold());
            this.f[i10].setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            this.f[i10].setGravity(16);
            this.f[i10].setSingleLine(true);
            this.d.addView(this.f[i10], e6.n(-2, -1));
            if (i10 == 0 && this.y) {
                this.f[i10].setText(LocaleController.getString(R.string.VoipPhoneScreen));
            } else if (i10 == 0 || (i10 == 1 && this.y)) {
                this.f[i10].setText(LocaleController.getString(R.string.VoipFrontCamera));
            } else {
                this.f[i10].setText(LocaleController.getString(R.string.VoipBackCamera));
            }
            this.f[i10].setOnClickListener(new gh.z0(this, i10, 14));
            i10++;
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
        pi0 pi0Var = new pi0(context);
        this.e = pi0Var;
        pi0Var.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f));
        pi0Var.setBackground(f6.K(AndroidUtilities.dp(48.0f), i0.a.k(-16777216, 76)));
        mi0 mi0Var = new mi0(R.raw.voice_mini, "" + R.raw.voice_mini, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null);
        pi0Var.setAnimation(mi0Var);
        pi0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.v = true;
        mi0Var.K(69);
        pi0Var.setOnClickListener(new vh0(11, this, mi0Var));
        addView(pi0Var, e6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(u0 u0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (u0Var.n == u0Var.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i9 = u0Var.n;
        if ((i9 == 1 && !isFrontFaceCamera) || (i9 == 2 && isFrontFaceCamera)) {
            u0Var.c();
            u0Var.s = false;
            VoIPService.getSharedInstance().switchCamera();
            u0Var.h.setAlpha(0.0f);
        }
        u0Var.r = u0Var.n;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        o50 o50Var = ((a40) this).A;
        boolean z12 = o50Var.v0.v;
        o50Var.v0 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            o50Var.N1(true, false);
            o50Var.W0.sortParticipants();
            o50Var.O0(true);
            o50Var.e.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(AndroidUtilities.dp(32.0f)).setDuration(150L).setListener(new y11(this, 10));
        invalidate();
    }

    public final void c() {
        r2 r2Var = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = r2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), r2Var.d.getMatrix(), true);
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
        int i9 = this.x;
        TextView[] textViewArr = this.f;
        TextView textView = textViewArr[i9];
        TextView textView2 = i9 < textViewArr.length + (-1) ? textViewArr[i9 + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.w;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = this.x;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.w;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.w;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        this.d.setTranslationX(measuredWidth2);
        this.c.invalidate();
        boolean z10 = this.y;
        r2 r2Var = this.h;
        if (z10 && this.x == 0 && this.w <= 0.0f) {
            r2Var.setVisibility(4);
            return;
        }
        r2Var.setVisibility(0);
        if (this.x + (!z10 ? 1 : 0) == this.n) {
            r2Var.setTranslationX((-this.w) * getMeasuredWidth());
        } else {
            r2Var.setTranslationX((1.0f - this.w) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.k(f6.w0(null, f6.gg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10 = View.MeasureSpec.getSize(i9) > View.MeasureSpec.getSize(i10);
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
        pi0 pi0Var = this.e;
        if (pi0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) pi0Var.getLayoutParams();
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
        super.onMeasure(i9, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i9, int i10) {
        org.telegram.messenger.voip.u0.d(this, i9, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.u0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i9) {
        org.telegram.messenger.voip.u0.f(this, i9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i9) {
        org.telegram.messenger.voip.u0.g(this, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.u0.h(this, z10);
    }

    public void setBottomPadding(int i9) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = AndroidUtilities.dp(64.0f) + i9;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i9;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = AndroidUtilities.dp(136.0f) + i9;
    }
}
