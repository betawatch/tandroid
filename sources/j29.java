// default package

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
