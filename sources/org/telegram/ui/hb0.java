package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ hb0(ProfileActivity profileActivity, int i10) {
        this.a = i10;
        this.b = profileActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l01 l01Var;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        ProfileActivity profileActivity = this.b;
        switch (i10) {
            case 0:
                xz0 xz0Var = profileActivity.N;
                if (xz0Var != null) {
                    xz0Var.e1(14);
                    profileActivity.O4(false);
                    break;
                }
                break;
            case 1:
                xz0 xz0Var2 = profileActivity.N;
                if (xz0Var2 != null) {
                    xz0Var2.e1(14);
                    profileActivity.O4(false);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new hb0(profileActivity, i12), 200L);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new hb0(profileActivity, i11), 200L);
                break;
            case 4:
                int i13 = ProfileActivity.R6;
                profileActivity.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", profileActivity.e1, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 5:
                int i14 = ProfileActivity.R6;
                profileActivity.H4(false);
                break;
            case 6:
                int i15 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 7:
                int i16 = ProfileActivity.R6;
                profileActivity.H4(true);
                break;
            case 8:
                int i17 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new jg.h1());
                break;
            case 9:
                int i18 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new jg.d1());
                break;
            case 10:
                int i19 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ta(null));
                break;
            case 11:
                int i20 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new UserInfoActivity());
                break;
            case 12:
                int i21 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new g(3));
                break;
            case 13:
                profileActivity.presentFragment(wn.ea(profileActivity.e1));
                break;
            case 14:
                int i22 = ProfileActivity.R6;
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                profileActivity.showAsSheet(new PrivacyControlActivity(11, false), p2Var);
                break;
            case 15:
                int i23 = ProfileActivity.R6;
                profileActivity.r4(true);
                if (profileActivity.j2.isRunning()) {
                    profileActivity.j2.cancel();
                }
                profileActivity.R4(1.0f);
                break;
            case 16:
                int i24 = ProfileActivity.R6;
                profileActivity.p5(false, false);
                break;
            case 17:
                int i25 = ProfileActivity.R6;
                profileActivity.N3();
                break;
            case 18:
                xz0 xz0Var3 = profileActivity.N;
                if (xz0Var3 != null) {
                    xz0Var3.J1(true);
                    profileActivity.N.y1();
                    break;
                }
                break;
            case 19:
                if (!profileActivity.a.c0() && (l01Var = profileActivity.d) != null) {
                    l01Var.l();
                    break;
                }
                break;
            case 20:
                int i26 = ProfileActivity.R6;
                profileActivity.getMessagesController().reloadUser(profileActivity.a());
                break;
            case 21:
                int i27 = ProfileActivity.R6;
                profileActivity.p5(false, false);
                break;
            case 22:
                int i28 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f1);
                bundle.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new ai.z0(bundle));
                break;
            case 23:
                int i29 = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(new ta(null));
                break;
            case 24:
                ProfileActivity.W(profileActivity);
                break;
            case 25:
                profileActivity.E5.setVisibility(8);
                break;
            case 26:
                TLRPC.UserFull userFull = profileActivity.v2;
                if (userFull != null) {
                    AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(userFull.note, false));
                    org.telegram.messenger.wh.m(R.string.TextCopied, org.telegram.ui.Components.wc.b0(profileActivity));
                    break;
                }
                break;
            case 27:
                int i30 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity.e1);
                bundle2.putBoolean("focus_notes", true);
                profileActivity.presentFragment(new ls(bundle2, profileActivity.z0));
                break;
            default:
                profileActivity.O4(true);
                break;
        }
    }
}
