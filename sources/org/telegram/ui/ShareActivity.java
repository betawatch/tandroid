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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ShareActivity extends Activity {
    public static final /* synthetic */ int b = 0;
    public org.telegram.ui.Components.oo0 a;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        org.telegram.messenger.t0.w();
        org.telegram.messenger.g0.v(this, getResources().getConfiguration());
        org.telegram.messenger.g0.x3(getWindow());
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
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("botshare", 0);
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
        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, TLdeserialize, false, true);
        ziVar.k.with_my_score = true;
        try {
            org.telegram.ui.Components.oo0 N0 = org.telegram.ui.Components.oo0.N0(this, ziVar, null, false, string2);
            this.a = N0;
            N0.setCanceledOnTouchOutside(true);
            this.a.setOnDismissListener(new s5(this, 15));
            this.a.show();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            org.telegram.ui.Components.oo0 oo0Var = this.a;
            if (oo0Var == null || !oo0Var.isShowing()) {
                return;
            }
            this.a.dismiss();
            this.a = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
