package cb;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.emoji2.text.w;
import com.google.firebase.messaging.FirebaseMessaging;
import g5.e0;
import g5.u0;
import h5.d0;
import j$.util.Objects;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.r3;
import o3.b0;
import oh.h3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.pr;
import org.telegram.ui.a1;
import org.telegram.ui.e5;
import org.telegram.ui.u4;
import org.telegram.ui.x4;
import org.telegram.ui.yh;
import org.telegram.ui.z4;
import r0.j0;
import s8.n0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m {
    public static m e;
    public boolean a;
    public Object b;
    public Object c;
    public Object d;

    public m(View view) {
        hu[] huVarArr = {new hu(), new hu(), new hu()};
        this.b = huVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.playTogether(g(huVarArr[0], 0, 255, 0, 300), g(huVarArr[1], 0, 255, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 300), g(huVarArr[2], 0, 255, 300, 300), g(huVarArr[0], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(huVarArr[1], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400), g(huVarArr[2], 255, 0, MediaDataController.MAX_STYLE_RUNS_COUNT, 400));
        animatorSet.addListener(new h3(this, view));
    }

    public static void a(vb.e[][][] eVarArr, int i10, vb.e eVar) {
        vb.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.c];
        tb.d dVar = eVar.a;
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
        vb.e eVar2 = eVarArr2[c3];
        if (eVar2 == null || eVar2.f > eVar.f) {
            eVarArr2[c3] = eVar;
        }
    }

    public static boolean d(tb.d dVar, char c3) {
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                if ((c3 < '`' ? vb.c.a[c3] : -1) == -1) {
                    return false;
                }
            } else if (ordinal != 4) {
                if (ordinal != 6) {
                    return false;
                }
                return vb.c.b(String.valueOf(c3));
            }
        } else if (c3 < '0' || c3 > '9') {
            return false;
        }
        return true;
    }

    public static boolean e(z4 z4Var) {
        return (z4Var.a == null && z4Var.b == null) ? false : true;
    }

    public static byte[] j(g5.u uVar, String str, byte[] bArr, Map map) {
        Map map2;
        List list;
        u0 u0Var = new u0(uVar.createDataSource());
        Map map3 = Collections.EMPTY_MAP;
        Uri parse = Uri.parse(str);
        h5.a.k(parse, "The uri must be set.");
        g5.p pVar = new g5.p(parse, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g5.p pVar2 = pVar;
        int i11 = 0;
        while (true) {
            try {
                g5.o oVar = new g5.o(u0Var, pVar2);
                try {
                    try {
                        byte[] Q = d0.Q(oVar);
                        try {
                            oVar.close();
                        } catch (IOException unused) {
                        }
                        return Q;
                    } catch (e0 e6) {
                        int i12 = e6.d;
                        String str2 = null;
                        if ((i12 == 307 || i12 == 308) && i11 < 5 && (map2 = e6.e) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i10);
                        }
                        if (str2 == null) {
                            throw e6;
                        }
                        i11++;
                        c4.c a2 = pVar2.a();
                        a2.e = Uri.parse(str2);
                        pVar2 = a2.d();
                        int i13 = d0.a;
                        try {
                            oVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                } finally {
                }
            } catch (Exception e10) {
                Uri uri = u0Var.c;
                uri.getClass();
                throw new b0(pVar, uri, u0Var.a.getResponseHeaders(), u0Var.b, e10);
            }
        }
    }

    public static m l() {
        if (e == null) {
            e = new m();
        }
        return e;
    }

    public static tb.e m(int i10) {
        int c3 = m1.j.c(i10);
        return c3 != 0 ? c3 != 1 ? tb.e.c(40) : tb.e.c(26) : tb.e.c(9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(tb.e eVar, vb.e[][][] eVarArr, int i10, vb.e eVar2) {
        int i11;
        int i12;
        char charAt;
        tb.d dVar;
        char charAt2;
        tb.d dVar2;
        char charAt3;
        tb.d dVar3;
        int i13;
        String str = (String) this.b;
        pb.e eVar3 = (pb.e) this.c;
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
                        a(eVarArr, i10, new vb.e(this, tb.d.h, i10, i12, 1, eVar2, eVar));
                    }
                }
                charAt = str.charAt(i10);
                dVar = tb.d.r;
                if (d(dVar, charAt)) {
                    a(eVarArr, i10, new vb.e(this, dVar, i10, 0, 1, eVar2, eVar));
                }
                int length2 = str.length();
                charAt2 = str.charAt(i10);
                dVar2 = tb.d.e;
                if (d(dVar2, charAt2)) {
                    int i15 = i10 + 1;
                    a(eVarArr, i10, new vb.e(this, dVar2, i10, 0, (i15 >= length2 || !d(dVar2, str.charAt(i15))) ? 1 : 2, eVar2, eVar));
                }
                charAt3 = str.charAt(i10);
                dVar3 = tb.d.d;
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
                a(eVarArr, i10, new vb.e(this, dVar3, i10, 0, i13, eVar2, eVar));
                return;
            }
        }
        i14 = 0;
        i11 = length;
        while (i12 < i11) {
        }
        charAt = str.charAt(i10);
        dVar = tb.d.r;
        if (d(dVar, charAt)) {
        }
        int length22 = str.length();
        charAt2 = str.charAt(i10);
        dVar2 = tb.d.e;
        if (d(dVar2, charAt2)) {
        }
        charAt3 = str.charAt(i10);
        dVar3 = tb.d.d;
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
        pb.b bVar = (pb.b) this.b;
        return this.a ? bVar.b(i11, i10) : bVar.b(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public ValueAnimator g(hu huVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new bg.a(14, this, huVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(pr.f);
        return ofInt;
    }

    public s5.m h(tb.e eVar) {
        int i10;
        String str = (String) this.b;
        int length = str.length();
        pb.e eVar2 = (pb.e) this.c;
        CharsetEncoder[] charsetEncoderArr = eVar2.a;
        CharsetEncoder[] charsetEncoderArr2 = eVar2.a;
        vb.e[][][] eVarArr = (vb.e[][][]) Array.newInstance((Class<?>) vb.e.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    vb.e eVar3 = eVarArr[i11][i12][i13];
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
                vb.e eVar4 = eVarArr[length][i17][i18];
                if (eVar4 != null && (i10 = eVar4.f) < i16) {
                    i14 = i17;
                    i15 = i18;
                    i16 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new s5.m(this, eVar, eVarArr[length][i14][i15]);
        }
        throw new b7.a(android.support.v4.media.a.o("Internal error: failed to encode \"", str, "\""));
    }

    public byte[] i(UUID uuid, o3.t tVar) {
        String str = tVar.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            h5.a.k(uri, "The uri must be set.");
            throw new b0(new g5.p(uri, 1, null, map, 0L, -1L, null, 0), uri, n0.h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = j3.h.e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : j3.h.c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.d)) {
            hashMap.putAll((HashMap) this.d);
        }
        return j((g5.u) this.b, str, tVar.a, hashMap);
    }

    public byte[] k(o3.u uVar) {
        return j((g5.u) this.b, uVar.b + "&signedRequest=" + d0.m(uVar.a), null, Collections.EMPTY_MAP);
    }

    public synchronized void n() {
        try {
            if (this.a) {
                return;
            }
            Boolean p10 = p();
            this.c = p10;
            if (p10 == null) {
                ((c9.n) ((y9.b) this.b)).a(new w(12));
            }
            this.a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean o() {
        Boolean bool;
        try {
            n();
            bool = (Boolean) this.c;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.d).a.h();
    }

    public Boolean p() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        w8.g gVar = ((FirebaseMessaging) this.d).a;
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

    public tb.c q() {
        tb.c cVar = (tb.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = f(i12, 8, i11);
        }
        int f10 = f(8, 7, f(8, 8, f(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            f10 = f(8, i13, f10);
        }
        int i14 = ((pb.b) this.b).b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = f(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = f(i17, 8, i10);
        }
        tb.c a2 = tb.c.a(f10, i10);
        if (a2 == null) {
            a2 = tb.c.a(f10 ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw ob.c.a();
    }

    public tb.e r() {
        tb.e eVar = (tb.e) this.c;
        if (eVar != null) {
            return eVar;
        }
        int i10 = ((pb.b) this.b).b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return tb.e.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = f(i16, i15, i14);
            }
        }
        tb.e b10 = tb.e.b(i14);
        if (b10 != null && (b10.a * 4) + 17 == i10) {
            this.c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = f(i17, i18, i13);
            }
        }
        tb.e b11 = tb.e.b(i13);
        if (b11 == null || (b11.a * 4) + 17 != i10) {
            throw ob.c.a();
        }
        this.c = b11;
        return b11;
    }

    public void s() {
        if (((tb.c) this.d) == null) {
            return;
        }
        int i10 = m1.j.d(8)[((tb.c) this.d).b];
        pb.b bVar = (pb.b) this.b;
        int i11 = bVar.b;
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i11; i13++) {
                if (yh.b(i10, i12, i13)) {
                    bVar.a(i13, i12);
                }
            }
        }
    }

    public void t(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.c).cancel();
        }
    }

    public boolean u(String str, String str2) {
        synchronized (this) {
            try {
                if (!((j9.d) ((AtomicMarkableReference) this.b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.b;
                atomicMarkableReference.set((j9.d) atomicMarkableReference.getReference(), true);
                j9.o oVar = new j9.o(this, 1);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (!atomicReference.compareAndSet(null, oVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((sf.f) ((r3) this.c).b).H(oVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void v(ViewGroup viewGroup, g6 g6Var, z4 z4Var, x4 x4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.b) != viewGroup) {
            if (this.a) {
                u4 u4Var = (u4) this.d;
                int i10 = e5.C;
                u4Var.b(false);
            }
            this.b = viewGroup;
            this.c = (WindowManager) f0.e.f(context, WindowManager.class);
            u4 u4Var2 = new u4(this, context, g6Var, x4Var);
            this.d = u4Var2;
            a1 a1Var = new a1(this, 3);
            WeakHashMap weakHashMap = j0.a;
            r0.b0.j(u4Var2, a1Var);
        }
        ((u4) this.d).a(z4Var);
        if (this.a) {
            return;
        }
        if (((u4) this.d).getParent() != null) {
            ((WindowManager) this.c).removeView((u4) this.d);
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, MediaDataController.MAX_STYLE_RUNS_COUNT, 0, -3);
        layoutParams.softInputMode = 16;
        layoutParams.flags |= -1945959040;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.c, (u4) this.d, layoutParams);
        ((WindowManager) this.c).addView((u4) this.d, layoutParams);
        viewGroup.requestDisallowInterceptTouchEvent(true);
        this.a = true;
    }

    public void w(Runnable runnable, Executor executor) {
        synchronized (this.b) {
            try {
                if (this.a) {
                    ((ArrayDeque) this.c).add(new u(runnable, executor));
                } else {
                    this.a = true;
                    z(runnable, executor);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void x(SpannableString spannableString, int i10) {
        hu[] huVarArr = (hu[]) this.b;
        int i11 = i10 + 1;
        spannableString.setSpan(huVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(huVarArr[1], i11, i12, 0);
        spannableString.setSpan(huVarArr[2], i12, i10 + 3, 0);
    }

    public void y() {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c).isEmpty()) {
                    this.a = false;
                    return;
                }
                u uVar = (u) ((ArrayDeque) this.c).remove();
                z(uVar.b, uVar.a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void z(Runnable runnable, Executor executor) {
        try {
            executor.execute(new androidx.biometric.k(this, runnable, false, 4));
        } catch (RejectedExecutionException unused) {
            y();
        }
    }

    public m(r3 r3Var, boolean z4) {
        this.c = r3Var;
        this.d = new AtomicReference(null);
        this.a = z4;
        this.b = new AtomicMarkableReference(new j9.d(z4 ? 8192 : 1024), false);
    }
}
