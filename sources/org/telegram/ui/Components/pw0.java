package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public interface pw0 {
    boolean a();

    void e(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    float getEditFieldBottomOffset();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.e2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
