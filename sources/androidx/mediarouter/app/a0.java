package androidx.mediarouter.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a0 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public a0(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.c;
                d0 d0Var = b0Var.z.r;
                p4.v vVar = (p4.v) this.b;
                d0Var.y = vVar;
                vVar.l();
                b0Var.w.setVisibility(4);
                b0Var.x.setVisibility(0);
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

    public a0(b0 b0Var, p4.v vVar) {
        this.c = b0Var;
        this.b = vVar;
    }
}
