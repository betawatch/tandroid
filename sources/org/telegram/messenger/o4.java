package org.telegram.messenger;

import android.content.ContentValues;
import android.net.Uri;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ o4(String str, int i10) {
        this.a = i10;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Uri parse = Uri.parse(this.b);
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_time_contacted", Long.valueOf(System.currentTimeMillis()));
                w0.b.getContentResolver().update(parse, contentValues, null, null);
                break;
            case 1:
                String str = this.b;
                try {
                    f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
                    f8.j().a.flush();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case 2:
                String str2 = this.b;
                try {
                    f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + str2 + "\n");
                    f8.j().a.flush();
                    break;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return;
                }
            case 3:
                String str3 = this.b;
                try {
                    f8.j().a.write(f8.j().b.format(System.currentTimeMillis()) + " D/tmessages: " + str3 + "\n");
                    f8.j().a.flush();
                    break;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    if (i0.F1(e10)) {
                        LaunchActivity.D(1);
                        return;
                    }
                    return;
                }
            case 4:
                String str4 = this.b;
                int i10 = GcmPushListenerService.n;
                if (v2.a) {
                    f8.b("Refreshed FCM token: " + str4);
                }
                w0.w();
                PushListenerController.sendRegistrationToServer(2, str4);
                break;
            default:
                String str5 = this.b;
                int i11 = SmsReceiver.a;
                zs.e().k(zs.g4, str5);
                break;
        }
    }
}
