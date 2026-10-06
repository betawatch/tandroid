package hg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.pz;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class d0 implements TextWatcher {
    public final /* synthetic */ j0 a;

    public d0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        j0 j0Var = this.a;
        ai.w0 w0Var = j0Var.s;
        pz pzVar = j0Var.E;
        g0 g0Var = j0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (w0Var.getAdapter() != g0Var) {
                currentTop = j0Var.getCurrentTop();
                pzVar.c();
                w0Var.setAdapter(g0Var);
                g0Var.l();
                if (currentTop > 0) {
                    j0Var.v.h1(0, -currentTop);
                }
            }
        } else if (pzVar != null) {
            pzVar.setText(LocaleController.getString(R.string.NoResult));
        }
        h0 h0Var = j0Var.y;
        if (h0Var != null) {
            j0 j0Var2 = h0Var.f;
            ai.w0 w0Var2 = j0Var2.s;
            ArrayList arrayList = h0Var.d;
            arrayList.clear();
            h0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = b2.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                a2 a2Var = (a2) arrayList2.get(i10);
                if (!b2.g(a2Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(a2Var.b);
                    if (translitSafe2.startsWith(translitSafe) || bi.u(" ", translitSafe, translitSafe2)) {
                        arrayList.add(a2Var);
                    }
                }
            }
            s4.h0 adapter = w0Var2.getAdapter();
            h0 h0Var2 = j0Var2.y;
            if (adapter != h0Var2) {
                w0Var2.setAdapter(h0Var2);
            }
            h0Var.l();
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
