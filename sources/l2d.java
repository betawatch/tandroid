// default package

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class l2d extends o59 {
    public final Context a;
    public final /* synthetic */ cy4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2d(cy4 cy4Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte) 1);
        this.b = cy4Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = dy4.a;
        cy4 cy4Var = this.b;
        Context context = this.a;
        int c = cy4Var.c(context, i2);
        int i3 = yy4.e;
        if (c == 1 || c == 2 || c == 3 || c == 9) {
            Intent a = cy4Var.a(c, context, "n");
            cy4Var.g(context, c, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
