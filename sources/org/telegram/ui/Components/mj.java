package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mj implements TextWatcher {
    public final /* synthetic */ yj a;

    public mj(yj yjVar) {
        this.a = yjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            s4.h0 adapter = this.a.s.getAdapter();
            yj yjVar = this.a;
            if (adapter != yjVar.E) {
                currentTop = yjVar.getCurrentTop();
                this.a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.a.G.c();
                yj yjVar2 = this.a;
                yjVar2.s.setAdapter(yjVar2.E);
                this.a.E.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            mz mzVar = this.a.G;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        uj ujVar = this.a.F;
        if (ujVar != null) {
            if (ujVar.f != null) {
                Utilities.searchQueue.cancelRunnable(ujVar.f);
                ujVar.f = null;
            }
            int i10 = ujVar.h + 1;
            ujVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            tj tjVar = new tj(ujVar, obj, i10, 0);
            ujVar.f = tjVar;
            dispatchQueue.postRunnable(tjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
