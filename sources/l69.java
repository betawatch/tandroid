// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class l69 implements no7, qq, co7, zu9, ca1, rz6, d39, aha, xo5, gj, x74, yr9, i33, n86, ir9 {
    public static l69 d;
    public final /* synthetic */ byte a;
    public final Object b;
    public static final Object c = new Object();
    public static final qne e = new qne(1);

    public l69(byte b) {
        due dueVar;
        this.a = b;
        byte b2 = 1;
        switch (b) {
            case 3:
                if (Build.VERSION.SDK_INT < 26) {
                    this.b = new v4(this);
                    break;
                } else {
                    this.b = new w4(this);
                    break;
                }
            case 26:
                this.b = new v39(hs4.l, b2);
                break;
            default:
                try {
                    dueVar = (due) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    dueVar = e;
                }
                due[] dueVarArr = {qne.b, dueVar};
                vse vseVar = new vse();
                vseVar.a = dueVarArr;
                Charset charset = foe.a;
                this.b = vseVar;
                break;
        }
    }

    public static Task I(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        yjb.c(1, new rld(callable, taskCompletionSource, (byte) 18));
        return taskCompletionSource.getTask();
    }

    public static l69 x() {
        l69 l69Var;
        synchronized (c) {
            l69Var = d;
            if (l69Var == null) {
                HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                handlerThread.start();
                l69 l69Var2 = new l69(handlerThread.getLooper());
                d = l69Var2;
                l69Var = l69Var2;
            }
        }
        return l69Var;
    }

    public static l69 y(int i) {
        Point point = gl.q;
        int i2 = (int) (point.x * 0.5f);
        int i3 = (int) (point.y * 0.5f);
        if (i2 == i3) {
            return new l69(i2, i3, new int[0]);
        }
        if (i == 3) {
            return new l69(i2, i3, new int[]{i3, i2});
        }
        return (i == 1) == (i2 < i3) ? new l69(i2, i3, new int[0]) : new l69(i3, i2, new int[0]);
    }

    @Override // zu9
    public final void A() {
        switch (this.a) {
            case 11:
                ((xk0) this.b).l1.M();
                break;
        }
    }

    @Override // x74
    public final void D(float f, int i) {
        c82 c82Var = (c82) this.b;
        c82Var.c.setLayerType(0, null);
        if (f == 0.0f && !c82Var.P) {
            c82Var.c.setVisibility(4);
            if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                c82Var.F.setFocusableInTouchMode(false);
            }
        }
        kk7.e().k(kk7.j1, 512);
    }

    @Override // co7
    public final void D2(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        aj0 aj0Var = (aj0) this.b;
        if (charSequence != null) {
            if (aj0Var.S()) {
                aj0Var.X(charSequence);
            }
            lj0 lj0Var = aj0Var.m0;
            hh7 hh7Var = lj0Var.q;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var.q = hh7Var;
            }
            lj0.f(hh7Var, null);
        }
    }

    public boolean F(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // ca1
    public final void G(String str) {
        hv0 hv0Var = (hv0) this.b;
        try {
            hv0Var.Q = System.currentTimeMillis();
            hv0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e2) {
            fa4.g(e2, true);
        }
    }

    public final JSONObject H() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(pm2.l(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        pm2.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    pm2.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            pm2.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            pm2.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // i33
    public final void K0() {
        ((t23) this.b).d.invalidate();
    }

    public final void L(int i, Object obj, nq9 nq9Var) {
        ck2 ck2Var = (ck2) this.b;
        ck2Var.A(i, 3);
        nq9Var.i((o3) obj, ck2Var.a);
        ck2Var.A(i, 4);
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    @Override // aha
    public final float P() {
        return b00.c(9.66f, dg0.d(((zi1) this.b).U0), 0);
    }

    @Override // aha
    public final int Q() {
        zi1 zi1Var = (zi1) this.b;
        return zi1Var.V0 + zi1Var.W0;
    }

    @Override // yr9
    public final boolean U1(int i) {
        return true;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        boolean z;
        int b;
        int c2;
        boolean z2;
        int d2 = vxcVar.d();
        bp bpVar = (bp) this.b;
        Context context = bpVar.e;
        int d3 = vxcVar.d();
        ActionBarContextView actionBarContextView = bpVar.E;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bpVar.E.getLayoutParams();
            if (bpVar.E.isShown()) {
                if (bpVar.m0 == null) {
                    bpVar.m0 = new Rect();
                    bpVar.n0 = new Rect();
                }
                Rect rect = bpVar.m0;
                Rect rect2 = bpVar.n0;
                rect.set(vxcVar.b(), vxcVar.d(), vxcVar.c(), vxcVar.a());
                ViewGroup viewGroup = bpVar.K;
                Method method = gfc.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e2) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = bpVar.K;
                WeakHashMap weakHashMap = jdc.a;
                vxc a = cdc.a(viewGroup2);
                if (a == null) {
                    c2 = 0;
                    b = 0;
                } else {
                    b = a.b();
                    c2 = a.c();
                }
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || bpVar.M != null) {
                    View view2 = bpVar.M;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c2;
                            bpVar.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    bpVar.M = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c2;
                    bpVar.K.addView(bpVar.M, -1, layoutParams);
                }
                View view4 = bpVar.M;
                r7 = view4 != null;
                if (r7 && view4.getVisibility() != 0) {
                    View view5 = bpVar.M;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & TLObject.FLAG_13) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!bpVar.R && r7) {
                    d3 = 0;
                }
                z = r7;
                r7 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r7 = false;
            }
            if (r7) {
                bpVar.E.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = bpVar.M;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return jdc.h(view, d2 != d3 ? vxcVar.f(vxcVar.b(), d3, vxcVar.c(), vxcVar.a()) : vxcVar);
    }

    @Override // ca1
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    @Override // ca1
    public final String Z0() {
        return ((hv0) this.b).j0;
    }

    @Override // ir9
    public final void a(int i, boolean z) {
        hf3 hf3Var = (hf3) this.b;
        gf3[] gf3VarArr = hf3Var.f;
        if (gf3VarArr[0].f == i) {
            return;
        }
        hf3Var.x = i == hf3Var.e.getFirstTabId();
        gf3 gf3Var = gf3VarArr[1];
        gf3Var.f = i;
        gf3Var.setVisibility(0);
        hf3Var.q0(true);
        hf3Var.r = z;
    }

    @Override // zu9
    public final int a0() {
        byte b = this.a;
        return 0;
    }

    @Override // n86
    public final void b() {
        q53 q53Var = (q53) this.b;
        q53Var.F.b();
        IOException iOException = q53Var.H;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // rz6
    public final void c(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
        byte b = this.a;
    }

    @Override // rz6
    public final Paint.FontMetricsInt d() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                return ((ib1) obj).f.getEditText().getPaint().getFontMetricsInt();
            default:
                return ((x02) obj).B2.getEditText().getPaint().getFontMetricsInt();
        }
    }

    @Override // d39
    public final void e(float f, float f2, int i, View view) {
        k27 messageObject;
        nf1 nf1Var = (nf1) this.b;
        HashSet hashSet = nf1Var.q0;
        if ((view instanceof uk1) && (messageObject = ((uk1) view).getMessageObject()) != null) {
            long j = messageObject.J0;
            if (j != -1) {
                if (hashSet.contains(Long.valueOf(j))) {
                    hashSet.remove(Long.valueOf(messageObject.J0));
                } else {
                    hashSet.add(Long.valueOf(messageObject.J0));
                }
                nf1Var.Z0(true);
                nf1Var.N0();
                nf1Var.F.f();
                return;
            }
        }
        nf1Var.L0(view, f, f2);
    }

    @Override // ir9
    public final void g(float f) {
        hf3 hf3Var = (hf3) this.b;
        gf3[] gf3VarArr = hf3Var.f;
        if (f != 1.0f || gf3VarArr[1].getVisibility() == 0) {
            if (hf3Var.r) {
                gf3VarArr[0].setTranslationX((-f) * r6.getMeasuredWidth());
                gf3VarArr[1].setTranslationX(gf3VarArr[0].getMeasuredWidth() - (f * gf3VarArr[0].getMeasuredWidth()));
            } else {
                gf3VarArr[0].setTranslationX(r6.getMeasuredWidth() * f);
                gf3VarArr[1].setTranslationX((f * gf3VarArr[0].getMeasuredWidth()) - gf3VarArr[0].getMeasuredWidth());
            }
            if (f == 1.0f) {
                gf3 gf3Var = gf3VarArr[0];
                gf3VarArr[0] = gf3VarArr[1];
                gf3VarArr[1] = gf3Var;
                gf3Var.setVisibility(8);
            }
        }
    }

    @Override // zu9
    public final CharSequence getContentDescription() {
        switch (this.a) {
            case 11:
                return null;
            default:
                return " ";
        }
    }

    @Override // rz6
    public final void h(TLRPC.TL_document tL_document, String str, Object obj) {
        byte b = this.a;
    }

    @Override // zu9
    public final void j(boolean z, float f) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                xk0.n1 = f;
                cja cjaVar = ((xk0) obj).l1;
                cjaVar.K();
                cjaVar.M();
                break;
            default:
                okb okbVar = (okb) ((uy0) obj);
                int i = (int) (bkb.q * 100.0f);
                int i2 = (int) (f * 100.0f);
                bkb.q = f;
                if (i != i2) {
                    ThemeActivity themeActivity = okbVar.f.e;
                    y29 y29Var = (y29) themeActivity.b.K(themeActivity.g0);
                    if (y29Var != null) {
                        ((mhb) y29Var.a).setText(k96.a0("AutoNightBrightnessInfo", null, 2131753791, Integer.valueOf((int) (bkb.q * 100.0f))));
                    }
                    bkb.E(true);
                    break;
                }
                break;
        }
    }

    @Override // rz6
    public final void k(int i, int i2, CharSequence charSequence, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                cb1 cb1Var = ((ib1) obj).f;
                if (cb1Var != null) {
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(cb1Var.getText());
                        spannableStringBuilder.replace(i, i2 + i, charSequence);
                        if (z) {
                            vu3.l(spannableStringBuilder, cb1Var.getEditText().getPaint().getFontMetricsInt(), false);
                        }
                        cb1Var.setText(spannableStringBuilder);
                        cb1Var.setSelection(i + charSequence.length());
                        break;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                }
                break;
            default:
                x02 x02Var = (x02) obj;
                if (x02Var.U0() != null) {
                    try {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(x02Var.U0().getText());
                        spannableStringBuilder2.replace(i, i2 + i, charSequence);
                        if (z) {
                            vu3.l(spannableStringBuilder2, x02Var.U0().getEditText().getPaint().getFontMetricsInt(), false);
                        }
                        x02Var.U0().setText(spannableStringBuilder2);
                        x02Var.U0().setSelection(i + charSequence.length());
                        break;
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                }
                break;
        }
    }

    @Override // rz6
    public final void m(String str) {
        byte b = this.a;
    }

    @Override // aha
    public final void o(boolean z) {
        Runnable runnable = ((zi1) this.b).S0;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ca1
    public final void onDismiss() {
        hv0 hv0Var = (hv0) this.b;
        hv0Var.v("scan_qr_popup_closed", null);
        hv0Var.i0 = false;
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        ((c82) this.b).i0(f);
    }

    @Override // d39
    public final boolean q(View view) {
        return false;
    }

    @Override // ir9
    public final boolean q2(int i, View view) {
        return false;
    }

    @Override // yr9
    public final void r(int i) {
        gl.d3(new hq1(this, (byte) 27));
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        ((ev1) this.b).a(Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    public u4 u(int i) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:237:0x033b, code lost:
    
        throw gm4.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0397 A[LOOP:21: B:146:0x022e->B:193:0x0397, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0362 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c93 v(xf4 xf4Var) {
        ge7 ge7Var;
        w34 w34Var;
        int i;
        int f;
        int f2;
        x9c D = xf4Var.D();
        w34 w34Var2 = xf4Var.C().a;
        hm4 C = xf4Var.C();
        x9c D2 = xf4Var.D();
        int i2 = ug8.G(8)[C.b];
        qj0 qj0Var = (qj0) xf4Var.b;
        int i3 = qj0Var.b;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (ir2.a(i2, i5, i6)) {
                    qj0Var.a(i6, i5);
                }
            }
        }
        int i7 = 2;
        int i8 = D2.a << 2;
        int i9 = i8 + 17;
        int i10 = D2.d;
        qj0 qj0Var2 = new qj0(i9, i9);
        qj0Var2.d(0, 0, 9, 9);
        int i11 = i8 + 9;
        qj0Var2.d(i11, 0, 8, 9);
        qj0Var2.d(0, i11, 9, 8);
        int[] iArr = D2.b;
        int length = iArr.length;
        int i12 = 0;
        while (i12 < length) {
            int i13 = iArr[i12] - 2;
            int i14 = i7;
            for (int i15 = i4; i15 < length; i15++) {
                if ((i12 != 0 || (i15 != 0 && i15 != length - 1)) && (i12 != length - 1 || i15 != 0)) {
                    qj0Var2.d(iArr[i15] - 2, i13, 5, 5);
                }
            }
            i12++;
            i7 = i14;
            i4 = 0;
        }
        int i16 = i7;
        int i17 = 6;
        int i18 = 1;
        qj0Var2.d(6, 9, 1, i8);
        qj0Var2.d(9, 6, i8, 1);
        if (D2.a > 6) {
            int i19 = i8 + 6;
            qj0Var2.d(i19, 0, 3, 6);
            qj0Var2.d(0, i19, 6, 3);
        }
        byte[] bArr = new byte[i10];
        int i20 = i3 - 1;
        int i21 = i20;
        boolean z = true;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i21 > 0) {
            if (i21 == i17) {
                i21--;
            }
            int i25 = 0;
            while (i25 < i3) {
                int i26 = z ? i20 - i25 : i25;
                int i27 = i18;
                int i28 = 0;
                for (int i29 = i16; i28 < i29; i29 = 2) {
                    int i30 = i21 - i28;
                    if (!qj0Var2.b(i30, i26)) {
                        i23++;
                        i24 <<= 1;
                        if (qj0Var.b(i30, i26)) {
                            i24 |= 1;
                        }
                        if (i23 == 8) {
                            bArr[i22] = (byte) i24;
                            i22++;
                            i23 = 0;
                            i24 = 0;
                        }
                    }
                    i28++;
                }
                i25++;
                i18 = i27;
                i16 = 2;
            }
            z = !z;
            i21 -= 2;
            i16 = 2;
            i17 = 6;
        }
        int i31 = i18;
        if (i22 != i10) {
            throw gm4.a();
        }
        if (i10 != D.d) {
            sc8.e();
            return null;
        }
        nfd nfdVar = D.c[w34Var2.ordinal()];
        w9c[] w9cVarArr = (w9c[]) nfdVar.b;
        byte b = nfdVar.a;
        int i32 = 0;
        for (w9c w9cVar : w9cVarArr) {
            i32 += w9cVar.a;
        }
        nfd[] nfdVarArr = new nfd[i32];
        int i33 = 0;
        for (w9c w9cVar2 : w9cVarArr) {
            int i34 = 0;
            while (i34 < w9cVar2.a) {
                byte b2 = w9cVar2.b;
                nfdVarArr[i33] = new nfd(b2, new byte[b + b2]);
                i34++;
                i33++;
            }
        }
        int length2 = ((byte[]) nfdVarArr[0].b).length;
        int i35 = i32 - 1;
        while (i35 >= 0 && ((byte[]) nfdVarArr[i35].b).length != length2) {
            i35--;
        }
        int i36 = i35 + 1;
        int i37 = length2 - b;
        int i38 = 0;
        int i39 = 0;
        while (i38 < i37) {
            int i40 = i39;
            int i41 = 0;
            while (i41 < i33) {
                ((byte[]) nfdVarArr[i41].b)[i38] = bArr[i40];
                i41++;
                i40++;
            }
            i38++;
            i39 = i40;
        }
        int i42 = i36;
        while (i42 < i33) {
            ((byte[]) nfdVarArr[i42].b)[i37] = bArr[i39];
            i42++;
            i39++;
        }
        boolean z2 = false;
        int length3 = ((byte[]) nfdVarArr[0].b).length;
        while (i37 < length3) {
            int i43 = i39;
            int i44 = 0;
            while (i44 < i33) {
                ((byte[]) nfdVarArr[i44].b)[i44 < i36 ? i37 : i37 + 1] = bArr[i43];
                i44++;
                i43++;
            }
            i37++;
            i39 = i43;
        }
        int i45 = 0;
        for (int i46 = 0; i46 < i32; i46++) {
            i45 += nfdVarArr[i46].a;
        }
        byte[] bArr2 = new byte[i45];
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i32) {
            nfd nfdVar2 = nfdVarArr[i48];
            byte[] bArr3 = (byte[]) nfdVar2.b;
            byte b3 = nfdVar2.a;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i50 = 0; i50 < length4; i50++) {
                iArr2[i50] = bArr3[i50] & 255;
            }
            try {
                int J1 = ((v39) this.b).J1(iArr2, bArr3.length - b3);
                for (int i51 = 0; i51 < b3; i51++) {
                    bArr3[i51] = (byte) iArr2[i51];
                }
                i47 += J1;
                int i52 = i49;
                int i53 = 0;
                while (i53 < b3) {
                    bArr2[i52] = bArr3[i53];
                    i53++;
                    i52++;
                }
                i48++;
                i49 = i52;
            } catch (y49 unused) {
                dg2 dg2Var = dg2.c;
                if (m19.a) {
                    throw new dg2();
                }
                throw dg2.c;
            }
        }
        rj0 rj0Var = new rj0(bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i31);
        int i54 = -1;
        int i55 = -1;
        boolean z3 = false;
        boolean z4 = false;
        ak1 ak1Var = null;
        while (true) {
            try {
                int d2 = rj0Var.d();
                ge7 ge7Var2 = ge7.c;
                if (d2 < 4 || (f2 = rj0Var.f(4)) == 0) {
                    ge7Var = ge7Var2;
                } else if (f2 == 1) {
                    ge7Var = ge7.d;
                } else if (f2 == 2) {
                    ge7Var = ge7.e;
                } else if (f2 == 3) {
                    ge7Var = ge7.f;
                } else if (f2 == 4) {
                    ge7Var = ge7.h;
                } else if (f2 == 5) {
                    ge7Var = ge7.s;
                } else if (f2 == 7) {
                    ge7Var = ge7.n;
                } else if (f2 == 8) {
                    ge7Var = ge7.r;
                } else if (f2 == 9) {
                    ge7Var = ge7.w;
                } else {
                    if (f2 != 13) {
                        throw new IllegalArgumentException();
                    }
                    ge7Var = ge7.x;
                }
                int ordinal = ge7Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 3) {
                        w34Var = w34Var2;
                        i = 1;
                        if (rj0Var.d() < 16) {
                            throw gm4.a();
                        }
                        i54 = rj0Var.f(8);
                        i55 = rj0Var.f(8);
                    } else if (ordinal == 5) {
                        w34Var = w34Var2;
                        i = 1;
                        int f3 = rj0Var.f(8);
                        if ((f3 & 128) == 0) {
                            f = f3 & kk7.K1;
                        } else if ((f3 & kk7.V2) == 128) {
                            f = ((f3 & 63) << 8) | rj0Var.f(8);
                        } else {
                            if ((f3 & kk7.A3) != 192) {
                                throw gm4.a();
                            }
                            f = ((f3 & 31) << 16) | rj0Var.f(16);
                        }
                        HashMap hashMap = ak1.c;
                        if (f < 0 || f >= 900) {
                            break;
                        }
                        ak1Var = (ak1) ak1.c.get(Integer.valueOf(f));
                        if (ak1Var == null) {
                            throw gm4.a();
                        }
                    } else if (ordinal == 7) {
                        w34Var = w34Var2;
                        i = 1;
                        z3 = true;
                        z2 = true;
                    } else if (ordinal == 8) {
                        w34Var = w34Var2;
                        i = 1;
                        z3 = true;
                        z4 = true;
                    } else if (ordinal != 9) {
                        int f4 = rj0Var.f(ge7Var.a(D));
                        int ordinal2 = ge7Var.ordinal();
                        w34Var = w34Var2;
                        if (ordinal2 == 1) {
                            xj7.e(rj0Var, sb, f4);
                        } else if (ordinal2 == 2) {
                            xj7.a(rj0Var, sb, f4, z3);
                        } else if (ordinal2 == 4) {
                            xj7.b(rj0Var, sb, f4, ak1Var, arrayList);
                        } else {
                            if (ordinal2 != 6) {
                                throw gm4.a();
                            }
                            xj7.d(rj0Var, sb, f4);
                        }
                    } else {
                        w34Var = w34Var2;
                        int f5 = rj0Var.f(4);
                        int f6 = rj0Var.f(ge7Var.a(D));
                        i = 1;
                        if (f5 == 1) {
                            xj7.c(rj0Var, sb, f6);
                        }
                    }
                    if (ge7Var != ge7Var2) {
                        c93 c93Var = new c93(bArr2, sb.toString(), arrayList.isEmpty() ? null : arrayList, w34Var.toString(), i54, i55, ak1Var != null ? z2 ? 4 : z4 ? 6 : 2 : z2 ? 3 : z4 ? 5 : i);
                        c93Var.d = Integer.valueOf(i47);
                        return c93Var;
                    }
                    w34Var2 = w34Var;
                } else {
                    w34Var = w34Var2;
                }
                i = 1;
                if (ge7Var != ge7Var2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw gm4.a();
            }
        }
    }

    public u4 w(int i) {
        return null;
    }

    private final void z() {
    }

    @Override // ir9
    public final void B() {
    }

    @Override // i33
    public final void t2() {
    }

    private final void n(String str) {
    }

    private final void t(String str) {
    }

    @Override // ca1
    public final void Q1(vf7 vf7Var) {
    }

    @Override // qq
    public void f(int i) {
    }

    @Override // i33
    public final void h2(boolean z) {
    }

    @Override // qq
    public void i(int i) {
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
    }

    @Override // i33
    public final void o1(boolean z) {
    }

    private final void C(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    private final void E(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    private final void J(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    private final void K(TLRPC.BotInlineResult botInlineResult, boolean z, int i) {
    }

    @Override // d39
    public final void l(View view, float f, float f2) {
    }

    public l69(Looper looper) {
        this.a = (byte) 1;
        o59 o59Var = new o59(looper);
        Looper.getMainLooper();
        this.b = o59Var;
    }

    public l69(Set set) {
        this.a = (byte) 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            k69 k69Var = (k69) it.next();
            HashMap hashMap = (HashMap) this.b;
            k69Var.getClass();
            hashMap.put(v43.class, k69Var.a);
        }
    }

    public /* synthetic */ l69(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public l69(ck2 ck2Var) {
        this.a = (byte) 23;
        Charset charset = mp5.a;
        this.b = ck2Var;
        ck2Var.a = this;
    }

    public l69(jb4 jb4Var) {
        this.a = (byte) 14;
        this.b = new File((File) jb4Var.c, "com.crashlytics.settings.json");
    }

    public l69(boolean z) {
        this.a = (byte) 7;
        this.b = new AtomicBoolean(z);
    }

    public l69(int i, int i2, int[] iArr) {
        this.a = (byte) 9;
        ip5[] ip5VarArr = new ip5[(iArr.length / 2) + 1];
        this.b = ip5VarArr;
        ip5 ip5Var = new ip5(i, i2);
        int i3 = 0;
        ip5VarArr[0] = ip5Var;
        while (i3 < iArr.length / 2) {
            int i4 = i3 + 1;
            int i5 = i3 << 1;
            ((ip5[]) this.b)[i4] = new ip5(iArr[i5], iArr[i5 + 1]);
            i3 = i4;
        }
    }
}
