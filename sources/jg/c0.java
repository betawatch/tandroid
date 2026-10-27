package jg;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.uz;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        bi.r1 r1Var = i0Var.s;
        uz uzVar = i0Var.E;
        f0 f0Var = i0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (r1Var.getAdapter() != f0Var) {
                currentTop = i0Var.getCurrentTop();
                uzVar.c();
                r1Var.setAdapter(f0Var);
                f0Var.l();
                if (currentTop > 0) {
                    i0Var.v.h1(0, -currentTop);
                }
            }
        } else if (uzVar != null) {
            uzVar.setText(LocaleController.getString(R.string.NoResult));
        }
        g0 g0Var = i0Var.y;
        if (g0Var != null) {
            i0 i0Var2 = g0Var.f;
            bi.r1 r1Var2 = i0Var2.s;
            ArrayList arrayList = g0Var.d;
            arrayList.clear();
            g0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = c2.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                b2 b2Var = (b2) arrayList2.get(i10);
                if (!c2.g(b2Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(b2Var.b);
                    if (translitSafe2.startsWith(translitSafe) || wh.u(" ", translitSafe, translitSafe2)) {
                        arrayList.add(b2Var);
                    }
                }
            }
            s4.h0 adapter = r1Var2.getAdapter();
            g0 g0Var2 = i0Var2.y;
            if (adapter != g0Var2) {
                r1Var2.setAdapter(g0Var2);
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
