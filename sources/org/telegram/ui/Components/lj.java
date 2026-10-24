package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
            s4.g0 adapter = this.a.s.getAdapter();
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
            vz vzVar = this.a.G;
            if (vzVar != null) {
                vzVar.setText(LocaleController.getString(R.string.NoResult));
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
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            sj sjVar = new sj(tjVar, obj, i10, 0);
            tjVar.f = sjVar;
            dispatchQueue.postRunnable(sjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
