package gg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.tz;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h0 implements TextWatcher {
    public final /* synthetic */ n0 a;

    public h0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        n0 n0Var = this.a;
        bi.y1 y1Var = n0Var.s;
        tz tzVar = n0Var.E;
        k0 k0Var = n0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (y1Var.getAdapter() != k0Var) {
                currentTop = n0Var.getCurrentTop();
                tzVar.c();
                y1Var.setAdapter(k0Var);
                k0Var.l();
                if (currentTop > 0) {
                    n0Var.v.h1(0, -currentTop);
                }
            }
        } else if (tzVar != null) {
            tzVar.setText(LocaleController.getString(R.string.NoResult));
        }
        l0 l0Var = n0Var.y;
        if (l0Var != null) {
            n0 n0Var2 = l0Var.f;
            bi.y1 y1Var2 = n0Var2.s;
            ArrayList arrayList = l0Var.d;
            arrayList.clear();
            l0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = k2.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                j2 j2Var = (j2) arrayList2.get(i10);
                if (!k2.g(j2Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(j2Var.b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(j2Var);
                    }
                }
            }
            s4.h0 adapter = y1Var2.getAdapter();
            l0 l0Var2 = n0Var2.y;
            if (adapter != l0Var2) {
                y1Var2.setAdapter(l0Var2);
            }
            l0Var.l();
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
