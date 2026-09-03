package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m extends bg.c {
    public final /* synthetic */ n d;

    public m(n nVar) {
        this.d = nVar;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return (i10 == 2 || i10 == 0) ? false : true;
    }

    @Override // f2.o0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 < 0) {
            return 0;
        }
        n nVar = this.d;
        if (i10 >= nVar.h.size()) {
            return 0;
        }
        return ((l) nVar.h.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        n nVar = this.d;
        ArrayList arrayList = nVar.h;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        l lVar = (l) arrayList.get(i10);
        int i11 = i10 + 1;
        int i12 = 0;
        boolean z10 = i11 < arrayList.size() && ((l) arrayList.get(i11)).a == lVar.a;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(lVar.c);
            return;
        }
        if (i13 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (TextUtils.isEmpty(lVar.c)) {
                z8Var.setFixedSize(12);
                z8Var.setText(null);
                return;
            } else {
                z8Var.setFixedSize(0);
                z8Var.setText(lVar.c);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            int i14 = lVar.d;
            if (i14 == 1) {
                z4 = nVar.d.keep_archived_unmuted;
                r8Var.setCheckBoxIcon(0);
            } else if (i14 == 4) {
                z4 = nVar.d.keep_archived_folders;
                r8Var.setCheckBoxIcon(0);
            } else {
                if (i14 != 7) {
                    return;
                }
                boolean z11 = nVar.d.archive_and_mute_new_noncontact_peers;
                if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable) {
                    i12 = R.drawable.permission_locked;
                }
                r8Var.setCheckBoxIcon(i12);
                z4 = z11;
            }
            r8Var.f(lVar.c, z4, z10);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        n nVar = this.d;
        return new org.telegram.ui.Components.dl0(i10 == 0 ? new org.telegram.ui.Cells.l4(nVar.getParentActivity()) : i10 == 1 ? new org.telegram.ui.Cells.r8(nVar.getParentActivity()) : new org.telegram.ui.Cells.z8(nVar.getParentActivity()));
    }
}
