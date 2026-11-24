// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fi implements TextWatcher {
    public final /* synthetic */ byte a = 2;
    public int b;
    public boolean c;
    public Object d;

    public fi(it3 it3Var, int i, boolean z) {
        this.d = it3Var;
        this.b = i;
        this.c = z;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                hj hjVar = (hj) this.d;
                if (!this.c) {
                    int length = editable.length();
                    int i = this.b;
                    if (length > i) {
                        this.c = true;
                        editable.delete(i, editable.length());
                        gl.z3(hjVar);
                        try {
                            hjVar.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        this.c = false;
                        break;
                    }
                }
                break;
            case 1:
                int i2 = this.b;
                it3 it3Var = (it3) this.d;
                ht3 ht3Var = it3Var.d;
                if (!it3Var.c) {
                    if (i2 > 0 && editable != null && editable.length() > i2) {
                        it3Var.c = true;
                        ht3Var.setText(editable.subSequence(0, i2));
                        ht3Var.setSelection(ht3Var.length());
                        it3Var.c = false;
                    }
                    it3Var.b(editable);
                }
                if (!this.c) {
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
            case 2:
                break;
            default:
                qd6 qd6Var = (qd6) this.d;
                l7 l7Var = qd6Var.c;
                if (!this.c) {
                    qd6Var.p(true);
                    gl.r(qd6Var.W);
                    qd6Var.n(false);
                    if (TextUtils.isEmpty(editable)) {
                        qd6Var.E = false;
                    }
                    if (!qd6Var.o(editable.toString())) {
                        qd6Var.r(true);
                        this.c = true;
                        boolean z = l7Var.getSelectionEnd() >= l7Var.getText().length();
                        if (!qd6Var.E) {
                            String str = qd6Var.L;
                            l7Var.setText(str.substring(0, Utilities.j(this.b, str.length(), 0)));
                            if (z) {
                                l7Var.setSelection(l7Var.getText().length());
                            }
                        }
                        this.c = false;
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                it3 it3Var = (it3) this.d;
                if (!it3Var.c) {
                    it3Var.r = false;
                    break;
                }
                break;
            case 2:
                if (!this.c) {
                    HashMap hashMap = new HashMap();
                    boolean z = charSequence instanceof Spannable;
                    if (z) {
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
                    this.b = z ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    break;
                }
                break;
            default:
                if (!this.c && charSequence != null && ((qd6) this.d).L != null) {
                    this.b = qd6.s(charSequence.toString()).length();
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 2:
                if (!this.c) {
                    boolean z = charSequence instanceof Spannable;
                    int length = z ? ((SuggestionSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), SuggestionSpan.class)).length : 0;
                    HashMap hashMap = (HashMap) this.d;
                    if (hashMap != null) {
                        if ((length > 0 || this.b > 0) && i == 0 && i2 == i3) {
                            this.c = true;
                            if (z) {
                                Spannable spannable = (Spannable) charSequence;
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    if (spannable.getSpanStart(entry.getKey()) == -1) {
                                        spannable.setSpan(entry.getKey(), ((Integer) ((Pair) entry.getValue()).first).intValue(), ((Integer) ((Pair) entry.getValue()).second).intValue(), 33);
                                    }
                                }
                            }
                            this.c = false;
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ fi() {
    }

    public fi(int i, hj hjVar) {
        this.b = i;
        this.d = hjVar;
    }

    public fi(qd6 qd6Var) {
        this.d = qd6Var;
    }

    private final void a(Editable editable) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }
}
