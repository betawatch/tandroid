package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ q d;

    public p(q qVar, Context context) {
        this.d = qVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f == 0;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.C;
    }

    @Override // f2.q0
    public final int j(int i10) {
        q qVar = this.d;
        if (i10 >= qVar.x && i10 < qVar.y) {
            return 0;
        }
        if (i10 == qVar.A) {
            return 1;
        }
        return (i10 == qVar.B || i10 == qVar.w) ? 2 : 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        View view = o1Var.a;
        q qVar = this.d;
        a0.h hVar = qVar.a;
        ArrayList arrayList = qVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                if (i10 == qVar.w) {
                    x8Var.setTopPadding(17);
                    x8Var.setBottomPadding(10);
                    x8Var.setText(LocaleController.getString(qVar.D == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    x8Var.setTopPadding(10);
                    x8Var.setBottomPadding(17);
                    x8Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i12 = i10 - qVar.x;
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        wVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.lh0 lh0Var = wVar.f;
        i11 = ((org.telegram.ui.ActionBar.n2) qVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i11).isStickerPackInstalled(stickerSetCovered.set.id);
        wVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            hVar.l(stickerSetCovered.set.id);
            if (lh0Var != null) {
                lh0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (lh0Var != null) {
                lh0Var.a(z10, false);
            }
        }
        wVar.setOnCheckedChangeListener(new jh.z1(7, this, stickerSetCovered));
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View view = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = wVar;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.p4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.x8(context);
        }
        view.setLayoutParams(new f2.y0(-1, -2));
        return new org.telegram.ui.Components.lk0(view);
    }
}
