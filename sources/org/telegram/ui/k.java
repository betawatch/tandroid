package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class k extends pg.b {
    public final /* synthetic */ l d;

    public k(l lVar) {
        this.d = lVar;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
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
        l lVar = this.d;
        if (i10 >= lVar.h.size()) {
            return 0;
        }
        return ((j) lVar.h.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        l lVar = this.d;
        ArrayList arrayList = lVar.h;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        j jVar = (j) arrayList.get(i10);
        int i11 = i10 + 1;
        int i12 = 0;
        boolean z11 = i11 < arrayList.size() && ((j) arrayList.get(i11)).a == jVar.a;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(jVar.c);
            return;
        }
        if (i13 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (TextUtils.isEmpty(jVar.c)) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            } else {
                e9Var.setFixedSize(0);
                e9Var.setText(jVar.c);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            int i14 = jVar.d;
            if (i14 == 1) {
                z10 = lVar.d.keep_archived_unmuted;
                w8Var.setCheckBoxIcon(0);
            } else if (i14 == 4) {
                z10 = lVar.d.keep_archived_folders;
                w8Var.setCheckBoxIcon(0);
            } else {
                if (i14 != 7) {
                    return;
                }
                boolean z12 = lVar.d.archive_and_mute_new_noncontact_peers;
                if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable) {
                    i12 = R.drawable.permission_locked;
                }
                w8Var.setCheckBoxIcon(i12);
                z10 = z12;
            }
            w8Var.f(jVar.c, z10, z11);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        l lVar = this.d;
        return new org.telegram.ui.Components.vk0(i10 == 0 ? new org.telegram.ui.Cells.l4(lVar.getParentActivity()) : i10 == 1 ? new org.telegram.ui.Cells.w8(lVar.getParentActivity()) : new org.telegram.ui.Cells.e9(lVar.getParentActivity()));
    }
}
