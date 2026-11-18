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
import android.util.Log;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import c8.ma;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.y21;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.tl;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n0 implements a2 {
    public static final lr I0 = new lr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public h2 F;
    public float F0;
    public c2 G;
    public ValueAnimator G0;
    public h H;
    public final i0 H0;
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
    public c6 Y;
    public l1 a;
    public jh.f a0;
    public long b;
    public float b0;
    public float c;
    public ValueAnimator c0;
    public boolean d;
    public int d0;
    public c6 e;
    public final a3.l e0;
    public final qf f;
    public boolean f0;
    public final ah.j g0;
    public final Context h;
    public float[] h0;
    public float[] i0;
    public int j0;
    public final b0 k0;
    public String l0;
    public final b0 m0;
    public final i6 n;
    public int n0;
    public boolean o0;
    public long p0;
    public long q0;
    public long r0;
    public q0 s;
    public final sa s0;
    public final b0 t0;
    public final b0 u0;
    public final b0 v0;
    public k1 w;
    public LinearGradient w0;
    public boolean x0;
    public float y0;
    public final Matrix z0;
    public int r = 0;
    public final s0 x = new s0();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public g K = h.c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public n0(Context context, qf qfVar) {
        new Rect();
        this.d0 = -6440822;
        this.e0 = new a3.l(11);
        this.g0 = new ah.j(this, 1);
        this.k0 = new b0(this, 8);
        this.m0 = new b0(this, 9);
        this.s0 = new sa(this, 1);
        this.t0 = new b0(this, 10);
        this.u0 = new b0(this, 11);
        this.v0 = new b0(this, 0);
        this.z0 = new Matrix();
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new float[2];
        this.H0 = new i0(this, 0);
        this.h = context;
        this.f = qfVar;
        this.n = qfVar.a.K4;
    }

    public static void E(TLRPC.TL_error tL_error) {
        lc Y = lc.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null && ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            Y.I(R.raw.star_premium_2, gd.M0(2131754989, null), org.telegram.messenger.g0.W2(gd.M0(2131754990, null))).j();
        } else if (tL_error != null) {
            Y.g0(tL_error, false);
        } else {
            Log.d("Dictation", "style request failed (no error from the server)");
        }
    }

    public static String p(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        String Q0 = y21.Q0(language);
        return Q0 != null ? Q0 : language;
    }

    public static int t(int i7, int i10, boolean z10) {
        int i11 = i7 | (-16777216);
        int i12 = i10 | (-16777216);
        int i13 = i11;
        for (int i14 = 1; i14 <= 20 && i0.a.g(i13, i12) < 4.5d; i14++) {
            i13 = i0.a.f(i14 * 0.04f, i11, z10 ? -1 : -16777216);
        }
        return i13;
    }

    public final void A(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f.a;
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar == null || !z10) {
            return;
        }
        chatActivityEnterView.D1 = false;
        if (gfVar != null) {
            gfVar.invalidate();
        }
    }

    public final void B(boolean z10) {
        if (z10) {
            this.b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void C() {
        tl tlVar;
        bn bnVar = this.f.a.D3;
        bj bjVar = bnVar != null ? bnVar.A0 : null;
        if (bjVar == null || (tlVar = this.E0) == null) {
            return;
        }
        if (tlVar != bjVar) {
            i0 i0Var = this.H0;
            if (tlVar != null) {
                tlVar.q0(i0Var);
            }
            this.E0 = bjVar;
            bjVar.i(i0Var);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 2));
        this.G0.addListener(new j0(this, 0));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(lr.h);
        this.G0.start();
    }

    public final void D(float f10, float f11) {
        q0 q0Var = this.s;
        if (q0Var != null && (q0Var.a1 != f10 || q0Var.Z0 != f11)) {
            q0Var.a1 = f10;
            q0Var.Z0 = f11;
            q0Var.invalidate();
        }
        k1 k1Var = this.w;
        if (k1Var != null) {
            if (k1Var.m0 == f10 && k1Var.l0 == f11) {
                return;
            }
            k1Var.m0 = f10;
            k1Var.l0 = f11;
            k1Var.invalidate();
        }
    }

    public final void F(boolean z10) {
        String str;
        h hVar;
        int i7 = this.r;
        if (i7 == 1 || i7 == 2) {
            return;
        }
        this.o0 = z10;
        if (i7 == 4 && (hVar = this.H) != null) {
            hVar.b();
        }
        g();
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A0 = null;
        qf qfVar = this.f;
        ChatActivityEnterView chatActivityEnterView = qfVar.a;
        chatActivityEnterView.y1 = 0.0f;
        chatActivityEnterView.i2();
        Editable text = qfVar.a.F0.getText();
        int i10 = this.r;
        if (i10 == 3 || i10 == 4) {
            this.w.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
            C();
            h2 h2Var = this.F;
            if (h2Var != null) {
                h2Var.f(false);
            }
        }
        this.J = null;
        this.K = h.c;
        int length = text == null ? 0 : text.length();
        if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
            this.L = true;
            text.append(' ');
            this.L = false;
            length++;
        }
        this.I = length;
        this.M = "";
        this.N = 0;
        this.O = false;
        this.r = 1;
        qfVar.b();
        this.U = SystemClock.uptimeMillis();
        org.telegram.messenger.g0.r(this.k0);
        b0 b0Var = this.m0;
        DictationAsr.N(b0Var);
        DictationAsr.g.add(b0Var);
        J(true);
        if (!z10) {
            b(1.0f, 220L, lr.h);
        }
        org.telegram.messenger.g0.r(this.t0);
        q0 q0Var = this.s;
        float[] fArr = this.h0;
        int i11 = this.n0;
        q0Var.getClass();
        boolean z11 = fArr != null;
        q0Var.R = z11;
        if (z11) {
            q0Var.S = fArr[0] - q0Var.getLeft();
            q0Var.T = fArr[1] - q0Var.getTop();
            q0Var.U.setColor(i11);
        }
        q0 q0Var2 = this.s;
        float[] fArr2 = this.i0;
        int i12 = this.j0;
        int[] iArr = q0Var2.o0;
        boolean z12 = fArr2 != null;
        q0Var2.A0 = z12;
        if (z12) {
            q0Var2.getLocationInWindow(iArr);
            q0Var2.B0 = fArr2[0] - iArr[0];
            q0Var2.C0 = fArr2[1] - iArr[1];
            q0Var2.D0 = fArr2[2];
            q0Var2.E0 = i12;
            q0Var2.F0 = 0L;
            if (q0Var2.J0 == null) {
                q0Var2.J0 = q0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            }
            q0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        StringBuilder sb2 = new StringBuilder("commit morph from circle ");
        if (this.i0 == null) {
            str = "null";
        } else {
            str = ((int) this.i0[0]) + "," + ((int) this.i0[1]) + " r" + ((int) this.i0[2]);
        }
        p5.c.t(sb2, str, "Dictation");
        this.i0 = null;
        this.h0 = null;
        if (!z10) {
            this.s.setShown(true);
            this.s.setRightMode(0);
        }
        this.x.f();
        B(true);
        A(true);
        if (!z10) {
            this.s.setStopIsland(true);
        }
        String U = DictationAsr.U();
        this.w.setLanguage(U != null ? p(U) : null);
        this.w.setSettings(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.r0 = uptimeMillis;
        this.q0 = uptimeMillis;
        this.U = uptimeMillis;
        this.p0 = 0L;
        if (!z10) {
            org.telegram.messenger.g0.h3(this.s0, 300L);
        }
        boolean z13 = mp.g1().getInt("design_dictation_mode", 1) == 2;
        ChatActivityEnterView chatActivityEnterView2 = qfVar.a;
        this.G = new c2(this.h, chatActivityEnterView2.R, chatActivityEnterView2.E3, z13, this);
        gf gfVar = qfVar.a.F0;
        if (gfVar != null) {
            gfVar.n1 = true;
        }
        Log.d("Dictation", "start simulated=" + z13);
        c2 c2Var = this.G;
        c2Var.m();
        org.telegram.messenger.g0.h3(new a1.e(14, this, c2Var), (z13 || z10) ? 120L : 420L);
    }

    public final ArrayList G() {
        g();
        ArrayList arrayList = new ArrayList();
        arrayList.add(h.c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void H() {
        Editable text = this.f.a.F0.getText();
        if (text == null || text.length() <= 0 || text.length() != this.I || !Character.isWhitespace(text.charAt(text.length() - 1))) {
            return;
        }
        this.L = true;
        text.delete(text.length() - 1, text.length());
        this.L = false;
    }

    public final void I() {
        Drawable backgroundImage;
        if (!this.f0) {
            this.f0 = true;
            ArrayList arrayList = t0.g;
            a3.l lVar = this.e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            au0 au0Var = this.f.a.a2;
            if ((au0Var != null) && (backgroundImage = au0Var.getBackgroundImage()) != null) {
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
        int i11 = n6.d6;
        i6 i6Var = this.n;
        int w02 = n6.w0(i11, i6Var);
        boolean c10 = s0.c(w02);
        s0 s0Var = this.x;
        if (s0Var.h != c10) {
            s0Var.h = c10;
        }
        int i12 = n6.Pe;
        s0.h(n6.w0(i12, i6Var));
        s0Var.g(this.d0, n6.w0(i12, i6Var));
        int[] iArr = s0Var.B;
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (j2.e != i13 || j2.f != i14) {
            j2.e = i13;
            j2.f = i14;
            Arrays.fill(j2.g[0], (Object) null);
        }
        if (this.s != null) {
            int w03 = n6.w0(i12, i6Var) | (-16777216);
            q0 q0Var = this.s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i15 = iArr[4];
            q0Var.e1 = w03;
            q0Var.f1 = f10;
            q0Var.g1 = i15;
            if (!q0Var.p0) {
                q0Var.q0 = w03;
                q0Var.r0 = f10;
                q0Var.s0 = null;
                q0Var.invalidate();
            }
            this.s.setDayIconBase(n6.w0(n6.Nl, i6Var));
        }
        this.w0 = null;
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        q0 q0Var2 = this.s;
        if (q0Var2 != null) {
            int i16 = n6.Nl;
            int w04 = n6.w0(i16, i6Var);
            int w05 = n6.w0(i12, i6Var);
            q0Var2.d.setColor(w04);
            q0Var2.e.setColor(w05);
            q0Var2.f.setColor(w05);
            q0Var2.invalidate();
            q0 q0Var3 = this.s;
            int w06 = n6.w0(i16, i6Var);
            Paint paint = q0Var3.d0;
            Paint paint2 = q0Var3.c0;
            q0Var3.p0 = c10;
            q0Var3.q0 = c10 ? s0.e(-13665281) : q0Var3.e1;
            q0Var3.r0 = c10 ? s0.e(-7447553) : q0Var3.f1;
            q0Var3.s0 = null;
            q0Var3.b0.setColor(c10 ? 1714435648 : -1493172225);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            paint2.setColor(c10 ? 654311423 : 436207616);
            paint.setColor(16777216);
            paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33333334f), c10 ? 1711276032 : 855638016);
            q0Var3.e0.setColor(w06);
            q0Var3.invalidate();
            this.s.setSendIconColor(n6.w0(n6.Tf, i6Var));
        }
        h2 h2Var = this.F;
        if (h2Var != null) {
            h2Var.c(t(n6.w0(i12, i6Var), w02, c10), n6.w0(n6.Le, i6Var), c10);
        }
        k1 k1Var = this.w;
        if (k1Var != null) {
            k1Var.e();
        }
    }

    public final void J(boolean z10) {
        String str;
        if (DictationAsr.F(new long[2])) {
            str = " " + gd.a0(null, null, 2131745069, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d))));
        } else {
            str = null;
        }
        if (z10 || !TextUtils.equals(str, this.l0)) {
            this.l0 = str;
            qf qfVar = this.f;
            if (str == null) {
                qfVar.a.I1(gd.M0(2131745060, null), true);
                return;
            }
            String M0 = gd.M0(2131745068, null);
            ChatActivityEnterView chatActivityEnterView = qfVar.a;
            CharSequence charSequence = chatActivityEnterView.e;
            chatActivityEnterView.I1(TextUtils.concat(M0, str), !(charSequence != null && charSequence.toString().startsWith(M0.toString())));
        }
    }

    @Override // ai.a2
    public final void a(String str, String str2) {
        if (o()) {
            if (!TextUtils.isEmpty(str)) {
                String w10 = w(str);
                if (this.N <= 0 || !w10.isEmpty()) {
                    this.L = true;
                    this.F.e(this.I, -1, w10);
                    this.L = false;
                }
            }
            h2 h2Var = this.F;
            Editable editableText = h2Var.a.getEditableText();
            if (editableText != null) {
                h2Var.d(editableText, editableText.length());
            }
            qf qfVar = this.f;
            gf gfVar = qfVar.a.F0;
            InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
            if (inputMethodManager != null && gfVar != null) {
                inputMethodManager.restartInput(gfVar);
            }
            this.G = null;
            if (str2 != null) {
                Log.d("Dictation", "stopped with error: ".concat(str2));
            }
            if (v() <= 0 && (this.N <= 0 || qfVar.a.F0.getText().toString().trim().length() <= 0)) {
                f();
                H();
                this.w.setIsland(false);
                this.w.setSettings(false);
                this.w.setStopMode(false);
                C();
                this.r = 0;
                qfVar.b();
                return;
            }
            this.r = 3;
            qfVar.b();
            this.I = 0;
            this.s.setCancelShown(false);
            if (!this.o0) {
                d();
            }
            this.s.setHandOff(true);
            this.s.setRightMode(2);
            qfVar.a.I1(null, true);
            B(false);
            this.P = 0.0f;
            org.telegram.messenger.g0.h3(this.t0, 460L);
            this.w.setStopMode(false);
            this.w.d(gd.M0(2131745066, null), false);
            gf gfVar2 = qfVar.a.F0;
            gfVar2.setSelection(gfVar2.length());
            int i7 = 7;
            if (!this.o0) {
                gfVar2.requestFocus();
                org.telegram.messenger.g0.h3(new a3.f(gfVar2, i7), 120L);
            }
            org.telegram.messenger.g0.h3(new b0(this, i7), 90L);
        }
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, f10);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 1));
        this.c0.setDuration(j3);
        this.c0.setInterpolator(timeInterpolator);
        this.c0.start();
    }

    public final void c(g gVar) {
        if (this.r != 3) {
            return;
        }
        if (this.I > this.f.a.F0.length()) {
            this.I = 0;
        }
        String str = this.J;
        boolean z10 = str != null;
        if (str == null) {
            this.J = y();
        }
        String str2 = this.J;
        if (TextUtils.isEmpty(str2.trim())) {
            if (z10) {
                return;
            }
            this.J = null;
            return;
        }
        this.r = 4;
        this.b = 0L;
        this.V = SystemClock.uptimeMillis();
        this.w.d(gVar.d ? gd.M0(2131745065, null) : gd.a0(null, null, 2131745075, gVar.a()), true);
        this.F.a();
        this.F.f(true);
        this.x.f();
        q0 q0Var = this.s;
        if (q0Var != null) {
            q0Var.R0 = SystemClock.uptimeMillis();
            q0Var.setVisibility(0);
            q0Var.y = true;
            q0Var.E = false;
            q0Var.R = false;
            q0Var.A0 = false;
            q0Var.L0 = false;
            q0Var.l0 = false;
            q0Var.l1 = false;
            q0Var.F.e(true, 1.0f);
            q0Var.G.e(true, 0.0f);
            q0Var.H.e(true, 0.0f);
            q0Var.I.e(true, 0.0f);
            q0Var.J.e(true, 1.0f);
            q0Var.O0.e(true, 0.0f);
            q0Var.b1 = 0L;
            q0Var.N0.e(true, 1.0f);
            q0Var.L = 3;
            q0Var.invalidate();
        }
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        g gVar2 = this.K;
        this.K = gVar;
        this.H.a(gVar, str2, new a3.g(this, gVar2, z10, gVar, 1));
    }

    public final void d() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(lr.g);
        this.A0.start();
    }

    public final void e(long j3, long j10) {
        q0 q0Var = this.s;
        if (q0Var == null) {
            return;
        }
        if (q0Var.L == 3) {
            q0Var.b1 = SystemClock.uptimeMillis() + j3;
            q0Var.c1 = Math.max(1L, j10);
            q0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new b0(this, 6), j3 + j10 + 60);
    }

    public final void f() {
        org.telegram.messenger.g0.r(this.s0);
        q0 q0Var = this.s;
        if (q0Var != null) {
            q0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.t0);
        org.telegram.messenger.g0.r(this.k0);
        b0 b0Var = this.u0;
        org.telegram.messenger.g0.r(b0Var);
        b0 b0Var2 = this.v0;
        org.telegram.messenger.g0.r(b0Var2);
        q0 q0Var2 = this.s;
        q0Var2.L0 = true;
        q0Var2.R = false;
        SystemClock.uptimeMillis();
        if (q0Var2.J0 == null) {
            Drawable mutate = q0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            q0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        q0Var2.invalidate();
        if (!this.o0) {
            d();
        }
        B(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(b0Var, 30L);
        org.telegram.messenger.g0.h3(b0Var2, 310L);
    }

    public final void g() {
        fh.g gVar;
        gh.a aVar;
        qf qfVar = this.f;
        au0 au0Var = qfVar.a.a2;
        q0 q0Var = this.s;
        Context context = this.h;
        int i7 = 0;
        if (q0Var == null) {
            q0 q0Var2 = new q0(context, this);
            this.s = q0Var2;
            q0Var2.setBorderColorSource(new a0(this, i7));
            this.s.setVisibility(8);
        }
        if (this.s.getParent() != au0Var) {
            org.telegram.messenger.g0.E2(this.s);
            au0Var.addView(this.s, ma.e(-1, -1, 80));
        } else {
            this.s.bringToFront();
        }
        q0 q0Var3 = this.s;
        ChatActivityEnterView chatActivityEnterView = qfVar.a;
        fe feVar = chatActivityEnterView.R0;
        oe oeVar = chatActivityEnterView.a1;
        q0Var3.b = feVar;
        q0Var3.c = oeVar;
        int i10 = 4;
        q0Var3.setBubbleProvider(new cb.c(this, i10));
        if (this.w == null) {
            this.w = new k1(context, this.n, this);
        }
        if (this.w.getParent() != au0Var) {
            org.telegram.messenger.g0.E2(this.w);
            au0Var.addView(this.w, ma.e(-1, -1, 80));
        } else {
            this.w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = qfVar.a;
        int i11 = ChatActivityEnterView.n7;
        jh.f z02 = chatActivityEnterView2.z0();
        jh.f fVar = this.a0;
        if (z02 != fVar) {
            if (fVar != null) {
                fVar.f = null;
            }
            this.a0 = z02;
            this.Y = z02 != null ? new c6(z02, 0L, 380L, new lr(0.22d, 0.61d, 0.36d, 1.0d)) : null;
            this.e = z02 != null ? new c6(z02, 1L, 300L, lr.g) : null;
        }
        jh.f fVar2 = this.a0;
        if (fVar2 != null) {
            int i12 = 2;
            fVar2.f = new a0(this, i12);
            dh.c cVar = qfVar.a.J1;
            if (cVar != null && (gVar = fVar2.n) != null && (aVar = gVar.w) != null) {
                fh.g c10 = cVar.c(this.w, aVar, false);
                fh.g c11 = cVar.c(this.w, this.a0.n.w, false);
                k1 k1Var = this.w;
                fh.g c12 = cVar.c(k1Var, this.a0.n.w, false);
                k1Var.I = c10;
                k1Var.J = c11;
                k1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                k1 k1Var2 = this.w;
                k1Var2.setGearGlass(cVar.c(k1Var2, this.a0.n.w, false));
                q0 q0Var4 = this.s;
                if (q0Var4 != null) {
                    q0Var4.setStopGlass(cVar.c(q0Var4, new qb.a(i12), false));
                }
            }
        }
        gf gfVar = qfVar.a.F0;
        if (this.F == null) {
            h2 h2Var = new h2(gfVar);
            this.F = h2Var;
            h2Var.h = new a0(this, i10);
            this.a = new l1(gfVar);
            gfVar.addTextChangedListener(this.g0);
        }
        if (this.H == null) {
            this.H = new h(qfVar.a.R);
        }
        I();
    }

    @Override // ai.a2
    public final void h(float f10) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f10;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f10 > 0.38f) {
            if (this.p0 == 0) {
                this.p0 = uptimeMillis;
            }
            if (uptimeMillis - this.p0 >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.p0 = 0L;
        }
        q0 q0Var = this.s;
        if (q0Var != null) {
            q0Var.setLevel(f10);
        }
        if (this.o0 && (recordCircle = (chatActivityEnterView = this.f.a).B2) != null && chatActivityEnterView.t3) {
            recordCircle.setAmplitude(f10 * 1800.0f);
        }
    }

    @Override // ai.a2
    public final void i(String str) {
        l(-1, str);
    }

    public final void j() {
        qf qfVar = this.f;
        gf gfVar = qfVar.a.F0;
        if (gfVar != null) {
            gfVar.n1 = false;
        }
        c2 c2Var = this.G;
        if (c2Var != null) {
            c2Var.c();
        }
        this.G = null;
        h hVar = this.H;
        if (hVar != null) {
            hVar.b();
        }
        if (o()) {
            f();
        }
        k1 k1Var = this.w;
        if (k1Var != null) {
            k1Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        this.r = 0;
        B(false);
        l1 l1Var = this.a;
        if (l1Var != null) {
            l1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = qfVar.a;
        chatActivityEnterView.E1 = 0L;
        chatActivityEnterView.F1 = null;
        q0 q0Var = this.s;
        if (q0Var != null && q0Var.getRightMode() == 3) {
            this.s.e();
        }
        h2 h2Var = this.F;
        if (h2Var != null) {
            h2Var.f(false);
        }
        A(false);
        C();
        qfVar.b();
    }

    public final boolean k(RectF rectF) {
        fh.g gVar;
        jh.f fVar = this.a0;
        if (fVar == null || (gVar = fVar.n) == null) {
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

    @Override // ai.a2
    public final void l(int i7, String str) {
        if (o()) {
            this.q0 = SystemClock.uptimeMillis();
            if (str == null) {
                str = "";
            }
            String w10 = w(str);
            int max = i7 < 0 ? -1 : Math.max(0, Math.min(w10.length(), i7 - (str.length() - w10.length())));
            this.L = true;
            this.F.e(this.I, max, w10);
            this.L = false;
        }
    }

    public final boolean m() {
        return this.r != 0;
    }

    public final boolean n() {
        return this.o0 && this.r != 0;
    }

    public final boolean o() {
        int i7 = this.r;
        return i7 == 1 || i7 == 2;
    }

    public final boolean q(float[] fArr) {
        gf gfVar = this.f.a.F0;
        if (this.a0 == null || gfVar == null || gfVar.getLayout() == null) {
            return false;
        }
        this.a0.getLocationInWindow(this.B0);
        gfVar.getLocationInWindow(this.C0);
        fArr[0] = (gfVar.getTotalPaddingLeft() + (r1[0] - r3[0])) - gfVar.getScrollX();
        fArr[1] = (gfVar.getTotalPaddingTop() + (r1[1] - r3[1])) - gfVar.getScrollY();
        return true;
    }

    public final void r() {
        if (o()) {
            c2 c2Var = this.G;
            if (c2Var != null) {
                c2Var.c();
            }
            this.G = null;
            qf qfVar = this.f;
            Editable text = qfVar.a.F0.getText();
            if (text != null && this.I <= text.length()) {
                this.L = true;
                this.F.a();
                text.delete(this.I, text.length());
                this.L = false;
            }
            H();
            f();
            A(false);
            this.w.setIsland(false);
            this.w.setSettings(false);
            this.w.setStopMode(false);
            C();
            this.r = 0;
            qfVar.b();
        }
    }

    public final void s() {
        if (this.r != 1) {
            return;
        }
        org.telegram.messenger.g0.r(this.s0);
        this.r = 2;
        this.s.setStopIsland(false);
        this.s.setRightMode(1);
        this.s.setCancelShown(false);
        c2 c2Var = this.G;
        if (c2Var != null) {
            c2Var.u();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(String str) {
        boolean z10;
        Editable editable;
        long j3;
        fh.g gVar;
        boolean c10 = s0.c(n6.w0(n6.d6, this.n));
        boolean z11 = true;
        if (this.a != null && this.a0 != null) {
            float[] fArr = this.D0;
            if (q(fArr) && (gVar = this.a0.n) != null) {
                if (!gVar.R.m.isEmpty()) {
                    float centerY = (r7.centerY() - fArr[1]) * 0.9f;
                    z10 = this.a.b((((r7.width() * (-0.35f)) + r7.left) - fArr[0]) + centerY, (((r7.width() * 1.35f) + r7.left) - fArr[0]) + centerY, s0.e(c10 ? -7358721 : -15363160), c10);
                    this.F.f(false);
                    qf qfVar = this.f;
                    if (!z10) {
                        gf gfVar = qfVar.a.F0;
                        Editable text = gfVar.getText();
                        if (text == null) {
                            return;
                        }
                        Layout layout = gfVar.getLayout();
                        int lineCount = layout != null ? layout.getLineCount() : 1;
                        int width = (gfVar.getWidth() - gfVar.getTotalPaddingLeft()) - gfVar.getTotalPaddingRight();
                        int lineCount2 = width <= 0 ? 1 : StaticLayout.Builder.obtain(str, 0, str.length(), gfVar.getPaint(), width).setLineSpacing(gfVar.getLineSpacingExtra(), gfVar.getLineSpacingMultiplier()).setIncludePad(gfVar.getIncludeFontPadding()).build().getLineCount();
                        lr lrVar = l1.J;
                        long max = Math.max(800L, Math.min(1200L, (Math.max(lineCount, lineCount2) * 70) + 700));
                        long uptimeMillis = SystemClock.uptimeMillis();
                        lr lrVar2 = l1.J;
                        ChatActivityEnterView chatActivityEnterView = qfVar.a;
                        chatActivityEnterView.E1 = uptimeMillis + max;
                        chatActivityEnterView.F1 = lrVar2;
                        int min = Math.min(this.I, text.length());
                        this.L = true;
                        this.F.a();
                        BaseInputConnection.removeComposingSpans(text);
                        text.replace(min, text.length(), str);
                        gfVar.setSelection(text.length());
                        this.L = false;
                        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.restartInput(gfVar);
                        }
                        this.a.a(max);
                        this.b = uptimeMillis + ((long) (max * 0.87f));
                        long min2 = Math.min(this.a.h(r0.w * 0.9f), max);
                        l1 l1Var = this.a;
                        this.a.H = new f0(this, min2, Math.min(l1Var.h(((l1Var.w + l1Var.x) * 0.9f) + (l1Var.b.getLayout() != null ? r5.getWidth() : 0.0f)) + ((long) (l1Var.F * 1000.0f)), max), 0);
                        jh.f fVar = this.a0;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                        org.telegram.messenger.g0.h3(new b0(this, 3), max + 32);
                        return;
                    }
                    e(0L, 240L);
                    gf gfVar2 = qfVar.a.F0;
                    Editable text2 = gfVar2.getText();
                    if (text2 == null) {
                        return;
                    }
                    int min3 = Math.min(this.I, text2.length());
                    this.L = true;
                    this.F.a();
                    text2.replace(min3, text2.length(), str);
                    h2 h2Var = this.F;
                    int length = str.length() + min3;
                    Editable editableText = h2Var.a.getEditableText();
                    if (editableText == null) {
                        editable = text2;
                        j3 = 45;
                    } else {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        int i7 = 0;
                        while (min3 < length) {
                            while (min3 < length && Character.isWhitespace(editableText.charAt(min3))) {
                                min3++;
                            }
                            if (min3 >= length) {
                                break;
                            }
                            int i10 = min3;
                            while (i10 < length && !Character.isWhitespace(editableText.charAt(i10))) {
                                i10++;
                            }
                            boolean z12 = z11;
                            long j10 = (i7 * 45) + uptimeMillis2;
                            e2 e2Var = new e2(j10 + 260, h2Var.b, h2Var.c);
                            e2Var.b = j10;
                            editableText.setSpan(e2Var, min3, i10, 33);
                            i7++;
                            min3 = i10;
                            z11 = z12;
                            text2 = text2;
                            uptimeMillis2 = uptimeMillis2;
                        }
                        editable = text2;
                        j3 = 45;
                        h2Var.g();
                    }
                    this.W = (j3 * str.split("\\s+").length) + SystemClock.uptimeMillis() + 375;
                    jh.f fVar2 = this.a0;
                    if (fVar2 != null) {
                        fVar2.invalidate();
                    }
                    gfVar2.setSelection(editable.length());
                    this.L = false;
                    return;
                }
            }
        }
        z10 = false;
        this.F.f(false);
        qf qfVar2 = this.f;
        if (!z10) {
        }
    }

    public final int v() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    public final String w(String str) {
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

    @Override // ai.a2
    public final void x(String str) {
        k1 k1Var = this.w;
        if (k1Var != null) {
            k1Var.setLanguage(str == null ? null : p(str));
        }
    }

    public final String y() {
        Editable text = this.f.a.F0.getText();
        return text == null ? "" : text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }

    public final void z() {
        Log.d("Dictation", "send from listening (" + v() + " chars)");
        c2 c2Var = this.G;
        if (c2Var != null) {
            c2Var.c();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.s0);
        this.F.a();
        this.s.setStopIsland(false);
        qf qfVar = this.f;
        qfVar.a.I1(null, true);
        B(false);
        this.P = 0.0f;
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        C();
        A(false);
        this.r = 0;
        this.b0 = 0.0f;
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qfVar.d(0.0f);
        this.s.e();
        qfVar.b();
        qfVar.a.r1();
    }
}
