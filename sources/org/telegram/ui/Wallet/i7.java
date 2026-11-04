package org.telegram.ui.Wallet;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.n10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void lambda$emulateSendNFT$20;
        za.t tVar;
        switch (this.a) {
            case 0:
                lambda$emulateSendNFT$20 = ((WalletEngine2) this.b).lambda$emulateSendNFT$20((AtomicBoolean) this.c, (String) this.d, (String) this.e, (String) this.f, (n10) this.g);
                return lambda$emulateSendNFT$20;
            default:
                Context context = (Context) this.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.c;
                org.telegram.ui.ActionBar.h4 h4Var = (org.telegram.ui.ActionBar.h4) this.d;
                n9.h hVar = (n9.h) this.e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f;
                ua.e eVar = (ua.e) this.g;
                synchronized (za.t.class) {
                    try {
                        WeakReference weakReference = za.t.d;
                        tVar = weakReference != null ? (za.t) weakReference.get() : null;
                        if (tVar == null) {
                            za.t tVar2 = new za.t(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                            tVar2.b();
                            za.t.d = new WeakReference(tVar2);
                            tVar = tVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new za.u(h4Var, tVar, new z7.q0(hVar, firebaseMessaging, eVar), context, scheduledThreadPoolExecutor);
        }
    }
}
