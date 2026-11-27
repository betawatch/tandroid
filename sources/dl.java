// default package

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
