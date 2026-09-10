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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.ui.Components.jl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        bw0 bw0Var = (bw0) this.b;
        boolean[] zArr = bw0Var.w;
        if (i10 == bw0Var.o0) {
            bw0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.x8) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z11 = bw0Var.L;
            org.telegram.ui.Components.zy0 zy0Var = bw0Var.Q;
            if (zy0Var != null) {
                zy0Var.f();
            }
            if (bw0Var.I) {
                int i11 = -bw0Var.O;
                bw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(x8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == bw0Var.r0) {
                z10 = !bw0Var.G;
                bw0Var.G = z10;
            } else {
                int i12 = bw0Var.u0;
                if (i10 == i12) {
                    z10 = !bw0Var.H;
                    bw0Var.H = z10;
                } else if (i10 == bw0Var.v0) {
                    boolean z12 = !bw0Var.J;
                    bw0Var.J = z12;
                    bw0Var.r0();
                    int i13 = bw0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        bw0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        bw0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == bw0Var.s0) {
                    boolean z13 = bw0Var.K;
                    boolean z14 = !z13;
                    bw0Var.K = z14;
                    if (!z13 && bw0Var.L) {
                        int i14 = bw0Var.j0;
                        bw0Var.L = false;
                        bw0Var.r0();
                        s4.c1 K = bw0Var.c.K(bw0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.x8) K.a).setChecked(false);
                        } else {
                            bw0Var.b.m(bw0Var.t0);
                        }
                        bw0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (bw0Var.N != 0) {
                        return;
                    }
                    z10 = !bw0Var.L;
                    bw0Var.L = z10;
                    int i15 = bw0Var.j0;
                    bw0Var.r0();
                    if (bw0Var.L) {
                        bw0Var.b.s(bw0Var.j0, 2);
                    } else {
                        bw0Var.b.t(i15, 2);
                    }
                    if (bw0Var.L && bw0Var.K) {
                        bw0Var.K = false;
                        s4.c1 K2 = bw0Var.c.K(bw0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.x8) K2.a).setChecked(false);
                        } else {
                            bw0Var.b.m(bw0Var.s0);
                        }
                    }
                    if (bw0Var.L) {
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
            if (bw0Var.M && !bw0Var.L) {
                bw0Var.h.b(true);
            }
            bw0Var.c.getChildCount();
            for (int i17 = bw0Var.n0; i17 < bw0Var.n0 + bw0Var.y; i17++) {
                s4.c1 K3 = bw0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.e6) {
                        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view2;
                        e6Var.m(bw0Var.L, true);
                        e6Var.r.a(zArr[i17 - bw0Var.n0], z11);
                        if (e6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == bw0Var.t0 && !bw0Var.M) {
                            bw0Var.h.f(e6Var.getCheckBox(), true);
                            bw0Var.M = true;
                        }
                    }
                }
            }
            x8Var.setChecked(z10);
            bw0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        ky0 ky0Var = (ky0) this.b;
        int i11 = ky0Var.y;
        if (i10 == ky0Var.w) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.d5.O(ky0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new iy0(ky0Var), null).a;
            d2Var.show();
            d2Var.h();
            return;
        }
        if (i10 != ky0Var.f) {
            if (i10 < ky0Var.r || i10 >= ky0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", ky0Var.getMessagesController().blockePeers.keyAt(i10 - ky0Var.r));
            ky0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            e70 e70Var = new e70(i12);
            e70Var.w = new hy0(ky0Var);
            ky0Var.presentFragment(e70Var);
            return;
        }
        pv pvVar = new pv(null);
        pvVar.d = new Paint();
        pvVar.f = new ov[2];
        pvVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        wy wyVar = new wy(bundle2);
        pvVar.a = wyVar;
        wyVar.C2 = new mv(pvVar);
        wyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        pvVar.b = contactsActivity;
        contactsActivity.W = new mv(pvVar);
        contactsActivity.onFragmentCreate();
        ky0Var.presentFragment(pvVar);
    }

    @Override // org.telegram.ui.Components.jl0
    public final void d(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        au auVar;
        y00 y00Var;
        org.telegram.ui.Components.wc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        nx0 nx0Var;
        int i13 = 7;
        int i14 = 4;
        wt wtVar = null;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i15 = ((j) arrayList.get(i10)).d;
                    if (i15 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z10;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                        lVar.c = true;
                        break;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z11;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z11);
                        lVar.c = true;
                        break;
                    } else if (i15 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.m90 m90Var = hcVar.b;
                            m90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new mu0(lVar, r11)));
                            m90Var.setSingleLine(false);
                            m90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            hcVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.pc.g(lVar, hcVar, 3500).j();
                            int i16 = -lVar.e;
                            lVar.e = i16;
                            AndroidUtilities.shakeViewSpring(view, i16);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                            boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                            ((org.telegram.ui.Cells.x8) view).setChecked(z12);
                            lVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                q qVar = (q) this.b;
                if (i10 >= qVar.x && i10 < qVar.y && qVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) qVar.h.get(i10 - qVar.x);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    hy0Var.c0 = new o(qVar, view, stickerSetCovered);
                    qVar.showDialog(hy0Var);
                    break;
                }
                break;
            case 2:
                ad adVar = (ad) this.b;
                ArrayList arrayList2 = adVar.c;
                ic1 ic1Var = adVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.rp rpVar = (org.telegram.ui.Components.rp) arrayList2.get(i10);
                    adVar.a(rpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + ic1Var.getPaddingLeft()) {
                        ic1Var.v0(-((AndroidUtilities.dp(48.0f) + ic1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (ic1Var.getMeasuredWidth() - ic1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        ic1Var.v0(org.telegram.messenger.a2.z(48.0f, ic1Var.getMeasuredWidth() - ic1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = adVar.r;
                    if (callback != null) {
                        callback.run(rpVar.a());
                        break;
                    }
                }
                break;
            case 3:
                yp ypVar = (yp) this.b;
                boolean z13 = ypVar.s;
                if (ypVar.getParentActivity() != null) {
                    s4.h0 adapter = ypVar.b.getAdapter();
                    xp xpVar = ypVar.e;
                    if (adapter == xpVar) {
                        chat = (TLRPC.Chat) xpVar.d.get(i10);
                    } else {
                        int i17 = ypVar.G;
                        chat = (i10 < i17 || i10 >= ypVar.H) ? null : (TLRPC.Chat) ypVar.v.get(i10 - i17);
                    }
                    if (chat != null) {
                        if (!z13 || ypVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            ypVar.presentFragment(new eo(bundle));
                            break;
                        } else {
                            ypVar.a0(chat, true);
                            break;
                        }
                    } else if (i10 == ypVar.F) {
                        if (z13 && ypVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{ypVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = ypVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            k70 k70Var = new k70(bundle2);
                            k70Var.Y = new qp(ypVar);
                            ypVar.presentFragment(k70Var);
                            break;
                        } else if (!ypVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) ypVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ypVar.getParentActivity());
                            if (z13) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.R = string;
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(ypVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                            ypVar.showDialog(d2Var);
                            TextView textView = (TextView) d2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                fq fqVar = (fq) this.b;
                ArrayList arrayList3 = fqVar.r;
                boolean z14 = fqVar.G;
                if (i10 > (z14 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z14 ? 2 : 3));
                    boolean contains = fqVar.d.contains(tL_availableReaction.reaction);
                    boolean z15 = !contains;
                    if (contains) {
                        fqVar.d.remove(tL_availableReaction.reaction);
                        if (fqVar.d.isEmpty()) {
                            eq eqVar = fqVar.h;
                            if (eqVar != null) {
                                eqVar.t(fqVar.G ? 1 : 2, arrayList3.size() + 1);
                            }
                            fqVar.V(2, true);
                        }
                    } else {
                        fqVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z15, true);
                    }
                    org.telegram.ui.Components.tp tpVar = yVar.d;
                    if (tpVar != null) {
                        tpVar.a(z15, true);
                        break;
                    }
                }
                break;
            case 5:
                pt ptVar = (pt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((st) view).d;
                tt ttVar = ptVar.a;
                yg.c0 reactionsWindow = ttVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ny0.c(null, ttVar.c0, ttVar.z.getContext(), new b5(ptVar, 9));
                    break;
                } else {
                    rt rtVar = ttVar.l;
                    if (rtVar != null) {
                        rtVar.u(stickerSetCovered2.set, TextUtils.join("", ttVar.o));
                    }
                    ttVar.p();
                    break;
                }
            case 6:
                bu buVar = (bu) this.b;
                if (buVar.f && buVar.e) {
                    zt ztVar = buVar.d;
                    ArrayList arrayList4 = ztVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        wtVar = (wt) ztVar.e.get(i10);
                    }
                } else {
                    int S = buVar.c.S(i10);
                    int Q = buVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        wtVar = buVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    buVar.finishFragment();
                    if (wtVar != null && (auVar = buVar.r) != null) {
                        auVar.a1(wtVar);
                        break;
                    }
                }
                break;
            case 7:
                xu xuVar = (xu) this.b;
                ArrayList arrayList5 = xuVar.c3;
                bv bvVar = xuVar.o3;
                if (!(view instanceof qu) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bvVar.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new tu(xuVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                        bvVar.showDialog(d2Var2);
                        TextView textView2 = (TextView) d2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                            break;
                        }
                    }
                } else {
                    su suVar = (su) arrayList5.get(i10);
                    if (suVar != null) {
                        int i18 = suVar.h;
                        if (i18 >= 0) {
                            xuVar.i3[i18] = !r3[i18];
                            xuVar.z1(true);
                            break;
                        } else if (i18 == -2) {
                            bvVar.presentFragment(new DataAutoDownloadActivity(xuVar.Y2 - 1));
                            break;
                        }
                    }
                }
                break;
            case 8:
                e00.V((e00) this.b, view, i10);
                break;
            case 9:
                h10 h10Var = (h10) this.b;
                if (h10Var.getParentActivity() != null && (y00Var = (y00) h10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = y00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = y00Var.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
                            h10Var.v0(y00Var, bbVar.getName(), bbVar.getCurrentObject(), y00Var.g);
                            break;
                        } else if (i19 == 7) {
                            uv uvVar = new uv(11, h10Var, y00Var);
                            if (h10Var.c.isEnabled()) {
                                h10Var.s0(uvVar, false);
                                break;
                            } else {
                                uvVar.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && y00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = h10Var.r;
                            org.telegram.ui.ActionBar.f6 f6Var = null;
                            if (!h10Var.s || h10Var.c.getAlpha() <= 0.0f) {
                                if ((!TextUtils.isEmpty(h10Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (h10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && h10Var.G.isEmpty() && !h10Var.F.isEmpty()) {
                                    h10Var.s0(new i00(h10Var, 1), false);
                                    break;
                                } else {
                                    float f7 = -h10Var.Q;
                                    h10Var.Q = f7;
                                    AndroidUtilities.shakeViewSpring(view, f7);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(h10Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((h10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (h10Var.G.isEmpty()) {
                                            a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (h10Var.F.isEmpty()) {
                                        a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.wc.a0(h10Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.a2.p(i11, a02, null);
                                    break;
                                }
                            } else {
                                float f10 = -h10Var.Q;
                                h10Var.Q = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                h10Var.v = true;
                                kj kjVar = h10Var.R;
                                if (kjVar == null || kjVar.getVisibility() != 0) {
                                    kj kjVar2 = new kj(6, 3, h10Var.getParentActivity(), f6Var, true);
                                    h10Var.R = kjVar2;
                                    kjVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    h10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    h10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    h10Var.getParentLayout().getOverlayContainerView().addView(h10Var.R, marginLayoutParams);
                                    h10Var.R.f(h10Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                t00 t00Var = (t00) this.b;
                ArrayList arrayList6 = t00Var.d0;
                int i20 = i10 - 1;
                if (i20 >= 0 && i20 < arrayList6.size()) {
                    y00 y00Var2 = (y00) arrayList6.get(i20);
                    int i21 = y00Var2.a;
                    if (i21 == 7) {
                        t00Var.dismiss();
                        t00Var.n.presentFragment(new e00(t00Var.X, y00Var2.m));
                        break;
                    } else if (i21 == 8) {
                        t00Var.Q();
                        break;
                    }
                }
                break;
            case 11:
                z10 z10Var = (z10) this.b;
                if (view instanceof org.telegram.ui.Cells.l7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.o7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.o7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.k7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    break;
                }
                break;
            case 12:
                m70 m70Var = (m70) this.b;
                if (m70Var.getParentActivity() != null) {
                    if (i10 == m70Var.n || i10 == 0) {
                        if (m70Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", m70Var.f.link));
                                org.telegram.ui.Components.wc.j(m70Var).j();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else if (i10 != m70Var.s) {
                        if (i10 == m70Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(m70Var.getParentActivity());
                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new iu(m70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            m70Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (m70Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", m70Var.f.link);
                            m70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case 13:
                s70.U((s70) this.b, view, i10);
                break;
            case 14:
                k80.U((k80) this.b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                break;
            case 16:
                id0 id0Var = (id0) this.b;
                id0Var.i0 = -1L;
                int i22 = id0Var.G0;
                if (i22 != 4) {
                    if (i22 == 5) {
                        IMapsProvider.IMap iMap = id0Var.I;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = id0Var.z0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), id0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = id0Var.B0) == null || (messageObject.isLiveLocation() && i22 != 6)) {
                        if (i10 != 1 || i22 == 2) {
                            if (i22 != 2 || !id0Var.getLocationController().isSharingLocation(id0Var.e0) || id0Var.T.j(i10) != 7) {
                                if (i22 != 2 || !id0Var.getLocationController().isSharingLocation(id0Var.e0) || id0Var.T.j(i10) != 6) {
                                    if ((i10 != 2 || i22 != 1) && ((i10 != 1 || i22 != 2) && (i10 != 3 || i22 != 3))) {
                                        Object J = id0Var.T.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            id0Var.F0.b((TLRPC.TL_messageMediaVenue) J, id0Var.G0, true, 0, 0L);
                                            id0Var.finishFragment();
                                            break;
                                        } else if (J instanceof cd0) {
                                            cd0 cd0Var = (cd0) J;
                                            id0Var.i0 = cd0Var.a;
                                            if (id0Var.j0) {
                                                id0Var.j0 = false;
                                                id0Var.C0();
                                            }
                                            id0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cd0Var.e.getPosition(), id0Var.I.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (id0Var.getLocationController().isSharingLocation(id0Var.e0)) {
                                        id0Var.getLocationController().removeSharingLocation(id0Var.e0);
                                        id0Var.T.l();
                                        id0Var.finishFragment();
                                        break;
                                    } else {
                                        id0Var.s0(false);
                                        break;
                                    }
                                } else {
                                    id0Var.s0(id0Var.getLocationController().getSharingLocationInfo(id0Var.e0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                id0Var.getLocationController().removeSharingLocation(id0Var.e0);
                                id0Var.T.l();
                                id0Var.finishFragment();
                                break;
                            }
                        } else if (id0Var.F0 != null && id0Var.x0 != null) {
                            FrameLayout frameLayout = id0Var.o0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(id0Var.x0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(id0Var.x0.getLongitude());
                                id0Var.F0.b(tL_messageMediaGeo, id0Var.G0, true, 0, 0L);
                                id0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = id0Var.I;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = id0Var.B0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), id0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) id0Var.T.J(i10)) != null) {
                    if (id0Var.e0 == 0) {
                        id0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        id0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.d2[] d2VarArr = {new org.telegram.ui.ActionBar.d2(id0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = id0Var.getMessagesController().getInputChannel(-id0Var.e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        d2VarArr[0].setOnCancelListener(new ba(id0Var, id0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(id0Var, d2VarArr, tL_messageMediaVenue, 19)), i13));
                        id0Var.showDialog(d2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((cj0) this.b).onBackPressed();
                break;
            case 18:
                kj0 kj0Var = (kj0) this.b;
                int i23 = kj0Var.I;
                if (i10 >= i23 && i10 < kj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) kj0Var.x.get(i10 - i23);
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
                        if (kj0Var.getMessagesController().checkCanOpenChat(bundle3, kj0Var)) {
                            kj0Var.presentFragment(new eo(bundle3));
                            break;
                        }
                    } else if (!kj0Var.a0(messageObject2)) {
                        kj0Var.getOrCreateStoryViewer().G(kj0Var.getParentActivity(), messageObject2.storyItem, zh.s5.a(kj0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                aq0 aq0Var = (aq0) this.b;
                aq0Var.a(i10, true);
                mp0 mp0Var = aq0Var.h;
                if (mp0Var != null) {
                    mp0Var.run(Integer.valueOf(i10));
                    break;
                }
                break;
            case 21:
                br0 br0Var = (br0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = br0Var.f;
                ArrayList arrayList8 = br0Var.n;
                MediaController.AlbumEntry albumEntry = br0Var.J;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.w0 w0Var = br0Var.P;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                        }
                        if (br0Var.Y) {
                            br0Var.a0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i24 = br0Var.T;
                            int i25 = (i24 == 1 || i24 == 3) ? 1 : i24 == 2 ? 3 : i24 == 10 ? 10 : br0Var.U == null ? 4 : 0;
                            PhotoViewer.t1().K2(null, br0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i26 = br0Var.H;
                            boolean z16 = br0Var.I;
                            t12.h = i26;
                            t12.n = z16;
                            PhotoViewer.t1().f2(arrayList7, i10, i25, br0Var.l0, br0Var.x0, br0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    fr0 fr0Var = br0Var.t0;
                    if (fr0Var != null) {
                        switch (fr0Var.a) {
                            case 0:
                                gr0.h0(fr0Var.b, str);
                                break;
                            default:
                                gr0.h0(fr0Var.b, str);
                                break;
                        }
                    } else {
                        br0Var.P.getSearchField().setText(str);
                        br0Var.P.getSearchField().setSelection(str.length());
                        br0Var.b0(br0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(br0Var.getParentActivity());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new oq0(br0Var, i14));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder4.a;
                    br0Var.showDialog(d2Var3);
                    TextView textView3 = (TextView) d2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                        break;
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
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
                break;
            case 23:
                a(i10, view);
                break;
            case 24:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.b, view, i10);
                break;
            case 25:
                lx0 lx0Var = (lx0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ix0 ix0Var = lx0Var.e;
                if (view.isEnabled() && (view instanceof qg.r1)) {
                    qg.r1 r1Var = (qg.r1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(r1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    r1Var.c(true, true);
                    for (int i27 = 0; i27 < ix0Var.getChildCount(); i27++) {
                        View childAt = ix0Var.getChildAt(i27);
                        if (childAt instanceof qg.r1) {
                            qg.r1 r1Var2 = (qg.r1) childAt;
                            if (r1Var2.getTier() != r1Var.getTier()) {
                                r1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i28 = 0; i28 < ix0Var.getHiddenChildCount(); i28++) {
                        View V = ix0Var.V(i28);
                        if (V instanceof qg.r1) {
                            qg.r1 r1Var3 = (qg.r1) V;
                            if (r1Var3.getTier() != r1Var.getTier()) {
                                r1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < ix0Var.getCachedChildCount(); i29++) {
                        View P = ix0Var.P(i29);
                        if (P instanceof qg.r1) {
                            qg.r1 r1Var4 = (qg.r1) P;
                            if (r1Var4.getTier() != r1Var.getTier()) {
                                r1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < ix0Var.getAttachedScrapChildCount(); i30++) {
                        View O = ix0Var.O(i30);
                        if (O instanceof qg.r1) {
                            qg.r1 r1Var5 = (qg.r1) O;
                            if (r1Var5.getTier() != r1Var.getTier()) {
                                r1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((nx0Var = premiumPreviewFragment.f) == null || nx0Var.a.months >= ((nx0) arrayList10.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
                        r6 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, r6);
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.X((PrivacyControlActivity) this.b, view, i10);
                break;
            case 27:
                b(i10, view);
                break;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.b, i10);
                break;
            default:
                ProxyListActivity.U((ProxyListActivity) this.b, view, i10);
                break;
        }
    }
}
