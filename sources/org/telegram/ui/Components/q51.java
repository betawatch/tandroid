package org.telegram.ui.Components;

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q51 extends LinkMovementMethod {
    public final /* synthetic */ UndoView a;

    public q51(UndoView undoView) {
        this.a = undoView;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        CharacterStyle[] characterStyleArr;
        try {
            if (motionEvent.getAction() != 0 || ((characterStyleArr = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class)) != null && characterStyleArr.length != 0)) {
                if (motionEvent.getAction() != 1) {
                    return super.onTouchEvent(textView, spannable, motionEvent);
                }
                CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class);
                if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                    this.a.b(characterStyleArr2[0]);
                }
                Selection.removeSelection(spannable);
                return true;
            }
            return false;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }
}
