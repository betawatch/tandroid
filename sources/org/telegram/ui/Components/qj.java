package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class qj implements TextWatcher {
    public final /* synthetic */ ck a;

    public qj(ck ckVar) {
        this.a = ckVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            s4.i0 adapter = this.a.s.getAdapter();
            ck ckVar = this.a;
            if (adapter != ckVar.E) {
                currentTop = ckVar.getCurrentTop();
                this.a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.a.G.c();
                ck ckVar2 = this.a;
                ckVar2.s.setAdapter(ckVar2.E);
                this.a.E.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            c00 c00Var = this.a.G;
            if (c00Var != null) {
                c00Var.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        yj yjVar = this.a.F;
        if (yjVar != null) {
            if (yjVar.f != null) {
                Utilities.searchQueue.cancelRunnable(yjVar.f);
                yjVar.f = null;
            }
            int i10 = yjVar.h + 1;
            yjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xj xjVar = new xj(yjVar, obj, i10, 0);
            yjVar.f = xjVar;
            dispatchQueue.postRunnable(xjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
