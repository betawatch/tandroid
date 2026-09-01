package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        boolean z4;
        hv0 hv0Var = (hv0) this.b;
        boolean[] zArr = hv0Var.w;
        if (i10 == hv0Var.l0) {
            hv0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.s8) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            boolean z10 = hv0Var.I;
            org.telegram.ui.Components.ry0 ry0Var = hv0Var.N;
            if (ry0Var != null) {
                ry0Var.f();
            }
            if (hv0Var.F) {
                int i11 = -hv0Var.L;
                hv0Var.L = i11;
                AndroidUtilities.shakeViewSpring(s8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == hv0Var.o0) {
                z4 = !hv0Var.D;
                hv0Var.D = z4;
            } else {
                int i12 = hv0Var.r0;
                if (i10 == i12) {
                    z4 = !hv0Var.E;
                    hv0Var.E = z4;
                } else if (i10 == hv0Var.s0) {
                    boolean z11 = !hv0Var.G;
                    hv0Var.G = z11;
                    hv0Var.r0();
                    int i13 = hv0Var.r0;
                    if (i13 >= 0 && i12 < 0) {
                        hv0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        hv0Var.b.u(i12);
                    }
                    z4 = z11;
                } else if (i10 == hv0Var.p0) {
                    boolean z12 = hv0Var.H;
                    boolean z13 = !z12;
                    hv0Var.H = z13;
                    if (!z12 && hv0Var.I) {
                        int i14 = hv0Var.g0;
                        hv0Var.I = false;
                        hv0Var.r0();
                        f2.m1 K = hv0Var.c.K(hv0Var.q0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.s8) K.a).setChecked(false);
                        } else {
                            hv0Var.b.m(hv0Var.q0);
                        }
                        hv0Var.b.t(i14, 2);
                    }
                    z4 = z13;
                } else {
                    if (hv0Var.K != 0) {
                        return;
                    }
                    z4 = !hv0Var.I;
                    hv0Var.I = z4;
                    int i15 = hv0Var.g0;
                    hv0Var.r0();
                    if (hv0Var.I) {
                        hv0Var.b.s(hv0Var.g0, 2);
                    } else {
                        hv0Var.b.t(i15, 2);
                    }
                    if (hv0Var.I && hv0Var.H) {
                        hv0Var.H = false;
                        f2.m1 K2 = hv0Var.c.K(hv0Var.p0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.s8) K2.a).setChecked(false);
                        } else {
                            hv0Var.b.m(hv0Var.p0);
                        }
                    }
                    if (hv0Var.I) {
                        boolean z14 = false;
                        for (int i16 = 0; i16 < zArr.length; i16++) {
                            if (z14) {
                                zArr[i16] = false;
                            } else if (zArr[i16]) {
                                z14 = true;
                            }
                        }
                    }
                }
            }
            if (hv0Var.J && !hv0Var.I) {
                hv0Var.h.b(true);
            }
            hv0Var.c.getChildCount();
            for (int i17 = hv0Var.k0; i17 < hv0Var.k0 + hv0Var.y; i17++) {
                f2.m1 K3 = hv0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(hv0Var.I, true);
                        c6Var.r.a(zArr[i17 - hv0Var.k0], z10);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == hv0Var.q0 && !hv0Var.J) {
                            hv0Var.h.f(c6Var.getCheckBox(), true);
                            hv0Var.J = true;
                        }
                    }
                }
            }
            s8Var.setChecked(z4);
            hv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        sw0 sw0Var;
        qw0 qw0Var = (qw0) this.b;
        PremiumPreviewFragment premiumPreviewFragment = qw0Var.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        nw0 nw0Var = qw0Var.e;
        if (view.isEnabled() && (view instanceof fg.j2)) {
            fg.j2 j2Var = (fg.j2) view;
            premiumPreviewFragment.e = arrayList.indexOf(j2Var.getTier());
            boolean z4 = true;
            premiumPreviewFragment.t0(true);
            j2Var.c(true, true);
            for (int i11 = 0; i11 < nw0Var.getChildCount(); i11++) {
                View childAt = nw0Var.getChildAt(i11);
                if (childAt instanceof fg.j2) {
                    fg.j2 j2Var2 = (fg.j2) childAt;
                    if (j2Var2.getTier() != j2Var.getTier()) {
                        j2Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < nw0Var.getHiddenChildCount(); i12++) {
                View V = nw0Var.V(i12);
                if (V instanceof fg.j2) {
                    fg.j2 j2Var3 = (fg.j2) V;
                    if (j2Var3.getTier() != j2Var.getTier()) {
                        j2Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < nw0Var.getCachedChildCount(); i13++) {
                View P = nw0Var.P(i13);
                if (P instanceof fg.j2) {
                    fg.j2 j2Var4 = (fg.j2) P;
                    if (j2Var4.getTier() != j2Var.getTier()) {
                        j2Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < nw0Var.getAttachedScrapChildCount(); i14++) {
                View O = nw0Var.O(i14);
                if (O instanceof fg.j2) {
                    fg.j2 j2Var5 = (fg.j2) O;
                    if (j2Var5.getTier() != j2Var.getTier()) {
                        j2Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.G;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((sw0Var = premiumPreviewFragment.f) == null || sw0Var.a.months >= ((sw0) arrayList.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.m0)) {
                z4 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z4);
        }
    }

    private final void c(int i10, View view) {
        ox0 ox0Var = (ox0) this.b;
        int i11 = ox0Var.y;
        if (i10 == ox0Var.w) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(ox0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new mx0(ox0Var), null).a;
            d2Var.show();
            d2Var.h();
            return;
        }
        if (i10 != ox0Var.f) {
            if (i10 < ox0Var.r || i10 >= ox0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", ox0Var.getMessagesController().blockePeers.keyAt(i10 - ox0Var.r));
            ox0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = android.support.v4.media.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            z60 z60Var = new z60(i12);
            z60Var.w = new lx0(ox0Var);
            ox0Var.presentFragment(z60Var);
            return;
        }
        lv lvVar = new lv(null);
        lvVar.d = new Paint();
        lvVar.f = new kv[2];
        lvVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        py pyVar = new py(bundle2);
        lvVar.a = pyVar;
        pyVar.z2 = new iv(lvVar);
        pyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        lvVar.b = contactsActivity;
        contactsActivity.T = new iv(lvVar);
        contactsActivity.onFragmentCreate();
        ox0Var.presentFragment(lvVar);
    }

    @Override // org.telegram.ui.Components.jl0
    public final void f(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        yt ytVar;
        s00 s00Var;
        org.telegram.ui.Components.qc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        org.telegram.ui.Components.oq0 oq0Var;
        int i13 = 8;
        int i14 = 4;
        tt ttVar = null;
        r5 = 1;
        int i15 = 1;
        switch (this.a) {
            case 0:
                n nVar = (n) this.b;
                ArrayList arrayList = nVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i16 = ((l) arrayList.get(i10)).d;
                    if (i16 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = nVar.d;
                        boolean z4 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z4;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z4);
                        nVar.c = true;
                        break;
                    } else if (i16 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = nVar.d;
                        boolean z10 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z10;
                        ((org.telegram.ui.Cells.s8) view).setChecked(z10);
                        nVar.c = true;
                        break;
                    } else if (i16 == 7) {
                        if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable && !nVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(nVar.getParentActivity(), nVar.getResourceProvider());
                            org.telegram.ui.Components.g90 g90Var = acVar.b;
                            g90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.k6.Gi, 0, new tt0(nVar, r12)));
                            g90Var.setSingleLine(false);
                            g90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            acVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.ic.g(nVar, acVar, 3500).j();
                            int i17 = -nVar.e;
                            nVar.e = i17;
                            AndroidUtilities.shakeViewSpring(view, i17);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = nVar.d;
                            boolean z11 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z11;
                            ((org.telegram.ui.Cells.s8) view).setChecked(z11);
                            nVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                r rVar = (r) this.b;
                if (i10 >= rVar.x && i10 < rVar.y && rVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) rVar.h.get(i10 - rVar.x);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.yx0 yx0Var = new org.telegram.ui.Components.yx0(rVar.getParentActivity(), rVar, inputStickerSet, null, null, null);
                    yx0Var.Z = new p(rVar, view, stickerSetCovered);
                    rVar.showDialog(yx0Var);
                    break;
                }
                break;
            case 2:
                zc zcVar = (zc) this.b;
                ArrayList arrayList2 = zcVar.c;
                kb1 kb1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList2.get(i10);
                    zcVar.a(lpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + kb1Var.getPaddingLeft()) {
                        kb1Var.v0(-((AndroidUtilities.dp(48.0f) + kb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (kb1Var.getMeasuredWidth() - kb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        kb1Var.v0(org.telegram.messenger.y3.z(48.0f, kb1Var.getMeasuredWidth() - kb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.r;
                    if (callback != null) {
                        callback.run(lpVar.a());
                        break;
                    }
                }
                break;
            case 3:
                rp rpVar = (rp) this.b;
                boolean z12 = rpVar.s;
                if (rpVar.getParentActivity() != null) {
                    f2.p0 adapter = rpVar.b.getAdapter();
                    qp qpVar = rpVar.e;
                    if (adapter == qpVar) {
                        chat = (TLRPC.Chat) qpVar.d.get(i10);
                    } else {
                        int i18 = rpVar.D;
                        chat = (i10 < i18 || i10 >= rpVar.E) ? null : (TLRPC.Chat) rpVar.v.get(i10 - i18);
                    }
                    if (chat != null) {
                        if (!z12 || rpVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            rpVar.presentFragment(new xn(bundle));
                            break;
                        } else {
                            rpVar.a0(chat, true);
                            break;
                        }
                    } else if (i10 == rpVar.C) {
                        if (z12 && rpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{rpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = rpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            f70 f70Var = new f70(bundle2);
                            f70Var.V = new ip(rpVar);
                            rpVar.presentFragment(f70Var);
                            break;
                        } else if (!rpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) rpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rpVar.getParentActivity());
                            if (z12) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.O = string;
                            alertDialog$Builder.a.Q = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(rpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            rpVar.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                yp ypVar = (yp) this.b;
                ArrayList arrayList3 = ypVar.r;
                boolean z13 = ypVar.D;
                if (i10 > (z13 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z13 ? 2 : 3));
                    boolean contains = ypVar.d.contains(tL_availableReaction.reaction);
                    boolean z14 = !contains;
                    if (contains) {
                        ypVar.d.remove(tL_availableReaction.reaction);
                        if (ypVar.d.isEmpty()) {
                            xp xpVar = ypVar.h;
                            if (xpVar != null) {
                                xpVar.t(ypVar.D ? 1 : 2, arrayList3.size() + 1);
                            }
                            ypVar.V(2, true);
                        }
                    } else {
                        ypVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z14, true);
                    }
                    org.telegram.ui.Components.np npVar = yVar.d;
                    if (npVar != null) {
                        npVar.a(z14, true);
                        break;
                    }
                }
                break;
            case 5:
                mt mtVar = (mt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((pt) view).d;
                qt qtVar = mtVar.a;
                ng.d0 reactionsWindow = qtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ey0.c(null, qtVar.c0, qtVar.z.getContext(), new d5(mtVar, 9));
                    break;
                } else {
                    ot otVar = qtVar.l;
                    if (otVar != null) {
                        otVar.u(stickerSetCovered2.set, TextUtils.join("", qtVar.o));
                    }
                    qtVar.p();
                    break;
                }
                break;
            case 6:
                zt ztVar = (zt) this.b;
                if (ztVar.f && ztVar.e) {
                    xt xtVar = ztVar.d;
                    ArrayList arrayList4 = xtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ttVar = (tt) xtVar.e.get(i10);
                    }
                } else {
                    int S = ztVar.c.S(i10);
                    int Q = ztVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ttVar = ztVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    ztVar.finishFragment();
                    if (ttVar != null && (ytVar = ztVar.r) != null) {
                        ytVar.V0(ttVar);
                        break;
                    }
                }
                break;
            case 7:
                uu uuVar = (uu) this.b;
                ArrayList arrayList5 = uuVar.Z2;
                yu yuVar = uuVar.l3;
                if (!(view instanceof nu) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.o8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yuVar.getParentActivity());
                        alertDialog$Builder2.a.O = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.Q = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new qu(uuVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                        yuVar.showDialog(d2Var2);
                        TextView textView2 = (TextView) d2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                            break;
                        }
                    }
                } else {
                    pu puVar = (pu) arrayList5.get(i10);
                    if (puVar != null) {
                        int i19 = puVar.h;
                        if (i19 >= 0) {
                            uuVar.f3[i19] = !r3[i19];
                            uuVar.A1(true);
                            break;
                        } else if (i19 == -2) {
                            yuVar.presentFragment(new DataAutoDownloadActivity(uuVar.V2 - 1));
                            break;
                        }
                    }
                }
                break;
            case 8:
                zz.V((zz) this.b, view, i10);
                break;
            case 9:
                b10 b10Var = (b10) this.b;
                if (b10Var.getParentActivity() != null && (s00Var = (s00) b10Var.M.get(i10)) != null) {
                    View.OnClickListener onClickListener = s00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i20 = s00Var.a;
                        if (i20 == 1) {
                            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                            b10Var.v0(s00Var, vaVar.getName(), vaVar.getCurrentObject(), s00Var.g);
                            break;
                        } else if (i20 == 7) {
                            org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(25, b10Var, s00Var);
                            if (b10Var.c.isEnabled()) {
                                b10Var.s0(l41Var, false);
                                break;
                            } else {
                                l41Var.run();
                                break;
                            }
                        } else if (i20 == 8 || (i20 == 4 && s00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = b10Var.r;
                            org.telegram.ui.ActionBar.g6 g6Var = null;
                            if (!b10Var.s || b10Var.c.getAlpha() <= 0.0f) {
                                if ((!TextUtils.isEmpty(b10Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (b10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && b10Var.D.isEmpty() && !b10Var.C.isEmpty()) {
                                    b10Var.s0(new d00(b10Var, 1), false);
                                    break;
                                } else {
                                    float f10 = -b10Var.N;
                                    b10Var.N = f10;
                                    AndroidUtilities.shakeViewSpring(view, f10);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(b10Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((b10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (b10Var.D.isEmpty()) {
                                            a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (b10Var.C.isEmpty()) {
                                        a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.qc.a0(b10Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.y3.s(i11, a02, null);
                                    break;
                                }
                            } else {
                                float f11 = -b10Var.N;
                                b10Var.N = f11;
                                AndroidUtilities.shakeViewSpring(view, f11);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                b10Var.v = true;
                                ej ejVar = b10Var.O;
                                if (ejVar == null || ejVar.getVisibility() != 0) {
                                    ej ejVar2 = new ej(6, 3, b10Var.getParentActivity(), g6Var, true);
                                    b10Var.O = ejVar2;
                                    ejVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    b10Var.O.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    b10Var.O.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    b10Var.getParentLayout().getOverlayContainerView().addView(b10Var.O, marginLayoutParams);
                                    b10Var.O.f(b10Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                o00 o00Var = (o00) this.b;
                ArrayList arrayList6 = o00Var.a0;
                int i21 = i10 - 1;
                if (i21 >= 0 && i21 < arrayList6.size()) {
                    s00 s00Var2 = (s00) arrayList6.get(i21);
                    int i22 = s00Var2.a;
                    if (i22 == 7) {
                        o00Var.dismiss();
                        o00Var.n.presentFragment(new zz(o00Var.U, s00Var2.m));
                        break;
                    } else if (i22 == 8) {
                        o00Var.Q();
                        break;
                    }
                }
                break;
            case 11:
                t10 t10Var = (t10) this.b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    break;
                }
                break;
            case 12:
                h70 h70Var = (h70) this.b;
                if (h70Var.getParentActivity() != null) {
                    if (i10 == h70Var.n || i10 == 0) {
                        if (h70Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", h70Var.f.link));
                                org.telegram.ui.Components.qc.j(h70Var).j();
                                break;
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                return;
                            }
                        }
                    } else if (i10 != h70Var.s) {
                        if (i10 == h70Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h70Var.getParentActivity());
                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new gu(h70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            h70Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (h70Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", h70Var.f.link);
                            h70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            case 13:
                n70.U((n70) this.b, view, i10);
                break;
            case 14:
                d80.U((d80) this.b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                break;
            case 16:
                bd0 bd0Var = (bd0) this.b;
                bd0Var.f0 = -1L;
                int i23 = bd0Var.D0;
                if (i23 != 4) {
                    if (i23 == 5) {
                        IMapsProvider.IMap iMap = bd0Var.F;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = bd0Var.w0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), bd0Var.F.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = bd0Var.y0) == null || (messageObject.isLiveLocation() && i23 != 6)) {
                        if (i10 != 1 || i23 == 2) {
                            if (i23 != 2 || !bd0Var.getLocationController().isSharingLocation(bd0Var.b0) || bd0Var.Q.j(i10) != 7) {
                                if (i23 != 2 || !bd0Var.getLocationController().isSharingLocation(bd0Var.b0) || bd0Var.Q.j(i10) != 6) {
                                    if ((i10 != 2 || i23 != 1) && ((i10 != 1 || i23 != 2) && (i10 != 3 || i23 != 3))) {
                                        Object J = bd0Var.Q.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            bd0Var.C0.d((TLRPC.TL_messageMediaVenue) J, bd0Var.D0, true, 0, 0L);
                                            bd0Var.finishFragment();
                                            break;
                                        } else if (J instanceof vc0) {
                                            vc0 vc0Var = (vc0) J;
                                            bd0Var.f0 = vc0Var.a;
                                            if (bd0Var.g0) {
                                                bd0Var.g0 = false;
                                                bd0Var.C0();
                                            }
                                            bd0Var.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(vc0Var.e.getPosition(), bd0Var.F.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (bd0Var.getLocationController().isSharingLocation(bd0Var.b0)) {
                                        bd0Var.getLocationController().removeSharingLocation(bd0Var.b0);
                                        bd0Var.Q.l();
                                        bd0Var.finishFragment();
                                        break;
                                    } else {
                                        bd0Var.s0(false);
                                        break;
                                    }
                                } else {
                                    bd0Var.s0(bd0Var.getLocationController().getSharingLocationInfo(bd0Var.b0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                bd0Var.getLocationController().removeSharingLocation(bd0Var.b0);
                                bd0Var.Q.l();
                                bd0Var.finishFragment();
                                break;
                            }
                        } else if (bd0Var.C0 != null && bd0Var.u0 != null) {
                            FrameLayout frameLayout = bd0Var.l0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(bd0Var.u0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(bd0Var.u0.getLongitude());
                                bd0Var.C0.d(tL_messageMediaGeo, bd0Var.D0, true, 0, 0L);
                                bd0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = bd0Var.F;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = bd0Var.y0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), bd0Var.F.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) bd0Var.Q.J(i10)) != null) {
                    if (bd0Var.b0 == 0) {
                        bd0Var.C0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                        bd0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(bd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = bd0Var.getMessagesController().getInputChannel(-bd0Var.b0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        d2VarArr[0].setOnCancelListener(new mh.v(bd0Var, bd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ba(bd0Var, d2VarArr, tL_messageMediaVenue, 19)), i13));
                        bd0Var.showDialog(d2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((ti0) this.b).onBackPressed();
                break;
            case 18:
                bj0 bj0Var = (bj0) this.b;
                int i24 = bj0Var.F;
                if (i10 >= i24 && i10 < bj0Var.G) {
                    MessageObject messageObject2 = (MessageObject) bj0Var.x.get(i10 - i24);
                    if (!messageObject2.isStory()) {
                        long dialogId = MessageObject.getDialogId(messageObject2.messageOwner);
                        Bundle bundle3 = new Bundle();
                        if (DialogObject.isUserDialog(dialogId)) {
                            bundle3.putLong("user_id", dialogId);
                        } else {
                            bundle3.putLong("chat_id", -dialogId);
                        }
                        bundle3.putInt("message_id", messageObject2.getId());
                        bundle3.putBoolean("need_remove_previous_same_chat_activity", false);
                        if (bj0Var.getMessagesController().checkCanOpenChat(bundle3, bj0Var)) {
                            bj0Var.presentFragment(new xn(bundle3));
                            break;
                        }
                    } else if (!bj0Var.a0(messageObject2)) {
                        bj0Var.getOrCreateStoryViewer().G(bj0Var.getParentActivity(), messageObject2.storyItem, oh.c7.a(bj0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                hq0 hq0Var = (hq0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = hq0Var.f;
                ArrayList arrayList8 = hq0Var.n;
                MediaController.AlbumEntry albumEntry = hq0Var.G;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.w0 w0Var = hq0Var.M;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                        }
                        if (hq0Var.V) {
                            hq0Var.a0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i25 = hq0Var.Q;
                            if (i25 != 1 && i25 != 3) {
                                i15 = i25 == 2 ? 3 : i25 == 10 ? 10 : hq0Var.R == null ? 4 : 0;
                            }
                            PhotoViewer.t1().K2(null, hq0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i26 = hq0Var.E;
                            boolean z15 = hq0Var.F;
                            t12.h = i26;
                            t12.n = z15;
                            PhotoViewer.t1().f2(arrayList7, i10, i15, hq0Var.i0, hq0Var.u0, hq0Var.R);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    lq0 lq0Var = hq0Var.q0;
                    if (lq0Var != null) {
                        switch (lq0Var.a) {
                            case 0:
                                mq0.h0(lq0Var.b, str);
                                break;
                            default:
                                mq0.h0(lq0Var.b, str);
                                break;
                        }
                    } else {
                        hq0Var.M.getSearchField().setText(str);
                        hq0Var.M.getSearchField().setSelection(str.length());
                        hq0Var.b0(hq0Var.M.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hq0Var.getParentActivity());
                    alertDialog$Builder4.a.O = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.Q = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new vp0(hq0Var, i14));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.a;
                    hq0Var.showDialog(d2Var3);
                    TextView textView3 = (TextView) d2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                        break;
                    }
                }
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.d7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.M4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.M4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.h5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.M4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.h5 = false;
                break;
            case 22:
                a(i10, view);
                break;
            case 23:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.b, view, i10);
                break;
            case 24:
                b(i10, view);
                break;
            case 25:
                PrivacyControlActivity.X((PrivacyControlActivity) this.b, view, i10);
                break;
            case 26:
                c(i10, view);
                break;
            case 27:
                ProfileActivity.f0((ProfileActivity) this.b, i10);
                break;
            case 28:
                ProxyListActivity.U((ProxyListActivity) this.b, view, i10);
                break;
            default:
                n21 n21Var = (n21) this.b;
                org.telegram.ui.Components.tl0 tl0Var = n21Var.y;
                org.telegram.ui.Components.kp kpVar = n21Var.b;
                if (kpVar.d.get(i10) != n21Var.H && n21Var.L == null) {
                    n21Var.N = false;
                    n21Var.H = (org.telegram.ui.Components.lp) kpVar.d.get(i10);
                    kpVar.E(i10);
                    n21Var.h.postDelayed(new org.telegram.ui.Components.jm(n21Var, i10, 24), 100L);
                    for (int i27 = 0; i27 < tl0Var.getChildCount(); i27++) {
                        org.telegram.ui.Components.x11 x11Var = (org.telegram.ui.Components.x11) tl0Var.getChildAt(i27);
                        if (x11Var != view && (oq0Var = x11Var.G) != null) {
                            AndroidUtilities.cancelRunOnUIThread(oq0Var);
                            x11Var.G.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.lp) kpVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.x11) view).d();
                    }
                    a21 a21Var = n21Var.G;
                    if (a21Var != null) {
                        a21Var.a.d0(i10, n21Var.H.a, true);
                        break;
                    }
                }
                break;
        }
    }
}
