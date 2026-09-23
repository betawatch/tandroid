package org.telegram.ui.Components;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rv extends LinkMovementMethod {
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
                } catch (Exception e7) {
                    FileLog.e(e7);
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
