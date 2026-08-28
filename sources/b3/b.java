package b3;

import a5.m;
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
import androidx.car.app.j;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.d0;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.j2;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.k2;
import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.p0;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.v6;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.w6;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.z1;
import d5.f0;
import g9.s0;
import hg.r0;
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
import kh.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vc;
import org.telegram.ui.di1;
import r4.f;
import x2.d;
import x5.l;
import y4.e;
import y8.p;
import y8.r;
import y8.s;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b implements y2.b, tj0, td.b, f, y8.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public b(Context context) {
        this(context, new o5.b(-1, 0, 0));
    }

    public static void D(b bVar, w6 w6Var) {
        int i9 = w6Var.e;
        if (i9 == 2 && ((v6) bVar.d) != null) {
            bVar.F();
        }
        if (i9 == 2) {
            bVar.d = new v6((p0) bVar.a, (String) bVar.c);
        } else {
            bVar.d = bVar.E();
        }
        v6 v6Var = (v6) bVar.d;
        l.h(v6Var);
        w6Var.d = v6Var.h;
        v6Var.b.add(w6Var);
    }

    public static b o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        b bVar = new b();
        bVar.d = new ArrayDeque();
        bVar.a = sharedPreferences;
        bVar.b = "topic_operation_queue";
        bVar.c = ",";
        bVar.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) bVar.d)) {
            try {
                ((ArrayDeque) bVar.d).clear();
                String string = ((SharedPreferences) bVar.a).getString((String) bVar.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) bVar.c)) {
                    String[] split = string.split((String) bVar.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) bVar.d).add(str);
                        }
                    }
                    return bVar;
                }
                return bVar;
            } finally {
            }
        }
    }

    public void A(Uri uri) {
        int i9;
        Context context = (Context) this.a;
        if (uri == null) {
            C();
            return;
        }
        if (uri.equals((Uri) this.c)) {
            return;
        }
        C();
        this.c = uri;
        o5.b bVar = (o5.b) this.b;
        int i10 = bVar.b;
        if (i10 == 0 || (i9 = bVar.c) == 0) {
            this.d = new p5.b(context, 0, 0, this);
        } else {
            this.d = new p5.b(context, i10, i9, this);
        }
        p5.b bVar2 = (p5.b) this.d;
        l.h(bVar2);
        Uri uri2 = (Uri) this.c;
        l.h(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void C() {
        p5.b bVar = (p5.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public v6 E() {
        if (((v6) this.d) == null) {
            v6 v6Var = new v6((p0) this.a, (String) this.c);
            this.d = v6Var;
            v6Var.b(1);
        }
        return (v6) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void F() {
        r1 r1Var;
        int i9;
        long j10;
        v6 v6Var = (v6) this.d;
        if (v6Var != null) {
            Map map = v6Var.e;
            List<h3> list = v6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = v6Var.c;
            List<w6> list3 = v6Var.b;
            n5.c cVar = v6Var.j;
            if (cVar != null) {
                cVar.l = null;
                v6Var.j = null;
            }
            long j11 = v6Var.i;
            r1 m10 = s1.m();
            m10.c();
            s1.t((s1) m10.b, j11);
            String str = v6Var.l;
            if (str != null) {
                m10.c();
                s1.y((s1) m10.b, str);
            }
            String str2 = v6Var.m;
            if (str2 != null) {
                m10.c();
                s1.u((s1) m10.b, str2);
            }
            k1 l10 = l1.l();
            String str3 = v6.o;
            l10.c();
            l1.n((l1) l10.b, str3);
            String str4 = v6Var.g;
            l10.c();
            l1.m((l1) l10.b, str4);
            l1 l1Var = (l1) l10.a();
            m10.c();
            s1.r((s1) m10.b, l1Var);
            d0 d0Var = v6Var.a;
            x1 l11 = y1.l();
            Object zza = d0Var.zza();
            if (zza != null) {
                j2 l12 = k2.l();
                l12.c();
                k2.m((k2) l12.b, (String) zza);
                k2 k2Var = (k2) l12.a();
                l11.c();
                y1.m((y1) l11.b, k2Var);
            }
            String str5 = v6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    q5.b bVar = v6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j10 = 0;
                }
                l11.c();
                y1.n((y1) l11.b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (w6 w6Var : list3) {
                    w6Var.getClass();
                    v1 l13 = w1.l();
                    int i10 = w6Var.e;
                    l13.c();
                    w1.p((w1) l13.b, i10);
                    int i11 = (int) (w6Var.b - w6Var.d);
                    l13.c();
                    w1.m((w1) l13.b, i11);
                    Integer num = w6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        w1.n((w1) l13.b, intValue);
                    }
                    Boolean bool = w6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        w1.o((w1) l13.b, booleanValue);
                    }
                    arrayList.add((w1) l13.a());
                }
                l11.c();
                y1.o((y1) l11.b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    b2 l14 = c2.l();
                    int i12 = (int) (bVar2.b - bVar2.c);
                    l14.c();
                    c2.m((c2) l14.b, i12);
                    int i13 = bVar2.a;
                    int i14 = i13 != 1 ? i13 != 2 ? i13 != 3 ? 1 : 4 : 3 : 2;
                    l14.c();
                    c2.n((c2) l14.b, i14);
                    arrayList2.add((c2) l14.a());
                }
                l11.c();
                y1.q((y1) l11.b, arrayList2);
            }
            if (list.isEmpty()) {
                r1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (h3 h3Var : list) {
                    String str6 = h3Var.a;
                    t1 l15 = u1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i9 = 13;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i9 = 22;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i9 = 15;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i9 = 19;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i9 = 23;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i9 = 9;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i9 = 21;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i9 = 10;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i9 = 14;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i9 = 7;
                                break;
                            }
                            i9 = 1;
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i9 = 20;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i9 = 2;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i9 = 8;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i9 = 3;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i9 = 6;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i9 = 5;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i9 = 4;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i9 = 18;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i9 = 16;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i9 = 12;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i9 = 11;
                                break;
                            }
                            i9 = 1;
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i9 = 17;
                                break;
                            }
                            i9 = 1;
                            break;
                        default:
                            i9 = 1;
                            break;
                    }
                    l15.c();
                    u1.q((u1) l15.b, i9);
                    int i15 = (int) h3Var.b;
                    l15.c();
                    u1.m((u1) l15.b, i15);
                    int i16 = h3Var.c;
                    l15.c();
                    u1.n((u1) l15.b, i16);
                    int i17 = (int) (h3Var.d - h3Var.f);
                    l15.c();
                    u1.o((u1) l15.b, i17);
                    int i18 = (int) (h3Var.e - h3Var.f);
                    l15.c();
                    u1.p((u1) l15.b, i18);
                    arrayList3.add((u1) l15.a());
                    m10 = m10;
                }
                r1Var = m10;
                l11.c();
                y1.p((y1) l11.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    z1 l16 = a2.l();
                    int i19 = cVar2.e;
                    l16.c();
                    a2.p((a2) l16.b, i19);
                    int i20 = cVar2.d.get();
                    l16.c();
                    a2.m((a2) l16.b, i20);
                    int i21 = (int) (cVar2.a - cVar2.c);
                    l16.c();
                    a2.n((a2) l16.b, i21);
                    int i22 = (int) (cVar2.b - cVar2.c);
                    l16.c();
                    a2.o((a2) l16.b, i22);
                    arrayList4.add((a2) l16.a());
                }
                l11.c();
                y1.r((y1) l11.b, arrayList4);
            }
            y1 y1Var = (y1) l11.a();
            r1Var.c();
            s1.q((s1) r1Var.b, y1Var);
            v6Var.f.a((s1) r1Var.a(), 233);
            this.d = null;
        }
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        ((TextView) this.b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((td.a) this.d).e));
        ((rg.c) this.e).b(this);
    }

    @Override // y8.b
    public Object a(Class cls) {
        if (!((Set) this.a).contains(r.a(cls))) {
            throw new j("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a2 = ((y8.b) this.e).a(cls);
        if (!cls.equals(u9.a.class)) {
            return a2;
        }
        return new s();
    }

    @Override // r4.f
    public int b(long j10) {
        long[] jArr = (long[]) this.b;
        int b10 = f0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // y8.b
    public Object c(r rVar) {
        if (((Set) this.a).contains(rVar)) {
            return ((y8.b) this.e).c(rVar);
        }
        throw new j("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // org.telegram.ui.Components.tj0
    public void d(View view, r0 r0Var, boolean z10, boolean z11) {
        g6 g6Var = (g6) this.e;
        yf.a2 a2Var = g6Var.W1;
        if (a2Var == null) {
            return;
        }
        a2Var.s(r0Var, true);
        g6Var.O0(false);
    }

    @Override // y8.b
    public x9.b e(Class cls) {
        return g(r.a(cls));
    }

    @Override // y8.b
    public p f(r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((y8.b) this.e).f(rVar);
        }
        throw new j("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // y8.b
    public x9.b g(r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((y8.b) this.e).g(rVar);
        }
        throw new j("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // nc.a
    public Object get() {
        return new a((Executor) ((nc.a) this.a).get(), (d) ((nc.a) this.b).get(), (m) ((m) this.e).get(), (d3.d) ((nc.a) this.c).get(), (e3.c) ((nc.a) this.d).get());
    }

    @Override // r4.f
    public long h(int i9) {
        return ((long[]) this.b)[i9];
    }

    @Override // y8.b
    public Set i(r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((y8.b) this.e).i(rVar);
        }
        throw new j("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    public byte[] j() {
        byte[] bArr = (byte[]) this.b;
        byte[] bArr2 = (byte[]) this.a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = di1.b;
        BigInteger bigInteger3 = di1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = di1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a3 = di1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = di1.b(new byte[][]{a3, bArr2, bArr3});
        byte[] b11 = di1.b(new byte[][]{a3, bArr});
        this.d = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = i9 * 8;
            arrayList.add(strArr[(int) (((b11[i10 + 7] & 255) | ((((((((b11[i10] & 127) << 56) | ((b11[i10 + 1] & 255) << 48)) | ((b11[i10 + 2] & 255) << 40)) | ((b11[i10 + 3] & 255) << 32)) | ((b11[i10 + 4] & 255) << 24)) | ((b11[i10 + 5] & 255) << 16)) | ((b11[i10 + 6] & 255) << 8))) % 200)]);
        }
        this.e = arrayList;
        FileLog.d("wear-auth: built answer; session " + di1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    public s0 k() {
        String str = ((Long) this.a) == null ? " pc" : "";
        if (((String) this.b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = ta.b.j(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = ta.b.j(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.a).longValue(), (String) this.b, (String) this.c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void l(Canvas canvas, boolean z10, boolean z11, int i9, float f10) {
        RectF rectF = (RectF) this.b;
        float[] fArr = (float[]) this.c;
        Paint paint = (Paint) this.e;
        m3 m3Var = (m3) this.a;
        Path path = (Path) this.d;
        int i10 = (int) ((z11 ? 0 : (int) m3Var.C) * f10);
        int dp = AndroidUtilities.dp(10.0f) * Math.min(1, i10 / AndroidUtilities.dp(60.0f));
        if (i10 <= 0) {
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
        rectF.set(0.0f, 0.0f, i9, (m3Var.getY() + m3Var.getHeight()) - i10);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // r4.f
    public List m(long j10) {
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
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = (e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new r4.b(null, null, null, decodeByteArray, eVar.c, 0, eVar.e, eVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, eVar.f, eVar.g, false, -16777216, eVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = (e) hashMap.get(entry.getKey());
            eVar2.getClass();
            r4.a aVar = (r4.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (y4.a aVar2 : (y4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), y4.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.c;
            int i18 = eVar2.d;
            aVar.e = f10;
            aVar.f = i18;
            aVar.g = eVar2.e;
            aVar.h = eVar2.b;
            aVar.l = eVar2.f;
            float f11 = eVar2.i;
            int i19 = eVar2.h;
            aVar.k = f11;
            aVar.j = i19;
            aVar.p = eVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean p() {
        return false;
    }

    public p q(Class cls) {
        return f(r.a(cls));
    }

    @Override // r4.f
    public int r() {
        return ((long[]) this.b).length;
    }

    @Override // org.telegram.ui.Components.tj0
    public void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
        Paint paint;
        ba baVar;
        Path path = (Path) this.b;
        fa faVar = (fa) this.c;
        Paint paint2 = (Paint) this.d;
        g6 g6Var = (g6) this.e;
        if (!z10 && (baVar = g6Var.a2) != null && baVar.c()) {
            if (z10) {
                faVar = (fa) this.a;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            faVar.b(canvas, true);
            paint2.setAlpha((int) (i9 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((fa) this.a) == null) {
                this.a = new fa(g6Var.a2, g6Var.V1.getReactionsWindow().c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((fa) this.a).e(f13, f14, g6Var.getMeasuredWidth() + f13, g6Var.getMeasuredHeight() + f14);
            paint = ((fa) this.a).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            faVar.e(f15, f16, g6Var.getMeasuredWidth() + f15, g6Var.getMeasuredHeight() + f16);
            paint = faVar.h;
        }
        paint.setAlpha(i9);
        paint2.setAlpha((int) (i9 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean u() {
        return true;
    }

    public String v() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean w(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new af.e(this, 21));
            }
        }
        return remove;
    }

    public Set x(Class cls) {
        return i(r.a(cls));
    }

    public void y(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.a;
        View view2 = (View) this.b;
        if (((Bitmap) this.c) == bitmap) {
            return;
        }
        if (((vc) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((vc) this.d) == null && ((vc) this.e) == null && (bitmap2 = (Bitmap) this.c) != null) {
            bitmap2.recycle();
            this.c = null;
        }
        z();
        this.c = bitmap;
        vc vcVar = new vc((Bitmap) this.c);
        this.e = vcVar;
        view.setBackground(vcVar);
        if (view2 != null) {
            vc vcVar2 = new vc((Bitmap) this.c);
            this.d = vcVar2;
            view2.setBackground(vcVar2);
        }
    }

    public void z() {
        Bitmap bitmap;
        if (((vc) this.d) != null) {
            this.d = null;
            View view = (View) this.b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((vc) this.d) == null && ((vc) this.e) == null && (bitmap = (Bitmap) this.c) != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    public b(Context context, o5.b bVar) {
        this.a = context;
        this.b = bVar;
        C();
    }

    public b(y4.d dVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = dVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i9 = 0;
        dVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i9] = ((Long) it.next()).longValue();
            i9++;
        }
        this.b = jArr;
    }

    public b(rg.c cVar) {
        this.e = cVar;
        gr grVar = gr.h;
        this.c = new td.a(0, this, grVar, 320L, true);
        this.d = new td.a(1, this, grVar, 320L, true);
    }

    public b(m3 m3Var) {
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.a = m3Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void t() {
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
    }
}
