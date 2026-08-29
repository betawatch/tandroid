package eg;

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
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jh.i3;
import jh.s7;
import jh.s9;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d20;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class w2 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public static o2 C0;
    public boolean A0;
    public int B0;
    public final int T;
    public final t2 U;
    public final r2 V;
    public final s2 W;
    public final q2 X;
    public final hp Y;
    public final ig.a Z;
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
    public fg.h l0;
    public int m0;
    public final ArrayList n0;
    public boolean o0;
    public float p0;
    public p2 q0;
    public final BirthdayController.BirthdayState r0;
    public final ag.q1 s0;
    public int t0;
    public jq u0;
    public String v0;
    public d20 w0;
    public i3 x0;
    public final HashSet y0;
    public Utilities.Callback2 z0;

    public w2(Context context, int i10, BirthdayController.BirthdayState birthdayState, int i11, c6 c6Var) {
        super(context, null, true, false, false, 1, c6Var);
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
        this.s0 = new ag.q1(this, 21);
        this.t0 = -1;
        this.y0 = new HashSet();
        this.currentAccount = i10;
        int i12 = g6.h5;
        fixNavigationBar(g6.v0(i12, c6Var));
        this.drawDoubleNavigationBar = false;
        this.T = i11;
        this.r0 = birthdayState;
        fg.h hVar = this.l0;
        if (hVar != null) {
            hVar.w = i11 == 4;
        }
        q2 q2Var = new q2(getContext(), c6Var);
        this.X = q2Var;
        q2Var.setOnCloseClickListener(new h2(this, 11));
        q2Var.setText(y());
        q2Var.setCloseImageVisible(false);
        q2Var.e.c(0.0f, false);
        this.q0 = new p2(this, 0);
        r2 r2Var = new r2(this, getContext(), c6Var);
        this.V = r2Var;
        r2Var.setBackgroundColor(getThemedColor(i12));
        r2Var.setOnSearchTextChange(new i2(this, 3));
        r2Var.b.setHintText(LocaleController.getString((!hashSet.isEmpty() || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) ? R.string.Search : R.string.GiftPremiumUsersSearchHint), false);
        s2 s2Var = new s2(this, getContext());
        this.W = s2Var;
        ViewGroup viewGroup = this.containerView;
        int i13 = this.backgroundPaddingLeft;
        viewGroup.addView(q2Var, 0, f6.f(-2.0f, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.containerView;
        int i14 = this.backgroundPaddingLeft;
        viewGroup2.addView(r2Var, f6.f(-2.0f, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.containerView;
        int i15 = this.backgroundPaddingLeft;
        viewGroup3.addView(s2Var, f6.f(1.0f, 55, i15, 0, i15, 0));
        ig.a aVar = new ig.a(getContext(), c6Var, (jl0) null);
        this.Z = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
        aVar.setBackgroundColor(g6.v0(i12, c6Var));
        if (i11 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            linearLayout.setBackground(g6.Y(getThemedColor(g6.i6), 6, 6));
            hp hpVar = new hp(context, 24, c6Var);
            this.Y = hpVar;
            hpVar.b(g6.Oh, g6.j7, g6.k7);
            hpVar.setDrawUnchecked(true);
            hpVar.a(false, false);
            hpVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(hpVar, f6.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            textView.setTextColor(getThemedColor(g6.j5));
            textView.setTextSize(1, 14.0f);
            textView.setText(LocaleController.getString(R.string.ConferenceCallWithVideo));
            linearLayout.addView(textView, f6.t(-2, -2, 16, 9, 0, 0, 0));
            h6.b(linearLayout, 0.025f, 1.5f);
            final int i16 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: eg.l2
                public final /* synthetic */ w2 b;

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
                            this.b.d0();
                            break;
                    }
                }
            });
            aVar.addView(linearLayout, f6.t(-2, -2, 17, 0, 0, 0, 8));
        }
        t2 t2Var = new t2(this, getContext(), c6Var);
        this.U = t2Var;
        if (i11 == 4) {
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        }
        final int i17 = 1;
        t2Var.setOnClickListener(new View.OnClickListener(this) { // from class: eg.l2
            public final /* synthetic */ w2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        this.b.Y.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.d0();
                        break;
                }
            }
        });
        aVar.addView(t2Var, f6.q(-1, 48, 87));
        if (i11 == 4) {
            ViewGroup viewGroup4 = this.containerView;
            int i18 = this.backgroundPaddingLeft;
            viewGroup4.addView(aVar, f6.f(-2.0f, 87, i18, 0, i18, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.a0 = frameLayout;
        ViewGroup viewGroup5 = this.containerView;
        int i19 = this.backgroundPaddingLeft;
        viewGroup5.addView(frameLayout, f6.f(300.0f, 87, i19, 0, i19, AndroidUtilities.dp(68.0f)));
        fg.h hVar2 = this.l0;
        jl0 jl0Var = this.d;
        hVar2.h = arrayList;
        hVar2.f = jl0Var;
        int i20 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i20, 0, i20, AndroidUtilities.dp(i11 != 1 ? 60.0f : 0.0f));
        this.d.j(new u2(this));
        this.d.setOnItemClickListener(new m2(this, i11, c6Var, i10));
        if (i11 == 4) {
            this.d.setOnItemLongClickListener((cl0) new n2(this, i11, 0));
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(jr.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        this.d.i(new v2(this));
        r2Var.setText("");
        r2Var.d.b(false);
        r2Var.b(false, hashSet, new h2(this, 12), null);
        q2Var.setText(y());
        ua uaVar = this.e;
        if (uaVar != null) {
            uaVar.setTitle(y());
        }
        g0(false);
        b0(false);
        c0(false);
        i0(false, true);
        if (i11 == 0 || i11 == 2) {
            q0.j(i10, null, new i2(this, 0));
        }
        if (i11 == 0 || i11 == 2) {
            s7.y(i10, false).V();
        }
    }

    public static /* synthetic */ void P(w2 w2Var, TLObject tLObject) {
        TLObject userOrChat;
        TLObject userOrChat2;
        ArrayList arrayList = w2Var.g0;
        arrayList.clear();
        w2Var.t0 = -1;
        if (tLObject instanceof TLRPC.TL_contacts_found) {
            TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
            MessagesController messagesController = MessagesController.getInstance(w2Var.currentAccount);
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
        w2Var.i0(true, true);
    }

    public static void Q(w2 w2Var, int i10, c6 c6Var, int i11, View view) {
        ig.a aVar = w2Var.Z;
        r2 r2Var = w2Var.V;
        HashSet hashSet = w2Var.d0;
        int i12 = 2;
        if (view instanceof m8) {
            if (i10 != 4) {
                c5.m(w2Var.getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new i2(w2Var, i12), new h2(w2Var, 9), false, false, w2Var.resourcesProvider).a.show();
                return;
            }
            d20 d20Var = w2Var.w0;
            if (d20Var != null) {
                d20Var.run();
                w2Var.dismiss();
                return;
            }
            return;
        }
        if (view instanceof ig.n) {
            ig.n nVar = (ig.n) view;
            TLRPC.User user = nVar.getUser();
            TLRPC.Chat chat = nVar.getChat();
            if (user == null && chat == null && i10 == 3) {
                i3 i3Var = w2Var.x0;
                if (i3Var != null) {
                    i3Var.run(-99L);
                    return;
                }
                return;
            }
            if (user == null && chat == null) {
                return;
            }
            long j10 = user != null ? user.id : -chat.id;
            if (i10 == 3) {
                i3 i3Var2 = w2Var.x0;
                if (i3Var2 != null) {
                    i3Var2.run(Long.valueOf(j10));
                    return;
                }
                return;
            }
            if (i10 == 1) {
                if (r2Var != null) {
                    AndroidUtilities.hideKeyboard(r2Var.getEditText());
                }
                s9 s9Var = new s9(w2Var.getContext(), c6Var, user, new h2(w2Var, 11));
                if (!AndroidUtilities.isTablet()) {
                    s9Var.makeAttached(w2Var.attachedFragment);
                }
                s9Var.show();
                return;
            }
            if (i10 == 0 || i10 == 2) {
                if (UserObject.areGiftsDisabled(j10)) {
                    new tc(w2Var.container, c6Var).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                    return;
                }
                ih.h2 h2Var = new ih.h2(w2Var.getContext(), i11, j10, q0.c(q0.b(1, w2Var.n0)), new i2(w2Var, true ? 1 : 0));
                BirthdayController.BirthdayState birthdayState = w2Var.r0;
                h2Var.V(birthdayState != null && birthdayState.contains(j10));
                h2Var.show();
                return;
            }
            if (i10 == 4 && hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j10));
                Utilities.Callback2 callback2 = w2Var.z0;
                if (callback2 != null) {
                    hp hpVar = w2Var.Y;
                    callback2.run(Boolean.valueOf(hpVar != null && hpVar.a.q), hashSet);
                    w2Var.z0 = null;
                }
                w2Var.dismiss();
                return;
            }
            boolean z10 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (hashSet.contains(Long.valueOf(j10))) {
                hashSet.remove(Long.valueOf(j10));
            } else {
                hashSet.add(Long.valueOf(j10));
                w2Var.j0.put(Long.valueOf(j10), user);
            }
            if (hashSet.size() == w2Var.Z() + 1) {
                hashSet.remove(Long.valueOf(j10));
                w2Var.f0();
                return;
            }
            boolean z11 = (i10 == 4 && hashSet.isEmpty()) ? false : true;
            if (z10 != z11) {
                aVar.setVisibility(0);
                aVar.animate().alpha(z11 ? 1.0f : 0.0f).translationY(z11 ? 0.0f : AndroidUtilities.dp(12.0f)).setInterpolator(jr.h).setDuration(320L).withEndAction(!z11 ? new h2(w2Var, true ? 1 : 0) : null).start();
                fg.h hVar = w2Var.l0;
                boolean z12 = !z11;
                if (hVar.x != z12) {
                    hVar.x = z12;
                    AndroidUtilities.forEachViews((RecyclerView) hVar.f, (f5.d) new fg.f(z12));
                }
            }
            w2Var.W();
            r2Var.b(true, hashSet, new h2(w2Var, i12), null);
            w2Var.i0(true, true);
            w2Var.X();
        }
    }

    public static void R(w2 w2Var, TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        FrameLayout frameLayout = w2Var.a0;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            mc Q = new tc(frameLayout, w2Var.resourcesProvider).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.PrivacyBirthdaySetDone));
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
            MessagesStorage.getInstance(w2Var.currentAccount).updateUserInfo(userFull, false);
        }
        if (tL_error == null || (str = tL_error.text) == null || !str.startsWith("FLOOD_WAIT_")) {
            j7.l1.v(R.string.UnknownError, new tc(frameLayout, w2Var.resourcesProvider), R.raw.error, 36);
        } else if (w2Var.getContext() != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w2Var.getContext(), 0, w2Var.resourcesProvider);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
            j7.l1.C(R.string.OK, alertDialog$Builder, null);
        }
    }

    public static void S(final w2 w2Var, final TLRPC.User user, View view) {
        j70 F = j70.F(w2Var.container, w2Var.resourcesProvider, (View) view.getParent());
        final int i10 = 0;
        F.c(R.drawable.profile_discuss, LocaleController.getString(R.string.SendMessage), new Runnable(w2Var) { // from class: eg.k2
            public final /* synthetic */ w2 b;

            {
                this.b = w2Var;
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
                                o2Var.presentFragment(new tn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                m2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new tn(bundle2), m2Var);
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
        final int i11 = 1;
        F.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(w2Var) { // from class: eg.k2
            public final /* synthetic */ w2 b;

            {
                this.b = w2Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        TLRPC.User user2 = user;
                        if (user2 != null) {
                            org.telegram.ui.ActionBar.o2 o2Var = this.b.n;
                            if (o2Var != null) {
                                Bundle bundle = new Bundle();
                                bundle.putLong("user_id", user2.id);
                                o2Var.presentFragment(new tn(bundle));
                                break;
                            } else {
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                m2Var.a = true;
                                if (U != null) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("user_id", user2.id);
                                    U.showAsSheet(new tn(bundle2), m2Var);
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

    public static /* synthetic */ void T(w2 w2Var, TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        TLRPC.UserFull userFull = MessagesController.getInstance(w2Var.currentAccount).getUserFull(UserConfig.getInstance(w2Var.currentAccount).getClientUserId());
        TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        ConnectionsManager.getInstance(w2Var.currentAccount).sendRequest(updatebirthday, new z(w2Var, userFull, tL_birthday2, 4), 1024);
        MessagesController.getInstance(w2Var.currentAccount).invalidateContentSettings();
        MessagesController.getInstance(w2Var.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        NotificationCenter.getInstance(w2Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        w2Var.h0(true, true);
    }

    public static void U(w2 w2Var, String str) {
        if (w2Var.t0 >= 0) {
            ConnectionsManager.getInstance(w2Var.currentAccount).cancelRequest(w2Var.t0, true);
            w2Var.t0 = -1;
        }
        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
        tL_contacts_search.q = str;
        w2Var.t0 = ConnectionsManager.getInstance(w2Var.currentAccount).sendRequest(tL_contacts_search, new ef.a(w2Var, 4));
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

    public static w2 e0(int i10, BirthdayController.BirthdayState birthdayState) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return null;
        }
        o2 o2Var = C0;
        if (o2Var != null) {
            return o2Var;
        }
        o2 o2Var2 = new o2(R.getContext(), R.getCurrentAccount(), birthdayState, i10, R.getResourceProvider());
        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(R)) {
            o2Var2.makeAttached(R);
        }
        R.showDialog(o2Var2);
        C0 = o2Var2;
        return o2Var2;
    }

    @Override // org.telegram.ui.Components.xa
    public final void C(Canvas canvas, int i10) {
        float max = Math.max(i10, AndroidUtilities.statusBarHeight - AndroidUtilities.dp(8.0f)) + AndroidUtilities.dp(8.0f);
        q2 q2Var = this.X;
        q2Var.setTranslationY(max);
        float translationY = q2Var.getTranslationY() + q2Var.getMeasuredHeight();
        r2 r2Var = this.V;
        r2Var.setTranslationY(translationY);
        float translationY2 = r2Var.getTranslationY() + r2Var.getMeasuredHeight();
        this.W.setTranslationY(translationY2);
        this.d.setTranslationY((r2.getMeasuredHeight() + (r2Var.getMeasuredHeight() + q2Var.getMeasuredHeight())) - AndroidUtilities.dp(8.0f));
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
                if (j10 != 0 && !this.y0.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.d0;
                    hashSet.contains(valueOf);
                    i10 += AndroidUtilities.dp(56.0f);
                    fg.g c3 = fg.g.c(user, hashSet.contains(Long.valueOf(user.id)));
                    Y(c3);
                    arrayList3.add(c3);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i10;
        }
        int dp = AndroidUtilities.dp(32.0f) + i10;
        arrayList.add(fg.g.b(str));
        arrayList.addAll(arrayList3);
        return dp;
    }

    public final void W() {
        int i10;
        if (!this.d0.isEmpty() || (i10 = this.T) == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            if (this.o0) {
                return;
            }
            this.o0 = true;
            AndroidUtilities.runOnUIThread(new h2(this, 3), 10L);
            return;
        }
        if (this.o0) {
            this.o0 = false;
            AndroidUtilities.runOnUIThread(new h2(this, 4), 10L);
        }
    }

    public final void X() {
        if (TextUtils.isEmpty(this.k0)) {
            return;
        }
        this.k0 = null;
        this.V.setText("");
        AndroidUtilities.cancelRunOnUIThread(this.s0);
        h0(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [eg.j2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eg.j2] */
    public final fg.g Y(fg.g gVar) {
        int i10 = this.T;
        if (i10 != 4) {
            gVar.n = i10 == 3 ? null : new ag.n(6, this, gVar.c);
            return gVar;
        }
        TLRPC.User user = gVar.c;
        if (user == null) {
            return gVar;
        }
        final long j10 = user.id;
        final int i11 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: eg.j2
            public final /* synthetic */ w2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        w2 w2Var = this.b;
                        HashSet hashSet = w2Var.d0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = w2Var.z0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            w2Var.z0 = null;
                        }
                        w2Var.dismiss();
                        break;
                    default:
                        w2 w2Var2 = this.b;
                        HashSet hashSet2 = w2Var2.d0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback22 = w2Var2.z0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            w2Var2.z0 = null;
                        }
                        w2Var2.dismiss();
                        break;
                }
            }
        };
        final int i12 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: eg.j2
            public final /* synthetic */ w2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        w2 w2Var = this.b;
                        HashSet hashSet = w2Var.d0;
                        hashSet.add(Long.valueOf(j10));
                        Utilities.Callback2 callback2 = w2Var.z0;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE, hashSet);
                            w2Var.z0 = null;
                        }
                        w2Var.dismiss();
                        break;
                    default:
                        w2 w2Var2 = this.b;
                        HashSet hashSet2 = w2Var2.d0;
                        hashSet2.add(Long.valueOf(j10));
                        Utilities.Callback2 callback22 = w2Var2.z0;
                        if (callback22 != null) {
                            callback22.run(Boolean.TRUE, hashSet2);
                            w2Var2.z0 = null;
                        }
                        w2Var2.dismiss();
                        break;
                }
            }
        };
        gVar.o = r22;
        gVar.p = r32;
        return gVar;
    }

    public final int Z() {
        if (this.T == 4) {
            return Math.max(0, (MessagesController.getInstance(this.currentAccount).conferenceCallSizeLimit - this.y0.size()) - 1);
        }
        return 10;
    }

    public final void b0(boolean z10) {
        ArrayList arrayList = this.e0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(ContactsController.getInstance(this.currentAccount).contacts);
            this.h0.putAll(ContactsController.getInstance(this.currentAccount).usersSectionsDict);
            this.i0.addAll(ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void c0(boolean z10) {
        ArrayList arrayList = this.f0;
        if (arrayList.isEmpty()) {
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).hints);
            if (z10) {
                h0(true, true);
            }
        }
    }

    public final void d0() {
        HashSet hashSet = this.d0;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.n0;
            boolean isEmpty = arrayList.isEmpty();
            int i10 = this.T;
            if (!isEmpty || i10 == 0 || i10 == 2 || i10 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.j0.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                AndroidUtilities.hideKeyboard(this.V.getEditText());
                if (i10 == 1) {
                    return;
                }
                if (i10 == 4) {
                    Utilities.Callback2 callback2 = this.z0;
                    if (callback2 != null) {
                        hp hpVar = this.Y;
                        callback2.run(Boolean.valueOf(hpVar != null && hpVar.a.q), hashSet);
                        this.z0 = null;
                    }
                    dismiss();
                    return;
                }
                List c3 = q0.c(q0.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j10 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (UserObject.areGiftsDisabled(j10)) {
                        new tc(this.container, this.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    ih.h2 h2Var = new ih.h2(getContext(), this.currentAccount, j10, c3, new i2(this, r5 ? 1 : 0));
                    BirthdayController.BirthdayState birthdayState = this.r0;
                    h2Var.V(birthdayState != null && birthdayState.contains(j10));
                    h2Var.show();
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
            AndroidUtilities.runOnUIThread(new h2(this, 0));
        } else if (i10 == NotificationCenter.reloadHints) {
            AndroidUtilities.runOnUIThread(new h2(this, 6));
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            AndroidUtilities.runOnUIThread(new h2(this, 10));
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

    public final void f0() {
        new tc(this.container, this.resourcesProvider).Q(R.raw.chats_infotip, 36, this.T == 4 ? LocaleController.formatPluralStringComma("UserSelectorLimit", Z()) : LocaleController.getString(R.string.BoostingSelectUpToWarningUsers)).k(true);
        try {
            this.container.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void g0(boolean z10) {
        t2 t2Var = this.U;
        t2Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i10 = this.T;
        HashSet hashSet = this.d0;
        if (i10 == 4) {
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
        t2Var.c(hashSet.size(), true);
        t2Var.g(spannableStringBuilder, z10, false);
        t2Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(boolean z10, boolean z11) {
        int dp;
        TLRPC.User currentUser;
        float f9;
        long j10;
        fg.g gVar;
        int size;
        int i10;
        int i11;
        HashSet hashSet;
        Iterator it;
        BirthdayController.BirthdayState birthdayState;
        fg.h hVar;
        int i12;
        ArrayList arrayList = this.b0;
        arrayList.clear();
        ArrayList arrayList2 = this.c0;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.k0);
        HashSet hashSet2 = this.y0;
        int i13 = 3;
        int i14 = this.T;
        HashSet hashSet3 = this.d0;
        if (isEmpty) {
            if (this.A0 && i14 == 3) {
                if (this.u0 == null) {
                    jq jqVar = new jq(g6.K(AndroidUtilities.dp(46.0f), g6.v0(g6.Oh, this.resourcesProvider)), getContext().getResources().getDrawable(R.drawable.mini_gram_72).mutate());
                    int dp2 = AndroidUtilities.dp(24.0f);
                    int dp3 = AndroidUtilities.dp(24.0f);
                    jqVar.e = dp2;
                    jqVar.f = dp3;
                    this.u0 = jqVar;
                }
                jq jqVar2 = this.u0;
                String string = LocaleController.getString(R.string.Gift2ExportTONTitle);
                int i15 = this.B0;
                String formatPluralString = i15 > 0 ? LocaleController.formatPluralString("Gift2ExportTONUnlocksIn", i15, new Object[0]) : "";
                fg.g gVar2 = new fg.g(3, true);
                gVar2.i = 2;
                gVar2.r = jqVar2;
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
                fg.g gVar3 = new fg.g(9, false);
                gVar3.i = 1;
                gVar3.j = i16;
                gVar3.g = string2;
                arrayList2.add(gVar3);
            } else {
                dp = 0;
            }
            if (this.w0 != null && i14 == 4) {
                int i17 = R.drawable.msg2_link2;
                String string3 = LocaleController.getString(R.string.VoipConferenceShareLink);
                fg.g gVar4 = new fg.g(9, false);
                gVar4.i = 3;
                gVar4.j = i17;
                gVar4.g = string3;
                arrayList2.add(gVar4);
            }
            BirthdayController.BirthdayState birthdayState2 = this.r0;
            if (birthdayState2 != null) {
                dp = V(LocaleController.getString(R.string.BirthdayYesterday), arrayList2, birthdayState2.yesterday) + V(LocaleController.getString(R.string.BirthdayToday), arrayList2, birthdayState2.today) + dp + V(LocaleController.getString(R.string.BirthdayTomorrow), arrayList2, birthdayState2.tomorrow);
            }
            if ((i14 == 0 || i14 == 2) && (currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser()) != null) {
                arrayList2.add(fg.g.b(LocaleController.getString(R.string.Gift2MyselfSection)));
                fg.g c3 = fg.g.c(currentUser, hashSet3.contains(Long.valueOf(currentUser.id)));
                c3.h = LocaleController.getString(R.string.Gift2Myself);
                arrayList2.add(c3);
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.f0;
            if (arrayList4.isEmpty()) {
                f9 = 32.0f;
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
                                fg.g c6 = fg.g.c(user, hashSet3.contains(Long.valueOf(user.id)));
                                Y(c6);
                                arrayList5.add(c6);
                            }
                        }
                    }
                }
                f9 = 32.0f;
                j10 = 0;
                if (!arrayList5.isEmpty()) {
                    dp += AndroidUtilities.dp(32.0f);
                    gVar = fg.g.b(LocaleController.getString(R.string.GiftPremiumFrequentContacts));
                    arrayList2.add(gVar);
                    arrayList2.addAll(arrayList5);
                    ArrayList arrayList6 = this.i0;
                    size = arrayList6.size();
                    i10 = dp;
                    i11 = 0;
                    while (i11 < size) {
                        int i19 = i11 + 1;
                        String str = (String) arrayList6.get(i11);
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it2 = ((List) this.h0.get(str)).iterator();
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
                                        fg.g c10 = fg.g.c(user2, hashSet3.contains(Long.valueOf(user2.id)));
                                        Y(c10);
                                        arrayList7.add(c10);
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
                            int dp4 = AndroidUtilities.dp(f9) + i10;
                            String upperCase = str3.toUpperCase();
                            fg.g gVar5 = new fg.g(7, false);
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
                        ag.n nVar = new ag.n(5, this, arrayList3);
                        gVar.h = string4;
                        gVar.m = nVar;
                    }
                }
            }
            gVar = null;
            ArrayList arrayList62 = this.i0;
            size = arrayList62.size();
            i10 = dp;
            i11 = 0;
            while (i11 < size) {
            }
            if (gVar != null) {
                String string42 = LocaleController.getString(R.string.DeselectAll);
                ag.n nVar2 = new ag.n(5, this, arrayList3);
                gVar.h = string42;
                gVar.m = nVar2;
            }
        } else {
            ArrayList arrayList8 = this.g0;
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
                            fg.g c11 = fg.g.c(user3, hashSet3.contains(Long.valueOf(j13)));
                            Y(c11);
                            arrayList2.add(c11);
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
                                fg.g gVar6 = new fg.g(3, true);
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
            arrayList2.add(new fg.g(5, false));
            i10 += AndroidUtilities.dp(150.0f);
        }
        int max = Math.max(0, ((int) (AndroidUtilities.displaySize.y * 0.6f)) - i10);
        fg.g gVar7 = new fg.g(-1, false);
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
            org.telegram.ui.Components.jl0 r4 = r9.d
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof ig.n
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
            fg.g r3 = (fg.g) r3
            ig.n r4 = (ig.n) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            fg.h r7 = r9.l0
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
            fg.h r11 = r9.l0
            r11.q(r0, r2)
            fg.h r11 = r9.l0
            int r0 = r11.h()
            int r0 = r0 - r3
            r11.q(r3, r0)
        L68:
            r9.g0(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.w2.i0(boolean, boolean):void");
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

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        fg.h hVar = new fg.h(getContext(), this.resourcesProvider, false);
        this.l0 = hVar;
        hVar.r = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        String str = this.v0;
        if (str != null) {
            return str;
        }
        int i10 = this.T;
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
