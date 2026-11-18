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
import c8.ma;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Components.c31;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.f40;
import org.telegram.ui.w20;
import org.telegram.ui.x7;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class w0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean E;
    public boolean a;
    public final c5.l b;
    public final gi.j c;
    public final LinearLayout d;
    public final ph0 e;
    public final TextView[] f;
    public final n2 h;
    public int n;
    public int r;
    public boolean s;
    public boolean w;
    public float x;
    public int y;

    public w0(Context context, boolean z10) {
        super(context);
        int i7 = 1;
        this.n = 1;
        this.r = 1;
        this.E = z10;
        this.f = new TextView[z10 ? 3 : 2];
        c5.l lVar = new c5.l(context);
        this.b = lVar;
        org.telegram.messenger.g0.A3(lVar, 2130706432);
        lVar.setAdapter(new k20(this, i7));
        lVar.setPageMargin(0);
        lVar.setOffscreenPageLimit(1);
        addView(lVar, ma.c(-1.0f, -1));
        lVar.b(new u0(this));
        n2 n2Var = new n2(context, false, false);
        this.h = n2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        m2 m2Var = n2Var.d;
        m2Var.setScalingType(scalingType);
        n2Var.b0 = 1;
        n2Var.d0 = true;
        m2Var.setAlpha(0.0f);
        m2Var.setRotateTextureWithScreen(true);
        m2Var.setUseCameraRotation(true);
        addView(n2Var, ma.c(-1.0f, -1));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, null);
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        kVar.setBackgroundColor(0);
        u6.l(kVar, 1, n6.Yg, null);
        kVar.setOccupyStatusBar(true);
        int i10 = 22;
        kVar.setActionBarMenuOnItemClick(new x7(this, i10));
        addView(kVar);
        gi.j jVar = new gi.j(this, getContext());
        this.c = jVar;
        jVar.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        jVar.setTag(-1);
        jVar.setTextSize(1, 14.0f);
        int i11 = n6.eh;
        u6.U(jVar, i11, null);
        jVar.setGravity(17);
        jVar.setTypeface(org.telegram.messenger.g0.o());
        jVar.setText(gd.M0(2131743003, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(n6.x0(null, i11, false), 76);
        jVar.setForeground(n6.k0(L, L, L, L, 0, o4, o4));
        jVar.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        jVar.setOnClickListener(new hi.o0(this, 26));
        addView(jVar, ma.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, ma.e(-2, 64, 80));
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
            this.d.addView(this.f[i12], ma.o(-2, -1));
            if (i12 == 0 && this.E) {
                this.f[i12].setText(gd.M0(2131743022, null));
            } else if (i12 == 0 || (i12 == 1 && this.E)) {
                this.f[i12].setText(gd.M0(2131743168, null));
            } else {
                this.f[i12].setText(gd.M0(2131743256, null));
            }
            this.f[i12].setOnClickListener(new ci.q(this, i12, i10));
            i12++;
        }
        setAlpha(0.0f);
        setTranslationX(org.telegram.messenger.g0.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new v0());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.E ? 1 : 0);
        ph0 ph0Var = new ph0(context);
        this.e = ph0Var;
        ph0Var.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        ph0Var.setBackground(n6.L(org.telegram.messenger.g0.L(48.0f), i0.a.o(-16777216, 76)));
        mh0 mh0Var = new mh0(R.raw.voice_mini, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        ph0Var.setAnimation(mh0Var);
        ph0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.w = true;
        mh0Var.M(69);
        ph0Var.setOnClickListener(new c31(6, this, mh0Var));
        addView(ph0Var, ma.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(w0 w0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (w0Var.n == w0Var.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i7 = w0Var.n;
        if ((i7 == 1 && !isFrontFaceCamera) || (i7 == 2 && isFrontFaceCamera)) {
            w0Var.c();
            w0Var.s = false;
            VoIPService.getSharedInstance().switchCamera();
            w0Var.h.setAlpha(0.0f);
        }
        w0Var.r = w0Var.n;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        f40 f40Var = ((w20) this).F;
        boolean z12 = f40Var.u2.w;
        f40Var.u2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            f40Var.W1(true, false);
            f40Var.V2.z();
            f40Var.R0(true);
            f40Var.p1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(32.0f)).setDuration(150L).setListener(new y9(this, 13));
        invalidate();
    }

    public final void c() {
        n2 n2Var = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = n2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), n2Var.d.getMatrix(), true);
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
        int i7 = this.y;
        TextView[] textViewArr = this.f;
        TextView textView = textViewArr[i7];
        TextView textView2 = i7 < textViewArr.length + (-1) ? textViewArr[i7 + 1] : null;
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
        n2 n2Var = this.h;
        if (z10 && this.y == 0 && this.x <= 0.0f) {
            n2Var.setVisibility(4);
            return;
        }
        n2Var.setVisibility(0);
        if (this.y + (!z10 ? 1 : 0) == this.n) {
            n2Var.setTranslationX((-this.x) * getMeasuredWidth());
        } else {
            n2Var.setTranslationX((1.0f - this.x) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.o(n6.x0(null, n6.Xg, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.t0.a(this);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z10 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
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
        ph0 ph0Var = this.e;
        if (ph0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ph0Var.getLayoutParams();
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
        super.onMeasure(i7, i10);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i7, int i10) {
        org.telegram.messenger.voip.t0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.t0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.t0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i7) {
        org.telegram.messenger.voip.t0.g(this, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.t0.h(this, z10);
    }

    public void setBottomPadding(int i7) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(136.0f) + i7;
    }
}
