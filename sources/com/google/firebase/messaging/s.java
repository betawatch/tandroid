package com.google.firebase.messaging;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e9.a1;
import e9.g0;
import e9.i0;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.zip.Inflater;
import m.g3;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.r6;
import u2.q1;
import y9.w0;
import y9.x0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class s implements z3.m {
    public static s f;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ s(int i10, boolean z10) {
        this.a = i10;
    }

    public static synchronized s d() {
        s sVar;
        synchronized (s.class) {
            try {
                if (f == null) {
                    f = new s(0);
                }
                sVar = f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public static void i(long j3, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j3) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hashMap.remove(arrayList.get(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fd  */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        int[] iArr;
        d2.b bVar;
        int i12;
        int i13;
        d2.b bVar2;
        d2.b bVar3;
        a1 a1Var;
        Rect rect;
        int i14 = 4;
        int i15 = 0;
        int i16 = 2;
        switch (this.a) {
            case 2:
                c4.a aVar = (c4.a) this.d;
                e2.v vVar = (e2.v) this.c;
                e2.v vVar2 = (e2.v) this.b;
                vVar2.H(i10 + i11, bArr);
                vVar2.J(i10);
                if (((Inflater) this.e) == null) {
                    this.e = new Inflater();
                }
                if (e2.d0.O(vVar2, vVar, (Inflater) this.e)) {
                    vVar2.H(vVar.c, vVar.a);
                }
                aVar.d = 0;
                int[] iArr2 = aVar.b;
                e2.v vVar3 = aVar.a;
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                aVar.h = 0;
                aVar.i = 0;
                vVar3.G(0);
                aVar.c = false;
                ArrayList arrayList = new ArrayList();
                while (vVar2.a() >= 3) {
                    int i17 = vVar2.c;
                    int x10 = vVar2.x();
                    int D = vVar2.D();
                    int i18 = vVar2.b + D;
                    if (i18 > i17) {
                        vVar2.J(i17);
                        iArr = iArr2;
                        bVar2 = null;
                    } else {
                        if (x10 != 128) {
                            switch (x10) {
                                case 20:
                                    if (D % 5 == i16) {
                                        vVar2.K(i16);
                                        Arrays.fill(iArr2, i15);
                                        int i19 = D / 5;
                                        int i20 = 0;
                                        while (i20 < i19) {
                                            int x11 = vVar2.x();
                                            double x12 = vVar2.x();
                                            double x13 = vVar2.x() - 128;
                                            int[] iArr3 = iArr2;
                                            double x14 = vVar2.x() - 128;
                                            iArr3[x11] = e2.d0.h((int) ((x14 * 1.772d) + x12), 0, 255) | (vVar2.x() << 24) | (e2.d0.h((int) ((1.402d * x13) + x12), 0, 255) << 16) | (e2.d0.h((int) ((x12 - (0.34414d * x14)) - (x13 * 0.71414d)), 0, 255) << 8);
                                            i20++;
                                            i19 = i19;
                                            iArr2 = iArr3;
                                        }
                                        iArr = iArr2;
                                        aVar.c = true;
                                        break;
                                    }
                                    iArr = iArr2;
                                    break;
                                case 21:
                                    if (D >= 4) {
                                        vVar2.K(3);
                                        int i21 = D - 4;
                                        if ((128 & vVar2.x()) != 0) {
                                            if (i21 >= 7) {
                                                int A = vVar2.A();
                                                if (A >= 4) {
                                                    aVar.h = vVar2.D();
                                                    aVar.i = vVar2.D();
                                                    vVar3.G(A - 4);
                                                    i21 = D - 11;
                                                }
                                                iArr = iArr2;
                                                break;
                                            }
                                        }
                                        int i22 = vVar3.b;
                                        int i23 = vVar3.c;
                                        if (i22 < i23 && i21 > 0) {
                                            int min = Math.min(i21, i23 - i22);
                                            vVar2.h(i22, min, vVar3.a);
                                            vVar3.J(i22 + min);
                                        }
                                        iArr = iArr2;
                                    }
                                    iArr = iArr2;
                                case 22:
                                    if (D >= 19) {
                                        aVar.d = vVar2.D();
                                        aVar.e = vVar2.D();
                                        vVar2.K(11);
                                        aVar.f = vVar2.D();
                                        aVar.g = vVar2.D();
                                    }
                                default:
                                    iArr = iArr2;
                                    break;
                            }
                            bVar = null;
                        } else {
                            iArr = iArr2;
                            if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i12 = vVar3.c) == 0 || vVar3.b != i12 || !aVar.c) {
                                bVar = null;
                            } else {
                                vVar3.J(0);
                                int i24 = aVar.h * aVar.i;
                                int[] iArr4 = new int[i24];
                                int i25 = 0;
                                while (i25 < i24) {
                                    int x15 = vVar3.x();
                                    if (x15 != 0) {
                                        i13 = i25 + 1;
                                        iArr4[i25] = iArr[x15];
                                    } else {
                                        int x16 = vVar3.x();
                                        if (x16 != 0) {
                                            i13 = ((x16 & 64) == 0 ? x16 & 63 : ((x16 & 63) << 8) | vVar3.x()) + i25;
                                            Arrays.fill(iArr4, i25, i13, (x16 & 128) == 0 ? iArr[0] : iArr[vVar3.x()]);
                                        }
                                    }
                                    i25 = i13;
                                }
                                Bitmap createBitmap = Bitmap.createBitmap(iArr4, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                                float f7 = aVar.f;
                                float f10 = aVar.d;
                                float f11 = f7 / f10;
                                float f12 = aVar.g;
                                float f13 = aVar.e;
                                bVar = new d2.b(null, null, null, createBitmap, f12 / f13, 0, 0, f11, 0, TLObject.FLAG_31, -3.4028235E38f, aVar.h / f10, aVar.i / f13, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                            }
                            aVar.d = 0;
                            aVar.e = 0;
                            aVar.f = 0;
                            aVar.g = 0;
                            aVar.h = 0;
                            aVar.i = 0;
                            vVar3.G(0);
                            aVar.c = false;
                        }
                        vVar2.J(i18);
                        bVar2 = bVar;
                    }
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                    iArr2 = iArr;
                    i15 = 0;
                    i16 = 2;
                }
                hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
                break;
            default:
                e2.v vVar4 = (e2.v) this.b;
                vVar4.H(i10 + i11, bArr);
                vVar4.J(i10);
                e2.v vVar5 = (e2.v) this.c;
                h4.a aVar2 = (h4.a) this.d;
                if (((Inflater) this.e) == null) {
                    this.e = new Inflater();
                }
                if (e2.d0.O(vVar4, vVar5, (Inflater) this.e)) {
                    vVar4.H(vVar5.c, vVar5.a);
                }
                aVar2.c = false;
                aVar2.g = null;
                aVar2.h = -1;
                aVar2.i = -1;
                int a2 = vVar4.a();
                if (a2 >= 2 && vVar4.D() == a2) {
                    int[] iArr5 = aVar2.d;
                    if (iArr5 != null && aVar2.b) {
                        vVar4.K(vVar4.D() - 2);
                        int D2 = vVar4.D();
                        int[] iArr6 = aVar2.a;
                        while (vVar4.b < D2 && vVar4.a() > 0) {
                            switch (vVar4.x()) {
                                case 3:
                                    if (vVar4.a() < 2) {
                                        break;
                                    } else {
                                        int x17 = vVar4.x();
                                        int x18 = vVar4.x();
                                        iArr6[3] = h4.a.a(x17 >> 4, iArr5);
                                        iArr6[2] = h4.a.a(x17 & 15, iArr5);
                                        iArr6[1] = h4.a.a(x18 >> 4, iArr5);
                                        iArr6[0] = h4.a.a(x18 & 15, iArr5);
                                        aVar2.c = true;
                                        i14 = 4;
                                    }
                                case 4:
                                    if (vVar4.a() >= 2 && aVar2.c) {
                                        int x19 = vVar4.x();
                                        int x20 = vVar4.x();
                                        iArr6[3] = h4.a.c(iArr6[3], x19 >> 4);
                                        iArr6[2] = h4.a.c(iArr6[2], x19 & 15);
                                        iArr6[1] = h4.a.c(iArr6[1], x20 >> 4);
                                        iArr6[0] = h4.a.c(iArr6[0], x20 & 15);
                                        i14 = 4;
                                    }
                                    break;
                                case 5:
                                    if (vVar4.a() < 6) {
                                        break;
                                    } else {
                                        int x21 = vVar4.x();
                                        int x22 = vVar4.x();
                                        int i26 = (x21 << i14) | (x22 >> 4);
                                        int x23 = ((x22 & 15) << 8) | vVar4.x();
                                        int x24 = vVar4.x();
                                        int x25 = vVar4.x();
                                        aVar2.g = new Rect(i26, (x24 << 4) | (x25 >> 4), x23 + 1, (((x25 & 15) << 8) | vVar4.x()) + 1);
                                        i14 = 4;
                                    }
                                case 6:
                                    if (vVar4.a() < i14) {
                                        break;
                                    } else {
                                        aVar2.h = vVar4.D();
                                        aVar2.i = vVar4.D();
                                    }
                            }
                        }
                    }
                    if (aVar2.d != null && aVar2.b && aVar2.c && (rect = aVar2.g) != null && aVar2.h != -1 && aVar2.i != -1 && rect.width() >= 2 && aVar2.g.height() >= 2) {
                        Rect rect2 = aVar2.g;
                        int[] iArr7 = new int[rect2.height() * rect2.width()];
                        a4.h hVar2 = new a4.h();
                        vVar4.J(aVar2.h);
                        hVar2.p(vVar4);
                        aVar2.b(hVar2, true, rect2, iArr7);
                        vVar4.J(aVar2.i);
                        hVar2.p(vVar4);
                        aVar2.b(hVar2, false, rect2, iArr7);
                        bVar3 = new d2.b(null, null, null, Bitmap.createBitmap(iArr7, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.f, 0, 0, rect2.left / aVar2.e, 0, TLObject.FLAG_31, -3.4028235E38f, rect2.width() / aVar2.e, rect2.height() / aVar2.f, false, -16777216, TLObject.FLAG_31, 0.0f, 0);
                        if (bVar3 == null) {
                            a1Var = i0.z(bVar3);
                        } else {
                            g0 g0Var = i0.b;
                            a1Var = a1.e;
                        }
                        hVar.accept(new z3.a(-9223372036854775807L, 5000000L, a1Var));
                        break;
                    }
                }
                bVar3 = null;
                if (bVar3 == null) {
                }
                hVar.accept(new z3.a(-9223372036854775807L, 5000000L, a1Var));
                break;
        }
    }

    public ArrayList a(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.b;
        i(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.c;
        i(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m2.b bVar = (m2.b) list.get(i10);
            if (!hashMap.containsKey(bVar.b) && !hashMap2.containsKey(Integer.valueOf(bVar.c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public w0 b() {
        String str = ((x0) this.c) == null ? " rolloutVariant" : "";
        if (((String) this.b) == null) {
            str = str.concat(" parameterKey");
        }
        if (((String) this.d) == null) {
            str = r6.t(str, " parameterValue");
        }
        if (((Long) this.e) == null) {
            str = r6.t(str, " templateVersion");
        }
        if (str.isEmpty()) {
            return new w0((x0) this.c, (String) this.b, (String) this.d, ((Long) this.e).longValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k.e c(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k.e eVar = (k.e) arrayList.get(i10);
            if (eVar != null && eVar.b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public boolean e(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean f(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean g(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(c(aVar), new l.s((Context) this.c, (l0.a) menuItem));
    }

    public boolean h(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        k.e c10 = c(aVar);
        a0.l lVar = (a0.l) this.e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.b0((Context) this.c, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(c10, menu2);
    }

    @Override // z3.m
    public /* synthetic */ z3.d k(int i10, int i11, byte[] bArr) {
        switch (this.a) {
        }
        return w.f.a(this, bArr, i11);
    }

    public m2.b m(List list) {
        m2.b bVar;
        HashMap hashMap = (HashMap) this.d;
        ArrayList a2 = a(list);
        if (a2.size() < 2) {
            return (m2.b) e9.q.k(a2, null);
        }
        Collections.sort(a2, new a4.e(13));
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = ((m2.b) a2.get(0)).c;
        int i12 = 0;
        while (true) {
            if (i12 >= a2.size()) {
                break;
            }
            m2.b bVar2 = (m2.b) a2.get(i12);
            if (i11 == bVar2.c) {
                arrayList.add(new Pair(bVar2.b, Integer.valueOf(bVar2.d)));
                i12++;
            } else if (arrayList.size() == 1) {
                return (m2.b) a2.get(0);
            }
        }
        m2.b bVar3 = (m2.b) hashMap.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List subList = a2.subList(0, arrayList.size());
        int i13 = 0;
        for (int i14 = 0; i14 < subList.size(); i14++) {
            i13 += ((m2.b) subList.get(i14)).d;
        }
        int nextInt = ((Random) this.e).nextInt(i13);
        int i15 = 0;
        while (true) {
            if (i10 >= subList.size()) {
                bVar = (m2.b) e9.q.l(subList);
                break;
            }
            bVar = (m2.b) subList.get(i10);
            i15 += bVar.d;
            if (nextInt < i15) {
                break;
            }
            i10++;
        }
        hashMap.put(arrayList, bVar);
        return bVar;
    }

    @Override // z3.m
    public int n() {
        switch (this.a) {
        }
        return 2;
    }

    public Task o(Callable callable) {
        Task continueWith;
        synchronized (this.d) {
            continueWith = ((Task) this.c).continueWith((Executor) this.b, new g3(callable, 25));
            this.c = continueWith.continueWith((Executor) this.b, new rb.a(24));
        }
        return continueWith;
    }

    public Task p(Callable callable) {
        Task continueWithTask;
        synchronized (this.d) {
            continueWithTask = ((Task) this.c).continueWithTask((Executor) this.b, new g3(callable, 25));
            this.c = continueWithTask.continueWith((Executor) this.b, new rb.a(24));
        }
        return continueWithTask;
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
        int i10 = this.a;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return ((g3) this.e).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public s(ExecutorService executorService) {
        this.a = 12;
        this.c = Tasks.forResult(null);
        this.d = new Object();
        this.e = new ThreadLocal();
        this.b = executorService;
        executorService.execute(new sg.a1(this, 3));
    }

    public s(List list) {
        int i10;
        this.a = 4;
        this.b = new e2.v();
        this.c = new e2.v();
        h4.a aVar = new h4.a();
        this.d = aVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = e2.d0.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split = str2.substring(9).split(",", -1);
                aVar.d = new int[split.length];
                for (int i11 = 0; i11 < split.length; i11++) {
                    int[] iArr = aVar.d;
                    try {
                        i10 = Integer.parseInt(split[i11].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split2 = str2.substring(6).trim().split("x", -1);
                if (split2.length == 2) {
                    try {
                        aVar.e = Integer.parseInt(split2[0]);
                        aVar.f = Integer.parseInt(split2[1]);
                        aVar.b = true;
                    } catch (RuntimeException e) {
                        e2.a.o("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    private final /* synthetic */ void j() {
    }

    private final /* synthetic */ void l() {
    }

    public s(Typeface typeface, p1.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        this.a = 1;
        this.e = typeface;
        this.b = bVar;
        this.d = new androidx.emoji2.text.s(1024);
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i14 = a2 + bVar.a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        this.c = new char[i10 * 2];
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i15 = a10 + bVar.a;
            i11 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i15) + i15);
        } else {
            i11 = 0;
        }
        for (int i16 = 0; i16 < i11; i16++) {
            androidx.emoji2.text.o oVar = new androidx.emoji2.text.o(this, i16);
            p1.a b10 = oVar.b();
            int a11 = b10.a(4);
            Character.toChars(a11 != 0 ? ((ByteBuffer) b10.d).getInt(a11 + b10.a) : 0, (char[]) this.c, i16 * 2);
            p1.a b11 = oVar.b();
            int a12 = b11.a(16);
            if (a12 != 0) {
                int i17 = a12 + b11.a;
                i12 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            if (i12 > 0) {
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.d;
                p1.a b12 = oVar.b();
                int a13 = b12.a(16);
                if (a13 != 0) {
                    int i18 = a13 + b12.a;
                    i13 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i18) + i18);
                } else {
                    i13 = 0;
                }
                sVar.a(oVar, 0, i13 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public s(g3 g3Var, Object obj, Object obj2, Object[] objArr) {
        this.a = 10;
        this.e = g3Var;
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
    }

    public s(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.b = new e2.v();
                this.c = new e2.v();
                this.d = new c4.a();
                break;
            case 6:
                Random random = new Random();
                this.d = new HashMap();
                this.e = random;
                this.b = new HashMap();
                this.c = new HashMap();
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = new ArrayDeque();
                break;
        }
    }

    public s(Context context, ActionMode.Callback callback) {
        this.a = 5;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new a0.l(0);
    }

    public s(q1 q1Var, boolean[] zArr) {
        this.a = 11;
        this.b = q1Var;
        this.c = zArr;
        int i10 = q1Var.a;
        this.d = new boolean[i10];
        this.e = new boolean[i10];
    }
}
