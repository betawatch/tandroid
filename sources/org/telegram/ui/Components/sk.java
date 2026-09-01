package org.telegram.ui.Components;

import android.location.Location;
import org.telegram.messenger.IMapsProvider;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;

    public /* synthetic */ sk(cl clVar, int i10) {
        this.a = i10;
        this.b = clVar;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                cl.J(this.b, (IMapsProvider.IMap) obj);
                break;
            default:
                cl.R(this.b, (Location) obj);
                break;
        }
    }
}
