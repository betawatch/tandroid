package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class o extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ p d;

    public o(p pVar, Context context) {
        this.d = pVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        p pVar = this.d;
        if (i10 >= pVar.x && i10 < pVar.y) {
            return 0;
        }
        if (i10 == pVar.E) {
            return 1;
        }
        return (i10 == pVar.F || i10 == pVar.w) ? 2 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        p pVar = this.d;
        a0.i iVar = pVar.a;
        ArrayList arrayList = pVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == pVar.w) {
                    e9Var.setTopPadding(17);
                    e9Var.setBottomPadding(10);
                    e9Var.setText(LocaleController.getString(pVar.H == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    e9Var.setTopPadding(10);
                    e9Var.setBottomPadding(17);
                    e9Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i12 = i10 - pVar.x;
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        wVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.xh0 xh0Var = wVar.f;
        i11 = ((org.telegram.ui.ActionBar.n2) pVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i11).isStickerPackInstalled(stickerSetCovered.set.id);
        wVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            iVar.l(stickerSetCovered.set.id);
            if (xh0Var != null) {
                xh0Var.a(false, false);
            }
        } else {
            boolean z10 = iVar.h(stickerSetCovered.set.id) >= 0;
            if (xh0Var != null) {
                xh0Var.a(z10, false);
            }
        }
        wVar.setOnCheckedChangeListener(new ah.i0(28, this, stickerSetCovered));
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View view = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = wVar;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.r4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.e9(context);
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.vk0(view);
    }
}
