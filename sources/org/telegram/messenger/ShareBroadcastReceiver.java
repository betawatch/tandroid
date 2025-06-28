package org.telegram.messenger;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
public class ShareBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.setType("text/plain");
            intent2.putExtra("android.intent.extra.TEXT", dataString);
            Intent createChooser = Intent.createChooser(intent2, LocaleController.getString(R.string.ShareLink));
            createChooser.setFlags(TLRPC.FLAG_28);
            context.startActivity(createChooser);
        }
    }
}
