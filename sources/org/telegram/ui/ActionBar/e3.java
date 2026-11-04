package org.telegram.ui.ActionBar;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import b8.ke;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ec;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.y00;
import org.telegram.ui.lp0;
import org.telegram.ui.xm0;
import org.webrtc.GlGenericDrawer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e3 implements r0.m, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.u0, p1, g2.k, pi.m, qe.b, t0.e, v5.b, t9.d, tg.z, tg.j1, OnSuccessListener, ec, ta.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
        int i10 = this.a;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        switch (this.a) {
            case 0:
                j3 j3Var = (j3) this.b;
                j3Var.s = k1Var.a.f(2).d;
                j3Var.invalidate();
                break;
            default:
                l3 l3Var = (l3) this.b;
                l3Var.e = k1Var;
                i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
                i0.b I02 = org.telegram.messenger.g0.I0(k1Var, true);
                if (!l3Var.f.equals(I0) || !l3Var.h.equals(I02)) {
                    org.telegram.messenger.g0.m = I0.b;
                    org.telegram.messenger.g0.n = I0.d;
                    l3Var.f = I0;
                    l3Var.h = I02;
                    l3Var.requestLayout();
                }
                int childCount = l3Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = l3Var.getChildAt(i3);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.i0.b(childAt, k1Var);
                    }
                }
                l3Var.invalidate();
                break;
        }
        return r0.k1.b;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        switch (this.a) {
            case 8:
                ((Switch) this.b).invalidate();
                break;
            default:
                th.b.a((th.b) this.b);
                break;
        }
    }

    @Override // tg.z
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // g2.k
    public void accept(Object obj) {
        ((p2.j) obj).a((v7.s) this.b);
    }

    @Override // ta.a
    public void c(ta.b bVar) {
        w9.a aVar = (w9.a) this.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.b.set((w9.a) bVar.get());
    }

    @Override // v5.b
    public Object d() {
        SQLiteDatabase a10;
        int i3 = this.a;
        boolean z10 = false;
        Object obj = this.b;
        switch (i3) {
            case 11:
                u5.g gVar = (u5.g) ((u5.c) obj);
                gVar.getClass();
                int i10 = q5.a.e;
                ui.f fVar = new ui.f(13, z10);
                fVar.b = null;
                fVar.c = new ArrayList();
                fVar.d = null;
                fVar.e = "";
                HashMap hashMap = new HashMap();
                a10 = gVar.a();
                a10.beginTransaction();
                try {
                    q5.a aVar = (q5.a) u5.g.h(a10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new hr(gVar, hashMap, fVar, 11));
                    a10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 12:
                u5.g gVar2 = (u5.g) ((u5.d) obj);
                long o10 = gVar2.b.o() - gVar2.d.d;
                a10 = gVar2.a();
                a10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(o10)};
                    Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            gVar2.e(rawQuery.getInt(0), q5.c.c, rawQuery.getString(1));
                        } catch (Throwable th2) {
                            rawQuery.close();
                            throw th2;
                        }
                    }
                    rawQuery.close();
                    int delete = a10.delete("events", "timestamp_ms < ?", strArr);
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 13:
                u5.g gVar3 = (u5.g) ((u5.c) ((ha.c) obj).i);
                a10 = gVar3.a();
                a10.beginTransaction();
                try {
                    a10.compileStatement("DELETE FROM log_event_dropped").execute();
                    a10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.b.o()).execute();
                    a10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                za.p pVar = (za.p) obj;
                Iterator it = ((Iterable) ((u5.g) ((u5.d) pVar.b)).c(new s0.b(26))).iterator();
                while (it.hasNext()) {
                    ((p7.d) pVar.c).E((n5.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(s1 s1Var, int i3) {
        switch (this.a) {
            case 5:
                ((org.telegram.ui.web.y) this.b).run();
                break;
            case 19:
                ((xm0) this.b).run();
                break;
            case 20:
                ((ug.z) this.b).a.P1.r();
                break;
            default:
                ((xg.r0) this.b).run();
                break;
        }
    }

    @Override // pi.m
    public void l(int i3) {
        pi.a aVar = (pi.a) this.b;
        pi.q qVar = aVar.a;
        pi.d dVar = aVar.g;
        if (Build.VERSION.SDK_INT < 31 || dVar == null) {
            return;
        }
        ArrayList arrayList = dVar.a;
        if (pi.q.f().a) {
            if (x7.u.a(i3, 4) || x7.u.a(i3, 2)) {
                ri.a e10 = qVar.e();
                ViewGroup viewGroup = aVar.m;
                if (viewGroup != null) {
                    e10.b(viewGroup.getY(), aVar.l.getWidth(), aVar.m.getY() + aVar.m.getHeight());
                }
                dVar.b = e10.b;
                while (dVar.b > arrayList.size()) {
                    arrayList.add(new pi.b(arrayList.size()));
                }
                for (int i10 = 0; i10 < dVar.b; i10++) {
                    pi.b bVar = (pi.b) arrayList.get(i10);
                    bVar.a.set(e10.c(i10));
                    bVar.b(dVar.m, dVar.n, dVar.o);
                    bVar.c(dVar.k);
                    int i11 = dVar.p;
                    int i12 = dVar.q;
                    int i13 = dVar.r;
                    int i14 = dVar.s;
                    bVar.u = i11;
                    bVar.v = i12;
                    bVar.w = i13;
                    bVar.x = i14;
                }
            }
            dVar.c = aVar.n;
            dVar.d = aVar.l;
            boolean z10 = qVar.j > 0;
            boolean z11 = !z10;
            if (dVar.l != z11) {
                dVar.l = z11;
                int i15 = !z10 ? 5 : 1;
                dVar.m = i15;
                int i16 = z10 ? 1 : 10;
                dVar.n = i16;
                dVar.o = Math.max(i15, i16);
                for (int i17 = 0; i17 < dVar.b; i17++) {
                    ((pi.b) arrayList.get(i17)).b(dVar.m, dVar.n, dVar.o);
                }
                dVar.f();
            }
            int i18 = qVar.k;
            int i19 = qVar.l;
            dVar.t = i18;
            dVar.u = i19;
            dVar.f();
            dVar.e();
            Runnable runnable = aVar.j;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // org.telegram.messenger.ec
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ch0 B;
        ug.d2 d2Var = (ug.d2) this.b;
        if (!z10 || z11 || (B = imageReceiver.B()) == null) {
            return;
        }
        d2Var.q(B);
    }

    @Override // t0.e
    public boolean m(y00 y00Var, int i3, Bundle bundle) {
        r0.d dVar;
        m.s sVar = (m.s) this.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i3 & 1) != 0) {
            try {
                ((t0.h) y00Var.a).b();
                Parcelable parcelable = (Parcelable) ((t0.h) y00Var.a).e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        t0.h hVar = (t0.h) y00Var.a;
        ClipData clipData = new ClipData(hVar.getDescription(), new ClipData.Item(hVar.a()));
        if (i10 >= 31) {
            dVar = new l2.j(clipData, 2);
        } else {
            r0.e eVar = new r0.e();
            eVar.b = clipData;
            eVar.c = 2;
            dVar = eVar;
        }
        dVar.b(hVar.d());
        dVar.setExtras(bundle);
        return r0.i0.h(sVar, dVar.build()) == null;
    }

    @Override // tg.j1
    public void o() {
        lp0 lp0Var = (lp0) this.b;
        TextView textView = lp0Var.i1;
        boolean a10 = lp0Var.p0.a();
        ImageView imageView = lp0Var.g1;
        imageView.animate().cancel();
        imageView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        textView.animate().alpha(a10 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 21:
                ug.n1 n1Var = (ug.n1) obj2;
                n1Var.D0 = true;
                n1Var.C0 = false;
                break;
            case 22:
                ai.g3 g3Var = (ai.g3) obj2;
                wb.b bVar = (wb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar.a.size(); i10++) {
                    wb.a aVar = (wb.a) bVar.a.get(i10);
                    ug.b2 b2Var = new ug.b2();
                    b2Var.a = aVar.a;
                    b2Var.b = aVar.d;
                    b2Var.c = aVar.e;
                    b2Var.d = aVar.b;
                    b2Var.e = aVar.c;
                    arrayList.add(b2Var);
                }
                g3Var.a(arrayList);
                break;
            default:
                ug.c2 c2Var = (ug.c2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    a8.b("objimg: no objects");
                    break;
                } else {
                    int i11 = ((tb.a) list.get(0)).c;
                    String str = null;
                    if (x7.d0.a == null) {
                        x7.d0.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i11 >= 0) {
                        String[] strArr = x7.d0.a;
                        if (i11 < strArr.length) {
                            str = strArr[i11];
                        }
                    }
                    c2Var.d0 = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((tb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(c2Var.d0);
                    sb2.append(" ");
                    k2.p1.w(((tb.a) list.get(0)).a, sb2);
                    org.telegram.messenger.i6.g(c2Var.d0);
                    break;
                }
        }
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        z9.p pVar;
        aa.g gVar;
        int i3;
        int i10;
        int i11;
        Throwable th2;
        String str;
        v9.b bVar;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        ha.b a10;
        switch (this.a) {
            case 15:
                return this.b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.b;
                int i12 = CrashlyticsRegistrar.d;
                long currentTimeMillis = System.currentTimeMillis();
                n9.h hVar = (n9.h) keVar.a(n9.h.class);
                ua.e eVar = (ua.e) keVar.a(ua.e.class);
                t9.p n4 = keVar.n(w9.a.class);
                t9.p n10 = keVar.n(o9.a.class);
                t9.p n11 = keVar.n(cb.a.class);
                ExecutorService executorService = (ExecutorService) keVar.g(crashlyticsRegistrar.a);
                ExecutorService executorService2 = (ExecutorService) keVar.g(crashlyticsRegistrar.b);
                ExecutorService executorService3 = (ExecutorService) keVar.g(crashlyticsRegistrar.c);
                hVar.a();
                Context context = hVar.a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
                aa.g gVar2 = new aa.g(executorService, executorService2);
                fa.f fVar = new fa.f(context);
                z9.s sVar = new z9.s(hVar);
                z9.v vVar = new z9.v(context, packageName, eVar, sVar);
                w9.a aVar = new w9.a(n4);
                androidx.emoji2.text.f fVar2 = new androidx.emoji2.text.f(n10);
                z9.i iVar = new z9.i(sVar, fVar);
                eb.c cVar = eb.c.a;
                eb.d dVar = eb.d.a;
                eb.c cVar2 = eb.c.a;
                eb.a a11 = eb.c.a(dVar);
                if (a11.b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar + " already registered.");
                } else {
                    a11.b = iVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar + " registered.");
                    a11.a.countDown();
                }
                z9.p pVar2 = new z9.p(hVar, vVar, aVar, sVar, new v9.a(fVar2), new v9.a(fVar2), fVar, iVar, new nh(n11, 27), gVar2);
                aa.g gVar3 = pVar2.n;
                hVar.a();
                String str2 = hVar.c.b;
                int e10 = z9.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e10 == 0) {
                    e10 = z9.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                String string = e10 != 0 ? context.getResources().getString(e10) : null;
                ArrayList arrayList = new ArrayList();
                int e11 = z9.g.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e12 = z9.g.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e13 = z9.g.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e11 == 0 || e12 == 0 || e13 == 0) {
                    pVar = pVar2;
                    gVar = gVar3;
                    i3 = 2;
                    i10 = 0;
                    i11 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e11), Integer.valueOf(e12), Integer.valueOf(e13));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    i3 = 2;
                    String[] stringArray = context.getResources().getStringArray(e11);
                    String[] stringArray2 = context.getResources().getStringArray(e12);
                    String[] stringArray3 = context.getResources().getStringArray(e13);
                    i10 = 0;
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i13 = 0;
                        while (i13 < stringArray3.length) {
                            int i14 = i13;
                            arrayList.add(new z9.d(stringArray[i14], stringArray2[i14], stringArray3[i14]));
                            i13 = i14 + 1;
                            gVar3 = gVar3;
                            pVar2 = pVar2;
                        }
                        pVar = pVar2;
                        gVar = gVar3;
                    } else {
                        pVar = pVar2;
                        gVar = gVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    }
                    th2 = null;
                    i11 = 3;
                }
                String f10 = t4.c.f("Mapping file ID is: ", string);
                if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                    Log.d("FirebaseCrashlytics", f10, th2);
                }
                int size = arrayList.size();
                int i15 = i10;
                while (i15 < size) {
                    Object obj = arrayList.get(i15);
                    i15++;
                    z9.d dVar2 = (z9.d) obj;
                    String str3 = dVar2.a;
                    String str4 = dVar2.b;
                    String str5 = dVar2.c;
                    int i16 = size;
                    StringBuilder n12 = com.google.android.recaptcha.internal.a.n("Build id for ", str3, " on ", str4, ": ");
                    n12.append(str5);
                    String sb2 = n12.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i16;
                }
                int i17 = i3;
                try {
                    z9.a a12 = z9.a.a(context, vVar, str2, string, arrayList, new w9.b(context));
                    String str6 = "Installer package name is: " + a12.d;
                    if (Log.isLoggable("FirebaseCrashlytics", i17)) {
                        Log.v("FirebaseCrashlytics", str6, null);
                    }
                    kb.a aVar2 = new kb.a(7);
                    String str7 = a12.f;
                    String str8 = a12.g;
                    String d = vVar.d();
                    nb.a aVar3 = new nb.a(29);
                    gi.v5 v5Var = new gi.v5(aVar3, 3);
                    android.support.v4.media.c cVar3 = new android.support.v4.media.c(fVar);
                    Locale locale = Locale.US;
                    be.t tVar = new be.t(a1.g.q("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str2, "/settings"), aVar2);
                    String str9 = Build.MANUFACTURER;
                    String str10 = z9.v.h;
                    String C = a1.g.C(str9.replaceAll(str10, ""), "/", Build.MODEL.replaceAll(str10, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str10, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str10, "");
                    int e14 = z9.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e14 == 0) {
                        e14 = z9.g.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    String[] strArr = {e14 != 0 ? context.getResources().getString(e14) : null, str2, str8, str7};
                    ArrayList arrayList2 = new ArrayList();
                    int i18 = i10;
                    while (i18 < 4) {
                        String str11 = strArr[i18];
                        String[] strArr2 = strArr;
                        if (str11 != null) {
                            arrayList2.add(str11.replace("-", "").toLowerCase(Locale.US));
                        }
                        i18++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb3 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i19 = i10;
                    while (i19 < size2) {
                        Object obj2 = arrayList2.get(i19);
                        i19++;
                        sb3.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String sb4 = sb3.toString();
                    ha.e eVar2 = new ha.e(str2, C, replaceAll, replaceAll2, vVar, sb4.length() > 0 ? z9.g.i(sb4) : null, str8, str7, t4.c.b(d != null ? 4 : 1));
                    ha.c cVar4 = new ha.c();
                    AtomicReference atomicReference = new AtomicReference();
                    cVar4.h = atomicReference;
                    cVar4.i = new AtomicReference(new TaskCompletionSource());
                    cVar4.a = context;
                    cVar4.b = eVar2;
                    cVar4.d = aVar3;
                    cVar4.c = v5Var;
                    cVar4.e = cVar3;
                    cVar4.f = tVar;
                    cVar4.g = sVar;
                    atomicReference.set(ra.e.s2(aVar3));
                    AtomicReference atomicReference2 = (AtomicReference) cVar4.i;
                    AtomicReference atomicReference3 = (AtomicReference) cVar4.h;
                    if (!((Context) cVar4.a).getSharedPreferences("com.google.firebase.crashlytics", i10).getString("existing_instance_identifier", "").equals((String) ((ha.e) cVar4.b).f) || (a10 = cVar4.a(1)) == null) {
                        ha.b a13 = cVar4.a(3);
                        if (a13 != null) {
                            atomicReference3.set(a13);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(a13);
                        }
                        z9.s sVar2 = (z9.s) cVar4.g;
                        Task task2 = sVar2.h.getTask();
                        synchronized (sVar2.c) {
                            task = sVar2.d.getTask();
                        }
                        onSuccessTask = aa.b.a(task2, task).onSuccessTask(gVar2.a, new p4.q(cVar4, gVar2, false));
                    } else {
                        atomicReference3.set(a10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a10);
                        onSuccessTask = Tasks.forResult(null);
                    }
                    onSuccessTask.addOnFailureListener(executorService3, new u9.j(9));
                    z9.p pVar3 = pVar;
                    fa.f fVar3 = pVar3.h;
                    Context context2 = pVar3.a;
                    boolean c2 = z9.g.c(context2, "com.google.firebase.crashlytics.RequireBuildId", z9.g.c(context2, "com.crashlytics.RequireBuildId", true));
                    String str12 = a12.b;
                    if (c2) {
                        str = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(str12)) {
                            Log.e(str, ".");
                            Log.e(str, ".     |  | ");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".   \\ |  | /");
                            Log.e(str, ".    \\    /");
                            Log.e(str, ".     \\  /");
                            Log.e(str, ".      \\/");
                            Log.e(str, ".");
                            Log.e(str, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str, ".");
                            Log.e(str, ".      /\\");
                            Log.e(str, ".     /  \\");
                            Log.e(str, ".    /    \\");
                            Log.e(str, ".   / |  | \\");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".     |  |");
                            Log.e(str, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    } else {
                        str = "FirebaseCrashlytics";
                        if (Log.isLoggable(str, 2)) {
                            Log.v(str, "Configured not to require a build ID.", null);
                        }
                    }
                    String str13 = new z9.e().a;
                    try {
                        int i20 = 5;
                        pVar3.e = new w9.b(i20, "crash_marker", fVar3);
                        pVar3.d = new w9.b(i20, "initialization_marker", fVar3);
                        aa.g gVar4 = gVar;
                        m.o3 o3Var = new m.o3(str13, fVar3, gVar4);
                        ba.f fVar4 = new ba.f(fVar3);
                        ia.a[] aVarArr = {new kb.a(11)};
                        tf.b bVar2 = new tf.b();
                        bVar2.a = aVarArr;
                        bVar2.b = new v7.s(10);
                        ((t9.p) pVar3.m.b).a(new u9.j(16));
                        pVar3.f = new z9.m(pVar3.a, pVar3.g, pVar3.b, pVar3.h, pVar3.e, a12, o3Var, fVar4, z9.x.d(pVar3.a, pVar3.g, pVar3.h, a12, fVar4, o3Var, bVar2, cVar4, pVar3.c, pVar3.k, pVar3.n), pVar3.l, pVar3.j, pVar3.k, pVar3.n);
                        w9.b bVar3 = pVar3.d;
                        fa.f fVar5 = (fa.f) bVar3.c;
                        String str14 = (String) bVar3.b;
                        fVar5.getClass();
                        boolean exists = new File((File) fVar5.d, str14).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) gVar4.a.a.submit(new d5.f(pVar3, 2)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        z9.m mVar = pVar3.f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        mVar.e.a.a(new xh.i(1, mVar, str13));
                        z9.r rVar = new z9.r(new y3.b(mVar), cVar4, defaultUncaughtExceptionHandler, mVar.j);
                        mVar.n = rVar;
                        Thread.setDefaultUncaughtExceptionHandler(rVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            pVar3.f.e(str13);
                        }
                        if (!exists || (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Successfully configured exception handler.", null);
                            }
                            gVar4.a.a(new z9.n(pVar3, cVar4, 0));
                        } else {
                            if (Log.isLoggable(str, 3)) {
                                Log.d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            pVar3.b(cVar4);
                        }
                    } catch (Exception e15) {
                        Log.e(str, "Crashlytics was not started due to an exception during initialization", e15);
                        pVar3.f = null;
                    }
                    bVar = new v9.b(pVar3);
                } catch (PackageManager.NameNotFoundException e16) {
                    str = "FirebaseCrashlytics";
                    Log.e(str, "Error retrieving app package info.", e16);
                    bVar = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 16) {
                    String e17 = t4.c.e(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
                    if (Log.isLoggable(str, 3)) {
                        Log.d(str, e17, null);
                    }
                }
                return bVar;
        }
    }

    @Override // org.webrtc.GlGenericDrawer.TextureCallback
    public void run(Bitmap bitmap, int i3) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.b;
        if (bitmap == null || bitmap.getPixel(0, 0) == 0) {
            return;
        }
        Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / hs.K2));
        org.telegram.messenger.g0.h3(new p11(10, rVar, bitmap));
    }

    public /* synthetic */ e3(ne.h hVar, r4.s0 s0Var) {
        this.a = 9;
        this.b = hVar;
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void D(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void b(float f10, int i3) {
    }

    private final /* synthetic */ void e(float f10, int i3) {
    }

    @Override // org.telegram.messenger.ec
    public /* synthetic */ void F0(int i3, Drawable drawable) {
    }
}
