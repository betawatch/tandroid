package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c61 extends org.telegram.ui.Cells.ja {
    public final /* synthetic */ int r3 = 1;
    public final /* synthetic */ Object s3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(Context context, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, ArrayList arrayList2, h6.o oVar) {
        super(context, g2Var, 2, arrayList, arrayList2);
        this.s3 = oVar;
    }

    @Override // org.telegram.ui.Cells.ja
    public void C1(org.telegram.ui.ActionBar.m6 m6Var) {
        char c10;
        String str;
        int[] iArr;
        boolean z10;
        CharSequence[] charSequenceArr;
        switch (this.r3) {
            case 0:
                e61 e61Var = ((e61) this.s3).e.a;
                ThemeActivity themeActivity = e61Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if ((m6Var.G == null || m6Var.V) && themeActivity.f != 1) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                        if (m6Var.b == null) {
                            charSequenceArr = new CharSequence[]{null, org.telegram.messenger.gd.N0(2131750846, "ExportTheme")};
                            iArr = new int[]{0, R.drawable.msg_shareout};
                            z10 = false;
                        } else {
                            TLRPC.TL_theme tL_theme = m6Var.G;
                            boolean z11 = tL_theme == null || !tL_theme.isDefault;
                            String N0 = org.telegram.messenger.gd.N0(2131745263, "ShareFile");
                            String N02 = org.telegram.messenger.gd.N0(2131750846, "ExportTheme");
                            TLRPC.TL_theme tL_theme2 = m6Var.G;
                            String N03 = (tL_theme2 == null || (!tL_theme2.isDefault && tL_theme2.creator)) ? org.telegram.messenger.gd.N0(2131751323, "Edit") : null;
                            TLRPC.TL_theme tL_theme3 = m6Var.G;
                            String N04 = (tL_theme3 == null || !tL_theme3.creator) ? null : org.telegram.messenger.gd.N0(2131743900, "ThemeSetUrl");
                            if (z11) {
                                c10 = 1;
                                str = org.telegram.messenger.gd.N0(2131751586, "Delete");
                            } else {
                                c10 = 1;
                                str = null;
                            }
                            CharSequence[] charSequenceArr2 = new CharSequence[5];
                            charSequenceArr2[0] = N0;
                            charSequenceArr2[c10] = N02;
                            charSequenceArr2[2] = N03;
                            charSequenceArr2[3] = N04;
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
                        og.j jVar = new og.j(13, e61Var, m6Var);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                        t1Var.Q = charSequenceArr;
                        t1Var.R = iArr;
                        t1Var.N = jVar;
                        themeActivity.showDialog(t1Var);
                        if (z10) {
                            t1Var.m(t1Var.O0.size() - 1, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q7, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.p7, false));
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Cells.ja
    public final void D1() {
        switch (this.r3) {
            case 0:
                ((e61) this.s3).e.F0(false);
                break;
            default:
                ((org.telegram.ui.ActionBar.w2) ((h6.o) this.s3).b).y0.run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c61(e61 e61Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, ArrayList arrayList, ArrayList arrayList2) {
        super(context, g2Var, i7, arrayList, arrayList2);
        this.s3 = e61Var;
    }
}
