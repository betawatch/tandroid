// default package

import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bt extends ka {
    public final /* synthetic */ ct d;

    public bt(ct ctVar) {
        this.d = ctVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 2 || i == 0) ? false : true;
    }

    @Override // y59
    public final int b() {
        return this.d.h.size();
    }

    @Override // y59
    public final int d(int i) {
        ArrayList arrayList = this.d.h;
        if (i < 0 || i >= arrayList.size()) {
            return 0;
        }
        return ((at) arrayList.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        boolean z;
        if (i < 0 || i >= this.d.h.size()) {
            return;
        }
        at atVar = (at) this.d.h.get(i);
        int i2 = i + 1;
        int i3 = 0;
        boolean z2 = i2 < this.d.h.size() && ((at) this.d.h.get(i2)).a == atVar.a;
        int i4 = u69Var.f;
        if (i4 == 0) {
            ((jf5) u69Var.a).setText(atVar.c);
            return;
        }
        if (i4 == 2) {
            njb njbVar = (njb) u69Var.a;
            if (TextUtils.isEmpty(atVar.c)) {
                njbVar.setFixedSize(12);
                njbVar.setText(null);
                return;
            } else {
                njbVar.setFixedSize(0);
                njbVar.setText(atVar.c);
                return;
            }
        }
        if (i4 == 1) {
            bjb bjbVar = (bjb) u69Var.a;
            byte b = atVar.d;
            if (b == 1) {
                z = this.d.d.keep_archived_unmuted;
                bjbVar.setCheckBoxIcon(0);
            } else if (b == 4) {
                z = this.d.d.keep_archived_folders;
                bjbVar.setCheckBoxIcon(0);
            } else {
                if (b != 7) {
                    return;
                }
                ct ctVar = this.d;
                boolean z3 = ctVar.d.archive_and_mute_new_noncontact_peers;
                if (!ctVar.getUserConfig().p() && !this.d.getMessagesController().l4.L0.f) {
                    i3 = R.drawable.permission_locked;
                }
                bjbVar.setCheckBoxIcon(i3);
                z = z3;
            }
            bjbVar.f(atVar.c, z, z2);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ct ctVar = this.d;
        return new b59(i == 0 ? new jf5(ctVar.getParentActivity()) : i == 1 ? new bjb(ctVar.getParentActivity()) : new njb(ctVar.getParentActivity()));
    }
}
