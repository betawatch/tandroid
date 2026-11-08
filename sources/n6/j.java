package n6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j extends y {
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
        int i7 = message.what;
        if (i7 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i7);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = e.a;
        d dVar = this.b;
        Context context = this.a;
        int d = dVar.d(context, i10);
        AtomicBoolean atomicBoolean = g.a;
        if (d == 1 || d == 2 || d == 3 || d == 9) {
            Intent b10 = dVar.b(d, context, "n");
            dVar.f(context, d, b10 == null ? null : PendingIntent.getActivity(context, 0, b10, 201326592));
        }
    }
}
