package androidx.mediarouter.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
                } catch (ActivityNotFoundException e7) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e7);
                    return;
                }
        }
    }

    public a0(b0 b0Var, p4.v vVar) {
        this.c = b0Var;
        this.b = vVar;
    }
}
