package l6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import e5.r;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z10;
        this.e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i3;
        switch (this.a) {
            case 0:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z10 = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i3 = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i10 = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            Executor executor2 = null;
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    if (softReference != null) {
                                        executor2 = (Executor) softReference.get();
                                    }
                                    if (executor2 == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new r("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor2 = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executor2);
                                    }
                                    executor = executor2;
                                } finally {
                                }
                            }
                            executor.execute(new j1(context, aVar, countDownLatch, false, 6));
                            try {
                                i10 = ((Integer) Tasks.await(new za.g(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e10) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e11) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e11.toString()));
                            }
                        }
                        i3 = i10;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(i3);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.e;
                if (actionBarLayout.e != this) {
                    return;
                }
                actionBarLayout.e = null;
                d2 d2Var = (d2) this.c;
                if (d2Var != null) {
                    d2Var.onTransitionAnimationStart(false, false);
                }
                ((d2) this.d).onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.b);
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, d2 d2Var, d2 d2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.c = d2Var;
        this.d = d2Var2;
        this.b = z10;
    }
}
