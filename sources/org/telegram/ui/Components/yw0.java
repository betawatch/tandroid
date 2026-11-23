package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public interface yw0 {
    boolean a();

    void e(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    float getEditFieldBottomOffset();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.g2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
