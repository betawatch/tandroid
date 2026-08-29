package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class dq implements TextWatcher {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public dq(gq gqVar, int i10) {
        this.c = gqVar;
        this.b = i10;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        int i11 = this.a;
        int i12 = this.b;
        View view = this.c;
        switch (i11) {
            case 0:
                gq gqVar = (gq) view;
                EditTextBoldCursor[] editTextBoldCursorArr = gqVar.A;
                if (!gqVar.r) {
                    gqVar.r = true;
                    int i13 = 0;
                    while (i13 < editable.length()) {
                        char charAt = editable.charAt(i13);
                        if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                            editable.replace(i13, i13 + 1, "");
                            i13--;
                        }
                        i13++;
                    }
                    if (editable.length() != 0) {
                        try {
                            i10 = Integer.parseInt(editTextBoldCursorArr[i12].getText().toString(), 16) | (-16777216);
                        } catch (Exception unused) {
                            i10 = -1;
                        }
                        gqVar.setColorInner(i10);
                        int color = gqVar.getColor();
                        if (editable.length() == 6) {
                            editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                            editTextBoldCursorArr[i12].setSelection(editable.length());
                        }
                        gqVar.v[gqVar.O].a(color);
                        gqVar.a.s0(color, gqVar.O, true);
                        gqVar.r = false;
                        break;
                    } else {
                        gqVar.r = false;
                        break;
                    }
                }
                break;
            default:
                NumberTextView numberTextView = (NumberTextView) view;
                int codePointCount = i12 - Character.codePointCount(editable, 0, editable.length());
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
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public dq(int i10, NumberTextView numberTextView) {
        this.b = i10;
        this.c = numberTextView;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
