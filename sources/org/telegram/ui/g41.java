package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class g41 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ h41 e;

    public g41(h41 h41Var, Context context, boolean z10) {
        this.e = h41Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        h41 h41Var = this.e;
        if (!z10) {
            return h41Var.h.size() + (h41Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = h41Var.f;
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
        h41 h41Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i12 = h41Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < h41Var.h.size()) {
                language = (TranslateController.Language) h41Var.h.get(i10);
            }
            z10 = false;
        } else if (i10 >= 0 && i10 < h41Var.f.size()) {
            language = (TranslateController.Language) h41Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        x8Var.b(str, language.displayName, false, !z10);
        x8Var.setChecked(h41Var.r.contains(language.code));
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
        return new org.telegram.ui.Components.vk0(view);
    }
}
