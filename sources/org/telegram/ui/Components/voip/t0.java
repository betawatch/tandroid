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
import c8.ha;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a20;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.f40;
import org.telegram.ui.va;
import org.telegram.ui.w20;
import org.telegram.ui.w9;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class t0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean D;
    public boolean a;
    public final c5.k b;
    public final ei.k c;
    public final LinearLayout d;
    public final ch0 e;
    public final TextView[] f;
    public final k2 h;
    public int n;
    public int r;
    public boolean s;
    public boolean w;
    public float x;
    public int y;

    public t0(Context context, boolean z9) {
        super(context);
        int i7 = 1;
        this.n = 1;
        this.r = 1;
        this.D = z9;
        int i10 = 2;
        this.f = new TextView[z9 ? 3 : 2];
        c5.k kVar = new c5.k(context);
        this.b = kVar;
        org.telegram.messenger.g0.C3(kVar, 2130706432);
        kVar.setAdapter(new a20(this, i7));
        kVar.setPageMargin(0);
        kVar.setOffscreenPageLimit(1);
        addView(kVar, ha.c(-1.0f, -1));
        kVar.b(new r0(this));
        k2 k2Var = new k2(context, false, false);
        this.h = k2Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        j2 j2Var = k2Var.d;
        j2Var.setScalingType(scalingType);
        k2Var.a0 = 1;
        k2Var.c0 = true;
        j2Var.setAlpha(0.0f);
        j2Var.setRotateTextureWithScreen(true);
        j2Var.setUseCameraRotation(true);
        addView(k2Var, ha.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        lVar.setBackgroundColor(0);
        t6.l(lVar, 1, m6.Vg, null);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new w9(this, 19));
        addView(lVar);
        ei.k kVar2 = new ei.k(this, getContext());
        this.c = kVar2;
        kVar2.setMinWidth(org.telegram.messenger.g0.L(64.0f));
        kVar2.setTag(-1);
        kVar2.setTextSize(1, 14.0f);
        int i11 = m6.bh;
        t6.U(kVar2, i11, null);
        kVar2.setGravity(17);
        kVar2.setTypeface(org.telegram.messenger.g0.o());
        kVar2.setText(id.M0(2131743240, null));
        int L = org.telegram.messenger.g0.L(6.0f);
        int o4 = i0.a.o(m6.x0(null, i11, false), 76);
        kVar2.setForeground(m6.k0(L, L, L, L, 0, o4, o4));
        kVar2.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
        kVar2.setOnClickListener(new ii.g(this, 18));
        addView(kVar2, ha.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, ha.e(-2, 64, 80));
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
            this.d.addView(this.f[i12], ha.o(-2, -1));
            if (i12 == 0 && this.D) {
                this.f[i12].setText(id.M0(2131743259, null));
            } else if (i12 == 0 || (i12 == 1 && this.D)) {
                this.f[i12].setText(id.M0(2131743405, null));
            } else {
                this.f[i12].setText(id.M0(2131743493, null));
            }
            this.f[i12].setOnClickListener(new ai.v(this, i12, 20));
            i12++;
        }
        setAlpha(0.0f);
        setTranslationX(org.telegram.messenger.g0.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new s0());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.D ? 1 : 0);
        ch0 ch0Var = new ch0(context);
        this.e = ch0Var;
        ch0Var.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f));
        ch0Var.setBackground(m6.L(org.telegram.messenger.g0.L(48.0f), i0.a.o(-16777216, 76)));
        zg0 zg0Var = new zg0(R.raw.voice_mini, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f), true, null);
        ch0Var.setAnimation(zg0Var);
        ch0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.w = true;
        zg0Var.M(69);
        ch0Var.setOnClickListener(new u41(i10, this, zg0Var));
        addView(ch0Var, ha.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(t0 t0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (t0Var.n == t0Var.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i7 = t0Var.n;
        if ((i7 == 1 && !isFrontFaceCamera) || (i7 == 2 && isFrontFaceCamera)) {
            t0Var.c();
            t0Var.s = false;
            VoIPService.getSharedInstance().switchCamera();
            t0Var.h.setAlpha(0.0f);
        }
        t0Var.r = t0Var.n;
    }

    public final void b(boolean z9, boolean z10) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        f40 f40Var = ((w20) this).E;
        boolean z11 = f40Var.t2.w;
        f40Var.t2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z10) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z9, z11);
            }
            if (z9 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            f40Var.T1(true, false);
            f40Var.U2.z();
            f40Var.Q0(true);
            f40Var.o1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.g0.L(32.0f)).setDuration(150L).setListener(new va(this, 12));
        invalidate();
    }

    public final void c() {
        k2 k2Var = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = k2Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), k2Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(org.telegram.messenger.t0.h(), "cthumb" + this.r + ".jpg")));
                        View findViewWithTag = this.b.findViewWithTag(Integer.valueOf(this.r - (1 ^ (this.D ? 1 : 0))));
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
        boolean z9 = this.D;
        k2 k2Var = this.h;
        if (z9 && this.y == 0 && this.x <= 0.0f) {
            k2Var.setVisibility(4);
            return;
        }
        k2Var.setVisibility(0);
        if (this.y + (!z9 ? 1 : 0) == this.n) {
            k2Var.setTranslationX((-this.x) * getMeasuredWidth());
        } else {
            k2Var.setTranslationX((1.0f - this.x) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.a.o(m6.x0(null, m6.Ug, false), (int) (getAlpha() * 1.0f * 255.0f));
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
    public final void onCameraSwitch(boolean z9) {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        d();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
        if (z9) {
            int L = org.telegram.messenger.g0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.g0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        ch0 ch0Var = this.e;
        if (ch0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ch0Var.getLayoutParams();
            if (z9) {
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
        org.telegram.messenger.voip.s0.d(this, i7, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z9) {
        org.telegram.messenger.voip.s0.e(this, z9);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i7) {
        org.telegram.messenger.voip.s0.f(this, i7);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i7) {
        org.telegram.messenger.voip.s0.g(this, i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z9) {
        org.telegram.messenger.voip.s0.h(this, z9);
    }

    public void setBottomPadding(int i7) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(64.0f) + i7;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i7;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(136.0f) + i7;
    }
}
