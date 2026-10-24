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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        iv0 iv0Var = (iv0) this.b;
        boolean[] zArr = iv0Var.w;
        if (i10 == iv0Var.o0) {
            iv0Var.f0();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.w8) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            boolean z11 = iv0Var.L;
            org.telegram.ui.Components.lz0 lz0Var = iv0Var.Q;
            if (lz0Var != null) {
                lz0Var.f();
            }
            if (iv0Var.I) {
                int i11 = -iv0Var.O;
                iv0Var.O = i11;
                AndroidUtilities.shakeViewSpring(w8Var, i11);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            if (i10 == iv0Var.r0) {
                z10 = !iv0Var.G;
                iv0Var.G = z10;
            } else {
                int i12 = iv0Var.u0;
                if (i10 == i12) {
                    z10 = !iv0Var.H;
                    iv0Var.H = z10;
                } else if (i10 == iv0Var.v0) {
                    boolean z12 = !iv0Var.J;
                    iv0Var.J = z12;
                    iv0Var.r0();
                    int i13 = iv0Var.u0;
                    if (i13 >= 0 && i12 < 0) {
                        iv0Var.b.o(i13);
                    } else if (i12 >= 0 && i13 < 0) {
                        iv0Var.b.u(i12);
                    }
                    z10 = z12;
                } else if (i10 == iv0Var.s0) {
                    boolean z13 = iv0Var.K;
                    boolean z14 = !z13;
                    iv0Var.K = z14;
                    if (!z13 && iv0Var.L) {
                        int i14 = iv0Var.j0;
                        iv0Var.L = false;
                        iv0Var.r0();
                        s4.b1 K = iv0Var.c.K(iv0Var.t0);
                        if (K != null) {
                            ((org.telegram.ui.Cells.w8) K.a).setChecked(false);
                        } else {
                            iv0Var.b.m(iv0Var.t0);
                        }
                        iv0Var.b.t(i14, 2);
                    }
                    z10 = z14;
                } else {
                    if (iv0Var.N != 0) {
                        return;
                    }
                    z10 = !iv0Var.L;
                    iv0Var.L = z10;
                    int i15 = iv0Var.j0;
                    iv0Var.r0();
                    if (iv0Var.L) {
                        iv0Var.b.s(iv0Var.j0, 2);
                    } else {
                        iv0Var.b.t(i15, 2);
                    }
                    if (iv0Var.L && iv0Var.K) {
                        iv0Var.K = false;
                        s4.b1 K2 = iv0Var.c.K(iv0Var.s0);
                        if (K2 != null) {
                            ((org.telegram.ui.Cells.w8) K2.a).setChecked(false);
                        } else {
                            iv0Var.b.m(iv0Var.s0);
                        }
                    }
                    if (iv0Var.L) {
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
            if (iv0Var.M && !iv0Var.L) {
                iv0Var.c.getChildCount();
                iv0Var.h.b(true);
            }
            for (int i17 = iv0Var.n0; i17 < iv0Var.n0 + iv0Var.y; i17++) {
                s4.b1 K3 = iv0Var.c.K(i17);
                if (K3 != null) {
                    View view2 = K3.a;
                    if (view2 instanceof org.telegram.ui.Cells.d6) {
                        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view2;
                        d6Var.m(iv0Var.L, true);
                        d6Var.r.a(zArr[i17 - iv0Var.n0], z11);
                        if (d6Var.getTop() > AndroidUtilities.dp(40.0f) && i10 == iv0Var.t0 && !iv0Var.M) {
                            iv0Var.h.f(d6Var.getCheckBox(), true);
                            iv0Var.M = true;
                        }
                    }
                }
            }
            w8Var.setChecked(z10);
            iv0Var.i0();
        }
    }

    private final void b(int i10, View view) {
        tw0 tw0Var;
        rw0 rw0Var = (rw0) this.b;
        PremiumPreviewFragment premiumPreviewFragment = rw0Var.n;
        ArrayList arrayList = premiumPreviewFragment.d;
        ow0 ow0Var = rw0Var.e;
        if (view.isEnabled() && (view instanceof sg.r1)) {
            sg.r1 r1Var = (sg.r1) view;
            premiumPreviewFragment.e = arrayList.indexOf(r1Var.getTier());
            boolean z10 = true;
            premiumPreviewFragment.t0(true);
            r1Var.c(true, true);
            for (int i11 = 0; i11 < ow0Var.getChildCount(); i11++) {
                View childAt = ow0Var.getChildAt(i11);
                if (childAt instanceof sg.r1) {
                    sg.r1 r1Var2 = (sg.r1) childAt;
                    if (r1Var2.getTier() != r1Var.getTier()) {
                        r1Var2.c(false, true);
                    }
                }
            }
            for (int i12 = 0; i12 < ow0Var.getHiddenChildCount(); i12++) {
                View V = ow0Var.V(i12);
                if (V instanceof sg.r1) {
                    sg.r1 r1Var3 = (sg.r1) V;
                    if (r1Var3.getTier() != r1Var.getTier()) {
                        r1Var3.c(false, true);
                    }
                }
            }
            for (int i13 = 0; i13 < ow0Var.getCachedChildCount(); i13++) {
                View P = ow0Var.P(i13);
                if (P instanceof sg.r1) {
                    sg.r1 r1Var4 = (sg.r1) P;
                    if (r1Var4.getTier() != r1Var.getTier()) {
                        r1Var4.c(false, true);
                    }
                }
            }
            for (int i14 = 0; i14 < ow0Var.getAttachedScrapChildCount(); i14++) {
                View O = ow0Var.O(i14);
                if (O instanceof sg.r1) {
                    sg.r1 r1Var5 = (sg.r1) O;
                    if (r1Var5.getTier() != r1Var.getTier()) {
                        r1Var5.c(false, true);
                    }
                }
            }
            FrameLayout frameLayout = premiumPreviewFragment.J;
            if (premiumPreviewFragment.getUserConfig().isPremium() && ((tw0Var = premiumPreviewFragment.f) == null || tw0Var.a.months >= ((tw0) arrayList.get(premiumPreviewFragment.e)).a.months || premiumPreviewFragment.p0)) {
                z10 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10);
        }
    }

    private final void c(int i10, View view) {
        ox0 ox0Var = (ox0) this.b;
        int i11 = ox0Var.y;
        if (i10 == ox0Var.w) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.f5.O(ox0Var.getParentActivity(), LocaleController.getString(R.string.NotificationsDeleteAllExceptionTitle), LocaleController.getString(R.string.NotificationsDeleteAllExceptionAlert), LocaleController.getString(R.string.Delete), new mx0(ox0Var), null).a;
            c2Var.show();
            c2Var.i();
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
            Bundle h = a1.g.h("isNeverShare", true);
            if (i11 == 2) {
                h.putInt("chatAddType", 2);
            }
            p60 p60Var = new p60(h);
            p60Var.w = new lx0(ox0Var);
            ox0Var.presentFragment(p60Var);
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
        ey eyVar = new ey(bundle2);
        cvVar.a = eyVar;
        eyVar.C2 = new zu(cvVar);
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
        cvVar.b = contactsActivity;
        contactsActivity.W = new zu(cvVar);
        contactsActivity.onFragmentCreate();
        ox0Var.presentFragment(cvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.am0
    public final void d(int i10, View view) {
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        TLRPC.Chat chat;
        String string;
        String formatString;
        qt qtVar;
        h00 h00Var;
        org.telegram.ui.Components.xc a02;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        int i12;
        int i13 = 8;
        int i14 = 4;
        lt ltVar = null;
        Object[] objArr = 0;
        int i15 = 1;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                ArrayList arrayList = kVar.h;
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                int i16 = ((i) arrayList.get(i10)).d;
                if (i16 == 1) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings = kVar.d;
                    boolean z10 = !globalPrivacySettings.keep_archived_unmuted;
                    globalPrivacySettings.keep_archived_unmuted = z10;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                    kVar.c = true;
                    return;
                }
                if (i16 == 4) {
                    TLRPC.GlobalPrivacySettings globalPrivacySettings2 = kVar.d;
                    boolean z11 = !globalPrivacySettings2.keep_archived_folders;
                    globalPrivacySettings2.keep_archived_folders = z11;
                    ((org.telegram.ui.Cells.w8) view).setChecked(z11);
                    kVar.c = true;
                    return;
                }
                if (i16 == 7) {
                    if (kVar.getUserConfig().isPremium() || kVar.getMessagesController().autoarchiveAvailable || kVar.d.archive_and_mute_new_noncontact_peers) {
                        TLRPC.GlobalPrivacySettings globalPrivacySettings3 = kVar.d;
                        boolean z12 = !globalPrivacySettings3.archive_and_mute_new_noncontact_peers;
                        globalPrivacySettings3.archive_and_mute_new_noncontact_peers = z12;
                        ((org.telegram.ui.Cells.w8) view).setChecked(z12);
                        kVar.c = true;
                        return;
                    }
                    org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(kVar.getParentActivity(), kVar.getResourceProvider());
                    org.telegram.ui.Components.y90 y90Var = icVar.b;
                    y90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.UnlockPremium), org.telegram.ui.ActionBar.k6.Gi, 0, new vt0(kVar, r10)));
                    y90Var.setSingleLine(false);
                    y90Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                    icVar.a.setImageResource(R.drawable.msg_settings_premium);
                    org.telegram.ui.Components.qc.g(kVar, icVar, 3500).j();
                    int i17 = -kVar.e;
                    kVar.e = i17;
                    AndroidUtilities.shakeViewSpring(view, i17);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
            case 1:
                o oVar = (o) this.b;
                if (i10 < oVar.x || i10 >= oVar.y || oVar.getParentActivity() == null) {
                    return;
                }
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
                org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(oVar.getParentActivity(), oVar, inputStickerSet, null, null, null);
                ty0Var.c0 = new m(oVar, view, stickerSetCovered);
                oVar.showDialog(ty0Var);
                return;
            case 2:
                q4 q4Var = (q4) this.b;
                ti.a aVar = ti.e.b;
                if (i10 != 1) {
                    aVar.a();
                    if (aVar.d && i10 == 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(q4Var.getParentActivity());
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.AudioRecorderNoiseSuppression);
                        alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.AudioRecorderNoiseSuppressionOff), LocaleController.getString(R.string.AudioRecorderNoiseSuppressionRNNoise)}, new o4(q4Var, objArr == true ? 1 : 0));
                        q4Var.showDialog(alertDialog$Builder.a);
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
                q4Var.b.l();
                return;
            case 3:
                zc zcVar = (zc) this.b;
                ArrayList arrayList2 = zcVar.c;
                xa1 xa1Var = zcVar.d;
                if (i10 < 0 || i10 >= arrayList2.size()) {
                    return;
                }
                org.telegram.ui.Components.vp vpVar = (org.telegram.ui.Components.vp) arrayList2.get(i10);
                zcVar.a(vpVar.a(), true);
                if (view.getLeft() < AndroidUtilities.dp(24.0f) + xa1Var.getPaddingLeft()) {
                    xa1Var.v0(-((AndroidUtilities.dp(48.0f) + xa1Var.getPaddingLeft()) - view.getLeft()), 0, null);
                } else if (view.getWidth() + view.getLeft() > (xa1Var.getMeasuredWidth() - xa1Var.getPaddingRight()) - AndroidUtilities.dp(24.0f)) {
                    xa1Var.v0(org.telegram.messenger.v0.z(48.0f, xa1Var.getMeasuredWidth() - xa1Var.getPaddingRight(), view.getWidth() + view.getLeft()), 0, null);
                }
                Utilities.Callback callback = zcVar.r;
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
                        w60 w60Var = new w60(bundle2);
                        w60Var.Y = new cp(kpVar);
                        kpVar.presentFragment(w60Var);
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
                    alertDialog$Builder2.k(LocaleController.getString(R.string.DiscussionUnlink), new a1(kpVar, 22));
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.a;
                    kpVar.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, null);
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
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
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
                Switch r22 = xVar.c;
                if (r22 != null) {
                    r22.c(z16, true);
                }
                org.telegram.ui.Components.xp xpVar = xVar.d;
                if (xpVar != null) {
                    xpVar.a(z16, true);
                    return;
                }
                return;
            case 6:
                dt dtVar = (dt) this.b;
                TLRPC.StickerSetCovered stickerSetCovered2 = ((gt) view).d;
                ht htVar = dtVar.a;
                ah.t0 reactionsWindow = htVar.P.getReactionsWindow();
                if (reactionsWindow != null && !reactionsWindow.q) {
                    reactionsWindow.d();
                }
                if (stickerSetCovered2 instanceof TLRPC.TL_stickerSetNoCovered) {
                    org.telegram.ui.Components.yy0.c(null, htVar.c0, htVar.z.getContext(), new f5(dtVar, 9));
                    return;
                }
                ft ftVar = htVar.l;
                if (ftVar != null) {
                    ftVar.w(stickerSetCovered2.set, TextUtils.join("", htVar.o));
                }
                htVar.n();
                return;
            case 7:
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
                    if (Q < 0 || S < 0) {
                        return;
                    } else {
                        ltVar = rtVar.c.O(S, Q);
                    }
                }
                if (i10 < 0) {
                    return;
                }
                rtVar.finishFragment();
                if (ltVar == null || (qtVar = rtVar.r) == null) {
                    return;
                }
                qtVar.L0(ltVar);
                return;
            case 8:
                ku kuVar = (ku) this.b;
                ArrayList arrayList5 = kuVar.d3;
                ou ouVar = kuVar.p3;
                if ((view instanceof du) && i10 >= 0 && i10 < arrayList5.size()) {
                    fu fuVar = (fu) arrayList5.get(i10);
                    if (fuVar != null) {
                        int i19 = fuVar.h;
                        if (i19 >= 0) {
                            kuVar.j3[i19] = !r3[i19];
                            kuVar.G1(true);
                            return;
                        } else {
                            if (i19 == -2) {
                                ouVar.presentFragment(new DataAutoDownloadActivity(kuVar.Z2 - 1));
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ouVar.getParentActivity());
                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.ResetStatisticsAlertTitle);
                    alertDialog$Builder3.a.T = LocaleController.getString(R.string.ResetStatisticsAlert);
                    alertDialog$Builder3.k(LocaleController.getString(R.string.Reset), new gu(kuVar));
                    alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder3.a;
                    ouVar.showDialog(c2Var2);
                    TextView textView2 = (TextView) c2Var2.d(-1);
                    if (textView2 != null) {
                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.q7, null);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                oz.V((oz) this.b, view, i10);
                return;
            case 10:
                q00 q00Var = (q00) this.b;
                if (q00Var.getParentActivity() == null || (h00Var = (h00) q00Var.P.get(i10)) == null) {
                    return;
                }
                View.OnClickListener onClickListener = h00Var.c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                int i20 = h00Var.a;
                boolean z17 = true;
                if (i20 == 1) {
                    org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
                    q00Var.v0(h00Var, waVar.getName(), waVar.getCurrentObject(), h00Var.g);
                    return;
                }
                if (i20 == 7) {
                    ot otVar = new ot(13, q00Var, h00Var);
                    if (q00Var.c.isEnabled()) {
                        q00Var.s0(otVar, false);
                        return;
                    } else {
                        otVar.run();
                        return;
                    }
                }
                if (i20 == 8 || (i20 == 4 && h00Var.k == R.drawable.msg2_link2)) {
                    MessagesController.DialogFilter dialogFilter = q00Var.r;
                    org.telegram.ui.ActionBar.g6 g6Var = null;
                    if (q00Var.s && q00Var.c.getAlpha() > 0.0f) {
                        float f7 = -q00Var.Q;
                        q00Var.Q = f7;
                        AndroidUtilities.shakeViewSpring(view, f7);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        q00Var.v = true;
                        aj ajVar = q00Var.R;
                        if (ajVar == null || ajVar.getVisibility() != 0) {
                            aj ajVar2 = new aj(6, 2, q00Var.getParentActivity(), g6Var, z17);
                            q00Var.R = ajVar2;
                            ajVar2.a.setMaxWidth(AndroidUtilities.displaySize.x);
                            q00Var.R.setExtraTranslationY(AndroidUtilities.dp(-16.0f));
                            q00Var.R.setText(LocaleController.getString(R.string.FilterFinishCreating));
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = AndroidUtilities.dp(3.0f);
                            q00Var.getParentLayout().getOverlayContainerView().addView(q00Var.R, marginLayoutParams);
                            q00Var.R.f(q00Var.c, true);
                            return;
                        }
                        return;
                    }
                    if (!(TextUtils.isEmpty(q00Var.w) && TextUtils.isEmpty(dialogFilter.name)) && (q00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) == 0 && q00Var.G.isEmpty() && !q00Var.F.isEmpty()) {
                        q00Var.s0(new sz(q00Var, 1), false);
                        return;
                    }
                    float f10 = -q00Var.Q;
                    q00Var.Q = f10;
                    AndroidUtilities.shakeViewSpring(view, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    if (TextUtils.isEmpty(q00Var.w) && TextUtils.isEmpty(dialogFilter.name)) {
                        a02 = org.telegram.ui.Components.xc.a0(q00Var);
                        i11 = R.string.FilterInviteErrorEmptyName;
                    } else if ((q00Var.y & (~(MessagesController.DIALOG_FILTER_FLAG_CHATLIST | MessagesController.DIALOG_FILTER_FLAG_CHATLIST_ADMIN))) != 0) {
                        if (q00Var.G.isEmpty()) {
                            a02 = org.telegram.ui.Components.xc.a0(q00Var);
                            i11 = R.string.FilterInviteErrorTypes;
                        } else {
                            a02 = org.telegram.ui.Components.xc.a0(q00Var);
                            i11 = R.string.FilterInviteErrorTypesExcluded;
                        }
                    } else if (q00Var.F.isEmpty()) {
                        a02 = org.telegram.ui.Components.xc.a0(q00Var);
                        i11 = R.string.FilterInviteErrorEmpty;
                    } else {
                        a02 = org.telegram.ui.Components.xc.a0(q00Var);
                        i11 = R.string.FilterInviteErrorExcluded;
                    }
                    org.telegram.messenger.sl.q(i11, a02, null);
                    return;
                }
                return;
            case 11:
                d00 d00Var = (d00) this.b;
                ArrayList arrayList6 = d00Var.e0;
                int i21 = i10 - 1;
                if (i21 < 0 || i21 >= arrayList6.size()) {
                    return;
                }
                h00 h00Var2 = (h00) arrayList6.get(i21);
                int i22 = h00Var2.a;
                if (i22 == 7) {
                    d00Var.dismiss();
                    d00Var.n.presentFragment(new oz(d00Var.Y, h00Var2.m));
                    return;
                } else {
                    if (i22 == 8) {
                        d00Var.Q();
                        return;
                    }
                    return;
                }
            case 12:
                i10 i10Var = (i10) this.b;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.k7) view).getMessage(), 0);
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.n7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.n7) view).getMessage(), 0);
                    return;
                }
                if (view instanceof org.telegram.ui.Cells.j7) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.j7) view).getMessage(), 0);
                    return;
                } else if (view instanceof org.telegram.ui.Cells.e2) {
                    i10Var.f(i10, view, ((org.telegram.ui.Cells.e2) view).getMessageObject(), 0);
                    return;
                } else {
                    if (view instanceof org.telegram.ui.Cells.q2) {
                        i10Var.f(i10, view, ((org.telegram.ui.Cells.q2) view).getMessage(), 0);
                        return;
                    }
                    return;
                }
            case 13:
                y60 y60Var = (y60) this.b;
                if (y60Var.getParentActivity() == null) {
                    return;
                }
                if (i10 == y60Var.n || i10 == 0) {
                    if (y60Var.f == null) {
                        return;
                    }
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", y60Var.f.link));
                        org.telegram.ui.Components.xc.j(y60Var).j();
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                if (i10 != y60Var.s) {
                    if (i10 == y60Var.r) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(y60Var.getParentActivity());
                        alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                        alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                        alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new xt(y60Var, 12));
                        alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                        y60Var.showDialog(alertDialog$Builder4.a);
                        return;
                    }
                    return;
                }
                if (y60Var.f == null) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", y60Var.f.link);
                    y60Var.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.InviteToGroupByLink)), 500);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 14:
                e70.U((e70) this.b, view, i10);
                return;
            case 15:
                x70.U((x70) this.b, view, i10);
                return;
            case 16:
                LanguageSelectActivity.U((LanguageSelectActivity) this.b, view, i10);
                return;
            case 17:
                sc0 sc0Var = (sc0) this.b;
                sc0Var.i0 = -1L;
                int i23 = sc0Var.G0;
                if (i23 == 4) {
                    if (i10 != 1 || (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) sc0Var.T.J(i10)) == null) {
                        return;
                    }
                    if (sc0Var.e0 == 0) {
                        sc0Var.F0.b(tL_messageMediaVenue, 4, true, 0, 0L);
                        sc0Var.finishFragment();
                        return;
                    }
                    org.telegram.ui.ActionBar.c2[] c2VarArr = {new org.telegram.ui.ActionBar.c2(sc0Var.getParentActivity(), 3, null)};
                    TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
                    tL_channels_editLocation.address = tL_messageMediaVenue.address;
                    tL_channels_editLocation.channel = sc0Var.getMessagesController().getInputChannel(-sc0Var.e0);
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_channels_editLocation.geo_point = tL_inputGeoPoint;
                    TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                    tL_inputGeoPoint.lat = geoPoint.lat;
                    tL_inputGeoPoint._long = geoPoint._long;
                    c2VarArr[0].setOnCancelListener(new ai.e0(sc0Var, sc0Var.getConnectionsManager().sendRequest(tL_channels_editLocation, new ca(sc0Var, c2VarArr, tL_messageMediaVenue, 19)), i13));
                    sc0Var.showDialog(c2VarArr[0]);
                    return;
                }
                if (i23 == 5) {
                    IMapsProvider.IMap iMap = sc0Var.I;
                    if (iMap != null) {
                        IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint2 = sc0Var.z0.geo_point;
                        iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), sc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i10 == 1 && (messageObject = sc0Var.B0) != null && (!messageObject.isLiveLocation() || i23 == 6)) {
                    IMapsProvider.IMap iMap2 = sc0Var.I;
                    if (iMap2 != null) {
                        IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                        TLRPC.GeoPoint geoPoint3 = sc0Var.B0.messageOwner.media.geo;
                        iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), sc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
                if (i10 == 1 && i23 != 2) {
                    if (sc0Var.F0 == null || sc0Var.x0 == null) {
                        return;
                    }
                    FrameLayout frameLayout = sc0Var.o0;
                    if (frameLayout != null) {
                        frameLayout.callOnClick();
                        return;
                    }
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(sc0Var.x0.getLatitude());
                    tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(sc0Var.x0.getLongitude());
                    sc0Var.F0.b(tL_messageMediaGeo, sc0Var.G0, true, 0, 0L);
                    sc0Var.finishFragment();
                    return;
                }
                if (i23 == 2 && sc0Var.getLocationController().isSharingLocation(sc0Var.e0) && sc0Var.T.j(i10) == 7) {
                    sc0Var.getLocationController().removeSharingLocation(sc0Var.e0);
                    sc0Var.T.l();
                    sc0Var.finishFragment();
                    return;
                }
                if (i23 == 2 && sc0Var.getLocationController().isSharingLocation(sc0Var.e0) && sc0Var.T.j(i10) == 6) {
                    sc0Var.s0(sc0Var.getLocationController().getSharingLocationInfo(sc0Var.e0).period != Integer.MAX_VALUE);
                    return;
                }
                if ((i10 == 2 && i23 == 1) || ((i10 == 1 && i23 == 2) || (i10 == 3 && i23 == 3))) {
                    if (!sc0Var.getLocationController().isSharingLocation(sc0Var.e0)) {
                        sc0Var.s0(false);
                        return;
                    }
                    sc0Var.getLocationController().removeSharingLocation(sc0Var.e0);
                    sc0Var.T.l();
                    sc0Var.finishFragment();
                    return;
                }
                Object J = sc0Var.T.J(i10);
                if (J instanceof TLRPC.TL_messageMediaVenue) {
                    sc0Var.F0.b((TLRPC.TL_messageMediaVenue) J, sc0Var.G0, true, 0, 0L);
                    sc0Var.finishFragment();
                    return;
                } else {
                    if (J instanceof mc0) {
                        mc0 mc0Var = (mc0) J;
                        sc0Var.i0 = mc0Var.a;
                        if (sc0Var.j0) {
                            sc0Var.j0 = false;
                            sc0Var.C0();
                        }
                        sc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(mc0Var.e.getPosition(), sc0Var.I.getMaxZoomLevel() - 4.0f));
                        return;
                    }
                    return;
                }
            case 18:
                ((qi0) this.b).onBackPressed();
                return;
            case 19:
                yi0 yi0Var = (yi0) this.b;
                int i24 = yi0Var.I;
                if (i10 < i24 || i10 >= yi0Var.J) {
                    return;
                }
                MessageObject messageObject2 = (MessageObject) yi0Var.x.get(i10 - i24);
                if (messageObject2.isStory()) {
                    if (yi0Var.b0(messageObject2)) {
                        return;
                    }
                    yi0Var.getOrCreateStoryViewer().F(yi0Var.getParentActivity(), messageObject2.storyItem, ci.q7.a(yi0Var.f));
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
                if (yi0Var.getMessagesController().checkCanOpenChat(bundle3, yi0Var)) {
                    yi0Var.presentFragment(new sn(bundle3));
                    return;
                }
                return;
            case 20:
                PasscodeActivity.V((PasscodeActivity) this.b, view, i10);
                return;
            case 21:
                kp0 kp0Var = (kp0) this.b;
                kp0Var.a(i10, true);
                xo0 xo0Var = kp0Var.h;
                if (xo0Var != null) {
                    xo0Var.run(Integer.valueOf(i10));
                    return;
                }
                return;
            case 22:
                mq0 mq0Var = (mq0) this.b;
                ArrayList<MediaController.PhotoEntry> arrayList7 = mq0Var.f;
                ArrayList arrayList8 = mq0Var.n;
                MediaController.AlbumEntry albumEntry = mq0Var.J;
                if (albumEntry == null && arrayList7.isEmpty()) {
                    if (i10 < arrayList8.size()) {
                        String str = (String) arrayList8.get(i10);
                        qq0 qq0Var = mq0Var.t0;
                        if (qq0Var == null) {
                            mq0Var.P.getSearchField().setText(str);
                            mq0Var.P.getSearchField().setSelection(str.length());
                            mq0Var.b0(mq0Var.P.getSearchField());
                            return;
                        } else {
                            switch (qq0Var.a) {
                                case 0:
                                    rq0.h0(qq0Var.b, str);
                                    return;
                                default:
                                    rq0.h0(qq0Var.b, str);
                                    return;
                            }
                        }
                    }
                    if (i10 == arrayList8.size() + 1) {
                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(mq0Var.getParentActivity());
                        alertDialog$Builder5.a.R = LocaleController.getString(R.string.ClearSearchAlertTitle);
                        alertDialog$Builder5.a.T = LocaleController.getString(R.string.ClearSearchAlert);
                        alertDialog$Builder5.k(LocaleController.getString(R.string.ClearButton), new zp0(mq0Var, i14));
                        alertDialog$Builder5.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder5.a;
                        mq0Var.showDialog(c2Var3);
                        TextView textView3 = (TextView) c2Var3.d(-1);
                        if (textView3 != null) {
                            org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.q7, null);
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
                org.telegram.ui.ActionBar.u0 u0Var = mq0Var.P;
                if (u0Var != null) {
                    AndroidUtilities.hideKeyboard(u0Var.getSearchField());
                }
                if (mq0Var.Y) {
                    mq0Var.a0(view, arrayList7.get(i10));
                    return;
                }
                int i25 = mq0Var.T;
                if (i25 != 1 && i25 != 3) {
                    if (i25 != 2) {
                        r10 = 10;
                        if (i25 != 10) {
                            i15 = mq0Var.U == null ? 4 : 0;
                        }
                    }
                    i15 = r10;
                }
                PhotoViewer.u1().M2(null, mq0Var, null);
                PhotoViewer u12 = PhotoViewer.u1();
                int i26 = mq0Var.H;
                boolean z18 = mq0Var.I;
                u12.h = i26;
                u12.n = z18;
                PhotoViewer.u1().i2(arrayList7, i10, i15, mq0Var.l0, mq0Var.x0, mq0Var.U);
                return;
            case 23:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                ArrayList arrayList9 = photoViewer.g7;
                if (!arrayList9.isEmpty() && (i12 = photoViewer.P4) >= 0 && i12 < arrayList9.size()) {
                    Object obj = arrayList9.get(photoViewer.P4);
                    if (obj instanceof MediaController.MediaEditState) {
                        ((MediaController.MediaEditState) obj).editedInfo = photoViewer.o1();
                    }
                }
                photoViewer.k5 = true;
                int indexOf = arrayList9.indexOf(view.getTag());
                if (indexOf >= 0) {
                    photoViewer.P4 = -1;
                    photoViewer.D2(indexOf);
                }
                photoViewer.k5 = false;
                return;
            case 24:
                a(i10, view);
                return;
            case 25:
                PremiumPreviewFragment.U((PremiumPreviewFragment) this.b, view, i10);
                return;
            case 26:
                b(i10, view);
                return;
            case 27:
                PrivacyControlActivity.X((PrivacyControlActivity) this.b, view, i10);
                return;
            case 28:
                c(i10, view);
                return;
            default:
                ProfileActivity.W((ProfileActivity) this.b, i10);
                return;
        }
    }
}
