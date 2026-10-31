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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dx0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public dx0(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        TL_bots.BotInfo botInfo;
        int i18;
        int i19;
        org.telegram.ui.Components.ur0 ur0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i10 == -1) {
            ProfileActivity profileActivity = this.b;
            ix0 ix0Var = profileActivity.N;
            if (ix0Var == null || (ur0Var = ix0Var.K0) == null || !ur0Var.n0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.k5();
                return;
            }
        }
        final int i20 = 2;
        int i21 = 0;
        if (i10 == 2) {
            this.b.A4(false);
            return;
        }
        if (i10 == 1) {
            TLRPC.User Z1 = this.b.getMessagesController().Z1(Long.valueOf(this.b.d1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", Z1.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            ns nsVar = new ns(bundle, profileActivity2.z0);
            nsVar.O = new gv0(profileActivity2, Z1);
            profileActivity2.presentFragment(nsVar);
            return;
        }
        String str = null;
        if (i10 == 3) {
            Bundle j11 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
            j11.putString("selectAlertString", org.telegram.messenger.cd.L0(2131745647, null));
            j11.putString("selectAlertStringGroup", org.telegram.messenger.cd.L0(2131745648, null));
            ay ayVar = new ay(j11);
            ProfileActivity profileActivity3 = this.b;
            ayVar.C2 = profileActivity3;
            profileActivity3.presentFragment(ayVar);
            return;
        }
        int i22 = 4;
        if (i10 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.d1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new ns(bundle2, profileActivity4.z0));
            return;
        }
        int i23 = 10;
        if (i10 == 5) {
            TLRPC.User Z12 = this.b.getMessagesController().Z1(Long.valueOf(this.b.d1));
            if (Z12 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.z0);
            alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131751553, null);
            alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131754103, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ep0(i23, this, Z12));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            this.b.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, this.b.z0);
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.b.v4(false);
            return;
        }
        if (i10 == 45) {
            this.b.v4(true);
            return;
        }
        if (i10 == 46) {
            if (!this.b.getUserConfig().q()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i19 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
                new kg.i1(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.p6 p6Var = this.b.z0;
            wv0 wv0Var = new wv0(this, 4);
            Pattern pattern = org.telegram.ui.Components.s4.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, null, false);
            mg.l1 l1Var = k10.x0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
            linearLayout.addView(ei0Var, w7.b6.t(org.telegram.messenger.zs.v1, org.telegram.messenger.zs.v1, 17, 0, 21, 0, 11));
            ei0Var.f(R.raw.raised_hand, org.telegram.messenger.zs.v1, org.telegram.messenger.zs.v1, null);
            ei0Var.setAutoRepeat(false);
            ei0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(org.telegram.messenger.i0.o());
            textView2.setGravity(17);
            textView2.setText(org.telegram.messenger.cd.L0(2131751423, null));
            textView2.setTextSize(1, 20.0f);
            int i24 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.V(textView2, i24, p6Var);
            linearLayout.addView(textView2, w7.b6.t(-1, -2, 17, 20, 0, 20, 14));
            st0 st0Var = new st0(context, p6Var);
            st0Var.a.l(org.telegram.messenger.cd.L0(2131751422, null), false);
            st0Var.b.setText(org.telegram.messenger.cd.L0(2131751419, null));
            st0Var.d.setVisibility(8);
            st0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            ImageView imageView = st0Var.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.a7.t(imageView, i24, p6Var, mode);
            linearLayout.addView(st0Var, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            st0 st0Var2 = new st0(context, p6Var);
            st0Var2.a.l(org.telegram.messenger.cd.L0(2131751421, null), false);
            st0Var2.b.setText(org.telegram.messenger.cd.L0(2131751418, null));
            st0Var2.d.setVisibility(8);
            st0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            org.telegram.ui.ActionBar.a7.t(st0Var2.c, i24, p6Var, mode);
            linearLayout.addView(st0Var2, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            st0 st0Var3 = new st0(context, p6Var);
            st0Var3.a.l(org.telegram.messenger.cd.L0(2131751420, null), false);
            st0Var3.b.setText(org.telegram.messenger.cd.L0(2131751417, null));
            st0Var3.d.setVisibility(8);
            st0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            org.telegram.ui.ActionBar.a7.t(st0Var3.c, i24, p6Var, mode);
            linearLayout.addView(st0Var3, w7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            vh.d dVar = new vh.d(context, p6Var, true);
            dVar.setOnClickListener(new ud(16, zArr, l1Var));
            dVar.f();
            dVar.i(org.telegram.messenger.cd.L0(2131751424, null), false, true);
            linearLayout.addView(dVar, w7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            k10.N = linearLayout;
            k10.show();
            k10.o(new zg(26, zArr, wv0Var));
            return;
        }
        final int i25 = 0;
        if (i10 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().a5(profileActivity6.d1, 0, false, new cv0(i25, profileActivity6, r8));
            return;
        }
        int i26 = 24;
        if (i10 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.R = org.telegram.messenger.cd.J0(1, "DeleteTopics");
            i18 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
            org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(i18).r7;
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic f7 = x00Var.f(profileActivity7.e1, profileActivity7.f1);
            alertDialog$Builder2.a.T = org.telegram.messenger.cd.a0("DeleteSelectedTopic", null, 2131751499, f7 == null ? "topic" : f7.title);
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.bx0
                public final /* synthetic */ dx0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.u1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i27) {
                    org.telegram.ui.ActionBar.z4 z4Var;
                    org.telegram.ui.ActionBar.z4 z4Var2;
                    org.telegram.ui.ActionBar.z4 z4Var3;
                    org.telegram.ui.ActionBar.z4 z4Var4;
                    int i28;
                    int i29;
                    boolean z10;
                    org.telegram.messenger.dp dpVar;
                    TLRPC.Photo photo;
                    int i30 = i25;
                    dx0 dx0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity8 = dx0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.f1));
                            profileActivity8.getMessagesController().r7.d(arrayList, profileActivity8.e1);
                            profileActivity8.I1 = 0;
                            z4Var = ((org.telegram.ui.ActionBar.k2) profileActivity8).parentLayout;
                            if (z4Var != null) {
                                z4Var2 = ((org.telegram.ui.ActionBar.k2) profileActivity8).parentLayout;
                                if (z4Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < z4Var3.getFragmentStack().size(); i31++) {
                                        z4Var4 = ((org.telegram.ui.ActionBar.k2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) z4Var4.getFragmentStack().get(i31);
                                        if ((k2Var instanceof un) && ((un) k2Var).b() == profileActivity8.f1) {
                                            k2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(parentActivity2), profileActivity8.z0).Q(R.raw.ic_delete, 36, org.telegram.messenger.cd.J0(1, "TopicsDeleted")).j();
                            }
                            x1Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = dx0Var.b;
                            i28 = ((org.telegram.ui.ActionBar.k2) profileActivity9).currentAccount;
                            if (org.telegram.messenger.vp.r1(i28).u2()) {
                                i29 = ((org.telegram.ui.ActionBar.k2) profileActivity9).currentAccount;
                                b.b(i29);
                                break;
                            } else {
                                profileActivity9.i1 = true;
                                profileActivity9.getSecretChatHelper().A(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().Z1(Long.valueOf(profileActivity9.d1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = dx0Var.b;
                            int realPosition = profileActivity10.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.n0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.u2;
                            if (profileActivity10.H2 == null || realPosition != 0) {
                                if (profileActivity10.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().j2(userFull, true);
                                    profileActivity10.H5(false);
                                }
                                if (profileActivity10.n0.getRealCount() == 1) {
                                    ProfileActivity.F3(profileActivity10, true);
                                }
                                if (F == null || profileActivity10.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity10.n0.F(1);
                                    if (F2 != null) {
                                        profileActivity10.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F2.sizes, 1000, false, null, false);
                                        if (w9 != null && w10 != null) {
                                            profileActivity10.getUserConfig().f().photo.photo_small = w9.location;
                                            profileActivity10.getUserConfig().f().photo.photo_big = w10.location;
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
                                    org.telegram.messenger.hs messagesStorage = profileActivity10.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.aq(4, profileActivity10.d1, F.id, messagesStorage));
                                }
                                kw0 kw0Var = profileActivity10.n0;
                                ArrayList arrayList2 = kw0Var.X0;
                                ArrayList arrayList3 = kw0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dpVar = kw0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        kw0Var.U0.remove(realPosition);
                                        kw0Var.T0.remove(realPosition);
                                        kw0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        kw0Var.Y0.remove(realPosition);
                                        kw0Var.Z0.remove(realPosition);
                                        kw0Var.a1.remove(realPosition);
                                        kw0Var.d1.delete(realPosition);
                                        kw0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            kw0Var.P0 = (org.telegram.messenger.ic) arrayList2.get(0);
                                            kw0Var.Q0 = null;
                                            kw0Var.R0 = null;
                                        }
                                        kw0Var.D0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dpVar.d(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity10.n0.getRealCount() <= 0) {
                                    profileActivity10.n0.setVisibility(8);
                                    profileActivity10.e0.setForegroundAlpha(1.0f);
                                    profileActivity10.X.setVisibility(0);
                                    profileActivity10.H0 = true;
                                    View m10 = profileActivity10.c.m(0);
                                    if (m10 != null) {
                                        profileActivity10.a.w0(0, m10.getTop() - profileActivity10.i4(), org.telegram.ui.Components.gr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.q0.b();
                                if (profileActivity10.h6 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.h6, true);
                                }
                                profileActivity10.n2 = (org.telegram.messenger.i0.Q1() || profileActivity10.m2 || !profileActivity10.e0.getImageReceiver().L() || org.telegram.messenger.i0.C1()) ? false : true;
                                profileActivity10.H2 = null;
                                profileActivity10.I2 = null;
                                kw0 kw0Var2 = profileActivity10.n0;
                                kw0Var2.H0 = true;
                                kw0Var2.K0 = profileActivity10.J2;
                                kw0Var2.q1 = null;
                                kw0Var2.r1 = null;
                                kw0Var2.setCreateThumbFromParent(false);
                                profileActivity10.H5(true);
                                profileActivity10.i5(false, true);
                                profileActivity10.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.vp.D8));
                                profileActivity10.getNotificationCenter().k(46, new Object[0]);
                                profileActivity10.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(i26));
            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
            x1Var2.show();
            TextView textView3 = (TextView) x1Var2.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            return;
        }
        if (i10 == 24) {
            ProfileActivity profileActivity8 = this.b;
            c01.K0(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i10 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.p1) {
                profileActivity9.presentFragment(la1.e0(profileActivity9.e1, profileActivity9.f1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j12 = profileActivity10.e1;
            if (j12 != 0) {
                bundle3.putLong("chat_id", j12);
            } else if (profileActivity10.q2) {
                bundle3.putLong("user_id", profileActivity10.d1);
            }
            oo ooVar = new oo(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.t2;
            if (chatFull != null) {
                ooVar.p0(chatFull);
            } else {
                ooVar.q0(profileActivity11.u2);
            }
            this.b.presentFragment(ooVar);
            return;
        }
        if (i10 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i27 = 19;
        if (i10 == 9) {
            TLRPC.User Z13 = this.b.getMessagesController().Z1(Long.valueOf(this.b.d1));
            if (Z13 == null) {
                return;
            }
            Bundle j13 = org.telegram.ui.Cells.f1.j(2, "onlySelect", "dialogsType", true);
            j13.putBoolean("resetDelegate", false);
            j13.putBoolean("closeFragment", false);
            ay ayVar2 = new ay(j13);
            ayVar2.C2 = new a7(this, Z13, ayVar2, i27);
            this.b.presentFragment(ayVar2);
            return;
        }
        if (i10 == 10) {
            this.b.F4();
            return;
        }
        if (i10 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.C2 != null) {
                    j10 = org.telegram.messenger.o5.F(r2.id);
                } else {
                    j10 = profileActivity12.d1;
                    if (j10 == 0) {
                        long j14 = profileActivity12.e1;
                        if (j14 == 0) {
                            return;
                        } else {
                            j10 = -j14;
                        }
                    }
                }
                org.telegram.messenger.ui mediaDataController = this.b.getMediaDataController();
                Pattern pattern2 = org.telegram.messenger.ui.R1;
                mediaDataController.y0(j10, 0, null);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        if (i10 == 15 || i10 == 16) {
            this.b.B4(i10 == 16);
            return;
        }
        if (i10 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.e1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            pr prVar = new pr(bundle4);
            prVar.B0(this.b.t2);
            this.b.presentFragment(prVar);
            return;
        }
        if (i10 == 18) {
            this.b.I4();
            return;
        }
        if (i10 == 19) {
            this.b.presentFragment(u61.f0(this.b.getMessagesController().L0(Long.valueOf(this.b.e1)), false));
            return;
        }
        if (i10 == 22) {
            this.b.L4();
            return;
        }
        if (i10 == 38) {
            this.b.C4();
            return;
        }
        if (i10 == 48) {
            ProfileActivity profileActivity13 = this.b;
            org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9(profileActivity13.getMessagesController().Z1(Long.valueOf(this.b.d1)));
            r9Var.f0 = true;
            profileActivity13.presentFragment(r9Var);
            return;
        }
        if (i10 == 39) {
            Bundle i28 = org.telegram.ui.Cells.f1.i(2, TeXSymbolParser.TYPE_ATTR);
            i28.putLong("dialog_id", -this.b.e1);
            org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(i28, null);
            ProfileActivity profileActivity14 = this.b;
            n90Var.c = profileActivity14.t2;
            profileActivity14.presentFragment(n90Var);
            return;
        }
        if (i10 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.z0);
            alertDialog$Builder3.a.R = org.telegram.messenger.cd.L0(2131754078, null);
            alertDialog$Builder3.a.T = org.telegram.messenger.cd.L0(2131754079, null);
            final int i29 = 1;
            alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131744933, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.bx0
                public final /* synthetic */ dx0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.u1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i272) {
                    org.telegram.ui.ActionBar.z4 z4Var;
                    org.telegram.ui.ActionBar.z4 z4Var2;
                    org.telegram.ui.ActionBar.z4 z4Var3;
                    org.telegram.ui.ActionBar.z4 z4Var4;
                    int i282;
                    int i292;
                    boolean z10;
                    org.telegram.messenger.dp dpVar;
                    TLRPC.Photo photo;
                    int i30 = i29;
                    dx0 dx0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity82 = dx0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.f1));
                            profileActivity82.getMessagesController().r7.d(arrayList, profileActivity82.e1);
                            profileActivity82.I1 = 0;
                            z4Var = ((org.telegram.ui.ActionBar.k2) profileActivity82).parentLayout;
                            if (z4Var != null) {
                                z4Var2 = ((org.telegram.ui.ActionBar.k2) profileActivity82).parentLayout;
                                if (z4Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < z4Var3.getFragmentStack().size(); i31++) {
                                        z4Var4 = ((org.telegram.ui.ActionBar.k2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) z4Var4.getFragmentStack().get(i31);
                                        if ((k2Var instanceof un) && ((un) k2Var).b() == profileActivity82.f1) {
                                            k2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(parentActivity2), profileActivity82.z0).Q(R.raw.ic_delete, 36, org.telegram.messenger.cd.J0(1, "TopicsDeleted")).j();
                            }
                            x1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = dx0Var.b;
                            i282 = ((org.telegram.ui.ActionBar.k2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.vp.r1(i282).u2()) {
                                i292 = ((org.telegram.ui.ActionBar.k2) profileActivity92).currentAccount;
                                b.b(i292);
                                break;
                            } else {
                                profileActivity92.i1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().Z1(Long.valueOf(profileActivity92.d1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = dx0Var.b;
                            int realPosition = profileActivity102.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.n0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.u2;
                            if (profileActivity102.H2 == null || realPosition != 0) {
                                if (profileActivity102.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.H5(false);
                                }
                                if (profileActivity102.n0.getRealCount() == 1) {
                                    ProfileActivity.F3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.n0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F2.sizes, 1000, false, null, false);
                                        if (w9 != null && w10 != null) {
                                            profileActivity102.getUserConfig().f().photo.photo_small = w9.location;
                                            profileActivity102.getUserConfig().f().photo.photo_big = w10.location;
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
                                    org.telegram.messenger.hs messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.aq(4, profileActivity102.d1, F.id, messagesStorage));
                                }
                                kw0 kw0Var = profileActivity102.n0;
                                ArrayList arrayList2 = kw0Var.X0;
                                ArrayList arrayList3 = kw0Var.V0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dpVar = kw0Var.S0) == null) {
                                        arrayList3.remove(realPosition);
                                        kw0Var.U0.remove(realPosition);
                                        kw0Var.T0.remove(realPosition);
                                        kw0Var.W0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        kw0Var.Y0.remove(realPosition);
                                        kw0Var.Z0.remove(realPosition);
                                        kw0Var.a1.remove(realPosition);
                                        kw0Var.d1.delete(realPosition);
                                        kw0Var.b1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            kw0Var.P0 = (org.telegram.messenger.ic) arrayList2.get(0);
                                            kw0Var.Q0 = null;
                                            kw0Var.R0 = null;
                                        }
                                        kw0Var.D0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        dpVar.d(photo2.id);
                                        z10 = true;
                                    }
                                }
                                if (z10 || profileActivity102.n0.getRealCount() <= 0) {
                                    profileActivity102.n0.setVisibility(8);
                                    profileActivity102.e0.setForegroundAlpha(1.0f);
                                    profileActivity102.X.setVisibility(0);
                                    profileActivity102.H0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.i4(), org.telegram.ui.Components.gr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.q0.b();
                                if (profileActivity102.h6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.h6, true);
                                }
                                profileActivity102.n2 = (org.telegram.messenger.i0.Q1() || profileActivity102.m2 || !profileActivity102.e0.getImageReceiver().L() || org.telegram.messenger.i0.C1()) ? false : true;
                                profileActivity102.H2 = null;
                                profileActivity102.I2 = null;
                                kw0 kw0Var2 = profileActivity102.n0;
                                kw0Var2.H0 = true;
                                kw0Var2.K0 = profileActivity102.J2;
                                kw0Var2.q1 = null;
                                kw0Var2.r1 = null;
                                kw0Var2.setCreateThumbFromParent(false);
                                profileActivity102.H5(true);
                                profileActivity102.i5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.vp.D8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            this.b.showDialog(alertDialog$Builder3.a);
            return;
        }
        if (i10 == 44) {
            i17 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
            long j15 = this.b.d1;
            TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i17).a2(j15);
            if (a2 == null || (botInfo = a2.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                while (true) {
                    if (i21 >= size) {
                        str2 = org.telegram.messenger.cd.L0(2131753098, null);
                        break;
                    }
                    TLRPC.BotCommand botCommand = arrayList.get(i21);
                    i21++;
                    if ("privacy".equals(botCommand.command)) {
                        break;
                    }
                }
            }
            if (str2 != null) {
                gf.f.r(org.telegram.messenger.w0.b, str2);
                return;
            }
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            if (!(T instanceof un) || ((un) T).a() != j15) {
                T.presentFragment(un.ha(j15));
            }
            org.telegram.messenger.i0.h3(new org.telegram.ui.web.l(i17, j15, i20), 150L);
            return;
        }
        if (i10 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.b) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            kw0 kw0Var = this.b.n0;
            org.telegram.messenger.ic D = kw0Var.D(kw0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.p == 2;
            i16 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
            org.telegram.messenger.b8.G(i16);
            File K = org.telegram.messenger.b8.K(D.f, z10 ? "mp4" : null, true, true);
            if (z10 && !K.exists()) {
                K = new File(org.telegram.messenger.b8.z(0), org.telegram.messenger.b8.r("mp4", D.f));
            }
            if (K.exists()) {
                MediaController.d0(K.toString(), this.b.getParentActivity(), 0, null, null, new nc(i22, this, z10));
                return;
            }
            return;
        }
        if (i10 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == 40) {
            ProfileActivity profileActivity15 = this.b;
            tn0 tn0Var = new tn0();
            tn0Var.H = this.b;
            profileActivity15.presentFragment(tn0Var);
            return;
        }
        if (i10 == 42) {
            org.telegram.messenger.i0.g(this.b.getMessagesController().U2 + "/" + org.telegram.messenger.h20.n(this.b.getMessagesController().Z1(Long.valueOf(this.b.d1))));
            return;
        }
        if (i10 == 43) {
            this.b.presentFragment(new oa(null));
            return;
        }
        if (i10 == 31) {
            this.b.presentFragment(new jf0(null));
            return;
        }
        if (i10 != 33) {
            if (i10 == 34) {
                i11 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
                if (org.telegram.messenger.vp.r1(i11).u2()) {
                    i14 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
                    b.b(i14);
                    return;
                }
                int realPosition = this.b.n0.getRealPosition();
                org.telegram.messenger.ic D2 = this.b.n0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i12 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
                org.telegram.messenger.b8.G(i12);
                Drawable[] drawableArr = PhotoViewer.U8;
                File K2 = org.telegram.messenger.b8.K(D2.f, PhotoViewer.s1(D2), true, true);
                boolean z11 = D2.p == 2;
                if (z11) {
                    org.telegram.messenger.ic G = this.b.n0.G(realPosition);
                    i13 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
                    org.telegram.messenger.b8.G(i13);
                    str = org.telegram.messenger.b8.K(G != null ? G.f : null, PhotoViewer.s1(G), true, true).getAbsolutePath();
                }
                this.b.q0.p(K2.getAbsolutePath(), str, z11);
                return;
            }
            if (i10 != 35) {
                if (i10 == 36) {
                    this.b.H4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.z0);
            kw0 kw0Var2 = this.b.n0;
            org.telegram.messenger.ic D3 = kw0Var2.D(kw0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.p == 2) {
                alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131754083, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131754085, null);
            } else {
                alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131754094, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131754096, null);
            }
            alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) { // from class: org.telegram.ui.bx0
                public final /* synthetic */ dx0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.u1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.x1 x1Var22, int i272) {
                    org.telegram.ui.ActionBar.z4 z4Var;
                    org.telegram.ui.ActionBar.z4 z4Var2;
                    org.telegram.ui.ActionBar.z4 z4Var3;
                    org.telegram.ui.ActionBar.z4 z4Var4;
                    int i282;
                    int i292;
                    boolean z102;
                    org.telegram.messenger.dp dpVar;
                    TLRPC.Photo photo;
                    int i30 = i20;
                    dx0 dx0Var = this.b;
                    switch (i30) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ProfileActivity profileActivity82 = dx0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.f1));
                            profileActivity82.getMessagesController().r7.d(arrayList2, profileActivity82.e1);
                            profileActivity82.I1 = 0;
                            z4Var = ((org.telegram.ui.ActionBar.k2) profileActivity82).parentLayout;
                            if (z4Var != null) {
                                z4Var2 = ((org.telegram.ui.ActionBar.k2) profileActivity82).parentLayout;
                                if (z4Var2.getFragmentStack() != null) {
                                    for (int i31 = 0; i31 < z4Var3.getFragmentStack().size(); i31++) {
                                        z4Var4 = ((org.telegram.ui.ActionBar.k2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) z4Var4.getFragmentStack().get(i31);
                                        if ((k2Var instanceof un) && ((un) k2Var).b() == profileActivity82.f1) {
                                            k2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(parentActivity2), profileActivity82.z0).Q(R.raw.ic_delete, 36, org.telegram.messenger.cd.J0(1, "TopicsDeleted")).j();
                            }
                            x1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = dx0Var.b;
                            i282 = ((org.telegram.ui.ActionBar.k2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.vp.r1(i282).u2()) {
                                i292 = ((org.telegram.ui.ActionBar.k2) profileActivity92).currentAccount;
                                b.b(i292);
                                break;
                            } else {
                                profileActivity92.i1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().Z1(Long.valueOf(profileActivity92.d1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = dx0Var.b;
                            int realPosition2 = profileActivity102.n0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.n0.F(realPosition2);
                            TLRPC.UserFull userFull = profileActivity102.u2;
                            if (profileActivity102.H2 == null || realPosition2 != 0) {
                                if (profileActivity102.p5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.H5(false);
                                }
                                if (profileActivity102.n0.getRealCount() == 1) {
                                    ProfileActivity.F3(profileActivity102, true);
                                }
                                if (F == null || profileActivity102.n0.getRealPosition() == 0) {
                                    TLRPC.Photo F2 = profileActivity102.n0.F(1);
                                    if (F2 != null) {
                                        profileActivity102.getUserConfig().f().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F2.sizes, 90, false, null, false);
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F2.sizes, 1000, false, null, false);
                                        if (w9 != null && w10 != null) {
                                            profileActivity102.getUserConfig().f().photo.photo_small = w9.location;
                                            profileActivity102.getUserConfig().f().photo.photo_big = w10.location;
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
                                    org.telegram.messenger.hs messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.aq(4, profileActivity102.d1, F.id, messagesStorage));
                                }
                                kw0 kw0Var3 = profileActivity102.n0;
                                ArrayList arrayList22 = kw0Var3.X0;
                                ArrayList arrayList3 = kw0Var3.V0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (dpVar = kw0Var3.S0) == null) {
                                        arrayList3.remove(realPosition2);
                                        kw0Var3.U0.remove(realPosition2);
                                        kw0Var3.T0.remove(realPosition2);
                                        kw0Var3.W0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        kw0Var3.Y0.remove(realPosition2);
                                        kw0Var3.Z0.remove(realPosition2);
                                        kw0Var3.a1.remove(realPosition2);
                                        kw0Var3.d1.delete(realPosition2);
                                        kw0Var3.b1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            kw0Var3.P0 = (org.telegram.messenger.ic) arrayList22.get(0);
                                            kw0Var3.Q0 = null;
                                            kw0Var3.R0 = null;
                                        }
                                        kw0Var3.D0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        dpVar.d(photo2.id);
                                        z102 = true;
                                    }
                                }
                                if (z102 || profileActivity102.n0.getRealCount() <= 0) {
                                    profileActivity102.n0.setVisibility(8);
                                    profileActivity102.e0.setForegroundAlpha(1.0f);
                                    profileActivity102.X.setVisibility(0);
                                    profileActivity102.H0 = true;
                                    View m10 = profileActivity102.c.m(0);
                                    if (m10 != null) {
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.i4(), org.telegram.ui.Components.gr.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.q0.b();
                                if (profileActivity102.h6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.h6, true);
                                }
                                profileActivity102.n2 = (org.telegram.messenger.i0.Q1() || profileActivity102.m2 || !profileActivity102.e0.getImageReceiver().L() || org.telegram.messenger.i0.C1()) ? false : true;
                                profileActivity102.H2 = null;
                                profileActivity102.I2 = null;
                                kw0 kw0Var22 = profileActivity102.n0;
                                kw0Var22.H0 = true;
                                kw0Var22.K0 = profileActivity102.J2;
                                kw0Var22.q1 = null;
                                kw0Var22.r1 = null;
                                kw0Var22.setCreateThumbFromParent(false);
                                profileActivity102.H5(true);
                                profileActivity102.i5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.vp.D8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder4.a;
            this.b.showDialog(x1Var3);
            TextView textView4 = (TextView) x1Var3.d(-1);
            if (textView4 != null) {
                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.q7, this.b.z0);
                return;
            }
            return;
        }
        int realPosition2 = this.b.n0.getRealPosition();
        TLRPC.Photo F = this.b.n0.F(realPosition2);
        if (F == null) {
            return;
        }
        kw0 kw0Var3 = this.b.n0;
        ArrayList arrayList2 = kw0Var3.b1;
        ArrayList arrayList3 = kw0Var3.a1;
        ArrayList arrayList4 = kw0Var3.Z0;
        ArrayList arrayList5 = kw0Var3.Y0;
        ArrayList arrayList6 = kw0Var3.W0;
        ArrayList arrayList7 = kw0Var3.U0;
        ArrayList arrayList8 = kw0Var3.X0;
        ArrayList arrayList9 = kw0Var3.V0;
        org.telegram.messenger.dp dpVar = kw0Var3.S0;
        if (dpVar != null) {
            ArrayList arrayList10 = dpVar.b;
            if (realPosition2 >= 0 && realPosition2 < arrayList10.size()) {
                arrayList10.add(0, (TLRPC.Photo) arrayList10.remove(realPosition2));
                dpVar.f();
                dpVar.h.getNotificationCenter().k(org.telegram.messenger.zs.e3, dpVar);
            }
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            kw0Var3.c1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList11 = kw0Var3.T0;
            arrayList11.add(0, (String) arrayList11.remove(realPosition2));
            org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, icVar);
            org.telegram.messenger.ic icVar2 = (org.telegram.messenger.ic) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, icVar2);
            org.telegram.messenger.ic icVar3 = (org.telegram.messenger.ic) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, icVar3);
            org.telegram.ui.Components.g61 g61Var = (org.telegram.ui.Components.g61) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, g61Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f10 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f10);
            kw0Var3.P0 = (org.telegram.messenger.ic) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        org.telegram.messenger.d20 userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new vp0(this, userConfig, F, 6));
        ProfileActivity profileActivity16 = this.b;
        profileActivity16.L.m(profileActivity16.d1, F.video_sizes.isEmpty() ? null : 1, 22);
        TLRPC.User Z14 = this.b.getMessagesController().Z1(Long.valueOf(userConfig.n));
        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F.sizes, 800, false, null, false);
        if (Z14 != null) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F.sizes, 90, false, null, false);
            TLRPC.UserProfilePhoto userProfilePhoto = Z14.photo;
            userProfilePhoto.photo_id = F.id;
            userProfilePhoto.photo_small = w10.location;
            userProfilePhoto.photo_big = w9.location;
            userConfig.w(Z14);
            userConfig.v(true);
            i15 = ((org.telegram.ui.ActionBar.k2) this.b).currentAccount;
            org.telegram.messenger.zs.f(i15).k(org.telegram.messenger.zs.j0, new Object[0]);
            this.b.H5(true);
        }
        kw0 kw0Var4 = this.b.n0;
        kw0Var4.D0.g();
        kw0Var4.L();
    }
}
