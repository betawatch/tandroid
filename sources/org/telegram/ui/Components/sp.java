package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sp implements TextWatcher {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public sp(vp vpVar, int i3) {
        this.c = vpVar;
        this.b = i3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i3;
        int i10 = this.a;
        int i11 = this.b;
        View view = this.c;
        switch (i10) {
            case 0:
                vp vpVar = (vp) view;
                EditTextBoldCursor[] editTextBoldCursorArr = vpVar.F;
                if (!vpVar.r) {
                    vpVar.r = true;
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
                            i3 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                        } catch (Exception unused) {
                            i3 = -1;
                        }
                        vpVar.setColorInner(i3);
                        int color = vpVar.getColor();
                        if (editable.length() == 6) {
                            editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                            editTextBoldCursorArr[i11].setSelection(editable.length());
                        }
                        vpVar.w[vpVar.T].a(color);
                        vpVar.a.c(color, vpVar.T, true);
                        vpVar.r = false;
                        break;
                    } else {
                        vpVar.r = false;
                        break;
                    }
                }
                break;
            default:
                NumberTextView numberTextView = (NumberTextView) view;
                int codePointCount = i11 - Character.codePointCount(editable, 0, editable.length());
                if (codePointCount >= 30) {
                    org.telegram.messenger.g0.X3(numberTextView, false);
                    break;
                } else {
                    numberTextView.a(codePointCount, numberTextView.getVisibility() == 0);
                    org.telegram.messenger.g0.X3(numberTextView, true);
                    break;
                }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.a;
    }

    public sp(int i3, NumberTextView numberTextView) {
        this.b = i3;
        this.c = numberTextView;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
