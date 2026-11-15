package m6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import f5.s;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z10;
        this.e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i7;
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
                        i7 = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i10 = 500;
                        if (intent.getExtras() != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executor = softReference != null ? (Executor) softReference.get() : null;
                                    if (executor == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executor);
                                    }
                                } finally {
                                }
                            }
                            executor.execute(new a9.h(context, aVar, countDownLatch, 7));
                            try {
                                i10 = ((Integer) Tasks.await(new ab.k(context).b(intent))).intValue();
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
                        i7 = i10;
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(i7);
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
                e2 e2Var = (e2) this.c;
                if (e2Var != null) {
                    e2Var.onTransitionAnimationStart(false, false);
                }
                ((e2) this.d).onTransitionAnimationStart(true, false);
                actionBarLayout.h0(true, true, this.b);
                return;
        }
    }

    public h(ActionBarLayout actionBarLayout, e2 e2Var, e2 e2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.c = e2Var;
        this.d = e2Var2;
        this.b = z10;
    }
}
