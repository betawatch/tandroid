package c5;

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
import b6.m;
import c9.s;
import c9.u;
import c9.v;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.internal.cast.c2;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.cast.j2;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.k2;
import com.google.android.gms.internal.cast.l1;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.r1;
import com.google.android.gms.internal.cast.s1;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.u6;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.v6;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.z1;
import dg.a3;
import h5.d0;
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
import k9.s0;
import mg.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.zi1;
import ph.c5;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class j implements v4.f, c9.c, a3.b, ok0, xd.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public j(Context context) {
        this(context, new s5.b(-1, 0, 0));
    }

    public static void D(j jVar, v6 v6Var) {
        int i10 = v6Var.e;
        if (i10 == 2 && ((u6) jVar.d) != null) {
            jVar.F();
        }
        if (i10 == 2) {
            jVar.d = new u6((o0) jVar.a, (String) jVar.c);
        } else {
            jVar.d = jVar.E();
        }
        u6 u6Var = (u6) jVar.d;
        m.h(u6Var);
        v6Var.d = u6Var.h;
        u6Var.b.add(v6Var);
    }

    public static j t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        j jVar = new j();
        jVar.d = new ArrayDeque();
        jVar.a = sharedPreferences;
        jVar.b = "topic_operation_queue";
        jVar.c = ",";
        jVar.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) jVar.d)) {
            try {
                ((ArrayDeque) jVar.d).clear();
                String string = ((SharedPreferences) jVar.a).getString((String) jVar.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) jVar.c)) {
                    String[] split = string.split((String) jVar.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) jVar.d).add(str);
                        }
                    }
                    return jVar;
                }
                return jVar;
            } finally {
            }
        }
    }

    public void A() {
        Bitmap bitmap;
        if (((df.f) this.d) != null) {
            this.d = null;
            View view = (View) this.b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((df.f) this.d) == null && ((df.f) this.e) == null && (bitmap = (Bitmap) this.c) != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    public void B(Uri uri) {
        int i10;
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
        s5.b bVar = (s5.b) this.b;
        int i11 = bVar.b;
        if (i11 == 0 || (i10 = bVar.c) == 0) {
            this.d = new t5.b(context, 0, 0, this);
        } else {
            this.d = new t5.b(context, i11, i10, this);
        }
        t5.b bVar2 = (t5.b) this.d;
        m.h(bVar2);
        Uri uri2 = (Uri) this.c;
        m.h(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void C() {
        t5.b bVar = (t5.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public u6 E() {
        if (((u6) this.d) == null) {
            u6 u6Var = new u6((o0) this.a, (String) this.c);
            this.d = u6Var;
            u6Var.b(1);
        }
        return (u6) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void F() {
        r1 r1Var;
        int i10;
        long j10;
        u6 u6Var = (u6) this.d;
        if (u6Var != null) {
            Map map = u6Var.e;
            List<h3> list = u6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = u6Var.c;
            List<v6> list3 = u6Var.b;
            r5.c cVar = u6Var.j;
            if (cVar != null) {
                cVar.l = null;
                u6Var.j = null;
            }
            long j11 = u6Var.i;
            r1 m9 = s1.m();
            m9.c();
            s1.t((s1) m9.b, j11);
            String str = u6Var.l;
            if (str != null) {
                m9.c();
                s1.y((s1) m9.b, str);
            }
            String str2 = u6Var.m;
            if (str2 != null) {
                m9.c();
                s1.u((s1) m9.b, str2);
            }
            k1 l10 = l1.l();
            String str3 = u6.o;
            l10.c();
            l1.n((l1) l10.b, str3);
            String str4 = u6Var.g;
            l10.c();
            l1.m((l1) l10.b, str4);
            l1 l1Var = (l1) l10.a();
            m9.c();
            s1.r((s1) m9.b, l1Var);
            c0 c0Var = u6Var.a;
            x1 l11 = y1.l();
            Object zza = c0Var.zza();
            if (zza != null) {
                j2 l12 = k2.l();
                l12.c();
                k2.m((k2) l12.b, (String) zza);
                k2 k2Var = (k2) l12.a();
                l11.c();
                y1.m((y1) l11.b, k2Var);
            }
            String str5 = u6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    u5.b bVar = u6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e);
                    j10 = 0;
                }
                l11.c();
                y1.n((y1) l11.b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (v6 v6Var : list3) {
                    v6Var.getClass();
                    v1 l13 = w1.l();
                    int i11 = v6Var.e;
                    l13.c();
                    w1.p((w1) l13.b, i11);
                    int i12 = (int) (v6Var.b - v6Var.d);
                    l13.c();
                    w1.m((w1) l13.b, i12);
                    Integer num = v6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        w1.n((w1) l13.b, intValue);
                    }
                    Boolean bool = v6Var.c;
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
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    b2 l14 = c2.l();
                    int i13 = (int) (aVar.b - aVar.c);
                    l14.c();
                    c2.m((c2) l14.b, i13);
                    int i14 = aVar.a;
                    int i15 = i14 != 1 ? i14 != 2 ? i14 != 3 ? 1 : 4 : 3 : 2;
                    l14.c();
                    c2.n((c2) l14.b, i15);
                    arrayList2.add((c2) l14.a());
                }
                l11.c();
                y1.q((y1) l11.b, arrayList2);
            }
            if (list.isEmpty()) {
                r1Var = m9;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (h3 h3Var : list) {
                    String str6 = h3Var.a;
                    t1 l15 = u1.l();
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
                    u1.q((u1) l15.b, i10);
                    int i16 = (int) h3Var.b;
                    l15.c();
                    u1.m((u1) l15.b, i16);
                    int i17 = h3Var.c;
                    l15.c();
                    u1.n((u1) l15.b, i17);
                    int i18 = (int) (h3Var.d - h3Var.f);
                    l15.c();
                    u1.o((u1) l15.b, i18);
                    int i19 = (int) (h3Var.e - h3Var.f);
                    l15.c();
                    u1.p((u1) l15.b, i19);
                    arrayList3.add((u1) l15.a());
                    m9 = m9;
                }
                r1Var = m9;
                l11.c();
                y1.p((y1) l11.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    z1 l16 = a2.l();
                    int i20 = bVar2.e;
                    l16.c();
                    a2.p((a2) l16.b, i20);
                    int i21 = bVar2.d.get();
                    l16.c();
                    a2.m((a2) l16.b, i21);
                    int i22 = (int) (bVar2.a - bVar2.c);
                    l16.c();
                    a2.n((a2) l16.b, i22);
                    int i23 = (int) (bVar2.b - bVar2.c);
                    l16.c();
                    a2.o((a2) l16.b, i23);
                    arrayList4.add((a2) l16.a());
                }
                l11.c();
                y1.r((y1) l11.b, arrayList4);
            }
            y1 y1Var = (y1) l11.a();
            r1Var.c();
            s1.q((s1) r1Var.b, y1Var);
            u6Var.f.a((s1) r1Var.a(), 233);
            this.d = null;
        }
    }

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((TextView) this.b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((xd.a) this.d).e));
        ((wg.c) this.e).b(this);
    }

    @Override // c9.c
    public Object a(Class cls) {
        if (!((Set) this.a).contains(u.a(cls))) {
            throw new a7.b("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a2 = ((c9.c) this.e).a(cls);
        if (!cls.equals(y9.a.class)) {
            return a2;
        }
        return new v();
    }

    @Override // c9.c
    public ba.b b(u uVar) {
        if (((Set) this.b).contains(uVar)) {
            return ((c9.c) this.e).b(uVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency Provider<" + uVar + ">.");
    }

    @Override // c9.c
    public ba.b c(Class cls) {
        return b(u.a(cls));
    }

    @Override // c9.c
    public s d(u uVar) {
        if (((Set) this.c).contains(uVar)) {
            return ((c9.c) this.e).d(uVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency Deferred<" + uVar + ">.");
    }

    @Override // v4.f
    public int e(long j10) {
        long[] jArr = (long[]) this.b;
        int b10 = d0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // c9.c
    public Object f(u uVar) {
        if (((Set) this.a).contains(uVar)) {
            return ((c9.c) this.e).f(uVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency " + uVar + ".");
    }

    @Override // c9.c
    public Set g(u uVar) {
        if (((Set) this.d).contains(uVar)) {
            return ((c9.c) this.e).g(uVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency Set<" + uVar + ">.");
    }

    @Override // rc.a
    public Object get() {
        return new d3.a((Executor) ((rc.a) this.a).get(), (z2.d) ((rc.a) this.b).get(), (af.d) ((af.d) this.c).get(), (f3.d) ((rc.a) this.d).get(), (g3.c) ((rc.a) this.e).get());
    }

    @Override // v4.f
    public long h(int i10) {
        return ((long[]) this.b)[i10];
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public void j(View view, q0 q0Var, boolean z4, boolean z10) {
        c5 c5Var = (c5) this.e;
        a3 a3Var = c5Var.X1;
        if (a3Var == null) {
            return;
        }
        a3Var.s(q0Var, true);
        c5Var.O0(false);
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.ok0
    public void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint;
        ba baVar;
        Path path = (Path) this.b;
        fa faVar = (fa) this.c;
        Paint paint2 = (Paint) this.d;
        c5 c5Var = (c5) this.e;
        if (!z4 && (baVar = c5Var.b2) != null && baVar.c()) {
            if (z4) {
                faVar = (fa) this.a;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            faVar.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z4) {
            if (((fa) this.a) == null) {
                this.a = new fa(c5Var.b2, c5Var.W1.getReactionsWindow().c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((fa) this.a).e(f13, f14, c5Var.getMeasuredWidth() + f13, c5Var.getMeasuredHeight() + f14);
            paint = ((fa) this.a).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            faVar.e(f15, f16, c5Var.getMeasuredWidth() + f15, c5Var.getMeasuredHeight() + f16);
            paint = faVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public byte[] n() {
        byte[] bArr = (byte[]) this.b;
        byte[] bArr2 = (byte[]) this.a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = zi1.b;
        BigInteger bigInteger3 = zi1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = zi1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a10 = zi1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = zi1.b(new byte[][]{a10, bArr2, bArr3});
        byte[] b11 = zi1.b(new byte[][]{a10, bArr});
        this.d = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
        }
        this.e = arrayList;
        FileLog.d("wear-auth: built answer; session " + zi1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean o() {
        return true;
    }

    public s0 p() {
        String str = ((Long) this.a) == null ? " pc" : "";
        if (((String) this.b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = w2.k(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = w2.k(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.a).longValue(), (String) this.b, (String) this.c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // v4.f
    public List q(long j10) {
        g gVar = (g) this.a;
        Map map = (Map) this.c;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        gVar.g(j10, gVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        gVar.i(j10, false, gVar.h, treeMap);
        gVar.h(j10, map, hashMap, gVar.h, treeMap);
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
                h hVar = (h) hashMap.get(pair.first);
                hVar.getClass();
                arrayList2.add(new v4.b(null, null, null, decodeByteArray, hVar.c, 0, hVar.e, hVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, hVar.f, hVar.g, false, -16777216, hVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            h hVar2 = (h) hashMap.get(entry.getKey());
            hVar2.getClass();
            v4.a aVar = (v4.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar2 : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
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
            float f10 = hVar2.c;
            int i19 = hVar2.d;
            aVar.e = f10;
            aVar.f = i19;
            aVar.g = hVar2.e;
            aVar.h = hVar2.b;
            aVar.l = hVar2.f;
            float f11 = hVar2.i;
            int i20 = hVar2.h;
            aVar.k = f11;
            aVar.j = i20;
            aVar.p = hVar2.j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    @Override // v4.f
    public int r() {
        return ((long[]) this.b).length;
    }

    public void s(Canvas canvas, boolean z4, boolean z10, int i10, float f10) {
        RectF rectF = (RectF) this.b;
        float[] fArr = (float[]) this.c;
        Paint paint = (Paint) this.e;
        n3 n3Var = (n3) this.a;
        Path path = (Path) this.d;
        int i11 = (int) ((z10 ? 0 : (int) n3Var.D) * f10);
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
        rectF.set(0.0f, 0.0f, i10, (n3Var.getY() + n3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z4) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    public s u(Class cls) {
        return d(u.a(cls));
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
                ((ScheduledThreadPoolExecutor) this.e).execute(new ag.d(this, 18));
            }
        }
        return remove;
    }

    public Set x(Class cls) {
        return g(u.a(cls));
    }

    public void y(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.a;
        View view2 = (View) this.b;
        if (((Bitmap) this.c) == bitmap) {
            return;
        }
        if (((df.f) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((df.f) this.d) == null && ((df.f) this.e) == null && (bitmap2 = (Bitmap) this.c) != null) {
            bitmap2.recycle();
            this.c = null;
        }
        A();
        this.c = bitmap;
        df.f fVar = new df.f((Bitmap) this.c);
        this.e = fVar;
        view.setBackground(fVar);
        if (view2 != null) {
            df.f fVar2 = new df.f((Bitmap) this.c);
            this.d = fVar2;
            view2.setBackground(fVar2);
        }
    }

    public j(Context context, s5.b bVar) {
        this.a = context;
        this.b = bVar;
        C();
    }

    public j(g gVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = gVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.c = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        gVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.b = jArr;
    }

    public j(wg.c cVar) {
        this.e = cVar;
        mr mrVar = mr.h;
        this.c = new xd.a(0, this, mrVar, 320L, true);
        this.d = new xd.a(1, this, mrVar, 320L, true);
    }

    public j(n3 n3Var) {
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.a = n3Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public /* synthetic */ void m() {
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
