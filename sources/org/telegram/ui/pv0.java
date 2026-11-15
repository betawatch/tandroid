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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pv0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProfileActivity b;

    public pv0(ProfileActivity profileActivity, Context context) {
        this.b = profileActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        long j3;
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
        org.telegram.ui.Components.vq0 vq0Var;
        if (this.b.getParentActivity() == null) {
            return;
        }
        if (i7 == -1) {
            ProfileActivity profileActivity = this.b;
            uv0 uv0Var = profileActivity.O;
            if (uv0Var == null || (vq0Var = uv0Var.L0) == null || !vq0Var.o0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.n5();
                return;
            }
        }
        final int i19 = 2;
        int i20 = 0;
        if (i7 == 2) {
            this.b.D4(false);
            return;
        }
        if (i7 == 1) {
            TLRPC.User a22 = this.b.getMessagesController().a2(Long.valueOf(this.b.e1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", a22.id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.b;
            pr prVar = new pr(bundle, profileActivity2.A0);
            prVar.P = new ut0(profileActivity2, a22);
            profileActivity2.presentFragment(prVar);
            return;
        }
        String str = null;
        if (i7 == 3) {
            Bundle j10 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
            j10.putString("selectAlertString", org.telegram.messenger.hd.M0(2131745630, null));
            j10.putString("selectAlertStringGroup", org.telegram.messenger.hd.M0(2131745631, null));
            yw ywVar = new yw(j10);
            ProfileActivity profileActivity3 = this.b;
            ywVar.E2 = profileActivity3;
            profileActivity3.presentFragment(ywVar);
            return;
        }
        if (i7 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.b.e1);
            ProfileActivity profileActivity4 = this.b;
            profileActivity4.presentFragment(new pr(bundle2, profileActivity4.A0));
            return;
        }
        int i21 = 15;
        if (i7 == 5) {
            TLRPC.User a23 = this.b.getMessagesController().a2(Long.valueOf(this.b.e1));
            if (a23 == null || this.b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131751552, null);
            alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131754103, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new xi0(i21, this, a23));
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            this.b.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, this.b.A0);
                return;
            }
            return;
        }
        if (i7 == 7) {
            this.b.y4(false);
            return;
        }
        if (i7 == 45) {
            this.b.y4(true);
            return;
        }
        int i22 = 8;
        if (i7 == 46) {
            if (!this.b.getUserConfig().q()) {
                ProfileActivity profileActivity5 = this.b;
                Activity parentActivity = profileActivity5.getParentActivity();
                i18 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
                new ug.x0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                return;
            }
            Context context = this.a;
            org.telegram.ui.ActionBar.e6 e6Var = this.b.A0;
            pu0 pu0Var = new pu0(this, i19);
            Pattern pattern = org.telegram.ui.Components.t4.a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, null, false);
            org.telegram.ui.ActionBar.f2 f2Var = k10.y0;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
            linearLayout.addView(fh0Var, c8.ja.t(org.telegram.messenger.ns.v1, org.telegram.messenger.ns.v1, 17, 0, 21, 0, 11));
            fh0Var.f(R.raw.raised_hand, org.telegram.messenger.ns.v1, org.telegram.messenger.ns.v1, null);
            fh0Var.setAutoRepeat(false);
            fh0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(org.telegram.messenger.g0.o());
            textView2.setGravity(17);
            textView2.setText(org.telegram.messenger.hd.M0(2131751422, null));
            textView2.setTextSize(1, 20.0f);
            int i23 = org.telegram.ui.ActionBar.j6.G6;
            org.telegram.ui.ActionBar.q6.U(textView2, i23, e6Var);
            linearLayout.addView(textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 14));
            fs0 fs0Var = new fs0(context, e6Var);
            fs0Var.a.l(org.telegram.messenger.hd.M0(2131751421, null), false);
            fs0Var.b.setText(org.telegram.messenger.hd.M0(2131751418, null));
            fs0Var.d.setVisibility(8);
            fs0Var.c.setImageResource(R.drawable.menu_photo_off_24);
            ImageView imageView = fs0Var.c;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
            org.telegram.ui.ActionBar.q6.s(imageView, i23, e6Var, mode);
            linearLayout.addView(fs0Var, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            fs0 fs0Var2 = new fs0(context, e6Var);
            fs0Var2.a.l(org.telegram.messenger.hd.M0(2131751420, null), false);
            fs0Var2.b.setText(org.telegram.messenger.hd.M0(2131751417, null));
            fs0Var2.d.setVisibility(8);
            fs0Var2.c.setImageResource(R.drawable.menu_share_off_24);
            org.telegram.ui.ActionBar.q6.s(fs0Var2.c, i23, e6Var, mode);
            linearLayout.addView(fs0Var2, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            fs0 fs0Var3 = new fs0(context, e6Var);
            fs0Var3.a.l(org.telegram.messenger.hd.M0(2131751419, null), false);
            fs0Var3.b.setText(org.telegram.messenger.hd.M0(2131751416, null));
            fs0Var3.d.setVisibility(8);
            fs0Var3.c.setImageResource(R.drawable.menu_download_off_24);
            org.telegram.ui.ActionBar.q6.s(fs0Var3.c, i23, e6Var, mode);
            linearLayout.addView(fs0Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            hi.d dVar = new hi.d(context, e6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.Components.n2(1, zArr, f2Var));
            dVar.f();
            dVar.i(org.telegram.messenger.hd.M0(2131751423, null), false, true);
            linearLayout.addView(dVar, c8.ja.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            k10.O = linearLayout;
            k10.show();
            k10.n(new zg(21, zArr, pu0Var));
            return;
        }
        if (i7 == 47) {
            ProfileActivity profileActivity6 = this.b;
            profileActivity6.getMessagesController().e5(profileActivity6.e1, 0, false, new hi.j9(i19, profileActivity6, r8));
            return;
        }
        int i24 = 10;
        if (i7 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.getParentActivity());
            alertDialog$Builder2.a.S = org.telegram.messenger.hd.K0(1, "DeleteTopics");
            i17 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
            org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(i17).r7;
            ProfileActivity profileActivity7 = this.b;
            TLRPC.TL_forumTopic f10 = h00Var.f(profileActivity7.f1, profileActivity7.g1);
            final int i25 = 0;
            alertDialog$Builder2.a.U = org.telegram.messenger.hd.a0("DeleteSelectedTopic", null, 2131751498, f10 == null ? "topic" : f10.title);
            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.nv0
                public final /* synthetic */ pv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.q1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i26) {
                    org.telegram.ui.ActionBar.o4 o4Var;
                    org.telegram.ui.ActionBar.o4 o4Var2;
                    org.telegram.ui.ActionBar.o4 o4Var3;
                    org.telegram.ui.ActionBar.o4 o4Var4;
                    int i27;
                    int i28;
                    boolean z10;
                    org.telegram.messenger.vo voVar;
                    TLRPC.Photo photo;
                    int i29 = i25;
                    pv0 pv0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity8 = pv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.g1));
                            profileActivity8.getMessagesController().r7.d(arrayList, profileActivity8.f1);
                            profileActivity8.J1 = 0;
                            o4Var = ((org.telegram.ui.ActionBar.e2) profileActivity8).parentLayout;
                            if (o4Var != null) {
                                o4Var2 = ((org.telegram.ui.ActionBar.e2) profileActivity8).parentLayout;
                                if (o4Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < o4Var3.getFragmentStack().size(); i30++) {
                                        o4Var4 = ((org.telegram.ui.ActionBar.e2) profileActivity8).parentLayout;
                                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) o4Var4.getFragmentStack().get(i30);
                                        if ((e2Var instanceof an) && ((an) e2Var).b() == profileActivity8.g1) {
                                            e2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity2 = profileActivity8.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(parentActivity2), profileActivity8.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.K0(1, "TopicsDeleted")).j();
                            }
                            t1Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = pv0Var.b;
                            i27 = ((org.telegram.ui.ActionBar.e2) profileActivity9).currentAccount;
                            if (org.telegram.messenger.np.s1(i27).v2()) {
                                i28 = ((org.telegram.ui.ActionBar.e2) profileActivity9).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity9.j1 = true;
                                profileActivity9.getSecretChatHelper().A(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().a2(Long.valueOf(profileActivity9.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity10 = pv0Var.b;
                            int realPosition = profileActivity10.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity10.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.w2;
                            if (profileActivity10.J2 == null || realPosition != 0) {
                                if (profileActivity10.t5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().j2(userFull, true);
                                    profileActivity10.L5(false);
                                }
                                if (profileActivity10.o0.getRealCount() == 1) {
                                    ProfileActivity.F3(profileActivity10, true);
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
                                    org.telegram.messenger.vr messagesStorage = profileActivity10.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.sp(4, profileActivity10.e1, F.id, messagesStorage));
                                }
                                yu0 yu0Var = profileActivity10.o0;
                                ArrayList arrayList2 = yu0Var.Y0;
                                ArrayList arrayList3 = yu0Var.W0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (voVar = yu0Var.T0) == null) {
                                        arrayList3.remove(realPosition);
                                        yu0Var.V0.remove(realPosition);
                                        yu0Var.U0.remove(realPosition);
                                        yu0Var.X0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        yu0Var.Z0.remove(realPosition);
                                        yu0Var.a1.remove(realPosition);
                                        yu0Var.b1.remove(realPosition);
                                        yu0Var.e1.delete(realPosition);
                                        yu0Var.c1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            yu0Var.Q0 = (org.telegram.messenger.gc) arrayList2.get(0);
                                            yu0Var.R0 = null;
                                            yu0Var.S0 = null;
                                        }
                                        yu0Var.E0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        voVar.e(photo2.id);
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
                                        profileActivity10.a.w0(0, m10.getTop() - profileActivity10.i4(), org.telegram.ui.Components.er.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity10.r0.b();
                                if (profileActivity10.n6 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.n6, true);
                                }
                                profileActivity10.p2 = (org.telegram.messenger.g0.Q1() || profileActivity10.o2 || !profileActivity10.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity10.J2 = null;
                                profileActivity10.K2 = null;
                                yu0 yu0Var2 = profileActivity10.o0;
                                yu0Var2.I0 = true;
                                yu0Var2.L0 = profileActivity10.L2;
                                yu0Var2.r1 = null;
                                yu0Var2.s1 = null;
                                yu0Var2.setCreateThumbFromParent(false);
                                profileActivity10.L5(true);
                                profileActivity10.l5(false, true);
                                profileActivity10.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.np.D8));
                                profileActivity10.getNotificationCenter().k(46, new Object[0]);
                                profileActivity10.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(i24));
            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
            t1Var2.show();
            TextView textView3 = (TextView) t1Var2.d(-1);
            if (textView3 != null) {
                org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.q7, null);
                return;
            }
            return;
        }
        if (i7 == 24) {
            ProfileActivity profileActivity8 = this.b;
            my0.K0(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i7 == 12) {
            ProfileActivity profileActivity9 = this.b;
            if (profileActivity9.q1) {
                profileActivity9.presentFragment(s81.f0(profileActivity9.f1, profileActivity9.g1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.b;
            long j11 = profileActivity10.f1;
            if (j11 != 0) {
                bundle3.putLong("chat_id", j11);
            } else if (profileActivity10.s2) {
                bundle3.putLong("user_id", profileActivity10.e1);
            }
            qn qnVar = new qn(bundle3);
            ProfileActivity profileActivity11 = this.b;
            TLRPC.ChatFull chatFull = profileActivity11.v2;
            if (chatFull != null) {
                qnVar.q0(chatFull);
            } else {
                qnVar.r0(profileActivity11.w2);
            }
            this.b.presentFragment(qnVar);
            return;
        }
        if (i7 == 41) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        int i26 = 19;
        if (i7 == 9) {
            TLRPC.User a24 = this.b.getMessagesController().a2(Long.valueOf(this.b.e1));
            if (a24 == null) {
                return;
            }
            Bundle j12 = org.telegram.ui.Cells.y0.j(2, "onlySelect", "dialogsType", true);
            j12.putBoolean("resetDelegate", false);
            j12.putBoolean("closeFragment", false);
            yw ywVar2 = new yw(j12);
            ywVar2.E2 = new a7(this, a24, ywVar2, i26);
            this.b.presentFragment(ywVar2);
            return;
        }
        if (i7 == 10) {
            this.b.I4();
            return;
        }
        if (i7 == 14) {
            try {
                ProfileActivity profileActivity12 = this.b;
                if (profileActivity12.E2 != null) {
                    j3 = org.telegram.messenger.m5.F(r2.id);
                } else {
                    j3 = profileActivity12.e1;
                    if (j3 == 0) {
                        long j13 = profileActivity12.f1;
                        if (j13 == 0) {
                            return;
                        } else {
                            j3 = -j13;
                        }
                    }
                }
                org.telegram.messenger.si mediaDataController = this.b.getMediaDataController();
                Pattern pattern2 = org.telegram.messenger.si.S1;
                mediaDataController.y0(j3, 0, null);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        if (i7 == 15 || i7 == 16) {
            this.b.E4(i7 == 16);
            return;
        }
        if (i7 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.b.f1);
            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, 2);
            bundle4.putBoolean("open_search", true);
            qq qqVar = new qq(bundle4);
            qqVar.C0(this.b.v2);
            this.b.presentFragment(qqVar);
            return;
        }
        if (i7 == 18) {
            this.b.L4();
            return;
        }
        if (i7 == 19) {
            this.b.presentFragment(z41.g0(this.b.getMessagesController().M0(Long.valueOf(this.b.f1)), false));
            return;
        }
        if (i7 == 22) {
            this.b.O4();
            return;
        }
        if (i7 == 38) {
            this.b.F4();
            return;
        }
        if (i7 == 48) {
            ProfileActivity profileActivity13 = this.b;
            org.telegram.ui.Wallet.p9 p9Var = new org.telegram.ui.Wallet.p9(profileActivity13.getMessagesController().a2(Long.valueOf(this.b.e1)));
            p9Var.g0 = true;
            profileActivity13.presentFragment(p9Var);
            return;
        }
        if (i7 == 39) {
            Bundle f11 = r.b.f(2, TeXSymbolParser.TYPE_ATTR);
            f11.putLong("dialog_id", -this.b.f1);
            org.telegram.ui.Components.x80 x80Var = new org.telegram.ui.Components.x80(f11, null);
            ProfileActivity profileActivity14 = this.b;
            x80Var.c = profileActivity14.v2;
            profileActivity14.presentFragment(x80Var);
            return;
        }
        if (i7 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            alertDialog$Builder3.a.S = org.telegram.messenger.hd.M0(2131754078, null);
            alertDialog$Builder3.a.U = org.telegram.messenger.hd.M0(2131754079, null);
            final int i27 = 1;
            alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131744915, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.nv0
                public final /* synthetic */ pv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.q1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i262) {
                    org.telegram.ui.ActionBar.o4 o4Var;
                    org.telegram.ui.ActionBar.o4 o4Var2;
                    org.telegram.ui.ActionBar.o4 o4Var3;
                    org.telegram.ui.ActionBar.o4 o4Var4;
                    int i272;
                    int i28;
                    boolean z10;
                    org.telegram.messenger.vo voVar;
                    TLRPC.Photo photo;
                    int i29 = i27;
                    pv0 pv0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            ProfileActivity profileActivity82 = pv0Var.b;
                            arrayList.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().r7.d(arrayList, profileActivity82.f1);
                            profileActivity82.J1 = 0;
                            o4Var = ((org.telegram.ui.ActionBar.e2) profileActivity82).parentLayout;
                            if (o4Var != null) {
                                o4Var2 = ((org.telegram.ui.ActionBar.e2) profileActivity82).parentLayout;
                                if (o4Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < o4Var3.getFragmentStack().size(); i30++) {
                                        o4Var4 = ((org.telegram.ui.ActionBar.e2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) o4Var4.getFragmentStack().get(i30);
                                        if ((e2Var instanceof an) && ((an) e2Var).b() == profileActivity82.g1) {
                                            e2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.K0(1, "TopicsDeleted")).j();
                            }
                            t1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = pv0Var.b;
                            i272 = ((org.telegram.ui.ActionBar.e2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.np.s1(i272).v2()) {
                                i28 = ((org.telegram.ui.ActionBar.e2) profileActivity92).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().a2(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = pv0Var.b;
                            int realPosition = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition != 0) {
                                if (profileActivity102.t5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.L5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.F3(profileActivity102, true);
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
                                    org.telegram.messenger.vr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.sp(4, profileActivity102.e1, F.id, messagesStorage));
                                }
                                yu0 yu0Var = profileActivity102.o0;
                                ArrayList arrayList2 = yu0Var.Y0;
                                ArrayList arrayList3 = yu0Var.W0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    z10 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (voVar = yu0Var.T0) == null) {
                                        arrayList3.remove(realPosition);
                                        yu0Var.V0.remove(realPosition);
                                        yu0Var.U0.remove(realPosition);
                                        yu0Var.X0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        yu0Var.Z0.remove(realPosition);
                                        yu0Var.a1.remove(realPosition);
                                        yu0Var.b1.remove(realPosition);
                                        yu0Var.e1.delete(realPosition);
                                        yu0Var.c1.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            yu0Var.Q0 = (org.telegram.messenger.gc) arrayList2.get(0);
                                            yu0Var.R0 = null;
                                            yu0Var.S0 = null;
                                        }
                                        yu0Var.E0.g();
                                        z10 = arrayList3.isEmpty();
                                    } else {
                                        voVar.e(photo2.id);
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
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.i4(), org.telegram.ui.Components.er.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.n6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.n6, true);
                                }
                                profileActivity102.p2 = (org.telegram.messenger.g0.Q1() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.J2 = null;
                                profileActivity102.K2 = null;
                                yu0 yu0Var2 = profileActivity102.o0;
                                yu0Var2.I0 = true;
                                yu0Var2.L0 = profileActivity102.L2;
                                yu0Var2.r1 = null;
                                yu0Var2.s1 = null;
                                yu0Var2.setCreateThumbFromParent(false);
                                profileActivity102.L5(true);
                                profileActivity102.l5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.np.D8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            this.b.showDialog(alertDialog$Builder3.a);
            return;
        }
        if (i7 == 44) {
            i16 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
            long j14 = this.b.e1;
            TLRPC.UserFull b22 = org.telegram.messenger.np.s1(i16).b2(j14);
            if (b22 == null || (botInfo = b22.bot_info) == null) {
                return;
            }
            String str2 = botInfo.privacy_policy_url;
            if (str2 == null && str2 == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                while (true) {
                    if (i20 >= size) {
                        str2 = org.telegram.messenger.hd.M0(2131753098, null);
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
                vf.c.t(org.telegram.messenger.t0.b, str2);
                return;
            }
            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
            if (T == null) {
                return;
            }
            if (!(T instanceof an) || ((an) T).a() != j14) {
                T.presentFragment(an.ua(j14));
            }
            org.telegram.messenger.g0.i3(new di.j9(i16, j14, i19), 150L);
            return;
        }
        if (i7 == 21) {
            if (this.b.getParentActivity() == null) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && this.b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            yu0 yu0Var = this.b.o0;
            org.telegram.messenger.gc D = yu0Var.D(yu0Var.getRealPosition());
            if (D == null) {
                return;
            }
            boolean z10 = D.p == 2;
            i15 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
            org.telegram.messenger.w7.G(i15);
            File J = org.telegram.messenger.w7.J(D.f, z10 ? "mp4" : null, true, true);
            if (z10 && !J.exists()) {
                J = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f));
            }
            if (J.exists()) {
                MediaController.d0(J.toString(), this.b.getParentActivity(), 0, null, null, new di.t7(i22, this, z10));
                return;
            }
            return;
        }
        if (i7 == 30) {
            this.b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i7 == 40) {
            ProfileActivity profileActivity15 = this.b;
            im0 im0Var = new im0();
            im0Var.I = this.b;
            profileActivity15.presentFragment(im0Var);
            return;
        }
        if (i7 == 42) {
            if (org.telegram.messenger.g0.g(this.b.getMessagesController().V2 + "/" + org.telegram.messenger.q10.n(this.b.getMessagesController().a2(Long.valueOf(this.b.e1))))) {
                org.telegram.ui.Components.cc.a0(this.b).k(false).j();
                return;
            }
            return;
        }
        if (i7 == 43) {
            this.b.presentFragment(new la(null));
            return;
        }
        if (i7 == 31) {
            this.b.presentFragment(new ee0(null));
            return;
        }
        if (i7 != 33) {
            if (i7 == 34) {
                i10 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
                if (org.telegram.messenger.np.s1(i10).v2()) {
                    i13 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
                    b.b(i13);
                    return;
                }
                int realPosition = this.b.o0.getRealPosition();
                org.telegram.messenger.gc D2 = this.b.o0.D(realPosition);
                if (D2 == null) {
                    return;
                }
                i11 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
                org.telegram.messenger.w7.G(i11);
                Drawable[] drawableArr = PhotoViewer.Z8;
                File J2 = org.telegram.messenger.w7.J(D2.f, PhotoViewer.m1(D2), true, true);
                boolean z11 = D2.p == 2;
                if (z11) {
                    org.telegram.messenger.gc G = this.b.o0.G(realPosition);
                    i12 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
                    org.telegram.messenger.w7.G(i12);
                    str = org.telegram.messenger.w7.J(G != null ? G.f : null, PhotoViewer.m1(G), true, true).getAbsolutePath();
                }
                this.b.r0.p(J2.getAbsolutePath(), str, z11);
                return;
            }
            if (i7 != 35) {
                if (i7 == 36) {
                    this.b.K4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.b.getParentActivity(), this.b.A0);
            yu0 yu0Var2 = this.b.o0;
            org.telegram.messenger.gc D3 = yu0Var2.D(yu0Var2.getRealPosition());
            if (D3 == null) {
                return;
            }
            if (D3.p == 2) {
                alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131754083, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131754085, null);
            } else {
                alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131754094, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131754096, null);
            }
            alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) { // from class: org.telegram.ui.nv0
                public final /* synthetic */ pv0 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Incorrect condition in loop: B:85:0x0275 */
                @Override // org.telegram.ui.ActionBar.q1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void h(org.telegram.ui.ActionBar.t1 t1Var22, int i262) {
                    org.telegram.ui.ActionBar.o4 o4Var;
                    org.telegram.ui.ActionBar.o4 o4Var2;
                    org.telegram.ui.ActionBar.o4 o4Var3;
                    org.telegram.ui.ActionBar.o4 o4Var4;
                    int i272;
                    int i28;
                    boolean z102;
                    org.telegram.messenger.vo voVar;
                    TLRPC.Photo photo;
                    int i29 = i19;
                    pv0 pv0Var = this.b;
                    switch (i29) {
                        case 0:
                            ArrayList arrayList2 = new ArrayList();
                            ProfileActivity profileActivity82 = pv0Var.b;
                            arrayList2.add(Integer.valueOf((int) profileActivity82.g1));
                            profileActivity82.getMessagesController().r7.d(arrayList2, profileActivity82.f1);
                            profileActivity82.J1 = 0;
                            o4Var = ((org.telegram.ui.ActionBar.e2) profileActivity82).parentLayout;
                            if (o4Var != null) {
                                o4Var2 = ((org.telegram.ui.ActionBar.e2) profileActivity82).parentLayout;
                                if (o4Var2.getFragmentStack() != null) {
                                    for (int i30 = 0; i30 < o4Var3.getFragmentStack().size(); i30++) {
                                        o4Var4 = ((org.telegram.ui.ActionBar.e2) profileActivity82).parentLayout;
                                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) o4Var4.getFragmentStack().get(i30);
                                        if ((e2Var instanceof an) && ((an) e2Var).b() == profileActivity82.g1) {
                                            e2Var.removeSelfFromStack();
                                        }
                                    }
                                }
                            }
                            profileActivity82.finishFragment();
                            Activity parentActivity2 = profileActivity82.getParentActivity();
                            if (parentActivity2 != null) {
                                new org.telegram.ui.Components.cc(org.telegram.ui.Components.ta.a(parentActivity2), profileActivity82.A0).Q(R.raw.ic_delete, 36, org.telegram.messenger.hd.K0(1, "TopicsDeleted")).j();
                            }
                            t1Var22.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity92 = pv0Var.b;
                            i272 = ((org.telegram.ui.ActionBar.e2) profileActivity92).currentAccount;
                            if (org.telegram.messenger.np.s1(i272).v2()) {
                                i28 = ((org.telegram.ui.ActionBar.e2) profileActivity92).currentAccount;
                                b.b(i28);
                                break;
                            } else {
                                profileActivity92.j1 = true;
                                profileActivity92.getSecretChatHelper().A(profileActivity92.getParentActivity(), profileActivity92.getMessagesController().a2(Long.valueOf(profileActivity92.e1)));
                                break;
                            }
                        default:
                            ProfileActivity profileActivity102 = pv0Var.b;
                            int realPosition2 = profileActivity102.o0.getRealPosition();
                            TLRPC.Photo F = profileActivity102.o0.F(realPosition2);
                            TLRPC.UserFull userFull = profileActivity102.w2;
                            if (profileActivity102.J2 == null || realPosition2 != 0) {
                                if (profileActivity102.t5 && F != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.id == F.id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity102.getMessagesStorage().j2(userFull, true);
                                    profileActivity102.L5(false);
                                }
                                if (profileActivity102.o0.getRealCount() == 1) {
                                    ProfileActivity.F3(profileActivity102, true);
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
                                    org.telegram.messenger.vr messagesStorage = profileActivity102.getMessagesStorage();
                                    messagesStorage.a.c(new org.telegram.messenger.sp(4, profileActivity102.e1, F.id, messagesStorage));
                                }
                                yu0 yu0Var3 = profileActivity102.o0;
                                ArrayList arrayList22 = yu0Var3.Y0;
                                ArrayList arrayList3 = yu0Var3.W0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList3.size()) {
                                    z102 = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition2);
                                    if (photo2 == null || (voVar = yu0Var3.T0) == null) {
                                        arrayList3.remove(realPosition2);
                                        yu0Var3.V0.remove(realPosition2);
                                        yu0Var3.U0.remove(realPosition2);
                                        yu0Var3.X0.remove(realPosition2);
                                        arrayList22.remove(realPosition2);
                                        yu0Var3.Z0.remove(realPosition2);
                                        yu0Var3.a1.remove(realPosition2);
                                        yu0Var3.b1.remove(realPosition2);
                                        yu0Var3.e1.delete(realPosition2);
                                        yu0Var3.c1.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList22.isEmpty()) {
                                            yu0Var3.Q0 = (org.telegram.messenger.gc) arrayList22.get(0);
                                            yu0Var3.R0 = null;
                                            yu0Var3.S0 = null;
                                        }
                                        yu0Var3.E0.g();
                                        z102 = arrayList3.isEmpty();
                                    } else {
                                        voVar.e(photo2.id);
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
                                        profileActivity102.a.w0(0, m10.getTop() - profileActivity102.i4(), org.telegram.ui.Components.er.h);
                                        break;
                                    }
                                }
                            } else {
                                profileActivity102.r0.b();
                                if (profileActivity102.n6 != 0) {
                                    profileActivity102.getConnectionsManager().cancelRequest(profileActivity102.n6, true);
                                }
                                profileActivity102.p2 = (org.telegram.messenger.g0.Q1() || profileActivity102.o2 || !profileActivity102.f0.getImageReceiver().L() || org.telegram.messenger.g0.C1()) ? false : true;
                                profileActivity102.J2 = null;
                                profileActivity102.K2 = null;
                                yu0 yu0Var22 = profileActivity102.o0;
                                yu0Var22.I0 = true;
                                yu0Var22.L0 = profileActivity102.L2;
                                yu0Var22.r1 = null;
                                yu0Var22.s1 = null;
                                yu0Var22.setCreateThumbFromParent(false);
                                profileActivity102.L5(true);
                                profileActivity102.l5(false, true);
                                profileActivity102.getNotificationCenter().k(2, Integer.valueOf(org.telegram.messenger.np.D8));
                                profileActivity102.getNotificationCenter().k(46, new Object[0]);
                                profileActivity102.getUserConfig().v(true);
                                break;
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.a;
            this.b.showDialog(t1Var3);
            TextView textView4 = (TextView) t1Var3.d(-1);
            if (textView4 != null) {
                org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.q7, this.b.A0);
                return;
            }
            return;
        }
        int realPosition2 = this.b.o0.getRealPosition();
        TLRPC.Photo F = this.b.o0.F(realPosition2);
        if (F == null) {
            return;
        }
        yu0 yu0Var3 = this.b.o0;
        ArrayList arrayList2 = yu0Var3.c1;
        ArrayList arrayList3 = yu0Var3.b1;
        ArrayList arrayList4 = yu0Var3.a1;
        ArrayList arrayList5 = yu0Var3.Z0;
        ArrayList arrayList6 = yu0Var3.X0;
        ArrayList arrayList7 = yu0Var3.V0;
        ArrayList arrayList8 = yu0Var3.Y0;
        ArrayList arrayList9 = yu0Var3.W0;
        org.telegram.messenger.vo voVar = yu0Var3.T0;
        if (voVar != null) {
            voVar.c(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            yu0Var3.d1++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str3 = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str3);
            ArrayList arrayList10 = yu0Var3.U0;
            arrayList10.add(0, (String) arrayList10.remove(realPosition2));
            org.telegram.messenger.gc gcVar = (org.telegram.messenger.gc) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, gcVar);
            org.telegram.messenger.gc gcVar2 = (org.telegram.messenger.gc) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, gcVar2);
            org.telegram.messenger.gc gcVar3 = (org.telegram.messenger.gc) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, gcVar3);
            org.telegram.ui.Components.g51 g51Var = (org.telegram.ui.Components.g51) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, g51Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f12 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f12);
            yu0Var3.Q0 = (org.telegram.messenger.gc) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
        tL_inputPhoto.id = F.id;
        tL_inputPhoto.access_hash = F.access_hash;
        tL_inputPhoto.file_reference = F.file_reference;
        org.telegram.messenger.m10 userConfig = this.b.getUserConfig();
        this.b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new jo0(this, userConfig, F, 6));
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
            i14 = ((org.telegram.ui.ActionBar.e2) this.b).currentAccount;
            org.telegram.messenger.ns.f(i14).k(org.telegram.messenger.ns.j0, new Object[0]);
            this.b.L5(true);
        }
        yu0 yu0Var4 = this.b.o0;
        yu0Var4.E0.g();
        yu0Var4.L();
    }
}
