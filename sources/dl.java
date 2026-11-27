// default package

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class dl extends LinkMovementMethod {
    public final /* synthetic */ byte a;

    public /* synthetic */ dl(byte b) {
        this.a = b;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                try {
                    boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        Selection.removeSelection(spannable);
                    }
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return false;
                }
            case 1:
                try {
                    boolean onTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        Selection.removeSelection(spannable);
                    }
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return false;
                }
                break;
            case 2:
                try {
                    break;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return false;
                }
            default:
                try {
                    boolean onTouchEvent3 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        Selection.removeSelection(spannable);
                    }
                    break;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return false;
                }
                break;
        }
        return false;
    }
}
