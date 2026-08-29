package ab;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bg.b3;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l3.g0;
import lh.f3;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.jr;
import org.telegram.ui.c1;
import org.telegram.ui.c5;
import org.telegram.ui.s4;
import org.telegram.ui.th;
import org.telegram.ui.v4;
import org.telegram.ui.x4;
import r0.b0;
import r0.j0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m {
    public static m e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public m(View view) {
        cu[] cuVarArr = {new cu(), new cu(), new cu()};
        this.b = cuVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(g(cuVarArr[0], 0, 255, 0, 300), g(cuVarArr[1], 0, 255, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 300), g(cuVarArr[2], 0, 255, 300, 300), g(cuVarArr[0], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(cuVarArr[1], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(cuVarArr[2], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400));
        animatorSet.addListener(new f3(this, view));
    }

    public static void a(tb.e[][][] eVarArr, int i10, tb.e eVar) {
        tb.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.c];
        rb.d dVar = eVar.a;
        int ordinal = dVar.ordinal();
        char c3 = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c3 = 1;
            } else if (ordinal == 4) {
                c3 = 3;
            } else {
                if (ordinal != 6) {
                    throw new IllegalStateException("Illegal mode " + dVar);
                }
                c3 = 0;
            }
        }
        tb.e eVar2 = eVarArr2[c3];
        if (eVar2 == null || eVar2.f > eVar.f) {
            eVarArr2[c3] = eVar;
        }
    }

    public static boolean d(rb.d dVar, char c3) {
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c3 < '`' ? tb.c.a[c3] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return tb.c.b(String.valueOf(c3));
            }
        } else if (c3 < '0' || c3 > '9') {
            return false;
        }
        return true;
    }

    public static boolean e(x4 x4Var) {
        return (x4Var.a == null && x4Var.b == null) ? false : true;
    }

    public static m i() {
        if (e == null) {
            e = new m();
        }
        return e;
    }

    public static rb.e j(int i10) {
        int b10 = m1.j.b(i10);
        return b10 != 0 ? b10 != 1 ? rb.e.c(40) : rb.e.c(26) : rb.e.c(9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(rb.e eVar, tb.e[][][] eVarArr, int i10, tb.e eVar2) {
        int i11;
        int i12;
        char charAt;
        rb.d dVar;
        char charAt2;
        rb.d dVar2;
        char charAt3;
        rb.d dVar3;
        int i13;
        String str = (String) this.b;
        nb.e eVar3 = (nb.e) this.c;
        CharsetEncoder[] charsetEncoderArr = eVar3.a;
        CharsetEncoder[] charsetEncoderArr2 = eVar3.a;
        int length = charsetEncoderArr.length;
        int i14 = eVar3.b;
        if (i14 >= 0) {
            char charAt4 = str.charAt(i10);
            if (charsetEncoderArr2[i14].canEncode("" + charAt4)) {
                length = i14 + 1;
                i11 = length;
                for (i12 = i14; i12 < i11; i12++) {
                    char charAt5 = str.charAt(i10);
                    if (charsetEncoderArr2[i12].canEncode("" + charAt5)) {
                        a(eVarArr, i10, new tb.e(this, rb.d.h, i10, i12, 1, eVar2, eVar));
                    }
                }
                charAt = str.charAt(i10);
                dVar = rb.d.r;
                if (d(dVar, charAt)) {
                    a(eVarArr, i10, new tb.e(this, dVar, i10, 0, 1, eVar2, eVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i10);
                dVar2 = rb.d.e;
                if (d(dVar2, charAt2)) {
                    int i15 = i10 + 1;
                    a(eVarArr, i10, new tb.e(this, dVar2, i10, 0, (i15 >= length2 || !d(dVar2, str.charAt(i15))) ? 1 : 2, eVar2, eVar));
                }
                charAt3 = str.charAt(i10);
                dVar3 = rb.d.d;
                if (d(dVar3, charAt3)) {
                    return;
                }
                int i16 = i10 + 1;
                if (i16 >= length2 || !d(dVar3, str.charAt(i16))) {
                    i13 = 1;
                } else {
                    int i17 = i10 + 2;
                    i13 = (i17 >= length2 || !d(dVar3, str.charAt(i17))) ? 2 : 3;
                }
                a(eVarArr, i10, new tb.e(this, dVar3, i10, 0, i13, eVar2, eVar));
                return;
            }
        }
        i14 = 0;
        i11 = length;
        while (i12 < i11) {
        }
        charAt = str.charAt(i10);
        dVar = rb.d.r;
        if (d(dVar, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i10);
        dVar2 = rb.d.e;
        if (d(dVar2, charAt2)) {
        }
        charAt3 = str.charAt(i10);
        dVar3 = rb.d.d;
        if (d(dVar3, charAt3)) {
        }
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).start();
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    public int f(int i10, int i11, int i12) {
        nb.b bVar = (nb.b) this.b;
        return this.a ? bVar.b(i11, i10) : bVar.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public ValueAnimator g(cu cuVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new b3(13, this, cuVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(jr.f);
        return ofInt;
    }

    public g0 h(rb.e eVar) {
        int i10;
        String str = (String) this.b;
        int length = str.length();
        nb.e eVar2 = (nb.e) this.c;
        CharsetEncoder[] charsetEncoderArr = eVar2.a;
        CharsetEncoder[] charsetEncoderArr2 = eVar2.a;
        tb.e[][][] eVarArr = (tb.e[][][]) Array.newInstance((Class<?>) tb.e.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    tb.e eVar3 = eVarArr[i11][i12][i13];
                    if (eVar3 != null && i11 < length) {
                        b(eVar, eVarArr, i11, eVar3);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = -1;
        int i16 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                tb.e eVar4 = eVarArr[length][i17][i18];
                if (eVar4 != null && (i10 = eVar4.f) < i16) {
                    i14 = i17;
                    i15 = i18;
                    i16 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new g0(this, eVar, eVarArr[length][i14][i15]);
        }
        throw new com.google.firebase.messaging.r(a4.w.n("Internal error: failed to encode \"", str, "\""));
    }

    public synchronized void k() {
        try {
            if (this.a) {
                return;
            }
            Boolean m10 = m();
            this.c = m10;
            if (m10 == null) {
                ((a9.o) ((w9.b) this.b)).a(new a9.f(25));
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean l() {
        Boolean bool;
        try {
            k();
            bool = (Boolean) this.c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        u8.g gVar = ((FirebaseMessaging) this.d).a;
        gVar.a();
        Context context = gVar.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public rb.c n() {
        rb.c cVar = (rb.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = f(i12, 8, i11);
        }
        int f9 = f(8, 7, f(8, 8, f(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            f9 = f(8, i13, f9);
        }
        int i14 = ((nb.b) this.b).b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = f(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = f(i17, 8, i10);
        }
        rb.c a2 = rb.c.a(f9, i10);
        if (a2 == null) {
            a2 = rb.c.a(f9 ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw mb.c.a();
    }

    public rb.e o() {
        rb.e eVar = (rb.e) this.c;
        if (eVar != null) {
            return eVar;
        }
        int i10 = ((nb.b) this.b).b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return rb.e.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = f(i16, i15, i14);
            }
        }
        rb.e b10 = rb.e.b(i14);
        if (b10 != null && (b10.a * 4) + 17 == i10) {
            this.c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = f(i17, i18, i13);
            }
        }
        rb.e b11 = rb.e.b(i13);
        if (b11 == null || (b11.a * 4) + 17 != i10) {
            throw mb.c.a();
        }
        this.c = b11;
        return b11;
    }

    public void p() {
        if (((rb.c) this.d) == null) {
            return;
        }
        int i10 = m1.j.c(8)[((rb.c) this.d).b];
        nb.b bVar = (nb.b) this.b;
        int i11 = bVar.b;
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (th.a(i10, i12, i13)) {
                    bVar.a(i13, i12);
                }
            }
        }
    }

    public void q(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).cancel();
        }
    }

    public boolean r(String str, String str2) {
        synchronized (this) {
            try {
                if (!((h9.d) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((h9.d) atomicMarkableReference.getReference(), true);
                h9.o oVar = new h9.o(this, 1);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (!atomicReference.compareAndSet(null, oVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((com.google.firebase.messaging.s) ((s3) this.c).b).Q(oVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(ViewGroup viewGroup, c6 c6Var, x4 x4Var, v4 v4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                s4 s4Var = (s4) this.d;
                int i10 = c5.B;
                s4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) f0.e.f(context, WindowManager.class);
            s4 s4Var2 = new s4(this, context, c6Var, v4Var);
            this.d = s4Var2;
            c1 c1Var = new c1(this, 3);
            WeakHashMap weakHashMap = j0.a;
            b0.j(s4Var2, c1Var);
        }
        ((s4) this.d).a(x4Var);
        if (this.a) {
            return;
        }
        if (((s4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((s4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, MediaDataController.MAX_STYLE_RUNS_COUNT, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.c, (s4) this.d, layoutParams);
        ((WindowManager) this.c).addView((s4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void t(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new w(runnable, executor));
                } else {
                    this.a = true;
                    w(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(SpannableString spannableString, int i10) {
        cu[] cuVarArr = (cu[]) this.b;
        int i11 = i10 + 1;
        spannableString.setSpan(cuVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(cuVarArr[1], i11, i12, 0);
        spannableString.setSpan(cuVarArr[2], i12, i10 + 3, 0);
    }

    public void v() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                w wVar = (w) ((ArrayDeque) this.c).remove();
                w(wVar.b, wVar.a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w(Runnable runnable, Executor executor) {
        try {
            executor.execute(new o(3, this, runnable));
        } catch (RejectedExecutionException unused) {
            v();
        }
    }

    public m(s3 s3Var, boolean z10) {
        this.c = s3Var;
        this.d = new AtomicReference(null);
        this.a = z10;
        this.b = new AtomicMarkableReference(new h9.d(z10 ? 8192 : 1024), false);
    }
}
