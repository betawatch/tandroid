package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ea implements TextWatcher {
    public final /* synthetic */ fa a;

    public ea(fa faVar) {
        this.a = faVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10;
        la laVar = this.a.c;
        if (laVar.r.startsWith("@")) {
            laVar.r = laVar.r.substring(1);
        }
        if (laVar.r.length() > 0) {
            StringBuilder sb2 = new StringBuilder("https://");
            i10 = ((org.telegram.ui.ActionBar.o2) laVar).currentAccount;
            sb2.append(MessagesController.getInstance(i10).linkPrefix);
            sb2.append("/");
            sb2.append(laVar.r);
            String sb3 = sb2.toString();
            String formatString = LocaleController.formatString("UsernameHelpLink", R.string.UsernameHelpLink, sb3);
            int indexOf = formatString.indexOf(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(sb3, laVar, 3), indexOf, sb3.length() + indexOf, 33);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        fa faVar = this.a;
        la laVar = faVar.c;
        String str = laVar.r;
        laVar.r = charSequence == null ? "" : charSequence.toString();
        la laVar2 = faVar.c;
        ia iaVar = laVar2.A;
        if (iaVar == null || str == null) {
            return;
        }
        iaVar.b(laVar2.r);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        fa faVar = this.a;
        la laVar = faVar.c;
        String str = laVar.r;
        laVar.r = charSequence == null ? "" : charSequence.toString();
        la laVar2 = faVar.c;
        ia iaVar = laVar2.A;
        if (iaVar != null && str != null) {
            iaVar.b(laVar2.r);
        }
        if (laVar.n) {
            return;
        }
        laVar.d0(laVar.r);
    }
}
