// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oh8 implements uz1 {
    public final /* synthetic */ PopupNotificationActivity a;

    public oh8(PopupNotificationActivity popupNotificationActivity) {
        this.a = popupNotificationActivity;
    }

    @Override // uz1
    public final int B0() {
        return 0;
    }

    @Override // uz1
    public final TL_stories.StoryItem C0() {
        return null;
    }

    @Override // uz1
    public final boolean E0(long j) {
        return false;
    }

    @Override // uz1
    public final boolean G0() {
        return false;
    }

    @Override // uz1
    public final nv1 J() {
        return null;
    }

    @Override // uz1
    public final boolean K0() {
        return false;
    }

    @Override // uz1
    public final boolean b0() {
        return true;
    }

    @Override // uz1
    public final boolean d1() {
        return false;
    }

    @Override // uz1
    public final boolean h() {
        return false;
    }

    @Override // uz1
    public final int j() {
        return 0;
    }

    @Override // uz1
    public final void j1() {
        PopupNotificationActivity popupNotificationActivity = this.a;
        k47 k47Var = popupNotificationActivity.R;
        if (k47Var != null) {
            oc7.r1(k47Var.K1).J4(0, popupNotificationActivity.L, k47.B0(popupNotificationActivity.R.k), 0L, null);
        }
    }

    @Override // uz1
    public final TLRPC.Peer l() {
        return null;
    }

    @Override // uz1
    public final void w(CharSequence charSequence, boolean z, int i, int i2, long j) {
        PopupNotificationActivity popupNotificationActivity = this.a;
        ArrayList arrayList = popupNotificationActivity.b0;
        if (popupNotificationActivity.R == null) {
            return;
        }
        int i3 = popupNotificationActivity.T;
        if (i3 >= 0 && i3 < arrayList.size()) {
            arrayList.remove(popupNotificationActivity.T);
        }
        oc7.r1(popupNotificationActivity.R.K1).n3(k47.B0(popupNotificationActivity.R.k), popupNotificationActivity.R.e1(), Math.max(0, popupNotificationActivity.R.e1()), popupNotificationActivity.R.k.date, true, 0L, 0, true, 0);
        popupNotificationActivity.R = null;
        popupNotificationActivity.f();
    }

    @Override // uz1
    public final TLRPC.TL_channels_sendAsPeers x() {
        return null;
    }

    @Override // uz1
    public final void A1() {
    }

    @Override // uz1
    public final void B() {
    }

    @Override // uz1
    public final void C(boolean z) {
    }

    @Override // uz1
    public final void E1(boolean z) {
    }

    @Override // uz1
    public final void G1() {
    }

    @Override // uz1
    public final void H1() {
    }

    @Override // uz1
    public final void I() {
    }

    @Override // uz1
    public final void I0() {
    }

    @Override // uz1
    public final void L() {
    }

    @Override // uz1
    public final void O0() {
    }

    @Override // uz1
    public final void R1() {
    }

    @Override // uz1
    public final void W0() {
    }

    @Override // uz1
    public final void Y0() {
    }

    @Override // uz1
    public final void a() {
    }

    @Override // uz1
    public final void c0() {
    }

    @Override // uz1
    public final void c1(CharSequence charSequence) {
    }

    @Override // uz1
    public final void e() {
    }

    @Override // uz1
    public final void e1() {
    }

    @Override // uz1
    public final void f0() {
    }

    @Override // uz1
    public final void n() {
    }

    @Override // uz1
    public final void n0() {
    }

    @Override // uz1
    public final void o(float f) {
    }

    @Override // uz1
    public final void p(boolean z) {
    }

    @Override // uz1
    public final void r() {
    }

    @Override // uz1
    public final void s1() {
    }

    @Override // uz1
    public final void v() {
    }

    @Override // uz1
    public final void v1(int i) {
    }

    @Override // uz1
    public final void z0(int i) {
    }

    @Override // uz1
    public final void y(float f, int i) {
    }

    @Override // uz1
    public final void H0(CharSequence charSequence, boolean z, boolean z2) {
    }

    @Override // uz1
    public final void a1(View view, CharSequence charSequence, boolean z) {
    }

    @Override // uz1
    public final void F1(int i, int i2, int i3, long j, long j2, boolean z) {
    }
}
