package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class cc extends View {
    public boolean A;
    public final TextPaint A0;
    public String B;
    public final RectF B0;
    public boolean C;
    public final Path C0;
    public long D;
    public final Paint D0;
    public long E;
    public final bc E0;
    public float F;
    public final Paint F0;
    public float G;
    public final Drawable G0;
    public float H;
    public final TextPaint H0;
    public ac I;
    public StaticLayout I0;
    public boolean J;
    public float J0;
    public String K;
    public float K0;
    public boolean L;
    public final TextPaint L0;
    public long M;
    public StaticLayout M0;
    public long N;
    public float N0;
    public float O;
    public float O0;
    public float P;
    public final LinearGradient P0;
    public boolean Q;
    public final Matrix Q0;
    public float R;
    public final Paint R0;
    public boolean S;
    public final bm0 S0;
    public vb T;
    public boolean T0;
    public int U;
    public final cg.k0 U0;
    public final org.telegram.ui.Components.y5 V;
    public long V0;
    public final org.telegram.ui.Components.y5 W;
    public long W0;
    public final org.telegram.ui.Components.y5 X0;
    public long Y0;
    public cg.b2 Z0;
    public wb a;
    public final org.telegram.ui.Components.y5 a0;
    public long a1;
    public Runnable b;
    public final org.telegram.ui.Components.y5 b0;
    public long b1;
    public int c;
    public final org.telegram.ui.Components.y5 c0;
    public float c1;
    public Runnable d;
    public final org.telegram.ui.Components.y5 d0;
    public int d1;
    public long e;
    public final org.telegram.ui.Components.y5 e0;
    public int e1;
    public long f;
    public boolean f0;
    public int f1;
    public final org.telegram.ui.Components.z9 g0;
    public int g1;
    public xb h;
    public final org.telegram.ui.Components.da h0;
    public boolean h1;
    public final org.telegram.ui.Components.da i0;
    public boolean i1;
    public final org.telegram.ui.Components.da j0;
    public float j1;
    public final RectF k0;
    public boolean k1;
    public final Path l0;
    public VelocityTracker l1;
    public final pz0 m0;
    public boolean m1;
    public int n;
    public final Drawable n0;
    public boolean n1;
    public final bc o0;
    public int o1;
    public final RectF p0;
    public final float[] p1;
    public final Paint q0;
    public int q1;
    public final ArrayList r;
    public final Path r0;
    public int r1;
    public final ArrayList s;
    public final Path s0;
    public int s1;
    public final RectF t0;
    public int t1;
    public final Path u0;
    public int u1;
    public xb v;
    public final Paint v0;
    public int v1;
    public final Paint w;
    public final Paint w0;
    public final Path x;
    public final Paint x0;
    public final Path y;
    public final Paint y0;
    public final Paint z0;

    public cc(Context context, ViewGroup viewGroup, fb fbVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new Paint(3);
        this.x = new Path();
        this.y = new Path();
        this.U = 1;
        er erVar = er.h;
        this.V = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.W = new org.telegram.ui.Components.y5(this, 360L, erVar);
        this.a0 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.b0 = new org.telegram.ui.Components.y5(this, 360L, erVar);
        this.c0 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.d0 = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        this.e0 = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.f0 = true;
        this.k0 = new RectF();
        this.l0 = new Path();
        this.o0 = new bc();
        this.p0 = new RectF();
        this.q0 = new Paint(3);
        this.r0 = new Path();
        this.s0 = new Path();
        this.t0 = new RectF();
        this.u0 = new Path();
        Paint paint = new Paint(1);
        this.v0 = paint;
        Paint paint2 = new Paint(1);
        this.w0 = paint2;
        Paint paint3 = new Paint(1);
        this.x0 = paint3;
        Paint paint4 = new Paint(1);
        this.y0 = paint4;
        Paint paint5 = new Paint(1);
        this.z0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.A0 = textPaint;
        this.B0 = new RectF();
        this.C0 = new Path();
        Paint paint6 = new Paint(1);
        this.D0 = paint6;
        this.E0 = new bc();
        Paint paint7 = new Paint(1);
        this.F0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.H0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.L0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.P0 = linearGradient;
        this.Q0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.R0 = paint8;
        this.S0 = new bm0(getContext(), null);
        this.V0 = -1L;
        this.W0 = -1L;
        this.X0 = new org.telegram.ui.Components.y5(0.0f, this, 0L, 340L, erVar);
        this.Y0 = -1L;
        this.d1 = -1;
        this.e1 = -1;
        this.f1 = -1;
        this.g1 = -1;
        this.j1 = 1.0f;
        this.m1 = true;
        this.n1 = false;
        this.p1 = new float[8];
        paint7.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(1.0f), 436207616);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(2.0f), TLObject.FLAG_30);
        textPaint.setTypeface(AndroidUtilities.bold());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.m0 = new pz0(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.n0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.G0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g0 = z9Var;
        this.h0 = new org.telegram.ui.Components.da(z9Var, this, 0, false);
        this.i0 = new org.telegram.ui.Components.da(z9Var, this, 3, false);
        this.j0 = new org.telegram.ui.Components.da(z9Var, this, 4, false);
        this.U0 = new cg.k0(this, viewGroup, c6Var, z9Var, fbVar, 18);
    }

    public static void a(final cc ccVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var, View view) {
        int i10;
        ArrayList arrayList = ccVar.s;
        int i11 = ccVar.f1;
        try {
            if (i11 == 2 && ccVar.J) {
                t7 t7Var = new t7(ccVar.getContext(), 0);
                t7Var.b = 0.0f;
                t7Var.c = 1.5f;
                t7Var.d(ccVar.R);
                final int i12 = 0;
                t7Var.h = new Utilities.Callback(ccVar) { // from class: lh.ub
                    public final /* synthetic */ cc b;

                    {
                        this.b = ccVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cc ccVar2 = this.b;
                                ccVar2.R = floatValue;
                                wb wbVar = ccVar2.a;
                                if (wbVar != null) {
                                    wbVar.I(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cc ccVar3 = this.b;
                                ccVar3.H = floatValue2;
                                wb wbVar2 = ccVar3.a;
                                if (wbVar2 != null) {
                                    wbVar2.y(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cc ccVar4 = this.b;
                                ccVar4.h.i = f10.floatValue();
                                wb wbVar3 = ccVar4.a;
                                if (wbVar3 != null) {
                                    wbVar3.X0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i13 = ccVar.r1;
                int i14 = ccVar.u1;
                int i15 = ccVar.t1;
                float min2 = Math.min((i13 - i14) - i15, ((((AndroidUtilities.lerp(ccVar.P, 1.0f, ccVar.b0.c) * ccVar.N) + (ccVar.M - ccVar.f)) / min) * ccVar.q1) + i14 + i15);
                b70 F = b70.F(viewGroup, c6Var, ccVar);
                F.q(t7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new tb(ccVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(ccVar.r1 - min2)) + AndroidUtilities.dp(18.0f), ccVar.B0.top);
                F.Z();
                F.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && ccVar.A) {
                t7 t7Var2 = new t7(ccVar.getContext(), 0);
                t7Var2.b = 0.0f;
                t7Var2.c = 1.5f;
                t7Var2.d(ccVar.H);
                final int i16 = 1;
                t7Var2.h = new Utilities.Callback(ccVar) { // from class: lh.ub
                    public final /* synthetic */ cc b;

                    {
                        this.b = ccVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i16) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cc ccVar2 = this.b;
                                ccVar2.R = floatValue;
                                wb wbVar = ccVar2.a;
                                if (wbVar != null) {
                                    wbVar.I(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cc ccVar3 = this.b;
                                ccVar3.H = floatValue2;
                                wb wbVar2 = ccVar3.a;
                                if (wbVar2 != null) {
                                    wbVar2.y(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cc ccVar4 = this.b;
                                ccVar4.h.i = f10.floatValue();
                                wb wbVar3 = ccVar4.a;
                                if (wbVar3 != null) {
                                    wbVar3.X0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i17 = ccVar.r1;
                int i18 = ccVar.u1;
                int i19 = ccVar.t1;
                float min4 = Math.min((i17 - i18) - i19, ((((AndroidUtilities.lerp(ccVar.G, 1.0f, ccVar.W.c) * ccVar.D) + (ccVar.E - ccVar.f)) / min3) * ccVar.q1) + i18 + i19);
                b70 F2 = b70.F(viewGroup, c6Var, ccVar);
                F2.q(t7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new tb(ccVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(ccVar.r1 - min4)) + AndroidUtilities.dp(18.0f), ccVar.t0.top);
                F2.Z();
                F2.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && ccVar.h != null) {
                t7 t7Var3 = new t7(ccVar.getContext(), 0);
                t7Var3.b = 0.0f;
                t7Var3.c = 1.5f;
                t7Var3.d(ccVar.h.i);
                final int i20 = 2;
                t7Var3.h = new Utilities.Callback(ccVar) { // from class: lh.ub
                    public final /* synthetic */ cc b;

                    {
                        this.b = ccVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i20) {
                            case 0:
                                float floatValue = f10.floatValue();
                                cc ccVar2 = this.b;
                                ccVar2.R = floatValue;
                                wb wbVar = ccVar2.a;
                                if (wbVar != null) {
                                    wbVar.I(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                cc ccVar3 = this.b;
                                ccVar3.H = floatValue2;
                                wb wbVar2 = ccVar3.a;
                                if (wbVar2 != null) {
                                    wbVar2.y(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cc ccVar4 = this.b;
                                ccVar4.h.i = f10.floatValue();
                                wb wbVar3 = ccVar4.a;
                                if (wbVar3 != null) {
                                    wbVar3.X0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                b70 F3 = b70.F(viewGroup, c6Var, ccVar);
                F3.q(t7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), ccVar.p0.top);
                F3.Z();
                F3.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else {
                if (i11 != 3 || (i10 = ccVar.g1) < 0 || i10 >= arrayList.size()) {
                    return;
                }
                xb xbVar = (xb) arrayList.get(ccVar.g1);
                t7 t7Var4 = new t7(ccVar.getContext(), 0);
                t7Var4.b = 0.0f;
                t7Var4.c = 1.5f;
                t7Var4.d(xbVar.i);
                t7Var4.h = new gh.d1(16, ccVar, xbVar);
                b70 F4 = b70.F(viewGroup, c6Var, ccVar);
                F4.q(t7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), xbVar.j.top);
                F4.Z();
                F4.R(z9Var, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.b0.e(this.L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        xb xbVar = this.h;
        if (xbVar != null) {
            return Math.max(1L, xbVar.e);
        }
        xb xbVar2 = this.v;
        return xbVar2 != null ? Math.max(1L, xbVar2.e) : this.A ? Math.max(1L, this.D) : Math.max(1L, this.N);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f10 > 0.0f) {
                f10 += AndroidUtilities.dp(4.0f);
            }
            f10 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((xb) arrayList.get(i10)).k.c);
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.A) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.W.e(this.C));
    }

    private float getVideoHeight() {
        if (this.h == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), r0.k.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013f A[LOOP:0: B:38:0x013f->B:42:0x01f3, LOOP_START, PHI: r5
      0x013f: PHI (r5v34 int) = (r5v7 int), (r5v35 int) binds: [B:37:0x013d, B:42:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e4 A[PHI: r21
      0x03e4: PHI (r21v2 int) = (r21v1 int), (r21v1 int), (r21v3 int) binds: [B:89:0x024e, B:91:0x0258, B:77:0x03e2] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        xb xbVar;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.e, getBaseDuration(), 0L);
        xb xbVar2 = this.v;
        float f10 = min;
        float f11 = (this.q1 * (((clamp + (xbVar2 != null ? (xbVar2.g * xbVar2.e) + xbVar2.f : this.h == null ? this.M : 0L)) - this.f) / f10)) + this.u1 + this.t1;
        if (!this.T0 && x8 >= f11 - AndroidUtilities.dp(12.0f) && x8 <= f11 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z11 = this.h != null && y10 > (((float) (this.s1 - this.v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        ArrayList arrayList = this.s;
        boolean z12 = !arrayList.isEmpty() && y10 > ((((((float) (this.s1 - this.v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y10 < (((float) (this.s1 - this.v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (this.A) {
            if (y10 > (((((((this.s1 - this.v1) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
                if (y10 < ((((this.s1 - this.v1) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z10 = true;
                    if (z12) {
                        i10 = 1;
                        if (z11) {
                            float f12 = this.u1 + this.t1;
                            xb xbVar3 = this.h;
                            float f13 = xbVar3.g;
                            float f14 = xbVar3.e;
                            float f15 = this.f;
                            float f16 = this.q1;
                            float f17 = ((((f13 * f14) - f15) / f10) * f16) + f12;
                            float f18 = ((((xbVar3.h * f14) - f15) / f10) * f16) + f12;
                            if (this.T0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x8 < f17 - AndroidUtilities.dp(15.0f) || x8 > f18 + AndroidUtilities.dp(15.0f)) {
                                    return i10;
                                }
                                return 4;
                            }
                            if (x8 >= f17 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f17) {
                                return 2;
                            }
                            if (x8 >= f18 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + f18) {
                                return 3;
                            }
                            if (x8 >= f17 && x8 <= f18) {
                                xb xbVar4 = this.h;
                                if (xbVar4.g > 0.01f || xbVar4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z10) {
                            float f19 = this.u1 + this.t1;
                            float f20 = this.E;
                            float f21 = this.F;
                            float f22 = this.D;
                            float f23 = this.f;
                            float f24 = this.q1;
                            float f25 = (((((f21 * f22) + f20) - f23) / f10) * f24) + f19;
                            float f26 = (((((this.G * f22) + f20) - f23) / f10) * f24) + f19;
                            if (this.C || this.h == null) {
                                if (x8 >= f25 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f25) {
                                    return 10;
                                }
                                if (x8 >= f26 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + f26) {
                                    return 11;
                                }
                                if (x8 >= f25 && x8 <= f26) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f27 = this.u1 + this.t1;
                                long j10 = this.E;
                                long j11 = this.f;
                                float f28 = this.q1;
                                float f29 = (((j10 - j11) / f10) * f28) + f27;
                                f26 = s3.c.c((j10 + this.D) - j11, f10, f28, f27);
                                f25 = f29;
                            }
                            if (x8 >= f25 && x8 <= f26) {
                                return 9;
                            }
                        } else if (this.J) {
                            float f30 = this.u1 + this.t1;
                            float f31 = this.M;
                            float f32 = this.O;
                            float f33 = this.N;
                            float f34 = this.f;
                            float f35 = this.q1;
                            float f36 = (((((f32 * f33) + f31) - f34) / f10) * f35) + f30;
                            float f37 = (((((this.P * f33) + f31) - f34) / f10) * f35) + f30;
                            if (this.L || (this.h == null && !this.A)) {
                                if (x8 >= f36 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f36) {
                                    return 6;
                                }
                                if (x8 >= f37 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + f37) {
                                    return 7;
                                }
                                if (x8 >= f36 && x8 <= f37) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f38 = this.u1 + this.t1;
                                long j12 = this.M;
                                long j13 = this.f;
                                float f39 = this.q1;
                                float f40 = (((j12 - j13) / f10) * f39) + f38;
                                f37 = s3.c.c((j12 + this.N) - j13, f10, f39, f38);
                                f36 = f40;
                            }
                            if (x8 >= f36 && x8 <= f37) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            xb xbVar5 = (xb) arrayList.get(i11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(xbVar5.j);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x8, y10)) {
                                float f41 = this.u1 + this.t1;
                                float f42 = xbVar5.f;
                                float f43 = this.q1;
                                float f44 = ((f42 / f10) * f43) + f41;
                                float f45 = xbVar5.g;
                                float f46 = xbVar5.e;
                                float f47 = ((((f45 * f46) + f42) / f10) * f43) + f41;
                                float f48 = ((((xbVar5.h * f46) + f42) / f10) * f43) + f41;
                                float c10 = s3.c.c(r6 + r11, f10, f43, f41);
                                this.e1 = i11;
                                if (x8 >= f47 - AndroidUtilities.dp(15.0f) && x8 <= AndroidUtilities.dp(5.0f) + f47) {
                                    return 13;
                                }
                                if (x8 >= f48 - AndroidUtilities.dp(5.0f) && x8 <= AndroidUtilities.dp(15.0f) + f48) {
                                    return 14;
                                }
                                if (x8 < f47 || x8 > f48 || (xbVar5.g <= 0.01f && xbVar5.h >= 0.99f)) {
                                    return (x8 < f44 || x8 > c10) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i10 = 1;
                    }
                    xbVar = this.h;
                    if (xbVar != null || xbVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        xbVar = this.h;
        return xbVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        bm0 bm0Var = this.S0;
        if (!bm0Var.b()) {
            if (this.n1) {
                this.n1 = false;
                wb wbVar = this.a;
                if (wbVar != null) {
                    wbVar.I0(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = bm0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.m1) {
            this.f = (long) Math.max(0.0f, (((i10 - this.u1) - this.t1) / this.q1) * min);
        } else {
            if (!this.L) {
                bm0Var.a();
                return;
            }
            int i11 = this.u1;
            int i12 = this.t1;
            float f10 = this.q1;
            float f11 = min;
            h(((((i10 - i11) - i12) / f10) * f11) - ((((this.o1 - i11) - i12) / f10) * f11));
        }
        invalidate();
        this.o1 = i10;
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        float f13;
        if (this.T0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(j10, getBaseDuration(), 0L);
        xb xbVar = this.v;
        if (xbVar != null) {
            f13 = (xbVar.g * xbVar.e) + xbVar.f;
        } else {
            f13 = this.h == null ? this.M : 0L;
        }
        float f14 = (this.q1 * (((clamp + f13) - this.f) / min)) + this.u1 + this.t1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.y0;
        paint.setAlpha((int) (38.0f * f12));
        int i10 = (int) (f12 * 255.0f);
        Paint paint2 = this.z0;
        paint2.setAlpha(i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
    }

    /* JADX WARN: Incorrect condition in loop: B:120:0x06b0 */
    /* JADX WARN: Incorrect condition in loop: B:137:0x06fb */
    /* JADX WARN: Incorrect condition in loop: B:208:0x09cd */
    /* JADX WARN: Incorrect condition in loop: B:225:0x0a1a */
    /* JADX WARN: Incorrect condition in loop: B:67:0x03e0 */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x11a2  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0f00  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        long j10;
        Paint paint;
        ArrayList arrayList;
        float f10;
        org.telegram.ui.Components.da daVar;
        RectF rectF2;
        long j11;
        int i10;
        xb xbVar;
        xb xbVar2;
        int i11;
        float f11;
        float max;
        Canvas canvas2;
        long j12;
        float f12;
        boolean z10;
        float f13;
        float f14;
        RectF rectF3;
        ArrayList arrayList2;
        long j13;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        ArrayList arrayList3;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        Paint paint2;
        float f27;
        float f28;
        double d;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        Canvas canvas3;
        float d10;
        float f34;
        float f35;
        xb xbVar3;
        float f36;
        float f37;
        float lerp;
        float y10;
        float f38;
        RectF rectF4;
        float f39;
        float f40;
        float f41;
        float dpf2;
        float f42;
        float f43;
        float c10;
        float f44;
        float f45;
        long j14;
        float f46;
        float f47;
        float f48;
        ArrayList arrayList4;
        int i12;
        boolean z11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i13;
        int i14;
        float f49;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i15;
        RectF rectF5;
        ArrayList arrayList9;
        float f50;
        float f51;
        Path path;
        float c11;
        float f52;
        float f53;
        float f54;
        int i16;
        long j15;
        float f55;
        float f56;
        float f57;
        ArrayList arrayList10;
        boolean z12;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z13;
        int i17;
        float f58;
        ArrayList arrayList13;
        ArrayList arrayList14;
        float f59;
        float f60;
        float f61;
        float f62;
        float f63;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        int i18;
        boolean z14;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        org.telegram.ui.Components.da daVar2;
        cc ccVar = this;
        RectF rectF6 = ccVar.p0;
        RectF rectF7 = ccVar.t0;
        Path path2 = ccVar.s0;
        ArrayList arrayList20 = ccVar.r;
        Drawable drawable = ccVar.n0;
        org.telegram.ui.Components.z9 z9Var = ccVar.g0;
        RectF rectF8 = ccVar.B0;
        ArrayList arrayList21 = ccVar.s;
        RectF rectF9 = ccVar.k0;
        org.telegram.ui.Components.da daVar3 = ccVar.h0;
        Paint c12 = daVar3.c(1.0f);
        float e9 = ccVar.e0.e(ccVar.f0);
        long min = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
        if (e9 < 1.0f) {
            rectF9.set(ccVar.u1, (ccVar.s1 - ccVar.v1) - AndroidUtilities.dp(28.0f), ccVar.r1 - ccVar.u1, ccVar.s1 - ccVar.v1);
            ccVar.l0.rewind();
            ccVar.l0.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - e9) * 255.0f), 31);
            canvas.clipPath(ccVar.l0);
            if (z9Var.c()) {
                daVar3.a(canvas);
                canvas.drawColor(855638016);
                paint3 = c12;
            } else if (c12 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint3 = c12;
            } else {
                paint3 = c12;
                canvas.drawRect(rectF9, paint3);
                canvas.drawColor(855638016);
            }
            if (arrayList20.isEmpty() || !z9Var.c()) {
                paint4 = paint3;
                rectF = rectF6;
                daVar2 = daVar3;
                j10 = min;
                if (!arrayList20.isEmpty()) {
                    Paint c13 = ccVar.j0.c(0.4f);
                    if (c13 == null) {
                        c13 = ccVar.D0;
                        c13.setAlpha(64);
                    }
                    ccVar.o0.a((((ccVar.M - ccVar.f) / j10) * ccVar.q1) + ccVar.u1 + ccVar.t1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), ccVar.d0.d(bc.c(arrayList20), false), rectF9.bottom, arrayList20);
                    canvas.drawPath(ccVar.o0, c13);
                    float h = ((ccVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - h);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, rl.e(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, rl.y(2, centerY, drawable));
                    drawable.setAlpha(191);
                    drawable.draw(canvas);
                    pz0 pz0Var = ccVar.m0;
                    float centerX2 = (rectF9.centerX() - h) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
                    float f64 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    daVar = daVar2;
                    f10 = 0.4f;
                    pz0Var.c(centerX2, f64, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float d11 = ccVar.d0.d(bc.c(arrayList20), false);
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j10 = min;
                daVar2 = daVar3;
                ccVar.o0.a((((ccVar.M - ccVar.f) / min) * ccVar.q1) + ccVar.u1 + ccVar.t1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), d11, rectF9.bottom, arrayList20);
                canvas.saveLayerAlpha(rectF9, 102, 31);
                canvas.clipPath(ccVar.o0);
                ccVar.j0.a(canvas);
                canvas.restore();
            }
            float h10 = ((ccVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - h10);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, rl.e(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, rl.y(2, centerY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            pz0 pz0Var2 = ccVar.m0;
            float centerX22 = (rectF9.centerX() - h10) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
            float f642 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            daVar = daVar2;
            f10 = 0.4f;
            pz0Var2.c(centerX22, f642, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c12;
            arrayList = arrayList21;
            f10 = 0.4f;
            daVar = daVar3;
            rectF2 = rectF8;
        }
        if (e9 > 0.0f) {
            if (e9 < 1.0f) {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, ccVar.getWidth(), ccVar.getHeight(), (int) (e9 * 255.0f), 31);
                z10 = true;
            } else {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                z10 = false;
            }
            xb xbVar4 = ccVar.h;
            float f65 = xbVar4 != null ? 1.0f : 0.0f;
            float e10 = xbVar4 != null ? xbVar4.k.e((ccVar.L || ccVar.C) ? false : true) : 0.0f;
            float f66 = ccVar.s1 - ccVar.v1;
            float dp = AndroidUtilities.dp(4.0f);
            if (ccVar.h != null) {
                canvas2.save();
                float videoHeight = ccVar.getVideoHeight();
                xb xbVar5 = ccVar.h;
                float f67 = xbVar5.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j16 = xbVar5.e;
                float f68 = j16;
                float x8 = com.google.android.recaptcha.internal.a.x(f67, f68, e10, f12);
                float x10 = com.google.android.recaptcha.internal.a.x(xbVar5.h, f68, e10, f12);
                if (j16 <= 0) {
                    f13 = e10;
                    f60 = f65;
                    j13 = j12;
                    f61 = 0.0f;
                    f59 = 0.0f;
                    f15 = dp;
                } else {
                    f59 = 0.0f;
                    f13 = e10;
                    f60 = f65;
                    j13 = j12;
                    f15 = dp;
                    f61 = (ccVar.u1 + ccVar.t1) - (ccVar.q1 * (ccVar.f / j13));
                }
                f19 = x8;
                float f69 = ccVar.t1;
                float f70 = f61 - f69;
                if (j16 <= 0) {
                    f62 = f69;
                    f18 = x10;
                    f63 = 0.0f;
                } else {
                    f62 = f69;
                    f18 = x10;
                    f63 = (((j16 - ccVar.f) / j13) * ccVar.q1) + ccVar.u1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f70, f66 - videoHeight, f63 + f62, f66);
                float f71 = f66 - ((f15 * f60) + videoHeight);
                float f72 = (rectF10.top * f13) + f59;
                f17 = (rectF10.bottom * f13) + f59;
                ccVar.r0.rewind();
                ccVar.r0.addRoundRect(rectF10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ccVar.r0);
                ac acVar = ccVar.h.c;
                if (acVar != null) {
                    int i19 = acVar.f;
                    float f73 = i19;
                    f20 = f72;
                    int max2 = (int) Math.max(0.0d, Math.floor((f70 - ccVar.u1) / f73));
                    f14 = f60;
                    int min2 = (int) Math.min(ccVar.h.c.c, Math.ceil(((r6 - f70) - ccVar.u1) / f73) + 1.0d);
                    int i20 = (int) rectF10.top;
                    arrayList15 = ccVar.h.c.d;
                    boolean z15 = arrayList15.size() >= min2;
                    boolean z16 = (i19 == 0 || !z15 || ccVar.h.b) ? false : true;
                    if (z16) {
                        int i21 = max2;
                        while (true) {
                            arrayList18 = ccVar.h.c.d;
                            if (i21 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = ccVar.h.c.d;
                            if (((zb) arrayList19.get(i21)).a == null) {
                                z16 = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (!z16) {
                        if (z9Var.c()) {
                            daVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF10, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i19 != 0) {
                        float f74 = f70;
                        int i22 = max2;
                        while (i22 < Math.min(arrayList16.size(), min2)) {
                            arrayList17 = ccVar.h.c.d;
                            zb zbVar = (zb) arrayList17.get(i22);
                            if (zbVar.a != null) {
                                i18 = min2;
                                z14 = z15;
                                ccVar.q0.setAlpha((int) (zbVar.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(zbVar.a, f74, i20 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), ccVar.q0);
                            } else {
                                i18 = min2;
                                z14 = z15;
                            }
                            f74 += f73;
                            i22++;
                            z15 = z14;
                            min2 = i18;
                        }
                    }
                    if (!z15) {
                        ccVar.h.c.c();
                    }
                } else {
                    f20 = f72;
                    f14 = f60;
                }
                path2.rewind();
                if (!ccVar.T0) {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    int i23 = ccVar.u1;
                    int i24 = ccVar.t1;
                    float f75 = i23 + i24;
                    xb xbVar6 = ccVar.h;
                    float f76 = xbVar6.g;
                    int i25 = i24;
                    float f77 = xbVar6.e;
                    float f78 = ccVar.f;
                    float f79 = (f76 * f77) - f78;
                    float f80 = j13;
                    float f81 = ccVar.q1;
                    float f82 = (((f79 / f80) * f81) + f75) - (f76 <= f59 ? i25 : 0);
                    float f83 = ccVar.s1 - ccVar.v1;
                    float f84 = f83 - videoHeight;
                    float f85 = xbVar6.h;
                    float f86 = ((((f77 * f85) - f78) / f80) * f81) + f75;
                    if (f85 < 1.0f) {
                        i25 = 0;
                    }
                    rectF11.set(f82, f84, f86 + i25, f83);
                    path2.addRoundRect(rectF11, ccVar.p1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f66 = f71;
                f16 = videoHeight;
            } else {
                f13 = e10;
                f14 = f65;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j13 = j12;
                f15 = dp;
                f16 = 0.0f;
                f17 = 0.0f;
                f18 = 0.0f;
                f19 = 0.0f;
                f20 = 0.0f;
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                f21 = f16;
                f22 = 0.0f;
            } else {
                ccVar.getCollageHeight();
                float f87 = f66;
                int i26 = 0;
                while (i26 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    xb xbVar7 = (xb) arrayList22.get(i26);
                    org.telegram.ui.Components.y5 y5Var = xbVar7.k;
                    RectF rectF12 = xbVar7.j;
                    float f88 = f16;
                    float e11 = y5Var.e((ccVar.L || ccVar.C || ccVar.n != i26) ? false : true);
                    if (xbVar7 != ccVar.v) {
                        i15 = i26;
                        arrayList9 = arrayList22;
                        float f89 = j13;
                        f50 = f17;
                        f51 = ((((AndroidUtilities.lerp(xbVar7.g, 0.0f, e11) * xbVar7.e) + (xbVar7.f - ccVar.f)) / f89) * ccVar.q1) + ccVar.u1 + ccVar.t1;
                        rectF5 = rectF7;
                        c11 = (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(xbVar7.h, 1.0f, e11), xbVar7.e, xbVar7.f - ccVar.f, f89) * ccVar.q1) + ccVar.u1 + ccVar.t1;
                        path = path2;
                    } else {
                        i15 = i26;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f50 = f17;
                        float f90 = ccVar.u1 + ccVar.t1;
                        float f91 = j13;
                        float f92 = (xbVar7.f - ccVar.f) / f91;
                        float f93 = ccVar.q1;
                        f51 = (f92 * f93) + f90;
                        path = path2;
                        c11 = s3.c.c(r8 + xbVar7.e, f91, f93, f90);
                    }
                    float f94 = f51;
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), e11);
                    float f95 = ccVar.t1;
                    rectF12.set(f94 - f95, f87 - lerp2, c11 + f95, f87);
                    f20 = (rectF12.top * e11) + f20;
                    f17 = (rectF12.bottom * e11) + f50;
                    float f96 = xbVar7.f;
                    float f97 = xbVar7.g;
                    float f98 = f87;
                    float f99 = xbVar7.e;
                    f19 = (((f97 * f99) + f96) * e11) + f19;
                    f18 = (((xbVar7.h * f99) + f96) * e11) + f18;
                    ccVar.x.rewind();
                    ccVar.x.addRoundRect(rectF12, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(ccVar.x);
                    ac acVar2 = xbVar7.c;
                    if (acVar2 != null) {
                        long j17 = xbVar7.e;
                        f52 = lerp2;
                        if (j17 <= 0) {
                            j15 = j17;
                            f55 = 0.0f;
                        } else {
                            j15 = j17;
                            f55 = ccVar.u1 + ccVar.t1 + (((xbVar7.f - ccVar.f) / j13) * ccVar.q1);
                        }
                        float f100 = ccVar.t1;
                        float f101 = f55 - f100;
                        if (j17 <= 0) {
                            f56 = f100;
                            f57 = 0.0f;
                        } else {
                            f56 = f100;
                            f57 = ((((xbVar7.f + j15) - ccVar.f) / j13) * ccVar.q1) + ccVar.u1 + r7;
                        }
                        float f102 = f57 + f56;
                        int i27 = acVar2.f;
                        float f103 = i27;
                        int max3 = (int) Math.max(0.0d, Math.floor((f101 - ((((xbVar7.f - ccVar.f) / j13) * ccVar.q1) + (ccVar.u1 + ccVar.t1))) / f103));
                        int min3 = (int) Math.min(xbVar7.c.c, Math.ceil((f102 - f101) / f103) + 1.0d);
                        int i28 = (int) rectF12.top;
                        arrayList10 = xbVar7.c.d;
                        boolean z17 = arrayList10.size() >= min3;
                        if (z17) {
                            for (int i29 = max3; i29 < Math.min(arrayList13.size(), min3); i29++) {
                                arrayList14 = xbVar7.c.d;
                                if (((zb) arrayList14.get(i29)).a == null) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = z17;
                        if (!z12) {
                            if (z9Var.c()) {
                                daVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i27 != 0) {
                            float f104 = f101;
                            while (max3 < Math.min(arrayList11.size(), min3)) {
                                arrayList12 = xbVar7.c.d;
                                zb zbVar2 = (zb) arrayList12.get(max3);
                                int i30 = min3;
                                if (zbVar2.a != null) {
                                    z13 = z17;
                                    i17 = max3;
                                    f58 = f98;
                                    ccVar.w.setAlpha((int) (zbVar2.b.d(1.0f, false) * 255.0f));
                                    canvas2.drawBitmap(zbVar2.a, f104, i28 - ((int) ((r4.getHeight() - f52) / 2.0f)), ccVar.w);
                                } else {
                                    z13 = z17;
                                    i17 = max3;
                                    f58 = f98;
                                }
                                f104 += f103;
                                max3 = i17 + 1;
                                min3 = i30;
                                z17 = z13;
                                f98 = f58;
                            }
                        }
                        f53 = f98;
                        if (!z17) {
                            xbVar7.c.c();
                        }
                    } else {
                        f52 = lerp2;
                        f53 = f98;
                    }
                    ccVar.y.rewind();
                    if (!ccVar.T0) {
                        RectF rectF13 = AndroidUtilities.rectTmp;
                        int i31 = ccVar.u1;
                        int i32 = ccVar.t1;
                        float f105 = i31 + i32;
                        float f106 = xbVar7.g;
                        float f107 = xbVar7.e;
                        float f108 = ccVar.f;
                        float f109 = (f106 * f107) - f108;
                        float f110 = xbVar7.f;
                        float f111 = j13;
                        float f112 = ccVar.q1;
                        float f113 = (((f109 + f110) / f111) * f112) + f105;
                        if (f106 <= 0.0f) {
                            f54 = f112;
                            i16 = i32;
                        } else {
                            f54 = f112;
                            i16 = 0;
                        }
                        float f114 = f113 - i16;
                        float f115 = rectF12.top;
                        float f116 = xbVar7.h;
                        rectF13.set(f114, f115, (((((f107 * f116) - f108) + f110) / f111) * f54) + f105 + (f116 >= 1.0f ? i32 : 0), rectF12.bottom);
                        ccVar.y.addRoundRect(rectF13, ccVar.p1, Path.Direction.CW);
                        canvas2.clipPath(ccVar.y, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f87 = f53 - ((f15 * 1.0f) + f52);
                    i26 = i15 + 1;
                    path2 = path;
                    f16 = f88;
                    arrayList2 = arrayList9;
                    rectF7 = rectF5;
                }
                arrayList3 = arrayList2;
                f21 = f16;
                f66 = f87;
                f22 = 1.0f;
            }
            RectF rectF14 = rectF7;
            Path path3 = path2;
            float e12 = ccVar.V.e(ccVar.A);
            float e13 = ccVar.W.e(ccVar.A && ccVar.C);
            float roundHeight = ccVar.getRoundHeight() * e12;
            float f117 = ((ccVar.h == null && !ccVar.J && arrayList3.isEmpty()) ? 1.0f : e13) * e12;
            if (e12 > 0.0f) {
                long j18 = ccVar.E;
                float f118 = j18;
                float f119 = ccVar.F;
                float f120 = ccVar.D;
                f19 = (((f119 * f120) + f118) * f117) + f19;
                f18 = (((ccVar.G * f120) + f118) * f117) + f18;
                if (ccVar.h != null) {
                    float f121 = j13;
                    float lerp3 = ((((ccVar.D * AndroidUtilities.lerp(f119, 0.0f, e13)) + (j18 - ccVar.f)) / f121) * ccVar.q1) + ccVar.u1 + ccVar.t1;
                    f43 = f17;
                    f23 = f22;
                    c10 = (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(ccVar.G, 1.0f, e13), ccVar.D, ccVar.E - ccVar.f, f121) * ccVar.q1) + ccVar.u1 + ccVar.t1;
                    f44 = lerp3;
                } else {
                    f23 = f22;
                    f43 = f17;
                    float f122 = ccVar.u1 + ccVar.t1;
                    long j19 = j18 - ccVar.f;
                    float f123 = j13;
                    float f124 = ccVar.q1;
                    float f125 = ((j19 / f123) * f124) + f122;
                    c10 = s3.c.c(j19 + r6, f123, f124, f122);
                    f44 = f125;
                }
                float f126 = ccVar.t1;
                rectF14.set(f44 - f126, f66 - roundHeight, c10 + f126, f66);
                float f127 = f66 - ((f15 * e12) + roundHeight);
                f20 = (rectF14.top * f117) + f20;
                f17 = (rectF14.bottom * f117) + f43;
                ccVar.u0.rewind();
                ccVar.u0.addRoundRect(rectF14, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(ccVar.u0);
                ac acVar3 = ccVar.I;
                if (acVar3 != null) {
                    float f128 = e13;
                    long j20 = ccVar.D;
                    if (j20 <= 0) {
                        f45 = f127;
                        j14 = j20;
                        f46 = 0.0f;
                    } else {
                        f45 = f127;
                        j14 = j20;
                        f46 = ccVar.u1 + ccVar.t1 + (((ccVar.E - ccVar.f) / j13) * ccVar.q1);
                    }
                    float f129 = ccVar.t1;
                    float f130 = f46 - f129;
                    if (j20 <= 0) {
                        f47 = f129;
                        f48 = 0.0f;
                    } else {
                        f47 = f129;
                        f48 = ccVar.u1 + r10 + ((((ccVar.E + j14) - ccVar.f) / j13) * ccVar.q1);
                    }
                    float f131 = f48 + f47;
                    int i33 = acVar3.f;
                    float f132 = i33;
                    float f133 = f130;
                    int max4 = (int) Math.max(0.0d, Math.floor((f130 - (ccVar.h != null ? (((ccVar.E - ccVar.f) / j13) * ccVar.q1) + (ccVar.u1 + ccVar.t1) : ccVar.u1)) / f132));
                    int min4 = (int) Math.min(ccVar.I.c, Math.ceil((f131 - f133) / f132) + 1.0d);
                    int i34 = (int) rectF14.top;
                    arrayList4 = ccVar.I.d;
                    boolean z18 = arrayList4.size() >= min4;
                    if (z18) {
                        int i35 = max4;
                        i12 = i35;
                        while (i35 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = ccVar.I.d;
                            if (((zb) arrayList8.get(i35)).a == null) {
                                z11 = false;
                                break;
                            }
                            i35++;
                        }
                    } else {
                        i12 = max4;
                    }
                    z11 = z18;
                    if (!z11) {
                        if (z9Var.c()) {
                            daVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF14, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i33 != 0) {
                        int i36 = i12;
                        while (i36 < Math.min(arrayList5.size(), min4)) {
                            arrayList6 = ccVar.I.d;
                            zb zbVar3 = (zb) arrayList6.get(i36);
                            int i37 = i36;
                            if (zbVar3.a != null) {
                                i13 = min4;
                                i14 = i34;
                                f49 = f128;
                                ccVar.q0.setAlpha((int) (zbVar3.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(zbVar3.a, f133, i14 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), ccVar.q0);
                            } else {
                                i13 = min4;
                                i14 = i34;
                                f49 = f128;
                            }
                            f133 += f132;
                            i36 = i37 + 1;
                            min4 = i13;
                            i34 = i14;
                            f128 = f49;
                        }
                    }
                    f24 = f128;
                    if (!z18) {
                        ccVar.I.c();
                    }
                } else {
                    f45 = f127;
                    f24 = e13;
                }
                path3.rewind();
                RectF rectF15 = AndroidUtilities.rectTmp;
                int i38 = ccVar.u1;
                int i39 = ccVar.t1;
                float f134 = i38 + i39;
                float f135 = ccVar.F;
                float f136 = ccVar.D;
                float f137 = f135 * f136;
                float f138 = ccVar.f;
                float f139 = f137 - f138;
                float f140 = ccVar.E;
                float f141 = j13;
                float f142 = (f139 + f140) / f141;
                float f143 = ccVar.q1;
                float f144 = (1.0f - f24) * i39;
                float f145 = (((f142 * f143) + f134) - (f135 <= 0.0f ? i39 : 0)) - f144;
                float f146 = rectF14.top;
                float f147 = ccVar.G;
                float f148 = (((((f136 * f147) - f138) + f140) / f141) * f143) + f134;
                if (f147 < 1.0f) {
                    i39 = 0;
                }
                rectF15.set(f145, f146, f148 + i39 + f144, rectF14.bottom);
                path3.addRoundRect(rectF15, ccVar.p1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f66 = f45;
            } else {
                f23 = f22;
                f24 = e13;
            }
            float e14 = ccVar.a0.e(ccVar.J);
            float e15 = ccVar.b0.e(ccVar.J && ccVar.L);
            float audioHeight = ccVar.getAudioHeight() * e14;
            float f149 = ((ccVar.h == null && !ccVar.A && arrayList3.isEmpty()) ? 1.0f : e15) * e14;
            if (e14 > 0.0f) {
                float f150 = ccVar.M;
                float f151 = ccVar.O;
                float f152 = ccVar.N;
                f19 = (((f151 * f152) + f150) * f149) + f19;
                f18 = (((ccVar.P * f152) + f150) * f149) + f18;
                Paint c14 = ccVar.i0.c(e14);
                canvas2.save();
                if (ccVar.h == null && !ccVar.A && arrayList3.isEmpty()) {
                    float f153 = ccVar.u1 + ccVar.t1;
                    f37 = f17;
                    float f154 = ccVar.M - ccVar.f;
                    float f155 = j13;
                    float f156 = ccVar.q1;
                    float f157 = ((f154 / f155) * f156) + f153;
                    paint2 = paint;
                    f36 = f149;
                    y10 = s3.c.c(r10 + ccVar.N, f155, f156, f153);
                    lerp = f157;
                } else {
                    f36 = f149;
                    f37 = f17;
                    paint2 = paint;
                    float f158 = j13;
                    lerp = ((((AndroidUtilities.lerp(ccVar.O, 0.0f, e15) * ccVar.N) + (ccVar.M - ccVar.f)) / f158) * ccVar.q1) + ccVar.u1 + ccVar.t1;
                    y10 = ccVar.u1 + ccVar.t1 + (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(ccVar.P, 1.0f, e15), ccVar.N, ccVar.M - ccVar.f, f158) * ccVar.q1);
                }
                float f159 = y10;
                float f160 = ccVar.t1;
                RectF rectF16 = rectF3;
                rectF16.set(lerp - f160, f66 - audioHeight, f159 + f160, f66);
                f20 = (rectF16.top * f36) + f20;
                float f161 = (rectF16.bottom * f36) + f37;
                ccVar.C0.rewind();
                ccVar.C0.addRoundRect(rectF16, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ccVar.C0);
                if (z9Var != null && z9Var.c()) {
                    daVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e14, 855638016));
                } else if (c14 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e14, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c14);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e14, 855638016));
                }
                if (ccVar.T == null || z9Var == null || !z9Var.c()) {
                    f38 = e15;
                    rectF4 = rectF16;
                    if (ccVar.T != null && c14 != null) {
                        Paint c15 = ccVar.j0.c(e14 * f10);
                        if (c15 == null) {
                            c15 = ccVar.D0;
                            c15.setAlpha((int) (64.0f * e14));
                        }
                        float d12 = ccVar.c0.d(ccVar.T.e, !ccVar.Q);
                        vb vbVar = ccVar.T;
                        ccVar.Q = vbVar.c > 0;
                        long j21 = j13;
                        ccVar.E0.b((((ccVar.M - ccVar.f) / j13) * ccVar.q1) + ccVar.u1 + ccVar.t1, lerp, f159, f38, j21, audioHeight, d12, rectF4.bottom, vbVar);
                        f39 = f38;
                        j11 = j21;
                        canvas2.drawPath(ccVar.E0, c15);
                        if (f39 >= 1.0f) {
                            int i40 = ccVar.u1;
                            float f162 = ccVar.t1 + i40;
                            float f163 = ccVar.M - ccVar.f;
                            float f164 = ccVar.O;
                            float f165 = ccVar.N;
                            float f166 = j11;
                            float f167 = ccVar.q1;
                            float f168 = ((((f164 * f165) + f163) / f166) * f167) + f162;
                            float f169 = ((((ccVar.P * f165) + f163) / f166) * f167) + f162;
                            float min5 = (Math.min(ccVar.r1 - ccVar.u1, f169) + Math.max(i40, f168)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(ccVar.r1 - ccVar.u1, f169) - Math.max(ccVar.u1, f168)) - AndroidUtilities.dp(24.0f));
                            float dpf22 = AndroidUtilities.dpf2(13.0f);
                            if (ccVar.I0 == null && ccVar.M0 == null) {
                                dpf2 = 0.0f;
                                f41 = 13.0f;
                            } else {
                                f41 = 13.0f;
                                dpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + ccVar.J0 + ccVar.N0;
                            }
                            float f170 = dpf22 + dpf2;
                            boolean z19 = f170 < max5;
                            float min6 = min5 - (Math.min(f170, max5) / 2.0f);
                            ccVar.G0.setBounds((int) min6, (int) (centerY3 - (AndroidUtilities.dp(f41) / 2.0f)), (int) (AndroidUtilities.dp(f41) + min6), (int) ((AndroidUtilities.dp(f41) / 2.0f) + centerY3));
                            float f171 = 1.0f - f39;
                            float f172 = f171 * 255.0f;
                            ccVar.G0.setAlpha((int) f172);
                            ccVar.G0.draw(canvas2);
                            float dpf23 = AndroidUtilities.dpf2(16.11f) + min6;
                            f26 = e14;
                            f40 = f161;
                            f27 = f13;
                            d = 0.0d;
                            f25 = f39;
                            f28 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, ccVar.r1, ccVar.s1, 255, 31);
                            float min7 = Math.min(f169, ccVar.r1) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf23, 0.0f, min7, ccVar.s1);
                            if (ccVar.I0 != null) {
                                canvas2.save();
                                canvas2.translate(dpf23 - ccVar.K0, centerY3 - (ccVar.I0.getHeight() / 2.0f));
                                ccVar.H0.setAlpha((int) (f172 * f26));
                                ccVar.I0.draw(canvas2);
                                canvas2.restore();
                                f42 = ccVar.J0 + dpf23;
                            } else {
                                f42 = dpf23;
                            }
                            if (ccVar.I0 != null && ccVar.M0 != null) {
                                float dpf24 = AndroidUtilities.dpf2(3.66f) + f42;
                                int alpha = ccVar.F0.getAlpha();
                                ccVar.F0.setAlpha((int) (alpha * f171));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf24, centerY3, AndroidUtilities.dp(1.0f), ccVar.F0);
                                ccVar.F0.setAlpha(alpha);
                                f42 = AndroidUtilities.dpf2(2.0f) + dpf24 + AndroidUtilities.dpf2(4.0f);
                            }
                            if (ccVar.M0 != null) {
                                canvas2.save();
                                canvas2.translate(f42 - ccVar.O0, centerY3 - (ccVar.M0.getHeight() / 2.0f));
                                ccVar.L0.setAlpha((int) (f172 * f26));
                                ccVar.M0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z19) {
                                ccVar.Q0.reset();
                                ccVar.Q0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                ccVar.Q0.postTranslate(min7 - AndroidUtilities.dp(8.0f), 0.0f);
                                ccVar.P0.setLocalMatrix(ccVar.Q0);
                                canvas2.drawRect(min7 - AndroidUtilities.dp(8.0f), rectF4.top, min7, rectF4.bottom, ccVar.R0);
                            }
                            canvas.restore();
                        } else {
                            f26 = e14;
                            f40 = f161;
                            f25 = f39;
                            f27 = f13;
                            f28 = f14;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f29 = f40;
                    }
                } else {
                    float d13 = ccVar.c0.d(ccVar.T.e, !ccVar.Q);
                    vb vbVar2 = ccVar.T;
                    ccVar.Q = vbVar2.c > 0;
                    rectF4 = rectF16;
                    f38 = e15;
                    ccVar.E0.b((((ccVar.M - ccVar.f) / j13) * ccVar.q1) + ccVar.u1 + ccVar.t1, lerp, f159, f38, j13, audioHeight, d13, rectF4.bottom, vbVar2);
                    canvas2.saveLayerAlpha(rectF4, 102, 31);
                    canvas2.clipPath(ccVar.E0);
                    ccVar.j0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                f39 = f38;
                if (f39 >= 1.0f) {
                }
                canvas.restore();
                f29 = f40;
            } else {
                f25 = e15;
                f26 = e14;
                float f173 = f17;
                paint2 = paint;
                f27 = f13;
                f28 = f14;
                d = 0.0d;
                j11 = j13;
                f29 = f173;
            }
            float f174 = f20;
            float f175 = ccVar.u1 + ccVar.t1;
            float f176 = ccVar.f;
            float f177 = j11;
            float f178 = ccVar.q1;
            float f179 = (((f19 - f176) / f177) * f178) + f175;
            float f180 = (((f18 - f176) / f177) * f178) + f175;
            if (!arrayList3.isEmpty()) {
                f31 = e12;
                f30 = f26;
                f26 = f23;
            } else if (ccVar.J && ccVar.h == null) {
                f31 = e12;
                f30 = f26;
            } else {
                float f181 = f26;
                f26 = Math.max(f28, e12);
                f30 = f181;
                f31 = e12;
            }
            if (f30 > d || f31 > d || f28 > d || f23 > d) {
                if (ccVar.h == null && !ccVar.A && arrayList3.isEmpty()) {
                    f32 = f25;
                    f33 = f30 * AndroidUtilities.lerp(0.6f, 1.0f, f32);
                } else {
                    f32 = f25;
                    f33 = 1.0f;
                }
                Paint paint5 = paint2;
                ccVar.e(canvas, paint5, f174, f29, f179, f180, f33 * f26);
                xb xbVar8 = ccVar.h;
                if (xbVar8 != null && ((ccVar.J || ccVar.A) && (f32 > 0.0f || f24 > 0.0f))) {
                    float f182 = ccVar.s1 - ccVar.v1;
                    float f183 = ccVar.t1 + ccVar.u1;
                    float f184 = xbVar8.g;
                    float f185 = xbVar8.e;
                    float f186 = ccVar.f;
                    float f187 = ccVar.q1;
                    float f188 = ((((xbVar8.h * f185) - f186) / f177) * f187) + f183;
                    canvas3 = canvas;
                    ccVar.e(canvas3, paint5, f182 - f21, f182, ((((f184 * f185) - f186) / f177) * f187) + f183, f188, 0.8f);
                } else if (ccVar.v == null || arrayList3.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    xb xbVar9 = ccVar.v;
                    RectF rectF17 = xbVar9.j;
                    float f189 = rectF17.top;
                    float f190 = rectF17.bottom;
                    float f191 = ccVar.t1 + ccVar.u1;
                    float f192 = xbVar9.f;
                    float f193 = xbVar9.g;
                    float f194 = xbVar9.e;
                    float f195 = ccVar.f;
                    float f196 = ccVar.q1;
                    float f197 = (((((f193 * f194) + f192) - f195) / f177) * f196) + f191;
                    float f198 = (((((xbVar9.h * f194) + f192) - f195) / f177) * f196) + f191;
                    canvas3 = canvas;
                    ccVar.e(canvas3, paint5, f189, f190, f197, f198, 0.8f);
                }
                if (ccVar.U > 1 && (xbVar3 = ccVar.h) != null) {
                    float f199 = xbVar3.e;
                    float f200 = xbVar3.h;
                    float f201 = xbVar3.g;
                    long j22 = (long) ((f200 - f201) * f199);
                    if (j22 > 68999) {
                        float f202 = ccVar.u1 + ccVar.t1;
                        float f203 = ccVar.f;
                        float f204 = ccVar.q1;
                        float f205 = ((((f201 * f199) - f203) / f177) * f204) + f202;
                        float f206 = ((((f200 * f199) - f203) / f177) * f204) + f202;
                        canvas3.save();
                        float f207 = ccVar.s1 - ccVar.v1;
                        canvas3.clipRect(f205, f207 - f21, f206, f207);
                        ccVar.v0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f27) * 255.0f));
                        long j23 = 59000;
                        int min8 = (int) Math.min(ccVar.U - 1, j22 / 59000);
                        int i41 = 1;
                        while (i41 <= min8) {
                            if (Math.min(j23, j22 - (i41 * j23)) < 1000) {
                                break;
                            }
                            float f208 = ccVar.u1 + ccVar.t1;
                            xb xbVar10 = ccVar.h;
                            float f209 = ((((((long) (xbVar10.e * xbVar10.g)) + r2) - ccVar.f) / f177) * ccVar.q1) + f208;
                            float f210 = ccVar.s1 - ccVar.v1;
                            Paint paint6 = ccVar.v0;
                            Canvas canvas4 = canvas3;
                            canvas4.drawRect(f209, (ccVar.s1 - ccVar.v1) - f21, AndroidUtilities.dp(1.0f) + f209, f210, paint6);
                            canvas3 = canvas4;
                            StringBuilder sb2 = new StringBuilder("#");
                            i41++;
                            sb2.append(i41);
                            canvas3.drawText(sb2.toString(), f209 + AndroidUtilities.dp(2.0f), ((ccVar.s1 - ccVar.v1) - f21) + AndroidUtilities.dp(14.0f), ccVar.A0);
                            j23 = 59000;
                        }
                        canvas3.restore();
                        d10 = ccVar.X0.d(0.0f, false);
                        float contentHeight = ((ccVar.s1 - ccVar.getContentHeight()) + ccVar.v1) - AndroidUtilities.dpf2(2.3f);
                        float dpf25 = AndroidUtilities.dpf2(4.3f) + (ccVar.s1 - ccVar.v1);
                        if (d10 <= 0.0f) {
                            long j24 = ccVar.Y0;
                            if (j24 == -1) {
                                xb xbVar11 = ccVar.h;
                                if (xbVar11 != null) {
                                    j24 = (long) (xbVar11.e * xbVar11.h);
                                } else {
                                    xb xbVar12 = ccVar.v;
                                    if (xbVar12 != null) {
                                        j24 = (long) ((xbVar12.h - xbVar12.g) * xbVar12.e);
                                    } else {
                                        if (ccVar.A) {
                                            f34 = ccVar.D;
                                            f35 = ccVar.G;
                                        } else {
                                            f34 = ccVar.N;
                                            f35 = ccVar.P;
                                        }
                                        j24 = (long) (f34 * f35);
                                    }
                                }
                            }
                            ccVar = this;
                            ccVar.d(canvas3, contentHeight, dpf25, j24, d10 * f26);
                        } else {
                            ccVar = ccVar;
                        }
                        ccVar.d(canvas, contentHeight, dpf25, ccVar.e, (1.0f - d10) * f26);
                    }
                }
                d10 = ccVar.X0.d(0.0f, false);
                float contentHeight2 = ((ccVar.s1 - ccVar.getContentHeight()) + ccVar.v1) - AndroidUtilities.dpf2(2.3f);
                float dpf252 = AndroidUtilities.dpf2(4.3f) + (ccVar.s1 - ccVar.v1);
                if (d10 <= 0.0f) {
                }
                ccVar.d(canvas, contentHeight2, dpf252, ccVar.e, (1.0f - d10) * f26);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            j11 = j10;
        }
        if (ccVar.i1) {
            float f211 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f212 = ccVar.j1;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / ccVar.q1) * j11 * f211 * f212);
            if (ccVar.T0) {
                ccVar.j1 = (f211 * 0.25f) + f212;
            }
            int i42 = ccVar.d1;
            if (i42 == 4 && (xbVar2 = ccVar.h) != null) {
                float f213 = xbVar2.g;
                long j25 = ccVar.f;
                long j26 = xbVar2.e;
                float f214 = j26;
                if (f213 < j25 / f214) {
                    i11 = -1;
                } else if (xbVar2.h > (j25 + j11) / f214) {
                    i11 = 1;
                } else {
                    ccVar.j1 = 1.0f;
                    i11 = 0;
                }
                long j27 = i11 * dp2;
                ccVar.f = Utilities.clamp(j25 + j27, j26 - j11, 0L);
                ccVar.e += j27;
                xb xbVar13 = ccVar.h;
                float f215 = (r3 - j25) / xbVar13.e;
                if (f215 > 0.0f) {
                    f11 = 1.0f;
                    max = Math.min(1.0f - xbVar13.h, f215);
                } else {
                    f11 = 1.0f;
                    max = Math.max(0.0f - xbVar13.g, f215);
                }
                xb xbVar14 = ccVar.h;
                xbVar14.g = Utilities.clamp(xbVar14.g + max, f11, 0.0f);
                xb xbVar15 = ccVar.h;
                xbVar15.h = Utilities.clamp(xbVar15.h + max, f11, 0.0f);
                wb wbVar = ccVar.a;
                if (wbVar != null) {
                    wbVar.Z0(ccVar.h.g, false);
                    ccVar.a.X1(ccVar.h.h);
                }
                ccVar.invalidate();
            } else if (i42 == 8) {
                float f216 = ccVar.O;
                long j28 = ccVar.M;
                float f217 = (-j28) + 100;
                long j29 = ccVar.N;
                float f218 = j29;
                if (f216 < f217 / f218) {
                    i10 = -1;
                } else if (ccVar.P >= ((r8 + j11) - 100) / f218) {
                    i10 = 1;
                } else {
                    ccVar.j1 = 1.0f;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (ccVar.L && (xbVar = ccVar.h) != null) {
                        long j30 = j28 - (i10 * dp2);
                        float f219 = xbVar.h;
                        float f220 = xbVar.e;
                        ccVar.M = Utilities.clamp(j30, (long) ((f219 * f220) - (f216 * f218)), (long) ((xbVar.g * f220) - (ccVar.P * f218)));
                    } else if (ccVar.C && ccVar.A) {
                        long j31 = j28 - (i10 * dp2);
                        float f221 = ccVar.G;
                        float f222 = ccVar.D;
                        ccVar.M = Utilities.clamp(j31, (long) ((f221 * f222) - (f216 * f218)), (long) ((ccVar.F * f222) - (ccVar.P * f218)));
                    } else {
                        ccVar.M = Utilities.clamp(j28 - (i10 * dp2), 0L, -(j29 - Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration())));
                    }
                    float f223 = (-(ccVar.M - j28)) / ccVar.N;
                    float min9 = f223 > 0.0f ? Math.min(1.0f - ccVar.P, f223) : Math.max(0.0f - ccVar.O, f223);
                    if (ccVar.h == null) {
                        float f224 = ccVar.e;
                        float f225 = ccVar.N;
                        ccVar.e = (long) Utilities.clamp((min9 * f225) + f224, f225, 0.0f);
                    }
                    ccVar.O = Utilities.clamp(ccVar.O + min9, 1.0f, 0.0f);
                    ccVar.P = Utilities.clamp(ccVar.P + min9, 1.0f, 0.0f);
                    wb wbVar2 = ccVar.a;
                    if (wbVar2 != null) {
                        wbVar2.C1(ccVar.O);
                        ccVar.a.p1(ccVar.P);
                        ccVar.a.P(ccVar.e, false);
                    }
                    ccVar.invalidate();
                } else {
                    ccVar.j1 = 1.0f;
                }
            } else {
                ccVar.j1 = 1.0f;
            }
        } else {
            ccVar.j1 = 1.0f;
        }
        int contentHeight3 = ccVar.getContentHeight();
        if (ccVar.c != contentHeight3) {
            ccVar.c = contentHeight3;
            Runnable runnable = ccVar.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f12 - AndroidUtilities.dp(10.0f), f10, AndroidUtilities.dp(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.r1, this.s1, 255, 31);
        int i10 = (int) (255.0f * f14);
        Paint paint2 = this.v0;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.inset(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        boolean z10 = this.T0;
        Paint paint3 = this.w0;
        if (z10) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint4 = this.x0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(255);
        paint5.setAlpha(i10);
        float f15 = f10 + f11;
        float f16 = (f15 - dp2) / 2.0f;
        float f17 = (f15 + dp2) / 2.0f;
        rectF.set(org.telegram.messenger.y1.a(AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f), dp, 2.0f, f12), f16, f12 - ((AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f) + dp) / 2.0f), f17);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.T0) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.recaptcha.internal.a.A(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), dp, 2.0f, f13), f16, i0.a.c(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), dp, 2.0f, f13), f17);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.U * 59000;
    }

    public final long g() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public int getContentHeight() {
        return (int) (this.v1 + (this.h != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.A ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.J ? AndroidUtilities.dp(4.0f) + getAudioHeight() : 0.0f) + this.v1);
    }

    public int getMaxCount() {
        return this.U;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, (long) (f() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.v1 + this.v1, getContentHeight(), this.e0.c);
    }

    public final void h(float f10) {
        float f11;
        long j10;
        float f12;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        wb wbVar;
        long clamp;
        xb xbVar = this.h;
        if (xbVar == null && !this.A) {
            long j16 = this.M;
            long clamp2 = Utilities.clamp(j16 + ((long) f10), 0L, -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.M = clamp2;
            float f13 = clamp2 - j16;
            this.O = Utilities.clamp(this.O - (f13 / this.N), 1.0f, 0.0f);
            this.P = Utilities.clamp(this.P - (f13 / this.N), 1.0f, 0.0f);
            wb wbVar2 = this.a;
            if (wbVar2 != null) {
                wbVar2.C1(this.O);
                this.a.p1(this.P);
            }
        } else if (this.L) {
            if (xbVar != null) {
                f11 = xbVar.g;
                j10 = xbVar.e;
            } else {
                f11 = this.F;
                j10 = this.D;
            }
            float f14 = f11 * j10;
            if (xbVar != null) {
                f12 = xbVar.h;
                j11 = xbVar.e;
            } else {
                f12 = this.G;
                j11 = this.D;
            }
            float f15 = f12 * j11;
            float f16 = xbVar != null ? (xbVar.h - xbVar.g) * xbVar.e : this.D * (this.G - this.F);
            float f17 = this.P;
            float f18 = this.N;
            long j17 = (long) (f15 - (f17 * f18));
            float f19 = this.O;
            long j18 = (long) (f14 - (f19 * f18));
            float min = Math.min(f17 - f19, f16 / f18);
            long j19 = this.M;
            long j20 = (long) f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                float clamp3 = Utilities.clamp(((f15 - j19) - j20) / this.N, 1.0f, min);
                this.P = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.O = clamp4;
                float f20 = this.P;
                float f21 = this.N;
                long j22 = (long) (f15 - (f20 * f21));
                long j23 = (long) (f14 - (clamp4 * f21));
                if (j22 < j23) {
                    j15 = j23;
                    j14 = j22;
                } else {
                    j14 = j23;
                    j15 = j22;
                }
                this.M = Utilities.clamp(this.M + j20, j15, j14);
                wb wbVar3 = this.a;
                if (wbVar3 != null) {
                    wbVar3.C1(this.O);
                    this.a.p1(this.P);
                }
            } else if (j21 < j18) {
                float clamp5 = Utilities.clamp(((f14 - j19) - j20) / this.N, 1.0f - min, 0.0f);
                this.O = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.P = clamp6;
                float f22 = this.N;
                long j24 = (long) (f15 - (clamp6 * f22));
                long j25 = (long) (f14 - (this.O * f22));
                if (j24 < j25) {
                    j13 = j25;
                    j12 = j24;
                } else {
                    j12 = j25;
                    j13 = j24;
                }
                this.M = Utilities.clamp(this.M + j20, j13, j12);
                wb wbVar4 = this.a;
                if (wbVar4 != null) {
                    wbVar4.C1(this.O);
                    this.a.p1(this.P);
                }
            } else {
                this.M = j21;
            }
        } else {
            long j26 = this.M + ((long) f10);
            float baseDuration = getBaseDuration();
            float f23 = this.N;
            this.M = Utilities.clamp(j26, (long) (baseDuration - (this.P * f23)), (long) ((-this.O) * f23));
        }
        invalidate();
        wb wbVar5 = this.a;
        if (wbVar5 != null) {
            wbVar5.j2(this.M + ((long) (this.O * this.N)));
        }
        boolean z10 = this.i1;
        if (z10 || (wbVar = this.a) == null) {
            if (z10 || this.n1) {
                xb xbVar2 = this.h;
                if (xbVar2 != null) {
                    long j27 = this.M + ((long) (this.O * this.N));
                    float f24 = xbVar2.h;
                    float f25 = xbVar2.e;
                    this.e = Utilities.clamp(j27, (long) (f24 * f25), (long) (xbVar2.g * f25));
                } else if (!this.A || xbVar2 == null) {
                    float f26 = this.O;
                    long j28 = this.N;
                    this.e = Utilities.clamp((long) (f26 * j28), j28, 0L);
                } else {
                    long j29 = this.M + ((long) (this.O * this.N));
                    float f27 = this.G;
                    float f28 = xbVar2.e;
                    this.e = Utilities.clamp(j29, (long) (f27 * f28), (long) (this.F * f28));
                }
                wb wbVar6 = this.a;
                if (wbVar6 != null) {
                    wbVar6.P(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.I0(true);
        xb xbVar3 = this.h;
        if (xbVar3 != null) {
            long j30 = this.M + ((long) (this.O * this.N));
            float f29 = xbVar3.h;
            float f30 = xbVar3.e;
            clamp = Utilities.clamp(j30, (long) (f29 * f30), (long) (xbVar3.g * f30));
        } else if (this.A) {
            long j31 = this.M + ((long) (this.O * this.N));
            float f31 = this.G;
            float f32 = this.D;
            clamp = Utilities.clamp(j31, (long) (f31 * f32), (long) (this.F * f32));
        } else {
            float f33 = this.O;
            long j32 = this.N;
            clamp = Utilities.clamp((long) (f33 * j32), j32, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        wb wbVar7 = this.a;
        this.e = clamp;
        wbVar7.P(clamp, false);
    }

    public final void i(xb xbVar, float f10) {
        wb wbVar;
        long clamp;
        long j10;
        long j11;
        long j12;
        long j13;
        if (xbVar == null) {
            return;
        }
        xb xbVar2 = this.v;
        if (xbVar2 != xbVar && xbVar2 != null) {
            if (this.n == this.s.indexOf(xbVar)) {
                xb xbVar3 = this.v;
                float f11 = xbVar3.e;
                float f12 = xbVar.h;
                float f13 = xbVar.e;
                long j14 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = xbVar.g;
                long j15 = (long) ((f11 * 0.0f) - (f14 * f13));
                float min = Math.min(f12 - f14, ((xbVar3.h - xbVar3.g) * f11) / f13);
                long j16 = xbVar.f;
                long j17 = (long) f10;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float clamp2 = Utilities.clamp((((this.v.h * r2.e) - j16) - j17) / xbVar.e, 1.0f, min);
                    xbVar.h = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    xbVar.g = clamp3;
                    xb xbVar4 = this.v;
                    float f15 = xbVar4.h;
                    float f16 = xbVar4.e;
                    float f17 = xbVar.h;
                    float f18 = xbVar.e;
                    long j19 = (long) ((f15 * f16) - (f17 * f18));
                    long j20 = (long) ((xbVar4.g * f16) - (clamp3 * f18));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    xbVar.f = Utilities.clamp(xbVar.f + j17, j13, j12);
                    wb wbVar2 = this.a;
                    if (wbVar2 != null) {
                        wbVar2.n1(xbVar.g, xbVar.a);
                        this.a.W1(xbVar.h, xbVar.a);
                    }
                } else if (j18 < j15) {
                    float clamp4 = Utilities.clamp((((this.v.g * r2.e) - j16) - j17) / xbVar.e, 1.0f - min, 0.0f);
                    xbVar.g = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    xbVar.h = clamp5;
                    xb xbVar5 = this.v;
                    float f19 = xbVar5.h;
                    float f20 = xbVar5.e;
                    float f21 = xbVar.e;
                    long j21 = (long) ((f19 * f20) - (clamp5 * f21));
                    long j22 = (long) ((xbVar5.g * f20) - (xbVar.g * f21));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    xbVar.f = Utilities.clamp(xbVar.f + j17, j11, j10);
                    wb wbVar3 = this.a;
                    if (wbVar3 != null) {
                        wbVar3.n1(xbVar.g, xbVar.a);
                        this.a.W1(xbVar.h, xbVar.a);
                    }
                } else {
                    xbVar.f = j18;
                }
            } else {
                long j23 = xbVar.f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = xbVar.e;
                xbVar.f = Utilities.clamp(j23, (long) (baseDuration - (xbVar.h * f22)), (long) ((-xbVar.g) * f22));
            }
        }
        invalidate();
        wb wbVar4 = this.a;
        if (wbVar4 != null) {
            wbVar4.g2(xbVar.a, xbVar.f);
        }
        boolean z10 = this.i1;
        if (z10 || (wbVar = this.a) == null) {
            if (z10 || this.n1) {
                xb xbVar6 = this.v;
                if (xbVar6 == xbVar || xbVar6 == null) {
                    float f23 = xbVar.g;
                    long j24 = xbVar.e;
                    this.e = Utilities.clamp((long) (f23 * j24), j24, 0L);
                } else {
                    long j25 = xbVar.f + ((long) (xbVar.g * xbVar.e));
                    float f24 = xbVar6.h;
                    float f25 = xbVar6.e;
                    this.e = Utilities.clamp(j25, (long) (f24 * f25), (long) (xbVar6.g * f25));
                }
                wb wbVar5 = this.a;
                if (wbVar5 != null) {
                    wbVar5.P(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.I0(true);
        xb xbVar7 = this.v;
        if (xbVar7 == xbVar || xbVar7 == null) {
            float f26 = xbVar.g;
            long j26 = xbVar.e;
            clamp = Utilities.clamp((long) (f26 * j26), j26, 0L);
        } else {
            long j27 = xbVar.f + ((long) (xbVar.g * xbVar.e));
            float f27 = xbVar7.h;
            float f28 = xbVar7.e;
            clamp = Utilities.clamp(j27, (long) (f27 * f28), (long) (xbVar7.g * f28));
        }
        xb xbVar8 = this.v;
        if (xbVar8 != xbVar && xbVar8 != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        wb wbVar6 = this.a;
        this.e = clamp;
        wbVar6.P(clamp, false);
    }

    public final void j(float f10) {
        long j10;
        long j11;
        long j12;
        long j13;
        wb wbVar;
        long clamp;
        xb xbVar = this.h;
        if (xbVar == null) {
            long j14 = this.E;
            long clamp2 = Utilities.clamp(j14 + ((long) f10), 0L, -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.E = clamp2;
            float f11 = clamp2 - j14;
            this.F = Utilities.clamp(this.F - (f11 / this.D), 1.0f, 0.0f);
            this.G = Utilities.clamp(this.G - (f11 / this.D), 1.0f, 0.0f);
            wb wbVar2 = this.a;
            if (wbVar2 != null) {
                wbVar2.w0(this.F);
                this.a.e2(this.G);
            }
        } else if (this.C) {
            float f12 = xbVar.h;
            float f13 = xbVar.e;
            float f14 = this.G;
            float f15 = this.D;
            long j15 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = xbVar.g;
            float f17 = this.F;
            long j16 = (long) ((f16 * f13) - (f17 * f15));
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j17 = this.E;
            long j18 = (long) f10;
            long j19 = j17 + j18;
            if (j19 > j15) {
                float clamp3 = Utilities.clamp((((this.h.h * r1.e) - j17) - j18) / this.D, 1.0f, min);
                this.G = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.F = clamp4;
                xb xbVar2 = this.h;
                float f18 = xbVar2.h;
                float f19 = xbVar2.e;
                float f20 = this.G;
                float f21 = this.D;
                long j20 = (long) ((f18 * f19) - (f20 * f21));
                long j21 = (long) ((xbVar2.g * f19) - (clamp4 * f21));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.E = Utilities.clamp(this.E + j18, j13, j12);
                wb wbVar3 = this.a;
                if (wbVar3 != null) {
                    wbVar3.w0(this.F);
                    this.a.e2(this.G);
                }
            } else if (j19 < j16) {
                float clamp5 = Utilities.clamp((((this.h.g * r1.e) - j17) - j18) / this.D, 1.0f - min, 0.0f);
                this.F = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.G = clamp6;
                xb xbVar3 = this.h;
                float f22 = xbVar3.h;
                float f23 = xbVar3.e;
                float f24 = this.D;
                long j22 = (long) ((f22 * f23) - (clamp6 * f24));
                long j23 = (long) ((xbVar3.g * f23) - (this.F * f24));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.E = Utilities.clamp(this.E + j18, j11, j10);
                wb wbVar4 = this.a;
                if (wbVar4 != null) {
                    wbVar4.w0(this.F);
                    this.a.e2(this.G);
                }
            } else {
                this.E = j19;
            }
        } else {
            long j24 = this.E + ((long) f10);
            float baseDuration = getBaseDuration();
            float f25 = this.D;
            this.E = Utilities.clamp(j24, (long) (baseDuration - (this.G * f25)), (long) ((-this.F) * f25));
        }
        invalidate();
        wb wbVar5 = this.a;
        if (wbVar5 != null) {
            wbVar5.i1(this.E + ((long) (this.F * this.D)));
        }
        boolean z10 = this.i1;
        if (z10 || (wbVar = this.a) == null) {
            if (z10 || this.n1) {
                xb xbVar4 = this.h;
                if (xbVar4 != null) {
                    long j25 = this.E + ((long) (this.F * this.D));
                    float f26 = xbVar4.h;
                    float f27 = xbVar4.e;
                    this.e = Utilities.clamp(j25, (long) (f26 * f27), (long) (xbVar4.g * f27));
                } else {
                    float f28 = this.F;
                    long j26 = this.D;
                    this.e = Utilities.clamp((long) (f28 * j26), j26, 0L);
                }
                wb wbVar6 = this.a;
                if (wbVar6 != null) {
                    wbVar6.P(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.I0(true);
        xb xbVar5 = this.h;
        if (xbVar5 != null) {
            long j27 = this.E + ((long) (this.F * this.D));
            float f29 = xbVar5.h;
            float f30 = xbVar5.e;
            clamp = Utilities.clamp(j27, (long) (f29 * f30), (long) (xbVar5.g * f30));
        } else {
            float f31 = this.F;
            long j28 = this.D;
            clamp = Utilities.clamp((long) (f31 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        wb wbVar7 = this.a;
        this.e = clamp;
        wbVar7.P(clamp, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        xb xbVar = this.h;
        float f10 = (xbVar.h + xbVar.g) / 2.0f;
        long j10 = xbVar.e;
        this.f = Utilities.clamp((long) ((f10 * j10) - (min / 2.0f)), j10 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        if (z10 && this.A) {
            this.C = true;
            this.L = false;
        } else {
            this.C = false;
            this.L = this.J && this.h == null;
        }
        invalidate();
    }

    public final boolean m(float f10, boolean z10) {
        xb xbVar = this.h;
        ArrayList arrayList = this.s;
        if (xbVar == null && !this.J && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.u1) - this.t1) / this.q1;
        xb xbVar2 = this.v;
        long j10 = xbVar2 != null ? (long) ((xbVar2.g * xbVar2.e) + xbVar2.f) : 0L;
        float f12 = f11 * min;
        if (xbVar2 == null) {
            j10 = this.h == null ? this.M : 0L;
        }
        long clamp = (long) Utilities.clamp((f12 - j10) + this.f, getBaseDuration(), 0.0f);
        xb xbVar3 = this.h;
        if (xbVar3 != null) {
            float f13 = clamp / xbVar3.e;
            if (f13 < xbVar3.g || f13 > xbVar3.h) {
                return false;
            }
        }
        xb xbVar4 = this.v;
        if (xbVar4 != null && (clamp < 0 || clamp >= ((long) ((xbVar4.h - xbVar4.g) * xbVar4.e)))) {
            return false;
        }
        if (this.J && xbVar3 == null && arrayList.isEmpty()) {
            float f14 = clamp / this.N;
            if (f14 < this.O || f14 > this.P) {
                return false;
            }
        }
        this.e = clamp;
        invalidate();
        wb wbVar = this.a;
        if (wbVar != null) {
            wbVar.P(clamp, z10);
        }
        cg.b2 b2Var = this.Z0;
        if (b2Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b2Var);
            this.Z0 = null;
        }
        if (!z10) {
            return true;
        }
        cg.b2 b2Var2 = new cg.b2(this, clamp, 11);
        this.Z0 = b2Var2;
        AndroidUtilities.runOnUIThread(b2Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z10) {
        long j12;
        boolean z11;
        boolean z12;
        xb xbVar;
        if (TextUtils.equals(this.B, str)) {
            return;
        }
        ac acVar = this.I;
        if (acVar != null) {
            acVar.b();
            this.I = null;
        }
        long j13 = this.D;
        if (str != null) {
            this.B = str;
            this.D = j10;
            this.E = j11 - ((long) (j10 * f10));
            this.F = f10;
            this.G = f11;
            this.H = f12;
            if (getMeasuredWidth() <= 0 || this.I != null || ((xbVar = this.h) != null && xbVar.e < 1)) {
                j12 = j13;
                z12 = false;
                z11 = true;
            } else {
                String str2 = this.B;
                int i10 = this.r1;
                int i11 = this.u1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.D;
                Long valueOf = j14 > 2 ? Long.valueOf(j14) : null;
                xb xbVar2 = this.h;
                j12 = j13;
                z12 = false;
                z11 = true;
                this.I = new ac(this, false, str2, i12, dp, valueOf, xbVar2 != null ? xbVar2.e : getMaxScrollDuration(), -1L, -1L, new tb(this, 0));
            }
            if (this.h == null) {
                this.L = z12;
                this.C = z11;
            }
        } else {
            j12 = j13;
            z11 = true;
            this.B = null;
            this.D = 1L;
            this.C = false;
        }
        this.A = this.B != null;
        if (j12 != j10 && this.h == null && this.T != null) {
            this.S = z11;
            p();
        }
        if (this.J && this.A && this.h == null) {
            this.O = 0.0f;
            this.P = Utilities.clamp(j10 / this.N, 1.0f, 0.0f);
        }
        if (!z10) {
            this.W.f(this.C, z11);
            this.b0.f(this.L, z11);
            this.V.f(this.A, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f10) {
        xb xbVar = this.h;
        if (TextUtils.equals(xbVar == null ? null : xbVar.d, str)) {
            return;
        }
        xb xbVar2 = this.h;
        if (xbVar2 != null) {
            ac acVar = xbVar2.c;
            if (acVar != null) {
                acVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            xb xbVar3 = new xb(this);
            this.h = xbVar3;
            xbVar3.b = z10;
            xbVar3.d = str;
            xbVar3.e = j10;
            xbVar3.i = f10;
            xb.a(xbVar3, false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.A) {
            this.C = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.H0.setTextSize(AndroidUtilities.dp(12.0f));
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.u1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.v1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.r1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.s1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.t1 = dp4;
        this.q1 = (this.r1 - (dp4 * 2)) - (this.u1 * 2);
        xb xbVar = this.h;
        if (xbVar != null && xbVar.d != null && xbVar.c == null) {
            xb.a(xbVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                xb xbVar2 = (xb) obj;
                if (xbVar2.d != null && xbVar2.c == null) {
                    xb.a(xbVar2, false);
                    xb.b(xbVar2);
                }
            }
        }
        if (this.K == null || this.T != null) {
            return;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0dce  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        cg.b2 b2Var;
        boolean z11;
        VelocityTracker velocityTracker;
        wb wbVar;
        VelocityTracker velocityTracker2;
        long j10;
        boolean z12;
        long j11;
        long j12;
        long j13;
        float f10;
        VelocityTracker velocityTracker3;
        long j14;
        long j15;
        VelocityTracker velocityTracker4;
        VelocityTracker velocityTracker5;
        Runnable runnable;
        VelocityTracker velocityTracker6;
        float min;
        float max;
        float min2;
        boolean z13;
        float max2;
        boolean z14;
        wb wbVar2;
        int i10;
        float f11;
        float f12;
        boolean z15;
        float f13;
        float clamp;
        wb wbVar3;
        wb wbVar4;
        int i11;
        float f14;
        float f15;
        xb xbVar = this.h;
        ArrayList arrayList = this.s;
        if (xbVar != null || !arrayList.isEmpty() || this.J || this.A) {
            float timelineHeight = this.s1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                bm0 bm0Var = this.S0;
                cg.k0 k0Var = this.U0;
                if (action == 0) {
                    cg.b2 b2Var2 = this.Z0;
                    if (b2Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(b2Var2);
                        this.Z0 = null;
                    }
                    bm0Var.a();
                    this.e1 = -1;
                    this.d1 = c(motionEvent);
                    this.f1 = -1;
                    this.g1 = -1;
                    int i12 = this.s1 - this.v1;
                    if (!this.f0) {
                        if (this.k0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f1 = 10;
                            this.d1 = -1;
                        }
                    }
                    if (this.f1 != -1 || this.h == null) {
                        f14 = 4.0f;
                    } else {
                        float f16 = i12;
                        if (motionEvent.getY() < f16) {
                            f14 = 4.0f;
                            if (motionEvent.getY() > (f16 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.f1 = 0;
                            }
                        } else {
                            f14 = 4.0f;
                        }
                        i12 = (int) (f16 - (getVideoHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.f1 == -1 && !arrayList.isEmpty()) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            f15 = 2.0f;
                            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((xb) arrayList.get(i13)).k.c);
                            float f17 = i12;
                            if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - lerp) - AndroidUtilities.dp(2.0f)) {
                                this.f1 = 3;
                                this.g1 = i13;
                                break;
                            }
                            i12 = (int) (f17 - (lerp + AndroidUtilities.dp(f14)));
                        }
                    }
                    f15 = 2.0f;
                    if (this.f1 == -1 && this.A) {
                        float f18 = i12;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getRoundHeight()) - AndroidUtilities.dp(f15)) {
                            this.f1 = 1;
                        }
                        i12 = (int) (f18 - (getRoundHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.f1 == -1 && this.J) {
                        float f19 = i12;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getAudioHeight()) - AndroidUtilities.dp(f15)) {
                            this.f1 = 2;
                        }
                        getAudioHeight();
                        AndroidUtilities.dp(f14);
                    }
                    this.b1 = System.currentTimeMillis();
                    int i14 = this.d1;
                    this.h1 = i14 == 0 || i14 == -1 || i14 == 1;
                    this.k1 = false;
                    if (i14 == 1 || i14 == 5 || i14 == 8) {
                        this.l1 = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker7 = this.l1;
                        if (velocityTracker7 != null) {
                            velocityTracker7.recycle();
                            this.l1 = null;
                        }
                    }
                    this.j1 = 1.0f;
                    this.i1 = false;
                    this.c1 = motionEvent.getX();
                    if (!this.T0) {
                        AndroidUtilities.cancelRunOnUIThread(k0Var);
                        AndroidUtilities.runOnUIThread(k0Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x8 = motionEvent.getX() - this.c1;
                    if (this.f0 && (this.i1 || Math.abs(x8) > AndroidUtilities.touchSlop)) {
                        long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                        xb xbVar2 = this.h;
                        if (xbVar2 != null && this.d1 == 1) {
                            this.f = (long) Utilities.clamp(this.f - ((x8 / this.q1) * min3), xbVar2.e - min3, 0.0f);
                            invalidate();
                            if (!this.i1) {
                                this.j1 = 1.0f;
                            }
                            this.i1 = true;
                            this.h1 = false;
                        } else if (xbVar2 == null || !((i11 = this.d1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.d1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f20 = (min3 / this.N) * (x8 / this.q1);
                                if (i15 == 6) {
                                    float g10 = this.P - (g() / this.N);
                                    float max3 = Math.max(0L, this.f - this.M);
                                    float f21 = this.N;
                                    float f22 = max3 / f21;
                                    xb xbVar3 = this.h;
                                    if (xbVar3 != null) {
                                        max = Math.max(f22, (((xbVar3.g * xbVar3.e) + this.f) - this.M) / f21);
                                    } else {
                                        xb xbVar4 = this.v;
                                        if (xbVar4 != null) {
                                            max = Math.max(f22, (((xbVar4.g * xbVar4.e) + this.f) - this.M) / f21);
                                        } else if (this.A) {
                                            max = Math.max(f22, (((this.F * this.D) + this.f) - this.M) / f21);
                                        } else {
                                            max = Math.max(f22, this.P - (f() / this.N));
                                            if (!this.k1 && f20 < 0.0f && this.O <= this.P - (f() / this.N)) {
                                                this.d1 = 8;
                                            }
                                        }
                                    }
                                    float f23 = this.O;
                                    float clamp2 = Utilities.clamp(f23 + f20, g10, max);
                                    this.O = clamp2;
                                    if (Math.abs(f23 - clamp2) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    wb wbVar5 = this.a;
                                    if (wbVar5 != null) {
                                        wbVar5.j2(this.M + ((long) (this.O * this.N)));
                                    }
                                    wb wbVar6 = this.a;
                                    if (wbVar6 != null) {
                                        wbVar6.C1(this.O);
                                    }
                                } else if (i15 == 7) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.M) + min3) / this.N);
                                    float f24 = this.O;
                                    float g11 = g();
                                    float f25 = this.N;
                                    float f26 = (g11 / f25) + f24;
                                    xb xbVar5 = this.h;
                                    if (xbVar5 != null) {
                                        min = Math.min(min4, (((xbVar5.h * xbVar5.e) + this.f) - this.M) / f25);
                                    } else {
                                        xb xbVar6 = this.v;
                                        if (xbVar6 != null) {
                                            min = Math.min(min4, (((xbVar6.h * xbVar6.e) + this.f) - this.M) / f25);
                                        } else if (this.A) {
                                            min = Math.min(min4, (((this.G * this.D) + this.f) - this.M) / f25);
                                        } else {
                                            min = Math.min(min4, (f() / this.N) + this.O);
                                            if (!this.k1 && f20 > 0.0f) {
                                                if (this.P >= (f() / this.N) + this.O) {
                                                    this.d1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f27 = this.P;
                                    float clamp3 = Utilities.clamp(f27 + f20, min, f26);
                                    this.P = clamp3;
                                    if (Math.abs(f27 - clamp3) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    wb wbVar7 = this.a;
                                    if (wbVar7 != null) {
                                        wbVar7.p1(this.P);
                                    }
                                }
                                if (this.d1 == 8) {
                                    float min5 = f20 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.M) + min3) / this.N) - this.P), f20) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.M) / this.N) - this.O), f20);
                                    float f28 = this.O + min5;
                                    this.O = f28;
                                    this.P += min5;
                                    wb wbVar8 = this.a;
                                    if (wbVar8 != null) {
                                        wbVar8.C1(f28);
                                        this.a.j2(this.M + ((long) (this.O * this.N)));
                                        this.a.p1(this.P);
                                    }
                                    wb wbVar9 = this.a;
                                    if (wbVar9 != null) {
                                        wbVar9.I0(true);
                                    }
                                }
                                if (this.h == null && !this.A) {
                                    this.e = (long) (this.O * this.N);
                                    wb wbVar10 = this.a;
                                    if (wbVar10 != null) {
                                        wbVar10.I0(true);
                                        this.a.P(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.i1) {
                                    this.j1 = 1.0f;
                                }
                                this.i1 = true;
                                this.h1 = false;
                            } else if (i15 == 10 || i15 == 11 || i15 == 12) {
                                float f29 = (min3 / this.D) * (x8 / this.q1);
                                if (i15 == 10) {
                                    float g12 = this.G - (g() / this.D);
                                    float max4 = Math.max(0L, this.f - this.E);
                                    float f30 = this.D;
                                    float f31 = max4 / f30;
                                    xb xbVar7 = this.h;
                                    if (xbVar7 != null) {
                                        max2 = Math.max(f31, (((xbVar7.g * xbVar7.e) + this.f) - this.E) / f30);
                                    } else {
                                        xb xbVar8 = this.v;
                                        if (xbVar8 != null) {
                                            max2 = Math.max(f31, (((xbVar8.g * xbVar8.e) + this.f) - this.E) / f30);
                                        } else {
                                            max2 = Math.max(f31, this.G - (f() / this.D));
                                            if (!this.k1 && f29 < 0.0f && this.F <= this.G - (f() / this.D)) {
                                                this.d1 = 8;
                                            }
                                        }
                                    }
                                    float f32 = this.F;
                                    float clamp4 = Utilities.clamp(f32 + f29, g12, max2);
                                    this.F = clamp4;
                                    if (Math.abs(f32 - clamp4) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    wb wbVar11 = this.a;
                                    if (wbVar11 != null) {
                                        wbVar11.i1(this.E + ((long) (this.F * this.D)));
                                    }
                                    wb wbVar12 = this.a;
                                    if (wbVar12 != null) {
                                        wbVar12.w0(this.F);
                                    }
                                } else if (i15 == 11) {
                                    float min6 = Math.min(1.0f, Math.max(0L, (this.f - this.E) + min3) / this.D);
                                    float f33 = this.F;
                                    float g13 = g();
                                    float f34 = this.D;
                                    float f35 = (g13 / f34) + f33;
                                    xb xbVar9 = this.h;
                                    if (xbVar9 != null) {
                                        min6 = Math.min(min6, (((xbVar9.h * xbVar9.e) + this.f) - this.E) / f34);
                                    }
                                    xb xbVar10 = this.v;
                                    if (xbVar10 != null) {
                                        min2 = Math.min(min6, (((xbVar10.h * xbVar10.e) + this.f) - this.E) / this.D);
                                    } else {
                                        min2 = Math.min(min6, (f() / this.D) + this.F);
                                        if (!this.k1 && f29 > 0.0f) {
                                            if (this.G >= (f() / this.D) + this.F) {
                                                this.d1 = 8;
                                            }
                                        }
                                    }
                                    float f36 = this.G;
                                    float clamp5 = Utilities.clamp(f36 + f29, min2, f35);
                                    this.G = clamp5;
                                    if (Math.abs(f36 - clamp5) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    wb wbVar13 = this.a;
                                    if (wbVar13 != null) {
                                        wbVar13.e2(this.G);
                                    }
                                }
                                if (this.d1 == 12) {
                                    float min7 = f29 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.E) + min3) / this.D) - this.G, f29) : Math.max((Math.max(0L, this.f - this.E) / this.D) - this.F, f29);
                                    float f37 = this.F + min7;
                                    this.F = f37;
                                    this.G += min7;
                                    wb wbVar14 = this.a;
                                    if (wbVar14 != null) {
                                        wbVar14.w0(f37);
                                        this.a.i1(this.E + ((long) (this.F * this.D)));
                                        this.a.e2(this.G);
                                    }
                                    wb wbVar15 = this.a;
                                    if (wbVar15 != null) {
                                        wbVar15.I0(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.F * this.D);
                                    wb wbVar16 = this.a;
                                    if (wbVar16 != null) {
                                        wbVar16.I0(true);
                                        z13 = false;
                                        this.a.P(this.e, false);
                                        invalidate();
                                        if (!this.i1) {
                                            this.j1 = 1.0f;
                                        }
                                        this.i1 = true;
                                        this.h1 = z13;
                                    }
                                }
                                z13 = false;
                                invalidate();
                                if (!this.i1) {
                                }
                                this.i1 = true;
                                this.h1 = z13;
                            } else {
                                int i16 = this.e1;
                                if (i16 < 0 || i16 >= arrayList.size() || !((i10 = this.d1) == 13 || i10 == 14 || i10 == 15)) {
                                    int i17 = this.d1;
                                    if (i17 == 5) {
                                        h((x8 / this.q1) * min3);
                                        if (!this.i1) {
                                            this.j1 = 1.0f;
                                        }
                                        this.i1 = true;
                                        this.h1 = false;
                                    } else if (i17 == 9) {
                                        j((x8 / this.q1) * min3);
                                        if (!this.i1) {
                                            this.j1 = 1.0f;
                                        }
                                        this.i1 = true;
                                        this.h1 = false;
                                    } else {
                                        int i18 = this.e1;
                                        if (i18 >= 0 && i18 < arrayList.size() && this.d1 == 16) {
                                            i((xb) arrayList.get(this.e1), (x8 / this.q1) * min3);
                                            if (!this.i1) {
                                                this.j1 = 1.0f;
                                            }
                                            this.i1 = true;
                                            this.h1 = false;
                                        } else if (this.h1) {
                                            m(motionEvent.getX(), currentTimeMillis - this.a1 < 350);
                                            if (this.i1 || (wbVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                wbVar2.I0(true);
                                            }
                                            if (!this.i1) {
                                                this.j1 = 1.0f;
                                            }
                                            this.i1 = z14;
                                        }
                                    }
                                } else {
                                    xb xbVar11 = (xb) arrayList.get(this.e1);
                                    float f38 = (min3 / xbVar11.e) * (x8 / this.q1);
                                    int i19 = this.d1;
                                    if (i19 == 13) {
                                        float g14 = xbVar11.h - (g() / xbVar11.e);
                                        float max5 = Math.max(0L, this.f - xbVar11.f) / xbVar11.e;
                                        if (xbVar11 == this.v) {
                                            f11 = f38;
                                            max5 = Math.max(max5, xbVar11.h - (f() / xbVar11.e));
                                            if (!this.k1 && f11 < 0.0f) {
                                                f12 = 0.0f;
                                                if (xbVar11.g <= xbVar11.h - (f() / xbVar11.e)) {
                                                    this.d1 = 15;
                                                }
                                                f13 = xbVar11.g;
                                                clamp = Utilities.clamp(f13 + f11, g14, max5);
                                                xbVar11.g = clamp;
                                                if (Math.abs(f13 - clamp) > 0.01f) {
                                                    this.k1 = true;
                                                }
                                                wbVar3 = this.a;
                                                if (wbVar3 != null) {
                                                    wbVar3.g2(xbVar11.a, xbVar11.f);
                                                }
                                                wbVar4 = this.a;
                                                if (wbVar4 != null) {
                                                    wbVar4.n1(xbVar11.g, xbVar11.a);
                                                }
                                            }
                                        } else {
                                            f11 = f38;
                                        }
                                        f12 = 0.0f;
                                        f13 = xbVar11.g;
                                        clamp = Utilities.clamp(f13 + f11, g14, max5);
                                        xbVar11.g = clamp;
                                        if (Math.abs(f13 - clamp) > 0.01f) {
                                        }
                                        wbVar3 = this.a;
                                        if (wbVar3 != null) {
                                        }
                                        wbVar4 = this.a;
                                        if (wbVar4 != null) {
                                        }
                                    } else {
                                        f11 = f38;
                                        f12 = 0.0f;
                                        if (i19 == 14) {
                                            float min8 = Math.min(1.0f, Math.max(0L, (this.f - xbVar11.f) + min3) / xbVar11.e);
                                            float g15 = (g() / xbVar11.e) + xbVar11.g;
                                            if (xbVar11 == this.v) {
                                                min8 = Math.min(min8, (f() / xbVar11.e) + xbVar11.g);
                                                if (!this.k1 && f11 > 0.0f) {
                                                    if (xbVar11.h >= (f() / xbVar11.e) + xbVar11.g) {
                                                        this.d1 = 15;
                                                    }
                                                }
                                            }
                                            float f39 = xbVar11.h;
                                            float clamp6 = Utilities.clamp(f39 + f11, min8, g15);
                                            xbVar11.h = clamp6;
                                            if (Math.abs(f39 - clamp6) > 0.01f) {
                                                this.k1 = true;
                                            }
                                            wb wbVar17 = this.a;
                                            if (wbVar17 != null) {
                                                wbVar17.W1(xbVar11.h, xbVar11.a);
                                            }
                                        }
                                    }
                                    if (this.d1 == 15) {
                                        float min9 = f11 > f12 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - xbVar11.f) + min3) / xbVar11.e) - xbVar11.h, f11) : Math.max((Math.max(0L, this.f - xbVar11.f) / xbVar11.e) - xbVar11.g, f11);
                                        float f40 = xbVar11.g + min9;
                                        xbVar11.g = f40;
                                        xbVar11.h += min9;
                                        wb wbVar18 = this.a;
                                        if (wbVar18 != null) {
                                            wbVar18.n1(f40, xbVar11.a);
                                            this.a.g2(xbVar11.a, xbVar11.f);
                                            this.a.W1(xbVar11.h, xbVar11.a);
                                        }
                                        wb wbVar19 = this.a;
                                        if (wbVar19 != null) {
                                            z15 = true;
                                            wbVar19.I0(true);
                                            invalidate();
                                            if (!this.i1) {
                                                this.j1 = 1.0f;
                                            }
                                            this.i1 = z15;
                                            this.h1 = false;
                                        }
                                    }
                                    z15 = true;
                                    invalidate();
                                    if (!this.i1) {
                                    }
                                    this.i1 = z15;
                                    this.h1 = false;
                                }
                            }
                        } else {
                            float f41 = xbVar2.e;
                            float f42 = (min3 / f41) * (x8 / this.q1);
                            if (i11 == 2) {
                                xbVar2.g = Utilities.clamp(xbVar2.g + f42, xbVar2.h - (1000.0f / f41), 0.0f);
                                wb wbVar20 = this.a;
                                if (wbVar20 != null) {
                                    wbVar20.Z0(this.h.g, false);
                                }
                                xb xbVar12 = this.h;
                                float f43 = xbVar12.h - xbVar12.g;
                                float f44 = f();
                                xb xbVar13 = this.h;
                                if (f43 > f44 / xbVar13.e) {
                                    xbVar13.h = Math.min(1.0f, (f() / this.h.e) + xbVar13.g);
                                    wb wbVar21 = this.a;
                                    if (wbVar21 != null) {
                                        wbVar21.X1(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                xbVar2.h = Utilities.clamp(xbVar2.h + f42, 1.0f, (1000.0f / f41) + xbVar2.g);
                                wb wbVar22 = this.a;
                                if (wbVar22 != null) {
                                    wbVar22.X1(this.h.h);
                                }
                                xb xbVar14 = this.h;
                                float f45 = xbVar14.h - xbVar14.g;
                                float f46 = f();
                                xb xbVar15 = this.h;
                                if (f45 > f46 / xbVar15.e) {
                                    xbVar15.g = Math.max(0.0f, xbVar15.h - (f() / this.h.e));
                                    wb wbVar23 = this.a;
                                    if (wbVar23 != null) {
                                        wbVar23.Z0(this.h.g, false);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min10 = f42 > 0.0f ? Math.min(1.0f - xbVar2.h, f42) : Math.max(-xbVar2.g, f42);
                                xb xbVar16 = this.h;
                                float f47 = xbVar16.g + min10;
                                xbVar16.g = f47;
                                xbVar16.h += min10;
                                wb wbVar24 = this.a;
                                if (wbVar24 != null) {
                                    wbVar24.Z0(f47, false);
                                    this.a.X1(this.h.h);
                                }
                            }
                            float f48 = this.e;
                            xb xbVar17 = this.h;
                            float f49 = xbVar17.e;
                            float f50 = f48 / f49;
                            float f51 = xbVar17.g;
                            if (f50 < f51 || f50 > xbVar17.h) {
                                long j16 = (long) (f51 * f49);
                                this.e = j16;
                                wb wbVar25 = this.a;
                                if (wbVar25 != null) {
                                    wbVar25.P(j16, false);
                                }
                            }
                            invalidate();
                            if (!this.i1) {
                                this.j1 = 1.0f;
                            }
                            this.i1 = true;
                            this.h1 = false;
                        }
                        this.c1 = motionEvent.getX();
                    }
                    if (this.i1) {
                        AndroidUtilities.cancelRunOnUIThread(k0Var);
                    }
                    int i20 = this.d1;
                    if ((i20 == 1 || i20 == 5 || i20 == 8) && (velocityTracker6 = this.l1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(k0Var);
                    bm0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.b1 > ViewConfiguration.getTapTimeout() || this.i1) && this.f0) {
                            int i21 = this.d1;
                            int i22 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                            if (i21 == 16 && (velocityTracker5 = this.l1) != null) {
                                velocityTracker5.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity = (int) this.l1.getXVelocity();
                                this.m1 = true;
                                if (this.h != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                    long min11 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i23 = this.u1;
                                    float f52 = i23;
                                    float f53 = min11;
                                    float f54 = this.q1;
                                    int i24 = (int) (((this.f / f53) * f54) + f52);
                                    int c10 = (int) s3.c.c(this.h.e - min11, f53, f54, f52);
                                    this.n1 = true;
                                    this.o1 = i24;
                                    this.S0.c(i24, 0, -xVelocity, 0, i23, c10, 0, 0);
                                    z10 = false;
                                }
                            } else if (i21 == 1 && (velocityTracker4 = this.l1) != null) {
                                velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity2 = (int) this.l1.getXVelocity();
                                this.m1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long min12 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i25 = this.u1;
                                    float f55 = i25;
                                    float f56 = min12;
                                    float f57 = this.q1;
                                    int i26 = (int) (((this.f / f56) * f57) + f55);
                                    int c11 = (int) s3.c.c(this.h.e - min12, f56, f57, f55);
                                    this.n1 = true;
                                    this.o1 = i26;
                                    this.S0.c(i26, 0, -xVelocity2, 0, i25, c11, 0, 0);
                                    z10 = false;
                                }
                            } else if ((i21 == 5 || (i21 == 8 && !this.i1)) && this.L && (velocityTracker2 = this.l1) != null) {
                                if (this.h == null) {
                                    i22 = 1500;
                                }
                                velocityTracker2.computeCurrentVelocity(i22);
                                int xVelocity3 = (int) this.l1.getXVelocity();
                                this.m1 = false;
                                if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                                    float min13 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i27 = (int) (((this.M / min13) * this.q1) + this.u1 + this.t1);
                                    xb xbVar18 = this.h;
                                    if (xbVar18 != null) {
                                        float f58 = xbVar18.h;
                                        float f59 = xbVar18.e;
                                        j12 = this.N;
                                        j13 = (long) ((f58 * f59) - 0);
                                        f10 = xbVar18.g * f59;
                                    } else if (this.A) {
                                        float f60 = this.G;
                                        float f61 = this.D;
                                        j12 = this.N;
                                        j13 = (long) ((f60 * f61) - 0);
                                        f10 = this.F * f61;
                                    } else {
                                        j10 = -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j11 = 0;
                                        this.n1 = z12;
                                        this.o1 = i27;
                                        float f62 = this.u1 + this.t1;
                                        float f63 = this.q1;
                                        this.S0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f63) + f62), (int) s3.c.c(j11, min13, f63, f62), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f10 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.n1 = z12;
                                    this.o1 = i27;
                                    float f622 = this.u1 + this.t1;
                                    float f632 = this.q1;
                                    this.S0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f632) + f622), (int) s3.c.c(j11, min13, f632, f622), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i21 == 9 || (i21 == 12 && !this.i1)) && this.C && (velocityTracker3 = this.l1) != null) {
                                if (this.h == null) {
                                    i22 = 1500;
                                }
                                velocityTracker3.computeCurrentVelocity(i22);
                                int xVelocity4 = (int) this.l1.getXVelocity();
                                this.m1 = false;
                                if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                                    float min14 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i28 = (int) (((this.E / min14) * this.q1) + this.u1 + this.t1);
                                    xb xbVar19 = this.h;
                                    if (xbVar19 != null) {
                                        float f64 = xbVar19.h;
                                        float f65 = xbVar19.e;
                                        j14 = (long) ((xbVar19.g * f65) - this.D);
                                        j15 = (long) ((f64 * f65) - 0);
                                    } else {
                                        j14 = -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.n1 = true;
                                    this.o1 = i28;
                                    float f66 = this.u1 + this.t1;
                                    float f67 = this.q1;
                                    this.S0.c(i28, 0, xVelocity4, 0, (int) (((j14 / min14) * f67) + f66), (int) s3.c.c(j15, min14, f67, f66), 0, 0);
                                    z10 = false;
                                }
                            }
                            b2Var = this.Z0;
                            if (b2Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(b2Var);
                                this.Z0 = null;
                            }
                            if (this.i1 || !z10 || (wbVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                wbVar.I0(false);
                            }
                            this.j1 = 1.0f;
                            this.i1 = z11;
                            this.h1 = z11;
                            this.b1 = -1L;
                            this.d1 = -1;
                            velocityTracker = this.l1;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.l1 = null;
                            }
                        } else if (this.f0) {
                            if (!this.T0 || this.h == null) {
                                int i29 = this.f1;
                                if (i29 == 3) {
                                    int i30 = (this.L || this.C) ? -1 : this.n;
                                    int i31 = this.g1;
                                    if (i30 != i31) {
                                        this.L = false;
                                        this.C = false;
                                        this.n = i31;
                                        if (this.a != null && i31 >= 0 && i31 < arrayList.size()) {
                                            this.a.e(((xb) arrayList.get(this.g1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i29 == 2 && !this.L) {
                                    this.L = true;
                                    this.C = false;
                                    wb wbVar26 = this.a;
                                    if (wbVar26 != null) {
                                        wbVar26.j1(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 && !this.C) {
                                    this.L = false;
                                    this.C = true;
                                    wb wbVar27 = this.a;
                                    if (wbVar27 != null) {
                                        wbVar27.j1(true);
                                    }
                                    invalidate();
                                } else if (i29 != 2 && this.L) {
                                    this.L = false;
                                    this.C = false;
                                    wb wbVar28 = this.a;
                                    if (wbVar28 != null) {
                                        wbVar28.j1(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 || !this.C) {
                                    long j17 = this.e;
                                    if (m(motionEvent.getX(), false) && Math.abs(this.e - j17) > 400) {
                                        this.Y0 = j17;
                                        this.X0.d(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    this.L = false;
                                    this.C = false;
                                    wb wbVar29 = this.a;
                                    if (wbVar29 != null) {
                                        wbVar29.j1(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.u1) - this.t1) / this.q1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                xb xbVar20 = this.h;
                                float f68 = xbVar20.h - xbVar20.g;
                                xbVar20.g = (1.0f - f68) * (clamp7 / getBaseDuration());
                                xb xbVar21 = this.h;
                                float f69 = xbVar21.g;
                                xbVar21.h = f68 + f69;
                                wb wbVar30 = this.a;
                                if (wbVar30 != null) {
                                    wbVar30.Z0(f69, true);
                                    this.a.X1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.f1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    b2Var = this.Z0;
                    if (b2Var != null) {
                    }
                    if (this.i1) {
                    }
                    z11 = false;
                    this.j1 = 1.0f;
                    this.i1 = z11;
                    this.h1 = z11;
                    this.b1 = -1L;
                    this.d1 = -1;
                    velocityTracker = this.l1;
                    if (velocityTracker != null) {
                    }
                }
                this.a1 = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.T == null || this.S) {
                this.T = new vb(this, this.K, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.Q = false;
                this.c0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        k9.a aVar = new k9.a(3);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, aVar);
        xb xbVar = arrayList.isEmpty() ? null : (xb) arrayList.get(0);
        this.v = xbVar;
        if (xbVar != null) {
            long j10 = xbVar.f;
        }
    }

    public void setCollage(ArrayList<z7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ac acVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            xb xbVar = (xb) arrayList2.get(i10);
            if (xbVar != null && (acVar = xbVar.c) != null) {
                acVar.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            vb vbVar = (vb) arrayList3.get(i11);
            if (vbVar != null) {
                vbVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.d0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                z7 z7Var = arrayList.get(i12);
                if (z7Var.K) {
                    xb xbVar2 = new xb(this);
                    xbVar2.a = i12;
                    xbVar2.b = false;
                    xbVar2.d = z7Var.L.getAbsolutePath();
                    xbVar2.e = z7Var.h0;
                    xbVar2.f = z7Var.X;
                    xbVar2.i = z7Var.P;
                    xbVar2.g = z7Var.V;
                    xbVar2.h = z7Var.W;
                    xb.a(xbVar2, false);
                    xb.b(xbVar2);
                    arrayList2.add(xbVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(wb wbVar) {
        this.a = wbVar;
    }

    public void setMaxCount(int i10) {
        this.U = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if ((r4 + 240) >= (r7 * r11.P)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if ((r4 + 240) >= (r6 * r11.P)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r4 + 240) >= (r7 * r0.h)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        r11.Y0 = -1;
        r11.X0.d(1.0f, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j10) {
        xb xbVar = this.h;
        if (xbVar != null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j11 = xbVar.e;
                if (f10 <= (j11 * xbVar.g) + 240.0f) {
                }
            }
        }
        if (this.J && !this.A && xbVar == null) {
            if (j10 < this.e) {
                float f11 = j10;
                long j12 = this.N;
                if (f11 <= (j12 * this.O) + 240.0f) {
                }
            }
        }
        if (this.A && xbVar == null) {
            if (j10 < this.e) {
                float f12 = j10;
                long j13 = this.D;
                if (f12 <= (j13 * this.O) + 240.0f) {
                }
            }
        }
        this.e = j10;
        invalidate();
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f10) {
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.h = f10;
        invalidate();
    }
}
