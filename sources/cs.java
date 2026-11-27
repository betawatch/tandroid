// default package

import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cs extends la {
    public final /* synthetic */ ds d;

    public cs(ds dsVar) {
        this.d = dsVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return (i == 2 || i == 0) ? false : true;
    }

    @Override // j79
    public final int b() {
        return this.d.h.size();
    }

    @Override // j79
    public final int d(int i) {
        ArrayList arrayList = this.d.h;
        if (i < 0 || i >= arrayList.size()) {
            return 0;
        }
        return ((bs) arrayList.get(i)).a;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        boolean z;
        if (i < 0 || i >= this.d.h.size()) {
            return;
        }
        bs bsVar = (bs) this.d.h.get(i);
        int i2 = i + 1;
        int i3 = 0;
        boolean z2 = i2 < this.d.h.size() && ((bs) this.d.h.get(i2)).a == bsVar.a;
        int i4 = f89Var.f;
        if (i4 == 0) {
            ((mf5) f89Var.a).setText(bsVar.c);
            return;
        }
        if (i4 == 2) {
            ilb ilbVar = (ilb) f89Var.a;
            if (TextUtils.isEmpty(bsVar.c)) {
                ilbVar.setFixedSize(12);
                ilbVar.setText(null);
                return;
            } else {
                ilbVar.setFixedSize(0);
                ilbVar.setText(bsVar.c);
                return;
            }
        }
        if (i4 == 1) {
            wkb wkbVar = (wkb) f89Var.a;
            byte b = bsVar.d;
            if (b == 1) {
                z = this.d.d.keep_archived_unmuted;
                wkbVar.setCheckBoxIcon(0);
            } else if (b == 4) {
                z = this.d.d.keep_archived_folders;
                wkbVar.setCheckBoxIcon(0);
            } else {
                if (b != 7) {
                    return;
                }
                ds dsVar = this.d;
                boolean z3 = dsVar.d.archive_and_mute_new_noncontact_peers;
                if (!dsVar.getUserConfig().p() && !this.d.getMessagesController().k4.T0.f) {
                    i3 = R.drawable.permission_locked;
                }
                wkbVar.setCheckBoxIcon(i3);
                z = z3;
            }
            wkbVar.f(bsVar.c, z, z2);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        ds dsVar = this.d;
        return new n69(i == 0 ? new mf5(dsVar.getParentActivity()) : i == 1 ? new wkb(dsVar.getParentActivity()) : new ilb(dsVar.getParentActivity()));
    }
}
