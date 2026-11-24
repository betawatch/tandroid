// default package

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
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;
import org.telegram.ui.Components.d;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jm3 implements kn3 {
    public static final s33 I0 = new s33(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public et1 E0;
    public qn3 F;
    public float F0;
    public ln3 G;
    public ValueAnimator G0;
    public ll3 H;
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
    public lm Y;
    public bn3 a;
    public j92 a0;
    public long b;
    public float b0;
    public float c;
    public ValueAnimator c0;
    public boolean d;
    public lm e;
    public final d f;
    public boolean f0;
    public final Context h;
    public float[] h0;
    public float[] i0;
    public int j0;
    public String l0;
    public final wjb n;
    public int n0;
    public boolean o0;
    public long p0;
    public long q0;
    public long r0;
    public mm3 s;
    public an3 w;
    public LinearGradient w0;
    public boolean x0;
    public float y0;
    public byte r = 0;
    public final om3 x = new om3();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public kl3 K = ll3.c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();
    public int d0 = -6440822;
    public final k93 e0 = new k93((byte) 13);
    public final b7 g0 = new b7(this, 17);
    public final cm3 k0 = new cm3(this, 8);
    public final cm3 m0 = new cm3(this, 9);
    public final o1 s0 = new o1(this, 21);
    public final cm3 t0 = new cm3(this, 10);
    public final cm3 u0 = new cm3(this, 11);
    public final cm3 v0 = new cm3(this, 0);
    public final Matrix z0 = new Matrix();
    public final int[] B0 = new int[2];
    public final int[] C0 = new int[2];
    public final float[] D0 = new float[2];
    public final kr H0 = new kr(this, 2);

    public jm3(Context context, d dVar) {
        this.h = context;
        this.f = dVar;
        this.n = dVar.a.L4;
    }

    public static void G(TLRPC.TL_error tL_error) {
        u21 Y = u21.Y();
        if (Y == null) {
            return;
        }
        if (tL_error == null) {
            Log.d("Dictation", "style request failed (no error from the server)");
        } else if ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
            Y.I(R.raw.star_premium_2, k96.M0(2131754989, null), gl.T2(k96.M0(2131754990, null))).j();
        } else {
            Y.g0(tL_error, false);
        }
    }

    public static String H(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        vl3 L = DictationAsr.L(language);
        return (L == null || L.d(language).length < 2) ? r(str) : N(DictationAsr.g0(L, language));
    }

    public static String N(String str) {
        String O = O(str);
        if (O == null) {
            return r(str);
        }
        return r(str) + " (" + O + ")";
    }

    public static String O(String str) {
        String str2;
        String[] split = str.split("-");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Language");
        for (String str3 : split) {
            sb.append(h(str3));
        }
        String K0 = k96.K0(sb.toString());
        if (!TextUtils.isEmpty(K0)) {
            return K0;
        }
        Locale locale = k96.D0().y;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z = true;
        for (int i = 1; i < split.length; i++) {
            if (split[i].matches("[A-Za-z]{4}")) {
                str2 = new Locale.Builder().setScript(split[i]).build().getDisplayScript(locale);
            } else {
                if (split[i].matches("[A-Za-z]{2}|[0-9]{3}")) {
                    str2 = new Locale.Builder().setRegion(split[i]).build().getDisplayCountry(locale);
                }
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) || str2.equalsIgnoreCase(split[i])) {
                z = false;
            }
            if (i > 1) {
                sb2.append(", ");
                sb3.append(", ");
            }
            if (str2 != null && !str2.isEmpty()) {
                sb2.append(str2.substring(0, 1).toUpperCase(locale));
                sb2.append(str2.substring(1));
            }
            sb3.append(h(split[i]));
        }
        return z ? sb2.toString() : sb3.toString();
    }

    public static String h(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(substring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    public static String r(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = k96.D0().y;
        String displayLanguage = locale != null ? new Locale(language).getDisplayLanguage(locale) : null;
        if (displayLanguage == null || displayLanguage.isEmpty() || displayLanguage.equalsIgnoreCase(language)) {
            String K0 = rzb.K0(language);
            return K0 != null ? K0 : language;
        }
        return displayLanguage.substring(0, 1).toUpperCase(locale) + displayLanguage.substring(1);
    }

    public static int v(int i, int i2, boolean z) {
        int i3 = i | (-16777216);
        int i4 = i2 | (-16777216);
        int i5 = i3;
        for (int i6 = 1; i6 <= 20 && bm2.g(i5, i4) < 4.5d; i6++) {
            i5 = bm2.f(i6 * 0.04f, i3, z ? -1 : -16777216);
        }
        return i5;
    }

    public final void A(String str) {
        ln3 ln3Var;
        DictationAsr.Z(str);
        DictationAsr.s(DictationAsr.L(str));
        this.w.setLanguage(H(str));
        if (this.r != 1 || (ln3Var = this.G) == null) {
            return;
        }
        ln3Var.j(str);
    }

    public final void B() {
        Log.d("Dictation", "send from listening (" + x() + " chars)");
        ln3 ln3Var = this.G;
        if (ln3Var != null) {
            ln3Var.c();
        }
        this.G = null;
        gl.r(this.s0);
        this.F.a();
        this.s.setStopIsland(false);
        d dVar = this.f;
        dVar.a.L1(null, true);
        D(false);
        this.P = 0.0f;
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        E();
        C(false);
        this.r = (byte) 0;
        this.b0 = 0.0f;
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dVar.d(0.0f);
        this.s.e();
        dVar.b();
        dVar.a.u1();
    }

    public final void C(boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.f.a;
        ex1 ex1Var = chatActivityEnterView.F0;
        if (ex1Var == null || !z) {
            return;
        }
        chatActivityEnterView.F1 = false;
        if (ex1Var != null) {
            ex1Var.invalidate();
        }
    }

    public final void D(boolean z) {
        if (z) {
            this.b = 0L;
        }
        this.X = z;
        j92 j92Var = this.a0;
        if (j92Var != null) {
            j92Var.invalidate();
        }
    }

    public final void E() {
        et1 et1Var;
        mu1 mu1Var = this.f.a.F3;
        jq1 jq1Var = mu1Var != null ? mu1Var.A0 : null;
        if (jq1Var == null || (et1Var = this.E0) == null) {
            return;
        }
        if (et1Var != jq1Var) {
            kr krVar = this.H0;
            if (et1Var != null) {
                et1Var.r0(krVar);
            }
            this.E0 = jq1Var;
            jq1Var.i(krVar);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new dm3(this, (byte) 2));
        this.G0.addListener(new im2(this, (byte) 13));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(s33.h);
        this.G0.start();
    }

    public final void F(float f, float f2) {
        mm3 mm3Var = this.s;
        if (mm3Var != null && (mm3Var.a1 != f || mm3Var.Z0 != f2)) {
            mm3Var.a1 = f;
            mm3Var.Z0 = f2;
            mm3Var.invalidate();
        }
        an3 an3Var = this.w;
        if (an3Var != null) {
            if (an3Var.m0 == f && an3Var.l0 == f2) {
                return;
            }
            an3Var.m0 = f;
            an3Var.l0 = f2;
            an3Var.invalidate();
        }
    }

    public final void I(boolean z) {
        String str;
        ll3 ll3Var;
        byte b = this.r;
        if (b == 1 || b == 2) {
            return;
        }
        this.o0 = z;
        if (b == 4 && (ll3Var = this.H) != null) {
            ll3Var.b();
        }
        l();
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A0 = null;
        d dVar = this.f;
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        chatActivityEnterView.A1 = 0.0f;
        chatActivityEnterView.l2();
        Editable text = dVar.a.F0.getText();
        byte b2 = this.r;
        if (b2 == 3 || b2 == 4) {
            this.w.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
            E();
            qn3 qn3Var = this.F;
            if (qn3Var != null) {
                qn3Var.f(false);
            }
        }
        this.J = null;
        this.K = ll3.c;
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
        this.r = (byte) 1;
        dVar.b();
        this.U = SystemClock.uptimeMillis();
        gl.r(this.k0);
        cm3 cm3Var = this.m0;
        DictationAsr.T(cm3Var);
        DictationAsr.i(cm3Var);
        M(true);
        if (!z) {
            b(1.0f, 220L, s33.h);
        }
        gl.r(this.t0);
        mm3 mm3Var = this.s;
        float[] fArr = this.h0;
        int i = this.n0;
        mm3Var.getClass();
        boolean z2 = fArr != null;
        mm3Var.R = z2;
        if (z2) {
            mm3Var.S = fArr[0] - mm3Var.getLeft();
            mm3Var.T = fArr[1] - mm3Var.getTop();
            mm3Var.U.setColor(i);
        }
        mm3 mm3Var2 = this.s;
        float[] fArr2 = this.i0;
        int i2 = this.j0;
        int[] iArr = mm3Var2.o0;
        boolean z3 = fArr2 != null;
        mm3Var2.A0 = z3;
        if (z3) {
            mm3Var2.getLocationInWindow(iArr);
            mm3Var2.B0 = fArr2[0] - iArr[0];
            mm3Var2.C0 = fArr2[1] - iArr[1];
            mm3Var2.D0 = fArr2[2];
            mm3Var2.E0 = i2;
            mm3Var2.F0 = 0L;
            Drawable drawable = mm3Var2.J0;
            if (drawable == null) {
                drawable = mm3Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
                mm3Var2.J0 = drawable;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (this.i0 == null) {
            str = "null";
        } else {
            str = ((int) this.i0[0]) + "," + ((int) this.i0[1]) + " r" + ((int) this.i0[2]);
        }
        Log.d("Dictation", "commit morph from circle ".concat(str));
        this.i0 = null;
        this.h0 = null;
        if (!z) {
            this.s.setShown(true);
            this.s.setRightMode(0);
        }
        this.x.f();
        D(true);
        C(true);
        if (!z) {
            this.s.setStopIsland(true);
        }
        String c0 = DictationAsr.c0();
        this.w.setLanguage(c0 != null ? H(c0) : null);
        this.w.setSettings(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.r0 = uptimeMillis;
        this.q0 = uptimeMillis;
        this.U = uptimeMillis;
        this.p0 = 0L;
        if (!z) {
            gl.e3(this.s0, 300L);
        }
        boolean z4 = na7.c1().getInt("design_dictation_mode", 1) == 2;
        ChatActivityEnterView chatActivityEnterView2 = dVar.a;
        this.G = new ln3(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z4, this);
        ex1 ex1Var = dVar.a.F0;
        if (ex1Var != null) {
            ex1Var.n1 = true;
        }
        Log.d("Dictation", "start simulated=" + z4);
        ln3 ln3Var = this.G;
        ln3Var.h();
        gl.e3(new wc3(this, ln3Var, (byte) 20), (z4 || z) ? 120L : 420L);
    }

    public final ArrayList J() {
        l();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ll3.c);
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
            ArrayList arrayList = pm3.g;
            k93 k93Var = this.e0;
            if (!arrayList.contains(k93Var)) {
                arrayList.add(k93Var);
            }
        }
        try {
            cja cjaVar = this.f.a.c2;
            if ((cjaVar != null) && (backgroundImage = cjaVar.getBackgroundImage()) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect rect = new Rect(backgroundImage.getBounds());
                backgroundImage.setBounds(0, 0, 8, 8);
                backgroundImage.draw(canvas);
                backgroundImage.setBounds(rect);
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                for (int i = 0; i < 8; i++) {
                    for (int i2 = 0; i2 < 8; i2++) {
                        int pixel = createBitmap.getPixel(i2, i);
                        j += Color.red(pixel);
                        j2 += Color.green(pixel);
                        j3 += Color.blue(pixel);
                    }
                }
                createBitmap.recycle();
                this.d0 = Color.rgb((int) (j / 64), (int) (j2 / 64), (int) (j3 / 64));
            }
        } catch (Throwable unused) {
        }
        int i3 = bkb.c6;
        wjb wjbVar = this.n;
        int v0 = bkb.v0(i3, wjbVar);
        boolean c = om3.c(v0);
        om3 om3Var = this.x;
        if (om3Var.h != c) {
            om3Var.h = c;
        }
        int i4 = bkb.Oe;
        om3.h(bkb.v0(i4, wjbVar));
        om3Var.g(this.d0, bkb.v0(i4, wjbVar));
        int[] iArr = om3Var.B;
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (yw4.e != i5 || yw4.f != i6) {
            yw4.e = i5;
            yw4.f = i6;
            Arrays.fill(yw4.g[0], (Object) null);
        }
        if (this.s != null) {
            int v02 = bkb.v0(i4, wjbVar) | (-16777216);
            mm3 mm3Var = this.s;
            int f = bm2.f(0.1f, v02, iArr[6]);
            int i7 = iArr[4];
            mm3Var.e1 = v02;
            mm3Var.f1 = f;
            mm3Var.g1 = i7;
            if (!mm3Var.p0) {
                mm3Var.q0 = v02;
                mm3Var.r0 = f;
                mm3Var.s0 = null;
                mm3Var.invalidate();
            }
            this.s.setDayIconBase(bkb.v0(bkb.Ml, wjbVar));
        }
        this.w0 = null;
        j92 j92Var = this.a0;
        if (j92Var != null) {
            j92Var.invalidate();
        }
        mm3 mm3Var2 = this.s;
        if (mm3Var2 != null) {
            int i8 = bkb.Ml;
            int v03 = bkb.v0(i8, wjbVar);
            int v04 = bkb.v0(i4, wjbVar);
            mm3Var2.d.setColor(v03);
            mm3Var2.e.setColor(v04);
            mm3Var2.f.setColor(v04);
            mm3Var2.invalidate();
            mm3 mm3Var3 = this.s;
            int v05 = bkb.v0(i8, wjbVar);
            Paint paint = mm3Var3.d0;
            Paint paint2 = mm3Var3.c0;
            mm3Var3.p0 = c;
            mm3Var3.q0 = c ? om3.e(-13665281) : mm3Var3.e1;
            mm3Var3.r0 = c ? om3.e(-7447553) : mm3Var3.f1;
            mm3Var3.s0 = null;
            mm3Var3.b0.setColor(c ? 1714435648 : -1493172225);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(gl.N(0.66f));
            paint2.setColor(c ? 654311423 : 436207616);
            paint.setColor(16777216);
            paint.setShadowLayer(gl.N(1.0f), 0.0f, gl.N(0.33333334f), c ? 1711276032 : 855638016);
            mm3Var3.e0.setColor(v05);
            mm3Var3.invalidate();
            this.s.setSendIconColor(bkb.v0(bkb.Sf, wjbVar));
        }
        qn3 qn3Var = this.F;
        if (qn3Var != null) {
            qn3Var.c(v(bkb.v0(i4, wjbVar), v0, c), bkb.v0(bkb.Ke, wjbVar), c);
        }
        an3 an3Var = this.w;
        if (an3Var != null) {
            an3Var.e();
        }
    }

    public final void M(boolean z) {
        String concat = !DictationAsr.J(new long[2]) ? null : " ".concat(k96.a0(null, null, 2131745067, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d)))));
        if (z || !TextUtils.equals(concat, this.l0)) {
            this.l0 = concat;
            d dVar = this.f;
            if (concat == null) {
                dVar.a.L1(k96.M0(2131745060, null), true);
                return;
            }
            String M0 = k96.M0(2131745066, null);
            ChatActivityEnterView chatActivityEnterView = dVar.a;
            CharSequence charSequence = chatActivityEnterView.e;
            chatActivityEnterView.L1(TextUtils.concat(M0, concat), !(charSequence != null && charSequence.toString().startsWith(M0.toString())));
        }
    }

    @Override // kn3
    public final void a(String str, String str2) {
        if (q()) {
            if (!TextUtils.isEmpty(str)) {
                String y = y(str);
                if (this.N <= 0 || !y.isEmpty()) {
                    this.L = true;
                    this.F.e(this.I, -1, y);
                    this.L = false;
                }
            }
            qn3 qn3Var = this.F;
            Editable editableText = qn3Var.a.getEditableText();
            if (editableText != null) {
                qn3Var.d(editableText, editableText.length());
            }
            d dVar = this.f;
            ex1 ex1Var = dVar.a.F0;
            InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
            if (inputMethodManager != null && ex1Var != null) {
                inputMethodManager.restartInput(ex1Var);
            }
            this.G = null;
            if (str2 != null) {
                Log.d("Dictation", "stopped with error: ".concat(str2));
            }
            if (x() <= 0 && (this.N <= 0 || dVar.a.F0.getText().toString().trim().length() <= 0)) {
                k();
                K();
                this.w.setIsland(false);
                this.w.setSettings(false);
                this.w.setStopMode(false);
                E();
                this.r = (byte) 0;
                dVar.b();
                return;
            }
            this.r = (byte) 3;
            dVar.b();
            this.I = 0;
            this.s.setCancelShown(false);
            if (!this.o0) {
                i();
            }
            this.s.setHandOff(true);
            this.s.setRightMode(2);
            dVar.a.L1(null, true);
            D(false);
            this.P = 0.0f;
            gl.e3(this.t0, 460L);
            this.w.setStopMode(false);
            this.w.d(k96.M0(2131745064, null), false);
            ex1 ex1Var2 = dVar.a.F0;
            ex1Var2.setSelection(ex1Var2.length());
            if (!this.o0) {
                ex1Var2.requestFocus();
                gl.e3(new li3(ex1Var2, (byte) 10), 120L);
            }
            gl.e3(new cm3(this, (byte) 7), 90L);
        }
    }

    public final void b(float f, long j, s33 s33Var) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, f);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new dm3(this, (byte) 1));
        this.c0.setDuration(j);
        this.c0.setInterpolator(s33Var);
        this.c0.start();
    }

    public final void c(kl3 kl3Var) {
        boolean z;
        if (this.r == 3) {
            if (this.I > this.f.a.F0.length()) {
                this.I = 0;
            }
            String str = this.J;
            if (str != null) {
                z = true;
            } else {
                str = z();
                this.J = str;
                z = false;
            }
            if (TextUtils.isEmpty(str.trim())) {
                if (z) {
                    return;
                }
                this.J = null;
                return;
            }
            this.r = (byte) 4;
            this.b = 0L;
            this.V = SystemClock.uptimeMillis();
            this.w.d(kl3Var.d ? k96.M0(2131745063, null) : k96.a0(null, null, 2131745073, kl3Var.a()), true);
            this.F.a();
            this.F.f(true);
            this.x.f();
            mm3 mm3Var = this.s;
            if (mm3Var != null) {
                mm3Var.R0 = SystemClock.uptimeMillis();
                mm3Var.setVisibility(0);
                mm3Var.y = true;
                mm3Var.E = false;
                mm3Var.R = false;
                mm3Var.A0 = false;
                mm3Var.L0 = false;
                mm3Var.l0 = false;
                mm3Var.l1 = false;
                mm3Var.F.e(true, 1.0f);
                mm3Var.G.e(true, 0.0f);
                mm3Var.H.e(true, 0.0f);
                mm3Var.I.e(true, 0.0f);
                mm3Var.J.e(true, 1.0f);
                mm3Var.O0.e(true, 0.0f);
                mm3Var.b1 = 0L;
                mm3Var.N0.e(true, 1.0f);
                mm3Var.L = 3;
                mm3Var.invalidate();
            }
            j92 j92Var = this.a0;
            if (j92Var != null) {
                j92Var.invalidate();
            }
            kl3 kl3Var2 = this.K;
            this.K = kl3Var;
            this.H.a(kl3Var, str, new xf((Object) this, (Object) kl3Var2, z, (Object) kl3Var, (byte) 4));
        }
    }

    @Override // kn3
    public final void d(float f) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f > 0.38f) {
            long j = this.p0;
            if (j == 0) {
                this.p0 = uptimeMillis;
                j = uptimeMillis;
            }
            if (uptimeMillis - j >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.p0 = 0L;
        }
        mm3 mm3Var = this.s;
        if (mm3Var != null) {
            mm3Var.setLevel(f);
        }
        if (this.o0 && (recordCircle = (chatActivityEnterView = this.f.a).D2) != null && chatActivityEnterView.v3) {
            recordCircle.setAmplitude(f * 1800.0f);
        }
    }

    @Override // kn3
    public final void e(String str) {
        f(-1, str);
    }

    @Override // kn3
    public final void f(int i, String str) {
        if (q()) {
            this.q0 = SystemClock.uptimeMillis();
            if (str == null) {
                str = "";
            }
            String y = y(str);
            int max = i < 0 ? -1 : Math.max(0, Math.min(y.length(), i - (str.length() - y.length())));
            this.L = true;
            this.F.e(this.I, max, y);
            this.L = false;
        }
    }

    @Override // kn3
    public final void g(String str) {
        an3 an3Var = this.w;
        if (an3Var != null) {
            an3Var.setLanguage(str == null ? null : H(str));
        }
    }

    public final void i() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new dm3(this, (byte) 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(s33.g);
        this.A0.start();
    }

    public final void j(long j, long j2) {
        mm3 mm3Var = this.s;
        if (mm3Var == null) {
            return;
        }
        if (mm3Var.L == 3) {
            mm3Var.b1 = SystemClock.uptimeMillis() + j;
            mm3Var.c1 = Math.max(1L, j2);
            mm3Var.invalidate();
        }
        gl.e3(new cm3(this, (byte) 6), j + j2 + 60);
    }

    public final void k() {
        gl.r(this.s0);
        mm3 mm3Var = this.s;
        if (mm3Var != null) {
            mm3Var.setStopIsland(false);
        }
        gl.r(this.t0);
        gl.r(this.k0);
        cm3 cm3Var = this.u0;
        gl.r(cm3Var);
        cm3 cm3Var2 = this.v0;
        gl.r(cm3Var2);
        mm3 mm3Var2 = this.s;
        mm3Var2.L0 = true;
        mm3Var2.R = false;
        SystemClock.uptimeMillis();
        if (mm3Var2.J0 == null) {
            Drawable mutate = mm3Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            mm3Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        mm3Var2.invalidate();
        if (!this.o0) {
            i();
        }
        D(false);
        this.P = 0.0f;
        gl.e3(cm3Var, 30L);
        gl.e3(cm3Var2, 310L);
    }

    public final void l() {
        il0 il0Var;
        al0 al0Var;
        d dVar = this.f;
        cja cjaVar = dVar.a.c2;
        mm3 mm3Var = this.s;
        Context context = this.h;
        byte b = 0;
        if (mm3Var == null) {
            mm3 mm3Var2 = new mm3(context, this);
            this.s = mm3Var2;
            mm3Var2.setBorderColorSource(new bm3(this, b));
            this.s.setVisibility(8);
        }
        ViewParent parent = this.s.getParent();
        mm3 mm3Var3 = this.s;
        if (parent != cjaVar) {
            gl.B2(mm3Var3);
            cjaVar.addView(this.s, nme.e(-1, -1, 80));
        } else {
            mm3Var3.bringToFront();
        }
        mm3 mm3Var4 = this.s;
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        ew1 ew1Var = chatActivityEnterView.R0;
        a aVar = chatActivityEnterView.a1;
        mm3Var4.b = ew1Var;
        mm3Var4.c = aVar;
        mm3Var4.setBubbleProvider(new lj9((Object) this, (byte) 29));
        an3 an3Var = this.w;
        if (an3Var == null) {
            an3Var = new an3(context, this.n, this);
            this.w = an3Var;
        }
        ViewParent parent2 = an3Var.getParent();
        an3 an3Var2 = this.w;
        if (parent2 != cjaVar) {
            gl.B2(an3Var2);
            cjaVar.addView(this.w, nme.e(-1, -1, 80));
        } else {
            an3Var2.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = dVar.a;
        int i = ChatActivityEnterView.r7;
        j92 C0 = chatActivityEnterView2.C0();
        j92 j92Var = this.a0;
        if (C0 != j92Var) {
            if (j92Var != null) {
                j92Var.f = null;
            }
            this.a0 = C0;
            this.Y = C0 != null ? new lm(C0, 0L, 380L, new s33(0.22d, 0.61d, 0.36d, 1.0d)) : null;
            this.e = C0 != null ? new lm(C0, 1L, 300L, s33.g) : null;
        }
        j92 j92Var2 = this.a0;
        if (j92Var2 != null) {
            j92Var2.f = new bm3(this, (byte) 2);
            kl0 kl0Var = dVar.a.L1;
            if (kl0Var != null && (il0Var = j92Var2.n) != null && (al0Var = il0Var.w) != null) {
                il0 c = kl0Var.c(this.w, al0Var, false);
                il0 c2 = kl0Var.c(this.w, this.a0.n.w, false);
                an3 an3Var3 = this.w;
                il0 c3 = kl0Var.c(an3Var3, this.a0.n.w, false);
                an3Var3.I = c;
                an3Var3.J = c2;
                an3Var3.K = c3;
                c.r(gl.L(18.0f));
                c2.r(gl.L(18.0f));
                c3.r(gl.L(18.0f));
                an3 an3Var4 = this.w;
                an3Var4.setGearGlass(kl0Var.c(an3Var4, this.a0.n.w, false));
                mm3 mm3Var5 = this.s;
                if (mm3Var5 != null) {
                    mm3Var5.setStopGlass(kl0Var.c(mm3Var5, new c6e(), false));
                }
            }
        }
        ex1 ex1Var = dVar.a.F0;
        if (this.F == null) {
            qn3 qn3Var = new qn3(ex1Var);
            this.F = qn3Var;
            qn3Var.h = new bm3(this, (byte) 4);
            this.a = new bn3(ex1Var);
            ex1Var.addTextChangedListener(this.g0);
        }
        if (this.H == null) {
            this.H = new ll3(dVar.a.R);
        }
        L();
    }

    public final void m() {
        d dVar = this.f;
        ex1 ex1Var = dVar.a.F0;
        if (ex1Var != null) {
            ex1Var.n1 = false;
        }
        ln3 ln3Var = this.G;
        if (ln3Var != null) {
            ln3Var.c();
        }
        this.G = null;
        ll3 ll3Var = this.H;
        if (ll3Var != null) {
            ll3Var.b();
        }
        if (q()) {
            k();
        }
        an3 an3Var = this.w;
        if (an3Var != null) {
            an3Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        this.r = (byte) 0;
        D(false);
        bn3 bn3Var = this.a;
        if (bn3Var != null) {
            bn3Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        mm3 mm3Var = this.s;
        if (mm3Var != null && mm3Var.getRightMode() == 3) {
            this.s.e();
        }
        qn3 qn3Var = this.F;
        if (qn3Var != null) {
            qn3Var.f(false);
        }
        C(false);
        E();
        dVar.b();
    }

    public final boolean n(RectF rectF) {
        il0 il0Var;
        j92 j92Var = this.a0;
        if (j92Var == null || (il0Var = j92Var.n) == null) {
            return false;
        }
        Rect rect = il0Var.S.m;
        if (rect.isEmpty()) {
            return false;
        }
        this.a0.getLocationInWindow(this.E);
        rectF.set(rect);
        rectF.offset(r3[0], r3[1]);
        return true;
    }

    public final boolean o() {
        return this.r != 0;
    }

    public final boolean p() {
        return this.o0 && this.r != 0;
    }

    public final boolean q() {
        byte b = this.r;
        return b == 1 || b == 2;
    }

    public final boolean s(float[] fArr) {
        ex1 ex1Var = this.f.a.F0;
        if (this.a0 == null || ex1Var == null || ex1Var.getLayout() == null) {
            return false;
        }
        this.a0.getLocationInWindow(this.B0);
        ex1Var.getLocationInWindow(this.C0);
        fArr[0] = (ex1Var.getTotalPaddingLeft() + (r5[0] - r3[0])) - ex1Var.getScrollX();
        fArr[1] = (ex1Var.getTotalPaddingTop() + (r5[1] - r3[1])) - ex1Var.getScrollY();
        return true;
    }

    public final void t() {
        if (q()) {
            ln3 ln3Var = this.G;
            if (ln3Var != null) {
                ln3Var.c();
            }
            this.G = null;
            d dVar = this.f;
            Editable text = dVar.a.F0.getText();
            if (text != null && this.I <= text.length()) {
                this.L = true;
                this.F.a();
                text.delete(this.I, text.length());
                this.L = false;
            }
            K();
            k();
            C(false);
            this.w.setIsland(false);
            this.w.setSettings(false);
            this.w.setStopMode(false);
            E();
            this.r = (byte) 0;
            dVar.b();
        }
    }

    public final void u() {
        if (this.r == 1) {
            gl.r(this.s0);
            this.r = (byte) 2;
            this.s.setStopIsland(false);
            this.s.setRightMode(1);
            this.s.setCancelShown(false);
            ln3 ln3Var = this.G;
            if (ln3Var != null) {
                ln3Var.m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(String str) {
        boolean z;
        Editable editable;
        long j;
        il0 il0Var;
        boolean c = om3.c(bkb.v0(bkb.c6, this.n));
        boolean z2 = true;
        if (this.a != null && this.a0 != null) {
            float[] fArr = this.D0;
            if (s(fArr) && (il0Var = this.a0.n) != null) {
                if (!il0Var.S.m.isEmpty()) {
                    float centerY = (r7.centerY() - fArr[1]) * 0.9f;
                    z = this.a.b((((r7.width() * (-0.35f)) + r7.left) - fArr[0]) + centerY, (((r7.width() * 1.35f) + r7.left) - fArr[0]) + centerY, om3.e(c ? -7358721 : -15363160), c);
                    this.F.f(false);
                    d dVar = this.f;
                    if (!z) {
                        ex1 ex1Var = dVar.a.F0;
                        Editable text = ex1Var.getText();
                        if (text == null) {
                            return;
                        }
                        Layout layout = ex1Var.getLayout();
                        int lineCount = layout != null ? layout.getLineCount() : 1;
                        int width = (ex1Var.getWidth() - ex1Var.getTotalPaddingLeft()) - ex1Var.getTotalPaddingRight();
                        int lineCount2 = width <= 0 ? 1 : StaticLayout.Builder.obtain(str, 0, str.length(), ex1Var.getPaint(), width).setLineSpacing(ex1Var.getLineSpacingExtra(), ex1Var.getLineSpacingMultiplier()).setIncludePad(ex1Var.getIncludeFontPadding()).build().getLineCount();
                        s33 s33Var = bn3.J;
                        long max = Math.max(800L, Math.min(1200L, (Math.max(lineCount, lineCount2) * 70) + 700));
                        long uptimeMillis = SystemClock.uptimeMillis();
                        s33 s33Var2 = bn3.J;
                        ChatActivityEnterView chatActivityEnterView = dVar.a;
                        chatActivityEnterView.G1 = uptimeMillis + max;
                        chatActivityEnterView.H1 = s33Var2;
                        int min = Math.min(this.I, text.length());
                        this.L = true;
                        this.F.a();
                        BaseInputConnection.removeComposingSpans(text);
                        text.replace(min, text.length(), str);
                        ex1Var.setSelection(text.length());
                        this.L = false;
                        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.restartInput(ex1Var);
                        }
                        this.a.a(max);
                        this.b = uptimeMillis + ((long) (max * 0.87f));
                        long min2 = Math.min(this.a.h(r0.w * 0.9f), max);
                        bn3 bn3Var = this.a;
                        this.a.H = new w20(this, min2, Math.min(bn3Var.h(((bn3Var.w + bn3Var.x) * 0.9f) + (bn3Var.b.getLayout() != null ? r5.getWidth() : 0.0f)) + ((long) (bn3Var.F * 1000.0f)), max), (byte) 3);
                        j92 j92Var = this.a0;
                        if (j92Var != null) {
                            j92Var.invalidate();
                        }
                        gl.e3(new cm3(this, (byte) 3), max + 32);
                        return;
                    }
                    j(0L, 240L);
                    ex1 ex1Var2 = dVar.a.F0;
                    Editable text2 = ex1Var2.getText();
                    if (text2 != null) {
                        int min3 = Math.min(this.I, text2.length());
                        this.L = true;
                        this.F.a();
                        text2.replace(min3, text2.length(), str);
                        qn3 qn3Var = this.F;
                        int length = str.length() + min3;
                        Editable editableText = qn3Var.a.getEditableText();
                        if (editableText == null) {
                            editable = text2;
                            j = 45;
                        } else {
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            int i = 0;
                            loop0: while (min3 < length) {
                                while (min3 < length) {
                                    if (Character.isWhitespace(editableText.charAt(min3))) {
                                        min3++;
                                    } else {
                                        int i2 = min3;
                                        while (i2 < length && !Character.isWhitespace(editableText.charAt(i2))) {
                                            i2++;
                                        }
                                        boolean z3 = z2;
                                        long j2 = (i * 45) + uptimeMillis2;
                                        nn3 nn3Var = new nn3(j2 + 260, qn3Var.b, qn3Var.c);
                                        nn3Var.b = j2;
                                        editableText.setSpan(nn3Var, min3, i2, 33);
                                        i++;
                                        min3 = i2;
                                        z2 = z3;
                                        text2 = text2;
                                        uptimeMillis2 = uptimeMillis2;
                                    }
                                }
                                break loop0;
                            }
                            editable = text2;
                            j = 45;
                            qn3Var.g();
                        }
                        this.W = (j * str.split("\\s+").length) + SystemClock.uptimeMillis() + 375;
                        j92 j92Var2 = this.a0;
                        if (j92Var2 != null) {
                            j92Var2.invalidate();
                        }
                        ex1Var2.setSelection(editable.length());
                        this.L = false;
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        this.F.f(false);
        d dVar2 = this.f;
        if (!z) {
        }
    }

    public final int x() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    public final String y(String str) {
        if (str == null) {
            str = "";
        }
        this.M = str;
        if (this.N <= 0) {
            return str;
        }
        int length = str.length();
        int i = this.N;
        String substring = length > i ? str.substring(i) : "";
        int i2 = 0;
        while (i2 < substring.length() && Character.isWhitespace(substring.charAt(i2))) {
            i2++;
        }
        String substring2 = substring.substring(i2);
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
