package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ p d;

    public o(p pVar, Context context) {
        this.d = pVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.C;
    }

    @Override // f2.r0
    public final int j(int i9) {
        p pVar = this.d;
        if (i9 >= pVar.x && i9 < pVar.y) {
            return 0;
        }
        if (i9 == pVar.A) {
            return 1;
        }
        return (i9 == pVar.B || i9 == pVar.w) ? 2 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        View view = q1Var.a;
        p pVar = this.d;
        a0.h hVar = pVar.a;
        ArrayList arrayList = pVar.h;
        if (j(i9) != 0) {
            if (j(i9) == 2) {
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                if (i9 == pVar.w) {
                    b9Var.setTopPadding(17);
                    b9Var.setBottomPadding(10);
                    b9Var.setText(LocaleController.getString(pVar.D == 5 ? R.string.ArchivedEmojiInfo : R.string.ArchivedStickersInfo));
                    return;
                } else {
                    b9Var.setTopPadding(10);
                    b9Var.setBottomPadding(17);
                    b9Var.setText(null);
                    return;
                }
            }
            return;
        }
        int i11 = i9 - pVar.x;
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i11);
        wVar.b(stickerSetCovered, i11 != arrayList.size() - 1);
        org.telegram.ui.Components.jh0 jh0Var = wVar.f;
        i10 = ((org.telegram.ui.ActionBar.o2) pVar).currentAccount;
        boolean isStickerPackInstalled = MediaDataController.getInstance(i10).isStickerPackInstalled(stickerSetCovered.set.id);
        wVar.a(isStickerPackInstalled, false, false);
        if (isStickerPackInstalled) {
            hVar.l(stickerSetCovered.set.id);
            if (jh0Var != null) {
                jh0Var.a(false, false);
            }
        } else {
            boolean z10 = hVar.h(stickerSetCovered.set.id) >= 0;
            if (jh0Var != null) {
                jh0Var.a(z10, false);
            }
        }
        wVar.setOnCheckedChangeListener(new ih.v3(7, this, stickerSetCovered));
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        View view = null;
        if (i9 == 0) {
            org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(context, true);
            wVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            view = wVar;
        } else if (i9 == 1) {
            view = new org.telegram.ui.Cells.s4(context);
        } else if (i9 == 2) {
            view = new org.telegram.ui.Cells.b9(context);
        }
        view.setLayoutParams(new f2.a1(-1, -2));
        return new org.telegram.ui.Components.ik0(view);
    }
}
