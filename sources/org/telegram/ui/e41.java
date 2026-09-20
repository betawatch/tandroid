package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class e41 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ f41 e;

    public e41(f41 f41Var, Context context, boolean z10) {
        this.e = f41Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        boolean z10 = this.d;
        f41 f41Var = this.e;
        if (!z10) {
            return f41Var.h.size() + (f41Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = f41Var.f;
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
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        boolean z11 = this.d;
        f41 f41Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i12 = f41Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < f41Var.h.size()) {
                language = (TranslateController.Language) f41Var.h.get(i10);
            }
            z10 = false;
        } else if (i10 >= 0 && i10 < f41Var.f.size()) {
            language = (TranslateController.Language) f41Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        y8Var.b(str, language.displayName, false, !z10);
        y8Var.setChecked(f41Var.r.contains(language.code));
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.y8(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
        } else {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            n4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = n4Var;
        }
        return new org.telegram.ui.Components.fl0(view);
    }
}
