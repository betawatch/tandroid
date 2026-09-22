package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.Components.voip.f2.k(this, new f01(this, 20), getIntent().getBooleanExtra("call_video", false), getIntent().getLongExtra("call_id", 0L), getIntent().getLongExtra("call_access_hash", 0L), getIntent().getIntExtra("account", 0), false);
    }
}
