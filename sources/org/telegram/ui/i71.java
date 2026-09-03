package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i71 extends org.telegram.ui.Components.sa {
    public TLRPC.Chat U;
    public final TLRPC.User V;
    public final ah.b W;
    public TLObject X;
    public final FrameLayout Y;
    public final a71 Z;
    public final c71 a0;
    public final h71 b0;
    public final h71 c0;
    public final h71 d0;
    public final ph.d e0;
    public org.telegram.ui.Components.w51 f0;
    public Context g0;

    public i71(Context context, TLRPC.Chat chat, TLRPC.User user, ah.b bVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, true, false, false, 2, f6Var);
        this.H = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.U = chat;
        this.V = user;
        this.X = user;
        this.W = bVar;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.j6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.j6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, k7.b6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        a71 a71Var = new a71(context);
        this.Z = a71Var;
        a71Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.R5));
        a71Var.setHintTextColor(getThemedColor(i10));
        a71Var.setTextSize(1, 15.0f);
        a71Var.setSingleLine(true);
        a71Var.setBackground(null);
        a71Var.setCursorWidth(1.5f);
        a71Var.setGravity(112);
        a71Var.setClipToPadding(true);
        a71Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        a71Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        a71Var.setInputType(a71Var.getInputType() | TLObject.FLAG_19);
        a71Var.setImeOptions(33554435);
        a71Var.setTextIsSelectable(false);
        a71Var.setOnEditorActionListener(new ja(this, 11));
        a71Var.addTextChangedListener(new b71(this));
        a71Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(a71Var, k7.b6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, k7.b6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f10 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, k7.b6.d(-1, 64.0f, 55, f10, 0.0f, f10, 0.0f));
        c71 c71Var = new c71(context);
        this.a0 = c71Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setImageDrawable(new org.telegram.ui.Components.gj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        c71Var.addView(p9Var, k7.b6.e(130, 130, 17));
        h71 h71Var = new h71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        h71Var.e.add(new sz0(this, 15));
        this.b0 = h71Var;
        h71 h71Var2 = new h71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        h71Var2.e.add(new sz0(this, 15));
        this.c0 = h71Var2;
        h71 h71Var3 = new h71(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        h71Var3.e.add(new sz0(this, 15));
        this.d0 = h71Var3;
        org.telegram.ui.Components.rl0 rl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new p21(this, 3));
        d71 d71Var = new d71(this);
        d71Var.m = false;
        d71Var.C = false;
        d71Var.o(org.telegram.ui.Components.mr.h);
        d71Var.n(350L);
        this.d.setItemAnimator(d71Var);
        this.d.addOnLayoutChangeListener(new e71(this));
        this.d.j(new f71(this));
        this.containerView.addView(new g71(this, getContext()), k7.b6.e(-1, 68, 87));
        ph.d dVar = new ph.d(getContext(), f6Var, true);
        dVar.setRoundRadius(24);
        this.e0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.j6.r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f11 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, k7.b6.d(-1, 48.0f, 87, f11, 10.0f, f11, 10.0f));
        dVar.setOnClickListener(new v31(this, 4));
        org.telegram.ui.Components.w51 w51Var = this.f0;
        if (w51Var != null) {
            w51Var.N(false);
        }
        h71Var.b();
        h71Var2.b();
    }

    public static /* synthetic */ void P(i71 i71Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            i71Var.U = MessagesController.getInstance(i71Var.currentAccount).getChat(Long.valueOf(j10));
            i71Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(i71 i71Var, ArrayList arrayList) {
        boolean z4;
        boolean z10;
        h71 h71Var = i71Var.d0;
        h71 h71Var2 = i71Var.c0;
        TLRPC.User user = i71Var.V;
        h71 h71Var3 = i71Var.b0;
        if (h71Var3 != null) {
            ArrayList arrayList2 = h71Var3.d;
            if (h71Var2 == null) {
                return;
            }
            ArrayList arrayList3 = h71Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(i71Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.i51.D(3, AndroidUtilities.dp(64.0f)));
            if (h71Var != null && !TextUtils.isEmpty(h71Var.c.q)) {
                ArrayList arrayList4 = h71Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.i51 v = org.telegram.ui.Components.i51.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(i71Var.X));
                        arrayList.add(v);
                    }
                }
                if (h71Var.f) {
                    arrayList.add(org.telegram.ui.Components.i51.n(29));
                    arrayList.add(org.telegram.ui.Components.i51.n(29));
                    arrayList.add(org.telegram.ui.Components.i51.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.i51.k(i71Var.a0));
                    return;
                }
                return;
            }
            if (user != null) {
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    if (DialogObject.getDialogId((TLObject) obj2) == DialogObject.getDialogId(user)) {
                        if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                            arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(i71Var.U) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.i51 v10 = org.telegram.ui.Components.i51.v(user);
                            v10.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(i71Var.X));
                            arrayList.add(v10);
                            z4 = false;
                        }
                    }
                }
            }
            z4 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj3;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                    if (z4) {
                        arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(i71Var.U) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z4 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.i51 v11 = org.telegram.ui.Components.i51.v(tLObject2);
                    v11.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(i71Var.X));
                    arrayList.add(v11);
                }
            }
            if (h71Var3.f) {
                arrayList.add(org.telegram.ui.Components.i51.n(29));
                arrayList.add(org.telegram.ui.Components.i51.n(29));
                arrayList.add(org.telegram.ui.Components.i51.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z10 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(i71Var.U) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.i51 v12 = org.telegram.ui.Components.i51.v(user);
                v12.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(i71Var.X));
                arrayList.add(v12);
                z10 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj4;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(i71Var.U) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.i51 v13 = org.telegram.ui.Components.i51.v(tLObject3);
                    v13.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(i71Var.X));
                    arrayList.add(v13);
                }
            }
            if (arrayList3.isEmpty() || !h71Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.i51.n(29));
            arrayList.add(org.telegram.ui.Components.i51.n(29));
            arrayList.add(org.telegram.ui.Components.i51.n(29));
        }
    }

    public static void R(final i71 i71Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                ah.b bVar = i71Var.W;
                if (bVar != null) {
                    bVar.run();
                }
                i71Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (i71Var.g0 == null) {
            return;
        }
        final int i10 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i71Var.g0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(i71Var.U) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, i71Var.U.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new vl0(17, i71Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(i71Var) { // from class: org.telegram.ui.y61
                    public final /* synthetic */ i71 b;

                    {
                        this.b = i71Var;
                    }

                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                        switch (i10) {
                            case 0:
                                this.b.e0.setLoading(false);
                                break;
                            case 1:
                                i71 i71Var2 = this.b;
                                i71Var2.getClass();
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    i71Var2.dismiss();
                                    U.presentFragment(new wg1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.b.e0.setLoading(false);
                                break;
                            default:
                                this.b.e0.setLoading(false);
                                break;
                        }
                    }
                });
                alertDialog$Builder.o();
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(i71Var.currentAccount).sendRequest(new TL_account.getPassword(), new yr0(i71Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.z4.h0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(i71Var.U), ChatObject.isCommunity(i71Var.U), tL_channels_editCreator);
                return;
            }
            if (i71Var.g0 != null && !AccountInstance.getInstance(i71Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                i71Var.showDialog(new eg.v0(5, i71Var.currentAccount, i71Var.g0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            i71Var.dismiss();
            U3.presentFragment(new ge1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(i71Var.g0);
        alertDialog$Builder2.a.O = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(i71Var.g0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(i71Var.g0);
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(i71Var.U)) {
            b.o(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            b.o(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, k7.b6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(i71Var.g0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(i71Var.g0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(i71Var.g0);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, k7.b6.n(-1, -2));
            linearLayout2.addView(imageView, k7.b6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, k7.b6.n(-2, -2));
            linearLayout2.addView(textView2, k7.b6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(i71Var.g0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(i71Var.g0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(i71Var.g0);
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, k7.b6.n(-1, -2));
            linearLayout3.addView(imageView2, k7.b6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, k7.b6.n(-2, -2));
            linearLayout3.addView(textView3, k7.b6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i12 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.c2(i71Var) { // from class: org.telegram.ui.y61
                public final /* synthetic */ i71 b;

                {
                    this.b = i71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i12) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            i71 i71Var2 = this.b;
                            i71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                i71Var2.dismiss();
                                U4.presentFragment(new wg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.e0.setLoading(false);
                            break;
                        default:
                            this.b.e0.setLoading(false);
                            break;
                    }
                }
            });
            final int i13 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2(i71Var) { // from class: org.telegram.ui.y61
                public final /* synthetic */ i71 b;

                {
                    this.b = i71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i13) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            i71 i71Var2 = this.b;
                            i71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                i71Var2.dismiss();
                                U4.presentFragment(new wg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.e0.setLoading(false);
                            break;
                        default:
                            this.b.e0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(i71Var.g0);
            textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, k7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i14 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2(i71Var) { // from class: org.telegram.ui.y61
                public final /* synthetic */ i71 b;

                {
                    this.b = i71Var;
                }

                @Override // org.telegram.ui.ActionBar.c2
                public final void l(org.telegram.ui.ActionBar.d2 d2Var2, int i112) {
                    switch (i14) {
                        case 0:
                            this.b.e0.setLoading(false);
                            break;
                        case 1:
                            i71 i71Var2 = this.b;
                            i71Var2.getClass();
                            org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                i71Var2.dismiss();
                                U4.presentFragment(new wg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.e0.setLoading(false);
                            break;
                        default:
                            this.b.e0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.o();
    }

    public static void S(i71 i71Var) {
        org.telegram.ui.Components.rl0 rl0Var = i71Var.d;
        float f10 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= rl0Var.getChildCount()) {
                break;
            }
            View childAt = rl0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f10 = childAt.getY();
                break;
            }
            i10++;
        }
        i71Var.Y.setTranslationY(f10);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.g0 = getContext();
        }
        if (this.g0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.U)) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.g0, this.U.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 18));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.U)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.U;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new gg.e0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 13));
    }

    public final void U(boolean z4) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.U) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        ph.d dVar = this.e0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.X), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z4, true);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        this.b0.a();
        this.c0.a();
        this.d0.a();
    }

    @Override // org.telegram.ui.Components.sa
    public final org.telegram.ui.Components.ql0 v(org.telegram.ui.Components.rl0 rl0Var) {
        org.telegram.ui.Components.w51 w51Var = new org.telegram.ui.Components.w51(rl0Var, getContext(), this.currentAccount, 0, false, new f5(this, 23), this.resourcesProvider);
        this.f0 = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
