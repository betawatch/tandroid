// default package

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
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.RendererCommon;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ha5 extends FrameLayout implements nb5 {
    public np6 A0;
    public int B0;
    public int C0;
    public int D0;
    public final Paint E;
    public ValueAnimator E0;
    public boolean F;
    public int F0;
    public final qd2 G;
    public int G0;
    public final g95 H;
    public ValueAnimator H0;
    public boolean I;
    public boolean I0;
    public float J;
    public final FrameLayout K;
    public final int L;
    public final lka M;
    public int N;
    public final ey0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final s09 U;
    public final ImageView V;
    public boolean W;
    public final da5 a;
    public float a0;
    public boolean b;
    public final ga5 b0;
    public n95 c;
    public ValueAnimator c0;
    public l95 d;
    public boolean d0;
    public n95 e;
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
    public ob5 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final v43 u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public rd2 x;
    public ImageView x0;
    public final jb5 y;
    public boolean y0;
    public final Rect z0;

    public ha5(jb5 jb5Var, qd2 qd2Var, g95 g95Var) {
        super(jb5Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.z0 = new Rect();
        this.G = qd2Var;
        int i = g95Var.a;
        this.L = i;
        v43 v43Var = new v43(jb5Var.getContext(), R.drawable.calls_video, -1);
        this.u0 = v43Var;
        byte b = 0;
        v43Var.a(true, false);
        float f = -gm.L(4.0f);
        float L = gm.L(6.0f);
        float L2 = gm.L(6.0f);
        v43Var.i = f;
        v43Var.j = L;
        v43Var.k = L2;
        v43Var.invalidateSelf();
        float N = gm.N(3.4f);
        v43Var.c.setStrokeWidth(N);
        v43Var.d.setStrokeWidth(N * 1.47f);
        this.v0 = jb5Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(gm.o());
        textPaint2.setTextSize(gm.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = jb6.M0(2131742908, null);
        String M02 = jb6.M0(2131742905, null);
        int L3 = gm.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L3, alignment, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(jb6.a0("VoipVideoNotAvailable", null, 2131742910, jb6.G(oc7.r1(i).l4.M0.f(), "Participants", new Object[0])), textPaint, gm.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M03 = jb6.M0(2131742906, null);
        da5 da5Var = new da5(this, jb5Var.getContext(), qd2Var, jb5Var, textPaint, staticLayout2, textPaint2, M03, textPaint2.measureText(M03), staticLayout, g95Var, M0, textPaint.measureText(M0));
        this.a = da5Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        zjc zjcVar = da5Var.d;
        zjcVar.setScalingType(scalingType);
        this.y = jb5Var;
        this.H = g95Var;
        zjcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ea5(this));
        TextureView textureView = da5Var.e;
        if (textureView != null) {
            zjcVar.setBackgroundRenderer(textureView);
            if (!zjcVar.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        zjcVar.setAlpha(0.0f);
        addView(da5Var);
        ga5 ga5Var = new ga5(this, getContext());
        this.b0 = ga5Var;
        addView(ga5Var);
        lka lkaVar = new lka(jb5Var.getContext());
        this.M = lkaVar;
        lkaVar.setTextSize(13);
        lkaVar.setTextColor(on2.p(-1, nm7.F3));
        lkaVar.setTypeface(gm.o());
        lkaVar.setFullTextMaxLines(1);
        lkaVar.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(jb5Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(lkaVar, qoe.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, qoe.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setColor(cmb.w0(null, cmb.gh, false));
        frameLayout.setClipChildren(false);
        s09 s09Var = new s09(jb5Var.getContext());
        this.U = s09Var;
        addView(s09Var, qoe.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(jb5Var.getContext());
        this.V = imageView;
        addView(imageView, qoe.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        imageView.setImageDrawable(jb5Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L4 = gm.L(19.0f);
        int p = on2.p(-1, 100);
        fg0 i0 = cmb.i0(L4, L4, L4, L4, 0, p, p);
        ey0 ey0Var = new ey0((byte) 3, jb5Var.getContext(), this);
        this.O = ey0Var;
        ey0Var.setText(jb6.M0(2131742904, null));
        ey0Var.setTextSize(1, 15.0f);
        ey0Var.setTypeface(gm.o());
        ey0Var.setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
        ey0Var.setTextColor(-1);
        ey0Var.setBackground(i0);
        ey0Var.setGravity(17);
        ey0Var.setOnClickListener(new ca5(this, b));
        addView(ey0Var, qoe.e(-2, 38, 51));
    }

    public static ha5 c(ArrayList arrayList, c75 c75Var, n95 n95Var, l95 l95Var, n95 n95Var2, rd2 rd2Var, qd2 qd2Var, g95 g95Var) {
        ha5 ha5Var;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                ha5Var = null;
                break;
            }
            if (rd2Var.equals(((ha5) arrayList.get(i)).x)) {
                ha5Var = (ha5) arrayList.get(i);
                break;
            }
            i++;
        }
        if (ha5Var == null) {
            ha5Var = new ha5(c75Var, qd2Var, g95Var);
        }
        if (n95Var != null) {
            ha5Var.setPrimaryView(n95Var);
        }
        if (l95Var != null) {
            ha5Var.setSecondaryView(l95Var);
        }
        if (n95Var2 != null) {
            ha5Var.setTabletGridView(n95Var2);
        }
        return ha5Var;
    }

    @Override // nb5
    public final void a() {
        invalidate();
        k(true);
        ga5 ga5Var = this.b0;
        if (ga5Var.getVisibility() == 0) {
            ga5Var.a(true);
        }
    }

    public final void b(boolean z) {
        this.P = true;
        this.w = false;
        this.y.e(this);
        if (z) {
            if (this.x.a.self) {
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                }
            } else if (VoIPService.getSharedInstance() != null) {
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                rd2 rd2Var = this.x;
                sharedInstance.removeRemoteSink(rd2Var.a, rd2Var.b);
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
        if (this.q0 == null) {
            HashMap hashMap = this.G.h;
            rd2 rd2Var = this.x;
            boolean z = rd2Var.b;
            TLRPC.GroupCallParticipant groupCallParticipant = rd2Var.a;
            Bitmap bitmap = (Bitmap) hashMap.get(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
            this.q0 = bitmap;
            this.a.setThumb(bitmap);
            if (this.q0 == null) {
                long B1 = k47.B1(this.x.a.peer);
                rd2 rd2Var2 = this.x;
                boolean z2 = rd2Var2.a.self;
                ImageReceiver imageReceiver = this.l0;
                if (z2 && rd2Var2.b) {
                    imageReceiver.g0(new ah7(-14602694, -13935795, -14395293, -14203560, true, false));
                    return;
                }
                int i = this.L;
                if (B1 > 0) {
                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(B1));
                    gn5 l = gn5.l(i, 1, W1);
                    int c = W1 != null ? pc0.c(W1.id) : on2.f(0.2f, -16777216, -1);
                    imageReceiver.d0(l, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{on2.f(0.2f, c, -16777216), on2.f(0.4f, c, -16777216)}), null, W1, 0);
                    return;
                }
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-B1));
                gn5 a = gn5.a(1, L0);
                int c2 = L0 != null ? pc0.c(L0.id) : on2.f(0.2f, -16777216, -1);
                imageReceiver.d0(a, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{on2.f(0.2f, c2, -16777216), on2.f(0.4f, c2, -16777216)}), null, L0, 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.w;
        jb5 jb5Var = this.y;
        da5 da5Var = this.a;
        if (z) {
            float y = (da5Var.getY() + da5Var.getMeasuredHeight()) - da5Var.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z2 = this.h;
            s09 s09Var = this.U;
            if (z2 || this.f) {
                frameLayout.setAlpha(1.0f - jb5Var.n);
                s09Var.setAlpha(1.0f - jb5Var.n);
            } else if (this.b || this.r) {
                if (!g95.u5 && !g95.v5) {
                    measuredHeight = kt6.B(1.0f, jb5Var.a0, gm.L(90.0f) * jb5Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                s09Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - jb5Var.c);
                s09Var.setAlpha(1.0f - jb5Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                s09Var.setAlpha(1.0f);
            }
            boolean z3 = this.b;
            lka lkaVar = this.M;
            if (z3 || this.r) {
                lkaVar.setFullAlpha(jb5Var.c);
            } else {
                lkaVar.setFullAlpha(0.0f);
            }
            s09Var.setTranslationX(frameLayout.getX());
            s09Var.setTranslationY(measuredHeight - gm.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((da5Var.getMeasuredWidth() - (da5Var.P * 2.0f)) - gm.L(32.0f));
                imageView.setTranslationY(measuredHeight - gm.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - jb5Var.c, 1.0f - jb5Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.y0 ? 0.0f : gm.L(6.0f) * jb5Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            ob5 ob5Var = this.n0;
            if (ob5Var != null) {
                boolean z4 = ob5Var.e;
                float f = this.S;
                if (z4) {
                    if (f != 1.0f) {
                        float f2 = f + 0.053333335f;
                        this.S = f2;
                        if (f2 > 1.0f) {
                            this.S = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                } else if (f != 0.0f) {
                    float f3 = f - 0.053333335f;
                    this.S = f3;
                    if (f3 < 0.0f) {
                        this.S = 0.0f;
                    } else {
                        invalidate();
                    }
                }
            }
            float f4 = this.S;
            float f5 = (1.0f - jb5Var.n) * (1.0f - jb5Var.c) * f4;
            if (f4 > 0.0f) {
                int i = (int) (f5 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gm.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = gm.P;
                rectF.set(da5Var.getX() + da5Var.P, da5Var.getY() + da5Var.O, (da5Var.getX() + da5Var.getMeasuredWidth()) - da5Var.P, (da5Var.getY() + da5Var.getMeasuredHeight()) - da5Var.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f6 = da5Var.b;
                canvas.drawRoundRect(rectF, f6, f6, paint);
                canvas.restore();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.o0 || (view != this.a && view != this.b0)) {
            return super.drawChild(canvas, view, j);
        }
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gm.L(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.p0);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        ob5 ob5Var = this.n0;
        if (ob5Var != null) {
            this.H.l4.add(ob5Var);
            this.n0.b();
            ob5 ob5Var2 = this.n0;
            ob5Var2.c = null;
            ob5Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x != null) {
            da5 da5Var = this.a;
            zjc zjcVar = da5Var.d;
            zjc zjcVar2 = da5Var.d;
            if (zjcVar.getMeasuredHeight() == 0 || zjcVar2.getMeasuredWidth() == 0) {
                return;
            }
            zjcVar2.getRenderBufferBitmap(new wx4((Object) this, (byte) 8));
        }
    }

    public final void g(boolean z, boolean z2) {
        if (this.n != z) {
            this.n = z;
            j(!(this.c == null && this.e == null) && z2);
        }
    }

    public String getName() {
        long B1 = k47.B1(this.x.a.peer);
        boolean D = pg3.D(B1);
        int i = z8c.t0;
        return D ? m9c.r(oc7.r1(j5.a(i).a).W1(Long.valueOf(B1))) : oc7.r1(j5.a(i).a).L0(Long.valueOf(-B1)).title;
    }

    public n95 getPrimaryView() {
        return this.c;
    }

    public final void h(boolean z, boolean z2) {
        if (this.b != z) {
            this.b = z;
            this.R = true;
            j(z2);
        }
    }

    public final void i(float f, float f2, float f3, float f4, float f5, boolean z) {
        if (this.e0 == f && this.f0 == f2 && this.g0 == f3 && this.h0 == f4 && this.i0 == f5) {
            return;
        }
        this.j0 = z;
        this.e0 = f;
        this.f0 = f2;
        this.g0 = f3;
        this.h0 = f4;
        this.i0 = f5;
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (!this.Q) {
            this.a.invalidate();
        }
        n95 n95Var = this.c;
        if (n95Var != null) {
            n95Var.invalidate();
            g95 g95Var = this.H;
            if (g95Var.M4 == this.c) {
                g95Var.b.invalidate();
            }
        }
        l95 l95Var = this.d;
        if (l95Var != null) {
            l95Var.invalidate();
            if (this.d.getParent() != null) {
                ((View) this.d.getParent()).invalidate();
            }
        }
        if (getParent() != null) {
            ((View) getParent()).invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:322:0x01ba, code lost:
    
        if (r1 != false) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x049c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c2  */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z) {
        ob5 ob5Var;
        boolean z2;
        boolean z3;
        rd2 rd2Var;
        rd2 rd2Var2;
        boolean z4;
        String str;
        String str2;
        float f;
        boolean z5;
        boolean z6;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        rd2 rd2Var3;
        boolean z7;
        zjc zjcVar;
        boolean E;
        ga5 ga5Var;
        long B1;
        gn5 a;
        gn5 a2;
        TLRPC.Chat chat;
        boolean z8;
        Drawable y;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z9;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        rd2 rd2Var4;
        n95 n95Var;
        if (this.P) {
            return;
        }
        if (this.x == null && ((n95Var = this.c) != null || this.d != null || this.e != null)) {
            if (n95Var != null) {
                this.x = n95Var.getParticipant();
            } else {
                n95 n95Var2 = this.e;
                if (n95Var2 != null) {
                    this.x = n95Var2.getParticipant();
                } else {
                    this.x = this.d.getVideoParticipant();
                }
            }
        }
        boolean z10 = this.w;
        s09 s09Var = this.U;
        qd2 qd2Var = this.G;
        jb5 jb5Var = this.y;
        da5 da5Var = this.a;
        byte b = 1;
        byte b2 = 0;
        if (z10) {
            if (!this.b) {
                boolean z11 = VoIPService.getSharedInstance() == null;
                if (g95.w5 || (rd2Var4 = this.x) == null || (this.d == null && (!qd2.E(rd2Var4.a, rd2Var4.b, qd2Var) || (!qd2Var.x && this.x != qd2Var.z)))) {
                    z11 = true;
                }
                if (z11 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                    this.w = false;
                    f();
                    boolean z12 = gda.o() <= 0;
                    if (da5Var.c0 == null && z11) {
                        if (z12) {
                            jb5Var.e(this);
                        }
                        animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new qx((Object) this, (Object) this, z12, (byte) 5)).setDuration(150L).start();
                    } else {
                        if (jb5Var.s) {
                            np6 np6Var = this.A0;
                            if (np6Var != null) {
                                gm.r(np6Var);
                                this.A0 = null;
                            }
                            np6 np6Var2 = new np6((Object) this, z12, (Object) this, (byte) 25);
                            this.A0 = np6Var2;
                            gm.c3(np6Var2);
                        } else {
                            if (z12) {
                                jb5Var.removeView(this);
                            }
                            setVisibility(8);
                        }
                        if (z12) {
                            jb5Var.e(this);
                            e();
                        }
                    }
                    if (this.x.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        rd2 rd2Var5 = this.x;
                        sharedInstance.removeRemoteSink(rd2Var5.a, rd2Var5.b);
                    }
                    invalidate();
                    ValueAnimator valueAnimator2 = this.c0;
                    if (valueAnimator2 != null) {
                        valueAnimator2.removeAllListeners();
                        this.c0.cancel();
                    }
                }
            }
        } else {
            if (VoIPService.getSharedInstance() == null) {
                return;
            }
            n95 n95Var3 = this.c;
            if (n95Var3 != null || this.d != null || this.e != null || this.b) {
                if (n95Var3 != null) {
                    this.x = n95Var3.getParticipant();
                } else {
                    l95 l95Var = this.d;
                    if (l95Var != null) {
                        this.x = l95Var.getVideoParticipant();
                    } else {
                        n95 n95Var4 = this.e;
                        if (n95Var4 != null) {
                            this.x = n95Var4.getParticipant();
                        }
                    }
                }
                rd2 rd2Var6 = this.x;
                TLRPC.GroupCallParticipant groupCallParticipant = rd2Var6.a;
                boolean z13 = !groupCallParticipant.self ? !((qd2Var.x || rd2Var6 == qd2Var.z) && qd2.E(groupCallParticipant, rd2Var6.b, qd2Var)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.x.b) == 2);
                if (!this.b) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    rd2 rd2Var7 = this.x;
                    if (!sharedInstance2.isFullscreen(rd2Var7.a, rd2Var7.b)) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        rd2 rd2Var8 = this.x;
                        if (!sharedInstance3.isFullscreen(rd2Var8.a, rd2Var8.b)) {
                        }
                    }
                }
                this.w = true;
                g95 g95Var = this.H;
                if (g95Var.l4.size() > 0) {
                    ob5Var = (ob5) td4.m(1, g95Var.l4);
                    this.n0 = ob5Var;
                } else {
                    ob5Var = new ob5();
                    this.n0 = ob5Var;
                }
                ob5Var.g = this;
                ob5Var.c = s09Var;
                ob5Var.c(false);
                k(false);
                np6 np6Var3 = this.A0;
                if (np6Var3 != null) {
                    gm.r(np6Var3);
                    this.A0 = null;
                }
                if (getParent() == null) {
                    jb5Var.addView(this, qoe.e(46, 46, 51));
                    jb5Var.I.add(this);
                    long B12 = k47.B1(this.x.a.peer);
                    LongSparseIntArray longSparseIntArray = jb5Var.x;
                    longSparseIntArray.put(B12, longSparseIntArray.get(B12, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.R = true;
                this.F = false;
                animate().setListener(null).cancel();
                if (da5Var.c0 != null || this.d == null || this.c != null || da5Var.E == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.F = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new fa5(this, b2)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.V.setVisibility(this.x.b ? 0 : 8);
                z2 = true;
                z3 = false;
                rd2Var = this.x;
                rd2Var2 = qd2Var.z;
                lka lkaVar = this.M;
                if (rd2Var != rd2Var2) {
                    if (lkaVar.getVisibility() != 4) {
                        lkaVar.setVisibility(4);
                        s09Var.setVisibility(4);
                    }
                } else if (lkaVar.getVisibility() != 0) {
                    lkaVar.setVisibility(0);
                    s09Var.setVisibility(0);
                }
                z4 = this.w;
                int i2 = this.L;
                if (z4) {
                    str = null;
                } else {
                    boolean z14 = g95.v5 && (!jb5Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        l95 l95Var2 = this.d;
                        if (l95Var2 == null || this.c != null || jb5Var.b) {
                            if (!this.h) {
                                if (l95Var2 == null || this.c != null) {
                                    n95 n95Var5 = this.e;
                                    if (n95Var5 == null || !z14) {
                                        n95 n95Var6 = this.c;
                                        if ((n95Var6 == null || l95Var2 != null) && this.n) {
                                            if (n95Var6 != null) {
                                                i = gm.L(80.0f);
                                            }
                                        } else if (n95Var6 != null) {
                                            f = n95Var6.a;
                                            z5 = true;
                                            z6 = false;
                                        } else {
                                            i = gm.L(46.0f);
                                        }
                                    } else {
                                        float f2 = n95Var5.a;
                                        z6 = n95Var5.b.e.size();
                                        z5 = true;
                                        f = f2;
                                    }
                                    i = -1;
                                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                    if (i != 0 && (marginLayoutParams.height != i || z2 || this.I != z5 || ((z5 && this.J != f) || z6))) {
                                        marginLayoutParams.height = i;
                                        if (z5) {
                                            i = -1;
                                        }
                                        marginLayoutParams.width = i;
                                        this.I = z5;
                                        this.J = f;
                                        this.R = true;
                                        if (z3) {
                                            da5Var.requestLayout();
                                        } else {
                                            da5Var.a();
                                            this.s = true;
                                        }
                                        gm.c3(new qn4(this, (byte) 23));
                                        jb5Var.requestLayout();
                                        invalidate();
                                    }
                                    rd2Var3 = this.x;
                                    if (rd2Var3.a.self || rd2Var3.b || VoIPService.getSharedInstance() == null) {
                                        zjc zjcVar2 = da5Var.d;
                                        zjc zjcVar3 = da5Var.d;
                                        zjcVar2.setMirror(false);
                                        zjcVar3.setRotateTextureWithScreen(true);
                                        zjcVar3.setUseCameraRotation(false);
                                    } else {
                                        zjc zjcVar4 = da5Var.d;
                                        zjc zjcVar5 = da5Var.d;
                                        zjcVar4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        zjcVar5.setRotateTextureWithScreen(true);
                                        zjcVar5.setUseCameraRotation(true);
                                    }
                                    z7 = da5Var.a;
                                    zjcVar = da5Var.d;
                                    if (!z7) {
                                        ((WindowManager) da5Var.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.x.a.self) {
                                        zjcVar.setMaxTextureSize(0);
                                    } else {
                                        zjcVar.setMaxTextureSize(720);
                                    }
                                    rd2 rd2Var9 = this.x;
                                    E = qd2.E(rd2Var9.a, rd2Var9.b, qd2Var);
                                    ga5Var = this.b0;
                                    if (E || !(qd2Var.x || this.x == qd2Var.z)) {
                                        ImageReceiver imageReceiver = ga5Var.a;
                                        pc0 pc0Var = ga5Var.c;
                                        imageReceiver.d = i2;
                                        B1 = k47.B1(this.x.a.peer);
                                        if (pg3.D(B1)) {
                                            TLRPC.Chat L0 = oc7.r1(j5.a(z8c.t0).a).L0(Long.valueOf(-B1));
                                            pc0Var.p(L0);
                                            a = gn5.a(0, L0);
                                            a2 = gn5.a(1, L0);
                                            chat = L0;
                                        } else {
                                            TLRPC.User W1 = oc7.r1(j5.a(i2).a).W1(Long.valueOf(B1));
                                            pc0Var.q(W1);
                                            a = gn5.l(i2, 0, W1);
                                            a2 = gn5.l(i2, 1, W1);
                                            chat = W1;
                                        }
                                        TLRPC.Chat chat2 = chat;
                                        gn5 gn5Var = a;
                                        ga5Var.a.d0(gn5Var, null, (a2 != null || (y = fn5.z().y(a2.f)) == null) ? pc0Var : y, null, chat2, 0);
                                        ga5Var.b.d0(gn5Var, "50_50_b", new ColorDrawable(cmb.w0(null, cmb.jh, false)), null, chat2, 0);
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                    boolean z15 = (z3 || this.d == null || this.b || z8) ? false : true;
                                    if (z8 != this.W && !z15) {
                                        this.W = z8;
                                        valueAnimator = this.c0;
                                        if (valueAnimator != null) {
                                            valueAnimator.removeAllListeners();
                                            this.c0.cancel();
                                        }
                                        boolean z16 = this.W;
                                        if (z3) {
                                            this.a0 = z16 ? 0.0f : 1.0f;
                                            ga5Var.setVisibility(z16 ? 8 : 0);
                                            ga5Var.setAlpha(this.a0);
                                            da5Var.invalidate();
                                        } else {
                                            if (!z16 && ga5Var.getVisibility() != 0) {
                                                ga5Var.setVisibility(0);
                                                ga5Var.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, this.W ? 0.0f : 1.0f);
                                            this.c0 = ofFloat;
                                            ofFloat.addUpdateListener(new ba5(this, b2));
                                            this.c0.addListener(new fa5(this, b));
                                            this.c0.start();
                                        }
                                        if (this.W) {
                                            ga5Var.a(false);
                                        }
                                    }
                                    if (this.x.a.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(zjcVar, this.x.b);
                                    }
                                    ob5 ob5Var2 = this.n0;
                                    ob5Var2.h = this.x.a;
                                    ob5Var2.c(z3);
                                    if (ga5Var.getVisibility() == 0) {
                                        ga5Var.a(true);
                                    }
                                    rd2 rd2Var10 = this.x;
                                    boolean z17 = rd2Var10.b;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = rd2Var10.a;
                                    z9 = z17 ? !((tL_groupCallParticipantVideo = groupCallParticipant2.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = groupCallParticipant2.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.s0 != z9) {
                                        this.s0 = z9;
                                        zjcVar.animate().alpha(this.s0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        da5Var.invalidate();
                                    }
                                    if (g95.w5 && this.W) {
                                        if (!zjcVar.isFirstFrameRendered()) {
                                            d();
                                        }
                                        if (this.x.a.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(zjcVar, this.x.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            rd2 rd2Var11 = this.x;
                                            str = null;
                                            sharedInstance4.addRemoteSink(rd2Var11.a, rd2Var11.b, zjcVar, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            rd2 rd2Var12 = this.x;
                                            sharedInstance5.addRemoteSink(rd2Var12.a, rd2Var12.b, zjcVar, null);
                                        }
                                        str = null;
                                    } else {
                                        if (this.x.a.self) {
                                            str = null;
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                                                rd2 rd2Var13 = this.x;
                                                sharedInstance6.removeRemoteSink(rd2Var13.a, rd2Var13.b);
                                                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                                                rd2 rd2Var14 = this.x;
                                                sharedInstance7.removeRemoteSink(rd2Var14.a, rd2Var14.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            str = null;
                                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                                        } else {
                                            str = null;
                                        }
                                        if (g95.w5 && zjcVar.isFirstFrameRendered()) {
                                            f();
                                            zjcVar.clearFirstFrame();
                                            zjcVar.setAlpha(0.0f);
                                            da5Var.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i = gm.L(80.0f);
                                }
                                f = 1.0f;
                                z5 = false;
                                z6 = z5;
                                marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                                if (i != 0) {
                                    marginLayoutParams.height = i;
                                    if (z5) {
                                    }
                                    marginLayoutParams.width = i;
                                    this.I = z5;
                                    this.J = f;
                                    this.R = true;
                                    if (z3) {
                                    }
                                    gm.c3(new qn4(this, (byte) 23));
                                    jb5Var.requestLayout();
                                    invalidate();
                                }
                                rd2Var3 = this.x;
                                if (rd2Var3.a.self) {
                                }
                                zjc zjcVar22 = da5Var.d;
                                zjc zjcVar32 = da5Var.d;
                                zjcVar22.setMirror(false);
                                zjcVar32.setRotateTextureWithScreen(true);
                                zjcVar32.setUseCameraRotation(false);
                                z7 = da5Var.a;
                                zjcVar = da5Var.d;
                                if (!z7) {
                                }
                                if (this.x.a.self) {
                                }
                                rd2 rd2Var92 = this.x;
                                E = qd2.E(rd2Var92.a, rd2Var92.b, qd2Var);
                                ga5Var = this.b0;
                                if (E) {
                                }
                                ImageReceiver imageReceiver2 = ga5Var.a;
                                pc0 pc0Var2 = ga5Var.c;
                                imageReceiver2.d = i2;
                                B1 = k47.B1(this.x.a.peer);
                                if (pg3.D(B1)) {
                                }
                                TLRPC.Chat chat22 = chat;
                                gn5 gn5Var2 = a;
                                ga5Var.a.d0(gn5Var2, null, (a2 != null || (y = fn5.z().y(a2.f)) == null) ? pc0Var2 : y, null, chat22, 0);
                                ga5Var.b.d0(gn5Var2, "50_50_b", new ColorDrawable(cmb.w0(null, cmb.jh, false)), null, chat22, 0);
                                z8 = false;
                                if (z3) {
                                }
                                if (z8 != this.W) {
                                    this.W = z8;
                                    valueAnimator = this.c0;
                                    if (valueAnimator != null) {
                                    }
                                    boolean z162 = this.W;
                                    if (z3) {
                                    }
                                    if (this.W) {
                                    }
                                }
                                if (this.x.a.self) {
                                    VoIPService.getSharedInstance().setLocalSink(zjcVar, this.x.b);
                                }
                                ob5 ob5Var22 = this.n0;
                                ob5Var22.h = this.x.a;
                                ob5Var22.c(z3);
                                if (ga5Var.getVisibility() == 0) {
                                }
                                rd2 rd2Var102 = this.x;
                                boolean z172 = rd2Var102.b;
                                TLRPC.GroupCallParticipant groupCallParticipant22 = rd2Var102.a;
                                if (z172) {
                                }
                                if (this.s0 != z9) {
                                }
                                if (g95.w5) {
                                }
                                if (this.x.a.self) {
                                }
                                if (g95.w5) {
                                    f();
                                    zjcVar.clearFirstFrame();
                                    zjcVar.setAlpha(0.0f);
                                    da5Var.e.setAlpha(0.0f);
                                }
                                k(true);
                            }
                        }
                        f = 1.0f;
                        i = 0;
                        z5 = false;
                        z6 = z5;
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                        if (i != 0) {
                        }
                        rd2Var3 = this.x;
                        if (rd2Var3.a.self) {
                        }
                        zjc zjcVar222 = da5Var.d;
                        zjc zjcVar322 = da5Var.d;
                        zjcVar222.setMirror(false);
                        zjcVar322.setRotateTextureWithScreen(true);
                        zjcVar322.setUseCameraRotation(false);
                        z7 = da5Var.a;
                        zjcVar = da5Var.d;
                        if (!z7) {
                        }
                        if (this.x.a.self) {
                        }
                        rd2 rd2Var922 = this.x;
                        E = qd2.E(rd2Var922.a, rd2Var922.b, qd2Var);
                        ga5Var = this.b0;
                        if (E) {
                        }
                        ImageReceiver imageReceiver22 = ga5Var.a;
                        pc0 pc0Var22 = ga5Var.c;
                        imageReceiver22.d = i2;
                        B1 = k47.B1(this.x.a.peer);
                        if (pg3.D(B1)) {
                        }
                        TLRPC.Chat chat222 = chat;
                        gn5 gn5Var22 = a;
                        ga5Var.a.d0(gn5Var22, null, (a2 != null || (y = fn5.z().y(a2.f)) == null) ? pc0Var22 : y, null, chat222, 0);
                        ga5Var.b.d0(gn5Var22, "50_50_b", new ColorDrawable(cmb.w0(null, cmb.jh, false)), null, chat222, 0);
                        z8 = false;
                        if (z3) {
                        }
                        if (z8 != this.W) {
                        }
                        if (this.x.a.self) {
                        }
                        ob5 ob5Var222 = this.n0;
                        ob5Var222.h = this.x.a;
                        ob5Var222.c(z3);
                        if (ga5Var.getVisibility() == 0) {
                        }
                        rd2 rd2Var1022 = this.x;
                        boolean z1722 = rd2Var1022.b;
                        TLRPC.GroupCallParticipant groupCallParticipant222 = rd2Var1022.a;
                        if (z1722) {
                        }
                        if (this.s0 != z9) {
                        }
                        if (g95.w5) {
                        }
                        if (this.x.a.self) {
                        }
                        if (g95.w5) {
                        }
                        k(true);
                    }
                    f = 1.0f;
                    z5 = false;
                    z6 = false;
                    i = -1;
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                    if (i != 0) {
                    }
                    rd2Var3 = this.x;
                    if (rd2Var3.a.self) {
                    }
                    zjc zjcVar2222 = da5Var.d;
                    zjc zjcVar3222 = da5Var.d;
                    zjcVar2222.setMirror(false);
                    zjcVar3222.setRotateTextureWithScreen(true);
                    zjcVar3222.setUseCameraRotation(false);
                    z7 = da5Var.a;
                    zjcVar = da5Var.d;
                    if (!z7) {
                    }
                    if (this.x.a.self) {
                    }
                    rd2 rd2Var9222 = this.x;
                    E = qd2.E(rd2Var9222.a, rd2Var9222.b, qd2Var);
                    ga5Var = this.b0;
                    if (E) {
                    }
                    ImageReceiver imageReceiver222 = ga5Var.a;
                    pc0 pc0Var222 = ga5Var.c;
                    imageReceiver222.d = i2;
                    B1 = k47.B1(this.x.a.peer);
                    if (pg3.D(B1)) {
                    }
                    TLRPC.Chat chat2222 = chat;
                    gn5 gn5Var222 = a;
                    ga5Var.a.d0(gn5Var222, null, (a2 != null || (y = fn5.z().y(a2.f)) == null) ? pc0Var222 : y, null, chat2222, 0);
                    ga5Var.b.d0(gn5Var222, "50_50_b", new ColorDrawable(cmb.w0(null, cmb.jh, false)), null, chat2222, 0);
                    z8 = false;
                    if (z3) {
                    }
                    if (z8 != this.W) {
                    }
                    if (this.x.a.self) {
                    }
                    ob5 ob5Var2222 = this.n0;
                    ob5Var2222.h = this.x.a;
                    ob5Var2222.c(z3);
                    if (ga5Var.getVisibility() == 0) {
                    }
                    rd2 rd2Var10222 = this.x;
                    boolean z17222 = rd2Var10222.b;
                    TLRPC.GroupCallParticipant groupCallParticipant2222 = rd2Var10222.a;
                    if (z17222) {
                    }
                    if (this.s0 != z9) {
                    }
                    if (g95.w5) {
                    }
                    if (this.x.a.self) {
                    }
                    if (g95.w5) {
                    }
                    k(true);
                }
                if (this.w) {
                    return;
                }
                long B13 = k47.B1(this.x.a.peer);
                if (pg3.D(B13)) {
                    str2 = m9c.r(oc7.r1(j5.a(i2).a).W1(Long.valueOf(B13)));
                } else {
                    TLRPC.Chat L02 = oc7.r1(j5.a(i2).a).L0(Long.valueOf(-B13));
                    str2 = L02 != null ? L02.title : str;
                }
                lkaVar.l(str2, false);
                return;
            }
        }
        z3 = z;
        z2 = false;
        rd2Var = this.x;
        rd2Var2 = qd2Var.z;
        lka lkaVar2 = this.M;
        if (rd2Var != rd2Var2) {
        }
        z4 = this.w;
        int i22 = this.L;
        if (z4) {
        }
        if (this.w) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(boolean z) {
        int w0;
        int i;
        int w02;
        ob5 ob5Var = this.n0;
        if (ob5Var == null) {
            return;
        }
        if (ob5Var.k) {
            w02 = cmb.w0(null, cmb.ih, false);
        } else {
            if (!ob5Var.e) {
                w0 = cmb.w0(null, cmb.gh, false);
                i = -1;
                if (this.C0 != i) {
                    return;
                }
                ValueAnimator valueAnimator = this.E0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.E0.cancel();
                }
                if (!z) {
                    this.D0 = w0;
                    this.T.setColor(w0);
                    return;
                }
                int i2 = this.B0;
                int i3 = this.D0;
                this.C0 = i;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.E0 = ofFloat;
                ofFloat.addUpdateListener(new k95(this, i2, i, i3, w0, (byte) 1));
                this.E0.addListener(new lx0(this, i, w0, (byte) 2));
                this.E0.start();
                return;
            }
            w02 = cmb.w0(null, cmb.gh, false);
        }
        i = w02;
        w0 = i;
        if (this.C0 != i) {
        }
    }

    public final void l(int i) {
        int measuredWidth = this.y.getMeasuredWidth() - gm.L(6.0f);
        if ((this.F0 == i || i <= 0) && (this.G0 == measuredWidth || measuredWidth <= 0)) {
            return;
        }
        if (i != 0) {
            this.F0 = i;
        }
        if (measuredWidth != 0) {
            this.G0 = measuredWidth;
        }
        this.M.h(measuredWidth - i, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l0.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l0.K();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float size;
        int L;
        n95 n95Var;
        float f;
        int L2;
        FrameLayout frameLayout = this.K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        boolean z = this.d0;
        boolean z2 = g95.u5;
        if (z != z2) {
            this.R = true;
            this.d0 = z2;
        }
        int L3 = gm.L(2.0f);
        layoutParams.rightMargin = L3;
        layoutParams.leftMargin = L3;
        boolean z3 = this.s;
        s09 s09Var = this.U;
        lka lkaVar = this.M;
        if (z3) {
            lkaVar.animate().scaleX(1.0f).scaleY(1.0f).start();
            s09Var.animate().scaleX(1.0f).scaleY(1.0f).start();
        } else {
            lkaVar.animate().cancel();
            lkaVar.setScaleX(1.0f);
            lkaVar.setScaleY(1.0f);
            s09Var.animate().cancel();
            s09Var.setScaleX(1.0f);
            s09Var.setScaleY(1.0f);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.w0 = 1.0f;
            if (g95.v5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - gm.L(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - gm.L(4.0f), TLObject.FLAG_30));
            } else if (g95.u5) {
                super.onMeasure(wi8.f(92.0f, View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - gm.L(92.0f), TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.w0 = 1.0f;
            int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) - (gm.L(14.0f) << 1);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
        } else if (this.I) {
            this.w0 = 1.0f;
            int i4 = 6;
            if ((!g95.v5 || this.e == null) && !g95.u5) {
                i4 = 2;
            }
            if (this.e != null) {
                L = View.MeasureSpec.getSize(i) - gm.L(344.0f);
            } else if (g95.v5) {
                L = gm.L(320.0f);
            } else {
                size = (View.MeasureSpec.getSize(i) - (gm.L(14.0f) << 1)) + (g95.u5 ? -gm.L(90.0f) : 0);
                float f2 = (this.J / i4) * size;
                n95Var = this.e;
                if (n95Var == null) {
                    f = n95Var.getItemHeight() - gm.L(4.0f);
                    L2 = gm.L(4.0f);
                } else {
                    if (g95.v5) {
                        f = size / 2.0f;
                    } else {
                        f = size / (g95.u5 ? 3 : 2);
                    }
                    L2 = gm.L(2.0f);
                }
                float f3 = f2 - L2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float L4 = this.V.getVisibility() != 0 ? f3 - gm.L(28.0f) : f3;
                l((int) L4);
                layoutParams2.width = (int) (L4 - (layoutParams2.leftMargin << 1));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f, TLObject.FLAG_30));
            }
            size = L;
            float f22 = (this.J / i4) * size;
            n95Var = this.e;
            if (n95Var == null) {
            }
            float f32 = f22 - L2;
            FrameLayout.LayoutParams layoutParams22 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (this.V.getVisibility() != 0) {
            }
            l((int) L4);
            layoutParams22.width = (int) (L4 - (layoutParams22.leftMargin << 1));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f32, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f, TLObject.FLAG_30));
        } else {
            this.w0 = 0.0f;
            super.onMeasure(i, i2);
        }
        int size2 = View.MeasureSpec.getSize(i2) + (View.MeasureSpec.getSize(i) << 16);
        if (this.N != size2) {
            this.N = size2;
            this.E.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(120.0f), 0, on2.p(-16777216, nm7.E1), Shader.TileMode.CLAMP));
        }
        lkaVar.setPivotX(0.0f);
        lkaVar.setPivotY(lkaVar.getMeasuredHeight() / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 < 0.0f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAmplitude(double d) {
        this.n0.a(d);
        ga5 ga5Var = this.b0;
        ga5Var.getClass();
        float f = ((float) d) / 80.0f;
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        ga5Var.r = f;
        ga5Var.s = (f - ga5Var.n) / 200.0f;
    }

    public void setPrimaryView(n95 n95Var) {
        if (this.c != n95Var) {
            this.c = n95Var;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(l95 l95Var) {
        if (this.d != l95Var) {
            this.d = l95Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(n95 n95Var) {
        if (this.e != n95Var) {
            this.e = n95Var;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
