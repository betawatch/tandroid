package org.telegram.ui.Components;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jv extends LinkMovementMethod {
    public final /* synthetic */ int a;

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
                    FileLog.e(e);
                    return false;
                }
                break;
            case 1:
                try {
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return false;
                }
            default:
                try {
                    boolean onTouchEvent2 = super.onTouchEvent(textView, spannable, motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    }
                    Selection.removeSelection(spannable);
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return false;
                }
                break;
        }
        return false;
    }
}
