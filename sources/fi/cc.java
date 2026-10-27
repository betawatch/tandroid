package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.vn0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class cc extends View {
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
    public final bc I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public ac M;
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
    public final vn0 W0;
    public boolean X0;
    public final bi.u0 Y0;
    public long Z0;
    public wb a;
    public vb a0;
    public long a1;
    public Runnable b;
    public int b0;
    public final org.telegram.ui.Components.h6 b1;
    public int c;
    public final org.telegram.ui.Components.h6 c0;
    public long c1;
    public Runnable d;
    public final org.telegram.ui.Components.h6 d0;
    public bi.r3 d1;
    public long e;
    public final org.telegram.ui.Components.h6 e0;
    public long e1;
    public long f;
    public final org.telegram.ui.Components.h6 f0;
    public long f1;
    public final org.telegram.ui.Components.h6 g0;
    public float g1;
    public xb h;
    public final org.telegram.ui.Components.h6 h0;
    public int h1;
    public final org.telegram.ui.Components.h6 i0;
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
    public final r11 q0;
    public boolean q1;
    public final ArrayList r;
    public final Drawable r0;
    public boolean r1;
    public final ArrayList s;
    public final bc s0;
    public int s1;
    public final RectF t0;
    public final float[] t1;
    public final Paint u0;
    public int u1;
    public xb v;
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

    public cc(Context context, ViewGroup viewGroup, eb ebVar, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new Paint(3);
        this.x = new Path();
        this.y = new Path();
        this.b0 = 1;
        ds dsVar = ds.h;
        this.c0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.d0 = new org.telegram.ui.Components.h6(this, 360L, dsVar);
        this.e0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.f0 = new org.telegram.ui.Components.h6(this, 360L, dsVar);
        this.g0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.h0 = new org.telegram.ui.Components.h6(this, 0L, 360L, dsVar);
        this.i0 = new org.telegram.ui.Components.h6(this, 0L, 320L, dsVar);
        this.j0 = true;
        this.o0 = new RectF();
        this.p0 = new Path();
        this.s0 = new bc();
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
        this.I0 = new bc();
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
        this.W0 = new vn0(getContext(), null);
        this.Z0 = -1L;
        this.a1 = -1L;
        this.b1 = new org.telegram.ui.Components.h6(0.0f, this, 0L, 340L, dsVar);
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
        this.q0 = new r11(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
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
        this.Y0 = new bi.u0(this, viewGroup, u6Var, laVar, ebVar, 13);
    }

    public static void a(final cc ccVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar, View view) {
        int i10;
        ArrayList arrayList = ccVar.s;
        int i11 = ccVar.j1;
        try {
            if (i11 == 2 && ccVar.N) {
                q7 q7Var = new q7(ccVar.getContext(), 0);
                q7Var.b = 0.0f;
                q7Var.c = 1.5f;
                q7Var.d(ccVar.V);
                final int i12 = 0;
                q7Var.h = new Utilities.Callback(ccVar) { // from class: fi.ub
                    public final /* synthetic */ cc b;

                    {
                        this.b = ccVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f7.floatValue();
                                cc ccVar2 = this.b;
                                ccVar2.V = floatValue;
                                wb wbVar = ccVar2.a;
                                if (wbVar != null) {
                                    wbVar.e(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                cc ccVar3 = this.b;
                                ccVar3.L = floatValue2;
                                wb wbVar2 = ccVar3.a;
                                if (wbVar2 != null) {
                                    wbVar2.c(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cc ccVar4 = this.b;
                                ccVar4.h.i = f7.floatValue();
                                wb wbVar3 = ccVar4.a;
                                if (wbVar3 != null) {
                                    wbVar3.u(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i13 = ccVar.v1;
                int i14 = ccVar.y1;
                int i15 = ccVar.x1;
                float min2 = Math.min((i13 - i14) - i15, ((((AndroidUtilities.lerp(ccVar.T, 1.0f, ccVar.f0.c) * ccVar.R) + (ccVar.Q - ccVar.f)) / min) * ccVar.u1) + i14 + i15);
                l80 F = l80.F(viewGroup, u6Var, ccVar);
                F.q(q7Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new tb(ccVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(ccVar.v1 - min2)) + AndroidUtilities.dp(18.0f), ccVar.F0.top);
                F.Z();
                F.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && ccVar.E) {
                q7 q7Var2 = new q7(ccVar.getContext(), 0);
                q7Var2.b = 0.0f;
                q7Var2.c = 1.5f;
                q7Var2.d(ccVar.L);
                final int i16 = 1;
                q7Var2.h = new Utilities.Callback(ccVar) { // from class: fi.ub
                    public final /* synthetic */ cc b;

                    {
                        this.b = ccVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i16) {
                            case 0:
                                float floatValue = f7.floatValue();
                                cc ccVar2 = this.b;
                                ccVar2.V = floatValue;
                                wb wbVar = ccVar2.a;
                                if (wbVar != null) {
                                    wbVar.e(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                cc ccVar3 = this.b;
                                ccVar3.L = floatValue2;
                                wb wbVar2 = ccVar3.a;
                                if (wbVar2 != null) {
                                    wbVar2.c(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cc ccVar4 = this.b;
                                ccVar4.h.i = f7.floatValue();
                                wb wbVar3 = ccVar4.a;
                                if (wbVar3 != null) {
                                    wbVar3.u(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
                int i17 = ccVar.v1;
                int i18 = ccVar.y1;
                int i19 = ccVar.x1;
                float min4 = Math.min((i17 - i18) - i19, ((((AndroidUtilities.lerp(ccVar.K, 1.0f, ccVar.d0.c) * ccVar.H) + (ccVar.I - ccVar.f)) / min3) * ccVar.u1) + i18 + i19);
                l80 F2 = l80.F(viewGroup, u6Var, ccVar);
                F2.q(q7Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new tb(ccVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(ccVar.v1 - min4)) + AndroidUtilities.dp(18.0f), ccVar.x0.top);
                F2.Z();
                F2.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && ccVar.h != null) {
                q7 q7Var3 = new q7(ccVar.getContext(), 0);
                q7Var3.b = 0.0f;
                q7Var3.c = 1.5f;
                q7Var3.d(ccVar.h.i);
                final int i20 = 2;
                q7Var3.h = new Utilities.Callback(ccVar) { // from class: fi.ub
                    public final /* synthetic */ cc b;

                    {
                        this.b = ccVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i20) {
                            case 0:
                                float floatValue = f7.floatValue();
                                cc ccVar2 = this.b;
                                ccVar2.V = floatValue;
                                wb wbVar = ccVar2.a;
                                if (wbVar != null) {
                                    wbVar.e(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                cc ccVar3 = this.b;
                                ccVar3.L = floatValue2;
                                wb wbVar2 = ccVar3.a;
                                if (wbVar2 != null) {
                                    wbVar2.c(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                cc ccVar4 = this.b;
                                ccVar4.h.i = f7.floatValue();
                                wb wbVar3 = ccVar4.a;
                                if (wbVar3 != null) {
                                    wbVar3.u(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                l80 F3 = l80.F(viewGroup, u6Var, ccVar);
                F3.q(q7Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), ccVar.t0.top);
                F3.Z();
                F3.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            } else {
                if (i11 != 3 || (i10 = ccVar.k1) < 0 || i10 >= arrayList.size()) {
                    return;
                }
                xb xbVar = (xb) arrayList.get(ccVar.k1);
                q7 q7Var4 = new q7(ccVar.getContext(), 0);
                q7Var4.b = 0.0f;
                q7Var4.c = 1.5f;
                q7Var4.d(xbVar.i);
                q7Var4.h = new ai.n1(15, ccVar, xbVar);
                l80 F4 = l80.F(viewGroup, u6Var, ccVar);
                F4.q(q7Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), xbVar.j.top);
                F4.Z();
                F4.R(laVar, -view.getX(), -view.getY());
                ccVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.f0.e(this.P));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        xb xbVar = this.h;
        if (xbVar != null) {
            return Math.max(1L, xbVar.e);
        }
        xb xbVar2 = this.v;
        return xbVar2 != null ? Math.max(1L, xbVar2.e) : this.E ? Math.max(1L, this.H) : Math.max(1L, this.R);
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
            f7 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((xb) arrayList.get(i10)).k.c);
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
        xb xbVar;
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.e, getBaseDuration(), 0L);
        xb xbVar2 = this.v;
        float f7 = min;
        float f10 = (this.u1 * (((clamp + (xbVar2 != null ? (xbVar2.g * xbVar2.e) + xbVar2.f : this.h == null ? this.Q : 0L)) - this.f) / f7)) + this.y1 + this.x1;
        if (!this.X0 && x9 >= f10 - AndroidUtilities.dp(12.0f) && x9 <= f10 + AndroidUtilities.dp(12.0f)) {
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
                            xb xbVar3 = this.h;
                            float f12 = xbVar3.g;
                            float f13 = xbVar3.e;
                            float f14 = this.f;
                            float f15 = this.u1;
                            float f16 = ((((f12 * f13) - f14) / f7) * f15) + f11;
                            float f17 = ((((xbVar3.h * f13) - f14) / f7) * f15) + f11;
                            if (this.X0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x9 < f16 - AndroidUtilities.dp(15.0f) || x9 > f17 + AndroidUtilities.dp(15.0f)) {
                                    return i10;
                                }
                                return 4;
                            }
                            if (x9 >= f16 - AndroidUtilities.dp(15.0f) && x9 <= AndroidUtilities.dp(5.0f) + f16) {
                                return 2;
                            }
                            if (x9 >= f17 - AndroidUtilities.dp(5.0f) && x9 <= AndroidUtilities.dp(15.0f) + f17) {
                                return 3;
                            }
                            if (x9 >= f16 && x9 <= f17) {
                                xb xbVar4 = this.h;
                                if (xbVar4.g > 0.01f || xbVar4.h < 0.99f) {
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
                                if (x9 >= f24 - AndroidUtilities.dp(15.0f) && x9 <= AndroidUtilities.dp(5.0f) + f24) {
                                    return 10;
                                }
                                if (x9 >= f25 - AndroidUtilities.dp(5.0f) && x9 <= AndroidUtilities.dp(15.0f) + f25) {
                                    return 11;
                                }
                                if (x9 >= f24 && x9 <= f25) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f26 = this.y1 + this.x1;
                                long j10 = this.I;
                                long j11 = this.f;
                                float f27 = this.u1;
                                float f28 = (((j10 - j11) / f7) * f27) + f26;
                                f25 = a1.g.c((j10 + this.H) - j11, f7, f27, f26);
                                f24 = f28;
                            }
                            if (x9 >= f24 && x9 <= f25) {
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
                                if (x9 >= f35 - AndroidUtilities.dp(15.0f) && x9 <= AndroidUtilities.dp(5.0f) + f35) {
                                    return 6;
                                }
                                if (x9 >= f36 - AndroidUtilities.dp(5.0f) && x9 <= AndroidUtilities.dp(15.0f) + f36) {
                                    return 7;
                                }
                                if (x9 >= f35 && x9 <= f36) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f37 = this.y1 + this.x1;
                                long j12 = this.Q;
                                long j13 = this.f;
                                float f38 = this.u1;
                                float f39 = (((j12 - j13) / f7) * f38) + f37;
                                f36 = a1.g.c((j12 + this.R) - j13, f7, f38, f37);
                                f35 = f39;
                            }
                            if (x9 >= f35 && x9 <= f36) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            xb xbVar5 = (xb) arrayList.get(i11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(xbVar5.j);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x9, y3)) {
                                float f40 = this.y1 + this.x1;
                                float f41 = xbVar5.f;
                                float f42 = this.u1;
                                float f43 = ((f41 / f7) * f42) + f40;
                                float f44 = xbVar5.g;
                                float f45 = xbVar5.e;
                                float f46 = ((((f44 * f45) + f41) / f7) * f42) + f40;
                                float f47 = ((((xbVar5.h * f45) + f41) / f7) * f42) + f40;
                                float c10 = a1.g.c(r6 + r11, f7, f42, f40);
                                this.i1 = i11;
                                if (x9 >= f46 - AndroidUtilities.dp(15.0f) && x9 <= AndroidUtilities.dp(5.0f) + f46) {
                                    return 13;
                                }
                                if (x9 >= f47 - AndroidUtilities.dp(5.0f) && x9 <= AndroidUtilities.dp(15.0f) + f47) {
                                    return 14;
                                }
                                if (x9 < f46 || x9 > f47 || (xbVar5.g <= 0.01f && xbVar5.h >= 0.99f)) {
                                    return (x9 < f43 || x9 > c10) ? -1 : 16;
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
        vn0 vn0Var = this.W0;
        if (!vn0Var.b()) {
            if (this.r1) {
                this.r1 = false;
                wb wbVar = this.a;
                if (wbVar != null) {
                    wbVar.o(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = vn0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.q1) {
            this.f = (long) Math.max(0.0f, (((i10 - this.y1) - this.x1) / this.u1) * min);
        } else {
            if (!this.P) {
                vn0Var.a();
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
        xb xbVar = this.v;
        if (xbVar != null) {
            f12 = (xbVar.g * xbVar.e) + xbVar.f;
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

    /* JADX WARN: Incorrect condition in loop: B:119:0x069b */
    /* JADX WARN: Incorrect condition in loop: B:132:0x06f1 */
    /* JADX WARN: Incorrect condition in loop: B:207:0x09bf */
    /* JADX WARN: Incorrect condition in loop: B:223:0x0a0c */
    /* JADX WARN: Incorrect condition in loop: B:67:0x03e1 */
    /* JADX WARN: Removed duplicated region for block: B:222:0x09fe A[LOOP:6: B:222:0x09fe->B:228:0x0a52, LOOP_START, PHI: r4 r6 r7 r8 r11 r14
      0x09fe: PHI (r4v110 float) = (r4v108 float), (r4v111 float) binds: [B:221:0x09fc, B:228:0x0a52] A[DONT_GENERATE, DONT_INLINE]
      0x09fe: PHI (r6v118 int) = (r6v117 int), (r6v120 int) binds: [B:221:0x09fc, B:228:0x0a52] A[DONT_GENERATE, DONT_INLINE]
      0x09fe: PHI (r7v110 int) = (r7v109 int), (r7v111 int) binds: [B:221:0x09fc, B:228:0x0a52] A[DONT_GENERATE, DONT_INLINE]
      0x09fe: PHI (r8v44 float) = (r8v43 float), (r8v45 float) binds: [B:221:0x09fc, B:228:0x0a52] A[DONT_GENERATE, DONT_INLINE]
      0x09fe: PHI (r11v40 boolean) = (r11v38 boolean), (r11v41 boolean) binds: [B:221:0x09fc, B:228:0x0a52] A[DONT_GENERATE, DONT_INLINE]
      0x09fe: PHI (r14v39 int) = (r14v38 int), (r14v40 int) binds: [B:221:0x09fc, B:228:0x0a52] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0ee5  */
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
        xb xbVar;
        xb xbVar2;
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
        RectF rectF4;
        org.telegram.ui.Components.pa paVar2;
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
        float f29;
        float f30;
        float f31;
        double d;
        float f32;
        float f33;
        float max2;
        float f34;
        float f35;
        Canvas canvas3;
        float f36;
        float f37;
        float f38;
        float f39;
        float f40;
        float lerp;
        float x9;
        float f41;
        float f42;
        float f43;
        float f44;
        float dpf2;
        float f45;
        float f46;
        float c10;
        float f47;
        float f48;
        float f49;
        Paint paint3;
        long j14;
        float f50;
        float f51;
        float f52;
        float f53;
        float f54;
        ArrayList arrayList4;
        boolean z11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i13;
        float f55;
        boolean z12;
        ArrayList arrayList7;
        ArrayList arrayList8;
        float f56;
        int i14;
        float f57;
        float f58;
        RectF rectF5;
        Path path;
        org.telegram.ui.Components.pa paVar3;
        float c11;
        float f59;
        float f60;
        float f61;
        float f62;
        org.telegram.ui.Components.pa paVar4;
        float f63;
        float f64;
        float f65;
        ArrayList arrayList9;
        boolean z13;
        ArrayList arrayList10;
        ArrayList arrayList11;
        float f66;
        boolean z14;
        float f67;
        ArrayList arrayList12;
        ArrayList arrayList13;
        float f68;
        float f69;
        float f70;
        float f71;
        float f72;
        ArrayList arrayList14;
        ArrayList arrayList15;
        ArrayList arrayList16;
        int i15;
        boolean z15;
        ArrayList arrayList17;
        ArrayList arrayList18;
        Paint paint4;
        Paint paint5;
        org.telegram.ui.Components.pa paVar5;
        char c12;
        boolean z16;
        cc ccVar = this;
        RectF rectF6 = ccVar.t0;
        RectF rectF7 = ccVar.x0;
        Path path2 = ccVar.w0;
        ArrayList arrayList19 = ccVar.r;
        Drawable drawable = ccVar.r0;
        org.telegram.ui.Components.la laVar = ccVar.k0;
        RectF rectF8 = ccVar.F0;
        ArrayList arrayList20 = ccVar.s;
        RectF rectF9 = ccVar.o0;
        org.telegram.ui.Components.pa paVar6 = ccVar.l0;
        Paint c13 = paVar6.c(1.0f);
        float e = ccVar.i0.e(ccVar.j0);
        long min = Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration());
        if (e < 1.0f) {
            rectF9.set(ccVar.y1, (ccVar.w1 - ccVar.z1) - AndroidUtilities.dp(28.0f), ccVar.v1 - ccVar.y1, ccVar.w1 - ccVar.z1);
            ccVar.p0.rewind();
            ccVar.p0.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - e) * 255.0f), 31);
            canvas.clipPath(ccVar.p0);
            if (laVar.c()) {
                paVar6.a(canvas);
                canvas.drawColor(855638016);
                paint4 = c13;
            } else if (c13 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint4 = c13;
            } else {
                paint4 = c13;
                canvas.drawRect(rectF9, paint4);
                canvas.drawColor(855638016);
            }
            if (arrayList19.isEmpty() || !laVar.c()) {
                paint5 = paint4;
                rectF = rectF6;
                paVar5 = paVar6;
                j10 = min;
                c12 = 31;
                if (!arrayList19.isEmpty()) {
                    Paint c14 = ccVar.n0.c(0.4f);
                    if (c14 == null) {
                        c14 = ccVar.H0;
                        c14.setAlpha(64);
                    }
                    z16 = false;
                    ccVar.s0.a((((ccVar.Q - ccVar.f) / j10) * ccVar.u1) + ccVar.y1 + ccVar.x1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), ccVar.h0.d(bc.c(arrayList19), false), rectF9.bottom, arrayList19);
                    canvas.drawPath(ccVar.s0, c14);
                    float h = ((ccVar.q0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - h);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.d3.i(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.d3.B(2, centerY, drawable));
                    drawable.setAlpha(191);
                    drawable.draw(canvas);
                    r11 r11Var = ccVar.q0;
                    float centerX2 = (rectF9.centerX() - h) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
                    float f73 = centerY;
                    paint = paint5;
                    rectF2 = rectF8;
                    arrayList = arrayList20;
                    paVar = paVar5;
                    f7 = 0.4f;
                    r11Var.c(centerX2, f73, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float d10 = ccVar.h0.d(bc.c(arrayList19), false);
                rectF9 = rectF9;
                paint5 = paint4;
                rectF = rectF6;
                j10 = min;
                paVar5 = paVar6;
                ccVar.s0.a((((ccVar.Q - ccVar.f) / min) * ccVar.u1) + ccVar.y1 + ccVar.x1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), d10, rectF9.bottom, arrayList19);
                c12 = 31;
                canvas.saveLayerAlpha(rectF9, 102, 31);
                canvas.clipPath(ccVar.s0);
                ccVar.n0.a(canvas);
                canvas.restore();
            }
            z16 = false;
            float h10 = ((ccVar.q0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - h10);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.d3.i(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.d3.B(2, centerY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            r11 r11Var2 = ccVar.q0;
            float centerX22 = (rectF9.centerX() - h10) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
            float f732 = centerY2;
            paint = paint5;
            rectF2 = rectF8;
            arrayList = arrayList20;
            paVar = paVar5;
            f7 = 0.4f;
            r11Var2.c(centerX22, f732, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c13;
            arrayList = arrayList20;
            f7 = 0.4f;
            paVar = paVar6;
            rectF2 = rectF8;
        }
        if (e > 0.0f) {
            if (e < 1.0f) {
                f11 = 0.0f;
                j12 = j10;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, ccVar.getWidth(), ccVar.getHeight(), (int) (e * 255.0f), 31);
                z10 = true;
            } else {
                j12 = j10;
                f11 = 0.0f;
                canvas2 = canvas;
                z10 = false;
            }
            xb xbVar3 = ccVar.h;
            float f74 = xbVar3 != null ? 1.0f : f11;
            float e10 = xbVar3 != null ? xbVar3.k.e((ccVar.P || ccVar.G) ? false : true) : f11;
            float f75 = ccVar.w1 - ccVar.z1;
            float dp = AndroidUtilities.dp(4.0f);
            if (ccVar.h != null) {
                canvas2.save();
                float videoHeight = ccVar.getVideoHeight();
                xb xbVar4 = ccVar.h;
                float f76 = xbVar4.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j15 = xbVar4.e;
                float f77 = j15;
                float u10 = c3.h0.u(f76, f77, e10, f11);
                float u11 = c3.h0.u(xbVar4.h, f77, e10, f11);
                if (j15 <= 0) {
                    f12 = e10;
                    f14 = f11;
                    f68 = f74;
                    j13 = j12;
                    f16 = dp;
                    f69 = f14;
                } else {
                    f14 = f11;
                    f12 = e10;
                    f68 = f74;
                    j13 = j12;
                    f16 = dp;
                    f69 = (ccVar.y1 + ccVar.x1) - (ccVar.u1 * (ccVar.f / j13));
                }
                f19 = u10;
                float f78 = ccVar.x1;
                float f79 = f69 - f78;
                if (j15 <= 0) {
                    f70 = f78;
                    f18 = u11;
                    f71 = f14;
                } else {
                    f70 = f78;
                    f18 = u11;
                    f71 = (((j15 - ccVar.f) / j13) * ccVar.u1) + ccVar.y1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f79, f75 - videoHeight, f71 + f70, f75);
                float f80 = f75 - ((f16 * f68) + videoHeight);
                float f81 = (rectF10.top * f12) + f14;
                f17 = (rectF10.bottom * f12) + f14;
                ccVar.v0.rewind();
                ccVar.v0.addRoundRect(rectF10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ccVar.v0);
                ac acVar = ccVar.h.c;
                if (acVar != null) {
                    int i16 = acVar.f;
                    float f82 = i16;
                    f20 = f81;
                    int max3 = (int) Math.max(0.0d, Math.floor((f79 - ccVar.y1) / f82));
                    f13 = f68;
                    int min2 = (int) Math.min(ccVar.h.c.c, Math.ceil(((r6 - f79) - ccVar.y1) / f82) + 1.0d);
                    int i17 = (int) rectF10.top;
                    arrayList14 = ccVar.h.c.d;
                    boolean z17 = arrayList14.size() >= min2;
                    boolean z18 = (i16 == 0 || !z17 || ccVar.h.b) ? false : true;
                    if (z18) {
                        int i18 = max3;
                        while (true) {
                            arrayList17 = ccVar.h.c.d;
                            if (i18 >= Math.min(arrayList17.size(), min2)) {
                                break;
                            }
                            arrayList18 = ccVar.h.c.d;
                            if (((zb) arrayList18.get(i18)).a == null) {
                                z18 = false;
                                break;
                            }
                            i18++;
                        }
                    }
                    if (!z18) {
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
                    if (i16 != 0) {
                        float f83 = f79;
                        int i19 = max3;
                        while (i19 < Math.min(arrayList15.size(), min2)) {
                            arrayList16 = ccVar.h.c.d;
                            zb zbVar = (zb) arrayList16.get(i19);
                            if (zbVar.a != null) {
                                i15 = min2;
                                z15 = z17;
                                ccVar.u0.setAlpha((int) (zbVar.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(zbVar.a, f83, i17 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), ccVar.u0);
                            } else {
                                i15 = min2;
                                z15 = z17;
                            }
                            f83 += f82;
                            i19++;
                            z17 = z15;
                            min2 = i15;
                        }
                    }
                    boolean z19 = z17;
                    f72 = 1.0f;
                    if (!z19) {
                        ccVar.h.c.c();
                    }
                } else {
                    f20 = f81;
                    f13 = f68;
                    f72 = 1.0f;
                }
                path2.rewind();
                if (ccVar.X0) {
                    f15 = f72;
                } else {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    int i20 = ccVar.y1;
                    int i21 = ccVar.x1;
                    float f84 = i20 + i21;
                    xb xbVar5 = ccVar.h;
                    float f85 = xbVar5.g;
                    f15 = f72;
                    int i22 = i21;
                    float f86 = xbVar5.e;
                    float f87 = ccVar.f;
                    float f88 = (f85 * f86) - f87;
                    float f89 = j13;
                    float f90 = ccVar.u1;
                    float f91 = (((f88 / f89) * f90) + f84) - (f85 <= f14 ? i22 : 0);
                    float f92 = ccVar.w1 - ccVar.z1;
                    float f93 = f92 - videoHeight;
                    float f94 = xbVar5.h;
                    float f95 = ((((f86 * f94) - f87) / f89) * f90) + f84;
                    if (f94 < f15) {
                        i22 = 0;
                    }
                    rectF11.set(f91, f93, f95 + i22, f92);
                    path2.addRoundRect(rectF11, ccVar.t1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f11 = videoHeight;
                f75 = f80;
            } else {
                f12 = e10;
                f13 = f74;
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
                rectF4 = rectF7;
                paVar2 = paVar;
                arrayList3 = arrayList2;
                f21 = f11;
                f22 = f18;
                f23 = f19;
                f24 = 0.0f;
            } else {
                ccVar.getCollageHeight();
                float f96 = f75;
                float f97 = f19;
                int i23 = 0;
                while (true) {
                    f56 = f18;
                    if (i23 >= arrayList2.size()) {
                        break;
                    }
                    ArrayList arrayList21 = arrayList2;
                    xb xbVar6 = (xb) arrayList21.get(i23);
                    float f98 = f11;
                    org.telegram.ui.Components.h6 h6Var = xbVar6.k;
                    RectF rectF12 = xbVar6.j;
                    float f99 = f17;
                    float e11 = h6Var.e((ccVar.P || ccVar.G || ccVar.n != i23) ? false : true);
                    if (xbVar6 != ccVar.v) {
                        i14 = i23;
                        rectF5 = rectF7;
                        path = path2;
                        float f100 = j13;
                        f59 = ((((AndroidUtilities.lerp(xbVar6.g, f14, e11) * xbVar6.e) + (xbVar6.f - ccVar.f)) / f100) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                        paVar3 = paVar;
                        f57 = f56;
                        f58 = f97;
                        c11 = (c3.h0.x(AndroidUtilities.lerp(xbVar6.h, f15, e11), xbVar6.e, xbVar6.f - ccVar.f, f100) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                    } else {
                        i14 = i23;
                        f57 = f56;
                        f58 = f97;
                        rectF5 = rectF7;
                        path = path2;
                        paVar3 = paVar;
                        float f101 = ccVar.y1 + ccVar.x1;
                        long j16 = xbVar6.f - ccVar.f;
                        float f102 = j13;
                        float f103 = ccVar.u1;
                        float f104 = ((j16 / f102) * f103) + f101;
                        c11 = a1.g.c(j16 + xbVar6.e, f102, f103, f101);
                        f59 = f104;
                    }
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), e11);
                    float f105 = ccVar.x1;
                    rectF12.set(f59 - f105, f96 - lerp2, c11 + f105, f96);
                    f20 = (rectF12.top * e11) + f20;
                    f17 = (rectF12.bottom * e11) + f99;
                    float f106 = xbVar6.f;
                    float f107 = xbVar6.g;
                    float f108 = f57;
                    float f109 = f96;
                    float f110 = xbVar6.e;
                    float e12 = org.telegram.ui.d3.e(f107, f110, f106, e11, f58);
                    float e13 = org.telegram.ui.d3.e(xbVar6.h, f110, f106, e11, f108);
                    ccVar.x.rewind();
                    ccVar.x.addRoundRect(rectF12, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(ccVar.x);
                    ac acVar2 = xbVar6.c;
                    if (acVar2 != null) {
                        long j17 = xbVar6.e;
                        f60 = e12;
                        if (j17 <= 0) {
                            f18 = e13;
                            f63 = 0.0f;
                        } else {
                            f18 = e13;
                            f63 = (((xbVar6.f - ccVar.f) / j13) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                        }
                        float f111 = f63;
                        float f112 = ccVar.x1;
                        float f113 = f111 - f112;
                        if (j17 <= 0) {
                            f64 = f112;
                            f65 = 0.0f;
                        } else {
                            f64 = f112;
                            f65 = ((((xbVar6.f + j17) - ccVar.f) / j13) * ccVar.u1) + ccVar.y1 + r6;
                        }
                        float f114 = f65 + f64;
                        int i24 = acVar2.f;
                        float f115 = i24;
                        int max4 = (int) Math.max(0.0d, Math.floor((f113 - ((((xbVar6.f - ccVar.f) / j13) * ccVar.u1) + (ccVar.y1 + ccVar.x1))) / f115));
                        int min3 = (int) Math.min(xbVar6.c.c, Math.ceil((f114 - f113) / f115) + 1.0d);
                        int i25 = (int) rectF12.top;
                        arrayList9 = xbVar6.c.d;
                        boolean z20 = arrayList9.size() >= min3;
                        if (z20) {
                            for (int i26 = max4; i26 < Math.min(arrayList12.size(), min3); i26++) {
                                arrayList13 = xbVar6.c.d;
                                if (((zb) arrayList13.get(i26)).a == null) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                        z13 = z20;
                        if (z13) {
                            paVar4 = paVar3;
                        } else if (laVar.c()) {
                            paVar4 = paVar3;
                            paVar4.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else {
                            paVar4 = paVar3;
                            if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i24 != 0) {
                            float f116 = f113;
                            while (max4 < Math.min(arrayList10.size(), min3)) {
                                arrayList11 = xbVar6.c.d;
                                zb zbVar2 = (zb) arrayList11.get(max4);
                                int i27 = min3;
                                if (zbVar2.a != null) {
                                    f66 = lerp2;
                                    z14 = z20;
                                    f67 = f109;
                                    ccVar.w.setAlpha((int) (zbVar2.b.d(1.0f, false) * 255.0f));
                                    canvas2.drawBitmap(zbVar2.a, f116, i25 - ((int) ((r4.getHeight() - f66) / 2.0f)), ccVar.w);
                                } else {
                                    f66 = lerp2;
                                    z14 = z20;
                                    f67 = f109;
                                }
                                f116 += f115;
                                max4++;
                                min3 = i27;
                                lerp2 = f66;
                                z20 = z14;
                                f109 = f67;
                            }
                        }
                        f61 = lerp2;
                        f62 = f109;
                        if (!z20) {
                            xbVar6.c.c();
                        }
                    } else {
                        f60 = e12;
                        f18 = e13;
                        f61 = lerp2;
                        f62 = f109;
                        paVar4 = paVar3;
                    }
                    ccVar.y.rewind();
                    if (!ccVar.X0) {
                        RectF rectF13 = AndroidUtilities.rectTmp;
                        int i28 = ccVar.y1;
                        int i29 = ccVar.x1;
                        float f117 = i28 + i29;
                        float f118 = xbVar6.g;
                        int i30 = i29;
                        float f119 = xbVar6.e;
                        float f120 = f118 * f119;
                        float f121 = ccVar.f;
                        float f122 = f120 - f121;
                        float f123 = xbVar6.f;
                        float f124 = f122 + f123;
                        float f125 = j13;
                        float f126 = f124 / f125;
                        float f127 = ccVar.u1;
                        float f128 = ((f126 * f127) + f117) - (f118 <= 0.0f ? i30 : 0);
                        float f129 = rectF12.top;
                        float f130 = xbVar6.h;
                        float f131 = (((((f119 * f130) - f121) + f123) / f125) * f127) + f117;
                        if (f130 < 1.0f) {
                            i30 = 0;
                        }
                        rectF13.set(f128, f129, f131 + i30, rectF12.bottom);
                        ccVar.y.addRoundRect(rectF13, ccVar.t1, Path.Direction.CW);
                        canvas2.clipPath(ccVar.y, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f96 = f62 - ((f16 * 1.0f) + f61);
                    i23 = i14 + 1;
                    paVar = paVar4;
                    f97 = f60;
                    f11 = f98;
                    arrayList2 = arrayList21;
                    rectF7 = rectF5;
                    path2 = path;
                    f15 = 1.0f;
                    f14 = 0.0f;
                }
                float f132 = f96;
                f23 = f97;
                rectF4 = rectF7;
                paVar2 = paVar;
                arrayList3 = arrayList2;
                f22 = f56;
                f21 = f11;
                f75 = f132;
                f24 = 1.0f;
            }
            Path path3 = path2;
            float e14 = ccVar.c0.e(ccVar.E);
            float e15 = ccVar.d0.e(ccVar.E && ccVar.G);
            float roundHeight = ccVar.getRoundHeight() * e14;
            float f133 = ((ccVar.h == null && !ccVar.N && arrayList3.isEmpty()) ? 1.0f : e15) * e14;
            if (e14 > 0.0f) {
                Paint paint6 = paint;
                long j18 = ccVar.I;
                float f134 = j18;
                float f135 = f17;
                float f136 = ccVar.J;
                f25 = f24;
                float f137 = ccVar.H;
                float e16 = org.telegram.ui.d3.e(f136, f137, f134, f133, f23);
                f22 = org.telegram.ui.d3.e(ccVar.K, f137, f134, f133, f22);
                if (ccVar.h != null) {
                    float f138 = j13;
                    f47 = ((((AndroidUtilities.lerp(f136, 0.0f, e15) * ccVar.H) + (j18 - ccVar.f)) / f138) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                    f46 = f133;
                    c10 = (c3.h0.x(AndroidUtilities.lerp(ccVar.K, 1.0f, e15), ccVar.H, ccVar.I - ccVar.f, f138) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                } else {
                    f46 = f133;
                    float f139 = ccVar.y1 + ccVar.x1;
                    float f140 = j13;
                    float f141 = (j18 - ccVar.f) / f140;
                    float f142 = ccVar.u1;
                    float f143 = (f141 * f142) + f139;
                    c10 = a1.g.c(r6 + r14, f140, f142, f139);
                    f47 = f143;
                }
                float f144 = ccVar.x1;
                float f145 = f47 - f144;
                float f146 = f75 - roundHeight;
                float f147 = c10 + f144;
                RectF rectF14 = rectF4;
                rectF14.set(f145, f146, f147, f75);
                float f148 = f75 - ((f16 * e14) + roundHeight);
                f20 = (rectF14.top * f46) + f20;
                float f149 = (rectF14.bottom * f46) + f135;
                ccVar.y0.rewind();
                ccVar.y0.addRoundRect(rectF14, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(ccVar.y0);
                ac acVar3 = ccVar.M;
                if (acVar3 != null) {
                    long j19 = ccVar.H;
                    if (j19 <= 0) {
                        f48 = f148;
                        j14 = j19;
                        f50 = 0.0f;
                    } else {
                        f48 = f148;
                        j14 = j19;
                        f50 = ccVar.y1 + ccVar.x1 + (((ccVar.I - ccVar.f) / j13) * ccVar.u1);
                    }
                    float f150 = ccVar.x1;
                    float f151 = f50 - f150;
                    if (j19 <= 0) {
                        f51 = f150;
                        f52 = 0.0f;
                    } else {
                        f51 = f150;
                        f52 = ((((ccVar.I + j14) - ccVar.f) / j13) * ccVar.u1) + ccVar.y1 + r7;
                    }
                    float f152 = f52 + f51;
                    int i31 = acVar3.f;
                    if (ccVar.h != null) {
                        f53 = f152;
                        f54 = (((ccVar.I - ccVar.f) / j13) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                    } else {
                        f53 = f152;
                        f54 = ccVar.y1;
                    }
                    float f153 = i31;
                    int max5 = (int) Math.max(0.0d, Math.floor((f151 - f54) / f153));
                    float f154 = (f53 - f151) / f153;
                    f26 = e15;
                    f49 = f149;
                    int min4 = (int) Math.min(ccVar.M.c, Math.ceil(f154) + 1.0d);
                    int i32 = (int) rectF14.top;
                    arrayList4 = ccVar.M.d;
                    boolean z21 = arrayList4.size() >= min4;
                    if (z21) {
                        for (int i33 = max5; i33 < Math.min(arrayList7.size(), min4); i33++) {
                            arrayList8 = ccVar.M.d;
                            if (((zb) arrayList8.get(i33)).a == null) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = z21;
                    if (!z11) {
                        if (laVar.c()) {
                            paVar2.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint6 == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            paint3 = paint6;
                            canvas2.drawRect(rectF14, paint3);
                            canvas2.drawColor(855638016);
                            if (i31 != 0) {
                                while (max5 < Math.min(arrayList5.size(), min4)) {
                                    arrayList6 = ccVar.M.d;
                                    zb zbVar3 = (zb) arrayList6.get(max5);
                                    int i34 = min4;
                                    if (zbVar3.a != null) {
                                        i13 = i32;
                                        f55 = f153;
                                        z12 = z21;
                                        ccVar.u0.setAlpha((int) (zbVar3.b.d(1.0f, false) * 255.0f));
                                        canvas2.drawBitmap(zbVar3.a, f151, i13 - ((int) ((r6.getHeight() - roundHeight) / 2.0f)), ccVar.u0);
                                    } else {
                                        i13 = i32;
                                        f55 = f153;
                                        z12 = z21;
                                    }
                                    f151 += f55;
                                    max5++;
                                    min4 = i34;
                                    i32 = i13;
                                    f153 = f55;
                                    z21 = z12;
                                }
                            }
                            if (!z21) {
                                ccVar.M.c();
                            }
                        }
                    }
                    paint3 = paint6;
                    if (i31 != 0) {
                    }
                    if (!z21) {
                    }
                } else {
                    f48 = f148;
                    f26 = e15;
                    f49 = f149;
                    paint3 = paint6;
                }
                path3.rewind();
                RectF rectF15 = AndroidUtilities.rectTmp;
                int i35 = ccVar.y1;
                int i36 = ccVar.x1;
                float f155 = i35 + i36;
                float f156 = ccVar.J;
                float f157 = ccVar.H;
                float f158 = f156 * f157;
                paint2 = paint3;
                float f159 = ccVar.f;
                float f160 = f158 - f159;
                float f161 = ccVar.I;
                float f162 = j13;
                float f163 = ccVar.u1;
                float f164 = (1.0f - f26) * i36;
                float f165 = (((((f160 + f161) / f162) * f163) + f155) - (f156 <= 0.0f ? i36 : 0)) - f164;
                float f166 = rectF14.top;
                float f167 = ccVar.K;
                float f168 = (((((f157 * f167) - f159) + f161) / f162) * f163) + f155;
                if (f167 < 1.0f) {
                    i36 = 0;
                }
                rectF15.set(f165, f166, f168 + i36 + f164, rectF14.bottom);
                path3.addRoundRect(rectF15, ccVar.t1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f23 = e16;
                f75 = f48;
                f17 = f49;
            } else {
                f25 = f24;
                f26 = e15;
                paint2 = paint;
            }
            float e17 = ccVar.e0.e(ccVar.N);
            float e18 = ccVar.f0.e(ccVar.N && ccVar.P);
            float audioHeight = ccVar.getAudioHeight() * e17;
            float f169 = ((ccVar.h == null && !ccVar.E && arrayList3.isEmpty()) ? 1.0f : e18) * e17;
            if (e17 > 0.0f) {
                float f170 = ccVar.Q;
                float f171 = ccVar.S;
                org.telegram.ui.Components.pa paVar7 = paVar2;
                float f172 = ccVar.R;
                float e19 = org.telegram.ui.d3.e(f171, f172, f170, f169, f23);
                float e20 = org.telegram.ui.d3.e(ccVar.T, f172, f170, f169, f22);
                Paint c15 = ccVar.m0.c(e17);
                canvas2.save();
                if (ccVar.h == null && !ccVar.E && arrayList3.isEmpty()) {
                    float f173 = ccVar.y1 + ccVar.x1;
                    f39 = e19;
                    f38 = f169;
                    float f174 = j13;
                    float f175 = (ccVar.Q - ccVar.f) / f174;
                    float f176 = ccVar.u1;
                    lerp = (f175 * f176) + f173;
                    f40 = f17;
                    x9 = a1.g.c(r10 + ccVar.R, f174, f176, f173);
                    f27 = e18;
                } else {
                    f38 = f169;
                    f39 = e19;
                    f40 = f17;
                    float f177 = j13;
                    lerp = ((((AndroidUtilities.lerp(ccVar.S, 0.0f, e18) * ccVar.R) + (ccVar.Q - ccVar.f)) / f177) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                    f27 = e18;
                    x9 = (c3.h0.x(AndroidUtilities.lerp(ccVar.T, 1.0f, e18), ccVar.R, ccVar.Q - ccVar.f, f177) * ccVar.u1) + ccVar.y1 + ccVar.x1;
                }
                float f178 = x9;
                float f179 = ccVar.x1;
                RectF rectF16 = rectF3;
                rectF16.set(lerp - f179, f75 - audioHeight, f178 + f179, f75);
                f20 = (rectF16.top * f38) + f20;
                float f180 = (rectF16.bottom * f38) + f40;
                ccVar.G0.rewind();
                ccVar.G0.addRoundRect(rectF16, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(ccVar.G0);
                if (laVar != null && laVar.c()) {
                    paVar7.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(e17, 855638016));
                } else if (c15 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(e17, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c15);
                    canvas2.drawColor(org.telegram.ui.ActionBar.y6.o1(e17, 855638016));
                }
                if (ccVar.a0 == null || laVar == null || !laVar.c()) {
                    i10 = 1;
                    if (ccVar.a0 != null && c15 != null) {
                        Paint c16 = ccVar.n0.c(e17 * f7);
                        if (c16 == null) {
                            c16 = ccVar.H0;
                            c16.setAlpha((int) (64.0f * e17));
                        }
                        float d11 = ccVar.g0.d(ccVar.a0.e, !ccVar.U);
                        vb vbVar = ccVar.a0;
                        ccVar.U = vbVar.c > 0;
                        long j20 = j13;
                        ccVar.I0.b((((ccVar.Q - ccVar.f) / j13) * ccVar.u1) + ccVar.y1 + ccVar.x1, lerp, f178, f27, j20, audioHeight, d11, rectF16.bottom, vbVar);
                        j11 = j20;
                        canvas2.drawPath(ccVar.I0, c16);
                        if (f27 >= 1.0f) {
                            int i37 = ccVar.y1;
                            float f181 = ccVar.x1 + i37;
                            float f182 = ccVar.Q - ccVar.f;
                            float f183 = ccVar.S;
                            float f184 = ccVar.R;
                            float f185 = j11;
                            float f186 = ccVar.u1;
                            float f187 = ((((f183 * f184) + f182) / f185) * f186) + f181;
                            float f188 = ((((ccVar.T * f184) + f182) / f185) * f186) + f181;
                            float min5 = (Math.min(ccVar.v1 - ccVar.y1, f188) + Math.max(i37, f187)) / 2.0f;
                            float centerY3 = rectF16.centerY();
                            float max6 = Math.max(0.0f, (Math.min(ccVar.v1 - ccVar.y1, f188) - Math.max(ccVar.y1, f187)) - AndroidUtilities.dp(24.0f));
                            float dpf22 = AndroidUtilities.dpf2(13.0f);
                            if (ccVar.M0 == null && ccVar.Q0 == null) {
                                f44 = centerY3;
                                dpf2 = 0.0f;
                            } else {
                                f44 = centerY3;
                                dpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + ccVar.N0 + ccVar.R0;
                            }
                            float f189 = dpf22 + dpf2;
                            int i38 = f189 < max6 ? i10 : 0;
                            float min6 = min5 - (Math.min(f189, max6) / 2.0f);
                            ccVar.K0.setBounds((int) min6, (int) (f44 - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + min6), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + f44));
                            float f190 = 1.0f - f27;
                            float f191 = f190 * 255.0f;
                            ccVar.K0.setAlpha((int) f191);
                            ccVar.K0.draw(canvas2);
                            float dpf23 = AndroidUtilities.dpf2(16.11f) + min6;
                            f43 = f39;
                            f41 = f180;
                            d = 0.0d;
                            f28 = e14;
                            float f192 = f44;
                            f42 = e20;
                            f30 = f13;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, ccVar.v1, ccVar.w1, 255, 31);
                            float min7 = Math.min(f188, ccVar.v1) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf23, 0.0f, min7, ccVar.w1);
                            if (ccVar.M0 != null) {
                                canvas2.save();
                                canvas2.translate(dpf23 - ccVar.O0, f192 - (ccVar.M0.getHeight() / 2.0f));
                                ccVar.L0.setAlpha((int) (f191 * e17));
                                ccVar.M0.draw(canvas2);
                                canvas2.restore();
                                f45 = ccVar.N0 + dpf23;
                            } else {
                                f45 = dpf23;
                            }
                            if (ccVar.M0 != null && ccVar.Q0 != null) {
                                float dpf24 = AndroidUtilities.dpf2(3.66f) + f45;
                                int alpha = ccVar.J0.getAlpha();
                                ccVar.J0.setAlpha((int) (alpha * f190));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf24, f192, AndroidUtilities.dp(1.0f), ccVar.J0);
                                ccVar.J0.setAlpha(alpha);
                                f45 = AndroidUtilities.dpf2(2.0f) + dpf24 + AndroidUtilities.dpf2(4.0f);
                            }
                            if (ccVar.Q0 != null) {
                                canvas2.save();
                                canvas2.translate(f45 - ccVar.S0, f192 - (ccVar.Q0.getHeight() / 2.0f));
                                ccVar.P0.setAlpha((int) (f191 * e17));
                                ccVar.Q0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (i38 == 0) {
                                ccVar.U0.reset();
                                f31 = 1.0f;
                                ccVar.U0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                ccVar.U0.postTranslate(min7 - AndroidUtilities.dp(8.0f), 0.0f);
                                ccVar.T0.setLocalMatrix(ccVar.U0);
                                canvas2.drawRect(min7 - AndroidUtilities.dp(8.0f), rectF16.top, min7, rectF16.bottom, ccVar.V0);
                            } else {
                                f31 = 1.0f;
                            }
                            canvas.restore();
                        } else {
                            f41 = f180;
                            f42 = e20;
                            f43 = f39;
                            f28 = e14;
                            f30 = f13;
                            f31 = 1.0f;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f29 = f42;
                        f23 = f43;
                        f32 = f41;
                    }
                } else {
                    float d12 = ccVar.g0.d(ccVar.a0.e, !ccVar.U);
                    vb vbVar2 = ccVar.a0;
                    ccVar.U = vbVar2.c > 0;
                    i10 = 1;
                    ccVar.I0.b((((ccVar.Q - ccVar.f) / j13) * ccVar.u1) + ccVar.y1 + ccVar.x1, lerp, f178, f27, j13, audioHeight, d12, rectF16.bottom, vbVar2);
                    canvas2.saveLayerAlpha(rectF16, 102, 31);
                    canvas2.clipPath(ccVar.I0);
                    ccVar.n0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                if (f27 >= 1.0f) {
                }
                canvas.restore();
                f29 = f42;
                f23 = f43;
                f32 = f41;
            } else {
                f27 = e18;
                f28 = e14;
                float f193 = f17;
                f29 = f22;
                f30 = f13;
                f31 = 1.0f;
                d = 0.0d;
                i10 = 1;
                j11 = j13;
                f32 = f193;
            }
            float f194 = f20;
            float f195 = ccVar.y1 + ccVar.x1;
            float f196 = ccVar.f;
            float f197 = j11;
            float f198 = ccVar.u1;
            float f199 = (((f23 - f196) / f197) * f198) + f195;
            float f200 = (((f29 - f196) / f197) * f198) + f195;
            if (!arrayList3.isEmpty()) {
                f33 = f28;
                max2 = f25;
            } else if (ccVar.N && ccVar.h == null) {
                max2 = e17;
                f33 = f28;
            } else {
                f33 = f28;
                max2 = Math.max(f30, f33);
            }
            if (e17 > d || f33 > d || f30 > d || f25 > d) {
                if (ccVar.h == null && !ccVar.E && arrayList3.isEmpty()) {
                    f34 = f27;
                    f35 = AndroidUtilities.lerp(0.6f, f31, f34) * e17;
                } else {
                    f34 = f27;
                    f35 = f31;
                }
                Paint paint7 = paint2;
                ccVar.e(canvas, paint7, f194, f32, f199, f200, f35 * max2);
                xb xbVar7 = ccVar.h;
                if (xbVar7 != null && ((ccVar.N || ccVar.E) && (f34 > 0.0f || f26 > 0.0f))) {
                    float f201 = ccVar.w1 - ccVar.z1;
                    float f202 = ccVar.x1 + ccVar.y1;
                    float f203 = xbVar7.g;
                    float f204 = xbVar7.e;
                    float f205 = ccVar.f;
                    float f206 = ccVar.u1;
                    float f207 = ((((xbVar7.h * f204) - f205) / f197) * f206) + f202;
                    canvas3 = canvas;
                    ccVar.e(canvas3, paint7, f201 - f21, f201, ((((f203 * f204) - f205) / f197) * f206) + f202, f207, 0.8f);
                } else if (ccVar.v == null || arrayList3.size() <= i10) {
                    canvas3 = canvas;
                } else {
                    xb xbVar8 = ccVar.v;
                    RectF rectF17 = xbVar8.j;
                    float f208 = rectF17.top;
                    float f209 = rectF17.bottom;
                    float f210 = ccVar.x1 + ccVar.y1;
                    float f211 = xbVar8.f;
                    float f212 = xbVar8.g;
                    float f213 = xbVar8.e;
                    float f214 = ccVar.f;
                    float f215 = ccVar.u1;
                    float f216 = (((((f212 * f213) + f211) - f214) / f197) * f215) + f210;
                    float f217 = (((((xbVar8.h * f213) + f211) - f214) / f197) * f215) + f210;
                    canvas3 = canvas;
                    ccVar.e(canvas3, paint7, f208, f209, f216, f217, 0.8f);
                }
                if (ccVar.b0 > 1) {
                    xb xbVar9 = ccVar.h;
                    if (xbVar9 != null) {
                        float f218 = xbVar9.e;
                        float f219 = xbVar9.h;
                        float f220 = xbVar9.g;
                        long j21 = (long) ((f219 - f220) * f218);
                        if (j21 > 68999) {
                            float f221 = ccVar.y1 + ccVar.x1;
                            float f222 = ccVar.f;
                            float f223 = ccVar.u1;
                            float f224 = ((((f220 * f218) - f222) / f197) * f223) + f221;
                            float f225 = ((((f219 * f218) - f222) / f197) * f223) + f221;
                            canvas3.save();
                            float f226 = ccVar.w1 - ccVar.z1;
                            canvas3.clipRect(f224, f226 - f21, f225, f226);
                            ccVar.z0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f12) * 255.0f));
                            i10 = 1;
                            long j22 = 59000;
                            int min8 = (int) Math.min(ccVar.b0 - 1, j21 / 59000);
                            int i39 = 1;
                            while (i39 <= min8) {
                                if (Math.min(j22, j21 - (i39 * j22)) < 1000) {
                                    break;
                                }
                                float f227 = ccVar.y1 + ccVar.x1;
                                xb xbVar10 = ccVar.h;
                                float f228 = ((((((long) (xbVar10.e * xbVar10.g)) + r2) - ccVar.f) / f197) * ccVar.u1) + f227;
                                int i40 = i39;
                                canvas.drawRect(f228, (ccVar.w1 - ccVar.z1) - f21, AndroidUtilities.dp(1.0f) + f228, ccVar.w1 - ccVar.z1, ccVar.z0);
                                canvas3 = canvas;
                                StringBuilder sb2 = new StringBuilder("#");
                                int i41 = i40 + 1;
                                sb2.append(i41);
                                canvas3.drawText(sb2.toString(), f228 + AndroidUtilities.dp(2.0f), ((ccVar.w1 - ccVar.z1) - f21) + AndroidUtilities.dp(14.0f), ccVar.E0);
                                i39 = i41;
                                j22 = 59000;
                            }
                            canvas3.restore();
                        }
                    }
                    i10 = 1;
                } else {
                    i10 = 1;
                }
                float d13 = ccVar.b1.d(0.0f, false);
                float contentHeight = ((ccVar.w1 - ccVar.getContentHeight()) + ccVar.z1) - AndroidUtilities.dpf2(2.3f);
                float dpf25 = AndroidUtilities.dpf2(4.3f) + (ccVar.w1 - ccVar.z1);
                if (d13 > 0.0f) {
                    long j23 = ccVar.c1;
                    if (j23 == -1) {
                        xb xbVar11 = ccVar.h;
                        if (xbVar11 != null) {
                            j23 = (long) (xbVar11.e * xbVar11.h);
                        } else {
                            xb xbVar12 = ccVar.v;
                            if (xbVar12 != null) {
                                j23 = (long) ((xbVar12.h - xbVar12.g) * xbVar12.e);
                            } else {
                                if (ccVar.E) {
                                    f36 = ccVar.H;
                                    f37 = ccVar.K;
                                } else {
                                    f36 = ccVar.R;
                                    f37 = ccVar.T;
                                }
                                j23 = (long) (f36 * f37);
                            }
                        }
                    }
                    ccVar = this;
                    ccVar.d(canvas3, contentHeight, dpf25, j23, d13 * max2);
                } else {
                    ccVar = ccVar;
                }
                ccVar.d(canvas, contentHeight, dpf25, ccVar.e, (1.0f - d13) * max2);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            i10 = 1;
            j11 = j10;
        }
        if (ccVar.m1) {
            float f229 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f230 = ccVar.n1;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / ccVar.u1) * j11 * f229 * f230);
            if (ccVar.X0) {
                ccVar.n1 = (f229 * 0.25f) + f230;
            }
            int i42 = ccVar.h1;
            if (i42 == 4 && (xbVar2 = ccVar.h) != null) {
                float f231 = xbVar2.g;
                long j24 = ccVar.f;
                long j25 = xbVar2.e;
                float f232 = j25;
                if (f231 < j24 / f232) {
                    i12 = -1;
                } else if (xbVar2.h > (j24 + j11) / f232) {
                    i12 = i10;
                } else {
                    ccVar.n1 = 1.0f;
                    i12 = 0;
                }
                long j26 = i12 * dp2;
                ccVar.f = Utilities.clamp(j24 + j26, j25 - j11, 0L);
                ccVar.e += j26;
                xb xbVar13 = ccVar.h;
                float f233 = (r3 - j24) / xbVar13.e;
                if (f233 > 0.0f) {
                    f10 = 1.0f;
                    max = Math.min(1.0f - xbVar13.h, f233);
                } else {
                    f10 = 1.0f;
                    max = Math.max(0.0f - xbVar13.g, f233);
                }
                xb xbVar14 = ccVar.h;
                xbVar14.g = Utilities.clamp(xbVar14.g + max, f10, 0.0f);
                xb xbVar15 = ccVar.h;
                xbVar15.h = Utilities.clamp(xbVar15.h + max, f10, 0.0f);
                wb wbVar = ccVar.a;
                if (wbVar != null) {
                    wbVar.v(ccVar.h.g, false);
                    ccVar.a.F(ccVar.h.h);
                }
                ccVar.invalidate();
            } else if (i42 == 8) {
                float f234 = ccVar.S;
                long j27 = ccVar.Q;
                float f235 = (-j27) + 100;
                long j28 = ccVar.R;
                float f236 = j28;
                if (f234 < f235 / f236) {
                    i11 = -1;
                } else if (ccVar.T >= ((r11 + j11) - 100) / f236) {
                    i11 = i10;
                } else {
                    ccVar.n1 = 1.0f;
                    i11 = 0;
                }
                if (i11 != 0) {
                    if (ccVar.P && (xbVar = ccVar.h) != null) {
                        long j29 = j27 - (i11 * dp2);
                        float f237 = xbVar.h;
                        float f238 = xbVar.e;
                        ccVar.Q = Utilities.clamp(j29, (long) ((f237 * f238) - (f234 * f236)), (long) ((xbVar.g * f238) - (ccVar.T * f236)));
                    } else if (ccVar.G && ccVar.E) {
                        long j30 = j27 - (i11 * dp2);
                        float f239 = ccVar.K;
                        float f240 = ccVar.H;
                        ccVar.Q = Utilities.clamp(j30, (long) ((f239 * f240) - (f234 * f236)), (long) ((ccVar.J * f240) - (ccVar.T * f236)));
                    } else {
                        ccVar.Q = Utilities.clamp(j27 - (i11 * dp2), 0L, -(j28 - Math.min(ccVar.getBaseDuration(), ccVar.getMaxScrollDuration())));
                    }
                    float f241 = (-(ccVar.Q - j27)) / ccVar.R;
                    float min9 = f241 > 0.0f ? Math.min(1.0f - ccVar.T, f241) : Math.max(0.0f - ccVar.S, f241);
                    if (ccVar.h == null) {
                        float f242 = ccVar.e;
                        float f243 = ccVar.R;
                        ccVar.e = (long) Utilities.clamp((min9 * f243) + f242, f243, 0.0f);
                    }
                    ccVar.S = Utilities.clamp(ccVar.S + min9, 1.0f, 0.0f);
                    ccVar.T = Utilities.clamp(ccVar.T + min9, 1.0f, 0.0f);
                    wb wbVar2 = ccVar.a;
                    if (wbVar2 != null) {
                        wbVar2.D(ccVar.S);
                        ccVar.a.C(ccVar.T);
                        ccVar.a.h(ccVar.e, false);
                    }
                    ccVar.invalidate();
                } else {
                    ccVar.n1 = 1.0f;
                }
            } else {
                ccVar.n1 = 1.0f;
            }
        } else {
            ccVar.n1 = 1.0f;
        }
        int contentHeight2 = ccVar.getContentHeight();
        if (ccVar.c != contentHeight2) {
            ccVar.c = contentHeight2;
            Runnable runnable = ccVar.d;
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
        rectF.set(org.telegram.messenger.t.y(AndroidUtilities.dp(this.X0 ? 2.0f : 10.0f), dp, 2.0f, f11), f15, f11 - ((AndroidUtilities.dp(this.X0 ? 2.0f : 10.0f) + dp) / 2.0f), f16);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.X0) {
                paint4.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(c3.h0.B(AndroidUtilities.dp(this.X0 ? 2.5f : 10.0f), dp, 2.0f, f12), f15, org.telegram.messenger.t.b(AndroidUtilities.dp(this.X0 ? 2.5f : 10.0f), dp, 2.0f, f12), f16);
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
        wb wbVar;
        long clamp;
        xb xbVar = this.h;
        if (xbVar == null && !this.E) {
            long j16 = this.Q;
            long clamp2 = Utilities.clamp(j16 + ((long) f7), 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = clamp2;
            float f12 = clamp2 - j16;
            this.S = Utilities.clamp(this.S - (f12 / this.R), 1.0f, 0.0f);
            this.T = Utilities.clamp(this.T - (f12 / this.R), 1.0f, 0.0f);
            wb wbVar2 = this.a;
            if (wbVar2 != null) {
                wbVar2.D(this.S);
                this.a.C(this.T);
            }
        } else if (this.P) {
            if (xbVar != null) {
                f10 = xbVar.g;
                j10 = xbVar.e;
            } else {
                f10 = this.J;
                j10 = this.H;
            }
            float f13 = f10 * j10;
            if (xbVar != null) {
                f11 = xbVar.h;
                j11 = xbVar.e;
            } else {
                f11 = this.K;
                j11 = this.H;
            }
            float f14 = f11 * j11;
            float f15 = xbVar != null ? (xbVar.h - xbVar.g) * xbVar.e : this.H * (this.K - this.J);
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
                wb wbVar3 = this.a;
                if (wbVar3 != null) {
                    wbVar3.D(this.S);
                    this.a.C(this.T);
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
                wb wbVar4 = this.a;
                if (wbVar4 != null) {
                    wbVar4.D(this.S);
                    this.a.C(this.T);
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
        wb wbVar5 = this.a;
        if (wbVar5 != null) {
            wbVar5.L(this.Q + ((long) (this.S * this.R)));
        }
        boolean z10 = this.m1;
        if (z10 || (wbVar = this.a) == null) {
            if (z10 || this.r1) {
                xb xbVar2 = this.h;
                if (xbVar2 != null) {
                    long j27 = this.Q + ((long) (this.S * this.R));
                    float f23 = xbVar2.h;
                    float f24 = xbVar2.e;
                    this.e = Utilities.clamp(j27, (long) (f23 * f24), (long) (xbVar2.g * f24));
                } else if (!this.E || xbVar2 == null) {
                    float f25 = this.S;
                    long j28 = this.R;
                    this.e = Utilities.clamp((long) (f25 * j28), j28, 0L);
                } else {
                    long j29 = this.Q + ((long) (this.S * this.R));
                    float f26 = this.K;
                    float f27 = xbVar2.e;
                    this.e = Utilities.clamp(j29, (long) (f26 * f27), (long) (this.J * f27));
                }
                wb wbVar6 = this.a;
                if (wbVar6 != null) {
                    wbVar6.h(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.o(true);
        xb xbVar3 = this.h;
        if (xbVar3 != null) {
            long j30 = this.Q + ((long) (this.S * this.R));
            float f28 = xbVar3.h;
            float f29 = xbVar3.e;
            clamp = Utilities.clamp(j30, (long) (f28 * f29), (long) (xbVar3.g * f29));
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
        wb wbVar7 = this.a;
        this.e = clamp;
        wbVar7.h(clamp, false);
    }

    public final void i(xb xbVar, float f7) {
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
                float f10 = xbVar3.e;
                float f11 = xbVar.h;
                float f12 = xbVar.e;
                long j14 = (long) ((f10 * 1.0f) - (f11 * f12));
                float f13 = xbVar.g;
                long j15 = (long) ((f10 * 0.0f) - (f13 * f12));
                float min = Math.min(f11 - f13, ((xbVar3.h - xbVar3.g) * f10) / f12);
                long j16 = xbVar.f;
                long j17 = (long) f7;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float clamp2 = Utilities.clamp((((this.v.h * r2.e) - j16) - j17) / xbVar.e, 1.0f, min);
                    xbVar.h = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    xbVar.g = clamp3;
                    xb xbVar4 = this.v;
                    float f14 = xbVar4.h;
                    float f15 = xbVar4.e;
                    float f16 = xbVar.h;
                    float f17 = xbVar.e;
                    long j19 = (long) ((f14 * f15) - (f16 * f17));
                    long j20 = (long) ((xbVar4.g * f15) - (clamp3 * f17));
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
                        wbVar2.B(xbVar.g, xbVar.a);
                        this.a.E(xbVar.h, xbVar.a);
                    }
                } else if (j18 < j15) {
                    float clamp4 = Utilities.clamp((((this.v.g * r2.e) - j16) - j17) / xbVar.e, 1.0f - min, 0.0f);
                    xbVar.g = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    xbVar.h = clamp5;
                    xb xbVar5 = this.v;
                    float f18 = xbVar5.h;
                    float f19 = xbVar5.e;
                    float f20 = xbVar.e;
                    long j21 = (long) ((f18 * f19) - (clamp5 * f20));
                    long j22 = (long) ((xbVar5.g * f19) - (xbVar.g * f20));
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
                        wbVar3.B(xbVar.g, xbVar.a);
                        this.a.E(xbVar.h, xbVar.a);
                    }
                } else {
                    xbVar.f = j18;
                }
            } else {
                long j23 = xbVar.f + ((long) f7);
                float baseDuration = getBaseDuration();
                float f21 = xbVar.e;
                xbVar.f = Utilities.clamp(j23, (long) (baseDuration - (xbVar.h * f21)), (long) ((-xbVar.g) * f21));
            }
        }
        invalidate();
        wb wbVar4 = this.a;
        if (wbVar4 != null) {
            wbVar4.K(xbVar.a, xbVar.f);
        }
        boolean z10 = this.m1;
        if (z10 || (wbVar = this.a) == null) {
            if (z10 || this.r1) {
                xb xbVar6 = this.v;
                if (xbVar6 == xbVar || xbVar6 == null) {
                    float f22 = xbVar.g;
                    long j24 = xbVar.e;
                    this.e = Utilities.clamp((long) (f22 * j24), j24, 0L);
                } else {
                    long j25 = xbVar.f + ((long) (xbVar.g * xbVar.e));
                    float f23 = xbVar6.h;
                    float f24 = xbVar6.e;
                    this.e = Utilities.clamp(j25, (long) (f23 * f24), (long) (xbVar6.g * f24));
                }
                wb wbVar5 = this.a;
                if (wbVar5 != null) {
                    wbVar5.h(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.o(true);
        xb xbVar7 = this.v;
        if (xbVar7 == xbVar || xbVar7 == null) {
            float f25 = xbVar.g;
            long j26 = xbVar.e;
            clamp = Utilities.clamp((long) (f25 * j26), j26, 0L);
        } else {
            long j27 = xbVar.f + ((long) (xbVar.g * xbVar.e));
            float f26 = xbVar7.h;
            float f27 = xbVar7.e;
            clamp = Utilities.clamp(j27, (long) (f26 * f27), (long) (xbVar7.g * f27));
        }
        xb xbVar8 = this.v;
        if (xbVar8 != xbVar && xbVar8 != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        wb wbVar6 = this.a;
        this.e = clamp;
        wbVar6.h(clamp, false);
    }

    public final void j(float f7) {
        long j10;
        long j11;
        long j12;
        long j13;
        wb wbVar;
        long clamp;
        xb xbVar = this.h;
        if (xbVar == null) {
            long j14 = this.I;
            long clamp2 = Utilities.clamp(j14 + ((long) f7), 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = clamp2;
            float f10 = clamp2 - j14;
            this.J = Utilities.clamp(this.J - (f10 / this.H), 1.0f, 0.0f);
            this.K = Utilities.clamp(this.K - (f10 / this.H), 1.0f, 0.0f);
            wb wbVar2 = this.a;
            if (wbVar2 != null) {
                wbVar2.n(this.J);
                this.a.J(this.K);
            }
        } else if (this.G) {
            float f11 = xbVar.h;
            float f12 = xbVar.e;
            float f13 = this.K;
            float f14 = this.H;
            long j15 = (long) ((f11 * f12) - (f13 * f14));
            float f15 = xbVar.g;
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
                xb xbVar2 = this.h;
                float f17 = xbVar2.h;
                float f18 = xbVar2.e;
                float f19 = this.K;
                float f20 = this.H;
                long j20 = (long) ((f17 * f18) - (f19 * f20));
                long j21 = (long) ((xbVar2.g * f18) - (clamp4 * f20));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.I = Utilities.clamp(this.I + j18, j13, j12);
                wb wbVar3 = this.a;
                if (wbVar3 != null) {
                    wbVar3.n(this.J);
                    this.a.J(this.K);
                }
            } else if (j19 < j16) {
                float clamp5 = Utilities.clamp((((this.h.g * r1.e) - j17) - j18) / this.H, 1.0f - min, 0.0f);
                this.J = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.K = clamp6;
                xb xbVar3 = this.h;
                float f21 = xbVar3.h;
                float f22 = xbVar3.e;
                float f23 = this.H;
                long j22 = (long) ((f21 * f22) - (clamp6 * f23));
                long j23 = (long) ((xbVar3.g * f22) - (this.J * f23));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.I = Utilities.clamp(this.I + j18, j11, j10);
                wb wbVar4 = this.a;
                if (wbVar4 != null) {
                    wbVar4.n(this.J);
                    this.a.J(this.K);
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
        wb wbVar5 = this.a;
        if (wbVar5 != null) {
            wbVar5.z(this.I + ((long) (this.J * this.H)));
        }
        boolean z10 = this.m1;
        if (z10 || (wbVar = this.a) == null) {
            if (z10 || this.r1) {
                xb xbVar4 = this.h;
                if (xbVar4 != null) {
                    long j25 = this.I + ((long) (this.J * this.H));
                    float f25 = xbVar4.h;
                    float f26 = xbVar4.e;
                    this.e = Utilities.clamp(j25, (long) (f25 * f26), (long) (xbVar4.g * f26));
                } else {
                    float f27 = this.J;
                    long j26 = this.H;
                    this.e = Utilities.clamp((long) (f27 * j26), j26, 0L);
                }
                wb wbVar6 = this.a;
                if (wbVar6 != null) {
                    wbVar6.h(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        wbVar.o(true);
        xb xbVar5 = this.h;
        if (xbVar5 != null) {
            long j27 = this.I + ((long) (this.J * this.H));
            float f28 = xbVar5.h;
            float f29 = xbVar5.e;
            clamp = Utilities.clamp(j27, (long) (f28 * f29), (long) (xbVar5.g * f29));
        } else {
            float f30 = this.J;
            long j28 = this.H;
            clamp = Utilities.clamp((long) (f30 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.c1 = this.e;
            this.b1.d(1.0f, true);
        }
        wb wbVar7 = this.a;
        this.e = clamp;
        wbVar7.h(clamp, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        xb xbVar = this.h;
        float f7 = (xbVar.h + xbVar.g) / 2.0f;
        long j10 = xbVar.e;
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
        xb xbVar = this.h;
        ArrayList arrayList = this.s;
        if (xbVar == null && !this.N && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f10 = ((f7 - this.y1) - this.x1) / this.u1;
        xb xbVar2 = this.v;
        long j10 = xbVar2 != null ? (long) ((xbVar2.g * xbVar2.e) + xbVar2.f) : 0L;
        float f11 = f10 * min;
        if (xbVar2 == null) {
            j10 = this.h == null ? this.Q : 0L;
        }
        long clamp = (long) Utilities.clamp((f11 - j10) + this.f, getBaseDuration(), 0.0f);
        xb xbVar3 = this.h;
        if (xbVar3 != null) {
            float f12 = clamp / xbVar3.e;
            if (f12 < xbVar3.g || f12 > xbVar3.h) {
                return false;
            }
        }
        xb xbVar4 = this.v;
        if (xbVar4 != null && (clamp < 0 || clamp >= ((long) ((xbVar4.h - xbVar4.g) * xbVar4.e)))) {
            return false;
        }
        if (this.N && xbVar3 == null && arrayList.isEmpty()) {
            float f13 = clamp / this.R;
            if (f13 < this.S || f13 > this.T) {
                return false;
            }
        }
        this.e = clamp;
        invalidate();
        wb wbVar = this.a;
        if (wbVar != null) {
            wbVar.h(clamp, z10);
        }
        bi.r3 r3Var = this.d1;
        if (r3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r3Var);
            this.d1 = null;
        }
        if (!z10) {
            return true;
        }
        bi.r3 r3Var2 = new bi.r3(this, clamp, 9);
        this.d1 = r3Var2;
        AndroidUtilities.runOnUIThread(r3Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f7, float f10, float f11, boolean z10) {
        boolean z11;
        long j12;
        boolean z12;
        xb xbVar;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        ac acVar = this.M;
        if (acVar != null) {
            acVar.b();
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
            if (getMeasuredWidth() <= 0 || this.M != null || ((xbVar = this.h) != null && xbVar.e < 1)) {
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
                xb xbVar2 = this.h;
                j12 = j13;
                z11 = false;
                z12 = true;
                this.M = new ac(this, false, str2, i12, dp, valueOf, xbVar2 != null ? xbVar2.e : getMaxScrollDuration(), -1L, -1L, new tb(this, 0));
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
            xbVar3.i = f7;
            xb.a(xbVar3, false);
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
        if (this.O == null || this.a0 != null) {
            return;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0d97  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        bi.r3 r3Var;
        boolean z11;
        VelocityTracker velocityTracker;
        wb wbVar;
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
        float d;
        float v;
        float d10;
        boolean z13;
        float v10;
        boolean z14;
        wb wbVar2;
        int i10;
        float f10;
        float f11;
        boolean z15;
        float f12;
        float clamp;
        wb wbVar3;
        wb wbVar4;
        int i11;
        float f13;
        float f14;
        xb xbVar = this.h;
        ArrayList arrayList = this.s;
        if (xbVar != null || !arrayList.isEmpty() || this.N || this.E) {
            float timelineHeight = this.w1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                vn0 vn0Var = this.W0;
                bi.u0 u0Var = this.Y0;
                if (action == 0) {
                    bi.r3 r3Var2 = this.d1;
                    if (r3Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(r3Var2);
                        this.d1 = null;
                    }
                    vn0Var.a();
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
                            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((xb) arrayList.get(i13)).k.c);
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
                        AndroidUtilities.cancelRunOnUIThread(u0Var);
                        AndroidUtilities.runOnUIThread(u0Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x9 = motionEvent.getX() - this.g1;
                    if (this.j0 && (this.m1 || Math.abs(x9) > AndroidUtilities.touchSlop)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        xb xbVar2 = this.h;
                        if (xbVar2 != null && this.h1 == 1) {
                            this.f = (long) Utilities.clamp(this.f - ((x9 / this.u1) * min), xbVar2.e - min, 0.0f);
                            invalidate();
                            if (!this.m1) {
                                this.n1 = 1.0f;
                            }
                            this.m1 = true;
                            this.l1 = false;
                        } else if (xbVar2 == null || !((i11 = this.h1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.h1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f20 = (min / this.R) * (x9 / this.u1);
                                if (i15 == 6) {
                                    float g7 = this.T - (g() / this.R);
                                    float max = Math.max(0L, this.f - this.Q);
                                    float f21 = this.R;
                                    float f22 = max / f21;
                                    xb xbVar3 = this.h;
                                    if (xbVar3 != null) {
                                        v = Math.max(f22, (((xbVar3.g * xbVar3.e) + this.f) - this.Q) / f21);
                                    } else {
                                        xb xbVar4 = this.v;
                                        if (xbVar4 != null) {
                                            v = Math.max(f22, (((xbVar4.g * xbVar4.e) + this.f) - this.Q) / f21);
                                        } else if (this.E) {
                                            v = Math.max(f22, (((this.J * this.H) + this.f) - this.Q) / f21);
                                        } else {
                                            v = org.telegram.ui.d3.v(f(), this.R, this.T, f22);
                                            if (!this.o1 && f20 < 0.0f && this.S <= this.T - (f() / this.R)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f23 = this.S;
                                    float clamp2 = Utilities.clamp(f23 + f20, g7, v);
                                    this.S = clamp2;
                                    if (Math.abs(f23 - clamp2) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    wb wbVar5 = this.a;
                                    if (wbVar5 != null) {
                                        wbVar5.L(this.Q + ((long) (this.S * this.R)));
                                    }
                                    wb wbVar6 = this.a;
                                    if (wbVar6 != null) {
                                        wbVar6.D(this.S);
                                    }
                                } else if (i15 == 7) {
                                    float min2 = Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min) / this.R);
                                    float f24 = this.S;
                                    float g10 = g();
                                    float f25 = this.R;
                                    float f26 = (g10 / f25) + f24;
                                    xb xbVar5 = this.h;
                                    if (xbVar5 != null) {
                                        d = Math.min(min2, (((xbVar5.h * xbVar5.e) + this.f) - this.Q) / f25);
                                    } else {
                                        xb xbVar6 = this.v;
                                        if (xbVar6 != null) {
                                            d = Math.min(min2, (((xbVar6.h * xbVar6.e) + this.f) - this.Q) / f25);
                                        } else if (this.E) {
                                            d = Math.min(min2, (((this.K * this.H) + this.f) - this.Q) / f25);
                                        } else {
                                            d = org.telegram.ui.d3.d(f(), this.R, this.S, min2);
                                            if (!this.o1 && f20 > 0.0f) {
                                                if (this.T >= (f() / this.R) + this.S) {
                                                    this.h1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f27 = this.T;
                                    float clamp3 = Utilities.clamp(f27 + f20, d, f26);
                                    this.T = clamp3;
                                    if (Math.abs(f27 - clamp3) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    wb wbVar7 = this.a;
                                    if (wbVar7 != null) {
                                        wbVar7.C(this.T);
                                    }
                                }
                                if (this.h1 == 8) {
                                    float min3 = f20 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min) / this.R) - this.T), f20) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.Q) / this.R) - this.S), f20);
                                    float f28 = this.S + min3;
                                    this.S = f28;
                                    this.T += min3;
                                    wb wbVar8 = this.a;
                                    if (wbVar8 != null) {
                                        wbVar8.D(f28);
                                        this.a.L(this.Q + ((long) (this.S * this.R)));
                                        this.a.C(this.T);
                                    }
                                    wb wbVar9 = this.a;
                                    if (wbVar9 != null) {
                                        wbVar9.o(true);
                                    }
                                }
                                if (this.h == null && !this.E) {
                                    this.e = (long) (this.S * this.R);
                                    wb wbVar10 = this.a;
                                    if (wbVar10 != null) {
                                        wbVar10.o(true);
                                        this.a.h(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.m1) {
                                    this.n1 = 1.0f;
                                }
                                this.m1 = true;
                                this.l1 = false;
                            } else if (i15 == 10 || i15 == 11 || i15 == 12) {
                                float f29 = (min / this.H) * (x9 / this.u1);
                                if (i15 == 10) {
                                    float g11 = this.K - (g() / this.H);
                                    float max2 = Math.max(0L, this.f - this.I);
                                    float f30 = this.H;
                                    float f31 = max2 / f30;
                                    xb xbVar7 = this.h;
                                    if (xbVar7 != null) {
                                        v10 = Math.max(f31, (((xbVar7.g * xbVar7.e) + this.f) - this.I) / f30);
                                    } else {
                                        xb xbVar8 = this.v;
                                        if (xbVar8 != null) {
                                            v10 = Math.max(f31, (((xbVar8.g * xbVar8.e) + this.f) - this.I) / f30);
                                        } else {
                                            v10 = org.telegram.ui.d3.v(f(), this.H, this.K, f31);
                                            if (!this.o1 && f29 < 0.0f && this.J <= this.K - (f() / this.H)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f32 = this.J;
                                    float clamp4 = Utilities.clamp(f32 + f29, g11, v10);
                                    this.J = clamp4;
                                    if (Math.abs(f32 - clamp4) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    wb wbVar11 = this.a;
                                    if (wbVar11 != null) {
                                        wbVar11.z(this.I + ((long) (this.J * this.H)));
                                    }
                                    wb wbVar12 = this.a;
                                    if (wbVar12 != null) {
                                        wbVar12.n(this.J);
                                    }
                                } else if (i15 == 11) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.I) + min) / this.H);
                                    float f33 = this.J;
                                    float g12 = g();
                                    float f34 = this.H;
                                    float f35 = (g12 / f34) + f33;
                                    xb xbVar9 = this.h;
                                    if (xbVar9 != null) {
                                        min4 = Math.min(min4, (((xbVar9.h * xbVar9.e) + this.f) - this.I) / f34);
                                    }
                                    xb xbVar10 = this.v;
                                    if (xbVar10 != null) {
                                        d10 = Math.min(min4, (((xbVar10.h * xbVar10.e) + this.f) - this.I) / this.H);
                                    } else {
                                        d10 = org.telegram.ui.d3.d(f(), this.H, this.J, min4);
                                        if (!this.o1 && f29 > 0.0f) {
                                            if (this.K >= (f() / this.H) + this.J) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f36 = this.K;
                                    float clamp5 = Utilities.clamp(f36 + f29, d10, f35);
                                    this.K = clamp5;
                                    if (Math.abs(f36 - clamp5) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    wb wbVar13 = this.a;
                                    if (wbVar13 != null) {
                                        wbVar13.J(this.K);
                                    }
                                }
                                if (this.h1 == 12) {
                                    float min5 = f29 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.I) + min) / this.H) - this.K, f29) : Math.max((Math.max(0L, this.f - this.I) / this.H) - this.J, f29);
                                    float f37 = this.J + min5;
                                    this.J = f37;
                                    this.K += min5;
                                    wb wbVar14 = this.a;
                                    if (wbVar14 != null) {
                                        wbVar14.n(f37);
                                        this.a.z(this.I + ((long) (this.J * this.H)));
                                        this.a.J(this.K);
                                    }
                                    wb wbVar15 = this.a;
                                    if (wbVar15 != null) {
                                        wbVar15.o(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.J * this.H);
                                    wb wbVar16 = this.a;
                                    if (wbVar16 != null) {
                                        wbVar16.o(true);
                                        z13 = false;
                                        this.a.h(this.e, false);
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
                                        h((x9 / this.u1) * min);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else if (i17 == 9) {
                                        j((x9 / this.u1) * min);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else {
                                        int i18 = this.i1;
                                        if (i18 >= 0 && i18 < arrayList.size() && this.h1 == 16) {
                                            i((xb) arrayList.get(this.i1), (x9 / this.u1) * min);
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = true;
                                            this.l1 = false;
                                        } else if (this.l1) {
                                            m(motionEvent.getX(), currentTimeMillis - this.e1 < 350);
                                            if (this.m1 || (wbVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                wbVar2.o(true);
                                            }
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z14;
                                        }
                                    }
                                } else {
                                    xb xbVar11 = (xb) arrayList.get(this.i1);
                                    float f38 = (min / xbVar11.e) * (x9 / this.u1);
                                    int i19 = this.h1;
                                    if (i19 == 13) {
                                        float g13 = xbVar11.h - (g() / xbVar11.e);
                                        float max3 = Math.max(0L, this.f - xbVar11.f) / xbVar11.e;
                                        if (xbVar11 == this.v) {
                                            f10 = f38;
                                            max3 = org.telegram.ui.d3.v(f(), xbVar11.e, xbVar11.h, max3);
                                            if (!this.o1 && f10 < 0.0f) {
                                                f11 = 0.0f;
                                                if (xbVar11.g <= xbVar11.h - (f() / xbVar11.e)) {
                                                    this.h1 = 15;
                                                }
                                                f12 = xbVar11.g;
                                                clamp = Utilities.clamp(f12 + f10, g13, max3);
                                                xbVar11.g = clamp;
                                                if (Math.abs(f12 - clamp) > 0.01f) {
                                                    this.o1 = true;
                                                }
                                                wbVar3 = this.a;
                                                if (wbVar3 != null) {
                                                    wbVar3.K(xbVar11.a, xbVar11.f);
                                                }
                                                wbVar4 = this.a;
                                                if (wbVar4 != null) {
                                                    wbVar4.B(xbVar11.g, xbVar11.a);
                                                }
                                            }
                                        } else {
                                            f10 = f38;
                                        }
                                        f11 = 0.0f;
                                        f12 = xbVar11.g;
                                        clamp = Utilities.clamp(f12 + f10, g13, max3);
                                        xbVar11.g = clamp;
                                        if (Math.abs(f12 - clamp) > 0.01f) {
                                        }
                                        wbVar3 = this.a;
                                        if (wbVar3 != null) {
                                        }
                                        wbVar4 = this.a;
                                        if (wbVar4 != null) {
                                        }
                                    } else {
                                        f10 = f38;
                                        f11 = 0.0f;
                                        if (i19 == 14) {
                                            float min6 = Math.min(1.0f, Math.max(0L, (this.f - xbVar11.f) + min) / xbVar11.e);
                                            float g14 = (g() / xbVar11.e) + xbVar11.g;
                                            if (xbVar11 == this.v) {
                                                min6 = org.telegram.ui.d3.d(f(), xbVar11.e, xbVar11.g, min6);
                                                if (!this.o1 && f10 > 0.0f) {
                                                    if (xbVar11.h >= (f() / xbVar11.e) + xbVar11.g) {
                                                        this.h1 = 15;
                                                    }
                                                }
                                            }
                                            float f39 = xbVar11.h;
                                            float clamp6 = Utilities.clamp(f39 + f10, min6, g14);
                                            xbVar11.h = clamp6;
                                            if (Math.abs(f39 - clamp6) > 0.01f) {
                                                this.o1 = true;
                                            }
                                            wb wbVar17 = this.a;
                                            if (wbVar17 != null) {
                                                wbVar17.E(xbVar11.h, xbVar11.a);
                                            }
                                        }
                                    }
                                    if (this.h1 == 15) {
                                        float min7 = f10 > f11 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - xbVar11.f) + min) / xbVar11.e) - xbVar11.h, f10) : Math.max((Math.max(0L, this.f - xbVar11.f) / xbVar11.e) - xbVar11.g, f10);
                                        float f40 = xbVar11.g + min7;
                                        xbVar11.g = f40;
                                        xbVar11.h += min7;
                                        wb wbVar18 = this.a;
                                        if (wbVar18 != null) {
                                            wbVar18.B(f40, xbVar11.a);
                                            this.a.K(xbVar11.a, xbVar11.f);
                                            this.a.E(xbVar11.h, xbVar11.a);
                                        }
                                        wb wbVar19 = this.a;
                                        if (wbVar19 != null) {
                                            z15 = true;
                                            wbVar19.o(true);
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
                            float f41 = xbVar2.e;
                            float f42 = (min / f41) * (x9 / this.u1);
                            if (i11 == 2) {
                                xbVar2.g = Utilities.clamp(xbVar2.g + f42, xbVar2.h - (1000.0f / f41), 0.0f);
                                wb wbVar20 = this.a;
                                if (wbVar20 != null) {
                                    wbVar20.v(this.h.g, false);
                                }
                                xb xbVar12 = this.h;
                                float f43 = xbVar12.h - xbVar12.g;
                                float f44 = f();
                                xb xbVar13 = this.h;
                                if (f43 > f44 / xbVar13.e) {
                                    xbVar13.h = org.telegram.ui.d3.d(f(), this.h.e, xbVar13.g, 1.0f);
                                    wb wbVar21 = this.a;
                                    if (wbVar21 != null) {
                                        wbVar21.F(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                xbVar2.h = Utilities.clamp(xbVar2.h + f42, 1.0f, (1000.0f / f41) + xbVar2.g);
                                wb wbVar22 = this.a;
                                if (wbVar22 != null) {
                                    wbVar22.F(this.h.h);
                                }
                                xb xbVar14 = this.h;
                                float f45 = xbVar14.h - xbVar14.g;
                                float f46 = f();
                                xb xbVar15 = this.h;
                                if (f45 > f46 / xbVar15.e) {
                                    xbVar15.g = org.telegram.ui.d3.v(f(), this.h.e, xbVar15.h, 0.0f);
                                    wb wbVar23 = this.a;
                                    if (wbVar23 != null) {
                                        wbVar23.v(this.h.g, false);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min8 = f42 > 0.0f ? Math.min(1.0f - xbVar2.h, f42) : Math.max(-xbVar2.g, f42);
                                xb xbVar16 = this.h;
                                float f47 = xbVar16.g + min8;
                                xbVar16.g = f47;
                                xbVar16.h += min8;
                                wb wbVar24 = this.a;
                                if (wbVar24 != null) {
                                    wbVar24.v(f47, false);
                                    this.a.F(this.h.h);
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
                                    wbVar25.h(j16, false);
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
                        AndroidUtilities.cancelRunOnUIThread(u0Var);
                    }
                    int i20 = this.h1;
                    if ((i20 == 1 || i20 == 5 || i20 == 8) && (velocityTracker6 = this.p1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(u0Var);
                    vn0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.f1 > ViewConfiguration.getTapTimeout() || this.m1) && this.j0) {
                            int i21 = this.h1;
                            int i22 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                            if (i21 == 16 && (velocityTracker5 = this.p1) != null) {
                                velocityTracker5.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                    long min9 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i23 = this.y1;
                                    float f52 = i23;
                                    float f53 = min9;
                                    float f54 = this.u1;
                                    int i24 = (int) (((this.f / f53) * f54) + f52);
                                    int c10 = (int) a1.g.c(this.h.e - min9, f53, f54, f52);
                                    this.r1 = true;
                                    this.s1 = i24;
                                    this.W0.c(i24, 0, -xVelocity, 0, i23, c10, 0, 0);
                                    z10 = false;
                                }
                            } else if (i21 == 1 && (velocityTracker4 = this.p1) != null) {
                                velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity2 = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long min10 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i25 = this.y1;
                                    float f55 = i25;
                                    float f56 = min10;
                                    float f57 = this.u1;
                                    int i26 = (int) (((this.f / f56) * f57) + f55);
                                    int c11 = (int) a1.g.c(this.h.e - min10, f56, f57, f55);
                                    this.r1 = true;
                                    this.s1 = i26;
                                    this.W0.c(i26, 0, -xVelocity2, 0, i25, c11, 0, 0);
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
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i27 = (int) (((this.Q / min11) * this.u1) + this.y1 + this.x1);
                                    xb xbVar18 = this.h;
                                    if (xbVar18 != null) {
                                        float f58 = xbVar18.h;
                                        float f59 = xbVar18.e;
                                        j12 = this.R;
                                        j13 = (long) ((f58 * f59) - 0);
                                        f7 = xbVar18.g * f59;
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
                                        this.W0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min11) * f63) + f62), (int) a1.g.c(j11, min11, f63, f62), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f7 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.r1 = z12;
                                    this.s1 = i27;
                                    float f622 = this.y1 + this.x1;
                                    float f632 = this.u1;
                                    this.W0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min11) * f632) + f622), (int) a1.g.c(j11, min11, f632, f622), 0, 0);
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
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i28 = (int) (((this.I / min12) * this.u1) + this.y1 + this.x1);
                                    xb xbVar19 = this.h;
                                    if (xbVar19 != null) {
                                        float f64 = xbVar19.h;
                                        float f65 = xbVar19.e;
                                        j14 = (long) ((xbVar19.g * f65) - this.H);
                                        j15 = (long) ((f64 * f65) - 0);
                                    } else {
                                        j14 = -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.r1 = true;
                                    this.s1 = i28;
                                    float f66 = this.y1 + this.x1;
                                    float f67 = this.u1;
                                    this.W0.c(i28, 0, xVelocity4, 0, (int) (((j14 / min12) * f67) + f66), (int) a1.g.c(j15, min12, f67, f66), 0, 0);
                                    z10 = false;
                                }
                            }
                            r3Var = this.d1;
                            if (r3Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(r3Var);
                                this.d1 = null;
                            }
                            if (this.m1 || !z10 || (wbVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                wbVar.o(false);
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
                                            this.a.b(((xb) arrayList.get(this.k1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i29 == 2 && !this.P) {
                                    this.P = true;
                                    this.G = false;
                                    wb wbVar26 = this.a;
                                    if (wbVar26 != null) {
                                        wbVar26.A(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 && !this.G) {
                                    this.P = false;
                                    this.G = true;
                                    wb wbVar27 = this.a;
                                    if (wbVar27 != null) {
                                        wbVar27.A(true);
                                    }
                                    invalidate();
                                } else if (i29 != 2 && this.P) {
                                    this.P = false;
                                    this.G = false;
                                    wb wbVar28 = this.a;
                                    if (wbVar28 != null) {
                                        wbVar28.A(false);
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
                                    wb wbVar29 = this.a;
                                    if (wbVar29 != null) {
                                        wbVar29.A(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.y1) - this.x1) / this.u1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                xb xbVar20 = this.h;
                                float f68 = xbVar20.h - xbVar20.g;
                                xbVar20.g = (1.0f - f68) * (clamp7 / getBaseDuration());
                                xb xbVar21 = this.h;
                                float f69 = xbVar21.g;
                                xbVar21.h = f68 + f69;
                                wb wbVar30 = this.a;
                                if (wbVar30 != null) {
                                    wbVar30.v(f69, true);
                                    this.a.F(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.j1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    r3Var = this.d1;
                    if (r3Var != null) {
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
                this.a0 = new vb(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.g0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        a4.d dVar = new a4.d(17);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, dVar);
        xb xbVar = arrayList.isEmpty() ? null : (xb) arrayList.get(0);
        this.v = xbVar;
        if (xbVar != null) {
            long j10 = xbVar.f;
        }
    }

    public void setCollage(ArrayList<w7> arrayList) {
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
        this.h0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                w7 w7Var = arrayList.get(i12);
                if (w7Var.K) {
                    xb xbVar2 = new xb(this);
                    xbVar2.a = i12;
                    xbVar2.b = false;
                    xbVar2.d = w7Var.L.getAbsolutePath();
                    xbVar2.e = w7Var.h0;
                    xbVar2.f = w7Var.X;
                    xbVar2.i = w7Var.P;
                    xbVar2.g = w7Var.V;
                    xbVar2.h = w7Var.W;
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
        xb xbVar = this.h;
        if (xbVar != null) {
            if (j10 < this.e) {
                float f7 = j10;
                long j11 = xbVar.e;
                if (f7 <= (j11 * xbVar.g) + 240.0f) {
                }
            }
        }
        if (this.N && !this.E && xbVar == null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j12 = this.R;
                if (f10 <= (j12 * this.S) + 240.0f) {
                }
            }
        }
        if (this.E && xbVar == null) {
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
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        xb xbVar = this.h;
        if (xbVar == null) {
            return;
        }
        xbVar.h = f7;
        invalidate();
    }
}
