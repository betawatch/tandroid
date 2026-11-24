// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j29 implements cq9 {
    public final LinkedHashSet a = new LinkedHashSet();

    public j29(oo ooVar) {
        ooVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // cq9
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
