// default package

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cm extends LinkMovementMethod {
    public final /* synthetic */ byte a;

    public /* synthetic */ cm(byte b) {
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
                    fc4.g(e, true);
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
                    fc4.g(e2, true);
                    return false;
                }
                break;
            case 2:
                try {
                    break;
                } catch (Exception e3) {
                    fc4.g(e3, true);
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
                    fc4.g(e4, true);
                    return false;
                }
                break;
        }
        return false;
    }
}
