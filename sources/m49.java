// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class m49 implements ds9 {
    public final LinkedHashSet a = new LinkedHashSet();

    public m49(op opVar) {
        opVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // ds9
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
