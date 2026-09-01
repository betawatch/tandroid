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
import c9.r;
import c9.t;
import c9.u;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b0;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.g3;
import com.google.android.gms.internal.cast.i2;
import com.google.android.gms.internal.cast.j1;
import com.google.android.gms.internal.cast.j2;
import com.google.android.gms.internal.cast.k1;
import com.google.android.gms.internal.cast.n0;
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
import eg.y2;
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
import ng.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.fa;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.ui1;
import qh.b5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j implements v4.f, c9.c, a3.b, qk0, xd.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public j(Context context) {
        this(context, new s5.b(-1, 0, 0));
    }

    public static void D(j jVar, u6 u6Var) {
        int i10 = u6Var.e;
        if (i10 == 2 && ((t6) jVar.d) != null) {
            jVar.F();
        }
        if (i10 == 2) {
            jVar.d = new t6((n0) jVar.a, (String) jVar.c);
        } else {
            jVar.d = jVar.E();
        }
        t6 t6Var = (t6) jVar.d;
        m.h(t6Var);
        u6Var.d = t6Var.h;
        t6Var.b.add(u6Var);
    }

    public static j r(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
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
        if (((ef.f) this.d) != null) {
            this.d = null;
            View view = (View) this.b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((ef.f) this.d) == null && ((ef.f) this.e) == null && (bitmap = (Bitmap) this.c) != null) {
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

    public t6 E() {
        if (((t6) this.d) == null) {
            t6 t6Var = new t6((n0) this.a, (String) this.c);
            this.d = t6Var;
            t6Var.b(1);
        }
        return (t6) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void F() {
        q1 q1Var;
        int i10;
        long j10;
        t6 t6Var = (t6) this.d;
        if (t6Var != null) {
            Map map = t6Var.e;
            List<g3> list = t6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = t6Var.c;
            List<u6> list3 = t6Var.b;
            r5.c cVar = t6Var.j;
            if (cVar != null) {
                cVar.l = null;
                t6Var.j = null;
            }
            long j11 = t6Var.i;
            q1 m9 = r1.m();
            m9.c();
            r1.t((r1) m9.b, j11);
            String str = t6Var.l;
            if (str != null) {
                m9.c();
                r1.y((r1) m9.b, str);
            }
            String str2 = t6Var.m;
            if (str2 != null) {
                m9.c();
                r1.u((r1) m9.b, str2);
            }
            j1 l10 = k1.l();
            String str3 = t6.o;
            l10.c();
            k1.n((k1) l10.b, str3);
            String str4 = t6Var.g;
            l10.c();
            k1.m((k1) l10.b, str4);
            k1 k1Var = (k1) l10.a();
            m9.c();
            r1.r((r1) m9.b, k1Var);
            b0 b0Var = t6Var.a;
            w1 l11 = x1.l();
            Object zza = b0Var.zza();
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
                } catch (NumberFormatException e6) {
                    u5.b bVar = t6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e6);
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
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    a2 l14 = b2.l();
                    int i13 = (int) (aVar.b - aVar.c);
                    l14.c();
                    b2.m((b2) l14.b, i13);
                    int i14 = aVar.a;
                    int i15 = i14 != 1 ? i14 != 2 ? i14 != 3 ? 1 : 4 : 3 : 2;
                    l14.c();
                    b2.n((b2) l14.b, i15);
                    arrayList2.add((b2) l14.a());
                }
                l11.c();
                x1.q((x1) l11.b, arrayList2);
            }
            if (list.isEmpty()) {
                q1Var = m9;
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
                    m9 = m9;
                }
                q1Var = m9;
                l11.c();
                x1.p((x1) l11.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    y1 l16 = z1.l();
                    int i20 = bVar2.e;
                    l16.c();
                    z1.p((z1) l16.b, i20);
                    int i21 = bVar2.d.get();
                    l16.c();
                    z1.m((z1) l16.b, i21);
                    int i22 = (int) (bVar2.a - bVar2.c);
                    l16.c();
                    z1.n((z1) l16.b, i22);
                    int i23 = (int) (bVar2.b - bVar2.c);
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

    @Override // xd.b
    public void L(int i10, float f10, float f11, xd.c cVar) {
        ((TextView) this.b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((xd.a) this.d).e));
        ((xg.c) this.e).b(this);
    }

    @Override // c9.c
    public Object a(Class cls) {
        if (!((Set) this.a).contains(t.a(cls))) {
            throw new a7.b("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a2 = ((c9.c) this.e).a(cls);
        if (!cls.equals(y9.a.class)) {
            return a2;
        }
        return new u();
    }

    @Override // c9.c
    public ba.b b(t tVar) {
        if (((Set) this.b).contains(tVar)) {
            return ((c9.c) this.e).b(tVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency Provider<" + tVar + ">.");
    }

    @Override // c9.c
    public ba.b c(Class cls) {
        return b(t.a(cls));
    }

    @Override // v4.f
    public int d(long j10) {
        long[] jArr = (long[]) this.b;
        int b10 = d0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // c9.c
    public r e(t tVar) {
        if (((Set) this.c).contains(tVar)) {
            return ((c9.c) this.e).e(tVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency Deferred<" + tVar + ">.");
    }

    @Override // c9.c
    public Object f(t tVar) {
        if (((Set) this.a).contains(tVar)) {
            return ((c9.c) this.e).f(tVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency " + tVar + ".");
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // rc.a
    public Object get() {
        return new d3.a((Executor) ((rc.a) this.a).get(), (z2.e) ((rc.a) this.b).get(), (androidx.biometric.e) ((androidx.biometric.e) this.c).get(), (f3.d) ((rc.a) this.d).get(), (g3.c) ((rc.a) this.e).get());
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // c9.c
    public Set i(t tVar) {
        if (((Set) this.d).contains(tVar)) {
            return ((c9.c) this.e).i(tVar);
        }
        throw new a7.b("Attempting to request an undeclared dependency Set<" + tVar + ">.");
    }

    @Override // org.telegram.ui.Components.qk0
    public void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
        Paint paint;
        ba baVar;
        Path path = (Path) this.b;
        fa faVar = (fa) this.c;
        Paint paint2 = (Paint) this.d;
        b5 b5Var = (b5) this.e;
        if (!z4 && (baVar = b5Var.b2) != null && baVar.c()) {
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
                this.a = new fa(b5Var.b2, b5Var.W1.getReactionsWindow().c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((fa) this.a).e(f13, f14, b5Var.getMeasuredWidth() + f13, b5Var.getMeasuredHeight() + f14);
            paint = ((fa) this.a).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            faVar.e(f15, f16, b5Var.getMeasuredWidth() + f15, b5Var.getMeasuredHeight() + f16);
            paint = faVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public byte[] k() {
        byte[] bArr = (byte[]) this.b;
        byte[] bArr2 = (byte[]) this.a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = ui1.b;
        BigInteger bigInteger3 = ui1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = ui1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a10 = ui1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = ui1.b(new byte[][]{a10, bArr2, bArr3});
        byte[] b11 = ui1.b(new byte[][]{a10, bArr});
        this.d = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
        }
        this.e = arrayList;
        FileLog.d("wear-auth: built answer; session " + ui1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override // v4.f
    public long l(int i10) {
        return ((long[]) this.b)[i10];
    }

    public s0 n() {
        String str = ((Long) this.a) == null ? " pc" : "";
        if (((String) this.b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = w.c.e(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = w.c.e(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.a).longValue(), (String) this.b, (String) this.c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // org.telegram.ui.Components.qk0
    public void o(View view, q0 q0Var, boolean z4, boolean z10) {
        b5 b5Var = (b5) this.e;
        y2 y2Var = b5Var.X1;
        if (y2Var == null) {
            return;
        }
        y2Var.s(q0Var, true);
        b5Var.O0(false);
    }

    public void p(Canvas canvas, boolean z4, boolean z10, int i10, float f10) {
        RectF rectF = (RectF) this.b;
        float[] fArr = (float[]) this.c;
        Paint paint = (Paint) this.e;
        o3 o3Var = (o3) this.a;
        Path path = (Path) this.d;
        int i11 = (int) ((z10 ? 0 : (int) o3Var.D) * f10);
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
        rectF.set(0.0f, 0.0f, i10, (o3Var.getY() + o3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z4) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
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

    public r s(Class cls) {
        return e(t.a(cls));
    }

    @Override // org.telegram.ui.Components.qk0
    public boolean t() {
        return true;
    }

    public String u() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean v(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new ag.e(this, 14));
            }
        }
        return remove;
    }

    public Set w(Class cls) {
        return i(t.a(cls));
    }

    @Override // v4.f
    public int x() {
        return ((long[]) this.b).length;
    }

    public void y(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.a;
        View view2 = (View) this.b;
        if (((Bitmap) this.c) == bitmap) {
            return;
        }
        if (((ef.f) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((ef.f) this.d) == null && ((ef.f) this.e) == null && (bitmap2 = (Bitmap) this.c) != null) {
            bitmap2.recycle();
            this.c = null;
        }
        A();
        this.c = bitmap;
        ef.f fVar = new ef.f((Bitmap) this.c);
        this.e = fVar;
        view.setBackground(fVar);
        if (view2 != null) {
            ef.f fVar2 = new ef.f((Bitmap) this.c);
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

    public j(xg.c cVar) {
        this.e = cVar;
        pr prVar = pr.h;
        this.c = new xd.a(0, this, prVar, 320L, true);
        this.d = new xd.a(1, this, prVar, 320L, true);
    }

    public j(o3 o3Var) {
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.a = o3Var;
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void m() {
    }

    @Override // xd.b
    public /* synthetic */ void z(float f10, int i10) {
    }
}
