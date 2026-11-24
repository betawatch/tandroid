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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h85 extends FrameLayout implements p95 {
    public mn6 A0;
    public int B0;
    public int C0;
    public int D0;
    public final Paint E;
    public ValueAnimator E0;
    public boolean F;
    public int F0;
    public final fc2 G;
    public int G0;
    public final h75 H;
    public ValueAnimator H0;
    public boolean I;
    public boolean I0;
    public float J;
    public final FrameLayout K;
    public final int L;
    public final jia M;
    public int N;
    public final xw0 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final Paint T;
    public final ry8 U;
    public final ImageView V;
    public boolean W;
    public final d85 a;
    public float a0;
    public boolean b;
    public final g85 b0;
    public o75 c;
    public ValueAnimator c0;
    public m75 d;
    public boolean d0;
    public o75 e;
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
    public q95 n0;
    public boolean o0;
    public float p0;
    public Bitmap q0;
    public boolean r;
    public Paint r0;
    public boolean s;
    public boolean s0;
    public float t0;
    public final k33 u0;
    public final Drawable v0;
    public boolean w;
    public float w0;
    public gc2 x;
    public ImageView x0;
    public final l95 y;
    public boolean y0;
    public final Rect z0;

    public h85(l95 l95Var, fc2 fc2Var, h75 h75Var) {
        super(l95Var.getContext());
        this.E = new Paint(1);
        Paint paint = new Paint(1);
        this.T = paint;
        this.a0 = 1.0f;
        this.l0 = new ImageReceiver(null);
        this.m0 = new ArrayList();
        this.z0 = new Rect();
        this.G = fc2Var;
        int i = h75Var.a;
        this.L = i;
        k33 k33Var = new k33(l95Var.getContext(), R.drawable.calls_video, -1);
        this.u0 = k33Var;
        k33Var.a(true, false);
        float f = -gl.L(4.0f);
        float L = gl.L(6.0f);
        float L2 = gl.L(6.0f);
        k33Var.i = f;
        k33Var.j = L;
        k33Var.k = L2;
        k33Var.invalidateSelf();
        float N = gl.N(3.4f);
        k33Var.c.setStrokeWidth(N);
        k33Var.d.setStrokeWidth(N * 1.47f);
        this.v0 = l95Var.getContext().getResources().getDrawable(R.drawable.screencast_big).mutate();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(-1);
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.setTypeface(gl.o());
        textPaint2.setTextSize(gl.L(15.0f));
        textPaint2.setColor(-1);
        String M0 = k96.M0(2131742982, null);
        String M02 = k96.M0(2131742979, null);
        int L3 = gl.L(400.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        StaticLayout staticLayout = new StaticLayout(M02, textPaint, L3, alignment, 1.0f, 0.0f, false);
        StaticLayout staticLayout2 = new StaticLayout(k96.a0("VoipVideoNotAvailable", null, 2131742984, k96.G(na7.q1(i).k4.M0.f(), "Participants", new Object[0])), textPaint, gl.L(400.0f), alignment, 1.0f, 0.0f, false);
        String M03 = k96.M0(2131742980, null);
        d85 d85Var = new d85(this, l95Var.getContext(), fc2Var, l95Var, textPaint, staticLayout2, textPaint2, M03, textPaint2.measureText(M03), staticLayout, h75Var, M0, textPaint.measureText(M0));
        this.a = d85Var;
        RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
        zhc zhcVar = d85Var.d;
        zhcVar.setScalingType(scalingType);
        this.y = l95Var;
        this.H = h75Var;
        zhcVar.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new e85(this));
        TextureView textureView = d85Var.e;
        if (textureView != null) {
            zhcVar.setBackgroundRenderer(textureView);
            if (!zhcVar.isFirstFrameRendered()) {
                textureView.setAlpha(0.0f);
            }
        }
        setClipChildren(false);
        zhcVar.setAlpha(0.0f);
        addView(d85Var);
        g85 g85Var = new g85(this, getContext());
        this.b0 = g85Var;
        addView(g85Var);
        jia jiaVar = new jia(l95Var.getContext());
        this.M = jiaVar;
        jiaVar.setTextSize(13);
        jiaVar.setTextColor(bm2.o(-1, 229));
        jiaVar.setTypeface(gl.o());
        jiaVar.setFullTextMaxLines(1);
        jiaVar.setBuildFullLayout(true);
        FrameLayout frameLayout = new FrameLayout(l95Var.getContext());
        this.K = frameLayout;
        frameLayout.addView(jiaVar, nme.d(-1, -2.0f, 19, 32.0f, 0.0f, 8.0f, 0.0f));
        addView(frameLayout, nme.c(32.0f, -1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setColor(bkb.w0(null, bkb.gh, false));
        frameLayout.setClipChildren(false);
        ry8 ry8Var = new ry8(l95Var.getContext());
        this.U = ry8Var;
        addView(ry8Var, nme.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        ImageView imageView = new ImageView(l95Var.getContext());
        this.V = imageView;
        addView(imageView, nme.d(24, 24.0f, 0, 4.0f, 6.0f, 4.0f, 0.0f));
        imageView.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
        imageView.setImageDrawable(l95Var.getContext().getDrawable(R.drawable.voicechat_screencast));
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        int L4 = gl.L(19.0f);
        int o = bm2.o(-1, 100);
        ff0 i0 = bkb.i0(L4, L4, L4, L4, 0, o, o);
        xw0 xw0Var = new xw0((byte) 3, l95Var.getContext(), this);
        this.O = xw0Var;
        xw0Var.setText(k96.M0(2131742978, null));
        xw0Var.setTextSize(1, 15.0f);
        xw0Var.setTypeface(gl.o());
        xw0Var.setPadding(gl.L(21.0f), 0, gl.L(21.0f), 0);
        xw0Var.setTextColor(-1);
        xw0Var.setBackground(i0);
        xw0Var.setGravity(17);
        xw0Var.setOnClickListener(new yj3(this, (byte) 27));
        addView(xw0Var, nme.e(-2, 38, 51));
    }

    public static h85 c(ArrayList arrayList, e55 e55Var, o75 o75Var, m75 m75Var, o75 o75Var2, gc2 gc2Var, fc2 fc2Var, h75 h75Var) {
        h85 h85Var;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                h85Var = null;
                break;
            }
            if (gc2Var.equals(((h85) arrayList.get(i)).x)) {
                h85Var = (h85) arrayList.get(i);
                break;
            }
            i++;
        }
        if (h85Var == null) {
            h85Var = new h85(e55Var, fc2Var, h75Var);
        }
        if (o75Var != null) {
            h85Var.setPrimaryView(o75Var);
        }
        if (m75Var != null) {
            h85Var.setSecondaryView(m75Var);
        }
        if (o75Var2 != null) {
            h85Var.setTabletGridView(o75Var2);
        }
        return h85Var;
    }

    @Override // p95
    public final void a() {
        invalidate();
        k(true);
        g85 g85Var = this.b0;
        if (g85Var.getVisibility() == 0) {
            g85Var.a(true);
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
                gc2 gc2Var = this.x;
                sharedInstance.removeRemoteSink(gc2Var.a, gc2Var.b);
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
            gc2 gc2Var = this.x;
            boolean z = gc2Var.b;
            TLRPC.GroupCallParticipant groupCallParticipant = gc2Var.a;
            Bitmap bitmap = (Bitmap) hashMap.get(z ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint);
            this.q0 = bitmap;
            this.a.setThumb(bitmap);
            if (this.q0 == null) {
                long B1 = k27.B1(this.x.a.peer);
                gc2 gc2Var2 = this.x;
                boolean z2 = gc2Var2.a.self;
                ImageReceiver imageReceiver = this.l0;
                if (z2 && gc2Var2.b) {
                    imageReceiver.g0(new ye7(-14602694, -13935795, -14395293, -14203560, true, false));
                    return;
                }
                int i = this.L;
                if (B1 > 0) {
                    TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(B1));
                    gl5 l = gl5.l(i, 1, V1);
                    int c = V1 != null ? pb0.c(V1.id) : bm2.f(0.2f, -16777216, -1);
                    imageReceiver.d0(l, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bm2.f(0.2f, c, -16777216), bm2.f(0.4f, c, -16777216)}), null, V1, 0);
                    return;
                }
                TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-B1));
                gl5 a = gl5.a(1, K0);
                int c2 = K0 != null ? pb0.c(K0.id) : bm2.f(0.2f, -16777216, -1);
                imageReceiver.d0(a, "50_50_b", new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{bm2.f(0.2f, c2, -16777216), bm2.f(0.4f, c2, -16777216)}), null, K0, 0);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.w;
        l95 l95Var = this.y;
        d85 d85Var = this.a;
        if (z) {
            float y = (d85Var.getY() + d85Var.getMeasuredHeight()) - d85Var.O;
            FrameLayout frameLayout = this.K;
            float measuredHeight = (y - frameLayout.getMeasuredHeight()) + this.p0;
            boolean z2 = this.h;
            ry8 ry8Var = this.U;
            if (z2 || this.f) {
                frameLayout.setAlpha(1.0f - l95Var.n);
                ry8Var.setAlpha(1.0f - l95Var.n);
            } else if (this.b || this.r) {
                if (!h75.u5 && !h75.v5) {
                    measuredHeight = ls6.B(1.0f, l95Var.a0, gl.L(90.0f) * l95Var.c, measuredHeight);
                }
                frameLayout.setAlpha(1.0f);
                ry8Var.setAlpha(1.0f);
            } else if (this.d != null) {
                frameLayout.setAlpha(1.0f - l95Var.c);
                ry8Var.setAlpha(1.0f - l95Var.c);
            } else {
                frameLayout.setAlpha(1.0f);
                ry8Var.setAlpha(1.0f);
            }
            boolean z3 = this.b;
            jia jiaVar = this.M;
            if (z3 || this.r) {
                jiaVar.setFullAlpha(l95Var.c);
            } else {
                jiaVar.setFullAlpha(0.0f);
            }
            ry8Var.setTranslationX(frameLayout.getX());
            ry8Var.setTranslationY(measuredHeight - gl.L(2.0f));
            ImageView imageView = this.V;
            if (imageView.getVisibility() == 0) {
                imageView.setTranslationX((d85Var.getMeasuredWidth() - (d85Var.P * 2.0f)) - gl.L(32.0f));
                imageView.setTranslationY(measuredHeight - gl.L(2.0f));
                imageView.setAlpha(Math.min(1.0f - l95Var.c, 1.0f - l95Var.n));
            }
            frameLayout.setTranslationY(measuredHeight);
            frameLayout.setTranslationX(this.y0 ? 0.0f : gl.L(6.0f) * l95Var.c);
        }
        super.dispatchDraw(canvas);
        if (this.w) {
            q95 q95Var = this.n0;
            if (q95Var != null) {
                boolean z4 = q95Var.e;
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
            float f5 = (1.0f - l95Var.n) * (1.0f - l95Var.c) * f4;
            if (f4 > 0.0f) {
                int i = (int) (f5 * 255.0f);
                Paint paint = this.T;
                paint.setAlpha(i);
                float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gl.L(300.0f))) * 0.1f) + 0.9f;
                canvas.save();
                RectF rectF = gl.P;
                rectF.set(d85Var.getX() + d85Var.P, d85Var.getY() + d85Var.O, (d85Var.getX() + d85Var.getMeasuredWidth()) - d85Var.P, (d85Var.getY() + d85Var.getMeasuredHeight()) - d85Var.O);
                canvas.scale(max, max, rectF.centerX(), rectF.centerY());
                canvas.translate(0.0f, this.p0);
                float f6 = d85Var.b;
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
        float max = (Math.max(0.0f, 1.0f - (Math.abs(this.p0) / gl.L(300.0f))) * 0.1f) + 0.9f;
        canvas.save();
        canvas.scale(max, max, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        canvas.translate(0.0f, this.p0);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public final void e() {
        this.a.d.release();
        q95 q95Var = this.n0;
        if (q95Var != null) {
            this.H.l4.add(q95Var);
            this.n0.b();
            q95 q95Var2 = this.n0;
            q95Var2.c = null;
            q95Var2.c(false);
        }
        this.n0 = null;
    }

    public final void f() {
        if (this.x != null) {
            d85 d85Var = this.a;
            zhc zhcVar = d85Var.d;
            zhc zhcVar2 = d85Var.d;
            if (zhcVar.getMeasuredHeight() == 0 || zhcVar2.getMeasuredWidth() == 0) {
                return;
            }
            zhcVar2.getRenderBufferBitmap(new ry4((Object) this, (byte) 5));
        }
    }

    public final void g(boolean z, boolean z2) {
        if (this.n != z) {
            this.n = z;
            j(!(this.c == null && this.e == null) && z2);
        }
    }

    public String getName() {
        long B1 = k27.B1(this.x.a.peer);
        boolean D = cf3.D(B1);
        int i = y6c.t0;
        return D ? l7c.q(na7.q1(j5.a(i).a).V1(Long.valueOf(B1))) : na7.q1(j5.a(i).a).K0(Long.valueOf(-B1)).title;
    }

    public o75 getPrimaryView() {
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
        o75 o75Var = this.c;
        if (o75Var != null) {
            o75Var.invalidate();
            h75 h75Var = this.H;
            if (h75Var.M4 == this.c) {
                h75Var.b.invalidate();
            }
        }
        m75 m75Var = this.d;
        if (m75Var != null) {
            m75Var.invalidate();
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
        q95 q95Var;
        boolean z2;
        boolean z3;
        gc2 gc2Var;
        gc2 gc2Var2;
        boolean z4;
        String str;
        String str2;
        float f;
        boolean z5;
        boolean z6;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        gc2 gc2Var3;
        boolean z7;
        zhc zhcVar;
        boolean E;
        g85 g85Var;
        long B1;
        gl5 a;
        gl5 a2;
        TLRPC.Chat chat;
        boolean z8;
        Drawable y;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        boolean z9;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2;
        ValueAnimator valueAnimator;
        gc2 gc2Var4;
        o75 o75Var;
        if (this.P) {
            return;
        }
        if (this.x == null && ((o75Var = this.c) != null || this.d != null || this.e != null)) {
            if (o75Var != null) {
                this.x = o75Var.getParticipant();
            } else {
                o75 o75Var2 = this.e;
                if (o75Var2 != null) {
                    this.x = o75Var2.getParticipant();
                } else {
                    this.x = this.d.getVideoParticipant();
                }
            }
        }
        boolean z10 = this.w;
        ry8 ry8Var = this.U;
        fc2 fc2Var = this.G;
        l95 l95Var = this.y;
        d85 d85Var = this.a;
        byte b = 1;
        byte b2 = 0;
        if (z10) {
            if (!this.b) {
                boolean z11 = VoIPService.getSharedInstance() == null;
                if (h75.w5 || (gc2Var4 = this.x) == null || (this.d == null && (!fc2.E(gc2Var4.a, gc2Var4.b, fc2Var) || (!fc2Var.x && this.x != fc2Var.z)))) {
                    z11 = true;
                }
                if (z11 || (this.c == null && this.d == null && this.e == null && !this.h && !this.f)) {
                    this.w = false;
                    f();
                    boolean z12 = gba.o() <= 0;
                    if (d85Var.c0 == null && z11) {
                        if (z12) {
                            l95Var.e(this);
                        }
                        animate().scaleX(0.5f).scaleY(0.5f).alpha(0.0f).setListener(new qw((Object) this, (Object) this, z12, (byte) 5)).setDuration(150L).start();
                    } else {
                        if (l95Var.s) {
                            mn6 mn6Var = this.A0;
                            if (mn6Var != null) {
                                gl.r(mn6Var);
                                this.A0 = null;
                            }
                            mn6 mn6Var2 = new mn6((Object) this, z12, (Object) this, (byte) 25);
                            this.A0 = mn6Var2;
                            gl.d3(mn6Var2);
                        } else {
                            if (z12) {
                                l95Var.removeView(this);
                            }
                            setVisibility(8);
                        }
                        if (z12) {
                            l95Var.e(this);
                            e();
                        }
                    }
                    if (this.x.a.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService sharedInstance = VoIPService.getSharedInstance();
                        gc2 gc2Var5 = this.x;
                        sharedInstance.removeRemoteSink(gc2Var5.a, gc2Var5.b);
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
            o75 o75Var3 = this.c;
            if (o75Var3 != null || this.d != null || this.e != null || this.b) {
                if (o75Var3 != null) {
                    this.x = o75Var3.getParticipant();
                } else {
                    m75 m75Var = this.d;
                    if (m75Var != null) {
                        this.x = m75Var.getVideoParticipant();
                    } else {
                        o75 o75Var4 = this.e;
                        if (o75Var4 != null) {
                            this.x = o75Var4.getParticipant();
                        }
                    }
                }
                gc2 gc2Var6 = this.x;
                TLRPC.GroupCallParticipant groupCallParticipant = gc2Var6.a;
                boolean z13 = !groupCallParticipant.self ? !((fc2Var.x || gc2Var6 == fc2Var.z) && fc2.E(groupCallParticipant, gc2Var6.b, fc2Var)) : !(VoIPService.getSharedInstance() != null && VoIPService.getSharedInstance().getVideoState(this.x.b) == 2);
                if (!this.b) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    gc2 gc2Var7 = this.x;
                    if (!sharedInstance2.isFullscreen(gc2Var7.a, gc2Var7.b)) {
                        VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                        gc2 gc2Var8 = this.x;
                        if (!sharedInstance3.isFullscreen(gc2Var8.a, gc2Var8.b)) {
                        }
                    }
                }
                this.w = true;
                h75 h75Var = this.H;
                if (h75Var.l4.size() > 0) {
                    q95Var = (q95) tb4.l(1, h75Var.l4);
                    this.n0 = q95Var;
                } else {
                    q95Var = new q95();
                    this.n0 = q95Var;
                }
                q95Var.g = this;
                q95Var.c = ry8Var;
                q95Var.c(false);
                k(false);
                mn6 mn6Var3 = this.A0;
                if (mn6Var3 != null) {
                    gl.r(mn6Var3);
                    this.A0 = null;
                }
                if (getParent() == null) {
                    l95Var.addView(this, nme.e(46, 46, 51));
                    l95Var.I.add(this);
                    long B12 = k27.B1(this.x.a.peer);
                    LongSparseIntArray longSparseIntArray = l95Var.x;
                    longSparseIntArray.put(B12, longSparseIntArray.get(B12, 0) + 1);
                    setVisibility(0);
                } else if (getVisibility() == 8) {
                    setVisibility(0);
                }
                this.R = true;
                this.F = false;
                animate().setListener(null).cancel();
                if (d85Var.c0 != null || this.d == null || this.c != null || d85Var.E == 1.0f) {
                    setScaleY(1.0f);
                    setScaleX(1.0f);
                    setAlpha(1.0f);
                } else {
                    setScaleX(0.5f);
                    setScaleY(0.5f);
                    setAlpha(0.0f);
                    this.F = true;
                    invalidate();
                    animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setListener(new f85(this, b2)).setDuration(100L).start();
                    invalidate();
                }
                d();
                this.V.setVisibility(this.x.b ? 0 : 8);
                z2 = true;
                z3 = false;
                gc2Var = this.x;
                gc2Var2 = fc2Var.z;
                jia jiaVar = this.M;
                if (gc2Var != gc2Var2) {
                    if (jiaVar.getVisibility() != 4) {
                        jiaVar.setVisibility(4);
                        ry8Var.setVisibility(4);
                    }
                } else if (jiaVar.getVisibility() != 0) {
                    jiaVar.setVisibility(0);
                    ry8Var.setVisibility(0);
                }
                z4 = this.w;
                int i2 = this.L;
                if (z4) {
                    str = null;
                } else {
                    boolean z14 = h75.v5 && (!l95Var.b || (this.d == null && this.c == null));
                    if (!this.b) {
                        m75 m75Var2 = this.d;
                        if (m75Var2 == null || this.c != null || l95Var.b) {
                            if (!this.h) {
                                if (m75Var2 == null || this.c != null) {
                                    o75 o75Var5 = this.e;
                                    if (o75Var5 == null || !z14) {
                                        o75 o75Var6 = this.c;
                                        if ((o75Var6 == null || m75Var2 != null) && this.n) {
                                            if (o75Var6 != null) {
                                                i = gl.L(80.0f);
                                            }
                                        } else if (o75Var6 != null) {
                                            f = o75Var6.a;
                                            z5 = true;
                                            z6 = false;
                                        } else {
                                            i = gl.L(46.0f);
                                        }
                                    } else {
                                        float f2 = o75Var5.a;
                                        z6 = o75Var5.b.e.size();
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
                                            d85Var.requestLayout();
                                        } else {
                                            d85Var.a();
                                            this.s = true;
                                        }
                                        gl.d3(new iu4(this, (byte) 16));
                                        l95Var.requestLayout();
                                        invalidate();
                                    }
                                    gc2Var3 = this.x;
                                    if (gc2Var3.a.self || gc2Var3.b || VoIPService.getSharedInstance() == null) {
                                        zhc zhcVar2 = d85Var.d;
                                        zhc zhcVar3 = d85Var.d;
                                        zhcVar2.setMirror(false);
                                        zhcVar3.setRotateTextureWithScreen(true);
                                        zhcVar3.setUseCameraRotation(false);
                                    } else {
                                        zhc zhcVar4 = d85Var.d;
                                        zhc zhcVar5 = d85Var.d;
                                        zhcVar4.setMirror(VoIPService.getSharedInstance().isFrontFaceCamera());
                                        zhcVar5.setRotateTextureWithScreen(true);
                                        zhcVar5.setUseCameraRotation(true);
                                    }
                                    z7 = d85Var.a;
                                    zhcVar = d85Var.d;
                                    if (!z7) {
                                        ((WindowManager) d85Var.getContext().getSystemService("window")).getDefaultDisplay();
                                    }
                                    if (this.x.a.self) {
                                        zhcVar.setMaxTextureSize(0);
                                    } else {
                                        zhcVar.setMaxTextureSize(720);
                                    }
                                    gc2 gc2Var9 = this.x;
                                    E = fc2.E(gc2Var9.a, gc2Var9.b, fc2Var);
                                    g85Var = this.b0;
                                    if (E || !(fc2Var.x || this.x == fc2Var.z)) {
                                        ImageReceiver imageReceiver = g85Var.a;
                                        pb0 pb0Var = g85Var.c;
                                        imageReceiver.d = i2;
                                        B1 = k27.B1(this.x.a.peer);
                                        if (cf3.D(B1)) {
                                            TLRPC.Chat K0 = na7.q1(j5.a(y6c.t0).a).K0(Long.valueOf(-B1));
                                            pb0Var.p(K0);
                                            a = gl5.a(0, K0);
                                            a2 = gl5.a(1, K0);
                                            chat = K0;
                                        } else {
                                            TLRPC.User V1 = na7.q1(j5.a(i2).a).V1(Long.valueOf(B1));
                                            pb0Var.q(V1);
                                            a = gl5.l(i2, 0, V1);
                                            a2 = gl5.l(i2, 1, V1);
                                            chat = V1;
                                        }
                                        TLRPC.Chat chat2 = chat;
                                        gl5 gl5Var = a;
                                        g85Var.a.d0(gl5Var, null, (a2 != null || (y = fl5.z().y(a2.f)) == null) ? pb0Var : y, null, chat2, 0);
                                        g85Var.b.d0(gl5Var, "50_50_b", new ColorDrawable(bkb.w0(null, bkb.jh, false)), null, chat2, 0);
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
                                            g85Var.setVisibility(z16 ? 8 : 0);
                                            g85Var.setAlpha(this.a0);
                                            d85Var.invalidate();
                                        } else {
                                            if (!z16 && g85Var.getVisibility() != 0) {
                                                g85Var.setVisibility(0);
                                                g85Var.setAlpha(0.0f);
                                            }
                                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, this.W ? 0.0f : 1.0f);
                                            this.c0 = ofFloat;
                                            ofFloat.addUpdateListener(new c85(this, b2));
                                            this.c0.addListener(new f85(this, b));
                                            this.c0.start();
                                        }
                                        if (this.W) {
                                            g85Var.a(false);
                                        }
                                    }
                                    if (this.x.a.self && VoIPService.getSharedInstance() != null) {
                                        VoIPService.getSharedInstance().setLocalSink(zhcVar, this.x.b);
                                    }
                                    q95 q95Var2 = this.n0;
                                    q95Var2.h = this.x.a;
                                    q95Var2.c(z3);
                                    if (g85Var.getVisibility() == 0) {
                                        g85Var.a(true);
                                    }
                                    gc2 gc2Var10 = this.x;
                                    boolean z17 = gc2Var10.b;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = gc2Var10.a;
                                    z9 = z17 ? !((tL_groupCallParticipantVideo = groupCallParticipant2.video) == null || !tL_groupCallParticipantVideo.paused) : !((tL_groupCallParticipantVideo2 = groupCallParticipant2.presentation) == null || !tL_groupCallParticipantVideo2.paused);
                                    if (this.s0 != z9) {
                                        this.s0 = z9;
                                        zhcVar.animate().alpha(this.s0 ? 0.0f : 1.0f).setDuration(250L).start();
                                        d85Var.invalidate();
                                    }
                                    if (h75.w5 && this.W) {
                                        if (!zhcVar.isFirstFrameRendered()) {
                                            d();
                                        }
                                        if (this.x.a.self) {
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService.getSharedInstance().setLocalSink(zhcVar, this.x.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                                            gc2 gc2Var11 = this.x;
                                            str = null;
                                            sharedInstance4.addRemoteSink(gc2Var11.a, gc2Var11.b, zhcVar, null);
                                            VoIPService sharedInstance5 = VoIPService.getSharedInstance();
                                            gc2 gc2Var12 = this.x;
                                            sharedInstance5.addRemoteSink(gc2Var12.a, gc2Var12.b, zhcVar, null);
                                        }
                                        str = null;
                                    } else {
                                        if (this.x.a.self) {
                                            str = null;
                                            if (VoIPService.getSharedInstance() != null) {
                                                VoIPService sharedInstance6 = VoIPService.getSharedInstance();
                                                gc2 gc2Var13 = this.x;
                                                sharedInstance6.removeRemoteSink(gc2Var13.a, gc2Var13.b);
                                                VoIPService sharedInstance7 = VoIPService.getSharedInstance();
                                                gc2 gc2Var14 = this.x;
                                                sharedInstance7.removeRemoteSink(gc2Var14.a, gc2Var14.b);
                                            }
                                        } else if (VoIPService.getSharedInstance() != null) {
                                            str = null;
                                            VoIPService.getSharedInstance().setLocalSink(null, this.x.b);
                                        } else {
                                            str = null;
                                        }
                                        if (h75.w5 && zhcVar.isFirstFrameRendered()) {
                                            f();
                                            zhcVar.clearFirstFrame();
                                            zhcVar.setAlpha(0.0f);
                                            d85Var.e.setAlpha(0.0f);
                                        }
                                    }
                                    k(true);
                                } else {
                                    i = gl.L(80.0f);
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
                                    gl.d3(new iu4(this, (byte) 16));
                                    l95Var.requestLayout();
                                    invalidate();
                                }
                                gc2Var3 = this.x;
                                if (gc2Var3.a.self) {
                                }
                                zhc zhcVar22 = d85Var.d;
                                zhc zhcVar32 = d85Var.d;
                                zhcVar22.setMirror(false);
                                zhcVar32.setRotateTextureWithScreen(true);
                                zhcVar32.setUseCameraRotation(false);
                                z7 = d85Var.a;
                                zhcVar = d85Var.d;
                                if (!z7) {
                                }
                                if (this.x.a.self) {
                                }
                                gc2 gc2Var92 = this.x;
                                E = fc2.E(gc2Var92.a, gc2Var92.b, fc2Var);
                                g85Var = this.b0;
                                if (E) {
                                }
                                ImageReceiver imageReceiver2 = g85Var.a;
                                pb0 pb0Var2 = g85Var.c;
                                imageReceiver2.d = i2;
                                B1 = k27.B1(this.x.a.peer);
                                if (cf3.D(B1)) {
                                }
                                TLRPC.Chat chat22 = chat;
                                gl5 gl5Var2 = a;
                                g85Var.a.d0(gl5Var2, null, (a2 != null || (y = fl5.z().y(a2.f)) == null) ? pb0Var2 : y, null, chat22, 0);
                                g85Var.b.d0(gl5Var2, "50_50_b", new ColorDrawable(bkb.w0(null, bkb.jh, false)), null, chat22, 0);
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
                                    VoIPService.getSharedInstance().setLocalSink(zhcVar, this.x.b);
                                }
                                q95 q95Var22 = this.n0;
                                q95Var22.h = this.x.a;
                                q95Var22.c(z3);
                                if (g85Var.getVisibility() == 0) {
                                }
                                gc2 gc2Var102 = this.x;
                                boolean z172 = gc2Var102.b;
                                TLRPC.GroupCallParticipant groupCallParticipant22 = gc2Var102.a;
                                if (z172) {
                                }
                                if (this.s0 != z9) {
                                }
                                if (h75.w5) {
                                }
                                if (this.x.a.self) {
                                }
                                if (h75.w5) {
                                    f();
                                    zhcVar.clearFirstFrame();
                                    zhcVar.setAlpha(0.0f);
                                    d85Var.e.setAlpha(0.0f);
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
                        gc2Var3 = this.x;
                        if (gc2Var3.a.self) {
                        }
                        zhc zhcVar222 = d85Var.d;
                        zhc zhcVar322 = d85Var.d;
                        zhcVar222.setMirror(false);
                        zhcVar322.setRotateTextureWithScreen(true);
                        zhcVar322.setUseCameraRotation(false);
                        z7 = d85Var.a;
                        zhcVar = d85Var.d;
                        if (!z7) {
                        }
                        if (this.x.a.self) {
                        }
                        gc2 gc2Var922 = this.x;
                        E = fc2.E(gc2Var922.a, gc2Var922.b, fc2Var);
                        g85Var = this.b0;
                        if (E) {
                        }
                        ImageReceiver imageReceiver22 = g85Var.a;
                        pb0 pb0Var22 = g85Var.c;
                        imageReceiver22.d = i2;
                        B1 = k27.B1(this.x.a.peer);
                        if (cf3.D(B1)) {
                        }
                        TLRPC.Chat chat222 = chat;
                        gl5 gl5Var22 = a;
                        g85Var.a.d0(gl5Var22, null, (a2 != null || (y = fl5.z().y(a2.f)) == null) ? pb0Var22 : y, null, chat222, 0);
                        g85Var.b.d0(gl5Var22, "50_50_b", new ColorDrawable(bkb.w0(null, bkb.jh, false)), null, chat222, 0);
                        z8 = false;
                        if (z3) {
                        }
                        if (z8 != this.W) {
                        }
                        if (this.x.a.self) {
                        }
                        q95 q95Var222 = this.n0;
                        q95Var222.h = this.x.a;
                        q95Var222.c(z3);
                        if (g85Var.getVisibility() == 0) {
                        }
                        gc2 gc2Var1022 = this.x;
                        boolean z1722 = gc2Var1022.b;
                        TLRPC.GroupCallParticipant groupCallParticipant222 = gc2Var1022.a;
                        if (z1722) {
                        }
                        if (this.s0 != z9) {
                        }
                        if (h75.w5) {
                        }
                        if (this.x.a.self) {
                        }
                        if (h75.w5) {
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
                    gc2Var3 = this.x;
                    if (gc2Var3.a.self) {
                    }
                    zhc zhcVar2222 = d85Var.d;
                    zhc zhcVar3222 = d85Var.d;
                    zhcVar2222.setMirror(false);
                    zhcVar3222.setRotateTextureWithScreen(true);
                    zhcVar3222.setUseCameraRotation(false);
                    z7 = d85Var.a;
                    zhcVar = d85Var.d;
                    if (!z7) {
                    }
                    if (this.x.a.self) {
                    }
                    gc2 gc2Var9222 = this.x;
                    E = fc2.E(gc2Var9222.a, gc2Var9222.b, fc2Var);
                    g85Var = this.b0;
                    if (E) {
                    }
                    ImageReceiver imageReceiver222 = g85Var.a;
                    pb0 pb0Var222 = g85Var.c;
                    imageReceiver222.d = i2;
                    B1 = k27.B1(this.x.a.peer);
                    if (cf3.D(B1)) {
                    }
                    TLRPC.Chat chat2222 = chat;
                    gl5 gl5Var222 = a;
                    g85Var.a.d0(gl5Var222, null, (a2 != null || (y = fl5.z().y(a2.f)) == null) ? pb0Var222 : y, null, chat2222, 0);
                    g85Var.b.d0(gl5Var222, "50_50_b", new ColorDrawable(bkb.w0(null, bkb.jh, false)), null, chat2222, 0);
                    z8 = false;
                    if (z3) {
                    }
                    if (z8 != this.W) {
                    }
                    if (this.x.a.self) {
                    }
                    q95 q95Var2222 = this.n0;
                    q95Var2222.h = this.x.a;
                    q95Var2222.c(z3);
                    if (g85Var.getVisibility() == 0) {
                    }
                    gc2 gc2Var10222 = this.x;
                    boolean z17222 = gc2Var10222.b;
                    TLRPC.GroupCallParticipant groupCallParticipant2222 = gc2Var10222.a;
                    if (z17222) {
                    }
                    if (this.s0 != z9) {
                    }
                    if (h75.w5) {
                    }
                    if (this.x.a.self) {
                    }
                    if (h75.w5) {
                    }
                    k(true);
                }
                if (this.w) {
                    return;
                }
                long B13 = k27.B1(this.x.a.peer);
                if (cf3.D(B13)) {
                    str2 = l7c.q(na7.q1(j5.a(i2).a).V1(Long.valueOf(B13)));
                } else {
                    TLRPC.Chat K02 = na7.q1(j5.a(i2).a).K0(Long.valueOf(-B13));
                    str2 = K02 != null ? K02.title : str;
                }
                jiaVar.l(str2, false);
                return;
            }
        }
        z3 = z;
        z2 = false;
        gc2Var = this.x;
        gc2Var2 = fc2Var.z;
        jia jiaVar2 = this.M;
        if (gc2Var != gc2Var2) {
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
        q95 q95Var = this.n0;
        if (q95Var == null) {
            return;
        }
        if (q95Var.k) {
            w02 = bkb.w0(null, bkb.ih, false);
        } else {
            if (!q95Var.e) {
                w0 = bkb.w0(null, bkb.gh, false);
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
                ofFloat.addUpdateListener(new l75(this, i2, i, i3, w0, (byte) 1));
                this.E0.addListener(new dw0(this, i, w0, (byte) 2));
                this.E0.start();
                return;
            }
            w02 = bkb.w0(null, bkb.gh, false);
        }
        i = w02;
        w0 = i;
        if (this.C0 != i) {
        }
    }

    public final void l(int i) {
        int measuredWidth = this.y.getMeasuredWidth() - gl.L(6.0f);
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
        o75 o75Var;
        float f;
        int L2;
        FrameLayout frameLayout = this.K;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        boolean z = this.d0;
        boolean z2 = h75.u5;
        if (z != z2) {
            this.R = true;
            this.d0 = z2;
        }
        int L3 = gl.L(2.0f);
        layoutParams.rightMargin = L3;
        layoutParams.leftMargin = L3;
        boolean z3 = this.s;
        ry8 ry8Var = this.U;
        jia jiaVar = this.M;
        if (z3) {
            jiaVar.animate().scaleX(1.0f).scaleY(1.0f).start();
            ry8Var.animate().scaleX(1.0f).scaleY(1.0f).start();
        } else {
            jiaVar.animate().cancel();
            jiaVar.setScaleX(1.0f);
            jiaVar.setScaleY(1.0f);
            ry8Var.animate().cancel();
            ry8Var.setScaleX(1.0f);
            ry8Var.setScaleY(1.0f);
            frameLayout.animate().cancel();
        }
        this.s = false;
        if (this.b) {
            l(0);
            this.w0 = 1.0f;
            if (h75.v5) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - gl.L(328.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - gl.L(4.0f), TLObject.FLAG_30));
            } else if (h75.u5) {
                super.onMeasure(ug8.f(92.0f, View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
            } else {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) - gl.L(92.0f), TLObject.FLAG_30));
            }
        } else if (this.h) {
            this.w0 = 1.0f;
            int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) - (gl.L(14.0f) << 1);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + min, TLObject.FLAG_30));
        } else if (this.I) {
            this.w0 = 1.0f;
            int i4 = 6;
            if ((!h75.v5 || this.e == null) && !h75.u5) {
                i4 = 2;
            }
            if (this.e != null) {
                L = View.MeasureSpec.getSize(i) - gl.L(344.0f);
            } else if (h75.v5) {
                L = gl.L(320.0f);
            } else {
                size = (View.MeasureSpec.getSize(i) - (gl.L(14.0f) << 1)) + (h75.u5 ? -gl.L(90.0f) : 0);
                float f2 = (this.J / i4) * size;
                o75Var = this.e;
                if (o75Var == null) {
                    f = o75Var.getItemHeight() - gl.L(4.0f);
                    L2 = gl.L(4.0f);
                } else {
                    if (h75.v5) {
                        f = size / 2.0f;
                    } else {
                        f = size / (h75.u5 ? 3 : 2);
                    }
                    L2 = gl.L(2.0f);
                }
                float f3 = f2 - L2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                float L4 = this.V.getVisibility() != 0 ? f3 - gl.L(28.0f) : f3;
                l((int) L4);
                layoutParams2.width = (int) (L4 - (layoutParams2.leftMargin << 1));
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) f, TLObject.FLAG_30));
            }
            size = L;
            float f22 = (this.J / i4) * size;
            o75Var = this.e;
            if (o75Var == null) {
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
            this.E.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(120.0f), 0, bm2.o(-16777216, 120), Shader.TileMode.CLAMP));
        }
        jiaVar.setPivotX(0.0f);
        jiaVar.setPivotY(jiaVar.getMeasuredHeight() / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2 < 0.0f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAmplitude(double d) {
        this.n0.a(d);
        g85 g85Var = this.b0;
        g85Var.getClass();
        float f = ((float) d) / 80.0f;
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        g85Var.r = f;
        g85Var.s = (f - g85Var.n) / 200.0f;
    }

    public void setPrimaryView(o75 o75Var) {
        if (this.c != o75Var) {
            this.c = o75Var;
            this.R = true;
            j(true);
        }
    }

    public void setSecondaryView(m75 m75Var) {
        if (this.d != m75Var) {
            this.d = m75Var;
            this.R = true;
            j(true);
        }
    }

    public void setTabletGridView(o75 o75Var) {
        if (this.e != o75Var) {
            this.e = o75Var;
            j(true);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }
}
