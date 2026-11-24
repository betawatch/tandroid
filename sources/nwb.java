// default package

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class nwb implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nwb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        mwb mwbVar;
        Void lambda$emulateSendNFT$23;
        switch (this.a) {
            case 0:
                Context context = (Context) this.b;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.c;
                kd7 kd7Var = (kd7) this.d;
                jg4 jg4Var = (jg4) this.e;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f;
                rg4 rg4Var = (rg4) this.g;
                synchronized (mwb.class) {
                    WeakReference weakReference = mwb.d;
                    mwbVar = weakReference != null ? (mwb) weakReference.get() : null;
                    if (mwbVar == null) {
                        mwb mwbVar2 = new mwb(context.getSharedPreferences("com.google.android.gms.appid", 0), scheduledThreadPoolExecutor);
                        mwbVar2.b();
                        mwb.d = new WeakReference(mwbVar2);
                        mwbVar = mwbVar2;
                    }
                }
                return new owb(kd7Var, mwbVar, new vk9(jg4Var, firebaseMessaging, rg4Var), context, scheduledThreadPoolExecutor);
            default:
                lambda$emulateSendNFT$23 = ((WalletEngine2) this.b).lambda$emulateSendNFT$23((AtomicBoolean) this.c, (String) this.d, (String) this.e, (String) this.f, (i8c) this.g);
                return lambda$emulateSendNFT$23;
        }
    }
}
