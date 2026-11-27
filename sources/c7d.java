// default package

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class c7d extends b99 {
    public final Context a;
    public final /* synthetic */ i05 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7d(i05 i05Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), (byte) 1);
        this.b = i05Var;
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
        int i2 = j05.a;
        i05 i05Var = this.b;
        Context context = this.a;
        int c = i05Var.c(context, i2);
        int i3 = c15.e;
        if (c == 1 || c == 2 || c == 3 || c == 9) {
            Intent a = i05Var.a(c, context, "n");
            i05Var.g(context, c, a == null ? null : PendingIntent.getActivity(context, 0, a, 201326592));
        }
    }
}
