package org.telegram.ui;

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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class iv0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public iv0(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        TL_bots.BotInfo botInfo;
        int i17;
        int i18;
        org.telegram.ui.Components.tq0 tq0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i3 == -1) {
            ProfileActivity profileActivity = this.b;
            mv0 mv0Var = profileActivity.O;
            if (mv0Var == null || (tq0Var = mv0Var.L0) == null || !tq0Var.o0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.l5();
                return;
            }
        }
        final int i19 = 2;
        int i20 = 0;
        if (i3 == 2) {
            this.b.B4(false);
            return;
        }
        if (i3 == 1) {
            TLRPC.User a22 = this.b.getMessagesController().a2(Long.valueOf(this.b.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a22.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            lr lrVar = new lr(bundle, profileActivity2.A0);
            lrVar.P = new nt0(profileActivity2, a22);
            profileActivity2.presentFragment(lrVar);
            return;
        }
        String str = null;
        if (i3 == 3) {
            Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
            l10.putString("selectAlertString", org.telegram.messenger.bd.M0(2131745640, null));
            l10.putString("selectAlertStringGroup", org.telegram.messenger.bd.M0(2131745641, null));
            uw uwVar = new uw(l10);
            ProfileActivity profileActivity3 = this.b;
            uwVar.D2 = profileActivity3;
            profileActivity3.presentFragment(uwVar);
            return;
        }
        if (i3 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.e1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new lr(bundle2, profileActivity4.A0));
            return;
        }
        int i21 = 19;
        if (i3 == 5) {
            TLRPC.User a23 = this.b.getMessagesController().a2(Long.valueOf(this.b.e1));
            if (a23 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131751553, null);
            alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131754103, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new rb0(i21, this, a23));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            this.b.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, this.b.A0);
                return;
            }
            return;
        }
        if (i3 == 7) {
            this.b.w4(false);
            return;
        }
        if (i3 == 45) {
            this.b.w4(true);
            return;
        }
        int i22 = 8;
        if (i3 == 46) {
            if (!this.b.getUserConfig().q()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
                new vg.v0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.e6 e6Var = this.b.A0;
            pu0 pu0Var = new pu0(this, 1);
            Pattern pattern = org.telegram.ui.Components.t4.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.t2 l11 = org.telegram.messenger.k5.l(1, context, null, false);
            org.telegram.ui.ActionBar.e2 e2Var = l11.y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
            linearLayout.addView(fh0Var, b8.mf.t(org.telegram.messenger.hs.v1, org.telegram.messenger.hs.v1, 17, 0, 21, 0, 11));
            fh0Var.f(R.raw.raised_hand, org.telegram.messenger.hs.v1, org.telegram.messenger.hs.v1, null);
            fh0Var.setAutoRepeat(false);
            fh0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            textView2.setText(org.telegram.messenger.bd.M0(2131751423, null));
            textView2.setTextSize(1, 20.0f);
            int i23 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(textView2, i23, e6Var);
            linearLayout.addView(textView2, b8.mf.t(-1, -2, 17, 20, 0, 20, 14));
            yr0 yr0Var = new yr0(context, e6Var);
            yr0Var.a.l(org.telegram.messenger.bd.M0(2131751422, null), false);
            yr0Var.b.setText(org.telegram.messenger.bd.M0(2131751419, null));
            yr0Var.d.setVisibility(8);
            yr0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            ImageView imageView = yr0Var.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.r6.t(imageView, i23, e6Var, mode);
            linearLayout.addView(yr0Var, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var2 = new yr0(context, e6Var);
            yr0Var2.a.l(org.telegram.messenger.bd.M0(2131751421, null), false);
            yr0Var2.b.setText(org.telegram.messenger.bd.M0(2131751418, null));
            yr0Var2.d.setVisibility(8);
            yr0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            org.telegram.ui.ActionBar.r6.t(yr0Var2.c, i23, e6Var, mode);
            linearLayout.addView(yr0Var2, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            yr0 yr0Var3 = new yr0(context, e6Var);
            yr0Var3.a.l(org.telegram.messenger.bd.M0(2131751420, null), false);
            yr0Var3.b.setText(org.telegram.messenger.bd.M0(2131751417, null));
            yr0Var3.d.setVisibility(8);
            yr0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            org.telegram.ui.ActionBar.r6.t(yr0Var3.c, i23, e6Var, mode);
            linearLayout.addView(yr0Var3, b8.mf.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            gi.d dVar = new gi.d(context, e6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.Components.q2(0, zArr, e2Var));
            dVar.f();
            dVar.i(org.telegram.messenger.bd.M0(2131751424, null), false, true);
            linearLayout.addView(dVar, b8.mf.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            l11.O = linearLayout;
            l11.show();
            l11.n(new lo(7, zArr, pu0Var));
            return;
        }
        if (i3 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().d5(profileActivity6.e1, 0, false, new gi.m9(2, profileActivity6, false));
            return;
        }
        int i24 = 9;
        if (i3 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.S = org.telegram.messenger.bd.K0(1, "DeleteTopics");
            i17 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
            org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(i17).q7;
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic f10 = c00Var.f(profileActivity7.f1, profileActivity7.g1);
            final int i25 = 0;
            alertDialog$Builder2.a.U = org.telegram.messenger.bd.a0("DeleteSelectedTopic", null, 2131751499, f10 == null ? "topic" : f10.title);
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.gv0
                public final /* synthetic */ iv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.p1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i26) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    int i27;
                    int i28;
                    boolean z10;
                    org.telegram.messenger.po poVar;
                    TLRPC.Photo photo;
                    int i29 = i25;
                    iv0 iv0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity8 = iv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.g1));
                            profileActivity8.getMessagesController().q7.d(arrayList, profileActivity8.f1);
                            profileActivity8.J1 = 0;
                            q4Var = ((org.telegram.ui.ActionBar.d2) profileActivity8).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.d2) profileActivity8).parentLayout;
                                if (q4Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < q4Var3.getFragmentStack().size(); i30++) {
                                        q4Var4 = ((org.telegram.ui.ActionBar.d2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) q4Var4.getFragmentStack().get(i30);
                                        if ((d2Var instanceof wm) && ((wm) d2Var).b() == profileActivity8.g1) {
                                            d2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(parentActivity2), profileActivity8.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.K0(1, "TopicsDeleted")).j();
                            }
                            s1Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = iv0Var.b;
                            i27 = ((org.telegram.ui.ActionBar.d2) profileActivity9).currentAccount;
                            if (org.telegram.messenger.hp.s1(i27).v2()) {
                                i28 = ((org.telegram.ui.ActionBar.d2) profileActivity9).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity9.j1 = true;
                                profileActivity9.getSecretChatHelper().A(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().a2(Long.valueOf(profileActivity9.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = iv0Var.b;
                            int realPosition = profileActivity10.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.v2;
                            if (profileActivity10.I2 == null || realPosition != 0) {
                                if (profileActivity10.q5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().j2(userFull, true);
                                    profileActivity10.I5(false);
                                }
                                if (profileActivity10.o0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.o0.F(1);
                                    if (F2 != null) {
                                        profileActivity10.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F2.sizes, 1000, false, null, false);
                                        if (w10 != null && w11 != null) {
                                            profileActivity10.getUserConfig().f().photo.photo_small = w10.location;
                                            profileActivity10.getUserConfig().f().photo.photo_big = w11.location;
                                        }
                                    } else {
                                        profileActivity10.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity10.getMessagesController().l0(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity10.getMessagesController().l0(tL_inputPhoto);
                                    org.telegram.messenger.qr messagesStorage = profileActivity10.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.mp(4, profileActivity10.e1, F.id, messagesStorage));
                                }
                                ru0 ru0Var = profileActivity10.o0;
                                ArrayList arrayList2 = ru0Var.Y0;
                                ArrayList arrayList3 = ru0Var.W0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (poVar = ru0Var.T0) == null) {
                                        arrayList3.remove(realPosition);
                                        ru0Var.V0.remove(realPosition);
                                        ru0Var.U0.remove(realPosition);
                                        ru0Var.X0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        ru0Var.Z0.remove(realPosition);
                                        ru0Var.a1.remove(realPosition);
                                        ru0Var.b1.remove(realPosition);
                                        ru0Var.e1.delete(realPosition);
                                        ru0Var.c1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            ru0Var.Q0 = (org.telegram.messenger.ac) arrayList2.get(0);
                                            ru0Var.R0 = null;
                                            ru0Var.S0 = null;
                                        }
                                        ru0Var.E0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        poVar.e(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity10.o0.getRealCount() <= 0) {
                                    profileActivity10.o0.setVisibility(8);
                                    profileActivity10.f0.setForegroundAlpha(1.0f);
                                    profileActivity10.Y.setVisibility(0);
                                    profileActivity10.I0 = true;
                                    View m10 = profileActivity10.c.m(0);
                                    if (m10 != null) {
                                        profileActivity10.a.w0(0, m10.getTop() - profileActivity10.j4(), org.telegram.ui.Components.xq.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.r0.b();
                                if (profileActivity10.j6 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.j6, true);
                                }
                                profileActivity10.o2 = (org.telegram.messenger.g0.Q1() || profileActivity10.n2 || !profileActivity10.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity10.I2 = null;
                                profileActivity10.J2 = null;
                                ru0 ru0Var2 = profileActivity10.o0;
                                ru0Var2.I0 = true;
                                ru0Var2.L0 = profileActivity10.K2;
                                ru0Var2.r1 = null;
                                ru0Var2.s1 = null;
                                ru0Var2.setCreateThumbFromParent(false);
                                profileActivity10.I5(true);
                                profileActivity10.j5(false, true);
                                profileActivity10.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.hp.C8));
                                profileActivity10.getNotificationCenter().k(46, new Object[0]);
                                profileActivity10.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(i24));
            org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
            s1Var2.show();
            TextView textView3 = (TextView) s1Var2.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q7, null);
                return;
            }
            return;
        }
        if (i3 == 24) {
            ProfileActivity profileActivity8 = this.b;
            ey0.K0(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i3 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.q1) {
                profileActivity9.presentFragment(l81.f0(profileActivity9.f1, profileActivity9.g1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j11 = profileActivity10.f1;
            if (j11 != 0) {
                bundle3.putLong("chat_id", j11);
            } else if (profileActivity10.r2) {
                bundle3.putLong("user_id", profileActivity10.e1);
            }
            ln lnVar = new ln(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.u2;
            if (chatFull != null) {
                lnVar.q0(chatFull);
            } else {
                lnVar.r0(profileActivity11.v2);
            }
            this.b.presentFragment(lnVar);
            return;
        }
        if (i3 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i3 == 9) {
            TLRPC.User a24 = this.b.getMessagesController().a2(Long.valueOf(this.b.e1));
            if (a24 == null) {
                return;
            }
            Bundle l12 = org.telegram.ui.Cells.f1.l(2, "onlySelect", "dialogsType", true);
            l12.putBoolean("resetDelegate", false);
            l12.putBoolean("closeFragment", false);
            uw uwVar2 = new uw(l12);
            uwVar2.D2 = new b7(this, a24, uwVar2, 19);
            this.b.presentFragment(uwVar2);
            return;
        }
        if (i3 == 10) {
            this.b.G4();
            return;
        }
        if (i3 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.D2 != null) {
                    j10 = org.telegram.messenger.m5.F(r2.id);
                } else {
                    j10 = profileActivity12.e1;
                    if (j10 == 0) {
                        long j12 = profileActivity12.f1;
                        if (j12 == 0) {
                            return;
                        } else {
                            j10 = -j12;
                        }
                    }
                }
                org.telegram.messenger.li mediaDataController = this.b.getMediaDataController();
                Pattern pattern2 = org.telegram.messenger.li.S1;
                mediaDataController.y0(j10, 0, null);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i3 == 15 || i3 == 16) {
            this.b.C4(i3 == 16);
            return;
        }
        if (i3 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            nq nqVar = new nq(bundle4);
            nqVar.C0(this.b.u2);
            this.b.presentFragment(nqVar);
            return;
        }
        if (i3 == 18) {
            this.b.J4();
            return;
        }
        if (i3 == 19) {
            this.b.presentFragment(r41.g0(this.b.getMessagesController().M0(Long.valueOf(this.b.f1)), false));
            return;
        }
        if (i3 == 22) {
            this.b.M4();
            return;
        }
        if (i3 == 38) {
            this.b.D4();
            return;
        }
        if (i3 == 48) {
            ProfileActivity profileActivity13 = this.b;
            org.telegram.ui.Wallet.m9 m9Var = new org.telegram.ui.Wallet.m9(profileActivity13.getMessagesController().a2(Long.valueOf(this.b.e1)));
            m9Var.g0 = true;
            profileActivity13.presentFragment(m9Var);
            return;
        }
        if (i3 == 39) {
            Bundle k10 = org.telegram.ui.Cells.f1.k(2, TeXSymbolParser.TYPE_ATTR);
            k10.putLong("dialog_id", -this.b.f1);
            org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(k10, null);
            ProfileActivity profileActivity14 = this.b;
            r80Var.c = profileActivity14.u2;
            profileActivity14.presentFragment(r80Var);
            return;
        }
        if (i3 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            alertDialog$Builder3.a.S = org.telegram.messenger.bd.M0(2131754078, null);
            alertDialog$Builder3.a.U = org.telegram.messenger.bd.M0(2131754079, null);
            final int i26 = 1;
            alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131744925, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.gv0
                public final /* synthetic */ iv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.p1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i262) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    int i27;
                    int i28;
                    boolean z10;
                    org.telegram.messenger.po poVar;
                    TLRPC.Photo photo;
                    int i29 = i26;
                    iv0 iv0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity82 = iv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().q7.d(arrayList, profileActivity82.f1);
                            profileActivity82.J1 = 0;
                            q4Var = ((org.telegram.ui.ActionBar.d2) profileActivity82).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.d2) profileActivity82).parentLayout;
                                if (q4Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < q4Var3.getFragmentStack().size(); i30++) {
                                        q4Var4 = ((org.telegram.ui.ActionBar.d2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) q4Var4.getFragmentStack().get(i30);
                                        if ((d2Var instanceof wm) && ((wm) d2Var).b() == profileActivity82.g1) {
                                            d2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.K0(1, "TopicsDeleted")).j();
                            }
                            s1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = iv0Var.b;
                            i27 = ((org.telegram.ui.ActionBar.d2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.hp.s1(i27).v2()) {
                                i28 = ((org.telegram.ui.ActionBar.d2) profileActivity92).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().a2(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = iv0Var.b;
                            int realPosition = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.v2;
                            if (profileActivity102.I2 == null || realPosition != 0) {
                                if (profileActivity102.q5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.I5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.o0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F2.sizes, 1000, false, null, false);
                                        if (w10 != null && w11 != null) {
                                            profileActivity102.getUserConfig().f().photo.photo_small = w10.location;
                                            profileActivity102.getUserConfig().f().photo.photo_big = w11.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().l0(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().l0(tL_inputPhoto);
                                    org.telegram.messenger.qr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.mp(4, profileActivity102.e1, F.id, messagesStorage));
                                }
                                ru0 ru0Var = profileActivity102.o0;
                                ArrayList arrayList2 = ru0Var.Y0;
                                ArrayList arrayList3 = ru0Var.W0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (poVar = ru0Var.T0) == null) {
                                        arrayList3.remove(realPosition);
                                        ru0Var.V0.remove(realPosition);
                                        ru0Var.U0.remove(realPosition);
                                        ru0Var.X0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        ru0Var.Z0.remove(realPosition);
                                        ru0Var.a1.remove(realPosition);
                                        ru0Var.b1.remove(realPosition);
                                        ru0Var.e1.delete(realPosition);
                                        ru0Var.c1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            ru0Var.Q0 = (org.telegram.messenger.ac) arrayList2.get(0);
                                            ru0Var.R0 = null;
                                            ru0Var.S0 = null;
                                        }
                                        ru0Var.E0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        poVar.e(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity102.o0.getRealCount() <= 0) {
                                    profileActivity102.o0.setVisibility(8);
                                    profileActivity102.f0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.I0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.j4(), org.telegram.ui.Components.xq.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.j6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.j6, true);
                                }
                                profileActivity102.o2 = (org.telegram.messenger.g0.Q1() || profileActivity102.n2 || !profileActivity102.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.I2 = null;
                                profileActivity102.J2 = null;
                                ru0 ru0Var2 = profileActivity102.o0;
                                ru0Var2.I0 = true;
                                ru0Var2.L0 = profileActivity102.K2;
                                ru0Var2.r1 = null;
                                ru0Var2.s1 = null;
                                ru0Var2.setCreateThumbFromParent(false);
                                profileActivity102.I5(true);
                                profileActivity102.j5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.hp.C8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            this.b.showDialog(alertDialog$Builder3.a);
            return;
        }
        if (i3 == 44) {
            i16 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
            long j13 = this.b.e1;
            TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(i16).b2(j13);
            if (b22 == null || (botInfo = b22.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                while (true) {
                    if (i20 >= size) {
                        str2 = org.telegram.messenger.bd.M0(2131753098, null);
                        break;
                    }
                    TLRPC.BotCommand botCommand = arrayList.get(i20);
                    i20++;
                    if ("privacy".equals(botCommand.command)) {
                        break;
                    }
                }
            }
            if (str2 != null) {
                sf.c.t(org.telegram.messenger.t0.b, str2);
                return;
            }
            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            if (!(T instanceof wm) || ((wm) T).a() != j13) {
                T.presentFragment(wm.ra(j13));
            }
            org.telegram.messenger.g0.i3(new ci.s9(i16, j13, 1), 150L);
            return;
        }
        if (i3 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            ru0 ru0Var = this.b.o0;
            org.telegram.messenger.ac D = ru0Var.D(ru0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.p == 2;
            i15 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
            org.telegram.messenger.w7.G(i15);
            File K = org.telegram.messenger.w7.K(D.f, z10 ? "mp4" : null, true, true);
            if (z10 && !K.exists()) {
                K = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f));
            }
            if (K.exists()) {
                MediaController.d0(K.toString(), this.b.getParentActivity(), 0, null, null, new ci.b8(i22, this, z10));
                return;
            }
            return;
        }
        if (i3 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i3 == 40) {
            ProfileActivity profileActivity15 = this.b;
            cm0 cm0Var = new cm0();
            cm0Var.I = this.b;
            profileActivity15.presentFragment(cm0Var);
            return;
        }
        if (i3 == 42) {
            if (org.telegram.messenger.g0.g(this.b.getMessagesController().V2 + "/" + org.telegram.messenger.l10.n(this.b.getMessagesController().a2(Long.valueOf(this.b.e1))))) {
                org.telegram.ui.Components.fc.a0(this.b).k(false).j();
                return;
            }
            return;
        }
        if (i3 == 43) {
            this.b.presentFragment(new ka(null));
            return;
        }
        if (i3 == 31) {
            this.b.presentFragment(new zd0(null));
            return;
        }
        if (i3 != 33) {
            if (i3 == 34) {
                i10 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
                if (org.telegram.messenger.hp.s1(i10).v2()) {
                    i13 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
                    b.b(i13);
                    return;
                }
                int realPosition = this.b.o0.getRealPosition();
                org.telegram.messenger.ac D2 = this.b.o0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
                org.telegram.messenger.w7.G(i11);
                Drawable[] drawableArr = PhotoViewer.V8;
                File K2 = org.telegram.messenger.w7.K(D2.f, PhotoViewer.s1(D2), true, true);
                boolean z11 = D2.p == 2;
                if (z11) {
                    org.telegram.messenger.ac G = this.b.o0.G(realPosition);
                    i12 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
                    org.telegram.messenger.w7.G(i12);
                    str = org.telegram.messenger.w7.K(G != null ? G.f : null, PhotoViewer.s1(G), true, true).getAbsolutePath();
                }
                this.b.r0.p(K2.getAbsolutePath(), str, z11);
                return;
            }
            if (i3 != 35) {
                if (i3 == 36) {
                    this.b.I4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            ru0 ru0Var2 = this.b.o0;
            org.telegram.messenger.ac D3 = ru0Var2.D(ru0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.p == 2) {
                alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131754083, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131754085, null);
            } else {
                alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131754094, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131754096, null);
            }
            alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.gv0
                public final /* synthetic */ iv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.p1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void g(org.telegram.ui.ActionBar.s1 s1Var22, int i262) {
                    org.telegram.ui.ActionBar.q4 q4Var;
                    org.telegram.ui.ActionBar.q4 q4Var2;
                    org.telegram.ui.ActionBar.q4 q4Var3;
                    org.telegram.ui.ActionBar.q4 q4Var4;
                    int i27;
                    int i28;
                    boolean z102;
                    org.telegram.messenger.po poVar;
                    TLRPC.Photo photo;
                    int i29 = i19;
                    iv0 iv0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ProfileActivity profileActivity82 = iv0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().q7.d(arrayList2, profileActivity82.f1);
                            profileActivity82.J1 = 0;
                            q4Var = ((org.telegram.ui.ActionBar.d2) profileActivity82).parentLayout;
                            if (q4Var != null) {
                                q4Var2 = ((org.telegram.ui.ActionBar.d2) profileActivity82).parentLayout;
                                if (q4Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < q4Var3.getFragmentStack().size(); i30++) {
                                        q4Var4 = ((org.telegram.ui.ActionBar.d2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) q4Var4.getFragmentStack().get(i30);
                                        if ((d2Var instanceof wm) && ((wm) d2Var).b() == profileActivity82.g1) {
                                            d2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.bd.K0(1, "TopicsDeleted")).j();
                            }
                            s1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = iv0Var.b;
                            i27 = ((org.telegram.ui.ActionBar.d2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.hp.s1(i27).v2()) {
                                i28 = ((org.telegram.ui.ActionBar.d2) profileActivity92).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().a2(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = iv0Var.b;
                            int realPosition2 = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition2);
                            TLRPC.UserFull userFull = profileActivity102.v2;
                            if (profileActivity102.I2 == null || realPosition2 != 0) {
                                if (profileActivity102.q5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.I5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.G3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.o0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.o0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F2.sizes, 1000, false, null, false);
                                        if (w10 != null && w11 != null) {
                                            profileActivity102.getUserConfig().f().photo.photo_small = w10.location;
                                            profileActivity102.getUserConfig().f().photo.photo_big = w11.location;
                                        }
                                    } else {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity102.getMessagesController().l0(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = F.id;
                                    tL_inputPhoto.access_hash = F.access_hash;
                                    byte[] bArr = F.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity102.getMessagesController().l0(tL_inputPhoto);
                                    org.telegram.messenger.qr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.mp(4, profileActivity102.e1, F.id, messagesStorage));
                                }
                                ru0 ru0Var3 = profileActivity102.o0;
                                ArrayList arrayList22 = ru0Var3.Y0;
                                ArrayList arrayList3 = ru0Var3.W0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (poVar = ru0Var3.T0) == null) {
                                        arrayList3.remove(realPosition2);
                                        ru0Var3.V0.remove(realPosition2);
                                        ru0Var3.U0.remove(realPosition2);
                                        ru0Var3.X0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        ru0Var3.Z0.remove(realPosition2);
                                        ru0Var3.a1.remove(realPosition2);
                                        ru0Var3.b1.remove(realPosition2);
                                        ru0Var3.e1.delete(realPosition2);
                                        ru0Var3.c1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            ru0Var3.Q0 = (org.telegram.messenger.ac) arrayList22.get(0);
                                            ru0Var3.R0 = null;
                                            ru0Var3.S0 = null;
                                        }
                                        ru0Var3.E0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        poVar.e(photo2.id);
                                        z102 = true;
                                    }
                                }
                                if (z102 || profileActivity102.o0.getRealCount() <= 0) {
                                    profileActivity102.o0.setVisibility(8);
                                    profileActivity102.f0.setForegroundAlpha(1.0f);
                                    profileActivity102.Y.setVisibility(0);
                                    profileActivity102.I0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.j4(), org.telegram.ui.Components.xq.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.j6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.j6, true);
                                }
                                profileActivity102.o2 = (org.telegram.messenger.g0.Q1() || profileActivity102.n2 || !profileActivity102.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.I2 = null;
                                profileActivity102.J2 = null;
                                ru0 ru0Var22 = profileActivity102.o0;
                                ru0Var22.I0 = true;
                                ru0Var22.L0 = profileActivity102.K2;
                                ru0Var22.r1 = null;
                                ru0Var22.s1 = null;
                                ru0Var22.setCreateThumbFromParent(false);
                                profileActivity102.I5(true);
                                profileActivity102.j5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.hp.C8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder4.a;
            this.b.showDialog(s1Var3);
            TextView textView4 = (TextView) s1Var3.d(-1);
            if (textView4 != null) {
                org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.q7, this.b.A0);
                return;
            }
            return;
        }
        int realPosition2 = this.b.o0.getRealPosition();
        TLRPC.Photo F = this.b.o0.F(realPosition2);
        if (F == null) {
            return;
        }
        ru0 ru0Var3 = this.b.o0;
        ArrayList arrayList2 = ru0Var3.c1;
        ArrayList arrayList3 = ru0Var3.b1;
        ArrayList arrayList4 = ru0Var3.a1;
        ArrayList arrayList5 = ru0Var3.Z0;
        ArrayList arrayList6 = ru0Var3.X0;
        ArrayList arrayList7 = ru0Var3.V0;
        ArrayList arrayList8 = ru0Var3.Y0;
        ArrayList arrayList9 = ru0Var3.W0;
        org.telegram.messenger.po poVar = ru0Var3.T0;
        if (poVar != null) {
            poVar.c(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            ru0Var3.d1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = ru0Var3.U0;
            arrayList10.add(0, (String) arrayList10.remove(realPosition2));
            org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, acVar);
            org.telegram.messenger.ac acVar2 = (org.telegram.messenger.ac) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, acVar2);
            org.telegram.messenger.ac acVar3 = (org.telegram.messenger.ac) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, acVar3);
            org.telegram.ui.Components.x41 x41Var = (org.telegram.ui.Components.x41) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, x41Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f11 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f11);
            ru0Var3.Q0 = (org.telegram.messenger.ac) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        org.telegram.messenger.h10 userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new co0(this, userConfig, F, 6));
        ProfileActivity profileActivity16 = this.b;
        profileActivity16.M.m(profileActivity16.e1, F.video_sizes.isEmpty() ? null : 1, 22);
        TLRPC.User a25 = this.b.getMessagesController().a2(Long.valueOf(userConfig.n));
        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
        if (a25 != null) {
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
            TLRPC.UserProfilePhoto userProfilePhoto = a25.photo;
            userProfilePhoto.photo_id = F.id;
            userProfilePhoto.photo_small = w11.location;
            userProfilePhoto.photo_big = w10.location;
            userConfig.w(a25);
            userConfig.v(true);
            i14 = ((org.telegram.ui.ActionBar.d2) this.b).currentAccount;
            org.telegram.messenger.hs.f(i14).k(org.telegram.messenger.hs.j0, new Object[0]);
            this.b.I5(true);
        }
        ru0 ru0Var4 = this.b.o0;
        ru0Var4.E0.g();
        ru0Var4.L();
    }
}
