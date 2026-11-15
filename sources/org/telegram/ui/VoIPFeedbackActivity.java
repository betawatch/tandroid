package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class VoIPFeedbackActivity extends Activity {
    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        getWindow().addFlags(TLObject.FLAG_19);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new View(this));
        org.telegram.ui.Components.voip.c2.k(this, new pu0(this, 23), getIntent().getBooleanExtra("call_video", false), getIntent().getLongExtra("call_id", 0L), getIntent().getLongExtra("call_access_hash", 0L), getIntent().getIntExtra("account", 0), false);
    }
}
