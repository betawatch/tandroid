package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class xi implements TextWatcher {
    public final /* synthetic */ lj a;

    public xi(lj ljVar) {
        this.a = ljVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            f2.q0 adapter = this.a.s.getAdapter();
            lj ljVar = this.a;
            if (adapter != ljVar.A) {
                currentTop = ljVar.getCurrentTop();
                this.a.C.setText(LocaleController.getString(R.string.NoContacts));
                this.a.C.c();
                lj ljVar2 = this.a;
                ljVar2.s.setAdapter(ljVar2.A);
                this.a.A.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            az azVar = this.a.C;
            if (azVar != null) {
                azVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        hj hjVar = this.a.B;
        if (hjVar != null) {
            if (hjVar.f != null) {
                Utilities.searchQueue.cancelRunnable(hjVar.f);
                hjVar.f = null;
            }
            int i10 = hjVar.h + 1;
            hjVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            fj fjVar = new fj(hjVar, obj, i10, 0);
            hjVar.f = fjVar;
            dispatchQueue.postRunnable(fjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
