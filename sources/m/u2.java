package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                ((SearchView) this.b).p();
                break;
            case 1:
                if (i9 == 6) {
                    ((org.telegram.ui.Cells.g) this.b).run();
                    break;
                }
                break;
            case 2:
                if (i9 == 6) {
                    ((Runnable) this.b).run();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                if (i9 != 4) {
                    if (keyEvent != null && i9 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.w2 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.U1 == null) {
                        chatActivityEnterView.S0();
                        break;
                    }
                } else {
                    chatActivityEnterView.S0();
                    break;
                }
                break;
        }
        return true;
    }
}
