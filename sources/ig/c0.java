package ig;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.mz;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        bi.o0 o0Var = i0Var.s;
        mz mzVar = i0Var.E;
        f0 f0Var = i0Var.x;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            if (o0Var.getAdapter() != f0Var) {
                currentTop = i0Var.getCurrentTop();
                mzVar.c();
                o0Var.setAdapter(f0Var);
                f0Var.l();
                if (currentTop > 0) {
                    i0Var.v.h1(0, -currentTop);
                }
            }
        } else if (mzVar != null) {
            mzVar.setText(LocaleController.getString(R.string.NoResult));
        }
        g0 g0Var = i0Var.y;
        if (g0Var != null) {
            i0 i0Var2 = g0Var.f;
            bi.o0 o0Var2 = i0Var2.s;
            ArrayList arrayList = g0Var.d;
            arrayList.clear();
            g0Var.e = obj;
            String translitSafe = AndroidUtilities.translitSafe(obj);
            if (translitSafe.startsWith("/")) {
                translitSafe = translitSafe.substring(1);
            }
            ArrayList arrayList2 = b2.f(UserConfig.selectedAccount).b;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                a2 a2Var = (a2) arrayList2.get(i10);
                if (!b2.g(a2Var.b)) {
                    String translitSafe2 = AndroidUtilities.translitSafe(a2Var.b);
                    if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                        arrayList.add(a2Var);
                    }
                }
            }
            s4.h0 adapter = o0Var2.getAdapter();
            g0 g0Var2 = i0Var2.y;
            if (adapter != g0Var2) {
                o0Var2.setAdapter(g0Var2);
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
