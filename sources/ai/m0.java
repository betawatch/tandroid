package ai;

import a8.sa;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import c8.ja;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ae;
import org.telegram.ui.Components.ee;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wd;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.aj;
import org.telegram.ui.an;
import org.telegram.ui.sl;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m0 implements z1 {
    public static final er H0 = new er(0.3d, 0.0d, 0.2d, 1.0d);
    public final int[] A0;
    public final int[] B0;
    public final float[] C0;
    public sl D0;
    public float E0;
    public g2 F;
    public ValueAnimator F0;
    public b2 G;
    public final h0 G0;
    public i H;
    public int I;
    public String J;
    public boolean L;
    public int N;
    public boolean O;
    public float P;
    public float Q;
    public long R;
    public float T;
    public long U;
    public long V;
    public long W;
    public boolean X;
    public u5 Y;
    public k1 a;
    public jh.f a0;
    public long b;
    public float b0;
    public float c;
    public ValueAnimator c0;
    public boolean d;
    public int d0;
    public u5 e;
    public final a3.l e0;
    public final ae f;
    public boolean f0;
    public final ah.j g0;
    public final Context h;
    public float[] h0;
    public float[] i0;
    public int j0;
    public final a0 k0;
    public String l0;
    public final a0 m0;
    public final e6 n;
    public int n0;
    public long o0;
    public long p0;
    public long q0;
    public final sa r0;
    public p0 s;
    public final a0 s0;
    public final a0 t0;
    public final a0 u0;
    public LinearGradient v0;
    public j1 w;
    public boolean w0;
    public float x0;
    public final Matrix y0;
    public ValueAnimator z0;
    public int r = 0;
    public final r0 x = new r0();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public h K = i.c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public m0(Context context, ae aeVar) {
        new Rect();
        this.d0 = -6440822;
        this.e0 = new a3.l(11);
        this.g0 = new ah.j(this, 1);
        this.k0 = new a0(this, 8);
        this.m0 = new a0(this, 9);
        this.r0 = new sa(this, 1);
        this.s0 = new a0(this, 10);
        this.t0 = new a0(this, 11);
        this.u0 = new a0(this, 0);
        this.y0 = new Matrix();
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new float[2];
        this.G0 = new h0(this, 0);
        this.h = context;
        this.f = aeVar;
        this.n = aeVar.b.E4;
    }

    public static String l(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        String P0 = p21.P0(language);
        return P0 != null ? P0 : language;
    }

    public static int o(int i7, int i10, boolean z10) {
        int i11 = i7 | (-16777216);
        int i12 = i10 | (-16777216);
        int i13 = i11;
        for (int i14 = 1; i14 <= 20 && i0.a.g(i13, i12) < 4.5d; i14++) {
            i13 = i0.a.f(i14 * 0.04f, i11, z10 ? -1 : -16777216);
        }
        return i13;
    }

    public final void A() {
        Drawable backgroundImage;
        if (!this.f0) {
            this.f0 = true;
            ArrayList arrayList = s0.g;
            a3.l lVar = this.e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            st0 st0Var = this.f.b.U1;
            if ((st0Var != null) && (backgroundImage = st0Var.getBackgroundImage()) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect rect = new Rect(backgroundImage.getBounds());
                backgroundImage.setBounds(0, 0, 8, 8);
                backgroundImage.draw(canvas);
                backgroundImage.setBounds(rect);
                long j3 = 0;
                long j10 = 0;
                long j11 = 0;
                for (int i7 = 0; i7 < 8; i7++) {
                    for (int i10 = 0; i10 < 8; i10++) {
                        int pixel = createBitmap.getPixel(i10, i7);
                        j3 += Color.red(pixel);
                        j10 += Color.green(pixel);
                        j11 += Color.blue(pixel);
                    }
                }
                createBitmap.recycle();
                this.d0 = Color.rgb((int) (j3 / 64), (int) (j10 / 64), (int) (j11 / 64));
            }
        } catch (Throwable unused) {
        }
        int i11 = j6.d6;
        e6 e6Var = this.n;
        int w02 = j6.w0(i11, e6Var);
        boolean c10 = r0.c(w02);
        r0 r0Var = this.x;
        if (r0Var.h != c10) {
            r0Var.h = c10;
        }
        int i12 = j6.Pe;
        r0.h(j6.w0(i12, e6Var));
        r0Var.g(this.d0, j6.w0(i12, e6Var));
        int[] iArr = r0Var.B;
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (i2.e != i13 || i2.f != i14) {
            i2.e = i13;
            i2.f = i14;
            Arrays.fill(i2.g[0], (Object) null);
        }
        if (this.s != null) {
            int w03 = j6.w0(i12, e6Var) | (-16777216);
            p0 p0Var = this.s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i15 = iArr[4];
            p0Var.e1 = w03;
            p0Var.f1 = f10;
            p0Var.g1 = i15;
            if (!p0Var.p0) {
                p0Var.q0 = w03;
                p0Var.r0 = f10;
                p0Var.s0 = null;
                p0Var.invalidate();
            }
            this.s.setDayIconBase(j6.w0(j6.Nl, e6Var));
        }
        this.v0 = null;
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        p0 p0Var2 = this.s;
        if (p0Var2 != null) {
            int i16 = j6.Nl;
            int w04 = j6.w0(i16, e6Var);
            int w05 = j6.w0(i12, e6Var);
            p0Var2.d.setColor(w04);
            p0Var2.e.setColor(w05);
            p0Var2.f.setColor(w05);
            p0Var2.invalidate();
            p0 p0Var3 = this.s;
            int w06 = j6.w0(i16, e6Var);
            Paint paint = p0Var3.d0;
            Paint paint2 = p0Var3.c0;
            p0Var3.p0 = c10;
            p0Var3.q0 = c10 ? r0.e(-13665281) : p0Var3.e1;
            p0Var3.r0 = c10 ? r0.e(-7447553) : p0Var3.f1;
            p0Var3.s0 = null;
            p0Var3.b0.setColor(c10 ? 1714435648 : -1493172225);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            paint2.setColor(c10 ? 654311423 : 436207616);
            paint.setColor(16777216);
            paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33333334f), c10 ? 1711276032 : 855638016);
            p0Var3.e0.setColor(w06);
            p0Var3.invalidate();
            this.s.setSendIconColor(j6.w0(j6.Tf, e6Var));
        }
        g2 g2Var = this.F;
        if (g2Var != null) {
            g2Var.c(o(j6.w0(i12, e6Var), w02, c10), j6.w0(j6.Le, e6Var), c10);
        }
        j1 j1Var = this.w;
        if (j1Var != null) {
            j1Var.e();
        }
    }

    public final void B(boolean z10) {
        String r10;
        if (DictationAsr.F(new long[2])) {
            Locale locale = Locale.US;
            r10 = a8.p0.r(a8.p0.t(Math.round(r1[0] / 1048576.0d), " ", " / "), Math.max(1L, Math.round(r1[1] / 1048576.0d)), " MB");
        } else {
            r10 = null;
        }
        if (z10 || !TextUtils.equals(r10, this.l0)) {
            this.l0 = r10;
            ae aeVar = this.f;
            if (r10 == null) {
                aeVar.b.A1("Listening…", true);
                return;
            }
            ChatActivityEnterView chatActivityEnterView = aeVar.b;
            CharSequence charSequence = chatActivityEnterView.e;
            chatActivityEnterView.A1(TextUtils.concat("Downloading model…", r10), !(charSequence != null && charSequence.toString().startsWith("Downloading model…")));
        }
    }

    @Override // ai.z1
    public final void M(int i7, String str) {
        if (k()) {
            this.p0 = SystemClock.uptimeMillis();
            if (str == null) {
                str = "";
            }
            String s5 = s(str);
            int max = i7 < 0 ? -1 : Math.max(0, Math.min(s5.length(), i7 - (str.length() - s5.length())));
            this.L = true;
            this.F.e(this.I, max, s5);
            this.L = false;
        }
    }

    @Override // ai.z1
    public final void P(String str) {
        j1 j1Var = this.w;
        if (j1Var != null) {
            j1Var.setLanguage(str == null ? null : l(str));
        }
    }

    @Override // ai.z1
    public final void a(String str, String str2) {
        if (k()) {
            if (!TextUtils.isEmpty(str)) {
                String s5 = s(str);
                if (this.N <= 0 || !s5.isEmpty()) {
                    this.L = true;
                    this.F.e(this.I, -1, s5);
                    this.L = false;
                }
            }
            g2 g2Var = this.F;
            Editable editableText = g2Var.a.getEditableText();
            if (editableText != null) {
                g2Var.d(editableText, editableText.length());
            }
            ae aeVar = this.f;
            ChatActivityEnterView chatActivityEnterView = aeVar.b;
            ChatActivityEnterView chatActivityEnterView2 = aeVar.b;
            xe xeVar = chatActivityEnterView.F0;
            Context context = this.h;
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null && xeVar != null) {
                inputMethodManager.restartInput(xeVar);
            }
            this.G = null;
            if (str2 != null) {
                Toast.makeText(context, str2, 0).show();
            }
            if (q() <= 0 && (this.N <= 0 || chatActivityEnterView2.F0.getText().toString().trim().length() <= 0)) {
                f();
                z();
                this.w.setIsland(false);
                this.w.setSettings(false);
                this.w.setStopMode(false);
                w();
                this.r = 0;
                aeVar.b();
                return;
            }
            this.r = 3;
            aeVar.b();
            this.I = 0;
            this.s.setCancelShown(false);
            d();
            this.s.setHandOff(true);
            this.s.setRightMode(2);
            chatActivityEnterView2.A1(null, true);
            v(false);
            this.P = 0.0f;
            org.telegram.messenger.g0.i3(this.s0, 460L);
            this.w.setStopMode(false);
            this.w.d("Enhance", false);
            xe xeVar2 = chatActivityEnterView2.F0;
            xeVar2.requestFocus();
            xeVar2.setSelection(xeVar2.length());
            org.telegram.messenger.g0.i3(new a3.f(xeVar2, 6), 120L);
            org.telegram.messenger.g0.i3(new a0(this, 7), 90L);
        }
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, f10);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new b0(this, 1));
        this.c0.setDuration(j3);
        this.c0.setInterpolator(timeInterpolator);
        this.c0.start();
    }

    public final void c(h hVar) {
        if (this.r != 3) {
            return;
        }
        if (this.I > this.f.b.F0.length()) {
            this.I = 0;
        }
        if (this.J == null) {
            this.J = t();
        }
        String str = this.J;
        if (TextUtils.isEmpty(str.trim())) {
            return;
        }
        this.r = 4;
        this.b = 0L;
        this.V = SystemClock.uptimeMillis();
        this.K = hVar;
        this.w.d(hVar.e ? "Enhancing…" : a8.p0.s(new StringBuilder(), hVar.a, "…"), true);
        this.F.a();
        this.F.f(true);
        this.x.f();
        p0 p0Var = this.s;
        if (p0Var != null) {
            p0Var.R0 = SystemClock.uptimeMillis();
            p0Var.setVisibility(0);
            p0Var.y = true;
            p0Var.E = false;
            p0Var.R = false;
            p0Var.A0 = false;
            p0Var.L0 = false;
            p0Var.l0 = false;
            p0Var.l1 = false;
            p0Var.F.e(true, 1.0f);
            p0Var.G.e(true, 0.0f);
            p0Var.H.e(true, 0.0f);
            p0Var.I.e(true, 0.0f);
            p0Var.J.e(true, 1.0f);
            p0Var.O0.e(true, 0.0f);
            p0Var.b1 = 0L;
            p0Var.N0.e(true, 1.0f);
            p0Var.L = 3;
            p0Var.invalidate();
        }
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        this.H.a(hVar, str, new ab.g(2, this, hVar));
    }

    public final void d() {
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z0 = ofFloat;
        ofFloat.addUpdateListener(new b0(this, 0));
        this.z0.setDuration(220L);
        this.z0.setInterpolator(er.g);
        this.z0.start();
    }

    public final void e(long j3, long j10) {
        p0 p0Var = this.s;
        if (p0Var == null) {
            return;
        }
        if (p0Var.L == 3) {
            p0Var.b1 = SystemClock.uptimeMillis() + j3;
            p0Var.c1 = Math.max(1L, j10);
            p0Var.invalidate();
        }
        org.telegram.messenger.g0.i3(new a0(this, 6), j3 + j10 + 60);
    }

    public final void f() {
        org.telegram.messenger.g0.r(this.r0);
        p0 p0Var = this.s;
        if (p0Var != null) {
            p0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.s0);
        org.telegram.messenger.g0.r(this.k0);
        a0 a0Var = this.t0;
        org.telegram.messenger.g0.r(a0Var);
        a0 a0Var2 = this.u0;
        org.telegram.messenger.g0.r(a0Var2);
        p0 p0Var2 = this.s;
        p0Var2.L0 = true;
        p0Var2.R = false;
        SystemClock.uptimeMillis();
        if (p0Var2.J0 == null) {
            Drawable mutate = p0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            p0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        p0Var2.invalidate();
        d();
        v(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.i3(a0Var, 30L);
        org.telegram.messenger.g0.i3(a0Var2, 310L);
    }

    public final void g() {
        fh.g gVar;
        gh.a aVar;
        ae aeVar = this.f;
        ChatActivityEnterView chatActivityEnterView = aeVar.b;
        ChatActivityEnterView chatActivityEnterView2 = aeVar.b;
        st0 st0Var = chatActivityEnterView.U1;
        p0 p0Var = this.s;
        Context context = this.h;
        int i7 = 0;
        if (p0Var == null) {
            p0 p0Var2 = new p0(context, this);
            this.s = p0Var2;
            p0Var2.setBorderColorSource(new z(this, i7));
            this.s.setVisibility(8);
        }
        if (this.s.getParent() != st0Var) {
            org.telegram.messenger.g0.E2(this.s);
            st0Var.addView(this.s, ja.e(-1, -1, 80));
        } else {
            this.s.bringToFront();
        }
        p0 p0Var3 = this.s;
        wd wdVar = chatActivityEnterView2.R0;
        ee eeVar = chatActivityEnterView2.a1;
        p0Var3.b = wdVar;
        p0Var3.c = eeVar;
        int i10 = 4;
        p0Var3.setBubbleProvider(new cb.c(this, i10));
        if (this.w == null) {
            this.w = new j1(context, this.n, this);
        }
        if (this.w.getParent() != st0Var) {
            org.telegram.messenger.g0.E2(this.w);
            st0Var.addView(this.w, ja.e(-1, -1, 80));
        } else {
            this.w.bringToFront();
        }
        int i11 = ChatActivityEnterView.N6;
        jh.f r02 = chatActivityEnterView2.r0();
        jh.f fVar = this.a0;
        if (r02 != fVar) {
            if (fVar != null) {
                fVar.f = null;
            }
            this.a0 = r02;
            this.Y = r02 != null ? new u5(r02, 0L, 380L, new er(0.22d, 0.61d, 0.36d, 1.0d)) : null;
            this.e = r02 != null ? new u5(r02, 1L, 300L, er.g) : null;
        }
        jh.f fVar2 = this.a0;
        if (fVar2 != null) {
            int i12 = 2;
            fVar2.f = new z(this, i12);
            dh.c cVar = chatActivityEnterView2.D1;
            if (cVar != null && (gVar = fVar2.h) != null && (aVar = gVar.w) != null) {
                fh.g c10 = cVar.c(this.w, aVar, false);
                fh.g c11 = cVar.c(this.w, this.a0.h.w, false);
                j1 j1Var = this.w;
                fh.g c12 = cVar.c(j1Var, this.a0.h.w, false);
                j1Var.I = c10;
                j1Var.J = c11;
                j1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                p0 p0Var4 = this.s;
                if (p0Var4 != null) {
                    p0Var4.setStopGlass(cVar.c(p0Var4, new qb.a(i12), false));
                }
            }
        }
        xe xeVar = chatActivityEnterView2.F0;
        if (this.F == null) {
            g2 g2Var = new g2(xeVar);
            this.F = g2Var;
            g2Var.h = new z(this, i10);
            this.a = new k1(xeVar);
            xeVar.addTextChangedListener(this.g0);
        }
        if (this.H == null) {
            this.H = new i(chatActivityEnterView2.R);
        }
        A();
    }

    @Override // ai.z1
    public final void h(float f10) {
        this.P = f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f10 > 0.38f) {
            if (this.o0 == 0) {
                this.o0 = uptimeMillis;
            }
            if (uptimeMillis - this.o0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.o0 = 0L;
        }
        p0 p0Var = this.s;
        if (p0Var != null) {
            p0Var.setLevel(f10);
        }
    }

    public final void i() {
        ae aeVar = this.f;
        xe xeVar = aeVar.b.F0;
        if (xeVar != null) {
            xeVar.n1 = false;
        }
        b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.c();
        }
        this.G = null;
        i iVar = this.H;
        if (iVar != null) {
            iVar.b();
        }
        if (k()) {
            f();
        }
        j1 j1Var = this.w;
        if (j1Var != null) {
            j1Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        this.r = 0;
        v(false);
        k1 k1Var = this.a;
        if (k1Var != null) {
            k1Var.a();
        }
        ChatActivityEnterView chatActivityEnterView = aeVar.b;
        chatActivityEnterView.y1 = 0L;
        chatActivityEnterView.z1 = null;
        p0 p0Var = this.s;
        if (p0Var != null && p0Var.getRightMode() == 3) {
            this.s.e();
        }
        g2 g2Var = this.F;
        if (g2Var != null) {
            g2Var.f(false);
        }
        u(false);
        w();
        aeVar.b();
    }

    public final boolean j(RectF rectF) {
        fh.g gVar;
        jh.f fVar = this.a0;
        if (fVar == null || (gVar = fVar.h) == null) {
            return false;
        }
        Rect rect = gVar.R.m;
        if (rect.isEmpty()) {
            return false;
        }
        this.a0.getLocationInWindow(this.E);
        rectF.set(rect);
        rectF.offset(r3[0], r3[1]);
        return true;
    }

    public final boolean k() {
        int i7 = this.r;
        return i7 == 1 || i7 == 2;
    }

    public final boolean m(float[] fArr) {
        xe xeVar = this.f.b.F0;
        if (this.a0 == null || xeVar == null || xeVar.getLayout() == null) {
            return false;
        }
        this.a0.getLocationInWindow(this.A0);
        xeVar.getLocationInWindow(this.B0);
        fArr[0] = (xeVar.getTotalPaddingLeft() + (r1[0] - r3[0])) - xeVar.getScrollX();
        fArr[1] = (xeVar.getTotalPaddingTop() + (r1[1] - r3[1])) - xeVar.getScrollY();
        return true;
    }

    public final void n() {
        if (this.r != 1) {
            return;
        }
        org.telegram.messenger.g0.r(this.r0);
        this.r = 2;
        this.s.setStopIsland(false);
        this.s.setRightMode(1);
        this.s.setCancelShown(false);
        b2 b2Var = this.G;
        if (b2Var != null) {
            b2Var.u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0309, code lost:
    
        if (r4 != null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(String str) {
        float f10;
        float f11;
        boolean z10;
        Editable editable;
        long j3;
        fh.g gVar;
        boolean c10 = r0.c(j6.w0(j6.d6, this.n));
        boolean z11 = true;
        if (this.a != null && this.a0 != null) {
            float[] fArr = this.C0;
            if (m(fArr) && (gVar = this.a0.h) != null) {
                if (!gVar.R.m.isEmpty()) {
                    float centerY = (r9.centerY() - fArr[1]) * 0.9f;
                    float width = (((r9.width() * (-0.35f)) + r9.left) - fArr[0]) + centerY;
                    float width2 = (((r9.width() * 1.35f) + r9.left) - fArr[0]) + centerY;
                    k1 k1Var = this.a;
                    int e10 = r0.e(c10 ? -7358721 : -15363160);
                    Paint paint = k1Var.q;
                    EditText editText = k1Var.b;
                    int[] iArr = k1Var.A;
                    nu0 nu0Var = k1Var.c;
                    k1Var.a();
                    Layout layout = editText.getLayout();
                    if (layout != null && layout.getWidth() > 0 && layout.getHeight() > 0) {
                        try {
                            f10 = 4.0f;
                            f11 = 0.9f;
                            try {
                                k1Var.h = Bitmap.createBitmap(layout.getWidth() + org.telegram.messenger.g0.L(4.0f), layout.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(k1Var.h);
                                editText.getPaint().setColor(editText.getCurrentTextColor());
                                layout.draw(canvas);
                                k1Var.w = editText.getScrollY();
                                k1Var.x = Math.max(1, (editText.getHeight() - editText.getTotalPaddingTop()) - editText.getTotalPaddingBottom());
                                k1Var.k = k1Var.d(1200, k1Var.h, true);
                                editText.getLocationInWindow(iArr);
                                k1Var.y = (editText instanceof kt ? ((kt) editText).getOffsetY() : 0.0f) + ((editText.getTotalPaddingTop() + iArr[1]) - k1Var.w);
                                k1Var.f = width;
                                k1Var.g = width2;
                                if (k1Var.v != e10 || paint.getColorFilter() == null) {
                                    k1Var.v = e10;
                                    paint.setColorFilter(new PorterDuffColorFilter(k1Var.v, PorterDuff.Mode.SRC_IN));
                                }
                                nu0Var.a();
                                nu0Var.e(c10);
                                nu0Var.a = r0.j(c10);
                                nu0Var.Q = org.telegram.messenger.g0.L(10.0f);
                                z10 = true;
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                        }
                        this.F.f(false);
                        ae aeVar = this.f;
                        if (z10) {
                            e(0L, 240L);
                            xe xeVar = aeVar.b.F0;
                            Editable text = xeVar.getText();
                            if (text == null) {
                                return;
                            }
                            int min = Math.min(this.I, text.length());
                            this.L = true;
                            this.F.a();
                            text.replace(min, text.length(), str);
                            g2 g2Var = this.F;
                            int length = str.length() + min;
                            Editable editableText = g2Var.a.getEditableText();
                            if (editableText == null) {
                                editable = text;
                                j3 = 45;
                            } else {
                                long uptimeMillis = SystemClock.uptimeMillis();
                                int i7 = 0;
                                while (min < length) {
                                    while (min < length && Character.isWhitespace(editableText.charAt(min))) {
                                        min++;
                                    }
                                    if (min >= length) {
                                        break;
                                    }
                                    int i10 = min;
                                    while (i10 < length && !Character.isWhitespace(editableText.charAt(i10))) {
                                        i10++;
                                    }
                                    long j10 = (i7 * 45) + uptimeMillis;
                                    Editable editable2 = editableText;
                                    d2 d2Var = new d2(j10 + 260, g2Var.b, g2Var.c);
                                    d2Var.b = j10;
                                    editable2.setSpan(d2Var, min, i10, 33);
                                    i7++;
                                    editableText = editable2;
                                    min = i10;
                                    text = text;
                                    length = length;
                                    z11 = z11;
                                }
                                editable = text;
                                j3 = 45;
                                g2Var.g();
                            }
                            this.W = (j3 * str.split("\\s+").length) + SystemClock.uptimeMillis() + 375;
                            jh.f fVar = this.a0;
                            if (fVar != null) {
                                fVar.invalidate();
                            }
                            xeVar.setSelection(editable.length());
                            this.L = false;
                            return;
                        }
                        xe xeVar2 = aeVar.b.F0;
                        Editable text2 = xeVar2.getText();
                        if (text2 == null) {
                            return;
                        }
                        Layout layout2 = xeVar2.getLayout();
                        int lineCount = layout2 != null ? layout2.getLineCount() : 1;
                        int width3 = (xeVar2.getWidth() - xeVar2.getTotalPaddingLeft()) - xeVar2.getTotalPaddingRight();
                        int lineCount2 = width3 <= 0 ? 1 : StaticLayout.Builder.obtain(str, 0, str.length(), xeVar2.getPaint(), width3).setLineSpacing(xeVar2.getLineSpacingExtra(), xeVar2.getLineSpacingMultiplier()).setIncludePad(xeVar2.getIncludeFontPadding()).build().getLineCount();
                        er erVar = k1.E;
                        long max = Math.max(800L, Math.min(1200L, (Math.max(lineCount, lineCount2) * 70) + 700));
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        er erVar2 = k1.E;
                        ChatActivityEnterView chatActivityEnterView = aeVar.b;
                        chatActivityEnterView.y1 = uptimeMillis2 + max;
                        chatActivityEnterView.z1 = erVar2;
                        int min2 = Math.min(this.I, text2.length());
                        this.L = true;
                        this.F.a();
                        BaseInputConnection.removeComposingSpans(text2);
                        text2.replace(min2, text2.length(), str);
                        xeVar2.setSelection(text2.length());
                        this.L = false;
                        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.restartInput(xeVar2);
                        }
                        k1 k1Var2 = this.a;
                        k1Var2.a = max;
                        EditText editText2 = k1Var2.b;
                        Layout layout3 = editText2.getLayout();
                        k1Var2.l = 0;
                        if (layout3 != null && layout3.getWidth() > 0 && layout3.getHeight() > 0) {
                            Bitmap bitmap = null;
                            try {
                                bitmap = Bitmap.createBitmap(layout3.getWidth() + org.telegram.messenger.g0.L(f10), layout3.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmap);
                                editText2.getPaint().setColor(editText2.getCurrentTextColor());
                                layout3.draw(canvas2);
                                k1Var2.l = k1Var2.d(1100, bitmap, false);
                            } catch (Throwable unused3) {
                            }
                            bitmap.recycle();
                        }
                        k1Var2.n = 0;
                        k1Var2.m = 0;
                        k1Var2.e = SystemClock.uptimeMillis();
                        k1Var2.D = false;
                        k1Var2.d = true;
                        editText2.invalidate();
                        this.b = uptimeMillis2 + ((long) (max * 0.87f));
                        long min3 = Math.min(this.a.e(r0.w * f11), max);
                        k1 k1Var3 = this.a;
                        this.a.C = new e0(this, min3, Math.min(k1Var3.e(((k1Var3.w + k1Var3.x) * f11) + (k1Var3.b.getLayout() != null ? r4.getWidth() : 0.0f)) + 60, max), 0);
                        jh.f fVar2 = this.a0;
                        if (fVar2 != null) {
                            fVar2.invalidate();
                        }
                        org.telegram.messenger.g0.i3(new a0(this, 3), max + 32);
                        return;
                    }
                }
            }
        }
        f10 = 4.0f;
        f11 = 0.9f;
        z10 = false;
        this.F.f(false);
        ae aeVar2 = this.f;
        if (z10) {
        }
    }

    public final int q() {
        Editable text = this.f.b.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    @Override // ai.z1
    public final void r(String str) {
        M(-1, str);
    }

    public final String s(String str) {
        this.M = str;
        if (this.N <= 0) {
            return str;
        }
        int length = str.length();
        int i7 = this.N;
        String substring = length > i7 ? str.substring(i7) : "";
        int i10 = 0;
        while (i10 < substring.length() && Character.isWhitespace(substring.charAt(i10))) {
            i10++;
        }
        String substring2 = substring.substring(i10);
        if (substring2.isEmpty()) {
            return "";
        }
        return (this.O ? " " : "").concat(substring2);
    }

    public final String t() {
        Editable text = this.f.b.F0.getText();
        return text == null ? "" : text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }

    public final void u(boolean z10) {
        xe xeVar = this.f.b.F0;
        if (xeVar == null || !z10) {
            return;
        }
        xeVar.invalidate();
    }

    public final void v(boolean z10) {
        if (z10) {
            this.b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void w() {
        sl slVar;
        an anVar = this.f.b.x3;
        aj ajVar = anVar != null ? anVar.A0 : null;
        if (ajVar == null || (slVar = this.D0) == null) {
            return;
        }
        if (slVar != ajVar) {
            h0 h0Var = this.G0;
            if (slVar != null) {
                slVar.q0(h0Var);
            }
            this.D0 = ajVar;
            ajVar.i(h0Var);
        }
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E0, 0.0f);
        this.F0 = ofFloat;
        ofFloat.addUpdateListener(new b0(this, 2));
        this.F0.addListener(new i0(this, 0));
        this.F0.setDuration(300L);
        this.F0.setInterpolator(er.h);
        this.F0.start();
    }

    public final void x(float f10, float f11) {
        p0 p0Var = this.s;
        if (p0Var != null && (p0Var.a1 != f10 || p0Var.Z0 != f11)) {
            p0Var.a1 = f10;
            p0Var.Z0 = f11;
            p0Var.invalidate();
        }
        j1 j1Var = this.w;
        if (j1Var != null) {
            if (j1Var.l0 == f10 && j1Var.k0 == f11) {
                return;
            }
            j1Var.l0 = f10;
            j1Var.k0 = f11;
            j1Var.invalidate();
        }
    }

    public final ArrayList y() {
        g();
        ArrayList arrayList = new ArrayList();
        arrayList.add(i.c);
        arrayList.addAll(this.H.d());
        return arrayList;
    }

    public final void z() {
        Editable text = this.f.b.F0.getText();
        if (text == null || text.length() <= 0 || text.length() != this.I || !Character.isWhitespace(text.charAt(text.length() - 1))) {
            return;
        }
        this.L = true;
        text.delete(text.length() - 1, text.length());
        this.L = false;
    }
}
