package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m31 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ n31 e;

    public m31(n31 n31Var, Context context, boolean z4) {
        this.e = n31Var;
        this.c = context;
        this.d = z4;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        boolean z4 = this.d;
        n31 n31Var = this.e;
        if (!z4) {
            return n31Var.h.size() + (n31Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = n31Var.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return (!this.d && i10 == this.e.e) ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r8 == (r3.f.size() - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r8 == (r3.h.size() - 1)) goto L16;
     */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
        boolean z10 = this.d;
        n31 n31Var = this.e;
        TranslateController.Language language = null;
        if (!z10) {
            int i12 = n31Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < n31Var.h.size()) {
                language = (TranslateController.Language) n31Var.h.get(i10);
            }
            z4 = false;
        } else if (i10 >= 0 && i10 < n31Var.f.size()) {
            language = (TranslateController.Language) n31Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        t8Var.b(str, language.displayName, false, !z4);
        t8Var.setChecked(n31Var.r.contains(language.code));
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.t8(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.z6(context, (b) null);
        } else {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = m4Var;
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
