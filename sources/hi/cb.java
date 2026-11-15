package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.ns;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.oy0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cb extends View {
    public final Paint A0;
    public int A1;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public final Path E;
    public final Paint E0;
    public boolean F;
    public final TextPaint F0;
    public String G;
    public final RectF G0;
    public boolean H;
    public final Path H0;
    public long I;
    public final Paint I0;
    public long J;
    public final bb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public ab N;
    public StaticLayout N0;
    public boolean O;
    public float O0;
    public String P;
    public float P0;
    public boolean Q;
    public final TextPaint Q0;
    public long R;
    public StaticLayout R0;
    public long S;
    public float S0;
    public float T;
    public float T0;
    public float U;
    public final LinearGradient U0;
    public boolean V;
    public final Matrix V0;
    public float W;
    public final Paint W0;
    public final bl0 X0;
    public boolean Y0;
    public final ai.b Z0;
    public wa a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public va b0;
    public long b1;
    public int c;
    public int c0;
    public final org.telegram.ui.Components.u5 c1;
    public Runnable d;
    public final org.telegram.ui.Components.u5 d0;
    public long d1;
    public long e;
    public final org.telegram.ui.Components.u5 e0;
    public di.x2 e1;
    public long f;
    public final org.telegram.ui.Components.u5 f0;
    public long f1;
    public final org.telegram.ui.Components.u5 g0;
    public long g1;
    public xa h;
    public final org.telegram.ui.Components.u5 h0;
    public float h1;
    public final org.telegram.ui.Components.u5 i0;
    public int i1;
    public final org.telegram.ui.Components.u5 j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final org.telegram.ui.Components.u9 l0;
    public int l1;
    public final org.telegram.ui.Components.y9 m0;
    public boolean m1;
    public int n;
    public final org.telegram.ui.Components.y9 n0;
    public boolean n1;
    public final org.telegram.ui.Components.y9 o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final oy0 r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final bb t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public xa w;
    public final Path w0;
    public int w1;
    public final Paint x;
    public final Path x0;
    public int x1;
    public final Path y;
    public final RectF y0;
    public int y1;
    public final Path z0;
    public int z1;

    public cb(Context context, ViewGroup viewGroup, ea eaVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        er erVar = er.h;
        this.d0 = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        this.e0 = new org.telegram.ui.Components.u5(this, 360L, erVar);
        this.f0 = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        this.g0 = new org.telegram.ui.Components.u5(this, 360L, erVar);
        this.h0 = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        this.i0 = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        this.j0 = new org.telegram.ui.Components.u5(this, 0L, 320L, erVar);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new bb();
        this.u0 = new RectF();
        this.v0 = new Paint(3);
        this.w0 = new Path();
        this.x0 = new Path();
        this.y0 = new RectF();
        this.z0 = new Path();
        Paint paint = new Paint(1);
        this.A0 = paint;
        Paint paint2 = new Paint(1);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        this.C0 = paint3;
        Paint paint4 = new Paint(1);
        this.D0 = paint4;
        Paint paint5 = new Paint(1);
        this.E0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.F0 = textPaint;
        this.G0 = new RectF();
        this.H0 = new Path();
        Paint paint6 = new Paint(1);
        this.I0 = paint6;
        this.J0 = new bb();
        Paint paint7 = new Paint(1);
        this.K0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.M0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.Q0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.U0 = linearGradient;
        this.V0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.W0 = paint8;
        this.X0 = new bl0(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new org.telegram.ui.Components.u5(0.0f, this, 0L, 340L, erVar);
        this.d1 = -1L;
        this.i1 = -1;
        this.j1 = -1;
        this.k1 = -1;
        this.l1 = -1;
        this.o1 = 1.0f;
        this.r1 = true;
        this.s1 = false;
        this.u1 = new float[8];
        paint7.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint2.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), 436207616);
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(2.0f), TLObject.FLAG_30);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.r0 = new oy0(hd.M0(2131744456, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = u9Var;
        this.m0 = new org.telegram.ui.Components.y9(u9Var, this, 0, false);
        this.n0 = new org.telegram.ui.Components.y9(u9Var, this, 3, false);
        this.o0 = new org.telegram.ui.Components.y9(u9Var, this, 4, false);
        this.Z0 = new ai.b(this, viewGroup, e6Var, u9Var, eaVar, 15);
    }

    public static void a(final cb cbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var, View view) {
        int i7;
        ArrayList arrayList = cbVar.s;
        int i10 = cbVar.k1;
        final int i11 = 0;
        final int i12 = 2;
        try {
            if (i10 == 2 && cbVar.O) {
                x6 x6Var = new x6(cbVar.getContext(), 0);
                x6Var.b = 0.0f;
                x6Var.c = 1.5f;
                x6Var.d(cbVar.W);
                x6Var.h = new z10(cbVar) { // from class: hi.ua
                    public final /* synthetic */ cb b;

                    {
                        this.b = cbVar;
                    }

                    @Override // org.telegram.messenger.z10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i11) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cb cbVar2 = this.b;
                                cbVar2.W = floatValue;
                                wa waVar = cbVar2.a;
                                if (waVar != null) {
                                    waVar.n(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cb cbVar3 = this.b;
                                cbVar3.M = floatValue2;
                                wa waVar2 = cbVar3.a;
                                if (waVar2 != null) {
                                    waVar2.k(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cb cbVar4 = this.b;
                                cbVar4.h.i = f10.floatValue();
                                wa waVar3 = cbVar4.a;
                                if (waVar3 != null) {
                                    waVar3.H(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration());
                int i13 = cbVar.w1;
                int i14 = cbVar.z1;
                int i15 = cbVar.y1;
                float min2 = Math.min((i13 - i14) - i15, ((((org.telegram.messenger.g0.T1(cbVar.U, 1.0f, cbVar.g0.c) * cbVar.S) + (cbVar.R - cbVar.f)) / min) * cbVar.v1) + i14 + i15);
                m60 F = m60.F(viewGroup, e6Var, cbVar);
                F.q(x6Var);
                F.o();
                F.c(R.drawable.msg_delete, hd.M0(2131744720, null), new ta(cbVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(cbVar.w1 - min2)) + org.telegram.messenger.g0.L(18.0f), cbVar.G0.top);
                F.Z();
                F.R(u9Var, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            } else {
                final int i16 = 1;
                if (i10 == 1 && cbVar.F) {
                    x6 x6Var2 = new x6(cbVar.getContext(), 0);
                    x6Var2.b = 0.0f;
                    x6Var2.c = 1.5f;
                    x6Var2.d(cbVar.M);
                    x6Var2.h = new z10(cbVar) { // from class: hi.ua
                        public final /* synthetic */ cb b;

                        {
                            this.b = cbVar;
                        }

                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj) {
                            Float f10 = (Float) obj;
                            switch (i16) {
                                case 0:
                                    float floatValue = f10.floatValue();
                                    cb cbVar2 = this.b;
                                    cbVar2.W = floatValue;
                                    wa waVar = cbVar2.a;
                                    if (waVar != null) {
                                        waVar.n(f10.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f10.floatValue();
                                    cb cbVar3 = this.b;
                                    cbVar3.M = floatValue2;
                                    wa waVar2 = cbVar3.a;
                                    if (waVar2 != null) {
                                        waVar2.k(f10.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    cb cbVar4 = this.b;
                                    cbVar4.h.i = f10.floatValue();
                                    wa waVar3 = cbVar4.a;
                                    if (waVar3 != null) {
                                        waVar3.H(f10.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    long min3 = Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration());
                    int i17 = cbVar.w1;
                    int i18 = cbVar.z1;
                    int i19 = cbVar.y1;
                    float min4 = Math.min((i17 - i18) - i19, ((((org.telegram.messenger.g0.T1(cbVar.L, 1.0f, cbVar.e0.c) * cbVar.I) + (cbVar.J - cbVar.f)) / min3) * cbVar.v1) + i18 + i19);
                    m60 F2 = m60.F(viewGroup, e6Var, cbVar);
                    F2.q(x6Var2);
                    F2.o();
                    F2.c(R.drawable.msg_delete, hd.M0(2131744487, null), new ta(cbVar, 2), false);
                    F2.V(5);
                    F2.U = true;
                    F2.a0((-(cbVar.w1 - min4)) + org.telegram.messenger.g0.L(18.0f), cbVar.y0.top);
                    F2.Z();
                    F2.R(u9Var, -view.getX(), -view.getY());
                    cbVar.performHapticFeedback(0, 1);
                } else if (i10 == 0 && cbVar.h != null) {
                    x6 x6Var3 = new x6(cbVar.getContext(), 0);
                    x6Var3.b = 0.0f;
                    x6Var3.c = 1.5f;
                    x6Var3.d(cbVar.h.i);
                    x6Var3.h = new z10(cbVar) { // from class: hi.ua
                        public final /* synthetic */ cb b;

                        {
                            this.b = cbVar;
                        }

                        @Override // org.telegram.messenger.z10
                        public final void a(Object obj) {
                            Float f10 = (Float) obj;
                            switch (i12) {
                                case 0:
                                    float floatValue = f10.floatValue();
                                    cb cbVar2 = this.b;
                                    cbVar2.W = floatValue;
                                    wa waVar = cbVar2.a;
                                    if (waVar != null) {
                                        waVar.n(f10.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f10.floatValue();
                                    cb cbVar3 = this.b;
                                    cbVar3.M = floatValue2;
                                    wa waVar2 = cbVar3.a;
                                    if (waVar2 != null) {
                                        waVar2.k(f10.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    cb cbVar4 = this.b;
                                    cbVar4.h.i = f10.floatValue();
                                    wa waVar3 = cbVar4.a;
                                    if (waVar3 != null) {
                                        waVar3.H(f10.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    m60 F3 = m60.F(viewGroup, e6Var, cbVar);
                    F3.q(x6Var3);
                    F3.V(5);
                    F3.U = true;
                    F3.a0(org.telegram.messenger.g0.L(18.0f), cbVar.u0.top);
                    F3.Z();
                    F3.R(u9Var, -view.getX(), -view.getY());
                    cbVar.performHapticFeedback(0, 1);
                } else {
                    if (i10 != 3 || (i7 = cbVar.l1) < 0 || i7 >= arrayList.size()) {
                        return;
                    }
                    xa xaVar = (xa) arrayList.get(cbVar.l1);
                    x6 x6Var4 = new x6(cbVar.getContext(), 0);
                    x6Var4.b = 0.0f;
                    x6Var4.c = 1.5f;
                    x6Var4.d(xaVar.i);
                    x6Var4.h = new ai.v1(20, cbVar, xaVar);
                    m60 F4 = m60.F(viewGroup, e6Var, cbVar);
                    F4.q(x6Var4);
                    F4.V(5);
                    F4.U = true;
                    F4.a0(org.telegram.messenger.g0.L(18.0f), xaVar.j.top);
                    F4.Z();
                    F4.R(u9Var, -view.getX(), -view.getY());
                    cbVar.performHapticFeedback(0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.g0.d(this.Q), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        xa xaVar = this.h;
        if (xaVar != null) {
            return Math.max(1L, xaVar.e);
        }
        xa xaVar2 = this.w;
        return xaVar2 != null ? Math.max(1L, xaVar2.e) : this.F ? Math.max(1L, this.I) : Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (f10 > 0.0f) {
                f10 += org.telegram.messenger.g0.L(4.0f);
            }
            f10 += org.telegram.messenger.g0.W1(((xa) arrayList.get(i7)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return f10;
    }

    private float getRoundHeight() {
        if (this.F) {
            return org.telegram.messenger.g0.W1(this.e0.d(this.H), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return 0.0f;
    }

    private float getVideoHeight() {
        if (this.h == null) {
            return 0.0f;
        }
        return org.telegram.messenger.g0.W1(r0.k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013c A[LOOP:0: B:38:0x013c->B:42:0x01eb, LOOP_START, PHI: r5
      0x013c: PHI (r5v34 int) = (r5v7 int), (r5v35 int) binds: [B:37:0x013a, B:42:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ce A[PHI: r21
      0x03ce: PHI (r21v2 int) = (r21v1 int), (r21v1 int), (r21v3 int) binds: [B:89:0x0242, B:91:0x024c, B:77:0x03cc] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        xa xaVar;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(this.e, getBaseDuration(), 0L);
        xa xaVar2 = this.w;
        float f10 = min;
        float f11 = (this.v1 * (((k10 + (xaVar2 != null ? (xaVar2.g * xaVar2.e) + xaVar2.f : this.h == null ? this.R : 0L)) - this.f) / f10)) + this.z1 + this.y1;
        if (!this.Y0 && x10 >= f11 - org.telegram.messenger.g0.L(12.0f) && x10 <= f11 + org.telegram.messenger.g0.L(12.0f)) {
            return 0;
        }
        boolean z11 = this.h != null && y10 > (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(2.0f));
        ArrayList arrayList = this.s;
        boolean z12 = !arrayList.isEmpty() && y10 > ((((((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(4.0f))) - getCollageHeight()) - ((float) org.telegram.messenger.g0.L(4.0f))) - ((float) org.telegram.messenger.g0.L(2.0f)) && y10 < (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(2.0f));
        if (this.F) {
            if (y10 > (((((((this.x1 - this.A1) - getVideoHeight()) - org.telegram.messenger.g0.L(4.0f)) - getCollageHeight()) - org.telegram.messenger.g0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(2.0f)) {
                if (y10 < ((((this.x1 - this.A1) - getVideoHeight()) - org.telegram.messenger.g0.L(2.0f)) - getCollageHeight()) - org.telegram.messenger.g0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z10 = true;
                    if (z12) {
                        i7 = 1;
                        if (z11) {
                            float f12 = this.z1 + this.y1;
                            xa xaVar3 = this.h;
                            float f13 = xaVar3.g;
                            float f14 = xaVar3.e;
                            float f15 = this.f;
                            float f16 = this.v1;
                            float f17 = ((((f13 * f14) - f15) / f10) * f16) + f12;
                            float f18 = ((((xaVar3.h * f14) - f15) / f10) * f16) + f12;
                            if (this.Y0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x10 < f17 - org.telegram.messenger.g0.L(15.0f) || x10 > f18 + org.telegram.messenger.g0.L(15.0f)) {
                                    return i7;
                                }
                                return 4;
                            }
                            if (x10 >= f17 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f17) {
                                return 2;
                            }
                            if (x10 >= f18 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f18) {
                                return 3;
                            }
                            if (x10 >= f17 && x10 <= f18) {
                                xa xaVar4 = this.h;
                                if (xaVar4.g > 0.01f || xaVar4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z10) {
                            float f19 = this.z1 + this.y1;
                            float f20 = this.J;
                            float f21 = this.K;
                            float f22 = this.I;
                            float f23 = this.f;
                            float f24 = this.v1;
                            float f25 = (((((f21 * f22) + f20) - f23) / f10) * f24) + f19;
                            float f26 = (((((this.L * f22) + f20) - f23) / f10) * f24) + f19;
                            if (this.H || this.h == null) {
                                if (x10 >= f25 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f25) {
                                    return 10;
                                }
                                if (x10 >= f26 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f26) {
                                    return 11;
                                }
                                if (x10 >= f25 && x10 <= f26) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f27 = this.z1 + this.y1;
                                long j3 = this.J;
                                long j10 = this.f;
                                float f28 = this.v1;
                                float f29 = (((j3 - j10) / f10) * f28) + f27;
                                f26 = com.google.android.gms.internal.vision.e2.c((j3 + this.I) - j10, f10, f28, f27);
                                f25 = f29;
                            }
                            if (x10 >= f25 && x10 <= f26) {
                                return 9;
                            }
                        } else if (this.O) {
                            float f30 = this.z1 + this.y1;
                            float f31 = this.R;
                            float f32 = this.T;
                            float f33 = this.S;
                            float f34 = this.f;
                            float f35 = this.v1;
                            float f36 = (((((f32 * f33) + f31) - f34) / f10) * f35) + f30;
                            float f37 = (((((this.U * f33) + f31) - f34) / f10) * f35) + f30;
                            if (this.Q || (this.h == null && !this.F)) {
                                if (x10 >= f36 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f36) {
                                    return 6;
                                }
                                if (x10 >= f37 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f37) {
                                    return 7;
                                }
                                if (x10 >= f36 && x10 <= f37) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f38 = this.z1 + this.y1;
                                long j11 = this.R;
                                long j12 = this.f;
                                float f39 = this.v1;
                                float f40 = (((j11 - j12) / f10) * f39) + f38;
                                f37 = com.google.android.gms.internal.vision.e2.c((j11 + this.S) - j12, f10, f39, f38);
                                f36 = f40;
                            }
                            if (x10 >= f36 && x10 <= f37) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            xa xaVar5 = (xa) arrayList.get(i10);
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(xaVar5.j);
                            rectF.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
                            if (rectF.contains(x10, y10)) {
                                float f41 = this.z1 + this.y1;
                                float f42 = xaVar5.f;
                                float f43 = this.v1;
                                float f44 = ((f42 / f10) * f43) + f41;
                                float f45 = xaVar5.g;
                                float f46 = xaVar5.e;
                                float f47 = ((((f45 * f46) + f42) / f10) * f43) + f41;
                                float f48 = ((((xaVar5.h * f46) + f42) / f10) * f43) + f41;
                                float c10 = com.google.android.gms.internal.vision.e2.c(r6 + r11, f10, f43, f41);
                                this.j1 = i10;
                                if (x10 >= f47 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f47) {
                                    return 13;
                                }
                                if (x10 >= f48 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f48) {
                                    return 14;
                                }
                                if (x10 < f47 || x10 > f48 || (xaVar5.g <= 0.01f && xaVar5.h >= 0.99f)) {
                                    return (x10 < f44 || x10 > c10) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i7 = 1;
                    }
                    xaVar = this.h;
                    if (xaVar != null || xaVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        xaVar = this.h;
        return xaVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        bl0 bl0Var = this.X0;
        if (!bl0Var.b()) {
            if (this.s1) {
                this.s1 = false;
                wa waVar = this.a;
                if (waVar != null) {
                    waVar.A(false);
                    return;
                }
                return;
            }
            return;
        }
        int i7 = bl0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.r1) {
            this.f = (long) Math.max(0.0f, (((i7 - this.z1) - this.y1) / this.v1) * min);
        } else {
            if (!this.Q) {
                bl0Var.a();
                return;
            }
            int i10 = this.z1;
            int i11 = this.y1;
            float f10 = this.v1;
            float f11 = min;
            h(((((i7 - i10) - i11) / f10) * f11) - ((((this.t1 - i10) - i11) / f10) * f11));
        }
        invalidate();
        this.t1 = i7;
    }

    public final void d(float f10, float f11, float f12, long j3, Canvas canvas) {
        float f13;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(j3, getBaseDuration(), 0L);
        xa xaVar = this.w;
        if (xaVar != null) {
            f13 = (xaVar.g * xaVar.e) + xaVar.f;
        } else {
            f13 = this.h == null ? this.R : 0L;
        }
        float f14 = (this.v1 * (((k10 + f13) - this.f) / min)) + this.z1 + this.y1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.D0;
        paint.setAlpha((int) (38.0f * f12));
        Paint paint2 = this.E0;
        paint2.setAlpha((int) (f12 * 255.0f));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        rectF.inset(-org.telegram.messenger.g0.N(0.66f), -org.telegram.messenger.g0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
    }

    /* JADX WARN: Incorrect condition in loop: B:119:0x06a3 */
    /* JADX WARN: Incorrect condition in loop: B:133:0x0700 */
    /* JADX WARN: Incorrect condition in loop: B:209:0x09b3 */
    /* JADX WARN: Incorrect condition in loop: B:225:0x0a00 */
    /* JADX WARN: Incorrect condition in loop: B:67:0x03e1 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x06f2 A[LOOP:4: B:132:0x06f2->B:138:0x0746, LOOP_START, PHI: r4 r7 r9 r10 r12 r14
      0x06f2: PHI (r4v176 int) = (r4v174 int), (r4v178 int) binds: [B:131:0x06f0, B:138:0x0746] A[DONT_GENERATE, DONT_INLINE]
      0x06f2: PHI (r7v129 float) = (r7v117 float), (r7v130 float) binds: [B:131:0x06f0, B:138:0x0746] A[DONT_GENERATE, DONT_INLINE]
      0x06f2: PHI (r9v77 float) = (r9v67 float), (r9v78 float) binds: [B:131:0x06f0, B:138:0x0746] A[DONT_GENERATE, DONT_INLINE]
      0x06f2: PHI (r10v99 float) = (r10v98 float), (r10v100 float) binds: [B:131:0x06f0, B:138:0x0746] A[DONT_GENERATE, DONT_INLINE]
      0x06f2: PHI (r12v64 boolean) = (r12v62 boolean), (r12v65 boolean) binds: [B:131:0x06f0, B:138:0x0746] A[DONT_GENERATE, DONT_INLINE]
      0x06f2: PHI (r14v63 int) = (r14v62 int), (r14v64 int) binds: [B:131:0x06f0, B:138:0x0746] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09f2 A[LOOP:6: B:224:0x09f2->B:230:0x0a44, LOOP_START, PHI: r6 r7 r9 r11 r14
      0x09f2: PHI (r6v110 int) = (r6v109 int), (r6v111 int) binds: [B:223:0x09f0, B:230:0x0a44] A[DONT_GENERATE, DONT_INLINE]
      0x09f2: PHI (r7v99 int) = (r7v98 int), (r7v100 int) binds: [B:223:0x09f0, B:230:0x0a44] A[DONT_GENERATE, DONT_INLINE]
      0x09f2: PHI (r9v51 boolean) = (r9v49 boolean), (r9v52 boolean) binds: [B:223:0x09f0, B:230:0x0a44] A[DONT_GENERATE, DONT_INLINE]
      0x09f2: PHI (r11v57 int) = (r11v56 int), (r11v58 int) binds: [B:223:0x09f0, B:230:0x0a44] A[DONT_GENERATE, DONT_INLINE]
      0x09f2: PHI (r14v34 float) = (r14v33 float), (r14v35 float) binds: [B:223:0x09f0, B:230:0x0a44] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0eb4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        long j3;
        Paint paint;
        ArrayList arrayList;
        float f10;
        org.telegram.ui.Components.y9 y9Var;
        RectF rectF2;
        int i7;
        long j10;
        float f11;
        int i10;
        xa xaVar;
        xa xaVar2;
        int i11;
        long j11;
        float f12;
        Canvas canvas2;
        boolean z10;
        float f13;
        float f14;
        float f15;
        RectF rectF3;
        ArrayList arrayList2;
        long j12;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        Paint paint2;
        float f28;
        float f29;
        Paint paint3;
        float f30;
        float f31;
        double d;
        float f32;
        float f33;
        float f34;
        Canvas canvas3;
        float f35;
        float f36;
        float f37;
        float f38;
        float f39;
        float f40;
        float T1;
        float y10;
        float f41;
        float f42;
        float f43;
        float f44;
        float c10;
        float f45;
        float f46;
        Paint paint4;
        float f47;
        int i12;
        long j13;
        float f48;
        float f49;
        float f50;
        ArrayList arrayList3;
        boolean z11;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i13;
        int i14;
        boolean z12;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i15;
        RectF rectF4;
        Path path;
        Paint paint5;
        float f51;
        org.telegram.ui.Components.y9 y9Var2;
        float c11;
        float f52;
        float f53;
        Paint paint6;
        org.telegram.ui.Components.y9 y9Var3;
        float f54;
        float f55;
        float f56;
        float f57;
        ArrayList arrayList8;
        boolean z13;
        float f58;
        ArrayList arrayList9;
        ArrayList arrayList10;
        float f59;
        float f60;
        boolean z14;
        ArrayList arrayList11;
        ArrayList arrayList12;
        float f61;
        float f62;
        float f63;
        float f64;
        float f65;
        float f66;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        int i16;
        boolean z15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        Paint paint7;
        Paint paint8;
        org.telegram.ui.Components.y9 y9Var4;
        char c12;
        boolean z16;
        cb cbVar = this;
        RectF rectF5 = cbVar.u0;
        RectF rectF6 = cbVar.y0;
        Path path2 = cbVar.x0;
        ArrayList arrayList18 = cbVar.r;
        Drawable drawable = cbVar.s0;
        org.telegram.ui.Components.u9 u9Var = cbVar.l0;
        RectF rectF7 = cbVar.G0;
        ArrayList arrayList19 = cbVar.s;
        RectF rectF8 = cbVar.p0;
        org.telegram.ui.Components.y9 y9Var5 = cbVar.m0;
        Paint c13 = y9Var5.c(1.0f);
        float d2 = cbVar.j0.d(cbVar.k0);
        long min = Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration());
        if (d2 < 1.0f) {
            rectF8.set(cbVar.z1, (cbVar.x1 - cbVar.A1) - org.telegram.messenger.g0.L(28.0f), cbVar.w1 - cbVar.z1, cbVar.x1 - cbVar.A1);
            cbVar.q0.rewind();
            cbVar.q0.addRoundRect(rectF8, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF8, (int) ((1.0f - d2) * 255.0f), 31);
            canvas.clipPath(cbVar.q0);
            if (u9Var.c()) {
                y9Var5.a(canvas);
                canvas.drawColor(855638016);
                paint7 = c13;
            } else if (c13 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint7 = c13;
            } else {
                paint7 = c13;
                canvas.drawRect(rectF8, paint7);
                canvas.drawColor(855638016);
            }
            if (arrayList18.isEmpty() || !u9Var.c()) {
                paint8 = paint7;
                rectF = rectF5;
                y9Var4 = y9Var5;
                j3 = min;
                c12 = 31;
                if (!arrayList18.isEmpty()) {
                    Paint c14 = cbVar.o0.c(0.4f);
                    if (c14 == null) {
                        c14 = cbVar.I0;
                        c14.setAlpha(64);
                    }
                    z16 = false;
                    cbVar.t0.a((((cbVar.R - cbVar.f) / j3) * cbVar.v1) + cbVar.z1 + cbVar.y1, rectF8.left, rectF8.right, org.telegram.messenger.g0.L(28.0f), cbVar.i0.e(false, bb.c(arrayList18)), rectF8.bottom, arrayList18);
                    canvas.drawPath(cbVar.t0, c14);
                    float g10 = ((cbVar.r0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF8.centerX() - g10);
                    int centerY = (int) rectF8.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.Cells.y0.y(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.y0.h(2, centerY, drawable));
                    drawable.setAlpha(ns.V2);
                    drawable.draw(canvas);
                    oy0 oy0Var = cbVar.r0;
                    float centerX2 = (rectF8.centerX() - g10) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
                    float f67 = centerY;
                    paint = paint8;
                    rectF2 = rectF7;
                    arrayList = arrayList19;
                    y9Var = y9Var4;
                    f10 = 0.4f;
                    oy0Var.c(centerX2, f67, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float e10 = cbVar.i0.e(false, bb.c(arrayList18));
                rectF8 = rectF8;
                paint8 = paint7;
                rectF = rectF5;
                j3 = min;
                y9Var4 = y9Var5;
                cbVar.t0.a((((cbVar.R - cbVar.f) / min) * cbVar.v1) + cbVar.z1 + cbVar.y1, rectF8.left, rectF8.right, org.telegram.messenger.g0.L(28.0f), e10, rectF8.bottom, arrayList18);
                c12 = 31;
                canvas.saveLayerAlpha(rectF8, ns.n1, 31);
                canvas.clipPath(cbVar.t0);
                cbVar.o0.a(canvas);
                canvas.restore();
            }
            z16 = false;
            float g102 = ((cbVar.r0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF8.centerX() - g102);
            int centerY2 = (int) rectF8.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.Cells.y0.y(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.y0.h(2, centerY2, drawable));
            drawable.setAlpha(ns.V2);
            drawable.draw(canvas);
            oy0 oy0Var2 = cbVar.r0;
            float centerX22 = (rectF8.centerX() - g102) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
            float f672 = centerY2;
            paint = paint8;
            rectF2 = rectF7;
            arrayList = arrayList19;
            y9Var = y9Var4;
            f10 = 0.4f;
            oy0Var2.c(centerX22, f672, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF5;
            j3 = min;
            paint = c13;
            arrayList = arrayList19;
            f10 = 0.4f;
            y9Var = y9Var5;
            rectF2 = rectF7;
        }
        if (d2 > 0.0f) {
            if (d2 < 1.0f) {
                f12 = 0.0f;
                j11 = j3;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, cbVar.getWidth(), cbVar.getHeight(), (int) (d2 * 255.0f), 31);
                z10 = true;
            } else {
                j11 = j3;
                f12 = 0.0f;
                canvas2 = canvas;
                z10 = false;
            }
            xa xaVar3 = cbVar.h;
            float f68 = xaVar3 != null ? 1.0f : f12;
            float d10 = xaVar3 != null ? xaVar3.k.d((cbVar.Q || cbVar.H) ? false : true) : f12;
            float f69 = cbVar.x1 - cbVar.A1;
            float L = org.telegram.messenger.g0.L(4.0f);
            if (cbVar.h != null) {
                canvas2.save();
                float videoHeight = cbVar.getVideoHeight();
                xa xaVar4 = cbVar.h;
                float f70 = xaVar4.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j14 = xaVar4.e;
                float f71 = j14;
                float x10 = com.google.android.gms.internal.vision.e2.x(f70, f71, d10, f12);
                float x11 = com.google.android.gms.internal.vision.e2.x(xaVar4.h, f71, d10, f12);
                if (j14 <= 0) {
                    f13 = d10;
                    f62 = f12;
                    f15 = f62;
                    f61 = f68;
                    j12 = j11;
                    f18 = L;
                } else {
                    f15 = f12;
                    f13 = d10;
                    f61 = f68;
                    j12 = j11;
                    f18 = L;
                    f62 = (cbVar.z1 + cbVar.y1) - (cbVar.v1 * (cbVar.f / j12));
                }
                f21 = x10;
                float f72 = cbVar.y1;
                float f73 = f62 - f72;
                if (j14 <= 0) {
                    f63 = f72;
                    f19 = x11;
                    f64 = f15;
                } else {
                    f63 = f72;
                    f19 = x11;
                    f64 = (((j14 - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + r5;
                }
                RectF rectF9 = rectF;
                rectF9.set(f73, f69 - videoHeight, f64 + f63, f69);
                float f74 = f69 - ((f18 * f61) + videoHeight);
                float f75 = (rectF9.top * f13) + f15;
                float f76 = (rectF9.bottom * f13) + f15;
                cbVar.w0.rewind();
                cbVar.w0.addRoundRect(rectF9, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(cbVar.w0);
                ab abVar = cbVar.h.c;
                if (abVar != null) {
                    int i17 = abVar.f;
                    float f77 = i17;
                    f22 = f75;
                    int max = (int) Math.max(0.0d, Math.floor((f73 - cbVar.z1) / f77));
                    f14 = f61;
                    int min2 = (int) Math.min(cbVar.h.c.c, Math.ceil(((r6 - f73) - cbVar.z1) / f77) + 1.0d);
                    int i18 = (int) rectF9.top;
                    arrayList13 = cbVar.h.c.d;
                    boolean z17 = arrayList13.size() >= min2;
                    boolean z18 = (i17 == 0 || !z17 || cbVar.h.b) ? false : true;
                    if (z18) {
                        int i19 = max;
                        while (true) {
                            arrayList16 = cbVar.h.c.d;
                            if (i19 >= Math.min(arrayList16.size(), min2)) {
                                break;
                            }
                            arrayList17 = cbVar.h.c.d;
                            if (((za) arrayList17.get(i19)).a == null) {
                                z18 = false;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (!z18) {
                        if (u9Var.c()) {
                            y9Var.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF9, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i17 != 0) {
                        float f78 = f73;
                        int i20 = max;
                        while (i20 < Math.min(arrayList14.size(), min2)) {
                            arrayList15 = cbVar.h.c.d;
                            za zaVar = (za) arrayList15.get(i20);
                            if (zaVar.a != null) {
                                i16 = min2;
                                z15 = z17;
                                cbVar.v0.setAlpha((int) (zaVar.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(zaVar.a, f78, i18 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), cbVar.v0);
                            } else {
                                i16 = min2;
                                z15 = z17;
                            }
                            f78 += f77;
                            i20++;
                            z17 = z15;
                            min2 = i16;
                        }
                    }
                    boolean z19 = z17;
                    f65 = 1.0f;
                    f66 = 2.0f;
                    if (!z19) {
                        cbVar.h.c.c();
                    }
                } else {
                    f22 = f75;
                    f14 = f61;
                    f65 = 1.0f;
                    f66 = 2.0f;
                }
                path2.rewind();
                if (cbVar.Y0) {
                    f17 = f65;
                    f16 = f66;
                    f20 = f76;
                } else {
                    RectF rectF10 = org.telegram.messenger.g0.P;
                    float f79 = cbVar.z1 + cbVar.y1;
                    xa xaVar5 = cbVar.h;
                    float f80 = xaVar5.g;
                    f16 = f66;
                    f20 = f76;
                    float f81 = xaVar5.e;
                    f17 = f65;
                    float f82 = cbVar.f;
                    float f83 = j12;
                    float f84 = cbVar.v1;
                    float f85 = (((((f80 * f81) - f82) / f83) * f84) + f79) - (f80 <= f15 ? r7 : 0);
                    float f86 = cbVar.x1 - cbVar.A1;
                    float f87 = f86 - videoHeight;
                    float f88 = xaVar5.h;
                    rectF10.set(f85, f87, ((((f81 * f88) - f82) / f83) * f84) + f79 + (f88 >= f17 ? r7 : 0), f86);
                    path2.addRoundRect(rectF10, cbVar.u1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f12 = videoHeight;
                f69 = f74;
            } else {
                f13 = d10;
                f14 = f68;
                f15 = f12;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j12 = j11;
                f16 = 2.0f;
                f17 = 1.0f;
                f18 = L;
                f19 = f12;
                f20 = f19;
                f21 = f20;
                f22 = f21;
            }
            if (arrayList2.isEmpty()) {
                f23 = f19;
                f24 = f21;
                f25 = 0.0f;
            } else {
                cbVar.getCollageHeight();
                float f89 = f69;
                f24 = f21;
                int i21 = 0;
                while (true) {
                    f23 = f19;
                    if (i21 >= arrayList2.size()) {
                        break;
                    }
                    ArrayList arrayList20 = arrayList2;
                    xa xaVar6 = (xa) arrayList20.get(i21);
                    org.telegram.ui.Components.u5 u5Var = xaVar6.k;
                    float f90 = f12;
                    RectF rectF11 = xaVar6.j;
                    float d11 = u5Var.d((cbVar.Q || cbVar.H || cbVar.n != i21) ? false : true);
                    if (xaVar6 != cbVar.w) {
                        i15 = i21;
                        path = path2;
                        float f91 = j12;
                        float T12 = ((((org.telegram.messenger.g0.T1(xaVar6.g, f15, d11) * xaVar6.e) + (xaVar6.f - cbVar.f)) / f91) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                        rectF4 = rectF6;
                        paint5 = paint;
                        c11 = (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(xaVar6.h, f17, d11), xaVar6.e, xaVar6.f - cbVar.f, f91) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                        y9Var2 = y9Var;
                        f51 = T12;
                    } else {
                        i15 = i21;
                        rectF4 = rectF6;
                        path = path2;
                        paint5 = paint;
                        float f92 = cbVar.z1 + cbVar.y1;
                        float f93 = j12;
                        float f94 = (xaVar6.f - cbVar.f) / f93;
                        float f95 = cbVar.v1;
                        f51 = (f94 * f95) + f92;
                        y9Var2 = y9Var;
                        c11 = com.google.android.gms.internal.vision.e2.c(r9 + xaVar6.e, f93, f95, f92);
                    }
                    canvas2.save();
                    float W1 = org.telegram.messenger.g0.W1(d11, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
                    float f96 = cbVar.y1;
                    rectF11.set(f51 - f96, f89 - W1, c11 + f96, f89);
                    f22 = (rectF11.top * d11) + f22;
                    f20 = (rectF11.bottom * d11) + f20;
                    float f97 = xaVar6.f;
                    float f98 = xaVar6.g;
                    float f99 = xaVar6.e;
                    float f100 = org.telegram.ui.Cells.y0.f(f98, f99, f97, d11, f24);
                    float f101 = org.telegram.ui.Cells.y0.f(xaVar6.h, f99, f97, d11, f23);
                    cbVar.y.rewind();
                    cbVar.y.addRoundRect(rectF11, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(cbVar.y);
                    ab abVar2 = xaVar6.c;
                    if (abVar2 != null) {
                        long j15 = xaVar6.e;
                        if (j15 <= 0) {
                            f52 = f89;
                            f19 = f101;
                            f55 = 0.0f;
                        } else {
                            f52 = f89;
                            f19 = f101;
                            f55 = (((xaVar6.f - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                        }
                        float f102 = cbVar.y1;
                        float f103 = f55 - f102;
                        if (j15 <= 0) {
                            f56 = f103;
                            f57 = 0.0f;
                        } else {
                            f56 = f103;
                            f57 = ((((xaVar6.f + j15) - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + r6;
                        }
                        float f104 = f57 + f102;
                        int i22 = abVar2.f;
                        float f105 = i22;
                        int max2 = (int) Math.max(0.0d, Math.floor((f56 - ((((xaVar6.f - cbVar.f) / j12) * cbVar.v1) + (cbVar.z1 + cbVar.y1))) / f105));
                        int min3 = (int) Math.min(xaVar6.c.c, Math.ceil((f104 - f56) / f105) + 1.0d);
                        int i23 = (int) rectF11.top;
                        arrayList8 = xaVar6.c.d;
                        boolean z20 = arrayList8.size() >= min3;
                        if (z20) {
                            for (int i24 = max2; i24 < Math.min(arrayList11.size(), min3); i24++) {
                                arrayList12 = xaVar6.c.d;
                                if (((za) arrayList12.get(i24)).a == null) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                        z13 = z20;
                        if (z13) {
                            paint6 = paint5;
                            y9Var3 = y9Var2;
                        } else {
                            if (u9Var.c()) {
                                y9Var3 = y9Var2;
                                y9Var3.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else {
                                y9Var3 = y9Var2;
                                if (paint5 == null) {
                                    canvas2.drawColor(TLObject.FLAG_30);
                                } else {
                                    paint6 = paint5;
                                    canvas2.drawRect(rectF11, paint6);
                                    f58 = f105;
                                    canvas2.drawColor(855638016);
                                    if (i22 != 0) {
                                        while (max2 < Math.min(arrayList9.size(), min3)) {
                                            arrayList10 = xaVar6.c.d;
                                            za zaVar2 = (za) arrayList10.get(max2);
                                            int i25 = min3;
                                            if (zaVar2.a != null) {
                                                f59 = f100;
                                                f60 = W1;
                                                z14 = z20;
                                                cbVar.x.setAlpha((int) (zaVar2.b.e(false, 1.0f) * 255.0f));
                                                canvas2.drawBitmap(zaVar2.a, f56, i23 - ((int) ((r4.getHeight() - f60) / f16)), cbVar.x);
                                            } else {
                                                f59 = f100;
                                                f60 = W1;
                                                z14 = z20;
                                            }
                                            f56 += f58;
                                            max2++;
                                            min3 = i25;
                                            f100 = f59;
                                            W1 = f60;
                                            z20 = z14;
                                        }
                                    }
                                    f53 = f100;
                                    f54 = W1;
                                    if (!z20) {
                                        xaVar6.c.c();
                                    }
                                }
                            }
                            paint6 = paint5;
                        }
                        f58 = f105;
                        if (i22 != 0) {
                        }
                        f53 = f100;
                        f54 = W1;
                        if (!z20) {
                        }
                    } else {
                        f52 = f89;
                        f19 = f101;
                        f53 = f100;
                        paint6 = paint5;
                        y9Var3 = y9Var2;
                        f54 = W1;
                    }
                    cbVar.E.rewind();
                    if (!cbVar.Y0) {
                        RectF rectF12 = org.telegram.messenger.g0.P;
                        int i26 = cbVar.z1;
                        int i27 = cbVar.y1;
                        float f106 = i26 + i27;
                        float f107 = xaVar6.g;
                        int i28 = i27;
                        float f108 = xaVar6.e;
                        float f109 = f107 * f108;
                        float f110 = cbVar.f;
                        float f111 = f109 - f110;
                        float f112 = xaVar6.f;
                        float f113 = f111 + f112;
                        float f114 = j12;
                        float f115 = f113 / f114;
                        float f116 = cbVar.v1;
                        float f117 = ((f115 * f116) + f106) - (f107 <= 0.0f ? i28 : 0);
                        float f118 = rectF11.top;
                        float f119 = xaVar6.h;
                        float f120 = (((((f108 * f119) - f110) + f112) / f114) * f116) + f106;
                        if (f119 < 1.0f) {
                            i28 = 0;
                        }
                        rectF12.set(f117, f118, f120 + i28, rectF11.bottom);
                        cbVar.E.addRoundRect(rectF12, cbVar.u1, Path.Direction.CW);
                        canvas2.clipPath(cbVar.E, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    paint = paint6;
                    path2 = path;
                    f12 = f90;
                    arrayList2 = arrayList20;
                    rectF6 = rectF4;
                    f24 = f53;
                    f15 = 0.0f;
                    f17 = 1.0f;
                    y9Var = y9Var3;
                    f89 = f52 - ((f18 * 1.0f) + f54);
                    i21 = i15 + 1;
                }
                f69 = f89;
                f25 = 1.0f;
            }
            RectF rectF13 = rectF6;
            Path path3 = path2;
            org.telegram.ui.Components.y9 y9Var6 = y9Var;
            Paint paint9 = paint;
            ArrayList arrayList21 = arrayList2;
            float f121 = f12;
            float d12 = cbVar.d0.d(cbVar.F);
            float d13 = cbVar.e0.d(cbVar.F && cbVar.H);
            float roundHeight = cbVar.getRoundHeight() * d12;
            float f122 = ((cbVar.h == null && !cbVar.O && arrayList21.isEmpty()) ? 1.0f : d13) * d12;
            if (d12 > 0.0f) {
                long j16 = cbVar.J;
                float f123 = j16;
                float f124 = cbVar.K;
                f27 = f25;
                float f125 = cbVar.I;
                float f126 = org.telegram.ui.Cells.y0.f(f124, f125, f123, f122, f24);
                float f127 = org.telegram.ui.Cells.y0.f(cbVar.L, f125, f123, f122, f23);
                if (cbVar.h != null) {
                    float f128 = j12;
                    f45 = ((((org.telegram.messenger.g0.T1(f124, 0.0f, d13) * cbVar.I) + (j16 - cbVar.f)) / f128) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                    f44 = f127;
                    c10 = (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(cbVar.L, 1.0f, d13), cbVar.I, cbVar.J - cbVar.f, f128) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                } else {
                    f44 = f127;
                    float f129 = cbVar.z1 + cbVar.y1;
                    long j17 = j16 - cbVar.f;
                    float f130 = j12;
                    float f131 = cbVar.v1;
                    float f132 = ((j17 / f130) * f131) + f129;
                    c10 = com.google.android.gms.internal.vision.e2.c(j17 + r12, f130, f131, f129);
                    f45 = f132;
                }
                float f133 = cbVar.y1;
                rectF13.set(f45 - f133, f69 - roundHeight, c10 + f133, f69);
                float f134 = f69 - ((f18 * d12) + roundHeight);
                f22 = (rectF13.top * f122) + f22;
                f20 = (rectF13.bottom * f122) + f20;
                cbVar.z0.rewind();
                cbVar.z0.addRoundRect(rectF13, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(cbVar.z0);
                ab abVar3 = cbVar.N;
                if (abVar3 != null) {
                    long j18 = cbVar.I;
                    if (j18 <= 0) {
                        f26 = d13;
                        j13 = j18;
                        f48 = 0.0f;
                    } else {
                        f26 = d13;
                        j13 = j18;
                        f48 = (((cbVar.J - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                    }
                    float f135 = cbVar.y1;
                    float f136 = f48 - f135;
                    if (j18 <= 0) {
                        f49 = f136;
                        f50 = 0.0f;
                    } else {
                        f49 = f136;
                        f50 = cbVar.z1 + r10 + ((((cbVar.J + j13) - cbVar.f) / j12) * cbVar.v1);
                    }
                    float f137 = f50 + f135;
                    int i29 = abVar3.f;
                    float f138 = i29;
                    int max3 = (int) Math.max(0.0d, Math.floor((f49 - (cbVar.h != null ? (((cbVar.J - cbVar.f) / j12) * cbVar.v1) + (cbVar.z1 + cbVar.y1) : cbVar.z1)) / f138));
                    int min4 = (int) Math.min(cbVar.N.c, Math.ceil((f137 - f49) / f138) + 1.0d);
                    int i30 = (int) rectF13.top;
                    arrayList3 = cbVar.N.d;
                    boolean z21 = arrayList3.size() >= min4;
                    f46 = f134;
                    if (z21) {
                        for (int i31 = max3; i31 < Math.min(arrayList6.size(), min4); i31++) {
                            arrayList7 = cbVar.N.d;
                            if (((za) arrayList7.get(i31)).a == null) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = z21;
                    if (!z11) {
                        if (u9Var.c()) {
                            y9Var6.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint9 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            paint4 = paint9;
                            canvas2.drawRect(rectF13, paint4);
                            canvas2.drawColor(855638016);
                            if (i29 != 0) {
                                while (max3 < Math.min(arrayList4.size(), min4)) {
                                    arrayList5 = cbVar.N.d;
                                    za zaVar3 = (za) arrayList5.get(max3);
                                    if (zaVar3.a != null) {
                                        i13 = min4;
                                        i14 = i30;
                                        z12 = z21;
                                        cbVar.v0.setAlpha((int) (zaVar3.b.e(false, 1.0f) * 255.0f));
                                        canvas2.drawBitmap(zaVar3.a, f49, i14 - ((int) ((r4.getHeight() - roundHeight) / f16)), cbVar.v0);
                                    } else {
                                        i13 = min4;
                                        i14 = i30;
                                        z12 = z21;
                                    }
                                    f49 += f138;
                                    max3++;
                                    min4 = i13;
                                    i30 = i14;
                                    z21 = z12;
                                }
                            }
                            if (!z21) {
                                cbVar.N.c();
                            }
                        }
                    }
                    paint4 = paint9;
                    if (i29 != 0) {
                    }
                    if (!z21) {
                    }
                } else {
                    f46 = f134;
                    f26 = d13;
                    paint4 = paint9;
                }
                path3.rewind();
                RectF rectF14 = org.telegram.messenger.g0.P;
                int i32 = cbVar.z1;
                int i33 = cbVar.y1;
                float f139 = i32 + i33;
                float f140 = cbVar.K;
                float f141 = cbVar.I;
                float f142 = cbVar.f;
                float f143 = (f140 * f141) - f142;
                paint2 = paint4;
                float f144 = cbVar.J;
                float f145 = j12;
                float f146 = cbVar.v1;
                float f147 = (((f143 + f144) / f145) * f146) + f139;
                if (f140 <= 0.0f) {
                    f47 = f146;
                    i12 = i33;
                } else {
                    f47 = f146;
                    i12 = 0;
                }
                float f148 = (1.0f - f26) * i33;
                float f149 = (f147 - i12) - f148;
                float f150 = rectF13.top;
                float f151 = cbVar.L;
                rectF14.set(f149, f150, (((((f141 * f151) - f142) + f144) / f145) * f47) + f139 + (f151 >= 1.0f ? i33 : 0) + f148, rectF13.bottom);
                path3.addRoundRect(rectF14, cbVar.u1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f69 = f46;
                f24 = f126;
                f23 = f44;
            } else {
                f26 = d13;
                f27 = f25;
                paint2 = paint9;
            }
            float d14 = cbVar.f0.d(cbVar.O);
            float d15 = cbVar.g0.d(cbVar.O && cbVar.Q);
            float audioHeight = cbVar.getAudioHeight() * d14;
            float f152 = ((cbVar.h == null && !cbVar.F && arrayList21.isEmpty()) ? 1.0f : d15) * d14;
            if (d14 > 0.0f) {
                paint3 = paint2;
                float f153 = cbVar.R;
                float f154 = cbVar.T;
                float f155 = cbVar.S;
                float f156 = org.telegram.ui.Cells.y0.f(f154, f155, f153, f152, f24);
                float f157 = org.telegram.ui.Cells.y0.f(cbVar.U, f155, f153, f152, f23);
                Paint c15 = cbVar.n0.c(d14);
                canvas2.save();
                if (cbVar.h == null && !cbVar.F && arrayList21.isEmpty()) {
                    float f158 = cbVar.z1 + cbVar.y1;
                    f38 = f152;
                    f39 = f157;
                    long j19 = cbVar.R - cbVar.f;
                    float f159 = j12;
                    float f160 = cbVar.v1;
                    T1 = ((j19 / f159) * f160) + f158;
                    f40 = f156;
                    y10 = com.google.android.gms.internal.vision.e2.c(j19 + cbVar.S, f159, f160, f158);
                } else {
                    f38 = f152;
                    f39 = f157;
                    f40 = f156;
                    float f161 = j12;
                    T1 = ((((org.telegram.messenger.g0.T1(cbVar.T, 0.0f, d15) * cbVar.S) + (cbVar.R - cbVar.f)) / f161) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                    y10 = cbVar.z1 + cbVar.y1 + (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(cbVar.U, 1.0f, d15), cbVar.S, cbVar.R - cbVar.f, f161) * cbVar.v1);
                }
                float f162 = y10;
                float f163 = cbVar.y1;
                RectF rectF15 = rectF3;
                rectF15.set(T1 - f163, f69 - audioHeight, f162 + f163, f69);
                f22 = (rectF15.top * f38) + f22;
                f20 = (rectF15.bottom * f38) + f20;
                cbVar.H0.rewind();
                cbVar.H0.addRoundRect(rectF15, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(cbVar.H0);
                if (u9Var != null && u9Var.c()) {
                    y9Var6.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(d14, 855638016));
                } else if (c15 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(d14, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF15, c15);
                    canvas2.drawColor(org.telegram.ui.ActionBar.j6.r1(d14, 855638016));
                }
                if (cbVar.b0 == null || u9Var == null || !u9Var.c()) {
                    f41 = d15;
                    if (cbVar.b0 != null && c15 != null) {
                        Paint c16 = cbVar.o0.c(d14 * f10);
                        if (c16 == null) {
                            c16 = cbVar.I0;
                            c16.setAlpha((int) (64.0f * d14));
                        }
                        float e11 = cbVar.h0.e(!cbVar.V, cbVar.b0.e);
                        va vaVar = cbVar.b0;
                        cbVar.V = vaVar.c > 0;
                        long j20 = j12;
                        cbVar.J0.b((((cbVar.R - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + cbVar.y1, T1, f162, f41, j20, audioHeight, e11, rectF15.bottom, vaVar);
                        f42 = f41;
                        j10 = j20;
                        canvas2.drawPath(cbVar.J0, c16);
                        if (f42 >= 1.0f) {
                            int i34 = cbVar.z1;
                            float f164 = cbVar.y1 + i34;
                            float f165 = cbVar.R - cbVar.f;
                            float f166 = cbVar.T;
                            float f167 = cbVar.S;
                            float f168 = j10;
                            float f169 = cbVar.v1;
                            float f170 = ((((f166 * f167) + f165) / f168) * f169) + f164;
                            float f171 = ((((cbVar.U * f167) + f165) / f168) * f169) + f164;
                            float min5 = (Math.min(cbVar.w1 - cbVar.z1, f171) + Math.max(i34, f170)) / f16;
                            float centerY3 = rectF15.centerY();
                            float max4 = Math.max(0.0f, (Math.min(cbVar.w1 - cbVar.z1, f171) - Math.max(cbVar.z1, f170)) - org.telegram.messenger.g0.L(24.0f));
                            float N = org.telegram.messenger.g0.N(13.0f) + ((cbVar.N0 == null && cbVar.R0 == null) ? 0.0f : cbVar.S0 + org.telegram.messenger.g0.N(9.66f) + org.telegram.messenger.g0.N(3.11f) + cbVar.O0);
                            boolean z22 = N < max4;
                            float min6 = min5 - (Math.min(N, max4) / f16);
                            cbVar.L0.setBounds((int) min6, (int) (centerY3 - (org.telegram.messenger.g0.L(13.0f) / f16)), (int) (org.telegram.messenger.g0.L(13.0f) + min6), (int) ((org.telegram.messenger.g0.L(13.0f) / f16) + centerY3));
                            float f172 = 1.0f - f42;
                            float f173 = f172 * 255.0f;
                            cbVar.L0.setAlpha((int) f173);
                            cbVar.L0.draw(canvas2);
                            float N2 = org.telegram.messenger.g0.N(16.11f) + min6;
                            f29 = f42;
                            f30 = f13;
                            d = 0.0d;
                            f28 = d14;
                            f31 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, cbVar.w1, cbVar.x1, ns.e4, 31);
                            float min7 = Math.min(f171, cbVar.w1) - org.telegram.messenger.g0.L(12.0f);
                            canvas2.clipRect(N2, 0.0f, min7, cbVar.x1);
                            if (cbVar.N0 != null) {
                                canvas2.save();
                                i20.j(cbVar.N0.getHeight(), f16, centerY3, N2 - cbVar.P0, canvas2);
                                cbVar.M0.setAlpha((int) (f173 * f28));
                                cbVar.N0.draw(canvas2);
                                canvas2.restore();
                                f43 = cbVar.O0 + N2;
                            } else {
                                f43 = N2;
                            }
                            if (cbVar.N0 != null && cbVar.R0 != null) {
                                float N3 = org.telegram.messenger.g0.N(3.66f) + f43;
                                int alpha = cbVar.K0.getAlpha();
                                cbVar.K0.setAlpha((int) (alpha * f172));
                                canvas2.drawCircle(org.telegram.messenger.g0.L(1.0f) + N3, centerY3, org.telegram.messenger.g0.L(1.0f), cbVar.K0);
                                cbVar.K0.setAlpha(alpha);
                                f43 = org.telegram.messenger.g0.N(2.0f) + N3 + org.telegram.messenger.g0.N(4.0f);
                            }
                            if (cbVar.R0 != null) {
                                canvas2.save();
                                i20.j(cbVar.R0.getHeight(), 2.0f, centerY3, f43 - cbVar.T0, canvas2);
                                cbVar.Q0.setAlpha((int) (f173 * f28));
                                cbVar.R0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (z22) {
                                f11 = 1.0f;
                            } else {
                                cbVar.V0.reset();
                                f11 = 1.0f;
                                cbVar.V0.postScale(org.telegram.messenger.g0.N(8.0f) / 16.0f, 1.0f);
                                cbVar.V0.postTranslate(min7 - org.telegram.messenger.g0.L(8.0f), 0.0f);
                                cbVar.U0.setLocalMatrix(cbVar.V0);
                                canvas2.drawRect(min7 - org.telegram.messenger.g0.L(8.0f), rectF15.top, min7, rectF15.bottom, cbVar.W0);
                            }
                            canvas.restore();
                        } else {
                            f28 = d14;
                            f29 = f42;
                            f30 = f13;
                            f31 = f14;
                            f11 = 1.0f;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f23 = f39;
                        f24 = f40;
                    }
                } else {
                    float e12 = cbVar.h0.e(!cbVar.V, cbVar.b0.e);
                    va vaVar2 = cbVar.b0;
                    cbVar.V = vaVar2.c > 0;
                    f41 = d15;
                    cbVar.J0.b((((cbVar.R - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + cbVar.y1, T1, f162, f41, j12, audioHeight, e12, rectF15.bottom, vaVar2);
                    canvas2.saveLayerAlpha(rectF15, ns.n1, 31);
                    canvas2.clipPath(cbVar.J0);
                    cbVar.o0.a(canvas2);
                    canvas2.restore();
                }
                j10 = j12;
                f42 = f41;
                if (f42 >= 1.0f) {
                }
                canvas.restore();
                f23 = f39;
                f24 = f40;
            } else {
                f28 = d14;
                f29 = d15;
                paint3 = paint2;
                f30 = f13;
                f31 = f14;
                f11 = 1.0f;
                d = 0.0d;
                j10 = j12;
            }
            float f174 = f20;
            float f175 = f22;
            float f176 = cbVar.z1 + cbVar.y1;
            float f177 = cbVar.f;
            float f178 = j10;
            float f179 = cbVar.v1;
            float f180 = (((f24 - f177) / f178) * f179) + f176;
            float f181 = (((f23 - f177) / f178) * f179) + f176;
            if (!arrayList21.isEmpty()) {
                f32 = f28;
                f28 = f27;
            } else if (cbVar.O && cbVar.h == null) {
                f32 = f28;
            } else {
                float f182 = f28;
                f28 = Math.max(f31, d12);
                f32 = f182;
            }
            if (f32 > d || d12 > d || f31 > d || f27 > d) {
                if (cbVar.h == null && !cbVar.F && arrayList21.isEmpty()) {
                    f33 = f29;
                    f34 = f32 * org.telegram.messenger.g0.T1(0.6f, f11, f33);
                } else {
                    f33 = f29;
                    f34 = f11;
                }
                Paint paint10 = paint3;
                cbVar.e(canvas, paint10, f175, f174, f180, f181, f34 * f28);
                xa xaVar7 = cbVar.h;
                if (xaVar7 != null && ((cbVar.O || cbVar.F) && (f33 > 0.0f || f26 > 0.0f))) {
                    float f183 = cbVar.x1 - cbVar.A1;
                    float f184 = cbVar.y1 + cbVar.z1;
                    float f185 = xaVar7.g;
                    float f186 = xaVar7.e;
                    float f187 = cbVar.f;
                    float f188 = cbVar.v1;
                    float f189 = ((((xaVar7.h * f186) - f187) / f178) * f188) + f184;
                    canvas3 = canvas;
                    cbVar.e(canvas3, paint10, f183 - f121, f183, ((((f185 * f186) - f187) / f178) * f188) + f184, f189, 0.8f);
                } else if (cbVar.w == null || arrayList21.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    xa xaVar8 = cbVar.w;
                    RectF rectF16 = xaVar8.j;
                    float f190 = rectF16.top;
                    float f191 = rectF16.bottom;
                    float f192 = cbVar.y1 + cbVar.z1;
                    float f193 = xaVar8.f;
                    float f194 = xaVar8.g;
                    float f195 = xaVar8.e;
                    float f196 = cbVar.f;
                    float f197 = cbVar.v1;
                    float f198 = (((((f194 * f195) + f193) - f196) / f178) * f197) + f192;
                    float f199 = (((((xaVar8.h * f195) + f193) - f196) / f178) * f197) + f192;
                    canvas3 = canvas;
                    cbVar.e(canvas3, paint10, f190, f191, f198, f199, 0.8f);
                }
                if (cbVar.c0 > 1) {
                    xa xaVar9 = cbVar.h;
                    if (xaVar9 != null) {
                        float f200 = xaVar9.e;
                        float f201 = xaVar9.h;
                        float f202 = xaVar9.g;
                        long j21 = (long) ((f201 - f202) * f200);
                        if (j21 > 68999) {
                            float f203 = cbVar.z1 + cbVar.y1;
                            float f204 = cbVar.f;
                            float f205 = cbVar.v1;
                            float f206 = ((((f202 * f200) - f204) / f178) * f205) + f203;
                            float f207 = ((((f201 * f200) - f204) / f178) * f205) + f203;
                            canvas3.save();
                            float f208 = cbVar.x1 - cbVar.A1;
                            canvas3.clipRect(f206, f208 - f121, f207, f208);
                            cbVar.A0.setAlpha((int) (org.telegram.messenger.g0.T1(0.8f, f11, f30) * 255.0f));
                            i7 = 1;
                            long j22 = 59000;
                            int min8 = (int) Math.min(cbVar.c0 - 1, j21 / 59000);
                            int i35 = 1;
                            while (i35 <= min8) {
                                if (Math.min(j22, j21 - (i35 * j22)) < 1000) {
                                    break;
                                }
                                float f209 = cbVar.z1 + cbVar.y1;
                                xa xaVar10 = cbVar.h;
                                float f210 = ((((((long) (xaVar10.e * xaVar10.g)) + r2) - cbVar.f) / f178) * cbVar.v1) + f209;
                                int i36 = i35;
                                canvas.drawRect(f210, (cbVar.x1 - cbVar.A1) - f121, org.telegram.messenger.g0.L(f11) + f210, cbVar.x1 - cbVar.A1, cbVar.A0);
                                canvas3 = canvas;
                                StringBuilder sb2 = new StringBuilder("#");
                                int i37 = i36 + 1;
                                sb2.append(i37);
                                canvas3.drawText(sb2.toString(), f210 + org.telegram.messenger.g0.L(2.0f), ((cbVar.x1 - cbVar.A1) - f121) + org.telegram.messenger.g0.L(14.0f), cbVar.F0);
                                i35 = i37;
                                j22 = 59000;
                            }
                            canvas3.restore();
                        }
                    }
                    i7 = 1;
                } else {
                    i7 = 1;
                }
                float e13 = cbVar.c1.e(false, 0.0f);
                float contentHeight = ((cbVar.x1 - cbVar.getContentHeight()) + cbVar.A1) - org.telegram.messenger.g0.N(2.3f);
                float N4 = (cbVar.x1 - cbVar.A1) + org.telegram.messenger.g0.N(4.3f);
                if (e13 > 0.0f) {
                    long j23 = cbVar.d1;
                    if (j23 == -1) {
                        xa xaVar11 = cbVar.h;
                        if (xaVar11 != null) {
                            j23 = (long) (xaVar11.e * xaVar11.h);
                        } else {
                            xa xaVar12 = cbVar.w;
                            if (xaVar12 != null) {
                                j23 = (long) ((xaVar12.h - xaVar12.g) * xaVar12.e);
                            } else {
                                if (cbVar.F) {
                                    f36 = cbVar.I;
                                    f37 = cbVar.L;
                                } else {
                                    f36 = cbVar.S;
                                    f37 = cbVar.U;
                                }
                                j23 = (long) (f36 * f37);
                            }
                        }
                    }
                    Canvas canvas4 = canvas3;
                    f35 = contentHeight;
                    cbVar = cbVar;
                    cbVar.d(f35, N4, e13 * f28, j23, canvas4);
                } else {
                    f35 = contentHeight;
                    cbVar = cbVar;
                }
                cbVar.d(f35, N4, (f11 - e13) * f28, cbVar.e, canvas);
            } else {
                i7 = 1;
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            i7 = 1;
            j10 = j3;
            f11 = 1.0f;
        }
        if (cbVar.n1) {
            float f211 = f11 / (1000.0f / org.telegram.messenger.g0.r);
            float f212 = cbVar.o1;
            long L2 = (long) ((org.telegram.messenger.g0.L(32.0f) / cbVar.v1) * j10 * f211 * f212);
            if (cbVar.Y0) {
                cbVar.o1 = (f211 * 0.25f) + f212;
            }
            int i38 = cbVar.i1;
            if (i38 == 4 && (xaVar2 = cbVar.h) != null) {
                float f213 = xaVar2.g;
                long j24 = cbVar.f;
                long j25 = xaVar2.e;
                float f214 = j25;
                if (f213 < j24 / f214) {
                    i11 = -1;
                } else if (xaVar2.h > (j24 + j10) / f214) {
                    i11 = i7;
                } else {
                    cbVar.o1 = f11;
                    i11 = 0;
                }
                long j26 = i11 * L2;
                cbVar.f = Utilities.k(j24 + j26, j25 - j10, 0L);
                cbVar.e += j26;
                xa xaVar13 = cbVar.h;
                float f215 = (r3 - j24) / xaVar13.e;
                float min9 = f215 > 0.0f ? Math.min(f11 - xaVar13.h, f215) : Math.max(0.0f - xaVar13.g, f215);
                xa xaVar14 = cbVar.h;
                xaVar14.g = Utilities.i(xaVar14.g + min9, f11, 0.0f);
                xa xaVar15 = cbVar.h;
                xaVar15.h = Utilities.i(xaVar15.h + min9, f11, 0.0f);
                wa waVar = cbVar.a;
                if (waVar != null) {
                    waVar.v(false, cbVar.h.g);
                    cbVar.a.j0(cbVar.h.h);
                }
                cbVar.invalidate();
            } else if (i38 == 8) {
                float f216 = cbVar.T;
                long j27 = cbVar.R;
                float f217 = (-j27) + 100;
                long j28 = cbVar.S;
                float f218 = j28;
                if (f216 < f217 / f218) {
                    i10 = -1;
                } else if (cbVar.U >= ((r8 + j10) - 100) / f218) {
                    i10 = i7;
                } else {
                    cbVar.o1 = f11;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (cbVar.Q && (xaVar = cbVar.h) != null) {
                        long j29 = j27 - (i10 * L2);
                        float f219 = xaVar.h;
                        float f220 = xaVar.e;
                        cbVar.R = Utilities.k(j29, (long) ((f219 * f220) - (f216 * f218)), (long) ((xaVar.g * f220) - (cbVar.U * f218)));
                    } else if (cbVar.H && cbVar.F) {
                        long j30 = j27 - (i10 * L2);
                        float f221 = cbVar.L;
                        float f222 = cbVar.I;
                        cbVar.R = Utilities.k(j30, (long) ((f221 * f222) - (f216 * f218)), (long) ((cbVar.K * f222) - (cbVar.U * f218)));
                    } else {
                        cbVar.R = Utilities.k(j27 - (i10 * L2), 0L, -(j28 - Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration())));
                    }
                    float f223 = (-(cbVar.R - j27)) / cbVar.S;
                    float min10 = f223 > 0.0f ? Math.min(f11 - cbVar.U, f223) : Math.max(0.0f - cbVar.T, f223);
                    if (cbVar.h == null) {
                        float f224 = cbVar.e;
                        float f225 = cbVar.S;
                        cbVar.e = (long) Utilities.i((min10 * f225) + f224, f225, 0.0f);
                    }
                    cbVar.T = Utilities.i(cbVar.T + min10, f11, 0.0f);
                    cbVar.U = Utilities.i(cbVar.U + min10, f11, 0.0f);
                    wa waVar2 = cbVar.a;
                    if (waVar2 != null) {
                        waVar2.f0(cbVar.T);
                        cbVar.a.Y(cbVar.U);
                        cbVar.a.p(cbVar.e, false);
                    }
                    cbVar.invalidate();
                } else {
                    cbVar.o1 = f11;
                }
            } else {
                cbVar.o1 = f11;
            }
        } else {
            cbVar.o1 = f11;
        }
        int contentHeight2 = cbVar.getContentHeight();
        if (cbVar.c != contentHeight2) {
            cbVar.c = contentHeight2;
            Runnable runnable = cbVar.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f12 - org.telegram.messenger.g0.L(10.0f), f10, org.telegram.messenger.g0.L(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, ns.e4, 31);
        int i7 = (int) (255.0f * f14);
        Paint paint2 = this.A0;
        paint2.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
        rectF.inset(org.telegram.messenger.g0.L(this.Y0 ? 2.5f : 10.0f), org.telegram.messenger.g0.L(2.0f));
        boolean z10 = this.Y0;
        Paint paint3 = this.B0;
        if (z10) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(10.0f);
        Paint paint4 = this.C0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(ns.e4);
        paint5.setAlpha(i7);
        float f15 = f10 + f11;
        float f16 = (f15 - L2) / 2.0f;
        float f17 = (f15 + L2) / 2.0f;
        rectF.set(org.telegram.messenger.k5.y(org.telegram.messenger.g0.L(this.Y0 ? 2.0f : 10.0f), L, 2.0f, f12), f16, f12 - ((org.telegram.messenger.g0.L(this.Y0 ? 2.0f : 10.0f) + L) / 2.0f), f17);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            if (paint != null && !this.Y0) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.gms.internal.vision.e2.A(org.telegram.messenger.g0.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f13), f16, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f13), f17);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.c0 * 59000;
    }

    public final long g() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public int getContentHeight() {
        return (int) (this.A1 + (this.h != null ? getVideoHeight() + org.telegram.messenger.g0.L(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + org.telegram.messenger.g0.L(4.0f)) + (this.F ? getRoundHeight() + org.telegram.messenger.g0.L(4.0f) : 0.0f) + (this.O ? org.telegram.messenger.g0.L(4.0f) + getAudioHeight() : 0.0f) + this.A1);
    }

    public int getMaxCount() {
        return this.c0;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, (long) (f() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.g0.W1(this.j0.c, org.telegram.messenger.g0.L(28.0f) + this.A1 + this.A1, getContentHeight());
    }

    public final void h(float f10) {
        float f11;
        long j3;
        float f12;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        wa waVar;
        long k10;
        xa xaVar = this.h;
        if (xaVar == null && !this.F) {
            long j15 = this.R;
            long k11 = Utilities.k(j15 + ((long) f10), 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k11;
            float f13 = k11 - j15;
            this.T = Utilities.i(this.T - (f13 / this.S), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f13 / this.S), 1.0f, 0.0f);
            wa waVar2 = this.a;
            if (waVar2 != null) {
                waVar2.f0(this.T);
                this.a.Y(this.U);
            }
        } else if (this.Q) {
            if (xaVar != null) {
                f11 = xaVar.g;
                j3 = xaVar.e;
            } else {
                f11 = this.K;
                j3 = this.I;
            }
            float f14 = f11 * j3;
            if (xaVar != null) {
                f12 = xaVar.h;
                j10 = xaVar.e;
            } else {
                f12 = this.L;
                j10 = this.I;
            }
            float f15 = f12 * j10;
            float f16 = xaVar != null ? (xaVar.h - xaVar.g) * xaVar.e : this.I * (this.L - this.K);
            float f17 = this.U;
            float f18 = this.S;
            long j16 = (long) (f15 - (f17 * f18));
            float f19 = this.T;
            long j17 = (long) (f14 - (f19 * f18));
            float min = Math.min(f17 - f19, f16 / f18);
            long j18 = this.R;
            long j19 = (long) f10;
            long j20 = j18 + j19;
            if (j20 > j16) {
                float i7 = Utilities.i(((f15 - j18) - j19) / this.S, 1.0f, min);
                this.U = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.T = i10;
                float f20 = this.U;
                float f21 = this.S;
                long j21 = (long) (f15 - (f20 * f21));
                long j22 = (long) (f14 - (i10 * f21));
                if (j21 < j22) {
                    j14 = j22;
                    j13 = j21;
                } else {
                    j13 = j22;
                    j14 = j21;
                }
                this.R = Utilities.k(this.R + j19, j14, j13);
                wa waVar3 = this.a;
                if (waVar3 != null) {
                    waVar3.f0(this.T);
                    this.a.Y(this.U);
                }
            } else if (j20 < j17) {
                float i11 = Utilities.i(((f14 - j18) - j19) / this.S, 1.0f - min, 0.0f);
                this.T = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.U = i12;
                float f22 = this.S;
                long j23 = (long) (f15 - (i12 * f22));
                long j24 = (long) (f14 - (this.T * f22));
                if (j23 < j24) {
                    j12 = j24;
                    j11 = j23;
                } else {
                    j11 = j24;
                    j12 = j23;
                }
                this.R = Utilities.k(this.R + j19, j12, j11);
                wa waVar4 = this.a;
                if (waVar4 != null) {
                    waVar4.f0(this.T);
                    this.a.Y(this.U);
                }
            } else {
                this.R = j20;
            }
        } else {
            long j25 = this.R + ((long) f10);
            float baseDuration = getBaseDuration();
            float f23 = this.S;
            this.R = Utilities.k(j25, (long) (baseDuration - (this.U * f23)), (long) ((-this.T) * f23));
        }
        invalidate();
        wa waVar5 = this.a;
        if (waVar5 != null) {
            waVar5.t0(this.R + ((long) (this.T * this.S)));
        }
        boolean z10 = this.n1;
        if (z10 || (waVar = this.a) == null) {
            if (z10 || this.s1) {
                xa xaVar2 = this.h;
                if (xaVar2 != null) {
                    long j26 = this.R + ((long) (this.T * this.S));
                    float f24 = xaVar2.h;
                    float f25 = xaVar2.e;
                    this.e = Utilities.k(j26, (long) (f24 * f25), (long) (xaVar2.g * f25));
                } else if (!this.F || xaVar2 == null) {
                    float f26 = this.T;
                    long j27 = this.S;
                    this.e = Utilities.k((long) (f26 * j27), j27, 0L);
                } else {
                    long j28 = this.R + ((long) (this.T * this.S));
                    float f27 = this.L;
                    float f28 = xaVar2.e;
                    this.e = Utilities.k(j28, (long) (f27 * f28), (long) (this.K * f28));
                }
                wa waVar6 = this.a;
                if (waVar6 != null) {
                    waVar6.p(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        waVar.A(true);
        xa xaVar3 = this.h;
        if (xaVar3 != null) {
            long j29 = this.R + ((long) (this.T * this.S));
            float f29 = xaVar3.h;
            float f30 = xaVar3.e;
            k10 = Utilities.k(j29, (long) (f29 * f30), (long) (xaVar3.g * f30));
        } else if (this.F) {
            long j30 = this.R + ((long) (this.T * this.S));
            float f31 = this.L;
            float f32 = this.I;
            k10 = Utilities.k(j30, (long) (f31 * f32), (long) (this.K * f32));
        } else {
            float f33 = this.T;
            long j31 = this.S;
            k10 = Utilities.k((long) (f33 * j31), j31, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        wa waVar7 = this.a;
        this.e = k10;
        waVar7.p(k10, false);
    }

    public final void i(xa xaVar, float f10) {
        wa waVar;
        long k10;
        long j3;
        long j10;
        long j11;
        long j12;
        if (xaVar == null) {
            return;
        }
        xa xaVar2 = this.w;
        if (xaVar2 != xaVar && xaVar2 != null) {
            if (this.n == this.s.indexOf(xaVar)) {
                xa xaVar3 = this.w;
                float f11 = xaVar3.e;
                float f12 = xaVar.h;
                float f13 = xaVar.e;
                long j13 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = xaVar.g;
                long j14 = (long) ((f11 * 0.0f) - (f14 * f13));
                float min = Math.min(f12 - f14, ((xaVar3.h - xaVar3.g) * f11) / f13);
                long j15 = xaVar.f;
                long j16 = (long) f10;
                long j17 = j15 + j16;
                if (j17 > j13) {
                    float i7 = Utilities.i((((this.w.h * r2.e) - j15) - j16) / xaVar.e, 1.0f, min);
                    xaVar.h = i7;
                    float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                    xaVar.g = i10;
                    xa xaVar4 = this.w;
                    float f15 = xaVar4.h;
                    float f16 = xaVar4.e;
                    float f17 = xaVar.h;
                    float f18 = xaVar.e;
                    long j18 = (long) ((f15 * f16) - (f17 * f18));
                    long j19 = (long) ((xaVar4.g * f16) - (i10 * f18));
                    if (j18 < j19) {
                        j12 = j19;
                        j11 = j18;
                    } else {
                        j11 = j19;
                        j12 = j18;
                    }
                    xaVar.f = Utilities.k(xaVar.f + j16, j12, j11);
                    wa waVar2 = this.a;
                    if (waVar2 != null) {
                        waVar2.X(xaVar.g, xaVar.a);
                        this.a.i0(xaVar.h, xaVar.a);
                    }
                } else if (j17 < j14) {
                    float i11 = Utilities.i((((this.w.g * r2.e) - j15) - j16) / xaVar.e, 1.0f - min, 0.0f);
                    xaVar.g = i11;
                    float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                    xaVar.h = i12;
                    xa xaVar5 = this.w;
                    float f19 = xaVar5.h;
                    float f20 = xaVar5.e;
                    float f21 = xaVar.e;
                    long j20 = (long) ((f19 * f20) - (i12 * f21));
                    long j21 = (long) ((xaVar5.g * f20) - (xaVar.g * f21));
                    if (j20 < j21) {
                        j10 = j21;
                        j3 = j20;
                    } else {
                        j3 = j21;
                        j10 = j20;
                    }
                    xaVar.f = Utilities.k(xaVar.f + j16, j10, j3);
                    wa waVar3 = this.a;
                    if (waVar3 != null) {
                        waVar3.X(xaVar.g, xaVar.a);
                        this.a.i0(xaVar.h, xaVar.a);
                    }
                } else {
                    xaVar.f = j17;
                }
            } else {
                long j22 = xaVar.f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = xaVar.e;
                xaVar.f = Utilities.k(j22, (long) (baseDuration - (xaVar.h * f22)), (long) ((-xaVar.g) * f22));
            }
        }
        invalidate();
        wa waVar4 = this.a;
        if (waVar4 != null) {
            waVar4.s0(xaVar.a, xaVar.f);
        }
        boolean z10 = this.n1;
        if (z10 || (waVar = this.a) == null) {
            if (z10 || this.s1) {
                xa xaVar6 = this.w;
                if (xaVar6 == xaVar || xaVar6 == null) {
                    float f23 = xaVar.g;
                    long j23 = xaVar.e;
                    this.e = Utilities.k((long) (f23 * j23), j23, 0L);
                } else {
                    long j24 = xaVar.f + ((long) (xaVar.g * xaVar.e));
                    float f24 = xaVar6.h;
                    float f25 = xaVar6.e;
                    this.e = Utilities.k(j24, (long) (f24 * f25), (long) (xaVar6.g * f25));
                }
                wa waVar5 = this.a;
                if (waVar5 != null) {
                    waVar5.p(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        waVar.A(true);
        xa xaVar7 = this.w;
        if (xaVar7 == xaVar || xaVar7 == null) {
            float f26 = xaVar.g;
            long j25 = xaVar.e;
            k10 = Utilities.k((long) (f26 * j25), j25, 0L);
        } else {
            long j26 = xaVar.f + ((long) (xaVar.g * xaVar.e));
            float f27 = xaVar7.h;
            float f28 = xaVar7.e;
            k10 = Utilities.k(j26, (long) (f27 * f28), (long) (xaVar7.g * f28));
        }
        xa xaVar8 = this.w;
        if (xaVar8 != xaVar && xaVar8 != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        wa waVar6 = this.a;
        this.e = k10;
        waVar6.p(k10, false);
    }

    public final void j(float f10) {
        long j3;
        long j10;
        long j11;
        long j12;
        wa waVar;
        long k10;
        xa xaVar = this.h;
        if (xaVar == null) {
            long j13 = this.J;
            long k11 = Utilities.k(j13 + ((long) f10), 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k11;
            float f11 = k11 - j13;
            this.K = Utilities.i(this.K - (f11 / this.I), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f11 / this.I), 1.0f, 0.0f);
            wa waVar2 = this.a;
            if (waVar2 != null) {
                waVar2.w(this.K);
                this.a.o0(this.L);
            }
        } else if (this.H) {
            float f12 = xaVar.h;
            float f13 = xaVar.e;
            float f14 = this.L;
            float f15 = this.I;
            long j14 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = xaVar.g;
            float f17 = this.K;
            long j15 = (long) ((f16 * f13) - (f17 * f15));
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j16 = this.J;
            long j17 = (long) f10;
            long j18 = j16 + j17;
            if (j18 > j14) {
                float i7 = Utilities.i((((this.h.h * r1.e) - j16) - j17) / this.I, 1.0f, min);
                this.L = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.K = i10;
                xa xaVar2 = this.h;
                float f18 = xaVar2.h;
                float f19 = xaVar2.e;
                float f20 = this.L;
                float f21 = this.I;
                long j19 = (long) ((f18 * f19) - (f20 * f21));
                long j20 = (long) ((xaVar2.g * f19) - (i10 * f21));
                if (j19 < j20) {
                    j12 = j20;
                    j11 = j19;
                } else {
                    j11 = j20;
                    j12 = j19;
                }
                this.J = Utilities.k(this.J + j17, j12, j11);
                wa waVar3 = this.a;
                if (waVar3 != null) {
                    waVar3.w(this.K);
                    this.a.o0(this.L);
                }
            } else if (j18 < j15) {
                float i11 = Utilities.i((((this.h.g * r1.e) - j16) - j17) / this.I, 1.0f - min, 0.0f);
                this.K = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.L = i12;
                xa xaVar3 = this.h;
                float f22 = xaVar3.h;
                float f23 = xaVar3.e;
                float f24 = this.I;
                long j21 = (long) ((f22 * f23) - (i12 * f24));
                long j22 = (long) ((xaVar3.g * f23) - (this.K * f24));
                if (j21 < j22) {
                    j10 = j22;
                    j3 = j21;
                } else {
                    j3 = j22;
                    j10 = j21;
                }
                this.J = Utilities.k(this.J + j17, j10, j3);
                wa waVar4 = this.a;
                if (waVar4 != null) {
                    waVar4.w(this.K);
                    this.a.o0(this.L);
                }
            } else {
                this.J = j18;
            }
        } else {
            long j23 = this.J + ((long) f10);
            float baseDuration = getBaseDuration();
            float f25 = this.I;
            this.J = Utilities.k(j23, (long) (baseDuration - (this.L * f25)), (long) ((-this.K) * f25));
        }
        invalidate();
        wa waVar5 = this.a;
        if (waVar5 != null) {
            waVar5.O(this.J + ((long) (this.K * this.I)));
        }
        boolean z10 = this.n1;
        if (z10 || (waVar = this.a) == null) {
            if (z10 || this.s1) {
                xa xaVar4 = this.h;
                if (xaVar4 != null) {
                    long j24 = this.J + ((long) (this.K * this.I));
                    float f26 = xaVar4.h;
                    float f27 = xaVar4.e;
                    this.e = Utilities.k(j24, (long) (f26 * f27), (long) (xaVar4.g * f27));
                } else {
                    float f28 = this.K;
                    long j25 = this.I;
                    this.e = Utilities.k((long) (f28 * j25), j25, 0L);
                }
                wa waVar6 = this.a;
                if (waVar6 != null) {
                    waVar6.p(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        waVar.A(true);
        xa xaVar5 = this.h;
        if (xaVar5 != null) {
            long j26 = this.J + ((long) (this.K * this.I));
            float f29 = xaVar5.h;
            float f30 = xaVar5.e;
            k10 = Utilities.k(j26, (long) (f29 * f30), (long) (xaVar5.g * f30));
        } else {
            float f31 = this.K;
            long j27 = this.I;
            k10 = Utilities.k((long) (f31 * j27), j27, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        wa waVar7 = this.a;
        this.e = k10;
        waVar7.p(k10, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        xa xaVar = this.h;
        float f10 = (xaVar.h + xaVar.g) / 2.0f;
        long j3 = xaVar.e;
        this.f = Utilities.k((long) ((f10 * j3) - (min / 2.0f)), j3 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        if (z10 && this.F) {
            this.H = true;
            this.Q = false;
        } else {
            this.H = false;
            this.Q = this.O && this.h == null;
        }
        invalidate();
    }

    public final boolean m(boolean z10, float f10) {
        xa xaVar = this.h;
        ArrayList arrayList = this.s;
        if (xaVar == null && !this.O && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.z1) - this.y1) / this.v1;
        xa xaVar2 = this.w;
        long j3 = xaVar2 != null ? (long) ((xaVar2.g * xaVar2.e) + xaVar2.f) : 0L;
        float f12 = f11 * min;
        if (xaVar2 == null) {
            j3 = this.h == null ? this.R : 0L;
        }
        long i7 = (long) Utilities.i((f12 - j3) + this.f, getBaseDuration(), 0.0f);
        xa xaVar3 = this.h;
        if (xaVar3 != null) {
            float f13 = i7 / xaVar3.e;
            if (f13 < xaVar3.g || f13 > xaVar3.h) {
                return false;
            }
        }
        xa xaVar4 = this.w;
        if (xaVar4 != null && (i7 < 0 || i7 >= ((long) ((xaVar4.h - xaVar4.g) * xaVar4.e)))) {
            return false;
        }
        if (this.O && xaVar3 == null && arrayList.isEmpty()) {
            float f14 = i7 / this.S;
            if (f14 < this.T || f14 > this.U) {
                return false;
            }
        }
        this.e = i7;
        invalidate();
        wa waVar = this.a;
        if (waVar != null) {
            waVar.p(i7, z10);
        }
        di.x2 x2Var = this.e1;
        if (x2Var != null) {
            org.telegram.messenger.g0.r(x2Var);
            this.e1 = null;
        }
        if (!z10) {
            return true;
        }
        di.x2 x2Var2 = new di.x2(this, i7, 9);
        this.e1 = x2Var2;
        org.telegram.messenger.g0.i3(x2Var2, 150L);
        return true;
    }

    public final void n(String str, long j3, long j10, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        long j11;
        boolean z12;
        xa xaVar;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        ab abVar = this.N;
        if (abVar != null) {
            abVar.b();
            this.N = null;
        }
        long j12 = this.I;
        if (str != null) {
            this.G = str;
            this.I = j3;
            this.J = j10 - ((long) (j3 * f10));
            this.K = f10;
            this.L = f11;
            this.M = f12;
            if (getMeasuredWidth() <= 0 || this.N != null || ((xaVar = this.h) != null && xaVar.e < 1)) {
                z11 = false;
                j11 = j12;
                z12 = true;
            } else {
                String str2 = this.G;
                int i7 = this.w1;
                int i10 = this.z1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j13 = this.I;
                Long valueOf = j13 > 2 ? Long.valueOf(j13) : null;
                xa xaVar2 = this.h;
                j11 = j12;
                z11 = false;
                z12 = true;
                this.N = new ab(this, false, str2, i11, L, valueOf, xaVar2 != null ? xaVar2.e : getMaxScrollDuration(), -1L, -1L, new ta(this, 0));
            }
            if (this.h == null) {
                this.Q = z11;
                this.H = z12;
            }
        } else {
            z11 = false;
            j11 = j12;
            z12 = true;
            this.G = null;
            this.I = 1L;
            this.H = false;
        }
        this.F = this.G != null ? z12 : z11;
        if (j11 != j3 && this.h == null && this.b0 != null) {
            this.a0 = z12;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(j3 / this.S, 1.0f, 0.0f);
        }
        if (!z10) {
            this.e0.f(this.H, z12);
            this.g0.f(this.Q, z12);
            this.d0.f(this.F, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f10) {
        xa xaVar = this.h;
        if (TextUtils.equals(xaVar == null ? null : xaVar.d, str)) {
            return;
        }
        xa xaVar2 = this.h;
        if (xaVar2 != null) {
            ab abVar = xaVar2.c;
            if (abVar != null) {
                abVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            xa xaVar3 = new xa(this);
            this.h = xaVar3;
            xaVar3.b = z10;
            xaVar3.d = str;
            xaVar3.e = j3;
            xaVar3.i = f10;
            xa.a(xaVar3, false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.F) {
            this.H = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        this.M0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.Q0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.z1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i7);
        this.w1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 * 2)) - (this.z1 * 2);
        xa xaVar = this.h;
        if (xaVar != null && xaVar.d != null && xaVar.c == null) {
            xa.a(xaVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                xa xaVar2 = (xa) obj;
                if (xaVar2.d != null && xaVar2.c == null) {
                    xa.a(xaVar2, false);
                    xa.b(xaVar2);
                }
            }
        }
        if (this.P == null || this.b0 != null) {
            return;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0d8d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        di.x2 x2Var;
        boolean z11;
        VelocityTracker velocityTracker;
        wa waVar;
        VelocityTracker velocityTracker2;
        long j3;
        boolean z12;
        long j10;
        long j11;
        long j12;
        float f10;
        VelocityTracker velocityTracker3;
        long j13;
        long j14;
        VelocityTracker velocityTracker4;
        VelocityTracker velocityTracker5;
        Runnable runnable;
        VelocityTracker velocityTracker6;
        float e10;
        float z13;
        float e11;
        boolean z14;
        float z15;
        boolean z16;
        wa waVar2;
        int i7;
        float f11;
        float f12;
        boolean z17;
        float f13;
        float i10;
        wa waVar3;
        wa waVar4;
        int i11;
        float f14;
        float f15;
        xa xaVar = this.h;
        ArrayList arrayList = this.s;
        if (xaVar != null || !arrayList.isEmpty() || this.O || this.F) {
            float timelineHeight = this.x1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                bl0 bl0Var = this.X0;
                ai.b bVar = this.Z0;
                if (action == 0) {
                    di.x2 x2Var2 = this.e1;
                    if (x2Var2 != null) {
                        org.telegram.messenger.g0.r(x2Var2);
                        this.e1 = null;
                    }
                    bl0Var.a();
                    this.j1 = -1;
                    this.i1 = c(motionEvent);
                    this.k1 = -1;
                    this.l1 = -1;
                    int i12 = this.x1 - this.A1;
                    if (!this.k0) {
                        if (this.p0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.k1 = 10;
                            this.i1 = -1;
                        }
                    }
                    float f16 = 2.0f;
                    if (this.k1 != -1 || this.h == null) {
                        f14 = 4.0f;
                    } else {
                        float f17 = i12;
                        if (motionEvent.getY() < f17) {
                            f14 = 4.0f;
                            if (motionEvent.getY() > (f17 - getVideoHeight()) - org.telegram.messenger.g0.L(2.0f)) {
                                this.k1 = 0;
                            }
                        } else {
                            f14 = 4.0f;
                        }
                        i12 = (int) (f17 - (getVideoHeight() + org.telegram.messenger.g0.L(f14)));
                    }
                    if (this.k1 == -1 && !arrayList.isEmpty()) {
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            f15 = f16;
                            float W1 = org.telegram.messenger.g0.W1(((xa) arrayList.get(i13)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
                            float f18 = i12;
                            if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - W1) - org.telegram.messenger.g0.L(f15)) {
                                this.k1 = 3;
                                this.l1 = i13;
                                break;
                            }
                            i12 = (int) (f18 - (W1 + org.telegram.messenger.g0.L(f14)));
                            i13++;
                            f16 = f15;
                        }
                    }
                    f15 = f16;
                    if (this.k1 == -1 && this.F) {
                        float f19 = i12;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getRoundHeight()) - org.telegram.messenger.g0.L(f15)) {
                            this.k1 = 1;
                        }
                        i12 = (int) (f19 - (getRoundHeight() + org.telegram.messenger.g0.L(f14)));
                    }
                    if (this.k1 == -1 && this.O) {
                        float f20 = i12;
                        if (motionEvent.getY() < f20 && motionEvent.getY() > (f20 - getAudioHeight()) - org.telegram.messenger.g0.L(f15)) {
                            this.k1 = 2;
                        }
                        getAudioHeight();
                        org.telegram.messenger.g0.L(f14);
                    }
                    this.g1 = System.currentTimeMillis();
                    int i14 = this.i1;
                    this.m1 = i14 == 0 || i14 == -1 || i14 == 1;
                    this.p1 = false;
                    if (i14 == 1 || i14 == 5 || i14 == 8) {
                        this.q1 = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker7 = this.q1;
                        if (velocityTracker7 != null) {
                            velocityTracker7.recycle();
                            this.q1 = null;
                        }
                    }
                    this.o1 = 1.0f;
                    this.n1 = false;
                    this.h1 = motionEvent.getX();
                    if (!this.Y0) {
                        org.telegram.messenger.g0.r(bVar);
                        org.telegram.messenger.g0.i3(bVar, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.h1;
                    if (this.k0 && (this.n1 || Math.abs(x10) > org.telegram.messenger.g0.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        xa xaVar2 = this.h;
                        if (xaVar2 != null && this.i1 == 1) {
                            this.f = (long) Utilities.i(this.f - ((x10 / this.v1) * min), xaVar2.e - min, 0.0f);
                            invalidate();
                            if (!this.n1) {
                                this.o1 = 1.0f;
                            }
                            this.n1 = true;
                            this.m1 = false;
                        } else if (xaVar2 == null || !((i11 = this.i1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.i1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f21 = (min / this.S) * (x10 / this.v1);
                                if (i15 == 6) {
                                    float g10 = this.U - (g() / this.S);
                                    float max = Math.max(0L, this.f - this.R);
                                    float f22 = this.S;
                                    float f23 = max / f22;
                                    xa xaVar3 = this.h;
                                    if (xaVar3 != null) {
                                        z13 = org.telegram.ui.Cells.y0.v((xaVar3.g * xaVar3.e) + this.f, this.R, f22, f23);
                                    } else {
                                        xa xaVar4 = this.w;
                                        if (xaVar4 != null) {
                                            z13 = org.telegram.ui.Cells.y0.v((xaVar4.g * xaVar4.e) + this.f, this.R, f22, f23);
                                        } else if (this.F) {
                                            z13 = org.telegram.ui.Cells.y0.v((this.K * this.I) + this.f, this.R, f22, f23);
                                        } else {
                                            z13 = org.telegram.ui.Cells.y0.z(f(), this.S, this.U, f23);
                                            if (!this.p1 && f21 < 0.0f && this.T <= this.U - (f() / this.S)) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f24 = this.T;
                                    float i16 = Utilities.i(f24 + f21, g10, z13);
                                    this.T = i16;
                                    if (Math.abs(f24 - i16) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    wa waVar5 = this.a;
                                    if (waVar5 != null) {
                                        waVar5.t0(this.R + ((long) (this.T * this.S)));
                                    }
                                    wa waVar6 = this.a;
                                    if (waVar6 != null) {
                                        waVar6.f0(this.T);
                                    }
                                } else if (i15 == 7) {
                                    float min2 = Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S);
                                    float f25 = this.T;
                                    float g11 = g();
                                    float f26 = this.S;
                                    float f27 = (g11 / f26) + f25;
                                    xa xaVar5 = this.h;
                                    if (xaVar5 != null) {
                                        e10 = Math.min(min2, (((xaVar5.h * xaVar5.e) + this.f) - this.R) / f26);
                                    } else {
                                        xa xaVar6 = this.w;
                                        if (xaVar6 != null) {
                                            e10 = Math.min(min2, (((xaVar6.h * xaVar6.e) + this.f) - this.R) / f26);
                                        } else if (this.F) {
                                            e10 = Math.min(min2, (((this.L * this.I) + this.f) - this.R) / f26);
                                        } else {
                                            e10 = org.telegram.ui.Cells.y0.e(f(), this.S, this.T, min2);
                                            if (!this.p1 && f21 > 0.0f) {
                                                if (this.U >= (f() / this.S) + this.T) {
                                                    this.i1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f28 = this.U;
                                    float i17 = Utilities.i(f28 + f21, e10, f27);
                                    this.U = i17;
                                    if (Math.abs(f28 - i17) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    wa waVar7 = this.a;
                                    if (waVar7 != null) {
                                        waVar7.Y(this.U);
                                    }
                                }
                                if (this.i1 == 8) {
                                    float min3 = f21 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S) - this.U), f21) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.R) / this.S) - this.T), f21);
                                    float f29 = this.T + min3;
                                    this.T = f29;
                                    this.U += min3;
                                    wa waVar8 = this.a;
                                    if (waVar8 != null) {
                                        waVar8.f0(f29);
                                        this.a.t0(this.R + ((long) (this.T * this.S)));
                                        this.a.Y(this.U);
                                    }
                                    wa waVar9 = this.a;
                                    if (waVar9 != null) {
                                        waVar9.A(true);
                                    }
                                }
                                if (this.h == null && !this.F) {
                                    this.e = (long) (this.T * this.S);
                                    wa waVar10 = this.a;
                                    if (waVar10 != null) {
                                        waVar10.A(true);
                                        this.a.p(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.n1) {
                                    this.o1 = 1.0f;
                                }
                                this.n1 = true;
                                this.m1 = false;
                            } else if (i15 == 10 || i15 == 11 || i15 == 12) {
                                float f30 = (min / this.I) * (x10 / this.v1);
                                if (i15 == 10) {
                                    float g12 = this.L - (g() / this.I);
                                    float max2 = Math.max(0L, this.f - this.J);
                                    float f31 = this.I;
                                    float f32 = max2 / f31;
                                    xa xaVar7 = this.h;
                                    if (xaVar7 != null) {
                                        z15 = org.telegram.ui.Cells.y0.v((xaVar7.g * xaVar7.e) + this.f, this.J, f31, f32);
                                    } else {
                                        xa xaVar8 = this.w;
                                        if (xaVar8 != null) {
                                            z15 = org.telegram.ui.Cells.y0.v((xaVar8.g * xaVar8.e) + this.f, this.J, f31, f32);
                                        } else {
                                            z15 = org.telegram.ui.Cells.y0.z(f(), this.I, this.L, f32);
                                            if (!this.p1 && f30 < 0.0f && this.K <= this.L - (f() / this.I)) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f33 = this.K;
                                    float i18 = Utilities.i(f33 + f30, g12, z15);
                                    this.K = i18;
                                    if (Math.abs(f33 - i18) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    wa waVar11 = this.a;
                                    if (waVar11 != null) {
                                        waVar11.O(this.J + ((long) (this.K * this.I)));
                                    }
                                    wa waVar12 = this.a;
                                    if (waVar12 != null) {
                                        waVar12.w(this.K);
                                    }
                                } else if (i15 == 11) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I);
                                    float f34 = this.K;
                                    float g13 = g();
                                    float f35 = this.I;
                                    float f36 = (g13 / f35) + f34;
                                    xa xaVar9 = this.h;
                                    if (xaVar9 != null) {
                                        min4 = Math.min(min4, (((xaVar9.h * xaVar9.e) + this.f) - this.J) / f35);
                                    }
                                    xa xaVar10 = this.w;
                                    if (xaVar10 != null) {
                                        e11 = Math.min(min4, (((xaVar10.h * xaVar10.e) + this.f) - this.J) / this.I);
                                    } else {
                                        e11 = org.telegram.ui.Cells.y0.e(f(), this.I, this.K, min4);
                                        if (!this.p1 && f30 > 0.0f) {
                                            if (this.L >= (f() / this.I) + this.K) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f37 = this.L;
                                    float i19 = Utilities.i(f37 + f30, e11, f36);
                                    this.L = i19;
                                    if (Math.abs(f37 - i19) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    wa waVar13 = this.a;
                                    if (waVar13 != null) {
                                        waVar13.o0(this.L);
                                    }
                                }
                                if (this.i1 == 12) {
                                    float min5 = f30 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I) - this.L, f30) : Math.max((Math.max(0L, this.f - this.J) / this.I) - this.K, f30);
                                    float f38 = this.K + min5;
                                    this.K = f38;
                                    this.L += min5;
                                    wa waVar14 = this.a;
                                    if (waVar14 != null) {
                                        waVar14.w(f38);
                                        this.a.O(this.J + ((long) (this.K * this.I)));
                                        this.a.o0(this.L);
                                    }
                                    wa waVar15 = this.a;
                                    if (waVar15 != null) {
                                        waVar15.A(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.K * this.I);
                                    wa waVar16 = this.a;
                                    if (waVar16 != null) {
                                        waVar16.A(true);
                                        z14 = false;
                                        this.a.p(this.e, false);
                                        invalidate();
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = true;
                                        this.m1 = z14;
                                    }
                                }
                                z14 = false;
                                invalidate();
                                if (!this.n1) {
                                }
                                this.n1 = true;
                                this.m1 = z14;
                            } else {
                                int i20 = this.j1;
                                if (i20 < 0 || i20 >= arrayList.size() || !((i7 = this.i1) == 13 || i7 == 14 || i7 == 15)) {
                                    int i21 = this.i1;
                                    if (i21 == 5) {
                                        h((x10 / this.v1) * min);
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = true;
                                        this.m1 = false;
                                    } else if (i21 == 9) {
                                        j((x10 / this.v1) * min);
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = true;
                                        this.m1 = false;
                                    } else {
                                        int i22 = this.j1;
                                        if (i22 >= 0 && i22 < arrayList.size() && this.i1 == 16) {
                                            i((xa) arrayList.get(this.j1), (x10 / this.v1) * min);
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = true;
                                            this.m1 = false;
                                        } else if (this.m1) {
                                            m(currentTimeMillis - this.f1 < 350, motionEvent.getX());
                                            if (this.n1 || (waVar2 = this.a) == null) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                                waVar2.A(true);
                                            }
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = z16;
                                        }
                                    }
                                } else {
                                    xa xaVar11 = (xa) arrayList.get(this.j1);
                                    float f39 = (min / xaVar11.e) * (x10 / this.v1);
                                    int i23 = this.i1;
                                    if (i23 == 13) {
                                        float g14 = xaVar11.h - (g() / xaVar11.e);
                                        float max3 = Math.max(0L, this.f - xaVar11.f) / xaVar11.e;
                                        if (xaVar11 == this.w) {
                                            f11 = f39;
                                            max3 = org.telegram.ui.Cells.y0.z(f(), xaVar11.e, xaVar11.h, max3);
                                            if (!this.p1 && f11 < 0.0f) {
                                                f12 = 0.0f;
                                                if (xaVar11.g <= xaVar11.h - (f() / xaVar11.e)) {
                                                    this.i1 = 15;
                                                }
                                                f13 = xaVar11.g;
                                                i10 = Utilities.i(f13 + f11, g14, max3);
                                                xaVar11.g = i10;
                                                if (Math.abs(f13 - i10) > 0.01f) {
                                                    this.p1 = true;
                                                }
                                                waVar3 = this.a;
                                                if (waVar3 != null) {
                                                    waVar3.s0(xaVar11.a, xaVar11.f);
                                                }
                                                waVar4 = this.a;
                                                if (waVar4 != null) {
                                                    waVar4.X(xaVar11.g, xaVar11.a);
                                                }
                                            }
                                        } else {
                                            f11 = f39;
                                        }
                                        f12 = 0.0f;
                                        f13 = xaVar11.g;
                                        i10 = Utilities.i(f13 + f11, g14, max3);
                                        xaVar11.g = i10;
                                        if (Math.abs(f13 - i10) > 0.01f) {
                                        }
                                        waVar3 = this.a;
                                        if (waVar3 != null) {
                                        }
                                        waVar4 = this.a;
                                        if (waVar4 != null) {
                                        }
                                    } else {
                                        f11 = f39;
                                        f12 = 0.0f;
                                        if (i23 == 14) {
                                            float min6 = Math.min(1.0f, Math.max(0L, (this.f - xaVar11.f) + min) / xaVar11.e);
                                            float g15 = (g() / xaVar11.e) + xaVar11.g;
                                            if (xaVar11 == this.w) {
                                                min6 = org.telegram.ui.Cells.y0.e(f(), xaVar11.e, xaVar11.g, min6);
                                                if (!this.p1 && f11 > 0.0f) {
                                                    if (xaVar11.h >= (f() / xaVar11.e) + xaVar11.g) {
                                                        this.i1 = 15;
                                                    }
                                                }
                                            }
                                            float f40 = xaVar11.h;
                                            float i24 = Utilities.i(f40 + f11, min6, g15);
                                            xaVar11.h = i24;
                                            if (Math.abs(f40 - i24) > 0.01f) {
                                                this.p1 = true;
                                            }
                                            wa waVar17 = this.a;
                                            if (waVar17 != null) {
                                                waVar17.i0(xaVar11.h, xaVar11.a);
                                            }
                                        }
                                    }
                                    if (this.i1 == 15) {
                                        float min7 = f11 > f12 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - xaVar11.f) + min) / xaVar11.e) - xaVar11.h, f11) : Math.max((Math.max(0L, this.f - xaVar11.f) / xaVar11.e) - xaVar11.g, f11);
                                        float f41 = xaVar11.g + min7;
                                        xaVar11.g = f41;
                                        xaVar11.h += min7;
                                        wa waVar18 = this.a;
                                        if (waVar18 != null) {
                                            waVar18.X(f41, xaVar11.a);
                                            this.a.s0(xaVar11.a, xaVar11.f);
                                            this.a.i0(xaVar11.h, xaVar11.a);
                                        }
                                        wa waVar19 = this.a;
                                        if (waVar19 != null) {
                                            z17 = true;
                                            waVar19.A(true);
                                            invalidate();
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = z17;
                                            this.m1 = false;
                                        }
                                    }
                                    z17 = true;
                                    invalidate();
                                    if (!this.n1) {
                                    }
                                    this.n1 = z17;
                                    this.m1 = false;
                                }
                            }
                        } else {
                            float f42 = xaVar2.e;
                            float f43 = (min / f42) * (x10 / this.v1);
                            if (i11 == 2) {
                                xaVar2.g = Utilities.i(xaVar2.g + f43, xaVar2.h - (1000.0f / f42), 0.0f);
                                wa waVar20 = this.a;
                                if (waVar20 != null) {
                                    waVar20.v(false, this.h.g);
                                }
                                xa xaVar12 = this.h;
                                float f44 = xaVar12.h - xaVar12.g;
                                float f45 = f();
                                xa xaVar13 = this.h;
                                if (f44 > f45 / xaVar13.e) {
                                    xaVar13.h = org.telegram.ui.Cells.y0.e(f(), this.h.e, xaVar13.g, 1.0f);
                                    wa waVar21 = this.a;
                                    if (waVar21 != null) {
                                        waVar21.j0(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                xaVar2.h = Utilities.i(xaVar2.h + f43, 1.0f, (1000.0f / f42) + xaVar2.g);
                                wa waVar22 = this.a;
                                if (waVar22 != null) {
                                    waVar22.j0(this.h.h);
                                }
                                xa xaVar14 = this.h;
                                float f46 = xaVar14.h - xaVar14.g;
                                float f47 = f();
                                xa xaVar15 = this.h;
                                if (f46 > f47 / xaVar15.e) {
                                    xaVar15.g = org.telegram.ui.Cells.y0.z(f(), this.h.e, xaVar15.h, 0.0f);
                                    wa waVar23 = this.a;
                                    if (waVar23 != null) {
                                        waVar23.v(false, this.h.g);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min8 = f43 > 0.0f ? Math.min(1.0f - xaVar2.h, f43) : Math.max(-xaVar2.g, f43);
                                xa xaVar16 = this.h;
                                float f48 = xaVar16.g + min8;
                                xaVar16.g = f48;
                                xaVar16.h += min8;
                                wa waVar24 = this.a;
                                if (waVar24 != null) {
                                    waVar24.v(false, f48);
                                    this.a.j0(this.h.h);
                                }
                            }
                            float f49 = this.e;
                            xa xaVar17 = this.h;
                            float f50 = xaVar17.e;
                            float f51 = f49 / f50;
                            float f52 = xaVar17.g;
                            if (f51 < f52 || f51 > xaVar17.h) {
                                long j15 = (long) (f52 * f50);
                                this.e = j15;
                                wa waVar25 = this.a;
                                if (waVar25 != null) {
                                    waVar25.p(j15, false);
                                }
                            }
                            invalidate();
                            if (!this.n1) {
                                this.o1 = 1.0f;
                            }
                            this.n1 = true;
                            this.m1 = false;
                        }
                        this.h1 = motionEvent.getX();
                    }
                    if (this.n1) {
                        org.telegram.messenger.g0.r(bVar);
                    }
                    int i25 = this.i1;
                    if ((i25 == 1 || i25 == 5 || i25 == 8) && (velocityTracker6 = this.q1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(bVar);
                    bl0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.g1 > ViewConfiguration.getTapTimeout() || this.n1) && this.k0) {
                            int i26 = this.i1;
                            if (i26 == 16 && (velocityTracker5 = this.q1) != null) {
                                velocityTracker5.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity) > org.telegram.messenger.g0.L(100.0f)) {
                                    long min9 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i27 = this.z1;
                                    float f53 = i27;
                                    float f54 = min9;
                                    float f55 = this.v1;
                                    int i28 = (int) (((this.f / f54) * f55) + f53);
                                    int c10 = (int) com.google.android.gms.internal.vision.e2.c(this.h.e - min9, f54, f55, f53);
                                    this.s1 = true;
                                    this.t1 = i28;
                                    this.X0.c(i28, 0, -xVelocity, 0, i27, c10, 0, 0);
                                    z10 = false;
                                }
                            } else if (i26 == 1 && (velocityTracker4 = this.q1) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.q1.getXVelocity();
                                this.r1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > org.telegram.messenger.g0.L(100.0f)) {
                                    long min10 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i29 = this.z1;
                                    float f56 = i29;
                                    float f57 = min10;
                                    float f58 = this.v1;
                                    int i30 = (int) (((this.f / f57) * f58) + f56);
                                    int c11 = (int) com.google.android.gms.internal.vision.e2.c(this.h.e - min10, f57, f58, f56);
                                    this.s1 = true;
                                    this.t1 = i30;
                                    this.X0.c(i30, 0, -xVelocity2, 0, i29, c11, 0, 0);
                                    z10 = false;
                                }
                            } else if ((i26 == 5 || (i26 == 8 && !this.n1)) && this.Q && (velocityTracker2 = this.q1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity3) > org.telegram.messenger.g0.L(100.0f)) {
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i31 = (int) (((this.R / min11) * this.v1) + this.z1 + this.y1);
                                    xa xaVar18 = this.h;
                                    if (xaVar18 != null) {
                                        float f59 = xaVar18.h;
                                        float f60 = xaVar18.e;
                                        j11 = this.S;
                                        j12 = (long) ((f59 * f60) - 0);
                                        f10 = xaVar18.g * f60;
                                    } else if (this.F) {
                                        float f61 = this.L;
                                        float f62 = this.I;
                                        j11 = this.S;
                                        j12 = (long) ((f61 * f62) - 0);
                                        f10 = this.K * f62;
                                    } else {
                                        j3 = -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j10 = 0;
                                        this.s1 = z12;
                                        this.t1 = i31;
                                        float f63 = this.z1 + this.y1;
                                        float f64 = this.v1;
                                        this.X0.c(i31, 0, xVelocity3, 0, (int) (((j3 / min11) * f64) + f63), (int) com.google.android.gms.internal.vision.e2.c(j10, min11, f64, f63), 0, 0);
                                        z10 = false;
                                    }
                                    j3 = (long) (f10 - j11);
                                    j10 = j12;
                                    z12 = true;
                                    this.s1 = z12;
                                    this.t1 = i31;
                                    float f632 = this.z1 + this.y1;
                                    float f642 = this.v1;
                                    this.X0.c(i31, 0, xVelocity3, 0, (int) (((j3 / min11) * f642) + f632), (int) com.google.android.gms.internal.vision.e2.c(j10, min11, f642, f632), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i26 == 9 || (i26 == 12 && !this.n1)) && this.H && (velocityTracker3 = this.q1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity4) > org.telegram.messenger.g0.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i32 = (int) (((this.J / min12) * this.v1) + this.z1 + this.y1);
                                    xa xaVar19 = this.h;
                                    if (xaVar19 != null) {
                                        float f65 = xaVar19.h;
                                        float f66 = xaVar19.e;
                                        j13 = (long) ((xaVar19.g * f66) - this.I);
                                        j14 = (long) ((f65 * f66) - 0);
                                    } else {
                                        j13 = -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j14 = 0;
                                    }
                                    this.s1 = true;
                                    this.t1 = i32;
                                    float f67 = this.z1 + this.y1;
                                    float f68 = this.v1;
                                    this.X0.c(i32, 0, xVelocity4, 0, (int) (((j13 / min12) * f68) + f67), (int) com.google.android.gms.internal.vision.e2.c(j14, min12, f68, f67), 0, 0);
                                    z10 = false;
                                }
                            }
                            x2Var = this.e1;
                            if (x2Var != null) {
                                org.telegram.messenger.g0.r(x2Var);
                                this.e1 = null;
                            }
                            if (this.n1 || !z10 || (waVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                waVar.A(false);
                            }
                            this.o1 = 1.0f;
                            this.n1 = z11;
                            this.m1 = z11;
                            this.g1 = -1L;
                            this.i1 = -1;
                            velocityTracker = this.q1;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.q1 = null;
                            }
                        } else if (this.k0) {
                            if (!this.Y0 || this.h == null) {
                                int i33 = this.k1;
                                if (i33 == 3) {
                                    int i34 = (this.Q || this.H) ? -1 : this.n;
                                    int i35 = this.l1;
                                    if (i34 != i35) {
                                        this.Q = false;
                                        this.H = false;
                                        this.n = i35;
                                        if (this.a != null && i35 >= 0 && i35 < arrayList.size()) {
                                            this.a.e(((xa) arrayList.get(this.l1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i33 == 2 && !this.Q) {
                                    this.Q = true;
                                    this.H = false;
                                    wa waVar26 = this.a;
                                    if (waVar26 != null) {
                                        waVar26.S(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 && !this.H) {
                                    this.Q = false;
                                    this.H = true;
                                    wa waVar27 = this.a;
                                    if (waVar27 != null) {
                                        waVar27.S(true);
                                    }
                                    invalidate();
                                } else if (i33 != 2 && this.Q) {
                                    this.Q = false;
                                    this.H = false;
                                    wa waVar28 = this.a;
                                    if (waVar28 != null) {
                                        waVar28.S(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 || !this.H) {
                                    long j16 = this.e;
                                    if (m(false, motionEvent.getX()) && Math.abs(this.e - j16) > 400) {
                                        this.d1 = j16;
                                        this.c1.e(true, 1.0f);
                                        invalidate();
                                    }
                                } else {
                                    this.Q = false;
                                    this.H = false;
                                    wa waVar29 = this.a;
                                    if (waVar29 != null) {
                                        waVar29.S(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i36 = (long) Utilities.i(((((motionEvent.getX() - this.z1) - this.y1) / this.v1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                xa xaVar20 = this.h;
                                float f69 = xaVar20.h - xaVar20.g;
                                xaVar20.g = (1.0f - f69) * (i36 / getBaseDuration());
                                xa xaVar21 = this.h;
                                float f70 = xaVar21.g;
                                xaVar21.h = f69 + f70;
                                wa waVar30 = this.a;
                                if (waVar30 != null) {
                                    waVar30.v(true, f70);
                                    this.a.j0(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.k1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    x2Var = this.e1;
                    if (x2Var != null) {
                    }
                    if (this.n1) {
                    }
                    z11 = false;
                    this.o1 = 1.0f;
                    this.n1 = z11;
                    this.m1 = z11;
                    this.g1 = -1L;
                    this.i1 = -1;
                    velocityTracker = this.q1;
                    if (velocityTracker != null) {
                    }
                }
                this.f1 = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.b0 == null || this.a0) {
                this.b0 = new va(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        a3.c cVar = new a3.c(29);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, cVar);
        xa xaVar = arrayList.isEmpty() ? null : (xa) arrayList.get(0);
        this.w = xaVar;
        if (xaVar != null) {
            long j3 = xaVar.f;
        }
    }

    public void setCollage(ArrayList<d7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ab abVar;
        int i7 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            xa xaVar = (xa) arrayList2.get(i7);
            if (xaVar != null && (abVar = xaVar.c) != null) {
                abVar.b();
            }
            i7++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            va vaVar = (va) arrayList3.get(i10);
            if (vaVar != null) {
                vaVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                d7 d7Var = arrayList.get(i11);
                if (d7Var.K) {
                    xa xaVar2 = new xa(this);
                    xaVar2.a = i11;
                    xaVar2.b = false;
                    xaVar2.d = d7Var.L.getAbsolutePath();
                    xaVar2.e = d7Var.h0;
                    xaVar2.f = d7Var.X;
                    xaVar2.i = d7Var.P;
                    xaVar2.g = d7Var.V;
                    xaVar2.h = d7Var.W;
                    xa.a(xaVar2, false);
                    xa.b(xaVar2);
                    arrayList2.add(xaVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(wa waVar) {
        this.a = waVar;
    }

    public void setMaxCount(int i7) {
        this.c0 = i7;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if ((r4 + 240) >= (r7 * r11.U)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if ((r4 + 240) >= (r6 * r11.U)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 + 240) >= (r7 * r0.h)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        r11.d1 = -1;
        r11.c1.e(true, 1.0f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j3) {
        xa xaVar = this.h;
        if (xaVar != null) {
            if (j3 < this.e) {
                float f10 = j3;
                long j10 = xaVar.e;
                if (f10 <= (j10 * xaVar.g) + 240.0f) {
                }
            }
        }
        if (this.O && !this.F && xaVar == null) {
            if (j3 < this.e) {
                float f11 = j3;
                long j11 = this.S;
                if (f11 <= (j11 * this.T) + 240.0f) {
                }
            }
        }
        if (this.F && xaVar == null) {
            if (j3 < this.e) {
                float f12 = j3;
                long j12 = this.I;
                if (f12 <= (j12 * this.T) + 240.0f) {
                }
            }
        }
        this.e = j3;
        invalidate();
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        xa xaVar = this.h;
        if (xaVar == null) {
            return;
        }
        xaVar.g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        xa xaVar = this.h;
        if (xaVar == null) {
            return;
        }
        xaVar.h = f10;
        invalidate();
    }
}
