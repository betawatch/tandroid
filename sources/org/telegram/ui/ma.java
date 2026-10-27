package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ma implements TextWatcher {
    public final /* synthetic */ na a;

    public ma(na naVar) {
        this.a = naVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        ta taVar = this.a.c;
        if (taVar.r.startsWith("@")) {
            taVar.r = taVar.r.substring(1);
        }
        if (taVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.r2) taVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(taVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, taVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        na naVar = this.a;
        ta taVar = naVar.c;
        String str = taVar.r;
        taVar.r = charSequence == null ? "" : charSequence.toString();
        ta taVar2 = naVar.c;
        qa qaVar = taVar2.E;
        if (qaVar == null || str == null) {
            return;
        }
        qaVar.b(taVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        na naVar = this.a;
        ta taVar = naVar.c;
        String str = taVar.r;
        taVar.r = charSequence == null ? "" : charSequence.toString();
        ta taVar2 = naVar.c;
        qa qaVar = taVar2.E;
        if (qaVar != null && str != null) {
            qaVar.b(taVar2.r);
        }
        if (taVar.n) {
            return;
        }
        taVar.e0(taVar.r);
    }
}
