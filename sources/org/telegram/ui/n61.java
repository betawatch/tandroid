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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n61 extends org.telegram.ui.Components.xa {
    public TLRPC.Chat T;
    public final TLRPC.User U;
    public final bg.f V;
    public TLObject W;
    public final FrameLayout X;
    public final f61 Y;
    public final h61 Z;
    public final m61 a0;
    public final m61 b0;
    public final m61 c0;
    public final nh.d d0;
    public org.telegram.ui.Components.k51 e0;
    public Context f0;

    public n61(Context context, TLRPC.Chat chat, TLRPC.User user, bg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, 2, c6Var);
        this.G = AndroidUtilities.dp(12.0f);
        this.smoothKeyboardAnimationEnabled = true;
        this.T = chat;
        this.U = user;
        this.W = user;
        this.V = fVar;
        UserConfig.getInstance(this.currentAccount).getCurrentUser();
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(20.0f), getThemedColor(org.telegram.ui.ActionBar.g6.O5)));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.smiles_inputsearch);
        int i10 = org.telegram.ui.ActionBar.g6.P5;
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
        frameLayout2.addView(imageView, i7.f6.d(24, 24.0f, 19, 11.0f, 0.0f, 0.0f, 0.0f));
        f61 f61Var = new f61(context);
        this.Y = f61Var;
        f61Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.R5));
        f61Var.setHintTextColor(getThemedColor(i10));
        f61Var.setTextSize(1, 15.0f);
        f61Var.setSingleLine(true);
        f61Var.setBackground(null);
        f61Var.setCursorWidth(1.5f);
        f61Var.setGravity(112);
        f61Var.setClipToPadding(true);
        f61Var.setPadding(AndroidUtilities.dp(46.0f), 0, AndroidUtilities.dp(16.0f), 0);
        f61Var.setTranslationY(-AndroidUtilities.dp(0.66f));
        f61Var.setInputType(f61Var.getInputType() | TLObject.FLAG_19);
        f61Var.setImeOptions(33554435);
        f61Var.setTextIsSelectable(false);
        f61Var.setOnEditorActionListener(new da(this, 11));
        f61Var.addTextChangedListener(new g61(this));
        f61Var.setHint(LocaleController.getString(R.string.SearchMembers));
        frameLayout2.addView(f61Var, i7.f6.e(-1, -1, 119));
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 40.0f, 23, 11.0f, 0.0f, 11.0f, 0.0f));
        ViewGroup viewGroup = this.containerView;
        int max = Math.max(0, viewGroup.indexOfChild(this.e));
        float f9 = this.backgroundPaddingLeft / AndroidUtilities.density;
        viewGroup.addView(frameLayout, max, i7.f6.d(-1, 64.0f, 55, f9, 0.0f, f9, 0.0f));
        h61 h61Var = new h61(context);
        this.Z = h61Var;
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        t9Var.setImageDrawable(new org.telegram.ui.Components.xi0(R.raw.utyan_empty, AndroidUtilities.dp(130.0f), "utyan_empty", AndroidUtilities.dp(130.0f)));
        h61Var.addView(t9Var, i7.f6.e(130, 130, 17));
        m61 m61Var = new m61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsAdmins());
        m61Var.e.add(new ky0(this, 17));
        this.a0 = m61Var;
        m61 m61Var2 = new m61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsRecent());
        m61Var2.e.add(new ky0(this, 17));
        this.b0 = m61Var2;
        m61 m61Var3 = new m61(this.currentAccount, chat.id, new TLRPC.TL_channelParticipantsSearch());
        m61Var3.e.add(new ky0(this, 17));
        this.c0 = m61Var3;
        org.telegram.ui.Components.jl0 jl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(68.0f));
        this.d.setClipToPadding(false);
        this.d.setOnItemClickListener(new d21(this, 2));
        i61 i61Var = new i61(this);
        i61Var.m = false;
        i61Var.C = false;
        i61Var.o(org.telegram.ui.Components.jr.h);
        i61Var.n(350L);
        this.d.setItemAnimator(i61Var);
        this.d.addOnLayoutChangeListener(new j61(this));
        this.d.j(new k61(this));
        this.containerView.addView(new l61(this, getContext()), i7.f6.e(-1, 68, 87));
        nh.d dVar = new nh.d(getContext(), c6Var, true);
        dVar.setRoundRadius(24);
        this.d0 = dVar;
        dVar.setColor(getThemedColor(org.telegram.ui.ActionBar.g6.r7));
        U(false);
        ViewGroup viewGroup2 = this.containerView;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 10.0f;
        viewGroup2.addView(dVar, i7.f6.d(-1, 48.0f, 87, f10, 10.0f, f10, 10.0f));
        dVar.setOnClickListener(new w21(this, 5));
        org.telegram.ui.Components.k51 k51Var = this.e0;
        if (k51Var != null) {
            k51Var.N(false);
        }
        m61Var.b();
        m61Var2.b();
    }

    public static /* synthetic */ void P(n61 n61Var, TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            n61Var.T = MessagesController.getInstance(n61Var.currentAccount).getChat(Long.valueOf(j10));
            n61Var.T(user, inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void Q(n61 n61Var, ArrayList arrayList) {
        boolean z10;
        boolean z11;
        m61 m61Var = n61Var.c0;
        m61 m61Var2 = n61Var.b0;
        TLRPC.User user = n61Var.U;
        m61 m61Var3 = n61Var.a0;
        if (m61Var3 != null) {
            ArrayList arrayList2 = m61Var3.d;
            if (m61Var2 == null) {
                return;
            }
            ArrayList arrayList3 = m61Var2.d;
            HashSet hashSet = new HashSet();
            hashSet.add(Long.valueOf(UserConfig.getInstance(n61Var.currentAccount).getClientUserId()));
            arrayList.add(org.telegram.ui.Components.w41.D(3, AndroidUtilities.dp(64.0f)));
            if (m61Var != null && !TextUtils.isEmpty(m61Var.c.q)) {
                ArrayList arrayList4 = m61Var.d;
                int size = arrayList4.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    TLObject tLObject = (TLObject) obj;
                    if (!hashSet.contains(Long.valueOf(DialogObject.getDialogId(tLObject)))) {
                        hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject)));
                        org.telegram.ui.Components.w41 v = org.telegram.ui.Components.w41.v(tLObject);
                        v.K(DialogObject.getDialogId(tLObject) == DialogObject.getDialogId(n61Var.W));
                        arrayList.add(v);
                    }
                }
                if (m61Var.f) {
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                    arrayList.add(org.telegram.ui.Components.w41.n(29));
                }
                if (arrayList.size() == 1) {
                    arrayList.add(org.telegram.ui.Components.w41.k(n61Var.Z));
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
                            arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(n61Var.T) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                            hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                            org.telegram.ui.Components.w41 v10 = org.telegram.ui.Components.w41.v(user);
                            v10.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(n61Var.W));
                            arrayList.add(v10);
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
                        arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(n61Var.T) ? R.string.ChannelAdmins : R.string.GroupAdmins)));
                        z10 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject2)));
                    org.telegram.ui.Components.w41 v11 = org.telegram.ui.Components.w41.v(tLObject2);
                    v11.K(DialogObject.getDialogId(tLObject2) == DialogObject.getDialogId(n61Var.W));
                    arrayList.add(v11);
                }
            }
            if (m61Var3.f) {
                arrayList.add(org.telegram.ui.Components.w41.n(29));
                arrayList.add(org.telegram.ui.Components.w41.n(29));
                arrayList.add(org.telegram.ui.Components.w41.n(29));
            }
            if (user == null || hashSet.contains(Long.valueOf(DialogObject.getDialogId(user)))) {
                z11 = true;
            } else {
                arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(n61Var.T) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                hashSet.add(Long.valueOf(DialogObject.getDialogId(user)));
                org.telegram.ui.Components.w41 v12 = org.telegram.ui.Components.w41.v(user);
                v12.K(DialogObject.getDialogId(user) == DialogObject.getDialogId(n61Var.W));
                arrayList.add(v12);
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
                        arrayList.add(org.telegram.ui.Components.w41.q(LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(n61Var.T) ? R.string.ChannelSubscribers2 : R.string.GroupMembers2)));
                        z11 = false;
                    }
                    hashSet.add(Long.valueOf(DialogObject.getDialogId(tLObject3)));
                    org.telegram.ui.Components.w41 v13 = org.telegram.ui.Components.w41.v(tLObject3);
                    v13.K(DialogObject.getDialogId(tLObject3) == DialogObject.getDialogId(n61Var.W));
                    arrayList.add(v13);
                }
            }
            if (arrayList3.isEmpty() || !m61Var2.f) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.w41.n(29));
            arrayList.add(org.telegram.ui.Components.w41.n(29));
            arrayList.add(org.telegram.ui.Components.w41.n(29));
        }
    }

    public static void R(final n61 n61Var, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TLRPC.User user, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                bg.f fVar = n61Var.V;
                if (fVar != null) {
                    fVar.run();
                }
                n61Var.dismiss();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (n61Var.f0 == null) {
            return;
        }
        final int i10 = 0;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n61Var.f0);
                String string = LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(n61Var.T) ? R.string.EditAdminChannelTransfer : R.string.EditAdminGroupTransfer);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText2, n61Var.T.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new kl0(18, n61Var, user));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(n61Var) { // from class: org.telegram.ui.e61
                    public final /* synthetic */ n61 b;

                    {
                        this.b = n61Var;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                        switch (i10) {
                            case 0:
                                this.b.d0.setLoading(false);
                                break;
                            case 1:
                                n61 n61Var2 = this.b;
                                n61Var2.getClass();
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    n61Var2.dismiss();
                                    U.presentFragment(new cg1(6, null));
                                    break;
                                }
                                break;
                            case 2:
                                this.b.d0.setLoading(false);
                                break;
                            default:
                                this.b.d0.setLoading(false);
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
                ConnectionsManager.getInstance(n61Var.currentAccount).sendRequest(new TL_account.getPassword(), new jr0(n61Var, twoStepVerificationActivity, user, 7), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.ui.Components.c5.h0(tL_error, U, ChatObject.isChannelAndNotMegaGroup(n61Var.T), ChatObject.isCommunity(n61Var.T), tL_channels_editCreator);
                return;
            }
            if (n61Var.f0 != null && !AccountInstance.getInstance(n61Var.currentAccount).getUserConfig().isPremium()) {
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                n61Var.showDialog(new cg.v0(5, n61Var.currentAccount, n61Var.f0, U2, null));
                return;
            }
            org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
            if (U3 == null) {
                return;
            }
            n61Var.dismiss();
            U3.presentFragment(new md1(1));
            return;
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(n61Var.f0);
        alertDialog$Builder2.a.N = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        LinearLayout linearLayout = new LinearLayout(n61Var.f0);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(n61Var.f0);
        int i11 = org.telegram.ui.ActionBar.g6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (ChatObject.isChannelAndNotMegaGroup(n61Var.T)) {
            b.p(R.string.EditChannelAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        } else {
            b.p(R.string.EditAdminTransferAlertText, new Object[]{UserObject.getFirstName(user)}, textView);
        }
        linearLayout.addView(textView, i7.f6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(n61Var.f0);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(n61Var.f0);
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(n61Var.f0);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, i7.f6.n(-1, -2));
            linearLayout2.addView(imageView, i7.f6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, i7.f6.n(-2, -2));
            linearLayout2.addView(textView2, i7.f6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(n61Var.f0);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(n61Var.f0);
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(n61Var.f0);
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.x3.r(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, i7.f6.n(-1, -2));
            linearLayout3.addView(imageView2, i7.f6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, i7.f6.n(-2, -2));
            linearLayout3.addView(textView3, i7.f6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            final int i12 = 1;
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new org.telegram.ui.ActionBar.b2(n61Var) { // from class: org.telegram.ui.e61
                public final /* synthetic */ n61 b;

                {
                    this.b = n61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i112) {
                    switch (i12) {
                        case 0:
                            this.b.d0.setLoading(false);
                            break;
                        case 1:
                            n61 n61Var2 = this.b;
                            n61Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                n61Var2.dismiss();
                                U4.presentFragment(new cg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.d0.setLoading(false);
                            break;
                        default:
                            this.b.d0.setLoading(false);
                            break;
                    }
                }
            });
            final int i13 = 2;
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2(n61Var) { // from class: org.telegram.ui.e61
                public final /* synthetic */ n61 b;

                {
                    this.b = n61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i112) {
                    switch (i13) {
                        case 0:
                            this.b.d0.setLoading(false);
                            break;
                        case 1:
                            n61 n61Var2 = this.b;
                            n61Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                n61Var2.dismiss();
                                U4.presentFragment(new cg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.d0.setLoading(false);
                            break;
                        default:
                            this.b.d0.setLoading(false);
                            break;
                    }
                }
            });
        } else {
            TextView textView4 = new TextView(n61Var.f0);
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            final int i14 = 3;
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2(n61Var) { // from class: org.telegram.ui.e61
                public final /* synthetic */ n61 b;

                {
                    this.b = n61Var;
                }

                @Override // org.telegram.ui.ActionBar.b2
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i112) {
                    switch (i14) {
                        case 0:
                            this.b.d0.setLoading(false);
                            break;
                        case 1:
                            n61 n61Var2 = this.b;
                            n61Var2.getClass();
                            org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                            if (U4 != null) {
                                n61Var2.dismiss();
                                U4.presentFragment(new cg1(6, null));
                                break;
                            }
                            break;
                        case 2:
                            this.b.d0.setLoading(false);
                            break;
                        default:
                            this.b.d0.setLoading(false);
                            break;
                    }
                }
            });
        }
        alertDialog$Builder2.o();
    }

    public static void S(n61 n61Var) {
        org.telegram.ui.Components.jl0 jl0Var = n61Var.d;
        float f9 = -AndroidUtilities.dp(64.0f);
        int i10 = 0;
        while (true) {
            if (i10 >= jl0Var.getChildCount()) {
                break;
            }
            View childAt = jl0Var.getChildAt(i10);
            if (childAt.getId() == 3) {
                f9 = childAt.getY();
                break;
            }
            i10++;
        }
        n61Var.X.setTranslationY(f9);
    }

    public final void T(TLRPC.User user, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getContext() != null) {
            this.f0 = getContext();
        }
        if (this.f0 == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.T)) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U == null) {
                return;
            }
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(this.f0, this.T.id, U, new a1.d(this, user, inputCheckPasswordSRP, twoStepVerificationActivity, 18));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.T)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.T;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = MessagesController.getInstance(this.currentAccount).getInputUser(user);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_editCreator, new eg.f0(this, inputCheckPasswordSRP, user, twoStepVerificationActivity, tL_channels_editCreator, 14));
    }

    public final void U(boolean z10) {
        int i10 = ChatObject.isChannelAndNotMegaGroup(this.T) ? R.string.LeaveChannelAndAppoint : R.string.LeaveGroupAndAppoint;
        float dp = AndroidUtilities.dp(32.0f);
        nh.d dVar = this.d0;
        dVar.g(LocaleController.formatString(i10, TextUtils.ellipsize(DialogObject.getShortTitle(this.W), dVar.getTextPaint(), Math.max(dp, ((dVar.getWidth() > 0 ? dVar.getWidth() : AndroidUtilities.displaySize.x - AndroidUtilities.dp(20.0f)) - AndroidUtilities.dp(16.0f)) - dVar.getTextPaint().measureText(LocaleController.getString(i10))), TextUtils.TruncateAt.MIDDLE)), z10, true);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        this.a0.a();
        this.b0.a();
        this.c0.a();
    }

    @Override // org.telegram.ui.Components.xa
    public final org.telegram.ui.Components.il0 v(org.telegram.ui.Components.jl0 jl0Var) {
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(jl0Var, getContext(), this.currentAccount, 0, false, new b5(this, 23), this.resourcesProvider);
        this.e0 = k51Var;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.AppointNewOwner);
    }
}
