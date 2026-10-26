package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m61 extends org.telegram.ui.Components.bb {
    public TLRPC.Chat X;
    public final TLRPC.User Y;
    public final org.telegram.ui.Components.h2 Z;
    public TLObject a0;
    public final FrameLayout b0;
    public final e61 c0;
    public final g61 d0;
    public final l61 e0;
    public final l61 f0;
    public final l61 g0;
    public final fi.d h0;
    public org.telegram.ui.Components.j71 i0;
    public Context j0;

    public m61(Context context, TLRPC.Chat chat, TLRPC.User user, org.telegram.ui.Components.h2 h2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(2, context, u6Var, true);
        this.K = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.X = chat;
        this.Y = user;
        this.a0 = user;
        this.Z = h2Var;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.b0 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        int dp = AndroidUtilities.dp(20.0f);
        int i10 = org.telegram.ui.ActionBar.y6.O5;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, getThemedColor(i10));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        frameLayout2.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, c02, N, null, u6Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i11 = org.telegram.ui.ActionBar.y6.P5;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, u6Var, PorterDuff.Mode.SRC_IN);
        frameLayout2.addView(imageView, org.telegram.ui.Components.gb1.h(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        e61 e61Var = new e61(context);
        this.c0 = e61Var;
        org.telegram.ui.ActionBar.f7.V(e61Var, org.telegram.ui.ActionBar.y6.R5, u6Var);
        org.telegram.ui.ActionBar.f7.E(e61Var, i11, u6Var);
        e61Var.setTextSize(1, 15.0f);
        e61Var.setSingleLine(true);
        e61Var.setBackground(null);
        e61Var.setCursorWidth(1.5f);
        e61Var.setGravity(112);
        e61Var.setClipToPadding(true);
        e61Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        e61Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        e61Var.setInputType(e61Var.getInputType() | TLObject.FLAG_19);
        e61Var.setImeOptions(33554435);
        e61Var.setTextIsSelectable(false);
        e61Var.setOnEditorActionListener(new la(this, 11));
        e61Var.addTextChangedListener(new f61(this));
        e61Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(e61Var, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        frameLayout.addView(frameLayout2, org.telegram.ui.Components.gb1.h(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f7 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, org.telegram.ui.Components.gb1.h(-1, 64.0f, 55, f7, 0.0f, f7, 0.0f));
        g61 g61Var = new g61(context);
        this.d0 = g61Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.setImageDrawable(new org.telegram.ui.Components.xj0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        g61Var.addView(y9Var, org.telegram.ui.Components.gb1.i(130, 130, 17));
        l61 l61Var = new l61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        l61Var.e.add(new my0(this, 18));
        this.e0 = l61Var;
        l61 l61Var2 = new l61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        l61Var2.e.add(new my0(this, 18));
        this.f0 = l61Var2;
        l61 l61Var3 = new l61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        l61Var3.e.add(new my0(this, 18));
        this.g0 = l61Var3;
        org.telegram.ui.Components.mm0 mm0Var = this.d;
        int i12 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i12, 0, i12, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new m11(this, 4));
        h61 h61Var = new h61(this);
        h61Var.m = false;
        h61Var.C = false;
        h61Var.o(org.telegram.ui.Components.ds.h);
        h61Var.n(350L);
        this.d.setItemAnimator(h61Var);
        this.d.addOnLayoutChangeListener(new i61(this));
        this.d.j(new j61(this));
        this.containerView.addView(new k61(this, getContext()), org.telegram.ui.Components.gb1.i(-1, 68, 87));
        fi.d dVar = new fi.d(getContext(), u6Var, true);
        dVar.setRoundRadius(24);
        this.h0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, org.telegram.ui.Components.gb1.h(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new t21(this, 5));
        org.telegram.ui.Components.j71 j71Var = this.i0;
        if (j71Var != null) {
            j71Var.O(false);
        }
        l61Var.b();
        l61Var2.b();
    }

    public static /* synthetic */ void P(m61 m61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            m61Var.X = MessagesController.getInstance(m61Var.currentAccount).getChat(Long.valueOf(j10));
            m61Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(m61 m61Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        l61 l61Var = m61Var.g0;
        l61 l61Var2 = m61Var.f0;
        TLRPC.User user = m61Var.Y;
        l61 l61Var3 = m61Var.e0;
        if (l61Var3 != null) {
            ArrayList arrayList2 = l61Var3.d;
            if (l61Var2 == null) {
                return;
            }
            ArrayList arrayList3 = l61Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(m61Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.t61.E(3, AndroidUtilities.dp(64.0f)));
            if (l61Var != null && !TextUtils.isEmpty(l61Var.c.q)) {
                ArrayList arrayList4 = l61Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.t61 w10 = org.telegram.ui.Components.t61.w(tLObject);
                        w10.L(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(m61Var.a0));
                        arrayList.add(w10);
                    }
                }
                if (l61Var.f) {
                    arrayList.add(org.telegram.ui.Components.t61.p(29));
                    arrayList.add(org.telegram.ui.Components.t61.p(29));
                    arrayList.add(org.telegram.ui.Components.t61.p(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.t61.k(m61Var.d0));
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
                            arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(m61Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.t61 w11 = org.telegram.ui.Components.t61.w(user);
                            w11.L(DialogObject.getDialogId(user) == DialogObject.getDialogId(m61Var.a0));
                            arrayList.add(w11);
                            z10 = false;
                        }
                    }
                }
            }
            z10 = true;
            int size3 = arrayList2.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList2.get(i12);
                i12++;
                TLObject tLObject2 = (TLObject) obj3;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject2)))) {
                    if (z10) {
                        arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(m61Var.X) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.t61 w12 = org.telegram.ui.Components.t61.w(tLObject2);
                    w12.L(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(m61Var.a0));
                    arrayList.add(w12);
                }
            }
            if (l61Var3.f) {
                arrayList.add(org.telegram.ui.Components.t61.p(29));
                arrayList.add(org.telegram.ui.Components.t61.p(29));
                arrayList.add(org.telegram.ui.Components.t61.p(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(m61Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.t61 w13 = org.telegram.ui.Components.t61.w(user);
                w13.L(DialogObject.getDialogId(user) == DialogObject.getDialogId(m61Var.a0));
                arrayList.add(w13);
                z11 = false;
            }
            int size4 = arrayList3.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList3.get(i13);
                i13++;
                TLObject tLObject3 = (TLObject) obj4;
                if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject3)))) {
                    if (z11) {
                        arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(m61Var.X) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.t61 w14 = org.telegram.ui.Components.t61.w(tLObject3);
                    w14.L(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(m61Var.a0));
                    arrayList.add(w14);
                }
            }
            if (arrayList3.isEmpty() || !l61Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.t61.p(29));
            arrayList.add(org.telegram.ui.Components.t61.p(29));
            arrayList.add(org.telegram.ui.Components.t61.p(29));
        }
    }

    public static void R(final m61 m61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                org.telegram.ui.Components.h2 h2Var = m61Var.Z;
                if (h2Var != null) {
                    h2Var.run();
                }
                m61Var.dismiss();
                twoStepVerificationActivity.p0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (m61Var.j0 == null) {
            return;
        }
        final int i11 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m61Var.j0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(m61Var.X) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                e2Var.R = string;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, m61Var.X.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new af0(20, m61Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(m61Var) { // from class: org.telegram.ui.d61
                    public final /* synthetic */ m61 b;

                    {
                        this.b = m61Var;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i12) {
                        switch (i11) {
                            case 0:
                                this.b.h0.setLoading(false);
                                break;
                            case 1:
                                m61 m61Var2 = this.b;
                                m61Var2.getClass();
                                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                if (U != null) {
                                    m61Var2.dismiss();
                                    U.presentFragment(new dg1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.b.h0.setLoading(false);
                                break;
                            default:
                                this.b.h0.setLoading(false);
                                break;
                        }
                    }
                });
                alertDialog$Builder.p();
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(m61Var.currentAccount).sendRequest(new TL_account.getPassword(), new as0(m61Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.p0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.g5.g0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(m61Var.X), ChatObject.isCommunity(m61Var.X), tL_channels_editCreator);
                return;
            }
            if (m61Var.j0 != null && !AccountInstance.getInstance(m61Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                m61Var.showDialog(new tg.j0(5, m61Var.currentAccount, m61Var.j0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            m61Var.dismiss();
            U3.presentFragment(new pd1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.p0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(m61Var.j0);
        alertDialog$Builder2.a.R = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(m61Var.j0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.o(linearLayout);
        TextView textView = new TextView(m61Var.j0);
        int i12 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(m61Var.X)) {
            org.telegram.messenger.vh.o(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            org.telegram.messenger.vh.o(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.r(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(m61Var.j0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, org.telegram.ui.Components.gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(m61Var.j0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i12, null, mode);
        TextView textView2 = new TextView(m61Var.j0);
        org.telegram.ui.ActionBar.f7.V(textView2, i12, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, org.telegram.ui.Components.gb1.r(-1, -2));
            linearLayout2.addView(imageView, org.telegram.ui.Components.gb1.u(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, org.telegram.ui.Components.gb1.r(-2, -2));
            linearLayout2.addView(textView2, org.telegram.ui.Components.gb1.r(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(m61Var.j0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, org.telegram.ui.Components.gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(m61Var.j0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        org.telegram.ui.ActionBar.f7.t(imageView2, i12, null, mode);
        TextView textView3 = new TextView(m61Var.j0);
        org.telegram.ui.ActionBar.f7.V(textView3, i12, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.t.n(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, org.telegram.ui.Components.gb1.r(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, org.telegram.ui.Components.gb1.u(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, org.telegram.ui.Components.gb1.r(-2, -2));
            linearLayout3.addView(textView3, org.telegram.ui.Components.gb1.r(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i13 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.b2(m61Var) { // from class: org.telegram.ui.d61
                public final /* synthetic */ m61 b;

                {
                    this.b = m61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i122) {
                    switch (i13) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            m61 m61Var2 = this.b;
                            m61Var2.getClass();
                            org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                m61Var2.dismiss();
                                U4.presentFragment(new dg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
            final int i14 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(m61Var) { // from class: org.telegram.ui.d61
                public final /* synthetic */ m61 b;

                {
                    this.b = m61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i122) {
                    switch (i14) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            m61 m61Var2 = this.b;
                            m61Var2.getClass();
                            org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                m61Var2.dismiss();
                                U4.presentFragment(new dg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(m61Var.j0);
            org.telegram.ui.ActionBar.f7.V(textView4, i12, null);
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? i10 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, org.telegram.ui.Components.gb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i15 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2(m61Var) { // from class: org.telegram.ui.d61
                public final /* synthetic */ m61 b;

                {
                    this.b = m61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i122) {
                    switch (i15) {
                        case 0:
                            this.b.h0.setLoading(false);
                            break;
                        case 1:
                            m61 m61Var2 = this.b;
                            m61Var2.getClass();
                            org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                m61Var2.dismiss();
                                U4.presentFragment(new dg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.h0.setLoading(false);
                            break;
                        default:
                            this.b.h0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.p();
    }

    public static void S(m61 m61Var) {
        org.telegram.ui.Components.mm0 mm0Var = m61Var.d;
        float f7 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f7 = childAt.getY();
                break;
            }
            i10++;
        }
        m61Var.b0.setTranslationY(f7);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.j0 = getContext();
        }
        if (this.j0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.X)) {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.j0, this.X.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 19));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.X)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.X;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new bi.n9(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    public final void U(boolean z10) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.X) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        fi.d dVar = this.h0;
        dVar.i(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.a0), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        super.dismiss();
        this.e0.a();
        this.f0.a();
        this.g0.a();
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            fi.d dVar = this.h0;
            if (dVar != null) {
                dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.r7));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.bb
    public final org.telegram.ui.Components.lm0 v(org.telegram.ui.Components.mm0 mm0Var) {
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(mm0Var, getContext(), this.currentAccount, 0, false, new e5(this, 23), this.resourcesProvider);
        this.i0 = j71Var;
        return j71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
