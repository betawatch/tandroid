package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class bj implements TextWatcher {
    public final /* synthetic */ pj a;

    public bj(pj pjVar) {
        this.a = pjVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int currentTop;
        String obj = editable.toString();
        if (obj.isEmpty()) {
            f2.r0 adapter = this.a.s.getAdapter();
            pj pjVar = this.a;
            if (adapter != pjVar.A) {
                currentTop = pjVar.getCurrentTop();
                this.a.C.setText(LocaleController.getString(R.string.NoContacts));
                this.a.C.c();
                pj pjVar2 = this.a;
                pjVar2.s.setAdapter(pjVar2.A);
                this.a.A.l();
                if (currentTop > 0) {
                    this.a.v.h1(0, -currentTop);
                }
            }
        } else {
            yy yyVar = this.a.C;
            if (yyVar != null) {
                yyVar.setText(LocaleController.getString(R.string.NoResult));
            }
        }
        lj ljVar = this.a.B;
        if (ljVar != null) {
            if (ljVar.f != null) {
                Utilities.searchQueue.cancelRunnable(ljVar.f);
                ljVar.f = null;
            }
            int i9 = ljVar.h + 1;
            ljVar.h = i9;
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            jj jjVar = new jj(ljVar, obj, i9, 0);
            ljVar.f = jjVar;
            dispatchQueue.postRunnable(jjVar, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final /* synthetic */ void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
