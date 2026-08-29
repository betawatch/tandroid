package androidx.mediarouter.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public y(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z zVar = (z) this.c;
                b0 b0Var = zVar.z.r;
                c2.b0 b0Var2 = (c2.b0) this.b;
                b0Var.y = b0Var2;
                b0Var2.l();
                zVar.w.setVisibility(4);
                zVar.x.setVisibility(0);
                break;
            default:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                    break;
                } catch (ActivityNotFoundException e10) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
                    return;
                }
        }
    }

    public y(z zVar, c2.b0 b0Var) {
        this.c = zVar;
        this.b = b0Var;
    }
}
