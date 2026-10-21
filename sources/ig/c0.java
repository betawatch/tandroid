package ig;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class c0 implements TextWatcher {
    public final /* synthetic */ i0 a;

    public c0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        i0 i0Var = this.a;
        ai.u1 u1Var = i0Var.s;
        vz vzVar = i0Var.E;
        f0 f0Var = i0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (u1Var.getAdapter() != f0Var) {
                currentTop = i0Var.getCurrentTop();
                vzVar.c();
                u1Var.setAdapter(f0Var);
                f0Var.l();
                if (currentTop > 0) {
                    i0Var.v.h1(0, -currentTop);
                }
            }
        } else if (vzVar != null) {
            vzVar.setText(LocaleController.getString(R.string.NoResult));
        }
        g0 g0Var = i0Var.y;
        if (g0Var != null) {
            i0 i0Var2 = g0Var.f;
            ai.u1 u1Var2 = i0Var2.s;
            ArrayList arrayList = g0Var.d;
            arrayList.clear();
            g0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = a2.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                z1 z1Var = (z1) arrayList2.get(i10);
                if (!a2.g(z1Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(z1Var.b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(z1Var);
                    }
                }
            }
            s4.g0 adapter = u1Var2.getAdapter();
            g0 g0Var2 = i0Var2.y;
            if (adapter != g0Var2) {
                u1Var2.setAdapter(g0Var2);
            }
            g0Var.l();
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
