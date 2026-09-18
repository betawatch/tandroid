package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class la implements TextWatcher {
    public final /* synthetic */ ma a;

    public la(ma maVar) {
        this.a = maVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        sa saVar = this.a.c;
        if (saVar.r.startsWith("@")) {
            saVar.r = saVar.r.substring(1);
        }
        if (saVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) saVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(saVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, saVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ma maVar = this.a;
        sa saVar = maVar.c;
        String str = saVar.r;
        saVar.r = charSequence == null ? "" : charSequence.toString();
        sa saVar2 = maVar.c;
        pa paVar = saVar2.E;
        if (paVar == null || str == null) {
            return;
        }
        paVar.b(saVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ma maVar = this.a;
        sa saVar = maVar.c;
        String str = saVar.r;
        saVar.r = charSequence == null ? "" : charSequence.toString();
        sa saVar2 = maVar.c;
        pa paVar = saVar2.E;
        if (paVar != null && str != null) {
            paVar.b(saVar2.r);
        }
        if (saVar.n) {
            return;
        }
        saVar.d0(saVar.r);
    }
}
