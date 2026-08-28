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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    private final void b(int i9, View view) {
        boolean z10;
        xu0 xu0Var = (xu0) this.b;
        boolean[] zArr = xu0Var.w;
        if (i9 == xu0Var.k0) {
            xu0Var.e0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.t8) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            boolean z11 = xu0Var.H;
            org.telegram.ui.Components.ux0 ux0Var = xu0Var.M;
            if (ux0Var != null) {
                ux0Var.f();
            }
            if (xu0Var.E) {
                int i10 = -xu0Var.K;
                xu0Var.K = i10;
                AndroidUtilities.shakeViewSpring(t8Var, i10);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i9 == xu0Var.n0) {
                z10 = !xu0Var.C;
                xu0Var.C = z10;
            } else {
                int i11 = xu0Var.q0;
                if (i9 == i11) {
                    z10 = !xu0Var.D;
                    xu0Var.D = z10;
                } else if (i9 == xu0Var.r0) {
                    boolean z12 = !xu0Var.F;
                    xu0Var.F = z12;
                    xu0Var.q0();
                    int i12 = xu0Var.q0;
                    if (i12 >= 0 && i11 < 0) {
                        xu0Var.b.o(i12);
                    } else if (i11 >= 0 && i12 < 0) {
                        xu0Var.b.u(i11);
                    }
                    z10 = z12;
                } else if (i9 == xu0Var.o0) {
                    boolean z13 = xu0Var.G;
                    boolean z14 = !z13;
                    xu0Var.G = z14;
                    if (!z13 && xu0Var.H) {
                        int i13 = xu0Var.f0;
                        xu0Var.H = false;
                        xu0Var.q0();
                        f2.q1 K = xu0Var.c.K(xu0Var.p0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.t8) K.a).setChecked(false);
                        } else {
                            xu0Var.b.m(xu0Var.p0);
                        }
                        xu0Var.b.t(i13, 2);
                    }
                    z10 = z14;
                } else {
                    if (xu0Var.J != 0) {
                        return;
                    }
                    z10 = !xu0Var.H;
                    xu0Var.H = z10;
                    int i14 = xu0Var.f0;
                    xu0Var.q0();
                    if (xu0Var.H) {
                        xu0Var.b.s(xu0Var.f0, 2);
                    } else {
                        xu0Var.b.t(i14, 2);
                    }
                    if (xu0Var.H && xu0Var.G) {
                        xu0Var.G = false;
                        f2.q1 K2 = xu0Var.c.K(xu0Var.o0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.t8) K2.a).setChecked(false);
                        } else {
                            xu0Var.b.m(xu0Var.o0);
                        }
                    }
                    if (xu0Var.H) {
                        boolean z15 = false;
                        for (int i15 = 0; i15 < zArr.length; i15++) {
                            if (z15) {
                                zArr[i15] = false;
                            } else if (zArr[i15]) {
                                z15 = true;
                            }
                        }
                    }
                }
            }
            if (xu0Var.I && !xu0Var.H) {
                xu0Var.h.b(true);
            }
            xu0Var.c.getChildCount();
            for (int i16 = xu0Var.j0; i16 < xu0Var.j0 + xu0Var.y; i16++) {
                f2.q1 K3 = xu0Var.c.K(i16);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(xu0Var.H, true);
                        c6Var.r.a(zArr[i16 - xu0Var.j0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i9 == xu0Var.p0 && !xu0Var.I) {
                            xu0Var.h.f(c6Var.getCheckBox(), true);
                            xu0Var.I = true;
                        }
                    }
                }
            }
            t8Var.setChecked(z10);
            xu0Var.h0();
        }
    }

    private final void c(int i9, View view) {
        hw0 hw0Var;
        fw0 fw0Var = (fw0) this.b;
        PremiumPreviewFragment premiumPreviewFragment = fw0Var.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        cw0 cw0Var = fw0Var.e;
        if (view.isEnabled() && (view instanceof zf.p1)) {
            zf.p1 p1Var = (zf.p1) view;
            premiumPreviewFragment.e = arrayList.indexOf(p1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.s0(true);
            p1Var.c(true, true);
            for (int i10 = 0; i10 < cw0Var.getChildCount(); i10++) {
                View childAt = cw0Var.getChildAt(i10);
                if (childAt instanceof zf.p1) {
                    zf.p1 p1Var2 = (zf.p1) childAt;
                    if (p1Var2.getTier() != p1Var.getTier()) {
                        p1Var2.c(false, true);
                    }
                }
            }
            for (int i11 = 0; i11 < cw0Var.getHiddenChildCount(); i11++) {
                View V = cw0Var.V(i11);
                if (V instanceof zf.p1) {
                    zf.p1 p1Var3 = (zf.p1) V;
                    if (p1Var3.getTier() != p1Var.getTier()) {
                        p1Var3.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < cw0Var.getCachedChildCount(); i12++) {
                View P = cw0Var.P(i12);
                if (P instanceof zf.p1) {
                    zf.p1 p1Var4 = (zf.p1) P;
                    if (p1Var4.getTier() != p1Var.getTier()) {
                        p1Var4.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < cw0Var.getAttachedScrapChildCount(); i13++) {
                View O = cw0Var.O(i13);
                if (O instanceof zf.p1) {
                    zf.p1 p1Var5 = (zf.p1) O;
                    if (p1Var5.getTier() != p1Var.getTier()) {
                        p1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.F;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((hw0Var = premiumPreviewFragment.f) == null || hw0Var.a.months >= ((hw0) arrayList.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.l0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i9, View view) {
        cx0 cx0Var = (cx0) this.b;
        int i10 = cx0Var.y;
        if (i9 == cx0Var.w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(cx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new ax0(cx0Var), null).a;
            c2Var.show();
            c2Var.h();
            return;
        }
        if (i9 != cx0Var.f) {
            if (i9 < cx0Var.r || i9 >= cx0Var.s) {
                return;
            }
            if (i10 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cx0Var.getMessagesController().blockePeers.keyAt(i9 - cx0Var.r));
            cx0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i10 != 1) {
            Bundle i11 = aa.d.i("isNeverShare", true);
            if (i10 == 2) {
                i11.putInt("chatAddType", 2);
            }
            k60 k60Var = new k60(i11);
            k60Var.w = new zw0(cx0Var);
            cx0Var.presentFragment(k60Var);
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
        dy dyVar = new dy(bundle2);
        bvVar.a = dyVar;
        dyVar.y2 = new yu(bvVar);
        dyVar.onFragmentCreate();
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
        contactsActivity.S = new yu(bvVar);
        contactsActivity.onFragmentCreate();
        cx0Var.presentFragment(bvVar);
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        pt ptVar;
        e00 e00Var;
        org.telegram.ui.Components.oc a02;
        int i10;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i11;
        org.telegram.ui.Components.tp0 tp0Var;
        int i12 = 8;
        int i13 = 4;
        lt ltVar = null;
        r5 = 1;
        int i14 = 1;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                ArrayList arrayList = lVar.h;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    int i15 = ((j) arrayList.get(i9)).d;
                    if (i15 == 1) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                        boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z10;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                        lVar.c = true;
                        break;
                    } else if (i15 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                        boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z11;
                        ((org.telegram.ui.Cells.t8) view).setChecked(z11);
                        lVar.c = true;
                        break;
                    } else if (i15 == 7) {
                        if (!lVar.getUserConfig().isPremium() && !lVar.getMessagesController().autoarchiveAvailable && !lVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(lVar.getParentActivity(), lVar.getResourceProvider());
                            org.telegram.ui.Components.l80 l80Var = ybVar.b;
                            l80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.f6.Gi, 0, new kt0(lVar, r12)));
                            l80Var.setSingleLine(false);
                            l80Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            ybVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.gc.g(lVar, ybVar, 3500).j();
                            int i16 = -lVar.e;
                            lVar.e = i16;
                            AndroidUtilities.shakeViewSpring(view, i16);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                            boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                            ((org.telegram.ui.Cells.t8) view).setChecked(z12);
                            lVar.c = true;
                            break;
                        }
                    }
                }
                break;
            case 1:
                p pVar = (p) this.b;
                if (i9 >= pVar.x && i9 < pVar.y && pVar.getParentActivity() != null) {
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) pVar.h.get(i9 - pVar.x);
                    if (stickerSetCovered.set.id != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSetCovered.set.id;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSetCovered.set.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    inputStickerSet.access_hash = stickerSetCovered.set.access_hash;
                    org.telegram.ui.Components.cx0 cx0Var = new org.telegram.ui.Components.cx0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                    cx0Var.Y = new n(pVar, view, stickerSetCovered);
                    pVar.showDialog(cx0Var);
                    break;
                }
                break;
            case 2:
                vc vcVar = (vc) this.b;
                ArrayList arrayList2 = vcVar.c;
                va1 va1Var = vcVar.d;
                if (i9 >= 0 && i9 < arrayList2.size()) {
                    org.telegram.ui.Components.bp bpVar = (org.telegram.ui.Components.bp) arrayList2.get(i9);
                    vcVar.a(bpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + va1Var.getPaddingLeft()) {
                        va1Var.v0(-((AndroidUtilities.dp(48.0f) + va1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (va1Var.getMeasuredWidth() - va1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        va1Var.v0(org.telegram.messenger.l0.A(48.0f, va1Var.getMeasuredWidth() - va1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = vcVar.r;
                    if (callback != null) {
                        callback.run(bpVar.a());
                        break;
                    }
                }
                break;
            case 3:
                hp hpVar = (hp) this.b;
                boolean z13 = hpVar.s;
                if (hpVar.getParentActivity() != null) {
                    f2.r0 adapter = hpVar.b.getAdapter();
                    gp gpVar = hpVar.e;
                    if (adapter == gpVar) {
                        chat = (TLRPC.Chat) gpVar.d.get(i9);
                    } else {
                        int i17 = hpVar.C;
                        chat = (i9 < i17 || i9 >= hpVar.D) ? null : (TLRPC.Chat) hpVar.v.get(i9 - i17);
                    }
                    if (chat != null) {
                        if (!z13 || hpVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            hpVar.presentFragment(new qn(bundle));
                            break;
                        } else {
                            hpVar.Z(chat, true);
                            break;
                        }
                    } else if (i9 == hpVar.B) {
                        if (z13 && hpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{hpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = hpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            r60 r60Var = new r60(bundle2);
                            r60Var.U = new zo(hpVar);
                            hpVar.presentFragment(r60Var);
                            break;
                        } else if (!hpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) hpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hpVar.getParentActivity());
                            if (z13) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.N = string;
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new b1(hpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            hpVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                op opVar = (op) this.b;
                ArrayList arrayList3 = opVar.r;
                boolean z14 = opVar.C;
                if (i9 > (z14 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i9 - (z14 ? 2 : 3));
                    boolean contains = opVar.d.contains(tL_availableReaction.reaction);
                    boolean z15 = !contains;
                    if (contains) {
                        opVar.d.remove(tL_availableReaction.reaction);
                        if (opVar.d.isEmpty()) {
                            np npVar = opVar.h;
                            if (npVar != null) {
                                npVar.t(opVar.C ? 1 : 2, arrayList3.size() + 1);
                            }
                            opVar.U(2, true);
                        }
                    } else {
                        opVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z15, true);
                    }
                    org.telegram.ui.Components.dp dpVar = yVar.d;
                    if (dpVar != null) {
                        dpVar.a(z15, true);
                        break;
                    }
                }
                break;
            case 5:
                dt dtVar = (dt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.a;
                hg.e0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ix0.c(null, htVar.c0, htVar.z.getContext(), new a5(dtVar, 9));
                    break;
                } else {
                    ft ftVar = htVar.l;
                    if (ftVar != null) {
                        ftVar.v(stickerSetCovered2.set, TextUtils.join("", htVar.o));
                    }
                    htVar.p();
                    break;
                }
                break;
            case 6:
                qt qtVar = (qt) this.b;
                if (qtVar.f && qtVar.e) {
                    ot otVar = qtVar.d;
                    ArrayList arrayList4 = otVar.e;
                    if (arrayList4 != null && i9 >= 0 && i9 < arrayList4.size()) {
                        ltVar = (lt) otVar.e.get(i9);
                    }
                } else {
                    int S = qtVar.c.S(i9);
                    int Q = qtVar.c.Q(i9);
                    if (Q >= 0 && S >= 0) {
                        ltVar = qtVar.c.O(S, Q);
                    }
                }
                if (i9 >= 0) {
                    qtVar.finishFragment();
                    if (ltVar != null && (ptVar = qtVar.r) != null) {
                        ptVar.a1(ltVar);
                        break;
                    }
                }
                break;
            case 7:
                ku kuVar = (ku) this.b;
                ArrayList arrayList5 = kuVar.Y2;
                ou ouVar = kuVar.k3;
                if (!(view instanceof du) || i9 < 0 || i9 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.p8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ouVar.getParentActivity());
                        alertDialog$Builder2.a.N = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.P = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new gu(kuVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                        ouVar.showDialog(c2Var2);
                        TextView textView2 = (TextView) c2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                            break;
                        }
                    }
                } else {
                    fu fuVar = (fu) arrayList5.get(i9);
                    if (fuVar != null) {
                        int i18 = fuVar.h;
                        if (i18 >= 0) {
                            kuVar.e3[i18] = !r3[i18];
                            kuVar.A1(true);
                            break;
                        } else if (i18 == -2) {
                            ouVar.presentFragment(new DataAutoDownloadActivity(kuVar.U2 - 1));
                            break;
                        }
                    }
                }
                break;
            case 8:
                lz.U((lz) this.b, view, i9);
                break;
            case 9:
                n00 n00Var = (n00) this.b;
                if (n00Var.getParentActivity() != null && (e00Var = (e00) n00Var.L.get(i9)) != null) {
                    View.OnClickListener onClickListener = e00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i19 = e00Var.a;
                        if (i19 == 1) {
                            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                            n00Var.u0(e00Var, vaVar.getName(), vaVar.getCurrentObject(), e00Var.g);
                            break;
                        } else if (i19 == 7) {
                            org.telegram.ui.Components.p61 p61Var = new org.telegram.ui.Components.p61(20, n00Var, e00Var);
                            if (n00Var.c.isEnabled()) {
                                n00Var.r0(p61Var, false);
                                break;
                            } else {
                                p61Var.run();
                                break;
                            }
                        } else if (i19 == 8 || (i19 == 4 && e00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = n00Var.r;
                            org.telegram.ui.ActionBar.b6 b6Var = null;
                            if (!n00Var.s || n00Var.c.getAlpha() <= 0.0f) {
                                if ((!TextUtils.isEmpty(n00Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (n00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && n00Var.C.isEmpty() && !n00Var.B.isEmpty()) {
                                    n00Var.r0(new pz(n00Var, 1), false);
                                    break;
                                } else {
                                    float f10 = -n00Var.M;
                                    n00Var.M = f10;
                                    AndroidUtilities.shakeViewSpring(view, f10);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(n00Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                        i10 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((n00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (n00Var.C.isEmpty()) {
                                            a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                            i10 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                            i10 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (n00Var.B.isEmpty()) {
                                        a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                        i10 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.oc.a0(n00Var);
                                        i10 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.ll.p(i10, a02, null);
                                    break;
                                }
                            } else {
                                float f11 = -n00Var.M;
                                n00Var.M = f11;
                                AndroidUtilities.shakeViewSpring(view, f11);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                n00Var.v = true;
                                wi wiVar = n00Var.N;
                                if (wiVar == null || wiVar.getVisibility() != 0) {
                                    wi wiVar2 = new wi(6, 3, n00Var.getParentActivity(), b6Var, true);
                                    n00Var.N = wiVar2;
                                    wiVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    n00Var.N.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    n00Var.N.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    n00Var.getParentLayout().getOverlayContainerView().addView(n00Var.N, marginLayoutParams);
                                    n00Var.N.f(n00Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                a00 a00Var = (a00) this.b;
                ArrayList arrayList6 = a00Var.Z;
                int i20 = i9 - 1;
                if (i20 >= 0 && i20 < arrayList6.size()) {
                    e00 e00Var2 = (e00) arrayList6.get(i20);
                    int i21 = e00Var2.a;
                    if (i21 == 7) {
                        a00Var.dismiss();
                        a00Var.n.presentFragment(new lz(a00Var.T, e00Var2.m));
                        break;
                    } else if (i21 == 8) {
                        a00Var.P();
                        break;
                    }
                }
                break;
            case 11:
                f10 f10Var = (f10) this.b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.l7) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.l7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.h7) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.r2) {
                    f10Var.f(i9, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                    break;
                }
                break;
            case 12:
                t60 t60Var = (t60) this.b;
                if (t60Var.getParentActivity() != null) {
                    if (i9 == t60Var.n || i9 == 0) {
                        if (t60Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", t60Var.f.link));
                                org.telegram.ui.Components.oc.j(t60Var).j();
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                    } else if (i9 != t60Var.s) {
                        if (i9 == t60Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(t60Var.getParentActivity());
                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new wt(t60Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            t60Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (t60Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", t60Var.f.link);
                            t60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    }
                }
                break;
            case 13:
                z60.T((z60) this.b, view, i9);
                break;
            case 14:
                q70.T((q70) this.b, view, i9);
                break;
            case 15:
                LanguageSelectActivity.T((LanguageSelectActivity) this.b, view, i9);
                break;
            case 16:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.e0 = -1L;
                int i22 = pc0Var.C0;
                if (i22 != 4) {
                    if (i22 == 5) {
                        IMapsProvider.IMap iMap = pc0Var.E;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = pc0Var.v0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), pc0Var.E.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i9 != 1 || (messageObject = pc0Var.x0) == null || (messageObject.isLiveLocation() && i22 != 6)) {
                        if (i9 != 1 || i22 == 2) {
                            if (i22 != 2 || !pc0Var.getLocationController().isSharingLocation(pc0Var.a0) || pc0Var.P.j(i9) != 7) {
                                if (i22 != 2 || !pc0Var.getLocationController().isSharingLocation(pc0Var.a0) || pc0Var.P.j(i9) != 6) {
                                    if ((i9 != 2 || i22 != 1) && ((i9 != 1 || i22 != 2) && (i9 != 3 || i22 != 3))) {
                                        Object J = pc0Var.P.J(i9);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            pc0Var.B0.d((TLRPC.TL_messageMediaVenue) J, pc0Var.C0, true, 0, 0L);
                                            pc0Var.finishFragment();
                                            break;
                                        } else if (J instanceof jc0) {
                                            jc0 jc0Var = (jc0) J;
                                            pc0Var.e0 = jc0Var.a;
                                            if (pc0Var.f0) {
                                                pc0Var.f0 = false;
                                                pc0Var.B0();
                                            }
                                            pc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), pc0Var.E.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (pc0Var.getLocationController().isSharingLocation(pc0Var.a0)) {
                                        pc0Var.getLocationController().removeSharingLocation(pc0Var.a0);
                                        pc0Var.P.l();
                                        pc0Var.finishFragment();
                                        break;
                                    } else {
                                        pc0Var.r0(false);
                                        break;
                                    }
                                } else {
                                    pc0Var.r0(pc0Var.getLocationController().getSharingLocationInfo(pc0Var.a0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                pc0Var.getLocationController().removeSharingLocation(pc0Var.a0);
                                pc0Var.P.l();
                                pc0Var.finishFragment();
                                break;
                            }
                        } else if (pc0Var.B0 != null && pc0Var.t0 != null) {
                            FrameLayout frameLayout = pc0Var.k0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(pc0Var.t0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(pc0Var.t0.getLongitude());
                                pc0Var.B0.d(tL_messageMediaGeo, pc0Var.C0, true, 0, 0L);
                                pc0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = pc0Var.E;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = pc0Var.x0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), pc0Var.E.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i9 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc0Var.P.J(i9)) != null) {
                    if (pc0Var.a0 == 0) {
                        pc0Var.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                        pc0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(pc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = pc0Var.getMessagesController().getInputChannel(-pc0Var.a0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        c2VarArr[0].setOnCancelListener(new gh.x(pc0Var, pc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new y9(pc0Var, c2VarArr, tL_messageMediaVenue, 19)), i12));
                        pc0Var.showDialog(c2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((li0) this.b).onBackPressed();
                break;
            case 18:
                ti0 ti0Var = (ti0) this.b;
                int i23 = ti0Var.E;
                if (i9 >= i23 && i9 < ti0Var.F) {
                    MessageObject messageObject2 = (MessageObject) ti0Var.x.get(i9 - i23);
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
                        if (ti0Var.getMessagesController().checkCanOpenChat(bundle3, ti0Var)) {
                            ti0Var.presentFragment(new qn(bundle3));
                            break;
                        }
                    } else if (!ti0Var.Z(messageObject2)) {
                        ti0Var.getOrCreateStoryViewer().F(ti0Var.getParentActivity(), messageObject2.storyItem, ih.e7.a(ti0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.U((PasscodeActivity) this.b, view, i9);
                break;
            case 20:
                zp0 zp0Var = (zp0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = zp0Var.f;
                ArrayList arrayList8 = zp0Var.n;
                MediaController.AlbumEntry albumEntry = zp0Var.F;
                if (albumEntry != null || !arrayList7.isEmpty()) {
                    if (albumEntry != null) {
                        arrayList7 = albumEntry.photos;
                    }
                    if (i9 >= 0 && i9 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.w0 w0Var = zp0Var.L;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                        }
                        if (zp0Var.U) {
                            zp0Var.Z(view, arrayList7.get(i9));
                            break;
                        } else {
                            int i24 = zp0Var.P;
                            if (i24 != 1 && i24 != 3) {
                                i14 = i24 == 2 ? 3 : i24 == 10 ? 10 : zp0Var.Q == null ? 4 : 0;
                            }
                            PhotoViewer.t1().K2(null, zp0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i25 = zp0Var.D;
                            boolean z16 = zp0Var.E;
                            t12.h = i25;
                            t12.n = z16;
                            PhotoViewer.t1().f2(arrayList7, i9, i14, zp0Var.h0, zp0Var.t0, zp0Var.Q);
                            break;
                        }
                    }
                } else if (i9 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i9);
                    dq0 dq0Var = zp0Var.p0;
                    if (dq0Var != null) {
                        switch (dq0Var.a) {
                            case 0:
                                eq0.g0(dq0Var.b, str);
                                break;
                            default:
                                eq0.g0(dq0Var.b, str);
                                break;
                        }
                    } else {
                        zp0Var.L.getSearchField().setText(str);
                        zp0Var.L.getSearchField().setSelection(str.length());
                        zp0Var.a0(zp0Var.L.getSearchField());
                        break;
                    }
                } else if (i9 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zp0Var.getParentActivity());
                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new mp0(zp0Var, i13));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.a;
                    zp0Var.showDialog(c2Var3);
                    TextView textView3 = (TextView) c2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                        break;
                    }
                }
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.c7;
                if (!arrayList9.isEmpty() && (i11 = photoViewer.L4) >= 0 && i11 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.L4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.n1();
                    }
                }
                photoViewer.g5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.L4 = -1;
                    photoViewer.B2(indexOf);
                }
                photoViewer.g5 = false;
                break;
            case 22:
                b(i9, view);
                break;
            case 23:
                PremiumPreviewFragment.T((PremiumPreviewFragment) this.b, view, i9);
                break;
            case 24:
                c(i9, view);
                break;
            case 25:
                PrivacyControlActivity.W((PrivacyControlActivity) this.b, view, i9);
                break;
            case 26:
                d(i9, view);
                break;
            case 27:
                ProfileActivity.e0((ProfileActivity) this.b, i9);
                break;
            case 28:
                ProxyListActivity.T((ProxyListActivity) this.b, view, i9);
                break;
            default:
                y11 y11Var = (y11) this.b;
                org.telegram.ui.Components.wk0 wk0Var = y11Var.y;
                org.telegram.ui.Components.ap apVar = y11Var.b;
                if (apVar.d.get(i9) != y11Var.G && y11Var.K == null) {
                    y11Var.M = false;
                    y11Var.G = (org.telegram.ui.Components.bp) apVar.d.get(i9);
                    apVar.E(i9);
                    y11Var.h.postDelayed(new org.telegram.ui.Components.qd(y11Var, i9, 24), 100L);
                    for (int i26 = 0; i26 < wk0Var.getChildCount(); i26++) {
                        org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) wk0Var.getChildAt(i26);
                        if (a11Var != view && (tp0Var = a11Var.F) != null) {
                            AndroidUtilities.cancelRunOnUIThread(tp0Var);
                            a11Var.F.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.bp) apVar.d.get(i9)).a.a) {
                        ((org.telegram.ui.Components.a11) view).d();
                    }
                    l11 l11Var = y11Var.F;
                    if (l11Var != null) {
                        l11Var.a.c0(i9, y11Var.G.a, true);
                        break;
                    }
                }
                break;
        }
    }
}
