package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                ((SearchView) this.b).p();
                break;
            case 1:
                if (i10 == 6) {
                    ((org.telegram.ui.Cells.f) this.b).run();
                    break;
                }
                break;
            case 2:
                if (i10 == 6) {
                    ((Runnable) this.b).run();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                if (i10 != 4) {
                    if (keyEvent != null && i10 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.B2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.Z1 == null) {
                        chatActivityEnterView.Q0();
                        break;
                    }
                } else {
                    chatActivityEnterView.Q0();
                    break;
                }
                break;
        }
        return true;
    }
}
