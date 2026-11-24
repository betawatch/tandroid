// default package

import android.content.ContentValues;
import android.net.Uri;
import org.telegram.messenger.GcmPushListenerService;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.SmsReceiver;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class iv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ iv2(fxc fxcVar, String str) {
        this.a = (byte) 9;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Uri parse = Uri.parse(this.b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                a.b.getContentResolver().update(parse, contentValues, null, null);
                return;
            case 1:
                ia4.e(this.b).d(0L);
                return;
            case 2:
                String str = this.b;
                try {
                    fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    fc4.j().a.flush();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 3:
                String str2 = this.b;
                try {
                    fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    fc4.j().a.flush();
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            case 4:
                String str3 = this.b;
                try {
                    fc4.j().a.write(fc4.j().b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    fc4.j().a.flush();
                    return;
                } catch (Exception e3) {
                    e3.printStackTrace();
                    if (gm.D1(e3)) {
                        LaunchActivity.F(1);
                        return;
                    }
                    return;
                }
            case 5:
                String str4 = this.b;
                int i = GcmPushListenerService.n;
                if (e21.a) {
                    fc4.b("Refreshed FCM token: " + str4);
                }
                a.v();
                PushListenerController.sendRegistrationToServer(2, str4);
                return;
            case 6:
                String str5 = this.b;
                l35 l35Var = cle.b;
                if (l35Var == null || !str5.equals(l35Var.d)) {
                    return;
                }
                cle.b.c("STORAGE_CANCELED");
                cle.b.e();
                return;
            case 7:
                String str6 = this.b;
                int i2 = SmsReceiver.a;
                nm7.e().k(nm7.k4, str6);
                return;
            case 8:
                gm.g(this.b);
                return;
            default:
                throw null;
        }
    }

    public /* synthetic */ iv2(String str, byte b) {
        this.a = b;
        this.b = str;
    }
}
