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
import org.telegram.ui.ge0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i3 implements TextWatcher {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public int c;
    public Object d;

    public /* synthetic */ i3() {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                int i9 = this.c;
                j3 j3Var = (j3) this.d;
                h3 h3Var = j3Var.b;
                if (!j3Var.a) {
                    if (i9 > 0 && editable != null && editable.length() > i9) {
                        j3Var.a = true;
                        h3Var.setText(editable.subSequence(0, i9));
                        h3Var.setSelection(h3Var.length());
                        j3Var.a = false;
                    }
                    j3Var.b(editable);
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
                ge0 ge0Var = (ge0) this.d;
                fg.g gVar = ge0Var.c;
                if (!this.b) {
                    ge0Var.q(true);
                    AndroidUtilities.cancelRunOnUIThread(ge0Var.R);
                    ge0Var.o(false);
                    if (TextUtils.isEmpty(editable)) {
                        ge0Var.y = false;
                    }
                    if (!ge0Var.p(editable.toString())) {
                        ge0Var.s(true);
                        this.b = true;
                        boolean z10 = gVar.getSelectionEnd() >= gVar.getText().length();
                        if (!ge0Var.y) {
                            String str = ge0Var.G;
                            gVar.setText(str.substring(0, Utilities.clamp(this.c, str.length(), 0)));
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
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 0:
                j3 j3Var = (j3) this.d;
                if (!j3Var.a) {
                    j3Var.h = false;
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
                if (!this.b && charSequence != null && ((ge0) this.d).G != null) {
                    this.c = ge0.t(charSequence.toString()).length();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 1:
                if (!this.b) {
                    boolean z10 = charSequence instanceof Spannable;
                    int length = z10 ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((length > 0 || this.c > 0) && i9 == 0 && i10 == i11) {
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

    public i3(j3 j3Var, int i9, boolean z10) {
        this.d = j3Var;
        this.c = i9;
        this.b = z10;
    }

    public i3(ge0 ge0Var) {
        this.d = ge0Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
