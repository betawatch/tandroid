package com.google.firebase.messaging;

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
import ih.j3;
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
import m.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wt;
import org.telegram.ui.b1;
import org.telegram.ui.b5;
import org.telegram.ui.fm;
import org.telegram.ui.r4;
import org.telegram.ui.u4;
import org.telegram.ui.w4;
import r0.j0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l {
    public static l e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public l(View view) {
        wt[] wtVarArr = {new wt(), new wt(), new wt()};
        this.b = wtVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(g(wtVarArr[0], 0, 255, 0, 300), g(wtVarArr[1], 0, 255, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 300), g(wtVarArr[2], 0, 255, 300, 300), g(wtVarArr[0], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(wtVarArr[1], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(wtVarArr[2], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400));
        animatorSet.addListener(new j3(this, view));
    }

    public static void a(rb.e[][][] eVarArr, int i9, rb.e eVar) {
        rb.e[] eVarArr2 = eVarArr[i9 + eVar.d][eVar.c];
        pb.d dVar = eVar.a;
        int ordinal = dVar.ordinal();
        char c10 = 2;
        if (ordinal != 1) {
            if (ordinal == 2) {
                c10 = 1;
            } else if (ordinal == 4) {
                c10 = 3;
            } else {
                if (ordinal != 6) {
                    throw new IllegalStateException("Illegal mode " + dVar);
                }
                c10 = 0;
            }
        }
        rb.e eVar2 = eVarArr2[c10];
        if (eVar2 == null || eVar2.f > eVar.f) {
            eVarArr2[c10] = eVar;
        }
    }

    public static boolean d(pb.d dVar, char c10) {
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c10 < '`' ? rb.c.a[c10] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return rb.c.b(String.valueOf(c10));
            }
        } else if (c10 < '0' || c10 > '9') {
            return false;
        }
        return true;
    }

    public static boolean e(w4 w4Var) {
        return (w4Var.a == null && w4Var.b == null) ? false : true;
    }

    public static l i() {
        if (e == null) {
            e = new l();
        }
        return e;
    }

    public static pb.e j(int i9) {
        int b10 = m1.j.b(i9);
        return b10 != 0 ? b10 != 1 ? pb.e.c(40) : pb.e.c(26) : pb.e.c(9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(pb.e eVar, rb.e[][][] eVarArr, int i9, rb.e eVar2) {
        int i10;
        int i11;
        char charAt;
        pb.d dVar;
        char charAt2;
        pb.d dVar2;
        char charAt3;
        pb.d dVar3;
        int i12;
        String str = (String) this.b;
        lb.e eVar3 = (lb.e) this.c;
        CharsetEncoder[] charsetEncoderArr = eVar3.a;
        CharsetEncoder[] charsetEncoderArr2 = eVar3.a;
        int length = charsetEncoderArr.length;
        int i13 = eVar3.b;
        if (i13 >= 0) {
            char charAt4 = str.charAt(i9);
            if (charsetEncoderArr2[i13].canEncode("" + charAt4)) {
                length = i13 + 1;
                i10 = length;
                for (i11 = i13; i11 < i10; i11++) {
                    char charAt5 = str.charAt(i9);
                    if (charsetEncoderArr2[i11].canEncode("" + charAt5)) {
                        a(eVarArr, i9, new rb.e(this, pb.d.h, i9, i11, 1, eVar2, eVar));
                    }
                }
                charAt = str.charAt(i9);
                dVar = pb.d.r;
                if (d(dVar, charAt)) {
                    a(eVarArr, i9, new rb.e(this, dVar, i9, 0, 1, eVar2, eVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i9);
                dVar2 = pb.d.e;
                if (d(dVar2, charAt2)) {
                    int i14 = i9 + 1;
                    a(eVarArr, i9, new rb.e(this, dVar2, i9, 0, (i14 >= length2 || !d(dVar2, str.charAt(i14))) ? 1 : 2, eVar2, eVar));
                }
                charAt3 = str.charAt(i9);
                dVar3 = pb.d.d;
                if (d(dVar3, charAt3)) {
                    return;
                }
                int i15 = i9 + 1;
                if (i15 >= length2 || !d(dVar3, str.charAt(i15))) {
                    i12 = 1;
                } else {
                    int i16 = i9 + 2;
                    i12 = (i16 >= length2 || !d(dVar3, str.charAt(i16))) ? 2 : 3;
                }
                a(eVarArr, i9, new rb.e(this, dVar3, i9, 0, i12, eVar2, eVar));
                return;
            }
        }
        i13 = 0;
        i10 = length;
        while (i11 < i10) {
        }
        charAt = str.charAt(i9);
        dVar = pb.d.r;
        if (d(dVar, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i9);
        dVar2 = pb.d.e;
        if (d(dVar2, charAt2)) {
        }
        charAt3 = str.charAt(i9);
        dVar3 = pb.d.d;
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

    public int f(int i9, int i10, int i11) {
        lb.b bVar = (lb.b) this.b;
        return this.a ? bVar.b(i10, i9) : bVar.b(i9, i10) ? (i11 << 1) | 1 : i11 << 1;
    }

    public ValueAnimator g(wt wtVar, int i9, int i10, int i11, int i12) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i9, i10);
        ofInt.addUpdateListener(new f2.g(11, this, wtVar));
        ofInt.setDuration(i12);
        ofInt.setStartDelay(i11);
        ofInt.setInterpolator(gr.f);
        return ofInt;
    }

    public j4.c h(pb.e eVar) {
        int i9;
        String str = (String) this.b;
        int length = str.length();
        lb.e eVar2 = (lb.e) this.c;
        CharsetEncoder[] charsetEncoderArr = eVar2.a;
        CharsetEncoder[] charsetEncoderArr2 = eVar2.a;
        rb.e[][][] eVarArr = (rb.e[][][]) Array.newInstance((Class<?>) rb.e.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, eVarArr, 0, null);
        for (int i10 = 1; i10 <= length; i10++) {
            for (int i11 = 0; i11 < charsetEncoderArr2.length; i11++) {
                for (int i12 = 0; i12 < 4; i12++) {
                    rb.e eVar3 = eVarArr[i10][i11][i12];
                    if (eVar3 != null && i10 < length) {
                        b(eVar, eVarArr, i10, eVar3);
                    }
                }
            }
        }
        int i13 = -1;
        int i14 = -1;
        int i15 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i16 = 0; i16 < charsetEncoderArr2.length; i16++) {
            for (int i17 = 0; i17 < 4; i17++) {
                rb.e eVar4 = eVarArr[length][i16][i17];
                if (eVar4 != null && (i9 = eVar4.f) < i15) {
                    i13 = i16;
                    i14 = i17;
                    i15 = i9;
                }
            }
        }
        if (i13 >= 0) {
            return new j4.c(this, eVar, eVarArr[length][i13][i14]);
        }
        throw new s(aa.d.o("Internal error: failed to encode \"", str, "\""));
    }

    public synchronized void k() {
        try {
            if (this.a) {
                return;
            }
            Boolean m10 = m();
            this.c = m10;
            if (m10 == null) {
                ((y8.l) ((u9.b) this.b)).a(new a9.b(16));
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean l() {
        Boolean bool;
        try {
            k();
            bool = (Boolean) this.c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        s8.h hVar = ((FirebaseMessaging) this.d).a;
        hVar.a();
        Context context = hVar.a;
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

    public pb.c n() {
        pb.c cVar = (pb.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            i10 = f(i11, 8, i10);
        }
        int f10 = f(8, 7, f(8, 8, f(7, 8, i10)));
        for (int i12 = 5; i12 >= 0; i12--) {
            f10 = f(8, i12, f10);
        }
        int i13 = ((lb.b) this.b).b;
        int i14 = i13 - 7;
        for (int i15 = i13 - 1; i15 >= i14; i15--) {
            i9 = f(8, i15, i9);
        }
        for (int i16 = i13 - 8; i16 < i13; i16++) {
            i9 = f(i16, 8, i9);
        }
        pb.c a2 = pb.c.a(f10, i9);
        if (a2 == null) {
            a2 = pb.c.a(f10 ^ 21522, i9 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw kb.c.a();
    }

    public pb.e o() {
        pb.e eVar = (pb.e) this.c;
        if (eVar != null) {
            return eVar;
        }
        int i9 = ((lb.b) this.b).b;
        int i10 = (i9 - 17) / 4;
        if (i10 <= 6) {
            return pb.e.c(i10);
        }
        int i11 = i9 - 11;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = i9 - 9; i15 >= i11; i15--) {
                i13 = f(i15, i14, i13);
            }
        }
        pb.e b10 = pb.e.b(i13);
        if (b10 != null && (b10.a * 4) + 17 == i9) {
            this.c = b10;
            return b10;
        }
        for (int i16 = 5; i16 >= 0; i16--) {
            for (int i17 = i9 - 9; i17 >= i11; i17--) {
                i12 = f(i16, i17, i12);
            }
        }
        pb.e b11 = pb.e.b(i12);
        if (b11 == null || (b11.a * 4) + 17 != i9) {
            throw kb.c.a();
        }
        this.c = b11;
        return b11;
    }

    public void p() {
        if (((pb.c) this.d) == null) {
            return;
        }
        int i9 = m1.j.c(8)[((pb.c) this.d).b];
        lb.b bVar = (lb.b) this.b;
        int i10 = bVar.b;
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (j2.a(i9, i11, i12)) {
                    bVar.a(i12, i11);
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
                if (!((f9.d) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((f9.d) atomicMarkableReference.getReference(), true);
                f9.o oVar = new f9.o(this, 1);
                AtomicReference atomicReference = (AtomicReference) this.c;
                while (!atomicReference.compareAndSet(null, oVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((t) ((t3) this.d).b).Q(oVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(ViewGroup viewGroup, b6 b6Var, w4 w4Var, u4 u4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                r4 r4Var = (r4) this.d;
                int i9 = b5.B;
                r4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) f0.e.f(context, WindowManager.class);
            r4 r4Var2 = new r4(this, context, b6Var, u4Var);
            this.d = r4Var2;
            b1 b1Var = new b1(this, 3);
            WeakHashMap weakHashMap = j0.a;
            r0.b0.j(r4Var2, b1Var);
        }
        ((r4) this.d).a(w4Var);
        if (this.a) {
            return;
        }
        if (((r4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((r4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, MediaDataController.MAX_STYLE_RUNS_COUNT, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.c, (r4) this.d, layoutParams);
        ((WindowManager) this.c).addView((r4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void t(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new ya.s(runnable, executor));
                } else {
                    this.a = true;
                    w(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(SpannableString spannableString, int i9) {
        wt[] wtVarArr = (wt[]) this.b;
        int i10 = i9 + 1;
        spannableString.setSpan(wtVarArr[0], i9, i10, 0);
        int i11 = i9 + 2;
        spannableString.setSpan(wtVarArr[1], i10, i11, 0);
        spannableString.setSpan(wtVarArr[2], i11, i9 + 3, 0);
    }

    public void v() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                ya.s sVar = (ya.s) ((ArrayDeque) this.c).remove();
                w(sVar.b, sVar.a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(Runnable runnable, Executor executor) {
        try {
            executor.execute(new fm(this, runnable, false, 12));
        } catch (RejectedExecutionException unused) {
            v();
        }
    }

    public l(t3 t3Var, boolean z10) {
        this.d = t3Var;
        this.c = new AtomicReference(null);
        this.a = z10;
        this.b = new AtomicMarkableReference(new f9.d(z10 ? 8192 : 1024), false);
    }
}
