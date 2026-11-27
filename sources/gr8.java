// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class gr8 extends eja {
    public boolean x2;
    public final /* synthetic */ ProfileActivity y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr8(ProfileActivity profileActivity, Context context, long j, wia wiaVar, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, ProfileActivity profileActivity2, ProfileActivity profileActivity3, vnb vnbVar, ll0 ll0Var) {
        super(context, j, wiaVar, i, arrayList, chatFull, userFull, i2, i3, profileActivity2, profileActivity3, 1, vnbVar, ll0Var);
        this.y2 = profileActivity;
    }

    @Override // eja
    public final void J0(SparseArray sparseArray) {
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            int size = sparseArray.size();
            int selectedTab = getSelectedTab();
            char c = (eja.t0(selectedTab) || selectedTab == 8) ? (char) 0 : selectedTab == 9 ? (char) 1 : (char) 65535;
            if (c >= 0) {
                if (c == 0) {
                    profileActivity.K1(size);
                }
                profileActivity.C5[c].c(size, true);
            }
        }
    }

    @Override // eja
    public final void K0() {
        FrameLayout frameLayout;
        gr8 gr8Var;
        ProfileActivity profileActivity = this.y2;
        if (!profileActivity.s1 || (frameLayout = profileActivity.z5[0]) == null || (gr8Var = profileActivity.O) == null) {
            return;
        }
        ProfileActivity.p3(frameLayout, 1.0f - gr8Var.getBottomButtonStoriesVisibility());
    }

    @Override // eja
    public final void N1(boolean z) {
        int i;
        int i2;
        super.N1(z);
        ProfileActivity profileActivity = this.y2;
        boolean z2 = profileActivity.t1;
        cga cgaVar = this.b0;
        if (z2 && !profileActivity.w1 && this.L0.d(14)) {
            if (!this.x2 && (i2 = profileActivity.u1) > 0 && cgaVar != null) {
                this.x2 = true;
                cgaVar.Q = i2;
                cgaVar.e();
            }
            profileActivity.w1 = true;
            f1(14);
            return;
        }
        if (!profileActivity.t1 || !profileActivity.w1 || this.x2 || (i = profileActivity.u1) <= 0 || cgaVar == null) {
            return;
        }
        this.x2 = true;
        cgaVar.Q = i;
        cgaVar.e();
    }

    @Override // eja
    public final boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return this.y2.g(chatParticipant, z, false, view);
    }

    @Override // eja
    public final void Q0() {
        RectF rectF = ProfileActivity.Z6;
        this.y2.X3(true);
    }

    @Override // eja
    public final void R0(boolean z) {
        int i;
        ProfileActivity profileActivity = this.y2;
        Activity parentActivity = profileActivity.getParentActivity();
        i = ((e) profileActivity).classGuid;
        hl.y2(parentActivity, i);
        profileActivity.a.E0();
        profileActivity.Z.setPivotY((profileActivity.Y.getMeasuredHeight() / 2.0f) + profileActivity.Y.getPivotY());
        profileActivity.Z.setPivotX(r0.getMeasuredWidth() / 2.0f);
        hl.T3(profileActivity.Z, !z, 0.95f, true, true);
        profileActivity.i4(false);
    }

    @Override // eja
    public final void S0() {
        this.y2.V();
    }

    @Override // eja
    public final void T0(float f) {
        K0();
        ProfileActivity profileActivity = this.y2;
        gr8 gr8Var = profileActivity.O;
        if (gr8Var == null || !profileActivity.s1) {
            return;
        }
        if (profileActivity.z5[0] != null) {
            profileActivity.z5[0].setTranslationX(gr8Var.a0(8, true));
        }
        if (profileActivity.z5[1] != null) {
            profileActivity.z5[1].setTranslationX(profileActivity.O.a0(9, false));
        }
        profileActivity.K1(profileActivity.L6);
        profileActivity.J3();
    }

    @Override // eja
    public final int c1(int i) {
        RectF rectF = ProfileActivity.Z6;
        return i;
    }

    @Override // eja
    public final int getInitialTab() {
        return 8;
    }

    @Override // eja
    public final boolean h0() {
        ProfileActivity profileActivity = this.y2;
        return profileActivity.i1 == profileActivity.getUserConfig().e() && !profileActivity.h1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (uc7.s1(r6).k5() != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    @Override // eja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1(boolean z) {
        int i;
        super.l1(z);
        ProfileActivity profileActivity = this.y2;
        if (profileActivity.s1) {
            if (z) {
                r1(null);
            }
            this.P1 = z;
            int selectedTab = getSelectedTab() - 8;
            if (selectedTab >= 0) {
                boolean z2 = true;
                if (selectedTab <= 1) {
                    FrameLayout frameLayout = profileActivity.z5[selectedTab];
                    if (!z) {
                        if (selectedTab == 0) {
                            i = ((e) profileActivity).currentAccount;
                        }
                        frameLayout.setVisibility(0);
                        frameLayout.animate().translationY(!z2 ? ProfileActivity.a7 : 0.0f).alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(k43.h).setUpdateListener(new pv7(this, (byte) 17)).withEndAction(new q38((byte) 3, (Object) frameLayout, z2)).start();
                    }
                    z2 = false;
                    frameLayout.setVisibility(0);
                    frameLayout.animate().translationY(!z2 ? ProfileActivity.a7 : 0.0f).alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(k43.h).setUpdateListener(new pv7(this, (byte) 17)).withEndAction(new q38((byte) 3, (Object) frameLayout, z2)).start();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hl.c3(new uk8(this, (byte) 9));
    }

    @Override // eja
    public final boolean r0() {
        return this.y2.s1;
    }

    @Override // eja
    public final boolean s0() {
        return this.y2.s1;
    }
}
