package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cj implements TextWatcher {
    public final /* synthetic */ qj a;

    public cj(qj qjVar) {
        this.a = qjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            f2.o0 adapter = this.a.s.getAdapter();
            qj qjVar = this.a;
            if (adapter != qjVar.B) {
                currentTop = qjVar.getCurrentTop();
                this.a.D.setText(LocaleController.getString(R.string.NoContacts));
                this.a.D.c();
                qj qjVar2 = this.a;
                qjVar2.s.setAdapter(qjVar2.B);
                this.a.B.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            mz mzVar = this.a.D;
            if (mzVar != null) {
                mzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        mj mjVar = this.a.C;
        if (mjVar != null) {
            if (mjVar.f != null) {
                Utilities.searchQueue.cancelRunnable(mjVar.f);
                mjVar.f = null;
            }
            int i10 = mjVar.h + 1;
            mjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            kj kjVar = new kj(mjVar, obj, i10, 0);
            mjVar.f = kjVar;
            dispatchQueue.postRunnable(kjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
