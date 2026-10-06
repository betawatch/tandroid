package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class pj implements TextWatcher {
    public final /* synthetic */ bk a;

    public pj(bk bkVar) {
        this.a = bkVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            s4.h0 adapter = this.a.s.getAdapter();
            bk bkVar = this.a;
            if (adapter != bkVar.E) {
                currentTop = bkVar.getCurrentTop();
                this.a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.a.G.c();
                bk bkVar2 = this.a;
                bkVar2.s.setAdapter(bkVar2.E);
                this.a.E.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            pz pzVar = this.a.G;
            if (pzVar != null) {
                pzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        xj xjVar = this.a.F;
        if (xjVar != null) {
            if (xjVar.f != null) {
                Utilities.searchQueue.cancelRunnable(xjVar.f);
                xjVar.f = null;
            }
            int i10 = xjVar.h + 1;
            xjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            wj wjVar = new wj(xjVar, obj, i10, 0);
            xjVar.f = wjVar;
            dispatchQueue.postRunnable(wjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
