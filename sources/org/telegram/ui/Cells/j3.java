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
import org.telegram.ui.hc0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j3 implements TextWatcher {
    public final /* synthetic */ int a = 2;
    public boolean b;
    public int c;
    public Object d;

    public /* synthetic */ j3() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                int i7 = this.c;
                k3 k3Var = (k3) this.d;
                i3 i3Var = k3Var.d;
                if (!k3Var.c) {
                    if (i7 > 0 && editable != null && editable.length() > i7) {
                        k3Var.c = true;
                        i3Var.setText(editable.subSequence(0, i7));
                        i3Var.setSelection(i3Var.length());
                        k3Var.c = false;
                    }
                    k3Var.b(editable);
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
                org.telegram.ui.Components.t4 t4Var = (org.telegram.ui.Components.t4) this.d;
                if (!this.b) {
                    int length = editable.length();
                    int i10 = this.c;
                    if (length > i10) {
                        this.b = true;
                        editable.delete(i10, editable.length());
                        org.telegram.messenger.g0.F3(t4Var);
                        try {
                            t4Var.performHapticFeedback(3, 2);
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
                hc0 hc0Var = (hc0) this.d;
                ah.i iVar = hc0Var.c;
                if (!this.b) {
                    hc0Var.p(true);
                    org.telegram.messenger.g0.r(hc0Var.V);
                    hc0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        hc0Var.D = false;
                    }
                    if (!hc0Var.o(editable.toString())) {
                        hc0Var.r(true);
                        this.b = true;
                        boolean z9 = iVar.getSelectionEnd() >= iVar.getText().length();
                        if (!hc0Var.D) {
                            String str = hc0Var.K;
                            iVar.setText(str.substring(0, Utilities.j(this.c, str.length(), 0)));
                            if (z9) {
                                iVar.setSelection(iVar.getText().length());
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
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.d;
                if (!k3Var.c) {
                    k3Var.r = false;
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                if (!this.b) {
                    HashMap hashMap = new HashMap();
                    boolean z9 = charSequence instanceof Spannable;
                    if (z9) {
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
                    this.c = z9 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    break;
                }
                break;
            default:
                if (!this.b && charSequence != null && ((hc0) this.d).K != null) {
                    this.c = hc0.s(charSequence.toString()).length();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    boolean z9 = charSequence instanceof Spannable;
                    int length = z9 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((length > 0 || this.c > 0) && i7 == 0 && i10 == i11) {
                            this.b = true;
                            if (z9) {
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

    public j3(k3 k3Var, int i7, boolean z9) {
        this.d = k3Var;
        this.c = i7;
        this.b = z9;
    }

    public j3(int i7, org.telegram.ui.Components.t4 t4Var) {
        this.c = i7;
        this.d = t4Var;
    }

    public j3(hc0 hc0Var) {
        this.d = hc0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
