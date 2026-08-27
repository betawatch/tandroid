package af;

import a5.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.i2;
import com.google.android.gms.internal.cast.j1;
import com.google.android.gms.internal.cast.j2;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.q1;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.t6;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.u6;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.z1;
import d5.g0;
import h9.s0;
import ig.q0;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import lh.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.ci1;
import y5.l;
import z8.o;
import z8.q;
import z8.r;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h implements y2.b, vj0, ud.b, r4.g, z8.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public h(Context context) {
        this(context, new o5.b(-1, 0, 0));
    }

    public static void E(h hVar, u6 u6Var) {
        int i10 = u6Var.e;
        if (i10 == 2 && ((t6) hVar.d) != null) {
            hVar.G();
        }
        if (i10 == 2) {
            hVar.d = new t6((o0) hVar.a, (String) hVar.c);
        } else {
            hVar.d = hVar.F();
        }
        t6 t6Var = (t6) hVar.d;
        l.h(t6Var);
        u6Var.d = t6Var.h;
        t6Var.b.add(u6Var);
    }

    public static h u(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        h hVar = new h();
        hVar.d = new ArrayDeque();
        hVar.a = sharedPreferences;
        hVar.b = "topic_operation_queue";
        hVar.c = ",";
        hVar.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) hVar.d)) {
            try {
                ((ArrayDeque) hVar.d).clear();
                String string = ((SharedPreferences) hVar.a).getString((String) hVar.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) hVar.c)) {
                    String[] split = string.split((String) hVar.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) hVar.d).add(str);
                        }
                    }
                    return hVar;
                }
                return hVar;
            } finally {
            }
        }
    }

    public void B() {
        Bitmap bitmap;
        if (((g) this.d) != null) {
            this.d = null;
            View view = (View) this.b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((g) this.d) == null && ((g) this.e) == null && (bitmap = (Bitmap) this.c) != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    public void C(Uri uri) {
        int i10;
        Context context = (Context) this.a;
        if (uri == null) {
            D();
            return;
        }
        if (uri.equals((Uri) this.c)) {
            return;
        }
        D();
        this.c = uri;
        o5.b bVar = (o5.b) this.b;
        int i11 = bVar.b;
        if (i11 == 0 || (i10 = bVar.c) == 0) {
            this.d = new p5.b(context, 0, 0, this);
        } else {
            this.d = new p5.b(context, i11, i10, this);
        }
        p5.b bVar2 = (p5.b) this.d;
        l.h(bVar2);
        Uri uri2 = (Uri) this.c;
        l.h(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void D() {
        p5.b bVar = (p5.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public t6 F() {
        if (((t6) this.d) == null) {
            t6 t6Var = new t6((o0) this.a, (String) this.c);
            this.d = t6Var;
            t6Var.b(1);
        }
        return (t6) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void G() {
        q1 q1Var;
        int i10;
        long j10;
        t6 t6Var = (t6) this.d;
        if (t6Var != null) {
            Map map = t6Var.e;
            List<g3> list = t6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = t6Var.c;
            List<u6> list3 = t6Var.b;
            n5.c cVar = t6Var.j;
            if (cVar != null) {
                cVar.l = null;
                t6Var.j = null;
            }
            long j11 = t6Var.i;
            q1 m10 = r1.m();
            m10.c();
            r1.t((r1) m10.b, j11);
            String str = t6Var.l;
            if (str != null) {
                m10.c();
                r1.y((r1) m10.b, str);
            }
            String str2 = t6Var.m;
            if (str2 != null) {
                m10.c();
                r1.u((r1) m10.b, str2);
            }
            j1 l10 = k1.l();
            String str3 = t6.o;
            l10.c();
            k1.n((k1) l10.b, str3);
            String str4 = t6Var.g;
            l10.c();
            k1.m((k1) l10.b, str4);
            k1 k1Var = (k1) l10.a();
            m10.c();
            r1.r((r1) m10.b, k1Var);
            c0 c0Var = t6Var.a;
            w1 l11 = x1.l();
            Object zza = c0Var.zza();
            if (zza != null) {
                i2 l12 = j2.l();
                l12.c();
                j2.m((j2) l12.b, (String) zza);
                j2 j2Var = (j2) l12.a();
                l11.c();
                x1.m((x1) l11.b, j2Var);
            }
            String str5 = t6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e9) {
                    r5.b bVar = t6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e9);
                    j10 = 0;
                }
                l11.c();
                x1.n((x1) l11.b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (u6 u6Var : list3) {
                    u6Var.getClass();
                    u1 l13 = v1.l();
                    int i11 = u6Var.e;
                    l13.c();
                    v1.p((v1) l13.b, i11);
                    int i12 = (int) (u6Var.b - u6Var.d);
                    l13.c();
                    v1.m((v1) l13.b, i12);
                    Integer num = u6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        v1.n((v1) l13.b, intValue);
                    }
                    Boolean bool = u6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        v1.o((v1) l13.b, booleanValue);
                    }
                    arrayList.add((v1) l13.a());
                }
                l11.c();
                x1.o((x1) l11.b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    a2 l14 = b2.l();
                    int i13 = (int) (bVar2.b - bVar2.c);
                    l14.c();
                    b2.m((b2) l14.b, i13);
                    int i14 = bVar2.a;
                    int i15 = i14 != 1 ? i14 != 2 ? i14 != 3 ? 1 : 4 : 3 : 2;
                    l14.c();
                    b2.n((b2) l14.b, i15);
                    arrayList2.add((b2) l14.a());
                }
                l11.c();
                x1.q((x1) l11.b, arrayList2);
            }
            if (list.isEmpty()) {
                q1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (g3 g3Var : list) {
                    String str6 = g3Var.a;
                    s1 l15 = t1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                break;
                            }
                            i10 = 1;
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = 2;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                break;
                            }
                            i10 = 1;
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                break;
                            }
                            i10 = 1;
                            break;
                        default:
                            i10 = 1;
                            break;
                    }
                    l15.c();
                    t1.q((t1) l15.b, i10);
                    int i16 = (int) g3Var.b;
                    l15.c();
                    t1.m((t1) l15.b, i16);
                    int i17 = g3Var.c;
                    l15.c();
                    t1.n((t1) l15.b, i17);
                    int i18 = (int) (g3Var.d - g3Var.f);
                    l15.c();
                    t1.o((t1) l15.b, i18);
                    int i19 = (int) (g3Var.e - g3Var.f);
                    l15.c();
                    t1.p((t1) l15.b, i19);
                    arrayList3.add((t1) l15.a());
                    m10 = m10;
                }
                q1Var = m10;
                l11.c();
                x1.p((x1) l11.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    y1 l16 = z1.l();
                    int i20 = cVar2.e;
                    l16.c();
                    z1.p((z1) l16.b, i20);
                    int i21 = cVar2.d.get();
                    l16.c();
                    z1.m((z1) l16.b, i21);
                    int i22 = (int) (cVar2.a - cVar2.c);
                    l16.c();
                    z1.n((z1) l16.b, i22);
                    int i23 = (int) (cVar2.b - cVar2.c);
                    l16.c();
                    z1.o((z1) l16.b, i23);
                    arrayList4.add((z1) l16.a());
                }
                l11.c();
                x1.r((x1) l11.b, arrayList4);
            }
            x1 x1Var = (x1) l11.a();
            q1Var.c();
            r1.q((r1) q1Var.b, x1Var);
            t6Var.f.a((r1) q1Var.a(), 233);
            this.d = null;
        }
    }

    @Override // z8.b
    public Object a(Class cls) {
        if (!((Set) this.a).contains(q.a(cls))) {
            throw new a7.c("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a2 = ((z8.b) this.e).a(cls);
        if (!cls.equals(v9.a.class)) {
            return a2;
        }
        return new r();
    }

    @Override // z8.b
    public Object b(q qVar) {
        if (((Set) this.a).contains(qVar)) {
            return ((z8.b) this.e).b(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // r4.g
    public int c(long j10) {
        long[] jArr = (long[]) this.b;
        int b10 = g0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // z8.b
    public y9.b d(q qVar) {
        if (((Set) this.b).contains(qVar)) {
            return ((z8.b) this.e).d(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    @Override // z8.b
    public y9.b e(Class cls) {
        return d(q.a(cls));
    }

    @Override // r4.g
    public long f(int i10) {
        return ((long[]) this.b)[i10];
    }

    @Override // z8.b
    public Set g(q qVar) {
        if (((Set) this.d).contains(qVar)) {
            return ((z8.b) this.e).g(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // oc.a
    public Object get() {
        return new b3.a((Executor) ((oc.a) this.a).get(), (x2.d) ((oc.a) this.b).get(), (n) ((n) this.c).get(), (d3.d) ((oc.a) this.d).get(), (e3.c) ((oc.a) this.e).get());
    }

    @Override // r4.g
    public List h(long j10) {
        y4.d dVar = (y4.d) this.a;
        Map map = (Map) this.c;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        dVar.g(j10, dVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.i(j10, false, dVar.h, treeMap);
        dVar.h(j10, map, hashMap, dVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                y4.e eVar = (y4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new r4.c(null, null, null, decodeByteArray, eVar.c, 0, eVar.e, eVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, eVar.f, eVar.g, false, -16777216, eVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            y4.e eVar2 = (y4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
            r4.b bVar = (r4.b) entry.getValue();
            CharSequence charSequence = bVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (y4.a aVar : (y4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y4.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length(); i11++) {
                if (spannableStringBuilder.charAt(i11) == ' ') {
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                        i13++;
                    }
                    int i14 = i13 - i12;
                    if (i14 > 0) {
                        spannableStringBuilder.delete(i11, i14 + i11);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                if (spannableStringBuilder.charAt(i15) == '\n') {
                    int i16 = i15 + 1;
                    if (spannableStringBuilder.charAt(i16) == ' ') {
                        spannableStringBuilder.delete(i16, i15 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i17 = 0; i17 < spannableStringBuilder.length() - 1; i17++) {
                if (spannableStringBuilder.charAt(i17) == ' ') {
                    int i18 = i17 + 1;
                    if (spannableStringBuilder.charAt(i18) == '\n') {
                        spannableStringBuilder.delete(i17, i18);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.c;
            int i19 = eVar2.d;
            bVar.e = f10;
            bVar.f = i19;
            bVar.g = eVar2.e;
            bVar.h = eVar2.b;
            bVar.l = eVar2.f;
            float f11 = eVar2.i;
            int i20 = eVar2.h;
            bVar.k = f11;
            bVar.j = i20;
            bVar.p = eVar2.j;
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    @Override // z8.b
    public o i(q qVar) {
        if (((Set) this.c).contains(qVar)) {
            return ((z8.b) this.e).i(qVar);
        }
        throw new a7.c("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean j() {
        return true;
    }

    public byte[] k() {
        byte[] bArr = (byte[]) this.b;
        byte[] bArr2 = (byte[]) this.a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = ci1.b;
        BigInteger bigInteger3 = ci1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = ci1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a3 = ci1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = ci1.b(new byte[][]{a3, bArr2, bArr3});
        byte[] b11 = ci1.b(new byte[][]{a3, bArr});
        this.d = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
        }
        this.e = arrayList;
        FileLog.d("wear-auth: built answer; session " + ci1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    public s0 l() {
        String str = ((Long) this.a) == null ? " pc" : "";
        if (((String) this.b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = s3.c.l(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = s3.c.l(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.a).longValue(), (String) this.b, (String) this.c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public void n(View view, q0 q0Var, boolean z10, boolean z11) {
        f6 f6Var = (f6) this.e;
        zf.b2 b2Var = f6Var.W1;
        if (b2Var == null) {
            return;
        }
        b2Var.s(q0Var, true);
        f6Var.O0(false);
    }

    @Override // ud.b
    public void o(int i10, float f10, float f11, ud.c cVar) {
        ((TextView) this.b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((ud.a) this.d).e));
        ((sg.c) this.e).b(this);
    }

    @Override // r4.g
    public int p() {
        return ((long[]) this.b).length;
    }

    public void q(Canvas canvas, boolean z10, boolean z11, int i10, float f10) {
        RectF rectF = (RectF) this.b;
        float[] fArr = (float[]) this.c;
        Paint paint = (Paint) this.e;
        m3 m3Var = (m3) this.a;
        Path path = (Path) this.d;
        int i11 = (int) ((z11 ? 0 : (int) m3Var.C) * f10);
        int dp = AndroidUtilities.dp(10.0f) * Math.min(1, i11 / AndroidUtilities.dp(60.0f));
        if (i11 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f11 = dp;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
        path.rewind();
        rectF.set(0.0f, 0.0f, i10, (m3Var.getY() + m3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // org.telegram.ui.Components.vj0
    public void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
        Paint paint;
        z9 z9Var;
        Path path = (Path) this.b;
        da daVar = (da) this.c;
        Paint paint2 = (Paint) this.d;
        f6 f6Var = (f6) this.e;
        if (!z10 && (z9Var = f6Var.a2) != null && z9Var.c()) {
            if (z10) {
                daVar = (da) this.a;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            daVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((da) this.a) == null) {
                this.a = new da(f6Var.a2, f6Var.V1.getReactionsWindow().c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((da) this.a).e(f13, f14, f6Var.getMeasuredWidth() + f13, f6Var.getMeasuredHeight() + f14);
            paint = ((da) this.a).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            daVar.e(f15, f16, f6Var.getMeasuredWidth() + f15, f6Var.getMeasuredHeight() + f16);
            paint = daVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    @Override // org.telegram.ui.Components.vj0
    public boolean t() {
        return true;
    }

    public o v(Class cls) {
        return i(q.a(cls));
    }

    public String w() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean x(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new e(this, 28));
            }
        }
        return remove;
    }

    public Set y(Class cls) {
        return g(q.a(cls));
    }

    public void z(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.a;
        View view2 = (View) this.b;
        if (((Bitmap) this.c) == bitmap) {
            return;
        }
        if (((g) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((g) this.d) == null && ((g) this.e) == null && (bitmap2 = (Bitmap) this.c) != null) {
            bitmap2.recycle();
            this.c = null;
        }
        B();
        this.c = bitmap;
        g gVar = new g((Bitmap) this.c);
        this.e = gVar;
        view.setBackground(gVar);
        if (view2 != null) {
            g gVar2 = new g((Bitmap) this.c);
            this.d = gVar2;
            view2.setBackground(gVar2);
        }
    }

    public h(Context context, o5.b bVar) {
        this.a = context;
        this.b = bVar;
        D();
    }

    public h(y4.d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = dVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.b = jArr;
    }

    public h(sg.c cVar) {
        this.e = cVar;
        er erVar = er.h;
        this.c = new ud.a(0, this, erVar, 320L, true);
        this.d = new ud.a(1, this, erVar, 320L, true);
    }

    public h(m3 m3Var) {
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.a = m3Var;
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ void s() {
    }

    @Override // ud.b
    public /* synthetic */ void A(float f10, int i10) {
    }
}
