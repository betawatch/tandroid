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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    private final void b(int i10, View view) {
        boolean z10;
        hv0 hv0Var = (hv0) this.b;
        boolean[] zArr = hv0Var.w;
        if (i10 == hv0Var.o0) {
            hv0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.v8) {
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            boolean z11 = hv0Var.L;
            org.telegram.ui.Components.gz0 gz0Var = hv0Var.Q;
            if (gz0Var != null) {
                gz0Var.f();
            }
            if (hv0Var.I) {
                int i11 = -hv0Var.O;
                hv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(v8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == hv0Var.r0) {
                z10 = !hv0Var.G;
                hv0Var.G = z10;
            } else {
                int i12 = hv0Var.u0;
                if (i10 == i12) {
                    z10 = !hv0Var.H;
                    hv0Var.H = z10;
                } else if (i10 == hv0Var.v0) {
                    boolean z12 = !hv0Var.J;
                    hv0Var.J = z12;
                    hv0Var.r0();
                    int i13 = hv0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        hv0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        hv0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == hv0Var.s0) {
                    boolean z13 = hv0Var.K;
                    boolean z14 = !z13;
                    hv0Var.K = z14;
                    if (!z13 && hv0Var.L) {
                        int i14 = hv0Var.j0;
                        hv0Var.L = false;
                        hv0Var.r0();
                        s4.b1 K = hv0Var.c.K(hv0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.v8) K.a).setChecked(false);
                        } else {
                            hv0Var.b.m(hv0Var.t0);
                        }
                        hv0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (hv0Var.N != 0) {
                        return;
                    }
                    z10 = !hv0Var.L;
                    hv0Var.L = z10;
                    int i15 = hv0Var.j0;
                    hv0Var.r0();
                    if (hv0Var.L) {
                        hv0Var.b.s(hv0Var.j0, 2);
                    } else {
                        hv0Var.b.t(i15, 2);
                    }
                    if (hv0Var.L && hv0Var.K) {
                        hv0Var.K = false;
                        s4.b1 K2 = hv0Var.c.K(hv0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.v8) K2.a).setChecked(false);
                        } else {
                            hv0Var.b.m(hv0Var.s0);
                        }
                    }
                    if (hv0Var.L) {
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
            if (hv0Var.M && !hv0Var.L) {
                hv0Var.h.b(true);
            }
            hv0Var.c.getChildCount();
            for (int i17 = hv0Var.n0; i17 < hv0Var.n0 + hv0Var.y; i17++) {
                s4.b1 K3 = hv0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.c6) {
                        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view2;
                        c6Var.m(hv0Var.L, true);
                        c6Var.r.a(zArr[i17 - hv0Var.n0], z11);
                        if (c6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == hv0Var.t0 && !hv0Var.M) {
                            hv0Var.h.f(c6Var.getCheckBox(), true);
                            hv0Var.M = true;
                        }
                    }
                }
            }
            v8Var.setChecked(z10);
            hv0Var.i0();
        }
    }

    private final void c(int i10, View view) {
        rw0 rw0Var;
        pw0 pw0Var = (pw0) this.b;
        PremiumPreviewFragment premiumPreviewFragment = pw0Var.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        mw0 mw0Var = pw0Var.e;
        if (view.isEnabled() && (view instanceof sg.q1)) {
            sg.q1 q1Var = (sg.q1) view;
            premiumPreviewFragment.e = arrayList.indexOf(q1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            q1Var.c(true, true);
            for (int i11 = 0; i11 < mw0Var.getChildCount(); i11++) {
                View childAt = mw0Var.getChildAt(i11);
                if (childAt instanceof sg.q1) {
                    sg.q1 q1Var2 = (sg.q1) childAt;
                    if (q1Var2.getTier() != q1Var.getTier()) {
                        q1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < mw0Var.getHiddenChildCount(); i12++) {
                View V = mw0Var.V(i12);
                if (V instanceof sg.q1) {
                    sg.q1 q1Var3 = (sg.q1) V;
                    if (q1Var3.getTier() != q1Var.getTier()) {
                        q1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < mw0Var.getCachedChildCount(); i13++) {
                View P = mw0Var.P(i13);
                if (P instanceof sg.q1) {
                    sg.q1 q1Var4 = (sg.q1) P;
                    if (q1Var4.getTier() != q1Var.getTier()) {
                        q1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < mw0Var.getAttachedScrapChildCount(); i14++) {
                View O = mw0Var.O(i14);
                if (O instanceof sg.q1) {
                    sg.q1 q1Var5 = (sg.q1) O;
                    if (q1Var5.getTier() != q1Var.getTier()) {
                        q1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((rw0Var = premiumPreviewFragment.f) == null || rw0Var.a.months >= ((rw0) arrayList.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void d(int i10, View view) {
        mx0 mx0Var = (mx0) this.b;
        int i11 = mx0Var.y;
        if (i10 == mx0Var.w) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.f5.N(mx0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new kx0(mx0Var), null).a;
            b2Var.show();
            b2Var.h();
            return;
        }
        if (i10 != mx0Var.f) {
            if (i10 < mx0Var.r || i10 >= mx0Var.s) {
                return;
            }
            if (i11 != 1) {
                new Bundle();
                throw null;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", mx0Var.getMessagesController().blockePeers.keyAt(i10 - mx0Var.r));
            mx0Var.presentFragment(new ProfileActivity(bundle, null));
            return;
        }
        if (i11 != 1) {
            Bundle h = a1.g.h("isNeverShare", true);
            if (i11 == 2) {
                h.putInt("chatAddType", 2);
            }
            n60 n60Var = new n60(h);
            n60Var.w = new jx0(mx0Var);
            mx0Var.presentFragment(n60Var);
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
        contactsActivity.W = new yu(bvVar);
        contactsActivity.onFragmentCreate();
        mx0Var.presentFragment(bvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.wl0
    public final void a(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        pt ptVar;
        g00 g00Var;
        org.telegram.ui.Components.xc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13 = 8;
        int i14 = 4;
        kt ktVar = null;
        Object[] objArr = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                ArrayList arrayList = lVar.h;
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                int i16 = ((j) arrayList.get(i10)).d;
                if (i16 == 1) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = lVar.d;
                    boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                    globalPrivacySettings.keep_archived_unmuted = z10;
                    ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                    lVar.c = true;
                    return;
                }
                if (i16 == 4) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = lVar.d;
                    boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                    globalPrivacySettings2.keep_archived_folders = z11;
                    ((org.telegram.ui.Cells.v8) view).setChecked(z11);
                    lVar.c = true;
                    return;
                }
                if (i16 == 7) {
                    if (lVar.getUserConfig().isPremium() || lVar.getMessagesController().autoarchiveAvailable || lVar.d.archive_and_mute_new_noncontact_peers) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = lVar.d;
                        boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                        ((org.telegram.ui.Cells.v8) view).setChecked(z12);
                        lVar.c = true;
                        return;
                    }
                    org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(lVar.getParentActivity(), lVar.getResourceProvider());
                    org.telegram.ui.Components.x90 x90Var = icVar.b;
                    x90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.h6.Gi, 0, new ut0(lVar, r10)));
                    x90Var.setSingleLine(false);
                    x90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                    icVar.a.setImageResource(R.drawable.msg_settings_premium);
                    org.telegram.ui.Components.qc.g(lVar, icVar, 3500).j();
                    int i17 = -lVar.e;
                    lVar.e = i17;
                    AndroidUtilities.shakeViewSpring(view, i17);
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
                org.telegram.ui.Components.oy0 oy0Var = new org.telegram.ui.Components.oy0(pVar.getParentActivity(), pVar, inputStickerSet, null, null, null);
                oy0Var.c0 = new n(pVar, view, stickerSetCovered);
                pVar.showDialog(oy0Var);
                return;
            case 2:
                r4 r4Var = (r4) this.b;
                ti.a aVar = ti.e.b;
                if (i10 != 1) {
                    aVar.a();
                    if (aVar.d && i10 == 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r4Var.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new p4(r4Var, objArr == true ? 1 : 0));
                        r4Var.showDialog(alertDialog$Builder.a);
                        return;
                    }
                    return;
                }
                synchronized (aVar) {
                    if (!aVar.b) {
                        SharedPreferences sharedPreferences = ti.d.a;
                        aVar.c = sharedPreferences.contains("audio_recorder_v2_enabled");
                        aVar.d = sharedPreferences.getBoolean("audio_recorder_v2_enabled", true);
                        aVar.b = true;
                    }
                    boolean z13 = !aVar.d;
                    aVar.d = z13;
                    aVar.c = true;
                    aVar.b = true;
                    ti.d.a.edit().putBoolean("audio_recorder_v2_enabled", z13).apply();
                }
                r4Var.b.l();
                return;
            case 3:
                bd bdVar = (bd) this.b;
                ArrayList arrayList2 = bdVar.c;
                ua1 ua1Var = bdVar.d;
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList2.get(i10);
                bdVar.a(vpVar.a(), true);
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + ua1Var.getPaddingLeft()) {
                    ua1Var.v0(-((AndroidUtilities.dp(48.0f) + ua1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                } else if (view.getWidth() + view.getLeft() > (ua1Var.getMeasuredWidth() - ua1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    ua1Var.v0(org.telegram.messenger.q.A(48.0f, ua1Var.getMeasuredWidth() - ua1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                }
                Utilities.Callback callback = bdVar.r;
                if (callback != null) {
                    callback.run(vpVar.a());
                    return;
                }
                return;
            case 4:
                kp kpVar = (kp) this.b;
                boolean z14 = kpVar.s;
                if (kpVar.getParentActivity() == null) {
                    return;
                }
                s4.g0 adapter = kpVar.b.getAdapter();
                jp jpVar = kpVar.e;
                if (adapter == jpVar) {
                    chat = (TLRPC.Chat) jpVar.d.get(i10);
                } else {
                    int i18 = kpVar.G;
                    chat = (i10 < i18 || i10 >= kpVar.H) ? null : (TLRPC.Chat) kpVar.v.get(i10 - i18);
                }
                if (chat != null) {
                    if (z14 && kpVar.h.linked_chat_id == 0) {
                        kpVar.a0(chat, true);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    kpVar.presentFragment(new sn(bundle));
                    return;
                }
                if (i10 == kpVar.F) {
                    if (z14 && kpVar.h.linked_chat_id == 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLongArray("result", new long[]{kpVar.getUserConfig().getClientUserId()});
                        bundle2.putInt("chatType", 4);
                        TLRPC.Chat chat2 = kpVar.f;
                        if (chat2 != null) {
                            bundle2.putString("title", LocaleController.formatString("GroupCreateDiscussionDefaultName", R.string.GroupCreateDiscussionDefaultName, chat2.title));
                        }
                        u60 u60Var = new u60(bundle2);
                        u60Var.Y = new cp(kpVar);
                        kpVar.presentFragment(u60Var);
                        return;
                    }
                    if (kpVar.v.isEmpty()) {
                        return;
                    }
                    TLRPC.Chat chat3 = (TLRPC.Chat) kpVar.v.get(0);
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kpVar.getParentActivity());
                    if (z14) {
                        string = LocaleController.getString(R.string.DiscussionUnlinkGroup);
                        formatString = LocaleController.formatString("DiscussionUnlinkChannelAlert", R.string.DiscussionUnlinkChannelAlert, chat3.title);
                    } else {
                        string = LocaleController.getString(R.string.DiscussionUnlinkChannel);
                        formatString = LocaleController.formatString("DiscussionUnlinkGroupAlert", R.string.DiscussionUnlinkGroupAlert, chat3.title);
                    }
                    alertDialog$Builder2.a.R = string;
                    alertDialog$Builder2.a.T = AndroidUtilities.replaceTags(formatString);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new b1(kpVar, 22));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.a;
                    kpVar.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                rp rpVar = (rp) this.b;
                ArrayList arrayList3 = rpVar.r;
                boolean z15 = rpVar.G;
                if (i10 <= (z15 ? 1 : 2)) {
                    return;
                }
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) arrayList3.get(i10 - (z15 ? 2 : 3));
                boolean contains = rpVar.d.contains(tL_availableReaction.reaction);
                boolean z16 = !contains;
                if (contains) {
                    rpVar.d.remove(tL_availableReaction.reaction);
                    if (rpVar.d.isEmpty()) {
                        qp qpVar = rpVar.h;
                        if (qpVar != null) {
                            qpVar.t(rpVar.G ? 1 : 2, arrayList3.size() + 1);
                        }
                        rpVar.V(2, true);
                    }
                } else {
                    rpVar.d.add(tL_availableReaction.reaction);
                }
                Switch r22 = yVar.c;
                if (r22 != null) {
                    r22.c(z16, true);
                }
                org.telegram.ui.Components.xp xpVar = yVar.d;
                if (xpVar != null) {
                    xpVar.a(z16, true);
                    return;
                }
                return;
            case 6:
                ct ctVar = (ct) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((ft) view).d;
                gt gtVar = ctVar.a;
                ah.t0 reactionsWindow = gtVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.ty0.c(null, gtVar.c0, gtVar.z.getContext(), new g5(ctVar, 9));
                    return;
                }
                et etVar = gtVar.l;
                if (etVar != null) {
                    etVar.w(stickerSetCovered2.set, TextUtils.join("", gtVar.o));
                }
                gtVar.p();
                return;
            case 7:
                qt qtVar = (qt) this.b;
                if (qtVar.f && qtVar.e) {
                    ot otVar = qtVar.d;
                    ArrayList arrayList4 = otVar.e;
                    if (arrayList4 != null && i10 >= 0 && i10 < arrayList4.size()) {
                        ktVar = (kt) otVar.e.get(i10);
                    }
                } else {
                    int S = qtVar.c.S(i10);
                    int Q = qtVar.c.Q(i10);
                    if (Q < 0 || S < 0) {
                        return;
                    } else {
                        ktVar = qtVar.c.O(S, Q);
                    }
                }
                if (i10 < 0) {
                    return;
                }
                qtVar.finishFragment();
                if (ktVar == null || (ptVar = qtVar.r) == null) {
                    return;
                }
                ptVar.L0(ktVar);
                return;
            case 8:
                ju juVar = (ju) this.b;
                ArrayList arrayList5 = juVar.a3;
                nu nuVar = juVar.m3;
                if ((view instanceof cu) && i10 >= 0 && i10 < arrayList5.size()) {
                    eu euVar = (eu) arrayList5.get(i10);
                    if (euVar != null) {
                        int i19 = euVar.h;
                        if (i19 >= 0) {
                            juVar.g3[i19] = !r3[i19];
                            juVar.B1(true);
                            return;
                        } else {
                            if (i19 == -2) {
                                nuVar.presentFragment(new DataAutoDownloadActivity(juVar.W2 - 1));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.q8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(nuVar.getParentActivity());
                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new fu(juVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.a;
                    nuVar.showDialog(b2Var2);
                    TextView textView2 = (TextView) b2Var2.d(-1);
                    if (textView2 != null) {
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                nz.V((nz) this.b, view, i10);
                return;
            case 10:
                p00 p00Var = (p00) this.b;
                if (p00Var.getParentActivity() == null || (g00Var = (g00) p00Var.P.get(i10)) == null) {
                    return;
                }
                View.OnClickListener onClickListener = g00Var.c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                int i20 = g00Var.a;
                boolean z17 = true;
                if (i20 == 1) {
                    org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                    p00Var.v0(g00Var, vaVar.getName(), vaVar.getCurrentObject(), g00Var.g);
                    return;
                }
                if (i20 == 7) {
                    nt ntVar = new nt(13, p00Var, g00Var);
                    if (p00Var.c.isEnabled()) {
                        p00Var.s0(ntVar, false);
                        return;
                    } else {
                        ntVar.run();
                        return;
                    }
                }
                if (i20 == 8 || (i20 == 4 && g00Var.k == R.drawable.msg2_link2)) {
                    MessagesController.DialogFilter dialogFilter = p00Var.r;
                    org.telegram.ui.ActionBar.d6 d6Var = null;
                    if (p00Var.s && p00Var.c.getAlpha() > 0.0f) {
                        float f7 = -p00Var.Q;
                        p00Var.Q = f7;
                        AndroidUtilities.shakeViewSpring(view, f7);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        p00Var.v = true;
                        cj cjVar = p00Var.R;
                        if (cjVar == null || cjVar.getVisibility() != 0) {
                            cj cjVar2 = new cj(6, 2, p00Var.getParentActivity(), d6Var, z17);
                            p00Var.R = cjVar2;
                            cjVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                            p00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                            p00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            p00Var.getParentLayout().getOverlayContainerView().addView(p00Var.R, marginLayoutParams);
                            p00Var.R.f(p00Var.c, true);
                            return;
                        }
                        return;
                    }
                    if (!(TextUtils.isEmpty(p00Var.w) && TextUtils.isEmpty(dialogFilter.name)) && (p00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && p00Var.G.isEmpty() && !p00Var.F.isEmpty()) {
                        p00Var.s0(new rz(p00Var, 1), false);
                        return;
                    }
                    float f10 = -p00Var.Q;
                    p00Var.Q = f10;
                    AndroidUtilities.shakeViewSpring(view, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (TextUtils.isEmpty(p00Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                        a02 = org.telegram.ui.Components.xc.a0(p00Var);
                        i11 = R.string.FilterInviteErrorEmptyName;
                    } else if ((p00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                        if (p00Var.G.isEmpty()) {
                            a02 = org.telegram.ui.Components.xc.a0(p00Var);
                            i11 = R.string.FilterInviteErrorTypes;
                        } else {
                            a02 = org.telegram.ui.Components.xc.a0(p00Var);
                            i11 = R.string.FilterInviteErrorTypesExcluded;
                        }
                    } else if (p00Var.F.isEmpty()) {
                        a02 = org.telegram.ui.Components.xc.a0(p00Var);
                        i11 = R.string.FilterInviteErrorEmpty;
                    } else {
                        a02 = org.telegram.ui.Components.xc.a0(p00Var);
                        i11 = R.string.FilterInviteErrorExcluded;
                    }
                    org.telegram.messenger.wh.q(i11, a02, null);
                    return;
                }
                return;
            case 11:
                c00 c00Var = (c00) this.b;
                ArrayList arrayList6 = c00Var.d0;
                int i21 = i10 - 1;
                if (i21 < 0 || i21 >= arrayList6.size()) {
                    return;
                }
                g00 g00Var2 = (g00) arrayList6.get(i21);
                int i22 = g00Var2.a;
                if (i22 == 7) {
                    c00Var.dismiss();
                    c00Var.n.presentFragment(new nz(c00Var.X, g00Var2.m));
                    return;
                } else {
                    if (i22 == 8) {
                        c00Var.R();
                        return;
                    }
                    return;
                }
            case 12:
                g10 g10Var = (g10) this.b;
                if (view instanceof org.telegram.ui.Cells.i7) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.i7) view).getMessage(), 0);
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.m7) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.m7) view).getMessage(), 0);
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.h7) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.h7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.f2) {
                    g10Var.f(i10, view, ((org.telegram.ui.Cells.f2) view).getMessageObject(), 0);
                    return;
                } else {
                    if (view instanceof org.telegram.ui.Cells.r2) {
                        g10Var.f(i10, view, ((org.telegram.ui.Cells.r2) view).getMessage(), 0);
                        return;
                    }
                    return;
                }
            case 13:
                w60 w60Var = (w60) this.b;
                if (w60Var.getParentActivity() == null) {
                    return;
                }
                if (i10 == w60Var.n || i10 == 0) {
                    if (w60Var.f == null) {
                        return;
                    }
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", w60Var.f.link));
                        org.telegram.ui.Components.xc.j(w60Var).j();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (i10 != w60Var.s) {
                    if (i10 == w60Var.r) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(w60Var.getParentActivity());
                        alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new wt(w60Var, 12));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        w60Var.showDialog(alertDialog$Builder4.a);
                        return;
                    }
                    return;
                }
                if (w60Var.f == null) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", w60Var.f.link);
                    w60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 14:
                c70.U((c70) this.b, view, i10);
                return;
            case 15:
                t70.U((t70) this.b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                return;
            case 17:
                pc0 pc0Var = (pc0) this.b;
                pc0Var.i0 = -1L;
                int i23 = pc0Var.G0;
                if (i23 == 4) {
                    if (i10 != 1 || (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) pc0Var.T.J(i10)) == null) {
                        return;
                    }
                    if (pc0Var.e0 == 0) {
                        pc0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        pc0Var.finishFragment();
                        return;
                    }
                    org.telegram.ui.ActionBar.b2[] b2VarArr = {new org.telegram.ui.ActionBar.b2(pc0Var.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                    tL_channels_editLocation.address = tL_messageMediaVenue.address;
                    tL_channels_editLocation.channel = pc0Var.getMessagesController().getInputChannel(-pc0Var.e0);
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                    TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                    tL_inputGeoPoint.lat = geoPoint.lat;
                    tL_inputGeoPoint._long = geoPoint._long;
                    b2VarArr[0].setOnCancelListener(new ai.e0(pc0Var, pc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ea(pc0Var, b2VarArr, tL_messageMediaVenue, 19)), i13));
                    pc0Var.showDialog(b2VarArr[0]);
                    return;
                }
                if (i23 == 5) {
                    IMapsProvider.IMap iMap = pc0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = pc0Var.z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i10 == 1 && (messageObject = pc0Var.B0) != null && (!messageObject.isLiveLocation() || i23 == 6)) {
                    IMapsProvider.IMap iMap2 = pc0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = pc0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i10 == 1 && i23 != 2) {
                    if (pc0Var.F0 == null || pc0Var.x0 == null) {
                        return;
                    }
                    FrameLayout frameLayout = pc0Var.o0;
                    if (frameLayout != null) {
                        frameLayout.callOnClick();
                        return;
                    }
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(pc0Var.x0.getLatitude());
                    tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(pc0Var.x0.getLongitude());
                    pc0Var.F0.b(tL_messageMediaGeo, pc0Var.G0, true, 0, 0L);
                    pc0Var.finishFragment();
                    return;
                }
                if (i23 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.e0) && pc0Var.T.j(i10) == 7) {
                    pc0Var.getLocationController().removeSharingLocation(pc0Var.e0);
                    pc0Var.T.l();
                    pc0Var.finishFragment();
                    return;
                }
                if (i23 == 2 && pc0Var.getLocationController().isSharingLocation(pc0Var.e0) && pc0Var.T.j(i10) == 6) {
                    pc0Var.r0(pc0Var.getLocationController().getSharingLocationInfo(pc0Var.e0).period != Integer.MAX_VALUE);
                    return;
                }
                if ((i10 == 2 && i23 == 1) || ((i10 == 1 && i23 == 2) || (i10 == 3 && i23 == 3))) {
                    if (!pc0Var.getLocationController().isSharingLocation(pc0Var.e0)) {
                        pc0Var.r0(false);
                        return;
                    }
                    pc0Var.getLocationController().removeSharingLocation(pc0Var.e0);
                    pc0Var.T.l();
                    pc0Var.finishFragment();
                    return;
                }
                Object J = pc0Var.T.J(i10);
                if (J instanceof TLRPC.TL_messageMediaVenue) {
                    pc0Var.F0.b((TLRPC.TL_messageMediaVenue) J, pc0Var.G0, true, 0, 0L);
                    pc0Var.finishFragment();
                    return;
                } else {
                    if (J instanceof jc0) {
                        jc0 jc0Var = (jc0) J;
                        pc0Var.i0 = jc0Var.a;
                        if (pc0Var.j0) {
                            pc0Var.j0 = false;
                            pc0Var.B0();
                        }
                        pc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), pc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
            case 18:
                ((oi0) this.b).onBackPressed();
                return;
            case 19:
                wi0 wi0Var = (wi0) this.b;
                int i24 = wi0Var.I;
                if (i10 < i24 || i10 >= wi0Var.J) {
                    return;
                }
                MessageObject messageObject2 = (MessageObject) wi0Var.x.get(i10 - i24);
                if (messageObject2.isStory()) {
                    if (wi0Var.a0(messageObject2)) {
                        return;
                    }
                    wi0Var.getOrCreateStoryViewer().F(wi0Var.getParentActivity(), messageObject2.storyItem, ci.r7.a(wi0Var.f));
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
                if (wi0Var.getMessagesController().checkCanOpenChat(bundle3, wi0Var)) {
                    wi0Var.presentFragment(new sn(bundle3));
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                return;
            case 21:
                ip0 ip0Var = (ip0) this.b;
                ip0Var.a(i10, true);
                vo0 vo0Var = ip0Var.h;
                if (vo0Var != null) {
                    vo0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                kq0 kq0Var = (kq0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = kq0Var.f;
                ArrayList arrayList8 = kq0Var.n;
                MediaController.AlbumEntry albumEntry = kq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        oq0 oq0Var = kq0Var.t0;
                        if (oq0Var == null) {
                            kq0Var.P.getSearchField().setText(str);
                            kq0Var.P.getSearchField().setSelection(str.length());
                            kq0Var.b0(kq0Var.P.getSearchField());
                            return;
                        } else {
                            switch (oq0Var.a) {
                                case 0:
                                    pq0.h0(oq0Var.b, str);
                                    return;
                                default:
                                    pq0.h0(oq0Var.b, str);
                                    return;
                            }
                        }
                    }
                    if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(kq0Var.getParentActivity());
                        alertDialog$Builder5.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new xp0(kq0Var, i14));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder5.a;
                        kq0Var.showDialog(b2Var3);
                        TextView textView3 = (TextView) b2Var3.d(-1);
                        if (textView3 != null) {
                            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
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
                org.telegram.ui.ActionBar.u0 u0Var = kq0Var.P;
                if (u0Var != null) {
                    AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                }
                if (kq0Var.Y) {
                    kq0Var.a0(view, arrayList7.get(i10));
                    return;
                }
                int i25 = kq0Var.T;
                if (i25 != 1 && i25 != 3) {
                    if (i25 != 2) {
                        r10 = 10;
                        if (i25 != 10) {
                            i15 = kq0Var.U == null ? 4 : 0;
                        }
                    }
                    i15 = r10;
                }
                PhotoViewer.t1().K2(null, kq0Var, null);
                PhotoViewer t12 = PhotoViewer.t1();
                int i26 = kq0Var.H;
                boolean z18 = kq0Var.I;
                t12.h = i26;
                t12.n = z18;
                PhotoViewer.t1().g2(arrayList7, i10, i15, kq0Var.l0, kq0Var.x0, kq0Var.U);
                return;
            case 23:
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
                ProfileActivity.W((ProfileActivity) this.b, i10);
                return;
        }
    }
}
