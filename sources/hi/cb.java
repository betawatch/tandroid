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
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
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
    public final ll0 X0;
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
    public final org.telegram.ui.Components.d6 c1;
    public Runnable d;
    public final org.telegram.ui.Components.d6 d0;
    public long d1;
    public long e;
    public final org.telegram.ui.Components.d6 e0;
    public bi.c4 e1;
    public long f;
    public final org.telegram.ui.Components.d6 f0;
    public long f1;
    public final org.telegram.ui.Components.d6 g0;
    public long g1;
    public xa h;
    public final org.telegram.ui.Components.d6 h0;
    public float h1;
    public final org.telegram.ui.Components.d6 i0;
    public int i1;
    public final org.telegram.ui.Components.d6 j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final org.telegram.ui.Components.ca l0;
    public int l1;
    public final org.telegram.ui.Components.ga m0;
    public boolean m1;
    public int n;
    public final org.telegram.ui.Components.ga n0;
    public boolean n1;
    public final org.telegram.ui.Components.ga o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final xy0 r0;
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

    public cb(Context context, ViewGroup viewGroup, ea eaVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        nr nrVar = nr.h;
        this.d0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.e0 = new org.telegram.ui.Components.d6(this, 360L, nrVar);
        this.f0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.g0 = new org.telegram.ui.Components.d6(this, 360L, nrVar);
        this.h0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.i0 = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        this.j0 = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
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
        this.X0 = new ll0(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new org.telegram.ui.Components.d6(0.0f, this, 0L, 340L, nrVar);
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
        this.r0 = new xy0(hd.N0(2131744213, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = caVar;
        this.m0 = new org.telegram.ui.Components.ga(caVar, this, 0, false);
        this.n0 = new org.telegram.ui.Components.ga(caVar, this, 3, false);
        this.o0 = new org.telegram.ui.Components.ga(caVar, this, 4, false);
        this.Z0 = new ai.b(this, viewGroup, h6Var, caVar, eaVar, 16);
    }

    public static void a(final cb cbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar, View view) {
        int i7;
        ArrayList arrayList = cbVar.s;
        int i10 = cbVar.k1;
        final int i11 = 0;
        final int i12 = 1;
        final int i13 = 2;
        try {
            if (i10 == 2 && cbVar.O) {
                w6 w6Var = new w6(cbVar.getContext(), 0);
                w6Var.b = 0.0f;
                w6Var.c = 1.5f;
                w6Var.d(cbVar.W);
                w6Var.h = new y10(cbVar) { // from class: hi.ua
                    public final /* synthetic */ cb b;

                    {
                        this.b = cbVar;
                    }

                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i11) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cb cbVar2 = this.b;
                                cbVar2.W = floatValue;
                                wa waVar = cbVar2.a;
                                if (waVar != null) {
                                    waVar.F(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cb cbVar3 = this.b;
                                cbVar3.M = floatValue2;
                                wa waVar2 = cbVar3.a;
                                if (waVar2 != null) {
                                    waVar2.t(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cb cbVar4 = this.b;
                                cbVar4.h.i = f10.floatValue();
                                wa waVar3 = cbVar4.a;
                                if (waVar3 != null) {
                                    waVar3.Q0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration());
                int i14 = cbVar.w1;
                int i15 = cbVar.z1;
                int i16 = cbVar.y1;
                float min2 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.g0.T1(cbVar.U, 1.0f, cbVar.g0.c) * cbVar.S) + (cbVar.R - cbVar.f)) / min) * cbVar.v1) + i15 + i16);
                a70 G = a70.G(viewGroup, h6Var, cbVar);
                G.q(w6Var);
                G.o(true);
                G.c(R.drawable.msg_delete, hd.N0(2131744477, null), new ta(cbVar, 1), false);
                G.W(5);
                G.X = true;
                G.b0((-(cbVar.w1 - min2)) + org.telegram.messenger.g0.L(18.0f), cbVar.G0.top);
                G.a0();
                G.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && cbVar.F) {
                w6 w6Var2 = new w6(cbVar.getContext(), 0);
                w6Var2.b = 0.0f;
                w6Var2.c = 1.5f;
                w6Var2.d(cbVar.M);
                w6Var2.h = new y10(cbVar) { // from class: hi.ua
                    public final /* synthetic */ cb b;

                    {
                        this.b = cbVar;
                    }

                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cb cbVar2 = this.b;
                                cbVar2.W = floatValue;
                                wa waVar = cbVar2.a;
                                if (waVar != null) {
                                    waVar.F(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cb cbVar3 = this.b;
                                cbVar3.M = floatValue2;
                                wa waVar2 = cbVar3.a;
                                if (waVar2 != null) {
                                    waVar2.t(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cb cbVar4 = this.b;
                                cbVar4.h.i = f10.floatValue();
                                wa waVar3 = cbVar4.a;
                                if (waVar3 != null) {
                                    waVar3.Q0(f10.floatValue());
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
                a70 G2 = a70.G(viewGroup, h6Var, cbVar);
                G2.q(w6Var2);
                G2.o(true);
                G2.c(R.drawable.msg_delete, hd.N0(2131744244, null), new ta(cbVar, 2), false);
                G2.W(5);
                G2.X = true;
                G2.b0((-(cbVar.w1 - min4)) + org.telegram.messenger.g0.L(18.0f), cbVar.y0.top);
                G2.a0();
                G2.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && cbVar.h != null) {
                w6 w6Var3 = new w6(cbVar.getContext(), 0);
                w6Var3.b = 0.0f;
                w6Var3.c = 1.5f;
                w6Var3.d(cbVar.h.i);
                w6Var3.h = new y10(cbVar) { // from class: hi.ua
                    public final /* synthetic */ cb b;

                    {
                        this.b = cbVar;
                    }

                    @Override // org.telegram.messenger.y10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i13) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cb cbVar2 = this.b;
                                cbVar2.W = floatValue;
                                wa waVar = cbVar2.a;
                                if (waVar != null) {
                                    waVar.F(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cb cbVar3 = this.b;
                                cbVar3.M = floatValue2;
                                wa waVar2 = cbVar3.a;
                                if (waVar2 != null) {
                                    waVar2.t(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cb cbVar4 = this.b;
                                cbVar4.h.i = f10.floatValue();
                                wa waVar3 = cbVar4.a;
                                if (waVar3 != null) {
                                    waVar3.Q0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                a70 G3 = a70.G(viewGroup, h6Var, cbVar);
                G3.q(w6Var3);
                G3.W(5);
                G3.X = true;
                G3.b0(org.telegram.messenger.g0.L(18.0f), cbVar.u0.top);
                G3.a0();
                G3.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
            } else {
                if (i10 != 3 || (i7 = cbVar.l1) < 0 || i7 >= arrayList.size()) {
                    return;
                }
                xa xaVar = (xa) arrayList.get(cbVar.l1);
                w6 w6Var4 = new w6(cbVar.getContext(), 0);
                w6Var4.b = 0.0f;
                w6Var4.c = 1.5f;
                w6Var4.d(xaVar.i);
                w6Var4.h = new ai.y1(22, cbVar, xaVar);
                a70 G4 = a70.G(viewGroup, h6Var, cbVar);
                G4.q(w6Var4);
                G4.W(5);
                G4.X = true;
                G4.b0(org.telegram.messenger.g0.L(18.0f), xaVar.j.top);
                G4.a0();
                G4.S(caVar, -view.getX(), -view.getY());
                cbVar.performHapticFeedback(0, 1);
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
        ll0 ll0Var = this.X0;
        if (!ll0Var.b()) {
            if (this.s1) {
                this.s1 = false;
                wa waVar = this.a;
                if (waVar != null) {
                    waVar.D0(false);
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
        org.telegram.ui.Components.ga gaVar;
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
        org.telegram.ui.Components.ga gaVar2;
        float c11;
        float f52;
        float f53;
        Paint paint6;
        org.telegram.ui.Components.ga gaVar3;
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
        org.telegram.ui.Components.ga gaVar4;
        char c12;
        boolean z16;
        cb cbVar = this;
        RectF rectF5 = cbVar.u0;
        RectF rectF6 = cbVar.y0;
        Path path2 = cbVar.x0;
        ArrayList arrayList18 = cbVar.r;
        Drawable drawable = cbVar.s0;
        org.telegram.ui.Components.ca caVar = cbVar.l0;
        RectF rectF7 = cbVar.G0;
        ArrayList arrayList19 = cbVar.s;
        RectF rectF8 = cbVar.p0;
        org.telegram.ui.Components.ga gaVar5 = cbVar.m0;
        Paint c13 = gaVar5.c(1.0f);
        float d2 = cbVar.j0.d(cbVar.k0);
        long min = Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration());
        if (d2 < 1.0f) {
            rectF8.set(cbVar.z1, (cbVar.x1 - cbVar.A1) - org.telegram.messenger.g0.L(28.0f), cbVar.w1 - cbVar.z1, cbVar.x1 - cbVar.A1);
            cbVar.q0.rewind();
            cbVar.q0.addRoundRect(rectF8, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF8, (int) ((1.0f - d2) * 255.0f), 31);
            canvas.clipPath(cbVar.q0);
            if (caVar.c()) {
                gaVar5.a(canvas);
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
            if (arrayList18.isEmpty() || !caVar.c()) {
                paint8 = paint7;
                rectF = rectF5;
                gaVar4 = gaVar5;
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
                    drawable.setBounds(centerX, org.telegram.ui.Cells.c0.A(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.c0.j(2, centerY, drawable));
                    drawable.setAlpha(ls.V2);
                    drawable.draw(canvas);
                    xy0 xy0Var = cbVar.r0;
                    float centerX2 = (rectF8.centerX() - g10) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
                    float f67 = centerY;
                    paint = paint8;
                    rectF2 = rectF7;
                    arrayList = arrayList19;
                    gaVar = gaVar4;
                    f10 = 0.4f;
                    xy0Var.c(centerX2, f67, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float e10 = cbVar.i0.e(false, bb.c(arrayList18));
                rectF8 = rectF8;
                paint8 = paint7;
                rectF = rectF5;
                j3 = min;
                gaVar4 = gaVar5;
                cbVar.t0.a((((cbVar.R - cbVar.f) / min) * cbVar.v1) + cbVar.z1 + cbVar.y1, rectF8.left, rectF8.right, org.telegram.messenger.g0.L(28.0f), e10, rectF8.bottom, arrayList18);
                c12 = 31;
                canvas.saveLayerAlpha(rectF8, ls.n1, 31);
                canvas.clipPath(cbVar.t0);
                cbVar.o0.a(canvas);
                canvas.restore();
            }
            z16 = false;
            float g102 = ((cbVar.r0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF8.centerX() - g102);
            int centerY2 = (int) rectF8.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.Cells.c0.A(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.c0.j(2, centerY2, drawable));
            drawable.setAlpha(ls.V2);
            drawable.draw(canvas);
            xy0 xy0Var2 = cbVar.r0;
            float centerX22 = (rectF8.centerX() - g102) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
            float f672 = centerY2;
            paint = paint8;
            rectF2 = rectF7;
            arrayList = arrayList19;
            gaVar = gaVar4;
            f10 = 0.4f;
            xy0Var2.c(centerX22, f672, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF5;
            j3 = min;
            paint = c13;
            arrayList = arrayList19;
            f10 = 0.4f;
            gaVar = gaVar5;
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
                        if (caVar.c()) {
                            gaVar.a(canvas2);
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
                    org.telegram.ui.Components.d6 d6Var = xaVar6.k;
                    float f90 = f12;
                    RectF rectF11 = xaVar6.j;
                    float d11 = d6Var.d((cbVar.Q || cbVar.H || cbVar.n != i21) ? false : true);
                    if (xaVar6 != cbVar.w) {
                        i15 = i21;
                        path = path2;
                        float f91 = j12;
                        float T12 = ((((org.telegram.messenger.g0.T1(xaVar6.g, f15, d11) * xaVar6.e) + (xaVar6.f - cbVar.f)) / f91) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                        rectF4 = rectF6;
                        paint5 = paint;
                        c11 = (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(xaVar6.h, f17, d11), xaVar6.e, xaVar6.f - cbVar.f, f91) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                        gaVar2 = gaVar;
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
                        gaVar2 = gaVar;
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
                    float g11 = org.telegram.ui.Cells.c0.g(f98, f99, f97, d11, f24);
                    float g12 = org.telegram.ui.Cells.c0.g(xaVar6.h, f99, f97, d11, f23);
                    cbVar.y.rewind();
                    cbVar.y.addRoundRect(rectF11, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(cbVar.y);
                    ab abVar2 = xaVar6.c;
                    if (abVar2 != null) {
                        long j15 = xaVar6.e;
                        if (j15 <= 0) {
                            f52 = f89;
                            f19 = g12;
                            f55 = 0.0f;
                        } else {
                            f52 = f89;
                            f19 = g12;
                            f55 = (((xaVar6.f - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                        }
                        float f100 = cbVar.y1;
                        float f101 = f55 - f100;
                        if (j15 <= 0) {
                            f56 = f101;
                            f57 = 0.0f;
                        } else {
                            f56 = f101;
                            f57 = ((((xaVar6.f + j15) - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + r6;
                        }
                        float f102 = f57 + f100;
                        int i22 = abVar2.f;
                        float f103 = i22;
                        int max2 = (int) Math.max(0.0d, Math.floor((f56 - ((((xaVar6.f - cbVar.f) / j12) * cbVar.v1) + (cbVar.z1 + cbVar.y1))) / f103));
                        int min3 = (int) Math.min(xaVar6.c.c, Math.ceil((f102 - f56) / f103) + 1.0d);
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
                            gaVar3 = gaVar2;
                        } else {
                            if (caVar.c()) {
                                gaVar3 = gaVar2;
                                gaVar3.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else {
                                gaVar3 = gaVar2;
                                if (paint5 == null) {
                                    canvas2.drawColor(TLObject.FLAG_30);
                                } else {
                                    paint6 = paint5;
                                    canvas2.drawRect(rectF11, paint6);
                                    f58 = f103;
                                    canvas2.drawColor(855638016);
                                    if (i22 != 0) {
                                        while (max2 < Math.min(arrayList9.size(), min3)) {
                                            arrayList10 = xaVar6.c.d;
                                            za zaVar2 = (za) arrayList10.get(max2);
                                            int i25 = min3;
                                            if (zaVar2.a != null) {
                                                f59 = g11;
                                                f60 = W1;
                                                z14 = z20;
                                                cbVar.x.setAlpha((int) (zaVar2.b.e(false, 1.0f) * 255.0f));
                                                canvas2.drawBitmap(zaVar2.a, f56, i23 - ((int) ((r4.getHeight() - f60) / f16)), cbVar.x);
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
                                        xaVar6.c.c();
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
                        gaVar3 = gaVar2;
                        f54 = W1;
                    }
                    cbVar.E.rewind();
                    if (!cbVar.Y0) {
                        RectF rectF12 = org.telegram.messenger.g0.P;
                        int i26 = cbVar.z1;
                        int i27 = cbVar.y1;
                        float f104 = i26 + i27;
                        float f105 = xaVar6.g;
                        int i28 = i27;
                        float f106 = xaVar6.e;
                        float f107 = f105 * f106;
                        float f108 = cbVar.f;
                        float f109 = f107 - f108;
                        float f110 = xaVar6.f;
                        float f111 = f109 + f110;
                        float f112 = j12;
                        float f113 = f111 / f112;
                        float f114 = cbVar.v1;
                        float f115 = ((f113 * f114) + f104) - (f105 <= 0.0f ? i28 : 0);
                        float f116 = rectF11.top;
                        float f117 = xaVar6.h;
                        float f118 = (((((f106 * f117) - f108) + f110) / f112) * f114) + f104;
                        if (f117 < 1.0f) {
                            i28 = 0;
                        }
                        rectF12.set(f115, f116, f118 + i28, rectF11.bottom);
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
                    gaVar = gaVar3;
                    f89 = f52 - ((f18 * 1.0f) + f54);
                    i21 = i15 + 1;
                }
                f69 = f89;
                f25 = 1.0f;
            }
            RectF rectF13 = rectF6;
            Path path3 = path2;
            org.telegram.ui.Components.ga gaVar6 = gaVar;
            Paint paint9 = paint;
            ArrayList arrayList21 = arrayList2;
            float f119 = f12;
            float d12 = cbVar.d0.d(cbVar.F);
            float d13 = cbVar.e0.d(cbVar.F && cbVar.H);
            float roundHeight = cbVar.getRoundHeight() * d12;
            float f120 = ((cbVar.h == null && !cbVar.O && arrayList21.isEmpty()) ? 1.0f : d13) * d12;
            if (d12 > 0.0f) {
                long j16 = cbVar.J;
                float f121 = j16;
                float f122 = cbVar.K;
                f27 = f25;
                float f123 = cbVar.I;
                float g13 = org.telegram.ui.Cells.c0.g(f122, f123, f121, f120, f24);
                float g14 = org.telegram.ui.Cells.c0.g(cbVar.L, f123, f121, f120, f23);
                if (cbVar.h != null) {
                    float f124 = j12;
                    f45 = ((((org.telegram.messenger.g0.T1(f122, 0.0f, d13) * cbVar.I) + (j16 - cbVar.f)) / f124) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                    f44 = g14;
                    c10 = (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(cbVar.L, 1.0f, d13), cbVar.I, cbVar.J - cbVar.f, f124) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                } else {
                    f44 = g14;
                    float f125 = cbVar.z1 + cbVar.y1;
                    long j17 = j16 - cbVar.f;
                    float f126 = j12;
                    float f127 = cbVar.v1;
                    float f128 = ((j17 / f126) * f127) + f125;
                    c10 = com.google.android.gms.internal.vision.e2.c(j17 + r12, f126, f127, f125);
                    f45 = f128;
                }
                float f129 = cbVar.y1;
                rectF13.set(f45 - f129, f69 - roundHeight, c10 + f129, f69);
                float f130 = f69 - ((f18 * d12) + roundHeight);
                f22 = (rectF13.top * f120) + f22;
                f20 = (rectF13.bottom * f120) + f20;
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
                    float f131 = cbVar.y1;
                    float f132 = f48 - f131;
                    if (j18 <= 0) {
                        f49 = f132;
                        f50 = 0.0f;
                    } else {
                        f49 = f132;
                        f50 = cbVar.z1 + r10 + ((((cbVar.J + j13) - cbVar.f) / j12) * cbVar.v1);
                    }
                    float f133 = f50 + f131;
                    int i29 = abVar3.f;
                    float f134 = i29;
                    int max3 = (int) Math.max(0.0d, Math.floor((f49 - (cbVar.h != null ? (((cbVar.J - cbVar.f) / j12) * cbVar.v1) + (cbVar.z1 + cbVar.y1) : cbVar.z1)) / f134));
                    int min4 = (int) Math.min(cbVar.N.c, Math.ceil((f133 - f49) / f134) + 1.0d);
                    int i30 = (int) rectF13.top;
                    arrayList3 = cbVar.N.d;
                    boolean z21 = arrayList3.size() >= min4;
                    f46 = f130;
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
                        if (caVar.c()) {
                            gaVar6.a(canvas2);
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
                                    f49 += f134;
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
                    f46 = f130;
                    f26 = d13;
                    paint4 = paint9;
                }
                path3.rewind();
                RectF rectF14 = org.telegram.messenger.g0.P;
                int i32 = cbVar.z1;
                int i33 = cbVar.y1;
                float f135 = i32 + i33;
                float f136 = cbVar.K;
                float f137 = cbVar.I;
                float f138 = cbVar.f;
                float f139 = (f136 * f137) - f138;
                paint2 = paint4;
                float f140 = cbVar.J;
                float f141 = j12;
                float f142 = cbVar.v1;
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
                float f147 = cbVar.L;
                rectF14.set(f145, f146, (((((f137 * f147) - f138) + f140) / f141) * f47) + f135 + (f147 >= 1.0f ? i33 : 0) + f144, rectF13.bottom);
                path3.addRoundRect(rectF14, cbVar.u1, Path.Direction.CW);
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
            float d14 = cbVar.f0.d(cbVar.O);
            float d15 = cbVar.g0.d(cbVar.O && cbVar.Q);
            float audioHeight = cbVar.getAudioHeight() * d14;
            float f148 = ((cbVar.h == null && !cbVar.F && arrayList21.isEmpty()) ? 1.0f : d15) * d14;
            if (d14 > 0.0f) {
                paint3 = paint2;
                float f149 = cbVar.R;
                float f150 = cbVar.T;
                float f151 = cbVar.S;
                float g15 = org.telegram.ui.Cells.c0.g(f150, f151, f149, f148, f24);
                float g16 = org.telegram.ui.Cells.c0.g(cbVar.U, f151, f149, f148, f23);
                Paint c15 = cbVar.n0.c(d14);
                canvas2.save();
                if (cbVar.h == null && !cbVar.F && arrayList21.isEmpty()) {
                    float f152 = cbVar.z1 + cbVar.y1;
                    f38 = f148;
                    f39 = g16;
                    long j19 = cbVar.R - cbVar.f;
                    float f153 = j12;
                    float f154 = cbVar.v1;
                    T1 = ((j19 / f153) * f154) + f152;
                    f40 = g15;
                    y10 = com.google.android.gms.internal.vision.e2.c(j19 + cbVar.S, f153, f154, f152);
                } else {
                    f38 = f148;
                    f39 = g16;
                    f40 = g15;
                    float f155 = j12;
                    T1 = ((((org.telegram.messenger.g0.T1(cbVar.T, 0.0f, d15) * cbVar.S) + (cbVar.R - cbVar.f)) / f155) * cbVar.v1) + cbVar.z1 + cbVar.y1;
                    y10 = cbVar.z1 + cbVar.y1 + (com.google.android.gms.internal.vision.e2.y(org.telegram.messenger.g0.T1(cbVar.U, 1.0f, d15), cbVar.S, cbVar.R - cbVar.f, f155) * cbVar.v1);
                }
                float f156 = y10;
                float f157 = cbVar.y1;
                RectF rectF15 = rectF3;
                rectF15.set(T1 - f157, f69 - audioHeight, f156 + f157, f69);
                f22 = (rectF15.top * f38) + f22;
                f20 = (rectF15.bottom * f38) + f20;
                cbVar.H0.rewind();
                cbVar.H0.addRoundRect(rectF15, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(cbVar.H0);
                if (caVar != null && caVar.c()) {
                    gaVar6.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d14, 855638016));
                } else if (c15 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d14, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF15, c15);
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d14, 855638016));
                }
                if (cbVar.b0 == null || caVar == null || !caVar.c()) {
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
                        cbVar.J0.b((((cbVar.R - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + cbVar.y1, T1, f156, f41, j20, audioHeight, e11, rectF15.bottom, vaVar);
                        f42 = f41;
                        j10 = j20;
                        canvas2.drawPath(cbVar.J0, c16);
                        if (f42 >= 1.0f) {
                            int i34 = cbVar.z1;
                            float f158 = cbVar.y1 + i34;
                            float f159 = cbVar.R - cbVar.f;
                            float f160 = cbVar.T;
                            float f161 = cbVar.S;
                            float f162 = j10;
                            float f163 = cbVar.v1;
                            float f164 = ((((f160 * f161) + f159) / f162) * f163) + f158;
                            float f165 = ((((cbVar.U * f161) + f159) / f162) * f163) + f158;
                            float min5 = (Math.min(cbVar.w1 - cbVar.z1, f165) + Math.max(i34, f164)) / f16;
                            float centerY3 = rectF15.centerY();
                            float max4 = Math.max(0.0f, (Math.min(cbVar.w1 - cbVar.z1, f165) - Math.max(cbVar.z1, f164)) - org.telegram.messenger.g0.L(24.0f));
                            float N = org.telegram.messenger.g0.N(13.0f) + ((cbVar.N0 == null && cbVar.R0 == null) ? 0.0f : cbVar.S0 + org.telegram.messenger.g0.N(9.66f) + org.telegram.messenger.g0.N(3.11f) + cbVar.O0);
                            boolean z22 = N < max4;
                            float min6 = min5 - (Math.min(N, max4) / f16);
                            cbVar.L0.setBounds((int) min6, (int) (centerY3 - (org.telegram.messenger.g0.L(13.0f) / f16)), (int) (org.telegram.messenger.g0.L(13.0f) + min6), (int) ((org.telegram.messenger.g0.L(13.0f) / f16) + centerY3));
                            float f166 = 1.0f - f42;
                            float f167 = f166 * 255.0f;
                            cbVar.L0.setAlpha((int) f167);
                            cbVar.L0.draw(canvas2);
                            float N2 = org.telegram.messenger.g0.N(16.11f) + min6;
                            f29 = f42;
                            f30 = f13;
                            d = 0.0d;
                            f28 = d14;
                            f31 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, cbVar.w1, cbVar.x1, ls.e4, 31);
                            float min7 = Math.min(f165, cbVar.w1) - org.telegram.messenger.g0.L(12.0f);
                            canvas2.clipRect(N2, 0.0f, min7, cbVar.x1);
                            if (cbVar.N0 != null) {
                                canvas2.save();
                                o10.k(cbVar.N0.getHeight(), f16, centerY3, N2 - cbVar.P0, canvas2);
                                cbVar.M0.setAlpha((int) (f167 * f28));
                                cbVar.N0.draw(canvas2);
                                canvas2.restore();
                                f43 = cbVar.O0 + N2;
                            } else {
                                f43 = N2;
                            }
                            if (cbVar.N0 != null && cbVar.R0 != null) {
                                float N3 = org.telegram.messenger.g0.N(3.66f) + f43;
                                int alpha = cbVar.K0.getAlpha();
                                cbVar.K0.setAlpha((int) (alpha * f166));
                                canvas2.drawCircle(org.telegram.messenger.g0.L(1.0f) + N3, centerY3, org.telegram.messenger.g0.L(1.0f), cbVar.K0);
                                cbVar.K0.setAlpha(alpha);
                                f43 = org.telegram.messenger.g0.N(2.0f) + N3 + org.telegram.messenger.g0.N(4.0f);
                            }
                            if (cbVar.R0 != null) {
                                canvas2.save();
                                o10.k(cbVar.R0.getHeight(), 2.0f, centerY3, f43 - cbVar.T0, canvas2);
                                cbVar.Q0.setAlpha((int) (f167 * f28));
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
                    cbVar.J0.b((((cbVar.R - cbVar.f) / j12) * cbVar.v1) + cbVar.z1 + cbVar.y1, T1, f156, f41, j12, audioHeight, e12, rectF15.bottom, vaVar2);
                    canvas2.saveLayerAlpha(rectF15, ls.n1, 31);
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
            float f168 = f20;
            float f169 = f22;
            float f170 = cbVar.z1 + cbVar.y1;
            float f171 = cbVar.f;
            float f172 = j10;
            float f173 = cbVar.v1;
            float f174 = (((f24 - f171) / f172) * f173) + f170;
            float f175 = (((f23 - f171) / f172) * f173) + f170;
            if (!arrayList21.isEmpty()) {
                f32 = f28;
                f28 = f27;
            } else if (cbVar.O && cbVar.h == null) {
                f32 = f28;
            } else {
                float f176 = f28;
                f28 = Math.max(f31, d12);
                f32 = f176;
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
                cbVar.e(canvas, paint10, f169, f168, f174, f175, f34 * f28);
                xa xaVar7 = cbVar.h;
                if (xaVar7 != null && ((cbVar.O || cbVar.F) && (f33 > 0.0f || f26 > 0.0f))) {
                    float f177 = cbVar.x1 - cbVar.A1;
                    float f178 = cbVar.y1 + cbVar.z1;
                    float f179 = xaVar7.g;
                    float f180 = xaVar7.e;
                    float f181 = cbVar.f;
                    float f182 = cbVar.v1;
                    float f183 = ((((xaVar7.h * f180) - f181) / f172) * f182) + f178;
                    canvas3 = canvas;
                    cbVar.e(canvas3, paint10, f177 - f119, f177, ((((f179 * f180) - f181) / f172) * f182) + f178, f183, 0.8f);
                } else if (cbVar.w == null || arrayList21.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    xa xaVar8 = cbVar.w;
                    RectF rectF16 = xaVar8.j;
                    float f184 = rectF16.top;
                    float f185 = rectF16.bottom;
                    float f186 = cbVar.y1 + cbVar.z1;
                    float f187 = xaVar8.f;
                    float f188 = xaVar8.g;
                    float f189 = xaVar8.e;
                    float f190 = cbVar.f;
                    float f191 = cbVar.v1;
                    float f192 = (((((f188 * f189) + f187) - f190) / f172) * f191) + f186;
                    float f193 = (((((xaVar8.h * f189) + f187) - f190) / f172) * f191) + f186;
                    canvas3 = canvas;
                    cbVar.e(canvas3, paint10, f184, f185, f192, f193, 0.8f);
                }
                if (cbVar.c0 > 1) {
                    xa xaVar9 = cbVar.h;
                    if (xaVar9 != null) {
                        float f194 = xaVar9.e;
                        float f195 = xaVar9.h;
                        float f196 = xaVar9.g;
                        long j21 = (long) ((f195 - f196) * f194);
                        if (j21 > 68999) {
                            float f197 = cbVar.z1 + cbVar.y1;
                            float f198 = cbVar.f;
                            float f199 = cbVar.v1;
                            float f200 = ((((f196 * f194) - f198) / f172) * f199) + f197;
                            float f201 = ((((f195 * f194) - f198) / f172) * f199) + f197;
                            canvas3.save();
                            float f202 = cbVar.x1 - cbVar.A1;
                            canvas3.clipRect(f200, f202 - f119, f201, f202);
                            cbVar.A0.setAlpha((int) (org.telegram.messenger.g0.T1(0.8f, f11, f30) * 255.0f));
                            i7 = 1;
                            long j22 = 59000;
                            int min8 = (int) Math.min(cbVar.c0 - 1, j21 / 59000);
                            int i35 = 1;
                            while (i35 <= min8) {
                                if (Math.min(j22, j21 - (i35 * j22)) < 1000) {
                                    break;
                                }
                                float f203 = cbVar.z1 + cbVar.y1;
                                xa xaVar10 = cbVar.h;
                                float f204 = ((((((long) (xaVar10.e * xaVar10.g)) + r2) - cbVar.f) / f172) * cbVar.v1) + f203;
                                int i36 = i35;
                                canvas.drawRect(f204, (cbVar.x1 - cbVar.A1) - f119, org.telegram.messenger.g0.L(f11) + f204, cbVar.x1 - cbVar.A1, cbVar.A0);
                                canvas3 = canvas;
                                StringBuilder sb2 = new StringBuilder("#");
                                int i37 = i36 + 1;
                                sb2.append(i37);
                                canvas3.drawText(sb2.toString(), f204 + org.telegram.messenger.g0.L(2.0f), ((cbVar.x1 - cbVar.A1) - f119) + org.telegram.messenger.g0.L(14.0f), cbVar.F0);
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
            float f205 = f11 / (1000.0f / org.telegram.messenger.g0.r);
            float f206 = cbVar.o1;
            long L2 = (long) ((org.telegram.messenger.g0.L(32.0f) / cbVar.v1) * j10 * f205 * f206);
            if (cbVar.Y0) {
                cbVar.o1 = (f205 * 0.25f) + f206;
            }
            int i38 = cbVar.i1;
            if (i38 == 4 && (xaVar2 = cbVar.h) != null) {
                float f207 = xaVar2.g;
                long j24 = cbVar.f;
                long j25 = xaVar2.e;
                float f208 = j25;
                if (f207 < j24 / f208) {
                    i11 = -1;
                } else if (xaVar2.h > (j24 + j10) / f208) {
                    i11 = i7;
                } else {
                    cbVar.o1 = f11;
                    i11 = 0;
                }
                long j26 = i11 * L2;
                cbVar.f = Utilities.k(j24 + j26, j25 - j10, 0L);
                cbVar.e += j26;
                xa xaVar13 = cbVar.h;
                float f209 = (r3 - j24) / xaVar13.e;
                float min9 = f209 > 0.0f ? Math.min(f11 - xaVar13.h, f209) : Math.max(0.0f - xaVar13.g, f209);
                xa xaVar14 = cbVar.h;
                xaVar14.g = Utilities.i(xaVar14.g + min9, f11, 0.0f);
                xa xaVar15 = cbVar.h;
                xaVar15.h = Utilities.i(xaVar15.h + min9, f11, 0.0f);
                wa waVar = cbVar.a;
                if (waVar != null) {
                    waVar.g0(false, cbVar.h.g);
                    cbVar.a.M1(cbVar.h.h);
                }
                cbVar.invalidate();
            } else if (i38 == 8) {
                float f210 = cbVar.T;
                long j27 = cbVar.R;
                float f211 = (-j27) + 100;
                long j28 = cbVar.S;
                float f212 = j28;
                if (f210 < f211 / f212) {
                    i10 = -1;
                } else if (cbVar.U >= ((r8 + j10) - 100) / f212) {
                    i10 = i7;
                } else {
                    cbVar.o1 = f11;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (cbVar.Q && (xaVar = cbVar.h) != null) {
                        long j29 = j27 - (i10 * L2);
                        float f213 = xaVar.h;
                        float f214 = xaVar.e;
                        cbVar.R = Utilities.k(j29, (long) ((f213 * f214) - (f210 * f212)), (long) ((xaVar.g * f214) - (cbVar.U * f212)));
                    } else if (cbVar.H && cbVar.F) {
                        long j30 = j27 - (i10 * L2);
                        float f215 = cbVar.L;
                        float f216 = cbVar.I;
                        cbVar.R = Utilities.k(j30, (long) ((f215 * f216) - (f210 * f212)), (long) ((cbVar.K * f216) - (cbVar.U * f212)));
                    } else {
                        cbVar.R = Utilities.k(j27 - (i10 * L2), 0L, -(j28 - Math.min(cbVar.getBaseDuration(), cbVar.getMaxScrollDuration())));
                    }
                    float f217 = (-(cbVar.R - j27)) / cbVar.S;
                    float min10 = f217 > 0.0f ? Math.min(f11 - cbVar.U, f217) : Math.max(0.0f - cbVar.T, f217);
                    if (cbVar.h == null) {
                        float f218 = cbVar.e;
                        float f219 = cbVar.S;
                        cbVar.e = (long) Utilities.i((min10 * f219) + f218, f219, 0.0f);
                    }
                    cbVar.T = Utilities.i(cbVar.T + min10, f11, 0.0f);
                    cbVar.U = Utilities.i(cbVar.U + min10, f11, 0.0f);
                    wa waVar2 = cbVar.a;
                    if (waVar2 != null) {
                        waVar2.w1(cbVar.T);
                        cbVar.a.q1(cbVar.U);
                        cbVar.a.M(cbVar.e, false);
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, ls.e4, 31);
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
        paint4.setAlpha(ls.e4);
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
                waVar2.w1(this.T);
                this.a.q1(this.U);
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
                    waVar3.w1(this.T);
                    this.a.q1(this.U);
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
                    waVar4.w1(this.T);
                    this.a.q1(this.U);
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
            waVar5.m2(this.R + ((long) (this.T * this.S)));
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
                    waVar6.M(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        waVar.D0(true);
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
        waVar7.M(k10, false);
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
                        waVar2.n1(xaVar.g, xaVar.a);
                        this.a.G1(xaVar.h, xaVar.a);
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
                        waVar3.n1(xaVar.g, xaVar.a);
                        this.a.G1(xaVar.h, xaVar.a);
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
            waVar4.i2(xaVar.a, xaVar.f);
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
                    waVar5.M(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        waVar.D0(true);
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
        waVar6.M(k10, false);
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
                waVar2.s0(this.K);
                this.a.b2(this.L);
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
                    waVar3.s0(this.K);
                    this.a.b2(this.L);
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
                    waVar4.s0(this.K);
                    this.a.b2(this.L);
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
            waVar5.e1(this.J + ((long) (this.K * this.I)));
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
                    waVar6.M(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        waVar.D0(true);
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
        waVar7.M(k10, false);
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
            waVar.M(i7, z10);
        }
        bi.c4 c4Var = this.e1;
        if (c4Var != null) {
            org.telegram.messenger.g0.r(c4Var);
            this.e1 = null;
        }
        if (!z10) {
            return true;
        }
        bi.c4 c4Var2 = new bi.c4(this, i7, 10);
        this.e1 = c4Var2;
        org.telegram.messenger.g0.h3(c4Var2, 150L);
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
        bi.c4 c4Var;
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
        float f11;
        float B;
        float f12;
        boolean z13;
        float B2;
        boolean z14;
        wa waVar2;
        int i7;
        float f13;
        float f14;
        boolean z15;
        float f15;
        float i10;
        wa waVar3;
        wa waVar4;
        int i11;
        float f16;
        float f17;
        xa xaVar = this.h;
        ArrayList arrayList = this.s;
        if (xaVar != null || !arrayList.isEmpty() || this.O || this.F) {
            float timelineHeight = this.x1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                ll0 ll0Var = this.X0;
                ai.b bVar = this.Z0;
                if (action == 0) {
                    bi.c4 c4Var2 = this.e1;
                    if (c4Var2 != null) {
                        org.telegram.messenger.g0.r(c4Var2);
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
                            float W1 = org.telegram.messenger.g0.W1(((xa) arrayList.get(i13)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
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
                        org.telegram.messenger.g0.r(bVar);
                        org.telegram.messenger.g0.h3(bVar, ViewConfiguration.getLongPressTimeout());
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
                                float f23 = (min / this.S) * (x10 / this.v1);
                                if (i15 == 6) {
                                    float g10 = this.U - (g() / this.S);
                                    float max = Math.max(0L, this.f - this.R);
                                    float f24 = this.S;
                                    float f25 = max / f24;
                                    xa xaVar3 = this.h;
                                    if (xaVar3 != null) {
                                        B = org.telegram.ui.Cells.c0.x((xaVar3.g * xaVar3.e) + this.f, this.R, f24, f25);
                                    } else {
                                        xa xaVar4 = this.w;
                                        if (xaVar4 != null) {
                                            B = org.telegram.ui.Cells.c0.x((xaVar4.g * xaVar4.e) + this.f, this.R, f24, f25);
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
                                    wa waVar5 = this.a;
                                    if (waVar5 != null) {
                                        waVar5.m2(this.R + ((long) (this.T * this.S)));
                                    }
                                    wa waVar6 = this.a;
                                    if (waVar6 != null) {
                                        waVar6.w1(this.T);
                                    }
                                } else if (i15 == 7) {
                                    float min2 = Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S);
                                    float f27 = this.T;
                                    float g11 = g();
                                    float f28 = this.S;
                                    float f29 = (g11 / f28) + f27;
                                    xa xaVar5 = this.h;
                                    if (xaVar5 != null) {
                                        f11 = Math.min(min2, (((xaVar5.h * xaVar5.e) + this.f) - this.R) / f28);
                                    } else {
                                        xa xaVar6 = this.w;
                                        if (xaVar6 != null) {
                                            f11 = Math.min(min2, (((xaVar6.h * xaVar6.e) + this.f) - this.R) / f28);
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
                                    wa waVar7 = this.a;
                                    if (waVar7 != null) {
                                        waVar7.q1(this.U);
                                    }
                                }
                                if (this.i1 == 8) {
                                    float min3 = f23 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S) - this.U), f23) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.R) / this.S) - this.T), f23);
                                    float f31 = this.T + min3;
                                    this.T = f31;
                                    this.U += min3;
                                    wa waVar8 = this.a;
                                    if (waVar8 != null) {
                                        waVar8.w1(f31);
                                        this.a.m2(this.R + ((long) (this.T * this.S)));
                                        this.a.q1(this.U);
                                    }
                                    wa waVar9 = this.a;
                                    if (waVar9 != null) {
                                        waVar9.D0(true);
                                    }
                                }
                                if (this.h == null && !this.F) {
                                    this.e = (long) (this.T * this.S);
                                    wa waVar10 = this.a;
                                    if (waVar10 != null) {
                                        waVar10.D0(true);
                                        this.a.M(this.e, false);
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
                                    xa xaVar7 = this.h;
                                    if (xaVar7 != null) {
                                        B2 = org.telegram.ui.Cells.c0.x((xaVar7.g * xaVar7.e) + this.f, this.J, f33, f34);
                                    } else {
                                        xa xaVar8 = this.w;
                                        if (xaVar8 != null) {
                                            B2 = org.telegram.ui.Cells.c0.x((xaVar8.g * xaVar8.e) + this.f, this.J, f33, f34);
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
                                    wa waVar11 = this.a;
                                    if (waVar11 != null) {
                                        waVar11.e1(this.J + ((long) (this.K * this.I)));
                                    }
                                    wa waVar12 = this.a;
                                    if (waVar12 != null) {
                                        waVar12.s0(this.K);
                                    }
                                } else if (i15 == 11) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I);
                                    float f36 = this.K;
                                    float g13 = g();
                                    float f37 = this.I;
                                    float f38 = (g13 / f37) + f36;
                                    xa xaVar9 = this.h;
                                    if (xaVar9 != null) {
                                        min4 = Math.min(min4, (((xaVar9.h * xaVar9.e) + this.f) - this.J) / f37);
                                    }
                                    xa xaVar10 = this.w;
                                    if (xaVar10 != null) {
                                        f12 = Math.min(min4, (((xaVar10.h * xaVar10.e) + this.f) - this.J) / this.I);
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
                                    wa waVar13 = this.a;
                                    if (waVar13 != null) {
                                        waVar13.b2(this.L);
                                    }
                                }
                                if (this.i1 == 12) {
                                    float min5 = f32 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I) - this.L, f32) : Math.max((Math.max(0L, this.f - this.J) / this.I) - this.K, f32);
                                    float f40 = this.K + min5;
                                    this.K = f40;
                                    this.L += min5;
                                    wa waVar14 = this.a;
                                    if (waVar14 != null) {
                                        waVar14.s0(f40);
                                        this.a.e1(this.J + ((long) (this.K * this.I)));
                                        this.a.b2(this.L);
                                    }
                                    wa waVar15 = this.a;
                                    if (waVar15 != null) {
                                        waVar15.D0(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.K * this.I);
                                    wa waVar16 = this.a;
                                    if (waVar16 != null) {
                                        waVar16.D0(true);
                                        z13 = false;
                                        this.a.M(this.e, false);
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
                                            i((xa) arrayList.get(this.j1), (x10 / this.v1) * min);
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = true;
                                            this.m1 = false;
                                        } else if (this.m1) {
                                            m(currentTimeMillis - this.f1 < 350, motionEvent.getX());
                                            if (this.n1 || (waVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                waVar2.D0(true);
                                            }
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = z14;
                                        }
                                    }
                                } else {
                                    xa xaVar11 = (xa) arrayList.get(this.j1);
                                    float f41 = (min / xaVar11.e) * (x10 / this.v1);
                                    int i23 = this.i1;
                                    if (i23 == 13) {
                                        float g14 = xaVar11.h - (g() / xaVar11.e);
                                        float max3 = Math.max(0L, this.f - xaVar11.f) / xaVar11.e;
                                        if (xaVar11 == this.w) {
                                            f13 = f41;
                                            max3 = org.telegram.ui.Cells.c0.B(f(), xaVar11.e, xaVar11.h, max3);
                                            if (!this.p1 && f13 < 0.0f) {
                                                f14 = 0.0f;
                                                if (xaVar11.g <= xaVar11.h - (f() / xaVar11.e)) {
                                                    this.i1 = 15;
                                                }
                                                f15 = xaVar11.g;
                                                i10 = Utilities.i(f15 + f13, g14, max3);
                                                xaVar11.g = i10;
                                                if (Math.abs(f15 - i10) > 0.01f) {
                                                    this.p1 = true;
                                                }
                                                waVar3 = this.a;
                                                if (waVar3 != null) {
                                                    waVar3.i2(xaVar11.a, xaVar11.f);
                                                }
                                                waVar4 = this.a;
                                                if (waVar4 != null) {
                                                    waVar4.n1(xaVar11.g, xaVar11.a);
                                                }
                                            }
                                        } else {
                                            f13 = f41;
                                        }
                                        f14 = 0.0f;
                                        f15 = xaVar11.g;
                                        i10 = Utilities.i(f15 + f13, g14, max3);
                                        xaVar11.g = i10;
                                        if (Math.abs(f15 - i10) > 0.01f) {
                                        }
                                        waVar3 = this.a;
                                        if (waVar3 != null) {
                                        }
                                        waVar4 = this.a;
                                        if (waVar4 != null) {
                                        }
                                    } else {
                                        f13 = f41;
                                        f14 = 0.0f;
                                        if (i23 == 14) {
                                            float min6 = Math.min(1.0f, Math.max(0L, (this.f - xaVar11.f) + min) / xaVar11.e);
                                            float g15 = (g() / xaVar11.e) + xaVar11.g;
                                            if (xaVar11 == this.w) {
                                                min6 = org.telegram.ui.Cells.c0.f(f(), xaVar11.e, xaVar11.g, min6);
                                                if (!this.p1 && f13 > 0.0f) {
                                                    if (xaVar11.h >= (f() / xaVar11.e) + xaVar11.g) {
                                                        this.i1 = 15;
                                                    }
                                                }
                                            }
                                            float f42 = xaVar11.h;
                                            float i24 = Utilities.i(f42 + f13, min6, g15);
                                            xaVar11.h = i24;
                                            if (Math.abs(f42 - i24) > 0.01f) {
                                                this.p1 = true;
                                            }
                                            wa waVar17 = this.a;
                                            if (waVar17 != null) {
                                                waVar17.G1(xaVar11.h, xaVar11.a);
                                            }
                                        }
                                    }
                                    if (this.i1 == 15) {
                                        float min7 = f13 > f14 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - xaVar11.f) + min) / xaVar11.e) - xaVar11.h, f13) : Math.max((Math.max(0L, this.f - xaVar11.f) / xaVar11.e) - xaVar11.g, f13);
                                        float f43 = xaVar11.g + min7;
                                        xaVar11.g = f43;
                                        xaVar11.h += min7;
                                        wa waVar18 = this.a;
                                        if (waVar18 != null) {
                                            waVar18.n1(f43, xaVar11.a);
                                            this.a.i2(xaVar11.a, xaVar11.f);
                                            this.a.G1(xaVar11.h, xaVar11.a);
                                        }
                                        wa waVar19 = this.a;
                                        if (waVar19 != null) {
                                            z15 = true;
                                            waVar19.D0(true);
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
                            float f44 = xaVar2.e;
                            float f45 = (min / f44) * (x10 / this.v1);
                            if (i11 == 2) {
                                xaVar2.g = Utilities.i(xaVar2.g + f45, xaVar2.h - (1000.0f / f44), 0.0f);
                                wa waVar20 = this.a;
                                if (waVar20 != null) {
                                    waVar20.g0(false, this.h.g);
                                }
                                xa xaVar12 = this.h;
                                float f46 = xaVar12.h - xaVar12.g;
                                float f47 = f();
                                xa xaVar13 = this.h;
                                if (f46 > f47 / xaVar13.e) {
                                    xaVar13.h = org.telegram.ui.Cells.c0.f(f(), this.h.e, xaVar13.g, 1.0f);
                                    wa waVar21 = this.a;
                                    if (waVar21 != null) {
                                        waVar21.M1(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                xaVar2.h = Utilities.i(xaVar2.h + f45, 1.0f, (1000.0f / f44) + xaVar2.g);
                                wa waVar22 = this.a;
                                if (waVar22 != null) {
                                    waVar22.M1(this.h.h);
                                }
                                xa xaVar14 = this.h;
                                float f48 = xaVar14.h - xaVar14.g;
                                float f49 = f();
                                xa xaVar15 = this.h;
                                if (f48 > f49 / xaVar15.e) {
                                    xaVar15.g = org.telegram.ui.Cells.c0.B(f(), this.h.e, xaVar15.h, 0.0f);
                                    wa waVar23 = this.a;
                                    if (waVar23 != null) {
                                        waVar23.g0(false, this.h.g);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min8 = f45 > 0.0f ? Math.min(1.0f - xaVar2.h, f45) : Math.max(-xaVar2.g, f45);
                                xa xaVar16 = this.h;
                                float f50 = xaVar16.g + min8;
                                xaVar16.g = f50;
                                xaVar16.h += min8;
                                wa waVar24 = this.a;
                                if (waVar24 != null) {
                                    waVar24.g0(false, f50);
                                    this.a.M1(this.h.h);
                                }
                            }
                            float f51 = this.e;
                            xa xaVar17 = this.h;
                            float f52 = xaVar17.e;
                            float f53 = f51 / f52;
                            float f54 = xaVar17.g;
                            if (f53 < f54 || f53 > xaVar17.h) {
                                long j15 = (long) (f54 * f52);
                                this.e = j15;
                                wa waVar25 = this.a;
                                if (waVar25 != null) {
                                    waVar25.M(j15, false);
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
                                    xa xaVar18 = this.h;
                                    if (xaVar18 != null) {
                                        float f61 = xaVar18.h;
                                        float f62 = xaVar18.e;
                                        j11 = this.S;
                                        j12 = (long) ((f61 * f62) - 0);
                                        f10 = xaVar18.g * f62;
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
                                    xa xaVar19 = this.h;
                                    if (xaVar19 != null) {
                                        float f67 = xaVar19.h;
                                        float f68 = xaVar19.e;
                                        j13 = (long) ((xaVar19.g * f68) - this.I);
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
                            c4Var = this.e1;
                            if (c4Var != null) {
                                org.telegram.messenger.g0.r(c4Var);
                                this.e1 = null;
                            }
                            if (this.n1 || !z10 || (waVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                waVar.D0(false);
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
                                            this.a.g(((xa) arrayList.get(this.l1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i33 == 2 && !this.Q) {
                                    this.Q = true;
                                    this.H = false;
                                    wa waVar26 = this.a;
                                    if (waVar26 != null) {
                                        waVar26.h1(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 && !this.H) {
                                    this.Q = false;
                                    this.H = true;
                                    wa waVar27 = this.a;
                                    if (waVar27 != null) {
                                        waVar27.h1(true);
                                    }
                                    invalidate();
                                } else if (i33 != 2 && this.Q) {
                                    this.Q = false;
                                    this.H = false;
                                    wa waVar28 = this.a;
                                    if (waVar28 != null) {
                                        waVar28.h1(false);
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
                                        waVar29.h1(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i36 = (long) Utilities.i(((((motionEvent.getX() - this.z1) - this.y1) / this.v1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                xa xaVar20 = this.h;
                                float f71 = xaVar20.h - xaVar20.g;
                                xaVar20.g = (1.0f - f71) * (i36 / getBaseDuration());
                                xa xaVar21 = this.h;
                                float f72 = xaVar21.g;
                                xaVar21.h = f71 + f72;
                                wa waVar30 = this.a;
                                if (waVar30 != null) {
                                    waVar30.g0(true, f72);
                                    this.a.M1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.k1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    c4Var = this.e1;
                    if (c4Var != null) {
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

    public void setCollage(ArrayList<c7> arrayList) {
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
                c7 c7Var = arrayList.get(i11);
                if (c7Var.K) {
                    xa xaVar2 = new xa(this);
                    xaVar2.a = i11;
                    xaVar2.b = false;
                    xaVar2.d = c7Var.L.getAbsolutePath();
                    xaVar2.e = c7Var.h0;
                    xaVar2.f = c7Var.X;
                    xaVar2.i = c7Var.P;
                    xaVar2.g = c7Var.V;
                    xaVar2.h = c7Var.W;
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
