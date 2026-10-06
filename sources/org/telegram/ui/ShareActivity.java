package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class ShareActivity extends Activity {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Components.br0 a;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages_Transparent);
        super.onCreate(bundle);
        setContentView(new View(this), new ViewGroup.LayoutParams(-1, -1));
        Intent intent = getIntent();
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction()) || intent.getData() == null) {
            finish();
            return;
        }
        Uri data = intent.getData();
        String scheme = data.getScheme();
        String uri = data.toString();
        String queryParameter = data.getQueryParameter("hash");
        if (!"tgb".equals(scheme) || !uri.toLowerCase().startsWith("tgb://share_game_score") || TextUtils.isEmpty(queryParameter)) {
            finish();
            return;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
        String string = sharedPreferences.getString(queryParameter + "_m", null);
        if (TextUtils.isEmpty(string)) {
            finish();
            return;
        }
        SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        if (TLdeserialize == null) {
            finish();
            return;
        }
        TLdeserialize.readAttachPath(serializedData, 0L);
        serializedData.cleanup();
        String string2 = sharedPreferences.getString(queryParameter + "_link", null);
        MessageObject messageObject = new MessageObject(UserConfig.selectedAccount, TLdeserialize, false, true);
        messageObject.messageOwner.with_my_score = true;
        try {
            org.telegram.ui.Components.br0 K0 = org.telegram.ui.Components.br0.K0(this, messageObject, null, false, string2);
            this.a = K0;
            K0.setCanceledOnTouchOutside(true);
            this.a.setOnDismissListener(new s5(this, 16));
            this.a.show();
        } catch (Exception e7) {
            FileLog.e(e7);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            org.telegram.ui.Components.br0 br0Var = this.a;
            if (br0Var == null || !br0Var.isShowing()) {
                return;
            }
            this.a.dismiss();
            this.a = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
