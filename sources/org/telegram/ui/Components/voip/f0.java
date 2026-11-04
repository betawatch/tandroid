package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w10;
import org.telegram.ui.o20;
import org.telegram.ui.o9;
import org.telegram.ui.x30;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class f0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean E;
    public boolean a;
    public final b5.l b;
    public final fi.j c;
    public final LinearLayout d;
    public final fh0 e;
    public final TextView[] f;
    public final z1 h;
    public int n;
    public int r;
    public boolean s;
    public boolean w;
    public float x;
    public int y;

    public f0(Context context, boolean z10) {
        super(context);
        int i3 = 1;
        this.n = 1;
        this.r = 1;
        this.E = z10;
        this.f = new TextView[z10 ? 3 : 2];
        b5.l lVar = new b5.l(context);
        this.b = lVar;
        org.telegram.messenger.g0.C3(lVar, 2130706432);
        lVar.setAdapter(new w10(this, i3));
        lVar.setPageMargin(0);
        lVar.setOffscreenPageLimit(1);
        addView(lVar, mf.c(-1.0f, -1));
        lVar.b(new d0(this));
        z1 z1Var = new z1(context, false, false);
        this.h = z1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        y1 y1Var = z1Var.d;
        y1Var.setScalingType(scalingType);
        z1Var.b0 = 1;
        z1Var.d0 = true;
        y1Var.setAlpha(0.0f);
        y1Var.setRotateTextureWithScreen(true);
        y1Var.setUseCameraRotation(true);
        addView(z1Var, mf.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        kVar.setBackgroundColor(0);
        r6.m(kVar, 1, k6.Vg, null);
        kVar.setOccupyStatusBar(true);
        int i10 = 20;
        kVar.setActionBarMenuOnItemClick(new o9(this, i10));
        addView(kVar);
        fi.j jVar = new fi.j(this, getContext());
        this.c = jVar;
        jVar.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        jVar.setTag(-1);
        jVar.setTextSize(1, 14.0f);
        int i11 = k6.bh;
        r6.V(jVar, i11, null);
        jVar.setGravity(17);
        jVar.setTypeface(org.telegram.messenger.g0.o());
        jVar.setText(bd.M0(2131743250, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o10 = i0.a.o(k6.x0(null, i11, false), 76);
        jVar.setForeground(k6.k0(L, L, L, L, 0, o10, o10));
        jVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        jVar.setOnClickListener(new ii.m(this, 21));
        addView(jVar, mf.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, mf.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f[i12].setTextSize(1, 12.0f);
            this.f[i12].setTextColor(-1);
            this.f[i12].setTypeface(org.telegram.messenger.g0.o());
            this.f[i12].setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            this.f[i12].setGravity(16);
            this.f[i12].setSingleLine(true);
            this.d.addView(this.f[i12], mf.o(-2, -1));
            if (i12 == 0 && this.E) {
                this.f[i12].setText(bd.M0(2131743269, null));
            } else if (i12 == 0 || (i12 == 1 && this.E)) {
                this.f[i12].setText(bd.M0(2131743415, null));
            } else {
                this.f[i12].setText(bd.M0(2131743503, null));
            }
            this.f[i12].setOnClickListener(new bi.q(this, i12, i10));
            i12++;
        }
        setAlpha(0.0f);
        setTranslationX(org.telegram.messenger.g0.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new e0());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.E ? 1 : 0);
        fh0 fh0Var = new fh0(context);
        this.e = fh0Var;
        fh0Var.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        fh0Var.setBackground(k6.L(org.telegram.messenger.g0.L(48.0f), i0.a.o(-16777216, 76)));
        ch0 ch0Var = new ch0(R.raw.voice_mini, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        fh0Var.setAnimation(ch0Var);
        fh0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.w = true;
        ch0Var.M(69);
        fh0Var.setOnClickListener(new ux0(8, (Object) this, (Object) ch0Var));
        addView(fh0Var, mf.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(f0 f0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (f0Var.n == f0Var.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i3 = f0Var.n;
        if ((i3 == 1 && !isFrontFaceCamera) || (i3 == 2 && isFrontFaceCamera)) {
            f0Var.c();
            f0Var.s = false;
            VoIPService.getSharedInstance().switchCamera();
            f0Var.h.setAlpha(0.0f);
        }
        f0Var.r = f0Var.n;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        x30 x30Var = ((o20) this).F;
        boolean z12 = x30Var.r2.w;
        x30Var.r2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            x30Var.Q1(true, false);
            x30Var.S2.z();
            x30Var.Q0(true);
            x30Var.m1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(32.0f)).setDuration(150L).setListener(new w9(this, 12));
        invalidate();
    }

    public final void c() {
        z1 z1Var = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = z1Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), z1Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb" + this.r + ".jpg")));
                        View findViewWithTag = this.b.findViewWithTag(Integer.valueOf(this.r - (1 ^ (this.E ? 1 : 0))));
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
        int i3 = this.y;
        TextView[] textViewArr = this.f;
        TextView textView = textViewArr[i3];
        TextView textView2 = i3 < textViewArr.length + (-1) ? textViewArr[i3 + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.x;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = this.y;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = this.x;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = this.x;
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
        boolean z10 = this.E;
        z1 z1Var = this.h;
        if (z10 && this.y == 0 && this.x <= 0.0f) {
            z1Var.setVisibility(4);
            return;
        }
        z1Var.setVisibility(0);
        if (this.y + (!z10 ? 1 : 0) == this.n) {
            z1Var.setTranslationX((-this.x) * getMeasuredWidth());
        } else {
            z1Var.setTranslationX((1.0f - this.x) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.o(k6.x0(null, k6.Ug, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.s0.a(this);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10 = View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        if (z10) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        fh0 fh0Var = this.e;
        if (fh0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fh0Var.getLayoutParams();
            if (z10) {
                int L3 = org.telegram.messenger.g0.L(88.0f);
                marginLayoutParams2.leftMargin = L3;
                marginLayoutParams2.rightMargin = L3;
            } else {
                int L4 = org.telegram.messenger.g0.L(24.0f);
                marginLayoutParams2.leftMargin = L4;
                marginLayoutParams2.rightMargin = L4;
            }
        }
        super.onMeasure(i3, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i3, int i10) {
        org.telegram.messenger.voip.s0.d(this, i3, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.s0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i3) {
        org.telegram.messenger.voip.s0.f(this, i3);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i3) {
        org.telegram.messenger.voip.s0.g(this, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.s0.h(this, z10);
    }

    public void setBottomPadding(int i3) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f) + i3;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i3;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(136.0f) + i3;
    }
}
