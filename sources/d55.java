// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class d55 extends c49 {
    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        RecyclerView.R(view);
        if (h75.u5) {
            rect.set(0, gl.L(4.0f), 0, gl.L(4.0f));
        } else {
            rect.set(gl.L(4.0f), 0, gl.L(4.0f), 0);
        }
    }
}
