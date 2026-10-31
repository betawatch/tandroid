package org.telegram.ui.Cells;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ParagraphStyle;
import android.text.style.SuggestionSpan;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l3 implements TextWatcher {
    public final /* synthetic */ int a = 2;
    public boolean b;
    public int c;
    public Object d;

    public /* synthetic */ l3() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                m3 m3Var = (m3) this.d;
                k3 k3Var = m3Var.d;
                if (!m3Var.c) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        m3Var.c = true;
                        k3Var.setText(editable.subSequence(0, i10));
                        k3Var.setSelection(k3Var.length());
                        m3Var.c = false;
                    }
                    m3Var.b(editable);
                }
                if (!this.b) {
                    while (true) {
                        int indexOf = editable.toString().indexOf("\n");
                        if (indexOf < 0) {
                            break;
                        } else {
                            editable.delete(indexOf, indexOf + 1);
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.r4 r4Var = (org.telegram.ui.Components.r4) this.d;
                if (!this.b) {
                    int length = editable.length();
                    int i11 = this.c;
                    if (length > i11) {
                        this.b = true;
                        editable.delete(i11, editable.length());
                        org.telegram.messenger.i0.E3(r4Var);
                        try {
                            r4Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.b = false;
                        break;
                    }
                }
                break;
            case 2:
                break;
            default:
                ld0 ld0Var = (ld0) this.d;
                org.telegram.ui.ActionBar.n0 n0Var = ld0Var.c;
                if (!this.b) {
                    ld0Var.p(true);
                    org.telegram.messenger.i0.r(ld0Var.V);
                    ld0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        ld0Var.D = false;
                    }
                    if (!ld0Var.o(editable.toString())) {
                        ld0Var.r(true);
                        this.b = true;
                        boolean z10 = n0Var.getSelectionEnd() >= n0Var.getText().length();
                        if (!ld0Var.D) {
                            String str = ld0Var.K;
                            n0Var.setText(str.substring(0, Utilities.j(this.c, str.length(), 0)));
                            if (z10) {
                                n0Var.setSelection(n0Var.getText().length());
                            }
                        }
                        this.b = false;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                m3 m3Var = (m3) this.d;
                if (!m3Var.c) {
                    m3Var.r = false;
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                if (!this.b) {
                    HashMap hashMap = new HashMap();
                    boolean z10 = charSequence instanceof Spannable;
                    if (z10) {
                        Spannable spannable = (Spannable) charSequence;
                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spannable.getSpans(0, spannable.length(), CharacterStyle.class);
                        ParagraphStyle[] paragraphStyleArr = (ParagraphStyle[]) spannable.getSpans(0, spannable.length(), ParagraphStyle.class);
                        if (characterStyleArr != null && characterStyleArr.length > 0) {
                            for (CharacterStyle characterStyle : characterStyleArr) {
                                if (characterStyle != null && !(characterStyle instanceof SuggestionSpan)) {
                                    hashMap.put(characterStyle, new Pair(Integer.valueOf(spannable.getSpanStart(characterStyle)), Integer.valueOf(spannable.getSpanEnd(characterStyle))));
                                }
                            }
                        }
                        if (paragraphStyleArr != null && paragraphStyleArr.length > 0) {
                            for (ParagraphStyle paragraphStyle : paragraphStyleArr) {
                                if (paragraphStyle != null && !(paragraphStyle instanceof SuggestionSpan)) {
                                    hashMap.put(paragraphStyle, new Pair(Integer.valueOf(spannable.getSpanStart(paragraphStyle)), Integer.valueOf(spannable.getSpanEnd(paragraphStyle))));
                                }
                            }
                        }
                    }
                    this.d = hashMap;
                    this.c = z10 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    break;
                }
                break;
            default:
                if (!this.b && charSequence != null && ((ld0) this.d).K != null) {
                    this.c = ld0.s(charSequence.toString()).length();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    boolean z10 = charSequence instanceof Spannable;
                    int length = z10 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((length > 0 || this.c > 0) && i10 == 0 && i11 == i12) {
                            this.b = true;
                            if (z10) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.b = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public l3(m3 m3Var, int i10, boolean z10) {
        this.d = m3Var;
        this.c = i10;
        this.b = z10;
    }

    public l3(int i10, org.telegram.ui.Components.r4 r4Var) {
        this.c = i10;
        this.d = r4Var;
    }

    public l3(ld0 ld0Var) {
        this.d = ld0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
