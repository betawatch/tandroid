package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ l4(String str, int i7) {
        this.a = i7;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Uri parse = Uri.parse(this.b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                t0.b.getContentResolver().update(parse, contentValues, null, null);
                break;
            case 1:
                String str = this.b;
                try {
                    a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    a8.j().a.flush();
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 2:
                String str2 = this.b;
                try {
                    a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    a8.j().a.flush();
                    break;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            case 3:
                String str3 = this.b;
                try {
                    a8.j().a.write(a8.j().b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    a8.j().a.flush();
                    break;
                } catch (Exception e12) {
                    e12.printStackTrace();
                    if (g0.F1(e12)) {
                        LaunchActivity.D(1);
                        return;
                    }
                    return;
                }
            case 4:
                String str4 = this.b;
                int i7 = GcmPushListenerService.n;
                if (r2.a) {
                    a8.b("Refreshed FCM token: " + str4);
                }
                t0.w();
                PushListenerController.sendRegistrationToServer(2, str4);
                break;
            default:
                String str5 = this.b;
                int i10 = SmsReceiver.a;
                qs.e().k(qs.g4, str5);
                break;
        }
    }
}
