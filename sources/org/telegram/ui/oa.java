package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oa implements TextWatcher {
    public final /* synthetic */ pa a;

    public oa(pa paVar) {
        this.a = paVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        va vaVar = this.a.c;
        if (vaVar.r.startsWith("@")) {
            vaVar.r = vaVar.r.substring(1);
        }
        if (vaVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.m2) vaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(vaVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, vaVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        pa paVar = this.a;
        va vaVar = paVar.c;
        String str = vaVar.r;
        vaVar.r = charSequence == null ? "" : charSequence.toString();
        va vaVar2 = paVar.c;
        sa saVar = vaVar2.E;
        if (saVar == null || str == null) {
            return;
        }
        saVar.b(vaVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        pa paVar = this.a;
        va vaVar = paVar.c;
        String str = vaVar.r;
        vaVar.r = charSequence == null ? "" : charSequence.toString();
        va vaVar2 = paVar.c;
        sa saVar = vaVar2.E;
        if (saVar != null && str != null) {
            saVar.b(vaVar2.r);
        }
        if (vaVar.n) {
            return;
        }
        vaVar.d0(vaVar.r);
    }
}
