// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mx1 implements View.OnTouchListener {
    public final /* synthetic */ byte a = 2;
    public final Rect b = new Rect();
    public final /* synthetic */ fn7 c;

    public mx1(w78 w78Var) {
        this.c = w78Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        nx1 nx1Var;
        n8 n8Var;
        n8 n8Var2;
        byte b = this.a;
        fn7 fn7Var = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) fn7Var;
                if (motionEvent.getActionMasked() == 0 && (nx1Var = chatActivityEnterView.O0) != null && nx1Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                w78 w78Var = (w78) fn7Var;
                if (motionEvent.getActionMasked() == 0 && (n8Var = w78Var.J) != null && n8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        w78Var.J.d(true);
                        break;
                    }
                }
                break;
            default:
                l98 l98Var = (l98) fn7Var;
                if (motionEvent.getActionMasked() == 0 && (n8Var2 = l98Var.n0) != null && n8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        l98Var.n0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public mx1(l98 l98Var) {
        this.c = l98Var;
    }

    public mx1(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
