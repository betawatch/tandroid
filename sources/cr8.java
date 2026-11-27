// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cr8 extends d6 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public cr8(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [fd, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // d6
    public final void b(int i) {
        long j;
        int i2;
        ?? r6;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        bha bhaVar;
        ProfileActivity profileActivity = this.b;
        if (profileActivity.getParentActivity() != null) {
            if (i == -1) {
                gr8 gr8Var = profileActivity.O;
                if (gr8Var == null || (bhaVar = gr8Var.L0) == null || !bhaVar.o0) {
                    profileActivity.finishFragment();
                    return;
                } else {
                    profileActivity.F3();
                    return;
                }
            }
            if (i == 2) {
                profileActivity.R2(false);
                return;
            }
            final byte b = 1;
            if (i == 1) {
                TLRPC.User X1 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", X1.id);
                bundle.putBoolean("addContact", true);
                cu2 cu2Var = new cu2(bundle, profileActivity.A0);
                cu2Var.P = new wp8(profileActivity, X1);
                profileActivity.presentFragment(cu2Var);
                return;
            }
            if (i == 3) {
                Bundle j2 = qd4.j(3, "onlySelect", "dialogsType", true);
                j2.putString("selectAlertString", ob6.M0(2131745358, null));
                j2.putString("selectAlertStringGroup", ob6.M0(2131745359, null));
                uj3 uj3Var = new uj3(j2);
                uj3Var.E2 = profileActivity;
                profileActivity.presentFragment(uj3Var);
                return;
            }
            if (i == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", profileActivity.e1);
                profileActivity.presentFragment(new cu2(bundle2, profileActivity.A0));
                return;
            }
            if (i == 5) {
                TLRPC.User X12 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
                if (X12 == null || profileActivity.getParentActivity() == null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                String M0 = ob6.M0(2131751517, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131754096, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new m88((Object) this, (Object) X12, (byte) 13));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                profileActivity.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, profileActivity.A0);
                    return;
                }
                return;
            }
            if (i == 7) {
                profileActivity.L2(false);
                return;
            }
            if (i == 45) {
                profileActivity.L2(true);
                return;
            }
            if (i == 46) {
                if (!profileActivity.getUserConfig().p()) {
                    Activity parentActivity = profileActivity.getParentActivity();
                    i11 = ((e) profileActivity).currentAccount;
                    new xk8(profileActivity, parentActivity, i11, false, 41, false, null).show();
                    return;
                }
                vnb vnbVar = profileActivity.A0;
                uk8 uk8Var = new uk8(this, (byte) 8);
                Pattern pattern = jj.a;
                Context context = this.a;
                if (context != null) {
                    boolean[] zArr = new boolean[1];
                    nx0 h = uh9.h(1, null, context, false);
                    ax0 ax0Var = h.y0;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setClipChildren(false);
                    linearLayout.setClipToPadding(false);
                    e29 e29Var = new e29(context);
                    linearLayout.addView(e29Var, tre.t(jn7.u1, jn7.u1, 17, 0, 21, 0, 11));
                    e29Var.f(R.raw.raised_hand, jn7.u1, jn7.u1, null);
                    e29Var.setAutoRepeat(false);
                    e29Var.d();
                    TextView textView2 = new TextView(context);
                    textView2.setTypeface(hl.o());
                    textView2.setGravity(17);
                    textView2.setText(ob6.M0(2131751387, null));
                    textView2.setTextSize(1, 20.0f);
                    int i12 = aob.G6;
                    yob.X(textView2, i12, vnbVar);
                    linearLayout.addView(textView2, tre.t(-1, -2, 17, 20, 0, 20, 14));
                    yk8 yk8Var = new yk8(context, vnbVar);
                    yk8Var.a.l(ob6.M0(2131751386, null), false);
                    yk8Var.b.setText(ob6.M0(2131751383, null));
                    yk8Var.d.setVisibility(8);
                    ImageView imageView = yk8Var.c;
                    imageView.setImageResource(R.drawable.menu_photo_off_24);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                    yob.s(imageView, i12, vnbVar, mode);
                    linearLayout.addView(yk8Var, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                    yk8 yk8Var2 = new yk8(context, vnbVar);
                    yk8Var2.a.l(ob6.M0(2131751385, null), false);
                    yk8Var2.b.setText(ob6.M0(2131751382, null));
                    yk8Var2.d.setVisibility(8);
                    ImageView imageView2 = yk8Var2.c;
                    imageView2.setImageResource(R.drawable.menu_share_off_24);
                    yob.s(imageView2, i12, vnbVar, mode);
                    linearLayout.addView(yk8Var2, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                    yk8 yk8Var3 = new yk8(context, vnbVar);
                    yk8Var3.a.l(ob6.M0(2131751384, null), false);
                    yk8Var3.b.setText(ob6.M0(2131751381, null));
                    yk8Var3.d.setVisibility(8);
                    ImageView imageView3 = yk8Var3.c;
                    imageView3.setImageResource(R.drawable.menu_download_off_24);
                    yob.s(imageView3, i12, vnbVar, mode);
                    linearLayout.addView(yk8Var3, tre.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                    c51 c51Var = new c51(vnbVar, context, true);
                    c51Var.setOnClickListener(new t(zArr, ax0Var, (byte) 16));
                    c51Var.f();
                    c51Var.i(ob6.M0(2131751388, null), false, true);
                    linearLayout.addView(c51Var, tre.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                    h.O = linearLayout;
                    h.show();
                    h.n(new ve2(zArr, uk8Var, (byte) 23));
                    return;
                }
                return;
            }
            if (i == 47) {
                profileActivity.getMessagesController().r5(profileActivity.e1, 0, false, new oo2(profileActivity, r9, b));
                return;
            }
            if (i == 23) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(profileActivity.getParentActivity());
                String J0 = ob6.J0(1, "DeleteTopics");
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = J0;
                i10 = ((e) profileActivity).currentAccount;
                TLRPC.TL_forumTopic f = uc7.s1(i10).h4.f(profileActivity.f1, profileActivity.g1);
                final byte b2 = 0;
                idVar2.U = ob6.a0("DeleteSelectedTopic", null, 2131751463, f == null ? "topic" : f.title);
                alertDialog$Builder2.j(ob6.M0(2131751563, null), new fd(this) { // from class: ar8
                    public final /* synthetic */ cr8 b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                    @Override // fd
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void w(id idVar3, int i13) {
                        wk5 wk5Var;
                        wk5 wk5Var2;
                        wk5 wk5Var3;
                        wk5 wk5Var4;
                        int i14;
                        int i15;
                        boolean z;
                        dc7 dc7Var;
                        TLRPC.Photo photo;
                        byte b3 = b2;
                        cr8 cr8Var = this.b;
                        switch (b3) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                ProfileActivity profileActivity2 = cr8Var.b;
                                arrayList.add(Integer.valueOf((int) profileActivity2.g1));
                                profileActivity2.getMessagesController().h4.d(arrayList, profileActivity2.f1);
                                profileActivity2.J1 = (byte) 0;
                                wk5Var = ((e) profileActivity2).parentLayout;
                                if (wk5Var != null) {
                                    wk5Var2 = ((e) profileActivity2).parentLayout;
                                    if (wk5Var2.getFragmentStack() != null) {
                                        for (int i16 = 0; i16 < wk5Var3.getFragmentStack().size(); i16++) {
                                            wk5Var4 = ((e) profileActivity2).parentLayout;
                                            e eVar = (e) wk5Var4.getFragmentStack().get(i16);
                                            if ((eVar instanceof zu1) && ((zu1) eVar).c() == profileActivity2.g1) {
                                                eVar.removeSelfFromStack();
                                            }
                                        }
                                    }
                                }
                                profileActivity2.finishFragment();
                                Activity parentActivity2 = profileActivity2.getParentActivity();
                                if (parentActivity2 != null) {
                                    new d31(o11.a(parentActivity2), profileActivity2.A0).Q(R.raw.ic_delete, 36, ob6.J0(1, "TopicsDeleted")).j();
                                }
                                idVar3.dismiss();
                                break;
                            case 1:
                                ProfileActivity profileActivity3 = cr8Var.b;
                                i14 = ((e) profileActivity3).currentAccount;
                                if (uc7.s1(i14).x2()) {
                                    i15 = ((e) profileActivity3).currentAccount;
                                    i5.b(i15);
                                    break;
                                } else {
                                    profileActivity3.j1 = true;
                                    profileActivity3.getSecretChatHelper().A(profileActivity3.getParentActivity(), profileActivity3.getMessagesController().X1(Long.valueOf(profileActivity3.e1)));
                                    break;
                                }
                            default:
                                ProfileActivity profileActivity4 = cr8Var.b;
                                int realPosition = profileActivity4.o0.getRealPosition();
                                TLRPC.Photo F = profileActivity4.o0.F(realPosition);
                                TLRPC.UserFull userFull = profileActivity4.w2;
                                if (profileActivity4.J2 == null || realPosition != 0) {
                                    if (profileActivity4.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                        userFull.fallback_photo = null;
                                        userFull.flags &= -4194305;
                                        profileActivity4.getMessagesStorage().l2(userFull, true);
                                        profileActivity4.e4(false);
                                    }
                                    if (profileActivity4.o0.getRealCount() == 1) {
                                        profileActivity4.t3(true);
                                    }
                                    if (F == null || profileActivity4.o0.getRealPosition() == 0) {
                                        TLRPC.Photo F2 = profileActivity4.o0.F(1);
                                        if (F2 != null) {
                                            profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                            TLRPC.PhotoSize w = xb4.w(F2.sizes, 90, false, null, false);
                                            TLRPC.PhotoSize w2 = xb4.w(F2.sizes, 1000, false, null, false);
                                            if (w != null && w2 != null) {
                                                profileActivity4.getUserConfig().f().photo.photo_small = w.location;
                                                profileActivity4.getUserConfig().f().photo.photo_big = w2.location;
                                            }
                                        } else {
                                            profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                        }
                                        profileActivity4.getMessagesController().j0(null);
                                    } else {
                                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                        tL_inputPhoto.id = F.id;
                                        tL_inputPhoto.access_hash = F.access_hash;
                                        byte[] bArr = F.file_reference;
                                        tL_inputPhoto.file_reference = bArr;
                                        if (bArr == null) {
                                            tL_inputPhoto.file_reference = new byte[0];
                                        }
                                        profileActivity4.getMessagesController().j0(tL_inputPhoto);
                                        kf7 messagesStorage = profileActivity4.getMessagesStorage();
                                        messagesStorage.a.c(new yd7(messagesStorage, profileActivity4.e1, F.id, (byte) 0));
                                    }
                                    jq8 jq8Var = profileActivity4.o0;
                                    ArrayList arrayList2 = jq8Var.Y0;
                                    ArrayList arrayList3 = jq8Var.W0;
                                    if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                        z = false;
                                    } else {
                                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                        if (photo2 == null || (dc7Var = jq8Var.T0) == null) {
                                            arrayList3.remove(realPosition);
                                            jq8Var.V0.remove(realPosition);
                                            jq8Var.U0.remove(realPosition);
                                            jq8Var.X0.remove(realPosition);
                                            arrayList2.remove(realPosition);
                                            jq8Var.Z0.remove(realPosition);
                                            jq8Var.a1.remove(realPosition);
                                            jq8Var.b1.remove(realPosition);
                                            jq8Var.e1.delete(realPosition);
                                            jq8Var.c1.remove(realPosition);
                                            if (realPosition == 0 && !arrayList2.isEmpty()) {
                                                jq8Var.Q0 = (jn5) arrayList2.get(0);
                                                jq8Var.R0 = null;
                                                jq8Var.S0 = null;
                                            }
                                            jq8Var.E0.g();
                                            z = arrayList3.isEmpty();
                                        } else {
                                            dc7Var.e(photo2.id);
                                            z = true;
                                        }
                                    }
                                    if (z || profileActivity4.o0.getRealCount() <= 0) {
                                        profileActivity4.o0.setVisibility(8);
                                        profileActivity4.f0.setForegroundAlpha(1.0f);
                                        profileActivity4.Y.setVisibility(0);
                                        profileActivity4.I0 = true;
                                        View m = profileActivity4.c.m(0);
                                        if (m != null) {
                                            profileActivity4.a.y0(0, m.getTop() - profileActivity4.d2(), k43.h);
                                            break;
                                        }
                                    }
                                } else {
                                    profileActivity4.r0.a();
                                    if (profileActivity4.p6 != 0) {
                                        profileActivity4.getConnectionsManager().cancelRequest(profileActivity4.p6, true);
                                    }
                                    profileActivity4.p2 = (hl.O1() || profileActivity4.o2 || !profileActivity4.f0.getImageReceiver().E() || hl.A1()) ? false : true;
                                    profileActivity4.J2 = null;
                                    profileActivity4.K2 = null;
                                    jq8 jq8Var2 = profileActivity4.o0;
                                    jq8Var2.I0 = true;
                                    jq8Var2.L0 = profileActivity4.L2;
                                    jq8Var2.r1 = null;
                                    jq8Var2.s1 = null;
                                    jq8Var2.setCreateThumbFromParent(false);
                                    profileActivity4.e4(true);
                                    profileActivity4.C3(false, true);
                                    jn7 notificationCenter = profileActivity4.getNotificationCenter();
                                    int i17 = uc7.s5;
                                    notificationCenter.k(2, Integer.valueOf(uc7.s5));
                                    profileActivity4.getNotificationCenter().k(47, new Object[0]);
                                    profileActivity4.getUserConfig().u(true);
                                    break;
                                }
                                break;
                        }
                    }
                });
                alertDialog$Builder2.g(ob6.M0(2131752570, null), new ku7((byte) 25));
                idVar2.show();
                TextView textView3 = (TextView) idVar2.c(-1);
                if (textView3 != null) {
                    yob.X(textView3, aob.q7, null);
                    return;
                }
                return;
            }
            if (i == 24) {
                nb9.G0(profileActivity.a(), profileActivity);
                return;
            }
            if (i == 12) {
                if (profileActivity.q1) {
                    profileActivity.presentFragment(wxb.e0(profileActivity.f1, profileActivity.g1));
                    return;
                }
                Bundle bundle3 = new Bundle();
                long j3 = profileActivity.f1;
                if (j3 != 0) {
                    bundle3.putLong("chat_id", j3);
                } else if (profileActivity.s2) {
                    bundle3.putLong("user_id", profileActivity.e1);
                }
                g92 g92Var = new g92(bundle3);
                TLRPC.ChatFull chatFull = profileActivity.v2;
                if (chatFull != null) {
                    g92Var.p0(chatFull);
                } else {
                    g92Var.q0(profileActivity.w2);
                }
                profileActivity.presentFragment(g92Var);
                return;
            }
            if (i == 41) {
                profileActivity.presentFragment(new UserInfoActivity());
                return;
            }
            if (i == 9) {
                TLRPC.User X13 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
                if (X13 != null) {
                    Bundle j4 = qd4.j(2, "onlySelect", "dialogsType", true);
                    j4.putBoolean("resetDelegate", false);
                    j4.putBoolean("closeFragment", false);
                    uj3 uj3Var2 = new uj3(j4);
                    uj3Var2.E2 = new o48((Object) this, (Object) X13, (Object) uj3Var2, (byte) 3);
                    profileActivity.presentFragment(uj3Var2);
                    return;
                }
                return;
            }
            if (i == 10) {
                profileActivity.W2();
                return;
            }
            if (i == 14) {
                try {
                    if (profileActivity.E2 != null) {
                        j = wf3.E(r0.id);
                    } else {
                        j = profileActivity.e1;
                        if (j == 0) {
                            long j5 = profileActivity.f1;
                            if (j5 == 0) {
                                return;
                            } else {
                                j = -j5;
                            }
                        }
                    }
                    ls6 mediaDataController = profileActivity.getMediaDataController();
                    Pattern pattern2 = ls6.U1;
                    mediaDataController.z0(j, 0, null);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            if (i == 15) {
                i2 = 16;
            } else {
                if (i != 16) {
                    if (i == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", profileActivity.f1);
                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                        bundle4.putBoolean("open_search", true);
                        bg2 bg2Var = new bg2(bundle4);
                        bg2Var.B0(profileActivity.v2);
                        profileActivity.presentFragment(bg2Var);
                        return;
                    }
                    if (i == 18) {
                        profileActivity.Z2();
                        return;
                    }
                    if (i == 19) {
                        profileActivity.presentFragment(w1b.d0(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1)), false));
                        return;
                    }
                    if (i == 22) {
                        profileActivity.c3();
                        return;
                    }
                    if (i == 38) {
                        profileActivity.T2();
                        return;
                    }
                    if (i == 48) {
                        euc eucVar = new euc(profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1)));
                        eucVar.g0 = true;
                        profileActivity.presentFragment(eucVar);
                        return;
                    }
                    if (i == 39) {
                        Bundle j6 = qu6.j(2, TeXSymbolParser.TYPE_ATTR);
                        j6.putLong("dialog_id", -profileActivity.f1);
                        em6 em6Var = new em6(j6, null);
                        em6Var.c = profileActivity.v2;
                        profileActivity.presentFragment(em6Var);
                        return;
                    }
                    if (i == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                        String M02 = ob6.M0(2131754071, null);
                        id idVar3 = alertDialog$Builder3.a;
                        idVar3.S = M02;
                        idVar3.U = ob6.M0(2131754072, null);
                        alertDialog$Builder3.j(ob6.M0(2131744572, null), new fd(this) { // from class: ar8
                            public final /* synthetic */ cr8 b;

                            {
                                this.b = this;
                            }

                            /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                            @Override // fd
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void w(id idVar32, int i13) {
                                wk5 wk5Var;
                                wk5 wk5Var2;
                                wk5 wk5Var3;
                                wk5 wk5Var4;
                                int i14;
                                int i15;
                                boolean z;
                                dc7 dc7Var;
                                TLRPC.Photo photo;
                                byte b3 = b;
                                cr8 cr8Var = this.b;
                                switch (b3) {
                                    case 0:
                                        ArrayList arrayList = new ArrayList();
                                        ProfileActivity profileActivity2 = cr8Var.b;
                                        arrayList.add(Integer.valueOf((int) profileActivity2.g1));
                                        profileActivity2.getMessagesController().h4.d(arrayList, profileActivity2.f1);
                                        profileActivity2.J1 = (byte) 0;
                                        wk5Var = ((e) profileActivity2).parentLayout;
                                        if (wk5Var != null) {
                                            wk5Var2 = ((e) profileActivity2).parentLayout;
                                            if (wk5Var2.getFragmentStack() != null) {
                                                for (int i16 = 0; i16 < wk5Var3.getFragmentStack().size(); i16++) {
                                                    wk5Var4 = ((e) profileActivity2).parentLayout;
                                                    e eVar = (e) wk5Var4.getFragmentStack().get(i16);
                                                    if ((eVar instanceof zu1) && ((zu1) eVar).c() == profileActivity2.g1) {
                                                        eVar.removeSelfFromStack();
                                                    }
                                                }
                                            }
                                        }
                                        profileActivity2.finishFragment();
                                        Activity parentActivity2 = profileActivity2.getParentActivity();
                                        if (parentActivity2 != null) {
                                            new d31(o11.a(parentActivity2), profileActivity2.A0).Q(R.raw.ic_delete, 36, ob6.J0(1, "TopicsDeleted")).j();
                                        }
                                        idVar32.dismiss();
                                        break;
                                    case 1:
                                        ProfileActivity profileActivity3 = cr8Var.b;
                                        i14 = ((e) profileActivity3).currentAccount;
                                        if (uc7.s1(i14).x2()) {
                                            i15 = ((e) profileActivity3).currentAccount;
                                            i5.b(i15);
                                            break;
                                        } else {
                                            profileActivity3.j1 = true;
                                            profileActivity3.getSecretChatHelper().A(profileActivity3.getParentActivity(), profileActivity3.getMessagesController().X1(Long.valueOf(profileActivity3.e1)));
                                            break;
                                        }
                                    default:
                                        ProfileActivity profileActivity4 = cr8Var.b;
                                        int realPosition = profileActivity4.o0.getRealPosition();
                                        TLRPC.Photo F = profileActivity4.o0.F(realPosition);
                                        TLRPC.UserFull userFull = profileActivity4.w2;
                                        if (profileActivity4.J2 == null || realPosition != 0) {
                                            if (profileActivity4.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                                userFull.fallback_photo = null;
                                                userFull.flags &= -4194305;
                                                profileActivity4.getMessagesStorage().l2(userFull, true);
                                                profileActivity4.e4(false);
                                            }
                                            if (profileActivity4.o0.getRealCount() == 1) {
                                                profileActivity4.t3(true);
                                            }
                                            if (F == null || profileActivity4.o0.getRealPosition() == 0) {
                                                TLRPC.Photo F2 = profileActivity4.o0.F(1);
                                                if (F2 != null) {
                                                    profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                                    TLRPC.PhotoSize w = xb4.w(F2.sizes, 90, false, null, false);
                                                    TLRPC.PhotoSize w2 = xb4.w(F2.sizes, 1000, false, null, false);
                                                    if (w != null && w2 != null) {
                                                        profileActivity4.getUserConfig().f().photo.photo_small = w.location;
                                                        profileActivity4.getUserConfig().f().photo.photo_big = w2.location;
                                                    }
                                                } else {
                                                    profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                                }
                                                profileActivity4.getMessagesController().j0(null);
                                            } else {
                                                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                                tL_inputPhoto.id = F.id;
                                                tL_inputPhoto.access_hash = F.access_hash;
                                                byte[] bArr = F.file_reference;
                                                tL_inputPhoto.file_reference = bArr;
                                                if (bArr == null) {
                                                    tL_inputPhoto.file_reference = new byte[0];
                                                }
                                                profileActivity4.getMessagesController().j0(tL_inputPhoto);
                                                kf7 messagesStorage = profileActivity4.getMessagesStorage();
                                                messagesStorage.a.c(new yd7(messagesStorage, profileActivity4.e1, F.id, (byte) 0));
                                            }
                                            jq8 jq8Var = profileActivity4.o0;
                                            ArrayList arrayList2 = jq8Var.Y0;
                                            ArrayList arrayList3 = jq8Var.W0;
                                            if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                                z = false;
                                            } else {
                                                TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                                if (photo2 == null || (dc7Var = jq8Var.T0) == null) {
                                                    arrayList3.remove(realPosition);
                                                    jq8Var.V0.remove(realPosition);
                                                    jq8Var.U0.remove(realPosition);
                                                    jq8Var.X0.remove(realPosition);
                                                    arrayList2.remove(realPosition);
                                                    jq8Var.Z0.remove(realPosition);
                                                    jq8Var.a1.remove(realPosition);
                                                    jq8Var.b1.remove(realPosition);
                                                    jq8Var.e1.delete(realPosition);
                                                    jq8Var.c1.remove(realPosition);
                                                    if (realPosition == 0 && !arrayList2.isEmpty()) {
                                                        jq8Var.Q0 = (jn5) arrayList2.get(0);
                                                        jq8Var.R0 = null;
                                                        jq8Var.S0 = null;
                                                    }
                                                    jq8Var.E0.g();
                                                    z = arrayList3.isEmpty();
                                                } else {
                                                    dc7Var.e(photo2.id);
                                                    z = true;
                                                }
                                            }
                                            if (z || profileActivity4.o0.getRealCount() <= 0) {
                                                profileActivity4.o0.setVisibility(8);
                                                profileActivity4.f0.setForegroundAlpha(1.0f);
                                                profileActivity4.Y.setVisibility(0);
                                                profileActivity4.I0 = true;
                                                View m = profileActivity4.c.m(0);
                                                if (m != null) {
                                                    profileActivity4.a.y0(0, m.getTop() - profileActivity4.d2(), k43.h);
                                                    break;
                                                }
                                            }
                                        } else {
                                            profileActivity4.r0.a();
                                            if (profileActivity4.p6 != 0) {
                                                profileActivity4.getConnectionsManager().cancelRequest(profileActivity4.p6, true);
                                            }
                                            profileActivity4.p2 = (hl.O1() || profileActivity4.o2 || !profileActivity4.f0.getImageReceiver().E() || hl.A1()) ? false : true;
                                            profileActivity4.J2 = null;
                                            profileActivity4.K2 = null;
                                            jq8 jq8Var2 = profileActivity4.o0;
                                            jq8Var2.I0 = true;
                                            jq8Var2.L0 = profileActivity4.L2;
                                            jq8Var2.r1 = null;
                                            jq8Var2.s1 = null;
                                            jq8Var2.setCreateThumbFromParent(false);
                                            profileActivity4.e4(true);
                                            profileActivity4.C3(false, true);
                                            jn7 notificationCenter = profileActivity4.getNotificationCenter();
                                            int i17 = uc7.s5;
                                            notificationCenter.k(2, Integer.valueOf(uc7.s5));
                                            profileActivity4.getNotificationCenter().k(47, new Object[0]);
                                            profileActivity4.getUserConfig().u(true);
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
                        profileActivity.showDialog(idVar3);
                        return;
                    }
                    if (i == 44) {
                        i9 = ((e) profileActivity).currentAccount;
                        wt0.l(i9, profileActivity.e1);
                        return;
                    }
                    if (i == 21) {
                        if (profileActivity.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || f11.b) && profileActivity.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                profileActivity.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            jq8 jq8Var = profileActivity.o0;
                            jn5 D = jq8Var.D(jq8Var.getRealPosition());
                            if (D != null) {
                                boolean z = D.p == 2;
                                i8 = ((e) profileActivity).currentAccount;
                                xb4.G(i8);
                                File J = xb4.J(D.f, z ? "mp4" : null, true, true);
                                if (z && !J.exists()) {
                                    J = new File(xb4.z(0), xb4.r("mp4", D.f));
                                }
                                if (J.exists()) {
                                    MediaController.g0(J.toString(), profileActivity.getParentActivity(), 0, null, null, new sa((byte) 5, this, z));
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i == 30) {
                        profileActivity.presentFragment(new UserInfoActivity());
                        return;
                    }
                    if (i == 40) {
                        h48 h48Var = new h48();
                        h48Var.I = profileActivity;
                        profileActivity.presentFragment(h48Var);
                        return;
                    }
                    if (i == 42) {
                        if (hl.g(profileActivity.getMessagesController().N2 + "/" + lbc.p(profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1))))) {
                            d31.b0(profileActivity).k(false).j();
                            return;
                        }
                        return;
                    }
                    if (i == 43) {
                        profileActivity.presentFragment(new ve1(null));
                        return;
                    }
                    if (i == 31) {
                        profileActivity.presentFragment(new th6(null));
                        return;
                    }
                    if (i != 33) {
                        if (i == 34) {
                            i3 = ((e) profileActivity).currentAccount;
                            if (uc7.s1(i3).x2()) {
                                i6 = ((e) profileActivity).currentAccount;
                                i5.b(i6);
                                return;
                            }
                            int realPosition = profileActivity.o0.getRealPosition();
                            jn5 D2 = profileActivity.o0.D(realPosition);
                            if (D2 != null) {
                                i4 = ((e) profileActivity).currentAccount;
                                xb4.G(i4);
                                Drawable[] drawableArr = PhotoViewer.d9;
                                File J2 = xb4.J(D2.f, PhotoViewer.n0(D2), true, true);
                                r9 = D2.p == 2;
                                if (r9) {
                                    jn5 G = profileActivity.o0.G(realPosition);
                                    i5 = ((e) profileActivity).currentAccount;
                                    xb4.G(i5);
                                    str = xb4.J(G == null ? null : G.f, PhotoViewer.n0(G), true, true).getAbsolutePath();
                                } else {
                                    str = null;
                                }
                                profileActivity.r0.p(J2.getAbsolutePath(), str, r9);
                                return;
                            }
                            return;
                        }
                        if (i != 35) {
                            if (i == 36) {
                                profileActivity.Y2();
                                return;
                            }
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                        jq8 jq8Var2 = profileActivity.o0;
                        jn5 D3 = jq8Var2.D(jq8Var2.getRealPosition());
                        if (D3 != null) {
                            byte b3 = D3.p;
                            id idVar4 = alertDialog$Builder4.a;
                            if (b3 == 2) {
                                r6 = 0;
                                idVar4.S = ob6.M0(2131754076, null);
                                idVar4.U = ob6.M0(2131754078, null);
                            } else {
                                r6 = 0;
                                idVar4.S = ob6.M0(2131754087, null);
                                idVar4.U = ob6.M0(2131754089, null);
                            }
                            final byte b4 = 2;
                            alertDialog$Builder4.j(ob6.M0(2131751563, r6), new fd(this) { // from class: ar8
                                public final /* synthetic */ cr8 b;

                                {
                                    this.b = this;
                                }

                                /* JADX WARN: Incorrect condition in loop: B:85:0x0276 */
                                @Override // fd
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void w(id idVar32, int i13) {
                                    wk5 wk5Var;
                                    wk5 wk5Var2;
                                    wk5 wk5Var3;
                                    wk5 wk5Var4;
                                    int i14;
                                    int i15;
                                    boolean z2;
                                    dc7 dc7Var;
                                    TLRPC.Photo photo;
                                    byte b32 = b4;
                                    cr8 cr8Var = this.b;
                                    switch (b32) {
                                        case 0:
                                            ArrayList arrayList = new ArrayList();
                                            ProfileActivity profileActivity2 = cr8Var.b;
                                            arrayList.add(Integer.valueOf((int) profileActivity2.g1));
                                            profileActivity2.getMessagesController().h4.d(arrayList, profileActivity2.f1);
                                            profileActivity2.J1 = (byte) 0;
                                            wk5Var = ((e) profileActivity2).parentLayout;
                                            if (wk5Var != null) {
                                                wk5Var2 = ((e) profileActivity2).parentLayout;
                                                if (wk5Var2.getFragmentStack() != null) {
                                                    for (int i16 = 0; i16 < wk5Var3.getFragmentStack().size(); i16++) {
                                                        wk5Var4 = ((e) profileActivity2).parentLayout;
                                                        e eVar = (e) wk5Var4.getFragmentStack().get(i16);
                                                        if ((eVar instanceof zu1) && ((zu1) eVar).c() == profileActivity2.g1) {
                                                            eVar.removeSelfFromStack();
                                                        }
                                                    }
                                                }
                                            }
                                            profileActivity2.finishFragment();
                                            Activity parentActivity2 = profileActivity2.getParentActivity();
                                            if (parentActivity2 != null) {
                                                new d31(o11.a(parentActivity2), profileActivity2.A0).Q(R.raw.ic_delete, 36, ob6.J0(1, "TopicsDeleted")).j();
                                            }
                                            idVar32.dismiss();
                                            break;
                                        case 1:
                                            ProfileActivity profileActivity3 = cr8Var.b;
                                            i14 = ((e) profileActivity3).currentAccount;
                                            if (uc7.s1(i14).x2()) {
                                                i15 = ((e) profileActivity3).currentAccount;
                                                i5.b(i15);
                                                break;
                                            } else {
                                                profileActivity3.j1 = true;
                                                profileActivity3.getSecretChatHelper().A(profileActivity3.getParentActivity(), profileActivity3.getMessagesController().X1(Long.valueOf(profileActivity3.e1)));
                                                break;
                                            }
                                        default:
                                            ProfileActivity profileActivity4 = cr8Var.b;
                                            int realPosition2 = profileActivity4.o0.getRealPosition();
                                            TLRPC.Photo F = profileActivity4.o0.F(realPosition2);
                                            TLRPC.UserFull userFull = profileActivity4.w2;
                                            if (profileActivity4.J2 == null || realPosition2 != 0) {
                                                if (profileActivity4.v5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                                    userFull.fallback_photo = null;
                                                    userFull.flags &= -4194305;
                                                    profileActivity4.getMessagesStorage().l2(userFull, true);
                                                    profileActivity4.e4(false);
                                                }
                                                if (profileActivity4.o0.getRealCount() == 1) {
                                                    profileActivity4.t3(true);
                                                }
                                                if (F == null || profileActivity4.o0.getRealPosition() == 0) {
                                                    TLRPC.Photo F2 = profileActivity4.o0.F(1);
                                                    if (F2 != null) {
                                                        profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                                        TLRPC.PhotoSize w = xb4.w(F2.sizes, 90, false, null, false);
                                                        TLRPC.PhotoSize w2 = xb4.w(F2.sizes, 1000, false, null, false);
                                                        if (w != null && w2 != null) {
                                                            profileActivity4.getUserConfig().f().photo.photo_small = w.location;
                                                            profileActivity4.getUserConfig().f().photo.photo_big = w2.location;
                                                        }
                                                    } else {
                                                        profileActivity4.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                                    }
                                                    profileActivity4.getMessagesController().j0(null);
                                                } else {
                                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                                    tL_inputPhoto.id = F.id;
                                                    tL_inputPhoto.access_hash = F.access_hash;
                                                    byte[] bArr = F.file_reference;
                                                    tL_inputPhoto.file_reference = bArr;
                                                    if (bArr == null) {
                                                        tL_inputPhoto.file_reference = new byte[0];
                                                    }
                                                    profileActivity4.getMessagesController().j0(tL_inputPhoto);
                                                    kf7 messagesStorage = profileActivity4.getMessagesStorage();
                                                    messagesStorage.a.c(new yd7(messagesStorage, profileActivity4.e1, F.id, (byte) 0));
                                                }
                                                jq8 jq8Var3 = profileActivity4.o0;
                                                ArrayList arrayList2 = jq8Var3.Y0;
                                                ArrayList arrayList3 = jq8Var3.W0;
                                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                                    z2 = false;
                                                } else {
                                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                                    if (photo2 == null || (dc7Var = jq8Var3.T0) == null) {
                                                        arrayList3.remove(realPosition2);
                                                        jq8Var3.V0.remove(realPosition2);
                                                        jq8Var3.U0.remove(realPosition2);
                                                        jq8Var3.X0.remove(realPosition2);
                                                        arrayList2.remove(realPosition2);
                                                        jq8Var3.Z0.remove(realPosition2);
                                                        jq8Var3.a1.remove(realPosition2);
                                                        jq8Var3.b1.remove(realPosition2);
                                                        jq8Var3.e1.delete(realPosition2);
                                                        jq8Var3.c1.remove(realPosition2);
                                                        if (realPosition2 == 0 && !arrayList2.isEmpty()) {
                                                            jq8Var3.Q0 = (jn5) arrayList2.get(0);
                                                            jq8Var3.R0 = null;
                                                            jq8Var3.S0 = null;
                                                        }
                                                        jq8Var3.E0.g();
                                                        z2 = arrayList3.isEmpty();
                                                    } else {
                                                        dc7Var.e(photo2.id);
                                                        z2 = true;
                                                    }
                                                }
                                                if (z2 || profileActivity4.o0.getRealCount() <= 0) {
                                                    profileActivity4.o0.setVisibility(8);
                                                    profileActivity4.f0.setForegroundAlpha(1.0f);
                                                    profileActivity4.Y.setVisibility(0);
                                                    profileActivity4.I0 = true;
                                                    View m = profileActivity4.c.m(0);
                                                    if (m != null) {
                                                        profileActivity4.a.y0(0, m.getTop() - profileActivity4.d2(), k43.h);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                profileActivity4.r0.a();
                                                if (profileActivity4.p6 != 0) {
                                                    profileActivity4.getConnectionsManager().cancelRequest(profileActivity4.p6, true);
                                                }
                                                profileActivity4.p2 = (hl.O1() || profileActivity4.o2 || !profileActivity4.f0.getImageReceiver().E() || hl.A1()) ? false : true;
                                                profileActivity4.J2 = null;
                                                profileActivity4.K2 = null;
                                                jq8 jq8Var22 = profileActivity4.o0;
                                                jq8Var22.I0 = true;
                                                jq8Var22.L0 = profileActivity4.L2;
                                                jq8Var22.r1 = null;
                                                jq8Var22.s1 = null;
                                                jq8Var22.setCreateThumbFromParent(false);
                                                profileActivity4.e4(true);
                                                profileActivity4.C3(false, true);
                                                jn7 notificationCenter = profileActivity4.getNotificationCenter();
                                                int i17 = uc7.s5;
                                                notificationCenter.k(2, Integer.valueOf(uc7.s5));
                                                profileActivity4.getNotificationCenter().k(47, new Object[0]);
                                                profileActivity4.getUserConfig().u(true);
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            alertDialog$Builder4.g(ob6.M0(2131752570, r6), r6);
                            profileActivity.showDialog(idVar4);
                            TextView textView4 = (TextView) idVar4.c(-1);
                            if (textView4 != null) {
                                yob.X(textView4, aob.q7, profileActivity.A0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    int realPosition2 = profileActivity.o0.getRealPosition();
                    TLRPC.Photo F = profileActivity.o0.F(realPosition2);
                    if (F != null) {
                        jq8 jq8Var3 = profileActivity.o0;
                        ArrayList arrayList = jq8Var3.c1;
                        ArrayList arrayList2 = jq8Var3.b1;
                        ArrayList arrayList3 = jq8Var3.a1;
                        ArrayList arrayList4 = jq8Var3.Z0;
                        ArrayList arrayList5 = jq8Var3.X0;
                        ArrayList arrayList6 = jq8Var3.V0;
                        ArrayList arrayList7 = jq8Var3.Y0;
                        ArrayList arrayList8 = jq8Var3.W0;
                        dc7 dc7Var = jq8Var3.T0;
                        if (dc7Var != null) {
                            dc7Var.c(realPosition2);
                        } else if (realPosition2 > 0 && realPosition2 < arrayList8.size()) {
                            jq8Var3.d1++;
                            TLRPC.Photo photo = (TLRPC.Photo) arrayList8.get(realPosition2);
                            arrayList8.remove(realPosition2);
                            arrayList8.add(0, photo);
                            String str2 = (String) arrayList6.get(realPosition2);
                            arrayList6.remove(realPosition2);
                            arrayList6.add(0, str2);
                            ArrayList arrayList9 = jq8Var3.U0;
                            arrayList9.add(0, (String) arrayList9.remove(realPosition2));
                            jn5 jn5Var = (jn5) arrayList5.get(realPosition2);
                            arrayList5.remove(realPosition2);
                            arrayList5.add(0, jn5Var);
                            jn5 jn5Var2 = (jn5) arrayList7.get(realPosition2);
                            arrayList7.remove(realPosition2);
                            arrayList7.add(0, jn5Var2);
                            jn5 jn5Var3 = (jn5) arrayList4.get(realPosition2);
                            arrayList4.remove(realPosition2);
                            arrayList4.add(0, jn5Var3);
                            idc idcVar = (idc) arrayList3.get(realPosition2);
                            arrayList3.remove(realPosition2);
                            arrayList3.add(0, idcVar);
                            Integer num = (Integer) arrayList2.get(realPosition2);
                            arrayList2.remove(realPosition2);
                            arrayList2.add(0, num);
                            Float f2 = (Float) arrayList.get(realPosition2);
                            arrayList.remove(realPosition2);
                            arrayList.add(0, f2);
                            jq8Var3.Q0 = (jn5) arrayList7.get(0);
                        }
                        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                        tL_inputPhoto.id = F.id;
                        tL_inputPhoto.access_hash = F.access_hash;
                        tL_inputPhoto.file_reference = F.file_reference;
                        yac userConfig = profileActivity.getUserConfig();
                        profileActivity.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new qn8((Object) this, (Object) userConfig, (Object) F, (byte) 4));
                        profileActivity.M.m(profileActivity.e1, F.video_sizes.isEmpty() ? null : 1, 22);
                        TLRPC.User X14 = profileActivity.getMessagesController().X1(Long.valueOf(userConfig.n));
                        TLRPC.PhotoSize w = xb4.w(F.sizes, 800, false, null, false);
                        if (X14 != null) {
                            TLRPC.PhotoSize w2 = xb4.w(F.sizes, 90, false, null, false);
                            TLRPC.UserProfilePhoto userProfilePhoto = X14.photo;
                            userProfilePhoto.photo_id = F.id;
                            userProfilePhoto.photo_small = w2.location;
                            userProfilePhoto.photo_big = w.location;
                            userConfig.v(X14);
                            userConfig.u(true);
                            i7 = ((e) profileActivity).currentAccount;
                            jn7.f(i7).k(jn7.j0, new Object[0]);
                            profileActivity.e4(true);
                        }
                        jq8 jq8Var4 = profileActivity.o0;
                        jq8Var4.E0.g();
                        jq8Var4.L();
                        return;
                    }
                    return;
                }
                i2 = 16;
            }
            profileActivity.S2(i == i2);
        }
    }
}
