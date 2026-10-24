package ci;

import android.content.Context;
import android.content.IntentFilter;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u7(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q3 q3Var;
        o4 o4Var;
        PowerManager.WakeLock wakeLock;
        int i10;
        int i11;
        int i12;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        switch (this.a) {
            case 0:
                ((v7) this.b).j((ArrayList) this.c);
                return;
            case 1:
                ((h6) this.b).b.f = (LongSparseIntArray) this.c;
                return;
            case 2:
                y7 y7Var = (y7) this.b;
                Runnable runnable = (Runnable) this.c;
                if (y7Var.b) {
                    return;
                }
                runnable.run();
                return;
            case 3:
                Runnable[] runnableArr = (Runnable[]) this.b;
                y7 y7Var2 = (y7) this.c;
                runnableArr[0] = null;
                ((u7) y7Var2.d).run();
                w7 w7Var = (w7) y7Var2.e;
                if (w7Var != null) {
                    w7Var.onDetachedFromWindow();
                    return;
                }
                return;
            case 4:
                x7 x7Var = (x7) this.b;
                View view = (View) this.c;
                x7Var.getClass();
                try {
                    view.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                yc ycVar = x7Var.H;
                if (ycVar != null) {
                    ycVar.c(false);
                }
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
                }
                x7Var.N = false;
                x7Var.e();
                return;
            case 5:
                p8 p8Var = (p8) this.b;
                z90 z90Var = (z90) this.c;
                z90 z90Var2 = p8Var.a;
                if (z90Var != z90Var2 || z90Var2 == null) {
                    return;
                }
                CharacterStyle characterStyle = z90Var2.i;
                if (characterStyle instanceof URLSpan) {
                    q8 q8Var = p8Var.v;
                    v90 v90Var = p8Var.c;
                    Objects.requireNonNull(v90Var);
                    q8Var.J.H((URLSpan) characterStyle, q8Var, new androidx.fragment.app.d(v90Var, 22));
                    p8Var.a = null;
                    return;
                }
                return;
            case 6:
                d9 d9Var = (d9) this.b;
                ei.x3 x3Var = (ei.x3) this.c;
                d9Var.d.removeView(x3Var);
                if (x3Var == d9Var.c) {
                    d9Var.b = null;
                    d9Var.invalidate();
                    d9Var.b(false);
                    return;
                }
                return;
            case 7:
                q9 q9Var = (q9) this.b;
                y9 y9Var = (y9) this.c;
                z9 z9Var = q9Var.d;
                p4 currentPeerView = z9Var.n0.getCurrentPeerView();
                if (currentPeerView == null || (q3Var = currentPeerView.c1) == null || (o4Var = z9Var.G0) == null || ((y9) o4Var.c) != y9Var) {
                    return;
                }
                q3Var.invalidate();
                return;
            case 8:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                a6.i iVar = FirebaseMessaging.l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 9:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource2.setResult(mVar.a());
                    return;
                } catch (Exception e7) {
                    taskCompletionSource2.setException(e7);
                    return;
                }
            case 10:
                d1.e eVar = (d1.e) this.b;
                v0.f fVar = (v0.f) this.c;
                v0.i iVar2 = eVar.f;
                if (iVar2 != null) {
                    iVar2.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 11:
                da.c cVar = (da.c) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    l5.t.a().d.e(cVar.h.a.b(i5.d.c), 1);
                } catch (SQLException unused2) {
                }
                countDownLatch.countDown();
                return;
            case 12:
                di.v vVar = (di.v) this.b;
                String str = (String) this.c;
                ArrayList arrayList = vVar.f;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                    } else if (!TextUtils.equals(((s6) arrayList.get(i15)).E, str)) {
                        i15++;
                    }
                }
                if (i15 >= 0) {
                    vVar.r.d(str.hashCode(), i15 + 1);
                    return;
                }
                return;
            case 13:
                ((v0.i) this.b).onError((w0.d) this.c);
                return;
            case 14:
                ((v0.i) this.b).onResult((v0.f) this.c);
                return;
            case 15:
                e1.e eVar2 = (e1.e) this.b;
                v0.c cVar2 = (v0.c) this.c;
                v0.i iVar3 = eVar2.f;
                if (iVar3 != null) {
                    iVar3.onResult(cVar2);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 16:
                e2.c cVar3 = (e2.c) this.b;
                Object apply = ((i2.v) this.c).apply(cVar3.f);
                cVar3.f = apply;
                e2.b bVar = new e2.b(cVar3, apply, i14);
                e2.i0 i0Var = (e2.i0) cVar3.c;
                if (i0Var.a.getLooper().getThread().isAlive()) {
                    i0Var.d(bVar);
                    return;
                }
                return;
            case 17:
                e2.w wVar = (e2.w) this.b;
                Context context = (Context) this.c;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new androidx.mediarouter.app.f(wVar, i13), intentFilter);
                return;
            case 18:
                androidx.mediarouter.app.f fVar2 = (androidx.mediarouter.app.f) this.b;
                Context context2 = (Context) this.c;
                e2.w wVar2 = (e2.w) fVar2.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i13 = type != 9 ? 8 : 7;
                                        }
                                        i13 = 5;
                                    }
                                }
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i13 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i13 = 4;
                                    break;
                                case 13:
                                    i13 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i13 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i13 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i13 = 1;
                        }
                    } catch (SecurityException unused3) {
                    }
                    if (Build.VERSION.SDK_INT >= 31 || i13 != 5) {
                        wVar2.c(i13);
                        return;
                    } else {
                        e2.u.a(context2, wVar2);
                        return;
                    }
                }
                i13 = 0;
                if (Build.VERSION.SDK_INT >= 31) {
                }
                wVar2.c(i13);
                return;
            case 19:
                j9.e0 e0Var = (j9.e0) this.b;
                j9.y yVar = (j9.y) this.c;
                if (e0Var.a instanceof j9.a) {
                    yVar.cancel(false);
                    return;
                }
                return;
            case 20:
                ac.a aVar = (ac.a) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                qf.b bVar2 = (qf.b) aVar.c;
                bVar2.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new u7(21, bVar2, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 21:
                qf.b bVar3 = (qf.b) this.b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
                synchronized (bVar3) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) bVar3.c) != null) {
                        wakeLock.release();
                    }
                }
                return;
            case 22:
                ei.d dVar = (ei.d) this.b;
                org.telegram.ui.Cells.g gVar = (org.telegram.ui.Cells.g) this.c;
                int i16 = dVar.I - 1;
                dVar.I = i16;
                dVar.b(i16, true);
                if (dVar.I > 0) {
                    AndroidUtilities.runOnUIThread(dVar.J, 1000L);
                    return;
                } else {
                    dVar.setClickable(true);
                    gVar.run();
                    return;
                }
            case 23:
                ((Utilities.Callback) this.b).run((ArrayList) this.c);
                return;
            case 24:
                ei.t1 t1Var = (ei.t1) this.b;
                TLObject tLObject = (TLObject) this.c;
                ei.v1 v1Var = t1Var.s;
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    ei.n2 n2Var = v1Var.r;
                    i10 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                    MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                    i11 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                    MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                    i12 = ((org.telegram.ui.ActionBar.h3) n2Var).currentAccount;
                    MessagesStorage.getInstance(i12).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                }
                t1Var.n = true;
                t1Var.G();
                return;
            case 25:
                ((ei.s2) this.b).e(0.0f, 240L, (Runnable) this.c);
                return;
            case 26:
                ei.f6 f6Var = (ei.f6) this.b;
                View view2 = (View) this.c;
                f6Var.getClass();
                if (view2 instanceof rg.j) {
                    rg.j jVar = (rg.j) view2;
                    jVar.m();
                    f6Var.B0(jVar, true);
                    return;
                }
                return;
            case 27:
                TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) this.b;
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = (TL_stories.TL_mediaAreaGeoPoint) this.c;
                try {
                    List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                    if (fromLocationName.size() <= 0) {
                        return;
                    }
                    tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                    tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 28:
                ((Utilities.Callback) this.b).run((Bitmap) this.c);
                return;
            default:
                ei.r6.a((ei.r6) this.b, (ei.a8) this.c);
                return;
        }
    }
}
