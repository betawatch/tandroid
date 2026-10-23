package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class j extends pg.b {
    public final /* synthetic */ k d;

    public j(k kVar) {
        this.d = kVar;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 2 || i10 == 0) ? false : true;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.h.size();
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
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
        int i13 = b1Var.f;
        View view = b1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.l4) view).setText(iVar.c);
            return;
        }
        if (i13 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (TextUtils.isEmpty(iVar.c)) {
                e9Var.setFixedSize(12);
                e9Var.setText(null);
                return;
            } else {
                e9Var.setFixedSize(0);
                e9Var.setText(iVar.c);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            int i14 = iVar.d;
            if (i14 == 1) {
                z10 = kVar.d.keep_archived_unmuted;
                w8Var.setCheckBoxIcon(0);
            } else if (i14 == 4) {
                z10 = kVar.d.keep_archived_folders;
                w8Var.setCheckBoxIcon(0);
            } else {
                if (i14 != 7) {
                    return;
                }
                boolean z12 = kVar.d.archive_and_mute_new_noncontact_peers;
                if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable) {
                    i12 = R.drawable.permission_locked;
                }
                w8Var.setCheckBoxIcon(i12);
                z10 = z12;
            }
            w8Var.f(iVar.c, z10, z11);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        k kVar = this.d;
        return new org.telegram.ui.Components.wl0(i10 == 0 ? new org.telegram.ui.Cells.l4(kVar.getParentActivity()) : i10 == 1 ? new org.telegram.ui.Cells.w8(kVar.getParentActivity()) : new org.telegram.ui.Cells.e9(kVar.getParentActivity()));
    }
}
