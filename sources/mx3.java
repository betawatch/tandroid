// default package

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mx3 extends dx3 {
    public final WeakReference a;
    public final WeakReference b;

    public mx3(TextView textView, nx3 nx3Var) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(nx3Var);
    }

    @Override // dx3
    public final void a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    gx3 a = gx3.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        a.getClass();
                        length = text.length();
                    }
                    CharSequence e = a.e(0, length, text);
                    if (text != e) {
                        int selectionStart = Selection.getSelectionStart(e);
                        int selectionEnd = Selection.getSelectionEnd(e);
                        textView.setText(e);
                        if (e instanceof Spannable) {
                            Spannable spannable = (Spannable) e;
                            if (selectionStart < 0) {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
