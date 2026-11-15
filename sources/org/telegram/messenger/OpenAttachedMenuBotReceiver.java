package org.telegram.messenger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class OpenAttachedMenuBotReceiver extends Activity {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        if (intent.getAction() == null || !intent.getAction().startsWith("com.tmessages.openshortcutbot")) {
            finish();
            return;
        }
        try {
            if (intent.getLongExtra("botId", 0L) == 0) {
                return;
            }
            Intent intent2 = new Intent(this, (Class<?>) LaunchActivity.class);
            intent2.setAction(intent.getAction());
            intent2.putExtras(intent);
            startActivity(intent2);
            finish();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }
}
