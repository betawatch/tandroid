package org.telegram.ui.Components;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class sp implements TextWatcher {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public sp(vp vpVar, int i7) {
        this.c = vpVar;
        this.b = i7;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i7;
        int i10 = this.a;
        int i11 = this.b;
        View view = this.c;
        switch (i10) {
            case 0:
                vp vpVar = (vp) view;
                EditTextBoldCursor[] editTextBoldCursorArr = vpVar.E;
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
                            i7 = Integer.parseInt(editTextBoldCursorArr[i11].getText().toString(), 16) | (-16777216);
                        } catch (Exception unused) {
                            i7 = -1;
                        }
                        vpVar.setColorInner(i7);
                        int color = vpVar.getColor();
                        if (editable.length() == 6) {
                            editable.replace(0, editable.length(), String.format("%02x%02x%02x", Byte.valueOf((byte) Color.red(color)), Byte.valueOf((byte) Color.green(color)), Byte.valueOf((byte) Color.blue(color))).toUpperCase());
                            editTextBoldCursorArr[i11].setSelection(editable.length());
                        }
                        vpVar.w[vpVar.S].a(color);
                        vpVar.a.c(color, vpVar.S, true);
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
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.a;
    }

    public sp(int i7, NumberTextView numberTextView) {
        this.b = i7;
        this.c = numberTextView;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
