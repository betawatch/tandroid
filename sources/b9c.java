// default package

import android.view.View;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
