package m6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.cast.z;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends z {
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
        int i3 = message.what;
        if (i3 != 1) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 39);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i3);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i10 = e.a;
        d dVar = this.b;
        Context context = this.a;
        int d = dVar.d(context, i10);
        int i11 = g.e;
        if (d == 1 || d == 2 || d == 3 || d == 9) {
            Intent b10 = dVar.b(d, context, "n");
            dVar.f(context, d, b10 == null ? null : PendingIntent.getActivity(context, 0, b10, 201326592));
        }
    }
}
