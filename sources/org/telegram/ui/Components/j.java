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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements mk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:69|(3:71|(1:73)|74)|75|(7:77|(1:126)(5:79|(1:81)(1:125)|(1:83)|(1:124)(6:87|88|89|(1:91)(1:120)|92|93)|(3:110|(3:112|(2:115|113)|116)(1:118)|117))|100|101|102|103|(1:105))|127|100|101|102|103|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0307, code lost:
    
        if (r7 != 0) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0262  */
    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.ui.ActionBar.f3, org.telegram.ui.Components.k8] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    @Override // org.telegram.ui.Components.mk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i9, View view) {
        s8 s8Var;
        boolean z10;
        TLRPC.StickerSet stickerSet;
        MessagesController.DialogFilter dialogFilter;
        int i10;
        int i11;
        boolean z11;
        String str;
        bj0 bj0Var;
        int i12;
        sx0 sx0Var;
        int intValue;
        int intValue2;
        fh.d2 d2Var;
        CharSequence replaceEmoji;
        t5[] t5VarArr;
        ArrayList arrayList;
        TLRPC.StickerSetCovered stickerSetCovered;
        int i13 = this.a;
        int i14 = -1;
        int i15 = 2;
        Paint.FontMetricsInt fontMetricsInt = null;
        ?? r11 = 0;
        Object obj = this.b;
        switch (i13) {
            case 0:
                ((e0) obj).K0.G(i9 - 1);
                break;
            case 1:
                ((q) obj).b0.G(i9 - 1);
                break;
            case 2:
                t8 t8Var = (t8) obj;
                org.telegram.ui.v7 v7Var = t8Var.W2;
                w8 w8Var = t8Var.Y2;
                if (view instanceof u8) {
                    u8 u8Var = (u8) view;
                    if (!u8Var.d) {
                        s8 s8Var2 = u8Var.a;
                        t8Var.V2 = s8Var2.a;
                        w8Var.a.b(s8Var2, false);
                        if (v7Var != null) {
                            v7Var.l();
                        }
                        w8Var.m0();
                        break;
                    }
                }
                if (t8Var.V2 != 1 && (s8Var = t8Var.X2) != null) {
                    t8Var.V2 = 1;
                    w8Var.a.b(s8Var, true);
                    if (v7Var != null) {
                        v7Var.l();
                    }
                    w8Var.m0();
                    break;
                } else if (w8Var.O == null) {
                    if (!w8Var.a.v) {
                        w8Var.f0(true, true, true);
                    }
                    s8 s8Var3 = w8Var.a.h;
                    boolean[] zArr = {false};
                    AndroidUtilities.requestAdjustNothing(w8Var.getParentActivity(), w8Var.getClassGuid());
                    k8 k8Var = new k8(w8Var, w8Var.getParentActivity());
                    w8Var.O = k8Var;
                    k8Var.fixNavigationBar();
                    w8Var.O.pauseAllHeavyOperations = false;
                    w8Var.h = true;
                    w8Var.e.setBackground(new BitmapDrawable(w8Var.getParentActivity().getResources(), AndroidUtilities.makeBlurBitmap(w8Var.fragmentView, 12.0f, 10)));
                    w8Var.h = false;
                    w8Var.e.setVisibility(0);
                    w8Var.e.setAlpha(0.0f);
                    w8Var.f = true;
                    w8Var.fragmentView.invalidate();
                    w8Var.e.animate().setListener(new l8(w8Var, r11)).alpha(1.0f).setDuration(200L).start();
                    w8Var.U = new s8();
                    m8 m8Var = new m8(w8Var.getParentActivity(), r11, new j8(w8Var, i15), r11);
                    s8 s8Var4 = w8Var.a.h;
                    if (s8Var4 != null) {
                        s8 s8Var5 = w8Var.U;
                        int i16 = s8Var4.f;
                        s8Var5.f = i16;
                        m8Var.e(i16, 3);
                        s8 s8Var6 = w8Var.U;
                        int i17 = w8Var.a.h.e;
                        s8Var6.e = i17;
                        m8Var.e(i17, 2);
                        s8 s8Var7 = w8Var.U;
                        int i18 = w8Var.a.h.d;
                        s8Var7.d = i18;
                        m8Var.e(i18, 1);
                        s8 s8Var8 = w8Var.U;
                        int i19 = w8Var.a.h.c;
                        s8Var8.c = i19;
                        m8Var.e(i19, 0);
                    }
                    s8 s8Var9 = w8Var.U;
                    if (s8Var9.f != 0) {
                        i15 = 4;
                    } else if (s8Var9.e != 0) {
                        i15 = 3;
                    } else if (s8Var9.d == 0) {
                        i15 = 1;
                    }
                    m8Var.f(-1, 4, i15, false);
                    w8Var.a.b(w8Var.U, true);
                    w8Var.m0();
                    ?? linearLayout = new LinearLayout(w8Var.getParentActivity());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(0, AndroidUtilities.dp(8.0f), 0, 0);
                    linearLayout.addView(m8Var);
                    FrameLayout frameLayout = new FrameLayout(w8Var.getParentActivity());
                    frameLayout.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{8.0f}, org.telegram.ui.ActionBar.f6.Oh));
                    TextView textView = new TextView(w8Var.getParentActivity());
                    textView.setTextSize(1, 14.0f);
                    textView.setText(LocaleController.getString(R.string.SetColor));
                    textView.setGravity(17);
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
                    frameLayout.addView(textView, g7.e6.e(-2, -2, 17));
                    linearLayout.addView(frameLayout, g7.e6.d(-1, 48.0f, 0, 16.0f, -8.0f, 16.0f, 16.0f));
                    frameLayout.setOnClickListener(new s2(6, w8Var, zArr));
                    w8Var.O.setCustomView(linearLayout);
                    k8 k8Var2 = w8Var.O;
                    k8Var2.smoothKeyboardAnimationEnabled = true;
                    k8Var2.setDimBehind(false);
                    w8Var.O.show();
                    w8Var.isLightStatusBar();
                    break;
                }
                break;
            case 3:
                cp.o((cp) obj, view, i9);
                break;
            case 4:
                wq wqVar = (wq) obj;
                wk0 wk0Var = wqVar.d;
                if (i9 > 3) {
                    wqVar.Z = (TLRPC.Peer) wqVar.U.get(i9 - 4);
                    if (view instanceof org.telegram.ui.Cells.g4) {
                        z10 = true;
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else {
                        z10 = true;
                    }
                    int i20 = 0;
                    while (i20 < wk0Var.getChildCount()) {
                        View childAt = wk0Var.getChildAt(i20);
                        if (childAt != view && (childAt instanceof org.telegram.ui.Cells.g4)) {
                            ((org.telegram.ui.Cells.g4) childAt).c(false, z10);
                        }
                        i20++;
                        z10 = true;
                    }
                    break;
                }
                break;
            case 5:
                wy wyVar = ((fx) obj).B;
                int i21 = wyVar.Y0;
                if (view.getTag() instanceof TLRPC.StickerSetCovered) {
                    TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) view.getTag();
                    ArrayList arrayList2 = new ArrayList();
                    org.telegram.ui.ActionBar.o2 o2Var = wyVar.U1;
                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i21).getFeaturedEmojiSets();
                    while (r11 < featuredEmojiSets.size()) {
                        TLRPC.StickerSetCovered stickerSetCovered3 = featuredEmojiSets.get(r11);
                        if (stickerSetCovered3 != null && stickerSetCovered3.set != null) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            TLRPC.StickerSet stickerSet2 = stickerSetCovered3.set;
                            tL_inputStickerSetID.id = stickerSet2.id;
                            tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                            arrayList2.add(tL_inputStickerSetID);
                            if (stickerSetCovered2 != null && (stickerSet = stickerSetCovered2.set) != null && stickerSet.id == stickerSetCovered3.set.id) {
                                i14 = r11;
                            }
                        }
                        r11++;
                    }
                    MediaDataController.getInstance(i21).markFeaturedStickersAsRead(true, true);
                    dv dvVar = new dv(o2Var, wyVar.getContext(), o2Var == null ? wyVar.V1 : o2Var.getResourceProvider(), arrayList2);
                    if (i14 >= 0) {
                        dvVar.K = i14;
                    }
                    if (o2Var != null) {
                        o2Var.showDialog(dvVar);
                        break;
                    } else {
                        dvVar.show();
                        break;
                    }
                }
                break;
            case 6:
                wy wyVar2 = ((ny) obj).v;
                wyVar2.p1.o(new h41(wyVar2.getContext(), new rw(wyVar2), wyVar2.t1, wyVar2.u1, wyVar2.v1, (TLRPC.StickerSetCovered) view.getTag(), wyVar2.V1));
                break;
            case 7:
                yz yzVar = (yz) obj;
                org.telegram.ui.wt wtVar = yzVar.r;
                ArrayList arrayList3 = yzVar.c.d.s;
                MessagesController.DialogFilter dialogFilter2 = i9 < arrayList3.size() ? (MessagesController.DialogFilter) arrayList3.get(i9) : null;
                boolean z12 = view instanceof org.telegram.ui.ActionBar.y2 ? ((org.telegram.ui.ActionBar.y2) view).e : false;
                org.telegram.ui.dy dyVar = ((org.telegram.ui.ew) wtVar.b).a;
                ArrayList arrayList4 = dyVar.E2;
                ArrayList H = yz.H(dyVar, dialogFilter2, arrayList4, true, false);
                if (!z12) {
                    int size = H.size() + (dialogFilter2 != null ? dialogFilter2.alwaysShow.size() : 0);
                    if ((size > dyVar.getMessagesController().dialogFiltersChatsLimitDefault && !dyVar.getUserConfig().isPremium()) || size > dyVar.getMessagesController().dialogFiltersChatsLimitPremium) {
                        Context context = dyVar.fragmentView.getContext();
                        i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                        dyVar.showDialog(new zf.j0(4, i10, context, dyVar, null));
                        yzVar.dismiss();
                        break;
                    }
                }
                if (dialogFilter2 == null) {
                    dyVar.presentFragment(new org.telegram.ui.n00(null, H));
                } else if (z12) {
                    for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                        dialogFilter2.neverShow.add((Long) arrayList4.get(i22));
                        dialogFilter2.alwaysShow.remove(arrayList4.get(i22));
                    }
                    MessagesController.DialogFilter dialogFilter3 = dialogFilter2;
                    org.telegram.ui.n00.s0(dialogFilter3, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, dyVar, null);
                    long longValue = arrayList4.size() == 1 ? ((Long) arrayList4.get(0)).longValue() : 0L;
                    UndoView Y3 = dyVar.Y3();
                    if (Y3 != null) {
                        Y3.k(longValue, 21, Integer.valueOf(arrayList4.size()), dialogFilter3, null, null);
                    }
                    dyVar = dyVar;
                } else {
                    if (H.isEmpty()) {
                        dialogFilter = dialogFilter2;
                    } else {
                        for (int i23 = 0; i23 < H.size(); i23++) {
                            dialogFilter2.neverShow.remove(H.get(i23));
                        }
                        dialogFilter2.alwaysShow.addAll(H);
                        dialogFilter = dialogFilter2;
                        org.telegram.ui.n00.s0(dialogFilter, dialogFilter2.flags, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, dialogFilter2.color, dialogFilter2.alwaysShow, dialogFilter2.neverShow, dialogFilter2.pinnedDialogs, false, false, true, true, false, dyVar, null);
                    }
                    dyVar = dyVar;
                    long longValue2 = H.size() == 1 ? ((Long) H.get(0)).longValue() : 0L;
                    MessagesController.DialogFilter dialogFilter4 = dialogFilter;
                    UndoView Y32 = dyVar.Y3();
                    if (Y32 != null) {
                        Y32.k(longValue2, 20, Integer.valueOf(H.size()), dialogFilter4, null, null);
                    }
                }
                dyVar.b4(true);
                yzVar.dismiss();
                break;
            case 8:
                n00 n00Var = (n00) obj;
                org.telegram.ui.ActionBar.o2 o2Var2 = n00Var.n;
                ArrayList arrayList5 = n00Var.c0;
                ArrayList arrayList6 = n00Var.e0;
                if ((view instanceof org.telegram.ui.Cells.g4) && (i11 = (i9 - 1) - n00Var.n0) >= 0 && i11 < arrayList5.size()) {
                    long peerDialogId = DialogObject.getPeerDialogId((TLRPC.Peer) arrayList5.get(i11));
                    if (!arrayList6.contains(Long.valueOf(peerDialogId))) {
                        z11 = true;
                        arrayList6.add(Long.valueOf(peerDialogId));
                        ((org.telegram.ui.Cells.g4) view).c(true, true);
                    } else if (n00Var.d0.contains(Long.valueOf(peerDialogId))) {
                        int i24 = -n00Var.y0;
                        n00Var.y0 = i24;
                        AndroidUtilities.shakeViewSpring(view, i24);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ArrayList arrayList7 = new ArrayList();
                        if (peerDialogId >= 0) {
                            arrayList7.add(o2Var2.getMessagesController().getUser(Long.valueOf(peerDialogId)));
                            str = "beep boop.";
                        } else {
                            TLRPC.Chat chat = o2Var2.getMessagesController().getChat(Long.valueOf(-peerDialogId));
                            String string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FolderLinkAlreadySubscribed) : LocaleController.getString(R.string.FolderLinkAlreadyJoined);
                            arrayList7.add(chat);
                            str = string;
                        }
                        if (n00Var.z0 != peerDialogId || System.currentTimeMillis() - n00Var.A0 > 1500) {
                            n00Var.z0 = peerDialogId;
                            n00Var.A0 = System.currentTimeMillis();
                            gc g10 = new oc(n00Var.g0, null).g(str, arrayList7);
                            g10.j = 1500;
                            g10.j();
                            break;
                        }
                    } else {
                        arrayList6.remove(Long.valueOf(peerDialogId));
                        z11 = true;
                        ((org.telegram.ui.Cells.g4) view).c(false, true);
                    }
                    n00Var.T(z11);
                    n00Var.U();
                    n00Var.P(false);
                    break;
                }
                break;
            case 9:
                b30 b30Var = (b30) obj;
                if (i9 == b30Var.e0) {
                    b30Var.c0.a.j1(true);
                    b30Var.dismiss();
                    break;
                } else if (view instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                    if (!b30Var.b0.contains(Long.valueOf(b5Var.getUserId()))) {
                        b30Var.c0.a.m1(b5Var.getUserId(), true);
                        break;
                    }
                }
                break;
            case 10:
                ej0 ej0Var = (ej0) obj;
                ArrayList arrayList8 = ej0Var.n;
                int j10 = ej0Var.f.j(i9);
                if (j10 == 0) {
                    dj0 dj0Var = ej0Var.A;
                    if (dj0Var != null) {
                        dj0Var.e(MessageObject.getPeerId(((TLRPC.MessagePeerReaction) arrayList8.get(i9)).peer_id), (TLRPC.MessagePeerReaction) arrayList8.get(i9));
                        break;
                    }
                } else if (j10 == 1 && (bj0Var = ej0Var.C) != null) {
                    bj0Var.g(ej0Var.E);
                    break;
                }
                break;
            case 11:
                uj0 uj0Var = (uj0) obj;
                tj0 tj0Var = uj0Var.c0;
                if (tj0Var != null && (view instanceof sj0)) {
                    tj0Var.d(uj0Var, ((sj0) view).e, false, false);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                rp0 rp0Var = ((np0) obj).G;
                i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i12).hints.get(i9);
                TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                TLRPC.Peer peer = tL_topPeer.peer;
                long j11 = peer.user_id;
                if (j11 != 0) {
                    r4 = j11;
                } else {
                    long j12 = peer.channel_id;
                    if (j12 == 0) {
                        j12 = peer.chat_id;
                        break;
                    }
                    r4 = -j12;
                }
                if (n4Var.A) {
                    rp0Var.X0(r4, n4Var);
                    break;
                } else {
                    tL_dialog.id = r4;
                    rp0Var.U0(null, tL_dialog);
                    boolean z13 = rp0Var.Q.h(r4) >= 0;
                    if (n4Var.w) {
                        n4Var.v.a(z13, true);
                        break;
                    }
                }
                break;
            case 13:
                iu0 iu0Var = (iu0) obj;
                int i25 = i9 - 1;
                if (i25 >= 0 && i25 < LocationController.getLocationsCount()) {
                    iu0Var.n.d(iu0.p(i25));
                    iu0Var.dismiss();
                    break;
                }
                break;
            case 14:
                mv0.O((mv0) obj, i9);
                break;
            case 15:
                ew0 ew0Var = (ew0) obj;
                if (i9 < 1) {
                    ew0Var.getClass();
                    break;
                } else {
                    aw0[] aw0VarArr = ew0Var.U2;
                    if (aw0VarArr != null) {
                        aw0 aw0Var = aw0VarArr[i9 - 1];
                        int dp = AndroidUtilities.dp(64.0f);
                        if (ew0Var.getMeasuredWidth() - view.getRight() < dp) {
                            ew0Var.v0(dp - (ew0Var.getMeasuredWidth() - view.getRight()), 0, gr.h);
                        } else if (view.getLeft() < dp) {
                            ew0Var.v0(-(dp - view.getLeft()), 0, gr.h);
                        }
                        Utilities.Callback callback = ew0Var.j3;
                        if (callback != null) {
                            callback.run(aw0Var);
                            break;
                        }
                    }
                }
                break;
            case 16:
                cx0.m((cx0) obj, view, i9);
                break;
            case 17:
                ux0 ux0Var = (ux0) obj;
                String str2 = ((tx0) view).a;
                if (ux0Var.s && (sx0Var = ux0Var.c) != null && (sx0Var.getFieldText() instanceof Spanned)) {
                    if (ux0Var.P != null) {
                        intValue = ((Spanned) ux0Var.c.getFieldText()).getSpanStart(ux0Var.P);
                        intValue2 = ((Spanned) ux0Var.c.getFieldText()).getSpanEnd(ux0Var.P);
                    } else {
                        Integer num = ux0Var.R;
                        if (num != null && ux0Var.S != null) {
                            intValue = num.intValue();
                            intValue2 = ux0Var.S.intValue();
                            ux0Var.S = null;
                            ux0Var.R = null;
                        }
                    }
                    Editable editText = ux0Var.c.getEditText();
                    if (editText != null && intValue >= 0 && intValue2 >= 0 && intValue <= editText.length() && intValue2 <= editText.length()) {
                        if (ux0Var.P != null) {
                            if (ux0Var.c.getFieldText() instanceof Spannable) {
                                ((Spannable) ux0Var.c.getFieldText()).removeSpan(ux0Var.P);
                            }
                            ux0Var.P = null;
                        }
                        String obj2 = editText.toString();
                        String substring = obj2.substring(intValue, intValue2);
                        int length = substring.length();
                        int i26 = intValue2 - length;
                        while (i26 >= 0) {
                            int i27 = i26 + length;
                            if (obj2.substring(i26, i27).equals(substring)) {
                                Paint.FontMetricsInt fontMetricsInt2 = ux0Var.c.getEditField() != null ? ux0Var.c.getEditField().getPaint().getFontMetricsInt() : fontMetricsInt;
                                if (fontMetricsInt2 == null) {
                                    Paint paint = new Paint();
                                    paint.setTextSize(AndroidUtilities.dp(18.0f));
                                    fontMetricsInt2 = paint.getFontMetricsInt();
                                }
                                if (str2 == null || !str2.startsWith("animated_")) {
                                    replaceEmoji = Emoji.replaceEmoji(str2, fontMetricsInt2, true);
                                } else {
                                    try {
                                        long parseLong = Long.parseLong(str2.substring(9));
                                        TLRPC.Document f10 = k5.f(ux0Var.a, parseLong);
                                        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                                        spannableString.setSpan(f10 == null ? new t5(parseLong, fontMetricsInt2) : new t5(f10, fontMetricsInt2), 0, spannableString.length(), 33);
                                        replaceEmoji = spannableString;
                                    } catch (Exception unused) {
                                        replaceEmoji = null;
                                    }
                                }
                                if (replaceEmoji != null && ((t5VarArr = (t5[]) editText.getSpans(i26, i27, t5.class)) == null || t5VarArr.length <= 0)) {
                                    Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) editText.getSpans(i26, i27, Emoji.EmojiSpan.class);
                                    if (emojiSpanArr != null) {
                                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                            editText.removeSpan(emojiSpan);
                                        }
                                    }
                                    editText.replace(i26, i27, "");
                                    editText.insert(i26, replaceEmoji);
                                    i26 -= length;
                                    fontMetricsInt = null;
                                }
                            }
                            ux0Var.performHapticFeedback(3, 1);
                            Emoji.addRecentEmoji(str2);
                            ux0Var.s = false;
                            ux0Var.v = true;
                            ux0Var.C = 0;
                            d2Var = ux0Var.d;
                            if (d2Var == null) {
                                d2Var.invalidate();
                                break;
                            }
                        }
                        ux0Var.performHapticFeedback(3, 1);
                        Emoji.addRecentEmoji(str2);
                        ux0Var.s = false;
                        ux0Var.v = true;
                        ux0Var.C = 0;
                        d2Var = ux0Var.d;
                        if (d2Var == null) {
                        }
                    }
                }
                break;
            case 18:
                ThemeEditorView.EditorAlert editorAlert = (ThemeEditorView.EditorAlert) obj;
                ThemeEditorView themeEditorView = ThemeEditorView.this;
                if (i9 != 0) {
                    f2.r0 adapter = editorAlert.c.getAdapter();
                    q01 q01Var = editorAlert.n;
                    if (adapter == q01Var) {
                        int i28 = i9 - 1;
                        ArrayList arrayList9 = q01Var.d;
                        themeEditorView.c = (i28 < 0 || i28 >= arrayList9.size()) ? null : (ArrayList) arrayList9.get(i28);
                    } else {
                        r01 r01Var = editorAlert.r;
                        int i29 = i9 - 1;
                        if (i29 < 0) {
                            r01Var.getClass();
                        } else if (i29 < r01Var.e.size()) {
                            arrayList = (ArrayList) r01Var.e.get(i29);
                            themeEditorView.c = arrayList;
                        }
                        arrayList = null;
                        themeEditorView.c = arrayList;
                    }
                    themeEditorView.d = i9;
                    for (int i30 = 0; i30 < themeEditorView.c.size(); i30++) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) themeEditorView.c.get(i30);
                        int i31 = h6Var.f;
                        if (i31 == org.telegram.ui.ActionBar.f6.Nd) {
                            final u71 u71Var = themeEditorView.k;
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(u71Var.b, null, false, false);
                            f3Var.fixNavigationBar();
                            f3Var.title = LocaleController.getString(R.string.ChoosePhoto);
                            f3Var.bigTitle = true;
                            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.ChooseTakePhoto), LocaleController.getString(R.string.SelectFromGallery), LocaleController.getString(R.string.SelectColor), LocaleController.getString(R.string.Default)};
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.Components.r71
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i32) {
                                    u71 u71Var2 = u71.this;
                                    t71 t71Var = u71Var2.d;
                                    Activity activity = u71Var2.b;
                                    try {
                                        if (i32 != 0) {
                                            if (i32 == 1) {
                                                u71Var2.b();
                                                return;
                                            } else if (i32 == 2) {
                                                t71Var.a();
                                                return;
                                            } else {
                                                if (i32 == 3) {
                                                    t71Var.b(null, null, false);
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
                                                u71Var2.a = generatePicturePath.getAbsolutePath();
                                            }
                                            activity.startActivityForResult(intent, 10);
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                }
                            };
                            f3Var.items = charSequenceArr;
                            f3Var.itemIcons = null;
                            f3Var.onClickListener = onClickListener;
                            f3Var.show();
                            break;
                        } else {
                            int w02 = org.telegram.ui.ActionBar.f6.w0(h6Var.j, i31, false);
                            h6Var.i = w02;
                            if (i30 == 0) {
                                editorAlert.b.c(w02);
                            }
                        }
                    }
                    editorAlert.K(true);
                    break;
                }
                break;
            default:
                h41 h41Var = (h41) obj;
                f2.r0 adapter2 = h41Var.n.getAdapter();
                of.y1 y1Var = h41Var.v;
                if (adapter2 == y1Var) {
                    stickerSetCovered = (TLRPC.StickerSetCovered) y1Var.G.get(i9);
                } else {
                    g41 g41Var = h41Var.s;
                    stickerSetCovered = i9 < g41Var.w ? (TLRPC.StickerSetCovered) g41Var.f.get(i9) : null;
                }
                if (stickerSetCovered != null) {
                    h41Var.b(stickerSetCovered.set, null);
                    break;
                }
                break;
        }
    }
}
