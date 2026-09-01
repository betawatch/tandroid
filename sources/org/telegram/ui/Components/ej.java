package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ej implements TextWatcher {
    public final /* synthetic */ sj a;

    public ej(sj sjVar) {
        this.a = sjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            f2.p0 adapter = this.a.s.getAdapter();
            sj sjVar = this.a;
            if (adapter != sjVar.B) {
                currentTop = sjVar.getCurrentTop();
                this.a.D.setText(LocaleController.getString(R.string.NoContacts));
                this.a.D.c();
                sj sjVar2 = this.a;
                sjVar2.s.setAdapter(sjVar2.B);
                this.a.B.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            oz ozVar = this.a.D;
            if (ozVar != null) {
                ozVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        oj ojVar = this.a.C;
        if (ojVar != null) {
            if (ojVar.f != null) {
                Utilities.searchQueue.cancelRunnable(ojVar.f);
                ojVar.f = null;
            }
            int i10 = ojVar.h + 1;
            ojVar.h = i10;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mj mjVar = new mj(ojVar, obj, i10, 0);
            ojVar.f = mjVar;
            dispatchQueue.postRunnable(mjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
