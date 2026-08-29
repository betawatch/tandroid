package org.telegram.ui.ActionBar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.c = intent;
        this.d = context;
        this.b = z10;
        this.e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.e;
                if (actionBarLayout.e != this) {
                    return;
                }
                actionBarLayout.e = null;
                o2 o2Var = (o2) this.c;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationStart(false, false);
                }
                ((o2) this.d).onTransitionAnimationStart(true, false);
                actionBarLayout.d0(true, true, this.b);
                return;
            default:
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
        }
    }

    public w(ActionBarLayout actionBarLayout, o2 o2Var, o2 o2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.c = o2Var;
        this.d = o2Var2;
        this.b = z10;
    }
}
