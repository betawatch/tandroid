package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void b(int i10, View view) {
        boolean z10;
        gw0 gw0Var = (gw0) this.b;
        boolean[] zArr = gw0Var.w;
        if (i10 == gw0Var.o0) {
            gw0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = gw0Var.L;
            org.telegram.ui.Components.kz0 kz0Var = gw0Var.Q;
            if (kz0Var != null) {
                kz0Var.f();
            }
            if (gw0Var.I) {
                int i11 = -gw0Var.O;
                gw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == gw0Var.r0) {
                z10 = !gw0Var.G;
                gw0Var.G = z10;
            } else {
                int i12 = gw0Var.u0;
                if (i10 == i12) {
                    z10 = !gw0Var.H;
                    gw0Var.H = z10;
                } else if (i10 == gw0Var.v0) {
                    boolean z12 = !gw0Var.J;
                    gw0Var.J = z12;
                    gw0Var.r0();
                    int i13 = gw0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        gw0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        gw0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == gw0Var.s0) {
                    boolean z13 = gw0Var.K;
                    boolean z14 = !z13;
                    gw0Var.K = z14;
                    if (!z13 && gw0Var.L) {
                        int i14 = gw0Var.j0;
                        gw0Var.L = false;
                        gw0Var.r0();
                        s4.b1 K = gw0Var.c.K(gw0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.a).setChecked(false);
                        } else {
                            gw0Var.b.m(gw0Var.t0);
                        }
                        gw0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (gw0Var.N != 0) {
                        return;
                    }
                    z10 = !gw0Var.L;
                    gw0Var.L = z10;
                    int i15 = gw0Var.j0;
                    gw0Var.r0();
                    if (gw0Var.L) {
                        gw0Var.b.s(gw0Var.j0, 2);
                    } else {
                        gw0Var.b.t(i15, 2);
                    }
                    if (gw0Var.L && gw0Var.K) {
                        gw0Var.K = false;
                        s4.b1 K2 = gw0Var.c.K(gw0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.a).setChecked(false);
                        } else {
                            gw0Var.b.m(gw0Var.s0);
                        }
                    }
                    if (gw0Var.L) {
                        boolean z15 = false;
                        for (int i16 = 0; i16 < zArr.length; i16++) {
                            if (z15) {
                                zArr[i16] = false;
                            } else if (zArr[i16]) {
                                z15 = true;
                            }
                        }
                    }
                }
            }
            if (gw0Var.M && !gw0Var.L) {
                gw0Var.h.b(true);
            }
            gw0Var.c.getChildCount();
            for (int i17 = gw0Var.n0; i17 < gw0Var.n0 + gw0Var.y; i17++) {
                s4.b1 K3 = gw0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(gw0Var.L, true);
                        d6Var.r.a(zArr[i17 - gw0Var.n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == gw0Var.t0 && !gw0Var.M) {
                            gw0Var.h.f(d6Var.getCheckBox(), true);
                            gw0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            gw0Var.i0();
        }
    }

    private final void c(int i10, View view) {
        rx0 rx0Var;
        px0 px0Var = (px0) this.b;
        PremiumPreviewFragment premiumPreviewFragment = px0Var.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        mx0 mx0Var = px0Var.e;
        if (view.isEnabled() && (view instanceof sg.r1)) {
            sg.r1 r1Var = (sg.r1) view;
            premiumPreviewFragment.e = arrayList.indexOf(r1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            r1Var.c(true, true);
            for (int i11 = 0; i11 < mx0Var.getChildCount(); i11++) {
                View childAt = mx0Var.getChildAt(i11);
                if (childAt instanceof sg.r1) {
                    sg.r1 r1Var2 = (sg.r1) childAt;
                    if (r1Var2.getTier() != r1Var.getTier()) {
                        r1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < mx0Var.getHiddenChildCount(); i12++) {
                View V = mx0Var.V(i12);
                if (V instanceof sg.r1) {
                    sg.r1 r1Var3 = (sg.r1) V;
                    if (r1Var3.getTier() != r1Var.getTier()) {
                        r1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < mx0Var.getCachedChildCount(); i13++) {
                View P = mx0Var.P(i13);
                if (P instanceof sg.r1) {
                    sg.r1 r1Var4 = (sg.r1) P;
                    if (r1Var4.getTier() != r1Var.getTier()) {
                        r1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < mx0Var.getAttachedScrapChildCount(); i14++) {
                View O = mx0Var.O(i14);
                if (O instanceof sg.r1) {
                    sg.r1 r1Var5 = (sg.r1) O;
                    if (r1Var5.getTier() != r1Var.getTier()) {
                        r1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((rx0Var = premiumPreviewFragment.f) == null || rx0Var.a.months >= ((rx0) arrayList.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        my0 my0Var = (my0) this.b;
        int i11 = my0Var.y;
        if (i10 == my0Var.w) {
            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.g5.N(my0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ky0(my0Var), null).a;
            a2Var.show();
            a2Var.h();
            return;
        }
        if (i10 != my0Var.f) {
            if (i10 < my0Var.r || i10 >= my0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", my0Var.getMessagesController().blockePeers.keyAt(i10 - my0Var.r));
            my0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle h = a1.g.h("isNeverShare", true);
            if (i11 == 2) {
                h.putInt("chatAddType", 2);
            }
            j70 j70Var = new j70(h);
            j70Var.w = new jy0(my0Var);
            my0Var.presentFragment(j70Var);
            return;
        }
        sv svVar = new sv(null);
        svVar.d = new Paint();
        svVar.f = new rv[2];
        svVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        yy yyVar = new yy(bundle2);
        svVar.a = yyVar;
        yyVar.C2 = new pv(svVar);
        yyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        svVar.b = contactsActivity;
        contactsActivity.W = new pv(svVar);
        contactsActivity.onFragmentCreate();
        my0Var.presentFragment(svVar);
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        eu euVar;
        c10 c10Var;
        org.telegram.ui.Components.zc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13;
        int i14 = 7;
        int i15 = 4;
        au auVar = null;
        int i16 = 0;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                ArrayList arrayList = lVar.h;
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                int i17 = ((j) arrayList.get(i10)).d;
                if (i17 == 1) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                    boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                    globalPrivacySettings.keep_archived_unmuted = z10;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                    lVar.c = true;
                    return;
                }
                if (i17 == 4) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                    boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                    globalPrivacySettings2.keep_archived_folders = z11;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                    lVar.c = true;
                    return;
                }
                if (i17 == 7) {
                    if (lVar.getUserConfig().isPremium() || lVar.getMessagesController().autoarchiveAvailable || lVar.d.archive_and_mute_new_noncontact_peers) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.c = true;
                        return;
                    }
                    org.telegram.ui.Components.kc kcVar = new org.telegram.ui.Components.kc(lVar.getParentActivity(), lVar.getResourceProvider());
                    org.telegram.ui.Components.da0 da0Var = kcVar.b;
                    da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.g6.Gi, 0, new tu0(lVar, r9)));
                    da0Var.setSingleLine(false);
                    da0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                    kcVar.a.setImageResource(R.drawable.msg_settings_premium);
                    org.telegram.ui.Components.sc.g(lVar, kcVar, 3500).j();
                    int i18 = -lVar.e;
                    lVar.e = i18;
                    AndroidUtilities.shakeViewSpring(view, i18);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
            case 1:
                p pVar = (p) this.b;
                if (i10 < pVar.x || i10 >= pVar.y || pVar.getParentActivity() == null) {
                    return;
                }
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i10 - pVar.x);
                if (stickerSetCovered.set.id != 0) {
                    tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                    tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                } else {
                    tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                    tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                }
                TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                ty0Var.c0 = new n(pVar, view, stickerSetCovered);
                pVar.showDialog(ty0Var);
                return;
            case 2:
                q4 q4Var = (q4) this.b;
                si.a aVar = si.e.b;
                if (i10 != 1) {
                    aVar.a();
                    if (aVar.d && i10 == 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new o4(q4Var, i16));
                        q4Var.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    return;
                }
                synchronized (aVar) {
                    if (!aVar.b) {
                        SharedPreferences sharedPreferences = si.d.a;
                        aVar.c = sharedPreferences.contains("audio_recorder_v2_enabled");
                        aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                        aVar.b = true;
                    }
                    boolean z13 = !aVar.d;
                    aVar.d = z13;
                    aVar.c = true;
                    aVar.b = true;
                    si.d.a.edit().putBoolean("audio_recorder_v2_enabled", z13).apply();
                }
                q4Var.b.l();
                return;
            case 3:
                fd fdVar = (fd) this.b;
                ArrayList arrayList2 = fdVar.c;
                kc1 kc1Var = fdVar.d;
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList2.get(i10);
                fdVar.a(ypVar.a(), true);
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + kc1Var.getPaddingLeft()) {
                    kc1Var.v0(-((AndroidUtilities.dp(48.0f) + kc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                } else if (view.getWidth() + view.getLeft() > (kc1Var.getMeasuredWidth() - kc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    kc1Var.v0(org.telegram.messenger.q.C(48.0f, kc1Var.getMeasuredWidth() - kc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                }
                Utilities.Callback callback = fdVar.r;
                if (callback != null) {
                    callback.run(ypVar.a());
                    return;
                }
                return;
            case 4:
                aq aqVar = (aq) this.b;
                boolean z14 = aqVar.s;
                if (aqVar.getParentActivity() == null) {
                    return;
                }
                s4.g0 adapter = aqVar.b.getAdapter();
                zp zpVar = aqVar.e;
                if (adapter == zpVar) {
                    chat = (TLRPC.Chat) zpVar.d.get(i10);
                } else {
                    int i19 = aqVar.G;
                    chat = (i10 < i19 || i10 >= aqVar.H) ? null : (TLRPC.Chat) aqVar.v.get(i10 - i19);
                }
                if (chat != null) {
                    if (z14 && aqVar.h.linked_chat_id == 0) {
                        aqVar.a0(chat, true);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    aqVar.presentFragment(new fo(bundle));
                    return;
                }
                if (i10 == aqVar.F) {
                    if (z14 && aqVar.h.linked_chat_id == 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLongArray("result", new long[]{aqVar.getUserConfig().getClientUserId()});
                        bundle2.putInt("chatType", 4);
                        TLRPC.Chat chat2 = aqVar.f;
                        if (chat2 != null) {
                            bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                        }
                        p70 p70Var = new p70(bundle2);
                        p70Var.Y = new sp(aqVar);
                        aqVar.presentFragment(p70Var);
                        return;
                    }
                    if (aqVar.v.isEmpty()) {
                        return;
                    }
                    TLRPC.Chat chat3 = (TLRPC.Chat) aqVar.v.get(0);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(aqVar.getParentActivity());
                    if (z14) {
                        string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                        formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                    } else {
                        string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                        formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                    }
                    alertDialog$Builder2.a.R = string;
                    alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(formatString);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new b1(aqVar, 22));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.a;
                    aqVar.showDialog(a2Var);
                    TextView textView = (TextView) a2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                hq hqVar = (hq) this.b;
                ArrayList arrayList3 = hqVar.r;
                boolean z15 = hqVar.G;
                if (i10 <= (z15 ? 1 : 2)) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z15 ? 2 : 3));
                boolean contains = hqVar.d.contains(tL_availableReaction.reaction);
                boolean z16 = !contains;
                if (contains) {
                    hqVar.d.remove(tL_availableReaction.reaction);
                    if (hqVar.d.isEmpty()) {
                        gq gqVar = hqVar.h;
                        if (gqVar != null) {
                            gqVar.t(hqVar.G ? 1 : 2, arrayList3.size() + 1);
                        }
                        hqVar.V(2, true);
                    }
                } else {
                    hqVar.d.add(tL_availableReaction.reaction);
                }
                Switch r22 = yVar.c;
                if (r22 != null) {
                    r22.c(z16, true);
                }
                org.telegram.ui.Components.aq aqVar2 = yVar.d;
                if (aqVar2 != null) {
                    aqVar2.a(z16, true);
                    return;
                }
                return;
            case 6:
                tt ttVar = (tt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((wt) view).d;
                xt xtVar = ttVar.a;
                ah.t0 reactionsWindow = xtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.yy0.c(null, xtVar.c0, xtVar.z.getContext(), new f5(ttVar, 9));
                    return;
                }
                vt vtVar = xtVar.l;
                if (vtVar != null) {
                    vtVar.w(stickerSetCovered2.set, TextUtils.join("", xtVar.o));
                }
                xtVar.p();
                return;
            case 7:
                fu fuVar = (fu) this.b;
                if (fuVar.f && fuVar.e) {
                    du duVar = fuVar.d;
                    ArrayList arrayList4 = duVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        auVar = (au) duVar.e.get(i10);
                    }
                } else {
                    int S = fuVar.c.S(i10);
                    int Q = fuVar.c.Q(i10);
                    if (Q < 0 || S < 0) {
                        return;
                    } else {
                        auVar = fuVar.c.O(S, Q);
                    }
                }
                if (i10 < 0) {
                    return;
                }
                fuVar.finishFragment();
                if (auVar == null || (euVar = fuVar.r) == null) {
                    return;
                }
                euVar.a1(auVar);
                return;
            case 8:
                av avVar = (av) this.b;
                ArrayList arrayList5 = avVar.a3;
                ev evVar = avVar.m3;
                if ((view instanceof tu) && i10 >= 0 && i10 < arrayList5.size()) {
                    vu vuVar = (vu) arrayList5.get(i10);
                    if (vuVar != null) {
                        int i20 = vuVar.h;
                        if (i20 >= 0) {
                            avVar.g3[i20] = !r3[i20];
                            avVar.B1(true);
                            return;
                        } else {
                            if (i20 == -2) {
                                evVar.presentFragment(new DataAutoDownloadActivity(avVar.W2 - 1));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(evVar.getParentActivity());
                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new wu(avVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder3.a;
                    evVar.showDialog(a2Var2);
                    TextView textView2 = (TextView) a2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                h00.V((h00) this.b, view, i10);
                return;
            case 10:
                l10 l10Var = (l10) this.b;
                if (l10Var.getParentActivity() == null || (c10Var = (c10) l10Var.P.get(i10)) == null) {
                    return;
                }
                View.OnClickListener onClickListener = c10Var.c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                int i21 = c10Var.a;
                boolean z17 = true;
                if (i21 == 1) {
                    org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                    l10Var.v0(c10Var, xaVar.getName(), xaVar.getCurrentObject(), c10Var.g);
                    return;
                }
                if (i21 == 7) {
                    o00 o00Var = new o00(i16, l10Var, c10Var);
                    if (l10Var.c.isEnabled()) {
                        l10Var.s0(o00Var, false);
                        return;
                    } else {
                        o00Var.run();
                        return;
                    }
                }
                if (i21 == 8 || (i21 == 4 && c10Var.k == R.drawable.msg2_link2)) {
                    MessagesController.DialogFilter dialogFilter = l10Var.r;
                    org.telegram.ui.ActionBar.c6 c6Var = null;
                    if (l10Var.s && l10Var.c.getAlpha() > 0.0f) {
                        float f7 = -l10Var.Q;
                        l10Var.Q = f7;
                        AndroidUtilities.shakeViewSpring(view, f7);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        l10Var.v = true;
                        nj njVar = l10Var.R;
                        if (njVar == null || njVar.getVisibility() != 0) {
                            nj njVar2 = new nj(6, 2, l10Var.getParentActivity(), c6Var, z17);
                            l10Var.R = njVar2;
                            njVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                            l10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                            l10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            l10Var.getParentLayout().getOverlayContainerView().addView(l10Var.R, marginLayoutParams);
                            l10Var.R.f(l10Var.c, true);
                            return;
                        }
                        return;
                    }
                    if (!(TextUtils.isEmpty(l10Var.w) && TextUtils.isEmpty(dialogFilter.name)) && (l10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && l10Var.G.isEmpty() && !l10Var.F.isEmpty()) {
                        l10Var.s0(new l00(l10Var, 1), false);
                        return;
                    }
                    float f10 = -l10Var.Q;
                    l10Var.Q = f10;
                    AndroidUtilities.shakeViewSpring(view, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (TextUtils.isEmpty(l10Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                        a02 = org.telegram.ui.Components.zc.a0(l10Var);
                        i11 = R.string.FilterInviteErrorEmptyName;
                    } else if ((l10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                        if (l10Var.G.isEmpty()) {
                            a02 = org.telegram.ui.Components.zc.a0(l10Var);
                            i11 = R.string.FilterInviteErrorTypes;
                        } else {
                            a02 = org.telegram.ui.Components.zc.a0(l10Var);
                            i11 = R.string.FilterInviteErrorTypesExcluded;
                        }
                    } else if (l10Var.F.isEmpty()) {
                        a02 = org.telegram.ui.Components.zc.a0(l10Var);
                        i11 = R.string.FilterInviteErrorEmpty;
                    } else {
                        a02 = org.telegram.ui.Components.zc.a0(l10Var);
                        i11 = R.string.FilterInviteErrorExcluded;
                    }
                    org.telegram.messenger.yh.p(i11, a02, null);
                    return;
                }
                return;
            case 11:
                x00 x00Var = (x00) this.b;
                ArrayList arrayList6 = x00Var.d0;
                int i22 = i10 - 1;
                if (i22 < 0 || i22 >= arrayList6.size()) {
                    return;
                }
                c10 c10Var2 = (c10) arrayList6.get(i22);
                int i23 = c10Var2.a;
                if (i23 == 7) {
                    x00Var.dismiss();
                    x00Var.n.presentFragment(new h00(x00Var.X, c10Var2.m));
                    return;
                } else {
                    if (i23 == 8) {
                        x00Var.R();
                        return;
                    }
                    return;
                }
            case 12:
                c20 c20Var = (c20) this.b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    c20Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.n7) {
                    c20Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.j7) {
                    c20Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    c20Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else {
                    if (view instanceof org.telegram.ui.Cells.s2) {
                        c20Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                        return;
                    }
                    return;
                }
            case 13:
                s70 s70Var = (s70) this.b;
                if (s70Var.getParentActivity() == null) {
                    return;
                }
                if (i10 == s70Var.n || i10 == 0) {
                    if (s70Var.f == null) {
                        return;
                    }
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", s70Var.f.link));
                        org.telegram.ui.Components.zc.j(s70Var).j();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (i10 != s70Var.s) {
                    if (i10 == s70Var.r) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(s70Var.getParentActivity());
                        alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new mu(s70Var, 12));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        s70Var.showDialog(alertDialog$Builder4.a);
                        return;
                    }
                    return;
                }
                if (s70Var.f == null) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", s70Var.f.link);
                    s70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 14:
                y70.U((y70) this.b, view, i10);
                return;
            case 15:
                p80.U((p80) this.b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                return;
            case 17:
                nd0 nd0Var = (nd0) this.b;
                nd0Var.i0 = -1L;
                int i24 = nd0Var.G0;
                if (i24 == 4) {
                    if (i10 != 1 || (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) nd0Var.T.J(i10)) == null) {
                        return;
                    }
                    if (nd0Var.e0 == 0) {
                        nd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        nd0Var.finishFragment();
                        return;
                    }
                    org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(nd0Var.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                    tL_channels_editLocation.address = tL_messageMediaVenue.address;
                    tL_channels_editLocation.channel = nd0Var.getMessagesController().getInputChannel(-nd0Var.e0);
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                    TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                    tL_inputGeoPoint.lat = geoPoint.lat;
                    tL_inputGeoPoint._long = geoPoint._long;
                    a2VarArr[0].setOnCancelListener(new ga(nd0Var, nd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new fa(nd0Var, a2VarArr, tL_messageMediaVenue, 19)), i14));
                    nd0Var.showDialog(a2VarArr[0]);
                    return;
                }
                if (i24 == 5) {
                    IMapsProvider.IMap iMap = nd0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = nd0Var.z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), nd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i10 == 1 && (messageObject = nd0Var.B0) != null && (!messageObject.isLiveLocation() || i24 == 6)) {
                    IMapsProvider.IMap iMap2 = nd0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = nd0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), nd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i10 == 1 && i24 != 2) {
                    if (nd0Var.F0 == null || nd0Var.x0 == null) {
                        return;
                    }
                    FrameLayout frameLayout = nd0Var.o0;
                    if (frameLayout != null) {
                        frameLayout.callOnClick();
                        return;
                    }
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(nd0Var.x0.getLatitude());
                    tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(nd0Var.x0.getLongitude());
                    nd0Var.F0.b(tL_messageMediaGeo, nd0Var.G0, true, 0, 0L);
                    nd0Var.finishFragment();
                    return;
                }
                if (i24 == 2 && nd0Var.getLocationController().isSharingLocation(nd0Var.e0) && nd0Var.T.j(i10) == 7) {
                    nd0Var.getLocationController().removeSharingLocation(nd0Var.e0);
                    nd0Var.T.l();
                    nd0Var.finishFragment();
                    return;
                }
                if (i24 == 2 && nd0Var.getLocationController().isSharingLocation(nd0Var.e0) && nd0Var.T.j(i10) == 6) {
                    nd0Var.r0(nd0Var.getLocationController().getSharingLocationInfo(nd0Var.e0).period != Integer.MAX_VALUE);
                    return;
                }
                if ((i10 == 2 && i24 == 1) || ((i10 == 1 && i24 == 2) || (i10 == 3 && i24 == 3))) {
                    if (!nd0Var.getLocationController().isSharingLocation(nd0Var.e0)) {
                        nd0Var.r0(false);
                        return;
                    }
                    nd0Var.getLocationController().removeSharingLocation(nd0Var.e0);
                    nd0Var.T.l();
                    nd0Var.finishFragment();
                    return;
                }
                Object J = nd0Var.T.J(i10);
                if (J instanceof TLRPC.TL_messageMediaVenue) {
                    nd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, nd0Var.G0, true, 0, 0L);
                    nd0Var.finishFragment();
                    return;
                } else {
                    if (J instanceof hd0) {
                        hd0 hd0Var = (hd0) J;
                        nd0Var.i0 = hd0Var.a;
                        if (nd0Var.j0) {
                            nd0Var.j0 = false;
                            nd0Var.B0();
                        }
                        nd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(hd0Var.e.getPosition(), nd0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
            case 18:
                ((hj0) this.b).onBackPressed();
                return;
            case 19:
                qj0 qj0Var = (qj0) this.b;
                int i25 = qj0Var.I;
                if (i10 < i25 || i10 >= qj0Var.J) {
                    return;
                }
                MessageObject messageObject2 = (MessageObject) qj0Var.x.get(i10 - i25);
                if (messageObject2.isStory()) {
                    if (qj0Var.a0(messageObject2)) {
                        return;
                    }
                    qj0Var.getOrCreateStoryViewer().F(qj0Var.getParentActivity(), messageObject2.storyItem, bi.g9.a(qj0Var.f));
                    return;
                }
                long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
                Bundle bundle3 = new Bundle();
                if (DialogObject.isUserDialog(dialogId)) {
                    bundle3.putLong("user_id", dialogId);
                } else {
                    bundle3.putLong("chat_id", -dialogId);
                }
                bundle3.putInt("message_id", messageObject2.getId());
                bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                if (qj0Var.getMessagesController().checkCanOpenChat(bundle3, qj0Var)) {
                    qj0Var.presentFragment(new fo(bundle3));
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                return;
            case 21:
                fq0 fq0Var = (fq0) this.b;
                fq0Var.a(i10, true);
                sp0 sp0Var = fq0Var.h;
                if (sp0Var != null) {
                    sp0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                hr0 hr0Var = (hr0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = hr0Var.f;
                ArrayList arrayList8 = hr0Var.n;
                MediaController.AlbumEntry albumEntry = hr0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        lr0 lr0Var = hr0Var.t0;
                        if (lr0Var == null) {
                            hr0Var.P.getSearchField().setText(str);
                            hr0Var.P.getSearchField().setSelection(str.length());
                            hr0Var.b0(hr0Var.P.getSearchField());
                            return;
                        } else {
                            switch (lr0Var.a) {
                                case 0:
                                    mr0.h0(lr0Var.b, str);
                                    return;
                                default:
                                    mr0.h0(lr0Var.b, str);
                                    return;
                            }
                        }
                    }
                    if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(hr0Var.getParentActivity());
                        alertDialog$Builder5.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new uq0(hr0Var, i15));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder5.a;
                        hr0Var.showDialog(a2Var3);
                        TextView textView3 = (TextView) a2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (albumEntry != null) {
                    arrayList7 = albumEntry.photos;
                }
                if (i10 < 0 || i10 >= arrayList7.size()) {
                    return;
                }
                org.telegram.ui.ActionBar.u0 u0Var = hr0Var.P;
                if (u0Var != null) {
                    AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                }
                if (hr0Var.Y) {
                    hr0Var.a0(view, arrayList7.get(i10));
                    return;
                }
                int i26 = hr0Var.T;
                if (i26 == 1 || i26 == 3) {
                    i12 = 1;
                } else {
                    if (i26 != 2) {
                        r9 = 10;
                        if (i26 != 10) {
                            i12 = hr0Var.U == null ? 4 : 0;
                        }
                    }
                    i12 = r9;
                }
                PhotoViewer.t1().K2(null, hr0Var, null);
                PhotoViewer t12 = PhotoViewer.t1();
                int i27 = hr0Var.H;
                boolean z18 = hr0Var.I;
                t12.h = i27;
                t12.n = z18;
                PhotoViewer.t1().g2(arrayList7, i10, i12, hr0Var.l0, hr0Var.x0, hr0Var.U);
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i13 = photoViewer.P4) >= 0 && i13 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.k5 = false;
                return;
            case 24:
                b(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.b, view, i10);
                return;
            case 26:
                c(i10, view);
                return;
            case 27:
                PrivacyControlActivity.X((PrivacyControlActivity) this.b, view, i10);
                return;
            case 28:
                d(i10, view);
                return;
            default:
                ProfileActivity.f0((ProfileActivity) this.b, i10);
                return;
        }
    }
}
