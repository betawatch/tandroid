package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class n extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ o d;

    public n(o oVar, Context context) {
        this.d = oVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.G;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        View view = b1Var.a;
        o oVar = this.d;
        a0.h hVar = oVar.a;
        ArrayList arrayList = oVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == oVar.w) {
                    e9Var.setTopPadding(17);
                    e9Var.setBottomPadding(10);
                    e9Var.setText(LocaleController.getString(oVar.H == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
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
        int i12 = i10 - oVar.x;
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        vVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.xi0 xi0Var = vVar.f;
        i11 = ((org.telegram.ui.ActionBar.o2) oVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i11).isStickerPackInstalled(stickerSetCovered.set.id);
        vVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            hVar.l(stickerSetCovered.set.id);
            if (xi0Var != null) {
                xi0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (xi0Var != null) {
                xi0Var.a(z10, false);
            }
        }
        vVar.setOnCheckedChangeListener(new m4.w0(4, this, stickerSetCovered));
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View view = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(context, true);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, vVar, null);
            view = vVar;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.r4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.e9(context);
        }
        view.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(view);
    }
}
