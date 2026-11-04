package b8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
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
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b8.ke;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h4;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.xq;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.hm0;
import org.telegram.ui.py0;
import org.telegram.ui.qc1;
import org.telegram.ui.ry0;
import ug.m1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ke implements fb.b, ki0, b4.d, qe.b, org.telegram.messenger.sa, om0, p5.b, t9.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ ke(int i3) {
        this.a = i3;
    }

    public static void P(ke keVar, com.google.android.gms.internal.cast.t6 t6Var) {
        int i3 = t6Var.e;
        if (i3 == 2 && ((com.google.android.gms.internal.cast.s6) keVar.e) != null) {
            keVar.R();
        }
        if (i3 == 2) {
            keVar.e = new com.google.android.gms.internal.cast.s6((com.google.android.gms.internal.cast.n0) keVar.b, (String) keVar.d);
        } else {
            keVar.e = keVar.Q();
        }
        com.google.android.gms.internal.cast.s6 s6Var = (com.google.android.gms.internal.cast.s6) keVar.e;
        p6.m.g(s6Var);
        t6Var.d = s6Var.h;
        s6Var.b.add(t6Var);
    }

    public static ke l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        ke keVar = new ke(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) keVar.e)) {
            try {
                ((ArrayDeque) keVar.e).clear();
                String string = ((SharedPreferences) keVar.b).getString((String) keVar.c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) keVar.d)) {
                    String[] split = string.split((String) keVar.d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) keVar.e).add(str);
                        }
                    }
                    return keVar;
                }
                return keVar;
            } finally {
            }
        }
    }

    public static Exception q(Task task) {
        return task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public void A() {
        m.o3 o3Var = (m.o3) ((ai.c0) this.b).b;
        o3Var.getClass();
        o3Var.b(new z6.d(o3Var, 1));
    }

    public void B() {
        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
        if (d2Var == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) this.c).startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
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
        hm0 hm0Var = new hm0(2, false, false, null);
        hm0Var.y = false;
        hm0Var.W = new nh(this, 7);
        d2Var.presentFragment(hm0Var);
    }

    public String C() {
        String str;
        synchronized (((ArrayDeque) this.e)) {
            str = (String) ((ArrayDeque) this.e).peek();
        }
        return str;
    }

    @Override // org.telegram.ui.Components.ki0
    public void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
        Paint paint;
        org.telegram.ui.Components.x9 x9Var;
        Path path = (Path) this.c;
        org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) this.d;
        Paint paint2 = (Paint) this.e;
        gi.m5 m5Var = (gi.m5) this.f;
        if (!z10 && (x9Var = m5Var.O1) != null && x9Var.c()) {
            if (z10) {
                baVar = (org.telegram.ui.Components.ba) this.b;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            baVar.b(canvas, true);
            paint2.setAlpha((int) (i3 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z10) {
            if (((org.telegram.ui.Components.ba) this.b) == null) {
                this.b = new org.telegram.ui.Components.ba(m5Var.O1, m5Var.J1.getReactionsWindow().c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((org.telegram.ui.Components.ba) this.b).e(f13, f14, m5Var.getMeasuredWidth() + f13, m5Var.getMeasuredHeight() + f14);
            paint = ((org.telegram.ui.Components.ba) this.b).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            baVar.e(f15, f16, m5Var.getMeasuredWidth() + f15, m5Var.getMeasuredHeight() + f16);
            paint = baVar.h;
        }
        paint.setAlpha(i3);
        paint2.setAlpha((int) (i3 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public Task G() {
        Task forException;
        int i3;
        boolean s6 = s();
        if (s6 && ((org.telegram.ui.ActionBar.h4) this.f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new e5.r("Firebase-Messaging-Network-Io"));
            final int i10 = 1;
            Task continueWithTask = ((ua.d) ((ua.e) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: za.l
                public final /* synthetic */ ke b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i11 = i10;
                    ExecutorService executorService = newSingleThreadExecutor;
                    ke keVar = this.b;
                    switch (i11) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(ke.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            n9.h hVar = (n9.h) keVar.c;
                            hVar.a();
                            n9.k kVar = hVar.c;
                            String str3 = kVar.a;
                            hVar.a();
                            l6.b bVar = new l6.b(h4.b(hVar), kVar.b, str3, str, str2);
                            n7.d dVar = (n7.d) keVar.b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new m6.c[]{l6.h.a};
                            b10.c = new m2.t(dVar, bVar, false, 2);
                            b10.a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new m1(str, 1));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(ke.q(task)) : ((ua.d) ((ua.e) keVar.d)).e().continueWithTask(executorService, new m1(keVar, ((ua.a) task.getResult()).a));
                    }
                }
            });
            final int i11 = 0;
            return continueWithTask.continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: za.l
                public final /* synthetic */ ke b;

                {
                    this.b = this;
                }

                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i112 = i11;
                    ExecutorService executorService = newSingleThreadExecutor;
                    ke keVar = this.b;
                    switch (i112) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(ke.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            n9.h hVar = (n9.h) keVar.c;
                            hVar.a();
                            n9.k kVar = hVar.c;
                            String str3 = kVar.a;
                            hVar.a();
                            l6.b bVar = new l6.b(h4.b(hVar), kVar.b, str3, str, str2);
                            n7.d dVar = (n7.d) keVar.b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new m6.c[]{l6.h.a};
                            b10.c = new m2.t(dVar, bVar, false, 2);
                            b10.a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new m1(str, 1));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(ke.q(task)) : ((ua.d) ((ua.e) keVar.d)).e().continueWithTask(executorService, new m1(keVar, ((ua.a) task.getResult()).a));
                    }
                }
            });
        }
        l2.e eVar = (l2.e) this.e;
        String b10 = org.telegram.ui.ActionBar.h4.b((n9.h) eVar.a);
        Bundle bundle = new Bundle();
        try {
            eVar.n(b10, bundle, s6);
            l6.c cVar = (l6.c) eVar.c;
            l6.d dVar = l6.d.b;
            d4.d dVar2 = cVar.c;
            if (dVar2.i() < 12000000) {
                forException = dVar2.h() != 0 ? cVar.d(bundle).continueWithTask(dVar, new tf.b(cVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            } else {
                l6.n i12 = l6.n.i(cVar.b);
                synchronized (i12) {
                    i3 = i12.a;
                    i12.a = i3 + 1;
                }
                forException = i12.k(new l6.l(i3, 1, bundle, 1)).continueWith(dVar, v7.s.c);
            }
        } catch (InterruptedException | ExecutionException e10) {
            forException = Tasks.forException(e10);
        }
        return forException.continueWith(new c3.b(3), new xg.c(eVar, 8));
    }

    public boolean H(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.e)) {
            remove = ((ArrayDeque) this.e).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f).execute(new xf.c(this, 7));
            }
        }
        return remove;
    }

    public Set I(Class cls) {
        return b(t9.r.a(cls));
    }

    public void K(Bitmap bitmap) {
        Bitmap bitmap2;
        View view = (View) this.b;
        View view2 = (View) this.c;
        if (((Bitmap) this.d) == bitmap) {
            return;
        }
        if (((org.telegram.ui.Components.mc) this.f) != null) {
            view.setBackground(null);
            this.f = null;
        }
        if (((org.telegram.ui.Components.mc) this.e) == null && ((org.telegram.ui.Components.mc) this.f) == null && (bitmap2 = (Bitmap) this.d) != null) {
            bitmap2.recycle();
            this.d = null;
        }
        L();
        this.d = bitmap;
        org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc((Bitmap) this.d);
        this.f = mcVar;
        view.setBackground(mcVar);
        if (view2 != null) {
            org.telegram.ui.Components.mc mcVar2 = new org.telegram.ui.Components.mc((Bitmap) this.d);
            this.e = mcVar2;
            view2.setBackground(mcVar2);
        }
    }

    public void L() {
        Bitmap bitmap;
        if (((org.telegram.ui.Components.mc) this.e) != null) {
            this.e = null;
            View view = (View) this.c;
            if (view != null) {
                view.setBackground(null);
            }
        }
        if (((org.telegram.ui.Components.mc) this.e) == null && ((org.telegram.ui.Components.mc) this.f) == null && (bitmap = (Bitmap) this.d) != null) {
            bitmap.recycle();
            this.d = null;
        }
    }

    public void M(Uri uri) {
        int i3;
        Context context = (Context) this.b;
        if (uri == null) {
            N();
            return;
        }
        if (uri.equals((Uri) this.d)) {
            return;
        }
        N();
        this.d = uri;
        g6.b bVar = (g6.b) this.c;
        int i10 = bVar.b;
        if (i10 == 0 || (i3 = bVar.c) == 0) {
            this.e = new h6.b(context, 0, 0, this);
        } else {
            this.e = new h6.b(context, i10, i3, this);
        }
        h6.b bVar2 = (h6.b) this.e;
        p6.m.g(bVar2);
        Uri uri2 = (Uri) this.d;
        p6.m.g(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void N() {
        h6.b bVar = (h6.b) this.e;
        if (bVar != null) {
            bVar.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    @Override // org.telegram.ui.Components.ki0
    public boolean O() {
        return true;
    }

    public com.google.android.gms.internal.cast.s6 Q() {
        if (((com.google.android.gms.internal.cast.s6) this.e) == null) {
            com.google.android.gms.internal.cast.s6 s6Var = new com.google.android.gms.internal.cast.s6((com.google.android.gms.internal.cast.n0) this.b, (String) this.d);
            this.e = s6Var;
            s6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.s6) this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void R() {
        int i3;
        com.google.android.gms.internal.cast.p1 p1Var;
        int i10;
        long j10;
        com.google.android.gms.internal.cast.s6 s6Var = (com.google.android.gms.internal.cast.s6) this.e;
        if (s6Var != null) {
            Map map = s6Var.e;
            List<com.google.android.gms.internal.cast.f3> list = s6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = s6Var.c;
            List<com.google.android.gms.internal.cast.t6> list3 = s6Var.b;
            f6.c cVar = s6Var.j;
            if (cVar != null) {
                cVar.l = null;
                s6Var.j = null;
            }
            long j11 = s6Var.i;
            com.google.android.gms.internal.cast.p1 m10 = com.google.android.gms.internal.cast.q1.m();
            m10.c();
            com.google.android.gms.internal.cast.q1.t((com.google.android.gms.internal.cast.q1) m10.b, j11);
            String str = s6Var.l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.q1.y((com.google.android.gms.internal.cast.q1) m10.b, str);
            }
            String str2 = s6Var.m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.q1.u((com.google.android.gms.internal.cast.q1) m10.b, str2);
            }
            com.google.android.gms.internal.cast.i1 l10 = com.google.android.gms.internal.cast.j1.l();
            String str3 = com.google.android.gms.internal.cast.s6.o;
            l10.c();
            com.google.android.gms.internal.cast.j1.n((com.google.android.gms.internal.cast.j1) l10.b, str3);
            String str4 = s6Var.g;
            l10.c();
            com.google.android.gms.internal.cast.j1.m((com.google.android.gms.internal.cast.j1) l10.b, str4);
            com.google.android.gms.internal.cast.j1 j1Var = (com.google.android.gms.internal.cast.j1) l10.a();
            m10.c();
            com.google.android.gms.internal.cast.q1.r((com.google.android.gms.internal.cast.q1) m10.b, j1Var);
            com.google.android.gms.internal.cast.c0 c0Var = s6Var.a;
            com.google.android.gms.internal.cast.v1 l11 = com.google.android.gms.internal.cast.w1.l();
            Object zza = c0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.h2 l12 = com.google.android.gms.internal.cast.i2.l();
                l12.c();
                com.google.android.gms.internal.cast.i2.m((com.google.android.gms.internal.cast.i2) l12.b, (String) zza);
                com.google.android.gms.internal.cast.i2 i2Var = (com.google.android.gms.internal.cast.i2) l12.a();
                l11.c();
                com.google.android.gms.internal.cast.w1.m((com.google.android.gms.internal.cast.w1) l11.b, i2Var);
            }
            String str5 = s6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j10 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    i6.b bVar = com.google.android.gms.internal.cast.s6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j10 = 0;
                }
                l11.c();
                com.google.android.gms.internal.cast.w1.n((com.google.android.gms.internal.cast.w1) l11.b, j10);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.t6 t6Var : list3) {
                    t6Var.getClass();
                    com.google.android.gms.internal.cast.t1 l13 = com.google.android.gms.internal.cast.u1.l();
                    int i11 = t6Var.e;
                    l13.c();
                    com.google.android.gms.internal.cast.u1.p((com.google.android.gms.internal.cast.u1) l13.b, i11);
                    int i12 = (int) (t6Var.b - t6Var.d);
                    l13.c();
                    com.google.android.gms.internal.cast.u1.m((com.google.android.gms.internal.cast.u1) l13.b, i12);
                    Integer num = t6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        com.google.android.gms.internal.cast.u1.n((com.google.android.gms.internal.cast.u1) l13.b, intValue);
                    }
                    Boolean bool = t6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        com.google.android.gms.internal.cast.u1.o((com.google.android.gms.internal.cast.u1) l13.b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.u1) l13.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.w1.o((com.google.android.gms.internal.cast.w1) l11.b, arrayList);
            }
            int i13 = 2;
            if (list2.isEmpty()) {
                i3 = 1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    com.google.android.gms.internal.cast.z1 l14 = com.google.android.gms.internal.cast.a2.l();
                    int i14 = (int) (aVar.b - aVar.c);
                    l14.c();
                    com.google.android.gms.internal.cast.a2.m((com.google.android.gms.internal.cast.a2) l14.b, i14);
                    int i15 = aVar.a;
                    int i16 = i15 != 1 ? i15 != 2 ? i15 != 3 ? 1 : 4 : 3 : 2;
                    l14.c();
                    com.google.android.gms.internal.cast.a2.n((com.google.android.gms.internal.cast.a2) l14.b, i16);
                    arrayList2.add((com.google.android.gms.internal.cast.a2) l14.a());
                }
                i3 = 1;
                l11.c();
                com.google.android.gms.internal.cast.w1.q((com.google.android.gms.internal.cast.w1) l11.b, arrayList2);
            }
            if (list.isEmpty()) {
                p1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.f3 f3Var : list) {
                    String str6 = f3Var.a;
                    com.google.android.gms.internal.cast.r1 l15 = com.google.android.gms.internal.cast.s1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                break;
                            }
                            i10 = i3;
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = i13;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                break;
                            }
                            i10 = i3;
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                break;
                            }
                            i10 = i3;
                            break;
                        default:
                            i10 = i3;
                            break;
                    }
                    l15.c();
                    com.google.android.gms.internal.cast.s1.q((com.google.android.gms.internal.cast.s1) l15.b, i10);
                    int i17 = (int) f3Var.b;
                    l15.c();
                    com.google.android.gms.internal.cast.s1.m((com.google.android.gms.internal.cast.s1) l15.b, i17);
                    int i18 = f3Var.c;
                    l15.c();
                    com.google.android.gms.internal.cast.s1.n((com.google.android.gms.internal.cast.s1) l15.b, i18);
                    int i19 = (int) (f3Var.d - f3Var.f);
                    l15.c();
                    com.google.android.gms.internal.cast.s1.o((com.google.android.gms.internal.cast.s1) l15.b, i19);
                    int i20 = (int) (f3Var.e - f3Var.f);
                    l15.c();
                    com.google.android.gms.internal.cast.s1.p((com.google.android.gms.internal.cast.s1) l15.b, i20);
                    arrayList3.add((com.google.android.gms.internal.cast.s1) l15.a());
                    m10 = m10;
                    i13 = 2;
                }
                p1Var = m10;
                l11.c();
                com.google.android.gms.internal.cast.w1.p((com.google.android.gms.internal.cast.w1) l11.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.x1 l16 = com.google.android.gms.internal.cast.y1.l();
                    int i21 = bVar2.e;
                    l16.c();
                    com.google.android.gms.internal.cast.y1.p((com.google.android.gms.internal.cast.y1) l16.b, i21);
                    int i22 = bVar2.d.get();
                    l16.c();
                    com.google.android.gms.internal.cast.y1.m((com.google.android.gms.internal.cast.y1) l16.b, i22);
                    int i23 = (int) (bVar2.a - bVar2.c);
                    l16.c();
                    com.google.android.gms.internal.cast.y1.n((com.google.android.gms.internal.cast.y1) l16.b, i23);
                    int i24 = (int) (bVar2.b - bVar2.c);
                    l16.c();
                    com.google.android.gms.internal.cast.y1.o((com.google.android.gms.internal.cast.y1) l16.b, i24);
                    arrayList4.add((com.google.android.gms.internal.cast.y1) l16.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.w1.r((com.google.android.gms.internal.cast.w1) l11.b, arrayList4);
            }
            com.google.android.gms.internal.cast.w1 w1Var = (com.google.android.gms.internal.cast.w1) l11.a();
            p1Var.c();
            com.google.android.gms.internal.cast.q1.q((com.google.android.gms.internal.cast.q1) p1Var.b, w1Var);
            s6Var.f.a((com.google.android.gms.internal.cast.q1) p1Var.a(), TLRPC.LAYER);
            this.e = null;
        }
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ((TextView) this.c).setAlpha(org.telegram.messenger.g0.T1(0.5f, 1.0f, ((qe.a) this.e).e));
        ((mh.c) this.f).b(this);
    }

    @Override // t9.b
    public Object a(Class cls) {
        if (!((Set) this.b).contains(t9.r.a(cls))) {
            throw new androidx.car.app.j("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a10 = ((t9.b) this.f).a(cls);
        if (!cls.equals(qa.a.class)) {
            return a10;
        }
        return new t9.s();
    }

    @Override // t9.b
    public Set b(t9.r rVar) {
        if (((Set) this.e).contains(rVar)) {
            return ((t9.b) this.f).b(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // t9.b
    public ta.b c(t9.r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((t9.b) this.f).c(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // b4.d
    public int d(long j10) {
        long[] jArr = (long[]) this.c;
        int b10 = g2.n0.b(jArr, j10, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // t9.b
    public t9.p e(t9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((t9.b) this.f).e(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // t9.b
    public ta.b f(Class cls) {
        return c(t9.r.a(cls));
    }

    @Override // t9.b
    public Object g(t9.r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((t9.b) this.f).g(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // cd.a
    public Object get() {
        switch (this.a) {
            case 3:
                return new db.t0((n9.h) ((e.a) this.b).a, (ua.e) ((fb.c) this.c).get(), (gb.l) ((fb.c) this.d).get(), (db.l) ((fb.c) this.e).get(), (fd.h) ((fb.c) this.f).get());
            case 4:
                return new gb.d((db.i1) ((fb.c) this.b).get(), (ua.e) ((fb.c) this.c).get(), (db.b) ((fb.c) this.d).get(), (gb.f) ((fb.c) this.e).get(), (gb.p) ((fb.c) this.f).get());
            default:
                return new s5.a((Executor) ((cd.a) this.b).get(), (o5.d) ((cd.a) this.c).get(), (p7.d) ((p7.d) this.d).get(), (u5.d) ((cd.a) this.e).get(), (v5.c) ((cd.a) this.f).get());
        }
    }

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // b4.d
    public long h(int i3) {
        return ((long[]) this.c)[i3];
    }

    public byte[] i() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = qc1.b;
        BigInteger bigInteger3 = qc1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a10 = qc1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a11 = qc1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = qc1.b(new byte[][]{a11, bArr2, bArr3});
        byte[] b11 = qc1.b(new byte[][]{a11, bArr});
        this.e = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i3 = 0; i3 < 4; i3++) {
            int i10 = i3 * 8;
            arrayList.add(strArr[(int) (((b11[i10 + 7] & 255) | ((((((((b11[i10] & 127) << 56) | ((b11[i10 + 1] & 255) << 48)) | ((b11[i10 + 2] & 255) << 40)) | ((b11[i10 + 3] & 255) << 32)) | ((b11[i10 + 4] & 255) << 24)) | ((b11[i10 + 5] & 255) << 16)) | ((b11[i10 + 6] & 255) << 8))) % hs.e3)]);
        }
        this.f = arrayList;
        org.telegram.messenger.a8.b("wear-auth: built answer; session " + qc1.d(bArr2) + " emojis=" + ((ArrayList) this.f));
        byte[] bArr4 = new byte[hs.L4];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a10, 0, bArr4, 32, 256);
        return bArr4;
    }

    public void j(Canvas canvas, boolean z10, boolean z11, int i3, float f10) {
        RectF rectF = (RectF) this.c;
        float[] fArr = (float[]) this.d;
        Paint paint = (Paint) this.f;
        org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.b;
        Path path = (Path) this.e;
        int i10 = (int) ((z11 ? 0 : (int) b3Var.H) * f10);
        int L = org.telegram.messenger.g0.L(10.0f) * Math.min(1, i10 / org.telegram.messenger.g0.L(60.0f));
        if (i10 <= 0) {
            return;
        }
        fArr[3] = 0.0f;
        fArr[2] = 0.0f;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        float f11 = L;
        fArr[7] = f11;
        fArr[6] = f11;
        fArr[5] = f11;
        fArr[4] = f11;
        path.rewind();
        rectF.set(0.0f, 0.0f, i3, (b3Var.getY() + b3Var.getHeight()) - i10);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z10) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // org.telegram.ui.Components.om0
    public void k(boolean z10, float f10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((py0) this.f).d;
        ry0 ry0Var = (ry0) this.e;
        ry0 ry0Var2 = (ry0) this.c;
        ry0 ry0Var3 = (ry0) this.d;
        boolean isAttachedToWindow = ((pm0) this.b).isAttachedToWindow();
        long j10 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + 104857600) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        if (f10 >= 1.0f) {
            ry0Var2.e(false, isAttachedToWindow);
            ry0Var3.e(false, isAttachedToWindow);
            ry0Var.e(true, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ry0Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            ry0Var2.e(true, isAttachedToWindow);
            ry0Var3.e(false, isAttachedToWindow);
            ry0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ry0Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            ry0Var3.c(org.telegram.messenger.bd.a0("UpToFileSize", null, 2131743833, org.telegram.messenger.g0.i0(j10, true, false)), false, true);
            ry0Var2.e(false, isAttachedToWindow);
            ry0Var3.e(true, isAttachedToWindow);
            ry0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ry0Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z10) {
            saveToGallerySettingsActivity.c0().c = j10;
            saveToGallerySettingsActivity.d0();
        }
    }

    public void m(View view) {
        if (view instanceof GLSurfaceView) {
            this.f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m(viewGroup.getChildAt(i3));
            }
        }
    }

    public t9.p n(Class cls) {
        return e(t9.r.a(cls));
    }

    public void o(q0.a aVar) {
        ai.c0 c0Var = (ai.c0) this.b;
        org.telegram.messenger.ba baVar = new org.telegram.messenger.ba(this, aVar);
        c0Var.getClass();
        p6.m.d("getMapAsync() must be called on the main thread");
        m.o3 o3Var = (m.o3) c0Var.b;
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) o3Var.b;
        if (a0Var != null) {
            a0Var.k(baVar);
        } else {
            ((ArrayList) o3Var.g).add(baVar);
        }
    }

    @Override // b4.d
    public List p(long j10) {
        h4.c cVar = (h4.c) this.b;
        Map map = (Map) this.d;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        cVar.g(j10, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j10, false, cVar.h, treeMap);
        cVar.h(j10, map, hashMap, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                h4.e eVar = (h4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new f2.b(null, null, null, decodeByteArray, eVar.c, 0, eVar.e, eVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, eVar.f, eVar.g, false, -16777216, eVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            h4.e eVar2 = (h4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
            f2.a aVar = (f2.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (h4.a aVar2 : (h4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), h4.a.class)) {
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

    @Override // org.telegram.ui.Components.om0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean r() {
        return true;
    }

    public boolean s() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        n9.h hVar = (n9.h) this.c;
        hVar.a();
        Context context = hVar.a;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (bundle = (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)).metaData) == null || !bundle.containsKey("firebase_messaging_installation_id_enabled")) {
                return false;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_installation_id_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // b4.d
    public int t() {
        return ((long[]) this.c).length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void u(int i3, int i10, Intent intent) {
        FileOutputStream fileOutputStream;
        s61 s61Var = (s61) this.e;
        if (i10 == -1) {
            FileOutputStream fileOutputStream2 = null;
            if (i3 != 10) {
                if (i3 != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.f = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = org.telegram.messenger.zb.K(null, intent.getData(), (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) this.f));
                    s61Var.b((File) this.f, K, false);
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            org.telegram.messenger.g0.e((String) this.b);
            try {
                this.f = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                Point c13 = org.telegram.messenger.g0.c1();
                Bitmap K2 = org.telegram.messenger.zb.K((String) this.b, null, (float) c13.x, (float) c13.y, true);
                fileOutputStream = new FileOutputStream((File) this.f);
                try {
                    try {
                        K2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        s61Var.b((File) this.f, K2, false);
                    } catch (Exception e11) {
                        e = e11;
                        org.telegram.messenger.a8.g(e, true);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = fileOutputStream;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (Exception e12) {
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    }
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (fileOutputStream2 != null) {
                }
                throw th;
            }
            try {
                fileOutputStream.close();
            } catch (Exception e14) {
                org.telegram.messenger.a8.g(e14, true);
            }
            this.b = null;
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean v() {
        return false;
    }

    public void w() {
        ai.c0 c0Var = (ai.c0) this.b;
        m.o3 o3Var = (m.o3) c0Var.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            o3Var.getClass();
            o3Var.b(new z6.d(o3Var, 0));
            if (((android.support.v4.media.session.a0) o3Var.b) == null) {
                m.o3.a(c0Var);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void x() {
        m.o3 o3Var = (m.o3) ((ai.c0) this.b).b;
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) o3Var.b;
        if (a0Var == null) {
            while (!((LinkedList) o3Var.c).isEmpty() && ((z6.d) ((LinkedList) o3Var.c).getLast()).a() >= 1) {
                ((LinkedList) o3Var.c).removeLast();
            }
        } else {
            try {
                k8.f fVar = (k8.f) a0Var.c;
                fVar.T0(fVar.P0(), 5);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    public void y() {
        m.o3 o3Var = (m.o3) ((ai.c0) this.b).b;
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) o3Var.b;
        if (a0Var == null) {
            while (!((LinkedList) o3Var.c).isEmpty() && ((z6.d) ((LinkedList) o3Var.c).getLast()).a() >= 5) {
                ((LinkedList) o3Var.c).removeLast();
            }
        } else {
            try {
                k8.f fVar = (k8.f) a0Var.c;
                fVar.T0(fVar.P0(), 4);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        gi.m5 m5Var = (gi.m5) this.f;
        ug.q1 q1Var = m5Var.K1;
        if (q1Var == null) {
            return;
        }
        q1Var.s(n0Var, true);
        m5Var.L0(false);
    }

    public ke(com.google.android.gms.internal.cast.n0 n0Var, com.google.android.gms.internal.cast.c cVar, String str) {
        this.a = 2;
        this.b = n0Var;
        this.c = cVar;
        this.d = str;
        this.f = new com.google.android.gms.internal.cast.m4(this);
    }

    public /* synthetic */ ke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ke(Context context) {
        this(context, new g6.b(-1, 0, 0));
        this.a = 7;
    }

    public ke(Context context, n9.h hVar, ua.e eVar, l2.e eVar2, org.telegram.ui.ActionBar.h4 h4Var) {
        this.a = 22;
        this.b = new n7.d(context, n7.d.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
        this.c = hVar;
        this.d = eVar;
        this.e = eVar2;
        this.f = h4Var;
    }

    public ke(Context context, g6.b bVar) {
        this.a = 7;
        this.b = context;
        this.c = bVar;
        N();
    }

    public ke(View view, View view2) {
        this.a = 19;
        this.b = view;
        this.c = view2;
    }

    public ke(t9.a aVar, t9.b bVar) {
        this.a = 18;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<t9.j> set = aVar.c;
        Set set2 = aVar.g;
        for (t9.j jVar : set) {
            int i3 = jVar.c;
            int i10 = jVar.b;
            boolean z10 = i3 == 0;
            t9.r rVar = jVar.a;
            if (z10) {
                if (i10 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i3 == 2) {
                hashSet3.add(rVar);
            } else if (i10 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(t9.r.a(qa.a.class));
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
        this.c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f = bVar;
    }

    @Override // org.telegram.ui.Components.om0
    public void D() {
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void J() {
    }

    public ke(h4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 6;
        this.b = cVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i3 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i3] = ((Long) it.next()).longValue();
            i3++;
        }
        this.c = jArr;
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }

    public ke(Activity activity, WallpapersListActivity wallpapersListActivity, s61 s61Var) {
        this.a = 13;
        this.c = activity;
        this.d = wallpapersListActivity;
        this.e = s61Var;
    }

    public ke(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 23;
        this.e = new ArrayDeque();
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.d = ",";
        this.f = scheduledThreadPoolExecutor;
    }

    public ke(byte[] bArr, byte[] bArr2, String str) {
        this.a = 16;
        this.b = bArr;
        this.c = bArr2;
        this.d = str;
    }

    public ke() {
        this.a = 8;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = df.g.p;
    }

    public ke(mh.c cVar) {
        this.a = 9;
        this.f = cVar;
        xq xqVar = xq.h;
        this.d = new qe.a(0, this, xqVar, 320L, true);
        this.e = new qe.a(1, this, xqVar, 320L, true);
    }

    public ke(py0 py0Var, pm0 pm0Var, ry0 ry0Var, ry0 ry0Var2, ry0 ry0Var3) {
        this.a = 15;
        this.f = py0Var;
        this.b = pm0Var;
        this.c = ry0Var;
        this.d = ry0Var2;
        this.e = ry0Var3;
    }

    public ke(org.telegram.ui.ActionBar.b3 b3Var) {
        this.a = 11;
        this.c = new RectF();
        this.d = new float[8];
        this.e = new Path();
        this.f = new Paint(1);
        this.b = b3Var;
    }

    public ke(gi.m5 m5Var, org.telegram.ui.Components.ba baVar, Paint paint) {
        this.a = 5;
        this.f = m5Var;
        this.d = baVar;
        this.e = paint;
        this.c = new Path();
    }
}
