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
import org.telegram.ui.re0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                f3 f3Var = h3Var.b;
                if (!h3Var.a) {
                    if (i10 > 0 && editable != null && editable.length() > i10) {
                        h3Var.a = true;
                        f3Var.setText(editable.subSequence(0, i10));
                        f3Var.setSelection(f3Var.length());
                        h3Var.a = false;
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
                re0 re0Var = (re0) this.d;
                kg.f fVar = re0Var.c;
                if (!this.b) {
                    re0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(re0Var.S);
                    re0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        re0Var.y = false;
                    }
                    if (!re0Var.p(editable.toString())) {
                        re0Var.s(true);
                        this.b = true;
                        boolean z4 = fVar.getSelectionEnd() >= fVar.getText().length();
                        if (!re0Var.y) {
                            String str = re0Var.H;
                            fVar.setText(str.substring(0, Utilities.clamp(this.c, str.length(), 0)));
                            if (z4) {
                                fVar.setSelection(fVar.getText().length());
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
                if (!h3Var.a) {
                    h3Var.h = false;
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    HashMap hashMap = new HashMap();
                    boolean z4 = charSequence instanceof Spannable;
                    if (z4) {
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
                    this.c = z4 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    break;
                }
                break;
            default:
                if (!this.b && charSequence != null && ((re0) this.d).H != null) {
                    this.c = re0.t(charSequence.toString()).length();
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
                    boolean z4 = charSequence instanceof Spannable;
                    int length = z4 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((length > 0 || this.c > 0) && i10 == 0 && i11 == i12) {
                            this.b = true;
                            if (z4) {
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

    public g3(h3 h3Var, int i10, boolean z4) {
        this.d = h3Var;
        this.c = i10;
        this.b = z4;
    }

    public g3(re0 re0Var) {
        this.d = re0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
