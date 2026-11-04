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
import org.telegram.ui.cc0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
                int i3 = this.c;
                k3 k3Var = (k3) this.d;
                i3 i3Var = k3Var.d;
                if (!k3Var.c) {
                    if (i3 > 0 && editable != null && editable.length() > i3) {
                        k3Var.c = true;
                        i3Var.setText(editable.subSequence(0, i3));
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
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) this.d;
                if (!this.b) {
                    int length = editable.length();
                    int i10 = this.c;
                    if (length > i10) {
                        this.b = true;
                        editable.delete(i10, editable.length());
                        org.telegram.messenger.g0.F3(s4Var);
                        try {
                            s4Var.performHapticFeedback(3, 2);
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
                cc0 cc0Var = (cc0) this.d;
                bh.g gVar = cc0Var.c;
                if (!this.b) {
                    cc0Var.p(true);
                    org.telegram.messenger.g0.r(cc0Var.W);
                    cc0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        cc0Var.E = false;
                    }
                    if (!cc0Var.o(editable.toString())) {
                        cc0Var.r(true);
                        this.b = true;
                        boolean z10 = gVar.getSelectionEnd() >= gVar.getText().length();
                        if (!cc0Var.E) {
                            String str = cc0Var.L;
                            gVar.setText(str.substring(0, Utilities.j(this.c, str.length(), 0)));
                            if (z10) {
                                gVar.setSelection(gVar.getText().length());
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
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
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
                if (!this.b && charSequence != null && ((cc0) this.d).L != null) {
                    this.c = cc0.s(charSequence.toString()).length();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.a) {
            case 2:
                if (!this.b) {
                    boolean z10 = charSequence instanceof Spannable;
                    int length = z10 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((length > 0 || this.c > 0) && i3 == 0 && i10 == i11) {
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

    public j3(k3 k3Var, int i3, boolean z10) {
        this.d = k3Var;
        this.c = i3;
        this.b = z10;
    }

    public j3(int i3, org.telegram.ui.Components.s4 s4Var) {
        this.c = i3;
        this.d = s4Var;
    }

    public j3(cc0 cc0Var) {
        this.d = cc0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
