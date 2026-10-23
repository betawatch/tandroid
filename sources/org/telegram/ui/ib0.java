package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ ib0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f01 f01Var;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                rz0 rz0Var = profileActivity.O;
                if (rz0Var != null) {
                    rz0Var.b1(14);
                    profileActivity.I4(false);
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                rz0 rz0Var2 = profileActivity2.O;
                if (rz0Var2 != null) {
                    rz0Var2.b1(14);
                    profileActivity2.I4(false);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ib0(this.b, 0), 200L);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ib0(this.b, 1), 200L);
                break;
            case 4:
                ProfileActivity profileActivity3 = this.b;
                profileActivity3.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity3.f1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 5:
                this.b.B4(false);
                break;
            case 6:
                ProfileActivity profileActivity4 = this.b;
                profileActivity4.getClass();
                profileActivity4.presentFragment(new UserInfoActivity());
                break;
            case 7:
                this.b.B4(true);
                break;
            case 8:
                ProfileActivity profileActivity5 = this.b;
                profileActivity5.getClass();
                profileActivity5.presentFragment(new ig.e1());
                break;
            case 9:
                ProfileActivity profileActivity6 = this.b;
                profileActivity6.getClass();
                profileActivity6.presentFragment(new ig.c1());
                break;
            case 10:
                ProfileActivity profileActivity7 = this.b;
                profileActivity7.getClass();
                profileActivity7.presentFragment(new sa(null));
                break;
            case 11:
                ProfileActivity profileActivity8 = this.b;
                profileActivity8.getClass();
                profileActivity8.presentFragment(new UserInfoActivity());
                break;
            case 12:
                ProfileActivity profileActivity9 = this.b;
                profileActivity9.getClass();
                profileActivity9.presentFragment(new g(3));
                break;
            case 13:
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                this.b.showAsSheet(new PrivacyControlActivity(11, false), m2Var);
                break;
            case 14:
                ProfileActivity profileActivity10 = this.b;
                profileActivity10.m4(true);
                if (profileActivity10.k2.isRunning()) {
                    profileActivity10.k2.cancel();
                }
                profileActivity10.L4(1.0f);
                break;
            case 15:
                this.b.i5(false, false);
                break;
            case 16:
                this.b.H3();
                break;
            case 17:
                ProfileActivity profileActivity11 = this.b;
                rz0 rz0Var3 = profileActivity11.O;
                if (rz0Var3 != null) {
                    rz0Var3.A1(true);
                    profileActivity11.O.r1();
                    break;
                }
                break;
            case 18:
                ProfileActivity profileActivity12 = this.b;
                profileActivity12.getMessagesController().reloadUser(profileActivity12.a());
                break;
            case 19:
                ProfileActivity profileActivity13 = this.b;
                if (!profileActivity13.a.b0() && (f01Var = profileActivity13.d) != null) {
                    f01Var.l();
                    break;
                }
                break;
            case 20:
                this.b.i5(false, false);
                break;
            case 21:
                this.b.A5.setVisibility(8);
                break;
            case 22:
                ProfileActivity profileActivity14 = this.b;
                profileActivity14.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity14.g1);
                bundle.putLong("user_id", profileActivity14.f1);
                profileActivity14.presentFragment(new zh.n0(bundle));
                break;
            case 23:
                ProfileActivity profileActivity15 = this.b;
                profileActivity15.getClass();
                profileActivity15.presentFragment(new sa(null));
                break;
            case 24:
                ProfileActivity.V(this.b);
                break;
            case 25:
                ProfileActivity profileActivity16 = this.b;
                TLRPC.UserFull userFull = profileActivity16.w2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.sl.p(R.string.TextCopied, org.telegram.ui.Components.xc.a0(profileActivity16));
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity17 = this.b;
                profileActivity17.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity17.f1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity17.presentFragment(new hs(bundle2, profileActivity17.A0));
                break;
            default:
                this.b.I4(true);
                break;
        }
    }
}
