package org.telegram.ui.ActionBar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
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
                n2 n2Var = (n2) this.c;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationStart(false, false);
                }
                ((n2) this.d).onTransitionAnimationStart(true, false);
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
                } catch (Throwable th) {
                    pendingResult.finish();
                    throw th;
                }
        }
    }

    public v(ActionBarLayout actionBarLayout, n2 n2Var, n2 n2Var2, boolean z10) {
        this.e = actionBarLayout;
        this.c = n2Var;
        this.d = n2Var2;
        this.b = z10;
    }
}
