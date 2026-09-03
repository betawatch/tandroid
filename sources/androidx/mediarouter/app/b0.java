package androidx.mediarouter.app;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                c2.a0 a0Var = (c2.a0) this.b;
                e0Var.y = a0Var;
                a0Var.l();
                c0Var.w.setVisibility(4);
                c0Var.x.setVisibility(0);
                break;
            default:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                    break;
                } catch (ActivityNotFoundException e6) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e6);
                    return;
                }
        }
    }

    public b0(c0 c0Var, c2.a0 a0Var) {
        this.c = c0Var;
        this.b = a0Var;
    }
}
