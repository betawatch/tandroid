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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        ov0 ov0Var = (ov0) this.b;
        boolean[] zArr = ov0Var.w;
        if (i10 == ov0Var.o0) {
            ov0Var.g0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.a9) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            boolean z11 = ov0Var.L;
            org.telegram.ui.Components.uz0 uz0Var = ov0Var.Q;
            if (uz0Var != null) {
                uz0Var.f();
            }
            if (ov0Var.I) {
                int i11 = -ov0Var.O;
                ov0Var.O = i11;
                AndroidUtilities.shakeViewSpring(a9Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == ov0Var.r0) {
                z10 = !ov0Var.G;
                ov0Var.G = z10;
            } else {
                int i12 = ov0Var.u0;
                if (i10 == i12) {
                    z10 = !ov0Var.H;
                    ov0Var.H = z10;
                } else if (i10 == ov0Var.v0) {
                    boolean z12 = !ov0Var.J;
                    ov0Var.J = z12;
                    ov0Var.s0();
                    int i13 = ov0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        ov0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        ov0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == ov0Var.s0) {
                    boolean z13 = ov0Var.K;
                    boolean z14 = !z13;
                    ov0Var.K = z14;
                    if (!z13 && ov0Var.L) {
                        int i14 = ov0Var.j0;
                        ov0Var.L = false;
                        ov0Var.s0();
                        s4.e1 K = ov0Var.c.K(ov0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.a9) K.a).setChecked(false);
                        } else {
                            ov0Var.b.m(ov0Var.t0);
                        }
                        ov0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (ov0Var.N != 0) {
                        return;
                    }
                    z10 = !ov0Var.L;
                    ov0Var.L = z10;
                    int i15 = ov0Var.j0;
                    ov0Var.s0();
                    if (ov0Var.L) {
                        ov0Var.b.s(ov0Var.j0, 2);
                    } else {
                        ov0Var.b.t(i15, 2);
                    }
                    if (ov0Var.L && ov0Var.K) {
                        ov0Var.K = false;
                        s4.e1 K2 = ov0Var.c.K(ov0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.a9) K2.a).setChecked(false);
                        } else {
                            ov0Var.b.m(ov0Var.s0);
                        }
                    }
                    if (ov0Var.L) {
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
            if (ov0Var.M && !ov0Var.L) {
                ov0Var.c.getChildCount();
                ov0Var.h.b(true);
            }
            for (int i17 = ov0Var.n0; i17 < ov0Var.n0 + ov0Var.y; i17++) {
                s4.e1 K3 = ov0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view2;
                        h6Var.m(ov0Var.L, true);
                        h6Var.r.a(zArr[i17 - ov0Var.n0], z11);
                        if (h6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == ov0Var.t0 && !ov0Var.M) {
                            ov0Var.h.f(h6Var.getCheckBox(), true);
                            ov0Var.M = true;
                        }
                    }
                }
            }
            a9Var.setChecked(z10);
            ov0Var.j0();
        }
    }

    private final void b(int i10, View view) {
        ux0 ux0Var = (ux0) this.b;
        int i11 = ux0Var.y;
        if (i10 == ux0Var.w) {
            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(ux0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new sx0(ux0Var), null).a;
            e2Var.show();
            e2Var.i();
            return;
        }
        if (i10 != ux0Var.f) {
            if (i10 < ux0Var.r || i10 >= ux0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", ux0Var.getMessagesController().blockePeers.keyAt(i10 - ux0Var.r));
            ux0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = a1.g.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            t60 t60Var = new t60(i12);
            t60Var.w = new rx0(ux0Var);
            ux0Var.presentFragment(t60Var);
            return;
        }
        bv bvVar = new bv(null);
        bvVar.d = new Paint();
        bvVar.f = new av[2];
        bvVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        ey eyVar = new ey(bundle2);
        bvVar.a = eyVar;
        eyVar.C2 = new yu(bvVar);
        eyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        bvVar.b = contactsActivity;
        contactsActivity.U = new yu(bvVar);
        contactsActivity.onFragmentCreate();
        ux0Var.presentFragment(bvVar);
    }

    @Override // org.telegram.ui.Components.am0
    public final void c(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        pt ptVar;
        h00 h00Var;
        org.telegram.ui.Components.wc b02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        zw0 zw0Var;
        int i13 = 8;
        int i14 = 3;
        int i15 = 4;
        lt ltVar = null;
        r5 = false;
        r5 = false;
        boolean z10 = false;
        int i16 = 0;
        int i17 = 1;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                ArrayList arrayList = kVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i18 = ((i) arrayList.get(i10)).d;
                    if (i18 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z11);
                        kVar.c = true;
                        break;
                    } else if (i18 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.a9) view).setChecked(z12);
                        kVar.c = true;
                        break;
                    } else if (i18 == 7) {
                        if (!kVar.getUserConfig().isPremium() && !kVar.getMessagesController().autoarchiveAvailable && !kVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(kVar.getParentActivity(), kVar.getResourceProvider());
                            org.telegram.ui.Components.aa0 aa0Var = icVar.b;
                            aa0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.y6.Gi, 0, new bu0(kVar, i14)));
                            aa0Var.setSingleLine(false);
                            aa0Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(kVar, icVar, 3500).j();
                            int i19 = -kVar.e;
                            kVar.e = i19;
                            AndroidUtilities.shakeViewSpring(view, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                            boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                            ((org.telegram.ui.Cells.a9) view).setChecked(z13);
                            kVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                o oVar = (o) this.b;
                if (i10 >= oVar.x && i10 < oVar.y && oVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.h.get(i10 - oVar.x);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.dz0 dz0Var = new org.telegram.ui.Components.dz0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                    dz0Var.c0 = new m(oVar, view, stickerSetCovered);
                    oVar.showDialog(dz0Var);
                    break;
                }
                break;
            case 2:
                p4.V((p4) this.b, i10);
                break;
            case 3:
                zc zcVar = (zc) this.b;
                ArrayList arrayList2 = zcVar.c;
                bb1 bb1Var = zcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList2.get(i10);
                    zcVar.a(ypVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + bb1Var.getPaddingLeft()) {
                        bb1Var.w0(-((AndroidUtilities.dp(48.0f) + bb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (bb1Var.getMeasuredWidth() - bb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        bb1Var.w0(org.telegram.messenger.t.B(48.0f, bb1Var.getMeasuredWidth() - bb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = zcVar.r;
                    if (callback != null) {
                        callback.run(ypVar.a());
                        break;
                    }
                }
                break;
            case 4:
                pp ppVar = (pp) this.b;
                boolean z14 = ppVar.s;
                if (ppVar.getParentActivity() != null) {
                    s4.h0 adapter = ppVar.b.getAdapter();
                    op opVar = ppVar.e;
                    if (adapter == opVar) {
                        chat = (TLRPC.Chat) opVar.d.get(i10);
                    } else {
                        int i20 = ppVar.G;
                        chat = (i10 < i20 || i10 >= ppVar.H) ? null : (TLRPC.Chat) ppVar.v.get(i10 - i20);
                    }
                    if (chat != null) {
                        if (!z14 || ppVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            ppVar.presentFragment(new wn(bundle));
                            break;
                        } else {
                            ppVar.b0(chat, true);
                            break;
                        }
                    } else if (i10 == ppVar.F) {
                        if (z14 && ppVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{ppVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = ppVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            z60 z60Var = new z60(bundle2);
                            z60Var.Y = new gp(ppVar);
                            ppVar.presentFragment(z60Var);
                            break;
                        } else if (!ppVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) ppVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ppVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.R = string;
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(ppVar, 24));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
                            ppVar.showDialog(e2Var);
                            TextView textView = (TextView) e2Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 5:
                xp xpVar = (xp) this.b;
                ArrayList arrayList3 = xpVar.n;
                if (i10 > 2) {
                    org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - 3);
                    boolean contains = xpVar.d.contains(tL_availableReaction.reaction);
                    boolean z15 = !contains;
                    if (contains) {
                        xpVar.d.remove(tL_availableReaction.reaction);
                        if (xpVar.d.isEmpty()) {
                            wp wpVar = xpVar.h;
                            if (wpVar != null) {
                                wpVar.t(2, arrayList3.size() + 1);
                            }
                            xpVar.W(2, true);
                        }
                    } else {
                        xpVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = xVar.c;
                    if (r22 != null) {
                        r22.c(z15, true);
                    }
                    org.telegram.ui.Components.aq aqVar = xVar.d;
                    if (aqVar != null) {
                        aqVar.a(z15, true);
                        break;
                    }
                }
                break;
            case 6:
                dt dtVar = (dt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.a;
                bh.i0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.iz0.c(null, htVar.c0, htVar.z.getContext(), new e5(dtVar, 9));
                    break;
                } else {
                    ft ftVar = htVar.l;
                    if (ftVar != null) {
                        ftVar.v(stickerSetCovered2.set, TextUtils.join("", htVar.o));
                    }
                    htVar.n();
                    break;
                }
                break;
            case 7:
                qt qtVar = (qt) this.b;
                if (qtVar.f && qtVar.e) {
                    ot otVar = qtVar.d;
                    ArrayList arrayList4 = otVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ltVar = (lt) otVar.e.get(i10);
                    }
                } else {
                    int S = qtVar.c.S(i10);
                    int Q = qtVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ltVar = qtVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    qtVar.finishFragment();
                    if (ltVar != null && (ptVar = qtVar.r) != null) {
                        ptVar.Y0(ltVar);
                        break;
                    }
                }
                break;
            case 8:
                ju juVar = (ju) this.b;
                ArrayList arrayList5 = juVar.k3;
                nu nuVar = juVar.w3;
                if (!(view instanceof cu) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.v8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(nuVar.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new fu(juVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.a;
                        nuVar.showDialog(e2Var2);
                        TextView textView2 = (TextView) e2Var2.d(-1);
                        if (textView2 != null) {
                            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q7, null);
                            break;
                        }
                    }
                } else {
                    eu euVar = (eu) arrayList5.get(i10);
                    if (euVar != null) {
                        int i21 = euVar.h;
                        if (i21 >= 0) {
                            juVar.q3[i21] = !r3[i21];
                            juVar.G1(true);
                            break;
                        } else if (i21 == -2) {
                            nuVar.presentFragment(new DataAutoDownloadActivity(juVar.g3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 9:
                oz.W((oz) this.b, view, i10);
                break;
            case 10:
                q00 q00Var = (q00) this.b;
                if (q00Var.getParentActivity() != null && (h00Var = (h00) q00Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = h00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i22 = h00Var.a;
                        boolean z16 = true;
                        if (i22 == 1) {
                            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                            q00Var.x0(h00Var, abVar.getName(), abVar.getCurrentObject(), h00Var.g);
                            break;
                        } else if (i22 == 7) {
                            kz kzVar = new kz(i17, q00Var, h00Var);
                            if (q00Var.c.w.f) {
                                q00Var.u0(kzVar, false);
                                break;
                            } else {
                                kzVar.run();
                                break;
                            }
                        } else if (i22 == 8 || (i22 == 4 && h00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = q00Var.r;
                            org.telegram.ui.ActionBar.u6 u6Var = null;
                            if (!q00Var.s || !q00Var.c.w.f) {
                                if ((!TextUtils.isEmpty(q00Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (q00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && q00Var.G.isEmpty() && !q00Var.F.isEmpty()) {
                                    q00Var.u0(new sz(q00Var, 1), false);
                                    break;
                                } else {
                                    float f7 = -q00Var.Q;
                                    q00Var.Q = f7;
                                    AndroidUtilities.shakeViewSpring(view, f7);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(q00Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((q00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (q00Var.G.isEmpty()) {
                                            b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (q00Var.F.isEmpty()) {
                                        b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        b02 = org.telegram.ui.Components.wc.b0(q00Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.wh.n(i11, b02, null);
                                    break;
                                }
                            } else {
                                float f10 = -q00Var.Q;
                                q00Var.Q = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                q00Var.v = true;
                                ej ejVar = q00Var.R;
                                if (ejVar == null || ejVar.getVisibility() != 0) {
                                    ej ejVar2 = new ej(6, 2, q00Var.getParentActivity(), u6Var, z16);
                                    q00Var.R = ejVar2;
                                    ejVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    q00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    q00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    q00Var.getParentLayout().getOverlayContainerView().addView(q00Var.R, marginLayoutParams);
                                    q00Var.R.f(q00Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                d00 d00Var = (d00) this.b;
                ArrayList arrayList6 = d00Var.e0;
                int i23 = i10 - 1;
                if (i23 >= 0 && i23 < arrayList6.size()) {
                    h00 h00Var2 = (h00) arrayList6.get(i23);
                    int i24 = h00Var2.a;
                    if (i24 == 7) {
                        d00Var.dismiss();
                        d00Var.n.presentFragment(new oz(d00Var.Y, h00Var2.m));
                        break;
                    } else if (i24 == 8) {
                        d00Var.Q();
                        break;
                    }
                }
                break;
            case 12:
                j10 j10Var = (j10) this.b;
                if (view instanceof org.telegram.ui.Cells.o7) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r7) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.r7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.d2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.p2) {
                    j10Var.f(i10, view, ((org.telegram.ui.Cells.p2) view).getMessage(), 0);
                    break;
                }
                break;
            case 13:
                b70 b70Var = (b70) this.b;
                if (b70Var.getParentActivity() != null) {
                    if (i10 == b70Var.n || i10 == 0) {
                        if (b70Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", b70Var.f.link));
                                org.telegram.ui.Components.wc.j(b70Var).j();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else if (i10 != b70Var.s) {
                        if (i10 == b70Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(b70Var.getParentActivity());
                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new st(b70Var, 13));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            b70Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (b70Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", b70Var.f.link);
                            b70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            case 14:
                h70.V((h70) this.b, view, i10);
                break;
            case 15:
                y70.V((y70) this.b, view, i10);
                break;
            case 16:
                LanguageSelectActivity.V((LanguageSelectActivity) this.b, view, i10);
                break;
            case 17:
                rc0 rc0Var = (rc0) this.b;
                rc0Var.i0 = -1L;
                int i25 = rc0Var.F0;
                if (i25 != 4) {
                    if (i25 == 5) {
                        IMapsProvider.IMap iMap = rc0Var.I;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = rc0Var.y0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), rc0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = rc0Var.A0) == null || (messageObject.isLiveLocation() && i25 != 6)) {
                        if (i10 != 1 || i25 == 2) {
                            if (i25 != 2 || !rc0Var.getLocationController().isSharingLocation(rc0Var.e0) || rc0Var.T.j(i10) != 7) {
                                if (i25 != 2 || !rc0Var.getLocationController().isSharingLocation(rc0Var.e0) || rc0Var.T.j(i10) != 6) {
                                    if ((i10 != 2 || i25 != 1) && ((i10 != 1 || i25 != 2) && (i10 != 3 || i25 != 3))) {
                                        Object J = rc0Var.T.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            rc0Var.E0.d((TLRPC.TL_messageMediaVenue) J, rc0Var.F0, true, 0, 0L);
                                            rc0Var.finishFragment();
                                            break;
                                        } else if (J instanceof lc0) {
                                            lc0 lc0Var = (lc0) J;
                                            rc0Var.i0 = lc0Var.a;
                                            if (rc0Var.j0) {
                                                rc0Var.j0 = false;
                                                rc0Var.D0();
                                            }
                                            rc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.e.getPosition(), rc0Var.I.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (rc0Var.getLocationController().isSharingLocation(rc0Var.e0)) {
                                        rc0Var.getLocationController().removeSharingLocation(rc0Var.e0);
                                        rc0Var.T.l();
                                        rc0Var.finishFragment();
                                        break;
                                    } else {
                                        rc0Var.t0(false);
                                        break;
                                    }
                                } else {
                                    rc0Var.t0(rc0Var.getLocationController().getSharingLocationInfo(rc0Var.e0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                rc0Var.getLocationController().removeSharingLocation(rc0Var.e0);
                                rc0Var.T.l();
                                rc0Var.finishFragment();
                                break;
                            }
                        } else if (rc0Var.E0 != null && rc0Var.w0 != null) {
                            FrameLayout frameLayout = rc0Var.o0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rc0Var.w0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rc0Var.w0.getLongitude());
                                rc0Var.E0.d(tL_messageMediaGeo, rc0Var.F0, true, 0, 0L);
                                rc0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = rc0Var.I;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = rc0Var.A0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), rc0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) rc0Var.T.J(i10)) != null) {
                    if (rc0Var.e0 == 0) {
                        rc0Var.E0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                        rc0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.e2[] e2VarArr = {new org.telegram.ui.ActionBar.e2(rc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = rc0Var.getMessagesController().getInputChannel(-rc0Var.e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        e2VarArr[0].setOnCancelListener(new bi.f0(rc0Var, rc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ea(rc0Var, e2VarArr, tL_messageMediaVenue, 19)), i13));
                        rc0Var.showDialog(e2VarArr[0]);
                        break;
                    }
                }
                break;
            case 18:
                ((pi0) this.b).onBackPressed();
                break;
            case 19:
                xi0 xi0Var = (xi0) this.b;
                int i26 = xi0Var.I;
                if (i10 >= i26 && i10 < xi0Var.J) {
                    MessageObject messageObject2 = (MessageObject) xi0Var.x.get(i10 - i26);
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
                        if (xi0Var.getMessagesController().checkCanOpenChat(bundle3, xi0Var)) {
                            xi0Var.presentFragment(new wn(bundle3));
                            break;
                        }
                    } else if (!xi0Var.c0(messageObject2)) {
                        xi0Var.getOrCreateStoryViewer().G(xi0Var.getParentActivity(), messageObject2.storyItem, di.q7.a(xi0Var.f));
                        break;
                    }
                }
                break;
            case 20:
                PasscodeActivity.W((PasscodeActivity) this.b, view, i10);
                break;
            case 21:
                sp0 sp0Var = (sp0) this.b;
                sp0Var.a(i10, true);
                fp0 fp0Var = sp0Var.h;
                if (fp0Var != null) {
                    fp0Var.run(Integer.valueOf(i10));
                    break;
                }
                break;
            case 22:
                tq0 tq0Var = (tq0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = tq0Var.f;
                ArrayList arrayList8 = tq0Var.n;
                MediaController.AlbumEntry albumEntry = tq0Var.J;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.w0 w0Var = tq0Var.P;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                        }
                        if (tq0Var.Y) {
                            tq0Var.b0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i27 = tq0Var.T;
                            if (i27 == 1 || i27 == 3) {
                                i16 = 1;
                            } else {
                                if (i27 != 2) {
                                    i14 = 10;
                                    if (i27 != 10) {
                                        if (tq0Var.U == null) {
                                            i16 = 4;
                                        }
                                    }
                                }
                                i16 = i14;
                            }
                            PhotoViewer.v1().N2(null, tq0Var, null);
                            PhotoViewer v12 = PhotoViewer.v1();
                            int i28 = tq0Var.H;
                            boolean z17 = tq0Var.I;
                            v12.h = i28;
                            v12.n = z17;
                            PhotoViewer.v1().j2(arrayList7, i10, i16, tq0Var.l0, tq0Var.x0, tq0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    wq0 wq0Var = tq0Var.t0;
                    if (wq0Var != null) {
                        switch (wq0Var.a) {
                            case 0:
                                xq0.i0(wq0Var.b, str);
                                break;
                            default:
                                xq0.i0(wq0Var.b, str);
                                break;
                        }
                    } else {
                        tq0Var.P.getSearchField().setText(str);
                        tq0Var.P.getSearchField().setSelection(str.length());
                        tq0Var.c0(tq0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(tq0Var.getParentActivity());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new gq0(tq0Var, i15));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder4.a;
                    tq0Var.showDialog(e2Var3);
                    TextView textView3 = (TextView) e2Var3.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.f7.V(textView3, org.telegram.ui.ActionBar.y6.q7, null);
                        break;
                    }
                }
                break;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.p1();
                    }
                }
                photoViewer.k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.E2(indexOf);
                }
                photoViewer.k5 = false;
                break;
            case 24:
                a(i10, view);
                break;
            case 25:
                PremiumPreviewFragment.V((PremiumPreviewFragment) this.b, view, i10);
                break;
            case 26:
                xw0 xw0Var = (xw0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = xw0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                uw0 uw0Var = xw0Var.e;
                if (view.isEnabled() && (view instanceof tg.r1)) {
                    tg.r1 r1Var = (tg.r1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(r1Var.getTier());
                    premiumPreviewFragment.u0(true);
                    r1Var.c(true, true);
                    for (int i29 = 0; i29 < uw0Var.getChildCount(); i29++) {
                        View childAt = uw0Var.getChildAt(i29);
                        if (childAt instanceof tg.r1) {
                            tg.r1 r1Var2 = (tg.r1) childAt;
                            if (r1Var2.getTier() != r1Var.getTier()) {
                                r1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < uw0Var.getHiddenChildCount(); i30++) {
                        View V = uw0Var.V(i30);
                        if (V instanceof tg.r1) {
                            tg.r1 r1Var3 = (tg.r1) V;
                            if (r1Var3.getTier() != r1Var.getTier()) {
                                r1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < uw0Var.getCachedChildCount(); i31++) {
                        View P = uw0Var.P(i31);
                        if (P instanceof tg.r1) {
                            tg.r1 r1Var4 = (tg.r1) P;
                            if (r1Var4.getTier() != r1Var.getTier()) {
                                r1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i32 = 0; i32 < uw0Var.getAttachedScrapChildCount(); i32++) {
                        View O = uw0Var.O(i32);
                        if (O instanceof tg.r1) {
                            tg.r1 r1Var5 = (tg.r1) O;
                            if (r1Var5.getTier() != r1Var.getTier()) {
                                r1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (!premiumPreviewFragment.getUserConfig().isPremium() || ((zw0Var = premiumPreviewFragment.f) != null && zw0Var.a.months < ((zw0) arrayList10.get(premiumPreviewFragment.e)).a.months && !premiumPreviewFragment.p0)) {
                        z10 = true;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
                    break;
                }
                break;
            case 27:
                PrivacyControlActivity.Y((PrivacyControlActivity) this.b, view, i10);
                break;
            case 28:
                b(i10, view);
                break;
            default:
                ProfileActivity.X((ProfileActivity) this.b, i10);
                break;
        }
    }
}
