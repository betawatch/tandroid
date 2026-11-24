// default package

import android.view.View;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c5c implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ c5c(UndoView undoView, byte b) {
        this.a = b;
        this.b = undoView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        UndoView undoView = this.b;
        switch (b) {
            case 0:
                int i = UndoView.j0;
                if (undoView.a()) {
                    undoView.d(1, false);
                    break;
                }
                break;
            default:
                int i2 = UndoView.j0;
                undoView.d(1, false);
                break;
        }
    }
}
