package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m extends zf.b {
    public final /* synthetic */ n d;

    public m(n nVar) {
        this.d = nVar;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 2 || i10 == 0) ? false : true;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        n nVar = this.d;
        ArrayList arrayList = nVar.h;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        l lVar = (l) arrayList.get(i10);
        int i11 = i10 + 1;
        int i12 = 0;
        boolean z11 = i11 < arrayList.size() && ((l) arrayList.get(i11)).a == lVar.a;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.k4) view).setText(lVar.c);
            return;
        }
        if (i13 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (TextUtils.isEmpty(lVar.c)) {
                y8Var.setFixedSize(12);
                y8Var.setText(null);
                return;
            } else {
                y8Var.setFixedSize(0);
                y8Var.setText(lVar.c);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            int i14 = lVar.d;
            if (i14 == 1) {
                z10 = nVar.d.keep_archived_unmuted;
                q8Var.setCheckBoxIcon(0);
            } else if (i14 == 4) {
                z10 = nVar.d.keep_archived_folders;
                q8Var.setCheckBoxIcon(0);
            } else {
                if (i14 != 7) {
                    return;
                }
                boolean z12 = nVar.d.archive_and_mute_new_noncontact_peers;
                if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable) {
                    i12 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i12);
                z10 = z12;
            }
            q8Var.f(lVar.c, z10, z11);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        n nVar = this.d;
        return new org.telegram.ui.Components.vk0(i10 == 0 ? new org.telegram.ui.Cells.k4(nVar.getParentActivity()) : i10 == 1 ? new org.telegram.ui.Cells.q8(nVar.getParentActivity()) : new org.telegram.ui.Cells.y8(nVar.getParentActivity()));
    }
}
