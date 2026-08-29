package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ b31 e;

    public a31(b31 b31Var, Context context, boolean z10) {
        this.e = b31Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        boolean z10 = this.d;
        b31 b31Var = this.e;
        if (!z10) {
            return b31Var.h.size() + (b31Var.e >= 0 ? 1 : 0);
        }
        ArrayList arrayList = b31Var.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.p0
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
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
        boolean z11 = this.d;
        b31 b31Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i12 = b31Var.e;
            if (i12 >= 0 && i10 > i12) {
                i10--;
            }
            if (i10 >= 0 && i10 < b31Var.h.size()) {
                language = (TranslateController.Language) b31Var.h.get(i10);
            }
            z10 = false;
        } else if (i10 >= 0 && i10 < b31Var.f.size()) {
            language = (TranslateController.Language) b31Var.f.get(i10);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        r8Var.b(str, language.displayName, false, !z10);
        r8Var.setChecked(b31Var.r.contains(language.code));
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.r8(context);
        } else if (i10 != 2) {
            view = new org.telegram.ui.Cells.x6(context, (b) null);
        } else {
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
            k4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = k4Var;
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
