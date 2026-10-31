package j6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        switch (this.a) {
            case 0:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    int b10 = intent2 != null ? FirebaseInstanceIdReceiver.b(intent2) : FirebaseInstanceIdReceiver.a(context, intent);
                    if (this.b) {
                        pendingResult.setResultCode(b10);
                    }
                    pendingResult.finish();
                    return;
                } catch (Throwable th2) {
                    pendingResult.finish();
                    throw th2;
                }
            default:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.e;
                if (actionBarLayout.e != this) {
                    return;
                }
                actionBarLayout.e = null;
                k2 k2Var = (k2) this.c;
                if (k2Var != null) {
                    k2Var.onTransitionAnimationStart(false, false);
                }
                ((k2) this.d).onTransitionAnimationStart(true, false);
                actionBarLayout.g0(true, true, this.b);
                return;
        }
    }

    public g(ActionBarLayout actionBarLayout, k2 k2Var, k2 k2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.c = k2Var;
        this.d = k2Var2;
        this.b = z10;
    }
}
