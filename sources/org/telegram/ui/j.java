package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j extends rg.b {
    public final /* synthetic */ k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return (i7 == 2 || i7 == 0) ? false : true;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.h.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 < 0) {
            return 0;
        }
        k kVar = this.d;
        if (i7 >= kVar.h.size()) {
            return 0;
        }
        return ((i) kVar.h.get(i7)).a;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        k kVar = this.d;
        ArrayList arrayList = kVar.h;
        if (i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        i iVar = (i) arrayList.get(i7);
        int i10 = i7 + 1;
        int i11 = 0;
        boolean z11 = i10 < arrayList.size() && ((i) arrayList.get(i10)).a == iVar.a;
        int i12 = e1Var.f;
        View view = e1Var.a;
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

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        k kVar = this.d;
        return new org.telegram.ui.Components.cj0(i7 == 0 ? new org.telegram.ui.Cells.n4(kVar.getParentActivity()) : i7 == 1 ? new org.telegram.ui.Cells.q8(kVar.getParentActivity()) : new org.telegram.ui.Cells.y8(kVar.getParentActivity()));
    }
}
