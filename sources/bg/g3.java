package bg;

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
import g7.e6;
import g7.g6;
import gh.j3;
import gh.v7;
import gh.y9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class g3 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static y2 C0;
    public boolean A0;
    public int B0;
    public final int T;
    public final d3 U;
    public final b3 V;
    public final c3 W;
    public final a3 X;
    public final dp Y;
    public final fg.a Z;
    public final FrameLayout a0;
    public final ArrayList b0;
    public final ArrayList c0;
    public final HashSet d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public final ArrayList g0;
    public final HashMap h0;
    public final ArrayList i0;
    public final LinkedHashMap j0;
    public String k0;
    public cg.h l0;
    public int m0;
    public final ArrayList n0;
    public boolean o0;
    public float p0;
    public z2 q0;
    public final BirthdayController.BirthdayState r0;
    public final androidx.activity.i s0;
    public int t0;
    public fq u0;
    public String v0;
    public b20 w0;
    public j3 x0;
    public final HashSet y0;
    public Utilities.Callback2 z0;

    public g3(Context context, int i9, BirthdayController.BirthdayState birthdayState, int i10, b6 b6Var) {
        super(context, null, true, false, false, 1, b6Var);
        this.b0 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        HashSet hashSet = new HashSet();
        this.d0 = hashSet;
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.h0 = new HashMap();
        this.i0 = new ArrayList();
        this.j0 = new LinkedHashMap();
        this.m0 = AndroidUtilities.dp(120.0f);
        this.n0 = new ArrayList();
        this.o0 = false;
        this.s0 = new androidx.activity.i(this, 9);
        this.t0 = -1;
        this.y0 = new HashSet();
        this.currentAccount = i9;
        int i11 = f6.h5;
        fixNavigationBar(f6.v0(i11, b6Var));
        this.drawDoubleNavigationBar = false;
        this.T = i10;
        this.r0 = birthdayState;
        cg.h hVar = this.l0;
        if (hVar != null) {
            hVar.w = i10 == 4;
        }
        a3 a3Var = new a3(getContext(), b6Var);
        this.X = a3Var;
        a3Var.setOnCloseClickListener(new r2(this, 11));
        a3Var.setText(y());
        a3Var.setCloseImageVisible(false);
        a3Var.e.c(0.0f, false);
        this.q0 = new z2(this, 0);
        b3 b3Var = new b3(this, getContext(), b6Var);
        this.V = b3Var;
        b3Var.setBackgroundColor(getThemedColor(i11));
        b3Var.setOnSearchTextChange(new s2(this, 3));
        b3Var.b.setHintText(LocaleController.getString((!hashSet.isEmpty() || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        c3 c3Var = new c3(this, getContext());
        this.W = c3Var;
        ViewGroup viewGroup = this.containerView;
        int i12 = this.backgroundPaddingLeft;
        viewGroup.addView(a3Var, 0, e6.f(-2.0f, 55, i12, 0, i12, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup2.addView(b3Var, e6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup3.addView(c3Var, e6.f(1.0f, 55, i14, 0, i14, 0));
        fg.a aVar = new fg.a(getContext(), b6Var, (wk0) null);
        this.Z = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(f6.v0(i11, b6Var));
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(f6.Y(getThemedColor(f6.i6), 6, 6));
            dp dpVar = new dp(context, 24, b6Var);
            this.Y = dpVar;
            dpVar.b(f6.Oh, f6.j7, f6.k7);
            dpVar.setDrawUnchecked(true);
            dpVar.a(false, false);
            dpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(dpVar, e6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(f6.j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, e6.t(-2, -2, 16, 9, 0, 0, 0));
            g6.b(linearLayout, 0.025f, 1.5f);
            final int i15 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: bg.v2
                public final /* synthetic */ g3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            this.b.Y.a(!r3.a.q, true);
                            break;
                        default:
                            this.b.c0();
                            break;
                    }
                }
            });
            aVar.addView(linearLayout, e6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        d3 d3Var = new d3(this, getContext(), b6Var);
        this.U = d3Var;
        if (i10 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        final int i16 = 1;
        d3Var.setOnClickListener(new View.OnClickListener(this) { // from class: bg.v2
            public final /* synthetic */ g3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.b.Y.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.c0();
                        break;
                }
            }
        });
        aVar.addView(d3Var, e6.q(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i17 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, e6.f(-2.0f, 87, i17, 0, i17, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.a0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i18 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, e6.f(300.0f, 87, i18, 0, i18, AndroidUtilities.dp(68.0f)));
        cg.h hVar2 = this.l0;
        wk0 wk0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f = wk0Var;
        int i19 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i19, 0, i19, AndroidUtilities.dp(i10 != 1 ? 60.0f : 0.0f));
        this.d.j(new e3(this));
        this.d.setOnItemClickListener(new w2(this, i10, b6Var, i9));
        if (i10 == 4) {
            this.d.setOnItemLongClickListener((pk0) new x2(this, i10, 0));
        }
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(gr.h);
        nVar.C = false;
        nVar.m = false;
        this.d.setItemAnimator(nVar);
        this.d.i(new f3(this));
        b3Var.setText("");
        b3Var.d.b(false);
        b3Var.b(false, hashSet, new r2(this, 12), null);
        a3Var.setText(y());
        pa paVar = this.e;
        if (paVar != null) {
            paVar.setTitle(y());
        }
        f0(false);
        a0(false);
        b0(false);
        h0(false, true);
        if (i10 == 0 || i10 == 2) {
            u0.j(i9, null, new s2(this, 0));
        }
        if (i10 == 0 || i10 == 2) {
            v7.y(i9, false).V();
        }
    }

    public static /* synthetic */ void O(g3 g3Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = g3Var.g0;
        arrayList.clear();
        g3Var.t0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(g3Var.currentAccount);
            int i9 = 0;
            messagesController.putUsers(tL_contacts_found.users, false);
            messagesController.putChats(tL_contacts_found.chats, false);
            HashSet hashSet = new HashSet();
            ArrayList<TLRPC.Peer> arrayList2 = tL_contacts_found.my_results;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Peer peer = arrayList2.get(i10);
                i10++;
                long peerDialogId = DialogObject.getPeerDialogId(peer);
                if (!hashSet.contains(Long.valueOf(peerDialogId)) && (userOrChat2 = messagesController.getUserOrChat(peerDialogId)) != null) {
                    arrayList.add(userOrChat2);
                    hashSet.add(Long.valueOf(peerDialogId));
                }
            }
            ArrayList<TLRPC.Peer> arrayList3 = tL_contacts_found.results;
            int size2 = arrayList3.size();
            while (i9 < size2) {
                TLRPC.Peer peer2 = arrayList3.get(i9);
                i9++;
                long peerDialogId2 = DialogObject.getPeerDialogId(peer2);
                if (!hashSet.contains(Long.valueOf(peerDialogId2)) && (userOrChat = messagesController.getUserOrChat(peerDialogId2)) != null) {
                    arrayList.add(userOrChat);
                    hashSet.add(Long.valueOf(peerDialogId2));
                }
            }
        }
        g3Var.h0(true, true);
    }

    public static void P(g3 g3Var, int i9, b6 b6Var, int i10, View view) {
        fg.a aVar = g3Var.Z;
        b3 b3Var = g3Var.V;
        HashSet hashSet = g3Var.d0;
        int i11 = 2;
        if (view instanceof p8) {
            if (i9 != 4) {
                y4.m(g3Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new s2(g3Var, i11), new r2(g3Var, 9), false, false, g3Var.resourcesProvider).a.show();
                return;
            }
            b20 b20Var = g3Var.w0;
            if (b20Var != null) {
                b20Var.run();
                g3Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof fg.p) {
            fg.p pVar = (fg.p) view;
            TLRPC.User user = pVar.getUser();
            TLRPC.Chat chat = pVar.getChat();
            if (user == null && chat == null && i9 == 3) {
                j3 j3Var = g3Var.x0;
                if (j3Var != null) {
                    j3Var.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            if (i9 == 3) {
                j3 j3Var2 = g3Var.x0;
                if (j3Var2 != null) {
                    j3Var2.run(Long.valueOf(j10));
                    return;
                }
                return;
            }
            if (i9 == 1) {
                if (b3Var != null) {
                    AndroidUtilities.hideKeyboard(b3Var.getEditText());
                }
                y9 y9Var = new y9(g3Var.getContext(), b6Var, user, new r2(g3Var, 11));
                if (!AndroidUtilities.isTablet()) {
                    y9Var.makeAttached(g3Var.attachedFragment);
                }
                y9Var.show();
                return;
            }
            if (i9 == 0 || i9 == 2) {
                if (UserObject.areGiftsDisabled(j10)) {
                    new oc(g3Var.container, b6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                    return;
                }
                fh.p2 p2Var = new fh.p2(g3Var.getContext(), i10, j10, u0.c(u0.b(1, g3Var.n0)), new s2(g3Var, true ? 1 : 0));
                BirthdayController.BirthdayState birthdayState = g3Var.r0;
                p2Var.U(birthdayState != null && birthdayState.contains(j10));
                p2Var.show();
                return;
            }
            if (i9 == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j10));
                Utilities.Callback2 callback2 = g3Var.z0;
                if (callback2 != null) {
                    dp dpVar = g3Var.Y;
                    callback2.run(Boolean.valueOf(dpVar != null && dpVar.a.q), hashSet);
                    g3Var.z0 = null;
                }
                g3Var.dismiss();
                return;
            }
            boolean z10 = (i9 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                g3Var.j0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == g3Var.Y() + 1) {
                hashSet.remove(Long.valueOf(j10));
                g3Var.e0();
                return;
            }
            boolean z11 = (i9 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(gr.h).setDuration(320L).withEndAction(!z11 ? new r2(g3Var, true ? 1 : 0) : null).start();
                cg.h hVar = g3Var.l0;
                boolean z12 = !z11;
                if (hVar.x != z12) {
                    hVar.x = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f, (d5.d) new cg.f(z12));
                }
            }
            g3Var.V();
            b3Var.b(true, hashSet, new r2(g3Var, i11), null);
            g3Var.h0(true, true);
            g3Var.W();
        }
    }

    public static void Q(g3 g3Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = g3Var.a0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            gc Q = new oc(frameLayout, g3Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
            MessagesStorage.getInstance(g3Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            org.telegram.messenger.l0.p(R.string.UnknownError, new oc(frameLayout, g3Var.resourcesProvider), R.raw.error, 36);
        } else if (g3Var.getContext() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g3Var.getContext(), 0, g3Var.resourcesProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static void R(final g3 g3Var, final TLRPC.User user, View view) {
        x60 F = x60.F(g3Var.container, g3Var.resourcesProvider, (View) view.getParent());
        final int i9 = 0;
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(g3Var) { // from class: bg.u2
            public final /* synthetic */ g3 b;

            {
                this.b = g3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = this.b.n;
                            if (o2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                o2Var.presentFragment(new qn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                m2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new qn(bundle2), m2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = this.b.n;
                            if (o2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                o2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                                    m2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), m2Var2);
                                    break;
                                }
                            }
                        }
                        break;
                }
            }
        }, false);
        final int i10 = 1;
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(g3Var) { // from class: bg.u2
            public final /* synthetic */ g3 b;

            {
                this.b = g3Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = this.b.n;
                            if (o2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                o2Var.presentFragment(new qn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                m2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new qn(bundle2), m2Var);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        TLRPC.User user3 = user;
                        if (user3 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = this.b.n;
                            if (o2Var2 != null) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("user_id", user3.id);
                                o2Var2.presentFragment(new ProfileActivity(bundle3, null));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                                if (U2 != null) {
                                    org.telegram.ui.ActionBar.m2 m2Var2 = new org.telegram.ui.ActionBar.m2();
                                    m2Var2.a = true;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("user_id", user3.id);
                                    U2.showAsSheet(new ProfileActivity(bundle4, null), m2Var2);
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

    public static /* synthetic */ void S(g3 g3Var, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(g3Var.currentAccount).getUserFull(UserConfig.getInstance(g3Var.currentAccount).getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(g3Var.currentAccount).sendRequest(updatebirthday, new b0(g3Var, userFull, tL_birthday2, 4), 1024);
        MessagesController.getInstance(g3Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(g3Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(g3Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        g3Var.g0(true, true);
    }

    public static void T(g3 g3Var, String str) {
        if (g3Var.t0 >= 0) {
            ConnectionsManager.getInstance(g3Var.currentAccount).cancelRequest(g3Var.t0, true);
            g3Var.t0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        g3Var.t0 = ConnectionsManager.getInstance(g3Var.currentAccount).sendRequest(tL_contacts_search, new bf.a(g3Var, 4));
    }

    public static boolean Z(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    d0(0, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String uri = data.toString();
                if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                    d0(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static g3 d0(int i9, BirthdayController.BirthdayState birthdayState) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return null;
        }
        y2 y2Var = C0;
        if (y2Var != null) {
            return y2Var;
        }
        y2 y2Var2 = new y2(R.getContext(), R.getCurrentAccount(), birthdayState, i9, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            y2Var2.makeAttached(R);
        }
        R.showDialog(y2Var2);
        C0 = y2Var2;
        return y2Var2;
    }

    @Override // org.telegram.ui.Components.sa
    public final void C(Canvas canvas, int i9) {
        float max = Math.max(i9, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        a3 a3Var = this.X;
        a3Var.setTranslationY(max);
        float translationY = a3Var.getTranslationY() + a3Var.getMeasuredHeight();
        b3 b3Var = this.V;
        b3Var.setTranslationY(translationY);
        float translationY2 = b3Var.getTranslationY() + b3Var.getMeasuredHeight();
        this.W.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (b3Var.getMeasuredHeight() + a3Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
    }

    public final int U(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i9 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !UserObject.isService(user.id)) {
                long j10 = user.id;
                if (j10 != 0 && !this.y0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.d0;
                    hashSet.contains(valueOf);
                    i9 += AndroidUtilities.dp(56.0f);
                    cg.g c10 = cg.g.c(user, hashSet.contains(Long.valueOf(user.id)));
                    X(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i9;
        }
        int dp = AndroidUtilities.dp(32.0f) + i9;
        arrayList.add(cg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void V() {
        int i9;
        if (!this.d0.isEmpty() || (i9 = this.T) == 1 || i9 == 2 || i9 == 3 || i9 == 4) {
            if (this.o0) {
                return;
            }
            this.o0 = true;
            AndroidUtilities.runOnUIThread(new r2(this, 3), 10L);
            return;
        }
        if (this.o0) {
            this.o0 = false;
            AndroidUtilities.runOnUIThread(new r2(this, 4), 10L);
        }
    }

    public final void W() {
        if (TextUtils.isEmpty(this.k0)) {
            return;
        }
        this.k0 = null;
        this.V.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.s0);
        g0(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [bg.t2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bg.t2] */
    public final cg.g X(cg.g gVar) {
        int i9 = this.T;
        if (i9 != 4) {
            gVar.n = i9 == 3 ? null : new u1(2, this, gVar.c);
            return gVar;
        }
        TLRPC.User user = gVar.c;
        if (user == null) {
            return gVar;
        }
        final long j10 = user.id;
        final int i10 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: bg.t2
            public final /* synthetic */ g3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g3 g3Var = this.b;
                        HashSet hashSet = g3Var.d0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = g3Var.z0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            g3Var.z0 = null;
                        }
                        g3Var.dismiss();
                        break;
                    default:
                        g3 g3Var2 = this.b;
                        HashSet hashSet2 = g3Var2.d0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback22 = g3Var2.z0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            g3Var2.z0 = null;
                        }
                        g3Var2.dismiss();
                        break;
                }
            }
        };
        final int i11 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: bg.t2
            public final /* synthetic */ g3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g3 g3Var = this.b;
                        HashSet hashSet = g3Var.d0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = g3Var.z0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            g3Var.z0 = null;
                        }
                        g3Var.dismiss();
                        break;
                    default:
                        g3 g3Var2 = this.b;
                        HashSet hashSet2 = g3Var2.d0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback22 = g3Var2.z0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            g3Var2.z0 = null;
                        }
                        g3Var2.dismiss();
                        break;
                }
            }
        };
        gVar.o = r22;
        gVar.p = r32;
        return gVar;
    }

    public final int Y() {
        if (this.T == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.y0.size()) - 1);
        }
        return 10;
    }

    public final void a0(boolean z10) {
        ArrayList arrayList = this.e0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.h0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.i0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                g0(true, true);
            }
        }
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                g0(true, true);
            }
        }
    }

    public final void c0() {
        HashSet hashSet = this.d0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.n0;
            boolean isEmpty = arrayList.isEmpty();
            int i9 = this.T;
            if (!isEmpty || i9 == 0 || i9 == 2 || i9 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.j0.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.V.getEditText());
                if (i9 == 1) {
                    return;
                }
                if (i9 == 4) {
                    Utilities.Callback2 callback2 = this.z0;
                    if (callback2 != null) {
                        dp dpVar = this.Y;
                        callback2.run(Boolean.valueOf(dpVar != null && dpVar.a.q), hashSet);
                        this.z0 = null;
                    }
                    dismiss();
                    return;
                }
                List c10 = u0.c(u0.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j10 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (UserObject.areGiftsDisabled(j10)) {
                        new oc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    fh.p2 p2Var = new fh.p2(getContext(), this.currentAccount, j10, c10, new s2(this, r5 ? 1 : 0));
                    BirthdayController.BirthdayState birthdayState = this.r0;
                    p2Var.U(birthdayState != null && birthdayState.contains(j10));
                    p2Var.show();
                }
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.giftsToUserSent) {
            dismiss();
            return;
        }
        if (i9 == NotificationCenter.contactsDidLoad) {
            AndroidUtilities.runOnUIThread(new r2(this, 0));
        } else if (i9 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new r2(this, 6));
        } else if (i9 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new r2(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.V.getEditText());
        super.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        C0 = null;
        AndroidUtilities.cancelRunOnUIThread(this.s0);
    }

    public final void e0() {
        new oc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, this.T == 4 ? LocaleController.formatPluralStringComma("UserSelectorLimit", Y()) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers)).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void f0(boolean z10) {
        d3 d3Var = this.U;
        d3Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i9 = this.T;
        HashSet hashSet = this.d0;
        if (i9 == 4) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CallInviteMembersButton));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumProceedBtn", R.string.GiftPremiumProceedBtn));
        } else if (LocaleController.isRTL) {
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.q0, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString("GiftPremiumChooseRecipientsBtn", R.string.GiftPremiumChooseRecipientsBtn));
        }
        d3Var.c(hashSet.size(), true);
        d3Var.g(spannableStringBuilder, z10, false);
        d3Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(boolean z10, boolean z11) {
        int dp;
        TLRPC.User currentUser;
        float f10;
        long j10;
        cg.g gVar;
        int size;
        int i9;
        int i10;
        HashSet hashSet;
        Iterator it;
        BirthdayController.BirthdayState birthdayState;
        cg.h hVar;
        int i11;
        ArrayList arrayList = this.b0;
        arrayList.clear();
        ArrayList arrayList2 = this.c0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.k0);
        HashSet hashSet2 = this.y0;
        int i12 = 3;
        int i13 = this.T;
        HashSet hashSet3 = this.d0;
        if (isEmpty) {
            if (this.A0 && i13 == 3) {
                if (this.u0 == null) {
                    fq fqVar = new fq(f6.K(AndroidUtilities.dp(46.0f), f6.v0(f6.Oh, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int dp3 = AndroidUtilities.dp(24.0f);
                    fqVar.e = dp2;
                    fqVar.f = dp3;
                    this.u0 = fqVar;
                }
                fq fqVar2 = this.u0;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i14 = this.B0;
                String formatPluralString = i14 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i14, new Object[0]) : "";
                cg.g gVar2 = new cg.g(3, true);
                gVar2.i = 2;
                gVar2.r = fqVar2;
                gVar2.g = string;
                gVar2.h = formatPluralString;
                arrayList2.add(gVar2);
            }
            TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(UserConfig.getInstance(this.currentAccount).getClientUserId());
            if (userFull == null) {
                MessagesController.getInstance(this.currentAccount).loadFullUser(UserConfig.getInstance(this.currentAccount).getCurrentUser(), 0, true);
            }
            if ((i13 == 0 || i13 == 2) && userFull != null && userFull.birthday == null) {
                dp = AndroidUtilities.dp(50.0f);
                int i15 = R.drawable.menu_birthday;
                String string2 = LocaleController.getString(R.string.GiftsBirthdaySetup);
                cg.g gVar3 = new cg.g(9, false);
                gVar3.i = 1;
                gVar3.j = i15;
                gVar3.g = string2;
                arrayList2.add(gVar3);
            } else {
                dp = 0;
            }
            if (this.w0 != null && i13 == 4) {
                int i16 = R.drawable.msg2_link2;
                String string3 = LocaleController.getString(R.string.VoipConferenceShareLink);
                cg.g gVar4 = new cg.g(9, false);
                gVar4.i = 3;
                gVar4.j = i16;
                gVar4.g = string3;
                arrayList2.add(gVar4);
            }
            BirthdayController.BirthdayState birthdayState2 = this.r0;
            if (birthdayState2 != null) {
                dp = U(LocaleController.getString(R.string.BirthdayYesterday), arrayList2, birthdayState2.yesterday) + U(LocaleController.getString(R.string.BirthdayToday), arrayList2, birthdayState2.today) + dp + U(LocaleController.getString(R.string.BirthdayTomorrow), arrayList2, birthdayState2.tomorrow);
            }
            if ((i13 == 0 || i13 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                arrayList2.add(cg.g.b(LocaleController.getString(R.string.Gift2MyselfSection)));
                cg.g c10 = cg.g.c(currentUser, hashSet3.contains(Long.valueOf(currentUser.id)));
                c10.h = LocaleController.getString(R.string.Gift2Myself);
                arrayList2.add(c10);
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f0;
            if (arrayList4.isEmpty()) {
                f10 = 32.0f;
                j10 = 0;
            } else {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj = arrayList4.get(i17);
                    i17++;
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (user != null) {
                        long j11 = user.id;
                        if (j11 != 0 && !user.self && !user.bot && !UserObject.isService(j11) && !UserObject.isDeleted(user) && (birthdayState2 == null || !birthdayState2.contains(user.id))) {
                            if (!hashSet2.contains(Long.valueOf(user.id))) {
                                if (hashSet3.contains(Long.valueOf(user.id))) {
                                    arrayList3.add(Long.valueOf(user.id));
                                }
                                dp += AndroidUtilities.dp(56.0f);
                                cg.g c11 = cg.g.c(user, hashSet3.contains(Long.valueOf(user.id)));
                                X(c11);
                                arrayList5.add(c11);
                            }
                        }
                    }
                }
                f10 = 32.0f;
                j10 = 0;
                if (!arrayList5.isEmpty()) {
                    dp += AndroidUtilities.dp(32.0f);
                    gVar = cg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    arrayList2.add(gVar);
                    arrayList2.addAll(arrayList5);
                    ArrayList arrayList6 = this.i0;
                    size = arrayList6.size();
                    i9 = dp;
                    i10 = 0;
                    while (i10 < size) {
                        int i18 = i10 + 1;
                        String str = (String) arrayList6.get(i10);
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it2 = ((List) this.h0.get(str)).iterator();
                        while (it2.hasNext()) {
                            TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) it2.next();
                            String str2 = str;
                            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                            int i19 = size;
                            int i20 = i18;
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
                                        i9 += AndroidUtilities.dp(56.0f);
                                        if (hashSet3.contains(Long.valueOf(user2.id))) {
                                            arrayList3.add(Long.valueOf(user2.id));
                                        }
                                        cg.g c12 = cg.g.c(user2, hashSet3.contains(Long.valueOf(user2.id)));
                                        X(c12);
                                        arrayList7.add(c12);
                                    }
                                    size = i19;
                                    hashSet2 = hashSet;
                                    birthdayState2 = birthdayState;
                                    str = str2;
                                    it2 = it;
                                    i18 = i20;
                                }
                            }
                            birthdayState = birthdayState2;
                            size = i19;
                            hashSet2 = hashSet;
                            birthdayState2 = birthdayState;
                            str = str2;
                            it2 = it;
                            i18 = i20;
                        }
                        String str3 = str;
                        BirthdayController.BirthdayState birthdayState3 = birthdayState2;
                        int i21 = size;
                        int i22 = i18;
                        HashSet hashSet4 = hashSet2;
                        if (!arrayList7.isEmpty()) {
                            int dp4 = AndroidUtilities.dp(f10) + i9;
                            String upperCase = str3.toUpperCase();
                            cg.g gVar5 = new cg.g(7, false);
                            gVar5.g = upperCase;
                            arrayList2.add(gVar5);
                            arrayList2.addAll(arrayList7);
                            i9 = dp4;
                        }
                        size = i21;
                        hashSet2 = hashSet4;
                        birthdayState2 = birthdayState3;
                        i10 = i22;
                    }
                    if (gVar != null && arrayList3.size() > 0 && !hashSet3.isEmpty()) {
                        String string4 = LocaleController.getString(R.string.DeselectAll);
                        u1 u1Var = new u1(1, this, arrayList3);
                        gVar.h = string4;
                        gVar.m = u1Var;
                    }
                }
            }
            gVar = null;
            ArrayList arrayList62 = this.i0;
            size = arrayList62.size();
            i9 = dp;
            i10 = 0;
            while (i10 < size) {
            }
            if (gVar != null) {
                String string42 = LocaleController.getString(R.string.DeselectAll);
                u1 u1Var2 = new u1(1, this, arrayList3);
                gVar.h = string42;
                gVar.m = u1Var2;
            }
        } else {
            ArrayList arrayList8 = this.g0;
            int size3 = arrayList8.size();
            i9 = 0;
            int i23 = 0;
            while (i23 < size3) {
                Object obj2 = arrayList8.get(i23);
                i23++;
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user3 = (TLRPC.User) tLObject;
                    i11 = size3;
                    if (!user3.bot && !UserObject.isService(user3.id)) {
                        long j13 = user3.id;
                        i9 = AndroidUtilities.dp(56.0f) + i9;
                        if (!hashSet2.contains(Long.valueOf(user3.id))) {
                            cg.g c13 = cg.g.c(user3, hashSet3.contains(Long.valueOf(j13)));
                            X(c13);
                            arrayList2.add(c13);
                            size3 = i11;
                            i12 = 3;
                        }
                    }
                    size3 = i11;
                } else {
                    i11 = size3;
                    if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (i13 == i12 && ChatObject.isChannelAndNotMegaGroup(chat)) {
                            long j14 = -chat.id;
                            i9 += AndroidUtilities.dp(56.0f);
                            if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                                boolean contains = hashSet3.contains(Long.valueOf(j14));
                                cg.g gVar6 = new cg.g(3, true);
                                gVar6.e = chat;
                                gVar6.c = null;
                                gVar6.d = null;
                                gVar6.k = contains;
                                arrayList2.add(gVar6);
                            }
                        }
                        size3 = i11;
                    }
                    size3 = i11;
                    i12 = 3;
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new cg.g(5, false));
            i9 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i9);
        cg.g gVar7 = new cg.g(-1, false);
        gVar7.l = max;
        arrayList2.add(gVar7);
        if (!z11 || (hVar = this.l0) == null) {
            return;
        }
        if (z10) {
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
    public final void h0(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.g0(r10, r11)
            r11 = -1
            r0 = 0
            r1 = 0
            r2 = -1
            r3 = 0
        L8:
            org.telegram.ui.Components.wk0 r4 = r9.d
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof fg.p
            if (r5 == 0) goto L54
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L54
            java.util.ArrayList r7 = r9.c0
            int r8 = r7.size()
            if (r6 < r8) goto L29
            goto L54
        L29:
            if (r2 != r11) goto L2c
            r2 = r5
        L2c:
            java.lang.Object r3 = r7.get(r6)
            cg.g r3 = (cg.g) r3
            fg.p r4 = (fg.p) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            cg.h r7 = r9.l0
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
            cg.h r11 = r9.l0
            r11.q(r0, r2)
            cg.h r11 = r9.l0
            int r0 = r11.h()
            int r0 = r0 - r3
            r11.q(r3, r0)
        L68:
            r9.f0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.g3.h0(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.giftsToUserSent);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.contactsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.reloadHints);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g0(false, true);
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
    public final vk0 v(wk0 wk0Var) {
        cg.h hVar = new cg.h(getContext(), this.resourcesProvider, false);
        this.l0 = hVar;
        hVar.r = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        String str = this.v0;
        if (str != null) {
            return str;
        }
        int i9 = this.T;
        if (i9 != 0) {
            if (i9 == 1) {
                return LocaleController.getString(R.string.GiftStarsTitle);
            }
            if (i9 != 2) {
                return i9 != 4 ? LocaleController.getString(R.string.GiftTelegramPremiumTitle) : LocaleController.getString(R.string.VoipConferenceAddPeople);
            }
        }
        return LocaleController.getString(R.string.GiftTelegramPremiumOrStarsTitle);
    }
}
