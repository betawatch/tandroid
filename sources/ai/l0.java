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
import c8.na;
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
import org.telegram.ui.Components.a31;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.ge;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.rf;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.bj;
import org.telegram.ui.bn;
import org.telegram.ui.tl;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class l0 implements v1 {
    public static final kr I0 = new kr(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public final int[] B0;
    public final int[] C0;
    public final float[] D0;
    public tl E0;
    public b2 F;
    public float F0;
    public w1 G;
    public ValueAnimator G0;
    public d H;
    public final f0 H0;
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
    public j1 a;
    public jh.f a0;
    public long b;
    public float b0;
    public float c;
    public ValueAnimator c0;
    public boolean d;
    public int d0;
    public c6 e;
    public final a3.l e0;
    public final rf f;
    public boolean f0;
    public final ah.j g0;
    public final Context h;
    public float[] h0;
    public float[] i0;
    public int j0;
    public final x k0;
    public String l0;
    public final x m0;
    public final i6 n;
    public int n0;
    public boolean o0;
    public long p0;
    public long q0;
    public long r0;
    public o0 s;
    public final sa s0;
    public final x t0;
    public final x u0;
    public final x v0;
    public i1 w;
    public LinearGradient w0;
    public boolean x0;
    public float y0;
    public final Matrix z0;
    public int r = 0;
    public final q0 x = new q0();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public c K = d.c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();

    public l0(Context context, rf rfVar) {
        new Rect();
        this.d0 = -6440822;
        this.e0 = new a3.l(11);
        this.g0 = new ah.j(this, 1);
        this.k0 = new x(this, 8);
        this.m0 = new x(this, 9);
        this.s0 = new sa(this, 1);
        this.t0 = new x(this, 10);
        this.u0 = new x(this, 11);
        this.v0 = new x(this, 0);
        this.z0 = new Matrix();
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new float[2];
        this.H0 = new f0(this, 0);
        this.h = context;
        this.f = rfVar;
        this.n = rfVar.a.M4;
    }

    public static void E(TLRPC.TL_error tL_error) {
        kc Y = kc.Y();
        if (Y == null) {
            return;
        }
        if (tL_error != null && ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text))) {
            Y.I(R.raw.star_premium_2, gd.N0(2131754989, null), org.telegram.messenger.g0.W2(gd.N0(2131754990, null))).j();
        } else if (tL_error != null) {
            Y.g0(tL_error, false);
        } else {
            Log.d("Dictation", "style request failed (no error from the server)");
        }
    }

    public static String F(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        q M = DictationAsr.M(language);
        return (M == null || M.d(language).length < 2) ? o(str) : L(DictationAsr.g0(M, language));
    }

    public static String L(String str) {
        String N = N(str);
        if (N == null) {
            return o(str);
        }
        return o(str) + " (" + N + ")";
    }

    public static String N(String str) {
        String str2;
        String[] split = str.split("-");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Language");
        for (String str3 : split) {
            sb2.append(d(str3));
        }
        String L0 = gd.L0(sb2.toString());
        if (!TextUtils.isEmpty(L0)) {
            return L0;
        }
        Locale locale = gd.E0().y;
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

    public static String o(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = gd.E0().y;
        String displayLanguage = locale != null ? new Locale(language).getDisplayLanguage(locale) : null;
        if (displayLanguage == null || displayLanguage.isEmpty() || displayLanguage.equalsIgnoreCase(language)) {
            String Q0 = a31.Q0(language);
            return Q0 != null ? Q0 : language;
        }
        return displayLanguage.substring(0, 1).toUpperCase(locale) + displayLanguage.substring(1);
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
        hf hfVar = chatActivityEnterView.F0;
        if (hfVar == null || !z10) {
            return;
        }
        chatActivityEnterView.F1 = false;
        if (hfVar != null) {
            hfVar.invalidate();
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
        bn bnVar = this.f.a.F3;
        bj bjVar = bnVar != null ? bnVar.A0 : null;
        if (bjVar == null || (tlVar = this.E0) == null) {
            return;
        }
        if (tlVar != bjVar) {
            f0 f0Var = this.H0;
            if (tlVar != null) {
                tlVar.q0(f0Var);
            }
            this.E0 = bjVar;
            bjVar.i(f0Var);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new y(this, 2));
        this.G0.addListener(new g0(this, 0));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(kr.h);
        this.G0.start();
    }

    public final void D(float f10, float f11) {
        o0 o0Var = this.s;
        if (o0Var != null && (o0Var.a1 != f10 || o0Var.Z0 != f11)) {
            o0Var.a1 = f10;
            o0Var.Z0 = f11;
            o0Var.invalidate();
        }
        i1 i1Var = this.w;
        if (i1Var != null) {
            if (i1Var.m0 == f10 && i1Var.l0 == f11) {
                return;
            }
            i1Var.m0 = f10;
            i1Var.l0 = f11;
            i1Var.invalidate();
        }
    }

    public final void G(boolean z10) {
        String str;
        d dVar;
        int i7 = this.r;
        if (i7 == 1 || i7 == 2) {
            return;
        }
        this.o0 = z10;
        if (i7 == 4 && (dVar = this.H) != null) {
            dVar.b();
        }
        i();
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A0 = null;
        rf rfVar = this.f;
        ChatActivityEnterView chatActivityEnterView = rfVar.a;
        chatActivityEnterView.A1 = 0.0f;
        chatActivityEnterView.o2();
        Editable text = rfVar.a.F0.getText();
        int i10 = this.r;
        if (i10 == 3 || i10 == 4) {
            this.w.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
            C();
            b2 b2Var = this.F;
            if (b2Var != null) {
                b2Var.f(false);
            }
        }
        this.J = null;
        this.K = d.c;
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
        rfVar.b();
        this.U = SystemClock.uptimeMillis();
        org.telegram.messenger.g0.r(this.k0);
        x xVar = this.m0;
        DictationAsr.U(xVar);
        DictationAsr.l(xVar);
        K(true);
        if (!z10) {
            b(1.0f, 220L, kr.h);
        }
        org.telegram.messenger.g0.r(this.t0);
        o0 o0Var = this.s;
        float[] fArr = this.h0;
        int i11 = this.n0;
        o0Var.getClass();
        boolean z11 = fArr != null;
        o0Var.R = z11;
        if (z11) {
            o0Var.S = fArr[0] - o0Var.getLeft();
            o0Var.T = fArr[1] - o0Var.getTop();
            o0Var.U.setColor(i11);
        }
        o0 o0Var2 = this.s;
        float[] fArr2 = this.i0;
        int i12 = this.j0;
        int[] iArr = o0Var2.o0;
        boolean z12 = fArr2 != null;
        o0Var2.A0 = z12;
        if (z12) {
            o0Var2.getLocationInWindow(iArr);
            o0Var2.B0 = fArr2[0] - iArr[0];
            o0Var2.C0 = fArr2[1] - iArr[1];
            o0Var2.D0 = fArr2[2];
            o0Var2.E0 = i12;
            o0Var2.F0 = 0L;
            if (o0Var2.J0 == null) {
                o0Var2.J0 = o0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            }
            o0Var2.J0.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
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
        String d02 = DictationAsr.d0();
        this.w.setLanguage(d02 != null ? F(d02) : null);
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
        ChatActivityEnterView chatActivityEnterView2 = rfVar.a;
        this.G = new w1(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z13, this);
        hf hfVar = rfVar.a.F0;
        if (hfVar != null) {
            hfVar.n1 = true;
        }
        Log.d("Dictation", "start simulated=" + z13);
        w1 w1Var = this.G;
        w1Var.h();
        org.telegram.messenger.g0.h3(new a1.e(14, this, w1Var), (z13 || z10) ? 120L : 420L);
    }

    public final ArrayList H() {
        i();
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void I() {
        Editable text = this.f.a.F0.getText();
        if (text == null || text.length() <= 0 || text.length() != this.I || !Character.isWhitespace(text.charAt(text.length() - 1))) {
            return;
        }
        this.L = true;
        text.delete(text.length() - 1, text.length());
        this.L = false;
    }

    public final void J() {
        Drawable backgroundImage;
        if (!this.f0) {
            this.f0 = true;
            ArrayList arrayList = r0.g;
            a3.l lVar = this.e0;
            if (!arrayList.contains(lVar)) {
                arrayList.add(lVar);
            }
        }
        try {
            cu0 cu0Var = this.f.a.c2;
            if ((cu0Var != null) && (backgroundImage = cu0Var.getBackgroundImage()) != null) {
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
        boolean c10 = q0.c(w02);
        q0 q0Var = this.x;
        if (q0Var.h != c10) {
            q0Var.h = c10;
        }
        int i12 = n6.Pe;
        q0.h(n6.w0(i12, i6Var));
        q0Var.g(this.d0, n6.w0(i12, i6Var));
        int[] iArr = q0Var.B;
        int i13 = iArr[0];
        int i14 = iArr[1];
        if (d2.e != i13 || d2.f != i14) {
            d2.e = i13;
            d2.f = i14;
            Arrays.fill(d2.g[0], (Object) null);
        }
        if (this.s != null) {
            int w03 = n6.w0(i12, i6Var) | (-16777216);
            o0 o0Var = this.s;
            int f10 = i0.a.f(0.1f, w03, iArr[6]);
            int i15 = iArr[4];
            o0Var.e1 = w03;
            o0Var.f1 = f10;
            o0Var.g1 = i15;
            if (!o0Var.p0) {
                o0Var.q0 = w03;
                o0Var.r0 = f10;
                o0Var.s0 = null;
                o0Var.invalidate();
            }
            this.s.setDayIconBase(n6.w0(n6.Nl, i6Var));
        }
        this.w0 = null;
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        o0 o0Var2 = this.s;
        if (o0Var2 != null) {
            int i16 = n6.Nl;
            int w04 = n6.w0(i16, i6Var);
            int w05 = n6.w0(i12, i6Var);
            o0Var2.d.setColor(w04);
            o0Var2.e.setColor(w05);
            o0Var2.f.setColor(w05);
            o0Var2.invalidate();
            o0 o0Var3 = this.s;
            int w06 = n6.w0(i16, i6Var);
            Paint paint = o0Var3.d0;
            Paint paint2 = o0Var3.c0;
            o0Var3.p0 = c10;
            o0Var3.q0 = c10 ? q0.e(-13665281) : o0Var3.e1;
            o0Var3.r0 = c10 ? q0.e(-7447553) : o0Var3.f1;
            o0Var3.s0 = null;
            o0Var3.b0.setColor(c10 ? 1714435648 : -1493172225);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
            paint2.setColor(c10 ? 654311423 : 436207616);
            paint.setColor(16777216);
            paint.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33333334f), c10 ? 1711276032 : 855638016);
            o0Var3.e0.setColor(w06);
            o0Var3.invalidate();
            this.s.setSendIconColor(n6.w0(n6.Tf, i6Var));
        }
        b2 b2Var = this.F;
        if (b2Var != null) {
            b2Var.c(t(n6.w0(i12, i6Var), w02, c10), n6.w0(n6.Le, i6Var), c10);
        }
        i1 i1Var = this.w;
        if (i1Var != null) {
            i1Var.e();
        }
    }

    public final void K(boolean z10) {
        String str;
        if (DictationAsr.K(new long[2])) {
            str = " " + gd.a0(null, null, 2131745063, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d))));
        } else {
            str = null;
        }
        if (z10 || !TextUtils.equals(str, this.l0)) {
            this.l0 = str;
            rf rfVar = this.f;
            if (str == null) {
                rfVar.a.N1(gd.N0(2131745056, null), true);
                return;
            }
            String N0 = gd.N0(2131745062, null);
            ChatActivityEnterView chatActivityEnterView = rfVar.a;
            CharSequence charSequence = chatActivityEnterView.e;
            chatActivityEnterView.N1(TextUtils.concat(N0, str), !(charSequence != null && charSequence.toString().startsWith(N0.toString())));
        }
    }

    @Override // ai.v1
    public final void M(int i7, String str) {
        if (n()) {
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

    @Override // ai.v1
    public final void P(String str) {
        i1 i1Var = this.w;
        if (i1Var != null) {
            i1Var.setLanguage(str == null ? null : F(str));
        }
    }

    @Override // ai.v1
    public final void a(String str, String str2) {
        if (n()) {
            if (!TextUtils.isEmpty(str)) {
                String w10 = w(str);
                if (this.N <= 0 || !w10.isEmpty()) {
                    this.L = true;
                    this.F.e(this.I, -1, w10);
                    this.L = false;
                }
            }
            b2 b2Var = this.F;
            Editable editableText = b2Var.a.getEditableText();
            if (editableText != null) {
                b2Var.d(editableText, editableText.length());
            }
            rf rfVar = this.f;
            hf hfVar = rfVar.a.F0;
            InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
            if (inputMethodManager != null && hfVar != null) {
                inputMethodManager.restartInput(hfVar);
            }
            this.G = null;
            if (str2 != null) {
                Log.d("Dictation", "stopped with error: ".concat(str2));
            }
            if (v() <= 0 && (this.N <= 0 || rfVar.a.F0.getText().toString().trim().length() <= 0)) {
                h();
                I();
                this.w.setIsland(false);
                this.w.setSettings(false);
                this.w.setStopMode(false);
                C();
                this.r = 0;
                rfVar.b();
                return;
            }
            this.r = 3;
            rfVar.b();
            this.I = 0;
            this.s.setCancelShown(false);
            if (!this.o0) {
                e();
            }
            this.s.setHandOff(true);
            this.s.setRightMode(2);
            rfVar.a.N1(null, true);
            B(false);
            this.P = 0.0f;
            org.telegram.messenger.g0.h3(this.t0, 460L);
            this.w.setStopMode(false);
            this.w.d(gd.N0(2131745060, null), false);
            hf hfVar2 = rfVar.a.F0;
            hfVar2.setSelection(hfVar2.length());
            if (!this.o0) {
                hfVar2.requestFocus();
                org.telegram.messenger.g0.h3(new a3.f(hfVar2, 6), 120L);
            }
            org.telegram.messenger.g0.h3(new x(this, 7), 90L);
        }
    }

    public final void b(float f10, long j3, TimeInterpolator timeInterpolator) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, f10);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new y(this, 1));
        this.c0.setDuration(j3);
        this.c0.setInterpolator(timeInterpolator);
        this.c0.start();
    }

    public final void c(c cVar) {
        if (this.r != 3) {
            return;
        }
        if (this.I > this.f.a.F0.length()) {
            this.I = 0;
        }
        String str = this.J;
        boolean z10 = str != null;
        if (str == null) {
            this.J = x();
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
        this.w.d(cVar.d ? gd.N0(2131745059, null) : gd.a0(null, null, 2131745069, cVar.a()), true);
        this.F.a();
        this.F.f(true);
        this.x.f();
        o0 o0Var = this.s;
        if (o0Var != null) {
            o0Var.R0 = SystemClock.uptimeMillis();
            o0Var.setVisibility(0);
            o0Var.y = true;
            o0Var.E = false;
            o0Var.R = false;
            o0Var.A0 = false;
            o0Var.L0 = false;
            o0Var.l0 = false;
            o0Var.l1 = false;
            o0Var.F.e(true, 1.0f);
            o0Var.G.e(true, 0.0f);
            o0Var.H.e(true, 0.0f);
            o0Var.I.e(true, 0.0f);
            o0Var.J.e(true, 1.0f);
            o0Var.O0.e(true, 0.0f);
            o0Var.b1 = 0L;
            o0Var.N0.e(true, 1.0f);
            o0Var.L = 3;
            o0Var.invalidate();
        }
        jh.f fVar = this.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
        c cVar2 = this.K;
        this.K = cVar;
        this.H.a(cVar, str2, new a3.g(this, cVar2, z10, cVar, 1));
    }

    public final void e() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new y(this, 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(kr.g);
        this.A0.start();
    }

    @Override // ai.v1
    public final void f(float f10) {
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
        o0 o0Var = this.s;
        if (o0Var != null) {
            o0Var.setLevel(f10);
        }
        if (this.o0 && (recordCircle = (chatActivityEnterView = this.f.a).D2) != null && chatActivityEnterView.v3) {
            recordCircle.setAmplitude(f10 * 1800.0f);
        }
    }

    public final void g(long j3, long j10) {
        o0 o0Var = this.s;
        if (o0Var == null) {
            return;
        }
        if (o0Var.L == 3) {
            o0Var.b1 = SystemClock.uptimeMillis() + j3;
            o0Var.c1 = Math.max(1L, j10);
            o0Var.invalidate();
        }
        org.telegram.messenger.g0.h3(new x(this, 6), j3 + j10 + 60);
    }

    public final void h() {
        org.telegram.messenger.g0.r(this.s0);
        o0 o0Var = this.s;
        if (o0Var != null) {
            o0Var.setStopIsland(false);
        }
        org.telegram.messenger.g0.r(this.t0);
        org.telegram.messenger.g0.r(this.k0);
        x xVar = this.u0;
        org.telegram.messenger.g0.r(xVar);
        x xVar2 = this.v0;
        org.telegram.messenger.g0.r(xVar2);
        o0 o0Var2 = this.s;
        o0Var2.L0 = true;
        o0Var2.R = false;
        SystemClock.uptimeMillis();
        if (o0Var2.J0 == null) {
            Drawable mutate = o0Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            o0Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        o0Var2.invalidate();
        if (!this.o0) {
            e();
        }
        B(false);
        this.P = 0.0f;
        org.telegram.messenger.g0.h3(xVar, 30L);
        org.telegram.messenger.g0.h3(xVar2, 310L);
    }

    public final void i() {
        fh.g gVar;
        gh.a aVar;
        rf rfVar = this.f;
        cu0 cu0Var = rfVar.a.c2;
        o0 o0Var = this.s;
        Context context = this.h;
        int i7 = 0;
        if (o0Var == null) {
            o0 o0Var2 = new o0(context, this);
            this.s = o0Var2;
            o0Var2.setBorderColorSource(new w(this, i7));
            this.s.setVisibility(8);
        }
        if (this.s.getParent() != cu0Var) {
            org.telegram.messenger.g0.E2(this.s);
            cu0Var.addView(this.s, na.e(-1, -1, 80));
        } else {
            this.s.bringToFront();
        }
        o0 o0Var3 = this.s;
        ChatActivityEnterView chatActivityEnterView = rfVar.a;
        ge geVar = chatActivityEnterView.R0;
        pe peVar = chatActivityEnterView.a1;
        o0Var3.b = geVar;
        o0Var3.c = peVar;
        int i10 = 4;
        o0Var3.setBubbleProvider(new cb.c(this, i10));
        if (this.w == null) {
            this.w = new i1(context, this.n, this);
        }
        if (this.w.getParent() != cu0Var) {
            org.telegram.messenger.g0.E2(this.w);
            cu0Var.addView(this.w, na.e(-1, -1, 80));
        } else {
            this.w.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = rfVar.a;
        int i11 = ChatActivityEnterView.s7;
        jh.f D0 = chatActivityEnterView2.D0();
        jh.f fVar = this.a0;
        if (D0 != fVar) {
            if (fVar != null) {
                fVar.f = null;
            }
            this.a0 = D0;
            this.Y = D0 != null ? new c6(D0, 0L, 380L, new kr(0.22d, 0.61d, 0.36d, 1.0d)) : null;
            this.e = D0 != null ? new c6(D0, 1L, 300L, kr.g) : null;
        }
        jh.f fVar2 = this.a0;
        if (fVar2 != null) {
            int i12 = 2;
            fVar2.f = new w(this, i12);
            dh.c cVar = rfVar.a.L1;
            if (cVar != null && (gVar = fVar2.n) != null && (aVar = gVar.w) != null) {
                fh.g c10 = cVar.c(this.w, aVar, false);
                fh.g c11 = cVar.c(this.w, this.a0.n.w, false);
                i1 i1Var = this.w;
                fh.g c12 = cVar.c(i1Var, this.a0.n.w, false);
                i1Var.I = c10;
                i1Var.J = c11;
                i1Var.K = c12;
                c10.r(org.telegram.messenger.g0.L(18.0f));
                c11.r(org.telegram.messenger.g0.L(18.0f));
                c12.r(org.telegram.messenger.g0.L(18.0f));
                i1 i1Var2 = this.w;
                i1Var2.setGearGlass(cVar.c(i1Var2, this.a0.n.w, false));
                o0 o0Var4 = this.s;
                if (o0Var4 != null) {
                    o0Var4.setStopGlass(cVar.c(o0Var4, new qb.a(i12), false));
                }
            }
        }
        hf hfVar = rfVar.a.F0;
        if (this.F == null) {
            b2 b2Var = new b2(hfVar);
            this.F = b2Var;
            b2Var.h = new w(this, i10);
            this.a = new j1(hfVar);
            hfVar.addTextChangedListener(this.g0);
        }
        if (this.H == null) {
            this.H = new d(rfVar.a.R);
        }
        J();
    }

    public final void j() {
        rf rfVar = this.f;
        hf hfVar = rfVar.a.F0;
        if (hfVar != null) {
            hfVar.n1 = false;
        }
        w1 w1Var = this.G;
        if (w1Var != null) {
            w1Var.c();
        }
        this.G = null;
        d dVar = this.H;
        if (dVar != null) {
            dVar.b();
        }
        if (n()) {
            h();
        }
        i1 i1Var = this.w;
        if (i1Var != null) {
            i1Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        this.r = 0;
        B(false);
        j1 j1Var = this.a;
        if (j1Var != null) {
            j1Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = rfVar.a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        o0 o0Var = this.s;
        if (o0Var != null && o0Var.getRightMode() == 3) {
            this.s.e();
        }
        b2 b2Var = this.F;
        if (b2Var != null) {
            b2Var.f(false);
        }
        A(false);
        C();
        rfVar.b();
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

    public final boolean l() {
        return this.r != 0;
    }

    public final boolean m() {
        return this.o0 && this.r != 0;
    }

    public final boolean n() {
        int i7 = this.r;
        return i7 == 1 || i7 == 2;
    }

    public final boolean p(float[] fArr) {
        hf hfVar = this.f.a.F0;
        if (this.a0 == null || hfVar == null || hfVar.getLayout() == null) {
            return false;
        }
        this.a0.getLocationInWindow(this.B0);
        hfVar.getLocationInWindow(this.C0);
        fArr[0] = (hfVar.getTotalPaddingLeft() + (r1[0] - r3[0])) - hfVar.getScrollX();
        fArr[1] = (hfVar.getTotalPaddingTop() + (r1[1] - r3[1])) - hfVar.getScrollY();
        return true;
    }

    public final void q() {
        if (n()) {
            w1 w1Var = this.G;
            if (w1Var != null) {
                w1Var.c();
            }
            this.G = null;
            rf rfVar = this.f;
            Editable text = rfVar.a.F0.getText();
            if (text != null && this.I <= text.length()) {
                this.L = true;
                this.F.a();
                text.delete(this.I, text.length());
                this.L = false;
            }
            I();
            h();
            A(false);
            this.w.setIsland(false);
            this.w.setSettings(false);
            this.w.setStopMode(false);
            C();
            this.r = 0;
            rfVar.b();
        }
    }

    @Override // ai.v1
    public final void r(String str) {
        M(-1, str);
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
        w1 w1Var = this.G;
        if (w1Var != null) {
            w1Var.m();
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
        boolean c10 = q0.c(n6.w0(n6.d6, this.n));
        boolean z11 = true;
        if (this.a != null && this.a0 != null) {
            float[] fArr = this.D0;
            if (p(fArr) && (gVar = this.a0.n) != null) {
                if (!gVar.R.m.isEmpty()) {
                    float centerY = (r7.centerY() - fArr[1]) * 0.9f;
                    z10 = this.a.b((((r7.width() * (-0.35f)) + r7.left) - fArr[0]) + centerY, (((r7.width() * 1.35f) + r7.left) - fArr[0]) + centerY, q0.e(c10 ? -7358721 : -15363160), c10);
                    this.F.f(false);
                    rf rfVar = this.f;
                    if (!z10) {
                        hf hfVar = rfVar.a.F0;
                        Editable text = hfVar.getText();
                        if (text == null) {
                            return;
                        }
                        Layout layout = hfVar.getLayout();
                        int lineCount = layout != null ? layout.getLineCount() : 1;
                        int width = (hfVar.getWidth() - hfVar.getTotalPaddingLeft()) - hfVar.getTotalPaddingRight();
                        int lineCount2 = width <= 0 ? 1 : StaticLayout.Builder.obtain(str, 0, str.length(), hfVar.getPaint(), width).setLineSpacing(hfVar.getLineSpacingExtra(), hfVar.getLineSpacingMultiplier()).setIncludePad(hfVar.getIncludeFontPadding()).build().getLineCount();
                        kr krVar = j1.J;
                        long max = Math.max(800L, Math.min(1200L, (Math.max(lineCount, lineCount2) * 70) + 700));
                        long uptimeMillis = SystemClock.uptimeMillis();
                        kr krVar2 = j1.J;
                        ChatActivityEnterView chatActivityEnterView = rfVar.a;
                        chatActivityEnterView.G1 = uptimeMillis + max;
                        chatActivityEnterView.H1 = krVar2;
                        int min = Math.min(this.I, text.length());
                        this.L = true;
                        this.F.a();
                        BaseInputConnection.removeComposingSpans(text);
                        text.replace(min, text.length(), str);
                        hfVar.setSelection(text.length());
                        this.L = false;
                        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.restartInput(hfVar);
                        }
                        this.a.a(max);
                        this.b = uptimeMillis + ((long) (max * 0.87f));
                        long min2 = Math.min(this.a.h(r0.w * 0.9f), max);
                        j1 j1Var = this.a;
                        this.a.H = new c0(this, min2, Math.min(j1Var.h(((j1Var.w + j1Var.x) * 0.9f) + (j1Var.b.getLayout() != null ? r5.getWidth() : 0.0f)) + ((long) (j1Var.F * 1000.0f)), max), 0);
                        jh.f fVar = this.a0;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                        org.telegram.messenger.g0.h3(new x(this, 3), max + 32);
                        return;
                    }
                    g(0L, 240L);
                    hf hfVar2 = rfVar.a.F0;
                    Editable text2 = hfVar2.getText();
                    if (text2 == null) {
                        return;
                    }
                    int min3 = Math.min(this.I, text2.length());
                    this.L = true;
                    this.F.a();
                    text2.replace(min3, text2.length(), str);
                    b2 b2Var = this.F;
                    int length = str.length() + min3;
                    Editable editableText = b2Var.a.getEditableText();
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
                            y1 y1Var = new y1(j10 + 260, b2Var.b, b2Var.c);
                            y1Var.b = j10;
                            editableText.setSpan(y1Var, min3, i10, 33);
                            i7++;
                            min3 = i10;
                            z11 = z12;
                            text2 = text2;
                            uptimeMillis2 = uptimeMillis2;
                        }
                        editable = text2;
                        j3 = 45;
                        b2Var.g();
                    }
                    this.W = (j3 * str.split("\\s+").length) + SystemClock.uptimeMillis() + 375;
                    jh.f fVar2 = this.a0;
                    if (fVar2 != null) {
                        fVar2.invalidate();
                    }
                    hfVar2.setSelection(editable.length());
                    this.L = false;
                    return;
                }
            }
        }
        z10 = false;
        this.F.f(false);
        rf rfVar2 = this.f;
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

    public final String x() {
        Editable text = this.f.a.F0.getText();
        return text == null ? "" : text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }

    public final void y(String str) {
        w1 w1Var;
        DictationAsr.a0(str);
        DictationAsr.v(DictationAsr.M(str));
        this.w.setLanguage(F(str));
        if (this.r != 1 || (w1Var = this.G) == null) {
            return;
        }
        w1Var.j(str);
    }

    public final void z() {
        Log.d("Dictation", "send from listening (" + v() + " chars)");
        w1 w1Var = this.G;
        if (w1Var != null) {
            w1Var.c();
        }
        this.G = null;
        org.telegram.messenger.g0.r(this.s0);
        this.F.a();
        this.s.setStopIsland(false);
        rf rfVar = this.f;
        rfVar.a.N1(null, true);
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
        rfVar.d(0.0f);
        this.s.e();
        rfVar.b();
        rfVar.a.w1();
    }
}
