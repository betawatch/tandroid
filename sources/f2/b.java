package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h2.i0;
import l2.z;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {
    public final z a;
    public final i0 b;
    public final /* synthetic */ ab.q c;

    public b(ab.q qVar, i0 i0Var, z zVar) {
        this.c = qVar;
        this.b = i0Var;
        this.a = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.b.d(new a(this, 1));
        }
    }
}
