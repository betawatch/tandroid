package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f41 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ g41 e;

    public f41(g41 g41Var, Context context, boolean z10) {
        this.e = g41Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        g41 g41Var = this.e;
        if (!z10) {
            return g41Var.h.size() + (g41Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = g41Var.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
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
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        boolean z11 = this.d;
        g41 g41Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i12 = g41Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < g41Var.h.size()) {
                language = (TranslateController.Language) g41Var.h.get(i10);
            }
            z10 = false;
        } else if (i10 >= 0 && i10 < g41Var.f.size()) {
            language = (TranslateController.Language) g41Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        x8Var.b(str, language.displayName, false, !z10);
        x8Var.setChecked(g41Var.r.contains(language.code));
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.x8(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        } else {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = l4Var;
        }
        return new org.telegram.ui.Components.wk0(view);
    }
}
