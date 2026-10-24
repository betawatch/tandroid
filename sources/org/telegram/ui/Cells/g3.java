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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.je0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g3 implements TextWatcher {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public Object d;

    public /* synthetic */ g3() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                h3 h3Var = (h3) this.d;
                f3 f3Var = h3Var.d;
                if (!h3Var.c) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        h3Var.c = true;
                        f3Var.setText(editable.subSequence(0, i10));
                        f3Var.setSelection(f3Var.length());
                        h3Var.c = false;
                    }
                    h3Var.b(editable);
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
                break;
            default:
                je0 je0Var = (je0) this.d;
                ei.e2 e2Var = je0Var.c;
                if (!this.b) {
                    je0Var.p(true);
                    AndroidUtilities.cancelRunOnUIThread(je0Var.V);
                    je0Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        je0Var.y = false;
                    }
                    if (!je0Var.o(editable.toString())) {
                        je0Var.r(true);
                        this.b = true;
                        boolean z10 = e2Var.getSelectionEnd() >= e2Var.getText().length();
                        if (!je0Var.y) {
                            String str = je0Var.K;
                            e2Var.setText(str.substring(0, Utilities.clamp(this.c, str.length(), 0)));
                            if (z10) {
                                e2Var.setSelection(e2Var.getText().length());
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
                h3 h3Var = (h3) this.d;
                if (!h3Var.c) {
                    h3Var.r = false;
                    break;
                }
                break;
            case 1:
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
                if (!this.b && charSequence != null && ((je0) this.d).K != null) {
                    this.c = je0.s(charSequence.toString()).length();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
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

    public g3(h3 h3Var, int i10, boolean z10) {
        this.d = h3Var;
        this.c = i10;
        this.b = z10;
    }

    public g3(je0 je0Var) {
        this.d = je0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
