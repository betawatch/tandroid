package fh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z4 extends i51 {
    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10)));
    }
}
