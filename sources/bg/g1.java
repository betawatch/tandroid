package bg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g1 extends f2.d1 {
    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        if (i9 == 1) {
            AndroidUtilities.hideKeyboard(recyclerView);
        }
    }
}
