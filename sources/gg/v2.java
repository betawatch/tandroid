package gg;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k7.b6;
import k7.d6;
import lh.h3;
import lh.t7;
import lh.t9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r20;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class v2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static n2 D0;
    public Utilities.Callback2 A0;
    public boolean B0;
    public int C0;
    public final int U;
    public final s2 V;
    public final q2 W;
    public final r2 X;
    public final p2 Y;
    public final kp Z;
    public final kg.a a0;
    public final FrameLayout b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final HashSet e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public final ArrayList h0;
    public final HashMap i0;
    public final ArrayList j0;
    public final LinkedHashMap k0;
    public String l0;
    public hg.h m0;
    public int n0;
    public final ArrayList o0;
    public boolean p0;
    public float q0;
    public o2 r0;
    public final BirthdayController.BirthdayState s0;
    public final androidx.activity.i t0;
    public int u0;
    public mq v0;
    public String w0;
    public r20 x0;
    public h3 y0;
    public final HashSet z0;

    public v2(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, f6 f6Var) {
        super(context, null, true, false, false, 1, f6Var);
        this.c0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.d0 = arrayList;
        HashSet hashSet = new HashSet();
        this.e0 = hashSet;
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.h0 = new ArrayList();
        this.i0 = new HashMap();
        this.j0 = new ArrayList();
        this.k0 = new LinkedHashMap();
        this.n0 = AndroidUtilities.dp(120.0f);
        this.o0 = new ArrayList();
        this.p0 = false;
        this.t0 = new androidx.activity.i(this, 22);
        this.u0 = -1;
        this.z0 = new HashSet();
        this.currentAccount = i10;
        int i12 = j6.h5;
        fixNavigationBar(j6.v0(i12, f6Var));
        this.drawDoubleNavigationBar = false;
        this.U = i11;
        this.s0 = birthdayState;
        hg.h hVar = this.m0;
        if (hVar != null) {
            hVar.w = i11 == 4;
        }
        p2 p2Var = new p2(getContext(), f6Var);
        this.Y = p2Var;
        p2Var.setOnCloseClickListener(new g2(this, 11));
        p2Var.setText(y());
        p2Var.setCloseImageVisible(false);
        p2Var.e.c(0.0f, false);
        this.r0 = new o2(this, 0);
        q2 q2Var = new q2(this, getContext(), f6Var);
        this.W = q2Var;
        q2Var.setBackgroundColor(getThemedColor(i12));
        q2Var.setOnSearchTextChange(new h2(this, 3));
        q2Var.b.setHintText(LocaleController.getString((!hashSet.isEmpty() || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        r2 r2Var = new r2(this, getContext());
        this.X = r2Var;
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(p2Var, 0, b6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup2.addView(q2Var, b6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup3.addView(r2Var, b6.f(1.0f, 55, i15, 0, i15, 0));
        kg.a aVar = new kg.a(getContext(), f6Var, (rl0) null);
        this.a0 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(j6.v0(i12, f6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(j6.Y(getThemedColor(j6.i6), 6, 6));
            kp kpVar = new kp(context, 24, f6Var);
            this.Z = kpVar;
            kpVar.b(j6.Oh, j6.j7, j6.k7);
            kpVar.setDrawUnchecked(true);
            kpVar.a(false, false);
            kpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(kpVar, b6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(j6.j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, b6.t(-2, -2, 16, 9, 0, 0, 0));
            d6.b(linearLayout, 0.025f, 1.5f);
            final int i16 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: gg.k2
                public final /* synthetic */ v2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.b.Z.a(!r3.a.q, true);
                            break;
                        default:
                            this.b.d0();
                            break;
                    }
                }
            });
            aVar.addView(linearLayout, b6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        s2 s2Var = new s2(this, getContext(), f6Var);
        this.V = s2Var;
        if (i11 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        final int i17 = 1;
        s2Var.setOnClickListener(new View.OnClickListener(this) { // from class: gg.k2
            public final /* synthetic */ v2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.Z.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.d0();
                        break;
                }
            }
        });
        aVar.addView(s2Var, b6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i18 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, b6.f(-2.0f, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i19 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, b6.f(300.0f, 87, i19, 0, i19, AndroidUtilities.dp(68.0f)));
        hg.h hVar2 = this.m0;
        rl0 rl0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f = rl0Var;
        int i20 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(i11 != 1 ? 60.0f : 0.0f));
        this.d.j(new t2(this));
        this.d.setOnItemClickListener(new l2(this, i11, f6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((kl0) new m2(this, i11, 0));
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(mr.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new u2(this));
        q2Var.setText("");
        q2Var.d.b(false);
        q2Var.b(false, hashSet, new g2(this, 12), null);
        p2Var.setText(y());
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            p0.j(i10, null, new h2(this, 0));
        }
        if (i11 == 0 || i11 == 2) {
            t7.y(i10, false).V();
        }
    }

    public static /* synthetic */ void P(v2 v2Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = v2Var.h0;
        arrayList.clear();
        v2Var.u0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(v2Var.currentAccount);
            int i10 = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TLRPC.Peer peer = arrayList2.get(i11);
                i11++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    arrayList.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size2 = arrayList3.size();
            while (i10 < size2) {
                TLRPC.Peer peer2 = arrayList3.get(i10);
                i10++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    arrayList.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        v2Var.i0(true, true);
    }

    public static void Q(v2 v2Var, int i10, f6 f6Var, int i11, View view) {
        kg.a aVar = v2Var.a0;
        q2 q2Var = v2Var.W;
        HashSet hashSet = v2Var.e0;
        int i12 = 2;
        if (view instanceof n8) {
            if (i10 != 4) {
                z4.m(v2Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new h2(v2Var, i12), new g2(v2Var, 9), false, false, v2Var.resourcesProvider).a.show();
                return;
            }
            r20 r20Var = v2Var.x0;
            if (r20Var != null) {
                r20Var.run();
                v2Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof kg.n) {
            kg.n nVar = (kg.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                h3 h3Var = v2Var.y0;
                if (h3Var != null) {
                    h3Var.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            if (i10 == 3) {
                h3 h3Var2 = v2Var.y0;
                if (h3Var2 != null) {
                    h3Var2.run(Long.valueOf(j10));
                    return;
                }
                return;
            }
            if (i10 == 1) {
                if (q2Var != null) {
                    AndroidUtilities.hideKeyboard(q2Var.getEditText());
                }
                t9 t9Var = new t9(v2Var.getContext(), f6Var, user, new g2(v2Var, 11));
                if (!AndroidUtilities.isTablet()) {
                    t9Var.makeAttached(v2Var.attachedFragment);
                }
                t9Var.show();
                return;
            }
            if (i10 == 0 || i10 == 2) {
                if (UserObject.areGiftsDisabled(j10)) {
                    new qc(v2Var.container, f6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                    return;
                }
                kh.g2 g2Var = new kh.g2(v2Var.getContext(), i11, j10, p0.c(p0.b(1, v2Var.o0)), new h2(v2Var, true ? 1 : 0));
                BirthdayController.BirthdayState birthdayState = v2Var.s0;
                g2Var.V(birthdayState != null && birthdayState.contains(j10));
                g2Var.show();
                return;
            }
            if (i10 == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j10));
                Utilities.Callback2 callback2 = v2Var.A0;
                if (callback2 != null) {
                    kp kpVar = v2Var.Z;
                    callback2.run(Boolean.valueOf(kpVar != null && kpVar.a.q), hashSet);
                    v2Var.A0 = null;
                }
                v2Var.dismiss();
                return;
            }
            boolean z4 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                v2Var.k0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == v2Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                v2Var.f0();
                return;
            }
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z4 != z10) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z10 ? 1.0f : 0.0f).translationY(z10 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(mr.h).setDuration(320L).withEndAction(!z10 ? new g2(v2Var, true ? 1 : 0) : null).start();
                hg.h hVar = v2Var.m0;
                boolean z11 = !z10;
                if (hVar.x != z11) {
                    hVar.x = z11;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f, (h5.d) new hg.f(z11));
                }
            }
            v2Var.W();
            q2Var.b(true, hashSet, new g2(v2Var, i12), null);
            v2Var.i0(true, true);
            v2Var.X();
        }
    }

    public static void R(v2 v2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = v2Var.b0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            ic Q = new qc(frameLayout, v2Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
            Q.j = 5000;
            Q.j();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            MessagesStorage.getInstance(v2Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            kf.k0.v(R.string.UnknownError, new qc(frameLayout, v2Var.resourcesProvider), R.raw.error, 36);
        } else if (v2Var.getContext() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v2Var.getContext(), 0, v2Var.resourcesProvider);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            kf.k0.C(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static void S(final v2 v2Var, final TLRPC.User user, View view) {
        p70 F = p70.F(v2Var.container, v2Var.resourcesProvider, (View) view.getParent());
        final int i10 = 0;
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(v2Var) { // from class: gg.j2
            public final /* synthetic */ v2 b;

            {
                this.b = v2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = this.b.n;
                            if (p2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                p2Var.presentFragment(new zn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                                n2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new zn(bundle2), n2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = this.b.n;
                            if (p2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                p2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
                                    n2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), n2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(v2Var) { // from class: gg.j2
            public final /* synthetic */ v2 b;

            {
                this.b = v2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var = this.b.n;
                            if (p2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                p2Var.presentFragment(new zn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                                n2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new zn(bundle2), n2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.p2 p2Var2 = this.b.n;
                            if (p2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                p2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
                                    n2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), n2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        F.Z();
    }

    public static /* synthetic */ void T(v2 v2Var, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(v2Var.currentAccount).getUserFull(UserConfig.getInstance(v2Var.currentAccount).getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(v2Var.currentAccount).sendRequest(updatebirthday, new y(v2Var, userFull, tL_birthday2, 4), 1024);
        MessagesController.getInstance(v2Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(v2Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(v2Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        v2Var.h0(true, true);
    }

    public static void U(v2 v2Var, String str) {
        if (v2Var.u0 >= 0) {
            ConnectionsManager.getInstance(v2Var.currentAccount).cancelRequest(v2Var.u0, true);
            v2Var.u0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        v2Var.u0 = ConnectionsManager.getInstance(v2Var.currentAccount).sendRequest(tL_contacts_search, new ff.a(v2Var, 4));
    }

    public static boolean a0(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String uri = data.toString();
                if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                    e0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static v2 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return null;
        }
        n2 n2Var = D0;
        if (n2Var != null) {
            return n2Var;
        }
        n2 n2Var2 = new n2(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            n2Var2.makeAttached(R);
        }
        R.showDialog(n2Var2);
        D0 = n2Var2;
        return n2Var2;
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        p2 p2Var = this.Y;
        p2Var.setTranslationY(max);
        float translationY = p2Var.getTranslationY() + p2Var.getMeasuredHeight();
        q2 q2Var = this.W;
        q2Var.setTranslationY(translationY);
        float translationY2 = q2Var.getTranslationY() + q2Var.getMeasuredHeight();
        this.X.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (q2Var.getMeasuredHeight() + p2Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final int V(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i10 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.id)) {
                long j10 = user.id;
                if (j10 != 0 && !this.z0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.e0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    hg.g c3 = hg.g.c(user, hashSet.contains(Long.valueOf(user.id)));
                    Y(c3);
                    arrayList3.add(c3);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(hg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (!this.e0.isEmpty() || (i10 = this.U) == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            if (this.p0) {
                return;
            }
            this.p0 = true;
            AndroidUtilities.runOnUIThread(new g2(this, 3), 10L);
            return;
        }
        if (this.p0) {
            this.p0 = false;
            AndroidUtilities.runOnUIThread(new g2(this, 4), 10L);
        }
    }

    public final void X() {
        if (TextUtils.isEmpty(this.l0)) {
            return;
        }
        this.l0 = null;
        this.W.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.t0);
        h0(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gg.i2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [gg.i2] */
    public final hg.g Y(hg.g gVar) {
        int i10 = this.U;
        if (i10 != 4) {
            gVar.n = i10 == 3 ? null : new cg.n(6, this, gVar.c);
            return gVar;
        }
        TLRPC.User user = gVar.c;
        if (user == null) {
            return gVar;
        }
        final long j10 = user.id;
        final int i11 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: gg.i2
            public final /* synthetic */ v2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        v2 v2Var = this.b;
                        HashSet hashSet = v2Var.e0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = v2Var.A0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            v2Var.A0 = null;
                        }
                        v2Var.dismiss();
                        break;
                    default:
                        v2 v2Var2 = this.b;
                        HashSet hashSet2 = v2Var2.e0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback22 = v2Var2.A0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            v2Var2.A0 = null;
                        }
                        v2Var2.dismiss();
                        break;
                }
            }
        };
        final int i12 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: gg.i2
            public final /* synthetic */ v2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        v2 v2Var = this.b;
                        HashSet hashSet = v2Var.e0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = v2Var.A0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            v2Var.A0 = null;
                        }
                        v2Var.dismiss();
                        break;
                    default:
                        v2 v2Var2 = this.b;
                        HashSet hashSet2 = v2Var2.e0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback22 = v2Var2.A0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            v2Var2.A0 = null;
                        }
                        v2Var2.dismiss();
                        break;
                }
            }
        };
        gVar.o = r22;
        gVar.p = r32;
        return gVar;
    }

    public final int Z() {
        if (this.U == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.z0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z4) {
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.i0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.j0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z4) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z4) {
        ArrayList arrayList = this.g0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z4) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.e0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.o0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.U;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.k0.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.W.getEditText());
                if (i10 == 1) {
                    return;
                }
                if (i10 == 4) {
                    Utilities.Callback2 callback2 = this.A0;
                    if (callback2 != null) {
                        kp kpVar = this.Z;
                        callback2.run(Boolean.valueOf(kpVar != null && kpVar.a.q), hashSet);
                        this.A0 = null;
                    }
                    dismiss();
                    return;
                }
                List c3 = p0.c(p0.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j10 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (UserObject.areGiftsDisabled(j10)) {
                        new qc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    kh.g2 g2Var = new kh.g2(getContext(), this.currentAccount, j10, c3, new h2(this, r5 ? 1 : 0));
                    BirthdayController.BirthdayState birthdayState = this.s0;
                    g2Var.V(birthdayState != null && birthdayState.contains(j10));
                    g2Var.show();
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.giftsToUserSent) {
            dismiss();
            return;
        }
        if (i10 == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new g2(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new g2(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new g2(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.W.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        D0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.t0);
    }

    public final void f0() {
        new qc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, this.U == 4 ? LocaleController.formatPluralStringComma("UserSelectorLimit", Z()) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers)).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z4) {
        s2 s2Var = this.V;
        s2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.U;
        HashSet hashSet = this.e0;
        if (i10 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        } else if (LocaleController.isRTL) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.r0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.r0, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
        }
        s2Var.c(hashSet.size(), true);
        s2Var.g(spannableStringBuilder, z4, false);
        s2Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(boolean z4, boolean z10) {
        int dp;
        TLRPC.User currentUser;
        float f10;
        long j10;
        hg.g gVar;
        int size;
        int i10;
        int i11;
        HashSet hashSet;
        Iterator it;
        BirthdayController.BirthdayState birthdayState;
        hg.h hVar;
        int i12;
        ArrayList arrayList = this.c0;
        arrayList.clear();
        ArrayList arrayList2 = this.d0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.l0);
        HashSet hashSet2 = this.z0;
        int i13 = 3;
        int i14 = this.U;
        HashSet hashSet3 = this.e0;
        if (isEmpty) {
            if (this.B0 && i14 == 3) {
                if (this.v0 == null) {
                    mq mqVar = new mq(j6.K(AndroidUtilities.dp(46.0f), j6.v0(j6.Oh, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int dp3 = AndroidUtilities.dp(24.0f);
                    mqVar.e = dp2;
                    mqVar.f = dp3;
                    this.v0 = mqVar;
                }
                mq mqVar2 = this.v0;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i15 = this.C0;
                String formatPluralString = i15 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i15, new Object[0]) : "";
                hg.g gVar2 = new hg.g(3, true);
                gVar2.i = 2;
                gVar2.r = mqVar2;
                gVar2.g = string;
                gVar2.h = formatPluralString;
                arrayList2.add(gVar2);
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if ((i14 == 0 || i14 == 2) && userFull != null && userFull.birthday == null) {
                dp = AndroidUtilities.dp(50.0f);
                int i16 = R.drawable.menu_birthday;
                String string2 = LocaleController.getString(R.string.GiftsBirthdaySetup);
                hg.g gVar3 = new hg.g(9, false);
                gVar3.i = 1;
                gVar3.j = i16;
                gVar3.g = string2;
                arrayList2.add(gVar3);
            } else {
                dp = 0;
            }
            if (this.x0 != null && i14 == 4) {
                int i17 = R.drawable.msg2_link2;
                String string3 = LocaleController.getString(R.string.VoipConferenceShareLink);
                hg.g gVar4 = new hg.g(9, false);
                gVar4.i = 3;
                gVar4.j = i17;
                gVar4.g = string3;
                arrayList2.add(gVar4);
            }
            BirthdayController.BirthdayState birthdayState2 = this.s0;
            if (birthdayState2 != null) {
                dp = V(LocaleController.getString(R.string.BirthdayYesterday), arrayList2, birthdayState2.yesterday) + V(LocaleController.getString(R.string.BirthdayToday), arrayList2, birthdayState2.today) + dp + V(LocaleController.getString(R.string.BirthdayTomorrow), arrayList2, birthdayState2.tomorrow);
            }
            if ((i14 == 0 || i14 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                arrayList2.add(hg.g.b(LocaleController.getString(R.string.Gift2MyselfSection)));
                hg.g c3 = hg.g.c(currentUser, hashSet3.contains(Long.valueOf(currentUser.id)));
                c3.h = LocaleController.getString(R.string.Gift2Myself);
                arrayList2.add(c3);
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.g0;
            if (arrayList4.isEmpty()) {
                f10 = 32.0f;
                j10 = 0;
            } else {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                int i18 = 0;
                while (i18 < size2) {
                    Object obj = arrayList4.get(i18);
                    i18++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (user != null) {
                        long j11 = user.id;
                        if (j11 != 0 && !user.self && !user.bot && !UserObject.isService(j11) && !UserObject.isDeleted(user) && (birthdayState2 == null || !birthdayState2.contains(user.id))) {
                            if (!hashSet2.contains(Long.valueOf(user.id))) {
                                if (hashSet3.contains(Long.valueOf(user.id))) {
                                    arrayList3.add(Long.valueOf(user.id));
                                }
                                dp += AndroidUtilities.dp(56.0f);
                                hg.g c10 = hg.g.c(user, hashSet3.contains(Long.valueOf(user.id)));
                                Y(c10);
                                arrayList5.add(c10);
                            }
                        }
                    }
                }
                f10 = 32.0f;
                j10 = 0;
                if (!arrayList5.isEmpty()) {
                    dp += AndroidUtilities.dp(32.0f);
                    gVar = hg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    arrayList2.add(gVar);
                    arrayList2.addAll(arrayList5);
                    ArrayList arrayList6 = this.j0;
                    size = arrayList6.size();
                    i10 = dp;
                    i11 = 0;
                    while (i11 < size) {
                        int i19 = i11 + 1;
                        String str = (String) arrayList6.get(i11);
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it2 = ((List) this.i0.get(str)).iterator();
                        while (it2.hasNext()) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) it2.next();
                            String str2 = str;
                            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                            int i20 = size;
                            int i21 = i19;
                            long j12 = tL_contact.user_id;
                            if (j12 == clientUserId || j12 == j10 || ((birthdayState2 != null && birthdayState2.contains(j12)) || hashSet2.contains(Long.valueOf(tL_contact.user_id)))) {
                                hashSet = hashSet2;
                                it = it2;
                            } else {
                                hashSet = hashSet2;
                                it = it2;
                                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_contact.user_id));
                                if (user2 != null && !user2.bot) {
                                    birthdayState = birthdayState2;
                                    if (!UserObject.isService(user2.id)) {
                                        i10 += AndroidUtilities.dp(56.0f);
                                        if (hashSet3.contains(Long.valueOf(user2.id))) {
                                            arrayList3.add(Long.valueOf(user2.id));
                                        }
                                        hg.g c11 = hg.g.c(user2, hashSet3.contains(Long.valueOf(user2.id)));
                                        Y(c11);
                                        arrayList7.add(c11);
                                    }
                                    size = i20;
                                    hashSet2 = hashSet;
                                    birthdayState2 = birthdayState;
                                    str = str2;
                                    it2 = it;
                                    i19 = i21;
                                }
                            }
                            birthdayState = birthdayState2;
                            size = i20;
                            hashSet2 = hashSet;
                            birthdayState2 = birthdayState;
                            str = str2;
                            it2 = it;
                            i19 = i21;
                        }
                        String str3 = str;
                        BirthdayController.BirthdayState birthdayState3 = birthdayState2;
                        int i22 = size;
                        int i23 = i19;
                        HashSet hashSet4 = hashSet2;
                        if (!arrayList7.isEmpty()) {
                            int dp4 = AndroidUtilities.dp(f10) + i10;
                            String upperCase = str3.toUpperCase();
                            hg.g gVar5 = new hg.g(7, false);
                            gVar5.g = upperCase;
                            arrayList2.add(gVar5);
                            arrayList2.addAll(arrayList7);
                            i10 = dp4;
                        }
                        size = i22;
                        hashSet2 = hashSet4;
                        birthdayState2 = birthdayState3;
                        i11 = i23;
                    }
                    if (gVar != null && arrayList3.size() > 0 && !hashSet3.isEmpty()) {
                        String string4 = LocaleController.getString(R.string.DeselectAll);
                        cg.n nVar = new cg.n(5, this, arrayList3);
                        gVar.h = string4;
                        gVar.m = nVar;
                    }
                }
            }
            gVar = null;
            ArrayList arrayList62 = this.j0;
            size = arrayList62.size();
            i10 = dp;
            i11 = 0;
            while (i11 < size) {
            }
            if (gVar != null) {
                String string42 = LocaleController.getString(R.string.DeselectAll);
                cg.n nVar2 = new cg.n(5, this, arrayList3);
                gVar.h = string42;
                gVar.m = nVar2;
            }
        } else {
            ArrayList arrayList8 = this.h0;
            int size3 = arrayList8.size();
            i10 = 0;
            int i24 = 0;
            while (i24 < size3) {
                Object obj2 = arrayList8.get(i24);
                i24++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    i12 = size3;
                    if (!user3.bot && !UserObject.isService(user3.id)) {
                        long j13 = user3.id;
                        i10 = AndroidUtilities.dp(56.0f) + i10;
                        if (!hashSet2.contains(Long.valueOf(user3.id))) {
                            hg.g c12 = hg.g.c(user3, hashSet3.contains(Long.valueOf(j13)));
                            Y(c12);
                            arrayList2.add(c12);
                            size3 = i12;
                            i13 = 3;
                        }
                    }
                    size3 = i12;
                } else {
                    i12 = size3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (i14 == i13 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                            long j14 = -chat.id;
                            i10 += AndroidUtilities.dp(56.0f);
                            if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                                boolean contains = hashSet3.contains(Long.valueOf(j14));
                                hg.g gVar6 = new hg.g(3, true);
                                gVar6.e = chat;
                                gVar6.c = null;
                                gVar6.d = null;
                                gVar6.k = contains;
                                arrayList2.add(gVar6);
                            }
                        }
                        size3 = i12;
                    }
                    size3 = i12;
                    i13 = 3;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new hg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        hg.g gVar7 = new hg.g(-1, false);
        gVar7.l = max;
        arrayList2.add(gVar7);
        if (!z10 || (hVar = this.m0) == null) {
            return;
        }
        if (z4) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.l();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 int, still in use, count: 2, list:
          (r5v2 int) from 0x0053: MOVE (r3v6 int) = (r5v2 int) (LINE:84)
          (r5v2 int) from 0x002b: MOVE (r2v4 int) = (r5v2 int) (LINE:44)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public final void i0(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.h0(r10, r11)
            r11 = -1
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = 0
        L8:
            org.telegram.ui.Components.rl0 r4 = r9.d
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof kg.n
            if (r5 == 0) goto L54
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L54
            java.util.ArrayList r7 = r9.d0
            int r8 = r7.size()
            if (r6 < r8) goto L29
            goto L54
        L29:
            if (r2 != r11) goto L2c
            r2 = r5
        L2c:
            java.lang.Object r3 = r7.get(r6)
            hg.g r3 = (hg.g) r3
            kg.n r4 = (kg.n) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            hg.h r7 = r9.m0
            int r3 = r7.F(r3)
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 <= r7) goto L4c
            r6 = 1050253722(0x3e99999a, float:0.3)
        L4c:
            r4.i(r6, r10)
            goto L53
        L50:
            r4.i(r6, r10)
        L53:
            r3 = r5
        L54:
            int r1 = r1 + 1
            goto L8
        L57:
            if (r10 == 0) goto L68
            hg.h r11 = r9.m0
            r11.q(r0, r2)
            hg.h r11 = r9.m0
            int r0 = r11.h()
            int r0 = r0 - r3
            r11.q(r3, r0)
        L68:
            r9.g0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gg.v2.i0(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h0(false, true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        hg.h hVar = new hg.h(getContext(), this.resourcesProvider, false);
        this.m0 = hVar;
        hVar.r = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        String str = this.w0;
        if (str != null) {
            return str;
        }
        int i10 = this.U;
        if (i10 != 0) {
            if (i10 == 1) {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
            if (i10 != 2) {
                return i10 != 4 ? LocaleController.getString(R.string.GiftTelegramPremiumTitle) : LocaleController.getString(R.string.VoipConferenceAddPeople);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }
}
