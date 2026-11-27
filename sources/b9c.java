// default package

import android.view.View;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b9c implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ UndoView b;

    public /* synthetic */ b9c(UndoView undoView, byte b) {
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
