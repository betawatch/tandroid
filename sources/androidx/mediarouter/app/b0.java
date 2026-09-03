package androidx.mediarouter.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public b0(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.c;
                e0 e0Var = c0Var.z.r;
                c2.b0 b0Var = (c2.b0) this.b;
                e0Var.y = b0Var;
                b0Var.l();
                c0Var.w.setVisibility(4);
                c0Var.x.setVisibility(0);
                break;
            default:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
        }
    }

    public b0(c0 c0Var, c2.b0 b0Var) {
        this.c = c0Var;
        this.b = b0Var;
    }
}
