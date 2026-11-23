package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import di.gc;
import di.p6;
import hi.z4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.za0;
import org.telegram.ui.a20;
import org.telegram.ui.e40;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z extends FrameLayout implements n0 {
    public boolean A0;
    public final t B0;
    public final Rect C0;
    public p6 D0;
    public final Paint E;
    public int E0;
    public boolean F;
    public int F0;
    public final t3 G;
    public int G0;
    public final e40 H;
    public ValueAnimator H0;
    public boolean I;
    public int I0;
    public float J;
    public int J0;
    public final FrameLayout K;
    public ValueAnimator K0;
    public final int L;
    public boolean L0;
    public final n5 M;
    public int N;
    public final org.telegram.ui.ActionBar.n2 O;
    public final TextView P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public float T;
    public final Paint U;
    public final qh0 V;
    public final ImageView W;
    public final v a;
    public boolean a0;
    public boolean b;
    public float b0;
    public s c;
    public final y c0;
    public s10 d;
    public ValueAnimator d0;
    public s e;
    public boolean e0;
    public boolean f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public float i0;
    public float j0;
    public boolean k0;
    public float l0;
    public final ImageReceiver m0;
    public boolean n;
    public final ArrayList n0;
    public o0 o0;
    public boolean p0;
    public float q0;
    public boolean r;
    public Bitmap r0;
    public boolean s;
    public Paint s0;
    public boolean t0;
    public float u0;
    public final hr v0;
    public boolean w;
    public final Drawable w0;
    public u3 x;
    public float x0;
    public final l0 y;
    public ImageView y0;
    public boolean z0;

    public z(l0 l0Var, t3 t3Var, e40 e40Var) {
        super(l0Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.U = paint;
        this.b0 = 1.0f;
        this.m0 = new ImageReceiver(null);
        this.n0 = new ArrayList();
        this.B0 = new t(this, 1);
        this.C0 = new Rect();
        this.G = t3Var;
        int i7 = e40Var.a;
        this.L = i7;
        hr hrVar = new hr(l0Var.getContext(), R.drawable.calls_video, -1);
        this.v0 = hrVar;
        hrVar.a(true, false);
        float f10 = -org.telegram.messenger.g0.L(4.0f);
        float L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(6.0f);
        hrVar.i = f10;
        hrVar.j = L;
        hrVar.k = L2;
        hrVar.invalidateSelf();
        float N = org.telegram.messenger.g0.N(3.4f);
        hrVar.c.setStrokeWidth(N);
        hrVar.d.setStrokeWidth(N * 1.47f);
        this.w0 = l0Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint2.setColor(-1);
        String N0 = gd.N0(2131742974, null);
        String N02 = gd.N0(2131742971, null);
        int L3 = org.telegram.messenger.g0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(N02, textPaint, L3, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(t3Var.c));
        StaticLayout staticLayout2 = new StaticLayout(gd.a0("VoipVideoNotAvailable", null, 2131742976, gd.G(mp.u1(i7).c4, "Participants", new Object[0])), textPaint, org.telegram.messenger.g0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String N03 = gd.N0(2131742972, null);
        v vVar = new v(this, l0Var.getContext(), t3Var, l0Var, textPaint, staticLayout2, textPaint2, N03, textPaint2.measureText(N03), staticLayout, e40Var, N0, textPaint.measureText(N0));
        this.a = vVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        n2 n2Var = vVar.d;
        n2Var.setScalingType(scalingType);
        this.y = l0Var;
        this.H = e40Var;
        n2Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new w(this));
        TextureView textureView = vVar.e;
        if (textureView != null) {
            n2Var.setBackgroundRenderer(textureView);
            if (!n2Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        n2Var.setAlpha(0.0f);
        addView(vVar);
        y yVar = new y(this, getContext());
        this.c0 = yVar;
        addView(yVar);
        n5 n5Var = new n5(l0Var.getContext());
        this.M = n5Var;
        n5Var.setTextSize(13);
        n5Var.setTextColor(i0.a.o(-1, 229));
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setFullTextMaxLines(1);
        n5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(n5Var, na.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, na.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setColor(n6.x0(null, n6.hh, false));
        frameLayout.setClipChildren(false);
        qh0 qh0Var = new qh0(l0Var.getContext());
        this.V = qh0Var;
        addView(qh0Var, na.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(l0Var.getContext());
        this.W = imageView;
        addView(imageView, na.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        imageView.setImageDrawable(l0Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L4 = org.telegram.messenger.g0.L(19.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = n6.k0(L4, L4, L4, L4, 0, o4, o4);
        org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2(4, l0Var.getContext(), this);
        this.O = n2Var2;
        n2Var2.setText(gd.N0(2131742970, null));
        n2Var2.setTextSize(1, 15.0f);
        n2Var2.setTypeface(org.telegram.messenger.g0.o());
        n2Var2.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        n2Var2.setTextColor(-1);
        n2Var2.setBackground(k02);
        n2Var2.setGravity(17);
        n2Var2.setOnClickListener(new z4(this, 24));
        addView(n2Var2, na.e(-2, 38, 51));
        TextView textView = new TextView(l0Var.getContext());
        this.P = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
        u6.U(textView, n6.fh, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (v3.w(14, O0)) {
            textView.setText(org.telegram.messenger.g0.W2(gd.N0(2131747970, null)));
        } else {
            org.telegram.messenger.f3.q("NoRtmpStreamFromAppViewer", null, 2131747969, new Object[]{O0.title}, textView);
        }
        addView(textView, na.e(-2, -2, 51));
    }

    public static z c(ArrayList arrayList, a20 a20Var, s sVar, s10 s10Var, s sVar2, u3 u3Var, t3 t3Var, e40 e40Var) {
        z zVar;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                zVar = null;
                break;
            }
            if (u3Var.equals(((z) arrayList.get(i7)).x)) {
                zVar = (z) arrayList.get(i7);
                break;
            }
            i7++;
        }
        if (zVar == null) {
            zVar = new z(a20Var, t3Var, e40Var);
        }
        if (sVar != null) {
            zVar.setPrimaryView(sVar);
        }
        if (s10Var != null) {
            zVar.setSecondaryView(s10Var);
        }
        if (sVar2 != null) {
            zVar.setTabletGridView(sVar2);
        }
        return zVar;
    }

    @Override // org.telegram.ui.Components.voip.n0
    public final void a() {
        invalidate();
        k(true);
        y yVar = this.c0;
        if (yVar.getVisibility() == 0) {
            y.a(yVar, true);
        }
    }

    public final void b(boolean z10) {
        this.Q = true;
        this.w = false;
        this.y.f(this);
        if (z10) {
            if (this.x.a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                u3 u3Var = this.x;
                sharedInstance.removeRemoteSink(u3Var.a, u3Var.b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.d0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.d0.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        if (this.r0 != null) {
            return;
        }
        HashMap hashMap = this.G.h;
        u3 u3Var = this.x;
        boolean z10 = u3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = u3Var.a;
        Bitmap bitmap = (Bitmap) hashMap.get(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.r0 = bitmap;
        this.a.setThumb(bitmap);
        if (this.r0 == null) {
            long B1 = fj.B1(this.x.a.peer);
            u3 u3Var2 = this.x;
            boolean z11 = u3Var2.a.self;
            ImageReceiver imageReceiver = this.m0;
            if (z11 && u3Var2.b) {
                imageReceiver.x0(new za0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i7 = this.L;
            if (B1 > 0) {
                TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(B1));
                fc l10 = fc.l(i7, 1, c22);
                int d = c22 != null ? a9.d(c22.id) : i0.a.f(0.2f, -16777216, -1);
                imageReceiver.r0(l10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d, -16777216), i0.a.f(0.4f, d, -16777216)}), null, c22, 0);
                return;
            }
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-B1));
            fc a10 = fc.a(1, O0);
            int d2 = O0 != null ? a9.d(O0.id) : i0.a.f(0.2f, -16777216, -1);
            imageReceiver.r0(a10, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, d2, -16777216), i0.a.f(0.4f, d2, -16777216)}), null, O0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.w;
        l0 l0Var = this.y;
        v vVar = this.a;
        if (z10) {
            float y10 = (vVar.getY() + vVar.getMeasuredHeight()) - vVar.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y10 - frameLayout.getMeasuredHeight()) + this.q0;
            boolean z11 = this.h;
            qh0 qh0Var = this.V;
            if (z11 || this.f) {
                frameLayout.setAlpha(1.0f - l0Var.n);
                qh0Var.setAlpha(1.0f - l0Var.n);
            } else if (this.b || this.r) {
                if (!e40.E5 && !e40.F5) {
                    measuredHeight = com.google.android.gms.internal.vision.e2.t(1.0f, l0Var.a0, org.telegram.messenger.g0.L(90.0f) * l0Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                qh0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - l0Var.c);
                qh0Var.setAlpha(1.0f - l0Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                qh0Var.setAlpha(1.0f);
            }
            boolean z12 = this.b;
            n5 n5Var = this.M;
            if (z12 || this.r) {
                n5Var.setFullAlpha(l0Var.c);
            } else {
                n5Var.setFullAlpha(0.0f);
            }
            qh0Var.setTranslationX(frameLayout.getX());
            qh0Var.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
            ImageView imageView = this.W;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((vVar.getMeasuredWidth() - (vVar.P * 2.0f)) - org.telegram.messenger.g0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.g0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - l0Var.c, 1.0f - l0Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.z0 ? 0.0f : org.telegram.messenger.g0.L(6.0f) * l0Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            o0 o0Var = this.o0;
            if (o0Var != null) {
                boolean z13 = o0Var.e;
                if (z13) {
                    float f10 = this.T;
                    if (f10 != 1.0f) {
                        float f11 = f10 + 0.053333335f;
                        this.T = f11;
                        if (f11 > 1.0f) {
                            this.T = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f12 = this.T;
                    if (f12 != 0.0f) {
                        float f13 = f12 - 0.053333335f;
                        this.T = f13;
                        if (f13 < 0.0f) {
                            this.T = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f14 = this.T;
            float f15 = (1.0f - l0Var.n) * (1.0f - l0Var.c) * f14;
            if (f14 > 0.0f) {
                int i7 = (int) (f15 * 255.0f);
                Paint paint = this.U;
                paint.setAlpha(i7);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(vVar.getX() + vVar.P, vVar.getY() + vVar.O, (vVar.getX() + vVar.getMeasuredWidth()) - vVar.P, (vVar.getY() + vVar.getMeasuredHeight()) - vVar.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.q0);
                float f16 = vVar.b;
                canvas.drawRoundRect(rectF, f16, f16, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (!this.p0 || (view != this.a && view != this.c0)) {
            return super.drawChild(canvas, view, j3);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.q0) / org.telegram.messenger.g0.L(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.q0);
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        o0 o0Var = this.o0;
        if (o0Var != null) {
            this.H.s4.add(o0Var);
            this.o0.b();
            o0 o0Var2 = this.o0;
            o0Var2.c = null;
            o0Var2.c(false);
        }
        this.o0 = null;
    }

    public final void f() {
        if (this.x != null) {
            v vVar = this.a;
            n2 n2Var = vVar.d;
            n2 n2Var2 = vVar.d;
            if (n2Var.getMeasuredHeight() == 0 || n2Var2.getMeasuredWidth() == 0) {
                return;
            }
            n2Var2.getRenderBufferBitmap(new org.telegram.tgnet.g(this, 9));
        }
    }

    public final void g(boolean z10, boolean z11) {
        if (this.n != z10) {
            this.n = z10;
            j(!(this.c == null && this.e == null) && z11);
        }
    }

    public String getName() {
        long B1 = fj.B1(this.x.a.peer);
        return org.telegram.messenger.n5.E(B1) ? n10.q(mp.u1(org.telegram.messenger.c.a(i10.t0).a).c2(Long.valueOf(B1))) : mp.u1(org.telegram.messenger.c.a(i10.t0).a).O0(Long.valueOf(-B1)).title;
    }

    public s getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.b != z10) {
            this.b = z10;
            this.S = true;
            j(z11);
        }
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        if (this.f0 == f10 && this.g0 == f11 && this.h0 == f12 && this.i0 == f13 && this.j0 == f14) {
            return;
        }
        this.k0 = z10;
        this.f0 = f10;
        this.g0 = f11;
        this.h0 = f12;
        this.i0 = f13;
        this.j0 = f14;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.R) {
            this.a.invalidate();
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.invalidate();
            e40 e40Var = this.H;
            if (e40Var.W4 == this.c) {
                e40Var.b.invalidate();
            }
        }
        s10 s10Var = this.d;
        if (s10Var != null) {
            s10Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x01d9, code lost:
    
        if (r2 != false) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x066e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0393  */
    /* JADX WARN: Type inference failed for: r6v18, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        boolean z11;
        boolean z12;
        u3 u3Var;
        u3 u3Var2;
        boolean z13;
        boolean z14;
        float f10;
        int i7;
        boolean z15;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        u3 u3Var3;
        boolean z16;
        n2 n2Var;
        boolean C;
        y yVar;
        long B1;
        fc a10;
        fc a11;
        TLRPC.Chat chat;
        boolean z17;
        Drawable C2;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z18;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        u3 u3Var4;
        s sVar;
        if (this.Q) {
            return;
        }
        t3 t3Var = this.G;
        int i10 = 0;
        if (t3Var.b.rtmp_stream) {
            int L = org.telegram.messenger.g0.L(this.b ? 36.0f : 21.0f);
            this.P.setPadding(L, 0, L, 0);
        }
        if (this.x == null && ((sVar = this.c) != null || this.d != null || this.e != null)) {
            if (sVar != null) {
                this.x = sVar.getParticipant();
            } else {
                s sVar2 = this.e;
                if (sVar2 != null) {
                    this.x = sVar2.getParticipant();
                } else {
                    this.x = this.d.getVideoParticipant();
                }
            }
        }
        boolean z19 = this.w;
        qh0 qh0Var = this.V;
        l0 l0Var = this.y;
        String str = null;
        v vVar = this.a;
        int i11 = 1;
        if (z19 && !this.b) {
            boolean z20 = VoIPService.getSharedInstance() == null;
            if (e40.H5 || (u3Var4 = this.x) == null || (this.d == null && (!t3.C(u3Var4.a, u3Var4.b, t3Var) || (!t3Var.x && this.x != t3Var.z)))) {
                z20 = true;
            }
            if (z20 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.w = false;
                f();
                boolean z21 = bz.o() <= 0;
                if (vVar.c0 == null && z20) {
                    if (z21) {
                        l0Var.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new androidx.fragment.app.g(this, this, z21, 9)).setDuration(150L).start();
                } else {
                    if (l0Var.s) {
                        p6 p6Var = this.D0;
                        if (p6Var != null) {
                            org.telegram.messenger.g0.r(p6Var);
                            this.D0 = null;
                        }
                        p6 p6Var2 = new p6(this, z21, this, 26);
                        this.D0 = p6Var2;
                        org.telegram.messenger.g0.g3(p6Var2);
                    } else {
                        if (z21) {
                            l0Var.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z21) {
                        l0Var.f(this);
                        e();
                    }
                }
                if (this.x.a.self) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    u3 u3Var5 = this.x;
                    sharedInstance.removeRemoteSink(u3Var5.a, u3Var5.b);
                }
                invalidate();
                ValueAnimator valueAnimator2 = this.d0;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.d0.cancel();
                }
            }
        } else if (!z19) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            s sVar3 = this.c;
            if (sVar3 != null || this.d != null || this.e != null || this.b) {
                if (sVar3 != null) {
                    this.x = sVar3.getParticipant();
                } else {
                    s10 s10Var = this.d;
                    if (s10Var != null) {
                        this.x = s10Var.getVideoParticipant();
                    } else {
                        s sVar4 = this.e;
                        if (sVar4 != null) {
                            this.x = sVar4.getParticipant();
                        }
                    }
                }
                u3 u3Var6 = this.x;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var6.a;
                boolean z22 = !groupCallParticipant.self ? !((t3Var.x || u3Var6 == t3Var.z) && t3.C(groupCallParticipant, u3Var6.b, t3Var)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.x.b) == 2);
                if (!this.b) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    u3 u3Var7 = this.x;
                    if (!sharedInstance2.isFullscreen(u3Var7.a, u3Var7.b)) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        u3 u3Var8 = this.x;
                        if (!sharedInstance3.isFullscreen(u3Var8.a, u3Var8.b)) {
                        }
                    }
                }
                this.w = true;
                e40 e40Var = this.H;
                if (e40Var.s4.size() > 0) {
                    this.o0 = (o0) p5.c.g(1, e40Var.s4);
                } else {
                    this.o0 = new o0();
                }
                o0 o0Var = this.o0;
                o0Var.g = this;
                o0Var.c = qh0Var;
                o0Var.c(false);
                k(false);
                p6 p6Var3 = this.D0;
                if (p6Var3 != null) {
                    org.telegram.messenger.g0.r(p6Var3);
                    this.D0 = null;
                }
                if (getParent() == null) {
                    l0Var.addView(this, na.e(46, 46, 51));
                    l0Var.I.add(this);
                    long B12 = fj.B1(this.x.a.peer);
                    LongSparseIntArray longSparseIntArray = l0Var.x;
                    longSparseIntArray.put(B12, longSparseIntArray.get(B12, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.S = true;
                this.F = false;
                animate().setListener(null).cancel();
                if (vVar.c0 != null || this.d == null || this.c != null || vVar.E == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.F = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new x(this, i10)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.W.setVisibility((!this.x.b || t3Var.b.rtmp_stream) ? 8 : 0);
                z11 = false;
                z12 = true;
                u3Var = this.x;
                u3Var2 = t3Var.z;
                n5 n5Var = this.M;
                if (u3Var != u3Var2) {
                    if (n5Var.getVisibility() != 4) {
                        n5Var.setVisibility(4);
                        qh0Var.setVisibility(4);
                    }
                } else if (n5Var.getVisibility() != 0) {
                    n5Var.setVisibility(0);
                    qh0Var.setVisibility(0);
                }
                z13 = this.w;
                int i12 = this.L;
                if (z13) {
                    boolean z23 = e40.F5 && (!l0Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        s10 s10Var2 = this.d;
                        if (s10Var2 == null || this.c != null || l0Var.b) {
                            if (!this.h) {
                                if (s10Var2 == null || this.c != null) {
                                    s sVar5 = this.e;
                                    if (sVar5 == null || !z23) {
                                        s sVar6 = this.c;
                                        if ((sVar6 == null || s10Var2 != null) && this.n) {
                                            if (sVar6 != null) {
                                                i7 = org.telegram.messenger.g0.L(80.0f);
                                            }
                                        } else if (sVar6 != null) {
                                            z14 = false;
                                            f10 = sVar6.a;
                                            z15 = true;
                                        } else {
                                            i7 = org.telegram.messenger.g0.L(46.0f);
                                        }
                                    } else {
                                        float f11 = sVar5.a;
                                        z14 = sVar5.b.e.size();
                                        z15 = true;
                                        f10 = f11;
                                    }
                                    i7 = -1;
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                    if (i7 != 0 && (marginLayoutParams.height != i7 || z12 || this.I != z15 || ((z15 && this.J != f10) || z14))) {
                                        marginLayoutParams.height = i7;
                                        if (z15) {
                                            i7 = -1;
                                        }
                                        marginLayoutParams.width = i7;
                                        this.I = z15;
                                        this.J = f10;
                                        this.S = true;
                                        if (z11) {
                                            vVar.requestLayout();
                                        } else {
                                            vVar.a();
                                            this.s = true;
                                        }
                                        org.telegram.messenger.g0.g3(new t(this, i10));
                                        l0Var.requestLayout();
                                        invalidate();
                                    }
                                    u3Var3 = this.x;
                                    if (u3Var3.a.self || u3Var3.b || VoIPService.getSharedInstance() == null) {
                                        n2 n2Var2 = vVar.d;
                                        n2 n2Var3 = vVar.d;
                                        n2Var2.setMirror(false);
                                        n2Var3.setRotateTextureWithScreen(true);
                                        n2Var3.setUseCameraRotation(false);
                                    } else {
                                        n2 n2Var4 = vVar.d;
                                        n2 n2Var5 = vVar.d;
                                        n2Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        n2Var5.setRotateTextureWithScreen(true);
                                        n2Var5.setUseCameraRotation(true);
                                    }
                                    z16 = vVar.a;
                                    n2Var = vVar.d;
                                    if (!z16) {
                                        ((WindowManager) vVar.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.x.a.self) {
                                        n2Var.setMaxTextureSize(0);
                                    } else {
                                        n2Var.setMaxTextureSize(720);
                                    }
                                    u3 u3Var9 = this.x;
                                    C = t3.C(u3Var9.a, u3Var9.b, t3Var);
                                    yVar = this.c0;
                                    if (C || !(t3Var.x || this.x == t3Var.z)) {
                                        ImageReceiver imageReceiver = yVar.a;
                                        a9 a9Var = yVar.c;
                                        imageReceiver.d = i12;
                                        B1 = fj.B1(this.x.a.peer);
                                        if (org.telegram.messenger.n5.E(B1)) {
                                            TLRPC.Chat O0 = mp.u1(org.telegram.messenger.c.a(i10.t0).a).O0(Long.valueOf(-B1));
                                            a9Var.q(O0);
                                            a10 = fc.a(0, O0);
                                            a11 = fc.a(1, O0);
                                            chat = O0;
                                        } else {
                                            TLRPC.User c22 = mp.u1(org.telegram.messenger.c.a(i12).a).c2(Long.valueOf(B1));
                                            a9Var.r(c22);
                                            a10 = fc.l(i12, 0, c22);
                                            a11 = fc.l(i12, 1, c22);
                                            chat = c22;
                                        }
                                        TLRPC.Chat chat2 = chat;
                                        fc fcVar = a10;
                                        yVar.a.r0(fcVar, null, (a11 != null || (C2 = ec.D().C(a11.f)) == null) ? a9Var : C2, null, chat2, 0);
                                        yVar.b.r0(fcVar, "50_50_b", new ColorDrawable(n6.x0(null, n6.kh, false)), null, chat2, 0);
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    boolean z24 = (z11 || this.d == null || this.b || z17) ? false : true;
                                    if (z17 != this.a0 && !z24) {
                                        this.a0 = z17;
                                        valueAnimator = this.d0;
                                        if (valueAnimator != null) {
                                            valueAnimator.removeAllListeners();
                                            this.d0.cancel();
                                        }
                                        if (z11) {
                                            boolean z25 = this.a0;
                                            this.b0 = z25 ? 0.0f : 1.0f;
                                            yVar.setVisibility(z25 ? 8 : 0);
                                            yVar.setAlpha(this.b0);
                                            vVar.invalidate();
                                        } else {
                                            if (!this.a0 && yVar.getVisibility() != 0) {
                                                yVar.setVisibility(0);
                                                yVar.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, this.a0 ? 0.0f : 1.0f);
                                            this.d0 = ofFloat;
                                            ofFloat.addUpdateListener(new u(this, i10));
                                            this.d0.addListener(new x(this, i11));
                                            this.d0.start();
                                        }
                                        if (this.a0) {
                                            y.a(yVar, false);
                                        }
                                    }
                                    if (this.x.a.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(n2Var, this.x.b);
                                    }
                                    o0 o0Var2 = this.o0;
                                    o0Var2.h = this.x.a;
                                    o0Var2.c(z11);
                                    if (yVar.getVisibility() == 0) {
                                        y.a(yVar, true);
                                    }
                                    u3 u3Var10 = this.x;
                                    z18 = u3Var10.b ? !((tL_groupCallParticipantVideo = u3Var10.a.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = u3Var10.a.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.t0 != z18) {
                                        this.t0 = z18;
                                        n2Var.animate().alpha(this.t0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        vVar.invalidate();
                                    }
                                    if (e40.H5 && this.a0) {
                                        if (!n2Var.isFirstFrameRendered()) {
                                            d();
                                        }
                                        if (this.x.a.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(n2Var, this.x.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            u3 u3Var11 = this.x;
                                            sharedInstance4.addRemoteSink(u3Var11.a, u3Var11.b, n2Var, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            u3 u3Var12 = this.x;
                                            sharedInstance5.addRemoteSink(u3Var12.a, u3Var12.b, n2Var, null);
                                            if (t3Var.b.rtmp_stream && !n2Var.isFirstFrameRendered() && !this.A0) {
                                                org.telegram.messenger.g0.h3(this.B0, 15000L);
                                                this.A0 = true;
                                            }
                                        }
                                        str = null;
                                    } else {
                                        if (this.x.a.self) {
                                            str = null;
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                                                u3 u3Var13 = this.x;
                                                sharedInstance6.removeRemoteSink(u3Var13.a, u3Var13.b);
                                                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                                                u3 u3Var14 = this.x;
                                                sharedInstance7.removeRemoteSink(u3Var14.a, u3Var14.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            str = null;
                                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                                        } else {
                                            str = null;
                                        }
                                        if (e40.H5 && n2Var.isFirstFrameRendered()) {
                                            f();
                                            n2Var.clearFirstFrame();
                                            n2Var.setAlpha(0.0f);
                                            vVar.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i7 = org.telegram.messenger.g0.L(80.0f);
                                }
                                z14 = false;
                                f10 = 1.0f;
                                z15 = z14;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i7 != 0) {
                                    marginLayoutParams.height = i7;
                                    if (z15) {
                                    }
                                    marginLayoutParams.width = i7;
                                    this.I = z15;
                                    this.J = f10;
                                    this.S = true;
                                    if (z11) {
                                    }
                                    org.telegram.messenger.g0.g3(new t(this, i10));
                                    l0Var.requestLayout();
                                    invalidate();
                                }
                                u3Var3 = this.x;
                                if (u3Var3.a.self) {
                                }
                                n2 n2Var22 = vVar.d;
                                n2 n2Var32 = vVar.d;
                                n2Var22.setMirror(false);
                                n2Var32.setRotateTextureWithScreen(true);
                                n2Var32.setUseCameraRotation(false);
                                z16 = vVar.a;
                                n2Var = vVar.d;
                                if (!z16) {
                                }
                                if (this.x.a.self) {
                                }
                                u3 u3Var92 = this.x;
                                C = t3.C(u3Var92.a, u3Var92.b, t3Var);
                                yVar = this.c0;
                                if (C) {
                                }
                                ImageReceiver imageReceiver2 = yVar.a;
                                a9 a9Var2 = yVar.c;
                                imageReceiver2.d = i12;
                                B1 = fj.B1(this.x.a.peer);
                                if (org.telegram.messenger.n5.E(B1)) {
                                }
                                TLRPC.Chat chat22 = chat;
                                fc fcVar2 = a10;
                                yVar.a.r0(fcVar2, null, (a11 != null || (C2 = ec.D().C(a11.f)) == null) ? a9Var2 : C2, null, chat22, 0);
                                yVar.b.r0(fcVar2, "50_50_b", new ColorDrawable(n6.x0(null, n6.kh, false)), null, chat22, 0);
                                z17 = false;
                                if (z11) {
                                }
                                if (z17 != this.a0) {
                                    this.a0 = z17;
                                    valueAnimator = this.d0;
                                    if (valueAnimator != null) {
                                    }
                                    if (z11) {
                                    }
                                    if (this.a0) {
                                    }
                                }
                                if (this.x.a.self) {
                                    VoIPService.getSharedInstance().setLocalSink(n2Var, this.x.b);
                                }
                                o0 o0Var22 = this.o0;
                                o0Var22.h = this.x.a;
                                o0Var22.c(z11);
                                if (yVar.getVisibility() == 0) {
                                }
                                u3 u3Var102 = this.x;
                                if (u3Var102.b) {
                                }
                                if (this.t0 != z18) {
                                }
                                if (e40.H5) {
                                }
                                if (this.x.a.self) {
                                }
                                if (e40.H5) {
                                    f();
                                    n2Var.clearFirstFrame();
                                    n2Var.setAlpha(0.0f);
                                    vVar.e.setAlpha(0.0f);
                                }
                                k(true);
                            }
                        }
                        i7 = 0;
                        z14 = false;
                        f10 = 1.0f;
                        z15 = z14;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i7 != 0) {
                        }
                        u3Var3 = this.x;
                        if (u3Var3.a.self) {
                        }
                        n2 n2Var222 = vVar.d;
                        n2 n2Var322 = vVar.d;
                        n2Var222.setMirror(false);
                        n2Var322.setRotateTextureWithScreen(true);
                        n2Var322.setUseCameraRotation(false);
                        z16 = vVar.a;
                        n2Var = vVar.d;
                        if (!z16) {
                        }
                        if (this.x.a.self) {
                        }
                        u3 u3Var922 = this.x;
                        C = t3.C(u3Var922.a, u3Var922.b, t3Var);
                        yVar = this.c0;
                        if (C) {
                        }
                        ImageReceiver imageReceiver22 = yVar.a;
                        a9 a9Var22 = yVar.c;
                        imageReceiver22.d = i12;
                        B1 = fj.B1(this.x.a.peer);
                        if (org.telegram.messenger.n5.E(B1)) {
                        }
                        TLRPC.Chat chat222 = chat;
                        fc fcVar22 = a10;
                        yVar.a.r0(fcVar22, null, (a11 != null || (C2 = ec.D().C(a11.f)) == null) ? a9Var22 : C2, null, chat222, 0);
                        yVar.b.r0(fcVar22, "50_50_b", new ColorDrawable(n6.x0(null, n6.kh, false)), null, chat222, 0);
                        z17 = false;
                        if (z11) {
                        }
                        if (z17 != this.a0) {
                        }
                        if (this.x.a.self) {
                        }
                        o0 o0Var222 = this.o0;
                        o0Var222.h = this.x.a;
                        o0Var222.c(z11);
                        if (yVar.getVisibility() == 0) {
                        }
                        u3 u3Var1022 = this.x;
                        if (u3Var1022.b) {
                        }
                        if (this.t0 != z18) {
                        }
                        if (e40.H5) {
                        }
                        if (this.x.a.self) {
                        }
                        if (e40.H5) {
                        }
                        k(true);
                    }
                    z14 = false;
                    f10 = 1.0f;
                    i7 = -1;
                    z15 = z14;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i7 != 0) {
                    }
                    u3Var3 = this.x;
                    if (u3Var3.a.self) {
                    }
                    n2 n2Var2222 = vVar.d;
                    n2 n2Var3222 = vVar.d;
                    n2Var2222.setMirror(false);
                    n2Var3222.setRotateTextureWithScreen(true);
                    n2Var3222.setUseCameraRotation(false);
                    z16 = vVar.a;
                    n2Var = vVar.d;
                    if (!z16) {
                    }
                    if (this.x.a.self) {
                    }
                    u3 u3Var9222 = this.x;
                    C = t3.C(u3Var9222.a, u3Var9222.b, t3Var);
                    yVar = this.c0;
                    if (C) {
                    }
                    ImageReceiver imageReceiver222 = yVar.a;
                    a9 a9Var222 = yVar.c;
                    imageReceiver222.d = i12;
                    B1 = fj.B1(this.x.a.peer);
                    if (org.telegram.messenger.n5.E(B1)) {
                    }
                    TLRPC.Chat chat2222 = chat;
                    fc fcVar222 = a10;
                    yVar.a.r0(fcVar222, null, (a11 != null || (C2 = ec.D().C(a11.f)) == null) ? a9Var222 : C2, null, chat2222, 0);
                    yVar.b.r0(fcVar222, "50_50_b", new ColorDrawable(n6.x0(null, n6.kh, false)), null, chat2222, 0);
                    z17 = false;
                    if (z11) {
                    }
                    if (z17 != this.a0) {
                    }
                    if (this.x.a.self) {
                    }
                    o0 o0Var2222 = this.o0;
                    o0Var2222.h = this.x.a;
                    o0Var2222.c(z11);
                    if (yVar.getVisibility() == 0) {
                    }
                    u3 u3Var10222 = this.x;
                    if (u3Var10222.b) {
                    }
                    if (this.t0 != z18) {
                    }
                    if (e40.H5) {
                    }
                    if (this.x.a.self) {
                    }
                    if (e40.H5) {
                    }
                    k(true);
                }
                if (this.w) {
                    return;
                }
                long B13 = fj.B1(this.x.a.peer);
                if (org.telegram.messenger.n5.E(B13)) {
                    str = n10.q(mp.u1(org.telegram.messenger.c.a(i12).a).c2(Long.valueOf(B13)));
                } else {
                    TLRPC.Chat O02 = mp.u1(org.telegram.messenger.c.a(i12).a).O0(Long.valueOf(-B13));
                    if (O02 != null) {
                        str = O02.title;
                    }
                }
                n5Var.l(str, false);
                return;
            }
        }
        z11 = z10;
        z12 = false;
        u3Var = this.x;
        u3Var2 = t3Var.z;
        n5 n5Var2 = this.M;
        if (u3Var != u3Var2) {
        }
        z13 = this.w;
        int i122 = this.L;
        if (z13) {
        }
        if (this.w) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z10) {
        int x02;
        int i7;
        int x03;
        o0 o0Var = this.o0;
        if (o0Var == null) {
            return;
        }
        if (o0Var.k) {
            x03 = n6.x0(null, n6.jh, false);
        } else {
            if (!o0Var.e) {
                x02 = n6.x0(null, n6.hh, false);
                i7 = -1;
                if (this.F0 != i7) {
                    return;
                }
                ValueAnimator valueAnimator = this.H0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.H0.cancel();
                }
                if (!z10) {
                    this.G0 = x02;
                    this.U.setColor(x02);
                    return;
                }
                int i10 = this.E0;
                int i11 = this.G0;
                this.F0 = i7;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H0 = ofFloat;
                ofFloat.addUpdateListener(new gc(this, i10, i7, i11, x02, 2));
                this.H0.addListener(new ki.h2(this, i7, x02, 3));
                this.H0.start();
                return;
            }
            x03 = n6.x0(null, n6.hh, false);
        }
        i7 = x03;
        x02 = i7;
        if (this.F0 != i7) {
        }
    }

    public final void l(int i7) {
        int measuredWidth = this.y.getMeasuredWidth() - org.telegram.messenger.g0.L(6.0f);
        if ((this.I0 == i7 || i7 <= 0) && (this.J0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i7 != 0) {
            this.I0 = i7;
        }
        if (measuredWidth != 0) {
            this.J0 = measuredWidth;
        }
        this.M.h(measuredWidth - i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0.Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0.S();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        float B;
        int L;
        s sVar;
        float f10;
        int L2;
        FrameLayout frameLayout = this.K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i11 = layoutParams.leftMargin;
        t3 t3Var = this.G;
        float f11 = t3Var.b.rtmp_stream ? 0.0f : 1.0f;
        boolean z10 = this.e0;
        boolean z11 = e40.E5;
        if (z10 != z11) {
            this.S = true;
            this.e0 = z11;
        }
        int L3 = org.telegram.messenger.g0.L(2.0f);
        layoutParams.rightMargin = L3;
        layoutParams.leftMargin = L3;
        boolean z12 = this.s;
        qh0 qh0Var = this.V;
        n5 n5Var = this.M;
        if (z12) {
            n5Var.animate().scaleX(f11).scaleY(f11).start();
            qh0Var.animate().scaleX(f11).scaleY(f11).start();
        } else {
            n5Var.animate().cancel();
            n5Var.setScaleX(f11);
            n5Var.setScaleY(f11);
            qh0Var.animate().cancel();
            qh0Var.setScaleX(f11);
            qh0Var.setScaleY(f11);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.x0 = 1.0f;
            if (e40.F5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
            } else if (e40.E5) {
                int size = View.MeasureSpec.getSize(i7);
                if (!t3Var.b.rtmp_stream) {
                    size -= org.telegram.messenger.g0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30));
            } else {
                int size2 = View.MeasureSpec.getSize(i10);
                if (!t3Var.b.rtmp_stream) {
                    size2 -= org.telegram.messenger.g0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.x0 = 1.0f;
            int B2 = m10.B(14.0f, 2, Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(B2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + B2, TLObject.FLAG_30));
        } else if (this.I) {
            this.x0 = 1.0f;
            int i12 = 6;
            if ((!e40.F5 || this.e == null) && !e40.E5) {
                i12 = 2;
            }
            if (this.e != null) {
                L = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(344.0f);
            } else if (e40.F5) {
                L = org.telegram.messenger.g0.L(320.0f);
            } else {
                B = m10.B(14.0f, 2, View.MeasureSpec.getSize(i7)) + (e40.E5 ? -org.telegram.messenger.g0.L(90.0f) : 0);
                float f12 = (this.J / i12) * B;
                sVar = this.e;
                if (sVar == null) {
                    f10 = sVar.getItemHeight() - org.telegram.messenger.g0.L(4.0f);
                    L2 = org.telegram.messenger.g0.L(4.0f);
                } else {
                    if (e40.F5) {
                        f10 = B / 2.0f;
                    } else {
                        f10 = B / (e40.E5 ? 3 : 2);
                    }
                    L2 = org.telegram.messenger.g0.L(2.0f);
                }
                float f13 = f12 - L2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float L4 = this.W.getVisibility() != 0 ? f13 - org.telegram.messenger.g0.L(28.0f) : f13;
                l((int) L4);
                layoutParams2.width = (int) (L4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f13, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
            }
            B = L;
            float f122 = (this.J / i12) * B;
            sVar = this.e;
            if (sVar == null) {
            }
            float f132 = f122 - L2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.W.getVisibility() != 0) {
            }
            l((int) L4);
            layoutParams22.width = (int) (L4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f132, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f10, TLObject.FLAG_30));
        } else {
            this.x0 = 0.0f;
            super.onMeasure(i7, i10);
        }
        int size3 = View.MeasureSpec.getSize(i10) + (View.MeasureSpec.getSize(i7) << 16);
        if (this.N != size3) {
            this.N = size3;
            this.E.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(120.0f), 0, i0.a.o(-16777216, 120), Shader.TileMode.CLAMP));
        }
        n5Var.setPivotX(0.0f);
        n5Var.setPivotY(n5Var.getMeasuredHeight() / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAmplitude(double d) {
        this.o0.a(d);
        y yVar = this.c0;
        yVar.getClass();
        float f10 = ((float) d) / 80.0f;
        float f11 = f10 <= 1.0f ? 0.0f : 1.0f;
        f10 = f11;
        yVar.r = f10;
        yVar.s = (f10 - yVar.n) / 200.0f;
    }

    public void setPrimaryView(s sVar) {
        if (this.c != sVar) {
            this.c = sVar;
            this.S = true;
            j(true);
        }
    }

    public void setSecondaryView(s10 s10Var) {
        if (this.d != s10Var) {
            this.d = s10Var;
            this.S = true;
            j(true);
        }
    }

    public void setTabletGridView(s sVar) {
        if (this.e != sVar) {
            this.e = sVar;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }
}
