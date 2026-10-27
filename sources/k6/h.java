package k6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.r2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                r2 r2Var = (r2) this.c;
                if (r2Var != null) {
                    r2Var.onTransitionAnimationStart(false, false);
                }
                ((r2) this.d).onTransitionAnimationStart(true, false);
                actionBarLayout.g0(true, true, this.b);
                return;
        }
    }

    public h(ActionBarLayout actionBarLayout, r2 r2Var, r2 r2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.c = r2Var;
        this.d = r2Var2;
        this.b = z10;
    }
}
