package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jb1 extends org.telegram.ui.Cells.la {
    public final /* synthetic */ int g3 = 1;
    public final /* synthetic */ Object h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(Context context, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.c3 c3Var) {
        super(context, p2Var, 2, arrayList, arrayList2);
        this.h3 = c3Var;
    }

    @Override // org.telegram.ui.Cells.la
    public final void A1() {
        switch (this.g3) {
            case 0:
                ((mb1) this.h3).e.A0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.c3) this.h3).a.dismissRunnable.run();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.la
    public void z1(org.telegram.ui.ActionBar.j6 j6Var) {
        CharSequence[] charSequenceArr;
        boolean z4;
        int[] iArr;
        switch (this.g3) {
            case 0:
                mb1 mb1Var = ((mb1) this.h3).e.a;
                ThemeActivity themeActivity = mb1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.C == null || j6Var.R) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z4 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.C;
                            boolean z10 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = j6Var.C;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = j6Var.C;
                            boolean z11 = z10;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z10 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z4 = z11;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        dg.t1 t1Var = new dg.t1(12, mb1Var, j6Var);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.M = charSequenceArr;
                        d2Var.N = iArr;
                        d2Var.J = t1Var;
                        themeActivity.showDialog(d2Var);
                        if (z4) {
                            d2Var.l(d2Var.K0.size() - 1, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb1(mb1 mb1Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, p2Var, i10, arrayList, arrayList2);
        this.h3 = mb1Var;
    }
}
