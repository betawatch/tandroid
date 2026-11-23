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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class xb extends View {
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
    public final wb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public vb N;
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
    public final ll0 X0;
    public boolean Y0;
    public final bi.s1 Z0;
    public rb a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public qb b0;
    public long b1;
    public int c;
    public int c0;
    public final org.telegram.ui.Components.c6 c1;
    public Runnable d;
    public final org.telegram.ui.Components.c6 d0;
    public long d1;
    public long e;
    public final org.telegram.ui.Components.c6 e0;
    public bi.e4 e1;
    public long f;
    public final org.telegram.ui.Components.c6 f0;
    public long f1;
    public final org.telegram.ui.Components.c6 g0;
    public long g1;
    public sb h;
    public final org.telegram.ui.Components.c6 h0;
    public float h1;
    public final org.telegram.ui.Components.c6 i0;
    public int i1;
    public final org.telegram.ui.Components.c6 j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final org.telegram.ui.Components.ba l0;
    public int l1;
    public final org.telegram.ui.Components.fa m0;
    public boolean m1;
    public int n;
    public final org.telegram.ui.Components.fa n0;
    public boolean n1;
    public final org.telegram.ui.Components.fa o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final wy0 r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final wb t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public sb w;
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

    public xb(Context context, ViewGroup viewGroup, za zaVar, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        kr krVar = kr.h;
        this.d0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.e0 = new org.telegram.ui.Components.c6(this, 360L, krVar);
        this.f0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.g0 = new org.telegram.ui.Components.c6(this, 360L, krVar);
        this.h0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.i0 = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        this.j0 = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new wb();
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
        this.J0 = new wb();
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
        this.X0 = new ll0(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new org.telegram.ui.Components.c6(0.0f, this, 0L, 340L, krVar);
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
        this.r0 = new wy0(gd.N0(2131744212, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = baVar;
        this.m0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.n0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.o0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.Z0 = new bi.s1(this, viewGroup, i6Var, baVar, zaVar, 15);
    }

    public static void a(final xb xbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i7;
        ArrayList arrayList = xbVar.s;
        int i10 = xbVar.k1;
        final int i11 = 0;
        final int i12 = 1;
        final int i13 = 2;
        try {
            if (i10 == 2 && xbVar.O) {
                g7 g7Var = new g7(xbVar.getContext(), 0);
                g7Var.b = 0.0f;
                g7Var.c = 1.5f;
                g7Var.d(xbVar.W);
                g7Var.h = new w10(xbVar) { // from class: hi.pb
                    public final /* synthetic */ xb b;

                    {
                        this.b = xbVar;
                    }

                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i11) {
                            case 0:
                                float floatValue = f10.floatValue();
                                xb xbVar2 = this.b;
                                xbVar2.W = floatValue;
                                rb rbVar = xbVar2.a;
                                if (rbVar != null) {
                                    rbVar.n(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                xb xbVar3 = this.b;
                                xbVar3.M = floatValue2;
                                rb rbVar2 = xbVar3.a;
                                if (rbVar2 != null) {
                                    rbVar2.k(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                xb xbVar4 = this.b;
                                xbVar4.h.i = f10.floatValue();
                                rb rbVar3 = xbVar4.a;
                                if (rbVar3 != null) {
                                    rbVar3.L(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(xbVar.getBaseDuration(), xbVar.getMaxScrollDuration());
                int i14 = xbVar.w1;
                int i15 = xbVar.z1;
                int i16 = xbVar.y1;
                float min2 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.g0.T1(xbVar.U, 1.0f, xbVar.g0.c) * xbVar.S) + (xbVar.R - xbVar.f)) / min) * xbVar.v1) + i15 + i16);
                x60 G = x60.G(viewGroup, i6Var, xbVar);
                G.q(g7Var);
                G.o(true);
                G.c(R.drawable.msg_delete, gd.N0(2131744479, null), new ob(xbVar, 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(xbVar.w1 - min2)) + org.telegram.messenger.g0.L(18.0f), xbVar.G0.top);
                G.a0();
                G.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && xbVar.F) {
                g7 g7Var2 = new g7(xbVar.getContext(), 0);
                g7Var2.b = 0.0f;
                g7Var2.c = 1.5f;
                g7Var2.d(xbVar.M);
                g7Var2.h = new w10(xbVar) { // from class: hi.pb
                    public final /* synthetic */ xb b;

                    {
                        this.b = xbVar;
                    }

                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f10.floatValue();
                                xb xbVar2 = this.b;
                                xbVar2.W = floatValue;
                                rb rbVar = xbVar2.a;
                                if (rbVar != null) {
                                    rbVar.n(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                xb xbVar3 = this.b;
                                xbVar3.M = floatValue2;
                                rb rbVar2 = xbVar3.a;
                                if (rbVar2 != null) {
                                    rbVar2.k(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                xb xbVar4 = this.b;
                                xbVar4.h.i = f10.floatValue();
                                rb rbVar3 = xbVar4.a;
                                if (rbVar3 != null) {
                                    rbVar3.L(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(xbVar.getBaseDuration(), xbVar.getMaxScrollDuration());
                int i17 = xbVar.w1;
                int i18 = xbVar.z1;
                int i19 = xbVar.y1;
                float min4 = Math.min((i17 - i18) - i19, ((((org.telegram.messenger.g0.T1(xbVar.L, 1.0f, xbVar.e0.c) * xbVar.I) + (xbVar.J - xbVar.f)) / min3) * xbVar.v1) + i18 + i19);
                x60 G2 = x60.G(viewGroup, i6Var, xbVar);
                G2.q(g7Var2);
                G2.o(true);
                G2.c(R.drawable.msg_delete, gd.N0(2131744243, null), new ob(xbVar, 2), false);
                G2.W(5);
                G2.X = true;
                G2.b0((-(xbVar.w1 - min4)) + org.telegram.messenger.g0.L(18.0f), xbVar.y0.top);
                G2.a0();
                G2.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && xbVar.h != null) {
                g7 g7Var3 = new g7(xbVar.getContext(), 0);
                g7Var3.b = 0.0f;
                g7Var3.c = 1.5f;
                g7Var3.d(xbVar.h.i);
                g7Var3.h = new w10(xbVar) { // from class: hi.pb
                    public final /* synthetic */ xb b;

                    {
                        this.b = xbVar;
                    }

                    @Override // org.telegram.messenger.w10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i13) {
                            case 0:
                                float floatValue = f10.floatValue();
                                xb xbVar2 = this.b;
                                xbVar2.W = floatValue;
                                rb rbVar = xbVar2.a;
                                if (rbVar != null) {
                                    rbVar.n(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                xb xbVar3 = this.b;
                                xbVar3.M = floatValue2;
                                rb rbVar2 = xbVar3.a;
                                if (rbVar2 != null) {
                                    rbVar2.k(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                xb xbVar4 = this.b;
                                xbVar4.h.i = f10.floatValue();
                                rb rbVar3 = xbVar4.a;
                                if (rbVar3 != null) {
                                    rbVar3.L(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                x60 G3 = x60.G(viewGroup, i6Var, xbVar);
                G3.q(g7Var3);
                G3.W(5);
                G3.X = true;
                G3.b0(org.telegram.messenger.g0.L(18.0f), xbVar.u0.top);
                G3.a0();
                G3.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            } else {
                if (i10 != 3 || (i7 = xbVar.l1) < 0 || i7 >= arrayList.size()) {
                    return;
                }
                sb sbVar = (sb) arrayList.get(xbVar.l1);
                g7 g7Var4 = new g7(xbVar.getContext(), 0);
                g7Var4.b = 0.0f;
                g7Var4.c = 1.5f;
                g7Var4.d(sbVar.i);
                g7Var4.h = new ai.s1(23, xbVar, sbVar);
                x60 G4 = x60.G(viewGroup, i6Var, xbVar);
                G4.q(g7Var4);
                G4.W(5);
                G4.X = true;
                G4.b0(org.telegram.messenger.g0.L(18.0f), sbVar.j.top);
                G4.a0();
                G4.S(baVar, -view.getX(), -view.getY());
                xbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.g0.d(this.Q), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        sb sbVar = this.h;
        if (sbVar != null) {
            return Math.max(1L, sbVar.e);
        }
        sb sbVar2 = this.w;
        return sbVar2 != null ? Math.max(1L, sbVar2.e) : this.F ? Math.max(1L, this.I) : Math.max(1L, this.S);
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
            f10 += org.telegram.messenger.g0.W1(((sb) arrayList.get(i7)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
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
        sb sbVar;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(this.e, getBaseDuration(), 0L);
        sb sbVar2 = this.w;
        float f10 = min;
        float f11 = (this.v1 * (((k10 + (sbVar2 != null ? (sbVar2.g * sbVar2.e) + sbVar2.f : this.h == null ? this.R : 0L)) - this.f) / f10)) + this.z1 + this.y1;
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
                            sb sbVar3 = this.h;
                            float f13 = sbVar3.g;
                            float f14 = sbVar3.e;
                            float f15 = this.f;
                            float f16 = this.v1;
                            float f17 = ((((f13 * f14) - f15) / f10) * f16) + f12;
                            float f18 = ((((sbVar3.h * f14) - f15) / f10) * f16) + f12;
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
                                sb sbVar4 = this.h;
                                if (sbVar4.g > 0.01f || sbVar4.h < 0.99f) {
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
                            sb sbVar5 = (sb) arrayList.get(i10);
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(sbVar5.j);
                            rectF.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
                            if (rectF.contains(x10, y10)) {
                                float f41 = this.z1 + this.y1;
                                float f42 = sbVar5.f;
                                float f43 = this.v1;
                                float f44 = ((f42 / f10) * f43) + f41;
                                float f45 = sbVar5.g;
                                float f46 = sbVar5.e;
                                float f47 = ((((f45 * f46) + f42) / f10) * f43) + f41;
                                float f48 = ((((sbVar5.h * f46) + f42) / f10) * f43) + f41;
                                float c10 = com.google.android.gms.internal.vision.e2.c(r6 + r11, f10, f43, f41);
                                this.j1 = i10;
                                if (x10 >= f47 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f47) {
                                    return 13;
                                }
                                if (x10 >= f48 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f48) {
                                    return 14;
                                }
                                if (x10 < f47 || x10 > f48 || (sbVar5.g <= 0.01f && sbVar5.h >= 0.99f)) {
                                    return (x10 < f44 || x10 > c10) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i7 = 1;
                    }
                    sbVar = this.h;
                    if (sbVar != null || sbVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        sbVar = this.h;
        return sbVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        ll0 ll0Var = this.X0;
        if (!ll0Var.b()) {
            if (this.s1) {
                this.s1 = false;
                rb rbVar = this.a;
                if (rbVar != null) {
                    rbVar.D(false);
                    return;
                }
                return;
            }
            return;
        }
        int i7 = ll0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.r1) {
            this.f = (long) Math.max(0.0f, (((i7 - this.z1) - this.y1) / this.v1) * min);
        } else {
            if (!this.Q) {
                ll0Var.a();
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
        sb sbVar = this.w;
        if (sbVar != null) {
            f13 = (sbVar.g * sbVar.e) + sbVar.f;
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
        org.telegram.ui.Components.fa faVar;
        RectF rectF2;
        int i7;
        long j10;
        float f11;
        int i10;
        sb sbVar;
        sb sbVar2;
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
        org.telegram.ui.Components.fa faVar2;
        float c11;
        float f52;
        float f53;
        Paint paint6;
        org.telegram.ui.Components.fa faVar3;
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
        org.telegram.ui.Components.fa faVar4;
        char c12;
        boolean z16;
        xb xbVar = this;
        RectF rectF5 = xbVar.u0;
        RectF rectF6 = xbVar.y0;
        Path path2 = xbVar.x0;
        ArrayList arrayList18 = xbVar.r;
        Drawable drawable = xbVar.s0;
        org.telegram.ui.Components.ba baVar = xbVar.l0;
        RectF rectF7 = xbVar.G0;
        ArrayList arrayList19 = xbVar.s;
        RectF rectF8 = xbVar.p0;
        org.telegram.ui.Components.fa faVar5 = xbVar.m0;
        Paint c13 = faVar5.c(1.0f);
        float d2 = xbVar.j0.d(xbVar.k0);
        long min = Math.min(xbVar.getBaseDuration(), xbVar.getMaxScrollDuration());
        if (d2 < 1.0f) {
            rectF8.set(xbVar.z1, (xbVar.x1 - xbVar.A1) - org.telegram.messenger.g0.L(28.0f), xbVar.w1 - xbVar.z1, xbVar.x1 - xbVar.A1);
            xbVar.q0.rewind();
            xbVar.q0.addRoundRect(rectF8, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF8, (int) ((1.0f - d2) * 255.0f), 31);
            canvas.clipPath(xbVar.q0);
            if (baVar.c()) {
                faVar5.a(canvas);
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
            if (arrayList18.isEmpty() || !baVar.c()) {
                paint8 = paint7;
                rectF = rectF5;
                faVar4 = faVar5;
                j3 = min;
                c12 = 31;
                if (!arrayList18.isEmpty()) {
                    Paint c14 = xbVar.o0.c(0.4f);
                    if (c14 == null) {
                        c14 = xbVar.I0;
                        c14.setAlpha(64);
                    }
                    z16 = false;
                    xbVar.t0.a((((xbVar.R - xbVar.f) / j3) * xbVar.v1) + xbVar.z1 + xbVar.y1, rectF8.left, rectF8.right, org.telegram.messenger.g0.L(28.0f), xbVar.i0.e(false, wb.c(arrayList18)), rectF8.bottom, arrayList18);
                    canvas.drawPath(xbVar.t0, c14);
                    float g10 = ((xbVar.r0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF8.centerX() - g10);
                    int centerY = (int) rectF8.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.Cells.c0.A(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.c0.j(2, centerY, drawable));
                    drawable.setAlpha(ks.V2);
                    drawable.draw(canvas);
                    wy0 wy0Var = xbVar.r0;
                    float centerX2 = (rectF8.centerX() - g10) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
                    float f67 = centerY;
                    paint = paint8;
                    rectF2 = rectF7;
                    arrayList = arrayList19;
                    faVar = faVar4;
                    f10 = 0.4f;
                    wy0Var.c(centerX2, f67, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float e10 = xbVar.i0.e(false, wb.c(arrayList18));
                rectF8 = rectF8;
                paint8 = paint7;
                rectF = rectF5;
                j3 = min;
                faVar4 = faVar5;
                xbVar.t0.a((((xbVar.R - xbVar.f) / min) * xbVar.v1) + xbVar.z1 + xbVar.y1, rectF8.left, rectF8.right, org.telegram.messenger.g0.L(28.0f), e10, rectF8.bottom, arrayList18);
                c12 = 31;
                canvas.saveLayerAlpha(rectF8, ks.n1, 31);
                canvas.clipPath(xbVar.t0);
                xbVar.o0.a(canvas);
                canvas.restore();
            }
            z16 = false;
            float g102 = ((xbVar.r0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF8.centerX() - g102);
            int centerY2 = (int) rectF8.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.Cells.c0.A(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.c0.j(2, centerY2, drawable));
            drawable.setAlpha(ks.V2);
            drawable.draw(canvas);
            wy0 wy0Var2 = xbVar.r0;
            float centerX22 = (rectF8.centerX() - g102) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
            float f672 = centerY2;
            paint = paint8;
            rectF2 = rectF7;
            arrayList = arrayList19;
            faVar = faVar4;
            f10 = 0.4f;
            wy0Var2.c(centerX22, f672, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF5;
            j3 = min;
            paint = c13;
            arrayList = arrayList19;
            f10 = 0.4f;
            faVar = faVar5;
            rectF2 = rectF7;
        }
        if (d2 > 0.0f) {
            if (d2 < 1.0f) {
                f12 = 0.0f;
                j11 = j3;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, xbVar.getWidth(), xbVar.getHeight(), (int) (d2 * 255.0f), 31);
                z10 = true;
            } else {
                j11 = j3;
                f12 = 0.0f;
                canvas2 = canvas;
                z10 = false;
            }
            sb sbVar3 = xbVar.h;
            float f68 = sbVar3 != null ? 1.0f : f12;
            float d10 = sbVar3 != null ? sbVar3.k.d((xbVar.Q || xbVar.H) ? false : true) : f12;
            float f69 = xbVar.x1 - xbVar.A1;
            float L = org.telegram.messenger.g0.L(4.0f);
            if (xbVar.h != null) {
                canvas2.save();
                float videoHeight = xbVar.getVideoHeight();
                sb sbVar4 = xbVar.h;
                float f70 = sbVar4.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j14 = sbVar4.e;
                float f71 = j14;
                float x10 = com.google.android.gms.internal.vision.e2.x(f70, f71, d10, f12);
                float x11 = com.google.android.gms.internal.vision.e2.x(sbVar4.h, f71, d10, f12);
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
                    f62 = (xbVar.z1 + xbVar.y1) - (xbVar.v1 * (xbVar.f / j12));
                }
                f21 = x10;
                float f72 = xbVar.y1;
                float f73 = f62 - f72;
                if (j14 <= 0) {
                    f63 = f72;
                    f19 = x11;
                    f64 = f15;
                } else {
                    f63 = f72;
                    f19 = x11;
                    f64 = (((j14 - xbVar.f) / j12) * xbVar.v1) + xbVar.z1 + r5;
                }
                RectF rectF9 = rectF;
                rectF9.set(f73, f69 - videoHeight, f64 + f63, f69);
                float f74 = f69 - ((f18 * f61) + videoHeight);
                float f75 = (rectF9.top * f13) + f15;
                float f76 = (rectF9.bottom * f13) + f15;
                xbVar.w0.rewind();
                xbVar.w0.addRoundRect(rectF9, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(xbVar.w0);
                vb vbVar = xbVar.h.c;
                if (vbVar != null) {
                    int i17 = vbVar.f;
                    float f77 = i17;
                    f22 = f75;
                    int max = (int) Math.max(0.0d, Math.floor((f73 - xbVar.z1) / f77));
                    f14 = f61;
                    int min2 = (int) Math.min(xbVar.h.c.c, Math.ceil(((r6 - f73) - xbVar.z1) / f77) + 1.0d);
                    int i18 = (int) rectF9.top;
                    arrayList13 = xbVar.h.c.d;
                    boolean z17 = arrayList13.size() >= min2;
                    boolean z18 = (i17 == 0 || !z17 || xbVar.h.b) ? false : true;
                    if (z18) {
                        int i19 = max;
                        while (true) {
                            arrayList16 = xbVar.h.c.d;
                            if (i19 >= Math.min(arrayList16.size(), min2)) {
                                break;
                            }
                            arrayList17 = xbVar.h.c.d;
                            if (((ub) arrayList17.get(i19)).a == null) {
                                z18 = false;
                                break;
                            }
                            i19++;
                        }
                    }
                    if (!z18) {
                        if (baVar.c()) {
                            faVar.a(canvas2);
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
                            arrayList15 = xbVar.h.c.d;
                            ub ubVar = (ub) arrayList15.get(i20);
                            if (ubVar.a != null) {
                                i16 = min2;
                                z15 = z17;
                                xbVar.v0.setAlpha((int) (ubVar.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(ubVar.a, f78, i18 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), xbVar.v0);
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
                        xbVar.h.c.c();
                    }
                } else {
                    f22 = f75;
                    f14 = f61;
                    f65 = 1.0f;
                    f66 = 2.0f;
                }
                path2.rewind();
                if (xbVar.Y0) {
                    f17 = f65;
                    f16 = f66;
                    f20 = f76;
                } else {
                    RectF rectF10 = org.telegram.messenger.g0.P;
                    float f79 = xbVar.z1 + xbVar.y1;
                    sb sbVar5 = xbVar.h;
                    float f80 = sbVar5.g;
                    f16 = f66;
                    f20 = f76;
                    float f81 = sbVar5.e;
                    f17 = f65;
                    float f82 = xbVar.f;
                    float f83 = j12;
                    float f84 = xbVar.v1;
                    float f85 = (((((f80 * f81) - f82) / f83) * f84) + f79) - (f80 <= f15 ? r7 : 0);
                    float f86 = xbVar.x1 - xbVar.A1;
                    float f87 = f86 - videoHeight;
                    float f88 = sbVar5.h;
                    rectF10.set(f85, f87, ((((f81 * f88) - f82) / f83) * f84) + f79 + (f88 >= f17 ? r7 : 0), f86);
                    path2.addRoundRect(rectF10, xbVar.u1, Path.Direction.CW);
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
                xbVar.getCollageHeight();
                float f89 = f69;
                f24 = f21;
                int i21 = 0;
                while (true) {
                    f23 = f19;
                    if (i21 >= arrayList2.size()) {
                        break;
                    }
                    ArrayList arrayList20 = arrayList2;
                    sb sbVar6 = (sb) arrayList20.get(i21);
                    org.telegram.ui.Components.c6 c6Var = sbVar6.k;
                    float f90 = f12;
                    RectF rectF11 = sbVar6.j;
                    float d11 = c6Var.d((xbVar.Q || xbVar.H || xbVar.n != i21) ? false : true);
                    if (sbVar6 != xbVar.w) {
                        i15 = i21;
                        path = path2;
                        float f91 = j12;
                        float T12 = ((((org.telegram.messenger.g0.T1(sbVar6.g, f15, d11) * sbVar6.e) + (sbVar6.f - xbVar.f)) / f91) * xbVar.v1) + xbVar.z1 + xbVar.y1;
                        rectF4 = rectF6;
                        paint5 = paint;
                        c11 = (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(sbVar6.h, f17, d11), sbVar6.e, sbVar6.f - xbVar.f, f91) * xbVar.v1) + xbVar.z1 + xbVar.y1;
                        faVar2 = faVar;
                        f51 = T12;
                    } else {
                        i15 = i21;
                        rectF4 = rectF6;
                        path = path2;
                        paint5 = paint;
                        float f92 = xbVar.z1 + xbVar.y1;
                        float f93 = j12;
                        float f94 = (sbVar6.f - xbVar.f) / f93;
                        float f95 = xbVar.v1;
                        f51 = (f94 * f95) + f92;
                        faVar2 = faVar;
                        c11 = com.google.android.gms.internal.vision.e2.c(r9 + sbVar6.e, f93, f95, f92);
                    }
                    canvas2.save();
                    float W1 = org.telegram.messenger.g0.W1(d11, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
                    float f96 = xbVar.y1;
                    rectF11.set(f51 - f96, f89 - W1, c11 + f96, f89);
                    f22 = (rectF11.top * d11) + f22;
                    f20 = (rectF11.bottom * d11) + f20;
                    float f97 = sbVar6.f;
                    float f98 = sbVar6.g;
                    float f99 = sbVar6.e;
                    float g11 = org.telegram.ui.Cells.c0.g(f98, f99, f97, d11, f24);
                    float g12 = org.telegram.ui.Cells.c0.g(sbVar6.h, f99, f97, d11, f23);
                    xbVar.y.rewind();
                    xbVar.y.addRoundRect(rectF11, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(xbVar.y);
                    vb vbVar2 = sbVar6.c;
                    if (vbVar2 != null) {
                        long j15 = sbVar6.e;
                        if (j15 <= 0) {
                            f52 = f89;
                            f19 = g12;
                            f55 = 0.0f;
                        } else {
                            f52 = f89;
                            f19 = g12;
                            f55 = (((sbVar6.f - xbVar.f) / j12) * xbVar.v1) + xbVar.z1 + xbVar.y1;
                        }
                        float f100 = xbVar.y1;
                        float f101 = f55 - f100;
                        if (j15 <= 0) {
                            f56 = f101;
                            f57 = 0.0f;
                        } else {
                            f56 = f101;
                            f57 = ((((sbVar6.f + j15) - xbVar.f) / j12) * xbVar.v1) + xbVar.z1 + r6;
                        }
                        float f102 = f57 + f100;
                        int i22 = vbVar2.f;
                        float f103 = i22;
                        int max2 = (int) Math.max(0.0d, Math.floor((f56 - ((((sbVar6.f - xbVar.f) / j12) * xbVar.v1) + (xbVar.z1 + xbVar.y1))) / f103));
                        int min3 = (int) Math.min(sbVar6.c.c, Math.ceil((f102 - f56) / f103) + 1.0d);
                        int i23 = (int) rectF11.top;
                        arrayList8 = sbVar6.c.d;
                        boolean z20 = arrayList8.size() >= min3;
                        if (z20) {
                            for (int i24 = max2; i24 < Math.min(arrayList11.size(), min3); i24++) {
                                arrayList12 = sbVar6.c.d;
                                if (((ub) arrayList12.get(i24)).a == null) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                        z13 = z20;
                        if (z13) {
                            paint6 = paint5;
                            faVar3 = faVar2;
                        } else {
                            if (baVar.c()) {
                                faVar3 = faVar2;
                                faVar3.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else {
                                faVar3 = faVar2;
                                if (paint5 == null) {
                                    canvas2.drawColor(TLObject.FLAG_30);
                                } else {
                                    paint6 = paint5;
                                    canvas2.drawRect(rectF11, paint6);
                                    f58 = f103;
                                    canvas2.drawColor(855638016);
                                    if (i22 != 0) {
                                        while (max2 < Math.min(arrayList9.size(), min3)) {
                                            arrayList10 = sbVar6.c.d;
                                            ub ubVar2 = (ub) arrayList10.get(max2);
                                            int i25 = min3;
                                            if (ubVar2.a != null) {
                                                f59 = g11;
                                                f60 = W1;
                                                z14 = z20;
                                                xbVar.x.setAlpha((int) (ubVar2.b.e(false, 1.0f) * 255.0f));
                                                canvas2.drawBitmap(ubVar2.a, f56, i23 - ((int) ((r4.getHeight() - f60) / f16)), xbVar.x);
                                            } else {
                                                f59 = g11;
                                                f60 = W1;
                                                z14 = z20;
                                            }
                                            f56 += f58;
                                            max2++;
                                            min3 = i25;
                                            g11 = f59;
                                            W1 = f60;
                                            z20 = z14;
                                        }
                                    }
                                    f53 = g11;
                                    f54 = W1;
                                    if (!z20) {
                                        sbVar6.c.c();
                                    }
                                }
                            }
                            paint6 = paint5;
                        }
                        f58 = f103;
                        if (i22 != 0) {
                        }
                        f53 = g11;
                        f54 = W1;
                        if (!z20) {
                        }
                    } else {
                        f52 = f89;
                        f19 = g12;
                        f53 = g11;
                        paint6 = paint5;
                        faVar3 = faVar2;
                        f54 = W1;
                    }
                    xbVar.E.rewind();
                    if (!xbVar.Y0) {
                        RectF rectF12 = org.telegram.messenger.g0.P;
                        int i26 = xbVar.z1;
                        int i27 = xbVar.y1;
                        float f104 = i26 + i27;
                        float f105 = sbVar6.g;
                        int i28 = i27;
                        float f106 = sbVar6.e;
                        float f107 = f105 * f106;
                        float f108 = xbVar.f;
                        float f109 = f107 - f108;
                        float f110 = sbVar6.f;
                        float f111 = f109 + f110;
                        float f112 = j12;
                        float f113 = f111 / f112;
                        float f114 = xbVar.v1;
                        float f115 = ((f113 * f114) + f104) - (f105 <= 0.0f ? i28 : 0);
                        float f116 = rectF11.top;
                        float f117 = sbVar6.h;
                        float f118 = (((((f106 * f117) - f108) + f110) / f112) * f114) + f104;
                        if (f117 < 1.0f) {
                            i28 = 0;
                        }
                        rectF12.set(f115, f116, f118 + i28, rectF11.bottom);
                        xbVar.E.addRoundRect(rectF12, xbVar.u1, Path.Direction.CW);
                        canvas2.clipPath(xbVar.E, Region.Op.DIFFERENCE);
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
                    faVar = faVar3;
                    f89 = f52 - ((f18 * 1.0f) + f54);
                    i21 = i15 + 1;
                }
                f69 = f89;
                f25 = 1.0f;
            }
            RectF rectF13 = rectF6;
            Path path3 = path2;
            org.telegram.ui.Components.fa faVar6 = faVar;
            Paint paint9 = paint;
            ArrayList arrayList21 = arrayList2;
            float f119 = f12;
            float d12 = xbVar.d0.d(xbVar.F);
            float d13 = xbVar.e0.d(xbVar.F && xbVar.H);
            float roundHeight = xbVar.getRoundHeight() * d12;
            float f120 = ((xbVar.h == null && !xbVar.O && arrayList21.isEmpty()) ? 1.0f : d13) * d12;
            if (d12 > 0.0f) {
                long j16 = xbVar.J;
                float f121 = j16;
                float f122 = xbVar.K;
                f27 = f25;
                float f123 = xbVar.I;
                float g13 = org.telegram.ui.Cells.c0.g(f122, f123, f121, f120, f24);
                float g14 = org.telegram.ui.Cells.c0.g(xbVar.L, f123, f121, f120, f23);
                if (xbVar.h != null) {
                    float f124 = j12;
                    f45 = ((((org.telegram.messenger.g0.T1(f122, 0.0f, d13) * xbVar.I) + (j16 - xbVar.f)) / f124) * xbVar.v1) + xbVar.z1 + xbVar.y1;
                    f44 = g14;
                    c10 = (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(xbVar.L, 1.0f, d13), xbVar.I, xbVar.J - xbVar.f, f124) * xbVar.v1) + xbVar.z1 + xbVar.y1;
                } else {
                    f44 = g14;
                    float f125 = xbVar.z1 + xbVar.y1;
                    long j17 = j16 - xbVar.f;
                    float f126 = j12;
                    float f127 = xbVar.v1;
                    float f128 = ((j17 / f126) * f127) + f125;
                    c10 = com.google.android.gms.internal.vision.e2.c(j17 + r12, f126, f127, f125);
                    f45 = f128;
                }
                float f129 = xbVar.y1;
                rectF13.set(f45 - f129, f69 - roundHeight, c10 + f129, f69);
                float f130 = f69 - ((f18 * d12) + roundHeight);
                f22 = (rectF13.top * f120) + f22;
                f20 = (rectF13.bottom * f120) + f20;
                xbVar.z0.rewind();
                xbVar.z0.addRoundRect(rectF13, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(xbVar.z0);
                vb vbVar3 = xbVar.N;
                if (vbVar3 != null) {
                    long j18 = xbVar.I;
                    if (j18 <= 0) {
                        f26 = d13;
                        j13 = j18;
                        f48 = 0.0f;
                    } else {
                        f26 = d13;
                        j13 = j18;
                        f48 = (((xbVar.J - xbVar.f) / j12) * xbVar.v1) + xbVar.z1 + xbVar.y1;
                    }
                    float f131 = xbVar.y1;
                    float f132 = f48 - f131;
                    if (j18 <= 0) {
                        f49 = f132;
                        f50 = 0.0f;
                    } else {
                        f49 = f132;
                        f50 = xbVar.z1 + r10 + ((((xbVar.J + j13) - xbVar.f) / j12) * xbVar.v1);
                    }
                    float f133 = f50 + f131;
                    int i29 = vbVar3.f;
                    float f134 = i29;
                    int max3 = (int) Math.max(0.0d, Math.floor((f49 - (xbVar.h != null ? (((xbVar.J - xbVar.f) / j12) * xbVar.v1) + (xbVar.z1 + xbVar.y1) : xbVar.z1)) / f134));
                    int min4 = (int) Math.min(xbVar.N.c, Math.ceil((f133 - f49) / f134) + 1.0d);
                    int i30 = (int) rectF13.top;
                    arrayList3 = xbVar.N.d;
                    boolean z21 = arrayList3.size() >= min4;
                    f46 = f130;
                    if (z21) {
                        for (int i31 = max3; i31 < Math.min(arrayList6.size(), min4); i31++) {
                            arrayList7 = xbVar.N.d;
                            if (((ub) arrayList7.get(i31)).a == null) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = z21;
                    if (!z11) {
                        if (baVar.c()) {
                            faVar6.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint9 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            paint4 = paint9;
                            canvas2.drawRect(rectF13, paint4);
                            canvas2.drawColor(855638016);
                            if (i29 != 0) {
                                while (max3 < Math.min(arrayList4.size(), min4)) {
                                    arrayList5 = xbVar.N.d;
                                    ub ubVar3 = (ub) arrayList5.get(max3);
                                    if (ubVar3.a != null) {
                                        i13 = min4;
                                        i14 = i30;
                                        z12 = z21;
                                        xbVar.v0.setAlpha((int) (ubVar3.b.e(false, 1.0f) * 255.0f));
                                        canvas2.drawBitmap(ubVar3.a, f49, i14 - ((int) ((r4.getHeight() - roundHeight) / f16)), xbVar.v0);
                                    } else {
                                        i13 = min4;
                                        i14 = i30;
                                        z12 = z21;
                                    }
                                    f49 += f134;
                                    max3++;
                                    min4 = i13;
                                    i30 = i14;
                                    z21 = z12;
                                }
                            }
                            if (!z21) {
                                xbVar.N.c();
                            }
                        }
                    }
                    paint4 = paint9;
                    if (i29 != 0) {
                    }
                    if (!z21) {
                    }
                } else {
                    f46 = f130;
                    f26 = d13;
                    paint4 = paint9;
                }
                path3.rewind();
                RectF rectF14 = org.telegram.messenger.g0.P;
                int i32 = xbVar.z1;
                int i33 = xbVar.y1;
                float f135 = i32 + i33;
                float f136 = xbVar.K;
                float f137 = xbVar.I;
                float f138 = xbVar.f;
                float f139 = (f136 * f137) - f138;
                paint2 = paint4;
                float f140 = xbVar.J;
                float f141 = j12;
                float f142 = xbVar.v1;
                float f143 = (((f139 + f140) / f141) * f142) + f135;
                if (f136 <= 0.0f) {
                    f47 = f142;
                    i12 = i33;
                } else {
                    f47 = f142;
                    i12 = 0;
                }
                float f144 = (1.0f - f26) * i33;
                float f145 = (f143 - i12) - f144;
                float f146 = rectF13.top;
                float f147 = xbVar.L;
                rectF14.set(f145, f146, (((((f137 * f147) - f138) + f140) / f141) * f47) + f135 + (f147 >= 1.0f ? i33 : 0) + f144, rectF13.bottom);
                path3.addRoundRect(rectF14, xbVar.u1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f69 = f46;
                f24 = g13;
                f23 = f44;
            } else {
                f26 = d13;
                f27 = f25;
                paint2 = paint9;
            }
            float d14 = xbVar.f0.d(xbVar.O);
            float d15 = xbVar.g0.d(xbVar.O && xbVar.Q);
            float audioHeight = xbVar.getAudioHeight() * d14;
            float f148 = ((xbVar.h == null && !xbVar.F && arrayList21.isEmpty()) ? 1.0f : d15) * d14;
            if (d14 > 0.0f) {
                paint3 = paint2;
                float f149 = xbVar.R;
                float f150 = xbVar.T;
                float f151 = xbVar.S;
                float g15 = org.telegram.ui.Cells.c0.g(f150, f151, f149, f148, f24);
                float g16 = org.telegram.ui.Cells.c0.g(xbVar.U, f151, f149, f148, f23);
                Paint c15 = xbVar.n0.c(d14);
                canvas2.save();
                if (xbVar.h == null && !xbVar.F && arrayList21.isEmpty()) {
                    float f152 = xbVar.z1 + xbVar.y1;
                    f38 = f148;
                    f39 = g16;
                    long j19 = xbVar.R - xbVar.f;
                    float f153 = j12;
                    float f154 = xbVar.v1;
                    T1 = ((j19 / f153) * f154) + f152;
                    f40 = g15;
                    y10 = com.google.android.gms.internal.vision.e2.c(j19 + xbVar.S, f153, f154, f152);
                } else {
                    f38 = f148;
                    f39 = g16;
                    f40 = g15;
                    float f155 = j12;
                    T1 = ((((org.telegram.messenger.g0.T1(xbVar.T, 0.0f, d15) * xbVar.S) + (xbVar.R - xbVar.f)) / f155) * xbVar.v1) + xbVar.z1 + xbVar.y1;
                    y10 = xbVar.z1 + xbVar.y1 + (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(xbVar.U, 1.0f, d15), xbVar.S, xbVar.R - xbVar.f, f155) * xbVar.v1);
                }
                float f156 = y10;
                float f157 = xbVar.y1;
                RectF rectF15 = rectF3;
                rectF15.set(T1 - f157, f69 - audioHeight, f156 + f157, f69);
                f22 = (rectF15.top * f38) + f22;
                f20 = (rectF15.bottom * f38) + f20;
                xbVar.H0.rewind();
                xbVar.H0.addRoundRect(rectF15, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(xbVar.H0);
                if (baVar != null && baVar.c()) {
                    faVar6.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.n6.r1(d14, 855638016));
                } else if (c15 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.n6.r1(d14, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF15, c15);
                    canvas2.drawColor(org.telegram.ui.ActionBar.n6.r1(d14, 855638016));
                }
                if (xbVar.b0 == null || baVar == null || !baVar.c()) {
                    f41 = d15;
                    if (xbVar.b0 != null && c15 != null) {
                        Paint c16 = xbVar.o0.c(d14 * f10);
                        if (c16 == null) {
                            c16 = xbVar.I0;
                            c16.setAlpha((int) (64.0f * d14));
                        }
                        float e11 = xbVar.h0.e(!xbVar.V, xbVar.b0.e);
                        qb qbVar = xbVar.b0;
                        xbVar.V = qbVar.c > 0;
                        long j20 = j12;
                        xbVar.J0.b((((xbVar.R - xbVar.f) / j12) * xbVar.v1) + xbVar.z1 + xbVar.y1, T1, f156, f41, j20, audioHeight, e11, rectF15.bottom, qbVar);
                        f42 = f41;
                        j10 = j20;
                        canvas2.drawPath(xbVar.J0, c16);
                        if (f42 >= 1.0f) {
                            int i34 = xbVar.z1;
                            float f158 = xbVar.y1 + i34;
                            float f159 = xbVar.R - xbVar.f;
                            float f160 = xbVar.T;
                            float f161 = xbVar.S;
                            float f162 = j10;
                            float f163 = xbVar.v1;
                            float f164 = ((((f160 * f161) + f159) / f162) * f163) + f158;
                            float f165 = ((((xbVar.U * f161) + f159) / f162) * f163) + f158;
                            float min5 = (Math.min(xbVar.w1 - xbVar.z1, f165) + Math.max(i34, f164)) / f16;
                            float centerY3 = rectF15.centerY();
                            float max4 = Math.max(0.0f, (Math.min(xbVar.w1 - xbVar.z1, f165) - Math.max(xbVar.z1, f164)) - org.telegram.messenger.g0.L(24.0f));
                            float N = org.telegram.messenger.g0.N(13.0f) + ((xbVar.N0 == null && xbVar.R0 == null) ? 0.0f : xbVar.S0 + org.telegram.messenger.g0.N(9.66f) + org.telegram.messenger.g0.N(3.11f) + xbVar.O0);
                            boolean z22 = N < max4;
                            float min6 = min5 - (Math.min(N, max4) / f16);
                            xbVar.L0.setBounds((int) min6, (int) (centerY3 - (org.telegram.messenger.g0.L(13.0f) / f16)), (int) (org.telegram.messenger.g0.L(13.0f) + min6), (int) ((org.telegram.messenger.g0.L(13.0f) / f16) + centerY3));
                            float f166 = 1.0f - f42;
                            float f167 = f166 * 255.0f;
                            xbVar.L0.setAlpha((int) f167);
                            xbVar.L0.draw(canvas2);
                            float N2 = org.telegram.messenger.g0.N(16.11f) + min6;
                            f29 = f42;
                            f30 = f13;
                            d = 0.0d;
                            f28 = d14;
                            f31 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, xbVar.w1, xbVar.x1, ks.e4, 31);
                            float min7 = Math.min(f165, xbVar.w1) - org.telegram.messenger.g0.L(12.0f);
                            canvas2.clipRect(N2, 0.0f, min7, xbVar.x1);
                            if (xbVar.N0 != null) {
                                canvas2.save();
                                m10.k(xbVar.N0.getHeight(), f16, centerY3, N2 - xbVar.P0, canvas2);
                                xbVar.M0.setAlpha((int) (f167 * f28));
                                xbVar.N0.draw(canvas2);
                                canvas2.restore();
                                f43 = xbVar.O0 + N2;
                            } else {
                                f43 = N2;
                            }
                            if (xbVar.N0 != null && xbVar.R0 != null) {
                                float N3 = org.telegram.messenger.g0.N(3.66f) + f43;
                                int alpha = xbVar.K0.getAlpha();
                                xbVar.K0.setAlpha((int) (alpha * f166));
                                canvas2.drawCircle(org.telegram.messenger.g0.L(1.0f) + N3, centerY3, org.telegram.messenger.g0.L(1.0f), xbVar.K0);
                                xbVar.K0.setAlpha(alpha);
                                f43 = org.telegram.messenger.g0.N(2.0f) + N3 + org.telegram.messenger.g0.N(4.0f);
                            }
                            if (xbVar.R0 != null) {
                                canvas2.save();
                                m10.k(xbVar.R0.getHeight(), 2.0f, centerY3, f43 - xbVar.T0, canvas2);
                                xbVar.Q0.setAlpha((int) (f167 * f28));
                                xbVar.R0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (z22) {
                                f11 = 1.0f;
                            } else {
                                xbVar.V0.reset();
                                f11 = 1.0f;
                                xbVar.V0.postScale(org.telegram.messenger.g0.N(8.0f) / 16.0f, 1.0f);
                                xbVar.V0.postTranslate(min7 - org.telegram.messenger.g0.L(8.0f), 0.0f);
                                xbVar.U0.setLocalMatrix(xbVar.V0);
                                canvas2.drawRect(min7 - org.telegram.messenger.g0.L(8.0f), rectF15.top, min7, rectF15.bottom, xbVar.W0);
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
                    float e12 = xbVar.h0.e(!xbVar.V, xbVar.b0.e);
                    qb qbVar2 = xbVar.b0;
                    xbVar.V = qbVar2.c > 0;
                    f41 = d15;
                    xbVar.J0.b((((xbVar.R - xbVar.f) / j12) * xbVar.v1) + xbVar.z1 + xbVar.y1, T1, f156, f41, j12, audioHeight, e12, rectF15.bottom, qbVar2);
                    canvas2.saveLayerAlpha(rectF15, ks.n1, 31);
                    canvas2.clipPath(xbVar.J0);
                    xbVar.o0.a(canvas2);
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
            float f168 = f20;
            float f169 = f22;
            float f170 = xbVar.z1 + xbVar.y1;
            float f171 = xbVar.f;
            float f172 = j10;
            float f173 = xbVar.v1;
            float f174 = (((f24 - f171) / f172) * f173) + f170;
            float f175 = (((f23 - f171) / f172) * f173) + f170;
            if (!arrayList21.isEmpty()) {
                f32 = f28;
                f28 = f27;
            } else if (xbVar.O && xbVar.h == null) {
                f32 = f28;
            } else {
                float f176 = f28;
                f28 = Math.max(f31, d12);
                f32 = f176;
            }
            if (f32 > d || d12 > d || f31 > d || f27 > d) {
                if (xbVar.h == null && !xbVar.F && arrayList21.isEmpty()) {
                    f33 = f29;
                    f34 = f32 * org.telegram.messenger.g0.T1(0.6f, f11, f33);
                } else {
                    f33 = f29;
                    f34 = f11;
                }
                Paint paint10 = paint3;
                xbVar.e(canvas, paint10, f169, f168, f174, f175, f34 * f28);
                sb sbVar7 = xbVar.h;
                if (sbVar7 != null && ((xbVar.O || xbVar.F) && (f33 > 0.0f || f26 > 0.0f))) {
                    float f177 = xbVar.x1 - xbVar.A1;
                    float f178 = xbVar.y1 + xbVar.z1;
                    float f179 = sbVar7.g;
                    float f180 = sbVar7.e;
                    float f181 = xbVar.f;
                    float f182 = xbVar.v1;
                    float f183 = ((((sbVar7.h * f180) - f181) / f172) * f182) + f178;
                    canvas3 = canvas;
                    xbVar.e(canvas3, paint10, f177 - f119, f177, ((((f179 * f180) - f181) / f172) * f182) + f178, f183, 0.8f);
                } else if (xbVar.w == null || arrayList21.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    sb sbVar8 = xbVar.w;
                    RectF rectF16 = sbVar8.j;
                    float f184 = rectF16.top;
                    float f185 = rectF16.bottom;
                    float f186 = xbVar.y1 + xbVar.z1;
                    float f187 = sbVar8.f;
                    float f188 = sbVar8.g;
                    float f189 = sbVar8.e;
                    float f190 = xbVar.f;
                    float f191 = xbVar.v1;
                    float f192 = (((((f188 * f189) + f187) - f190) / f172) * f191) + f186;
                    float f193 = (((((sbVar8.h * f189) + f187) - f190) / f172) * f191) + f186;
                    canvas3 = canvas;
                    xbVar.e(canvas3, paint10, f184, f185, f192, f193, 0.8f);
                }
                if (xbVar.c0 > 1) {
                    sb sbVar9 = xbVar.h;
                    if (sbVar9 != null) {
                        float f194 = sbVar9.e;
                        float f195 = sbVar9.h;
                        float f196 = sbVar9.g;
                        long j21 = (long) ((f195 - f196) * f194);
                        if (j21 > 68999) {
                            float f197 = xbVar.z1 + xbVar.y1;
                            float f198 = xbVar.f;
                            float f199 = xbVar.v1;
                            float f200 = ((((f196 * f194) - f198) / f172) * f199) + f197;
                            float f201 = ((((f195 * f194) - f198) / f172) * f199) + f197;
                            canvas3.save();
                            float f202 = xbVar.x1 - xbVar.A1;
                            canvas3.clipRect(f200, f202 - f119, f201, f202);
                            xbVar.A0.setAlpha((int) (org.telegram.messenger.g0.T1(0.8f, f11, f30) * 255.0f));
                            i7 = 1;
                            long j22 = 59000;
                            int min8 = (int) Math.min(xbVar.c0 - 1, j21 / 59000);
                            int i35 = 1;
                            while (i35 <= min8) {
                                if (Math.min(j22, j21 - (i35 * j22)) < 1000) {
                                    break;
                                }
                                float f203 = xbVar.z1 + xbVar.y1;
                                sb sbVar10 = xbVar.h;
                                float f204 = ((((((long) (sbVar10.e * sbVar10.g)) + r2) - xbVar.f) / f172) * xbVar.v1) + f203;
                                int i36 = i35;
                                canvas.drawRect(f204, (xbVar.x1 - xbVar.A1) - f119, org.telegram.messenger.g0.L(f11) + f204, xbVar.x1 - xbVar.A1, xbVar.A0);
                                canvas3 = canvas;
                                StringBuilder sb2 = new StringBuilder("#");
                                int i37 = i36 + 1;
                                sb2.append(i37);
                                canvas3.drawText(sb2.toString(), f204 + org.telegram.messenger.g0.L(2.0f), ((xbVar.x1 - xbVar.A1) - f119) + org.telegram.messenger.g0.L(14.0f), xbVar.F0);
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
                float e13 = xbVar.c1.e(false, 0.0f);
                float contentHeight = ((xbVar.x1 - xbVar.getContentHeight()) + xbVar.A1) - org.telegram.messenger.g0.N(2.3f);
                float N4 = (xbVar.x1 - xbVar.A1) + org.telegram.messenger.g0.N(4.3f);
                if (e13 > 0.0f) {
                    long j23 = xbVar.d1;
                    if (j23 == -1) {
                        sb sbVar11 = xbVar.h;
                        if (sbVar11 != null) {
                            j23 = (long) (sbVar11.e * sbVar11.h);
                        } else {
                            sb sbVar12 = xbVar.w;
                            if (sbVar12 != null) {
                                j23 = (long) ((sbVar12.h - sbVar12.g) * sbVar12.e);
                            } else {
                                if (xbVar.F) {
                                    f36 = xbVar.I;
                                    f37 = xbVar.L;
                                } else {
                                    f36 = xbVar.S;
                                    f37 = xbVar.U;
                                }
                                j23 = (long) (f36 * f37);
                            }
                        }
                    }
                    Canvas canvas4 = canvas3;
                    f35 = contentHeight;
                    xbVar = xbVar;
                    xbVar.d(f35, N4, e13 * f28, j23, canvas4);
                } else {
                    f35 = contentHeight;
                    xbVar = xbVar;
                }
                xbVar.d(f35, N4, (f11 - e13) * f28, xbVar.e, canvas);
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
        if (xbVar.n1) {
            float f205 = f11 / (1000.0f / org.telegram.messenger.g0.r);
            float f206 = xbVar.o1;
            long L2 = (long) ((org.telegram.messenger.g0.L(32.0f) / xbVar.v1) * j10 * f205 * f206);
            if (xbVar.Y0) {
                xbVar.o1 = (f205 * 0.25f) + f206;
            }
            int i38 = xbVar.i1;
            if (i38 == 4 && (sbVar2 = xbVar.h) != null) {
                float f207 = sbVar2.g;
                long j24 = xbVar.f;
                long j25 = sbVar2.e;
                float f208 = j25;
                if (f207 < j24 / f208) {
                    i11 = -1;
                } else if (sbVar2.h > (j24 + j10) / f208) {
                    i11 = i7;
                } else {
                    xbVar.o1 = f11;
                    i11 = 0;
                }
                long j26 = i11 * L2;
                xbVar.f = Utilities.k(j24 + j26, j25 - j10, 0L);
                xbVar.e += j26;
                sb sbVar13 = xbVar.h;
                float f209 = (r3 - j24) / sbVar13.e;
                float min9 = f209 > 0.0f ? Math.min(f11 - sbVar13.h, f209) : Math.max(0.0f - sbVar13.g, f209);
                sb sbVar14 = xbVar.h;
                sbVar14.g = Utilities.i(sbVar14.g + min9, f11, 0.0f);
                sb sbVar15 = xbVar.h;
                sbVar15.h = Utilities.i(sbVar15.h + min9, f11, 0.0f);
                rb rbVar = xbVar.a;
                if (rbVar != null) {
                    rbVar.x(false, xbVar.h.g);
                    xbVar.a.o0(xbVar.h.h);
                }
                xbVar.invalidate();
            } else if (i38 == 8) {
                float f210 = xbVar.T;
                long j27 = xbVar.R;
                float f211 = (-j27) + 100;
                long j28 = xbVar.S;
                float f212 = j28;
                if (f210 < f211 / f212) {
                    i10 = -1;
                } else if (xbVar.U >= ((r8 + j10) - 100) / f212) {
                    i10 = i7;
                } else {
                    xbVar.o1 = f11;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (xbVar.Q && (sbVar = xbVar.h) != null) {
                        long j29 = j27 - (i10 * L2);
                        float f213 = sbVar.h;
                        float f214 = sbVar.e;
                        xbVar.R = Utilities.k(j29, (long) ((f213 * f214) - (f210 * f212)), (long) ((sbVar.g * f214) - (xbVar.U * f212)));
                    } else if (xbVar.H && xbVar.F) {
                        long j30 = j27 - (i10 * L2);
                        float f215 = xbVar.L;
                        float f216 = xbVar.I;
                        xbVar.R = Utilities.k(j30, (long) ((f215 * f216) - (f210 * f212)), (long) ((xbVar.K * f216) - (xbVar.U * f212)));
                    } else {
                        xbVar.R = Utilities.k(j27 - (i10 * L2), 0L, -(j28 - Math.min(xbVar.getBaseDuration(), xbVar.getMaxScrollDuration())));
                    }
                    float f217 = (-(xbVar.R - j27)) / xbVar.S;
                    float min10 = f217 > 0.0f ? Math.min(f11 - xbVar.U, f217) : Math.max(0.0f - xbVar.T, f217);
                    if (xbVar.h == null) {
                        float f218 = xbVar.e;
                        float f219 = xbVar.S;
                        xbVar.e = (long) Utilities.i((min10 * f219) + f218, f219, 0.0f);
                    }
                    xbVar.T = Utilities.i(xbVar.T + min10, f11, 0.0f);
                    xbVar.U = Utilities.i(xbVar.U + min10, f11, 0.0f);
                    rb rbVar2 = xbVar.a;
                    if (rbVar2 != null) {
                        rbVar2.j0(xbVar.T);
                        xbVar.a.d0(xbVar.U);
                        xbVar.a.p(xbVar.e, false);
                    }
                    xbVar.invalidate();
                } else {
                    xbVar.o1 = f11;
                }
            } else {
                xbVar.o1 = f11;
            }
        } else {
            xbVar.o1 = f11;
        }
        int contentHeight2 = xbVar.getContentHeight();
        if (xbVar.c != contentHeight2) {
            xbVar.c = contentHeight2;
            Runnable runnable = xbVar.d;
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, ks.e4, 31);
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
        paint4.setAlpha(ks.e4);
        paint5.setAlpha(i7);
        float f15 = f10 + f11;
        float f16 = (f15 - L2) / 2.0f;
        float f17 = (f15 + L2) / 2.0f;
        rectF.set(org.telegram.messenger.f3.y(org.telegram.messenger.g0.L(this.Y0 ? 2.0f : 10.0f), L, 2.0f, f12), f16, f12 - ((org.telegram.messenger.g0.L(this.Y0 ? 2.0f : 10.0f) + L) / 2.0f), f17);
        if (!this.Y0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            if (paint != null && !this.Y0) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.gms.internal.vision.e2.A(org.telegram.messenger.g0.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f13), f16, org.telegram.messenger.f3.a(org.telegram.messenger.g0.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f13), f17);
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
        rb rbVar;
        long k10;
        sb sbVar = this.h;
        if (sbVar == null && !this.F) {
            long j15 = this.R;
            long k11 = Utilities.k(j15 + ((long) f10), 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k11;
            float f13 = k11 - j15;
            this.T = Utilities.i(this.T - (f13 / this.S), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f13 / this.S), 1.0f, 0.0f);
            rb rbVar2 = this.a;
            if (rbVar2 != null) {
                rbVar2.j0(this.T);
                this.a.d0(this.U);
            }
        } else if (this.Q) {
            if (sbVar != null) {
                f11 = sbVar.g;
                j3 = sbVar.e;
            } else {
                f11 = this.K;
                j3 = this.I;
            }
            float f14 = f11 * j3;
            if (sbVar != null) {
                f12 = sbVar.h;
                j10 = sbVar.e;
            } else {
                f12 = this.L;
                j10 = this.I;
            }
            float f15 = f12 * j10;
            float f16 = sbVar != null ? (sbVar.h - sbVar.g) * sbVar.e : this.I * (this.L - this.K);
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
                rb rbVar3 = this.a;
                if (rbVar3 != null) {
                    rbVar3.j0(this.T);
                    this.a.d0(this.U);
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
                rb rbVar4 = this.a;
                if (rbVar4 != null) {
                    rbVar4.j0(this.T);
                    this.a.d0(this.U);
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
        rb rbVar5 = this.a;
        if (rbVar5 != null) {
            rbVar5.y0(this.R + ((long) (this.T * this.S)));
        }
        boolean z10 = this.n1;
        if (z10 || (rbVar = this.a) == null) {
            if (z10 || this.s1) {
                sb sbVar2 = this.h;
                if (sbVar2 != null) {
                    long j26 = this.R + ((long) (this.T * this.S));
                    float f24 = sbVar2.h;
                    float f25 = sbVar2.e;
                    this.e = Utilities.k(j26, (long) (f24 * f25), (long) (sbVar2.g * f25));
                } else if (!this.F || sbVar2 == null) {
                    float f26 = this.T;
                    long j27 = this.S;
                    this.e = Utilities.k((long) (f26 * j27), j27, 0L);
                } else {
                    long j28 = this.R + ((long) (this.T * this.S));
                    float f27 = this.L;
                    float f28 = sbVar2.e;
                    this.e = Utilities.k(j28, (long) (f27 * f28), (long) (this.K * f28));
                }
                rb rbVar6 = this.a;
                if (rbVar6 != null) {
                    rbVar6.p(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        rbVar.D(true);
        sb sbVar3 = this.h;
        if (sbVar3 != null) {
            long j29 = this.R + ((long) (this.T * this.S));
            float f29 = sbVar3.h;
            float f30 = sbVar3.e;
            k10 = Utilities.k(j29, (long) (f29 * f30), (long) (sbVar3.g * f30));
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
        rb rbVar7 = this.a;
        this.e = k10;
        rbVar7.p(k10, false);
    }

    public final void i(sb sbVar, float f10) {
        rb rbVar;
        long k10;
        long j3;
        long j10;
        long j11;
        long j12;
        if (sbVar == null) {
            return;
        }
        sb sbVar2 = this.w;
        if (sbVar2 != sbVar && sbVar2 != null) {
            if (this.n == this.s.indexOf(sbVar)) {
                sb sbVar3 = this.w;
                float f11 = sbVar3.e;
                float f12 = sbVar.h;
                float f13 = sbVar.e;
                long j13 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = sbVar.g;
                long j14 = (long) ((f11 * 0.0f) - (f14 * f13));
                float min = Math.min(f12 - f14, ((sbVar3.h - sbVar3.g) * f11) / f13);
                long j15 = sbVar.f;
                long j16 = (long) f10;
                long j17 = j15 + j16;
                if (j17 > j13) {
                    float i7 = Utilities.i((((this.w.h * r2.e) - j15) - j16) / sbVar.e, 1.0f, min);
                    sbVar.h = i7;
                    float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                    sbVar.g = i10;
                    sb sbVar4 = this.w;
                    float f15 = sbVar4.h;
                    float f16 = sbVar4.e;
                    float f17 = sbVar.h;
                    float f18 = sbVar.e;
                    long j18 = (long) ((f15 * f16) - (f17 * f18));
                    long j19 = (long) ((sbVar4.g * f16) - (i10 * f18));
                    if (j18 < j19) {
                        j12 = j19;
                        j11 = j18;
                    } else {
                        j11 = j19;
                        j12 = j18;
                    }
                    sbVar.f = Utilities.k(sbVar.f + j16, j12, j11);
                    rb rbVar2 = this.a;
                    if (rbVar2 != null) {
                        rbVar2.b0(sbVar.g, sbVar.a);
                        this.a.n0(sbVar.h, sbVar.a);
                    }
                } else if (j17 < j14) {
                    float i11 = Utilities.i((((this.w.g * r2.e) - j15) - j16) / sbVar.e, 1.0f - min, 0.0f);
                    sbVar.g = i11;
                    float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                    sbVar.h = i12;
                    sb sbVar5 = this.w;
                    float f19 = sbVar5.h;
                    float f20 = sbVar5.e;
                    float f21 = sbVar.e;
                    long j20 = (long) ((f19 * f20) - (i12 * f21));
                    long j21 = (long) ((sbVar5.g * f20) - (sbVar.g * f21));
                    if (j20 < j21) {
                        j10 = j21;
                        j3 = j20;
                    } else {
                        j3 = j21;
                        j10 = j20;
                    }
                    sbVar.f = Utilities.k(sbVar.f + j16, j10, j3);
                    rb rbVar3 = this.a;
                    if (rbVar3 != null) {
                        rbVar3.b0(sbVar.g, sbVar.a);
                        this.a.n0(sbVar.h, sbVar.a);
                    }
                } else {
                    sbVar.f = j17;
                }
            } else {
                long j22 = sbVar.f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = sbVar.e;
                sbVar.f = Utilities.k(j22, (long) (baseDuration - (sbVar.h * f22)), (long) ((-sbVar.g) * f22));
            }
        }
        invalidate();
        rb rbVar4 = this.a;
        if (rbVar4 != null) {
            rbVar4.u0(sbVar.a, sbVar.f);
        }
        boolean z10 = this.n1;
        if (z10 || (rbVar = this.a) == null) {
            if (z10 || this.s1) {
                sb sbVar6 = this.w;
                if (sbVar6 == sbVar || sbVar6 == null) {
                    float f23 = sbVar.g;
                    long j23 = sbVar.e;
                    this.e = Utilities.k((long) (f23 * j23), j23, 0L);
                } else {
                    long j24 = sbVar.f + ((long) (sbVar.g * sbVar.e));
                    float f24 = sbVar6.h;
                    float f25 = sbVar6.e;
                    this.e = Utilities.k(j24, (long) (f24 * f25), (long) (sbVar6.g * f25));
                }
                rb rbVar5 = this.a;
                if (rbVar5 != null) {
                    rbVar5.p(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        rbVar.D(true);
        sb sbVar7 = this.w;
        if (sbVar7 == sbVar || sbVar7 == null) {
            float f26 = sbVar.g;
            long j25 = sbVar.e;
            k10 = Utilities.k((long) (f26 * j25), j25, 0L);
        } else {
            long j26 = sbVar.f + ((long) (sbVar.g * sbVar.e));
            float f27 = sbVar7.h;
            float f28 = sbVar7.e;
            k10 = Utilities.k(j26, (long) (f27 * f28), (long) (sbVar7.g * f28));
        }
        sb sbVar8 = this.w;
        if (sbVar8 != sbVar && sbVar8 != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        rb rbVar6 = this.a;
        this.e = k10;
        rbVar6.p(k10, false);
    }

    public final void j(float f10) {
        long j3;
        long j10;
        long j11;
        long j12;
        rb rbVar;
        long k10;
        sb sbVar = this.h;
        if (sbVar == null) {
            long j13 = this.J;
            long k11 = Utilities.k(j13 + ((long) f10), 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k11;
            float f11 = k11 - j13;
            this.K = Utilities.i(this.K - (f11 / this.I), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f11 / this.I), 1.0f, 0.0f);
            rb rbVar2 = this.a;
            if (rbVar2 != null) {
                rbVar2.z(this.K);
                this.a.r0(this.L);
            }
        } else if (this.H) {
            float f12 = sbVar.h;
            float f13 = sbVar.e;
            float f14 = this.L;
            float f15 = this.I;
            long j14 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = sbVar.g;
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
                sb sbVar2 = this.h;
                float f18 = sbVar2.h;
                float f19 = sbVar2.e;
                float f20 = this.L;
                float f21 = this.I;
                long j19 = (long) ((f18 * f19) - (f20 * f21));
                long j20 = (long) ((sbVar2.g * f19) - (i10 * f21));
                if (j19 < j20) {
                    j12 = j20;
                    j11 = j19;
                } else {
                    j11 = j20;
                    j12 = j19;
                }
                this.J = Utilities.k(this.J + j17, j12, j11);
                rb rbVar3 = this.a;
                if (rbVar3 != null) {
                    rbVar3.z(this.K);
                    this.a.r0(this.L);
                }
            } else if (j18 < j15) {
                float i11 = Utilities.i((((this.h.g * r1.e) - j16) - j17) / this.I, 1.0f - min, 0.0f);
                this.K = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.L = i12;
                sb sbVar3 = this.h;
                float f22 = sbVar3.h;
                float f23 = sbVar3.e;
                float f24 = this.I;
                long j21 = (long) ((f22 * f23) - (i12 * f24));
                long j22 = (long) ((sbVar3.g * f23) - (this.K * f24));
                if (j21 < j22) {
                    j10 = j22;
                    j3 = j21;
                } else {
                    j3 = j22;
                    j10 = j21;
                }
                this.J = Utilities.k(this.J + j17, j10, j3);
                rb rbVar4 = this.a;
                if (rbVar4 != null) {
                    rbVar4.z(this.K);
                    this.a.r0(this.L);
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
        rb rbVar5 = this.a;
        if (rbVar5 != null) {
            rbVar5.U(this.J + ((long) (this.K * this.I)));
        }
        boolean z10 = this.n1;
        if (z10 || (rbVar = this.a) == null) {
            if (z10 || this.s1) {
                sb sbVar4 = this.h;
                if (sbVar4 != null) {
                    long j24 = this.J + ((long) (this.K * this.I));
                    float f26 = sbVar4.h;
                    float f27 = sbVar4.e;
                    this.e = Utilities.k(j24, (long) (f26 * f27), (long) (sbVar4.g * f27));
                } else {
                    float f28 = this.K;
                    long j25 = this.I;
                    this.e = Utilities.k((long) (f28 * j25), j25, 0L);
                }
                rb rbVar6 = this.a;
                if (rbVar6 != null) {
                    rbVar6.p(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        rbVar.D(true);
        sb sbVar5 = this.h;
        if (sbVar5 != null) {
            long j26 = this.J + ((long) (this.K * this.I));
            float f29 = sbVar5.h;
            float f30 = sbVar5.e;
            k10 = Utilities.k(j26, (long) (f29 * f30), (long) (sbVar5.g * f30));
        } else {
            float f31 = this.K;
            long j27 = this.I;
            k10 = Utilities.k((long) (f31 * j27), j27, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        rb rbVar7 = this.a;
        this.e = k10;
        rbVar7.p(k10, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        sb sbVar = this.h;
        float f10 = (sbVar.h + sbVar.g) / 2.0f;
        long j3 = sbVar.e;
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
        sb sbVar = this.h;
        ArrayList arrayList = this.s;
        if (sbVar == null && !this.O && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.z1) - this.y1) / this.v1;
        sb sbVar2 = this.w;
        long j3 = sbVar2 != null ? (long) ((sbVar2.g * sbVar2.e) + sbVar2.f) : 0L;
        float f12 = f11 * min;
        if (sbVar2 == null) {
            j3 = this.h == null ? this.R : 0L;
        }
        long i7 = (long) Utilities.i((f12 - j3) + this.f, getBaseDuration(), 0.0f);
        sb sbVar3 = this.h;
        if (sbVar3 != null) {
            float f13 = i7 / sbVar3.e;
            if (f13 < sbVar3.g || f13 > sbVar3.h) {
                return false;
            }
        }
        sb sbVar4 = this.w;
        if (sbVar4 != null && (i7 < 0 || i7 >= ((long) ((sbVar4.h - sbVar4.g) * sbVar4.e)))) {
            return false;
        }
        if (this.O && sbVar3 == null && arrayList.isEmpty()) {
            float f14 = i7 / this.S;
            if (f14 < this.T || f14 > this.U) {
                return false;
            }
        }
        this.e = i7;
        invalidate();
        rb rbVar = this.a;
        if (rbVar != null) {
            rbVar.p(i7, z10);
        }
        bi.e4 e4Var = this.e1;
        if (e4Var != null) {
            org.telegram.messenger.g0.r(e4Var);
            this.e1 = null;
        }
        if (!z10) {
            return true;
        }
        bi.e4 e4Var2 = new bi.e4(this, i7, 10);
        this.e1 = e4Var2;
        org.telegram.messenger.g0.h3(e4Var2, 150L);
        return true;
    }

    public final void n(String str, long j3, long j10, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        long j11;
        boolean z12;
        sb sbVar;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        vb vbVar = this.N;
        if (vbVar != null) {
            vbVar.b();
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
            if (getMeasuredWidth() <= 0 || this.N != null || ((sbVar = this.h) != null && sbVar.e < 1)) {
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
                sb sbVar2 = this.h;
                j11 = j12;
                z11 = false;
                z12 = true;
                this.N = new vb(this, false, str2, i11, L, valueOf, sbVar2 != null ? sbVar2.e : getMaxScrollDuration(), -1L, -1L, new ob(this, 0));
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
        sb sbVar = this.h;
        if (TextUtils.equals(sbVar == null ? null : sbVar.d, str)) {
            return;
        }
        sb sbVar2 = this.h;
        if (sbVar2 != null) {
            vb vbVar = sbVar2.c;
            if (vbVar != null) {
                vbVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            sb sbVar3 = new sb(this);
            this.h = sbVar3;
            sbVar3.b = z10;
            sbVar3.d = str;
            sbVar3.e = j3;
            sbVar3.i = f10;
            sb.a(sbVar3, false);
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
        sb sbVar = this.h;
        if (sbVar != null && sbVar.d != null && sbVar.c == null) {
            sb.a(sbVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                sb sbVar2 = (sb) obj;
                if (sbVar2.d != null && sbVar2.c == null) {
                    sb.a(sbVar2, false);
                    sb.b(sbVar2);
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
        bi.e4 e4Var;
        boolean z11;
        VelocityTracker velocityTracker;
        rb rbVar;
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
        float f11;
        float B;
        float f12;
        boolean z13;
        float B2;
        boolean z14;
        rb rbVar2;
        int i7;
        float f13;
        float f14;
        boolean z15;
        float f15;
        float i10;
        rb rbVar3;
        rb rbVar4;
        int i11;
        float f16;
        float f17;
        sb sbVar = this.h;
        ArrayList arrayList = this.s;
        if (sbVar != null || !arrayList.isEmpty() || this.O || this.F) {
            float timelineHeight = this.x1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                ll0 ll0Var = this.X0;
                bi.s1 s1Var = this.Z0;
                if (action == 0) {
                    bi.e4 e4Var2 = this.e1;
                    if (e4Var2 != null) {
                        org.telegram.messenger.g0.r(e4Var2);
                        this.e1 = null;
                    }
                    ll0Var.a();
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
                    float f18 = 2.0f;
                    if (this.k1 != -1 || this.h == null) {
                        f16 = 4.0f;
                    } else {
                        float f19 = i12;
                        if (motionEvent.getY() < f19) {
                            f16 = 4.0f;
                            if (motionEvent.getY() > (f19 - getVideoHeight()) - org.telegram.messenger.g0.L(2.0f)) {
                                this.k1 = 0;
                            }
                        } else {
                            f16 = 4.0f;
                        }
                        i12 = (int) (f19 - (getVideoHeight() + org.telegram.messenger.g0.L(f16)));
                    }
                    if (this.k1 == -1 && !arrayList.isEmpty()) {
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            f17 = f18;
                            float W1 = org.telegram.messenger.g0.W1(((sb) arrayList.get(i13)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
                            float f20 = i12;
                            if (motionEvent.getY() < f20 && motionEvent.getY() > (f20 - W1) - org.telegram.messenger.g0.L(f17)) {
                                this.k1 = 3;
                                this.l1 = i13;
                                break;
                            }
                            i12 = (int) (f20 - (W1 + org.telegram.messenger.g0.L(f16)));
                            i13++;
                            f18 = f17;
                        }
                    }
                    f17 = f18;
                    if (this.k1 == -1 && this.F) {
                        float f21 = i12;
                        if (motionEvent.getY() < f21 && motionEvent.getY() > (f21 - getRoundHeight()) - org.telegram.messenger.g0.L(f17)) {
                            this.k1 = 1;
                        }
                        i12 = (int) (f21 - (getRoundHeight() + org.telegram.messenger.g0.L(f16)));
                    }
                    if (this.k1 == -1 && this.O) {
                        float f22 = i12;
                        if (motionEvent.getY() < f22 && motionEvent.getY() > (f22 - getAudioHeight()) - org.telegram.messenger.g0.L(f17)) {
                            this.k1 = 2;
                        }
                        getAudioHeight();
                        org.telegram.messenger.g0.L(f16);
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
                        org.telegram.messenger.g0.r(s1Var);
                        org.telegram.messenger.g0.h3(s1Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.h1;
                    if (this.k0 && (this.n1 || Math.abs(x10) > org.telegram.messenger.g0.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        sb sbVar2 = this.h;
                        if (sbVar2 != null && this.i1 == 1) {
                            this.f = (long) Utilities.i(this.f - ((x10 / this.v1) * min), sbVar2.e - min, 0.0f);
                            invalidate();
                            if (!this.n1) {
                                this.o1 = 1.0f;
                            }
                            this.n1 = true;
                            this.m1 = false;
                        } else if (sbVar2 == null || !((i11 = this.i1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.i1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f23 = (min / this.S) * (x10 / this.v1);
                                if (i15 == 6) {
                                    float g10 = this.U - (g() / this.S);
                                    float max = Math.max(0L, this.f - this.R);
                                    float f24 = this.S;
                                    float f25 = max / f24;
                                    sb sbVar3 = this.h;
                                    if (sbVar3 != null) {
                                        B = org.telegram.ui.Cells.c0.x((sbVar3.g * sbVar3.e) + this.f, this.R, f24, f25);
                                    } else {
                                        sb sbVar4 = this.w;
                                        if (sbVar4 != null) {
                                            B = org.telegram.ui.Cells.c0.x((sbVar4.g * sbVar4.e) + this.f, this.R, f24, f25);
                                        } else if (this.F) {
                                            B = org.telegram.ui.Cells.c0.x((this.K * this.I) + this.f, this.R, f24, f25);
                                        } else {
                                            B = org.telegram.ui.Cells.c0.B(f(), this.S, this.U, f25);
                                            if (!this.p1 && f23 < 0.0f && this.T <= this.U - (f() / this.S)) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f26 = this.T;
                                    float i16 = Utilities.i(f26 + f23, g10, B);
                                    this.T = i16;
                                    if (Math.abs(f26 - i16) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    rb rbVar5 = this.a;
                                    if (rbVar5 != null) {
                                        rbVar5.y0(this.R + ((long) (this.T * this.S)));
                                    }
                                    rb rbVar6 = this.a;
                                    if (rbVar6 != null) {
                                        rbVar6.j0(this.T);
                                    }
                                } else if (i15 == 7) {
                                    float min2 = Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S);
                                    float f27 = this.T;
                                    float g11 = g();
                                    float f28 = this.S;
                                    float f29 = (g11 / f28) + f27;
                                    sb sbVar5 = this.h;
                                    if (sbVar5 != null) {
                                        f11 = Math.min(min2, (((sbVar5.h * sbVar5.e) + this.f) - this.R) / f28);
                                    } else {
                                        sb sbVar6 = this.w;
                                        if (sbVar6 != null) {
                                            f11 = Math.min(min2, (((sbVar6.h * sbVar6.e) + this.f) - this.R) / f28);
                                        } else if (this.F) {
                                            f11 = Math.min(min2, (((this.L * this.I) + this.f) - this.R) / f28);
                                        } else {
                                            f11 = org.telegram.ui.Cells.c0.f(f(), this.S, this.T, min2);
                                            if (!this.p1 && f23 > 0.0f) {
                                                if (this.U >= (f() / this.S) + this.T) {
                                                    this.i1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f30 = this.U;
                                    float i17 = Utilities.i(f30 + f23, f11, f29);
                                    this.U = i17;
                                    if (Math.abs(f30 - i17) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    rb rbVar7 = this.a;
                                    if (rbVar7 != null) {
                                        rbVar7.d0(this.U);
                                    }
                                }
                                if (this.i1 == 8) {
                                    float min3 = f23 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S) - this.U), f23) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.R) / this.S) - this.T), f23);
                                    float f31 = this.T + min3;
                                    this.T = f31;
                                    this.U += min3;
                                    rb rbVar8 = this.a;
                                    if (rbVar8 != null) {
                                        rbVar8.j0(f31);
                                        this.a.y0(this.R + ((long) (this.T * this.S)));
                                        this.a.d0(this.U);
                                    }
                                    rb rbVar9 = this.a;
                                    if (rbVar9 != null) {
                                        rbVar9.D(true);
                                    }
                                }
                                if (this.h == null && !this.F) {
                                    this.e = (long) (this.T * this.S);
                                    rb rbVar10 = this.a;
                                    if (rbVar10 != null) {
                                        rbVar10.D(true);
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
                                float f32 = (min / this.I) * (x10 / this.v1);
                                if (i15 == 10) {
                                    float g12 = this.L - (g() / this.I);
                                    float max2 = Math.max(0L, this.f - this.J);
                                    float f33 = this.I;
                                    float f34 = max2 / f33;
                                    sb sbVar7 = this.h;
                                    if (sbVar7 != null) {
                                        B2 = org.telegram.ui.Cells.c0.x((sbVar7.g * sbVar7.e) + this.f, this.J, f33, f34);
                                    } else {
                                        sb sbVar8 = this.w;
                                        if (sbVar8 != null) {
                                            B2 = org.telegram.ui.Cells.c0.x((sbVar8.g * sbVar8.e) + this.f, this.J, f33, f34);
                                        } else {
                                            B2 = org.telegram.ui.Cells.c0.B(f(), this.I, this.L, f34);
                                            if (!this.p1 && f32 < 0.0f && this.K <= this.L - (f() / this.I)) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f35 = this.K;
                                    float i18 = Utilities.i(f35 + f32, g12, B2);
                                    this.K = i18;
                                    if (Math.abs(f35 - i18) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    rb rbVar11 = this.a;
                                    if (rbVar11 != null) {
                                        rbVar11.U(this.J + ((long) (this.K * this.I)));
                                    }
                                    rb rbVar12 = this.a;
                                    if (rbVar12 != null) {
                                        rbVar12.z(this.K);
                                    }
                                } else if (i15 == 11) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I);
                                    float f36 = this.K;
                                    float g13 = g();
                                    float f37 = this.I;
                                    float f38 = (g13 / f37) + f36;
                                    sb sbVar9 = this.h;
                                    if (sbVar9 != null) {
                                        min4 = Math.min(min4, (((sbVar9.h * sbVar9.e) + this.f) - this.J) / f37);
                                    }
                                    sb sbVar10 = this.w;
                                    if (sbVar10 != null) {
                                        f12 = Math.min(min4, (((sbVar10.h * sbVar10.e) + this.f) - this.J) / this.I);
                                    } else {
                                        f12 = org.telegram.ui.Cells.c0.f(f(), this.I, this.K, min4);
                                        if (!this.p1 && f32 > 0.0f) {
                                            if (this.L >= (f() / this.I) + this.K) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f39 = this.L;
                                    float i19 = Utilities.i(f39 + f32, f12, f38);
                                    this.L = i19;
                                    if (Math.abs(f39 - i19) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    rb rbVar13 = this.a;
                                    if (rbVar13 != null) {
                                        rbVar13.r0(this.L);
                                    }
                                }
                                if (this.i1 == 12) {
                                    float min5 = f32 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I) - this.L, f32) : Math.max((Math.max(0L, this.f - this.J) / this.I) - this.K, f32);
                                    float f40 = this.K + min5;
                                    this.K = f40;
                                    this.L += min5;
                                    rb rbVar14 = this.a;
                                    if (rbVar14 != null) {
                                        rbVar14.z(f40);
                                        this.a.U(this.J + ((long) (this.K * this.I)));
                                        this.a.r0(this.L);
                                    }
                                    rb rbVar15 = this.a;
                                    if (rbVar15 != null) {
                                        rbVar15.D(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.K * this.I);
                                    rb rbVar16 = this.a;
                                    if (rbVar16 != null) {
                                        rbVar16.D(true);
                                        z13 = false;
                                        this.a.p(this.e, false);
                                        invalidate();
                                        if (!this.n1) {
                                            this.o1 = 1.0f;
                                        }
                                        this.n1 = true;
                                        this.m1 = z13;
                                    }
                                }
                                z13 = false;
                                invalidate();
                                if (!this.n1) {
                                }
                                this.n1 = true;
                                this.m1 = z13;
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
                                            i((sb) arrayList.get(this.j1), (x10 / this.v1) * min);
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = true;
                                            this.m1 = false;
                                        } else if (this.m1) {
                                            m(currentTimeMillis - this.f1 < 350, motionEvent.getX());
                                            if (this.n1 || (rbVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                rbVar2.D(true);
                                            }
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = z14;
                                        }
                                    }
                                } else {
                                    sb sbVar11 = (sb) arrayList.get(this.j1);
                                    float f41 = (min / sbVar11.e) * (x10 / this.v1);
                                    int i23 = this.i1;
                                    if (i23 == 13) {
                                        float g14 = sbVar11.h - (g() / sbVar11.e);
                                        float max3 = Math.max(0L, this.f - sbVar11.f) / sbVar11.e;
                                        if (sbVar11 == this.w) {
                                            f13 = f41;
                                            max3 = org.telegram.ui.Cells.c0.B(f(), sbVar11.e, sbVar11.h, max3);
                                            if (!this.p1 && f13 < 0.0f) {
                                                f14 = 0.0f;
                                                if (sbVar11.g <= sbVar11.h - (f() / sbVar11.e)) {
                                                    this.i1 = 15;
                                                }
                                                f15 = sbVar11.g;
                                                i10 = Utilities.i(f15 + f13, g14, max3);
                                                sbVar11.g = i10;
                                                if (Math.abs(f15 - i10) > 0.01f) {
                                                    this.p1 = true;
                                                }
                                                rbVar3 = this.a;
                                                if (rbVar3 != null) {
                                                    rbVar3.u0(sbVar11.a, sbVar11.f);
                                                }
                                                rbVar4 = this.a;
                                                if (rbVar4 != null) {
                                                    rbVar4.b0(sbVar11.g, sbVar11.a);
                                                }
                                            }
                                        } else {
                                            f13 = f41;
                                        }
                                        f14 = 0.0f;
                                        f15 = sbVar11.g;
                                        i10 = Utilities.i(f15 + f13, g14, max3);
                                        sbVar11.g = i10;
                                        if (Math.abs(f15 - i10) > 0.01f) {
                                        }
                                        rbVar3 = this.a;
                                        if (rbVar3 != null) {
                                        }
                                        rbVar4 = this.a;
                                        if (rbVar4 != null) {
                                        }
                                    } else {
                                        f13 = f41;
                                        f14 = 0.0f;
                                        if (i23 == 14) {
                                            float min6 = Math.min(1.0f, Math.max(0L, (this.f - sbVar11.f) + min) / sbVar11.e);
                                            float g15 = (g() / sbVar11.e) + sbVar11.g;
                                            if (sbVar11 == this.w) {
                                                min6 = org.telegram.ui.Cells.c0.f(f(), sbVar11.e, sbVar11.g, min6);
                                                if (!this.p1 && f13 > 0.0f) {
                                                    if (sbVar11.h >= (f() / sbVar11.e) + sbVar11.g) {
                                                        this.i1 = 15;
                                                    }
                                                }
                                            }
                                            float f42 = sbVar11.h;
                                            float i24 = Utilities.i(f42 + f13, min6, g15);
                                            sbVar11.h = i24;
                                            if (Math.abs(f42 - i24) > 0.01f) {
                                                this.p1 = true;
                                            }
                                            rb rbVar17 = this.a;
                                            if (rbVar17 != null) {
                                                rbVar17.n0(sbVar11.h, sbVar11.a);
                                            }
                                        }
                                    }
                                    if (this.i1 == 15) {
                                        float min7 = f13 > f14 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - sbVar11.f) + min) / sbVar11.e) - sbVar11.h, f13) : Math.max((Math.max(0L, this.f - sbVar11.f) / sbVar11.e) - sbVar11.g, f13);
                                        float f43 = sbVar11.g + min7;
                                        sbVar11.g = f43;
                                        sbVar11.h += min7;
                                        rb rbVar18 = this.a;
                                        if (rbVar18 != null) {
                                            rbVar18.b0(f43, sbVar11.a);
                                            this.a.u0(sbVar11.a, sbVar11.f);
                                            this.a.n0(sbVar11.h, sbVar11.a);
                                        }
                                        rb rbVar19 = this.a;
                                        if (rbVar19 != null) {
                                            z15 = true;
                                            rbVar19.D(true);
                                            invalidate();
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = z15;
                                            this.m1 = false;
                                        }
                                    }
                                    z15 = true;
                                    invalidate();
                                    if (!this.n1) {
                                    }
                                    this.n1 = z15;
                                    this.m1 = false;
                                }
                            }
                        } else {
                            float f44 = sbVar2.e;
                            float f45 = (min / f44) * (x10 / this.v1);
                            if (i11 == 2) {
                                sbVar2.g = Utilities.i(sbVar2.g + f45, sbVar2.h - (1000.0f / f44), 0.0f);
                                rb rbVar20 = this.a;
                                if (rbVar20 != null) {
                                    rbVar20.x(false, this.h.g);
                                }
                                sb sbVar12 = this.h;
                                float f46 = sbVar12.h - sbVar12.g;
                                float f47 = f();
                                sb sbVar13 = this.h;
                                if (f46 > f47 / sbVar13.e) {
                                    sbVar13.h = org.telegram.ui.Cells.c0.f(f(), this.h.e, sbVar13.g, 1.0f);
                                    rb rbVar21 = this.a;
                                    if (rbVar21 != null) {
                                        rbVar21.o0(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                sbVar2.h = Utilities.i(sbVar2.h + f45, 1.0f, (1000.0f / f44) + sbVar2.g);
                                rb rbVar22 = this.a;
                                if (rbVar22 != null) {
                                    rbVar22.o0(this.h.h);
                                }
                                sb sbVar14 = this.h;
                                float f48 = sbVar14.h - sbVar14.g;
                                float f49 = f();
                                sb sbVar15 = this.h;
                                if (f48 > f49 / sbVar15.e) {
                                    sbVar15.g = org.telegram.ui.Cells.c0.B(f(), this.h.e, sbVar15.h, 0.0f);
                                    rb rbVar23 = this.a;
                                    if (rbVar23 != null) {
                                        rbVar23.x(false, this.h.g);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min8 = f45 > 0.0f ? Math.min(1.0f - sbVar2.h, f45) : Math.max(-sbVar2.g, f45);
                                sb sbVar16 = this.h;
                                float f50 = sbVar16.g + min8;
                                sbVar16.g = f50;
                                sbVar16.h += min8;
                                rb rbVar24 = this.a;
                                if (rbVar24 != null) {
                                    rbVar24.x(false, f50);
                                    this.a.o0(this.h.h);
                                }
                            }
                            float f51 = this.e;
                            sb sbVar17 = this.h;
                            float f52 = sbVar17.e;
                            float f53 = f51 / f52;
                            float f54 = sbVar17.g;
                            if (f53 < f54 || f53 > sbVar17.h) {
                                long j15 = (long) (f54 * f52);
                                this.e = j15;
                                rb rbVar25 = this.a;
                                if (rbVar25 != null) {
                                    rbVar25.p(j15, false);
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
                        org.telegram.messenger.g0.r(s1Var);
                    }
                    int i25 = this.i1;
                    if ((i25 == 1 || i25 == 5 || i25 == 8) && (velocityTracker6 = this.q1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(s1Var);
                    ll0Var.a();
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
                                    float f55 = i27;
                                    float f56 = min9;
                                    float f57 = this.v1;
                                    int i28 = (int) (((this.f / f56) * f57) + f55);
                                    int c10 = (int) com.google.android.gms.internal.vision.e2.c(this.h.e - min9, f56, f57, f55);
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
                                    float f58 = i29;
                                    float f59 = min10;
                                    float f60 = this.v1;
                                    int i30 = (int) (((this.f / f59) * f60) + f58);
                                    int c11 = (int) com.google.android.gms.internal.vision.e2.c(this.h.e - min10, f59, f60, f58);
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
                                    sb sbVar18 = this.h;
                                    if (sbVar18 != null) {
                                        float f61 = sbVar18.h;
                                        float f62 = sbVar18.e;
                                        j11 = this.S;
                                        j12 = (long) ((f61 * f62) - 0);
                                        f10 = sbVar18.g * f62;
                                    } else if (this.F) {
                                        float f63 = this.L;
                                        float f64 = this.I;
                                        j11 = this.S;
                                        j12 = (long) ((f63 * f64) - 0);
                                        f10 = this.K * f64;
                                    } else {
                                        j3 = -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j10 = 0;
                                        this.s1 = z12;
                                        this.t1 = i31;
                                        float f65 = this.z1 + this.y1;
                                        float f66 = this.v1;
                                        this.X0.c(i31, 0, xVelocity3, 0, (int) (((j3 / min11) * f66) + f65), (int) com.google.android.gms.internal.vision.e2.c(j10, min11, f66, f65), 0, 0);
                                        z10 = false;
                                    }
                                    j3 = (long) (f10 - j11);
                                    j10 = j12;
                                    z12 = true;
                                    this.s1 = z12;
                                    this.t1 = i31;
                                    float f652 = this.z1 + this.y1;
                                    float f662 = this.v1;
                                    this.X0.c(i31, 0, xVelocity3, 0, (int) (((j3 / min11) * f662) + f652), (int) com.google.android.gms.internal.vision.e2.c(j10, min11, f662, f652), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i26 == 9 || (i26 == 12 && !this.n1)) && this.H && (velocityTracker3 = this.q1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity4) > org.telegram.messenger.g0.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i32 = (int) (((this.J / min12) * this.v1) + this.z1 + this.y1);
                                    sb sbVar19 = this.h;
                                    if (sbVar19 != null) {
                                        float f67 = sbVar19.h;
                                        float f68 = sbVar19.e;
                                        j13 = (long) ((sbVar19.g * f68) - this.I);
                                        j14 = (long) ((f67 * f68) - 0);
                                    } else {
                                        j13 = -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j14 = 0;
                                    }
                                    this.s1 = true;
                                    this.t1 = i32;
                                    float f69 = this.z1 + this.y1;
                                    float f70 = this.v1;
                                    this.X0.c(i32, 0, xVelocity4, 0, (int) (((j13 / min12) * f70) + f69), (int) com.google.android.gms.internal.vision.e2.c(j14, min12, f70, f69), 0, 0);
                                    z10 = false;
                                }
                            }
                            e4Var = this.e1;
                            if (e4Var != null) {
                                org.telegram.messenger.g0.r(e4Var);
                                this.e1 = null;
                            }
                            if (this.n1 || !z10 || (rbVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                rbVar.D(false);
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
                                            this.a.e(((sb) arrayList.get(this.l1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i33 == 2 && !this.Q) {
                                    this.Q = true;
                                    this.H = false;
                                    rb rbVar26 = this.a;
                                    if (rbVar26 != null) {
                                        rbVar26.X(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 && !this.H) {
                                    this.Q = false;
                                    this.H = true;
                                    rb rbVar27 = this.a;
                                    if (rbVar27 != null) {
                                        rbVar27.X(true);
                                    }
                                    invalidate();
                                } else if (i33 != 2 && this.Q) {
                                    this.Q = false;
                                    this.H = false;
                                    rb rbVar28 = this.a;
                                    if (rbVar28 != null) {
                                        rbVar28.X(false);
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
                                    rb rbVar29 = this.a;
                                    if (rbVar29 != null) {
                                        rbVar29.X(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i36 = (long) Utilities.i(((((motionEvent.getX() - this.z1) - this.y1) / this.v1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                sb sbVar20 = this.h;
                                float f71 = sbVar20.h - sbVar20.g;
                                sbVar20.g = (1.0f - f71) * (i36 / getBaseDuration());
                                sb sbVar21 = this.h;
                                float f72 = sbVar21.g;
                                sbVar21.h = f71 + f72;
                                rb rbVar30 = this.a;
                                if (rbVar30 != null) {
                                    rbVar30.x(true, f72);
                                    this.a.o0(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.k1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    e4Var = this.e1;
                    if (e4Var != null) {
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
                this.b0 = new qb(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        a3.c cVar = new a3.c(29);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, cVar);
        sb sbVar = arrayList.isEmpty() ? null : (sb) arrayList.get(0);
        this.w = sbVar;
        if (sbVar != null) {
            long j3 = sbVar.f;
        }
    }

    public void setCollage(ArrayList<x7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        vb vbVar;
        int i7 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            sb sbVar = (sb) arrayList2.get(i7);
            if (sbVar != null && (vbVar = sbVar.c) != null) {
                vbVar.b();
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
            qb qbVar = (qb) arrayList3.get(i10);
            if (qbVar != null) {
                qbVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                x7 x7Var = arrayList.get(i11);
                if (x7Var.K) {
                    sb sbVar2 = new sb(this);
                    sbVar2.a = i11;
                    sbVar2.b = false;
                    sbVar2.d = x7Var.L.getAbsolutePath();
                    sbVar2.e = x7Var.h0;
                    sbVar2.f = x7Var.X;
                    sbVar2.i = x7Var.P;
                    sbVar2.g = x7Var.V;
                    sbVar2.h = x7Var.W;
                    sb.a(sbVar2, false);
                    sb.b(sbVar2);
                    arrayList2.add(sbVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(rb rbVar) {
        this.a = rbVar;
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
        sb sbVar = this.h;
        if (sbVar != null) {
            if (j3 < this.e) {
                float f10 = j3;
                long j10 = sbVar.e;
                if (f10 <= (j10 * sbVar.g) + 240.0f) {
                }
            }
        }
        if (this.O && !this.F && sbVar == null) {
            if (j3 < this.e) {
                float f11 = j3;
                long j11 = this.S;
                if (f11 <= (j11 * this.T) + 240.0f) {
                }
            }
        }
        if (this.F && sbVar == null) {
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
        sb sbVar = this.h;
        if (sbVar == null) {
            return;
        }
        sbVar.g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        sb sbVar = this.h;
        if (sbVar == null) {
            return;
        }
        sbVar.h = f10;
        invalidate();
    }
}
