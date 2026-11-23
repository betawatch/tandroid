package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j extends rg.b {
    public final /* synthetic */ k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return (i7 == 2 || i7 == 0) ? false : true;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.h.size();
    }

    @Override // v4.i0
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

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
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
        int i12 = f1Var.f;
        View view = f1Var.a;
        if (i12 == 0) {
            ((org.telegram.ui.Cells.o4) view).setText(iVar.c);
            return;
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (TextUtils.isEmpty(iVar.c)) {
                z8Var.setFixedSize(12);
                z8Var.setText(null);
                return;
            } else {
                z8Var.setFixedSize(0);
                z8Var.setText(iVar.c);
                return;
            }
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            int i13 = iVar.d;
            if (i13 == 1) {
                z10 = kVar.d.keep_archived_unmuted;
                r8Var.setCheckBoxIcon(0);
            } else if (i13 == 4) {
                z10 = kVar.d.keep_archived_folders;
                r8Var.setCheckBoxIcon(0);
            } else {
                if (i13 != 7) {
                    return;
                }
                boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                if (!kVar.getUserConfig().q() && !kVar.getMessagesController().b4) {
                    i11 = R.drawable.permission_locked;
                }
                r8Var.setCheckBoxIcon(i11);
                z10 = z12;
            }
            r8Var.f(iVar.c, z10, z11);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        k kVar = this.d;
        return new org.telegram.ui.Components.mj0(i7 == 0 ? new org.telegram.ui.Cells.o4(kVar.getParentActivity()) : i7 == 1 ? new org.telegram.ui.Cells.r8(kVar.getParentActivity()) : new org.telegram.ui.Cells.z8(kVar.getParentActivity()));
    }
}
