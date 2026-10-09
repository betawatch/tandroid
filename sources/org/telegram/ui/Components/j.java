package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements em0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:69|(3:71|(1:73)|74)|75|(2:77|(5:79|(1:81)(1:124)|(1:83)|(1:123)(6:87|88|89|(1:91)(1:120)|92|93)|(5:100|101|102|103|(1:105))(3:110|(3:112|(2:115|113)|116)(1:118)|117))(6:125|126|101|102|103|(0)(0)))|127|126|101|102|103|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0305, code lost:
    
        if (r7 != 0) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0260  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r13v18, types: [android.view.View, org.telegram.ui.Components.oz0] */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.u8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v54 */
    @Override // org.telegram.ui.Components.em0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i10, View view) {
        int i11;
        c9 c9Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i12;
        int i13;
        boolean z11;
        String str;
        rk0 rk0Var;
        int i14;
        mz0 mz0Var;
        int intValue;
        int intValue2;
        int i15;
        ?? r92;
        ai.f0 f0Var;
        CharSequence replaceEmoji;
        b6[] b6VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i16 = this.a;
        int i17 = -1;
        int i18 = 2;
        int i19 = 3;
        Paint.FontMetricsInt fontMetricsInt = null;
        ?? r11 = 0;
        boolean z12 = true;
        Object obj = this.b;
        switch (i16) {
            case 0:
                ((e0) obj).O0.G(i10 - 1);
                break;
            case 1:
                ((q) obj).f0.G(i10 - 1);
                break;
            case 2:
                d9 d9Var = (d9) obj;
                org.telegram.ui.v7 v7Var = d9Var.Y2;
                g9 g9Var = d9Var.a3;
                if (view instanceof e9) {
                    e9 e9Var = (e9) view;
                    if (!e9Var.d) {
                        c9 c9Var2 = e9Var.a;
                        d9Var.X2 = c9Var2.a;
                        g9Var.a.b(c9Var2, false);
                        if (v7Var != null) {
                            v7Var.l();
                        }
                        g9Var.n0();
                        break;
                    }
                }
                if (d9Var.X2 != 1 && (c9Var = d9Var.Z2) != null) {
                    d9Var.X2 = 1;
                    g9Var.a.b(c9Var, true);
                    if (v7Var != null) {
                        v7Var.l();
                    }
                    g9Var.n0();
                    break;
                } else if (g9Var.S == null) {
                    if (!g9Var.a.v) {
                        g9Var.g0(true, true, true);
                    }
                    c9 c9Var3 = g9Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(g9Var.getParentActivity(), g9Var.getClassGuid());
                    u8 u8Var = new u8(g9Var, g9Var.getParentActivity());
                    g9Var.S = u8Var;
                    u8Var.fixNavigationBar();
                    g9Var.S.pauseAllHeavyOperations = false;
                    g9Var.h = true;
                    g9Var.e.setBackground(new BitmapDrawable(g9Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(g9Var.fragmentView, 12.0f, 10)));
                    g9Var.h = false;
                    g9Var.e.setVisibility(0);
                    g9Var.e.setAlpha(0.0f);
                    g9Var.f = true;
                    g9Var.fragmentView.invalidate();
                    g9Var.e.animate().setListener(new v8(g9Var, r11)).alpha(1.0f).setDuration(200L).start();
                    g9Var.Y = new c9();
                    w8 w8Var = new w8(g9Var.getParentActivity(), r11, new s8(g9Var, i18), r11);
                    c9 c9Var4 = g9Var.a.h;
                    if (c9Var4 != null) {
                        c9 c9Var5 = g9Var.Y;
                        int i20 = c9Var4.f;
                        c9Var5.f = i20;
                        i11 = 3;
                        w8Var.e(i20, 3);
                        c9 c9Var6 = g9Var.Y;
                        int i21 = g9Var.a.h.e;
                        c9Var6.e = i21;
                        w8Var.e(i21, 2);
                        c9 c9Var7 = g9Var.Y;
                        int i22 = g9Var.a.h.d;
                        c9Var7.d = i22;
                        w8Var.e(i22, 1);
                        c9 c9Var8 = g9Var.Y;
                        int i23 = g9Var.a.h.c;
                        c9Var8.c = i23;
                        w8Var.e(i23, 0);
                    } else {
                        i11 = 3;
                    }
                    c9 c9Var9 = g9Var.Y;
                    if (c9Var9.f != 0) {
                        i18 = 4;
                    } else if (c9Var9.e != 0) {
                        i18 = i11;
                    } else if (c9Var9.d == 0) {
                        i18 = 1;
                    }
                    w8Var.f(-1, 4, i18, false);
                    g9Var.a.b(g9Var.Y, true);
                    g9Var.n0();
                    ?? linearLayout = new LinearLayout(g9Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(w8Var);
                    FrameLayout frameLayout = new FrameLayout(g9Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.i6.Oh));
                    TextView textView = new TextView(g9Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
                    frameLayout.addView(textView, w7.x5.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, w7.x5.a(48.0f, 16.0f, -8.0f, 16.0f, 16.0f, -1, 0));
                    frameLayout.setOnClickListener(new org.telegram.ui.sf(19, g9Var, zArr));
                    g9Var.S.setCustomView(linearLayout);
                    u8 u8Var2 = g9Var.S;
                    u8Var2.smoothKeyboardAnimationEnabled = true;
                    u8Var2.setDimBehind(false);
                    g9Var.S.show();
                    g9Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                cq.q((cq) obj, view, i10);
                break;
            case 4:
                wr wrVar = (wr) obj;
                qm0 qm0Var = wrVar.d;
                if (i10 > 3) {
                    wrVar.d0 = (TLRPC.Peer) wrVar.Y.get(i10 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i24 = 0;
                    while (i24 < qm0Var.getChildCount()) {
                        View childAt = qm0Var.getChildAt(i24);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.g4)) {
                            ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                        }
                        i24++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                a00 a00Var = ((jy) obj).F;
                int i25 = a00Var.c1;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.n2 n2Var = a00Var.Y1;
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i25).getFeaturedEmojiSets();
                    while (r11 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = featuredEmojiSets.get(r11);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet2 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet2.id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i17 = r11;
                            }
                        }
                        r11++;
                    }
                    MediaDataController.getInstance(i25).markFeaturedStickersAsRead(true, true);
                    iw iwVar = new iw(n2Var, a00Var.getContext(), n2Var == null ? a00Var.Z1 : n2Var.getResourceProvider(), arrayList2);
                    if (i17 >= 0) {
                        iwVar.O = i17;
                    }
                    if (n2Var != null) {
                        n2Var.showDialog(iwVar);
                        break;
                    } else {
                        iwVar.show();
                        break;
                    }
                }
                break;
            case 6:
                a00 a00Var2 = ((qz) obj).v;
                a00Var2.t1.o(new l61(a00Var2.getContext(), new ux(a00Var2), a00Var2.x1, a00Var2.y1, a00Var2.z1, (TLRPC.StickerSetCovered) view.getTag(), a00Var2.Z1));
                break;
            case 7:
                d10 d10Var = (d10) obj;
                org.telegram.ui.gu guVar = d10Var.r;
                ArrayList arrayList3 = d10Var.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i10 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i10) : null;
                boolean z13 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.ty tyVar = ((org.telegram.ui.tw) guVar.b).a;
                ArrayList arrayList4 = tyVar.I2;
                ArrayList J = d10.J(tyVar, dialogFilter2, arrayList4, true, false);
                if (!z13) {
                    int size = J.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > tyVar.getMessagesController().dialogFiltersChatsLimitDefault && !tyVar.getUserConfig().isPremium()) || size > tyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = tyVar.fragmentView.getContext();
                        i12 = ((org.telegram.ui.ActionBar.n2) tyVar).currentAccount;
                        tyVar.showDialog(new rg.j0(4, i12, context, tyVar, null));
                        d10Var.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    tyVar.presentFragment(new org.telegram.ui.f10(null, J));
                } else if (z13) {
                    for (int i26 = 0; i26 < arrayList4.size(); i26++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i26));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i26));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.f10.t0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, tyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView V3 = tyVar.V3();
                    if (V3 != null) {
                        V3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    tyVar = tyVar;
                } else {
                    if (J.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i27 = 0; i27 < J.size(); i27++) {
                            dialogFilter2.neverShow.remove(J.get(i27));
                        }
                        dialogFilter2.alwaysShow.addAll(J);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.f10.t0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, tyVar, null);
                    }
                    tyVar = tyVar;
                    long longValue2 = J.size() == 1 ? ((Long) J.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView V32 = tyVar.V3();
                    if (V32 != null) {
                        V32.k(longValue2, 20, Integer.valueOf(J.size()), dialogFilter4, null, null);
                    }
                }
                tyVar.Y3(true);
                d10Var.dismiss();
                break;
            case 8:
                s10 s10Var = (s10) obj;
                org.telegram.ui.ActionBar.n2 n2Var2 = s10Var.n;
                ArrayList arrayList5 = s10Var.g0;
                ArrayList arrayList6 = s10Var.i0;
                if ((view instanceof org.telegram.ui.Cells.g4) && (i13 = (i10 - 1) - s10Var.r0) >= 0 && i13 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i13));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else if (s10Var.h0.contains(Long.valueOf(peerDialogId))) {
                        int i28 = -s10Var.C0;
                        s10Var.C0 = i28;
                        AndroidUtilities.shakeViewSpring(view, i28);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ArrayList arrayList7 = new ArrayList();
                        if (peerDialogId >= 0) {
                            arrayList7.add(n2Var2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat chat = n2Var2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                            String string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                            arrayList7.add(chat);
                            str = string;
                        }
                        if (s10Var.D0 != peerDialogId || System.currentTimeMillis() - s10Var.E0 > 1500) {
                            s10Var.D0 = peerDialogId;
                            s10Var.E0 = System.currentTimeMillis();
                            tc g10 = new ad(s10Var.k0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
                    }
                    s10Var.V(z11);
                    s10Var.W();
                    s10Var.R(false);
                    break;
                }
                break;
            case 9:
                i40 i40Var = (i40) obj;
                if (i10 == i40Var.i0) {
                    i40Var.g0.a.k1(true);
                    i40Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!i40Var.f0.contains(Long.valueOf(b5Var.getUserId()))) {
                        i40Var.g0.a.n1(b5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                uk0 uk0Var = (uk0) obj;
                ArrayList arrayList8 = uk0Var.n;
                int j3 = uk0Var.f.j(i10);
                if (j3 == 0) {
                    tk0 tk0Var = uk0Var.E;
                    if (tk0Var != null) {
                        tk0Var.a(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i10)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i10));
                        break;
                    }
                } else if (j3 == 1 && (rk0Var = uk0Var.G) != null) {
                    rk0Var.e(uk0Var.I);
                    break;
                }
                break;
            case 11:
                kl0 kl0Var = (kl0) obj;
                jl0 jl0Var = kl0Var.g0;
                if (jl0Var != null && (view instanceof il0)) {
                    jl0Var.m(kl0Var, ((il0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                mr0 mr0Var = ((ir0) obj).K;
                i14 = ((org.telegram.ui.ActionBar.f3) mr0Var).currentAccount;
                TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i14).hints.get(i10);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j10 = peer.user_id;
                if (j10 != 0) {
                    r4 = j10;
                } else {
                    long j11 = peer.channel_id;
                    if (j11 == 0) {
                        j11 = peer.chat_id;
                        break;
                    }
                    r4 = -j11;
                }
                if (n4Var.E) {
                    mr0Var.Y0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    mr0Var.V0(null, tL_dialog);
                    boolean z14 = mr0Var.U.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z14, true);
                        break;
                    }
                }
                break;
            case 13:
                fw0 fw0Var = (fw0) obj;
                int i29 = i10 - 1;
                if (i29 >= 0 && i29 < LocationController.getLocationsCount()) {
                    fw0Var.n.b(fw0.r(i29));
                    fw0Var.dismiss();
                    break;
                }
                break;
            case 14:
                hx0.Q((hx0) obj, i10);
                break;
            case 15:
                yx0 yx0Var = (yx0) obj;
                if (i10 < 1) {
                    yx0Var.getClass();
                    break;
                } else {
                    ux0[] ux0VarArr = yx0Var.W2;
                    if (ux0VarArr != null) {
                        ux0 ux0Var = ux0VarArr[i10 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (yx0Var.getMeasuredWidth() - view.getRight() < dp) {
                            yx0Var.v0(dp - (yx0Var.getMeasuredWidth() - view.getRight()), 0, hs.h);
                        } else if (view.getLeft() < dp) {
                            yx0Var.v0(-(dp - view.getLeft()), 0, hs.h);
                        }
                        Utilities.Callback callback = yx0Var.l3;
                        if (callback != null) {
                            callback.run(ux0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                xy0.o((xy0) obj, view, i10);
                break;
            case 17:
                ?? r13 = (oz0) obj;
                String str2 = ((nz0) view).a;
                if (r13.s && (mz0Var = r13.c) != null && (mz0Var.getFieldText() instanceof Spanned)) {
                    if (r13.T != null) {
                        intValue = ((Spanned) r13.c.getFieldText()).getSpanStart(r13.T);
                        intValue2 = ((Spanned) r13.c.getFieldText()).getSpanEnd(r13.T);
                    } else {
                        Integer num = r13.V;
                        if (num != null && r13.W != null) {
                            intValue = num.intValue();
                            intValue2 = r13.W.intValue();
                            r13.W = null;
                            r13.V = null;
                        }
                    }
                    Editable editText = r13.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (r13.T != null) {
                            if (r13.c.getFieldText() instanceof Spannable) {
                                ((Spannable) r13.c.getFieldText()).removeSpan(r13.T);
                            }
                            r13.T = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i30 = intValue2 - length;
                        while (i30 >= 0) {
                            int i31 = i30 + length;
                            if (obj2.substring(i30, i31).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = r13.c.getEditField() != null ? r13.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                                if (fontMetricsInt2 == null) {
                                    Paint paint = new Paint();
                                    paint.setTextSize(AndroidUtilities.dp(18.0f));
                                    fontMetricsInt2 = paint.getFontMetricsInt();
                                }
                                if (str2 == null || !str2.startsWith("animated_")) {
                                    replaceEmoji = Emoji.replaceEmoji(str2, fontMetricsInt2, z12);
                                } else {
                                    try {
                                        long parseLong = Long.parseLong(str2.substring(9));
                                        TLRPC.Document f7 = s5.f(r13.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                                        spannableString.setSpan(f7 == null ? new b6(parseLong, fontMetricsInt2) : new b6(f7, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji == null || ((b6VarArr = (b6[]) editText.getSpans(i30, i31, b6.class)) != null && b6VarArr.length > 0)) {
                                    i15 = 3;
                                    r92 = 1;
                                    r13.performHapticFeedback(i15, r92);
                                    Emoji.addRecentEmoji(str2);
                                    r13.s = false;
                                    r13.v = r92;
                                    r13.G = 0;
                                    f0Var = r13.d;
                                    if (f0Var != null) {
                                        f0Var.invalidate();
                                        break;
                                    }
                                } else {
                                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) editText.getSpans(i30, i31, Emoji.EmojiSpan.class);
                                    if (emojiSpanArr != null) {
                                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                            editText.removeSpan(emojiSpan);
                                        }
                                    }
                                    editText.replace(i30, i31, "");
                                    editText.insert(i30, replaceEmoji);
                                    i30 -= length;
                                    i19 = 3;
                                    fontMetricsInt = null;
                                    z12 = true;
                                }
                            } else {
                                i15 = i19;
                                r92 = z12;
                                r13.performHapticFeedback(i15, r92);
                                Emoji.addRecentEmoji(str2);
                                r13.s = false;
                                r13.v = r92;
                                r13.G = 0;
                                f0Var = r13.d;
                                if (f0Var != null) {
                                }
                            }
                        }
                        i15 = i19;
                        r92 = z12;
                        r13.performHapticFeedback(i15, r92);
                        Emoji.addRecentEmoji(str2);
                        r13.s = false;
                        r13.v = r92;
                        r13.G = 0;
                        f0Var = r13.d;
                        if (f0Var != null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i10 != 0) {
                    s4.i0 adapter = editorAlert.c.getAdapter();
                    p21 p21Var = editorAlert.n;
                    if (adapter == p21Var) {
                        int i32 = i10 - 1;
                        ArrayList arrayList9 = p21Var.d;
                        themeEditorView.c = (i32 < 0 || i32 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i32);
                    } else {
                        q21 q21Var = editorAlert.r;
                        int i33 = i10 - 1;
                        if (i33 < 0) {
                            q21Var.getClass();
                        } else if (i33 < q21Var.e.size()) {
                            arrayList = (ArrayList) q21Var.e.get(i33);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i10;
                    for (int i34 = 0; i34 < themeEditorView.c.size(); i34++) {
                        org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) themeEditorView.c.get(i34);
                        int i35 = k6Var.f;
                        if (i35 == org.telegram.ui.ActionBar.i6.Nd) {
                            final v91 v91Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) v91Var.b, (org.telegram.ui.ActionBar.e6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            f3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.s91
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i36) {
                                    v91 v91Var2 = v91.this;
                                    u91 u91Var = v91Var2.d;
                                    Activity activity = v91Var2.b;
                                    try {
                                        if (i36 != 0) {
                                            if (i36 == 1) {
                                                v91Var2.b();
                                                return;
                                            } else if (i36 == 2) {
                                                u91Var.a();
                                                return;
                                            } else {
                                                if (i36 == 3) {
                                                    u91Var.b(null, null, false);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        try {
                                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                                            File generatePicturePath = AndroidUtilities.generatePicturePath();
                                            if (generatePicturePath != null) {
                                                if (Build.VERSION.SDK_INT >= 24) {
                                                    intent.putExtra("output", FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                                                    intent.addFlags(2);
                                                    intent.addFlags(1);
                                                } else {
                                                    intent.putExtra("output", Uri.fromFile(generatePicturePath));
                                                }
                                                v91Var2.a = generatePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e7) {
                                            FileLog.e(e7);
                                        }
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                            };
                            f3Var.items = charSequenceArr;
                            f3Var.itemIcons = null;
                            f3Var.onClickListener = onClickListener;
                            f3Var.show();
                            break;
                        } else {
                            int x02 = org.telegram.ui.ActionBar.i6.x0(k6Var.j, i35, false);
                            k6Var.i = x02;
                            if (i34 == 0) {
                                editorAlert.b.c(x02);
                            }
                        }
                    }
                    editorAlert.M(true);
                    break;
                }
                break;
            default:
                l61 l61Var = (l61) obj;
                s4.i0 adapter2 = l61Var.n.getAdapter();
                gg.f2 f2Var = l61Var.v;
                if (adapter2 == f2Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) f2Var.K.get(i10);
                } else {
                    k61 k61Var = l61Var.s;
                    stickerSetCovered = i10 < k61Var.w ? (TLRPC.StickerSetCovered) k61Var.f.get(i10) : null;
                }
                if (stickerSetCovered != null) {
                    l61Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
