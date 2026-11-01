package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class ShareActivity extends Activity {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Components.pp0 a;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.w0.w();
        org.telegram.messenger.i0.v(this, getResources().getConfiguration());
        org.telegram.messenger.i0.w3(getWindow());
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
        SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("botshare", 0);
        String string = sharedPreferences.getString(queryParameter + "_m", null);
        if (TextUtils.isEmpty(string)) {
            finish();
            return;
        }
        SerializedData serializedData = new SerializedData(Utilities.v(string));
        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        if (TLdeserialize == null) {
            finish();
            return;
        }
        TLdeserialize.readAttachPath(serializedData, 0L);
        serializedData.cleanup();
        String string2 = sharedPreferences.getString(queryParameter + "_link", null);
        org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(org.telegram.messenger.e20.s0, TLdeserialize, false, true);
        kjVar.k.with_my_score = true;
        try {
            org.telegram.ui.Components.pp0 N0 = org.telegram.ui.Components.pp0.N0(this, kjVar, null, false, string2);
            this.a = N0;
            N0.setCanceledOnTouchOutside(true);
            this.a.setOnDismissListener(new q5(this, 15));
            this.a.show();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            org.telegram.ui.Components.pp0 pp0Var = this.a;
            if (pp0Var == null || !pp0Var.isShowing()) {
                return;
            }
            this.a.dismiss();
            this.a = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
