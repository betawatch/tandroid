package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
