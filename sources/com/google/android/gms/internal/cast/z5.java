package com.google.android.gms.internal.cast;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.gi1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class z5 implements fl0, z3.d, ne.d, n5.b, r9.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public z5(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public static void D(z5 z5Var, x6 x6Var) {
        int i10 = x6Var.e;
        if (i10 == 2 && ((w6) z5Var.d) != null) {
            z5Var.F();
        }
        if (i10 == 2) {
            z5Var.d = new w6((p0) z5Var.b, (String) z5Var.a);
        } else {
            z5Var.d = z5Var.E();
        }
        w6 w6Var = (w6) z5Var.d;
        n6.l.h(w6Var);
        x6Var.d = w6Var.h;
        w6Var.b.add(x6Var);
    }

    public static z5 p(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        z5 z5Var = new z5();
        z5Var.d = new ArrayDeque();
        z5Var.b = sharedPreferences;
        z5Var.a = "topic_operation_queue";
        z5Var.c = ",";
        z5Var.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) z5Var.d)) {
            try {
                ((ArrayDeque) z5Var.d).clear();
                String string = ((SharedPreferences) z5Var.b).getString((String) z5Var.a, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) z5Var.c)) {
                    String[] split = string.split((String) z5Var.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) z5Var.d).add(str);
                        }
                    }
                    return z5Var;
                }
                return z5Var;
            } finally {
            }
        }
    }

    public void A() {
        Bitmap bitmap;
        if (((ed) this.d) != null) {
            this.d = null;
            View view = (View) this.c;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((ed) this.d) == null && ((ed) this.e) == null && (bitmap = (Bitmap) this.a) != null) {
            bitmap.recycle();
            this.a = null;
        }
    }

    public void B(Uri uri) {
        int i10;
        Context context = (Context) this.b;
        if (uri == null) {
            C();
            return;
        }
        if (uri.equals((Uri) this.a)) {
            return;
        }
        C();
        this.a = uri;
        e6.b bVar = (e6.b) this.c;
        int i11 = bVar.b;
        if (i11 == 0 || (i10 = bVar.c) == 0) {
            this.d = new f6.b(context, 0, 0, this);
        } else {
            this.d = new f6.b(context, i11, i10, this);
        }
        f6.b bVar2 = (f6.b) this.d;
        n6.l.h(bVar2);
        Uri uri2 = (Uri) this.a;
        n6.l.h(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void C() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.a = null;
    }

    public w6 E() {
        if (((w6) this.d) == null) {
            w6 w6Var = new w6((p0) this.b, (String) this.a);
            this.d = w6Var;
            w6Var.b(1);
        }
        return (w6) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void F() {
        int i10;
        r1 r1Var;
        int i11;
        long j10;
        w6 w6Var = (w6) this.d;
        if (w6Var != null) {
            Map map = w6Var.e;
            List<h3> list = w6Var.d;
            List<b> list2 = w6Var.c;
            List<x6> list3 = w6Var.b;
            d6.c cVar = w6Var.j;
            if (cVar != null) {
                cVar.l = null;
                w6Var.j = null;
            }
            long j11 = w6Var.i;
            r1 m10 = s1.m();
            m10.c();
            s1.t((s1) m10.b, j11);
            String str = w6Var.l;
            if (str != null) {
                m10.c();
                s1.y((s1) m10.b, str);
            }
            String str2 = w6Var.m;
            if (str2 != null) {
                m10.c();
                s1.u((s1) m10.b, str2);
            }
            k1 l4 = l1.l();
            String str3 = w6.o;
            l4.c();
            l1.n((l1) l4.b, str3);
            String str4 = w6Var.g;
            l4.c();
            l1.m((l1) l4.b, str4);
            l1 l1Var = (l1) l4.a();
            m10.c();
            s1.r((s1) m10.b, l1Var);
            d0 d0Var = w6Var.a;
            x1 l10 = y1.l();
            Object zza = d0Var.zza();
            if (zza != null) {
                j2 l11 = k2.l();
                l11.c();
                k2.m((k2) l11.b, (String) zza);
                k2 k2Var = (k2) l11.a();
                l10.c();
                y1.m((y1) l10.b, k2Var);
            }
            String str5 = w6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    g6.b bVar = w6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e);
                    j10 = 0;
                }
                l10.c();
                y1.n((y1) l10.b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (x6 x6Var : list3) {
                    x6Var.getClass();
                    v1 l12 = w1.l();
                    int i12 = x6Var.e;
                    l12.c();
                    w1.p((w1) l12.b, i12);
                    int i13 = (int) (x6Var.b - x6Var.d);
                    l12.c();
                    w1.m((w1) l12.b, i13);
                    Integer num = x6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        w1.n((w1) l12.b, intValue);
                    }
                    Boolean bool = x6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        w1.o((w1) l12.b, booleanValue);
                    }
                    arrayList.add((w1) l12.a());
                }
                l10.c();
                y1.o((y1) l10.b, arrayList);
            }
            int i14 = 2;
            if (list2.isEmpty()) {
                i10 = 1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (b bVar2 : list2) {
                    bVar2.getClass();
                    b2 l13 = c2.l();
                    int i15 = (int) (bVar2.b - bVar2.c);
                    l13.c();
                    c2.m((c2) l13.b, i15);
                    int i16 = bVar2.a;
                    int i17 = i16 != 1 ? i16 != 2 ? i16 != 3 ? 1 : 4 : 3 : 2;
                    l13.c();
                    c2.n((c2) l13.b, i17);
                    arrayList2.add((c2) l13.a());
                }
                i10 = 1;
                l10.c();
                y1.q((y1) l10.b, arrayList2);
            }
            if (list.isEmpty()) {
                r1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (h3 h3Var : list) {
                    String str6 = h3Var.a;
                    t1 l14 = u1.l();
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
                    u1.q((u1) l14.b, i11);
                    int i18 = (int) h3Var.b;
                    l14.c();
                    u1.m((u1) l14.b, i18);
                    int i19 = h3Var.c;
                    l14.c();
                    u1.n((u1) l14.b, i19);
                    int i20 = (int) (h3Var.d - h3Var.f);
                    l14.c();
                    u1.o((u1) l14.b, i20);
                    int i21 = (int) (h3Var.e - h3Var.f);
                    l14.c();
                    u1.p((u1) l14.b, i21);
                    arrayList3.add((u1) l14.a());
                    m10 = m10;
                    i14 = 2;
                }
                r1Var = m10;
                l10.c();
                y1.p((y1) l10.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (c cVar2 : map.values()) {
                    cVar2.getClass();
                    z1 l15 = a2.l();
                    int i22 = cVar2.e;
                    l15.c();
                    a2.p((a2) l15.b, i22);
                    int i23 = cVar2.d.get();
                    l15.c();
                    a2.m((a2) l15.b, i23);
                    int i24 = (int) (cVar2.a - cVar2.c);
                    l15.c();
                    a2.n((a2) l15.b, i24);
                    int i25 = (int) (cVar2.b - cVar2.c);
                    l15.c();
                    a2.o((a2) l15.b, i25);
                    arrayList4.add((a2) l15.a());
                }
                l10.c();
                y1.r((y1) l10.b, arrayList4);
            }
            y1 y1Var = (y1) l10.a();
            r1Var.c();
            s1.q((s1) r1Var.b, y1Var);
            w6Var.f.a((s1) r1Var.a(), 233);
            this.d = null;
        }
    }

    @Override // r9.b
    public Object a(Class cls) {
        if (!((Set) this.b).contains(r9.r.a(cls))) {
            throw new androidx.car.app.j("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a2 = ((r9.b) this.e).a(cls);
        if (!cls.equals(na.a.class)) {
            return a2;
        }
        return new r9.s();
    }

    @Override // r9.b
    public qa.b b(Class cls) {
        return e(r9.r.a(cls));
    }

    @Override // r9.b
    public Object c(r9.r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((r9.b) this.e).c(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // z3.d
    public int d(long j10) {
        long[] jArr = (long[]) this.c;
        int b10 = e2.m0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // r9.b
    public qa.b e(r9.r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((r9.b) this.e).e(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // r9.b
    public Set f(r9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((r9.b) this.e).f(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // r9.b
    public r9.p g(r9.r rVar) {
        if (((Set) this.a).contains(rVar)) {
            return ((r9.b) this.e).g(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // hd.a
    public Object get() {
        return new q5.a((Executor) ((hd.a) this.b).get(), (m5.d) ((hd.a) this.c).get(), (m.g3) ((m.g3) this.a).get(), (s5.d) ((hd.a) this.d).get(), (t5.c) ((hd.a) this.e).get());
    }

    public byte[] h() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = gi1.b;
        BigInteger bigInteger3 = gi1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = gi1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a10 = gi1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = gi1.b(new byte[][]{a10, bArr2, bArr3});
        byte[] b11 = gi1.b(new byte[][]{a10, bArr});
        this.d = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
        }
        this.e = arrayList;
        FileLog.d("wear-auth: built answer; session " + gi1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean i() {
        return true;
    }

    public z9.s0 j() {
        String str = ((Long) this.b) == null ? " pc" : "";
        if (((String) this.a) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = si.o0.u(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = si.o0.u(str, " importance");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        return new z9.s0((String) this.a, ((Integer) this.e).intValue(), (String) this.c, ((Long) this.b).longValue(), ((Long) this.d).longValue());
    }

    @Override // z3.d
    public long k(int i10) {
        return ((long[]) this.c)[i10];
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        ei.f6 f6Var = (ei.f6) this.e;
        rg.c2 c2Var = f6Var.a2;
        if (c2Var == null) {
            return;
        }
        c2Var.s(i1Var, true);
        f6Var.M0(false);
    }

    public void n(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        RectF rectF = (RectF) this.c;
        float[] fArr = (float[]) this.a;
        Paint paint = (Paint) this.e;
        org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) this.b;
        Path path = (Path) this.d;
        int i11 = (int) ((z11 ? 0 : (int) q3Var.G) * f7);
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
        rectF.set(0.0f, 0.0f, i10, (q3Var.getY() + q3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // ne.d
    public void o(int i10, float f7, float f10, ne.e eVar) {
        ((TextView) this.c).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((ne.b) this.d).e));
        ((kh.c) this.e).b(this);
    }

    public r9.p q(Class cls) {
        return g(r9.r.a(cls));
    }

    @Override // z3.d
    public List r(long j10) {
        f4.c cVar = (f4.c) this.b;
        Map map = (Map) this.a;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        cVar.g(j10, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j10, false, cVar.h, treeMap);
        cVar.h(j10, map, hashMap, cVar.h, treeMap);
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
                f4.e eVar = (f4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, eVar.c, 0, eVar.e, eVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, eVar.f, eVar.g, false, -16777216, eVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f4.e eVar2 = (f4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
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
            float f7 = eVar2.c;
            int i19 = eVar2.d;
            aVar.e = f7;
            aVar.f = i19;
            aVar.g = eVar2.e;
            aVar.h = eVar2.b;
            aVar.l = eVar2.f;
            float f10 = eVar2.i;
            int i20 = eVar2.h;
            aVar.k = f10;
            aVar.j = i20;
            aVar.p = eVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.fl0
    public void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        ja jaVar;
        Path path = (Path) this.c;
        na naVar = (na) this.a;
        Paint paint2 = (Paint) this.d;
        ei.f6 f6Var = (ei.f6) this.e;
        if (!z10 && (jaVar = f6Var.e2) != null && jaVar.c()) {
            if (z10) {
                naVar = (na) this.b;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            naVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((na) this.b) == null) {
                this.b = new na(f6Var.e2, f6Var.Z1.getReactionsWindow().c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((na) this.b).e(f12, f13, f6Var.getMeasuredWidth() + f12, f6Var.getMeasuredHeight() + f13);
            paint = ((na) this.b).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            naVar.e(f14, f15, f6Var.getMeasuredWidth() + f14, f6Var.getMeasuredHeight() + f15);
            paint = naVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    public String t() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    @Override // z3.d
    public int v() {
        return ((long[]) this.c).length;
    }

    @Override // org.telegram.ui.Components.fl0
    public boolean w() {
        return true;
    }

    public boolean x(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new com.google.firebase.messaging.s(this, 0));
            }
        }
        return remove;
    }

    public Set y(Class cls) {
        return f(r9.r.a(cls));
    }

    public void z(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.b;
        View view2 = (View) this.c;
        if (((Bitmap) this.a) == bitmap) {
            return;
        }
        if (((ed) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((ed) this.d) == null && ((ed) this.e) == null && (bitmap2 = (Bitmap) this.a) != null) {
            bitmap2.recycle();
            this.a = null;
        }
        A();
        this.a = bitmap;
        ed edVar = new ed((Bitmap) this.a);
        this.e = edVar;
        view.setBackground(edVar);
        if (view2 != null) {
            ed edVar2 = new ed((Bitmap) this.a);
            this.d = edVar2;
            view2.setBackground(edVar2);
        }
    }

    public z5(Context context, e6.b bVar) {
        this.b = context;
        this.c = bVar;
        C();
    }

    public z5(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.b = cVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.a = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.c = jArr;
    }

    public z5(kh.c cVar) {
        this.e = cVar;
        bs bsVar = bs.h;
        this.a = new ne.b(0, this, bsVar, 320L, true);
        this.d = new ne.b(1, this, bsVar, 320L, true);
    }

    public z5(org.telegram.ui.ActionBar.q3 q3Var) {
        this.c = new RectF();
        this.a = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.b = q3Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void u() {
    }

    @Override // ne.d
    public /* synthetic */ void H(float f7, int i10) {
    }
}
