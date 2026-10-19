package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class q21 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ r21 e;

    public q21(r21 r21Var, Context context, boolean z10) {
        this.e = r21Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        boolean z10 = this.d;
        r21 r21Var = this.e;
        if (!z10) {
            return r21Var.h.size() + (r21Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = r21Var.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
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
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        boolean z11 = this.d;
        r21 r21Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i12 = r21Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < r21Var.h.size()) {
                language = (TranslateController.Language) r21Var.h.get(i10);
            }
            z10 = false;
        } else if (i10 >= 0 && i10 < r21Var.f.size()) {
            language = (TranslateController.Language) r21Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        w8Var.b(str, language.displayName, false, !z10);
        w8Var.setChecked(r21Var.r.contains(language.code));
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.w8(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        } else {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = l4Var;
        }
        return new org.telegram.ui.Components.sl0(view);
    }
}
