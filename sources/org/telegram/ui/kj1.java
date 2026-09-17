package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj1 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ di.d b;

    public /* synthetic */ kj1(di.d dVar, int i10) {
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
