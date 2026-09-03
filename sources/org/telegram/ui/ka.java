package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ka implements TextWatcher {
    public final /* synthetic */ la a;

    public ka(la laVar) {
        this.a = laVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        ra raVar = this.a.c;
        if (raVar.r.startsWith("@")) {
            raVar.r = raVar.r.substring(1);
        }
        if (raVar.r.length() > 0) {
            StringBuilder sb = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
            sb.append(MessagesController.getInstance(i10).linkPrefix);
            sb.append("/");
            sb.append(raVar.r);
            String sb2 = sb.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb2);
            int indexOf = formatString.indexOf(sb2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb2, raVar, 3), indexOf, sb2.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        la laVar = this.a;
        ra raVar = laVar.c;
        String str = raVar.r;
        raVar.r = charSequence == null ? "" : charSequence.toString();
        ra raVar2 = laVar.c;
        oa oaVar = raVar2.B;
        if (oaVar == null || str == null) {
            return;
        }
        oaVar.b(raVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        la laVar = this.a;
        ra raVar = laVar.c;
        String str = raVar.r;
        raVar.r = charSequence == null ? "" : charSequence.toString();
        ra raVar2 = laVar.c;
        oa oaVar = raVar2.B;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.r);
        }
        if (raVar.n) {
            return;
        }
        raVar.d0(raVar.r);
    }
}
