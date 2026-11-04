package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j extends sg.b {
    public final /* synthetic */ k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 2 || i3 == 0) ? false : true;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.h.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 < 0) {
            return 0;
        }
        k kVar = this.d;
        if (i3 >= kVar.h.size()) {
            return 0;
        }
        return ((i) kVar.h.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i3 < 0 || i3 >= arrayList.size()) {
            return;
        }
        i iVar = (i) arrayList.get(i3);
        int i10 = i3 + 1;
        int i11 = 0;
        boolean z11 = i10 < arrayList.size() && ((i) arrayList.get(i10)).a == iVar.a;
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.n4) view).setText(iVar.c);
            return;
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (TextUtils.isEmpty(iVar.c)) {
                y8Var.setFixedSize(12);
                y8Var.setText(null);
                return;
            } else {
                y8Var.setFixedSize(0);
                y8Var.setText(iVar.c);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            int i13 = iVar.d;
            if (i13 == 1) {
                z10 = kVar.d.keep_archived_unmuted;
                q8Var.setCheckBoxIcon(0);
            } else if (i13 == 4) {
                z10 = kVar.d.keep_archived_folders;
                q8Var.setCheckBoxIcon(0);
            } else {
                if (i13 != 7) {
                    return;
                }
                boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                if (!kVar.getUserConfig().q() && !kVar.getMessagesController().Z3) {
                    i11 = R.drawable.permission_locked;
                }
                q8Var.setCheckBoxIcon(i11);
                z10 = z12;
            }
            q8Var.f(iVar.c, z10, z11);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        k kVar = this.d;
        return new org.telegram.ui.Components.bj0(i3 == 0 ? new org.telegram.ui.Cells.n4(kVar.getParentActivity()) : i3 == 1 ? new org.telegram.ui.Cells.q8(kVar.getParentActivity()) : new org.telegram.ui.Cells.y8(kVar.getParentActivity()));
    }
}
