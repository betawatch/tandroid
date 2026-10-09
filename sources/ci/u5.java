package ci;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.nj1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class u5 implements jl0, z3.d, me.d, n5.b, q9.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ u5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public static void E(u5 u5Var, com.google.android.gms.internal.cast.w6 w6Var) {
        int i10 = w6Var.e;
        if (i10 == 2 && ((com.google.android.gms.internal.cast.v6) u5Var.d) != null) {
            u5Var.G();
        }
        if (i10 == 2) {
            u5Var.d = new com.google.android.gms.internal.cast.v6((com.google.android.gms.internal.cast.p0) u5Var.a, (String) u5Var.c);
        } else {
            u5Var.d = u5Var.F();
        }
        com.google.android.gms.internal.cast.v6 v6Var = (com.google.android.gms.internal.cast.v6) u5Var.d;
        n6.l.h(v6Var);
        w6Var.d = v6Var.h;
        v6Var.b.add(w6Var);
    }

    public static u5 k(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        u5 u5Var = new u5();
        u5Var.d = new ArrayDeque();
        u5Var.a = sharedPreferences;
        u5Var.b = "topic_operation_queue";
        u5Var.c = ",";
        u5Var.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) u5Var.d)) {
            try {
                ((ArrayDeque) u5Var.d).clear();
                String string = ((SharedPreferences) u5Var.a).getString((String) u5Var.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) u5Var.c)) {
                    String[] split = string.split((String) u5Var.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) u5Var.d).add(str);
                        }
                    }
                    return u5Var;
                }
                return u5Var;
            } finally {
            }
        }
    }

    public void B() {
        Bitmap bitmap;
        if (((org.telegram.ui.Components.hd) this.d) != null) {
            this.d = null;
            View view = (View) this.b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((org.telegram.ui.Components.hd) this.d) == null && ((org.telegram.ui.Components.hd) this.e) == null && (bitmap = (Bitmap) this.c) != null) {
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
        e6.b bVar = (e6.b) this.b;
        int i11 = bVar.b;
        if (i11 == 0 || (i10 = bVar.c) == 0) {
            this.d = new f6.b(context, 0, 0, this);
        } else {
            this.d = new f6.b(context, i11, i10, this);
        }
        f6.b bVar2 = (f6.b) this.d;
        n6.l.h(bVar2);
        Uri uri2 = (Uri) this.c;
        n6.l.h(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void D() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public com.google.android.gms.internal.cast.v6 F() {
        if (((com.google.android.gms.internal.cast.v6) this.d) == null) {
            com.google.android.gms.internal.cast.v6 v6Var = new com.google.android.gms.internal.cast.v6((com.google.android.gms.internal.cast.p0) this.a, (String) this.c);
            this.d = v6Var;
            v6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.v6) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void G() {
        int i10;
        com.google.android.gms.internal.cast.r1 r1Var;
        int i11;
        long j3;
        com.google.android.gms.internal.cast.v6 v6Var = (com.google.android.gms.internal.cast.v6) this.d;
        if (v6Var != null) {
            Map map = v6Var.e;
            List<com.google.android.gms.internal.cast.h3> list = v6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = v6Var.c;
            List<com.google.android.gms.internal.cast.w6> list3 = v6Var.b;
            d6.c cVar = v6Var.j;
            if (cVar != null) {
                cVar.l = null;
                v6Var.j = null;
            }
            long j10 = v6Var.i;
            com.google.android.gms.internal.cast.r1 m10 = com.google.android.gms.internal.cast.s1.m();
            m10.c();
            com.google.android.gms.internal.cast.s1.t((com.google.android.gms.internal.cast.s1) m10.b, j10);
            String str = v6Var.l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.s1.y((com.google.android.gms.internal.cast.s1) m10.b, str);
            }
            String str2 = v6Var.m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.s1.u((com.google.android.gms.internal.cast.s1) m10.b, str2);
            }
            com.google.android.gms.internal.cast.k1 l4 = com.google.android.gms.internal.cast.l1.l();
            String str3 = com.google.android.gms.internal.cast.v6.o;
            l4.c();
            com.google.android.gms.internal.cast.l1.n((com.google.android.gms.internal.cast.l1) l4.b, str3);
            String str4 = v6Var.g;
            l4.c();
            com.google.android.gms.internal.cast.l1.m((com.google.android.gms.internal.cast.l1) l4.b, str4);
            com.google.android.gms.internal.cast.l1 l1Var = (com.google.android.gms.internal.cast.l1) l4.a();
            m10.c();
            com.google.android.gms.internal.cast.s1.r((com.google.android.gms.internal.cast.s1) m10.b, l1Var);
            com.google.android.gms.internal.cast.d0 d0Var = v6Var.a;
            com.google.android.gms.internal.cast.x1 l10 = com.google.android.gms.internal.cast.y1.l();
            Object zza = d0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.j2 l11 = com.google.android.gms.internal.cast.k2.l();
                l11.c();
                com.google.android.gms.internal.cast.k2.m((com.google.android.gms.internal.cast.k2) l11.b, (String) zza);
                com.google.android.gms.internal.cast.k2 k2Var = (com.google.android.gms.internal.cast.k2) l11.a();
                l10.c();
                com.google.android.gms.internal.cast.y1.m((com.google.android.gms.internal.cast.y1) l10.b, k2Var);
            }
            String str5 = v6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e7) {
                    g6.b bVar = com.google.android.gms.internal.cast.v6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e7);
                    j3 = 0;
                }
                l10.c();
                com.google.android.gms.internal.cast.y1.n((com.google.android.gms.internal.cast.y1) l10.b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.w6 w6Var : list3) {
                    w6Var.getClass();
                    com.google.android.gms.internal.cast.v1 l12 = com.google.android.gms.internal.cast.w1.l();
                    int i12 = w6Var.e;
                    l12.c();
                    com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l12.b, i12);
                    int i13 = (int) (w6Var.b - w6Var.d);
                    l12.c();
                    com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l12.b, i13);
                    Integer num = w6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l12.b, intValue);
                    }
                    Boolean bool = w6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l12.b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.w1) l12.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.y1.o((com.google.android.gms.internal.cast.y1) l10.b, arrayList);
            }
            int i14 = 2;
            if (list2.isEmpty()) {
                i10 = 1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.b2 l13 = com.google.android.gms.internal.cast.c2.l();
                    int i15 = (int) (bVar2.b - bVar2.c);
                    l13.c();
                    com.google.android.gms.internal.cast.c2.m((com.google.android.gms.internal.cast.c2) l13.b, i15);
                    int i16 = bVar2.a;
                    int i17 = i16 != 1 ? i16 != 2 ? i16 != 3 ? 1 : 4 : 3 : 2;
                    l13.c();
                    com.google.android.gms.internal.cast.c2.n((com.google.android.gms.internal.cast.c2) l13.b, i17);
                    arrayList2.add((com.google.android.gms.internal.cast.c2) l13.a());
                }
                i10 = 1;
                l10.c();
                com.google.android.gms.internal.cast.y1.q((com.google.android.gms.internal.cast.y1) l10.b, arrayList2);
            }
            if (list.isEmpty()) {
                r1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.h3 h3Var : list) {
                    String str6 = h3Var.a;
                    com.google.android.gms.internal.cast.t1 l14 = com.google.android.gms.internal.cast.u1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i11 = 13;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i11 = 22;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i11 = 15;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i11 = 19;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i11 = 23;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i11 = 9;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i11 = 21;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i11 = 10;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i11 = 14;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i11 = 7;
                                break;
                            }
                            i11 = i10;
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i11 = 20;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i11 = i14;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i11 = 8;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i11 = 3;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i11 = 6;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i11 = 5;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i11 = 4;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i11 = 18;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i11 = 16;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i11 = 12;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i11 = 11;
                                break;
                            }
                            i11 = i10;
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i11 = 17;
                                break;
                            }
                            i11 = i10;
                            break;
                        default:
                            i11 = i10;
                            break;
                    }
                    l14.c();
                    com.google.android.gms.internal.cast.u1.q((com.google.android.gms.internal.cast.u1) l14.b, i11);
                    int i18 = (int) h3Var.b;
                    l14.c();
                    com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l14.b, i18);
                    int i19 = h3Var.c;
                    l14.c();
                    com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l14.b, i19);
                    int i20 = (int) (h3Var.d - h3Var.f);
                    l14.c();
                    com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l14.b, i20);
                    int i21 = (int) (h3Var.e - h3Var.f);
                    l14.c();
                    com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l14.b, i21);
                    arrayList3.add((com.google.android.gms.internal.cast.u1) l14.a());
                    m10 = m10;
                    i14 = 2;
                }
                r1Var = m10;
                l10.c();
                com.google.android.gms.internal.cast.y1.p((com.google.android.gms.internal.cast.y1) l10.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    com.google.android.gms.internal.cast.z1 l15 = com.google.android.gms.internal.cast.a2.l();
                    int i22 = cVar2.e;
                    l15.c();
                    com.google.android.gms.internal.cast.a2.p((com.google.android.gms.internal.cast.a2) l15.b, i22);
                    int i23 = cVar2.d.get();
                    l15.c();
                    com.google.android.gms.internal.cast.a2.m((com.google.android.gms.internal.cast.a2) l15.b, i23);
                    int i24 = (int) (cVar2.a - cVar2.c);
                    l15.c();
                    com.google.android.gms.internal.cast.a2.n((com.google.android.gms.internal.cast.a2) l15.b, i24);
                    int i25 = (int) (cVar2.b - cVar2.c);
                    l15.c();
                    com.google.android.gms.internal.cast.a2.o((com.google.android.gms.internal.cast.a2) l15.b, i25);
                    arrayList4.add((com.google.android.gms.internal.cast.a2) l15.a());
                }
                l10.c();
                com.google.android.gms.internal.cast.y1.r((com.google.android.gms.internal.cast.y1) l10.b, arrayList4);
            }
            com.google.android.gms.internal.cast.y1 y1Var = (com.google.android.gms.internal.cast.y1) l10.a();
            r1Var.c();
            com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) r1Var.b, y1Var);
            v6Var.f.a((com.google.android.gms.internal.cast.s1) r1Var.a(), 233);
            this.d = null;
        }
    }

    @Override // q9.b
    public Object a(Class cls) {
        if (!((Set) this.a).contains(q9.r.a(cls))) {
            throw new ae.x("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a2 = ((q9.b) this.e).a(cls);
        if (!cls.equals(ma.a.class)) {
            return a2;
        }
        return new q9.s();
    }

    @Override // q9.b
    public q9.p b(q9.r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((q9.b) this.e).b(rVar);
        }
        throw new ae.x("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // q9.b
    public pa.b c(Class cls) {
        return d(q9.r.a(cls));
    }

    @Override // q9.b
    public pa.b d(q9.r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((q9.b) this.e).d(rVar);
        }
        throw new ae.x("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // z3.d
    public int e(long j3) {
        long[] jArr = (long[]) this.b;
        int a2 = e2.d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    @Override // q9.b
    public Set f(q9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((q9.b) this.e).f(rVar);
        }
        throw new ae.x("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // q9.b
    public Object g(q9.r rVar) {
        if (((Set) this.a).contains(rVar)) {
            return ((q9.b) this.e).g(rVar);
        }
        throw new ae.x("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // gd.a
    public Object get() {
        return new q5.a((Executor) ((gd.a) this.a).get(), (m5.d) ((gd.a) this.b).get(), (la.h) ((la.h) this.c).get(), (s5.d) ((gd.a) this.d).get(), (t5.c) ((gd.a) this.e).get());
    }

    public byte[] h() {
        byte[] bArr = (byte[]) this.b;
        byte[] bArr2 = (byte[]) this.a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = nj1.b;
        BigInteger bigInteger3 = nj1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = nj1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a10 = nj1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = nj1.b(new byte[][]{a10, bArr2, bArr3});
        byte[] b11 = nj1.b(new byte[][]{a10, bArr});
        this.d = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
        }
        this.e = arrayList;
        FileLog.d("wear-auth: built answer; session " + nj1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    public y9.s0 i() {
        String str = ((Long) this.a) == null ? " pc" : "";
        if (((String) this.b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = sc.v.v(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = sc.v.v(str, " importance");
        }
        if (str.isEmpty()) {
            return new y9.s0(((Long) this.a).longValue(), (String) this.b, (String) this.c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void j(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        RectF rectF = (RectF) this.b;
        float[] fArr = (float[]) this.e;
        Paint paint = (Paint) this.d;
        org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.a;
        Path path = (Path) this.c;
        int i11 = (int) ((z11 ? 0 : (int) n3Var.G) * f7);
        int dp = AndroidUtilities.dp(10.0f) * Math.min(1, i11 / AndroidUtilities.dp(60.0f));
        if (i11 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f10 = dp;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        path.rewind();
        rectF.set(0.0f, 0.0f, i10, (n3Var.getY() + n3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // z3.d
    public long l(int i10) {
        return ((long[]) this.b)[i10];
    }

    @Override // org.telegram.ui.Components.jl0
    public void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        q6 q6Var = (q6) this.e;
        qg.b2 b2Var = q6Var.a2;
        if (b2Var == null) {
            return;
        }
        b2Var.s(n0Var, true);
        q6Var.N0(false);
    }

    @Override // me.d
    public void n(int i10, float f7, float f10, me.e eVar) {
        ((TextView) this.b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((me.b) this.d).e));
        ((jh.c) this.e).b(this);
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean o() {
        return true;
    }

    @Override // z3.d
    public List p(long j3) {
        f4.c cVar = (f4.c) this.a;
        Map map = (Map) this.c;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, map, hashMap, cVar.h, treeMap);
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
                f4.f fVar = (f4.f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, fVar.c, 0, fVar.e, fVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, fVar.f, fVar.g, false, -16777216, fVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f4.f fVar2 = (f4.f) hashMap.get(entry.getKey());
            fVar2.getClass();
            d2.a aVar = (d2.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (f4.a aVar2 : (f4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), f4.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
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
            float f7 = fVar2.c;
            int i19 = fVar2.d;
            aVar.e = f7;
            aVar.f = i19;
            aVar.g = fVar2.e;
            aVar.h = fVar2.b;
            aVar.l = fVar2.f;
            float f10 = fVar2.i;
            int i20 = fVar2.h;
            aVar.k = f10;
            aVar.j = i20;
            aVar.p = fVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        org.telegram.ui.Components.ma maVar;
        Path path = (Path) this.c;
        org.telegram.ui.Components.qa qaVar = (org.telegram.ui.Components.qa) this.b;
        Paint paint2 = (Paint) this.d;
        q6 q6Var = (q6) this.e;
        if (!z10 && (maVar = q6Var.e2) != null && maVar.c()) {
            if (z10) {
                qaVar = (org.telegram.ui.Components.qa) this.a;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            qaVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((org.telegram.ui.Components.qa) this.a) == null) {
                this.a = new org.telegram.ui.Components.qa(q6Var.e2, q6Var.Z1.getReactionsWindow().c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((org.telegram.ui.Components.qa) this.a).e(f12, f13, q6Var.getMeasuredWidth() + f12, q6Var.getMeasuredHeight() + f13);
            paint = ((org.telegram.ui.Components.qa) this.a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            qaVar.e(f14, f15, q6Var.getMeasuredWidth() + f14, q6Var.getMeasuredHeight() + f15);
            paint = qaVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    public q9.p t(Class cls) {
        return b(q9.r.a(cls));
    }

    public String u() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean v() {
        return true;
    }

    @Override // z3.d
    public int w() {
        return ((long[]) this.b).length;
    }

    public boolean x(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new rc(this, 2));
            }
        }
        return remove;
    }

    public Set y(Class cls) {
        return f(q9.r.a(cls));
    }

    public void z(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.a;
        View view2 = (View) this.b;
        if (((Bitmap) this.c) == bitmap) {
            return;
        }
        if (((org.telegram.ui.Components.hd) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((org.telegram.ui.Components.hd) this.d) == null && ((org.telegram.ui.Components.hd) this.e) == null && (bitmap2 = (Bitmap) this.c) != null) {
            bitmap2.recycle();
            this.c = null;
        }
        B();
        this.c = bitmap;
        org.telegram.ui.Components.hd hdVar = new org.telegram.ui.Components.hd((Bitmap) this.c);
        this.e = hdVar;
        view.setBackground(hdVar);
        if (view2 != null) {
            org.telegram.ui.Components.hd hdVar2 = new org.telegram.ui.Components.hd((Bitmap) this.c);
            this.d = hdVar2;
            view2.setBackground(hdVar2);
        }
    }

    public u5(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public u5(Context context, e6.b bVar) {
        this.a = context;
        this.b = bVar;
        D();
    }

    public u5(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = cVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.b = jArr;
    }

    public u5(jh.c cVar) {
        this.e = cVar;
        hs hsVar = hs.h;
        this.c = new me.b(0, this, hsVar, 320L, true);
        this.d = new me.b(1, this, hsVar, 320L, true);
    }

    public u5(org.telegram.ui.ActionBar.n3 n3Var) {
        this.b = new RectF();
        this.e = new float[8];
        this.c = new Path();
        this.d = new Paint(1);
        this.a = n3Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void s() {
    }

    @Override // me.d
    public /* synthetic */ void A(float f7, int i10) {
    }
}
