package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class jc1 extends org.telegram.ui.Cells.na {
    public final /* synthetic */ int h3 = 1;
    public final /* synthetic */ Object i3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(Context context, org.telegram.ui.ActionBar.m2 m2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.ActionBar.z2 z2Var) {
        super(context, m2Var, 2, arrayList, arrayList2);
        this.i3 = z2Var;
    }

    @Override // org.telegram.ui.Cells.na
    public void A1(org.telegram.ui.ActionBar.f6 f6Var) {
        CharSequence[] charSequenceArr;
        boolean z10;
        int[] iArr;
        switch (this.h3) {
            case 0:
                mc1 mc1Var = ((mc1) this.i3).e.a;
                ThemeActivity themeActivity = mc1Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((f6Var.F == null || f6Var.U) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (f6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, LocaleController.getString("ExportTheme", R.string.ExportTheme)};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = f6Var.F;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String string = LocaleController.getString("ShareFile", R.string.ShareFile);
                            String string2 = LocaleController.getString("ExportTheme", R.string.ExportTheme);
                            TLRPC.TL_theme tL_theme2 = f6Var.F;
                            String string3 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? LocaleController.getString("Edit", R.string.Edit) : null;
                            TLRPC.TL_theme tL_theme3 = f6Var.F;
                            boolean z12 = z11;
                            charSequenceArr = new CharSequence[]{string, string2, string3, (tL_theme3 == null || !tL_theme3.creator) ? null : LocaleController.getString("ThemeSetUrl", R.string.ThemeSetUrl), z11 ? LocaleController.getString("Delete", R.string.Delete) : null};
                            z10 = z12;
                            iArr = new int[]{R.drawable.msg_share, R.drawable.msg_shareout, R.drawable.msg_edit, R.drawable.msg_link, R.drawable.msg_delete};
                        }
                        mg.j jVar = new mg.j(13, mc1Var, f6Var);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                        a2Var.P = charSequenceArr;
                        a2Var.Q = iArr;
                        a2Var.M = jVar;
                        themeActivity.showDialog(a2Var);
                        if (z10) {
                            a2Var.l(a2Var.N0.size() - 1, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.na
    public final void B1() {
        Runnable runnable;
        switch (this.h3) {
            case 0:
                ((mc1) this.i3).e.A0(false);
                break;
            default:
                runnable = ((org.telegram.ui.ActionBar.z2) this.i3).a.dismissRunnable;
                runnable.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(mc1 mc1Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, int i10, ArrayList arrayList, ArrayList arrayList2) {
        super(context, m2Var, i10, arrayList, arrayList2);
        this.i3 = mc1Var;
    }
}
