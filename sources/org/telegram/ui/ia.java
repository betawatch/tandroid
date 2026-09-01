package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ia implements TextWatcher {
    public final /* synthetic */ ja a;

    public ia(ja jaVar) {
        this.a = jaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        pa paVar = this.a.c;
        if (paVar.r.startsWith("@")) {
            paVar.r = paVar.r.substring(1);
        }
        if (paVar.r.length() > 0) {
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) paVar).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/");
            sb.append(paVar.r);
            String sb2 = sb.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb2);
            int indexOf = formatString.indexOf(sb2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb2, paVar, 3), indexOf, sb2.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ja jaVar = this.a;
        pa paVar = jaVar.c;
        String str = paVar.r;
        paVar.r = charSequence == null ? "" : charSequence.toString();
        pa paVar2 = jaVar.c;
        ma maVar = paVar2.B;
        if (maVar == null || str == null) {
            return;
        }
        maVar.b(paVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ja jaVar = this.a;
        pa paVar = jaVar.c;
        String str = paVar.r;
        paVar.r = charSequence == null ? "" : charSequence.toString();
        pa paVar2 = jaVar.c;
        ma maVar = paVar2.B;
        if (maVar != null && str != null) {
            maVar.b(paVar2.r);
        }
        if (paVar.n) {
            return;
        }
        paVar.d0(paVar.r);
    }
}
