// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ly1 implements View.OnTouchListener {
    public final /* synthetic */ byte a = 1;
    public final Rect b = new Rect();
    public final /* synthetic */ jm7 c;

    public ly1(j68 j68Var) {
        this.c = j68Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        my1 my1Var;
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        jm7 jm7Var = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) jm7Var;
                if (motionEvent.getActionMasked() == 0 && (my1Var = chatActivityEnterView.O0) != null && my1Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        chatActivityEnterView.O0.dismiss();
                        break;
                    }
                }
                break;
            case 1:
                j68 j68Var = (j68) jm7Var;
                if (motionEvent.getActionMasked() == 0 && (m8Var = j68Var.J) != null && m8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        j68Var.J.d(true);
                        break;
                    }
                }
                break;
            default:
                w78 w78Var = (w78) jm7Var;
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = w78Var.n0) != null && m8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        w78Var.n0.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public ly1(w78 w78Var) {
        this.c = w78Var;
    }

    public ly1(ChatActivityEnterView chatActivityEnterView) {
        this.c = chatActivityEnterView;
    }
}
