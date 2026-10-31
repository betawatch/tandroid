package androidx.mediarouter.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public z(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.c;
                c0 c0Var = a0Var.z.r;
                p4.w wVar = (p4.w) this.b;
                c0Var.D = wVar;
                wVar.l();
                a0Var.w.setVisibility(4);
                a0Var.x.setVisibility(0);
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

    public z(a0 a0Var, p4.w wVar) {
        this.c = a0Var;
        this.b = wVar;
    }
}
