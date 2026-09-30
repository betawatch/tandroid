package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class oj implements TextWatcher {
    public final /* synthetic */ ak a;

    public oj(ak akVar) {
        this.a = akVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            s4.h0 adapter = this.a.s.getAdapter();
            ak akVar = this.a;
            if (adapter != akVar.E) {
                currentTop = akVar.getCurrentTop();
                this.a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.a.G.c();
                ak akVar2 = this.a;
                akVar2.s.setAdapter(akVar2.E);
                this.a.E.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            oz ozVar = this.a.G;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        wj wjVar = this.a.F;
        if (wjVar != null) {
            if (wjVar.f != null) {
                Utilities.searchQueue.cancelRunnable(wjVar.f);
                wjVar.f = null;
            }
            int i10 = wjVar.h + 1;
            wjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            vj vjVar = new vj(wjVar, obj, i10, 0);
            wjVar.f = vjVar;
            dispatchQueue.postRunnable(vjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
