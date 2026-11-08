package m;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class e1 extends g1 {
    @Override // m.g1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) h1.e("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
