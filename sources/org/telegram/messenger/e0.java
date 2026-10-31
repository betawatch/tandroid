package org.telegram.messenger;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e0 extends LinkMovementMethod {
    public final /* synthetic */ int a;

    public /* synthetic */ e0(int i10) {
        this.a = i10;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                try {
                    boolean onTouchEvent = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    }
                    Selection.removeSelection(spannable);
                } catch (Exception e) {
                    f8.g(e, true);
                    return false;
                }
                break;
            case 1:
                try {
                    boolean onTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    }
                    Selection.removeSelection(spannable);
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return false;
                }
                break;
            case 2:
                try {
                    break;
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return false;
                }
            default:
                try {
                    boolean onTouchEvent3 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    }
                    Selection.removeSelection(spannable);
                } catch (Exception e11) {
                    f8.g(e11, true);
                    return false;
                }
                break;
        }
        return false;
    }

    public /* synthetic */ e0(boolean z10) {
        this.a = 0;
    }
}
