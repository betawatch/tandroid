package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj1 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ci.d b;

    public /* synthetic */ cj1(ci.d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                FileLog.e("wear-auth: /answer send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
            default:
                FileLog.e("wear-auth: /token send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
        }
    }
}
