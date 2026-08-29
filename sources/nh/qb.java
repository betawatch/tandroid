package nh;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.zz0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class qb extends View {
    public boolean A;
    public final TextPaint A0;
    public String B;
    public final RectF B0;
    public boolean C;
    public final Path C0;
    public long D;
    public final Paint D0;
    public long E;
    public final pb E0;
    public float F;
    public final Paint F0;
    public float G;
    public final Drawable G0;
    public float H;
    public final TextPaint H0;
    public ob I;
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
    public final lm0 S0;
    public jb T;
    public boolean T0;
    public int U;
    public final eg.k0 U0;
    public final org.telegram.ui.Components.d6 V;
    public long V0;
    public final org.telegram.ui.Components.d6 W;
    public long W0;
    public final org.telegram.ui.Components.d6 X0;
    public long Y0;
    public eg.z1 Z0;
    public kb a;
    public final org.telegram.ui.Components.d6 a0;
    public long a1;
    public Runnable b;
    public final org.telegram.ui.Components.d6 b0;
    public long b1;
    public int c;
    public final org.telegram.ui.Components.d6 c0;
    public float c1;
    public Runnable d;
    public final org.telegram.ui.Components.d6 d0;
    public int d1;
    public long e;
    public final org.telegram.ui.Components.d6 e0;
    public int e1;
    public long f;
    public boolean f0;
    public int f1;
    public final org.telegram.ui.Components.ga g0;
    public int g1;
    public lb h;
    public final org.telegram.ui.Components.ka h0;
    public boolean h1;
    public final org.telegram.ui.Components.ka i0;
    public boolean i1;
    public final org.telegram.ui.Components.ka j0;
    public float j1;
    public final RectF k0;
    public boolean k1;
    public final Path l0;
    public VelocityTracker l1;
    public final zz0 m0;
    public boolean m1;
    public int n;
    public final Drawable n0;
    public boolean n1;
    public final pb o0;
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
    public lb v;
    public final Paint v0;
    public int v1;
    public final Paint w;
    public final Paint w0;
    public final Path x;
    public final Paint x0;
    public final Path y;
    public final Paint y0;
    public final Paint z0;

    public qb(Context context, ViewGroup viewGroup, ta taVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new Paint(3);
        this.x = new Path();
        this.y = new Path();
        this.U = 1;
        jr jrVar = jr.h;
        this.V = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.W = new org.telegram.ui.Components.d6(this, 360L, jrVar);
        this.a0 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.b0 = new org.telegram.ui.Components.d6(this, 360L, jrVar);
        this.c0 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.d0 = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        this.e0 = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.f0 = true;
        this.k0 = new RectF();
        this.l0 = new Path();
        this.o0 = new pb();
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
        this.E0 = new pb();
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
        this.S0 = new lm0(getContext(), null);
        this.V0 = -1L;
        this.W0 = -1L;
        this.X0 = new org.telegram.ui.Components.d6(0.0f, this, 0L, 340L, jrVar);
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
        this.m0 = new zz0(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.n0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.G0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.g0 = gaVar;
        this.h0 = new org.telegram.ui.Components.ka(gaVar, this, 0, false);
        this.i0 = new org.telegram.ui.Components.ka(gaVar, this, 3, false);
        this.j0 = new org.telegram.ui.Components.ka(gaVar, this, 4, false);
        this.U0 = new eg.k0(this, viewGroup, c6Var, gaVar, taVar, 18);
    }

    public static void a(final qb qbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar, View view) {
        int i10;
        ArrayList arrayList = qbVar.s;
        int i11 = qbVar.f1;
        try {
            if (i11 == 2 && qbVar.J) {
                i7 i7Var = new i7(qbVar.getContext(), 0);
                i7Var.b = 0.0f;
                i7Var.c = 1.5f;
                i7Var.d(qbVar.R);
                final int i12 = 0;
                i7Var.h = new Utilities.Callback(qbVar) { // from class: nh.ib
                    public final /* synthetic */ qb b;

                    {
                        this.b = qbVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f9 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f9.floatValue();
                                qb qbVar2 = this.b;
                                qbVar2.R = floatValue;
                                kb kbVar = qbVar2.a;
                                if (kbVar != null) {
                                    kbVar.D(f9.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f9.floatValue();
                                qb qbVar3 = this.b;
                                qbVar3.H = floatValue2;
                                kb kbVar2 = qbVar3.a;
                                if (kbVar2 != null) {
                                    kbVar2.x(f9.floatValue());
                                    break;
                                }
                                break;
                            default:
                                qb qbVar4 = this.b;
                                qbVar4.h.i = f9.floatValue();
                                kb kbVar3 = qbVar4.a;
                                if (kbVar3 != null) {
                                    kbVar3.H0(f9.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(qbVar.getBaseDuration(), qbVar.getMaxScrollDuration());
                int i13 = qbVar.r1;
                int i14 = qbVar.u1;
                int i15 = qbVar.t1;
                float min2 = Math.min((i13 - i14) - i15, ((((AndroidUtilities.lerp(qbVar.P, 1.0f, qbVar.b0.c) * qbVar.N) + (qbVar.M - qbVar.f)) / min) * qbVar.q1) + i14 + i15);
                j70 F = j70.F(viewGroup, c6Var, qbVar);
                F.q(i7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new hb(qbVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(qbVar.r1 - min2)) + AndroidUtilities.dp(18.0f), qbVar.B0.top);
                F.Z();
                F.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && qbVar.A) {
                i7 i7Var2 = new i7(qbVar.getContext(), 0);
                i7Var2.b = 0.0f;
                i7Var2.c = 1.5f;
                i7Var2.d(qbVar.H);
                final int i16 = 1;
                i7Var2.h = new Utilities.Callback(qbVar) { // from class: nh.ib
                    public final /* synthetic */ qb b;

                    {
                        this.b = qbVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f9 = (Float) obj;
                        switch (i16) {
                            case 0:
                                float floatValue = f9.floatValue();
                                qb qbVar2 = this.b;
                                qbVar2.R = floatValue;
                                kb kbVar = qbVar2.a;
                                if (kbVar != null) {
                                    kbVar.D(f9.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f9.floatValue();
                                qb qbVar3 = this.b;
                                qbVar3.H = floatValue2;
                                kb kbVar2 = qbVar3.a;
                                if (kbVar2 != null) {
                                    kbVar2.x(f9.floatValue());
                                    break;
                                }
                                break;
                            default:
                                qb qbVar4 = this.b;
                                qbVar4.h.i = f9.floatValue();
                                kb kbVar3 = qbVar4.a;
                                if (kbVar3 != null) {
                                    kbVar3.H0(f9.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(qbVar.getBaseDuration(), qbVar.getMaxScrollDuration());
                int i17 = qbVar.r1;
                int i18 = qbVar.u1;
                int i19 = qbVar.t1;
                float min4 = Math.min((i17 - i18) - i19, ((((AndroidUtilities.lerp(qbVar.G, 1.0f, qbVar.W.c) * qbVar.D) + (qbVar.E - qbVar.f)) / min3) * qbVar.q1) + i18 + i19);
                j70 F2 = j70.F(viewGroup, c6Var, qbVar);
                F2.q(i7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new hb(qbVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(qbVar.r1 - min4)) + AndroidUtilities.dp(18.0f), qbVar.t0.top);
                F2.Z();
                F2.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && qbVar.h != null) {
                i7 i7Var3 = new i7(qbVar.getContext(), 0);
                i7Var3.b = 0.0f;
                i7Var3.c = 1.5f;
                i7Var3.d(qbVar.h.i);
                final int i20 = 2;
                i7Var3.h = new Utilities.Callback(qbVar) { // from class: nh.ib
                    public final /* synthetic */ qb b;

                    {
                        this.b = qbVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f9 = (Float) obj;
                        switch (i20) {
                            case 0:
                                float floatValue = f9.floatValue();
                                qb qbVar2 = this.b;
                                qbVar2.R = floatValue;
                                kb kbVar = qbVar2.a;
                                if (kbVar != null) {
                                    kbVar.D(f9.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f9.floatValue();
                                qb qbVar3 = this.b;
                                qbVar3.H = floatValue2;
                                kb kbVar2 = qbVar3.a;
                                if (kbVar2 != null) {
                                    kbVar2.x(f9.floatValue());
                                    break;
                                }
                                break;
                            default:
                                qb qbVar4 = this.b;
                                qbVar4.h.i = f9.floatValue();
                                kb kbVar3 = qbVar4.a;
                                if (kbVar3 != null) {
                                    kbVar3.H0(f9.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                j70 F3 = j70.F(viewGroup, c6Var, qbVar);
                F3.q(i7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), qbVar.p0.top);
                F3.Z();
                F3.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            } else {
                if (i11 != 3 || (i10 = qbVar.g1) < 0 || i10 >= arrayList.size()) {
                    return;
                }
                lb lbVar = (lb) arrayList.get(qbVar.g1);
                i7 i7Var4 = new i7(qbVar.getContext(), 0);
                i7Var4.b = 0.0f;
                i7Var4.c = 1.5f;
                i7Var4.d(lbVar.i);
                i7Var4.h = new ih.b1(16, qbVar, lbVar);
                j70 F4 = j70.F(viewGroup, c6Var, qbVar);
                F4.q(i7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), lbVar.j.top);
                F4.Z();
                F4.R(gaVar, -view.getX(), -view.getY());
                qbVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.b0.e(this.L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        lb lbVar = this.h;
        if (lbVar != null) {
            return Math.max(1L, lbVar.e);
        }
        lb lbVar2 = this.v;
        return lbVar2 != null ? Math.max(1L, lbVar2.e) : this.A ? Math.max(1L, this.D) : Math.max(1L, this.N);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f9 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f9 > 0.0f) {
                f9 += AndroidUtilities.dp(4.0f);
            }
            f9 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((lb) arrayList.get(i10)).k.c);
        }
        return f9;
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
        lb lbVar;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.e, getBaseDuration(), 0L);
        lb lbVar2 = this.v;
        float f9 = min;
        float f10 = (this.q1 * (((clamp + (lbVar2 != null ? (lbVar2.g * lbVar2.e) + lbVar2.f : this.h == null ? this.M : 0L)) - this.f) / f9)) + this.u1 + this.t1;
        if (!this.T0 && x4 >= f10 - AndroidUtilities.dp(12.0f) && x4 <= f10 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z11 = this.h != null && y8 > (((float) (this.s1 - this.v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        ArrayList arrayList = this.s;
        boolean z12 = !arrayList.isEmpty() && y8 > ((((((float) (this.s1 - this.v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y8 < (((float) (this.s1 - this.v1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (this.A) {
            if (y8 > (((((((this.s1 - this.v1) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
                if (y8 < ((((this.s1 - this.v1) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z10 = true;
                    if (z12) {
                        i10 = 1;
                        if (z11) {
                            float f11 = this.u1 + this.t1;
                            lb lbVar3 = this.h;
                            float f12 = lbVar3.g;
                            float f13 = lbVar3.e;
                            float f14 = this.f;
                            float f15 = this.q1;
                            float f16 = ((((f12 * f13) - f14) / f9) * f15) + f11;
                            float f17 = ((((lbVar3.h * f13) - f14) / f9) * f15) + f11;
                            if (this.T0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x4 < f16 - AndroidUtilities.dp(15.0f) || x4 > f17 + AndroidUtilities.dp(15.0f)) {
                                    return i10;
                                }
                                return 4;
                            }
                            if (x4 >= f16 - AndroidUtilities.dp(15.0f) && x4 <= AndroidUtilities.dp(5.0f) + f16) {
                                return 2;
                            }
                            if (x4 >= f17 - AndroidUtilities.dp(5.0f) && x4 <= AndroidUtilities.dp(15.0f) + f17) {
                                return 3;
                            }
                            if (x4 >= f16 && x4 <= f17) {
                                lb lbVar4 = this.h;
                                if (lbVar4.g > 0.01f || lbVar4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z10) {
                            float f18 = this.u1 + this.t1;
                            float f19 = this.E;
                            float f20 = this.F;
                            float f21 = this.D;
                            float f22 = this.f;
                            float f23 = this.q1;
                            float f24 = (((((f20 * f21) + f19) - f22) / f9) * f23) + f18;
                            float f25 = (((((this.G * f21) + f19) - f22) / f9) * f23) + f18;
                            if (this.C || this.h == null) {
                                if (x4 >= f24 - AndroidUtilities.dp(15.0f) && x4 <= AndroidUtilities.dp(5.0f) + f24) {
                                    return 10;
                                }
                                if (x4 >= f25 - AndroidUtilities.dp(5.0f) && x4 <= AndroidUtilities.dp(15.0f) + f25) {
                                    return 11;
                                }
                                if (x4 >= f24 && x4 <= f25) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f26 = this.u1 + this.t1;
                                long j10 = this.E;
                                long j11 = this.f;
                                float f27 = this.q1;
                                float f28 = (((j10 - j11) / f9) * f27) + f26;
                                f25 = u3.c.c((j10 + this.D) - j11, f9, f27, f26);
                                f24 = f28;
                            }
                            if (x4 >= f24 && x4 <= f25) {
                                return 9;
                            }
                        } else if (this.J) {
                            float f29 = this.u1 + this.t1;
                            float f30 = this.M;
                            float f31 = this.O;
                            float f32 = this.N;
                            float f33 = this.f;
                            float f34 = this.q1;
                            float f35 = (((((f31 * f32) + f30) - f33) / f9) * f34) + f29;
                            float f36 = (((((this.P * f32) + f30) - f33) / f9) * f34) + f29;
                            if (this.L || (this.h == null && !this.A)) {
                                if (x4 >= f35 - AndroidUtilities.dp(15.0f) && x4 <= AndroidUtilities.dp(5.0f) + f35) {
                                    return 6;
                                }
                                if (x4 >= f36 - AndroidUtilities.dp(5.0f) && x4 <= AndroidUtilities.dp(15.0f) + f36) {
                                    return 7;
                                }
                                if (x4 >= f35 && x4 <= f36) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f37 = this.u1 + this.t1;
                                long j12 = this.M;
                                long j13 = this.f;
                                float f38 = this.q1;
                                float f39 = (((j12 - j13) / f9) * f38) + f37;
                                f36 = u3.c.c((j12 + this.N) - j13, f9, f38, f37);
                                f35 = f39;
                            }
                            if (x4 >= f35 && x4 <= f36) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            lb lbVar5 = (lb) arrayList.get(i11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(lbVar5.j);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x4, y8)) {
                                float f40 = this.u1 + this.t1;
                                float f41 = lbVar5.f;
                                float f42 = this.q1;
                                float f43 = ((f41 / f9) * f42) + f40;
                                float f44 = lbVar5.g;
                                float f45 = lbVar5.e;
                                float f46 = ((((f44 * f45) + f41) / f9) * f42) + f40;
                                float f47 = ((((lbVar5.h * f45) + f41) / f9) * f42) + f40;
                                float c3 = u3.c.c(r6 + r11, f9, f42, f40);
                                this.e1 = i11;
                                if (x4 >= f46 - AndroidUtilities.dp(15.0f) && x4 <= AndroidUtilities.dp(5.0f) + f46) {
                                    return 13;
                                }
                                if (x4 >= f47 - AndroidUtilities.dp(5.0f) && x4 <= AndroidUtilities.dp(15.0f) + f47) {
                                    return 14;
                                }
                                if (x4 < f46 || x4 > f47 || (lbVar5.g <= 0.01f && lbVar5.h >= 0.99f)) {
                                    return (x4 < f43 || x4 > c3) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i10 = 1;
                    }
                    lbVar = this.h;
                    if (lbVar != null || lbVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        lbVar = this.h;
        return lbVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        lm0 lm0Var = this.S0;
        if (!lm0Var.b()) {
            if (this.n1) {
                this.n1 = false;
                kb kbVar = this.a;
                if (kbVar != null) {
                    kbVar.s0(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = lm0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.m1) {
            this.f = (long) Math.max(0.0f, (((i10 - this.u1) - this.t1) / this.q1) * min);
        } else {
            if (!this.L) {
                lm0Var.a();
                return;
            }
            int i11 = this.u1;
            int i12 = this.t1;
            float f9 = this.q1;
            float f10 = min;
            h(((((i10 - i11) - i12) / f9) * f10) - ((((this.o1 - i11) - i12) / f9) * f10));
        }
        invalidate();
        this.o1 = i10;
    }

    public final void d(Canvas canvas, float f9, float f10, long j10, float f11) {
        float f12;
        if (this.T0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(j10, getBaseDuration(), 0L);
        lb lbVar = this.v;
        if (lbVar != null) {
            f12 = (lbVar.g * lbVar.e) + lbVar.f;
        } else {
            f12 = this.h == null ? this.M : 0L;
        }
        float f13 = (this.q1 * (((clamp + f12) - this.f) / min)) + this.u1 + this.t1;
        float f14 = (1.0f - f11) * (((f10 - f9) / 2.0f) / 2.0f);
        float f15 = f9 + f14;
        float f16 = f10 - f14;
        Paint paint = this.y0;
        paint.setAlpha((int) (38.0f * f11));
        int i10 = (int) (f11 * 255.0f);
        Paint paint2 = this.z0;
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
        long j10;
        Paint paint;
        ArrayList arrayList;
        float f9;
        org.telegram.ui.Components.ka kaVar;
        RectF rectF2;
        long j11;
        int i10;
        lb lbVar;
        lb lbVar2;
        int i11;
        float f10;
        float max;
        Canvas canvas2;
        long j12;
        float f11;
        boolean z10;
        float f12;
        float f13;
        RectF rectF3;
        ArrayList arrayList2;
        long j13;
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
        lb lbVar3;
        float f35;
        float f36;
        float lerp;
        float y8;
        float f37;
        RectF rectF4;
        float f38;
        float f39;
        float f40;
        float dpf2;
        float f41;
        float f42;
        float c3;
        float f43;
        float f44;
        long j14;
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
        float c6;
        float f51;
        float f52;
        float f53;
        int i16;
        long j15;
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
        org.telegram.ui.Components.ka kaVar2;
        qb qbVar = this;
        RectF rectF6 = qbVar.p0;
        RectF rectF7 = qbVar.t0;
        Path path2 = qbVar.s0;
        ArrayList arrayList20 = qbVar.r;
        Drawable drawable = qbVar.n0;
        org.telegram.ui.Components.ga gaVar = qbVar.g0;
        RectF rectF8 = qbVar.B0;
        ArrayList arrayList21 = qbVar.s;
        RectF rectF9 = qbVar.k0;
        org.telegram.ui.Components.ka kaVar3 = qbVar.h0;
        Paint c10 = kaVar3.c(1.0f);
        float e10 = qbVar.e0.e(qbVar.f0);
        long min = Math.min(qbVar.getBaseDuration(), qbVar.getMaxScrollDuration());
        if (e10 < 1.0f) {
            rectF9.set(qbVar.u1, (qbVar.s1 - qbVar.v1) - AndroidUtilities.dp(28.0f), qbVar.r1 - qbVar.u1, qbVar.s1 - qbVar.v1);
            qbVar.l0.rewind();
            qbVar.l0.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - e10) * 255.0f), 31);
            canvas.clipPath(qbVar.l0);
            if (gaVar.c()) {
                kaVar3.a(canvas);
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
            if (arrayList20.isEmpty() || !gaVar.c()) {
                paint4 = paint3;
                rectF = rectF6;
                kaVar2 = kaVar3;
                j10 = min;
                if (!arrayList20.isEmpty()) {
                    Paint c11 = qbVar.j0.c(0.4f);
                    if (c11 == null) {
                        c11 = qbVar.D0;
                        c11.setAlpha(64);
                    }
                    qbVar.o0.a((((qbVar.M - qbVar.f) / j10) * qbVar.q1) + qbVar.u1 + qbVar.t1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), qbVar.d0.d(pb.c(arrayList20), false), rectF9.bottom, arrayList20);
                    canvas.drawPath(qbVar.o0, c11);
                    float h = ((qbVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - h);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.b.f(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.b.y(2, centerY, drawable));
                    drawable.setAlpha(191);
                    drawable.draw(canvas);
                    zz0 zz0Var = qbVar.m0;
                    float centerX2 = (rectF9.centerX() - h) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
                    float f63 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    kaVar = kaVar2;
                    f9 = 0.4f;
                    zz0Var.c(centerX2, f63, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float d11 = qbVar.d0.d(pb.c(arrayList20), false);
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j10 = min;
                kaVar2 = kaVar3;
                qbVar.o0.a((((qbVar.M - qbVar.f) / min) * qbVar.q1) + qbVar.u1 + qbVar.t1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), d11, rectF9.bottom, arrayList20);
                canvas.saveLayerAlpha(rectF9, 102, 31);
                canvas.clipPath(qbVar.o0);
                qbVar.j0.a(canvas);
                canvas.restore();
            }
            float h10 = ((qbVar.m0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - h10);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.b.f(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.b.y(2, centerY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            zz0 zz0Var2 = qbVar.m0;
            float centerX22 = (rectF9.centerX() - h10) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
            float f632 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            kaVar = kaVar2;
            f9 = 0.4f;
            zz0Var2.c(centerX22, f632, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c10;
            arrayList = arrayList21;
            f9 = 0.4f;
            kaVar = kaVar3;
            rectF2 = rectF8;
        }
        if (e10 > 0.0f) {
            if (e10 < 1.0f) {
                canvas2 = canvas;
                j12 = j10;
                f11 = 0.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, qbVar.getWidth(), qbVar.getHeight(), (int) (e10 * 255.0f), 31);
                z10 = true;
            } else {
                canvas2 = canvas;
                j12 = j10;
                f11 = 0.0f;
                z10 = false;
            }
            lb lbVar4 = qbVar.h;
            float f64 = lbVar4 != null ? 1.0f : 0.0f;
            float e11 = lbVar4 != null ? lbVar4.k.e((qbVar.L || qbVar.C) ? false : true) : 0.0f;
            float f65 = qbVar.s1 - qbVar.v1;
            float dp = AndroidUtilities.dp(4.0f);
            if (qbVar.h != null) {
                canvas2.save();
                float videoHeight = qbVar.getVideoHeight();
                lb lbVar5 = qbVar.h;
                float f66 = lbVar5.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j16 = lbVar5.e;
                float f67 = j16;
                float x4 = com.google.android.recaptcha.internal.a.x(f66, f67, e11, f11);
                float x10 = com.google.android.recaptcha.internal.a.x(lbVar5.h, f67, e11, f11);
                if (j16 <= 0) {
                    f12 = e11;
                    f59 = f64;
                    j13 = j12;
                    f60 = 0.0f;
                    f58 = 0.0f;
                    f14 = dp;
                } else {
                    f58 = 0.0f;
                    f12 = e11;
                    f59 = f64;
                    j13 = j12;
                    f14 = dp;
                    f60 = (qbVar.u1 + qbVar.t1) - (qbVar.q1 * (qbVar.f / j13));
                }
                f18 = x4;
                float f68 = qbVar.t1;
                float f69 = f60 - f68;
                if (j16 <= 0) {
                    f61 = f68;
                    f17 = x10;
                    f62 = 0.0f;
                } else {
                    f61 = f68;
                    f17 = x10;
                    f62 = (((j16 - qbVar.f) / j13) * qbVar.q1) + qbVar.u1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f69, f65 - videoHeight, f62 + f61, f65);
                float f70 = f65 - ((f14 * f59) + videoHeight);
                float f71 = (rectF10.top * f12) + f58;
                f16 = (rectF10.bottom * f12) + f58;
                qbVar.r0.rewind();
                qbVar.r0.addRoundRect(rectF10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(qbVar.r0);
                ob obVar = qbVar.h.c;
                if (obVar != null) {
                    int i19 = obVar.f;
                    float f72 = i19;
                    f19 = f71;
                    int max2 = (int) Math.max(0.0d, Math.floor((f69 - qbVar.u1) / f72));
                    f13 = f59;
                    int min2 = (int) Math.min(qbVar.h.c.c, Math.ceil(((r6 - f69) - qbVar.u1) / f72) + 1.0d);
                    int i20 = (int) rectF10.top;
                    arrayList15 = qbVar.h.c.d;
                    boolean z15 = arrayList15.size() >= min2;
                    boolean z16 = (i19 == 0 || !z15 || qbVar.h.b) ? false : true;
                    if (z16) {
                        int i21 = max2;
                        while (true) {
                            arrayList18 = qbVar.h.c.d;
                            if (i21 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = qbVar.h.c.d;
                            if (((nb) arrayList19.get(i21)).a == null) {
                                z16 = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (!z16) {
                        if (gaVar.c()) {
                            kaVar.a(canvas2);
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
                            arrayList17 = qbVar.h.c.d;
                            nb nbVar = (nb) arrayList17.get(i22);
                            if (nbVar.a != null) {
                                i18 = min2;
                                z14 = z15;
                                qbVar.q0.setAlpha((int) (nbVar.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(nbVar.a, f73, i20 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), qbVar.q0);
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
                        qbVar.h.c.c();
                    }
                } else {
                    f19 = f71;
                    f13 = f59;
                }
                path2.rewind();
                if (!qbVar.T0) {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    int i23 = qbVar.u1;
                    int i24 = qbVar.t1;
                    float f74 = i23 + i24;
                    lb lbVar6 = qbVar.h;
                    float f75 = lbVar6.g;
                    int i25 = i24;
                    float f76 = lbVar6.e;
                    float f77 = qbVar.f;
                    float f78 = (f75 * f76) - f77;
                    float f79 = j13;
                    float f80 = qbVar.q1;
                    float f81 = (((f78 / f79) * f80) + f74) - (f75 <= f58 ? i25 : 0);
                    float f82 = qbVar.s1 - qbVar.v1;
                    float f83 = f82 - videoHeight;
                    float f84 = lbVar6.h;
                    float f85 = ((((f76 * f84) - f77) / f79) * f80) + f74;
                    if (f84 < 1.0f) {
                        i25 = 0;
                    }
                    rectF11.set(f81, f83, f85 + i25, f82);
                    path2.addRoundRect(rectF11, qbVar.p1, Path.Direction.CW);
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
                j13 = j12;
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
                qbVar.getCollageHeight();
                float f86 = f65;
                int i26 = 0;
                while (i26 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    lb lbVar7 = (lb) arrayList22.get(i26);
                    org.telegram.ui.Components.d6 d6Var = lbVar7.k;
                    RectF rectF12 = lbVar7.j;
                    float f87 = f15;
                    float e12 = d6Var.e((qbVar.L || qbVar.C || qbVar.n != i26) ? false : true);
                    if (lbVar7 != qbVar.v) {
                        i15 = i26;
                        arrayList9 = arrayList22;
                        float f88 = j13;
                        f49 = f16;
                        f50 = ((((AndroidUtilities.lerp(lbVar7.g, 0.0f, e12) * lbVar7.e) + (lbVar7.f - qbVar.f)) / f88) * qbVar.q1) + qbVar.u1 + qbVar.t1;
                        rectF5 = rectF7;
                        c6 = (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(lbVar7.h, 1.0f, e12), lbVar7.e, lbVar7.f - qbVar.f, f88) * qbVar.q1) + qbVar.u1 + qbVar.t1;
                        path = path2;
                    } else {
                        i15 = i26;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f49 = f16;
                        float f89 = qbVar.u1 + qbVar.t1;
                        float f90 = j13;
                        float f91 = (lbVar7.f - qbVar.f) / f90;
                        float f92 = qbVar.q1;
                        f50 = (f91 * f92) + f89;
                        path = path2;
                        c6 = u3.c.c(r8 + lbVar7.e, f90, f92, f89);
                    }
                    float f93 = f50;
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), e12);
                    float f94 = qbVar.t1;
                    rectF12.set(f93 - f94, f86 - lerp2, c6 + f94, f86);
                    f19 = (rectF12.top * e12) + f19;
                    f16 = (rectF12.bottom * e12) + f49;
                    float f95 = lbVar7.f;
                    float f96 = lbVar7.g;
                    float f97 = f86;
                    float f98 = lbVar7.e;
                    f18 = (((f96 * f98) + f95) * e12) + f18;
                    f17 = (((lbVar7.h * f98) + f95) * e12) + f17;
                    qbVar.x.rewind();
                    qbVar.x.addRoundRect(rectF12, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(qbVar.x);
                    ob obVar2 = lbVar7.c;
                    if (obVar2 != null) {
                        long j17 = lbVar7.e;
                        f51 = lerp2;
                        if (j17 <= 0) {
                            j15 = j17;
                            f54 = 0.0f;
                        } else {
                            j15 = j17;
                            f54 = qbVar.u1 + qbVar.t1 + (((lbVar7.f - qbVar.f) / j13) * qbVar.q1);
                        }
                        float f99 = qbVar.t1;
                        float f100 = f54 - f99;
                        if (j17 <= 0) {
                            f55 = f99;
                            f56 = 0.0f;
                        } else {
                            f55 = f99;
                            f56 = ((((lbVar7.f + j15) - qbVar.f) / j13) * qbVar.q1) + qbVar.u1 + r7;
                        }
                        float f101 = f56 + f55;
                        int i27 = obVar2.f;
                        float f102 = i27;
                        int max3 = (int) Math.max(0.0d, Math.floor((f100 - ((((lbVar7.f - qbVar.f) / j13) * qbVar.q1) + (qbVar.u1 + qbVar.t1))) / f102));
                        int min3 = (int) Math.min(lbVar7.c.c, Math.ceil((f101 - f100) / f102) + 1.0d);
                        int i28 = (int) rectF12.top;
                        arrayList10 = lbVar7.c.d;
                        boolean z17 = arrayList10.size() >= min3;
                        if (z17) {
                            for (int i29 = max3; i29 < Math.min(arrayList13.size(), min3); i29++) {
                                arrayList14 = lbVar7.c.d;
                                if (((nb) arrayList14.get(i29)).a == null) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = z17;
                        if (!z12) {
                            if (gaVar.c()) {
                                kaVar.a(canvas2);
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
                                arrayList12 = lbVar7.c.d;
                                nb nbVar2 = (nb) arrayList12.get(max3);
                                int i30 = min3;
                                if (nbVar2.a != null) {
                                    z13 = z17;
                                    i17 = max3;
                                    f57 = f97;
                                    qbVar.w.setAlpha((int) (nbVar2.b.d(1.0f, false) * 255.0f));
                                    canvas2.drawBitmap(nbVar2.a, f103, i28 - ((int) ((r4.getHeight() - f51) / 2.0f)), qbVar.w);
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
                            lbVar7.c.c();
                        }
                    } else {
                        f51 = lerp2;
                        f52 = f97;
                    }
                    qbVar.y.rewind();
                    if (!qbVar.T0) {
                        RectF rectF13 = AndroidUtilities.rectTmp;
                        int i31 = qbVar.u1;
                        int i32 = qbVar.t1;
                        float f104 = i31 + i32;
                        float f105 = lbVar7.g;
                        float f106 = lbVar7.e;
                        float f107 = qbVar.f;
                        float f108 = (f105 * f106) - f107;
                        float f109 = lbVar7.f;
                        float f110 = j13;
                        float f111 = qbVar.q1;
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
                        float f115 = lbVar7.h;
                        rectF13.set(f113, f114, (((((f106 * f115) - f107) + f109) / f110) * f53) + f104 + (f115 >= 1.0f ? i32 : 0), rectF12.bottom);
                        qbVar.y.addRoundRect(rectF13, qbVar.p1, Path.Direction.CW);
                        canvas2.clipPath(qbVar.y, Region.Op.DIFFERENCE);
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
            float e13 = qbVar.V.e(qbVar.A);
            float e14 = qbVar.W.e(qbVar.A && qbVar.C);
            float roundHeight = qbVar.getRoundHeight() * e13;
            float f116 = ((qbVar.h == null && !qbVar.J && arrayList3.isEmpty()) ? 1.0f : e14) * e13;
            if (e13 > 0.0f) {
                long j18 = qbVar.E;
                float f117 = j18;
                float f118 = qbVar.F;
                float f119 = qbVar.D;
                f18 = (((f118 * f119) + f117) * f116) + f18;
                f17 = (((qbVar.G * f119) + f117) * f116) + f17;
                if (qbVar.h != null) {
                    float f120 = j13;
                    float lerp3 = ((((qbVar.D * AndroidUtilities.lerp(f118, 0.0f, e14)) + (j18 - qbVar.f)) / f120) * qbVar.q1) + qbVar.u1 + qbVar.t1;
                    f42 = f16;
                    f22 = f21;
                    c3 = (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(qbVar.G, 1.0f, e14), qbVar.D, qbVar.E - qbVar.f, f120) * qbVar.q1) + qbVar.u1 + qbVar.t1;
                    f43 = lerp3;
                } else {
                    f22 = f21;
                    f42 = f16;
                    float f121 = qbVar.u1 + qbVar.t1;
                    long j19 = j18 - qbVar.f;
                    float f122 = j13;
                    float f123 = qbVar.q1;
                    float f124 = ((j19 / f122) * f123) + f121;
                    c3 = u3.c.c(j19 + r6, f122, f123, f121);
                    f43 = f124;
                }
                float f125 = qbVar.t1;
                rectF14.set(f43 - f125, f65 - roundHeight, c3 + f125, f65);
                float f126 = f65 - ((f14 * e13) + roundHeight);
                f19 = (rectF14.top * f116) + f19;
                f16 = (rectF14.bottom * f116) + f42;
                qbVar.u0.rewind();
                qbVar.u0.addRoundRect(rectF14, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(qbVar.u0);
                ob obVar3 = qbVar.I;
                if (obVar3 != null) {
                    float f127 = e14;
                    long j20 = qbVar.D;
                    if (j20 <= 0) {
                        f44 = f126;
                        j14 = j20;
                        f45 = 0.0f;
                    } else {
                        f44 = f126;
                        j14 = j20;
                        f45 = qbVar.u1 + qbVar.t1 + (((qbVar.E - qbVar.f) / j13) * qbVar.q1);
                    }
                    float f128 = qbVar.t1;
                    float f129 = f45 - f128;
                    if (j20 <= 0) {
                        f46 = f128;
                        f47 = 0.0f;
                    } else {
                        f46 = f128;
                        f47 = qbVar.u1 + r10 + ((((qbVar.E + j14) - qbVar.f) / j13) * qbVar.q1);
                    }
                    float f130 = f47 + f46;
                    int i33 = obVar3.f;
                    float f131 = i33;
                    float f132 = f129;
                    int max4 = (int) Math.max(0.0d, Math.floor((f129 - (qbVar.h != null ? (((qbVar.E - qbVar.f) / j13) * qbVar.q1) + (qbVar.u1 + qbVar.t1) : qbVar.u1)) / f131));
                    int min4 = (int) Math.min(qbVar.I.c, Math.ceil((f130 - f132) / f131) + 1.0d);
                    int i34 = (int) rectF14.top;
                    arrayList4 = qbVar.I.d;
                    boolean z18 = arrayList4.size() >= min4;
                    if (z18) {
                        int i35 = max4;
                        i12 = i35;
                        while (i35 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = qbVar.I.d;
                            if (((nb) arrayList8.get(i35)).a == null) {
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
                        if (gaVar.c()) {
                            kaVar.a(canvas2);
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
                            arrayList6 = qbVar.I.d;
                            nb nbVar3 = (nb) arrayList6.get(i36);
                            int i37 = i36;
                            if (nbVar3.a != null) {
                                i13 = min4;
                                i14 = i34;
                                f48 = f127;
                                qbVar.q0.setAlpha((int) (nbVar3.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(nbVar3.a, f132, i14 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), qbVar.q0);
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
                        qbVar.I.c();
                    }
                } else {
                    f44 = f126;
                    f23 = e14;
                }
                path3.rewind();
                RectF rectF15 = AndroidUtilities.rectTmp;
                int i38 = qbVar.u1;
                int i39 = qbVar.t1;
                float f133 = i38 + i39;
                float f134 = qbVar.F;
                float f135 = qbVar.D;
                float f136 = f134 * f135;
                float f137 = qbVar.f;
                float f138 = f136 - f137;
                float f139 = qbVar.E;
                float f140 = j13;
                float f141 = (f138 + f139) / f140;
                float f142 = qbVar.q1;
                float f143 = (1.0f - f23) * i39;
                float f144 = (((f141 * f142) + f133) - (f134 <= 0.0f ? i39 : 0)) - f143;
                float f145 = rectF14.top;
                float f146 = qbVar.G;
                float f147 = (((((f135 * f146) - f137) + f139) / f140) * f142) + f133;
                if (f146 < 1.0f) {
                    i39 = 0;
                }
                rectF15.set(f144, f145, f147 + i39 + f143, rectF14.bottom);
                path3.addRoundRect(rectF15, qbVar.p1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f65 = f44;
            } else {
                f22 = f21;
                f23 = e14;
            }
            float e15 = qbVar.a0.e(qbVar.J);
            float e16 = qbVar.b0.e(qbVar.J && qbVar.L);
            float audioHeight = qbVar.getAudioHeight() * e15;
            float f148 = ((qbVar.h == null && !qbVar.A && arrayList3.isEmpty()) ? 1.0f : e16) * e15;
            if (e15 > 0.0f) {
                float f149 = qbVar.M;
                float f150 = qbVar.O;
                float f151 = qbVar.N;
                f18 = (((f150 * f151) + f149) * f148) + f18;
                f17 = (((qbVar.P * f151) + f149) * f148) + f17;
                Paint c12 = qbVar.i0.c(e15);
                canvas2.save();
                if (qbVar.h == null && !qbVar.A && arrayList3.isEmpty()) {
                    float f152 = qbVar.u1 + qbVar.t1;
                    f36 = f16;
                    float f153 = qbVar.M - qbVar.f;
                    float f154 = j13;
                    float f155 = qbVar.q1;
                    float f156 = ((f153 / f154) * f155) + f152;
                    paint2 = paint;
                    f35 = f148;
                    y8 = u3.c.c(r10 + qbVar.N, f154, f155, f152);
                    lerp = f156;
                } else {
                    f35 = f148;
                    f36 = f16;
                    paint2 = paint;
                    float f157 = j13;
                    lerp = ((((AndroidUtilities.lerp(qbVar.O, 0.0f, e16) * qbVar.N) + (qbVar.M - qbVar.f)) / f157) * qbVar.q1) + qbVar.u1 + qbVar.t1;
                    y8 = qbVar.u1 + qbVar.t1 + (com.google.android.recaptcha.internal.a.y(AndroidUtilities.lerp(qbVar.P, 1.0f, e16), qbVar.N, qbVar.M - qbVar.f, f157) * qbVar.q1);
                }
                float f158 = y8;
                float f159 = qbVar.t1;
                RectF rectF16 = rectF3;
                rectF16.set(lerp - f159, f65 - audioHeight, f158 + f159, f65);
                f19 = (rectF16.top * f35) + f19;
                float f160 = (rectF16.bottom * f35) + f36;
                qbVar.C0.rewind();
                qbVar.C0.addRoundRect(rectF16, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(qbVar.C0);
                if (gaVar != null && gaVar.c()) {
                    kaVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e15, 855638016));
                } else if (c12 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e15, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c12);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.l1(e15, 855638016));
                }
                if (qbVar.T == null || gaVar == null || !gaVar.c()) {
                    f37 = e16;
                    rectF4 = rectF16;
                    if (qbVar.T != null && c12 != null) {
                        Paint c13 = qbVar.j0.c(e15 * f9);
                        if (c13 == null) {
                            c13 = qbVar.D0;
                            c13.setAlpha((int) (64.0f * e15));
                        }
                        float d12 = qbVar.c0.d(qbVar.T.e, !qbVar.Q);
                        jb jbVar = qbVar.T;
                        qbVar.Q = jbVar.c > 0;
                        long j21 = j13;
                        qbVar.E0.b((((qbVar.M - qbVar.f) / j13) * qbVar.q1) + qbVar.u1 + qbVar.t1, lerp, f158, f37, j21, audioHeight, d12, rectF4.bottom, jbVar);
                        f38 = f37;
                        j11 = j21;
                        canvas2.drawPath(qbVar.E0, c13);
                        if (f38 >= 1.0f) {
                            int i40 = qbVar.u1;
                            float f161 = qbVar.t1 + i40;
                            float f162 = qbVar.M - qbVar.f;
                            float f163 = qbVar.O;
                            float f164 = qbVar.N;
                            float f165 = j11;
                            float f166 = qbVar.q1;
                            float f167 = ((((f163 * f164) + f162) / f165) * f166) + f161;
                            float f168 = ((((qbVar.P * f164) + f162) / f165) * f166) + f161;
                            float min5 = (Math.min(qbVar.r1 - qbVar.u1, f168) + Math.max(i40, f167)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(qbVar.r1 - qbVar.u1, f168) - Math.max(qbVar.u1, f167)) - AndroidUtilities.dp(24.0f));
                            float dpf22 = AndroidUtilities.dpf2(13.0f);
                            if (qbVar.I0 == null && qbVar.M0 == null) {
                                dpf2 = 0.0f;
                                f40 = 13.0f;
                            } else {
                                f40 = 13.0f;
                                dpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + qbVar.J0 + qbVar.N0;
                            }
                            float f169 = dpf22 + dpf2;
                            boolean z19 = f169 < max5;
                            float min6 = min5 - (Math.min(f169, max5) / 2.0f);
                            qbVar.G0.setBounds((int) min6, (int) (centerY3 - (AndroidUtilities.dp(f40) / 2.0f)), (int) (AndroidUtilities.dp(f40) + min6), (int) ((AndroidUtilities.dp(f40) / 2.0f) + centerY3));
                            float f170 = 1.0f - f38;
                            float f171 = f170 * 255.0f;
                            qbVar.G0.setAlpha((int) f171);
                            qbVar.G0.draw(canvas2);
                            float dpf23 = AndroidUtilities.dpf2(16.11f) + min6;
                            f25 = e15;
                            f39 = f160;
                            f26 = f12;
                            d = 0.0d;
                            f24 = f38;
                            f27 = f13;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, qbVar.r1, qbVar.s1, 255, 31);
                            float min7 = Math.min(f168, qbVar.r1) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf23, 0.0f, min7, qbVar.s1);
                            if (qbVar.I0 != null) {
                                canvas2.save();
                                canvas2.translate(dpf23 - qbVar.K0, centerY3 - (qbVar.I0.getHeight() / 2.0f));
                                qbVar.H0.setAlpha((int) (f171 * f25));
                                qbVar.I0.draw(canvas2);
                                canvas2.restore();
                                f41 = qbVar.J0 + dpf23;
                            } else {
                                f41 = dpf23;
                            }
                            if (qbVar.I0 != null && qbVar.M0 != null) {
                                float dpf24 = AndroidUtilities.dpf2(3.66f) + f41;
                                int alpha = qbVar.F0.getAlpha();
                                qbVar.F0.setAlpha((int) (alpha * f170));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf24, centerY3, AndroidUtilities.dp(1.0f), qbVar.F0);
                                qbVar.F0.setAlpha(alpha);
                                f41 = AndroidUtilities.dpf2(2.0f) + dpf24 + AndroidUtilities.dpf2(4.0f);
                            }
                            if (qbVar.M0 != null) {
                                canvas2.save();
                                canvas2.translate(f41 - qbVar.O0, centerY3 - (qbVar.M0.getHeight() / 2.0f));
                                qbVar.L0.setAlpha((int) (f171 * f25));
                                qbVar.M0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z19) {
                                qbVar.Q0.reset();
                                qbVar.Q0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                qbVar.Q0.postTranslate(min7 - AndroidUtilities.dp(8.0f), 0.0f);
                                qbVar.P0.setLocalMatrix(qbVar.Q0);
                                canvas2.drawRect(min7 - AndroidUtilities.dp(8.0f), rectF4.top, min7, rectF4.bottom, qbVar.R0);
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
                    float d13 = qbVar.c0.d(qbVar.T.e, !qbVar.Q);
                    jb jbVar2 = qbVar.T;
                    qbVar.Q = jbVar2.c > 0;
                    rectF4 = rectF16;
                    f37 = e16;
                    qbVar.E0.b((((qbVar.M - qbVar.f) / j13) * qbVar.q1) + qbVar.u1 + qbVar.t1, lerp, f158, f37, j13, audioHeight, d13, rectF4.bottom, jbVar2);
                    canvas2.saveLayerAlpha(rectF4, 102, 31);
                    canvas2.clipPath(qbVar.E0);
                    qbVar.j0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
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
                j11 = j13;
                f28 = f172;
            }
            float f173 = f19;
            float f174 = qbVar.u1 + qbVar.t1;
            float f175 = qbVar.f;
            float f176 = j11;
            float f177 = qbVar.q1;
            float f178 = (((f18 - f175) / f176) * f177) + f174;
            float f179 = (((f17 - f175) / f176) * f177) + f174;
            if (!arrayList3.isEmpty()) {
                f30 = e13;
                f29 = f25;
                f25 = f22;
            } else if (qbVar.J && qbVar.h == null) {
                f30 = e13;
                f29 = f25;
            } else {
                float f180 = f25;
                f25 = Math.max(f27, e13);
                f29 = f180;
                f30 = e13;
            }
            if (f29 > d || f30 > d || f27 > d || f22 > d) {
                if (qbVar.h == null && !qbVar.A && arrayList3.isEmpty()) {
                    f31 = f24;
                    f32 = f29 * AndroidUtilities.lerp(0.6f, 1.0f, f31);
                } else {
                    f31 = f24;
                    f32 = 1.0f;
                }
                Paint paint5 = paint2;
                qbVar.e(canvas, paint5, f173, f28, f178, f179, f32 * f25);
                lb lbVar8 = qbVar.h;
                if (lbVar8 != null && ((qbVar.J || qbVar.A) && (f31 > 0.0f || f23 > 0.0f))) {
                    float f181 = qbVar.s1 - qbVar.v1;
                    float f182 = qbVar.t1 + qbVar.u1;
                    float f183 = lbVar8.g;
                    float f184 = lbVar8.e;
                    float f185 = qbVar.f;
                    float f186 = qbVar.q1;
                    float f187 = ((((lbVar8.h * f184) - f185) / f176) * f186) + f182;
                    canvas3 = canvas;
                    qbVar.e(canvas3, paint5, f181 - f20, f181, ((((f183 * f184) - f185) / f176) * f186) + f182, f187, 0.8f);
                } else if (qbVar.v == null || arrayList3.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    lb lbVar9 = qbVar.v;
                    RectF rectF17 = lbVar9.j;
                    float f188 = rectF17.top;
                    float f189 = rectF17.bottom;
                    float f190 = qbVar.t1 + qbVar.u1;
                    float f191 = lbVar9.f;
                    float f192 = lbVar9.g;
                    float f193 = lbVar9.e;
                    float f194 = qbVar.f;
                    float f195 = qbVar.q1;
                    float f196 = (((((f192 * f193) + f191) - f194) / f176) * f195) + f190;
                    float f197 = (((((lbVar9.h * f193) + f191) - f194) / f176) * f195) + f190;
                    canvas3 = canvas;
                    qbVar.e(canvas3, paint5, f188, f189, f196, f197, 0.8f);
                }
                if (qbVar.U > 1 && (lbVar3 = qbVar.h) != null) {
                    float f198 = lbVar3.e;
                    float f199 = lbVar3.h;
                    float f200 = lbVar3.g;
                    long j22 = (long) ((f199 - f200) * f198);
                    if (j22 > 68999) {
                        float f201 = qbVar.u1 + qbVar.t1;
                        float f202 = qbVar.f;
                        float f203 = qbVar.q1;
                        float f204 = ((((f200 * f198) - f202) / f176) * f203) + f201;
                        float f205 = ((((f199 * f198) - f202) / f176) * f203) + f201;
                        canvas3.save();
                        float f206 = qbVar.s1 - qbVar.v1;
                        canvas3.clipRect(f204, f206 - f20, f205, f206);
                        qbVar.v0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f26) * 255.0f));
                        long j23 = 59000;
                        int min8 = (int) Math.min(qbVar.U - 1, j22 / 59000);
                        int i41 = 1;
                        while (i41 <= min8) {
                            if (Math.min(j23, j22 - (i41 * j23)) < 1000) {
                                break;
                            }
                            float f207 = qbVar.u1 + qbVar.t1;
                            lb lbVar10 = qbVar.h;
                            float f208 = ((((((long) (lbVar10.e * lbVar10.g)) + r2) - qbVar.f) / f176) * qbVar.q1) + f207;
                            float f209 = qbVar.s1 - qbVar.v1;
                            Paint paint6 = qbVar.v0;
                            Canvas canvas4 = canvas3;
                            canvas4.drawRect(f208, (qbVar.s1 - qbVar.v1) - f20, AndroidUtilities.dp(1.0f) + f208, f209, paint6);
                            canvas3 = canvas4;
                            StringBuilder sb2 = new StringBuilder("#");
                            i41++;
                            sb2.append(i41);
                            canvas3.drawText(sb2.toString(), f208 + AndroidUtilities.dp(2.0f), ((qbVar.s1 - qbVar.v1) - f20) + AndroidUtilities.dp(14.0f), qbVar.A0);
                            j23 = 59000;
                        }
                        canvas3.restore();
                        d10 = qbVar.X0.d(0.0f, false);
                        float contentHeight = ((qbVar.s1 - qbVar.getContentHeight()) + qbVar.v1) - AndroidUtilities.dpf2(2.3f);
                        float dpf25 = AndroidUtilities.dpf2(4.3f) + (qbVar.s1 - qbVar.v1);
                        if (d10 <= 0.0f) {
                            long j24 = qbVar.Y0;
                            if (j24 == -1) {
                                lb lbVar11 = qbVar.h;
                                if (lbVar11 != null) {
                                    j24 = (long) (lbVar11.e * lbVar11.h);
                                } else {
                                    lb lbVar12 = qbVar.v;
                                    if (lbVar12 != null) {
                                        j24 = (long) ((lbVar12.h - lbVar12.g) * lbVar12.e);
                                    } else {
                                        if (qbVar.A) {
                                            f33 = qbVar.D;
                                            f34 = qbVar.G;
                                        } else {
                                            f33 = qbVar.N;
                                            f34 = qbVar.P;
                                        }
                                        j24 = (long) (f33 * f34);
                                    }
                                }
                            }
                            qbVar = this;
                            qbVar.d(canvas3, contentHeight, dpf25, j24, d10 * f25);
                        } else {
                            qbVar = qbVar;
                        }
                        qbVar.d(canvas, contentHeight, dpf25, qbVar.e, (1.0f - d10) * f25);
                    }
                }
                d10 = qbVar.X0.d(0.0f, false);
                float contentHeight2 = ((qbVar.s1 - qbVar.getContentHeight()) + qbVar.v1) - AndroidUtilities.dpf2(2.3f);
                float dpf252 = AndroidUtilities.dpf2(4.3f) + (qbVar.s1 - qbVar.v1);
                if (d10 <= 0.0f) {
                }
                qbVar.d(canvas, contentHeight2, dpf252, qbVar.e, (1.0f - d10) * f25);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            j11 = j10;
        }
        if (qbVar.i1) {
            float f210 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f211 = qbVar.j1;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / qbVar.q1) * j11 * f210 * f211);
            if (qbVar.T0) {
                qbVar.j1 = (f210 * 0.25f) + f211;
            }
            int i42 = qbVar.d1;
            if (i42 == 4 && (lbVar2 = qbVar.h) != null) {
                float f212 = lbVar2.g;
                long j25 = qbVar.f;
                long j26 = lbVar2.e;
                float f213 = j26;
                if (f212 < j25 / f213) {
                    i11 = -1;
                } else if (lbVar2.h > (j25 + j11) / f213) {
                    i11 = 1;
                } else {
                    qbVar.j1 = 1.0f;
                    i11 = 0;
                }
                long j27 = i11 * dp2;
                qbVar.f = Utilities.clamp(j25 + j27, j26 - j11, 0L);
                qbVar.e += j27;
                lb lbVar13 = qbVar.h;
                float f214 = (r3 - j25) / lbVar13.e;
                if (f214 > 0.0f) {
                    f10 = 1.0f;
                    max = Math.min(1.0f - lbVar13.h, f214);
                } else {
                    f10 = 1.0f;
                    max = Math.max(0.0f - lbVar13.g, f214);
                }
                lb lbVar14 = qbVar.h;
                lbVar14.g = Utilities.clamp(lbVar14.g + max, f10, 0.0f);
                lb lbVar15 = qbVar.h;
                lbVar15.h = Utilities.clamp(lbVar15.h + max, f10, 0.0f);
                kb kbVar = qbVar.a;
                if (kbVar != null) {
                    kbVar.I0(qbVar.h.g, false);
                    qbVar.a.x1(qbVar.h.h);
                }
                qbVar.invalidate();
            } else if (i42 == 8) {
                float f215 = qbVar.O;
                long j28 = qbVar.M;
                float f216 = (-j28) + 100;
                long j29 = qbVar.N;
                float f217 = j29;
                if (f215 < f216 / f217) {
                    i10 = -1;
                } else if (qbVar.P >= ((r8 + j11) - 100) / f217) {
                    i10 = 1;
                } else {
                    qbVar.j1 = 1.0f;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (qbVar.L && (lbVar = qbVar.h) != null) {
                        long j30 = j28 - (i10 * dp2);
                        float f218 = lbVar.h;
                        float f219 = lbVar.e;
                        qbVar.M = Utilities.clamp(j30, (long) ((f218 * f219) - (f215 * f217)), (long) ((lbVar.g * f219) - (qbVar.P * f217)));
                    } else if (qbVar.C && qbVar.A) {
                        long j31 = j28 - (i10 * dp2);
                        float f220 = qbVar.G;
                        float f221 = qbVar.D;
                        qbVar.M = Utilities.clamp(j31, (long) ((f220 * f221) - (f215 * f217)), (long) ((qbVar.F * f221) - (qbVar.P * f217)));
                    } else {
                        qbVar.M = Utilities.clamp(j28 - (i10 * dp2), 0L, -(j29 - Math.min(qbVar.getBaseDuration(), qbVar.getMaxScrollDuration())));
                    }
                    float f222 = (-(qbVar.M - j28)) / qbVar.N;
                    float min9 = f222 > 0.0f ? Math.min(1.0f - qbVar.P, f222) : Math.max(0.0f - qbVar.O, f222);
                    if (qbVar.h == null) {
                        float f223 = qbVar.e;
                        float f224 = qbVar.N;
                        qbVar.e = (long) Utilities.clamp((min9 * f224) + f223, f224, 0.0f);
                    }
                    qbVar.O = Utilities.clamp(qbVar.O + min9, 1.0f, 0.0f);
                    qbVar.P = Utilities.clamp(qbVar.P + min9, 1.0f, 0.0f);
                    kb kbVar2 = qbVar.a;
                    if (kbVar2 != null) {
                        kbVar2.r1(qbVar.O);
                        qbVar.a.j1(qbVar.P);
                        qbVar.a.I(qbVar.e, false);
                    }
                    qbVar.invalidate();
                } else {
                    qbVar.j1 = 1.0f;
                }
            } else {
                qbVar.j1 = 1.0f;
            }
        } else {
            qbVar.j1 = 1.0f;
        }
        int contentHeight3 = qbVar.getContentHeight();
        if (qbVar.c != contentHeight3) {
            qbVar.c = contentHeight3;
            Runnable runnable = qbVar.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(Canvas canvas, Paint paint, float f9, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f11 - AndroidUtilities.dp(10.0f), f9, AndroidUtilities.dp(10.0f) + f12, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.r1, this.s1, 255, 31);
        int i10 = (int) (255.0f * f13);
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
        float f14 = f9 + f10;
        float f15 = (f14 - dp2) / 2.0f;
        float f16 = (f14 + dp2) / 2.0f;
        rectF.set(org.telegram.messenger.x3.a(AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f), dp, 2.0f, f11), f15, f11 - ((AndroidUtilities.dp(this.T0 ? 2.0f : 10.0f) + dp) / 2.0f), f16);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.T0) {
                paint4.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.recaptcha.internal.a.A(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), dp, 2.0f, f12), f15, j7.l1.c(AndroidUtilities.dp(this.T0 ? 2.5f : 10.0f), dp, 2.0f, f12), f16);
        if (!this.T0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f13 * 48.0f));
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

    public final void h(float f9) {
        float f10;
        long j10;
        float f11;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        kb kbVar;
        long clamp;
        lb lbVar = this.h;
        if (lbVar == null && !this.A) {
            long j16 = this.M;
            long clamp2 = Utilities.clamp(j16 + ((long) f9), 0L, -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.M = clamp2;
            float f12 = clamp2 - j16;
            this.O = Utilities.clamp(this.O - (f12 / this.N), 1.0f, 0.0f);
            this.P = Utilities.clamp(this.P - (f12 / this.N), 1.0f, 0.0f);
            kb kbVar2 = this.a;
            if (kbVar2 != null) {
                kbVar2.r1(this.O);
                this.a.j1(this.P);
            }
        } else if (this.L) {
            if (lbVar != null) {
                f10 = lbVar.g;
                j10 = lbVar.e;
            } else {
                f10 = this.F;
                j10 = this.D;
            }
            float f13 = f10 * j10;
            if (lbVar != null) {
                f11 = lbVar.h;
                j11 = lbVar.e;
            } else {
                f11 = this.G;
                j11 = this.D;
            }
            float f14 = f11 * j11;
            float f15 = lbVar != null ? (lbVar.h - lbVar.g) * lbVar.e : this.D * (this.G - this.F);
            float f16 = this.P;
            float f17 = this.N;
            long j17 = (long) (f14 - (f16 * f17));
            float f18 = this.O;
            long j18 = (long) (f13 - (f18 * f17));
            float min = Math.min(f16 - f18, f15 / f17);
            long j19 = this.M;
            long j20 = (long) f9;
            long j21 = j19 + j20;
            if (j21 > j17) {
                float clamp3 = Utilities.clamp(((f14 - j19) - j20) / this.N, 1.0f, min);
                this.P = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.O = clamp4;
                float f19 = this.P;
                float f20 = this.N;
                long j22 = (long) (f14 - (f19 * f20));
                long j23 = (long) (f13 - (clamp4 * f20));
                if (j22 < j23) {
                    j15 = j23;
                    j14 = j22;
                } else {
                    j14 = j23;
                    j15 = j22;
                }
                this.M = Utilities.clamp(this.M + j20, j15, j14);
                kb kbVar3 = this.a;
                if (kbVar3 != null) {
                    kbVar3.r1(this.O);
                    this.a.j1(this.P);
                }
            } else if (j21 < j18) {
                float clamp5 = Utilities.clamp(((f13 - j19) - j20) / this.N, 1.0f - min, 0.0f);
                this.O = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.P = clamp6;
                float f21 = this.N;
                long j24 = (long) (f14 - (clamp6 * f21));
                long j25 = (long) (f13 - (this.O * f21));
                if (j24 < j25) {
                    j13 = j25;
                    j12 = j24;
                } else {
                    j12 = j25;
                    j13 = j24;
                }
                this.M = Utilities.clamp(this.M + j20, j13, j12);
                kb kbVar4 = this.a;
                if (kbVar4 != null) {
                    kbVar4.r1(this.O);
                    this.a.j1(this.P);
                }
            } else {
                this.M = j21;
            }
        } else {
            long j26 = this.M + ((long) f9);
            float baseDuration = getBaseDuration();
            float f22 = this.N;
            this.M = Utilities.clamp(j26, (long) (baseDuration - (this.P * f22)), (long) ((-this.O) * f22));
        }
        invalidate();
        kb kbVar5 = this.a;
        if (kbVar5 != null) {
            kbVar5.D1(this.M + ((long) (this.O * this.N)));
        }
        boolean z10 = this.i1;
        if (z10 || (kbVar = this.a) == null) {
            if (z10 || this.n1) {
                lb lbVar2 = this.h;
                if (lbVar2 != null) {
                    long j27 = this.M + ((long) (this.O * this.N));
                    float f23 = lbVar2.h;
                    float f24 = lbVar2.e;
                    this.e = Utilities.clamp(j27, (long) (f23 * f24), (long) (lbVar2.g * f24));
                } else if (!this.A || lbVar2 == null) {
                    float f25 = this.O;
                    long j28 = this.N;
                    this.e = Utilities.clamp((long) (f25 * j28), j28, 0L);
                } else {
                    long j29 = this.M + ((long) (this.O * this.N));
                    float f26 = this.G;
                    float f27 = lbVar2.e;
                    this.e = Utilities.clamp(j29, (long) (f26 * f27), (long) (this.F * f27));
                }
                kb kbVar6 = this.a;
                if (kbVar6 != null) {
                    kbVar6.I(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        kbVar.s0(true);
        lb lbVar3 = this.h;
        if (lbVar3 != null) {
            long j30 = this.M + ((long) (this.O * this.N));
            float f28 = lbVar3.h;
            float f29 = lbVar3.e;
            clamp = Utilities.clamp(j30, (long) (f28 * f29), (long) (lbVar3.g * f29));
        } else if (this.A) {
            long j31 = this.M + ((long) (this.O * this.N));
            float f30 = this.G;
            float f31 = this.D;
            clamp = Utilities.clamp(j31, (long) (f30 * f31), (long) (this.F * f31));
        } else {
            float f32 = this.O;
            long j32 = this.N;
            clamp = Utilities.clamp((long) (f32 * j32), j32, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        kb kbVar7 = this.a;
        this.e = clamp;
        kbVar7.I(clamp, false);
    }

    public final void i(lb lbVar, float f9) {
        kb kbVar;
        long clamp;
        long j10;
        long j11;
        long j12;
        long j13;
        if (lbVar == null) {
            return;
        }
        lb lbVar2 = this.v;
        if (lbVar2 != lbVar && lbVar2 != null) {
            if (this.n == this.s.indexOf(lbVar)) {
                lb lbVar3 = this.v;
                float f10 = lbVar3.e;
                float f11 = lbVar.h;
                float f12 = lbVar.e;
                long j14 = (long) ((f10 * 1.0f) - (f11 * f12));
                float f13 = lbVar.g;
                long j15 = (long) ((f10 * 0.0f) - (f13 * f12));
                float min = Math.min(f11 - f13, ((lbVar3.h - lbVar3.g) * f10) / f12);
                long j16 = lbVar.f;
                long j17 = (long) f9;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float clamp2 = Utilities.clamp((((this.v.h * r2.e) - j16) - j17) / lbVar.e, 1.0f, min);
                    lbVar.h = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    lbVar.g = clamp3;
                    lb lbVar4 = this.v;
                    float f14 = lbVar4.h;
                    float f15 = lbVar4.e;
                    float f16 = lbVar.h;
                    float f17 = lbVar.e;
                    long j19 = (long) ((f14 * f15) - (f16 * f17));
                    long j20 = (long) ((lbVar4.g * f15) - (clamp3 * f17));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    lbVar.f = Utilities.clamp(lbVar.f + j17, j13, j12);
                    kb kbVar2 = this.a;
                    if (kbVar2 != null) {
                        kbVar2.f1(lbVar.g, lbVar.a);
                        this.a.w1(lbVar.h, lbVar.a);
                    }
                } else if (j18 < j15) {
                    float clamp4 = Utilities.clamp((((this.v.g * r2.e) - j16) - j17) / lbVar.e, 1.0f - min, 0.0f);
                    lbVar.g = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    lbVar.h = clamp5;
                    lb lbVar5 = this.v;
                    float f18 = lbVar5.h;
                    float f19 = lbVar5.e;
                    float f20 = lbVar.e;
                    long j21 = (long) ((f18 * f19) - (clamp5 * f20));
                    long j22 = (long) ((lbVar5.g * f19) - (lbVar.g * f20));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    lbVar.f = Utilities.clamp(lbVar.f + j17, j11, j10);
                    kb kbVar3 = this.a;
                    if (kbVar3 != null) {
                        kbVar3.f1(lbVar.g, lbVar.a);
                        this.a.w1(lbVar.h, lbVar.a);
                    }
                } else {
                    lbVar.f = j18;
                }
            } else {
                long j23 = lbVar.f + ((long) f9);
                float baseDuration = getBaseDuration();
                float f21 = lbVar.e;
                lbVar.f = Utilities.clamp(j23, (long) (baseDuration - (lbVar.h * f21)), (long) ((-lbVar.g) * f21));
            }
        }
        invalidate();
        kb kbVar4 = this.a;
        if (kbVar4 != null) {
            kbVar4.B1(lbVar.a, lbVar.f);
        }
        boolean z10 = this.i1;
        if (z10 || (kbVar = this.a) == null) {
            if (z10 || this.n1) {
                lb lbVar6 = this.v;
                if (lbVar6 == lbVar || lbVar6 == null) {
                    float f22 = lbVar.g;
                    long j24 = lbVar.e;
                    this.e = Utilities.clamp((long) (f22 * j24), j24, 0L);
                } else {
                    long j25 = lbVar.f + ((long) (lbVar.g * lbVar.e));
                    float f23 = lbVar6.h;
                    float f24 = lbVar6.e;
                    this.e = Utilities.clamp(j25, (long) (f23 * f24), (long) (lbVar6.g * f24));
                }
                kb kbVar5 = this.a;
                if (kbVar5 != null) {
                    kbVar5.I(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        kbVar.s0(true);
        lb lbVar7 = this.v;
        if (lbVar7 == lbVar || lbVar7 == null) {
            float f25 = lbVar.g;
            long j26 = lbVar.e;
            clamp = Utilities.clamp((long) (f25 * j26), j26, 0L);
        } else {
            long j27 = lbVar.f + ((long) (lbVar.g * lbVar.e));
            float f26 = lbVar7.h;
            float f27 = lbVar7.e;
            clamp = Utilities.clamp(j27, (long) (f26 * f27), (long) (lbVar7.g * f27));
        }
        lb lbVar8 = this.v;
        if (lbVar8 != lbVar && lbVar8 != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        kb kbVar6 = this.a;
        this.e = clamp;
        kbVar6.I(clamp, false);
    }

    public final void j(float f9) {
        long j10;
        long j11;
        long j12;
        long j13;
        kb kbVar;
        long clamp;
        lb lbVar = this.h;
        if (lbVar == null) {
            long j14 = this.E;
            long clamp2 = Utilities.clamp(j14 + ((long) f9), 0L, -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.E = clamp2;
            float f10 = clamp2 - j14;
            this.F = Utilities.clamp(this.F - (f10 / this.D), 1.0f, 0.0f);
            this.G = Utilities.clamp(this.G - (f10 / this.D), 1.0f, 0.0f);
            kb kbVar2 = this.a;
            if (kbVar2 != null) {
                kbVar2.i0(this.F);
                this.a.z1(this.G);
            }
        } else if (this.C) {
            float f11 = lbVar.h;
            float f12 = lbVar.e;
            float f13 = this.G;
            float f14 = this.D;
            long j15 = (long) ((f11 * f12) - (f13 * f14));
            float f15 = lbVar.g;
            float f16 = this.F;
            long j16 = (long) ((f15 * f12) - (f16 * f14));
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j17 = this.E;
            long j18 = (long) f9;
            long j19 = j17 + j18;
            if (j19 > j15) {
                float clamp3 = Utilities.clamp((((this.h.h * r1.e) - j17) - j18) / this.D, 1.0f, min);
                this.G = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.F = clamp4;
                lb lbVar2 = this.h;
                float f17 = lbVar2.h;
                float f18 = lbVar2.e;
                float f19 = this.G;
                float f20 = this.D;
                long j20 = (long) ((f17 * f18) - (f19 * f20));
                long j21 = (long) ((lbVar2.g * f18) - (clamp4 * f20));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.E = Utilities.clamp(this.E + j18, j13, j12);
                kb kbVar3 = this.a;
                if (kbVar3 != null) {
                    kbVar3.i0(this.F);
                    this.a.z1(this.G);
                }
            } else if (j19 < j16) {
                float clamp5 = Utilities.clamp((((this.h.g * r1.e) - j17) - j18) / this.D, 1.0f - min, 0.0f);
                this.F = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.G = clamp6;
                lb lbVar3 = this.h;
                float f21 = lbVar3.h;
                float f22 = lbVar3.e;
                float f23 = this.D;
                long j22 = (long) ((f21 * f22) - (clamp6 * f23));
                long j23 = (long) ((lbVar3.g * f22) - (this.F * f23));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.E = Utilities.clamp(this.E + j18, j11, j10);
                kb kbVar4 = this.a;
                if (kbVar4 != null) {
                    kbVar4.i0(this.F);
                    this.a.z1(this.G);
                }
            } else {
                this.E = j19;
            }
        } else {
            long j24 = this.E + ((long) f9);
            float baseDuration = getBaseDuration();
            float f24 = this.D;
            this.E = Utilities.clamp(j24, (long) (baseDuration - (this.G * f24)), (long) ((-this.F) * f24));
        }
        invalidate();
        kb kbVar5 = this.a;
        if (kbVar5 != null) {
            kbVar5.b1(this.E + ((long) (this.F * this.D)));
        }
        boolean z10 = this.i1;
        if (z10 || (kbVar = this.a) == null) {
            if (z10 || this.n1) {
                lb lbVar4 = this.h;
                if (lbVar4 != null) {
                    long j25 = this.E + ((long) (this.F * this.D));
                    float f25 = lbVar4.h;
                    float f26 = lbVar4.e;
                    this.e = Utilities.clamp(j25, (long) (f25 * f26), (long) (lbVar4.g * f26));
                } else {
                    float f27 = this.F;
                    long j26 = this.D;
                    this.e = Utilities.clamp((long) (f27 * j26), j26, 0L);
                }
                kb kbVar6 = this.a;
                if (kbVar6 != null) {
                    kbVar6.I(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        kbVar.s0(true);
        lb lbVar5 = this.h;
        if (lbVar5 != null) {
            long j27 = this.E + ((long) (this.F * this.D));
            float f28 = lbVar5.h;
            float f29 = lbVar5.e;
            clamp = Utilities.clamp(j27, (long) (f28 * f29), (long) (lbVar5.g * f29));
        } else {
            float f30 = this.F;
            long j28 = this.D;
            clamp = Utilities.clamp((long) (f30 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.Y0 = this.e;
            this.X0.d(1.0f, true);
        }
        kb kbVar7 = this.a;
        this.e = clamp;
        kbVar7.I(clamp, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        lb lbVar = this.h;
        float f9 = (lbVar.h + lbVar.g) / 2.0f;
        long j10 = lbVar.e;
        this.f = Utilities.clamp((long) ((f9 * j10) - (min / 2.0f)), j10 - min, 0L);
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

    public final boolean m(float f9, boolean z10) {
        lb lbVar = this.h;
        ArrayList arrayList = this.s;
        if (lbVar == null && !this.J && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f10 = ((f9 - this.u1) - this.t1) / this.q1;
        lb lbVar2 = this.v;
        long j10 = lbVar2 != null ? (long) ((lbVar2.g * lbVar2.e) + lbVar2.f) : 0L;
        float f11 = f10 * min;
        if (lbVar2 == null) {
            j10 = this.h == null ? this.M : 0L;
        }
        long clamp = (long) Utilities.clamp((f11 - j10) + this.f, getBaseDuration(), 0.0f);
        lb lbVar3 = this.h;
        if (lbVar3 != null) {
            float f12 = clamp / lbVar3.e;
            if (f12 < lbVar3.g || f12 > lbVar3.h) {
                return false;
            }
        }
        lb lbVar4 = this.v;
        if (lbVar4 != null && (clamp < 0 || clamp >= ((long) ((lbVar4.h - lbVar4.g) * lbVar4.e)))) {
            return false;
        }
        if (this.J && lbVar3 == null && arrayList.isEmpty()) {
            float f13 = clamp / this.N;
            if (f13 < this.O || f13 > this.P) {
                return false;
            }
        }
        this.e = clamp;
        invalidate();
        kb kbVar = this.a;
        if (kbVar != null) {
            kbVar.I(clamp, z10);
        }
        eg.z1 z1Var = this.Z0;
        if (z1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z1Var);
            this.Z0 = null;
        }
        if (!z10) {
            return true;
        }
        eg.z1 z1Var2 = new eg.z1(this, clamp, 11);
        this.Z0 = z1Var2;
        AndroidUtilities.runOnUIThread(z1Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f9, float f10, float f11, boolean z10) {
        long j12;
        boolean z11;
        boolean z12;
        lb lbVar;
        if (TextUtils.equals(this.B, str)) {
            return;
        }
        ob obVar = this.I;
        if (obVar != null) {
            obVar.b();
            this.I = null;
        }
        long j13 = this.D;
        if (str != null) {
            this.B = str;
            this.D = j10;
            this.E = j11 - ((long) (j10 * f9));
            this.F = f9;
            this.G = f10;
            this.H = f11;
            if (getMeasuredWidth() <= 0 || this.I != null || ((lbVar = this.h) != null && lbVar.e < 1)) {
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
                lb lbVar2 = this.h;
                j12 = j13;
                z12 = false;
                z11 = true;
                this.I = new ob(this, false, str2, i12, dp, valueOf, lbVar2 != null ? lbVar2.e : getMaxScrollDuration(), -1L, -1L, new hb(this, 0));
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

    public final void o(boolean z10, String str, long j10, float f9) {
        lb lbVar = this.h;
        if (TextUtils.equals(lbVar == null ? null : lbVar.d, str)) {
            return;
        }
        lb lbVar2 = this.h;
        if (lbVar2 != null) {
            ob obVar = lbVar2.c;
            if (obVar != null) {
                obVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            lb lbVar3 = new lb(this);
            this.h = lbVar3;
            lbVar3.b = z10;
            lbVar3.d = str;
            lbVar3.e = j10;
            lbVar3.i = f9;
            lb.a(lbVar3, false);
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
        lb lbVar = this.h;
        if (lbVar != null && lbVar.d != null && lbVar.c == null) {
            lb.a(lbVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                lb lbVar2 = (lb) obj;
                if (lbVar2.d != null && lbVar2.c == null) {
                    lb.a(lbVar2, false);
                    lb.b(lbVar2);
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
        eg.z1 z1Var;
        boolean z11;
        VelocityTracker velocityTracker;
        kb kbVar;
        VelocityTracker velocityTracker2;
        long j10;
        boolean z12;
        long j11;
        long j12;
        long j13;
        float f9;
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
        kb kbVar2;
        int i10;
        float f10;
        float f11;
        boolean z15;
        float f12;
        float clamp;
        kb kbVar3;
        kb kbVar4;
        int i11;
        float f13;
        float f14;
        lb lbVar = this.h;
        ArrayList arrayList = this.s;
        if (lbVar != null || !arrayList.isEmpty() || this.J || this.A) {
            float timelineHeight = this.s1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                lm0 lm0Var = this.S0;
                eg.k0 k0Var = this.U0;
                if (action == 0) {
                    eg.z1 z1Var2 = this.Z0;
                    if (z1Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(z1Var2);
                        this.Z0 = null;
                    }
                    lm0Var.a();
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
                        f13 = 4.0f;
                    } else {
                        float f15 = i12;
                        if (motionEvent.getY() < f15) {
                            f13 = 4.0f;
                            if (motionEvent.getY() > (f15 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.f1 = 0;
                            }
                        } else {
                            f13 = 4.0f;
                        }
                        i12 = (int) (f15 - (getVideoHeight() + AndroidUtilities.dp(f13)));
                    }
                    if (this.f1 == -1 && !arrayList.isEmpty()) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            f14 = 2.0f;
                            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((lb) arrayList.get(i13)).k.c);
                            float f16 = i12;
                            if (motionEvent.getY() < f16 && motionEvent.getY() > (f16 - lerp) - AndroidUtilities.dp(2.0f)) {
                                this.f1 = 3;
                                this.g1 = i13;
                                break;
                            }
                            i12 = (int) (f16 - (lerp + AndroidUtilities.dp(f13)));
                        }
                    }
                    f14 = 2.0f;
                    if (this.f1 == -1 && this.A) {
                        float f17 = i12;
                        if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - getRoundHeight()) - AndroidUtilities.dp(f14)) {
                            this.f1 = 1;
                        }
                        i12 = (int) (f17 - (getRoundHeight() + AndroidUtilities.dp(f13)));
                    }
                    if (this.f1 == -1 && this.J) {
                        float f18 = i12;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getAudioHeight()) - AndroidUtilities.dp(f14)) {
                            this.f1 = 2;
                        }
                        getAudioHeight();
                        AndroidUtilities.dp(f13);
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
                    float x4 = motionEvent.getX() - this.c1;
                    if (this.f0 && (this.i1 || Math.abs(x4) > AndroidUtilities.touchSlop)) {
                        long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                        lb lbVar2 = this.h;
                        if (lbVar2 != null && this.d1 == 1) {
                            this.f = (long) Utilities.clamp(this.f - ((x4 / this.q1) * min3), lbVar2.e - min3, 0.0f);
                            invalidate();
                            if (!this.i1) {
                                this.j1 = 1.0f;
                            }
                            this.i1 = true;
                            this.h1 = false;
                        } else if (lbVar2 == null || !((i11 = this.d1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.d1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f19 = (min3 / this.N) * (x4 / this.q1);
                                if (i15 == 6) {
                                    float g10 = this.P - (g() / this.N);
                                    float max3 = Math.max(0L, this.f - this.M);
                                    float f20 = this.N;
                                    float f21 = max3 / f20;
                                    lb lbVar3 = this.h;
                                    if (lbVar3 != null) {
                                        max = Math.max(f21, (((lbVar3.g * lbVar3.e) + this.f) - this.M) / f20);
                                    } else {
                                        lb lbVar4 = this.v;
                                        if (lbVar4 != null) {
                                            max = Math.max(f21, (((lbVar4.g * lbVar4.e) + this.f) - this.M) / f20);
                                        } else if (this.A) {
                                            max = Math.max(f21, (((this.F * this.D) + this.f) - this.M) / f20);
                                        } else {
                                            max = Math.max(f21, this.P - (f() / this.N));
                                            if (!this.k1 && f19 < 0.0f && this.O <= this.P - (f() / this.N)) {
                                                this.d1 = 8;
                                            }
                                        }
                                    }
                                    float f22 = this.O;
                                    float clamp2 = Utilities.clamp(f22 + f19, g10, max);
                                    this.O = clamp2;
                                    if (Math.abs(f22 - clamp2) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    kb kbVar5 = this.a;
                                    if (kbVar5 != null) {
                                        kbVar5.D1(this.M + ((long) (this.O * this.N)));
                                    }
                                    kb kbVar6 = this.a;
                                    if (kbVar6 != null) {
                                        kbVar6.r1(this.O);
                                    }
                                } else if (i15 == 7) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.M) + min3) / this.N);
                                    float f23 = this.O;
                                    float g11 = g();
                                    float f24 = this.N;
                                    float f25 = (g11 / f24) + f23;
                                    lb lbVar5 = this.h;
                                    if (lbVar5 != null) {
                                        min = Math.min(min4, (((lbVar5.h * lbVar5.e) + this.f) - this.M) / f24);
                                    } else {
                                        lb lbVar6 = this.v;
                                        if (lbVar6 != null) {
                                            min = Math.min(min4, (((lbVar6.h * lbVar6.e) + this.f) - this.M) / f24);
                                        } else if (this.A) {
                                            min = Math.min(min4, (((this.G * this.D) + this.f) - this.M) / f24);
                                        } else {
                                            min = Math.min(min4, (f() / this.N) + this.O);
                                            if (!this.k1 && f19 > 0.0f) {
                                                if (this.P >= (f() / this.N) + this.O) {
                                                    this.d1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f26 = this.P;
                                    float clamp3 = Utilities.clamp(f26 + f19, min, f25);
                                    this.P = clamp3;
                                    if (Math.abs(f26 - clamp3) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    kb kbVar7 = this.a;
                                    if (kbVar7 != null) {
                                        kbVar7.j1(this.P);
                                    }
                                }
                                if (this.d1 == 8) {
                                    float min5 = f19 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.M) + min3) / this.N) - this.P), f19) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.M) / this.N) - this.O), f19);
                                    float f27 = this.O + min5;
                                    this.O = f27;
                                    this.P += min5;
                                    kb kbVar8 = this.a;
                                    if (kbVar8 != null) {
                                        kbVar8.r1(f27);
                                        this.a.D1(this.M + ((long) (this.O * this.N)));
                                        this.a.j1(this.P);
                                    }
                                    kb kbVar9 = this.a;
                                    if (kbVar9 != null) {
                                        kbVar9.s0(true);
                                    }
                                }
                                if (this.h == null && !this.A) {
                                    this.e = (long) (this.O * this.N);
                                    kb kbVar10 = this.a;
                                    if (kbVar10 != null) {
                                        kbVar10.s0(true);
                                        this.a.I(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.i1) {
                                    this.j1 = 1.0f;
                                }
                                this.i1 = true;
                                this.h1 = false;
                            } else if (i15 == 10 || i15 == 11 || i15 == 12) {
                                float f28 = (min3 / this.D) * (x4 / this.q1);
                                if (i15 == 10) {
                                    float g12 = this.G - (g() / this.D);
                                    float max4 = Math.max(0L, this.f - this.E);
                                    float f29 = this.D;
                                    float f30 = max4 / f29;
                                    lb lbVar7 = this.h;
                                    if (lbVar7 != null) {
                                        max2 = Math.max(f30, (((lbVar7.g * lbVar7.e) + this.f) - this.E) / f29);
                                    } else {
                                        lb lbVar8 = this.v;
                                        if (lbVar8 != null) {
                                            max2 = Math.max(f30, (((lbVar8.g * lbVar8.e) + this.f) - this.E) / f29);
                                        } else {
                                            max2 = Math.max(f30, this.G - (f() / this.D));
                                            if (!this.k1 && f28 < 0.0f && this.F <= this.G - (f() / this.D)) {
                                                this.d1 = 8;
                                            }
                                        }
                                    }
                                    float f31 = this.F;
                                    float clamp4 = Utilities.clamp(f31 + f28, g12, max2);
                                    this.F = clamp4;
                                    if (Math.abs(f31 - clamp4) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    kb kbVar11 = this.a;
                                    if (kbVar11 != null) {
                                        kbVar11.b1(this.E + ((long) (this.F * this.D)));
                                    }
                                    kb kbVar12 = this.a;
                                    if (kbVar12 != null) {
                                        kbVar12.i0(this.F);
                                    }
                                } else if (i15 == 11) {
                                    float min6 = Math.min(1.0f, Math.max(0L, (this.f - this.E) + min3) / this.D);
                                    float f32 = this.F;
                                    float g13 = g();
                                    float f33 = this.D;
                                    float f34 = (g13 / f33) + f32;
                                    lb lbVar9 = this.h;
                                    if (lbVar9 != null) {
                                        min6 = Math.min(min6, (((lbVar9.h * lbVar9.e) + this.f) - this.E) / f33);
                                    }
                                    lb lbVar10 = this.v;
                                    if (lbVar10 != null) {
                                        min2 = Math.min(min6, (((lbVar10.h * lbVar10.e) + this.f) - this.E) / this.D);
                                    } else {
                                        min2 = Math.min(min6, (f() / this.D) + this.F);
                                        if (!this.k1 && f28 > 0.0f) {
                                            if (this.G >= (f() / this.D) + this.F) {
                                                this.d1 = 8;
                                            }
                                        }
                                    }
                                    float f35 = this.G;
                                    float clamp5 = Utilities.clamp(f35 + f28, min2, f34);
                                    this.G = clamp5;
                                    if (Math.abs(f35 - clamp5) > 0.01f) {
                                        this.k1 = true;
                                    }
                                    kb kbVar13 = this.a;
                                    if (kbVar13 != null) {
                                        kbVar13.z1(this.G);
                                    }
                                }
                                if (this.d1 == 12) {
                                    float min7 = f28 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.E) + min3) / this.D) - this.G, f28) : Math.max((Math.max(0L, this.f - this.E) / this.D) - this.F, f28);
                                    float f36 = this.F + min7;
                                    this.F = f36;
                                    this.G += min7;
                                    kb kbVar14 = this.a;
                                    if (kbVar14 != null) {
                                        kbVar14.i0(f36);
                                        this.a.b1(this.E + ((long) (this.F * this.D)));
                                        this.a.z1(this.G);
                                    }
                                    kb kbVar15 = this.a;
                                    if (kbVar15 != null) {
                                        kbVar15.s0(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.F * this.D);
                                    kb kbVar16 = this.a;
                                    if (kbVar16 != null) {
                                        kbVar16.s0(true);
                                        z13 = false;
                                        this.a.I(this.e, false);
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
                                        h((x4 / this.q1) * min3);
                                        if (!this.i1) {
                                            this.j1 = 1.0f;
                                        }
                                        this.i1 = true;
                                        this.h1 = false;
                                    } else if (i17 == 9) {
                                        j((x4 / this.q1) * min3);
                                        if (!this.i1) {
                                            this.j1 = 1.0f;
                                        }
                                        this.i1 = true;
                                        this.h1 = false;
                                    } else {
                                        int i18 = this.e1;
                                        if (i18 >= 0 && i18 < arrayList.size() && this.d1 == 16) {
                                            i((lb) arrayList.get(this.e1), (x4 / this.q1) * min3);
                                            if (!this.i1) {
                                                this.j1 = 1.0f;
                                            }
                                            this.i1 = true;
                                            this.h1 = false;
                                        } else if (this.h1) {
                                            m(motionEvent.getX(), currentTimeMillis - this.a1 < 350);
                                            if (this.i1 || (kbVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                kbVar2.s0(true);
                                            }
                                            if (!this.i1) {
                                                this.j1 = 1.0f;
                                            }
                                            this.i1 = z14;
                                        }
                                    }
                                } else {
                                    lb lbVar11 = (lb) arrayList.get(this.e1);
                                    float f37 = (min3 / lbVar11.e) * (x4 / this.q1);
                                    int i19 = this.d1;
                                    if (i19 == 13) {
                                        float g14 = lbVar11.h - (g() / lbVar11.e);
                                        float max5 = Math.max(0L, this.f - lbVar11.f) / lbVar11.e;
                                        if (lbVar11 == this.v) {
                                            f10 = f37;
                                            max5 = Math.max(max5, lbVar11.h - (f() / lbVar11.e));
                                            if (!this.k1 && f10 < 0.0f) {
                                                f11 = 0.0f;
                                                if (lbVar11.g <= lbVar11.h - (f() / lbVar11.e)) {
                                                    this.d1 = 15;
                                                }
                                                f12 = lbVar11.g;
                                                clamp = Utilities.clamp(f12 + f10, g14, max5);
                                                lbVar11.g = clamp;
                                                if (Math.abs(f12 - clamp) > 0.01f) {
                                                    this.k1 = true;
                                                }
                                                kbVar3 = this.a;
                                                if (kbVar3 != null) {
                                                    kbVar3.B1(lbVar11.a, lbVar11.f);
                                                }
                                                kbVar4 = this.a;
                                                if (kbVar4 != null) {
                                                    kbVar4.f1(lbVar11.g, lbVar11.a);
                                                }
                                            }
                                        } else {
                                            f10 = f37;
                                        }
                                        f11 = 0.0f;
                                        f12 = lbVar11.g;
                                        clamp = Utilities.clamp(f12 + f10, g14, max5);
                                        lbVar11.g = clamp;
                                        if (Math.abs(f12 - clamp) > 0.01f) {
                                        }
                                        kbVar3 = this.a;
                                        if (kbVar3 != null) {
                                        }
                                        kbVar4 = this.a;
                                        if (kbVar4 != null) {
                                        }
                                    } else {
                                        f10 = f37;
                                        f11 = 0.0f;
                                        if (i19 == 14) {
                                            float min8 = Math.min(1.0f, Math.max(0L, (this.f - lbVar11.f) + min3) / lbVar11.e);
                                            float g15 = (g() / lbVar11.e) + lbVar11.g;
                                            if (lbVar11 == this.v) {
                                                min8 = Math.min(min8, (f() / lbVar11.e) + lbVar11.g);
                                                if (!this.k1 && f10 > 0.0f) {
                                                    if (lbVar11.h >= (f() / lbVar11.e) + lbVar11.g) {
                                                        this.d1 = 15;
                                                    }
                                                }
                                            }
                                            float f38 = lbVar11.h;
                                            float clamp6 = Utilities.clamp(f38 + f10, min8, g15);
                                            lbVar11.h = clamp6;
                                            if (Math.abs(f38 - clamp6) > 0.01f) {
                                                this.k1 = true;
                                            }
                                            kb kbVar17 = this.a;
                                            if (kbVar17 != null) {
                                                kbVar17.w1(lbVar11.h, lbVar11.a);
                                            }
                                        }
                                    }
                                    if (this.d1 == 15) {
                                        float min9 = f10 > f11 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - lbVar11.f) + min3) / lbVar11.e) - lbVar11.h, f10) : Math.max((Math.max(0L, this.f - lbVar11.f) / lbVar11.e) - lbVar11.g, f10);
                                        float f39 = lbVar11.g + min9;
                                        lbVar11.g = f39;
                                        lbVar11.h += min9;
                                        kb kbVar18 = this.a;
                                        if (kbVar18 != null) {
                                            kbVar18.f1(f39, lbVar11.a);
                                            this.a.B1(lbVar11.a, lbVar11.f);
                                            this.a.w1(lbVar11.h, lbVar11.a);
                                        }
                                        kb kbVar19 = this.a;
                                        if (kbVar19 != null) {
                                            z15 = true;
                                            kbVar19.s0(true);
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
                            float f40 = lbVar2.e;
                            float f41 = (min3 / f40) * (x4 / this.q1);
                            if (i11 == 2) {
                                lbVar2.g = Utilities.clamp(lbVar2.g + f41, lbVar2.h - (1000.0f / f40), 0.0f);
                                kb kbVar20 = this.a;
                                if (kbVar20 != null) {
                                    kbVar20.I0(this.h.g, false);
                                }
                                lb lbVar12 = this.h;
                                float f42 = lbVar12.h - lbVar12.g;
                                float f43 = f();
                                lb lbVar13 = this.h;
                                if (f42 > f43 / lbVar13.e) {
                                    lbVar13.h = Math.min(1.0f, (f() / this.h.e) + lbVar13.g);
                                    kb kbVar21 = this.a;
                                    if (kbVar21 != null) {
                                        kbVar21.x1(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                lbVar2.h = Utilities.clamp(lbVar2.h + f41, 1.0f, (1000.0f / f40) + lbVar2.g);
                                kb kbVar22 = this.a;
                                if (kbVar22 != null) {
                                    kbVar22.x1(this.h.h);
                                }
                                lb lbVar14 = this.h;
                                float f44 = lbVar14.h - lbVar14.g;
                                float f45 = f();
                                lb lbVar15 = this.h;
                                if (f44 > f45 / lbVar15.e) {
                                    lbVar15.g = Math.max(0.0f, lbVar15.h - (f() / this.h.e));
                                    kb kbVar23 = this.a;
                                    if (kbVar23 != null) {
                                        kbVar23.I0(this.h.g, false);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min10 = f41 > 0.0f ? Math.min(1.0f - lbVar2.h, f41) : Math.max(-lbVar2.g, f41);
                                lb lbVar16 = this.h;
                                float f46 = lbVar16.g + min10;
                                lbVar16.g = f46;
                                lbVar16.h += min10;
                                kb kbVar24 = this.a;
                                if (kbVar24 != null) {
                                    kbVar24.I0(f46, false);
                                    this.a.x1(this.h.h);
                                }
                            }
                            float f47 = this.e;
                            lb lbVar17 = this.h;
                            float f48 = lbVar17.e;
                            float f49 = f47 / f48;
                            float f50 = lbVar17.g;
                            if (f49 < f50 || f49 > lbVar17.h) {
                                long j16 = (long) (f50 * f48);
                                this.e = j16;
                                kb kbVar25 = this.a;
                                if (kbVar25 != null) {
                                    kbVar25.I(j16, false);
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
                    lm0Var.a();
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
                                    float f51 = i23;
                                    float f52 = min11;
                                    float f53 = this.q1;
                                    int i24 = (int) (((this.f / f52) * f53) + f51);
                                    int c3 = (int) u3.c.c(this.h.e - min11, f52, f53, f51);
                                    this.n1 = true;
                                    this.o1 = i24;
                                    this.S0.c(i24, 0, -xVelocity, 0, i23, c3, 0, 0);
                                    z10 = false;
                                }
                            } else if (i21 == 1 && (velocityTracker4 = this.l1) != null) {
                                velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity2 = (int) this.l1.getXVelocity();
                                this.m1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long min12 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i25 = this.u1;
                                    float f54 = i25;
                                    float f55 = min12;
                                    float f56 = this.q1;
                                    int i26 = (int) (((this.f / f55) * f56) + f54);
                                    int c6 = (int) u3.c.c(this.h.e - min12, f55, f56, f54);
                                    this.n1 = true;
                                    this.o1 = i26;
                                    this.S0.c(i26, 0, -xVelocity2, 0, i25, c6, 0, 0);
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
                                    lb lbVar18 = this.h;
                                    if (lbVar18 != null) {
                                        float f57 = lbVar18.h;
                                        float f58 = lbVar18.e;
                                        j12 = this.N;
                                        j13 = (long) ((f57 * f58) - 0);
                                        f9 = lbVar18.g * f58;
                                    } else if (this.A) {
                                        float f59 = this.G;
                                        float f60 = this.D;
                                        j12 = this.N;
                                        j13 = (long) ((f59 * f60) - 0);
                                        f9 = this.F * f60;
                                    } else {
                                        j10 = -(this.N - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j11 = 0;
                                        this.n1 = z12;
                                        this.o1 = i27;
                                        float f61 = this.u1 + this.t1;
                                        float f62 = this.q1;
                                        this.S0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f62) + f61), (int) u3.c.c(j11, min13, f62, f61), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f9 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.n1 = z12;
                                    this.o1 = i27;
                                    float f612 = this.u1 + this.t1;
                                    float f622 = this.q1;
                                    this.S0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f622) + f612), (int) u3.c.c(j11, min13, f622, f612), 0, 0);
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
                                    lb lbVar19 = this.h;
                                    if (lbVar19 != null) {
                                        float f63 = lbVar19.h;
                                        float f64 = lbVar19.e;
                                        j14 = (long) ((lbVar19.g * f64) - this.D);
                                        j15 = (long) ((f63 * f64) - 0);
                                    } else {
                                        j14 = -(this.D - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.n1 = true;
                                    this.o1 = i28;
                                    float f65 = this.u1 + this.t1;
                                    float f66 = this.q1;
                                    this.S0.c(i28, 0, xVelocity4, 0, (int) (((j14 / min14) * f66) + f65), (int) u3.c.c(j15, min14, f66, f65), 0, 0);
                                    z10 = false;
                                }
                            }
                            z1Var = this.Z0;
                            if (z1Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(z1Var);
                                this.Z0 = null;
                            }
                            if (this.i1 || !z10 || (kbVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                kbVar.s0(false);
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
                                            this.a.i(((lb) arrayList.get(this.g1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i29 == 2 && !this.L) {
                                    this.L = true;
                                    this.C = false;
                                    kb kbVar26 = this.a;
                                    if (kbVar26 != null) {
                                        kbVar26.d1(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 && !this.C) {
                                    this.L = false;
                                    this.C = true;
                                    kb kbVar27 = this.a;
                                    if (kbVar27 != null) {
                                        kbVar27.d1(true);
                                    }
                                    invalidate();
                                } else if (i29 != 2 && this.L) {
                                    this.L = false;
                                    this.C = false;
                                    kb kbVar28 = this.a;
                                    if (kbVar28 != null) {
                                        kbVar28.d1(false);
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
                                    kb kbVar29 = this.a;
                                    if (kbVar29 != null) {
                                        kbVar29.d1(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.u1) - this.t1) / this.q1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                lb lbVar20 = this.h;
                                float f67 = lbVar20.h - lbVar20.g;
                                lbVar20.g = (1.0f - f67) * (clamp7 / getBaseDuration());
                                lb lbVar21 = this.h;
                                float f68 = lbVar21.g;
                                lbVar21.h = f67 + f68;
                                kb kbVar30 = this.a;
                                if (kbVar30 != null) {
                                    kbVar30.I0(f68, true);
                                    this.a.x1(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.f1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    z1Var = this.Z0;
                    if (z1Var != null) {
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
                this.T = new jb(this, this.K, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.Q = false;
                this.c0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        lh.e4 e4Var = new lh.e4(3);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, e4Var);
        lb lbVar = arrayList.isEmpty() ? null : (lb) arrayList.get(0);
        this.v = lbVar;
        if (lbVar != null) {
            long j10 = lbVar.f;
        }
    }

    public void setCollage(ArrayList<o7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ob obVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            lb lbVar = (lb) arrayList2.get(i10);
            if (lbVar != null && (obVar = lbVar.c) != null) {
                obVar.b();
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
            jb jbVar = (jb) arrayList3.get(i11);
            if (jbVar != null) {
                jbVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.d0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                o7 o7Var = arrayList.get(i12);
                if (o7Var.K) {
                    lb lbVar2 = new lb(this);
                    lbVar2.a = i12;
                    lbVar2.b = false;
                    lbVar2.d = o7Var.L.getAbsolutePath();
                    lbVar2.e = o7Var.h0;
                    lbVar2.f = o7Var.X;
                    lbVar2.i = o7Var.P;
                    lbVar2.g = o7Var.V;
                    lbVar2.h = o7Var.W;
                    lb.a(lbVar2, false);
                    lb.b(lbVar2);
                    arrayList2.add(lbVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(kb kbVar) {
        this.a = kbVar;
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
        lb lbVar = this.h;
        if (lbVar != null) {
            if (j10 < this.e) {
                float f9 = j10;
                long j11 = lbVar.e;
                if (f9 <= (j11 * lbVar.g) + 240.0f) {
                }
            }
        }
        if (this.J && !this.A && lbVar == null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j12 = this.N;
                if (f10 <= (j12 * this.O) + 240.0f) {
                }
            }
        }
        if (this.A && lbVar == null) {
            if (j10 < this.e) {
                float f11 = j10;
                long j13 = this.D;
                if (f11 <= (j13 * this.O) + 240.0f) {
                }
            }
        }
        this.e = j10;
        invalidate();
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f9) {
        lb lbVar = this.h;
        if (lbVar == null) {
            return;
        }
        lbVar.g = f9;
        invalidate();
    }

    public void setVideoRight(float f9) {
        lb lbVar = this.h;
        if (lbVar == null) {
            return;
        }
        lbVar.h = f9;
        invalidate();
    }
}
