package bh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.AsyncTask;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.support.v4.media.session.a0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
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
import e2.l0;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import jg.h2;
import k2.m0;
import m.p3;
import n6.l;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.i0;
import org.telegram.messenger.ia;
import org.telegram.messenger.za;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.b81;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.n01;
import org.telegram.ui.p01;
import org.telegram.ui.se1;
import org.telegram.ui.yn0;
import r9.p;
import r9.r;
import r9.s;
import vh.b4;
import vh.d0;
import z9.s0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d implements fe.e, z3.d, za, mn0, n5.b, r9.b, lj0 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public static void O(d dVar, u6 u6Var) {
        int i10 = u6Var.e;
        if (i10 == 2 && ((t6) dVar.d) != null) {
            dVar.Q();
        }
        if (i10 == 2) {
            dVar.d = new t6((o0) dVar.a, (String) dVar.c);
        } else {
            dVar.d = dVar.P();
        }
        t6 t6Var = (t6) dVar.d;
        l.g(t6Var);
        u6Var.d = t6Var.h;
        t6Var.b.add(u6Var);
    }

    public static d o(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        d dVar = new d();
        dVar.d = new ArrayDeque();
        dVar.a = sharedPreferences;
        dVar.b = "topic_operation_queue";
        dVar.c = ",";
        dVar.e = scheduledThreadPoolExecutor;
        synchronized (((ArrayDeque) dVar.d)) {
            try {
                ((ArrayDeque) dVar.d).clear();
                String string = ((SharedPreferences) dVar.a).getString((String) dVar.b, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) dVar.c)) {
                    String[] split = string.split((String) dVar.c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) dVar.d).add(str);
                        }
                    }
                    return dVar;
                }
                return dVar;
            } finally {
            }
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public boolean A() {
        return true;
    }

    public void B() {
        p3 p3Var = (p3) ((fg.i) this.a).b;
        a0 a0Var = (a0) p3Var.b;
        if (a0Var == null) {
            while (!((LinkedList) p3Var.c).isEmpty() && ((x6.c) ((LinkedList) p3Var.c).getLast()).a() >= 1) {
                ((LinkedList) p3Var.c).removeLast();
            }
        } else {
            try {
                i8.g gVar = (i8.g) a0Var.c;
                gVar.T0(gVar.P0(), 5);
            } catch (RemoteException e) {
                throw new ad.d(e);
            }
        }
    }

    public void D() {
        p3 p3Var = (p3) ((fg.i) this.a).b;
        a0 a0Var = (a0) p3Var.b;
        if (a0Var == null) {
            while (!((LinkedList) p3Var.c).isEmpty() && ((x6.c) ((LinkedList) p3Var.c).getLast()).a() >= 5) {
                ((LinkedList) p3Var.c).removeLast();
            }
        } else {
            try {
                i8.g gVar = (i8.g) a0Var.c;
                gVar.T0(gVar.P0(), 4);
            } catch (RemoteException e) {
                throw new ad.d(e);
            }
        }
    }

    public void F() {
        p3 p3Var = (p3) ((fg.i) this.a).b;
        p3Var.getClass();
        p3Var.h(new x6.c(p3Var, 1));
    }

    public void G() {
        k2 k2Var = (k2) this.c;
        if (k2Var == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) this.b).startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        if (parentActivity != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                    parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES"}, 4);
                    return;
                }
            } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                return;
            }
        }
        yn0 yn0Var = new yn0(2, false, false, null);
        yn0Var.y = false;
        yn0Var.V = new m0(this);
        k2Var.presentFragment(yn0Var);
    }

    public String H() {
        String str;
        synchronized (((ArrayDeque) this.d)) {
            str = (String) ((ArrayDeque) this.d).peek();
        }
        return str;
    }

    public boolean I(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.d)) {
            remove = ((ArrayDeque) this.d).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.e).execute(new d0(this, 26));
            }
        }
        return remove;
    }

    public Set J(Class cls) {
        return i(r.a(cls));
    }

    public void K(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.a;
        View view2 = (View) this.b;
        if (((Bitmap) this.c) == bitmap) {
            return;
        }
        if (((jh.g) this.e) != null) {
            view.setBackground(null);
            this.e = null;
        }
        if (((jh.g) this.d) == null && ((jh.g) this.e) == null && (bitmap2 = (Bitmap) this.c) != null) {
            bitmap2.recycle();
            this.c = null;
        }
        L();
        this.c = bitmap;
        jh.g gVar = new jh.g((Bitmap) this.c);
        this.e = gVar;
        view.setBackground(gVar);
        if (view2 != null) {
            jh.g gVar2 = new jh.g((Bitmap) this.c);
            this.d = gVar2;
            view2.setBackground(gVar2);
        }
    }

    public void L() {
        Bitmap bitmap;
        if (((jh.g) this.d) != null) {
            this.d = null;
            View view = (View) this.b;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((jh.g) this.d) == null && ((jh.g) this.e) == null && (bitmap = (Bitmap) this.c) != null) {
            bitmap.recycle();
            this.c = null;
        }
    }

    public void M(Uri uri) {
        int i10;
        Context context = (Context) this.a;
        if (uri == null) {
            N();
            return;
        }
        if (uri.equals((Uri) this.c)) {
            return;
        }
        N();
        this.c = uri;
        e6.b bVar = (e6.b) this.b;
        int i11 = bVar.b;
        if (i11 == 0 || (i10 = bVar.c) == 0) {
            this.d = new f6.b(context, 0, 0, this);
        } else {
            this.d = new f6.b(context, i11, i10, this);
        }
        f6.b bVar2 = (f6.b) this.d;
        l.g(bVar2);
        Uri uri2 = (Uri) this.c;
        l.g(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void N() {
        f6.b bVar = (f6.b) this.d;
        if (bVar != null) {
            bVar.cancel(true);
            this.d = null;
        }
        this.c = null;
    }

    public t6 P() {
        if (((t6) this.d) == null) {
            t6 t6Var = new t6((o0) this.a, (String) this.c);
            this.d = t6Var;
            t6Var.b(1);
        }
        return (t6) this.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void Q() {
        int i10;
        q1 q1Var;
        int i11;
        long j10;
        t6 t6Var = (t6) this.d;
        if (t6Var != null) {
            Map map = t6Var.e;
            List<g3> list = t6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = t6Var.c;
            List<u6> list3 = t6Var.b;
            d6.c cVar = t6Var.j;
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
            j1 l4 = k1.l();
            String str3 = t6.o;
            l4.c();
            k1.n((k1) l4.b, str3);
            String str4 = t6Var.g;
            l4.c();
            k1.m((k1) l4.b, str4);
            k1 k1Var = (k1) l4.a();
            m10.c();
            r1.r((r1) m10.b, k1Var);
            c0 c0Var = t6Var.a;
            w1 l10 = x1.l();
            Object zza = c0Var.zza();
            if (zza != null) {
                i2 l11 = j2.l();
                l11.c();
                j2.m((j2) l11.b, (String) zza);
                j2 j2Var = (j2) l11.a();
                l10.c();
                x1.m((x1) l10.b, j2Var);
            }
            String str5 = t6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    g6.b bVar = t6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e);
                    j10 = 0;
                }
                l10.c();
                x1.n((x1) l10.b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (u6 u6Var : list3) {
                    u6Var.getClass();
                    u1 l12 = v1.l();
                    int i12 = u6Var.e;
                    l12.c();
                    v1.p((v1) l12.b, i12);
                    int i13 = (int) (u6Var.b - u6Var.d);
                    l12.c();
                    v1.m((v1) l12.b, i13);
                    Integer num = u6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l12.c();
                        v1.n((v1) l12.b, intValue);
                    }
                    Boolean bool = u6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l12.c();
                        v1.o((v1) l12.b, booleanValue);
                    }
                    arrayList.add((v1) l12.a());
                }
                l10.c();
                x1.o((x1) l10.b, arrayList);
            }
            int i14 = 2;
            if (list2.isEmpty()) {
                i10 = 1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    a2 l13 = b2.l();
                    int i15 = (int) (aVar.b - aVar.c);
                    l13.c();
                    b2.m((b2) l13.b, i15);
                    int i16 = aVar.a;
                    int i17 = i16 != 1 ? i16 != 2 ? i16 != 3 ? 1 : 4 : 3 : 2;
                    l13.c();
                    b2.n((b2) l13.b, i17);
                    arrayList2.add((b2) l13.a());
                }
                i10 = 1;
                l10.c();
                x1.q((x1) l10.b, arrayList2);
            }
            if (list.isEmpty()) {
                q1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (g3 g3Var : list) {
                    String str6 = g3Var.a;
                    s1 l14 = t1.l();
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
                    t1.q((t1) l14.b, i11);
                    int i18 = (int) g3Var.b;
                    l14.c();
                    t1.m((t1) l14.b, i18);
                    int i19 = g3Var.c;
                    l14.c();
                    t1.n((t1) l14.b, i19);
                    int i20 = (int) (g3Var.d - g3Var.f);
                    l14.c();
                    t1.o((t1) l14.b, i20);
                    int i21 = (int) (g3Var.e - g3Var.f);
                    l14.c();
                    t1.p((t1) l14.b, i21);
                    arrayList3.add((t1) l14.a());
                    m10 = m10;
                    i14 = 2;
                }
                q1Var = m10;
                l10.c();
                x1.p((x1) l10.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    y1 l15 = z1.l();
                    int i22 = bVar2.e;
                    l15.c();
                    z1.p((z1) l15.b, i22);
                    int i23 = bVar2.d.get();
                    l15.c();
                    z1.m((z1) l15.b, i23);
                    int i24 = (int) (bVar2.a - bVar2.c);
                    l15.c();
                    z1.n((z1) l15.b, i24);
                    int i25 = (int) (bVar2.b - bVar2.c);
                    l15.c();
                    z1.o((z1) l15.b, i25);
                    arrayList4.add((z1) l15.a());
                }
                l10.c();
                x1.r((x1) l10.b, arrayList4);
            }
            x1 x1Var = (x1) l10.a();
            q1Var.c();
            r1.q((r1) q1Var.b, x1Var);
            t6Var.f.a((r1) q1Var.a(), TLRPC.LAYER);
            this.d = null;
        }
    }

    @Override // z3.d
    public int a(long j10) {
        long[] jArr = (long[]) this.b;
        int b10 = l0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // r9.b
    public Object b(Class cls) {
        if (!((Set) this.a).contains(r.a(cls))) {
            throw new ad.d("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object b10 = ((r9.b) this.e).b(cls);
        if (!cls.equals(na.a.class)) {
            return b10;
        }
        return new s();
    }

    @Override // r9.b
    public qa.b c(Class cls) {
        return e(r.a(cls));
    }

    @Override // r9.b
    public Object d(r rVar) {
        if (((Set) this.a).contains(rVar)) {
            return ((r9.b) this.e).d(rVar);
        }
        throw new ad.d("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // r9.b
    public qa.b e(r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((r9.b) this.e).e(rVar);
        }
        throw new ad.d("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // z3.d
    public long g(int i10) {
        return ((long[]) this.b)[i10];
    }

    @Override // zc.a
    public Object get() {
        return new q5.b((Executor) ((zc.a) this.a).get(), (m5.d) ((zc.a) this.b).get(), (q5.d) ((q5.d) this.c).get(), (s5.d) ((zc.a) this.d).get(), (t5.c) ((zc.a) this.e).get());
    }

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // r9.b
    public Set i(r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((r9.b) this.e).i(rVar);
        }
        throw new ad.d("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // r9.b
    public p j(r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((r9.b) this.e).j(rVar);
        }
        throw new ad.d("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // org.telegram.ui.Components.mn0
    public void k(boolean z10, float f7) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((n01) this.e).d;
        p01 p01Var = (p01) this.d;
        p01 p01Var2 = (p01) this.b;
        p01 p01Var3 = (p01) this.c;
        boolean isAttachedToWindow = ((nn0) this.a).isAttachedToWindow();
        long j10 = f7 > 0.7f ? (long) ((4089446400L * ((f7 - 0.7f) / 0.3f)) + 104857600) : (long) ((104333312 * (f7 / 0.7f)) + 524288.0f);
        if (f7 >= 1.0f) {
            p01Var2.e(false, isAttachedToWindow);
            p01Var3.e(false, isAttachedToWindow);
            p01Var.e(true, isAttachedToWindow);
            i0.Y3(p01Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f7 == 0.0f) {
            p01Var2.e(true, isAttachedToWindow);
            p01Var3.e(false, isAttachedToWindow);
            p01Var.e(false, isAttachedToWindow);
            i0.Y3(p01Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            p01Var3.c(cd.a0("UpToFileSize", null, 2131743849, i0.i0(j10, true, false)), false, true);
            p01Var2.e(false, isAttachedToWindow);
            p01Var3.e(true, isAttachedToWindow);
            p01Var.e(false, isAttachedToWindow);
            i0.Y3(p01Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.b0().c = j10;
            saveToGallerySettingsActivity.c0();
        }
    }

    public byte[] l() {
        byte[] bArr = (byte[]) this.b;
        byte[] bArr2 = (byte[]) this.a;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = se1.b;
        BigInteger bigInteger3 = se1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a2 = se1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a10 = se1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = se1.b(new byte[][]{a10, bArr2, bArr3});
        byte[] b11 = se1.b(new byte[][]{a10, bArr});
        this.d = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 * 8;
            arrayList.add(strArr[(int) (((b11[i11 + 7] & 255) | ((((((((b11[i11] & 127) << 56) | ((b11[i11 + 1] & 255) << 48)) | ((b11[i11 + 2] & 255) << 40)) | ((b11[i11 + 3] & 255) << 32)) | ((b11[i11 + 4] & 255) << 24)) | ((b11[i11 + 5] & 255) << 16)) | ((b11[i11 + 6] & 255) << 8))) % zs.e3)]);
        }
        this.e = arrayList;
        f8.b("wear-auth: built answer; session " + se1.d(bArr2) + " emojis=" + ((ArrayList) this.e));
        byte[] bArr4 = new byte[zs.L4];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a2, 0, bArr4, 32, 256);
        return bArr4;
    }

    public s0 m() {
        String str = ((Long) this.a) == null ? " pc" : "";
        if (((String) this.b) == null) {
            str = str.concat(" symbol");
        }
        if (((Long) this.d) == null) {
            str = sc.e.A(str, " offset");
        }
        if (((Integer) this.e) == null) {
            str = sc.e.A(str, " importance");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
        return new s0((String) this.b, ((Integer) this.e).intValue(), (String) this.c, ((Long) this.a).longValue(), ((Long) this.d).longValue());
    }

    public void n(Canvas canvas, boolean z10, boolean z11, int i10, float f7) {
        RectF rectF = (RectF) this.b;
        float[] fArr = (float[]) this.c;
        Paint paint = (Paint) this.e;
        i3 i3Var = (i3) this.a;
        Path path = (Path) this.d;
        int i11 = (int) ((z11 ? 0 : (int) i3Var.G) * f7);
        int L = i0.L(10.0f) * Math.min(1, i11 / i0.L(60.0f));
        if (i11 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f10 = L;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[5] = f10;
        fArr[4] = f10;
        path.rewind();
        rectF.set(0.0f, 0.0f, i10, (i3Var.getY() + i3Var.getHeight()) - i11);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(i0.L(2.0f), 0.0f, i0.L(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // z3.d
    public List p(long j10) {
        f4.c cVar = (f4.c) this.a;
        Map map = (Map) this.c;
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

    @Override // org.telegram.ui.Components.mn0
    public /* synthetic */ int p0() {
        return 0;
    }

    public void q(View view) {
        if (view instanceof GLSurfaceView) {
            this.e = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                q(viewGroup.getChildAt(i10));
            }
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        Paint paint;
        s9 s9Var;
        Path path = (Path) this.b;
        w9 w9Var = (w9) this.c;
        Paint paint2 = (Paint) this.d;
        b4 b4Var = (b4) this.e;
        if (!z10 && (s9Var = b4Var.N1) != null && s9Var.c()) {
            if (z10) {
                w9Var = (w9) this.a;
            }
            path.rewind();
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            w9Var.b(canvas, true);
            paint2.setAlpha((int) (i10 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((w9) this.a) == null) {
                this.a = new w9(b4Var.N1, b4Var.I1.getReactionsWindow().c, 0, false);
            }
            float f12 = -f10;
            float f13 = -f11;
            ((w9) this.a).e(f12, f13, b4Var.getMeasuredWidth() + f12, b4Var.getMeasuredHeight() + f13);
            paint = ((w9) this.a).h;
        } else {
            float f14 = -f10;
            float f15 = -f11;
            w9Var.e(f14, f15, b4Var.getMeasuredWidth() + f14, b4Var.getMeasuredHeight() + f15);
            paint = w9Var.h;
        }
        paint.setAlpha(i10);
        paint2.setAlpha((int) (i10 * 0.4f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
        canvas.drawRoundRect(rectF, f7, f7, paint2);
    }

    @Override // z3.d
    public int s() {
        return ((long[]) this.b).length;
    }

    public p u(Class cls) {
        return j(r.a(cls));
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((TextView) this.b).setAlpha(i0.T1(0.5f, 1.0f, ((fe.b) this.d).e));
        ((e) this.e).b(this);
    }

    public void w(q0.a aVar) {
        fg.i iVar = (fg.i) this.a;
        ia iaVar = new ia(this, aVar);
        iVar.getClass();
        l.d("getMapAsync() must be called on the main thread");
        p3 p3Var = (p3) iVar.b;
        a0 a0Var = (a0) p3Var.b;
        if (a0Var != null) {
            a0Var.q(iaVar);
        } else {
            ((ArrayList) p3Var.h).add(iaVar);
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        b4 b4Var = (b4) this.e;
        h2 h2Var = b4Var.J1;
        if (h2Var == null) {
            return;
        }
        h2Var.s(o0Var, true);
        b4Var.L0(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(int i10, int i11, Intent intent) {
        FileOutputStream fileOutputStream;
        b81 b81Var = (b81) this.d;
        if (i11 == -1) {
            FileOutputStream fileOutputStream2 = null;
            if (i10 != 10) {
                if (i10 != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.e = new File(b8.z(4), Utilities.b.nextInt() + ".jpg");
                    Point c12 = i0.c1();
                    Bitmap K = hc.K(null, intent.getData(), (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) this.e));
                    b81Var.b((File) this.e, K, false);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            }
            i0.e((String) this.a);
            try {
                this.e = new File(b8.z(4), Utilities.b.nextInt() + ".jpg");
                Point c13 = i0.c1();
                Bitmap K2 = hc.K((String) this.a, null, (float) c13.x, (float) c13.y, true);
                fileOutputStream = new FileOutputStream((File) this.e);
                try {
                    try {
                        K2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        b81Var.b((File) this.e, K2, false);
                    } catch (Exception e7) {
                        e = e7;
                        f8.g(e, true);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e10) {
                            f8.g(e10, true);
                        }
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
            try {
                fileOutputStream.close();
            } catch (Exception e12) {
                f8.g(e12, true);
            }
            this.a = null;
        }
    }

    public void z() {
        fg.i iVar = (fg.i) this.a;
        p3 p3Var = (p3) iVar.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            p3Var.getClass();
            p3Var.h(new x6.c(p3Var, 0));
            if (((a0) p3Var.b) == null) {
                p3.f(iVar);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public d(Context context) {
        this(context, new e6.b(-1, 0, 0));
    }

    public d(Context context, e6.b bVar) {
        this.a = context;
        this.b = bVar;
        N();
    }

    public d(f4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
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

    public d(Activity activity, WallpapersListActivity wallpapersListActivity, b81 b81Var) {
        this.b = activity;
        this.c = wallpapersListActivity;
        this.d = b81Var;
    }

    public d(e eVar) {
        this.e = eVar;
        gr grVar = gr.h;
        this.c = new fe.b(0, this, grVar, 320L, true);
        this.d = new fe.b(1, this, grVar, 320L, true);
    }

    public d(i3 i3Var) {
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Path();
        this.e = new Paint(1);
        this.a = i3Var;
    }

    @Override // org.telegram.ui.Components.mn0
    public void C() {
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ void t() {
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
