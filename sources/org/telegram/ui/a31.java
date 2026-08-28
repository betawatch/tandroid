package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a31 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final boolean d;
    public final /* synthetic */ b31 e;

    public a31(b31 b31Var, Context context, boolean z10) {
        this.e = b31Var;
        this.c = context;
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    @Override // f2.r0
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

    @Override // f2.r0
    public final int j(int i9) {
        return (!this.d && i9 == this.e.e) ? 1 : 0;
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
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            return;
        }
        org.telegram.ui.Cells.u8 u8Var = (org.telegram.ui.Cells.u8) view;
        boolean z11 = this.d;
        b31 b31Var = this.e;
        TranslateController.Language language = null;
        if (!z11) {
            int i11 = b31Var.e;
            if (i11 >= 0 && i9 > i11) {
                i9--;
            }
            if (i9 >= 0 && i9 < b31Var.h.size()) {
                language = (TranslateController.Language) b31Var.h.get(i9);
            }
            z10 = false;
        } else if (i9 >= 0 && i9 < b31Var.f.size()) {
            language = (TranslateController.Language) b31Var.f.get(i9);
        }
        if (language == null) {
            return;
        }
        String str = language.ownDisplayName;
        if (str == null) {
            str = language.displayName;
        }
        u8Var.b(str, language.displayName, false, !z10);
        u8Var.setChecked(b31Var.r.contains(language.code));
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View view;
        Context context = this.c;
        if (i9 == 0) {
            view = new org.telegram.ui.Cells.u8(context);
        } else if (i9 != 2) {
            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
        } else {
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setText(LocaleController.getString(R.string.ChooseLanguages));
            view = m4Var;
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
