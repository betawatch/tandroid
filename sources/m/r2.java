package m;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class r2 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                ((SearchView) this.b).p();
                break;
            case 1:
                if (i7 == 6) {
                    ((org.telegram.ui.Cells.f) this.b).run();
                    break;
                }
                break;
            case 2:
                if (i7 == 6) {
                    ((Runnable) this.b).run();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                if (i7 != 4) {
                    if (keyEvent != null && i7 == 0 && !keyEvent.isShiftPressed() && (!chatActivityEnterView.j3 ? keyEvent.isCtrlPressed() : !keyEvent.isCtrlPressed()) && keyEvent.getAction() == 0 && chatActivityEnterView.H2 == null) {
                        chatActivityEnterView.j1();
                        break;
                    }
                } else {
                    chatActivityEnterView.j1();
                    break;
                }
                break;
        }
        return true;
    }
}
