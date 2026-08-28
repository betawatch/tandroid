package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k extends wf.b {
    public final /* synthetic */ l d;

    public k(l lVar) {
        this.d = lVar;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 2 || i9 == 0) ? false : true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 < 0) {
            return 0;
        }
        l lVar = this.d;
        if (i9 >= lVar.h.size()) {
            return 0;
        }
        return ((j) lVar.h.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        l lVar = this.d;
        ArrayList arrayList = lVar.h;
        if (i9 < 0 || i9 >= arrayList.size()) {
            return;
        }
        j jVar = (j) arrayList.get(i9);
        int i10 = i9 + 1;
        int i11 = 0;
        boolean z11 = i10 < arrayList.size() && ((j) arrayList.get(i10)).a == jVar.a;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.m4) view).setText(jVar.c);
            return;
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (TextUtils.isEmpty(jVar.c)) {
                b9Var.setFixedSize(12);
                b9Var.setText(null);
                return;
            } else {
                b9Var.setFixedSize(0);
                b9Var.setText(jVar.c);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            int i13 = jVar.d;
            if (i13 == 1) {
                z10 = lVar.d.keep_archived_unmuted;
                t8Var.setCheckBoxIcon(0);
            } else if (i13 == 4) {
                z10 = lVar.d.keep_archived_folders;
                t8Var.setCheckBoxIcon(0);
            } else {
                if (i13 != 7) {
                    return;
                }
                boolean z12 = lVar.d.archive_and_mute_new_noncontact_peers;
                if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable) {
                    i11 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i11);
                z10 = z12;
            }
            t8Var.f(jVar.c, z10, z11);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        l lVar = this.d;
        return new org.telegram.ui.Components.ik0(i9 == 0 ? new org.telegram.ui.Cells.m4(lVar.getParentActivity()) : i9 == 1 ? new org.telegram.ui.Cells.t8(lVar.getParentActivity()) : new org.telegram.ui.Cells.b9(lVar.getParentActivity()));
    }
}
