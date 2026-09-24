package ci;

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
import org.telegram.messenger.ok;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.zm0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class wc extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public boolean E;
    public final TextPaint E0;
    public String F;
    public final RectF F0;
    public boolean G;
    public final Path G0;
    public long H;
    public final Paint H0;
    public long I;
    public final vc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public uc M;
    public StaticLayout M0;
    public boolean N;
    public float N0;
    public String O;
    public float O0;
    public boolean P;
    public final TextPaint P0;
    public long Q;
    public StaticLayout Q0;
    public long R;
    public float R0;
    public float S;
    public float S0;
    public float T;
    public final LinearGradient T0;
    public boolean U;
    public final Matrix U0;
    public float V;
    public final Paint V0;
    public boolean W;
    public final zm0 W0;
    public boolean X0;
    public final ai.m3 Y0;
    public long Z0;
    public pc a;
    public oc a0;
    public long a1;
    public Runnable b;
    public int b0;
    public final org.telegram.ui.Components.e6 b1;
    public int c;
    public final org.telegram.ui.Components.e6 c0;
    public long c1;
    public Runnable d;
    public final org.telegram.ui.Components.e6 d0;
    public ai.j d1;
    public long e;
    public final org.telegram.ui.Components.e6 e0;
    public long e1;
    public long f;
    public final org.telegram.ui.Components.e6 f0;
    public long f1;
    public final org.telegram.ui.Components.e6 g0;
    public float g1;
    public qc h;
    public final org.telegram.ui.Components.e6 h0;
    public int h1;
    public final org.telegram.ui.Components.e6 i0;
    public int i1;
    public boolean j0;
    public int j1;
    public final org.telegram.ui.Components.ja k0;
    public int k1;
    public final org.telegram.ui.Components.na l0;
    public boolean l1;
    public final org.telegram.ui.Components.na m0;
    public boolean m1;
    public int n;
    public final org.telegram.ui.Components.na n0;
    public float n1;
    public final RectF o0;
    public boolean o1;
    public final Path p0;
    public VelocityTracker p1;
    public final t01 q0;
    public boolean q1;
    public final ArrayList r;
    public final Drawable r0;
    public boolean r1;
    public final ArrayList s;
    public final vc s0;
    public int s1;
    public final RectF t0;
    public final float[] t1;
    public final Paint u0;
    public int u1;
    public qc v;
    public final Path v0;
    public int v1;
    public final Paint w;
    public final Path w0;
    public int w1;
    public final Path x;
    public final RectF x0;
    public int x1;
    public final Path y;
    public final Path y0;
    public int y1;
    public final Paint z0;
    public int z1;

    public wc(Context context, ViewGroup viewGroup, xb xbVar, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new Paint(3);
        this.x = new Path();
        this.y = new Path();
        this.b0 = 1;
        rr rrVar = rr.h;
        this.c0 = new org.telegram.ui.Components.e6(this, 0L, 360L, rrVar);
        this.d0 = new org.telegram.ui.Components.e6(this, 360L, rrVar);
        this.e0 = new org.telegram.ui.Components.e6(this, 0L, 360L, rrVar);
        this.f0 = new org.telegram.ui.Components.e6(this, 360L, rrVar);
        this.g0 = new org.telegram.ui.Components.e6(this, 0L, 360L, rrVar);
        this.h0 = new org.telegram.ui.Components.e6(this, 0L, 360L, rrVar);
        this.i0 = new org.telegram.ui.Components.e6(this, 0L, 320L, rrVar);
        this.j0 = true;
        this.o0 = new RectF();
        this.p0 = new Path();
        this.s0 = new vc();
        this.t0 = new RectF();
        this.u0 = new Paint(3);
        this.v0 = new Path();
        this.w0 = new Path();
        this.x0 = new RectF();
        this.y0 = new Path();
        Paint paint = new Paint(1);
        this.z0 = paint;
        Paint paint2 = new Paint(1);
        this.A0 = paint2;
        Paint paint3 = new Paint(1);
        this.B0 = paint3;
        Paint paint4 = new Paint(1);
        this.C0 = paint4;
        Paint paint5 = new Paint(1);
        this.D0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.E0 = textPaint;
        this.F0 = new RectF();
        this.G0 = new Path();
        Paint paint6 = new Paint(1);
        this.H0 = paint6;
        this.I0 = new vc();
        Paint paint7 = new Paint(1);
        this.J0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.L0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.P0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.T0 = linearGradient;
        this.U0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.V0 = paint8;
        this.W0 = new zm0(getContext(), null);
        this.Z0 = -1L;
        this.a1 = -1L;
        this.b1 = new org.telegram.ui.Components.e6(0.0f, this, 0L, 340L, rrVar);
        this.c1 = -1L;
        this.h1 = -1;
        this.i1 = -1;
        this.j1 = -1;
        this.k1 = -1;
        this.n1 = 1.0f;
        this.q1 = true;
        this.r1 = false;
        this.t1 = new float[8];
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
        this.q0 = new t01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.k0 = jaVar;
        this.l0 = new org.telegram.ui.Components.na(jaVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.na(jaVar, this, 3, false);
        this.n0 = new org.telegram.ui.Components.na(jaVar, this, 4, false);
        this.Y0 = new ai.m3(this, viewGroup, d6Var, jaVar, xbVar, 5);
    }

    public static void a(final wc wcVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar, View view) {
        int i10;
        ArrayList arrayList = wcVar.s;
        int i11 = wcVar.j1;
        try {
            if (i11 == 2 && wcVar.N) {
                f8 f8Var = new f8(wcVar.getContext(), 0);
                f8Var.b = 0.0f;
                f8Var.c = 1.5f;
                f8Var.d(wcVar.V);
                final int i12 = 0;
                f8Var.h = new Utilities.Callback(wcVar) { // from class: ci.nc
                    public final /* synthetic */ wc b;

                    {
                        this.b = wcVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f7.floatValue();
                                wc wcVar2 = this.b;
                                wcVar2.V = floatValue;
                                pc pcVar = wcVar2.a;
                                if (pcVar != null) {
                                    pcVar.l(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                wc wcVar3 = this.b;
                                wcVar3.L = floatValue2;
                                pc pcVar2 = wcVar3.a;
                                if (pcVar2 != null) {
                                    pcVar2.i(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                wc wcVar4 = this.b;
                                wcVar4.h.i = f7.floatValue();
                                pc pcVar3 = wcVar4.a;
                                if (pcVar3 != null) {
                                    pcVar3.D(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(wcVar.getBaseDuration(), wcVar.getMaxScrollDuration());
                int i13 = wcVar.v1;
                int i14 = wcVar.y1;
                int i15 = wcVar.x1;
                float min2 = Math.min((i13 - i14) - i15, ((((AndroidUtilities.lerp(wcVar.T, 1.0f, wcVar.f0.c) * wcVar.R) + (wcVar.Q - wcVar.f)) / min) * wcVar.u1) + i14 + i15);
                y70 F = y70.F(viewGroup, d6Var, wcVar);
                F.q(f8Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new mc(wcVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(wcVar.v1 - min2)) + AndroidUtilities.dp(18.0f), wcVar.F0.top);
                F.Z();
                F.R(jaVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && wcVar.E) {
                f8 f8Var2 = new f8(wcVar.getContext(), 0);
                f8Var2.b = 0.0f;
                f8Var2.c = 1.5f;
                f8Var2.d(wcVar.L);
                final int i16 = 1;
                f8Var2.h = new Utilities.Callback(wcVar) { // from class: ci.nc
                    public final /* synthetic */ wc b;

                    {
                        this.b = wcVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i16) {
                            case 0:
                                float floatValue = f7.floatValue();
                                wc wcVar2 = this.b;
                                wcVar2.V = floatValue;
                                pc pcVar = wcVar2.a;
                                if (pcVar != null) {
                                    pcVar.l(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                wc wcVar3 = this.b;
                                wcVar3.L = floatValue2;
                                pc pcVar2 = wcVar3.a;
                                if (pcVar2 != null) {
                                    pcVar2.i(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                wc wcVar4 = this.b;
                                wcVar4.h.i = f7.floatValue();
                                pc pcVar3 = wcVar4.a;
                                if (pcVar3 != null) {
                                    pcVar3.D(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(wcVar.getBaseDuration(), wcVar.getMaxScrollDuration());
                int i17 = wcVar.v1;
                int i18 = wcVar.y1;
                int i19 = wcVar.x1;
                float min4 = Math.min((i17 - i18) - i19, ((((AndroidUtilities.lerp(wcVar.K, 1.0f, wcVar.d0.c) * wcVar.H) + (wcVar.I - wcVar.f)) / min3) * wcVar.u1) + i18 + i19);
                y70 F2 = y70.F(viewGroup, d6Var, wcVar);
                F2.q(f8Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new mc(wcVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(wcVar.v1 - min4)) + AndroidUtilities.dp(18.0f), wcVar.x0.top);
                F2.Z();
                F2.R(jaVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && wcVar.h != null) {
                f8 f8Var3 = new f8(wcVar.getContext(), 0);
                f8Var3.b = 0.0f;
                f8Var3.c = 1.5f;
                f8Var3.d(wcVar.h.i);
                final int i20 = 2;
                f8Var3.h = new Utilities.Callback(wcVar) { // from class: ci.nc
                    public final /* synthetic */ wc b;

                    {
                        this.b = wcVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i20) {
                            case 0:
                                float floatValue = f7.floatValue();
                                wc wcVar2 = this.b;
                                wcVar2.V = floatValue;
                                pc pcVar = wcVar2.a;
                                if (pcVar != null) {
                                    pcVar.l(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                wc wcVar3 = this.b;
                                wcVar3.L = floatValue2;
                                pc pcVar2 = wcVar3.a;
                                if (pcVar2 != null) {
                                    pcVar2.i(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                wc wcVar4 = this.b;
                                wcVar4.h.i = f7.floatValue();
                                pc pcVar3 = wcVar4.a;
                                if (pcVar3 != null) {
                                    pcVar3.D(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                y70 F3 = y70.F(viewGroup, d6Var, wcVar);
                F3.q(f8Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), wcVar.t0.top);
                F3.Z();
                F3.R(jaVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            } else {
                if (i11 != 3 || (i10 = wcVar.k1) < 0 || i10 >= arrayList.size()) {
                    return;
                }
                qc qcVar = (qc) arrayList.get(wcVar.k1);
                f8 f8Var4 = new f8(wcVar.getContext(), 0);
                f8Var4.b = 0.0f;
                f8Var4.c = 1.5f;
                f8Var4.d(qcVar.i);
                f8Var4.h = new ai.g3(8, wcVar, qcVar);
                y70 F4 = y70.F(viewGroup, d6Var, wcVar);
                F4.q(f8Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), qcVar.j.top);
                F4.Z();
                F4.R(jaVar, -view.getX(), -view.getY());
                wcVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f0.e(this.P));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        qc qcVar = this.h;
        if (qcVar != null) {
            return Math.max(1L, qcVar.e);
        }
        qc qcVar2 = this.v;
        return qcVar2 != null ? Math.max(1L, qcVar2.e) : this.E ? Math.max(1L, this.H) : Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += AndroidUtilities.dp(4.0f);
            }
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((qc) arrayList.get(i10)).k.c);
        }
        return f7;
    }

    private float getRoundHeight() {
        if (!this.E) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.d0.e(this.G));
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
        qc qcVar;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.e, getBaseDuration(), 0L);
        qc qcVar2 = this.v;
        float f7 = min;
        float f10 = (this.u1 * (((clamp + (qcVar2 != null ? (qcVar2.g * qcVar2.e) + qcVar2.f : this.h == null ? this.Q : 0L)) - this.f) / f7)) + this.y1 + this.x1;
        if (!this.X0 && x10 >= f10 - AndroidUtilities.dp(12.0f) && x10 <= f10 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z11 = this.h != null && y3 > (((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        ArrayList arrayList = this.s;
        boolean z12 = !arrayList.isEmpty() && y3 > ((((((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y3 < (((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (this.E) {
            if (y3 > (((((((this.w1 - this.z1) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
                if (y3 < ((((this.w1 - this.z1) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z10 = true;
                    if (z12) {
                        i10 = 1;
                        if (z11) {
                            float f11 = this.y1 + this.x1;
                            qc qcVar3 = this.h;
                            float f12 = qcVar3.g;
                            float f13 = qcVar3.e;
                            float f14 = this.f;
                            float f15 = this.u1;
                            float f16 = ((((f12 * f13) - f14) / f7) * f15) + f11;
                            float f17 = ((((qcVar3.h * f13) - f14) / f7) * f15) + f11;
                            if (this.X0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x10 < f16 - AndroidUtilities.dp(15.0f) || x10 > f17 + AndroidUtilities.dp(15.0f)) {
                                    return i10;
                                }
                                return 4;
                            }
                            if (x10 >= f16 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f16) {
                                return 2;
                            }
                            if (x10 >= f17 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f17) {
                                return 3;
                            }
                            if (x10 >= f16 && x10 <= f17) {
                                qc qcVar4 = this.h;
                                if (qcVar4.g > 0.01f || qcVar4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z10) {
                            float f18 = this.y1 + this.x1;
                            float f19 = this.I;
                            float f20 = this.J;
                            float f21 = this.H;
                            float f22 = this.f;
                            float f23 = this.u1;
                            float f24 = (((((f20 * f21) + f19) - f22) / f7) * f23) + f18;
                            float f25 = (((((this.K * f21) + f19) - f22) / f7) * f23) + f18;
                            if (this.G || this.h == null) {
                                if (x10 >= f24 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f24) {
                                    return 10;
                                }
                                if (x10 >= f25 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f25) {
                                    return 11;
                                }
                                if (x10 >= f24 && x10 <= f25) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f26 = this.y1 + this.x1;
                                long j3 = this.I;
                                long j10 = this.f;
                                float f27 = this.u1;
                                float f28 = (((j3 - j10) / f7) * f27) + f26;
                                f25 = a4.a.e((j3 + this.H) - j10, f7, f27, f26);
                                f24 = f28;
                            }
                            if (x10 >= f24 && x10 <= f25) {
                                return 9;
                            }
                        } else if (this.N) {
                            float f29 = this.y1 + this.x1;
                            float f30 = this.Q;
                            float f31 = this.S;
                            float f32 = this.R;
                            float f33 = this.f;
                            float f34 = this.u1;
                            float f35 = (((((f31 * f32) + f30) - f33) / f7) * f34) + f29;
                            float f36 = (((((this.T * f32) + f30) - f33) / f7) * f34) + f29;
                            if (this.P || (this.h == null && !this.E)) {
                                if (x10 >= f35 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f35) {
                                    return 6;
                                }
                                if (x10 >= f36 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f36) {
                                    return 7;
                                }
                                if (x10 >= f35 && x10 <= f36) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f37 = this.y1 + this.x1;
                                long j11 = this.Q;
                                long j12 = this.f;
                                float f38 = this.u1;
                                float f39 = (((j11 - j12) / f7) * f38) + f37;
                                f36 = a4.a.e((j11 + this.R) - j12, f7, f38, f37);
                                f35 = f39;
                            }
                            if (x10 >= f35 && x10 <= f36) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            qc qcVar5 = (qc) arrayList.get(i11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(qcVar5.j);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x10, y3)) {
                                float f40 = this.y1 + this.x1;
                                float f41 = qcVar5.f;
                                float f42 = this.u1;
                                float f43 = ((f41 / f7) * f42) + f40;
                                float f44 = qcVar5.g;
                                float f45 = qcVar5.e;
                                float f46 = ((((f44 * f45) + f41) / f7) * f42) + f40;
                                float f47 = ((((qcVar5.h * f45) + f41) / f7) * f42) + f40;
                                float e = a4.a.e(r6 + r11, f7, f42, f40);
                                this.i1 = i11;
                                if (x10 >= f46 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f46) {
                                    return 13;
                                }
                                if (x10 >= f47 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f47) {
                                    return 14;
                                }
                                if (x10 < f46 || x10 > f47 || (qcVar5.g <= 0.01f && qcVar5.h >= 0.99f)) {
                                    return (x10 < f43 || x10 > e) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i10 = 1;
                    }
                    qcVar = this.h;
                    if (qcVar != null || qcVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        qcVar = this.h;
        return qcVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        zm0 zm0Var = this.W0;
        if (!zm0Var.b()) {
            if (this.r1) {
                this.r1 = false;
                pc pcVar = this.a;
                if (pcVar != null) {
                    pcVar.w(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = zm0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.q1) {
            this.f = (long) Math.max(0.0f, (((i10 - this.y1) - this.x1) / this.u1) * min);
        } else {
            if (!this.P) {
                zm0Var.a();
                return;
            }
            int i11 = this.y1;
            int i12 = this.x1;
            float f7 = this.u1;
            float f10 = min;
            h(((((i10 - i11) - i12) / f7) * f10) - ((((this.s1 - i11) - i12) / f7) * f10));
        }
        invalidate();
        this.s1 = i10;
    }

    public final void d(Canvas canvas, float f7, float f10, long j3, float f11) {
        float f12;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(j3, getBaseDuration(), 0L);
        qc qcVar = this.v;
        if (qcVar != null) {
            f12 = (qcVar.g * qcVar.e) + qcVar.f;
        } else {
            f12 = this.h == null ? this.Q : 0L;
        }
        float f13 = (this.u1 * (((clamp + f12) - this.f) / min)) + this.y1 + this.x1;
        float f14 = (1.0f - f11) * (((f10 - f7) / 2.0f) / 2.0f);
        float f15 = f7 + f14;
        float f16 = f10 - f14;
        Paint paint = this.C0;
        paint.setAlpha((int) (38.0f * f11));
        int i10 = (int) (f11 * 255.0f);
        Paint paint2 = this.D0;
        paint2.setAlpha(i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f13 - AndroidUtilities.dpf2(1.5f), f15, AndroidUtilities.dpf2(1.5f) + f13, f16);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f13 - AndroidUtilities.dpf2(1.5f), f15, AndroidUtilities.dpf2(1.5f) + f13, f16);
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
        long j3;
        Paint paint;
        ArrayList arrayList;
        float f7;
        org.telegram.ui.Components.na naVar;
        RectF rectF2;
        long j10;
        int i10;
        qc qcVar;
        qc qcVar2;
        int i11;
        float f10;
        float max;
        Canvas canvas2;
        long j11;
        float f11;
        boolean z10;
        float f12;
        float f13;
        RectF rectF3;
        ArrayList arrayList2;
        long j12;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        ArrayList arrayList3;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        Paint paint2;
        float f26;
        float f27;
        double d;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        Canvas canvas3;
        float d10;
        float f33;
        float f34;
        qc qcVar3;
        float f35;
        float f36;
        float lerp;
        float y3;
        float f37;
        RectF rectF4;
        float f38;
        float f39;
        float f40;
        float dpf2;
        float f41;
        float f42;
        float e;
        float f43;
        float f44;
        long j13;
        float f45;
        float f46;
        float f47;
        ArrayList arrayList4;
        int i12;
        boolean z11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i13;
        int i14;
        float f48;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i15;
        RectF rectF5;
        ArrayList arrayList9;
        float f49;
        float f50;
        Path path;
        float e7;
        float f51;
        float f52;
        float f53;
        int i16;
        long j14;
        float f54;
        float f55;
        float f56;
        ArrayList arrayList10;
        boolean z12;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z13;
        int i17;
        float f57;
        ArrayList arrayList13;
        ArrayList arrayList14;
        float f58;
        float f59;
        float f60;
        float f61;
        float f62;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        int i18;
        boolean z14;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        org.telegram.ui.Components.na naVar2;
        wc wcVar = this;
        RectF rectF6 = wcVar.t0;
        RectF rectF7 = wcVar.x0;
        Path path2 = wcVar.w0;
        ArrayList arrayList20 = wcVar.r;
        Drawable drawable = wcVar.r0;
        org.telegram.ui.Components.ja jaVar = wcVar.k0;
        RectF rectF8 = wcVar.F0;
        ArrayList arrayList21 = wcVar.s;
        RectF rectF9 = wcVar.o0;
        org.telegram.ui.Components.na naVar3 = wcVar.l0;
        Paint c10 = naVar3.c(1.0f);
        float e10 = wcVar.i0.e(wcVar.j0);
        long min = Math.min(wcVar.getBaseDuration(), wcVar.getMaxScrollDuration());
        if (e10 < 1.0f) {
            rectF9.set(wcVar.y1, (wcVar.w1 - wcVar.z1) - AndroidUtilities.dp(28.0f), wcVar.v1 - wcVar.y1, wcVar.w1 - wcVar.z1);
            wcVar.p0.rewind();
            wcVar.p0.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - e10) * 255.0f), 31);
            canvas.clipPath(wcVar.p0);
            if (jaVar.c()) {
                naVar3.a(canvas);
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
            if (arrayList20.isEmpty() || !jaVar.c()) {
                paint4 = paint3;
                rectF = rectF6;
                naVar2 = naVar3;
                j3 = min;
                if (!arrayList20.isEmpty()) {
                    Paint c11 = wcVar.n0.c(0.4f);
                    if (c11 == null) {
                        c11 = wcVar.H0;
                        c11.setAlpha(64);
                    }
                    wcVar.s0.a((((wcVar.Q - wcVar.f) / j3) * wcVar.u1) + wcVar.y1 + wcVar.x1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), wcVar.h0.d(vc.c(arrayList20), false), rectF9.bottom, arrayList20);
                    canvas.drawPath(wcVar.s0, c11);
                    float h = ((wcVar.q0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - h);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, ok.d(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.c1.d(2, centerY, drawable));
                    drawable.setAlpha(191);
                    drawable.draw(canvas);
                    t01 t01Var = wcVar.q0;
                    float centerX2 = (rectF9.centerX() - h) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
                    float f63 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    naVar = naVar2;
                    f7 = 0.4f;
                    t01Var.c(centerX2, f63, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float d11 = wcVar.h0.d(vc.c(arrayList20), false);
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j3 = min;
                naVar2 = naVar3;
                wcVar.s0.a((((wcVar.Q - wcVar.f) / min) * wcVar.u1) + wcVar.y1 + wcVar.x1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), d11, rectF9.bottom, arrayList20);
                canvas.saveLayerAlpha(rectF9, 102, 31);
                canvas.clipPath(wcVar.s0);
                wcVar.n0.a(canvas);
                canvas.restore();
            }
            float h10 = ((wcVar.q0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - h10);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, ok.d(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.c1.d(2, centerY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            t01 t01Var2 = wcVar.q0;
            float centerX22 = (rectF9.centerX() - h10) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
            float f632 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            naVar = naVar2;
            f7 = 0.4f;
            t01Var2.c(centerX22, f632, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j3 = min;
            paint = c10;
            arrayList = arrayList21;
            f7 = 0.4f;
            naVar = naVar3;
            rectF2 = rectF8;
        }
        if (e10 > 0.0f) {
            if (e10 < 1.0f) {
                canvas2 = canvas;
                j11 = j3;
                f11 = 0.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, wcVar.getWidth(), wcVar.getHeight(), (int) (e10 * 255.0f), 31);
                z10 = true;
            } else {
                canvas2 = canvas;
                j11 = j3;
                f11 = 0.0f;
                z10 = false;
            }
            qc qcVar4 = wcVar.h;
            float f64 = qcVar4 != null ? 1.0f : 0.0f;
            float e11 = qcVar4 != null ? qcVar4.k.e((wcVar.P || wcVar.G) ? false : true) : 0.0f;
            float f65 = wcVar.w1 - wcVar.z1;
            float dp = AndroidUtilities.dp(4.0f);
            if (wcVar.h != null) {
                canvas2.save();
                float videoHeight = wcVar.getVideoHeight();
                qc qcVar5 = wcVar.h;
                float f66 = qcVar5.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j15 = qcVar5.e;
                float f67 = j15;
                float x10 = com.google.android.gms.internal.vision.e2.x(f66, f67, e11, f11);
                float x11 = com.google.android.gms.internal.vision.e2.x(qcVar5.h, f67, e11, f11);
                if (j15 <= 0) {
                    f12 = e11;
                    f59 = f64;
                    j12 = j11;
                    f60 = 0.0f;
                    f58 = 0.0f;
                    f14 = dp;
                } else {
                    f58 = 0.0f;
                    f12 = e11;
                    f59 = f64;
                    j12 = j11;
                    f14 = dp;
                    f60 = (wcVar.y1 + wcVar.x1) - (wcVar.u1 * (wcVar.f / j12));
                }
                f18 = x10;
                float f68 = wcVar.x1;
                float f69 = f60 - f68;
                if (j15 <= 0) {
                    f61 = f68;
                    f17 = x11;
                    f62 = 0.0f;
                } else {
                    f61 = f68;
                    f17 = x11;
                    f62 = (((j15 - wcVar.f) / j12) * wcVar.u1) + wcVar.y1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f69, f65 - videoHeight, f62 + f61, f65);
                float f70 = f65 - ((f14 * f59) + videoHeight);
                float f71 = (rectF10.top * f12) + f58;
                f16 = (rectF10.bottom * f12) + f58;
                wcVar.v0.rewind();
                wcVar.v0.addRoundRect(rectF10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(wcVar.v0);
                uc ucVar = wcVar.h.c;
                if (ucVar != null) {
                    int i19 = ucVar.f;
                    float f72 = i19;
                    f19 = f71;
                    int max2 = (int) Math.max(0.0d, Math.floor((f69 - wcVar.y1) / f72));
                    f13 = f59;
                    int min2 = (int) Math.min(wcVar.h.c.c, Math.ceil(((r6 - f69) - wcVar.y1) / f72) + 1.0d);
                    int i20 = (int) rectF10.top;
                    arrayList15 = wcVar.h.c.d;
                    boolean z15 = arrayList15.size() >= min2;
                    boolean z16 = (i19 == 0 || !z15 || wcVar.h.b) ? false : true;
                    if (z16) {
                        int i21 = max2;
                        while (true) {
                            arrayList18 = wcVar.h.c.d;
                            if (i21 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = wcVar.h.c.d;
                            if (((tc) arrayList19.get(i21)).a == null) {
                                z16 = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (!z16) {
                        if (jaVar.c()) {
                            naVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF10, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i19 != 0) {
                        float f73 = f69;
                        int i22 = max2;
                        while (i22 < Math.min(arrayList16.size(), min2)) {
                            arrayList17 = wcVar.h.c.d;
                            tc tcVar = (tc) arrayList17.get(i22);
                            if (tcVar.a != null) {
                                i18 = min2;
                                z14 = z15;
                                wcVar.u0.setAlpha((int) (tcVar.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(tcVar.a, f73, i20 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), wcVar.u0);
                            } else {
                                i18 = min2;
                                z14 = z15;
                            }
                            f73 += f72;
                            i22++;
                            z15 = z14;
                            min2 = i18;
                        }
                    }
                    if (!z15) {
                        wcVar.h.c.c();
                    }
                } else {
                    f19 = f71;
                    f13 = f59;
                }
                path2.rewind();
                if (!wcVar.X0) {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    int i23 = wcVar.y1;
                    int i24 = wcVar.x1;
                    float f74 = i23 + i24;
                    qc qcVar6 = wcVar.h;
                    float f75 = qcVar6.g;
                    int i25 = i24;
                    float f76 = qcVar6.e;
                    float f77 = wcVar.f;
                    float f78 = (f75 * f76) - f77;
                    float f79 = j12;
                    float f80 = wcVar.u1;
                    float f81 = (((f78 / f79) * f80) + f74) - (f75 <= f58 ? i25 : 0);
                    float f82 = wcVar.w1 - wcVar.z1;
                    float f83 = f82 - videoHeight;
                    float f84 = qcVar6.h;
                    float f85 = ((((f76 * f84) - f77) / f79) * f80) + f74;
                    if (f84 < 1.0f) {
                        i25 = 0;
                    }
                    rectF11.set(f81, f83, f85 + i25, f82);
                    path2.addRoundRect(rectF11, wcVar.t1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f65 = f70;
                f15 = videoHeight;
            } else {
                f12 = e11;
                f13 = f64;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j12 = j11;
                f14 = dp;
                f15 = 0.0f;
                f16 = 0.0f;
                f17 = 0.0f;
                f18 = 0.0f;
                f19 = 0.0f;
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                f20 = f15;
                f21 = 0.0f;
            } else {
                wcVar.getCollageHeight();
                float f86 = f65;
                int i26 = 0;
                while (i26 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    qc qcVar7 = (qc) arrayList22.get(i26);
                    org.telegram.ui.Components.e6 e6Var = qcVar7.k;
                    RectF rectF12 = qcVar7.j;
                    float f87 = f15;
                    float e12 = e6Var.e((wcVar.P || wcVar.G || wcVar.n != i26) ? false : true);
                    if (qcVar7 != wcVar.v) {
                        i15 = i26;
                        arrayList9 = arrayList22;
                        float f88 = j12;
                        f49 = f16;
                        f50 = ((((AndroidUtilities.lerp(qcVar7.g, 0.0f, e12) * qcVar7.e) + (qcVar7.f - wcVar.f)) / f88) * wcVar.u1) + wcVar.y1 + wcVar.x1;
                        rectF5 = rectF7;
                        e7 = (com.google.android.gms.internal.vision.e2.y(AndroidUtilities.lerp(qcVar7.h, 1.0f, e12), qcVar7.e, qcVar7.f - wcVar.f, f88) * wcVar.u1) + wcVar.y1 + wcVar.x1;
                        path = path2;
                    } else {
                        i15 = i26;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f49 = f16;
                        float f89 = wcVar.y1 + wcVar.x1;
                        float f90 = j12;
                        float f91 = (qcVar7.f - wcVar.f) / f90;
                        float f92 = wcVar.u1;
                        f50 = (f91 * f92) + f89;
                        path = path2;
                        e7 = a4.a.e(r8 + qcVar7.e, f90, f92, f89);
                    }
                    float f93 = f50;
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), e12);
                    float f94 = wcVar.x1;
                    rectF12.set(f93 - f94, f86 - lerp2, e7 + f94, f86);
                    f19 = (rectF12.top * e12) + f19;
                    f16 = (rectF12.bottom * e12) + f49;
                    float f95 = qcVar7.f;
                    float f96 = qcVar7.g;
                    float f97 = f86;
                    float f98 = qcVar7.e;
                    f18 = (((f96 * f98) + f95) * e12) + f18;
                    f17 = (((qcVar7.h * f98) + f95) * e12) + f17;
                    wcVar.x.rewind();
                    wcVar.x.addRoundRect(rectF12, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(wcVar.x);
                    uc ucVar2 = qcVar7.c;
                    if (ucVar2 != null) {
                        long j16 = qcVar7.e;
                        f51 = lerp2;
                        if (j16 <= 0) {
                            j14 = j16;
                            f54 = 0.0f;
                        } else {
                            j14 = j16;
                            f54 = wcVar.y1 + wcVar.x1 + (((qcVar7.f - wcVar.f) / j12) * wcVar.u1);
                        }
                        float f99 = wcVar.x1;
                        float f100 = f54 - f99;
                        if (j16 <= 0) {
                            f55 = f99;
                            f56 = 0.0f;
                        } else {
                            f55 = f99;
                            f56 = ((((qcVar7.f + j14) - wcVar.f) / j12) * wcVar.u1) + wcVar.y1 + r7;
                        }
                        float f101 = f56 + f55;
                        int i27 = ucVar2.f;
                        float f102 = i27;
                        int max3 = (int) Math.max(0.0d, Math.floor((f100 - ((((qcVar7.f - wcVar.f) / j12) * wcVar.u1) + (wcVar.y1 + wcVar.x1))) / f102));
                        int min3 = (int) Math.min(qcVar7.c.c, Math.ceil((f101 - f100) / f102) + 1.0d);
                        int i28 = (int) rectF12.top;
                        arrayList10 = qcVar7.c.d;
                        boolean z17 = arrayList10.size() >= min3;
                        if (z17) {
                            for (int i29 = max3; i29 < Math.min(arrayList13.size(), min3); i29++) {
                                arrayList14 = qcVar7.c.d;
                                if (((tc) arrayList14.get(i29)).a == null) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = z17;
                        if (!z12) {
                            if (jaVar.c()) {
                                naVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i27 != 0) {
                            float f103 = f100;
                            while (max3 < Math.min(arrayList11.size(), min3)) {
                                arrayList12 = qcVar7.c.d;
                                tc tcVar2 = (tc) arrayList12.get(max3);
                                int i30 = min3;
                                if (tcVar2.a != null) {
                                    z13 = z17;
                                    i17 = max3;
                                    f57 = f97;
                                    wcVar.w.setAlpha((int) (tcVar2.b.d(1.0f, false) * 255.0f));
                                    canvas2.drawBitmap(tcVar2.a, f103, i28 - ((int) ((r4.getHeight() - f51) / 2.0f)), wcVar.w);
                                } else {
                                    z13 = z17;
                                    i17 = max3;
                                    f57 = f97;
                                }
                                f103 += f102;
                                max3 = i17 + 1;
                                min3 = i30;
                                z17 = z13;
                                f97 = f57;
                            }
                        }
                        f52 = f97;
                        if (!z17) {
                            qcVar7.c.c();
                        }
                    } else {
                        f51 = lerp2;
                        f52 = f97;
                    }
                    wcVar.y.rewind();
                    if (!wcVar.X0) {
                        RectF rectF13 = AndroidUtilities.rectTmp;
                        int i31 = wcVar.y1;
                        int i32 = wcVar.x1;
                        float f104 = i31 + i32;
                        float f105 = qcVar7.g;
                        float f106 = qcVar7.e;
                        float f107 = wcVar.f;
                        float f108 = (f105 * f106) - f107;
                        float f109 = qcVar7.f;
                        float f110 = j12;
                        float f111 = wcVar.u1;
                        float f112 = (((f108 + f109) / f110) * f111) + f104;
                        if (f105 <= 0.0f) {
                            f53 = f111;
                            i16 = i32;
                        } else {
                            f53 = f111;
                            i16 = 0;
                        }
                        float f113 = f112 - i16;
                        float f114 = rectF12.top;
                        float f115 = qcVar7.h;
                        rectF13.set(f113, f114, (((((f106 * f115) - f107) + f109) / f110) * f53) + f104 + (f115 >= 1.0f ? i32 : 0), rectF12.bottom);
                        wcVar.y.addRoundRect(rectF13, wcVar.t1, Path.Direction.CW);
                        canvas2.clipPath(wcVar.y, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f86 = f52 - ((f14 * 1.0f) + f51);
                    i26 = i15 + 1;
                    path2 = path;
                    f15 = f87;
                    arrayList2 = arrayList9;
                    rectF7 = rectF5;
                }
                arrayList3 = arrayList2;
                f20 = f15;
                f65 = f86;
                f21 = 1.0f;
            }
            RectF rectF14 = rectF7;
            Path path3 = path2;
            float e13 = wcVar.c0.e(wcVar.E);
            float e14 = wcVar.d0.e(wcVar.E && wcVar.G);
            float roundHeight = wcVar.getRoundHeight() * e13;
            float f116 = ((wcVar.h == null && !wcVar.N && arrayList3.isEmpty()) ? 1.0f : e14) * e13;
            if (e13 > 0.0f) {
                long j17 = wcVar.I;
                float f117 = j17;
                float f118 = wcVar.J;
                float f119 = wcVar.H;
                f18 = (((f118 * f119) + f117) * f116) + f18;
                f17 = (((wcVar.K * f119) + f117) * f116) + f17;
                if (wcVar.h != null) {
                    float f120 = j12;
                    float lerp3 = ((((wcVar.H * AndroidUtilities.lerp(f118, 0.0f, e14)) + (j17 - wcVar.f)) / f120) * wcVar.u1) + wcVar.y1 + wcVar.x1;
                    f42 = f16;
                    f22 = f21;
                    e = (com.google.android.gms.internal.vision.e2.y(AndroidUtilities.lerp(wcVar.K, 1.0f, e14), wcVar.H, wcVar.I - wcVar.f, f120) * wcVar.u1) + wcVar.y1 + wcVar.x1;
                    f43 = lerp3;
                } else {
                    f22 = f21;
                    f42 = f16;
                    float f121 = wcVar.y1 + wcVar.x1;
                    long j18 = j17 - wcVar.f;
                    float f122 = j12;
                    float f123 = wcVar.u1;
                    float f124 = ((j18 / f122) * f123) + f121;
                    e = a4.a.e(j18 + r6, f122, f123, f121);
                    f43 = f124;
                }
                float f125 = wcVar.x1;
                rectF14.set(f43 - f125, f65 - roundHeight, e + f125, f65);
                float f126 = f65 - ((f14 * e13) + roundHeight);
                f19 = (rectF14.top * f116) + f19;
                f16 = (rectF14.bottom * f116) + f42;
                wcVar.y0.rewind();
                wcVar.y0.addRoundRect(rectF14, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(wcVar.y0);
                uc ucVar3 = wcVar.M;
                if (ucVar3 != null) {
                    float f127 = e14;
                    long j19 = wcVar.H;
                    if (j19 <= 0) {
                        f44 = f126;
                        j13 = j19;
                        f45 = 0.0f;
                    } else {
                        f44 = f126;
                        j13 = j19;
                        f45 = wcVar.y1 + wcVar.x1 + (((wcVar.I - wcVar.f) / j12) * wcVar.u1);
                    }
                    float f128 = wcVar.x1;
                    float f129 = f45 - f128;
                    if (j19 <= 0) {
                        f46 = f128;
                        f47 = 0.0f;
                    } else {
                        f46 = f128;
                        f47 = wcVar.y1 + r10 + ((((wcVar.I + j13) - wcVar.f) / j12) * wcVar.u1);
                    }
                    float f130 = f47 + f46;
                    int i33 = ucVar3.f;
                    float f131 = i33;
                    float f132 = f129;
                    int max4 = (int) Math.max(0.0d, Math.floor((f129 - (wcVar.h != null ? (((wcVar.I - wcVar.f) / j12) * wcVar.u1) + (wcVar.y1 + wcVar.x1) : wcVar.y1)) / f131));
                    int min4 = (int) Math.min(wcVar.M.c, Math.ceil((f130 - f132) / f131) + 1.0d);
                    int i34 = (int) rectF14.top;
                    arrayList4 = wcVar.M.d;
                    boolean z18 = arrayList4.size() >= min4;
                    if (z18) {
                        int i35 = max4;
                        i12 = i35;
                        while (i35 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = wcVar.M.d;
                            if (((tc) arrayList8.get(i35)).a == null) {
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
                        if (jaVar.c()) {
                            naVar.a(canvas2);
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
                            arrayList6 = wcVar.M.d;
                            tc tcVar3 = (tc) arrayList6.get(i36);
                            int i37 = i36;
                            if (tcVar3.a != null) {
                                i13 = min4;
                                i14 = i34;
                                f48 = f127;
                                wcVar.u0.setAlpha((int) (tcVar3.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(tcVar3.a, f132, i14 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), wcVar.u0);
                            } else {
                                i13 = min4;
                                i14 = i34;
                                f48 = f127;
                            }
                            f132 += f131;
                            i36 = i37 + 1;
                            min4 = i13;
                            i34 = i14;
                            f127 = f48;
                        }
                    }
                    f23 = f127;
                    if (!z18) {
                        wcVar.M.c();
                    }
                } else {
                    f44 = f126;
                    f23 = e14;
                }
                path3.rewind();
                RectF rectF15 = AndroidUtilities.rectTmp;
                int i38 = wcVar.y1;
                int i39 = wcVar.x1;
                float f133 = i38 + i39;
                float f134 = wcVar.J;
                float f135 = wcVar.H;
                float f136 = f134 * f135;
                float f137 = wcVar.f;
                float f138 = f136 - f137;
                float f139 = wcVar.I;
                float f140 = j12;
                float f141 = (f138 + f139) / f140;
                float f142 = wcVar.u1;
                float f143 = (1.0f - f23) * i39;
                float f144 = (((f141 * f142) + f133) - (f134 <= 0.0f ? i39 : 0)) - f143;
                float f145 = rectF14.top;
                float f146 = wcVar.K;
                float f147 = (((((f135 * f146) - f137) + f139) / f140) * f142) + f133;
                if (f146 < 1.0f) {
                    i39 = 0;
                }
                rectF15.set(f144, f145, f147 + i39 + f143, rectF14.bottom);
                path3.addRoundRect(rectF15, wcVar.t1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f65 = f44;
            } else {
                f22 = f21;
                f23 = e14;
            }
            float e15 = wcVar.e0.e(wcVar.N);
            float e16 = wcVar.f0.e(wcVar.N && wcVar.P);
            float audioHeight = wcVar.getAudioHeight() * e15;
            float f148 = ((wcVar.h == null && !wcVar.E && arrayList3.isEmpty()) ? 1.0f : e16) * e15;
            if (e15 > 0.0f) {
                float f149 = wcVar.Q;
                float f150 = wcVar.S;
                float f151 = wcVar.R;
                f18 = (((f150 * f151) + f149) * f148) + f18;
                f17 = (((wcVar.T * f151) + f149) * f148) + f17;
                Paint c12 = wcVar.m0.c(e15);
                canvas2.save();
                if (wcVar.h == null && !wcVar.E && arrayList3.isEmpty()) {
                    float f152 = wcVar.y1 + wcVar.x1;
                    f36 = f16;
                    float f153 = wcVar.Q - wcVar.f;
                    float f154 = j12;
                    float f155 = wcVar.u1;
                    float f156 = ((f153 / f154) * f155) + f152;
                    paint2 = paint;
                    f35 = f148;
                    y3 = a4.a.e(r10 + wcVar.R, f154, f155, f152);
                    lerp = f156;
                } else {
                    f35 = f148;
                    f36 = f16;
                    paint2 = paint;
                    float f157 = j12;
                    lerp = ((((AndroidUtilities.lerp(wcVar.S, 0.0f, e16) * wcVar.R) + (wcVar.Q - wcVar.f)) / f157) * wcVar.u1) + wcVar.y1 + wcVar.x1;
                    y3 = wcVar.y1 + wcVar.x1 + (com.google.android.gms.internal.vision.e2.y(AndroidUtilities.lerp(wcVar.T, 1.0f, e16), wcVar.R, wcVar.Q - wcVar.f, f157) * wcVar.u1);
                }
                float f158 = y3;
                float f159 = wcVar.x1;
                RectF rectF16 = rectF3;
                rectF16.set(lerp - f159, f65 - audioHeight, f158 + f159, f65);
                f19 = (rectF16.top * f35) + f19;
                float f160 = (rectF16.bottom * f35) + f36;
                wcVar.G0.rewind();
                wcVar.G0.addRoundRect(rectF16, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(wcVar.G0);
                if (jaVar != null && jaVar.c()) {
                    naVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.h6.l1(e15, 855638016));
                } else if (c12 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.h6.l1(e15, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c12);
                    canvas2.drawColor(org.telegram.ui.ActionBar.h6.l1(e15, 855638016));
                }
                if (wcVar.a0 == null || jaVar == null || !jaVar.c()) {
                    f37 = e16;
                    rectF4 = rectF16;
                    if (wcVar.a0 != null && c12 != null) {
                        Paint c13 = wcVar.n0.c(e15 * f7);
                        if (c13 == null) {
                            c13 = wcVar.H0;
                            c13.setAlpha((int) (64.0f * e15));
                        }
                        float d12 = wcVar.g0.d(wcVar.a0.e, !wcVar.U);
                        oc ocVar = wcVar.a0;
                        wcVar.U = ocVar.c > 0;
                        long j20 = j12;
                        wcVar.I0.b((((wcVar.Q - wcVar.f) / j12) * wcVar.u1) + wcVar.y1 + wcVar.x1, lerp, f158, f37, j20, audioHeight, d12, rectF4.bottom, ocVar);
                        f38 = f37;
                        j10 = j20;
                        canvas2.drawPath(wcVar.I0, c13);
                        if (f38 >= 1.0f) {
                            int i40 = wcVar.y1;
                            float f161 = wcVar.x1 + i40;
                            float f162 = wcVar.Q - wcVar.f;
                            float f163 = wcVar.S;
                            float f164 = wcVar.R;
                            float f165 = j10;
                            float f166 = wcVar.u1;
                            float f167 = ((((f163 * f164) + f162) / f165) * f166) + f161;
                            float f168 = ((((wcVar.T * f164) + f162) / f165) * f166) + f161;
                            float min5 = (Math.min(wcVar.v1 - wcVar.y1, f168) + Math.max(i40, f167)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(wcVar.v1 - wcVar.y1, f168) - Math.max(wcVar.y1, f167)) - AndroidUtilities.dp(24.0f));
                            float dpf22 = AndroidUtilities.dpf2(13.0f);
                            if (wcVar.M0 == null && wcVar.Q0 == null) {
                                dpf2 = 0.0f;
                                f40 = 13.0f;
                            } else {
                                f40 = 13.0f;
                                dpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + wcVar.N0 + wcVar.R0;
                            }
                            float f169 = dpf22 + dpf2;
                            boolean z19 = f169 < max5;
                            float min6 = min5 - (Math.min(f169, max5) / 2.0f);
                            wcVar.K0.setBounds((int) min6, (int) (centerY3 - (AndroidUtilities.dp(f40) / 2.0f)), (int) (AndroidUtilities.dp(f40) + min6), (int) ((AndroidUtilities.dp(f40) / 2.0f) + centerY3));
                            float f170 = 1.0f - f38;
                            float f171 = f170 * 255.0f;
                            wcVar.K0.setAlpha((int) f171);
                            wcVar.K0.draw(canvas2);
                            float dpf23 = AndroidUtilities.dpf2(16.11f) + min6;
                            f25 = e15;
                            f39 = f160;
                            f26 = f12;
                            d = 0.0d;
                            f24 = f38;
                            f27 = f13;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, wcVar.v1, wcVar.w1, 255, 31);
                            float min7 = Math.min(f168, wcVar.v1) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf23, 0.0f, min7, wcVar.w1);
                            if (wcVar.M0 != null) {
                                canvas2.save();
                                canvas2.translate(dpf23 - wcVar.O0, centerY3 - (wcVar.M0.getHeight() / 2.0f));
                                wcVar.L0.setAlpha((int) (f171 * f25));
                                wcVar.M0.draw(canvas2);
                                canvas2.restore();
                                f41 = wcVar.N0 + dpf23;
                            } else {
                                f41 = dpf23;
                            }
                            if (wcVar.M0 != null && wcVar.Q0 != null) {
                                float dpf24 = AndroidUtilities.dpf2(3.66f) + f41;
                                int alpha = wcVar.J0.getAlpha();
                                wcVar.J0.setAlpha((int) (alpha * f170));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf24, centerY3, AndroidUtilities.dp(1.0f), wcVar.J0);
                                wcVar.J0.setAlpha(alpha);
                                f41 = AndroidUtilities.dpf2(2.0f) + dpf24 + AndroidUtilities.dpf2(4.0f);
                            }
                            if (wcVar.Q0 != null) {
                                canvas2.save();
                                canvas2.translate(f41 - wcVar.S0, centerY3 - (wcVar.Q0.getHeight() / 2.0f));
                                wcVar.P0.setAlpha((int) (f171 * f25));
                                wcVar.Q0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z19) {
                                wcVar.U0.reset();
                                wcVar.U0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                wcVar.U0.postTranslate(min7 - AndroidUtilities.dp(8.0f), 0.0f);
                                wcVar.T0.setLocalMatrix(wcVar.U0);
                                canvas2.drawRect(min7 - AndroidUtilities.dp(8.0f), rectF4.top, min7, rectF4.bottom, wcVar.V0);
                            }
                            canvas.restore();
                        } else {
                            f25 = e15;
                            f39 = f160;
                            f24 = f38;
                            f26 = f12;
                            f27 = f13;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f28 = f39;
                    }
                } else {
                    float d13 = wcVar.g0.d(wcVar.a0.e, !wcVar.U);
                    oc ocVar2 = wcVar.a0;
                    wcVar.U = ocVar2.c > 0;
                    rectF4 = rectF16;
                    f37 = e16;
                    wcVar.I0.b((((wcVar.Q - wcVar.f) / j12) * wcVar.u1) + wcVar.y1 + wcVar.x1, lerp, f158, f37, j12, audioHeight, d13, rectF4.bottom, ocVar2);
                    canvas2.saveLayerAlpha(rectF4, 102, 31);
                    canvas2.clipPath(wcVar.I0);
                    wcVar.n0.a(canvas2);
                    canvas2.restore();
                }
                j10 = j12;
                f38 = f37;
                if (f38 >= 1.0f) {
                }
                canvas.restore();
                f28 = f39;
            } else {
                f24 = e16;
                f25 = e15;
                float f172 = f16;
                paint2 = paint;
                f26 = f12;
                f27 = f13;
                d = 0.0d;
                j10 = j12;
                f28 = f172;
            }
            float f173 = f19;
            float f174 = wcVar.y1 + wcVar.x1;
            float f175 = wcVar.f;
            float f176 = j10;
            float f177 = wcVar.u1;
            float f178 = (((f18 - f175) / f176) * f177) + f174;
            float f179 = (((f17 - f175) / f176) * f177) + f174;
            if (!arrayList3.isEmpty()) {
                f30 = e13;
                f29 = f25;
                f25 = f22;
            } else if (wcVar.N && wcVar.h == null) {
                f30 = e13;
                f29 = f25;
            } else {
                float f180 = f25;
                f25 = Math.max(f27, e13);
                f29 = f180;
                f30 = e13;
            }
            if (f29 > d || f30 > d || f27 > d || f22 > d) {
                if (wcVar.h == null && !wcVar.E && arrayList3.isEmpty()) {
                    f31 = f24;
                    f32 = f29 * AndroidUtilities.lerp(0.6f, 1.0f, f31);
                } else {
                    f31 = f24;
                    f32 = 1.0f;
                }
                Paint paint5 = paint2;
                wcVar.e(canvas, paint5, f173, f28, f178, f179, f32 * f25);
                qc qcVar8 = wcVar.h;
                if (qcVar8 != null && ((wcVar.N || wcVar.E) && (f31 > 0.0f || f23 > 0.0f))) {
                    float f181 = wcVar.w1 - wcVar.z1;
                    float f182 = wcVar.x1 + wcVar.y1;
                    float f183 = qcVar8.g;
                    float f184 = qcVar8.e;
                    float f185 = wcVar.f;
                    float f186 = wcVar.u1;
                    float f187 = ((((qcVar8.h * f184) - f185) / f176) * f186) + f182;
                    canvas3 = canvas;
                    wcVar.e(canvas3, paint5, f181 - f20, f181, ((((f183 * f184) - f185) / f176) * f186) + f182, f187, 0.8f);
                } else if (wcVar.v == null || arrayList3.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    qc qcVar9 = wcVar.v;
                    RectF rectF17 = qcVar9.j;
                    float f188 = rectF17.top;
                    float f189 = rectF17.bottom;
                    float f190 = wcVar.x1 + wcVar.y1;
                    float f191 = qcVar9.f;
                    float f192 = qcVar9.g;
                    float f193 = qcVar9.e;
                    float f194 = wcVar.f;
                    float f195 = wcVar.u1;
                    float f196 = (((((f192 * f193) + f191) - f194) / f176) * f195) + f190;
                    float f197 = (((((qcVar9.h * f193) + f191) - f194) / f176) * f195) + f190;
                    canvas3 = canvas;
                    wcVar.e(canvas3, paint5, f188, f189, f196, f197, 0.8f);
                }
                if (wcVar.b0 > 1 && (qcVar3 = wcVar.h) != null) {
                    float f198 = qcVar3.e;
                    float f199 = qcVar3.h;
                    float f200 = qcVar3.g;
                    long j21 = (long) ((f199 - f200) * f198);
                    if (j21 > 68999) {
                        float f201 = wcVar.y1 + wcVar.x1;
                        float f202 = wcVar.f;
                        float f203 = wcVar.u1;
                        float f204 = ((((f200 * f198) - f202) / f176) * f203) + f201;
                        float f205 = ((((f199 * f198) - f202) / f176) * f203) + f201;
                        canvas3.save();
                        float f206 = wcVar.w1 - wcVar.z1;
                        canvas3.clipRect(f204, f206 - f20, f205, f206);
                        wcVar.z0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f26) * 255.0f));
                        long j22 = 59000;
                        int min8 = (int) Math.min(wcVar.b0 - 1, j21 / 59000);
                        int i41 = 1;
                        while (i41 <= min8) {
                            if (Math.min(j22, j21 - (i41 * j22)) < 1000) {
                                break;
                            }
                            float f207 = wcVar.y1 + wcVar.x1;
                            qc qcVar10 = wcVar.h;
                            float f208 = ((((((long) (qcVar10.e * qcVar10.g)) + r2) - wcVar.f) / f176) * wcVar.u1) + f207;
                            float f209 = wcVar.w1 - wcVar.z1;
                            Paint paint6 = wcVar.z0;
                            Canvas canvas4 = canvas3;
                            canvas4.drawRect(f208, (wcVar.w1 - wcVar.z1) - f20, AndroidUtilities.dp(1.0f) + f208, f209, paint6);
                            canvas3 = canvas4;
                            StringBuilder sb2 = new StringBuilder("#");
                            i41++;
                            sb2.append(i41);
                            canvas3.drawText(sb2.toString(), f208 + AndroidUtilities.dp(2.0f), ((wcVar.w1 - wcVar.z1) - f20) + AndroidUtilities.dp(14.0f), wcVar.E0);
                            j22 = 59000;
                        }
                        canvas3.restore();
                        d10 = wcVar.b1.d(0.0f, false);
                        float contentHeight = ((wcVar.w1 - wcVar.getContentHeight()) + wcVar.z1) - AndroidUtilities.dpf2(2.3f);
                        float dpf25 = AndroidUtilities.dpf2(4.3f) + (wcVar.w1 - wcVar.z1);
                        if (d10 <= 0.0f) {
                            long j23 = wcVar.c1;
                            if (j23 == -1) {
                                qc qcVar11 = wcVar.h;
                                if (qcVar11 != null) {
                                    j23 = (long) (qcVar11.e * qcVar11.h);
                                } else {
                                    qc qcVar12 = wcVar.v;
                                    if (qcVar12 != null) {
                                        j23 = (long) ((qcVar12.h - qcVar12.g) * qcVar12.e);
                                    } else {
                                        if (wcVar.E) {
                                            f33 = wcVar.H;
                                            f34 = wcVar.K;
                                        } else {
                                            f33 = wcVar.R;
                                            f34 = wcVar.T;
                                        }
                                        j23 = (long) (f33 * f34);
                                    }
                                }
                            }
                            wcVar = this;
                            wcVar.d(canvas3, contentHeight, dpf25, j23, d10 * f25);
                        } else {
                            wcVar = wcVar;
                        }
                        wcVar.d(canvas, contentHeight, dpf25, wcVar.e, (1.0f - d10) * f25);
                    }
                }
                d10 = wcVar.b1.d(0.0f, false);
                float contentHeight2 = ((wcVar.w1 - wcVar.getContentHeight()) + wcVar.z1) - AndroidUtilities.dpf2(2.3f);
                float dpf252 = AndroidUtilities.dpf2(4.3f) + (wcVar.w1 - wcVar.z1);
                if (d10 <= 0.0f) {
                }
                wcVar.d(canvas, contentHeight2, dpf252, wcVar.e, (1.0f - d10) * f25);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            j10 = j3;
        }
        if (wcVar.m1) {
            float f210 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f211 = wcVar.n1;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / wcVar.u1) * j10 * f210 * f211);
            if (wcVar.X0) {
                wcVar.n1 = (f210 * 0.25f) + f211;
            }
            int i42 = wcVar.h1;
            if (i42 == 4 && (qcVar2 = wcVar.h) != null) {
                float f212 = qcVar2.g;
                long j24 = wcVar.f;
                long j25 = qcVar2.e;
                float f213 = j25;
                if (f212 < j24 / f213) {
                    i11 = -1;
                } else if (qcVar2.h > (j24 + j10) / f213) {
                    i11 = 1;
                } else {
                    wcVar.n1 = 1.0f;
                    i11 = 0;
                }
                long j26 = i11 * dp2;
                wcVar.f = Utilities.clamp(j24 + j26, j25 - j10, 0L);
                wcVar.e += j26;
                qc qcVar13 = wcVar.h;
                float f214 = (r3 - j24) / qcVar13.e;
                if (f214 > 0.0f) {
                    f10 = 1.0f;
                    max = Math.min(1.0f - qcVar13.h, f214);
                } else {
                    f10 = 1.0f;
                    max = Math.max(0.0f - qcVar13.g, f214);
                }
                qc qcVar14 = wcVar.h;
                qcVar14.g = Utilities.clamp(qcVar14.g + max, f10, 0.0f);
                qc qcVar15 = wcVar.h;
                qcVar15.h = Utilities.clamp(qcVar15.h + max, f10, 0.0f);
                pc pcVar = wcVar.a;
                if (pcVar != null) {
                    pcVar.F(wcVar.h.g, false);
                    wcVar.a.a0(wcVar.h.h);
                }
                wcVar.invalidate();
            } else if (i42 == 8) {
                float f215 = wcVar.S;
                long j27 = wcVar.Q;
                float f216 = (-j27) + 100;
                long j28 = wcVar.R;
                float f217 = j28;
                if (f215 < f216 / f217) {
                    i10 = -1;
                } else if (wcVar.T >= ((r8 + j10) - 100) / f217) {
                    i10 = 1;
                } else {
                    wcVar.n1 = 1.0f;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (wcVar.P && (qcVar = wcVar.h) != null) {
                        long j29 = j27 - (i10 * dp2);
                        float f218 = qcVar.h;
                        float f219 = qcVar.e;
                        wcVar.Q = Utilities.clamp(j29, (long) ((f218 * f219) - (f215 * f217)), (long) ((qcVar.g * f219) - (wcVar.T * f217)));
                    } else if (wcVar.G && wcVar.E) {
                        long j30 = j27 - (i10 * dp2);
                        float f220 = wcVar.K;
                        float f221 = wcVar.H;
                        wcVar.Q = Utilities.clamp(j30, (long) ((f220 * f221) - (f215 * f217)), (long) ((wcVar.J * f221) - (wcVar.T * f217)));
                    } else {
                        wcVar.Q = Utilities.clamp(j27 - (i10 * dp2), 0L, -(j28 - Math.min(wcVar.getBaseDuration(), wcVar.getMaxScrollDuration())));
                    }
                    float f222 = (-(wcVar.Q - j27)) / wcVar.R;
                    float min9 = f222 > 0.0f ? Math.min(1.0f - wcVar.T, f222) : Math.max(0.0f - wcVar.S, f222);
                    if (wcVar.h == null) {
                        float f223 = wcVar.e;
                        float f224 = wcVar.R;
                        wcVar.e = (long) Utilities.clamp((min9 * f224) + f223, f224, 0.0f);
                    }
                    wcVar.S = Utilities.clamp(wcVar.S + min9, 1.0f, 0.0f);
                    wcVar.T = Utilities.clamp(wcVar.T + min9, 1.0f, 0.0f);
                    pc pcVar2 = wcVar.a;
                    if (pcVar2 != null) {
                        pcVar2.Y(wcVar.S);
                        wcVar.a.T(wcVar.T);
                        wcVar.a.n(wcVar.e, false);
                    }
                    wcVar.invalidate();
                } else {
                    wcVar.n1 = 1.0f;
                }
            } else {
                wcVar.n1 = 1.0f;
            }
        } else {
            wcVar.n1 = 1.0f;
        }
        int contentHeight3 = wcVar.getContentHeight();
        if (wcVar.c != contentHeight3) {
            wcVar.c = contentHeight3;
            Runnable runnable = wcVar.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(Canvas canvas, Paint paint, float f7, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f11 - AndroidUtilities.dp(10.0f), f7, AndroidUtilities.dp(10.0f) + f12, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.v1, this.w1, 255, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint2 = this.z0;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.inset(AndroidUtilities.dp(this.X0 ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        boolean z10 = this.X0;
        Paint paint3 = this.A0;
        if (z10) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint4 = this.B0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(255);
        paint5.setAlpha(i10);
        float f14 = f7 + f10;
        float f15 = (f14 - dp2) / 2.0f;
        float f16 = (f14 + dp2) / 2.0f;
        rectF.set(org.telegram.messenger.f0.x(AndroidUtilities.dp(this.X0 ? 2.0f : 10.0f), dp, 2.0f, f11), f15, f11 - ((AndroidUtilities.dp(this.X0 ? 2.0f : 10.0f) + dp) / 2.0f), f16);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.X0) {
                paint4.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.gms.internal.vision.e2.A(AndroidUtilities.dp(this.X0 ? 2.5f : 10.0f), dp, 2.0f, f12), f15, org.telegram.messenger.f0.a(AndroidUtilities.dp(this.X0 ? 2.5f : 10.0f), dp, 2.0f, f12), f16);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.b0 * 59000;
    }

    public final long g() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public int getContentHeight() {
        return (int) (this.z1 + (this.h != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.E ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.N ? AndroidUtilities.dp(4.0f) + getAudioHeight() : 0.0f) + this.z1);
    }

    public int getMaxCount() {
        return this.b0;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, (long) (f() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.z1 + this.z1, getContentHeight(), this.i0.c);
    }

    public final void h(float f7) {
        float f10;
        long j3;
        float f11;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        pc pcVar;
        long clamp;
        qc qcVar = this.h;
        if (qcVar == null && !this.E) {
            long j15 = this.Q;
            long clamp2 = Utilities.clamp(j15 + ((long) f7), 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f12 = clamp2 - j15;
            this.S = Utilities.clamp(this.S - (f12 / this.R), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f12 / this.R), 1.0f, 0.0f);
            pc pcVar2 = this.a;
            if (pcVar2 != null) {
                pcVar2.Y(this.S);
                this.a.T(this.T);
            }
        } else if (this.P) {
            if (qcVar != null) {
                f10 = qcVar.g;
                j3 = qcVar.e;
            } else {
                f10 = this.J;
                j3 = this.H;
            }
            float f13 = f10 * j3;
            if (qcVar != null) {
                f11 = qcVar.h;
                j10 = qcVar.e;
            } else {
                f11 = this.K;
                j10 = this.H;
            }
            float f14 = f11 * j10;
            float f15 = qcVar != null ? (qcVar.h - qcVar.g) * qcVar.e : this.H * (this.K - this.J);
            float f16 = this.T;
            float f17 = this.R;
            long j16 = (long) (f14 - (f16 * f17));
            float f18 = this.S;
            long j17 = (long) (f13 - (f18 * f17));
            float min = Math.min(f16 - f18, f15 / f17);
            long j18 = this.Q;
            long j19 = (long) f7;
            long j20 = j18 + j19;
            if (j20 > j16) {
                float clamp3 = Utilities.clamp(((f14 - j18) - j19) / this.R, 1.0f, min);
                this.T = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.S = clamp4;
                float f19 = this.T;
                float f20 = this.R;
                long j21 = (long) (f14 - (f19 * f20));
                long j22 = (long) (f13 - (clamp4 * f20));
                if (j21 < j22) {
                    j14 = j22;
                    j13 = j21;
                } else {
                    j13 = j22;
                    j14 = j21;
                }
                this.Q = Utilities.clamp(this.Q + j19, j14, j13);
                pc pcVar3 = this.a;
                if (pcVar3 != null) {
                    pcVar3.Y(this.S);
                    this.a.T(this.T);
                }
            } else if (j20 < j17) {
                float clamp5 = Utilities.clamp(((f13 - j18) - j19) / this.R, 1.0f - min, 0.0f);
                this.S = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.T = clamp6;
                float f21 = this.R;
                long j23 = (long) (f14 - (clamp6 * f21));
                long j24 = (long) (f13 - (this.S * f21));
                if (j23 < j24) {
                    j12 = j24;
                    j11 = j23;
                } else {
                    j11 = j24;
                    j12 = j23;
                }
                this.Q = Utilities.clamp(this.Q + j19, j12, j11);
                pc pcVar4 = this.a;
                if (pcVar4 != null) {
                    pcVar4.Y(this.S);
                    this.a.T(this.T);
                }
            } else {
                this.Q = j20;
            }
        } else {
            long j25 = this.Q + ((long) f7);
            float baseDuration = getBaseDuration();
            float f22 = this.R;
            this.Q = Utilities.clamp(j25, (long) (baseDuration - (this.T * f22)), (long) ((-this.S) * f22));
        }
        invalidate();
        pc pcVar5 = this.a;
        if (pcVar5 != null) {
            pcVar5.l0(this.Q + ((long) (this.S * this.R)));
        }
        boolean z10 = this.m1;
        if (z10 || (pcVar = this.a) == null) {
            if (z10 || this.r1) {
                qc qcVar2 = this.h;
                if (qcVar2 != null) {
                    long j26 = this.Q + ((long) (this.S * this.R));
                    float f23 = qcVar2.h;
                    float f24 = qcVar2.e;
                    this.e = Utilities.clamp(j26, (long) (f23 * f24), (long) (qcVar2.g * f24));
                } else if (!this.E || qcVar2 == null) {
                    float f25 = this.S;
                    long j27 = this.R;
                    this.e = Utilities.clamp((long) (f25 * j27), j27, 0L);
                } else {
                    long j28 = this.Q + ((long) (this.S * this.R));
                    float f26 = this.K;
                    float f27 = qcVar2.e;
                    this.e = Utilities.clamp(j28, (long) (f26 * f27), (long) (this.J * f27));
                }
                pc pcVar6 = this.a;
                if (pcVar6 != null) {
                    pcVar6.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        pcVar.w(true);
        qc qcVar3 = this.h;
        if (qcVar3 != null) {
            long j29 = this.Q + ((long) (this.S * this.R));
            float f28 = qcVar3.h;
            float f29 = qcVar3.e;
            clamp = Utilities.clamp(j29, (long) (f28 * f29), (long) (qcVar3.g * f29));
        } else if (this.E) {
            long j30 = this.Q + ((long) (this.S * this.R));
            float f30 = this.K;
            float f31 = this.H;
            clamp = Utilities.clamp(j30, (long) (f30 * f31), (long) (this.J * f31));
        } else {
            float f32 = this.S;
            long j31 = this.R;
            clamp = Utilities.clamp((long) (f32 * j31), j31, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        pc pcVar7 = this.a;
        this.e = clamp;
        pcVar7.n(clamp, false);
    }

    public final void i(qc qcVar, float f7) {
        pc pcVar;
        long clamp;
        long j3;
        long j10;
        long j11;
        long j12;
        if (qcVar == null) {
            return;
        }
        qc qcVar2 = this.v;
        if (qcVar2 != qcVar && qcVar2 != null) {
            if (this.n == this.s.indexOf(qcVar)) {
                qc qcVar3 = this.v;
                float f10 = qcVar3.e;
                float f11 = qcVar.h;
                float f12 = qcVar.e;
                long j13 = (long) ((f10 * 1.0f) - (f11 * f12));
                float f13 = qcVar.g;
                long j14 = (long) ((f10 * 0.0f) - (f13 * f12));
                float min = Math.min(f11 - f13, ((qcVar3.h - qcVar3.g) * f10) / f12);
                long j15 = qcVar.f;
                long j16 = (long) f7;
                long j17 = j15 + j16;
                if (j17 > j13) {
                    float clamp2 = Utilities.clamp((((this.v.h * r2.e) - j15) - j16) / qcVar.e, 1.0f, min);
                    qcVar.h = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    qcVar.g = clamp3;
                    qc qcVar4 = this.v;
                    float f14 = qcVar4.h;
                    float f15 = qcVar4.e;
                    float f16 = qcVar.h;
                    float f17 = qcVar.e;
                    long j18 = (long) ((f14 * f15) - (f16 * f17));
                    long j19 = (long) ((qcVar4.g * f15) - (clamp3 * f17));
                    if (j18 < j19) {
                        j12 = j19;
                        j11 = j18;
                    } else {
                        j11 = j19;
                        j12 = j18;
                    }
                    qcVar.f = Utilities.clamp(qcVar.f + j16, j12, j11);
                    pc pcVar2 = this.a;
                    if (pcVar2 != null) {
                        pcVar2.R(qcVar.g, qcVar.a);
                        this.a.Z(qcVar.h, qcVar.a);
                    }
                } else if (j17 < j14) {
                    float clamp4 = Utilities.clamp((((this.v.g * r2.e) - j15) - j16) / qcVar.e, 1.0f - min, 0.0f);
                    qcVar.g = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    qcVar.h = clamp5;
                    qc qcVar5 = this.v;
                    float f18 = qcVar5.h;
                    float f19 = qcVar5.e;
                    float f20 = qcVar.e;
                    long j20 = (long) ((f18 * f19) - (clamp5 * f20));
                    long j21 = (long) ((qcVar5.g * f19) - (qcVar.g * f20));
                    if (j20 < j21) {
                        j10 = j21;
                        j3 = j20;
                    } else {
                        j3 = j21;
                        j10 = j20;
                    }
                    qcVar.f = Utilities.clamp(qcVar.f + j16, j10, j3);
                    pc pcVar3 = this.a;
                    if (pcVar3 != null) {
                        pcVar3.R(qcVar.g, qcVar.a);
                        this.a.Z(qcVar.h, qcVar.a);
                    }
                } else {
                    qcVar.f = j17;
                }
            } else {
                long j22 = qcVar.f + ((long) f7);
                float baseDuration = getBaseDuration();
                float f21 = qcVar.e;
                qcVar.f = Utilities.clamp(j22, (long) (baseDuration - (qcVar.h * f21)), (long) ((-qcVar.g) * f21));
            }
        }
        invalidate();
        pc pcVar4 = this.a;
        if (pcVar4 != null) {
            pcVar4.i0(qcVar.a, qcVar.f);
        }
        boolean z10 = this.m1;
        if (z10 || (pcVar = this.a) == null) {
            if (z10 || this.r1) {
                qc qcVar6 = this.v;
                if (qcVar6 == qcVar || qcVar6 == null) {
                    float f22 = qcVar.g;
                    long j23 = qcVar.e;
                    this.e = Utilities.clamp((long) (f22 * j23), j23, 0L);
                } else {
                    long j24 = qcVar.f + ((long) (qcVar.g * qcVar.e));
                    float f23 = qcVar6.h;
                    float f24 = qcVar6.e;
                    this.e = Utilities.clamp(j24, (long) (f23 * f24), (long) (qcVar6.g * f24));
                }
                pc pcVar5 = this.a;
                if (pcVar5 != null) {
                    pcVar5.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        pcVar.w(true);
        qc qcVar7 = this.v;
        if (qcVar7 == qcVar || qcVar7 == null) {
            float f25 = qcVar.g;
            long j25 = qcVar.e;
            clamp = Utilities.clamp((long) (f25 * j25), j25, 0L);
        } else {
            long j26 = qcVar.f + ((long) (qcVar.g * qcVar.e));
            float f26 = qcVar7.h;
            float f27 = qcVar7.e;
            clamp = Utilities.clamp(j26, (long) (f26 * f27), (long) (qcVar7.g * f27));
        }
        qc qcVar8 = this.v;
        if (qcVar8 != qcVar && qcVar8 != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        pc pcVar6 = this.a;
        this.e = clamp;
        pcVar6.n(clamp, false);
    }

    public final void j(float f7) {
        long j3;
        long j10;
        long j11;
        long j12;
        pc pcVar;
        long clamp;
        qc qcVar = this.h;
        if (qcVar == null) {
            long j13 = this.I;
            long clamp2 = Utilities.clamp(j13 + ((long) f7), 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = clamp2 - j13;
            this.J = Utilities.clamp(this.J - (f10 / this.H), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / this.H), 1.0f, 0.0f);
            pc pcVar2 = this.a;
            if (pcVar2 != null) {
                pcVar2.u(this.J);
                this.a.h0(this.K);
            }
        } else if (this.G) {
            float f11 = qcVar.h;
            float f12 = qcVar.e;
            float f13 = this.K;
            float f14 = this.H;
            long j14 = (long) ((f11 * f12) - (f13 * f14));
            float f15 = qcVar.g;
            float f16 = this.J;
            long j15 = (long) ((f15 * f12) - (f16 * f14));
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j16 = this.I;
            long j17 = (long) f7;
            long j18 = j16 + j17;
            if (j18 > j14) {
                float clamp3 = Utilities.clamp((((this.h.h * r1.e) - j16) - j17) / this.H, 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                qc qcVar2 = this.h;
                float f17 = qcVar2.h;
                float f18 = qcVar2.e;
                float f19 = this.K;
                float f20 = this.H;
                long j19 = (long) ((f17 * f18) - (f19 * f20));
                long j20 = (long) ((qcVar2.g * f18) - (clamp4 * f20));
                if (j19 < j20) {
                    j12 = j20;
                    j11 = j19;
                } else {
                    j11 = j20;
                    j12 = j19;
                }
                this.I = Utilities.clamp(this.I + j17, j12, j11);
                pc pcVar3 = this.a;
                if (pcVar3 != null) {
                    pcVar3.u(this.J);
                    this.a.h0(this.K);
                }
            } else if (j18 < j15) {
                float clamp5 = Utilities.clamp((((this.h.g * r1.e) - j16) - j17) / this.H, 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                qc qcVar3 = this.h;
                float f21 = qcVar3.h;
                float f22 = qcVar3.e;
                float f23 = this.H;
                long j21 = (long) ((f21 * f22) - (clamp6 * f23));
                long j22 = (long) ((qcVar3.g * f22) - (this.J * f23));
                if (j21 < j22) {
                    j10 = j22;
                    j3 = j21;
                } else {
                    j3 = j22;
                    j10 = j21;
                }
                this.I = Utilities.clamp(this.I + j17, j10, j3);
                pc pcVar4 = this.a;
                if (pcVar4 != null) {
                    pcVar4.u(this.J);
                    this.a.h0(this.K);
                }
            } else {
                this.I = j18;
            }
        } else {
            long j23 = this.I + ((long) f7);
            float baseDuration = getBaseDuration();
            float f24 = this.H;
            this.I = Utilities.clamp(j23, (long) (baseDuration - (this.K * f24)), (long) ((-this.J) * f24));
        }
        invalidate();
        pc pcVar5 = this.a;
        if (pcVar5 != null) {
            pcVar5.J(this.I + ((long) (this.J * this.H)));
        }
        boolean z10 = this.m1;
        if (z10 || (pcVar = this.a) == null) {
            if (z10 || this.r1) {
                qc qcVar4 = this.h;
                if (qcVar4 != null) {
                    long j24 = this.I + ((long) (this.J * this.H));
                    float f25 = qcVar4.h;
                    float f26 = qcVar4.e;
                    this.e = Utilities.clamp(j24, (long) (f25 * f26), (long) (qcVar4.g * f26));
                } else {
                    float f27 = this.J;
                    long j25 = this.H;
                    this.e = Utilities.clamp((long) (f27 * j25), j25, 0L);
                }
                pc pcVar6 = this.a;
                if (pcVar6 != null) {
                    pcVar6.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        pcVar.w(true);
        qc qcVar5 = this.h;
        if (qcVar5 != null) {
            long j26 = this.I + ((long) (this.J * this.H));
            float f28 = qcVar5.h;
            float f29 = qcVar5.e;
            clamp = Utilities.clamp(j26, (long) (f28 * f29), (long) (qcVar5.g * f29));
        } else {
            float f30 = this.J;
            long j27 = this.H;
            clamp = Utilities.clamp((long) (f30 * j27), j27, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        pc pcVar7 = this.a;
        this.e = clamp;
        pcVar7.n(clamp, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        qc qcVar = this.h;
        float f7 = (qcVar.h + qcVar.g) / 2.0f;
        long j3 = qcVar.e;
        this.f = Utilities.clamp((long) ((f7 * j3) - (min / 2.0f)), j3 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        if (z10 && this.E) {
            this.G = true;
            this.P = false;
        } else {
            this.G = false;
            this.P = this.N && this.h == null;
        }
        invalidate();
    }

    public final boolean m(float f7, boolean z10) {
        qc qcVar = this.h;
        ArrayList arrayList = this.s;
        if (qcVar == null && !this.N && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f10 = ((f7 - this.y1) - this.x1) / this.u1;
        qc qcVar2 = this.v;
        long j3 = qcVar2 != null ? (long) ((qcVar2.g * qcVar2.e) + qcVar2.f) : 0L;
        float f11 = f10 * min;
        if (qcVar2 == null) {
            j3 = this.h == null ? this.Q : 0L;
        }
        long clamp = (long) Utilities.clamp((f11 - j3) + this.f, getBaseDuration(), 0.0f);
        qc qcVar3 = this.h;
        if (qcVar3 != null) {
            float f12 = clamp / qcVar3.e;
            if (f12 < qcVar3.g || f12 > qcVar3.h) {
                return false;
            }
        }
        qc qcVar4 = this.v;
        if (qcVar4 != null && (clamp < 0 || clamp >= ((long) ((qcVar4.h - qcVar4.g) * qcVar4.e)))) {
            return false;
        }
        if (this.N && qcVar3 == null && arrayList.isEmpty()) {
            float f13 = clamp / this.R;
            if (f13 < this.S || f13 > this.T) {
                return false;
            }
        }
        this.e = clamp;
        invalidate();
        pc pcVar = this.a;
        if (pcVar != null) {
            pcVar.n(clamp, z10);
        }
        ai.j jVar = this.d1;
        if (jVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jVar);
            this.d1 = null;
        }
        if (!z10) {
            return true;
        }
        ai.j jVar2 = new ai.j(this, clamp, 7);
        this.d1 = jVar2;
        AndroidUtilities.runOnUIThread(jVar2, 150L);
        return true;
    }

    public final void n(String str, long j3, long j10, float f7, float f10, float f11, boolean z10) {
        long j11;
        boolean z11;
        boolean z12;
        qc qcVar;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        uc ucVar = this.M;
        if (ucVar != null) {
            ucVar.b();
            this.M = null;
        }
        long j12 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j3;
            this.I = j10 - ((long) (j3 * f7));
            this.J = f7;
            this.K = f10;
            this.L = f11;
            if (getMeasuredWidth() <= 0 || this.M != null || ((qcVar = this.h) != null && qcVar.e < 1)) {
                j11 = j12;
                z12 = false;
                z11 = true;
            } else {
                String str2 = this.F;
                int i10 = this.v1;
                int i11 = this.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j13 = this.H;
                Long valueOf = j13 > 2 ? Long.valueOf(j13) : null;
                qc qcVar2 = this.h;
                j11 = j12;
                z12 = false;
                z11 = true;
                this.M = new uc(this, false, str2, i12, dp, valueOf, qcVar2 != null ? qcVar2.e : getMaxScrollDuration(), -1L, -1L, new mc(this, 0));
            }
            if (this.h == null) {
                this.P = z12;
                this.G = z11;
            }
        } else {
            j11 = j12;
            z11 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        this.E = this.F != null;
        if (j11 != j3 && this.h == null && this.a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(j3 / this.R, 1.0f, 0.0f);
        }
        if (!z10) {
            this.d0.f(this.G, z11);
            this.f0.f(this.P, z11);
            this.c0.f(this.E, z11);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j3, float f7) {
        qc qcVar = this.h;
        if (TextUtils.equals(qcVar == null ? null : qcVar.d, str)) {
            return;
        }
        qc qcVar2 = this.h;
        if (qcVar2 != null) {
            uc ucVar = qcVar2.c;
            if (ucVar != null) {
                ucVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            qc qcVar3 = new qc(this);
            this.h = qcVar3;
            qcVar3.b = z10;
            qcVar3.d = str;
            qcVar3.e = j3;
            qcVar3.i = f7;
            qc.a(qcVar3, false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.L0.setTextSize(AndroidUtilities.dp(12.0f));
        this.P0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.y1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.z1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.v1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.w1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.x1 = dp4;
        this.u1 = (this.v1 - (dp4 * 2)) - (this.y1 * 2);
        qc qcVar = this.h;
        if (qcVar != null && qcVar.d != null && qcVar.c == null) {
            qc.a(qcVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                qc qcVar2 = (qc) obj;
                if (qcVar2.d != null && qcVar2.c == null) {
                    qc.a(qcVar2, false);
                    qc.b(qcVar2);
                }
            }
        }
        if (this.O == null || this.a0 != null) {
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
        ai.j jVar;
        boolean z11;
        VelocityTracker velocityTracker;
        pc pcVar;
        VelocityTracker velocityTracker2;
        long j3;
        boolean z12;
        long j10;
        long j11;
        long j12;
        float f7;
        VelocityTracker velocityTracker3;
        long j13;
        long j14;
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
        pc pcVar2;
        int i10;
        float f10;
        float f11;
        boolean z15;
        float f12;
        float clamp;
        pc pcVar3;
        pc pcVar4;
        int i11;
        float f13;
        float f14;
        qc qcVar = this.h;
        ArrayList arrayList = this.s;
        if (qcVar != null || !arrayList.isEmpty() || this.N || this.E) {
            float timelineHeight = this.w1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                zm0 zm0Var = this.W0;
                ai.m3 m3Var = this.Y0;
                if (action == 0) {
                    ai.j jVar2 = this.d1;
                    if (jVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(jVar2);
                        this.d1 = null;
                    }
                    zm0Var.a();
                    this.i1 = -1;
                    this.h1 = c(motionEvent);
                    this.j1 = -1;
                    this.k1 = -1;
                    int i12 = this.w1 - this.z1;
                    if (!this.j0) {
                        if (this.o0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.j1 = 10;
                            this.h1 = -1;
                        }
                    }
                    if (this.j1 != -1 || this.h == null) {
                        f13 = 4.0f;
                    } else {
                        float f15 = i12;
                        if (motionEvent.getY() < f15) {
                            f13 = 4.0f;
                            if (motionEvent.getY() > (f15 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.j1 = 0;
                            }
                        } else {
                            f13 = 4.0f;
                        }
                        i12 = (int) (f15 - (getVideoHeight() + AndroidUtilities.dp(f13)));
                    }
                    if (this.j1 == -1 && !arrayList.isEmpty()) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            f14 = 2.0f;
                            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((qc) arrayList.get(i13)).k.c);
                            float f16 = i12;
                            if (motionEvent.getY() < f16 && motionEvent.getY() > (f16 - lerp) - AndroidUtilities.dp(2.0f)) {
                                this.j1 = 3;
                                this.k1 = i13;
                                break;
                            }
                            i12 = (int) (f16 - (lerp + AndroidUtilities.dp(f13)));
                        }
                    }
                    f14 = 2.0f;
                    if (this.j1 == -1 && this.E) {
                        float f17 = i12;
                        if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - getRoundHeight()) - AndroidUtilities.dp(f14)) {
                            this.j1 = 1;
                        }
                        i12 = (int) (f17 - (getRoundHeight() + AndroidUtilities.dp(f13)));
                    }
                    if (this.j1 == -1 && this.N) {
                        float f18 = i12;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getAudioHeight()) - AndroidUtilities.dp(f14)) {
                            this.j1 = 2;
                        }
                        getAudioHeight();
                        AndroidUtilities.dp(f13);
                    }
                    this.f1 = System.currentTimeMillis();
                    int i14 = this.h1;
                    this.l1 = i14 == 0 || i14 == -1 || i14 == 1;
                    this.o1 = false;
                    if (i14 == 1 || i14 == 5 || i14 == 8) {
                        this.p1 = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker7 = this.p1;
                        if (velocityTracker7 != null) {
                            velocityTracker7.recycle();
                            this.p1 = null;
                        }
                    }
                    this.n1 = 1.0f;
                    this.m1 = false;
                    this.g1 = motionEvent.getX();
                    if (!this.X0) {
                        AndroidUtilities.cancelRunOnUIThread(m3Var);
                        AndroidUtilities.runOnUIThread(m3Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.g1;
                    if (this.j0 && (this.m1 || Math.abs(x10) > AndroidUtilities.touchSlop)) {
                        long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                        qc qcVar2 = this.h;
                        if (qcVar2 != null && this.h1 == 1) {
                            this.f = (long) Utilities.clamp(this.f - ((x10 / this.u1) * min3), qcVar2.e - min3, 0.0f);
                            invalidate();
                            if (!this.m1) {
                                this.n1 = 1.0f;
                            }
                            this.m1 = true;
                            this.l1 = false;
                        } else if (qcVar2 == null || !((i11 = this.h1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.h1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f19 = (min3 / this.R) * (x10 / this.u1);
                                if (i15 == 6) {
                                    float g10 = this.T - (g() / this.R);
                                    float max3 = Math.max(0L, this.f - this.Q);
                                    float f20 = this.R;
                                    float f21 = max3 / f20;
                                    qc qcVar3 = this.h;
                                    if (qcVar3 != null) {
                                        max = Math.max(f21, (((qcVar3.g * qcVar3.e) + this.f) - this.Q) / f20);
                                    } else {
                                        qc qcVar4 = this.v;
                                        if (qcVar4 != null) {
                                            max = Math.max(f21, (((qcVar4.g * qcVar4.e) + this.f) - this.Q) / f20);
                                        } else if (this.E) {
                                            max = Math.max(f21, (((this.J * this.H) + this.f) - this.Q) / f20);
                                        } else {
                                            max = Math.max(f21, this.T - (f() / this.R));
                                            if (!this.o1 && f19 < 0.0f && this.S <= this.T - (f() / this.R)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f22 = this.S;
                                    float clamp2 = Utilities.clamp(f22 + f19, g10, max);
                                    this.S = clamp2;
                                    if (Math.abs(f22 - clamp2) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    pc pcVar5 = this.a;
                                    if (pcVar5 != null) {
                                        pcVar5.l0(this.Q + ((long) (this.S * this.R)));
                                    }
                                    pc pcVar6 = this.a;
                                    if (pcVar6 != null) {
                                        pcVar6.Y(this.S);
                                    }
                                } else if (i15 == 7) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min3) / this.R);
                                    float f23 = this.S;
                                    float g11 = g();
                                    float f24 = this.R;
                                    float f25 = (g11 / f24) + f23;
                                    qc qcVar5 = this.h;
                                    if (qcVar5 != null) {
                                        min = Math.min(min4, (((qcVar5.h * qcVar5.e) + this.f) - this.Q) / f24);
                                    } else {
                                        qc qcVar6 = this.v;
                                        if (qcVar6 != null) {
                                            min = Math.min(min4, (((qcVar6.h * qcVar6.e) + this.f) - this.Q) / f24);
                                        } else if (this.E) {
                                            min = Math.min(min4, (((this.K * this.H) + this.f) - this.Q) / f24);
                                        } else {
                                            min = Math.min(min4, (f() / this.R) + this.S);
                                            if (!this.o1 && f19 > 0.0f) {
                                                if (this.T >= (f() / this.R) + this.S) {
                                                    this.h1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f26 = this.T;
                                    float clamp3 = Utilities.clamp(f26 + f19, min, f25);
                                    this.T = clamp3;
                                    if (Math.abs(f26 - clamp3) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    pc pcVar7 = this.a;
                                    if (pcVar7 != null) {
                                        pcVar7.T(this.T);
                                    }
                                }
                                if (this.h1 == 8) {
                                    float min5 = f19 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min3) / this.R) - this.T), f19) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.Q) / this.R) - this.S), f19);
                                    float f27 = this.S + min5;
                                    this.S = f27;
                                    this.T += min5;
                                    pc pcVar8 = this.a;
                                    if (pcVar8 != null) {
                                        pcVar8.Y(f27);
                                        this.a.l0(this.Q + ((long) (this.S * this.R)));
                                        this.a.T(this.T);
                                    }
                                    pc pcVar9 = this.a;
                                    if (pcVar9 != null) {
                                        pcVar9.w(true);
                                    }
                                }
                                if (this.h == null && !this.E) {
                                    this.e = (long) (this.S * this.R);
                                    pc pcVar10 = this.a;
                                    if (pcVar10 != null) {
                                        pcVar10.w(true);
                                        this.a.n(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.m1) {
                                    this.n1 = 1.0f;
                                }
                                this.m1 = true;
                                this.l1 = false;
                            } else if (i15 == 10 || i15 == 11 || i15 == 12) {
                                float f28 = (min3 / this.H) * (x10 / this.u1);
                                if (i15 == 10) {
                                    float g12 = this.K - (g() / this.H);
                                    float max4 = Math.max(0L, this.f - this.I);
                                    float f29 = this.H;
                                    float f30 = max4 / f29;
                                    qc qcVar7 = this.h;
                                    if (qcVar7 != null) {
                                        max2 = Math.max(f30, (((qcVar7.g * qcVar7.e) + this.f) - this.I) / f29);
                                    } else {
                                        qc qcVar8 = this.v;
                                        if (qcVar8 != null) {
                                            max2 = Math.max(f30, (((qcVar8.g * qcVar8.e) + this.f) - this.I) / f29);
                                        } else {
                                            max2 = Math.max(f30, this.K - (f() / this.H));
                                            if (!this.o1 && f28 < 0.0f && this.J <= this.K - (f() / this.H)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f31 = this.J;
                                    float clamp4 = Utilities.clamp(f31 + f28, g12, max2);
                                    this.J = clamp4;
                                    if (Math.abs(f31 - clamp4) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    pc pcVar11 = this.a;
                                    if (pcVar11 != null) {
                                        pcVar11.J(this.I + ((long) (this.J * this.H)));
                                    }
                                    pc pcVar12 = this.a;
                                    if (pcVar12 != null) {
                                        pcVar12.u(this.J);
                                    }
                                } else if (i15 == 11) {
                                    float min6 = Math.min(1.0f, Math.max(0L, (this.f - this.I) + min3) / this.H);
                                    float f32 = this.J;
                                    float g13 = g();
                                    float f33 = this.H;
                                    float f34 = (g13 / f33) + f32;
                                    qc qcVar9 = this.h;
                                    if (qcVar9 != null) {
                                        min6 = Math.min(min6, (((qcVar9.h * qcVar9.e) + this.f) - this.I) / f33);
                                    }
                                    qc qcVar10 = this.v;
                                    if (qcVar10 != null) {
                                        min2 = Math.min(min6, (((qcVar10.h * qcVar10.e) + this.f) - this.I) / this.H);
                                    } else {
                                        min2 = Math.min(min6, (f() / this.H) + this.J);
                                        if (!this.o1 && f28 > 0.0f) {
                                            if (this.K >= (f() / this.H) + this.J) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f35 = this.K;
                                    float clamp5 = Utilities.clamp(f35 + f28, min2, f34);
                                    this.K = clamp5;
                                    if (Math.abs(f35 - clamp5) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    pc pcVar13 = this.a;
                                    if (pcVar13 != null) {
                                        pcVar13.h0(this.K);
                                    }
                                }
                                if (this.h1 == 12) {
                                    float min7 = f28 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.I) + min3) / this.H) - this.K, f28) : Math.max((Math.max(0L, this.f - this.I) / this.H) - this.J, f28);
                                    float f36 = this.J + min7;
                                    this.J = f36;
                                    this.K += min7;
                                    pc pcVar14 = this.a;
                                    if (pcVar14 != null) {
                                        pcVar14.u(f36);
                                        this.a.J(this.I + ((long) (this.J * this.H)));
                                        this.a.h0(this.K);
                                    }
                                    pc pcVar15 = this.a;
                                    if (pcVar15 != null) {
                                        pcVar15.w(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.J * this.H);
                                    pc pcVar16 = this.a;
                                    if (pcVar16 != null) {
                                        pcVar16.w(true);
                                        z13 = false;
                                        this.a.n(this.e, false);
                                        invalidate();
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = z13;
                                    }
                                }
                                z13 = false;
                                invalidate();
                                if (!this.m1) {
                                }
                                this.m1 = true;
                                this.l1 = z13;
                            } else {
                                int i16 = this.i1;
                                if (i16 < 0 || i16 >= arrayList.size() || !((i10 = this.h1) == 13 || i10 == 14 || i10 == 15)) {
                                    int i17 = this.h1;
                                    if (i17 == 5) {
                                        h((x10 / this.u1) * min3);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else if (i17 == 9) {
                                        j((x10 / this.u1) * min3);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else {
                                        int i18 = this.i1;
                                        if (i18 >= 0 && i18 < arrayList.size() && this.h1 == 16) {
                                            i((qc) arrayList.get(this.i1), (x10 / this.u1) * min3);
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = true;
                                            this.l1 = false;
                                        } else if (this.l1) {
                                            m(motionEvent.getX(), currentTimeMillis - this.e1 < 350);
                                            if (this.m1 || (pcVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                pcVar2.w(true);
                                            }
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z14;
                                        }
                                    }
                                } else {
                                    qc qcVar11 = (qc) arrayList.get(this.i1);
                                    float f37 = (min3 / qcVar11.e) * (x10 / this.u1);
                                    int i19 = this.h1;
                                    if (i19 == 13) {
                                        float g14 = qcVar11.h - (g() / qcVar11.e);
                                        float max5 = Math.max(0L, this.f - qcVar11.f) / qcVar11.e;
                                        if (qcVar11 == this.v) {
                                            f10 = f37;
                                            max5 = Math.max(max5, qcVar11.h - (f() / qcVar11.e));
                                            if (!this.o1 && f10 < 0.0f) {
                                                f11 = 0.0f;
                                                if (qcVar11.g <= qcVar11.h - (f() / qcVar11.e)) {
                                                    this.h1 = 15;
                                                }
                                                f12 = qcVar11.g;
                                                clamp = Utilities.clamp(f12 + f10, g14, max5);
                                                qcVar11.g = clamp;
                                                if (Math.abs(f12 - clamp) > 0.01f) {
                                                    this.o1 = true;
                                                }
                                                pcVar3 = this.a;
                                                if (pcVar3 != null) {
                                                    pcVar3.i0(qcVar11.a, qcVar11.f);
                                                }
                                                pcVar4 = this.a;
                                                if (pcVar4 != null) {
                                                    pcVar4.R(qcVar11.g, qcVar11.a);
                                                }
                                            }
                                        } else {
                                            f10 = f37;
                                        }
                                        f11 = 0.0f;
                                        f12 = qcVar11.g;
                                        clamp = Utilities.clamp(f12 + f10, g14, max5);
                                        qcVar11.g = clamp;
                                        if (Math.abs(f12 - clamp) > 0.01f) {
                                        }
                                        pcVar3 = this.a;
                                        if (pcVar3 != null) {
                                        }
                                        pcVar4 = this.a;
                                        if (pcVar4 != null) {
                                        }
                                    } else {
                                        f10 = f37;
                                        f11 = 0.0f;
                                        if (i19 == 14) {
                                            float min8 = Math.min(1.0f, Math.max(0L, (this.f - qcVar11.f) + min3) / qcVar11.e);
                                            float g15 = (g() / qcVar11.e) + qcVar11.g;
                                            if (qcVar11 == this.v) {
                                                min8 = Math.min(min8, (f() / qcVar11.e) + qcVar11.g);
                                                if (!this.o1 && f10 > 0.0f) {
                                                    if (qcVar11.h >= (f() / qcVar11.e) + qcVar11.g) {
                                                        this.h1 = 15;
                                                    }
                                                }
                                            }
                                            float f38 = qcVar11.h;
                                            float clamp6 = Utilities.clamp(f38 + f10, min8, g15);
                                            qcVar11.h = clamp6;
                                            if (Math.abs(f38 - clamp6) > 0.01f) {
                                                this.o1 = true;
                                            }
                                            pc pcVar17 = this.a;
                                            if (pcVar17 != null) {
                                                pcVar17.Z(qcVar11.h, qcVar11.a);
                                            }
                                        }
                                    }
                                    if (this.h1 == 15) {
                                        float min9 = f10 > f11 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - qcVar11.f) + min3) / qcVar11.e) - qcVar11.h, f10) : Math.max((Math.max(0L, this.f - qcVar11.f) / qcVar11.e) - qcVar11.g, f10);
                                        float f39 = qcVar11.g + min9;
                                        qcVar11.g = f39;
                                        qcVar11.h += min9;
                                        pc pcVar18 = this.a;
                                        if (pcVar18 != null) {
                                            pcVar18.R(f39, qcVar11.a);
                                            this.a.i0(qcVar11.a, qcVar11.f);
                                            this.a.Z(qcVar11.h, qcVar11.a);
                                        }
                                        pc pcVar19 = this.a;
                                        if (pcVar19 != null) {
                                            z15 = true;
                                            pcVar19.w(true);
                                            invalidate();
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z15;
                                            this.l1 = false;
                                        }
                                    }
                                    z15 = true;
                                    invalidate();
                                    if (!this.m1) {
                                    }
                                    this.m1 = z15;
                                    this.l1 = false;
                                }
                            }
                        } else {
                            float f40 = qcVar2.e;
                            float f41 = (min3 / f40) * (x10 / this.u1);
                            if (i11 == 2) {
                                qcVar2.g = Utilities.clamp(qcVar2.g + f41, qcVar2.h - (1000.0f / f40), 0.0f);
                                pc pcVar20 = this.a;
                                if (pcVar20 != null) {
                                    pcVar20.F(this.h.g, false);
                                }
                                qc qcVar12 = this.h;
                                float f42 = qcVar12.h - qcVar12.g;
                                float f43 = f();
                                qc qcVar13 = this.h;
                                if (f42 > f43 / qcVar13.e) {
                                    qcVar13.h = Math.min(1.0f, (f() / this.h.e) + qcVar13.g);
                                    pc pcVar21 = this.a;
                                    if (pcVar21 != null) {
                                        pcVar21.a0(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                qcVar2.h = Utilities.clamp(qcVar2.h + f41, 1.0f, (1000.0f / f40) + qcVar2.g);
                                pc pcVar22 = this.a;
                                if (pcVar22 != null) {
                                    pcVar22.a0(this.h.h);
                                }
                                qc qcVar14 = this.h;
                                float f44 = qcVar14.h - qcVar14.g;
                                float f45 = f();
                                qc qcVar15 = this.h;
                                if (f44 > f45 / qcVar15.e) {
                                    qcVar15.g = Math.max(0.0f, qcVar15.h - (f() / this.h.e));
                                    pc pcVar23 = this.a;
                                    if (pcVar23 != null) {
                                        pcVar23.F(this.h.g, false);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min10 = f41 > 0.0f ? Math.min(1.0f - qcVar2.h, f41) : Math.max(-qcVar2.g, f41);
                                qc qcVar16 = this.h;
                                float f46 = qcVar16.g + min10;
                                qcVar16.g = f46;
                                qcVar16.h += min10;
                                pc pcVar24 = this.a;
                                if (pcVar24 != null) {
                                    pcVar24.F(f46, false);
                                    this.a.a0(this.h.h);
                                }
                            }
                            float f47 = this.e;
                            qc qcVar17 = this.h;
                            float f48 = qcVar17.e;
                            float f49 = f47 / f48;
                            float f50 = qcVar17.g;
                            if (f49 < f50 || f49 > qcVar17.h) {
                                long j15 = (long) (f50 * f48);
                                this.e = j15;
                                pc pcVar25 = this.a;
                                if (pcVar25 != null) {
                                    pcVar25.n(j15, false);
                                }
                            }
                            invalidate();
                            if (!this.m1) {
                                this.n1 = 1.0f;
                            }
                            this.m1 = true;
                            this.l1 = false;
                        }
                        this.g1 = motionEvent.getX();
                    }
                    if (this.m1) {
                        AndroidUtilities.cancelRunOnUIThread(m3Var);
                    }
                    int i20 = this.h1;
                    if ((i20 == 1 || i20 == 5 || i20 == 8) && (velocityTracker6 = this.p1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(m3Var);
                    zm0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.f1 > ViewConfiguration.getTapTimeout() || this.m1) && this.j0) {
                            int i21 = this.h1;
                            int i22 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                            if (i21 == 16 && (velocityTracker5 = this.p1) != null) {
                                velocityTracker5.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                    long min11 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i23 = this.y1;
                                    float f51 = i23;
                                    float f52 = min11;
                                    float f53 = this.u1;
                                    int i24 = (int) (((this.f / f52) * f53) + f51);
                                    int e = (int) a4.a.e(this.h.e - min11, f52, f53, f51);
                                    this.r1 = true;
                                    this.s1 = i24;
                                    this.W0.c(i24, 0, -xVelocity, 0, i23, e, 0, 0);
                                    z10 = false;
                                }
                            } else if (i21 == 1 && (velocityTracker4 = this.p1) != null) {
                                velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity2 = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long min12 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i25 = this.y1;
                                    float f54 = i25;
                                    float f55 = min12;
                                    float f56 = this.u1;
                                    int i26 = (int) (((this.f / f55) * f56) + f54);
                                    int e7 = (int) a4.a.e(this.h.e - min12, f55, f56, f54);
                                    this.r1 = true;
                                    this.s1 = i26;
                                    this.W0.c(i26, 0, -xVelocity2, 0, i25, e7, 0, 0);
                                    z10 = false;
                                }
                            } else if ((i21 == 5 || (i21 == 8 && !this.m1)) && this.P && (velocityTracker2 = this.p1) != null) {
                                if (this.h == null) {
                                    i22 = 1500;
                                }
                                velocityTracker2.computeCurrentVelocity(i22);
                                int xVelocity3 = (int) this.p1.getXVelocity();
                                this.q1 = false;
                                if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                                    float min13 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i27 = (int) (((this.Q / min13) * this.u1) + this.y1 + this.x1);
                                    qc qcVar18 = this.h;
                                    if (qcVar18 != null) {
                                        float f57 = qcVar18.h;
                                        float f58 = qcVar18.e;
                                        j11 = this.R;
                                        j12 = (long) ((f57 * f58) - 0);
                                        f7 = qcVar18.g * f58;
                                    } else if (this.E) {
                                        float f59 = this.K;
                                        float f60 = this.H;
                                        j11 = this.R;
                                        j12 = (long) ((f59 * f60) - 0);
                                        f7 = this.J * f60;
                                    } else {
                                        j3 = -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j10 = 0;
                                        this.r1 = z12;
                                        this.s1 = i27;
                                        float f61 = this.y1 + this.x1;
                                        float f62 = this.u1;
                                        this.W0.c(i27, 0, xVelocity3, 0, (int) (((j3 / min13) * f62) + f61), (int) a4.a.e(j10, min13, f62, f61), 0, 0);
                                        z10 = false;
                                    }
                                    j3 = (long) (f7 - j11);
                                    j10 = j12;
                                    z12 = true;
                                    this.r1 = z12;
                                    this.s1 = i27;
                                    float f612 = this.y1 + this.x1;
                                    float f622 = this.u1;
                                    this.W0.c(i27, 0, xVelocity3, 0, (int) (((j3 / min13) * f622) + f612), (int) a4.a.e(j10, min13, f622, f612), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i21 == 9 || (i21 == 12 && !this.m1)) && this.G && (velocityTracker3 = this.p1) != null) {
                                if (this.h == null) {
                                    i22 = 1500;
                                }
                                velocityTracker3.computeCurrentVelocity(i22);
                                int xVelocity4 = (int) this.p1.getXVelocity();
                                this.q1 = false;
                                if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                                    float min14 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i28 = (int) (((this.I / min14) * this.u1) + this.y1 + this.x1);
                                    qc qcVar19 = this.h;
                                    if (qcVar19 != null) {
                                        float f63 = qcVar19.h;
                                        float f64 = qcVar19.e;
                                        j13 = (long) ((qcVar19.g * f64) - this.H);
                                        j14 = (long) ((f63 * f64) - 0);
                                    } else {
                                        j13 = -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j14 = 0;
                                    }
                                    this.r1 = true;
                                    this.s1 = i28;
                                    float f65 = this.y1 + this.x1;
                                    float f66 = this.u1;
                                    this.W0.c(i28, 0, xVelocity4, 0, (int) (((j13 / min14) * f66) + f65), (int) a4.a.e(j14, min14, f66, f65), 0, 0);
                                    z10 = false;
                                }
                            }
                            jVar = this.d1;
                            if (jVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(jVar);
                                this.d1 = null;
                            }
                            if (this.m1 || !z10 || (pcVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                pcVar.w(false);
                            }
                            this.n1 = 1.0f;
                            this.m1 = z11;
                            this.l1 = z11;
                            this.f1 = -1L;
                            this.h1 = -1;
                            velocityTracker = this.p1;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.p1 = null;
                            }
                        } else if (this.j0) {
                            if (!this.X0 || this.h == null) {
                                int i29 = this.j1;
                                if (i29 == 3) {
                                    int i30 = (this.P || this.G) ? -1 : this.n;
                                    int i31 = this.k1;
                                    if (i30 != i31) {
                                        this.P = false;
                                        this.G = false;
                                        this.n = i31;
                                        if (this.a != null && i31 >= 0 && i31 < arrayList.size()) {
                                            this.a.e(((qc) arrayList.get(this.k1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i29 == 2 && !this.P) {
                                    this.P = true;
                                    this.G = false;
                                    pc pcVar26 = this.a;
                                    if (pcVar26 != null) {
                                        pcVar26.O(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 && !this.G) {
                                    this.P = false;
                                    this.G = true;
                                    pc pcVar27 = this.a;
                                    if (pcVar27 != null) {
                                        pcVar27.O(true);
                                    }
                                    invalidate();
                                } else if (i29 != 2 && this.P) {
                                    this.P = false;
                                    this.G = false;
                                    pc pcVar28 = this.a;
                                    if (pcVar28 != null) {
                                        pcVar28.O(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 || !this.G) {
                                    long j16 = this.e;
                                    if (m(motionEvent.getX(), false) && Math.abs(this.e - j16) > 400) {
                                        this.c1 = j16;
                                        this.b1.d(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    this.P = false;
                                    this.G = false;
                                    pc pcVar29 = this.a;
                                    if (pcVar29 != null) {
                                        pcVar29.O(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.y1) - this.x1) / this.u1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                qc qcVar20 = this.h;
                                float f67 = qcVar20.h - qcVar20.g;
                                qcVar20.g = (1.0f - f67) * (clamp7 / getBaseDuration());
                                qc qcVar21 = this.h;
                                float f68 = qcVar21.g;
                                qcVar21.h = f67 + f68;
                                pc pcVar30 = this.a;
                                if (pcVar30 != null) {
                                    pcVar30.F(f68, true);
                                    this.a.a0(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.j1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    jVar = this.d1;
                    if (jVar != null) {
                    }
                    if (this.m1) {
                    }
                    z11 = false;
                    this.n1 = 1.0f;
                    this.m1 = z11;
                    this.l1 = z11;
                    this.f1 = -1L;
                    this.h1 = -1;
                    velocityTracker = this.p1;
                    if (velocityTracker != null) {
                    }
                }
                this.e1 = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.a0 == null || this.W) {
                this.a0 = new oc(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        a4.e eVar = new a4.e(11);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, eVar);
        qc qcVar = arrayList.isEmpty() ? null : (qc) arrayList.get(0);
        this.v = qcVar;
        if (qcVar != null) {
            long j3 = qcVar.f;
        }
    }

    public void setCollage(ArrayList<l8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        uc ucVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            qc qcVar = (qc) arrayList2.get(i10);
            if (qcVar != null && (ucVar = qcVar.c) != null) {
                ucVar.b();
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
            oc ocVar = (oc) arrayList3.get(i11);
            if (ocVar != null) {
                ocVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                l8 l8Var = arrayList.get(i12);
                if (l8Var.K) {
                    qc qcVar2 = new qc(this);
                    qcVar2.a = i12;
                    qcVar2.b = false;
                    qcVar2.d = l8Var.L.getAbsolutePath();
                    qcVar2.e = l8Var.h0;
                    qcVar2.f = l8Var.X;
                    qcVar2.i = l8Var.P;
                    qcVar2.g = l8Var.V;
                    qcVar2.h = l8Var.W;
                    qc.a(qcVar2, false);
                    qc.b(qcVar2);
                    arrayList2.add(qcVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(pc pcVar) {
        this.a = pcVar;
    }

    public void setMaxCount(int i10) {
        this.b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if ((r4 + 240) >= (r7 * r11.T)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if ((r4 + 240) >= (r6 * r11.T)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r4 + 240) >= (r7 * r0.h)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        r11.c1 = -1;
        r11.b1.d(1.0f, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j3) {
        qc qcVar = this.h;
        if (qcVar != null) {
            if (j3 < this.e) {
                float f7 = j3;
                long j10 = qcVar.e;
                if (f7 <= (j10 * qcVar.g) + 240.0f) {
                }
            }
        }
        if (this.N && !this.E && qcVar == null) {
            if (j3 < this.e) {
                float f10 = j3;
                long j11 = this.R;
                if (f10 <= (j11 * this.S) + 240.0f) {
                }
            }
        }
        if (this.E && qcVar == null) {
            if (j3 < this.e) {
                float f11 = j3;
                long j12 = this.H;
                if (f11 <= (j12 * this.S) + 240.0f) {
                }
            }
        }
        this.e = j3;
        invalidate();
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        qc qcVar = this.h;
        if (qcVar == null) {
            return;
        }
        qcVar.g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        qc qcVar = this.h;
        if (qcVar == null) {
            return;
        }
        qcVar.h = f7;
        invalidate();
    }
}
