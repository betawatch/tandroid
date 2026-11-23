package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml b;

    public /* synthetic */ fl(ml mlVar, int i7) {
        this.a = i7;
        this.b = mlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ml.Z(this.b, (org.telegram.messenger.ea) obj);
                break;
            default:
                ml.X(this.b, (Location) obj);
                break;
        }
    }
}
