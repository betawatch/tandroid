package g2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a = new LinkedHashSet();

    public a(e eVar) {
        eVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // g2.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
