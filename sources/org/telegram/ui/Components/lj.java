package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lj implements TextWatcher {
    public final /* synthetic */ xj a;

    public lj(xj xjVar) {
        this.a = xjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            s4.h0 adapter = this.a.s.getAdapter();
            xj xjVar = this.a;
            if (adapter != xjVar.E) {
                currentTop = xjVar.getCurrentTop();
                this.a.G.setText(LocaleController.getString(R.string.NoContacts));
                this.a.G.c();
                xj xjVar2 = this.a;
                xjVar2.s.setAdapter(xjVar2.E);
                this.a.E.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            uz uzVar = this.a.G;
            if (uzVar != null) {
                uzVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        tj tjVar = this.a.F;
        if (tjVar != null) {
            if (tjVar.f != null) {
                Utilities.searchQueue.cancelRunnable(tjVar.f);
                tjVar.f = null;
            }
            int i10 = tjVar.h + 1;
            tjVar.h = i10;
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            sj sjVar = new sj(tjVar, obj, i10, 0);
            tjVar.f = sjVar;
            dispatchQueue2.postRunnable(sjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
