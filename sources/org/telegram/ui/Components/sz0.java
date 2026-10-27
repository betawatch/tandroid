package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public interface sz0 {
    void d(TextWatcher textWatcher);

    EditTextBoldCursor getEditField();

    Editable getEditText();

    CharSequence getFieldText();

    org.telegram.ui.ActionBar.r2 getParentFragment();

    int getVisibility();

    void setFieldText(CharSequence charSequence);
}
