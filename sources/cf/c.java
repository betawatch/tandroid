package cf;

import ah.j1;
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
import bi.oa;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.b2;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.e2;
import com.google.android.gms.internal.cast.f0;
import com.google.android.gms.internal.cast.j3;
import com.google.android.gms.internal.cast.l2;
import com.google.android.gms.internal.cast.m1;
import com.google.android.gms.internal.cast.m2;
import com.google.android.gms.internal.cast.n1;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.cast.t1;
import com.google.android.gms.internal.cast.u1;
import com.google.android.gms.internal.cast.v1;
import com.google.android.gms.internal.cast.w1;
import com.google.android.gms.internal.cast.x1;
import com.google.android.gms.internal.cast.x6;
import com.google.android.gms.internal.cast.y1;
import com.google.android.gms.internal.cast.y6;
import com.google.android.gms.internal.cast.z1;
import di.q6;
import e2.d0;
import f4.f;
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
import le.e;
import m2.t;
import n6.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.o3;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pr;
import org.telegram.ui.lj1;
import q9.p;
import q9.r;
import q9.s;
import rg.c2;
import y9.s0;
import z3.d;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c implements ek0, d, le.d, n5.b, q9.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public c(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public static c o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        c cVar = new c();
        cVar.d = new ArrayDeque();
        cVar.a = sharedPreferences;
        cVar.b = "topic_operation_queue";
        cVar.c = ",";
        cVar.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) cVar.d)) {
            try {
                ((ArrayDeque) cVar.d).clear();
                String string = ((SharedPreferences) cVar.a).getString((String) cVar.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) cVar.c)) {
                    String[] split = string.split((String) cVar.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) cVar.d).add(str);
                        }
                    }
                    return cVar;
                }
                return cVar;
            } finally {
            }
        }
    }

    public static void y(c cVar, y6 y6Var) {
        int i10 = y6Var.e;
        if (i10 == 2 && ((x6) cVar.d) != null) {
            cVar.C();
        }
        if (i10 == 2) {
            cVar.d = new x6((r0) cVar.a, (String) cVar.c);
        } else {
            cVar.d = cVar.A();
        }
        x6 x6Var = (x6) cVar.d;
        l.h(x6Var);
        y6Var.d = x6Var.h;
        x6Var.b.add(y6Var);
    }

    public x6 A() {
        if (((x6) this.d) == null) {
            x6 x6Var = new x6((r0) this.a, (String) this.c);
            this.d = x6Var;
            x6Var.b(1);
        }
        return (x6) this.d;
    }

    @Override // org.telegram.ui.Components.ek0
    public void B(View view, j1 j1Var, boolean z10, boolean z11) {
        q6 q6Var = (q6) this.e;
        c2 c2Var = q6Var.a2;
        if (c2Var == null) {
            return;
        }
        c2Var.s(j1Var, true);
        q6Var.O0(false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void C() {
        t1 t1Var;
        int i10;
        long j3;
        x6 x6Var = (x6) this.d;
        if (x6Var != null) {
            Map map = x6Var.e;
            List<j3> list = x6Var.d;
            List<com.google.android.gms.internal.cast.b> list2 = x6Var.c;
            List<y6> list3 = x6Var.b;
            d6.c cVar = x6Var.j;
            if (cVar != null) {
                cVar.l = null;
                x6Var.j = null;
            }
            long j10 = x6Var.i;
            t1 m10 = u1.m();
            m10.c();
            u1.t((u1) m10.b, j10);
            String str = x6Var.l;
            if (str != null) {
                m10.c();
                u1.y((u1) m10.b, str);
            }
            String str2 = x6Var.m;
            if (str2 != null) {
                m10.c();
                u1.u((u1) m10.b, str2);
            }
            m1 l4 = n1.l();
            String str3 = x6.o;
            l4.c();
            n1.n((n1) l4.b, str3);
            String str4 = x6Var.g;
            l4.c();
            n1.m((n1) l4.b, str4);
            n1 n1Var = (n1) l4.a();
            m10.c();
            u1.r((u1) m10.b, n1Var);
            f0 f0Var = x6Var.a;
            z1 l10 = a2.l();
            Object zza = f0Var.zza();
            if (zza != null) {
                l2 l11 = m2.l();
                l11.c();
                m2.m((m2) l11.b, (String) zza);
                m2 m2Var = (m2) l11.a();
                l10.c();
                a2.m((a2) l10.b, m2Var);
            }
            String str5 = x6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e7) {
                    g6.b bVar = x6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e7);
                    j3 = 0;
                }
                l10.c();
                a2.n((a2) l10.b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (y6 y6Var : list3) {
                    y6Var.getClass();
                    x1 l12 = y1.l();
                    int i11 = y6Var.e;
                    l12.c();
                    y1.p((y1) l12.b, i11);
                    int i12 = (int) (y6Var.b - y6Var.d);
                    l12.c();
                    y1.m((y1) l12.b, i12);
                    Integer num = y6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        y1.n((y1) l12.b, intValue);
                    }
                    Boolean bool = y6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        y1.o((y1) l12.b, booleanValue);
                    }
                    arrayList.add((y1) l12.a());
                }
                l10.c();
                a2.o((a2) l10.b, arrayList);
            }
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : list2) {
                    bVar2.getClass();
                    d2 l13 = e2.l();
                    int i13 = (int) (bVar2.b - bVar2.c);
                    l13.c();
                    e2.m((e2) l13.b, i13);
                    int i14 = bVar2.a;
                    int i15 = i14 != 1 ? i14 != 2 ? i14 != 3 ? 1 : 4 : 3 : 2;
                    l13.c();
                    e2.n((e2) l13.b, i15);
                    arrayList2.add((e2) l13.a());
                }
                l10.c();
                a2.q((a2) l10.b, arrayList2);
            }
            if (list.isEmpty()) {
                t1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (j3 j3Var : list) {
                    String str6 = j3Var.a;
                    v1 l14 = w1.l();
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
                    l14.c();
                    w1.q((w1) l14.b, i10);
                    int i16 = (int) j3Var.b;
                    l14.c();
                    w1.m((w1) l14.b, i16);
                    int i17 = j3Var.c;
                    l14.c();
                    w1.n((w1) l14.b, i17);
                    int i18 = (int) (j3Var.d - j3Var.f);
                    l14.c();
                    w1.o((w1) l14.b, i18);
                    int i19 = (int) (j3Var.e - j3Var.f);
                    l14.c();
                    w1.p((w1) l14.b, i19);
                    arrayList3.add((w1) l14.a());
                    m10 = m10;
                }
                t1Var = m10;
                l10.c();
                a2.p((a2) l10.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.c cVar2 : map.values()) {
                    cVar2.getClass();
                    b2 l15 = com.google.android.gms.internal.cast.c2.l();
                    int i20 = cVar2.e;
                    l15.c();
                    com.google.android.gms.internal.cast.c2.p((com.google.android.gms.internal.cast.c2) l15.b, i20);
                    int i21 = cVar2.d.get();
                    l15.c();
                    com.google.android.gms.internal.cast.c2.m((com.google.android.gms.internal.cast.c2) l15.b, i21);
                    int i22 = (int) (cVar2.a - cVar2.c);
                    l15.c();
                    com.google.android.gms.internal.cast.c2.n((com.google.android.gms.internal.cast.c2) l15.b, i22);
                    int i23 = (int) (cVar2.b - cVar2.c);
                    l15.c();
                    com.google.android.gms.internal.cast.c2.o((com.google.android.gms.internal.cast.c2) l15.b, i23);
                    arrayList4.add((com.google.android.gms.internal.cast.c2) l15.a());
                }
                l10.c();
                a2.r((a2) l10.b, arrayList4);
            }
            a2 a2Var = (a2) l10.a();
            t1Var.c();
            u1.q((u1) t1Var.b, a2Var);
            x6Var.f.a((u1) t1Var.a(), 233);
            this.d = null;
        }
    }

    @Override // le.d
    public void E(int i10, float f7, float f10, e eVar) {
        ((TextView) this.b).setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, ((le.b) this.d).e));
        ((kh.c) this.e).b(this);
    }

    @Override // org.telegram.ui.Components.ek0
    public void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        ja jaVar;
        Path path = (Path) this.b;
        na naVar = (na) this.c;
        Paint paint2 = (Paint) this.d;
        q6 q6Var = (q6) this.e;
        if (!z10 && (jaVar = q6Var.e2) != null && jaVar.c()) {
            if (z10) {
                naVar = (na) this.a;
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
            if (((na) this.a) == null) {
                this.a = new na(q6Var.e2, q6Var.Z1.getReactionsWindow().c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((na) this.a).e(f12, f13, q6Var.getMeasuredWidth() + f12, q6Var.getMeasuredHeight() + f13);
            paint = ((na) this.a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            naVar.e(f14, f15, q6Var.getMeasuredWidth() + f14, q6Var.getMeasuredHeight() + f15);
            paint = naVar.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    @Override // org.telegram.ui.Components.ek0
    public boolean S() {
        return true;
    }

    @Override // q9.b
    public Object a(Class cls) {
        if (!((Set) this.a).contains(r.a(cls))) {
            throw new j("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a2 = ((q9.b) this.e).a(cls);
        if (!cls.equals(ma.a.class)) {
            return a2;
        }
        return new s();
    }

    @Override // q9.b
    public p b(r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((q9.b) this.e).b(rVar);
        }
        throw new j("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // q9.b
    public pa.b c(Class cls) {
        return f(r.a(cls));
    }

    @Override // z3.d
    public int d(long j3) {
        long[] jArr = (long[]) this.b;
        int a2 = d0.a(jArr, j3, false);
        if (a2 < jArr.length) {
            return a2;
        }
        return -1;
    }

    @Override // z3.d
    public long e(int i10) {
        return ((long[]) this.b)[i10];
    }

    @Override // q9.b
    public pa.b f(r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((q9.b) this.e).f(rVar);
        }
        throw new j("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // q9.b
    public Set g(r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((q9.b) this.e).g(rVar);
        }
        throw new j("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // fd.a
    public Object get() {
        return new q5.a((Executor) ((fd.a) this.a).get(), (m5.d) ((fd.a) this.b).get(), (t) ((t) this.c).get(), (s5.d) ((fd.a) this.d).get(), (t5.c) ((fd.a) this.e).get());
    }

    @Override // z3.d
    public List h(long j3) {
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
                f fVar = (f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new d2.b(null, null, null, decodeByteArray, fVar.c, 0, fVar.e, fVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, fVar.f, fVar.g, false, -16777216, fVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) hashMap.get(entry.getKey());
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

    @Override // q9.b
    public Object i(r rVar) {
        if (((Set) this.a).contains(rVar)) {
            return ((q9.b) this.e).i(rVar);
        }
        throw new j("Attempting to request an undeclared dependency " + rVar + ".");
    }

    public byte[] j() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = lj1.b;
        BigInteger bigInteger3 = lj1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = lj1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a10 = lj1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = lj1.b(new byte[][]{a10, bArr2, bArr3});
        byte[] b11 = lj1.b(new byte[][]{a10, bArr});
        this.e = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % 200)]);
        }
        this.a = arrayList;
        FileLog.d("wear-auth: built answer; session " + lj1.d(bArr2) + " emojis=" + ((ArrayList) this.a));
        byte[] bArr4 = new byte[288];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override // z3.d
    public int k() {
        return ((long[]) this.b).length;
    }

    public s0 l() {
        String str = ((Long) this.a) == null ? " pc" : "";
        if (((String) this.b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = p6.t(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = p6.t(str, " importance");
        }
        if (str.isEmpty()) {
            return new s0(((Long) this.a).longValue(), (String) this.b, (String) this.c, ((Long) this.d).longValue(), ((Integer) this.e).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void m(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        RectF rectF = (RectF) this.b;
        float[] fArr = (float[]) this.c;
        Paint paint = (Paint) this.e;
        o3 o3Var = (o3) this.a;
        Path path = (Path) this.d;
        int i11 = (int) ((z11 ? 0 : (int) o3Var.G) * f7);
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
        rectF.set(0.0f, 0.0f, i10, (o3Var.getY() + o3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean n() {
        return true;
    }

    public p p(Class cls) {
        return b(r.a(cls));
    }

    public String q() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean r(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new oa(this, 9));
            }
        }
        return remove;
    }

    public Set s(Class cls) {
        return g(r.a(cls));
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean t() {
        return false;
    }

    public void u(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.a;
        View view2 = (View) this.b;
        if (((Bitmap) this.c) == bitmap) {
            return;
        }
        if (((fd) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((fd) this.d) == null && ((fd) this.e) == null && (bitmap2 = (Bitmap) this.c) != null) {
            bitmap2.recycle();
            this.c = null;
        }
        v();
        this.c = bitmap;
        fd fdVar = new fd((Bitmap) this.c);
        this.e = fdVar;
        view.setBackground(fdVar);
        if (view2 != null) {
            fd fdVar2 = new fd((Bitmap) this.c);
            this.d = fdVar2;
            view2.setBackground(fdVar2);
        }
    }

    public void v() {
        Bitmap bitmap;
        if (((fd) this.d) != null) {
            this.d = null;
            View view = (View) this.b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((fd) this.d) == null && ((fd) this.e) == null && (bitmap = (Bitmap) this.c) != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    public void w(Uri uri) {
        int i10;
        Context context = (Context) this.a;
        if (uri == null) {
            x();
            return;
        }
        if (uri.equals((Uri) this.c)) {
            return;
        }
        x();
        this.c = uri;
        e6.b bVar = (e6.b) this.b;
        int i11 = bVar.b;
        if (i11 == 0 || (i10 = bVar.c) == 0) {
            this.d = new f6.b(context, 0, 0, this);
        } else {
            this.d = new f6.b(context, i11, i10, this);
        }
        f6.b bVar2 = (f6.b) this.d;
        l.h(bVar2);
        Uri uri2 = (Uri) this.c;
        l.h(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void x() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public c(Context context, e6.b bVar) {
        this.a = context;
        this.b = bVar;
        x();
    }

    public c(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
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

    public c(kh.c cVar) {
        this.e = cVar;
        pr prVar = pr.h;
        this.c = new le.b(0, this, prVar, 320L, true);
        this.d = new le.b(1, this, prVar, 320L, true);
    }

    public c(o3 o3Var) {
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.a = o3Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void J() {
    }

    @Override // le.d
    public /* synthetic */ void z(float f7, int i10) {
    }
}
