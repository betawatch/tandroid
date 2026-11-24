// default package

import android.text.Layout;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ij9 implements mi7 {
    public final xgb a;

    public ij9(xgb xgbVar) {
        this.a = xgbVar;
    }

    @Override // mi7
    public final Layout a() {
        wgb wgbVar = this.a.b;
        if (wgbVar == null) {
            return null;
        }
        return wgbVar.a();
    }

    @Override // mi7
    public final View e() {
        return null;
    }
}
