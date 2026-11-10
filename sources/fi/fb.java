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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fb extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Path D;
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
    public final eb I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public db M;
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
    public final wk0 W0;
    public boolean X0;
    public final bi.u0 Y0;
    public long Z0;
    public za a;
    public ya a0;
    public long a1;
    public Runnable b;
    public int b0;
    public final org.telegram.ui.Components.v5 b1;
    public int c;
    public final org.telegram.ui.Components.v5 c0;
    public long c1;
    public Runnable d;
    public final org.telegram.ui.Components.v5 d0;
    public bi.r3 d1;
    public long e;
    public final org.telegram.ui.Components.v5 e0;
    public long e1;
    public long f;
    public final org.telegram.ui.Components.v5 f0;
    public long f1;
    public final org.telegram.ui.Components.v5 g0;
    public float g1;
    public ab h;
    public final org.telegram.ui.Components.v5 h0;
    public int h1;
    public final org.telegram.ui.Components.v5 i0;
    public int i1;
    public boolean j0;
    public int j1;
    public final org.telegram.ui.Components.x9 k0;
    public int k1;
    public final org.telegram.ui.Components.ba l0;
    public boolean l1;
    public final org.telegram.ui.Components.ba m0;
    public boolean m1;
    public int n;
    public final org.telegram.ui.Components.ba n0;
    public float n1;
    public final RectF o0;
    public boolean o1;
    public final Path p0;
    public VelocityTracker p1;
    public final my0 q0;
    public boolean q1;
    public final ArrayList r;
    public final Drawable r0;
    public boolean r1;
    public final ArrayList s;
    public final eb s0;
    public int s1;
    public final RectF t0;
    public final float[] t1;
    public final Paint u0;
    public int u1;
    public final Path v0;
    public int v1;
    public ab w;
    public final Path w0;
    public int w1;
    public final Paint x;
    public final RectF x0;
    public int x1;
    public final Path y;
    public final Path y0;
    public int y1;
    public final Paint z0;
    public int z1;

    public fb(Context context, ViewGroup viewGroup, ha haVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.D = new Path();
        this.b0 = 1;
        wq wqVar = wq.h;
        this.c0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.d0 = new org.telegram.ui.Components.v5(this, 360L, wqVar);
        this.e0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.f0 = new org.telegram.ui.Components.v5(this, 360L, wqVar);
        this.g0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.h0 = new org.telegram.ui.Components.v5(this, 0L, 360L, wqVar);
        this.i0 = new org.telegram.ui.Components.v5(this, 0L, 320L, wqVar);
        this.j0 = true;
        this.o0 = new RectF();
        this.p0 = new Path();
        this.s0 = new eb();
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
        this.I0 = new eb();
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
        this.W0 = new wk0(getContext(), null);
        this.Z0 = -1L;
        this.a1 = -1L;
        this.b1 = new org.telegram.ui.Components.v5(0.0f, this, 0L, 340L, wqVar);
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
        this.q0 = new my0(id.M0(2131744456, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.k0 = x9Var;
        this.l0 = new org.telegram.ui.Components.ba(x9Var, this, 0, false);
        this.m0 = new org.telegram.ui.Components.ba(x9Var, this, 3, false);
        this.n0 = new org.telegram.ui.Components.ba(x9Var, this, 4, false);
        this.Y0 = new bi.u0(this, viewGroup, h6Var, x9Var, haVar, 13);
    }

    public static void a(final fb fbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.x9 x9Var, View view) {
        int i7;
        ArrayList arrayList = fbVar.s;
        int i10 = fbVar.j1;
        final int i11 = 0;
        final int i12 = 2;
        try {
            if (i10 == 2 && fbVar.N) {
                y6 y6Var = new y6(fbVar.getContext(), 0);
                y6Var.b = 0.0f;
                y6Var.c = 1.5f;
                y6Var.d(fbVar.V);
                y6Var.h = new c20(fbVar) { // from class: fi.xa
                    public final /* synthetic */ fb b;

                    {
                        this.b = fbVar;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i11) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.b;
                                fbVar2.V = floatValue;
                                za zaVar = fbVar2.a;
                                if (zaVar != null) {
                                    zaVar.h(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.b;
                                fbVar3.L = floatValue2;
                                za zaVar2 = fbVar3.a;
                                if (zaVar2 != null) {
                                    zaVar2.g(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                fb fbVar4 = this.b;
                                fbVar4.h.i = f10.floatValue();
                                za zaVar3 = fbVar4.a;
                                if (zaVar3 != null) {
                                    zaVar3.G(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                int i13 = fbVar.v1;
                int i14 = fbVar.y1;
                int i15 = fbVar.x1;
                float min2 = Math.min((i13 - i14) - i15, ((((org.telegram.messenger.g0.T1(fbVar.T, 1.0f, fbVar.f0.c) * fbVar.R) + (fbVar.Q - fbVar.f)) / min) * fbVar.u1) + i14 + i15);
                k60 F = k60.F(viewGroup, h6Var, fbVar);
                F.q(y6Var);
                F.o();
                F.c(R.drawable.msg_delete, id.M0(2131744720, null), new wa(fbVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(fbVar.v1 - min2)) + org.telegram.messenger.g0.L(18.0f), fbVar.F0.top);
                F.Z();
                F.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else {
                final int i16 = 1;
                if (i10 == 1 && fbVar.E) {
                    y6 y6Var2 = new y6(fbVar.getContext(), 0);
                    y6Var2.b = 0.0f;
                    y6Var2.c = 1.5f;
                    y6Var2.d(fbVar.L);
                    y6Var2.h = new c20(fbVar) { // from class: fi.xa
                        public final /* synthetic */ fb b;

                        {
                            this.b = fbVar;
                        }

                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj) {
                            Float f10 = (Float) obj;
                            switch (i16) {
                                case 0:
                                    float floatValue = f10.floatValue();
                                    fb fbVar2 = this.b;
                                    fbVar2.V = floatValue;
                                    za zaVar = fbVar2.a;
                                    if (zaVar != null) {
                                        zaVar.h(f10.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f10.floatValue();
                                    fb fbVar3 = this.b;
                                    fbVar3.L = floatValue2;
                                    za zaVar2 = fbVar3.a;
                                    if (zaVar2 != null) {
                                        zaVar2.g(f10.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    fb fbVar4 = this.b;
                                    fbVar4.h.i = f10.floatValue();
                                    za zaVar3 = fbVar4.a;
                                    if (zaVar3 != null) {
                                        zaVar3.G(f10.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    long min3 = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                    int i17 = fbVar.v1;
                    int i18 = fbVar.y1;
                    int i19 = fbVar.x1;
                    float min4 = Math.min((i17 - i18) - i19, ((((org.telegram.messenger.g0.T1(fbVar.K, 1.0f, fbVar.d0.c) * fbVar.H) + (fbVar.I - fbVar.f)) / min3) * fbVar.u1) + i18 + i19);
                    k60 F2 = k60.F(viewGroup, h6Var, fbVar);
                    F2.q(y6Var2);
                    F2.o();
                    F2.c(R.drawable.msg_delete, id.M0(2131744487, null), new wa(fbVar, 2), false);
                    F2.V(5);
                    F2.U = true;
                    F2.a0((-(fbVar.v1 - min4)) + org.telegram.messenger.g0.L(18.0f), fbVar.x0.top);
                    F2.Z();
                    F2.R(x9Var, -view.getX(), -view.getY());
                    fbVar.performHapticFeedback(0, 1);
                } else if (i10 == 0 && fbVar.h != null) {
                    y6 y6Var3 = new y6(fbVar.getContext(), 0);
                    y6Var3.b = 0.0f;
                    y6Var3.c = 1.5f;
                    y6Var3.d(fbVar.h.i);
                    y6Var3.h = new c20(fbVar) { // from class: fi.xa
                        public final /* synthetic */ fb b;

                        {
                            this.b = fbVar;
                        }

                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj) {
                            Float f10 = (Float) obj;
                            switch (i12) {
                                case 0:
                                    float floatValue = f10.floatValue();
                                    fb fbVar2 = this.b;
                                    fbVar2.V = floatValue;
                                    za zaVar = fbVar2.a;
                                    if (zaVar != null) {
                                        zaVar.h(f10.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f10.floatValue();
                                    fb fbVar3 = this.b;
                                    fbVar3.L = floatValue2;
                                    za zaVar2 = fbVar3.a;
                                    if (zaVar2 != null) {
                                        zaVar2.g(f10.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    fb fbVar4 = this.b;
                                    fbVar4.h.i = f10.floatValue();
                                    za zaVar3 = fbVar4.a;
                                    if (zaVar3 != null) {
                                        zaVar3.G(f10.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    k60 F3 = k60.F(viewGroup, h6Var, fbVar);
                    F3.q(y6Var3);
                    F3.V(5);
                    F3.U = true;
                    F3.a0(org.telegram.messenger.g0.L(18.0f), fbVar.t0.top);
                    F3.Z();
                    F3.R(x9Var, -view.getX(), -view.getY());
                    fbVar.performHapticFeedback(0, 1);
                } else {
                    if (i10 != 3 || (i7 = fbVar.k1) < 0 || i7 >= arrayList.size()) {
                        return;
                    }
                    ab abVar = (ab) arrayList.get(fbVar.k1);
                    y6 y6Var4 = new y6(fbVar.getContext(), 0);
                    y6Var4.b = 0.0f;
                    y6Var4.c = 1.5f;
                    y6Var4.d(abVar.i);
                    y6Var4.h = new ai.f1(15, fbVar, abVar);
                    k60 F4 = k60.F(viewGroup, h6Var, fbVar);
                    F4.q(y6Var4);
                    F4.V(5);
                    F4.U = true;
                    F4.a0(org.telegram.messenger.g0.L(18.0f), abVar.j.top);
                    F4.Z();
                    F4.R(x9Var, -view.getX(), -view.getY());
                    fbVar.performHapticFeedback(0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.g0.W1(this.f0.d(this.P), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        ab abVar = this.h;
        if (abVar != null) {
            return Math.max(1L, abVar.e);
        }
        ab abVar2 = this.w;
        return abVar2 != null ? Math.max(1L, abVar2.e) : this.E ? Math.max(1L, this.H) : Math.max(1L, this.R);
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
            f10 += org.telegram.messenger.g0.W1(((ab) arrayList.get(i7)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
        }
        return f10;
    }

    private float getRoundHeight() {
        if (this.E) {
            return org.telegram.messenger.g0.W1(this.d0.d(this.G), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
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
        boolean z9;
        int i7;
        ab abVar;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(this.e, getBaseDuration(), 0L);
        ab abVar2 = this.w;
        float f10 = min;
        float f11 = (this.u1 * (((k10 + (abVar2 != null ? (abVar2.g * abVar2.e) + abVar2.f : this.h == null ? this.Q : 0L)) - this.f) / f10)) + this.y1 + this.x1;
        if (!this.X0 && x10 >= f11 - org.telegram.messenger.g0.L(12.0f) && x10 <= f11 + org.telegram.messenger.g0.L(12.0f)) {
            return 0;
        }
        boolean z10 = this.h != null && y10 > (((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(2.0f));
        ArrayList arrayList = this.s;
        boolean z11 = !arrayList.isEmpty() && y10 > ((((((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(4.0f))) - getCollageHeight()) - ((float) org.telegram.messenger.g0.L(4.0f))) - ((float) org.telegram.messenger.g0.L(2.0f)) && y10 < (((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(2.0f));
        if (this.E) {
            if (y10 > (((((((this.w1 - this.z1) - getVideoHeight()) - org.telegram.messenger.g0.L(4.0f)) - getCollageHeight()) - org.telegram.messenger.g0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(2.0f)) {
                if (y10 < ((((this.w1 - this.z1) - getVideoHeight()) - org.telegram.messenger.g0.L(2.0f)) - getCollageHeight()) - org.telegram.messenger.g0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z9 = true;
                    if (z11) {
                        i7 = 1;
                        if (z10) {
                            float f12 = this.y1 + this.x1;
                            ab abVar3 = this.h;
                            float f13 = abVar3.g;
                            float f14 = abVar3.e;
                            float f15 = this.f;
                            float f16 = this.u1;
                            float f17 = ((((f13 * f14) - f15) / f10) * f16) + f12;
                            float f18 = ((((abVar3.h * f14) - f15) / f10) * f16) + f12;
                            if (this.X0) {
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
                                ab abVar4 = this.h;
                                if (abVar4.g > 0.01f || abVar4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z9) {
                            float f19 = this.y1 + this.x1;
                            float f20 = this.I;
                            float f21 = this.J;
                            float f22 = this.H;
                            float f23 = this.f;
                            float f24 = this.u1;
                            float f25 = (((((f21 * f22) + f20) - f23) / f10) * f24) + f19;
                            float f26 = (((((this.K * f22) + f20) - f23) / f10) * f24) + f19;
                            if (this.G || this.h == null) {
                                if (x10 >= f25 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f25) {
                                    return 10;
                                }
                                if (x10 >= f26 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f26) {
                                    return 11;
                                }
                                if (x10 >= f25 && x10 <= f26) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f27 = this.y1 + this.x1;
                                long j3 = this.I;
                                long j10 = this.f;
                                float f28 = this.u1;
                                float f29 = (((j3 - j10) / f10) * f28) + f27;
                                f26 = com.google.android.recaptcha.internal.a.c((j3 + this.H) - j10, f10, f28, f27);
                                f25 = f29;
                            }
                            if (x10 >= f25 && x10 <= f26) {
                                return 9;
                            }
                        } else if (this.N) {
                            float f30 = this.y1 + this.x1;
                            float f31 = this.Q;
                            float f32 = this.S;
                            float f33 = this.R;
                            float f34 = this.f;
                            float f35 = this.u1;
                            float f36 = (((((f32 * f33) + f31) - f34) / f10) * f35) + f30;
                            float f37 = (((((this.T * f33) + f31) - f34) / f10) * f35) + f30;
                            if (this.P || (this.h == null && !this.E)) {
                                if (x10 >= f36 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f36) {
                                    return 6;
                                }
                                if (x10 >= f37 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f37) {
                                    return 7;
                                }
                                if (x10 >= f36 && x10 <= f37) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f38 = this.y1 + this.x1;
                                long j11 = this.Q;
                                long j12 = this.f;
                                float f39 = this.u1;
                                float f40 = (((j11 - j12) / f10) * f39) + f38;
                                f37 = com.google.android.recaptcha.internal.a.c((j11 + this.R) - j12, f10, f39, f38);
                                f36 = f40;
                            }
                            if (x10 >= f36 && x10 <= f37) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ab abVar5 = (ab) arrayList.get(i10);
                            RectF rectF = org.telegram.messenger.g0.P;
                            rectF.set(abVar5.j);
                            rectF.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
                            if (rectF.contains(x10, y10)) {
                                float f41 = this.y1 + this.x1;
                                float f42 = abVar5.f;
                                float f43 = this.u1;
                                float f44 = ((f42 / f10) * f43) + f41;
                                float f45 = abVar5.g;
                                float f46 = abVar5.e;
                                float f47 = ((((f45 * f46) + f42) / f10) * f43) + f41;
                                float f48 = ((((abVar5.h * f46) + f42) / f10) * f43) + f41;
                                float c10 = com.google.android.recaptcha.internal.a.c(r6 + r11, f10, f43, f41);
                                this.i1 = i10;
                                if (x10 >= f47 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f47) {
                                    return 13;
                                }
                                if (x10 >= f48 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f48) {
                                    return 14;
                                }
                                if (x10 < f47 || x10 > f48 || (abVar5.g <= 0.01f && abVar5.h >= 0.99f)) {
                                    return (x10 < f44 || x10 > c10) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i7 = 1;
                    }
                    abVar = this.h;
                    if (abVar != null || abVar.e <= getMaxScrollDuration() || !z10) {
                        return -1;
                    }
                }
            }
        }
        z9 = false;
        if (z11) {
        }
        abVar = this.h;
        return abVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        wk0 wk0Var = this.W0;
        if (!wk0Var.b()) {
            if (this.r1) {
                this.r1 = false;
                za zaVar = this.a;
                if (zaVar != null) {
                    zaVar.x(false);
                    return;
                }
                return;
            }
            return;
        }
        int i7 = wk0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.q1) {
            this.f = (long) Math.max(0.0f, (((i7 - this.y1) - this.x1) / this.u1) * min);
        } else {
            if (!this.P) {
                wk0Var.a();
                return;
            }
            int i10 = this.y1;
            int i11 = this.x1;
            float f10 = this.u1;
            float f11 = min;
            h(((((i7 - i10) - i11) / f10) * f11) - ((((this.s1 - i10) - i11) / f10) * f11));
        }
        invalidate();
        this.s1 = i7;
    }

    public final void d(Canvas canvas, float f10, float f11, long j3, float f12) {
        float f13;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(j3, getBaseDuration(), 0L);
        ab abVar = this.w;
        if (abVar != null) {
            f13 = (abVar.g * abVar.e) + abVar.f;
        } else {
            f13 = this.h == null ? this.Q : 0L;
        }
        float f14 = (this.u1 * (((k10 + f13) - this.f) / min)) + this.y1 + this.x1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.C0;
        paint.setAlpha((int) (38.0f * f12));
        int i7 = (int) (f12 * 255.0f);
        Paint paint2 = this.D0;
        paint2.setAlpha(i7);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        rectF.inset(-org.telegram.messenger.g0.N(0.66f), -org.telegram.messenger.g0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        rectF.set(f14 - org.telegram.messenger.g0.N(1.5f), f16, org.telegram.messenger.g0.N(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
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
        long j3;
        Paint paint;
        ArrayList arrayList;
        float f10;
        org.telegram.ui.Components.ba baVar;
        RectF rectF2;
        int i7;
        long j10;
        int i10;
        ab abVar;
        ab abVar2;
        int i11;
        float f11;
        float max;
        long j11;
        float f12;
        Canvas canvas2;
        boolean z9;
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
        ArrayList arrayList3;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        Paint paint2;
        float f28;
        float f29;
        double d;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        Canvas canvas3;
        float f35;
        float f36;
        float f37;
        float f38;
        float T1;
        float y10;
        float f39;
        RectF rectF4;
        float f40;
        float f41;
        float f42;
        float N;
        float f43;
        float f44;
        float c10;
        float f45;
        float f46;
        long j13;
        float f47;
        float f48;
        float f49;
        ArrayList arrayList4;
        int i12;
        boolean z10;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i13;
        int i14;
        float f50;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i15;
        RectF rectF5;
        ArrayList arrayList9;
        float f51;
        float f52;
        Path path;
        float c11;
        float f53;
        float f54;
        float f55;
        int i16;
        long j14;
        float f56;
        float f57;
        float f58;
        ArrayList arrayList10;
        boolean z11;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z12;
        int i17;
        float f59;
        ArrayList arrayList13;
        ArrayList arrayList14;
        float f60;
        float f61;
        float f62;
        float f63;
        float f64;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        int i18;
        boolean z13;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        org.telegram.ui.Components.ba baVar2;
        char c12;
        boolean z14;
        fb fbVar = this;
        RectF rectF6 = fbVar.t0;
        RectF rectF7 = fbVar.x0;
        Path path2 = fbVar.w0;
        ArrayList arrayList20 = fbVar.r;
        Drawable drawable = fbVar.r0;
        org.telegram.ui.Components.x9 x9Var = fbVar.k0;
        RectF rectF8 = fbVar.F0;
        ArrayList arrayList21 = fbVar.s;
        RectF rectF9 = fbVar.o0;
        org.telegram.ui.Components.ba baVar3 = fbVar.l0;
        Paint c13 = baVar3.c(1.0f);
        float d2 = fbVar.i0.d(fbVar.j0);
        long min = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
        if (d2 < 1.0f) {
            rectF9.set(fbVar.y1, (fbVar.w1 - fbVar.z1) - org.telegram.messenger.g0.L(28.0f), fbVar.v1 - fbVar.y1, fbVar.w1 - fbVar.z1);
            fbVar.p0.rewind();
            fbVar.p0.addRoundRect(rectF9, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - d2) * 255.0f), 31);
            canvas.clipPath(fbVar.p0);
            if (x9Var.c()) {
                baVar3.a(canvas);
                canvas.drawColor(855638016);
                paint3 = c13;
            } else if (c13 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint3 = c13;
            } else {
                paint3 = c13;
                canvas.drawRect(rectF9, paint3);
                canvas.drawColor(855638016);
            }
            if (arrayList20.isEmpty() || !x9Var.c()) {
                paint4 = paint3;
                rectF = rectF6;
                baVar2 = baVar3;
                j3 = min;
                c12 = 31;
                if (!arrayList20.isEmpty()) {
                    Paint c14 = fbVar.n0.c(0.4f);
                    if (c14 == null) {
                        c14 = fbVar.H0;
                        c14.setAlpha(64);
                    }
                    z14 = false;
                    fbVar.s0.a((((fbVar.Q - fbVar.f) / j3) * fbVar.u1) + fbVar.y1 + fbVar.x1, rectF9.left, rectF9.right, org.telegram.messenger.g0.L(28.0f), fbVar.h0.e(false, eb.c(arrayList20)), rectF9.bottom, arrayList20);
                    canvas.drawPath(fbVar.s0, c14);
                    float g10 = ((fbVar.q0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - g10);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.Cells.f1.y(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.f1.f(2, centerY, drawable));
                    drawable.setAlpha(qs.V2);
                    drawable.draw(canvas);
                    my0 my0Var = fbVar.q0;
                    float centerX2 = (rectF9.centerX() - g10) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
                    float f65 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    baVar = baVar2;
                    f10 = 0.4f;
                    my0Var.c(centerX2, f65, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float e10 = fbVar.h0.e(false, eb.c(arrayList20));
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j3 = min;
                baVar2 = baVar3;
                fbVar.s0.a((((fbVar.Q - fbVar.f) / min) * fbVar.u1) + fbVar.y1 + fbVar.x1, rectF9.left, rectF9.right, org.telegram.messenger.g0.L(28.0f), e10, rectF9.bottom, arrayList20);
                c12 = 31;
                canvas.saveLayerAlpha(rectF9, qs.n1, 31);
                canvas.clipPath(fbVar.s0);
                fbVar.n0.a(canvas);
                canvas.restore();
            }
            z14 = false;
            float g102 = ((fbVar.q0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - g102);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.Cells.f1.y(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.f1.f(2, centerY2, drawable));
            drawable.setAlpha(qs.V2);
            drawable.draw(canvas);
            my0 my0Var2 = fbVar.q0;
            float centerX22 = (rectF9.centerX() - g102) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
            float f652 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            baVar = baVar2;
            f10 = 0.4f;
            my0Var2.c(centerX22, f652, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j3 = min;
            paint = c13;
            arrayList = arrayList21;
            f10 = 0.4f;
            baVar = baVar3;
            rectF2 = rectF8;
        }
        if (d2 > 0.0f) {
            if (d2 < 1.0f) {
                f12 = 0.0f;
                j11 = j3;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, fbVar.getWidth(), fbVar.getHeight(), (int) (d2 * 255.0f), 31);
                z9 = true;
            } else {
                j11 = j3;
                f12 = 0.0f;
                canvas2 = canvas;
                z9 = false;
            }
            ab abVar3 = fbVar.h;
            float f66 = abVar3 != null ? 1.0f : f12;
            float d10 = abVar3 != null ? abVar3.k.d((fbVar.P || fbVar.G) ? false : true) : f12;
            float f67 = fbVar.w1 - fbVar.z1;
            float L = org.telegram.messenger.g0.L(4.0f);
            if (fbVar.h != null) {
                canvas2.save();
                float videoHeight = fbVar.getVideoHeight();
                ab abVar4 = fbVar.h;
                float f68 = abVar4.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j15 = abVar4.e;
                float f69 = j15;
                float x10 = com.google.android.recaptcha.internal.a.x(f68, f69, d10, f12);
                float x11 = com.google.android.recaptcha.internal.a.x(abVar4.h, f69, d10, f12);
                if (j15 <= 0) {
                    f13 = d10;
                    f15 = f12;
                    f60 = f66;
                    j12 = j11;
                    f17 = L;
                    f61 = f15;
                } else {
                    f15 = f12;
                    f13 = d10;
                    f60 = f66;
                    j12 = j11;
                    f17 = L;
                    f61 = (fbVar.y1 + fbVar.x1) - (fbVar.u1 * (fbVar.f / j12));
                }
                f20 = x10;
                float f70 = fbVar.x1;
                float f71 = f61 - f70;
                if (j15 <= 0) {
                    f62 = f70;
                    f19 = x11;
                    f63 = f15;
                } else {
                    f62 = f70;
                    f19 = x11;
                    f63 = (((j15 - fbVar.f) / j12) * fbVar.u1) + fbVar.y1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f71, f67 - videoHeight, f63 + f62, f67);
                float f72 = f67 - ((f17 * f60) + videoHeight);
                float f73 = (rectF10.top * f13) + f15;
                f18 = (rectF10.bottom * f13) + f15;
                fbVar.v0.rewind();
                fbVar.v0.addRoundRect(rectF10, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(fbVar.v0);
                db dbVar = fbVar.h.c;
                if (dbVar != null) {
                    int i19 = dbVar.f;
                    float f74 = i19;
                    f21 = f73;
                    int max2 = (int) Math.max(0.0d, Math.floor((f71 - fbVar.y1) / f74));
                    f14 = f60;
                    int min2 = (int) Math.min(fbVar.h.c.c, Math.ceil(((r6 - f71) - fbVar.y1) / f74) + 1.0d);
                    int i20 = (int) rectF10.top;
                    arrayList15 = fbVar.h.c.d;
                    boolean z15 = arrayList15.size() >= min2;
                    boolean z16 = (i19 == 0 || !z15 || fbVar.h.b) ? false : true;
                    if (z16) {
                        int i21 = max2;
                        while (true) {
                            arrayList18 = fbVar.h.c.d;
                            if (i21 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = fbVar.h.c.d;
                            if (((cb) arrayList19.get(i21)).a == null) {
                                z16 = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (!z16) {
                        if (x9Var.c()) {
                            baVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF10, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i19 != 0) {
                        float f75 = f71;
                        int i22 = max2;
                        while (i22 < Math.min(arrayList16.size(), min2)) {
                            arrayList17 = fbVar.h.c.d;
                            cb cbVar = (cb) arrayList17.get(i22);
                            if (cbVar.a != null) {
                                i18 = min2;
                                z13 = z15;
                                fbVar.u0.setAlpha((int) (cbVar.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(cbVar.a, f75, i20 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), fbVar.u0);
                            } else {
                                i18 = min2;
                                z13 = z15;
                            }
                            f75 += f74;
                            i22++;
                            z15 = z13;
                            min2 = i18;
                        }
                    }
                    boolean z17 = z15;
                    f64 = 1.0f;
                    if (!z17) {
                        fbVar.h.c.c();
                    }
                } else {
                    f21 = f73;
                    f14 = f60;
                    f64 = 1.0f;
                }
                path2.rewind();
                if (fbVar.X0) {
                    f16 = f64;
                } else {
                    RectF rectF11 = org.telegram.messenger.g0.P;
                    int i23 = fbVar.y1;
                    int i24 = fbVar.x1;
                    float f76 = i23 + i24;
                    ab abVar5 = fbVar.h;
                    float f77 = abVar5.g;
                    f16 = f64;
                    int i25 = i24;
                    float f78 = abVar5.e;
                    float f79 = fbVar.f;
                    float f80 = (f77 * f78) - f79;
                    float f81 = j12;
                    float f82 = fbVar.u1;
                    float f83 = (((f80 / f81) * f82) + f76) - (f77 <= f15 ? i25 : 0);
                    float f84 = fbVar.w1 - fbVar.z1;
                    float f85 = f84 - videoHeight;
                    float f86 = abVar5.h;
                    float f87 = ((((f78 * f86) - f79) / f81) * f82) + f76;
                    if (f86 < f16) {
                        i25 = 0;
                    }
                    rectF11.set(f83, f85, f87 + i25, f84);
                    path2.addRoundRect(rectF11, fbVar.t1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f12 = videoHeight;
                f67 = f72;
            } else {
                f13 = d10;
                f14 = f66;
                f15 = f12;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j12 = j11;
                f16 = 1.0f;
                f17 = L;
                f18 = f12;
                f19 = f18;
                f20 = f19;
                f21 = f20;
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                f22 = f12;
                f23 = 0.0f;
            } else {
                fbVar.getCollageHeight();
                float f88 = f67;
                int i26 = 0;
                while (i26 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    ab abVar6 = (ab) arrayList22.get(i26);
                    org.telegram.ui.Components.v5 v5Var = abVar6.k;
                    RectF rectF12 = abVar6.j;
                    float f89 = f12;
                    float d11 = v5Var.d((fbVar.P || fbVar.G || fbVar.n != i26) ? false : true);
                    if (abVar6 != fbVar.w) {
                        i15 = i26;
                        arrayList9 = arrayList22;
                        float f90 = j12;
                        f51 = f18;
                        f52 = ((((org.telegram.messenger.g0.T1(abVar6.g, f15, d11) * abVar6.e) + (abVar6.f - fbVar.f)) / f90) * fbVar.u1) + fbVar.y1 + fbVar.x1;
                        rectF5 = rectF7;
                        c11 = (com.google.android.recaptcha.internal.a.y(org.telegram.messenger.g0.T1(abVar6.h, f16, d11), abVar6.e, abVar6.f - fbVar.f, f90) * fbVar.u1) + fbVar.y1 + fbVar.x1;
                        path = path2;
                    } else {
                        i15 = i26;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f51 = f18;
                        float f91 = fbVar.y1 + fbVar.x1;
                        float f92 = j12;
                        float f93 = (abVar6.f - fbVar.f) / f92;
                        float f94 = fbVar.u1;
                        f52 = (f93 * f94) + f91;
                        path = path2;
                        c11 = com.google.android.recaptcha.internal.a.c(r8 + abVar6.e, f92, f94, f91);
                    }
                    float f95 = f52;
                    canvas2.save();
                    float W1 = org.telegram.messenger.g0.W1(d11, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
                    float f96 = fbVar.x1;
                    rectF12.set(f95 - f96, f88 - W1, c11 + f96, f88);
                    f21 = (rectF12.top * d11) + f21;
                    f18 = (rectF12.bottom * d11) + f51;
                    float f97 = abVar6.f;
                    float f98 = abVar6.g;
                    float f99 = f88;
                    float f100 = abVar6.e;
                    f20 = (((f98 * f100) + f97) * d11) + f20;
                    f19 = (((abVar6.h * f100) + f97) * d11) + f19;
                    fbVar.y.rewind();
                    fbVar.y.addRoundRect(rectF12, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(fbVar.y);
                    db dbVar2 = abVar6.c;
                    if (dbVar2 != null) {
                        long j16 = abVar6.e;
                        f53 = W1;
                        if (j16 <= 0) {
                            j14 = j16;
                            f56 = 0.0f;
                        } else {
                            j14 = j16;
                            f56 = fbVar.y1 + fbVar.x1 + (((abVar6.f - fbVar.f) / j12) * fbVar.u1);
                        }
                        float f101 = fbVar.x1;
                        float f102 = f56 - f101;
                        if (j16 <= 0) {
                            f57 = f101;
                            f58 = 0.0f;
                        } else {
                            f57 = f101;
                            f58 = ((((abVar6.f + j14) - fbVar.f) / j12) * fbVar.u1) + fbVar.y1 + r7;
                        }
                        float f103 = f58 + f57;
                        int i27 = dbVar2.f;
                        float f104 = i27;
                        int max3 = (int) Math.max(0.0d, Math.floor((f102 - ((((abVar6.f - fbVar.f) / j12) * fbVar.u1) + (fbVar.y1 + fbVar.x1))) / f104));
                        int min3 = (int) Math.min(abVar6.c.c, Math.ceil((f103 - f102) / f104) + 1.0d);
                        int i28 = (int) rectF12.top;
                        arrayList10 = abVar6.c.d;
                        boolean z18 = arrayList10.size() >= min3;
                        if (z18) {
                            for (int i29 = max3; i29 < Math.min(arrayList13.size(), min3); i29++) {
                                arrayList14 = abVar6.c.d;
                                if (((cb) arrayList14.get(i29)).a == null) {
                                    z11 = false;
                                    break;
                                }
                            }
                        }
                        z11 = z18;
                        if (!z11) {
                            if (x9Var.c()) {
                                baVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i27 != 0) {
                            float f105 = f102;
                            while (max3 < Math.min(arrayList11.size(), min3)) {
                                arrayList12 = abVar6.c.d;
                                cb cbVar2 = (cb) arrayList12.get(max3);
                                int i30 = min3;
                                if (cbVar2.a != null) {
                                    z12 = z18;
                                    i17 = max3;
                                    f59 = f99;
                                    fbVar.x.setAlpha((int) (cbVar2.b.e(false, 1.0f) * 255.0f));
                                    canvas2.drawBitmap(cbVar2.a, f105, i28 - ((int) ((r4.getHeight() - f53) / 2.0f)), fbVar.x);
                                } else {
                                    z12 = z18;
                                    i17 = max3;
                                    f59 = f99;
                                }
                                f105 += f104;
                                max3 = i17 + 1;
                                min3 = i30;
                                z18 = z12;
                                f99 = f59;
                            }
                        }
                        f54 = f99;
                        if (!z18) {
                            abVar6.c.c();
                        }
                    } else {
                        f53 = W1;
                        f54 = f99;
                    }
                    fbVar.D.rewind();
                    if (!fbVar.X0) {
                        RectF rectF13 = org.telegram.messenger.g0.P;
                        int i31 = fbVar.y1;
                        int i32 = fbVar.x1;
                        float f106 = i31 + i32;
                        float f107 = abVar6.g;
                        float f108 = abVar6.e;
                        float f109 = fbVar.f;
                        float f110 = (f107 * f108) - f109;
                        float f111 = abVar6.f;
                        float f112 = j12;
                        float f113 = fbVar.u1;
                        float f114 = (((f110 + f111) / f112) * f113) + f106;
                        if (f107 <= 0.0f) {
                            f55 = f113;
                            i16 = i32;
                        } else {
                            f55 = f113;
                            i16 = 0;
                        }
                        float f115 = f114 - i16;
                        float f116 = rectF12.top;
                        float f117 = abVar6.h;
                        rectF13.set(f115, f116, (((((f108 * f117) - f109) + f111) / f112) * f55) + f106 + (f117 >= 1.0f ? i32 : 0), rectF12.bottom);
                        fbVar.D.addRoundRect(rectF13, fbVar.t1, Path.Direction.CW);
                        canvas2.clipPath(fbVar.D, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f88 = f54 - ((f17 * 1.0f) + f53);
                    i26 = i15 + 1;
                    path2 = path;
                    f12 = f89;
                    arrayList2 = arrayList9;
                    rectF7 = rectF5;
                    f16 = 1.0f;
                    f15 = 0.0f;
                }
                arrayList3 = arrayList2;
                f22 = f12;
                f67 = f88;
                f23 = 1.0f;
            }
            RectF rectF14 = rectF7;
            Path path3 = path2;
            float d12 = fbVar.c0.d(fbVar.E);
            float d13 = fbVar.d0.d(fbVar.E && fbVar.G);
            float roundHeight = fbVar.getRoundHeight() * d12;
            float f118 = ((fbVar.h == null && !fbVar.N && arrayList3.isEmpty()) ? 1.0f : d13) * d12;
            if (d12 > 0.0f) {
                long j17 = fbVar.I;
                float f119 = j17;
                float f120 = fbVar.J;
                float f121 = fbVar.H;
                f20 = (((f120 * f121) + f119) * f118) + f20;
                f19 = (((fbVar.K * f121) + f119) * f118) + f19;
                if (fbVar.h != null) {
                    float f122 = j12;
                    float T12 = ((((fbVar.H * org.telegram.messenger.g0.T1(f120, 0.0f, d13)) + (j17 - fbVar.f)) / f122) * fbVar.u1) + fbVar.y1 + fbVar.x1;
                    f44 = f18;
                    f24 = f23;
                    c10 = (com.google.android.recaptcha.internal.a.y(org.telegram.messenger.g0.T1(fbVar.K, 1.0f, d13), fbVar.H, fbVar.I - fbVar.f, f122) * fbVar.u1) + fbVar.y1 + fbVar.x1;
                    f45 = T12;
                } else {
                    f24 = f23;
                    f44 = f18;
                    float f123 = fbVar.y1 + fbVar.x1;
                    long j18 = j17 - fbVar.f;
                    float f124 = j12;
                    float f125 = fbVar.u1;
                    float f126 = ((j18 / f124) * f125) + f123;
                    c10 = com.google.android.recaptcha.internal.a.c(j18 + r6, f124, f125, f123);
                    f45 = f126;
                }
                float f127 = fbVar.x1;
                rectF14.set(f45 - f127, f67 - roundHeight, c10 + f127, f67);
                float f128 = f67 - ((f17 * d12) + roundHeight);
                f21 = (rectF14.top * f118) + f21;
                f18 = (rectF14.bottom * f118) + f44;
                fbVar.y0.rewind();
                fbVar.y0.addRoundRect(rectF14, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(fbVar.y0);
                db dbVar3 = fbVar.M;
                if (dbVar3 != null) {
                    float f129 = d13;
                    long j19 = fbVar.H;
                    if (j19 <= 0) {
                        f46 = f128;
                        j13 = j19;
                        f47 = 0.0f;
                    } else {
                        f46 = f128;
                        j13 = j19;
                        f47 = fbVar.y1 + fbVar.x1 + (((fbVar.I - fbVar.f) / j12) * fbVar.u1);
                    }
                    float f130 = fbVar.x1;
                    float f131 = f47 - f130;
                    if (j19 <= 0) {
                        f48 = f130;
                        f49 = 0.0f;
                    } else {
                        f48 = f130;
                        f49 = fbVar.y1 + r10 + ((((fbVar.I + j13) - fbVar.f) / j12) * fbVar.u1);
                    }
                    float f132 = f49 + f48;
                    int i33 = dbVar3.f;
                    float f133 = i33;
                    float f134 = f131;
                    int max4 = (int) Math.max(0.0d, Math.floor((f131 - (fbVar.h != null ? (((fbVar.I - fbVar.f) / j12) * fbVar.u1) + (fbVar.y1 + fbVar.x1) : fbVar.y1)) / f133));
                    int min4 = (int) Math.min(fbVar.M.c, Math.ceil((f132 - f134) / f133) + 1.0d);
                    int i34 = (int) rectF14.top;
                    arrayList4 = fbVar.M.d;
                    boolean z19 = arrayList4.size() >= min4;
                    if (z19) {
                        int i35 = max4;
                        i12 = i35;
                        while (i35 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = fbVar.M.d;
                            if (((cb) arrayList8.get(i35)).a == null) {
                                z10 = false;
                                break;
                            }
                            i35++;
                        }
                    } else {
                        i12 = max4;
                    }
                    z10 = z19;
                    if (!z10) {
                        if (x9Var.c()) {
                            baVar.a(canvas2);
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
                            arrayList6 = fbVar.M.d;
                            cb cbVar3 = (cb) arrayList6.get(i36);
                            int i37 = i36;
                            if (cbVar3.a != null) {
                                i13 = min4;
                                i14 = i34;
                                f50 = f129;
                                fbVar.u0.setAlpha((int) (cbVar3.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(cbVar3.a, f134, i14 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), fbVar.u0);
                            } else {
                                i13 = min4;
                                i14 = i34;
                                f50 = f129;
                            }
                            f134 += f133;
                            i36 = i37 + 1;
                            min4 = i13;
                            i34 = i14;
                            f129 = f50;
                        }
                    }
                    f25 = f129;
                    if (!z19) {
                        fbVar.M.c();
                    }
                } else {
                    f46 = f128;
                    f25 = d13;
                }
                path3.rewind();
                RectF rectF15 = org.telegram.messenger.g0.P;
                int i38 = fbVar.y1;
                int i39 = fbVar.x1;
                float f135 = i38 + i39;
                float f136 = fbVar.J;
                float f137 = fbVar.H;
                float f138 = f136 * f137;
                float f139 = fbVar.f;
                float f140 = f138 - f139;
                float f141 = fbVar.I;
                float f142 = j12;
                float f143 = (f140 + f141) / f142;
                float f144 = fbVar.u1;
                float f145 = (1.0f - f25) * i39;
                float f146 = (((f143 * f144) + f135) - (f136 <= 0.0f ? i39 : 0)) - f145;
                float f147 = rectF14.top;
                float f148 = fbVar.K;
                float f149 = (((((f137 * f148) - f139) + f141) / f142) * f144) + f135;
                if (f148 < 1.0f) {
                    i39 = 0;
                }
                rectF15.set(f146, f147, f149 + i39 + f145, rectF14.bottom);
                path3.addRoundRect(rectF15, fbVar.t1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f67 = f46;
            } else {
                f24 = f23;
                f25 = d13;
            }
            float d14 = fbVar.e0.d(fbVar.N);
            float d15 = fbVar.f0.d(fbVar.N && fbVar.P);
            float audioHeight = fbVar.getAudioHeight() * d14;
            float f150 = ((fbVar.h == null && !fbVar.E && arrayList3.isEmpty()) ? 1.0f : d15) * d14;
            if (d14 > 0.0f) {
                float f151 = fbVar.Q;
                float f152 = fbVar.S;
                float f153 = fbVar.R;
                f20 = (((f152 * f153) + f151) * f150) + f20;
                f19 = (((fbVar.T * f153) + f151) * f150) + f19;
                Paint c15 = fbVar.m0.c(d14);
                canvas2.save();
                if (fbVar.h == null && !fbVar.E && arrayList3.isEmpty()) {
                    float f154 = fbVar.y1 + fbVar.x1;
                    f38 = f18;
                    float f155 = fbVar.Q - fbVar.f;
                    float f156 = j12;
                    float f157 = fbVar.u1;
                    float f158 = ((f155 / f156) * f157) + f154;
                    paint2 = paint;
                    f37 = f150;
                    y10 = com.google.android.recaptcha.internal.a.c(r10 + fbVar.R, f156, f157, f154);
                    T1 = f158;
                } else {
                    f37 = f150;
                    f38 = f18;
                    paint2 = paint;
                    float f159 = j12;
                    T1 = ((((org.telegram.messenger.g0.T1(fbVar.S, 0.0f, d15) * fbVar.R) + (fbVar.Q - fbVar.f)) / f159) * fbVar.u1) + fbVar.y1 + fbVar.x1;
                    y10 = fbVar.y1 + fbVar.x1 + (com.google.android.recaptcha.internal.a.y(org.telegram.messenger.g0.T1(fbVar.T, 1.0f, d15), fbVar.R, fbVar.Q - fbVar.f, f159) * fbVar.u1);
                }
                float f160 = y10;
                float f161 = fbVar.x1;
                RectF rectF16 = rectF3;
                rectF16.set(T1 - f161, f67 - audioHeight, f160 + f161, f67);
                f21 = (rectF16.top * f37) + f21;
                float f162 = (rectF16.bottom * f37) + f38;
                fbVar.G0.rewind();
                fbVar.G0.addRoundRect(rectF16, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(fbVar.G0);
                if (x9Var != null && x9Var.c()) {
                    baVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d14, 855638016));
                } else if (c15 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d14, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c15);
                    canvas2.drawColor(org.telegram.ui.ActionBar.m6.r1(d14, 855638016));
                }
                if (fbVar.a0 == null || x9Var == null || !x9Var.c()) {
                    f39 = d15;
                    rectF4 = rectF16;
                    i7 = 1;
                    if (fbVar.a0 != null && c15 != null) {
                        Paint c16 = fbVar.n0.c(d14 * f10);
                        if (c16 == null) {
                            c16 = fbVar.H0;
                            c16.setAlpha((int) (64.0f * d14));
                        }
                        float e11 = fbVar.g0.e(!fbVar.U, fbVar.a0.e);
                        ya yaVar = fbVar.a0;
                        fbVar.U = yaVar.c > 0;
                        long j20 = j12;
                        fbVar.I0.b((((fbVar.Q - fbVar.f) / j12) * fbVar.u1) + fbVar.y1 + fbVar.x1, T1, f160, f39, j20, audioHeight, e11, rectF4.bottom, yaVar);
                        f40 = f39;
                        j10 = j20;
                        canvas2.drawPath(fbVar.I0, c16);
                        if (f40 >= 1.0f) {
                            int i40 = fbVar.y1;
                            float f163 = fbVar.x1 + i40;
                            float f164 = fbVar.Q - fbVar.f;
                            float f165 = fbVar.S;
                            float f166 = fbVar.R;
                            float f167 = j10;
                            float f168 = fbVar.u1;
                            float f169 = ((((f165 * f166) + f164) / f167) * f168) + f163;
                            float f170 = ((((fbVar.T * f166) + f164) / f167) * f168) + f163;
                            float min5 = (Math.min(fbVar.v1 - fbVar.y1, f170) + Math.max(i40, f169)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(fbVar.v1 - fbVar.y1, f170) - Math.max(fbVar.y1, f169)) - org.telegram.messenger.g0.L(24.0f));
                            float N2 = org.telegram.messenger.g0.N(13.0f);
                            if (fbVar.M0 == null && fbVar.Q0 == null) {
                                f42 = 13.0f;
                                N = 0.0f;
                            } else {
                                f42 = 13.0f;
                                N = org.telegram.messenger.g0.N(9.66f) + org.telegram.messenger.g0.N(3.11f) + fbVar.N0 + fbVar.R0;
                            }
                            float f171 = N2 + N;
                            int i41 = f171 < max5 ? i7 : 0;
                            float min6 = min5 - (Math.min(f171, max5) / 2.0f);
                            fbVar.K0.setBounds((int) min6, (int) (centerY3 - (org.telegram.messenger.g0.L(f42) / 2.0f)), (int) (org.telegram.messenger.g0.L(f42) + min6), (int) ((org.telegram.messenger.g0.L(f42) / 2.0f) + centerY3));
                            float f172 = 1.0f - f40;
                            float f173 = f172 * 255.0f;
                            fbVar.K0.setAlpha((int) f173);
                            fbVar.K0.draw(canvas2);
                            float N3 = org.telegram.messenger.g0.N(16.11f) + min6;
                            f41 = f162;
                            f28 = f13;
                            d = 0.0d;
                            f27 = d14;
                            f26 = f40;
                            f29 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, fbVar.v1, fbVar.w1, qs.e4, 31);
                            float min7 = Math.min(f170, fbVar.v1) - org.telegram.messenger.g0.L(12.0f);
                            canvas2.clipRect(N3, 0.0f, min7, fbVar.w1);
                            if (fbVar.M0 != null) {
                                canvas2.save();
                                canvas2.translate(N3 - fbVar.O0, centerY3 - (fbVar.M0.getHeight() / 2.0f));
                                fbVar.L0.setAlpha((int) (f173 * f27));
                                fbVar.M0.draw(canvas2);
                                canvas2.restore();
                                f43 = fbVar.N0 + N3;
                            } else {
                                f43 = N3;
                            }
                            if (fbVar.M0 != null && fbVar.Q0 != null) {
                                float N4 = org.telegram.messenger.g0.N(3.66f) + f43;
                                int alpha = fbVar.J0.getAlpha();
                                fbVar.J0.setAlpha((int) (alpha * f172));
                                canvas2.drawCircle(org.telegram.messenger.g0.L(1.0f) + N4, centerY3, org.telegram.messenger.g0.L(1.0f), fbVar.J0);
                                fbVar.J0.setAlpha(alpha);
                                f43 = org.telegram.messenger.g0.N(2.0f) + N4 + org.telegram.messenger.g0.N(4.0f);
                            }
                            if (fbVar.Q0 != null) {
                                canvas2.save();
                                canvas2.translate(f43 - fbVar.S0, centerY3 - (fbVar.Q0.getHeight() / 2.0f));
                                fbVar.P0.setAlpha((int) (f173 * f27));
                                fbVar.Q0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (i41 == 0) {
                                fbVar.U0.reset();
                                fbVar.U0.postScale(org.telegram.messenger.g0.N(8.0f) / 16.0f, 1.0f);
                                fbVar.U0.postTranslate(min7 - org.telegram.messenger.g0.L(8.0f), 0.0f);
                                fbVar.T0.setLocalMatrix(fbVar.U0);
                                canvas2.drawRect(min7 - org.telegram.messenger.g0.L(8.0f), rectF4.top, min7, rectF4.bottom, fbVar.V0);
                            }
                            canvas.restore();
                        } else {
                            f27 = d14;
                            f41 = f162;
                            f26 = f40;
                            f28 = f13;
                            f29 = f14;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f30 = f41;
                    }
                } else {
                    float e12 = fbVar.g0.e(!fbVar.U, fbVar.a0.e);
                    ya yaVar2 = fbVar.a0;
                    fbVar.U = yaVar2.c > 0;
                    i7 = 1;
                    rectF4 = rectF16;
                    f39 = d15;
                    fbVar.I0.b((((fbVar.Q - fbVar.f) / j12) * fbVar.u1) + fbVar.y1 + fbVar.x1, T1, f160, f39, j12, audioHeight, e12, rectF4.bottom, yaVar2);
                    canvas2.saveLayerAlpha(rectF4, qs.n1, 31);
                    canvas2.clipPath(fbVar.I0);
                    fbVar.n0.a(canvas2);
                    canvas2.restore();
                }
                j10 = j12;
                f40 = f39;
                if (f40 >= 1.0f) {
                }
                canvas.restore();
                f30 = f41;
            } else {
                f26 = d15;
                f27 = d14;
                float f174 = f18;
                paint2 = paint;
                f28 = f13;
                f29 = f14;
                d = 0.0d;
                i7 = 1;
                j10 = j12;
                f30 = f174;
            }
            float f175 = f21;
            float f176 = fbVar.y1 + fbVar.x1;
            float f177 = fbVar.f;
            float f178 = j10;
            float f179 = fbVar.u1;
            float f180 = (((f20 - f177) / f178) * f179) + f176;
            float f181 = (((f19 - f177) / f178) * f179) + f176;
            if (!arrayList3.isEmpty()) {
                f32 = d12;
                f31 = f27;
                f27 = f24;
            } else if (fbVar.N && fbVar.h == null) {
                f32 = d12;
                f31 = f27;
            } else {
                float f182 = f27;
                f27 = Math.max(f29, d12);
                f31 = f182;
                f32 = d12;
            }
            if (f31 > d || f32 > d || f29 > d || f24 > d) {
                if (fbVar.h == null && !fbVar.E && arrayList3.isEmpty()) {
                    f33 = f26;
                    f34 = f31 * org.telegram.messenger.g0.T1(0.6f, 1.0f, f33);
                } else {
                    f33 = f26;
                    f34 = 1.0f;
                }
                Paint paint5 = paint2;
                fbVar.e(canvas, paint5, f175, f30, f180, f181, f34 * f27);
                ab abVar7 = fbVar.h;
                if (abVar7 != null && ((fbVar.N || fbVar.E) && (f33 > 0.0f || f25 > 0.0f))) {
                    float f183 = fbVar.w1 - fbVar.z1;
                    float f184 = fbVar.x1 + fbVar.y1;
                    float f185 = abVar7.g;
                    float f186 = abVar7.e;
                    float f187 = fbVar.f;
                    float f188 = fbVar.u1;
                    float f189 = ((((abVar7.h * f186) - f187) / f178) * f188) + f184;
                    canvas3 = canvas;
                    fbVar.e(canvas3, paint5, f183 - f22, f183, ((((f185 * f186) - f187) / f178) * f188) + f184, f189, 0.8f);
                } else if (fbVar.w == null || arrayList3.size() <= i7) {
                    canvas3 = canvas;
                } else {
                    ab abVar8 = fbVar.w;
                    RectF rectF17 = abVar8.j;
                    float f190 = rectF17.top;
                    float f191 = rectF17.bottom;
                    float f192 = fbVar.x1 + fbVar.y1;
                    float f193 = abVar8.f;
                    float f194 = abVar8.g;
                    float f195 = abVar8.e;
                    float f196 = fbVar.f;
                    float f197 = fbVar.u1;
                    float f198 = (((((f194 * f195) + f193) - f196) / f178) * f197) + f192;
                    float f199 = (((((abVar8.h * f195) + f193) - f196) / f178) * f197) + f192;
                    canvas3 = canvas;
                    fbVar.e(canvas3, paint5, f190, f191, f198, f199, 0.8f);
                }
                if (fbVar.b0 > 1) {
                    ab abVar9 = fbVar.h;
                    if (abVar9 != null) {
                        float f200 = abVar9.e;
                        float f201 = abVar9.h;
                        float f202 = abVar9.g;
                        long j21 = (long) ((f201 - f202) * f200);
                        if (j21 > 68999) {
                            float f203 = fbVar.y1 + fbVar.x1;
                            float f204 = fbVar.f;
                            float f205 = fbVar.u1;
                            float f206 = ((((f202 * f200) - f204) / f178) * f205) + f203;
                            float f207 = ((((f201 * f200) - f204) / f178) * f205) + f203;
                            canvas3.save();
                            float f208 = fbVar.w1 - fbVar.z1;
                            canvas3.clipRect(f206, f208 - f22, f207, f208);
                            fbVar.z0.setAlpha((int) (org.telegram.messenger.g0.T1(0.8f, 1.0f, f28) * 255.0f));
                            i7 = 1;
                            long j22 = 59000;
                            int min8 = (int) Math.min(fbVar.b0 - 1, j21 / 59000);
                            int i42 = 1;
                            while (i42 <= min8) {
                                if (Math.min(j22, j21 - (i42 * j22)) < 1000) {
                                    break;
                                }
                                float f209 = fbVar.y1 + fbVar.x1;
                                ab abVar10 = fbVar.h;
                                float f210 = ((((((long) (abVar10.e * abVar10.g)) + r2) - fbVar.f) / f178) * fbVar.u1) + f209;
                                float f211 = fbVar.w1 - fbVar.z1;
                                Paint paint6 = fbVar.z0;
                                Canvas canvas4 = canvas3;
                                canvas4.drawRect(f210, (fbVar.w1 - fbVar.z1) - f22, org.telegram.messenger.g0.L(1.0f) + f210, f211, paint6);
                                canvas3 = canvas4;
                                StringBuilder sb2 = new StringBuilder("#");
                                i42++;
                                sb2.append(i42);
                                canvas3.drawText(sb2.toString(), f210 + org.telegram.messenger.g0.L(2.0f), ((fbVar.w1 - fbVar.z1) - f22) + org.telegram.messenger.g0.L(14.0f), fbVar.E0);
                                j22 = 59000;
                            }
                            canvas3.restore();
                        }
                    }
                    i7 = 1;
                } else {
                    i7 = 1;
                }
                float e13 = fbVar.b1.e(false, 0.0f);
                float contentHeight = ((fbVar.w1 - fbVar.getContentHeight()) + fbVar.z1) - org.telegram.messenger.g0.N(2.3f);
                float N5 = org.telegram.messenger.g0.N(4.3f) + (fbVar.w1 - fbVar.z1);
                if (e13 > 0.0f) {
                    long j23 = fbVar.c1;
                    if (j23 == -1) {
                        ab abVar11 = fbVar.h;
                        if (abVar11 != null) {
                            j23 = (long) (abVar11.e * abVar11.h);
                        } else {
                            ab abVar12 = fbVar.w;
                            if (abVar12 != null) {
                                j23 = (long) ((abVar12.h - abVar12.g) * abVar12.e);
                            } else {
                                if (fbVar.E) {
                                    f35 = fbVar.H;
                                    f36 = fbVar.K;
                                } else {
                                    f35 = fbVar.R;
                                    f36 = fbVar.T;
                                }
                                j23 = (long) (f35 * f36);
                            }
                        }
                    }
                    fbVar = this;
                    fbVar.d(canvas3, contentHeight, N5, j23, e13 * f27);
                } else {
                    fbVar = fbVar;
                }
                fbVar.d(canvas, contentHeight, N5, fbVar.e, (1.0f - e13) * f27);
            }
            if (z9) {
                canvas.restore();
            }
        } else {
            i7 = 1;
            j10 = j3;
        }
        if (fbVar.m1) {
            float f212 = 1.0f / (1000.0f / org.telegram.messenger.g0.r);
            float f213 = fbVar.n1;
            long L2 = (long) ((org.telegram.messenger.g0.L(32.0f) / fbVar.u1) * j10 * f212 * f213);
            if (fbVar.X0) {
                fbVar.n1 = (f212 * 0.25f) + f213;
            }
            int i43 = fbVar.h1;
            if (i43 == 4 && (abVar2 = fbVar.h) != null) {
                float f214 = abVar2.g;
                long j24 = fbVar.f;
                long j25 = abVar2.e;
                float f215 = j25;
                if (f214 < j24 / f215) {
                    i11 = -1;
                } else if (abVar2.h > (j24 + j10) / f215) {
                    i11 = i7;
                } else {
                    fbVar.n1 = 1.0f;
                    i11 = 0;
                }
                long j26 = i11 * L2;
                fbVar.f = Utilities.k(j24 + j26, j25 - j10, 0L);
                fbVar.e += j26;
                ab abVar13 = fbVar.h;
                float f216 = (r3 - j24) / abVar13.e;
                if (f216 > 0.0f) {
                    f11 = 1.0f;
                    max = Math.min(1.0f - abVar13.h, f216);
                } else {
                    f11 = 1.0f;
                    max = Math.max(0.0f - abVar13.g, f216);
                }
                ab abVar14 = fbVar.h;
                abVar14.g = Utilities.i(abVar14.g + max, f11, 0.0f);
                ab abVar15 = fbVar.h;
                abVar15.h = Utilities.i(abVar15.h + max, f11, 0.0f);
                za zaVar = fbVar.a;
                if (zaVar != null) {
                    zaVar.t(false, fbVar.h.g);
                    fbVar.a.T(fbVar.h.h);
                }
                fbVar.invalidate();
            } else if (i43 == 8) {
                float f217 = fbVar.S;
                long j27 = fbVar.Q;
                float f218 = (-j27) + 100;
                long j28 = fbVar.R;
                float f219 = j28;
                if (f217 < f218 / f219) {
                    i10 = -1;
                } else if (fbVar.T >= ((r8 + j10) - 100) / f219) {
                    i10 = i7;
                } else {
                    fbVar.n1 = 1.0f;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (fbVar.P && (abVar = fbVar.h) != null) {
                        long j29 = j27 - (i10 * L2);
                        float f220 = abVar.h;
                        float f221 = abVar.e;
                        fbVar.Q = Utilities.k(j29, (long) ((f220 * f221) - (f217 * f219)), (long) ((abVar.g * f221) - (fbVar.T * f219)));
                    } else if (fbVar.G && fbVar.E) {
                        long j30 = j27 - (i10 * L2);
                        float f222 = fbVar.K;
                        float f223 = fbVar.H;
                        fbVar.Q = Utilities.k(j30, (long) ((f222 * f223) - (f217 * f219)), (long) ((fbVar.J * f223) - (fbVar.T * f219)));
                    } else {
                        fbVar.Q = Utilities.k(j27 - (i10 * L2), 0L, -(j28 - Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration())));
                    }
                    float f224 = (-(fbVar.Q - j27)) / fbVar.R;
                    float min9 = f224 > 0.0f ? Math.min(1.0f - fbVar.T, f224) : Math.max(0.0f - fbVar.S, f224);
                    if (fbVar.h == null) {
                        float f225 = fbVar.e;
                        float f226 = fbVar.R;
                        fbVar.e = (long) Utilities.i((min9 * f226) + f225, f226, 0.0f);
                    }
                    fbVar.S = Utilities.i(fbVar.S + min9, 1.0f, 0.0f);
                    fbVar.T = Utilities.i(fbVar.T + min9, 1.0f, 0.0f);
                    za zaVar2 = fbVar.a;
                    if (zaVar2 != null) {
                        zaVar2.Q(fbVar.S);
                        fbVar.a.O(fbVar.T);
                        fbVar.a.j(fbVar.e, false);
                    }
                    fbVar.invalidate();
                } else {
                    fbVar.n1 = 1.0f;
                }
            } else {
                fbVar.n1 = 1.0f;
            }
        } else {
            fbVar.n1 = 1.0f;
        }
        int contentHeight2 = fbVar.getContentHeight();
        if (fbVar.c != contentHeight2) {
            fbVar.c = contentHeight2;
            Runnable runnable = fbVar.d;
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.v1, this.w1, qs.e4, 31);
        int i7 = (int) (255.0f * f14);
        Paint paint2 = this.z0;
        paint2.setAlpha(i7);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint2);
        rectF.inset(org.telegram.messenger.g0.L(this.X0 ? 2.5f : 10.0f), org.telegram.messenger.g0.L(2.0f));
        boolean z9 = this.X0;
        Paint paint3 = this.A0;
        if (z9) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(10.0f);
        Paint paint4 = this.B0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(qs.e4);
        paint5.setAlpha(i7);
        float f15 = f10 + f11;
        float f16 = (f15 - L2) / 2.0f;
        float f17 = (f15 + L2) / 2.0f;
        rectF.set(org.telegram.messenger.k5.y(org.telegram.messenger.g0.L(this.X0 ? 2.0f : 10.0f), L, 2.0f, f12), f16, f12 - ((org.telegram.messenger.g0.L(this.X0 ? 2.0f : 10.0f) + L) / 2.0f), f17);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            if (paint != null && !this.X0) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint4);
            }
        }
        rectF.set(com.google.android.recaptcha.internal.a.A(org.telegram.messenger.g0.L(this.X0 ? 2.5f : 10.0f), L, 2.0f, f13), f16, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(this.X0 ? 2.5f : 10.0f), L, 2.0f, f13), f17);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint4);
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
        return (int) (this.z1 + (this.h != null ? getVideoHeight() + org.telegram.messenger.g0.L(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + org.telegram.messenger.g0.L(4.0f)) + (this.E ? getRoundHeight() + org.telegram.messenger.g0.L(4.0f) : 0.0f) + (this.N ? org.telegram.messenger.g0.L(4.0f) + getAudioHeight() : 0.0f) + this.z1);
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
        return org.telegram.messenger.g0.W1(this.i0.c, org.telegram.messenger.g0.L(28.0f) + this.z1 + this.z1, getContentHeight());
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
        za zaVar;
        long k10;
        ab abVar = this.h;
        if (abVar == null && !this.E) {
            long j15 = this.Q;
            long k11 = Utilities.k(j15 + ((long) f10), 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = k11;
            float f13 = k11 - j15;
            this.S = Utilities.i(this.S - (f13 / this.R), 1.0f, 0.0f);
            this.T = Utilities.i(this.T - (f13 / this.R), 1.0f, 0.0f);
            za zaVar2 = this.a;
            if (zaVar2 != null) {
                zaVar2.Q(this.S);
                this.a.O(this.T);
            }
        } else if (this.P) {
            if (abVar != null) {
                f11 = abVar.g;
                j3 = abVar.e;
            } else {
                f11 = this.J;
                j3 = this.H;
            }
            float f14 = f11 * j3;
            if (abVar != null) {
                f12 = abVar.h;
                j10 = abVar.e;
            } else {
                f12 = this.K;
                j10 = this.H;
            }
            float f15 = f12 * j10;
            float f16 = abVar != null ? (abVar.h - abVar.g) * abVar.e : this.H * (this.K - this.J);
            float f17 = this.T;
            float f18 = this.R;
            long j16 = (long) (f15 - (f17 * f18));
            float f19 = this.S;
            long j17 = (long) (f14 - (f19 * f18));
            float min = Math.min(f17 - f19, f16 / f18);
            long j18 = this.Q;
            long j19 = (long) f10;
            long j20 = j18 + j19;
            if (j20 > j16) {
                float i7 = Utilities.i(((f15 - j18) - j19) / this.R, 1.0f, min);
                this.T = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.S = i10;
                float f20 = this.T;
                float f21 = this.R;
                long j21 = (long) (f15 - (f20 * f21));
                long j22 = (long) (f14 - (i10 * f21));
                if (j21 < j22) {
                    j14 = j22;
                    j13 = j21;
                } else {
                    j13 = j22;
                    j14 = j21;
                }
                this.Q = Utilities.k(this.Q + j19, j14, j13);
                za zaVar3 = this.a;
                if (zaVar3 != null) {
                    zaVar3.Q(this.S);
                    this.a.O(this.T);
                }
            } else if (j20 < j17) {
                float i11 = Utilities.i(((f14 - j18) - j19) / this.R, 1.0f - min, 0.0f);
                this.S = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.T = i12;
                float f22 = this.R;
                long j23 = (long) (f15 - (i12 * f22));
                long j24 = (long) (f14 - (this.S * f22));
                if (j23 < j24) {
                    j12 = j24;
                    j11 = j23;
                } else {
                    j11 = j24;
                    j12 = j23;
                }
                this.Q = Utilities.k(this.Q + j19, j12, j11);
                za zaVar4 = this.a;
                if (zaVar4 != null) {
                    zaVar4.Q(this.S);
                    this.a.O(this.T);
                }
            } else {
                this.Q = j20;
            }
        } else {
            long j25 = this.Q + ((long) f10);
            float baseDuration = getBaseDuration();
            float f23 = this.R;
            this.Q = Utilities.k(j25, (long) (baseDuration - (this.T * f23)), (long) ((-this.S) * f23));
        }
        invalidate();
        za zaVar5 = this.a;
        if (zaVar5 != null) {
            zaVar5.e0(this.Q + ((long) (this.S * this.R)));
        }
        boolean z9 = this.m1;
        if (z9 || (zaVar = this.a) == null) {
            if (z9 || this.r1) {
                ab abVar2 = this.h;
                if (abVar2 != null) {
                    long j26 = this.Q + ((long) (this.S * this.R));
                    float f24 = abVar2.h;
                    float f25 = abVar2.e;
                    this.e = Utilities.k(j26, (long) (f24 * f25), (long) (abVar2.g * f25));
                } else if (!this.E || abVar2 == null) {
                    float f26 = this.S;
                    long j27 = this.R;
                    this.e = Utilities.k((long) (f26 * j27), j27, 0L);
                } else {
                    long j28 = this.Q + ((long) (this.S * this.R));
                    float f27 = this.K;
                    float f28 = abVar2.e;
                    this.e = Utilities.k(j28, (long) (f27 * f28), (long) (this.J * f28));
                }
                za zaVar6 = this.a;
                if (zaVar6 != null) {
                    zaVar6.j(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        zaVar.x(true);
        ab abVar3 = this.h;
        if (abVar3 != null) {
            long j29 = this.Q + ((long) (this.S * this.R));
            float f29 = abVar3.h;
            float f30 = abVar3.e;
            k10 = Utilities.k(j29, (long) (f29 * f30), (long) (abVar3.g * f30));
        } else if (this.E) {
            long j30 = this.Q + ((long) (this.S * this.R));
            float f31 = this.K;
            float f32 = this.H;
            k10 = Utilities.k(j30, (long) (f31 * f32), (long) (this.J * f32));
        } else {
            float f33 = this.S;
            long j31 = this.R;
            k10 = Utilities.k((long) (f33 * j31), j31, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.c1 = this.e;
            this.b1.e(true, 1.0f);
        }
        za zaVar7 = this.a;
        this.e = k10;
        zaVar7.j(k10, false);
    }

    public final void i(ab abVar, float f10) {
        za zaVar;
        long k10;
        long j3;
        long j10;
        long j11;
        long j12;
        if (abVar == null) {
            return;
        }
        ab abVar2 = this.w;
        if (abVar2 != abVar && abVar2 != null) {
            if (this.n == this.s.indexOf(abVar)) {
                ab abVar3 = this.w;
                float f11 = abVar3.e;
                float f12 = abVar.h;
                float f13 = abVar.e;
                long j13 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = abVar.g;
                long j14 = (long) ((f11 * 0.0f) - (f14 * f13));
                float min = Math.min(f12 - f14, ((abVar3.h - abVar3.g) * f11) / f13);
                long j15 = abVar.f;
                long j16 = (long) f10;
                long j17 = j15 + j16;
                if (j17 > j13) {
                    float i7 = Utilities.i((((this.w.h * r2.e) - j15) - j16) / abVar.e, 1.0f, min);
                    abVar.h = i7;
                    float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                    abVar.g = i10;
                    ab abVar4 = this.w;
                    float f15 = abVar4.h;
                    float f16 = abVar4.e;
                    float f17 = abVar.h;
                    float f18 = abVar.e;
                    long j18 = (long) ((f15 * f16) - (f17 * f18));
                    long j19 = (long) ((abVar4.g * f16) - (i10 * f18));
                    if (j18 < j19) {
                        j12 = j19;
                        j11 = j18;
                    } else {
                        j11 = j19;
                        j12 = j18;
                    }
                    abVar.f = Utilities.k(abVar.f + j16, j12, j11);
                    za zaVar2 = this.a;
                    if (zaVar2 != null) {
                        zaVar2.N(abVar.g, abVar.a);
                        this.a.S(abVar.h, abVar.a);
                    }
                } else if (j17 < j14) {
                    float i11 = Utilities.i((((this.w.g * r2.e) - j15) - j16) / abVar.e, 1.0f - min, 0.0f);
                    abVar.g = i11;
                    float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                    abVar.h = i12;
                    ab abVar5 = this.w;
                    float f19 = abVar5.h;
                    float f20 = abVar5.e;
                    float f21 = abVar.e;
                    long j20 = (long) ((f19 * f20) - (i12 * f21));
                    long j21 = (long) ((abVar5.g * f20) - (abVar.g * f21));
                    if (j20 < j21) {
                        j10 = j21;
                        j3 = j20;
                    } else {
                        j3 = j21;
                        j10 = j20;
                    }
                    abVar.f = Utilities.k(abVar.f + j16, j10, j3);
                    za zaVar3 = this.a;
                    if (zaVar3 != null) {
                        zaVar3.N(abVar.g, abVar.a);
                        this.a.S(abVar.h, abVar.a);
                    }
                } else {
                    abVar.f = j17;
                }
            } else {
                long j22 = abVar.f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = abVar.e;
                abVar.f = Utilities.k(j22, (long) (baseDuration - (abVar.h * f22)), (long) ((-abVar.g) * f22));
            }
        }
        invalidate();
        za zaVar4 = this.a;
        if (zaVar4 != null) {
            zaVar4.b0(abVar.a, abVar.f);
        }
        boolean z9 = this.m1;
        if (z9 || (zaVar = this.a) == null) {
            if (z9 || this.r1) {
                ab abVar6 = this.w;
                if (abVar6 == abVar || abVar6 == null) {
                    float f23 = abVar.g;
                    long j23 = abVar.e;
                    this.e = Utilities.k((long) (f23 * j23), j23, 0L);
                } else {
                    long j24 = abVar.f + ((long) (abVar.g * abVar.e));
                    float f24 = abVar6.h;
                    float f25 = abVar6.e;
                    this.e = Utilities.k(j24, (long) (f24 * f25), (long) (abVar6.g * f25));
                }
                za zaVar5 = this.a;
                if (zaVar5 != null) {
                    zaVar5.j(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        zaVar.x(true);
        ab abVar7 = this.w;
        if (abVar7 == abVar || abVar7 == null) {
            float f26 = abVar.g;
            long j25 = abVar.e;
            k10 = Utilities.k((long) (f26 * j25), j25, 0L);
        } else {
            long j26 = abVar.f + ((long) (abVar.g * abVar.e));
            float f27 = abVar7.h;
            float f28 = abVar7.e;
            k10 = Utilities.k(j26, (long) (f27 * f28), (long) (abVar7.g * f28));
        }
        ab abVar8 = this.w;
        if (abVar8 != abVar && abVar8 != null && Math.abs(this.e - k10) > 400) {
            this.c1 = this.e;
            this.b1.e(true, 1.0f);
        }
        za zaVar6 = this.a;
        this.e = k10;
        zaVar6.j(k10, false);
    }

    public final void j(float f10) {
        long j3;
        long j10;
        long j11;
        long j12;
        za zaVar;
        long k10;
        ab abVar = this.h;
        if (abVar == null) {
            long j13 = this.I;
            long k11 = Utilities.k(j13 + ((long) f10), 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = k11;
            float f11 = k11 - j13;
            this.J = Utilities.i(this.J - (f11 / this.H), 1.0f, 0.0f);
            this.K = Utilities.i(this.K - (f11 / this.H), 1.0f, 0.0f);
            za zaVar2 = this.a;
            if (zaVar2 != null) {
                zaVar2.u(this.J);
                this.a.a0(this.K);
            }
        } else if (this.G) {
            float f12 = abVar.h;
            float f13 = abVar.e;
            float f14 = this.K;
            float f15 = this.H;
            long j14 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = abVar.g;
            float f17 = this.J;
            long j15 = (long) ((f16 * f13) - (f17 * f15));
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j16 = this.I;
            long j17 = (long) f10;
            long j18 = j16 + j17;
            if (j18 > j14) {
                float i7 = Utilities.i((((this.h.h * r1.e) - j16) - j17) / this.H, 1.0f, min);
                this.K = i7;
                float i10 = Utilities.i(i7 - min, 1.0f, 0.0f);
                this.J = i10;
                ab abVar2 = this.h;
                float f18 = abVar2.h;
                float f19 = abVar2.e;
                float f20 = this.K;
                float f21 = this.H;
                long j19 = (long) ((f18 * f19) - (f20 * f21));
                long j20 = (long) ((abVar2.g * f19) - (i10 * f21));
                if (j19 < j20) {
                    j12 = j20;
                    j11 = j19;
                } else {
                    j11 = j20;
                    j12 = j19;
                }
                this.I = Utilities.k(this.I + j17, j12, j11);
                za zaVar3 = this.a;
                if (zaVar3 != null) {
                    zaVar3.u(this.J);
                    this.a.a0(this.K);
                }
            } else if (j18 < j15) {
                float i11 = Utilities.i((((this.h.g * r1.e) - j16) - j17) / this.H, 1.0f - min, 0.0f);
                this.J = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.K = i12;
                ab abVar3 = this.h;
                float f22 = abVar3.h;
                float f23 = abVar3.e;
                float f24 = this.H;
                long j21 = (long) ((f22 * f23) - (i12 * f24));
                long j22 = (long) ((abVar3.g * f23) - (this.J * f24));
                if (j21 < j22) {
                    j10 = j22;
                    j3 = j21;
                } else {
                    j3 = j22;
                    j10 = j21;
                }
                this.I = Utilities.k(this.I + j17, j10, j3);
                za zaVar4 = this.a;
                if (zaVar4 != null) {
                    zaVar4.u(this.J);
                    this.a.a0(this.K);
                }
            } else {
                this.I = j18;
            }
        } else {
            long j23 = this.I + ((long) f10);
            float baseDuration = getBaseDuration();
            float f25 = this.H;
            this.I = Utilities.k(j23, (long) (baseDuration - (this.K * f25)), (long) ((-this.J) * f25));
        }
        invalidate();
        za zaVar5 = this.a;
        if (zaVar5 != null) {
            zaVar5.J(this.I + ((long) (this.J * this.H)));
        }
        boolean z9 = this.m1;
        if (z9 || (zaVar = this.a) == null) {
            if (z9 || this.r1) {
                ab abVar4 = this.h;
                if (abVar4 != null) {
                    long j24 = this.I + ((long) (this.J * this.H));
                    float f26 = abVar4.h;
                    float f27 = abVar4.e;
                    this.e = Utilities.k(j24, (long) (f26 * f27), (long) (abVar4.g * f27));
                } else {
                    float f28 = this.J;
                    long j25 = this.H;
                    this.e = Utilities.k((long) (f28 * j25), j25, 0L);
                }
                za zaVar6 = this.a;
                if (zaVar6 != null) {
                    zaVar6.j(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        zaVar.x(true);
        ab abVar5 = this.h;
        if (abVar5 != null) {
            long j26 = this.I + ((long) (this.J * this.H));
            float f29 = abVar5.h;
            float f30 = abVar5.e;
            k10 = Utilities.k(j26, (long) (f29 * f30), (long) (abVar5.g * f30));
        } else {
            float f31 = this.J;
            long j27 = this.H;
            k10 = Utilities.k((long) (f31 * j27), j27, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.c1 = this.e;
            this.b1.e(true, 1.0f);
        }
        za zaVar7 = this.a;
        this.e = k10;
        zaVar7.j(k10, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ab abVar = this.h;
        float f10 = (abVar.h + abVar.g) / 2.0f;
        long j3 = abVar.e;
        this.f = Utilities.k((long) ((f10 * j3) - (min / 2.0f)), j3 - min, 0L);
        invalidate();
    }

    public final void l(boolean z9) {
        if (z9 && this.E) {
            this.G = true;
            this.P = false;
        } else {
            this.G = false;
            this.P = this.N && this.h == null;
        }
        invalidate();
    }

    public final boolean m(boolean z9, float f10) {
        ab abVar = this.h;
        ArrayList arrayList = this.s;
        if (abVar == null && !this.N && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.y1) - this.x1) / this.u1;
        ab abVar2 = this.w;
        long j3 = abVar2 != null ? (long) ((abVar2.g * abVar2.e) + abVar2.f) : 0L;
        float f12 = f11 * min;
        if (abVar2 == null) {
            j3 = this.h == null ? this.Q : 0L;
        }
        long i7 = (long) Utilities.i((f12 - j3) + this.f, getBaseDuration(), 0.0f);
        ab abVar3 = this.h;
        if (abVar3 != null) {
            float f13 = i7 / abVar3.e;
            if (f13 < abVar3.g || f13 > abVar3.h) {
                return false;
            }
        }
        ab abVar4 = this.w;
        if (abVar4 != null && (i7 < 0 || i7 >= ((long) ((abVar4.h - abVar4.g) * abVar4.e)))) {
            return false;
        }
        if (this.N && abVar3 == null && arrayList.isEmpty()) {
            float f14 = i7 / this.R;
            if (f14 < this.S || f14 > this.T) {
                return false;
            }
        }
        this.e = i7;
        invalidate();
        za zaVar = this.a;
        if (zaVar != null) {
            zaVar.j(i7, z9);
        }
        bi.r3 r3Var = this.d1;
        if (r3Var != null) {
            org.telegram.messenger.g0.r(r3Var);
            this.d1 = null;
        }
        if (!z9) {
            return true;
        }
        bi.r3 r3Var2 = new bi.r3(this, i7, 9);
        this.d1 = r3Var2;
        org.telegram.messenger.g0.i3(r3Var2, 150L);
        return true;
    }

    public final void n(String str, long j3, long j10, float f10, float f11, float f12, boolean z9) {
        boolean z10;
        long j11;
        boolean z11;
        ab abVar;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        db dbVar = this.M;
        if (dbVar != null) {
            dbVar.b();
            this.M = null;
        }
        long j12 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j3;
            this.I = j10 - ((long) (j3 * f10));
            this.J = f10;
            this.K = f11;
            this.L = f12;
            if (getMeasuredWidth() <= 0 || this.M != null || ((abVar = this.h) != null && abVar.e < 1)) {
                z10 = false;
                j11 = j12;
                z11 = true;
            } else {
                String str2 = this.F;
                int i7 = this.v1;
                int i10 = this.y1;
                int i11 = (i7 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j13 = this.H;
                Long valueOf = j13 > 2 ? Long.valueOf(j13) : null;
                ab abVar2 = this.h;
                j11 = j12;
                z10 = false;
                z11 = true;
                this.M = new db(this, false, str2, i11, L, valueOf, abVar2 != null ? abVar2.e : getMaxScrollDuration(), -1L, -1L, new wa(this, 0));
            }
            if (this.h == null) {
                this.P = z10;
                this.G = z11;
            }
        } else {
            z10 = false;
            j11 = j12;
            z11 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        this.E = this.F != null ? z11 : z10;
        if (j11 != j3 && this.h == null && this.a0 != null) {
            this.W = z11;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.i(j3 / this.R, 1.0f, 0.0f);
        }
        if (!z9) {
            this.d0.f(this.G, z11);
            this.f0.f(this.P, z11);
            this.c0.f(this.E, z11);
        }
        invalidate();
    }

    public final void o(boolean z9, String str, long j3, float f10) {
        ab abVar = this.h;
        if (TextUtils.equals(abVar == null ? null : abVar.d, str)) {
            return;
        }
        ab abVar2 = this.h;
        if (abVar2 != null) {
            db dbVar = abVar2.c;
            if (dbVar != null) {
                dbVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            ab abVar3 = new ab(this);
            this.h = abVar3;
            abVar3.b = z9;
            abVar3.d = str;
            abVar3.e = j3;
            abVar3.i = f10;
            ab.a(abVar3, false);
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
    public final void onMeasure(int i7, int i10) {
        this.L0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.P0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.y1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.z1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i7);
        this.v1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.w1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.x1 = L4;
        this.u1 = (this.v1 - (L4 * 2)) - (this.y1 * 2);
        ab abVar = this.h;
        if (abVar != null && abVar.d != null && abVar.c == null) {
            ab.a(abVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ab abVar2 = (ab) obj;
                if (abVar2.d != null && abVar2.c == null) {
                    ab.a(abVar2, false);
                    ab.b(abVar2);
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
        boolean z9;
        bi.r3 r3Var;
        boolean z10;
        VelocityTracker velocityTracker;
        za zaVar;
        VelocityTracker velocityTracker2;
        long j3;
        boolean z11;
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
        float v;
        float e11;
        boolean z12;
        float v10;
        boolean z13;
        za zaVar2;
        int i7;
        float f11;
        float f12;
        boolean z14;
        float f13;
        float i10;
        za zaVar3;
        za zaVar4;
        int i11;
        float f14;
        float f15;
        ab abVar = this.h;
        ArrayList arrayList = this.s;
        if (abVar != null || !arrayList.isEmpty() || this.N || this.E) {
            float timelineHeight = this.w1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                wk0 wk0Var = this.W0;
                bi.u0 u0Var = this.Y0;
                if (action == 0) {
                    bi.r3 r3Var2 = this.d1;
                    if (r3Var2 != null) {
                        org.telegram.messenger.g0.r(r3Var2);
                        this.d1 = null;
                    }
                    wk0Var.a();
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
                    float f16 = 2.0f;
                    if (this.j1 != -1 || this.h == null) {
                        f14 = 4.0f;
                    } else {
                        float f17 = i12;
                        if (motionEvent.getY() < f17) {
                            f14 = 4.0f;
                            if (motionEvent.getY() > (f17 - getVideoHeight()) - org.telegram.messenger.g0.L(2.0f)) {
                                this.j1 = 0;
                            }
                        } else {
                            f14 = 4.0f;
                        }
                        i12 = (int) (f17 - (getVideoHeight() + org.telegram.messenger.g0.L(f14)));
                    }
                    if (this.j1 == -1 && !arrayList.isEmpty()) {
                        int i13 = 0;
                        while (i13 < arrayList.size()) {
                            f15 = f16;
                            float W1 = org.telegram.messenger.g0.W1(((ab) arrayList.get(i13)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
                            float f18 = i12;
                            if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - W1) - org.telegram.messenger.g0.L(f15)) {
                                this.j1 = 3;
                                this.k1 = i13;
                                break;
                            }
                            i12 = (int) (f18 - (W1 + org.telegram.messenger.g0.L(f14)));
                            i13++;
                            f16 = f15;
                        }
                    }
                    f15 = f16;
                    if (this.j1 == -1 && this.E) {
                        float f19 = i12;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getRoundHeight()) - org.telegram.messenger.g0.L(f15)) {
                            this.j1 = 1;
                        }
                        i12 = (int) (f19 - (getRoundHeight() + org.telegram.messenger.g0.L(f14)));
                    }
                    if (this.j1 == -1 && this.N) {
                        float f20 = i12;
                        if (motionEvent.getY() < f20 && motionEvent.getY() > (f20 - getAudioHeight()) - org.telegram.messenger.g0.L(f15)) {
                            this.j1 = 2;
                        }
                        getAudioHeight();
                        org.telegram.messenger.g0.L(f14);
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
                        org.telegram.messenger.g0.r(u0Var);
                        org.telegram.messenger.g0.i3(u0Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.g1;
                    if (this.j0 && (this.m1 || Math.abs(x10) > org.telegram.messenger.g0.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        ab abVar2 = this.h;
                        if (abVar2 != null && this.h1 == 1) {
                            this.f = (long) Utilities.i(this.f - ((x10 / this.u1) * min), abVar2.e - min, 0.0f);
                            invalidate();
                            if (!this.m1) {
                                this.n1 = 1.0f;
                            }
                            this.m1 = true;
                            this.l1 = false;
                        } else if (abVar2 == null || !((i11 = this.h1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.h1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f21 = (min / this.R) * (x10 / this.u1);
                                if (i15 == 6) {
                                    float g10 = this.T - (g() / this.R);
                                    float max = Math.max(0L, this.f - this.Q);
                                    float f22 = this.R;
                                    float f23 = max / f22;
                                    ab abVar3 = this.h;
                                    if (abVar3 != null) {
                                        v = Math.max(f23, (((abVar3.g * abVar3.e) + this.f) - this.Q) / f22);
                                    } else {
                                        ab abVar4 = this.w;
                                        if (abVar4 != null) {
                                            v = Math.max(f23, (((abVar4.g * abVar4.e) + this.f) - this.Q) / f22);
                                        } else if (this.E) {
                                            v = Math.max(f23, (((this.J * this.H) + this.f) - this.Q) / f22);
                                        } else {
                                            v = org.telegram.ui.Cells.f1.v(f(), this.R, this.T, f23);
                                            if (!this.o1 && f21 < 0.0f && this.S <= this.T - (f() / this.R)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f24 = this.S;
                                    float i16 = Utilities.i(f24 + f21, g10, v);
                                    this.S = i16;
                                    if (Math.abs(f24 - i16) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    za zaVar5 = this.a;
                                    if (zaVar5 != null) {
                                        zaVar5.e0(this.Q + ((long) (this.S * this.R)));
                                    }
                                    za zaVar6 = this.a;
                                    if (zaVar6 != null) {
                                        zaVar6.Q(this.S);
                                    }
                                } else if (i15 == 7) {
                                    float min2 = Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min) / this.R);
                                    float f25 = this.S;
                                    float g11 = g();
                                    float f26 = this.R;
                                    float f27 = (g11 / f26) + f25;
                                    ab abVar5 = this.h;
                                    if (abVar5 != null) {
                                        e10 = Math.min(min2, (((abVar5.h * abVar5.e) + this.f) - this.Q) / f26);
                                    } else {
                                        ab abVar6 = this.w;
                                        if (abVar6 != null) {
                                            e10 = Math.min(min2, (((abVar6.h * abVar6.e) + this.f) - this.Q) / f26);
                                        } else if (this.E) {
                                            e10 = Math.min(min2, (((this.K * this.H) + this.f) - this.Q) / f26);
                                        } else {
                                            e10 = org.telegram.ui.Cells.f1.e(f(), this.R, this.S, min2);
                                            if (!this.o1 && f21 > 0.0f) {
                                                if (this.T >= (f() / this.R) + this.S) {
                                                    this.h1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f28 = this.T;
                                    float i17 = Utilities.i(f28 + f21, e10, f27);
                                    this.T = i17;
                                    if (Math.abs(f28 - i17) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    za zaVar7 = this.a;
                                    if (zaVar7 != null) {
                                        zaVar7.O(this.T);
                                    }
                                }
                                if (this.h1 == 8) {
                                    float min3 = f21 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min) / this.R) - this.T), f21) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.Q) / this.R) - this.S), f21);
                                    float f29 = this.S + min3;
                                    this.S = f29;
                                    this.T += min3;
                                    za zaVar8 = this.a;
                                    if (zaVar8 != null) {
                                        zaVar8.Q(f29);
                                        this.a.e0(this.Q + ((long) (this.S * this.R)));
                                        this.a.O(this.T);
                                    }
                                    za zaVar9 = this.a;
                                    if (zaVar9 != null) {
                                        zaVar9.x(true);
                                    }
                                }
                                if (this.h == null && !this.E) {
                                    this.e = (long) (this.S * this.R);
                                    za zaVar10 = this.a;
                                    if (zaVar10 != null) {
                                        zaVar10.x(true);
                                        this.a.j(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.m1) {
                                    this.n1 = 1.0f;
                                }
                                this.m1 = true;
                                this.l1 = false;
                            } else if (i15 == 10 || i15 == 11 || i15 == 12) {
                                float f30 = (min / this.H) * (x10 / this.u1);
                                if (i15 == 10) {
                                    float g12 = this.K - (g() / this.H);
                                    float max2 = Math.max(0L, this.f - this.I);
                                    float f31 = this.H;
                                    float f32 = max2 / f31;
                                    ab abVar7 = this.h;
                                    if (abVar7 != null) {
                                        v10 = Math.max(f32, (((abVar7.g * abVar7.e) + this.f) - this.I) / f31);
                                    } else {
                                        ab abVar8 = this.w;
                                        if (abVar8 != null) {
                                            v10 = Math.max(f32, (((abVar8.g * abVar8.e) + this.f) - this.I) / f31);
                                        } else {
                                            v10 = org.telegram.ui.Cells.f1.v(f(), this.H, this.K, f32);
                                            if (!this.o1 && f30 < 0.0f && this.J <= this.K - (f() / this.H)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f33 = this.J;
                                    float i18 = Utilities.i(f33 + f30, g12, v10);
                                    this.J = i18;
                                    if (Math.abs(f33 - i18) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    za zaVar11 = this.a;
                                    if (zaVar11 != null) {
                                        zaVar11.J(this.I + ((long) (this.J * this.H)));
                                    }
                                    za zaVar12 = this.a;
                                    if (zaVar12 != null) {
                                        zaVar12.u(this.J);
                                    }
                                } else if (i15 == 11) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.I) + min) / this.H);
                                    float f34 = this.J;
                                    float g13 = g();
                                    float f35 = this.H;
                                    float f36 = (g13 / f35) + f34;
                                    ab abVar9 = this.h;
                                    if (abVar9 != null) {
                                        min4 = Math.min(min4, (((abVar9.h * abVar9.e) + this.f) - this.I) / f35);
                                    }
                                    ab abVar10 = this.w;
                                    if (abVar10 != null) {
                                        e11 = Math.min(min4, (((abVar10.h * abVar10.e) + this.f) - this.I) / this.H);
                                    } else {
                                        e11 = org.telegram.ui.Cells.f1.e(f(), this.H, this.J, min4);
                                        if (!this.o1 && f30 > 0.0f) {
                                            if (this.K >= (f() / this.H) + this.J) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f37 = this.K;
                                    float i19 = Utilities.i(f37 + f30, e11, f36);
                                    this.K = i19;
                                    if (Math.abs(f37 - i19) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    za zaVar13 = this.a;
                                    if (zaVar13 != null) {
                                        zaVar13.a0(this.K);
                                    }
                                }
                                if (this.h1 == 12) {
                                    float min5 = f30 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.I) + min) / this.H) - this.K, f30) : Math.max((Math.max(0L, this.f - this.I) / this.H) - this.J, f30);
                                    float f38 = this.J + min5;
                                    this.J = f38;
                                    this.K += min5;
                                    za zaVar14 = this.a;
                                    if (zaVar14 != null) {
                                        zaVar14.u(f38);
                                        this.a.J(this.I + ((long) (this.J * this.H)));
                                        this.a.a0(this.K);
                                    }
                                    za zaVar15 = this.a;
                                    if (zaVar15 != null) {
                                        zaVar15.x(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.J * this.H);
                                    za zaVar16 = this.a;
                                    if (zaVar16 != null) {
                                        zaVar16.x(true);
                                        z12 = false;
                                        this.a.j(this.e, false);
                                        invalidate();
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = z12;
                                    }
                                }
                                z12 = false;
                                invalidate();
                                if (!this.m1) {
                                }
                                this.m1 = true;
                                this.l1 = z12;
                            } else {
                                int i20 = this.i1;
                                if (i20 < 0 || i20 >= arrayList.size() || !((i7 = this.h1) == 13 || i7 == 14 || i7 == 15)) {
                                    int i21 = this.h1;
                                    if (i21 == 5) {
                                        h((x10 / this.u1) * min);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else if (i21 == 9) {
                                        j((x10 / this.u1) * min);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else {
                                        int i22 = this.i1;
                                        if (i22 >= 0 && i22 < arrayList.size() && this.h1 == 16) {
                                            i((ab) arrayList.get(this.i1), (x10 / this.u1) * min);
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = true;
                                            this.l1 = false;
                                        } else if (this.l1) {
                                            m(currentTimeMillis - this.e1 < 350, motionEvent.getX());
                                            if (this.m1 || (zaVar2 = this.a) == null) {
                                                z13 = true;
                                            } else {
                                                z13 = true;
                                                zaVar2.x(true);
                                            }
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z13;
                                        }
                                    }
                                } else {
                                    ab abVar11 = (ab) arrayList.get(this.i1);
                                    float f39 = (min / abVar11.e) * (x10 / this.u1);
                                    int i23 = this.h1;
                                    if (i23 == 13) {
                                        float g14 = abVar11.h - (g() / abVar11.e);
                                        float max3 = Math.max(0L, this.f - abVar11.f) / abVar11.e;
                                        if (abVar11 == this.w) {
                                            f11 = f39;
                                            max3 = org.telegram.ui.Cells.f1.v(f(), abVar11.e, abVar11.h, max3);
                                            if (!this.o1 && f11 < 0.0f) {
                                                f12 = 0.0f;
                                                if (abVar11.g <= abVar11.h - (f() / abVar11.e)) {
                                                    this.h1 = 15;
                                                }
                                                f13 = abVar11.g;
                                                i10 = Utilities.i(f13 + f11, g14, max3);
                                                abVar11.g = i10;
                                                if (Math.abs(f13 - i10) > 0.01f) {
                                                    this.o1 = true;
                                                }
                                                zaVar3 = this.a;
                                                if (zaVar3 != null) {
                                                    zaVar3.b0(abVar11.a, abVar11.f);
                                                }
                                                zaVar4 = this.a;
                                                if (zaVar4 != null) {
                                                    zaVar4.N(abVar11.g, abVar11.a);
                                                }
                                            }
                                        } else {
                                            f11 = f39;
                                        }
                                        f12 = 0.0f;
                                        f13 = abVar11.g;
                                        i10 = Utilities.i(f13 + f11, g14, max3);
                                        abVar11.g = i10;
                                        if (Math.abs(f13 - i10) > 0.01f) {
                                        }
                                        zaVar3 = this.a;
                                        if (zaVar3 != null) {
                                        }
                                        zaVar4 = this.a;
                                        if (zaVar4 != null) {
                                        }
                                    } else {
                                        f11 = f39;
                                        f12 = 0.0f;
                                        if (i23 == 14) {
                                            float min6 = Math.min(1.0f, Math.max(0L, (this.f - abVar11.f) + min) / abVar11.e);
                                            float g15 = (g() / abVar11.e) + abVar11.g;
                                            if (abVar11 == this.w) {
                                                min6 = org.telegram.ui.Cells.f1.e(f(), abVar11.e, abVar11.g, min6);
                                                if (!this.o1 && f11 > 0.0f) {
                                                    if (abVar11.h >= (f() / abVar11.e) + abVar11.g) {
                                                        this.h1 = 15;
                                                    }
                                                }
                                            }
                                            float f40 = abVar11.h;
                                            float i24 = Utilities.i(f40 + f11, min6, g15);
                                            abVar11.h = i24;
                                            if (Math.abs(f40 - i24) > 0.01f) {
                                                this.o1 = true;
                                            }
                                            za zaVar17 = this.a;
                                            if (zaVar17 != null) {
                                                zaVar17.S(abVar11.h, abVar11.a);
                                            }
                                        }
                                    }
                                    if (this.h1 == 15) {
                                        float min7 = f11 > f12 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - abVar11.f) + min) / abVar11.e) - abVar11.h, f11) : Math.max((Math.max(0L, this.f - abVar11.f) / abVar11.e) - abVar11.g, f11);
                                        float f41 = abVar11.g + min7;
                                        abVar11.g = f41;
                                        abVar11.h += min7;
                                        za zaVar18 = this.a;
                                        if (zaVar18 != null) {
                                            zaVar18.N(f41, abVar11.a);
                                            this.a.b0(abVar11.a, abVar11.f);
                                            this.a.S(abVar11.h, abVar11.a);
                                        }
                                        za zaVar19 = this.a;
                                        if (zaVar19 != null) {
                                            z14 = true;
                                            zaVar19.x(true);
                                            invalidate();
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z14;
                                            this.l1 = false;
                                        }
                                    }
                                    z14 = true;
                                    invalidate();
                                    if (!this.m1) {
                                    }
                                    this.m1 = z14;
                                    this.l1 = false;
                                }
                            }
                        } else {
                            float f42 = abVar2.e;
                            float f43 = (min / f42) * (x10 / this.u1);
                            if (i11 == 2) {
                                abVar2.g = Utilities.i(abVar2.g + f43, abVar2.h - (1000.0f / f42), 0.0f);
                                za zaVar20 = this.a;
                                if (zaVar20 != null) {
                                    zaVar20.t(false, this.h.g);
                                }
                                ab abVar12 = this.h;
                                float f44 = abVar12.h - abVar12.g;
                                float f45 = f();
                                ab abVar13 = this.h;
                                if (f44 > f45 / abVar13.e) {
                                    abVar13.h = org.telegram.ui.Cells.f1.e(f(), this.h.e, abVar13.g, 1.0f);
                                    za zaVar21 = this.a;
                                    if (zaVar21 != null) {
                                        zaVar21.T(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                abVar2.h = Utilities.i(abVar2.h + f43, 1.0f, (1000.0f / f42) + abVar2.g);
                                za zaVar22 = this.a;
                                if (zaVar22 != null) {
                                    zaVar22.T(this.h.h);
                                }
                                ab abVar14 = this.h;
                                float f46 = abVar14.h - abVar14.g;
                                float f47 = f();
                                ab abVar15 = this.h;
                                if (f46 > f47 / abVar15.e) {
                                    abVar15.g = org.telegram.ui.Cells.f1.v(f(), this.h.e, abVar15.h, 0.0f);
                                    za zaVar23 = this.a;
                                    if (zaVar23 != null) {
                                        zaVar23.t(false, this.h.g);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min8 = f43 > 0.0f ? Math.min(1.0f - abVar2.h, f43) : Math.max(-abVar2.g, f43);
                                ab abVar16 = this.h;
                                float f48 = abVar16.g + min8;
                                abVar16.g = f48;
                                abVar16.h += min8;
                                za zaVar24 = this.a;
                                if (zaVar24 != null) {
                                    zaVar24.t(false, f48);
                                    this.a.T(this.h.h);
                                }
                            }
                            float f49 = this.e;
                            ab abVar17 = this.h;
                            float f50 = abVar17.e;
                            float f51 = f49 / f50;
                            float f52 = abVar17.g;
                            if (f51 < f52 || f51 > abVar17.h) {
                                long j15 = (long) (f52 * f50);
                                this.e = j15;
                                za zaVar25 = this.a;
                                if (zaVar25 != null) {
                                    zaVar25.j(j15, false);
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
                        org.telegram.messenger.g0.r(u0Var);
                    }
                    int i25 = this.h1;
                    if ((i25 == 1 || i25 == 5 || i25 == 8) && (velocityTracker6 = this.p1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(u0Var);
                    wk0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.f1 > ViewConfiguration.getTapTimeout() || this.m1) && this.j0) {
                            int i26 = this.h1;
                            if (i26 == 16 && (velocityTracker5 = this.p1) != null) {
                                velocityTracker5.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity) > org.telegram.messenger.g0.L(100.0f)) {
                                    long min9 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i27 = this.y1;
                                    float f53 = i27;
                                    float f54 = min9;
                                    float f55 = this.u1;
                                    int i28 = (int) (((this.f / f54) * f55) + f53);
                                    int c10 = (int) com.google.android.recaptcha.internal.a.c(this.h.e - min9, f54, f55, f53);
                                    this.r1 = true;
                                    this.s1 = i28;
                                    this.W0.c(i28, 0, -xVelocity, 0, i27, c10, 0, 0);
                                    z9 = false;
                                }
                            } else if (i26 == 1 && (velocityTracker4 = this.p1) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > org.telegram.messenger.g0.L(100.0f)) {
                                    long min10 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i29 = this.y1;
                                    float f56 = i29;
                                    float f57 = min10;
                                    float f58 = this.u1;
                                    int i30 = (int) (((this.f / f57) * f58) + f56);
                                    int c11 = (int) com.google.android.recaptcha.internal.a.c(this.h.e - min10, f57, f58, f56);
                                    this.r1 = true;
                                    this.s1 = i30;
                                    this.W0.c(i30, 0, -xVelocity2, 0, i29, c11, 0, 0);
                                    z9 = false;
                                }
                            } else if ((i26 == 5 || (i26 == 8 && !this.m1)) && this.P && (velocityTracker2 = this.p1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.p1.getXVelocity();
                                this.q1 = false;
                                if (Math.abs(xVelocity3) > org.telegram.messenger.g0.L(100.0f)) {
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i31 = (int) (((this.Q / min11) * this.u1) + this.y1 + this.x1);
                                    ab abVar18 = this.h;
                                    if (abVar18 != null) {
                                        float f59 = abVar18.h;
                                        float f60 = abVar18.e;
                                        j11 = this.R;
                                        j12 = (long) ((f59 * f60) - 0);
                                        f10 = abVar18.g * f60;
                                    } else if (this.E) {
                                        float f61 = this.K;
                                        float f62 = this.H;
                                        j11 = this.R;
                                        j12 = (long) ((f61 * f62) - 0);
                                        f10 = this.J * f62;
                                    } else {
                                        j3 = -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z11 = true;
                                        j10 = 0;
                                        this.r1 = z11;
                                        this.s1 = i31;
                                        float f63 = this.y1 + this.x1;
                                        float f64 = this.u1;
                                        this.W0.c(i31, 0, xVelocity3, 0, (int) (((j3 / min11) * f64) + f63), (int) com.google.android.recaptcha.internal.a.c(j10, min11, f64, f63), 0, 0);
                                        z9 = false;
                                    }
                                    j3 = (long) (f10 - j11);
                                    j10 = j12;
                                    z11 = true;
                                    this.r1 = z11;
                                    this.s1 = i31;
                                    float f632 = this.y1 + this.x1;
                                    float f642 = this.u1;
                                    this.W0.c(i31, 0, xVelocity3, 0, (int) (((j3 / min11) * f642) + f632), (int) com.google.android.recaptcha.internal.a.c(j10, min11, f642, f632), 0, 0);
                                    z9 = false;
                                }
                            } else if ((i26 == 9 || (i26 == 12 && !this.m1)) && this.G && (velocityTracker3 = this.p1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.p1.getXVelocity();
                                this.q1 = false;
                                if (Math.abs(xVelocity4) > org.telegram.messenger.g0.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i32 = (int) (((this.I / min12) * this.u1) + this.y1 + this.x1);
                                    ab abVar19 = this.h;
                                    if (abVar19 != null) {
                                        float f65 = abVar19.h;
                                        float f66 = abVar19.e;
                                        j13 = (long) ((abVar19.g * f66) - this.H);
                                        j14 = (long) ((f65 * f66) - 0);
                                    } else {
                                        j13 = -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j14 = 0;
                                    }
                                    this.r1 = true;
                                    this.s1 = i32;
                                    float f67 = this.y1 + this.x1;
                                    float f68 = this.u1;
                                    this.W0.c(i32, 0, xVelocity4, 0, (int) (((j13 / min12) * f68) + f67), (int) com.google.android.recaptcha.internal.a.c(j14, min12, f68, f67), 0, 0);
                                    z9 = false;
                                }
                            }
                            r3Var = this.d1;
                            if (r3Var != null) {
                                org.telegram.messenger.g0.r(r3Var);
                                this.d1 = null;
                            }
                            if (this.m1 || !z9 || (zaVar = this.a) == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                                zaVar.x(false);
                            }
                            this.n1 = 1.0f;
                            this.m1 = z10;
                            this.l1 = z10;
                            this.f1 = -1L;
                            this.h1 = -1;
                            velocityTracker = this.p1;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.p1 = null;
                            }
                        } else if (this.j0) {
                            if (!this.X0 || this.h == null) {
                                int i33 = this.j1;
                                if (i33 == 3) {
                                    int i34 = (this.P || this.G) ? -1 : this.n;
                                    int i35 = this.k1;
                                    if (i34 != i35) {
                                        this.P = false;
                                        this.G = false;
                                        this.n = i35;
                                        if (this.a != null && i35 >= 0 && i35 < arrayList.size()) {
                                            this.a.e(((ab) arrayList.get(this.k1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i33 == 2 && !this.P) {
                                    this.P = true;
                                    this.G = false;
                                    za zaVar26 = this.a;
                                    if (zaVar26 != null) {
                                        zaVar26.K(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 && !this.G) {
                                    this.P = false;
                                    this.G = true;
                                    za zaVar27 = this.a;
                                    if (zaVar27 != null) {
                                        zaVar27.K(true);
                                    }
                                    invalidate();
                                } else if (i33 != 2 && this.P) {
                                    this.P = false;
                                    this.G = false;
                                    za zaVar28 = this.a;
                                    if (zaVar28 != null) {
                                        zaVar28.K(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 || !this.G) {
                                    long j16 = this.e;
                                    if (m(false, motionEvent.getX()) && Math.abs(this.e - j16) > 400) {
                                        this.c1 = j16;
                                        this.b1.e(true, 1.0f);
                                        invalidate();
                                    }
                                } else {
                                    this.P = false;
                                    this.G = false;
                                    za zaVar29 = this.a;
                                    if (zaVar29 != null) {
                                        zaVar29.K(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i36 = (long) Utilities.i(((((motionEvent.getX() - this.y1) - this.x1) / this.u1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                ab abVar20 = this.h;
                                float f69 = abVar20.h - abVar20.g;
                                abVar20.g = (1.0f - f69) * (i36 / getBaseDuration());
                                ab abVar21 = this.h;
                                float f70 = abVar21.g;
                                abVar21.h = f69 + f70;
                                za zaVar30 = this.a;
                                if (zaVar30 != null) {
                                    zaVar30.t(true, f70);
                                    this.a.T(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.j1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z9 = true;
                    r3Var = this.d1;
                    if (r3Var != null) {
                    }
                    if (this.m1) {
                    }
                    z10 = false;
                    this.n1 = 1.0f;
                    this.m1 = z10;
                    this.l1 = z10;
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
                this.a0 = new ya(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.g0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        a3.c cVar = new a3.c(27);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, cVar);
        ab abVar = arrayList.isEmpty() ? null : (ab) arrayList.get(0);
        this.w = abVar;
        if (abVar != null) {
            long j3 = abVar.f;
        }
    }

    public void setCollage(ArrayList<e7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        db dbVar;
        int i7 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ab abVar = (ab) arrayList2.get(i7);
            if (abVar != null && (dbVar = abVar.c) != null) {
                dbVar.b();
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
            ya yaVar = (ya) arrayList3.get(i10);
            if (yaVar != null) {
                yaVar.a();
            }
            i10++;
        }
        arrayList3.clear();
        this.h0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                e7 e7Var = arrayList.get(i11);
                if (e7Var.K) {
                    ab abVar2 = new ab(this);
                    abVar2.a = i11;
                    abVar2.b = false;
                    abVar2.d = e7Var.L.getAbsolutePath();
                    abVar2.e = e7Var.h0;
                    abVar2.f = e7Var.X;
                    abVar2.i = e7Var.P;
                    abVar2.g = e7Var.V;
                    abVar2.h = e7Var.W;
                    ab.a(abVar2, false);
                    ab.b(abVar2);
                    arrayList2.add(abVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(za zaVar) {
        this.a = zaVar;
    }

    public void setMaxCount(int i7) {
        this.b0 = i7;
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
        r11.b1.e(true, 1.0f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j3) {
        ab abVar = this.h;
        if (abVar != null) {
            if (j3 < this.e) {
                float f10 = j3;
                long j10 = abVar.e;
                if (f10 <= (j10 * abVar.g) + 240.0f) {
                }
            }
        }
        if (this.N && !this.E && abVar == null) {
            if (j3 < this.e) {
                float f11 = j3;
                long j11 = this.R;
                if (f11 <= (j11 * this.S) + 240.0f) {
                }
            }
        }
        if (this.E && abVar == null) {
            if (j3 < this.e) {
                float f12 = j3;
                long j12 = this.H;
                if (f12 <= (j12 * this.S) + 240.0f) {
                }
            }
        }
        this.e = j3;
        invalidate();
    }

    public void setRoundNull(boolean z9) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z9);
    }

    public void setVideoLeft(float f10) {
        ab abVar = this.h;
        if (abVar == null) {
            return;
        }
        abVar.g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ab abVar = this.h;
        if (abVar == null) {
            return;
        }
        abVar.h = f10;
        invalidate();
    }
}
