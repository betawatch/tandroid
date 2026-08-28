package kh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class gc extends View {
    public boolean A;
    public final TextPaint A0;
    public String B;
    public final RectF B0;
    public boolean C;
    public final Path C0;
    public long D;
    public final Paint D0;
    public long E;
    public final fc E0;
    public float F;
    public final Paint F0;
    public float G;
    public final Drawable G0;
    public float H;
    public final TextPaint H0;
    public ec I;
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
    public final yl0 S0;
    public zb T;
    public boolean T0;
    public int U;
    public final bg.o0 U0;
    public final org.telegram.ui.Components.y5 V;
    public long V0;
    public final org.telegram.ui.Components.y5 W;
    public long W0;
    public final org.telegram.ui.Components.y5 X0;
    public long Y0;
    public bg.i2 Z0;
    public ac a;
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
    public final org.telegram.ui.Components.ba g0;
    public int g1;
    public bc h;
    public final org.telegram.ui.Components.fa h0;
    public boolean h1;
    public final org.telegram.ui.Components.fa i0;
    public boolean i1;
    public final org.telegram.ui.Components.fa j0;
    public float j1;
    public final RectF k0;
    public boolean k1;
    public final Path l0;
    public VelocityTracker l1;
    public final nz0 m0;
    public boolean m1;
    public int n;
    public final Drawable n0;
    public boolean n1;
    public final fc o0;
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
    public bc v;
    public final Paint v0;
    public int v1;
    public final Paint w;
    public final Paint w0;
    public final Path x;
    public final Paint x0;
    public final Path y;
    public final Paint y0;
    public final Paint z0;

    public gc(Context context, ViewGroup viewGroup, ib ibVar, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new Paint(3);
        this.x = new Path();
        this.y = new Path();
        this.U = 1;
        gr grVar = gr.h;
        this.V = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.W = new org.telegram.ui.Components.y5(this, 360L, grVar);
        this.a0 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.b0 = new org.telegram.ui.Components.y5(this, 360L, grVar);
        this.c0 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.d0 = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        this.e0 = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.f0 = true;
        this.k0 = new RectF();
        this.l0 = new Path();
        this.o0 = new fc();
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
        this.E0 = new fc();
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
        this.S0 = new yl0(getContext(), null);
        this.V0 = -1L;
        this.W0 = -1L;
        this.X0 = new org.telegram.ui.Components.y5(0.0f, this, 0L, 340L, grVar);
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
        this.m0 = new nz0(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.n0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.G0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g0 = baVar;
        this.h0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.i0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.j0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.U0 = new bg.o0(this, viewGroup, b6Var, baVar, ibVar, 18);
    }

    public static void a(final gc gcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i9;
        ArrayList arrayList = gcVar.s;
        int i10 = gcVar.f1;
        try {
            if (i10 == 2 && gcVar.J) {
                u7 u7Var = new u7(gcVar.getContext(), 0);
                u7Var.b = 0.0f;
                u7Var.c = 1.5f;
                u7Var.d(gcVar.R);
                final int i11 = 0;
                u7Var.h = new Utilities.Callback(gcVar) { // from class: kh.yb
                    public final /* synthetic */ gc b;

                    {
                        this.b = gcVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i11) {
                            case 0:
                                float floatValue = f10.floatValue();
                                gc gcVar2 = this.b;
                                gcVar2.R = floatValue;
                                ac acVar = gcVar2.a;
                                if (acVar != null) {
                                    acVar.K(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                gc gcVar3 = this.b;
                                gcVar3.H = floatValue2;
                                ac acVar2 = gcVar3.a;
                                if (acVar2 != null) {
                                    acVar2.B(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                gc gcVar4 = this.b;
                                gcVar4.h.i = f10.floatValue();
                                ac acVar3 = gcVar4.a;
                                if (acVar3 != null) {
                                    acVar3.X0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration());
                int i12 = gcVar.r1;
                int i13 = gcVar.u1;
                int i14 = gcVar.t1;
                float min2 = Math.min((i12 - i13) - i14, ((((AndroidUtilities.lerp(gcVar.P, 1.0f, gcVar.b0.c) * gcVar.N) + (gcVar.M - gcVar.f)) / min) * gcVar.q1) + i13 + i14);
                x60 F = x60.F(viewGroup, b6Var, gcVar);
                F.q(u7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new xb(gcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(gcVar.r1 - min2)) + AndroidUtilities.dp(18.0f), gcVar.B0.top);
                F.Z();
                F.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i10 == 1 && gcVar.A) {
                u7 u7Var2 = new u7(gcVar.getContext(), 0);
                u7Var2.b = 0.0f;
                u7Var2.c = 1.5f;
                u7Var2.d(gcVar.H);
                final int i15 = 1;
                u7Var2.h = new Utilities.Callback(gcVar) { // from class: kh.yb
                    public final /* synthetic */ gc b;

                    {
                        this.b = gcVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i15) {
                            case 0:
                                float floatValue = f10.floatValue();
                                gc gcVar2 = this.b;
                                gcVar2.R = floatValue;
                                ac acVar = gcVar2.a;
                                if (acVar != null) {
                                    acVar.K(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                gc gcVar3 = this.b;
                                gcVar3.H = floatValue2;
                                ac acVar2 = gcVar3.a;
                                if (acVar2 != null) {
                                    acVar2.B(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                gc gcVar4 = this.b;
                                gcVar4.h.i = f10.floatValue();
                                ac acVar3 = gcVar4.a;
                                if (acVar3 != null) {
                                    acVar3.X0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration());
                int i16 = gcVar.r1;
                int i17 = gcVar.u1;
                int i18 = gcVar.t1;
                float min4 = Math.min((i16 - i17) - i18, ((((AndroidUtilities.lerp(gcVar.G, 1.0f, gcVar.W.c) * gcVar.D) + (gcVar.E - gcVar.f)) / min3) * gcVar.q1) + i17 + i18);
                x60 F2 = x60.F(viewGroup, b6Var, gcVar);
                F2.q(u7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new xb(gcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(gcVar.r1 - min4)) + AndroidUtilities.dp(18.0f), gcVar.t0.top);
                F2.Z();
                F2.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else if (i10 == 0 && gcVar.h != null) {
                u7 u7Var3 = new u7(gcVar.getContext(), 0);
                u7Var3.b = 0.0f;
                u7Var3.c = 1.5f;
                u7Var3.d(gcVar.h.i);
                final int i19 = 2;
                u7Var3.h = new Utilities.Callback(gcVar) { // from class: kh.yb
                    public final /* synthetic */ gc b;

                    {
                        this.b = gcVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i19) {
                            case 0:
                                float floatValue = f10.floatValue();
                                gc gcVar2 = this.b;
                                gcVar2.R = floatValue;
                                ac acVar = gcVar2.a;
                                if (acVar != null) {
                                    acVar.K(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                gc gcVar3 = this.b;
                                gcVar3.H = floatValue2;
                                ac acVar2 = gcVar3.a;
                                if (acVar2 != null) {
                                    acVar2.B(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                gc gcVar4 = this.b;
                                gcVar4.h.i = f10.floatValue();
                                ac acVar3 = gcVar4.a;
                                if (acVar3 != null) {
                                    acVar3.X0(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                x60 F3 = x60.F(viewGroup, b6Var, gcVar);
                F3.q(u7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), gcVar.p0.top);
                F3.Z();
                F3.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            } else {
                if (i10 != 3 || (i9 = gcVar.g1) < 0 || i9 >= arrayList.size()) {
                    return;
                }
                bc bcVar = (bc) arrayList.get(gcVar.g1);
                u7 u7Var4 = new u7(gcVar.getContext(), 0);
                u7Var4.b = 0.0f;
                u7Var4.c = 1.5f;
                u7Var4.d(bcVar.i);
                u7Var4.h = new fh.f1(16, gcVar, bcVar);
                x60 F4 = x60.F(viewGroup, b6Var, gcVar);
                F4.q(u7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), bcVar.j.top);
                F4.Z();
                F4.R(baVar, -view.getX(), -view.getY());
                gcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.b0.e(this.L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        bc bcVar = this.h;
        if (bcVar != null) {
            return Math.max(1L, bcVar.e);
        }
        bc bcVar2 = this.v;
        return bcVar2 != null ? Math.max(1L, bcVar2.e) : this.A ? Math.max(1L, this.D) : Math.max(1L, this.N);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (f10 > 0.0f) {
                f10 += AndroidUtilities.dp(4.0f);
            }
            f10 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((bc) arrayList.get(i9)).k.c);
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
        int i9;
        bc bcVar;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.e, getBaseDuration(), 0L);
        bc bcVar2 = this.v;
        float f10 = min;
        float f11 = (this.q1 * (((clamp + (bcVar2 != null ? (bcVar2.g * bcVar2.e) + bcVar2.f : this.h == null ? this.M : 0L)) - this.f) / f10)) + this.u1 + this.t1;
        if (!this.T0 && x10 >= f11 - AndroidUtilities.dp(12.0f) && x10 <= f11 + AndroidUtilities.dp(12.0f)) {
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
                        i9 = 1;
                        if (z11) {
                            float f12 = this.u1 + this.t1;
                            bc bcVar3 = this.h;
                            float f13 = bcVar3.g;
                            float f14 = bcVar3.e;
                            float f15 = this.f;
                            float f16 = this.q1;
                            float f17 = ((((f13 * f14) - f15) / f10) * f16) + f12;
                            float f18 = ((((bcVar3.h * f14) - f15) / f10) * f16) + f12;
                            if (this.T0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x10 < f17 - AndroidUtilities.dp(15.0f) || x10 > f18 + AndroidUtilities.dp(15.0f)) {
                                    return i9;
                                }
                                return 4;
                            }
                            if (x10 >= f17 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f17) {
                                return 2;
                            }
                            if (x10 >= f18 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f18) {
                                return 3;
                            }
                            if (x10 >= f17 && x10 <= f18) {
                                bc bcVar4 = this.h;
                                if (bcVar4.g > 0.01f || bcVar4.h < 0.99f) {
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
                                if (x10 >= f25 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f25) {
                                    return 10;
                                }
                                if (x10 >= f26 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f26) {
                                    return 11;
                                }
                                if (x10 >= f25 && x10 <= f26) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f27 = this.u1 + this.t1;
                                long j10 = this.E;
                                long j11 = this.f;
                                float f28 = this.q1;
                                float f29 = (((j10 - j11) / f10) * f28) + f27;
                                f26 = org.telegram.ui.Cells.j2.b((j10 + this.D) - j11, f10, f28, f27);
                                f25 = f29;
                            }
                            if (x10 >= f25 && x10 <= f26) {
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
                                if (x10 >= f36 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f36) {
                                    return 6;
                                }
                                if (x10 >= f37 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f37) {
                                    return 7;
                                }
                                if (x10 >= f36 && x10 <= f37) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f38 = this.u1 + this.t1;
                                long j12 = this.M;
                                long j13 = this.f;
                                float f39 = this.q1;
                                float f40 = (((j12 - j13) / f10) * f39) + f38;
                                f37 = org.telegram.ui.Cells.j2.b((j12 + this.N) - j13, f10, f39, f38);
                                f36 = f40;
                            }
                            if (x10 >= f36 && x10 <= f37) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            bc bcVar5 = (bc) arrayList.get(i10);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(bcVar5.j);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x10, y10)) {
                                float f41 = this.u1 + this.t1;
                                float f42 = bcVar5.f;
                                float f43 = this.q1;
                                float f44 = ((f42 / f10) * f43) + f41;
                                float f45 = bcVar5.g;
                                float f46 = bcVar5.e;
                                float f47 = ((((f45 * f46) + f42) / f10) * f43) + f41;
                                float f48 = ((((bcVar5.h * f46) + f42) / f10) * f43) + f41;
                                float b10 = org.telegram.ui.Cells.j2.b(r6 + r11, f10, f43, f41);
                                this.e1 = i10;
                                if (x10 >= f47 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f47) {
                                    return 13;
                                }
                                if (x10 >= f48 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f48) {
                                    return 14;
                                }
                                if (x10 < f47 || x10 > f48 || (bcVar5.g <= 0.01f && bcVar5.h >= 0.99f)) {
                                    return (x10 < f44 || x10 > b10) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i9 = 1;
                    }
                    bcVar = this.h;
                    if (bcVar != null || bcVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        bcVar = this.h;
        return bcVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        yl0 yl0Var = this.S0;
        if (!yl0Var.b()) {
            if (this.n1) {
                this.n1 = false;
                ac acVar = this.a;
                if (acVar != null) {
                    acVar.H0(false);
                    return;
                }
                return;
            }
            return;
        }
        int i9 = yl0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.m1) {
            this.f = (long) Math.max(0.0f, (((i9 - this.u1) - this.t1) / this.q1) * min);
        } else {
            if (!this.L) {
                yl0Var.a();
                return;
            }
            int i10 = this.u1;
            int i11 = this.t1;
            float f10 = this.q1;
            float f11 = min;
            h(((((i9 - i10) - i11) / f10) * f11) - ((((this.o1 - i10) - i11) / f10) * f11));
        }
        invalidate();
        this.o1 = i9;
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        float f13;
        if (this.T0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(j10, getBaseDuration(), 0L);
        bc bcVar = this.v;
        if (bcVar != null) {
            f13 = (bcVar.g * bcVar.e) + bcVar.f;
        } else {
            f13 = this.h == null ? this.M : 0L;
        }
        float f14 = (this.q1 * (((clamp + f13) - this.f) / min)) + this.u1 + this.t1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.y0;
        paint.setAlpha((int) (38.0f * f12));
        int i9 = (int) (f12 * 255.0f);
        Paint paint2 = this.z0;
        paint2.setAlpha(i9);
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
        org.telegram.ui.Components.fa faVar;
        RectF rectF2;
        long j11;
        int i9;
        bc bcVar;
        bc bcVar2;
        int i10;
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
        float d9;
        float f34;
        float f35;
        bc bcVar3;
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
        float b10;
        float f44;
        float f45;
        long j14;
        float f46;
        float f47;
        float f48;
        ArrayList arrayList4;
        int i11;
        boolean z11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i12;
        int i13;
        float f49;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i14;
        RectF rectF5;
        ArrayList arrayList9;
        float f50;
        float f51;
        Path path;
        float b11;
        float f52;
        float f53;
        float f54;
        int i15;
        long j15;
        float f55;
        float f56;
        float f57;
        ArrayList arrayList10;
        boolean z12;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z13;
        int i16;
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
        int i17;
        boolean z14;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        org.telegram.ui.Components.fa faVar2;
        gc gcVar = this;
        RectF rectF6 = gcVar.p0;
        RectF rectF7 = gcVar.t0;
        Path path2 = gcVar.s0;
        ArrayList arrayList20 = gcVar.r;
        Drawable drawable = gcVar.n0;
        org.telegram.ui.Components.ba baVar = gcVar.g0;
        RectF rectF8 = gcVar.B0;
        ArrayList arrayList21 = gcVar.s;
        RectF rectF9 = gcVar.k0;
        org.telegram.ui.Components.fa faVar3 = gcVar.h0;
        Paint c10 = faVar3.c(1.0f);
        float e10 = gcVar.e0.e(gcVar.f0);
        long min = Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration());
        if (e10 < 1.0f) {
            rectF9.set(gcVar.u1, (gcVar.s1 - gcVar.v1) - AndroidUtilities.dp(28.0f), gcVar.r1 - gcVar.u1, gcVar.s1 - gcVar.v1);
            gcVar.l0.rewind();
            gcVar.l0.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - e10) * 255.0f), 31);
            canvas.clipPath(gcVar.l0);
            if (baVar.c()) {
                faVar3.a(canvas);
                canvas.drawColor(855638016);
                paint3 = c10;
            } else if (c10 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint3 = c10;
            } else {
                paint3 = c10;
                canvas.drawRect(rectF9, paint3);
                canvas.drawColor(855638016);
            }
            if (arrayList20.isEmpty() || !baVar.c()) {
                paint4 = paint3;
                rectF = rectF6;
                faVar2 = faVar3;
                j10 = min;
                if (!arrayList20.isEmpty()) {
                    Paint c11 = gcVar.j0.c(0.4f);
                    if (c11 == null) {
                        c11 = gcVar.D0;
                        c11.setAlpha(64);
                    }
                    gcVar.o0.a((((gcVar.M - gcVar.f) / j10) * gcVar.q1) + gcVar.u1 + gcVar.t1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), gcVar.d0.d(fc.c(arrayList20), false), rectF9.bottom, arrayList20);
                    canvas.drawPath(gcVar.o0, c11);
                    float h = ((gcVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - h);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, ll.e(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, ll.z(2, centerY, drawable));
                    drawable.setAlpha(191);
                    drawable.draw(canvas);
                    nz0 nz0Var = gcVar.m0;
                    float centerX2 = (rectF9.centerX() - h) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
                    float f64 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    faVar = faVar2;
                    f10 = 0.4f;
                    nz0Var.c(centerX2, f64, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float d10 = gcVar.d0.d(fc.c(arrayList20), false);
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j10 = min;
                faVar2 = faVar3;
                gcVar.o0.a((((gcVar.M - gcVar.f) / min) * gcVar.q1) + gcVar.u1 + gcVar.t1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), d10, rectF9.bottom, arrayList20);
                canvas.saveLayerAlpha(rectF9, 102, 31);
                canvas.clipPath(gcVar.o0);
                gcVar.j0.a(canvas);
                canvas.restore();
            }
            float h10 = ((gcVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - h10);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, ll.e(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, ll.z(2, centerY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            nz0 nz0Var2 = gcVar.m0;
            float centerX22 = (rectF9.centerX() - h10) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
            float f642 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            faVar = faVar2;
            f10 = 0.4f;
            nz0Var2.c(centerX22, f642, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c10;
            arrayList = arrayList21;
            f10 = 0.4f;
            faVar = faVar3;
            rectF2 = rectF8;
        }
        if (e10 > 0.0f) {
            if (e10 < 1.0f) {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, gcVar.getWidth(), gcVar.getHeight(), (int) (e10 * 255.0f), 31);
                z10 = true;
            } else {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                z10 = false;
            }
            bc bcVar4 = gcVar.h;
            float f65 = bcVar4 != null ? 1.0f : 0.0f;
            float e11 = bcVar4 != null ? bcVar4.k.e((gcVar.L || gcVar.C) ? false : true) : 0.0f;
            float f66 = gcVar.s1 - gcVar.v1;
            float dp = AndroidUtilities.dp(4.0f);
            if (gcVar.h != null) {
                canvas2.save();
                float videoHeight = gcVar.getVideoHeight();
                bc bcVar5 = gcVar.h;
                float f67 = bcVar5.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j16 = bcVar5.e;
                float f68 = j16;
                float x10 = e2.c.x(f67, f68, e11, f12);
                float x11 = e2.c.x(bcVar5.h, f68, e11, f12);
                if (j16 <= 0) {
                    f13 = e11;
                    f60 = f65;
                    j13 = j12;
                    f61 = 0.0f;
                    f59 = 0.0f;
                    f15 = dp;
                } else {
                    f59 = 0.0f;
                    f13 = e11;
                    f60 = f65;
                    j13 = j12;
                    f15 = dp;
                    f61 = (gcVar.u1 + gcVar.t1) - (gcVar.q1 * (gcVar.f / j13));
                }
                f19 = x10;
                float f69 = gcVar.t1;
                float f70 = f61 - f69;
                if (j16 <= 0) {
                    f62 = f69;
                    f18 = x11;
                    f63 = 0.0f;
                } else {
                    f62 = f69;
                    f18 = x11;
                    f63 = (((j16 - gcVar.f) / j13) * gcVar.q1) + gcVar.u1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f70, f66 - videoHeight, f63 + f62, f66);
                float f71 = f66 - ((f15 * f60) + videoHeight);
                float f72 = (rectF10.top * f13) + f59;
                f17 = (rectF10.bottom * f13) + f59;
                gcVar.r0.rewind();
                gcVar.r0.addRoundRect(rectF10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(gcVar.r0);
                ec ecVar = gcVar.h.c;
                if (ecVar != null) {
                    int i18 = ecVar.f;
                    float f73 = i18;
                    f20 = f72;
                    int max2 = (int) Math.max(0.0d, Math.floor((f70 - gcVar.u1) / f73));
                    f14 = f60;
                    int min2 = (int) Math.min(gcVar.h.c.c, Math.ceil(((r6 - f70) - gcVar.u1) / f73) + 1.0d);
                    int i19 = (int) rectF10.top;
                    arrayList15 = gcVar.h.c.d;
                    boolean z15 = arrayList15.size() >= min2;
                    boolean z16 = (i18 == 0 || !z15 || gcVar.h.b) ? false : true;
                    if (z16) {
                        int i20 = max2;
                        while (true) {
                            arrayList18 = gcVar.h.c.d;
                            if (i20 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = gcVar.h.c.d;
                            if (((dc) arrayList19.get(i20)).a == null) {
                                z16 = false;
                                break;
                            }
                            i20++;
                        }
                    }
                    if (!z16) {
                        if (baVar.c()) {
                            faVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF10, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i18 != 0) {
                        float f74 = f70;
                        int i21 = max2;
                        while (i21 < Math.min(arrayList16.size(), min2)) {
                            arrayList17 = gcVar.h.c.d;
                            dc dcVar = (dc) arrayList17.get(i21);
                            if (dcVar.a != null) {
                                i17 = min2;
                                z14 = z15;
                                gcVar.q0.setAlpha((int) (dcVar.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(dcVar.a, f74, i19 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), gcVar.q0);
                            } else {
                                i17 = min2;
                                z14 = z15;
                            }
                            f74 += f73;
                            i21++;
                            z15 = z14;
                            min2 = i17;
                        }
                    }
                    if (!z15) {
                        gcVar.h.c.c();
                    }
                } else {
                    f20 = f72;
                    f14 = f60;
                }
                path2.rewind();
                if (!gcVar.T0) {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    int i22 = gcVar.u1;
                    int i23 = gcVar.t1;
                    float f75 = i22 + i23;
                    bc bcVar6 = gcVar.h;
                    float f76 = bcVar6.g;
                    int i24 = i23;
                    float f77 = bcVar6.e;
                    float f78 = gcVar.f;
                    float f79 = (f76 * f77) - f78;
                    float f80 = j13;
                    float f81 = gcVar.q1;
                    float f82 = (((f79 / f80) * f81) + f75) - (f76 <= f59 ? i24 : 0);
                    float f83 = gcVar.s1 - gcVar.v1;
                    float f84 = f83 - videoHeight;
                    float f85 = bcVar6.h;
                    float f86 = ((((f77 * f85) - f78) / f80) * f81) + f75;
                    if (f85 < 1.0f) {
                        i24 = 0;
                    }
                    rectF11.set(f82, f84, f86 + i24, f83);
                    path2.addRoundRect(rectF11, gcVar.p1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f66 = f71;
                f16 = videoHeight;
            } else {
                f13 = e11;
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
                gcVar.getCollageHeight();
                float f87 = f66;
                int i25 = 0;
                while (i25 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    bc bcVar7 = (bc) arrayList22.get(i25);
                    org.telegram.ui.Components.y5 y5Var = bcVar7.k;
                    RectF rectF12 = bcVar7.j;
                    float f88 = f16;
                    float e12 = y5Var.e((gcVar.L || gcVar.C || gcVar.n != i25) ? false : true);
                    if (bcVar7 != gcVar.v) {
                        i14 = i25;
                        arrayList9 = arrayList22;
                        float f89 = j13;
                        f50 = f17;
                        f51 = ((((AndroidUtilities.lerp(bcVar7.g, 0.0f, e12) * bcVar7.e) + (bcVar7.f - gcVar.f)) / f89) * gcVar.q1) + gcVar.u1 + gcVar.t1;
                        rectF5 = rectF7;
                        b11 = (e2.c.y(AndroidUtilities.lerp(bcVar7.h, 1.0f, e12), bcVar7.e, bcVar7.f - gcVar.f, f89) * gcVar.q1) + gcVar.u1 + gcVar.t1;
                        path = path2;
                    } else {
                        i14 = i25;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f50 = f17;
                        float f90 = gcVar.u1 + gcVar.t1;
                        float f91 = j13;
                        float f92 = (bcVar7.f - gcVar.f) / f91;
                        float f93 = gcVar.q1;
                        f51 = (f92 * f93) + f90;
                        path = path2;
                        b11 = org.telegram.ui.Cells.j2.b(r8 + bcVar7.e, f91, f93, f90);
                    }
                    float f94 = f51;
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), e12);
                    float f95 = gcVar.t1;
                    rectF12.set(f94 - f95, f87 - lerp2, b11 + f95, f87);
                    f20 = (rectF12.top * e12) + f20;
                    f17 = (rectF12.bottom * e12) + f50;
                    float f96 = bcVar7.f;
                    float f97 = bcVar7.g;
                    float f98 = f87;
                    float f99 = bcVar7.e;
                    f19 = (((f97 * f99) + f96) * e12) + f19;
                    f18 = (((bcVar7.h * f99) + f96) * e12) + f18;
                    gcVar.x.rewind();
                    gcVar.x.addRoundRect(rectF12, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(gcVar.x);
                    ec ecVar2 = bcVar7.c;
                    if (ecVar2 != null) {
                        long j17 = bcVar7.e;
                        f52 = lerp2;
                        if (j17 <= 0) {
                            j15 = j17;
                            f55 = 0.0f;
                        } else {
                            j15 = j17;
                            f55 = gcVar.u1 + gcVar.t1 + (((bcVar7.f - gcVar.f) / j13) * gcVar.q1);
                        }
                        float f100 = gcVar.t1;
                        float f101 = f55 - f100;
                        if (j17 <= 0) {
                            f56 = f100;
                            f57 = 0.0f;
                        } else {
                            f56 = f100;
                            f57 = ((((bcVar7.f + j15) - gcVar.f) / j13) * gcVar.q1) + gcVar.u1 + r7;
                        }
                        float f102 = f57 + f56;
                        int i26 = ecVar2.f;
                        float f103 = i26;
                        int max3 = (int) Math.max(0.0d, Math.floor((f101 - ((((bcVar7.f - gcVar.f) / j13) * gcVar.q1) + (gcVar.u1 + gcVar.t1))) / f103));
                        int min3 = (int) Math.min(bcVar7.c.c, Math.ceil((f102 - f101) / f103) + 1.0d);
                        int i27 = (int) rectF12.top;
                        arrayList10 = bcVar7.c.d;
                        boolean z17 = arrayList10.size() >= min3;
                        if (z17) {
                            for (int i28 = max3; i28 < Math.min(arrayList13.size(), min3); i28++) {
                                arrayList14 = bcVar7.c.d;
                                if (((dc) arrayList14.get(i28)).a == null) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = z17;
                        if (!z12) {
                            if (baVar.c()) {
                                faVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i26 != 0) {
                            float f104 = f101;
                            while (max3 < Math.min(arrayList11.size(), min3)) {
                                arrayList12 = bcVar7.c.d;
                                dc dcVar2 = (dc) arrayList12.get(max3);
                                int i29 = min3;
                                if (dcVar2.a != null) {
                                    z13 = z17;
                                    i16 = max3;
                                    f58 = f98;
                                    gcVar.w.setAlpha((int) (dcVar2.b.d(1.0f, false) * 255.0f));
                                    canvas2.drawBitmap(dcVar2.a, f104, i27 - ((int) ((r4.getHeight() - f52) / 2.0f)), gcVar.w);
                                } else {
                                    z13 = z17;
                                    i16 = max3;
                                    f58 = f98;
                                }
                                f104 += f103;
                                max3 = i16 + 1;
                                min3 = i29;
                                z17 = z13;
                                f98 = f58;
                            }
                        }
                        f53 = f98;
                        if (!z17) {
                            bcVar7.c.c();
                        }
                    } else {
                        f52 = lerp2;
                        f53 = f98;
                    }
                    gcVar.y.rewind();
                    if (!gcVar.T0) {
                        RectF rectF13 = AndroidUtilities.rectTmp;
                        int i30 = gcVar.u1;
                        int i31 = gcVar.t1;
                        float f105 = i30 + i31;
                        float f106 = bcVar7.g;
                        float f107 = bcVar7.e;
                        float f108 = gcVar.f;
                        float f109 = (f106 * f107) - f108;
                        float f110 = bcVar7.f;
                        float f111 = j13;
                        float f112 = gcVar.q1;
                        float f113 = (((f109 + f110) / f111) * f112) + f105;
                        if (f106 <= 0.0f) {
                            f54 = f112;
                            i15 = i31;
                        } else {
                            f54 = f112;
                            i15 = 0;
                        }
                        float f114 = f113 - i15;
                        float f115 = rectF12.top;
                        float f116 = bcVar7.h;
                        rectF13.set(f114, f115, (((((f107 * f116) - f108) + f110) / f111) * f54) + f105 + (f116 >= 1.0f ? i31 : 0), rectF12.bottom);
                        gcVar.y.addRoundRect(rectF13, gcVar.p1, Path.Direction.CW);
                        canvas2.clipPath(gcVar.y, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f87 = f53 - ((f15 * 1.0f) + f52);
                    i25 = i14 + 1;
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
            float e13 = gcVar.V.e(gcVar.A);
            float e14 = gcVar.W.e(gcVar.A && gcVar.C);
            float roundHeight = gcVar.getRoundHeight() * e13;
            float f117 = ((gcVar.h == null && !gcVar.J && arrayList3.isEmpty()) ? 1.0f : e14) * e13;
            if (e13 > 0.0f) {
                long j18 = gcVar.E;
                float f118 = j18;
                float f119 = gcVar.F;
                float f120 = gcVar.D;
                f19 = (((f119 * f120) + f118) * f117) + f19;
                f18 = (((gcVar.G * f120) + f118) * f117) + f18;
                if (gcVar.h != null) {
                    float f121 = j13;
                    float lerp3 = ((((gcVar.D * AndroidUtilities.lerp(f119, 0.0f, e14)) + (j18 - gcVar.f)) / f121) * gcVar.q1) + gcVar.u1 + gcVar.t1;
                    f43 = f17;
                    f23 = f22;
                    b10 = (e2.c.y(AndroidUtilities.lerp(gcVar.G, 1.0f, e14), gcVar.D, gcVar.E - gcVar.f, f121) * gcVar.q1) + gcVar.u1 + gcVar.t1;
                    f44 = lerp3;
                } else {
                    f23 = f22;
                    f43 = f17;
                    float f122 = gcVar.u1 + gcVar.t1;
                    long j19 = j18 - gcVar.f;
                    float f123 = j13;
                    float f124 = gcVar.q1;
                    float f125 = ((j19 / f123) * f124) + f122;
                    b10 = org.telegram.ui.Cells.j2.b(j19 + r6, f123, f124, f122);
                    f44 = f125;
                }
                float f126 = gcVar.t1;
                rectF14.set(f44 - f126, f66 - roundHeight, b10 + f126, f66);
                float f127 = f66 - ((f15 * e13) + roundHeight);
                f20 = (rectF14.top * f117) + f20;
                f17 = (rectF14.bottom * f117) + f43;
                gcVar.u0.rewind();
                gcVar.u0.addRoundRect(rectF14, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(gcVar.u0);
                ec ecVar3 = gcVar.I;
                if (ecVar3 != null) {
                    float f128 = e14;
                    long j20 = gcVar.D;
                    if (j20 <= 0) {
                        f45 = f127;
                        j14 = j20;
                        f46 = 0.0f;
                    } else {
                        f45 = f127;
                        j14 = j20;
                        f46 = gcVar.u1 + gcVar.t1 + (((gcVar.E - gcVar.f) / j13) * gcVar.q1);
                    }
                    float f129 = gcVar.t1;
                    float f130 = f46 - f129;
                    if (j20 <= 0) {
                        f47 = f129;
                        f48 = 0.0f;
                    } else {
                        f47 = f129;
                        f48 = gcVar.u1 + r10 + ((((gcVar.E + j14) - gcVar.f) / j13) * gcVar.q1);
                    }
                    float f131 = f48 + f47;
                    int i32 = ecVar3.f;
                    float f132 = i32;
                    float f133 = f130;
                    int max4 = (int) Math.max(0.0d, Math.floor((f130 - (gcVar.h != null ? (((gcVar.E - gcVar.f) / j13) * gcVar.q1) + (gcVar.u1 + gcVar.t1) : gcVar.u1)) / f132));
                    int min4 = (int) Math.min(gcVar.I.c, Math.ceil((f131 - f133) / f132) + 1.0d);
                    int i33 = (int) rectF14.top;
                    arrayList4 = gcVar.I.d;
                    boolean z18 = arrayList4.size() >= min4;
                    if (z18) {
                        int i34 = max4;
                        i11 = i34;
                        while (i34 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = gcVar.I.d;
                            if (((dc) arrayList8.get(i34)).a == null) {
                                z11 = false;
                                break;
                            }
                            i34++;
                        }
                    } else {
                        i11 = max4;
                    }
                    z11 = z18;
                    if (!z11) {
                        if (baVar.c()) {
                            faVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF14, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i32 != 0) {
                        int i35 = i11;
                        while (i35 < Math.min(arrayList5.size(), min4)) {
                            arrayList6 = gcVar.I.d;
                            dc dcVar3 = (dc) arrayList6.get(i35);
                            int i36 = i35;
                            if (dcVar3.a != null) {
                                i12 = min4;
                                i13 = i33;
                                f49 = f128;
                                gcVar.q0.setAlpha((int) (dcVar3.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(dcVar3.a, f133, i13 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), gcVar.q0);
                            } else {
                                i12 = min4;
                                i13 = i33;
                                f49 = f128;
                            }
                            f133 += f132;
                            i35 = i36 + 1;
                            min4 = i12;
                            i33 = i13;
                            f128 = f49;
                        }
                    }
                    f24 = f128;
                    if (!z18) {
                        gcVar.I.c();
                    }
                } else {
                    f45 = f127;
                    f24 = e14;
                }
                path3.rewind();
                RectF rectF15 = AndroidUtilities.rectTmp;
                int i37 = gcVar.u1;
                int i38 = gcVar.t1;
                float f134 = i37 + i38;
                float f135 = gcVar.F;
                float f136 = gcVar.D;
                float f137 = f135 * f136;
                float f138 = gcVar.f;
                float f139 = f137 - f138;
                float f140 = gcVar.E;
                float f141 = j13;
                float f142 = (f139 + f140) / f141;
                float f143 = gcVar.q1;
                float f144 = (1.0f - f24) * i38;
                float f145 = (((f142 * f143) + f134) - (f135 <= 0.0f ? i38 : 0)) - f144;
                float f146 = rectF14.top;
                float f147 = gcVar.G;
                float f148 = (((((f136 * f147) - f138) + f140) / f141) * f143) + f134;
                if (f147 < 1.0f) {
                    i38 = 0;
                }
                rectF15.set(f145, f146, f148 + i38 + f144, rectF14.bottom);
                path3.addRoundRect(rectF15, gcVar.p1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f66 = f45;
            } else {
                f23 = f22;
                f24 = e14;
            }
            float e15 = gcVar.a0.e(gcVar.J);
            float e16 = gcVar.b0.e(gcVar.J && gcVar.L);
            float audioHeight = gcVar.getAudioHeight() * e15;
            float f149 = ((gcVar.h == null && !gcVar.A && arrayList3.isEmpty()) ? 1.0f : e16) * e15;
            if (e15 > 0.0f) {
                float f150 = gcVar.M;
                float f151 = gcVar.O;
                float f152 = gcVar.N;
                f19 = (((f151 * f152) + f150) * f149) + f19;
                f18 = (((gcVar.P * f152) + f150) * f149) + f18;
                Paint c12 = gcVar.i0.c(e15);
                canvas2.save();
                if (gcVar.h == null && !gcVar.A && arrayList3.isEmpty()) {
                    float f153 = gcVar.u1 + gcVar.t1;
                    f37 = f17;
                    float f154 = gcVar.M - gcVar.f;
                    float f155 = j13;
                    float f156 = gcVar.q1;
                    float f157 = ((f154 / f155) * f156) + f153;
                    paint2 = paint;
                    f36 = f149;
                    y10 = org.telegram.ui.Cells.j2.b(r10 + gcVar.N, f155, f156, f153);
                    lerp = f157;
                } else {
                    f36 = f149;
                    f37 = f17;
                    paint2 = paint;
                    float f158 = j13;
                    lerp = ((((AndroidUtilities.lerp(gcVar.O, 0.0f, e16) * gcVar.N) + (gcVar.M - gcVar.f)) / f158) * gcVar.q1) + gcVar.u1 + gcVar.t1;
                    y10 = gcVar.u1 + gcVar.t1 + (e2.c.y(AndroidUtilities.lerp(gcVar.P, 1.0f, e16), gcVar.N, gcVar.M - gcVar.f, f158) * gcVar.q1);
                }
                float f159 = y10;
                float f160 = gcVar.t1;
                RectF rectF16 = rectF3;
                rectF16.set(lerp - f160, f66 - audioHeight, f159 + f160, f66);
                f20 = (rectF16.top * f36) + f20;
                float f161 = (rectF16.bottom * f36) + f37;
                gcVar.C0.rewind();
                gcVar.C0.addRoundRect(rectF16, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(gcVar.C0);
                if (baVar != null && baVar.c()) {
                    faVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(e15, 855638016));
                } else if (c12 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(e15, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c12);
                    canvas2.drawColor(org.telegram.ui.ActionBar.f6.l1(e15, 855638016));
                }
                if (gcVar.T == null || baVar == null || !baVar.c()) {
                    f38 = e16;
                    rectF4 = rectF16;
                    if (gcVar.T != null && c12 != null) {
                        Paint c13 = gcVar.j0.c(e15 * f10);
                        if (c13 == null) {
                            c13 = gcVar.D0;
                            c13.setAlpha((int) (64.0f * e15));
                        }
                        float d11 = gcVar.c0.d(gcVar.T.e, !gcVar.Q);
                        zb zbVar = gcVar.T;
                        gcVar.Q = zbVar.c > 0;
                        long j21 = j13;
                        gcVar.E0.b((((gcVar.M - gcVar.f) / j13) * gcVar.q1) + gcVar.u1 + gcVar.t1, lerp, f159, f38, j21, audioHeight, d11, rectF4.bottom, zbVar);
                        f39 = f38;
                        j11 = j21;
                        canvas2.drawPath(gcVar.E0, c13);
                        if (f39 >= 1.0f) {
                            int i39 = gcVar.u1;
                            float f162 = gcVar.t1 + i39;
                            float f163 = gcVar.M - gcVar.f;
                            float f164 = gcVar.O;
                            float f165 = gcVar.N;
                            float f166 = j11;
                            float f167 = gcVar.q1;
                            float f168 = ((((f164 * f165) + f163) / f166) * f167) + f162;
                            float f169 = ((((gcVar.P * f165) + f163) / f166) * f167) + f162;
                            float min5 = (Math.min(gcVar.r1 - gcVar.u1, f169) + Math.max(i39, f168)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(gcVar.r1 - gcVar.u1, f169) - Math.max(gcVar.u1, f168)) - AndroidUtilities.dp(24.0f));
                            float dpf22 = AndroidUtilities.dpf2(13.0f);
                            if (gcVar.I0 == null && gcVar.M0 == null) {
                                dpf2 = 0.0f;
                                f41 = 13.0f;
                            } else {
                                f41 = 13.0f;
                                dpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + gcVar.J0 + gcVar.N0;
                            }
                            float f170 = dpf22 + dpf2;
                            boolean z19 = f170 < max5;
                            float min6 = min5 - (Math.min(f170, max5) / 2.0f);
                            gcVar.G0.setBounds((int) min6, (int) (centerY3 - (AndroidUtilities.dp(f41) / 2.0f)), (int) (AndroidUtilities.dp(f41) + min6), (int) ((AndroidUtilities.dp(f41) / 2.0f) + centerY3));
                            float f171 = 1.0f - f39;
                            float f172 = f171 * 255.0f;
                            gcVar.G0.setAlpha((int) f172);
                            gcVar.G0.draw(canvas2);
                            float dpf23 = AndroidUtilities.dpf2(16.11f) + min6;
                            f26 = e15;
                            f40 = f161;
                            f27 = f13;
                            d = 0.0d;
                            f25 = f39;
                            f28 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, gcVar.r1, gcVar.s1, 255, 31);
                            float min7 = Math.min(f169, gcVar.r1) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf23, 0.0f, min7, gcVar.s1);
                            if (gcVar.I0 != null) {
                                canvas2.save();
                                canvas2.translate(dpf23 - gcVar.K0, centerY3 - (gcVar.I0.getHeight() / 2.0f));
                                gcVar.H0.setAlpha((int) (f172 * f26));
                                gcVar.I0.draw(canvas2);
                                canvas2.restore();
                                f42 = gcVar.J0 + dpf23;
                            } else {
                                f42 = dpf23;
                            }
                            if (gcVar.I0 != null && gcVar.M0 != null) {
                                float dpf24 = AndroidUtilities.dpf2(3.66f) + f42;
                                int alpha = gcVar.F0.getAlpha();
                                gcVar.F0.setAlpha((int) (alpha * f171));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf24, centerY3, AndroidUtilities.dp(1.0f), gcVar.F0);
                                gcVar.F0.setAlpha(alpha);
                                f42 = AndroidUtilities.dpf2(2.0f) + dpf24 + AndroidUtilities.dpf2(4.0f);
                            }
                            if (gcVar.M0 != null) {
                                canvas2.save();
                                canvas2.translate(f42 - gcVar.O0, centerY3 - (gcVar.M0.getHeight() / 2.0f));
                                gcVar.L0.setAlpha((int) (f172 * f26));
                                gcVar.M0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z19) {
                                gcVar.Q0.reset();
                                gcVar.Q0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                gcVar.Q0.postTranslate(min7 - AndroidUtilities.dp(8.0f), 0.0f);
                                gcVar.P0.setLocalMatrix(gcVar.Q0);
                                canvas2.drawRect(min7 - AndroidUtilities.dp(8.0f), rectF4.top, min7, rectF4.bottom, gcVar.R0);
                            }
                            canvas.restore();
                        } else {
                            f26 = e15;
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
                    float d12 = gcVar.c0.d(gcVar.T.e, !gcVar.Q);
                    zb zbVar2 = gcVar.T;
                    gcVar.Q = zbVar2.c > 0;
                    rectF4 = rectF16;
                    f38 = e16;
                    gcVar.E0.b((((gcVar.M - gcVar.f) / j13) * gcVar.q1) + gcVar.u1 + gcVar.t1, lerp, f159, f38, j13, audioHeight, d12, rectF4.bottom, zbVar2);
                    canvas2.saveLayerAlpha(rectF4, 102, 31);
                    canvas2.clipPath(gcVar.E0);
                    gcVar.j0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                f39 = f38;
                if (f39 >= 1.0f) {
                }
                canvas.restore();
                f29 = f40;
            } else {
                f25 = e16;
                f26 = e15;
                float f173 = f17;
                paint2 = paint;
                f27 = f13;
                f28 = f14;
                d = 0.0d;
                j11 = j13;
                f29 = f173;
            }
            float f174 = f20;
            float f175 = gcVar.u1 + gcVar.t1;
            float f176 = gcVar.f;
            float f177 = j11;
            float f178 = gcVar.q1;
            float f179 = (((f19 - f176) / f177) * f178) + f175;
            float f180 = (((f18 - f176) / f177) * f178) + f175;
            if (!arrayList3.isEmpty()) {
                f31 = e13;
                f30 = f26;
                f26 = f23;
            } else if (gcVar.J && gcVar.h == null) {
                f31 = e13;
                f30 = f26;
            } else {
                float f181 = f26;
                f26 = Math.max(f28, e13);
                f30 = f181;
                f31 = e13;
            }
            if (f30 > d || f31 > d || f28 > d || f23 > d) {
                if (gcVar.h == null && !gcVar.A && arrayList3.isEmpty()) {
                    f32 = f25;
                    f33 = f30 * AndroidUtilities.lerp(0.6f, 1.0f, f32);
                } else {
                    f32 = f25;
                    f33 = 1.0f;
                }
                Paint paint5 = paint2;
                gcVar.e(canvas, paint5, f174, f29, f179, f180, f33 * f26);
                bc bcVar8 = gcVar.h;
                if (bcVar8 != null && ((gcVar.J || gcVar.A) && (f32 > 0.0f || f24 > 0.0f))) {
                    float f182 = gcVar.s1 - gcVar.v1;
                    float f183 = gcVar.t1 + gcVar.u1;
                    float f184 = bcVar8.g;
                    float f185 = bcVar8.e;
                    float f186 = gcVar.f;
                    float f187 = gcVar.q1;
                    float f188 = ((((bcVar8.h * f185) - f186) / f177) * f187) + f183;
                    canvas3 = canvas;
                    gcVar.e(canvas3, paint5, f182 - f21, f182, ((((f184 * f185) - f186) / f177) * f187) + f183, f188, 0.8f);
                } else if (gcVar.v == null || arrayList3.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    bc bcVar9 = gcVar.v;
                    RectF rectF17 = bcVar9.j;
                    float f189 = rectF17.top;
                    float f190 = rectF17.bottom;
                    float f191 = gcVar.t1 + gcVar.u1;
                    float f192 = bcVar9.f;
                    float f193 = bcVar9.g;
                    float f194 = bcVar9.e;
                    float f195 = gcVar.f;
                    float f196 = gcVar.q1;
                    float f197 = (((((f193 * f194) + f192) - f195) / f177) * f196) + f191;
                    float f198 = (((((bcVar9.h * f194) + f192) - f195) / f177) * f196) + f191;
                    canvas3 = canvas;
                    gcVar.e(canvas3, paint5, f189, f190, f197, f198, 0.8f);
                }
                if (gcVar.U > 1 && (bcVar3 = gcVar.h) != null) {
                    float f199 = bcVar3.e;
                    float f200 = bcVar3.h;
                    float f201 = bcVar3.g;
                    long j22 = (long) ((f200 - f201) * f199);
                    if (j22 > 68999) {
                        float f202 = gcVar.u1 + gcVar.t1;
                        float f203 = gcVar.f;
                        float f204 = gcVar.q1;
                        float f205 = ((((f201 * f199) - f203) / f177) * f204) + f202;
                        float f206 = ((((f200 * f199) - f203) / f177) * f204) + f202;
                        canvas3.save();
                        float f207 = gcVar.s1 - gcVar.v1;
                        canvas3.clipRect(f205, f207 - f21, f206, f207);
                        gcVar.v0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f27) * 255.0f));
                        long j23 = 59000;
                        int min8 = (int) Math.min(gcVar.U - 1, j22 / 59000);
                        int i40 = 1;
                        while (i40 <= min8) {
                            if (Math.min(j23, j22 - (i40 * j23)) < 1000) {
                                break;
                            }
                            float f208 = gcVar.u1 + gcVar.t1;
                            bc bcVar10 = gcVar.h;
                            float f209 = ((((((long) (bcVar10.e * bcVar10.g)) + r2) - gcVar.f) / f177) * gcVar.q1) + f208;
                            float f210 = gcVar.s1 - gcVar.v1;
                            Paint paint6 = gcVar.v0;
                            Canvas canvas4 = canvas3;
                            canvas4.drawRect(f209, (gcVar.s1 - gcVar.v1) - f21, AndroidUtilities.dp(1.0f) + f209, f210, paint6);
                            canvas3 = canvas4;
                            StringBuilder sb2 = new StringBuilder("#");
                            i40++;
                            sb2.append(i40);
                            canvas3.drawText(sb2.toString(), f209 + AndroidUtilities.dp(2.0f), ((gcVar.s1 - gcVar.v1) - f21) + AndroidUtilities.dp(14.0f), gcVar.A0);
                            j23 = 59000;
                        }
                        canvas3.restore();
                        d9 = gcVar.X0.d(0.0f, false);
                        float contentHeight = ((gcVar.s1 - gcVar.getContentHeight()) + gcVar.v1) - AndroidUtilities.dpf2(2.3f);
                        float dpf25 = AndroidUtilities.dpf2(4.3f) + (gcVar.s1 - gcVar.v1);
                        if (d9 <= 0.0f) {
                            long j24 = gcVar.Y0;
                            if (j24 == -1) {
                                bc bcVar11 = gcVar.h;
                                if (bcVar11 != null) {
                                    j24 = (long) (bcVar11.e * bcVar11.h);
                                } else {
                                    bc bcVar12 = gcVar.v;
                                    if (bcVar12 != null) {
                                        j24 = (long) ((bcVar12.h - bcVar12.g) * bcVar12.e);
                                    } else {
                                        if (gcVar.A) {
                                            f34 = gcVar.D;
                                            f35 = gcVar.G;
                                        } else {
                                            f34 = gcVar.N;
                                            f35 = gcVar.P;
                                        }
                                        j24 = (long) (f34 * f35);
                                    }
                                }
                            }
                            gcVar = this;
                            gcVar.d(canvas3, contentHeight, dpf25, j24, d9 * f26);
                        } else {
                            gcVar = gcVar;
                        }
                        gcVar.d(canvas, contentHeight, dpf25, gcVar.e, (1.0f - d9) * f26);
                    }
                }
                d9 = gcVar.X0.d(0.0f, false);
                float contentHeight2 = ((gcVar.s1 - gcVar.getContentHeight()) + gcVar.v1) - AndroidUtilities.dpf2(2.3f);
                float dpf252 = AndroidUtilities.dpf2(4.3f) + (gcVar.s1 - gcVar.v1);
                if (d9 <= 0.0f) {
                }
                gcVar.d(canvas, contentHeight2, dpf252, gcVar.e, (1.0f - d9) * f26);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            j11 = j10;
        }
        if (gcVar.i1) {
            float f211 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f212 = gcVar.j1;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / gcVar.q1) * j11 * f211 * f212);
            if (gcVar.T0) {
                gcVar.j1 = (f211 * 0.25f) + f212;
            }
            int i41 = gcVar.d1;
            if (i41 == 4 && (bcVar2 = gcVar.h) != null) {
                float f213 = bcVar2.g;
                long j25 = gcVar.f;
                long j26 = bcVar2.e;
                float f214 = j26;
                if (f213 < j25 / f214) {
                    i10 = -1;
                } else if (bcVar2.h > (j25 + j11) / f214) {
                    i10 = 1;
                } else {
                    gcVar.j1 = 1.0f;
                    i10 = 0;
                }
                long j27 = i10 * dp2;
                gcVar.f = Utilities.clamp(j25 + j27, j26 - j11, 0L);
                gcVar.e += j27;
                bc bcVar13 = gcVar.h;
                float f215 = (r3 - j25) / bcVar13.e;
                if (f215 > 0.0f) {
                    f11 = 1.0f;
                    max = Math.min(1.0f - bcVar13.h, f215);
                } else {
                    f11 = 1.0f;
                    max = Math.max(0.0f - bcVar13.g, f215);
                }
                bc bcVar14 = gcVar.h;
                bcVar14.g = Utilities.clamp(bcVar14.g + max, f11, 0.0f);
                bc bcVar15 = gcVar.h;
                bcVar15.h = Utilities.clamp(bcVar15.h + max, f11, 0.0f);
                ac acVar = gcVar.a;
                if (acVar != null) {
                    acVar.a1(gcVar.h.g, false);
                    gcVar.a.Z1(gcVar.h.h);
                }
                gcVar.invalidate();
            } else if (i41 == 8) {
                float f216 = gcVar.O;
                long j28 = gcVar.M;
                float f217 = (-j28) + 100;
                long j29 = gcVar.N;
                float f218 = j29;
                if (f216 < f217 / f218) {
                    i9 = -1;
                } else if (gcVar.P >= ((r8 + j11) - 100) / f218) {
                    i9 = 1;
                } else {
                    gcVar.j1 = 1.0f;
                    i9 = 0;
                }
                if (i9 != 0) {
                    if (gcVar.L && (bcVar = gcVar.h) != null) {
                        long j30 = j28 - (i9 * dp2);
                        float f219 = bcVar.h;
                        float f220 = bcVar.e;
                        gcVar.M = Utilities.clamp(j30, (long) ((f219 * f220) - (f216 * f218)), (long) ((bcVar.g * f220) - (gcVar.P * f218)));
                    } else if (gcVar.C && gcVar.A) {
                        long j31 = j28 - (i9 * dp2);
                        float f221 = gcVar.G;
                        float f222 = gcVar.D;
                        gcVar.M = Utilities.clamp(j31, (long) ((f221 * f222) - (f216 * f218)), (long) ((gcVar.F * f222) - (gcVar.P * f218)));
                    } else {
                        gcVar.M = Utilities.clamp(j28 - (i9 * dp2), 0L, -(j29 - Math.min(gcVar.getBaseDuration(), gcVar.getMaxScrollDuration())));
                    }
                    float f223 = (-(gcVar.M - j28)) / gcVar.N;
                    float min9 = f223 > 0.0f ? Math.min(1.0f - gcVar.P, f223) : Math.max(0.0f - gcVar.O, f223);
                    if (gcVar.h == null) {
                        float f224 = gcVar.e;
                        float f225 = gcVar.N;
                        gcVar.e = (long) Utilities.clamp((min9 * f225) + f224, f225, 0.0f);
                    }
                    gcVar.O = Utilities.clamp(gcVar.O + min9, 1.0f, 0.0f);
                    gcVar.P = Utilities.clamp(gcVar.P + min9, 1.0f, 0.0f);
                    ac acVar2 = gcVar.a;
                    if (acVar2 != null) {
                        acVar2.K1(gcVar.O);
                        gcVar.a.u1(gcVar.P);
                        gcVar.a.Q(gcVar.e, false);
                    }
                    gcVar.invalidate();
                } else {
                    gcVar.j1 = 1.0f;
                }
            } else {
                gcVar.j1 = 1.0f;
            }
        } else {
            gcVar.j1 = 1.0f;
        }
        int contentHeight3 = gcVar.getContentHeight();
        if (gcVar.c != contentHeight3) {
            gcVar.c = contentHeight3;
            Runnable runnable = gcVar.d;
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
        int i9 = (int) (255.0f * f14);
        Paint paint2 = this.v0;
        paint2.setAlpha(i9);
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
        paint5.setAlpha(i9);
        float f15 = f10 + f11;
        float f16 = (f15 - dp2) / 2.0f;
        float f17 = (f15 + dp2) / 2.0f;
        rectF.set(org.telegram.messenger.l0.a(AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f), dp, 2.0f, f12), f16, f12 - ((AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f) + dp) / 2.0f), f17);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.T0) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(e2.c.A(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), dp, 2.0f, f13), f16, j3.r0.c(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), dp, 2.0f, f13), f17);
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
        ac acVar;
        long clamp;
        bc bcVar = this.h;
        if (bcVar == null && !this.A) {
            long j16 = this.M;
            long clamp2 = Utilities.clamp(j16 + ((long) f10), 0L, -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.M = clamp2;
            float f13 = clamp2 - j16;
            this.O = Utilities.clamp(this.O - (f13 / this.N), 1.0f, 0.0f);
            this.P = Utilities.clamp(this.P - (f13 / this.N), 1.0f, 0.0f);
            ac acVar2 = this.a;
            if (acVar2 != null) {
                acVar2.K1(this.O);
                this.a.u1(this.P);
            }
        } else if (this.L) {
            if (bcVar != null) {
                f11 = bcVar.g;
                j10 = bcVar.e;
            } else {
                f11 = this.F;
                j10 = this.D;
            }
            float f14 = f11 * j10;
            if (bcVar != null) {
                f12 = bcVar.h;
                j11 = bcVar.e;
            } else {
                f12 = this.G;
                j11 = this.D;
            }
            float f15 = f12 * j11;
            float f16 = bcVar != null ? (bcVar.h - bcVar.g) * bcVar.e : this.D * (this.G - this.F);
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
                ac acVar3 = this.a;
                if (acVar3 != null) {
                    acVar3.K1(this.O);
                    this.a.u1(this.P);
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
                ac acVar4 = this.a;
                if (acVar4 != null) {
                    acVar4.K1(this.O);
                    this.a.u1(this.P);
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
        ac acVar5 = this.a;
        if (acVar5 != null) {
            acVar5.m2(this.M + ((long) (this.O * this.N)));
        }
        boolean z10 = this.i1;
        if (z10 || (acVar = this.a) == null) {
            if (z10 || this.n1) {
                bc bcVar2 = this.h;
                if (bcVar2 != null) {
                    long j27 = this.M + ((long) (this.O * this.N));
                    float f24 = bcVar2.h;
                    float f25 = bcVar2.e;
                    this.e = Utilities.clamp(j27, (long) (f24 * f25), (long) (bcVar2.g * f25));
                } else if (!this.A || bcVar2 == null) {
                    float f26 = this.O;
                    long j28 = this.N;
                    this.e = Utilities.clamp((long) (f26 * j28), j28, 0L);
                } else {
                    long j29 = this.M + ((long) (this.O * this.N));
                    float f27 = this.G;
                    float f28 = bcVar2.e;
                    this.e = Utilities.clamp(j29, (long) (f27 * f28), (long) (this.F * f28));
                }
                ac acVar6 = this.a;
                if (acVar6 != null) {
                    acVar6.Q(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        acVar.H0(true);
        bc bcVar3 = this.h;
        if (bcVar3 != null) {
            long j30 = this.M + ((long) (this.O * this.N));
            float f29 = bcVar3.h;
            float f30 = bcVar3.e;
            clamp = Utilities.clamp(j30, (long) (f29 * f30), (long) (bcVar3.g * f30));
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
        ac acVar7 = this.a;
        this.e = clamp;
        acVar7.Q(clamp, false);
    }

    public final void i(bc bcVar, float f10) {
        ac acVar;
        long clamp;
        long j10;
        long j11;
        long j12;
        long j13;
        if (bcVar == null) {
            return;
        }
        bc bcVar2 = this.v;
        if (bcVar2 != bcVar && bcVar2 != null) {
            if (this.n == this.s.indexOf(bcVar)) {
                bc bcVar3 = this.v;
                float f11 = bcVar3.e;
                float f12 = bcVar.h;
                float f13 = bcVar.e;
                long j14 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = bcVar.g;
                long j15 = (long) ((f11 * 0.0f) - (f14 * f13));
                float min = Math.min(f12 - f14, ((bcVar3.h - bcVar3.g) * f11) / f13);
                long j16 = bcVar.f;
                long j17 = (long) f10;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float clamp2 = Utilities.clamp((((this.v.h * r2.e) - j16) - j17) / bcVar.e, 1.0f, min);
                    bcVar.h = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    bcVar.g = clamp3;
                    bc bcVar4 = this.v;
                    float f15 = bcVar4.h;
                    float f16 = bcVar4.e;
                    float f17 = bcVar.h;
                    float f18 = bcVar.e;
                    long j19 = (long) ((f15 * f16) - (f17 * f18));
                    long j20 = (long) ((bcVar4.g * f16) - (clamp3 * f18));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    bcVar.f = Utilities.clamp(bcVar.f + j17, j13, j12);
                    ac acVar2 = this.a;
                    if (acVar2 != null) {
                        acVar2.p1(bcVar.g, bcVar.a);
                        this.a.Y1(bcVar.h, bcVar.a);
                    }
                } else if (j18 < j15) {
                    float clamp4 = Utilities.clamp((((this.v.g * r2.e) - j16) - j17) / bcVar.e, 1.0f - min, 0.0f);
                    bcVar.g = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    bcVar.h = clamp5;
                    bc bcVar5 = this.v;
                    float f19 = bcVar5.h;
                    float f20 = bcVar5.e;
                    float f21 = bcVar.e;
                    long j21 = (long) ((f19 * f20) - (clamp5 * f21));
                    long j22 = (long) ((bcVar5.g * f20) - (bcVar.g * f21));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    bcVar.f = Utilities.clamp(bcVar.f + j17, j11, j10);
                    ac acVar3 = this.a;
                    if (acVar3 != null) {
                        acVar3.p1(bcVar.g, bcVar.a);
                        this.a.Y1(bcVar.h, bcVar.a);
                    }
                } else {
                    bcVar.f = j18;
                }
            } else {
                long j23 = bcVar.f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = bcVar.e;
                bcVar.f = Utilities.clamp(j23, (long) (baseDuration - (bcVar.h * f22)), (long) ((-bcVar.g) * f22));
            }
        }
        invalidate();
        ac acVar4 = this.a;
        if (acVar4 != null) {
            acVar4.j2(bcVar.a, bcVar.f);
        }
        boolean z10 = this.i1;
        if (z10 || (acVar = this.a) == null) {
            if (z10 || this.n1) {
                bc bcVar6 = this.v;
                if (bcVar6 == bcVar || bcVar6 == null) {
                    float f23 = bcVar.g;
                    long j24 = bcVar.e;
                    this.e = Utilities.clamp((long) (f23 * j24), j24, 0L);
                } else {
                    long j25 = bcVar.f + ((long) (bcVar.g * bcVar.e));
                    float f24 = bcVar6.h;
                    float f25 = bcVar6.e;
                    this.e = Utilities.clamp(j25, (long) (f24 * f25), (long) (bcVar6.g * f25));
                }
                ac acVar5 = this.a;
                if (acVar5 != null) {
                    acVar5.Q(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        acVar.H0(true);
        bc bcVar7 = this.v;
        if (bcVar7 == bcVar || bcVar7 == null) {
            float f26 = bcVar.g;
            long j26 = bcVar.e;
            clamp = Utilities.clamp((long) (f26 * j26), j26, 0L);
        } else {
            long j27 = bcVar.f + ((long) (bcVar.g * bcVar.e));
            float f27 = bcVar7.h;
            float f28 = bcVar7.e;
            clamp = Utilities.clamp(j27, (long) (f27 * f28), (long) (bcVar7.g * f28));
        }
        bc bcVar8 = this.v;
        if (bcVar8 != bcVar && bcVar8 != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        ac acVar6 = this.a;
        this.e = clamp;
        acVar6.Q(clamp, false);
    }

    public final void j(float f10) {
        long j10;
        long j11;
        long j12;
        long j13;
        ac acVar;
        long clamp;
        bc bcVar = this.h;
        if (bcVar == null) {
            long j14 = this.E;
            long clamp2 = Utilities.clamp(j14 + ((long) f10), 0L, -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.E = clamp2;
            float f11 = clamp2 - j14;
            this.F = Utilities.clamp(this.F - (f11 / this.D), 1.0f, 0.0f);
            this.G = Utilities.clamp(this.G - (f11 / this.D), 1.0f, 0.0f);
            ac acVar2 = this.a;
            if (acVar2 != null) {
                acVar2.v0(this.F);
                this.a.h2(this.G);
            }
        } else if (this.C) {
            float f12 = bcVar.h;
            float f13 = bcVar.e;
            float f14 = this.G;
            float f15 = this.D;
            long j15 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = bcVar.g;
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
                bc bcVar2 = this.h;
                float f18 = bcVar2.h;
                float f19 = bcVar2.e;
                float f20 = this.G;
                float f21 = this.D;
                long j20 = (long) ((f18 * f19) - (f20 * f21));
                long j21 = (long) ((bcVar2.g * f19) - (clamp4 * f21));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.E = Utilities.clamp(this.E + j18, j13, j12);
                ac acVar3 = this.a;
                if (acVar3 != null) {
                    acVar3.v0(this.F);
                    this.a.h2(this.G);
                }
            } else if (j19 < j16) {
                float clamp5 = Utilities.clamp((((this.h.g * r1.e) - j17) - j18) / this.D, 1.0f - min, 0.0f);
                this.F = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.G = clamp6;
                bc bcVar3 = this.h;
                float f22 = bcVar3.h;
                float f23 = bcVar3.e;
                float f24 = this.D;
                long j22 = (long) ((f22 * f23) - (clamp6 * f24));
                long j23 = (long) ((bcVar3.g * f23) - (this.F * f24));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.E = Utilities.clamp(this.E + j18, j11, j10);
                ac acVar4 = this.a;
                if (acVar4 != null) {
                    acVar4.v0(this.F);
                    this.a.h2(this.G);
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
        ac acVar5 = this.a;
        if (acVar5 != null) {
            acVar5.i1(this.E + ((long) (this.F * this.D)));
        }
        boolean z10 = this.i1;
        if (z10 || (acVar = this.a) == null) {
            if (z10 || this.n1) {
                bc bcVar4 = this.h;
                if (bcVar4 != null) {
                    long j25 = this.E + ((long) (this.F * this.D));
                    float f26 = bcVar4.h;
                    float f27 = bcVar4.e;
                    this.e = Utilities.clamp(j25, (long) (f26 * f27), (long) (bcVar4.g * f27));
                } else {
                    float f28 = this.F;
                    long j26 = this.D;
                    this.e = Utilities.clamp((long) (f28 * j26), j26, 0L);
                }
                ac acVar6 = this.a;
                if (acVar6 != null) {
                    acVar6.Q(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        acVar.H0(true);
        bc bcVar5 = this.h;
        if (bcVar5 != null) {
            long j27 = this.E + ((long) (this.F * this.D));
            float f29 = bcVar5.h;
            float f30 = bcVar5.e;
            clamp = Utilities.clamp(j27, (long) (f29 * f30), (long) (bcVar5.g * f30));
        } else {
            float f31 = this.F;
            long j28 = this.D;
            clamp = Utilities.clamp((long) (f31 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        ac acVar7 = this.a;
        this.e = clamp;
        acVar7.Q(clamp, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        bc bcVar = this.h;
        float f10 = (bcVar.h + bcVar.g) / 2.0f;
        long j10 = bcVar.e;
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
        bc bcVar = this.h;
        ArrayList arrayList = this.s;
        if (bcVar == null && !this.J && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.u1) - this.t1) / this.q1;
        bc bcVar2 = this.v;
        long j10 = bcVar2 != null ? (long) ((bcVar2.g * bcVar2.e) + bcVar2.f) : 0L;
        float f12 = f11 * min;
        if (bcVar2 == null) {
            j10 = this.h == null ? this.M : 0L;
        }
        long clamp = (long) Utilities.clamp((f12 - j10) + this.f, getBaseDuration(), 0.0f);
        bc bcVar3 = this.h;
        if (bcVar3 != null) {
            float f13 = clamp / bcVar3.e;
            if (f13 < bcVar3.g || f13 > bcVar3.h) {
                return false;
            }
        }
        bc bcVar4 = this.v;
        if (bcVar4 != null && (clamp < 0 || clamp >= ((long) ((bcVar4.h - bcVar4.g) * bcVar4.e)))) {
            return false;
        }
        if (this.J && bcVar3 == null && arrayList.isEmpty()) {
            float f14 = clamp / this.N;
            if (f14 < this.O || f14 > this.P) {
                return false;
            }
        }
        this.e = clamp;
        invalidate();
        ac acVar = this.a;
        if (acVar != null) {
            acVar.Q(clamp, z10);
        }
        bg.i2 i2Var = this.Z0;
        if (i2Var != null) {
            AndroidUtilities.cancelRunOnUIThread(i2Var);
            this.Z0 = null;
        }
        if (!z10) {
            return true;
        }
        bg.i2 i2Var2 = new bg.i2(this, clamp, 11);
        this.Z0 = i2Var2;
        AndroidUtilities.runOnUIThread(i2Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z10) {
        long j12;
        boolean z11;
        boolean z12;
        bc bcVar;
        if (TextUtils.equals(this.B, str)) {
            return;
        }
        ec ecVar = this.I;
        if (ecVar != null) {
            ecVar.b();
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
            if (getMeasuredWidth() <= 0 || this.I != null || ((bcVar = this.h) != null && bcVar.e < 1)) {
                j12 = j13;
                z12 = false;
                z11 = true;
            } else {
                String str2 = this.B;
                int i9 = this.r1;
                int i10 = this.u1;
                int i11 = (i9 - i10) - i10;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.D;
                Long valueOf = j14 > 2 ? Long.valueOf(j14) : null;
                bc bcVar2 = this.h;
                j12 = j13;
                z12 = false;
                z11 = true;
                this.I = new ec(this, false, str2, i11, dp, valueOf, bcVar2 != null ? bcVar2.e : getMaxScrollDuration(), -1L, -1L, new xb(this, 0));
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
        bc bcVar = this.h;
        if (TextUtils.equals(bcVar == null ? null : bcVar.d, str)) {
            return;
        }
        bc bcVar2 = this.h;
        if (bcVar2 != null) {
            ec ecVar = bcVar2.c;
            if (ecVar != null) {
                ecVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            bc bcVar3 = new bc(this);
            this.h = bcVar3;
            bcVar3.b = z10;
            bcVar3.d = str;
            bcVar3.e = j10;
            bcVar3.i = f10;
            bc.a(bcVar3, false);
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
    public final void onMeasure(int i9, int i10) {
        this.H0.setTextSize(AndroidUtilities.dp(12.0f));
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.u1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.v1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i9);
        this.r1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.s1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.t1 = dp4;
        this.q1 = (this.r1 - (dp4 * 2)) - (this.u1 * 2);
        bc bcVar = this.h;
        if (bcVar != null && bcVar.d != null && bcVar.c == null) {
            bc.a(bcVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                bc bcVar2 = (bc) obj;
                if (bcVar2.d != null && bcVar2.c == null) {
                    bc.a(bcVar2, false);
                    bc.b(bcVar2);
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
        bg.i2 i2Var;
        boolean z11;
        VelocityTracker velocityTracker;
        ac acVar;
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
        ac acVar2;
        int i9;
        float f11;
        float f12;
        boolean z15;
        float f13;
        float clamp;
        ac acVar3;
        ac acVar4;
        int i10;
        float f14;
        float f15;
        bc bcVar = this.h;
        ArrayList arrayList = this.s;
        if (bcVar != null || !arrayList.isEmpty() || this.J || this.A) {
            float timelineHeight = this.s1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                yl0 yl0Var = this.S0;
                bg.o0 o0Var = this.U0;
                if (action == 0) {
                    bg.i2 i2Var2 = this.Z0;
                    if (i2Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(i2Var2);
                        this.Z0 = null;
                    }
                    yl0Var.a();
                    this.e1 = -1;
                    this.d1 = c(motionEvent);
                    this.f1 = -1;
                    this.g1 = -1;
                    int i11 = this.s1 - this.v1;
                    if (!this.f0) {
                        if (this.k0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.f1 = 10;
                            this.d1 = -1;
                        }
                    }
                    if (this.f1 != -1 || this.h == null) {
                        f14 = 4.0f;
                    } else {
                        float f16 = i11;
                        if (motionEvent.getY() < f16) {
                            f14 = 4.0f;
                            if (motionEvent.getY() > (f16 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.f1 = 0;
                            }
                        } else {
                            f14 = 4.0f;
                        }
                        i11 = (int) (f16 - (getVideoHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.f1 == -1 && !arrayList.isEmpty()) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            f15 = 2.0f;
                            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((bc) arrayList.get(i12)).k.c);
                            float f17 = i11;
                            if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - lerp) - AndroidUtilities.dp(2.0f)) {
                                this.f1 = 3;
                                this.g1 = i12;
                                break;
                            }
                            i11 = (int) (f17 - (lerp + AndroidUtilities.dp(f14)));
                        }
                    }
                    f15 = 2.0f;
                    if (this.f1 == -1 && this.A) {
                        float f18 = i11;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getRoundHeight()) - AndroidUtilities.dp(f15)) {
                            this.f1 = 1;
                        }
                        i11 = (int) (f18 - (getRoundHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.f1 == -1 && this.J) {
                        float f19 = i11;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getAudioHeight()) - AndroidUtilities.dp(f15)) {
                            this.f1 = 2;
                        }
                        getAudioHeight();
                        AndroidUtilities.dp(f14);
                    }
                    this.b1 = System.currentTimeMillis();
                    int i13 = this.d1;
                    this.h1 = i13 == 0 || i13 == -1 || i13 == 1;
                    this.k1 = false;
                    if (i13 == 1 || i13 == 5 || i13 == 8) {
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
                        AndroidUtilities.cancelRunOnUIThread(o0Var);
                        AndroidUtilities.runOnUIThread(o0Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.c1;
                    if (this.f0 && (this.i1 || Math.abs(x10) > AndroidUtilities.touchSlop)) {
                        long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                        bc bcVar2 = this.h;
                        if (bcVar2 != null && this.d1 == 1) {
                            this.f = (long) Utilities.clamp(this.f - ((x10 / this.q1) * min3), bcVar2.e - min3, 0.0f);
                            invalidate();
                            if (!this.i1) {
                                this.j1 = 1.0f;
                            }
                            this.i1 = true;
                            this.h1 = false;
                        } else if (bcVar2 == null || !((i10 = this.d1) == 2 || i10 == 3 || i10 == 4)) {
                            int i14 = this.d1;
                            if (i14 == 6 || i14 == 7 || i14 == 8) {
                                float f20 = (min3 / this.N) * (x10 / this.q1);
                                if (i14 == 6) {
                                    float g10 = this.P - (g() / this.N);
                                    float max3 = Math.max(0L, this.f - this.M);
                                    float f21 = this.N;
                                    float f22 = max3 / f21;
                                    bc bcVar3 = this.h;
                                    if (bcVar3 != null) {
                                        max = Math.max(f22, (((bcVar3.g * bcVar3.e) + this.f) - this.M) / f21);
                                    } else {
                                        bc bcVar4 = this.v;
                                        if (bcVar4 != null) {
                                            max = Math.max(f22, (((bcVar4.g * bcVar4.e) + this.f) - this.M) / f21);
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
                                    ac acVar5 = this.a;
                                    if (acVar5 != null) {
                                        acVar5.m2(this.M + ((long) (this.O * this.N)));
                                    }
                                    ac acVar6 = this.a;
                                    if (acVar6 != null) {
                                        acVar6.K1(this.O);
                                    }
                                } else if (i14 == 7) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.M) + min3) / this.N);
                                    float f24 = this.O;
                                    float g11 = g();
                                    float f25 = this.N;
                                    float f26 = (g11 / f25) + f24;
                                    bc bcVar5 = this.h;
                                    if (bcVar5 != null) {
                                        min = Math.min(min4, (((bcVar5.h * bcVar5.e) + this.f) - this.M) / f25);
                                    } else {
                                        bc bcVar6 = this.v;
                                        if (bcVar6 != null) {
                                            min = Math.min(min4, (((bcVar6.h * bcVar6.e) + this.f) - this.M) / f25);
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
                                    ac acVar7 = this.a;
                                    if (acVar7 != null) {
                                        acVar7.u1(this.P);
                                    }
                                }
                                if (this.d1 == 8) {
                                    float min5 = f20 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.M) + min3) / this.N) - this.P), f20) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.M) / this.N) - this.O), f20);
                                    float f28 = this.O + min5;
                                    this.O = f28;
                                    this.P += min5;
                                    ac acVar8 = this.a;
                                    if (acVar8 != null) {
                                        acVar8.K1(f28);
                                        this.a.m2(this.M + ((long) (this.O * this.N)));
                                        this.a.u1(this.P);
                                    }
                                    ac acVar9 = this.a;
                                    if (acVar9 != null) {
                                        acVar9.H0(true);
                                    }
                                }
                                if (this.h == null && !this.A) {
                                    this.e = (long) (this.O * this.N);
                                    ac acVar10 = this.a;
                                    if (acVar10 != null) {
                                        acVar10.H0(true);
                                        this.a.Q(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.i1) {
                                    this.j1 = 1.0f;
                                }
                                this.i1 = true;
                                this.h1 = false;
                            } else if (i14 == 10 || i14 == 11 || i14 == 12) {
                                float f29 = (min3 / this.D) * (x10 / this.q1);
                                if (i14 == 10) {
                                    float g12 = this.G - (g() / this.D);
                                    float max4 = Math.max(0L, this.f - this.E);
                                    float f30 = this.D;
                                    float f31 = max4 / f30;
                                    bc bcVar7 = this.h;
                                    if (bcVar7 != null) {
                                        max2 = Math.max(f31, (((bcVar7.g * bcVar7.e) + this.f) - this.E) / f30);
                                    } else {
                                        bc bcVar8 = this.v;
                                        if (bcVar8 != null) {
                                            max2 = Math.max(f31, (((bcVar8.g * bcVar8.e) + this.f) - this.E) / f30);
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
                                    ac acVar11 = this.a;
                                    if (acVar11 != null) {
                                        acVar11.i1(this.E + ((long) (this.F * this.D)));
                                    }
                                    ac acVar12 = this.a;
                                    if (acVar12 != null) {
                                        acVar12.v0(this.F);
                                    }
                                } else if (i14 == 11) {
                                    float min6 = Math.min(1.0f, Math.max(0L, (this.f - this.E) + min3) / this.D);
                                    float f33 = this.F;
                                    float g13 = g();
                                    float f34 = this.D;
                                    float f35 = (g13 / f34) + f33;
                                    bc bcVar9 = this.h;
                                    if (bcVar9 != null) {
                                        min6 = Math.min(min6, (((bcVar9.h * bcVar9.e) + this.f) - this.E) / f34);
                                    }
                                    bc bcVar10 = this.v;
                                    if (bcVar10 != null) {
                                        min2 = Math.min(min6, (((bcVar10.h * bcVar10.e) + this.f) - this.E) / this.D);
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
                                    ac acVar13 = this.a;
                                    if (acVar13 != null) {
                                        acVar13.h2(this.G);
                                    }
                                }
                                if (this.d1 == 12) {
                                    float min7 = f29 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.E) + min3) / this.D) - this.G, f29) : Math.max((Math.max(0L, this.f - this.E) / this.D) - this.F, f29);
                                    float f37 = this.F + min7;
                                    this.F = f37;
                                    this.G += min7;
                                    ac acVar14 = this.a;
                                    if (acVar14 != null) {
                                        acVar14.v0(f37);
                                        this.a.i1(this.E + ((long) (this.F * this.D)));
                                        this.a.h2(this.G);
                                    }
                                    ac acVar15 = this.a;
                                    if (acVar15 != null) {
                                        acVar15.H0(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.F * this.D);
                                    ac acVar16 = this.a;
                                    if (acVar16 != null) {
                                        acVar16.H0(true);
                                        z13 = false;
                                        this.a.Q(this.e, false);
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
                                int i15 = this.e1;
                                if (i15 < 0 || i15 >= arrayList.size() || !((i9 = this.d1) == 13 || i9 == 14 || i9 == 15)) {
                                    int i16 = this.d1;
                                    if (i16 == 5) {
                                        h((x10 / this.q1) * min3);
                                        if (!this.i1) {
                                            this.j1 = 1.0f;
                                        }
                                        this.i1 = true;
                                        this.h1 = false;
                                    } else if (i16 == 9) {
                                        j((x10 / this.q1) * min3);
                                        if (!this.i1) {
                                            this.j1 = 1.0f;
                                        }
                                        this.i1 = true;
                                        this.h1 = false;
                                    } else {
                                        int i17 = this.e1;
                                        if (i17 >= 0 && i17 < arrayList.size() && this.d1 == 16) {
                                            i((bc) arrayList.get(this.e1), (x10 / this.q1) * min3);
                                            if (!this.i1) {
                                                this.j1 = 1.0f;
                                            }
                                            this.i1 = true;
                                            this.h1 = false;
                                        } else if (this.h1) {
                                            m(motionEvent.getX(), currentTimeMillis - this.a1 < 350);
                                            if (this.i1 || (acVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                acVar2.H0(true);
                                            }
                                            if (!this.i1) {
                                                this.j1 = 1.0f;
                                            }
                                            this.i1 = z14;
                                        }
                                    }
                                } else {
                                    bc bcVar11 = (bc) arrayList.get(this.e1);
                                    float f38 = (min3 / bcVar11.e) * (x10 / this.q1);
                                    int i18 = this.d1;
                                    if (i18 == 13) {
                                        float g14 = bcVar11.h - (g() / bcVar11.e);
                                        float max5 = Math.max(0L, this.f - bcVar11.f) / bcVar11.e;
                                        if (bcVar11 == this.v) {
                                            f11 = f38;
                                            max5 = Math.max(max5, bcVar11.h - (f() / bcVar11.e));
                                            if (!this.k1 && f11 < 0.0f) {
                                                f12 = 0.0f;
                                                if (bcVar11.g <= bcVar11.h - (f() / bcVar11.e)) {
                                                    this.d1 = 15;
                                                }
                                                f13 = bcVar11.g;
                                                clamp = Utilities.clamp(f13 + f11, g14, max5);
                                                bcVar11.g = clamp;
                                                if (Math.abs(f13 - clamp) > 0.01f) {
                                                    this.k1 = true;
                                                }
                                                acVar3 = this.a;
                                                if (acVar3 != null) {
                                                    acVar3.j2(bcVar11.a, bcVar11.f);
                                                }
                                                acVar4 = this.a;
                                                if (acVar4 != null) {
                                                    acVar4.p1(bcVar11.g, bcVar11.a);
                                                }
                                            }
                                        } else {
                                            f11 = f38;
                                        }
                                        f12 = 0.0f;
                                        f13 = bcVar11.g;
                                        clamp = Utilities.clamp(f13 + f11, g14, max5);
                                        bcVar11.g = clamp;
                                        if (Math.abs(f13 - clamp) > 0.01f) {
                                        }
                                        acVar3 = this.a;
                                        if (acVar3 != null) {
                                        }
                                        acVar4 = this.a;
                                        if (acVar4 != null) {
                                        }
                                    } else {
                                        f11 = f38;
                                        f12 = 0.0f;
                                        if (i18 == 14) {
                                            float min8 = Math.min(1.0f, Math.max(0L, (this.f - bcVar11.f) + min3) / bcVar11.e);
                                            float g15 = (g() / bcVar11.e) + bcVar11.g;
                                            if (bcVar11 == this.v) {
                                                min8 = Math.min(min8, (f() / bcVar11.e) + bcVar11.g);
                                                if (!this.k1 && f11 > 0.0f) {
                                                    if (bcVar11.h >= (f() / bcVar11.e) + bcVar11.g) {
                                                        this.d1 = 15;
                                                    }
                                                }
                                            }
                                            float f39 = bcVar11.h;
                                            float clamp6 = Utilities.clamp(f39 + f11, min8, g15);
                                            bcVar11.h = clamp6;
                                            if (Math.abs(f39 - clamp6) > 0.01f) {
                                                this.k1 = true;
                                            }
                                            ac acVar17 = this.a;
                                            if (acVar17 != null) {
                                                acVar17.Y1(bcVar11.h, bcVar11.a);
                                            }
                                        }
                                    }
                                    if (this.d1 == 15) {
                                        float min9 = f11 > f12 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - bcVar11.f) + min3) / bcVar11.e) - bcVar11.h, f11) : Math.max((Math.max(0L, this.f - bcVar11.f) / bcVar11.e) - bcVar11.g, f11);
                                        float f40 = bcVar11.g + min9;
                                        bcVar11.g = f40;
                                        bcVar11.h += min9;
                                        ac acVar18 = this.a;
                                        if (acVar18 != null) {
                                            acVar18.p1(f40, bcVar11.a);
                                            this.a.j2(bcVar11.a, bcVar11.f);
                                            this.a.Y1(bcVar11.h, bcVar11.a);
                                        }
                                        ac acVar19 = this.a;
                                        if (acVar19 != null) {
                                            z15 = true;
                                            acVar19.H0(true);
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
                            float f41 = bcVar2.e;
                            float f42 = (min3 / f41) * (x10 / this.q1);
                            if (i10 == 2) {
                                bcVar2.g = Utilities.clamp(bcVar2.g + f42, bcVar2.h - (1000.0f / f41), 0.0f);
                                ac acVar20 = this.a;
                                if (acVar20 != null) {
                                    acVar20.a1(this.h.g, false);
                                }
                                bc bcVar12 = this.h;
                                float f43 = bcVar12.h - bcVar12.g;
                                float f44 = f();
                                bc bcVar13 = this.h;
                                if (f43 > f44 / bcVar13.e) {
                                    bcVar13.h = Math.min(1.0f, (f() / this.h.e) + bcVar13.g);
                                    ac acVar21 = this.a;
                                    if (acVar21 != null) {
                                        acVar21.Z1(this.h.h);
                                    }
                                }
                            } else if (i10 == 3) {
                                bcVar2.h = Utilities.clamp(bcVar2.h + f42, 1.0f, (1000.0f / f41) + bcVar2.g);
                                ac acVar22 = this.a;
                                if (acVar22 != null) {
                                    acVar22.Z1(this.h.h);
                                }
                                bc bcVar14 = this.h;
                                float f45 = bcVar14.h - bcVar14.g;
                                float f46 = f();
                                bc bcVar15 = this.h;
                                if (f45 > f46 / bcVar15.e) {
                                    bcVar15.g = Math.max(0.0f, bcVar15.h - (f() / this.h.e));
                                    ac acVar23 = this.a;
                                    if (acVar23 != null) {
                                        acVar23.a1(this.h.g, false);
                                    }
                                }
                            } else if (i10 == 4) {
                                float min10 = f42 > 0.0f ? Math.min(1.0f - bcVar2.h, f42) : Math.max(-bcVar2.g, f42);
                                bc bcVar16 = this.h;
                                float f47 = bcVar16.g + min10;
                                bcVar16.g = f47;
                                bcVar16.h += min10;
                                ac acVar24 = this.a;
                                if (acVar24 != null) {
                                    acVar24.a1(f47, false);
                                    this.a.Z1(this.h.h);
                                }
                            }
                            float f48 = this.e;
                            bc bcVar17 = this.h;
                            float f49 = bcVar17.e;
                            float f50 = f48 / f49;
                            float f51 = bcVar17.g;
                            if (f50 < f51 || f50 > bcVar17.h) {
                                long j16 = (long) (f51 * f49);
                                this.e = j16;
                                ac acVar25 = this.a;
                                if (acVar25 != null) {
                                    acVar25.Q(j16, false);
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
                        AndroidUtilities.cancelRunOnUIThread(o0Var);
                    }
                    int i19 = this.d1;
                    if ((i19 == 1 || i19 == 5 || i19 == 8) && (velocityTracker6 = this.l1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    yl0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.b1 > ViewConfiguration.getTapTimeout() || this.i1) && this.f0) {
                            int i20 = this.d1;
                            int i21 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                            if (i20 == 16 && (velocityTracker5 = this.l1) != null) {
                                velocityTracker5.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity = (int) this.l1.getXVelocity();
                                this.m1 = true;
                                if (this.h != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                    long min11 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i22 = this.u1;
                                    float f52 = i22;
                                    float f53 = min11;
                                    float f54 = this.q1;
                                    int i23 = (int) (((this.f / f53) * f54) + f52);
                                    int b10 = (int) org.telegram.ui.Cells.j2.b(this.h.e - min11, f53, f54, f52);
                                    this.n1 = true;
                                    this.o1 = i23;
                                    this.S0.c(i23, 0, -xVelocity, 0, i22, b10, 0, 0);
                                    z10 = false;
                                }
                            } else if (i20 == 1 && (velocityTracker4 = this.l1) != null) {
                                velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity2 = (int) this.l1.getXVelocity();
                                this.m1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long min12 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i24 = this.u1;
                                    float f55 = i24;
                                    float f56 = min12;
                                    float f57 = this.q1;
                                    int i25 = (int) (((this.f / f56) * f57) + f55);
                                    int b11 = (int) org.telegram.ui.Cells.j2.b(this.h.e - min12, f56, f57, f55);
                                    this.n1 = true;
                                    this.o1 = i25;
                                    this.S0.c(i25, 0, -xVelocity2, 0, i24, b11, 0, 0);
                                    z10 = false;
                                }
                            } else if ((i20 == 5 || (i20 == 8 && !this.i1)) && this.L && (velocityTracker2 = this.l1) != null) {
                                if (this.h == null) {
                                    i21 = 1500;
                                }
                                velocityTracker2.computeCurrentVelocity(i21);
                                int xVelocity3 = (int) this.l1.getXVelocity();
                                this.m1 = false;
                                if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                                    float min13 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i26 = (int) (((this.M / min13) * this.q1) + this.u1 + this.t1);
                                    bc bcVar18 = this.h;
                                    if (bcVar18 != null) {
                                        float f58 = bcVar18.h;
                                        float f59 = bcVar18.e;
                                        j12 = this.N;
                                        j13 = (long) ((f58 * f59) - 0);
                                        f10 = bcVar18.g * f59;
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
                                        this.o1 = i26;
                                        float f62 = this.u1 + this.t1;
                                        float f63 = this.q1;
                                        this.S0.c(i26, 0, xVelocity3, 0, (int) (((j10 / min13) * f63) + f62), (int) org.telegram.ui.Cells.j2.b(j11, min13, f63, f62), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f10 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.n1 = z12;
                                    this.o1 = i26;
                                    float f622 = this.u1 + this.t1;
                                    float f632 = this.q1;
                                    this.S0.c(i26, 0, xVelocity3, 0, (int) (((j10 / min13) * f632) + f622), (int) org.telegram.ui.Cells.j2.b(j11, min13, f632, f622), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i20 == 9 || (i20 == 12 && !this.i1)) && this.C && (velocityTracker3 = this.l1) != null) {
                                if (this.h == null) {
                                    i21 = 1500;
                                }
                                velocityTracker3.computeCurrentVelocity(i21);
                                int xVelocity4 = (int) this.l1.getXVelocity();
                                this.m1 = false;
                                if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                                    float min14 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i27 = (int) (((this.E / min14) * this.q1) + this.u1 + this.t1);
                                    bc bcVar19 = this.h;
                                    if (bcVar19 != null) {
                                        float f64 = bcVar19.h;
                                        float f65 = bcVar19.e;
                                        j14 = (long) ((bcVar19.g * f65) - this.D);
                                        j15 = (long) ((f64 * f65) - 0);
                                    } else {
                                        j14 = -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.n1 = true;
                                    this.o1 = i27;
                                    float f66 = this.u1 + this.t1;
                                    float f67 = this.q1;
                                    this.S0.c(i27, 0, xVelocity4, 0, (int) (((j14 / min14) * f67) + f66), (int) org.telegram.ui.Cells.j2.b(j15, min14, f67, f66), 0, 0);
                                    z10 = false;
                                }
                            }
                            i2Var = this.Z0;
                            if (i2Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(i2Var);
                                this.Z0 = null;
                            }
                            if (this.i1 || !z10 || (acVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                acVar.H0(false);
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
                                int i28 = this.f1;
                                if (i28 == 3) {
                                    int i29 = (this.L || this.C) ? -1 : this.n;
                                    int i30 = this.g1;
                                    if (i29 != i30) {
                                        this.L = false;
                                        this.C = false;
                                        this.n = i30;
                                        if (this.a != null && i30 >= 0 && i30 < arrayList.size()) {
                                            this.a.k(((bc) arrayList.get(this.g1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i28 == 2 && !this.L) {
                                    this.L = true;
                                    this.C = false;
                                    ac acVar26 = this.a;
                                    if (acVar26 != null) {
                                        acVar26.j1(false);
                                    }
                                    invalidate();
                                } else if (i28 == 1 && !this.C) {
                                    this.L = false;
                                    this.C = true;
                                    ac acVar27 = this.a;
                                    if (acVar27 != null) {
                                        acVar27.j1(true);
                                    }
                                    invalidate();
                                } else if (i28 != 2 && this.L) {
                                    this.L = false;
                                    this.C = false;
                                    ac acVar28 = this.a;
                                    if (acVar28 != null) {
                                        acVar28.j1(false);
                                    }
                                    invalidate();
                                } else if (i28 == 1 || !this.C) {
                                    long j17 = this.e;
                                    if (m(motionEvent.getX(), false) && Math.abs(this.e - j17) > 400) {
                                        this.Y0 = j17;
                                        this.X0.d(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    this.L = false;
                                    this.C = false;
                                    ac acVar29 = this.a;
                                    if (acVar29 != null) {
                                        acVar29.j1(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.u1) - this.t1) / this.q1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                bc bcVar20 = this.h;
                                float f68 = bcVar20.h - bcVar20.g;
                                bcVar20.g = (1.0f - f68) * (clamp7 / getBaseDuration());
                                bc bcVar21 = this.h;
                                float f69 = bcVar21.g;
                                bcVar21.h = f68 + f69;
                                ac acVar30 = this.a;
                                if (acVar30 != null) {
                                    acVar30.a1(f69, true);
                                    this.a.Z1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.f1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    i2Var = this.Z0;
                    if (i2Var != null) {
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
                this.T = new zb(this, this.K, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.Q = false;
                this.c0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        j9.a aVar = new j9.a(2);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, aVar);
        bc bcVar = arrayList.isEmpty() ? null : (bc) arrayList.get(0);
        this.v = bcVar;
        if (bcVar != null) {
            long j10 = bcVar.f;
        }
    }

    public void setCollage(ArrayList<a8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ec ecVar;
        int i9 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i9 >= arrayList2.size()) {
                break;
            }
            bc bcVar = (bc) arrayList2.get(i9);
            if (bcVar != null && (ecVar = bcVar.c) != null) {
                ecVar.b();
            }
            i9++;
        }
        arrayList2.clear();
        int i10 = 0;
        while (true) {
            arrayList3 = this.r;
            if (i10 >= arrayList3.size()) {
                break;
            }
            zb zbVar = (zb) arrayList3.get(i10);
            if (zbVar != null) {
                zbVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.d0.d(1.0f, true);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                a8 a8Var = arrayList.get(i11);
                if (a8Var.K) {
                    bc bcVar2 = new bc(this);
                    bcVar2.a = i11;
                    bcVar2.b = false;
                    bcVar2.d = a8Var.L.getAbsolutePath();
                    bcVar2.e = a8Var.h0;
                    bcVar2.f = a8Var.X;
                    bcVar2.i = a8Var.P;
                    bcVar2.g = a8Var.V;
                    bcVar2.h = a8Var.W;
                    bc.a(bcVar2, false);
                    bc.b(bcVar2);
                    arrayList2.add(bcVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(ac acVar) {
        this.a = acVar;
    }

    public void setMaxCount(int i9) {
        this.U = i9;
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
        bc bcVar = this.h;
        if (bcVar != null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j11 = bcVar.e;
                if (f10 <= (j11 * bcVar.g) + 240.0f) {
                }
            }
        }
        if (this.J && !this.A && bcVar == null) {
            if (j10 < this.e) {
                float f11 = j10;
                long j12 = this.N;
                if (f11 <= (j12 * this.O) + 240.0f) {
                }
            }
        }
        if (this.A && bcVar == null) {
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
        bc bcVar = this.h;
        if (bcVar == null) {
            return;
        }
        bcVar.g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        bc bcVar = this.h;
        if (bcVar == null) {
            return;
        }
        bcVar.h = f10;
        invalidate();
    }
}
