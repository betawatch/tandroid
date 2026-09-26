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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        rv0 rv0Var = (rv0) this.b;
        boolean[] zArr = rv0Var.w;
        if (i10 == rv0Var.o0) {
            rv0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = rv0Var.L;
            org.telegram.ui.Components.xy0 xy0Var = rv0Var.Q;
            if (xy0Var != null) {
                xy0Var.f();
            }
            if (rv0Var.I) {
                int i11 = -rv0Var.O;
                rv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == rv0Var.r0) {
                z10 = !rv0Var.G;
                rv0Var.G = z10;
            } else {
                int i12 = rv0Var.u0;
                if (i10 == i12) {
                    z10 = !rv0Var.H;
                    rv0Var.H = z10;
                } else if (i10 == rv0Var.v0) {
                    boolean z12 = !rv0Var.J;
                    rv0Var.J = z12;
                    rv0Var.r0();
                    int i13 = rv0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        rv0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        rv0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == rv0Var.s0) {
                    boolean z13 = rv0Var.K;
                    boolean z14 = !z13;
                    rv0Var.K = z14;
                    if (!z13 && rv0Var.L) {
                        int i14 = rv0Var.j0;
                        rv0Var.L = false;
                        rv0Var.r0();
                        s4.c1 K = rv0Var.c.K(rv0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.a).setChecked(false);
                        } else {
                            rv0Var.b.m(rv0Var.t0);
                        }
                        rv0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (rv0Var.N != 0) {
                        return;
                    }
                    z10 = !rv0Var.L;
                    rv0Var.L = z10;
                    int i15 = rv0Var.j0;
                    rv0Var.r0();
                    if (rv0Var.L) {
                        rv0Var.b.s(rv0Var.j0, 2);
                    } else {
                        rv0Var.b.t(i15, 2);
                    }
                    if (rv0Var.L && rv0Var.K) {
                        rv0Var.K = false;
                        s4.c1 K2 = rv0Var.c.K(rv0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.a).setChecked(false);
                        } else {
                            rv0Var.b.m(rv0Var.s0);
                        }
                    }
                    if (rv0Var.L) {
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
            if (rv0Var.M && !rv0Var.L) {
                rv0Var.h.b(true);
            }
            rv0Var.c.getChildCount();
            for (int i17 = rv0Var.n0; i17 < rv0Var.n0 + rv0Var.y; i17++) {
                s4.c1 K3 = rv0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(rv0Var.L, true);
                        d6Var.r.a(zArr[i17 - rv0Var.n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == rv0Var.t0 && !rv0Var.M) {
                            rv0Var.h.f(d6Var.getCheckBox(), true);
                            rv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            rv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        yx0 yx0Var = (yx0) this.b;
        int i11 = yx0Var.y;
        if (i10 == yx0Var.w) {
            org.telegram.ui.ActionBar.a2 a2Var = org.telegram.ui.Components.e5.O(yx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new wx0(yx0Var), null).a;
            a2Var.show();
            a2Var.h();
            return;
        }
        if (i10 != yx0Var.f) {
            if (i10 < yx0Var.r || i10 >= yx0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", yx0Var.getMessagesController().blockePeers.keyAt(i10 - yx0Var.r));
            yx0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            z60 z60Var = new z60(i12);
            z60Var.w = new vx0(yx0Var);
            yx0Var.presentFragment(z60Var);
            return;
        }
        jv jvVar = new jv(null);
        jvVar.d = new Paint();
        jvVar.f = new iv[2];
        jvVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        qy qyVar = new qy(bundle2);
        jvVar.a = qyVar;
        qyVar.C2 = new gv(jvVar);
        qyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        jvVar.b = contactsActivity;
        contactsActivity.W = new gv(jvVar);
        contactsActivity.onFragmentCreate();
        yx0Var.presentFragment(jvVar);
    }

    @Override // org.telegram.ui.Components.kl0
    public final void d(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        vt vtVar;
        s00 s00Var;
        org.telegram.ui.Components.xc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        cx0 cx0Var;
        int i13 = 7;
        int i14 = 4;
        qt qtVar = null;
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
                        ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                        lVar.c = true;
                        break;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z11;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                        lVar.c = true;
                        break;
                    } else if (i15 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.n90 n90Var = icVar.b;
                            n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new eu0(lVar, r11)));
                            n90Var.setSingleLine(false);
                            n90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(lVar, icVar, 3500).j();
                            int i16 = -lVar.e;
                            lVar.e = i16;
                            AndroidUtilities.shakeViewSpring(view, i16);
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
                    org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(qVar.getParentActivity(), qVar, inputStickerSet, null, null, null);
                    fy0Var.c0 = new n(qVar, view, stickerSetCovered);
                    qVar.showDialog(fy0Var);
                    break;
                }
                break;
            case 2:
                yc ycVar = (yc) this.b;
                ArrayList arrayList2 = ycVar.c;
                wb1 wb1Var = ycVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) arrayList2.get(i10);
                    ycVar.a(mpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + wb1Var.getPaddingLeft()) {
                        wb1Var.v0(-((AndroidUtilities.dp(48.0f) + wb1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        wb1Var.v0(org.telegram.messenger.f0.A(48.0f, wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = ycVar.r;
                    if (callback != null) {
                        callback.run(mpVar.a());
                        break;
                    }
                }
                break;
            case 3:
                rp rpVar = (rp) this.b;
                boolean z13 = rpVar.s;
                if (rpVar.getParentActivity() != null) {
                    s4.h0 adapter = rpVar.b.getAdapter();
                    qp qpVar = rpVar.e;
                    if (adapter == qpVar) {
                        chat = (TLRPC.Chat) qpVar.d.get(i10);
                    } else {
                        int i17 = rpVar.G;
                        chat = (i10 < i17 || i10 >= rpVar.H) ? null : (TLRPC.Chat) rpVar.v.get(i10 - i17);
                    }
                    if (chat != null) {
                        if (!z13 || rpVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            rpVar.presentFragment(new wn(bundle));
                            break;
                        } else {
                            rpVar.a0(chat, true);
                            break;
                        }
                    } else if (i10 == rpVar.F) {
                        if (z13 && rpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{rpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = rpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            g70 g70Var = new g70(bundle2);
                            g70Var.Y = new jp(rpVar);
                            rpVar.presentFragment(g70Var);
                            break;
                        } else if (!rpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) rpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rpVar.getParentActivity());
                            if (z13) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.R = string;
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(rpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                            rpVar.showDialog(a2Var);
                            TextView textView = (TextView) a2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                yp ypVar = (yp) this.b;
                ArrayList arrayList3 = ypVar.r;
                boolean z14 = ypVar.G;
                if (i10 > (z14 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z14 ? 2 : 3));
                    boolean contains = ypVar.d.contains(tL_availableReaction.reaction);
                    boolean z15 = !contains;
                    if (contains) {
                        ypVar.d.remove(tL_availableReaction.reaction);
                        if (ypVar.d.isEmpty()) {
                            xp xpVar = ypVar.h;
                            if (xpVar != null) {
                                xpVar.t(ypVar.G ? 1 : 2, arrayList3.size() + 1);
                            }
                            ypVar.V(2, true);
                        }
                    } else {
                        ypVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z15, true);
                    }
                    org.telegram.ui.Components.op opVar = yVar.d;
                    if (opVar != null) {
                        opVar.a(z15, true);
                        break;
                    }
                }
                break;
            case 5:
                jt jtVar = (jt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((mt) view).d;
                nt ntVar = jtVar.a;
                zg.b0 reactionsWindow = ntVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ly0.c(null, ntVar.c0, ntVar.z.getContext(), new b5(jtVar, 9));
                    break;
                } else {
                    lt ltVar = ntVar.l;
                    if (ltVar != null) {
                        ltVar.w(stickerSetCovered2.set, TextUtils.join("", ntVar.o));
                    }
                    ntVar.p();
                    break;
                }
            case 6:
                wt wtVar = (wt) this.b;
                if (wtVar.f && wtVar.e) {
                    ut utVar = wtVar.d;
                    ArrayList arrayList4 = utVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        qtVar = (qt) utVar.e.get(i10);
                    }
                } else {
                    int S = wtVar.c.S(i10);
                    int Q = wtVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        qtVar = wtVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    wtVar.finishFragment();
                    if (qtVar != null && (vtVar = wtVar.r) != null) {
                        vtVar.a1(qtVar);
                        break;
                    }
                }
                break;
            case 7:
                ru ruVar = (ru) this.b;
                ArrayList arrayList5 = ruVar.c3;
                vu vuVar = ruVar.o3;
                if (!(view instanceof ku) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vuVar.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new nu(ruVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.a;
                        vuVar.showDialog(a2Var2);
                        TextView textView2 = (TextView) a2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                            break;
                        }
                    }
                } else {
                    mu muVar = (mu) arrayList5.get(i10);
                    if (muVar != null) {
                        int i18 = muVar.h;
                        if (i18 >= 0) {
                            ruVar.i3[i18] = !r3[i18];
                            ruVar.A1(true);
                            break;
                        } else if (i18 == -2) {
                            vuVar.presentFragment(new DataAutoDownloadActivity(ruVar.Y2 - 1));
                            break;
                        }
                    }
                }
                break;
            case 8:
                yz.V((yz) this.b, view, i10);
                break;
            case 9:
                b10 b10Var = (b10) this.b;
                if (b10Var.getParentActivity() != null && (s00Var = (s00) b10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = s00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = s00Var.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                            b10Var.v0(s00Var, zaVar.getName(), zaVar.getCurrentObject(), s00Var.g);
                            break;
                        } else if (i19 == 7) {
                            tt ttVar = new tt(13, b10Var, s00Var);
                            if (b10Var.c.isEnabled()) {
                                b10Var.s0(ttVar, false);
                                break;
                            } else {
                                ttVar.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && s00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = b10Var.r;
                            org.telegram.ui.ActionBar.d6 d6Var = null;
                            if (!b10Var.s || b10Var.c.getAlpha() <= 0.0f) {
                                if ((!TextUtils.isEmpty(b10Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (b10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && b10Var.G.isEmpty() && !b10Var.F.isEmpty()) {
                                    b10Var.s0(new c00(b10Var, 1), false);
                                    break;
                                } else {
                                    float f7 = -b10Var.Q;
                                    b10Var.Q = f7;
                                    AndroidUtilities.shakeViewSpring(view, f7);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(b10Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((b10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (b10Var.G.isEmpty()) {
                                            a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (b10Var.F.isEmpty()) {
                                        a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.xc.a0(b10Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.ok.p(i11, a02, null);
                                    break;
                                }
                            } else {
                                float f10 = -b10Var.Q;
                                b10Var.Q = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                b10Var.v = true;
                                fj fjVar = b10Var.R;
                                if (fjVar == null || fjVar.getVisibility() != 0) {
                                    fj fjVar2 = new fj(6, 3, b10Var.getParentActivity(), d6Var, true);
                                    b10Var.R = fjVar2;
                                    fjVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    b10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    b10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    b10Var.getParentLayout().getOverlayContainerView().addView(b10Var.R, marginLayoutParams);
                                    b10Var.R.f(b10Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                n00 n00Var = (n00) this.b;
                ArrayList arrayList6 = n00Var.d0;
                int i20 = i10 - 1;
                if (i20 >= 0 && i20 < arrayList6.size()) {
                    s00 s00Var2 = (s00) arrayList6.get(i20);
                    int i21 = s00Var2.a;
                    if (i21 == 7) {
                        n00Var.dismiss();
                        n00Var.n.presentFragment(new yz(n00Var.X, s00Var2.m));
                        break;
                    } else if (i21 == 8) {
                        n00Var.Q();
                        break;
                    }
                }
                break;
            case 11:
                t10 t10Var = (t10) this.b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.s2) {
                    t10Var.f(i10, view, ((org.telegram.ui.Cells.s2) view).getMessage(), 0);
                    break;
                }
                break;
            case 12:
                i70 i70Var = (i70) this.b;
                if (i70Var.getParentActivity() != null) {
                    if (i10 == i70Var.n || i10 == 0) {
                        if (i70Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", i70Var.f.link));
                                org.telegram.ui.Components.xc.j(i70Var).j();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else if (i10 != i70Var.s) {
                        if (i10 == i70Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i70Var.getParentActivity());
                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new du(i70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            i70Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (i70Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", i70Var.f.link);
                            i70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case 13:
                o70.U((o70) this.b, view, i10);
                break;
            case 14:
                g80.U((g80) this.b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                break;
            case 16:
                cd0 cd0Var = (cd0) this.b;
                cd0Var.i0 = -1L;
                int i22 = cd0Var.G0;
                if (i22 != 4) {
                    if (i22 == 5) {
                        IMapsProvider.IMap iMap = cd0Var.I;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = cd0Var.z0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), cd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = cd0Var.B0) == null || (messageObject.isLiveLocation() && i22 != 6)) {
                        if (i10 != 1 || i22 == 2) {
                            if (i22 != 2 || !cd0Var.getLocationController().isSharingLocation(cd0Var.e0) || cd0Var.T.j(i10) != 7) {
                                if (i22 != 2 || !cd0Var.getLocationController().isSharingLocation(cd0Var.e0) || cd0Var.T.j(i10) != 6) {
                                    if ((i10 != 2 || i22 != 1) && ((i10 != 1 || i22 != 2) && (i10 != 3 || i22 != 3))) {
                                        Object J = cd0Var.T.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            cd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, cd0Var.G0, true, 0, 0L);
                                            cd0Var.finishFragment();
                                            break;
                                        } else if (J instanceof wc0) {
                                            wc0 wc0Var = (wc0) J;
                                            cd0Var.i0 = wc0Var.a;
                                            if (cd0Var.j0) {
                                                cd0Var.j0 = false;
                                                cd0Var.C0();
                                            }
                                            cd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var.e.getPosition(), cd0Var.I.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (cd0Var.getLocationController().isSharingLocation(cd0Var.e0)) {
                                        cd0Var.getLocationController().removeSharingLocation(cd0Var.e0);
                                        cd0Var.T.l();
                                        cd0Var.finishFragment();
                                        break;
                                    } else {
                                        cd0Var.s0(false);
                                        break;
                                    }
                                } else {
                                    cd0Var.s0(cd0Var.getLocationController().getSharingLocationInfo(cd0Var.e0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                cd0Var.getLocationController().removeSharingLocation(cd0Var.e0);
                                cd0Var.T.l();
                                cd0Var.finishFragment();
                                break;
                            }
                        } else if (cd0Var.F0 != null && cd0Var.x0 != null) {
                            FrameLayout frameLayout = cd0Var.o0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(cd0Var.x0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(cd0Var.x0.getLongitude());
                                cd0Var.F0.b(tL_messageMediaGeo, cd0Var.G0, true, 0, 0L);
                                cd0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = cd0Var.I;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = cd0Var.B0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), cd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) cd0Var.T.J(i10)) != null) {
                    if (cd0Var.e0 == 0) {
                        cd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        cd0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.a2[] a2VarArr = {new org.telegram.ui.ActionBar.a2(cd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = cd0Var.getMessagesController().getInputChannel(-cd0Var.e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        a2VarArr[0].setOnCancelListener(new ba(cd0Var, cd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(cd0Var, a2VarArr, tL_messageMediaVenue, 19)), i13));
                        cd0Var.showDialog(a2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((vi0) this.b).onBackPressed();
                break;
            case 18:
                dj0 dj0Var = (dj0) this.b;
                int i23 = dj0Var.I;
                if (i10 >= i23 && i10 < dj0Var.J) {
                    MessageObject messageObject2 = (MessageObject) dj0Var.x.get(i10 - i23);
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
                        if (dj0Var.getMessagesController().checkCanOpenChat(bundle3, dj0Var)) {
                            dj0Var.presentFragment(new wn(bundle3));
                            break;
                        }
                    } else if (!dj0Var.a0(messageObject2)) {
                        dj0Var.getOrCreateStoryViewer().F(dj0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(dj0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                sp0 sp0Var = (sp0) this.b;
                sp0Var.a(i10, true);
                fp0 fp0Var = sp0Var.h;
                if (fp0Var != null) {
                    fp0Var.run(Integer.valueOf(i10));
                    break;
                }
                break;
            case 21:
                tq0 tq0Var = (tq0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = tq0Var.f;
                ArrayList arrayList8 = tq0Var.n;
                MediaController.AlbumEntry albumEntry = tq0Var.J;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.u0 u0Var = tq0Var.P;
                        if (u0Var != null) {
                            AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                        }
                        if (tq0Var.Y) {
                            tq0Var.a0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i24 = tq0Var.T;
                            int i25 = (i24 == 1 || i24 == 3) ? 1 : i24 == 2 ? 3 : i24 == 10 ? 10 : tq0Var.U == null ? 4 : 0;
                            PhotoViewer.t1().J2(null, tq0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i26 = tq0Var.H;
                            boolean z16 = tq0Var.I;
                            t12.h = i26;
                            t12.n = z16;
                            PhotoViewer.t1().f2(arrayList7, i10, i25, tq0Var.l0, tq0Var.x0, tq0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    xq0 xq0Var = tq0Var.t0;
                    if (xq0Var != null) {
                        switch (xq0Var.a) {
                            case 0:
                                yq0.h0(xq0Var.b, str);
                                break;
                            default:
                                yq0.h0(xq0Var.b, str);
                                break;
                        }
                    } else {
                        tq0Var.P.getSearchField().setText(str);
                        tq0Var.P.getSearchField().setSelection(str.length());
                        tq0Var.b0(tq0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(tq0Var.getParentActivity());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new gq0(tq0Var, i14));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder4.a;
                    tq0Var.showDialog(a2Var3);
                    TextView textView3 = (TextView) a2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
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
                ax0 ax0Var = (ax0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = ax0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                xw0 xw0Var = ax0Var.e;
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i27 = 0; i27 < xw0Var.getChildCount(); i27++) {
                        View childAt = xw0Var.getChildAt(i27);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i28 = 0; i28 < xw0Var.getHiddenChildCount(); i28++) {
                        View V = xw0Var.V(i28);
                        if (V instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) V;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < xw0Var.getCachedChildCount(); i29++) {
                        View P = xw0Var.P(i29);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) P;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < xw0Var.getAttachedScrapChildCount(); i30++) {
                        View O = xw0Var.O(i30);
                        if (O instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) O;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((cx0Var = premiumPreviewFragment.f) == null || cx0Var.a.months >= ((cx0) arrayList10.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
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
