package org.telegram.ui.Components;

import android.location.Location;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl b;

    public /* synthetic */ wk(dl dlVar, int i7) {
        this.a = i7;
        this.b = dlVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                dl.Z(this.b, (org.telegram.messenger.ea) obj);
                break;
            default:
                dl.X(this.b, (Location) obj);
                break;
        }
    }
}
