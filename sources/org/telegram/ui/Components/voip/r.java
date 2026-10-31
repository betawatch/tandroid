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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.tz;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.w10;
import org.telegram.ui.Components.x10;
import org.telegram.ui.Components.y10;
import org.telegram.ui.b50;
import org.telegram.ui.y20;
import org.webrtc.RendererCommon;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r extends FrameLayout implements y {
    public final l A0;
    public final Rect B0;
    public ag.j0 C0;
    public final Paint D;
    public int D0;
    public boolean E;
    public int E0;
    public final u3 F;
    public int F0;
    public final b50 G;
    public ValueAnimator G0;
    public boolean H;
    public int H0;
    public float I;
    public int I0;
    public final FrameLayout J;
    public ValueAnimator J0;
    public final int K;
    public boolean K0;
    public final u5 L;
    public int M;
    public final org.telegram.ui.ActionBar.q2 N;
    public final TextView O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ei0 U;
    public final ImageView V;
    public boolean W;
    public final n a;
    public float a0;
    public boolean b;
    public final q b0;
    public k c;
    public ValueAnimator c0;
    public y10 d;
    public boolean d0;
    public k e;
    public float e0;
    public boolean f;
    public float f0;
    public float g0;
    public boolean h;
    public float h0;
    public float i0;
    public boolean j0;
    public float k0;
    public final ImageReceiver l0;
    public final ArrayList m0;
    public boolean n;
    public z n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final dr u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public v3 x;
    public ImageView x0;
    public final w y;
    public boolean y0;
    public boolean z0;

    public r(w wVar, u3 u3Var, b50 b50Var) {
        super(wVar.getContext());
        this.D = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.A0 = new l(this, 1);
        this.B0 = new Rect();
        this.F = u3Var;
        int i10 = b50Var.a;
        this.K = i10;
        dr drVar = new dr(wVar.getContext(), R.drawable.calls_video, -1);
        this.u0 = drVar;
        drVar.a(true, false);
        float f7 = -org.telegram.messenger.i0.L(4.0f);
        float L = org.telegram.messenger.i0.L(6.0f);
        float L2 = org.telegram.messenger.i0.L(6.0f);
        drVar.i = f7;
        drVar.j = L;
        drVar.k = L2;
        drVar.invalidateSelf();
        float N = org.telegram.messenger.i0.N(3.4f);
        drVar.c.setStrokeWidth(N);
        drVar.d.setStrokeWidth(N * 1.47f);
        this.v0 = wVar.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        textPaint2.setColor(-1);
        String L0 = cd.L0(2131743250, null);
        String L02 = cd.L0(2131743247, null);
        int L3 = org.telegram.messenger.i0.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(L02, textPaint, L3, alignment, 1.0f, 0.0f, false);
        TLRPC.Chat L03 = vp.r1(i10).L0(Long.valueOf(u3Var.c));
        StaticLayout staticLayout2 = new StaticLayout(cd.a0("VoipVideoNotAvailable", null, 2131743252, cd.G(vp.r1(i10).b4, "Participants", new Object[0])), textPaint, org.telegram.messenger.i0.L(400.0f), alignment, 1.0f, 0.0f, false);
        String L04 = cd.L0(2131743248, null);
        n nVar = new n(this, wVar.getContext(), u3Var, wVar, textPaint, staticLayout2, textPaint2, L04, textPaint2.measureText(L04), staticLayout, b50Var, L0, textPaint.measureText(L0));
        this.a = nVar;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        x1 x1Var = nVar.d;
        x1Var.setScalingType(scalingType);
        this.y = wVar;
        this.G = b50Var;
        x1Var.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new o(this));
        TextureView textureView = nVar.e;
        if (textureView != null) {
            x1Var.setBackgroundRenderer(textureView);
            if (!x1Var.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        x1Var.setAlpha(0.0f);
        addView(nVar);
        q qVar = new q(this, getContext());
        this.b0 = qVar;
        addView(qVar);
        u5 u5Var = new u5(wVar.getContext());
        this.L = u5Var;
        u5Var.setTextSize(13);
        u5Var.setTextColor(i0.b.o(-1, zs.F3));
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setFullTextMaxLines(1);
        u5Var.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(wVar.getContext());
        this.J = frameLayout;
        frameLayout.addView(u5Var, b6.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, b6.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setColor(t6.x0(null, t6.eh, false));
        frameLayout.setClipChildren(false);
        ei0 ei0Var = new ei0(wVar.getContext());
        this.U = ei0Var;
        addView(ei0Var, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(wVar.getContext());
        this.V = imageView;
        addView(imageView, b6.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        imageView.setImageDrawable(wVar.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L4 = org.telegram.messenger.i0.L(19.0f);
        int o10 = i0.b.o(-1, 100);
        org.telegram.ui.Cells.y k02 = t6.k0(L4, L4, L4, L4, 0, o10, o10);
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, wVar.getContext(), 4);
        this.N = q2Var;
        q2Var.setText(cd.L0(2131743246, null));
        q2Var.setTextSize(1, 15.0f);
        q2Var.setTypeface(org.telegram.messenger.i0.o());
        q2Var.setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
        q2Var.setTextColor(-1);
        q2Var.setBackground(k02);
        q2Var.setGravity(17);
        q2Var.setOnClickListener(new ag.g(this, 20));
        addView(q2Var, b6.e(-2, 38, 51));
        TextView textView = new TextView(wVar.getContext());
        this.O = textView;
        textView.setTextSize(1, 15.0f);
        textView.setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
        a7.V(textView, t6.ch, null);
        textView.setBackground(k02);
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        if (w3.w(14, L03)) {
            textView.setText(org.telegram.messenger.i0.W2(cd.L0(2131748179, null)));
        } else {
            m5.q("NoRtmpStreamFromAppViewer", null, 2131748178, new Object[]{L03.title}, textView);
        }
        addView(textView, b6.e(-2, -2, 51));
    }

    public static r c(ArrayList arrayList, y20 y20Var, k kVar, y10 y10Var, k kVar2, v3 v3Var, u3 u3Var, b50 b50Var) {
        r rVar;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                rVar = null;
                break;
            }
            if (v3Var.equals(((r) arrayList.get(i10)).x)) {
                rVar = (r) arrayList.get(i10);
                break;
            }
            i10++;
        }
        if (rVar == null) {
            rVar = new r(y20Var, u3Var, b50Var);
        }
        if (kVar != null) {
            rVar.setPrimaryView(kVar);
        }
        if (y10Var != null) {
            rVar.setSecondaryView(y10Var);
        }
        if (kVar2 != null) {
            rVar.setTabletGridView(kVar2);
        }
        return rVar;
    }

    @Override // org.telegram.ui.Components.voip.y
    public final void a() {
        invalidate();
        k(true);
        q qVar = this.b0;
        if (qVar.getVisibility() == 0) {
            q.a(qVar, true);
        }
    }

    public final void b(boolean z10) {
        this.P = true;
        this.w = false;
        this.y.f(this);
        if (z10) {
            if (this.x.a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                }
            } else if (VoIPService.getSharedInstance() != null && !s0.d0.V) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                v3 v3Var = this.x;
                sharedInstance.removeRemoteSink(v3Var.a, v3Var.b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        this.a.d.release();
    }

    public final void d() {
        if (this.q0 != null) {
            return;
        }
        HashMap hashMap = this.F.h;
        v3 v3Var = this.x;
        boolean z10 = v3Var.b;
        TLRPC.GroupCallParticipant groupCallParticipant = v3Var.a;
        Bitmap bitmap = (Bitmap) hashMap.get(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
        this.q0 = bitmap;
        this.a.setThumb(bitmap);
        if (this.q0 == null) {
            long C1 = jj.C1(this.x.a.peer);
            v3 v3Var2 = this.x;
            boolean z11 = v3Var2.a.self;
            ImageReceiver imageReceiver = this.l0;
            if (z11 && v3Var2.b) {
                imageReceiver.w0(new jb0(true, -14602694, -13935795, -14395293, -14203560));
                return;
            }
            int i10 = this.K;
            if (C1 > 0) {
                TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(C1));
                ic l4 = ic.l(i10, 1, Z1);
                int d = Z1 != null ? r8.d(Z1.id) : i0.b.f(0.2f, -16777216, -1);
                imageReceiver.q0(l4, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, d, -16777216), i0.b.f(0.4f, d, -16777216)}), null, Z1, 0);
                return;
            }
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-C1));
            ic a2 = ic.a(1, L0);
            int d10 = L0 != null ? r8.d(L0.id) : i0.b.f(0.2f, -16777216, -1);
            imageReceiver.q0(a2, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.f(0.2f, d10, -16777216), i0.b.f(0.4f, d10, -16777216)}), null, L0, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.w;
        w wVar = this.y;
        n nVar = this.a;
        if (z10) {
            float y3 = (nVar.getY() + nVar.getMeasuredHeight()) - nVar.N;
            FrameLayout frameLayout = this.J;
            float measuredHeight = (y3 - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z11 = this.h;
            ei0 ei0Var = this.U;
            if (z11 || this.f) {
                frameLayout.setAlpha(1.0f - wVar.n);
                ei0Var.setAlpha(1.0f - wVar.n);
            } else if (this.b || this.r) {
                if (!b50.w5 && !b50.x5) {
                    measuredHeight = sc.e.z(1.0f, wVar.W, org.telegram.messenger.i0.L(90.0f) * wVar.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                ei0Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - wVar.c);
                ei0Var.setAlpha(1.0f - wVar.c);
            } else {
                frameLayout.setAlpha(1.0f);
                ei0Var.setAlpha(1.0f);
            }
            boolean z12 = this.b;
            u5 u5Var = this.L;
            if (z12 || this.r) {
                u5Var.setFullAlpha(wVar.c);
            } else {
                u5Var.setFullAlpha(0.0f);
            }
            ei0Var.setTranslationX(frameLayout.getX());
            ei0Var.setTranslationY(measuredHeight - org.telegram.messenger.i0.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((nVar.getMeasuredWidth() - (nVar.O * 2.0f)) - org.telegram.messenger.i0.L(32.0f));
                imageView.setTranslationY(measuredHeight - org.telegram.messenger.i0.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - wVar.c, 1.0f - wVar.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.y0 ? 0.0f : org.telegram.messenger.i0.L(6.0f) * wVar.c);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            z zVar = this.n0;
            if (zVar != null) {
                boolean z13 = zVar.e;
                if (z13) {
                    float f7 = this.S;
                    if (f7 != 1.0f) {
                        float f10 = f7 + 0.053333335f;
                        this.S = f10;
                        if (f10 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                if (!z13) {
                    float f11 = this.S;
                    if (f11 != 0.0f) {
                        float f12 = f11 - 0.053333335f;
                        this.S = f12;
                        if (f12 < 0.0f) {
                            this.S = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
            }
            float f13 = this.S;
            float f14 = (1.0f - wVar.n) * (1.0f - wVar.c) * f13;
            if (f13 > 0.0f) {
                int i10 = (int) (f14 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i10);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / org.telegram.messenger.i0.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(nVar.getX() + nVar.O, nVar.getY() + nVar.N, (nVar.getX() + nVar.getMeasuredWidth()) - nVar.O, (nVar.getY() + nVar.getMeasuredHeight()) - nVar.N);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f15 = nVar.b;
                canvas.drawRoundRect(rectF, f15, f15, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!this.o0 || (view != this.a && view != this.b0)) {
            return super.drawChild(canvas, view, j10);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / org.telegram.messenger.i0.L(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.p0);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        z zVar = this.n0;
        if (zVar != null) {
            this.G.k4.add(zVar);
            this.n0.b();
            z zVar2 = this.n0;
            zVar2.c = null;
            zVar2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x != null) {
            n nVar = this.a;
            x1 x1Var = nVar.d;
            x1 x1Var2 = nVar.d;
            if (x1Var.getMeasuredHeight() == 0 || x1Var2.getMeasuredWidth() == 0) {
                return;
            }
            x1Var2.getRenderBufferBitmap(new mg.l(this, 14));
        }
    }

    public final void g(boolean z10, boolean z11) {
        if (this.n != z10) {
            this.n = z10;
            j(!(this.c == null && this.e == null) && z11);
        }
    }

    public String getName() {
        long C1 = jj.C1(this.x.a.peer);
        return o5.E(C1) ? h20.p(vp.r1(org.telegram.messenger.c.a(d20.s0).a).Z1(Long.valueOf(C1))) : vp.r1(org.telegram.messenger.c.a(d20.s0).a).L0(Long.valueOf(-C1)).title;
    }

    public k getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z10, boolean z11) {
        if (this.b != z10) {
            this.b = z10;
            this.R = true;
            j(z11);
        }
    }

    public final void i(float f7, float f10, float f11, float f12, float f13, boolean z10) {
        if (this.e0 == f7 && this.f0 == f10 && this.g0 == f11 && this.h0 == f12 && this.i0 == f13) {
            return;
        }
        this.j0 = z10;
        this.e0 = f7;
        this.f0 = f10;
        this.g0 = f11;
        this.h0 = f12;
        this.i0 = f13;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.a.invalidate();
        }
        k kVar = this.c;
        if (kVar != null) {
            kVar.invalidate();
            b50 b50Var = this.G;
            if (b50Var.O4 == this.c) {
                b50Var.b.invalidate();
            }
        }
        y10 y10Var = this.d;
        if (y10Var != null) {
            y10Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:336:0x01d8, code lost:
    
        if (r2 != false) goto L132;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x066d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0392  */
    /* JADX WARN: Type inference failed for: r6v18, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        boolean z11;
        boolean z12;
        v3 v3Var;
        v3 v3Var2;
        boolean z13;
        boolean z14;
        float f7;
        int i10;
        boolean z15;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        v3 v3Var3;
        boolean z16;
        x1 x1Var;
        boolean C;
        q qVar;
        long C1;
        ic a2;
        ic a10;
        TLRPC.Chat chat;
        boolean z17;
        Drawable C2;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z18;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        v3 v3Var4;
        k kVar;
        if (this.P) {
            return;
        }
        u3 u3Var = this.F;
        int i11 = 0;
        if (u3Var.b.rtmp_stream) {
            int L = org.telegram.messenger.i0.L(this.b ? 36.0f : 21.0f);
            this.O.setPadding(L, 0, L, 0);
        }
        if (this.x == null && ((kVar = this.c) != null || this.d != null || this.e != null)) {
            if (kVar != null) {
                this.x = kVar.getParticipant();
            } else {
                k kVar2 = this.e;
                if (kVar2 != null) {
                    this.x = kVar2.getParticipant();
                } else {
                    this.x = this.d.getVideoParticipant();
                }
            }
        }
        boolean z19 = this.w;
        ei0 ei0Var = this.U;
        w wVar = this.y;
        String str = null;
        n nVar = this.a;
        int i12 = 1;
        if (z19 && !this.b) {
            boolean z20 = VoIPService.getSharedInstance() == null;
            if (b50.z5 || (v3Var4 = this.x) == null || (this.d == null && (!u3.C(v3Var4.a, v3Var4.b, u3Var) || (!u3Var.x && this.x != u3Var.z)))) {
                z20 = true;
            }
            if (z20 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                this.w = false;
                f();
                boolean z21 = tz.o() <= 0;
                if (nVar.b0 == null && z20) {
                    if (z21) {
                        wVar.f(this);
                    }
                    animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new androidx.fragment.app.g(this, this, z21, 6)).setDuration(150L).start();
                } else {
                    if (wVar.s) {
                        ag.j0 j0Var = this.C0;
                        if (j0Var != null) {
                            org.telegram.messenger.i0.r(j0Var);
                            this.C0 = null;
                        }
                        ag.j0 j0Var2 = new ag.j0(this, z21, this, 23);
                        this.C0 = j0Var2;
                        org.telegram.messenger.i0.g3(j0Var2);
                    } else {
                        if (z21) {
                            wVar.removeView(this);
                        }
                        setVisibility(8);
                    }
                    if (z21) {
                        wVar.f(this);
                        e();
                    }
                }
                if (this.x.a.self) {
                    if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                    }
                } else if (VoIPService.getSharedInstance() != null) {
                    VoIPService sharedInstance = VoIPService.getSharedInstance();
                    v3 v3Var5 = this.x;
                    sharedInstance.removeRemoteSink(v3Var5.a, v3Var5.b);
                }
                invalidate();
                ValueAnimator valueAnimator2 = this.c0;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    this.c0.cancel();
                }
            }
        } else if (!z19) {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            k kVar3 = this.c;
            if (kVar3 != null || this.d != null || this.e != null || this.b) {
                if (kVar3 != null) {
                    this.x = kVar3.getParticipant();
                } else {
                    y10 y10Var = this.d;
                    if (y10Var != null) {
                        this.x = y10Var.getVideoParticipant();
                    } else {
                        k kVar4 = this.e;
                        if (kVar4 != null) {
                            this.x = kVar4.getParticipant();
                        }
                    }
                }
                v3 v3Var6 = this.x;
                TLRPC.GroupCallParticipant groupCallParticipant = v3Var6.a;
                boolean z22 = !groupCallParticipant.self ? !((u3Var.x || v3Var6 == u3Var.z) && u3.C(groupCallParticipant, v3Var6.b, u3Var)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.x.b) == 2);
                if (!this.b) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    v3 v3Var7 = this.x;
                    if (!sharedInstance2.isFullscreen(v3Var7.a, v3Var7.b)) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        v3 v3Var8 = this.x;
                        if (!sharedInstance3.isFullscreen(v3Var8.a, v3Var8.b)) {
                        }
                    }
                }
                this.w = true;
                b50 b50Var = this.G;
                if (b50Var.k4.size() > 0) {
                    this.n0 = (z) i0.a.v(1, b50Var.k4);
                } else {
                    this.n0 = new z();
                }
                z zVar = this.n0;
                zVar.g = this;
                zVar.c = ei0Var;
                zVar.c(false);
                k(false);
                ag.j0 j0Var3 = this.C0;
                if (j0Var3 != null) {
                    org.telegram.messenger.i0.r(j0Var3);
                    this.C0 = null;
                }
                if (getParent() == null) {
                    wVar.addView(this, b6.e(46, 46, 51));
                    wVar.H.add(this);
                    long C12 = jj.C1(this.x.a.peer);
                    LongSparseIntArray longSparseIntArray = wVar.x;
                    longSparseIntArray.put(C12, longSparseIntArray.get(C12, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.R = true;
                this.E = false;
                animate().setListener(null).cancel();
                if (nVar.b0 != null || this.d == null || this.c != null || nVar.D == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.E = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new p(this, i11)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.V.setVisibility((!this.x.b || u3Var.b.rtmp_stream) ? 8 : 0);
                z11 = false;
                z12 = true;
                v3Var = this.x;
                v3Var2 = u3Var.z;
                u5 u5Var = this.L;
                if (v3Var != v3Var2) {
                    if (u5Var.getVisibility() != 4) {
                        u5Var.setVisibility(4);
                        ei0Var.setVisibility(4);
                    }
                } else if (u5Var.getVisibility() != 0) {
                    u5Var.setVisibility(0);
                    ei0Var.setVisibility(0);
                }
                z13 = this.w;
                int i13 = this.K;
                if (z13) {
                    boolean z23 = b50.x5 && (!wVar.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        y10 y10Var2 = this.d;
                        if (y10Var2 == null || this.c != null || wVar.b) {
                            if (!this.h) {
                                if (y10Var2 == null || this.c != null) {
                                    k kVar5 = this.e;
                                    if (kVar5 == null || !z23) {
                                        k kVar6 = this.c;
                                        if ((kVar6 == null || y10Var2 != null) && this.n) {
                                            if (kVar6 != null) {
                                                i10 = org.telegram.messenger.i0.L(80.0f);
                                            }
                                        } else if (kVar6 != null) {
                                            z14 = false;
                                            f7 = kVar6.a;
                                            z15 = true;
                                        } else {
                                            i10 = org.telegram.messenger.i0.L(46.0f);
                                        }
                                    } else {
                                        float f10 = kVar5.a;
                                        z14 = kVar5.b.e.size();
                                        z15 = true;
                                        f7 = f10;
                                    }
                                    i10 = -1;
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                    if (i10 != 0 && (marginLayoutParams.height != i10 || z12 || this.H != z15 || ((z15 && this.I != f7) || z14))) {
                                        marginLayoutParams.height = i10;
                                        if (z15) {
                                            i10 = -1;
                                        }
                                        marginLayoutParams.width = i10;
                                        this.H = z15;
                                        this.I = f7;
                                        this.R = true;
                                        if (z11) {
                                            nVar.requestLayout();
                                        } else {
                                            nVar.a();
                                            this.s = true;
                                        }
                                        org.telegram.messenger.i0.g3(new l(this, i11));
                                        wVar.requestLayout();
                                        invalidate();
                                    }
                                    v3Var3 = this.x;
                                    if (v3Var3.a.self || v3Var3.b || VoIPService.getSharedInstance() == null) {
                                        x1 x1Var2 = nVar.d;
                                        x1 x1Var3 = nVar.d;
                                        x1Var2.setMirror(false);
                                        x1Var3.setRotateTextureWithScreen(true);
                                        x1Var3.setUseCameraRotation(false);
                                    } else {
                                        x1 x1Var4 = nVar.d;
                                        x1 x1Var5 = nVar.d;
                                        x1Var4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        x1Var5.setRotateTextureWithScreen(true);
                                        x1Var5.setUseCameraRotation(true);
                                    }
                                    z16 = nVar.a;
                                    x1Var = nVar.d;
                                    if (!z16) {
                                        ((WindowManager) nVar.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.x.a.self) {
                                        x1Var.setMaxTextureSize(0);
                                    } else {
                                        x1Var.setMaxTextureSize(720);
                                    }
                                    v3 v3Var9 = this.x;
                                    C = u3.C(v3Var9.a, v3Var9.b, u3Var);
                                    qVar = this.b0;
                                    if (C || !(u3Var.x || this.x == u3Var.z)) {
                                        ImageReceiver imageReceiver = qVar.a;
                                        r8 r8Var = qVar.c;
                                        imageReceiver.d = i13;
                                        C1 = jj.C1(this.x.a.peer);
                                        if (o5.E(C1)) {
                                            TLRPC.Chat L0 = vp.r1(org.telegram.messenger.c.a(d20.s0).a).L0(Long.valueOf(-C1));
                                            r8Var.q(L0);
                                            a2 = ic.a(0, L0);
                                            a10 = ic.a(1, L0);
                                            chat = L0;
                                        } else {
                                            TLRPC.User Z1 = vp.r1(org.telegram.messenger.c.a(i13).a).Z1(Long.valueOf(C1));
                                            r8Var.r(Z1);
                                            a2 = ic.l(i13, 0, Z1);
                                            a10 = ic.l(i13, 1, Z1);
                                            chat = Z1;
                                        }
                                        TLRPC.Chat chat2 = chat;
                                        ic icVar = a2;
                                        qVar.a.q0(icVar, null, (a10 != null || (C2 = hc.D().C(a10.f)) == null) ? r8Var : C2, null, chat2, 0);
                                        qVar.b.q0(icVar, "50_50_b", new ColorDrawable(t6.x0(null, t6.hh, false)), null, chat2, 0);
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    boolean z24 = (z11 || this.d == null || this.b || z17) ? false : true;
                                    if (z17 != this.W && !z24) {
                                        this.W = z17;
                                        valueAnimator = this.c0;
                                        if (valueAnimator != null) {
                                            valueAnimator.removeAllListeners();
                                            this.c0.cancel();
                                        }
                                        if (z11) {
                                            boolean z25 = this.W;
                                            this.a0 = z25 ? 0.0f : 1.0f;
                                            qVar.setVisibility(z25 ? 8 : 0);
                                            qVar.setAlpha(this.a0);
                                            nVar.invalidate();
                                        } else {
                                            if (!this.W && qVar.getVisibility() != 0) {
                                                qVar.setVisibility(0);
                                                qVar.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, this.W ? 0.0f : 1.0f);
                                            this.c0 = ofFloat;
                                            ofFloat.addUpdateListener(new m(this, i11));
                                            this.c0.addListener(new p(this, i12));
                                            this.c0.start();
                                        }
                                        if (this.W) {
                                            q.a(qVar, false);
                                        }
                                    }
                                    if (this.x.a.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(x1Var, this.x.b);
                                    }
                                    z zVar2 = this.n0;
                                    zVar2.h = this.x.a;
                                    zVar2.c(z11);
                                    if (qVar.getVisibility() == 0) {
                                        q.a(qVar, true);
                                    }
                                    v3 v3Var10 = this.x;
                                    z18 = v3Var10.b ? !((tL_groupCallParticipantVideo = v3Var10.a.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = v3Var10.a.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.s0 != z18) {
                                        this.s0 = z18;
                                        x1Var.animate().alpha(this.s0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        nVar.invalidate();
                                    }
                                    if (b50.z5 && this.W) {
                                        if (!x1Var.isFirstFrameRendered()) {
                                            d();
                                        }
                                        if (this.x.a.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(x1Var, this.x.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            v3 v3Var11 = this.x;
                                            sharedInstance4.addRemoteSink(v3Var11.a, v3Var11.b, x1Var, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            v3 v3Var12 = this.x;
                                            sharedInstance5.addRemoteSink(v3Var12.a, v3Var12.b, x1Var, null);
                                            if (u3Var.b.rtmp_stream && !x1Var.isFirstFrameRendered() && !this.z0) {
                                                org.telegram.messenger.i0.h3(this.A0, 15000L);
                                                this.z0 = true;
                                            }
                                        }
                                        str = null;
                                    } else {
                                        if (this.x.a.self) {
                                            str = null;
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                                                v3 v3Var13 = this.x;
                                                sharedInstance6.removeRemoteSink(v3Var13.a, v3Var13.b);
                                                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                                                v3 v3Var14 = this.x;
                                                sharedInstance7.removeRemoteSink(v3Var14.a, v3Var14.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            str = null;
                                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                                        } else {
                                            str = null;
                                        }
                                        if (b50.z5 && x1Var.isFirstFrameRendered()) {
                                            f();
                                            x1Var.clearFirstFrame();
                                            x1Var.setAlpha(0.0f);
                                            nVar.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i10 = org.telegram.messenger.i0.L(80.0f);
                                }
                                z14 = false;
                                f7 = 1.0f;
                                z15 = z14;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i10 != 0) {
                                    marginLayoutParams.height = i10;
                                    if (z15) {
                                    }
                                    marginLayoutParams.width = i10;
                                    this.H = z15;
                                    this.I = f7;
                                    this.R = true;
                                    if (z11) {
                                    }
                                    org.telegram.messenger.i0.g3(new l(this, i11));
                                    wVar.requestLayout();
                                    invalidate();
                                }
                                v3Var3 = this.x;
                                if (v3Var3.a.self) {
                                }
                                x1 x1Var22 = nVar.d;
                                x1 x1Var32 = nVar.d;
                                x1Var22.setMirror(false);
                                x1Var32.setRotateTextureWithScreen(true);
                                x1Var32.setUseCameraRotation(false);
                                z16 = nVar.a;
                                x1Var = nVar.d;
                                if (!z16) {
                                }
                                if (this.x.a.self) {
                                }
                                v3 v3Var92 = this.x;
                                C = u3.C(v3Var92.a, v3Var92.b, u3Var);
                                qVar = this.b0;
                                if (C) {
                                }
                                ImageReceiver imageReceiver2 = qVar.a;
                                r8 r8Var2 = qVar.c;
                                imageReceiver2.d = i13;
                                C1 = jj.C1(this.x.a.peer);
                                if (o5.E(C1)) {
                                }
                                TLRPC.Chat chat22 = chat;
                                ic icVar2 = a2;
                                qVar.a.q0(icVar2, null, (a10 != null || (C2 = hc.D().C(a10.f)) == null) ? r8Var2 : C2, null, chat22, 0);
                                qVar.b.q0(icVar2, "50_50_b", new ColorDrawable(t6.x0(null, t6.hh, false)), null, chat22, 0);
                                z17 = false;
                                if (z11) {
                                }
                                if (z17 != this.W) {
                                    this.W = z17;
                                    valueAnimator = this.c0;
                                    if (valueAnimator != null) {
                                    }
                                    if (z11) {
                                    }
                                    if (this.W) {
                                    }
                                }
                                if (this.x.a.self) {
                                    VoIPService.getSharedInstance().setLocalSink(x1Var, this.x.b);
                                }
                                z zVar22 = this.n0;
                                zVar22.h = this.x.a;
                                zVar22.c(z11);
                                if (qVar.getVisibility() == 0) {
                                }
                                v3 v3Var102 = this.x;
                                if (v3Var102.b) {
                                }
                                if (this.s0 != z18) {
                                }
                                if (b50.z5) {
                                }
                                if (this.x.a.self) {
                                }
                                if (b50.z5) {
                                    f();
                                    x1Var.clearFirstFrame();
                                    x1Var.setAlpha(0.0f);
                                    nVar.e.setAlpha(0.0f);
                                }
                                k(true);
                            }
                        }
                        i10 = 0;
                        z14 = false;
                        f7 = 1.0f;
                        z15 = z14;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i10 != 0) {
                        }
                        v3Var3 = this.x;
                        if (v3Var3.a.self) {
                        }
                        x1 x1Var222 = nVar.d;
                        x1 x1Var322 = nVar.d;
                        x1Var222.setMirror(false);
                        x1Var322.setRotateTextureWithScreen(true);
                        x1Var322.setUseCameraRotation(false);
                        z16 = nVar.a;
                        x1Var = nVar.d;
                        if (!z16) {
                        }
                        if (this.x.a.self) {
                        }
                        v3 v3Var922 = this.x;
                        C = u3.C(v3Var922.a, v3Var922.b, u3Var);
                        qVar = this.b0;
                        if (C) {
                        }
                        ImageReceiver imageReceiver22 = qVar.a;
                        r8 r8Var22 = qVar.c;
                        imageReceiver22.d = i13;
                        C1 = jj.C1(this.x.a.peer);
                        if (o5.E(C1)) {
                        }
                        TLRPC.Chat chat222 = chat;
                        ic icVar22 = a2;
                        qVar.a.q0(icVar22, null, (a10 != null || (C2 = hc.D().C(a10.f)) == null) ? r8Var22 : C2, null, chat222, 0);
                        qVar.b.q0(icVar22, "50_50_b", new ColorDrawable(t6.x0(null, t6.hh, false)), null, chat222, 0);
                        z17 = false;
                        if (z11) {
                        }
                        if (z17 != this.W) {
                        }
                        if (this.x.a.self) {
                        }
                        z zVar222 = this.n0;
                        zVar222.h = this.x.a;
                        zVar222.c(z11);
                        if (qVar.getVisibility() == 0) {
                        }
                        v3 v3Var1022 = this.x;
                        if (v3Var1022.b) {
                        }
                        if (this.s0 != z18) {
                        }
                        if (b50.z5) {
                        }
                        if (this.x.a.self) {
                        }
                        if (b50.z5) {
                        }
                        k(true);
                    }
                    z14 = false;
                    f7 = 1.0f;
                    i10 = -1;
                    z15 = z14;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i10 != 0) {
                    }
                    v3Var3 = this.x;
                    if (v3Var3.a.self) {
                    }
                    x1 x1Var2222 = nVar.d;
                    x1 x1Var3222 = nVar.d;
                    x1Var2222.setMirror(false);
                    x1Var3222.setRotateTextureWithScreen(true);
                    x1Var3222.setUseCameraRotation(false);
                    z16 = nVar.a;
                    x1Var = nVar.d;
                    if (!z16) {
                    }
                    if (this.x.a.self) {
                    }
                    v3 v3Var9222 = this.x;
                    C = u3.C(v3Var9222.a, v3Var9222.b, u3Var);
                    qVar = this.b0;
                    if (C) {
                    }
                    ImageReceiver imageReceiver222 = qVar.a;
                    r8 r8Var222 = qVar.c;
                    imageReceiver222.d = i13;
                    C1 = jj.C1(this.x.a.peer);
                    if (o5.E(C1)) {
                    }
                    TLRPC.Chat chat2222 = chat;
                    ic icVar222 = a2;
                    qVar.a.q0(icVar222, null, (a10 != null || (C2 = hc.D().C(a10.f)) == null) ? r8Var222 : C2, null, chat2222, 0);
                    qVar.b.q0(icVar222, "50_50_b", new ColorDrawable(t6.x0(null, t6.hh, false)), null, chat2222, 0);
                    z17 = false;
                    if (z11) {
                    }
                    if (z17 != this.W) {
                    }
                    if (this.x.a.self) {
                    }
                    z zVar2222 = this.n0;
                    zVar2222.h = this.x.a;
                    zVar2222.c(z11);
                    if (qVar.getVisibility() == 0) {
                    }
                    v3 v3Var10222 = this.x;
                    if (v3Var10222.b) {
                    }
                    if (this.s0 != z18) {
                    }
                    if (b50.z5) {
                    }
                    if (this.x.a.self) {
                    }
                    if (b50.z5) {
                    }
                    k(true);
                }
                if (this.w) {
                    return;
                }
                long C13 = jj.C1(this.x.a.peer);
                if (o5.E(C13)) {
                    str = h20.p(vp.r1(org.telegram.messenger.c.a(i13).a).Z1(Long.valueOf(C13)));
                } else {
                    TLRPC.Chat L02 = vp.r1(org.telegram.messenger.c.a(i13).a).L0(Long.valueOf(-C13));
                    if (L02 != null) {
                        str = L02.title;
                    }
                }
                u5Var.l(str, false);
                return;
            }
        }
        z11 = z10;
        z12 = false;
        v3Var = this.x;
        v3Var2 = u3Var.z;
        u5 u5Var2 = this.L;
        if (v3Var != v3Var2) {
        }
        z13 = this.w;
        int i132 = this.K;
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
        int i10;
        int x03;
        z zVar = this.n0;
        if (zVar == null) {
            return;
        }
        if (zVar.k) {
            x03 = t6.x0(null, t6.gh, false);
        } else {
            if (!zVar.e) {
                x02 = t6.x0(null, t6.eh, false);
                i10 = -1;
                if (this.E0 != i10) {
                    return;
                }
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.G0.cancel();
                }
                if (!z10) {
                    this.F0 = x02;
                    this.T.setColor(x02);
                    return;
                }
                int i11 = this.D0;
                int i12 = this.F0;
                this.E0 = i10;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G0 = ofFloat;
                ofFloat.addUpdateListener(new w10(this, i11, i10, i12, x02, 1));
                this.G0.addListener(new x10(this, i10, x02, 2));
                this.G0.start();
                return;
            }
            x03 = t6.x0(null, t6.eh, false);
        }
        i10 = x03;
        x02 = i10;
        if (this.E0 != i10) {
        }
    }

    public final void l(int i10) {
        int measuredWidth = this.y.getMeasuredWidth() - org.telegram.messenger.i0.L(6.0f);
        if ((this.H0 == i10 || i10 <= 0) && (this.I0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i10 != 0) {
            this.H0 = i10;
        }
        if (measuredWidth != 0) {
            this.I0 = measuredWidth;
        }
        this.L.h(measuredWidth - i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l0.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0.R();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017e  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        float A;
        int L;
        k kVar;
        float f7;
        int L2;
        FrameLayout frameLayout = this.J;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i12 = layoutParams.leftMargin;
        u3 u3Var = this.F;
        float f10 = u3Var.b.rtmp_stream ? 0.0f : 1.0f;
        boolean z10 = this.d0;
        boolean z11 = b50.w5;
        if (z10 != z11) {
            this.R = true;
            this.d0 = z11;
        }
        int L3 = org.telegram.messenger.i0.L(2.0f);
        layoutParams.rightMargin = L3;
        layoutParams.leftMargin = L3;
        boolean z12 = this.s;
        ei0 ei0Var = this.U;
        u5 u5Var = this.L;
        if (z12) {
            u5Var.animate().scaleX(f10).scaleY(f10).start();
            ei0Var.animate().scaleX(f10).scaleY(f10).start();
        } else {
            u5Var.animate().cancel();
            u5Var.setScaleX(f10);
            u5Var.setScaleY(f10);
            ei0Var.animate().cancel();
            ei0Var.setScaleX(f10);
            ei0Var.setScaleY(f10);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.w0 = 1.0f;
            if (b50.x5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11) - org.telegram.messenger.i0.L(4.0f), TLObject.FLAG_30));
            } else if (b50.w5) {
                int size = View.MeasureSpec.getSize(i10);
                if (!u3Var.b.rtmp_stream) {
                    size -= org.telegram.messenger.i0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30));
            } else {
                int size2 = View.MeasureSpec.getSize(i11);
                if (!u3Var.b.rtmp_stream) {
                    size2 -= org.telegram.messenger.i0.L(92.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.w0 = 1.0f;
            int A2 = z20.A(14.0f, 2, Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(A2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + A2, TLObject.FLAG_30));
        } else if (this.H) {
            this.w0 = 1.0f;
            int i13 = 6;
            if ((!b50.x5 || this.e == null) && !b50.w5) {
                i13 = 2;
            }
            if (this.e != null) {
                L = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(344.0f);
            } else if (b50.x5) {
                L = org.telegram.messenger.i0.L(320.0f);
            } else {
                A = z20.A(14.0f, 2, View.MeasureSpec.getSize(i10)) + (b50.w5 ? -org.telegram.messenger.i0.L(90.0f) : 0);
                float f11 = (this.I / i13) * A;
                kVar = this.e;
                if (kVar == null) {
                    f7 = kVar.getItemHeight() - org.telegram.messenger.i0.L(4.0f);
                    L2 = org.telegram.messenger.i0.L(4.0f);
                } else {
                    if (b50.x5) {
                        f7 = A / 2.0f;
                    } else {
                        f7 = A / (b50.w5 ? 3 : 2);
                    }
                    L2 = org.telegram.messenger.i0.L(2.0f);
                }
                float f12 = f11 - L2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float L4 = this.V.getVisibility() != 0 ? f12 - org.telegram.messenger.i0.L(28.0f) : f12;
                l((int) L4);
                layoutParams2.width = (int) (L4 - (layoutParams2.leftMargin * 2));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f7, TLObject.FLAG_30));
            }
            A = L;
            float f112 = (this.I / i13) * A;
            kVar = this.e;
            if (kVar == null) {
            }
            float f122 = f112 - L2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.V.getVisibility() != 0) {
            }
            l((int) L4);
            layoutParams22.width = (int) (L4 - (layoutParams22.leftMargin * 2));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f122, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f7, TLObject.FLAG_30));
        } else {
            this.w0 = 0.0f;
            super.onMeasure(i10, i11);
        }
        int size3 = View.MeasureSpec.getSize(i11) + (View.MeasureSpec.getSize(i10) << 16);
        if (this.M != size3) {
            this.M = size3;
            this.D.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.i0.L(120.0f), 0, i0.b.o(-16777216, 120), Shader.TileMode.CLAMP));
        }
        u5Var.setPivotX(0.0f);
        u5Var.setPivotY(u5Var.getMeasuredHeight() / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAmplitude(double d) {
        this.n0.a(d);
        q qVar = this.b0;
        qVar.getClass();
        float f7 = ((float) d) / 80.0f;
        float f10 = f7 <= 1.0f ? 0.0f : 1.0f;
        f7 = f10;
        qVar.r = f7;
        qVar.s = (f7 - qVar.n) / 200.0f;
    }

    public void setPrimaryView(k kVar) {
        if (this.c != kVar) {
            this.c = kVar;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(y10 y10Var) {
        if (this.d != y10Var) {
            this.d = y10Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(k kVar) {
        if (this.e != kVar) {
            this.e = kVar;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
