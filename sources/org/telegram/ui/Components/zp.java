package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zp implements TextWatcher {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public zp(cq cqVar, int i9) {
        this.c = cqVar;
        this.b = i9;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i9;
        int i10 = this.a;
        int i11 = this.b;
        View view = this.c;
        switch (i10) {
            case 0:
                cq cqVar = (cq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = cqVar.A;
                if (!cqVar.r) {
                    cqVar.r = true;
                    int i12 = 0;
                    while (i12 < editable.length()) {
                        char charAt = editable.charAt(i12);
                        if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                            editable.replace(i12, i12 + 1, "");
                            i12--;
                        }
                        i12++;
                    }
                    if (editable.length() != 0) {
                        try {
                            i9 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                        } catch (Exception unused) {
                            i9 = -1;
                        }
                        cqVar.setColorInner(i9);
                        int color = cqVar.getColor();
                        if (editable.length() == 6) {
                            editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                            editTextBoldCursorArr[i11].setSelection(editable.length());
                        }
                        cqVar.v[cqVar.O].a(color);
                        cqVar.a.n0(color, cqVar.O, true);
                        cqVar.r = false;
                        break;
                    } else {
                        cqVar.r = false;
                        break;
                    }
                }
                break;
            default:
                NumberTextView numberTextView = (NumberTextView) view;
                int codePointCount = i11 - Character.codePointCount(editable, 0, editable.length());
                if (codePointCount >= 30) {
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, false);
                    break;
                } else {
                    numberTextView.a(codePointCount, numberTextView.getVisibility() == 0);
                    AndroidUtilities.updateViewVisibilityAnimated(numberTextView, true);
                    break;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    public zp(int i9, NumberTextView numberTextView) {
        this.b = i9;
        this.c = numberTextView;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
