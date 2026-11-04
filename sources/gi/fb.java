package gi;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fb extends View {
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
    public final eb J0;
    public float K;
    public final Paint K0;
    public float L;
    public final Drawable L0;
    public float M;
    public final TextPaint M0;
    public db N;
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
    public final al0 X0;
    public boolean Y0;
    public final ai.t6 Z0;
    public za a;
    public boolean a0;
    public long a1;
    public Runnable b;
    public ya b0;
    public long b1;
    public int c;
    public int c0;
    public final org.telegram.ui.Components.u5 c1;
    public Runnable d;
    public final org.telegram.ui.Components.u5 d0;
    public long d1;
    public long e;
    public final org.telegram.ui.Components.u5 e0;
    public ci.e3 e1;
    public long f;
    public final org.telegram.ui.Components.u5 f0;
    public long f1;
    public final org.telegram.ui.Components.u5 g0;
    public long g1;
    public ab h;
    public final org.telegram.ui.Components.u5 h0;
    public float h1;
    public final org.telegram.ui.Components.u5 i0;
    public int i1;
    public final org.telegram.ui.Components.u5 j0;
    public int j1;
    public boolean k0;
    public int k1;
    public final org.telegram.ui.Components.x9 l0;
    public int l1;
    public final org.telegram.ui.Components.ba m0;
    public boolean m1;
    public int n;
    public final org.telegram.ui.Components.ba n0;
    public boolean n1;
    public final org.telegram.ui.Components.ba o0;
    public float o1;
    public final RectF p0;
    public boolean p1;
    public final Path q0;
    public VelocityTracker q1;
    public final ArrayList r;
    public final ly0 r0;
    public boolean r1;
    public final ArrayList s;
    public final Drawable s0;
    public boolean s1;
    public final eb t0;
    public int t1;
    public final RectF u0;
    public final float[] u1;
    public final Paint v0;
    public int v1;
    public ab w;
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

    public fb(Context context, ViewGroup viewGroup, ha haVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.E = new Path();
        this.c0 = 1;
        xq xqVar = xq.h;
        this.d0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.e0 = new org.telegram.ui.Components.u5(this, 360L, xqVar);
        this.f0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.g0 = new org.telegram.ui.Components.u5(this, 360L, xqVar);
        this.h0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.i0 = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        this.j0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.k0 = true;
        this.p0 = new RectF();
        this.q0 = new Path();
        this.t0 = new eb();
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
        this.J0 = new eb();
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
        this.X0 = new al0(getContext(), null);
        this.a1 = -1L;
        this.b1 = -1L;
        this.c1 = new org.telegram.ui.Components.u5(0.0f, this, 0L, 340L, xqVar);
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
        this.r0 = new ly0(bd.M0(2131744466, null), 12.0f, org.telegram.messenger.g0.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.s0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.L0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.l0 = x9Var;
        this.m0 = new org.telegram.ui.Components.ba(x9Var, this, 0, false);
        this.n0 = new org.telegram.ui.Components.ba(x9Var, this, 3, false);
        this.o0 = new org.telegram.ui.Components.ba(x9Var, this, 4, false);
        this.Z0 = new ai.t6(this, viewGroup, e6Var, x9Var, haVar, 14);
    }

    public static void a(final fb fbVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var, View view) {
        int i3;
        ArrayList arrayList = fbVar.s;
        int i10 = fbVar.k1;
        final int i11 = 0;
        final int i12 = 2;
        try {
            if (i10 == 2 && fbVar.O) {
                z6 z6Var = new z6(fbVar.getContext(), 0);
                z6Var.b = 0.0f;
                z6Var.c = 1.5f;
                z6Var.d(fbVar.W);
                z6Var.h = new u10(fbVar) { // from class: gi.xa
                    public final /* synthetic */ fb b;

                    {
                        this.b = fbVar;
                    }

                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i11) {
                            case 0:
                                float floatValue = f10.floatValue();
                                fb fbVar2 = this.b;
                                fbVar2.W = floatValue;
                                za zaVar = fbVar2.a;
                                if (zaVar != null) {
                                    zaVar.j(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                fb fbVar3 = this.b;
                                fbVar3.M = floatValue2;
                                za zaVar2 = fbVar3.a;
                                if (zaVar2 != null) {
                                    zaVar2.i(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                fb fbVar4 = this.b;
                                fbVar4.h.i = f10.floatValue();
                                za zaVar3 = fbVar4.a;
                                if (zaVar3 != null) {
                                    zaVar3.I(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                int i13 = fbVar.w1;
                int i14 = fbVar.z1;
                int i15 = fbVar.y1;
                float min2 = Math.min((i13 - i14) - i15, ((((org.telegram.messenger.g0.T1(fbVar.U, 1.0f, fbVar.g0.c) * fbVar.S) + (fbVar.R - fbVar.f)) / min) * fbVar.v1) + i14 + i15);
                f60 F = f60.F(viewGroup, e6Var, fbVar);
                F.q(z6Var);
                F.o();
                F.c(R.drawable.msg_delete, bd.M0(2131744730, null), new wa(fbVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(fbVar.w1 - min2)) + org.telegram.messenger.g0.L(18.0f), fbVar.G0.top);
                F.Z();
                F.R(x9Var, -view.getX(), -view.getY());
                fbVar.performHapticFeedback(0, 1);
            } else {
                final int i16 = 1;
                if (i10 == 1 && fbVar.F) {
                    z6 z6Var2 = new z6(fbVar.getContext(), 0);
                    z6Var2.b = 0.0f;
                    z6Var2.c = 1.5f;
                    z6Var2.d(fbVar.M);
                    z6Var2.h = new u10(fbVar) { // from class: gi.xa
                        public final /* synthetic */ fb b;

                        {
                            this.b = fbVar;
                        }

                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj) {
                            Float f10 = (Float) obj;
                            switch (i16) {
                                case 0:
                                    float floatValue = f10.floatValue();
                                    fb fbVar2 = this.b;
                                    fbVar2.W = floatValue;
                                    za zaVar = fbVar2.a;
                                    if (zaVar != null) {
                                        zaVar.j(f10.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f10.floatValue();
                                    fb fbVar3 = this.b;
                                    fbVar3.M = floatValue2;
                                    za zaVar2 = fbVar3.a;
                                    if (zaVar2 != null) {
                                        zaVar2.i(f10.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    fb fbVar4 = this.b;
                                    fbVar4.h.i = f10.floatValue();
                                    za zaVar3 = fbVar4.a;
                                    if (zaVar3 != null) {
                                        zaVar3.I(f10.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    long min3 = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
                    int i17 = fbVar.w1;
                    int i18 = fbVar.z1;
                    int i19 = fbVar.y1;
                    float min4 = Math.min((i17 - i18) - i19, ((((org.telegram.messenger.g0.T1(fbVar.L, 1.0f, fbVar.e0.c) * fbVar.I) + (fbVar.J - fbVar.f)) / min3) * fbVar.v1) + i18 + i19);
                    f60 F2 = f60.F(viewGroup, e6Var, fbVar);
                    F2.q(z6Var2);
                    F2.o();
                    F2.c(R.drawable.msg_delete, bd.M0(2131744497, null), new wa(fbVar, 2), false);
                    F2.V(5);
                    F2.U = true;
                    F2.a0((-(fbVar.w1 - min4)) + org.telegram.messenger.g0.L(18.0f), fbVar.y0.top);
                    F2.Z();
                    F2.R(x9Var, -view.getX(), -view.getY());
                    fbVar.performHapticFeedback(0, 1);
                } else if (i10 == 0 && fbVar.h != null) {
                    z6 z6Var3 = new z6(fbVar.getContext(), 0);
                    z6Var3.b = 0.0f;
                    z6Var3.c = 1.5f;
                    z6Var3.d(fbVar.h.i);
                    z6Var3.h = new u10(fbVar) { // from class: gi.xa
                        public final /* synthetic */ fb b;

                        {
                            this.b = fbVar;
                        }

                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj) {
                            Float f10 = (Float) obj;
                            switch (i12) {
                                case 0:
                                    float floatValue = f10.floatValue();
                                    fb fbVar2 = this.b;
                                    fbVar2.W = floatValue;
                                    za zaVar = fbVar2.a;
                                    if (zaVar != null) {
                                        zaVar.j(f10.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f10.floatValue();
                                    fb fbVar3 = this.b;
                                    fbVar3.M = floatValue2;
                                    za zaVar2 = fbVar3.a;
                                    if (zaVar2 != null) {
                                        zaVar2.i(f10.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    fb fbVar4 = this.b;
                                    fbVar4.h.i = f10.floatValue();
                                    za zaVar3 = fbVar4.a;
                                    if (zaVar3 != null) {
                                        zaVar3.I(f10.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    f60 F3 = f60.F(viewGroup, e6Var, fbVar);
                    F3.q(z6Var3);
                    F3.V(5);
                    F3.U = true;
                    F3.a0(org.telegram.messenger.g0.L(18.0f), fbVar.u0.top);
                    F3.Z();
                    F3.R(x9Var, -view.getX(), -view.getY());
                    fbVar.performHapticFeedback(0, 1);
                } else {
                    if (i10 != 3 || (i3 = fbVar.l1) < 0 || i3 >= arrayList.size()) {
                        return;
                    }
                    ab abVar = (ab) arrayList.get(fbVar.l1);
                    z6 z6Var4 = new z6(fbVar.getContext(), 0);
                    z6Var4.b = 0.0f;
                    z6Var4.c = 1.5f;
                    z6Var4.d(abVar.i);
                    z6Var4.h = new ai.o1(19, fbVar, abVar);
                    f60 F4 = f60.F(viewGroup, e6Var, fbVar);
                    F4.q(z6Var4);
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
        return org.telegram.messenger.g0.W1(this.g0.d(this.Q), org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        ab abVar = this.h;
        if (abVar != null) {
            return Math.max(1L, abVar.e);
        }
        ab abVar2 = this.w;
        return abVar2 != null ? Math.max(1L, abVar2.e) : this.F ? Math.max(1L, this.I) : Math.max(1L, this.S);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (f10 > 0.0f) {
                f10 += org.telegram.messenger.g0.L(4.0f);
            }
            f10 += org.telegram.messenger.g0.W1(((ab) arrayList.get(i3)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
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
        int i3;
        ab abVar;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(this.e, getBaseDuration(), 0L);
        ab abVar2 = this.w;
        float f10 = min;
        float f11 = (this.v1 * (((k10 + (abVar2 != null ? (abVar2.g * abVar2.e) + abVar2.f : this.h == null ? this.R : 0L)) - this.f) / f10)) + this.z1 + this.y1;
        if (!this.Y0 && x10 >= f11 - org.telegram.messenger.g0.L(12.0f) && x10 <= f11 + org.telegram.messenger.g0.L(12.0f)) {
            return 0;
        }
        boolean z11 = this.h != null && y9 > (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(2.0f));
        ArrayList arrayList = this.s;
        boolean z12 = !arrayList.isEmpty() && y9 > ((((((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(4.0f))) - getCollageHeight()) - ((float) org.telegram.messenger.g0.L(4.0f))) - ((float) org.telegram.messenger.g0.L(2.0f)) && y9 < (((float) (this.x1 - this.A1)) - getVideoHeight()) - ((float) org.telegram.messenger.g0.L(2.0f));
        if (this.F) {
            if (y9 > (((((((this.x1 - this.A1) - getVideoHeight()) - org.telegram.messenger.g0.L(4.0f)) - getCollageHeight()) - org.telegram.messenger.g0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(2.0f)) {
                if (y9 < ((((this.x1 - this.A1) - getVideoHeight()) - org.telegram.messenger.g0.L(2.0f)) - getCollageHeight()) - org.telegram.messenger.g0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z10 = true;
                    if (z12) {
                        i3 = 1;
                        if (z11) {
                            float f12 = this.z1 + this.y1;
                            ab abVar3 = this.h;
                            float f13 = abVar3.g;
                            float f14 = abVar3.e;
                            float f15 = this.f;
                            float f16 = this.v1;
                            float f17 = ((((f13 * f14) - f15) / f10) * f16) + f12;
                            float f18 = ((((abVar3.h * f14) - f15) / f10) * f16) + f12;
                            if (this.Y0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x10 < f17 - org.telegram.messenger.g0.L(15.0f) || x10 > f18 + org.telegram.messenger.g0.L(15.0f)) {
                                    return i3;
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
                                long j10 = this.J;
                                long j11 = this.f;
                                float f28 = this.v1;
                                float f29 = (((j10 - j11) / f10) * f28) + f27;
                                f26 = a1.g.A((j10 + this.I) - j11, f10, f28, f27);
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
                                long j12 = this.R;
                                long j13 = this.f;
                                float f39 = this.v1;
                                float f40 = (((j12 - j13) / f10) * f39) + f38;
                                f37 = a1.g.A((j12 + this.S) - j13, f10, f39, f38);
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
                            if (rectF.contains(x10, y9)) {
                                float f41 = this.z1 + this.y1;
                                float f42 = abVar5.f;
                                float f43 = this.v1;
                                float f44 = ((f42 / f10) * f43) + f41;
                                float f45 = abVar5.g;
                                float f46 = abVar5.e;
                                float f47 = ((((f45 * f46) + f42) / f10) * f43) + f41;
                                float f48 = ((((abVar5.h * f46) + f42) / f10) * f43) + f41;
                                float A = a1.g.A(r6 + r11, f10, f43, f41);
                                this.j1 = i10;
                                if (x10 >= f47 - org.telegram.messenger.g0.L(15.0f) && x10 <= org.telegram.messenger.g0.L(5.0f) + f47) {
                                    return 13;
                                }
                                if (x10 >= f48 - org.telegram.messenger.g0.L(5.0f) && x10 <= org.telegram.messenger.g0.L(15.0f) + f48) {
                                    return 14;
                                }
                                if (x10 < f47 || x10 > f48 || (abVar5.g <= 0.01f && abVar5.h >= 0.99f)) {
                                    return (x10 < f44 || x10 > A) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i3 = 1;
                    }
                    abVar = this.h;
                    if (abVar != null || abVar.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        abVar = this.h;
        return abVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        al0 al0Var = this.X0;
        if (!al0Var.b()) {
            if (this.s1) {
                this.s1 = false;
                za zaVar = this.a;
                if (zaVar != null) {
                    zaVar.C(false);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = al0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.r1) {
            this.f = (long) Math.max(0.0f, (((i3 - this.z1) - this.y1) / this.v1) * min);
        } else {
            if (!this.Q) {
                al0Var.a();
                return;
            }
            int i10 = this.z1;
            int i11 = this.y1;
            float f10 = this.v1;
            float f11 = min;
            h(((((i3 - i10) - i11) / f10) * f11) - ((((this.t1 - i10) - i11) / f10) * f11));
        }
        invalidate();
        this.t1 = i3;
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        float f13;
        if (this.Y0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(j10, getBaseDuration(), 0L);
        ab abVar = this.w;
        if (abVar != null) {
            f13 = (abVar.g * abVar.e) + abVar.f;
        } else {
            f13 = this.h == null ? this.R : 0L;
        }
        float f14 = (this.v1 * (((k10 + f13) - this.f) / min)) + this.z1 + this.y1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.D0;
        paint.setAlpha((int) (38.0f * f12));
        int i3 = (int) (f12 * 255.0f);
        Paint paint2 = this.E0;
        paint2.setAlpha(i3);
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
        long j10;
        Paint paint;
        ArrayList arrayList;
        float f10;
        org.telegram.ui.Components.ba baVar;
        RectF rectF2;
        int i3;
        long j11;
        int i10;
        ab abVar;
        ab abVar2;
        int i11;
        float f11;
        float max;
        long j12;
        float f12;
        Canvas canvas2;
        boolean z10;
        float f13;
        float f14;
        float f15;
        RectF rectF3;
        ArrayList arrayList2;
        long j13;
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
        float x10;
        float f39;
        RectF rectF4;
        float f40;
        float f41;
        float f42;
        float N;
        float f43;
        float f44;
        float A;
        float f45;
        float f46;
        long j14;
        float f47;
        float f48;
        float f49;
        ArrayList arrayList4;
        int i12;
        boolean z11;
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
        float A2;
        float f53;
        float f54;
        float f55;
        int i16;
        long j15;
        float f56;
        float f57;
        float f58;
        ArrayList arrayList10;
        boolean z12;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z13;
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
        boolean z14;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        org.telegram.ui.Components.ba baVar2;
        char c2;
        boolean z15;
        fb fbVar = this;
        RectF rectF6 = fbVar.u0;
        RectF rectF7 = fbVar.y0;
        Path path2 = fbVar.x0;
        ArrayList arrayList20 = fbVar.r;
        Drawable drawable = fbVar.s0;
        org.telegram.ui.Components.x9 x9Var = fbVar.l0;
        RectF rectF8 = fbVar.G0;
        ArrayList arrayList21 = fbVar.s;
        RectF rectF9 = fbVar.p0;
        org.telegram.ui.Components.ba baVar3 = fbVar.m0;
        Paint c10 = baVar3.c(1.0f);
        float d10 = fbVar.j0.d(fbVar.k0);
        long min = Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration());
        if (d10 < 1.0f) {
            rectF9.set(fbVar.z1, (fbVar.x1 - fbVar.A1) - org.telegram.messenger.g0.L(28.0f), fbVar.w1 - fbVar.z1, fbVar.x1 - fbVar.A1);
            fbVar.q0.rewind();
            fbVar.q0.addRoundRect(rectF9, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - d10) * 255.0f), 31);
            canvas.clipPath(fbVar.q0);
            if (x9Var.c()) {
                baVar3.a(canvas);
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
            if (arrayList20.isEmpty() || !x9Var.c()) {
                paint4 = paint3;
                rectF = rectF6;
                baVar2 = baVar3;
                j10 = min;
                c2 = 31;
                if (!arrayList20.isEmpty()) {
                    Paint c11 = fbVar.o0.c(0.4f);
                    if (c11 == null) {
                        c11 = fbVar.I0;
                        c11.setAlpha(64);
                    }
                    z15 = false;
                    fbVar.t0.a((((fbVar.R - fbVar.f) / j10) * fbVar.v1) + fbVar.z1 + fbVar.y1, rectF9.left, rectF9.right, org.telegram.messenger.g0.L(28.0f), fbVar.i0.e(false, eb.c(arrayList20)), rectF9.bottom, arrayList20);
                    canvas.drawPath(fbVar.t0, c11);
                    float g7 = ((fbVar.r0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - g7);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.Cells.f1.B(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.f1.i(2, centerY, drawable));
                    drawable.setAlpha(hs.V2);
                    drawable.draw(canvas);
                    ly0 ly0Var = fbVar.r0;
                    float centerX2 = (rectF9.centerX() - g7) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
                    float f65 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    baVar = baVar2;
                    f10 = 0.4f;
                    ly0Var.c(centerX2, f65, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float e10 = fbVar.i0.e(false, eb.c(arrayList20));
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j10 = min;
                baVar2 = baVar3;
                fbVar.t0.a((((fbVar.R - fbVar.f) / min) * fbVar.v1) + fbVar.z1 + fbVar.y1, rectF9.left, rectF9.right, org.telegram.messenger.g0.L(28.0f), e10, rectF9.bottom, arrayList20);
                c2 = 31;
                canvas.saveLayerAlpha(rectF9, hs.n1, 31);
                canvas.clipPath(fbVar.t0);
                fbVar.o0.a(canvas);
                canvas.restore();
            }
            z15 = false;
            float g72 = ((fbVar.r0.g() + org.telegram.messenger.g0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - g72);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.Cells.f1.B(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.f1.i(2, centerY2, drawable));
            drawable.setAlpha(hs.V2);
            drawable.draw(canvas);
            ly0 ly0Var2 = fbVar.r0;
            float centerX22 = (rectF9.centerX() - g72) + drawable.getIntrinsicWidth() + org.telegram.messenger.g0.L(3.66f);
            float f652 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            baVar = baVar2;
            f10 = 0.4f;
            ly0Var2.c(centerX22, f652, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c10;
            arrayList = arrayList21;
            f10 = 0.4f;
            baVar = baVar3;
            rectF2 = rectF8;
        }
        if (d10 > 0.0f) {
            if (d10 < 1.0f) {
                f12 = 0.0f;
                j12 = j10;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, fbVar.getWidth(), fbVar.getHeight(), (int) (d10 * 255.0f), 31);
                z10 = true;
            } else {
                j12 = j10;
                f12 = 0.0f;
                canvas2 = canvas;
                z10 = false;
            }
            ab abVar3 = fbVar.h;
            float f66 = abVar3 != null ? 1.0f : f12;
            float d11 = abVar3 != null ? abVar3.k.d((fbVar.Q || fbVar.H) ? false : true) : f12;
            float f67 = fbVar.x1 - fbVar.A1;
            float L = org.telegram.messenger.g0.L(4.0f);
            if (fbVar.h != null) {
                canvas2.save();
                float videoHeight = fbVar.getVideoHeight();
                ab abVar4 = fbVar.h;
                float f68 = abVar4.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j16 = abVar4.e;
                float f69 = j16;
                float v = com.google.android.recaptcha.internal.a.v(f68, f69, d11, f12);
                float v10 = com.google.android.recaptcha.internal.a.v(abVar4.h, f69, d11, f12);
                if (j16 <= 0) {
                    f13 = d11;
                    f15 = f12;
                    f60 = f66;
                    j13 = j12;
                    f17 = L;
                    f61 = f15;
                } else {
                    f15 = f12;
                    f13 = d11;
                    f60 = f66;
                    j13 = j12;
                    f17 = L;
                    f61 = (fbVar.z1 + fbVar.y1) - (fbVar.v1 * (fbVar.f / j13));
                }
                f20 = v;
                float f70 = fbVar.y1;
                float f71 = f61 - f70;
                if (j16 <= 0) {
                    f62 = f70;
                    f19 = v10;
                    f63 = f15;
                } else {
                    f62 = f70;
                    f19 = v10;
                    f63 = (((j16 - fbVar.f) / j13) * fbVar.v1) + fbVar.z1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f71, f67 - videoHeight, f63 + f62, f67);
                float f72 = f67 - ((f17 * f60) + videoHeight);
                float f73 = (rectF10.top * f13) + f15;
                f18 = (rectF10.bottom * f13) + f15;
                fbVar.w0.rewind();
                fbVar.w0.addRoundRect(rectF10, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(fbVar.w0);
                db dbVar = fbVar.h.c;
                if (dbVar != null) {
                    int i19 = dbVar.f;
                    float f74 = i19;
                    f21 = f73;
                    int max2 = (int) Math.max(0.0d, Math.floor((f71 - fbVar.z1) / f74));
                    f14 = f60;
                    int min2 = (int) Math.min(fbVar.h.c.c, Math.ceil(((r6 - f71) - fbVar.z1) / f74) + 1.0d);
                    int i20 = (int) rectF10.top;
                    arrayList15 = fbVar.h.c.d;
                    boolean z16 = arrayList15.size() >= min2;
                    boolean z17 = (i19 == 0 || !z16 || fbVar.h.b) ? false : true;
                    if (z17) {
                        int i21 = max2;
                        while (true) {
                            arrayList18 = fbVar.h.c.d;
                            if (i21 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = fbVar.h.c.d;
                            if (((cb) arrayList19.get(i21)).a == null) {
                                z17 = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (!z17) {
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
                                z14 = z16;
                                fbVar.v0.setAlpha((int) (cbVar.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(cbVar.a, f75, i20 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), fbVar.v0);
                            } else {
                                i18 = min2;
                                z14 = z16;
                            }
                            f75 += f74;
                            i22++;
                            z16 = z14;
                            min2 = i18;
                        }
                    }
                    boolean z18 = z16;
                    f64 = 1.0f;
                    if (!z18) {
                        fbVar.h.c.c();
                    }
                } else {
                    f21 = f73;
                    f14 = f60;
                    f64 = 1.0f;
                }
                path2.rewind();
                if (fbVar.Y0) {
                    f16 = f64;
                } else {
                    RectF rectF11 = org.telegram.messenger.g0.P;
                    int i23 = fbVar.z1;
                    int i24 = fbVar.y1;
                    float f76 = i23 + i24;
                    ab abVar5 = fbVar.h;
                    float f77 = abVar5.g;
                    f16 = f64;
                    int i25 = i24;
                    float f78 = abVar5.e;
                    float f79 = fbVar.f;
                    float f80 = (f77 * f78) - f79;
                    float f81 = j13;
                    float f82 = fbVar.v1;
                    float f83 = (((f80 / f81) * f82) + f76) - (f77 <= f15 ? i25 : 0);
                    float f84 = fbVar.x1 - fbVar.A1;
                    float f85 = f84 - videoHeight;
                    float f86 = abVar5.h;
                    float f87 = ((((f78 * f86) - f79) / f81) * f82) + f76;
                    if (f86 < f16) {
                        i25 = 0;
                    }
                    rectF11.set(f83, f85, f87 + i25, f84);
                    path2.addRoundRect(rectF11, fbVar.u1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f12 = videoHeight;
                f67 = f72;
            } else {
                f13 = d11;
                f14 = f66;
                f15 = f12;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j13 = j12;
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
                    org.telegram.ui.Components.u5 u5Var = abVar6.k;
                    RectF rectF12 = abVar6.j;
                    float f89 = f12;
                    float d12 = u5Var.d((fbVar.Q || fbVar.H || fbVar.n != i26) ? false : true);
                    if (abVar6 != fbVar.w) {
                        i15 = i26;
                        arrayList9 = arrayList22;
                        float f90 = j13;
                        f51 = f18;
                        f52 = ((((org.telegram.messenger.g0.T1(abVar6.g, f15, d12) * abVar6.e) + (abVar6.f - fbVar.f)) / f90) * fbVar.v1) + fbVar.z1 + fbVar.y1;
                        rectF5 = rectF7;
                        A2 = (com.google.android.recaptcha.internal.a.x(org.telegram.messenger.g0.T1(abVar6.h, f16, d12), abVar6.e, abVar6.f - fbVar.f, f90) * fbVar.v1) + fbVar.z1 + fbVar.y1;
                        path = path2;
                    } else {
                        i15 = i26;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f51 = f18;
                        float f91 = fbVar.z1 + fbVar.y1;
                        float f92 = j13;
                        float f93 = (abVar6.f - fbVar.f) / f92;
                        float f94 = fbVar.v1;
                        f52 = (f93 * f94) + f91;
                        path = path2;
                        A2 = a1.g.A(r8 + abVar6.e, f92, f94, f91);
                    }
                    float f95 = f52;
                    canvas2.save();
                    float W1 = org.telegram.messenger.g0.W1(d12, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
                    float f96 = fbVar.y1;
                    rectF12.set(f95 - f96, f88 - W1, A2 + f96, f88);
                    f21 = (rectF12.top * d12) + f21;
                    f18 = (rectF12.bottom * d12) + f51;
                    float f97 = abVar6.f;
                    float f98 = abVar6.g;
                    float f99 = f88;
                    float f100 = abVar6.e;
                    f20 = (((f98 * f100) + f97) * d12) + f20;
                    f19 = (((abVar6.h * f100) + f97) * d12) + f19;
                    fbVar.y.rewind();
                    fbVar.y.addRoundRect(rectF12, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(fbVar.y);
                    db dbVar2 = abVar6.c;
                    if (dbVar2 != null) {
                        long j17 = abVar6.e;
                        f53 = W1;
                        if (j17 <= 0) {
                            j15 = j17;
                            f56 = 0.0f;
                        } else {
                            j15 = j17;
                            f56 = fbVar.z1 + fbVar.y1 + (((abVar6.f - fbVar.f) / j13) * fbVar.v1);
                        }
                        float f101 = fbVar.y1;
                        float f102 = f56 - f101;
                        if (j17 <= 0) {
                            f57 = f101;
                            f58 = 0.0f;
                        } else {
                            f57 = f101;
                            f58 = ((((abVar6.f + j15) - fbVar.f) / j13) * fbVar.v1) + fbVar.z1 + r7;
                        }
                        float f103 = f58 + f57;
                        int i27 = dbVar2.f;
                        float f104 = i27;
                        int max3 = (int) Math.max(0.0d, Math.floor((f102 - ((((abVar6.f - fbVar.f) / j13) * fbVar.v1) + (fbVar.z1 + fbVar.y1))) / f104));
                        int min3 = (int) Math.min(abVar6.c.c, Math.ceil((f103 - f102) / f104) + 1.0d);
                        int i28 = (int) rectF12.top;
                        arrayList10 = abVar6.c.d;
                        boolean z19 = arrayList10.size() >= min3;
                        if (z19) {
                            for (int i29 = max3; i29 < Math.min(arrayList13.size(), min3); i29++) {
                                arrayList14 = abVar6.c.d;
                                if (((cb) arrayList14.get(i29)).a == null) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = z19;
                        if (!z12) {
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
                                    z13 = z19;
                                    i17 = max3;
                                    f59 = f99;
                                    fbVar.x.setAlpha((int) (cbVar2.b.e(false, 1.0f) * 255.0f));
                                    canvas2.drawBitmap(cbVar2.a, f105, i28 - ((int) ((r4.getHeight() - f53) / 2.0f)), fbVar.x);
                                } else {
                                    z13 = z19;
                                    i17 = max3;
                                    f59 = f99;
                                }
                                f105 += f104;
                                max3 = i17 + 1;
                                min3 = i30;
                                z19 = z13;
                                f99 = f59;
                            }
                        }
                        f54 = f99;
                        if (!z19) {
                            abVar6.c.c();
                        }
                    } else {
                        f53 = W1;
                        f54 = f99;
                    }
                    fbVar.E.rewind();
                    if (!fbVar.Y0) {
                        RectF rectF13 = org.telegram.messenger.g0.P;
                        int i31 = fbVar.z1;
                        int i32 = fbVar.y1;
                        float f106 = i31 + i32;
                        float f107 = abVar6.g;
                        float f108 = abVar6.e;
                        float f109 = fbVar.f;
                        float f110 = (f107 * f108) - f109;
                        float f111 = abVar6.f;
                        float f112 = j13;
                        float f113 = fbVar.v1;
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
                        fbVar.E.addRoundRect(rectF13, fbVar.u1, Path.Direction.CW);
                        canvas2.clipPath(fbVar.E, Region.Op.DIFFERENCE);
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
            float d13 = fbVar.d0.d(fbVar.F);
            float d14 = fbVar.e0.d(fbVar.F && fbVar.H);
            float roundHeight = fbVar.getRoundHeight() * d13;
            float f118 = ((fbVar.h == null && !fbVar.O && arrayList3.isEmpty()) ? 1.0f : d14) * d13;
            if (d13 > 0.0f) {
                long j18 = fbVar.J;
                float f119 = j18;
                float f120 = fbVar.K;
                float f121 = fbVar.I;
                f20 = (((f120 * f121) + f119) * f118) + f20;
                f19 = (((fbVar.L * f121) + f119) * f118) + f19;
                if (fbVar.h != null) {
                    float f122 = j13;
                    float T12 = ((((fbVar.I * org.telegram.messenger.g0.T1(f120, 0.0f, d14)) + (j18 - fbVar.f)) / f122) * fbVar.v1) + fbVar.z1 + fbVar.y1;
                    f44 = f18;
                    f24 = f23;
                    A = (com.google.android.recaptcha.internal.a.x(org.telegram.messenger.g0.T1(fbVar.L, 1.0f, d14), fbVar.I, fbVar.J - fbVar.f, f122) * fbVar.v1) + fbVar.z1 + fbVar.y1;
                    f45 = T12;
                } else {
                    f24 = f23;
                    f44 = f18;
                    float f123 = fbVar.z1 + fbVar.y1;
                    long j19 = j18 - fbVar.f;
                    float f124 = j13;
                    float f125 = fbVar.v1;
                    float f126 = ((j19 / f124) * f125) + f123;
                    A = a1.g.A(j19 + r6, f124, f125, f123);
                    f45 = f126;
                }
                float f127 = fbVar.y1;
                rectF14.set(f45 - f127, f67 - roundHeight, A + f127, f67);
                float f128 = f67 - ((f17 * d13) + roundHeight);
                f21 = (rectF14.top * f118) + f21;
                f18 = (rectF14.bottom * f118) + f44;
                fbVar.z0.rewind();
                fbVar.z0.addRoundRect(rectF14, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(fbVar.z0);
                db dbVar3 = fbVar.N;
                if (dbVar3 != null) {
                    float f129 = d14;
                    long j20 = fbVar.I;
                    if (j20 <= 0) {
                        f46 = f128;
                        j14 = j20;
                        f47 = 0.0f;
                    } else {
                        f46 = f128;
                        j14 = j20;
                        f47 = fbVar.z1 + fbVar.y1 + (((fbVar.J - fbVar.f) / j13) * fbVar.v1);
                    }
                    float f130 = fbVar.y1;
                    float f131 = f47 - f130;
                    if (j20 <= 0) {
                        f48 = f130;
                        f49 = 0.0f;
                    } else {
                        f48 = f130;
                        f49 = fbVar.z1 + r10 + ((((fbVar.J + j14) - fbVar.f) / j13) * fbVar.v1);
                    }
                    float f132 = f49 + f48;
                    int i33 = dbVar3.f;
                    float f133 = i33;
                    float f134 = f131;
                    int max4 = (int) Math.max(0.0d, Math.floor((f131 - (fbVar.h != null ? (((fbVar.J - fbVar.f) / j13) * fbVar.v1) + (fbVar.z1 + fbVar.y1) : fbVar.z1)) / f133));
                    int min4 = (int) Math.min(fbVar.N.c, Math.ceil((f132 - f134) / f133) + 1.0d);
                    int i34 = (int) rectF14.top;
                    arrayList4 = fbVar.N.d;
                    boolean z20 = arrayList4.size() >= min4;
                    if (z20) {
                        int i35 = max4;
                        i12 = i35;
                        while (i35 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = fbVar.N.d;
                            if (((cb) arrayList8.get(i35)).a == null) {
                                z11 = false;
                                break;
                            }
                            i35++;
                        }
                    } else {
                        i12 = max4;
                    }
                    z11 = z20;
                    if (!z11) {
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
                            arrayList6 = fbVar.N.d;
                            cb cbVar3 = (cb) arrayList6.get(i36);
                            int i37 = i36;
                            if (cbVar3.a != null) {
                                i13 = min4;
                                i14 = i34;
                                f50 = f129;
                                fbVar.v0.setAlpha((int) (cbVar3.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(cbVar3.a, f134, i14 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), fbVar.v0);
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
                    if (!z20) {
                        fbVar.N.c();
                    }
                } else {
                    f46 = f128;
                    f25 = d14;
                }
                path3.rewind();
                RectF rectF15 = org.telegram.messenger.g0.P;
                int i38 = fbVar.z1;
                int i39 = fbVar.y1;
                float f135 = i38 + i39;
                float f136 = fbVar.K;
                float f137 = fbVar.I;
                float f138 = f136 * f137;
                float f139 = fbVar.f;
                float f140 = f138 - f139;
                float f141 = fbVar.J;
                float f142 = j13;
                float f143 = (f140 + f141) / f142;
                float f144 = fbVar.v1;
                float f145 = (1.0f - f25) * i39;
                float f146 = (((f143 * f144) + f135) - (f136 <= 0.0f ? i39 : 0)) - f145;
                float f147 = rectF14.top;
                float f148 = fbVar.L;
                float f149 = (((((f137 * f148) - f139) + f141) / f142) * f144) + f135;
                if (f148 < 1.0f) {
                    i39 = 0;
                }
                rectF15.set(f146, f147, f149 + i39 + f145, rectF14.bottom);
                path3.addRoundRect(rectF15, fbVar.u1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f67 = f46;
            } else {
                f24 = f23;
                f25 = d14;
            }
            float d15 = fbVar.f0.d(fbVar.O);
            float d16 = fbVar.g0.d(fbVar.O && fbVar.Q);
            float audioHeight = fbVar.getAudioHeight() * d15;
            float f150 = ((fbVar.h == null && !fbVar.F && arrayList3.isEmpty()) ? 1.0f : d16) * d15;
            if (d15 > 0.0f) {
                float f151 = fbVar.R;
                float f152 = fbVar.T;
                float f153 = fbVar.S;
                f20 = (((f152 * f153) + f151) * f150) + f20;
                f19 = (((fbVar.U * f153) + f151) * f150) + f19;
                Paint c12 = fbVar.n0.c(d15);
                canvas2.save();
                if (fbVar.h == null && !fbVar.F && arrayList3.isEmpty()) {
                    float f154 = fbVar.z1 + fbVar.y1;
                    f38 = f18;
                    float f155 = fbVar.R - fbVar.f;
                    float f156 = j13;
                    float f157 = fbVar.v1;
                    float f158 = ((f155 / f156) * f157) + f154;
                    paint2 = paint;
                    f37 = f150;
                    x10 = a1.g.A(r10 + fbVar.S, f156, f157, f154);
                    T1 = f158;
                } else {
                    f37 = f150;
                    f38 = f18;
                    paint2 = paint;
                    float f159 = j13;
                    T1 = ((((org.telegram.messenger.g0.T1(fbVar.T, 0.0f, d16) * fbVar.S) + (fbVar.R - fbVar.f)) / f159) * fbVar.v1) + fbVar.z1 + fbVar.y1;
                    x10 = fbVar.z1 + fbVar.y1 + (com.google.android.recaptcha.internal.a.x(org.telegram.messenger.g0.T1(fbVar.U, 1.0f, d16), fbVar.S, fbVar.R - fbVar.f, f159) * fbVar.v1);
                }
                float f160 = x10;
                float f161 = fbVar.y1;
                RectF rectF16 = rectF3;
                rectF16.set(T1 - f161, f67 - audioHeight, f160 + f161, f67);
                f21 = (rectF16.top * f37) + f21;
                float f162 = (rectF16.bottom * f37) + f38;
                fbVar.H0.rewind();
                fbVar.H0.addRoundRect(rectF16, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(fbVar.H0);
                if (x9Var != null && x9Var.c()) {
                    baVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d15, 855638016));
                } else if (c12 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d15, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c12);
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.r1(d15, 855638016));
                }
                if (fbVar.b0 == null || x9Var == null || !x9Var.c()) {
                    f39 = d16;
                    rectF4 = rectF16;
                    i3 = 1;
                    if (fbVar.b0 != null && c12 != null) {
                        Paint c13 = fbVar.o0.c(d15 * f10);
                        if (c13 == null) {
                            c13 = fbVar.I0;
                            c13.setAlpha((int) (64.0f * d15));
                        }
                        float e11 = fbVar.h0.e(!fbVar.V, fbVar.b0.e);
                        ya yaVar = fbVar.b0;
                        fbVar.V = yaVar.c > 0;
                        long j21 = j13;
                        fbVar.J0.b((((fbVar.R - fbVar.f) / j13) * fbVar.v1) + fbVar.z1 + fbVar.y1, T1, f160, f39, j21, audioHeight, e11, rectF4.bottom, yaVar);
                        f40 = f39;
                        j11 = j21;
                        canvas2.drawPath(fbVar.J0, c13);
                        if (f40 >= 1.0f) {
                            int i40 = fbVar.z1;
                            float f163 = fbVar.y1 + i40;
                            float f164 = fbVar.R - fbVar.f;
                            float f165 = fbVar.T;
                            float f166 = fbVar.S;
                            float f167 = j11;
                            float f168 = fbVar.v1;
                            float f169 = ((((f165 * f166) + f164) / f167) * f168) + f163;
                            float f170 = ((((fbVar.U * f166) + f164) / f167) * f168) + f163;
                            float min5 = (Math.min(fbVar.w1 - fbVar.z1, f170) + Math.max(i40, f169)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(fbVar.w1 - fbVar.z1, f170) - Math.max(fbVar.z1, f169)) - org.telegram.messenger.g0.L(24.0f));
                            float N2 = org.telegram.messenger.g0.N(13.0f);
                            if (fbVar.N0 == null && fbVar.R0 == null) {
                                f42 = 13.0f;
                                N = 0.0f;
                            } else {
                                f42 = 13.0f;
                                N = org.telegram.messenger.g0.N(9.66f) + org.telegram.messenger.g0.N(3.11f) + fbVar.O0 + fbVar.S0;
                            }
                            float f171 = N2 + N;
                            int i41 = f171 < max5 ? i3 : 0;
                            float min6 = min5 - (Math.min(f171, max5) / 2.0f);
                            fbVar.L0.setBounds((int) min6, (int) (centerY3 - (org.telegram.messenger.g0.L(f42) / 2.0f)), (int) (org.telegram.messenger.g0.L(f42) + min6), (int) ((org.telegram.messenger.g0.L(f42) / 2.0f) + centerY3));
                            float f172 = 1.0f - f40;
                            float f173 = f172 * 255.0f;
                            fbVar.L0.setAlpha((int) f173);
                            fbVar.L0.draw(canvas2);
                            float N3 = org.telegram.messenger.g0.N(16.11f) + min6;
                            f41 = f162;
                            f28 = f13;
                            d = 0.0d;
                            f27 = d15;
                            f26 = f40;
                            f29 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, fbVar.w1, fbVar.x1, hs.e4, 31);
                            float min7 = Math.min(f170, fbVar.w1) - org.telegram.messenger.g0.L(12.0f);
                            canvas2.clipRect(N3, 0.0f, min7, fbVar.x1);
                            if (fbVar.N0 != null) {
                                canvas2.save();
                                canvas2.translate(N3 - fbVar.P0, centerY3 - (fbVar.N0.getHeight() / 2.0f));
                                fbVar.M0.setAlpha((int) (f173 * f27));
                                fbVar.N0.draw(canvas2);
                                canvas2.restore();
                                f43 = fbVar.O0 + N3;
                            } else {
                                f43 = N3;
                            }
                            if (fbVar.N0 != null && fbVar.R0 != null) {
                                float N4 = org.telegram.messenger.g0.N(3.66f) + f43;
                                int alpha = fbVar.K0.getAlpha();
                                fbVar.K0.setAlpha((int) (alpha * f172));
                                canvas2.drawCircle(org.telegram.messenger.g0.L(1.0f) + N4, centerY3, org.telegram.messenger.g0.L(1.0f), fbVar.K0);
                                fbVar.K0.setAlpha(alpha);
                                f43 = org.telegram.messenger.g0.N(2.0f) + N4 + org.telegram.messenger.g0.N(4.0f);
                            }
                            if (fbVar.R0 != null) {
                                canvas2.save();
                                canvas2.translate(f43 - fbVar.T0, centerY3 - (fbVar.R0.getHeight() / 2.0f));
                                fbVar.Q0.setAlpha((int) (f173 * f27));
                                fbVar.R0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (i41 == 0) {
                                fbVar.V0.reset();
                                fbVar.V0.postScale(org.telegram.messenger.g0.N(8.0f) / 16.0f, 1.0f);
                                fbVar.V0.postTranslate(min7 - org.telegram.messenger.g0.L(8.0f), 0.0f);
                                fbVar.U0.setLocalMatrix(fbVar.V0);
                                canvas2.drawRect(min7 - org.telegram.messenger.g0.L(8.0f), rectF4.top, min7, rectF4.bottom, fbVar.W0);
                            }
                            canvas.restore();
                        } else {
                            f27 = d15;
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
                    float e12 = fbVar.h0.e(!fbVar.V, fbVar.b0.e);
                    ya yaVar2 = fbVar.b0;
                    fbVar.V = yaVar2.c > 0;
                    i3 = 1;
                    rectF4 = rectF16;
                    f39 = d16;
                    fbVar.J0.b((((fbVar.R - fbVar.f) / j13) * fbVar.v1) + fbVar.z1 + fbVar.y1, T1, f160, f39, j13, audioHeight, e12, rectF4.bottom, yaVar2);
                    canvas2.saveLayerAlpha(rectF4, hs.n1, 31);
                    canvas2.clipPath(fbVar.J0);
                    fbVar.o0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                f40 = f39;
                if (f40 >= 1.0f) {
                }
                canvas.restore();
                f30 = f41;
            } else {
                f26 = d16;
                f27 = d15;
                float f174 = f18;
                paint2 = paint;
                f28 = f13;
                f29 = f14;
                d = 0.0d;
                i3 = 1;
                j11 = j13;
                f30 = f174;
            }
            float f175 = f21;
            float f176 = fbVar.z1 + fbVar.y1;
            float f177 = fbVar.f;
            float f178 = j11;
            float f179 = fbVar.v1;
            float f180 = (((f20 - f177) / f178) * f179) + f176;
            float f181 = (((f19 - f177) / f178) * f179) + f176;
            if (!arrayList3.isEmpty()) {
                f32 = d13;
                f31 = f27;
                f27 = f24;
            } else if (fbVar.O && fbVar.h == null) {
                f32 = d13;
                f31 = f27;
            } else {
                float f182 = f27;
                f27 = Math.max(f29, d13);
                f31 = f182;
                f32 = d13;
            }
            if (f31 > d || f32 > d || f29 > d || f24 > d) {
                if (fbVar.h == null && !fbVar.F && arrayList3.isEmpty()) {
                    f33 = f26;
                    f34 = f31 * org.telegram.messenger.g0.T1(0.6f, 1.0f, f33);
                } else {
                    f33 = f26;
                    f34 = 1.0f;
                }
                Paint paint5 = paint2;
                fbVar.e(canvas, paint5, f175, f30, f180, f181, f34 * f27);
                ab abVar7 = fbVar.h;
                if (abVar7 != null && ((fbVar.O || fbVar.F) && (f33 > 0.0f || f25 > 0.0f))) {
                    float f183 = fbVar.x1 - fbVar.A1;
                    float f184 = fbVar.y1 + fbVar.z1;
                    float f185 = abVar7.g;
                    float f186 = abVar7.e;
                    float f187 = fbVar.f;
                    float f188 = fbVar.v1;
                    float f189 = ((((abVar7.h * f186) - f187) / f178) * f188) + f184;
                    canvas3 = canvas;
                    fbVar.e(canvas3, paint5, f183 - f22, f183, ((((f185 * f186) - f187) / f178) * f188) + f184, f189, 0.8f);
                } else if (fbVar.w == null || arrayList3.size() <= i3) {
                    canvas3 = canvas;
                } else {
                    ab abVar8 = fbVar.w;
                    RectF rectF17 = abVar8.j;
                    float f190 = rectF17.top;
                    float f191 = rectF17.bottom;
                    float f192 = fbVar.y1 + fbVar.z1;
                    float f193 = abVar8.f;
                    float f194 = abVar8.g;
                    float f195 = abVar8.e;
                    float f196 = fbVar.f;
                    float f197 = fbVar.v1;
                    float f198 = (((((f194 * f195) + f193) - f196) / f178) * f197) + f192;
                    float f199 = (((((abVar8.h * f195) + f193) - f196) / f178) * f197) + f192;
                    canvas3 = canvas;
                    fbVar.e(canvas3, paint5, f190, f191, f198, f199, 0.8f);
                }
                if (fbVar.c0 > 1) {
                    ab abVar9 = fbVar.h;
                    if (abVar9 != null) {
                        float f200 = abVar9.e;
                        float f201 = abVar9.h;
                        float f202 = abVar9.g;
                        long j22 = (long) ((f201 - f202) * f200);
                        if (j22 > 68999) {
                            float f203 = fbVar.z1 + fbVar.y1;
                            float f204 = fbVar.f;
                            float f205 = fbVar.v1;
                            float f206 = ((((f202 * f200) - f204) / f178) * f205) + f203;
                            float f207 = ((((f201 * f200) - f204) / f178) * f205) + f203;
                            canvas3.save();
                            float f208 = fbVar.x1 - fbVar.A1;
                            canvas3.clipRect(f206, f208 - f22, f207, f208);
                            fbVar.A0.setAlpha((int) (org.telegram.messenger.g0.T1(0.8f, 1.0f, f28) * 255.0f));
                            i3 = 1;
                            long j23 = 59000;
                            int min8 = (int) Math.min(fbVar.c0 - 1, j22 / 59000);
                            int i42 = 1;
                            while (i42 <= min8) {
                                if (Math.min(j23, j22 - (i42 * j23)) < 1000) {
                                    break;
                                }
                                float f209 = fbVar.z1 + fbVar.y1;
                                ab abVar10 = fbVar.h;
                                float f210 = ((((((long) (abVar10.e * abVar10.g)) + r2) - fbVar.f) / f178) * fbVar.v1) + f209;
                                float f211 = fbVar.x1 - fbVar.A1;
                                Paint paint6 = fbVar.A0;
                                Canvas canvas4 = canvas3;
                                canvas4.drawRect(f210, (fbVar.x1 - fbVar.A1) - f22, org.telegram.messenger.g0.L(1.0f) + f210, f211, paint6);
                                canvas3 = canvas4;
                                StringBuilder sb2 = new StringBuilder("#");
                                i42++;
                                sb2.append(i42);
                                canvas3.drawText(sb2.toString(), f210 + org.telegram.messenger.g0.L(2.0f), ((fbVar.x1 - fbVar.A1) - f22) + org.telegram.messenger.g0.L(14.0f), fbVar.F0);
                                j23 = 59000;
                            }
                            canvas3.restore();
                        }
                    }
                    i3 = 1;
                } else {
                    i3 = 1;
                }
                float e13 = fbVar.c1.e(false, 0.0f);
                float contentHeight = ((fbVar.x1 - fbVar.getContentHeight()) + fbVar.A1) - org.telegram.messenger.g0.N(2.3f);
                float N5 = org.telegram.messenger.g0.N(4.3f) + (fbVar.x1 - fbVar.A1);
                if (e13 > 0.0f) {
                    long j24 = fbVar.d1;
                    if (j24 == -1) {
                        ab abVar11 = fbVar.h;
                        if (abVar11 != null) {
                            j24 = (long) (abVar11.e * abVar11.h);
                        } else {
                            ab abVar12 = fbVar.w;
                            if (abVar12 != null) {
                                j24 = (long) ((abVar12.h - abVar12.g) * abVar12.e);
                            } else {
                                if (fbVar.F) {
                                    f35 = fbVar.I;
                                    f36 = fbVar.L;
                                } else {
                                    f35 = fbVar.S;
                                    f36 = fbVar.U;
                                }
                                j24 = (long) (f35 * f36);
                            }
                        }
                    }
                    fbVar = this;
                    fbVar.d(canvas3, contentHeight, N5, j24, e13 * f27);
                } else {
                    fbVar = fbVar;
                }
                fbVar.d(canvas, contentHeight, N5, fbVar.e, (1.0f - e13) * f27);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            i3 = 1;
            j11 = j10;
        }
        if (fbVar.n1) {
            float f212 = 1.0f / (1000.0f / org.telegram.messenger.g0.r);
            float f213 = fbVar.o1;
            long L2 = (long) ((org.telegram.messenger.g0.L(32.0f) / fbVar.v1) * j11 * f212 * f213);
            if (fbVar.Y0) {
                fbVar.o1 = (f212 * 0.25f) + f213;
            }
            int i43 = fbVar.i1;
            if (i43 == 4 && (abVar2 = fbVar.h) != null) {
                float f214 = abVar2.g;
                long j25 = fbVar.f;
                long j26 = abVar2.e;
                float f215 = j26;
                if (f214 < j25 / f215) {
                    i11 = -1;
                } else if (abVar2.h > (j25 + j11) / f215) {
                    i11 = i3;
                } else {
                    fbVar.o1 = 1.0f;
                    i11 = 0;
                }
                long j27 = i11 * L2;
                fbVar.f = Utilities.k(j25 + j27, j26 - j11, 0L);
                fbVar.e += j27;
                ab abVar13 = fbVar.h;
                float f216 = (r3 - j25) / abVar13.e;
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
                    zaVar.w(false, fbVar.h.g);
                    fbVar.a.W(fbVar.h.h);
                }
                fbVar.invalidate();
            } else if (i43 == 8) {
                float f217 = fbVar.T;
                long j28 = fbVar.R;
                float f218 = (-j28) + 100;
                long j29 = fbVar.S;
                float f219 = j29;
                if (f217 < f218 / f219) {
                    i10 = -1;
                } else if (fbVar.U >= ((r8 + j11) - 100) / f219) {
                    i10 = i3;
                } else {
                    fbVar.o1 = 1.0f;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (fbVar.Q && (abVar = fbVar.h) != null) {
                        long j30 = j28 - (i10 * L2);
                        float f220 = abVar.h;
                        float f221 = abVar.e;
                        fbVar.R = Utilities.k(j30, (long) ((f220 * f221) - (f217 * f219)), (long) ((abVar.g * f221) - (fbVar.U * f219)));
                    } else if (fbVar.H && fbVar.F) {
                        long j31 = j28 - (i10 * L2);
                        float f222 = fbVar.L;
                        float f223 = fbVar.I;
                        fbVar.R = Utilities.k(j31, (long) ((f222 * f223) - (f217 * f219)), (long) ((fbVar.K * f223) - (fbVar.U * f219)));
                    } else {
                        fbVar.R = Utilities.k(j28 - (i10 * L2), 0L, -(j29 - Math.min(fbVar.getBaseDuration(), fbVar.getMaxScrollDuration())));
                    }
                    float f224 = (-(fbVar.R - j28)) / fbVar.S;
                    float min9 = f224 > 0.0f ? Math.min(1.0f - fbVar.U, f224) : Math.max(0.0f - fbVar.T, f224);
                    if (fbVar.h == null) {
                        float f225 = fbVar.e;
                        float f226 = fbVar.S;
                        fbVar.e = (long) Utilities.i((min9 * f226) + f225, f226, 0.0f);
                    }
                    fbVar.T = Utilities.i(fbVar.T + min9, 1.0f, 0.0f);
                    fbVar.U = Utilities.i(fbVar.U + min9, 1.0f, 0.0f);
                    za zaVar2 = fbVar.a;
                    if (zaVar2 != null) {
                        zaVar2.T(fbVar.T);
                        fbVar.a.R(fbVar.U);
                        fbVar.a.n(fbVar.e, false);
                    }
                    fbVar.invalidate();
                } else {
                    fbVar.o1 = 1.0f;
                }
            } else {
                fbVar.o1 = 1.0f;
            }
        } else {
            fbVar.o1 = 1.0f;
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
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w1, this.x1, hs.e4, 31);
        int i3 = (int) (255.0f * f14);
        Paint paint2 = this.A0;
        paint2.setAlpha(i3);
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
        paint4.setAlpha(hs.e4);
        paint5.setAlpha(i3);
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
        rectF.set(com.google.android.recaptcha.internal.a.z(org.telegram.messenger.g0.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f13), f16, org.telegram.messenger.k5.a(org.telegram.messenger.g0.L(this.Y0 ? 2.5f : 10.0f), L, 2.0f, f13), f17);
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
        long j10;
        float f12;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        za zaVar;
        long k10;
        ab abVar = this.h;
        if (abVar == null && !this.F) {
            long j16 = this.R;
            long k11 = Utilities.k(j16 + ((long) f10), 0L, -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.R = k11;
            float f13 = k11 - j16;
            this.T = Utilities.i(this.T - (f13 / this.S), 1.0f, 0.0f);
            this.U = Utilities.i(this.U - (f13 / this.S), 1.0f, 0.0f);
            za zaVar2 = this.a;
            if (zaVar2 != null) {
                zaVar2.T(this.T);
                this.a.R(this.U);
            }
        } else if (this.Q) {
            if (abVar != null) {
                f11 = abVar.g;
                j10 = abVar.e;
            } else {
                f11 = this.K;
                j10 = this.I;
            }
            float f14 = f11 * j10;
            if (abVar != null) {
                f12 = abVar.h;
                j11 = abVar.e;
            } else {
                f12 = this.L;
                j11 = this.I;
            }
            float f15 = f12 * j11;
            float f16 = abVar != null ? (abVar.h - abVar.g) * abVar.e : this.I * (this.L - this.K);
            float f17 = this.U;
            float f18 = this.S;
            long j17 = (long) (f15 - (f17 * f18));
            float f19 = this.T;
            long j18 = (long) (f14 - (f19 * f18));
            float min = Math.min(f17 - f19, f16 / f18);
            long j19 = this.R;
            long j20 = (long) f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                float i3 = Utilities.i(((f15 - j19) - j20) / this.S, 1.0f, min);
                this.U = i3;
                float i10 = Utilities.i(i3 - min, 1.0f, 0.0f);
                this.T = i10;
                float f20 = this.U;
                float f21 = this.S;
                long j22 = (long) (f15 - (f20 * f21));
                long j23 = (long) (f14 - (i10 * f21));
                if (j22 < j23) {
                    j15 = j23;
                    j14 = j22;
                } else {
                    j14 = j23;
                    j15 = j22;
                }
                this.R = Utilities.k(this.R + j20, j15, j14);
                za zaVar3 = this.a;
                if (zaVar3 != null) {
                    zaVar3.T(this.T);
                    this.a.R(this.U);
                }
            } else if (j21 < j18) {
                float i11 = Utilities.i(((f14 - j19) - j20) / this.S, 1.0f - min, 0.0f);
                this.T = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.U = i12;
                float f22 = this.S;
                long j24 = (long) (f15 - (i12 * f22));
                long j25 = (long) (f14 - (this.T * f22));
                if (j24 < j25) {
                    j13 = j25;
                    j12 = j24;
                } else {
                    j12 = j25;
                    j13 = j24;
                }
                this.R = Utilities.k(this.R + j20, j13, j12);
                za zaVar4 = this.a;
                if (zaVar4 != null) {
                    zaVar4.T(this.T);
                    this.a.R(this.U);
                }
            } else {
                this.R = j21;
            }
        } else {
            long j26 = this.R + ((long) f10);
            float baseDuration = getBaseDuration();
            float f23 = this.S;
            this.R = Utilities.k(j26, (long) (baseDuration - (this.U * f23)), (long) ((-this.T) * f23));
        }
        invalidate();
        za zaVar5 = this.a;
        if (zaVar5 != null) {
            zaVar5.d0(this.R + ((long) (this.T * this.S)));
        }
        boolean z10 = this.n1;
        if (z10 || (zaVar = this.a) == null) {
            if (z10 || this.s1) {
                ab abVar2 = this.h;
                if (abVar2 != null) {
                    long j27 = this.R + ((long) (this.T * this.S));
                    float f24 = abVar2.h;
                    float f25 = abVar2.e;
                    this.e = Utilities.k(j27, (long) (f24 * f25), (long) (abVar2.g * f25));
                } else if (!this.F || abVar2 == null) {
                    float f26 = this.T;
                    long j28 = this.S;
                    this.e = Utilities.k((long) (f26 * j28), j28, 0L);
                } else {
                    long j29 = this.R + ((long) (this.T * this.S));
                    float f27 = this.L;
                    float f28 = abVar2.e;
                    this.e = Utilities.k(j29, (long) (f27 * f28), (long) (this.K * f28));
                }
                za zaVar6 = this.a;
                if (zaVar6 != null) {
                    zaVar6.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        zaVar.C(true);
        ab abVar3 = this.h;
        if (abVar3 != null) {
            long j30 = this.R + ((long) (this.T * this.S));
            float f29 = abVar3.h;
            float f30 = abVar3.e;
            k10 = Utilities.k(j30, (long) (f29 * f30), (long) (abVar3.g * f30));
        } else if (this.F) {
            long j31 = this.R + ((long) (this.T * this.S));
            float f31 = this.L;
            float f32 = this.I;
            k10 = Utilities.k(j31, (long) (f31 * f32), (long) (this.K * f32));
        } else {
            float f33 = this.T;
            long j32 = this.S;
            k10 = Utilities.k((long) (f33 * j32), j32, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        za zaVar7 = this.a;
        this.e = k10;
        zaVar7.n(k10, false);
    }

    public final void i(ab abVar, float f10) {
        za zaVar;
        long k10;
        long j10;
        long j11;
        long j12;
        long j13;
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
                long j14 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = abVar.g;
                long j15 = (long) ((f11 * 0.0f) - (f14 * f13));
                float min = Math.min(f12 - f14, ((abVar3.h - abVar3.g) * f11) / f13);
                long j16 = abVar.f;
                long j17 = (long) f10;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float i3 = Utilities.i((((this.w.h * r2.e) - j16) - j17) / abVar.e, 1.0f, min);
                    abVar.h = i3;
                    float i10 = Utilities.i(i3 - min, 1.0f, 0.0f);
                    abVar.g = i10;
                    ab abVar4 = this.w;
                    float f15 = abVar4.h;
                    float f16 = abVar4.e;
                    float f17 = abVar.h;
                    float f18 = abVar.e;
                    long j19 = (long) ((f15 * f16) - (f17 * f18));
                    long j20 = (long) ((abVar4.g * f16) - (i10 * f18));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    abVar.f = Utilities.k(abVar.f + j17, j13, j12);
                    za zaVar2 = this.a;
                    if (zaVar2 != null) {
                        zaVar2.P(abVar.g, abVar.a);
                        this.a.V(abVar.h, abVar.a);
                    }
                } else if (j18 < j15) {
                    float i11 = Utilities.i((((this.w.g * r2.e) - j16) - j17) / abVar.e, 1.0f - min, 0.0f);
                    abVar.g = i11;
                    float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                    abVar.h = i12;
                    ab abVar5 = this.w;
                    float f19 = abVar5.h;
                    float f20 = abVar5.e;
                    float f21 = abVar.e;
                    long j21 = (long) ((f19 * f20) - (i12 * f21));
                    long j22 = (long) ((abVar5.g * f20) - (abVar.g * f21));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    abVar.f = Utilities.k(abVar.f + j17, j11, j10);
                    za zaVar3 = this.a;
                    if (zaVar3 != null) {
                        zaVar3.P(abVar.g, abVar.a);
                        this.a.V(abVar.h, abVar.a);
                    }
                } else {
                    abVar.f = j18;
                }
            } else {
                long j23 = abVar.f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = abVar.e;
                abVar.f = Utilities.k(j23, (long) (baseDuration - (abVar.h * f22)), (long) ((-abVar.g) * f22));
            }
        }
        invalidate();
        za zaVar4 = this.a;
        if (zaVar4 != null) {
            zaVar4.b0(abVar.a, abVar.f);
        }
        boolean z10 = this.n1;
        if (z10 || (zaVar = this.a) == null) {
            if (z10 || this.s1) {
                ab abVar6 = this.w;
                if (abVar6 == abVar || abVar6 == null) {
                    float f23 = abVar.g;
                    long j24 = abVar.e;
                    this.e = Utilities.k((long) (f23 * j24), j24, 0L);
                } else {
                    long j25 = abVar.f + ((long) (abVar.g * abVar.e));
                    float f24 = abVar6.h;
                    float f25 = abVar6.e;
                    this.e = Utilities.k(j25, (long) (f24 * f25), (long) (abVar6.g * f25));
                }
                za zaVar5 = this.a;
                if (zaVar5 != null) {
                    zaVar5.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        zaVar.C(true);
        ab abVar7 = this.w;
        if (abVar7 == abVar || abVar7 == null) {
            float f26 = abVar.g;
            long j26 = abVar.e;
            k10 = Utilities.k((long) (f26 * j26), j26, 0L);
        } else {
            long j27 = abVar.f + ((long) (abVar.g * abVar.e));
            float f27 = abVar7.h;
            float f28 = abVar7.e;
            k10 = Utilities.k(j27, (long) (f27 * f28), (long) (abVar7.g * f28));
        }
        ab abVar8 = this.w;
        if (abVar8 != abVar && abVar8 != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        za zaVar6 = this.a;
        this.e = k10;
        zaVar6.n(k10, false);
    }

    public final void j(float f10) {
        long j10;
        long j11;
        long j12;
        long j13;
        za zaVar;
        long k10;
        ab abVar = this.h;
        if (abVar == null) {
            long j14 = this.J;
            long k11 = Utilities.k(j14 + ((long) f10), 0L, -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.J = k11;
            float f11 = k11 - j14;
            this.K = Utilities.i(this.K - (f11 / this.I), 1.0f, 0.0f);
            this.L = Utilities.i(this.L - (f11 / this.I), 1.0f, 0.0f);
            za zaVar2 = this.a;
            if (zaVar2 != null) {
                zaVar2.y(this.K);
                this.a.a0(this.L);
            }
        } else if (this.H) {
            float f12 = abVar.h;
            float f13 = abVar.e;
            float f14 = this.L;
            float f15 = this.I;
            long j15 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = abVar.g;
            float f17 = this.K;
            long j16 = (long) ((f16 * f13) - (f17 * f15));
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j17 = this.J;
            long j18 = (long) f10;
            long j19 = j17 + j18;
            if (j19 > j15) {
                float i3 = Utilities.i((((this.h.h * r1.e) - j17) - j18) / this.I, 1.0f, min);
                this.L = i3;
                float i10 = Utilities.i(i3 - min, 1.0f, 0.0f);
                this.K = i10;
                ab abVar2 = this.h;
                float f18 = abVar2.h;
                float f19 = abVar2.e;
                float f20 = this.L;
                float f21 = this.I;
                long j20 = (long) ((f18 * f19) - (f20 * f21));
                long j21 = (long) ((abVar2.g * f19) - (i10 * f21));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.J = Utilities.k(this.J + j18, j13, j12);
                za zaVar3 = this.a;
                if (zaVar3 != null) {
                    zaVar3.y(this.K);
                    this.a.a0(this.L);
                }
            } else if (j19 < j16) {
                float i11 = Utilities.i((((this.h.g * r1.e) - j17) - j18) / this.I, 1.0f - min, 0.0f);
                this.K = i11;
                float i12 = Utilities.i(i11 + min, 1.0f, 0.0f);
                this.L = i12;
                ab abVar3 = this.h;
                float f22 = abVar3.h;
                float f23 = abVar3.e;
                float f24 = this.I;
                long j22 = (long) ((f22 * f23) - (i12 * f24));
                long j23 = (long) ((abVar3.g * f23) - (this.K * f24));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.J = Utilities.k(this.J + j18, j11, j10);
                za zaVar4 = this.a;
                if (zaVar4 != null) {
                    zaVar4.y(this.K);
                    this.a.a0(this.L);
                }
            } else {
                this.J = j19;
            }
        } else {
            long j24 = this.J + ((long) f10);
            float baseDuration = getBaseDuration();
            float f25 = this.I;
            this.J = Utilities.k(j24, (long) (baseDuration - (this.L * f25)), (long) ((-this.K) * f25));
        }
        invalidate();
        za zaVar5 = this.a;
        if (zaVar5 != null) {
            zaVar5.K(this.J + ((long) (this.K * this.I)));
        }
        boolean z10 = this.n1;
        if (z10 || (zaVar = this.a) == null) {
            if (z10 || this.s1) {
                ab abVar4 = this.h;
                if (abVar4 != null) {
                    long j25 = this.J + ((long) (this.K * this.I));
                    float f26 = abVar4.h;
                    float f27 = abVar4.e;
                    this.e = Utilities.k(j25, (long) (f26 * f27), (long) (abVar4.g * f27));
                } else {
                    float f28 = this.K;
                    long j26 = this.I;
                    this.e = Utilities.k((long) (f28 * j26), j26, 0L);
                }
                za zaVar6 = this.a;
                if (zaVar6 != null) {
                    zaVar6.n(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        zaVar.C(true);
        ab abVar5 = this.h;
        if (abVar5 != null) {
            long j27 = this.J + ((long) (this.K * this.I));
            float f29 = abVar5.h;
            float f30 = abVar5.e;
            k10 = Utilities.k(j27, (long) (f29 * f30), (long) (abVar5.g * f30));
        } else {
            float f31 = this.K;
            long j28 = this.I;
            k10 = Utilities.k((long) (f31 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.d1 = this.e;
            this.c1.e(true, 1.0f);
        }
        za zaVar7 = this.a;
        this.e = k10;
        zaVar7.n(k10, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ab abVar = this.h;
        float f10 = (abVar.h + abVar.g) / 2.0f;
        long j10 = abVar.e;
        this.f = Utilities.k((long) ((f10 * j10) - (min / 2.0f)), j10 - min, 0L);
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
        ab abVar = this.h;
        ArrayList arrayList = this.s;
        if (abVar == null && !this.O && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.z1) - this.y1) / this.v1;
        ab abVar2 = this.w;
        long j10 = abVar2 != null ? (long) ((abVar2.g * abVar2.e) + abVar2.f) : 0L;
        float f12 = f11 * min;
        if (abVar2 == null) {
            j10 = this.h == null ? this.R : 0L;
        }
        long i3 = (long) Utilities.i((f12 - j10) + this.f, getBaseDuration(), 0.0f);
        ab abVar3 = this.h;
        if (abVar3 != null) {
            float f13 = i3 / abVar3.e;
            if (f13 < abVar3.g || f13 > abVar3.h) {
                return false;
            }
        }
        ab abVar4 = this.w;
        if (abVar4 != null && (i3 < 0 || i3 >= ((long) ((abVar4.h - abVar4.g) * abVar4.e)))) {
            return false;
        }
        if (this.O && abVar3 == null && arrayList.isEmpty()) {
            float f14 = i3 / this.S;
            if (f14 < this.T || f14 > this.U) {
                return false;
            }
        }
        this.e = i3;
        invalidate();
        za zaVar = this.a;
        if (zaVar != null) {
            zaVar.n(i3, z10);
        }
        ci.e3 e3Var = this.e1;
        if (e3Var != null) {
            org.telegram.messenger.g0.r(e3Var);
            this.e1 = null;
        }
        if (!z10) {
            return true;
        }
        ci.e3 e3Var2 = new ci.e3(this, i3, 9);
        this.e1 = e3Var2;
        org.telegram.messenger.g0.i3(e3Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z10) {
        boolean z11;
        long j12;
        boolean z12;
        ab abVar;
        if (TextUtils.equals(this.G, str)) {
            return;
        }
        db dbVar = this.N;
        if (dbVar != null) {
            dbVar.b();
            this.N = null;
        }
        long j13 = this.I;
        if (str != null) {
            this.G = str;
            this.I = j10;
            this.J = j11 - ((long) (j10 * f10));
            this.K = f10;
            this.L = f11;
            this.M = f12;
            if (getMeasuredWidth() <= 0 || this.N != null || ((abVar = this.h) != null && abVar.e < 1)) {
                z11 = false;
                j12 = j13;
                z12 = true;
            } else {
                String str2 = this.G;
                int i3 = this.w1;
                int i10 = this.z1;
                int i11 = (i3 - i10) - i10;
                int L = org.telegram.messenger.g0.L(38.0f);
                long j14 = this.I;
                Long valueOf = j14 > 2 ? Long.valueOf(j14) : null;
                ab abVar2 = this.h;
                j12 = j13;
                z11 = false;
                z12 = true;
                this.N = new db(this, false, str2, i11, L, valueOf, abVar2 != null ? abVar2.e : getMaxScrollDuration(), -1L, -1L, new wa(this, 0));
            }
            if (this.h == null) {
                this.Q = z11;
                this.H = z12;
            }
        } else {
            z11 = false;
            j12 = j13;
            z12 = true;
            this.G = null;
            this.I = 1L;
            this.H = false;
        }
        this.F = this.G != null ? z12 : z11;
        if (j12 != j10 && this.h == null && this.b0 != null) {
            this.a0 = z12;
            p();
        }
        if (this.O && this.F && this.h == null) {
            this.T = 0.0f;
            this.U = Utilities.i(j10 / this.S, 1.0f, 0.0f);
        }
        if (!z10) {
            this.e0.f(this.H, z12);
            this.g0.f(this.Q, z12);
            this.d0.f(this.F, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f10) {
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
            abVar3.b = z10;
            abVar3.d = str;
            abVar3.e = j10;
            abVar3.i = f10;
            ab.a(abVar3, false);
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
    public final void onMeasure(int i3, int i10) {
        this.M0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.Q0.setTextSize(org.telegram.messenger.g0.L(12.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        this.z1 = L;
        int L2 = org.telegram.messenger.g0.L(5.0f);
        this.A1 = L2;
        setPadding(L, L2, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(5.0f));
        int size = View.MeasureSpec.getSize(i3);
        this.w1 = size;
        int L3 = org.telegram.messenger.g0.L(388);
        this.x1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.g0.L(10.0f);
        this.y1 = L4;
        this.v1 = (this.w1 - (L4 * 2)) - (this.z1 * 2);
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
        if (this.P == null || this.b0 != null) {
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
        ci.e3 e3Var;
        boolean z11;
        VelocityTracker velocityTracker;
        za zaVar;
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
        float h;
        float y9;
        float h7;
        boolean z13;
        float y10;
        boolean z14;
        za zaVar2;
        int i3;
        float f11;
        float f12;
        boolean z15;
        float f13;
        float i10;
        za zaVar3;
        za zaVar4;
        int i11;
        float f14;
        float f15;
        ab abVar = this.h;
        ArrayList arrayList = this.s;
        if (abVar != null || !arrayList.isEmpty() || this.O || this.F) {
            float timelineHeight = this.x1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                al0 al0Var = this.X0;
                ai.t6 t6Var = this.Z0;
                if (action == 0) {
                    ci.e3 e3Var2 = this.e1;
                    if (e3Var2 != null) {
                        org.telegram.messenger.g0.r(e3Var2);
                        this.e1 = null;
                    }
                    al0Var.a();
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
                            float W1 = org.telegram.messenger.g0.W1(((ab) arrayList.get(i13)).k.c, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(38.0f));
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
                        org.telegram.messenger.g0.r(t6Var);
                        org.telegram.messenger.g0.i3(t6Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.h1;
                    if (this.k0 && (this.n1 || Math.abs(x10) > org.telegram.messenger.g0.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        ab abVar2 = this.h;
                        if (abVar2 != null && this.i1 == 1) {
                            this.f = (long) Utilities.i(this.f - ((x10 / this.v1) * min), abVar2.e - min, 0.0f);
                            invalidate();
                            if (!this.n1) {
                                this.o1 = 1.0f;
                            }
                            this.n1 = true;
                            this.m1 = false;
                        } else if (abVar2 == null || !((i11 = this.i1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.i1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f21 = (min / this.S) * (x10 / this.v1);
                                if (i15 == 6) {
                                    float g7 = this.U - (g() / this.S);
                                    float max = Math.max(0L, this.f - this.R);
                                    float f22 = this.S;
                                    float f23 = max / f22;
                                    ab abVar3 = this.h;
                                    if (abVar3 != null) {
                                        y9 = Math.max(f23, (((abVar3.g * abVar3.e) + this.f) - this.R) / f22);
                                    } else {
                                        ab abVar4 = this.w;
                                        if (abVar4 != null) {
                                            y9 = Math.max(f23, (((abVar4.g * abVar4.e) + this.f) - this.R) / f22);
                                        } else if (this.F) {
                                            y9 = Math.max(f23, (((this.K * this.I) + this.f) - this.R) / f22);
                                        } else {
                                            y9 = org.telegram.ui.Cells.f1.y(f(), this.S, this.U, f23);
                                            if (!this.p1 && f21 < 0.0f && this.T <= this.U - (f() / this.S)) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f24 = this.T;
                                    float i16 = Utilities.i(f24 + f21, g7, y9);
                                    this.T = i16;
                                    if (Math.abs(f24 - i16) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    za zaVar5 = this.a;
                                    if (zaVar5 != null) {
                                        zaVar5.d0(this.R + ((long) (this.T * this.S)));
                                    }
                                    za zaVar6 = this.a;
                                    if (zaVar6 != null) {
                                        zaVar6.T(this.T);
                                    }
                                } else if (i15 == 7) {
                                    float min2 = Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S);
                                    float f25 = this.T;
                                    float g10 = g();
                                    float f26 = this.S;
                                    float f27 = (g10 / f26) + f25;
                                    ab abVar5 = this.h;
                                    if (abVar5 != null) {
                                        h = Math.min(min2, (((abVar5.h * abVar5.e) + this.f) - this.R) / f26);
                                    } else {
                                        ab abVar6 = this.w;
                                        if (abVar6 != null) {
                                            h = Math.min(min2, (((abVar6.h * abVar6.e) + this.f) - this.R) / f26);
                                        } else if (this.F) {
                                            h = Math.min(min2, (((this.L * this.I) + this.f) - this.R) / f26);
                                        } else {
                                            h = org.telegram.ui.Cells.f1.h(f(), this.S, this.T, min2);
                                            if (!this.p1 && f21 > 0.0f) {
                                                if (this.U >= (f() / this.S) + this.T) {
                                                    this.i1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f28 = this.U;
                                    float i17 = Utilities.i(f28 + f21, h, f27);
                                    this.U = i17;
                                    if (Math.abs(f28 - i17) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    za zaVar7 = this.a;
                                    if (zaVar7 != null) {
                                        zaVar7.R(this.U);
                                    }
                                }
                                if (this.i1 == 8) {
                                    float min3 = f21 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.R) + min) / this.S) - this.U), f21) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.R) / this.S) - this.T), f21);
                                    float f29 = this.T + min3;
                                    this.T = f29;
                                    this.U += min3;
                                    za zaVar8 = this.a;
                                    if (zaVar8 != null) {
                                        zaVar8.T(f29);
                                        this.a.d0(this.R + ((long) (this.T * this.S)));
                                        this.a.R(this.U);
                                    }
                                    za zaVar9 = this.a;
                                    if (zaVar9 != null) {
                                        zaVar9.C(true);
                                    }
                                }
                                if (this.h == null && !this.F) {
                                    this.e = (long) (this.T * this.S);
                                    za zaVar10 = this.a;
                                    if (zaVar10 != null) {
                                        zaVar10.C(true);
                                        this.a.n(this.e, false);
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
                                    float g11 = this.L - (g() / this.I);
                                    float max2 = Math.max(0L, this.f - this.J);
                                    float f31 = this.I;
                                    float f32 = max2 / f31;
                                    ab abVar7 = this.h;
                                    if (abVar7 != null) {
                                        y10 = Math.max(f32, (((abVar7.g * abVar7.e) + this.f) - this.J) / f31);
                                    } else {
                                        ab abVar8 = this.w;
                                        if (abVar8 != null) {
                                            y10 = Math.max(f32, (((abVar8.g * abVar8.e) + this.f) - this.J) / f31);
                                        } else {
                                            y10 = org.telegram.ui.Cells.f1.y(f(), this.I, this.L, f32);
                                            if (!this.p1 && f30 < 0.0f && this.K <= this.L - (f() / this.I)) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f33 = this.K;
                                    float i18 = Utilities.i(f33 + f30, g11, y10);
                                    this.K = i18;
                                    if (Math.abs(f33 - i18) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    za zaVar11 = this.a;
                                    if (zaVar11 != null) {
                                        zaVar11.K(this.J + ((long) (this.K * this.I)));
                                    }
                                    za zaVar12 = this.a;
                                    if (zaVar12 != null) {
                                        zaVar12.y(this.K);
                                    }
                                } else if (i15 == 11) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I);
                                    float f34 = this.K;
                                    float g12 = g();
                                    float f35 = this.I;
                                    float f36 = (g12 / f35) + f34;
                                    ab abVar9 = this.h;
                                    if (abVar9 != null) {
                                        min4 = Math.min(min4, (((abVar9.h * abVar9.e) + this.f) - this.J) / f35);
                                    }
                                    ab abVar10 = this.w;
                                    if (abVar10 != null) {
                                        h7 = Math.min(min4, (((abVar10.h * abVar10.e) + this.f) - this.J) / this.I);
                                    } else {
                                        h7 = org.telegram.ui.Cells.f1.h(f(), this.I, this.K, min4);
                                        if (!this.p1 && f30 > 0.0f) {
                                            if (this.L >= (f() / this.I) + this.K) {
                                                this.i1 = 8;
                                            }
                                        }
                                    }
                                    float f37 = this.L;
                                    float i19 = Utilities.i(f37 + f30, h7, f36);
                                    this.L = i19;
                                    if (Math.abs(f37 - i19) > 0.01f) {
                                        this.p1 = true;
                                    }
                                    za zaVar13 = this.a;
                                    if (zaVar13 != null) {
                                        zaVar13.a0(this.L);
                                    }
                                }
                                if (this.i1 == 12) {
                                    float min5 = f30 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.J) + min) / this.I) - this.L, f30) : Math.max((Math.max(0L, this.f - this.J) / this.I) - this.K, f30);
                                    float f38 = this.K + min5;
                                    this.K = f38;
                                    this.L += min5;
                                    za zaVar14 = this.a;
                                    if (zaVar14 != null) {
                                        zaVar14.y(f38);
                                        this.a.K(this.J + ((long) (this.K * this.I)));
                                        this.a.a0(this.L);
                                    }
                                    za zaVar15 = this.a;
                                    if (zaVar15 != null) {
                                        zaVar15.C(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.K * this.I);
                                    za zaVar16 = this.a;
                                    if (zaVar16 != null) {
                                        zaVar16.C(true);
                                        z13 = false;
                                        this.a.n(this.e, false);
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
                                if (i20 < 0 || i20 >= arrayList.size() || !((i3 = this.i1) == 13 || i3 == 14 || i3 == 15)) {
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
                                            i((ab) arrayList.get(this.j1), (x10 / this.v1) * min);
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = true;
                                            this.m1 = false;
                                        } else if (this.m1) {
                                            m(currentTimeMillis - this.f1 < 350, motionEvent.getX());
                                            if (this.n1 || (zaVar2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                zaVar2.C(true);
                                            }
                                            if (!this.n1) {
                                                this.o1 = 1.0f;
                                            }
                                            this.n1 = z14;
                                        }
                                    }
                                } else {
                                    ab abVar11 = (ab) arrayList.get(this.j1);
                                    float f39 = (min / abVar11.e) * (x10 / this.v1);
                                    int i23 = this.i1;
                                    if (i23 == 13) {
                                        float g13 = abVar11.h - (g() / abVar11.e);
                                        float max3 = Math.max(0L, this.f - abVar11.f) / abVar11.e;
                                        if (abVar11 == this.w) {
                                            f11 = f39;
                                            max3 = org.telegram.ui.Cells.f1.y(f(), abVar11.e, abVar11.h, max3);
                                            if (!this.p1 && f11 < 0.0f) {
                                                f12 = 0.0f;
                                                if (abVar11.g <= abVar11.h - (f() / abVar11.e)) {
                                                    this.i1 = 15;
                                                }
                                                f13 = abVar11.g;
                                                i10 = Utilities.i(f13 + f11, g13, max3);
                                                abVar11.g = i10;
                                                if (Math.abs(f13 - i10) > 0.01f) {
                                                    this.p1 = true;
                                                }
                                                zaVar3 = this.a;
                                                if (zaVar3 != null) {
                                                    zaVar3.b0(abVar11.a, abVar11.f);
                                                }
                                                zaVar4 = this.a;
                                                if (zaVar4 != null) {
                                                    zaVar4.P(abVar11.g, abVar11.a);
                                                }
                                            }
                                        } else {
                                            f11 = f39;
                                        }
                                        f12 = 0.0f;
                                        f13 = abVar11.g;
                                        i10 = Utilities.i(f13 + f11, g13, max3);
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
                                            float g14 = (g() / abVar11.e) + abVar11.g;
                                            if (abVar11 == this.w) {
                                                min6 = org.telegram.ui.Cells.f1.h(f(), abVar11.e, abVar11.g, min6);
                                                if (!this.p1 && f11 > 0.0f) {
                                                    if (abVar11.h >= (f() / abVar11.e) + abVar11.g) {
                                                        this.i1 = 15;
                                                    }
                                                }
                                            }
                                            float f40 = abVar11.h;
                                            float i24 = Utilities.i(f40 + f11, min6, g14);
                                            abVar11.h = i24;
                                            if (Math.abs(f40 - i24) > 0.01f) {
                                                this.p1 = true;
                                            }
                                            za zaVar17 = this.a;
                                            if (zaVar17 != null) {
                                                zaVar17.V(abVar11.h, abVar11.a);
                                            }
                                        }
                                    }
                                    if (this.i1 == 15) {
                                        float min7 = f11 > f12 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - abVar11.f) + min) / abVar11.e) - abVar11.h, f11) : Math.max((Math.max(0L, this.f - abVar11.f) / abVar11.e) - abVar11.g, f11);
                                        float f41 = abVar11.g + min7;
                                        abVar11.g = f41;
                                        abVar11.h += min7;
                                        za zaVar18 = this.a;
                                        if (zaVar18 != null) {
                                            zaVar18.P(f41, abVar11.a);
                                            this.a.b0(abVar11.a, abVar11.f);
                                            this.a.V(abVar11.h, abVar11.a);
                                        }
                                        za zaVar19 = this.a;
                                        if (zaVar19 != null) {
                                            z15 = true;
                                            zaVar19.C(true);
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
                            float f42 = abVar2.e;
                            float f43 = (min / f42) * (x10 / this.v1);
                            if (i11 == 2) {
                                abVar2.g = Utilities.i(abVar2.g + f43, abVar2.h - (1000.0f / f42), 0.0f);
                                za zaVar20 = this.a;
                                if (zaVar20 != null) {
                                    zaVar20.w(false, this.h.g);
                                }
                                ab abVar12 = this.h;
                                float f44 = abVar12.h - abVar12.g;
                                float f45 = f();
                                ab abVar13 = this.h;
                                if (f44 > f45 / abVar13.e) {
                                    abVar13.h = org.telegram.ui.Cells.f1.h(f(), this.h.e, abVar13.g, 1.0f);
                                    za zaVar21 = this.a;
                                    if (zaVar21 != null) {
                                        zaVar21.W(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                abVar2.h = Utilities.i(abVar2.h + f43, 1.0f, (1000.0f / f42) + abVar2.g);
                                za zaVar22 = this.a;
                                if (zaVar22 != null) {
                                    zaVar22.W(this.h.h);
                                }
                                ab abVar14 = this.h;
                                float f46 = abVar14.h - abVar14.g;
                                float f47 = f();
                                ab abVar15 = this.h;
                                if (f46 > f47 / abVar15.e) {
                                    abVar15.g = org.telegram.ui.Cells.f1.y(f(), this.h.e, abVar15.h, 0.0f);
                                    za zaVar23 = this.a;
                                    if (zaVar23 != null) {
                                        zaVar23.w(false, this.h.g);
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
                                    zaVar24.w(false, f48);
                                    this.a.W(this.h.h);
                                }
                            }
                            float f49 = this.e;
                            ab abVar17 = this.h;
                            float f50 = abVar17.e;
                            float f51 = f49 / f50;
                            float f52 = abVar17.g;
                            if (f51 < f52 || f51 > abVar17.h) {
                                long j16 = (long) (f52 * f50);
                                this.e = j16;
                                za zaVar25 = this.a;
                                if (zaVar25 != null) {
                                    zaVar25.n(j16, false);
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
                        org.telegram.messenger.g0.r(t6Var);
                    }
                    int i25 = this.i1;
                    if ((i25 == 1 || i25 == 5 || i25 == 8) && (velocityTracker6 = this.q1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.r(t6Var);
                    al0Var.a();
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
                                    int A = (int) a1.g.A(this.h.e - min9, f54, f55, f53);
                                    this.s1 = true;
                                    this.t1 = i28;
                                    this.X0.c(i28, 0, -xVelocity, 0, i27, A, 0, 0);
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
                                    int A2 = (int) a1.g.A(this.h.e - min10, f57, f58, f56);
                                    this.s1 = true;
                                    this.t1 = i30;
                                    this.X0.c(i30, 0, -xVelocity2, 0, i29, A2, 0, 0);
                                    z10 = false;
                                }
                            } else if ((i26 == 5 || (i26 == 8 && !this.n1)) && this.Q && (velocityTracker2 = this.q1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity3) > org.telegram.messenger.g0.L(100.0f)) {
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i31 = (int) (((this.R / min11) * this.v1) + this.z1 + this.y1);
                                    ab abVar18 = this.h;
                                    if (abVar18 != null) {
                                        float f59 = abVar18.h;
                                        float f60 = abVar18.e;
                                        j12 = this.S;
                                        j13 = (long) ((f59 * f60) - 0);
                                        f10 = abVar18.g * f60;
                                    } else if (this.F) {
                                        float f61 = this.L;
                                        float f62 = this.I;
                                        j12 = this.S;
                                        j13 = (long) ((f61 * f62) - 0);
                                        f10 = this.K * f62;
                                    } else {
                                        j10 = -(this.S - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j11 = 0;
                                        this.s1 = z12;
                                        this.t1 = i31;
                                        float f63 = this.z1 + this.y1;
                                        float f64 = this.v1;
                                        this.X0.c(i31, 0, xVelocity3, 0, (int) (((j10 / min11) * f64) + f63), (int) a1.g.A(j11, min11, f64, f63), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f10 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.s1 = z12;
                                    this.t1 = i31;
                                    float f632 = this.z1 + this.y1;
                                    float f642 = this.v1;
                                    this.X0.c(i31, 0, xVelocity3, 0, (int) (((j10 / min11) * f642) + f632), (int) a1.g.A(j11, min11, f642, f632), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i26 == 9 || (i26 == 12 && !this.n1)) && this.H && (velocityTracker3 = this.q1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.q1.getXVelocity();
                                this.r1 = false;
                                if (Math.abs(xVelocity4) > org.telegram.messenger.g0.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i32 = (int) (((this.J / min12) * this.v1) + this.z1 + this.y1);
                                    ab abVar19 = this.h;
                                    if (abVar19 != null) {
                                        float f65 = abVar19.h;
                                        float f66 = abVar19.e;
                                        j14 = (long) ((abVar19.g * f66) - this.I);
                                        j15 = (long) ((f65 * f66) - 0);
                                    } else {
                                        j14 = -(this.I - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.s1 = true;
                                    this.t1 = i32;
                                    float f67 = this.z1 + this.y1;
                                    float f68 = this.v1;
                                    this.X0.c(i32, 0, xVelocity4, 0, (int) (((j14 / min12) * f68) + f67), (int) a1.g.A(j15, min12, f68, f67), 0, 0);
                                    z10 = false;
                                }
                            }
                            e3Var = this.e1;
                            if (e3Var != null) {
                                org.telegram.messenger.g0.r(e3Var);
                                this.e1 = null;
                            }
                            if (this.n1 || !z10 || (zaVar = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                zaVar.C(false);
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
                                            this.a.c(((ab) arrayList.get(this.l1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i33 == 2 && !this.Q) {
                                    this.Q = true;
                                    this.H = false;
                                    za zaVar26 = this.a;
                                    if (zaVar26 != null) {
                                        zaVar26.M(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 && !this.H) {
                                    this.Q = false;
                                    this.H = true;
                                    za zaVar27 = this.a;
                                    if (zaVar27 != null) {
                                        zaVar27.M(true);
                                    }
                                    invalidate();
                                } else if (i33 != 2 && this.Q) {
                                    this.Q = false;
                                    this.H = false;
                                    za zaVar28 = this.a;
                                    if (zaVar28 != null) {
                                        zaVar28.M(false);
                                    }
                                    invalidate();
                                } else if (i33 == 1 || !this.H) {
                                    long j17 = this.e;
                                    if (m(false, motionEvent.getX()) && Math.abs(this.e - j17) > 400) {
                                        this.d1 = j17;
                                        this.c1.e(true, 1.0f);
                                        invalidate();
                                    }
                                } else {
                                    this.Q = false;
                                    this.H = false;
                                    za zaVar29 = this.a;
                                    if (zaVar29 != null) {
                                        zaVar29.M(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i36 = (long) Utilities.i(((((motionEvent.getX() - this.z1) - this.y1) / this.v1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                ab abVar20 = this.h;
                                float f69 = abVar20.h - abVar20.g;
                                abVar20.g = (1.0f - f69) * (i36 / getBaseDuration());
                                ab abVar21 = this.h;
                                float f70 = abVar21.g;
                                abVar21.h = f69 + f70;
                                za zaVar30 = this.a;
                                if (zaVar30 != null) {
                                    zaVar30.w(true, f70);
                                    this.a.W(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.k1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    e3Var = this.e1;
                    if (e3Var != null) {
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
                this.b0 = new ya(this, this.P, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.V = false;
                this.h0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        a3.u uVar = new a3.u(19);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, uVar);
        ab abVar = arrayList.isEmpty() ? null : (ab) arrayList.get(0);
        this.w = abVar;
        if (abVar != null) {
            long j10 = abVar.f;
        }
    }

    public void setCollage(ArrayList<f7> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        db dbVar;
        int i3 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i3 >= arrayList2.size()) {
                break;
            }
            ab abVar = (ab) arrayList2.get(i3);
            if (abVar != null && (dbVar = abVar.c) != null) {
                dbVar.b();
            }
            i3++;
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
        this.i0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList3.add(null);
                f7 f7Var = arrayList.get(i11);
                if (f7Var.K) {
                    ab abVar2 = new ab(this);
                    abVar2.a = i11;
                    abVar2.b = false;
                    abVar2.d = f7Var.L.getAbsolutePath();
                    abVar2.e = f7Var.h0;
                    abVar2.f = f7Var.X;
                    abVar2.i = f7Var.P;
                    abVar2.g = f7Var.V;
                    abVar2.h = f7Var.W;
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

    public void setMaxCount(int i3) {
        this.c0 = i3;
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
    public void setProgress(long j10) {
        ab abVar = this.h;
        if (abVar != null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j11 = abVar.e;
                if (f10 <= (j11 * abVar.g) + 240.0f) {
                }
            }
        }
        if (this.O && !this.F && abVar == null) {
            if (j10 < this.e) {
                float f11 = j10;
                long j12 = this.S;
                if (f11 <= (j12 * this.T) + 240.0f) {
                }
            }
        }
        if (this.F && abVar == null) {
            if (j10 < this.e) {
                float f12 = j10;
                long j13 = this.I;
                if (f12 <= (j13 * this.T) + 240.0f) {
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
