package a8;

import a8.r7;
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
import org.telegram.messenger.gc;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.xq;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.cz0;
import org.telegram.ui.ez0;
import org.telegram.ui.ky0;
import org.telegram.ui.om0;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class r7 implements ii0, ib.b, c4.d, te.b, org.telegram.messenger.za, mm0, q5.b, u9.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public /* synthetic */ r7(int i7, byte b10) {
        this.a = i7;
    }

    public static void K(r7 r7Var, com.google.android.gms.internal.cast.s6 s6Var) {
        int i7 = s6Var.e;
        if (i7 == 2 && ((com.google.android.gms.internal.cast.r6) r7Var.e) != null) {
            r7Var.O();
        }
        if (i7 == 2) {
            r7Var.e = new com.google.android.gms.internal.cast.r6((com.google.android.gms.internal.cast.m0) r7Var.b, (String) r7Var.d);
        } else {
            r7Var.e = r7Var.N();
        }
        com.google.android.gms.internal.cast.r6 r6Var = (com.google.android.gms.internal.cast.r6) r7Var.e;
        q6.m.g(r6Var);
        s6Var.d = r6Var.h;
        r6Var.b.add(s6Var);
    }

    public static r7 m(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        r7 r7Var = new r7(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) r7Var.e)) {
            try {
                ((ArrayDeque) r7Var.e).clear();
                String string = ((SharedPreferences) r7Var.b).getString((String) r7Var.c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) r7Var.d)) {
                    String[] split = string.split((String) r7Var.d, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) r7Var.e).add(str);
                        }
                    }
                    return r7Var;
                }
                return r7Var;
            } finally {
            }
        }
    }

    public static Exception q(Task task) {
        return task.getException() != null ? task.getException() : new ExecutionException(new RuntimeException("Unexpected Error"));
    }

    public void A() {
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.d;
        if (f2Var == null) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) this.c).startActivityForResult(intent, 11);
            return;
        }
        Activity parentActivity = f2Var.getParentActivity();
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
        om0 om0Var = new om0(2, false, false, null);
        om0Var.y = false;
        om0Var.V = new vy(this, 6);
        f2Var.presentFragment(om0Var);
    }

    public String B() {
        String str;
        synchronized (((ArrayDeque) this.e)) {
            str = (String) ((ArrayDeque) this.e).peek();
        }
        return str;
    }

    public Task C() {
        Task forException;
        int i7;
        boolean r10 = r();
        if (r10 && ((ab.v) this.f).c() >= 261200000) {
            final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new f5.r("Firebase-Messaging-Network-Io"));
            final int i10 = 1;
            Task continueWithTask = ((va.c) ((va.d) this.d)).f().continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: ab.s
                public final /* synthetic */ r7 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i11 = i10;
                    ExecutorService executorService = newSingleThreadExecutor;
                    r7 r7Var = this.b;
                    switch (i11) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            o9.g gVar = (o9.g) r7Var.c;
                            gVar.a();
                            o9.i iVar = gVar.c;
                            String str3 = iVar.a;
                            gVar.a();
                            m6.b bVar = new m6.b(v.b(gVar), iVar.b, str3, str, str2);
                            o7.d dVar = (o7.d) r7Var.b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new n6.c[]{m6.i.a};
                            b10.c = new j2.n(dVar, bVar, false, 10);
                            b10.a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new t(str, (int) (0 == true ? 1 : 0)));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(r7.q(task)) : ((va.c) ((va.d) r7Var.d)).e().continueWithTask(executorService, new t(r7Var, ((va.a) task.getResult()).a));
                    }
                }
            });
            final int i11 = 0;
            return continueWithTask.continueWithTask(newSingleThreadExecutor, new Continuation(this) { // from class: ab.s
                public final /* synthetic */ r7 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    int i112 = i11;
                    ExecutorService executorService = newSingleThreadExecutor;
                    r7 r7Var = this.b;
                    switch (i112) {
                        case 0:
                            if (!task.isSuccessful()) {
                                return Tasks.forException(r7.q(task));
                            }
                            String str = (String) ((Pair) task.getResult()).first;
                            String str2 = (String) ((Pair) task.getResult()).second;
                            o9.g gVar = (o9.g) r7Var.c;
                            gVar.a();
                            o9.i iVar = gVar.c;
                            String str3 = iVar.a;
                            gVar.a();
                            m6.b bVar = new m6.b(v.b(gVar), iVar.b, str3, str, str2);
                            o7.d dVar = (o7.d) r7Var.b;
                            dVar.getClass();
                            com.google.android.gms.common.api.internal.s b10 = com.google.android.gms.common.api.internal.t.b();
                            b10.d = new n6.c[]{m6.i.a};
                            b10.c = new j2.n(dVar, bVar, false, 10);
                            b10.a = 39001;
                            return dVar.e(0, b10.a()).continueWith(executorService, new t(str, (int) (0 == true ? 1 : 0)));
                        default:
                            return !task.isSuccessful() ? Tasks.forException(r7.q(task)) : ((va.c) ((va.d) r7Var.d)).e().continueWithTask(executorService, new t(r7Var, ((va.a) task.getResult()).a));
                    }
                }
            });
        }
        b8 b8Var = (b8) this.e;
        String b10 = ab.v.b((o9.g) b8Var.a);
        Bundle bundle = new Bundle();
        try {
            b8Var.l(b10, bundle, r10);
            m6.c cVar = (m6.c) b8Var.c;
            m6.d dVar = m6.d.b;
            cc.c cVar2 = cVar.c;
            if (cVar2.i() < 12000000) {
                forException = cVar2.h() != 0 ? cVar.d(bundle).continueWithTask(dVar, new m4.d0(cVar, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
            } else {
                m6.n i12 = m6.n.i(cVar.b);
                synchronized (i12) {
                    i7 = i12.a;
                    i12.a = i7 + 1;
                }
                forException = i12.k(new m6.m(i7, 1, bundle, 1)).continueWith(dVar, qb.a.b);
            }
        } catch (InterruptedException | ExecutionException e10) {
            forException = Tasks.forException(e10);
        }
        return forException.continueWith(new d3.b(3), new a1.c(b8Var, 4));
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ boolean E() {
        return false;
    }

    public boolean G(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.e)) {
            remove = ((ArrayDeque) this.e).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f).execute(new a3.f(this, 1));
            }
        }
        return remove;
    }

    public Set H(Class cls) {
        return g(u9.r.a(cls));
    }

    public void I(Uri uri) {
        int i7;
        Context context = (Context) this.b;
        if (uri == null) {
            J();
            return;
        }
        if (uri.equals((Uri) this.d)) {
            return;
        }
        J();
        this.d = uri;
        h6.b bVar = (h6.b) this.c;
        int i10 = bVar.b;
        if (i10 == 0 || (i7 = bVar.c) == 0) {
            this.e = new i6.b(context, 0, 0, this);
        } else {
            this.e = new i6.b(context, i10, i7, this);
        }
        i6.b bVar2 = (i6.b) this.e;
        q6.m.g(bVar2);
        Uri uri2 = (Uri) this.d;
        q6.m.g(uri2);
        bVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, uri2);
    }

    public void J() {
        i6.b bVar = (i6.b) this.e;
        if (bVar != null) {
            bVar.cancel(true);
            this.e = null;
        }
        this.d = null;
    }

    @Override // org.telegram.ui.Components.ii0
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        Paint paint;
        org.telegram.ui.Components.y9 y9Var;
        Path path = (Path) this.c;
        org.telegram.ui.Components.ca caVar = (org.telegram.ui.Components.ca) this.d;
        Paint paint2 = (Paint) this.e;
        fi.o5 o5Var = (fi.o5) this.f;
        if (!z9 && (y9Var = o5Var.N1) != null && y9Var.c()) {
            if (z9) {
                caVar = (org.telegram.ui.Components.ca) this.b;
            }
            path.rewind();
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            caVar.b(canvas, true);
            paint2.setAlpha((int) (i7 * 0.4f));
            canvas.drawPaint(paint2);
            canvas.restore();
            return;
        }
        if (z9) {
            if (((org.telegram.ui.Components.ca) this.b) == null) {
                this.b = new org.telegram.ui.Components.ca(o5Var.N1, o5Var.I1.getReactionsWindow().c, 0, false);
            }
            float f13 = -f11;
            float f14 = -f12;
            ((org.telegram.ui.Components.ca) this.b).e(f13, f14, o5Var.getMeasuredWidth() + f13, o5Var.getMeasuredHeight() + f14);
            paint = ((org.telegram.ui.Components.ca) this.b).h;
        } else {
            float f15 = -f11;
            float f16 = -f12;
            caVar.e(f15, f16, o5Var.getMeasuredWidth() + f15, o5Var.getMeasuredHeight() + f16);
            paint = caVar.h;
        }
        paint.setAlpha(i7);
        paint2.setAlpha((int) (i7 * 0.4f));
        canvas.drawRoundRect(rectF, f10, f10, paint);
        canvas.drawRoundRect(rectF, f10, f10, paint2);
    }

    public com.google.android.gms.internal.cast.r6 N() {
        if (((com.google.android.gms.internal.cast.r6) this.e) == null) {
            com.google.android.gms.internal.cast.r6 r6Var = new com.google.android.gms.internal.cast.r6((com.google.android.gms.internal.cast.m0) this.b, (String) this.d);
            this.e = r6Var;
            r6Var.b(1);
        }
        return (com.google.android.gms.internal.cast.r6) this.e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void O() {
        int i7;
        com.google.android.gms.internal.cast.o1 o1Var;
        int i10;
        long j3;
        com.google.android.gms.internal.cast.r6 r6Var = (com.google.android.gms.internal.cast.r6) this.e;
        if (r6Var != null) {
            Map map = r6Var.e;
            List<com.google.android.gms.internal.cast.e3> list = r6Var.d;
            List<com.google.android.gms.internal.cast.a> list2 = r6Var.c;
            List<com.google.android.gms.internal.cast.s6> list3 = r6Var.b;
            g6.c cVar = r6Var.j;
            if (cVar != null) {
                cVar.l = null;
                r6Var.j = null;
            }
            long j10 = r6Var.i;
            com.google.android.gms.internal.cast.o1 m10 = com.google.android.gms.internal.cast.p1.m();
            m10.c();
            com.google.android.gms.internal.cast.p1.t((com.google.android.gms.internal.cast.p1) m10.b, j10);
            String str = r6Var.l;
            if (str != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.y((com.google.android.gms.internal.cast.p1) m10.b, str);
            }
            String str2 = r6Var.m;
            if (str2 != null) {
                m10.c();
                com.google.android.gms.internal.cast.p1.u((com.google.android.gms.internal.cast.p1) m10.b, str2);
            }
            com.google.android.gms.internal.cast.h1 l10 = com.google.android.gms.internal.cast.i1.l();
            String str3 = com.google.android.gms.internal.cast.r6.o;
            l10.c();
            com.google.android.gms.internal.cast.i1.n((com.google.android.gms.internal.cast.i1) l10.b, str3);
            String str4 = r6Var.g;
            l10.c();
            com.google.android.gms.internal.cast.i1.m((com.google.android.gms.internal.cast.i1) l10.b, str4);
            com.google.android.gms.internal.cast.i1 i1Var = (com.google.android.gms.internal.cast.i1) l10.a();
            m10.c();
            com.google.android.gms.internal.cast.p1.r((com.google.android.gms.internal.cast.p1) m10.b, i1Var);
            com.google.android.gms.internal.cast.b0 b0Var = r6Var.a;
            com.google.android.gms.internal.cast.u1 l11 = com.google.android.gms.internal.cast.v1.l();
            Object zza = b0Var.zza();
            if (zza != null) {
                com.google.android.gms.internal.cast.g2 l12 = com.google.android.gms.internal.cast.h2.l();
                l12.c();
                com.google.android.gms.internal.cast.h2.m((com.google.android.gms.internal.cast.h2) l12.b, (String) zza);
                com.google.android.gms.internal.cast.h2 h2Var = (com.google.android.gms.internal.cast.h2) l12.a();
                l11.c();
                com.google.android.gms.internal.cast.v1.m((com.google.android.gms.internal.cast.v1) l11.b, h2Var);
            }
            String str5 = r6Var.k;
            if (str5 != null) {
                try {
                    String replace = str5.replace("-", "");
                    j3 = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e10) {
                    j6.b bVar = com.google.android.gms.internal.cast.r6.n;
                    Log.w(bVar.a, bVar.d("receiverSessionId %s is not valid for hash", str5), e10);
                    j3 = 0;
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.n((com.google.android.gms.internal.cast.v1) l11.b, j3);
            }
            if (!list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.cast.s6 s6Var : list3) {
                    s6Var.getClass();
                    com.google.android.gms.internal.cast.s1 l13 = com.google.android.gms.internal.cast.t1.l();
                    int i11 = s6Var.e;
                    l13.c();
                    com.google.android.gms.internal.cast.t1.p((com.google.android.gms.internal.cast.t1) l13.b, i11);
                    int i12 = (int) (s6Var.b - s6Var.d);
                    l13.c();
                    com.google.android.gms.internal.cast.t1.m((com.google.android.gms.internal.cast.t1) l13.b, i12);
                    Integer num = s6Var.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        l13.c();
                        com.google.android.gms.internal.cast.t1.n((com.google.android.gms.internal.cast.t1) l13.b, intValue);
                    }
                    Boolean bool = s6Var.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        l13.c();
                        com.google.android.gms.internal.cast.t1.o((com.google.android.gms.internal.cast.t1) l13.b, booleanValue);
                    }
                    arrayList.add((com.google.android.gms.internal.cast.t1) l13.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.o((com.google.android.gms.internal.cast.v1) l11.b, arrayList);
            }
            int i13 = 2;
            if (list2.isEmpty()) {
                i7 = 1;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.a aVar : list2) {
                    aVar.getClass();
                    com.google.android.gms.internal.cast.y1 l14 = com.google.android.gms.internal.cast.z1.l();
                    int i14 = (int) (aVar.b - aVar.c);
                    l14.c();
                    com.google.android.gms.internal.cast.z1.m((com.google.android.gms.internal.cast.z1) l14.b, i14);
                    int i15 = aVar.a;
                    int i16 = i15 != 1 ? i15 != 2 ? i15 != 3 ? 1 : 4 : 3 : 2;
                    l14.c();
                    com.google.android.gms.internal.cast.z1.n((com.google.android.gms.internal.cast.z1) l14.b, i16);
                    arrayList2.add((com.google.android.gms.internal.cast.z1) l14.a());
                }
                i7 = 1;
                l11.c();
                com.google.android.gms.internal.cast.v1.q((com.google.android.gms.internal.cast.v1) l11.b, arrayList2);
            }
            if (list.isEmpty()) {
                o1Var = m10;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.e3 e3Var : list) {
                    String str6 = e3Var.a;
                    com.google.android.gms.internal.cast.q1 l15 = com.google.android.gms.internal.cast.r1.l();
                    switch (str6.hashCode()) {
                        case -1189611734:
                            if (str6.equals("queueInsert")) {
                                i10 = 13;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -1109843021:
                            if (str6.equals("launch")) {
                                i10 = 22;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -940430091:
                            if (str6.equals("queueRemove")) {
                                i10 = 15;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -936597225:
                            if (str6.equals("queueFetchItems")) {
                                i10 = 19;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -930425472:
                            if (str6.equals("setPlaybackDevices")) {
                                i10 = 23;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -921113364:
                            if (str6.equals("volume-mute")) {
                                i10 = 9;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -900560382:
                            if (str6.equals("skipAd")) {
                                i10 = 21;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -892481550:
                            if (str6.equals("status")) {
                                i10 = 10;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -844665542:
                            if (str6.equals("queueUpdate")) {
                                i10 = 14;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -810883302:
                            if (str6.equals("volume")) {
                                i10 = 7;
                                break;
                            }
                            i10 = i7;
                            break;
                        case -402284771:
                            if (str6.equals("setPlaybackRate")) {
                                i10 = 20;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 3327206:
                            if (str6.equals("load")) {
                                i10 = i13;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 3363353:
                            if (str6.equals("mute")) {
                                i10 = 8;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 3443508:
                            if (str6.equals("play")) {
                                i10 = 3;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 3526264:
                            if (str6.equals("seek")) {
                                i10 = 6;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 3540994:
                            if (str6.equals("stop")) {
                                i10 = 5;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 106440182:
                            if (str6.equals("pause")) {
                                i10 = 4;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 525402049:
                            if (str6.equals("queueFetchItemRange")) {
                                i10 = 18;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 913357482:
                            if (str6.equals("queueReorder")) {
                                i10 = 16;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 1148867366:
                            if (str6.equals("trackStyle")) {
                                i10 = 12;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 1451542318:
                            if (str6.equals("activeTracks")) {
                                i10 = 11;
                                break;
                            }
                            i10 = i7;
                            break;
                        case 1873161788:
                            if (str6.equals("queueFetchItemIds")) {
                                i10 = 17;
                                break;
                            }
                            i10 = i7;
                            break;
                        default:
                            i10 = i7;
                            break;
                    }
                    l15.c();
                    com.google.android.gms.internal.cast.r1.q((com.google.android.gms.internal.cast.r1) l15.b, i10);
                    int i17 = (int) e3Var.b;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.m((com.google.android.gms.internal.cast.r1) l15.b, i17);
                    int i18 = e3Var.c;
                    l15.c();
                    com.google.android.gms.internal.cast.r1.n((com.google.android.gms.internal.cast.r1) l15.b, i18);
                    int i19 = (int) (e3Var.d - e3Var.f);
                    l15.c();
                    com.google.android.gms.internal.cast.r1.o((com.google.android.gms.internal.cast.r1) l15.b, i19);
                    int i20 = (int) (e3Var.e - e3Var.f);
                    l15.c();
                    com.google.android.gms.internal.cast.r1.p((com.google.android.gms.internal.cast.r1) l15.b, i20);
                    arrayList3.add((com.google.android.gms.internal.cast.r1) l15.a());
                    m10 = m10;
                    i13 = 2;
                }
                o1Var = m10;
                l11.c();
                com.google.android.gms.internal.cast.v1.p((com.google.android.gms.internal.cast.v1) l11.b, arrayList3);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                for (com.google.android.gms.internal.cast.b bVar2 : map.values()) {
                    bVar2.getClass();
                    com.google.android.gms.internal.cast.w1 l16 = com.google.android.gms.internal.cast.x1.l();
                    int i21 = bVar2.e;
                    l16.c();
                    com.google.android.gms.internal.cast.x1.p((com.google.android.gms.internal.cast.x1) l16.b, i21);
                    int i22 = bVar2.d.get();
                    l16.c();
                    com.google.android.gms.internal.cast.x1.m((com.google.android.gms.internal.cast.x1) l16.b, i22);
                    int i23 = (int) (bVar2.a - bVar2.c);
                    l16.c();
                    com.google.android.gms.internal.cast.x1.n((com.google.android.gms.internal.cast.x1) l16.b, i23);
                    int i24 = (int) (bVar2.b - bVar2.c);
                    l16.c();
                    com.google.android.gms.internal.cast.x1.o((com.google.android.gms.internal.cast.x1) l16.b, i24);
                    arrayList4.add((com.google.android.gms.internal.cast.x1) l16.a());
                }
                l11.c();
                com.google.android.gms.internal.cast.v1.r((com.google.android.gms.internal.cast.v1) l11.b, arrayList4);
            }
            com.google.android.gms.internal.cast.v1 v1Var = (com.google.android.gms.internal.cast.v1) l11.a();
            o1Var.c();
            com.google.android.gms.internal.cast.p1.q((com.google.android.gms.internal.cast.p1) o1Var.b, v1Var);
            r6Var.f.a((com.google.android.gms.internal.cast.p1) o1Var.a(), TLRPC.LAYER);
            this.e = null;
        }
    }

    @Override // org.telegram.ui.Components.ii0
    public boolean U() {
        return true;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        ((TextView) this.c).setAlpha(org.telegram.messenger.g0.T1(0.5f, 1.0f, ((te.a) this.e).e));
        ((lh.c) this.f).b(this);
    }

    @Override // u9.b
    public Object a(Class cls) {
        if (!((Set) this.b).contains(u9.r.a(cls))) {
            throw new androidx.car.app.j("Attempting to request an undeclared dependency " + cls + ".");
        }
        Object a10 = ((u9.b) this.f).a(cls);
        if (!cls.equals(ra.a.class)) {
            return a10;
        }
        return new u9.s();
    }

    @Override // u9.b
    public u9.p b(u9.r rVar) {
        if (((Set) this.d).contains(rVar)) {
            return ((u9.b) this.f).b(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Deferred<" + rVar + ">.");
    }

    @Override // u9.b
    public ua.b c(Class cls) {
        return f(u9.r.a(cls));
    }

    @Override // c4.d
    public int d(long j3) {
        long[] jArr = (long[]) this.c;
        int b10 = h2.m0.b(jArr, j3, false);
        if (b10 < jArr.length) {
            return b10;
        }
        return -1;
    }

    @Override // u9.b
    public Object e(u9.r rVar) {
        if (((Set) this.b).contains(rVar)) {
            return ((u9.b) this.f).e(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // u9.b
    public ua.b f(u9.r rVar) {
        if (((Set) this.c).contains(rVar)) {
            return ((u9.b) this.f).f(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    @Override // u9.b
    public Set g(u9.r rVar) {
        if (((Set) this.e).contains(rVar)) {
            return ((u9.b) this.f).g(rVar);
        }
        throw new androidx.car.app.j("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 7:
                return new gb.u0((o9.g) ((d9.o) this.b).a, (va.d) ((ib.c) this.c).get(), (jb.l) ((ib.c) this.d).get(), (gb.l) ((ib.c) this.e).get(), (id.h) ((ib.c) this.f).get());
            case 10:
                return new jb.d((gb.j1) ((ib.c) this.b).get(), (va.d) ((ib.c) this.c).get(), (gb.b) ((ib.c) this.d).get(), (jb.f) ((ib.c) this.e).get(), (jb.p) ((ib.c) this.f).get());
            default:
                return new t5.a((Executor) ((fd.a) this.b).get(), (p5.d) ((fd.a) this.c).get(), (ky0) ((ky0) this.d).get(), (v5.d) ((fd.a) this.e).get(), (w5.c) ((fd.a) this.f).get());
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    public byte[] h() {
        byte[] bArr = (byte[]) this.c;
        byte[] bArr2 = (byte[]) this.b;
        SecureRandom secureRandom = new SecureRandom();
        BigInteger bigInteger = new BigInteger(2048, secureRandom);
        BigInteger bigInteger2 = yc1.b;
        BigInteger bigInteger3 = yc1.a;
        BigInteger modPow = bigInteger2.modPow(bigInteger, bigInteger3);
        BigInteger bigInteger4 = BigInteger.ONE;
        if (modPow.compareTo(bigInteger4) <= 0 || modPow.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalStateException("our pubkey invalid (extremely unlikely)");
        }
        byte[] a10 = yc1.a(modPow);
        BigInteger bigInteger5 = new BigInteger(1, bArr);
        if (bigInteger5.compareTo(bigInteger4) <= 0 || bigInteger5.compareTo(bigInteger3.subtract(bigInteger4)) >= 0) {
            throw new IllegalArgumentException("peer pubkey out of range");
        }
        byte[] a11 = yc1.a(bigInteger5.modPow(bigInteger, bigInteger3));
        byte[] bArr3 = new byte[16];
        secureRandom.nextBytes(bArr3);
        byte[] b10 = yc1.b(new byte[][]{a11, bArr2, bArr3});
        byte[] b11 = yc1.b(new byte[][]{a11, bArr});
        this.e = b10;
        String[] strArr = {"👋", "👍", "👎", "👌", "👊", "🤟", "\u1faf5", "👏", "🤝", "✍", "💪", "👀", "👅", "🥶", "🤡", "💀", "👽", "😈", "😎", "🤠", "🤩", "😍", "🤯", "🦄", "🐶", "🐷", "🐔", "🐥", "🦊", "🐙", "🐸", "🐳", "🦉", "🦆", "🐢", "🦖", "🐵", "🐝", "🦁", "🐧", "🦋", "🐬", "🦀", "🐌", "🦠", "🐠", "🌵", "💐", "💐", "🎄", "🍄", "🍔", "🍕", "☕", "🍩", "🍪", "🎂", "🍫", "🍭", "🍎", "🥥", "🍒", "🌶", "🥒", "🥦", "🍇", "🍋", "🍓", "🍌", "🍍", "🍆", "🌽", "🍺", "🍷", "🍾", "🍦", "🍰", "🍞", "🍖", "🌭", "🧊", "🍳", "⭐", "☁", "🚀", "🎈", "💎", "💡", "🔑", "❄", "🔎", "👠", "👕", "👗", "👖", "👙", "👜", "👓", "🎀", "💄", "💍", "♠", "❤", "♦", "♣", "🌈", "🌊", "🎃", "👻", "🎁", "🔮", "🎥", "💿", "💻", "📡", "🔉", "⏳", "🔒", "🚗", "🔱", "🔗", "🎲", "🎮", "⚽", "🎳", "🏁", "🏆", "🎸", "💣", "🚽", "🎹", "🎤", "🎨", "🔫", "💊", "💰", "📦", "📅", "📚", "❗", "❓", "💯", "💦", "💤", "🌍", "🏝", "🚂", "🛢", "🛹", "🚢", "✈", "🛎", "🧳", "🌖", "🌞", "🔥", "🏓", "🎰", "🧸", "\u1faa9", "🎭", "👑", "🎩", "🧢", "🔈", "🔋", "🕯", "✏", "💼", "📌", "✂", "🗑", "🛡", "⚙", "🧲", "\u1fa8f", "⚖", "🧪", "🚪", "\u1fae7", "🛒", "🪑", "🗿", "🏁", "🏴\u200d☠", "📊", "🥁", "🎧", "🎵", "🧩", "⛳", "🥇", "🥈", "🥈", "🌪", "⛺", "🧭", "\u1fac6", "🧠", "💋"};
        ArrayList arrayList = new ArrayList(4);
        for (int i7 = 0; i7 < 4; i7++) {
            int i10 = i7 * 8;
            arrayList.add(strArr[(int) (((b11[i10 + 7] & 255) | ((((((((b11[i10] & 127) << 56) | ((b11[i10 + 1] & 255) << 48)) | ((b11[i10 + 2] & 255) << 40)) | ((b11[i10 + 3] & 255) << 32)) | ((b11[i10 + 4] & 255) << 24)) | ((b11[i10 + 5] & 255) << 16)) | ((b11[i10 + 6] & 255) << 8))) % qs.e3)]);
        }
        this.f = arrayList;
        org.telegram.messenger.a8.b("wear-auth: built answer; session " + yc1.d(bArr2) + " emojis=" + ((ArrayList) this.f));
        byte[] bArr4 = new byte[qs.L4];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 16);
        System.arraycopy(a10, 0, bArr4, 32, 256);
        return bArr4;
    }

    @Override // org.telegram.ui.Components.ii0
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        fi.o5 o5Var = (fi.o5) this.f;
        tg.q1 q1Var = o5Var.J1;
        if (q1Var == null) {
            return;
        }
        q1Var.s(o0Var, true);
        o5Var.L0(false);
    }

    public void j(Canvas canvas, boolean z9, boolean z10, int i7, float f10) {
        RectF rectF = (RectF) this.c;
        float[] fArr = (float[]) this.d;
        Paint paint = (Paint) this.f;
        org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.b;
        Path path = (Path) this.e;
        int i10 = (int) ((z10 ? 0 : (int) d3Var.G) * f10);
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
        rectF.set(0.0f, 0.0f, i7, (d3Var.getY() + d3Var.getHeight()) - i10);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        paint.setAlpha(0);
        if (z9) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(2.0f), 0.0f, org.telegram.messenger.g0.L(1.0f), TLObject.FLAG_28);
            canvas.drawPath(path, paint);
        }
        canvas.clipPath(path);
    }

    @Override // c4.d
    public long k(int i7) {
        return ((long[]) this.c)[i7];
    }

    @Override // org.telegram.ui.Components.mm0
    public void l(boolean z9, float f10) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = ((cz0) this.f).d;
        ez0 ez0Var = (ez0) this.e;
        ez0 ez0Var2 = (ez0) this.c;
        ez0 ez0Var3 = (ez0) this.d;
        boolean isAttachedToWindow = ((nm0) this.b).isAttachedToWindow();
        long j3 = f10 > 0.7f ? (long) ((4089446400L * ((f10 - 0.7f) / 0.3f)) + 104857600) : (long) ((104333312 * (f10 / 0.7f)) + 524288.0f);
        if (f10 >= 1.0f) {
            ez0Var2.e(false, isAttachedToWindow);
            ez0Var3.e(false, isAttachedToWindow);
            ez0Var.e(true, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ez0Var3, false, 0.8f, true, isAttachedToWindow);
        } else if (f10 == 0.0f) {
            ez0Var2.e(true, isAttachedToWindow);
            ez0Var3.e(false, isAttachedToWindow);
            ez0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ez0Var3, false, 0.8f, true, isAttachedToWindow);
        } else {
            ez0Var3.c(id.a0("UpToFileSize", null, 2131743823, org.telegram.messenger.g0.i0(j3, true, false)), false, true);
            ez0Var2.e(false, isAttachedToWindow);
            ez0Var3.e(true, isAttachedToWindow);
            ez0Var.e(false, isAttachedToWindow);
            org.telegram.messenger.g0.Z3(ez0Var3, true, 0.8f, true, isAttachedToWindow);
        }
        if (z9) {
            saveToGallerySettingsActivity.c0().c = j3;
            saveToGallerySettingsActivity.d0();
        }
    }

    public void n(View view) {
        if (view instanceof GLSurfaceView) {
            this.f = (GLSurfaceView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                n(viewGroup.getChildAt(i7));
            }
        }
    }

    public u9.p o(Class cls) {
        return b(u9.r.a(cls));
    }

    public void p(q0.a aVar) {
        bi.x5 x5Var = (bi.x5) this.b;
        org.telegram.messenger.ha haVar = new org.telegram.messenger.ha(this, aVar);
        x5Var.getClass();
        q6.m.d("getMapAsync() must be called on the main thread");
        m.q3 q3Var = (m.q3) x5Var.b;
        h6.m mVar = (h6.m) q3Var.b;
        if (mVar != null) {
            mVar.t(haVar);
        } else {
            ((ArrayList) q3Var.g).add(haVar);
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public /* synthetic */ int q0() {
        return 0;
    }

    public boolean r() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        o9.g gVar = (o9.g) this.c;
        gVar.a();
        Context context = gVar.a;
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

    @Override // c4.d
    public List s(long j3) {
        i4.c cVar = (i4.c) this.b;
        Map map = (Map) this.d;
        HashMap hashMap = (HashMap) this.e;
        HashMap hashMap2 = (HashMap) this.f;
        ArrayList arrayList = new ArrayList();
        cVar.g(j3, cVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j3, false, cVar.h, treeMap);
        cVar.h(j3, map, hashMap, cVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Pair pair = (Pair) obj;
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                i4.e eVar = (i4.e) hashMap.get(pair.first);
                eVar.getClass();
                arrayList2.add(new g2.b(null, null, null, decodeByteArray, eVar.c, 0, eVar.e, eVar.b, 0, TLObject.FLAG_31, -3.4028235E38f, eVar.f, eVar.g, false, -16777216, eVar.j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            i4.e eVar2 = (i4.e) hashMap.get(entry.getKey());
            eVar2.getClass();
            g2.a aVar = (g2.a) entry.getValue();
            CharSequence charSequence = aVar.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (i4.a aVar2 : (i4.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), i4.a.class)) {
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(int i7, int i10, Intent intent) {
        FileOutputStream fileOutputStream;
        b71 b71Var = (b71) this.e;
        if (i10 == -1) {
            FileOutputStream fileOutputStream2 = null;
            if (i7 != 10) {
                if (i7 != 11 || intent == null || intent.getData() == null) {
                    return;
                }
                try {
                    this.f = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
                    Point c12 = org.telegram.messenger.g0.c1();
                    Bitmap K = gc.K(null, intent.getData(), (float) c12.x, (float) c12.y, true);
                    K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) this.f));
                    b71Var.b((File) this.f, K, false);
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
                Bitmap K2 = gc.K((String) this.b, null, (float) c13.x, (float) c13.y, true);
                fileOutputStream = new FileOutputStream((File) this.f);
                try {
                    try {
                        K2.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                        b71Var.b((File) this.f, K2, false);
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

    public void u() {
        bi.x5 x5Var = (bi.x5) this.b;
        m.q3 q3Var = (m.q3) x5Var.b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            q3Var.getClass();
            q3Var.b(new a7.c(q3Var, 0));
            if (((h6.m) q3Var.b) == null) {
                m.q3.a(x5Var);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ boolean v() {
        return true;
    }

    public void w() {
        m.q3 q3Var = (m.q3) ((bi.x5) this.b).b;
        h6.m mVar = (h6.m) q3Var.b;
        if (mVar == null) {
            while (!((LinkedList) q3Var.c).isEmpty() && ((a7.c) ((LinkedList) q3Var.c).getLast()).a() >= 1) {
                ((LinkedList) q3Var.c).removeLast();
            }
        } else {
            try {
                l8.f fVar = (l8.f) mVar.c;
                fVar.t1(fVar.p1(), 5);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    public void x() {
        m.q3 q3Var = (m.q3) ((bi.x5) this.b).b;
        h6.m mVar = (h6.m) q3Var.b;
        if (mVar == null) {
            while (!((LinkedList) q3Var.c).isEmpty() && ((a7.c) ((LinkedList) q3Var.c).getLast()).a() >= 5) {
                ((LinkedList) q3Var.c).removeLast();
            }
        } else {
            try {
                l8.f fVar = (l8.f) mVar.c;
                fVar.t1(fVar.p1(), 4);
            } catch (RemoteException e10) {
                throw new androidx.car.app.j(e10);
            }
        }
    }

    @Override // c4.d
    public int y() {
        return ((long[]) this.c).length;
    }

    public void z() {
        m.q3 q3Var = (m.q3) ((bi.x5) this.b).b;
        q3Var.getClass();
        q3Var.b(new a7.c(q3Var, 1));
    }

    public r7(com.google.android.gms.internal.cast.m0 m0Var, com.google.android.gms.internal.cast.c cVar, String str) {
        this.a = 5;
        this.b = m0Var;
        this.c = cVar;
        this.d = str;
        this.f = new com.google.android.gms.internal.cast.l4(this);
    }

    public /* synthetic */ r7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r7(Context context) {
        this(context, new h6.b(-1, 0, 0));
        this.a = 9;
    }

    public r7(Context context, o9.g gVar, va.d dVar, b8 b8Var, ab.v vVar) {
        this.a = 1;
        this.b = new o7.d(context, o7.d.l, com.google.android.gms.common.api.b.j, com.google.android.gms.common.api.i.c);
        this.c = gVar;
        this.d = dVar;
        this.e = b8Var;
        this.f = vVar;
    }

    public r7(Context context, h6.b bVar) {
        this.a = 9;
        this.b = context;
        this.c = bVar;
        J();
    }

    public r7(u9.a aVar, u9.b bVar) {
        this.a = 22;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<u9.j> set = aVar.c;
        Set set2 = aVar.g;
        for (u9.j jVar : set) {
            int i7 = jVar.c;
            int i10 = jVar.b;
            boolean z9 = i7 == 0;
            u9.r rVar = jVar.a;
            if (z9) {
                if (i10 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i7 == 2) {
                hashSet3.add(rVar);
            } else if (i10 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(u9.r.a(ra.a.class));
        }
        this.b = DesugarCollections.unmodifiableSet(hashSet);
        this.c = DesugarCollections.unmodifiableSet(hashSet2);
        this.d = DesugarCollections.unmodifiableSet(hashSet3);
        this.e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f = bVar;
    }

    @Override // org.telegram.ui.Components.mm0
    public void D() {
    }

    @Override // org.telegram.ui.Components.ii0
    public /* synthetic */ void M() {
    }

    public r7(i4.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 8;
        this.b = cVar;
        this.e = hashMap2;
        this.f = hashMap3;
        this.d = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i7 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i7] = ((Long) it.next()).longValue();
            i7++;
        }
        this.c = jArr;
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }

    public r7(Activity activity, WallpapersListActivity wallpapersListActivity, b71 b71Var) {
        this.a = 16;
        this.c = activity;
        this.d = wallpapersListActivity;
        this.e = b71Var;
    }

    public r7(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.a = 2;
        this.e = new ArrayDeque();
        this.b = sharedPreferences;
        this.c = "topic_operation_queue";
        this.d = ",";
        this.f = scheduledThreadPoolExecutor;
    }

    public r7(byte[] bArr, byte[] bArr2, String str) {
        this.a = 19;
        this.b = bArr;
        this.c = bArr2;
        this.d = str;
    }

    public r7() {
        this.a = 11;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = gf.h.p;
    }

    public r7(lh.c cVar) {
        this.a = 12;
        this.f = cVar;
        xq xqVar = xq.h;
        this.d = new te.a(0, this, xqVar, 320L, true);
        this.e = new te.a(1, this, xqVar, 320L, true);
    }

    public r7(int i7) {
        this.a = 20;
        this.b = new int[i7];
        this.c = new int[i7];
        this.d = new float[i7];
        this.e = new float[i7];
        this.f = new float[i7];
    }

    public r7(cz0 cz0Var, nm0 nm0Var, ez0 ez0Var, ez0 ez0Var2, ez0 ez0Var3) {
        this.a = 18;
        this.f = cz0Var;
        this.b = nm0Var;
        this.c = ez0Var;
        this.d = ez0Var2;
        this.e = ez0Var3;
    }

    public r7(org.telegram.ui.ActionBar.d3 d3Var) {
        this.a = 14;
        this.c = new RectF();
        this.d = new float[8];
        this.e = new Path();
        this.f = new Paint(1);
        this.b = d3Var;
    }

    public r7(fi.o5 o5Var, org.telegram.ui.Components.ca caVar, Paint paint) {
        this.a = 6;
        this.f = o5Var;
        this.d = caVar;
        this.e = paint;
        this.c = new Path();
    }
}
