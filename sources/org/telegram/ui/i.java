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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        tv0 tv0Var = (tv0) this.b;
        boolean[] zArr = tv0Var.w;
        if (i10 == tv0Var.o0) {
            tv0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.x8) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            boolean z11 = tv0Var.L;
            org.telegram.ui.Components.my0 my0Var = tv0Var.Q;
            if (my0Var != null) {
                my0Var.f();
            }
            if (tv0Var.I) {
                int i11 = -tv0Var.O;
                tv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(x8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == tv0Var.r0) {
                z10 = !tv0Var.G;
                tv0Var.G = z10;
            } else {
                int i12 = tv0Var.u0;
                if (i10 == i12) {
                    z10 = !tv0Var.H;
                    tv0Var.H = z10;
                } else if (i10 == tv0Var.v0) {
                    boolean z12 = !tv0Var.J;
                    tv0Var.J = z12;
                    tv0Var.r0();
                    int i13 = tv0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        tv0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        tv0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == tv0Var.s0) {
                    boolean z13 = tv0Var.K;
                    boolean z14 = !z13;
                    tv0Var.K = z14;
                    if (!z13 && tv0Var.L) {
                        int i14 = tv0Var.j0;
                        tv0Var.L = false;
                        tv0Var.r0();
                        s4.c1 K = tv0Var.c.K(tv0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.x8) K.a).setChecked(false);
                        } else {
                            tv0Var.b.m(tv0Var.t0);
                        }
                        tv0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (tv0Var.N != 0) {
                        return;
                    }
                    z10 = !tv0Var.L;
                    tv0Var.L = z10;
                    int i15 = tv0Var.j0;
                    tv0Var.r0();
                    if (tv0Var.L) {
                        tv0Var.b.s(tv0Var.j0, 2);
                    } else {
                        tv0Var.b.t(i15, 2);
                    }
                    if (tv0Var.L && tv0Var.K) {
                        tv0Var.K = false;
                        s4.c1 K2 = tv0Var.c.K(tv0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.x8) K2.a).setChecked(false);
                        } else {
                            tv0Var.b.m(tv0Var.s0);
                        }
                    }
                    if (tv0Var.L) {
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
            if (tv0Var.M && !tv0Var.L) {
                tv0Var.h.b(true);
            }
            tv0Var.c.getChildCount();
            for (int i17 = tv0Var.n0; i17 < tv0Var.n0 + tv0Var.y; i17++) {
                s4.c1 K3 = tv0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(tv0Var.L, true);
                        d6Var.r.a(zArr[i17 - tv0Var.n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == tv0Var.t0 && !tv0Var.M) {
                            tv0Var.h.f(d6Var.getCheckBox(), true);
                            tv0Var.M = true;
                        }
                    }
                }
            }
            x8Var.setChecked(z10);
            tv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        zx0 zx0Var = (zx0) this.b;
        int i11 = zx0Var.y;
        if (i10 == zx0Var.w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.e5.O(zx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new xx0(zx0Var), null).a;
            b2Var.show();
            b2Var.h();
            return;
        }
        if (i10 != zx0Var.f) {
            if (i10 < zx0Var.r || i10 >= zx0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", zx0Var.getMessagesController().blockePeers.keyAt(i10 - zx0Var.r));
            zx0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = a4.a.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            b70 b70Var = new b70(i12);
            b70Var.w = new wx0(zx0Var);
            zx0Var.presentFragment(b70Var);
            return;
        }
        kv kvVar = new kv(null);
        kvVar.d = new Paint();
        kvVar.f = new jv[2];
        kvVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        ry ryVar = new ry(bundle2);
        kvVar.a = ryVar;
        ryVar.C2 = new hv(kvVar);
        ryVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        kvVar.b = contactsActivity;
        contactsActivity.W = new hv(kvVar);
        contactsActivity.onFragmentCreate();
        zx0Var.presentFragment(kvVar);
    }

    @Override // org.telegram.ui.Components.al0
    public final void d(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        wt wtVar;
        t00 t00Var;
        org.telegram.ui.Components.xc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        ex0 ex0Var;
        int i13 = 8;
        int i14 = 7;
        int i15 = 4;
        st stVar = null;
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
                        ((org.telegram.ui.Cells.x8) view).setChecked(z11);
                        lVar.c = true;
                        break;
                    } else if (i17 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z12 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z12;
                        ((org.telegram.ui.Cells.x8) view).setChecked(z12);
                        lVar.c = true;
                        break;
                    } else if (i17 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.d90 d90Var = icVar.b;
                            d90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new fu0(lVar, r11)));
                            d90Var.setSingleLine(false);
                            d90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            icVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.qc.g(lVar, icVar, 3500).j();
                            int i18 = -lVar.e;
                            lVar.e = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                            boolean z13 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z13;
                            ((org.telegram.ui.Cells.x8) view).setChecked(z13);
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
                    org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    ux0Var.c0 = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(ux0Var);
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
                        wb1Var.v0(org.telegram.messenger.z0.z(48.0f, wb1Var.getMeasuredWidth() - wb1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = ycVar.r;
                    if (callback != null) {
                        callback.run(mpVar.a());
                        break;
                    }
                }
                break;
            case 3:
                sp spVar = (sp) this.b;
                boolean z14 = spVar.s;
                if (spVar.getParentActivity() != null) {
                    s4.h0 adapter = spVar.b.getAdapter();
                    rp rpVar = spVar.e;
                    if (adapter == rpVar) {
                        chat = (TLRPC.Chat) rpVar.d.get(i10);
                    } else {
                        int i19 = spVar.G;
                        chat = (i10 < i19 || i10 >= spVar.H) ? null : (TLRPC.Chat) spVar.v.get(i10 - i19);
                    }
                    if (chat != null) {
                        if (!z14 || spVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            spVar.presentFragment(new xn(bundle));
                            break;
                        } else {
                            spVar.a0(chat, true);
                            break;
                        }
                    } else if (i10 == spVar.F) {
                        if (z14 && spVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{spVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = spVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            i70 i70Var = new i70(bundle2);
                            i70Var.Y = new kp(spVar);
                            spVar.presentFragment(i70Var);
                            break;
                        } else if (!spVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) spVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(spVar.getParentActivity());
                            if (z14) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.R = string;
                            alertDialog$Builder.a.T = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new z0(spVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            spVar.showDialog(b2Var);
                            TextView textView = (TextView) b2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                zp zpVar = (zp) this.b;
                ArrayList arrayList3 = zpVar.r;
                boolean z15 = zpVar.G;
                if (i10 > (z15 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z15 ? 2 : 3));
                    boolean contains = zpVar.d.contains(tL_availableReaction.reaction);
                    boolean z16 = !contains;
                    if (contains) {
                        zpVar.d.remove(tL_availableReaction.reaction);
                        if (zpVar.d.isEmpty()) {
                            yp ypVar = zpVar.h;
                            if (ypVar != null) {
                                ypVar.t(zpVar.G ? 1 : 2, arrayList3.size() + 1);
                            }
                            zpVar.V(2, true);
                        }
                    } else {
                        zpVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z16, true);
                    }
                    org.telegram.ui.Components.op opVar = yVar.d;
                    if (opVar != null) {
                        opVar.a(z16, true);
                        break;
                    }
                }
                break;
            case 5:
                lt ltVar = (lt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ot) view).d;
                pt ptVar = ltVar.a;
                zg.c0 reactionsWindow = ptVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ay0.c(null, ptVar.c0, ptVar.z.getContext(), new c5(ltVar, 9));
                    break;
                } else {
                    nt ntVar = ptVar.l;
                    if (ntVar != null) {
                        ntVar.w(stickerSetCovered2.set, TextUtils.join("", ptVar.o));
                    }
                    ptVar.p();
                    break;
                }
                break;
            case 6:
                xt xtVar = (xt) this.b;
                if (xtVar.f && xtVar.e) {
                    vt vtVar = xtVar.d;
                    ArrayList arrayList4 = vtVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        stVar = (st) vtVar.e.get(i10);
                    }
                } else {
                    int S = xtVar.c.S(i10);
                    int Q = xtVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        stVar = xtVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    xtVar.finishFragment();
                    if (stVar != null && (wtVar = xtVar.r) != null) {
                        wtVar.a1(stVar);
                        break;
                    }
                }
                break;
            case 7:
                su suVar = (su) this.b;
                ArrayList arrayList5 = suVar.c3;
                wu wuVar = suVar.o3;
                if (!(view instanceof lu) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.s8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wuVar.getParentActivity());
                        alertDialog$Builder2.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new ou(suVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                        wuVar.showDialog(b2Var2);
                        TextView textView2 = (TextView) b2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q7, false));
                            break;
                        }
                    }
                } else {
                    nu nuVar = (nu) arrayList5.get(i10);
                    if (nuVar != null) {
                        int i20 = nuVar.h;
                        if (i20 >= 0) {
                            suVar.i3[i20] = !r3[i20];
                            suVar.A1(true);
                            break;
                        } else if (i20 == -2) {
                            wuVar.presentFragment(new DataAutoDownloadActivity(suVar.Y2 - 1));
                            break;
                        }
                    }
                }
                break;
            case 8:
                zz.V((zz) this.b, view, i10);
                break;
            case 9:
                c10 c10Var = (c10) this.b;
                if (c10Var.getParentActivity() != null && (t00Var = (t00) c10Var.P.get(i10)) != null) {
                    View.OnClickListener onClickListener = t00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i21 = t00Var.a;
                        if (i21 == 1) {
                            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
                            c10Var.v0(t00Var, bbVar.getName(), bbVar.getCurrentObject(), t00Var.g);
                            break;
                        } else if (i21 == 7) {
                            hw hwVar = new hw(i13, c10Var, t00Var);
                            if (c10Var.c.isEnabled()) {
                                c10Var.s0(hwVar, false);
                                break;
                            } else {
                                hwVar.run();
                                break;
                            }
                        } else if (i21 == 8 || (i21 == 4 && t00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = c10Var.r;
                            org.telegram.ui.ActionBar.d6 d6Var = null;
                            if (!c10Var.s || c10Var.c.getAlpha() <= 0.0f) {
                                if ((!TextUtils.isEmpty(c10Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (c10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && c10Var.G.isEmpty() && !c10Var.F.isEmpty()) {
                                    c10Var.s0(new d00(c10Var, 1), false);
                                    break;
                                } else {
                                    float f7 = -c10Var.Q;
                                    c10Var.Q = f7;
                                    AndroidUtilities.shakeViewSpring(view, f7);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(c10Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((c10Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (c10Var.G.isEmpty()) {
                                            a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (c10Var.F.isEmpty()) {
                                        a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.xc.a0(c10Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.z0.p(i11, a02, null);
                                    break;
                                }
                            } else {
                                float f10 = -c10Var.Q;
                                c10Var.Q = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                c10Var.v = true;
                                fj fjVar = c10Var.R;
                                if (fjVar == null || fjVar.getVisibility() != 0) {
                                    fj fjVar2 = new fj(6, 3, c10Var.getParentActivity(), d6Var, true);
                                    c10Var.R = fjVar2;
                                    fjVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    c10Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    c10Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    c10Var.getParentLayout().getOverlayContainerView().addView(c10Var.R, marginLayoutParams);
                                    c10Var.R.f(c10Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                o00 o00Var = (o00) this.b;
                ArrayList arrayList6 = o00Var.d0;
                int i22 = i10 - 1;
                if (i22 >= 0 && i22 < arrayList6.size()) {
                    t00 t00Var2 = (t00) arrayList6.get(i22);
                    int i23 = t00Var2.a;
                    if (i23 == 7) {
                        o00Var.dismiss();
                        o00Var.n.presentFragment(new zz(o00Var.X, t00Var2.m));
                        break;
                    } else if (i23 == 8) {
                        o00Var.Q();
                        break;
                    }
                }
                break;
            case 11:
                u10 u10Var = (u10) this.b;
                if (view instanceof org.telegram.ui.Cells.j7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.n7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.i7) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    u10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    break;
                }
                break;
            case 12:
                k70 k70Var = (k70) this.b;
                if (k70Var.getParentActivity() != null) {
                    if (i10 == k70Var.n || i10 == 0) {
                        if (k70Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", k70Var.f.link));
                                org.telegram.ui.Components.xc.j(k70Var).j();
                                break;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                    } else if (i10 != k70Var.s) {
                        if (i10 == k70Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(k70Var.getParentActivity());
                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new eu(k70Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            k70Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (k70Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", k70Var.f.link);
                            k70Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case 13:
                q70.U((q70) this.b, view, i10);
                break;
            case 14:
                i80.U((i80) this.b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                break;
            case 16:
                dd0 dd0Var = (dd0) this.b;
                dd0Var.i0 = -1L;
                int i24 = dd0Var.G0;
                if (i24 != 4) {
                    if (i24 == 5) {
                        IMapsProvider.IMap iMap = dd0Var.I;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = dd0Var.z0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), dd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = dd0Var.B0) == null || (messageObject.isLiveLocation() && i24 != 6)) {
                        if (i10 != 1 || i24 == 2) {
                            if (i24 != 2 || !dd0Var.getLocationController().isSharingLocation(dd0Var.e0) || dd0Var.T.j(i10) != 7) {
                                if (i24 != 2 || !dd0Var.getLocationController().isSharingLocation(dd0Var.e0) || dd0Var.T.j(i10) != 6) {
                                    if ((i10 != 2 || i24 != 1) && ((i10 != 1 || i24 != 2) && (i10 != 3 || i24 != 3))) {
                                        Object J = dd0Var.T.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            dd0Var.F0.b((TLRPC.TL_messageMediaVenue) J, dd0Var.G0, true, 0, 0L);
                                            dd0Var.finishFragment();
                                            break;
                                        } else if (J instanceof xc0) {
                                            xc0 xc0Var = (xc0) J;
                                            dd0Var.i0 = xc0Var.a;
                                            if (dd0Var.j0) {
                                                dd0Var.j0 = false;
                                                dd0Var.C0();
                                            }
                                            dd0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(xc0Var.e.getPosition(), dd0Var.I.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (dd0Var.getLocationController().isSharingLocation(dd0Var.e0)) {
                                        dd0Var.getLocationController().removeSharingLocation(dd0Var.e0);
                                        dd0Var.T.l();
                                        dd0Var.finishFragment();
                                        break;
                                    } else {
                                        dd0Var.s0(false);
                                        break;
                                    }
                                } else {
                                    dd0Var.s0(dd0Var.getLocationController().getSharingLocationInfo(dd0Var.e0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                dd0Var.getLocationController().removeSharingLocation(dd0Var.e0);
                                dd0Var.T.l();
                                dd0Var.finishFragment();
                                break;
                            }
                        } else if (dd0Var.F0 != null && dd0Var.x0 != null) {
                            FrameLayout frameLayout = dd0Var.o0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(dd0Var.x0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(dd0Var.x0.getLongitude());
                                dd0Var.F0.b(tL_messageMediaGeo, dd0Var.G0, true, 0, 0L);
                                dd0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = dd0Var.I;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = dd0Var.B0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), dd0Var.I.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) dd0Var.T.J(i10)) != null) {
                    if (dd0Var.e0 == 0) {
                        dd0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        dd0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(dd0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = dd0Var.getMessagesController().getInputChannel(-dd0Var.e0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        b2VarArr[0].setOnCancelListener(new ba(dd0Var, dd0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new aa(dd0Var, b2VarArr, tL_messageMediaVenue, 19)), i14));
                        dd0Var.showDialog(b2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((wi0) this.b).onBackPressed();
                break;
            case 18:
                ej0 ej0Var = (ej0) this.b;
                int i25 = ej0Var.I;
                if (i10 >= i25 && i10 < ej0Var.J) {
                    MessageObject messageObject2 = (MessageObject) ej0Var.x.get(i10 - i25);
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
                        if (ej0Var.getMessagesController().checkCanOpenChat(bundle3, ej0Var)) {
                            ej0Var.presentFragment(new xn(bundle3));
                            break;
                        }
                    } else if (!ej0Var.a0(messageObject2)) {
                        ej0Var.getOrCreateStoryViewer().F(ej0Var.getParentActivity(), messageObject2.storyItem, ai.u9.a(ej0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                break;
            case 20:
                tp0 tp0Var = (tp0) this.b;
                tp0Var.a(i10, true);
                gp0 gp0Var = tp0Var.h;
                if (gp0Var != null) {
                    gp0Var.run(Integer.valueOf(i10));
                    break;
                }
                break;
            case 21:
                uq0 uq0Var = (uq0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = uq0Var.f;
                ArrayList arrayList8 = uq0Var.n;
                MediaController.AlbumEntry albumEntry = uq0Var.J;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.v0 v0Var = uq0Var.P;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchField());
                        }
                        if (uq0Var.Y) {
                            uq0Var.a0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i26 = uq0Var.T;
                            if (i26 != 1 && i26 != 3) {
                                i16 = i26 == 2 ? 3 : i26 == 10 ? 10 : uq0Var.U == null ? 4 : 0;
                            }
                            PhotoViewer.t1().J2(null, uq0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i27 = uq0Var.H;
                            boolean z17 = uq0Var.I;
                            t12.h = i27;
                            t12.n = z17;
                            PhotoViewer.t1().f2(arrayList7, i10, i16, uq0Var.l0, uq0Var.x0, uq0Var.U);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    zq0 zq0Var = uq0Var.t0;
                    if (zq0Var != null) {
                        switch (zq0Var.a) {
                            case 0:
                                ar0.h0(zq0Var.b, str);
                                break;
                            default:
                                ar0.h0(zq0Var.b, str);
                                break;
                        }
                    } else {
                        uq0Var.P.getSearchField().setText(str);
                        uq0Var.P.getSearchField().setSelection(str.length());
                        uq0Var.b0(uq0Var.P.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(uq0Var.getParentActivity());
                    alertDialog$Builder4.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new hq0(uq0Var, i15));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.a;
                    uq0Var.showDialog(b2Var3);
                    TextView textView3 = (TextView) b2Var3.d(-1);
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
                cx0 cx0Var = (cx0) this.b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.n;
                ArrayList arrayList10 = premiumPreviewFragment.d;
                zw0 zw0Var = cx0Var.e;
                if (view.isEnabled() && (view instanceof rg.p1)) {
                    rg.p1 p1Var = (rg.p1) view;
                    premiumPreviewFragment.e = arrayList10.indexOf(p1Var.getTier());
                    premiumPreviewFragment.t0(true);
                    p1Var.c(true, true);
                    for (int i28 = 0; i28 < zw0Var.getChildCount(); i28++) {
                        View childAt = zw0Var.getChildAt(i28);
                        if (childAt instanceof rg.p1) {
                            rg.p1 p1Var2 = (rg.p1) childAt;
                            if (p1Var2.getTier() != p1Var.getTier()) {
                                p1Var2.c(false, true);
                            }
                        }
                    }
                    for (int i29 = 0; i29 < zw0Var.getHiddenChildCount(); i29++) {
                        View V = zw0Var.V(i29);
                        if (V instanceof rg.p1) {
                            rg.p1 p1Var3 = (rg.p1) V;
                            if (p1Var3.getTier() != p1Var.getTier()) {
                                p1Var3.c(false, true);
                            }
                        }
                    }
                    for (int i30 = 0; i30 < zw0Var.getCachedChildCount(); i30++) {
                        View P = zw0Var.P(i30);
                        if (P instanceof rg.p1) {
                            rg.p1 p1Var4 = (rg.p1) P;
                            if (p1Var4.getTier() != p1Var.getTier()) {
                                p1Var4.c(false, true);
                            }
                        }
                    }
                    for (int i31 = 0; i31 < zw0Var.getAttachedScrapChildCount(); i31++) {
                        View O = zw0Var.O(i31);
                        if (O instanceof rg.p1) {
                            rg.p1 p1Var5 = (rg.p1) O;
                            if (p1Var5.getTier() != p1Var.getTier()) {
                                p1Var5.c(false, true);
                            }
                        }
                    }
                    FrameLayout frameLayout2 = premiumPreviewFragment.J;
                    if (premiumPreviewFragment.getUserConfig().isPremium() && ((ex0Var = premiumPreviewFragment.f) == null || ex0Var.a.months >= ((ex0) arrayList10.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
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
