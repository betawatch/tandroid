package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe1 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh.d b;

    public /* synthetic */ oe1(vh.d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.f8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
            default:
                org.telegram.messenger.f8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
        }
    }
}
