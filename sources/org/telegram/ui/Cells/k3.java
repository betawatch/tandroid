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
import org.telegram.ui.dc0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k3 implements TextWatcher {
    public final /* synthetic */ int a = 2;
    public boolean b;
    public int c;
    public Object d;

    public /* synthetic */ k3() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                int i7 = this.c;
                l3 l3Var = (l3) this.d;
                j3 j3Var = l3Var.d;
                if (!l3Var.c) {
                    if (i7 > 0 && editable != null && editable.length() > i7) {
                        l3Var.c = true;
                        j3Var.setText(editable.subSequence(0, i7));
                        j3Var.setSelection(j3Var.length());
                        l3Var.c = false;
                    }
                    l3Var.b(editable);
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
                org.telegram.ui.Components.a5 a5Var = (org.telegram.ui.Components.a5) this.d;
                if (!this.b) {
                    int length = editable.length();
                    int i10 = this.c;
                    if (length > i10) {
                        this.b = true;
                        editable.delete(i10, editable.length());
                        org.telegram.messenger.g0.D3(a5Var);
                        try {
                            a5Var.performHapticFeedback(3, 2);
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
                dc0 dc0Var = (dc0) this.d;
                ah.i iVar = dc0Var.c;
                if (!this.b) {
                    dc0Var.p(true);
                    org.telegram.messenger.g0.r(dc0Var.W);
                    dc0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        dc0Var.E = false;
                    }
                    if (!dc0Var.o(editable.toString())) {
                        dc0Var.r(true);
                        this.b = true;
                        boolean z10 = iVar.getSelectionEnd() >= iVar.getText().length();
                        if (!dc0Var.E) {
                            String str = dc0Var.L;
                            iVar.setText(str.substring(0, Utilities.j(this.c, str.length(), 0)));
                            if (z10) {
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
                l3 l3Var = (l3) this.d;
                if (!l3Var.c) {
                    l3Var.r = false;
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
                if (!this.b && charSequence != null && ((dc0) this.d).L != null) {
                    this.c = dc0.s(charSequence.toString()).length();
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
                    boolean z10 = charSequence instanceof Spannable;
                    int length = z10 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((length > 0 || this.c > 0) && i7 == 0 && i10 == i11) {
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

    public k3(l3 l3Var, int i7, boolean z10) {
        this.d = l3Var;
        this.c = i7;
        this.b = z10;
    }

    public k3(int i7, org.telegram.ui.Components.a5 a5Var) {
        this.c = i7;
        this.d = a5Var;
    }

    public k3(dc0 dc0Var) {
        this.d = dc0Var;
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
