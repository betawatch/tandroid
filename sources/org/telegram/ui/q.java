package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ r d;

    public q(r rVar, Context context) {
        this.d = rVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return n1Var.f == 0;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.C;
    }

    @Override // f2.p0
    public final int j(int i10) {
        r rVar = this.d;
        if (i10 >= rVar.x && i10 < rVar.y) {
            return 0;
        }
        if (i10 == rVar.A) {
            return 1;
        }
        return (i10 == rVar.B || i10 == rVar.w) ? 2 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        View view = n1Var.a;
        r rVar = this.d;
        a0.h hVar = rVar.a;
        ArrayList arrayList = rVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                if (i10 == rVar.w) {
                    y8Var.setTopPadding(17);
                    y8Var.setBottomPadding(10);
                    y8Var.setText(LocaleController.getString(rVar.D == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    y8Var.setTopPadding(10);
                    y8Var.setBottomPadding(17);
                    y8Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i12 = i10 - rVar.x;
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        wVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.th0 th0Var = wVar.f;
        i11 = ((org.telegram.ui.ActionBar.o2) rVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i11).isStickerPackInstalled(stickerSetCovered.set.id);
        wVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            hVar.l(stickerSetCovered.set.id);
            if (th0Var != null) {
                th0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (th0Var != null) {
                th0Var.a(z10, false);
            }
        }
        wVar.setOnCheckedChangeListener(new kg.w(7, this, stickerSetCovered));
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View view = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            view = wVar;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.q4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.y8(context);
        }
        view.setLayoutParams(new f2.x0(-1, -2));
        return new org.telegram.ui.Components.vk0(view);
    }
}
