package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a61 extends org.telegram.ui.Cells.ga {
    public final /* synthetic */ int r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(Context context, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, ArrayList arrayList2, org.telegram.messenger.ou ouVar) {
        super(context, e2Var, 2, arrayList, arrayList2);
        this.s3 = ouVar;
    }

    @Override // org.telegram.ui.Cells.ga
    public void C1(org.telegram.ui.ActionBar.i6 i6Var) {
        char c10;
        String str;
        int[] iArr;
        boolean z10;
        CharSequence[] charSequenceArr;
        switch (this.r3) {
            case 0:
                c61 c61Var = ((c61) this.s3).e.a;
                ThemeActivity themeActivity = c61Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((i6Var.G == null || i6Var.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (i6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.hd.M0(2131750858, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = i6Var.G;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String M0 = org.telegram.messenger.hd.M0(2131745459, "ShareFile");
                            String M02 = org.telegram.messenger.hd.M0(2131750858, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = i6Var.G;
                            String M03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? org.telegram.messenger.hd.M0(2131751335, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = i6Var.G;
                            String M04 = (tL_theme3 == null || !tL_theme3.creator) ? null : org.telegram.messenger.hd.M0(2131744145, "ThemeSetUrl");
                            if (z11) {
                                c10 = 1;
                                str = org.telegram.messenger.hd.M0(2131751598, "Delete");
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
                        og.j jVar = new og.j(13, c61Var, i6Var);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.Q = charSequenceArr;
                        t1Var.R = iArr;
                        t1Var.N = jVar;
                        themeActivity.showDialog(t1Var);
                        if (z10) {
                            t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.q7, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ga
    public final void D1() {
        switch (this.r3) {
            case 0:
                ((c61) this.s3).e.F0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.u2) ((org.telegram.messenger.ou) this.s3).b).y0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a61(c61 c61Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, e2Var, i7, arrayList, arrayList2);
        this.s3 = c61Var;
    }
}
