package ig;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.vz;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class b0 implements TextWatcher {
    public final /* synthetic */ h0 a;

    public b0(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        h0 h0Var = this.a;
        ai.u1 u1Var = h0Var.s;
        vz vzVar = h0Var.E;
        e0 e0Var = h0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (u1Var.getAdapter() != e0Var) {
                currentTop = h0Var.getCurrentTop();
                vzVar.c();
                u1Var.setAdapter(e0Var);
                e0Var.l();
                if (currentTop > 0) {
                    h0Var.v.h1(0, -currentTop);
                }
            }
        } else if (vzVar != null) {
            vzVar.setText(LocaleController.getString(R.string.NoResult));
        }
        f0 f0Var = h0Var.y;
        if (f0Var != null) {
            h0 h0Var2 = f0Var.f;
            ai.u1 u1Var2 = h0Var2.s;
            ArrayList arrayList = f0Var.d;
            arrayList.clear();
            f0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = z1.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                y1 y1Var = (y1) arrayList2.get(i10);
                if (!z1.g(y1Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(y1Var.b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(y1Var);
                    }
                }
            }
            s4.g0 adapter = u1Var2.getAdapter();
            f0 f0Var2 = h0Var2.y;
            if (adapter != f0Var2) {
                u1Var2.setAdapter(f0Var2);
            }
            f0Var.l();
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
