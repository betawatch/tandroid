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
import bi.j6;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.ar;
import org.telegram.ui.b50;
import org.telegram.ui.s30;
import org.telegram.ui.s9;
import org.webrtc.RendererCommon;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class e0 extends FrameLayout implements VoIPService.StateListener {
    public final boolean D;
    public boolean a;
    public final z4.g b;
    public final j6 c;
    public final LinearLayout d;
    public final ei0 e;
    public final TextView[] f;
    public final y1 h;
    public int n;
    public int r;
    public boolean s;
    public boolean w;
    public float x;
    public int y;

    public e0(Context context, boolean z10) {
        super(context);
        this.n = 1;
        this.r = 1;
        this.D = z10;
        int i10 = 2;
        this.f = new TextView[z10 ? 3 : 2];
        z4.g gVar = new z4.g(context);
        this.b = gVar;
        org.telegram.messenger.i0.B3(gVar, 2130706432);
        gVar.setAdapter(new kg.e1(this, i10));
        gVar.setPageMargin(0);
        gVar.setOffscreenPageLimit(1);
        addView(gVar, b6.c(-1.0f, -1));
        gVar.b(new c0(this));
        y1 y1Var = new y1(context, false, false);
        this.h = y1Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
        x1 x1Var = y1Var.d;
        x1Var.setScalingType(scalingType);
        y1Var.a0 = 1;
        y1Var.c0 = true;
        x1Var.setAlpha(0.0f);
        x1Var.setRotateTextureWithScreen(true);
        x1Var.setUseCameraRotation(true);
        addView(y1Var, b6.c(-1.0f, -1));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, null);
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        lVar.setBackgroundColor(0);
        a7.m(lVar, 1, t6.Vg, null);
        lVar.setOccupyStatusBar(true);
        lVar.setActionBarMenuOnItemClick(new ar(this, 10));
        addView(lVar);
        j6 j6Var = new j6(this, getContext());
        this.c = j6Var;
        j6Var.setMinWidth(org.telegram.messenger.i0.L(64.0f));
        j6Var.setTag(-1);
        j6Var.setTextSize(1, 14.0f);
        int i11 = t6.bh;
        a7.V(j6Var, i11, null);
        j6Var.setGravity(17);
        j6Var.setTypeface(org.telegram.messenger.i0.o());
        j6Var.setText(cd.L0(2131743266, null));
        int L = org.telegram.messenger.i0.L(6.0f);
        int o10 = i0.b.o(t6.x0(null, i11, false), 76);
        j6Var.setForeground(t6.k0(L, L, L, L, 0, o10, o10));
        j6Var.setPadding(0, org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f));
        j6Var.setOnClickListener(new ag.g(this, 21));
        addView(j6Var, b6.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        addView(linearLayout, b6.e(-2, 64, 80));
        int i12 = 0;
        while (true) {
            TextView[] textViewArr = this.f;
            if (i12 >= textViewArr.length) {
                break;
            }
            textViewArr[i12] = new TextView(context);
            this.f[i12].setTextSize(1, 12.0f);
            this.f[i12].setTextColor(-1);
            this.f[i12].setTypeface(org.telegram.messenger.i0.o());
            this.f[i12].setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
            this.f[i12].setGravity(16);
            this.f[i12].setSingleLine(true);
            this.d.addView(this.f[i12], b6.o(-2, -1));
            if (i12 == 0 && this.D) {
                this.f[i12].setText(cd.L0(2131743285, null));
            } else if (i12 == 0 || (i12 == 1 && this.D)) {
                this.f[i12].setText(cd.L0(2131743431, null));
            } else {
                this.f[i12].setText(cd.L0(2131743519, null));
            }
            this.f[i12].setOnClickListener(new bh.f(this, i12, 15));
            i12++;
        }
        setAlpha(0.0f);
        setTranslationX(org.telegram.messenger.i0.L(32.0f));
        animate().alpha(1.0f).translationX(0.0f).setDuration(150L).start();
        setWillNotDraw(false);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            this.h.d.setMirror(sharedInstance.isFrontFaceCamera());
            this.h.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new d0());
            sharedInstance.setLocalSink(this.h.d, false);
        }
        this.b.setCurrentItem(this.D ? 1 : 0);
        ei0 ei0Var = new ei0(context);
        this.e = ei0Var;
        ei0Var.setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f));
        ei0Var.setBackground(t6.L(org.telegram.messenger.i0.L(48.0f), i0.b.o(-16777216, 76)));
        bi0 bi0Var = new bi0(R.raw.voice_mini, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f), true, null);
        ei0Var.setAnimation(bi0Var);
        ei0Var.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.w = true;
        bi0Var.M(69);
        ei0Var.setOnClickListener(new sr(25, this, bi0Var));
        addView(ei0Var, b6.d(48, 48.0f, 83, 24.0f, 0.0f, 0.0f, 136.0f));
    }

    public static void a(e0 e0Var) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (e0Var.n == e0Var.r || sharedInstance == null) {
            return;
        }
        boolean isFrontFaceCamera = sharedInstance.isFrontFaceCamera();
        int i10 = e0Var.n;
        if ((i10 == 1 && !isFrontFaceCamera) || (i10 == 2 && isFrontFaceCamera)) {
            e0Var.c();
            e0Var.s = false;
            VoIPService.getSharedInstance().switchCamera();
            e0Var.h.setAlpha(0.0f);
        }
        e0Var.r = e0Var.n;
    }

    public final void b(boolean z10, boolean z11) {
        if (this.a) {
            return;
        }
        this.a = true;
        c();
        b50 b50Var = ((s30) this).E;
        boolean z12 = b50Var.q2.w;
        b50Var.q2 = null;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (z11) {
            if (sharedInstance != null) {
                sharedInstance.setupCaptureDevice(z10, z12);
            }
            if (z10 && sharedInstance != null) {
                sharedInstance.setVideoState(false, 0);
            }
            b50Var.Q1(true, false);
            b50Var.R2.z();
            b50Var.Q0(true);
            b50Var.l1.requestLayout();
        } else if (sharedInstance != null) {
            sharedInstance.setVideoState(false, 0);
        }
        animate().alpha(0.0f).translationX(org.telegram.messenger.i0.L(32.0f)).setDuration(150L).setListener(new s9(this, 23));
        invalidate();
    }

    public final void c() {
        y1 y1Var = this.h;
        if (this.s) {
            try {
                Bitmap bitmap = y1Var.d.getBitmap();
                if (bitmap != null) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), y1Var.d.getMatrix(), true);
                    bitmap.recycle();
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                    if (createScaledBitmap != null) {
                        if (createScaledBitmap != createBitmap) {
                            createBitmap.recycle();
                        }
                        Utilities.blurBitmap(createScaledBitmap, 7);
                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(new File(org.telegram.messenger.w0.h(), "cthumb" + this.r + ".jpg")));
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
        int i10 = this.y;
        TextView[] textViewArr = this.f;
        TextView textView = textViewArr[i10];
        TextView textView2 = i10 < textViewArr.length + (-1) ? textViewArr[i10 + 1] : null;
        getMeasuredWidth();
        float measuredWidth = (textView.getMeasuredWidth() / 2) + textView.getLeft();
        float measuredWidth2 = (getMeasuredWidth() / 2) - measuredWidth;
        if (textView2 != null) {
            measuredWidth2 -= (((textView2.getMeasuredWidth() / 2) + textView2.getLeft()) - measuredWidth) * this.x;
        }
        for (int i11 = 0; i11 < textViewArr.length; i11++) {
            int i12 = this.y;
            float f7 = 0.9f;
            float f10 = 0.7f;
            if (i11 >= i12 && i11 <= i12 + 1) {
                if (i11 == i12) {
                    float f11 = this.x;
                    f10 = 1.0f - (0.3f * f11);
                    f7 = 1.0f - (f11 * 0.1f);
                } else {
                    float f12 = this.x;
                    f10 = 0.7f + (0.3f * f12);
                    f7 = 0.9f + (f12 * 0.1f);
                }
            }
            textViewArr[i11].setAlpha(f10);
            textViewArr[i11].setScaleX(f7);
            textViewArr[i11].setScaleY(f7);
        }
        this.d.setTranslationX(measuredWidth2);
        this.c.invalidate();
        boolean z10 = this.D;
        y1 y1Var = this.h;
        if (z10 && this.y == 0 && this.x <= 0.0f) {
            y1Var.setVisibility(4);
            return;
        }
        y1Var.setVisibility(0);
        if (this.y + (!z10 ? 1 : 0) == this.n) {
            y1Var.setTranslationX((-this.x) * getMeasuredWidth());
        } else {
            y1Var.setTranslationX((1.0f - this.x) * getMeasuredWidth());
        }
    }

    public int getBackgroundColor() {
        return i0.b.o(t6.x0(null, t6.Ug, false), (int) (getAlpha() * 1.0f * 255.0f));
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
        org.telegram.messenger.voip.y0.a(this);
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
            int L = org.telegram.messenger.i0.L(80.0f);
            marginLayoutParams.leftMargin = L;
            marginLayoutParams.rightMargin = L;
        } else {
            int L2 = org.telegram.messenger.i0.L(16.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
        }
        ei0 ei0Var = this.e;
        if (ei0Var != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ei0Var.getLayoutParams();
            if (z10) {
                int L3 = org.telegram.messenger.i0.L(88.0f);
                marginLayoutParams2.leftMargin = L3;
                marginLayoutParams2.rightMargin = L3;
            } else {
                int L4 = org.telegram.messenger.i0.L(24.0f);
                marginLayoutParams2.leftMargin = L4;
                marginLayoutParams2.rightMargin = L4;
            }
        }
        super.onMeasure(i10, i11);
        measureChildWithMargins(this.d, View.MeasureSpec.makeMeasureSpec(0, 0), 0, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f), TLObject.FLAG_30), 0);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onMediaStateUpdated(int i10, int i11) {
        org.telegram.messenger.voip.y0.d(this, i10, i11);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onScreenOnChange(boolean z10) {
        org.telegram.messenger.voip.y0.e(this, z10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onSignalBarsCountChanged(int i10) {
        org.telegram.messenger.voip.y0.f(this, i10);
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onStateChanged(int i10) {
        org.telegram.messenger.voip.y0.g(this, i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.messenger.voip.VoIPService.StateListener
    public final /* synthetic */ void onVideoAvailableChange(boolean z10) {
        org.telegram.messenger.voip.y0.h(this, z10);
    }

    public void setBottomPadding(int i10) {
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(64.0f) + i10;
        ((FrameLayout.LayoutParams) this.d.getLayoutParams()).bottomMargin = i10;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).bottomMargin = org.telegram.messenger.i0.L(136.0f) + i10;
    }
}
