package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class dc1 extends org.telegram.ui.Cells.qa {
    public final /* synthetic */ int j3 = 1;
    public final /* synthetic */ Object k3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(Context context, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.a3 a3Var) {
        super(context, n2Var, 2, arrayList, arrayList2);
        this.k3 = a3Var;
    }

    @Override // org.telegram.ui.Cells.qa
    public final void A1() {
        Runnable runnable;
        switch (this.j3) {
            case 0:
                ((gc1) this.k3).e.A0(false);
                break;
            default:
                runnable = ((org.telegram.ui.ActionBar.a3) this.k3).a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    @Override // org.telegram.ui.Cells.qa
    public void z1(org.telegram.ui.ActionBar.h6 h6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.j3) {
            case 0:
                gc1 gc1Var = ((gc1) this.k3).e.a;
                ThemeActivity themeActivity = gc1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((h6Var.F == null || h6Var.U) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (h6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = h6Var.F;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = h6Var.F;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = h6Var.F;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        lg.j jVar = new lg.j(12, gc1Var, h6Var);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                        b2Var.P = charSequenceArr;
                        b2Var.Q = iArr;
                        b2Var.M = jVar;
                        themeActivity.showDialog(b2Var);
                        if (z10) {
                            b2Var.l(b2Var.N0.size() - 1, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(gc1 gc1Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, n2Var, i10, arrayList, arrayList2);
        this.k3 = gc1Var;
    }
}
