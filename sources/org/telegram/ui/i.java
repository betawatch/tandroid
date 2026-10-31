package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends hg.c {
    public final /* synthetic */ j d;

    public i(j jVar) {
        this.d = jVar;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 2 || i10 == 0) ? false : true;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.h.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 < 0) {
            return 0;
        }
        j jVar = this.d;
        if (i10 >= jVar.h.size()) {
            return 0;
        }
        return ((h) jVar.h.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        j jVar = this.d;
        ArrayList arrayList = jVar.h;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        h hVar = (h) arrayList.get(i10);
        int i11 = i10 + 1;
        int i12 = 0;
        boolean z11 = i11 < arrayList.size() && ((h) arrayList.get(i11)).a == hVar.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.p4) view).setText(hVar.c);
            return;
        }
        if (i13 == 2) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (TextUtils.isEmpty(hVar.c)) {
                b9Var.setFixedSize(12);
                b9Var.setText(null);
                return;
            } else {
                b9Var.setFixedSize(0);
                b9Var.setText(hVar.c);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            int i14 = hVar.d;
            if (i14 == 1) {
                z10 = jVar.d.keep_archived_unmuted;
                t8Var.setCheckBoxIcon(0);
            } else if (i14 == 4) {
                z10 = jVar.d.keep_archived_folders;
                t8Var.setCheckBoxIcon(0);
            } else {
                if (i14 != 7) {
                    return;
                }
                boolean z12 = jVar.d.archive_and_mute_new_noncontact_peers;
                if (!jVar.getUserConfig().q() && !jVar.getMessagesController().a4) {
                    i12 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i12);
                z10 = z12;
            }
            t8Var.f(hVar.c, z10, z11);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        j jVar = this.d;
        return new org.telegram.ui.Components.ck0(i10 == 0 ? new org.telegram.ui.Cells.p4(jVar.getParentActivity()) : i10 == 1 ? new org.telegram.ui.Cells.t8(jVar.getParentActivity()) : new org.telegram.ui.Cells.b9(jVar.getParentActivity()));
    }
}
