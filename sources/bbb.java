// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public interface bbb {
    boolean a();

    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    float getEditFieldBottomOffset();

    Editable getEditText();

    CharSequence getFieldText();

    d getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
