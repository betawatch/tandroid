package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l extends xf.b {
    public final /* synthetic */ m d;

    public l(m mVar) {
        this.d = mVar;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return (i10 == 2 || i10 == 0) ? false : true;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.h.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 < 0) {
            return 0;
        }
        m mVar = this.d;
        if (i10 >= mVar.h.size()) {
            return 0;
        }
        return ((k) mVar.h.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        m mVar = this.d;
        ArrayList arrayList = mVar.h;
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        k kVar = (k) arrayList.get(i10);
        int i11 = i10 + 1;
        int i12 = 0;
        boolean z11 = i11 < arrayList.size() && ((k) arrayList.get(i11)).a == kVar.a;
        int i13 = o1Var.f;
        View view = o1Var.a;
        if (i13 == 0) {
            ((org.telegram.ui.Cells.j4) view).setText(kVar.c);
            return;
        }
        if (i13 == 2) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (TextUtils.isEmpty(kVar.c)) {
                x8Var.setFixedSize(12);
                x8Var.setText(null);
                return;
            } else {
                x8Var.setFixedSize(0);
                x8Var.setText(kVar.c);
                return;
            }
        }
        if (i13 == 1) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            int i14 = kVar.d;
            if (i14 == 1) {
                z10 = mVar.d.keep_archived_unmuted;
                p8Var.setCheckBoxIcon(0);
            } else if (i14 == 4) {
                z10 = mVar.d.keep_archived_folders;
                p8Var.setCheckBoxIcon(0);
            } else {
                if (i14 != 7) {
                    return;
                }
                boolean z12 = mVar.d.archive_and_mute_new_noncontact_peers;
                if (!mVar.getUserConfig().isPremium() && !mVar.getMessagesController().autoarchiveAvailable) {
                    i12 = R.drawable.permission_locked;
                }
                p8Var.setCheckBoxIcon(i12);
                z10 = z12;
            }
            p8Var.f(kVar.c, z10, z11);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        m mVar = this.d;
        return new org.telegram.ui.Components.lk0(i10 == 0 ? new org.telegram.ui.Cells.j4(mVar.getParentActivity()) : i10 == 1 ? new org.telegram.ui.Cells.p8(mVar.getParentActivity()) : new org.telegram.ui.Cells.x8(mVar.getParentActivity()));
    }
}
