// default package

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
