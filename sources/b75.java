// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b75 extends e69 {
    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        RecyclerView.R(view);
        if (g95.u5) {
            rect.set(0, gm.L(4.0f), 0, gm.L(4.0f));
        } else {
            rect.set(gm.L(4.0f), 0, gm.L(4.0f), 0);
        }
    }
}
