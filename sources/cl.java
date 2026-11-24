// default package

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cl extends LinkMovementMethod {
    public final /* synthetic */ byte a;

    public /* synthetic */ cl(byte b) {
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
                    fa4.g(e, true);
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
                    fa4.g(e2, true);
                    return false;
                }
                break;
            case 2:
                try {
                    break;
                } catch (Exception e3) {
                    fa4.g(e3, true);
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
                    fa4.g(e4, true);
                    return false;
                }
                break;
        }
        return false;
    }
}
