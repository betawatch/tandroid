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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        cw0 cw0Var = (cw0) this.b;
        boolean[] zArr = cw0Var.w;
        if (i10 == cw0Var.o0) {
            cw0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = cw0Var.L;
            org.telegram.ui.Components.oy0 oy0Var = cw0Var.Q;
            if (oy0Var != null) {
                oy0Var.f();
            }
            if (cw0Var.I) {
                int i11 = -cw0Var.O;
                cw0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == cw0Var.r0) {
                z10 = !cw0Var.G;
                cw0Var.G = z10;
            } else {
                int i12 = cw0Var.u0;
                if (i10 == i12) {
                    z10 = !cw0Var.H;
                    cw0Var.H = z10;
                } else if (i10 == cw0Var.v0) {
                    boolean z12 = !cw0Var.J;
                    cw0Var.J = z12;
                    cw0Var.r0();
                    int i13 = cw0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        cw0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        cw0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == cw0Var.s0) {
                    boolean z13 = cw0Var.K;
                    boolean z14 = !z13;
                    cw0Var.K = z14;
                    if (!z13 && cw0Var.L) {
                        int i14 = cw0Var.j0;
                        cw0Var.L = false;
                        cw0Var.r0();
                        s4.c1 L = cw0Var.c.L(cw0Var.t0);
                        if (L != null) {
                            ((org.telegram.ui.Cells.w8) L.a).setChecked(false);
                        } else {
                            cw0Var.b.m(cw0Var.t0);
                        }
                        cw0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (cw0Var.N != 0) {
                        return;
                    }
                    z10 = !cw0Var.L;
                    cw0Var.L = z10;
                    int i15 = cw0Var.j0;
                    cw0Var.r0();
                    if (cw0Var.L) {
                        cw0Var.b.s(cw0Var.j0, 2);
                    } else {
                        cw0Var.b.t(i15, 2);
                    }
                    if (cw0Var.L && cw0Var.K) {
                        cw0Var.K = false;
                        s4.c1 L2 = cw0Var.c.L(cw0Var.s0);
                        if (L2 != null) {
                            ((org.telegram.ui.Cells.w8) L2.a).setChecked(false);
                        } else {
                            cw0Var.b.m(cw0Var.s0);
                        }
                    }
                    if (cw0Var.L) {
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
            if (cw0Var.M && !cw0Var.L) {
                cw0Var.h.b(true);
            }
            cw0Var.c.getChildCount();
            for (int i17 = cw0Var.n0; i17 < cw0Var.n0 + cw0Var.y; i17++) {
                s4.c1 L3 = cw0Var.c.L(i17);
                if (L3 != null) {
                    View view2 = L3.a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(cw0Var.L, true);
                        c6Var.r.a(zArr[i17 - cw0Var.n0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == cw0Var.t0 && !cw0Var.M) {
                            cw0Var.h.f(c6Var.getCheckBox(), true);
                            cw0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            cw0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        iy0 iy0Var = (iy0) this.b;
        int i11 = iy0Var.y;
        if (i10 == iy0Var.w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(iy0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new gy0(iy0Var), null).a;
            c2Var.show();
            c2Var.h();
            return;
        }
        if (i10 != iy0Var.f) {
            if (i10 < iy0Var.r || i10 >= iy0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", iy0Var.getMessagesController().blockePeers.keyAt(i10 - iy0Var.r));
            iy0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            g70 g70Var = new g70(i12);
            g70Var.w = new fy0(iy0Var);
            iy0Var.presentFragment(g70Var);
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
        iy0Var.presentFragment(pvVar);
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        bu buVar;
        y00 y00Var;
        org.telegram.ui.Components.vc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        nx0 nx0Var;
        int i13 = 8;
        int i14 = 7;
        int i15 = 4;
        xt xtVar = null;
        r5 = true;
        boolean z10 = true;
        r5 = 1;
        int i16 = 1;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i17 = ((j) arrayList.get(i10)).d;
                    if (i17 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z11 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.c = true;
                        break;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        lVar.c = true;
                        break;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.gc gcVar = new org.telegram.ui.Components.gc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.c90 c90Var = gcVar.b;
                            c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.j6.Gi, 0, new ou0(lVar, r11)));
                            c90Var.setSingleLine(false);
                            c90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            gcVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.oc.g(lVar, gcVar, 3500).j();
                            int i18 = -lVar.e;
                            lVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                            boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                            ((org.telegram.ui.Cells.w8) view).setChecked(z13);
                            lVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                p pVar = (p) this.b;
                if (i10 >= pVar.x && i10 < pVar.y && pVar.getParentActivity() != null) {
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
                    org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    wx0Var.c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(wx0Var);
                    break;
                }
                break;
            case 2:
                ad adVar = (ad) this.b;
                ArrayList arrayList2 = adVar.c;
                fc1 fc1Var = adVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) arrayList2.get(i10);
                    adVar.a(lpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + fc1Var.getPaddingLeft()) {
                        fc1Var.w0(-((AndroidUtilities.dp(48.0f) + fc1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        fc1Var.w0(org.telegram.messenger.w1.z(48.0f, fc1Var.getMeasuredWidth() - fc1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = adVar.r;
                    if (callback != null) {
                        callback.run(lpVar.a());
                        break;
                    }
                }
                break;
            case 3:
                wp wpVar = (wp) this.b;
                boolean z14 = wpVar.s;
                if (wpVar.getParentActivity() != null) {
                    s4.h0 adapter = wpVar.b.getAdapter();
                    vp vpVar = wpVar.e;
                    if (adapter == vpVar) {
                        chat = (TLRPC.Chat) vpVar.d.get(i10);
                    } else {
                        int i19 = wpVar.G;
                        chat = (i10 < i19 || i10 >= wpVar.H) ? null : (TLRPC.Chat) wpVar.v.get(i10 - i19);
                    }
                    if (chat != null) {
                        if (!z14 || wpVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            wpVar.presentFragment(new bo(bundle));
                            break;
                        } else {
                            wpVar.a0(chat, true);
                            break;
                        }
                    } else if (i10 == wpVar.F) {
                        if (z14 && wpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{wpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = wpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            n70 n70Var = new n70(bundle2);
                            n70Var.Y = new op(wpVar);
                            wpVar.presentFragment(n70Var);
                            break;
                        } else if (!wpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) wpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wpVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.R = string;
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new y0(wpVar, 23));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            wpVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                dq dqVar = (dq) this.b;
                ArrayList arrayList3 = dqVar.r;
                boolean z15 = dqVar.G;
                if (i10 > (z15 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z15 ? 2 : 3));
                    boolean contains = dqVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (contains) {
                        dqVar.d.remove(tL_availableReaction.reaction);
                        if (dqVar.d.isEmpty()) {
                            cq cqVar = dqVar.h;
                            if (cqVar != null) {
                                cqVar.t(dqVar.G ? 1 : 2, arrayList3.size() + 1);
                            }
                            dqVar.V(2, true);
                        }
                    } else {
                        dqVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.np npVar = yVar.d;
                    if (npVar != null) {
                        npVar.a(z16, true);
                        break;
                    }
                }
                break;
            case 5:
                qt qtVar = (qt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((tt) view).d;
                ut utVar = qtVar.a;
                zg.c0 reactionsWindow = utVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.cy0.c(null, utVar.c0, utVar.z.getContext(), new b5(qtVar, 9));
                    break;
                } else {
                    st stVar = utVar.l;
                    if (stVar != null) {
                        stVar.v(stickerSetCovered2.set, TextUtils.join("", utVar.o));
                    }
                    utVar.p();
                    break;
                }
                break;
            case 6:
                cu cuVar = (cu) this.b;
                if (cuVar.f && cuVar.e) {
                    au auVar = cuVar.d;
                    ArrayList arrayList4 = auVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        xtVar = (xt) auVar.e.get(i10);
                    }
                } else {
                    int S = cuVar.c.S(i10);
                    int Q = cuVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        xtVar = cuVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    cuVar.finishFragment();
                    if (xtVar != null && (buVar = cuVar.r) != null) {
                        buVar.a1(xtVar);
                        break;
                    }
                }
                break;
            case 7:
                xu xuVar = (xu) this.b;
                ArrayList arrayList5 = xuVar.c3;
                bv bvVar = xuVar.o3;
                if (!(view instanceof qu) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bvVar.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new tu(xuVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                        bvVar.showDialog(c2Var2);
                        TextView textView2 = (TextView) c2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                            break;
                        }
                    }
                } else {
                    su suVar = (su) arrayList5.get(i10);
                    if (suVar != null) {
                        int i20 = suVar.h;
                        if (i20 >= 0) {
                            xuVar.i3[i20] = !r3[i20];
                            xuVar.B1(true);
                            break;
                        } else if (i20 == -2) {
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
                        int i21 = y00Var.a;
                        if (i21 == 1) {
                            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
                            h10Var.v0(y00Var, abVar.getName(), abVar.getCurrentObject(), y00Var.g);
                            break;
                        } else if (i21 == 7) {
                            mw mwVar = new mw(i13, h10Var, y00Var);
                            if (h10Var.c.isEnabled()) {
                                h10Var.s0(mwVar, false);
                                break;
                            } else {
                                mwVar.run();
                                break;
                            }
                        } else if (i21 == 8 || (i21 == 4 && y00Var.k == R.drawable.msg2_link2)) {
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
                                        a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((h10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (h10Var.G.isEmpty()) {
                                            a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (h10Var.F.isEmpty()) {
                                        a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.vc.a0(h10Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.w1.p(i11, a02, null);
                                    break;
                                }
                            } else {
                                float f10 = -h10Var.Q;
                                h10Var.Q = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                h10Var.v = true;
                                jj jjVar = h10Var.R;
                                if (jjVar == null || jjVar.getVisibility() != 0) {
                                    jj jjVar2 = new jj(6, 3, h10Var.getParentActivity(), f6Var, true);
                                    h10Var.R = jjVar2;
                                    jjVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
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
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    y00 y00Var2 = (y00) arrayList6.get(i22);
                    int i23 = y00Var2.a;
                    if (i23 == 7) {
                        t00Var.dismiss();
                        t00Var.n.presentFragment(new e00(t00Var.X, y00Var2.m));
                        break;
                    } else if (i23 == 8) {
                        t00Var.Q();
                        break;
                    }
                }
                break;
            case 11:
                z10 z10Var = (z10) this.b;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    z10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
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
                p70 p70Var = (p70) this.b;
                if (p70Var.getParentActivity() != null) {
                    if (i10 == p70Var.n || i10 == 0) {
                        if (p70Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", p70Var.f.link));
                                org.telegram.ui.Components.vc.j(p70Var).j();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else if (i10 != p70Var.s) {
                        if (i10 == p70Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(p70Var.getParentActivity());
                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new gu(p70Var, 13));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            p70Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (p70Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", p70Var.f.link);
                            p70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case 13:
                v70.U((v70) this.b, view, i10);
                break;
            case 14:
                n80.U((n80) this.b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                break;
            case 16:
                kd0 kd0Var = (kd0) this.b;
                kd0Var.i0 = -1L;
                int i24 = kd0Var.G0;
                if (i24 != 4) {
                    if (i24 == 5) {
                        IMapsProvider.IMap iMap = kd0Var.I;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = kd0Var.z0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), kd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = kd0Var.B0) == null || (messageObject.isLiveLocation() && i24 != 6)) {
                        if (i10 != 1 || i24 == 2) {
                            if (i24 != 2 || !kd0Var.getLocationController().isSharingLocation(kd0Var.e0) || kd0Var.T.j(i10) != 7) {
                                if (i24 != 2 || !kd0Var.getLocationController().isSharingLocation(kd0Var.e0) || kd0Var.T.j(i10) != 6) {
                                    if ((i10 != 2 || i24 != 1) && ((i10 != 1 || i24 != 2) && (i10 != 3 || i24 != 3))) {
                                        Object J = kd0Var.T.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            kd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, kd0Var.G0, true, 0, 0L);
                                            kd0Var.finishFragment();
                                            break;
                                        } else if (J instanceof ed0) {
                                            ed0 ed0Var = (ed0) J;
                                            kd0Var.i0 = ed0Var.a;
                                            if (kd0Var.j0) {
                                                kd0Var.j0 = false;
                                                kd0Var.C0();
                                            }
                                            kd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ed0Var.e.getPosition(), kd0Var.I.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (kd0Var.getLocationController().isSharingLocation(kd0Var.e0)) {
                                        kd0Var.getLocationController().removeSharingLocation(kd0Var.e0);
                                        kd0Var.T.l();
                                        kd0Var.finishFragment();
                                        break;
                                    } else {
                                        kd0Var.s0(false);
                                        break;
                                    }
                                } else {
                                    kd0Var.s0(kd0Var.getLocationController().getSharingLocationInfo(kd0Var.e0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                kd0Var.getLocationController().removeSharingLocation(kd0Var.e0);
                                kd0Var.T.l();
                                kd0Var.finishFragment();
                                break;
                            }
                        } else if (kd0Var.F0 != null && kd0Var.x0 != null) {
                            FrameLayout frameLayout = kd0Var.o0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(kd0Var.x0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(kd0Var.x0.getLongitude());
                                kd0Var.F0.b(tL_messageMediaGeo, kd0Var.G0, true, 0, 0L);
                                kd0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = kd0Var.I;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = kd0Var.B0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), kd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) kd0Var.T.J(i10)) != null) {
                    if (kd0Var.e0 == 0) {
                        kd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        kd0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(kd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = kd0Var.getMessagesController().getInputChannel(-kd0Var.e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        c2VarArr[0].setOnCancelListener(new da(kd0Var, kd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ca(kd0Var, c2VarArr, tL_messageMediaVenue, 19)), i14));
                        kd0Var.showDialog(c2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((dj0) this.b).onBackPressed();
                break;
            case 18:
                lj0 lj0Var = (lj0) this.b;
                int i25 = lj0Var.I;
                if (i10 >= i25 && i10 < lj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) lj0Var.x.get(i10 - i25);
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
                        if (lj0Var.getMessagesController().checkCanOpenChat(bundle3, lj0Var)) {
                            lj0Var.presentFragment(new bo(bundle3));
                            break;
                        }
                    } else if (!lj0Var.a0(messageObject2)) {
                        lj0Var.getOrCreateStoryViewer().F(lj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(lj0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                bq0 bq0Var = (bq0) this.b;
                bq0Var.a(i10, true);
                op0 op0Var = bq0Var.h;
                if (op0Var != null) {
                    op0Var.run(Integer.valueOf(i10));
                    break;
                }
                break;
            case 21:
                cr0 cr0Var = (cr0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = cr0Var.f;
                ArrayList arrayList8 = cr0Var.n;
                MediaController.AlbumEntry albumEntry = cr0Var.J;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.w0 w0Var = cr0Var.P;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                        }
                        if (cr0Var.Y) {
                            cr0Var.a0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i26 = cr0Var.T;
                            if (i26 != 1 && i26 != 3) {
                                i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : cr0Var.U == null ? 4 : 0;
                            }
                            PhotoViewer.t1().J2(null, cr0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i27 = cr0Var.H;
                            boolean z17 = cr0Var.I;
                            t12.h = i27;
                            t12.n = z17;
                            PhotoViewer.t1().f2(arrayList7, i10, i16, cr0Var.l0, cr0Var.x0, cr0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    hr0 hr0Var = cr0Var.t0;
                    if (hr0Var != null) {
                        switch (hr0Var.a) {
                            case 0:
                                ir0.h0(hr0Var.b, str);
                                break;
                            default:
                                ir0.h0(hr0Var.b, str);
                                break;
                        }
                    } else {
                        cr0Var.P.getSearchField().setText(str);
                        cr0Var.P.getSearchField().setSelection(str.length());
                        cr0Var.b0(cr0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(cr0Var.getParentActivity());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new pq0(cr0Var, i15));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.a;
                    cr0Var.showDialog(c2Var3);
                    TextView textView3 = (TextView) c2Var3.d(-1);
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
                    photoViewer.A2(indexOf);
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
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i28 = 0; i28 < ix0Var.getChildCount(); i28++) {
                        View childAt = ix0Var.getChildAt(i28);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < ix0Var.getHiddenChildCount(); i29++) {
                        View W = ix0Var.W(i29);
                        if (W instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) W;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < ix0Var.getCachedChildCount(); i30++) {
                        View Q2 = ix0Var.Q(i30);
                        if (Q2 instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) Q2;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < ix0Var.getAttachedScrapChildCount(); i31++) {
                        View P = ix0Var.P(i31);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) P;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((nx0Var = premiumPreviewFragment.f) == null || nx0Var.a.months >= ((nx0) arrayList10.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
                        z10 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, z10);
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
