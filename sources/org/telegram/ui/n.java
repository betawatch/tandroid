package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        o oVar = this.d;
        if (i10 >= oVar.x && i10 < oVar.y) {
            return 0;
        }
        if (i10 == oVar.E) {
            return 1;
        }
        return (i10 == oVar.F || i10 == oVar.w) ? 2 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        View view = e1Var.a;
        o oVar = this.d;
        a0.h hVar = oVar.a;
        ArrayList arrayList = oVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                if (i10 == oVar.w) {
                    i9Var.setTopPadding(17);
                    i9Var.setBottomPadding(10);
                    i9Var.setText(LocaleController.getString(oVar.H == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    i9Var.setTopPadding(10);
                    i9Var.setBottomPadding(17);
                    i9Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i12 = i10 - oVar.x;
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        vVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.wi0 wi0Var = vVar.f;
        i11 = ((org.telegram.ui.ActionBar.r2) oVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i11).isStickerPackInstalled(stickerSetCovered.set.id);
        vVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            hVar.l(stickerSetCovered.set.id);
            if (wi0Var != null) {
                wi0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (wi0Var != null) {
                wi0Var.a(z10, false);
            }
        }
        vVar.setOnCheckedChangeListener(new m4.s0(6, this, stickerSetCovered));
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View view = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, vVar, null);
            view = vVar;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.w4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.i9(context);
        }
        view.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.vl0(view);
    }
}
