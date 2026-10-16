package di;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.pn0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class uc extends View {
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
    public final tc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public sc M;
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
    public final pn0 W0;
    public boolean X0;
    public final bi.c3 Y0;
    public long Z0;
    public oc a;
    public nc a0;
    public long a1;
    public Runnable b;
    public int b0;
    public final org.telegram.ui.Components.g6 b1;
    public int c;
    public final org.telegram.ui.Components.g6 c0;
    public long c1;
    public Runnable d;
    public final org.telegram.ui.Components.g6 d0;
    public bi.g d1;
    public long e;
    public final org.telegram.ui.Components.g6 e0;
    public long e1;
    public long f;
    public final org.telegram.ui.Components.g6 f0;
    public long f1;
    public final org.telegram.ui.Components.g6 g0;
    public float g1;
    public pc h;
    public final org.telegram.ui.Components.g6 h0;
    public int h1;
    public final org.telegram.ui.Components.g6 i0;
    public int i1;
    public boolean j0;
    public int j1;
    public final org.telegram.ui.Components.la k0;
    public int k1;
    public final org.telegram.ui.Components.pa l0;
    public boolean l1;
    public final org.telegram.ui.Components.pa m0;
    public boolean m1;
    public int n;
    public final org.telegram.ui.Components.pa n0;
    public float n1;
    public final RectF o0;
    public boolean o1;
    public final Path p0;
    public VelocityTracker p1;
    public final i11 q0;
    public boolean q1;
    public final ArrayList r;
    public final Drawable r0;
    public boolean r1;
    public final ArrayList s;
    public final tc s0;
    public int s1;
    public final RectF t0;
    public final float[] t1;
    public final Paint u0;
    public int u1;
    public pc v;
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

    public uc(Context context, ViewGroup viewGroup, wb wbVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.la laVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new Paint(3);
        this.x = new Path();
        this.y = new Path();
        this.b0 = 1;
        es esVar = es.h;
        this.c0 = new org.telegram.ui.Components.g6(this, 0L, 360L, esVar);
        this.d0 = new org.telegram.ui.Components.g6(this, 360L, esVar);
        this.e0 = new org.telegram.ui.Components.g6(this, 0L, 360L, esVar);
        this.f0 = new org.telegram.ui.Components.g6(this, 360L, esVar);
        this.g0 = new org.telegram.ui.Components.g6(this, 0L, 360L, esVar);
        this.h0 = new org.telegram.ui.Components.g6(this, 0L, 360L, esVar);
        this.i0 = new org.telegram.ui.Components.g6(this, 0L, 320L, esVar);
        this.j0 = true;
        this.o0 = new RectF();
        this.p0 = new Path();
        this.s0 = new tc();
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
        this.I0 = new tc();
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
        this.W0 = new pn0(getContext(), null);
        this.Z0 = -1L;
        this.a1 = -1L;
        this.b1 = new org.telegram.ui.Components.g6(0.0f, this, 0L, 340L, esVar);
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
        this.q0 = new i11(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.k0 = laVar;
        this.l0 = new org.telegram.ui.Components.pa(laVar, this, 0, false);
        this.m0 = new org.telegram.ui.Components.pa(laVar, this, 3, false);
        this.n0 = new org.telegram.ui.Components.pa(laVar, this, 4, false);
        this.Y0 = new bi.c3(this, viewGroup, c6Var, laVar, wbVar, 5);
    }

    public static void a(final uc ucVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.la laVar, View view) {
        int i10;
        ArrayList arrayList = ucVar.s;
        int i11 = ucVar.j1;
        try {
            if (i11 == 2 && ucVar.N) {
                e8 e8Var = new e8(ucVar.getContext(), 0);
                e8Var.b = 0.0f;
                e8Var.c = 1.5f;
                e8Var.d(ucVar.V);
                final int i12 = 0;
                e8Var.h = new Utilities.Callback(ucVar) { // from class: di.mc
                    public final /* synthetic */ uc b;

                    {
                        this.b = ucVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f7.floatValue();
                                uc ucVar2 = this.b;
                                ucVar2.V = floatValue;
                                oc ocVar = ucVar2.a;
                                if (ocVar != null) {
                                    ocVar.k(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                uc ucVar3 = this.b;
                                ucVar3.L = floatValue2;
                                oc ocVar2 = ucVar3.a;
                                if (ocVar2 != null) {
                                    ocVar2.g(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                uc ucVar4 = this.b;
                                ucVar4.h.i = f7.floatValue();
                                oc ocVar3 = ucVar4.a;
                                if (ocVar3 != null) {
                                    ocVar3.D(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(ucVar.getBaseDuration(), ucVar.getMaxScrollDuration());
                int i13 = ucVar.v1;
                int i14 = ucVar.y1;
                int i15 = ucVar.x1;
                float min2 = Math.min((i13 - i14) - i15, ((((AndroidUtilities.lerp(ucVar.T, 1.0f, ucVar.f0.c) * ucVar.R) + (ucVar.Q - ucVar.f)) / min) * ucVar.u1) + i14 + i15);
                l80 F = l80.F(viewGroup, c6Var, ucVar);
                F.q(e8Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new lc(ucVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(ucVar.v1 - min2)) + AndroidUtilities.dp(18.0f), ucVar.F0.top);
                F.Z();
                F.R(laVar, -view.getX(), -view.getY());
                ucVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && ucVar.E) {
                e8 e8Var2 = new e8(ucVar.getContext(), 0);
                e8Var2.b = 0.0f;
                e8Var2.c = 1.5f;
                e8Var2.d(ucVar.L);
                final int i16 = 1;
                e8Var2.h = new Utilities.Callback(ucVar) { // from class: di.mc
                    public final /* synthetic */ uc b;

                    {
                        this.b = ucVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i16) {
                            case 0:
                                float floatValue = f7.floatValue();
                                uc ucVar2 = this.b;
                                ucVar2.V = floatValue;
                                oc ocVar = ucVar2.a;
                                if (ocVar != null) {
                                    ocVar.k(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                uc ucVar3 = this.b;
                                ucVar3.L = floatValue2;
                                oc ocVar2 = ucVar3.a;
                                if (ocVar2 != null) {
                                    ocVar2.g(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                uc ucVar4 = this.b;
                                ucVar4.h.i = f7.floatValue();
                                oc ocVar3 = ucVar4.a;
                                if (ocVar3 != null) {
                                    ocVar3.D(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(ucVar.getBaseDuration(), ucVar.getMaxScrollDuration());
                int i17 = ucVar.v1;
                int i18 = ucVar.y1;
                int i19 = ucVar.x1;
                float min4 = Math.min((i17 - i18) - i19, ((((AndroidUtilities.lerp(ucVar.K, 1.0f, ucVar.d0.c) * ucVar.H) + (ucVar.I - ucVar.f)) / min3) * ucVar.u1) + i18 + i19);
                l80 F2 = l80.F(viewGroup, c6Var, ucVar);
                F2.q(e8Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new lc(ucVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(ucVar.v1 - min4)) + AndroidUtilities.dp(18.0f), ucVar.x0.top);
                F2.Z();
                F2.R(laVar, -view.getX(), -view.getY());
                ucVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && ucVar.h != null) {
                e8 e8Var3 = new e8(ucVar.getContext(), 0);
                e8Var3.b = 0.0f;
                e8Var3.c = 1.5f;
                e8Var3.d(ucVar.h.i);
                final int i20 = 2;
                e8Var3.h = new Utilities.Callback(ucVar) { // from class: di.mc
                    public final /* synthetic */ uc b;

                    {
                        this.b = ucVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i20) {
                            case 0:
                                float floatValue = f7.floatValue();
                                uc ucVar2 = this.b;
                                ucVar2.V = floatValue;
                                oc ocVar = ucVar2.a;
                                if (ocVar != null) {
                                    ocVar.k(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                uc ucVar3 = this.b;
                                ucVar3.L = floatValue2;
                                oc ocVar2 = ucVar3.a;
                                if (ocVar2 != null) {
                                    ocVar2.g(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                uc ucVar4 = this.b;
                                ucVar4.h.i = f7.floatValue();
                                oc ocVar3 = ucVar4.a;
                                if (ocVar3 != null) {
                                    ocVar3.D(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                l80 F3 = l80.F(viewGroup, c6Var, ucVar);
                F3.q(e8Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), ucVar.t0.top);
                F3.Z();
                F3.R(laVar, -view.getX(), -view.getY());
                ucVar.performHapticFeedback(0, 1);
            } else {
                if (i11 != 3 || (i10 = ucVar.k1) < 0 || i10 >= arrayList.size()) {
                    return;
                }
                pc pcVar = (pc) arrayList.get(ucVar.k1);
                e8 e8Var4 = new e8(ucVar.getContext(), 0);
                e8Var4.b = 0.0f;
                e8Var4.c = 1.5f;
                e8Var4.d(pcVar.i);
                e8Var4.h = new bi.v2(8, ucVar, pcVar);
                l80 F4 = l80.F(viewGroup, c6Var, ucVar);
                F4.q(e8Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), pcVar.j.top);
                F4.Z();
                F4.R(laVar, -view.getX(), -view.getY());
                ucVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f0.e(this.P));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        pc pcVar = this.h;
        if (pcVar != null) {
            return Math.max(1L, pcVar.e);
        }
        pc pcVar2 = this.v;
        return pcVar2 != null ? Math.max(1L, pcVar2.e) : this.E ? Math.max(1L, this.H) : Math.max(1L, this.R);
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
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((pc) arrayList.get(i10)).k.c);
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
        int i10;
        pc pcVar;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.e, getBaseDuration(), 0L);
        pc pcVar2 = this.v;
        float f7 = min;
        float f10 = (this.u1 * (((clamp + (pcVar2 != null ? (pcVar2.g * pcVar2.e) + pcVar2.f : this.h == null ? this.Q : 0L)) - this.f) / f7)) + this.y1 + this.x1;
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
                            pc pcVar3 = this.h;
                            float f12 = pcVar3.g;
                            float f13 = pcVar3.e;
                            float f14 = this.f;
                            float f15 = this.u1;
                            float f16 = ((((f12 * f13) - f14) / f7) * f15) + f11;
                            float f17 = ((((pcVar3.h * f13) - f14) / f7) * f15) + f11;
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
                                pc pcVar4 = this.h;
                                if (pcVar4.g > 0.01f || pcVar4.h < 0.99f) {
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
                                long j10 = this.I;
                                long j11 = this.f;
                                float f27 = this.u1;
                                float f28 = (((j10 - j11) / f7) * f27) + f26;
                                f25 = a1.g.d((j10 + this.H) - j11, f7, f27, f26);
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
                                long j12 = this.Q;
                                long j13 = this.f;
                                float f38 = this.u1;
                                float f39 = (((j12 - j13) / f7) * f38) + f37;
                                f36 = a1.g.d((j12 + this.R) - j13, f7, f38, f37);
                                f35 = f39;
                            }
                            if (x10 >= f35 && x10 <= f36) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            pc pcVar5 = (pc) arrayList.get(i11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(pcVar5.j);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x10, y3)) {
                                float f40 = this.y1 + this.x1;
                                float f41 = pcVar5.f;
                                float f42 = this.u1;
                                float f43 = ((f41 / f7) * f42) + f40;
                                float f44 = pcVar5.g;
                                float f45 = pcVar5.e;
                                float f46 = ((((f44 * f45) + f41) / f7) * f42) + f40;
                                float f47 = ((((pcVar5.h * f45) + f41) / f7) * f42) + f40;
                                float d = a1.g.d(r6 + r11, f7, f42, f40);
                                this.i1 = i11;
                                if (x10 >= f46 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f46) {
                                    return 13;
                                }
                                if (x10 >= f47 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f47) {
                                    return 14;
                                }
                                if (x10 < f46 || x10 > f47 || (pcVar5.g <= 0.01f && pcVar5.h >= 0.99f)) {
                                    return (x10 < f43 || x10 > d) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i10 = 1;
                    }
                    pcVar = this.h;
                    if (pcVar != null || pcVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        pcVar = this.h;
        return pcVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        pn0 pn0Var = this.W0;
        if (!pn0Var.b()) {
            if (this.r1) {
                this.r1 = false;
                oc ocVar = this.a;
                if (ocVar != null) {
                    ocVar.y(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = pn0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.q1) {
            this.f = (long) Math.max(0.0f, (((i10 - this.y1) - this.x1) / this.u1) * min);
        } else {
            if (!this.P) {
                pn0Var.a();
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

    public final void d(Canvas canvas, float f7, float f10, long j10, float f11) {
        float f12;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(j10, getBaseDuration(), 0L);
        pc pcVar = this.v;
        if (pcVar != null) {
            f12 = (pcVar.g * pcVar.e) + pcVar.f;
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

    /* JADX WARN: Incorrect condition in loop: B:120:0x06a4 */
    /* JADX WARN: Incorrect condition in loop: B:137:0x06ef */
    /* JADX WARN: Incorrect condition in loop: B:208:0x09b3 */
    /* JADX WARN: Incorrect condition in loop: B:225:0x0a00 */
    /* JADX WARN: Incorrect condition in loop: B:67:0x03e1 */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0ed1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        long j10;
        Paint paint;
        ArrayList arrayList;
        float f7;
        org.telegram.ui.Components.pa paVar;
        RectF rectF2;
        int i10;
        long j11;
        int i11;
        pc pcVar;
        pc pcVar2;
        int i12;
        float f10;
        float max;
        long j12;
        float f11;
        Canvas canvas2;
        boolean z10;
        float f12;
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
        float f34;
        float f35;
        float f36;
        float f37;
        float lerp;
        float w9;
        float f38;
        RectF rectF4;
        float f39;
        float f40;
        float f41;
        float dpf2;
        float f42;
        float f43;
        float d10;
        float f44;
        float f45;
        long j14;
        float f46;
        float f47;
        float f48;
        ArrayList arrayList4;
        int i13;
        boolean z11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i14;
        int i15;
        float f49;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i16;
        RectF rectF5;
        ArrayList arrayList9;
        float f50;
        float f51;
        Path path;
        float d11;
        float f52;
        float f53;
        float f54;
        int i17;
        long j15;
        float f55;
        float f56;
        float f57;
        ArrayList arrayList10;
        boolean z12;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z13;
        int i18;
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
        int i19;
        boolean z14;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        org.telegram.ui.Components.pa paVar2;
        char c10;
        boolean z15;
        uc ucVar = this;
        RectF rectF6 = ucVar.t0;
        RectF rectF7 = ucVar.x0;
        Path path2 = ucVar.w0;
        ArrayList arrayList20 = ucVar.r;
        Drawable drawable = ucVar.r0;
        org.telegram.ui.Components.la laVar = ucVar.k0;
        RectF rectF8 = ucVar.F0;
        ArrayList arrayList21 = ucVar.s;
        RectF rectF9 = ucVar.o0;
        org.telegram.ui.Components.pa paVar3 = ucVar.l0;
        Paint c11 = paVar3.c(1.0f);
        float e = ucVar.i0.e(ucVar.j0);
        long min = Math.min(ucVar.getBaseDuration(), ucVar.getMaxScrollDuration());
        if (e < 1.0f) {
            rectF9.set(ucVar.y1, (ucVar.w1 - ucVar.z1) - AndroidUtilities.dp(28.0f), ucVar.v1 - ucVar.y1, ucVar.w1 - ucVar.z1);
            ucVar.p0.rewind();
            ucVar.p0.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - e) * 255.0f), 31);
            canvas.clipPath(ucVar.p0);
            if (laVar.c()) {
                paVar3.a(canvas);
                canvas.drawColor(855638016);
                paint3 = c11;
            } else if (c11 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint3 = c11;
            } else {
                paint3 = c11;
                canvas.drawRect(rectF9, paint3);
                canvas.drawColor(855638016);
            }
            if (arrayList20.isEmpty() || !laVar.c()) {
                paint4 = paint3;
                rectF = rectF6;
                paVar2 = paVar3;
                j10 = min;
                c10 = 31;
                if (!arrayList20.isEmpty()) {
                    Paint c12 = ucVar.n0.c(0.4f);
                    if (c12 == null) {
                        c12 = ucVar.H0;
                        c12.setAlpha(64);
                    }
                    z15 = false;
                    ucVar.s0.a((((ucVar.Q - ucVar.f) / j10) * ucVar.u1) + ucVar.y1 + ucVar.x1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), ucVar.h0.d(tc.c(arrayList20), false), rectF9.bottom, arrayList20);
                    canvas.drawPath(ucVar.s0, c12);
                    float h = ((ucVar.q0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - h);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.Cells.c1.c(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.c1.u(2, centerY, drawable));
                    drawable.setAlpha(191);
                    drawable.draw(canvas);
                    i11 i11Var = ucVar.q0;
                    float centerX2 = (rectF9.centerX() - h) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
                    float f64 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    paVar = paVar2;
                    f7 = 0.4f;
                    i11Var.c(centerX2, f64, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float d12 = ucVar.h0.d(tc.c(arrayList20), false);
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j10 = min;
                paVar2 = paVar3;
                ucVar.s0.a((((ucVar.Q - ucVar.f) / min) * ucVar.u1) + ucVar.y1 + ucVar.x1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), d12, rectF9.bottom, arrayList20);
                c10 = 31;
                canvas.saveLayerAlpha(rectF9, 102, 31);
                canvas.clipPath(ucVar.s0);
                ucVar.n0.a(canvas);
                canvas.restore();
            }
            z15 = false;
            float h10 = ((ucVar.q0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - h10);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.Cells.c1.c(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.c1.u(2, centerY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            i11 i11Var2 = ucVar.q0;
            float centerX22 = (rectF9.centerX() - h10) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
            float f642 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            paVar = paVar2;
            f7 = 0.4f;
            i11Var2.c(centerX22, f642, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c11;
            arrayList = arrayList21;
            f7 = 0.4f;
            paVar = paVar3;
            rectF2 = rectF8;
        }
        if (e > 0.0f) {
            if (e < 1.0f) {
                f11 = 0.0f;
                j12 = j10;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, ucVar.getWidth(), ucVar.getHeight(), (int) (e * 255.0f), 31);
                z10 = true;
            } else {
                j12 = j10;
                f11 = 0.0f;
                canvas2 = canvas;
                z10 = false;
            }
            pc pcVar3 = ucVar.h;
            float f65 = pcVar3 != null ? 1.0f : f11;
            float e7 = pcVar3 != null ? pcVar3.k.e((ucVar.P || ucVar.G) ? false : true) : f11;
            float f66 = ucVar.w1 - ucVar.z1;
            float dp = AndroidUtilities.dp(4.0f);
            if (ucVar.h != null) {
                canvas2.save();
                float videoHeight = ucVar.getVideoHeight();
                pc pcVar4 = ucVar.h;
                float f67 = pcVar4.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j16 = pcVar4.e;
                float f68 = j16;
                float t10 = com.google.android.gms.internal.play_billing.k3.t(f67, f68, e7, f11);
                float t11 = com.google.android.gms.internal.play_billing.k3.t(pcVar4.h, f68, e7, f11);
                if (j16 <= 0) {
                    f12 = e7;
                    f14 = f11;
                    f59 = f65;
                    j13 = j12;
                    f16 = dp;
                    f60 = f14;
                } else {
                    f14 = f11;
                    f12 = e7;
                    f59 = f65;
                    j13 = j12;
                    f16 = dp;
                    f60 = (ucVar.y1 + ucVar.x1) - (ucVar.u1 * (ucVar.f / j13));
                }
                f19 = t10;
                float f69 = ucVar.x1;
                float f70 = f60 - f69;
                if (j16 <= 0) {
                    f61 = f69;
                    f18 = t11;
                    f62 = f14;
                } else {
                    f61 = f69;
                    f18 = t11;
                    f62 = (((j16 - ucVar.f) / j13) * ucVar.u1) + ucVar.y1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f70, f66 - videoHeight, f62 + f61, f66);
                float f71 = f66 - ((f16 * f59) + videoHeight);
                float f72 = (rectF10.top * f12) + f14;
                f17 = (rectF10.bottom * f12) + f14;
                ucVar.v0.rewind();
                ucVar.v0.addRoundRect(rectF10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ucVar.v0);
                sc scVar = ucVar.h.c;
                if (scVar != null) {
                    int i20 = scVar.f;
                    float f73 = i20;
                    f20 = f72;
                    int max2 = (int) Math.max(0.0d, Math.floor((f70 - ucVar.y1) / f73));
                    f13 = f59;
                    int min2 = (int) Math.min(ucVar.h.c.c, Math.ceil(((r6 - f70) - ucVar.y1) / f73) + 1.0d);
                    int i21 = (int) rectF10.top;
                    arrayList15 = ucVar.h.c.d;
                    boolean z16 = arrayList15.size() >= min2;
                    boolean z17 = (i20 == 0 || !z16 || ucVar.h.b) ? false : true;
                    if (z17) {
                        int i22 = max2;
                        while (true) {
                            arrayList18 = ucVar.h.c.d;
                            if (i22 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = ucVar.h.c.d;
                            if (((rc) arrayList19.get(i22)).a == null) {
                                z17 = false;
                                break;
                            }
                            i22++;
                        }
                    }
                    if (!z17) {
                        if (laVar.c()) {
                            paVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF10, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i20 != 0) {
                        float f74 = f70;
                        int i23 = max2;
                        while (i23 < Math.min(arrayList16.size(), min2)) {
                            arrayList17 = ucVar.h.c.d;
                            rc rcVar = (rc) arrayList17.get(i23);
                            if (rcVar.a != null) {
                                i19 = min2;
                                z14 = z16;
                                ucVar.u0.setAlpha((int) (rcVar.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(rcVar.a, f74, i21 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), ucVar.u0);
                            } else {
                                i19 = min2;
                                z14 = z16;
                            }
                            f74 += f73;
                            i23++;
                            z16 = z14;
                            min2 = i19;
                        }
                    }
                    boolean z18 = z16;
                    f63 = 1.0f;
                    if (!z18) {
                        ucVar.h.c.c();
                    }
                } else {
                    f20 = f72;
                    f13 = f59;
                    f63 = 1.0f;
                }
                path2.rewind();
                if (ucVar.X0) {
                    f15 = f63;
                } else {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    int i24 = ucVar.y1;
                    int i25 = ucVar.x1;
                    float f75 = i24 + i25;
                    pc pcVar5 = ucVar.h;
                    float f76 = pcVar5.g;
                    f15 = f63;
                    int i26 = i25;
                    float f77 = pcVar5.e;
                    float f78 = ucVar.f;
                    float f79 = (f76 * f77) - f78;
                    float f80 = j13;
                    float f81 = ucVar.u1;
                    float f82 = (((f79 / f80) * f81) + f75) - (f76 <= f14 ? i26 : 0);
                    float f83 = ucVar.w1 - ucVar.z1;
                    float f84 = f83 - videoHeight;
                    float f85 = pcVar5.h;
                    float f86 = ((((f77 * f85) - f78) / f80) * f81) + f75;
                    if (f85 < f15) {
                        i26 = 0;
                    }
                    rectF11.set(f82, f84, f86 + i26, f83);
                    path2.addRoundRect(rectF11, ucVar.t1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f11 = videoHeight;
                f66 = f71;
            } else {
                f12 = e7;
                f13 = f65;
                f14 = f11;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j13 = j12;
                f15 = 1.0f;
                f16 = dp;
                f17 = f11;
                f18 = f17;
                f19 = f18;
                f20 = f19;
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                f21 = f11;
                f22 = 0.0f;
            } else {
                ucVar.getCollageHeight();
                float f87 = f66;
                int i27 = 0;
                while (i27 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    pc pcVar6 = (pc) arrayList22.get(i27);
                    org.telegram.ui.Components.g6 g6Var = pcVar6.k;
                    RectF rectF12 = pcVar6.j;
                    float f88 = f11;
                    float e10 = g6Var.e((ucVar.P || ucVar.G || ucVar.n != i27) ? false : true);
                    if (pcVar6 != ucVar.v) {
                        i16 = i27;
                        arrayList9 = arrayList22;
                        float f89 = j13;
                        f50 = f17;
                        f51 = ((((AndroidUtilities.lerp(pcVar6.g, f14, e10) * pcVar6.e) + (pcVar6.f - ucVar.f)) / f89) * ucVar.u1) + ucVar.y1 + ucVar.x1;
                        rectF5 = rectF7;
                        d11 = (com.google.android.gms.internal.play_billing.k3.w(AndroidUtilities.lerp(pcVar6.h, f15, e10), pcVar6.e, pcVar6.f - ucVar.f, f89) * ucVar.u1) + ucVar.y1 + ucVar.x1;
                        path = path2;
                    } else {
                        i16 = i27;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f50 = f17;
                        float f90 = ucVar.y1 + ucVar.x1;
                        float f91 = j13;
                        float f92 = (pcVar6.f - ucVar.f) / f91;
                        float f93 = ucVar.u1;
                        f51 = (f92 * f93) + f90;
                        path = path2;
                        d11 = a1.g.d(r8 + pcVar6.e, f91, f93, f90);
                    }
                    float f94 = f51;
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), e10);
                    float f95 = ucVar.x1;
                    rectF12.set(f94 - f95, f87 - lerp2, d11 + f95, f87);
                    f20 = (rectF12.top * e10) + f20;
                    f17 = (rectF12.bottom * e10) + f50;
                    float f96 = pcVar6.f;
                    float f97 = pcVar6.g;
                    float f98 = f87;
                    float f99 = pcVar6.e;
                    f19 = (((f97 * f99) + f96) * e10) + f19;
                    f18 = (((pcVar6.h * f99) + f96) * e10) + f18;
                    ucVar.x.rewind();
                    ucVar.x.addRoundRect(rectF12, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(ucVar.x);
                    sc scVar2 = pcVar6.c;
                    if (scVar2 != null) {
                        long j17 = pcVar6.e;
                        f52 = lerp2;
                        if (j17 <= 0) {
                            j15 = j17;
                            f55 = 0.0f;
                        } else {
                            j15 = j17;
                            f55 = ucVar.y1 + ucVar.x1 + (((pcVar6.f - ucVar.f) / j13) * ucVar.u1);
                        }
                        float f100 = ucVar.x1;
                        float f101 = f55 - f100;
                        if (j17 <= 0) {
                            f56 = f100;
                            f57 = 0.0f;
                        } else {
                            f56 = f100;
                            f57 = ((((pcVar6.f + j15) - ucVar.f) / j13) * ucVar.u1) + ucVar.y1 + r7;
                        }
                        float f102 = f57 + f56;
                        int i28 = scVar2.f;
                        float f103 = i28;
                        int max3 = (int) Math.max(0.0d, Math.floor((f101 - ((((pcVar6.f - ucVar.f) / j13) * ucVar.u1) + (ucVar.y1 + ucVar.x1))) / f103));
                        int min3 = (int) Math.min(pcVar6.c.c, Math.ceil((f102 - f101) / f103) + 1.0d);
                        int i29 = (int) rectF12.top;
                        arrayList10 = pcVar6.c.d;
                        boolean z19 = arrayList10.size() >= min3;
                        if (z19) {
                            for (int i30 = max3; i30 < Math.min(arrayList13.size(), min3); i30++) {
                                arrayList14 = pcVar6.c.d;
                                if (((rc) arrayList14.get(i30)).a == null) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = z19;
                        if (!z12) {
                            if (laVar.c()) {
                                paVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i28 != 0) {
                            float f104 = f101;
                            while (max3 < Math.min(arrayList11.size(), min3)) {
                                arrayList12 = pcVar6.c.d;
                                rc rcVar2 = (rc) arrayList12.get(max3);
                                int i31 = min3;
                                if (rcVar2.a != null) {
                                    z13 = z19;
                                    i18 = max3;
                                    f58 = f98;
                                    ucVar.w.setAlpha((int) (rcVar2.b.d(1.0f, false) * 255.0f));
                                    canvas2.drawBitmap(rcVar2.a, f104, i29 - ((int) ((r4.getHeight() - f52) / 2.0f)), ucVar.w);
                                } else {
                                    z13 = z19;
                                    i18 = max3;
                                    f58 = f98;
                                }
                                f104 += f103;
                                max3 = i18 + 1;
                                min3 = i31;
                                z19 = z13;
                                f98 = f58;
                            }
                        }
                        f53 = f98;
                        if (!z19) {
                            pcVar6.c.c();
                        }
                    } else {
                        f52 = lerp2;
                        f53 = f98;
                    }
                    ucVar.y.rewind();
                    if (!ucVar.X0) {
                        RectF rectF13 = AndroidUtilities.rectTmp;
                        int i32 = ucVar.y1;
                        int i33 = ucVar.x1;
                        float f105 = i32 + i33;
                        float f106 = pcVar6.g;
                        float f107 = pcVar6.e;
                        float f108 = ucVar.f;
                        float f109 = (f106 * f107) - f108;
                        float f110 = pcVar6.f;
                        float f111 = j13;
                        float f112 = ucVar.u1;
                        float f113 = (((f109 + f110) / f111) * f112) + f105;
                        if (f106 <= 0.0f) {
                            f54 = f112;
                            i17 = i33;
                        } else {
                            f54 = f112;
                            i17 = 0;
                        }
                        float f114 = f113 - i17;
                        float f115 = rectF12.top;
                        float f116 = pcVar6.h;
                        rectF13.set(f114, f115, (((((f107 * f116) - f108) + f110) / f111) * f54) + f105 + (f116 >= 1.0f ? i33 : 0), rectF12.bottom);
                        ucVar.y.addRoundRect(rectF13, ucVar.t1, Path.Direction.CW);
                        canvas2.clipPath(ucVar.y, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f87 = f53 - ((f16 * 1.0f) + f52);
                    i27 = i16 + 1;
                    path2 = path;
                    f11 = f88;
                    arrayList2 = arrayList9;
                    rectF7 = rectF5;
                    f15 = 1.0f;
                    f14 = 0.0f;
                }
                arrayList3 = arrayList2;
                f21 = f11;
                f66 = f87;
                f22 = 1.0f;
            }
            RectF rectF14 = rectF7;
            Path path3 = path2;
            float e11 = ucVar.c0.e(ucVar.E);
            float e12 = ucVar.d0.e(ucVar.E && ucVar.G);
            float roundHeight = ucVar.getRoundHeight() * e11;
            float f117 = ((ucVar.h == null && !ucVar.N && arrayList3.isEmpty()) ? 1.0f : e12) * e11;
            if (e11 > 0.0f) {
                long j18 = ucVar.I;
                float f118 = j18;
                float f119 = ucVar.J;
                float f120 = ucVar.H;
                f19 = (((f119 * f120) + f118) * f117) + f19;
                f18 = (((ucVar.K * f120) + f118) * f117) + f18;
                if (ucVar.h != null) {
                    float f121 = j13;
                    float lerp3 = ((((ucVar.H * AndroidUtilities.lerp(f119, 0.0f, e12)) + (j18 - ucVar.f)) / f121) * ucVar.u1) + ucVar.y1 + ucVar.x1;
                    f43 = f17;
                    f23 = f22;
                    d10 = (com.google.android.gms.internal.play_billing.k3.w(AndroidUtilities.lerp(ucVar.K, 1.0f, e12), ucVar.H, ucVar.I - ucVar.f, f121) * ucVar.u1) + ucVar.y1 + ucVar.x1;
                    f44 = lerp3;
                } else {
                    f23 = f22;
                    f43 = f17;
                    float f122 = ucVar.y1 + ucVar.x1;
                    long j19 = j18 - ucVar.f;
                    float f123 = j13;
                    float f124 = ucVar.u1;
                    float f125 = ((j19 / f123) * f124) + f122;
                    d10 = a1.g.d(j19 + r6, f123, f124, f122);
                    f44 = f125;
                }
                float f126 = ucVar.x1;
                rectF14.set(f44 - f126, f66 - roundHeight, d10 + f126, f66);
                float f127 = f66 - ((f16 * e11) + roundHeight);
                f20 = (rectF14.top * f117) + f20;
                f17 = (rectF14.bottom * f117) + f43;
                ucVar.y0.rewind();
                ucVar.y0.addRoundRect(rectF14, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(ucVar.y0);
                sc scVar3 = ucVar.M;
                if (scVar3 != null) {
                    float f128 = e12;
                    long j20 = ucVar.H;
                    if (j20 <= 0) {
                        f45 = f127;
                        j14 = j20;
                        f46 = 0.0f;
                    } else {
                        f45 = f127;
                        j14 = j20;
                        f46 = ucVar.y1 + ucVar.x1 + (((ucVar.I - ucVar.f) / j13) * ucVar.u1);
                    }
                    float f129 = ucVar.x1;
                    float f130 = f46 - f129;
                    if (j20 <= 0) {
                        f47 = f129;
                        f48 = 0.0f;
                    } else {
                        f47 = f129;
                        f48 = ucVar.y1 + r10 + ((((ucVar.I + j14) - ucVar.f) / j13) * ucVar.u1);
                    }
                    float f131 = f48 + f47;
                    int i34 = scVar3.f;
                    float f132 = i34;
                    float f133 = f130;
                    int max4 = (int) Math.max(0.0d, Math.floor((f130 - (ucVar.h != null ? (((ucVar.I - ucVar.f) / j13) * ucVar.u1) + (ucVar.y1 + ucVar.x1) : ucVar.y1)) / f132));
                    int min4 = (int) Math.min(ucVar.M.c, Math.ceil((f131 - f133) / f132) + 1.0d);
                    int i35 = (int) rectF14.top;
                    arrayList4 = ucVar.M.d;
                    boolean z20 = arrayList4.size() >= min4;
                    if (z20) {
                        int i36 = max4;
                        i13 = i36;
                        while (i36 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = ucVar.M.d;
                            if (((rc) arrayList8.get(i36)).a == null) {
                                z11 = false;
                                break;
                            }
                            i36++;
                        }
                    } else {
                        i13 = max4;
                    }
                    z11 = z20;
                    if (!z11) {
                        if (laVar.c()) {
                            paVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF14, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i34 != 0) {
                        int i37 = i13;
                        while (i37 < Math.min(arrayList5.size(), min4)) {
                            arrayList6 = ucVar.M.d;
                            rc rcVar3 = (rc) arrayList6.get(i37);
                            int i38 = i37;
                            if (rcVar3.a != null) {
                                i14 = min4;
                                i15 = i35;
                                f49 = f128;
                                ucVar.u0.setAlpha((int) (rcVar3.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(rcVar3.a, f133, i15 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), ucVar.u0);
                            } else {
                                i14 = min4;
                                i15 = i35;
                                f49 = f128;
                            }
                            f133 += f132;
                            i37 = i38 + 1;
                            min4 = i14;
                            i35 = i15;
                            f128 = f49;
                        }
                    }
                    f24 = f128;
                    if (!z20) {
                        ucVar.M.c();
                    }
                } else {
                    f45 = f127;
                    f24 = e12;
                }
                path3.rewind();
                RectF rectF15 = AndroidUtilities.rectTmp;
                int i39 = ucVar.y1;
                int i40 = ucVar.x1;
                float f134 = i39 + i40;
                float f135 = ucVar.J;
                float f136 = ucVar.H;
                float f137 = f135 * f136;
                float f138 = ucVar.f;
                float f139 = f137 - f138;
                float f140 = ucVar.I;
                float f141 = j13;
                float f142 = (f139 + f140) / f141;
                float f143 = ucVar.u1;
                float f144 = (1.0f - f24) * i40;
                float f145 = (((f142 * f143) + f134) - (f135 <= 0.0f ? i40 : 0)) - f144;
                float f146 = rectF14.top;
                float f147 = ucVar.K;
                float f148 = (((((f136 * f147) - f138) + f140) / f141) * f143) + f134;
                if (f147 < 1.0f) {
                    i40 = 0;
                }
                rectF15.set(f145, f146, f148 + i40 + f144, rectF14.bottom);
                path3.addRoundRect(rectF15, ucVar.t1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f66 = f45;
            } else {
                f23 = f22;
                f24 = e12;
            }
            float e13 = ucVar.e0.e(ucVar.N);
            float e14 = ucVar.f0.e(ucVar.N && ucVar.P);
            float audioHeight = ucVar.getAudioHeight() * e13;
            float f149 = ((ucVar.h == null && !ucVar.E && arrayList3.isEmpty()) ? 1.0f : e14) * e13;
            if (e13 > 0.0f) {
                float f150 = ucVar.Q;
                float f151 = ucVar.S;
                float f152 = ucVar.R;
                f19 = (((f151 * f152) + f150) * f149) + f19;
                f18 = (((ucVar.T * f152) + f150) * f149) + f18;
                Paint c13 = ucVar.m0.c(e13);
                canvas2.save();
                if (ucVar.h == null && !ucVar.E && arrayList3.isEmpty()) {
                    float f153 = ucVar.y1 + ucVar.x1;
                    f37 = f17;
                    float f154 = ucVar.Q - ucVar.f;
                    float f155 = j13;
                    float f156 = ucVar.u1;
                    float f157 = ((f154 / f155) * f156) + f153;
                    paint2 = paint;
                    f36 = f149;
                    w9 = a1.g.d(r10 + ucVar.R, f155, f156, f153);
                    lerp = f157;
                } else {
                    f36 = f149;
                    f37 = f17;
                    paint2 = paint;
                    float f158 = j13;
                    lerp = ((((AndroidUtilities.lerp(ucVar.S, 0.0f, e14) * ucVar.R) + (ucVar.Q - ucVar.f)) / f158) * ucVar.u1) + ucVar.y1 + ucVar.x1;
                    w9 = ucVar.y1 + ucVar.x1 + (com.google.android.gms.internal.play_billing.k3.w(AndroidUtilities.lerp(ucVar.T, 1.0f, e14), ucVar.R, ucVar.Q - ucVar.f, f158) * ucVar.u1);
                }
                float f159 = w9;
                float f160 = ucVar.x1;
                RectF rectF16 = rectF3;
                rectF16.set(lerp - f160, f66 - audioHeight, f159 + f160, f66);
                f20 = (rectF16.top * f36) + f20;
                float f161 = (rectF16.bottom * f36) + f37;
                ucVar.G0.rewind();
                ucVar.G0.addRoundRect(rectF16, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ucVar.G0);
                if (laVar != null && laVar.c()) {
                    paVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(e13, 855638016));
                } else if (c13 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(e13, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c13);
                    canvas2.drawColor(org.telegram.ui.ActionBar.g6.m1(e13, 855638016));
                }
                if (ucVar.a0 == null || laVar == null || !laVar.c()) {
                    f38 = e14;
                    rectF4 = rectF16;
                    i10 = 1;
                    if (ucVar.a0 != null && c13 != null) {
                        Paint c14 = ucVar.n0.c(e13 * f7);
                        if (c14 == null) {
                            c14 = ucVar.H0;
                            c14.setAlpha((int) (64.0f * e13));
                        }
                        float d13 = ucVar.g0.d(ucVar.a0.e, !ucVar.U);
                        nc ncVar = ucVar.a0;
                        ucVar.U = ncVar.c > 0;
                        long j21 = j13;
                        ucVar.I0.b((((ucVar.Q - ucVar.f) / j13) * ucVar.u1) + ucVar.y1 + ucVar.x1, lerp, f159, f38, j21, audioHeight, d13, rectF4.bottom, ncVar);
                        f39 = f38;
                        j11 = j21;
                        canvas2.drawPath(ucVar.I0, c14);
                        if (f39 >= 1.0f) {
                            int i41 = ucVar.y1;
                            float f162 = ucVar.x1 + i41;
                            float f163 = ucVar.Q - ucVar.f;
                            float f164 = ucVar.S;
                            float f165 = ucVar.R;
                            float f166 = j11;
                            float f167 = ucVar.u1;
                            float f168 = ((((f164 * f165) + f163) / f166) * f167) + f162;
                            float f169 = ((((ucVar.T * f165) + f163) / f166) * f167) + f162;
                            float min5 = (Math.min(ucVar.v1 - ucVar.y1, f169) + Math.max(i41, f168)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(ucVar.v1 - ucVar.y1, f169) - Math.max(ucVar.y1, f168)) - AndroidUtilities.dp(24.0f));
                            float dpf22 = AndroidUtilities.dpf2(13.0f);
                            if (ucVar.M0 == null && ucVar.Q0 == null) {
                                f41 = 13.0f;
                                dpf2 = 0.0f;
                            } else {
                                f41 = 13.0f;
                                dpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + ucVar.N0 + ucVar.R0;
                            }
                            float f170 = dpf22 + dpf2;
                            int i42 = f170 < max5 ? i10 : 0;
                            float min6 = min5 - (Math.min(f170, max5) / 2.0f);
                            ucVar.K0.setBounds((int) min6, (int) (centerY3 - (AndroidUtilities.dp(f41) / 2.0f)), (int) (AndroidUtilities.dp(f41) + min6), (int) ((AndroidUtilities.dp(f41) / 2.0f) + centerY3));
                            float f171 = 1.0f - f39;
                            float f172 = f171 * 255.0f;
                            ucVar.K0.setAlpha((int) f172);
                            ucVar.K0.draw(canvas2);
                            float dpf23 = AndroidUtilities.dpf2(16.11f) + min6;
                            f40 = f161;
                            f27 = f12;
                            d = 0.0d;
                            f26 = e13;
                            f25 = f39;
                            f28 = f13;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, ucVar.v1, ucVar.w1, 255, 31);
                            float min7 = Math.min(f169, ucVar.v1) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf23, 0.0f, min7, ucVar.w1);
                            if (ucVar.M0 != null) {
                                canvas2.save();
                                canvas2.translate(dpf23 - ucVar.O0, centerY3 - (ucVar.M0.getHeight() / 2.0f));
                                ucVar.L0.setAlpha((int) (f172 * f26));
                                ucVar.M0.draw(canvas2);
                                canvas2.restore();
                                f42 = ucVar.N0 + dpf23;
                            } else {
                                f42 = dpf23;
                            }
                            if (ucVar.M0 != null && ucVar.Q0 != null) {
                                float dpf24 = AndroidUtilities.dpf2(3.66f) + f42;
                                int alpha = ucVar.J0.getAlpha();
                                ucVar.J0.setAlpha((int) (alpha * f171));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf24, centerY3, AndroidUtilities.dp(1.0f), ucVar.J0);
                                ucVar.J0.setAlpha(alpha);
                                f42 = AndroidUtilities.dpf2(2.0f) + dpf24 + AndroidUtilities.dpf2(4.0f);
                            }
                            if (ucVar.Q0 != null) {
                                canvas2.save();
                                canvas2.translate(f42 - ucVar.S0, centerY3 - (ucVar.Q0.getHeight() / 2.0f));
                                ucVar.P0.setAlpha((int) (f172 * f26));
                                ucVar.Q0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (i42 == 0) {
                                ucVar.U0.reset();
                                ucVar.U0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                ucVar.U0.postTranslate(min7 - AndroidUtilities.dp(8.0f), 0.0f);
                                ucVar.T0.setLocalMatrix(ucVar.U0);
                                canvas2.drawRect(min7 - AndroidUtilities.dp(8.0f), rectF4.top, min7, rectF4.bottom, ucVar.V0);
                            }
                            canvas.restore();
                        } else {
                            f26 = e13;
                            f40 = f161;
                            f25 = f39;
                            f27 = f12;
                            f28 = f13;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f29 = f40;
                    }
                } else {
                    float d14 = ucVar.g0.d(ucVar.a0.e, !ucVar.U);
                    nc ncVar2 = ucVar.a0;
                    ucVar.U = ncVar2.c > 0;
                    i10 = 1;
                    rectF4 = rectF16;
                    f38 = e14;
                    ucVar.I0.b((((ucVar.Q - ucVar.f) / j13) * ucVar.u1) + ucVar.y1 + ucVar.x1, lerp, f159, f38, j13, audioHeight, d14, rectF4.bottom, ncVar2);
                    canvas2.saveLayerAlpha(rectF4, 102, 31);
                    canvas2.clipPath(ucVar.I0);
                    ucVar.n0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                f39 = f38;
                if (f39 >= 1.0f) {
                }
                canvas.restore();
                f29 = f40;
            } else {
                f25 = e14;
                f26 = e13;
                float f173 = f17;
                paint2 = paint;
                f27 = f12;
                f28 = f13;
                d = 0.0d;
                i10 = 1;
                j11 = j13;
                f29 = f173;
            }
            float f174 = f20;
            float f175 = ucVar.y1 + ucVar.x1;
            float f176 = ucVar.f;
            float f177 = j11;
            float f178 = ucVar.u1;
            float f179 = (((f19 - f176) / f177) * f178) + f175;
            float f180 = (((f18 - f176) / f177) * f178) + f175;
            if (!arrayList3.isEmpty()) {
                f31 = e11;
                f30 = f26;
                f26 = f23;
            } else if (ucVar.N && ucVar.h == null) {
                f31 = e11;
                f30 = f26;
            } else {
                float f181 = f26;
                f26 = Math.max(f28, e11);
                f30 = f181;
                f31 = e11;
            }
            if (f30 > d || f31 > d || f28 > d || f23 > d) {
                if (ucVar.h == null && !ucVar.E && arrayList3.isEmpty()) {
                    f32 = f25;
                    f33 = f30 * AndroidUtilities.lerp(0.6f, 1.0f, f32);
                } else {
                    f32 = f25;
                    f33 = 1.0f;
                }
                Paint paint5 = paint2;
                ucVar.e(canvas, paint5, f174, f29, f179, f180, f33 * f26);
                pc pcVar7 = ucVar.h;
                if (pcVar7 != null && ((ucVar.N || ucVar.E) && (f32 > 0.0f || f24 > 0.0f))) {
                    float f182 = ucVar.w1 - ucVar.z1;
                    float f183 = ucVar.x1 + ucVar.y1;
                    float f184 = pcVar7.g;
                    float f185 = pcVar7.e;
                    float f186 = ucVar.f;
                    float f187 = ucVar.u1;
                    float f188 = ((((pcVar7.h * f185) - f186) / f177) * f187) + f183;
                    canvas3 = canvas;
                    ucVar.e(canvas3, paint5, f182 - f21, f182, ((((f184 * f185) - f186) / f177) * f187) + f183, f188, 0.8f);
                } else if (ucVar.v == null || arrayList3.size() <= i10) {
                    canvas3 = canvas;
                } else {
                    pc pcVar8 = ucVar.v;
                    RectF rectF17 = pcVar8.j;
                    float f189 = rectF17.top;
                    float f190 = rectF17.bottom;
                    float f191 = ucVar.x1 + ucVar.y1;
                    float f192 = pcVar8.f;
                    float f193 = pcVar8.g;
                    float f194 = pcVar8.e;
                    float f195 = ucVar.f;
                    float f196 = ucVar.u1;
                    float f197 = (((((f193 * f194) + f192) - f195) / f177) * f196) + f191;
                    float f198 = (((((pcVar8.h * f194) + f192) - f195) / f177) * f196) + f191;
                    canvas3 = canvas;
                    ucVar.e(canvas3, paint5, f189, f190, f197, f198, 0.8f);
                }
                if (ucVar.b0 > 1) {
                    pc pcVar9 = ucVar.h;
                    if (pcVar9 != null) {
                        float f199 = pcVar9.e;
                        float f200 = pcVar9.h;
                        float f201 = pcVar9.g;
                        long j22 = (long) ((f200 - f201) * f199);
                        if (j22 > 68999) {
                            float f202 = ucVar.y1 + ucVar.x1;
                            float f203 = ucVar.f;
                            float f204 = ucVar.u1;
                            float f205 = ((((f201 * f199) - f203) / f177) * f204) + f202;
                            float f206 = ((((f200 * f199) - f203) / f177) * f204) + f202;
                            canvas3.save();
                            float f207 = ucVar.w1 - ucVar.z1;
                            canvas3.clipRect(f205, f207 - f21, f206, f207);
                            ucVar.z0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f27) * 255.0f));
                            i10 = 1;
                            long j23 = 59000;
                            int min8 = (int) Math.min(ucVar.b0 - 1, j22 / 59000);
                            int i43 = 1;
                            while (i43 <= min8) {
                                if (Math.min(j23, j22 - (i43 * j23)) < 1000) {
                                    break;
                                }
                                float f208 = ucVar.y1 + ucVar.x1;
                                pc pcVar10 = ucVar.h;
                                float f209 = ((((((long) (pcVar10.e * pcVar10.g)) + r2) - ucVar.f) / f177) * ucVar.u1) + f208;
                                float f210 = ucVar.w1 - ucVar.z1;
                                Paint paint6 = ucVar.z0;
                                Canvas canvas4 = canvas3;
                                canvas4.drawRect(f209, (ucVar.w1 - ucVar.z1) - f21, AndroidUtilities.dp(1.0f) + f209, f210, paint6);
                                canvas3 = canvas4;
                                StringBuilder sb2 = new StringBuilder("#");
                                i43++;
                                sb2.append(i43);
                                canvas3.drawText(sb2.toString(), f209 + AndroidUtilities.dp(2.0f), ((ucVar.w1 - ucVar.z1) - f21) + AndroidUtilities.dp(14.0f), ucVar.E0);
                                j23 = 59000;
                            }
                            canvas3.restore();
                        }
                    }
                    i10 = 1;
                } else {
                    i10 = 1;
                }
                float d15 = ucVar.b1.d(0.0f, false);
                float contentHeight = ((ucVar.w1 - ucVar.getContentHeight()) + ucVar.z1) - AndroidUtilities.dpf2(2.3f);
                float dpf25 = AndroidUtilities.dpf2(4.3f) + (ucVar.w1 - ucVar.z1);
                if (d15 > 0.0f) {
                    long j24 = ucVar.c1;
                    if (j24 == -1) {
                        pc pcVar11 = ucVar.h;
                        if (pcVar11 != null) {
                            j24 = (long) (pcVar11.e * pcVar11.h);
                        } else {
                            pc pcVar12 = ucVar.v;
                            if (pcVar12 != null) {
                                j24 = (long) ((pcVar12.h - pcVar12.g) * pcVar12.e);
                            } else {
                                if (ucVar.E) {
                                    f34 = ucVar.H;
                                    f35 = ucVar.K;
                                } else {
                                    f34 = ucVar.R;
                                    f35 = ucVar.T;
                                }
                                j24 = (long) (f34 * f35);
                            }
                        }
                    }
                    ucVar = this;
                    ucVar.d(canvas3, contentHeight, dpf25, j24, d15 * f26);
                } else {
                    ucVar = ucVar;
                }
                ucVar.d(canvas, contentHeight, dpf25, ucVar.e, (1.0f - d15) * f26);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            i10 = 1;
            j11 = j10;
        }
        if (ucVar.m1) {
            float f211 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f212 = ucVar.n1;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / ucVar.u1) * j11 * f211 * f212);
            if (ucVar.X0) {
                ucVar.n1 = (f211 * 0.25f) + f212;
            }
            int i44 = ucVar.h1;
            if (i44 == 4 && (pcVar2 = ucVar.h) != null) {
                float f213 = pcVar2.g;
                long j25 = ucVar.f;
                long j26 = pcVar2.e;
                float f214 = j26;
                if (f213 < j25 / f214) {
                    i12 = -1;
                } else if (pcVar2.h > (j25 + j11) / f214) {
                    i12 = i10;
                } else {
                    ucVar.n1 = 1.0f;
                    i12 = 0;
                }
                long j27 = i12 * dp2;
                ucVar.f = Utilities.clamp(j25 + j27, j26 - j11, 0L);
                ucVar.e += j27;
                pc pcVar13 = ucVar.h;
                float f215 = (r3 - j25) / pcVar13.e;
                if (f215 > 0.0f) {
                    f10 = 1.0f;
                    max = Math.min(1.0f - pcVar13.h, f215);
                } else {
                    f10 = 1.0f;
                    max = Math.max(0.0f - pcVar13.g, f215);
                }
                pc pcVar14 = ucVar.h;
                pcVar14.g = Utilities.clamp(pcVar14.g + max, f10, 0.0f);
                pc pcVar15 = ucVar.h;
                pcVar15.h = Utilities.clamp(pcVar15.h + max, f10, 0.0f);
                oc ocVar = ucVar.a;
                if (ocVar != null) {
                    ocVar.E(ucVar.h.g, false);
                    ucVar.a.Z(ucVar.h.h);
                }
                ucVar.invalidate();
            } else if (i44 == 8) {
                float f216 = ucVar.S;
                long j28 = ucVar.Q;
                float f217 = (-j28) + 100;
                long j29 = ucVar.R;
                float f218 = j29;
                if (f216 < f217 / f218) {
                    i11 = -1;
                } else if (ucVar.T >= ((r8 + j11) - 100) / f218) {
                    i11 = i10;
                } else {
                    ucVar.n1 = 1.0f;
                    i11 = 0;
                }
                if (i11 != 0) {
                    if (ucVar.P && (pcVar = ucVar.h) != null) {
                        long j30 = j28 - (i11 * dp2);
                        float f219 = pcVar.h;
                        float f220 = pcVar.e;
                        ucVar.Q = Utilities.clamp(j30, (long) ((f219 * f220) - (f216 * f218)), (long) ((pcVar.g * f220) - (ucVar.T * f218)));
                    } else if (ucVar.G && ucVar.E) {
                        long j31 = j28 - (i11 * dp2);
                        float f221 = ucVar.K;
                        float f222 = ucVar.H;
                        ucVar.Q = Utilities.clamp(j31, (long) ((f221 * f222) - (f216 * f218)), (long) ((ucVar.J * f222) - (ucVar.T * f218)));
                    } else {
                        ucVar.Q = Utilities.clamp(j28 - (i11 * dp2), 0L, -(j29 - Math.min(ucVar.getBaseDuration(), ucVar.getMaxScrollDuration())));
                    }
                    float f223 = (-(ucVar.Q - j28)) / ucVar.R;
                    float min9 = f223 > 0.0f ? Math.min(1.0f - ucVar.T, f223) : Math.max(0.0f - ucVar.S, f223);
                    if (ucVar.h == null) {
                        float f224 = ucVar.e;
                        float f225 = ucVar.R;
                        ucVar.e = (long) Utilities.clamp((min9 * f225) + f224, f225, 0.0f);
                    }
                    ucVar.S = Utilities.clamp(ucVar.S + min9, 1.0f, 0.0f);
                    ucVar.T = Utilities.clamp(ucVar.T + min9, 1.0f, 0.0f);
                    oc ocVar2 = ucVar.a;
                    if (ocVar2 != null) {
                        ocVar2.S(ucVar.S);
                        ucVar.a.P(ucVar.T);
                        ucVar.a.n(ucVar.e, false);
                    }
                    ucVar.invalidate();
                } else {
                    ucVar.n1 = 1.0f;
                }
            } else {
                ucVar.n1 = 1.0f;
            }
        } else {
            ucVar.n1 = 1.0f;
        }
        int contentHeight2 = ucVar.getContentHeight();
        if (ucVar.c != contentHeight2) {
            ucVar.c = contentHeight2;
            Runnable runnable = ucVar.d;
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
        rectF.set(org.telegram.messenger.g0.x(AndroidUtilities.dp(this.X0 ? 2.0f : 10.0f), dp, 2.0f, f11), f15, f11 - ((AndroidUtilities.dp(this.X0 ? 2.0f : 10.0f) + dp) / 2.0f), f16);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.X0) {
                paint4.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.gms.internal.play_billing.k3.z(AndroidUtilities.dp(this.X0 ? 2.5f : 10.0f), dp, 2.0f, f12), f15, org.telegram.messenger.g0.a(AndroidUtilities.dp(this.X0 ? 2.5f : 10.0f), dp, 2.0f, f12), f16);
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
        long j10;
        float f11;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        oc ocVar;
        long clamp;
        pc pcVar = this.h;
        if (pcVar == null && !this.E) {
            long j16 = this.Q;
            long clamp2 = Utilities.clamp(j16 + ((long) f7), 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f12 = clamp2 - j16;
            this.S = Utilities.clamp(this.S - (f12 / this.R), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f12 / this.R), 1.0f, 0.0f);
            oc ocVar2 = this.a;
            if (ocVar2 != null) {
                ocVar2.S(this.S);
                this.a.P(this.T);
            }
        } else if (this.P) {
            if (pcVar != null) {
                f10 = pcVar.g;
                j10 = pcVar.e;
            } else {
                f10 = this.J;
                j10 = this.H;
            }
            float f13 = f10 * j10;
            if (pcVar != null) {
                f11 = pcVar.h;
                j11 = pcVar.e;
            } else {
                f11 = this.K;
                j11 = this.H;
            }
            float f14 = f11 * j11;
            float f15 = pcVar != null ? (pcVar.h - pcVar.g) * pcVar.e : this.H * (this.K - this.J);
            float f16 = this.T;
            float f17 = this.R;
            long j17 = (long) (f14 - (f16 * f17));
            float f18 = this.S;
            long j18 = (long) (f13 - (f18 * f17));
            float min = Math.min(f16 - f18, f15 / f17);
            long j19 = this.Q;
            long j20 = (long) f7;
            long j21 = j19 + j20;
            if (j21 > j17) {
                float clamp3 = Utilities.clamp(((f14 - j19) - j20) / this.R, 1.0f, min);
                this.T = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.S = clamp4;
                float f19 = this.T;
                float f20 = this.R;
                long j22 = (long) (f14 - (f19 * f20));
                long j23 = (long) (f13 - (clamp4 * f20));
                if (j22 < j23) {
                    j15 = j23;
                    j14 = j22;
                } else {
                    j14 = j23;
                    j15 = j22;
                }
                this.Q = Utilities.clamp(this.Q + j20, j15, j14);
                oc ocVar3 = this.a;
                if (ocVar3 != null) {
                    ocVar3.S(this.S);
                    this.a.P(this.T);
                }
            } else if (j21 < j18) {
                float clamp5 = Utilities.clamp(((f13 - j19) - j20) / this.R, 1.0f - min, 0.0f);
                this.S = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.T = clamp6;
                float f21 = this.R;
                long j24 = (long) (f14 - (clamp6 * f21));
                long j25 = (long) (f13 - (this.S * f21));
                if (j24 < j25) {
                    j13 = j25;
                    j12 = j24;
                } else {
                    j12 = j25;
                    j13 = j24;
                }
                this.Q = Utilities.clamp(this.Q + j20, j13, j12);
                oc ocVar4 = this.a;
                if (ocVar4 != null) {
                    ocVar4.S(this.S);
                    this.a.P(this.T);
                }
            } else {
                this.Q = j21;
            }
        } else {
            long j26 = this.Q + ((long) f7);
            float baseDuration = getBaseDuration();
            float f22 = this.R;
            this.Q = Utilities.clamp(j26, (long) (baseDuration - (this.T * f22)), (long) ((-this.S) * f22));
        }
        invalidate();
        oc ocVar5 = this.a;
        if (ocVar5 != null) {
            ocVar5.l0(this.Q + ((long) (this.S * this.R)));
        }
        boolean z10 = this.m1;
        if (z10 || (ocVar = this.a) == null) {
            if (z10 || this.r1) {
                pc pcVar2 = this.h;
                if (pcVar2 != null) {
                    long j27 = this.Q + ((long) (this.S * this.R));
                    float f23 = pcVar2.h;
                    float f24 = pcVar2.e;
                    this.e = Utilities.clamp(j27, (long) (f23 * f24), (long) (pcVar2.g * f24));
                } else if (!this.E || pcVar2 == null) {
                    float f25 = this.S;
                    long j28 = this.R;
                    this.e = Utilities.clamp((long) (f25 * j28), j28, 0L);
                } else {
                    long j29 = this.Q + ((long) (this.S * this.R));
                    float f26 = this.K;
                    float f27 = pcVar2.e;
                    this.e = Utilities.clamp(j29, (long) (f26 * f27), (long) (this.J * f27));
                }
                oc ocVar6 = this.a;
                if (ocVar6 != null) {
                    ocVar6.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        ocVar.y(true);
        pc pcVar3 = this.h;
        if (pcVar3 != null) {
            long j30 = this.Q + ((long) (this.S * this.R));
            float f28 = pcVar3.h;
            float f29 = pcVar3.e;
            clamp = Utilities.clamp(j30, (long) (f28 * f29), (long) (pcVar3.g * f29));
        } else if (this.E) {
            long j31 = this.Q + ((long) (this.S * this.R));
            float f30 = this.K;
            float f31 = this.H;
            clamp = Utilities.clamp(j31, (long) (f30 * f31), (long) (this.J * f31));
        } else {
            float f32 = this.S;
            long j32 = this.R;
            clamp = Utilities.clamp((long) (f32 * j32), j32, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        oc ocVar7 = this.a;
        this.e = clamp;
        ocVar7.n(clamp, false);
    }

    public final void i(pc pcVar, float f7) {
        oc ocVar;
        long clamp;
        long j10;
        long j11;
        long j12;
        long j13;
        if (pcVar == null) {
            return;
        }
        pc pcVar2 = this.v;
        if (pcVar2 != pcVar && pcVar2 != null) {
            if (this.n == this.s.indexOf(pcVar)) {
                pc pcVar3 = this.v;
                float f10 = pcVar3.e;
                float f11 = pcVar.h;
                float f12 = pcVar.e;
                long j14 = (long) ((f10 * 1.0f) - (f11 * f12));
                float f13 = pcVar.g;
                long j15 = (long) ((f10 * 0.0f) - (f13 * f12));
                float min = Math.min(f11 - f13, ((pcVar3.h - pcVar3.g) * f10) / f12);
                long j16 = pcVar.f;
                long j17 = (long) f7;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float clamp2 = Utilities.clamp((((this.v.h * r2.e) - j16) - j17) / pcVar.e, 1.0f, min);
                    pcVar.h = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    pcVar.g = clamp3;
                    pc pcVar4 = this.v;
                    float f14 = pcVar4.h;
                    float f15 = pcVar4.e;
                    float f16 = pcVar.h;
                    float f17 = pcVar.e;
                    long j19 = (long) ((f14 * f15) - (f16 * f17));
                    long j20 = (long) ((pcVar4.g * f15) - (clamp3 * f17));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    pcVar.f = Utilities.clamp(pcVar.f + j17, j13, j12);
                    oc ocVar2 = this.a;
                    if (ocVar2 != null) {
                        ocVar2.O(pcVar.g, pcVar.a);
                        this.a.Y(pcVar.h, pcVar.a);
                    }
                } else if (j18 < j15) {
                    float clamp4 = Utilities.clamp((((this.v.g * r2.e) - j16) - j17) / pcVar.e, 1.0f - min, 0.0f);
                    pcVar.g = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    pcVar.h = clamp5;
                    pc pcVar5 = this.v;
                    float f18 = pcVar5.h;
                    float f19 = pcVar5.e;
                    float f20 = pcVar.e;
                    long j21 = (long) ((f18 * f19) - (clamp5 * f20));
                    long j22 = (long) ((pcVar5.g * f19) - (pcVar.g * f20));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    pcVar.f = Utilities.clamp(pcVar.f + j17, j11, j10);
                    oc ocVar3 = this.a;
                    if (ocVar3 != null) {
                        ocVar3.O(pcVar.g, pcVar.a);
                        this.a.Y(pcVar.h, pcVar.a);
                    }
                } else {
                    pcVar.f = j18;
                }
            } else {
                long j23 = pcVar.f + ((long) f7);
                float baseDuration = getBaseDuration();
                float f21 = pcVar.e;
                pcVar.f = Utilities.clamp(j23, (long) (baseDuration - (pcVar.h * f21)), (long) ((-pcVar.g) * f21));
            }
        }
        invalidate();
        oc ocVar4 = this.a;
        if (ocVar4 != null) {
            ocVar4.f0(pcVar.a, pcVar.f);
        }
        boolean z10 = this.m1;
        if (z10 || (ocVar = this.a) == null) {
            if (z10 || this.r1) {
                pc pcVar6 = this.v;
                if (pcVar6 == pcVar || pcVar6 == null) {
                    float f22 = pcVar.g;
                    long j24 = pcVar.e;
                    this.e = Utilities.clamp((long) (f22 * j24), j24, 0L);
                } else {
                    long j25 = pcVar.f + ((long) (pcVar.g * pcVar.e));
                    float f23 = pcVar6.h;
                    float f24 = pcVar6.e;
                    this.e = Utilities.clamp(j25, (long) (f23 * f24), (long) (pcVar6.g * f24));
                }
                oc ocVar5 = this.a;
                if (ocVar5 != null) {
                    ocVar5.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        ocVar.y(true);
        pc pcVar7 = this.v;
        if (pcVar7 == pcVar || pcVar7 == null) {
            float f25 = pcVar.g;
            long j26 = pcVar.e;
            clamp = Utilities.clamp((long) (f25 * j26), j26, 0L);
        } else {
            long j27 = pcVar.f + ((long) (pcVar.g * pcVar.e));
            float f26 = pcVar7.h;
            float f27 = pcVar7.e;
            clamp = Utilities.clamp(j27, (long) (f26 * f27), (long) (pcVar7.g * f27));
        }
        pc pcVar8 = this.v;
        if (pcVar8 != pcVar && pcVar8 != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        oc ocVar6 = this.a;
        this.e = clamp;
        ocVar6.n(clamp, false);
    }

    public final void j(float f7) {
        long j10;
        long j11;
        long j12;
        long j13;
        oc ocVar;
        long clamp;
        pc pcVar = this.h;
        if (pcVar == null) {
            long j14 = this.I;
            long clamp2 = Utilities.clamp(j14 + ((long) f7), 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = clamp2 - j14;
            this.J = Utilities.clamp(this.J - (f10 / this.H), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / this.H), 1.0f, 0.0f);
            oc ocVar2 = this.a;
            if (ocVar2 != null) {
                ocVar2.s(this.J);
                this.a.e0(this.K);
            }
        } else if (this.G) {
            float f11 = pcVar.h;
            float f12 = pcVar.e;
            float f13 = this.K;
            float f14 = this.H;
            long j15 = (long) ((f11 * f12) - (f13 * f14));
            float f15 = pcVar.g;
            float f16 = this.J;
            long j16 = (long) ((f15 * f12) - (f16 * f14));
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j17 = this.I;
            long j18 = (long) f7;
            long j19 = j17 + j18;
            if (j19 > j15) {
                float clamp3 = Utilities.clamp((((this.h.h * r1.e) - j17) - j18) / this.H, 1.0f, min);
                this.K = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.J = clamp4;
                pc pcVar2 = this.h;
                float f17 = pcVar2.h;
                float f18 = pcVar2.e;
                float f19 = this.K;
                float f20 = this.H;
                long j20 = (long) ((f17 * f18) - (f19 * f20));
                long j21 = (long) ((pcVar2.g * f18) - (clamp4 * f20));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.I = Utilities.clamp(this.I + j18, j13, j12);
                oc ocVar3 = this.a;
                if (ocVar3 != null) {
                    ocVar3.s(this.J);
                    this.a.e0(this.K);
                }
            } else if (j19 < j16) {
                float clamp5 = Utilities.clamp((((this.h.g * r1.e) - j17) - j18) / this.H, 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                pc pcVar3 = this.h;
                float f21 = pcVar3.h;
                float f22 = pcVar3.e;
                float f23 = this.H;
                long j22 = (long) ((f21 * f22) - (clamp6 * f23));
                long j23 = (long) ((pcVar3.g * f22) - (this.J * f23));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.I = Utilities.clamp(this.I + j18, j11, j10);
                oc ocVar4 = this.a;
                if (ocVar4 != null) {
                    ocVar4.s(this.J);
                    this.a.e0(this.K);
                }
            } else {
                this.I = j19;
            }
        } else {
            long j24 = this.I + ((long) f7);
            float baseDuration = getBaseDuration();
            float f24 = this.H;
            this.I = Utilities.clamp(j24, (long) (baseDuration - (this.K * f24)), (long) ((-this.J) * f24));
        }
        invalidate();
        oc ocVar5 = this.a;
        if (ocVar5 != null) {
            ocVar5.M(this.I + ((long) (this.J * this.H)));
        }
        boolean z10 = this.m1;
        if (z10 || (ocVar = this.a) == null) {
            if (z10 || this.r1) {
                pc pcVar4 = this.h;
                if (pcVar4 != null) {
                    long j25 = this.I + ((long) (this.J * this.H));
                    float f25 = pcVar4.h;
                    float f26 = pcVar4.e;
                    this.e = Utilities.clamp(j25, (long) (f25 * f26), (long) (pcVar4.g * f26));
                } else {
                    float f27 = this.J;
                    long j26 = this.H;
                    this.e = Utilities.clamp((long) (f27 * j26), j26, 0L);
                }
                oc ocVar6 = this.a;
                if (ocVar6 != null) {
                    ocVar6.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        ocVar.y(true);
        pc pcVar5 = this.h;
        if (pcVar5 != null) {
            long j27 = this.I + ((long) (this.J * this.H));
            float f28 = pcVar5.h;
            float f29 = pcVar5.e;
            clamp = Utilities.clamp(j27, (long) (f28 * f29), (long) (pcVar5.g * f29));
        } else {
            float f30 = this.J;
            long j28 = this.H;
            clamp = Utilities.clamp((long) (f30 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        oc ocVar7 = this.a;
        this.e = clamp;
        ocVar7.n(clamp, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        pc pcVar = this.h;
        float f7 = (pcVar.h + pcVar.g) / 2.0f;
        long j10 = pcVar.e;
        this.f = Utilities.clamp((long) ((f7 * j10) - (min / 2.0f)), j10 - min, 0L);
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
        pc pcVar = this.h;
        ArrayList arrayList = this.s;
        if (pcVar == null && !this.N && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f10 = ((f7 - this.y1) - this.x1) / this.u1;
        pc pcVar2 = this.v;
        long j10 = pcVar2 != null ? (long) ((pcVar2.g * pcVar2.e) + pcVar2.f) : 0L;
        float f11 = f10 * min;
        if (pcVar2 == null) {
            j10 = this.h == null ? this.Q : 0L;
        }
        long clamp = (long) Utilities.clamp((f11 - j10) + this.f, getBaseDuration(), 0.0f);
        pc pcVar3 = this.h;
        if (pcVar3 != null) {
            float f12 = clamp / pcVar3.e;
            if (f12 < pcVar3.g || f12 > pcVar3.h) {
                return false;
            }
        }
        pc pcVar4 = this.v;
        if (pcVar4 != null && (clamp < 0 || clamp >= ((long) ((pcVar4.h - pcVar4.g) * pcVar4.e)))) {
            return false;
        }
        if (this.N && pcVar3 == null && arrayList.isEmpty()) {
            float f13 = clamp / this.R;
            if (f13 < this.S || f13 > this.T) {
                return false;
            }
        }
        this.e = clamp;
        invalidate();
        oc ocVar = this.a;
        if (ocVar != null) {
            ocVar.n(clamp, z10);
        }
        bi.g gVar = this.d1;
        if (gVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gVar);
            this.d1 = null;
        }
        if (!z10) {
            return true;
        }
        bi.g gVar2 = new bi.g(this, clamp, 7);
        this.d1 = gVar2;
        AndroidUtilities.runOnUIThread(gVar2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f7, float f10, float f11, boolean z10) {
        boolean z11;
        long j12;
        boolean z12;
        pc pcVar;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        sc scVar = this.M;
        if (scVar != null) {
            scVar.b();
            this.M = null;
        }
        long j13 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j10;
            this.I = j11 - ((long) (j10 * f7));
            this.J = f7;
            this.K = f10;
            this.L = f11;
            if (getMeasuredWidth() <= 0 || this.M != null || ((pcVar = this.h) != null && pcVar.e < 1)) {
                z11 = false;
                j12 = j13;
                z12 = true;
            } else {
                String str2 = this.F;
                int i10 = this.v1;
                int i11 = this.y1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.H;
                Long valueOf = j14 > 2 ? Long.valueOf(j14) : null;
                pc pcVar2 = this.h;
                j12 = j13;
                z11 = false;
                z12 = true;
                this.M = new sc(this, false, str2, i12, dp, valueOf, pcVar2 != null ? pcVar2.e : getMaxScrollDuration(), -1L, -1L, new lc(this, 0));
            }
            if (this.h == null) {
                this.P = z11;
                this.G = z12;
            }
        } else {
            z11 = false;
            j12 = j13;
            z12 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        this.E = this.F != null ? z12 : z11;
        if (j12 != j10 && this.h == null && this.a0 != null) {
            this.W = z12;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.clamp(j10 / this.R, 1.0f, 0.0f);
        }
        if (!z10) {
            this.d0.f(this.G, z12);
            this.f0.f(this.P, z12);
            this.c0.f(this.E, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f7) {
        pc pcVar = this.h;
        if (TextUtils.equals(pcVar == null ? null : pcVar.d, str)) {
            return;
        }
        pc pcVar2 = this.h;
        if (pcVar2 != null) {
            sc scVar = pcVar2.c;
            if (scVar != null) {
                scVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            pc pcVar3 = new pc(this);
            this.h = pcVar3;
            pcVar3.b = z10;
            pcVar3.d = str;
            pcVar3.e = j10;
            pcVar3.i = f7;
            pc.a(pcVar3, false);
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
        pc pcVar = this.h;
        if (pcVar != null && pcVar.d != null && pcVar.c == null) {
            pc.a(pcVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                pc pcVar2 = (pc) obj;
                if (pcVar2.d != null && pcVar2.c == null) {
                    pc.a(pcVar2, false);
                    pc.b(pcVar2);
                }
            }
        }
        if (this.O == null || this.a0 != null) {
            return;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0da7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        bi.g gVar;
        boolean z11;
        VelocityTracker velocityTracker;
        oc ocVar;
        VelocityTracker velocityTracker2;
        long j10;
        boolean z12;
        long j11;
        long j12;
        long j13;
        float f7;
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
        oc ocVar2;
        int i10;
        float f10;
        float f11;
        boolean z15;
        float f12;
        float clamp;
        oc ocVar3;
        oc ocVar4;
        int i11;
        float f13;
        float f14;
        pc pcVar = this.h;
        ArrayList arrayList = this.s;
        if (pcVar != null || !arrayList.isEmpty() || this.N || this.E) {
            float timelineHeight = this.w1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                pn0 pn0Var = this.W0;
                bi.c3 c3Var = this.Y0;
                if (action == 0) {
                    bi.g gVar2 = this.d1;
                    if (gVar2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(gVar2);
                        this.d1 = null;
                    }
                    pn0Var.a();
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
                    float f15 = 2.0f;
                    if (this.j1 != -1 || this.h == null) {
                        f13 = 4.0f;
                    } else {
                        float f16 = i12;
                        if (motionEvent.getY() < f16) {
                            f13 = 4.0f;
                            if (motionEvent.getY() > (f16 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.j1 = 0;
                            }
                        } else {
                            f13 = 4.0f;
                        }
                        i12 = (int) (f16 - (getVideoHeight() + AndroidUtilities.dp(f13)));
                    }
                    if (this.j1 == -1 && !arrayList.isEmpty()) {
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            f14 = f15;
                            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((pc) arrayList.get(i13)).k.c);
                            float f17 = i12;
                            if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - lerp) - AndroidUtilities.dp(f14)) {
                                this.j1 = 3;
                                this.k1 = i13;
                                break;
                            }
                            i12 = (int) (f17 - (lerp + AndroidUtilities.dp(f13)));
                            i13++;
                            f15 = f14;
                        }
                    }
                    f14 = f15;
                    if (this.j1 == -1 && this.E) {
                        float f18 = i12;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getRoundHeight()) - AndroidUtilities.dp(f14)) {
                            this.j1 = 1;
                        }
                        i12 = (int) (f18 - (getRoundHeight() + AndroidUtilities.dp(f13)));
                    }
                    if (this.j1 == -1 && this.N) {
                        float f19 = i12;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getAudioHeight()) - AndroidUtilities.dp(f14)) {
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
                        AndroidUtilities.cancelRunOnUIThread(c3Var);
                        AndroidUtilities.runOnUIThread(c3Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.g1;
                    if (this.j0 && (this.m1 || Math.abs(x10) > AndroidUtilities.touchSlop)) {
                        long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                        pc pcVar2 = this.h;
                        if (pcVar2 != null && this.h1 == 1) {
                            this.f = (long) Utilities.clamp(this.f - ((x10 / this.u1) * min3), pcVar2.e - min3, 0.0f);
                            invalidate();
                            if (!this.m1) {
                                this.n1 = 1.0f;
                            }
                            this.m1 = true;
                            this.l1 = false;
                        } else if (pcVar2 == null || !((i11 = this.h1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.h1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f20 = (min3 / this.R) * (x10 / this.u1);
                                if (i15 == 6) {
                                    float g10 = this.T - (g() / this.R);
                                    float max3 = Math.max(0L, this.f - this.Q);
                                    float f21 = this.R;
                                    float f22 = max3 / f21;
                                    pc pcVar3 = this.h;
                                    if (pcVar3 != null) {
                                        max = Math.max(f22, (((pcVar3.g * pcVar3.e) + this.f) - this.Q) / f21);
                                    } else {
                                        pc pcVar4 = this.v;
                                        if (pcVar4 != null) {
                                            max = Math.max(f22, (((pcVar4.g * pcVar4.e) + this.f) - this.Q) / f21);
                                        } else if (this.E) {
                                            max = Math.max(f22, (((this.J * this.H) + this.f) - this.Q) / f21);
                                        } else {
                                            max = Math.max(f22, this.T - (f() / this.R));
                                            if (!this.o1 && f20 < 0.0f && this.S <= this.T - (f() / this.R)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f23 = this.S;
                                    float clamp2 = Utilities.clamp(f23 + f20, g10, max);
                                    this.S = clamp2;
                                    if (Math.abs(f23 - clamp2) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    oc ocVar5 = this.a;
                                    if (ocVar5 != null) {
                                        ocVar5.l0(this.Q + ((long) (this.S * this.R)));
                                    }
                                    oc ocVar6 = this.a;
                                    if (ocVar6 != null) {
                                        ocVar6.S(this.S);
                                    }
                                } else if (i15 == 7) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min3) / this.R);
                                    float f24 = this.S;
                                    float g11 = g();
                                    float f25 = this.R;
                                    float f26 = (g11 / f25) + f24;
                                    pc pcVar5 = this.h;
                                    if (pcVar5 != null) {
                                        min = Math.min(min4, (((pcVar5.h * pcVar5.e) + this.f) - this.Q) / f25);
                                    } else {
                                        pc pcVar6 = this.v;
                                        if (pcVar6 != null) {
                                            min = Math.min(min4, (((pcVar6.h * pcVar6.e) + this.f) - this.Q) / f25);
                                        } else if (this.E) {
                                            min = Math.min(min4, (((this.K * this.H) + this.f) - this.Q) / f25);
                                        } else {
                                            min = Math.min(min4, (f() / this.R) + this.S);
                                            if (!this.o1 && f20 > 0.0f) {
                                                if (this.T >= (f() / this.R) + this.S) {
                                                    this.h1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f27 = this.T;
                                    float clamp3 = Utilities.clamp(f27 + f20, min, f26);
                                    this.T = clamp3;
                                    if (Math.abs(f27 - clamp3) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    oc ocVar7 = this.a;
                                    if (ocVar7 != null) {
                                        ocVar7.P(this.T);
                                    }
                                }
                                if (this.h1 == 8) {
                                    float min5 = f20 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min3) / this.R) - this.T), f20) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.Q) / this.R) - this.S), f20);
                                    float f28 = this.S + min5;
                                    this.S = f28;
                                    this.T += min5;
                                    oc ocVar8 = this.a;
                                    if (ocVar8 != null) {
                                        ocVar8.S(f28);
                                        this.a.l0(this.Q + ((long) (this.S * this.R)));
                                        this.a.P(this.T);
                                    }
                                    oc ocVar9 = this.a;
                                    if (ocVar9 != null) {
                                        ocVar9.y(true);
                                    }
                                }
                                if (this.h == null && !this.E) {
                                    this.e = (long) (this.S * this.R);
                                    oc ocVar10 = this.a;
                                    if (ocVar10 != null) {
                                        ocVar10.y(true);
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
                                float f29 = (min3 / this.H) * (x10 / this.u1);
                                if (i15 == 10) {
                                    float g12 = this.K - (g() / this.H);
                                    float max4 = Math.max(0L, this.f - this.I);
                                    float f30 = this.H;
                                    float f31 = max4 / f30;
                                    pc pcVar7 = this.h;
                                    if (pcVar7 != null) {
                                        max2 = Math.max(f31, (((pcVar7.g * pcVar7.e) + this.f) - this.I) / f30);
                                    } else {
                                        pc pcVar8 = this.v;
                                        if (pcVar8 != null) {
                                            max2 = Math.max(f31, (((pcVar8.g * pcVar8.e) + this.f) - this.I) / f30);
                                        } else {
                                            max2 = Math.max(f31, this.K - (f() / this.H));
                                            if (!this.o1 && f29 < 0.0f && this.J <= this.K - (f() / this.H)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f32 = this.J;
                                    float clamp4 = Utilities.clamp(f32 + f29, g12, max2);
                                    this.J = clamp4;
                                    if (Math.abs(f32 - clamp4) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    oc ocVar11 = this.a;
                                    if (ocVar11 != null) {
                                        ocVar11.M(this.I + ((long) (this.J * this.H)));
                                    }
                                    oc ocVar12 = this.a;
                                    if (ocVar12 != null) {
                                        ocVar12.s(this.J);
                                    }
                                } else if (i15 == 11) {
                                    float min6 = Math.min(1.0f, Math.max(0L, (this.f - this.I) + min3) / this.H);
                                    float f33 = this.J;
                                    float g13 = g();
                                    float f34 = this.H;
                                    float f35 = (g13 / f34) + f33;
                                    pc pcVar9 = this.h;
                                    if (pcVar9 != null) {
                                        min6 = Math.min(min6, (((pcVar9.h * pcVar9.e) + this.f) - this.I) / f34);
                                    }
                                    pc pcVar10 = this.v;
                                    if (pcVar10 != null) {
                                        min2 = Math.min(min6, (((pcVar10.h * pcVar10.e) + this.f) - this.I) / this.H);
                                    } else {
                                        min2 = Math.min(min6, (f() / this.H) + this.J);
                                        if (!this.o1 && f29 > 0.0f) {
                                            if (this.K >= (f() / this.H) + this.J) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f36 = this.K;
                                    float clamp5 = Utilities.clamp(f36 + f29, min2, f35);
                                    this.K = clamp5;
                                    if (Math.abs(f36 - clamp5) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    oc ocVar13 = this.a;
                                    if (ocVar13 != null) {
                                        ocVar13.e0(this.K);
                                    }
                                }
                                if (this.h1 == 12) {
                                    float min7 = f29 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.I) + min3) / this.H) - this.K, f29) : Math.max((Math.max(0L, this.f - this.I) / this.H) - this.J, f29);
                                    float f37 = this.J + min7;
                                    this.J = f37;
                                    this.K += min7;
                                    oc ocVar14 = this.a;
                                    if (ocVar14 != null) {
                                        ocVar14.s(f37);
                                        this.a.M(this.I + ((long) (this.J * this.H)));
                                        this.a.e0(this.K);
                                    }
                                    oc ocVar15 = this.a;
                                    if (ocVar15 != null) {
                                        ocVar15.y(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.J * this.H);
                                    oc ocVar16 = this.a;
                                    if (ocVar16 != null) {
                                        ocVar16.y(true);
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
                                            i((pc) arrayList.get(this.i1), (x10 / this.u1) * min3);
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = true;
                                            this.l1 = false;
                                        } else if (this.l1) {
                                            m(motionEvent.getX(), currentTimeMillis - this.e1 < 350);
                                            if (this.m1 || (ocVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                ocVar2.y(true);
                                            }
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z14;
                                        }
                                    }
                                } else {
                                    pc pcVar11 = (pc) arrayList.get(this.i1);
                                    float f38 = (min3 / pcVar11.e) * (x10 / this.u1);
                                    int i19 = this.h1;
                                    if (i19 == 13) {
                                        float g14 = pcVar11.h - (g() / pcVar11.e);
                                        float max5 = Math.max(0L, this.f - pcVar11.f) / pcVar11.e;
                                        if (pcVar11 == this.v) {
                                            f10 = f38;
                                            max5 = Math.max(max5, pcVar11.h - (f() / pcVar11.e));
                                            if (!this.o1 && f10 < 0.0f) {
                                                f11 = 0.0f;
                                                if (pcVar11.g <= pcVar11.h - (f() / pcVar11.e)) {
                                                    this.h1 = 15;
                                                }
                                                f12 = pcVar11.g;
                                                clamp = Utilities.clamp(f12 + f10, g14, max5);
                                                pcVar11.g = clamp;
                                                if (Math.abs(f12 - clamp) > 0.01f) {
                                                    this.o1 = true;
                                                }
                                                ocVar3 = this.a;
                                                if (ocVar3 != null) {
                                                    ocVar3.f0(pcVar11.a, pcVar11.f);
                                                }
                                                ocVar4 = this.a;
                                                if (ocVar4 != null) {
                                                    ocVar4.O(pcVar11.g, pcVar11.a);
                                                }
                                            }
                                        } else {
                                            f10 = f38;
                                        }
                                        f11 = 0.0f;
                                        f12 = pcVar11.g;
                                        clamp = Utilities.clamp(f12 + f10, g14, max5);
                                        pcVar11.g = clamp;
                                        if (Math.abs(f12 - clamp) > 0.01f) {
                                        }
                                        ocVar3 = this.a;
                                        if (ocVar3 != null) {
                                        }
                                        ocVar4 = this.a;
                                        if (ocVar4 != null) {
                                        }
                                    } else {
                                        f10 = f38;
                                        f11 = 0.0f;
                                        if (i19 == 14) {
                                            float min8 = Math.min(1.0f, Math.max(0L, (this.f - pcVar11.f) + min3) / pcVar11.e);
                                            float g15 = (g() / pcVar11.e) + pcVar11.g;
                                            if (pcVar11 == this.v) {
                                                min8 = Math.min(min8, (f() / pcVar11.e) + pcVar11.g);
                                                if (!this.o1 && f10 > 0.0f) {
                                                    if (pcVar11.h >= (f() / pcVar11.e) + pcVar11.g) {
                                                        this.h1 = 15;
                                                    }
                                                }
                                            }
                                            float f39 = pcVar11.h;
                                            float clamp6 = Utilities.clamp(f39 + f10, min8, g15);
                                            pcVar11.h = clamp6;
                                            if (Math.abs(f39 - clamp6) > 0.01f) {
                                                this.o1 = true;
                                            }
                                            oc ocVar17 = this.a;
                                            if (ocVar17 != null) {
                                                ocVar17.Y(pcVar11.h, pcVar11.a);
                                            }
                                        }
                                    }
                                    if (this.h1 == 15) {
                                        float min9 = f10 > f11 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - pcVar11.f) + min3) / pcVar11.e) - pcVar11.h, f10) : Math.max((Math.max(0L, this.f - pcVar11.f) / pcVar11.e) - pcVar11.g, f10);
                                        float f40 = pcVar11.g + min9;
                                        pcVar11.g = f40;
                                        pcVar11.h += min9;
                                        oc ocVar18 = this.a;
                                        if (ocVar18 != null) {
                                            ocVar18.O(f40, pcVar11.a);
                                            this.a.f0(pcVar11.a, pcVar11.f);
                                            this.a.Y(pcVar11.h, pcVar11.a);
                                        }
                                        oc ocVar19 = this.a;
                                        if (ocVar19 != null) {
                                            z15 = true;
                                            ocVar19.y(true);
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
                            float f41 = pcVar2.e;
                            float f42 = (min3 / f41) * (x10 / this.u1);
                            if (i11 == 2) {
                                pcVar2.g = Utilities.clamp(pcVar2.g + f42, pcVar2.h - (1000.0f / f41), 0.0f);
                                oc ocVar20 = this.a;
                                if (ocVar20 != null) {
                                    ocVar20.E(this.h.g, false);
                                }
                                pc pcVar12 = this.h;
                                float f43 = pcVar12.h - pcVar12.g;
                                float f44 = f();
                                pc pcVar13 = this.h;
                                if (f43 > f44 / pcVar13.e) {
                                    pcVar13.h = Math.min(1.0f, (f() / this.h.e) + pcVar13.g);
                                    oc ocVar21 = this.a;
                                    if (ocVar21 != null) {
                                        ocVar21.Z(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                pcVar2.h = Utilities.clamp(pcVar2.h + f42, 1.0f, (1000.0f / f41) + pcVar2.g);
                                oc ocVar22 = this.a;
                                if (ocVar22 != null) {
                                    ocVar22.Z(this.h.h);
                                }
                                pc pcVar14 = this.h;
                                float f45 = pcVar14.h - pcVar14.g;
                                float f46 = f();
                                pc pcVar15 = this.h;
                                if (f45 > f46 / pcVar15.e) {
                                    pcVar15.g = Math.max(0.0f, pcVar15.h - (f() / this.h.e));
                                    oc ocVar23 = this.a;
                                    if (ocVar23 != null) {
                                        ocVar23.E(this.h.g, false);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min10 = f42 > 0.0f ? Math.min(1.0f - pcVar2.h, f42) : Math.max(-pcVar2.g, f42);
                                pc pcVar16 = this.h;
                                float f47 = pcVar16.g + min10;
                                pcVar16.g = f47;
                                pcVar16.h += min10;
                                oc ocVar24 = this.a;
                                if (ocVar24 != null) {
                                    ocVar24.E(f47, false);
                                    this.a.Z(this.h.h);
                                }
                            }
                            float f48 = this.e;
                            pc pcVar17 = this.h;
                            float f49 = pcVar17.e;
                            float f50 = f48 / f49;
                            float f51 = pcVar17.g;
                            if (f50 < f51 || f50 > pcVar17.h) {
                                long j16 = (long) (f51 * f49);
                                this.e = j16;
                                oc ocVar25 = this.a;
                                if (ocVar25 != null) {
                                    ocVar25.n(j16, false);
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
                        AndroidUtilities.cancelRunOnUIThread(c3Var);
                    }
                    int i20 = this.h1;
                    if ((i20 == 1 || i20 == 5 || i20 == 8) && (velocityTracker6 = this.p1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(c3Var);
                    pn0Var.a();
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
                                    float f52 = i23;
                                    float f53 = min11;
                                    float f54 = this.u1;
                                    int i24 = (int) (((this.f / f53) * f54) + f52);
                                    int d = (int) a1.g.d(this.h.e - min11, f53, f54, f52);
                                    this.r1 = true;
                                    this.s1 = i24;
                                    this.W0.c(i24, 0, -xVelocity, 0, i23, d, 0, 0);
                                    z10 = false;
                                }
                            } else if (i21 == 1 && (velocityTracker4 = this.p1) != null) {
                                velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity2 = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long min12 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i25 = this.y1;
                                    float f55 = i25;
                                    float f56 = min12;
                                    float f57 = this.u1;
                                    int i26 = (int) (((this.f / f56) * f57) + f55);
                                    int d10 = (int) a1.g.d(this.h.e - min12, f56, f57, f55);
                                    this.r1 = true;
                                    this.s1 = i26;
                                    this.W0.c(i26, 0, -xVelocity2, 0, i25, d10, 0, 0);
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
                                    pc pcVar18 = this.h;
                                    if (pcVar18 != null) {
                                        float f58 = pcVar18.h;
                                        float f59 = pcVar18.e;
                                        j12 = this.R;
                                        j13 = (long) ((f58 * f59) - 0);
                                        f7 = pcVar18.g * f59;
                                    } else if (this.E) {
                                        float f60 = this.K;
                                        float f61 = this.H;
                                        j12 = this.R;
                                        j13 = (long) ((f60 * f61) - 0);
                                        f7 = this.J * f61;
                                    } else {
                                        j10 = -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j11 = 0;
                                        this.r1 = z12;
                                        this.s1 = i27;
                                        float f62 = this.y1 + this.x1;
                                        float f63 = this.u1;
                                        this.W0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f63) + f62), (int) a1.g.d(j11, min13, f63, f62), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f7 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.r1 = z12;
                                    this.s1 = i27;
                                    float f622 = this.y1 + this.x1;
                                    float f632 = this.u1;
                                    this.W0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f632) + f622), (int) a1.g.d(j11, min13, f632, f622), 0, 0);
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
                                    pc pcVar19 = this.h;
                                    if (pcVar19 != null) {
                                        float f64 = pcVar19.h;
                                        float f65 = pcVar19.e;
                                        j14 = (long) ((pcVar19.g * f65) - this.H);
                                        j15 = (long) ((f64 * f65) - 0);
                                    } else {
                                        j14 = -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.r1 = true;
                                    this.s1 = i28;
                                    float f66 = this.y1 + this.x1;
                                    float f67 = this.u1;
                                    this.W0.c(i28, 0, xVelocity4, 0, (int) (((j14 / min14) * f67) + f66), (int) a1.g.d(j15, min14, f67, f66), 0, 0);
                                    z10 = false;
                                }
                            }
                            gVar = this.d1;
                            if (gVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(gVar);
                                this.d1 = null;
                            }
                            if (this.m1 || !z10 || (ocVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                ocVar.y(false);
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
                                            this.a.e(((pc) arrayList.get(this.k1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i29 == 2 && !this.P) {
                                    this.P = true;
                                    this.G = false;
                                    oc ocVar26 = this.a;
                                    if (ocVar26 != null) {
                                        ocVar26.N(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 && !this.G) {
                                    this.P = false;
                                    this.G = true;
                                    oc ocVar27 = this.a;
                                    if (ocVar27 != null) {
                                        ocVar27.N(true);
                                    }
                                    invalidate();
                                } else if (i29 != 2 && this.P) {
                                    this.P = false;
                                    this.G = false;
                                    oc ocVar28 = this.a;
                                    if (ocVar28 != null) {
                                        ocVar28.N(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 || !this.G) {
                                    long j17 = this.e;
                                    if (m(motionEvent.getX(), false) && Math.abs(this.e - j17) > 400) {
                                        this.c1 = j17;
                                        this.b1.d(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    this.P = false;
                                    this.G = false;
                                    oc ocVar29 = this.a;
                                    if (ocVar29 != null) {
                                        ocVar29.N(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.y1) - this.x1) / this.u1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                pc pcVar20 = this.h;
                                float f68 = pcVar20.h - pcVar20.g;
                                pcVar20.g = (1.0f - f68) * (clamp7 / getBaseDuration());
                                pc pcVar21 = this.h;
                                float f69 = pcVar21.g;
                                pcVar21.h = f68 + f69;
                                oc ocVar30 = this.a;
                                if (ocVar30 != null) {
                                    ocVar30.E(f69, true);
                                    this.a.Z(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.j1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    gVar = this.d1;
                    if (gVar != null) {
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
                this.a0 = new nc(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        a4.d dVar = new a4.d(14);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, dVar);
        pc pcVar = arrayList.isEmpty() ? null : (pc) arrayList.get(0);
        this.v = pcVar;
        if (pcVar != null) {
            long j10 = pcVar.f;
        }
    }

    public void setCollage(ArrayList<k8> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        sc scVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            pc pcVar = (pc) arrayList2.get(i10);
            if (pcVar != null && (scVar = pcVar.c) != null) {
                scVar.b();
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
            nc ncVar = (nc) arrayList3.get(i11);
            if (ncVar != null) {
                ncVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                k8 k8Var = arrayList.get(i12);
                if (k8Var.K) {
                    pc pcVar2 = new pc(this);
                    pcVar2.a = i12;
                    pcVar2.b = false;
                    pcVar2.d = k8Var.L.getAbsolutePath();
                    pcVar2.e = k8Var.h0;
                    pcVar2.f = k8Var.X;
                    pcVar2.i = k8Var.P;
                    pcVar2.g = k8Var.V;
                    pcVar2.h = k8Var.W;
                    pc.a(pcVar2, false);
                    pc.b(pcVar2);
                    arrayList2.add(pcVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(oc ocVar) {
        this.a = ocVar;
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if ((r4 + 240) >= (r7 * r11.T)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if ((r4 + 240) >= (r6 * r11.T)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 + 240) >= (r7 * r0.h)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        r11.c1 = -1;
        r11.b1.d(1.0f, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j10) {
        pc pcVar = this.h;
        if (pcVar != null) {
            if (j10 < this.e) {
                float f7 = j10;
                long j11 = pcVar.e;
                if (f7 <= (j11 * pcVar.g) + 240.0f) {
                }
            }
        }
        if (this.N && !this.E && pcVar == null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j12 = this.R;
                if (f10 <= (j12 * this.S) + 240.0f) {
                }
            }
        }
        if (this.E && pcVar == null) {
            if (j10 < this.e) {
                float f11 = j10;
                long j13 = this.H;
                if (f11 <= (j13 * this.S) + 240.0f) {
                }
            }
        }
        this.e = j10;
        invalidate();
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        pc pcVar = this.h;
        if (pcVar == null) {
            return;
        }
        pcVar.g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        pc pcVar = this.h;
        if (pcVar == null) {
            return;
        }
        pcVar.h = f7;
        invalidate();
    }
}
