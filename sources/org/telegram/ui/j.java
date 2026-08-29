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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void a(int i10, View view) {
        boolean z10;
        vu0 vu0Var = (vu0) this.b;
        boolean[] zArr = vu0Var.w;
        if (i10 == vu0Var.k0) {
            vu0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.q8) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z11 = vu0Var.H;
            org.telegram.ui.Components.fy0 fy0Var = vu0Var.M;
            if (fy0Var != null) {
                fy0Var.f();
            }
            if (vu0Var.E) {
                int i11 = -vu0Var.K;
                vu0Var.K = i11;
                AndroidUtilities.shakeViewSpring(q8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == vu0Var.n0) {
                z10 = !vu0Var.C;
                vu0Var.C = z10;
            } else {
                int i12 = vu0Var.q0;
                if (i10 == i12) {
                    z10 = !vu0Var.D;
                    vu0Var.D = z10;
                } else if (i10 == vu0Var.r0) {
                    boolean z12 = !vu0Var.F;
                    vu0Var.F = z12;
                    vu0Var.r0();
                    int i13 = vu0Var.q0;
                    if (i13 >= 0 && i12 < 0) {
                        vu0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        vu0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == vu0Var.o0) {
                    boolean z13 = vu0Var.G;
                    boolean z14 = !z13;
                    vu0Var.G = z14;
                    if (!z13 && vu0Var.H) {
                        int i14 = vu0Var.f0;
                        vu0Var.H = false;
                        vu0Var.r0();
                        f2.n1 K = vu0Var.c.K(vu0Var.p0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.q8) K.a).setChecked(false);
                        } else {
                            vu0Var.b.m(vu0Var.p0);
                        }
                        vu0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (vu0Var.J != 0) {
                        return;
                    }
                    z10 = !vu0Var.H;
                    vu0Var.H = z10;
                    int i15 = vu0Var.f0;
                    vu0Var.r0();
                    if (vu0Var.H) {
                        vu0Var.b.s(vu0Var.f0, 2);
                    } else {
                        vu0Var.b.t(i15, 2);
                    }
                    if (vu0Var.H && vu0Var.G) {
                        vu0Var.G = false;
                        f2.n1 K2 = vu0Var.c.K(vu0Var.o0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.q8) K2.a).setChecked(false);
                        } else {
                            vu0Var.b.m(vu0Var.o0);
                        }
                    }
                    if (vu0Var.H) {
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
            if (vu0Var.I && !vu0Var.H) {
                vu0Var.h.b(true);
            }
            vu0Var.c.getChildCount();
            for (int i17 = vu0Var.j0; i17 < vu0Var.j0 + vu0Var.y; i17++) {
                f2.n1 K3 = vu0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.a6) {
                        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view2;
                        a6Var.m(vu0Var.H, true);
                        a6Var.r.a(zArr[i17 - vu0Var.j0], z11);
                        if (a6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == vu0Var.p0 && !vu0Var.I) {
                            vu0Var.h.f(a6Var.getCheckBox(), true);
                            vu0Var.I = true;
                        }
                    }
                }
            }
            q8Var.setChecked(z10);
            vu0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        gw0 gw0Var;
        ew0 ew0Var = (ew0) this.b;
        PremiumPreviewFragment premiumPreviewFragment = ew0Var.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        bw0 bw0Var = ew0Var.e;
        if (view.isEnabled() && (view instanceof cg.l2)) {
            cg.l2 l2Var = (cg.l2) view;
            premiumPreviewFragment.e = arrayList.indexOf(l2Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            l2Var.c(true, true);
            for (int i11 = 0; i11 < bw0Var.getChildCount(); i11++) {
                View childAt = bw0Var.getChildAt(i11);
                if (childAt instanceof cg.l2) {
                    cg.l2 l2Var2 = (cg.l2) childAt;
                    if (l2Var2.getTier() != l2Var.getTier()) {
                        l2Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < bw0Var.getHiddenChildCount(); i12++) {
                View V = bw0Var.V(i12);
                if (V instanceof cg.l2) {
                    cg.l2 l2Var3 = (cg.l2) V;
                    if (l2Var3.getTier() != l2Var.getTier()) {
                        l2Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < bw0Var.getCachedChildCount(); i13++) {
                View P = bw0Var.P(i13);
                if (P instanceof cg.l2) {
                    cg.l2 l2Var4 = (cg.l2) P;
                    if (l2Var4.getTier() != l2Var.getTier()) {
                        l2Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < bw0Var.getAttachedScrapChildCount(); i14++) {
                View O = bw0Var.O(i14);
                if (O instanceof cg.l2) {
                    cg.l2 l2Var5 = (cg.l2) O;
                    if (l2Var5.getTier() != l2Var.getTier()) {
                        l2Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.F;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((gw0Var = premiumPreviewFragment.f) == null || gw0Var.a.months >= ((gw0) arrayList.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.l0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        bx0 bx0Var = (bx0) this.b;
        int i11 = bx0Var.y;
        if (i10 == bx0Var.w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.c5.O(bx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new zw0(bx0Var), null).a;
            c2Var.show();
            c2Var.h();
            return;
        }
        if (i10 != bx0Var.f) {
            if (i10 < bx0Var.r || i10 >= bx0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", bx0Var.getMessagesController().blockePeers.keyAt(i10 - bx0Var.r));
            bx0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle i12 = a4.w.i("isNeverShare", true);
            if (i11 == 2) {
                i12.putInt("chatAddType", 2);
            }
            m60 m60Var = new m60(i12);
            m60Var.w = new yw0(bx0Var);
            bx0Var.presentFragment(m60Var);
            return;
        }
        cv cvVar = new cv(null);
        cvVar.d = new Paint();
        cvVar.f = new bv[2];
        cvVar.w = true;
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlySelect", true);
        bundle2.putBoolean("checkCanWrite", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putInt("dialogsType", 9);
        fy fyVar = new fy(bundle2);
        cvVar.a = fyVar;
        fyVar.y2 = new zu(cvVar);
        fyVar.onFragmentCreate();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("onlyUsers", true);
        bundle3.putBoolean("destroyAfterSelect", true);
        bundle3.putBoolean("returnAsResult", true);
        bundle3.putBoolean("disableSections", true);
        bundle3.putBoolean("needFinishFragment", false);
        bundle3.putBoolean("resetDelegate", false);
        bundle3.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle3);
        cvVar.b = contactsActivity;
        contactsActivity.S = new zu(cvVar);
        contactsActivity.onFragmentCreate();
        bx0Var.presentFragment(cvVar);
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        qt qtVar;
        g00 g00Var;
        org.telegram.ui.Components.tc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        org.telegram.ui.Components.fq0 fq0Var;
        int i13 = 8;
        int i14 = 4;
        lt ltVar = null;
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
                        boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                        globalPrivacySettings.keep_archived_unmuted = z10;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z10);
                        nVar.c = true;
                        break;
                    } else if (i16 == 4) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings2 = nVar.d;
                        boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                        globalPrivacySettings2.keep_archived_folders = z11;
                        ((org.telegram.ui.Cells.q8) view).setChecked(z11);
                        nVar.c = true;
                        break;
                    } else if (i16 == 7) {
                        if (!nVar.getUserConfig().isPremium() && !nVar.getMessagesController().autoarchiveAvailable && !nVar.d.archive_and_mute_new_noncontact_peers) {
                            org.telegram.ui.Components.ec ecVar = new org.telegram.ui.Components.ec(nVar.getParentActivity(), nVar.getResourceProvider());
                            org.telegram.ui.Components.y80 y80Var = ecVar.b;
                            y80Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.g6.Gi, 0, new it0(nVar, r12)));
                            y80Var.setSingleLine(false);
                            y80Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                            ecVar.a.setImageResource(R.drawable.msg_settings_premium);
                            org.telegram.ui.Components.mc.g(nVar, ecVar, 3500).j();
                            int i17 = -nVar.e;
                            nVar.e = i17;
                            AndroidUtilities.shakeViewSpring(view, i17);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = nVar.d;
                            boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                            globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                            ((org.telegram.ui.Cells.q8) view).setChecked(z12);
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
                    org.telegram.ui.Components.nx0 nx0Var = new org.telegram.ui.Components.nx0(rVar.getParentActivity(), rVar, inputStickerSet, null, null, null);
                    nx0Var.Y = new p(rVar, view, stickerSetCovered);
                    rVar.showDialog(nx0Var);
                    break;
                }
                break;
            case 2:
                tc tcVar = (tc) this.b;
                ArrayList arrayList2 = tcVar.c;
                wa1 wa1Var = tcVar.d;
                if (i10 >= 0 && i10 < arrayList2.size()) {
                    org.telegram.ui.Components.fp fpVar = (org.telegram.ui.Components.fp) arrayList2.get(i10);
                    tcVar.a(fpVar.a(), true);
                    if (view.getLeft() < AndroidUtilities.dp(24.0f) + wa1Var.getPaddingLeft()) {
                        wa1Var.v0(-((AndroidUtilities.dp(48.0f) + wa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                    } else if (view.getWidth() + view.getLeft() > (wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                        wa1Var.v0(org.telegram.messenger.x3.z(48.0f, wa1Var.getMeasuredWidth() - wa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                    }
                    Utilities.Callback callback = tcVar.r;
                    if (callback != null) {
                        callback.run(fpVar.a());
                        break;
                    }
                }
                break;
            case 3:
                kp kpVar = (kp) this.b;
                boolean z13 = kpVar.s;
                if (kpVar.getParentActivity() != null) {
                    f2.p0 adapter = kpVar.b.getAdapter();
                    jp jpVar = kpVar.e;
                    if (adapter == jpVar) {
                        chat = (TLRPC.Chat) jpVar.d.get(i10);
                    } else {
                        int i18 = kpVar.C;
                        chat = (i10 < i18 || i10 >= kpVar.D) ? null : (TLRPC.Chat) kpVar.v.get(i10 - i18);
                    }
                    if (chat != null) {
                        if (!z13 || kpVar.h.linked_chat_id != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chat.id);
                            kpVar.presentFragment(new tn(bundle));
                            break;
                        } else {
                            kpVar.a0(chat, true);
                            break;
                        }
                    } else if (i10 == kpVar.B) {
                        if (z13 && kpVar.h.linked_chat_id == 0) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putLongArray("result", new long[]{kpVar.getUserConfig().getClientUserId()});
                            bundle2.putInt("chatType", 4);
                            TLRPC.Chat chat2 = kpVar.f;
                            if (chat2 != null) {
                                bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                            }
                            t60 t60Var = new t60(bundle2);
                            t60Var.U = new cp(kpVar);
                            kpVar.presentFragment(t60Var);
                            break;
                        } else if (!kpVar.v.isEmpty()) {
                            TLRPC.Chat chat3 = (TLRPC.Chat) kpVar.v.get(0);
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                            if (z13) {
                                string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                                formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                            } else {
                                string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                                formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                            }
                            alertDialog$Builder.a.N = string;
                            alertDialog$Builder.a.P = AndroidUtilities.replaceTags(formatString);
                            alertDialog$Builder.k(LocaleController.getString(R.string.DiscussionUnlink), new c1(kpVar, 22));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                            kpVar.showDialog(c2Var);
                            TextView textView = (TextView) c2Var.d(-1);
                            if (textView != null) {
                                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                                break;
                            }
                        }
                    }
                }
                break;
            case 4:
                rp rpVar = (rp) this.b;
                ArrayList arrayList3 = rpVar.r;
                boolean z14 = rpVar.C;
                if (i10 > (z14 ? 1 : 2)) {
                    org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z14 ? 2 : 3));
                    boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                    boolean z15 = !contains;
                    if (contains) {
                        rpVar.d.remove(tL_availableReaction.reaction);
                        if (rpVar.d.isEmpty()) {
                            qp qpVar = rpVar.h;
                            if (qpVar != null) {
                                qpVar.t(rpVar.C ? 1 : 2, arrayList3.size() + 1);
                            }
                            rpVar.V(2, true);
                        }
                    } else {
                        rpVar.d.add(tL_availableReaction.reaction);
                    }
                    Switch r22 = yVar.c;
                    if (r22 != null) {
                        r22.c(z15, true);
                    }
                    org.telegram.ui.Components.hp hpVar = yVar.d;
                    if (hpVar != null) {
                        hpVar.a(z15, true);
                        break;
                    }
                }
                break;
            case 5:
                dt dtVar = (dt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.a;
                kg.d0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.tx0.c(null, htVar.c0, htVar.z.getContext(), new b5(dtVar, 9));
                    break;
                } else {
                    ft ftVar = htVar.l;
                    if (ftVar != null) {
                        ftVar.u(stickerSetCovered2.set, TextUtils.join("", htVar.o));
                    }
                    htVar.p();
                    break;
                }
                break;
            case 6:
                rt rtVar = (rt) this.b;
                if (rtVar.f && rtVar.e) {
                    pt ptVar = rtVar.d;
                    ArrayList arrayList4 = ptVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ltVar = (lt) ptVar.e.get(i10);
                    }
                } else {
                    int S = rtVar.c.S(i10);
                    int Q = rtVar.c.Q(i10);
                    if (Q >= 0 && S >= 0) {
                        ltVar = rtVar.c.O(S, Q);
                    }
                }
                if (i10 >= 0) {
                    rtVar.finishFragment();
                    if (ltVar != null && (qtVar = rtVar.r) != null) {
                        qtVar.Z0(ltVar);
                        break;
                    }
                }
                break;
            case 7:
                lu luVar = (lu) this.b;
                ArrayList arrayList5 = luVar.Y2;
                pu puVar = luVar.k3;
                if (!(view instanceof eu) || i10 < 0 || i10 >= arrayList5.size()) {
                    if (view instanceof org.telegram.ui.Cells.m8) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(puVar.getParentActivity());
                        alertDialog$Builder2.a.N = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                        alertDialog$Builder2.a.P = LocaleController.getString(R.string.ResetStatisticsAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Reset), new hu(luVar));
                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                        puVar.showDialog(c2Var2);
                        TextView textView2 = (TextView) c2Var2.d(-1);
                        if (textView2 != null) {
                            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                            break;
                        }
                    }
                } else {
                    gu guVar = (gu) arrayList5.get(i10);
                    if (guVar != null) {
                        int i19 = guVar.h;
                        if (i19 >= 0) {
                            luVar.e3[i19] = !r3[i19];
                            luVar.A1(true);
                            break;
                        } else if (i19 == -2) {
                            puVar.presentFragment(new DataAutoDownloadActivity(luVar.U2 - 1));
                            break;
                        }
                    }
                }
                break;
            case 8:
                nz.V((nz) this.b, view, i10);
                break;
            case 9:
                p00 p00Var = (p00) this.b;
                if (p00Var.getParentActivity() != null && (g00Var = (g00) p00Var.L.get(i10)) != null) {
                    View.OnClickListener onClickListener = g00Var.c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        break;
                    } else {
                        int i20 = g00Var.a;
                        if (i20 == 1) {
                            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
                            p00Var.v0(g00Var, saVar.getName(), saVar.getCurrentObject(), g00Var.g);
                            break;
                        } else if (i20 == 7) {
                            org.telegram.ui.Components.voip.o oVar = new org.telegram.ui.Components.voip.o(17, p00Var, g00Var);
                            if (p00Var.c.isEnabled()) {
                                p00Var.s0(oVar, false);
                                break;
                            } else {
                                oVar.run();
                                break;
                            }
                        } else if (i20 == 8 || (i20 == 4 && g00Var.k == R.drawable.msg2_link2)) {
                            MessagesController.DialogFilter dialogFilter = p00Var.r;
                            org.telegram.ui.ActionBar.c6 c6Var = null;
                            if (!p00Var.s || p00Var.c.getAlpha() <= 0.0f) {
                                if ((!TextUtils.isEmpty(p00Var.w) || !TextUtils.isEmpty(dialogFilter.name)) && (p00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && p00Var.C.isEmpty() && !p00Var.B.isEmpty()) {
                                    p00Var.s0(new rz(p00Var, 1), false);
                                    break;
                                } else {
                                    float f9 = -p00Var.M;
                                    p00Var.M = f9;
                                    AndroidUtilities.shakeViewSpring(view, f9);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    if (TextUtils.isEmpty(p00Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                                        a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                        i11 = R.string.FilterInviteErrorEmptyName;
                                    } else if ((p00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                                        if (p00Var.C.isEmpty()) {
                                            a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                            i11 = R.string.FilterInviteErrorTypes;
                                        } else {
                                            a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                            i11 = R.string.FilterInviteErrorTypesExcluded;
                                        }
                                    } else if (p00Var.B.isEmpty()) {
                                        a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                        i11 = R.string.FilterInviteErrorEmpty;
                                    } else {
                                        a02 = org.telegram.ui.Components.tc.a0(p00Var);
                                        i11 = R.string.FilterInviteErrorExcluded;
                                    }
                                    org.telegram.messenger.x3.s(i11, a02, null);
                                    break;
                                }
                            } else {
                                float f10 = -p00Var.M;
                                p00Var.M = f10;
                                AndroidUtilities.shakeViewSpring(view, f10);
                                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                p00Var.v = true;
                                zi ziVar = p00Var.N;
                                if (ziVar == null || ziVar.getVisibility() != 0) {
                                    zi ziVar2 = new zi(6, 3, p00Var.getParentActivity(), c6Var, true);
                                    p00Var.N = ziVar2;
                                    ziVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                                    p00Var.N.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                                    p00Var.N.setText(LocaleController.getString(R.string.FilterFinishCreating));
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                                    marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                                    p00Var.getParentLayout().getOverlayContainerView().addView(p00Var.N, marginLayoutParams);
                                    p00Var.N.f(p00Var.c, true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 10:
                c00 c00Var = (c00) this.b;
                ArrayList arrayList6 = c00Var.Z;
                int i21 = i10 - 1;
                if (i21 >= 0 && i21 < arrayList6.size()) {
                    g00 g00Var2 = (g00) arrayList6.get(i21);
                    int i22 = g00Var2.a;
                    if (i22 == 7) {
                        c00Var.dismiss();
                        c00Var.n.presentFragment(new nz(c00Var.T, g00Var2.m));
                        break;
                    } else if (i22 == 8) {
                        c00Var.Q();
                        break;
                    }
                }
                break;
            case 11:
                h10 h10Var = (h10) this.b;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.g7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.j7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.f7) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.f7) view).getMessage(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.d2) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.d2) view).getMessageObject(), 0);
                    break;
                } else if (view instanceof org.telegram.ui.Cells.p2) {
                    h10Var.f(i10, view, ((org.telegram.ui.Cells.p2) view).getMessage(), 0);
                    break;
                }
                break;
            case 12:
                v60 v60Var = (v60) this.b;
                if (v60Var.getParentActivity() != null) {
                    if (i10 == v60Var.n || i10 == 0) {
                        if (v60Var.f != null) {
                            try {
                                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", v60Var.f.link));
                                org.telegram.ui.Components.tc.j(v60Var).j();
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        }
                    } else if (i10 != v60Var.s) {
                        if (i10 == v60Var.r) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(v60Var.getParentActivity());
                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.RevokeAlert);
                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.RevokeLink);
                            alertDialog$Builder3.k(LocaleController.getString(R.string.RevokeButton), new xt(v60Var, 12));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                            v60Var.showDialog(alertDialog$Builder3.a);
                            break;
                        }
                    } else if (v60Var.f != null) {
                        try {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", v60Var.f.link);
                            v60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                            break;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return;
                        }
                    }
                }
                break;
            case 13:
                c70.U((c70) this.b, view, i10);
                break;
            case 14:
                s70.U((s70) this.b, view, i10);
                break;
            case 15:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                break;
            case 16:
                rc0 rc0Var = (rc0) this.b;
                rc0Var.e0 = -1L;
                int i23 = rc0Var.C0;
                if (i23 != 4) {
                    if (i23 == 5) {
                        IMapsProvider.IMap iMap = rc0Var.E;
                        if (iMap != null) {
                            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint = rc0Var.v0.geo_point;
                            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), rc0Var.E.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    } else if (i10 != 1 || (messageObject = rc0Var.x0) == null || (messageObject.isLiveLocation() && i23 != 6)) {
                        if (i10 != 1 || i23 == 2) {
                            if (i23 != 2 || !rc0Var.getLocationController().isSharingLocation(rc0Var.a0) || rc0Var.P.j(i10) != 7) {
                                if (i23 != 2 || !rc0Var.getLocationController().isSharingLocation(rc0Var.a0) || rc0Var.P.j(i10) != 6) {
                                    if ((i10 != 2 || i23 != 1) && ((i10 != 1 || i23 != 2) && (i10 != 3 || i23 != 3))) {
                                        Object J = rc0Var.P.J(i10);
                                        if (J instanceof TLRPC.TL_messageMediaVenue) {
                                            rc0Var.B0.d((TLRPC.TL_messageMediaVenue) J, rc0Var.C0, true, 0, 0L);
                                            rc0Var.finishFragment();
                                            break;
                                        } else if (J instanceof lc0) {
                                            lc0 lc0Var = (lc0) J;
                                            rc0Var.e0 = lc0Var.a;
                                            if (rc0Var.f0) {
                                                rc0Var.f0 = false;
                                                rc0Var.C0();
                                            }
                                            rc0Var.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.e.getPosition(), rc0Var.E.getMaxZoomLevel() - 4.0f));
                                            break;
                                        }
                                    } else if (rc0Var.getLocationController().isSharingLocation(rc0Var.a0)) {
                                        rc0Var.getLocationController().removeSharingLocation(rc0Var.a0);
                                        rc0Var.P.l();
                                        rc0Var.finishFragment();
                                        break;
                                    } else {
                                        rc0Var.s0(false);
                                        break;
                                    }
                                } else {
                                    rc0Var.s0(rc0Var.getLocationController().getSharingLocationInfo(rc0Var.a0).period != Integer.MAX_VALUE);
                                    break;
                                }
                            } else {
                                rc0Var.getLocationController().removeSharingLocation(rc0Var.a0);
                                rc0Var.P.l();
                                rc0Var.finishFragment();
                                break;
                            }
                        } else if (rc0Var.B0 != null && rc0Var.t0 != null) {
                            FrameLayout frameLayout = rc0Var.k0;
                            if (frameLayout != null) {
                                frameLayout.callOnClick();
                                break;
                            } else {
                                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                                tL_messageMediaGeo.geo = tL_geoPoint;
                                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rc0Var.t0.getLatitude());
                                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rc0Var.t0.getLongitude());
                                rc0Var.B0.d(tL_messageMediaGeo, rc0Var.C0, true, 0, 0L);
                                rc0Var.finishFragment();
                                break;
                            }
                        }
                    } else {
                        IMapsProvider.IMap iMap2 = rc0Var.E;
                        if (iMap2 != null) {
                            IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                            TLRPC.GeoPoint geoPoint2 = rc0Var.x0.messageOwner.media.geo;
                            iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), rc0Var.E.getMaxZoomLevel() - 4.0f));
                            break;
                        }
                    }
                } else if (i10 == 1 && (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) rc0Var.P.J(i10)) != null) {
                    if (rc0Var.a0 == 0) {
                        rc0Var.B0.d(tL_messageMediaVenue, 4, true, 0, 0L);
                        rc0Var.finishFragment();
                        break;
                    } else {
                        org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(rc0Var.getParentActivity(), 3, null)};
                        TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                        tL_channels_editLocation.address = tL_messageMediaVenue.address;
                        tL_channels_editLocation.channel = rc0Var.getMessagesController().getInputChannel(-rc0Var.a0);
                        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                        tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                        TLRPC.GeoPoint geoPoint3 = tL_messageMediaVenue.geo;
                        tL_inputGeoPoint.lat = geoPoint3.lat;
                        tL_inputGeoPoint._long = geoPoint3._long;
                        c2VarArr[0].setOnCancelListener(new jh.w(rc0Var, rc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new x9(rc0Var, c2VarArr, tL_messageMediaVenue, 19)), i13));
                        rc0Var.showDialog(c2VarArr[0]);
                        break;
                    }
                }
                break;
            case 17:
                ((ki0) this.b).onBackPressed();
                break;
            case 18:
                si0 si0Var = (si0) this.b;
                int i24 = si0Var.E;
                if (i10 >= i24 && i10 < si0Var.F) {
                    MessageObject messageObject2 = (MessageObject) si0Var.x.get(i10 - i24);
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
                        if (si0Var.getMessagesController().checkCanOpenChat(bundle3, si0Var)) {
                            si0Var.presentFragment(new tn(bundle3));
                            break;
                        }
                    } else if (!si0Var.a0(messageObject2)) {
                        si0Var.getOrCreateStoryViewer().G(si0Var.getParentActivity(), messageObject2.storyItem, lh.b7.a(si0Var.f));
                        break;
                    }
                }
                break;
            case 19:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
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
                    if (i10 >= 0 && i10 < arrayList7.size()) {
                        org.telegram.ui.ActionBar.w0 w0Var = zp0Var.L;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                        }
                        if (zp0Var.U) {
                            zp0Var.a0(view, arrayList7.get(i10));
                            break;
                        } else {
                            int i25 = zp0Var.P;
                            if (i25 != 1 && i25 != 3) {
                                i15 = i25 == 2 ? 3 : i25 == 10 ? 10 : zp0Var.Q == null ? 4 : 0;
                            }
                            PhotoViewer.t1().K2(null, zp0Var, null);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i26 = zp0Var.D;
                            boolean z16 = zp0Var.E;
                            t12.h = i26;
                            t12.n = z16;
                            PhotoViewer.t1().f2(arrayList7, i10, i15, zp0Var.h0, zp0Var.t0, zp0Var.Q);
                            break;
                        }
                    }
                } else if (i10 < arrayList8.size()) {
                    String str = (String) arrayList8.get(i10);
                    dq0 dq0Var = zp0Var.p0;
                    if (dq0Var != null) {
                        switch (dq0Var.a) {
                            case 0:
                                eq0.h0(dq0Var.b, str);
                                break;
                            default:
                                eq0.h0(dq0Var.b, str);
                                break;
                        }
                    } else {
                        zp0Var.L.getSearchField().setText(str);
                        zp0Var.L.getSearchField().setSelection(str.length());
                        zp0Var.b0(zp0Var.L.getSearchField());
                        break;
                    }
                } else if (i10 == arrayList8.size() + 1) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(zp0Var.getParentActivity());
                    alertDialog$Builder4.a.N = LocaleController.getString(R.string.ClearSearchAlertTitle);
                    alertDialog$Builder4.a.P = LocaleController.getString(R.string.ClearSearchAlert);
                    alertDialog$Builder4.k(LocaleController.getString(R.string.ClearButton), new lp0(zp0Var, i14));
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.a;
                    zp0Var.showDialog(c2Var3);
                    TextView textView3 = (TextView) c2Var3.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        break;
                    }
                }
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.c7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.L4) >= 0 && i12 < arrayList9.size()) {
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
                d(i10, view);
                break;
            case 27:
                ProfileActivity.f0((ProfileActivity) this.b, i10);
                break;
            case 28:
                ProxyListActivity.U((ProxyListActivity) this.b, view, i10);
                break;
            default:
                z11 z11Var = (z11) this.b;
                org.telegram.ui.Components.jl0 jl0Var = z11Var.y;
                org.telegram.ui.Components.ep epVar = z11Var.b;
                if (epVar.d.get(i10) != z11Var.G && z11Var.K == null) {
                    z11Var.M = false;
                    z11Var.G = (org.telegram.ui.Components.fp) epVar.d.get(i10);
                    epVar.E(i10);
                    z11Var.h.postDelayed(new org.telegram.ui.Components.i8(z11Var, i10, 26), 100L);
                    for (int i27 = 0; i27 < jl0Var.getChildCount(); i27++) {
                        org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) jl0Var.getChildAt(i27);
                        if (l11Var != view && (fq0Var = l11Var.F) != null) {
                            AndroidUtilities.cancelRunOnUIThread(fq0Var);
                            l11Var.F.run();
                        }
                    }
                    if (!((org.telegram.ui.Components.fp) epVar.d.get(i10)).a.a) {
                        ((org.telegram.ui.Components.l11) view).d();
                    }
                    m11 m11Var = z11Var.F;
                    if (m11Var != null) {
                        m11Var.a.d0(i10, z11Var.G.a, true);
                        break;
                    }
                }
                break;
        }
    }
}
