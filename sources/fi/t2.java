package fi;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class t2 extends s4.n0 {
    @Override // s4.n0
    public final void d(Rect rect, View view, RecyclerView recyclerView, s4.b1 b1Var) {
        int dp = AndroidUtilities.dp(4.0f);
        rect.top = 0;
        rect.bottom = dp;
        rect.right = dp;
        rect.left = dp;
        if (RecyclerView.R(view) % 3 != 2) {
            rect.right = 0;
        }
    }
}
