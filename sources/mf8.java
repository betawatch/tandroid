// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mf8 implements hy1 {
    public final /* synthetic */ PopupNotificationActivity a;

    public mf8(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // hy1
    public final bu1 G() {
        return null;
    }

    @Override // hy1
    public final boolean H0() {
        return false;
    }

    @Override // hy1
    public final boolean Q0() {
        return false;
    }

    @Override // hy1
    public final boolean R() {
        return true;
    }

    @Override // hy1
    public final void W0() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        k27 k27Var = popupNotificationActivity.R;
        if (k27Var != null) {
            na7.q1(k27Var.K1).G4(0, popupNotificationActivity.L, k27.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override // hy1
    public final boolean g() {
        return false;
    }

    @Override // hy1
    public final int h() {
        return 0;
    }

    @Override // hy1
    public final TLRPC.Peer i() {
        return null;
    }

    @Override // hy1
    public final int o0() {
        return 0;
    }

    @Override // hy1
    public final TL_stories.StoryItem t0() {
        return null;
    }

    @Override // hy1
    public final void u(CharSequence charSequence, boolean z, int i, int i2, long j) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        ArrayList arrayList = popupNotificationActivity.b0;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i3 = popupNotificationActivity.T;
        if (i3 >= 0 && i3 < arrayList.size()) {
            arrayList.remove(popupNotificationActivity.T);
        }
        na7.q1(popupNotificationActivity.R.K1).k3(k27.B0(popupNotificationActivity.R.k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override // hy1
    public final TLRPC.TL_channels_sendAsPeers v() {
        return null;
    }

    @Override // hy1
    public final boolean x0(long j) {
        return false;
    }

    @Override // hy1
    public final boolean y0() {
        return false;
    }

    @Override // hy1
    public final void B() {
    }

    @Override // hy1
    public final void G0() {
    }

    @Override // hy1
    public final void I0() {
    }

    @Override // hy1
    public final void J() {
    }

    @Override // hy1
    public final void K0() {
    }

    @Override // hy1
    public final void L0() {
    }

    @Override // hy1
    public final void R0() {
    }

    @Override // hy1
    public final void T() {
    }

    @Override // hy1
    public final void Z() {
    }

    @Override // hy1
    public final void a() {
    }

    @Override // hy1
    public final void e() {
    }

    @Override // hy1
    public final void e1() {
    }

    @Override // hy1
    public final void f0() {
    }

    @Override // hy1
    public final void g1() {
    }

    @Override // hy1
    public final void j() {
    }

    @Override // hy1
    public final void n() {
    }

    @Override // hy1
    public final void o1() {
    }

    @Override // hy1
    public final void p1() {
    }

    @Override // hy1
    public final void r() {
    }

    @Override // hy1
    public final void s1() {
    }

    @Override // hy1
    public final void y() {
    }

    @Override // hy1
    public final void A(boolean z) {
    }

    @Override // hy1
    public final void P0(CharSequence charSequence) {
    }

    @Override // hy1
    public final void f1(int i) {
    }

    @Override // hy1
    public final void j1(boolean z) {
    }

    @Override // hy1
    public final void k(float f) {
    }

    @Override // hy1
    public final void m(boolean z) {
    }

    @Override // hy1
    public final void n0(int i) {
    }

    @Override // hy1
    public final void w(float f, int i) {
    }

    @Override // hy1
    public final void C0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override // hy1
    public final void O0(View view, CharSequence charSequence, boolean z) {
    }

    @Override // hy1
    public final void k1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
