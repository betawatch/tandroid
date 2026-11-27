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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ka5 extends FrameLayout implements qb5 {
    public ds6 A0;
    public int B0;
    public int C0;
    public int D0;
    public final Paint E;
    public ValueAnimator E0;
    public boolean F;
    public int F0;
    public final vc2 G;
    public int G0;
    public final j95 H;
    public ValueAnimator H0;
    public boolean I;
    public boolean I0;
    public float J;
    public final FrameLayout K;
    public final int L;
    public final ema M;
    public int N;
    public final fx0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final e29 U;
    public final ImageView V;
    public boolean W;
    public final ga5 a;
    public float a0;
    public boolean b;
    public final ja5 b0;
    public q95 c;
    public ValueAnimator c0;
    public o95 d;
    public boolean d0;
    public q95 e;
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
    public rb5 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final c43 u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public wc2 x;
    public ImageView x0;
    public final mb5 y;
    public boolean y0;
    public final Rect z0;

    public ka5(mb5 mb5Var, vc2 vc2Var, j95 j95Var) {
        super(mb5Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.z0 = new Rect();
        this.G = vc2Var;
        int i = j95Var.a;
        this.L = i;
        c43 c43Var = new c43(mb5Var.getContext(), R.drawable.calls_video, -1);
        this.u0 = c43Var;
        c43Var.a(true, false);
        float f = -hl.L(4.0f);
        float L = hl.L(6.0f);
        float L2 = hl.L(6.0f);
        c43Var.i = f;
        c43Var.j = L;
        c43Var.k = L2;
        c43Var.invalidateSelf();
        float N = hl.N(3.4f);
        c43Var.c.setStrokeWidth(N);
        c43Var.d.setStrokeWidth(N * 1.47f);
        this.v0 = mb5Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(hl.o());
        textPaint2.setTextSize(hl.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = ob6.M0(2131742876, null);
        String M02 = ob6.M0(2131742873, null);
        int L3 = hl.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L3, alignment, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(ob6.a0("VoipVideoNotAvailable", null, 2131742878, ob6.G(uc7.s1(i).l4.U0.f(), "Participants", new Object[0])), textPaint, hl.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M03 = ob6.M0(2131742874, null);
        ga5 ga5Var = new ga5(this, mb5Var.getContext(), vc2Var, mb5Var, textPaint, staticLayout2, textPaint2, M03, textPaint2.measureText(M03), staticLayout, j95Var, M0, textPaint.measureText(M0));
        this.a = ga5Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        gmc gmcVar = ga5Var.d;
        gmcVar.setScalingType(scalingType);
        this.y = mb5Var;
        this.H = j95Var;
        gmcVar.b(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ha5(this));
        TextureView textureView = ga5Var.e;
        if (textureView != null) {
            gmcVar.setBackgroundRenderer(textureView);
            if (!gmcVar.c.P) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        gmcVar.setAlpha(0.0f);
        addView(ga5Var);
        ja5 ja5Var = new ja5(this, getContext());
        this.b0 = ja5Var;
        addView(ja5Var);
        ema emaVar = new ema(mb5Var.getContext());
        this.M = emaVar;
        emaVar.setTextSize(13);
        emaVar.setTextColor(vm2.o(-1, jn7.F3));
        emaVar.setTypeface(hl.o());
        emaVar.setFullTextMaxLines(1);
        emaVar.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(mb5Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(emaVar, tre.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, tre.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setColor(aob.w0(null, aob.hh, false));
        frameLayout.setClipChildren(false);
        e29 e29Var = new e29(mb5Var.getContext());
        this.U = e29Var;
        addView(e29Var, tre.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(mb5Var.getContext());
        this.V = imageView;
        addView(imageView, tre.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        imageView.setImageDrawable(mb5Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L4 = hl.L(19.0f);
        int o = vm2.o(-1, 100);
        hf0 i0 = aob.i0(L4, L4, L4, L4, 0, o, o);
        fx0 fx0Var = new fx0((byte) 3, mb5Var.getContext(), this);
        this.O = fx0Var;
        fx0Var.setText(ob6.M0(2131742872, null));
        fx0Var.setTextSize(1, 15.0f);
        fx0Var.setTypeface(hl.o());
        fx0Var.setPadding(hl.L(21.0f), 0, hl.L(21.0f), 0);
        fx0Var.setTextColor(-1);
        fx0Var.setBackground(i0);
        fx0Var.setGravity(17);
        fx0Var.setOnClickListener(new mh3(this, (byte) 28));
        addView(fx0Var, tre.e(-2, 38, 51));
    }

    public static ka5 c(ArrayList arrayList, g75 g75Var, q95 q95Var, o95 o95Var, q95 q95Var2, wc2 wc2Var, vc2 vc2Var, j95 j95Var) {
        ka5 ka5Var;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                ka5Var = null;
                break;
            }
            if (wc2Var.equals(((ka5) arrayList.get(i)).x)) {
                ka5Var = (ka5) arrayList.get(i);
                break;
            }
            i++;
        }
        if (ka5Var == null) {
            ka5Var = new ka5(g75Var, vc2Var, j95Var);
        }
        if (q95Var != null) {
            ka5Var.setPrimaryView(q95Var);
        }
        if (o95Var != null) {
            ka5Var.setSecondaryView(o95Var);
        }
        if (q95Var2 != null) {
            ka5Var.setTabletGridView(q95Var2);
        }
        return ka5Var;
    }

    @Override // qb5
    public final void a() {
        invalidate();
        k(true);
        ja5 ja5Var = this.b0;
        if (ja5Var.getVisibility() == 0) {
            ja5Var.a(true);
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
                wc2 wc2Var = this.x;
                sharedInstance.removeRemoteSink(wc2Var.a, wc2Var.b);
            }
        }
        f();
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.c0.cancel();
        }
        this.a.d.e();
    }

    public final void d() {
        if (this.q0 == null) {
            HashMap hashMap = this.G.h;
            wc2 wc2Var = this.x;
            boolean z = wc2Var.b;
            TLRPC.GroupCallParticipant groupCallParticipant = wc2Var.a;
            Bitmap bitmap = (Bitmap) hashMap.get(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
            this.q0 = bitmap;
            this.a.setThumb(bitmap);
            if (this.q0 == null) {
                long B1 = r47.B1(this.x.a.peer);
                wc2 wc2Var2 = this.x;
                boolean z2 = wc2Var2.a.self;
                ImageReceiver imageReceiver = this.l0;
                if (z2 && wc2Var2.b) {
                    imageReceiver.g0(new ih7(-14602694, -13935795, -14395293, -14203560, true, false));
                    return;
                }
                int i = this.L;
                if (B1 > 0) {
                    TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(B1));
                    jn5 l = jn5.l(i, 1, X1);
                    int c = X1 != null ? rb0.c(X1.id) : vm2.f(0.2f, -16777216, -1);
                    imageReceiver.d0(l, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{vm2.f(0.2f, c, -16777216), vm2.f(0.4f, c, -16777216)}), null, X1, 0);
                    return;
                }
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-B1));
                jn5 a = jn5.a(1, M0);
                int c2 = M0 != null ? rb0.c(M0.id) : vm2.f(0.2f, -16777216, -1);
                imageReceiver.d0(a, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{vm2.f(0.2f, c2, -16777216), vm2.f(0.4f, c2, -16777216)}), null, M0, 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.w;
        mb5 mb5Var = this.y;
        ga5 ga5Var = this.a;
        if (z) {
            float y = (ga5Var.getY() + ga5Var.getMeasuredHeight()) - ga5Var.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z2 = this.h;
            e29 e29Var = this.U;
            if (z2 || this.f) {
                frameLayout.setAlpha(1.0f - mb5Var.n);
                e29Var.setAlpha(1.0f - mb5Var.n);
            } else if (this.b || this.r) {
                if (!j95.u5 && !j95.v5) {
                    measuredHeight = qu6.B(1.0f, mb5Var.a0, hl.L(90.0f) * mb5Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                e29Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - mb5Var.c);
                e29Var.setAlpha(1.0f - mb5Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                e29Var.setAlpha(1.0f);
            }
            boolean z3 = this.b;
            ema emaVar = this.M;
            if (z3 || this.r) {
                emaVar.setFullAlpha(mb5Var.c);
            } else {
                emaVar.setFullAlpha(0.0f);
            }
            e29Var.setTranslationX(frameLayout.getX());
            e29Var.setTranslationY(measuredHeight - hl.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((ga5Var.getMeasuredWidth() - (ga5Var.P * 2.0f)) - hl.L(32.0f));
                imageView.setTranslationY(measuredHeight - hl.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - mb5Var.c, 1.0f - mb5Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.y0 ? 0.0f : hl.L(6.0f) * mb5Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            rb5 rb5Var = this.n0;
            if (rb5Var != null) {
                boolean z4 = rb5Var.e;
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
            float f5 = (1.0f - mb5Var.n) * (1.0f - mb5Var.c) * f4;
            if (f4 > 0.0f) {
                int i = (int) (f5 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / hl.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = hl.P;
                rectF.set(ga5Var.getX() + ga5Var.P, ga5Var.getY() + ga5Var.O, (ga5Var.getX() + ga5Var.getMeasuredWidth()) - ga5Var.P, (ga5Var.getY() + ga5Var.getMeasuredHeight()) - ga5Var.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f6 = ga5Var.b;
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
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / hl.L(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.p0);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.e();
        rb5 rb5Var = this.n0;
        if (rb5Var != null) {
            this.H.l4.add(rb5Var);
            this.n0.b();
            rb5 rb5Var2 = this.n0;
            rb5Var2.c = null;
            rb5Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x == null || this.a.d.getMeasuredHeight() == 0 || this.a.d.getMeasuredWidth() == 0) {
            return;
        }
        e05 e05Var = new e05((Object) this, (byte) 7);
        anb anbVar = this.a.d.c;
        synchronized (anbVar.c) {
            try {
                d1 d1Var = anbVar.d;
                if (d1Var != null) {
                    d1Var.post(new c9c(anbVar, e05Var, (byte) 27));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public final void g(boolean z, boolean z2) {
        if (this.n != z) {
            this.n = z;
            j(!(this.c == null && this.e == null) && z2);
        }
    }

    public String getName() {
        long B1 = r47.B1(this.x.a.peer);
        boolean D = wf3.D(B1);
        int i = yac.t0;
        return D ? lbc.r(uc7.s1(k5.a(i).a).X1(Long.valueOf(B1))) : uc7.s1(k5.a(i).a).M0(Long.valueOf(-B1)).title;
    }

    public q95 getPrimaryView() {
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
        q95 q95Var = this.c;
        if (q95Var != null) {
            q95Var.invalidate();
            j95 j95Var = this.H;
            if (j95Var.M4 == this.c) {
                j95Var.b.invalidate();
            }
        }
        o95 o95Var = this.d;
        if (o95Var != null) {
            o95Var.invalidate();
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
    /* JADX WARN: Removed duplicated region for block: B:129:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c2  */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z) {
        rb5 rb5Var;
        boolean z2;
        boolean z3;
        wc2 wc2Var;
        wc2 wc2Var2;
        boolean z4;
        String str;
        String str2;
        float f;
        boolean z5;
        boolean z6;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        wc2 wc2Var3;
        boolean z7;
        gmc gmcVar;
        boolean E;
        ja5 ja5Var;
        long B1;
        jn5 a;
        jn5 a2;
        TLRPC.Chat chat;
        boolean z8;
        Drawable y;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z9;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        wc2 wc2Var4;
        q95 q95Var;
        if (this.P) {
            return;
        }
        if (this.x == null && ((q95Var = this.c) != null || this.d != null || this.e != null)) {
            if (q95Var != null) {
                this.x = q95Var.getParticipant();
            } else {
                q95 q95Var2 = this.e;
                if (q95Var2 != null) {
                    this.x = q95Var2.getParticipant();
                } else {
                    this.x = this.d.getVideoParticipant();
                }
            }
        }
        boolean z10 = this.w;
        e29 e29Var = this.U;
        vc2 vc2Var = this.G;
        mb5 mb5Var = this.y;
        ga5 ga5Var = this.a;
        byte b = 1;
        byte b2 = 0;
        if (z10) {
            if (!this.b) {
                boolean z11 = VoIPService.getSharedInstance() == null;
                if (j95.w5 || (wc2Var4 = this.x) == null || (this.d == null && (!vc2.E(wc2Var4.a, wc2Var4.b, vc2Var) || (!vc2Var.x && this.x != vc2Var.z)))) {
                    z11 = true;
                }
                if (z11 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                    this.w = false;
                    f();
                    boolean z12 = xea.o() <= 0;
                    if (ga5Var.c0 == null && z11) {
                        if (z12) {
                            mb5Var.e(this);
                        }
                        animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new rw((Object) this, (Object) this, z12, (byte) 5)).setDuration(150L).start();
                    } else {
                        if (mb5Var.s) {
                            ds6 ds6Var = this.A0;
                            if (ds6Var != null) {
                                hl.r(ds6Var);
                                this.A0 = null;
                            }
                            ds6 ds6Var2 = new ds6((Object) this, z12, (Object) this, (byte) 24);
                            this.A0 = ds6Var2;
                            hl.c3(ds6Var2);
                        } else {
                            if (z12) {
                                mb5Var.removeView(this);
                            }
                            setVisibility(8);
                        }
                        if (z12) {
                            mb5Var.e(this);
                            e();
                        }
                    }
                    if (this.x.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        wc2 wc2Var5 = this.x;
                        sharedInstance.removeRemoteSink(wc2Var5.a, wc2Var5.b);
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
            q95 q95Var3 = this.c;
            if (q95Var3 != null || this.d != null || this.e != null || this.b) {
                if (q95Var3 != null) {
                    this.x = q95Var3.getParticipant();
                } else {
                    o95 o95Var = this.d;
                    if (o95Var != null) {
                        this.x = o95Var.getVideoParticipant();
                    } else {
                        q95 q95Var4 = this.e;
                        if (q95Var4 != null) {
                            this.x = q95Var4.getParticipant();
                        }
                    }
                }
                wc2 wc2Var6 = this.x;
                TLRPC.GroupCallParticipant groupCallParticipant = wc2Var6.a;
                boolean z13 = !groupCallParticipant.self ? !((vc2Var.x || wc2Var6 == vc2Var.z) && vc2.E(groupCallParticipant, wc2Var6.b, vc2Var)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.x.b) == 2);
                if (!this.b) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    wc2 wc2Var7 = this.x;
                    if (!sharedInstance2.isFullscreen(wc2Var7.a, wc2Var7.b)) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        wc2 wc2Var8 = this.x;
                        if (!sharedInstance3.isFullscreen(wc2Var8.a, wc2Var8.b)) {
                        }
                    }
                }
                this.w = true;
                j95 j95Var = this.H;
                if (j95Var.l4.size() > 0) {
                    rb5Var = (rb5) qd4.l(1, j95Var.l4);
                    this.n0 = rb5Var;
                } else {
                    rb5Var = new rb5();
                    this.n0 = rb5Var;
                }
                rb5Var.g = this;
                rb5Var.c = e29Var;
                rb5Var.c(false);
                k(false);
                ds6 ds6Var3 = this.A0;
                if (ds6Var3 != null) {
                    hl.r(ds6Var3);
                    this.A0 = null;
                }
                if (getParent() == null) {
                    mb5Var.addView(this, tre.e(46, 46, 51));
                    mb5Var.I.add(this);
                    long B12 = r47.B1(this.x.a.peer);
                    LongSparseIntArray longSparseIntArray = mb5Var.x;
                    longSparseIntArray.put(B12, longSparseIntArray.get(B12, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.R = true;
                this.F = false;
                animate().setListener(null).cancel();
                if (ga5Var.c0 != null || this.d == null || this.c != null || ga5Var.E == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.F = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new ia5(this, b2)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.V.setVisibility(this.x.b ? 0 : 8);
                z2 = true;
                z3 = false;
                wc2Var = this.x;
                wc2Var2 = vc2Var.z;
                ema emaVar = this.M;
                if (wc2Var != wc2Var2) {
                    if (emaVar.getVisibility() != 4) {
                        emaVar.setVisibility(4);
                        e29Var.setVisibility(4);
                    }
                } else if (emaVar.getVisibility() != 0) {
                    emaVar.setVisibility(0);
                    e29Var.setVisibility(0);
                }
                z4 = this.w;
                int i2 = this.L;
                if (z4) {
                    str = null;
                } else {
                    boolean z14 = j95.v5 && (!mb5Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        o95 o95Var2 = this.d;
                        if (o95Var2 == null || this.c != null || mb5Var.b) {
                            if (!this.h) {
                                if (o95Var2 == null || this.c != null) {
                                    q95 q95Var5 = this.e;
                                    if (q95Var5 == null || !z14) {
                                        q95 q95Var6 = this.c;
                                        if ((q95Var6 == null || o95Var2 != null) && this.n) {
                                            if (q95Var6 != null) {
                                                i = hl.L(80.0f);
                                            }
                                        } else if (q95Var6 != null) {
                                            f = q95Var6.a;
                                            z5 = true;
                                            z6 = false;
                                        } else {
                                            i = hl.L(46.0f);
                                        }
                                    } else {
                                        float f2 = q95Var5.a;
                                        z6 = q95Var5.b.e.size();
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
                                            ga5Var.requestLayout();
                                        } else {
                                            ga5Var.a();
                                            this.s = true;
                                        }
                                        hl.c3(new ea5(this, b2));
                                        mb5Var.requestLayout();
                                        invalidate();
                                    }
                                    wc2Var3 = this.x;
                                    if (wc2Var3.a.self || wc2Var3.b || VoIPService.getSharedInstance() == null) {
                                        gmc gmcVar2 = ga5Var.d;
                                        gmc gmcVar3 = ga5Var.d;
                                        gmcVar2.setMirror(false);
                                        gmcVar3.setRotateTextureWithScreen(true);
                                        gmcVar3.setUseCameraRotation(false);
                                    } else {
                                        gmc gmcVar4 = ga5Var.d;
                                        gmc gmcVar5 = ga5Var.d;
                                        gmcVar4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        gmcVar5.setRotateTextureWithScreen(true);
                                        gmcVar5.setUseCameraRotation(true);
                                    }
                                    z7 = ga5Var.a;
                                    gmcVar = ga5Var.d;
                                    if (!z7) {
                                        ((WindowManager) ga5Var.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.x.a.self) {
                                        gmcVar.setMaxTextureSize(0);
                                    } else {
                                        gmcVar.setMaxTextureSize(720);
                                    }
                                    wc2 wc2Var9 = this.x;
                                    E = vc2.E(wc2Var9.a, wc2Var9.b, vc2Var);
                                    ja5Var = this.b0;
                                    if (E || !(vc2Var.x || this.x == vc2Var.z)) {
                                        ImageReceiver imageReceiver = ja5Var.a;
                                        rb0 rb0Var = ja5Var.c;
                                        imageReceiver.d = i2;
                                        B1 = r47.B1(this.x.a.peer);
                                        if (wf3.D(B1)) {
                                            TLRPC.Chat M0 = uc7.s1(k5.a(yac.t0).a).M0(Long.valueOf(-B1));
                                            rb0Var.p(M0);
                                            a = jn5.a(0, M0);
                                            a2 = jn5.a(1, M0);
                                            chat = M0;
                                        } else {
                                            TLRPC.User X1 = uc7.s1(k5.a(i2).a).X1(Long.valueOf(B1));
                                            rb0Var.q(X1);
                                            a = jn5.l(i2, 0, X1);
                                            a2 = jn5.l(i2, 1, X1);
                                            chat = X1;
                                        }
                                        TLRPC.Chat chat2 = chat;
                                        jn5 jn5Var = a;
                                        ja5Var.a.d0(jn5Var, null, (a2 != null || (y = in5.z().y(a2.f)) == null) ? rb0Var : y, null, chat2, 0);
                                        ja5Var.b.d0(jn5Var, "50_50_b", new ColorDrawable(aob.w0(null, aob.kh, false)), null, chat2, 0);
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
                                            ja5Var.setVisibility(z16 ? 8 : 0);
                                            ja5Var.setAlpha(this.a0);
                                            ga5Var.invalidate();
                                        } else {
                                            if (!z16 && ja5Var.getVisibility() != 0) {
                                                ja5Var.setVisibility(0);
                                                ja5Var.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, this.W ? 0.0f : 1.0f);
                                            this.c0 = ofFloat;
                                            ofFloat.addUpdateListener(new fa5(this, b2));
                                            this.c0.addListener(new ia5(this, b));
                                            this.c0.start();
                                        }
                                        if (this.W) {
                                            ja5Var.a(false);
                                        }
                                    }
                                    if (this.x.a.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(gmcVar, this.x.b);
                                    }
                                    rb5 rb5Var2 = this.n0;
                                    rb5Var2.h = this.x.a;
                                    rb5Var2.c(z3);
                                    if (ja5Var.getVisibility() == 0) {
                                        ja5Var.a(true);
                                    }
                                    wc2 wc2Var10 = this.x;
                                    boolean z17 = wc2Var10.b;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = wc2Var10.a;
                                    z9 = z17 ? !((tL_groupCallParticipantVideo = groupCallParticipant2.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = groupCallParticipant2.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.s0 != z9) {
                                        this.s0 = z9;
                                        gmcVar.animate().alpha(this.s0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        ga5Var.invalidate();
                                    }
                                    if (j95.w5 && this.W) {
                                        if (!gmcVar.c.P) {
                                            d();
                                        }
                                        if (this.x.a.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(gmcVar, this.x.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            wc2 wc2Var11 = this.x;
                                            str = null;
                                            sharedInstance4.addRemoteSink(wc2Var11.a, wc2Var11.b, gmcVar, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            wc2 wc2Var12 = this.x;
                                            sharedInstance5.addRemoteSink(wc2Var12.a, wc2Var12.b, gmcVar, null);
                                        }
                                        str = null;
                                    } else {
                                        if (this.x.a.self) {
                                            str = null;
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                                                wc2 wc2Var13 = this.x;
                                                sharedInstance6.removeRemoteSink(wc2Var13.a, wc2Var13.b);
                                                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                                                wc2 wc2Var14 = this.x;
                                                sharedInstance7.removeRemoteSink(wc2Var14.a, wc2Var14.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            str = null;
                                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                                        } else {
                                            str = null;
                                        }
                                        if (j95.w5 && gmcVar.c.P) {
                                            f();
                                            anb anbVar = gmcVar.c;
                                            anbVar.a = false;
                                            anbVar.P = false;
                                            gmcVar.setAlpha(0.0f);
                                            ga5Var.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i = hl.L(80.0f);
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
                                    hl.c3(new ea5(this, b2));
                                    mb5Var.requestLayout();
                                    invalidate();
                                }
                                wc2Var3 = this.x;
                                if (wc2Var3.a.self) {
                                }
                                gmc gmcVar22 = ga5Var.d;
                                gmc gmcVar32 = ga5Var.d;
                                gmcVar22.setMirror(false);
                                gmcVar32.setRotateTextureWithScreen(true);
                                gmcVar32.setUseCameraRotation(false);
                                z7 = ga5Var.a;
                                gmcVar = ga5Var.d;
                                if (!z7) {
                                }
                                if (this.x.a.self) {
                                }
                                wc2 wc2Var92 = this.x;
                                E = vc2.E(wc2Var92.a, wc2Var92.b, vc2Var);
                                ja5Var = this.b0;
                                if (E) {
                                }
                                ImageReceiver imageReceiver2 = ja5Var.a;
                                rb0 rb0Var2 = ja5Var.c;
                                imageReceiver2.d = i2;
                                B1 = r47.B1(this.x.a.peer);
                                if (wf3.D(B1)) {
                                }
                                TLRPC.Chat chat22 = chat;
                                jn5 jn5Var2 = a;
                                ja5Var.a.d0(jn5Var2, null, (a2 != null || (y = in5.z().y(a2.f)) == null) ? rb0Var2 : y, null, chat22, 0);
                                ja5Var.b.d0(jn5Var2, "50_50_b", new ColorDrawable(aob.w0(null, aob.kh, false)), null, chat22, 0);
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
                                    VoIPService.getSharedInstance().setLocalSink(gmcVar, this.x.b);
                                }
                                rb5 rb5Var22 = this.n0;
                                rb5Var22.h = this.x.a;
                                rb5Var22.c(z3);
                                if (ja5Var.getVisibility() == 0) {
                                }
                                wc2 wc2Var102 = this.x;
                                boolean z172 = wc2Var102.b;
                                TLRPC.GroupCallParticipant groupCallParticipant22 = wc2Var102.a;
                                if (z172) {
                                }
                                if (this.s0 != z9) {
                                }
                                if (j95.w5) {
                                }
                                if (this.x.a.self) {
                                }
                                if (j95.w5) {
                                    f();
                                    anb anbVar2 = gmcVar.c;
                                    anbVar2.a = false;
                                    anbVar2.P = false;
                                    gmcVar.setAlpha(0.0f);
                                    ga5Var.e.setAlpha(0.0f);
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
                        wc2Var3 = this.x;
                        if (wc2Var3.a.self) {
                        }
                        gmc gmcVar222 = ga5Var.d;
                        gmc gmcVar322 = ga5Var.d;
                        gmcVar222.setMirror(false);
                        gmcVar322.setRotateTextureWithScreen(true);
                        gmcVar322.setUseCameraRotation(false);
                        z7 = ga5Var.a;
                        gmcVar = ga5Var.d;
                        if (!z7) {
                        }
                        if (this.x.a.self) {
                        }
                        wc2 wc2Var922 = this.x;
                        E = vc2.E(wc2Var922.a, wc2Var922.b, vc2Var);
                        ja5Var = this.b0;
                        if (E) {
                        }
                        ImageReceiver imageReceiver22 = ja5Var.a;
                        rb0 rb0Var22 = ja5Var.c;
                        imageReceiver22.d = i2;
                        B1 = r47.B1(this.x.a.peer);
                        if (wf3.D(B1)) {
                        }
                        TLRPC.Chat chat222 = chat;
                        jn5 jn5Var22 = a;
                        ja5Var.a.d0(jn5Var22, null, (a2 != null || (y = in5.z().y(a2.f)) == null) ? rb0Var22 : y, null, chat222, 0);
                        ja5Var.b.d0(jn5Var22, "50_50_b", new ColorDrawable(aob.w0(null, aob.kh, false)), null, chat222, 0);
                        z8 = false;
                        if (z3) {
                        }
                        if (z8 != this.W) {
                        }
                        if (this.x.a.self) {
                        }
                        rb5 rb5Var222 = this.n0;
                        rb5Var222.h = this.x.a;
                        rb5Var222.c(z3);
                        if (ja5Var.getVisibility() == 0) {
                        }
                        wc2 wc2Var1022 = this.x;
                        boolean z1722 = wc2Var1022.b;
                        TLRPC.GroupCallParticipant groupCallParticipant222 = wc2Var1022.a;
                        if (z1722) {
                        }
                        if (this.s0 != z9) {
                        }
                        if (j95.w5) {
                        }
                        if (this.x.a.self) {
                        }
                        if (j95.w5) {
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
                    wc2Var3 = this.x;
                    if (wc2Var3.a.self) {
                    }
                    gmc gmcVar2222 = ga5Var.d;
                    gmc gmcVar3222 = ga5Var.d;
                    gmcVar2222.setMirror(false);
                    gmcVar3222.setRotateTextureWithScreen(true);
                    gmcVar3222.setUseCameraRotation(false);
                    z7 = ga5Var.a;
                    gmcVar = ga5Var.d;
                    if (!z7) {
                    }
                    if (this.x.a.self) {
                    }
                    wc2 wc2Var9222 = this.x;
                    E = vc2.E(wc2Var9222.a, wc2Var9222.b, vc2Var);
                    ja5Var = this.b0;
                    if (E) {
                    }
                    ImageReceiver imageReceiver222 = ja5Var.a;
                    rb0 rb0Var222 = ja5Var.c;
                    imageReceiver222.d = i2;
                    B1 = r47.B1(this.x.a.peer);
                    if (wf3.D(B1)) {
                    }
                    TLRPC.Chat chat2222 = chat;
                    jn5 jn5Var222 = a;
                    ja5Var.a.d0(jn5Var222, null, (a2 != null || (y = in5.z().y(a2.f)) == null) ? rb0Var222 : y, null, chat2222, 0);
                    ja5Var.b.d0(jn5Var222, "50_50_b", new ColorDrawable(aob.w0(null, aob.kh, false)), null, chat2222, 0);
                    z8 = false;
                    if (z3) {
                    }
                    if (z8 != this.W) {
                    }
                    if (this.x.a.self) {
                    }
                    rb5 rb5Var2222 = this.n0;
                    rb5Var2222.h = this.x.a;
                    rb5Var2222.c(z3);
                    if (ja5Var.getVisibility() == 0) {
                    }
                    wc2 wc2Var10222 = this.x;
                    boolean z17222 = wc2Var10222.b;
                    TLRPC.GroupCallParticipant groupCallParticipant2222 = wc2Var10222.a;
                    if (z17222) {
                    }
                    if (this.s0 != z9) {
                    }
                    if (j95.w5) {
                    }
                    if (this.x.a.self) {
                    }
                    if (j95.w5) {
                    }
                    k(true);
                }
                if (this.w) {
                    return;
                }
                long B13 = r47.B1(this.x.a.peer);
                if (wf3.D(B13)) {
                    str2 = lbc.r(uc7.s1(k5.a(i2).a).X1(Long.valueOf(B13)));
                } else {
                    TLRPC.Chat M02 = uc7.s1(k5.a(i2).a).M0(Long.valueOf(-B13));
                    str2 = M02 != null ? M02.title : str;
                }
                emaVar.l(str2, false);
                return;
            }
        }
        z3 = z;
        z2 = false;
        wc2Var = this.x;
        wc2Var2 = vc2Var.z;
        ema emaVar2 = this.M;
        if (wc2Var != wc2Var2) {
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
        rb5 rb5Var = this.n0;
        if (rb5Var == null) {
            return;
        }
        if (rb5Var.k) {
            w02 = aob.w0(null, aob.jh, false);
        } else {
            if (!rb5Var.e) {
                w0 = aob.w0(null, aob.hh, false);
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
                ofFloat.addUpdateListener(new n95(this, i2, i, i3, w0, (byte) 1));
                this.E0.addListener(new mw0(this, i, w0, (byte) 2));
                this.E0.start();
                return;
            }
            w02 = aob.w0(null, aob.hh, false);
        }
        i = w02;
        w0 = i;
        if (this.C0 != i) {
        }
    }

    public final void l(int i) {
        int measuredWidth = this.y.getMeasuredWidth() - hl.L(6.0f);
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
        q95 q95Var;
        float f;
        int L2;
        FrameLayout frameLayout = this.K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        boolean z = this.d0;
        boolean z2 = j95.u5;
        if (z != z2) {
            this.R = true;
            this.d0 = z2;
        }
        int L3 = hl.L(2.0f);
        layoutParams.rightMargin = L3;
        layoutParams.leftMargin = L3;
        boolean z3 = this.s;
        e29 e29Var = this.U;
        ema emaVar = this.M;
        if (z3) {
            emaVar.animate().scaleX(1.0f).scaleY(1.0f).start();
            e29Var.animate().scaleX(1.0f).scaleY(1.0f).start();
        } else {
            emaVar.animate().cancel();
            emaVar.setScaleX(1.0f);
            emaVar.setScaleY(1.0f);
            e29Var.animate().cancel();
            e29Var.setScaleX(1.0f);
            e29Var.setScaleY(1.0f);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.w0 = 1.0f;
            if (j95.v5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - hl.L(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - hl.L(4.0f), TLObject.FLAG_30));
            } else if (j95.u5) {
                super.onMeasure(ik8.f(92.0f, View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - hl.L(92.0f), TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.w0 = 1.0f;
            int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) - (hl.L(14.0f) << 1);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
        } else if (this.I) {
            this.w0 = 1.0f;
            int i4 = 6;
            if ((!j95.v5 || this.e == null) && !j95.u5) {
                i4 = 2;
            }
            if (this.e != null) {
                L = View.MeasureSpec.getSize(i) - hl.L(344.0f);
            } else if (j95.v5) {
                L = hl.L(320.0f);
            } else {
                size = (View.MeasureSpec.getSize(i) - (hl.L(14.0f) << 1)) + (j95.u5 ? -hl.L(90.0f) : 0);
                float f2 = (this.J / i4) * size;
                q95Var = this.e;
                if (q95Var == null) {
                    f = q95Var.getItemHeight() - hl.L(4.0f);
                    L2 = hl.L(4.0f);
                } else {
                    if (j95.v5) {
                        f = size / 2.0f;
                    } else {
                        f = size / (j95.u5 ? 3 : 2);
                    }
                    L2 = hl.L(2.0f);
                }
                float f3 = f2 - L2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float L4 = this.V.getVisibility() != 0 ? f3 - hl.L(28.0f) : f3;
                l((int) L4);
                layoutParams2.width = (int) (L4 - (layoutParams2.leftMargin << 1));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f, TLObject.FLAG_30));
            }
            size = L;
            float f22 = (this.J / i4) * size;
            q95Var = this.e;
            if (q95Var == null) {
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
            this.E.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(120.0f), 0, vm2.o(-16777216, jn7.E1), Shader.TileMode.CLAMP));
        }
        emaVar.setPivotX(0.0f);
        emaVar.setPivotY(emaVar.getMeasuredHeight() / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 < 0.0f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAmplitude(double d) {
        this.n0.a(d);
        ja5 ja5Var = this.b0;
        ja5Var.getClass();
        float f = ((float) d) / 80.0f;
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        ja5Var.r = f;
        ja5Var.s = (f - ja5Var.n) / 200.0f;
    }

    public void setPrimaryView(q95 q95Var) {
        if (this.c != q95Var) {
            this.c = q95Var;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(o95 o95Var) {
        if (this.d != o95Var) {
            this.d = o95Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(q95 q95Var) {
        if (this.e != q95Var) {
            this.e = q95Var;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
