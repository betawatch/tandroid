package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ga implements TextWatcher {
    public final /* synthetic */ ha a;

    public ga(ha haVar) {
        this.a = haVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        na naVar = this.a.c;
        if (naVar.r.startsWith("@")) {
            naVar.r = naVar.r.substring(1);
        }
        if (naVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) naVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(naVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, naVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ha haVar = this.a;
        na naVar = haVar.c;
        String str = naVar.r;
        naVar.r = charSequence == null ? "" : charSequence.toString();
        na naVar2 = haVar.c;
        ka kaVar = naVar2.A;
        if (kaVar == null || str == null) {
            return;
        }
        kaVar.b(naVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ha haVar = this.a;
        na naVar = haVar.c;
        String str = naVar.r;
        naVar.r = charSequence == null ? "" : charSequence.toString();
        na naVar2 = haVar.c;
        ka kaVar = naVar2.A;
        if (kaVar != null && str != null) {
            kaVar.b(naVar2.r);
        }
        if (naVar.n) {
            return;
        }
        naVar.d0(naVar.r);
    }
}
