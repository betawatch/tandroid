package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e61 extends org.telegram.ui.Cells.ia {
    public final /* synthetic */ int r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(Context context, org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList, ArrayList arrayList2, hi.w4 w4Var) {
        super(context, h2Var, 2, arrayList, arrayList2);
        this.s3 = w4Var;
    }

    @Override // org.telegram.ui.Cells.ia
    public void C1(org.telegram.ui.ActionBar.m6 m6Var) {
        char c10;
        String str;
        int[] iArr;
        boolean z10;
        CharSequence[] charSequenceArr;
        switch (this.r3) {
            case 0:
                g61 g61Var = ((g61) this.s3).e.a;
                ThemeActivity themeActivity = g61Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((m6Var.G == null || m6Var.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (m6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.gd.M0(2131750847, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = m6Var.G;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String M0 = org.telegram.messenger.gd.M0(2131745264, "ShareFile");
                            String M02 = org.telegram.messenger.gd.M0(2131750847, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = m6Var.G;
                            String M03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? org.telegram.messenger.gd.M0(2131751324, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = m6Var.G;
                            String M04 = (tL_theme3 == null || !tL_theme3.creator) ? null : org.telegram.messenger.gd.M0(2131743910, "ThemeSetUrl");
                            if (z11) {
                                c10 = 1;
                                str = org.telegram.messenger.gd.M0(2131751587, "Delete");
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
                            z10 = z11;
                            charSequenceArr = charSequenceArr2;
                        }
                        og.j jVar = new og.j(13, g61Var, m6Var);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.Q = charSequenceArr;
                        u1Var.R = iArr;
                        u1Var.N = jVar;
                        themeActivity.showDialog(u1Var);
                        if (z10) {
                            u1Var.m(u1Var.O0.size() - 1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ia
    public final void D1() {
        switch (this.r3) {
            case 0:
                ((g61) this.s3).e.F0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.x2) ((hi.w4) this.s3).b).y0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e61(g61 g61Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, h2Var, i7, arrayList, arrayList2);
        this.s3 = g61Var;
    }
}
