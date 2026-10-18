package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class na implements TextWatcher {
    public final /* synthetic */ oa a;

    public na(oa oaVar) {
        this.a = oaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        ua uaVar = this.a.c;
        if (uaVar.r.startsWith("@")) {
            uaVar.r = uaVar.r.substring(1);
        }
        if (uaVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) uaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(uaVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, uaVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        oa oaVar = this.a;
        ua uaVar = oaVar.c;
        String str = uaVar.r;
        uaVar.r = charSequence == null ? "" : charSequence.toString();
        ua uaVar2 = oaVar.c;
        ra raVar = uaVar2.E;
        if (raVar == null || str == null) {
            return;
        }
        raVar.b(uaVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        oa oaVar = this.a;
        ua uaVar = oaVar.c;
        String str = uaVar.r;
        uaVar.r = charSequence == null ? "" : charSequence.toString();
        ua uaVar2 = oaVar.c;
        ra raVar = uaVar2.E;
        if (raVar != null && str != null) {
            raVar.b(uaVar2.r);
        }
        if (uaVar.n) {
            return;
        }
        uaVar.d0(uaVar.r);
    }
}
