// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class j47 extends Dialog implements gk7 {
    public boolean A0;
    public gb2 B0;
    public tgb C0;
    public Paint D0;
    public float E;
    public final y37 F;
    public final e47 G;
    public final y37 H;
    public long I;
    public tl J;
    public final f47 K;
    public final hk2 L;
    public final s17 M;
    public final ArrayList N;
    public int O;
    public final vf6 P;
    public gb2 Q;
    public int R;
    public ex1 S;
    public final Paint T;
    public f U;
    public vv1 V;
    public ky1 W;
    public a47 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final z37 a0;
    public final wjb b;
    public boolean b0;
    public final int c;
    public float c0;
    public io5 d;
    public FrameLayout d0;
    public Bitmap e;
    public b47 e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public boolean h0;
    public final pla i0;
    public final hx4 j0;
    public final kl0 k0;
    public RectF l0;
    public xf4 m0;
    public Matrix n;
    public qx n0;
    public final int[] o0;
    public boolean p0;
    public boolean q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final float[] s0;
    public boolean t0;
    public boolean u0;
    public gb2 v0;
    public boolean w;
    public float w0;
    public boolean x;
    public float x0;
    public boolean y;
    public final Rect y0;
    public ValueAnimator z0;

    public j47(Context context, wjb wjbVar) {
        super(context, R.style.TransparentDialog);
        int i = y6c.t0;
        this.c = i;
        this.d = io5.e;
        this.N = new ArrayList();
        this.P = new vf6();
        final byte b = 1;
        this.T = new Paint(1);
        this.o0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new float[4];
        final byte b2 = 0;
        this.u0 = false;
        this.y0 = new Rect();
        this.a = context;
        this.b = wjbVar;
        gl.S(getWindow());
        y37 y37Var = new y37(this, context, b);
        this.F = y37Var;
        this.i0 = pla.d(1, y37Var, y37Var);
        y37Var.setOnClickListener(new View.OnClickListener(this) { // from class: x37
            public final /* synthetic */ j47 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                j47 j47Var = this.b;
                switch (b3) {
                    case 0:
                        j47Var.onBackPressed();
                        break;
                    default:
                        j47Var.onBackPressed();
                        break;
                }
            }
        });
        y37Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new x62(this, b));
        hx4 hx4Var = new hx4();
        this.j0 = hx4Var;
        kl0 kl0Var = new kl0(hx4Var, hx4Var, hx4Var);
        this.k0 = kl0Var;
        kl0Var.h = new zec(y37Var);
        kl0Var.i = y37Var;
        e47 e47Var = new e47(this, context, wjbVar);
        this.G = e47Var;
        e47Var.setClipToPadding(false);
        y37Var.addView(e47Var, nme.e(-1, -1, kk7.D1));
        s34 s34Var = new s34((Object) this, (byte) 17);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(y37Var, s34Var);
        f47 f47Var = new f47(this, context, wjbVar);
        this.K = f47Var;
        f47Var.setOnClickListener(new View.OnClickListener(this) { // from class: x37
            public final /* synthetic */ j47 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                j47 j47Var = this.b;
                switch (b3) {
                    case 0:
                        j47Var.onBackPressed();
                        break;
                    default:
                        j47Var.onBackPressed();
                        break;
                }
            }
        });
        f47Var.setOnItemClickListener(new bf4(this, (byte) 12));
        f47Var.setOnScrollListener(new ao2(this, (byte) 26));
        f47Var.setItemAnimator(new h47(null, f47Var, wjbVar));
        s17 s17Var = new s17(this, (byte) 2);
        this.M = s17Var;
        byte b3 = 10;
        s17Var.O = new nq1(this, b3);
        f47Var.setLayoutManager(s17Var);
        f47Var.i(new oq1(b3));
        hk2 hk2Var = new hk2(this, context, wjbVar, b);
        this.L = hk2Var;
        f47Var.setAdapter(hk2Var);
        f47Var.setVerticalScrollBarEnabled(false);
        f47Var.setOverScrollMode(2);
        e47Var.addView(f47Var, nme.c(-2.0f, -1));
        y37 y37Var2 = new y37(this, context, b2);
        this.H = y37Var2;
        y37Var.addView(y37Var2, nme.c(-1.0f, -1));
        this.a0 = new z37(this, y37Var2, i);
    }

    public final void a(d dVar) {
        i43 i43Var;
        if (this.e0 != null || dVar == null) {
            return;
        }
        int i = this.c;
        na7.q1(i).C0();
        FrameLayout frameLayout = new FrameLayout(this.a);
        this.d0 = frameLayout;
        frameLayout.setClipChildren(false);
        this.d0.setClipToPadding(false);
        this.d0.setPadding(0, 0, 0, gl.L(24.0f));
        b47 b47Var = new b47(5, this.c, this.b, getContext(), null);
        this.e0 = b47Var;
        b47Var.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setPadding(gl.L(4.0f), gl.L(22.0f), gl.L(4.0f), gl.L(22.0f));
        this.e0.setDelegate(new c47(this, dVar));
        this.e0.setTop(false);
        this.e0.setClipChildren(false);
        this.e0.setClipToPadding(false);
        this.e0.setVisibility(0);
        this.e0.setHint(k96.M0(2131754440, null));
        this.e0.setBubbleOffset(gl.L(-25.0f));
        this.e0.setMiniBubblesOffset(gl.L(2.0f));
        this.G.addView(this.d0, nme.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        this.d0.addView(this.e0, nme.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        this.e0.setScaleY(0.4f);
        this.e0.setScaleX(0.4f);
        this.e0.setAlpha(0.0f);
        TLRPC.messages_AvailableEffects messages_availableeffects = na7.q1(i).V4;
        if (messages_availableeffects == null || messages_availableeffects.effects.isEmpty()) {
            kk7.f(i).b(this, kk7.v3);
        } else {
            u();
        }
        b47 b47Var2 = this.e0;
        if (b47Var2 != null && !b47Var2.h1) {
            b47Var2.h1 = true;
            b47Var2.i1 = true;
            m43 m43Var = b47Var2.y0;
            if (m43Var != null && (i43Var = m43Var.m) != null && !i43Var.M1) {
                i43Var.M1 = true;
                i43Var.N1 = true;
                rw9 rw9Var = i43Var.i0;
                if (rw9Var != null) {
                    rw9Var.invalidate();
                }
                hw9 hw9Var = i43Var.j0;
                if (hw9Var != null) {
                    hw9Var.invalidate();
                }
            }
        }
        new mv5(this.F, false, new hj3(this, (byte) 29));
    }

    public final void b(int[] iArr) {
        qx qxVar = this.n0;
        if (qxVar == null) {
            this.W.getLocationOnScreen(iArr);
            iArr[0] = b00.z(6.0f, this.W.getWidth() - this.W.l(), iArr[0]);
            return;
        }
        int[] iArr2 = (int[]) qxVar.c;
        yic yicVar = (yic) qxVar.d;
        if (!qxVar.b || (!yicVar.q3 && yicVar.isAttachedToWindow() && !yicVar.l0.isEmpty())) {
            int[] iArr3 = yicVar.r3;
            RectF rectF = yicVar.l0;
            yicVar.getLocationOnScreen(iArr3);
            iArr2[0] = (int) (rectF.centerX() + iArr3[0]);
            iArr2[1] = (int) (rectF.centerY() + iArr3[1]);
            qxVar.b = true;
        }
        int i = iArr2[0];
        int[] iArr4 = this.o0;
        iArr4[0] = i;
        iArr4[1] = iArr2[1];
        iArr[0] = gl.L(22.0f) + ((i - this.W.l()) - gl.L(6.0f));
        iArr[1] = gl.L(22.0f) + (iArr4[1] - this.W.getHeight());
    }

    public final void c(Runnable runnable, boolean z) {
        b47 b47Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z2 = z && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout);
        if (z2) {
            m8.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        if (!z && (b47Var = this.e0) != null && this.f0) {
            b47Var.b();
            if (this.e0.getReactionsWindow() != null && this.e0.getReactionsWindow().a != null) {
                this.e0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.e0.animate().alpha(0.01f).translationY(-gl.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.s = !z;
        this.K.invalidate();
        this.x = true;
        this.y = true;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z ? 1.0f : 0.0f);
        this.z0 = ofFloat;
        ofFloat.addUpdateListener(new d20((byte) 6, this, z2));
        this.z0.addListener(new w5(this, z, z2, runnable));
        this.z0.setInterpolator(s33.h);
        this.z0.setDuration(350L);
        this.z0.start();
    }

    public final void d(k27 k27Var) {
        f27 j = j(k27Var);
        if (j == null) {
            e(k27Var);
            return;
        }
        j.a();
        ArrayList arrayList = j.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            e((k27) obj);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i != kk7.v3 || (messages_availableeffects = na7.q1(this.c).V4) == null || messages_availableeffects.effects.isEmpty()) {
            return;
        }
        u();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        a47 a47Var = this.X;
        if (a47Var != null) {
            a47Var.invalidate();
        }
        ky1 ky1Var = this.W;
        if (ky1Var != null) {
            ky1Var.invalidate();
        }
        c(new u37(this, (byte) 2), false);
        this.F.invalidate();
        kk7.f(this.c).n(this, kk7.v3);
    }

    public final void e(k27 k27Var) {
        gb2 gb2Var;
        f47 f47Var = this.K;
        if (f47Var == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= f47Var.getChildCount()) {
                gb2Var = null;
                break;
            }
            View childAt = f47Var.getChildAt(i2);
            if (childAt instanceof gb2) {
                gb2Var = (gb2) childAt;
                if (gb2Var.getMessageObject() == k27Var) {
                    break;
                }
            }
            i2++;
        }
        gb2 gb2Var2 = gb2Var;
        int i3 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) == k27Var) {
                i3 = (arrayList.size() - 1) - i;
            }
            i++;
        }
        if (gb2Var2 == null) {
            f47Var.getAdapter().g(i3);
            return;
        }
        k27Var.M1 = true;
        gb2Var2.z3(k27Var, gb2Var2.getCurrentMessagesGroup(), gb2Var2.K2(), gb2Var2.L2(), gb2Var2.C2(), false);
        f47Var.getAdapter().g(i3);
    }

    public final void f(boolean z) {
        this.r = z;
        dismiss();
    }

    public final void g() {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        pla.f(false);
        pla plaVar = this.i0;
        if (plaVar != null) {
            plaVar.b(this.F);
        }
        super.dismiss();
        kk7.f(this.c).n(this, kk7.v3);
    }

    public final void h(float f, float f2, float f3, float f4, Canvas canvas) {
        if (this.C0 == null || this.D0 == null) {
            return;
        }
        float f5 = (f + f3) / 2.0f;
        float f6 = (f2 + f4) / 2.0f;
        float L = gl.L(28.0f) + this.C0.c;
        float L2 = gl.L(32.0f);
        RectF rectF = gl.P;
        float f7 = L / 2.0f;
        float f8 = f5 - f7;
        float f9 = L2 / 2.0f;
        rectF.set(f8, f6 - f9, f5 + f7, f6 + f9);
        canvas.save();
        canvas.drawRoundRect(rectF, f9, f9, this.D0);
        this.C0.c(f8 + gl.L(14.0f), f6, 1.0f, -1, canvas);
        canvas.restore();
    }

    public final long i() {
        k27 messageObject;
        if (this.q0 || this.e0 == null) {
            return 0L;
        }
        if (this.l0 != null) {
            this.q0 = true;
            return this.I;
        }
        gb2 gb2Var = this.Q;
        if (gb2Var == null || (messageObject = gb2Var.getMessageObject()) == null) {
            return 0L;
        }
        TLRPC.Message message = messageObject.k;
        if ((message.flags2 & 4) == 0) {
            return 0L;
        }
        this.q0 = true;
        return message.effect;
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.u0;
    }

    public final f27 j(k27 k27Var) {
        if (k27Var.c1() == 0) {
            return null;
        }
        f27 f27Var = (f27) this.P.f(k27Var.c1());
        if (f27Var == null || (f27Var.d.size() > 1 && f27Var.d(k27Var) != null)) {
            return f27Var;
        }
        return null;
    }

    public final /* synthetic */ void k() {
        super.dismiss();
    }

    public final /* synthetic */ void l() {
        super.dismiss();
    }

    public final void n(boolean z) {
        s17 s17Var;
        f47 f47Var = this.K;
        if (f47Var == null || f47Var.getAdapter() == null || (s17Var = this.M) == null) {
            return;
        }
        int b = f47Var.getAdapter().b();
        s17Var.h1(z ? b > 10 ? b % 10 : 0 : b - 1, gl.L(12.0f), z);
        this.A0 = z;
    }

    public final void o(boolean z, float f) {
        qx qxVar = this.n0;
        if (qxVar != null) {
            yic yicVar = (yic) qxVar.d;
            yicVar.q3 = z;
            yicVar.invalidate();
        } else {
            ky1 ky1Var = this.W;
            if (ky1Var != null) {
                if (z) {
                    f = 0.0f;
                }
                ky1Var.setAlpha(f);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.b0) {
            gl.t1(getCurrentFocus());
            this.b0 = false;
            return;
        }
        b47 b47Var = this.e0;
        if (b47Var == null || b47Var.getReactionsWindow() == null) {
            this.q0 = true;
            super.onBackPressed();
        } else {
            if (this.e0.getReactionsWindow().C) {
                return;
            }
            this.e0.getReactionsWindow().d();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        y37 y37Var = this.F;
        setContentView(y37Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = kk7.D1;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = i | (-1945959040);
        window.setAttributes(attributes);
        y37Var.setSystemUiVisibility(256);
        gl.j3(y37Var, !bkb.I.o());
    }

    public final void p(long j) {
        TLRPC.TL_availableEffect X0;
        this.I = j;
        boolean i = this.P.i();
        ArrayList arrayList = this.N;
        int size = (i || arrayList.size() < 10) ? 0 : arrayList.size() % 10;
        k27 k27Var = (size < 0 || size >= arrayList.size()) ? null : (k27) arrayList.get(size);
        if (k27Var != null) {
            TLRPC.Message message = k27Var.k;
            message.flags2 |= 4;
            message.effect = j;
        }
        if (this.e0 == null || (X0 = na7.q1(this.c).X0(j)) == null) {
            return;
        }
        this.e0.setSelectedReactionAnimated(h19.e(X0));
    }

    public final void q(cs5 cs5Var) {
        int i = bkb.D8;
        wjb wjbVar = this.b;
        cs5Var.U(bkb.p1(0.06f, bkb.v0(i, wjbVar)));
        cs5Var.R(this.k0, nod.k(wjbVar), false);
        ViewGroup viewGroup = cs5Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, nme.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        vf6 vf6Var;
        gb2 gb2Var;
        int i;
        int i2;
        gb2 gb2Var2;
        ArrayList arrayList2;
        f27 f27Var;
        int i3 = 0;
        while (true) {
            int size = arrayList.size();
            vf6Var = this.P;
            if (i3 >= size) {
                break;
            }
            k27 k27Var = (k27) arrayList.get(i3);
            if (k27Var.z2()) {
                f27 f27Var2 = (f27) vf6Var.f(k27Var.d1());
                if (f27Var2 == null) {
                    f27Var2 = new f27();
                    f27Var2.n = false;
                    long c1 = k27Var.c1();
                    f27Var2.a = c1;
                    vf6Var.k(f27Var2, c1);
                }
                ArrayList arrayList3 = f27Var2.d;
                if (f27Var2.d(k27Var) == null) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList3.size()) {
                            arrayList3.add(k27Var);
                            break;
                        } else if (((k27) arrayList3.get(i4)).e1() != k27Var.e1()) {
                            i4++;
                        }
                    }
                }
            } else if (k27Var.d1() != 0) {
                k27Var.k.grouped_id = 0L;
                k27Var.e = 0L;
            }
            i3++;
        }
        for (int i5 = 0; i5 < vf6Var.m(); i5++) {
            ((f27) vf6Var.n(i5)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i6 = 0;
        while (i6 < arrayList4.size()) {
            int i7 = this.O;
            k27 k27Var2 = (k27) arrayList4.get(i6);
            if (getContext() == null) {
                i = i6;
                i2 = 0;
            } else {
                gb2 gb2Var3 = this.B0;
                if (gb2Var3 == null) {
                    gb2 gb2Var4 = new gb2(getContext(), this.c, true, null, this.b);
                    this.B0 = gb2Var4;
                    gb2Var = gb2Var4;
                } else {
                    gb2Var = gb2Var3;
                }
                gb2Var.f6 = false;
                gb2Var.h6 = false;
                gb2Var.i6 = false;
                gb2Var.j6 = false;
                gb2Var.k6 = false;
                f27 f27Var3 = (f27) vf6Var.f(k27Var2.c1());
                ml mlVar = gb2Var.U0;
                mlVar.p0 = true;
                ImageReceiver imageReceiver = gb2Var.A7;
                imageReceiver.p0 = true;
                ImageReceiver imageReceiver2 = gb2Var.T7;
                imageReceiver2.p0 = true;
                ImageReceiver imageReceiver3 = gb2Var.F7;
                imageReceiver3.p0 = true;
                if (f27Var3 != null) {
                    ArrayList arrayList5 = f27Var3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != f27Var3.f.size()) {
                            f27Var3.a();
                        }
                        gb2Var.td = 0;
                        int i8 = 0;
                        i2 = 0;
                        while (i8 < arrayList5.size()) {
                            k27 k27Var3 = (k27) arrayList5.get(i8);
                            c27 d = f27Var3.d(k27Var3);
                            if (d == null || (d.l & 4) == 0) {
                                f27 f27Var4 = f27Var3;
                                gb2Var2 = gb2Var;
                                arrayList2 = arrayList5;
                                f27Var = f27Var4;
                            } else {
                                gb2 gb2Var5 = gb2Var;
                                arrayList2 = arrayList5;
                                f27Var = f27Var3;
                                gb2Var5.y3(k27Var3, f27Var, false, false, false, false);
                                gb2Var2 = gb2Var5;
                                i2 += gb2Var2.b7;
                            }
                            i8++;
                            f27 f27Var5 = f27Var;
                            arrayList5 = arrayList2;
                            gb2Var = gb2Var2;
                            f27Var3 = f27Var5;
                        }
                        i = i6;
                    }
                }
                i = i6;
                gb2Var.y3(k27Var2, f27Var3, false, false, false, false);
                mlVar.p0 = false;
                imageReceiver.p0 = false;
                imageReceiver2.p0 = false;
                imageReceiver3.p0 = false;
                gb2Var.S3();
                i2 = gb2Var.b7;
            }
            this.O = Math.max(i7, i2);
            i6 = i + 1;
        }
        f47 f47Var = this.K;
        f47Var.getAdapter().f();
        int b = f47Var.getAdapter().b();
        this.M.h1(b > 10 ? b % 10 : 0, gl.L(12.0f), true);
    }

    public final ky1 s(ky1 ky1Var, boolean z, View.OnClickListener onClickListener) {
        this.W = ky1Var;
        a47 a47Var = new a47(this, getContext(), ky1Var.d, this.b, ky1Var, z);
        this.X = a47Var;
        a47Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        ky1 ky1Var2 = this.W;
        a47 a47Var2 = this.X;
        a47Var2.H = ky1Var2.H;
        a47Var2.s0 = ky1Var2.s0;
        a47Var2.f0.t(ky1Var2.f0.i, false, true);
        a47Var2.g0 = ky1Var2.g0;
        a47Var2.setEmoji(ky1Var2.n.f[0]);
        a47Var2.i(ky1Var2.x, ky1Var2.w, true);
        a47Var2.S.e(true, ky1Var2.S.c);
        a47Var2.F.e(true, ky1Var2.F.c);
        int i = ky1Var2.L;
        int i2 = ky1Var2.M;
        a47Var2.L = i;
        a47Var2.M = i2;
        float f = ky1Var2.P;
        float f2 = ky1Var2.Q;
        a47Var2.P = f;
        a47Var2.Q = f2;
        this.X.S.e(true, ky1Var.S.c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(ky1Var.getWidth(), ky1Var.getHeight()));
        ky1 ky1Var3 = this.W;
        ky1Var.getHeight();
        this.Y = ky1Var3.m();
        b(this.r0);
        return this.X;
    }

    @Override // android.app.Dialog
    public final void show() {
        if (gl.K1(getContext())) {
            pla.f(true);
            super.show();
            final float alpha = this.W.getAlpha();
            o(true, alpha);
            tq9.d(new i8c() { // from class: w37
                @Override // i8c
                public final void a(Object obj, Object obj2) {
                    j47 j47Var = j47.this;
                    j47Var.o(false, alpha);
                    j47Var.e = (Bitmap) obj;
                    Paint paint = new Paint(1);
                    j47Var.h = paint;
                    Bitmap bitmap = j47Var.e;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    j47Var.f = bitmapShader;
                    paint.setShader(bitmapShader);
                    j47Var.n = new Matrix();
                    hx4 hx4Var = j47Var.j0;
                    hx4Var.a((Bitmap) obj2);
                    tk0.c(hx4Var, j47Var.F);
                    ViewGroup viewGroup = j47Var.Z;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                    }
                }
            });
            y37 y37Var = this.H;
            if (y37Var != null) {
                y37Var.bringToFront();
            }
            c(null, true);
        }
    }

    public final void t(long j) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.C0 = j > 0 ? new tgb(jva.a1(false, k96.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, gl.o()) : null;
        if (this.D0 == null) {
            Paint paint = new Paint(1);
            this.D0 = paint;
            paint.setColor(TLObject.FLAG_30);
        }
        this.K.invalidate();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i >= arrayList.size()) {
                this.L.f();
                return;
            }
            k27 k27Var = (k27) arrayList.get(i);
            if (k27Var != null && (message = k27Var.k) != null && (messageMedia = message.media) != null) {
                messageMedia.spoiler = j > 0;
            }
            i++;
        }
    }

    public final void u() {
        if (this.f0) {
            return;
        }
        this.g0 = false;
        this.f0 = true;
        this.e0.m(null, null, true);
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(s33.h).start();
        this.e0.p(false);
    }

    public void m(long j) {
    }
}
