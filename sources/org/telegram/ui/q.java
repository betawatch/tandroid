package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ r d;

    public q(r rVar, Context context) {
        this.d = rVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 0;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.D;
    }

    @Override // f2.o0
    public final int j(int i10) {
        r rVar = this.d;
        if (i10 >= rVar.x && i10 < rVar.y) {
            return 0;
        }
        if (i10 == rVar.B) {
            return 1;
        }
        return (i10 == rVar.C || i10 == rVar.w) ? 2 : 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        View view = l1Var.a;
        r rVar = this.d;
        a0.h hVar = rVar.a;
        ArrayList arrayList = rVar.h;
        if (j(i10) != 0) {
            if (j(i10) == 2) {
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                if (i10 == rVar.w) {
                    a9Var.setTopPadding(17);
                    a9Var.setBottomPadding(10);
                    a9Var.setText(LocaleController.getString(rVar.E == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    a9Var.setTopPadding(10);
                    a9Var.setBottomPadding(17);
                    a9Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i12 = i10 - rVar.x;
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i12);
        wVar.b(stickerSetCovered, i12 != arrayList.size() - 1);
        org.telegram.ui.Components.ei0 ei0Var = wVar.f;
        i11 = ((org.telegram.ui.ActionBar.p2) rVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i11).isStickerPackInstalled(stickerSetCovered.set.id);
        wVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            hVar.l(stickerSetCovered.set.id);
            if (ei0Var != null) {
                ei0Var.a(false, false);
            }
        } else {
            boolean z4 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (ei0Var != null) {
                ei0Var.a(z4, false);
            }
        }
        wVar.setOnCheckedChangeListener(new mg.w(6, this, stickerSetCovered));
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        View view = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            view = wVar;
        } else if (i10 == 1) {
            view = new org.telegram.ui.Cells.s4(context);
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.a9(context);
        }
        view.setLayoutParams(new f2.w0(-1, -2));
        return new org.telegram.ui.Components.el0(view);
    }
}
