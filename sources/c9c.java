// default package

import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class c9c extends LinkMovementMethod {
    public final /* synthetic */ UndoView a;

    public c9c(UndoView undoView) {
        this.a = undoView;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        CharacterStyle[] characterStyleArr;
        try {
            if (motionEvent.getAction() == 0 && ((characterStyleArr = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class)) == null || characterStyleArr.length == 0)) {
                return false;
            }
            if (motionEvent.getAction() != 1) {
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
            CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class);
            if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                this.a.b(characterStyleArr2[0]);
            }
            Selection.removeSelection(spannable);
            return true;
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }
}
