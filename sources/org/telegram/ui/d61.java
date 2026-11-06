package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d61 extends org.telegram.ui.Cells.ga {
    public final /* synthetic */ int q3 = 1;
    public final /* synthetic */ Object r3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(Context context, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, ArrayList arrayList2, h9.f1 f1Var) {
        super(context, f2Var, 2, arrayList, arrayList2);
        this.r3 = f1Var;
    }

    @Override // org.telegram.ui.Cells.ga
    public void C1(org.telegram.ui.ActionBar.j6 j6Var) {
        char c10;
        String str;
        int[] iArr;
        boolean z9;
        CharSequence[] charSequenceArr;
        switch (this.q3) {
            case 0:
                f61 f61Var = ((f61) this.r3).e.a;
                ThemeActivity themeActivity = f61Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((j6Var.F == null || j6Var.U) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (j6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.hd.M0(2131750859, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z9 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = j6Var.F;
                            boolean z10 = tL_theme == null || !tL_theme.isDefault;
                            String M0 = org.telegram.messenger.hd.M0(2131745460, "ShareFile");
                            String M02 = org.telegram.messenger.hd.M0(2131750859, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = j6Var.F;
                            String M03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? org.telegram.messenger.hd.M0(2131751336, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = j6Var.F;
                            String M04 = (tL_theme3 == null || !tL_theme3.creator) ? null : org.telegram.messenger.hd.M0(2131744146, "ThemeSetUrl");
                            if (z10) {
                                c10 = 1;
                                str = org.telegram.messenger.hd.M0(2131751599, "Delete");
                            } else {
                                c10 = 1;
                                str = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = M0;
                            charSequenceArr2[c10] = M02;
                            charSequenceArr2[2] = M03;
                            charSequenceArr2[3] = M04;
                            charSequenceArr2[4] = str;
                            int[] iArr2 = new int[5];
                            iArr2[0] = R.drawable.msg_share;
                            iArr2[c10] = R.drawable.msg_shareout;
                            iArr2[2] = R.drawable.msg_edit;
                            iArr2[3] = R.drawable.msg_link;
                            iArr2[4] = R.drawable.msg_delete;
                            iArr = iArr2;
                            z9 = z10;
                            charSequenceArr = charSequenceArr2;
                        }
                        og.j jVar = new og.j(13, f61Var, j6Var);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.P = charSequenceArr;
                        u1Var.Q = iArr;
                        u1Var.M = jVar;
                        themeActivity.showDialog(u1Var);
                        if (z9) {
                            u1Var.m(u1Var.N0.size() - 1, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ga
    public final void D1() {
        switch (this.q3) {
            case 0:
                ((f61) this.r3).e.F0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.v2) ((h9.f1) this.r3).b).x0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(f61 f61Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, f2Var, i7, arrayList, arrayList2);
        this.r3 = f61Var;
    }
}
