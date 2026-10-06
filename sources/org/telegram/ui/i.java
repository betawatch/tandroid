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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        uv0 uv0Var = (uv0) this.b;
        boolean[] zArr = uv0Var.w;
        if (i10 == uv0Var.o0) {
            uv0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = uv0Var.L;
            org.telegram.ui.Components.jz0 jz0Var = uv0Var.Q;
            if (jz0Var != null) {
                jz0Var.f();
            }
            if (uv0Var.I) {
                int i11 = -uv0Var.O;
                uv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == uv0Var.r0) {
                z10 = !uv0Var.G;
                uv0Var.G = z10;
            } else {
                int i12 = uv0Var.u0;
                if (i10 == i12) {
                    z10 = !uv0Var.H;
                    uv0Var.H = z10;
                } else if (i10 == uv0Var.v0) {
                    boolean z12 = !uv0Var.J;
                    uv0Var.J = z12;
                    uv0Var.r0();
                    int i13 = uv0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        uv0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        uv0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == uv0Var.s0) {
                    boolean z13 = uv0Var.K;
                    boolean z14 = !z13;
                    uv0Var.K = z14;
                    if (!z13 && uv0Var.L) {
                        int i14 = uv0Var.j0;
                        uv0Var.L = false;
                        uv0Var.r0();
                        s4.c1 K = uv0Var.c.K(uv0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.a).setChecked(false);
                        } else {
                            uv0Var.b.m(uv0Var.t0);
                        }
                        uv0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (uv0Var.N != 0) {
                        return;
                    }
                    z10 = !uv0Var.L;
                    uv0Var.L = z10;
                    int i15 = uv0Var.j0;
                    uv0Var.r0();
                    if (uv0Var.L) {
                        uv0Var.b.s(uv0Var.j0, 2);
                    } else {
                        uv0Var.b.t(i15, 2);
                    }
                    if (uv0Var.L && uv0Var.K) {
                        uv0Var.K = false;
                        s4.c1 K2 = uv0Var.c.K(uv0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.a).setChecked(false);
                        } else {
                            uv0Var.b.m(uv0Var.s0);
                        }
                    }
                    if (uv0Var.L) {
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
            if (uv0Var.M && !uv0Var.L) {
                uv0Var.h.b(true);
            }
            uv0Var.c.getChildCount();
            for (int i17 = uv0Var.n0; i17 < uv0Var.n0 + uv0Var.y; i17++) {
                s4.c1 K3 = uv0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(uv0Var.L, true);
                        d6Var.r.a(zArr[i17 - uv0Var.n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == uv0Var.t0 && !uv0Var.M) {
                            uv0Var.h.f(d6Var.getCheckBox(), true);
                            uv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            uv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        by0 by0Var = (by0) this.b;
        int i11 = by0Var.y;
        if (i10 == by0Var.w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(by0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new zx0(by0Var), null).a;
            b2Var.show();
            b2Var.h();
            return;
        }
        if (i10 != by0Var.f) {
            if (i10 < by0Var.r || i10 >= by0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", by0Var.getMessagesController().blockePeers.keyAt(i10 - by0Var.r));
            by0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            d70 d70Var = new d70(i12);
            d70Var.w = new yx0(by0Var);
            by0Var.presentFragment(d70Var);
            return;
        }
        nv nvVar = new nv(null);
        nvVar.d = new Paint();
        nvVar.f = new mv[2];
        nvVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        uy uyVar = new uy(bundle2);
        nvVar.a = uyVar;
        uyVar.C2 = new kv(nvVar);
        uyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        nvVar.b = contactsActivity;
        contactsActivity.W = new kv(nvVar);
        contactsActivity.onFragmentCreate();
        by0Var.presentFragment(nvVar);
    }

    @Override // org.telegram.ui.Components.ml0
    public final void d(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        yt ytVar;
        w00 w00Var;
        org.telegram.ui.Components.yc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        fx0 fx0Var;
        int i13 = 3;
        int i14 = 7;
        int i15 = 4;
        ut utVar = null;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                ArrayList arrayList = lVar.h;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    int i16 = ((j) arrayList.get(i10)).d;
                    if (i16 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z10;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                        lVar.c = true;
                        break;
                    } else if (i16 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.c = true;
                        break;
                    } else if (i16 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.jc jcVar = new org.telegram.ui.Components.jc(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.q90 q90Var = jcVar.b;
                            q90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.i6.Gi, 0, new hu0(lVar, i13)));
                            q90Var.setSingleLine(false);
                            q90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            jcVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.rc.g(lVar, jcVar, 3500).j();
                            int i17 = -lVar.e;
                            lVar.e = i17;
                            AndroidUtilities.shakeViewSpring(view, i17);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                            boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                            ((org.telegram.ui.Cells.w8) view).setChecked(z12);
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
                    org.telegram.ui.Components.ry0 ry0Var = new org.telegram.ui.Components.ry0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    ry0Var.c0 = new n(qVar, view, stickerSetCovered);
                    qVar.showDialog(ry0Var);
                    break;
                }
                break;
            case 2:
                ad adVar = (ad) this.b;
                ArrayList arrayList2 = adVar.c;
                xb1 xb1Var = adVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) arrayList2.get(i10);
                    adVar.a(opVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + xb1Var.getPaddingLeft()) {
                        xb1Var.w0(-((AndroidUtilities.dp(48.0f) + xb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (xb1Var.getMeasuredWidth() - xb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        xb1Var.w0(org.telegram.messenger.q.A(48.0f, xb1Var.getMeasuredWidth() - xb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = adVar.r;
                    if (callback != null) {
                        callback.run(opVar.a());
                        break;
                    }
                }
                break;
            case 3:
                tp tpVar = (tp) this.b;
                boolean z13 = tpVar.s;
                if (tpVar.getParentActivity() != null) {
                    s4.h0 adapter = tpVar.b.getAdapter();
                    sp spVar = tpVar.e;
                    if (adapter == spVar) {
                        chat = (TLRPC.Chat) spVar.d.get(i10);
                    } else {
                        int i18 = tpVar.G;
                        chat = (i10 < i18 || i10 >= tpVar.H) ? null : (TLRPC.Chat) tpVar.v.get(i10 - i18);
                    }
                    if (chat != null) {
                        if (!z13 || tpVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            tpVar.presentFragment(new yn(bundle));
                            break;
                        } else {
                            tpVar.Z(chat, true);
                            break;
                        }
                    } else if (i10 == tpVar.F) {
                        if (z13 && tpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{tpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = tpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            k70 k70Var = new k70(bundle2);
                            k70Var.Y = new lp(tpVar);
                            tpVar.presentFragment(k70Var);
                            break;
                        } else if (!tpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) tpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tpVar.getParentActivity());
                            if (z13) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.R = string;
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(tpVar, 24));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            tpVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                aq aqVar = (aq) this.b;
                ArrayList arrayList3 = aqVar.n;
                if (i10 > 2) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - 3);
                    boolean contains = aqVar.d.contains(tL_availableReaction.reaction);
                    boolean z14 = !contains;
                    if (contains) {
                        aqVar.d.remove(tL_availableReaction.reaction);
                        if (aqVar.d.isEmpty()) {
                            zp zpVar = aqVar.h;
                            if (zpVar != null) {
                                zpVar.t(2, arrayList3.size() + 1);
                            }
                            aqVar.T(2, true);
                        }
                    } else {
                        aqVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z14, true);
                    }
                    org.telegram.ui.Components.qp qpVar = yVar.d;
                    if (qpVar != null) {
                        qpVar.a(z14, true);
                        break;
                    }
                }
                break;
            case 5:
                nt ntVar = (nt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((qt) view).d;
                rt rtVar = ntVar.a;
                zg.z reactionsWindow = rtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.xy0.c(null, rtVar.c0, rtVar.z.getContext(), new c5(ntVar, 9));
                    break;
                } else {
                    pt ptVar = rtVar.l;
                    if (ptVar != null) {
                        ptVar.w(stickerSetCovered2.set, TextUtils.join("", rtVar.o));
                    }
                    rtVar.p();
                    break;
                }
            case 6:
                zt ztVar = (zt) this.b;
                if (ztVar.f && ztVar.e) {
                    xt xtVar = ztVar.d;
                    ArrayList arrayList4 = xtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        utVar = (ut) xtVar.e.get(i10);
                    }
                } else {
                    int S = ztVar.c.S(i10);
                    int Q = ztVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        utVar = ztVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    ztVar.finishFragment();
                    if (utVar != null && (ytVar = ztVar.r) != null) {
                        ytVar.b1(utVar);
                        break;
                    }
                }
                break;
            case 7:
                vu vuVar = (vu) this.b;
                ArrayList arrayList5 = vuVar.j3;
                zu zuVar = vuVar.v3;
                if (!(view instanceof ou) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zuVar.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ru(vuVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                        zuVar.showDialog(b2Var2);
                        TextView textView2 = (TextView) b2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
                            break;
                        }
                    }
                } else {
                    qu quVar = (qu) arrayList5.get(i10);
                    if (quVar != null) {
                        int i19 = quVar.h;
                        if (i19 >= 0) {
                            vuVar.p3[i19] = !r3[i19];
                            vuVar.B1(true);
                            break;
                        } else if (i19 == -2) {
                            zuVar.presentFragment(new DataAutoDownloadActivity(vuVar.f3 - 1));
                            break;
                        }
                    }
                }
                break;
            case 8:
                c00.T((c00) this.b, view, i10);
                break;
            case 9:
                f10 f10Var = (f10) this.b;
                if (f10Var.getParentActivity() != null && (w00Var = (w00) f10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = w00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i20 = w00Var.a;
                        if (i20 == 1) {
                            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                            f10Var.v0(w00Var, zaVar.getName(), zaVar.getCurrentObject(), w00Var.g);
                            break;
                        } else if (i20 == 7) {
                            cu cuVar = new cu(11, f10Var, w00Var);
                            if (f10Var.c.isEnabled()) {
                                f10Var.s0(cuVar, false);
                                break;
                            } else {
                                cuVar.run();
                                break;
                            }
                        } else if (i20 == 8 || (i20 == 4 && w00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = f10Var.r;
                            org.telegram.ui.ActionBar.d6 d6Var = null;
                            if (!f10Var.s || f10Var.c.getAlpha() <= 0.0f) {
                                if ((!TextUtils.isEmpty(f10Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (f10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && f10Var.G.isEmpty() && !f10Var.F.isEmpty()) {
                                    f10Var.s0(new g00(f10Var, 1), false);
                                    break;
                                } else {
                                    float f7 = -f10Var.Q;
                                    f10Var.Q = f7;
                                    AndroidUtilities.shakeViewSpring(view, f7);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(f10Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((f10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (f10Var.G.isEmpty()) {
                                            a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (f10Var.F.isEmpty()) {
                                        a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.yc.a0(f10Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.bi.o(i11, a02, null);
                                    break;
                                }
                            } else {
                                float f10 = -f10Var.Q;
                                f10Var.Q = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                f10Var.v = true;
                                gj gjVar = f10Var.R;
                                if (gjVar == null || gjVar.getVisibility() != 0) {
                                    gj gjVar2 = new gj(6, 2, f10Var.getParentActivity(), d6Var, true);
                                    f10Var.R = gjVar2;
                                    gjVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    f10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    f10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    f10Var.getParentLayout().getOverlayContainerView().addView(f10Var.R, marginLayoutParams);
                                    f10Var.R.f(f10Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                r00 r00Var = (r00) this.b;
                ArrayList arrayList6 = r00Var.d0;
                int i21 = i10 - 1;
                if (i21 >= 0 && i21 < arrayList6.size()) {
                    w00 w00Var2 = (w00) arrayList6.get(i21);
                    int i22 = w00Var2.a;
                    if (i22 == 7) {
                        r00Var.dismiss();
                        r00Var.n.presentFragment(new c00(r00Var.X, w00Var2.m));
                        break;
                    } else if (i22 == 8) {
                        r00Var.O();
                        break;
                    }
                }
                break;
            case 11:
                x10 x10Var = (x10) this.b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    x10Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
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
                                org.telegram.ui.Components.yc.j(m70Var).j();
                                break;
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                return;
                            }
                        }
                    } else if (i10 != m70Var.s) {
                        if (i10 == m70Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(m70Var.getParentActivity());
                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new bu(m70Var, 13));
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            case 13:
                s70.S((s70) this.b, view, i10);
                break;
            case 14:
                k80.S((k80) this.b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.S((LanguageSelectActivity) this.b, view, i10);
                break;
            case 16:
                gd0 gd0Var = (gd0) this.b;
                gd0Var.i0 = -1L;
                int i23 = gd0Var.G0;
                if (i23 != 4) {
                    if (i23 == 5) {
                        IMapsProvider.IMap iMap = gd0Var.I;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = gd0Var.z0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), gd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = gd0Var.B0) == null || (messageObject.isLiveLocation() && i23 != 6)) {
                        if (i10 != 1 || i23 == 2) {
                            if (i23 != 2 || !gd0Var.getLocationController().isSharingLocation(gd0Var.e0) || gd0Var.T.j(i10) != 7) {
                                if (i23 != 2 || !gd0Var.getLocationController().isSharingLocation(gd0Var.e0) || gd0Var.T.j(i10) != 6) {
                                    if ((i10 != 2 || i23 != 1) && ((i10 != 1 || i23 != 2) && (i10 != 3 || i23 != 3))) {
                                        Object J = gd0Var.T.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            gd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, gd0Var.G0, true, 0, 0L);
                                            gd0Var.finishFragment();
                                            break;
                                        } else if (J instanceof ad0) {
                                            ad0 ad0Var = (ad0) J;
                                            gd0Var.i0 = ad0Var.a;
                                            if (gd0Var.j0) {
                                                gd0Var.j0 = false;
                                                gd0Var.C0();
                                            }
                                            gd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(ad0Var.e.getPosition(), gd0Var.I.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (gd0Var.getLocationController().isSharingLocation(gd0Var.e0)) {
                                        gd0Var.getLocationController().removeSharingLocation(gd0Var.e0);
                                        gd0Var.T.l();
                                        gd0Var.finishFragment();
                                        break;
                                    } else {
                                        gd0Var.s0(false);
                                        break;
                                    }
                                } else {
                                    gd0Var.s0(gd0Var.getLocationController().getSharingLocationInfo(gd0Var.e0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                gd0Var.getLocationController().removeSharingLocation(gd0Var.e0);
                                gd0Var.T.l();
                                gd0Var.finishFragment();
                                break;
                            }
                        } else if (gd0Var.F0 != null && gd0Var.x0 != null) {
                            FrameLayout frameLayout = gd0Var.o0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(gd0Var.x0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(gd0Var.x0.getLongitude());
                                gd0Var.F0.b(tL_messageMediaGeo, gd0Var.G0, true, 0, 0L);
                                gd0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = gd0Var.I;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = gd0Var.B0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), gd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) gd0Var.T.J(i10)) != null) {
                    if (gd0Var.e0 == 0) {
                        gd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        gd0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(gd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = gd0Var.getMessagesController().getInputChannel(-gd0Var.e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        b2VarArr[0].setOnCancelListener(new da(gd0Var, gd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ca(gd0Var, b2VarArr, tL_messageMediaVenue, 19)), i14));
                        gd0Var.showDialog(b2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((zi0) this.b).onBackPressed();
                break;
            case 18:
                hj0 hj0Var = (hj0) this.b;
                int i24 = hj0Var.I;
                if (i10 >= i24 && i10 < hj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) hj0Var.x.get(i10 - i24);
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
                        if (hj0Var.getMessagesController().checkCanOpenChat(bundle3, hj0Var)) {
                            hj0Var.presentFragment(new yn(bundle3));
                            break;
                        }
                    } else if (!hj0Var.Z(messageObject2)) {
                        hj0Var.getOrCreateStoryViewer().F(hj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(hj0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.T((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                vp0 vp0Var = (vp0) this.b;
                vp0Var.a(i10, true);
                ip0 ip0Var = vp0Var.h;
                if (ip0Var != null) {
                    ip0Var.run(Integer.valueOf(i10));
                    break;
                }
                break;
            case 21:
                wq0 wq0Var = (wq0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = wq0Var.f;
                ArrayList arrayList8 = wq0Var.n;
                MediaController.AlbumEntry albumEntry = wq0Var.J;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.v0 v0Var = wq0Var.P;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                        }
                        if (wq0Var.Y) {
                            wq0Var.Z(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i25 = wq0Var.T;
                            int i26 = (i25 == 1 || i25 == 3) ? 1 : i25 == 2 ? 3 : i25 == 10 ? 10 : wq0Var.U == null ? 4 : 0;
                            PhotoViewer.t1().K2(null, wq0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i27 = wq0Var.H;
                            boolean z15 = wq0Var.I;
                            t12.h = i27;
                            t12.n = z15;
                            PhotoViewer.t1().g2(arrayList7, i10, i26, wq0Var.l0, wq0Var.x0, wq0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    ar0 ar0Var = wq0Var.t0;
                    if (ar0Var != null) {
                        switch (ar0Var.a) {
                            case 0:
                                br0.h0(ar0Var.b, str);
                                break;
                            default:
                                br0.h0(ar0Var.b, str);
                                break;
                        }
                    } else {
                        wq0Var.P.getSearchField().setText(str);
                        wq0Var.P.getSearchField().setSelection(str.length());
                        wq0Var.b0(wq0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wq0Var.getParentActivity());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new jq0(wq0Var, i15));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.a;
                    wq0Var.showDialog(b2Var3);
                    TextView textView3 = (TextView) b2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.q7, false));
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
                PremiumPreviewFragment.S((PremiumPreviewFragment) this.b, view, i10);
                break;
            case 25:
                dx0 dx0Var = (dx0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = dx0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                ax0 ax0Var = dx0Var.e;
                if (view.isEnabled() && (view instanceof rg.r1)) {
                    rg.r1 r1Var = (rg.r1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(r1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    r1Var.c(true, true);
                    for (int i28 = 0; i28 < ax0Var.getChildCount(); i28++) {
                        View childAt = ax0Var.getChildAt(i28);
                        if (childAt instanceof rg.r1) {
                            rg.r1 r1Var2 = (rg.r1) childAt;
                            if (r1Var2.getTier() != r1Var.getTier()) {
                                r1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < ax0Var.getHiddenChildCount(); i29++) {
                        View V = ax0Var.V(i29);
                        if (V instanceof rg.r1) {
                            rg.r1 r1Var3 = (rg.r1) V;
                            if (r1Var3.getTier() != r1Var.getTier()) {
                                r1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < ax0Var.getCachedChildCount(); i30++) {
                        View P = ax0Var.P(i30);
                        if (P instanceof rg.r1) {
                            rg.r1 r1Var4 = (rg.r1) P;
                            if (r1Var4.getTier() != r1Var.getTier()) {
                                r1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < ax0Var.getAttachedScrapChildCount(); i31++) {
                        View O = ax0Var.O(i31);
                        if (O instanceof rg.r1) {
                            rg.r1 r1Var5 = (rg.r1) O;
                            if (r1Var5.getTier() != r1Var.getTier()) {
                                r1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((fx0Var = premiumPreviewFragment.f) == null || fx0Var.a.months >= ((fx0) arrayList10.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
                        r6 = false;
                    }
                    AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, r6);
                    break;
                }
                break;
            case 26:
                PrivacyControlActivity.W((PrivacyControlActivity) this.b, view, i10);
                break;
            case 27:
                b(i10, view);
                break;
            case 28:
                ProfileActivity.f0((ProfileActivity) this.b, i10);
                break;
            default:
                ProxyListActivity.S((ProxyListActivity) this.b, view, i10);
                break;
        }
    }
}
