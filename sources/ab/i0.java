package ab;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.v10;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        h0 h0Var;
        Void lambda$emulateSendNFT$20;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.c;
                v vVar = (v) this.d;
                o9.g gVar = (o9.g) this.e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f;
                va.d dVar = (va.d) this.g;
                synchronized (h0.class) {
                    try {
                        WeakReference weakReference = h0.d;
                        h0Var = weakReference != null ? (h0) weakReference.get() : null;
                        if (h0Var == null) {
                            h0 h0Var2 = new h0(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                            h0Var2.b();
                            h0.d = new WeakReference(h0Var2);
                            h0Var = h0Var2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new j0(vVar, h0Var, new android.support.v4.media.session.a0(gVar, firebaseMessaging, dVar, 6), context, scheduledThreadPoolExecutor);
            default:
                lambda$emulateSendNFT$20 = ((WalletEngine2) this.b).lambda$emulateSendNFT$20((AtomicBoolean) this.c, (String) this.d, (String) this.e, (String) this.f, (v10) this.g);
                return lambda$emulateSendNFT$20;
        }
    }
}
