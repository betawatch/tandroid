package a7;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.mediarouter.app.b0;
import androidx.mediarouter.app.z;
import s4.v;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public d(Context context, Intent intent) {
        this.b = context;
        this.c = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                    break;
                } catch (ActivityNotFoundException e10) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e10);
                    return;
                }
            default:
                z zVar = (z) this.c;
                b0 b0Var = zVar.z.r;
                v vVar = (v) this.b;
                b0Var.D = vVar;
                vVar.l();
                zVar.w.setVisibility(4);
                zVar.x.setVisibility(0);
                break;
        }
    }

    public d(z zVar, v vVar) {
        this.c = zVar;
        this.b = vVar;
    }
}
