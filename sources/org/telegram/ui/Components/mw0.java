package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public interface mw0 {
    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.f2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
