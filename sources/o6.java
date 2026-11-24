// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o6(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z;
        this.e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Executor executor;
        switch (this.a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.e;
                if (actionBarLayout.e == this) {
                    actionBarLayout.e = null;
                    d dVar = (d) this.c;
                    if (dVar != null) {
                        dVar.onTransitionAnimationStart(false, false);
                    }
                    ((d) this.d).onTransitionAnimationStart(true, false);
                    actionBarLayout.g0(true, true, this.b);
                    return;
                }
                return;
            default:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i2 = 500;
                        if (intent.getExtras() != null) {
                            aj2 aj2Var = new aj2(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                executor = softReference != null ? (Executor) softReference.get() : null;
                                if (executor == null) {
                                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new kn7("pscm-ack-executor"));
                                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                                    executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                    FirebaseInstanceIdReceiver.b = new SoftReference(executor);
                                }
                            }
                            executor.execute(new ey1(context, aj2Var, countDownLatch, false, (byte) 9));
                            try {
                                i2 = ((Integer) Tasks.await(new lv6(context).F(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        i = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
        }
    }

    public o6(ActionBarLayout actionBarLayout, d dVar, d dVar2, boolean z) {
        this.e = actionBarLayout;
        this.c = dVar;
        this.d = dVar2;
        this.b = z;
    }
}
