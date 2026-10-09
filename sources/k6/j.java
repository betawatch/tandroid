package k6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class j extends a0 {
    public final Context a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 2);
        this.b = dVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = e.a;
        d dVar = this.b;
        Context context = this.a;
        int d = dVar.d(context, i11);
        AtomicBoolean atomicBoolean = g.a;
        if (d == 1 || d == 2 || d == 3 || d == 9) {
            Intent b10 = dVar.b(context, "n", d);
            dVar.h(context, d, b10 == null ? null : PendingIntent.getActivity(context, 0, b10, 201326592));
        }
    }
}
