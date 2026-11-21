package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                ml.Z(this.b, (org.telegram.messenger.da) obj);
                break;
            default:
                ml.X(this.b, (Location) obj);
                break;
        }
    }
}
