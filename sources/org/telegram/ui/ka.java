package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.p2) raVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(raVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, raVar, 3), indexOf, sb3.length() + indexOf, 33);
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
        oa oaVar = raVar2.E;
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
        oa oaVar = raVar2.E;
        if (oaVar != null && str != null) {
            oaVar.b(raVar2.r);
        }
        if (raVar.n) {
            return;
        }
        raVar.d0(raVar.r);
    }
}
