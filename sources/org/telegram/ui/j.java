package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j extends qg.b {
    public final /* synthetic */ k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 2 || i10 == 0) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.h.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 < 0) {
            return 0;
        }
        k kVar = this.d;
        if (i10 >= kVar.h.size()) {
            return 0;
        }
        return ((i) kVar.h.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        i iVar = (i) arrayList.get(i10);
        int i11 = i10 + 1;
        int i12 = 0;
        boolean z11 = i11 < arrayList.size() && ((i) arrayList.get(i11)).a == iVar.a;
        int i13 = e1Var.f;
        View view = e1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.q4) view).setText(iVar.c);
            return;
        }
        if (i13 == 2) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (TextUtils.isEmpty(iVar.c)) {
                i9Var.setFixedSize(12);
                i9Var.setText(null);
                return;
            } else {
                i9Var.setFixedSize(0);
                i9Var.setText(iVar.c);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            int i14 = iVar.d;
            if (i14 == 1) {
                z10 = kVar.d.keep_archived_unmuted;
                a9Var.setCheckBoxIcon(0);
            } else if (i14 == 4) {
                z10 = kVar.d.keep_archived_folders;
                a9Var.setCheckBoxIcon(0);
            } else {
                if (i14 != 7) {
                    return;
                }
                boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable) {
                    i12 = R.drawable.permission_locked;
                }
                a9Var.setCheckBoxIcon(i12);
                z10 = z12;
            }
            a9Var.f(iVar.c, z10, z11);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        k kVar = this.d;
        return new org.telegram.ui.Components.vl0(i10 == 0 ? new org.telegram.ui.Cells.q4(kVar.getParentActivity()) : i10 == 1 ? new org.telegram.ui.Cells.a9(kVar.getParentActivity()) : new org.telegram.ui.Cells.i9(kVar.getParentActivity()));
    }
}
