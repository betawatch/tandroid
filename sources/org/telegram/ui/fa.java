package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fa implements TextWatcher {
    public final /* synthetic */ ga a;

    public fa(ga gaVar) {
        this.a = gaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i9;
        ma maVar = this.a.c;
        if (maVar.r.startsWith("@")) {
            maVar.r = maVar.r.substring(1);
        }
        if (maVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i9 = ((org.telegram.ui.ActionBar.o2) maVar).currentAccount;
            sb2.append(MessagesController.getInstance(i9).linkPrefix);
            sb2.append("/");
            sb2.append(maVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, maVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        ga gaVar = this.a;
        ma maVar = gaVar.c;
        String str = maVar.r;
        maVar.r = charSequence == null ? "" : charSequence.toString();
        ma maVar2 = gaVar.c;
        ja jaVar = maVar2.A;
        if (jaVar == null || str == null) {
            return;
        }
        jaVar.b(maVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        ga gaVar = this.a;
        ma maVar = gaVar.c;
        String str = maVar.r;
        maVar.r = charSequence == null ? "" : charSequence.toString();
        ma maVar2 = gaVar.c;
        ja jaVar = maVar2.A;
        if (jaVar != null && str != null) {
            jaVar.b(maVar2.r);
        }
        if (maVar.n) {
            return;
        }
        maVar.c0(maVar.r);
    }
}
