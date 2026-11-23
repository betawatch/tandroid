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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.fe;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.tl;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class p0 implements d2 {
    public static final nr I0 = new nr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public k2 F;
    public float F0;
    public f2 G;
    public ValueAnimator G0;
    public h H;
    public final j0 H0;
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
    public d6 Y;
    public o1 a;
    public jh.f a0;
    public long b;
    public float b0;
    public float c;
    public ValueAnimator c0;
    public boolean d;
    public int d0;
    public d6 e;
    public final a3.l e0;
    public final sf f;
    public boolean f0;
    public final ah.j g0;
    public final Context h;
    public float[] h0;
    public float[] i0;
    public int j0;
    public final b0 k0;
    public String l0;
    public final b0 m0;
    public final h6 n;
    public int n0;
    public boolean o0;
    public long p0;
    public long q0;
    public long r0;
    public s0 s;
    public final sa s0;
    public final b0 t0;
    public final b0 u0;
    public final b0 v0;
    public n1 w;
    public LinearGradient w0;
    public boolean x0;
    public float y0;
    public final Matrix z0;
    public int r = 0;
    public final u0 x = new u0();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public g K = h.c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public p0(Context context, sf sfVar) {
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
        this.H0 = new j0(this, 0);
        this.h = context;
        this.f = sfVar;
        this.n = sfVar.a.M4;
    }

    public static void G(TLRPC.TL_error tL_error) {
        lc Y = lc.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null && ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            Y.I(R.raw.star_premium_2, hd.N0(2131754989, null), org.telegram.messenger.g0.W2(hd.N0(2131754990, null))).j();
        } else if (tL_error != null) {
            Y.g0(tL_error, false);
        } else {
            Log.d("Dictation", "style request failed (no error from the server)");
        }
    }

    public static String H(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        t J = DictationAsr.J(language);
        return (J == null || J.d(language).length < 2) ? q(str) : N(DictationAsr.d0(J, language));
    }

    public static String N(String str) {
        String O = O(str);
        if (O == null) {
            return q(str);
        }
        return q(str) + " (" + O + ")";
    }

    public static String O(String str) {
        String str2;
        String[] split = str.split("-");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Language");
        for (String str3 : split) {
            sb2.append(d(str3));
        }
        String L0 = hd.L0(sb2.toString());
        if (!TextUtils.isEmpty(L0)) {
            return L0;
        }
        Locale locale = hd.E0().y;
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        boolean z10 = true;
        for (int i7 = 1; i7 < split.length; i7++) {
            if (split[i7].matches("[A-Za-z]{4}")) {
                str2 = new Locale.Builder().setScript(split[i7]).build().getDisplayScript(locale);
            } else {
                if (split[i7].matches("[A-Za-z]{2}|[0-9]{3}")) {
                    str2 = new Locale.Builder().setRegion(split[i7]).build().getDisplayCountry(locale);
                }
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) || str2.equalsIgnoreCase(split[i7])) {
                z10 = false;
            }
            if (i7 > 1) {
                sb3.append(", ");
                sb4.append(", ");
            }
            if (str2 != null && !str2.isEmpty()) {
                sb3.append(str2.substring(0, 1).toUpperCase(locale));
                sb3.append(str2.substring(1));
            }
            sb4.append(d(split[i7]));
        }
        return z10 ? sb3.toString() : sb4.toString();
    }

    public static String d(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(substring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static String q(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = hd.E0().y;
        String displayLanguage = locale != null ? new Locale(language).getDisplayLanguage(locale) : null;
        if (displayLanguage == null || displayLanguage.isEmpty() || displayLanguage.equalsIgnoreCase(language)) {
            String Q0 = b31.Q0(language);
            return Q0 != null ? Q0 : language;
        }
        return displayLanguage.substring(0, 1).toUpperCase(locale) + displayLanguage.substring(1);
    }

    public static int u(int i7, int i10, boolean z10) {
        int i11 = i7 | (-16777216);
        int i12 = i10 | (-16777216);
        int i13 = i11;
        for (int i14 = 1; i14 <= 20 && i0.a.g(i13, i12) < 4.5d; i14++) {
            i13 = i0.a.f(i14 * 0.04f, i11, z10 ? -1 : -16777216);
        }
        return i13;
    }

    public final void A(String str) {
        f2 f2Var;
        DictationAsr.X(str);
        DictationAsr.t(DictationAsr.J(str));
        this.w.setLanguage(H(str));
        if (this.r != 1 || (f2Var = this.G) == null) {
            return;
        }
        f2Var.q(str);
    }

    public final void B() {
        Log.d("Dictation", "send from listening (" + w() + " chars)");
        f2 f2Var = this.G;
        if (f2Var != null) {
            f2Var.d();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.s0);
        this.F.a();
        this.s.setStopIsland(false);
        sf sfVar = this.f;
        sfVar.a.M1(null, true);
        D(false);
        this.P = 0.0f;
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        E();
        C(false);
        this.r = 0;
        this.b0 = 0.0f;
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        sfVar.d(0.0f);
        this.s.e();
        sfVar.b();
        sfVar.a.v1();
    }

    public final void C(boolean z10) {
        ChatActivityEnterView chatActivityEnterView = this.f.a;
        gf gfVar = chatActivityEnterView.F0;
        if (gfVar == null || !z10) {
            return;
        }
        chatActivityEnterView.F1 = false;
        if (gfVar != null) {
            gfVar.invalidate();
        }
    }

    public final void D(boolean z10) {
        if (z10) {
            this.b = 0L;
        }
        this.X = z10;
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void E() {
        tl tlVar;
        bn bnVar = this.f.a.F3;
        bj bjVar = bnVar != null ? bnVar.A0 : null;
        if (bjVar == null || (tlVar = this.E0) == null) {
            return;
        }
        if (tlVar != bjVar) {
            j0 j0Var = this.H0;
            if (tlVar != null) {
                tlVar.q0(j0Var);
            }
            this.E0 = bjVar;
            bjVar.i(j0Var);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 2));
        this.G0.addListener(new k0(this, 0));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(nr.h);
        this.G0.start();
    }

    public final void F(float f10, float f11) {
        s0 s0Var = this.s;
        if (s0Var != null && (s0Var.a1 != f10 || s0Var.Z0 != f11)) {
            s0Var.a1 = f10;
            s0Var.Z0 = f11;
            s0Var.invalidate();
        }
        n1 n1Var = this.w;
        if (n1Var != null) {
            if (n1Var.m0 == f10 && n1Var.l0 == f11) {
                return;
            }
            n1Var.m0 = f10;
            n1Var.l0 = f11;
            n1Var.invalidate();
        }
    }

    public final void I(boolean z10) {
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
        j();
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A0 = null;
        sf sfVar = this.f;
        ChatActivityEnterView chatActivityEnterView = sfVar.a;
        chatActivityEnterView.A1 = 0.0f;
        chatActivityEnterView.m2();
        Editable text = sfVar.a.F0.getText();
        int i10 = this.r;
        if (i10 == 3 || i10 == 4) {
            this.w.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
            E();
            k2 k2Var = this.F;
            if (k2Var != null) {
                k2Var.f(false);
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
        sfVar.b();
        this.U = SystemClock.uptimeMillis();
        org.telegram.messenger.g0.r(this.k0);
        b0 b0Var = this.m0;
        DictationAsr.R(b0Var);
        DictationAsr.g.add(b0Var);
        M(true);
        if (!z10) {
            b(1.0f, 220L, nr.h);
        }
        org.telegram.messenger.g0.r(this.t0);
        s0 s0Var = this.s;
        float[] fArr = this.h0;
        int i11 = this.n0;
        s0Var.getClass();
        boolean z11 = fArr != null;
        s0Var.R = z11;
        if (z11) {
            s0Var.S = fArr[0] - s0Var.getLeft();
            s0Var.T = fArr[1] - s0Var.getTop();
            s0Var.U.setColor(i11);
        }
        s0 s0Var2 = this.s;
        float[] fArr2 = this.i0;
        int i12 = this.j0;
        int[] iArr = s0Var2.o0;
        boolean z12 = fArr2 != null;
        s0Var2.A0 = z12;
        if (z12) {
            s0Var2.getLocationInWindow(iArr);
            s0Var2.B0 = fArr2[0] - iArr[0];
            s0Var2.C0 = fArr2[1] - iArr[1];
            s0Var2.D0 = fArr2[2];
            s0Var2.E0 = i12;
            s0Var2.F0 = 0L;
            if (s0Var2.J0 == null) {
                s0Var2.J0 = s0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            }
            s0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
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
        D(true);
        C(true);
        if (!z10) {
            this.s.setStopIsland(true);
        }
        String a02 = DictationAsr.a0();
        this.w.setLanguage(a02 != null ? H(a02) : null);
        this.w.setSettings(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.r0 = uptimeMillis;
        this.q0 = uptimeMillis;
        this.U = uptimeMillis;
        this.p0 = 0L;
        if (!z10) {
            org.telegram.messenger.g0.h3(this.s0, 300L);
        }
        boolean z13 = np.g1().getInt("design_dictation_mode", 1) == 2;
        ChatActivityEnterView chatActivityEnterView2 = sfVar.a;
        this.G = new f2(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z13, this);
        gf gfVar = sfVar.a.F0;
        if (gfVar != null) {
            gfVar.n1 = true;
        }
        Log.d("Dictation", "start simulated=" + z13);
        f2 f2Var = this.G;
        f2Var.n();
        org.telegram.messenger.g0.h3(new a1.e(14, this, f2Var), (z13 || z10) ? 120L : 420L);
    }

    public final ArrayList J() {
        j();
        ArrayList arrayList = new ArrayList();
        arrayList.add(h.c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void K() {
        Editable text = this.f.a.F0.getText();
        if (text == null || text.length() <= 0 || text.length() != this.I || !Character.isWhitespace(text.charAt(text.length() - 1))) {
            return;
        }
        this.L = true;
        text.delete(text.length() - 1, text.length());
        this.L = false;
    }

    public final void L() {
        Drawable backgroundImage;
        if (!this.f0) {
            this.f0 = true;
            ArrayList arrayList = v0.g;
            a3.l lVar = this.e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            du0 du0Var = this.f.a.c2;
            if ((du0Var != null) && (backgroundImage = du0Var.getBackgroundImage()) != null) {
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
        int i11 = m6.d6;
        h6 h6Var = this.n;
        int w02 = m6.w0(i11, h6Var);
        boolean c10 = u0.c(w02);
        u0 u0Var = this.x;
        if (u0Var.h != c10) {
            u0Var.h = c10;
        }
        int i12 = m6.Pe;
        u0.h(m6.w0(i12, h6Var));
        u0Var.g(this.d0, m6.w0(i12, h6Var));
        int[] iArr = u0Var.B;
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (m2.e != i13 || m2.f != i14) {
            m2.e = i13;
            m2.f = i14;
            Arrays.fill(m2.g[0], (Object) null);
        }
        if (this.s != null) {
            int w03 = m6.w0(i12, h6Var) | (-16777216);
            s0 s0Var = this.s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i15 = iArr[4];
            s0Var.e1 = w03;
            s0Var.f1 = f10;
            s0Var.g1 = i15;
            if (!s0Var.p0) {
                s0Var.q0 = w03;
                s0Var.r0 = f10;
                s0Var.s0 = null;
                s0Var.invalidate();
            }
            this.s.setDayIconBase(m6.w0(m6.Nl, h6Var));
        }
        this.w0 = null;
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        s0 s0Var2 = this.s;
        if (s0Var2 != null) {
            int i16 = m6.Nl;
            int w04 = m6.w0(i16, h6Var);
            int w05 = m6.w0(i12, h6Var);
            s0Var2.d.setColor(w04);
            s0Var2.e.setColor(w05);
            s0Var2.f.setColor(w05);
            s0Var2.invalidate();
            s0 s0Var3 = this.s;
            int w06 = m6.w0(i16, h6Var);
            Paint paint = s0Var3.d0;
            Paint paint2 = s0Var3.c0;
            s0Var3.p0 = c10;
            s0Var3.q0 = c10 ? u0.e(-13665281) : s0Var3.e1;
            s0Var3.r0 = c10 ? u0.e(-7447553) : s0Var3.f1;
            s0Var3.s0 = null;
            s0Var3.b0.setColor(c10 ? 1714435648 : -1493172225);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            paint2.setColor(c10 ? 654311423 : 436207616);
            paint.setColor(16777216);
            paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33333334f), c10 ? 1711276032 : 855638016);
            s0Var3.e0.setColor(w06);
            s0Var3.invalidate();
            this.s.setSendIconColor(m6.w0(m6.Tf, h6Var));
        }
        k2 k2Var = this.F;
        if (k2Var != null) {
            k2Var.c(u(m6.w0(i12, h6Var), w02, c10), m6.w0(m6.Le, h6Var), c10);
        }
        n1 n1Var = this.w;
        if (n1Var != null) {
            n1Var.e();
        }
    }

    public final void M(boolean z10) {
        String str;
        if (DictationAsr.H(new long[2])) {
            str = " " + hd.a0(null, null, 2131745063, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d))));
        } else {
            str = null;
        }
        if (z10 || !TextUtils.equals(str, this.l0)) {
            this.l0 = str;
            sf sfVar = this.f;
            if (str == null) {
                sfVar.a.M1(hd.N0(2131745054, null), true);
                return;
            }
            String N0 = hd.N0(2131745062, null);
            ChatActivityEnterView chatActivityEnterView = sfVar.a;
            CharSequence charSequence = chatActivityEnterView.e;
            chatActivityEnterView.M1(TextUtils.concat(N0, str), !(charSequence != null && charSequence.toString().startsWith(N0.toString())));
        }
    }

    @Override // ai.d2
    public final void a(String str, String str2) {
        if (p()) {
            if (!TextUtils.isEmpty(str)) {
                String y10 = y(str);
                if (this.N <= 0 || !y10.isEmpty()) {
                    this.L = true;
                    this.F.e(this.I, -1, y10);
                    this.L = false;
                }
            }
            k2 k2Var = this.F;
            Editable editableText = k2Var.a.getEditableText();
            if (editableText != null) {
                k2Var.d(editableText, editableText.length());
            }
            sf sfVar = this.f;
            gf gfVar = sfVar.a.F0;
            InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
            if (inputMethodManager != null && gfVar != null) {
                inputMethodManager.restartInput(gfVar);
            }
            this.G = null;
            if (str2 != null) {
                Log.d("Dictation", "stopped with error: ".concat(str2));
            }
            if (w() <= 0 && (this.N <= 0 || sfVar.a.F0.getText().toString().trim().length() <= 0)) {
                g();
                K();
                this.w.setIsland(false);
                this.w.setSettings(false);
                this.w.setStopMode(false);
                E();
                this.r = 0;
                sfVar.b();
                return;
            }
            this.r = 3;
            sfVar.b();
            this.I = 0;
            this.s.setCancelShown(false);
            if (!this.o0) {
                e();
            }
            this.s.setHandOff(true);
            this.s.setRightMode(2);
            sfVar.a.M1(null, true);
            D(false);
            this.P = 0.0f;
            org.telegram.messenger.g0.h3(this.t0, 460L);
            this.w.setStopMode(false);
            this.w.d(hd.N0(2131745060, null), false);
            gf gfVar2 = sfVar.a.F0;
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
            this.J = z();
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
        this.w.d(gVar.d ? hd.N0(2131745059, null) : hd.a0(null, null, 2131745069, gVar.a()), true);
        this.F.a();
        this.F.f(true);
        this.x.f();
        s0 s0Var = this.s;
        if (s0Var != null) {
            s0Var.R0 = SystemClock.uptimeMillis();
            s0Var.setVisibility(0);
            s0Var.y = true;
            s0Var.E = false;
            s0Var.R = false;
            s0Var.A0 = false;
            s0Var.L0 = false;
            s0Var.l0 = false;
            s0Var.l1 = false;
            s0Var.F.e(true, 1.0f);
            s0Var.G.e(true, 0.0f);
            s0Var.H.e(true, 0.0f);
            s0Var.I.e(true, 0.0f);
            s0Var.J.e(true, 1.0f);
            s0Var.O0.e(true, 0.0f);
            s0Var.b1 = 0L;
            s0Var.N0.e(true, 1.0f);
            s0Var.L = 3;
            s0Var.invalidate();
        }
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        g gVar2 = this.K;
        this.K = gVar;
        this.H.a(gVar, str2, new a3.g(this, gVar2, z10, gVar, 1));
    }

    public final void e() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(nr.g);
        this.A0.start();
    }

    public final void f(long j3, long j10) {
        s0 s0Var = this.s;
        if (s0Var == null) {
            return;
        }
        if (s0Var.L == 3) {
            s0Var.b1 = SystemClock.uptimeMillis() + j3;
            s0Var.c1 = Math.max(1L, j10);
            s0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new b0(this, 6), j3 + j10 + 60);
    }

    public final void g() {
        org.telegram.messenger.g0.r(this.s0);
        s0 s0Var = this.s;
        if (s0Var != null) {
            s0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.t0);
        org.telegram.messenger.g0.r(this.k0);
        b0 b0Var = this.u0;
        org.telegram.messenger.g0.r(b0Var);
        b0 b0Var2 = this.v0;
        org.telegram.messenger.g0.r(b0Var2);
        s0 s0Var2 = this.s;
        s0Var2.L0 = true;
        s0Var2.R = false;
        SystemClock.uptimeMillis();
        if (s0Var2.J0 == null) {
            Drawable mutate = s0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            s0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        s0Var2.invalidate();
        if (!this.o0) {
            e();
        }
        D(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(b0Var, 30L);
        org.telegram.messenger.g0.h3(b0Var2, 310L);
    }

    @Override // ai.d2
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
        s0 s0Var = this.s;
        if (s0Var != null) {
            s0Var.setLevel(f10);
        }
        if (this.o0 && (recordCircle = (chatActivityEnterView = this.f.a).D2) != null && chatActivityEnterView.v3) {
            recordCircle.setAmplitude(f10 * 1800.0f);
        }
    }

    @Override // ai.d2
    public final void i(String str) {
        l(-1, str);
    }

    public final void j() {
        fh.g gVar;
        gh.a aVar;
        sf sfVar = this.f;
        du0 du0Var = sfVar.a.c2;
        s0 s0Var = this.s;
        Context context = this.h;
        int i7 = 0;
        if (s0Var == null) {
            s0 s0Var2 = new s0(context, this);
            this.s = s0Var2;
            s0Var2.setBorderColorSource(new a0(this, i7));
            this.s.setVisibility(8);
        }
        if (this.s.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.s);
            du0Var.addView(this.s, ma.e(-1, -1, 80));
        } else {
            this.s.bringToFront();
        }
        s0 s0Var3 = this.s;
        ChatActivityEnterView chatActivityEnterView = sfVar.a;
        fe feVar = chatActivityEnterView.R0;
        oe oeVar = chatActivityEnterView.a1;
        s0Var3.b = feVar;
        s0Var3.c = oeVar;
        int i10 = 4;
        s0Var3.setBubbleProvider(new cb.c(this, i10));
        if (this.w == null) {
            this.w = new n1(context, this.n, this);
        }
        if (this.w.getParent() != du0Var) {
            org.telegram.messenger.g0.E2(this.w);
            du0Var.addView(this.w, ma.e(-1, -1, 80));
        } else {
            this.w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = sfVar.a;
        int i11 = ChatActivityEnterView.s7;
        jh.f D0 = chatActivityEnterView2.D0();
        jh.f fVar = this.a0;
        if (D0 != fVar) {
            if (fVar != null) {
                fVar.f = null;
            }
            this.a0 = D0;
            this.Y = D0 != null ? new d6(D0, 0L, 380L, new nr(0.22d, 0.61d, 0.36d, 1.0d)) : null;
            this.e = D0 != null ? new d6(D0, 1L, 300L, nr.g) : null;
        }
        jh.f fVar2 = this.a0;
        if (fVar2 != null) {
            int i12 = 2;
            fVar2.f = new a0(this, i12);
            dh.c cVar = sfVar.a.L1;
            if (cVar != null && (gVar = fVar2.n) != null && (aVar = gVar.w) != null) {
                fh.g c10 = cVar.c(this.w, aVar, false);
                fh.g c11 = cVar.c(this.w, this.a0.n.w, false);
                n1 n1Var = this.w;
                fh.g c12 = cVar.c(n1Var, this.a0.n.w, false);
                n1Var.I = c10;
                n1Var.J = c11;
                n1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                n1 n1Var2 = this.w;
                n1Var2.setGearGlass(cVar.c(n1Var2, this.a0.n.w, false));
                s0 s0Var4 = this.s;
                if (s0Var4 != null) {
                    s0Var4.setStopGlass(cVar.c(s0Var4, new qb.a(i12), false));
                }
            }
        }
        gf gfVar = sfVar.a.F0;
        if (this.F == null) {
            k2 k2Var = new k2(gfVar);
            this.F = k2Var;
            k2Var.h = new a0(this, i10);
            this.a = new o1(gfVar);
            gfVar.addTextChangedListener(this.g0);
        }
        if (this.H == null) {
            this.H = new h(sfVar.a.R);
        }
        L();
    }

    public final void k() {
        sf sfVar = this.f;
        gf gfVar = sfVar.a.F0;
        if (gfVar != null) {
            gfVar.n1 = false;
        }
        f2 f2Var = this.G;
        if (f2Var != null) {
            f2Var.d();
        }
        this.G = null;
        h hVar = this.H;
        if (hVar != null) {
            hVar.b();
        }
        if (p()) {
            g();
        }
        n1 n1Var = this.w;
        if (n1Var != null) {
            n1Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        this.r = 0;
        D(false);
        o1 o1Var = this.a;
        if (o1Var != null) {
            o1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = sfVar.a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        s0 s0Var = this.s;
        if (s0Var != null && s0Var.getRightMode() == 3) {
            this.s.e();
        }
        k2 k2Var = this.F;
        if (k2Var != null) {
            k2Var.f(false);
        }
        C(false);
        E();
        sfVar.b();
    }

    @Override // ai.d2
    public final void l(int i7, String str) {
        if (p()) {
            this.q0 = SystemClock.uptimeMillis();
            if (str == null) {
                str = "";
            }
            String y10 = y(str);
            int max = i7 < 0 ? -1 : Math.max(0, Math.min(y10.length(), i7 - (str.length() - y10.length())));
            this.L = true;
            this.F.e(this.I, max, y10);
            this.L = false;
        }
    }

    public final boolean m(RectF rectF) {
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

    public final boolean n() {
        return this.r != 0;
    }

    public final boolean o() {
        return this.o0 && this.r != 0;
    }

    public final boolean p() {
        int i7 = this.r;
        return i7 == 1 || i7 == 2;
    }

    public final boolean r(float[] fArr) {
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

    public final void s() {
        if (p()) {
            f2 f2Var = this.G;
            if (f2Var != null) {
                f2Var.d();
            }
            this.G = null;
            sf sfVar = this.f;
            Editable text = sfVar.a.F0.getText();
            if (text != null && this.I <= text.length()) {
                this.L = true;
                this.F.a();
                text.delete(this.I, text.length());
                this.L = false;
            }
            K();
            g();
            C(false);
            this.w.setIsland(false);
            this.w.setSettings(false);
            this.w.setStopMode(false);
            E();
            this.r = 0;
            sfVar.b();
        }
    }

    public final void t() {
        if (this.r != 1) {
            return;
        }
        org.telegram.messenger.g0.r(this.s0);
        this.r = 2;
        this.s.setStopIsland(false);
        this.s.setRightMode(1);
        this.s.setCancelShown(false);
        f2 f2Var = this.G;
        if (f2Var != null) {
            f2Var.v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(String str) {
        boolean z10;
        Editable editable;
        long j3;
        fh.g gVar;
        boolean c10 = u0.c(m6.w0(m6.d6, this.n));
        boolean z11 = true;
        if (this.a != null && this.a0 != null) {
            float[] fArr = this.D0;
            if (r(fArr) && (gVar = this.a0.n) != null) {
                if (!gVar.R.m.isEmpty()) {
                    float centerY = (r7.centerY() - fArr[1]) * 0.9f;
                    z10 = this.a.b((((r7.width() * (-0.35f)) + r7.left) - fArr[0]) + centerY, (((r7.width() * 1.35f) + r7.left) - fArr[0]) + centerY, u0.e(c10 ? -7358721 : -15363160), c10);
                    this.F.f(false);
                    sf sfVar = this.f;
                    if (!z10) {
                        gf gfVar = sfVar.a.F0;
                        Editable text = gfVar.getText();
                        if (text == null) {
                            return;
                        }
                        Layout layout = gfVar.getLayout();
                        int lineCount = layout != null ? layout.getLineCount() : 1;
                        int width = (gfVar.getWidth() - gfVar.getTotalPaddingLeft()) - gfVar.getTotalPaddingRight();
                        int lineCount2 = width <= 0 ? 1 : StaticLayout.Builder.obtain(str, 0, str.length(), gfVar.getPaint(), width).setLineSpacing(gfVar.getLineSpacingExtra(), gfVar.getLineSpacingMultiplier()).setIncludePad(gfVar.getIncludeFontPadding()).build().getLineCount();
                        nr nrVar = o1.J;
                        long max = Math.max(800L, Math.min(1200L, (Math.max(lineCount, lineCount2) * 70) + 700));
                        long uptimeMillis = SystemClock.uptimeMillis();
                        nr nrVar2 = o1.J;
                        ChatActivityEnterView chatActivityEnterView = sfVar.a;
                        chatActivityEnterView.G1 = uptimeMillis + max;
                        chatActivityEnterView.H1 = nrVar2;
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
                        o1 o1Var = this.a;
                        this.a.H = new g0(this, min2, Math.min(o1Var.h(((o1Var.w + o1Var.x) * 0.9f) + (o1Var.b.getLayout() != null ? r5.getWidth() : 0.0f)) + ((long) (o1Var.F * 1000.0f)), max), 0);
                        jh.f fVar = this.a0;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                        org.telegram.messenger.g0.h3(new b0(this, 3), max + 32);
                        return;
                    }
                    f(0L, 240L);
                    gf gfVar2 = sfVar.a.F0;
                    Editable text2 = gfVar2.getText();
                    if (text2 == null) {
                        return;
                    }
                    int min3 = Math.min(this.I, text2.length());
                    this.L = true;
                    this.F.a();
                    text2.replace(min3, text2.length(), str);
                    k2 k2Var = this.F;
                    int length = str.length() + min3;
                    Editable editableText = k2Var.a.getEditableText();
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
                            h2 h2Var = new h2(j10 + 260, k2Var.b, k2Var.c);
                            h2Var.b = j10;
                            editableText.setSpan(h2Var, min3, i10, 33);
                            i7++;
                            min3 = i10;
                            z11 = z12;
                            text2 = text2;
                            uptimeMillis2 = uptimeMillis2;
                        }
                        editable = text2;
                        j3 = 45;
                        k2Var.g();
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
        sf sfVar2 = this.f;
        if (!z10) {
        }
    }

    public final int w() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    @Override // ai.d2
    public final void x(String str) {
        n1 n1Var = this.w;
        if (n1Var != null) {
            n1Var.setLanguage(str == null ? null : H(str));
        }
    }

    public final String y(String str) {
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

    public final String z() {
        Editable text = this.f.a.F0.getText();
        return text == null ? "" : text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }
}
