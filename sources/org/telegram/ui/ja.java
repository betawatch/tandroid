package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ja implements TextWatcher {
    public final /* synthetic */ ka a;

    public ja(ka kaVar) {
        this.a = kaVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        qa qaVar = this.a.c;
        if (qaVar.r.startsWith("@")) {
            qaVar.r = qaVar.r.substring(1);
        }
        if (qaVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.n2) qaVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(qaVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, qaVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ka kaVar = this.a;
        qa qaVar = kaVar.c;
        String str = qaVar.r;
        qaVar.r = charSequence == null ? "" : charSequence.toString();
        qa qaVar2 = kaVar.c;
        na naVar = qaVar2.E;
        if (naVar == null || str == null) {
            return;
        }
        naVar.b(qaVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ka kaVar = this.a;
        qa qaVar = kaVar.c;
        String str = qaVar.r;
        qaVar.r = charSequence == null ? "" : charSequence.toString();
        qa qaVar2 = kaVar.c;
        na naVar = qaVar2.E;
        if (naVar != null && str != null) {
            naVar.b(qaVar2.r);
        }
        if (qaVar.n) {
            return;
        }
        qaVar.d0(qaVar.r);
    }
}
