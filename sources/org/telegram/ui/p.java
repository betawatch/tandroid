package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ q d;

    public p(q qVar, Context context) {
        this.d = qVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.h0
    public final int j(int i10) {
        q qVar = this.d;
        if (i10 >= qVar.x && i10 < qVar.y) {
            return 0;
        }
        if (i10 == qVar.E) {
            return 1;
        }
        return (i10 == qVar.F || i10 == qVar.w) ? 2 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        View view = c1Var.a;
        q qVar = this.d;
        a0.i iVar = qVar.a;
        ArrayList arrayList = qVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == qVar.w) {
                    f9Var.setTopPadding(17);
                    f9Var.setBottomPadding(10);
                    f9Var.setText(LocaleController.getString(qVar.H == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    f9Var.setTopPadding(10);
                    f9Var.setBottomPadding(17);
                    f9Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i12 = i10 - qVar.x;
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        wVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.hi0 hi0Var = wVar.f;
        i11 = ((org.telegram.ui.ActionBar.p2) qVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i11).isStickerPackInstalled(stickerSetCovered.set.id);
        wVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            iVar.l(stickerSetCovered.set.id);
            if (hi0Var != null) {
                hi0Var.a(false, false);
            }
        } else {
            boolean z10 = iVar.h(stickerSetCovered.set.id) >= 0;
            if (hi0Var != null) {
                hi0Var.a(z10, false);
            }
        }
        wVar.setOnCheckedChangeListener(new bi.cb(23, this, stickerSetCovered));
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
            view = new org.telegram.ui.Cells.s4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.f9(context);
        }
        view.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.fl0(view);
    }
}
