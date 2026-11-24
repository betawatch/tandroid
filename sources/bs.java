// default package

import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bs extends ka {
    public final /* synthetic */ cs d;

    public bs(cs csVar) {
        this.d = csVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 2 || i == 0) ? false : true;
    }

    @Override // w39
    public final int b() {
        return this.d.h.size();
    }

    @Override // w39
    public final int d(int i) {
        ArrayList arrayList = this.d.h;
        if (i < 0 || i >= arrayList.size()) {
            return 0;
        }
        return ((as) arrayList.get(i)).a;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        boolean z;
        if (i < 0 || i >= this.d.h.size()) {
            return;
        }
        as asVar = (as) this.d.h.get(i);
        int i2 = i + 1;
        int i3 = 0;
        boolean z2 = i2 < this.d.h.size() && ((as) this.d.h.get(i2)).a == asVar.a;
        int i4 = s49Var.f;
        if (i4 == 0) {
            ((ld5) s49Var.a).setText(asVar.c);
            return;
        }
        if (i4 == 2) {
            mhb mhbVar = (mhb) s49Var.a;
            if (TextUtils.isEmpty(asVar.c)) {
                mhbVar.setFixedSize(12);
                mhbVar.setText(null);
                return;
            } else {
                mhbVar.setFixedSize(0);
                mhbVar.setText(asVar.c);
                return;
            }
        }
        if (i4 == 1) {
            ahb ahbVar = (ahb) s49Var.a;
            byte b = asVar.d;
            if (b == 1) {
                z = this.d.d.keep_archived_unmuted;
                ahbVar.setCheckBoxIcon(0);
            } else if (b == 4) {
                z = this.d.d.keep_archived_folders;
                ahbVar.setCheckBoxIcon(0);
            } else {
                if (b != 7) {
                    return;
                }
                cs csVar = this.d;
                boolean z3 = csVar.d.archive_and_mute_new_noncontact_peers;
                if (!csVar.getUserConfig().p() && !this.d.getMessagesController().k4.L0.f) {
                    i3 = R.drawable.permission_locked;
                }
                ahbVar.setCheckBoxIcon(i3);
                z = z3;
            }
            ahbVar.f(asVar.c, z, z2);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        cs csVar = this.d;
        return new y29(i == 0 ? new ld5(csVar.getParentActivity()) : i == 1 ? new ahb(csVar.getParentActivity()) : new mhb(csVar.getParentActivity()));
    }
}
